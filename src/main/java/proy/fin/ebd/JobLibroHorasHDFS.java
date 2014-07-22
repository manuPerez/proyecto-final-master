package proy.fin.ebd;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import java.sql.Connection;
import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.hbase.mapreduce.TableMapReduceUtil;
import org.apache.hadoop.hbase.mapreduce.TableMapper;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.SequenceFileOutputFormat;
import org.apache.mahout.common.HadoopUtil;

//Clustering: Horas del día en las que se leen determinados libros
public class JobLibroHorasHDFS{

    static class myMapper extends TableMapper<LongWritable, Text> {
        		
       		private Text HourEdition = new Text();
    		private LongWritable EditionHour = new LongWritable();
    		
            public void map(ImmutableBytesWritable row, Result value, Context context) throws IOException {
                  
                byte[] us = value.getColumnLatest(Bytes.toBytes("stats"), Bytes.toBytes("user_id")).getValue();
                byte[] ed = value.getColumnLatest(Bytes.toBytes("stats"), Bytes.toBytes("edition_id")).getValue();
                byte[] up = value.getColumnLatest(Bytes.toBytes("stats"), Bytes.toBytes("updated_at")).getValue();
                HourEdition.set(Bytes.toString(up).substring(11, 13)+Bytes.toString(ed));
                EditionHour.set(Long.parseLong(Bytes.toString(ed)+Bytes.toString(up).substring(11, 13)));
                try{
                	context.write(EditionHour, HourEdition);
                } catch (InterruptedException e) {
                	throw new IOException(e);
                }
            }
    }
    
    static class myReducer extends Reducer<LongWritable, Text, LongWritable, Text> {
		
   		private Text Edition = new Text();
		private LongWritable Hour = new LongWritable();
		
        public void reduce(LongWritable key, Iterable<Text> values, Context context) throws IOException {
            
        	HashMap<String, String> hs = new HashMap();
        	for(Text value : values){
        		if(!hs.containsKey(key.toString())){
        			hs.put(key.toString(), value.toString());
        		}
        	}
        	
        	Iterator<Entry<String, String>> iterador = hs.entrySet().iterator();
    		while (iterador.hasNext()) {
    			try{
    				Map.Entry e = (Map.Entry) iterador.next();    				
    				Hour.set(Long.parseLong(e.getValue().toString().substring(0, 2)));
    				Edition.set(e.getValue().toString().substring(2));
    				context.write(Hour, Edition);		
    			} catch (InterruptedException e) {
    				throw new IOException(e);
    			}
    		}
        }
	}

    public static void main(String[] args) throws Exception {
        //se enviaria el ¿usuario?, libro y hora por argumento y con ellos se haría 
    	//la consulta (phoenix?) a reader_raw_stats y el resultado es el que se guardaria en statsbyhour
    	
    	//se eliminaría y crearía la tabla statsbyhour cada vez que se ejecutara el job?
    	@SuppressWarnings("deprecation")
		HBaseConfiguration conf = new HBaseConfiguration();
        @SuppressWarnings("deprecation")
		Job job = new Job(conf, "Job Libro Horas");
        job.setJarByClass(JobLibroHoras.class);
        
        HadoopUtil.delete(conf, new Path("hdfs://localhost/user/cloudera/out"));
        
        Scan scan = new Scan();
        scan.setCaching(500);
        scan.setCacheBlocks(false);        
        
        scan.addColumn(Bytes.toBytes("stats"), Bytes.toBytes("user_id"));
        scan.addColumn(Bytes.toBytes("stats"), Bytes.toBytes("edition_id"));
        scan.addColumn(Bytes.toBytes("stats"), Bytes.toBytes("updated_at"));
        
        TableMapReduceUtil.initTableMapperJob("reader_raw_stats", scan, myMapper.class, null, null, job);
        //job.setNumReduceTasks(0);
        job.setReducerClass(myReducer.class);
        //job.setOutputFormatClass(SequenceFileOutputFormat.class);
        //job.setMapOutputKeyClass(Text.class);
        //job.setMapOutputValueClass(Text.class);
        FileOutputFormat.setOutputPath(job, new Path("hdfs://localhost/user/cloudera/out"));
        System.exit(job.waitForCompletion(true) ? 0 : 1);

        //opcion 2: phoenix
        //Connection con = DriverManager.getConnection("jdbc:phoenix:[zookeeper]");
        //PreparedStatement statement = con.prepareStatement("select edition_id, substr(updated_at,11,2) hour from reader_raw_stats");
        //ResultSet rset = null;
        //rset = statement.executeQuery();
        

        //while (rset.next()) {
        //    System.out.println(rset.getString("mycolumn"));
        //}

        //statement.close();
        //con.close();


    }
}

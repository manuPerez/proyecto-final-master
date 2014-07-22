package proy.fin.ebd;

import java.io.File;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.SequenceFile;
import org.apache.lucene.analysis.Analyzer;
import org.apache.mahout.clustering.Cluster;
import org.apache.mahout.clustering.canopy.CanopyDriver;
import org.apache.mahout.clustering.classify.WeightedVectorWritable;
import org.apache.mahout.clustering.kmeans.KMeansDriver;
import org.apache.mahout.common.HadoopUtil;
import org.apache.mahout.common.distance.EuclideanDistanceMeasure;
import org.apache.mahout.common.distance.TanimotoDistanceMeasure;
import org.apache.mahout.vectorizer.DictionaryVectorizer;
import org.apache.mahout.vectorizer.DocumentProcessor;
import org.apache.mahout.vectorizer.tfidf.TFIDFConverter;

public class KMeansClustering {
	
	public static void main(String args[]) throws Exception {
		int minSupport = 2;
		int minDf = 5;
		Long maxDFPercent = (long) 95;
		int maxNGramSize = 2;
		int minLLRValue = 50;
		int reduceTasks = 1;
		int chunkSize = 200;
		int norm = 2;
		boolean sequentialAccessOutput = true;
		String inputDir = "hdfs://localhost/user/cloudera/out/seq";
		
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(conf);
		String outputDir = "hdfs://localhost/user/cloudera/out/vectors";
		/*
		HadoopUtil.delete(conf, new Path(outputDir));	
		
		Path tokenizedPath = new Path(outputDir, DocumentProcessor.TOKENIZED_DOCUMENT_OUTPUT_FOLDER);
		System.out.println("myanalyzer");
		MyAnalyzer analyzer = new MyAnalyzer();
		
		System.out.println("tokenizeDocuments");
		
		DocumentProcessor.tokenizeDocuments(new Path(inputDir),	
			                                analyzer.getClass().asSubclass(Analyzer.class),	
			                                tokenizedPath, 
			                                conf);
		
		System.out.println("createTermFrequencyVectors");
		
		DictionaryVectorizer.createTermFrequencyVectors(tokenizedPath, 
			                                            new Path(outputDir), 
			                                            "tfidf-vectors",
			                                            conf, 
			                                            minSupport, 
			                                            maxNGramSize, 
			                                            minLLRValue, 
			                                            2, 
			                                            true, 
			                                            reduceTasks, 
			                                            chunkSize, 
			                                            sequentialAccessOutput, 
			                                            false);
		
		System.out.println("processTfIdf");
		
		TFIDFConverter.processTfIdf(new Path(outputDir, DictionaryVectorizer.DOCUMENT_VECTOR_OUTPUT_FOLDER),
		                            new Path(outputDir), 
		                            conf, 
		                            TFIDFConverter.calculateDF(new Path(outputDir, 
		                            		                   DictionaryVectorizer.DOCUMENT_VECTOR_OUTPUT_FOLDER),
		                                                       new Path(outputDir), 
		                                                       conf, 
		                                                       chunkSize),
		                            minDf,
		                            maxDFPercent, 
		                            norm, 
		                            true, 
		                            sequentialAccessOutput, 
		                            false,
		                            reduceTasks);
		*/
		Path vectorsFolder = new Path(outputDir, "tfidf-vectors");
		Path canopyCentroids = new Path(outputDir, "canopy-centroids");
		Path clusterOutput = new Path(outputDir , "clusters");
		
		System.out.println("CanopyDriver");
		
		CanopyDriver.run(vectorsFolder, 
			             canopyCentroids, 
			             new EuclideanDistanceMeasure(), 
			             250, 
			             120, 
			             false, 
			             0,
			             false);
		
		System.out.println("KMeansDriver");
		
		KMeansDriver.run(conf, 
			             vectorsFolder, 
			             new Path(canopyCentroids, "clusters-0-final"), 
			             clusterOutput, 
			             new EuclideanDistanceMeasure(), 
			             0.01,
		                 20, 
		                 true, 
		                 0,
		                 false);
		
		SequenceFile.Reader reader = new SequenceFile.Reader(fs, 
			                                                 new Path(clusterOutput	+ "/" + Cluster.CLUSTERED_POINTS_DIR + "/part-m-00000"), 
			                                                 conf);

		IntWritable key = new IntWritable();
		WeightedVectorWritable value = new WeightedVectorWritable();
		System.out.println("cluster points: \t");
		while (reader.next(key, value)) {
			System.out.println(value.toString() + " pertenece al cluster " + key.toString());
		}
		reader.close();
	}
}

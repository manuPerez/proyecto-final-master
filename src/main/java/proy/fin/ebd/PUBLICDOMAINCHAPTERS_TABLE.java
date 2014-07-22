// ORM class for table 'PUBLICDOMAINCHAPTERS_TABLE'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jul 10 14:57:34 PDT 2014
// For connector: org.apache.sqoop.manager.MySQLManager
package proy.fin.ebd;

import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PUBLICDOMAINCHAPTERS_TABLE extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public PUBLICDOMAINCHAPTERS_TABLE with_id(Integer id) {
    this.id = id;
    return this;
  }
  private Integer edition_id;
  public Integer get_edition_id() {
    return edition_id;
  }
  public void set_edition_id(Integer edition_id) {
    this.edition_id = edition_id;
  }
  public PUBLICDOMAINCHAPTERS_TABLE with_edition_id(Integer edition_id) {
    this.edition_id = edition_id;
    return this;
  }
  private String code;
  public String get_code() {
    return code;
  }
  public void set_code(String code) {
    this.code = code;
  }
  public PUBLICDOMAINCHAPTERS_TABLE with_code(String code) {
    this.code = code;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public PUBLICDOMAINCHAPTERS_TABLE with_title(String title) {
    this.title = title;
    return this;
  }
  private String content;
  public String get_content() {
    return content;
  }
  public void set_content(String content) {
    this.content = content;
  }
  public PUBLICDOMAINCHAPTERS_TABLE with_content(String content) {
    this.content = content;
    return this;
  }
  private Integer parent_id;
  public Integer get_parent_id() {
    return parent_id;
  }
  public void set_parent_id(Integer parent_id) {
    this.parent_id = parent_id;
  }
  public PUBLICDOMAINCHAPTERS_TABLE with_parent_id(Integer parent_id) {
    this.parent_id = parent_id;
    return this;
  }
  private Integer play_order;
  public Integer get_play_order() {
    return play_order;
  }
  public void set_play_order(Integer play_order) {
    this.play_order = play_order;
  }
  public PUBLICDOMAINCHAPTERS_TABLE with_play_order(Integer play_order) {
    this.play_order = play_order;
    return this;
  }
  private java.sql.Timestamp created_at;
  public java.sql.Timestamp get_created_at() {
    return created_at;
  }
  public void set_created_at(java.sql.Timestamp created_at) {
    this.created_at = created_at;
  }
  public PUBLICDOMAINCHAPTERS_TABLE with_created_at(java.sql.Timestamp created_at) {
    this.created_at = created_at;
    return this;
  }
  private java.sql.Timestamp updated_at;
  public java.sql.Timestamp get_updated_at() {
    return updated_at;
  }
  public void set_updated_at(java.sql.Timestamp updated_at) {
    this.updated_at = updated_at;
  }
  public PUBLICDOMAINCHAPTERS_TABLE with_updated_at(java.sql.Timestamp updated_at) {
    this.updated_at = updated_at;
    return this;
  }
  private Integer previous_id;
  public Integer get_previous_id() {
    return previous_id;
  }
  public void set_previous_id(Integer previous_id) {
    this.previous_id = previous_id;
  }
  public PUBLICDOMAINCHAPTERS_TABLE with_previous_id(Integer previous_id) {
    this.previous_id = previous_id;
    return this;
  }
  private Integer next_id;
  public Integer get_next_id() {
    return next_id;
  }
  public void set_next_id(Integer next_id) {
    this.next_id = next_id;
  }
  public PUBLICDOMAINCHAPTERS_TABLE with_next_id(Integer next_id) {
    this.next_id = next_id;
    return this;
  }
  private Integer number_words;
  public Integer get_number_words() {
    return number_words;
  }
  public void set_number_words(Integer number_words) {
    this.number_words = number_words;
  }
  public PUBLICDOMAINCHAPTERS_TABLE with_number_words(Integer number_words) {
    this.number_words = number_words;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof PUBLICDOMAINCHAPTERS_TABLE)) {
      return false;
    }
    PUBLICDOMAINCHAPTERS_TABLE that = (PUBLICDOMAINCHAPTERS_TABLE) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.edition_id == null ? that.edition_id == null : this.edition_id.equals(that.edition_id));
    equal = equal && (this.code == null ? that.code == null : this.code.equals(that.code));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.content == null ? that.content == null : this.content.equals(that.content));
    equal = equal && (this.parent_id == null ? that.parent_id == null : this.parent_id.equals(that.parent_id));
    equal = equal && (this.play_order == null ? that.play_order == null : this.play_order.equals(that.play_order));
    equal = equal && (this.created_at == null ? that.created_at == null : this.created_at.equals(that.created_at));
    equal = equal && (this.updated_at == null ? that.updated_at == null : this.updated_at.equals(that.updated_at));
    equal = equal && (this.previous_id == null ? that.previous_id == null : this.previous_id.equals(that.previous_id));
    equal = equal && (this.next_id == null ? that.next_id == null : this.next_id.equals(that.next_id));
    equal = equal && (this.number_words == null ? that.number_words == null : this.number_words.equals(that.number_words));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.edition_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.code = JdbcWritableBridge.readString(3, __dbResults);
    this.title = JdbcWritableBridge.readString(4, __dbResults);
    this.content = JdbcWritableBridge.readString(5, __dbResults);
    this.parent_id = JdbcWritableBridge.readInteger(6, __dbResults);
    this.play_order = JdbcWritableBridge.readInteger(7, __dbResults);
    this.created_at = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.updated_at = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.previous_id = JdbcWritableBridge.readInteger(10, __dbResults);
    this.next_id = JdbcWritableBridge.readInteger(11, __dbResults);
    this.number_words = JdbcWritableBridge.readInteger(12, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(edition_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(title, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(content, 5 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(parent_id, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(play_order, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_at, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updated_at, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(previous_id, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(next_id, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(number_words, 12 + __off, 4, __dbStmt);
    return 12;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.edition_id = null;
    } else {
    this.edition_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.code = null;
    } else {
    this.code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.content = null;
    } else {
    this.content = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.parent_id = null;
    } else {
    this.parent_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.play_order = null;
    } else {
    this.play_order = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.created_at = null;
    } else {
    this.created_at = new Timestamp(__dataIn.readLong());
    this.created_at.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.updated_at = null;
    } else {
    this.updated_at = new Timestamp(__dataIn.readLong());
    this.updated_at.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.previous_id = null;
    } else {
    this.previous_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.next_id = null;
    } else {
    this.next_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.number_words = null;
    } else {
    this.number_words = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.edition_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.edition_id);
    }
    if (null == this.code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, code);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.content) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, content);
    }
    if (null == this.parent_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.parent_id);
    }
    if (null == this.play_order) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.play_order);
    }
    if (null == this.created_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created_at.getTime());
    __dataOut.writeInt(this.created_at.getNanos());
    }
    if (null == this.updated_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.updated_at.getTime());
    __dataOut.writeInt(this.updated_at.getNanos());
    }
    if (null == this.previous_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.previous_id);
    }
    if (null == this.next_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.next_id);
    }
    if (null == this.number_words) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.number_words);
    }
  }
  private final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(edition_id==null?"null":"" + edition_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(code==null?"null":code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(content==null?"null":content, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(parent_id==null?"null":"" + parent_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(play_order==null?"null":"" + play_order, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_at==null?"null":"" + created_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updated_at==null?"null":"" + updated_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(previous_id==null?"null":"" + previous_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(next_id==null?"null":"" + next_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_words==null?"null":"" + number_words, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  private final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str;
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.edition_id = null; } else {
      this.edition_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.code = null; } else {
      this.code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.content = null; } else {
      this.content = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.parent_id = null; } else {
      this.parent_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.play_order = null; } else {
      this.play_order = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_at = null; } else {
      this.created_at = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.updated_at = null; } else {
      this.updated_at = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.previous_id = null; } else {
      this.previous_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.next_id = null; } else {
      this.next_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_words = null; } else {
      this.number_words = Integer.valueOf(__cur_str);
    }

  }

  public Object clone() throws CloneNotSupportedException {
    PUBLICDOMAINCHAPTERS_TABLE o = (PUBLICDOMAINCHAPTERS_TABLE) super.clone();
    o.created_at = (o.created_at != null) ? (java.sql.Timestamp) o.created_at.clone() : null;
    o.updated_at = (o.updated_at != null) ? (java.sql.Timestamp) o.updated_at.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("edition_id", this.edition_id);
    __sqoop$field_map.put("code", this.code);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("content", this.content);
    __sqoop$field_map.put("parent_id", this.parent_id);
    __sqoop$field_map.put("play_order", this.play_order);
    __sqoop$field_map.put("created_at", this.created_at);
    __sqoop$field_map.put("updated_at", this.updated_at);
    __sqoop$field_map.put("previous_id", this.previous_id);
    __sqoop$field_map.put("next_id", this.next_id);
    __sqoop$field_map.put("number_words", this.number_words);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("edition_id".equals(__fieldName)) {
      this.edition_id = (Integer) __fieldVal;
    }
    else    if ("code".equals(__fieldName)) {
      this.code = (String) __fieldVal;
    }
    else    if ("title".equals(__fieldName)) {
      this.title = (String) __fieldVal;
    }
    else    if ("content".equals(__fieldName)) {
      this.content = (String) __fieldVal;
    }
    else    if ("parent_id".equals(__fieldName)) {
      this.parent_id = (Integer) __fieldVal;
    }
    else    if ("play_order".equals(__fieldName)) {
      this.play_order = (Integer) __fieldVal;
    }
    else    if ("created_at".equals(__fieldName)) {
      this.created_at = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("updated_at".equals(__fieldName)) {
      this.updated_at = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("previous_id".equals(__fieldName)) {
      this.previous_id = (Integer) __fieldVal;
    }
    else    if ("next_id".equals(__fieldName)) {
      this.next_id = (Integer) __fieldVal;
    }
    else    if ("number_words".equals(__fieldName)) {
      this.number_words = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}

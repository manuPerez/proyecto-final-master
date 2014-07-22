// ORM class for table 'reader_raw_stats'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jul 10 14:48:40 PDT 2014
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

public class reader_raw_stats extends SqoopRecord  implements DBWritable, Writable {
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
  public reader_raw_stats with_id(Integer id) {
    this.id = id;
    return this;
  }
  private Integer chapter_id;
  public Integer get_chapter_id() {
    return chapter_id;
  }
  public void set_chapter_id(Integer chapter_id) {
    this.chapter_id = chapter_id;
  }
  public reader_raw_stats with_chapter_id(Integer chapter_id) {
    this.chapter_id = chapter_id;
    return this;
  }
  private Integer edition_id;
  public Integer get_edition_id() {
    return edition_id;
  }
  public void set_edition_id(Integer edition_id) {
    this.edition_id = edition_id;
  }
  public reader_raw_stats with_edition_id(Integer edition_id) {
    this.edition_id = edition_id;
    return this;
  }
  private Integer user_id;
  public Integer get_user_id() {
    return user_id;
  }
  public void set_user_id(Integer user_id) {
    this.user_id = user_id;
  }
  public reader_raw_stats with_user_id(Integer user_id) {
    this.user_id = user_id;
    return this;
  }
  private Float percent;
  public Float get_percent() {
    return percent;
  }
  public void set_percent(Float percent) {
    this.percent = percent;
  }
  public reader_raw_stats with_percent(Float percent) {
    this.percent = percent;
    return this;
  }
  private Float words;
  public Float get_words() {
    return words;
  }
  public void set_words(Float words) {
    this.words = words;
  }
  public reader_raw_stats with_words(Float words) {
    this.words = words;
    return this;
  }
  private Float start_offset;
  public Float get_start_offset() {
    return start_offset;
  }
  public void set_start_offset(Float start_offset) {
    this.start_offset = start_offset;
  }
  public reader_raw_stats with_start_offset(Float start_offset) {
    this.start_offset = start_offset;
    return this;
  }
  private Float end_offset;
  public Float get_end_offset() {
    return end_offset;
  }
  public void set_end_offset(Float end_offset) {
    this.end_offset = end_offset;
  }
  public reader_raw_stats with_end_offset(Float end_offset) {
    this.end_offset = end_offset;
    return this;
  }
  private Integer premium;
  public Integer get_premium() {
    return premium;
  }
  public void set_premium(Integer premium) {
    this.premium = premium;
  }
  public reader_raw_stats with_premium(Integer premium) {
    this.premium = premium;
    return this;
  }
  private String device;
  public String get_device() {
    return device;
  }
  public void set_device(String device) {
    this.device = device;
  }
  public reader_raw_stats with_device(String device) {
    this.device = device;
    return this;
  }
  private String version;
  public String get_version() {
    return version;
  }
  public void set_version(String version) {
    this.version = version;
  }
  public reader_raw_stats with_version(String version) {
    this.version = version;
    return this;
  }
  private Integer timezone;
  public Integer get_timezone() {
    return timezone;
  }
  public void set_timezone(Integer timezone) {
    this.timezone = timezone;
  }
  public reader_raw_stats with_timezone(Integer timezone) {
    this.timezone = timezone;
    return this;
  }
  private java.sql.Timestamp created_at;
  public java.sql.Timestamp get_created_at() {
    return created_at;
  }
  public void set_created_at(java.sql.Timestamp created_at) {
    this.created_at = created_at;
  }
  public reader_raw_stats with_created_at(java.sql.Timestamp created_at) {
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
  public reader_raw_stats with_updated_at(java.sql.Timestamp updated_at) {
    this.updated_at = updated_at;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof reader_raw_stats)) {
      return false;
    }
    reader_raw_stats that = (reader_raw_stats) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.chapter_id == null ? that.chapter_id == null : this.chapter_id.equals(that.chapter_id));
    equal = equal && (this.edition_id == null ? that.edition_id == null : this.edition_id.equals(that.edition_id));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.percent == null ? that.percent == null : this.percent.equals(that.percent));
    equal = equal && (this.words == null ? that.words == null : this.words.equals(that.words));
    equal = equal && (this.start_offset == null ? that.start_offset == null : this.start_offset.equals(that.start_offset));
    equal = equal && (this.end_offset == null ? that.end_offset == null : this.end_offset.equals(that.end_offset));
    equal = equal && (this.premium == null ? that.premium == null : this.premium.equals(that.premium));
    equal = equal && (this.device == null ? that.device == null : this.device.equals(that.device));
    equal = equal && (this.version == null ? that.version == null : this.version.equals(that.version));
    equal = equal && (this.timezone == null ? that.timezone == null : this.timezone.equals(that.timezone));
    equal = equal && (this.created_at == null ? that.created_at == null : this.created_at.equals(that.created_at));
    equal = equal && (this.updated_at == null ? that.updated_at == null : this.updated_at.equals(that.updated_at));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.chapter_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.edition_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.user_id = JdbcWritableBridge.readInteger(4, __dbResults);
    this.percent = JdbcWritableBridge.readFloat(5, __dbResults);
    this.words = JdbcWritableBridge.readFloat(6, __dbResults);
    this.start_offset = JdbcWritableBridge.readFloat(7, __dbResults);
    this.end_offset = JdbcWritableBridge.readFloat(8, __dbResults);
    this.premium = JdbcWritableBridge.readInteger(9, __dbResults);
    this.device = JdbcWritableBridge.readString(10, __dbResults);
    this.version = JdbcWritableBridge.readString(11, __dbResults);
    this.timezone = JdbcWritableBridge.readInteger(12, __dbResults);
    this.created_at = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.updated_at = JdbcWritableBridge.readTimestamp(14, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(chapter_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(edition_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(user_id, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(percent, 5 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(words, 6 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(start_offset, 7 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(end_offset, 8 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(premium, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(device, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(version, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(timezone, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_at, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updated_at, 14 + __off, 93, __dbStmt);
    return 14;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.chapter_id = null;
    } else {
    this.chapter_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.edition_id = null;
    } else {
    this.edition_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_id = null;
    } else {
    this.user_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.percent = null;
    } else {
    this.percent = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.words = null;
    } else {
    this.words = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.start_offset = null;
    } else {
    this.start_offset = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.end_offset = null;
    } else {
    this.end_offset = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.premium = null;
    } else {
    this.premium = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.device = null;
    } else {
    this.device = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.version = null;
    } else {
    this.version = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.timezone = null;
    } else {
    this.timezone = Integer.valueOf(__dataIn.readInt());
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
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.chapter_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chapter_id);
    }
    if (null == this.edition_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.edition_id);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.percent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.percent);
    }
    if (null == this.words) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.words);
    }
    if (null == this.start_offset) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.start_offset);
    }
    if (null == this.end_offset) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.end_offset);
    }
    if (null == this.premium) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.premium);
    }
    if (null == this.device) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, device);
    }
    if (null == this.version) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, version);
    }
    if (null == this.timezone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.timezone);
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
    __sb.append(FieldFormatter.escapeAndEnclose(chapter_id==null?"null":"" + chapter_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(edition_id==null?"null":"" + edition_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percent==null?"null":"" + percent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(words==null?"null":"" + words, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_offset==null?"null":"" + start_offset, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_offset==null?"null":"" + end_offset, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(premium==null?"null":"" + premium, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(device==null?"null":device, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(version==null?"null":version, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(timezone==null?"null":"" + timezone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_at==null?"null":"" + created_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updated_at==null?"null":"" + updated_at, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chapter_id = null; } else {
      this.chapter_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.edition_id = null; } else {
      this.edition_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.percent = null; } else {
      this.percent = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.words = null; } else {
      this.words = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_offset = null; } else {
      this.start_offset = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_offset = null; } else {
      this.end_offset = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.premium = null; } else {
      this.premium = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.device = null; } else {
      this.device = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.version = null; } else {
      this.version = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.timezone = null; } else {
      this.timezone = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_at = null; } else {
      this.created_at = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.updated_at = null; } else {
      this.updated_at = java.sql.Timestamp.valueOf(__cur_str);
    }

  }

  public Object clone() throws CloneNotSupportedException {
    reader_raw_stats o = (reader_raw_stats) super.clone();
    o.created_at = (o.created_at != null) ? (java.sql.Timestamp) o.created_at.clone() : null;
    o.updated_at = (o.updated_at != null) ? (java.sql.Timestamp) o.updated_at.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("chapter_id", this.chapter_id);
    __sqoop$field_map.put("edition_id", this.edition_id);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("percent", this.percent);
    __sqoop$field_map.put("words", this.words);
    __sqoop$field_map.put("start_offset", this.start_offset);
    __sqoop$field_map.put("end_offset", this.end_offset);
    __sqoop$field_map.put("premium", this.premium);
    __sqoop$field_map.put("device", this.device);
    __sqoop$field_map.put("version", this.version);
    __sqoop$field_map.put("timezone", this.timezone);
    __sqoop$field_map.put("created_at", this.created_at);
    __sqoop$field_map.put("updated_at", this.updated_at);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("chapter_id".equals(__fieldName)) {
      this.chapter_id = (Integer) __fieldVal;
    }
    else    if ("edition_id".equals(__fieldName)) {
      this.edition_id = (Integer) __fieldVal;
    }
    else    if ("user_id".equals(__fieldName)) {
      this.user_id = (Integer) __fieldVal;
    }
    else    if ("percent".equals(__fieldName)) {
      this.percent = (Float) __fieldVal;
    }
    else    if ("words".equals(__fieldName)) {
      this.words = (Float) __fieldVal;
    }
    else    if ("start_offset".equals(__fieldName)) {
      this.start_offset = (Float) __fieldVal;
    }
    else    if ("end_offset".equals(__fieldName)) {
      this.end_offset = (Float) __fieldVal;
    }
    else    if ("premium".equals(__fieldName)) {
      this.premium = (Integer) __fieldVal;
    }
    else    if ("device".equals(__fieldName)) {
      this.device = (String) __fieldVal;
    }
    else    if ("version".equals(__fieldName)) {
      this.version = (String) __fieldVal;
    }
    else    if ("timezone".equals(__fieldName)) {
      this.timezone = (Integer) __fieldVal;
    }
    else    if ("created_at".equals(__fieldName)) {
      this.created_at = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("updated_at".equals(__fieldName)) {
      this.updated_at = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}

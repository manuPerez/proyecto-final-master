// ORM class for table 'UTADUSERS_TABLE'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jul 10 15:02:13 PDT 2014
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

public class UTADUSERS_TABLE extends SqoopRecord  implements DBWritable, Writable {
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
  public UTADUSERS_TABLE with_id(Integer id) {
    this.id = id;
    return this;
  }
  private Integer sign_in_count;
  public Integer get_sign_in_count() {
    return sign_in_count;
  }
  public void set_sign_in_count(Integer sign_in_count) {
    this.sign_in_count = sign_in_count;
  }
  public UTADUSERS_TABLE with_sign_in_count(Integer sign_in_count) {
    this.sign_in_count = sign_in_count;
    return this;
  }
  private java.sql.Timestamp current_sign_in_at;
  public java.sql.Timestamp get_current_sign_in_at() {
    return current_sign_in_at;
  }
  public void set_current_sign_in_at(java.sql.Timestamp current_sign_in_at) {
    this.current_sign_in_at = current_sign_in_at;
  }
  public UTADUSERS_TABLE with_current_sign_in_at(java.sql.Timestamp current_sign_in_at) {
    this.current_sign_in_at = current_sign_in_at;
    return this;
  }
  private java.sql.Timestamp last_sign_in_at;
  public java.sql.Timestamp get_last_sign_in_at() {
    return last_sign_in_at;
  }
  public void set_last_sign_in_at(java.sql.Timestamp last_sign_in_at) {
    this.last_sign_in_at = last_sign_in_at;
  }
  public UTADUSERS_TABLE with_last_sign_in_at(java.sql.Timestamp last_sign_in_at) {
    this.last_sign_in_at = last_sign_in_at;
    return this;
  }
  private String last_sign_in_ip;
  public String get_last_sign_in_ip() {
    return last_sign_in_ip;
  }
  public void set_last_sign_in_ip(String last_sign_in_ip) {
    this.last_sign_in_ip = last_sign_in_ip;
  }
  public UTADUSERS_TABLE with_last_sign_in_ip(String last_sign_in_ip) {
    this.last_sign_in_ip = last_sign_in_ip;
    return this;
  }
  private java.sql.Timestamp created_at;
  public java.sql.Timestamp get_created_at() {
    return created_at;
  }
  public void set_created_at(java.sql.Timestamp created_at) {
    this.created_at = created_at;
  }
  public UTADUSERS_TABLE with_created_at(java.sql.Timestamp created_at) {
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
  public UTADUSERS_TABLE with_updated_at(java.sql.Timestamp updated_at) {
    this.updated_at = updated_at;
    return this;
  }
  private String locale;
  public String get_locale() {
    return locale;
  }
  public void set_locale(String locale) {
    this.locale = locale;
  }
  public UTADUSERS_TABLE with_locale(String locale) {
    this.locale = locale;
    return this;
  }
  private String sex;
  public String get_sex() {
    return sex;
  }
  public void set_sex(String sex) {
    this.sex = sex;
  }
  public UTADUSERS_TABLE with_sex(String sex) {
    this.sex = sex;
    return this;
  }
  private java.sql.Date birthday;
  public java.sql.Date get_birthday() {
    return birthday;
  }
  public void set_birthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }
  public UTADUSERS_TABLE with_birthday(java.sql.Date birthday) {
    this.birthday = birthday;
    return this;
  }
  private String location;
  public String get_location() {
    return location;
  }
  public void set_location(String location) {
    this.location = location;
  }
  public UTADUSERS_TABLE with_location(String location) {
    this.location = location;
    return this;
  }
  private Integer banned;
  public Integer get_banned() {
    return banned;
  }
  public void set_banned(Integer banned) {
    this.banned = banned;
  }
  public UTADUSERS_TABLE with_banned(Integer banned) {
    this.banned = banned;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof UTADUSERS_TABLE)) {
      return false;
    }
    UTADUSERS_TABLE that = (UTADUSERS_TABLE) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.sign_in_count == null ? that.sign_in_count == null : this.sign_in_count.equals(that.sign_in_count));
    equal = equal && (this.current_sign_in_at == null ? that.current_sign_in_at == null : this.current_sign_in_at.equals(that.current_sign_in_at));
    equal = equal && (this.last_sign_in_at == null ? that.last_sign_in_at == null : this.last_sign_in_at.equals(that.last_sign_in_at));
    equal = equal && (this.last_sign_in_ip == null ? that.last_sign_in_ip == null : this.last_sign_in_ip.equals(that.last_sign_in_ip));
    equal = equal && (this.created_at == null ? that.created_at == null : this.created_at.equals(that.created_at));
    equal = equal && (this.updated_at == null ? that.updated_at == null : this.updated_at.equals(that.updated_at));
    equal = equal && (this.locale == null ? that.locale == null : this.locale.equals(that.locale));
    equal = equal && (this.sex == null ? that.sex == null : this.sex.equals(that.sex));
    equal = equal && (this.birthday == null ? that.birthday == null : this.birthday.equals(that.birthday));
    equal = equal && (this.location == null ? that.location == null : this.location.equals(that.location));
    equal = equal && (this.banned == null ? that.banned == null : this.banned.equals(that.banned));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.sign_in_count = JdbcWritableBridge.readInteger(2, __dbResults);
    this.current_sign_in_at = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.last_sign_in_at = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.last_sign_in_ip = JdbcWritableBridge.readString(5, __dbResults);
    this.created_at = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.updated_at = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.locale = JdbcWritableBridge.readString(8, __dbResults);
    this.sex = JdbcWritableBridge.readString(9, __dbResults);
    this.birthday = JdbcWritableBridge.readDate(10, __dbResults);
    this.location = JdbcWritableBridge.readString(11, __dbResults);
    this.banned = JdbcWritableBridge.readInteger(12, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(sign_in_count, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(current_sign_in_at, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(last_sign_in_at, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(last_sign_in_ip, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_at, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updated_at, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(locale, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sex, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(birthday, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(location, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(banned, 12 + __off, 4, __dbStmt);
    return 12;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.sign_in_count = null;
    } else {
    this.sign_in_count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.current_sign_in_at = null;
    } else {
    this.current_sign_in_at = new Timestamp(__dataIn.readLong());
    this.current_sign_in_at.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.last_sign_in_at = null;
    } else {
    this.last_sign_in_at = new Timestamp(__dataIn.readLong());
    this.last_sign_in_at.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.last_sign_in_ip = null;
    } else {
    this.last_sign_in_ip = Text.readString(__dataIn);
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
        this.locale = null;
    } else {
    this.locale = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sex = null;
    } else {
    this.sex = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.birthday = null;
    } else {
    this.birthday = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.location = null;
    } else {
    this.location = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.banned = null;
    } else {
    this.banned = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.sign_in_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sign_in_count);
    }
    if (null == this.current_sign_in_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.current_sign_in_at.getTime());
    __dataOut.writeInt(this.current_sign_in_at.getNanos());
    }
    if (null == this.last_sign_in_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_sign_in_at.getTime());
    __dataOut.writeInt(this.last_sign_in_at.getNanos());
    }
    if (null == this.last_sign_in_ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, last_sign_in_ip);
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
    if (null == this.locale) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, locale);
    }
    if (null == this.sex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sex);
    }
    if (null == this.birthday) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.birthday.getTime());
    }
    if (null == this.location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, location);
    }
    if (null == this.banned) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.banned);
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
    __sb.append(FieldFormatter.escapeAndEnclose(sign_in_count==null?"null":"" + sign_in_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(current_sign_in_at==null?"null":"" + current_sign_in_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_sign_in_at==null?"null":"" + last_sign_in_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_sign_in_ip==null?"null":last_sign_in_ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_at==null?"null":"" + created_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updated_at==null?"null":"" + updated_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(locale==null?"null":locale, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sex==null?"null":sex, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(birthday==null?"null":"" + birthday, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(location==null?"null":location, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(banned==null?"null":"" + banned, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sign_in_count = null; } else {
      this.sign_in_count = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.current_sign_in_at = null; } else {
      this.current_sign_in_at = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_sign_in_at = null; } else {
      this.last_sign_in_at = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.last_sign_in_ip = null; } else {
      this.last_sign_in_ip = __cur_str;
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
    if (__cur_str.equals("null")) { this.locale = null; } else {
      this.locale = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sex = null; } else {
      this.sex = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.birthday = null; } else {
      this.birthday = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.location = null; } else {
      this.location = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.banned = null; } else {
      this.banned = Integer.valueOf(__cur_str);
    }

  }

  public Object clone() throws CloneNotSupportedException {
    UTADUSERS_TABLE o = (UTADUSERS_TABLE) super.clone();
    o.current_sign_in_at = (o.current_sign_in_at != null) ? (java.sql.Timestamp) o.current_sign_in_at.clone() : null;
    o.last_sign_in_at = (o.last_sign_in_at != null) ? (java.sql.Timestamp) o.last_sign_in_at.clone() : null;
    o.created_at = (o.created_at != null) ? (java.sql.Timestamp) o.created_at.clone() : null;
    o.updated_at = (o.updated_at != null) ? (java.sql.Timestamp) o.updated_at.clone() : null;
    o.birthday = (o.birthday != null) ? (java.sql.Date) o.birthday.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("sign_in_count", this.sign_in_count);
    __sqoop$field_map.put("current_sign_in_at", this.current_sign_in_at);
    __sqoop$field_map.put("last_sign_in_at", this.last_sign_in_at);
    __sqoop$field_map.put("last_sign_in_ip", this.last_sign_in_ip);
    __sqoop$field_map.put("created_at", this.created_at);
    __sqoop$field_map.put("updated_at", this.updated_at);
    __sqoop$field_map.put("locale", this.locale);
    __sqoop$field_map.put("sex", this.sex);
    __sqoop$field_map.put("birthday", this.birthday);
    __sqoop$field_map.put("location", this.location);
    __sqoop$field_map.put("banned", this.banned);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("sign_in_count".equals(__fieldName)) {
      this.sign_in_count = (Integer) __fieldVal;
    }
    else    if ("current_sign_in_at".equals(__fieldName)) {
      this.current_sign_in_at = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("last_sign_in_at".equals(__fieldName)) {
      this.last_sign_in_at = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("last_sign_in_ip".equals(__fieldName)) {
      this.last_sign_in_ip = (String) __fieldVal;
    }
    else    if ("created_at".equals(__fieldName)) {
      this.created_at = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("updated_at".equals(__fieldName)) {
      this.updated_at = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("locale".equals(__fieldName)) {
      this.locale = (String) __fieldVal;
    }
    else    if ("sex".equals(__fieldName)) {
      this.sex = (String) __fieldVal;
    }
    else    if ("birthday".equals(__fieldName)) {
      this.birthday = (java.sql.Date) __fieldVal;
    }
    else    if ("location".equals(__fieldName)) {
      this.location = (String) __fieldVal;
    }
    else    if ("banned".equals(__fieldName)) {
      this.banned = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}

// ORM class for table 'editions'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jul 10 15:05:09 PDT 2014
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

public class editions extends SqoopRecord  implements DBWritable, Writable {
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
  public editions with_id(Integer id) {
    this.id = id;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public editions with_title(String title) {
    this.title = title;
    return this;
  }
  private java.sql.Timestamp created_at;
  public java.sql.Timestamp get_created_at() {
    return created_at;
  }
  public void set_created_at(java.sql.Timestamp created_at) {
    this.created_at = created_at;
  }
  public editions with_created_at(java.sql.Timestamp created_at) {
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
  public editions with_updated_at(java.sql.Timestamp updated_at) {
    this.updated_at = updated_at;
    return this;
  }
  private Integer work_id;
  public Integer get_work_id() {
    return work_id;
  }
  public void set_work_id(Integer work_id) {
    this.work_id = work_id;
  }
  public editions with_work_id(Integer work_id) {
    this.work_id = work_id;
    return this;
  }
  private java.sql.Timestamp publishing_date;
  public java.sql.Timestamp get_publishing_date() {
    return publishing_date;
  }
  public void set_publishing_date(java.sql.Timestamp publishing_date) {
    this.publishing_date = publishing_date;
  }
  public editions with_publishing_date(java.sql.Timestamp publishing_date) {
    this.publishing_date = publishing_date;
    return this;
  }
  private Integer publisher_id;
  public Integer get_publisher_id() {
    return publisher_id;
  }
  public void set_publisher_id(Integer publisher_id) {
    this.publisher_id = publisher_id;
  }
  public editions with_publisher_id(Integer publisher_id) {
    this.publisher_id = publisher_id;
    return this;
  }
  private String isbn;
  public String get_isbn() {
    return isbn;
  }
  public void set_isbn(String isbn) {
    this.isbn = isbn;
  }
  public editions with_isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }
  private String eisbn;
  public String get_eisbn() {
    return eisbn;
  }
  public void set_eisbn(String eisbn) {
    this.eisbn = eisbn;
  }
  public editions with_eisbn(String eisbn) {
    this.eisbn = eisbn;
    return this;
  }
  private String doi;
  public String get_doi() {
    return doi;
  }
  public void set_doi(String doi) {
    this.doi = doi;
  }
  public editions with_doi(String doi) {
    this.doi = doi;
    return this;
  }
  private String description;
  public String get_description() {
    return description;
  }
  public void set_description(String description) {
    this.description = description;
  }
  public editions with_description(String description) {
    this.description = description;
    return this;
  }
  private String language;
  public String get_language() {
    return language;
  }
  public void set_language(String language) {
    this.language = language;
  }
  public editions with_language(String language) {
    this.language = language;
    return this;
  }
  private String copyright;
  public String get_copyright() {
    return copyright;
  }
  public void set_copyright(String copyright) {
    this.copyright = copyright;
  }
  public editions with_copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }
  private String age_rate;
  public String get_age_rate() {
    return age_rate;
  }
  public void set_age_rate(String age_rate) {
    this.age_rate = age_rate;
  }
  public editions with_age_rate(String age_rate) {
    this.age_rate = age_rate;
    return this;
  }
  private String resources_path;
  public String get_resources_path() {
    return resources_path;
  }
  public void set_resources_path(String resources_path) {
    this.resources_path = resources_path;
  }
  public editions with_resources_path(String resources_path) {
    this.resources_path = resources_path;
    return this;
  }
  private String css;
  public String get_css() {
    return css;
  }
  public void set_css(String css) {
    this.css = css;
  }
  public editions with_css(String css) {
    this.css = css;
    return this;
  }
  private String cover;
  public String get_cover() {
    return cover;
  }
  public void set_cover(String cover) {
    this.cover = cover;
  }
  public editions with_cover(String cover) {
    this.cover = cover;
    return this;
  }
  private String permission;
  public String get_permission() {
    return permission;
  }
  public void set_permission(String permission) {
    this.permission = permission;
  }
  public editions with_permission(String permission) {
    this.permission = permission;
    return this;
  }
  private String weblink;
  public String get_weblink() {
    return weblink;
  }
  public void set_weblink(String weblink) {
    this.weblink = weblink;
  }
  public editions with_weblink(String weblink) {
    this.weblink = weblink;
    return this;
  }
  private String geoblocking;
  public String get_geoblocking() {
    return geoblocking;
  }
  public void set_geoblocking(String geoblocking) {
    this.geoblocking = geoblocking;
  }
  public editions with_geoblocking(String geoblocking) {
    this.geoblocking = geoblocking;
    return this;
  }
  private String geoblocking_type;
  public String get_geoblocking_type() {
    return geoblocking_type;
  }
  public void set_geoblocking_type(String geoblocking_type) {
    this.geoblocking_type = geoblocking_type;
  }
  public editions with_geoblocking_type(String geoblocking_type) {
    this.geoblocking_type = geoblocking_type;
    return this;
  }
  private String cover_size;
  public String get_cover_size() {
    return cover_size;
  }
  public void set_cover_size(String cover_size) {
    this.cover_size = cover_size;
  }
  public editions with_cover_size(String cover_size) {
    this.cover_size = cover_size;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof editions)) {
      return false;
    }
    editions that = (editions) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.created_at == null ? that.created_at == null : this.created_at.equals(that.created_at));
    equal = equal && (this.updated_at == null ? that.updated_at == null : this.updated_at.equals(that.updated_at));
    equal = equal && (this.work_id == null ? that.work_id == null : this.work_id.equals(that.work_id));
    equal = equal && (this.publishing_date == null ? that.publishing_date == null : this.publishing_date.equals(that.publishing_date));
    equal = equal && (this.publisher_id == null ? that.publisher_id == null : this.publisher_id.equals(that.publisher_id));
    equal = equal && (this.isbn == null ? that.isbn == null : this.isbn.equals(that.isbn));
    equal = equal && (this.eisbn == null ? that.eisbn == null : this.eisbn.equals(that.eisbn));
    equal = equal && (this.doi == null ? that.doi == null : this.doi.equals(that.doi));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.language == null ? that.language == null : this.language.equals(that.language));
    equal = equal && (this.copyright == null ? that.copyright == null : this.copyright.equals(that.copyright));
    equal = equal && (this.age_rate == null ? that.age_rate == null : this.age_rate.equals(that.age_rate));
    equal = equal && (this.resources_path == null ? that.resources_path == null : this.resources_path.equals(that.resources_path));
    equal = equal && (this.css == null ? that.css == null : this.css.equals(that.css));
    equal = equal && (this.cover == null ? that.cover == null : this.cover.equals(that.cover));
    equal = equal && (this.permission == null ? that.permission == null : this.permission.equals(that.permission));
    equal = equal && (this.weblink == null ? that.weblink == null : this.weblink.equals(that.weblink));
    equal = equal && (this.geoblocking == null ? that.geoblocking == null : this.geoblocking.equals(that.geoblocking));
    equal = equal && (this.geoblocking_type == null ? that.geoblocking_type == null : this.geoblocking_type.equals(that.geoblocking_type));
    equal = equal && (this.cover_size == null ? that.cover_size == null : this.cover_size.equals(that.cover_size));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.title = JdbcWritableBridge.readString(2, __dbResults);
    this.created_at = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.updated_at = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.work_id = JdbcWritableBridge.readInteger(5, __dbResults);
    this.publishing_date = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.publisher_id = JdbcWritableBridge.readInteger(7, __dbResults);
    this.isbn = JdbcWritableBridge.readString(8, __dbResults);
    this.eisbn = JdbcWritableBridge.readString(9, __dbResults);
    this.doi = JdbcWritableBridge.readString(10, __dbResults);
    this.description = JdbcWritableBridge.readString(11, __dbResults);
    this.language = JdbcWritableBridge.readString(12, __dbResults);
    this.copyright = JdbcWritableBridge.readString(13, __dbResults);
    this.age_rate = JdbcWritableBridge.readString(14, __dbResults);
    this.resources_path = JdbcWritableBridge.readString(15, __dbResults);
    this.css = JdbcWritableBridge.readString(16, __dbResults);
    this.cover = JdbcWritableBridge.readString(17, __dbResults);
    this.permission = JdbcWritableBridge.readString(18, __dbResults);
    this.weblink = JdbcWritableBridge.readString(19, __dbResults);
    this.geoblocking = JdbcWritableBridge.readString(20, __dbResults);
    this.geoblocking_type = JdbcWritableBridge.readString(21, __dbResults);
    this.cover_size = JdbcWritableBridge.readString(22, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(title, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_at, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updated_at, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(work_id, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(publishing_date, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(publisher_id, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(isbn, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(eisbn, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(doi, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(description, 11 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(language, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(copyright, 13 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(age_rate, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(resources_path, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(css, 16 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(cover, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(permission, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(weblink, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(geoblocking, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(geoblocking_type, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cover_size, 22 + __off, 12, __dbStmt);
    return 22;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
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
        this.work_id = null;
    } else {
    this.work_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.publishing_date = null;
    } else {
    this.publishing_date = new Timestamp(__dataIn.readLong());
    this.publishing_date.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.publisher_id = null;
    } else {
    this.publisher_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.isbn = null;
    } else {
    this.isbn = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.eisbn = null;
    } else {
    this.eisbn = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.doi = null;
    } else {
    this.doi = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.description = null;
    } else {
    this.description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.language = null;
    } else {
    this.language = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.copyright = null;
    } else {
    this.copyright = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.age_rate = null;
    } else {
    this.age_rate = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.resources_path = null;
    } else {
    this.resources_path = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.css = null;
    } else {
    this.css = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cover = null;
    } else {
    this.cover = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.permission = null;
    } else {
    this.permission = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.weblink = null;
    } else {
    this.weblink = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.geoblocking = null;
    } else {
    this.geoblocking = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.geoblocking_type = null;
    } else {
    this.geoblocking_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cover_size = null;
    } else {
    this.cover_size = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
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
    if (null == this.work_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.work_id);
    }
    if (null == this.publishing_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.publishing_date.getTime());
    __dataOut.writeInt(this.publishing_date.getNanos());
    }
    if (null == this.publisher_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.publisher_id);
    }
    if (null == this.isbn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, isbn);
    }
    if (null == this.eisbn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, eisbn);
    }
    if (null == this.doi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, doi);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.language) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, language);
    }
    if (null == this.copyright) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, copyright);
    }
    if (null == this.age_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, age_rate);
    }
    if (null == this.resources_path) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, resources_path);
    }
    if (null == this.css) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, css);
    }
    if (null == this.cover) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cover);
    }
    if (null == this.permission) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, permission);
    }
    if (null == this.weblink) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, weblink);
    }
    if (null == this.geoblocking) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geoblocking);
    }
    if (null == this.geoblocking_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geoblocking_type);
    }
    if (null == this.cover_size) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cover_size);
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
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_at==null?"null":"" + created_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updated_at==null?"null":"" + updated_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(work_id==null?"null":"" + work_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(publishing_date==null?"null":"" + publishing_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(publisher_id==null?"null":"" + publisher_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(isbn==null?"null":isbn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(eisbn==null?"null":eisbn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(doi==null?"null":doi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(language==null?"null":language, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(copyright==null?"null":copyright, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(age_rate==null?"null":age_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(resources_path==null?"null":resources_path, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(css==null?"null":css, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cover==null?"null":cover, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(permission==null?"null":permission, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(weblink==null?"null":weblink, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geoblocking==null?"null":geoblocking, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geoblocking_type==null?"null":geoblocking_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cover_size==null?"null":cover_size, delimiters));
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
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.work_id = null; } else {
      this.work_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.publishing_date = null; } else {
      this.publishing_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.publisher_id = null; } else {
      this.publisher_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.isbn = null; } else {
      this.isbn = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.eisbn = null; } else {
      this.eisbn = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.doi = null; } else {
      this.doi = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.language = null; } else {
      this.language = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.copyright = null; } else {
      this.copyright = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.age_rate = null; } else {
      this.age_rate = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.resources_path = null; } else {
      this.resources_path = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.css = null; } else {
      this.css = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cover = null; } else {
      this.cover = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.permission = null; } else {
      this.permission = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.weblink = null; } else {
      this.weblink = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.geoblocking = null; } else {
      this.geoblocking = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.geoblocking_type = null; } else {
      this.geoblocking_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cover_size = null; } else {
      this.cover_size = __cur_str;
    }

  }

  public Object clone() throws CloneNotSupportedException {
    editions o = (editions) super.clone();
    o.created_at = (o.created_at != null) ? (java.sql.Timestamp) o.created_at.clone() : null;
    o.updated_at = (o.updated_at != null) ? (java.sql.Timestamp) o.updated_at.clone() : null;
    o.publishing_date = (o.publishing_date != null) ? (java.sql.Timestamp) o.publishing_date.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("created_at", this.created_at);
    __sqoop$field_map.put("updated_at", this.updated_at);
    __sqoop$field_map.put("work_id", this.work_id);
    __sqoop$field_map.put("publishing_date", this.publishing_date);
    __sqoop$field_map.put("publisher_id", this.publisher_id);
    __sqoop$field_map.put("isbn", this.isbn);
    __sqoop$field_map.put("eisbn", this.eisbn);
    __sqoop$field_map.put("doi", this.doi);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("language", this.language);
    __sqoop$field_map.put("copyright", this.copyright);
    __sqoop$field_map.put("age_rate", this.age_rate);
    __sqoop$field_map.put("resources_path", this.resources_path);
    __sqoop$field_map.put("css", this.css);
    __sqoop$field_map.put("cover", this.cover);
    __sqoop$field_map.put("permission", this.permission);
    __sqoop$field_map.put("weblink", this.weblink);
    __sqoop$field_map.put("geoblocking", this.geoblocking);
    __sqoop$field_map.put("geoblocking_type", this.geoblocking_type);
    __sqoop$field_map.put("cover_size", this.cover_size);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("title".equals(__fieldName)) {
      this.title = (String) __fieldVal;
    }
    else    if ("created_at".equals(__fieldName)) {
      this.created_at = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("updated_at".equals(__fieldName)) {
      this.updated_at = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("work_id".equals(__fieldName)) {
      this.work_id = (Integer) __fieldVal;
    }
    else    if ("publishing_date".equals(__fieldName)) {
      this.publishing_date = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("publisher_id".equals(__fieldName)) {
      this.publisher_id = (Integer) __fieldVal;
    }
    else    if ("isbn".equals(__fieldName)) {
      this.isbn = (String) __fieldVal;
    }
    else    if ("eisbn".equals(__fieldName)) {
      this.eisbn = (String) __fieldVal;
    }
    else    if ("doi".equals(__fieldName)) {
      this.doi = (String) __fieldVal;
    }
    else    if ("description".equals(__fieldName)) {
      this.description = (String) __fieldVal;
    }
    else    if ("language".equals(__fieldName)) {
      this.language = (String) __fieldVal;
    }
    else    if ("copyright".equals(__fieldName)) {
      this.copyright = (String) __fieldVal;
    }
    else    if ("age_rate".equals(__fieldName)) {
      this.age_rate = (String) __fieldVal;
    }
    else    if ("resources_path".equals(__fieldName)) {
      this.resources_path = (String) __fieldVal;
    }
    else    if ("css".equals(__fieldName)) {
      this.css = (String) __fieldVal;
    }
    else    if ("cover".equals(__fieldName)) {
      this.cover = (String) __fieldVal;
    }
    else    if ("permission".equals(__fieldName)) {
      this.permission = (String) __fieldVal;
    }
    else    if ("weblink".equals(__fieldName)) {
      this.weblink = (String) __fieldVal;
    }
    else    if ("geoblocking".equals(__fieldName)) {
      this.geoblocking = (String) __fieldVal;
    }
    else    if ("geoblocking_type".equals(__fieldName)) {
      this.geoblocking_type = (String) __fieldVal;
    }
    else    if ("cover_size".equals(__fieldName)) {
      this.cover_size = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}

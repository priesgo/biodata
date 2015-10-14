/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class VcfHeader extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VcfHeader\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"fields\":[{\"name\":\"fileFormat\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"meta\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}]},\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String fileFormat;
   private java.util.Map<java.lang.String,java.util.List<java.lang.Object>> meta;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public VcfHeader() {}

  /**
   * All-args constructor.
   */
  public VcfHeader(java.lang.String fileFormat, java.util.Map<java.lang.String,java.util.List<java.lang.Object>> meta) {
    this.fileFormat = fileFormat;
    this.meta = meta;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return fileFormat;
    case 1: return meta;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: fileFormat = (java.lang.String)value$; break;
    case 1: meta = (java.util.Map<java.lang.String,java.util.List<java.lang.Object>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'fileFormat' field.
   */
  public java.lang.String getFileFormat() {
    return fileFormat;
  }

  /**
   * Sets the value of the 'fileFormat' field.
   * @param value the value to set.
   */
  public void setFileFormat(java.lang.String value) {
    this.fileFormat = value;
  }

  /**
   * Gets the value of the 'meta' field.
   */
  public java.util.Map<java.lang.String,java.util.List<java.lang.Object>> getMeta() {
    return meta;
  }

  /**
   * Sets the value of the 'meta' field.
   * @param value the value to set.
   */
  public void setMeta(java.util.Map<java.lang.String,java.util.List<java.lang.Object>> value) {
    this.meta = value;
  }

  /** Creates a new VcfHeader RecordBuilder */
  public static org.opencb.biodata.models.variant.avro.VcfHeader.Builder newBuilder() {
    return new org.opencb.biodata.models.variant.avro.VcfHeader.Builder();
  }
  
  /** Creates a new VcfHeader RecordBuilder by copying an existing Builder */
  public static org.opencb.biodata.models.variant.avro.VcfHeader.Builder newBuilder(org.opencb.biodata.models.variant.avro.VcfHeader.Builder other) {
    return new org.opencb.biodata.models.variant.avro.VcfHeader.Builder(other);
  }
  
  /** Creates a new VcfHeader RecordBuilder by copying an existing VcfHeader instance */
  public static org.opencb.biodata.models.variant.avro.VcfHeader.Builder newBuilder(org.opencb.biodata.models.variant.avro.VcfHeader other) {
    return new org.opencb.biodata.models.variant.avro.VcfHeader.Builder(other);
  }
  
  /**
   * RecordBuilder for VcfHeader instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VcfHeader>
    implements org.apache.avro.data.RecordBuilder<VcfHeader> {

    private java.lang.String fileFormat;
    private java.util.Map<java.lang.String,java.util.List<java.lang.Object>> meta;

    /** Creates a new Builder */
    private Builder() {
      super(org.opencb.biodata.models.variant.avro.VcfHeader.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.opencb.biodata.models.variant.avro.VcfHeader.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.fileFormat)) {
        this.fileFormat = data().deepCopy(fields()[0].schema(), other.fileFormat);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.meta)) {
        this.meta = data().deepCopy(fields()[1].schema(), other.meta);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing VcfHeader instance */
    private Builder(org.opencb.biodata.models.variant.avro.VcfHeader other) {
            super(org.opencb.biodata.models.variant.avro.VcfHeader.SCHEMA$);
      if (isValidValue(fields()[0], other.fileFormat)) {
        this.fileFormat = data().deepCopy(fields()[0].schema(), other.fileFormat);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.meta)) {
        this.meta = data().deepCopy(fields()[1].schema(), other.meta);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'fileFormat' field */
    public java.lang.String getFileFormat() {
      return fileFormat;
    }
    
    /** Sets the value of the 'fileFormat' field */
    public org.opencb.biodata.models.variant.avro.VcfHeader.Builder setFileFormat(java.lang.String value) {
      validate(fields()[0], value);
      this.fileFormat = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'fileFormat' field has been set */
    public boolean hasFileFormat() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'fileFormat' field */
    public org.opencb.biodata.models.variant.avro.VcfHeader.Builder clearFileFormat() {
      fileFormat = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'meta' field */
    public java.util.Map<java.lang.String,java.util.List<java.lang.Object>> getMeta() {
      return meta;
    }
    
    /** Sets the value of the 'meta' field */
    public org.opencb.biodata.models.variant.avro.VcfHeader.Builder setMeta(java.util.Map<java.lang.String,java.util.List<java.lang.Object>> value) {
      validate(fields()[1], value);
      this.meta = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'meta' field has been set */
    public boolean hasMeta() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'meta' field */
    public org.opencb.biodata.models.variant.avro.VcfHeader.Builder clearMeta() {
      meta = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public VcfHeader build() {
      try {
        VcfHeader record = new VcfHeader();
        record.fileFormat = fieldSetFlags()[0] ? this.fileFormat : (java.lang.String) defaultValue(fields()[0]);
        record.meta = fieldSetFlags()[1] ? this.meta : (java.util.Map<java.lang.String,java.util.List<java.lang.Object>>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Genotype extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Genotype\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"fields\":[{\"name\":\"reference\",\"type\":\"string\"},{\"name\":\"alternate\",\"type\":\"string\"},{\"name\":\"allelesIdx\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"default\":[]},{\"name\":\"phased\",\"type\":\"boolean\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence reference;
  @Deprecated public CharSequence alternate;
  @Deprecated public java.util.List<Integer> allelesIdx;
  @Deprecated public boolean phased;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Genotype() {}

  /**
   * All-args constructor.
   */
  public Genotype(CharSequence reference, CharSequence alternate, java.util.List<Integer> allelesIdx, Boolean phased) {
    this.reference = reference;
    this.alternate = alternate;
    this.allelesIdx = allelesIdx;
    this.phased = phased;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public Object get(int field$) {
    switch (field$) {
    case 0: return reference;
    case 1: return alternate;
    case 2: return allelesIdx;
    case 3: return phased;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: reference = (CharSequence)value$; break;
    case 1: alternate = (CharSequence)value$; break;
    case 2: allelesIdx = (java.util.List<Integer>)value$; break;
    case 3: phased = (Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'reference' field.
   */
  public CharSequence getReference() {
    return reference;
  }

  /**
   * Sets the value of the 'reference' field.
   * @param value the value to set.
   */
  public void setReference(CharSequence value) {
    this.reference = value;
  }

  /**
   * Gets the value of the 'alternate' field.
   */
  public CharSequence getAlternate() {
    return alternate;
  }

  /**
   * Sets the value of the 'alternate' field.
   * @param value the value to set.
   */
  public void setAlternate(CharSequence value) {
    this.alternate = value;
  }

  /**
   * Gets the value of the 'allelesIdx' field.
   */
  public java.util.List<Integer> getAllelesIdx() {
    return allelesIdx;
  }

  /**
   * Sets the value of the 'allelesIdx' field.
   * @param value the value to set.
   */
  public void setAllelesIdx(java.util.List<Integer> value) {
    this.allelesIdx = value;
  }

  /**
   * Gets the value of the 'phased' field.
   */
  public Boolean getPhased() {
    return phased;
  }

  /**
   * Sets the value of the 'phased' field.
   * @param value the value to set.
   */
  public void setPhased(Boolean value) {
    this.phased = value;
  }

  /** Creates a new Genotype RecordBuilder */
  public static Builder newBuilder() {
    return new Builder();
  }
  
  /** Creates a new Genotype RecordBuilder by copying an existing Builder */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }
  
  /** Creates a new Genotype RecordBuilder by copying an existing Genotype instance */
  public static Builder newBuilder(Genotype other) {
    return new Builder(other);
  }
  
  /**
   * RecordBuilder for Genotype instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Genotype>
    implements org.apache.avro.data.RecordBuilder<Genotype> {

    private CharSequence reference;
    private CharSequence alternate;
    private java.util.List<Integer> allelesIdx;
    private boolean phased;

    /** Creates a new Builder */
    private Builder() {
      super(Genotype.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.reference)) {
        this.reference = data().deepCopy(fields()[0].schema(), other.reference);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.alternate)) {
        this.alternate = data().deepCopy(fields()[1].schema(), other.alternate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.allelesIdx)) {
        this.allelesIdx = data().deepCopy(fields()[2].schema(), other.allelesIdx);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.phased)) {
        this.phased = data().deepCopy(fields()[3].schema(), other.phased);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Genotype instance */
    private Builder(Genotype other) {
            super(Genotype.SCHEMA$);
      if (isValidValue(fields()[0], other.reference)) {
        this.reference = data().deepCopy(fields()[0].schema(), other.reference);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.alternate)) {
        this.alternate = data().deepCopy(fields()[1].schema(), other.alternate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.allelesIdx)) {
        this.allelesIdx = data().deepCopy(fields()[2].schema(), other.allelesIdx);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.phased)) {
        this.phased = data().deepCopy(fields()[3].schema(), other.phased);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'reference' field */
    public CharSequence getReference() {
      return reference;
    }
    
    /** Sets the value of the 'reference' field */
    public Builder setReference(CharSequence value) {
      validate(fields()[0], value);
      this.reference = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'reference' field has been set */
    public boolean hasReference() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'reference' field */
    public Builder clearReference() {
      reference = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'alternate' field */
    public CharSequence getAlternate() {
      return alternate;
    }
    
    /** Sets the value of the 'alternate' field */
    public Builder setAlternate(CharSequence value) {
      validate(fields()[1], value);
      this.alternate = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'alternate' field has been set */
    public boolean hasAlternate() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'alternate' field */
    public Builder clearAlternate() {
      alternate = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'allelesIdx' field */
    public java.util.List<Integer> getAllelesIdx() {
      return allelesIdx;
    }
    
    /** Sets the value of the 'allelesIdx' field */
    public Builder setAllelesIdx(java.util.List<Integer> value) {
      validate(fields()[2], value);
      this.allelesIdx = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'allelesIdx' field has been set */
    public boolean hasAllelesIdx() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'allelesIdx' field */
    public Builder clearAllelesIdx() {
      allelesIdx = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'phased' field */
    public Boolean getPhased() {
      return phased;
    }
    
    /** Sets the value of the 'phased' field */
    public Builder setPhased(boolean value) {
      validate(fields()[3], value);
      this.phased = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'phased' field has been set */
    public boolean hasPhased() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'phased' field */
    public Builder clearPhased() {
      fieldSetFlags()[3] = false;
      return this;
    }

    
    public Genotype build() {
      try {
        Genotype record = new Genotype();
        record.reference = fieldSetFlags()[0] ? this.reference : (CharSequence) defaultValue(fields()[0]);
        record.alternate = fieldSetFlags()[1] ? this.alternate : (CharSequence) defaultValue(fields()[1]);
        record.allelesIdx = fieldSetFlags()[2] ? this.allelesIdx : (java.util.List<Integer>) defaultValue(fields()[2]);
        record.phased = fieldSetFlags()[3] ? this.phased : (Boolean) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}

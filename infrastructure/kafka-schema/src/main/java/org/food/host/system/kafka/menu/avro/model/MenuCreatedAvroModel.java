/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.food.host.system.kafka.menu.avro.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class MenuCreatedAvroModel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8222654847557531326L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MenuCreatedAvroModel\",\"namespace\":\"org.food.host.system.kafka.menu.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"sagaId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"hostId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.UUIDConversion());
  }

  private static final BinaryMessageEncoder<MenuCreatedAvroModel> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MenuCreatedAvroModel> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<MenuCreatedAvroModel> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<MenuCreatedAvroModel> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<MenuCreatedAvroModel> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this MenuCreatedAvroModel to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a MenuCreatedAvroModel from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a MenuCreatedAvroModel instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static MenuCreatedAvroModel fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.UUID id;
  private java.util.UUID sagaId;
  private java.util.UUID hostId;
  private java.lang.String name;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MenuCreatedAvroModel() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param sagaId The new value for sagaId
   * @param hostId The new value for hostId
   * @param name The new value for name
   */
  public MenuCreatedAvroModel(java.util.UUID id, java.util.UUID sagaId, java.util.UUID hostId, java.lang.String name) {
    this.id = id;
    this.sagaId = sagaId;
    this.hostId = hostId;
    this.name = name;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return sagaId;
    case 2: return hostId;
    case 3: return name;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.Conversions.UUIDConversion(),
      new org.apache.avro.Conversions.UUIDConversion(),
      new org.apache.avro.Conversions.UUIDConversion(),
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.util.UUID)value$; break;
    case 1: sagaId = (java.util.UUID)value$; break;
    case 2: hostId = (java.util.UUID)value$; break;
    case 3: name = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.util.UUID getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.util.UUID value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'sagaId' field.
   * @return The value of the 'sagaId' field.
   */
  public java.util.UUID getSagaId() {
    return sagaId;
  }


  /**
   * Sets the value of the 'sagaId' field.
   * @param value the value to set.
   */
  public void setSagaId(java.util.UUID value) {
    this.sagaId = value;
  }

  /**
   * Gets the value of the 'hostId' field.
   * @return The value of the 'hostId' field.
   */
  public java.util.UUID getHostId() {
    return hostId;
  }


  /**
   * Sets the value of the 'hostId' field.
   * @param value the value to set.
   */
  public void setHostId(java.util.UUID value) {
    this.hostId = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Creates a new MenuCreatedAvroModel RecordBuilder.
   * @return A new MenuCreatedAvroModel RecordBuilder
   */
  public static org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder newBuilder() {
    return new org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder();
  }

  /**
   * Creates a new MenuCreatedAvroModel RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MenuCreatedAvroModel RecordBuilder
   */
  public static org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder newBuilder(org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder other) {
    if (other == null) {
      return new org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder();
    } else {
      return new org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder(other);
    }
  }

  /**
   * Creates a new MenuCreatedAvroModel RecordBuilder by copying an existing MenuCreatedAvroModel instance.
   * @param other The existing instance to copy.
   * @return A new MenuCreatedAvroModel RecordBuilder
   */
  public static org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder newBuilder(org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel other) {
    if (other == null) {
      return new org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder();
    } else {
      return new org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder(other);
    }
  }

  /**
   * RecordBuilder for MenuCreatedAvroModel instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MenuCreatedAvroModel>
    implements org.apache.avro.data.RecordBuilder<MenuCreatedAvroModel> {

    private java.util.UUID id;
    private java.util.UUID sagaId;
    private java.util.UUID hostId;
    private java.lang.String name;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.sagaId)) {
        this.sagaId = data().deepCopy(fields()[1].schema(), other.sagaId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.hostId)) {
        this.hostId = data().deepCopy(fields()[2].schema(), other.hostId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing MenuCreatedAvroModel instance
     * @param other The existing instance to copy.
     */
    private Builder(org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sagaId)) {
        this.sagaId = data().deepCopy(fields()[1].schema(), other.sagaId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.hostId)) {
        this.hostId = data().deepCopy(fields()[2].schema(), other.hostId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.util.UUID getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder setId(java.util.UUID value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'sagaId' field.
      * @return The value.
      */
    public java.util.UUID getSagaId() {
      return sagaId;
    }


    /**
      * Sets the value of the 'sagaId' field.
      * @param value The value of 'sagaId'.
      * @return This builder.
      */
    public org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder setSagaId(java.util.UUID value) {
      validate(fields()[1], value);
      this.sagaId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'sagaId' field has been set.
      * @return True if the 'sagaId' field has been set, false otherwise.
      */
    public boolean hasSagaId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'sagaId' field.
      * @return This builder.
      */
    public org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder clearSagaId() {
      sagaId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'hostId' field.
      * @return The value.
      */
    public java.util.UUID getHostId() {
      return hostId;
    }


    /**
      * Sets the value of the 'hostId' field.
      * @param value The value of 'hostId'.
      * @return This builder.
      */
    public org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder setHostId(java.util.UUID value) {
      validate(fields()[2], value);
      this.hostId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'hostId' field has been set.
      * @return True if the 'hostId' field has been set, false otherwise.
      */
    public boolean hasHostId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'hostId' field.
      * @return This builder.
      */
    public org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder clearHostId() {
      hostId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder setName(java.lang.String value) {
      validate(fields()[3], value);
      this.name = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel.Builder clearName() {
      name = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MenuCreatedAvroModel build() {
      try {
        MenuCreatedAvroModel record = new MenuCreatedAvroModel();
        record.id = fieldSetFlags()[0] ? this.id : (java.util.UUID) defaultValue(fields()[0]);
        record.sagaId = fieldSetFlags()[1] ? this.sagaId : (java.util.UUID) defaultValue(fields()[1]);
        record.hostId = fieldSetFlags()[2] ? this.hostId : (java.util.UUID) defaultValue(fields()[2]);
        record.name = fieldSetFlags()[3] ? this.name : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MenuCreatedAvroModel>
    WRITER$ = (org.apache.avro.io.DatumWriter<MenuCreatedAvroModel>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MenuCreatedAvroModel>
    READER$ = (org.apache.avro.io.DatumReader<MenuCreatedAvroModel>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}











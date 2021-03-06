/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SquareEventNotifiedUpdateSquareAuthority implements org.apache.thrift.TBase<SquareEventNotifiedUpdateSquareAuthority, SquareEventNotifiedUpdateSquareAuthority._Fields>, java.io.Serializable, Cloneable, Comparable<SquareEventNotifiedUpdateSquareAuthority> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareEventNotifiedUpdateSquareAuthority");

  private static final org.apache.thrift.protocol.TField SQUARE_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SQUARE_AUTHORITY_FIELD_DESC = new org.apache.thrift.protocol.TField("squareAuthority", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SquareEventNotifiedUpdateSquareAuthorityStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SquareEventNotifiedUpdateSquareAuthorityTupleSchemeFactory());
  }

  public String squareMid; // required
  public SquareAuthority squareAuthority; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_MID((short)1, "squareMid"),
    SQUARE_AUTHORITY((short)2, "squareAuthority");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SQUARE_MID
          return SQUARE_MID;
        case 2: // SQUARE_AUTHORITY
          return SQUARE_AUTHORITY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SQUARE_MID, new org.apache.thrift.meta_data.FieldMetaData("squareMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SQUARE_AUTHORITY, new org.apache.thrift.meta_data.FieldMetaData("squareAuthority", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareAuthority.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareEventNotifiedUpdateSquareAuthority.class, metaDataMap);
  }

  public SquareEventNotifiedUpdateSquareAuthority() {
  }

  public SquareEventNotifiedUpdateSquareAuthority(
    String squareMid,
    SquareAuthority squareAuthority)
  {
    this();
    this.squareMid = squareMid;
    this.squareAuthority = squareAuthority;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotifiedUpdateSquareAuthority(SquareEventNotifiedUpdateSquareAuthority other) {
    if (other.isSetSquareMid()) {
      this.squareMid = other.squareMid;
    }
    if (other.isSetSquareAuthority()) {
      this.squareAuthority = new SquareAuthority(other.squareAuthority);
    }
  }

  public SquareEventNotifiedUpdateSquareAuthority deepCopy() {
    return new SquareEventNotifiedUpdateSquareAuthority(this);
  }

  @Override
  public void clear() {
    this.squareMid = null;
    this.squareAuthority = null;
  }

  public String getSquareMid() {
    return this.squareMid;
  }

  public SquareEventNotifiedUpdateSquareAuthority setSquareMid(String squareMid) {
    this.squareMid = squareMid;
    return this;
  }

  public void unsetSquareMid() {
    this.squareMid = null;
  }

  /** Returns true if field squareMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMid() {
    return this.squareMid != null;
  }

  public void setSquareMidIsSet(boolean value) {
    if (!value) {
      this.squareMid = null;
    }
  }

  public SquareAuthority getSquareAuthority() {
    return this.squareAuthority;
  }

  public SquareEventNotifiedUpdateSquareAuthority setSquareAuthority(SquareAuthority squareAuthority) {
    this.squareAuthority = squareAuthority;
    return this;
  }

  public void unsetSquareAuthority() {
    this.squareAuthority = null;
  }

  /** Returns true if field squareAuthority is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareAuthority() {
    return this.squareAuthority != null;
  }

  public void setSquareAuthorityIsSet(boolean value) {
    if (!value) {
      this.squareAuthority = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SQUARE_MID:
      if (value == null) {
        unsetSquareMid();
      } else {
        setSquareMid((String)value);
      }
      break;

    case SQUARE_AUTHORITY:
      if (value == null) {
        unsetSquareAuthority();
      } else {
        setSquareAuthority((SquareAuthority)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_MID:
      return getSquareMid();

    case SQUARE_AUTHORITY:
      return getSquareAuthority();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SQUARE_MID:
      return isSetSquareMid();
    case SQUARE_AUTHORITY:
      return isSetSquareAuthority();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareEventNotifiedUpdateSquareAuthority)
      return this.equals((SquareEventNotifiedUpdateSquareAuthority)that);
    return false;
  }

  public boolean equals(SquareEventNotifiedUpdateSquareAuthority that) {
    if (that == null)
      return false;

    boolean this_present_squareMid = true && this.isSetSquareMid();
    boolean that_present_squareMid = true && that.isSetSquareMid();
    if (this_present_squareMid || that_present_squareMid) {
      if (!(this_present_squareMid && that_present_squareMid))
        return false;
      if (!this.squareMid.equals(that.squareMid))
        return false;
    }

    boolean this_present_squareAuthority = true && this.isSetSquareAuthority();
    boolean that_present_squareAuthority = true && that.isSetSquareAuthority();
    if (this_present_squareAuthority || that_present_squareAuthority) {
      if (!(this_present_squareAuthority && that_present_squareAuthority))
        return false;
      if (!this.squareAuthority.equals(that.squareAuthority))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(SquareEventNotifiedUpdateSquareAuthority other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSquareMid()).compareTo(other.isSetSquareMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareMid, other.squareMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSquareAuthority()).compareTo(other.isSetSquareAuthority());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareAuthority()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareAuthority, other.squareAuthority);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SquareEventNotifiedUpdateSquareAuthority(");
    boolean first = true;

    sb.append("squareMid:");
    if (this.squareMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareAuthority:");
    if (this.squareAuthority == null) {
      sb.append("null");
    } else {
      sb.append(this.squareAuthority);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (squareAuthority != null) {
      squareAuthority.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SquareEventNotifiedUpdateSquareAuthorityStandardSchemeFactory implements SchemeFactory {
    public SquareEventNotifiedUpdateSquareAuthorityStandardScheme getScheme() {
      return new SquareEventNotifiedUpdateSquareAuthorityStandardScheme();
    }
  }

  private static class SquareEventNotifiedUpdateSquareAuthorityStandardScheme extends StandardScheme<SquareEventNotifiedUpdateSquareAuthority> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareEventNotifiedUpdateSquareAuthority struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareMid = iprot.readString();
              struct.setSquareMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SQUARE_AUTHORITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.squareAuthority = new SquareAuthority();
              struct.squareAuthority.read(iprot);
              struct.setSquareAuthorityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareEventNotifiedUpdateSquareAuthority struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareMid != null) {
        oprot.writeFieldBegin(SQUARE_MID_FIELD_DESC);
        oprot.writeString(struct.squareMid);
        oprot.writeFieldEnd();
      }
      if (struct.squareAuthority != null) {
        oprot.writeFieldBegin(SQUARE_AUTHORITY_FIELD_DESC);
        struct.squareAuthority.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareEventNotifiedUpdateSquareAuthorityTupleSchemeFactory implements SchemeFactory {
    public SquareEventNotifiedUpdateSquareAuthorityTupleScheme getScheme() {
      return new SquareEventNotifiedUpdateSquareAuthorityTupleScheme();
    }
  }

  private static class SquareEventNotifiedUpdateSquareAuthorityTupleScheme extends TupleScheme<SquareEventNotifiedUpdateSquareAuthority> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedUpdateSquareAuthority struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSquareMid()) {
        optionals.set(0);
      }
      if (struct.isSetSquareAuthority()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSquareMid()) {
        oprot.writeString(struct.squareMid);
      }
      if (struct.isSetSquareAuthority()) {
        struct.squareAuthority.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedUpdateSquareAuthority struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.squareMid = iprot.readString();
        struct.setSquareMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.squareAuthority = new SquareAuthority();
        struct.squareAuthority.read(iprot);
        struct.setSquareAuthorityIsSet(true);
      }
    }
  }

}


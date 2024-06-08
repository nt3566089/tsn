/**
 * VoidResponse.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package com.hitachitransport;

public class VoidResponse  implements java.io.Serializable {
    private java.lang.String ERROR_CODE;

    private java.lang.String ERROR_MSG;

    public VoidResponse() {
    }

    public VoidResponse(
           java.lang.String ERROR_CODE,
           java.lang.String ERROR_MSG) {
           this.ERROR_CODE = ERROR_CODE;
           this.ERROR_MSG = ERROR_MSG;
    }


    /**
     * Gets the ERROR_CODE value for this VoidResponse.
     *
     * @return ERROR_CODE
     */
    public java.lang.String getERROR_CODE() {
        return ERROR_CODE;
    }


    /**
     * Sets the ERROR_CODE value for this VoidResponse.
     *
     * @param ERROR_CODE
     */
    public void setERROR_CODE(java.lang.String ERROR_CODE) {
        this.ERROR_CODE = ERROR_CODE;
    }


    /**
     * Gets the ERROR_MSG value for this VoidResponse.
     *
     * @return ERROR_MSG
     */
    public java.lang.String getERROR_MSG() {
        return ERROR_MSG;
    }


    /**
     * Sets the ERROR_MSG value for this VoidResponse.
     *
     * @param ERROR_MSG
     */
    public void setERROR_MSG(java.lang.String ERROR_MSG) {
        this.ERROR_MSG = ERROR_MSG;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoidResponse)) return false;
        VoidResponse other = (VoidResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.ERROR_CODE==null && other.getERROR_CODE()==null) ||
             (this.ERROR_CODE!=null &&
              this.ERROR_CODE.equals(other.getERROR_CODE()))) &&
            ((this.ERROR_MSG==null && other.getERROR_MSG()==null) ||
             (this.ERROR_MSG!=null &&
              this.ERROR_MSG.equals(other.getERROR_MSG())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getERROR_CODE() != null) {
            _hashCode += getERROR_CODE().hashCode();
        }
        if (getERROR_MSG() != null) {
            _hashCode += getERROR_MSG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // メタデータ型 / [en]-(Type metadata)
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoidResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitachitransport.com", "VoidResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERROR_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "ERROR_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERROR_MSG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "ERROR_MSG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * メタデータオブジェクトの型を返却 / [en]-(Return type metadata object)
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType,
           @SuppressWarnings("rawtypes") java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType,
           @SuppressWarnings("rawtypes") java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

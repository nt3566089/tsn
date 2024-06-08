/**
 * ShipmentResponse.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package com.hitachitransport;

public class ShipmentResponse  implements java.io.Serializable {
    private java.lang.String ERROR_CODE;

    private java.lang.String ERROR_MSG;

    private java.lang.String ALERT_MSG;

    private java.lang.String[] TRACKING_NO;

    private double ACCOUNT_TOTAL_CHARGE;

    private double LIST_TOTAL_CHARGE;

    private double BILL_TOTAL_CHARGE;

    private double[] BILLING_WEIGHT;

    private java.lang.String[] DOC_TYPE;

    private java.lang.String[] DOC_DATA;

    public ShipmentResponse() {
    }

    public ShipmentResponse(
           java.lang.String ERROR_CODE,
           java.lang.String ERROR_MSG,
           java.lang.String ALERT_MSG,
           java.lang.String[] TRACKING_NO,
           double ACCOUNT_TOTAL_CHARGE,
           double LIST_TOTAL_CHARGE,
           double BILL_TOTAL_CHARGE,
           double[] BILLING_WEIGHT,
           java.lang.String[] DOC_TYPE,
           java.lang.String[] DOC_DATA) {
           this.ERROR_CODE = ERROR_CODE;
           this.ERROR_MSG = ERROR_MSG;
           this.ALERT_MSG = ALERT_MSG;
           this.TRACKING_NO = TRACKING_NO;
           this.ACCOUNT_TOTAL_CHARGE = ACCOUNT_TOTAL_CHARGE;
           this.LIST_TOTAL_CHARGE = LIST_TOTAL_CHARGE;
           this.BILL_TOTAL_CHARGE = BILL_TOTAL_CHARGE;
           this.BILLING_WEIGHT = BILLING_WEIGHT;
           this.DOC_TYPE = DOC_TYPE;
           this.DOC_DATA = DOC_DATA;
    }


    /**
     * Gets the ERROR_CODE value for this ShipmentResponse.
     *
     * @return ERROR_CODE
     */
    public java.lang.String getERROR_CODE() {
        return ERROR_CODE;
    }


    /**
     * Sets the ERROR_CODE value for this ShipmentResponse.
     *
     * @param ERROR_CODE
     */
    public void setERROR_CODE(java.lang.String ERROR_CODE) {
        this.ERROR_CODE = ERROR_CODE;
    }


    /**
     * Gets the ERROR_MSG value for this ShipmentResponse.
     *
     * @return ERROR_MSG
     */
    public java.lang.String getERROR_MSG() {
        return ERROR_MSG;
    }


    /**
     * Sets the ERROR_MSG value for this ShipmentResponse.
     *
     * @param ERROR_MSG
     */
    public void setERROR_MSG(java.lang.String ERROR_MSG) {
        this.ERROR_MSG = ERROR_MSG;
    }


    /**
     * Gets the ALERT_MSG value for this ShipmentResponse.
     *
     * @return ALERT_MSG
     */
    public java.lang.String getALERT_MSG() {
        return ALERT_MSG;
    }


    /**
     * Sets the ALERT_MSG value for this ShipmentResponse.
     *
     * @param ALERT_MSG
     */
    public void setALERT_MSG(java.lang.String ALERT_MSG) {
        this.ALERT_MSG = ALERT_MSG;
    }


    /**
     * Gets the TRACKING_NO value for this ShipmentResponse.
     *
     * @return TRACKING_NO
     */
    public java.lang.String[] getTRACKING_NO() {
        return TRACKING_NO;
    }


    /**
     * Sets the TRACKING_NO value for this ShipmentResponse.
     *
     * @param TRACKING_NO
     */
    public void setTRACKING_NO(java.lang.String[] TRACKING_NO) {
        this.TRACKING_NO = TRACKING_NO;
    }


    /**
     * Gets the ACCOUNT_TOTAL_CHARGE value for this ShipmentResponse.
     *
     * @return ACCOUNT_TOTAL_CHARGE
     */
    public double getACCOUNT_TOTAL_CHARGE() {
        return ACCOUNT_TOTAL_CHARGE;
    }


    /**
     * Sets the ACCOUNT_TOTAL_CHARGE value for this ShipmentResponse.
     *
     * @param ACCOUNT_TOTAL_CHARGE
     */
    public void setACCOUNT_TOTAL_CHARGE(double ACCOUNT_TOTAL_CHARGE) {
        this.ACCOUNT_TOTAL_CHARGE = ACCOUNT_TOTAL_CHARGE;
    }


    /**
     * Gets the LIST_TOTAL_CHARGE value for this ShipmentResponse.
     *
     * @return LIST_TOTAL_CHARGE
     */
    public double getLIST_TOTAL_CHARGE() {
        return LIST_TOTAL_CHARGE;
    }


    /**
     * Sets the LIST_TOTAL_CHARGE value for this ShipmentResponse.
     *
     * @param LIST_TOTAL_CHARGE
     */
    public void setLIST_TOTAL_CHARGE(double LIST_TOTAL_CHARGE) {
        this.LIST_TOTAL_CHARGE = LIST_TOTAL_CHARGE;
    }


    /**
     * Gets the BILL_TOTAL_CHARGE value for this ShipmentResponse.
     *
     * @return BILL_TOTAL_CHARGE
     */
    public double getBILL_TOTAL_CHARGE() {
        return BILL_TOTAL_CHARGE;
    }


    /**
     * Sets the BILL_TOTAL_CHARGE value for this ShipmentResponse.
     *
     * @param BILL_TOTAL_CHARGE
     */
    public void setBILL_TOTAL_CHARGE(double BILL_TOTAL_CHARGE) {
        this.BILL_TOTAL_CHARGE = BILL_TOTAL_CHARGE;
    }


    /**
     * Gets the BILLING_WEIGHT value for this ShipmentResponse.
     *
     * @return BILLING_WEIGHT
     */
    public double[] getBILLING_WEIGHT() {
        return BILLING_WEIGHT;
    }


    /**
     * Sets the BILLING_WEIGHT value for this ShipmentResponse.
     *
     * @param BILLING_WEIGHT
     */
    public void setBILLING_WEIGHT(double[] BILLING_WEIGHT) {
        this.BILLING_WEIGHT = BILLING_WEIGHT;
    }


    /**
     * Gets the DOC_TYPE value for this ShipmentResponse.
     *
     * @return DOC_TYPE
     */
    public java.lang.String[] getDOC_TYPE() {
        return DOC_TYPE;
    }


    /**
     * Sets the DOC_TYPE value for this ShipmentResponse.
     *
     * @param DOC_TYPE
     */
    public void setDOC_TYPE(java.lang.String[] DOC_TYPE) {
        this.DOC_TYPE = DOC_TYPE;
    }


    /**
     * Gets the DOC_DATA value for this ShipmentResponse.
     *
     * @return DOC_DATA
     */
    public java.lang.String[] getDOC_DATA() {
        return DOC_DATA;
    }


    /**
     * Sets the DOC_DATA value for this ShipmentResponse.
     *
     * @param DOC_DATA
     */
    public void setDOC_DATA(java.lang.String[] DOC_DATA) {
        this.DOC_DATA = DOC_DATA;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentResponse)) return false;
        ShipmentResponse other = (ShipmentResponse) obj;
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
              this.ERROR_MSG.equals(other.getERROR_MSG()))) &&
            ((this.ALERT_MSG==null && other.getALERT_MSG()==null) ||
             (this.ALERT_MSG!=null &&
              this.ALERT_MSG.equals(other.getALERT_MSG()))) &&
            ((this.TRACKING_NO==null && other.getTRACKING_NO()==null) ||
             (this.TRACKING_NO!=null &&
              java.util.Arrays.equals(this.TRACKING_NO, other.getTRACKING_NO()))) &&
            this.ACCOUNT_TOTAL_CHARGE == other.getACCOUNT_TOTAL_CHARGE() &&
            this.LIST_TOTAL_CHARGE == other.getLIST_TOTAL_CHARGE() &&
            this.BILL_TOTAL_CHARGE == other.getBILL_TOTAL_CHARGE() &&
            ((this.BILLING_WEIGHT==null && other.getBILLING_WEIGHT()==null) ||
             (this.BILLING_WEIGHT!=null &&
              java.util.Arrays.equals(this.BILLING_WEIGHT, other.getBILLING_WEIGHT()))) &&
            ((this.DOC_TYPE==null && other.getDOC_TYPE()==null) ||
             (this.DOC_TYPE!=null &&
              java.util.Arrays.equals(this.DOC_TYPE, other.getDOC_TYPE()))) &&
            ((this.DOC_DATA==null && other.getDOC_DATA()==null) ||
             (this.DOC_DATA!=null &&
              java.util.Arrays.equals(this.DOC_DATA, other.getDOC_DATA())));
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
        if (getALERT_MSG() != null) {
            _hashCode += getALERT_MSG().hashCode();
        }
        if (getTRACKING_NO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTRACKING_NO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTRACKING_NO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getACCOUNT_TOTAL_CHARGE()).hashCode();
        _hashCode += new Double(getLIST_TOTAL_CHARGE()).hashCode();
        _hashCode += new Double(getBILL_TOTAL_CHARGE()).hashCode();
        if (getBILLING_WEIGHT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBILLING_WEIGHT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBILLING_WEIGHT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDOC_TYPE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDOC_TYPE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDOC_TYPE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDOC_DATA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDOC_DATA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDOC_DATA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // メタデータ型 / [en]-(Type metadata)
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentResponse"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ALERT_MSG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "ALERT_MSG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRACKING_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "TRACKING_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://hitachitransport.com", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCOUNT_TOTAL_CHARGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "ACCOUNT_TOTAL_CHARGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LIST_TOTAL_CHARGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "LIST_TOTAL_CHARGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BILL_TOTAL_CHARGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "BILL_TOTAL_CHARGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BILLING_WEIGHT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "BILLING_WEIGHT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://hitachitransport.com", "double"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOC_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "DOC_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://hitachitransport.com", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOC_DATA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "DOC_DATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://hitachitransport.com", "string"));
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
           @SuppressWarnings("rawtypes")
           java.lang.Class _javaType,
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
           @SuppressWarnings("rawtypes")
           java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

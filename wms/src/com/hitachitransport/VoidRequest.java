/**
 * VoidRequest.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package com.hitachitransport;

public class VoidRequest  implements java.io.Serializable {
    private java.lang.String CLIENT_CD;

    private java.lang.String CNTR_CD;

    private java.lang.String WH_CD;

    private java.lang.String SHIPMENT_NO;

    private java.lang.String CARR_CD;

    private java.lang.String TRACKING_NO;

    private java.lang.String USER_ID;

    private java.lang.String CARR_SERVICE_TYPE_CD;

    private java.lang.String FEDEX_ACCOUNT;

    private java.lang.String FEDEX_METER_NUMBER;

    private java.lang.String ACCOUNT_NO;

    public VoidRequest() {
    }

    public VoidRequest(
           java.lang.String CLIENT_CD,
           java.lang.String CNTR_CD,
           java.lang.String WH_CD,
           java.lang.String SHIPMENT_NO,
           java.lang.String CARR_CD,
           java.lang.String TRACKING_NO,
           java.lang.String USER_ID,
           java.lang.String CARR_SERVICE_TYPE_CD,
           java.lang.String FEDEX_ACCOUNT,
           java.lang.String FEDEX_METER_NUMBER,
           java.lang.String ACCOUNT_NO) {
           this.CLIENT_CD = CLIENT_CD;
           this.CNTR_CD = CNTR_CD;
           this.WH_CD = WH_CD;
           this.SHIPMENT_NO = SHIPMENT_NO;
           this.CARR_CD = CARR_CD;
           this.TRACKING_NO = TRACKING_NO;
           this.USER_ID = USER_ID;
           this.CARR_SERVICE_TYPE_CD = CARR_SERVICE_TYPE_CD;
           this.FEDEX_ACCOUNT = FEDEX_ACCOUNT;
           this.FEDEX_METER_NUMBER = FEDEX_METER_NUMBER;
           this.ACCOUNT_NO = ACCOUNT_NO;
    }


    /**
     * Gets the CLIENT_CD value for this VoidRequest.
     *
     * @return CLIENT_CD
     */
    public java.lang.String getCLIENT_CD() {
        return CLIENT_CD;
    }


    /**
     * Sets the CLIENT_CD value for this VoidRequest.
     *
     * @param CLIENT_CD
     */
    public void setCLIENT_CD(java.lang.String CLIENT_CD) {
        this.CLIENT_CD = CLIENT_CD;
    }


    /**
     * Gets the CNTR_CD value for this VoidRequest.
     *
     * @return CNTR_CD
     */
    public java.lang.String getCNTR_CD() {
        return CNTR_CD;
    }


    /**
     * Sets the CNTR_CD value for this VoidRequest.
     *
     * @param CNTR_CD
     */
    public void setCNTR_CD(java.lang.String CNTR_CD) {
        this.CNTR_CD = CNTR_CD;
    }


    /**
     * Gets the WH_CD value for this VoidRequest.
     *
     * @return WH_CD
     */
    public java.lang.String getWH_CD() {
        return WH_CD;
    }


    /**
     * Sets the WH_CD value for this VoidRequest.
     *
     * @param WH_CD
     */
    public void setWH_CD(java.lang.String WH_CD) {
        this.WH_CD = WH_CD;
    }


    /**
     * Gets the SHIPMENT_NO value for this VoidRequest.
     *
     * @return SHIPMENT_NO
     */
    public java.lang.String getSHIPMENT_NO() {
        return SHIPMENT_NO;
    }


    /**
     * Sets the SHIPMENT_NO value for this VoidRequest.
     *
     * @param SHIPMENT_NO
     */
    public void setSHIPMENT_NO(java.lang.String SHIPMENT_NO) {
        this.SHIPMENT_NO = SHIPMENT_NO;
    }


    /**
     * Gets the CARR_CD value for this VoidRequest.
     *
     * @return CARR_CD
     */
    public java.lang.String getCARR_CD() {
        return CARR_CD;
    }


    /**
     * Sets the CARR_CD value for this VoidRequest.
     *
     * @param CARR_CD
     */
    public void setCARR_CD(java.lang.String CARR_CD) {
        this.CARR_CD = CARR_CD;
    }


    /**
     * Gets the TRACKING_NO value for this VoidRequest.
     *
     * @return TRACKING_NO
     */
    public java.lang.String getTRACKING_NO() {
        return TRACKING_NO;
    }


    /**
     * Sets the TRACKING_NO value for this VoidRequest.
     *
     * @param TRACKING_NO
     */
    public void setTRACKING_NO(java.lang.String TRACKING_NO) {
        this.TRACKING_NO = TRACKING_NO;
    }


    /**
     * Gets the USER_ID value for this VoidRequest.
     *
     * @return USER_ID
     */
    public java.lang.String getUSER_ID() {
        return USER_ID;
    }


    /**
     * Sets the USER_ID value for this VoidRequest.
     *
     * @param USER_ID
     */
    public void setUSER_ID(java.lang.String USER_ID) {
        this.USER_ID = USER_ID;
    }


    /**
     * Gets the CARR_SERVICE_TYPE_CD value for this VoidRequest.
     *
     * @return CARR_SERVICE_TYPE_CD
     */
    public java.lang.String getCARR_SERVICE_TYPE_CD() {
        return CARR_SERVICE_TYPE_CD;
    }


    /**
     * Sets the CARR_SERVICE_TYPE_CD value for this VoidRequest.
     *
     * @param CARR_SERVICE_TYPE_CD
     */
    public void setCARR_SERVICE_TYPE_CD(java.lang.String CARR_SERVICE_TYPE_CD) {
        this.CARR_SERVICE_TYPE_CD = CARR_SERVICE_TYPE_CD;
    }


    /**
     * Gets the FEDEX_ACCOUNT value for this VoidRequest.
     *
     * @return FEDEX_ACCOUNT
     */
    public java.lang.String getFEDEX_ACCOUNT() {
        return FEDEX_ACCOUNT;
    }


    /**
     * Sets the FEDEX_ACCOUNT value for this VoidRequest.
     *
     * @param FEDEX_ACCOUNT
     */
    public void setFEDEX_ACCOUNT(java.lang.String FEDEX_ACCOUNT) {
        this.FEDEX_ACCOUNT = FEDEX_ACCOUNT;
    }


    /**
     * Gets the FEDEX_METER_NUMBER value for this VoidRequest.
     *
     * @return FEDEX_METER_NUMBER
     */
    public java.lang.String getFEDEX_METER_NUMBER() {
        return FEDEX_METER_NUMBER;
    }


    /**
     * Sets the FEDEX_METER_NUMBER value for this VoidRequest.
     *
     * @param FEDEX_METER_NUMBER
     */
    public void setFEDEX_METER_NUMBER(java.lang.String FEDEX_METER_NUMBER) {
        this.FEDEX_METER_NUMBER = FEDEX_METER_NUMBER;
    }


    /**
     * Gets the ACCOUNT_NO value for this VoidRequest.
     *
     * @return ACCOUNT_NO
     */
    public java.lang.String getACCOUNT_NO() {
        return ACCOUNT_NO;
    }


    /**
     * Sets the ACCOUNT_NO value for this VoidRequest.
     *
     * @param ACCOUNT_NO
     */
    public void setACCOUNT_NO(java.lang.String ACCOUNT_NO) {
        this.ACCOUNT_NO = ACCOUNT_NO;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoidRequest)) return false;
        VoidRequest other = (VoidRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.CLIENT_CD==null && other.getCLIENT_CD()==null) ||
             (this.CLIENT_CD!=null &&
              this.CLIENT_CD.equals(other.getCLIENT_CD()))) &&
            ((this.CNTR_CD==null && other.getCNTR_CD()==null) ||
             (this.CNTR_CD!=null &&
              this.CNTR_CD.equals(other.getCNTR_CD()))) &&
            ((this.WH_CD==null && other.getWH_CD()==null) ||
             (this.WH_CD!=null &&
              this.WH_CD.equals(other.getWH_CD()))) &&
            ((this.SHIPMENT_NO==null && other.getSHIPMENT_NO()==null) ||
             (this.SHIPMENT_NO!=null &&
              this.SHIPMENT_NO.equals(other.getSHIPMENT_NO()))) &&
            ((this.CARR_CD==null && other.getCARR_CD()==null) ||
             (this.CARR_CD!=null &&
              this.CARR_CD.equals(other.getCARR_CD()))) &&
            ((this.TRACKING_NO==null && other.getTRACKING_NO()==null) ||
             (this.TRACKING_NO!=null &&
              this.TRACKING_NO.equals(other.getTRACKING_NO()))) &&
            ((this.USER_ID==null && other.getUSER_ID()==null) ||
             (this.USER_ID!=null &&
              this.USER_ID.equals(other.getUSER_ID()))) &&
            ((this.CARR_SERVICE_TYPE_CD==null && other.getCARR_SERVICE_TYPE_CD()==null) ||
             (this.CARR_SERVICE_TYPE_CD!=null &&
              this.CARR_SERVICE_TYPE_CD.equals(other.getCARR_SERVICE_TYPE_CD()))) &&
            ((this.FEDEX_ACCOUNT==null && other.getFEDEX_ACCOUNT()==null) ||
             (this.FEDEX_ACCOUNT!=null &&
              this.FEDEX_ACCOUNT.equals(other.getFEDEX_ACCOUNT()))) &&
            ((this.FEDEX_METER_NUMBER==null && other.getFEDEX_METER_NUMBER()==null) ||
             (this.FEDEX_METER_NUMBER!=null &&
              this.FEDEX_METER_NUMBER.equals(other.getFEDEX_METER_NUMBER()))) &&
            ((this.ACCOUNT_NO==null && other.getACCOUNT_NO()==null) ||
             (this.ACCOUNT_NO!=null &&
              this.ACCOUNT_NO.equals(other.getACCOUNT_NO())));
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
        if (getCLIENT_CD() != null) {
            _hashCode += getCLIENT_CD().hashCode();
        }
        if (getCNTR_CD() != null) {
            _hashCode += getCNTR_CD().hashCode();
        }
        if (getWH_CD() != null) {
            _hashCode += getWH_CD().hashCode();
        }
        if (getSHIPMENT_NO() != null) {
            _hashCode += getSHIPMENT_NO().hashCode();
        }
        if (getCARR_CD() != null) {
            _hashCode += getCARR_CD().hashCode();
        }
        if (getTRACKING_NO() != null) {
            _hashCode += getTRACKING_NO().hashCode();
        }
        if (getUSER_ID() != null) {
            _hashCode += getUSER_ID().hashCode();
        }
        if (getCARR_SERVICE_TYPE_CD() != null) {
            _hashCode += getCARR_SERVICE_TYPE_CD().hashCode();
        }
        if (getFEDEX_ACCOUNT() != null) {
            _hashCode += getFEDEX_ACCOUNT().hashCode();
        }
        if (getFEDEX_METER_NUMBER() != null) {
            _hashCode += getFEDEX_METER_NUMBER().hashCode();
        }
        if (getACCOUNT_NO() != null) {
            _hashCode += getACCOUNT_NO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // メタデータ型 / [en]-(Type metadata)
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoidRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitachitransport.com", "VoidRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLIENT_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "CLIENT_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNTR_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "CNTR_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WH_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "WH_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHIPMENT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHIPMENT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARR_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "CARR_CD"));
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
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USER_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "USER_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARR_SERVICE_TYPE_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "CARR_SERVICE_TYPE_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FEDEX_ACCOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "FEDEX_ACCOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FEDEX_METER_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "FEDEX_METER_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCOUNT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "ACCOUNT_NO"));
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

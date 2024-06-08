/**
 * ShipmentRequestHeader.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package com.hitachitransport;

public class ShipmentRequestHeader  implements java.io.Serializable {
    private java.lang.String CLIENT_CD;

    private java.lang.String CNTR_CD;

    private java.lang.String WH_CD;

    private java.lang.String ACCOUNT_NO;

    private java.lang.String SHIP_DT;

    private java.lang.String COMP_CD;

    private java.lang.String CARR_CD;

    private java.lang.String SERVICE_TYPE;

    private java.lang.String WMS_WORK_NO;

    private java.lang.String ORDER_NO;

    private java.lang.String PO_NO;

    private java.lang.String SHP_FROM_CONTACT_NM;

    private java.lang.String SHP_TO_CD1;

    private java.lang.String SHP_TO_NM1;

    private java.lang.String SHP_TO_NM2;

    private java.lang.String SHP_TO_ADDR1;

    private java.lang.String SHP_TO_ADDR2;

    private java.lang.String SHP_TO_ADDR3;

    private java.lang.String SHP_TO_ADDR4;

    private java.lang.String SHP_TO_CITY;

    private java.lang.String SHP_TO_STATE;

    private java.lang.String SHP_TO_ZIP_CD;

    private java.lang.String SHP_TO_COUNTRY_CD;

    private java.lang.String SHP_TO_TEL_NUM;

    private java.lang.String SHP_TO_FAX_NUM;

    private java.lang.String BILL_PAYMENT_TERM;

    private java.lang.String BILL_COL_ACCOUNT_NO;

    private java.lang.String BILL_COL_ZIP_CD;

    private java.lang.String BILL_COL_COUNTRY_CD;

    private java.lang.String TAX_PAYMENT_TERM;

    private java.lang.String TAX_COL_ACCOUNT_NO;

    private java.lang.String TAX_COL_ZIP_CD;

    private java.lang.String TAX_COL_COUNTRY_CD;

    private java.lang.String COD_PAYMENT_TERM;

    private double COD_AMOUNT;

    private java.lang.String COD_FEE_PAYER;

    private java.lang.String COD_FUND_TYPE;

    private java.lang.String SED_METHOD;

    private java.lang.String ITN_FTSR_NO;

    private java.lang.String TERMS_OF_SALES;

    private java.lang.String HANDLING_UNIT_TYPE;

    private double NUM_OF_HANDLING_UNITS;

    private double DECL_VALUE;

    private java.lang.String EMERGENCY_PHONE_NO;

    private java.lang.String SPECIAL_INSTRUCTION;

    private java.lang.String BROKER_NAME;

    private java.lang.String BROKER_PHONE;

    private java.lang.String BROKER_FAX;

    private java.lang.String SAT_DELIVERY_FLG;

    private java.lang.String RES_DELIVERY_FLG;

    private java.lang.String COD_FLG;

    private java.lang.String SIGN_REQUIRED_FLG;

    private java.lang.String SIGN_RELEASE_FLG;

    private java.lang.String CALL_BEF_FLG;

    private java.lang.String FREEZABLE_FLG;

    private java.lang.String GUARANTEED_FLG;

    private java.lang.String RES_PICK_FLG;

    private java.lang.String NO_STACK_FLG;

    private java.lang.String LMT_DELIVERY_FLG;

    private java.lang.String LMT_PICK_FLG;

    private java.lang.String OVER_SIZED_FLG;

    private java.lang.String POISON_FLG;

    private java.lang.String FOOD_FLG;

    private java.lang.String PPD_LIFT_DELIVERY_FLG;

    private java.lang.String COL_LIFT_DELIVERY_FLG;

    private java.lang.String PPD_LIFT_PICK_FLG;

    private java.lang.String COL_LIFT_PICK_FLG;

    private java.lang.String PPD_INSIDE_DELIVERY_FLG;

    private java.lang.String COL_INSIDE_DELIVERY_FLG;

    private java.lang.String PPD_INSIDE_PICK_FLG;

    private java.lang.String COL_INSIDE_PICK_FLG;

    private java.lang.String REQUEST_USER_ID;

    private java.lang.String INPUT_CLS;

    private java.lang.String TRACKING_NO;

    private double BILL_TOTAL_CHARGE;

    private double BILLING_WEIGHT;

    public ShipmentRequestHeader() {
    }

    public ShipmentRequestHeader(
           java.lang.String CLIENT_CD,
           java.lang.String CNTR_CD,
           java.lang.String WH_CD,
           java.lang.String ACCOUNT_NO,
           java.lang.String SHIP_DT,
           java.lang.String COMP_CD,
           java.lang.String CARR_CD,
           java.lang.String SERVICE_TYPE,
           java.lang.String WMS_WORK_NO,
           java.lang.String ORDER_NO,
           java.lang.String PO_NO,
           java.lang.String SHP_FROM_CONTACT_NM,
           java.lang.String SHP_TO_CD1,
           java.lang.String SHP_TO_NM1,
           java.lang.String SHP_TO_NM2,
           java.lang.String SHP_TO_ADDR1,
           java.lang.String SHP_TO_ADDR2,
           java.lang.String SHP_TO_ADDR3,
           java.lang.String SHP_TO_ADDR4,
           java.lang.String SHP_TO_CITY,
           java.lang.String SHP_TO_STATE,
           java.lang.String SHP_TO_ZIP_CD,
           java.lang.String SHP_TO_COUNTRY_CD,
           java.lang.String SHP_TO_TEL_NUM,
           java.lang.String SHP_TO_FAX_NUM,
           java.lang.String BILL_PAYMENT_TERM,
           java.lang.String BILL_COL_ACCOUNT_NO,
           java.lang.String BILL_COL_ZIP_CD,
           java.lang.String BILL_COL_COUNTRY_CD,
           java.lang.String TAX_PAYMENT_TERM,
           java.lang.String TAX_COL_ACCOUNT_NO,
           java.lang.String TAX_COL_ZIP_CD,
           java.lang.String TAX_COL_COUNTRY_CD,
           java.lang.String COD_PAYMENT_TERM,
           double COD_AMOUNT,
           java.lang.String COD_FEE_PAYER,
           java.lang.String COD_FUND_TYPE,
           java.lang.String SED_METHOD,
           java.lang.String ITN_FTSR_NO,
           java.lang.String TERMS_OF_SALES,
           java.lang.String HANDLING_UNIT_TYPE,
           double NUM_OF_HANDLING_UNITS,
           double DECL_VALUE,
           java.lang.String EMERGENCY_PHONE_NO,
           java.lang.String SPECIAL_INSTRUCTION,
           java.lang.String BROKER_NAME,
           java.lang.String BROKER_PHONE,
           java.lang.String BROKER_FAX,
           java.lang.String SAT_DELIVERY_FLG,
           java.lang.String RES_DELIVERY_FLG,
           java.lang.String COD_FLG,
           java.lang.String SIGN_REQUIRED_FLG,
           java.lang.String SIGN_RELEASE_FLG,
           java.lang.String CALL_BEF_FLG,
           java.lang.String FREEZABLE_FLG,
           java.lang.String GUARANTEED_FLG,
           java.lang.String RES_PICK_FLG,
           java.lang.String NO_STACK_FLG,
           java.lang.String LMT_DELIVERY_FLG,
           java.lang.String LMT_PICK_FLG,
           java.lang.String OVER_SIZED_FLG,
           java.lang.String POISON_FLG,
           java.lang.String FOOD_FLG,
           java.lang.String PPD_LIFT_DELIVERY_FLG,
           java.lang.String COL_LIFT_DELIVERY_FLG,
           java.lang.String PPD_LIFT_PICK_FLG,
           java.lang.String COL_LIFT_PICK_FLG,
           java.lang.String PPD_INSIDE_DELIVERY_FLG,
           java.lang.String COL_INSIDE_DELIVERY_FLG,
           java.lang.String PPD_INSIDE_PICK_FLG,
           java.lang.String COL_INSIDE_PICK_FLG,
           java.lang.String REQUEST_USER_ID,
           java.lang.String INPUT_CLS,
           java.lang.String TRACKING_NO,
           double BILL_TOTAL_CHARGE,
           double BILLING_WEIGHT) {
           this.CLIENT_CD = CLIENT_CD;
           this.CNTR_CD = CNTR_CD;
           this.WH_CD = WH_CD;
           this.ACCOUNT_NO = ACCOUNT_NO;
           this.SHIP_DT = SHIP_DT;
           this.COMP_CD = COMP_CD;
           this.CARR_CD = CARR_CD;
           this.SERVICE_TYPE = SERVICE_TYPE;
           this.WMS_WORK_NO = WMS_WORK_NO;
           this.ORDER_NO = ORDER_NO;
           this.PO_NO = PO_NO;
           this.SHP_FROM_CONTACT_NM = SHP_FROM_CONTACT_NM;
           this.SHP_TO_CD1 = SHP_TO_CD1;
           this.SHP_TO_NM1 = SHP_TO_NM1;
           this.SHP_TO_NM2 = SHP_TO_NM2;
           this.SHP_TO_ADDR1 = SHP_TO_ADDR1;
           this.SHP_TO_ADDR2 = SHP_TO_ADDR2;
           this.SHP_TO_ADDR3 = SHP_TO_ADDR3;
           this.SHP_TO_ADDR4 = SHP_TO_ADDR4;
           this.SHP_TO_CITY = SHP_TO_CITY;
           this.SHP_TO_STATE = SHP_TO_STATE;
           this.SHP_TO_ZIP_CD = SHP_TO_ZIP_CD;
           this.SHP_TO_COUNTRY_CD = SHP_TO_COUNTRY_CD;
           this.SHP_TO_TEL_NUM = SHP_TO_TEL_NUM;
           this.SHP_TO_FAX_NUM = SHP_TO_FAX_NUM;
           this.BILL_PAYMENT_TERM = BILL_PAYMENT_TERM;
           this.BILL_COL_ACCOUNT_NO = BILL_COL_ACCOUNT_NO;
           this.BILL_COL_ZIP_CD = BILL_COL_ZIP_CD;
           this.BILL_COL_COUNTRY_CD = BILL_COL_COUNTRY_CD;
           this.TAX_PAYMENT_TERM = TAX_PAYMENT_TERM;
           this.TAX_COL_ACCOUNT_NO = TAX_COL_ACCOUNT_NO;
           this.TAX_COL_ZIP_CD = TAX_COL_ZIP_CD;
           this.TAX_COL_COUNTRY_CD = TAX_COL_COUNTRY_CD;
           this.COD_PAYMENT_TERM = COD_PAYMENT_TERM;
           this.COD_AMOUNT = COD_AMOUNT;
           this.COD_FEE_PAYER = COD_FEE_PAYER;
           this.COD_FUND_TYPE = COD_FUND_TYPE;
           this.SED_METHOD = SED_METHOD;
           this.ITN_FTSR_NO = ITN_FTSR_NO;
           this.TERMS_OF_SALES = TERMS_OF_SALES;
           this.HANDLING_UNIT_TYPE = HANDLING_UNIT_TYPE;
           this.NUM_OF_HANDLING_UNITS = NUM_OF_HANDLING_UNITS;
           this.DECL_VALUE = DECL_VALUE;
           this.EMERGENCY_PHONE_NO = EMERGENCY_PHONE_NO;
           this.SPECIAL_INSTRUCTION = SPECIAL_INSTRUCTION;
           this.BROKER_NAME = BROKER_NAME;
           this.BROKER_PHONE = BROKER_PHONE;
           this.BROKER_FAX = BROKER_FAX;
           this.SAT_DELIVERY_FLG = SAT_DELIVERY_FLG;
           this.RES_DELIVERY_FLG = RES_DELIVERY_FLG;
           this.COD_FLG = COD_FLG;
           this.SIGN_REQUIRED_FLG = SIGN_REQUIRED_FLG;
           this.SIGN_RELEASE_FLG = SIGN_RELEASE_FLG;
           this.CALL_BEF_FLG = CALL_BEF_FLG;
           this.FREEZABLE_FLG = FREEZABLE_FLG;
           this.GUARANTEED_FLG = GUARANTEED_FLG;
           this.RES_PICK_FLG = RES_PICK_FLG;
           this.NO_STACK_FLG = NO_STACK_FLG;
           this.LMT_DELIVERY_FLG = LMT_DELIVERY_FLG;
           this.LMT_PICK_FLG = LMT_PICK_FLG;
           this.OVER_SIZED_FLG = OVER_SIZED_FLG;
           this.POISON_FLG = POISON_FLG;
           this.FOOD_FLG = FOOD_FLG;
           this.PPD_LIFT_DELIVERY_FLG = PPD_LIFT_DELIVERY_FLG;
           this.COL_LIFT_DELIVERY_FLG = COL_LIFT_DELIVERY_FLG;
           this.PPD_LIFT_PICK_FLG = PPD_LIFT_PICK_FLG;
           this.COL_LIFT_PICK_FLG = COL_LIFT_PICK_FLG;
           this.PPD_INSIDE_DELIVERY_FLG = PPD_INSIDE_DELIVERY_FLG;
           this.COL_INSIDE_DELIVERY_FLG = COL_INSIDE_DELIVERY_FLG;
           this.PPD_INSIDE_PICK_FLG = PPD_INSIDE_PICK_FLG;
           this.COL_INSIDE_PICK_FLG = COL_INSIDE_PICK_FLG;
           this.REQUEST_USER_ID = REQUEST_USER_ID;
           this.INPUT_CLS = INPUT_CLS;
           this.TRACKING_NO = TRACKING_NO;
           this.BILL_TOTAL_CHARGE = BILL_TOTAL_CHARGE;
           this.BILLING_WEIGHT = BILLING_WEIGHT;
    }


    /**
     * Gets the CLIENT_CD value for this ShipmentRequestHeader.
     *
     * @return CLIENT_CD
     */
    public java.lang.String getCLIENT_CD() {
        return CLIENT_CD;
    }


    /**
     * Sets the CLIENT_CD value for this ShipmentRequestHeader.
     *
     * @param CLIENT_CD
     */
    public void setCLIENT_CD(java.lang.String CLIENT_CD) {
        this.CLIENT_CD = CLIENT_CD;
    }


    /**
     * Gets the CNTR_CD value for this ShipmentRequestHeader.
     *
     * @return CNTR_CD
     */
    public java.lang.String getCNTR_CD() {
        return CNTR_CD;
    }


    /**
     * Sets the CNTR_CD value for this ShipmentRequestHeader.
     *
     * @param CNTR_CD
     */
    public void setCNTR_CD(java.lang.String CNTR_CD) {
        this.CNTR_CD = CNTR_CD;
    }


    /**
     * Gets the WH_CD value for this ShipmentRequestHeader.
     *
     * @return WH_CD
     */
    public java.lang.String getWH_CD() {
        return WH_CD;
    }


    /**
     * Sets the WH_CD value for this ShipmentRequestHeader.
     *
     * @param WH_CD
     */
    public void setWH_CD(java.lang.String WH_CD) {
        this.WH_CD = WH_CD;
    }


    /**
     * Gets the ACCOUNT_NO value for this ShipmentRequestHeader.
     *
     * @return ACCOUNT_NO
     */
    public java.lang.String getACCOUNT_NO() {
        return ACCOUNT_NO;
    }


    /**
     * Sets the ACCOUNT_NO value for this ShipmentRequestHeader.
     *
     * @param ACCOUNT_NO
     */
    public void setACCOUNT_NO(java.lang.String ACCOUNT_NO) {
        this.ACCOUNT_NO = ACCOUNT_NO;
    }


    /**
     * Gets the SHIP_DT value for this ShipmentRequestHeader.
     *
     * @return SHIP_DT
     */
    public java.lang.String getSHIP_DT() {
        return SHIP_DT;
    }


    /**
     * Sets the SHIP_DT value for this ShipmentRequestHeader.
     *
     * @param SHIP_DT
     */
    public void setSHIP_DT(java.lang.String SHIP_DT) {
        this.SHIP_DT = SHIP_DT;
    }


    /**
     * Gets the COMP_CD value for this ShipmentRequestHeader.
     *
     * @return COMP_CD
     */
    public java.lang.String getCOMP_CD() {
        return COMP_CD;
    }


    /**
     * Sets the COMP_CD value for this ShipmentRequestHeader.
     *
     * @param COMP_CD
     */
    public void setCOMP_CD(java.lang.String COMP_CD) {
        this.COMP_CD = COMP_CD;
    }


    /**
     * Gets the CARR_CD value for this ShipmentRequestHeader.
     *
     * @return CARR_CD
     */
    public java.lang.String getCARR_CD() {
        return CARR_CD;
    }


    /**
     * Sets the CARR_CD value for this ShipmentRequestHeader.
     *
     * @param CARR_CD
     */
    public void setCARR_CD(java.lang.String CARR_CD) {
        this.CARR_CD = CARR_CD;
    }


    /**
     * Gets the SERVICE_TYPE value for this ShipmentRequestHeader.
     *
     * @return SERVICE_TYPE
     */
    public java.lang.String getSERVICE_TYPE() {
        return SERVICE_TYPE;
    }


    /**
     * Sets the SERVICE_TYPE value for this ShipmentRequestHeader.
     *
     * @param SERVICE_TYPE
     */
    public void setSERVICE_TYPE(java.lang.String SERVICE_TYPE) {
        this.SERVICE_TYPE = SERVICE_TYPE;
    }


    /**
     * Gets the WMS_WORK_NO value for this ShipmentRequestHeader.
     *
     * @return WMS_WORK_NO
     */
    public java.lang.String getWMS_WORK_NO() {
        return WMS_WORK_NO;
    }


    /**
     * Sets the WMS_WORK_NO value for this ShipmentRequestHeader.
     *
     * @param WMS_WORK_NO
     */
    public void setWMS_WORK_NO(java.lang.String WMS_WORK_NO) {
        this.WMS_WORK_NO = WMS_WORK_NO;
    }


    /**
     * Gets the ORDER_NO value for this ShipmentRequestHeader.
     *
     * @return ORDER_NO
     */
    public java.lang.String getORDER_NO() {
        return ORDER_NO;
    }


    /**
     * Sets the ORDER_NO value for this ShipmentRequestHeader.
     *
     * @param ORDER_NO
     */
    public void setORDER_NO(java.lang.String ORDER_NO) {
        this.ORDER_NO = ORDER_NO;
    }


    /**
     * Gets the PO_NO value for this ShipmentRequestHeader.
     *
     * @return PO_NO
     */
    public java.lang.String getPO_NO() {
        return PO_NO;
    }


    /**
     * Sets the PO_NO value for this ShipmentRequestHeader.
     *
     * @param PO_NO
     */
    public void setPO_NO(java.lang.String PO_NO) {
        this.PO_NO = PO_NO;
    }


    /**
     * Gets the SHP_FROM_CONTACT_NM value for this ShipmentRequestHeader.
     *
     * @return SHP_FROM_CONTACT_NM
     */
    public java.lang.String getSHP_FROM_CONTACT_NM() {
        return SHP_FROM_CONTACT_NM;
    }


    /**
     * Sets the SHP_FROM_CONTACT_NM value for this ShipmentRequestHeader.
     *
     * @param SHP_FROM_CONTACT_NM
     */
    public void setSHP_FROM_CONTACT_NM(java.lang.String SHP_FROM_CONTACT_NM) {
        this.SHP_FROM_CONTACT_NM = SHP_FROM_CONTACT_NM;
    }


    /**
     * Gets the SHP_TO_CD1 value for this ShipmentRequestHeader.
     *
     * @return SHP_TO_CD1
     */
    public java.lang.String getSHP_TO_CD1() {
        return SHP_TO_CD1;
    }


    /**
     * Sets the SHP_TO_CD1 value for this ShipmentRequestHeader.
     *
     * @param SHP_TO_CD1
     */
    public void setSHP_TO_CD1(java.lang.String SHP_TO_CD1) {
        this.SHP_TO_CD1 = SHP_TO_CD1;
    }


    /**
     * Gets the SHP_TO_NM1 value for this ShipmentRequestHeader.
     *
     * @return SHP_TO_NM1
     */
    public java.lang.String getSHP_TO_NM1() {
        return SHP_TO_NM1;
    }


    /**
     * Sets the SHP_TO_NM1 value for this ShipmentRequestHeader.
     *
     * @param SHP_TO_NM1
     */
    public void setSHP_TO_NM1(java.lang.String SHP_TO_NM1) {
        this.SHP_TO_NM1 = SHP_TO_NM1;
    }


    /**
     * Gets the SHP_TO_NM2 value for this ShipmentRequestHeader.
     *
     * @return SHP_TO_NM2
     */
    public java.lang.String getSHP_TO_NM2() {
        return SHP_TO_NM2;
    }


    /**
     * Sets the SHP_TO_NM2 value for this ShipmentRequestHeader.
     *
     * @param SHP_TO_NM2
     */
    public void setSHP_TO_NM2(java.lang.String SHP_TO_NM2) {
        this.SHP_TO_NM2 = SHP_TO_NM2;
    }


    /**
     * Gets the SHP_TO_ADDR1 value for this ShipmentRequestHeader.
     *
     * @return SHP_TO_ADDR1
     */
    public java.lang.String getSHP_TO_ADDR1() {
        return SHP_TO_ADDR1;
    }


    /**
     * Sets the SHP_TO_ADDR1 value for this ShipmentRequestHeader.
     *
     * @param SHP_TO_ADDR1
     */
    public void setSHP_TO_ADDR1(java.lang.String SHP_TO_ADDR1) {
        this.SHP_TO_ADDR1 = SHP_TO_ADDR1;
    }


    /**
     * Gets the SHP_TO_ADDR2 value for this ShipmentRequestHeader.
     *
     * @return SHP_TO_ADDR2
     */
    public java.lang.String getSHP_TO_ADDR2() {
        return SHP_TO_ADDR2;
    }


    /**
     * Sets the SHP_TO_ADDR2 value for this ShipmentRequestHeader.
     *
     * @param SHP_TO_ADDR2
     */
    public void setSHP_TO_ADDR2(java.lang.String SHP_TO_ADDR2) {
        this.SHP_TO_ADDR2 = SHP_TO_ADDR2;
    }


    /**
     * Gets the SHP_TO_ADDR3 value for this ShipmentRequestHeader.
     *
     * @return SHP_TO_ADDR3
     */
    public java.lang.String getSHP_TO_ADDR3() {
        return SHP_TO_ADDR3;
    }


    /**
     * Sets the SHP_TO_ADDR3 value for this ShipmentRequestHeader.
     *
     * @param SHP_TO_ADDR3
     */
    public void setSHP_TO_ADDR3(java.lang.String SHP_TO_ADDR3) {
        this.SHP_TO_ADDR3 = SHP_TO_ADDR3;
    }


    /**
     * Gets the SHP_TO_ADDR4 value for this ShipmentRequestHeader.
     *
     * @return SHP_TO_ADDR4
     */
    public java.lang.String getSHP_TO_ADDR4() {
        return SHP_TO_ADDR4;
    }


    /**
     * Sets the SHP_TO_ADDR4 value for this ShipmentRequestHeader.
     *
     * @param SHP_TO_ADDR4
     */
    public void setSHP_TO_ADDR4(java.lang.String SHP_TO_ADDR4) {
        this.SHP_TO_ADDR4 = SHP_TO_ADDR4;
    }


    /**
     * Gets the SHP_TO_CITY value for this ShipmentRequestHeader.
     *
     * @return SHP_TO_CITY
     */
    public java.lang.String getSHP_TO_CITY() {
        return SHP_TO_CITY;
    }


    /**
     * Sets the SHP_TO_CITY value for this ShipmentRequestHeader.
     *
     * @param SHP_TO_CITY
     */
    public void setSHP_TO_CITY(java.lang.String SHP_TO_CITY) {
        this.SHP_TO_CITY = SHP_TO_CITY;
    }


    /**
     * Gets the SHP_TO_STATE value for this ShipmentRequestHeader.
     *
     * @return SHP_TO_STATE
     */
    public java.lang.String getSHP_TO_STATE() {
        return SHP_TO_STATE;
    }


    /**
     * Sets the SHP_TO_STATE value for this ShipmentRequestHeader.
     *
     * @param SHP_TO_STATE
     */
    public void setSHP_TO_STATE(java.lang.String SHP_TO_STATE) {
        this.SHP_TO_STATE = SHP_TO_STATE;
    }


    /**
     * Gets the SHP_TO_ZIP_CD value for this ShipmentRequestHeader.
     *
     * @return SHP_TO_ZIP_CD
     */
    public java.lang.String getSHP_TO_ZIP_CD() {
        return SHP_TO_ZIP_CD;
    }


    /**
     * Sets the SHP_TO_ZIP_CD value for this ShipmentRequestHeader.
     *
     * @param SHP_TO_ZIP_CD
     */
    public void setSHP_TO_ZIP_CD(java.lang.String SHP_TO_ZIP_CD) {
        this.SHP_TO_ZIP_CD = SHP_TO_ZIP_CD;
    }


    /**
     * Gets the SHP_TO_COUNTRY_CD value for this ShipmentRequestHeader.
     *
     * @return SHP_TO_COUNTRY_CD
     */
    public java.lang.String getSHP_TO_COUNTRY_CD() {
        return SHP_TO_COUNTRY_CD;
    }


    /**
     * Sets the SHP_TO_COUNTRY_CD value for this ShipmentRequestHeader.
     *
     * @param SHP_TO_COUNTRY_CD
     */
    public void setSHP_TO_COUNTRY_CD(java.lang.String SHP_TO_COUNTRY_CD) {
        this.SHP_TO_COUNTRY_CD = SHP_TO_COUNTRY_CD;
    }


    /**
     * Gets the SHP_TO_TEL_NUM value for this ShipmentRequestHeader.
     *
     * @return SHP_TO_TEL_NUM
     */
    public java.lang.String getSHP_TO_TEL_NUM() {
        return SHP_TO_TEL_NUM;
    }


    /**
     * Sets the SHP_TO_TEL_NUM value for this ShipmentRequestHeader.
     *
     * @param SHP_TO_TEL_NUM
     */
    public void setSHP_TO_TEL_NUM(java.lang.String SHP_TO_TEL_NUM) {
        this.SHP_TO_TEL_NUM = SHP_TO_TEL_NUM;
    }


    /**
     * Gets the SHP_TO_FAX_NUM value for this ShipmentRequestHeader.
     *
     * @return SHP_TO_FAX_NUM
     */
    public java.lang.String getSHP_TO_FAX_NUM() {
        return SHP_TO_FAX_NUM;
    }


    /**
     * Sets the SHP_TO_FAX_NUM value for this ShipmentRequestHeader.
     *
     * @param SHP_TO_FAX_NUM
     */
    public void setSHP_TO_FAX_NUM(java.lang.String SHP_TO_FAX_NUM) {
        this.SHP_TO_FAX_NUM = SHP_TO_FAX_NUM;
    }


    /**
     * Gets the BILL_PAYMENT_TERM value for this ShipmentRequestHeader.
     *
     * @return BILL_PAYMENT_TERM
     */
    public java.lang.String getBILL_PAYMENT_TERM() {
        return BILL_PAYMENT_TERM;
    }


    /**
     * Sets the BILL_PAYMENT_TERM value for this ShipmentRequestHeader.
     *
     * @param BILL_PAYMENT_TERM
     */
    public void setBILL_PAYMENT_TERM(java.lang.String BILL_PAYMENT_TERM) {
        this.BILL_PAYMENT_TERM = BILL_PAYMENT_TERM;
    }


    /**
     * Gets the BILL_COL_ACCOUNT_NO value for this ShipmentRequestHeader.
     *
     * @return BILL_COL_ACCOUNT_NO
     */
    public java.lang.String getBILL_COL_ACCOUNT_NO() {
        return BILL_COL_ACCOUNT_NO;
    }


    /**
     * Sets the BILL_COL_ACCOUNT_NO value for this ShipmentRequestHeader.
     *
     * @param BILL_COL_ACCOUNT_NO
     */
    public void setBILL_COL_ACCOUNT_NO(java.lang.String BILL_COL_ACCOUNT_NO) {
        this.BILL_COL_ACCOUNT_NO = BILL_COL_ACCOUNT_NO;
    }


    /**
     * Gets the BILL_COL_ZIP_CD value for this ShipmentRequestHeader.
     *
     * @return BILL_COL_ZIP_CD
     */
    public java.lang.String getBILL_COL_ZIP_CD() {
        return BILL_COL_ZIP_CD;
    }


    /**
     * Sets the BILL_COL_ZIP_CD value for this ShipmentRequestHeader.
     *
     * @param BILL_COL_ZIP_CD
     */
    public void setBILL_COL_ZIP_CD(java.lang.String BILL_COL_ZIP_CD) {
        this.BILL_COL_ZIP_CD = BILL_COL_ZIP_CD;
    }


    /**
     * Gets the BILL_COL_COUNTRY_CD value for this ShipmentRequestHeader.
     *
     * @return BILL_COL_COUNTRY_CD
     */
    public java.lang.String getBILL_COL_COUNTRY_CD() {
        return BILL_COL_COUNTRY_CD;
    }


    /**
     * Sets the BILL_COL_COUNTRY_CD value for this ShipmentRequestHeader.
     *
     * @param BILL_COL_COUNTRY_CD
     */
    public void setBILL_COL_COUNTRY_CD(java.lang.String BILL_COL_COUNTRY_CD) {
        this.BILL_COL_COUNTRY_CD = BILL_COL_COUNTRY_CD;
    }


    /**
     * Gets the TAX_PAYMENT_TERM value for this ShipmentRequestHeader.
     *
     * @return TAX_PAYMENT_TERM
     */
    public java.lang.String getTAX_PAYMENT_TERM() {
        return TAX_PAYMENT_TERM;
    }


    /**
     * Sets the TAX_PAYMENT_TERM value for this ShipmentRequestHeader.
     *
     * @param TAX_PAYMENT_TERM
     */
    public void setTAX_PAYMENT_TERM(java.lang.String TAX_PAYMENT_TERM) {
        this.TAX_PAYMENT_TERM = TAX_PAYMENT_TERM;
    }


    /**
     * Gets the TAX_COL_ACCOUNT_NO value for this ShipmentRequestHeader.
     *
     * @return TAX_COL_ACCOUNT_NO
     */
    public java.lang.String getTAX_COL_ACCOUNT_NO() {
        return TAX_COL_ACCOUNT_NO;
    }


    /**
     * Sets the TAX_COL_ACCOUNT_NO value for this ShipmentRequestHeader.
     *
     * @param TAX_COL_ACCOUNT_NO
     */
    public void setTAX_COL_ACCOUNT_NO(java.lang.String TAX_COL_ACCOUNT_NO) {
        this.TAX_COL_ACCOUNT_NO = TAX_COL_ACCOUNT_NO;
    }


    /**
     * Gets the TAX_COL_ZIP_CD value for this ShipmentRequestHeader.
     *
     * @return TAX_COL_ZIP_CD
     */
    public java.lang.String getTAX_COL_ZIP_CD() {
        return TAX_COL_ZIP_CD;
    }


    /**
     * Sets the TAX_COL_ZIP_CD value for this ShipmentRequestHeader.
     *
     * @param TAX_COL_ZIP_CD
     */
    public void setTAX_COL_ZIP_CD(java.lang.String TAX_COL_ZIP_CD) {
        this.TAX_COL_ZIP_CD = TAX_COL_ZIP_CD;
    }


    /**
     * Gets the TAX_COL_COUNTRY_CD value for this ShipmentRequestHeader.
     *
     * @return TAX_COL_COUNTRY_CD
     */
    public java.lang.String getTAX_COL_COUNTRY_CD() {
        return TAX_COL_COUNTRY_CD;
    }


    /**
     * Sets the TAX_COL_COUNTRY_CD value for this ShipmentRequestHeader.
     *
     * @param TAX_COL_COUNTRY_CD
     */
    public void setTAX_COL_COUNTRY_CD(java.lang.String TAX_COL_COUNTRY_CD) {
        this.TAX_COL_COUNTRY_CD = TAX_COL_COUNTRY_CD;
    }


    /**
     * Gets the COD_PAYMENT_TERM value for this ShipmentRequestHeader.
     *
     * @return COD_PAYMENT_TERM
     */
    public java.lang.String getCOD_PAYMENT_TERM() {
        return COD_PAYMENT_TERM;
    }


    /**
     * Sets the COD_PAYMENT_TERM value for this ShipmentRequestHeader.
     *
     * @param COD_PAYMENT_TERM
     */
    public void setCOD_PAYMENT_TERM(java.lang.String COD_PAYMENT_TERM) {
        this.COD_PAYMENT_TERM = COD_PAYMENT_TERM;
    }


    /**
     * Gets the COD_AMOUNT value for this ShipmentRequestHeader.
     *
     * @return COD_AMOUNT
     */
    public double getCOD_AMOUNT() {
        return COD_AMOUNT;
    }


    /**
     * Sets the COD_AMOUNT value for this ShipmentRequestHeader.
     *
     * @param COD_AMOUNT
     */
    public void setCOD_AMOUNT(double COD_AMOUNT) {
        this.COD_AMOUNT = COD_AMOUNT;
    }


    /**
     * Gets the COD_FEE_PAYER value for this ShipmentRequestHeader.
     *
     * @return COD_FEE_PAYER
     */
    public java.lang.String getCOD_FEE_PAYER() {
        return COD_FEE_PAYER;
    }


    /**
     * Sets the COD_FEE_PAYER value for this ShipmentRequestHeader.
     *
     * @param COD_FEE_PAYER
     */
    public void setCOD_FEE_PAYER(java.lang.String COD_FEE_PAYER) {
        this.COD_FEE_PAYER = COD_FEE_PAYER;
    }


    /**
     * Gets the COD_FUND_TYPE value for this ShipmentRequestHeader.
     *
     * @return COD_FUND_TYPE
     */
    public java.lang.String getCOD_FUND_TYPE() {
        return COD_FUND_TYPE;
    }


    /**
     * Sets the COD_FUND_TYPE value for this ShipmentRequestHeader.
     *
     * @param COD_FUND_TYPE
     */
    public void setCOD_FUND_TYPE(java.lang.String COD_FUND_TYPE) {
        this.COD_FUND_TYPE = COD_FUND_TYPE;
    }


    /**
     * Gets the SED_METHOD value for this ShipmentRequestHeader.
     *
     * @return SED_METHOD
     */
    public java.lang.String getSED_METHOD() {
        return SED_METHOD;
    }


    /**
     * Sets the SED_METHOD value for this ShipmentRequestHeader.
     *
     * @param SED_METHOD
     */
    public void setSED_METHOD(java.lang.String SED_METHOD) {
        this.SED_METHOD = SED_METHOD;
    }


    /**
     * Gets the ITN_FTSR_NO value for this ShipmentRequestHeader.
     *
     * @return ITN_FTSR_NO
     */
    public java.lang.String getITN_FTSR_NO() {
        return ITN_FTSR_NO;
    }


    /**
     * Sets the ITN_FTSR_NO value for this ShipmentRequestHeader.
     *
     * @param ITN_FTSR_NO
     */
    public void setITN_FTSR_NO(java.lang.String ITN_FTSR_NO) {
        this.ITN_FTSR_NO = ITN_FTSR_NO;
    }


    /**
     * Gets the TERMS_OF_SALES value for this ShipmentRequestHeader.
     *
     * @return TERMS_OF_SALES
     */
    public java.lang.String getTERMS_OF_SALES() {
        return TERMS_OF_SALES;
    }


    /**
     * Sets the TERMS_OF_SALES value for this ShipmentRequestHeader.
     *
     * @param TERMS_OF_SALES
     */
    public void setTERMS_OF_SALES(java.lang.String TERMS_OF_SALES) {
        this.TERMS_OF_SALES = TERMS_OF_SALES;
    }


    /**
     * Gets the HANDLING_UNIT_TYPE value for this ShipmentRequestHeader.
     *
     * @return HANDLING_UNIT_TYPE
     */
    public java.lang.String getHANDLING_UNIT_TYPE() {
        return HANDLING_UNIT_TYPE;
    }


    /**
     * Sets the HANDLING_UNIT_TYPE value for this ShipmentRequestHeader.
     *
     * @param HANDLING_UNIT_TYPE
     */
    public void setHANDLING_UNIT_TYPE(java.lang.String HANDLING_UNIT_TYPE) {
        this.HANDLING_UNIT_TYPE = HANDLING_UNIT_TYPE;
    }


    /**
     * Gets the NUM_OF_HANDLING_UNITS value for this ShipmentRequestHeader.
     *
     * @return NUM_OF_HANDLING_UNITS
     */
    public double getNUM_OF_HANDLING_UNITS() {
        return NUM_OF_HANDLING_UNITS;
    }


    /**
     * Sets the NUM_OF_HANDLING_UNITS value for this ShipmentRequestHeader.
     *
     * @param NUM_OF_HANDLING_UNITS
     */
    public void setNUM_OF_HANDLING_UNITS(double NUM_OF_HANDLING_UNITS) {
        this.NUM_OF_HANDLING_UNITS = NUM_OF_HANDLING_UNITS;
    }


    /**
     * Gets the DECL_VALUE value for this ShipmentRequestHeader.
     *
     * @return DECL_VALUE
     */
    public double getDECL_VALUE() {
        return DECL_VALUE;
    }


    /**
     * Sets the DECL_VALUE value for this ShipmentRequestHeader.
     *
     * @param DECL_VALUE
     */
    public void setDECL_VALUE(double DECL_VALUE) {
        this.DECL_VALUE = DECL_VALUE;
    }


    /**
     * Gets the EMERGENCY_PHONE_NO value for this ShipmentRequestHeader.
     *
     * @return EMERGENCY_PHONE_NO
     */
    public java.lang.String getEMERGENCY_PHONE_NO() {
        return EMERGENCY_PHONE_NO;
    }


    /**
     * Sets the EMERGENCY_PHONE_NO value for this ShipmentRequestHeader.
     *
     * @param EMERGENCY_PHONE_NO
     */
    public void setEMERGENCY_PHONE_NO(java.lang.String EMERGENCY_PHONE_NO) {
        this.EMERGENCY_PHONE_NO = EMERGENCY_PHONE_NO;
    }


    /**
     * Gets the SPECIAL_INSTRUCTION value for this ShipmentRequestHeader.
     *
     * @return SPECIAL_INSTRUCTION
     */
    public java.lang.String getSPECIAL_INSTRUCTION() {
        return SPECIAL_INSTRUCTION;
    }


    /**
     * Sets the SPECIAL_INSTRUCTION value for this ShipmentRequestHeader.
     *
     * @param SPECIAL_INSTRUCTION
     */
    public void setSPECIAL_INSTRUCTION(java.lang.String SPECIAL_INSTRUCTION) {
        this.SPECIAL_INSTRUCTION = SPECIAL_INSTRUCTION;
    }


    /**
     * Gets the BROKER_NAME value for this ShipmentRequestHeader.
     *
     * @return BROKER_NAME
     */
    public java.lang.String getBROKER_NAME() {
        return BROKER_NAME;
    }


    /**
     * Sets the BROKER_NAME value for this ShipmentRequestHeader.
     *
     * @param BROKER_NAME
     */
    public void setBROKER_NAME(java.lang.String BROKER_NAME) {
        this.BROKER_NAME = BROKER_NAME;
    }


    /**
     * Gets the BROKER_PHONE value for this ShipmentRequestHeader.
     *
     * @return BROKER_PHONE
     */
    public java.lang.String getBROKER_PHONE() {
        return BROKER_PHONE;
    }


    /**
     * Sets the BROKER_PHONE value for this ShipmentRequestHeader.
     *
     * @param BROKER_PHONE
     */
    public void setBROKER_PHONE(java.lang.String BROKER_PHONE) {
        this.BROKER_PHONE = BROKER_PHONE;
    }


    /**
     * Gets the BROKER_FAX value for this ShipmentRequestHeader.
     *
     * @return BROKER_FAX
     */
    public java.lang.String getBROKER_FAX() {
        return BROKER_FAX;
    }


    /**
     * Sets the BROKER_FAX value for this ShipmentRequestHeader.
     *
     * @param BROKER_FAX
     */
    public void setBROKER_FAX(java.lang.String BROKER_FAX) {
        this.BROKER_FAX = BROKER_FAX;
    }


    /**
     * Gets the SAT_DELIVERY_FLG value for this ShipmentRequestHeader.
     *
     * @return SAT_DELIVERY_FLG
     */
    public java.lang.String getSAT_DELIVERY_FLG() {
        return SAT_DELIVERY_FLG;
    }


    /**
     * Sets the SAT_DELIVERY_FLG value for this ShipmentRequestHeader.
     *
     * @param SAT_DELIVERY_FLG
     */
    public void setSAT_DELIVERY_FLG(java.lang.String SAT_DELIVERY_FLG) {
        this.SAT_DELIVERY_FLG = SAT_DELIVERY_FLG;
    }


    /**
     * Gets the RES_DELIVERY_FLG value for this ShipmentRequestHeader.
     *
     * @return RES_DELIVERY_FLG
     */
    public java.lang.String getRES_DELIVERY_FLG() {
        return RES_DELIVERY_FLG;
    }


    /**
     * Sets the RES_DELIVERY_FLG value for this ShipmentRequestHeader.
     *
     * @param RES_DELIVERY_FLG
     */
    public void setRES_DELIVERY_FLG(java.lang.String RES_DELIVERY_FLG) {
        this.RES_DELIVERY_FLG = RES_DELIVERY_FLG;
    }


    /**
     * Gets the COD_FLG value for this ShipmentRequestHeader.
     *
     * @return COD_FLG
     */
    public java.lang.String getCOD_FLG() {
        return COD_FLG;
    }


    /**
     * Sets the COD_FLG value for this ShipmentRequestHeader.
     *
     * @param COD_FLG
     */
    public void setCOD_FLG(java.lang.String COD_FLG) {
        this.COD_FLG = COD_FLG;
    }


    /**
     * Gets the SIGN_REQUIRED_FLG value for this ShipmentRequestHeader.
     *
     * @return SIGN_REQUIRED_FLG
     */
    public java.lang.String getSIGN_REQUIRED_FLG() {
        return SIGN_REQUIRED_FLG;
    }


    /**
     * Sets the SIGN_REQUIRED_FLG value for this ShipmentRequestHeader.
     *
     * @param SIGN_REQUIRED_FLG
     */
    public void setSIGN_REQUIRED_FLG(java.lang.String SIGN_REQUIRED_FLG) {
        this.SIGN_REQUIRED_FLG = SIGN_REQUIRED_FLG;
    }


    /**
     * Gets the SIGN_RELEASE_FLG value for this ShipmentRequestHeader.
     *
     * @return SIGN_RELEASE_FLG
     */
    public java.lang.String getSIGN_RELEASE_FLG() {
        return SIGN_RELEASE_FLG;
    }


    /**
     * Sets the SIGN_RELEASE_FLG value for this ShipmentRequestHeader.
     *
     * @param SIGN_RELEASE_FLG
     */
    public void setSIGN_RELEASE_FLG(java.lang.String SIGN_RELEASE_FLG) {
        this.SIGN_RELEASE_FLG = SIGN_RELEASE_FLG;
    }


    /**
     * Gets the CALL_BEF_FLG value for this ShipmentRequestHeader.
     *
     * @return CALL_BEF_FLG
     */
    public java.lang.String getCALL_BEF_FLG() {
        return CALL_BEF_FLG;
    }


    /**
     * Sets the CALL_BEF_FLG value for this ShipmentRequestHeader.
     *
     * @param CALL_BEF_FLG
     */
    public void setCALL_BEF_FLG(java.lang.String CALL_BEF_FLG) {
        this.CALL_BEF_FLG = CALL_BEF_FLG;
    }


    /**
     * Gets the FREEZABLE_FLG value for this ShipmentRequestHeader.
     *
     * @return FREEZABLE_FLG
     */
    public java.lang.String getFREEZABLE_FLG() {
        return FREEZABLE_FLG;
    }


    /**
     * Sets the FREEZABLE_FLG value for this ShipmentRequestHeader.
     *
     * @param FREEZABLE_FLG
     */
    public void setFREEZABLE_FLG(java.lang.String FREEZABLE_FLG) {
        this.FREEZABLE_FLG = FREEZABLE_FLG;
    }


    /**
     * Gets the GUARANTEED_FLG value for this ShipmentRequestHeader.
     *
     * @return GUARANTEED_FLG
     */
    public java.lang.String getGUARANTEED_FLG() {
        return GUARANTEED_FLG;
    }


    /**
     * Sets the GUARANTEED_FLG value for this ShipmentRequestHeader.
     *
     * @param GUARANTEED_FLG
     */
    public void setGUARANTEED_FLG(java.lang.String GUARANTEED_FLG) {
        this.GUARANTEED_FLG = GUARANTEED_FLG;
    }


    /**
     * Gets the RES_PICK_FLG value for this ShipmentRequestHeader.
     *
     * @return RES_PICK_FLG
     */
    public java.lang.String getRES_PICK_FLG() {
        return RES_PICK_FLG;
    }


    /**
     * Sets the RES_PICK_FLG value for this ShipmentRequestHeader.
     *
     * @param RES_PICK_FLG
     */
    public void setRES_PICK_FLG(java.lang.String RES_PICK_FLG) {
        this.RES_PICK_FLG = RES_PICK_FLG;
    }


    /**
     * Gets the NO_STACK_FLG value for this ShipmentRequestHeader.
     *
     * @return NO_STACK_FLG
     */
    public java.lang.String getNO_STACK_FLG() {
        return NO_STACK_FLG;
    }


    /**
     * Sets the NO_STACK_FLG value for this ShipmentRequestHeader.
     *
     * @param NO_STACK_FLG
     */
    public void setNO_STACK_FLG(java.lang.String NO_STACK_FLG) {
        this.NO_STACK_FLG = NO_STACK_FLG;
    }


    /**
     * Gets the LMT_DELIVERY_FLG value for this ShipmentRequestHeader.
     *
     * @return LMT_DELIVERY_FLG
     */
    public java.lang.String getLMT_DELIVERY_FLG() {
        return LMT_DELIVERY_FLG;
    }


    /**
     * Sets the LMT_DELIVERY_FLG value for this ShipmentRequestHeader.
     *
     * @param LMT_DELIVERY_FLG
     */
    public void setLMT_DELIVERY_FLG(java.lang.String LMT_DELIVERY_FLG) {
        this.LMT_DELIVERY_FLG = LMT_DELIVERY_FLG;
    }


    /**
     * Gets the LMT_PICK_FLG value for this ShipmentRequestHeader.
     *
     * @return LMT_PICK_FLG
     */
    public java.lang.String getLMT_PICK_FLG() {
        return LMT_PICK_FLG;
    }


    /**
     * Sets the LMT_PICK_FLG value for this ShipmentRequestHeader.
     *
     * @param LMT_PICK_FLG
     */
    public void setLMT_PICK_FLG(java.lang.String LMT_PICK_FLG) {
        this.LMT_PICK_FLG = LMT_PICK_FLG;
    }


    /**
     * Gets the OVER_SIZED_FLG value for this ShipmentRequestHeader.
     *
     * @return OVER_SIZED_FLG
     */
    public java.lang.String getOVER_SIZED_FLG() {
        return OVER_SIZED_FLG;
    }


    /**
     * Sets the OVER_SIZED_FLG value for this ShipmentRequestHeader.
     *
     * @param OVER_SIZED_FLG
     */
    public void setOVER_SIZED_FLG(java.lang.String OVER_SIZED_FLG) {
        this.OVER_SIZED_FLG = OVER_SIZED_FLG;
    }


    /**
     * Gets the POISON_FLG value for this ShipmentRequestHeader.
     *
     * @return POISON_FLG
     */
    public java.lang.String getPOISON_FLG() {
        return POISON_FLG;
    }


    /**
     * Sets the POISON_FLG value for this ShipmentRequestHeader.
     *
     * @param POISON_FLG
     */
    public void setPOISON_FLG(java.lang.String POISON_FLG) {
        this.POISON_FLG = POISON_FLG;
    }


    /**
     * Gets the FOOD_FLG value for this ShipmentRequestHeader.
     *
     * @return FOOD_FLG
     */
    public java.lang.String getFOOD_FLG() {
        return FOOD_FLG;
    }


    /**
     * Sets the FOOD_FLG value for this ShipmentRequestHeader.
     *
     * @param FOOD_FLG
     */
    public void setFOOD_FLG(java.lang.String FOOD_FLG) {
        this.FOOD_FLG = FOOD_FLG;
    }


    /**
     * Gets the PPD_LIFT_DELIVERY_FLG value for this ShipmentRequestHeader.
     *
     * @return PPD_LIFT_DELIVERY_FLG
     */
    public java.lang.String getPPD_LIFT_DELIVERY_FLG() {
        return PPD_LIFT_DELIVERY_FLG;
    }


    /**
     * Sets the PPD_LIFT_DELIVERY_FLG value for this ShipmentRequestHeader.
     *
     * @param PPD_LIFT_DELIVERY_FLG
     */
    public void setPPD_LIFT_DELIVERY_FLG(java.lang.String PPD_LIFT_DELIVERY_FLG) {
        this.PPD_LIFT_DELIVERY_FLG = PPD_LIFT_DELIVERY_FLG;
    }


    /**
     * Gets the COL_LIFT_DELIVERY_FLG value for this ShipmentRequestHeader.
     *
     * @return COL_LIFT_DELIVERY_FLG
     */
    public java.lang.String getCOL_LIFT_DELIVERY_FLG() {
        return COL_LIFT_DELIVERY_FLG;
    }


    /**
     * Sets the COL_LIFT_DELIVERY_FLG value for this ShipmentRequestHeader.
     *
     * @param COL_LIFT_DELIVERY_FLG
     */
    public void setCOL_LIFT_DELIVERY_FLG(java.lang.String COL_LIFT_DELIVERY_FLG) {
        this.COL_LIFT_DELIVERY_FLG = COL_LIFT_DELIVERY_FLG;
    }


    /**
     * Gets the PPD_LIFT_PICK_FLG value for this ShipmentRequestHeader.
     *
     * @return PPD_LIFT_PICK_FLG
     */
    public java.lang.String getPPD_LIFT_PICK_FLG() {
        return PPD_LIFT_PICK_FLG;
    }


    /**
     * Sets the PPD_LIFT_PICK_FLG value for this ShipmentRequestHeader.
     *
     * @param PPD_LIFT_PICK_FLG
     */
    public void setPPD_LIFT_PICK_FLG(java.lang.String PPD_LIFT_PICK_FLG) {
        this.PPD_LIFT_PICK_FLG = PPD_LIFT_PICK_FLG;
    }


    /**
     * Gets the COL_LIFT_PICK_FLG value for this ShipmentRequestHeader.
     *
     * @return COL_LIFT_PICK_FLG
     */
    public java.lang.String getCOL_LIFT_PICK_FLG() {
        return COL_LIFT_PICK_FLG;
    }


    /**
     * Sets the COL_LIFT_PICK_FLG value for this ShipmentRequestHeader.
     *
     * @param COL_LIFT_PICK_FLG
     */
    public void setCOL_LIFT_PICK_FLG(java.lang.String COL_LIFT_PICK_FLG) {
        this.COL_LIFT_PICK_FLG = COL_LIFT_PICK_FLG;
    }


    /**
     * Gets the PPD_INSIDE_DELIVERY_FLG value for this ShipmentRequestHeader.
     *
     * @return PPD_INSIDE_DELIVERY_FLG
     */
    public java.lang.String getPPD_INSIDE_DELIVERY_FLG() {
        return PPD_INSIDE_DELIVERY_FLG;
    }


    /**
     * Sets the PPD_INSIDE_DELIVERY_FLG value for this ShipmentRequestHeader.
     *
     * @param PPD_INSIDE_DELIVERY_FLG
     */
    public void setPPD_INSIDE_DELIVERY_FLG(java.lang.String PPD_INSIDE_DELIVERY_FLG) {
        this.PPD_INSIDE_DELIVERY_FLG = PPD_INSIDE_DELIVERY_FLG;
    }


    /**
     * Gets the COL_INSIDE_DELIVERY_FLG value for this ShipmentRequestHeader.
     *
     * @return COL_INSIDE_DELIVERY_FLG
     */
    public java.lang.String getCOL_INSIDE_DELIVERY_FLG() {
        return COL_INSIDE_DELIVERY_FLG;
    }


    /**
     * Sets the COL_INSIDE_DELIVERY_FLG value for this ShipmentRequestHeader.
     *
     * @param COL_INSIDE_DELIVERY_FLG
     */
    public void setCOL_INSIDE_DELIVERY_FLG(java.lang.String COL_INSIDE_DELIVERY_FLG) {
        this.COL_INSIDE_DELIVERY_FLG = COL_INSIDE_DELIVERY_FLG;
    }


    /**
     * Gets the PPD_INSIDE_PICK_FLG value for this ShipmentRequestHeader.
     *
     * @return PPD_INSIDE_PICK_FLG
     */
    public java.lang.String getPPD_INSIDE_PICK_FLG() {
        return PPD_INSIDE_PICK_FLG;
    }


    /**
     * Sets the PPD_INSIDE_PICK_FLG value for this ShipmentRequestHeader.
     *
     * @param PPD_INSIDE_PICK_FLG
     */
    public void setPPD_INSIDE_PICK_FLG(java.lang.String PPD_INSIDE_PICK_FLG) {
        this.PPD_INSIDE_PICK_FLG = PPD_INSIDE_PICK_FLG;
    }


    /**
     * Gets the COL_INSIDE_PICK_FLG value for this ShipmentRequestHeader.
     *
     * @return COL_INSIDE_PICK_FLG
     */
    public java.lang.String getCOL_INSIDE_PICK_FLG() {
        return COL_INSIDE_PICK_FLG;
    }


    /**
     * Sets the COL_INSIDE_PICK_FLG value for this ShipmentRequestHeader.
     *
     * @param COL_INSIDE_PICK_FLG
     */
    public void setCOL_INSIDE_PICK_FLG(java.lang.String COL_INSIDE_PICK_FLG) {
        this.COL_INSIDE_PICK_FLG = COL_INSIDE_PICK_FLG;
    }


    /**
     * Gets the REQUEST_USER_ID value for this ShipmentRequestHeader.
     *
     * @return REQUEST_USER_ID
     */
    public java.lang.String getREQUEST_USER_ID() {
        return REQUEST_USER_ID;
    }


    /**
     * Sets the REQUEST_USER_ID value for this ShipmentRequestHeader.
     *
     * @param REQUEST_USER_ID
     */
    public void setREQUEST_USER_ID(java.lang.String REQUEST_USER_ID) {
        this.REQUEST_USER_ID = REQUEST_USER_ID;
    }


    /**
     * Gets the INPUT_CLS value for this ShipmentRequestHeader.
     *
     * @return INPUT_CLS
     */
    public java.lang.String getINPUT_CLS() {
        return INPUT_CLS;
    }


    /**
     * Sets the INPUT_CLS value for this ShipmentRequestHeader.
     *
     * @param INPUT_CLS
     */
    public void setINPUT_CLS(java.lang.String INPUT_CLS) {
        this.INPUT_CLS = INPUT_CLS;
    }


    /**
     * Gets the TRACKING_NO value for this ShipmentRequestHeader.
     *
     * @return TRACKING_NO
     */
    public java.lang.String getTRACKING_NO() {
        return TRACKING_NO;
    }


    /**
     * Sets the TRACKING_NO value for this ShipmentRequestHeader.
     *
     * @param TRACKING_NO
     */
    public void setTRACKING_NO(java.lang.String TRACKING_NO) {
        this.TRACKING_NO = TRACKING_NO;
    }


    /**
     * Gets the BILL_TOTAL_CHARGE value for this ShipmentRequestHeader.
     *
     * @return BILL_TOTAL_CHARGE
     */
    public double getBILL_TOTAL_CHARGE() {
        return BILL_TOTAL_CHARGE;
    }


    /**
     * Sets the BILL_TOTAL_CHARGE value for this ShipmentRequestHeader.
     *
     * @param BILL_TOTAL_CHARGE
     */
    public void setBILL_TOTAL_CHARGE(double BILL_TOTAL_CHARGE) {
        this.BILL_TOTAL_CHARGE = BILL_TOTAL_CHARGE;
    }


    /**
     * Gets the BILLING_WEIGHT value for this ShipmentRequestHeader.
     *
     * @return BILLING_WEIGHT
     */
    public double getBILLING_WEIGHT() {
        return BILLING_WEIGHT;
    }


    /**
     * Sets the BILLING_WEIGHT value for this ShipmentRequestHeader.
     *
     * @param BILLING_WEIGHT
     */
    public void setBILLING_WEIGHT(double BILLING_WEIGHT) {
        this.BILLING_WEIGHT = BILLING_WEIGHT;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentRequestHeader)) return false;
        ShipmentRequestHeader other = (ShipmentRequestHeader) obj;
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
            ((this.ACCOUNT_NO==null && other.getACCOUNT_NO()==null) ||
             (this.ACCOUNT_NO!=null &&
              this.ACCOUNT_NO.equals(other.getACCOUNT_NO()))) &&
            ((this.SHIP_DT==null && other.getSHIP_DT()==null) ||
             (this.SHIP_DT!=null &&
              this.SHIP_DT.equals(other.getSHIP_DT()))) &&
            ((this.COMP_CD==null && other.getCOMP_CD()==null) ||
             (this.COMP_CD!=null &&
              this.COMP_CD.equals(other.getCOMP_CD()))) &&
            ((this.CARR_CD==null && other.getCARR_CD()==null) ||
             (this.CARR_CD!=null &&
              this.CARR_CD.equals(other.getCARR_CD()))) &&
            ((this.SERVICE_TYPE==null && other.getSERVICE_TYPE()==null) ||
             (this.SERVICE_TYPE!=null &&
              this.SERVICE_TYPE.equals(other.getSERVICE_TYPE()))) &&
            ((this.WMS_WORK_NO==null && other.getWMS_WORK_NO()==null) ||
             (this.WMS_WORK_NO!=null &&
              this.WMS_WORK_NO.equals(other.getWMS_WORK_NO()))) &&
            ((this.ORDER_NO==null && other.getORDER_NO()==null) ||
             (this.ORDER_NO!=null &&
              this.ORDER_NO.equals(other.getORDER_NO()))) &&
            ((this.PO_NO==null && other.getPO_NO()==null) ||
             (this.PO_NO!=null &&
              this.PO_NO.equals(other.getPO_NO()))) &&
            ((this.SHP_FROM_CONTACT_NM==null && other.getSHP_FROM_CONTACT_NM()==null) ||
             (this.SHP_FROM_CONTACT_NM!=null &&
              this.SHP_FROM_CONTACT_NM.equals(other.getSHP_FROM_CONTACT_NM()))) &&
            ((this.SHP_TO_CD1==null && other.getSHP_TO_CD1()==null) ||
             (this.SHP_TO_CD1!=null &&
              this.SHP_TO_CD1.equals(other.getSHP_TO_CD1()))) &&
            ((this.SHP_TO_NM1==null && other.getSHP_TO_NM1()==null) ||
             (this.SHP_TO_NM1!=null &&
              this.SHP_TO_NM1.equals(other.getSHP_TO_NM1()))) &&
            ((this.SHP_TO_NM2==null && other.getSHP_TO_NM2()==null) ||
             (this.SHP_TO_NM2!=null &&
              this.SHP_TO_NM2.equals(other.getSHP_TO_NM2()))) &&
            ((this.SHP_TO_ADDR1==null && other.getSHP_TO_ADDR1()==null) ||
             (this.SHP_TO_ADDR1!=null &&
              this.SHP_TO_ADDR1.equals(other.getSHP_TO_ADDR1()))) &&
            ((this.SHP_TO_ADDR2==null && other.getSHP_TO_ADDR2()==null) ||
             (this.SHP_TO_ADDR2!=null &&
              this.SHP_TO_ADDR2.equals(other.getSHP_TO_ADDR2()))) &&
            ((this.SHP_TO_ADDR3==null && other.getSHP_TO_ADDR3()==null) ||
             (this.SHP_TO_ADDR3!=null &&
              this.SHP_TO_ADDR3.equals(other.getSHP_TO_ADDR3()))) &&
            ((this.SHP_TO_ADDR4==null && other.getSHP_TO_ADDR4()==null) ||
             (this.SHP_TO_ADDR4!=null &&
              this.SHP_TO_ADDR4.equals(other.getSHP_TO_ADDR4()))) &&
            ((this.SHP_TO_CITY==null && other.getSHP_TO_CITY()==null) ||
             (this.SHP_TO_CITY!=null &&
              this.SHP_TO_CITY.equals(other.getSHP_TO_CITY()))) &&
            ((this.SHP_TO_STATE==null && other.getSHP_TO_STATE()==null) ||
             (this.SHP_TO_STATE!=null &&
              this.SHP_TO_STATE.equals(other.getSHP_TO_STATE()))) &&
            ((this.SHP_TO_ZIP_CD==null && other.getSHP_TO_ZIP_CD()==null) ||
             (this.SHP_TO_ZIP_CD!=null &&
              this.SHP_TO_ZIP_CD.equals(other.getSHP_TO_ZIP_CD()))) &&
            ((this.SHP_TO_COUNTRY_CD==null && other.getSHP_TO_COUNTRY_CD()==null) ||
             (this.SHP_TO_COUNTRY_CD!=null &&
              this.SHP_TO_COUNTRY_CD.equals(other.getSHP_TO_COUNTRY_CD()))) &&
            ((this.SHP_TO_TEL_NUM==null && other.getSHP_TO_TEL_NUM()==null) ||
             (this.SHP_TO_TEL_NUM!=null &&
              this.SHP_TO_TEL_NUM.equals(other.getSHP_TO_TEL_NUM()))) &&
            ((this.SHP_TO_FAX_NUM==null && other.getSHP_TO_FAX_NUM()==null) ||
             (this.SHP_TO_FAX_NUM!=null &&
              this.SHP_TO_FAX_NUM.equals(other.getSHP_TO_FAX_NUM()))) &&
            ((this.BILL_PAYMENT_TERM==null && other.getBILL_PAYMENT_TERM()==null) ||
             (this.BILL_PAYMENT_TERM!=null &&
              this.BILL_PAYMENT_TERM.equals(other.getBILL_PAYMENT_TERM()))) &&
            ((this.BILL_COL_ACCOUNT_NO==null && other.getBILL_COL_ACCOUNT_NO()==null) ||
             (this.BILL_COL_ACCOUNT_NO!=null &&
              this.BILL_COL_ACCOUNT_NO.equals(other.getBILL_COL_ACCOUNT_NO()))) &&
            ((this.BILL_COL_ZIP_CD==null && other.getBILL_COL_ZIP_CD()==null) ||
             (this.BILL_COL_ZIP_CD!=null &&
              this.BILL_COL_ZIP_CD.equals(other.getBILL_COL_ZIP_CD()))) &&
            ((this.BILL_COL_COUNTRY_CD==null && other.getBILL_COL_COUNTRY_CD()==null) ||
             (this.BILL_COL_COUNTRY_CD!=null &&
              this.BILL_COL_COUNTRY_CD.equals(other.getBILL_COL_COUNTRY_CD()))) &&
            ((this.TAX_PAYMENT_TERM==null && other.getTAX_PAYMENT_TERM()==null) ||
             (this.TAX_PAYMENT_TERM!=null &&
              this.TAX_PAYMENT_TERM.equals(other.getTAX_PAYMENT_TERM()))) &&
            ((this.TAX_COL_ACCOUNT_NO==null && other.getTAX_COL_ACCOUNT_NO()==null) ||
             (this.TAX_COL_ACCOUNT_NO!=null &&
              this.TAX_COL_ACCOUNT_NO.equals(other.getTAX_COL_ACCOUNT_NO()))) &&
            ((this.TAX_COL_ZIP_CD==null && other.getTAX_COL_ZIP_CD()==null) ||
             (this.TAX_COL_ZIP_CD!=null &&
              this.TAX_COL_ZIP_CD.equals(other.getTAX_COL_ZIP_CD()))) &&
            ((this.TAX_COL_COUNTRY_CD==null && other.getTAX_COL_COUNTRY_CD()==null) ||
             (this.TAX_COL_COUNTRY_CD!=null &&
              this.TAX_COL_COUNTRY_CD.equals(other.getTAX_COL_COUNTRY_CD()))) &&
            ((this.COD_PAYMENT_TERM==null && other.getCOD_PAYMENT_TERM()==null) ||
             (this.COD_PAYMENT_TERM!=null &&
              this.COD_PAYMENT_TERM.equals(other.getCOD_PAYMENT_TERM()))) &&
            this.COD_AMOUNT == other.getCOD_AMOUNT() &&
            ((this.COD_FEE_PAYER==null && other.getCOD_FEE_PAYER()==null) ||
             (this.COD_FEE_PAYER!=null &&
              this.COD_FEE_PAYER.equals(other.getCOD_FEE_PAYER()))) &&
            ((this.COD_FUND_TYPE==null && other.getCOD_FUND_TYPE()==null) ||
             (this.COD_FUND_TYPE!=null &&
              this.COD_FUND_TYPE.equals(other.getCOD_FUND_TYPE()))) &&
            ((this.SED_METHOD==null && other.getSED_METHOD()==null) ||
             (this.SED_METHOD!=null &&
              this.SED_METHOD.equals(other.getSED_METHOD()))) &&
            ((this.ITN_FTSR_NO==null && other.getITN_FTSR_NO()==null) ||
             (this.ITN_FTSR_NO!=null &&
              this.ITN_FTSR_NO.equals(other.getITN_FTSR_NO()))) &&
            ((this.TERMS_OF_SALES==null && other.getTERMS_OF_SALES()==null) ||
             (this.TERMS_OF_SALES!=null &&
              this.TERMS_OF_SALES.equals(other.getTERMS_OF_SALES()))) &&
            ((this.HANDLING_UNIT_TYPE==null && other.getHANDLING_UNIT_TYPE()==null) ||
             (this.HANDLING_UNIT_TYPE!=null &&
              this.HANDLING_UNIT_TYPE.equals(other.getHANDLING_UNIT_TYPE()))) &&
            this.NUM_OF_HANDLING_UNITS == other.getNUM_OF_HANDLING_UNITS() &&
            this.DECL_VALUE == other.getDECL_VALUE() &&
            ((this.EMERGENCY_PHONE_NO==null && other.getEMERGENCY_PHONE_NO()==null) ||
             (this.EMERGENCY_PHONE_NO!=null &&
              this.EMERGENCY_PHONE_NO.equals(other.getEMERGENCY_PHONE_NO()))) &&
            ((this.SPECIAL_INSTRUCTION==null && other.getSPECIAL_INSTRUCTION()==null) ||
             (this.SPECIAL_INSTRUCTION!=null &&
              this.SPECIAL_INSTRUCTION.equals(other.getSPECIAL_INSTRUCTION()))) &&
            ((this.BROKER_NAME==null && other.getBROKER_NAME()==null) ||
             (this.BROKER_NAME!=null &&
              this.BROKER_NAME.equals(other.getBROKER_NAME()))) &&
            ((this.BROKER_PHONE==null && other.getBROKER_PHONE()==null) ||
             (this.BROKER_PHONE!=null &&
              this.BROKER_PHONE.equals(other.getBROKER_PHONE()))) &&
            ((this.BROKER_FAX==null && other.getBROKER_FAX()==null) ||
             (this.BROKER_FAX!=null &&
              this.BROKER_FAX.equals(other.getBROKER_FAX()))) &&
            ((this.SAT_DELIVERY_FLG==null && other.getSAT_DELIVERY_FLG()==null) ||
             (this.SAT_DELIVERY_FLG!=null &&
              this.SAT_DELIVERY_FLG.equals(other.getSAT_DELIVERY_FLG()))) &&
            ((this.RES_DELIVERY_FLG==null && other.getRES_DELIVERY_FLG()==null) ||
             (this.RES_DELIVERY_FLG!=null &&
              this.RES_DELIVERY_FLG.equals(other.getRES_DELIVERY_FLG()))) &&
            ((this.COD_FLG==null && other.getCOD_FLG()==null) ||
             (this.COD_FLG!=null &&
              this.COD_FLG.equals(other.getCOD_FLG()))) &&
            ((this.SIGN_REQUIRED_FLG==null && other.getSIGN_REQUIRED_FLG()==null) ||
             (this.SIGN_REQUIRED_FLG!=null &&
              this.SIGN_REQUIRED_FLG.equals(other.getSIGN_REQUIRED_FLG()))) &&
            ((this.SIGN_RELEASE_FLG==null && other.getSIGN_RELEASE_FLG()==null) ||
             (this.SIGN_RELEASE_FLG!=null &&
              this.SIGN_RELEASE_FLG.equals(other.getSIGN_RELEASE_FLG()))) &&
            ((this.CALL_BEF_FLG==null && other.getCALL_BEF_FLG()==null) ||
             (this.CALL_BEF_FLG!=null &&
              this.CALL_BEF_FLG.equals(other.getCALL_BEF_FLG()))) &&
            ((this.FREEZABLE_FLG==null && other.getFREEZABLE_FLG()==null) ||
             (this.FREEZABLE_FLG!=null &&
              this.FREEZABLE_FLG.equals(other.getFREEZABLE_FLG()))) &&
            ((this.GUARANTEED_FLG==null && other.getGUARANTEED_FLG()==null) ||
             (this.GUARANTEED_FLG!=null &&
              this.GUARANTEED_FLG.equals(other.getGUARANTEED_FLG()))) &&
            ((this.RES_PICK_FLG==null && other.getRES_PICK_FLG()==null) ||
             (this.RES_PICK_FLG!=null &&
              this.RES_PICK_FLG.equals(other.getRES_PICK_FLG()))) &&
            ((this.NO_STACK_FLG==null && other.getNO_STACK_FLG()==null) ||
             (this.NO_STACK_FLG!=null &&
              this.NO_STACK_FLG.equals(other.getNO_STACK_FLG()))) &&
            ((this.LMT_DELIVERY_FLG==null && other.getLMT_DELIVERY_FLG()==null) ||
             (this.LMT_DELIVERY_FLG!=null &&
              this.LMT_DELIVERY_FLG.equals(other.getLMT_DELIVERY_FLG()))) &&
            ((this.LMT_PICK_FLG==null && other.getLMT_PICK_FLG()==null) ||
             (this.LMT_PICK_FLG!=null &&
              this.LMT_PICK_FLG.equals(other.getLMT_PICK_FLG()))) &&
            ((this.OVER_SIZED_FLG==null && other.getOVER_SIZED_FLG()==null) ||
             (this.OVER_SIZED_FLG!=null &&
              this.OVER_SIZED_FLG.equals(other.getOVER_SIZED_FLG()))) &&
            ((this.POISON_FLG==null && other.getPOISON_FLG()==null) ||
             (this.POISON_FLG!=null &&
              this.POISON_FLG.equals(other.getPOISON_FLG()))) &&
            ((this.FOOD_FLG==null && other.getFOOD_FLG()==null) ||
             (this.FOOD_FLG!=null &&
              this.FOOD_FLG.equals(other.getFOOD_FLG()))) &&
            ((this.PPD_LIFT_DELIVERY_FLG==null && other.getPPD_LIFT_DELIVERY_FLG()==null) ||
             (this.PPD_LIFT_DELIVERY_FLG!=null &&
              this.PPD_LIFT_DELIVERY_FLG.equals(other.getPPD_LIFT_DELIVERY_FLG()))) &&
            ((this.COL_LIFT_DELIVERY_FLG==null && other.getCOL_LIFT_DELIVERY_FLG()==null) ||
             (this.COL_LIFT_DELIVERY_FLG!=null &&
              this.COL_LIFT_DELIVERY_FLG.equals(other.getCOL_LIFT_DELIVERY_FLG()))) &&
            ((this.PPD_LIFT_PICK_FLG==null && other.getPPD_LIFT_PICK_FLG()==null) ||
             (this.PPD_LIFT_PICK_FLG!=null &&
              this.PPD_LIFT_PICK_FLG.equals(other.getPPD_LIFT_PICK_FLG()))) &&
            ((this.COL_LIFT_PICK_FLG==null && other.getCOL_LIFT_PICK_FLG()==null) ||
             (this.COL_LIFT_PICK_FLG!=null &&
              this.COL_LIFT_PICK_FLG.equals(other.getCOL_LIFT_PICK_FLG()))) &&
            ((this.PPD_INSIDE_DELIVERY_FLG==null && other.getPPD_INSIDE_DELIVERY_FLG()==null) ||
             (this.PPD_INSIDE_DELIVERY_FLG!=null &&
              this.PPD_INSIDE_DELIVERY_FLG.equals(other.getPPD_INSIDE_DELIVERY_FLG()))) &&
            ((this.COL_INSIDE_DELIVERY_FLG==null && other.getCOL_INSIDE_DELIVERY_FLG()==null) ||
             (this.COL_INSIDE_DELIVERY_FLG!=null &&
              this.COL_INSIDE_DELIVERY_FLG.equals(other.getCOL_INSIDE_DELIVERY_FLG()))) &&
            ((this.PPD_INSIDE_PICK_FLG==null && other.getPPD_INSIDE_PICK_FLG()==null) ||
             (this.PPD_INSIDE_PICK_FLG!=null &&
              this.PPD_INSIDE_PICK_FLG.equals(other.getPPD_INSIDE_PICK_FLG()))) &&
            ((this.COL_INSIDE_PICK_FLG==null && other.getCOL_INSIDE_PICK_FLG()==null) ||
             (this.COL_INSIDE_PICK_FLG!=null &&
              this.COL_INSIDE_PICK_FLG.equals(other.getCOL_INSIDE_PICK_FLG()))) &&
            ((this.REQUEST_USER_ID==null && other.getREQUEST_USER_ID()==null) ||
             (this.REQUEST_USER_ID!=null &&
              this.REQUEST_USER_ID.equals(other.getREQUEST_USER_ID()))) &&
            ((this.INPUT_CLS==null && other.getINPUT_CLS()==null) ||
             (this.INPUT_CLS!=null &&
              this.INPUT_CLS.equals(other.getINPUT_CLS()))) &&
            ((this.TRACKING_NO==null && other.getTRACKING_NO()==null) ||
             (this.TRACKING_NO!=null &&
              this.TRACKING_NO.equals(other.getTRACKING_NO()))) &&
            this.BILL_TOTAL_CHARGE == other.getBILL_TOTAL_CHARGE() &&
            this.BILLING_WEIGHT == other.getBILLING_WEIGHT();
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
        if (getACCOUNT_NO() != null) {
            _hashCode += getACCOUNT_NO().hashCode();
        }
        if (getSHIP_DT() != null) {
            _hashCode += getSHIP_DT().hashCode();
        }
        if (getCOMP_CD() != null) {
            _hashCode += getCOMP_CD().hashCode();
        }
        if (getCARR_CD() != null) {
            _hashCode += getCARR_CD().hashCode();
        }
        if (getSERVICE_TYPE() != null) {
            _hashCode += getSERVICE_TYPE().hashCode();
        }
        if (getWMS_WORK_NO() != null) {
            _hashCode += getWMS_WORK_NO().hashCode();
        }
        if (getORDER_NO() != null) {
            _hashCode += getORDER_NO().hashCode();
        }
        if (getPO_NO() != null) {
            _hashCode += getPO_NO().hashCode();
        }
        if (getSHP_FROM_CONTACT_NM() != null) {
            _hashCode += getSHP_FROM_CONTACT_NM().hashCode();
        }
        if (getSHP_TO_CD1() != null) {
            _hashCode += getSHP_TO_CD1().hashCode();
        }
        if (getSHP_TO_NM1() != null) {
            _hashCode += getSHP_TO_NM1().hashCode();
        }
        if (getSHP_TO_NM2() != null) {
            _hashCode += getSHP_TO_NM2().hashCode();
        }
        if (getSHP_TO_ADDR1() != null) {
            _hashCode += getSHP_TO_ADDR1().hashCode();
        }
        if (getSHP_TO_ADDR2() != null) {
            _hashCode += getSHP_TO_ADDR2().hashCode();
        }
        if (getSHP_TO_ADDR3() != null) {
            _hashCode += getSHP_TO_ADDR3().hashCode();
        }
        if (getSHP_TO_ADDR4() != null) {
            _hashCode += getSHP_TO_ADDR4().hashCode();
        }
        if (getSHP_TO_CITY() != null) {
            _hashCode += getSHP_TO_CITY().hashCode();
        }
        if (getSHP_TO_STATE() != null) {
            _hashCode += getSHP_TO_STATE().hashCode();
        }
        if (getSHP_TO_ZIP_CD() != null) {
            _hashCode += getSHP_TO_ZIP_CD().hashCode();
        }
        if (getSHP_TO_COUNTRY_CD() != null) {
            _hashCode += getSHP_TO_COUNTRY_CD().hashCode();
        }
        if (getSHP_TO_TEL_NUM() != null) {
            _hashCode += getSHP_TO_TEL_NUM().hashCode();
        }
        if (getSHP_TO_FAX_NUM() != null) {
            _hashCode += getSHP_TO_FAX_NUM().hashCode();
        }
        if (getBILL_PAYMENT_TERM() != null) {
            _hashCode += getBILL_PAYMENT_TERM().hashCode();
        }
        if (getBILL_COL_ACCOUNT_NO() != null) {
            _hashCode += getBILL_COL_ACCOUNT_NO().hashCode();
        }
        if (getBILL_COL_ZIP_CD() != null) {
            _hashCode += getBILL_COL_ZIP_CD().hashCode();
        }
        if (getBILL_COL_COUNTRY_CD() != null) {
            _hashCode += getBILL_COL_COUNTRY_CD().hashCode();
        }
        if (getTAX_PAYMENT_TERM() != null) {
            _hashCode += getTAX_PAYMENT_TERM().hashCode();
        }
        if (getTAX_COL_ACCOUNT_NO() != null) {
            _hashCode += getTAX_COL_ACCOUNT_NO().hashCode();
        }
        if (getTAX_COL_ZIP_CD() != null) {
            _hashCode += getTAX_COL_ZIP_CD().hashCode();
        }
        if (getTAX_COL_COUNTRY_CD() != null) {
            _hashCode += getTAX_COL_COUNTRY_CD().hashCode();
        }
        if (getCOD_PAYMENT_TERM() != null) {
            _hashCode += getCOD_PAYMENT_TERM().hashCode();
        }
        _hashCode += new Double(getCOD_AMOUNT()).hashCode();
        if (getCOD_FEE_PAYER() != null) {
            _hashCode += getCOD_FEE_PAYER().hashCode();
        }
        if (getCOD_FUND_TYPE() != null) {
            _hashCode += getCOD_FUND_TYPE().hashCode();
        }
        if (getSED_METHOD() != null) {
            _hashCode += getSED_METHOD().hashCode();
        }
        if (getITN_FTSR_NO() != null) {
            _hashCode += getITN_FTSR_NO().hashCode();
        }
        if (getTERMS_OF_SALES() != null) {
            _hashCode += getTERMS_OF_SALES().hashCode();
        }
        if (getHANDLING_UNIT_TYPE() != null) {
            _hashCode += getHANDLING_UNIT_TYPE().hashCode();
        }
        _hashCode += new Double(getNUM_OF_HANDLING_UNITS()).hashCode();
        _hashCode += new Double(getDECL_VALUE()).hashCode();
        if (getEMERGENCY_PHONE_NO() != null) {
            _hashCode += getEMERGENCY_PHONE_NO().hashCode();
        }
        if (getSPECIAL_INSTRUCTION() != null) {
            _hashCode += getSPECIAL_INSTRUCTION().hashCode();
        }
        if (getBROKER_NAME() != null) {
            _hashCode += getBROKER_NAME().hashCode();
        }
        if (getBROKER_PHONE() != null) {
            _hashCode += getBROKER_PHONE().hashCode();
        }
        if (getBROKER_FAX() != null) {
            _hashCode += getBROKER_FAX().hashCode();
        }
        if (getSAT_DELIVERY_FLG() != null) {
            _hashCode += getSAT_DELIVERY_FLG().hashCode();
        }
        if (getRES_DELIVERY_FLG() != null) {
            _hashCode += getRES_DELIVERY_FLG().hashCode();
        }
        if (getCOD_FLG() != null) {
            _hashCode += getCOD_FLG().hashCode();
        }
        if (getSIGN_REQUIRED_FLG() != null) {
            _hashCode += getSIGN_REQUIRED_FLG().hashCode();
        }
        if (getSIGN_RELEASE_FLG() != null) {
            _hashCode += getSIGN_RELEASE_FLG().hashCode();
        }
        if (getCALL_BEF_FLG() != null) {
            _hashCode += getCALL_BEF_FLG().hashCode();
        }
        if (getFREEZABLE_FLG() != null) {
            _hashCode += getFREEZABLE_FLG().hashCode();
        }
        if (getGUARANTEED_FLG() != null) {
            _hashCode += getGUARANTEED_FLG().hashCode();
        }
        if (getRES_PICK_FLG() != null) {
            _hashCode += getRES_PICK_FLG().hashCode();
        }
        if (getNO_STACK_FLG() != null) {
            _hashCode += getNO_STACK_FLG().hashCode();
        }
        if (getLMT_DELIVERY_FLG() != null) {
            _hashCode += getLMT_DELIVERY_FLG().hashCode();
        }
        if (getLMT_PICK_FLG() != null) {
            _hashCode += getLMT_PICK_FLG().hashCode();
        }
        if (getOVER_SIZED_FLG() != null) {
            _hashCode += getOVER_SIZED_FLG().hashCode();
        }
        if (getPOISON_FLG() != null) {
            _hashCode += getPOISON_FLG().hashCode();
        }
        if (getFOOD_FLG() != null) {
            _hashCode += getFOOD_FLG().hashCode();
        }
        if (getPPD_LIFT_DELIVERY_FLG() != null) {
            _hashCode += getPPD_LIFT_DELIVERY_FLG().hashCode();
        }
        if (getCOL_LIFT_DELIVERY_FLG() != null) {
            _hashCode += getCOL_LIFT_DELIVERY_FLG().hashCode();
        }
        if (getPPD_LIFT_PICK_FLG() != null) {
            _hashCode += getPPD_LIFT_PICK_FLG().hashCode();
        }
        if (getCOL_LIFT_PICK_FLG() != null) {
            _hashCode += getCOL_LIFT_PICK_FLG().hashCode();
        }
        if (getPPD_INSIDE_DELIVERY_FLG() != null) {
            _hashCode += getPPD_INSIDE_DELIVERY_FLG().hashCode();
        }
        if (getCOL_INSIDE_DELIVERY_FLG() != null) {
            _hashCode += getCOL_INSIDE_DELIVERY_FLG().hashCode();
        }
        if (getPPD_INSIDE_PICK_FLG() != null) {
            _hashCode += getPPD_INSIDE_PICK_FLG().hashCode();
        }
        if (getCOL_INSIDE_PICK_FLG() != null) {
            _hashCode += getCOL_INSIDE_PICK_FLG().hashCode();
        }
        if (getREQUEST_USER_ID() != null) {
            _hashCode += getREQUEST_USER_ID().hashCode();
        }
        if (getINPUT_CLS() != null) {
            _hashCode += getINPUT_CLS().hashCode();
        }
        if (getTRACKING_NO() != null) {
            _hashCode += getTRACKING_NO().hashCode();
        }
        _hashCode += new Double(getBILL_TOTAL_CHARGE()).hashCode();
        _hashCode += new Double(getBILLING_WEIGHT()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // メタデータ型 / [en]-(Type metadata)
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentRequestHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestHeader"));
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
        elemField.setFieldName("ACCOUNT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "ACCOUNT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHIP_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHIP_DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMP_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "COMP_CD"));
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
        elemField.setFieldName("SERVICE_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SERVICE_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WMS_WORK_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "WMS_WORK_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORDER_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "ORDER_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PO_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "PO_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHP_FROM_CONTACT_NM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHP_FROM_CONTACT_NM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHP_TO_CD1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHP_TO_CD1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHP_TO_NM1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHP_TO_NM1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHP_TO_NM2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHP_TO_NM2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHP_TO_ADDR1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHP_TO_ADDR1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHP_TO_ADDR2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHP_TO_ADDR2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHP_TO_ADDR3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHP_TO_ADDR3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHP_TO_ADDR4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHP_TO_ADDR4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHP_TO_CITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHP_TO_CITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHP_TO_STATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHP_TO_STATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHP_TO_ZIP_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHP_TO_ZIP_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHP_TO_COUNTRY_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHP_TO_COUNTRY_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHP_TO_TEL_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHP_TO_TEL_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHP_TO_FAX_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SHP_TO_FAX_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BILL_PAYMENT_TERM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "BILL_PAYMENT_TERM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BILL_COL_ACCOUNT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "BILL_COL_ACCOUNT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BILL_COL_ZIP_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "BILL_COL_ZIP_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BILL_COL_COUNTRY_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "BILL_COL_COUNTRY_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAX_PAYMENT_TERM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "TAX_PAYMENT_TERM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAX_COL_ACCOUNT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "TAX_COL_ACCOUNT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAX_COL_ZIP_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "TAX_COL_ZIP_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAX_COL_COUNTRY_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "TAX_COL_COUNTRY_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COD_PAYMENT_TERM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "COD_PAYMENT_TERM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COD_AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "COD_AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COD_FEE_PAYER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "COD_FEE_PAYER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COD_FUND_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "COD_FUND_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SED_METHOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SED_METHOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITN_FTSR_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "ITN_FTSR_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERMS_OF_SALES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "TERMS_OF_SALES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HANDLING_UNIT_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "HANDLING_UNIT_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUM_OF_HANDLING_UNITS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "NUM_OF_HANDLING_UNITS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DECL_VALUE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "DECL_VALUE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMERGENCY_PHONE_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "EMERGENCY_PHONE_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPECIAL_INSTRUCTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SPECIAL_INSTRUCTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BROKER_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "BROKER_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BROKER_PHONE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "BROKER_PHONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BROKER_FAX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "BROKER_FAX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAT_DELIVERY_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SAT_DELIVERY_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RES_DELIVERY_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "RES_DELIVERY_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COD_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "COD_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIGN_REQUIRED_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SIGN_REQUIRED_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIGN_RELEASE_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "SIGN_RELEASE_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALL_BEF_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "CALL_BEF_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FREEZABLE_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "FREEZABLE_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GUARANTEED_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "GUARANTEED_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RES_PICK_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "RES_PICK_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NO_STACK_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "NO_STACK_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LMT_DELIVERY_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "LMT_DELIVERY_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LMT_PICK_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "LMT_PICK_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OVER_SIZED_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "OVER_SIZED_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POISON_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "POISON_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FOOD_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "FOOD_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPD_LIFT_DELIVERY_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "PPD_LIFT_DELIVERY_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COL_LIFT_DELIVERY_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "COL_LIFT_DELIVERY_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPD_LIFT_PICK_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "PPD_LIFT_PICK_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COL_LIFT_PICK_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "COL_LIFT_PICK_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPD_INSIDE_DELIVERY_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "PPD_INSIDE_DELIVERY_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COL_INSIDE_DELIVERY_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "COL_INSIDE_DELIVERY_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPD_INSIDE_PICK_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "PPD_INSIDE_PICK_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COL_INSIDE_PICK_FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "COL_INSIDE_PICK_FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REQUEST_USER_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "REQUEST_USER_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INPUT_CLS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "INPUT_CLS"));
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
        elemField.setFieldName("BILL_TOTAL_CHARGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "BILL_TOTAL_CHARGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BILLING_WEIGHT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hitachitransport.com", "BILLING_WEIGHT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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

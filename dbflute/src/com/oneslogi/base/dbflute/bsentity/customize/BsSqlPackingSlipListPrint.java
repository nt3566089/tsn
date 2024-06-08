package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlPackingSlipListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_CD, CLIENT_NM, CLIENT_ADDRESS1, CLIENT_ADDRESS2, CLIENT_ADDRESS3, CLIENT_TEL_NO, SHIPPING_DT, CLIENT_SHIPPING_NO, SUPPLY_CUSTOMER_NM, BILL_ADDRESS1, BILL_ADDRESS2, BILL_ADDRESS3, BILL_TEL_NO, DELIV_CUSTOMER_NM, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_TEL_NO, PRODUCT_CD, PRODUCT_NM, ALLOC_NUM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * String clientAddress1 = entity.getClientAddress1();
 * String clientAddress2 = entity.getClientAddress2();
 * String clientAddress3 = entity.getClientAddress3();
 * String clientTelNo = entity.getClientTelNo();
 * String shippingDt = entity.getShippingDt();
 * String clientShippingNo = entity.getClientShippingNo();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String billAddress1 = entity.getBillAddress1();
 * String billAddress2 = entity.getBillAddress2();
 * String billAddress3 = entity.getBillAddress3();
 * String billTelNo = entity.getBillTelNo();
 * String delivCustomerNm = entity.getDelivCustomerNm();
 * String delivAddress1 = entity.getDelivAddress1();
 * String delivAddress2 = entity.getDelivAddress2();
 * String delivAddress3 = entity.getDelivAddress3();
 * String delivTelNo = entity.getDelivTelNo();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * java.math.BigDecimal allocNum = entity.getAllocNum();
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setClientAddress1(clientAddress1);
 * entity.setClientAddress2(clientAddress2);
 * entity.setClientAddress3(clientAddress3);
 * entity.setClientTelNo(clientTelNo);
 * entity.setShippingDt(shippingDt);
 * entity.setClientShippingNo(clientShippingNo);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setBillAddress1(billAddress1);
 * entity.setBillAddress2(billAddress2);
 * entity.setBillAddress3(billAddress3);
 * entity.setBillTelNo(billTelNo);
 * entity.setDelivCustomerNm(delivCustomerNm);
 * entity.setDelivAddress1(delivAddress1);
 * entity.setDelivAddress2(delivAddress2);
 * entity.setDelivAddress3(delivAddress3);
 * entity.setDelivTelNo(delivTelNo);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setAllocNum(allocNum);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlPackingSlipListPrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** CLIENT_ADDRESS1: {varchar(60)} */
    protected String _clientAddress1;

    /** CLIENT_ADDRESS2: {varchar(60)} */
    protected String _clientAddress2;

    /** CLIENT_ADDRESS3: {varchar(60)} */
    protected String _clientAddress3;

    /** CLIENT_TEL_NO: {varchar(30)} */
    protected String _clientTelNo;

    /** SHIPPING_DT: {varchar(8)} */
    protected String _shippingDt;

    /** CLIENT_SHIPPING_NO: {varchar(30)} */
    protected String _clientShippingNo;

    /** SUPPLY_CUSTOMER_NM: {varchar(255)} */
    protected String _supplyCustomerNm;

    /** BILL_ADDRESS1: {varchar(60)} */
    protected String _billAddress1;

    /** BILL_ADDRESS2: {varchar(60)} */
    protected String _billAddress2;

    /** BILL_ADDRESS3: {varchar(60)} */
    protected String _billAddress3;

    /** BILL_TEL_NO: {varchar(30)} */
    protected String _billTelNo;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    protected String _delivCustomerNm;

    /** DELIV_ADDRESS1: {varchar(255)} */
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {varchar(255)} */
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {varchar(255)} */
    protected String _delivAddress3;

    /** DELIV_TEL_NO: {varchar(255)} */
    protected String _delivTelNo;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** ALLOC_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _allocNum;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlPackingSlipListPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlPackingSlipListPrint";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlPackingSlipListPrint) {
            BsSqlPackingSlipListPrint other = (BsSqlPackingSlipListPrint)obj;
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_clientAddress1, other._clientAddress1)) { return false; }
            if (!xSV(_clientAddress2, other._clientAddress2)) { return false; }
            if (!xSV(_clientAddress3, other._clientAddress3)) { return false; }
            if (!xSV(_clientTelNo, other._clientTelNo)) { return false; }
            if (!xSV(_shippingDt, other._shippingDt)) { return false; }
            if (!xSV(_clientShippingNo, other._clientShippingNo)) { return false; }
            if (!xSV(_supplyCustomerNm, other._supplyCustomerNm)) { return false; }
            if (!xSV(_billAddress1, other._billAddress1)) { return false; }
            if (!xSV(_billAddress2, other._billAddress2)) { return false; }
            if (!xSV(_billAddress3, other._billAddress3)) { return false; }
            if (!xSV(_billTelNo, other._billTelNo)) { return false; }
            if (!xSV(_delivCustomerNm, other._delivCustomerNm)) { return false; }
            if (!xSV(_delivAddress1, other._delivAddress1)) { return false; }
            if (!xSV(_delivAddress2, other._delivAddress2)) { return false; }
            if (!xSV(_delivAddress3, other._delivAddress3)) { return false; }
            if (!xSV(_delivTelNo, other._delivTelNo)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_allocNum, other._allocNum)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _clientAddress1);
        hs = xCH(hs, _clientAddress2);
        hs = xCH(hs, _clientAddress3);
        hs = xCH(hs, _clientTelNo);
        hs = xCH(hs, _shippingDt);
        hs = xCH(hs, _clientShippingNo);
        hs = xCH(hs, _supplyCustomerNm);
        hs = xCH(hs, _billAddress1);
        hs = xCH(hs, _billAddress2);
        hs = xCH(hs, _billAddress3);
        hs = xCH(hs, _billTelNo);
        hs = xCH(hs, _delivCustomerNm);
        hs = xCH(hs, _delivAddress1);
        hs = xCH(hs, _delivAddress2);
        hs = xCH(hs, _delivAddress3);
        hs = xCH(hs, _delivTelNo);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _allocNum);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_clientAddress1));
        sb.append(dm).append(xfND(_clientAddress2));
        sb.append(dm).append(xfND(_clientAddress3));
        sb.append(dm).append(xfND(_clientTelNo));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_clientShippingNo));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_billAddress1));
        sb.append(dm).append(xfND(_billAddress2));
        sb.append(dm).append(xfND(_billAddress3));
        sb.append(dm).append(xfND(_billTelNo));
        sb.append(dm).append(xfND(_delivCustomerNm));
        sb.append(dm).append(xfND(_delivAddress1));
        sb.append(dm).append(xfND(_delivAddress2));
        sb.append(dm).append(xfND(_delivAddress3));
        sb.append(dm).append(xfND(_delivTelNo));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_allocNum));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlPackingSlipListPrint clone() {
        return (SqlPackingSlipListPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }

    /**
     * [get] CLIENT_ADDRESS1: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientAddress1() {
        checkSpecifiedProperty("clientAddress1");
        return convertEmptyToNull(_clientAddress1);
    }

    /**
     * [set] CLIENT_ADDRESS1: {varchar(60)} <br>
     * @param clientAddress1 The value of the column 'CLIENT_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientAddress1(String clientAddress1) {
        registerModifiedProperty("clientAddress1");
        _clientAddress1 = clientAddress1;
    }

    /**
     * [get] CLIENT_ADDRESS2: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientAddress2() {
        checkSpecifiedProperty("clientAddress2");
        return convertEmptyToNull(_clientAddress2);
    }

    /**
     * [set] CLIENT_ADDRESS2: {varchar(60)} <br>
     * @param clientAddress2 The value of the column 'CLIENT_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientAddress2(String clientAddress2) {
        registerModifiedProperty("clientAddress2");
        _clientAddress2 = clientAddress2;
    }

    /**
     * [get] CLIENT_ADDRESS3: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientAddress3() {
        checkSpecifiedProperty("clientAddress3");
        return convertEmptyToNull(_clientAddress3);
    }

    /**
     * [set] CLIENT_ADDRESS3: {varchar(60)} <br>
     * @param clientAddress3 The value of the column 'CLIENT_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientAddress3(String clientAddress3) {
        registerModifiedProperty("clientAddress3");
        _clientAddress3 = clientAddress3;
    }

    /**
     * [get] CLIENT_TEL_NO: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientTelNo() {
        checkSpecifiedProperty("clientTelNo");
        return convertEmptyToNull(_clientTelNo);
    }

    /**
     * [set] CLIENT_TEL_NO: {varchar(30)} <br>
     * @param clientTelNo The value of the column 'CLIENT_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientTelNo(String clientTelNo) {
        registerModifiedProperty("clientTelNo");
        _clientTelNo = clientTelNo;
    }

    /**
     * [get] SHIPPING_DT: {varchar(8)} <br>
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {varchar(8)} <br>
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientShippingNo() {
        checkSpecifiedProperty("clientShippingNo");
        return convertEmptyToNull(_clientShippingNo);
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {varchar(30)} <br>
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientShippingNo(String clientShippingNo) {
        registerModifiedProperty("clientShippingNo");
        _clientShippingNo = clientShippingNo;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] BILL_ADDRESS1: {varchar(60)} <br>
     * @return The value of the column 'BILL_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillAddress1() {
        checkSpecifiedProperty("billAddress1");
        return convertEmptyToNull(_billAddress1);
    }

    /**
     * [set] BILL_ADDRESS1: {varchar(60)} <br>
     * @param billAddress1 The value of the column 'BILL_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillAddress1(String billAddress1) {
        registerModifiedProperty("billAddress1");
        _billAddress1 = billAddress1;
    }

    /**
     * [get] BILL_ADDRESS2: {varchar(60)} <br>
     * @return The value of the column 'BILL_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillAddress2() {
        checkSpecifiedProperty("billAddress2");
        return convertEmptyToNull(_billAddress2);
    }

    /**
     * [set] BILL_ADDRESS2: {varchar(60)} <br>
     * @param billAddress2 The value of the column 'BILL_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillAddress2(String billAddress2) {
        registerModifiedProperty("billAddress2");
        _billAddress2 = billAddress2;
    }

    /**
     * [get] BILL_ADDRESS3: {varchar(60)} <br>
     * @return The value of the column 'BILL_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillAddress3() {
        checkSpecifiedProperty("billAddress3");
        return convertEmptyToNull(_billAddress3);
    }

    /**
     * [set] BILL_ADDRESS3: {varchar(60)} <br>
     * @param billAddress3 The value of the column 'BILL_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillAddress3(String billAddress3) {
        registerModifiedProperty("billAddress3");
        _billAddress3 = billAddress3;
    }

    /**
     * [get] BILL_TEL_NO: {varchar(30)} <br>
     * @return The value of the column 'BILL_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBillTelNo() {
        checkSpecifiedProperty("billTelNo");
        return convertEmptyToNull(_billTelNo);
    }

    /**
     * [set] BILL_TEL_NO: {varchar(30)} <br>
     * @param billTelNo The value of the column 'BILL_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBillTelNo(String billTelNo) {
        registerModifiedProperty("billTelNo");
        _billTelNo = billTelNo;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm() {
        checkSpecifiedProperty("delivCustomerNm");
        return convertEmptyToNull(_delivCustomerNm);
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        registerModifiedProperty("delivCustomerNm");
        _delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] DELIV_ADDRESS1: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress1() {
        checkSpecifiedProperty("delivAddress1");
        return convertEmptyToNull(_delivAddress1);
    }

    /**
     * [set] DELIV_ADDRESS1: {varchar(255)} <br>
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress1(String delivAddress1) {
        registerModifiedProperty("delivAddress1");
        _delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress2() {
        checkSpecifiedProperty("delivAddress2");
        return convertEmptyToNull(_delivAddress2);
    }

    /**
     * [set] DELIV_ADDRESS2: {varchar(255)} <br>
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress2(String delivAddress2) {
        registerModifiedProperty("delivAddress2");
        _delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress3() {
        checkSpecifiedProperty("delivAddress3");
        return convertEmptyToNull(_delivAddress3);
    }

    /**
     * [set] DELIV_ADDRESS3: {varchar(255)} <br>
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress3(String delivAddress3) {
        registerModifiedProperty("delivAddress3");
        _delivAddress3 = delivAddress3;
    }

    /**
     * [get] DELIV_TEL_NO: {varchar(255)} <br>
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTelNo() {
        checkSpecifiedProperty("delivTelNo");
        return convertEmptyToNull(_delivTelNo);
    }

    /**
     * [set] DELIV_TEL_NO: {varchar(255)} <br>
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTelNo(String delivTelNo) {
        registerModifiedProperty("delivTelNo");
        _delivTelNo = delivTelNo;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] ALLOC_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'ALLOC_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAllocNum() {
        checkSpecifiedProperty("allocNum");
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {decimal(38, 6)} <br>
     * @param allocNum The value of the column 'ALLOC_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        registerModifiedProperty("allocNum");
        _allocNum = allocNum;
    }
}

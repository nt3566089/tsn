package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlDeliverySlipListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_CD, CLIENT_NM, CENTER_CD, CENTER_NM, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, SHIPPING_DT, DELIV_DT, SHIPPING_SLIP_NO, CLIENT_SHIPPING_NO, PRODUCT_CD, PRODUCT_NM, TEL_NO, LOT, LIMIT_DT, PICKING_NUM, PACKING_OUT_FLG, PICKING_WORK_NO, TOTAL_PRICE, TOTAL_TAX, PRICE, TAX, SHIPPING_INST_B_ID
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
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String shippingDt = entity.getShippingDt();
 * String delivDt = entity.getDelivDt();
 * String shippingSlipNo = entity.getShippingSlipNo();
 * String clientShippingNo = entity.getClientShippingNo();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String telNo = entity.getTelNo();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * java.math.BigDecimal pickingNum = entity.getPickingNum();
 * String packingOutFlg = entity.getPackingOutFlg();
 * String pickingWorkNo = entity.getPickingWorkNo();
 * java.math.BigDecimal totalPrice = entity.getTotalPrice();
 * java.math.BigDecimal totalTax = entity.getTotalTax();
 * java.math.BigDecimal price = entity.getPrice();
 * java.math.BigDecimal tax = entity.getTax();
 * Long shippingInstBId = entity.getShippingInstBId();
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setShippingDt(shippingDt);
 * entity.setDelivDt(delivDt);
 * entity.setShippingSlipNo(shippingSlipNo);
 * entity.setClientShippingNo(clientShippingNo);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setTelNo(telNo);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setPickingNum(pickingNum);
 * entity.setPackingOutFlg(packingOutFlg);
 * entity.setPickingWorkNo(pickingWorkNo);
 * entity.setTotalPrice(totalPrice);
 * entity.setTotalTax(totalTax);
 * entity.setPrice(price);
 * entity.setTax(tax);
 * entity.setShippingInstBId(shippingInstBId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlDeliverySlipListPrint extends AbstractEntity implements CustomizeEntity {

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

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** SUPPLY_CUSTOMER_CD: {varchar(30)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(60)} */
    protected String _supplyCustomerNm;

    /** SHIPPING_DT: {varchar(8)} */
    protected String _shippingDt;

    /** DELIV_DT: {varchar(8)} */
    protected String _delivDt;

    /** SHIPPING_SLIP_NO: {varchar(30)} */
    protected String _shippingSlipNo;

    /** CLIENT_SHIPPING_NO: {varchar(30)} */
    protected String _clientShippingNo;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** TEL_NO: {varchar(30)} */
    protected String _telNo;

    /** LOT: {varchar(30)} */
    protected String _lot;

    /** LIMIT_DT: {varchar(8)} */
    protected String _limitDt;

    /** PICKING_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _pickingNum;

    /** PACKING_OUT_FLG: {char(1), classification=ListOutFlg} */
    protected String _packingOutFlg;

    /** PICKING_WORK_NO: {varchar(30)} */
    protected String _pickingWorkNo;

    /** TOTAL_PRICE: {decimal(16, 6)} */
    protected java.math.BigDecimal _totalPrice;

    /** TOTAL_TAX: {decimal(16, 6)} */
    protected java.math.BigDecimal _totalTax;

    /** PRICE: {decimal(16, 6)} */
    protected java.math.BigDecimal _price;

    /** TAX: {decimal(16, 6)} */
    protected java.math.BigDecimal _tax;

    /** SHIPPING_INST_B_ID: {bigint(19)} */
    protected Long _shippingInstBId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlDeliverySlipListPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlDeliverySlipListPrint";
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of packingOutFlg as the classification of ListOutFlg. <br>
     * PACKING_OUT_FLG: {char(1), classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getPackingOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getPackingOutFlg());
    }

    /**
     * Set the value of packingOutFlg as the classification of ListOutFlg. <br>
     * PACKING_OUT_FLG: {char(1), classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPackingOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setPackingOutFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of packingOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setPackingOutFlg_$0() {
        setPackingOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of packingOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setPackingOutFlg_$1() {
        setPackingOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of packingOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingOutFlg$0() {
        CDef.ListOutFlg cdef = getPackingOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of packingOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingOutFlg$1() {
        CDef.ListOutFlg cdef = getPackingOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'packingOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPackingOutFlgName() {
        CDef.ListOutFlg cdef = getPackingOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
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
        if (obj instanceof BsSqlDeliverySlipListPrint) {
            BsSqlDeliverySlipListPrint other = (BsSqlDeliverySlipListPrint)obj;
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_supplyCustomerCd, other._supplyCustomerCd)) { return false; }
            if (!xSV(_supplyCustomerNm, other._supplyCustomerNm)) { return false; }
            if (!xSV(_shippingDt, other._shippingDt)) { return false; }
            if (!xSV(_delivDt, other._delivDt)) { return false; }
            if (!xSV(_shippingSlipNo, other._shippingSlipNo)) { return false; }
            if (!xSV(_clientShippingNo, other._clientShippingNo)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_telNo, other._telNo)) { return false; }
            if (!xSV(_lot, other._lot)) { return false; }
            if (!xSV(_limitDt, other._limitDt)) { return false; }
            if (!xSV(_pickingNum, other._pickingNum)) { return false; }
            if (!xSV(_packingOutFlg, other._packingOutFlg)) { return false; }
            if (!xSV(_pickingWorkNo, other._pickingWorkNo)) { return false; }
            if (!xSV(_totalPrice, other._totalPrice)) { return false; }
            if (!xSV(_totalTax, other._totalTax)) { return false; }
            if (!xSV(_price, other._price)) { return false; }
            if (!xSV(_tax, other._tax)) { return false; }
            if (!xSV(_shippingInstBId, other._shippingInstBId)) { return false; }
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
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _supplyCustomerCd);
        hs = xCH(hs, _supplyCustomerNm);
        hs = xCH(hs, _shippingDt);
        hs = xCH(hs, _delivDt);
        hs = xCH(hs, _shippingSlipNo);
        hs = xCH(hs, _clientShippingNo);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _telNo);
        hs = xCH(hs, _lot);
        hs = xCH(hs, _limitDt);
        hs = xCH(hs, _pickingNum);
        hs = xCH(hs, _packingOutFlg);
        hs = xCH(hs, _pickingWorkNo);
        hs = xCH(hs, _totalPrice);
        hs = xCH(hs, _totalTax);
        hs = xCH(hs, _price);
        hs = xCH(hs, _tax);
        hs = xCH(hs, _shippingInstBId);
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
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_delivDt));
        sb.append(dm).append(xfND(_shippingSlipNo));
        sb.append(dm).append(xfND(_clientShippingNo));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_telNo));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_pickingNum));
        sb.append(dm).append(xfND(_packingOutFlg));
        sb.append(dm).append(xfND(_pickingWorkNo));
        sb.append(dm).append(xfND(_totalPrice));
        sb.append(dm).append(xfND(_totalTax));
        sb.append(dm).append(xfND(_price));
        sb.append(dm).append(xfND(_tax));
        sb.append(dm).append(xfND(_shippingInstBId));
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
    public SqlDeliverySlipListPrint clone() {
        return (SqlDeliverySlipListPrint)super.clone();
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
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerCd() {
        checkSpecifiedProperty("supplyCustomerCd");
        return convertEmptyToNull(_supplyCustomerCd);
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        registerModifiedProperty("supplyCustomerCd");
        _supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(60)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
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
     * [get] DELIV_DT: {varchar(8)} <br>
     * @return The value of the column 'DELIV_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivDt() {
        checkSpecifiedProperty("delivDt");
        return convertEmptyToNull(_delivDt);
    }

    /**
     * [set] DELIV_DT: {varchar(8)} <br>
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivDt(String delivDt) {
        registerModifiedProperty("delivDt");
        _delivDt = delivDt;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {varchar(30)} <br>
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingSlipNo() {
        checkSpecifiedProperty("shippingSlipNo");
        return convertEmptyToNull(_shippingSlipNo);
    }

    /**
     * [set] SHIPPING_SLIP_NO: {varchar(30)} <br>
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        registerModifiedProperty("shippingSlipNo");
        _shippingSlipNo = shippingSlipNo;
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
     * [get] TEL_NO: {varchar(30)} <br>
     * @return The value of the column 'TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTelNo() {
        checkSpecifiedProperty("telNo");
        return convertEmptyToNull(_telNo);
    }

    /**
     * [set] TEL_NO: {varchar(30)} <br>
     * @param telNo The value of the column 'TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTelNo(String telNo) {
        registerModifiedProperty("telNo");
        _telNo = telNo;
    }

    /**
     * [get] LOT: {varchar(30)} <br>
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {varchar(30)} <br>
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] LIMIT_DT: {varchar(8)} <br>
     * @return The value of the column 'LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] LIMIT_DT: {varchar(8)} <br>
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
    }

    /**
     * [get] PICKING_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'PICKING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPickingNum() {
        checkSpecifiedProperty("pickingNum");
        return _pickingNum;
    }

    /**
     * [set] PICKING_NUM: {decimal(38, 6)} <br>
     * @param pickingNum The value of the column 'PICKING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingNum(java.math.BigDecimal pickingNum) {
        registerModifiedProperty("pickingNum");
        _pickingNum = pickingNum;
    }

    /**
     * [get] PACKING_OUT_FLG: {char(1), classification=ListOutFlg} <br>
     * // cls(ListOutFlg)
     * @return The value of the column 'PACKING_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingOutFlg() {
        checkSpecifiedProperty("packingOutFlg");
        return convertEmptyToNull(_packingOutFlg);
    }

    /**
     * [set] PACKING_OUT_FLG: {char(1), classification=ListOutFlg} <br>
     * // cls(ListOutFlg)
     * @param packingOutFlg The value of the column 'PACKING_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingOutFlg(String packingOutFlg) {
        registerModifiedProperty("packingOutFlg");
        _packingOutFlg = packingOutFlg;
    }

    /**
     * [get] PICKING_WORK_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkNo() {
        checkSpecifiedProperty("pickingWorkNo");
        return convertEmptyToNull(_pickingWorkNo);
    }

    /**
     * [set] PICKING_WORK_NO: {varchar(30)} <br>
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        registerModifiedProperty("pickingWorkNo");
        _pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] TOTAL_PRICE: {decimal(16, 6)} <br>
     * @return The value of the column 'TOTAL_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTotalPrice() {
        checkSpecifiedProperty("totalPrice");
        return _totalPrice;
    }

    /**
     * [set] TOTAL_PRICE: {decimal(16, 6)} <br>
     * @param totalPrice The value of the column 'TOTAL_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalPrice(java.math.BigDecimal totalPrice) {
        registerModifiedProperty("totalPrice");
        _totalPrice = totalPrice;
    }

    /**
     * [get] TOTAL_TAX: {decimal(16, 6)} <br>
     * @return The value of the column 'TOTAL_TAX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTotalTax() {
        checkSpecifiedProperty("totalTax");
        return _totalTax;
    }

    /**
     * [set] TOTAL_TAX: {decimal(16, 6)} <br>
     * @param totalTax The value of the column 'TOTAL_TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalTax(java.math.BigDecimal totalTax) {
        registerModifiedProperty("totalTax");
        _totalTax = totalTax;
    }

    /**
     * [get] PRICE: {decimal(16, 6)} <br>
     * @return The value of the column 'PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPrice() {
        checkSpecifiedProperty("price");
        return _price;
    }

    /**
     * [set] PRICE: {decimal(16, 6)} <br>
     * @param price The value of the column 'PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrice(java.math.BigDecimal price) {
        registerModifiedProperty("price");
        _price = price;
    }

    /**
     * [get] TAX: {decimal(16, 6)} <br>
     * @return The value of the column 'TAX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTax() {
        checkSpecifiedProperty("tax");
        return _tax;
    }

    /**
     * [set] TAX: {decimal(16, 6)} <br>
     * @param tax The value of the column 'TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTax(java.math.BigDecimal tax) {
        registerModifiedProperty("tax");
        _tax = tax;
    }

    /**
     * [get] SHIPPING_INST_B_ID: {bigint(19)} <br>
     * @return The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingInstBId() {
        checkSpecifiedProperty("shippingInstBId");
        return _shippingInstBId;
    }

    /**
     * [set] SHIPPING_INST_B_ID: {bigint(19)} <br>
     * @param shippingInstBId The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingInstBId(Long shippingInstBId) {
        registerModifiedProperty("shippingInstBId");
        _shippingInstBId = shippingInstBId;
    }
}

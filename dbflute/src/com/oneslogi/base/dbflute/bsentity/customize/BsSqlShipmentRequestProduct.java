package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlShipmentRequestProduct. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CENTER_ID, CENTER_CD, WAREHOUSE_ID, PRODUCT_ABBR, PRODUCT_NM, COUNNTRY_OF_ORIGIN, UNIT_VAL, PACKING_NUM, HTS_CD, PRODUCT_CD
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
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String warehouseId = entity.getWarehouseId();
 * String productAbbr = entity.getProductAbbr();
 * String productNm = entity.getProductNm();
 * String counntryOfOrigin = entity.getCounntryOfOrigin();
 * java.math.BigDecimal unitVal = entity.getUnitVal();
 * java.math.BigDecimal packingNum = entity.getPackingNum();
 * String htsCd = entity.getHtsCd();
 * String productCd = entity.getProductCd();
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setWarehouseId(warehouseId);
 * entity.setProductAbbr(productAbbr);
 * entity.setProductNm(productNm);
 * entity.setCounntryOfOrigin(counntryOfOrigin);
 * entity.setUnitVal(unitVal);
 * entity.setPackingNum(packingNum);
 * entity.setHtsCd(htsCd);
 * entity.setProductCd(productCd);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlShipmentRequestProduct extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** WAREHOUSE_ID: {varchar(30)} */
    protected String _warehouseId;

    /** PRODUCT_ABBR: {varchar(60)} */
    protected String _productAbbr;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** COUNNTRY_OF_ORIGIN: {varchar(30)} */
    protected String _counntryOfOrigin;

    /** UNIT_VAL: {decimal(16, 6)} */
    protected java.math.BigDecimal _unitVal;

    /** PACKING_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum;

    /** HTS_CD: {varchar(30)} */
    protected String _htsCd;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlShipmentRequestProductDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlShipmentRequestProduct";
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
        if (obj instanceof BsSqlShipmentRequestProduct) {
            BsSqlShipmentRequestProduct other = (BsSqlShipmentRequestProduct)obj;
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_warehouseId, other._warehouseId)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_counntryOfOrigin, other._counntryOfOrigin)) { return false; }
            if (!xSV(_unitVal, other._unitVal)) { return false; }
            if (!xSV(_packingNum, other._packingNum)) { return false; }
            if (!xSV(_htsCd, other._htsCd)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _warehouseId);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _counntryOfOrigin);
        hs = xCH(hs, _unitVal);
        hs = xCH(hs, _packingNum);
        hs = xCH(hs, _htsCd);
        hs = xCH(hs, _productCd);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_warehouseId));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_counntryOfOrigin));
        sb.append(dm).append(xfND(_unitVal));
        sb.append(dm).append(xfND(_packingNum));
        sb.append(dm).append(xfND(_htsCd));
        sb.append(dm).append(xfND(_productCd));
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
    public SqlShipmentRequestProduct clone() {
        return (SqlShipmentRequestProduct)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

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
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
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
     * [get] WAREHOUSE_ID: {varchar(30)} <br>
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseId() {
        checkSpecifiedProperty("warehouseId");
        return convertEmptyToNull(_warehouseId);
    }

    /**
     * [set] WAREHOUSE_ID: {varchar(30)} <br>
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseId(String warehouseId) {
        registerModifiedProperty("warehouseId");
        _warehouseId = warehouseId;
    }

    /**
     * [get] PRODUCT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductAbbr() {
        checkSpecifiedProperty("productAbbr");
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(60)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductAbbr(String productAbbr) {
        registerModifiedProperty("productAbbr");
        _productAbbr = productAbbr;
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
     * [get] COUNNTRY_OF_ORIGIN: {varchar(30)} <br>
     * @return The value of the column 'COUNNTRY_OF_ORIGIN'. (NullAllowed even if selected: for no constraint)
     */
    public String getCounntryOfOrigin() {
        checkSpecifiedProperty("counntryOfOrigin");
        return convertEmptyToNull(_counntryOfOrigin);
    }

    /**
     * [set] COUNNTRY_OF_ORIGIN: {varchar(30)} <br>
     * @param counntryOfOrigin The value of the column 'COUNNTRY_OF_ORIGIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCounntryOfOrigin(String counntryOfOrigin) {
        registerModifiedProperty("counntryOfOrigin");
        _counntryOfOrigin = counntryOfOrigin;
    }

    /**
     * [get] UNIT_VAL: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT_VAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getUnitVal() {
        checkSpecifiedProperty("unitVal");
        return _unitVal;
    }

    /**
     * [set] UNIT_VAL: {decimal(16, 6)} <br>
     * @param unitVal The value of the column 'UNIT_VAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitVal(java.math.BigDecimal unitVal) {
        registerModifiedProperty("unitVal");
        _unitVal = unitVal;
    }

    /**
     * [get] PACKING_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum() {
        checkSpecifiedProperty("packingNum");
        return _packingNum;
    }

    /**
     * [set] PACKING_NUM: {decimal(38, 6)} <br>
     * @param packingNum The value of the column 'PACKING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum(java.math.BigDecimal packingNum) {
        registerModifiedProperty("packingNum");
        _packingNum = packingNum;
    }

    /**
     * [get] HTS_CD: {varchar(30)} <br>
     * @return The value of the column 'HTS_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getHtsCd() {
        checkSpecifiedProperty("htsCd");
        return convertEmptyToNull(_htsCd);
    }

    /**
     * [set] HTS_CD: {varchar(30)} <br>
     * @param htsCd The value of the column 'HTS_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHtsCd(String htsCd) {
        registerModifiedProperty("htsCd");
        _htsCd = htsCd;
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
}

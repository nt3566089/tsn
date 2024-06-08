package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlInstKeyList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_INST_KBN, INVENTORY_KEY, INVENTORY_DT, PRODUCT_DIVISION, LINE_BLOCK, DIRECTIONAL_PISTON, LOCATION_GRP, LOCATION_CD, FROM_LOCATION_CD, TO_LOCATION_CD, PRODUCT_CD, PRODUCT_NM, INVENTORY_INST_KBN_NM, PRODUCT_DIVISION_NM, LOCATION_GRP_NM, CLIENT_CD, CLIENT_NM, CENTER_CD, CENTER_NM
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
 * String inventoryInstKbn = entity.getInventoryInstKbn();
 * Long inventoryKey = entity.getInventoryKey();
 * String inventoryDt = entity.getInventoryDt();
 * String productDivision = entity.getProductDivision();
 * String lineBlock = entity.getLineBlock();
 * String directionalPiston = entity.getDirectionalPiston();
 * String locationGrp = entity.getLocationGrp();
 * String locationCd = entity.getLocationCd();
 * String fromLocationCd = entity.getFromLocationCd();
 * String toLocationCd = entity.getToLocationCd();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String inventoryInstKbnNm = entity.getInventoryInstKbnNm();
 * String productDivisionNm = entity.getProductDivisionNm();
 * String locationGrpNm = entity.getLocationGrpNm();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * entity.setInventoryInstKbn(inventoryInstKbn);
 * entity.setInventoryKey(inventoryKey);
 * entity.setInventoryDt(inventoryDt);
 * entity.setProductDivision(productDivision);
 * entity.setLineBlock(lineBlock);
 * entity.setDirectionalPiston(directionalPiston);
 * entity.setLocationGrp(locationGrp);
 * entity.setLocationCd(locationCd);
 * entity.setFromLocationCd(fromLocationCd);
 * entity.setToLocationCd(toLocationCd);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setInventoryInstKbnNm(inventoryInstKbnNm);
 * entity.setProductDivisionNm(productDivisionNm);
 * entity.setLocationGrpNm(locationGrpNm);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlInstKeyList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_INST_KBN: {varchar(30)} */
    protected String _inventoryInstKbn;

    /** INVENTORY_KEY: {bigint(19)} */
    protected Long _inventoryKey;

    /** INVENTORY_DT: {varchar(8)} */
    protected String _inventoryDt;

    /** PRODUCT_DIVISION: {varchar(30)} */
    protected String _productDivision;

    /** LINE_BLOCK: {varchar(30)} */
    protected String _lineBlock;

    /** DIRECTIONAL_PISTON: {varchar(255)} */
    protected String _directionalPiston;

    /** LOCATION_GRP: {varchar(30)} */
    protected String _locationGrp;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** FROM_LOCATION_CD: {varchar(30)} */
    protected String _fromLocationCd;

    /** TO_LOCATION_CD: {varchar(30)} */
    protected String _toLocationCd;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** INVENTORY_INST_KBN_NM: {varchar(100)} */
    protected String _inventoryInstKbnNm;

    /** PRODUCT_DIVISION_NM: {varchar(100)} */
    protected String _productDivisionNm;

    /** LOCATION_GRP_NM: {varchar(100)} */
    protected String _locationGrpNm;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlInstKeyListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlInstKeyList";
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
        if (obj instanceof BsSqlInstKeyList) {
            BsSqlInstKeyList other = (BsSqlInstKeyList)obj;
            if (!xSV(_inventoryInstKbn, other._inventoryInstKbn)) { return false; }
            if (!xSV(_inventoryKey, other._inventoryKey)) { return false; }
            if (!xSV(_inventoryDt, other._inventoryDt)) { return false; }
            if (!xSV(_productDivision, other._productDivision)) { return false; }
            if (!xSV(_lineBlock, other._lineBlock)) { return false; }
            if (!xSV(_directionalPiston, other._directionalPiston)) { return false; }
            if (!xSV(_locationGrp, other._locationGrp)) { return false; }
            if (!xSV(_locationCd, other._locationCd)) { return false; }
            if (!xSV(_fromLocationCd, other._fromLocationCd)) { return false; }
            if (!xSV(_toLocationCd, other._toLocationCd)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_inventoryInstKbnNm, other._inventoryInstKbnNm)) { return false; }
            if (!xSV(_productDivisionNm, other._productDivisionNm)) { return false; }
            if (!xSV(_locationGrpNm, other._locationGrpNm)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _inventoryInstKbn);
        hs = xCH(hs, _inventoryKey);
        hs = xCH(hs, _inventoryDt);
        hs = xCH(hs, _productDivision);
        hs = xCH(hs, _lineBlock);
        hs = xCH(hs, _directionalPiston);
        hs = xCH(hs, _locationGrp);
        hs = xCH(hs, _locationCd);
        hs = xCH(hs, _fromLocationCd);
        hs = xCH(hs, _toLocationCd);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _inventoryInstKbnNm);
        hs = xCH(hs, _productDivisionNm);
        hs = xCH(hs, _locationGrpNm);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryInstKbn));
        sb.append(dm).append(xfND(_inventoryKey));
        sb.append(dm).append(xfND(_inventoryDt));
        sb.append(dm).append(xfND(_productDivision));
        sb.append(dm).append(xfND(_lineBlock));
        sb.append(dm).append(xfND(_directionalPiston));
        sb.append(dm).append(xfND(_locationGrp));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_fromLocationCd));
        sb.append(dm).append(xfND(_toLocationCd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_inventoryInstKbnNm));
        sb.append(dm).append(xfND(_productDivisionNm));
        sb.append(dm).append(xfND(_locationGrpNm));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
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
    public SqlInstKeyList clone() {
        return (SqlInstKeyList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_INST_KBN: {varchar(30)} <br>
     * @return The value of the column 'INVENTORY_INST_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryInstKbn() {
        checkSpecifiedProperty("inventoryInstKbn");
        return convertEmptyToNull(_inventoryInstKbn);
    }

    /**
     * [set] INVENTORY_INST_KBN: {varchar(30)} <br>
     * @param inventoryInstKbn The value of the column 'INVENTORY_INST_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryInstKbn(String inventoryInstKbn) {
        registerModifiedProperty("inventoryInstKbn");
        _inventoryInstKbn = inventoryInstKbn;
    }

    /**
     * [get] INVENTORY_KEY: {bigint(19)} <br>
     * @return The value of the column 'INVENTORY_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryKey() {
        checkSpecifiedProperty("inventoryKey");
        return _inventoryKey;
    }

    /**
     * [set] INVENTORY_KEY: {bigint(19)} <br>
     * @param inventoryKey The value of the column 'INVENTORY_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryKey(Long inventoryKey) {
        registerModifiedProperty("inventoryKey");
        _inventoryKey = inventoryKey;
    }

    /**
     * [get] INVENTORY_DT: {varchar(8)} <br>
     * @return The value of the column 'INVENTORY_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryDt() {
        checkSpecifiedProperty("inventoryDt");
        return convertEmptyToNull(_inventoryDt);
    }

    /**
     * [set] INVENTORY_DT: {varchar(8)} <br>
     * @param inventoryDt The value of the column 'INVENTORY_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryDt(String inventoryDt) {
        registerModifiedProperty("inventoryDt");
        _inventoryDt = inventoryDt;
    }

    /**
     * [get] PRODUCT_DIVISION: {varchar(30)} <br>
     * @return The value of the column 'PRODUCT_DIVISION'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductDivision() {
        checkSpecifiedProperty("productDivision");
        return convertEmptyToNull(_productDivision);
    }

    /**
     * [set] PRODUCT_DIVISION: {varchar(30)} <br>
     * @param productDivision The value of the column 'PRODUCT_DIVISION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductDivision(String productDivision) {
        registerModifiedProperty("productDivision");
        _productDivision = productDivision;
    }

    /**
     * [get] LINE_BLOCK: {varchar(30)} <br>
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineBlock() {
        checkSpecifiedProperty("lineBlock");
        return convertEmptyToNull(_lineBlock);
    }

    /**
     * [set] LINE_BLOCK: {varchar(30)} <br>
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineBlock(String lineBlock) {
        registerModifiedProperty("lineBlock");
        _lineBlock = lineBlock;
    }

    /**
     * [get] DIRECTIONAL_PISTON: {varchar(255)} <br>
     * @return The value of the column 'DIRECTIONAL_PISTON'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectionalPiston() {
        checkSpecifiedProperty("directionalPiston");
        return convertEmptyToNull(_directionalPiston);
    }

    /**
     * [set] DIRECTIONAL_PISTON: {varchar(255)} <br>
     * @param directionalPiston The value of the column 'DIRECTIONAL_PISTON'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionalPiston(String directionalPiston) {
        registerModifiedProperty("directionalPiston");
        _directionalPiston = directionalPiston;
    }

    /**
     * [get] LOCATION_GRP: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_GRP'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationGrp() {
        checkSpecifiedProperty("locationGrp");
        return convertEmptyToNull(_locationGrp);
    }

    /**
     * [set] LOCATION_GRP: {varchar(30)} <br>
     * @param locationGrp The value of the column 'LOCATION_GRP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationGrp(String locationGrp) {
        registerModifiedProperty("locationGrp");
        _locationGrp = locationGrp;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] FROM_LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'FROM_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromLocationCd() {
        checkSpecifiedProperty("fromLocationCd");
        return convertEmptyToNull(_fromLocationCd);
    }

    /**
     * [set] FROM_LOCATION_CD: {varchar(30)} <br>
     * @param fromLocationCd The value of the column 'FROM_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromLocationCd(String fromLocationCd) {
        registerModifiedProperty("fromLocationCd");
        _fromLocationCd = fromLocationCd;
    }

    /**
     * [get] TO_LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'TO_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getToLocationCd() {
        checkSpecifiedProperty("toLocationCd");
        return convertEmptyToNull(_toLocationCd);
    }

    /**
     * [set] TO_LOCATION_CD: {varchar(30)} <br>
     * @param toLocationCd The value of the column 'TO_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToLocationCd(String toLocationCd) {
        registerModifiedProperty("toLocationCd");
        _toLocationCd = toLocationCd;
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
     * [get] INVENTORY_INST_KBN_NM: {varchar(100)} <br>
     * @return The value of the column 'INVENTORY_INST_KBN_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryInstKbnNm() {
        checkSpecifiedProperty("inventoryInstKbnNm");
        return convertEmptyToNull(_inventoryInstKbnNm);
    }

    /**
     * [set] INVENTORY_INST_KBN_NM: {varchar(100)} <br>
     * @param inventoryInstKbnNm The value of the column 'INVENTORY_INST_KBN_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryInstKbnNm(String inventoryInstKbnNm) {
        registerModifiedProperty("inventoryInstKbnNm");
        _inventoryInstKbnNm = inventoryInstKbnNm;
    }

    /**
     * [get] PRODUCT_DIVISION_NM: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_DIVISION_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductDivisionNm() {
        checkSpecifiedProperty("productDivisionNm");
        return convertEmptyToNull(_productDivisionNm);
    }

    /**
     * [set] PRODUCT_DIVISION_NM: {varchar(100)} <br>
     * @param productDivisionNm The value of the column 'PRODUCT_DIVISION_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductDivisionNm(String productDivisionNm) {
        registerModifiedProperty("productDivisionNm");
        _productDivisionNm = productDivisionNm;
    }

    /**
     * [get] LOCATION_GRP_NM: {varchar(100)} <br>
     * @return The value of the column 'LOCATION_GRP_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationGrpNm() {
        checkSpecifiedProperty("locationGrpNm");
        return convertEmptyToNull(_locationGrpNm);
    }

    /**
     * [set] LOCATION_GRP_NM: {varchar(100)} <br>
     * @param locationGrpNm The value of the column 'LOCATION_GRP_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationGrpNm(String locationGrpNm) {
        registerModifiedProperty("locationGrpNm");
        _locationGrpNm = locationGrpNm;
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
}

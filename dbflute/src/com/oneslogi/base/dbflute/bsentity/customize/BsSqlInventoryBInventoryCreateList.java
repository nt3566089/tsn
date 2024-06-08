package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlInventoryBInventoryCreateList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_B_ID, INVENTORY_KEY, INVENTORY_DT, PRODUCT_CD, LOCATION_CD, MANUFACTURE_DATE, TRMANUFACTUREDATEDETAIL_ID, CENTER_ID, CLIENT_ID, CENTER_CD, OWNER_CD, INVENTORY_KBN, LINE_BLOCK, INVENTORY_DATE, BF_MANUFACTURE_DATE, AF_MANUFACTURE_DATE, DESIGN_FLG, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
 * Long inventoryBId = entity.getInventoryBId();
 * String inventoryKey = entity.getInventoryKey();
 * String inventoryDt = entity.getInventoryDt();
 * String productCd = entity.getProductCd();
 * String locationCd = entity.getLocationCd();
 * String manufactureDate = entity.getManufactureDate();
 * Long trmanufacturedatedetailId = entity.getTrmanufacturedatedetailId();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String centerCd = entity.getCenterCd();
 * String ownerCd = entity.getOwnerCd();
 * String inventoryKbn = entity.getInventoryKbn();
 * String lineBlock = entity.getLineBlock();
 * String inventoryDate = entity.getInventoryDate();
 * String bfManufactureDate = entity.getBfManufactureDate();
 * String afManufactureDate = entity.getAfManufactureDate();
 * String designFlg = entity.getDesignFlg();
 * Long versionNo = entity.getVersionNo();
 * entity.setInventoryBId(inventoryBId);
 * entity.setInventoryKey(inventoryKey);
 * entity.setInventoryDt(inventoryDt);
 * entity.setProductCd(productCd);
 * entity.setLocationCd(locationCd);
 * entity.setManufactureDate(manufactureDate);
 * entity.setTrmanufacturedatedetailId(trmanufacturedatedetailId);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setCenterCd(centerCd);
 * entity.setOwnerCd(ownerCd);
 * entity.setInventoryKbn(inventoryKbn);
 * entity.setLineBlock(lineBlock);
 * entity.setInventoryDate(inventoryDate);
 * entity.setBfManufactureDate(bfManufactureDate);
 * entity.setAfManufactureDate(afManufactureDate);
 * entity.setDesignFlg(designFlg);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlInventoryBInventoryCreateList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_B_ID: {bigint(19)} */
    protected Long _inventoryBId;

    /** INVENTORY_KEY: {varchar(30)} */
    protected String _inventoryKey;

    /** INVENTORY_DT: {varchar(8)} */
    protected String _inventoryDt;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** MANUFACTURE_DATE: {varchar(8)} */
    protected String _manufactureDate;

    /** TRMANUFACTUREDATEDETAIL_ID: {bigint(19)} */
    protected Long _trmanufacturedatedetailId;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** OWNER_CD: {varchar(30)} */
    protected String _ownerCd;

    /** INVENTORY_KBN: {varchar(30)} */
    protected String _inventoryKbn;

    /** LINE_BLOCK: {varchar(30)} */
    protected String _lineBlock;

    /** INVENTORY_DATE: {varchar(8)} */
    protected String _inventoryDate;

    /** BF_MANUFACTURE_DATE: {varchar(8)} */
    protected String _bfManufactureDate;

    /** AF_MANUFACTURE_DATE: {varchar(8)} */
    protected String _afManufactureDate;

    /** DESIGN_FLG: {varchar(30)} */
    protected String _designFlg;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlInventoryBInventoryCreateListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlInventoryBInventoryCreateList";
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
        if (obj instanceof BsSqlInventoryBInventoryCreateList) {
            BsSqlInventoryBInventoryCreateList other = (BsSqlInventoryBInventoryCreateList)obj;
            if (!xSV(_inventoryBId, other._inventoryBId)) { return false; }
            if (!xSV(_inventoryKey, other._inventoryKey)) { return false; }
            if (!xSV(_inventoryDt, other._inventoryDt)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_locationCd, other._locationCd)) { return false; }
            if (!xSV(_manufactureDate, other._manufactureDate)) { return false; }
            if (!xSV(_trmanufacturedatedetailId, other._trmanufacturedatedetailId)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_ownerCd, other._ownerCd)) { return false; }
            if (!xSV(_inventoryKbn, other._inventoryKbn)) { return false; }
            if (!xSV(_lineBlock, other._lineBlock)) { return false; }
            if (!xSV(_inventoryDate, other._inventoryDate)) { return false; }
            if (!xSV(_bfManufactureDate, other._bfManufactureDate)) { return false; }
            if (!xSV(_afManufactureDate, other._afManufactureDate)) { return false; }
            if (!xSV(_designFlg, other._designFlg)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _inventoryBId);
        hs = xCH(hs, _inventoryKey);
        hs = xCH(hs, _inventoryDt);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _locationCd);
        hs = xCH(hs, _manufactureDate);
        hs = xCH(hs, _trmanufacturedatedetailId);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _ownerCd);
        hs = xCH(hs, _inventoryKbn);
        hs = xCH(hs, _lineBlock);
        hs = xCH(hs, _inventoryDate);
        hs = xCH(hs, _bfManufactureDate);
        hs = xCH(hs, _afManufactureDate);
        hs = xCH(hs, _designFlg);
        hs = xCH(hs, _versionNo);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryBId));
        sb.append(dm).append(xfND(_inventoryKey));
        sb.append(dm).append(xfND(_inventoryDt));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_manufactureDate));
        sb.append(dm).append(xfND(_trmanufacturedatedetailId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_ownerCd));
        sb.append(dm).append(xfND(_inventoryKbn));
        sb.append(dm).append(xfND(_lineBlock));
        sb.append(dm).append(xfND(_inventoryDate));
        sb.append(dm).append(xfND(_bfManufactureDate));
        sb.append(dm).append(xfND(_afManufactureDate));
        sb.append(dm).append(xfND(_designFlg));
        sb.append(dm).append(xfND(_versionNo));
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
    public SqlInventoryBInventoryCreateList clone() {
        return (SqlInventoryBInventoryCreateList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_B_ID: {bigint(19)} <br>
     * @return The value of the column 'INVENTORY_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryBId() {
        checkSpecifiedProperty("inventoryBId");
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {bigint(19)} <br>
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryBId(Long inventoryBId) {
        registerModifiedProperty("inventoryBId");
        _inventoryBId = inventoryBId;
    }

    /**
     * [get] INVENTORY_KEY: {varchar(30)} <br>
     * @return The value of the column 'INVENTORY_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryKey() {
        checkSpecifiedProperty("inventoryKey");
        return convertEmptyToNull(_inventoryKey);
    }

    /**
     * [set] INVENTORY_KEY: {varchar(30)} <br>
     * @param inventoryKey The value of the column 'INVENTORY_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryKey(String inventoryKey) {
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
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
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
     * [get] MANUFACTURE_DATE: {varchar(8)} <br>
     * @return The value of the column 'MANUFACTURE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufactureDate() {
        checkSpecifiedProperty("manufactureDate");
        return convertEmptyToNull(_manufactureDate);
    }

    /**
     * [set] MANUFACTURE_DATE: {varchar(8)} <br>
     * @param manufactureDate The value of the column 'MANUFACTURE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufactureDate(String manufactureDate) {
        registerModifiedProperty("manufactureDate");
        _manufactureDate = manufactureDate;
    }

    /**
     * [get] TRMANUFACTUREDATEDETAIL_ID: {bigint(19)} <br>
     * @return The value of the column 'TRMANUFACTUREDATEDETAIL_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrmanufacturedatedetailId() {
        checkSpecifiedProperty("trmanufacturedatedetailId");
        return _trmanufacturedatedetailId;
    }

    /**
     * [set] TRMANUFACTUREDATEDETAIL_ID: {bigint(19)} <br>
     * @param trmanufacturedatedetailId The value of the column 'TRMANUFACTUREDATEDETAIL_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrmanufacturedatedetailId(Long trmanufacturedatedetailId) {
        registerModifiedProperty("trmanufacturedatedetailId");
        _trmanufacturedatedetailId = trmanufacturedatedetailId;
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
     * [get] OWNER_CD: {varchar(30)} <br>
     * @return The value of the column 'OWNER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnerCd() {
        checkSpecifiedProperty("ownerCd");
        return convertEmptyToNull(_ownerCd);
    }

    /**
     * [set] OWNER_CD: {varchar(30)} <br>
     * @param ownerCd The value of the column 'OWNER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnerCd(String ownerCd) {
        registerModifiedProperty("ownerCd");
        _ownerCd = ownerCd;
    }

    /**
     * [get] INVENTORY_KBN: {varchar(30)} <br>
     * @return The value of the column 'INVENTORY_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryKbn() {
        checkSpecifiedProperty("inventoryKbn");
        return convertEmptyToNull(_inventoryKbn);
    }

    /**
     * [set] INVENTORY_KBN: {varchar(30)} <br>
     * @param inventoryKbn The value of the column 'INVENTORY_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryKbn(String inventoryKbn) {
        registerModifiedProperty("inventoryKbn");
        _inventoryKbn = inventoryKbn;
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
     * [get] INVENTORY_DATE: {varchar(8)} <br>
     * @return The value of the column 'INVENTORY_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryDate() {
        checkSpecifiedProperty("inventoryDate");
        return convertEmptyToNull(_inventoryDate);
    }

    /**
     * [set] INVENTORY_DATE: {varchar(8)} <br>
     * @param inventoryDate The value of the column 'INVENTORY_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryDate(String inventoryDate) {
        registerModifiedProperty("inventoryDate");
        _inventoryDate = inventoryDate;
    }

    /**
     * [get] BF_MANUFACTURE_DATE: {varchar(8)} <br>
     * @return The value of the column 'BF_MANUFACTURE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBfManufactureDate() {
        checkSpecifiedProperty("bfManufactureDate");
        return convertEmptyToNull(_bfManufactureDate);
    }

    /**
     * [set] BF_MANUFACTURE_DATE: {varchar(8)} <br>
     * @param bfManufactureDate The value of the column 'BF_MANUFACTURE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBfManufactureDate(String bfManufactureDate) {
        registerModifiedProperty("bfManufactureDate");
        _bfManufactureDate = bfManufactureDate;
    }

    /**
     * [get] AF_MANUFACTURE_DATE: {varchar(8)} <br>
     * @return The value of the column 'AF_MANUFACTURE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getAfManufactureDate() {
        checkSpecifiedProperty("afManufactureDate");
        return convertEmptyToNull(_afManufactureDate);
    }

    /**
     * [set] AF_MANUFACTURE_DATE: {varchar(8)} <br>
     * @param afManufactureDate The value of the column 'AF_MANUFACTURE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAfManufactureDate(String afManufactureDate) {
        registerModifiedProperty("afManufactureDate");
        _afManufactureDate = afManufactureDate;
    }

    /**
     * [get] DESIGN_FLG: {varchar(30)} <br>
     * @return The value of the column 'DESIGN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesignFlg() {
        checkSpecifiedProperty("designFlg");
        return convertEmptyToNull(_designFlg);
    }

    /**
     * [set] DESIGN_FLG: {varchar(30)} <br>
     * @param designFlg The value of the column 'DESIGN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesignFlg(String designFlg) {
        registerModifiedProperty("designFlg");
        _designFlg = designFlg;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}

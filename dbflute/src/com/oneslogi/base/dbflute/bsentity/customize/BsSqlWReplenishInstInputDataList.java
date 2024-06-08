package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlWReplenishInstInputDataList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     FLEXLNS_NO, SCH_DATE, SUPPLIER_CD, RCV_DATE, SHIP_CD, ITEM_CD, MANUFACTURE_DATE, DESIGN_CD, QTY, FLEX_UPD_USER_CD, REPLENISH_INST_INPUT_ID, VERSION_NO, OTHERCD1, OTHERCD2
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
 * String flexlnsNo = entity.getFlexlnsNo();
 * String schDate = entity.getSchDate();
 * String supplierCd = entity.getSupplierCd();
 * String rcvDate = entity.getRcvDate();
 * String shipCd = entity.getShipCd();
 * String itemCd = entity.getItemCd();
 * String manufactureDate = entity.getManufactureDate();
 * String designCd = entity.getDesignCd();
 * String qty = entity.getQty();
 * String flexUpdUserCd = entity.getFlexUpdUserCd();
 * Long replenishInstInputId = entity.getReplenishInstInputId();
 * Long versionNo = entity.getVersionNo();
 * String othercd1 = entity.getOthercd1();
 * String othercd2 = entity.getOthercd2();
 * entity.setFlexlnsNo(flexlnsNo);
 * entity.setSchDate(schDate);
 * entity.setSupplierCd(supplierCd);
 * entity.setRcvDate(rcvDate);
 * entity.setShipCd(shipCd);
 * entity.setItemCd(itemCd);
 * entity.setManufactureDate(manufactureDate);
 * entity.setDesignCd(designCd);
 * entity.setQty(qty);
 * entity.setFlexUpdUserCd(flexUpdUserCd);
 * entity.setReplenishInstInputId(replenishInstInputId);
 * entity.setVersionNo(versionNo);
 * entity.setOthercd1(othercd1);
 * entity.setOthercd2(othercd2);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlWReplenishInstInputDataList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** FLEXLNS_NO: {varchar(255)} */
    protected String _flexlnsNo;

    /** SCH_DATE: {varchar(255)} */
    protected String _schDate;

    /** SUPPLIER_CD: {varchar(255)} */
    protected String _supplierCd;

    /** RCV_DATE: {varchar(255)} */
    protected String _rcvDate;

    /** SHIP_CD: {varchar(255)} */
    protected String _shipCd;

    /** ITEM_CD: {varchar(255)} */
    protected String _itemCd;

    /** MANUFACTURE_DATE: {varchar(255)} */
    protected String _manufactureDate;

    /** DESIGN_CD: {varchar(255)} */
    protected String _designCd;

    /** QTY: {varchar(255)} */
    protected String _qty;

    /** FLEX_UPD_USER_CD: {varchar(255)} */
    protected String _flexUpdUserCd;

    /** REPLENISH_INST_INPUT_ID: {bigint(19)} */
    protected Long _replenishInstInputId;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** OTHERCD1: {varchar(30)} */
    protected String _othercd1;

    /** OTHERCD2: {varchar(30)} */
    protected String _othercd2;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlWReplenishInstInputDataListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlWReplenishInstInputDataList";
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
        if (obj instanceof BsSqlWReplenishInstInputDataList) {
            BsSqlWReplenishInstInputDataList other = (BsSqlWReplenishInstInputDataList)obj;
            if (!xSV(_flexlnsNo, other._flexlnsNo)) { return false; }
            if (!xSV(_schDate, other._schDate)) { return false; }
            if (!xSV(_supplierCd, other._supplierCd)) { return false; }
            if (!xSV(_rcvDate, other._rcvDate)) { return false; }
            if (!xSV(_shipCd, other._shipCd)) { return false; }
            if (!xSV(_itemCd, other._itemCd)) { return false; }
            if (!xSV(_manufactureDate, other._manufactureDate)) { return false; }
            if (!xSV(_designCd, other._designCd)) { return false; }
            if (!xSV(_qty, other._qty)) { return false; }
            if (!xSV(_flexUpdUserCd, other._flexUpdUserCd)) { return false; }
            if (!xSV(_replenishInstInputId, other._replenishInstInputId)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_othercd1, other._othercd1)) { return false; }
            if (!xSV(_othercd2, other._othercd2)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _flexlnsNo);
        hs = xCH(hs, _schDate);
        hs = xCH(hs, _supplierCd);
        hs = xCH(hs, _rcvDate);
        hs = xCH(hs, _shipCd);
        hs = xCH(hs, _itemCd);
        hs = xCH(hs, _manufactureDate);
        hs = xCH(hs, _designCd);
        hs = xCH(hs, _qty);
        hs = xCH(hs, _flexUpdUserCd);
        hs = xCH(hs, _replenishInstInputId);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _othercd1);
        hs = xCH(hs, _othercd2);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_flexlnsNo));
        sb.append(dm).append(xfND(_schDate));
        sb.append(dm).append(xfND(_supplierCd));
        sb.append(dm).append(xfND(_rcvDate));
        sb.append(dm).append(xfND(_shipCd));
        sb.append(dm).append(xfND(_itemCd));
        sb.append(dm).append(xfND(_manufactureDate));
        sb.append(dm).append(xfND(_designCd));
        sb.append(dm).append(xfND(_qty));
        sb.append(dm).append(xfND(_flexUpdUserCd));
        sb.append(dm).append(xfND(_replenishInstInputId));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_othercd1));
        sb.append(dm).append(xfND(_othercd2));
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
    public SqlWReplenishInstInputDataList clone() {
        return (SqlWReplenishInstInputDataList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FLEXLNS_NO: {varchar(255)} <br>
     * @return The value of the column 'FLEXLNS_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlexlnsNo() {
        checkSpecifiedProperty("flexlnsNo");
        return convertEmptyToNull(_flexlnsNo);
    }

    /**
     * [set] FLEXLNS_NO: {varchar(255)} <br>
     * @param flexlnsNo The value of the column 'FLEXLNS_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlexlnsNo(String flexlnsNo) {
        registerModifiedProperty("flexlnsNo");
        _flexlnsNo = flexlnsNo;
    }

    /**
     * [get] SCH_DATE: {varchar(255)} <br>
     * @return The value of the column 'SCH_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSchDate() {
        checkSpecifiedProperty("schDate");
        return convertEmptyToNull(_schDate);
    }

    /**
     * [set] SCH_DATE: {varchar(255)} <br>
     * @param schDate The value of the column 'SCH_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSchDate(String schDate) {
        registerModifiedProperty("schDate");
        _schDate = schDate;
    }

    /**
     * [get] SUPPLIER_CD: {varchar(255)} <br>
     * @return The value of the column 'SUPPLIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierCd() {
        checkSpecifiedProperty("supplierCd");
        return convertEmptyToNull(_supplierCd);
    }

    /**
     * [set] SUPPLIER_CD: {varchar(255)} <br>
     * @param supplierCd The value of the column 'SUPPLIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierCd(String supplierCd) {
        registerModifiedProperty("supplierCd");
        _supplierCd = supplierCd;
    }

    /**
     * [get] RCV_DATE: {varchar(255)} <br>
     * @return The value of the column 'RCV_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvDate() {
        checkSpecifiedProperty("rcvDate");
        return convertEmptyToNull(_rcvDate);
    }

    /**
     * [set] RCV_DATE: {varchar(255)} <br>
     * @param rcvDate The value of the column 'RCV_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvDate(String rcvDate) {
        registerModifiedProperty("rcvDate");
        _rcvDate = rcvDate;
    }

    /**
     * [get] SHIP_CD: {varchar(255)} <br>
     * @return The value of the column 'SHIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipCd() {
        checkSpecifiedProperty("shipCd");
        return convertEmptyToNull(_shipCd);
    }

    /**
     * [set] SHIP_CD: {varchar(255)} <br>
     * @param shipCd The value of the column 'SHIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipCd(String shipCd) {
        registerModifiedProperty("shipCd");
        _shipCd = shipCd;
    }

    /**
     * [get] ITEM_CD: {varchar(255)} <br>
     * @return The value of the column 'ITEM_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemCd() {
        checkSpecifiedProperty("itemCd");
        return convertEmptyToNull(_itemCd);
    }

    /**
     * [set] ITEM_CD: {varchar(255)} <br>
     * @param itemCd The value of the column 'ITEM_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemCd(String itemCd) {
        registerModifiedProperty("itemCd");
        _itemCd = itemCd;
    }

    /**
     * [get] MANUFACTURE_DATE: {varchar(255)} <br>
     * @return The value of the column 'MANUFACTURE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufactureDate() {
        checkSpecifiedProperty("manufactureDate");
        return convertEmptyToNull(_manufactureDate);
    }

    /**
     * [set] MANUFACTURE_DATE: {varchar(255)} <br>
     * @param manufactureDate The value of the column 'MANUFACTURE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufactureDate(String manufactureDate) {
        registerModifiedProperty("manufactureDate");
        _manufactureDate = manufactureDate;
    }

    /**
     * [get] DESIGN_CD: {varchar(255)} <br>
     * @return The value of the column 'DESIGN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesignCd() {
        checkSpecifiedProperty("designCd");
        return convertEmptyToNull(_designCd);
    }

    /**
     * [set] DESIGN_CD: {varchar(255)} <br>
     * @param designCd The value of the column 'DESIGN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesignCd(String designCd) {
        registerModifiedProperty("designCd");
        _designCd = designCd;
    }

    /**
     * [get] QTY: {varchar(255)} <br>
     * @return The value of the column 'QTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getQty() {
        checkSpecifiedProperty("qty");
        return convertEmptyToNull(_qty);
    }

    /**
     * [set] QTY: {varchar(255)} <br>
     * @param qty The value of the column 'QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty(String qty) {
        registerModifiedProperty("qty");
        _qty = qty;
    }

    /**
     * [get] FLEX_UPD_USER_CD: {varchar(255)} <br>
     * @return The value of the column 'FLEX_UPD_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlexUpdUserCd() {
        checkSpecifiedProperty("flexUpdUserCd");
        return convertEmptyToNull(_flexUpdUserCd);
    }

    /**
     * [set] FLEX_UPD_USER_CD: {varchar(255)} <br>
     * @param flexUpdUserCd The value of the column 'FLEX_UPD_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlexUpdUserCd(String flexUpdUserCd) {
        registerModifiedProperty("flexUpdUserCd");
        _flexUpdUserCd = flexUpdUserCd;
    }

    /**
     * [get] REPLENISH_INST_INPUT_ID: {bigint(19)} <br>
     * @return The value of the column 'REPLENISH_INST_INPUT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReplenishInstInputId() {
        checkSpecifiedProperty("replenishInstInputId");
        return _replenishInstInputId;
    }

    /**
     * [set] REPLENISH_INST_INPUT_ID: {bigint(19)} <br>
     * @param replenishInstInputId The value of the column 'REPLENISH_INST_INPUT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishInstInputId(Long replenishInstInputId) {
        registerModifiedProperty("replenishInstInputId");
        _replenishInstInputId = replenishInstInputId;
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

    /**
     * [get] OTHERCD1: {varchar(30)} <br>
     * @return The value of the column 'OTHERCD1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOthercd1() {
        checkSpecifiedProperty("othercd1");
        return convertEmptyToNull(_othercd1);
    }

    /**
     * [set] OTHERCD1: {varchar(30)} <br>
     * @param othercd1 The value of the column 'OTHERCD1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOthercd1(String othercd1) {
        registerModifiedProperty("othercd1");
        _othercd1 = othercd1;
    }

    /**
     * [get] OTHERCD2: {varchar(30)} <br>
     * @return The value of the column 'OTHERCD2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOthercd2() {
        checkSpecifiedProperty("othercd2");
        return convertEmptyToNull(_othercd2);
    }

    /**
     * [set] OTHERCD2: {varchar(30)} <br>
     * @param othercd2 The value of the column 'OTHERCD2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOthercd2(String othercd2) {
        registerModifiedProperty("othercd2");
        _othercd2 = othercd2;
    }
}

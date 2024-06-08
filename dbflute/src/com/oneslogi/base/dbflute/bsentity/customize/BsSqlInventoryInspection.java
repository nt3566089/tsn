package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlInventoryInspection. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_BODY_COUNT, INSPECTION_NOT_COMPLETE_COUNT
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
 * Long inventoryBodyCount = entity.getInventoryBodyCount();
 * Long inspectionNotCompleteCount = entity.getInspectionNotCompleteCount();
 * entity.setInventoryBodyCount(inventoryBodyCount);
 * entity.setInspectionNotCompleteCount(inspectionNotCompleteCount);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlInventoryInspection extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_BODY_COUNT: {int(10)} */
    protected Long _inventoryBodyCount;

    /** INSPECTION_NOT_COMPLETE_COUNT: {int(10)} */
    protected Long _inspectionNotCompleteCount;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlInventoryInspectionDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlInventoryInspection";
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
        if (obj instanceof BsSqlInventoryInspection) {
            BsSqlInventoryInspection other = (BsSqlInventoryInspection)obj;
            if (!xSV(_inventoryBodyCount, other._inventoryBodyCount)) { return false; }
            if (!xSV(_inspectionNotCompleteCount, other._inspectionNotCompleteCount)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _inventoryBodyCount);
        hs = xCH(hs, _inspectionNotCompleteCount);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryBodyCount));
        sb.append(dm).append(xfND(_inspectionNotCompleteCount));
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
    public SqlInventoryInspection clone() {
        return (SqlInventoryInspection)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_BODY_COUNT: {int(10)} <br>
     * @return The value of the column 'INVENTORY_BODY_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryBodyCount() {
        checkSpecifiedProperty("inventoryBodyCount");
        return _inventoryBodyCount;
    }

    /**
     * [set] INVENTORY_BODY_COUNT: {int(10)} <br>
     * @param inventoryBodyCount The value of the column 'INVENTORY_BODY_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryBodyCount(Long inventoryBodyCount) {
        registerModifiedProperty("inventoryBodyCount");
        _inventoryBodyCount = inventoryBodyCount;
    }

    /**
     * [get] INSPECTION_NOT_COMPLETE_COUNT: {int(10)} <br>
     * @return The value of the column 'INSPECTION_NOT_COMPLETE_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInspectionNotCompleteCount() {
        checkSpecifiedProperty("inspectionNotCompleteCount");
        return _inspectionNotCompleteCount;
    }

    /**
     * [set] INSPECTION_NOT_COMPLETE_COUNT: {int(10)} <br>
     * @param inspectionNotCompleteCount The value of the column 'INSPECTION_NOT_COMPLETE_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInspectionNotCompleteCount(Long inspectionNotCompleteCount) {
        registerModifiedProperty("inspectionNotCompleteCount");
        _inspectionNotCompleteCount = inspectionNotCompleteCount;
    }
}
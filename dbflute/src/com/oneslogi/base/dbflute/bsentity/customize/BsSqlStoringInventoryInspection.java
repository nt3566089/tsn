package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlStoringInventoryInspection. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INSPECTION_NOT_COMPLETE_COUNT
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
 * Long inspectionNotCompleteCount = entity.getInspectionNotCompleteCount();
 * entity.setInspectionNotCompleteCount(inspectionNotCompleteCount);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlStoringInventoryInspection extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INSPECTION_NOT_COMPLETE_COUNT: {int(10)} */
    protected Long _inspectionNotCompleteCount;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlStoringInventoryInspectionDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlStoringInventoryInspection";
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
        if (obj instanceof BsSqlStoringInventoryInspection) {
            BsSqlStoringInventoryInspection other = (BsSqlStoringInventoryInspection)obj;
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
    public SqlStoringInventoryInspection clone() {
        return (SqlStoringInventoryInspection)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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

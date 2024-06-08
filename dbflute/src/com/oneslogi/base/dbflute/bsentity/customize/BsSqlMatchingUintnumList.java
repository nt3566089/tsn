package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlMatchingUintnumList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MATCHING_KEYWORD, UNIT_NUM, GROSS_WEIGHT, SHAPE_SORT
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
 * String matchingKeyword = entity.getMatchingKeyword();
 * Long unitNum = entity.getUnitNum();
 * java.math.BigDecimal grossWeight = entity.getGrossWeight();
 * Long shapeSort = entity.getShapeSort();
 * entity.setMatchingKeyword(matchingKeyword);
 * entity.setUnitNum(unitNum);
 * entity.setGrossWeight(grossWeight);
 * entity.setShapeSort(shapeSort);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlMatchingUintnumList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MATCHING_KEYWORD: {varchar(100)} */
    protected String _matchingKeyword;

    /** UNIT_NUM: {bigint(19)} */
    protected Long _unitNum;

    /** GROSS_WEIGHT: {decimal(16, 6)} */
    protected java.math.BigDecimal _grossWeight;

    /** SHAPE_SORT: {bigint(19)} */
    protected Long _shapeSort;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlMatchingUintnumListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlMatchingUintnumList";
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
        if (obj instanceof BsSqlMatchingUintnumList) {
            BsSqlMatchingUintnumList other = (BsSqlMatchingUintnumList)obj;
            if (!xSV(_matchingKeyword, other._matchingKeyword)) { return false; }
            if (!xSV(_unitNum, other._unitNum)) { return false; }
            if (!xSV(_grossWeight, other._grossWeight)) { return false; }
            if (!xSV(_shapeSort, other._shapeSort)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _matchingKeyword);
        hs = xCH(hs, _unitNum);
        hs = xCH(hs, _grossWeight);
        hs = xCH(hs, _shapeSort);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_matchingKeyword));
        sb.append(dm).append(xfND(_unitNum));
        sb.append(dm).append(xfND(_grossWeight));
        sb.append(dm).append(xfND(_shapeSort));
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
    public SqlMatchingUintnumList clone() {
        return (SqlMatchingUintnumList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MATCHING_KEYWORD: {varchar(100)} <br>
     * @return The value of the column 'MATCHING_KEYWORD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMatchingKeyword() {
        checkSpecifiedProperty("matchingKeyword");
        return convertEmptyToNull(_matchingKeyword);
    }

    /**
     * [set] MATCHING_KEYWORD: {varchar(100)} <br>
     * @param matchingKeyword The value of the column 'MATCHING_KEYWORD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMatchingKeyword(String matchingKeyword) {
        registerModifiedProperty("matchingKeyword");
        _matchingKeyword = matchingKeyword;
    }

    /**
     * [get] UNIT_NUM: {bigint(19)} <br>
     * @return The value of the column 'UNIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnitNum() {
        checkSpecifiedProperty("unitNum");
        return _unitNum;
    }

    /**
     * [set] UNIT_NUM: {bigint(19)} <br>
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNum(Long unitNum) {
        registerModifiedProperty("unitNum");
        _unitNum = unitNum;
    }

    /**
     * [get] GROSS_WEIGHT: {decimal(16, 6)} <br>
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getGrossWeight() {
        checkSpecifiedProperty("grossWeight");
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {decimal(16, 6)} <br>
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGrossWeight(java.math.BigDecimal grossWeight) {
        registerModifiedProperty("grossWeight");
        _grossWeight = grossWeight;
    }

    /**
     * [get] SHAPE_SORT: {bigint(19)} <br>
     * @return The value of the column 'SHAPE_SORT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShapeSort() {
        checkSpecifiedProperty("shapeSort");
        return _shapeSort;
    }

    /**
     * [set] SHAPE_SORT: {bigint(19)} <br>
     * @param shapeSort The value of the column 'SHAPE_SORT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeSort(Long shapeSort) {
        registerModifiedProperty("shapeSort");
        _shapeSort = shapeSort;
    }
}

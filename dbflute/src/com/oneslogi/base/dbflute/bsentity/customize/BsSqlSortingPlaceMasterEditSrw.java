package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlSortingPlaceMasterEditSrw. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LOCIDFRNK, LOCIDFBRCTG1, LOCIDFBRCTG2, LOCIDFBRCTG3, LOCIDFBRCTG4, LOCIDFBRCTG5, LOCIDFBRCTG6, LOCIDFBRCTG7, LOCIDFBRCTG8, LOCIDFBRCTG9, LOCIDFBRCTG10, SORT_PLACE_MANAGE_ID, VERSION_NO, CENTER_ID, CENTER_CD, CLIENT_ID, CLIENT_CD
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
 * String locidfrnk = entity.getLocidfrnk();
 * Long locidfbrctg1 = entity.getLocidfbrctg1();
 * Long locidfbrctg2 = entity.getLocidfbrctg2();
 * Long locidfbrctg3 = entity.getLocidfbrctg3();
 * Long locidfbrctg4 = entity.getLocidfbrctg4();
 * Long locidfbrctg5 = entity.getLocidfbrctg5();
 * Long locidfbrctg6 = entity.getLocidfbrctg6();
 * Long locidfbrctg7 = entity.getLocidfbrctg7();
 * Long locidfbrctg8 = entity.getLocidfbrctg8();
 * Long locidfbrctg9 = entity.getLocidfbrctg9();
 * Long locidfbrctg10 = entity.getLocidfbrctg10();
 * Long sortPlaceManageId = entity.getSortPlaceManageId();
 * Long versionNo = entity.getVersionNo();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * Integer clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * entity.setLocidfrnk(locidfrnk);
 * entity.setLocidfbrctg1(locidfbrctg1);
 * entity.setLocidfbrctg2(locidfbrctg2);
 * entity.setLocidfbrctg3(locidfbrctg3);
 * entity.setLocidfbrctg4(locidfbrctg4);
 * entity.setLocidfbrctg5(locidfbrctg5);
 * entity.setLocidfbrctg6(locidfbrctg6);
 * entity.setLocidfbrctg7(locidfbrctg7);
 * entity.setLocidfbrctg8(locidfbrctg8);
 * entity.setLocidfbrctg9(locidfbrctg9);
 * entity.setLocidfbrctg10(locidfbrctg10);
 * entity.setSortPlaceManageId(sortPlaceManageId);
 * entity.setVersionNo(versionNo);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlSortingPlaceMasterEditSrw extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LOCIDFRNK: {varchar(30)} */
    protected String _locidfrnk;

    /** LOCIDFBRCTG1: {bigint(19)} */
    protected Long _locidfbrctg1;

    /** LOCIDFBRCTG2: {bigint(19)} */
    protected Long _locidfbrctg2;

    /** LOCIDFBRCTG3: {bigint(19)} */
    protected Long _locidfbrctg3;

    /** LOCIDFBRCTG4: {bigint(19)} */
    protected Long _locidfbrctg4;

    /** LOCIDFBRCTG5: {bigint(19)} */
    protected Long _locidfbrctg5;

    /** LOCIDFBRCTG6: {bigint(19)} */
    protected Long _locidfbrctg6;

    /** LOCIDFBRCTG7: {bigint(19)} */
    protected Long _locidfbrctg7;

    /** LOCIDFBRCTG8: {bigint(19)} */
    protected Long _locidfbrctg8;

    /** LOCIDFBRCTG9: {bigint(19)} */
    protected Long _locidfbrctg9;

    /** LOCIDFBRCTG10: {bigint(19)} */
    protected Long _locidfbrctg10;

    /** SORT_PLACE_MANAGE_ID: {bigint(19)} */
    protected Long _sortPlaceManageId;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CLIENT_ID: {int(10)} */
    protected Integer _clientId;

    /** CLIENT_CD: {int(10)} */
    protected String _clientCd;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlSortingPlaceMasterEditSrwDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlSortingPlaceMasterEditSrw";
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
        if (obj instanceof BsSqlSortingPlaceMasterEditSrw) {
            BsSqlSortingPlaceMasterEditSrw other = (BsSqlSortingPlaceMasterEditSrw)obj;
            if (!xSV(_locidfrnk, other._locidfrnk)) { return false; }
            if (!xSV(_locidfbrctg1, other._locidfbrctg1)) { return false; }
            if (!xSV(_locidfbrctg2, other._locidfbrctg2)) { return false; }
            if (!xSV(_locidfbrctg3, other._locidfbrctg3)) { return false; }
            if (!xSV(_locidfbrctg4, other._locidfbrctg4)) { return false; }
            if (!xSV(_locidfbrctg5, other._locidfbrctg5)) { return false; }
            if (!xSV(_locidfbrctg6, other._locidfbrctg6)) { return false; }
            if (!xSV(_locidfbrctg7, other._locidfbrctg7)) { return false; }
            if (!xSV(_locidfbrctg8, other._locidfbrctg8)) { return false; }
            if (!xSV(_locidfbrctg9, other._locidfbrctg9)) { return false; }
            if (!xSV(_locidfbrctg10, other._locidfbrctg10)) { return false; }
            if (!xSV(_sortPlaceManageId, other._sortPlaceManageId)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _locidfrnk);
        hs = xCH(hs, _locidfbrctg1);
        hs = xCH(hs, _locidfbrctg2);
        hs = xCH(hs, _locidfbrctg3);
        hs = xCH(hs, _locidfbrctg4);
        hs = xCH(hs, _locidfbrctg5);
        hs = xCH(hs, _locidfbrctg6);
        hs = xCH(hs, _locidfbrctg7);
        hs = xCH(hs, _locidfbrctg8);
        hs = xCH(hs, _locidfbrctg9);
        hs = xCH(hs, _locidfbrctg10);
        hs = xCH(hs, _sortPlaceManageId);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _clientCd);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_locidfrnk));
        sb.append(dm).append(xfND(_locidfbrctg1));
        sb.append(dm).append(xfND(_locidfbrctg2));
        sb.append(dm).append(xfND(_locidfbrctg3));
        sb.append(dm).append(xfND(_locidfbrctg4));
        sb.append(dm).append(xfND(_locidfbrctg5));
        sb.append(dm).append(xfND(_locidfbrctg6));
        sb.append(dm).append(xfND(_locidfbrctg7));
        sb.append(dm).append(xfND(_locidfbrctg8));
        sb.append(dm).append(xfND(_locidfbrctg9));
        sb.append(dm).append(xfND(_locidfbrctg10));
        sb.append(dm).append(xfND(_sortPlaceManageId));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
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
    public SqlSortingPlaceMasterEditSrw clone() {
        return (SqlSortingPlaceMasterEditSrw)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LOCIDFRNK: {varchar(30)} <br>
     * @return The value of the column 'LOCIDFRNK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocidfrnk() {
        checkSpecifiedProperty("locidfrnk");
        return convertEmptyToNull(_locidfrnk);
    }

    /**
     * [set] LOCIDFRNK: {varchar(30)} <br>
     * @param locidfrnk The value of the column 'LOCIDFRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfrnk(String locidfrnk) {
        registerModifiedProperty("locidfrnk");
        _locidfrnk = locidfrnk;
    }

    /**
     * [get] LOCIDFBRCTG1: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg1() {
        checkSpecifiedProperty("locidfbrctg1");
        return _locidfbrctg1;
    }

    /**
     * [set] LOCIDFBRCTG1: {bigint(19)} <br>
     * @param locidfbrctg1 The value of the column 'LOCIDFBRCTG1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg1(Long locidfbrctg1) {
        registerModifiedProperty("locidfbrctg1");
        _locidfbrctg1 = locidfbrctg1;
    }

    /**
     * [get] LOCIDFBRCTG2: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG2'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg2() {
        checkSpecifiedProperty("locidfbrctg2");
        return _locidfbrctg2;
    }

    /**
     * [set] LOCIDFBRCTG2: {bigint(19)} <br>
     * @param locidfbrctg2 The value of the column 'LOCIDFBRCTG2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg2(Long locidfbrctg2) {
        registerModifiedProperty("locidfbrctg2");
        _locidfbrctg2 = locidfbrctg2;
    }

    /**
     * [get] LOCIDFBRCTG3: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG3'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg3() {
        checkSpecifiedProperty("locidfbrctg3");
        return _locidfbrctg3;
    }

    /**
     * [set] LOCIDFBRCTG3: {bigint(19)} <br>
     * @param locidfbrctg3 The value of the column 'LOCIDFBRCTG3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg3(Long locidfbrctg3) {
        registerModifiedProperty("locidfbrctg3");
        _locidfbrctg3 = locidfbrctg3;
    }

    /**
     * [get] LOCIDFBRCTG4: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG4'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg4() {
        checkSpecifiedProperty("locidfbrctg4");
        return _locidfbrctg4;
    }

    /**
     * [set] LOCIDFBRCTG4: {bigint(19)} <br>
     * @param locidfbrctg4 The value of the column 'LOCIDFBRCTG4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg4(Long locidfbrctg4) {
        registerModifiedProperty("locidfbrctg4");
        _locidfbrctg4 = locidfbrctg4;
    }

    /**
     * [get] LOCIDFBRCTG5: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG5'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg5() {
        checkSpecifiedProperty("locidfbrctg5");
        return _locidfbrctg5;
    }

    /**
     * [set] LOCIDFBRCTG5: {bigint(19)} <br>
     * @param locidfbrctg5 The value of the column 'LOCIDFBRCTG5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg5(Long locidfbrctg5) {
        registerModifiedProperty("locidfbrctg5");
        _locidfbrctg5 = locidfbrctg5;
    }

    /**
     * [get] LOCIDFBRCTG6: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG6'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg6() {
        checkSpecifiedProperty("locidfbrctg6");
        return _locidfbrctg6;
    }

    /**
     * [set] LOCIDFBRCTG6: {bigint(19)} <br>
     * @param locidfbrctg6 The value of the column 'LOCIDFBRCTG6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg6(Long locidfbrctg6) {
        registerModifiedProperty("locidfbrctg6");
        _locidfbrctg6 = locidfbrctg6;
    }

    /**
     * [get] LOCIDFBRCTG7: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG7'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg7() {
        checkSpecifiedProperty("locidfbrctg7");
        return _locidfbrctg7;
    }

    /**
     * [set] LOCIDFBRCTG7: {bigint(19)} <br>
     * @param locidfbrctg7 The value of the column 'LOCIDFBRCTG7'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg7(Long locidfbrctg7) {
        registerModifiedProperty("locidfbrctg7");
        _locidfbrctg7 = locidfbrctg7;
    }

    /**
     * [get] LOCIDFBRCTG8: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG8'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg8() {
        checkSpecifiedProperty("locidfbrctg8");
        return _locidfbrctg8;
    }

    /**
     * [set] LOCIDFBRCTG8: {bigint(19)} <br>
     * @param locidfbrctg8 The value of the column 'LOCIDFBRCTG8'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg8(Long locidfbrctg8) {
        registerModifiedProperty("locidfbrctg8");
        _locidfbrctg8 = locidfbrctg8;
    }

    /**
     * [get] LOCIDFBRCTG9: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG9'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg9() {
        checkSpecifiedProperty("locidfbrctg9");
        return _locidfbrctg9;
    }

    /**
     * [set] LOCIDFBRCTG9: {bigint(19)} <br>
     * @param locidfbrctg9 The value of the column 'LOCIDFBRCTG9'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg9(Long locidfbrctg9) {
        registerModifiedProperty("locidfbrctg9");
        _locidfbrctg9 = locidfbrctg9;
    }

    /**
     * [get] LOCIDFBRCTG10: {bigint(19)} <br>
     * @return The value of the column 'LOCIDFBRCTG10'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocidfbrctg10() {
        checkSpecifiedProperty("locidfbrctg10");
        return _locidfbrctg10;
    }

    /**
     * [set] LOCIDFBRCTG10: {bigint(19)} <br>
     * @param locidfbrctg10 The value of the column 'LOCIDFBRCTG10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidfbrctg10(Long locidfbrctg10) {
        registerModifiedProperty("locidfbrctg10");
        _locidfbrctg10 = locidfbrctg10;
    }

    /**
     * [get] SORT_PLACE_MANAGE_ID: {bigint(19)} <br>
     * @return The value of the column 'SORT_PLACE_MANAGE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSortPlaceManageId() {
        checkSpecifiedProperty("sortPlaceManageId");
        return _sortPlaceManageId;
    }

    /**
     * [set] SORT_PLACE_MANAGE_ID: {bigint(19)} <br>
     * @param sortPlaceManageId The value of the column 'SORT_PLACE_MANAGE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortPlaceManageId(Long sortPlaceManageId) {
        registerModifiedProperty("sortPlaceManageId");
        _sortPlaceManageId = sortPlaceManageId;
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
     * [get] CLIENT_ID: {int(10)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {int(10)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Integer clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {int(10)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {int(10)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }
}

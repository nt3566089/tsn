package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlInventoryHCorrectList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_H_ID, TRCASEINVENTORY_ID, VERSION_NO_CASE, TRINVCORRECT_ID, PUTDMYCASECD, PUTDMYCUTCASECD, PUTDMYCASEDETAILNO, PUTDMYDIRECTIONNO, PUTDMYDIRECTIONORDERGNO, VERSION_NO_CORRECT
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
 * Long inventoryHId = entity.getInventoryHId();
 * Long trcaseinventoryId = entity.getTrcaseinventoryId();
 * Long versionNoCase = entity.getVersionNoCase();
 * Long trinvcorrectId = entity.getTrinvcorrectId();
 * java.math.BigDecimal putdmycasecd = entity.getPutdmycasecd();
 * java.math.BigDecimal putdmycutcasecd = entity.getPutdmycutcasecd();
 * Long putdmycasedetailno = entity.getPutdmycasedetailno();
 * Long putdmydirectionno = entity.getPutdmydirectionno();
 * Long putdmydirectionordergno = entity.getPutdmydirectionordergno();
 * Long versionNoCorrect = entity.getVersionNoCorrect();
 * entity.setInventoryHId(inventoryHId);
 * entity.setTrcaseinventoryId(trcaseinventoryId);
 * entity.setVersionNoCase(versionNoCase);
 * entity.setTrinvcorrectId(trinvcorrectId);
 * entity.setPutdmycasecd(putdmycasecd);
 * entity.setPutdmycutcasecd(putdmycutcasecd);
 * entity.setPutdmycasedetailno(putdmycasedetailno);
 * entity.setPutdmydirectionno(putdmydirectionno);
 * entity.setPutdmydirectionordergno(putdmydirectionordergno);
 * entity.setVersionNoCorrect(versionNoCorrect);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlInventoryHCorrectList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_H_ID: {bigint(19)} */
    protected Long _inventoryHId;

    /** TRCASEINVENTORY_ID: {bigint(19)} */
    protected Long _trcaseinventoryId;

    /** VERSION_NO_CASE: {bigint(19)} */
    protected Long _versionNoCase;

    /** TRINVCORRECT_ID: {bigint(19)} */
    protected Long _trinvcorrectId;

    /** PUTDMYCASECD: {decimal(16, 6)} */
    protected java.math.BigDecimal _putdmycasecd;

    /** PUTDMYCUTCASECD: {decimal(16, 6)} */
    protected java.math.BigDecimal _putdmycutcasecd;

    /** PUTDMYCASEDETAILNO: {bigint(19)} */
    protected Long _putdmycasedetailno;

    /** PUTDMYDIRECTIONNO: {bigint(19)} */
    protected Long _putdmydirectionno;

    /** PUTDMYDIRECTIONORDERGNO: {bigint(19)} */
    protected Long _putdmydirectionordergno;

    /** VERSION_NO_CORRECT: {bigint(19)} */
    protected Long _versionNoCorrect;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlInventoryHCorrectListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlInventoryHCorrectList";
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
        if (obj instanceof BsSqlInventoryHCorrectList) {
            BsSqlInventoryHCorrectList other = (BsSqlInventoryHCorrectList)obj;
            if (!xSV(_inventoryHId, other._inventoryHId)) { return false; }
            if (!xSV(_trcaseinventoryId, other._trcaseinventoryId)) { return false; }
            if (!xSV(_versionNoCase, other._versionNoCase)) { return false; }
            if (!xSV(_trinvcorrectId, other._trinvcorrectId)) { return false; }
            if (!xSV(_putdmycasecd, other._putdmycasecd)) { return false; }
            if (!xSV(_putdmycutcasecd, other._putdmycutcasecd)) { return false; }
            if (!xSV(_putdmycasedetailno, other._putdmycasedetailno)) { return false; }
            if (!xSV(_putdmydirectionno, other._putdmydirectionno)) { return false; }
            if (!xSV(_putdmydirectionordergno, other._putdmydirectionordergno)) { return false; }
            if (!xSV(_versionNoCorrect, other._versionNoCorrect)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _inventoryHId);
        hs = xCH(hs, _trcaseinventoryId);
        hs = xCH(hs, _versionNoCase);
        hs = xCH(hs, _trinvcorrectId);
        hs = xCH(hs, _putdmycasecd);
        hs = xCH(hs, _putdmycutcasecd);
        hs = xCH(hs, _putdmycasedetailno);
        hs = xCH(hs, _putdmydirectionno);
        hs = xCH(hs, _putdmydirectionordergno);
        hs = xCH(hs, _versionNoCorrect);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryHId));
        sb.append(dm).append(xfND(_trcaseinventoryId));
        sb.append(dm).append(xfND(_versionNoCase));
        sb.append(dm).append(xfND(_trinvcorrectId));
        sb.append(dm).append(xfND(_putdmycasecd));
        sb.append(dm).append(xfND(_putdmycutcasecd));
        sb.append(dm).append(xfND(_putdmycasedetailno));
        sb.append(dm).append(xfND(_putdmydirectionno));
        sb.append(dm).append(xfND(_putdmydirectionordergno));
        sb.append(dm).append(xfND(_versionNoCorrect));
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
    public SqlInventoryHCorrectList clone() {
        return (SqlInventoryHCorrectList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_H_ID: {bigint(19)} <br>
     * @return The value of the column 'INVENTORY_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryHId() {
        checkSpecifiedProperty("inventoryHId");
        return _inventoryHId;
    }

    /**
     * [set] INVENTORY_H_ID: {bigint(19)} <br>
     * @param inventoryHId The value of the column 'INVENTORY_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryHId(Long inventoryHId) {
        registerModifiedProperty("inventoryHId");
        _inventoryHId = inventoryHId;
    }

    /**
     * [get] TRCASEINVENTORY_ID: {bigint(19)} <br>
     * @return The value of the column 'TRCASEINVENTORY_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrcaseinventoryId() {
        checkSpecifiedProperty("trcaseinventoryId");
        return _trcaseinventoryId;
    }

    /**
     * [set] TRCASEINVENTORY_ID: {bigint(19)} <br>
     * @param trcaseinventoryId The value of the column 'TRCASEINVENTORY_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrcaseinventoryId(Long trcaseinventoryId) {
        registerModifiedProperty("trcaseinventoryId");
        _trcaseinventoryId = trcaseinventoryId;
    }

    /**
     * [get] VERSION_NO_CASE: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO_CASE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNoCase() {
        checkSpecifiedProperty("versionNoCase");
        return _versionNoCase;
    }

    /**
     * [set] VERSION_NO_CASE: {bigint(19)} <br>
     * @param versionNoCase The value of the column 'VERSION_NO_CASE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNoCase(Long versionNoCase) {
        registerModifiedProperty("versionNoCase");
        _versionNoCase = versionNoCase;
    }

    /**
     * [get] TRINVCORRECT_ID: {bigint(19)} <br>
     * @return The value of the column 'TRINVCORRECT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrinvcorrectId() {
        checkSpecifiedProperty("trinvcorrectId");
        return _trinvcorrectId;
    }

    /**
     * [set] TRINVCORRECT_ID: {bigint(19)} <br>
     * @param trinvcorrectId The value of the column 'TRINVCORRECT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrinvcorrectId(Long trinvcorrectId) {
        registerModifiedProperty("trinvcorrectId");
        _trinvcorrectId = trinvcorrectId;
    }

    /**
     * [get] PUTDMYCASECD: {decimal(16, 6)} <br>
     * @return The value of the column 'PUTDMYCASECD'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPutdmycasecd() {
        checkSpecifiedProperty("putdmycasecd");
        return _putdmycasecd;
    }

    /**
     * [set] PUTDMYCASECD: {decimal(16, 6)} <br>
     * @param putdmycasecd The value of the column 'PUTDMYCASECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPutdmycasecd(java.math.BigDecimal putdmycasecd) {
        registerModifiedProperty("putdmycasecd");
        _putdmycasecd = putdmycasecd;
    }

    /**
     * [get] PUTDMYCUTCASECD: {decimal(16, 6)} <br>
     * @return The value of the column 'PUTDMYCUTCASECD'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPutdmycutcasecd() {
        checkSpecifiedProperty("putdmycutcasecd");
        return _putdmycutcasecd;
    }

    /**
     * [set] PUTDMYCUTCASECD: {decimal(16, 6)} <br>
     * @param putdmycutcasecd The value of the column 'PUTDMYCUTCASECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPutdmycutcasecd(java.math.BigDecimal putdmycutcasecd) {
        registerModifiedProperty("putdmycutcasecd");
        _putdmycutcasecd = putdmycutcasecd;
    }

    /**
     * [get] PUTDMYCASEDETAILNO: {bigint(19)} <br>
     * @return The value of the column 'PUTDMYCASEDETAILNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPutdmycasedetailno() {
        checkSpecifiedProperty("putdmycasedetailno");
        return _putdmycasedetailno;
    }

    /**
     * [set] PUTDMYCASEDETAILNO: {bigint(19)} <br>
     * @param putdmycasedetailno The value of the column 'PUTDMYCASEDETAILNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPutdmycasedetailno(Long putdmycasedetailno) {
        registerModifiedProperty("putdmycasedetailno");
        _putdmycasedetailno = putdmycasedetailno;
    }

    /**
     * [get] PUTDMYDIRECTIONNO: {bigint(19)} <br>
     * @return The value of the column 'PUTDMYDIRECTIONNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPutdmydirectionno() {
        checkSpecifiedProperty("putdmydirectionno");
        return _putdmydirectionno;
    }

    /**
     * [set] PUTDMYDIRECTIONNO: {bigint(19)} <br>
     * @param putdmydirectionno The value of the column 'PUTDMYDIRECTIONNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPutdmydirectionno(Long putdmydirectionno) {
        registerModifiedProperty("putdmydirectionno");
        _putdmydirectionno = putdmydirectionno;
    }

    /**
     * [get] PUTDMYDIRECTIONORDERGNO: {bigint(19)} <br>
     * @return The value of the column 'PUTDMYDIRECTIONORDERGNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPutdmydirectionordergno() {
        checkSpecifiedProperty("putdmydirectionordergno");
        return _putdmydirectionordergno;
    }

    /**
     * [set] PUTDMYDIRECTIONORDERGNO: {bigint(19)} <br>
     * @param putdmydirectionordergno The value of the column 'PUTDMYDIRECTIONORDERGNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPutdmydirectionordergno(Long putdmydirectionordergno) {
        registerModifiedProperty("putdmydirectionordergno");
        _putdmydirectionordergno = putdmydirectionordergno;
    }

    /**
     * [get] VERSION_NO_CORRECT: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO_CORRECT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNoCorrect() {
        checkSpecifiedProperty("versionNoCorrect");
        return _versionNoCorrect;
    }

    /**
     * [set] VERSION_NO_CORRECT: {bigint(19)} <br>
     * @param versionNoCorrect The value of the column 'VERSION_NO_CORRECT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNoCorrect(Long versionNoCorrect) {
        registerModifiedProperty("versionNoCorrect");
        _versionNoCorrect = versionNoCorrect;
    }
}

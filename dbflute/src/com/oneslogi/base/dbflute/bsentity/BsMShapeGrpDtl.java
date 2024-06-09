package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of M_SHAPE_GRP_DTL as TABLE. <br>
 * 荷姿グループ明細マスタ
 * <pre>
 * [primary-key]
 *     SHAPE_GRP_DTL_ID
 *
 * [column]
 *     SHAPE_GRP_DTL_ID, SHAPE_GRP_ID, SHAPE_ID, GTIN14_SYMBOL, CASE_PICK_FLG, SHAPE_SORT, EM_REPLENISH_SHAPE_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHAPE_GRP_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_SHAPE_GRP, M_SHAPE, B_CLASS_DTL(ByCasePickFlg)
 *
 * [referrer table]
 *     M_PRODUCT_SHAPE
 *
 * [foreign property]
 *     mShapeGrp, mShape, bClassDtlByCasePickFlg, bClassDtlByEmReplenishShapeFlg, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mProductShapeList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long shapeGrpDtlId = entity.getShapeGrpDtlId();
 * Long shapeGrpId = entity.getShapeGrpId();
 * Long shapeId = entity.getShapeId();
 * Long gtin14Symbol = entity.getGtin14Symbol();
 * String casePickFlg = entity.getCasePickFlg();
 * Long shapeSort = entity.getShapeSort();
 * String emReplenishShapeFlg = entity.getEmReplenishShapeFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShapeGrpDtlId(shapeGrpDtlId);
 * entity.setShapeGrpId(shapeGrpId);
 * entity.setShapeId(shapeId);
 * entity.setGtin14Symbol(gtin14Symbol);
 * entity.setCasePickFlg(casePickFlg);
 * entity.setShapeSort(shapeSort);
 * entity.setEmReplenishShapeFlg(emReplenishShapeFlg);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMShapeGrpDtl extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _shapeGrpDtlId;

    /** SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP} */
    protected Long _shapeGrpId;

    /** SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE} */
    protected Long _shapeId;

    /** GTIN14_SYMBOL: {bigint(19), default=[(1)]} */
    protected Long _gtin14Symbol;

    /** CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg} */
    protected String _casePickFlg;

    /** SHAPE_SORT: {NotNull, bigint(19)} */
    protected Long _shapeSort;

    /** EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg} */
    protected String _emReplenishShapeFlg;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "M_SHAPE_GRP_DTL";
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
        if (_shapeGrpDtlId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of casePickFlg as the classification of CasePickFlg. <br>
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg} <br>
     * ケースピッキング対象
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CasePickFlg getCasePickFlgAsCasePickFlg() {
        return CDef.CasePickFlg.codeOf(getCasePickFlg());
    }

    /**
     * Set the value of casePickFlg as the classification of CasePickFlg. <br>
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg} <br>
     * ケースピッキング対象
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCasePickFlgAsCasePickFlg(CDef.CasePickFlg cdef) {
        setCasePickFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of emReplenishShapeFlg as the classification of EmReplenishShapeFlg. <br>
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg} <br>
     * 緊急補充ゾーン補充荷姿
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.EmReplenishShapeFlg getEmReplenishShapeFlgAsEmReplenishShapeFlg() {
        return CDef.EmReplenishShapeFlg.codeOf(getEmReplenishShapeFlg());
    }

    /**
     * Set the value of emReplenishShapeFlg as the classification of EmReplenishShapeFlg. <br>
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg} <br>
     * 緊急補充ゾーン補充荷姿
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setEmReplenishShapeFlgAsEmReplenishShapeFlg(CDef.EmReplenishShapeFlg cdef) {
        setEmReplenishShapeFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of casePickFlg as $0 (0). <br>
     * $0: 対象外
     */
    public void setCasePickFlg_$0() {
        setCasePickFlgAsCasePickFlg(CDef.CasePickFlg.$0);
    }

    /**
     * Set the value of casePickFlg as $1 (1). <br>
     * $1: 対象
     */
    public void setCasePickFlg_$1() {
        setCasePickFlgAsCasePickFlg(CDef.CasePickFlg.$1);
    }

    /**
     * Set the value of emReplenishShapeFlg as $0 (0). <br>
     * $0: 対象外
     */
    public void setEmReplenishShapeFlg_$0() {
        setEmReplenishShapeFlgAsEmReplenishShapeFlg(CDef.EmReplenishShapeFlg.$0);
    }

    /**
     * Set the value of emReplenishShapeFlg as $1 (1). <br>
     * $1: 対象
     */
    public void setEmReplenishShapeFlg_$1() {
        setEmReplenishShapeFlgAsEmReplenishShapeFlg(CDef.EmReplenishShapeFlg.$1);
    }

    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of casePickFlg $0? <br>
     * $0: 対象外
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCasePickFlg$0() {
        CDef.CasePickFlg cdef = getCasePickFlgAsCasePickFlg();
        return cdef != null ? cdef.equals(CDef.CasePickFlg.$0) : false;
    }

    /**
     * Is the value of casePickFlg $1? <br>
     * $1: 対象
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCasePickFlg$1() {
        CDef.CasePickFlg cdef = getCasePickFlgAsCasePickFlg();
        return cdef != null ? cdef.equals(CDef.CasePickFlg.$1) : false;
    }

    /**
     * Is the value of emReplenishShapeFlg $0? <br>
     * $0: 対象外
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEmReplenishShapeFlg$0() {
        CDef.EmReplenishShapeFlg cdef = getEmReplenishShapeFlgAsEmReplenishShapeFlg();
        return cdef != null ? cdef.equals(CDef.EmReplenishShapeFlg.$0) : false;
    }

    /**
     * Is the value of emReplenishShapeFlg $1? <br>
     * $1: 対象
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEmReplenishShapeFlg$1() {
        CDef.EmReplenishShapeFlg cdef = getEmReplenishShapeFlgAsEmReplenishShapeFlg();
        return cdef != null ? cdef.equals(CDef.EmReplenishShapeFlg.$1) : false;
    }

    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'casePickFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCasePickFlgName() {
        CDef.CasePickFlg cdef = getCasePickFlgAsCasePickFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'emReplenishShapeFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getEmReplenishShapeFlgName() {
        CDef.EmReplenishShapeFlg cdef = getEmReplenishShapeFlgAsEmReplenishShapeFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'. */
    protected MShapeGrp _mShapeGrp;

    /**
     * [get] M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'. <br>
     * @return The entity of foreign property 'MShapeGrp'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MShapeGrp getMShapeGrp() {
        return _mShapeGrp;
    }

    /**
     * [set] M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @param mShapeGrp The entity of foreign property 'MShapeGrp'. (NullAllowed)
     */
    public void setMShapeGrp(MShapeGrp mShapeGrp) {
        _mShapeGrp = mShapeGrp;
    }

    /** M_SHAPE by my SHAPE_ID, named 'MShape'. */
    protected MShape _mShape;

    /**
     * [get] M_SHAPE by my SHAPE_ID, named 'MShape'. <br>
     * @return The entity of foreign property 'MShape'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MShape getMShape() {
        return _mShape;
    }

    /**
     * [set] M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @param mShape The entity of foreign property 'MShape'. (NullAllowed)
     */
    public void setMShape(MShape mShape) {
        _mShape = mShape;
    }

    /** B_CLASS_DTL by my CASE_PICK_FLG, named 'BClassDtlByCasePickFlg'. */
    protected BClassDtl _bClassDtlByCasePickFlg;

    /**
     * [get] B_CLASS_DTL by my CASE_PICK_FLG, named 'BClassDtlByCasePickFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByCasePickFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCasePickFlg() {
        return _bClassDtlByCasePickFlg;
    }

    /**
     * [set] B_CLASS_DTL by my CASE_PICK_FLG, named 'BClassDtlByCasePickFlg'.
     * @param bClassDtlByCasePickFlg The entity of foreign property 'BClassDtlByCasePickFlg'. (NullAllowed)
     */
    public void setBClassDtlByCasePickFlg(BClassDtl bClassDtlByCasePickFlg) {
        _bClassDtlByCasePickFlg = bClassDtlByCasePickFlg;
    }

    /** B_CLASS_DTL by my EM_REPLENISH_SHAPE_FLG, named 'BClassDtlByEmReplenishShapeFlg'. */
    protected BClassDtl _bClassDtlByEmReplenishShapeFlg;

    /**
     * [get] B_CLASS_DTL by my EM_REPLENISH_SHAPE_FLG, named 'BClassDtlByEmReplenishShapeFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByEmReplenishShapeFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByEmReplenishShapeFlg() {
        return _bClassDtlByEmReplenishShapeFlg;
    }

    /**
     * [set] B_CLASS_DTL by my EM_REPLENISH_SHAPE_FLG, named 'BClassDtlByEmReplenishShapeFlg'.
     * @param bClassDtlByEmReplenishShapeFlg The entity of foreign property 'BClassDtlByEmReplenishShapeFlg'. (NullAllowed)
     */
    public void setBClassDtlByEmReplenishShapeFlg(BClassDtl bClassDtlByEmReplenishShapeFlg) {
        _bClassDtlByEmReplenishShapeFlg = bClassDtlByEmReplenishShapeFlg;
    }

    /** B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. */
    protected BClassDtl _bClassDtlByDelFlg;

    /**
     * [get] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    /**
     * [set] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @param bClassDtlByDelFlg The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelFlg(BClassDtl bClassDtlByDelFlg) {
        _bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_PRODUCT_SHAPE by SHAPE_GRP_DTL_ID, named 'MProductShapeList'. */
    protected List<MProductShape> _mProductShapeList;

    /**
     * [get] M_PRODUCT_SHAPE by SHAPE_GRP_DTL_ID, named 'MProductShapeList'.
     * @return The entity list of referrer property 'MProductShapeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MProductShape> getMProductShapeList() {
        if (_mProductShapeList == null) { _mProductShapeList = newReferrerList(); }
        return _mProductShapeList;
    }

    /**
     * [set] M_PRODUCT_SHAPE by SHAPE_GRP_DTL_ID, named 'MProductShapeList'.
     * @param mProductShapeList The entity list of referrer property 'MProductShapeList'. (NullAllowed)
     */
    public void setMProductShapeList(List<MProductShape> mProductShapeList) {
        _mProductShapeList = mProductShapeList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMShapeGrpDtl) {
            BsMShapeGrpDtl other = (BsMShapeGrpDtl)obj;
            if (!xSV(_shapeGrpDtlId, other._shapeGrpDtlId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shapeGrpDtlId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mShapeGrp != null)
        { sb.append(li).append(xbRDS(_mShapeGrp, "mShapeGrp")); }
        if (_mShape != null)
        { sb.append(li).append(xbRDS(_mShape, "mShape")); }
        if (_bClassDtlByCasePickFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCasePickFlg, "bClassDtlByCasePickFlg")); }
        if (_bClassDtlByEmReplenishShapeFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByEmReplenishShapeFlg, "bClassDtlByEmReplenishShapeFlg")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_mProductShapeList != null) { for (MProductShape et : _mProductShapeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mProductShapeList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shapeGrpDtlId));
        sb.append(dm).append(xfND(_shapeGrpId));
        sb.append(dm).append(xfND(_shapeId));
        sb.append(dm).append(xfND(_gtin14Symbol));
        sb.append(dm).append(xfND(_casePickFlg));
        sb.append(dm).append(xfND(_shapeSort));
        sb.append(dm).append(xfND(_emReplenishShapeFlg));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mShapeGrp != null)
        { sb.append(dm).append("mShapeGrp"); }
        if (_mShape != null)
        { sb.append(dm).append("mShape"); }
        if (_bClassDtlByCasePickFlg != null)
        { sb.append(dm).append("bClassDtlByCasePickFlg"); }
        if (_bClassDtlByEmReplenishShapeFlg != null)
        { sb.append(dm).append("bClassDtlByEmReplenishShapeFlg"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_mProductShapeList != null && !_mProductShapeList.isEmpty())
        { sb.append(dm).append("mProductShapeList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MShapeGrpDtl clone() {
        return (MShapeGrpDtl)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷姿グループ明細ID
     * @return The value of the column 'SHAPE_GRP_DTL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShapeGrpDtlId() {
        checkSpecifiedProperty("shapeGrpDtlId");
        return _shapeGrpDtlId;
    }

    /**
     * [set] SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷姿グループ明細ID
     * @param shapeGrpDtlId The value of the column 'SHAPE_GRP_DTL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShapeGrpDtlId(Long shapeGrpDtlId) {
        registerModifiedProperty("shapeGrpDtlId");
        _shapeGrpDtlId = shapeGrpDtlId;
    }

    /**
     * [get] SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP} <br>
     * 荷姿グループID
     * @return The value of the column 'SHAPE_GRP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShapeGrpId() {
        checkSpecifiedProperty("shapeGrpId");
        return _shapeGrpId;
    }

    /**
     * [set] SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP} <br>
     * 荷姿グループID
     * @param shapeGrpId The value of the column 'SHAPE_GRP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShapeGrpId(Long shapeGrpId) {
        registerModifiedProperty("shapeGrpId");
        _shapeGrpId = shapeGrpId;
    }

    /**
     * [get] SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE} <br>
     * 荷姿ID
     * @return The value of the column 'SHAPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShapeId() {
        checkSpecifiedProperty("shapeId");
        return _shapeId;
    }

    /**
     * [set] SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE} <br>
     * 荷姿ID
     * @param shapeId The value of the column 'SHAPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShapeId(Long shapeId) {
        registerModifiedProperty("shapeId");
        _shapeId = shapeId;
    }

    /**
     * [get] GTIN14_SYMBOL: {bigint(19), default=[(1)]} <br>
     * GTIN14シンボル
     * @return The value of the column 'GTIN14_SYMBOL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getGtin14Symbol() {
        checkSpecifiedProperty("gtin14Symbol");
        return _gtin14Symbol;
    }

    /**
     * [set] GTIN14_SYMBOL: {bigint(19), default=[(1)]} <br>
     * GTIN14シンボル
     * @param gtin14Symbol The value of the column 'GTIN14_SYMBOL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGtin14Symbol(Long gtin14Symbol) {
        registerModifiedProperty("gtin14Symbol");
        _gtin14Symbol = gtin14Symbol;
    }

    /**
     * [get] CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg} <br>
     * ケースピッキング対象
     * @return The value of the column 'CASE_PICK_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasePickFlg() {
        checkSpecifiedProperty("casePickFlg");
        return convertEmptyToNull(_casePickFlg);
    }

    /**
     * [set] CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg} <br>
     * ケースピッキング対象
     * @param casePickFlg The value of the column 'CASE_PICK_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasePickFlg(String casePickFlg) {
        registerModifiedProperty("casePickFlg");
        _casePickFlg = casePickFlg;
    }

    /**
     * [get] SHAPE_SORT: {NotNull, bigint(19)} <br>
     * 荷姿ソート順
     * @return The value of the column 'SHAPE_SORT'. (basically NotNull if selected: for the constraint)
     */
    public Long getShapeSort() {
        checkSpecifiedProperty("shapeSort");
        return _shapeSort;
    }

    /**
     * [set] SHAPE_SORT: {NotNull, bigint(19)} <br>
     * 荷姿ソート順
     * @param shapeSort The value of the column 'SHAPE_SORT'. (basically NotNull if update: for the constraint)
     */
    public void setShapeSort(Long shapeSort) {
        registerModifiedProperty("shapeSort");
        _shapeSort = shapeSort;
    }

    /**
     * [get] EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg} <br>
     * 緊急補充ゾーン補充荷姿
     * @return The value of the column 'EM_REPLENISH_SHAPE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmReplenishShapeFlg() {
        checkSpecifiedProperty("emReplenishShapeFlg");
        return convertEmptyToNull(_emReplenishShapeFlg);
    }

    /**
     * [set] EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg} <br>
     * 緊急補充ゾーン補充荷姿
     * @param emReplenishShapeFlg The value of the column 'EM_REPLENISH_SHAPE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmReplenishShapeFlg(String emReplenishShapeFlg) {
        registerModifiedProperty("emReplenishShapeFlg");
        _emReplenishShapeFlg = emReplenishShapeFlg;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}

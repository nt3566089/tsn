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
 * The entity of T_TRIMALLOCSCHKRI as TABLE. <br>
 * 山出し引当不能情報ボディ
 * <pre>
 * [primary-key]
 *     TRIMALLOCSCH_ID
 *
 * [column]
 *     TRIMALLOCSCH_ID, TRIMALLOC_H_ID, TRSODETAIL_ID, ALLOC_IMP_KEY, ALC_IMP_RESG_No, LOCATION_ID, LOCATION_CD, EXPECT_QTY, MANUFACTUREDATE, DESIGN_FLG, ALCIMEXP_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOCSCH_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_YTRSODETAIL, T_TRIMALLOC_H
 *
 * [referrer table]
 *     T_TRIMALLOCADJUST
 *
 * [foreign property]
 *     tYtrsodetail, tTrimallocH
 *
 * [referrer property]
 *     tTrimallocadjustList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trimallocschId = entity.getTrimallocschId();
 * Long trimallocHId = entity.getTrimallocHId();
 * Long trsodetailId = entity.getTrsodetailId();
 * Long allocImpKey = entity.getAllocImpKey();
 * Long alcImpResgNo = entity.getAlcImpResgNo();
 * Long locationId = entity.getLocationId();
 * String locationCd = entity.getLocationCd();
 * Long expectQty = entity.getExpectQty();
 * String manufacturedate = entity.getManufacturedate();
 * String designFlg = entity.getDesignFlg();
 * String alcimexpFlg = entity.getAlcimexpFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrimallocschId(trimallocschId);
 * entity.setTrimallocHId(trimallocHId);
 * entity.setTrsodetailId(trsodetailId);
 * entity.setAllocImpKey(allocImpKey);
 * entity.setAlcImpResgNo(alcImpResgNo);
 * entity.setLocationId(locationId);
 * entity.setLocationCd(locationCd);
 * entity.setExpectQty(expectQty);
 * entity.setManufacturedate(manufacturedate);
 * entity.setDesignFlg(designFlg);
 * entity.setAlcimexpFlg(alcimexpFlg);
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
public abstract class BsTTrimallocschkri extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trimallocschId;

    /** TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H} */
    protected Long _trimallocHId;

    /** TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL} */
    protected Long _trsodetailId;

    /** ALLOC_IMP_KEY: {NotNull, bigint(19)} */
    protected Long _allocImpKey;

    /** ALC_IMP_RESG_No: {NotNull, bigint(19)} */
    protected Long _alcImpResgNo;

    /** LOCATION_ID: {bigint(19)} */
    protected Long _locationId;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** EXPECT_QTY: {NotNull, bigint(19)} */
    protected Long _expectQty;

    /** MANUFACTUREDATE: {NotNull, varchar(8)} */
    protected String _manufacturedate;

    /** DESIGN_FLG: {NotNull, varchar(30)} */
    protected String _designFlg;

    /** ALCIMEXP_FLG: {NotNull, varchar(30)} */
    protected String _alcimexpFlg;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
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
        return "T_TRIMALLOCSCHKRI";
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
        if (_trimallocschId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
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
    /** T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'. */
    protected TYtrsodetail _tYtrsodetail;

    /**
     * [get] T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'. <br>
     * @return The entity of foreign property 'TYtrsodetail'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TYtrsodetail getTYtrsodetail() {
        return _tYtrsodetail;
    }

    /**
     * [set] T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'.
     * @param tYtrsodetail The entity of foreign property 'TYtrsodetail'. (NullAllowed)
     */
    public void setTYtrsodetail(TYtrsodetail tYtrsodetail) {
        _tYtrsodetail = tYtrsodetail;
    }

    /** T_TRIMALLOC_H by my TRIMALLOC_H_ID, named 'TTrimallocH'. */
    protected TTrimallocH _tTrimallocH;

    /**
     * [get] T_TRIMALLOC_H by my TRIMALLOC_H_ID, named 'TTrimallocH'. <br>
     * @return The entity of foreign property 'TTrimallocH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TTrimallocH getTTrimallocH() {
        return _tTrimallocH;
    }

    /**
     * [set] T_TRIMALLOC_H by my TRIMALLOC_H_ID, named 'TTrimallocH'.
     * @param tTrimallocH The entity of foreign property 'TTrimallocH'. (NullAllowed)
     */
    public void setTTrimallocH(TTrimallocH tTrimallocH) {
        _tTrimallocH = tTrimallocH;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_TRIMALLOCADJUST by TRIMALLOCSCH_ID, named 'TTrimallocadjustList'. */
    protected List<TTrimallocadjust> _tTrimallocadjustList;

    /**
     * [get] T_TRIMALLOCADJUST by TRIMALLOCSCH_ID, named 'TTrimallocadjustList'.
     * @return The entity list of referrer property 'TTrimallocadjustList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrimallocadjust> getTTrimallocadjustList() {
        if (_tTrimallocadjustList == null) { _tTrimallocadjustList = newReferrerList(); }
        return _tTrimallocadjustList;
    }

    /**
     * [set] T_TRIMALLOCADJUST by TRIMALLOCSCH_ID, named 'TTrimallocadjustList'.
     * @param tTrimallocadjustList The entity list of referrer property 'TTrimallocadjustList'. (NullAllowed)
     */
    public void setTTrimallocadjustList(List<TTrimallocadjust> tTrimallocadjustList) {
        _tTrimallocadjustList = tTrimallocadjustList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTTrimallocschkri) {
            BsTTrimallocschkri other = (BsTTrimallocschkri)obj;
            if (!xSV(_trimallocschId, other._trimallocschId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trimallocschId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tYtrsodetail != null)
        { sb.append(li).append(xbRDS(_tYtrsodetail, "tYtrsodetail")); }
        if (_tTrimallocH != null)
        { sb.append(li).append(xbRDS(_tTrimallocH, "tTrimallocH")); }
        if (_tTrimallocadjustList != null) { for (TTrimallocadjust et : _tTrimallocadjustList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrimallocadjustList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trimallocschId));
        sb.append(dm).append(xfND(_trimallocHId));
        sb.append(dm).append(xfND(_trsodetailId));
        sb.append(dm).append(xfND(_allocImpKey));
        sb.append(dm).append(xfND(_alcImpResgNo));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_expectQty));
        sb.append(dm).append(xfND(_manufacturedate));
        sb.append(dm).append(xfND(_designFlg));
        sb.append(dm).append(xfND(_alcimexpFlg));
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
        if (_tYtrsodetail != null)
        { sb.append(dm).append("tYtrsodetail"); }
        if (_tTrimallocH != null)
        { sb.append(dm).append("tTrimallocH"); }
        if (_tTrimallocadjustList != null && !_tTrimallocadjustList.isEmpty())
        { sb.append(dm).append("tTrimallocadjustList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrimallocschkri clone() {
        return (TTrimallocschkri)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し引当不能情報ボディID
     * @return The value of the column 'TRIMALLOCSCH_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrimallocschId() {
        checkSpecifiedProperty("trimallocschId");
        return _trimallocschId;
    }

    /**
     * [set] TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し引当不能情報ボディID
     * @param trimallocschId The value of the column 'TRIMALLOCSCH_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrimallocschId(Long trimallocschId) {
        registerModifiedProperty("trimallocschId");
        _trimallocschId = trimallocschId;
    }

    /**
     * [get] TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H} <br>
     * 山出し引当不能情報ヘッダID
     * @return The value of the column 'TRIMALLOC_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrimallocHId() {
        checkSpecifiedProperty("trimallocHId");
        return _trimallocHId;
    }

    /**
     * [set] TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H} <br>
     * 山出し引当不能情報ヘッダID
     * @param trimallocHId The value of the column 'TRIMALLOC_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrimallocHId(Long trimallocHId) {
        registerModifiedProperty("trimallocHId");
        _trimallocHId = trimallocHId;
    }

    /**
     * [get] TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL} <br>
     * 山出し指示ボディID
     * @return The value of the column 'TRSODETAIL_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrsodetailId() {
        checkSpecifiedProperty("trsodetailId");
        return _trsodetailId;
    }

    /**
     * [set] TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL} <br>
     * 山出し指示ボディID
     * @param trsodetailId The value of the column 'TRSODETAIL_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrsodetailId(Long trsodetailId) {
        registerModifiedProperty("trsodetailId");
        _trsodetailId = trsodetailId;
    }

    /**
     * [get] ALLOC_IMP_KEY: {NotNull, bigint(19)} <br>
     * 引当不能キー
     * @return The value of the column 'ALLOC_IMP_KEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getAllocImpKey() {
        checkSpecifiedProperty("allocImpKey");
        return _allocImpKey;
    }

    /**
     * [set] ALLOC_IMP_KEY: {NotNull, bigint(19)} <br>
     * 引当不能キー
     * @param allocImpKey The value of the column 'ALLOC_IMP_KEY'. (basically NotNull if update: for the constraint)
     */
    public void setAllocImpKey(Long allocImpKey) {
        registerModifiedProperty("allocImpKey");
        _allocImpKey = allocImpKey;
    }

    /**
     * [get] ALC_IMP_RESG_No: {NotNull, bigint(19)} <br>
     * 引当不能補充先行No.
     * @return The value of the column 'ALC_IMP_RESG_No'. (basically NotNull if selected: for the constraint)
     */
    public Long getAlcImpResgNo() {
        checkSpecifiedProperty("alcImpResgNo");
        return _alcImpResgNo;
    }

    /**
     * [set] ALC_IMP_RESG_No: {NotNull, bigint(19)} <br>
     * 引当不能補充先行No.
     * @param alcImpResgNo The value of the column 'ALC_IMP_RESG_No'. (basically NotNull if update: for the constraint)
     */
    public void setAlcImpResgNo(Long alcImpResgNo) {
        registerModifiedProperty("alcImpResgNo");
        _alcImpResgNo = alcImpResgNo;
    }

    /**
     * [get] LOCATION_ID: {bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] EXPECT_QTY: {NotNull, bigint(19)} <br>
     * 山出し指示数量(個装)
     * @return The value of the column 'EXPECT_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getExpectQty() {
        checkSpecifiedProperty("expectQty");
        return _expectQty;
    }

    /**
     * [set] EXPECT_QTY: {NotNull, bigint(19)} <br>
     * 山出し指示数量(個装)
     * @param expectQty The value of the column 'EXPECT_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setExpectQty(Long expectQty) {
        registerModifiedProperty("expectQty");
        _expectQty = expectQty;
    }

    /**
     * [get] MANUFACTUREDATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTUREDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getManufacturedate() {
        checkSpecifiedProperty("manufacturedate");
        return convertEmptyToNull(_manufacturedate);
    }

    /**
     * [set] MANUFACTUREDATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param manufacturedate The value of the column 'MANUFACTUREDATE'. (basically NotNull if update: for the constraint)
     */
    public void setManufacturedate(String manufacturedate) {
        registerModifiedProperty("manufacturedate");
        _manufacturedate = manufacturedate;
    }

    /**
     * [get] DESIGN_FLG: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDesignFlg() {
        checkSpecifiedProperty("designFlg");
        return convertEmptyToNull(_designFlg);
    }

    /**
     * [set] DESIGN_FLG: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @param designFlg The value of the column 'DESIGN_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDesignFlg(String designFlg) {
        registerModifiedProperty("designFlg");
        _designFlg = designFlg;
    }

    /**
     * [get] ALCIMEXP_FLG: {NotNull, varchar(30)} <br>
     * マスタ登録有無フラグ
     * @return The value of the column 'ALCIMEXP_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getAlcimexpFlg() {
        checkSpecifiedProperty("alcimexpFlg");
        return convertEmptyToNull(_alcimexpFlg);
    }

    /**
     * [set] ALCIMEXP_FLG: {NotNull, varchar(30)} <br>
     * マスタ登録有無フラグ
     * @param alcimexpFlg The value of the column 'ALCIMEXP_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setAlcimexpFlg(String alcimexpFlg) {
        registerModifiedProperty("alcimexpFlg");
        _alcimexpFlg = alcimexpFlg;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
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

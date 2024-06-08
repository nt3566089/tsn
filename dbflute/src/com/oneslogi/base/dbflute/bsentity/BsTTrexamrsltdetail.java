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
 * The entity of T_TREXAMRSLTDETAIL as TABLE. <br>
 * 検査実績明細
 * <pre>
 * [primary-key]
 *     TREXAMRSLTDETAIL_ID
 *
 * [column]
 *     TREXAMRSLTDETAIL_ID, TREXAMRESULT_ID, EXAMLINENO, ZAIKOINV_ID, ZAIKOINV, EXAMQTY, RES40QTY1, RES40QTY2, INFERIORQTY, AFTZAIKOINV_ID, AFTZAIKOINV, RESERVATIONFLG, EXAMDETAILSTS, EXAMDATE, NOTEXAMQTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TREXAMRSLTDETAIL_ID
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
 * Long trexamrsltdetailId = entity.getTrexamrsltdetailId();
 * Long trexamresultId = entity.getTrexamresultId();
 * Long examlineno = entity.getExamlineno();
 * Long zaikoinvId = entity.getZaikoinvId();
 * String zaikoinv = entity.getZaikoinv();
 * java.math.BigDecimal examqty = entity.getExamqty();
 * java.math.BigDecimal res40qty1 = entity.getRes40qty1();
 * java.math.BigDecimal res40qty2 = entity.getRes40qty2();
 * java.math.BigDecimal inferiorqty = entity.getInferiorqty();
 * Long aftzaikoinvId = entity.getAftzaikoinvId();
 * String aftzaikoinv = entity.getAftzaikoinv();
 * String reservationflg = entity.getReservationflg();
 * String examdetailsts = entity.getExamdetailsts();
 * String examdate = entity.getExamdate();
 * java.math.BigDecimal notexamqty = entity.getNotexamqty();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrexamrsltdetailId(trexamrsltdetailId);
 * entity.setTrexamresultId(trexamresultId);
 * entity.setExamlineno(examlineno);
 * entity.setZaikoinvId(zaikoinvId);
 * entity.setZaikoinv(zaikoinv);
 * entity.setExamqty(examqty);
 * entity.setRes40qty1(res40qty1);
 * entity.setRes40qty2(res40qty2);
 * entity.setInferiorqty(inferiorqty);
 * entity.setAftzaikoinvId(aftzaikoinvId);
 * entity.setAftzaikoinv(aftzaikoinv);
 * entity.setReservationflg(reservationflg);
 * entity.setExamdetailsts(examdetailsts);
 * entity.setExamdate(examdate);
 * entity.setNotexamqty(notexamqty);
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
public abstract class BsTTrexamrsltdetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trexamrsltdetailId;

    /** TREXAMRESULT_ID: {NotNull, bigint(19)} */
    protected Long _trexamresultId;

    /** EXAMLINENO: {NotNull, bigint(19)} */
    protected Long _examlineno;

    /** ZAIKOINV_ID: {bigint(19)} */
    protected Long _zaikoinvId;

    /** ZAIKOINV: {varchar(30)} */
    protected String _zaikoinv;

    /** EXAMQTY: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _examqty;

    /** RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _res40qty1;

    /** RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _res40qty2;

    /** INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _inferiorqty;

    /** AFTZAIKOINV_ID: {bigint(19)} */
    protected Long _aftzaikoinvId;

    /** AFTZAIKOINV: {NotNull, varchar(30)} */
    protected String _aftzaikoinv;

    /** RESERVATIONFLG: {NotNull, char(1), default=[(0)]} */
    protected String _reservationflg;

    /** EXAMDETAILSTS: {NotNull, char(1), default=[(0)]} */
    protected String _examdetailsts;

    /** EXAMDATE: {varchar(8)} */
    protected String _examdate;

    /** NOTEXAMQTY: {decimal(16, 6)} */
    protected java.math.BigDecimal _notexamqty;

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
        return "T_TREXAMRSLTDETAIL";
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
        if (_trexamrsltdetailId == null) { return false; }
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
        if (obj instanceof BsTTrexamrsltdetail) {
            BsTTrexamrsltdetail other = (BsTTrexamrsltdetail)obj;
            if (!xSV(_trexamrsltdetailId, other._trexamrsltdetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trexamrsltdetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trexamrsltdetailId));
        sb.append(dm).append(xfND(_trexamresultId));
        sb.append(dm).append(xfND(_examlineno));
        sb.append(dm).append(xfND(_zaikoinvId));
        sb.append(dm).append(xfND(_zaikoinv));
        sb.append(dm).append(xfND(_examqty));
        sb.append(dm).append(xfND(_res40qty1));
        sb.append(dm).append(xfND(_res40qty2));
        sb.append(dm).append(xfND(_inferiorqty));
        sb.append(dm).append(xfND(_aftzaikoinvId));
        sb.append(dm).append(xfND(_aftzaikoinv));
        sb.append(dm).append(xfND(_reservationflg));
        sb.append(dm).append(xfND(_examdetailsts));
        sb.append(dm).append(xfND(_examdate));
        sb.append(dm).append(xfND(_notexamqty));
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
        return "";
    }

    @Override
    public TTrexamrsltdetail clone() {
        return (TTrexamrsltdetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 検査実績明細ID
     * @return The value of the column 'TREXAMRSLTDETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrexamrsltdetailId() {
        checkSpecifiedProperty("trexamrsltdetailId");
        return _trexamrsltdetailId;
    }

    /**
     * [set] TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 検査実績明細ID
     * @param trexamrsltdetailId The value of the column 'TREXAMRSLTDETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrexamrsltdetailId(Long trexamrsltdetailId) {
        registerModifiedProperty("trexamrsltdetailId");
        _trexamrsltdetailId = trexamrsltdetailId;
    }

    /**
     * [get] TREXAMRESULT_ID: {NotNull, bigint(19)} <br>
     * 検査実績ID
     * @return The value of the column 'TREXAMRESULT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrexamresultId() {
        checkSpecifiedProperty("trexamresultId");
        return _trexamresultId;
    }

    /**
     * [set] TREXAMRESULT_ID: {NotNull, bigint(19)} <br>
     * 検査実績ID
     * @param trexamresultId The value of the column 'TREXAMRESULT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrexamresultId(Long trexamresultId) {
        registerModifiedProperty("trexamresultId");
        _trexamresultId = trexamresultId;
    }

    /**
     * [get] EXAMLINENO: {NotNull, bigint(19)} <br>
     * 検査行No.
     * @return The value of the column 'EXAMLINENO'. (basically NotNull if selected: for the constraint)
     */
    public Long getExamlineno() {
        checkSpecifiedProperty("examlineno");
        return _examlineno;
    }

    /**
     * [set] EXAMLINENO: {NotNull, bigint(19)} <br>
     * 検査行No.
     * @param examlineno The value of the column 'EXAMLINENO'. (basically NotNull if update: for the constraint)
     */
    public void setExamlineno(Long examlineno) {
        registerModifiedProperty("examlineno");
        _examlineno = examlineno;
    }

    /**
     * [get] ZAIKOINV_ID: {bigint(19)} <br>
     * 検査前在庫区分ID
     * @return The value of the column 'ZAIKOINV_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZaikoinvId() {
        checkSpecifiedProperty("zaikoinvId");
        return _zaikoinvId;
    }

    /**
     * [set] ZAIKOINV_ID: {bigint(19)} <br>
     * 検査前在庫区分ID
     * @param zaikoinvId The value of the column 'ZAIKOINV_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZaikoinvId(Long zaikoinvId) {
        registerModifiedProperty("zaikoinvId");
        _zaikoinvId = zaikoinvId;
    }

    /**
     * [get] ZAIKOINV: {varchar(30)} <br>
     * 検査前在庫区分
     * @return The value of the column 'ZAIKOINV'. (NullAllowed even if selected: for no constraint)
     */
    public String getZaikoinv() {
        checkSpecifiedProperty("zaikoinv");
        return convertEmptyToNull(_zaikoinv);
    }

    /**
     * [set] ZAIKOINV: {varchar(30)} <br>
     * 検査前在庫区分
     * @param zaikoinv The value of the column 'ZAIKOINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZaikoinv(String zaikoinv) {
        registerModifiedProperty("zaikoinv");
        _zaikoinv = zaikoinv;
    }

    /**
     * [get] EXAMQTY: {NotNull, decimal(16, 6)} <br>
     * 検査予定数量（個装）
     * @return The value of the column 'EXAMQTY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getExamqty() {
        checkSpecifiedProperty("examqty");
        return _examqty;
    }

    /**
     * [set] EXAMQTY: {NotNull, decimal(16, 6)} <br>
     * 検査予定数量（個装）
     * @param examqty The value of the column 'EXAMQTY'. (basically NotNull if update: for the constraint)
     */
    public void setExamqty(java.math.BigDecimal examqty) {
        registerModifiedProperty("examqty");
        _examqty = examqty;
    }

    /**
     * [get] RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * ｶｰﾄﾝ検査済正常数量（個装）
     * @return The value of the column 'RES40QTY1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRes40qty1() {
        checkSpecifiedProperty("res40qty1");
        return _res40qty1;
    }

    /**
     * [set] RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * ｶｰﾄﾝ検査済正常数量（個装）
     * @param res40qty1 The value of the column 'RES40QTY1'. (basically NotNull if update: for the constraint)
     */
    public void setRes40qty1(java.math.BigDecimal res40qty1) {
        registerModifiedProperty("res40qty1");
        _res40qty1 = res40qty1;
    }

    /**
     * [get] RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * ﾊﾟｯｸ検査済正常数量（個装）
     * @return The value of the column 'RES40QTY2'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRes40qty2() {
        checkSpecifiedProperty("res40qty2");
        return _res40qty2;
    }

    /**
     * [set] RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * ﾊﾟｯｸ検査済正常数量（個装）
     * @param res40qty2 The value of the column 'RES40QTY2'. (basically NotNull if update: for the constraint)
     */
    public void setRes40qty2(java.math.BigDecimal res40qty2) {
        registerModifiedProperty("res40qty2");
        _res40qty2 = res40qty2;
    }

    /**
     * [get] INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 不良数量(個装）
     * @return The value of the column 'INFERIORQTY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getInferiorqty() {
        checkSpecifiedProperty("inferiorqty");
        return _inferiorqty;
    }

    /**
     * [set] INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 不良数量(個装）
     * @param inferiorqty The value of the column 'INFERIORQTY'. (basically NotNull if update: for the constraint)
     */
    public void setInferiorqty(java.math.BigDecimal inferiorqty) {
        registerModifiedProperty("inferiorqty");
        _inferiorqty = inferiorqty;
    }

    /**
     * [get] AFTZAIKOINV_ID: {bigint(19)} <br>
     * 検査後在庫区分ID
     * @return The value of the column 'AFTZAIKOINV_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAftzaikoinvId() {
        checkSpecifiedProperty("aftzaikoinvId");
        return _aftzaikoinvId;
    }

    /**
     * [set] AFTZAIKOINV_ID: {bigint(19)} <br>
     * 検査後在庫区分ID
     * @param aftzaikoinvId The value of the column 'AFTZAIKOINV_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAftzaikoinvId(Long aftzaikoinvId) {
        registerModifiedProperty("aftzaikoinvId");
        _aftzaikoinvId = aftzaikoinvId;
    }

    /**
     * [get] AFTZAIKOINV: {NotNull, varchar(30)} <br>
     * 検査後在庫区分
     * @return The value of the column 'AFTZAIKOINV'. (basically NotNull if selected: for the constraint)
     */
    public String getAftzaikoinv() {
        checkSpecifiedProperty("aftzaikoinv");
        return convertEmptyToNull(_aftzaikoinv);
    }

    /**
     * [set] AFTZAIKOINV: {NotNull, varchar(30)} <br>
     * 検査後在庫区分
     * @param aftzaikoinv The value of the column 'AFTZAIKOINV'. (basically NotNull if update: for the constraint)
     */
    public void setAftzaikoinv(String aftzaikoinv) {
        registerModifiedProperty("aftzaikoinv");
        _aftzaikoinv = aftzaikoinv;
    }

    /**
     * [get] RESERVATIONFLG: {NotNull, char(1), default=[(0)]} <br>
     * 保留フラグ
     * @return The value of the column 'RESERVATIONFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getReservationflg() {
        checkSpecifiedProperty("reservationflg");
        return convertEmptyToNull(_reservationflg);
    }

    /**
     * [set] RESERVATIONFLG: {NotNull, char(1), default=[(0)]} <br>
     * 保留フラグ
     * @param reservationflg The value of the column 'RESERVATIONFLG'. (basically NotNull if update: for the constraint)
     */
    public void setReservationflg(String reservationflg) {
        registerModifiedProperty("reservationflg");
        _reservationflg = reservationflg;
    }

    /**
     * [get] EXAMDETAILSTS: {NotNull, char(1), default=[(0)]} <br>
     * 検査明細ステータス
     * @return The value of the column 'EXAMDETAILSTS'. (basically NotNull if selected: for the constraint)
     */
    public String getExamdetailsts() {
        checkSpecifiedProperty("examdetailsts");
        return convertEmptyToNull(_examdetailsts);
    }

    /**
     * [set] EXAMDETAILSTS: {NotNull, char(1), default=[(0)]} <br>
     * 検査明細ステータス
     * @param examdetailsts The value of the column 'EXAMDETAILSTS'. (basically NotNull if update: for the constraint)
     */
    public void setExamdetailsts(String examdetailsts) {
        registerModifiedProperty("examdetailsts");
        _examdetailsts = examdetailsts;
    }

    /**
     * [get] EXAMDATE: {varchar(8)} <br>
     * 検査日
     * @return The value of the column 'EXAMDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getExamdate() {
        checkSpecifiedProperty("examdate");
        return convertEmptyToNull(_examdate);
    }

    /**
     * [set] EXAMDATE: {varchar(8)} <br>
     * 検査日
     * @param examdate The value of the column 'EXAMDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExamdate(String examdate) {
        registerModifiedProperty("examdate");
        _examdate = examdate;
    }

    /**
     * [get] NOTEXAMQTY: {decimal(16, 6)} <br>
     * 検査対象外数量(個装）
     * @return The value of the column 'NOTEXAMQTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNotexamqty() {
        checkSpecifiedProperty("notexamqty");
        return _notexamqty;
    }

    /**
     * [set] NOTEXAMQTY: {decimal(16, 6)} <br>
     * 検査対象外数量(個装）
     * @param notexamqty The value of the column 'NOTEXAMQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotexamqty(java.math.BigDecimal notexamqty) {
        registerModifiedProperty("notexamqty");
        _notexamqty = notexamqty;
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

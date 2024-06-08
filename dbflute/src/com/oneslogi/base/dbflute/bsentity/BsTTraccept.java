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
 * The entity of T_TRACCEPT as TABLE. <br>
 * 入庫受付
 * <pre>
 * [primary-key]
 *     TRACCEPT_ID
 *
 * [column]
 *     TRACCEPT_ID, PREKEY, ACCEPTTYPE, ACCEPTGROUP, NOTES, LOGISTICSCD, WAREHOUSECD, LOCCD, INSPECTEDUSERCD, CARRIERCD, CARRIERNAME, CARRIERWBNO, DELIVERYCD, CARRIERNO, CARRIERSNAME, ACTUALTIME, COMPLETETIME, ACCEPTLINETOTAL, TAGLABELPRINTFLG, RECEIVE_PLAN_H_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRACCEPT_ID
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
 * Long tracceptId = entity.getTracceptId();
 * java.math.BigDecimal prekey = entity.getPrekey();
 * String accepttype = entity.getAccepttype();
 * String acceptgroup = entity.getAcceptgroup();
 * String notes = entity.getNotes();
 * String logisticscd = entity.getLogisticscd();
 * String warehousecd = entity.getWarehousecd();
 * String loccd = entity.getLoccd();
 * String inspectedusercd = entity.getInspectedusercd();
 * String carriercd = entity.getCarriercd();
 * String carriername = entity.getCarriername();
 * String carrierwbno = entity.getCarrierwbno();
 * String deliverycd = entity.getDeliverycd();
 * String carrierno = entity.getCarrierno();
 * String carriersname = entity.getCarriersname();
 * java.sql.Timestamp actualtime = entity.getActualtime();
 * java.sql.Timestamp completetime = entity.getCompletetime();
 * java.math.BigDecimal acceptlinetotal = entity.getAcceptlinetotal();
 * java.math.BigDecimal taglabelprintflg = entity.getTaglabelprintflg();
 * Long receivePlanHId = entity.getReceivePlanHId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTracceptId(tracceptId);
 * entity.setPrekey(prekey);
 * entity.setAccepttype(accepttype);
 * entity.setAcceptgroup(acceptgroup);
 * entity.setNotes(notes);
 * entity.setLogisticscd(logisticscd);
 * entity.setWarehousecd(warehousecd);
 * entity.setLoccd(loccd);
 * entity.setInspectedusercd(inspectedusercd);
 * entity.setCarriercd(carriercd);
 * entity.setCarriername(carriername);
 * entity.setCarrierwbno(carrierwbno);
 * entity.setDeliverycd(deliverycd);
 * entity.setCarrierno(carrierno);
 * entity.setCarriersname(carriersname);
 * entity.setActualtime(actualtime);
 * entity.setCompletetime(completetime);
 * entity.setAcceptlinetotal(acceptlinetotal);
 * entity.setTaglabelprintflg(taglabelprintflg);
 * entity.setReceivePlanHId(receivePlanHId);
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
public abstract class BsTTraccept extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _tracceptId;

    /** PREKEY: {IX, decimal(16, 6)} */
    protected java.math.BigDecimal _prekey;

    /** ACCEPTTYPE: {varchar(30)} */
    protected String _accepttype;

    /** ACCEPTGROUP: {varchar(60)} */
    protected String _acceptgroup;

    /** NOTES: {varchar(4000)} */
    protected String _notes;

    /** LOGISTICSCD: {NotNull, varchar(30)} */
    protected String _logisticscd;

    /** WAREHOUSECD: {IX+, NotNull, varchar(30)} */
    protected String _warehousecd;

    /** LOCCD: {varchar(30)} */
    protected String _loccd;

    /** INSPECTEDUSERCD: {varchar(30)} */
    protected String _inspectedusercd;

    /** CARRIERCD: {varchar(30)} */
    protected String _carriercd;

    /** CARRIERNAME: {varchar(255)} */
    protected String _carriername;

    /** CARRIERWBNO: {varchar(60)} */
    protected String _carrierwbno;

    /** DELIVERYCD: {varchar(30)} */
    protected String _deliverycd;

    /** CARRIERNO: {varchar(60)} */
    protected String _carrierno;

    /** CARRIERSNAME: {varchar(100)} */
    protected String _carriersname;

    /** ACTUALTIME: {datetime2(26, 6)} */
    protected java.sql.Timestamp _actualtime;

    /** COMPLETETIME: {datetime2(26, 6)} */
    protected java.sql.Timestamp _completetime;

    /** ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _acceptlinetotal;

    /** TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _taglabelprintflg;

    /** RECEIVE_PLAN_H_ID: {IX, bigint(19)} */
    protected Long _receivePlanHId;

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
        return "T_TRACCEPT";
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
        if (_tracceptId == null) { return false; }
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
        if (obj instanceof BsTTraccept) {
            BsTTraccept other = (BsTTraccept)obj;
            if (!xSV(_tracceptId, other._tracceptId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _tracceptId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_tracceptId));
        sb.append(dm).append(xfND(_prekey));
        sb.append(dm).append(xfND(_accepttype));
        sb.append(dm).append(xfND(_acceptgroup));
        sb.append(dm).append(xfND(_notes));
        sb.append(dm).append(xfND(_logisticscd));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_loccd));
        sb.append(dm).append(xfND(_inspectedusercd));
        sb.append(dm).append(xfND(_carriercd));
        sb.append(dm).append(xfND(_carriername));
        sb.append(dm).append(xfND(_carrierwbno));
        sb.append(dm).append(xfND(_deliverycd));
        sb.append(dm).append(xfND(_carrierno));
        sb.append(dm).append(xfND(_carriersname));
        sb.append(dm).append(xfND(_actualtime));
        sb.append(dm).append(xfND(_completetime));
        sb.append(dm).append(xfND(_acceptlinetotal));
        sb.append(dm).append(xfND(_taglabelprintflg));
        sb.append(dm).append(xfND(_receivePlanHId));
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
    public TTraccept clone() {
        return (TTraccept)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫受付ID
     * @return The value of the column 'TRACCEPT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTracceptId() {
        checkSpecifiedProperty("tracceptId");
        return _tracceptId;
    }

    /**
     * [set] TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫受付ID
     * @param tracceptId The value of the column 'TRACCEPT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTracceptId(Long tracceptId) {
        registerModifiedProperty("tracceptId");
        _tracceptId = tracceptId;
    }

    /**
     * [get] PREKEY: {IX, decimal(16, 6)} <br>
     * 元Ｋｅｙ
     * @return The value of the column 'PREKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPrekey() {
        checkSpecifiedProperty("prekey");
        return _prekey;
    }

    /**
     * [set] PREKEY: {IX, decimal(16, 6)} <br>
     * 元Ｋｅｙ
     * @param prekey The value of the column 'PREKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrekey(java.math.BigDecimal prekey) {
        registerModifiedProperty("prekey");
        _prekey = prekey;
    }

    /**
     * [get] ACCEPTTYPE: {varchar(30)} <br>
     * 入庫受付タイプ
     * @return The value of the column 'ACCEPTTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getAccepttype() {
        checkSpecifiedProperty("accepttype");
        return convertEmptyToNull(_accepttype);
    }

    /**
     * [set] ACCEPTTYPE: {varchar(30)} <br>
     * 入庫受付タイプ
     * @param accepttype The value of the column 'ACCEPTTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAccepttype(String accepttype) {
        registerModifiedProperty("accepttype");
        _accepttype = accepttype;
    }

    /**
     * [get] ACCEPTGROUP: {varchar(60)} <br>
     * 入庫受付グループ
     * @return The value of the column 'ACCEPTGROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getAcceptgroup() {
        checkSpecifiedProperty("acceptgroup");
        return convertEmptyToNull(_acceptgroup);
    }

    /**
     * [set] ACCEPTGROUP: {varchar(60)} <br>
     * 入庫受付グループ
     * @param acceptgroup The value of the column 'ACCEPTGROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAcceptgroup(String acceptgroup) {
        registerModifiedProperty("acceptgroup");
        _acceptgroup = acceptgroup;
    }

    /**
     * [get] NOTES: {varchar(4000)} <br>
     * 備考
     * @return The value of the column 'NOTES'. (NullAllowed even if selected: for no constraint)
     */
    public String getNotes() {
        checkSpecifiedProperty("notes");
        return convertEmptyToNull(_notes);
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * 備考
     * @param notes The value of the column 'NOTES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotes(String notes) {
        registerModifiedProperty("notes");
        _notes = notes;
    }

    /**
     * [get] LOGISTICSCD: {NotNull, varchar(30)} <br>
     * 取引先（倉庫会社）CD
     * @return The value of the column 'LOGISTICSCD'. (basically NotNull if selected: for the constraint)
     */
    public String getLogisticscd() {
        checkSpecifiedProperty("logisticscd");
        return convertEmptyToNull(_logisticscd);
    }

    /**
     * [set] LOGISTICSCD: {NotNull, varchar(30)} <br>
     * 取引先（倉庫会社）CD
     * @param logisticscd The value of the column 'LOGISTICSCD'. (basically NotNull if update: for the constraint)
     */
    public void setLogisticscd(String logisticscd) {
        registerModifiedProperty("logisticscd");
        _logisticscd = logisticscd;
    }

    /**
     * [get] WAREHOUSECD: {IX+, NotNull, varchar(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSECD'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {IX+, NotNull, varchar(30)} <br>
     * 倉庫CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * 検品ロケーションCD
     * @return The value of the column 'LOCCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLoccd() {
        checkSpecifiedProperty("loccd");
        return convertEmptyToNull(_loccd);
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * 検品ロケーションCD
     * @param loccd The value of the column 'LOCCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoccd(String loccd) {
        registerModifiedProperty("loccd");
        _loccd = loccd;
    }

    /**
     * [get] INSPECTEDUSERCD: {varchar(30)} <br>
     * 検品担当者
     * @return The value of the column 'INSPECTEDUSERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getInspectedusercd() {
        checkSpecifiedProperty("inspectedusercd");
        return convertEmptyToNull(_inspectedusercd);
    }

    /**
     * [set] INSPECTEDUSERCD: {varchar(30)} <br>
     * 検品担当者
     * @param inspectedusercd The value of the column 'INSPECTEDUSERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInspectedusercd(String inspectedusercd) {
        registerModifiedProperty("inspectedusercd");
        _inspectedusercd = inspectedusercd;
    }

    /**
     * [get] CARRIERCD: {varchar(30)} <br>
     * 取引先（運送会社）CD
     * @return The value of the column 'CARRIERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriercd() {
        checkSpecifiedProperty("carriercd");
        return convertEmptyToNull(_carriercd);
    }

    /**
     * [set] CARRIERCD: {varchar(30)} <br>
     * 取引先（運送会社）CD
     * @param carriercd The value of the column 'CARRIERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriercd(String carriercd) {
        registerModifiedProperty("carriercd");
        _carriercd = carriercd;
    }

    /**
     * [get] CARRIERNAME: {varchar(255)} <br>
     * 運送会社名称
     * @return The value of the column 'CARRIERNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriername() {
        checkSpecifiedProperty("carriername");
        return convertEmptyToNull(_carriername);
    }

    /**
     * [set] CARRIERNAME: {varchar(255)} <br>
     * 運送会社名称
     * @param carriername The value of the column 'CARRIERNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriername(String carriername) {
        registerModifiedProperty("carriername");
        _carriername = carriername;
    }

    /**
     * [get] CARRIERWBNO: {varchar(60)} <br>
     * 運送会社送り状番号
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierwbno() {
        checkSpecifiedProperty("carrierwbno");
        return convertEmptyToNull(_carrierwbno);
    }

    /**
     * [set] CARRIERWBNO: {varchar(60)} <br>
     * 運送会社送り状番号
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierwbno(String carrierwbno) {
        registerModifiedProperty("carrierwbno");
        _carrierwbno = carrierwbno;
    }

    /**
     * [get] DELIVERYCD: {varchar(30)} <br>
     * 便CD
     * @return The value of the column 'DELIVERYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliverycd() {
        checkSpecifiedProperty("deliverycd");
        return convertEmptyToNull(_deliverycd);
    }

    /**
     * [set] DELIVERYCD: {varchar(30)} <br>
     * 便CD
     * @param deliverycd The value of the column 'DELIVERYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliverycd(String deliverycd) {
        registerModifiedProperty("deliverycd");
        _deliverycd = deliverycd;
    }

    /**
     * [get] CARRIERNO: {varchar(60)} <br>
     * 車番／荷揃グループ
     * @return The value of the column 'CARRIERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierno() {
        checkSpecifiedProperty("carrierno");
        return convertEmptyToNull(_carrierno);
    }

    /**
     * [set] CARRIERNO: {varchar(60)} <br>
     * 車番／荷揃グループ
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierno(String carrierno) {
        registerModifiedProperty("carrierno");
        _carrierno = carrierno;
    }

    /**
     * [get] CARRIERSNAME: {varchar(100)} <br>
     * 乗務員
     * @return The value of the column 'CARRIERSNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriersname() {
        checkSpecifiedProperty("carriersname");
        return convertEmptyToNull(_carriersname);
    }

    /**
     * [set] CARRIERSNAME: {varchar(100)} <br>
     * 乗務員
     * @param carriersname The value of the column 'CARRIERSNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriersname(String carriersname) {
        registerModifiedProperty("carriersname");
        _carriersname = carriersname;
    }

    /**
     * [get] ACTUALTIME: {datetime2(26, 6)} <br>
     * 到着時刻
     * @return The value of the column 'ACTUALTIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getActualtime() {
        checkSpecifiedProperty("actualtime");
        return _actualtime;
    }

    /**
     * [set] ACTUALTIME: {datetime2(26, 6)} <br>
     * 到着時刻
     * @param actualtime The value of the column 'ACTUALTIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setActualtime(java.sql.Timestamp actualtime) {
        registerModifiedProperty("actualtime");
        _actualtime = actualtime;
    }

    /**
     * [get] COMPLETETIME: {datetime2(26, 6)} <br>
     * 検品完了時刻
     * @return The value of the column 'COMPLETETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getCompletetime() {
        checkSpecifiedProperty("completetime");
        return _completetime;
    }

    /**
     * [set] COMPLETETIME: {datetime2(26, 6)} <br>
     * 検品完了時刻
     * @param completetime The value of the column 'COMPLETETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompletetime(java.sql.Timestamp completetime) {
        registerModifiedProperty("completetime");
        _completetime = completetime;
    }

    /**
     * [get] ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]} <br>
     * 入庫受付総行数
     * @return The value of the column 'ACCEPTLINETOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAcceptlinetotal() {
        checkSpecifiedProperty("acceptlinetotal");
        return _acceptlinetotal;
    }

    /**
     * [set] ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]} <br>
     * 入庫受付総行数
     * @param acceptlinetotal The value of the column 'ACCEPTLINETOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAcceptlinetotal(java.math.BigDecimal acceptlinetotal) {
        registerModifiedProperty("acceptlinetotal");
        _acceptlinetotal = acceptlinetotal;
    }

    /**
     * [get] TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} <br>
     * タグラベル発行済フラグ
     * @return The value of the column 'TAGLABELPRINTFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTaglabelprintflg() {
        checkSpecifiedProperty("taglabelprintflg");
        return _taglabelprintflg;
    }

    /**
     * [set] TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} <br>
     * タグラベル発行済フラグ
     * @param taglabelprintflg The value of the column 'TAGLABELPRINTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setTaglabelprintflg(java.math.BigDecimal taglabelprintflg) {
        registerModifiedProperty("taglabelprintflg");
        _taglabelprintflg = taglabelprintflg;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {IX, bigint(19)} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceivePlanHId() {
        checkSpecifiedProperty("receivePlanHId");
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {IX, bigint(19)} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        registerModifiedProperty("receivePlanHId");
        _receivePlanHId = receivePlanHId;
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

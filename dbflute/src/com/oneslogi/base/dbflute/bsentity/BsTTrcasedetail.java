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
 * The entity of T_TRCASEDETAIL as TABLE. <br>
 * ケース明細情報
 * <pre>
 * [primary-key]
 *     TRCASEDETAIL_ID
 *
 * [column]
 *     TRCASEDETAIL_ID, CASEDETAILNO, TRSYMBOL_ID, CREATEDATETIME, TRACETYPEDT, OPERATIONNUM, ASSORTINITNUM, ASSORTNUM, ASSORTEDCD, ASSORTEDUNIT, ASSORTEDINDEX, ASSORTDIFNUM, DIRECTIONCD, PISTONTYPE, DIRECTIONNUM, SHIPORDER, CUSTOMERCD, CASESERIAL, DISTWAREHOUSECD, SENDSTS, DT_EXTDATA1, DT_EXTDATA2, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRCASEDETAIL_ID
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
 * Long trcasedetailId = entity.getTrcasedetailId();
 * Long casedetailno = entity.getCasedetailno();
 * Long trsymbolId = entity.getTrsymbolId();
 * java.sql.Timestamp createdatetime = entity.getCreatedatetime();
 * String tracetypedt = entity.getTracetypedt();
 * Long operationnum = entity.getOperationnum();
 * Long assortinitnum = entity.getAssortinitnum();
 * Long assortnum = entity.getAssortnum();
 * String assortedcd = entity.getAssortedcd();
 * String assortedunit = entity.getAssortedunit();
 * Long assortedindex = entity.getAssortedindex();
 * Long assortdifnum = entity.getAssortdifnum();
 * String directioncd = entity.getDirectioncd();
 * String pistontype = entity.getPistontype();
 * Long directionnum = entity.getDirectionnum();
 * Long shiporder = entity.getShiporder();
 * String customercd = entity.getCustomercd();
 * String caseserial = entity.getCaseserial();
 * String distwarehousecd = entity.getDistwarehousecd();
 * java.math.BigDecimal sendsts = entity.getSendsts();
 * String dtExtdata1 = entity.getDtExtdata1();
 * String dtExtdata2 = entity.getDtExtdata2();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrcasedetailId(trcasedetailId);
 * entity.setCasedetailno(casedetailno);
 * entity.setTrsymbolId(trsymbolId);
 * entity.setCreatedatetime(createdatetime);
 * entity.setTracetypedt(tracetypedt);
 * entity.setOperationnum(operationnum);
 * entity.setAssortinitnum(assortinitnum);
 * entity.setAssortnum(assortnum);
 * entity.setAssortedcd(assortedcd);
 * entity.setAssortedunit(assortedunit);
 * entity.setAssortedindex(assortedindex);
 * entity.setAssortdifnum(assortdifnum);
 * entity.setDirectioncd(directioncd);
 * entity.setPistontype(pistontype);
 * entity.setDirectionnum(directionnum);
 * entity.setShiporder(shiporder);
 * entity.setCustomercd(customercd);
 * entity.setCaseserial(caseserial);
 * entity.setDistwarehousecd(distwarehousecd);
 * entity.setSendsts(sendsts);
 * entity.setDtExtdata1(dtExtdata1);
 * entity.setDtExtdata2(dtExtdata2);
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
public abstract class BsTTrcasedetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)} */
    protected Long _trcasedetailId;

    /** CASEDETAILNO: {NotNull, bigint(19)} */
    protected Long _casedetailno;

    /** TRSYMBOL_ID: {IX+, NotNull, bigint(19)} */
    protected Long _trsymbolId;

    /** CREATEDATETIME: {NotNull, datetime2(26, 6)} */
    protected java.sql.Timestamp _createdatetime;

    /** TRACETYPEDT: {IX+, NotNull, varchar(30)} */
    protected String _tracetypedt;

    /** OPERATIONNUM: {bigint(19)} */
    protected Long _operationnum;

    /** ASSORTINITNUM: {bigint(19)} */
    protected Long _assortinitnum;

    /** ASSORTNUM: {bigint(19)} */
    protected Long _assortnum;

    /** ASSORTEDCD: {varchar(30)} */
    protected String _assortedcd;

    /** ASSORTEDUNIT: {varchar(255)} */
    protected String _assortedunit;

    /** ASSORTEDINDEX: {bigint(19)} */
    protected Long _assortedindex;

    /** ASSORTDIFNUM: {bigint(19)} */
    protected Long _assortdifnum;

    /** DIRECTIONCD: {varchar(30)} */
    protected String _directioncd;

    /** PISTONTYPE: {char(1)} */
    protected String _pistontype;

    /** DIRECTIONNUM: {bigint(19)} */
    protected Long _directionnum;

    /** SHIPORDER: {bigint(19)} */
    protected Long _shiporder;

    /** CUSTOMERCD: {IX+, varchar(30)} */
    protected String _customercd;

    /** CASESERIAL: {varchar(30)} */
    protected String _caseserial;

    /** DISTWAREHOUSECD: {varchar(30)} */
    protected String _distwarehousecd;

    /** SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _sendsts;

    /** DT_EXTDATA1: {varchar(8)} */
    protected String _dtExtdata1;

    /** DT_EXTDATA2: {varchar(8)} */
    protected String _dtExtdata2;

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
        return "T_TRCASEDETAIL";
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
        if (_trcasedetailId == null) { return false; }
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
        if (obj instanceof BsTTrcasedetail) {
            BsTTrcasedetail other = (BsTTrcasedetail)obj;
            if (!xSV(_trcasedetailId, other._trcasedetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trcasedetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trcasedetailId));
        sb.append(dm).append(xfND(_casedetailno));
        sb.append(dm).append(xfND(_trsymbolId));
        sb.append(dm).append(xfND(_createdatetime));
        sb.append(dm).append(xfND(_tracetypedt));
        sb.append(dm).append(xfND(_operationnum));
        sb.append(dm).append(xfND(_assortinitnum));
        sb.append(dm).append(xfND(_assortnum));
        sb.append(dm).append(xfND(_assortedcd));
        sb.append(dm).append(xfND(_assortedunit));
        sb.append(dm).append(xfND(_assortedindex));
        sb.append(dm).append(xfND(_assortdifnum));
        sb.append(dm).append(xfND(_directioncd));
        sb.append(dm).append(xfND(_pistontype));
        sb.append(dm).append(xfND(_directionnum));
        sb.append(dm).append(xfND(_shiporder));
        sb.append(dm).append(xfND(_customercd));
        sb.append(dm).append(xfND(_caseserial));
        sb.append(dm).append(xfND(_distwarehousecd));
        sb.append(dm).append(xfND(_sendsts));
        sb.append(dm).append(xfND(_dtExtdata1));
        sb.append(dm).append(xfND(_dtExtdata2));
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
    public TTrcasedetail clone() {
        return (TTrcasedetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)} <br>
     * ケース明細情報ID
     * @return The value of the column 'TRCASEDETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrcasedetailId() {
        checkSpecifiedProperty("trcasedetailId");
        return _trcasedetailId;
    }

    /**
     * [set] TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)} <br>
     * ケース明細情報ID
     * @param trcasedetailId The value of the column 'TRCASEDETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrcasedetailId(Long trcasedetailId) {
        registerModifiedProperty("trcasedetailId");
        _trcasedetailId = trcasedetailId;
    }

    /**
     * [get] CASEDETAILNO: {NotNull, bigint(19)} <br>
     * ケース明細番号
     * @return The value of the column 'CASEDETAILNO'. (basically NotNull if selected: for the constraint)
     */
    public Long getCasedetailno() {
        checkSpecifiedProperty("casedetailno");
        return _casedetailno;
    }

    /**
     * [set] CASEDETAILNO: {NotNull, bigint(19)} <br>
     * ケース明細番号
     * @param casedetailno The value of the column 'CASEDETAILNO'. (basically NotNull if update: for the constraint)
     */
    public void setCasedetailno(Long casedetailno) {
        registerModifiedProperty("casedetailno");
        _casedetailno = casedetailno;
    }

    /**
     * [get] TRSYMBOL_ID: {IX+, NotNull, bigint(19)} <br>
     * 段ボール情報ID
     * @return The value of the column 'TRSYMBOL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrsymbolId() {
        checkSpecifiedProperty("trsymbolId");
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {IX+, NotNull, bigint(19)} <br>
     * 段ボール情報ID
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrsymbolId(Long trsymbolId) {
        registerModifiedProperty("trsymbolId");
        _trsymbolId = trsymbolId;
    }

    /**
     * [get] CREATEDATETIME: {NotNull, datetime2(26, 6)} <br>
     * 作成日時
     * @return The value of the column 'CREATEDATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getCreatedatetime() {
        checkSpecifiedProperty("createdatetime");
        return _createdatetime;
    }

    /**
     * [set] CREATEDATETIME: {NotNull, datetime2(26, 6)} <br>
     * 作成日時
     * @param createdatetime The value of the column 'CREATEDATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedatetime(java.sql.Timestamp createdatetime) {
        registerModifiedProperty("createdatetime");
        _createdatetime = createdatetime;
    }

    /**
     * [get] TRACETYPEDT: {IX+, NotNull, varchar(30)} <br>
     * 追跡区分詳細
     * @return The value of the column 'TRACETYPEDT'. (basically NotNull if selected: for the constraint)
     */
    public String getTracetypedt() {
        checkSpecifiedProperty("tracetypedt");
        return convertEmptyToNull(_tracetypedt);
    }

    /**
     * [set] TRACETYPEDT: {IX+, NotNull, varchar(30)} <br>
     * 追跡区分詳細
     * @param tracetypedt The value of the column 'TRACETYPEDT'. (basically NotNull if update: for the constraint)
     */
    public void setTracetypedt(String tracetypedt) {
        registerModifiedProperty("tracetypedt");
        _tracetypedt = tracetypedt;
    }

    /**
     * [get] OPERATIONNUM: {bigint(19)} <br>
     * 操作数量
     * @return The value of the column 'OPERATIONNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOperationnum() {
        checkSpecifiedProperty("operationnum");
        return _operationnum;
    }

    /**
     * [set] OPERATIONNUM: {bigint(19)} <br>
     * 操作数量
     * @param operationnum The value of the column 'OPERATIONNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOperationnum(Long operationnum) {
        registerModifiedProperty("operationnum");
        _operationnum = operationnum;
    }

    /**
     * [get] ASSORTINITNUM: {bigint(19)} <br>
     * 仕分時数量
     * @return The value of the column 'ASSORTINITNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAssortinitnum() {
        checkSpecifiedProperty("assortinitnum");
        return _assortinitnum;
    }

    /**
     * [set] ASSORTINITNUM: {bigint(19)} <br>
     * 仕分時数量
     * @param assortinitnum The value of the column 'ASSORTINITNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortinitnum(Long assortinitnum) {
        registerModifiedProperty("assortinitnum");
        _assortinitnum = assortinitnum;
    }

    /**
     * [get] ASSORTNUM: {bigint(19)} <br>
     * 仕分数量
     * @return The value of the column 'ASSORTNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAssortnum() {
        checkSpecifiedProperty("assortnum");
        return _assortnum;
    }

    /**
     * [set] ASSORTNUM: {bigint(19)} <br>
     * 仕分数量
     * @param assortnum The value of the column 'ASSORTNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortnum(Long assortnum) {
        registerModifiedProperty("assortnum");
        _assortnum = assortnum;
    }

    /**
     * [get] ASSORTEDCD: {varchar(30)} <br>
     * 仕分場所
     * @return The value of the column 'ASSORTEDCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortedcd() {
        checkSpecifiedProperty("assortedcd");
        return convertEmptyToNull(_assortedcd);
    }

    /**
     * [set] ASSORTEDCD: {varchar(30)} <br>
     * 仕分場所
     * @param assortedcd The value of the column 'ASSORTEDCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortedcd(String assortedcd) {
        registerModifiedProperty("assortedcd");
        _assortedcd = assortedcd;
    }

    /**
     * [get] ASSORTEDUNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'ASSORTEDUNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortedunit() {
        checkSpecifiedProperty("assortedunit");
        return convertEmptyToNull(_assortedunit);
    }

    /**
     * [set] ASSORTEDUNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @param assortedunit The value of the column 'ASSORTEDUNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortedunit(String assortedunit) {
        registerModifiedProperty("assortedunit");
        _assortedunit = assortedunit;
    }

    /**
     * [get] ASSORTEDINDEX: {bigint(19)} <br>
     * 仕分ロケ投入順
     * @return The value of the column 'ASSORTEDINDEX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAssortedindex() {
        checkSpecifiedProperty("assortedindex");
        return _assortedindex;
    }

    /**
     * [set] ASSORTEDINDEX: {bigint(19)} <br>
     * 仕分ロケ投入順
     * @param assortedindex The value of the column 'ASSORTEDINDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortedindex(Long assortedindex) {
        registerModifiedProperty("assortedindex");
        _assortedindex = assortedindex;
    }

    /**
     * [get] ASSORTDIFNUM: {bigint(19)} <br>
     * 差異不良数量
     * @return The value of the column 'ASSORTDIFNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAssortdifnum() {
        checkSpecifiedProperty("assortdifnum");
        return _assortdifnum;
    }

    /**
     * [set] ASSORTDIFNUM: {bigint(19)} <br>
     * 差異不良数量
     * @param assortdifnum The value of the column 'ASSORTDIFNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortdifnum(Long assortdifnum) {
        registerModifiedProperty("assortdifnum");
        _assortdifnum = assortdifnum;
    }

    /**
     * [get] DIRECTIONCD: {varchar(30)} <br>
     * 方面CD
     * @return The value of the column 'DIRECTIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectioncd() {
        checkSpecifiedProperty("directioncd");
        return convertEmptyToNull(_directioncd);
    }

    /**
     * [set] DIRECTIONCD: {varchar(30)} <br>
     * 方面CD
     * @param directioncd The value of the column 'DIRECTIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectioncd(String directioncd) {
        registerModifiedProperty("directioncd");
        _directioncd = directioncd;
    }

    /**
     * [get] PISTONTYPE: {char(1)} <br>
     * ピストン区分
     * @return The value of the column 'PISTONTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPistontype() {
        checkSpecifiedProperty("pistontype");
        return convertEmptyToNull(_pistontype);
    }

    /**
     * [set] PISTONTYPE: {char(1)} <br>
     * ピストン区分
     * @param pistontype The value of the column 'PISTONTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPistontype(String pistontype) {
        registerModifiedProperty("pistontype");
        _pistontype = pistontype;
    }

    /**
     * [get] DIRECTIONNUM: {bigint(19)} <br>
     * さしず数量
     * @return The value of the column 'DIRECTIONNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDirectionnum() {
        checkSpecifiedProperty("directionnum");
        return _directionnum;
    }

    /**
     * [set] DIRECTIONNUM: {bigint(19)} <br>
     * さしず数量
     * @param directionnum The value of the column 'DIRECTIONNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionnum(Long directionnum) {
        registerModifiedProperty("directionnum");
        _directionnum = directionnum;
    }

    /**
     * [get] SHIPORDER: {bigint(19)} <br>
     * 出庫順
     * @return The value of the column 'SHIPORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShiporder() {
        checkSpecifiedProperty("shiporder");
        return _shiporder;
    }

    /**
     * [set] SHIPORDER: {bigint(19)} <br>
     * 出庫順
     * @param shiporder The value of the column 'SHIPORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiporder(Long shiporder) {
        registerModifiedProperty("shiporder");
        _shiporder = shiporder;
    }

    /**
     * [get] CUSTOMERCD: {IX+, varchar(30)} <br>
     * お得意様CD
     * @return The value of the column 'CUSTOMERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomercd() {
        checkSpecifiedProperty("customercd");
        return convertEmptyToNull(_customercd);
    }

    /**
     * [set] CUSTOMERCD: {IX+, varchar(30)} <br>
     * お得意様CD
     * @param customercd The value of the column 'CUSTOMERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomercd(String customercd) {
        registerModifiedProperty("customercd");
        _customercd = customercd;
    }

    /**
     * [get] CASESERIAL: {varchar(30)} <br>
     * 箱№（通番）
     * @return The value of the column 'CASESERIAL'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseserial() {
        checkSpecifiedProperty("caseserial");
        return convertEmptyToNull(_caseserial);
    }

    /**
     * [set] CASESERIAL: {varchar(30)} <br>
     * 箱№（通番）
     * @param caseserial The value of the column 'CASESERIAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseserial(String caseserial) {
        registerModifiedProperty("caseserial");
        _caseserial = caseserial;
    }

    /**
     * [get] DISTWAREHOUSECD: {varchar(30)} <br>
     * 融通先CD
     * @return The value of the column 'DISTWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistwarehousecd() {
        checkSpecifiedProperty("distwarehousecd");
        return convertEmptyToNull(_distwarehousecd);
    }

    /**
     * [set] DISTWAREHOUSECD: {varchar(30)} <br>
     * 融通先CD
     * @param distwarehousecd The value of the column 'DISTWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistwarehousecd(String distwarehousecd) {
        registerModifiedProperty("distwarehousecd");
        _distwarehousecd = distwarehousecd;
    }

    /**
     * [get] SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]} <br>
     * 送信状態
     * @return The value of the column 'SENDSTS'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSendsts() {
        checkSpecifiedProperty("sendsts");
        return _sendsts;
    }

    /**
     * [set] SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]} <br>
     * 送信状態
     * @param sendsts The value of the column 'SENDSTS'. (basically NotNull if update: for the constraint)
     */
    public void setSendsts(java.math.BigDecimal sendsts) {
        registerModifiedProperty("sendsts");
        _sendsts = sendsts;
    }

    /**
     * [get] DT_EXTDATA1: {varchar(8)} <br>
     * 処理日
     * @return The value of the column 'DT_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata1() {
        checkSpecifiedProperty("dtExtdata1");
        return convertEmptyToNull(_dtExtdata1);
    }

    /**
     * [set] DT_EXTDATA1: {varchar(8)} <br>
     * 処理日
     * @param dtExtdata1 The value of the column 'DT_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata1(String dtExtdata1) {
        registerModifiedProperty("dtExtdata1");
        _dtExtdata1 = dtExtdata1;
    }

    /**
     * [get] DT_EXTDATA2: {varchar(8)} <br>
     * 配達年月日
     * @return The value of the column 'DT_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata2() {
        checkSpecifiedProperty("dtExtdata2");
        return convertEmptyToNull(_dtExtdata2);
    }

    /**
     * [set] DT_EXTDATA2: {varchar(8)} <br>
     * 配達年月日
     * @param dtExtdata2 The value of the column 'DT_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata2(String dtExtdata2) {
        registerModifiedProperty("dtExtdata2");
        _dtExtdata2 = dtExtdata2;
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

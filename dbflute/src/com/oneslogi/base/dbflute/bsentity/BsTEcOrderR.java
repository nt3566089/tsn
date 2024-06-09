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
 * The entity of T_EC_ORDER_R as TABLE. <br>
 * EC受注帳票
 * <pre>
 * [primary-key]
 *     EC_ORDER_H_ID
 *
 * [column]
 *     EC_ORDER_H_ID, STATEMENT_OUT_FLG, STATEMENT_OUT_USER_ID, STATEMENT_OUT_DT, INVOICE_CREATE_FLG, INVOICE_CREATE_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EC_ORDER_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_EC_ORDER_H, B_USER, B_CLASS_DTL(ByInvoiceCreateFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tEcOrderH, bUser, bClassDtlByInvoiceCreateFlg, bClassDtlByStatementOutFlg
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long ecOrderHId = entity.getEcOrderHId();
 * String statementOutFlg = entity.getStatementOutFlg();
 * Long statementOutUserId = entity.getStatementOutUserId();
 * java.sql.Timestamp statementOutDt = entity.getStatementOutDt();
 * String invoiceCreateFlg = entity.getInvoiceCreateFlg();
 * java.sql.Timestamp invoiceCreateDt = entity.getInvoiceCreateDt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setEcOrderHId(ecOrderHId);
 * entity.setStatementOutFlg(statementOutFlg);
 * entity.setStatementOutUserId(statementOutUserId);
 * entity.setStatementOutDt(statementOutDt);
 * entity.setInvoiceCreateFlg(invoiceCreateFlg);
 * entity.setInvoiceCreateDt(invoiceCreateDt);
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
public abstract class BsTEcOrderR extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H} */
    protected Long _ecOrderHId;

    /** STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _statementOutFlg;

    /** STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    protected Long _statementOutUserId;

    /** STATEMENT_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _statementOutDt;

    /** INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} */
    protected String _invoiceCreateFlg;

    /** INVOICE_CREATE_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _invoiceCreateDt;

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
        return "T_EC_ORDER_R";
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
        if (_ecOrderHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of statementOutFlg as the classification of ListOutFlg. <br>
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getStatementOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getStatementOutFlg());
    }

    /**
     * Set the value of statementOutFlg as the classification of ListOutFlg. <br>
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStatementOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setStatementOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of invoiceCreateFlg as the classification of InvoiceCreateFlg. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InvoiceCreateFlg getInvoiceCreateFlgAsInvoiceCreateFlg() {
        return CDef.InvoiceCreateFlg.codeOf(getInvoiceCreateFlg());
    }

    /**
     * Set the value of invoiceCreateFlg as the classification of InvoiceCreateFlg. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInvoiceCreateFlgAsInvoiceCreateFlg(CDef.InvoiceCreateFlg cdef) {
        setInvoiceCreateFlg(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of statementOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setStatementOutFlg_$0() {
        setStatementOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of statementOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setStatementOutFlg_$1() {
        setStatementOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of invoiceCreateFlg as $0 (0). <br>
     * $0: 未出力
     */
    public void setInvoiceCreateFlg_$0() {
        setInvoiceCreateFlgAsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$0);
    }

    /**
     * Set the value of invoiceCreateFlg as $1 (1). <br>
     * $1: 出力済
     */
    public void setInvoiceCreateFlg_$1() {
        setInvoiceCreateFlgAsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$1);
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
     * Is the value of statementOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStatementOutFlg$0() {
        CDef.ListOutFlg cdef = getStatementOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of statementOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStatementOutFlg$1() {
        CDef.ListOutFlg cdef = getStatementOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of invoiceCreateFlg $0? <br>
     * $0: 未出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInvoiceCreateFlg$0() {
        CDef.InvoiceCreateFlg cdef = getInvoiceCreateFlgAsInvoiceCreateFlg();
        return cdef != null ? cdef.equals(CDef.InvoiceCreateFlg.$0) : false;
    }

    /**
     * Is the value of invoiceCreateFlg $1? <br>
     * $1: 出力済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInvoiceCreateFlg$1() {
        CDef.InvoiceCreateFlg cdef = getInvoiceCreateFlgAsInvoiceCreateFlg();
        return cdef != null ? cdef.equals(CDef.InvoiceCreateFlg.$1) : false;
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
     * Get the value of the column 'statementOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStatementOutFlgName() {
        CDef.ListOutFlg cdef = getStatementOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'invoiceCreateFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInvoiceCreateFlgName() {
        CDef.InvoiceCreateFlg cdef = getInvoiceCreateFlgAsInvoiceCreateFlg();
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
    /** T_EC_ORDER_H by my EC_ORDER_H_ID, named 'TEcOrderH'. */
    protected TEcOrderH _tEcOrderH;

    /**
     * [get] T_EC_ORDER_H by my EC_ORDER_H_ID, named 'TEcOrderH'. <br>
     * @return The entity of foreign property 'TEcOrderH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TEcOrderH getTEcOrderH() {
        return _tEcOrderH;
    }

    /**
     * [set] T_EC_ORDER_H by my EC_ORDER_H_ID, named 'TEcOrderH'.
     * @param tEcOrderH The entity of foreign property 'TEcOrderH'. (NullAllowed)
     */
    public void setTEcOrderH(TEcOrderH tEcOrderH) {
        _tEcOrderH = tEcOrderH;
    }

    /** B_USER by my STATEMENT_OUT_USER_ID, named 'BUser'. */
    protected BUser _bUser;

    /**
     * [get] B_USER by my STATEMENT_OUT_USER_ID, named 'BUser'. <br>
     * @return The entity of foreign property 'BUser'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUser() {
        return _bUser;
    }

    /**
     * [set] B_USER by my STATEMENT_OUT_USER_ID, named 'BUser'.
     * @param bUser The entity of foreign property 'BUser'. (NullAllowed)
     */
    public void setBUser(BUser bUser) {
        _bUser = bUser;
    }

    /** B_CLASS_DTL by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'. */
    protected BClassDtl _bClassDtlByInvoiceCreateFlg;

    /**
     * [get] B_CLASS_DTL by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByInvoiceCreateFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInvoiceCreateFlg() {
        return _bClassDtlByInvoiceCreateFlg;
    }

    /**
     * [set] B_CLASS_DTL by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'.
     * @param bClassDtlByInvoiceCreateFlg The entity of foreign property 'BClassDtlByInvoiceCreateFlg'. (NullAllowed)
     */
    public void setBClassDtlByInvoiceCreateFlg(BClassDtl bClassDtlByInvoiceCreateFlg) {
        _bClassDtlByInvoiceCreateFlg = bClassDtlByInvoiceCreateFlg;
    }

    /** B_CLASS_DTL by my STATEMENT_OUT_FLG, named 'BClassDtlByStatementOutFlg'. */
    protected BClassDtl _bClassDtlByStatementOutFlg;

    /**
     * [get] B_CLASS_DTL by my STATEMENT_OUT_FLG, named 'BClassDtlByStatementOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStatementOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStatementOutFlg() {
        return _bClassDtlByStatementOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my STATEMENT_OUT_FLG, named 'BClassDtlByStatementOutFlg'.
     * @param bClassDtlByStatementOutFlg The entity of foreign property 'BClassDtlByStatementOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByStatementOutFlg(BClassDtl bClassDtlByStatementOutFlg) {
        _bClassDtlByStatementOutFlg = bClassDtlByStatementOutFlg;
    }

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
        if (obj instanceof BsTEcOrderR) {
            BsTEcOrderR other = (BsTEcOrderR)obj;
            if (!xSV(_ecOrderHId, other._ecOrderHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _ecOrderHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tEcOrderH != null)
        { sb.append(li).append(xbRDS(_tEcOrderH, "tEcOrderH")); }
        if (_bUser != null)
        { sb.append(li).append(xbRDS(_bUser, "bUser")); }
        if (_bClassDtlByInvoiceCreateFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInvoiceCreateFlg, "bClassDtlByInvoiceCreateFlg")); }
        if (_bClassDtlByStatementOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStatementOutFlg, "bClassDtlByStatementOutFlg")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_ecOrderHId));
        sb.append(dm).append(xfND(_statementOutFlg));
        sb.append(dm).append(xfND(_statementOutUserId));
        sb.append(dm).append(xfND(_statementOutDt));
        sb.append(dm).append(xfND(_invoiceCreateFlg));
        sb.append(dm).append(xfND(_invoiceCreateDt));
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
        if (_tEcOrderH != null)
        { sb.append(dm).append("tEcOrderH"); }
        if (_bUser != null)
        { sb.append(dm).append("bUser"); }
        if (_bClassDtlByInvoiceCreateFlg != null)
        { sb.append(dm).append("bClassDtlByInvoiceCreateFlg"); }
        if (_bClassDtlByStatementOutFlg != null)
        { sb.append(dm).append("bClassDtlByStatementOutFlg"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TEcOrderR clone() {
        return (TEcOrderR)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H} <br>
     * EC受注ヘッダID
     * @return The value of the column 'EC_ORDER_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getEcOrderHId() {
        checkSpecifiedProperty("ecOrderHId");
        return _ecOrderHId;
    }

    /**
     * [set] EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H} <br>
     * EC受注ヘッダID
     * @param ecOrderHId The value of the column 'EC_ORDER_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setEcOrderHId(Long ecOrderHId) {
        registerModifiedProperty("ecOrderHId");
        _ecOrderHId = ecOrderHId;
    }

    /**
     * [get] STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 納品書出力フラグ
     * @return The value of the column 'STATEMENT_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStatementOutFlg() {
        checkSpecifiedProperty("statementOutFlg");
        return convertEmptyToNull(_statementOutFlg);
    }

    /**
     * [set] STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 納品書出力フラグ
     * @param statementOutFlg The value of the column 'STATEMENT_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatementOutFlg(String statementOutFlg) {
        registerModifiedProperty("statementOutFlg");
        _statementOutFlg = statementOutFlg;
    }

    /**
     * [get] STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 納品書出力者ID
     * @return The value of the column 'STATEMENT_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStatementOutUserId() {
        checkSpecifiedProperty("statementOutUserId");
        return _statementOutUserId;
    }

    /**
     * [set] STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 納品書出力者ID
     * @param statementOutUserId The value of the column 'STATEMENT_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatementOutUserId(Long statementOutUserId) {
        registerModifiedProperty("statementOutUserId");
        _statementOutUserId = statementOutUserId;
    }

    /**
     * [get] STATEMENT_OUT_DT: {datetime2(26, 6)} <br>
     * 納品書出力日時
     * @return The value of the column 'STATEMENT_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getStatementOutDt() {
        checkSpecifiedProperty("statementOutDt");
        return _statementOutDt;
    }

    /**
     * [set] STATEMENT_OUT_DT: {datetime2(26, 6)} <br>
     * 納品書出力日時
     * @param statementOutDt The value of the column 'STATEMENT_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatementOutDt(java.sql.Timestamp statementOutDt) {
        registerModifiedProperty("statementOutDt");
        _statementOutDt = statementOutDt;
    }

    /**
     * [get] INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ作成フラグ
     * @return The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceCreateFlg() {
        checkSpecifiedProperty("invoiceCreateFlg");
        return convertEmptyToNull(_invoiceCreateFlg);
    }

    /**
     * [set] INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ作成フラグ
     * @param invoiceCreateFlg The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceCreateFlg(String invoiceCreateFlg) {
        registerModifiedProperty("invoiceCreateFlg");
        _invoiceCreateFlg = invoiceCreateFlg;
    }

    /**
     * [get] INVOICE_CREATE_DT: {datetime2(26, 6)} <br>
     * 送り状データ作成日時
     * @return The value of the column 'INVOICE_CREATE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getInvoiceCreateDt() {
        checkSpecifiedProperty("invoiceCreateDt");
        return _invoiceCreateDt;
    }

    /**
     * [set] INVOICE_CREATE_DT: {datetime2(26, 6)} <br>
     * 送り状データ作成日時
     * @param invoiceCreateDt The value of the column 'INVOICE_CREATE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceCreateDt(java.sql.Timestamp invoiceCreateDt) {
        registerModifiedProperty("invoiceCreateDt");
        _invoiceCreateDt = invoiceCreateDt;
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

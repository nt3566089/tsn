package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_EC_ORDER_R as TABLE. <br>
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
 * [foreign-table]
 *     B_USER, T_EC_ORDER_H, B_CLASS_DTL(ByInvoiceCreateFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bUser, tEcOrderH, bClassDtlByInvoiceCreateFlg, bClassDtlByStatementOutFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTEcOrderRDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H} */
    @JsonKey
    protected Long _ecOrderHId;

    /** STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _statementOutFlg;

    /** STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    @JsonKey
    protected Long _statementOutUserId;

    /** STATEMENT_OUT_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _statementOutDt;

    /** INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} */
    @JsonKey
    protected String _invoiceCreateFlg;

    /** INVOICE_CREATE_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _invoiceCreateDt;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTEcOrderRDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected BUserDto _bUser;

    public BUserDto getBUser() {
        return _bUser;
    }

    public void setBUser(BUserDto bUser) {
        this._bUser = bUser;
    }

    protected TEcOrderHDto _tEcOrderH;

    public TEcOrderHDto getTEcOrderH() {
        return _tEcOrderH;
    }

    public void setTEcOrderH(TEcOrderHDto tEcOrderH) {
        this._tEcOrderH = tEcOrderH;
    }

    protected BClassDtlDto _bClassDtlByInvoiceCreateFlg;

    public BClassDtlDto getBClassDtlByInvoiceCreateFlg() {
        return _bClassDtlByInvoiceCreateFlg;
    }

    public void setBClassDtlByInvoiceCreateFlg(BClassDtlDto bClassDtlByInvoiceCreateFlg) {
        this._bClassDtlByInvoiceCreateFlg = bClassDtlByInvoiceCreateFlg;
    }

    protected BClassDtlDto _bClassDtlByStatementOutFlg;

    public BClassDtlDto getBClassDtlByStatementOutFlg() {
        return _bClassDtlByStatementOutFlg;
    }

    public void setBClassDtlByStatementOutFlg(BClassDtlDto bClassDtlByStatementOutFlg) {
        this._bClassDtlByStatementOutFlg = bClassDtlByStatementOutFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTEcOrderRDto)) { return false; }
        final BsTEcOrderRDto otherEntity = (BsTEcOrderRDto)other;
        if (!helpComparingValue(getEcOrderHId(), otherEntity.getEcOrderHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_EC_ORDER_R");
        result = xCH(result, getEcOrderHId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getEcOrderHId());
        sb.append(c).append(getStatementOutFlg());
        sb.append(c).append(getStatementOutUserId());
        sb.append(c).append(getStatementOutDt());
        sb.append(c).append(getInvoiceCreateFlg());
        sb.append(c).append(getInvoiceCreateDt());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H} <br>
     * EC受注ヘッダID
     * @return The value of the column 'EC_ORDER_H_ID'. (NullAllowed)
     */
    public Long getEcOrderHId() {
        return _ecOrderHId;
    }

    /**
     * [set] EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H} <br>
     * EC受注ヘッダID
     * @param ecOrderHId The value of the column 'EC_ORDER_H_ID'. (NullAllowed)
     */
    public void setEcOrderHId(Long ecOrderHId) {
        __modifiedProperties.add("ecOrderHId");
        this._ecOrderHId = ecOrderHId;
    }

    /**
     * [get] STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 納品書出力フラグ
     * @return The value of the column 'STATEMENT_OUT_FLG'. (NullAllowed)
     */
    public String getStatementOutFlg() {
        return _statementOutFlg;
    }

    /**
     * [set] STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 納品書出力フラグ
     * @param statementOutFlg The value of the column 'STATEMENT_OUT_FLG'. (NullAllowed)
     */
    public void setStatementOutFlg(String statementOutFlg) {
        __modifiedProperties.add("statementOutFlg");
        this._statementOutFlg = statementOutFlg;
    }

    /**
     * [get] STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 納品書出力者ID
     * @return The value of the column 'STATEMENT_OUT_USER_ID'. (NullAllowed)
     */
    public Long getStatementOutUserId() {
        return _statementOutUserId;
    }

    /**
     * [set] STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 納品書出力者ID
     * @param statementOutUserId The value of the column 'STATEMENT_OUT_USER_ID'. (NullAllowed)
     */
    public void setStatementOutUserId(Long statementOutUserId) {
        __modifiedProperties.add("statementOutUserId");
        this._statementOutUserId = statementOutUserId;
    }

    /**
     * [get] STATEMENT_OUT_DT: {datetime2(26, 6)} <br>
     * 納品書出力日時
     * @return The value of the column 'STATEMENT_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getStatementOutDt() {
        return _statementOutDt;
    }

    /**
     * [set] STATEMENT_OUT_DT: {datetime2(26, 6)} <br>
     * 納品書出力日時
     * @param statementOutDt The value of the column 'STATEMENT_OUT_DT'. (NullAllowed)
     */
    public void setStatementOutDt(java.sql.Timestamp statementOutDt) {
        __modifiedProperties.add("statementOutDt");
        this._statementOutDt = statementOutDt;
    }

    /**
     * [get] INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ作成フラグ
     * @return The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed)
     */
    public String getInvoiceCreateFlg() {
        return _invoiceCreateFlg;
    }

    /**
     * [set] INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ作成フラグ
     * @param invoiceCreateFlg The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed)
     */
    public void setInvoiceCreateFlg(String invoiceCreateFlg) {
        __modifiedProperties.add("invoiceCreateFlg");
        this._invoiceCreateFlg = invoiceCreateFlg;
    }

    /**
     * [get] INVOICE_CREATE_DT: {datetime2(26, 6)} <br>
     * 送り状データ作成日時
     * @return The value of the column 'INVOICE_CREATE_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getInvoiceCreateDt() {
        return _invoiceCreateDt;
    }

    /**
     * [set] INVOICE_CREATE_DT: {datetime2(26, 6)} <br>
     * 送り状データ作成日時
     * @param invoiceCreateDt The value of the column 'INVOICE_CREATE_DT'. (NullAllowed)
     */
    public void setInvoiceCreateDt(java.sql.Timestamp invoiceCreateDt) {
        __modifiedProperties.add("invoiceCreateDt");
        this._invoiceCreateDt = invoiceCreateDt;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}

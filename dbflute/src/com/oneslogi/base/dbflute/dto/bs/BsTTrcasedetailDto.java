package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRCASEDETAIL as TABLE. <br>
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
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrcasedetailDto implements Serializable {

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
    /** TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trcasedetailId;

    /** CASEDETAILNO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _casedetailno;

    /** TRSYMBOL_ID: {IX+, NotNull, bigint(19)} */
    @JsonKey
    protected Long _trsymbolId;

    /** CREATEDATETIME: {NotNull, datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _createdatetime;

    /** TRACETYPEDT: {IX+, NotNull, varchar(30)} */
    @JsonKey
    protected String _tracetypedt;

    /** OPERATIONNUM: {bigint(19)} */
    @JsonKey
    protected Long _operationnum;

    /** ASSORTINITNUM: {bigint(19)} */
    @JsonKey
    protected Long _assortinitnum;

    /** ASSORTNUM: {bigint(19)} */
    @JsonKey
    protected Long _assortnum;

    /** ASSORTEDCD: {varchar(30)} */
    @JsonKey
    protected String _assortedcd;

    /** ASSORTEDUNIT: {varchar(255)} */
    @JsonKey
    protected String _assortedunit;

    /** ASSORTEDINDEX: {bigint(19)} */
    @JsonKey
    protected Long _assortedindex;

    /** ASSORTDIFNUM: {bigint(19)} */
    @JsonKey
    protected Long _assortdifnum;

    /** DIRECTIONCD: {varchar(30)} */
    @JsonKey
    protected String _directioncd;

    /** PISTONTYPE: {char(1)} */
    @JsonKey
    protected String _pistontype;

    /** DIRECTIONNUM: {bigint(19)} */
    @JsonKey
    protected Long _directionnum;

    /** SHIPORDER: {bigint(19)} */
    @JsonKey
    protected Long _shiporder;

    /** CUSTOMERCD: {IX+, varchar(30)} */
    @JsonKey
    protected String _customercd;

    /** CASESERIAL: {varchar(30)} */
    @JsonKey
    protected String _caseserial;

    /** DISTWAREHOUSECD: {varchar(30)} */
    @JsonKey
    protected String _distwarehousecd;

    /** SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _sendsts;

    /** DT_EXTDATA1: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata1;

    /** DT_EXTDATA2: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata2;

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
    public BsTTrcasedetailDto() {
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
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrcasedetailDto)) { return false; }
        final BsTTrcasedetailDto otherEntity = (BsTTrcasedetailDto)other;
        if (!helpComparingValue(getTrcasedetailId(), otherEntity.getTrcasedetailId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRCASEDETAIL");
        result = xCH(result, getTrcasedetailId());
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
        sb.append(c).append(getTrcasedetailId());
        sb.append(c).append(getCasedetailno());
        sb.append(c).append(getTrsymbolId());
        sb.append(c).append(getCreatedatetime());
        sb.append(c).append(getTracetypedt());
        sb.append(c).append(getOperationnum());
        sb.append(c).append(getAssortinitnum());
        sb.append(c).append(getAssortnum());
        sb.append(c).append(getAssortedcd());
        sb.append(c).append(getAssortedunit());
        sb.append(c).append(getAssortedindex());
        sb.append(c).append(getAssortdifnum());
        sb.append(c).append(getDirectioncd());
        sb.append(c).append(getPistontype());
        sb.append(c).append(getDirectionnum());
        sb.append(c).append(getShiporder());
        sb.append(c).append(getCustomercd());
        sb.append(c).append(getCaseserial());
        sb.append(c).append(getDistwarehousecd());
        sb.append(c).append(getSendsts());
        sb.append(c).append(getDtExtdata1());
        sb.append(c).append(getDtExtdata2());
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
     * [get] TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)} <br>
     * ケース明細情報ID
     * @return The value of the column 'TRCASEDETAIL_ID'. (NullAllowed)
     */
    public Long getTrcasedetailId() {
        return _trcasedetailId;
    }

    /**
     * [set] TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)} <br>
     * ケース明細情報ID
     * @param trcasedetailId The value of the column 'TRCASEDETAIL_ID'. (NullAllowed)
     */
    public void setTrcasedetailId(Long trcasedetailId) {
        __modifiedProperties.add("trcasedetailId");
        this._trcasedetailId = trcasedetailId;
    }

    /**
     * [get] CASEDETAILNO: {NotNull, bigint(19)} <br>
     * ケース明細番号
     * @return The value of the column 'CASEDETAILNO'. (NullAllowed)
     */
    public Long getCasedetailno() {
        return _casedetailno;
    }

    /**
     * [set] CASEDETAILNO: {NotNull, bigint(19)} <br>
     * ケース明細番号
     * @param casedetailno The value of the column 'CASEDETAILNO'. (NullAllowed)
     */
    public void setCasedetailno(Long casedetailno) {
        __modifiedProperties.add("casedetailno");
        this._casedetailno = casedetailno;
    }

    /**
     * [get] TRSYMBOL_ID: {IX+, NotNull, bigint(19)} <br>
     * 段ボール情報ID
     * @return The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public Long getTrsymbolId() {
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {IX+, NotNull, bigint(19)} <br>
     * 段ボール情報ID
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public void setTrsymbolId(Long trsymbolId) {
        __modifiedProperties.add("trsymbolId");
        this._trsymbolId = trsymbolId;
    }

    /**
     * [get] CREATEDATETIME: {NotNull, datetime2(26, 6)} <br>
     * 作成日時
     * @return The value of the column 'CREATEDATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getCreatedatetime() {
        return _createdatetime;
    }

    /**
     * [set] CREATEDATETIME: {NotNull, datetime2(26, 6)} <br>
     * 作成日時
     * @param createdatetime The value of the column 'CREATEDATETIME'. (NullAllowed)
     */
    public void setCreatedatetime(java.sql.Timestamp createdatetime) {
        __modifiedProperties.add("createdatetime");
        this._createdatetime = createdatetime;
    }

    /**
     * [get] TRACETYPEDT: {IX+, NotNull, varchar(30)} <br>
     * 追跡区分詳細
     * @return The value of the column 'TRACETYPEDT'. (NullAllowed)
     */
    public String getTracetypedt() {
        return _tracetypedt;
    }

    /**
     * [set] TRACETYPEDT: {IX+, NotNull, varchar(30)} <br>
     * 追跡区分詳細
     * @param tracetypedt The value of the column 'TRACETYPEDT'. (NullAllowed)
     */
    public void setTracetypedt(String tracetypedt) {
        __modifiedProperties.add("tracetypedt");
        this._tracetypedt = tracetypedt;
    }

    /**
     * [get] OPERATIONNUM: {bigint(19)} <br>
     * 操作数量
     * @return The value of the column 'OPERATIONNUM'. (NullAllowed)
     */
    public Long getOperationnum() {
        return _operationnum;
    }

    /**
     * [set] OPERATIONNUM: {bigint(19)} <br>
     * 操作数量
     * @param operationnum The value of the column 'OPERATIONNUM'. (NullAllowed)
     */
    public void setOperationnum(Long operationnum) {
        __modifiedProperties.add("operationnum");
        this._operationnum = operationnum;
    }

    /**
     * [get] ASSORTINITNUM: {bigint(19)} <br>
     * 仕分時数量
     * @return The value of the column 'ASSORTINITNUM'. (NullAllowed)
     */
    public Long getAssortinitnum() {
        return _assortinitnum;
    }

    /**
     * [set] ASSORTINITNUM: {bigint(19)} <br>
     * 仕分時数量
     * @param assortinitnum The value of the column 'ASSORTINITNUM'. (NullAllowed)
     */
    public void setAssortinitnum(Long assortinitnum) {
        __modifiedProperties.add("assortinitnum");
        this._assortinitnum = assortinitnum;
    }

    /**
     * [get] ASSORTNUM: {bigint(19)} <br>
     * 仕分数量
     * @return The value of the column 'ASSORTNUM'. (NullAllowed)
     */
    public Long getAssortnum() {
        return _assortnum;
    }

    /**
     * [set] ASSORTNUM: {bigint(19)} <br>
     * 仕分数量
     * @param assortnum The value of the column 'ASSORTNUM'. (NullAllowed)
     */
    public void setAssortnum(Long assortnum) {
        __modifiedProperties.add("assortnum");
        this._assortnum = assortnum;
    }

    /**
     * [get] ASSORTEDCD: {varchar(30)} <br>
     * 仕分場所
     * @return The value of the column 'ASSORTEDCD'. (NullAllowed)
     */
    public String getAssortedcd() {
        return _assortedcd;
    }

    /**
     * [set] ASSORTEDCD: {varchar(30)} <br>
     * 仕分場所
     * @param assortedcd The value of the column 'ASSORTEDCD'. (NullAllowed)
     */
    public void setAssortedcd(String assortedcd) {
        __modifiedProperties.add("assortedcd");
        this._assortedcd = assortedcd;
    }

    /**
     * [get] ASSORTEDUNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'ASSORTEDUNIT'. (NullAllowed)
     */
    public String getAssortedunit() {
        return _assortedunit;
    }

    /**
     * [set] ASSORTEDUNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @param assortedunit The value of the column 'ASSORTEDUNIT'. (NullAllowed)
     */
    public void setAssortedunit(String assortedunit) {
        __modifiedProperties.add("assortedunit");
        this._assortedunit = assortedunit;
    }

    /**
     * [get] ASSORTEDINDEX: {bigint(19)} <br>
     * 仕分ロケ投入順
     * @return The value of the column 'ASSORTEDINDEX'. (NullAllowed)
     */
    public Long getAssortedindex() {
        return _assortedindex;
    }

    /**
     * [set] ASSORTEDINDEX: {bigint(19)} <br>
     * 仕分ロケ投入順
     * @param assortedindex The value of the column 'ASSORTEDINDEX'. (NullAllowed)
     */
    public void setAssortedindex(Long assortedindex) {
        __modifiedProperties.add("assortedindex");
        this._assortedindex = assortedindex;
    }

    /**
     * [get] ASSORTDIFNUM: {bigint(19)} <br>
     * 差異不良数量
     * @return The value of the column 'ASSORTDIFNUM'. (NullAllowed)
     */
    public Long getAssortdifnum() {
        return _assortdifnum;
    }

    /**
     * [set] ASSORTDIFNUM: {bigint(19)} <br>
     * 差異不良数量
     * @param assortdifnum The value of the column 'ASSORTDIFNUM'. (NullAllowed)
     */
    public void setAssortdifnum(Long assortdifnum) {
        __modifiedProperties.add("assortdifnum");
        this._assortdifnum = assortdifnum;
    }

    /**
     * [get] DIRECTIONCD: {varchar(30)} <br>
     * 方面CD
     * @return The value of the column 'DIRECTIONCD'. (NullAllowed)
     */
    public String getDirectioncd() {
        return _directioncd;
    }

    /**
     * [set] DIRECTIONCD: {varchar(30)} <br>
     * 方面CD
     * @param directioncd The value of the column 'DIRECTIONCD'. (NullAllowed)
     */
    public void setDirectioncd(String directioncd) {
        __modifiedProperties.add("directioncd");
        this._directioncd = directioncd;
    }

    /**
     * [get] PISTONTYPE: {char(1)} <br>
     * ピストン区分
     * @return The value of the column 'PISTONTYPE'. (NullAllowed)
     */
    public String getPistontype() {
        return _pistontype;
    }

    /**
     * [set] PISTONTYPE: {char(1)} <br>
     * ピストン区分
     * @param pistontype The value of the column 'PISTONTYPE'. (NullAllowed)
     */
    public void setPistontype(String pistontype) {
        __modifiedProperties.add("pistontype");
        this._pistontype = pistontype;
    }

    /**
     * [get] DIRECTIONNUM: {bigint(19)} <br>
     * さしず数量
     * @return The value of the column 'DIRECTIONNUM'. (NullAllowed)
     */
    public Long getDirectionnum() {
        return _directionnum;
    }

    /**
     * [set] DIRECTIONNUM: {bigint(19)} <br>
     * さしず数量
     * @param directionnum The value of the column 'DIRECTIONNUM'. (NullAllowed)
     */
    public void setDirectionnum(Long directionnum) {
        __modifiedProperties.add("directionnum");
        this._directionnum = directionnum;
    }

    /**
     * [get] SHIPORDER: {bigint(19)} <br>
     * 出庫順
     * @return The value of the column 'SHIPORDER'. (NullAllowed)
     */
    public Long getShiporder() {
        return _shiporder;
    }

    /**
     * [set] SHIPORDER: {bigint(19)} <br>
     * 出庫順
     * @param shiporder The value of the column 'SHIPORDER'. (NullAllowed)
     */
    public void setShiporder(Long shiporder) {
        __modifiedProperties.add("shiporder");
        this._shiporder = shiporder;
    }

    /**
     * [get] CUSTOMERCD: {IX+, varchar(30)} <br>
     * お得意様CD
     * @return The value of the column 'CUSTOMERCD'. (NullAllowed)
     */
    public String getCustomercd() {
        return _customercd;
    }

    /**
     * [set] CUSTOMERCD: {IX+, varchar(30)} <br>
     * お得意様CD
     * @param customercd The value of the column 'CUSTOMERCD'. (NullAllowed)
     */
    public void setCustomercd(String customercd) {
        __modifiedProperties.add("customercd");
        this._customercd = customercd;
    }

    /**
     * [get] CASESERIAL: {varchar(30)} <br>
     * 箱№（通番）
     * @return The value of the column 'CASESERIAL'. (NullAllowed)
     */
    public String getCaseserial() {
        return _caseserial;
    }

    /**
     * [set] CASESERIAL: {varchar(30)} <br>
     * 箱№（通番）
     * @param caseserial The value of the column 'CASESERIAL'. (NullAllowed)
     */
    public void setCaseserial(String caseserial) {
        __modifiedProperties.add("caseserial");
        this._caseserial = caseserial;
    }

    /**
     * [get] DISTWAREHOUSECD: {varchar(30)} <br>
     * 融通先CD
     * @return The value of the column 'DISTWAREHOUSECD'. (NullAllowed)
     */
    public String getDistwarehousecd() {
        return _distwarehousecd;
    }

    /**
     * [set] DISTWAREHOUSECD: {varchar(30)} <br>
     * 融通先CD
     * @param distwarehousecd The value of the column 'DISTWAREHOUSECD'. (NullAllowed)
     */
    public void setDistwarehousecd(String distwarehousecd) {
        __modifiedProperties.add("distwarehousecd");
        this._distwarehousecd = distwarehousecd;
    }

    /**
     * [get] SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]} <br>
     * 送信状態
     * @return The value of the column 'SENDSTS'. (NullAllowed)
     */
    public java.math.BigDecimal getSendsts() {
        return _sendsts;
    }

    /**
     * [set] SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]} <br>
     * 送信状態
     * @param sendsts The value of the column 'SENDSTS'. (NullAllowed)
     */
    public void setSendsts(java.math.BigDecimal sendsts) {
        __modifiedProperties.add("sendsts");
        this._sendsts = sendsts;
    }

    /**
     * [get] DT_EXTDATA1: {varchar(8)} <br>
     * 処理日
     * @return The value of the column 'DT_EXTDATA1'. (NullAllowed)
     */
    public String getDtExtdata1() {
        return _dtExtdata1;
    }

    /**
     * [set] DT_EXTDATA1: {varchar(8)} <br>
     * 処理日
     * @param dtExtdata1 The value of the column 'DT_EXTDATA1'. (NullAllowed)
     */
    public void setDtExtdata1(String dtExtdata1) {
        __modifiedProperties.add("dtExtdata1");
        this._dtExtdata1 = dtExtdata1;
    }

    /**
     * [get] DT_EXTDATA2: {varchar(8)} <br>
     * 配達年月日
     * @return The value of the column 'DT_EXTDATA2'. (NullAllowed)
     */
    public String getDtExtdata2() {
        return _dtExtdata2;
    }

    /**
     * [set] DT_EXTDATA2: {varchar(8)} <br>
     * 配達年月日
     * @param dtExtdata2 The value of the column 'DT_EXTDATA2'. (NullAllowed)
     */
    public void setDtExtdata2(String dtExtdata2) {
        __modifiedProperties.add("dtExtdata2");
        this._dtExtdata2 = dtExtdata2;
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

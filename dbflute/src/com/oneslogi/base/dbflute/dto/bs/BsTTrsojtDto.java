package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRSOJT as TABLE. <br>
 * 出庫指図
 * <pre>
 * [primary-key]
 *     SOJTID
 *
 * [column]
 *     SOJTID, SOJTKEY, OWNERSONO, CUSTOMER_CD, ORDERDATE, PLANSEQ, PLANRCVDATETIME, BEFOREPLANSEQ, PLANRCVFLG, HTOPEFLG, TRSOADDDATE, TRSOADDFLG, SOID, PLANNAME, PLANPOST, PLANADDRESS, PLANWAREHOUSENAME, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOJTID
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
public abstract class BsTTrsojtDto implements Serializable {

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
    /** SOJTID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _sojtid;

    /** SOJTKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sojtkey;

    /** OWNERSONO: {varchar(60)} */
    @JsonKey
    protected String _ownersono;

    /** CUSTOMER_CD: {varchar(60)} */
    @JsonKey
    protected String _customerCd;

    /** ORDERDATE: {varchar(8)} */
    @JsonKey
    protected String _orderdate;

    /** PLANSEQ: {bigint(19)} */
    @JsonKey
    protected Long _planseq;

    /** PLANRCVDATETIME: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _planrcvdatetime;

    /** BEFOREPLANSEQ: {bigint(19)} */
    @JsonKey
    protected Long _beforeplanseq;

    /** PLANRCVFLG: {char(1)} */
    @JsonKey
    protected String _planrcvflg;

    /** HTOPEFLG: {char(1)} */
    @JsonKey
    protected String _htopeflg;

    /** TRSOADDDATE: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _trsoadddate;

    /** TRSOADDFLG: {char(1)} */
    @JsonKey
    protected String _trsoaddflg;

    /** SOID: {bigint(19)} */
    @JsonKey
    protected Long _soid;

    /** PLANNAME: {varchar(60)} */
    @JsonKey
    protected String _planname;

    /** PLANPOST: {varchar(30)} */
    @JsonKey
    protected String _planpost;

    /** PLANADDRESS: {varchar(100)} */
    @JsonKey
    protected String _planaddress;

    /** PLANWAREHOUSENAME: {varchar(60)} */
    @JsonKey
    protected String _planwarehousename;

    /** CENTER_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _clientId;

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
    public BsTTrsojtDto() {
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
        if (other == null || !(other instanceof BsTTrsojtDto)) { return false; }
        final BsTTrsojtDto otherEntity = (BsTTrsojtDto)other;
        if (!helpComparingValue(getSojtid(), otherEntity.getSojtid())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRSOJT");
        result = xCH(result, getSojtid());
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
        sb.append(c).append(getSojtid());
        sb.append(c).append(getSojtkey());
        sb.append(c).append(getOwnersono());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getOrderdate());
        sb.append(c).append(getPlanseq());
        sb.append(c).append(getPlanrcvdatetime());
        sb.append(c).append(getBeforeplanseq());
        sb.append(c).append(getPlanrcvflg());
        sb.append(c).append(getHtopeflg());
        sb.append(c).append(getTrsoadddate());
        sb.append(c).append(getTrsoaddflg());
        sb.append(c).append(getSoid());
        sb.append(c).append(getPlanname());
        sb.append(c).append(getPlanpost());
        sb.append(c).append(getPlanaddress());
        sb.append(c).append(getPlanwarehousename());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
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
     * [get] SOJTID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫指図ID
     * @return The value of the column 'SOJTID'. (NullAllowed)
     */
    public Long getSojtid() {
        return _sojtid;
    }

    /**
     * [set] SOJTID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫指図ID
     * @param sojtid The value of the column 'SOJTID'. (NullAllowed)
     */
    public void setSojtid(Long sojtid) {
        __modifiedProperties.add("sojtid");
        this._sojtid = sojtid;
    }

    /**
     * [get] SOJTKEY: {NotNull, decimal(16, 6)} <br>
     * 出庫指図Ｋｅｙ
     * @return The value of the column 'SOJTKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getSojtkey() {
        return _sojtkey;
    }

    /**
     * [set] SOJTKEY: {NotNull, decimal(16, 6)} <br>
     * 出庫指図Ｋｅｙ
     * @param sojtkey The value of the column 'SOJTKEY'. (NullAllowed)
     */
    public void setSojtkey(java.math.BigDecimal sojtkey) {
        __modifiedProperties.add("sojtkey");
        this._sojtkey = sojtkey;
    }

    /**
     * [get] OWNERSONO: {varchar(60)} <br>
     * 整理番号
     * @return The value of the column 'OWNERSONO'. (NullAllowed)
     */
    public String getOwnersono() {
        return _ownersono;
    }

    /**
     * [set] OWNERSONO: {varchar(60)} <br>
     * 整理番号
     * @param ownersono The value of the column 'OWNERSONO'. (NullAllowed)
     */
    public void setOwnersono(String ownersono) {
        __modifiedProperties.add("ownersono");
        this._ownersono = ownersono;
    }

    /**
     * [get] CUSTOMER_CD: {varchar(60)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {varchar(60)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] ORDERDATE: {varchar(8)} <br>
     * 指図日
     * @return The value of the column 'ORDERDATE'. (NullAllowed)
     */
    public String getOrderdate() {
        return _orderdate;
    }

    /**
     * [set] ORDERDATE: {varchar(8)} <br>
     * 指図日
     * @param orderdate The value of the column 'ORDERDATE'. (NullAllowed)
     */
    public void setOrderdate(String orderdate) {
        __modifiedProperties.add("orderdate");
        this._orderdate = orderdate;
    }

    /**
     * [get] PLANSEQ: {bigint(19)} <br>
     * 計画受信回数
     * @return The value of the column 'PLANSEQ'. (NullAllowed)
     */
    public Long getPlanseq() {
        return _planseq;
    }

    /**
     * [set] PLANSEQ: {bigint(19)} <br>
     * 計画受信回数
     * @param planseq The value of the column 'PLANSEQ'. (NullAllowed)
     */
    public void setPlanseq(Long planseq) {
        __modifiedProperties.add("planseq");
        this._planseq = planseq;
    }

    /**
     * [get] PLANRCVDATETIME: {datetime2(26, 6)} <br>
     * 計画受信日時
     * @return The value of the column 'PLANRCVDATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPlanrcvdatetime() {
        return _planrcvdatetime;
    }

    /**
     * [set] PLANRCVDATETIME: {datetime2(26, 6)} <br>
     * 計画受信日時
     * @param planrcvdatetime The value of the column 'PLANRCVDATETIME'. (NullAllowed)
     */
    public void setPlanrcvdatetime(java.sql.Timestamp planrcvdatetime) {
        __modifiedProperties.add("planrcvdatetime");
        this._planrcvdatetime = planrcvdatetime;
    }

    /**
     * [get] BEFOREPLANSEQ: {bigint(19)} <br>
     * 前回計画受信回数
     * @return The value of the column 'BEFOREPLANSEQ'. (NullAllowed)
     */
    public Long getBeforeplanseq() {
        return _beforeplanseq;
    }

    /**
     * [set] BEFOREPLANSEQ: {bigint(19)} <br>
     * 前回計画受信回数
     * @param beforeplanseq The value of the column 'BEFOREPLANSEQ'. (NullAllowed)
     */
    public void setBeforeplanseq(Long beforeplanseq) {
        __modifiedProperties.add("beforeplanseq");
        this._beforeplanseq = beforeplanseq;
    }

    /**
     * [get] PLANRCVFLG: {char(1)} <br>
     * 計画受信フラグ
     * @return The value of the column 'PLANRCVFLG'. (NullAllowed)
     */
    public String getPlanrcvflg() {
        return _planrcvflg;
    }

    /**
     * [set] PLANRCVFLG: {char(1)} <br>
     * 計画受信フラグ
     * @param planrcvflg The value of the column 'PLANRCVFLG'. (NullAllowed)
     */
    public void setPlanrcvflg(String planrcvflg) {
        __modifiedProperties.add("planrcvflg");
        this._planrcvflg = planrcvflg;
    }

    /**
     * [get] HTOPEFLG: {char(1)} <br>
     * HT操作フラグ
     * @return The value of the column 'HTOPEFLG'. (NullAllowed)
     */
    public String getHtopeflg() {
        return _htopeflg;
    }

    /**
     * [set] HTOPEFLG: {char(1)} <br>
     * HT操作フラグ
     * @param htopeflg The value of the column 'HTOPEFLG'. (NullAllowed)
     */
    public void setHtopeflg(String htopeflg) {
        __modifiedProperties.add("htopeflg");
        this._htopeflg = htopeflg;
    }

    /**
     * [get] TRSOADDDATE: {datetime2(26, 6)} <br>
     * 出庫予定作成日
     * @return The value of the column 'TRSOADDDATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getTrsoadddate() {
        return _trsoadddate;
    }

    /**
     * [set] TRSOADDDATE: {datetime2(26, 6)} <br>
     * 出庫予定作成日
     * @param trsoadddate The value of the column 'TRSOADDDATE'. (NullAllowed)
     */
    public void setTrsoadddate(java.sql.Timestamp trsoadddate) {
        __modifiedProperties.add("trsoadddate");
        this._trsoadddate = trsoadddate;
    }

    /**
     * [get] TRSOADDFLG: {char(1)} <br>
     * 出庫予定作成フラグ
     * @return The value of the column 'TRSOADDFLG'. (NullAllowed)
     */
    public String getTrsoaddflg() {
        return _trsoaddflg;
    }

    /**
     * [set] TRSOADDFLG: {char(1)} <br>
     * 出庫予定作成フラグ
     * @param trsoaddflg The value of the column 'TRSOADDFLG'. (NullAllowed)
     */
    public void setTrsoaddflg(String trsoaddflg) {
        __modifiedProperties.add("trsoaddflg");
        this._trsoaddflg = trsoaddflg;
    }

    /**
     * [get] SOID: {bigint(19)} <br>
     * 出庫予定ID
     * @return The value of the column 'SOID'. (NullAllowed)
     */
    public Long getSoid() {
        return _soid;
    }

    /**
     * [set] SOID: {bigint(19)} <br>
     * 出庫予定ID
     * @param soid The value of the column 'SOID'. (NullAllowed)
     */
    public void setSoid(Long soid) {
        __modifiedProperties.add("soid");
        this._soid = soid;
    }

    /**
     * [get] PLANNAME: {varchar(60)} <br>
     * 特約店名称
     * @return The value of the column 'PLANNAME'. (NullAllowed)
     */
    public String getPlanname() {
        return _planname;
    }

    /**
     * [set] PLANNAME: {varchar(60)} <br>
     * 特約店名称
     * @param planname The value of the column 'PLANNAME'. (NullAllowed)
     */
    public void setPlanname(String planname) {
        __modifiedProperties.add("planname");
        this._planname = planname;
    }

    /**
     * [get] PLANPOST: {varchar(30)} <br>
     * 郵便番号
     * @return The value of the column 'PLANPOST'. (NullAllowed)
     */
    public String getPlanpost() {
        return _planpost;
    }

    /**
     * [set] PLANPOST: {varchar(30)} <br>
     * 郵便番号
     * @param planpost The value of the column 'PLANPOST'. (NullAllowed)
     */
    public void setPlanpost(String planpost) {
        __modifiedProperties.add("planpost");
        this._planpost = planpost;
    }

    /**
     * [get] PLANADDRESS: {varchar(100)} <br>
     * 住所
     * @return The value of the column 'PLANADDRESS'. (NullAllowed)
     */
    public String getPlanaddress() {
        return _planaddress;
    }

    /**
     * [set] PLANADDRESS: {varchar(100)} <br>
     * 住所
     * @param planaddress The value of the column 'PLANADDRESS'. (NullAllowed)
     */
    public void setPlanaddress(String planaddress) {
        __modifiedProperties.add("planaddress");
        this._planaddress = planaddress;
    }

    /**
     * [get] PLANWAREHOUSENAME: {varchar(60)} <br>
     * 倉庫名
     * @return The value of the column 'PLANWAREHOUSENAME'. (NullAllowed)
     */
    public String getPlanwarehousename() {
        return _planwarehousename;
    }

    /**
     * [set] PLANWAREHOUSENAME: {varchar(60)} <br>
     * 倉庫名
     * @param planwarehousename The value of the column 'PLANWAREHOUSENAME'. (NullAllowed)
     */
    public void setPlanwarehousename(String planwarehousename) {
        __modifiedProperties.add("planwarehousename");
        this._planwarehousename = planwarehousename;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
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

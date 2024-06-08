package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TREXAMRSLTDETAIL as TABLE. <br>
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
public abstract class BsTTrexamrsltdetailDto implements Serializable {

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
    /** TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trexamrsltdetailId;

    /** TREXAMRESULT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _trexamresultId;

    /** EXAMLINENO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _examlineno;

    /** ZAIKOINV_ID: {bigint(19)} */
    @JsonKey
    protected Long _zaikoinvId;

    /** ZAIKOINV: {varchar(30)} */
    @JsonKey
    protected String _zaikoinv;

    /** EXAMQTY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _examqty;

    /** RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _res40qty1;

    /** RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _res40qty2;

    /** INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _inferiorqty;

    /** AFTZAIKOINV_ID: {bigint(19)} */
    @JsonKey
    protected Long _aftzaikoinvId;

    /** AFTZAIKOINV: {NotNull, varchar(30)} */
    @JsonKey
    protected String _aftzaikoinv;

    /** RESERVATIONFLG: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _reservationflg;

    /** EXAMDETAILSTS: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _examdetailsts;

    /** EXAMDATE: {varchar(8)} */
    @JsonKey
    protected String _examdate;

    /** NOTEXAMQTY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _notexamqty;

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
    public BsTTrexamrsltdetailDto() {
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
        if (other == null || !(other instanceof BsTTrexamrsltdetailDto)) { return false; }
        final BsTTrexamrsltdetailDto otherEntity = (BsTTrexamrsltdetailDto)other;
        if (!helpComparingValue(getTrexamrsltdetailId(), otherEntity.getTrexamrsltdetailId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TREXAMRSLTDETAIL");
        result = xCH(result, getTrexamrsltdetailId());
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
        sb.append(c).append(getTrexamrsltdetailId());
        sb.append(c).append(getTrexamresultId());
        sb.append(c).append(getExamlineno());
        sb.append(c).append(getZaikoinvId());
        sb.append(c).append(getZaikoinv());
        sb.append(c).append(getExamqty());
        sb.append(c).append(getRes40qty1());
        sb.append(c).append(getRes40qty2());
        sb.append(c).append(getInferiorqty());
        sb.append(c).append(getAftzaikoinvId());
        sb.append(c).append(getAftzaikoinv());
        sb.append(c).append(getReservationflg());
        sb.append(c).append(getExamdetailsts());
        sb.append(c).append(getExamdate());
        sb.append(c).append(getNotexamqty());
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
     * [get] TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 検査実績明細ID
     * @return The value of the column 'TREXAMRSLTDETAIL_ID'. (NullAllowed)
     */
    public Long getTrexamrsltdetailId() {
        return _trexamrsltdetailId;
    }

    /**
     * [set] TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 検査実績明細ID
     * @param trexamrsltdetailId The value of the column 'TREXAMRSLTDETAIL_ID'. (NullAllowed)
     */
    public void setTrexamrsltdetailId(Long trexamrsltdetailId) {
        __modifiedProperties.add("trexamrsltdetailId");
        this._trexamrsltdetailId = trexamrsltdetailId;
    }

    /**
     * [get] TREXAMRESULT_ID: {NotNull, bigint(19)} <br>
     * 検査実績ID
     * @return The value of the column 'TREXAMRESULT_ID'. (NullAllowed)
     */
    public Long getTrexamresultId() {
        return _trexamresultId;
    }

    /**
     * [set] TREXAMRESULT_ID: {NotNull, bigint(19)} <br>
     * 検査実績ID
     * @param trexamresultId The value of the column 'TREXAMRESULT_ID'. (NullAllowed)
     */
    public void setTrexamresultId(Long trexamresultId) {
        __modifiedProperties.add("trexamresultId");
        this._trexamresultId = trexamresultId;
    }

    /**
     * [get] EXAMLINENO: {NotNull, bigint(19)} <br>
     * 検査行No.
     * @return The value of the column 'EXAMLINENO'. (NullAllowed)
     */
    public Long getExamlineno() {
        return _examlineno;
    }

    /**
     * [set] EXAMLINENO: {NotNull, bigint(19)} <br>
     * 検査行No.
     * @param examlineno The value of the column 'EXAMLINENO'. (NullAllowed)
     */
    public void setExamlineno(Long examlineno) {
        __modifiedProperties.add("examlineno");
        this._examlineno = examlineno;
    }

    /**
     * [get] ZAIKOINV_ID: {bigint(19)} <br>
     * 検査前在庫区分ID
     * @return The value of the column 'ZAIKOINV_ID'. (NullAllowed)
     */
    public Long getZaikoinvId() {
        return _zaikoinvId;
    }

    /**
     * [set] ZAIKOINV_ID: {bigint(19)} <br>
     * 検査前在庫区分ID
     * @param zaikoinvId The value of the column 'ZAIKOINV_ID'. (NullAllowed)
     */
    public void setZaikoinvId(Long zaikoinvId) {
        __modifiedProperties.add("zaikoinvId");
        this._zaikoinvId = zaikoinvId;
    }

    /**
     * [get] ZAIKOINV: {varchar(30)} <br>
     * 検査前在庫区分
     * @return The value of the column 'ZAIKOINV'. (NullAllowed)
     */
    public String getZaikoinv() {
        return _zaikoinv;
    }

    /**
     * [set] ZAIKOINV: {varchar(30)} <br>
     * 検査前在庫区分
     * @param zaikoinv The value of the column 'ZAIKOINV'. (NullAllowed)
     */
    public void setZaikoinv(String zaikoinv) {
        __modifiedProperties.add("zaikoinv");
        this._zaikoinv = zaikoinv;
    }

    /**
     * [get] EXAMQTY: {NotNull, decimal(16, 6)} <br>
     * 検査予定数量（個装）
     * @return The value of the column 'EXAMQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getExamqty() {
        return _examqty;
    }

    /**
     * [set] EXAMQTY: {NotNull, decimal(16, 6)} <br>
     * 検査予定数量（個装）
     * @param examqty The value of the column 'EXAMQTY'. (NullAllowed)
     */
    public void setExamqty(java.math.BigDecimal examqty) {
        __modifiedProperties.add("examqty");
        this._examqty = examqty;
    }

    /**
     * [get] RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * ｶｰﾄﾝ検査済正常数量（個装）
     * @return The value of the column 'RES40QTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getRes40qty1() {
        return _res40qty1;
    }

    /**
     * [set] RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * ｶｰﾄﾝ検査済正常数量（個装）
     * @param res40qty1 The value of the column 'RES40QTY1'. (NullAllowed)
     */
    public void setRes40qty1(java.math.BigDecimal res40qty1) {
        __modifiedProperties.add("res40qty1");
        this._res40qty1 = res40qty1;
    }

    /**
     * [get] RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * ﾊﾟｯｸ検査済正常数量（個装）
     * @return The value of the column 'RES40QTY2'. (NullAllowed)
     */
    public java.math.BigDecimal getRes40qty2() {
        return _res40qty2;
    }

    /**
     * [set] RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * ﾊﾟｯｸ検査済正常数量（個装）
     * @param res40qty2 The value of the column 'RES40QTY2'. (NullAllowed)
     */
    public void setRes40qty2(java.math.BigDecimal res40qty2) {
        __modifiedProperties.add("res40qty2");
        this._res40qty2 = res40qty2;
    }

    /**
     * [get] INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 不良数量(個装）
     * @return The value of the column 'INFERIORQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getInferiorqty() {
        return _inferiorqty;
    }

    /**
     * [set] INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 不良数量(個装）
     * @param inferiorqty The value of the column 'INFERIORQTY'. (NullAllowed)
     */
    public void setInferiorqty(java.math.BigDecimal inferiorqty) {
        __modifiedProperties.add("inferiorqty");
        this._inferiorqty = inferiorqty;
    }

    /**
     * [get] AFTZAIKOINV_ID: {bigint(19)} <br>
     * 検査後在庫区分ID
     * @return The value of the column 'AFTZAIKOINV_ID'. (NullAllowed)
     */
    public Long getAftzaikoinvId() {
        return _aftzaikoinvId;
    }

    /**
     * [set] AFTZAIKOINV_ID: {bigint(19)} <br>
     * 検査後在庫区分ID
     * @param aftzaikoinvId The value of the column 'AFTZAIKOINV_ID'. (NullAllowed)
     */
    public void setAftzaikoinvId(Long aftzaikoinvId) {
        __modifiedProperties.add("aftzaikoinvId");
        this._aftzaikoinvId = aftzaikoinvId;
    }

    /**
     * [get] AFTZAIKOINV: {NotNull, varchar(30)} <br>
     * 検査後在庫区分
     * @return The value of the column 'AFTZAIKOINV'. (NullAllowed)
     */
    public String getAftzaikoinv() {
        return _aftzaikoinv;
    }

    /**
     * [set] AFTZAIKOINV: {NotNull, varchar(30)} <br>
     * 検査後在庫区分
     * @param aftzaikoinv The value of the column 'AFTZAIKOINV'. (NullAllowed)
     */
    public void setAftzaikoinv(String aftzaikoinv) {
        __modifiedProperties.add("aftzaikoinv");
        this._aftzaikoinv = aftzaikoinv;
    }

    /**
     * [get] RESERVATIONFLG: {NotNull, char(1), default=[(0)]} <br>
     * 保留フラグ
     * @return The value of the column 'RESERVATIONFLG'. (NullAllowed)
     */
    public String getReservationflg() {
        return _reservationflg;
    }

    /**
     * [set] RESERVATIONFLG: {NotNull, char(1), default=[(0)]} <br>
     * 保留フラグ
     * @param reservationflg The value of the column 'RESERVATIONFLG'. (NullAllowed)
     */
    public void setReservationflg(String reservationflg) {
        __modifiedProperties.add("reservationflg");
        this._reservationflg = reservationflg;
    }

    /**
     * [get] EXAMDETAILSTS: {NotNull, char(1), default=[(0)]} <br>
     * 検査明細ステータス
     * @return The value of the column 'EXAMDETAILSTS'. (NullAllowed)
     */
    public String getExamdetailsts() {
        return _examdetailsts;
    }

    /**
     * [set] EXAMDETAILSTS: {NotNull, char(1), default=[(0)]} <br>
     * 検査明細ステータス
     * @param examdetailsts The value of the column 'EXAMDETAILSTS'. (NullAllowed)
     */
    public void setExamdetailsts(String examdetailsts) {
        __modifiedProperties.add("examdetailsts");
        this._examdetailsts = examdetailsts;
    }

    /**
     * [get] EXAMDATE: {varchar(8)} <br>
     * 検査日
     * @return The value of the column 'EXAMDATE'. (NullAllowed)
     */
    public String getExamdate() {
        return _examdate;
    }

    /**
     * [set] EXAMDATE: {varchar(8)} <br>
     * 検査日
     * @param examdate The value of the column 'EXAMDATE'. (NullAllowed)
     */
    public void setExamdate(String examdate) {
        __modifiedProperties.add("examdate");
        this._examdate = examdate;
    }

    /**
     * [get] NOTEXAMQTY: {decimal(16, 6)} <br>
     * 検査対象外数量(個装）
     * @return The value of the column 'NOTEXAMQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getNotexamqty() {
        return _notexamqty;
    }

    /**
     * [set] NOTEXAMQTY: {decimal(16, 6)} <br>
     * 検査対象外数量(個装）
     * @param notexamqty The value of the column 'NOTEXAMQTY'. (NullAllowed)
     */
    public void setNotexamqty(java.math.BigDecimal notexamqty) {
        __modifiedProperties.add("notexamqty");
        this._notexamqty = notexamqty;
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

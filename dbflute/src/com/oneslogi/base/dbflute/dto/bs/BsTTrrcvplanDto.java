package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRRCVPLAN as TABLE. <br>
 * 格納指示情報
 * <pre>
 * [primary-key]
 *     TRRCVPLAN_ID
 *
 * [column]
 *     TRRCVPLAN_ID, RECEIVE_PLAN_H_ID, RCVLINENO, RCVPLANSTS, PRODUCT_CD, LOT1, LOT3, LOT4, LOT2, WAREHOUSECD, TOLOCCD, TRRCVQTY1, RCVINNO, PRINTEDFLG, LOADQTY1, RECEIVEDQTY1, RECEIVE_PLAN_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRRCVPLAN_ID
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
public abstract class BsTTrrcvplanDto implements Serializable {

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
    /** TRRCVPLAN_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trrcvplanId;

    /** RECEIVE_PLAN_H_ID: {IX+, NotNull, bigint(19)} */
    @JsonKey
    protected Long _receivePlanHId;

    /** RCVLINENO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _rcvlineno;

    /** RCVPLANSTS: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _rcvplansts;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** LOT1: {varchar(60)} */
    @JsonKey
    protected String _lot1;

    /** LOT3: {varchar(60)} */
    @JsonKey
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** LOT2: {varchar(60)} */
    @JsonKey
    protected String _lot2;

    /** WAREHOUSECD: {varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** TOLOCCD: {IX+, varchar(30)} */
    @JsonKey
    protected String _toloccd;

    /** TRRCVQTY1: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _trrcvqty1;

    /** RCVINNO: {varchar(30)} */
    @JsonKey
    protected String _rcvinno;

    /** PRINTEDFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _printedflg;

    /** LOADQTY1: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _loadqty1;

    /** RECEIVEDQTY1: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _receivedqty1;

    /** RECEIVE_PLAN_B_ID: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _receivePlanBId;

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
    public BsTTrrcvplanDto() {
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
        if (other == null || !(other instanceof BsTTrrcvplanDto)) { return false; }
        final BsTTrrcvplanDto otherEntity = (BsTTrrcvplanDto)other;
        if (!helpComparingValue(getTrrcvplanId(), otherEntity.getTrrcvplanId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRRCVPLAN");
        result = xCH(result, getTrrcvplanId());
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
        sb.append(c).append(getTrrcvplanId());
        sb.append(c).append(getReceivePlanHId());
        sb.append(c).append(getRcvlineno());
        sb.append(c).append(getRcvplansts());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot4());
        sb.append(c).append(getLot2());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getToloccd());
        sb.append(c).append(getTrrcvqty1());
        sb.append(c).append(getRcvinno());
        sb.append(c).append(getPrintedflg());
        sb.append(c).append(getLoadqty1());
        sb.append(c).append(getReceivedqty1());
        sb.append(c).append(getReceivePlanBId());
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
     * [get] TRRCVPLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 格納指示キー
     * @return The value of the column 'TRRCVPLAN_ID'. (NullAllowed)
     */
    public Long getTrrcvplanId() {
        return _trrcvplanId;
    }

    /**
     * [set] TRRCVPLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 格納指示キー
     * @param trrcvplanId The value of the column 'TRRCVPLAN_ID'. (NullAllowed)
     */
    public void setTrrcvplanId(Long trrcvplanId) {
        __modifiedProperties.add("trrcvplanId");
        this._trrcvplanId = trrcvplanId;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {IX+, NotNull, bigint(19)} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {IX+, NotNull, bigint(19)} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        __modifiedProperties.add("receivePlanHId");
        this._receivePlanHId = receivePlanHId;
    }

    /**
     * [get] RCVLINENO: {NotNull, bigint(19)} <br>
     * 入庫行№
     * @return The value of the column 'RCVLINENO'. (NullAllowed)
     */
    public Long getRcvlineno() {
        return _rcvlineno;
    }

    /**
     * [set] RCVLINENO: {NotNull, bigint(19)} <br>
     * 入庫行№
     * @param rcvlineno The value of the column 'RCVLINENO'. (NullAllowed)
     */
    public void setRcvlineno(Long rcvlineno) {
        __modifiedProperties.add("rcvlineno");
        this._rcvlineno = rcvlineno;
    }

    /**
     * [get] RCVPLANSTS: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 格納ステータス
     * @return The value of the column 'RCVPLANSTS'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvplansts() {
        return _rcvplansts;
    }

    /**
     * [set] RCVPLANSTS: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 格納ステータス
     * @param rcvplansts The value of the column 'RCVPLANSTS'. (NullAllowed)
     */
    public void setRcvplansts(java.math.BigDecimal rcvplansts) {
        __modifiedProperties.add("rcvplansts");
        this._rcvplansts = rcvplansts;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed)
     */
    public String getLot1() {
        return _lot1;
    }

    /**
     * [set] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed)
     */
    public void setLot1(String lot1) {
        __modifiedProperties.add("lot1");
        this._lot1 = lot1;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed)
     */
    public String getLot3() {
        return _lot3;
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed)
     */
    public void setLot3(String lot3) {
        __modifiedProperties.add("lot3");
        this._lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (NullAllowed)
     */
    public String getLot4() {
        return _lot4;
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed)
     */
    public void setLot4(String lot4) {
        __modifiedProperties.add("lot4");
        this._lot4 = lot4;
    }

    /**
     * [get] LOT2: {varchar(60)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed)
     */
    public String getLot2() {
        return _lot2;
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed)
     */
    public void setLot2(String lot2) {
        __modifiedProperties.add("lot2");
        this._lot2 = lot2;
    }

    /**
     * [get] WAREHOUSECD: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] TOLOCCD: {IX+, varchar(30)} <br>
     * 格納予定ロケーションCD
     * @return The value of the column 'TOLOCCD'. (NullAllowed)
     */
    public String getToloccd() {
        return _toloccd;
    }

    /**
     * [set] TOLOCCD: {IX+, varchar(30)} <br>
     * 格納予定ロケーションCD
     * @param toloccd The value of the column 'TOLOCCD'. (NullAllowed)
     */
    public void setToloccd(String toloccd) {
        __modifiedProperties.add("toloccd");
        this._toloccd = toloccd;
    }

    /**
     * [get] TRRCVQTY1: {decimal(16, 6), default=[(0)]} <br>
     * 格納予定数量１（バラ）
     * @return The value of the column 'TRRCVQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getTrrcvqty1() {
        return _trrcvqty1;
    }

    /**
     * [set] TRRCVQTY1: {decimal(16, 6), default=[(0)]} <br>
     * 格納予定数量１（バラ）
     * @param trrcvqty1 The value of the column 'TRRCVQTY1'. (NullAllowed)
     */
    public void setTrrcvqty1(java.math.BigDecimal trrcvqty1) {
        __modifiedProperties.add("trrcvqty1");
        this._trrcvqty1 = trrcvqty1;
    }

    /**
     * [get] RCVINNO: {varchar(30)} <br>
     * 格納順
     * @return The value of the column 'RCVINNO'. (NullAllowed)
     */
    public String getRcvinno() {
        return _rcvinno;
    }

    /**
     * [set] RCVINNO: {varchar(30)} <br>
     * 格納順
     * @param rcvinno The value of the column 'RCVINNO'. (NullAllowed)
     */
    public void setRcvinno(String rcvinno) {
        __modifiedProperties.add("rcvinno");
        this._rcvinno = rcvinno;
    }

    /**
     * [get] PRINTEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 格納予定リスト発行済フラグ
     * @return The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getPrintedflg() {
        return _printedflg;
    }

    /**
     * [set] PRINTEDFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 格納予定リスト発行済フラグ
     * @param printedflg The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public void setPrintedflg(java.math.BigDecimal printedflg) {
        __modifiedProperties.add("printedflg");
        this._printedflg = printedflg;
    }

    /**
     * [get] LOADQTY1: {decimal(16, 6)} <br>
     * パレット作成済数量１（バラ）
     * @return The value of the column 'LOADQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getLoadqty1() {
        return _loadqty1;
    }

    /**
     * [set] LOADQTY1: {decimal(16, 6)} <br>
     * パレット作成済数量１（バラ）
     * @param loadqty1 The value of the column 'LOADQTY1'. (NullAllowed)
     */
    public void setLoadqty1(java.math.BigDecimal loadqty1) {
        __modifiedProperties.add("loadqty1");
        this._loadqty1 = loadqty1;
    }

    /**
     * [get] RECEIVEDQTY1: {decimal(16, 6), default=[(0)]} <br>
     * 格納実績数量１（バラ）
     * @return The value of the column 'RECEIVEDQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getReceivedqty1() {
        return _receivedqty1;
    }

    /**
     * [set] RECEIVEDQTY1: {decimal(16, 6), default=[(0)]} <br>
     * 格納実績数量１（バラ）
     * @param receivedqty1 The value of the column 'RECEIVEDQTY1'. (NullAllowed)
     */
    public void setReceivedqty1(java.math.BigDecimal receivedqty1) {
        __modifiedProperties.add("receivedqty1");
        this._receivedqty1 = receivedqty1;
    }

    /**
     * [get] RECEIVE_PLAN_B_ID: {decimal(16, 6)} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public java.math.BigDecimal getReceivePlanBId() {
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {decimal(16, 6)} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public void setReceivePlanBId(java.math.BigDecimal receivePlanBId) {
        __modifiedProperties.add("receivePlanBId");
        this._receivePlanBId = receivePlanBId;
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

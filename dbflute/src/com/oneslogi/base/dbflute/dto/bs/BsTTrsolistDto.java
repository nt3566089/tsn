package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRSOLIST as TABLE. <br>
 * 出庫関連リスト印刷
 * <pre>
 * [primary-key]
 *     SHIPPING_LIST_PRINT_ID
 *
 * [column]
 *     SHIPPING_LIST_PRINT_ID, TRSOLISTKEY, LISTKBN, PRINTEDFLG, TRSOLISTSTS, PRINTDATETIME, SHIPSCHDATE, WORKALLOCATEID, RMANO, OWNERSONO, SHIPTOCD, ITEMCD, SOID, SODETAILID, SOPALLETNO, FLOOR, PICKING_INST_ID, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_LIST_PRINT_ID
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
public abstract class BsTTrsolistDto implements Serializable {

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
    /** SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _shippingListPrintId;

    /** TRSOLISTKEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _trsolistkey;

    /** LISTKBN: {varchar(100)} */
    @JsonKey
    protected String _listkbn;

    /** PRINTEDFLG: {char(1)} */
    @JsonKey
    protected String _printedflg;

    /** TRSOLISTSTS: {varchar(100)} */
    @JsonKey
    protected String _trsoliststs;

    /** PRINTDATETIME: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _printdatetime;

    /** SHIPSCHDATE: {varchar(8)} */
    @JsonKey
    protected String _shipschdate;

    /** WORKALLOCATEID: {bigint(19)} */
    @JsonKey
    protected Long _workallocateid;

    /** RMANO: {varchar(60)} */
    @JsonKey
    protected String _rmano;

    /** OWNERSONO: {varchar(60)} */
    @JsonKey
    protected String _ownersono;

    /** SHIPTOCD: {varchar(30)} */
    @JsonKey
    protected String _shiptocd;

    /** ITEMCD: {varchar(30)} */
    @JsonKey
    protected String _itemcd;

    /** SOID: {bigint(19)} */
    @JsonKey
    protected Long _soid;

    /** SODETAILID: {bigint(19)} */
    @JsonKey
    protected Long _sodetailid;

    /** SOPALLETNO: {varchar(30)} */
    @JsonKey
    protected String _sopalletno;

    /** FLOOR: {varchar(30)} */
    @JsonKey
    protected String _floor;

    /** PICKING_INST_ID: {bigint(19)} */
    @JsonKey
    protected Long _pickingInstId;

    /** CENTER_ID: {IX, NotNull, bigint(19)} */
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
    public BsTTrsolistDto() {
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
        if (other == null || !(other instanceof BsTTrsolistDto)) { return false; }
        final BsTTrsolistDto otherEntity = (BsTTrsolistDto)other;
        if (!helpComparingValue(getShippingListPrintId(), otherEntity.getShippingListPrintId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRSOLIST");
        result = xCH(result, getShippingListPrintId());
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
        sb.append(c).append(getShippingListPrintId());
        sb.append(c).append(getTrsolistkey());
        sb.append(c).append(getListkbn());
        sb.append(c).append(getPrintedflg());
        sb.append(c).append(getTrsoliststs());
        sb.append(c).append(getPrintdatetime());
        sb.append(c).append(getShipschdate());
        sb.append(c).append(getWorkallocateid());
        sb.append(c).append(getRmano());
        sb.append(c).append(getOwnersono());
        sb.append(c).append(getShiptocd());
        sb.append(c).append(getItemcd());
        sb.append(c).append(getSoid());
        sb.append(c).append(getSodetailid());
        sb.append(c).append(getSopalletno());
        sb.append(c).append(getFloor());
        sb.append(c).append(getPickingInstId());
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
     * [get] SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫関連リスト印刷ID
     * @return The value of the column 'SHIPPING_LIST_PRINT_ID'. (NullAllowed)
     */
    public Long getShippingListPrintId() {
        return _shippingListPrintId;
    }

    /**
     * [set] SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫関連リスト印刷ID
     * @param shippingListPrintId The value of the column 'SHIPPING_LIST_PRINT_ID'. (NullAllowed)
     */
    public void setShippingListPrintId(Long shippingListPrintId) {
        __modifiedProperties.add("shippingListPrintId");
        this._shippingListPrintId = shippingListPrintId;
    }

    /**
     * [get] TRSOLISTKEY: {NotNull, bigint(19)} <br>
     * 出庫関連リストキー
     * @return The value of the column 'TRSOLISTKEY'. (NullAllowed)
     */
    public Long getTrsolistkey() {
        return _trsolistkey;
    }

    /**
     * [set] TRSOLISTKEY: {NotNull, bigint(19)} <br>
     * 出庫関連リストキー
     * @param trsolistkey The value of the column 'TRSOLISTKEY'. (NullAllowed)
     */
    public void setTrsolistkey(Long trsolistkey) {
        __modifiedProperties.add("trsolistkey");
        this._trsolistkey = trsolistkey;
    }

    /**
     * [get] LISTKBN: {varchar(100)} <br>
     * 帳票区分
     * @return The value of the column 'LISTKBN'. (NullAllowed)
     */
    public String getListkbn() {
        return _listkbn;
    }

    /**
     * [set] LISTKBN: {varchar(100)} <br>
     * 帳票区分
     * @param listkbn The value of the column 'LISTKBN'. (NullAllowed)
     */
    public void setListkbn(String listkbn) {
        __modifiedProperties.add("listkbn");
        this._listkbn = listkbn;
    }

    /**
     * [get] PRINTEDFLG: {char(1)} <br>
     * 印刷済フラグ
     * @return The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public String getPrintedflg() {
        return _printedflg;
    }

    /**
     * [set] PRINTEDFLG: {char(1)} <br>
     * 印刷済フラグ
     * @param printedflg The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public void setPrintedflg(String printedflg) {
        __modifiedProperties.add("printedflg");
        this._printedflg = printedflg;
    }

    /**
     * [get] TRSOLISTSTS: {varchar(100)} <br>
     * 出庫作業ステータス
     * @return The value of the column 'TRSOLISTSTS'. (NullAllowed)
     */
    public String getTrsoliststs() {
        return _trsoliststs;
    }

    /**
     * [set] TRSOLISTSTS: {varchar(100)} <br>
     * 出庫作業ステータス
     * @param trsoliststs The value of the column 'TRSOLISTSTS'. (NullAllowed)
     */
    public void setTrsoliststs(String trsoliststs) {
        __modifiedProperties.add("trsoliststs");
        this._trsoliststs = trsoliststs;
    }

    /**
     * [get] PRINTDATETIME: {datetime2(26, 6)} <br>
     * 印刷年月日
     * @return The value of the column 'PRINTDATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPrintdatetime() {
        return _printdatetime;
    }

    /**
     * [set] PRINTDATETIME: {datetime2(26, 6)} <br>
     * 印刷年月日
     * @param printdatetime The value of the column 'PRINTDATETIME'. (NullAllowed)
     */
    public void setPrintdatetime(java.sql.Timestamp printdatetime) {
        __modifiedProperties.add("printdatetime");
        this._printdatetime = printdatetime;
    }

    /**
     * [get] SHIPSCHDATE: {varchar(8)} <br>
     * 出庫予定日
     * @return The value of the column 'SHIPSCHDATE'. (NullAllowed)
     */
    public String getShipschdate() {
        return _shipschdate;
    }

    /**
     * [set] SHIPSCHDATE: {varchar(8)} <br>
     * 出庫予定日
     * @param shipschdate The value of the column 'SHIPSCHDATE'. (NullAllowed)
     */
    public void setShipschdate(String shipschdate) {
        __modifiedProperties.add("shipschdate");
        this._shipschdate = shipschdate;
    }

    /**
     * [get] WORKALLOCATEID: {bigint(19)} <br>
     * 棚出リストキー
     * @return The value of the column 'WORKALLOCATEID'. (NullAllowed)
     */
    public Long getWorkallocateid() {
        return _workallocateid;
    }

    /**
     * [set] WORKALLOCATEID: {bigint(19)} <br>
     * 棚出リストキー
     * @param workallocateid The value of the column 'WORKALLOCATEID'. (NullAllowed)
     */
    public void setWorkallocateid(Long workallocateid) {
        __modifiedProperties.add("workallocateid");
        this._workallocateid = workallocateid;
    }

    /**
     * [get] RMANO: {varchar(60)} <br>
     * 問合番号
     * @return The value of the column 'RMANO'. (NullAllowed)
     */
    public String getRmano() {
        return _rmano;
    }

    /**
     * [set] RMANO: {varchar(60)} <br>
     * 問合番号
     * @param rmano The value of the column 'RMANO'. (NullAllowed)
     */
    public void setRmano(String rmano) {
        __modifiedProperties.add("rmano");
        this._rmano = rmano;
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
     * [get] SHIPTOCD: {varchar(30)} <br>
     * 受入先CD
     * @return The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public String getShiptocd() {
        return _shiptocd;
    }

    /**
     * [set] SHIPTOCD: {varchar(30)} <br>
     * 受入先CD
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public void setShiptocd(String shiptocd) {
        __modifiedProperties.add("shiptocd");
        this._shiptocd = shiptocd;
    }

    /**
     * [get] ITEMCD: {varchar(30)} <br>
     * @return The value of the column 'ITEMCD'. (NullAllowed)
     */
    public String getItemcd() {
        return _itemcd;
    }

    /**
     * [set] ITEMCD: {varchar(30)} <br>
     * @param itemcd The value of the column 'ITEMCD'. (NullAllowed)
     */
    public void setItemcd(String itemcd) {
        __modifiedProperties.add("itemcd");
        this._itemcd = itemcd;
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
     * [get] SODETAILID: {bigint(19)} <br>
     * 出庫予定明細ID
     * @return The value of the column 'SODETAILID'. (NullAllowed)
     */
    public Long getSodetailid() {
        return _sodetailid;
    }

    /**
     * [set] SODETAILID: {bigint(19)} <br>
     * 出庫予定明細ID
     * @param sodetailid The value of the column 'SODETAILID'. (NullAllowed)
     */
    public void setSodetailid(Long sodetailid) {
        __modifiedProperties.add("sodetailid");
        this._sodetailid = sodetailid;
    }

    /**
     * [get] SOPALLETNO: {varchar(30)} <br>
     * P/LNo
     * @return The value of the column 'SOPALLETNO'. (NullAllowed)
     */
    public String getSopalletno() {
        return _sopalletno;
    }

    /**
     * [set] SOPALLETNO: {varchar(30)} <br>
     * P/LNo
     * @param sopalletno The value of the column 'SOPALLETNO'. (NullAllowed)
     */
    public void setSopalletno(String sopalletno) {
        __modifiedProperties.add("sopalletno");
        this._sopalletno = sopalletno;
    }

    /**
     * [get] FLOOR: {varchar(30)} <br>
     * フロア
     * @return The value of the column 'FLOOR'. (NullAllowed)
     */
    public String getFloor() {
        return _floor;
    }

    /**
     * [set] FLOOR: {varchar(30)} <br>
     * フロア
     * @param floor The value of the column 'FLOOR'. (NullAllowed)
     */
    public void setFloor(String floor) {
        __modifiedProperties.add("floor");
        this._floor = floor;
    }

    /**
     * [get] PICKING_INST_ID: {bigint(19)} <br>
     * ピッキング指示ID
     * @return The value of the column 'PICKING_INST_ID'. (NullAllowed)
     */
    public Long getPickingInstId() {
        return _pickingInstId;
    }

    /**
     * [set] PICKING_INST_ID: {bigint(19)} <br>
     * ピッキング指示ID
     * @param pickingInstId The value of the column 'PICKING_INST_ID'. (NullAllowed)
     */
    public void setPickingInstId(Long pickingInstId) {
        __modifiedProperties.add("pickingInstId");
        this._pickingInstId = pickingInstId;
    }

    /**
     * [get] CENTER_ID: {IX, NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX, NotNull, bigint(19)} <br>
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

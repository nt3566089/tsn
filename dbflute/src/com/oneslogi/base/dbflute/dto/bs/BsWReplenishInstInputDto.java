package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_REPLENISH_INST_INPUT as TABLE. <br>
 * 融通指示一括取込ワーク
 * <pre>
 * [primary-key]
 *     REPLENISH_INST_INPUT_ID
 *
 * [column]
 *     REPLENISH_INST_INPUT_ID, RECEIVE_CD, CENTER_CD, CLIENT_CD, FLEXLNS_NO, SCH_DATE, SUPPLIER_CD, RCV_DATE, SHIP_CD, ITEM_CD, MANUFACTURE_DATE, DESIGN_CD, QTY, FLEX_UPD_USER_CD, FLEXIBITYNO, TRANSPORTCD, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPLENISH_INST_INPUT_ID
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
public abstract class BsWReplenishInstInputDto implements Serializable {

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
    /** REPLENISH_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _replenishInstInputId;

    /** RECEIVE_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _receiveCd;

    /** CENTER_CD: {varchar(255)} */
    @JsonKey
    protected String _centerCd;

    /** CLIENT_CD: {varchar(255)} */
    @JsonKey
    protected String _clientCd;

    /** FLEXLNS_NO: {varchar(255)} */
    @JsonKey
    protected String _flexlnsNo;

    /** SCH_DATE: {varchar(255)} */
    @JsonKey
    protected String _schDate;

    /** SUPPLIER_CD: {varchar(255)} */
    @JsonKey
    protected String _supplierCd;

    /** RCV_DATE: {varchar(255)} */
    @JsonKey
    protected String _rcvDate;

    /** SHIP_CD: {varchar(255)} */
    @JsonKey
    protected String _shipCd;

    /** ITEM_CD: {varchar(255)} */
    @JsonKey
    protected String _itemCd;

    /** MANUFACTURE_DATE: {varchar(255)} */
    @JsonKey
    protected String _manufactureDate;

    /** DESIGN_CD: {varchar(255)} */
    @JsonKey
    protected String _designCd;

    /** QTY: {varchar(255)} */
    @JsonKey
    protected String _qty;

    /** FLEX_UPD_USER_CD: {varchar(255)} */
    @JsonKey
    protected String _flexUpdUserCd;

    /** FLEXIBITYNO: {bigint(19)} */
    @JsonKey
    protected Long _flexibityno;

    /** TRANSPORTCD: {varchar(255)} */
    @JsonKey
    protected String _transportcd;

    /** LINE_NO: {bigint(19)} */
    @JsonKey
    protected Long _lineNo;

    /** WORK_FLG: {char(1)} */
    @JsonKey
    protected String _workFlg;

    /** ERROR_FLG: {char(1)} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MSG: {varchar(2147483647)} */
    @JsonKey
    protected String _errorMsg;

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
    public BsWReplenishInstInputDto() {
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
        if (other == null || !(other instanceof BsWReplenishInstInputDto)) { return false; }
        final BsWReplenishInstInputDto otherEntity = (BsWReplenishInstInputDto)other;
        if (!helpComparingValue(getReplenishInstInputId(), otherEntity.getReplenishInstInputId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_REPLENISH_INST_INPUT");
        result = xCH(result, getReplenishInstInputId());
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
        sb.append(c).append(getReplenishInstInputId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getFlexlnsNo());
        sb.append(c).append(getSchDate());
        sb.append(c).append(getSupplierCd());
        sb.append(c).append(getRcvDate());
        sb.append(c).append(getShipCd());
        sb.append(c).append(getItemCd());
        sb.append(c).append(getManufactureDate());
        sb.append(c).append(getDesignCd());
        sb.append(c).append(getQty());
        sb.append(c).append(getFlexUpdUserCd());
        sb.append(c).append(getFlexibityno());
        sb.append(c).append(getTransportcd());
        sb.append(c).append(getLineNo());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMsg());
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
     * [get] REPLENISH_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通指示一括取込ワークID
     * @return The value of the column 'REPLENISH_INST_INPUT_ID'. (NullAllowed)
     */
    public Long getReplenishInstInputId() {
        return _replenishInstInputId;
    }

    /**
     * [set] REPLENISH_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通指示一括取込ワークID
     * @param replenishInstInputId The value of the column 'REPLENISH_INST_INPUT_ID'. (NullAllowed)
     */
    public void setReplenishInstInputId(Long replenishInstInputId) {
        __modifiedProperties.add("replenishInstInputId");
        this._replenishInstInputId = replenishInstInputId;
    }

    /**
     * [get] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] CENTER_CD: {varchar(255)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(255)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] FLEXLNS_NO: {varchar(255)} <br>
     * 指示No.
     * @return The value of the column 'FLEXLNS_NO'. (NullAllowed)
     */
    public String getFlexlnsNo() {
        return _flexlnsNo;
    }

    /**
     * [set] FLEXLNS_NO: {varchar(255)} <br>
     * 指示No.
     * @param flexlnsNo The value of the column 'FLEXLNS_NO'. (NullAllowed)
     */
    public void setFlexlnsNo(String flexlnsNo) {
        __modifiedProperties.add("flexlnsNo");
        this._flexlnsNo = flexlnsNo;
    }

    /**
     * [get] SCH_DATE: {varchar(255)} <br>
     * 発送予定日
     * @return The value of the column 'SCH_DATE'. (NullAllowed)
     */
    public String getSchDate() {
        return _schDate;
    }

    /**
     * [set] SCH_DATE: {varchar(255)} <br>
     * 発送予定日
     * @param schDate The value of the column 'SCH_DATE'. (NullAllowed)
     */
    public void setSchDate(String schDate) {
        __modifiedProperties.add("schDate");
        this._schDate = schDate;
    }

    /**
     * [get] SUPPLIER_CD: {varchar(255)} <br>
     * 発送元CD
     * @return The value of the column 'SUPPLIER_CD'. (NullAllowed)
     */
    public String getSupplierCd() {
        return _supplierCd;
    }

    /**
     * [set] SUPPLIER_CD: {varchar(255)} <br>
     * 発送元CD
     * @param supplierCd The value of the column 'SUPPLIER_CD'. (NullAllowed)
     */
    public void setSupplierCd(String supplierCd) {
        __modifiedProperties.add("supplierCd");
        this._supplierCd = supplierCd;
    }

    /**
     * [get] RCV_DATE: {varchar(255)} <br>
     * 受入予定日
     * @return The value of the column 'RCV_DATE'. (NullAllowed)
     */
    public String getRcvDate() {
        return _rcvDate;
    }

    /**
     * [set] RCV_DATE: {varchar(255)} <br>
     * 受入予定日
     * @param rcvDate The value of the column 'RCV_DATE'. (NullAllowed)
     */
    public void setRcvDate(String rcvDate) {
        __modifiedProperties.add("rcvDate");
        this._rcvDate = rcvDate;
    }

    /**
     * [get] SHIP_CD: {varchar(255)} <br>
     * 発送先CD
     * @return The value of the column 'SHIP_CD'. (NullAllowed)
     */
    public String getShipCd() {
        return _shipCd;
    }

    /**
     * [set] SHIP_CD: {varchar(255)} <br>
     * 発送先CD
     * @param shipCd The value of the column 'SHIP_CD'. (NullAllowed)
     */
    public void setShipCd(String shipCd) {
        __modifiedProperties.add("shipCd");
        this._shipCd = shipCd;
    }

    /**
     * [get] ITEM_CD: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'ITEM_CD'. (NullAllowed)
     */
    public String getItemCd() {
        return _itemCd;
    }

    /**
     * [set] ITEM_CD: {varchar(255)} <br>
     * 銘柄CD
     * @param itemCd The value of the column 'ITEM_CD'. (NullAllowed)
     */
    public void setItemCd(String itemCd) {
        __modifiedProperties.add("itemCd");
        this._itemCd = itemCd;
    }

    /**
     * [get] MANUFACTURE_DATE: {varchar(255)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTURE_DATE'. (NullAllowed)
     */
    public String getManufactureDate() {
        return _manufactureDate;
    }

    /**
     * [set] MANUFACTURE_DATE: {varchar(255)} <br>
     * 製造年月日
     * @param manufactureDate The value of the column 'MANUFACTURE_DATE'. (NullAllowed)
     */
    public void setManufactureDate(String manufactureDate) {
        __modifiedProperties.add("manufactureDate");
        this._manufactureDate = manufactureDate;
    }

    /**
     * [get] DESIGN_CD: {varchar(255)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_CD'. (NullAllowed)
     */
    public String getDesignCd() {
        return _designCd;
    }

    /**
     * [set] DESIGN_CD: {varchar(255)} <br>
     * デザイン区分
     * @param designCd The value of the column 'DESIGN_CD'. (NullAllowed)
     */
    public void setDesignCd(String designCd) {
        __modifiedProperties.add("designCd");
        this._designCd = designCd;
    }

    /**
     * [get] QTY: {varchar(255)} <br>
     * 数量（個数）
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public String getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {varchar(255)} <br>
     * 数量（個数）
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(String qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
    }

    /**
     * [get] FLEX_UPD_USER_CD: {varchar(255)} <br>
     * 画面更新者
     * @return The value of the column 'FLEX_UPD_USER_CD'. (NullAllowed)
     */
    public String getFlexUpdUserCd() {
        return _flexUpdUserCd;
    }

    /**
     * [set] FLEX_UPD_USER_CD: {varchar(255)} <br>
     * 画面更新者
     * @param flexUpdUserCd The value of the column 'FLEX_UPD_USER_CD'. (NullAllowed)
     */
    public void setFlexUpdUserCd(String flexUpdUserCd) {
        __modifiedProperties.add("flexUpdUserCd");
        this._flexUpdUserCd = flexUpdUserCd;
    }

    /**
     * [get] FLEXIBITYNO: {bigint(19)} <br>
     * 融通No.
     * @return The value of the column 'FLEXIBITYNO'. (NullAllowed)
     */
    public Long getFlexibityno() {
        return _flexibityno;
    }

    /**
     * [set] FLEXIBITYNO: {bigint(19)} <br>
     * 融通No.
     * @param flexibityno The value of the column 'FLEXIBITYNO'. (NullAllowed)
     */
    public void setFlexibityno(Long flexibityno) {
        __modifiedProperties.add("flexibityno");
        this._flexibityno = flexibityno;
    }

    /**
     * [get] TRANSPORTCD: {varchar(255)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public String getTransportcd() {
        return _transportcd;
    }

    /**
     * [set] TRANSPORTCD: {varchar(255)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public void setTransportcd(String transportcd) {
        __modifiedProperties.add("transportcd");
        this._transportcd = transportcd;
    }

    /**
     * [get] LINE_NO: {bigint(19)} <br>
     * 行NO.
     * @return The value of the column 'LINE_NO'. (NullAllowed)
     */
    public Long getLineNo() {
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {bigint(19)} <br>
     * 行NO.
     * @param lineNo The value of the column 'LINE_NO'. (NullAllowed)
     */
    public void setLineNo(Long lineNo) {
        __modifiedProperties.add("lineNo");
        this._lineNo = lineNo;
    }

    /**
     * [get] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1)} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {char(1)} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @return The value of the column 'ERROR_MSG'. (NullAllowed)
     */
    public String getErrorMsg() {
        return _errorMsg;
    }

    /**
     * [set] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @param errorMsg The value of the column 'ERROR_MSG'. (NullAllowed)
     */
    public void setErrorMsg(String errorMsg) {
        __modifiedProperties.add("errorMsg");
        this._errorMsg = errorMsg;
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

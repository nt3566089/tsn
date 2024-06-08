package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_SHIP_INOUT_PLAN_SHIP as TABLE. <br>
 * 輸送受払計画受信テーブル(輸送)(国産)
 * <pre>
 * [primary-key]
 *     SHIP_INOUT_PLAN_SHIP_ID
 *
 * [column]
 *     SHIP_INOUT_PLAN_SHIP_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, WAREHOUSE_CD, REF_NO, SHIP_CD, SHIP_SCH_DATE, SHIP_TO_CD, SHIP_TO_SCH_DATE, DATA_TYPE, ITEM_CD, QTY, SUB_WAREHOUSE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIP_INOUT_PLAN_SHIP_ID
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
public abstract class BsEShipInoutPlanShipDto implements Serializable {

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
    /** SHIP_INOUT_PLAN_SHIP_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _shipInoutPlanShipId;

    /** RECEIVE_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** WAREHOUSE_CD: {varchar(255)} */
    @JsonKey
    protected String _warehouseCd;

    /** REF_NO: {varchar(255)} */
    @JsonKey
    protected String _refNo;

    /** SHIP_CD: {varchar(255)} */
    @JsonKey
    protected String _shipCd;

    /** SHIP_SCH_DATE: {varchar(255)} */
    @JsonKey
    protected String _shipSchDate;

    /** SHIP_TO_CD: {varchar(255)} */
    @JsonKey
    protected String _shipToCd;

    /** SHIP_TO_SCH_DATE: {varchar(255)} */
    @JsonKey
    protected String _shipToSchDate;

    /** DATA_TYPE: {varchar(255)} */
    @JsonKey
    protected String _dataType;

    /** ITEM_CD: {varchar(255)} */
    @JsonKey
    protected String _itemCd;

    /** QTY: {varchar(255)} */
    @JsonKey
    protected String _qty;

    /** SUB_WAREHOUSE_CD: {varchar(255)} */
    @JsonKey
    protected String _subWarehouseCd;

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
    public BsEShipInoutPlanShipDto() {
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
        if (other == null || !(other instanceof BsEShipInoutPlanShipDto)) { return false; }
        final BsEShipInoutPlanShipDto otherEntity = (BsEShipInoutPlanShipDto)other;
        if (!helpComparingValue(getShipInoutPlanShipId(), otherEntity.getShipInoutPlanShipId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_SHIP_INOUT_PLAN_SHIP");
        result = xCH(result, getShipInoutPlanShipId());
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
        sb.append(c).append(getShipInoutPlanShipId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getRefNo());
        sb.append(c).append(getShipCd());
        sb.append(c).append(getShipSchDate());
        sb.append(c).append(getShipToCd());
        sb.append(c).append(getShipToSchDate());
        sb.append(c).append(getDataType());
        sb.append(c).append(getItemCd());
        sb.append(c).append(getQty());
        sb.append(c).append(getSubWarehouseCd());
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
     * [get] SHIP_INOUT_PLAN_SHIP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 輸送受払計画受信(輸送)(国産)ID
     * @return The value of the column 'SHIP_INOUT_PLAN_SHIP_ID'. (NullAllowed)
     */
    public Long getShipInoutPlanShipId() {
        return _shipInoutPlanShipId;
    }

    /**
     * [set] SHIP_INOUT_PLAN_SHIP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 輸送受払計画受信(輸送)(国産)ID
     * @param shipInoutPlanShipId The value of the column 'SHIP_INOUT_PLAN_SHIP_ID'. (NullAllowed)
     */
    public void setShipInoutPlanShipId(Long shipInoutPlanShipId) {
        __modifiedProperties.add("shipInoutPlanShipId");
        this._shipInoutPlanShipId = shipInoutPlanShipId;
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
     * [get] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * 倉庫CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] REF_NO: {varchar(255)} <br>
     * 整理番号
     * @return The value of the column 'REF_NO'. (NullAllowed)
     */
    public String getRefNo() {
        return _refNo;
    }

    /**
     * [set] REF_NO: {varchar(255)} <br>
     * 整理番号
     * @param refNo The value of the column 'REF_NO'. (NullAllowed)
     */
    public void setRefNo(String refNo) {
        __modifiedProperties.add("refNo");
        this._refNo = refNo;
    }

    /**
     * [get] SHIP_CD: {varchar(255)} <br>
     * 発送元CD
     * @return The value of the column 'SHIP_CD'. (NullAllowed)
     */
    public String getShipCd() {
        return _shipCd;
    }

    /**
     * [set] SHIP_CD: {varchar(255)} <br>
     * 発送元CD
     * @param shipCd The value of the column 'SHIP_CD'. (NullAllowed)
     */
    public void setShipCd(String shipCd) {
        __modifiedProperties.add("shipCd");
        this._shipCd = shipCd;
    }

    /**
     * [get] SHIP_SCH_DATE: {varchar(255)} <br>
     * 発送予定年月日
     * @return The value of the column 'SHIP_SCH_DATE'. (NullAllowed)
     */
    public String getShipSchDate() {
        return _shipSchDate;
    }

    /**
     * [set] SHIP_SCH_DATE: {varchar(255)} <br>
     * 発送予定年月日
     * @param shipSchDate The value of the column 'SHIP_SCH_DATE'. (NullAllowed)
     */
    public void setShipSchDate(String shipSchDate) {
        __modifiedProperties.add("shipSchDate");
        this._shipSchDate = shipSchDate;
    }

    /**
     * [get] SHIP_TO_CD: {varchar(255)} <br>
     * 受入先CD
     * @return The value of the column 'SHIP_TO_CD'. (NullAllowed)
     */
    public String getShipToCd() {
        return _shipToCd;
    }

    /**
     * [set] SHIP_TO_CD: {varchar(255)} <br>
     * 受入先CD
     * @param shipToCd The value of the column 'SHIP_TO_CD'. (NullAllowed)
     */
    public void setShipToCd(String shipToCd) {
        __modifiedProperties.add("shipToCd");
        this._shipToCd = shipToCd;
    }

    /**
     * [get] SHIP_TO_SCH_DATE: {varchar(255)} <br>
     * 受入予定年月日
     * @return The value of the column 'SHIP_TO_SCH_DATE'. (NullAllowed)
     */
    public String getShipToSchDate() {
        return _shipToSchDate;
    }

    /**
     * [set] SHIP_TO_SCH_DATE: {varchar(255)} <br>
     * 受入予定年月日
     * @param shipToSchDate The value of the column 'SHIP_TO_SCH_DATE'. (NullAllowed)
     */
    public void setShipToSchDate(String shipToSchDate) {
        __modifiedProperties.add("shipToSchDate");
        this._shipToSchDate = shipToSchDate;
    }

    /**
     * [get] DATA_TYPE: {varchar(255)} <br>
     * 修正区分
     * @return The value of the column 'DATA_TYPE'. (NullAllowed)
     */
    public String getDataType() {
        return _dataType;
    }

    /**
     * [set] DATA_TYPE: {varchar(255)} <br>
     * 修正区分
     * @param dataType The value of the column 'DATA_TYPE'. (NullAllowed)
     */
    public void setDataType(String dataType) {
        __modifiedProperties.add("dataType");
        this._dataType = dataType;
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
     * [get] QTY: {varchar(255)} <br>
     * 個数
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public String getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {varchar(255)} <br>
     * 個数
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(String qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
    }

    /**
     * [get] SUB_WAREHOUSE_CD: {varchar(255)} <br>
     * 枝倉庫CD
     * @return The value of the column 'SUB_WAREHOUSE_CD'. (NullAllowed)
     */
    public String getSubWarehouseCd() {
        return _subWarehouseCd;
    }

    /**
     * [set] SUB_WAREHOUSE_CD: {varchar(255)} <br>
     * 枝倉庫CD
     * @param subWarehouseCd The value of the column 'SUB_WAREHOUSE_CD'. (NullAllowed)
     */
    public void setSubWarehouseCd(String subWarehouseCd) {
        __modifiedProperties.add("subWarehouseCd");
        this._subWarehouseCd = subWarehouseCd;
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

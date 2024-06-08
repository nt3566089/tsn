package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_LOCATION_INPUT as TABLE. <br>
 * ロケーションマスタ取込ワーク
 * <pre>
 * [primary-key]
 *     LOCATION_INPUT_ID
 *
 * [column]
 *     LOCATION_INPUT_ID, CENTER_CD, WAREHOUSE_CD, ZONE_CD, LOCATION_CD, LOCATION_NM, PICKING_LOCATION_FLG, PICKING_ORDER, LOCATION_TYPE, ALLOC_ORDER, ALLOC_NG_FLG, RESTOCK_PRODUCT_CD, RESTOCK_STOCK_TYPE_CD, RESTOCK_DEPOSIT_CD, RESTOCK_SHAPE_CD, RESTOCK_POINT_NUM, MAX_STORE_SHAPE_CD, MAX_STORE_NUM, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOCATION_INPUT_ID
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
public abstract class BsWLocationInputDto implements Serializable {

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
    /** LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _locationInputId;

    /** CENTER_CD: {varchar(255)} */
    @JsonKey
    protected String _centerCd;

    /** WAREHOUSE_CD: {varchar(255)} */
    @JsonKey
    protected String _warehouseCd;

    /** ZONE_CD: {varchar(255)} */
    @JsonKey
    protected String _zoneCd;

    /** LOCATION_CD: {varchar(255)} */
    @JsonKey
    protected String _locationCd;

    /** LOCATION_NM: {varchar(255)} */
    @JsonKey
    protected String _locationNm;

    /** PICKING_LOCATION_FLG: {varchar(255)} */
    @JsonKey
    protected String _pickingLocationFlg;

    /** PICKING_ORDER: {varchar(255)} */
    @JsonKey
    protected String _pickingOrder;

    /** LOCATION_TYPE: {varchar(255)} */
    @JsonKey
    protected String _locationType;

    /** ALLOC_ORDER: {varchar(255)} */
    @JsonKey
    protected String _allocOrder;

    /** ALLOC_NG_FLG: {varchar(255)} */
    @JsonKey
    protected String _allocNgFlg;

    /** RESTOCK_PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _restockProductCd;

    /** RESTOCK_STOCK_TYPE_CD: {varchar(255)} */
    @JsonKey
    protected String _restockStockTypeCd;

    /** RESTOCK_DEPOSIT_CD: {varchar(255)} */
    @JsonKey
    protected String _restockDepositCd;

    /** RESTOCK_SHAPE_CD: {varchar(255)} */
    @JsonKey
    protected String _restockShapeCd;

    /** RESTOCK_POINT_NUM: {varchar(255)} */
    @JsonKey
    protected String _restockPointNum;

    /** MAX_STORE_SHAPE_CD: {varchar(255)} */
    @JsonKey
    protected String _maxStoreShapeCd;

    /** MAX_STORE_NUM: {varchar(255)} */
    @JsonKey
    protected String _maxStoreNum;

    /** LINE_NO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _lineNo;

    /** WORK_FLG: {char(1), default=[(0)]} */
    @JsonKey
    protected String _workFlg;

    /** ERROR_FLG: {char(1), default=[(0)]} */
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
    public BsWLocationInputDto() {
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
        if (other == null || !(other instanceof BsWLocationInputDto)) { return false; }
        final BsWLocationInputDto otherEntity = (BsWLocationInputDto)other;
        if (!helpComparingValue(getLocationInputId(), otherEntity.getLocationInputId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_LOCATION_INPUT");
        result = xCH(result, getLocationInputId());
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
        sb.append(c).append(getLocationInputId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getZoneCd());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getLocationNm());
        sb.append(c).append(getPickingLocationFlg());
        sb.append(c).append(getPickingOrder());
        sb.append(c).append(getLocationType());
        sb.append(c).append(getAllocOrder());
        sb.append(c).append(getAllocNgFlg());
        sb.append(c).append(getRestockProductCd());
        sb.append(c).append(getRestockStockTypeCd());
        sb.append(c).append(getRestockDepositCd());
        sb.append(c).append(getRestockShapeCd());
        sb.append(c).append(getRestockPointNum());
        sb.append(c).append(getMaxStoreShapeCd());
        sb.append(c).append(getMaxStoreNum());
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
     * [get] LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ロケーションマスタ取込ワークID
     * @return The value of the column 'LOCATION_INPUT_ID'. (NullAllowed)
     */
    public Long getLocationInputId() {
        return _locationInputId;
    }

    /**
     * [set] LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ロケーションマスタ取込ワークID
     * @param locationInputId The value of the column 'LOCATION_INPUT_ID'. (NullAllowed)
     */
    public void setLocationInputId(Long locationInputId) {
        __modifiedProperties.add("locationInputId");
        this._locationInputId = locationInputId;
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
     * [get] ZONE_CD: {varchar(255)} <br>
     * ゾーンCD
     * @return The value of the column 'ZONE_CD'. (NullAllowed)
     */
    public String getZoneCd() {
        return _zoneCd;
    }

    /**
     * [set] ZONE_CD: {varchar(255)} <br>
     * ゾーンCD
     * @param zoneCd The value of the column 'ZONE_CD'. (NullAllowed)
     */
    public void setZoneCd(String zoneCd) {
        __modifiedProperties.add("zoneCd");
        this._zoneCd = zoneCd;
    }

    /**
     * [get] LOCATION_CD: {varchar(255)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {varchar(255)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] LOCATION_NM: {varchar(255)} <br>
     * ロケーション名称
     * @return The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public String getLocationNm() {
        return _locationNm;
    }

    /**
     * [set] LOCATION_NM: {varchar(255)} <br>
     * ロケーション名称
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public void setLocationNm(String locationNm) {
        __modifiedProperties.add("locationNm");
        this._locationNm = locationNm;
    }

    /**
     * [get] PICKING_LOCATION_FLG: {varchar(255)} <br>
     * ピックロケフラグ
     * @return The value of the column 'PICKING_LOCATION_FLG'. (NullAllowed)
     */
    public String getPickingLocationFlg() {
        return _pickingLocationFlg;
    }

    /**
     * [set] PICKING_LOCATION_FLG: {varchar(255)} <br>
     * ピックロケフラグ
     * @param pickingLocationFlg The value of the column 'PICKING_LOCATION_FLG'. (NullAllowed)
     */
    public void setPickingLocationFlg(String pickingLocationFlg) {
        __modifiedProperties.add("pickingLocationFlg");
        this._pickingLocationFlg = pickingLocationFlg;
    }

    /**
     * [get] PICKING_ORDER: {varchar(255)} <br>
     * ピッキング順序
     * @return The value of the column 'PICKING_ORDER'. (NullAllowed)
     */
    public String getPickingOrder() {
        return _pickingOrder;
    }

    /**
     * [set] PICKING_ORDER: {varchar(255)} <br>
     * ピッキング順序
     * @param pickingOrder The value of the column 'PICKING_ORDER'. (NullAllowed)
     */
    public void setPickingOrder(String pickingOrder) {
        __modifiedProperties.add("pickingOrder");
        this._pickingOrder = pickingOrder;
    }

    /**
     * [get] LOCATION_TYPE: {varchar(255)} <br>
     * ロケーション種別
     * @return The value of the column 'LOCATION_TYPE'. (NullAllowed)
     */
    public String getLocationType() {
        return _locationType;
    }

    /**
     * [set] LOCATION_TYPE: {varchar(255)} <br>
     * ロケーション種別
     * @param locationType The value of the column 'LOCATION_TYPE'. (NullAllowed)
     */
    public void setLocationType(String locationType) {
        __modifiedProperties.add("locationType");
        this._locationType = locationType;
    }

    /**
     * [get] ALLOC_ORDER: {varchar(255)} <br>
     * 引当順序
     * @return The value of the column 'ALLOC_ORDER'. (NullAllowed)
     */
    public String getAllocOrder() {
        return _allocOrder;
    }

    /**
     * [set] ALLOC_ORDER: {varchar(255)} <br>
     * 引当順序
     * @param allocOrder The value of the column 'ALLOC_ORDER'. (NullAllowed)
     */
    public void setAllocOrder(String allocOrder) {
        __modifiedProperties.add("allocOrder");
        this._allocOrder = allocOrder;
    }

    /**
     * [get] ALLOC_NG_FLG: {varchar(255)} <br>
     * 引当禁止フラグ
     * @return The value of the column 'ALLOC_NG_FLG'. (NullAllowed)
     */
    public String getAllocNgFlg() {
        return _allocNgFlg;
    }

    /**
     * [set] ALLOC_NG_FLG: {varchar(255)} <br>
     * 引当禁止フラグ
     * @param allocNgFlg The value of the column 'ALLOC_NG_FLG'. (NullAllowed)
     */
    public void setAllocNgFlg(String allocNgFlg) {
        __modifiedProperties.add("allocNgFlg");
        this._allocNgFlg = allocNgFlg;
    }

    /**
     * [get] RESTOCK_PRODUCT_CD: {varchar(255)} <br>
     * 補充商品CD
     * @return The value of the column 'RESTOCK_PRODUCT_CD'. (NullAllowed)
     */
    public String getRestockProductCd() {
        return _restockProductCd;
    }

    /**
     * [set] RESTOCK_PRODUCT_CD: {varchar(255)} <br>
     * 補充商品CD
     * @param restockProductCd The value of the column 'RESTOCK_PRODUCT_CD'. (NullAllowed)
     */
    public void setRestockProductCd(String restockProductCd) {
        __modifiedProperties.add("restockProductCd");
        this._restockProductCd = restockProductCd;
    }

    /**
     * [get] RESTOCK_STOCK_TYPE_CD: {varchar(255)} <br>
     * 補充在庫区分CD
     * @return The value of the column 'RESTOCK_STOCK_TYPE_CD'. (NullAllowed)
     */
    public String getRestockStockTypeCd() {
        return _restockStockTypeCd;
    }

    /**
     * [set] RESTOCK_STOCK_TYPE_CD: {varchar(255)} <br>
     * 補充在庫区分CD
     * @param restockStockTypeCd The value of the column 'RESTOCK_STOCK_TYPE_CD'. (NullAllowed)
     */
    public void setRestockStockTypeCd(String restockStockTypeCd) {
        __modifiedProperties.add("restockStockTypeCd");
        this._restockStockTypeCd = restockStockTypeCd;
    }

    /**
     * [get] RESTOCK_DEPOSIT_CD: {varchar(255)} <br>
     * 補充預託CD
     * @return The value of the column 'RESTOCK_DEPOSIT_CD'. (NullAllowed)
     */
    public String getRestockDepositCd() {
        return _restockDepositCd;
    }

    /**
     * [set] RESTOCK_DEPOSIT_CD: {varchar(255)} <br>
     * 補充預託CD
     * @param restockDepositCd The value of the column 'RESTOCK_DEPOSIT_CD'. (NullAllowed)
     */
    public void setRestockDepositCd(String restockDepositCd) {
        __modifiedProperties.add("restockDepositCd");
        this._restockDepositCd = restockDepositCd;
    }

    /**
     * [get] RESTOCK_SHAPE_CD: {varchar(255)} <br>
     * 補充点荷姿CD
     * @return The value of the column 'RESTOCK_SHAPE_CD'. (NullAllowed)
     */
    public String getRestockShapeCd() {
        return _restockShapeCd;
    }

    /**
     * [set] RESTOCK_SHAPE_CD: {varchar(255)} <br>
     * 補充点荷姿CD
     * @param restockShapeCd The value of the column 'RESTOCK_SHAPE_CD'. (NullAllowed)
     */
    public void setRestockShapeCd(String restockShapeCd) {
        __modifiedProperties.add("restockShapeCd");
        this._restockShapeCd = restockShapeCd;
    }

    /**
     * [get] RESTOCK_POINT_NUM: {varchar(255)} <br>
     * 補充点
     * @return The value of the column 'RESTOCK_POINT_NUM'. (NullAllowed)
     */
    public String getRestockPointNum() {
        return _restockPointNum;
    }

    /**
     * [set] RESTOCK_POINT_NUM: {varchar(255)} <br>
     * 補充点
     * @param restockPointNum The value of the column 'RESTOCK_POINT_NUM'. (NullAllowed)
     */
    public void setRestockPointNum(String restockPointNum) {
        __modifiedProperties.add("restockPointNum");
        this._restockPointNum = restockPointNum;
    }

    /**
     * [get] MAX_STORE_SHAPE_CD: {varchar(255)} <br>
     * 最大格納数商品荷姿CD
     * @return The value of the column 'MAX_STORE_SHAPE_CD'. (NullAllowed)
     */
    public String getMaxStoreShapeCd() {
        return _maxStoreShapeCd;
    }

    /**
     * [set] MAX_STORE_SHAPE_CD: {varchar(255)} <br>
     * 最大格納数商品荷姿CD
     * @param maxStoreShapeCd The value of the column 'MAX_STORE_SHAPE_CD'. (NullAllowed)
     */
    public void setMaxStoreShapeCd(String maxStoreShapeCd) {
        __modifiedProperties.add("maxStoreShapeCd");
        this._maxStoreShapeCd = maxStoreShapeCd;
    }

    /**
     * [get] MAX_STORE_NUM: {varchar(255)} <br>
     * 最大格納数
     * @return The value of the column 'MAX_STORE_NUM'. (NullAllowed)
     */
    public String getMaxStoreNum() {
        return _maxStoreNum;
    }

    /**
     * [set] MAX_STORE_NUM: {varchar(255)} <br>
     * 最大格納数
     * @param maxStoreNum The value of the column 'MAX_STORE_NUM'. (NullAllowed)
     */
    public void setMaxStoreNum(String maxStoreNum) {
        __modifiedProperties.add("maxStoreNum");
        this._maxStoreNum = maxStoreNum;
    }

    /**
     * [get] LINE_NO: {NotNull, bigint(19)} <br>
     * 行NO.
     * @return The value of the column 'LINE_NO'. (NullAllowed)
     */
    public Long getLineNo() {
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {NotNull, bigint(19)} <br>
     * 行NO.
     * @param lineNo The value of the column 'LINE_NO'. (NullAllowed)
     */
    public void setLineNo(Long lineNo) {
        __modifiedProperties.add("lineNo");
        this._lineNo = lineNo;
    }

    /**
     * [get] WORK_FLG: {char(1), default=[(0)]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {char(1), default=[(0)]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1), default=[(0)]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {char(1), default=[(0)]} <br>
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

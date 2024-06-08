package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRIMALLOC_H as TABLE. <br>
 * 山出し引当不能情報ヘッダ
 * <pre>
 * [primary-key]
 *     TRIMALLOC_H_ID
 *
 * [column]
 *     TRIMALLOC_H_ID, ALLOC_IMP_KEY, WAREHOUSECD, PRODUCT_CD, SHIPSCH_DATE, PICK_BATCH_KEY, RESTOCK_FLG, PRIORITIES, PICKADJUST_STS, ALCIMRSN_FLG, QTY_ADJUST_FLG, CENTER_ID, CLIENT_ID, RCV_STKEXA_DATE, STOCK_SHORTAGE_QTY, STOCK_SUM_QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOC_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     T_TRIMALLOCSCHKRI
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     tTrimallocschkriList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrimallocHDto implements Serializable {

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
    /** TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trimallocHId;

    /** ALLOC_IMP_KEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _allocImpKey;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** SHIPSCH_DATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _shipschDate;

    /** PICK_BATCH_KEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _pickBatchKey;

    /** RESTOCK_FLG: {varchar(30)} */
    @JsonKey
    protected String _restockFlg;

    /** PRIORITIES: {bigint(19)} */
    @JsonKey
    protected Long _priorities;

    /** PICKADJUST_STS: {bigint(19)} */
    @JsonKey
    protected Long _pickadjustSts;

    /** ALCIMRSN_FLG: {varchar(30)} */
    @JsonKey
    protected String _alcimrsnFlg;

    /** QTY_ADJUST_FLG: {char(1)} */
    @JsonKey
    protected String _qtyAdjustFlg;

    /** CENTER_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** RCV_STKEXA_DATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _rcvStkexaDate;

    /** STOCK_SHORTAGE_QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _stockShortageQty;

    /** STOCK_SUM_QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _stockSumQty;

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
    public BsTTrimallocHDto() {
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
    protected List<TTrimallocschkriDto> _tTrimallocschkriList;

    public List<TTrimallocschkriDto> getTTrimallocschkriList() {
        if (_tTrimallocschkriList == null) { _tTrimallocschkriList = new ArrayList<TTrimallocschkriDto>(); }
        return _tTrimallocschkriList;
    }

    public void setTTrimallocschkriList(List<TTrimallocschkriDto> tTrimallocschkriList) {
        this._tTrimallocschkriList = tTrimallocschkriList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrimallocHDto)) { return false; }
        final BsTTrimallocHDto otherEntity = (BsTTrimallocHDto)other;
        if (!helpComparingValue(getTrimallocHId(), otherEntity.getTrimallocHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRIMALLOC_H");
        result = xCH(result, getTrimallocHId());
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
        sb.append(c).append(getTrimallocHId());
        sb.append(c).append(getAllocImpKey());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getShipschDate());
        sb.append(c).append(getPickBatchKey());
        sb.append(c).append(getRestockFlg());
        sb.append(c).append(getPriorities());
        sb.append(c).append(getPickadjustSts());
        sb.append(c).append(getAlcimrsnFlg());
        sb.append(c).append(getQtyAdjustFlg());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getRcvStkexaDate());
        sb.append(c).append(getStockShortageQty());
        sb.append(c).append(getStockSumQty());
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
     * [get] TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し引当不能情報ヘッダID
     * @return The value of the column 'TRIMALLOC_H_ID'. (NullAllowed)
     */
    public Long getTrimallocHId() {
        return _trimallocHId;
    }

    /**
     * [set] TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し引当不能情報ヘッダID
     * @param trimallocHId The value of the column 'TRIMALLOC_H_ID'. (NullAllowed)
     */
    public void setTrimallocHId(Long trimallocHId) {
        __modifiedProperties.add("trimallocHId");
        this._trimallocHId = trimallocHId;
    }

    /**
     * [get] ALLOC_IMP_KEY: {NotNull, bigint(19)} <br>
     * 引当不能キー
     * @return The value of the column 'ALLOC_IMP_KEY'. (NullAllowed)
     */
    public Long getAllocImpKey() {
        return _allocImpKey;
    }

    /**
     * [set] ALLOC_IMP_KEY: {NotNull, bigint(19)} <br>
     * 引当不能キー
     * @param allocImpKey The value of the column 'ALLOC_IMP_KEY'. (NullAllowed)
     */
    public void setAllocImpKey(Long allocImpKey) {
        __modifiedProperties.add("allocImpKey");
        this._allocImpKey = allocImpKey;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] SHIPSCH_DATE: {NotNull, varchar(8)} <br>
     * 山出し日
     * @return The value of the column 'SHIPSCH_DATE'. (NullAllowed)
     */
    public String getShipschDate() {
        return _shipschDate;
    }

    /**
     * [set] SHIPSCH_DATE: {NotNull, varchar(8)} <br>
     * 山出し日
     * @param shipschDate The value of the column 'SHIPSCH_DATE'. (NullAllowed)
     */
    public void setShipschDate(String shipschDate) {
        __modifiedProperties.add("shipschDate");
        this._shipschDate = shipschDate;
    }

    /**
     * [get] PICK_BATCH_KEY: {NotNull, bigint(19)} <br>
     * 引当バッチキー
     * @return The value of the column 'PICK_BATCH_KEY'. (NullAllowed)
     */
    public Long getPickBatchKey() {
        return _pickBatchKey;
    }

    /**
     * [set] PICK_BATCH_KEY: {NotNull, bigint(19)} <br>
     * 引当バッチキー
     * @param pickBatchKey The value of the column 'PICK_BATCH_KEY'. (NullAllowed)
     */
    public void setPickBatchKey(Long pickBatchKey) {
        __modifiedProperties.add("pickBatchKey");
        this._pickBatchKey = pickBatchKey;
    }

    /**
     * [get] RESTOCK_FLG: {varchar(30)} <br>
     * 補充区分
     * @return The value of the column 'RESTOCK_FLG'. (NullAllowed)
     */
    public String getRestockFlg() {
        return _restockFlg;
    }

    /**
     * [set] RESTOCK_FLG: {varchar(30)} <br>
     * 補充区分
     * @param restockFlg The value of the column 'RESTOCK_FLG'. (NullAllowed)
     */
    public void setRestockFlg(String restockFlg) {
        __modifiedProperties.add("restockFlg");
        this._restockFlg = restockFlg;
    }

    /**
     * [get] PRIORITIES: {bigint(19)} <br>
     * 補充回数
     * @return The value of the column 'PRIORITIES'. (NullAllowed)
     */
    public Long getPriorities() {
        return _priorities;
    }

    /**
     * [set] PRIORITIES: {bigint(19)} <br>
     * 補充回数
     * @param priorities The value of the column 'PRIORITIES'. (NullAllowed)
     */
    public void setPriorities(Long priorities) {
        __modifiedProperties.add("priorities");
        this._priorities = priorities;
    }

    /**
     * [get] PICKADJUST_STS: {bigint(19)} <br>
     * 引当調整ステータス
     * @return The value of the column 'PICKADJUST_STS'. (NullAllowed)
     */
    public Long getPickadjustSts() {
        return _pickadjustSts;
    }

    /**
     * [set] PICKADJUST_STS: {bigint(19)} <br>
     * 引当調整ステータス
     * @param pickadjustSts The value of the column 'PICKADJUST_STS'. (NullAllowed)
     */
    public void setPickadjustSts(Long pickadjustSts) {
        __modifiedProperties.add("pickadjustSts");
        this._pickadjustSts = pickadjustSts;
    }

    /**
     * [get] ALCIMRSN_FLG: {varchar(30)} <br>
     * 引当不能理由区分
     * @return The value of the column 'ALCIMRSN_FLG'. (NullAllowed)
     */
    public String getAlcimrsnFlg() {
        return _alcimrsnFlg;
    }

    /**
     * [set] ALCIMRSN_FLG: {varchar(30)} <br>
     * 引当不能理由区分
     * @param alcimrsnFlg The value of the column 'ALCIMRSN_FLG'. (NullAllowed)
     */
    public void setAlcimrsnFlg(String alcimrsnFlg) {
        __modifiedProperties.add("alcimrsnFlg");
        this._alcimrsnFlg = alcimrsnFlg;
    }

    /**
     * [get] QTY_ADJUST_FLG: {char(1)} <br>
     * 数量調整未済フラグ
     * @return The value of the column 'QTY_ADJUST_FLG'. (NullAllowed)
     */
    public String getQtyAdjustFlg() {
        return _qtyAdjustFlg;
    }

    /**
     * [set] QTY_ADJUST_FLG: {char(1)} <br>
     * 数量調整未済フラグ
     * @param qtyAdjustFlg The value of the column 'QTY_ADJUST_FLG'. (NullAllowed)
     */
    public void setQtyAdjustFlg(String qtyAdjustFlg) {
        __modifiedProperties.add("qtyAdjustFlg");
        this._qtyAdjustFlg = qtyAdjustFlg;
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
     * [get] RCV_STKEXA_DATE: {NotNull, varchar(8)} <br>
     * 引取場製造年月日
     * @return The value of the column 'RCV_STKEXA_DATE'. (NullAllowed)
     */
    public String getRcvStkexaDate() {
        return _rcvStkexaDate;
    }

    /**
     * [set] RCV_STKEXA_DATE: {NotNull, varchar(8)} <br>
     * 引取場製造年月日
     * @param rcvStkexaDate The value of the column 'RCV_STKEXA_DATE'. (NullAllowed)
     */
    public void setRcvStkexaDate(String rcvStkexaDate) {
        __modifiedProperties.add("rcvStkexaDate");
        this._rcvStkexaDate = rcvStkexaDate;
    }

    /**
     * [get] STOCK_SHORTAGE_QTY: {NotNull, bigint(19)} <br>
     * 在庫不足数量(個装)
     * @return The value of the column 'STOCK_SHORTAGE_QTY'. (NullAllowed)
     */
    public Long getStockShortageQty() {
        return _stockShortageQty;
    }

    /**
     * [set] STOCK_SHORTAGE_QTY: {NotNull, bigint(19)} <br>
     * 在庫不足数量(個装)
     * @param stockShortageQty The value of the column 'STOCK_SHORTAGE_QTY'. (NullAllowed)
     */
    public void setStockShortageQty(Long stockShortageQty) {
        __modifiedProperties.add("stockShortageQty");
        this._stockShortageQty = stockShortageQty;
    }

    /**
     * [get] STOCK_SUM_QTY: {NotNull, bigint(19)} <br>
     * 保管場在庫数量(個装)
     * @return The value of the column 'STOCK_SUM_QTY'. (NullAllowed)
     */
    public Long getStockSumQty() {
        return _stockSumQty;
    }

    /**
     * [set] STOCK_SUM_QTY: {NotNull, bigint(19)} <br>
     * 保管場在庫数量(個装)
     * @param stockSumQty The value of the column 'STOCK_SUM_QTY'. (NullAllowed)
     */
    public void setStockSumQty(Long stockSumQty) {
        __modifiedProperties.add("stockSumQty");
        this._stockSumQty = stockSumQty;
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

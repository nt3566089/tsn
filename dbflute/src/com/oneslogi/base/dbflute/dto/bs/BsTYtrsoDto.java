package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_YTRSO as TABLE. <br>
 * 山出し指示ヘッダ
 * <pre>
 * [primary-key]
 *     TRSR_ID
 *
 * [column]
 *     TRSR_ID, CENTER_ID, CLIENT_ID, SO_KEY, SR_STATUS, RESTOCK_NUMBER, RESTOCK_KBN, SORTING_RACK_NO, RESTOCK_SORT_KEY, SHIP_SCH_DATE, SHIP_DATE, CENTER_CD, SORT_RESTOCK_FLG, DELIVERY_CENTER_CD, LINE_BLOCK, DELIVERY_DIRECTION, PICK_BATCH_KEY, PICKLIST_COMMENT, FROM_PICKLIST_NO, TO_PICKLIST_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSR_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CLIENT, M_CENTER
 *
 * [referrer-table]
 *     T_YTRSODETAIL
 *
 * [foreign-property]
 *     mClient, mCenter
 *
 * [referrer-property]
 *     tYtrsodetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTYtrsoDto implements Serializable {

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
    /** TRSR_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trsrId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** SO_KEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _soKey;

    /** SR_STATUS: {IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _srStatus;

    /** RESTOCK_NUMBER: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _restockNumber;

    /** RESTOCK_KBN: {varchar(30)} */
    @JsonKey
    protected String _restockKbn;

    /** SORTING_RACK_NO: {varchar(30)} */
    @JsonKey
    protected String _sortingRackNo;

    /** RESTOCK_SORT_KEY: {varchar(30)} */
    @JsonKey
    protected String _restockSortKey;

    /** SHIP_SCH_DATE: {IX, NotNull, varchar(8)} */
    @JsonKey
    protected String _shipSchDate;

    /** SHIP_DATE: {IX, varchar(8)} */
    @JsonKey
    protected String _shipDate;

    /** CENTER_CD: {IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** SORT_RESTOCK_FLG: {varchar(30)} */
    @JsonKey
    protected String _sortRestockFlg;

    /** DELIVERY_CENTER_CD: {varchar(255)} */
    @JsonKey
    protected String _deliveryCenterCd;

    /** LINE_BLOCK: {varchar(30)} */
    @JsonKey
    protected String _lineBlock;

    /** DELIVERY_DIRECTION: {varchar(30)} */
    @JsonKey
    protected String _deliveryDirection;

    /** PICK_BATCH_KEY: {IX, bigint(19)} */
    @JsonKey
    protected Long _pickBatchKey;

    /** PICKLIST_COMMENT: {varchar(30)} */
    @JsonKey
    protected String _picklistComment;

    /** FROM_PICKLIST_NO: {IX, bigint(19)} */
    @JsonKey
    protected Long _fromPicklistNo;

    /** TO_PICKLIST_NO: {IX, bigint(19)} */
    @JsonKey
    protected Long _toPicklistNo;

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
    public BsTYtrsoDto() {
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
    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TYtrsodetailDto> _tYtrsodetailList;

    public List<TYtrsodetailDto> getTYtrsodetailList() {
        if (_tYtrsodetailList == null) { _tYtrsodetailList = new ArrayList<TYtrsodetailDto>(); }
        return _tYtrsodetailList;
    }

    public void setTYtrsodetailList(List<TYtrsodetailDto> tYtrsodetailList) {
        this._tYtrsodetailList = tYtrsodetailList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTYtrsoDto)) { return false; }
        final BsTYtrsoDto otherEntity = (BsTYtrsoDto)other;
        if (!helpComparingValue(getTrsrId(), otherEntity.getTrsrId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_YTRSO");
        result = xCH(result, getTrsrId());
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
        sb.append(c).append(getTrsrId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getSoKey());
        sb.append(c).append(getSrStatus());
        sb.append(c).append(getRestockNumber());
        sb.append(c).append(getRestockKbn());
        sb.append(c).append(getSortingRackNo());
        sb.append(c).append(getRestockSortKey());
        sb.append(c).append(getShipSchDate());
        sb.append(c).append(getShipDate());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getSortRestockFlg());
        sb.append(c).append(getDeliveryCenterCd());
        sb.append(c).append(getLineBlock());
        sb.append(c).append(getDeliveryDirection());
        sb.append(c).append(getPickBatchKey());
        sb.append(c).append(getPicklistComment());
        sb.append(c).append(getFromPicklistNo());
        sb.append(c).append(getToPicklistNo());
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
     * [get] TRSR_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し指示ヘッダID
     * @return The value of the column 'TRSR_ID'. (NullAllowed)
     */
    public Long getTrsrId() {
        return _trsrId;
    }

    /**
     * [set] TRSR_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し指示ヘッダID
     * @param trsrId The value of the column 'TRSR_ID'. (NullAllowed)
     */
    public void setTrsrId(Long trsrId) {
        __modifiedProperties.add("trsrId");
        this._trsrId = trsrId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] SO_KEY: {NotNull, bigint(19)} <br>
     * 山出し指示キー
     * @return The value of the column 'SO_KEY'. (NullAllowed)
     */
    public Long getSoKey() {
        return _soKey;
    }

    /**
     * [set] SO_KEY: {NotNull, bigint(19)} <br>
     * 山出し指示キー
     * @param soKey The value of the column 'SO_KEY'. (NullAllowed)
     */
    public void setSoKey(Long soKey) {
        __modifiedProperties.add("soKey");
        this._soKey = soKey;
    }

    /**
     * [get] SR_STATUS: {IX, NotNull, varchar(30)} <br>
     * 山出しステータス
     * @return The value of the column 'SR_STATUS'. (NullAllowed)
     */
    public String getSrStatus() {
        return _srStatus;
    }

    /**
     * [set] SR_STATUS: {IX, NotNull, varchar(30)} <br>
     * 山出しステータス
     * @param srStatus The value of the column 'SR_STATUS'. (NullAllowed)
     */
    public void setSrStatus(String srStatus) {
        __modifiedProperties.add("srStatus");
        this._srStatus = srStatus;
    }

    /**
     * [get] RESTOCK_NUMBER: {bigint(19), default=[(0)]} <br>
     * 補充回数
     * @return The value of the column 'RESTOCK_NUMBER'. (NullAllowed)
     */
    public Long getRestockNumber() {
        return _restockNumber;
    }

    /**
     * [set] RESTOCK_NUMBER: {bigint(19), default=[(0)]} <br>
     * 補充回数
     * @param restockNumber The value of the column 'RESTOCK_NUMBER'. (NullAllowed)
     */
    public void setRestockNumber(Long restockNumber) {
        __modifiedProperties.add("restockNumber");
        this._restockNumber = restockNumber;
    }

    /**
     * [get] RESTOCK_KBN: {varchar(30)} <br>
     * 補充区分
     * @return The value of the column 'RESTOCK_KBN'. (NullAllowed)
     */
    public String getRestockKbn() {
        return _restockKbn;
    }

    /**
     * [set] RESTOCK_KBN: {varchar(30)} <br>
     * 補充区分
     * @param restockKbn The value of the column 'RESTOCK_KBN'. (NullAllowed)
     */
    public void setRestockKbn(String restockKbn) {
        __modifiedProperties.add("restockKbn");
        this._restockKbn = restockKbn;
    }

    /**
     * [get] SORTING_RACK_NO: {varchar(30)} <br>
     * 仕分ラック番号
     * @return The value of the column 'SORTING_RACK_NO'. (NullAllowed)
     */
    public String getSortingRackNo() {
        return _sortingRackNo;
    }

    /**
     * [set] SORTING_RACK_NO: {varchar(30)} <br>
     * 仕分ラック番号
     * @param sortingRackNo The value of the column 'SORTING_RACK_NO'. (NullAllowed)
     */
    public void setSortingRackNo(String sortingRackNo) {
        __modifiedProperties.add("sortingRackNo");
        this._sortingRackNo = sortingRackNo;
    }

    /**
     * [get] RESTOCK_SORT_KEY: {varchar(30)} <br>
     * 補充先ソートキー
     * @return The value of the column 'RESTOCK_SORT_KEY'. (NullAllowed)
     */
    public String getRestockSortKey() {
        return _restockSortKey;
    }

    /**
     * [set] RESTOCK_SORT_KEY: {varchar(30)} <br>
     * 補充先ソートキー
     * @param restockSortKey The value of the column 'RESTOCK_SORT_KEY'. (NullAllowed)
     */
    public void setRestockSortKey(String restockSortKey) {
        __modifiedProperties.add("restockSortKey");
        this._restockSortKey = restockSortKey;
    }

    /**
     * [get] SHIP_SCH_DATE: {IX, NotNull, varchar(8)} <br>
     * 山出し日
     * @return The value of the column 'SHIP_SCH_DATE'. (NullAllowed)
     */
    public String getShipSchDate() {
        return _shipSchDate;
    }

    /**
     * [set] SHIP_SCH_DATE: {IX, NotNull, varchar(8)} <br>
     * 山出し日
     * @param shipSchDate The value of the column 'SHIP_SCH_DATE'. (NullAllowed)
     */
    public void setShipSchDate(String shipSchDate) {
        __modifiedProperties.add("shipSchDate");
        this._shipSchDate = shipSchDate;
    }

    /**
     * [get] SHIP_DATE: {IX, varchar(8)} <br>
     * 山出し実績日
     * @return The value of the column 'SHIP_DATE'. (NullAllowed)
     */
    public String getShipDate() {
        return _shipDate;
    }

    /**
     * [set] SHIP_DATE: {IX, varchar(8)} <br>
     * 山出し実績日
     * @param shipDate The value of the column 'SHIP_DATE'. (NullAllowed)
     */
    public void setShipDate(String shipDate) {
        __modifiedProperties.add("shipDate");
        this._shipDate = shipDate;
    }

    /**
     * [get] CENTER_CD: {IX, NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {IX, NotNull, varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] SORT_RESTOCK_FLG: {varchar(30)} <br>
     * ソート用補充区分
     * @return The value of the column 'SORT_RESTOCK_FLG'. (NullAllowed)
     */
    public String getSortRestockFlg() {
        return _sortRestockFlg;
    }

    /**
     * [set] SORT_RESTOCK_FLG: {varchar(30)} <br>
     * ソート用補充区分
     * @param sortRestockFlg The value of the column 'SORT_RESTOCK_FLG'. (NullAllowed)
     */
    public void setSortRestockFlg(String sortRestockFlg) {
        __modifiedProperties.add("sortRestockFlg");
        this._sortRestockFlg = sortRestockFlg;
    }

    /**
     * [get] DELIVERY_CENTER_CD: {varchar(255)} <br>
     * 配達拠点CD
     * @return The value of the column 'DELIVERY_CENTER_CD'. (NullAllowed)
     */
    public String getDeliveryCenterCd() {
        return _deliveryCenterCd;
    }

    /**
     * [set] DELIVERY_CENTER_CD: {varchar(255)} <br>
     * 配達拠点CD
     * @param deliveryCenterCd The value of the column 'DELIVERY_CENTER_CD'. (NullAllowed)
     */
    public void setDeliveryCenterCd(String deliveryCenterCd) {
        __modifiedProperties.add("deliveryCenterCd");
        this._deliveryCenterCd = deliveryCenterCd;
    }

    /**
     * [get] LINE_BLOCK: {varchar(30)} <br>
     * 補充先
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public String getLineBlock() {
        return _lineBlock;
    }

    /**
     * [set] LINE_BLOCK: {varchar(30)} <br>
     * 補充先
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public void setLineBlock(String lineBlock) {
        __modifiedProperties.add("lineBlock");
        this._lineBlock = lineBlock;
    }

    /**
     * [get] DELIVERY_DIRECTION: {varchar(30)} <br>
     * 配達方面
     * @return The value of the column 'DELIVERY_DIRECTION'. (NullAllowed)
     */
    public String getDeliveryDirection() {
        return _deliveryDirection;
    }

    /**
     * [set] DELIVERY_DIRECTION: {varchar(30)} <br>
     * 配達方面
     * @param deliveryDirection The value of the column 'DELIVERY_DIRECTION'. (NullAllowed)
     */
    public void setDeliveryDirection(String deliveryDirection) {
        __modifiedProperties.add("deliveryDirection");
        this._deliveryDirection = deliveryDirection;
    }

    /**
     * [get] PICK_BATCH_KEY: {IX, bigint(19)} <br>
     * 引当バッチキー
     * @return The value of the column 'PICK_BATCH_KEY'. (NullAllowed)
     */
    public Long getPickBatchKey() {
        return _pickBatchKey;
    }

    /**
     * [set] PICK_BATCH_KEY: {IX, bigint(19)} <br>
     * 引当バッチキー
     * @param pickBatchKey The value of the column 'PICK_BATCH_KEY'. (NullAllowed)
     */
    public void setPickBatchKey(Long pickBatchKey) {
        __modifiedProperties.add("pickBatchKey");
        this._pickBatchKey = pickBatchKey;
    }

    /**
     * [get] PICKLIST_COMMENT: {varchar(30)} <br>
     * 山出しリストコメント
     * @return The value of the column 'PICKLIST_COMMENT'. (NullAllowed)
     */
    public String getPicklistComment() {
        return _picklistComment;
    }

    /**
     * [set] PICKLIST_COMMENT: {varchar(30)} <br>
     * 山出しリストコメント
     * @param picklistComment The value of the column 'PICKLIST_COMMENT'. (NullAllowed)
     */
    public void setPicklistComment(String picklistComment) {
        __modifiedProperties.add("picklistComment");
        this._picklistComment = picklistComment;
    }

    /**
     * [get] FROM_PICKLIST_NO: {IX, bigint(19)} <br>
     * FROM山出しリストNo.
     * @return The value of the column 'FROM_PICKLIST_NO'. (NullAllowed)
     */
    public Long getFromPicklistNo() {
        return _fromPicklistNo;
    }

    /**
     * [set] FROM_PICKLIST_NO: {IX, bigint(19)} <br>
     * FROM山出しリストNo.
     * @param fromPicklistNo The value of the column 'FROM_PICKLIST_NO'. (NullAllowed)
     */
    public void setFromPicklistNo(Long fromPicklistNo) {
        __modifiedProperties.add("fromPicklistNo");
        this._fromPicklistNo = fromPicklistNo;
    }

    /**
     * [get] TO_PICKLIST_NO: {IX, bigint(19)} <br>
     * TO山出しリストNo.
     * @return The value of the column 'TO_PICKLIST_NO'. (NullAllowed)
     */
    public Long getToPicklistNo() {
        return _toPicklistNo;
    }

    /**
     * [set] TO_PICKLIST_NO: {IX, bigint(19)} <br>
     * TO山出しリストNo.
     * @param toPicklistNo The value of the column 'TO_PICKLIST_NO'. (NullAllowed)
     */
    public void setToPicklistNo(Long toPicklistNo) {
        __modifiedProperties.add("toPicklistNo");
        this._toPicklistNo = toPicklistNo;
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

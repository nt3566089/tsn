package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_CENTER_STOCK_INFO_SEND as TABLE. <br>
 * 拠点別在庫情報送信テーブル(国産)
 * <pre>
 * [primary-key]
 *     CENTER_STOCK_INFO_SEND_ID
 *
 * [column]
 *     CENTER_STOCK_INFO_SEND_ID, SEQNO, PROCESS_DT, WAREHOUSE_CD, WAREHOUSE_NAME, ITEM_CD, ITEM_NAME, LIMIT_DATE, DESIGN_CD, INV_TYPE, INV_NUM, TRANSPORT_CD, FIRMTRANSPORT_CD, SOURCE_CD, SOURCE_NAME, SCH_DATE, RECEIVE_DATE, SCHRECEIVE_DATE, SCHRECEIVE_NUM, TRANSPORT_PRIORITY, ITEM_SORT, USE_TYPE, SEND_CD, SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_STOCK_INFO_SEND_ID
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
public abstract class BsECenterStockInfoSendDto implements Serializable {

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
    /** CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _centerStockInfoSendId;

    /** SEQNO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _seqno;

    /** PROCESS_DT: {NotNull, varchar(8)} */
    @JsonKey
    protected String _processDt;

    /** WAREHOUSE_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehouseCd;

    /** WAREHOUSE_NAME: {NotNull, varchar(60)} */
    @JsonKey
    protected String _warehouseName;

    /** ITEM_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _itemCd;

    /** ITEM_NAME: {NotNull, varchar(60)} */
    @JsonKey
    protected String _itemName;

    /** LIMIT_DATE: {varchar(8)} */
    @JsonKey
    protected String _limitDate;

    /** DESIGN_CD: {varchar(30)} */
    @JsonKey
    protected String _designCd;

    /** INV_TYPE: {NotNull, varchar(60)} */
    @JsonKey
    protected String _invType;

    /** INV_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _invNum;

    /** TRANSPORT_CD: {varchar(30)} */
    @JsonKey
    protected String _transportCd;

    /** FIRMTRANSPORT_CD: {varchar(30)} */
    @JsonKey
    protected String _firmtransportCd;

    /** SOURCE_CD: {varchar(30)} */
    @JsonKey
    protected String _sourceCd;

    /** SOURCE_NAME: {varchar(100)} */
    @JsonKey
    protected String _sourceName;

    /** SCH_DATE: {varchar(8)} */
    @JsonKey
    protected String _schDate;

    /** RECEIVE_DATE: {varchar(8)} */
    @JsonKey
    protected String _receiveDate;

    /** SCHRECEIVE_DATE: {varchar(8)} */
    @JsonKey
    protected String _schreceiveDate;

    /** SCHRECEIVE_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _schreceiveNum;

    /** TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _transportPriority;

    /** ITEM_SORT: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _itemSort;

    /** USE_TYPE: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _useType;

    /** SEND_CD: {varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** SEND_FLG: {char(1)} */
    @JsonKey
    protected String _sendFlg;

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
    public BsECenterStockInfoSendDto() {
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
        if (other == null || !(other instanceof BsECenterStockInfoSendDto)) { return false; }
        final BsECenterStockInfoSendDto otherEntity = (BsECenterStockInfoSendDto)other;
        if (!helpComparingValue(getCenterStockInfoSendId(), otherEntity.getCenterStockInfoSendId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_CENTER_STOCK_INFO_SEND");
        result = xCH(result, getCenterStockInfoSendId());
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
        sb.append(c).append(getCenterStockInfoSendId());
        sb.append(c).append(getSeqno());
        sb.append(c).append(getProcessDt());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getWarehouseName());
        sb.append(c).append(getItemCd());
        sb.append(c).append(getItemName());
        sb.append(c).append(getLimitDate());
        sb.append(c).append(getDesignCd());
        sb.append(c).append(getInvType());
        sb.append(c).append(getInvNum());
        sb.append(c).append(getTransportCd());
        sb.append(c).append(getFirmtransportCd());
        sb.append(c).append(getSourceCd());
        sb.append(c).append(getSourceName());
        sb.append(c).append(getSchDate());
        sb.append(c).append(getReceiveDate());
        sb.append(c).append(getSchreceiveDate());
        sb.append(c).append(getSchreceiveNum());
        sb.append(c).append(getTransportPriority());
        sb.append(c).append(getItemSort());
        sb.append(c).append(getUseType());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getSendFlg());
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
     * [get] CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点別在庫情報送信(国産)ID
     * @return The value of the column 'CENTER_STOCK_INFO_SEND_ID'. (NullAllowed)
     */
    public Long getCenterStockInfoSendId() {
        return _centerStockInfoSendId;
    }

    /**
     * [set] CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点別在庫情報送信(国産)ID
     * @param centerStockInfoSendId The value of the column 'CENTER_STOCK_INFO_SEND_ID'. (NullAllowed)
     */
    public void setCenterStockInfoSendId(Long centerStockInfoSendId) {
        __modifiedProperties.add("centerStockInfoSendId");
        this._centerStockInfoSendId = centerStockInfoSendId;
    }

    /**
     * [get] SEQNO: {NotNull, bigint(19)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQNO'. (NullAllowed)
     */
    public Long getSeqno() {
        return _seqno;
    }

    /**
     * [set] SEQNO: {NotNull, bigint(19)} <br>
     * シーケンス番号
     * @param seqno The value of the column 'SEQNO'. (NullAllowed)
     */
    public void setSeqno(Long seqno) {
        __modifiedProperties.add("seqno");
        this._seqno = seqno;
    }

    /**
     * [get] PROCESS_DT: {NotNull, varchar(8)} <br>
     * 処理日
     * @return The value of the column 'PROCESS_DT'. (NullAllowed)
     */
    public String getProcessDt() {
        return _processDt;
    }

    /**
     * [set] PROCESS_DT: {NotNull, varchar(8)} <br>
     * 処理日
     * @param processDt The value of the column 'PROCESS_DT'. (NullAllowed)
     */
    public void setProcessDt(String processDt) {
        __modifiedProperties.add("processDt");
        this._processDt = processDt;
    }

    /**
     * [get] WAREHOUSE_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] WAREHOUSE_NAME: {NotNull, varchar(60)} <br>
     * 拠点名称
     * @return The value of the column 'WAREHOUSE_NAME'. (NullAllowed)
     */
    public String getWarehouseName() {
        return _warehouseName;
    }

    /**
     * [set] WAREHOUSE_NAME: {NotNull, varchar(60)} <br>
     * 拠点名称
     * @param warehouseName The value of the column 'WAREHOUSE_NAME'. (NullAllowed)
     */
    public void setWarehouseName(String warehouseName) {
        __modifiedProperties.add("warehouseName");
        this._warehouseName = warehouseName;
    }

    /**
     * [get] ITEM_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'ITEM_CD'. (NullAllowed)
     */
    public String getItemCd() {
        return _itemCd;
    }

    /**
     * [set] ITEM_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param itemCd The value of the column 'ITEM_CD'. (NullAllowed)
     */
    public void setItemCd(String itemCd) {
        __modifiedProperties.add("itemCd");
        this._itemCd = itemCd;
    }

    /**
     * [get] ITEM_NAME: {NotNull, varchar(60)} <br>
     * 銘柄名称
     * @return The value of the column 'ITEM_NAME'. (NullAllowed)
     */
    public String getItemName() {
        return _itemName;
    }

    /**
     * [set] ITEM_NAME: {NotNull, varchar(60)} <br>
     * 銘柄名称
     * @param itemName The value of the column 'ITEM_NAME'. (NullAllowed)
     */
    public void setItemName(String itemName) {
        __modifiedProperties.add("itemName");
        this._itemName = itemName;
    }

    /**
     * [get] LIMIT_DATE: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LIMIT_DATE'. (NullAllowed)
     */
    public String getLimitDate() {
        return _limitDate;
    }

    /**
     * [set] LIMIT_DATE: {varchar(8)} <br>
     * 製造年月日
     * @param limitDate The value of the column 'LIMIT_DATE'. (NullAllowed)
     */
    public void setLimitDate(String limitDate) {
        __modifiedProperties.add("limitDate");
        this._limitDate = limitDate;
    }

    /**
     * [get] DESIGN_CD: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_CD'. (NullAllowed)
     */
    public String getDesignCd() {
        return _designCd;
    }

    /**
     * [set] DESIGN_CD: {varchar(30)} <br>
     * デザイン区分
     * @param designCd The value of the column 'DESIGN_CD'. (NullAllowed)
     */
    public void setDesignCd(String designCd) {
        __modifiedProperties.add("designCd");
        this._designCd = designCd;
    }

    /**
     * [get] INV_TYPE: {NotNull, varchar(60)} <br>
     * 在庫区分
     * @return The value of the column 'INV_TYPE'. (NullAllowed)
     */
    public String getInvType() {
        return _invType;
    }

    /**
     * [set] INV_TYPE: {NotNull, varchar(60)} <br>
     * 在庫区分
     * @param invType The value of the column 'INV_TYPE'. (NullAllowed)
     */
    public void setInvType(String invType) {
        __modifiedProperties.add("invType");
        this._invType = invType;
    }

    /**
     * [get] INV_NUM: {decimal(16, 6)} <br>
     * 在庫数量
     * @return The value of the column 'INV_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInvNum() {
        return _invNum;
    }

    /**
     * [set] INV_NUM: {decimal(16, 6)} <br>
     * 在庫数量
     * @param invNum The value of the column 'INV_NUM'. (NullAllowed)
     */
    public void setInvNum(java.math.BigDecimal invNum) {
        __modifiedProperties.add("invNum");
        this._invNum = invNum;
    }

    /**
     * [get] TRANSPORT_CD: {varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORT_CD'. (NullAllowed)
     */
    public String getTransportCd() {
        return _transportCd;
    }

    /**
     * [set] TRANSPORT_CD: {varchar(30)} <br>
     * 輸送番号
     * @param transportCd The value of the column 'TRANSPORT_CD'. (NullAllowed)
     */
    public void setTransportCd(String transportCd) {
        __modifiedProperties.add("transportCd");
        this._transportCd = transportCd;
    }

    /**
     * [get] FIRMTRANSPORT_CD: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMTRANSPORT_CD'. (NullAllowed)
     */
    public String getFirmtransportCd() {
        return _firmtransportCd;
    }

    /**
     * [set] FIRMTRANSPORT_CD: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmtransportCd The value of the column 'FIRMTRANSPORT_CD'. (NullAllowed)
     */
    public void setFirmtransportCd(String firmtransportCd) {
        __modifiedProperties.add("firmtransportCd");
        this._firmtransportCd = firmtransportCd;
    }

    /**
     * [get] SOURCE_CD: {varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SOURCE_CD'. (NullAllowed)
     */
    public String getSourceCd() {
        return _sourceCd;
    }

    /**
     * [set] SOURCE_CD: {varchar(30)} <br>
     * 発送元CD
     * @param sourceCd The value of the column 'SOURCE_CD'. (NullAllowed)
     */
    public void setSourceCd(String sourceCd) {
        __modifiedProperties.add("sourceCd");
        this._sourceCd = sourceCd;
    }

    /**
     * [get] SOURCE_NAME: {varchar(100)} <br>
     * 発送元名称
     * @return The value of the column 'SOURCE_NAME'. (NullAllowed)
     */
    public String getSourceName() {
        return _sourceName;
    }

    /**
     * [set] SOURCE_NAME: {varchar(100)} <br>
     * 発送元名称
     * @param sourceName The value of the column 'SOURCE_NAME'. (NullAllowed)
     */
    public void setSourceName(String sourceName) {
        __modifiedProperties.add("sourceName");
        this._sourceName = sourceName;
    }

    /**
     * [get] SCH_DATE: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SCH_DATE'. (NullAllowed)
     */
    public String getSchDate() {
        return _schDate;
    }

    /**
     * [set] SCH_DATE: {varchar(8)} <br>
     * 発送予定日
     * @param schDate The value of the column 'SCH_DATE'. (NullAllowed)
     */
    public void setSchDate(String schDate) {
        __modifiedProperties.add("schDate");
        this._schDate = schDate;
    }

    /**
     * [get] RECEIVE_DATE: {varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'RECEIVE_DATE'. (NullAllowed)
     */
    public String getReceiveDate() {
        return _receiveDate;
    }

    /**
     * [set] RECEIVE_DATE: {varchar(8)} <br>
     * 入庫日
     * @param receiveDate The value of the column 'RECEIVE_DATE'. (NullAllowed)
     */
    public void setReceiveDate(String receiveDate) {
        __modifiedProperties.add("receiveDate");
        this._receiveDate = receiveDate;
    }

    /**
     * [get] SCHRECEIVE_DATE: {varchar(8)} <br>
     * 入庫予定日
     * @return The value of the column 'SCHRECEIVE_DATE'. (NullAllowed)
     */
    public String getSchreceiveDate() {
        return _schreceiveDate;
    }

    /**
     * [set] SCHRECEIVE_DATE: {varchar(8)} <br>
     * 入庫予定日
     * @param schreceiveDate The value of the column 'SCHRECEIVE_DATE'. (NullAllowed)
     */
    public void setSchreceiveDate(String schreceiveDate) {
        __modifiedProperties.add("schreceiveDate");
        this._schreceiveDate = schreceiveDate;
    }

    /**
     * [get] SCHRECEIVE_NUM: {decimal(16, 6)} <br>
     * 受入予定数量
     * @return The value of the column 'SCHRECEIVE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getSchreceiveNum() {
        return _schreceiveNum;
    }

    /**
     * [set] SCHRECEIVE_NUM: {decimal(16, 6)} <br>
     * 受入予定数量
     * @param schreceiveNum The value of the column 'SCHRECEIVE_NUM'. (NullAllowed)
     */
    public void setSchreceiveNum(java.math.BigDecimal schreceiveNum) {
        __modifiedProperties.add("schreceiveNum");
        this._schreceiveNum = schreceiveNum;
    }

    /**
     * [get] TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)} <br>
     * 出力順(組織)
     * @return The value of the column 'TRANSPORT_PRIORITY'. (NullAllowed)
     */
    public java.math.BigDecimal getTransportPriority() {
        return _transportPriority;
    }

    /**
     * [set] TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)} <br>
     * 出力順(組織)
     * @param transportPriority The value of the column 'TRANSPORT_PRIORITY'. (NullAllowed)
     */
    public void setTransportPriority(java.math.BigDecimal transportPriority) {
        __modifiedProperties.add("transportPriority");
        this._transportPriority = transportPriority;
    }

    /**
     * [get] ITEM_SORT: {NotNull, decimal(16, 6)} <br>
     * 一般出力順
     * @return The value of the column 'ITEM_SORT'. (NullAllowed)
     */
    public java.math.BigDecimal getItemSort() {
        return _itemSort;
    }

    /**
     * [set] ITEM_SORT: {NotNull, decimal(16, 6)} <br>
     * 一般出力順
     * @param itemSort The value of the column 'ITEM_SORT'. (NullAllowed)
     */
    public void setItemSort(java.math.BigDecimal itemSort) {
        __modifiedProperties.add("itemSort");
        this._itemSort = itemSort;
    }

    /**
     * [get] USE_TYPE: {NotNull, decimal(16, 6)} <br>
     * 使用区分
     * @return The value of the column 'USE_TYPE'. (NullAllowed)
     */
    public java.math.BigDecimal getUseType() {
        return _useType;
    }

    /**
     * [set] USE_TYPE: {NotNull, decimal(16, 6)} <br>
     * 使用区分
     * @param useType The value of the column 'USE_TYPE'. (NullAllowed)
     */
    public void setUseType(java.math.BigDecimal useType) {
        __modifiedProperties.add("useType");
        this._useType = useType;
    }

    /**
     * [get] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed)
     */
    public String getSendCd() {
        return _sendCd;
    }

    /**
     * [set] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed)
     */
    public void setSendCd(String sendCd) {
        __modifiedProperties.add("sendCd");
        this._sendCd = sendCd;
    }

    /**
     * [get] SEND_FLG: {char(1)} <br>
     * 処理済フラグ
     * @return The value of the column 'SEND_FLG'. (NullAllowed)
     */
    public String getSendFlg() {
        return _sendFlg;
    }

    /**
     * [set] SEND_FLG: {char(1)} <br>
     * 処理済フラグ
     * @param sendFlg The value of the column 'SEND_FLG'. (NullAllowed)
     */
    public void setSendFlg(String sendFlg) {
        __modifiedProperties.add("sendFlg");
        this._sendFlg = sendFlg;
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

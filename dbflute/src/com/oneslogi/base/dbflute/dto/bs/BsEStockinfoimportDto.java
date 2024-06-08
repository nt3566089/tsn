package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_STOCKINFOIMPORT as TABLE. <br>
 * 在庫情報送信テーブル
 * <pre>
 * [primary-key]
 *     CENTER_STOCK_INFO_SEND_ID
 *
 * [column]
 *     CENTER_STOCK_INFO_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, SEQNO, ADDDATETIME, WAREHOUSECD, WAREHOUSE_SNAME, PRODUCT_CD, ITEM_NAME, LIMITDATE, DESIGN_CD, OTHERLOT1, ADDRESS3, QTY1, REFNO, FIRMCARRYNO, MANUFACTURECD, SOURCE_CD, SOURCE_NAME, SHIPSCHDATE, SCHRECEIVE_DATE, SCHRECEIVE_NUM, TRANSPORT_PRIORITY, ITEM_ORDERBY, USETYPE, LOCGROUP, LOCGROUPNAME, OTHERREFNO1, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsEStockinfoimportDto implements Serializable {

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

    /** SEND_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _workFlg;

    /** SEQNO: {varchar(255)} */
    @JsonKey
    protected String _seqno;

    /** ADDDATETIME: {varchar(255)} */
    @JsonKey
    protected String _adddatetime;

    /** WAREHOUSECD: {varchar(255)} */
    @JsonKey
    protected String _warehousecd;

    /** WAREHOUSE_SNAME: {varchar(255)} */
    @JsonKey
    protected String _warehouseSname;

    /** PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _productCd;

    /** ITEM_NAME: {varchar(255)} */
    @JsonKey
    protected String _itemName;

    /** LIMITDATE: {varchar(255)} */
    @JsonKey
    protected String _limitdate;

    /** DESIGN_CD: {varchar(255)} */
    @JsonKey
    protected String _designCd;

    /** OTHERLOT1: {varchar(255)} */
    @JsonKey
    protected String _otherlot1;

    /** ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _address3;

    /** QTY1: {varchar(255)} */
    @JsonKey
    protected String _qty1;

    /** REFNO: {varchar(255)} */
    @JsonKey
    protected String _refno;

    /** FIRMCARRYNO: {varchar(255)} */
    @JsonKey
    protected String _firmcarryno;

    /** MANUFACTURECD: {varchar(255)} */
    @JsonKey
    protected String _manufacturecd;

    /** SOURCE_CD: {varchar(255)} */
    @JsonKey
    protected String _sourceCd;

    /** SOURCE_NAME: {varchar(255)} */
    @JsonKey
    protected String _sourceName;

    /** SHIPSCHDATE: {varchar(255)} */
    @JsonKey
    protected String _shipschdate;

    /** SCHRECEIVE_DATE: {varchar(255)} */
    @JsonKey
    protected String _schreceiveDate;

    /** SCHRECEIVE_NUM: {varchar(255)} */
    @JsonKey
    protected String _schreceiveNum;

    /** TRANSPORT_PRIORITY: {varchar(255)} */
    @JsonKey
    protected String _transportPriority;

    /** ITEM_ORDERBY: {varchar(255)} */
    @JsonKey
    protected String _itemOrderby;

    /** USETYPE: {varchar(255)} */
    @JsonKey
    protected String _usetype;

    /** LOCGROUP: {varchar(255)} */
    @JsonKey
    protected String _locgroup;

    /** LOCGROUPNAME: {varchar(255)} */
    @JsonKey
    protected String _locgroupname;

    /** OTHERREFNO1: {varchar(255)} */
    @JsonKey
    protected String _otherrefno1;

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
    public BsEStockinfoimportDto() {
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
        if (other == null || !(other instanceof BsEStockinfoimportDto)) { return false; }
        final BsEStockinfoimportDto otherEntity = (BsEStockinfoimportDto)other;
        if (!helpComparingValue(getCenterStockInfoSendId(), otherEntity.getCenterStockInfoSendId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_STOCKINFOIMPORT");
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
        sb.append(c).append(getSendCd());
        sb.append(c).append(getSendRowId());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getSeqno());
        sb.append(c).append(getAdddatetime());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getWarehouseSname());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getItemName());
        sb.append(c).append(getLimitdate());
        sb.append(c).append(getDesignCd());
        sb.append(c).append(getOtherlot1());
        sb.append(c).append(getAddress3());
        sb.append(c).append(getQty1());
        sb.append(c).append(getRefno());
        sb.append(c).append(getFirmcarryno());
        sb.append(c).append(getManufacturecd());
        sb.append(c).append(getSourceCd());
        sb.append(c).append(getSourceName());
        sb.append(c).append(getShipschdate());
        sb.append(c).append(getSchreceiveDate());
        sb.append(c).append(getSchreceiveNum());
        sb.append(c).append(getTransportPriority());
        sb.append(c).append(getItemOrderby());
        sb.append(c).append(getUsetype());
        sb.append(c).append(getLocgroup());
        sb.append(c).append(getLocgroupname());
        sb.append(c).append(getOtherrefno1());
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
     * 在庫情報送信ID
     * @return The value of the column 'CENTER_STOCK_INFO_SEND_ID'. (NullAllowed)
     */
    public Long getCenterStockInfoSendId() {
        return _centerStockInfoSendId;
    }

    /**
     * [set] CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫情報送信ID
     * @param centerStockInfoSendId The value of the column 'CENTER_STOCK_INFO_SEND_ID'. (NullAllowed)
     */
    public void setCenterStockInfoSendId(Long centerStockInfoSendId) {
        __modifiedProperties.add("centerStockInfoSendId");
        this._centerStockInfoSendId = centerStockInfoSendId;
    }

    /**
     * [get] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed)
     */
    public String getSendCd() {
        return _sendCd;
    }

    /**
     * [set] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed)
     */
    public void setSendCd(String sendCd) {
        __modifiedProperties.add("sendCd");
        this._sendCd = sendCd;
    }

    /**
     * [get] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public Long getSendRowId() {
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public void setSendRowId(Long sendRowId) {
        __modifiedProperties.add("sendRowId");
        this._sendRowId = sendRowId;
    }

    /**
     * [get] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] SEQNO: {varchar(255)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQNO'. (NullAllowed)
     */
    public String getSeqno() {
        return _seqno;
    }

    /**
     * [set] SEQNO: {varchar(255)} <br>
     * シーケンス番号
     * @param seqno The value of the column 'SEQNO'. (NullAllowed)
     */
    public void setSeqno(String seqno) {
        __modifiedProperties.add("seqno");
        this._seqno = seqno;
    }

    /**
     * [get] ADDDATETIME: {varchar(255)} <br>
     * 情報作成日
     * @return The value of the column 'ADDDATETIME'. (NullAllowed)
     */
    public String getAdddatetime() {
        return _adddatetime;
    }

    /**
     * [set] ADDDATETIME: {varchar(255)} <br>
     * 情報作成日
     * @param adddatetime The value of the column 'ADDDATETIME'. (NullAllowed)
     */
    public void setAdddatetime(String adddatetime) {
        __modifiedProperties.add("adddatetime");
        this._adddatetime = adddatetime;
    }

    /**
     * [get] WAREHOUSECD: {varchar(255)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {varchar(255)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] WAREHOUSE_SNAME: {varchar(255)} <br>
     * 拠点名称
     * @return The value of the column 'WAREHOUSE_SNAME'. (NullAllowed)
     */
    public String getWarehouseSname() {
        return _warehouseSname;
    }

    /**
     * [set] WAREHOUSE_SNAME: {varchar(255)} <br>
     * 拠点名称
     * @param warehouseSname The value of the column 'WAREHOUSE_SNAME'. (NullAllowed)
     */
    public void setWarehouseSname(String warehouseSname) {
        __modifiedProperties.add("warehouseSname");
        this._warehouseSname = warehouseSname;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] ITEM_NAME: {varchar(255)} <br>
     * 銘柄名称
     * @return The value of the column 'ITEM_NAME'. (NullAllowed)
     */
    public String getItemName() {
        return _itemName;
    }

    /**
     * [set] ITEM_NAME: {varchar(255)} <br>
     * 銘柄名称
     * @param itemName The value of the column 'ITEM_NAME'. (NullAllowed)
     */
    public void setItemName(String itemName) {
        __modifiedProperties.add("itemName");
        this._itemName = itemName;
    }

    /**
     * [get] LIMITDATE: {varchar(255)} <br>
     * 製造年月日
     * @return The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public String getLimitdate() {
        return _limitdate;
    }

    /**
     * [set] LIMITDATE: {varchar(255)} <br>
     * 製造年月日
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public void setLimitdate(String limitdate) {
        __modifiedProperties.add("limitdate");
        this._limitdate = limitdate;
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
     * [get] OTHERLOT1: {varchar(255)} <br>
     * 在庫区分
     * @return The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public String getOtherlot1() {
        return _otherlot1;
    }

    /**
     * [set] OTHERLOT1: {varchar(255)} <br>
     * 在庫区分
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public void setOtherlot1(String otherlot1) {
        __modifiedProperties.add("otherlot1");
        this._otherlot1 = otherlot1;
    }

    /**
     * [get] ADDRESS3: {varchar(255)} <br>
     * 製品区分
     * @return The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public String getAddress3() {
        return _address3;
    }

    /**
     * [set] ADDRESS3: {varchar(255)} <br>
     * 製品区分
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public void setAddress3(String address3) {
        __modifiedProperties.add("address3");
        this._address3 = address3;
    }

    /**
     * [get] QTY1: {varchar(255)} <br>
     * 在庫数量
     * @return The value of the column 'QTY1'. (NullAllowed)
     */
    public String getQty1() {
        return _qty1;
    }

    /**
     * [set] QTY1: {varchar(255)} <br>
     * 在庫数量
     * @param qty1 The value of the column 'QTY1'. (NullAllowed)
     */
    public void setQty1(String qty1) {
        __modifiedProperties.add("qty1");
        this._qty1 = qty1;
    }

    /**
     * [get] REFNO: {varchar(255)} <br>
     * 輸送番号
     * @return The value of the column 'REFNO'. (NullAllowed)
     */
    public String getRefno() {
        return _refno;
    }

    /**
     * [set] REFNO: {varchar(255)} <br>
     * 輸送番号
     * @param refno The value of the column 'REFNO'. (NullAllowed)
     */
    public void setRefno(String refno) {
        __modifiedProperties.add("refno");
        this._refno = refno;
    }

    /**
     * [get] FIRMCARRYNO: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMCARRYNO'. (NullAllowed)
     */
    public String getFirmcarryno() {
        return _firmcarryno;
    }

    /**
     * [set] FIRMCARRYNO: {varchar(255)} <br>
     * 商社搬入番号
     * @param firmcarryno The value of the column 'FIRMCARRYNO'. (NullAllowed)
     */
    public void setFirmcarryno(String firmcarryno) {
        __modifiedProperties.add("firmcarryno");
        this._firmcarryno = firmcarryno;
    }

    /**
     * [get] MANUFACTURECD: {varchar(255)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURECD'. (NullAllowed)
     */
    public String getManufacturecd() {
        return _manufacturecd;
    }

    /**
     * [set] MANUFACTURECD: {varchar(255)} <br>
     * 製造記号
     * @param manufacturecd The value of the column 'MANUFACTURECD'. (NullAllowed)
     */
    public void setManufacturecd(String manufacturecd) {
        __modifiedProperties.add("manufacturecd");
        this._manufacturecd = manufacturecd;
    }

    /**
     * [get] SOURCE_CD: {varchar(255)} <br>
     * 発送元CD
     * @return The value of the column 'SOURCE_CD'. (NullAllowed)
     */
    public String getSourceCd() {
        return _sourceCd;
    }

    /**
     * [set] SOURCE_CD: {varchar(255)} <br>
     * 発送元CD
     * @param sourceCd The value of the column 'SOURCE_CD'. (NullAllowed)
     */
    public void setSourceCd(String sourceCd) {
        __modifiedProperties.add("sourceCd");
        this._sourceCd = sourceCd;
    }

    /**
     * [get] SOURCE_NAME: {varchar(255)} <br>
     * 発送元名称
     * @return The value of the column 'SOURCE_NAME'. (NullAllowed)
     */
    public String getSourceName() {
        return _sourceName;
    }

    /**
     * [set] SOURCE_NAME: {varchar(255)} <br>
     * 発送元名称
     * @param sourceName The value of the column 'SOURCE_NAME'. (NullAllowed)
     */
    public void setSourceName(String sourceName) {
        __modifiedProperties.add("sourceName");
        this._sourceName = sourceName;
    }

    /**
     * [get] SHIPSCHDATE: {varchar(255)} <br>
     * 発送予定日
     * @return The value of the column 'SHIPSCHDATE'. (NullAllowed)
     */
    public String getShipschdate() {
        return _shipschdate;
    }

    /**
     * [set] SHIPSCHDATE: {varchar(255)} <br>
     * 発送予定日
     * @param shipschdate The value of the column 'SHIPSCHDATE'. (NullAllowed)
     */
    public void setShipschdate(String shipschdate) {
        __modifiedProperties.add("shipschdate");
        this._shipschdate = shipschdate;
    }

    /**
     * [get] SCHRECEIVE_DATE: {varchar(255)} <br>
     * 入庫予定日
     * @return The value of the column 'SCHRECEIVE_DATE'. (NullAllowed)
     */
    public String getSchreceiveDate() {
        return _schreceiveDate;
    }

    /**
     * [set] SCHRECEIVE_DATE: {varchar(255)} <br>
     * 入庫予定日
     * @param schreceiveDate The value of the column 'SCHRECEIVE_DATE'. (NullAllowed)
     */
    public void setSchreceiveDate(String schreceiveDate) {
        __modifiedProperties.add("schreceiveDate");
        this._schreceiveDate = schreceiveDate;
    }

    /**
     * [get] SCHRECEIVE_NUM: {varchar(255)} <br>
     * 受入予定数量
     * @return The value of the column 'SCHRECEIVE_NUM'. (NullAllowed)
     */
    public String getSchreceiveNum() {
        return _schreceiveNum;
    }

    /**
     * [set] SCHRECEIVE_NUM: {varchar(255)} <br>
     * 受入予定数量
     * @param schreceiveNum The value of the column 'SCHRECEIVE_NUM'. (NullAllowed)
     */
    public void setSchreceiveNum(String schreceiveNum) {
        __modifiedProperties.add("schreceiveNum");
        this._schreceiveNum = schreceiveNum;
    }

    /**
     * [get] TRANSPORT_PRIORITY: {varchar(255)} <br>
     * 出力順(組織)
     * @return The value of the column 'TRANSPORT_PRIORITY'. (NullAllowed)
     */
    public String getTransportPriority() {
        return _transportPriority;
    }

    /**
     * [set] TRANSPORT_PRIORITY: {varchar(255)} <br>
     * 出力順(組織)
     * @param transportPriority The value of the column 'TRANSPORT_PRIORITY'. (NullAllowed)
     */
    public void setTransportPriority(String transportPriority) {
        __modifiedProperties.add("transportPriority");
        this._transportPriority = transportPriority;
    }

    /**
     * [get] ITEM_ORDERBY: {varchar(255)} <br>
     * 一般出力順
     * @return The value of the column 'ITEM_ORDERBY'. (NullAllowed)
     */
    public String getItemOrderby() {
        return _itemOrderby;
    }

    /**
     * [set] ITEM_ORDERBY: {varchar(255)} <br>
     * 一般出力順
     * @param itemOrderby The value of the column 'ITEM_ORDERBY'. (NullAllowed)
     */
    public void setItemOrderby(String itemOrderby) {
        __modifiedProperties.add("itemOrderby");
        this._itemOrderby = itemOrderby;
    }

    /**
     * [get] USETYPE: {varchar(255)} <br>
     * 使用区分
     * @return The value of the column 'USETYPE'. (NullAllowed)
     */
    public String getUsetype() {
        return _usetype;
    }

    /**
     * [set] USETYPE: {varchar(255)} <br>
     * 使用区分
     * @param usetype The value of the column 'USETYPE'. (NullAllowed)
     */
    public void setUsetype(String usetype) {
        __modifiedProperties.add("usetype");
        this._usetype = usetype;
    }

    /**
     * [get] LOCGROUP: {varchar(255)} <br>
     * ロケーショングループCD
     * @return The value of the column 'LOCGROUP'. (NullAllowed)
     */
    public String getLocgroup() {
        return _locgroup;
    }

    /**
     * [set] LOCGROUP: {varchar(255)} <br>
     * ロケーショングループCD
     * @param locgroup The value of the column 'LOCGROUP'. (NullAllowed)
     */
    public void setLocgroup(String locgroup) {
        __modifiedProperties.add("locgroup");
        this._locgroup = locgroup;
    }

    /**
     * [get] LOCGROUPNAME: {varchar(255)} <br>
     * ロケーショングループ名称
     * @return The value of the column 'LOCGROUPNAME'. (NullAllowed)
     */
    public String getLocgroupname() {
        return _locgroupname;
    }

    /**
     * [set] LOCGROUPNAME: {varchar(255)} <br>
     * ロケーショングループ名称
     * @param locgroupname The value of the column 'LOCGROUPNAME'. (NullAllowed)
     */
    public void setLocgroupname(String locgroupname) {
        __modifiedProperties.add("locgroupname");
        this._locgroupname = locgroupname;
    }

    /**
     * [get] OTHERREFNO1: {varchar(255)} <br>
     * 特販業者CD
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public String getOtherrefno1() {
        return _otherrefno1;
    }

    /**
     * [set] OTHERREFNO1: {varchar(255)} <br>
     * 特販業者CD
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public void setOtherrefno1(String otherrefno1) {
        __modifiedProperties.add("otherrefno1");
        this._otherrefno1 = otherrefno1;
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

package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_PRODUCT_TRACKING_DOMES as TABLE. <br>
 * 製品追跡情報送信テーブル(日次)(国産)
 * <pre>
 * [primary-key]
 *     PRODUCT_TRACKING_DOMES_ID
 *
 * [column]
 *     PRODUCT_TRACKING_DOMES_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, USERNUM1, ITEM_ADMIN, TRACEKEY, WAREHOUSECD, FACTORYCD, PRODUCT_CD, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO, MACHINEMO, CREATENO, LIMITDATE, DATETIME, DISTRIBUTIONCD, TRANSPORTCD, PALLETID, INITNUM, CREATEDATETIME, ASSORTDATETIME, TRACETYPE, LINEBLOCK, ASSORTEDUNIT, ASSORTEDINDEX, OPERATIONCODE, CASEINNUM, ASSORTNUM, ASSORTDIFNUM, DIRECTIONCD, PISTONTYPE, CUSTOMERCD, DIRECTIONNUM, DISTWAREHOUSECD, RCVKEY, ITEMCD_WH, DESIGNCD, INV_NUM, SORT_NUM, ADOPT_NUM, DT_EXTDATA2, RESERVEAREA, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_TRACKING_DOMES_ID
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
public abstract class BsEProductTrackingDomesDto implements Serializable {

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
    /** PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _productTrackingDomesId;

    /** SEND_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1)} */
    @JsonKey
    protected String _workFlg;

    /** USERNUM1: {varchar(30)} */
    @JsonKey
    protected String _usernum1;

    /** ITEM_ADMIN: {varchar(30)} */
    @JsonKey
    protected String _itemAdmin;

    /** TRACEKEY: {varchar(255)} */
    @JsonKey
    protected String _tracekey;

    /** WAREHOUSECD: {varchar(255)} */
    @JsonKey
    protected String _warehousecd;

    /** FACTORYCD: {varchar(255)} */
    @JsonKey
    protected String _factorycd;

    /** PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _productCd;

    /** SKUCD: {varchar(255)} */
    @JsonKey
    protected String _skucd;

    /** DESTINATIONCD: {varchar(255)} */
    @JsonKey
    protected String _destinationcd;

    /** MANUFACTURECD: {varchar(255)} */
    @JsonKey
    protected String _manufacturecd;

    /** ORDERNO: {varchar(255)} */
    @JsonKey
    protected String _orderno;

    /** MACHINEMO: {varchar(255)} */
    @JsonKey
    protected String _machinemo;

    /** CREATENO: {varchar(255)} */
    @JsonKey
    protected String _createno;

    /** LIMITDATE: {varchar(255)} */
    @JsonKey
    protected String _limitdate;

    /** DATETIME: {varchar(255)} */
    @JsonKey
    protected String _datetime;

    /** DISTRIBUTIONCD: {varchar(255)} */
    @JsonKey
    protected String _distributioncd;

    /** TRANSPORTCD: {varchar(255)} */
    @JsonKey
    protected String _transportcd;

    /** PALLETID: {varchar(255)} */
    @JsonKey
    protected String _palletid;

    /** INITNUM: {varchar(255)} */
    @JsonKey
    protected String _initnum;

    /** CREATEDATETIME: {varchar(255)} */
    @JsonKey
    protected String _createdatetime;

    /** ASSORTDATETIME: {varchar(255)} */
    @JsonKey
    protected String _assortdatetime;

    /** TRACETYPE: {varchar(255)} */
    @JsonKey
    protected String _tracetype;

    /** LINEBLOCK: {varchar(255)} */
    @JsonKey
    protected String _lineblock;

    /** ASSORTEDUNIT: {varchar(255)} */
    @JsonKey
    protected String _assortedunit;

    /** ASSORTEDINDEX: {varchar(255)} */
    @JsonKey
    protected String _assortedindex;

    /** OPERATIONCODE: {varchar(255)} */
    @JsonKey
    protected String _operationcode;

    /** CASEINNUM: {varchar(255)} */
    @JsonKey
    protected String _caseinnum;

    /** ASSORTNUM: {varchar(255)} */
    @JsonKey
    protected String _assortnum;

    /** ASSORTDIFNUM: {varchar(255)} */
    @JsonKey
    protected String _assortdifnum;

    /** DIRECTIONCD: {varchar(255)} */
    @JsonKey
    protected String _directioncd;

    /** PISTONTYPE: {varchar(255)} */
    @JsonKey
    protected String _pistontype;

    /** CUSTOMERCD: {varchar(255)} */
    @JsonKey
    protected String _customercd;

    /** DIRECTIONNUM: {varchar(255)} */
    @JsonKey
    protected String _directionnum;

    /** DISTWAREHOUSECD: {varchar(255)} */
    @JsonKey
    protected String _distwarehousecd;

    /** RCVKEY: {varchar(255)} */
    @JsonKey
    protected String _rcvkey;

    /** ITEMCD_WH: {varchar(255)} */
    @JsonKey
    protected String _itemcdWh;

    /** DESIGNCD: {varchar(255)} */
    @JsonKey
    protected String _designcd;

    /** INV_NUM: {varchar(255)} */
    @JsonKey
    protected String _invNum;

    /** SORT_NUM: {varchar(255)} */
    @JsonKey
    protected String _sortNum;

    /** ADOPT_NUM: {varchar(255)} */
    @JsonKey
    protected String _adoptNum;

    /** DT_EXTDATA2: {varchar(255)} */
    @JsonKey
    protected String _dtExtdata2;

    /** RESERVEAREA: {varchar(255)} */
    @JsonKey
    protected String _reservearea;

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
    public BsEProductTrackingDomesDto() {
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
        if (other == null || !(other instanceof BsEProductTrackingDomesDto)) { return false; }
        final BsEProductTrackingDomesDto otherEntity = (BsEProductTrackingDomesDto)other;
        if (!helpComparingValue(getProductTrackingDomesId(), otherEntity.getProductTrackingDomesId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_PRODUCT_TRACKING_DOMES");
        result = xCH(result, getProductTrackingDomesId());
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
        sb.append(c).append(getProductTrackingDomesId());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getSendRowId());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getUsernum1());
        sb.append(c).append(getItemAdmin());
        sb.append(c).append(getTracekey());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getFactorycd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getSkucd());
        sb.append(c).append(getDestinationcd());
        sb.append(c).append(getManufacturecd());
        sb.append(c).append(getOrderno());
        sb.append(c).append(getMachinemo());
        sb.append(c).append(getCreateno());
        sb.append(c).append(getLimitdate());
        sb.append(c).append(getDatetime());
        sb.append(c).append(getDistributioncd());
        sb.append(c).append(getTransportcd());
        sb.append(c).append(getPalletid());
        sb.append(c).append(getInitnum());
        sb.append(c).append(getCreatedatetime());
        sb.append(c).append(getAssortdatetime());
        sb.append(c).append(getTracetype());
        sb.append(c).append(getLineblock());
        sb.append(c).append(getAssortedunit());
        sb.append(c).append(getAssortedindex());
        sb.append(c).append(getOperationcode());
        sb.append(c).append(getCaseinnum());
        sb.append(c).append(getAssortnum());
        sb.append(c).append(getAssortdifnum());
        sb.append(c).append(getDirectioncd());
        sb.append(c).append(getPistontype());
        sb.append(c).append(getCustomercd());
        sb.append(c).append(getDirectionnum());
        sb.append(c).append(getDistwarehousecd());
        sb.append(c).append(getRcvkey());
        sb.append(c).append(getItemcdWh());
        sb.append(c).append(getDesigncd());
        sb.append(c).append(getInvNum());
        sb.append(c).append(getSortNum());
        sb.append(c).append(getAdoptNum());
        sb.append(c).append(getDtExtdata2());
        sb.append(c).append(getReservearea());
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
     * [get] PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製品追跡情報送信(日次)(国産)ID
     * @return The value of the column 'PRODUCT_TRACKING_DOMES_ID'. (NullAllowed)
     */
    public Long getProductTrackingDomesId() {
        return _productTrackingDomesId;
    }

    /**
     * [set] PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製品追跡情報送信(日次)(国産)ID
     * @param productTrackingDomesId The value of the column 'PRODUCT_TRACKING_DOMES_ID'. (NullAllowed)
     */
    public void setProductTrackingDomesId(Long productTrackingDomesId) {
        __modifiedProperties.add("productTrackingDomesId");
        this._productTrackingDomesId = productTrackingDomesId;
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
     * [get] WORK_FLG: {NotNull, char(1)} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {NotNull, char(1)} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] USERNUM1: {varchar(30)} <br>
     * 国産・輸入区分
     * @return The value of the column 'USERNUM1'. (NullAllowed)
     */
    public String getUsernum1() {
        return _usernum1;
    }

    /**
     * [set] USERNUM1: {varchar(30)} <br>
     * 国産・輸入区分
     * @param usernum1 The value of the column 'USERNUM1'. (NullAllowed)
     */
    public void setUsernum1(String usernum1) {
        __modifiedProperties.add("usernum1");
        this._usernum1 = usernum1;
    }

    /**
     * [get] ITEM_ADMIN: {varchar(30)} <br>
     * 銘柄管理社
     * @return The value of the column 'ITEM_ADMIN'. (NullAllowed)
     */
    public String getItemAdmin() {
        return _itemAdmin;
    }

    /**
     * [set] ITEM_ADMIN: {varchar(30)} <br>
     * 銘柄管理社
     * @param itemAdmin The value of the column 'ITEM_ADMIN'. (NullAllowed)
     */
    public void setItemAdmin(String itemAdmin) {
        __modifiedProperties.add("itemAdmin");
        this._itemAdmin = itemAdmin;
    }

    /**
     * [get] TRACEKEY: {varchar(255)} <br>
     * 製品追跡キー
     * @return The value of the column 'TRACEKEY'. (NullAllowed)
     */
    public String getTracekey() {
        return _tracekey;
    }

    /**
     * [set] TRACEKEY: {varchar(255)} <br>
     * 製品追跡キー
     * @param tracekey The value of the column 'TRACEKEY'. (NullAllowed)
     */
    public void setTracekey(String tracekey) {
        __modifiedProperties.add("tracekey");
        this._tracekey = tracekey;
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
     * [get] FACTORYCD: {varchar(255)} <br>
     * 工場CD
     * @return The value of the column 'FACTORYCD'. (NullAllowed)
     */
    public String getFactorycd() {
        return _factorycd;
    }

    /**
     * [set] FACTORYCD: {varchar(255)} <br>
     * 工場CD
     * @param factorycd The value of the column 'FACTORYCD'. (NullAllowed)
     */
    public void setFactorycd(String factorycd) {
        __modifiedProperties.add("factorycd");
        this._factorycd = factorycd;
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
     * [get] SKUCD: {varchar(255)} <br>
     * SKUCD
     * @return The value of the column 'SKUCD'. (NullAllowed)
     */
    public String getSkucd() {
        return _skucd;
    }

    /**
     * [set] SKUCD: {varchar(255)} <br>
     * SKUCD
     * @param skucd The value of the column 'SKUCD'. (NullAllowed)
     */
    public void setSkucd(String skucd) {
        __modifiedProperties.add("skucd");
        this._skucd = skucd;
    }

    /**
     * [get] DESTINATIONCD: {varchar(255)} <br>
     * 仕向地CD
     * @return The value of the column 'DESTINATIONCD'. (NullAllowed)
     */
    public String getDestinationcd() {
        return _destinationcd;
    }

    /**
     * [set] DESTINATIONCD: {varchar(255)} <br>
     * 仕向地CD
     * @param destinationcd The value of the column 'DESTINATIONCD'. (NullAllowed)
     */
    public void setDestinationcd(String destinationcd) {
        __modifiedProperties.add("destinationcd");
        this._destinationcd = destinationcd;
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
     * [get] ORDERNO: {varchar(255)} <br>
     * 発注記号
     * @return The value of the column 'ORDERNO'. (NullAllowed)
     */
    public String getOrderno() {
        return _orderno;
    }

    /**
     * [set] ORDERNO: {varchar(255)} <br>
     * 発注記号
     * @param orderno The value of the column 'ORDERNO'. (NullAllowed)
     */
    public void setOrderno(String orderno) {
        __modifiedProperties.add("orderno");
        this._orderno = orderno;
    }

    /**
     * [get] MACHINEMO: {varchar(255)} <br>
     * 号機
     * @return The value of the column 'MACHINEMO'. (NullAllowed)
     */
    public String getMachinemo() {
        return _machinemo;
    }

    /**
     * [set] MACHINEMO: {varchar(255)} <br>
     * 号機
     * @param machinemo The value of the column 'MACHINEMO'. (NullAllowed)
     */
    public void setMachinemo(String machinemo) {
        __modifiedProperties.add("machinemo");
        this._machinemo = machinemo;
    }

    /**
     * [get] CREATENO: {varchar(255)} <br>
     * 生出番号
     * @return The value of the column 'CREATENO'. (NullAllowed)
     */
    public String getCreateno() {
        return _createno;
    }

    /**
     * [set] CREATENO: {varchar(255)} <br>
     * 生出番号
     * @param createno The value of the column 'CREATENO'. (NullAllowed)
     */
    public void setCreateno(String createno) {
        __modifiedProperties.add("createno");
        this._createno = createno;
    }

    /**
     * [get] LIMITDATE: {varchar(255)} <br>
     * 年月日
     * @return The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public String getLimitdate() {
        return _limitdate;
    }

    /**
     * [set] LIMITDATE: {varchar(255)} <br>
     * 年月日
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public void setLimitdate(String limitdate) {
        __modifiedProperties.add("limitdate");
        this._limitdate = limitdate;
    }

    /**
     * [get] DATETIME: {varchar(255)} <br>
     * 日付時刻
     * @return The value of the column 'DATETIME'. (NullAllowed)
     */
    public String getDatetime() {
        return _datetime;
    }

    /**
     * [set] DATETIME: {varchar(255)} <br>
     * 日付時刻
     * @param datetime The value of the column 'DATETIME'. (NullAllowed)
     */
    public void setDatetime(String datetime) {
        __modifiedProperties.add("datetime");
        this._datetime = datetime;
    }

    /**
     * [get] DISTRIBUTIONCD: {varchar(255)} <br>
     * 流通識別
     * @return The value of the column 'DISTRIBUTIONCD'. (NullAllowed)
     */
    public String getDistributioncd() {
        return _distributioncd;
    }

    /**
     * [set] DISTRIBUTIONCD: {varchar(255)} <br>
     * 流通識別
     * @param distributioncd The value of the column 'DISTRIBUTIONCD'. (NullAllowed)
     */
    public void setDistributioncd(String distributioncd) {
        __modifiedProperties.add("distributioncd");
        this._distributioncd = distributioncd;
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
     * [get] PALLETID: {varchar(255)} <br>
     * パレットID
     * @return The value of the column 'PALLETID'. (NullAllowed)
     */
    public String getPalletid() {
        return _palletid;
    }

    /**
     * [set] PALLETID: {varchar(255)} <br>
     * パレットID
     * @param palletid The value of the column 'PALLETID'. (NullAllowed)
     */
    public void setPalletid(String palletid) {
        __modifiedProperties.add("palletid");
        this._palletid = palletid;
    }

    /**
     * [get] INITNUM: {varchar(255)} <br>
     * 入庫時数量
     * @return The value of the column 'INITNUM'. (NullAllowed)
     */
    public String getInitnum() {
        return _initnum;
    }

    /**
     * [set] INITNUM: {varchar(255)} <br>
     * 入庫時数量
     * @param initnum The value of the column 'INITNUM'. (NullAllowed)
     */
    public void setInitnum(String initnum) {
        __modifiedProperties.add("initnum");
        this._initnum = initnum;
    }

    /**
     * [get] CREATEDATETIME: {varchar(255)} <br>
     * 作成年月日
     * @return The value of the column 'CREATEDATETIME'. (NullAllowed)
     */
    public String getCreatedatetime() {
        return _createdatetime;
    }

    /**
     * [set] CREATEDATETIME: {varchar(255)} <br>
     * 作成年月日
     * @param createdatetime The value of the column 'CREATEDATETIME'. (NullAllowed)
     */
    public void setCreatedatetime(String createdatetime) {
        __modifiedProperties.add("createdatetime");
        this._createdatetime = createdatetime;
    }

    /**
     * [get] ASSORTDATETIME: {varchar(255)} <br>
     * 仕分年月日
     * @return The value of the column 'ASSORTDATETIME'. (NullAllowed)
     */
    public String getAssortdatetime() {
        return _assortdatetime;
    }

    /**
     * [set] ASSORTDATETIME: {varchar(255)} <br>
     * 仕分年月日
     * @param assortdatetime The value of the column 'ASSORTDATETIME'. (NullAllowed)
     */
    public void setAssortdatetime(String assortdatetime) {
        __modifiedProperties.add("assortdatetime");
        this._assortdatetime = assortdatetime;
    }

    /**
     * [get] TRACETYPE: {varchar(255)} <br>
     * 追跡区分
     * @return The value of the column 'TRACETYPE'. (NullAllowed)
     */
    public String getTracetype() {
        return _tracetype;
    }

    /**
     * [set] TRACETYPE: {varchar(255)} <br>
     * 追跡区分
     * @param tracetype The value of the column 'TRACETYPE'. (NullAllowed)
     */
    public void setTracetype(String tracetype) {
        __modifiedProperties.add("tracetype");
        this._tracetype = tracetype;
    }

    /**
     * [get] LINEBLOCK: {varchar(255)} <br>
     * ラインブロック
     * @return The value of the column 'LINEBLOCK'. (NullAllowed)
     */
    public String getLineblock() {
        return _lineblock;
    }

    /**
     * [set] LINEBLOCK: {varchar(255)} <br>
     * ラインブロック
     * @param lineblock The value of the column 'LINEBLOCK'. (NullAllowed)
     */
    public void setLineblock(String lineblock) {
        __modifiedProperties.add("lineblock");
        this._lineblock = lineblock;
    }

    /**
     * [get] ASSORTEDUNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'ASSORTEDUNIT'. (NullAllowed)
     */
    public String getAssortedunit() {
        return _assortedunit;
    }

    /**
     * [set] ASSORTEDUNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @param assortedunit The value of the column 'ASSORTEDUNIT'. (NullAllowed)
     */
    public void setAssortedunit(String assortedunit) {
        __modifiedProperties.add("assortedunit");
        this._assortedunit = assortedunit;
    }

    /**
     * [get] ASSORTEDINDEX: {varchar(255)} <br>
     * 投入順
     * @return The value of the column 'ASSORTEDINDEX'. (NullAllowed)
     */
    public String getAssortedindex() {
        return _assortedindex;
    }

    /**
     * [set] ASSORTEDINDEX: {varchar(255)} <br>
     * 投入順
     * @param assortedindex The value of the column 'ASSORTEDINDEX'. (NullAllowed)
     */
    public void setAssortedindex(String assortedindex) {
        __modifiedProperties.add("assortedindex");
        this._assortedindex = assortedindex;
    }

    /**
     * [get] OPERATIONCODE: {varchar(255)} <br>
     * 操作数量符号
     * @return The value of the column 'OPERATIONCODE'. (NullAllowed)
     */
    public String getOperationcode() {
        return _operationcode;
    }

    /**
     * [set] OPERATIONCODE: {varchar(255)} <br>
     * 操作数量符号
     * @param operationcode The value of the column 'OPERATIONCODE'. (NullAllowed)
     */
    public void setOperationcode(String operationcode) {
        __modifiedProperties.add("operationcode");
        this._operationcode = operationcode;
    }

    /**
     * [get] CASEINNUM: {varchar(255)} <br>
     * ケース内数量
     * @return The value of the column 'CASEINNUM'. (NullAllowed)
     */
    public String getCaseinnum() {
        return _caseinnum;
    }

    /**
     * [set] CASEINNUM: {varchar(255)} <br>
     * ケース内数量
     * @param caseinnum The value of the column 'CASEINNUM'. (NullAllowed)
     */
    public void setCaseinnum(String caseinnum) {
        __modifiedProperties.add("caseinnum");
        this._caseinnum = caseinnum;
    }

    /**
     * [get] ASSORTNUM: {varchar(255)} <br>
     * 仕分数量
     * @return The value of the column 'ASSORTNUM'. (NullAllowed)
     */
    public String getAssortnum() {
        return _assortnum;
    }

    /**
     * [set] ASSORTNUM: {varchar(255)} <br>
     * 仕分数量
     * @param assortnum The value of the column 'ASSORTNUM'. (NullAllowed)
     */
    public void setAssortnum(String assortnum) {
        __modifiedProperties.add("assortnum");
        this._assortnum = assortnum;
    }

    /**
     * [get] ASSORTDIFNUM: {varchar(255)} <br>
     * 差異不良数量
     * @return The value of the column 'ASSORTDIFNUM'. (NullAllowed)
     */
    public String getAssortdifnum() {
        return _assortdifnum;
    }

    /**
     * [set] ASSORTDIFNUM: {varchar(255)} <br>
     * 差異不良数量
     * @param assortdifnum The value of the column 'ASSORTDIFNUM'. (NullAllowed)
     */
    public void setAssortdifnum(String assortdifnum) {
        __modifiedProperties.add("assortdifnum");
        this._assortdifnum = assortdifnum;
    }

    /**
     * [get] DIRECTIONCD: {varchar(255)} <br>
     * 方面CD
     * @return The value of the column 'DIRECTIONCD'. (NullAllowed)
     */
    public String getDirectioncd() {
        return _directioncd;
    }

    /**
     * [set] DIRECTIONCD: {varchar(255)} <br>
     * 方面CD
     * @param directioncd The value of the column 'DIRECTIONCD'. (NullAllowed)
     */
    public void setDirectioncd(String directioncd) {
        __modifiedProperties.add("directioncd");
        this._directioncd = directioncd;
    }

    /**
     * [get] PISTONTYPE: {varchar(255)} <br>
     * ピストン区分
     * @return The value of the column 'PISTONTYPE'. (NullAllowed)
     */
    public String getPistontype() {
        return _pistontype;
    }

    /**
     * [set] PISTONTYPE: {varchar(255)} <br>
     * ピストン区分
     * @param pistontype The value of the column 'PISTONTYPE'. (NullAllowed)
     */
    public void setPistontype(String pistontype) {
        __modifiedProperties.add("pistontype");
        this._pistontype = pistontype;
    }

    /**
     * [get] CUSTOMERCD: {varchar(255)} <br>
     * お得意様CD
     * @return The value of the column 'CUSTOMERCD'. (NullAllowed)
     */
    public String getCustomercd() {
        return _customercd;
    }

    /**
     * [set] CUSTOMERCD: {varchar(255)} <br>
     * お得意様CD
     * @param customercd The value of the column 'CUSTOMERCD'. (NullAllowed)
     */
    public void setCustomercd(String customercd) {
        __modifiedProperties.add("customercd");
        this._customercd = customercd;
    }

    /**
     * [get] DIRECTIONNUM: {varchar(255)} <br>
     * さしず数量
     * @return The value of the column 'DIRECTIONNUM'. (NullAllowed)
     */
    public String getDirectionnum() {
        return _directionnum;
    }

    /**
     * [set] DIRECTIONNUM: {varchar(255)} <br>
     * さしず数量
     * @param directionnum The value of the column 'DIRECTIONNUM'. (NullAllowed)
     */
    public void setDirectionnum(String directionnum) {
        __modifiedProperties.add("directionnum");
        this._directionnum = directionnum;
    }

    /**
     * [get] DISTWAREHOUSECD: {varchar(255)} <br>
     * 融通先CD
     * @return The value of the column 'DISTWAREHOUSECD'. (NullAllowed)
     */
    public String getDistwarehousecd() {
        return _distwarehousecd;
    }

    /**
     * [set] DISTWAREHOUSECD: {varchar(255)} <br>
     * 融通先CD
     * @param distwarehousecd The value of the column 'DISTWAREHOUSECD'. (NullAllowed)
     */
    public void setDistwarehousecd(String distwarehousecd) {
        __modifiedProperties.add("distwarehousecd");
        this._distwarehousecd = distwarehousecd;
    }

    /**
     * [get] RCVKEY: {varchar(255)} <br>
     * 入庫キー
     * @return The value of the column 'RCVKEY'. (NullAllowed)
     */
    public String getRcvkey() {
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {varchar(255)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed)
     */
    public void setRcvkey(String rcvkey) {
        __modifiedProperties.add("rcvkey");
        this._rcvkey = rcvkey;
    }

    /**
     * [get] ITEMCD_WH: {varchar(255)} <br>
     * 倉庫内銘柄CD
     * @return The value of the column 'ITEMCD_WH'. (NullAllowed)
     */
    public String getItemcdWh() {
        return _itemcdWh;
    }

    /**
     * [set] ITEMCD_WH: {varchar(255)} <br>
     * 倉庫内銘柄CD
     * @param itemcdWh The value of the column 'ITEMCD_WH'. (NullAllowed)
     */
    public void setItemcdWh(String itemcdWh) {
        __modifiedProperties.add("itemcdWh");
        this._itemcdWh = itemcdWh;
    }

    /**
     * [get] DESIGNCD: {varchar(255)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public String getDesigncd() {
        return _designcd;
    }

    /**
     * [set] DESIGNCD: {varchar(255)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public void setDesigncd(String designcd) {
        __modifiedProperties.add("designcd");
        this._designcd = designcd;
    }

    /**
     * [get] INV_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳(保管場)
     * @return The value of the column 'INV_NUM'. (NullAllowed)
     */
    public String getInvNum() {
        return _invNum;
    }

    /**
     * [set] INV_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳(保管場)
     * @param invNum The value of the column 'INV_NUM'. (NullAllowed)
     */
    public void setInvNum(String invNum) {
        __modifiedProperties.add("invNum");
        this._invNum = invNum;
    }

    /**
     * [get] SORT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳(仕分場)
     * @return The value of the column 'SORT_NUM'. (NullAllowed)
     */
    public String getSortNum() {
        return _sortNum;
    }

    /**
     * [set] SORT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳(仕分場)
     * @param sortNum The value of the column 'SORT_NUM'. (NullAllowed)
     */
    public void setSortNum(String sortNum) {
        __modifiedProperties.add("sortNum");
        this._sortNum = sortNum;
    }

    /**
     * [get] ADOPT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳(引取場)
     * @return The value of the column 'ADOPT_NUM'. (NullAllowed)
     */
    public String getAdoptNum() {
        return _adoptNum;
    }

    /**
     * [set] ADOPT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳(引取場)
     * @param adoptNum The value of the column 'ADOPT_NUM'. (NullAllowed)
     */
    public void setAdoptNum(String adoptNum) {
        __modifiedProperties.add("adoptNum");
        this._adoptNum = adoptNum;
    }

    /**
     * [get] DT_EXTDATA2: {varchar(255)} <br>
     * 配達年月日
     * @return The value of the column 'DT_EXTDATA2'. (NullAllowed)
     */
    public String getDtExtdata2() {
        return _dtExtdata2;
    }

    /**
     * [set] DT_EXTDATA2: {varchar(255)} <br>
     * 配達年月日
     * @param dtExtdata2 The value of the column 'DT_EXTDATA2'. (NullAllowed)
     */
    public void setDtExtdata2(String dtExtdata2) {
        __modifiedProperties.add("dtExtdata2");
        this._dtExtdata2 = dtExtdata2;
    }

    /**
     * [get] RESERVEAREA: {varchar(255)} <br>
     * 予備領域
     * @return The value of the column 'RESERVEAREA'. (NullAllowed)
     */
    public String getReservearea() {
        return _reservearea;
    }

    /**
     * [set] RESERVEAREA: {varchar(255)} <br>
     * 予備領域
     * @param reservearea The value of the column 'RESERVEAREA'. (NullAllowed)
     */
    public void setReservearea(String reservearea) {
        __modifiedProperties.add("reservearea");
        this._reservearea = reservearea;
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

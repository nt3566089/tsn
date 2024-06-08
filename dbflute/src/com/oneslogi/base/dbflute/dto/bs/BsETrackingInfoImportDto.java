package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_TRACKING_INFO_IMPORT as TABLE. <br>
 * 追跡情報送信テーブル（輸入）
 * <pre>
 * [primary-key]
 *     TRACKING_INFO_IMPORT_ID
 *
 * [column]
 *     TRACKING_INFO_IMPORT_ID, SYMBOLPOSKEY, WAREHOUSECD, WAREHOUSE_SNAME, FACTORY_SNAME, FACTORYCD, ITEMCD_CASE, ITEM_SNAME_CASE, ITEMCD_WH, ITEM_SNAME_WH, RCVKEY, MACHINENO, CREATENO, LIMITDATENOW, DESIGNCD_CASE, LOT1, MANUFACTURECD, OTHERLOT1, CASECREATETYPE, CASECREATETYPE_NM, RECEIVEDATE, ARRIVALPORTDATE, SHIPNAME, INITNUM, MIXEDFLG, LENDFLG, LOCGROUP, LOCCD, SHIPDATE, CURRENT_LOCATION_CD, CURRENT_LOCATION_SNAME, ADDDATETIME, TRACETYPE, OTHERCD1, EXAMSTS, CASEINNUMBOWL, SHIPNUMBOWL, SUPPLIERRCVNO, TOKUHANCD, TOKUHAN_NM, MAKERCASENO, CASEITFNO, CASEBARCODEVALIANT, CASELOT4, CASECENTERNO, CASEPACKNO, CASEPACKTIME, SENDER_LOCATION, RECEIVER_LOCATION, SHIPMENT_ID, SHIPMENT_DATE, NUMBER_OF_PALLETS, CARRIERNO, TKHNORDERNO, SRCCD, BLNO, INVOICENO, SSCC, CASENO, INV_NUM, SORT_NUM, ADOPT_NUM, SEND_CD, SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRACKING_INFO_IMPORT_ID
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
public abstract class BsETrackingInfoImportDto implements Serializable {

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
    /** TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trackingInfoImportId;

    /** SYMBOLPOSKEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _symbolposkey;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** WAREHOUSE_SNAME: {NotNull, varchar(100)} */
    @JsonKey
    protected String _warehouseSname;

    /** FACTORY_SNAME: {NotNull, varchar(30)} */
    @JsonKey
    protected String _factorySname;

    /** FACTORYCD: {NotNull, varchar(100)} */
    @JsonKey
    protected String _factorycd;

    /** ITEMCD_CASE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _itemcdCase;

    /** ITEM_SNAME_CASE: {NotNull, varchar(60)} */
    @JsonKey
    protected String _itemSnameCase;

    /** ITEMCD_WH: {NotNull, varchar(30)} */
    @JsonKey
    protected String _itemcdWh;

    /** ITEM_SNAME_WH: {NotNull, varchar(60)} */
    @JsonKey
    protected String _itemSnameWh;

    /** RCVKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvkey;

    /** MACHINENO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _machineno;

    /** CREATENO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _createno;

    /** LIMITDATENOW: {NotNull, varchar(8)} */
    @JsonKey
    protected String _limitdatenow;

    /** DESIGNCD_CASE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _designcdCase;

    /** LOT1: {varchar(60)} */
    @JsonKey
    protected String _lot1;

    /** MANUFACTURECD: {varchar(60)} */
    @JsonKey
    protected String _manufacturecd;

    /** OTHERLOT1: {varchar(60)} */
    @JsonKey
    protected String _otherlot1;

    /** CASECREATETYPE: {varchar(30)} */
    @JsonKey
    protected String _casecreatetype;

    /** CASECREATETYPE_NM: {varchar(60)} */
    @JsonKey
    protected String _casecreatetypeNm;

    /** RECEIVEDATE: {varchar(8)} */
    @JsonKey
    protected String _receivedate;

    /** ARRIVALPORTDATE: {varchar(8)} */
    @JsonKey
    protected String _arrivalportdate;

    /** SHIPNAME: {varchar(100)} */
    @JsonKey
    protected String _shipname;

    /** INITNUM: {bigint(19)} */
    @JsonKey
    protected Long _initnum;

    /** MIXEDFLG: {char(1)} */
    @JsonKey
    protected String _mixedflg;

    /** LENDFLG: {char(1)} */
    @JsonKey
    protected String _lendflg;

    /** LOCGROUP: {varchar(30)} */
    @JsonKey
    protected String _locgroup;

    /** LOCCD: {varchar(30)} */
    @JsonKey
    protected String _loccd;

    /** SHIPDATE: {varchar(8)} */
    @JsonKey
    protected String _shipdate;

    /** CURRENT_LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _currentLocationCd;

    /** CURRENT_LOCATION_SNAME: {varchar(100)} */
    @JsonKey
    protected String _currentLocationSname;

    /** ADDDATETIME: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _adddatetime;

    /** TRACETYPE: {varchar(30)} */
    @JsonKey
    protected String _tracetype;

    /** OTHERCD1: {varchar(60)} */
    @JsonKey
    protected String _othercd1;

    /** EXAMSTS: {bigint(19)} */
    @JsonKey
    protected Long _examsts;

    /** CASEINNUMBOWL: {bigint(19)} */
    @JsonKey
    protected Long _caseinnumbowl;

    /** SHIPNUMBOWL: {bigint(19)} */
    @JsonKey
    protected Long _shipnumbowl;

    /** SUPPLIERRCVNO: {varchar(60)} */
    @JsonKey
    protected String _supplierrcvno;

    /** TOKUHANCD: {varchar(100)} */
    @JsonKey
    protected String _tokuhancd;

    /** TOKUHAN_NM: {varchar(60)} */
    @JsonKey
    protected String _tokuhanNm;

    /** MAKERCASENO: {varchar(60)} */
    @JsonKey
    protected String _makercaseno;

    /** CASEITFNO: {varchar(30)} */
    @JsonKey
    protected String _caseitfno;

    /** CASEBARCODEVALIANT: {varchar(30)} */
    @JsonKey
    protected String _casebarcodevaliant;

    /** CASELOT4: {varchar(30)} */
    @JsonKey
    protected String _caselot4;

    /** CASECENTERNO: {varchar(30)} */
    @JsonKey
    protected String _casecenterno;

    /** CASEPACKNO: {varchar(30)} */
    @JsonKey
    protected String _casepackno;

    /** CASEPACKTIME: {varchar(30)} */
    @JsonKey
    protected String _casepacktime;

    /** SENDER_LOCATION: {varchar(30)} */
    @JsonKey
    protected String _senderLocation;

    /** RECEIVER_LOCATION: {varchar(30)} */
    @JsonKey
    protected String _receiverLocation;

    /** SHIPMENT_ID: {varchar(30)} */
    @JsonKey
    protected String _shipmentId;

    /** SHIPMENT_DATE: {varchar(30)} */
    @JsonKey
    protected String _shipmentDate;

    /** NUMBER_OF_PALLETS: {varchar(30)} */
    @JsonKey
    protected String _numberOfPallets;

    /** CARRIERNO: {varchar(30)} */
    @JsonKey
    protected String _carrierno;

    /** TKHNORDERNO: {varchar(30)} */
    @JsonKey
    protected String _tkhnorderno;

    /** SRCCD: {varchar(30)} */
    @JsonKey
    protected String _srccd;

    /** BLNO: {varchar(60)} */
    @JsonKey
    protected String _blno;

    /** INVOICENO: {varchar(60)} */
    @JsonKey
    protected String _invoiceno;

    /** SSCC: {varchar(30)} */
    @JsonKey
    protected String _sscc;

    /** CASENO: {varchar(30)} */
    @JsonKey
    protected String _caseno;

    /** INV_NUM: {bigint(19)} */
    @JsonKey
    protected Long _invNum;

    /** SORT_NUM: {bigint(19)} */
    @JsonKey
    protected Long _sortNum;

    /** ADOPT_NUM: {bigint(19)} */
    @JsonKey
    protected Long _adoptNum;

    /** SEND_CD: {varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** SEND_FLG: {NotNull, char(1)} */
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
    public BsETrackingInfoImportDto() {
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
        if (other == null || !(other instanceof BsETrackingInfoImportDto)) { return false; }
        final BsETrackingInfoImportDto otherEntity = (BsETrackingInfoImportDto)other;
        if (!helpComparingValue(getTrackingInfoImportId(), otherEntity.getTrackingInfoImportId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_TRACKING_INFO_IMPORT");
        result = xCH(result, getTrackingInfoImportId());
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
        sb.append(c).append(getTrackingInfoImportId());
        sb.append(c).append(getSymbolposkey());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getWarehouseSname());
        sb.append(c).append(getFactorySname());
        sb.append(c).append(getFactorycd());
        sb.append(c).append(getItemcdCase());
        sb.append(c).append(getItemSnameCase());
        sb.append(c).append(getItemcdWh());
        sb.append(c).append(getItemSnameWh());
        sb.append(c).append(getRcvkey());
        sb.append(c).append(getMachineno());
        sb.append(c).append(getCreateno());
        sb.append(c).append(getLimitdatenow());
        sb.append(c).append(getDesigncdCase());
        sb.append(c).append(getLot1());
        sb.append(c).append(getManufacturecd());
        sb.append(c).append(getOtherlot1());
        sb.append(c).append(getCasecreatetype());
        sb.append(c).append(getCasecreatetypeNm());
        sb.append(c).append(getReceivedate());
        sb.append(c).append(getArrivalportdate());
        sb.append(c).append(getShipname());
        sb.append(c).append(getInitnum());
        sb.append(c).append(getMixedflg());
        sb.append(c).append(getLendflg());
        sb.append(c).append(getLocgroup());
        sb.append(c).append(getLoccd());
        sb.append(c).append(getShipdate());
        sb.append(c).append(getCurrentLocationCd());
        sb.append(c).append(getCurrentLocationSname());
        sb.append(c).append(getAdddatetime());
        sb.append(c).append(getTracetype());
        sb.append(c).append(getOthercd1());
        sb.append(c).append(getExamsts());
        sb.append(c).append(getCaseinnumbowl());
        sb.append(c).append(getShipnumbowl());
        sb.append(c).append(getSupplierrcvno());
        sb.append(c).append(getTokuhancd());
        sb.append(c).append(getTokuhanNm());
        sb.append(c).append(getMakercaseno());
        sb.append(c).append(getCaseitfno());
        sb.append(c).append(getCasebarcodevaliant());
        sb.append(c).append(getCaselot4());
        sb.append(c).append(getCasecenterno());
        sb.append(c).append(getCasepackno());
        sb.append(c).append(getCasepacktime());
        sb.append(c).append(getSenderLocation());
        sb.append(c).append(getReceiverLocation());
        sb.append(c).append(getShipmentId());
        sb.append(c).append(getShipmentDate());
        sb.append(c).append(getNumberOfPallets());
        sb.append(c).append(getCarrierno());
        sb.append(c).append(getTkhnorderno());
        sb.append(c).append(getSrccd());
        sb.append(c).append(getBlno());
        sb.append(c).append(getInvoiceno());
        sb.append(c).append(getSscc());
        sb.append(c).append(getCaseno());
        sb.append(c).append(getInvNum());
        sb.append(c).append(getSortNum());
        sb.append(c).append(getAdoptNum());
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
     * [get] TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 追跡情報送信（輸入）ID
     * @return The value of the column 'TRACKING_INFO_IMPORT_ID'. (NullAllowed)
     */
    public Long getTrackingInfoImportId() {
        return _trackingInfoImportId;
    }

    /**
     * [set] TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 追跡情報送信（輸入）ID
     * @param trackingInfoImportId The value of the column 'TRACKING_INFO_IMPORT_ID'. (NullAllowed)
     */
    public void setTrackingInfoImportId(Long trackingInfoImportId) {
        __modifiedProperties.add("trackingInfoImportId");
        this._trackingInfoImportId = trackingInfoImportId;
    }

    /**
     * [get] SYMBOLPOSKEY: {NotNull, bigint(19)} <br>
     * 追跡キー
     * @return The value of the column 'SYMBOLPOSKEY'. (NullAllowed)
     */
    public Long getSymbolposkey() {
        return _symbolposkey;
    }

    /**
     * [set] SYMBOLPOSKEY: {NotNull, bigint(19)} <br>
     * 追跡キー
     * @param symbolposkey The value of the column 'SYMBOLPOSKEY'. (NullAllowed)
     */
    public void setSymbolposkey(Long symbolposkey) {
        __modifiedProperties.add("symbolposkey");
        this._symbolposkey = symbolposkey;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 作成拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 作成拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] WAREHOUSE_SNAME: {NotNull, varchar(100)} <br>
     * 作成拠点名称
     * @return The value of the column 'WAREHOUSE_SNAME'. (NullAllowed)
     */
    public String getWarehouseSname() {
        return _warehouseSname;
    }

    /**
     * [set] WAREHOUSE_SNAME: {NotNull, varchar(100)} <br>
     * 作成拠点名称
     * @param warehouseSname The value of the column 'WAREHOUSE_SNAME'. (NullAllowed)
     */
    public void setWarehouseSname(String warehouseSname) {
        __modifiedProperties.add("warehouseSname");
        this._warehouseSname = warehouseSname;
    }

    /**
     * [get] FACTORY_SNAME: {NotNull, varchar(30)} <br>
     * 工場CD
     * @return The value of the column 'FACTORY_SNAME'. (NullAllowed)
     */
    public String getFactorySname() {
        return _factorySname;
    }

    /**
     * [set] FACTORY_SNAME: {NotNull, varchar(30)} <br>
     * 工場CD
     * @param factorySname The value of the column 'FACTORY_SNAME'. (NullAllowed)
     */
    public void setFactorySname(String factorySname) {
        __modifiedProperties.add("factorySname");
        this._factorySname = factorySname;
    }

    /**
     * [get] FACTORYCD: {NotNull, varchar(100)} <br>
     * 工場名称
     * @return The value of the column 'FACTORYCD'. (NullAllowed)
     */
    public String getFactorycd() {
        return _factorycd;
    }

    /**
     * [set] FACTORYCD: {NotNull, varchar(100)} <br>
     * 工場名称
     * @param factorycd The value of the column 'FACTORYCD'. (NullAllowed)
     */
    public void setFactorycd(String factorycd) {
        __modifiedProperties.add("factorycd");
        this._factorycd = factorycd;
    }

    /**
     * [get] ITEMCD_CASE: {NotNull, varchar(30)} <br>
     * 銘柄CD（シンボル）
     * @return The value of the column 'ITEMCD_CASE'. (NullAllowed)
     */
    public String getItemcdCase() {
        return _itemcdCase;
    }

    /**
     * [set] ITEMCD_CASE: {NotNull, varchar(30)} <br>
     * 銘柄CD（シンボル）
     * @param itemcdCase The value of the column 'ITEMCD_CASE'. (NullAllowed)
     */
    public void setItemcdCase(String itemcdCase) {
        __modifiedProperties.add("itemcdCase");
        this._itemcdCase = itemcdCase;
    }

    /**
     * [get] ITEM_SNAME_CASE: {NotNull, varchar(60)} <br>
     * 銘柄名称（シンボル）
     * @return The value of the column 'ITEM_SNAME_CASE'. (NullAllowed)
     */
    public String getItemSnameCase() {
        return _itemSnameCase;
    }

    /**
     * [set] ITEM_SNAME_CASE: {NotNull, varchar(60)} <br>
     * 銘柄名称（シンボル）
     * @param itemSnameCase The value of the column 'ITEM_SNAME_CASE'. (NullAllowed)
     */
    public void setItemSnameCase(String itemSnameCase) {
        __modifiedProperties.add("itemSnameCase");
        this._itemSnameCase = itemSnameCase;
    }

    /**
     * [get] ITEMCD_WH: {NotNull, varchar(30)} <br>
     * 銘柄CD（現在）
     * @return The value of the column 'ITEMCD_WH'. (NullAllowed)
     */
    public String getItemcdWh() {
        return _itemcdWh;
    }

    /**
     * [set] ITEMCD_WH: {NotNull, varchar(30)} <br>
     * 銘柄CD（現在）
     * @param itemcdWh The value of the column 'ITEMCD_WH'. (NullAllowed)
     */
    public void setItemcdWh(String itemcdWh) {
        __modifiedProperties.add("itemcdWh");
        this._itemcdWh = itemcdWh;
    }

    /**
     * [get] ITEM_SNAME_WH: {NotNull, varchar(60)} <br>
     * 銘柄名称（現在）
     * @return The value of the column 'ITEM_SNAME_WH'. (NullAllowed)
     */
    public String getItemSnameWh() {
        return _itemSnameWh;
    }

    /**
     * [set] ITEM_SNAME_WH: {NotNull, varchar(60)} <br>
     * 銘柄名称（現在）
     * @param itemSnameWh The value of the column 'ITEM_SNAME_WH'. (NullAllowed)
     */
    public void setItemSnameWh(String itemSnameWh) {
        __modifiedProperties.add("itemSnameWh");
        this._itemSnameWh = itemSnameWh;
    }

    /**
     * [get] RCVKEY: {NotNull, decimal(16, 6)} <br>
     * 入庫キー
     * @return The value of the column 'RCVKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvkey() {
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {NotNull, decimal(16, 6)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        __modifiedProperties.add("rcvkey");
        this._rcvkey = rcvkey;
    }

    /**
     * [get] MACHINENO: {NotNull, varchar(30)} <br>
     * 号機
     * @return The value of the column 'MACHINENO'. (NullAllowed)
     */
    public String getMachineno() {
        return _machineno;
    }

    /**
     * [set] MACHINENO: {NotNull, varchar(30)} <br>
     * 号機
     * @param machineno The value of the column 'MACHINENO'. (NullAllowed)
     */
    public void setMachineno(String machineno) {
        __modifiedProperties.add("machineno");
        this._machineno = machineno;
    }

    /**
     * [get] CREATENO: {NotNull, varchar(30)} <br>
     * 生出番号
     * @return The value of the column 'CREATENO'. (NullAllowed)
     */
    public String getCreateno() {
        return _createno;
    }

    /**
     * [set] CREATENO: {NotNull, varchar(30)} <br>
     * 生出番号
     * @param createno The value of the column 'CREATENO'. (NullAllowed)
     */
    public void setCreateno(String createno) {
        __modifiedProperties.add("createno");
        this._createno = createno;
    }

    /**
     * [get] LIMITDATENOW: {NotNull, varchar(8)} <br>
     * 製造年月日（現在）
     * @return The value of the column 'LIMITDATENOW'. (NullAllowed)
     */
    public String getLimitdatenow() {
        return _limitdatenow;
    }

    /**
     * [set] LIMITDATENOW: {NotNull, varchar(8)} <br>
     * 製造年月日（現在）
     * @param limitdatenow The value of the column 'LIMITDATENOW'. (NullAllowed)
     */
    public void setLimitdatenow(String limitdatenow) {
        __modifiedProperties.add("limitdatenow");
        this._limitdatenow = limitdatenow;
    }

    /**
     * [get] DESIGNCD_CASE: {NotNull, varchar(30)} <br>
     * デザイン区分（シンボル）
     * @return The value of the column 'DESIGNCD_CASE'. (NullAllowed)
     */
    public String getDesigncdCase() {
        return _designcdCase;
    }

    /**
     * [set] DESIGNCD_CASE: {NotNull, varchar(30)} <br>
     * デザイン区分（シンボル）
     * @param designcdCase The value of the column 'DESIGNCD_CASE'. (NullAllowed)
     */
    public void setDesigncdCase(String designcdCase) {
        __modifiedProperties.add("designcdCase");
        this._designcdCase = designcdCase;
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
     * [get] MANUFACTURECD: {varchar(60)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURECD'. (NullAllowed)
     */
    public String getManufacturecd() {
        return _manufacturecd;
    }

    /**
     * [set] MANUFACTURECD: {varchar(60)} <br>
     * 製造記号
     * @param manufacturecd The value of the column 'MANUFACTURECD'. (NullAllowed)
     */
    public void setManufacturecd(String manufacturecd) {
        __modifiedProperties.add("manufacturecd");
        this._manufacturecd = manufacturecd;
    }

    /**
     * [get] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @return The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public String getOtherlot1() {
        return _otherlot1;
    }

    /**
     * [set] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public void setOtherlot1(String otherlot1) {
        __modifiedProperties.add("otherlot1");
        this._otherlot1 = otherlot1;
    }

    /**
     * [get] CASECREATETYPE: {varchar(30)} <br>
     * ケース作成区分
     * @return The value of the column 'CASECREATETYPE'. (NullAllowed)
     */
    public String getCasecreatetype() {
        return _casecreatetype;
    }

    /**
     * [set] CASECREATETYPE: {varchar(30)} <br>
     * ケース作成区分
     * @param casecreatetype The value of the column 'CASECREATETYPE'. (NullAllowed)
     */
    public void setCasecreatetype(String casecreatetype) {
        __modifiedProperties.add("casecreatetype");
        this._casecreatetype = casecreatetype;
    }

    /**
     * [get] CASECREATETYPE_NM: {varchar(60)} <br>
     * ケース作成区分名称
     * @return The value of the column 'CASECREATETYPE_NM'. (NullAllowed)
     */
    public String getCasecreatetypeNm() {
        return _casecreatetypeNm;
    }

    /**
     * [set] CASECREATETYPE_NM: {varchar(60)} <br>
     * ケース作成区分名称
     * @param casecreatetypeNm The value of the column 'CASECREATETYPE_NM'. (NullAllowed)
     */
    public void setCasecreatetypeNm(String casecreatetypeNm) {
        __modifiedProperties.add("casecreatetypeNm");
        this._casecreatetypeNm = casecreatetypeNm;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public String getReceivedate() {
        return _receivedate;
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public void setReceivedate(String receivedate) {
        __modifiedProperties.add("receivedate");
        this._receivedate = receivedate;
    }

    /**
     * [get] ARRIVALPORTDATE: {varchar(8)} <br>
     * 入港日
     * @return The value of the column 'ARRIVALPORTDATE'. (NullAllowed)
     */
    public String getArrivalportdate() {
        return _arrivalportdate;
    }

    /**
     * [set] ARRIVALPORTDATE: {varchar(8)} <br>
     * 入港日
     * @param arrivalportdate The value of the column 'ARRIVALPORTDATE'. (NullAllowed)
     */
    public void setArrivalportdate(String arrivalportdate) {
        __modifiedProperties.add("arrivalportdate");
        this._arrivalportdate = arrivalportdate;
    }

    /**
     * [get] SHIPNAME: {varchar(100)} <br>
     * 船名
     * @return The value of the column 'SHIPNAME'. (NullAllowed)
     */
    public String getShipname() {
        return _shipname;
    }

    /**
     * [set] SHIPNAME: {varchar(100)} <br>
     * 船名
     * @param shipname The value of the column 'SHIPNAME'. (NullAllowed)
     */
    public void setShipname(String shipname) {
        __modifiedProperties.add("shipname");
        this._shipname = shipname;
    }

    /**
     * [get] INITNUM: {bigint(19)} <br>
     * ケース初期数量
     * @return The value of the column 'INITNUM'. (NullAllowed)
     */
    public Long getInitnum() {
        return _initnum;
    }

    /**
     * [set] INITNUM: {bigint(19)} <br>
     * ケース初期数量
     * @param initnum The value of the column 'INITNUM'. (NullAllowed)
     */
    public void setInitnum(Long initnum) {
        __modifiedProperties.add("initnum");
        this._initnum = initnum;
    }

    /**
     * [get] MIXEDFLG: {char(1)} <br>
     * 開封フラグ
     * @return The value of the column 'MIXEDFLG'. (NullAllowed)
     */
    public String getMixedflg() {
        return _mixedflg;
    }

    /**
     * [set] MIXEDFLG: {char(1)} <br>
     * 開封フラグ
     * @param mixedflg The value of the column 'MIXEDFLG'. (NullAllowed)
     */
    public void setMixedflg(String mixedflg) {
        __modifiedProperties.add("mixedflg");
        this._mixedflg = mixedflg;
    }

    /**
     * [get] LENDFLG: {char(1)} <br>
     * 融通フラグ
     * @return The value of the column 'LENDFLG'. (NullAllowed)
     */
    public String getLendflg() {
        return _lendflg;
    }

    /**
     * [set] LENDFLG: {char(1)} <br>
     * 融通フラグ
     * @param lendflg The value of the column 'LENDFLG'. (NullAllowed)
     */
    public void setLendflg(String lendflg) {
        __modifiedProperties.add("lendflg");
        this._lendflg = lendflg;
    }

    /**
     * [get] LOCGROUP: {varchar(30)} <br>
     * ロケグループ
     * @return The value of the column 'LOCGROUP'. (NullAllowed)
     */
    public String getLocgroup() {
        return _locgroup;
    }

    /**
     * [set] LOCGROUP: {varchar(30)} <br>
     * ロケグループ
     * @param locgroup The value of the column 'LOCGROUP'. (NullAllowed)
     */
    public void setLocgroup(String locgroup) {
        __modifiedProperties.add("locgroup");
        this._locgroup = locgroup;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * ロケCD
     * @return The value of the column 'LOCCD'. (NullAllowed)
     */
    public String getLoccd() {
        return _loccd;
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * ロケCD
     * @param loccd The value of the column 'LOCCD'. (NullAllowed)
     */
    public void setLoccd(String loccd) {
        __modifiedProperties.add("loccd");
        this._loccd = loccd;
    }

    /**
     * [get] SHIPDATE: {varchar(8)} <br>
     * 出庫日
     * @return The value of the column 'SHIPDATE'. (NullAllowed)
     */
    public String getShipdate() {
        return _shipdate;
    }

    /**
     * [set] SHIPDATE: {varchar(8)} <br>
     * 出庫日
     * @param shipdate The value of the column 'SHIPDATE'. (NullAllowed)
     */
    public void setShipdate(String shipdate) {
        __modifiedProperties.add("shipdate");
        this._shipdate = shipdate;
    }

    /**
     * [get] CURRENT_LOCATION_CD: {varchar(30)} <br>
     * 現在地CD
     * @return The value of the column 'CURRENT_LOCATION_CD'. (NullAllowed)
     */
    public String getCurrentLocationCd() {
        return _currentLocationCd;
    }

    /**
     * [set] CURRENT_LOCATION_CD: {varchar(30)} <br>
     * 現在地CD
     * @param currentLocationCd The value of the column 'CURRENT_LOCATION_CD'. (NullAllowed)
     */
    public void setCurrentLocationCd(String currentLocationCd) {
        __modifiedProperties.add("currentLocationCd");
        this._currentLocationCd = currentLocationCd;
    }

    /**
     * [get] CURRENT_LOCATION_SNAME: {varchar(100)} <br>
     * 現在地名称
     * @return The value of the column 'CURRENT_LOCATION_SNAME'. (NullAllowed)
     */
    public String getCurrentLocationSname() {
        return _currentLocationSname;
    }

    /**
     * [set] CURRENT_LOCATION_SNAME: {varchar(100)} <br>
     * 現在地名称
     * @param currentLocationSname The value of the column 'CURRENT_LOCATION_SNAME'. (NullAllowed)
     */
    public void setCurrentLocationSname(String currentLocationSname) {
        __modifiedProperties.add("currentLocationSname");
        this._currentLocationSname = currentLocationSname;
    }

    /**
     * [get] ADDDATETIME: {datetime2(26, 6)} <br>
     * 情報作成日
     * @return The value of the column 'ADDDATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAdddatetime() {
        return _adddatetime;
    }

    /**
     * [set] ADDDATETIME: {datetime2(26, 6)} <br>
     * 情報作成日
     * @param adddatetime The value of the column 'ADDDATETIME'. (NullAllowed)
     */
    public void setAdddatetime(java.sql.Timestamp adddatetime) {
        __modifiedProperties.add("adddatetime");
        this._adddatetime = adddatetime;
    }

    /**
     * [get] TRACETYPE: {varchar(30)} <br>
     * 追跡区分
     * @return The value of the column 'TRACETYPE'. (NullAllowed)
     */
    public String getTracetype() {
        return _tracetype;
    }

    /**
     * [set] TRACETYPE: {varchar(30)} <br>
     * 追跡区分
     * @param tracetype The value of the column 'TRACETYPE'. (NullAllowed)
     */
    public void setTracetype(String tracetype) {
        __modifiedProperties.add("tracetype");
        this._tracetype = tracetype;
    }

    /**
     * [get] OTHERCD1: {varchar(60)} <br>
     * 追跡区分名称
     * @return The value of the column 'OTHERCD1'. (NullAllowed)
     */
    public String getOthercd1() {
        return _othercd1;
    }

    /**
     * [set] OTHERCD1: {varchar(60)} <br>
     * 追跡区分名称
     * @param othercd1 The value of the column 'OTHERCD1'. (NullAllowed)
     */
    public void setOthercd1(String othercd1) {
        __modifiedProperties.add("othercd1");
        this._othercd1 = othercd1;
    }

    /**
     * [get] EXAMSTS: {bigint(19)} <br>
     * 検査区分
     * @return The value of the column 'EXAMSTS'. (NullAllowed)
     */
    public Long getExamsts() {
        return _examsts;
    }

    /**
     * [set] EXAMSTS: {bigint(19)} <br>
     * 検査区分
     * @param examsts The value of the column 'EXAMSTS'. (NullAllowed)
     */
    public void setExamsts(Long examsts) {
        __modifiedProperties.add("examsts");
        this._examsts = examsts;
    }

    /**
     * [get] CASEINNUMBOWL: {bigint(19)} <br>
     * ケース内数量（カートン）
     * @return The value of the column 'CASEINNUMBOWL'. (NullAllowed)
     */
    public Long getCaseinnumbowl() {
        return _caseinnumbowl;
    }

    /**
     * [set] CASEINNUMBOWL: {bigint(19)} <br>
     * ケース内数量（カートン）
     * @param caseinnumbowl The value of the column 'CASEINNUMBOWL'. (NullAllowed)
     */
    public void setCaseinnumbowl(Long caseinnumbowl) {
        __modifiedProperties.add("caseinnumbowl");
        this._caseinnumbowl = caseinnumbowl;
    }

    /**
     * [get] SHIPNUMBOWL: {bigint(19)} <br>
     * 出庫数量（カートン）
     * @return The value of the column 'SHIPNUMBOWL'. (NullAllowed)
     */
    public Long getShipnumbowl() {
        return _shipnumbowl;
    }

    /**
     * [set] SHIPNUMBOWL: {bigint(19)} <br>
     * 出庫数量（カートン）
     * @param shipnumbowl The value of the column 'SHIPNUMBOWL'. (NullAllowed)
     */
    public void setShipnumbowl(Long shipnumbowl) {
        __modifiedProperties.add("shipnumbowl");
        this._shipnumbowl = shipnumbowl;
    }

    /**
     * [get] SUPPLIERRCVNO: {varchar(60)} <br>
     * 保税管理番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public String getSupplierrcvno() {
        return _supplierrcvno;
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(60)} <br>
     * 保税管理番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        __modifiedProperties.add("supplierrcvno");
        this._supplierrcvno = supplierrcvno;
    }

    /**
     * [get] TOKUHANCD: {varchar(100)} <br>
     * 特販業者CD
     * @return The value of the column 'TOKUHANCD'. (NullAllowed)
     */
    public String getTokuhancd() {
        return _tokuhancd;
    }

    /**
     * [set] TOKUHANCD: {varchar(100)} <br>
     * 特販業者CD
     * @param tokuhancd The value of the column 'TOKUHANCD'. (NullAllowed)
     */
    public void setTokuhancd(String tokuhancd) {
        __modifiedProperties.add("tokuhancd");
        this._tokuhancd = tokuhancd;
    }

    /**
     * [get] TOKUHAN_NM: {varchar(60)} <br>
     * 特販業者名称
     * @return The value of the column 'TOKUHAN_NM'. (NullAllowed)
     */
    public String getTokuhanNm() {
        return _tokuhanNm;
    }

    /**
     * [set] TOKUHAN_NM: {varchar(60)} <br>
     * 特販業者名称
     * @param tokuhanNm The value of the column 'TOKUHAN_NM'. (NullAllowed)
     */
    public void setTokuhanNm(String tokuhanNm) {
        __modifiedProperties.add("tokuhanNm");
        this._tokuhanNm = tokuhanNm;
    }

    /**
     * [get] MAKERCASENO: {varchar(60)} <br>
     * メーカーケースCD
     * @return The value of the column 'MAKERCASENO'. (NullAllowed)
     */
    public String getMakercaseno() {
        return _makercaseno;
    }

    /**
     * [set] MAKERCASENO: {varchar(60)} <br>
     * メーカーケースCD
     * @param makercaseno The value of the column 'MAKERCASENO'. (NullAllowed)
     */
    public void setMakercaseno(String makercaseno) {
        __modifiedProperties.add("makercaseno");
        this._makercaseno = makercaseno;
    }

    /**
     * [get] CASEITFNO: {varchar(30)} <br>
     * ITFNo
     * @return The value of the column 'CASEITFNO'. (NullAllowed)
     */
    public String getCaseitfno() {
        return _caseitfno;
    }

    /**
     * [set] CASEITFNO: {varchar(30)} <br>
     * ITFNo
     * @param caseitfno The value of the column 'CASEITFNO'. (NullAllowed)
     */
    public void setCaseitfno(String caseitfno) {
        __modifiedProperties.add("caseitfno");
        this._caseitfno = caseitfno;
    }

    /**
     * [get] CASEBARCODEVALIANT: {varchar(30)} <br>
     * Barcode Valiant
     * @return The value of the column 'CASEBARCODEVALIANT'. (NullAllowed)
     */
    public String getCasebarcodevaliant() {
        return _casebarcodevaliant;
    }

    /**
     * [set] CASEBARCODEVALIANT: {varchar(30)} <br>
     * Barcode Valiant
     * @param casebarcodevaliant The value of the column 'CASEBARCODEVALIANT'. (NullAllowed)
     */
    public void setCasebarcodevaliant(String casebarcodevaliant) {
        __modifiedProperties.add("casebarcodevaliant");
        this._casebarcodevaliant = casebarcodevaliant;
    }

    /**
     * [get] CASELOT4: {varchar(30)} <br>
     * 実製造年月日
     * @return The value of the column 'CASELOT4'. (NullAllowed)
     */
    public String getCaselot4() {
        return _caselot4;
    }

    /**
     * [set] CASELOT4: {varchar(30)} <br>
     * 実製造年月日
     * @param caselot4 The value of the column 'CASELOT4'. (NullAllowed)
     */
    public void setCaselot4(String caselot4) {
        __modifiedProperties.add("caselot4");
        this._caselot4 = caselot4;
    }

    /**
     * [get] CASECENTERNO: {varchar(30)} <br>
     * 拠点No.
     * @return The value of the column 'CASECENTERNO'. (NullAllowed)
     */
    public String getCasecenterno() {
        return _casecenterno;
    }

    /**
     * [set] CASECENTERNO: {varchar(30)} <br>
     * 拠点No.
     * @param casecenterno The value of the column 'CASECENTERNO'. (NullAllowed)
     */
    public void setCasecenterno(String casecenterno) {
        __modifiedProperties.add("casecenterno");
        this._casecenterno = casecenterno;
    }

    /**
     * [get] CASEPACKNO: {varchar(30)} <br>
     * ケースパッカーNo
     * @return The value of the column 'CASEPACKNO'. (NullAllowed)
     */
    public String getCasepackno() {
        return _casepackno;
    }

    /**
     * [set] CASEPACKNO: {varchar(30)} <br>
     * ケースパッカーNo
     * @param casepackno The value of the column 'CASEPACKNO'. (NullAllowed)
     */
    public void setCasepackno(String casepackno) {
        __modifiedProperties.add("casepackno");
        this._casepackno = casepackno;
    }

    /**
     * [get] CASEPACKTIME: {varchar(30)} <br>
     * ケースパッキング時間
     * @return The value of the column 'CASEPACKTIME'. (NullAllowed)
     */
    public String getCasepacktime() {
        return _casepacktime;
    }

    /**
     * [set] CASEPACKTIME: {varchar(30)} <br>
     * ケースパッキング時間
     * @param casepacktime The value of the column 'CASEPACKTIME'. (NullAllowed)
     */
    public void setCasepacktime(String casepacktime) {
        __modifiedProperties.add("casepacktime");
        this._casepacktime = casepacktime;
    }

    /**
     * [get] SENDER_LOCATION: {varchar(30)} <br>
     * 送信ロケーション
     * @return The value of the column 'SENDER_LOCATION'. (NullAllowed)
     */
    public String getSenderLocation() {
        return _senderLocation;
    }

    /**
     * [set] SENDER_LOCATION: {varchar(30)} <br>
     * 送信ロケーション
     * @param senderLocation The value of the column 'SENDER_LOCATION'. (NullAllowed)
     */
    public void setSenderLocation(String senderLocation) {
        __modifiedProperties.add("senderLocation");
        this._senderLocation = senderLocation;
    }

    /**
     * [get] RECEIVER_LOCATION: {varchar(30)} <br>
     * 受信ロケーション
     * @return The value of the column 'RECEIVER_LOCATION'. (NullAllowed)
     */
    public String getReceiverLocation() {
        return _receiverLocation;
    }

    /**
     * [set] RECEIVER_LOCATION: {varchar(30)} <br>
     * 受信ロケーション
     * @param receiverLocation The value of the column 'RECEIVER_LOCATION'. (NullAllowed)
     */
    public void setReceiverLocation(String receiverLocation) {
        __modifiedProperties.add("receiverLocation");
        this._receiverLocation = receiverLocation;
    }

    /**
     * [get] SHIPMENT_ID: {varchar(30)} <br>
     * 送信ID
     * @return The value of the column 'SHIPMENT_ID'. (NullAllowed)
     */
    public String getShipmentId() {
        return _shipmentId;
    }

    /**
     * [set] SHIPMENT_ID: {varchar(30)} <br>
     * 送信ID
     * @param shipmentId The value of the column 'SHIPMENT_ID'. (NullAllowed)
     */
    public void setShipmentId(String shipmentId) {
        __modifiedProperties.add("shipmentId");
        this._shipmentId = shipmentId;
    }

    /**
     * [get] SHIPMENT_DATE: {varchar(30)} <br>
     * 送信日
     * @return The value of the column 'SHIPMENT_DATE'. (NullAllowed)
     */
    public String getShipmentDate() {
        return _shipmentDate;
    }

    /**
     * [set] SHIPMENT_DATE: {varchar(30)} <br>
     * 送信日
     * @param shipmentDate The value of the column 'SHIPMENT_DATE'. (NullAllowed)
     */
    public void setShipmentDate(String shipmentDate) {
        __modifiedProperties.add("shipmentDate");
        this._shipmentDate = shipmentDate;
    }

    /**
     * [get] NUMBER_OF_PALLETS: {varchar(30)} <br>
     * パレット番号
     * @return The value of the column 'NUMBER_OF_PALLETS'. (NullAllowed)
     */
    public String getNumberOfPallets() {
        return _numberOfPallets;
    }

    /**
     * [set] NUMBER_OF_PALLETS: {varchar(30)} <br>
     * パレット番号
     * @param numberOfPallets The value of the column 'NUMBER_OF_PALLETS'. (NullAllowed)
     */
    public void setNumberOfPallets(String numberOfPallets) {
        __modifiedProperties.add("numberOfPallets");
        this._numberOfPallets = numberOfPallets;
    }

    /**
     * [get] CARRIERNO: {varchar(30)} <br>
     * コンテナNo
     * @return The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public String getCarrierno() {
        return _carrierno;
    }

    /**
     * [set] CARRIERNO: {varchar(30)} <br>
     * コンテナNo
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public void setCarrierno(String carrierno) {
        __modifiedProperties.add("carrierno");
        this._carrierno = carrierno;
    }

    /**
     * [get] TKHNORDERNO: {varchar(30)} <br>
     * オーダーNo
     * @return The value of the column 'TKHNORDERNO'. (NullAllowed)
     */
    public String getTkhnorderno() {
        return _tkhnorderno;
    }

    /**
     * [set] TKHNORDERNO: {varchar(30)} <br>
     * オーダーNo
     * @param tkhnorderno The value of the column 'TKHNORDERNO'. (NullAllowed)
     */
    public void setTkhnorderno(String tkhnorderno) {
        __modifiedProperties.add("tkhnorderno");
        this._tkhnorderno = tkhnorderno;
    }

    /**
     * [get] SRCCD: {varchar(30)} <br>
     * SRC_CD
     * @return The value of the column 'SRCCD'. (NullAllowed)
     */
    public String getSrccd() {
        return _srccd;
    }

    /**
     * [set] SRCCD: {varchar(30)} <br>
     * SRC_CD
     * @param srccd The value of the column 'SRCCD'. (NullAllowed)
     */
    public void setSrccd(String srccd) {
        __modifiedProperties.add("srccd");
        this._srccd = srccd;
    }

    /**
     * [get] BLNO: {varchar(60)} <br>
     * BLNo
     * @return The value of the column 'BLNO'. (NullAllowed)
     */
    public String getBlno() {
        return _blno;
    }

    /**
     * [set] BLNO: {varchar(60)} <br>
     * BLNo
     * @param blno The value of the column 'BLNO'. (NullAllowed)
     */
    public void setBlno(String blno) {
        __modifiedProperties.add("blno");
        this._blno = blno;
    }

    /**
     * [get] INVOICENO: {varchar(60)} <br>
     * InvoiceNo
     * @return The value of the column 'INVOICENO'. (NullAllowed)
     */
    public String getInvoiceno() {
        return _invoiceno;
    }

    /**
     * [set] INVOICENO: {varchar(60)} <br>
     * InvoiceNo
     * @param invoiceno The value of the column 'INVOICENO'. (NullAllowed)
     */
    public void setInvoiceno(String invoiceno) {
        __modifiedProperties.add("invoiceno");
        this._invoiceno = invoiceno;
    }

    /**
     * [get] SSCC: {varchar(30)} <br>
     * SSCC
     * @return The value of the column 'SSCC'. (NullAllowed)
     */
    public String getSscc() {
        return _sscc;
    }

    /**
     * [set] SSCC: {varchar(30)} <br>
     * SSCC
     * @param sscc The value of the column 'SSCC'. (NullAllowed)
     */
    public void setSscc(String sscc) {
        __modifiedProperties.add("sscc");
        this._sscc = sscc;
    }

    /**
     * [get] CASENO: {varchar(30)} <br>
     * ケース番号
     * @return The value of the column 'CASENO'. (NullAllowed)
     */
    public String getCaseno() {
        return _caseno;
    }

    /**
     * [set] CASENO: {varchar(30)} <br>
     * ケース番号
     * @param caseno The value of the column 'CASENO'. (NullAllowed)
     */
    public void setCaseno(String caseno) {
        __modifiedProperties.add("caseno");
        this._caseno = caseno;
    }

    /**
     * [get] INV_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（保管場）
     * @return The value of the column 'INV_NUM'. (NullAllowed)
     */
    public Long getInvNum() {
        return _invNum;
    }

    /**
     * [set] INV_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（保管場）
     * @param invNum The value of the column 'INV_NUM'. (NullAllowed)
     */
    public void setInvNum(Long invNum) {
        __modifiedProperties.add("invNum");
        this._invNum = invNum;
    }

    /**
     * [get] SORT_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（仕分場）
     * @return The value of the column 'SORT_NUM'. (NullAllowed)
     */
    public Long getSortNum() {
        return _sortNum;
    }

    /**
     * [set] SORT_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（仕分場）
     * @param sortNum The value of the column 'SORT_NUM'. (NullAllowed)
     */
    public void setSortNum(Long sortNum) {
        __modifiedProperties.add("sortNum");
        this._sortNum = sortNum;
    }

    /**
     * [get] ADOPT_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（引取場）
     * @return The value of the column 'ADOPT_NUM'. (NullAllowed)
     */
    public Long getAdoptNum() {
        return _adoptNum;
    }

    /**
     * [set] ADOPT_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（引取場）
     * @param adoptNum The value of the column 'ADOPT_NUM'. (NullAllowed)
     */
    public void setAdoptNum(Long adoptNum) {
        __modifiedProperties.add("adoptNum");
        this._adoptNum = adoptNum;
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
     * [get] SEND_FLG: {NotNull, char(1)} <br>
     * 送信済フラグ
     * @return The value of the column 'SEND_FLG'. (NullAllowed)
     */
    public String getSendFlg() {
        return _sendFlg;
    }

    /**
     * [set] SEND_FLG: {NotNull, char(1)} <br>
     * 送信済フラグ
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

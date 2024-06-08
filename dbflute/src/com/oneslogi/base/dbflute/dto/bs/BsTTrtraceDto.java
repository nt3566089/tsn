package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRTRACE as TABLE. <br>
 * 製品追跡情報
 * <pre>
 * [primary-key]
 *     TRTRACE_ID
 *
 * [column]
 *     TRTRACE_ID, TRACEKEY, SNDRCVDATETIME, WAREHOUSECD, FACTORYCD, ITEMCD_CASE, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO, MACHINENO, CREATENO, LIMITDATE, DATETIME, DISTRIBUTIONCD, TRANSPORTCD, PALLETID, INITNUM, CREATEDATETIME, ASSORTDATETIME, TRACETYPE, LINEBLOCK, ASSORTEDUNIT, ASSORTEDINDEX, OPERATIONCODE, CASEINNUM, ASSORTNUM, ASSORTDIFNUM, DIRECTIONCD, PISTONTYPE, CUSTOMERCD, DIRECTIONNUM, DISTWAREHOUSECD, RCVKEY, PRODUCT_CD, ITEMCD_IN, ITEMCD_WH, DESIGNCD_CASE, DESIGNCD_IN, DESIGNCD_WH, SOURCECASECD, SENDFLG, FROMFLG, SUPPLIERRCVNO, MIXEDFLG, SYMBOLPASTDATE, LOT1, LOT2, LOT3, LOT4, OTHERLOT1, MAKERCASENO, LENDFLG, CASEINNUMCALC, CASEITFNO, CASEBARCODEVALIANT, CASELOT4, CASECENTERNO, CASEPACKNO, CASEPACKTIME, CASEBARCODE, OTHERREFNO2, ORDERTYPE, LIMITDATENOW, CASECREATETYPE, RECEIVEDATE, ARRIVALPORTDATE, SHIPNAME, LOCGROUP, LOCCD, SHIPDATE, SHIPTOCD, EXAMSTS, TOKUHANCD, SENDER_LOCATION, RECEIVER_LOCATION, SHIPMENT_ID, SHIPMENT_DATE, NUMBER_OF_PALLETS, CARRIERNO, TKHNORDERNO, SRCCD, BLNO, INVOICENO, SSCC, CASENO, INV_NUM, SORT_NUM, ADOPT_NUM, RESERVEAREA, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, DT_EXTDATA2, PALLET_NO, PICK_LIST_KEY, FRONT_BACK_CASE_CD, CENTER_ID, CLIENT_ID, TRANSPORT_PRIORITY, USE_TYPE, OUTPUT_ORDER, FACTORY_ORDER, WAREHOUSE_ORDER, LINEBLOCK_ORDER, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRTRACE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrtraceDto implements Serializable {

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
    /** TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trtraceId;

    /** TRACEKEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _tracekey;

    /** SNDRCVDATETIME: {varchar(8)} */
    @JsonKey
    protected String _sndrcvdatetime;

    /** WAREHOUSECD: {IX, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** FACTORYCD: {varchar(30)} */
    @JsonKey
    protected String _factorycd;

    /** ITEMCD_CASE: {varchar(30)} */
    @JsonKey
    protected String _itemcdCase;

    /** SKUCD: {varchar(30)} */
    @JsonKey
    protected String _skucd;

    /** DESTINATIONCD: {varchar(30)} */
    @JsonKey
    protected String _destinationcd;

    /** MANUFACTURECD: {varchar(30)} */
    @JsonKey
    protected String _manufacturecd;

    /** ORDERNO: {varchar(30)} */
    @JsonKey
    protected String _orderno;

    /** MACHINENO: {varchar(30)} */
    @JsonKey
    protected String _machineno;

    /** CREATENO: {varchar(30)} */
    @JsonKey
    protected String _createno;

    /** LIMITDATE: {varchar(8)} */
    @JsonKey
    protected String _limitdate;

    /** DATETIME: {varchar(8)} */
    @JsonKey
    protected String _datetime;

    /** DISTRIBUTIONCD: {char(1)} */
    @JsonKey
    protected String _distributioncd;

    /** TRANSPORTCD: {varchar(30)} */
    @JsonKey
    protected String _transportcd;

    /** PALLETID: {varchar(30)} */
    @JsonKey
    protected String _palletid;

    /** INITNUM: {bigint(19)} */
    @JsonKey
    protected Long _initnum;

    /** CREATEDATETIME: {varchar(8)} */
    @JsonKey
    protected String _createdatetime;

    /** ASSORTDATETIME: {varchar(8)} */
    @JsonKey
    protected String _assortdatetime;

    /** TRACETYPE: {varchar(30)} */
    @JsonKey
    protected String _tracetype;

    /** LINEBLOCK: {varchar(30)} */
    @JsonKey
    protected String _lineblock;

    /** ASSORTEDUNIT: {varchar(255)} */
    @JsonKey
    protected String _assortedunit;

    /** ASSORTEDINDEX: {bigint(19)} */
    @JsonKey
    protected Long _assortedindex;

    /** OPERATIONCODE: {char(1)} */
    @JsonKey
    protected String _operationcode;

    /** CASEINNUM: {bigint(19)} */
    @JsonKey
    protected Long _caseinnum;

    /** ASSORTNUM: {bigint(19)} */
    @JsonKey
    protected Long _assortnum;

    /** ASSORTDIFNUM: {bigint(19)} */
    @JsonKey
    protected Long _assortdifnum;

    /** DIRECTIONCD: {varchar(30)} */
    @JsonKey
    protected String _directioncd;

    /** PISTONTYPE: {char(1)} */
    @JsonKey
    protected String _pistontype;

    /** CUSTOMERCD: {varchar(30)} */
    @JsonKey
    protected String _customercd;

    /** DIRECTIONNUM: {bigint(19)} */
    @JsonKey
    protected Long _directionnum;

    /** DISTWAREHOUSECD: {varchar(30)} */
    @JsonKey
    protected String _distwarehousecd;

    /** RCVKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvkey;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** ITEMCD_IN: {varchar(30)} */
    @JsonKey
    protected String _itemcdIn;

    /** ITEMCD_WH: {varchar(30)} */
    @JsonKey
    protected String _itemcdWh;

    /** DESIGNCD_CASE: {varchar(30)} */
    @JsonKey
    protected String _designcdCase;

    /** DESIGNCD_IN: {varchar(30)} */
    @JsonKey
    protected String _designcdIn;

    /** DESIGNCD_WH: {varchar(30)} */
    @JsonKey
    protected String _designcdWh;

    /** SOURCECASECD: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sourcecasecd;

    /** SENDFLG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sendflg;

    /** FROMFLG: {char(1)} */
    @JsonKey
    protected String _fromflg;

    /** SUPPLIERRCVNO: {varchar(60)} */
    @JsonKey
    protected String _supplierrcvno;

    /** MIXEDFLG: {char(1)} */
    @JsonKey
    protected String _mixedflg;

    /** SYMBOLPASTDATE: {varchar(8)} */
    @JsonKey
    protected String _symbolpastdate;

    /** LOT1: {varchar(60)} */
    @JsonKey
    protected String _lot1;

    /** LOT2: {varchar(60)} */
    @JsonKey
    protected String _lot2;

    /** LOT3: {varchar(60)} */
    @JsonKey
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** OTHERLOT1: {varchar(60)} */
    @JsonKey
    protected String _otherlot1;

    /** MAKERCASENO: {varchar(60)} */
    @JsonKey
    protected String _makercaseno;

    /** LENDFLG: {char(1)} */
    @JsonKey
    protected String _lendflg;

    /** CASEINNUMCALC: {bigint(19)} */
    @JsonKey
    protected Long _caseinnumcalc;

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

    /** CASEBARCODE: {varchar(100)} */
    @JsonKey
    protected String _casebarcode;

    /** OTHERREFNO2: {varchar(60)} */
    @JsonKey
    protected String _otherrefno2;

    /** ORDERTYPE: {varchar(30)} */
    @JsonKey
    protected String _ordertype;

    /** LIMITDATENOW: {varchar(8)} */
    @JsonKey
    protected String _limitdatenow;

    /** CASECREATETYPE: {varchar(30)} */
    @JsonKey
    protected String _casecreatetype;

    /** RECEIVEDATE: {varchar(8)} */
    @JsonKey
    protected String _receivedate;

    /** ARRIVALPORTDATE: {varchar(8)} */
    @JsonKey
    protected String _arrivalportdate;

    /** SHIPNAME: {varchar(100)} */
    @JsonKey
    protected String _shipname;

    /** LOCGROUP: {varchar(30)} */
    @JsonKey
    protected String _locgroup;

    /** LOCCD: {varchar(30)} */
    @JsonKey
    protected String _loccd;

    /** SHIPDATE: {varchar(8)} */
    @JsonKey
    protected String _shipdate;

    /** SHIPTOCD: {varchar(30)} */
    @JsonKey
    protected String _shiptocd;

    /** EXAMSTS: {bigint(19)} */
    @JsonKey
    protected Long _examsts;

    /** TOKUHANCD: {varchar(100)} */
    @JsonKey
    protected String _tokuhancd;

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

    /** RESERVEAREA: {varchar(100)} */
    @JsonKey
    protected String _reservearea;

    /** VA_EXTDATA1: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata1;

    /** VA_EXTDATA2: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata2;

    /** VA_EXTDATA3: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata3;

    /** DT_EXTDATA2: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _dtExtdata2;

    /** PALLET_NO: {varchar(30)} */
    @JsonKey
    protected String _palletNo;

    /** PICK_LIST_KEY: {varchar(30)} */
    @JsonKey
    protected String _pickListKey;

    /** FRONT_BACK_CASE_CD: {varchar(30)} */
    @JsonKey
    protected String _frontBackCaseCd;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** TRANSPORT_PRIORITY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _transportPriority;

    /** USE_TYPE: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _useType;

    /** OUTPUT_ORDER: {varchar(255)} */
    @JsonKey
    protected String _outputOrder;

    /** FACTORY_ORDER: {varchar(255)} */
    @JsonKey
    protected String _factoryOrder;

    /** WAREHOUSE_ORDER: {varchar(255)} */
    @JsonKey
    protected String _warehouseOrder;

    /** LINEBLOCK_ORDER: {varchar(255)} */
    @JsonKey
    protected String _lineblockOrder;

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
    public BsTTrtraceDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrtraceDto)) { return false; }
        final BsTTrtraceDto otherEntity = (BsTTrtraceDto)other;
        if (!helpComparingValue(getTrtraceId(), otherEntity.getTrtraceId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRTRACE");
        result = xCH(result, getTrtraceId());
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
        sb.append(c).append(getTrtraceId());
        sb.append(c).append(getTracekey());
        sb.append(c).append(getSndrcvdatetime());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getFactorycd());
        sb.append(c).append(getItemcdCase());
        sb.append(c).append(getSkucd());
        sb.append(c).append(getDestinationcd());
        sb.append(c).append(getManufacturecd());
        sb.append(c).append(getOrderno());
        sb.append(c).append(getMachineno());
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
        sb.append(c).append(getProductCd());
        sb.append(c).append(getItemcdIn());
        sb.append(c).append(getItemcdWh());
        sb.append(c).append(getDesigncdCase());
        sb.append(c).append(getDesigncdIn());
        sb.append(c).append(getDesigncdWh());
        sb.append(c).append(getSourcecasecd());
        sb.append(c).append(getSendflg());
        sb.append(c).append(getFromflg());
        sb.append(c).append(getSupplierrcvno());
        sb.append(c).append(getMixedflg());
        sb.append(c).append(getSymbolpastdate());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot2());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot4());
        sb.append(c).append(getOtherlot1());
        sb.append(c).append(getMakercaseno());
        sb.append(c).append(getLendflg());
        sb.append(c).append(getCaseinnumcalc());
        sb.append(c).append(getCaseitfno());
        sb.append(c).append(getCasebarcodevaliant());
        sb.append(c).append(getCaselot4());
        sb.append(c).append(getCasecenterno());
        sb.append(c).append(getCasepackno());
        sb.append(c).append(getCasepacktime());
        sb.append(c).append(getCasebarcode());
        sb.append(c).append(getOtherrefno2());
        sb.append(c).append(getOrdertype());
        sb.append(c).append(getLimitdatenow());
        sb.append(c).append(getCasecreatetype());
        sb.append(c).append(getReceivedate());
        sb.append(c).append(getArrivalportdate());
        sb.append(c).append(getShipname());
        sb.append(c).append(getLocgroup());
        sb.append(c).append(getLoccd());
        sb.append(c).append(getShipdate());
        sb.append(c).append(getShiptocd());
        sb.append(c).append(getExamsts());
        sb.append(c).append(getTokuhancd());
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
        sb.append(c).append(getReservearea());
        sb.append(c).append(getVaExtdata1());
        sb.append(c).append(getVaExtdata2());
        sb.append(c).append(getVaExtdata3());
        sb.append(c).append(getDtExtdata2());
        sb.append(c).append(getPalletNo());
        sb.append(c).append(getPickListKey());
        sb.append(c).append(getFrontBackCaseCd());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getTransportPriority());
        sb.append(c).append(getUseType());
        sb.append(c).append(getOutputOrder());
        sb.append(c).append(getFactoryOrder());
        sb.append(c).append(getWarehouseOrder());
        sb.append(c).append(getLineblockOrder());
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
     * [get] TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製品追跡情報ID
     * @return The value of the column 'TRTRACE_ID'. (NullAllowed)
     */
    public Long getTrtraceId() {
        return _trtraceId;
    }

    /**
     * [set] TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製品追跡情報ID
     * @param trtraceId The value of the column 'TRTRACE_ID'. (NullAllowed)
     */
    public void setTrtraceId(Long trtraceId) {
        __modifiedProperties.add("trtraceId");
        this._trtraceId = trtraceId;
    }

    /**
     * [get] TRACEKEY: {NotNull, bigint(19)} <br>
     * 製品追跡キー
     * @return The value of the column 'TRACEKEY'. (NullAllowed)
     */
    public Long getTracekey() {
        return _tracekey;
    }

    /**
     * [set] TRACEKEY: {NotNull, bigint(19)} <br>
     * 製品追跡キー
     * @param tracekey The value of the column 'TRACEKEY'. (NullAllowed)
     */
    public void setTracekey(Long tracekey) {
        __modifiedProperties.add("tracekey");
        this._tracekey = tracekey;
    }

    /**
     * [get] SNDRCVDATETIME: {varchar(8)} <br>
     * 送受信日時
     * @return The value of the column 'SNDRCVDATETIME'. (NullAllowed)
     */
    public String getSndrcvdatetime() {
        return _sndrcvdatetime;
    }

    /**
     * [set] SNDRCVDATETIME: {varchar(8)} <br>
     * 送受信日時
     * @param sndrcvdatetime The value of the column 'SNDRCVDATETIME'. (NullAllowed)
     */
    public void setSndrcvdatetime(String sndrcvdatetime) {
        __modifiedProperties.add("sndrcvdatetime");
        this._sndrcvdatetime = sndrcvdatetime;
    }

    /**
     * [get] WAREHOUSECD: {IX, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {IX, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] FACTORYCD: {varchar(30)} <br>
     * 工場CD
     * @return The value of the column 'FACTORYCD'. (NullAllowed)
     */
    public String getFactorycd() {
        return _factorycd;
    }

    /**
     * [set] FACTORYCD: {varchar(30)} <br>
     * 工場CD
     * @param factorycd The value of the column 'FACTORYCD'. (NullAllowed)
     */
    public void setFactorycd(String factorycd) {
        __modifiedProperties.add("factorycd");
        this._factorycd = factorycd;
    }

    /**
     * [get] ITEMCD_CASE: {varchar(30)} <br>
     * 銘柄CD（ケース）
     * @return The value of the column 'ITEMCD_CASE'. (NullAllowed)
     */
    public String getItemcdCase() {
        return _itemcdCase;
    }

    /**
     * [set] ITEMCD_CASE: {varchar(30)} <br>
     * 銘柄CD（ケース）
     * @param itemcdCase The value of the column 'ITEMCD_CASE'. (NullAllowed)
     */
    public void setItemcdCase(String itemcdCase) {
        __modifiedProperties.add("itemcdCase");
        this._itemcdCase = itemcdCase;
    }

    /**
     * [get] SKUCD: {varchar(30)} <br>
     * SKUCD
     * @return The value of the column 'SKUCD'. (NullAllowed)
     */
    public String getSkucd() {
        return _skucd;
    }

    /**
     * [set] SKUCD: {varchar(30)} <br>
     * SKUCD
     * @param skucd The value of the column 'SKUCD'. (NullAllowed)
     */
    public void setSkucd(String skucd) {
        __modifiedProperties.add("skucd");
        this._skucd = skucd;
    }

    /**
     * [get] DESTINATIONCD: {varchar(30)} <br>
     * 仕向地CD
     * @return The value of the column 'DESTINATIONCD'. (NullAllowed)
     */
    public String getDestinationcd() {
        return _destinationcd;
    }

    /**
     * [set] DESTINATIONCD: {varchar(30)} <br>
     * 仕向地CD
     * @param destinationcd The value of the column 'DESTINATIONCD'. (NullAllowed)
     */
    public void setDestinationcd(String destinationcd) {
        __modifiedProperties.add("destinationcd");
        this._destinationcd = destinationcd;
    }

    /**
     * [get] MANUFACTURECD: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURECD'. (NullAllowed)
     */
    public String getManufacturecd() {
        return _manufacturecd;
    }

    /**
     * [set] MANUFACTURECD: {varchar(30)} <br>
     * 製造記号
     * @param manufacturecd The value of the column 'MANUFACTURECD'. (NullAllowed)
     */
    public void setManufacturecd(String manufacturecd) {
        __modifiedProperties.add("manufacturecd");
        this._manufacturecd = manufacturecd;
    }

    /**
     * [get] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @return The value of the column 'ORDERNO'. (NullAllowed)
     */
    public String getOrderno() {
        return _orderno;
    }

    /**
     * [set] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @param orderno The value of the column 'ORDERNO'. (NullAllowed)
     */
    public void setOrderno(String orderno) {
        __modifiedProperties.add("orderno");
        this._orderno = orderno;
    }

    /**
     * [get] MACHINENO: {varchar(30)} <br>
     * 号機
     * @return The value of the column 'MACHINENO'. (NullAllowed)
     */
    public String getMachineno() {
        return _machineno;
    }

    /**
     * [set] MACHINENO: {varchar(30)} <br>
     * 号機
     * @param machineno The value of the column 'MACHINENO'. (NullAllowed)
     */
    public void setMachineno(String machineno) {
        __modifiedProperties.add("machineno");
        this._machineno = machineno;
    }

    /**
     * [get] CREATENO: {varchar(30)} <br>
     * 生出番号
     * @return The value of the column 'CREATENO'. (NullAllowed)
     */
    public String getCreateno() {
        return _createno;
    }

    /**
     * [set] CREATENO: {varchar(30)} <br>
     * 生出番号
     * @param createno The value of the column 'CREATENO'. (NullAllowed)
     */
    public void setCreateno(String createno) {
        __modifiedProperties.add("createno");
        this._createno = createno;
    }

    /**
     * [get] LIMITDATE: {varchar(8)} <br>
     * 製造年月日（ケース）
     * @return The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public String getLimitdate() {
        return _limitdate;
    }

    /**
     * [set] LIMITDATE: {varchar(8)} <br>
     * 製造年月日（ケース）
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public void setLimitdate(String limitdate) {
        __modifiedProperties.add("limitdate");
        this._limitdate = limitdate;
    }

    /**
     * [get] DATETIME: {varchar(8)} <br>
     * 日付時刻
     * @return The value of the column 'DATETIME'. (NullAllowed)
     */
    public String getDatetime() {
        return _datetime;
    }

    /**
     * [set] DATETIME: {varchar(8)} <br>
     * 日付時刻
     * @param datetime The value of the column 'DATETIME'. (NullAllowed)
     */
    public void setDatetime(String datetime) {
        __modifiedProperties.add("datetime");
        this._datetime = datetime;
    }

    /**
     * [get] DISTRIBUTIONCD: {char(1)} <br>
     * 流通識別
     * @return The value of the column 'DISTRIBUTIONCD'. (NullAllowed)
     */
    public String getDistributioncd() {
        return _distributioncd;
    }

    /**
     * [set] DISTRIBUTIONCD: {char(1)} <br>
     * 流通識別
     * @param distributioncd The value of the column 'DISTRIBUTIONCD'. (NullAllowed)
     */
    public void setDistributioncd(String distributioncd) {
        __modifiedProperties.add("distributioncd");
        this._distributioncd = distributioncd;
    }

    /**
     * [get] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public String getTransportcd() {
        return _transportcd;
    }

    /**
     * [set] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public void setTransportcd(String transportcd) {
        __modifiedProperties.add("transportcd");
        this._transportcd = transportcd;
    }

    /**
     * [get] PALLETID: {varchar(30)} <br>
     * パレットID
     * @return The value of the column 'PALLETID'. (NullAllowed)
     */
    public String getPalletid() {
        return _palletid;
    }

    /**
     * [set] PALLETID: {varchar(30)} <br>
     * パレットID
     * @param palletid The value of the column 'PALLETID'. (NullAllowed)
     */
    public void setPalletid(String palletid) {
        __modifiedProperties.add("palletid");
        this._palletid = palletid;
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
     * [get] CREATEDATETIME: {varchar(8)} <br>
     * 作成日時
     * @return The value of the column 'CREATEDATETIME'. (NullAllowed)
     */
    public String getCreatedatetime() {
        return _createdatetime;
    }

    /**
     * [set] CREATEDATETIME: {varchar(8)} <br>
     * 作成日時
     * @param createdatetime The value of the column 'CREATEDATETIME'. (NullAllowed)
     */
    public void setCreatedatetime(String createdatetime) {
        __modifiedProperties.add("createdatetime");
        this._createdatetime = createdatetime;
    }

    /**
     * [get] ASSORTDATETIME: {varchar(8)} <br>
     * 仕分日時
     * @return The value of the column 'ASSORTDATETIME'. (NullAllowed)
     */
    public String getAssortdatetime() {
        return _assortdatetime;
    }

    /**
     * [set] ASSORTDATETIME: {varchar(8)} <br>
     * 仕分日時
     * @param assortdatetime The value of the column 'ASSORTDATETIME'. (NullAllowed)
     */
    public void setAssortdatetime(String assortdatetime) {
        __modifiedProperties.add("assortdatetime");
        this._assortdatetime = assortdatetime;
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
     * [get] LINEBLOCK: {varchar(30)} <br>
     * ラインブロック
     * @return The value of the column 'LINEBLOCK'. (NullAllowed)
     */
    public String getLineblock() {
        return _lineblock;
    }

    /**
     * [set] LINEBLOCK: {varchar(30)} <br>
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
     * [get] ASSORTEDINDEX: {bigint(19)} <br>
     * 仕分ロケ投入順
     * @return The value of the column 'ASSORTEDINDEX'. (NullAllowed)
     */
    public Long getAssortedindex() {
        return _assortedindex;
    }

    /**
     * [set] ASSORTEDINDEX: {bigint(19)} <br>
     * 仕分ロケ投入順
     * @param assortedindex The value of the column 'ASSORTEDINDEX'. (NullAllowed)
     */
    public void setAssortedindex(Long assortedindex) {
        __modifiedProperties.add("assortedindex");
        this._assortedindex = assortedindex;
    }

    /**
     * [get] OPERATIONCODE: {char(1)} <br>
     * 操作数量符号
     * @return The value of the column 'OPERATIONCODE'. (NullAllowed)
     */
    public String getOperationcode() {
        return _operationcode;
    }

    /**
     * [set] OPERATIONCODE: {char(1)} <br>
     * 操作数量符号
     * @param operationcode The value of the column 'OPERATIONCODE'. (NullAllowed)
     */
    public void setOperationcode(String operationcode) {
        __modifiedProperties.add("operationcode");
        this._operationcode = operationcode;
    }

    /**
     * [get] CASEINNUM: {bigint(19)} <br>
     * ケース内数量
     * @return The value of the column 'CASEINNUM'. (NullAllowed)
     */
    public Long getCaseinnum() {
        return _caseinnum;
    }

    /**
     * [set] CASEINNUM: {bigint(19)} <br>
     * ケース内数量
     * @param caseinnum The value of the column 'CASEINNUM'. (NullAllowed)
     */
    public void setCaseinnum(Long caseinnum) {
        __modifiedProperties.add("caseinnum");
        this._caseinnum = caseinnum;
    }

    /**
     * [get] ASSORTNUM: {bigint(19)} <br>
     * 仕分数量
     * @return The value of the column 'ASSORTNUM'. (NullAllowed)
     */
    public Long getAssortnum() {
        return _assortnum;
    }

    /**
     * [set] ASSORTNUM: {bigint(19)} <br>
     * 仕分数量
     * @param assortnum The value of the column 'ASSORTNUM'. (NullAllowed)
     */
    public void setAssortnum(Long assortnum) {
        __modifiedProperties.add("assortnum");
        this._assortnum = assortnum;
    }

    /**
     * [get] ASSORTDIFNUM: {bigint(19)} <br>
     * 差異不良数量
     * @return The value of the column 'ASSORTDIFNUM'. (NullAllowed)
     */
    public Long getAssortdifnum() {
        return _assortdifnum;
    }

    /**
     * [set] ASSORTDIFNUM: {bigint(19)} <br>
     * 差異不良数量
     * @param assortdifnum The value of the column 'ASSORTDIFNUM'. (NullAllowed)
     */
    public void setAssortdifnum(Long assortdifnum) {
        __modifiedProperties.add("assortdifnum");
        this._assortdifnum = assortdifnum;
    }

    /**
     * [get] DIRECTIONCD: {varchar(30)} <br>
     * 方面CD
     * @return The value of the column 'DIRECTIONCD'. (NullAllowed)
     */
    public String getDirectioncd() {
        return _directioncd;
    }

    /**
     * [set] DIRECTIONCD: {varchar(30)} <br>
     * 方面CD
     * @param directioncd The value of the column 'DIRECTIONCD'. (NullAllowed)
     */
    public void setDirectioncd(String directioncd) {
        __modifiedProperties.add("directioncd");
        this._directioncd = directioncd;
    }

    /**
     * [get] PISTONTYPE: {char(1)} <br>
     * ピストン区分
     * @return The value of the column 'PISTONTYPE'. (NullAllowed)
     */
    public String getPistontype() {
        return _pistontype;
    }

    /**
     * [set] PISTONTYPE: {char(1)} <br>
     * ピストン区分
     * @param pistontype The value of the column 'PISTONTYPE'. (NullAllowed)
     */
    public void setPistontype(String pistontype) {
        __modifiedProperties.add("pistontype");
        this._pistontype = pistontype;
    }

    /**
     * [get] CUSTOMERCD: {varchar(30)} <br>
     * お得意様CD
     * @return The value of the column 'CUSTOMERCD'. (NullAllowed)
     */
    public String getCustomercd() {
        return _customercd;
    }

    /**
     * [set] CUSTOMERCD: {varchar(30)} <br>
     * お得意様CD
     * @param customercd The value of the column 'CUSTOMERCD'. (NullAllowed)
     */
    public void setCustomercd(String customercd) {
        __modifiedProperties.add("customercd");
        this._customercd = customercd;
    }

    /**
     * [get] DIRECTIONNUM: {bigint(19)} <br>
     * さしず数量
     * @return The value of the column 'DIRECTIONNUM'. (NullAllowed)
     */
    public Long getDirectionnum() {
        return _directionnum;
    }

    /**
     * [set] DIRECTIONNUM: {bigint(19)} <br>
     * さしず数量
     * @param directionnum The value of the column 'DIRECTIONNUM'. (NullAllowed)
     */
    public void setDirectionnum(Long directionnum) {
        __modifiedProperties.add("directionnum");
        this._directionnum = directionnum;
    }

    /**
     * [get] DISTWAREHOUSECD: {varchar(30)} <br>
     * 融通先CD
     * @return The value of the column 'DISTWAREHOUSECD'. (NullAllowed)
     */
    public String getDistwarehousecd() {
        return _distwarehousecd;
    }

    /**
     * [set] DISTWAREHOUSECD: {varchar(30)} <br>
     * 融通先CD
     * @param distwarehousecd The value of the column 'DISTWAREHOUSECD'. (NullAllowed)
     */
    public void setDistwarehousecd(String distwarehousecd) {
        __modifiedProperties.add("distwarehousecd");
        this._distwarehousecd = distwarehousecd;
    }

    /**
     * [get] RCVKEY: {decimal(16, 6)} <br>
     * 入庫キー
     * @return The value of the column 'RCVKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvkey() {
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {decimal(16, 6)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        __modifiedProperties.add("rcvkey");
        this._rcvkey = rcvkey;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] ITEMCD_IN: {varchar(30)} <br>
     * 銘柄CD（入庫時）
     * @return The value of the column 'ITEMCD_IN'. (NullAllowed)
     */
    public String getItemcdIn() {
        return _itemcdIn;
    }

    /**
     * [set] ITEMCD_IN: {varchar(30)} <br>
     * 銘柄CD（入庫時）
     * @param itemcdIn The value of the column 'ITEMCD_IN'. (NullAllowed)
     */
    public void setItemcdIn(String itemcdIn) {
        __modifiedProperties.add("itemcdIn");
        this._itemcdIn = itemcdIn;
    }

    /**
     * [get] ITEMCD_WH: {varchar(30)} <br>
     * 銘柄CD（倉庫内）
     * @return The value of the column 'ITEMCD_WH'. (NullAllowed)
     */
    public String getItemcdWh() {
        return _itemcdWh;
    }

    /**
     * [set] ITEMCD_WH: {varchar(30)} <br>
     * 銘柄CD（倉庫内）
     * @param itemcdWh The value of the column 'ITEMCD_WH'. (NullAllowed)
     */
    public void setItemcdWh(String itemcdWh) {
        __modifiedProperties.add("itemcdWh");
        this._itemcdWh = itemcdWh;
    }

    /**
     * [get] DESIGNCD_CASE: {varchar(30)} <br>
     * デザイン区分（ケース）
     * @return The value of the column 'DESIGNCD_CASE'. (NullAllowed)
     */
    public String getDesigncdCase() {
        return _designcdCase;
    }

    /**
     * [set] DESIGNCD_CASE: {varchar(30)} <br>
     * デザイン区分（ケース）
     * @param designcdCase The value of the column 'DESIGNCD_CASE'. (NullAllowed)
     */
    public void setDesigncdCase(String designcdCase) {
        __modifiedProperties.add("designcdCase");
        this._designcdCase = designcdCase;
    }

    /**
     * [get] DESIGNCD_IN: {varchar(30)} <br>
     * デザイン区分（入庫時）
     * @return The value of the column 'DESIGNCD_IN'. (NullAllowed)
     */
    public String getDesigncdIn() {
        return _designcdIn;
    }

    /**
     * [set] DESIGNCD_IN: {varchar(30)} <br>
     * デザイン区分（入庫時）
     * @param designcdIn The value of the column 'DESIGNCD_IN'. (NullAllowed)
     */
    public void setDesigncdIn(String designcdIn) {
        __modifiedProperties.add("designcdIn");
        this._designcdIn = designcdIn;
    }

    /**
     * [get] DESIGNCD_WH: {varchar(30)} <br>
     * デザイン区分（倉庫内）
     * @return The value of the column 'DESIGNCD_WH'. (NullAllowed)
     */
    public String getDesigncdWh() {
        return _designcdWh;
    }

    /**
     * [set] DESIGNCD_WH: {varchar(30)} <br>
     * デザイン区分（倉庫内）
     * @param designcdWh The value of the column 'DESIGNCD_WH'. (NullAllowed)
     */
    public void setDesigncdWh(String designcdWh) {
        __modifiedProperties.add("designcdWh");
        this._designcdWh = designcdWh;
    }

    /**
     * [get] SOURCECASECD: {decimal(16, 6)} <br>
     * 作成元ケースCD
     * @return The value of the column 'SOURCECASECD'. (NullAllowed)
     */
    public java.math.BigDecimal getSourcecasecd() {
        return _sourcecasecd;
    }

    /**
     * [set] SOURCECASECD: {decimal(16, 6)} <br>
     * 作成元ケースCD
     * @param sourcecasecd The value of the column 'SOURCECASECD'. (NullAllowed)
     */
    public void setSourcecasecd(java.math.BigDecimal sourcecasecd) {
        __modifiedProperties.add("sourcecasecd");
        this._sourcecasecd = sourcecasecd;
    }

    /**
     * [get] SENDFLG: {decimal(16, 6)} <br>
     * 送信管理区分
     * @return The value of the column 'SENDFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getSendflg() {
        return _sendflg;
    }

    /**
     * [set] SENDFLG: {decimal(16, 6)} <br>
     * 送信管理区分
     * @param sendflg The value of the column 'SENDFLG'. (NullAllowed)
     */
    public void setSendflg(java.math.BigDecimal sendflg) {
        __modifiedProperties.add("sendflg");
        this._sendflg = sendflg;
    }

    /**
     * [get] FROMFLG: {char(1)} <br>
     * 経路区分
     * @return The value of the column 'FROMFLG'. (NullAllowed)
     */
    public String getFromflg() {
        return _fromflg;
    }

    /**
     * [set] FROMFLG: {char(1)} <br>
     * 経路区分
     * @param fromflg The value of the column 'FROMFLG'. (NullAllowed)
     */
    public void setFromflg(String fromflg) {
        __modifiedProperties.add("fromflg");
        this._fromflg = fromflg;
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
     * [get] SYMBOLPASTDATE: {varchar(8)} <br>
     * シンボル貼付日
     * @return The value of the column 'SYMBOLPASTDATE'. (NullAllowed)
     */
    public String getSymbolpastdate() {
        return _symbolpastdate;
    }

    /**
     * [set] SYMBOLPASTDATE: {varchar(8)} <br>
     * シンボル貼付日
     * @param symbolpastdate The value of the column 'SYMBOLPASTDATE'. (NullAllowed)
     */
    public void setSymbolpastdate(String symbolpastdate) {
        __modifiedProperties.add("symbolpastdate");
        this._symbolpastdate = symbolpastdate;
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
     * [get] LOT2: {varchar(60)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed)
     */
    public String getLot2() {
        return _lot2;
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed)
     */
    public void setLot2(String lot2) {
        __modifiedProperties.add("lot2");
        this._lot2 = lot2;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed)
     */
    public String getLot3() {
        return _lot3;
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed)
     */
    public void setLot3(String lot3) {
        __modifiedProperties.add("lot3");
        this._lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (NullAllowed)
     */
    public String getLot4() {
        return _lot4;
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed)
     */
    public void setLot4(String lot4) {
        __modifiedProperties.add("lot4");
        this._lot4 = lot4;
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
     * [get] CASEINNUMCALC: {bigint(19)} <br>
     * 符号付ケース内数量
     * @return The value of the column 'CASEINNUMCALC'. (NullAllowed)
     */
    public Long getCaseinnumcalc() {
        return _caseinnumcalc;
    }

    /**
     * [set] CASEINNUMCALC: {bigint(19)} <br>
     * 符号付ケース内数量
     * @param caseinnumcalc The value of the column 'CASEINNUMCALC'. (NullAllowed)
     */
    public void setCaseinnumcalc(Long caseinnumcalc) {
        __modifiedProperties.add("caseinnumcalc");
        this._caseinnumcalc = caseinnumcalc;
    }

    /**
     * [get] CASEITFNO: {varchar(30)} <br>
     * ITFNo.
     * @return The value of the column 'CASEITFNO'. (NullAllowed)
     */
    public String getCaseitfno() {
        return _caseitfno;
    }

    /**
     * [set] CASEITFNO: {varchar(30)} <br>
     * ITFNo.
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
     * ケースパッカーNo.
     * @return The value of the column 'CASEPACKNO'. (NullAllowed)
     */
    public String getCasepackno() {
        return _casepackno;
    }

    /**
     * [set] CASEPACKNO: {varchar(30)} <br>
     * ケースパッカーNo.
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
     * [get] CASEBARCODE: {varchar(100)} <br>
     * 段ボールバーコード
     * @return The value of the column 'CASEBARCODE'. (NullAllowed)
     */
    public String getCasebarcode() {
        return _casebarcode;
    }

    /**
     * [set] CASEBARCODE: {varchar(100)} <br>
     * 段ボールバーコード
     * @param casebarcode The value of the column 'CASEBARCODE'. (NullAllowed)
     */
    public void setCasebarcode(String casebarcode) {
        __modifiedProperties.add("casebarcode");
        this._casebarcode = casebarcode;
    }

    /**
     * [get] OTHERREFNO2: {varchar(60)} <br>
     * 着地名称
     * @return The value of the column 'OTHERREFNO2'. (NullAllowed)
     */
    public String getOtherrefno2() {
        return _otherrefno2;
    }

    /**
     * [set] OTHERREFNO2: {varchar(60)} <br>
     * 着地名称
     * @param otherrefno2 The value of the column 'OTHERREFNO2'. (NullAllowed)
     */
    public void setOtherrefno2(String otherrefno2) {
        __modifiedProperties.add("otherrefno2");
        this._otherrefno2 = otherrefno2;
    }

    /**
     * [get] ORDERTYPE: {varchar(30)} <br>
     * 依頼種別
     * @return The value of the column 'ORDERTYPE'. (NullAllowed)
     */
    public String getOrdertype() {
        return _ordertype;
    }

    /**
     * [set] ORDERTYPE: {varchar(30)} <br>
     * 依頼種別
     * @param ordertype The value of the column 'ORDERTYPE'. (NullAllowed)
     */
    public void setOrdertype(String ordertype) {
        __modifiedProperties.add("ordertype");
        this._ordertype = ordertype;
    }

    /**
     * [get] LIMITDATENOW: {varchar(8)} <br>
     * 製造年月日（現在）
     * @return The value of the column 'LIMITDATENOW'. (NullAllowed)
     */
    public String getLimitdatenow() {
        return _limitdatenow;
    }

    /**
     * [set] LIMITDATENOW: {varchar(8)} <br>
     * 製造年月日（現在）
     * @param limitdatenow The value of the column 'LIMITDATENOW'. (NullAllowed)
     */
    public void setLimitdatenow(String limitdatenow) {
        __modifiedProperties.add("limitdatenow");
        this._limitdatenow = limitdatenow;
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
     * [get] RESERVEAREA: {varchar(100)} <br>
     * 予備領域
     * @return The value of the column 'RESERVEAREA'. (NullAllowed)
     */
    public String getReservearea() {
        return _reservearea;
    }

    /**
     * [set] RESERVEAREA: {varchar(100)} <br>
     * 予備領域
     * @param reservearea The value of the column 'RESERVEAREA'. (NullAllowed)
     */
    public void setReservearea(String reservearea) {
        __modifiedProperties.add("reservearea");
        this._reservearea = reservearea;
    }

    /**
     * [get] VA_EXTDATA1: {varchar(30)} <br>
     * 送信詳細フラグ
     * @return The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public String getVaExtdata1() {
        return _vaExtdata1;
    }

    /**
     * [set] VA_EXTDATA1: {varchar(30)} <br>
     * 送信詳細フラグ
     * @param vaExtdata1 The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public void setVaExtdata1(String vaExtdata1) {
        __modifiedProperties.add("vaExtdata1");
        this._vaExtdata1 = vaExtdata1;
    }

    /**
     * [get] VA_EXTDATA2: {varchar(30)} <br>
     * 送信確定フラグ
     * @return The value of the column 'VA_EXTDATA2'. (NullAllowed)
     */
    public String getVaExtdata2() {
        return _vaExtdata2;
    }

    /**
     * [set] VA_EXTDATA2: {varchar(30)} <br>
     * 送信確定フラグ
     * @param vaExtdata2 The value of the column 'VA_EXTDATA2'. (NullAllowed)
     */
    public void setVaExtdata2(String vaExtdata2) {
        __modifiedProperties.add("vaExtdata2");
        this._vaExtdata2 = vaExtdata2;
    }

    /**
     * [get] VA_EXTDATA3: {varchar(30)} <br>
     * 内訳変更フラグ
     * @return The value of the column 'VA_EXTDATA3'. (NullAllowed)
     */
    public String getVaExtdata3() {
        return _vaExtdata3;
    }

    /**
     * [set] VA_EXTDATA3: {varchar(30)} <br>
     * 内訳変更フラグ
     * @param vaExtdata3 The value of the column 'VA_EXTDATA3'. (NullAllowed)
     */
    public void setVaExtdata3(String vaExtdata3) {
        __modifiedProperties.add("vaExtdata3");
        this._vaExtdata3 = vaExtdata3;
    }

    /**
     * [get] DT_EXTDATA2: {datetime2(26, 6)} <br>
     * 配達年月日
     * @return The value of the column 'DT_EXTDATA2'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getDtExtdata2() {
        return _dtExtdata2;
    }

    /**
     * [set] DT_EXTDATA2: {datetime2(26, 6)} <br>
     * 配達年月日
     * @param dtExtdata2 The value of the column 'DT_EXTDATA2'. (NullAllowed)
     */
    public void setDtExtdata2(java.sql.Timestamp dtExtdata2) {
        __modifiedProperties.add("dtExtdata2");
        this._dtExtdata2 = dtExtdata2;
    }

    /**
     * [get] PALLET_NO: {varchar(30)} <br>
     * パレット管理番号
     * @return The value of the column 'PALLET_NO'. (NullAllowed)
     */
    public String getPalletNo() {
        return _palletNo;
    }

    /**
     * [set] PALLET_NO: {varchar(30)} <br>
     * パレット管理番号
     * @param palletNo The value of the column 'PALLET_NO'. (NullAllowed)
     */
    public void setPalletNo(String palletNo) {
        __modifiedProperties.add("palletNo");
        this._palletNo = palletNo;
    }

    /**
     * [get] PICK_LIST_KEY: {varchar(30)} <br>
     * 山出しリストNo.
     * @return The value of the column 'PICK_LIST_KEY'. (NullAllowed)
     */
    public String getPickListKey() {
        return _pickListKey;
    }

    /**
     * [set] PICK_LIST_KEY: {varchar(30)} <br>
     * 山出しリストNo.
     * @param pickListKey The value of the column 'PICK_LIST_KEY'. (NullAllowed)
     */
    public void setPickListKey(String pickListKey) {
        __modifiedProperties.add("pickListKey");
        this._pickListKey = pickListKey;
    }

    /**
     * [get] FRONT_BACK_CASE_CD: {varchar(30)} <br>
     * 前後ケース
     * @return The value of the column 'FRONT_BACK_CASE_CD'. (NullAllowed)
     */
    public String getFrontBackCaseCd() {
        return _frontBackCaseCd;
    }

    /**
     * [set] FRONT_BACK_CASE_CD: {varchar(30)} <br>
     * 前後ケース
     * @param frontBackCaseCd The value of the column 'FRONT_BACK_CASE_CD'. (NullAllowed)
     */
    public void setFrontBackCaseCd(String frontBackCaseCd) {
        __modifiedProperties.add("frontBackCaseCd");
        this._frontBackCaseCd = frontBackCaseCd;
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
     * [get] TRANSPORT_PRIORITY: {decimal(16, 6)} <br>
     * 組織出力順
     * @return The value of the column 'TRANSPORT_PRIORITY'. (NullAllowed)
     */
    public java.math.BigDecimal getTransportPriority() {
        return _transportPriority;
    }

    /**
     * [set] TRANSPORT_PRIORITY: {decimal(16, 6)} <br>
     * 組織出力順
     * @param transportPriority The value of the column 'TRANSPORT_PRIORITY'. (NullAllowed)
     */
    public void setTransportPriority(java.math.BigDecimal transportPriority) {
        __modifiedProperties.add("transportPriority");
        this._transportPriority = transportPriority;
    }

    /**
     * [get] USE_TYPE: {decimal(16, 6)} <br>
     * 使用区分
     * @return The value of the column 'USE_TYPE'. (NullAllowed)
     */
    public java.math.BigDecimal getUseType() {
        return _useType;
    }

    /**
     * [set] USE_TYPE: {decimal(16, 6)} <br>
     * 使用区分
     * @param useType The value of the column 'USE_TYPE'. (NullAllowed)
     */
    public void setUseType(java.math.BigDecimal useType) {
        __modifiedProperties.add("useType");
        this._useType = useType;
    }

    /**
     * [get] OUTPUT_ORDER: {varchar(255)} <br>
     * 銘柄出力順
     * @return The value of the column 'OUTPUT_ORDER'. (NullAllowed)
     */
    public String getOutputOrder() {
        return _outputOrder;
    }

    /**
     * [set] OUTPUT_ORDER: {varchar(255)} <br>
     * 銘柄出力順
     * @param outputOrder The value of the column 'OUTPUT_ORDER'. (NullAllowed)
     */
    public void setOutputOrder(String outputOrder) {
        __modifiedProperties.add("outputOrder");
        this._outputOrder = outputOrder;
    }

    /**
     * [get] FACTORY_ORDER: {varchar(255)} <br>
     * 工場出力順
     * @return The value of the column 'FACTORY_ORDER'. (NullAllowed)
     */
    public String getFactoryOrder() {
        return _factoryOrder;
    }

    /**
     * [set] FACTORY_ORDER: {varchar(255)} <br>
     * 工場出力順
     * @param factoryOrder The value of the column 'FACTORY_ORDER'. (NullAllowed)
     */
    public void setFactoryOrder(String factoryOrder) {
        __modifiedProperties.add("factoryOrder");
        this._factoryOrder = factoryOrder;
    }

    /**
     * [get] WAREHOUSE_ORDER: {varchar(255)} <br>
     * 保管場所出力順
     * @return The value of the column 'WAREHOUSE_ORDER'. (NullAllowed)
     */
    public String getWarehouseOrder() {
        return _warehouseOrder;
    }

    /**
     * [set] WAREHOUSE_ORDER: {varchar(255)} <br>
     * 保管場所出力順
     * @param warehouseOrder The value of the column 'WAREHOUSE_ORDER'. (NullAllowed)
     */
    public void setWarehouseOrder(String warehouseOrder) {
        __modifiedProperties.add("warehouseOrder");
        this._warehouseOrder = warehouseOrder;
    }

    /**
     * [get] LINEBLOCK_ORDER: {varchar(255)} <br>
     * ライン/ブロック出力順
     * @return The value of the column 'LINEBLOCK_ORDER'. (NullAllowed)
     */
    public String getLineblockOrder() {
        return _lineblockOrder;
    }

    /**
     * [set] LINEBLOCK_ORDER: {varchar(255)} <br>
     * ライン/ブロック出力順
     * @param lineblockOrder The value of the column 'LINEBLOCK_ORDER'. (NullAllowed)
     */
    public void setLineblockOrder(String lineblockOrder) {
        __modifiedProperties.add("lineblockOrder");
        this._lineblockOrder = lineblockOrder;
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

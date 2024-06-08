package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of T_TRTRACE as TABLE. <br>
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
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trtraceId = entity.getTrtraceId();
 * Long tracekey = entity.getTracekey();
 * String sndrcvdatetime = entity.getSndrcvdatetime();
 * String warehousecd = entity.getWarehousecd();
 * String factorycd = entity.getFactorycd();
 * String itemcdCase = entity.getItemcdCase();
 * String skucd = entity.getSkucd();
 * String destinationcd = entity.getDestinationcd();
 * String manufacturecd = entity.getManufacturecd();
 * String orderno = entity.getOrderno();
 * String machineno = entity.getMachineno();
 * String createno = entity.getCreateno();
 * String limitdate = entity.getLimitdate();
 * String datetime = entity.getDatetime();
 * String distributioncd = entity.getDistributioncd();
 * String transportcd = entity.getTransportcd();
 * String palletid = entity.getPalletid();
 * Long initnum = entity.getInitnum();
 * String createdatetime = entity.getCreatedatetime();
 * String assortdatetime = entity.getAssortdatetime();
 * String tracetype = entity.getTracetype();
 * String lineblock = entity.getLineblock();
 * String assortedunit = entity.getAssortedunit();
 * Long assortedindex = entity.getAssortedindex();
 * String operationcode = entity.getOperationcode();
 * Long caseinnum = entity.getCaseinnum();
 * Long assortnum = entity.getAssortnum();
 * Long assortdifnum = entity.getAssortdifnum();
 * String directioncd = entity.getDirectioncd();
 * String pistontype = entity.getPistontype();
 * String customercd = entity.getCustomercd();
 * Long directionnum = entity.getDirectionnum();
 * String distwarehousecd = entity.getDistwarehousecd();
 * java.math.BigDecimal rcvkey = entity.getRcvkey();
 * String productCd = entity.getProductCd();
 * String itemcdIn = entity.getItemcdIn();
 * String itemcdWh = entity.getItemcdWh();
 * String designcdCase = entity.getDesigncdCase();
 * String designcdIn = entity.getDesigncdIn();
 * String designcdWh = entity.getDesigncdWh();
 * java.math.BigDecimal sourcecasecd = entity.getSourcecasecd();
 * java.math.BigDecimal sendflg = entity.getSendflg();
 * String fromflg = entity.getFromflg();
 * String supplierrcvno = entity.getSupplierrcvno();
 * String mixedflg = entity.getMixedflg();
 * String symbolpastdate = entity.getSymbolpastdate();
 * String lot1 = entity.getLot1();
 * String lot2 = entity.getLot2();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String otherlot1 = entity.getOtherlot1();
 * String makercaseno = entity.getMakercaseno();
 * String lendflg = entity.getLendflg();
 * Long caseinnumcalc = entity.getCaseinnumcalc();
 * String caseitfno = entity.getCaseitfno();
 * String casebarcodevaliant = entity.getCasebarcodevaliant();
 * String caselot4 = entity.getCaselot4();
 * String casecenterno = entity.getCasecenterno();
 * String casepackno = entity.getCasepackno();
 * String casepacktime = entity.getCasepacktime();
 * String casebarcode = entity.getCasebarcode();
 * String otherrefno2 = entity.getOtherrefno2();
 * String ordertype = entity.getOrdertype();
 * String limitdatenow = entity.getLimitdatenow();
 * String casecreatetype = entity.getCasecreatetype();
 * String receivedate = entity.getReceivedate();
 * String arrivalportdate = entity.getArrivalportdate();
 * String shipname = entity.getShipname();
 * String locgroup = entity.getLocgroup();
 * String loccd = entity.getLoccd();
 * String shipdate = entity.getShipdate();
 * String shiptocd = entity.getShiptocd();
 * Long examsts = entity.getExamsts();
 * String tokuhancd = entity.getTokuhancd();
 * String senderLocation = entity.getSenderLocation();
 * String receiverLocation = entity.getReceiverLocation();
 * String shipmentId = entity.getShipmentId();
 * String shipmentDate = entity.getShipmentDate();
 * String numberOfPallets = entity.getNumberOfPallets();
 * String carrierno = entity.getCarrierno();
 * String tkhnorderno = entity.getTkhnorderno();
 * String srccd = entity.getSrccd();
 * String blno = entity.getBlno();
 * String invoiceno = entity.getInvoiceno();
 * String sscc = entity.getSscc();
 * String caseno = entity.getCaseno();
 * Long invNum = entity.getInvNum();
 * Long sortNum = entity.getSortNum();
 * Long adoptNum = entity.getAdoptNum();
 * String reservearea = entity.getReservearea();
 * String vaExtdata1 = entity.getVaExtdata1();
 * String vaExtdata2 = entity.getVaExtdata2();
 * String vaExtdata3 = entity.getVaExtdata3();
 * java.sql.Timestamp dtExtdata2 = entity.getDtExtdata2();
 * String palletNo = entity.getPalletNo();
 * String pickListKey = entity.getPickListKey();
 * String frontBackCaseCd = entity.getFrontBackCaseCd();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * java.math.BigDecimal transportPriority = entity.getTransportPriority();
 * java.math.BigDecimal useType = entity.getUseType();
 * String outputOrder = entity.getOutputOrder();
 * String factoryOrder = entity.getFactoryOrder();
 * String warehouseOrder = entity.getWarehouseOrder();
 * String lineblockOrder = entity.getLineblockOrder();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrtraceId(trtraceId);
 * entity.setTracekey(tracekey);
 * entity.setSndrcvdatetime(sndrcvdatetime);
 * entity.setWarehousecd(warehousecd);
 * entity.setFactorycd(factorycd);
 * entity.setItemcdCase(itemcdCase);
 * entity.setSkucd(skucd);
 * entity.setDestinationcd(destinationcd);
 * entity.setManufacturecd(manufacturecd);
 * entity.setOrderno(orderno);
 * entity.setMachineno(machineno);
 * entity.setCreateno(createno);
 * entity.setLimitdate(limitdate);
 * entity.setDatetime(datetime);
 * entity.setDistributioncd(distributioncd);
 * entity.setTransportcd(transportcd);
 * entity.setPalletid(palletid);
 * entity.setInitnum(initnum);
 * entity.setCreatedatetime(createdatetime);
 * entity.setAssortdatetime(assortdatetime);
 * entity.setTracetype(tracetype);
 * entity.setLineblock(lineblock);
 * entity.setAssortedunit(assortedunit);
 * entity.setAssortedindex(assortedindex);
 * entity.setOperationcode(operationcode);
 * entity.setCaseinnum(caseinnum);
 * entity.setAssortnum(assortnum);
 * entity.setAssortdifnum(assortdifnum);
 * entity.setDirectioncd(directioncd);
 * entity.setPistontype(pistontype);
 * entity.setCustomercd(customercd);
 * entity.setDirectionnum(directionnum);
 * entity.setDistwarehousecd(distwarehousecd);
 * entity.setRcvkey(rcvkey);
 * entity.setProductCd(productCd);
 * entity.setItemcdIn(itemcdIn);
 * entity.setItemcdWh(itemcdWh);
 * entity.setDesigncdCase(designcdCase);
 * entity.setDesigncdIn(designcdIn);
 * entity.setDesigncdWh(designcdWh);
 * entity.setSourcecasecd(sourcecasecd);
 * entity.setSendflg(sendflg);
 * entity.setFromflg(fromflg);
 * entity.setSupplierrcvno(supplierrcvno);
 * entity.setMixedflg(mixedflg);
 * entity.setSymbolpastdate(symbolpastdate);
 * entity.setLot1(lot1);
 * entity.setLot2(lot2);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setOtherlot1(otherlot1);
 * entity.setMakercaseno(makercaseno);
 * entity.setLendflg(lendflg);
 * entity.setCaseinnumcalc(caseinnumcalc);
 * entity.setCaseitfno(caseitfno);
 * entity.setCasebarcodevaliant(casebarcodevaliant);
 * entity.setCaselot4(caselot4);
 * entity.setCasecenterno(casecenterno);
 * entity.setCasepackno(casepackno);
 * entity.setCasepacktime(casepacktime);
 * entity.setCasebarcode(casebarcode);
 * entity.setOtherrefno2(otherrefno2);
 * entity.setOrdertype(ordertype);
 * entity.setLimitdatenow(limitdatenow);
 * entity.setCasecreatetype(casecreatetype);
 * entity.setReceivedate(receivedate);
 * entity.setArrivalportdate(arrivalportdate);
 * entity.setShipname(shipname);
 * entity.setLocgroup(locgroup);
 * entity.setLoccd(loccd);
 * entity.setShipdate(shipdate);
 * entity.setShiptocd(shiptocd);
 * entity.setExamsts(examsts);
 * entity.setTokuhancd(tokuhancd);
 * entity.setSenderLocation(senderLocation);
 * entity.setReceiverLocation(receiverLocation);
 * entity.setShipmentId(shipmentId);
 * entity.setShipmentDate(shipmentDate);
 * entity.setNumberOfPallets(numberOfPallets);
 * entity.setCarrierno(carrierno);
 * entity.setTkhnorderno(tkhnorderno);
 * entity.setSrccd(srccd);
 * entity.setBlno(blno);
 * entity.setInvoiceno(invoiceno);
 * entity.setSscc(sscc);
 * entity.setCaseno(caseno);
 * entity.setInvNum(invNum);
 * entity.setSortNum(sortNum);
 * entity.setAdoptNum(adoptNum);
 * entity.setReservearea(reservearea);
 * entity.setVaExtdata1(vaExtdata1);
 * entity.setVaExtdata2(vaExtdata2);
 * entity.setVaExtdata3(vaExtdata3);
 * entity.setDtExtdata2(dtExtdata2);
 * entity.setPalletNo(palletNo);
 * entity.setPickListKey(pickListKey);
 * entity.setFrontBackCaseCd(frontBackCaseCd);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setTransportPriority(transportPriority);
 * entity.setUseType(useType);
 * entity.setOutputOrder(outputOrder);
 * entity.setFactoryOrder(factoryOrder);
 * entity.setWarehouseOrder(warehouseOrder);
 * entity.setLineblockOrder(lineblockOrder);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrtrace extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trtraceId;

    /** TRACEKEY: {NotNull, bigint(19)} */
    protected Long _tracekey;

    /** SNDRCVDATETIME: {varchar(8)} */
    protected String _sndrcvdatetime;

    /** WAREHOUSECD: {IX, varchar(30)} */
    protected String _warehousecd;

    /** FACTORYCD: {varchar(30)} */
    protected String _factorycd;

    /** ITEMCD_CASE: {varchar(30)} */
    protected String _itemcdCase;

    /** SKUCD: {varchar(30)} */
    protected String _skucd;

    /** DESTINATIONCD: {varchar(30)} */
    protected String _destinationcd;

    /** MANUFACTURECD: {varchar(30)} */
    protected String _manufacturecd;

    /** ORDERNO: {varchar(30)} */
    protected String _orderno;

    /** MACHINENO: {varchar(30)} */
    protected String _machineno;

    /** CREATENO: {varchar(30)} */
    protected String _createno;

    /** LIMITDATE: {varchar(8)} */
    protected String _limitdate;

    /** DATETIME: {varchar(8)} */
    protected String _datetime;

    /** DISTRIBUTIONCD: {char(1)} */
    protected String _distributioncd;

    /** TRANSPORTCD: {varchar(30)} */
    protected String _transportcd;

    /** PALLETID: {varchar(30)} */
    protected String _palletid;

    /** INITNUM: {bigint(19)} */
    protected Long _initnum;

    /** CREATEDATETIME: {varchar(8)} */
    protected String _createdatetime;

    /** ASSORTDATETIME: {varchar(8)} */
    protected String _assortdatetime;

    /** TRACETYPE: {varchar(30)} */
    protected String _tracetype;

    /** LINEBLOCK: {varchar(30)} */
    protected String _lineblock;

    /** ASSORTEDUNIT: {varchar(255)} */
    protected String _assortedunit;

    /** ASSORTEDINDEX: {bigint(19)} */
    protected Long _assortedindex;

    /** OPERATIONCODE: {char(1)} */
    protected String _operationcode;

    /** CASEINNUM: {bigint(19)} */
    protected Long _caseinnum;

    /** ASSORTNUM: {bigint(19)} */
    protected Long _assortnum;

    /** ASSORTDIFNUM: {bigint(19)} */
    protected Long _assortdifnum;

    /** DIRECTIONCD: {varchar(30)} */
    protected String _directioncd;

    /** PISTONTYPE: {char(1)} */
    protected String _pistontype;

    /** CUSTOMERCD: {varchar(30)} */
    protected String _customercd;

    /** DIRECTIONNUM: {bigint(19)} */
    protected Long _directionnum;

    /** DISTWAREHOUSECD: {varchar(30)} */
    protected String _distwarehousecd;

    /** RCVKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _rcvkey;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** ITEMCD_IN: {varchar(30)} */
    protected String _itemcdIn;

    /** ITEMCD_WH: {varchar(30)} */
    protected String _itemcdWh;

    /** DESIGNCD_CASE: {varchar(30)} */
    protected String _designcdCase;

    /** DESIGNCD_IN: {varchar(30)} */
    protected String _designcdIn;

    /** DESIGNCD_WH: {varchar(30)} */
    protected String _designcdWh;

    /** SOURCECASECD: {decimal(16, 6)} */
    protected java.math.BigDecimal _sourcecasecd;

    /** SENDFLG: {decimal(16, 6)} */
    protected java.math.BigDecimal _sendflg;

    /** FROMFLG: {char(1)} */
    protected String _fromflg;

    /** SUPPLIERRCVNO: {varchar(60)} */
    protected String _supplierrcvno;

    /** MIXEDFLG: {char(1)} */
    protected String _mixedflg;

    /** SYMBOLPASTDATE: {varchar(8)} */
    protected String _symbolpastdate;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT2: {varchar(60)} */
    protected String _lot2;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** OTHERLOT1: {varchar(60)} */
    protected String _otherlot1;

    /** MAKERCASENO: {varchar(60)} */
    protected String _makercaseno;

    /** LENDFLG: {char(1)} */
    protected String _lendflg;

    /** CASEINNUMCALC: {bigint(19)} */
    protected Long _caseinnumcalc;

    /** CASEITFNO: {varchar(30)} */
    protected String _caseitfno;

    /** CASEBARCODEVALIANT: {varchar(30)} */
    protected String _casebarcodevaliant;

    /** CASELOT4: {varchar(30)} */
    protected String _caselot4;

    /** CASECENTERNO: {varchar(30)} */
    protected String _casecenterno;

    /** CASEPACKNO: {varchar(30)} */
    protected String _casepackno;

    /** CASEPACKTIME: {varchar(30)} */
    protected String _casepacktime;

    /** CASEBARCODE: {varchar(100)} */
    protected String _casebarcode;

    /** OTHERREFNO2: {varchar(60)} */
    protected String _otherrefno2;

    /** ORDERTYPE: {varchar(30)} */
    protected String _ordertype;

    /** LIMITDATENOW: {varchar(8)} */
    protected String _limitdatenow;

    /** CASECREATETYPE: {varchar(30)} */
    protected String _casecreatetype;

    /** RECEIVEDATE: {varchar(8)} */
    protected String _receivedate;

    /** ARRIVALPORTDATE: {varchar(8)} */
    protected String _arrivalportdate;

    /** SHIPNAME: {varchar(100)} */
    protected String _shipname;

    /** LOCGROUP: {varchar(30)} */
    protected String _locgroup;

    /** LOCCD: {varchar(30)} */
    protected String _loccd;

    /** SHIPDATE: {varchar(8)} */
    protected String _shipdate;

    /** SHIPTOCD: {varchar(30)} */
    protected String _shiptocd;

    /** EXAMSTS: {bigint(19)} */
    protected Long _examsts;

    /** TOKUHANCD: {varchar(100)} */
    protected String _tokuhancd;

    /** SENDER_LOCATION: {varchar(30)} */
    protected String _senderLocation;

    /** RECEIVER_LOCATION: {varchar(30)} */
    protected String _receiverLocation;

    /** SHIPMENT_ID: {varchar(30)} */
    protected String _shipmentId;

    /** SHIPMENT_DATE: {varchar(30)} */
    protected String _shipmentDate;

    /** NUMBER_OF_PALLETS: {varchar(30)} */
    protected String _numberOfPallets;

    /** CARRIERNO: {varchar(30)} */
    protected String _carrierno;

    /** TKHNORDERNO: {varchar(30)} */
    protected String _tkhnorderno;

    /** SRCCD: {varchar(30)} */
    protected String _srccd;

    /** BLNO: {varchar(60)} */
    protected String _blno;

    /** INVOICENO: {varchar(60)} */
    protected String _invoiceno;

    /** SSCC: {varchar(30)} */
    protected String _sscc;

    /** CASENO: {varchar(30)} */
    protected String _caseno;

    /** INV_NUM: {bigint(19)} */
    protected Long _invNum;

    /** SORT_NUM: {bigint(19)} */
    protected Long _sortNum;

    /** ADOPT_NUM: {bigint(19)} */
    protected Long _adoptNum;

    /** RESERVEAREA: {varchar(100)} */
    protected String _reservearea;

    /** VA_EXTDATA1: {varchar(30)} */
    protected String _vaExtdata1;

    /** VA_EXTDATA2: {varchar(30)} */
    protected String _vaExtdata2;

    /** VA_EXTDATA3: {varchar(30)} */
    protected String _vaExtdata3;

    /** DT_EXTDATA2: {datetime2(26, 6)} */
    protected java.sql.Timestamp _dtExtdata2;

    /** PALLET_NO: {varchar(30)} */
    protected String _palletNo;

    /** PICK_LIST_KEY: {varchar(30)} */
    protected String _pickListKey;

    /** FRONT_BACK_CASE_CD: {varchar(30)} */
    protected String _frontBackCaseCd;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** TRANSPORT_PRIORITY: {decimal(16, 6)} */
    protected java.math.BigDecimal _transportPriority;

    /** USE_TYPE: {decimal(16, 6)} */
    protected java.math.BigDecimal _useType;

    /** OUTPUT_ORDER: {varchar(255)} */
    protected String _outputOrder;

    /** FACTORY_ORDER: {varchar(255)} */
    protected String _factoryOrder;

    /** WAREHOUSE_ORDER: {varchar(255)} */
    protected String _warehouseOrder;

    /** LINEBLOCK_ORDER: {varchar(255)} */
    protected String _lineblockOrder;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "T_TRTRACE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_trtraceId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** M_CENTER by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] M_CENTER by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

    /** M_CLIENT by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] M_CLIENT by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTTrtrace) {
            BsTTrtrace other = (BsTTrtrace)obj;
            if (!xSV(_trtraceId, other._trtraceId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trtraceId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trtraceId));
        sb.append(dm).append(xfND(_tracekey));
        sb.append(dm).append(xfND(_sndrcvdatetime));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_factorycd));
        sb.append(dm).append(xfND(_itemcdCase));
        sb.append(dm).append(xfND(_skucd));
        sb.append(dm).append(xfND(_destinationcd));
        sb.append(dm).append(xfND(_manufacturecd));
        sb.append(dm).append(xfND(_orderno));
        sb.append(dm).append(xfND(_machineno));
        sb.append(dm).append(xfND(_createno));
        sb.append(dm).append(xfND(_limitdate));
        sb.append(dm).append(xfND(_datetime));
        sb.append(dm).append(xfND(_distributioncd));
        sb.append(dm).append(xfND(_transportcd));
        sb.append(dm).append(xfND(_palletid));
        sb.append(dm).append(xfND(_initnum));
        sb.append(dm).append(xfND(_createdatetime));
        sb.append(dm).append(xfND(_assortdatetime));
        sb.append(dm).append(xfND(_tracetype));
        sb.append(dm).append(xfND(_lineblock));
        sb.append(dm).append(xfND(_assortedunit));
        sb.append(dm).append(xfND(_assortedindex));
        sb.append(dm).append(xfND(_operationcode));
        sb.append(dm).append(xfND(_caseinnum));
        sb.append(dm).append(xfND(_assortnum));
        sb.append(dm).append(xfND(_assortdifnum));
        sb.append(dm).append(xfND(_directioncd));
        sb.append(dm).append(xfND(_pistontype));
        sb.append(dm).append(xfND(_customercd));
        sb.append(dm).append(xfND(_directionnum));
        sb.append(dm).append(xfND(_distwarehousecd));
        sb.append(dm).append(xfND(_rcvkey));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_itemcdIn));
        sb.append(dm).append(xfND(_itemcdWh));
        sb.append(dm).append(xfND(_designcdCase));
        sb.append(dm).append(xfND(_designcdIn));
        sb.append(dm).append(xfND(_designcdWh));
        sb.append(dm).append(xfND(_sourcecasecd));
        sb.append(dm).append(xfND(_sendflg));
        sb.append(dm).append(xfND(_fromflg));
        sb.append(dm).append(xfND(_supplierrcvno));
        sb.append(dm).append(xfND(_mixedflg));
        sb.append(dm).append(xfND(_symbolpastdate));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_otherlot1));
        sb.append(dm).append(xfND(_makercaseno));
        sb.append(dm).append(xfND(_lendflg));
        sb.append(dm).append(xfND(_caseinnumcalc));
        sb.append(dm).append(xfND(_caseitfno));
        sb.append(dm).append(xfND(_casebarcodevaliant));
        sb.append(dm).append(xfND(_caselot4));
        sb.append(dm).append(xfND(_casecenterno));
        sb.append(dm).append(xfND(_casepackno));
        sb.append(dm).append(xfND(_casepacktime));
        sb.append(dm).append(xfND(_casebarcode));
        sb.append(dm).append(xfND(_otherrefno2));
        sb.append(dm).append(xfND(_ordertype));
        sb.append(dm).append(xfND(_limitdatenow));
        sb.append(dm).append(xfND(_casecreatetype));
        sb.append(dm).append(xfND(_receivedate));
        sb.append(dm).append(xfND(_arrivalportdate));
        sb.append(dm).append(xfND(_shipname));
        sb.append(dm).append(xfND(_locgroup));
        sb.append(dm).append(xfND(_loccd));
        sb.append(dm).append(xfND(_shipdate));
        sb.append(dm).append(xfND(_shiptocd));
        sb.append(dm).append(xfND(_examsts));
        sb.append(dm).append(xfND(_tokuhancd));
        sb.append(dm).append(xfND(_senderLocation));
        sb.append(dm).append(xfND(_receiverLocation));
        sb.append(dm).append(xfND(_shipmentId));
        sb.append(dm).append(xfND(_shipmentDate));
        sb.append(dm).append(xfND(_numberOfPallets));
        sb.append(dm).append(xfND(_carrierno));
        sb.append(dm).append(xfND(_tkhnorderno));
        sb.append(dm).append(xfND(_srccd));
        sb.append(dm).append(xfND(_blno));
        sb.append(dm).append(xfND(_invoiceno));
        sb.append(dm).append(xfND(_sscc));
        sb.append(dm).append(xfND(_caseno));
        sb.append(dm).append(xfND(_invNum));
        sb.append(dm).append(xfND(_sortNum));
        sb.append(dm).append(xfND(_adoptNum));
        sb.append(dm).append(xfND(_reservearea));
        sb.append(dm).append(xfND(_vaExtdata1));
        sb.append(dm).append(xfND(_vaExtdata2));
        sb.append(dm).append(xfND(_vaExtdata3));
        sb.append(dm).append(xfND(_dtExtdata2));
        sb.append(dm).append(xfND(_palletNo));
        sb.append(dm).append(xfND(_pickListKey));
        sb.append(dm).append(xfND(_frontBackCaseCd));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_transportPriority));
        sb.append(dm).append(xfND(_useType));
        sb.append(dm).append(xfND(_outputOrder));
        sb.append(dm).append(xfND(_factoryOrder));
        sb.append(dm).append(xfND(_warehouseOrder));
        sb.append(dm).append(xfND(_lineblockOrder));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrtrace clone() {
        return (TTrtrace)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製品追跡情報ID
     * @return The value of the column 'TRTRACE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrtraceId() {
        checkSpecifiedProperty("trtraceId");
        return _trtraceId;
    }

    /**
     * [set] TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製品追跡情報ID
     * @param trtraceId The value of the column 'TRTRACE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrtraceId(Long trtraceId) {
        registerModifiedProperty("trtraceId");
        _trtraceId = trtraceId;
    }

    /**
     * [get] TRACEKEY: {NotNull, bigint(19)} <br>
     * 製品追跡キー
     * @return The value of the column 'TRACEKEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getTracekey() {
        checkSpecifiedProperty("tracekey");
        return _tracekey;
    }

    /**
     * [set] TRACEKEY: {NotNull, bigint(19)} <br>
     * 製品追跡キー
     * @param tracekey The value of the column 'TRACEKEY'. (basically NotNull if update: for the constraint)
     */
    public void setTracekey(Long tracekey) {
        registerModifiedProperty("tracekey");
        _tracekey = tracekey;
    }

    /**
     * [get] SNDRCVDATETIME: {varchar(8)} <br>
     * 送受信日時
     * @return The value of the column 'SNDRCVDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSndrcvdatetime() {
        checkSpecifiedProperty("sndrcvdatetime");
        return convertEmptyToNull(_sndrcvdatetime);
    }

    /**
     * [set] SNDRCVDATETIME: {varchar(8)} <br>
     * 送受信日時
     * @param sndrcvdatetime The value of the column 'SNDRCVDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSndrcvdatetime(String sndrcvdatetime) {
        registerModifiedProperty("sndrcvdatetime");
        _sndrcvdatetime = sndrcvdatetime;
    }

    /**
     * [get] WAREHOUSECD: {IX, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {IX, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] FACTORYCD: {varchar(30)} <br>
     * 工場CD
     * @return The value of the column 'FACTORYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFactorycd() {
        checkSpecifiedProperty("factorycd");
        return convertEmptyToNull(_factorycd);
    }

    /**
     * [set] FACTORYCD: {varchar(30)} <br>
     * 工場CD
     * @param factorycd The value of the column 'FACTORYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFactorycd(String factorycd) {
        registerModifiedProperty("factorycd");
        _factorycd = factorycd;
    }

    /**
     * [get] ITEMCD_CASE: {varchar(30)} <br>
     * 銘柄CD（ケース）
     * @return The value of the column 'ITEMCD_CASE'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcdCase() {
        checkSpecifiedProperty("itemcdCase");
        return convertEmptyToNull(_itemcdCase);
    }

    /**
     * [set] ITEMCD_CASE: {varchar(30)} <br>
     * 銘柄CD（ケース）
     * @param itemcdCase The value of the column 'ITEMCD_CASE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcdCase(String itemcdCase) {
        registerModifiedProperty("itemcdCase");
        _itemcdCase = itemcdCase;
    }

    /**
     * [get] SKUCD: {varchar(30)} <br>
     * SKUCD
     * @return The value of the column 'SKUCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSkucd() {
        checkSpecifiedProperty("skucd");
        return convertEmptyToNull(_skucd);
    }

    /**
     * [set] SKUCD: {varchar(30)} <br>
     * SKUCD
     * @param skucd The value of the column 'SKUCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSkucd(String skucd) {
        registerModifiedProperty("skucd");
        _skucd = skucd;
    }

    /**
     * [get] DESTINATIONCD: {varchar(30)} <br>
     * 仕向地CD
     * @return The value of the column 'DESTINATIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationcd() {
        checkSpecifiedProperty("destinationcd");
        return convertEmptyToNull(_destinationcd);
    }

    /**
     * [set] DESTINATIONCD: {varchar(30)} <br>
     * 仕向地CD
     * @param destinationcd The value of the column 'DESTINATIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationcd(String destinationcd) {
        registerModifiedProperty("destinationcd");
        _destinationcd = destinationcd;
    }

    /**
     * [get] MANUFACTURECD: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufacturecd() {
        checkSpecifiedProperty("manufacturecd");
        return convertEmptyToNull(_manufacturecd);
    }

    /**
     * [set] MANUFACTURECD: {varchar(30)} <br>
     * 製造記号
     * @param manufacturecd The value of the column 'MANUFACTURECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufacturecd(String manufacturecd) {
        registerModifiedProperty("manufacturecd");
        _manufacturecd = manufacturecd;
    }

    /**
     * [get] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @return The value of the column 'ORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderno() {
        checkSpecifiedProperty("orderno");
        return convertEmptyToNull(_orderno);
    }

    /**
     * [set] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @param orderno The value of the column 'ORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderno(String orderno) {
        registerModifiedProperty("orderno");
        _orderno = orderno;
    }

    /**
     * [get] MACHINENO: {varchar(30)} <br>
     * 号機
     * @return The value of the column 'MACHINENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMachineno() {
        checkSpecifiedProperty("machineno");
        return convertEmptyToNull(_machineno);
    }

    /**
     * [set] MACHINENO: {varchar(30)} <br>
     * 号機
     * @param machineno The value of the column 'MACHINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMachineno(String machineno) {
        registerModifiedProperty("machineno");
        _machineno = machineno;
    }

    /**
     * [get] CREATENO: {varchar(30)} <br>
     * 生出番号
     * @return The value of the column 'CREATENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreateno() {
        checkSpecifiedProperty("createno");
        return convertEmptyToNull(_createno);
    }

    /**
     * [set] CREATENO: {varchar(30)} <br>
     * 生出番号
     * @param createno The value of the column 'CREATENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateno(String createno) {
        registerModifiedProperty("createno");
        _createno = createno;
    }

    /**
     * [get] LIMITDATE: {varchar(8)} <br>
     * 製造年月日（ケース）
     * @return The value of the column 'LIMITDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitdate() {
        checkSpecifiedProperty("limitdate");
        return convertEmptyToNull(_limitdate);
    }

    /**
     * [set] LIMITDATE: {varchar(8)} <br>
     * 製造年月日（ケース）
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitdate(String limitdate) {
        registerModifiedProperty("limitdate");
        _limitdate = limitdate;
    }

    /**
     * [get] DATETIME: {varchar(8)} <br>
     * 日付時刻
     * @return The value of the column 'DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDatetime() {
        checkSpecifiedProperty("datetime");
        return convertEmptyToNull(_datetime);
    }

    /**
     * [set] DATETIME: {varchar(8)} <br>
     * 日付時刻
     * @param datetime The value of the column 'DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDatetime(String datetime) {
        registerModifiedProperty("datetime");
        _datetime = datetime;
    }

    /**
     * [get] DISTRIBUTIONCD: {char(1)} <br>
     * 流通識別
     * @return The value of the column 'DISTRIBUTIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistributioncd() {
        checkSpecifiedProperty("distributioncd");
        return convertEmptyToNull(_distributioncd);
    }

    /**
     * [set] DISTRIBUTIONCD: {char(1)} <br>
     * 流通識別
     * @param distributioncd The value of the column 'DISTRIBUTIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistributioncd(String distributioncd) {
        registerModifiedProperty("distributioncd");
        _distributioncd = distributioncd;
    }

    /**
     * [get] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportcd() {
        checkSpecifiedProperty("transportcd");
        return convertEmptyToNull(_transportcd);
    }

    /**
     * [set] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportcd(String transportcd) {
        registerModifiedProperty("transportcd");
        _transportcd = transportcd;
    }

    /**
     * [get] PALLETID: {varchar(30)} <br>
     * パレットID
     * @return The value of the column 'PALLETID'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletid() {
        checkSpecifiedProperty("palletid");
        return convertEmptyToNull(_palletid);
    }

    /**
     * [set] PALLETID: {varchar(30)} <br>
     * パレットID
     * @param palletid The value of the column 'PALLETID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletid(String palletid) {
        registerModifiedProperty("palletid");
        _palletid = palletid;
    }

    /**
     * [get] INITNUM: {bigint(19)} <br>
     * ケース初期数量
     * @return The value of the column 'INITNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInitnum() {
        checkSpecifiedProperty("initnum");
        return _initnum;
    }

    /**
     * [set] INITNUM: {bigint(19)} <br>
     * ケース初期数量
     * @param initnum The value of the column 'INITNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInitnum(Long initnum) {
        registerModifiedProperty("initnum");
        _initnum = initnum;
    }

    /**
     * [get] CREATEDATETIME: {varchar(8)} <br>
     * 作成日時
     * @return The value of the column 'CREATEDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreatedatetime() {
        checkSpecifiedProperty("createdatetime");
        return convertEmptyToNull(_createdatetime);
    }

    /**
     * [set] CREATEDATETIME: {varchar(8)} <br>
     * 作成日時
     * @param createdatetime The value of the column 'CREATEDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreatedatetime(String createdatetime) {
        registerModifiedProperty("createdatetime");
        _createdatetime = createdatetime;
    }

    /**
     * [get] ASSORTDATETIME: {varchar(8)} <br>
     * 仕分日時
     * @return The value of the column 'ASSORTDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortdatetime() {
        checkSpecifiedProperty("assortdatetime");
        return convertEmptyToNull(_assortdatetime);
    }

    /**
     * [set] ASSORTDATETIME: {varchar(8)} <br>
     * 仕分日時
     * @param assortdatetime The value of the column 'ASSORTDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortdatetime(String assortdatetime) {
        registerModifiedProperty("assortdatetime");
        _assortdatetime = assortdatetime;
    }

    /**
     * [get] TRACETYPE: {varchar(30)} <br>
     * 追跡区分
     * @return The value of the column 'TRACETYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTracetype() {
        checkSpecifiedProperty("tracetype");
        return convertEmptyToNull(_tracetype);
    }

    /**
     * [set] TRACETYPE: {varchar(30)} <br>
     * 追跡区分
     * @param tracetype The value of the column 'TRACETYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTracetype(String tracetype) {
        registerModifiedProperty("tracetype");
        _tracetype = tracetype;
    }

    /**
     * [get] LINEBLOCK: {varchar(30)} <br>
     * ラインブロック
     * @return The value of the column 'LINEBLOCK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineblock() {
        checkSpecifiedProperty("lineblock");
        return convertEmptyToNull(_lineblock);
    }

    /**
     * [set] LINEBLOCK: {varchar(30)} <br>
     * ラインブロック
     * @param lineblock The value of the column 'LINEBLOCK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineblock(String lineblock) {
        registerModifiedProperty("lineblock");
        _lineblock = lineblock;
    }

    /**
     * [get] ASSORTEDUNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'ASSORTEDUNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortedunit() {
        checkSpecifiedProperty("assortedunit");
        return convertEmptyToNull(_assortedunit);
    }

    /**
     * [set] ASSORTEDUNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @param assortedunit The value of the column 'ASSORTEDUNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortedunit(String assortedunit) {
        registerModifiedProperty("assortedunit");
        _assortedunit = assortedunit;
    }

    /**
     * [get] ASSORTEDINDEX: {bigint(19)} <br>
     * 仕分ロケ投入順
     * @return The value of the column 'ASSORTEDINDEX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAssortedindex() {
        checkSpecifiedProperty("assortedindex");
        return _assortedindex;
    }

    /**
     * [set] ASSORTEDINDEX: {bigint(19)} <br>
     * 仕分ロケ投入順
     * @param assortedindex The value of the column 'ASSORTEDINDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortedindex(Long assortedindex) {
        registerModifiedProperty("assortedindex");
        _assortedindex = assortedindex;
    }

    /**
     * [get] OPERATIONCODE: {char(1)} <br>
     * 操作数量符号
     * @return The value of the column 'OPERATIONCODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOperationcode() {
        checkSpecifiedProperty("operationcode");
        return convertEmptyToNull(_operationcode);
    }

    /**
     * [set] OPERATIONCODE: {char(1)} <br>
     * 操作数量符号
     * @param operationcode The value of the column 'OPERATIONCODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOperationcode(String operationcode) {
        registerModifiedProperty("operationcode");
        _operationcode = operationcode;
    }

    /**
     * [get] CASEINNUM: {bigint(19)} <br>
     * ケース内数量
     * @return The value of the column 'CASEINNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCaseinnum() {
        checkSpecifiedProperty("caseinnum");
        return _caseinnum;
    }

    /**
     * [set] CASEINNUM: {bigint(19)} <br>
     * ケース内数量
     * @param caseinnum The value of the column 'CASEINNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseinnum(Long caseinnum) {
        registerModifiedProperty("caseinnum");
        _caseinnum = caseinnum;
    }

    /**
     * [get] ASSORTNUM: {bigint(19)} <br>
     * 仕分数量
     * @return The value of the column 'ASSORTNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAssortnum() {
        checkSpecifiedProperty("assortnum");
        return _assortnum;
    }

    /**
     * [set] ASSORTNUM: {bigint(19)} <br>
     * 仕分数量
     * @param assortnum The value of the column 'ASSORTNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortnum(Long assortnum) {
        registerModifiedProperty("assortnum");
        _assortnum = assortnum;
    }

    /**
     * [get] ASSORTDIFNUM: {bigint(19)} <br>
     * 差異不良数量
     * @return The value of the column 'ASSORTDIFNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAssortdifnum() {
        checkSpecifiedProperty("assortdifnum");
        return _assortdifnum;
    }

    /**
     * [set] ASSORTDIFNUM: {bigint(19)} <br>
     * 差異不良数量
     * @param assortdifnum The value of the column 'ASSORTDIFNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortdifnum(Long assortdifnum) {
        registerModifiedProperty("assortdifnum");
        _assortdifnum = assortdifnum;
    }

    /**
     * [get] DIRECTIONCD: {varchar(30)} <br>
     * 方面CD
     * @return The value of the column 'DIRECTIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectioncd() {
        checkSpecifiedProperty("directioncd");
        return convertEmptyToNull(_directioncd);
    }

    /**
     * [set] DIRECTIONCD: {varchar(30)} <br>
     * 方面CD
     * @param directioncd The value of the column 'DIRECTIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectioncd(String directioncd) {
        registerModifiedProperty("directioncd");
        _directioncd = directioncd;
    }

    /**
     * [get] PISTONTYPE: {char(1)} <br>
     * ピストン区分
     * @return The value of the column 'PISTONTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPistontype() {
        checkSpecifiedProperty("pistontype");
        return convertEmptyToNull(_pistontype);
    }

    /**
     * [set] PISTONTYPE: {char(1)} <br>
     * ピストン区分
     * @param pistontype The value of the column 'PISTONTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPistontype(String pistontype) {
        registerModifiedProperty("pistontype");
        _pistontype = pistontype;
    }

    /**
     * [get] CUSTOMERCD: {varchar(30)} <br>
     * お得意様CD
     * @return The value of the column 'CUSTOMERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomercd() {
        checkSpecifiedProperty("customercd");
        return convertEmptyToNull(_customercd);
    }

    /**
     * [set] CUSTOMERCD: {varchar(30)} <br>
     * お得意様CD
     * @param customercd The value of the column 'CUSTOMERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomercd(String customercd) {
        registerModifiedProperty("customercd");
        _customercd = customercd;
    }

    /**
     * [get] DIRECTIONNUM: {bigint(19)} <br>
     * さしず数量
     * @return The value of the column 'DIRECTIONNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDirectionnum() {
        checkSpecifiedProperty("directionnum");
        return _directionnum;
    }

    /**
     * [set] DIRECTIONNUM: {bigint(19)} <br>
     * さしず数量
     * @param directionnum The value of the column 'DIRECTIONNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionnum(Long directionnum) {
        registerModifiedProperty("directionnum");
        _directionnum = directionnum;
    }

    /**
     * [get] DISTWAREHOUSECD: {varchar(30)} <br>
     * 融通先CD
     * @return The value of the column 'DISTWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistwarehousecd() {
        checkSpecifiedProperty("distwarehousecd");
        return convertEmptyToNull(_distwarehousecd);
    }

    /**
     * [set] DISTWAREHOUSECD: {varchar(30)} <br>
     * 融通先CD
     * @param distwarehousecd The value of the column 'DISTWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistwarehousecd(String distwarehousecd) {
        registerModifiedProperty("distwarehousecd");
        _distwarehousecd = distwarehousecd;
    }

    /**
     * [get] RCVKEY: {decimal(16, 6)} <br>
     * 入庫キー
     * @return The value of the column 'RCVKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRcvkey() {
        checkSpecifiedProperty("rcvkey");
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {decimal(16, 6)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        registerModifiedProperty("rcvkey");
        _rcvkey = rcvkey;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] ITEMCD_IN: {varchar(30)} <br>
     * 銘柄CD（入庫時）
     * @return The value of the column 'ITEMCD_IN'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcdIn() {
        checkSpecifiedProperty("itemcdIn");
        return convertEmptyToNull(_itemcdIn);
    }

    /**
     * [set] ITEMCD_IN: {varchar(30)} <br>
     * 銘柄CD（入庫時）
     * @param itemcdIn The value of the column 'ITEMCD_IN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcdIn(String itemcdIn) {
        registerModifiedProperty("itemcdIn");
        _itemcdIn = itemcdIn;
    }

    /**
     * [get] ITEMCD_WH: {varchar(30)} <br>
     * 銘柄CD（倉庫内）
     * @return The value of the column 'ITEMCD_WH'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcdWh() {
        checkSpecifiedProperty("itemcdWh");
        return convertEmptyToNull(_itemcdWh);
    }

    /**
     * [set] ITEMCD_WH: {varchar(30)} <br>
     * 銘柄CD（倉庫内）
     * @param itemcdWh The value of the column 'ITEMCD_WH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcdWh(String itemcdWh) {
        registerModifiedProperty("itemcdWh");
        _itemcdWh = itemcdWh;
    }

    /**
     * [get] DESIGNCD_CASE: {varchar(30)} <br>
     * デザイン区分（ケース）
     * @return The value of the column 'DESIGNCD_CASE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncdCase() {
        checkSpecifiedProperty("designcdCase");
        return convertEmptyToNull(_designcdCase);
    }

    /**
     * [set] DESIGNCD_CASE: {varchar(30)} <br>
     * デザイン区分（ケース）
     * @param designcdCase The value of the column 'DESIGNCD_CASE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncdCase(String designcdCase) {
        registerModifiedProperty("designcdCase");
        _designcdCase = designcdCase;
    }

    /**
     * [get] DESIGNCD_IN: {varchar(30)} <br>
     * デザイン区分（入庫時）
     * @return The value of the column 'DESIGNCD_IN'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncdIn() {
        checkSpecifiedProperty("designcdIn");
        return convertEmptyToNull(_designcdIn);
    }

    /**
     * [set] DESIGNCD_IN: {varchar(30)} <br>
     * デザイン区分（入庫時）
     * @param designcdIn The value of the column 'DESIGNCD_IN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncdIn(String designcdIn) {
        registerModifiedProperty("designcdIn");
        _designcdIn = designcdIn;
    }

    /**
     * [get] DESIGNCD_WH: {varchar(30)} <br>
     * デザイン区分（倉庫内）
     * @return The value of the column 'DESIGNCD_WH'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncdWh() {
        checkSpecifiedProperty("designcdWh");
        return convertEmptyToNull(_designcdWh);
    }

    /**
     * [set] DESIGNCD_WH: {varchar(30)} <br>
     * デザイン区分（倉庫内）
     * @param designcdWh The value of the column 'DESIGNCD_WH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncdWh(String designcdWh) {
        registerModifiedProperty("designcdWh");
        _designcdWh = designcdWh;
    }

    /**
     * [get] SOURCECASECD: {decimal(16, 6)} <br>
     * 作成元ケースCD
     * @return The value of the column 'SOURCECASECD'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSourcecasecd() {
        checkSpecifiedProperty("sourcecasecd");
        return _sourcecasecd;
    }

    /**
     * [set] SOURCECASECD: {decimal(16, 6)} <br>
     * 作成元ケースCD
     * @param sourcecasecd The value of the column 'SOURCECASECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSourcecasecd(java.math.BigDecimal sourcecasecd) {
        registerModifiedProperty("sourcecasecd");
        _sourcecasecd = sourcecasecd;
    }

    /**
     * [get] SENDFLG: {decimal(16, 6)} <br>
     * 送信管理区分
     * @return The value of the column 'SENDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSendflg() {
        checkSpecifiedProperty("sendflg");
        return _sendflg;
    }

    /**
     * [set] SENDFLG: {decimal(16, 6)} <br>
     * 送信管理区分
     * @param sendflg The value of the column 'SENDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendflg(java.math.BigDecimal sendflg) {
        registerModifiedProperty("sendflg");
        _sendflg = sendflg;
    }

    /**
     * [get] FROMFLG: {char(1)} <br>
     * 経路区分
     * @return The value of the column 'FROMFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromflg() {
        checkSpecifiedProperty("fromflg");
        return convertEmptyToNull(_fromflg);
    }

    /**
     * [set] FROMFLG: {char(1)} <br>
     * 経路区分
     * @param fromflg The value of the column 'FROMFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromflg(String fromflg) {
        registerModifiedProperty("fromflg");
        _fromflg = fromflg;
    }

    /**
     * [get] SUPPLIERRCVNO: {varchar(60)} <br>
     * 保税管理番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrcvno() {
        checkSpecifiedProperty("supplierrcvno");
        return convertEmptyToNull(_supplierrcvno);
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(60)} <br>
     * 保税管理番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        registerModifiedProperty("supplierrcvno");
        _supplierrcvno = supplierrcvno;
    }

    /**
     * [get] MIXEDFLG: {char(1)} <br>
     * 開封フラグ
     * @return The value of the column 'MIXEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMixedflg() {
        checkSpecifiedProperty("mixedflg");
        return convertEmptyToNull(_mixedflg);
    }

    /**
     * [set] MIXEDFLG: {char(1)} <br>
     * 開封フラグ
     * @param mixedflg The value of the column 'MIXEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMixedflg(String mixedflg) {
        registerModifiedProperty("mixedflg");
        _mixedflg = mixedflg;
    }

    /**
     * [get] SYMBOLPASTDATE: {varchar(8)} <br>
     * シンボル貼付日
     * @return The value of the column 'SYMBOLPASTDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolpastdate() {
        checkSpecifiedProperty("symbolpastdate");
        return convertEmptyToNull(_symbolpastdate);
    }

    /**
     * [set] SYMBOLPASTDATE: {varchar(8)} <br>
     * シンボル貼付日
     * @param symbolpastdate The value of the column 'SYMBOLPASTDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolpastdate(String symbolpastdate) {
        registerModifiedProperty("symbolpastdate");
        _symbolpastdate = symbolpastdate;
    }

    /**
     * [get] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(60)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot4() {
        checkSpecifiedProperty("lot4");
        return convertEmptyToNull(_lot4);
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot4(String lot4) {
        registerModifiedProperty("lot4");
        _lot4 = lot4;
    }

    /**
     * [get] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @return The value of the column 'OTHERLOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot1() {
        checkSpecifiedProperty("otherlot1");
        return convertEmptyToNull(_otherlot1);
    }

    /**
     * [set] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot1(String otherlot1) {
        registerModifiedProperty("otherlot1");
        _otherlot1 = otherlot1;
    }

    /**
     * [get] MAKERCASENO: {varchar(60)} <br>
     * メーカーケースCD
     * @return The value of the column 'MAKERCASENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMakercaseno() {
        checkSpecifiedProperty("makercaseno");
        return convertEmptyToNull(_makercaseno);
    }

    /**
     * [set] MAKERCASENO: {varchar(60)} <br>
     * メーカーケースCD
     * @param makercaseno The value of the column 'MAKERCASENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMakercaseno(String makercaseno) {
        registerModifiedProperty("makercaseno");
        _makercaseno = makercaseno;
    }

    /**
     * [get] LENDFLG: {char(1)} <br>
     * 融通フラグ
     * @return The value of the column 'LENDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLendflg() {
        checkSpecifiedProperty("lendflg");
        return convertEmptyToNull(_lendflg);
    }

    /**
     * [set] LENDFLG: {char(1)} <br>
     * 融通フラグ
     * @param lendflg The value of the column 'LENDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLendflg(String lendflg) {
        registerModifiedProperty("lendflg");
        _lendflg = lendflg;
    }

    /**
     * [get] CASEINNUMCALC: {bigint(19)} <br>
     * 符号付ケース内数量
     * @return The value of the column 'CASEINNUMCALC'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCaseinnumcalc() {
        checkSpecifiedProperty("caseinnumcalc");
        return _caseinnumcalc;
    }

    /**
     * [set] CASEINNUMCALC: {bigint(19)} <br>
     * 符号付ケース内数量
     * @param caseinnumcalc The value of the column 'CASEINNUMCALC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseinnumcalc(Long caseinnumcalc) {
        registerModifiedProperty("caseinnumcalc");
        _caseinnumcalc = caseinnumcalc;
    }

    /**
     * [get] CASEITFNO: {varchar(30)} <br>
     * ITFNo.
     * @return The value of the column 'CASEITFNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseitfno() {
        checkSpecifiedProperty("caseitfno");
        return convertEmptyToNull(_caseitfno);
    }

    /**
     * [set] CASEITFNO: {varchar(30)} <br>
     * ITFNo.
     * @param caseitfno The value of the column 'CASEITFNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseitfno(String caseitfno) {
        registerModifiedProperty("caseitfno");
        _caseitfno = caseitfno;
    }

    /**
     * [get] CASEBARCODEVALIANT: {varchar(30)} <br>
     * Barcode Valiant
     * @return The value of the column 'CASEBARCODEVALIANT'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasebarcodevaliant() {
        checkSpecifiedProperty("casebarcodevaliant");
        return convertEmptyToNull(_casebarcodevaliant);
    }

    /**
     * [set] CASEBARCODEVALIANT: {varchar(30)} <br>
     * Barcode Valiant
     * @param casebarcodevaliant The value of the column 'CASEBARCODEVALIANT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasebarcodevaliant(String casebarcodevaliant) {
        registerModifiedProperty("casebarcodevaliant");
        _casebarcodevaliant = casebarcodevaliant;
    }

    /**
     * [get] CASELOT4: {varchar(30)} <br>
     * 実製造年月日
     * @return The value of the column 'CASELOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaselot4() {
        checkSpecifiedProperty("caselot4");
        return convertEmptyToNull(_caselot4);
    }

    /**
     * [set] CASELOT4: {varchar(30)} <br>
     * 実製造年月日
     * @param caselot4 The value of the column 'CASELOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaselot4(String caselot4) {
        registerModifiedProperty("caselot4");
        _caselot4 = caselot4;
    }

    /**
     * [get] CASECENTERNO: {varchar(30)} <br>
     * 拠点No.
     * @return The value of the column 'CASECENTERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasecenterno() {
        checkSpecifiedProperty("casecenterno");
        return convertEmptyToNull(_casecenterno);
    }

    /**
     * [set] CASECENTERNO: {varchar(30)} <br>
     * 拠点No.
     * @param casecenterno The value of the column 'CASECENTERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasecenterno(String casecenterno) {
        registerModifiedProperty("casecenterno");
        _casecenterno = casecenterno;
    }

    /**
     * [get] CASEPACKNO: {varchar(30)} <br>
     * ケースパッカーNo.
     * @return The value of the column 'CASEPACKNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasepackno() {
        checkSpecifiedProperty("casepackno");
        return convertEmptyToNull(_casepackno);
    }

    /**
     * [set] CASEPACKNO: {varchar(30)} <br>
     * ケースパッカーNo.
     * @param casepackno The value of the column 'CASEPACKNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasepackno(String casepackno) {
        registerModifiedProperty("casepackno");
        _casepackno = casepackno;
    }

    /**
     * [get] CASEPACKTIME: {varchar(30)} <br>
     * ケースパッキング時間
     * @return The value of the column 'CASEPACKTIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasepacktime() {
        checkSpecifiedProperty("casepacktime");
        return convertEmptyToNull(_casepacktime);
    }

    /**
     * [set] CASEPACKTIME: {varchar(30)} <br>
     * ケースパッキング時間
     * @param casepacktime The value of the column 'CASEPACKTIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasepacktime(String casepacktime) {
        registerModifiedProperty("casepacktime");
        _casepacktime = casepacktime;
    }

    /**
     * [get] CASEBARCODE: {varchar(100)} <br>
     * 段ボールバーコード
     * @return The value of the column 'CASEBARCODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasebarcode() {
        checkSpecifiedProperty("casebarcode");
        return convertEmptyToNull(_casebarcode);
    }

    /**
     * [set] CASEBARCODE: {varchar(100)} <br>
     * 段ボールバーコード
     * @param casebarcode The value of the column 'CASEBARCODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasebarcode(String casebarcode) {
        registerModifiedProperty("casebarcode");
        _casebarcode = casebarcode;
    }

    /**
     * [get] OTHERREFNO2: {varchar(60)} <br>
     * 着地名称
     * @return The value of the column 'OTHERREFNO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno2() {
        checkSpecifiedProperty("otherrefno2");
        return convertEmptyToNull(_otherrefno2);
    }

    /**
     * [set] OTHERREFNO2: {varchar(60)} <br>
     * 着地名称
     * @param otherrefno2 The value of the column 'OTHERREFNO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno2(String otherrefno2) {
        registerModifiedProperty("otherrefno2");
        _otherrefno2 = otherrefno2;
    }

    /**
     * [get] ORDERTYPE: {varchar(30)} <br>
     * 依頼種別
     * @return The value of the column 'ORDERTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdertype() {
        checkSpecifiedProperty("ordertype");
        return convertEmptyToNull(_ordertype);
    }

    /**
     * [set] ORDERTYPE: {varchar(30)} <br>
     * 依頼種別
     * @param ordertype The value of the column 'ORDERTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdertype(String ordertype) {
        registerModifiedProperty("ordertype");
        _ordertype = ordertype;
    }

    /**
     * [get] LIMITDATENOW: {varchar(8)} <br>
     * 製造年月日（現在）
     * @return The value of the column 'LIMITDATENOW'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitdatenow() {
        checkSpecifiedProperty("limitdatenow");
        return convertEmptyToNull(_limitdatenow);
    }

    /**
     * [set] LIMITDATENOW: {varchar(8)} <br>
     * 製造年月日（現在）
     * @param limitdatenow The value of the column 'LIMITDATENOW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitdatenow(String limitdatenow) {
        registerModifiedProperty("limitdatenow");
        _limitdatenow = limitdatenow;
    }

    /**
     * [get] CASECREATETYPE: {varchar(30)} <br>
     * ケース作成区分
     * @return The value of the column 'CASECREATETYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasecreatetype() {
        checkSpecifiedProperty("casecreatetype");
        return convertEmptyToNull(_casecreatetype);
    }

    /**
     * [set] CASECREATETYPE: {varchar(30)} <br>
     * ケース作成区分
     * @param casecreatetype The value of the column 'CASECREATETYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasecreatetype(String casecreatetype) {
        registerModifiedProperty("casecreatetype");
        _casecreatetype = casecreatetype;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedate() {
        checkSpecifiedProperty("receivedate");
        return convertEmptyToNull(_receivedate);
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedate(String receivedate) {
        registerModifiedProperty("receivedate");
        _receivedate = receivedate;
    }

    /**
     * [get] ARRIVALPORTDATE: {varchar(8)} <br>
     * 入港日
     * @return The value of the column 'ARRIVALPORTDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getArrivalportdate() {
        checkSpecifiedProperty("arrivalportdate");
        return convertEmptyToNull(_arrivalportdate);
    }

    /**
     * [set] ARRIVALPORTDATE: {varchar(8)} <br>
     * 入港日
     * @param arrivalportdate The value of the column 'ARRIVALPORTDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArrivalportdate(String arrivalportdate) {
        registerModifiedProperty("arrivalportdate");
        _arrivalportdate = arrivalportdate;
    }

    /**
     * [get] SHIPNAME: {varchar(100)} <br>
     * 船名
     * @return The value of the column 'SHIPNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipname() {
        checkSpecifiedProperty("shipname");
        return convertEmptyToNull(_shipname);
    }

    /**
     * [set] SHIPNAME: {varchar(100)} <br>
     * 船名
     * @param shipname The value of the column 'SHIPNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipname(String shipname) {
        registerModifiedProperty("shipname");
        _shipname = shipname;
    }

    /**
     * [get] LOCGROUP: {varchar(30)} <br>
     * ロケグループ
     * @return The value of the column 'LOCGROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocgroup() {
        checkSpecifiedProperty("locgroup");
        return convertEmptyToNull(_locgroup);
    }

    /**
     * [set] LOCGROUP: {varchar(30)} <br>
     * ロケグループ
     * @param locgroup The value of the column 'LOCGROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocgroup(String locgroup) {
        registerModifiedProperty("locgroup");
        _locgroup = locgroup;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * ロケCD
     * @return The value of the column 'LOCCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLoccd() {
        checkSpecifiedProperty("loccd");
        return convertEmptyToNull(_loccd);
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * ロケCD
     * @param loccd The value of the column 'LOCCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoccd(String loccd) {
        registerModifiedProperty("loccd");
        _loccd = loccd;
    }

    /**
     * [get] SHIPDATE: {varchar(8)} <br>
     * 出庫日
     * @return The value of the column 'SHIPDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipdate() {
        checkSpecifiedProperty("shipdate");
        return convertEmptyToNull(_shipdate);
    }

    /**
     * [set] SHIPDATE: {varchar(8)} <br>
     * 出庫日
     * @param shipdate The value of the column 'SHIPDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipdate(String shipdate) {
        registerModifiedProperty("shipdate");
        _shipdate = shipdate;
    }

    /**
     * [get] SHIPTOCD: {varchar(30)} <br>
     * 受入先CD
     * @return The value of the column 'SHIPTOCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShiptocd() {
        checkSpecifiedProperty("shiptocd");
        return convertEmptyToNull(_shiptocd);
    }

    /**
     * [set] SHIPTOCD: {varchar(30)} <br>
     * 受入先CD
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiptocd(String shiptocd) {
        registerModifiedProperty("shiptocd");
        _shiptocd = shiptocd;
    }

    /**
     * [get] EXAMSTS: {bigint(19)} <br>
     * 検査区分
     * @return The value of the column 'EXAMSTS'. (NullAllowed even if selected: for no constraint)
     */
    public Long getExamsts() {
        checkSpecifiedProperty("examsts");
        return _examsts;
    }

    /**
     * [set] EXAMSTS: {bigint(19)} <br>
     * 検査区分
     * @param examsts The value of the column 'EXAMSTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExamsts(Long examsts) {
        registerModifiedProperty("examsts");
        _examsts = examsts;
    }

    /**
     * [get] TOKUHANCD: {varchar(100)} <br>
     * 特販業者CD
     * @return The value of the column 'TOKUHANCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTokuhancd() {
        checkSpecifiedProperty("tokuhancd");
        return convertEmptyToNull(_tokuhancd);
    }

    /**
     * [set] TOKUHANCD: {varchar(100)} <br>
     * 特販業者CD
     * @param tokuhancd The value of the column 'TOKUHANCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTokuhancd(String tokuhancd) {
        registerModifiedProperty("tokuhancd");
        _tokuhancd = tokuhancd;
    }

    /**
     * [get] SENDER_LOCATION: {varchar(30)} <br>
     * 送信ロケーション
     * @return The value of the column 'SENDER_LOCATION'. (NullAllowed even if selected: for no constraint)
     */
    public String getSenderLocation() {
        checkSpecifiedProperty("senderLocation");
        return convertEmptyToNull(_senderLocation);
    }

    /**
     * [set] SENDER_LOCATION: {varchar(30)} <br>
     * 送信ロケーション
     * @param senderLocation The value of the column 'SENDER_LOCATION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSenderLocation(String senderLocation) {
        registerModifiedProperty("senderLocation");
        _senderLocation = senderLocation;
    }

    /**
     * [get] RECEIVER_LOCATION: {varchar(30)} <br>
     * 受信ロケーション
     * @return The value of the column 'RECEIVER_LOCATION'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiverLocation() {
        checkSpecifiedProperty("receiverLocation");
        return convertEmptyToNull(_receiverLocation);
    }

    /**
     * [set] RECEIVER_LOCATION: {varchar(30)} <br>
     * 受信ロケーション
     * @param receiverLocation The value of the column 'RECEIVER_LOCATION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiverLocation(String receiverLocation) {
        registerModifiedProperty("receiverLocation");
        _receiverLocation = receiverLocation;
    }

    /**
     * [get] SHIPMENT_ID: {varchar(30)} <br>
     * 送信ID
     * @return The value of the column 'SHIPMENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipmentId() {
        checkSpecifiedProperty("shipmentId");
        return convertEmptyToNull(_shipmentId);
    }

    /**
     * [set] SHIPMENT_ID: {varchar(30)} <br>
     * 送信ID
     * @param shipmentId The value of the column 'SHIPMENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipmentId(String shipmentId) {
        registerModifiedProperty("shipmentId");
        _shipmentId = shipmentId;
    }

    /**
     * [get] SHIPMENT_DATE: {varchar(30)} <br>
     * 送信日
     * @return The value of the column 'SHIPMENT_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipmentDate() {
        checkSpecifiedProperty("shipmentDate");
        return convertEmptyToNull(_shipmentDate);
    }

    /**
     * [set] SHIPMENT_DATE: {varchar(30)} <br>
     * 送信日
     * @param shipmentDate The value of the column 'SHIPMENT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipmentDate(String shipmentDate) {
        registerModifiedProperty("shipmentDate");
        _shipmentDate = shipmentDate;
    }

    /**
     * [get] NUMBER_OF_PALLETS: {varchar(30)} <br>
     * パレット番号
     * @return The value of the column 'NUMBER_OF_PALLETS'. (NullAllowed even if selected: for no constraint)
     */
    public String getNumberOfPallets() {
        checkSpecifiedProperty("numberOfPallets");
        return convertEmptyToNull(_numberOfPallets);
    }

    /**
     * [set] NUMBER_OF_PALLETS: {varchar(30)} <br>
     * パレット番号
     * @param numberOfPallets The value of the column 'NUMBER_OF_PALLETS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNumberOfPallets(String numberOfPallets) {
        registerModifiedProperty("numberOfPallets");
        _numberOfPallets = numberOfPallets;
    }

    /**
     * [get] CARRIERNO: {varchar(30)} <br>
     * コンテナNo
     * @return The value of the column 'CARRIERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierno() {
        checkSpecifiedProperty("carrierno");
        return convertEmptyToNull(_carrierno);
    }

    /**
     * [set] CARRIERNO: {varchar(30)} <br>
     * コンテナNo
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierno(String carrierno) {
        registerModifiedProperty("carrierno");
        _carrierno = carrierno;
    }

    /**
     * [get] TKHNORDERNO: {varchar(30)} <br>
     * オーダーNo
     * @return The value of the column 'TKHNORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTkhnorderno() {
        checkSpecifiedProperty("tkhnorderno");
        return convertEmptyToNull(_tkhnorderno);
    }

    /**
     * [set] TKHNORDERNO: {varchar(30)} <br>
     * オーダーNo
     * @param tkhnorderno The value of the column 'TKHNORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTkhnorderno(String tkhnorderno) {
        registerModifiedProperty("tkhnorderno");
        _tkhnorderno = tkhnorderno;
    }

    /**
     * [get] SRCCD: {varchar(30)} <br>
     * SRC_CD
     * @return The value of the column 'SRCCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrccd() {
        checkSpecifiedProperty("srccd");
        return convertEmptyToNull(_srccd);
    }

    /**
     * [set] SRCCD: {varchar(30)} <br>
     * SRC_CD
     * @param srccd The value of the column 'SRCCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrccd(String srccd) {
        registerModifiedProperty("srccd");
        _srccd = srccd;
    }

    /**
     * [get] BLNO: {varchar(60)} <br>
     * BLNo
     * @return The value of the column 'BLNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBlno() {
        checkSpecifiedProperty("blno");
        return convertEmptyToNull(_blno);
    }

    /**
     * [set] BLNO: {varchar(60)} <br>
     * BLNo
     * @param blno The value of the column 'BLNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBlno(String blno) {
        registerModifiedProperty("blno");
        _blno = blno;
    }

    /**
     * [get] INVOICENO: {varchar(60)} <br>
     * InvoiceNo
     * @return The value of the column 'INVOICENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceno() {
        checkSpecifiedProperty("invoiceno");
        return convertEmptyToNull(_invoiceno);
    }

    /**
     * [set] INVOICENO: {varchar(60)} <br>
     * InvoiceNo
     * @param invoiceno The value of the column 'INVOICENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceno(String invoiceno) {
        registerModifiedProperty("invoiceno");
        _invoiceno = invoiceno;
    }

    /**
     * [get] SSCC: {varchar(30)} <br>
     * SSCC
     * @return The value of the column 'SSCC'. (NullAllowed even if selected: for no constraint)
     */
    public String getSscc() {
        checkSpecifiedProperty("sscc");
        return convertEmptyToNull(_sscc);
    }

    /**
     * [set] SSCC: {varchar(30)} <br>
     * SSCC
     * @param sscc The value of the column 'SSCC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSscc(String sscc) {
        registerModifiedProperty("sscc");
        _sscc = sscc;
    }

    /**
     * [get] CASENO: {varchar(30)} <br>
     * ケース番号
     * @return The value of the column 'CASENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseno() {
        checkSpecifiedProperty("caseno");
        return convertEmptyToNull(_caseno);
    }

    /**
     * [set] CASENO: {varchar(30)} <br>
     * ケース番号
     * @param caseno The value of the column 'CASENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseno(String caseno) {
        registerModifiedProperty("caseno");
        _caseno = caseno;
    }

    /**
     * [get] INV_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（保管場）
     * @return The value of the column 'INV_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInvNum() {
        checkSpecifiedProperty("invNum");
        return _invNum;
    }

    /**
     * [set] INV_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（保管場）
     * @param invNum The value of the column 'INV_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvNum(Long invNum) {
        registerModifiedProperty("invNum");
        _invNum = invNum;
    }

    /**
     * [get] SORT_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（仕分場）
     * @return The value of the column 'SORT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSortNum() {
        checkSpecifiedProperty("sortNum");
        return _sortNum;
    }

    /**
     * [set] SORT_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（仕分場）
     * @param sortNum The value of the column 'SORT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortNum(Long sortNum) {
        registerModifiedProperty("sortNum");
        _sortNum = sortNum;
    }

    /**
     * [get] ADOPT_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（引取場）
     * @return The value of the column 'ADOPT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAdoptNum() {
        checkSpecifiedProperty("adoptNum");
        return _adoptNum;
    }

    /**
     * [set] ADOPT_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（引取場）
     * @param adoptNum The value of the column 'ADOPT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdoptNum(Long adoptNum) {
        registerModifiedProperty("adoptNum");
        _adoptNum = adoptNum;
    }

    /**
     * [get] RESERVEAREA: {varchar(100)} <br>
     * 予備領域
     * @return The value of the column 'RESERVEAREA'. (NullAllowed even if selected: for no constraint)
     */
    public String getReservearea() {
        checkSpecifiedProperty("reservearea");
        return convertEmptyToNull(_reservearea);
    }

    /**
     * [set] RESERVEAREA: {varchar(100)} <br>
     * 予備領域
     * @param reservearea The value of the column 'RESERVEAREA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReservearea(String reservearea) {
        registerModifiedProperty("reservearea");
        _reservearea = reservearea;
    }

    /**
     * [get] VA_EXTDATA1: {varchar(30)} <br>
     * 送信詳細フラグ
     * @return The value of the column 'VA_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata1() {
        checkSpecifiedProperty("vaExtdata1");
        return convertEmptyToNull(_vaExtdata1);
    }

    /**
     * [set] VA_EXTDATA1: {varchar(30)} <br>
     * 送信詳細フラグ
     * @param vaExtdata1 The value of the column 'VA_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata1(String vaExtdata1) {
        registerModifiedProperty("vaExtdata1");
        _vaExtdata1 = vaExtdata1;
    }

    /**
     * [get] VA_EXTDATA2: {varchar(30)} <br>
     * 送信確定フラグ
     * @return The value of the column 'VA_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata2() {
        checkSpecifiedProperty("vaExtdata2");
        return convertEmptyToNull(_vaExtdata2);
    }

    /**
     * [set] VA_EXTDATA2: {varchar(30)} <br>
     * 送信確定フラグ
     * @param vaExtdata2 The value of the column 'VA_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata2(String vaExtdata2) {
        registerModifiedProperty("vaExtdata2");
        _vaExtdata2 = vaExtdata2;
    }

    /**
     * [get] VA_EXTDATA3: {varchar(30)} <br>
     * 内訳変更フラグ
     * @return The value of the column 'VA_EXTDATA3'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata3() {
        checkSpecifiedProperty("vaExtdata3");
        return convertEmptyToNull(_vaExtdata3);
    }

    /**
     * [set] VA_EXTDATA3: {varchar(30)} <br>
     * 内訳変更フラグ
     * @param vaExtdata3 The value of the column 'VA_EXTDATA3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata3(String vaExtdata3) {
        registerModifiedProperty("vaExtdata3");
        _vaExtdata3 = vaExtdata3;
    }

    /**
     * [get] DT_EXTDATA2: {datetime2(26, 6)} <br>
     * 配達年月日
     * @return The value of the column 'DT_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getDtExtdata2() {
        checkSpecifiedProperty("dtExtdata2");
        return _dtExtdata2;
    }

    /**
     * [set] DT_EXTDATA2: {datetime2(26, 6)} <br>
     * 配達年月日
     * @param dtExtdata2 The value of the column 'DT_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata2(java.sql.Timestamp dtExtdata2) {
        registerModifiedProperty("dtExtdata2");
        _dtExtdata2 = dtExtdata2;
    }

    /**
     * [get] PALLET_NO: {varchar(30)} <br>
     * パレット管理番号
     * @return The value of the column 'PALLET_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletNo() {
        checkSpecifiedProperty("palletNo");
        return convertEmptyToNull(_palletNo);
    }

    /**
     * [set] PALLET_NO: {varchar(30)} <br>
     * パレット管理番号
     * @param palletNo The value of the column 'PALLET_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletNo(String palletNo) {
        registerModifiedProperty("palletNo");
        _palletNo = palletNo;
    }

    /**
     * [get] PICK_LIST_KEY: {varchar(30)} <br>
     * 山出しリストNo.
     * @return The value of the column 'PICK_LIST_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickListKey() {
        checkSpecifiedProperty("pickListKey");
        return convertEmptyToNull(_pickListKey);
    }

    /**
     * [set] PICK_LIST_KEY: {varchar(30)} <br>
     * 山出しリストNo.
     * @param pickListKey The value of the column 'PICK_LIST_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickListKey(String pickListKey) {
        registerModifiedProperty("pickListKey");
        _pickListKey = pickListKey;
    }

    /**
     * [get] FRONT_BACK_CASE_CD: {varchar(30)} <br>
     * 前後ケース
     * @return The value of the column 'FRONT_BACK_CASE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFrontBackCaseCd() {
        checkSpecifiedProperty("frontBackCaseCd");
        return convertEmptyToNull(_frontBackCaseCd);
    }

    /**
     * [set] FRONT_BACK_CASE_CD: {varchar(30)} <br>
     * 前後ケース
     * @param frontBackCaseCd The value of the column 'FRONT_BACK_CASE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFrontBackCaseCd(String frontBackCaseCd) {
        registerModifiedProperty("frontBackCaseCd");
        _frontBackCaseCd = frontBackCaseCd;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] TRANSPORT_PRIORITY: {decimal(16, 6)} <br>
     * 組織出力順
     * @return The value of the column 'TRANSPORT_PRIORITY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTransportPriority() {
        checkSpecifiedProperty("transportPriority");
        return _transportPriority;
    }

    /**
     * [set] TRANSPORT_PRIORITY: {decimal(16, 6)} <br>
     * 組織出力順
     * @param transportPriority The value of the column 'TRANSPORT_PRIORITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportPriority(java.math.BigDecimal transportPriority) {
        registerModifiedProperty("transportPriority");
        _transportPriority = transportPriority;
    }

    /**
     * [get] USE_TYPE: {decimal(16, 6)} <br>
     * 使用区分
     * @return The value of the column 'USE_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getUseType() {
        checkSpecifiedProperty("useType");
        return _useType;
    }

    /**
     * [set] USE_TYPE: {decimal(16, 6)} <br>
     * 使用区分
     * @param useType The value of the column 'USE_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseType(java.math.BigDecimal useType) {
        registerModifiedProperty("useType");
        _useType = useType;
    }

    /**
     * [get] OUTPUT_ORDER: {varchar(255)} <br>
     * 銘柄出力順
     * @return The value of the column 'OUTPUT_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getOutputOrder() {
        checkSpecifiedProperty("outputOrder");
        return convertEmptyToNull(_outputOrder);
    }

    /**
     * [set] OUTPUT_ORDER: {varchar(255)} <br>
     * 銘柄出力順
     * @param outputOrder The value of the column 'OUTPUT_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOutputOrder(String outputOrder) {
        registerModifiedProperty("outputOrder");
        _outputOrder = outputOrder;
    }

    /**
     * [get] FACTORY_ORDER: {varchar(255)} <br>
     * 工場出力順
     * @return The value of the column 'FACTORY_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getFactoryOrder() {
        checkSpecifiedProperty("factoryOrder");
        return convertEmptyToNull(_factoryOrder);
    }

    /**
     * [set] FACTORY_ORDER: {varchar(255)} <br>
     * 工場出力順
     * @param factoryOrder The value of the column 'FACTORY_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFactoryOrder(String factoryOrder) {
        registerModifiedProperty("factoryOrder");
        _factoryOrder = factoryOrder;
    }

    /**
     * [get] WAREHOUSE_ORDER: {varchar(255)} <br>
     * 保管場所出力順
     * @return The value of the column 'WAREHOUSE_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseOrder() {
        checkSpecifiedProperty("warehouseOrder");
        return convertEmptyToNull(_warehouseOrder);
    }

    /**
     * [set] WAREHOUSE_ORDER: {varchar(255)} <br>
     * 保管場所出力順
     * @param warehouseOrder The value of the column 'WAREHOUSE_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseOrder(String warehouseOrder) {
        registerModifiedProperty("warehouseOrder");
        _warehouseOrder = warehouseOrder;
    }

    /**
     * [get] LINEBLOCK_ORDER: {varchar(255)} <br>
     * ライン/ブロック出力順
     * @return The value of the column 'LINEBLOCK_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineblockOrder() {
        checkSpecifiedProperty("lineblockOrder");
        return convertEmptyToNull(_lineblockOrder);
    }

    /**
     * [set] LINEBLOCK_ORDER: {varchar(255)} <br>
     * ライン/ブロック出力順
     * @param lineblockOrder The value of the column 'LINEBLOCK_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineblockOrder(String lineblockOrder) {
        registerModifiedProperty("lineblockOrder");
        _lineblockOrder = lineblockOrder;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}

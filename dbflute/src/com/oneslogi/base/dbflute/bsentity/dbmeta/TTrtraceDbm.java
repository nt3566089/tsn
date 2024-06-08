package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of T_TRTRACE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrtraceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrtraceDbm _instance = new TTrtraceDbm();
    private TTrtraceDbm() {}
    public static TTrtraceDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((TTrtrace)et).getTrtraceId(), (et, vl) -> ((TTrtrace)et).setTrtraceId(ctl(vl)), "trtraceId");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getTracekey(), (et, vl) -> ((TTrtrace)et).setTracekey(ctl(vl)), "tracekey");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getSndrcvdatetime(), (et, vl) -> ((TTrtrace)et).setSndrcvdatetime((String)vl), "sndrcvdatetime");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getWarehousecd(), (et, vl) -> ((TTrtrace)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getFactorycd(), (et, vl) -> ((TTrtrace)et).setFactorycd((String)vl), "factorycd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getItemcdCase(), (et, vl) -> ((TTrtrace)et).setItemcdCase((String)vl), "itemcdCase");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getSkucd(), (et, vl) -> ((TTrtrace)et).setSkucd((String)vl), "skucd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getDestinationcd(), (et, vl) -> ((TTrtrace)et).setDestinationcd((String)vl), "destinationcd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getManufacturecd(), (et, vl) -> ((TTrtrace)et).setManufacturecd((String)vl), "manufacturecd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getOrderno(), (et, vl) -> ((TTrtrace)et).setOrderno((String)vl), "orderno");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getMachineno(), (et, vl) -> ((TTrtrace)et).setMachineno((String)vl), "machineno");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCreateno(), (et, vl) -> ((TTrtrace)et).setCreateno((String)vl), "createno");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getLimitdate(), (et, vl) -> ((TTrtrace)et).setLimitdate((String)vl), "limitdate");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getDatetime(), (et, vl) -> ((TTrtrace)et).setDatetime((String)vl), "datetime");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getDistributioncd(), (et, vl) -> ((TTrtrace)et).setDistributioncd((String)vl), "distributioncd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getTransportcd(), (et, vl) -> ((TTrtrace)et).setTransportcd((String)vl), "transportcd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getPalletid(), (et, vl) -> ((TTrtrace)et).setPalletid((String)vl), "palletid");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getInitnum(), (et, vl) -> ((TTrtrace)et).setInitnum(ctl(vl)), "initnum");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCreatedatetime(), (et, vl) -> ((TTrtrace)et).setCreatedatetime((String)vl), "createdatetime");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getAssortdatetime(), (et, vl) -> ((TTrtrace)et).setAssortdatetime((String)vl), "assortdatetime");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getTracetype(), (et, vl) -> ((TTrtrace)et).setTracetype((String)vl), "tracetype");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getLineblock(), (et, vl) -> ((TTrtrace)et).setLineblock((String)vl), "lineblock");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getAssortedunit(), (et, vl) -> ((TTrtrace)et).setAssortedunit((String)vl), "assortedunit");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getAssortedindex(), (et, vl) -> ((TTrtrace)et).setAssortedindex(ctl(vl)), "assortedindex");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getOperationcode(), (et, vl) -> ((TTrtrace)et).setOperationcode((String)vl), "operationcode");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCaseinnum(), (et, vl) -> ((TTrtrace)et).setCaseinnum(ctl(vl)), "caseinnum");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getAssortnum(), (et, vl) -> ((TTrtrace)et).setAssortnum(ctl(vl)), "assortnum");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getAssortdifnum(), (et, vl) -> ((TTrtrace)et).setAssortdifnum(ctl(vl)), "assortdifnum");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getDirectioncd(), (et, vl) -> ((TTrtrace)et).setDirectioncd((String)vl), "directioncd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getPistontype(), (et, vl) -> ((TTrtrace)et).setPistontype((String)vl), "pistontype");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCustomercd(), (et, vl) -> ((TTrtrace)et).setCustomercd((String)vl), "customercd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getDirectionnum(), (et, vl) -> ((TTrtrace)et).setDirectionnum(ctl(vl)), "directionnum");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getDistwarehousecd(), (et, vl) -> ((TTrtrace)et).setDistwarehousecd((String)vl), "distwarehousecd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getRcvkey(), (et, vl) -> ((TTrtrace)et).setRcvkey(ctb(vl)), "rcvkey");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getProductCd(), (et, vl) -> ((TTrtrace)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getItemcdIn(), (et, vl) -> ((TTrtrace)et).setItemcdIn((String)vl), "itemcdIn");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getItemcdWh(), (et, vl) -> ((TTrtrace)et).setItemcdWh((String)vl), "itemcdWh");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getDesigncdCase(), (et, vl) -> ((TTrtrace)et).setDesigncdCase((String)vl), "designcdCase");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getDesigncdIn(), (et, vl) -> ((TTrtrace)et).setDesigncdIn((String)vl), "designcdIn");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getDesigncdWh(), (et, vl) -> ((TTrtrace)et).setDesigncdWh((String)vl), "designcdWh");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getSourcecasecd(), (et, vl) -> ((TTrtrace)et).setSourcecasecd(ctb(vl)), "sourcecasecd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getSendflg(), (et, vl) -> ((TTrtrace)et).setSendflg(ctb(vl)), "sendflg");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getFromflg(), (et, vl) -> ((TTrtrace)et).setFromflg((String)vl), "fromflg");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getSupplierrcvno(), (et, vl) -> ((TTrtrace)et).setSupplierrcvno((String)vl), "supplierrcvno");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getMixedflg(), (et, vl) -> ((TTrtrace)et).setMixedflg((String)vl), "mixedflg");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getSymbolpastdate(), (et, vl) -> ((TTrtrace)et).setSymbolpastdate((String)vl), "symbolpastdate");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getLot1(), (et, vl) -> ((TTrtrace)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getLot2(), (et, vl) -> ((TTrtrace)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getLot3(), (et, vl) -> ((TTrtrace)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getLot4(), (et, vl) -> ((TTrtrace)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getOtherlot1(), (et, vl) -> ((TTrtrace)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getMakercaseno(), (et, vl) -> ((TTrtrace)et).setMakercaseno((String)vl), "makercaseno");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getLendflg(), (et, vl) -> ((TTrtrace)et).setLendflg((String)vl), "lendflg");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCaseinnumcalc(), (et, vl) -> ((TTrtrace)et).setCaseinnumcalc(ctl(vl)), "caseinnumcalc");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCaseitfno(), (et, vl) -> ((TTrtrace)et).setCaseitfno((String)vl), "caseitfno");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCasebarcodevaliant(), (et, vl) -> ((TTrtrace)et).setCasebarcodevaliant((String)vl), "casebarcodevaliant");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCaselot4(), (et, vl) -> ((TTrtrace)et).setCaselot4((String)vl), "caselot4");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCasecenterno(), (et, vl) -> ((TTrtrace)et).setCasecenterno((String)vl), "casecenterno");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCasepackno(), (et, vl) -> ((TTrtrace)et).setCasepackno((String)vl), "casepackno");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCasepacktime(), (et, vl) -> ((TTrtrace)et).setCasepacktime((String)vl), "casepacktime");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCasebarcode(), (et, vl) -> ((TTrtrace)et).setCasebarcode((String)vl), "casebarcode");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getOtherrefno2(), (et, vl) -> ((TTrtrace)et).setOtherrefno2((String)vl), "otherrefno2");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getOrdertype(), (et, vl) -> ((TTrtrace)et).setOrdertype((String)vl), "ordertype");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getLimitdatenow(), (et, vl) -> ((TTrtrace)et).setLimitdatenow((String)vl), "limitdatenow");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCasecreatetype(), (et, vl) -> ((TTrtrace)et).setCasecreatetype((String)vl), "casecreatetype");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getReceivedate(), (et, vl) -> ((TTrtrace)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getArrivalportdate(), (et, vl) -> ((TTrtrace)et).setArrivalportdate((String)vl), "arrivalportdate");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getShipname(), (et, vl) -> ((TTrtrace)et).setShipname((String)vl), "shipname");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getLocgroup(), (et, vl) -> ((TTrtrace)et).setLocgroup((String)vl), "locgroup");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getLoccd(), (et, vl) -> ((TTrtrace)et).setLoccd((String)vl), "loccd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getShipdate(), (et, vl) -> ((TTrtrace)et).setShipdate((String)vl), "shipdate");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getShiptocd(), (et, vl) -> ((TTrtrace)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getExamsts(), (et, vl) -> ((TTrtrace)et).setExamsts(ctl(vl)), "examsts");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getTokuhancd(), (et, vl) -> ((TTrtrace)et).setTokuhancd((String)vl), "tokuhancd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getSenderLocation(), (et, vl) -> ((TTrtrace)et).setSenderLocation((String)vl), "senderLocation");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getReceiverLocation(), (et, vl) -> ((TTrtrace)et).setReceiverLocation((String)vl), "receiverLocation");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getShipmentId(), (et, vl) -> ((TTrtrace)et).setShipmentId((String)vl), "shipmentId");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getShipmentDate(), (et, vl) -> ((TTrtrace)et).setShipmentDate((String)vl), "shipmentDate");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getNumberOfPallets(), (et, vl) -> ((TTrtrace)et).setNumberOfPallets((String)vl), "numberOfPallets");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCarrierno(), (et, vl) -> ((TTrtrace)et).setCarrierno((String)vl), "carrierno");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getTkhnorderno(), (et, vl) -> ((TTrtrace)et).setTkhnorderno((String)vl), "tkhnorderno");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getSrccd(), (et, vl) -> ((TTrtrace)et).setSrccd((String)vl), "srccd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getBlno(), (et, vl) -> ((TTrtrace)et).setBlno((String)vl), "blno");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getInvoiceno(), (et, vl) -> ((TTrtrace)et).setInvoiceno((String)vl), "invoiceno");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getSscc(), (et, vl) -> ((TTrtrace)et).setSscc((String)vl), "sscc");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCaseno(), (et, vl) -> ((TTrtrace)et).setCaseno((String)vl), "caseno");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getInvNum(), (et, vl) -> ((TTrtrace)et).setInvNum(ctl(vl)), "invNum");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getSortNum(), (et, vl) -> ((TTrtrace)et).setSortNum(ctl(vl)), "sortNum");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getAdoptNum(), (et, vl) -> ((TTrtrace)et).setAdoptNum(ctl(vl)), "adoptNum");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getReservearea(), (et, vl) -> ((TTrtrace)et).setReservearea((String)vl), "reservearea");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getVaExtdata1(), (et, vl) -> ((TTrtrace)et).setVaExtdata1((String)vl), "vaExtdata1");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getVaExtdata2(), (et, vl) -> ((TTrtrace)et).setVaExtdata2((String)vl), "vaExtdata2");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getVaExtdata3(), (et, vl) -> ((TTrtrace)et).setVaExtdata3((String)vl), "vaExtdata3");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getDtExtdata2(), (et, vl) -> ((TTrtrace)et).setDtExtdata2(cttp(vl)), "dtExtdata2");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getPalletNo(), (et, vl) -> ((TTrtrace)et).setPalletNo((String)vl), "palletNo");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getPickListKey(), (et, vl) -> ((TTrtrace)et).setPickListKey((String)vl), "pickListKey");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getFrontBackCaseCd(), (et, vl) -> ((TTrtrace)et).setFrontBackCaseCd((String)vl), "frontBackCaseCd");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getCenterId(), (et, vl) -> ((TTrtrace)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getClientId(), (et, vl) -> ((TTrtrace)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getTransportPriority(), (et, vl) -> ((TTrtrace)et).setTransportPriority(ctb(vl)), "transportPriority");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getUseType(), (et, vl) -> ((TTrtrace)et).setUseType(ctb(vl)), "useType");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getOutputOrder(), (et, vl) -> ((TTrtrace)et).setOutputOrder((String)vl), "outputOrder");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getFactoryOrder(), (et, vl) -> ((TTrtrace)et).setFactoryOrder((String)vl), "factoryOrder");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getWarehouseOrder(), (et, vl) -> ((TTrtrace)et).setWarehouseOrder((String)vl), "warehouseOrder");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getLineblockOrder(), (et, vl) -> ((TTrtrace)et).setLineblockOrder((String)vl), "lineblockOrder");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getDelFlg(), (et, vl) -> ((TTrtrace)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getVersionNo(), (et, vl) -> ((TTrtrace)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getControlNo(), (et, vl) -> ((TTrtrace)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getAddDt(), (et, vl) -> ((TTrtrace)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getAddUser(), (et, vl) -> ((TTrtrace)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getAddProcess(), (et, vl) -> ((TTrtrace)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getUpdDt(), (et, vl) -> ((TTrtrace)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getUpdUser(), (et, vl) -> ((TTrtrace)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrtrace)et).getUpdProcess(), (et, vl) -> ((TTrtrace)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrtrace)et).getMCenter(), (et, vl) -> ((TTrtrace)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TTrtrace)et).getMClient(), (et, vl) -> ((TTrtrace)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRTRACE";
    protected final String _tableDispName = "T_TRTRACE";
    protected final String _tablePropertyName = "TTrtrace";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRTRACE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrtraceId = cci("TRTRACE_ID", "TRTRACE_ID", null, null, Long.class, "trtraceId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTracekey = cci("TRACEKEY", "TRACEKEY", null, null, Long.class, "tracekey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSndrcvdatetime = cci("SNDRCVDATETIME", "SNDRCVDATETIME", null, null, String.class, "sndrcvdatetime", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFactorycd = cci("FACTORYCD", "FACTORYCD", null, null, String.class, "factorycd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcdCase = cci("ITEMCD_CASE", "ITEMCD_CASE", null, null, String.class, "itemcdCase", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSkucd = cci("SKUCD", "SKUCD", null, null, String.class, "skucd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationcd = cci("DESTINATIONCD", "DESTINATIONCD", null, null, String.class, "destinationcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturecd = cci("MANUFACTURECD", "MANUFACTURECD", null, null, String.class, "manufacturecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderno = cci("ORDERNO", "ORDERNO", null, null, String.class, "orderno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMachineno = cci("MACHINENO", "MACHINENO", null, null, String.class, "machineno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateno = cci("CREATENO", "CREATENO", null, null, String.class, "createno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitdate = cci("LIMITDATE", "LIMITDATE", null, null, String.class, "limitdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDatetime = cci("DATETIME", "DATETIME", null, null, String.class, "datetime", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistributioncd = cci("DISTRIBUTIONCD", "DISTRIBUTIONCD", null, null, String.class, "distributioncd", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportcd = cci("TRANSPORTCD", "TRANSPORTCD", null, null, String.class, "transportcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletid = cci("PALLETID", "PALLETID", null, null, String.class, "palletid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInitnum = cci("INITNUM", "INITNUM", null, null, Long.class, "initnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedatetime = cci("CREATEDATETIME", "CREATEDATETIME", null, null, String.class, "createdatetime", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortdatetime = cci("ASSORTDATETIME", "ASSORTDATETIME", null, null, String.class, "assortdatetime", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTracetype = cci("TRACETYPE", "TRACETYPE", null, null, String.class, "tracetype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineblock = cci("LINEBLOCK", "LINEBLOCK", null, null, String.class, "lineblock", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortedunit = cci("ASSORTEDUNIT", "ASSORTEDUNIT", null, null, String.class, "assortedunit", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortedindex = cci("ASSORTEDINDEX", "ASSORTEDINDEX", null, null, Long.class, "assortedindex", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOperationcode = cci("OPERATIONCODE", "OPERATIONCODE", null, null, String.class, "operationcode", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseinnum = cci("CASEINNUM", "CASEINNUM", null, null, Long.class, "caseinnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortnum = cci("ASSORTNUM", "ASSORTNUM", null, null, Long.class, "assortnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortdifnum = cci("ASSORTDIFNUM", "ASSORTDIFNUM", null, null, Long.class, "assortdifnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectioncd = cci("DIRECTIONCD", "DIRECTIONCD", null, null, String.class, "directioncd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPistontype = cci("PISTONTYPE", "PISTONTYPE", null, null, String.class, "pistontype", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomercd = cci("CUSTOMERCD", "CUSTOMERCD", null, null, String.class, "customercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionnum = cci("DIRECTIONNUM", "DIRECTIONNUM", null, null, Long.class, "directionnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistwarehousecd = cci("DISTWAREHOUSECD", "DISTWAREHOUSECD", null, null, String.class, "distwarehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RCVKEY", "RCVKEY", null, null, java.math.BigDecimal.class, "rcvkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcdIn = cci("ITEMCD_IN", "ITEMCD_IN", null, null, String.class, "itemcdIn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcdWh = cci("ITEMCD_WH", "ITEMCD_WH", null, null, String.class, "itemcdWh", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncdCase = cci("DESIGNCD_CASE", "DESIGNCD_CASE", null, null, String.class, "designcdCase", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncdIn = cci("DESIGNCD_IN", "DESIGNCD_IN", null, null, String.class, "designcdIn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncdWh = cci("DESIGNCD_WH", "DESIGNCD_WH", null, null, String.class, "designcdWh", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourcecasecd = cci("SOURCECASECD", "SOURCECASECD", null, null, java.math.BigDecimal.class, "sourcecasecd", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendflg = cci("SENDFLG", "SENDFLG", null, null, java.math.BigDecimal.class, "sendflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromflg = cci("FROMFLG", "FROMFLG", null, null, String.class, "fromflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrcvno = cci("SUPPLIERRCVNO", "SUPPLIERRCVNO", null, null, String.class, "supplierrcvno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMixedflg = cci("MIXEDFLG", "MIXEDFLG", null, null, String.class, "mixedflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolpastdate = cci("SYMBOLPASTDATE", "SYMBOLPASTDATE", null, null, String.class, "symbolpastdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1 = cci("OTHERLOT1", "OTHERLOT1", null, null, String.class, "otherlot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMakercaseno = cci("MAKERCASENO", "MAKERCASENO", null, null, String.class, "makercaseno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLendflg = cci("LENDFLG", "LENDFLG", null, null, String.class, "lendflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseinnumcalc = cci("CASEINNUMCALC", "CASEINNUMCALC", null, null, Long.class, "caseinnumcalc", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseitfno = cci("CASEITFNO", "CASEITFNO", null, null, String.class, "caseitfno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasebarcodevaliant = cci("CASEBARCODEVALIANT", "CASEBARCODEVALIANT", null, null, String.class, "casebarcodevaliant", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaselot4 = cci("CASELOT4", "CASELOT4", null, null, String.class, "caselot4", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasecenterno = cci("CASECENTERNO", "CASECENTERNO", null, null, String.class, "casecenterno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasepackno = cci("CASEPACKNO", "CASEPACKNO", null, null, String.class, "casepackno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasepacktime = cci("CASEPACKTIME", "CASEPACKTIME", null, null, String.class, "casepacktime", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasebarcode = cci("CASEBARCODE", "CASEBARCODE", null, null, String.class, "casebarcode", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno2 = cci("OTHERREFNO2", "OTHERREFNO2", null, null, String.class, "otherrefno2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdertype = cci("ORDERTYPE", "ORDERTYPE", null, null, String.class, "ordertype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitdatenow = cci("LIMITDATENOW", "LIMITDATENOW", null, null, String.class, "limitdatenow", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasecreatetype = cci("CASECREATETYPE", "CASECREATETYPE", null, null, String.class, "casecreatetype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("RECEIVEDATE", "RECEIVEDATE", null, null, String.class, "receivedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArrivalportdate = cci("ARRIVALPORTDATE", "ARRIVALPORTDATE", null, null, String.class, "arrivalportdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipname = cci("SHIPNAME", "SHIPNAME", null, null, String.class, "shipname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocgroup = cci("LOCGROUP", "LOCGROUP", null, null, String.class, "locgroup", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoccd = cci("LOCCD", "LOCCD", null, null, String.class, "loccd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipdate = cci("SHIPDATE", "SHIPDATE", null, null, String.class, "shipdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("SHIPTOCD", "SHIPTOCD", null, null, String.class, "shiptocd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExamsts = cci("EXAMSTS", "EXAMSTS", null, null, Long.class, "examsts", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTokuhancd = cci("TOKUHANCD", "TOKUHANCD", null, null, String.class, "tokuhancd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSenderLocation = cci("SENDER_LOCATION", "SENDER_LOCATION", null, null, String.class, "senderLocation", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiverLocation = cci("RECEIVER_LOCATION", "RECEIVER_LOCATION", null, null, String.class, "receiverLocation", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipmentId = cci("SHIPMENT_ID", "SHIPMENT_ID", null, null, String.class, "shipmentId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipmentDate = cci("SHIPMENT_DATE", "SHIPMENT_DATE", null, null, String.class, "shipmentDate", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNumberOfPallets = cci("NUMBER_OF_PALLETS", "NUMBER_OF_PALLETS", null, null, String.class, "numberOfPallets", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierno = cci("CARRIERNO", "CARRIERNO", null, null, String.class, "carrierno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTkhnorderno = cci("TKHNORDERNO", "TKHNORDERNO", null, null, String.class, "tkhnorderno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrccd = cci("SRCCD", "SRCCD", null, null, String.class, "srccd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlno = cci("BLNO", "BLNO", null, null, String.class, "blno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceno = cci("INVOICENO", "INVOICENO", null, null, String.class, "invoiceno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSscc = cci("SSCC", "SSCC", null, null, String.class, "sscc", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseno = cci("CASENO", "CASENO", null, null, String.class, "caseno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvNum = cci("INV_NUM", "INV_NUM", null, null, Long.class, "invNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortNum = cci("SORT_NUM", "SORT_NUM", null, null, Long.class, "sortNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdoptNum = cci("ADOPT_NUM", "ADOPT_NUM", null, null, Long.class, "adoptNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReservearea = cci("RESERVEAREA", "RESERVEAREA", null, null, String.class, "reservearea", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata1 = cci("VA_EXTDATA1", "VA_EXTDATA1", null, null, String.class, "vaExtdata1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata2 = cci("VA_EXTDATA2", "VA_EXTDATA2", null, null, String.class, "vaExtdata2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata3 = cci("VA_EXTDATA3", "VA_EXTDATA3", null, null, String.class, "vaExtdata3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata2 = cci("DT_EXTDATA2", "DT_EXTDATA2", null, null, java.sql.Timestamp.class, "dtExtdata2", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletNo = cci("PALLET_NO", "PALLET_NO", null, null, String.class, "palletNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickListKey = cci("PICK_LIST_KEY", "PICK_LIST_KEY", null, null, String.class, "pickListKey", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFrontBackCaseCd = cci("FRONT_BACK_CASE_CD", "FRONT_BACK_CASE_CD", null, null, String.class, "frontBackCaseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnTransportPriority = cci("TRANSPORT_PRIORITY", "TRANSPORT_PRIORITY", null, null, java.math.BigDecimal.class, "transportPriority", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseType = cci("USE_TYPE", "USE_TYPE", null, null, java.math.BigDecimal.class, "useType", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOutputOrder = cci("OUTPUT_ORDER", "OUTPUT_ORDER", null, null, String.class, "outputOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFactoryOrder = cci("FACTORY_ORDER", "FACTORY_ORDER", null, null, String.class, "factoryOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseOrder = cci("WAREHOUSE_ORDER", "WAREHOUSE_ORDER", null, null, String.class, "warehouseOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineblockOrder = cci("LINEBLOCK_ORDER", "LINEBLOCK_ORDER", null, null, String.class, "lineblockOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * TRTRACE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrtraceId() { return _columnTrtraceId; }
    /**
     * TRACEKEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTracekey() { return _columnTracekey; }
    /**
     * SNDRCVDATETIME: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSndrcvdatetime() { return _columnSndrcvdatetime; }
    /**
     * WAREHOUSECD: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * FACTORYCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFactorycd() { return _columnFactorycd; }
    /**
     * ITEMCD_CASE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcdCase() { return _columnItemcdCase; }
    /**
     * SKUCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSkucd() { return _columnSkucd; }
    /**
     * DESTINATIONCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationcd() { return _columnDestinationcd; }
    /**
     * MANUFACTURECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturecd() { return _columnManufacturecd; }
    /**
     * ORDERNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderno() { return _columnOrderno; }
    /**
     * MACHINENO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMachineno() { return _columnMachineno; }
    /**
     * CREATENO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateno() { return _columnCreateno; }
    /**
     * LIMITDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitdate() { return _columnLimitdate; }
    /**
     * DATETIME: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDatetime() { return _columnDatetime; }
    /**
     * DISTRIBUTIONCD: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistributioncd() { return _columnDistributioncd; }
    /**
     * TRANSPORTCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportcd() { return _columnTransportcd; }
    /**
     * PALLETID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletid() { return _columnPalletid; }
    /**
     * INITNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInitnum() { return _columnInitnum; }
    /**
     * CREATEDATETIME: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedatetime() { return _columnCreatedatetime; }
    /**
     * ASSORTDATETIME: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortdatetime() { return _columnAssortdatetime; }
    /**
     * TRACETYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTracetype() { return _columnTracetype; }
    /**
     * LINEBLOCK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineblock() { return _columnLineblock; }
    /**
     * ASSORTEDUNIT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortedunit() { return _columnAssortedunit; }
    /**
     * ASSORTEDINDEX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortedindex() { return _columnAssortedindex; }
    /**
     * OPERATIONCODE: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOperationcode() { return _columnOperationcode; }
    /**
     * CASEINNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseinnum() { return _columnCaseinnum; }
    /**
     * ASSORTNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortnum() { return _columnAssortnum; }
    /**
     * ASSORTDIFNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortdifnum() { return _columnAssortdifnum; }
    /**
     * DIRECTIONCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectioncd() { return _columnDirectioncd; }
    /**
     * PISTONTYPE: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPistontype() { return _columnPistontype; }
    /**
     * CUSTOMERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomercd() { return _columnCustomercd; }
    /**
     * DIRECTIONNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionnum() { return _columnDirectionnum; }
    /**
     * DISTWAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistwarehousecd() { return _columnDistwarehousecd; }
    /**
     * RCVKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvkey() { return _columnRcvkey; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * ITEMCD_IN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcdIn() { return _columnItemcdIn; }
    /**
     * ITEMCD_WH: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcdWh() { return _columnItemcdWh; }
    /**
     * DESIGNCD_CASE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncdCase() { return _columnDesigncdCase; }
    /**
     * DESIGNCD_IN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncdIn() { return _columnDesigncdIn; }
    /**
     * DESIGNCD_WH: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncdWh() { return _columnDesigncdWh; }
    /**
     * SOURCECASECD: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourcecasecd() { return _columnSourcecasecd; }
    /**
     * SENDFLG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendflg() { return _columnSendflg; }
    /**
     * FROMFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromflg() { return _columnFromflg; }
    /**
     * SUPPLIERRCVNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierrcvno() { return _columnSupplierrcvno; }
    /**
     * MIXEDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMixedflg() { return _columnMixedflg; }
    /**
     * SYMBOLPASTDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolpastdate() { return _columnSymbolpastdate; }
    /**
     * LOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * LOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * OTHERLOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot1() { return _columnOtherlot1; }
    /**
     * MAKERCASENO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMakercaseno() { return _columnMakercaseno; }
    /**
     * LENDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLendflg() { return _columnLendflg; }
    /**
     * CASEINNUMCALC: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseinnumcalc() { return _columnCaseinnumcalc; }
    /**
     * CASEITFNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseitfno() { return _columnCaseitfno; }
    /**
     * CASEBARCODEVALIANT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasebarcodevaliant() { return _columnCasebarcodevaliant; }
    /**
     * CASELOT4: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaselot4() { return _columnCaselot4; }
    /**
     * CASECENTERNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasecenterno() { return _columnCasecenterno; }
    /**
     * CASEPACKNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasepackno() { return _columnCasepackno; }
    /**
     * CASEPACKTIME: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasepacktime() { return _columnCasepacktime; }
    /**
     * CASEBARCODE: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasebarcode() { return _columnCasebarcode; }
    /**
     * OTHERREFNO2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno2() { return _columnOtherrefno2; }
    /**
     * ORDERTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdertype() { return _columnOrdertype; }
    /**
     * LIMITDATENOW: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitdatenow() { return _columnLimitdatenow; }
    /**
     * CASECREATETYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasecreatetype() { return _columnCasecreatetype; }
    /**
     * RECEIVEDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedate() { return _columnReceivedate; }
    /**
     * ARRIVALPORTDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArrivalportdate() { return _columnArrivalportdate; }
    /**
     * SHIPNAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipname() { return _columnShipname; }
    /**
     * LOCGROUP: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocgroup() { return _columnLocgroup; }
    /**
     * LOCCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoccd() { return _columnLoccd; }
    /**
     * SHIPDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipdate() { return _columnShipdate; }
    /**
     * SHIPTOCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * EXAMSTS: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExamsts() { return _columnExamsts; }
    /**
     * TOKUHANCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTokuhancd() { return _columnTokuhancd; }
    /**
     * SENDER_LOCATION: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSenderLocation() { return _columnSenderLocation; }
    /**
     * RECEIVER_LOCATION: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiverLocation() { return _columnReceiverLocation; }
    /**
     * SHIPMENT_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipmentId() { return _columnShipmentId; }
    /**
     * SHIPMENT_DATE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipmentDate() { return _columnShipmentDate; }
    /**
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberOfPallets() { return _columnNumberOfPallets; }
    /**
     * CARRIERNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierno() { return _columnCarrierno; }
    /**
     * TKHNORDERNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTkhnorderno() { return _columnTkhnorderno; }
    /**
     * SRCCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrccd() { return _columnSrccd; }
    /**
     * BLNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlno() { return _columnBlno; }
    /**
     * INVOICENO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceno() { return _columnInvoiceno; }
    /**
     * SSCC: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSscc() { return _columnSscc; }
    /**
     * CASENO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseno() { return _columnCaseno; }
    /**
     * INV_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvNum() { return _columnInvNum; }
    /**
     * SORT_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortNum() { return _columnSortNum; }
    /**
     * ADOPT_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdoptNum() { return _columnAdoptNum; }
    /**
     * RESERVEAREA: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReservearea() { return _columnReservearea; }
    /**
     * VA_EXTDATA1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata1() { return _columnVaExtdata1; }
    /**
     * VA_EXTDATA2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata2() { return _columnVaExtdata2; }
    /**
     * VA_EXTDATA3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata3() { return _columnVaExtdata3; }
    /**
     * DT_EXTDATA2: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata2() { return _columnDtExtdata2; }
    /**
     * PALLET_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletNo() { return _columnPalletNo; }
    /**
     * PICK_LIST_KEY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickListKey() { return _columnPickListKey; }
    /**
     * FRONT_BACK_CASE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFrontBackCaseCd() { return _columnFrontBackCaseCd; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * TRANSPORT_PRIORITY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportPriority() { return _columnTransportPriority; }
    /**
     * USE_TYPE: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseType() { return _columnUseType; }
    /**
     * OUTPUT_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOutputOrder() { return _columnOutputOrder; }
    /**
     * FACTORY_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFactoryOrder() { return _columnFactoryOrder; }
    /**
     * WAREHOUSE_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseOrder() { return _columnWarehouseOrder; }
    /**
     * LINEBLOCK_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineblockOrder() { return _columnLineblockOrder; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTrtraceId());
        ls.add(columnTracekey());
        ls.add(columnSndrcvdatetime());
        ls.add(columnWarehousecd());
        ls.add(columnFactorycd());
        ls.add(columnItemcdCase());
        ls.add(columnSkucd());
        ls.add(columnDestinationcd());
        ls.add(columnManufacturecd());
        ls.add(columnOrderno());
        ls.add(columnMachineno());
        ls.add(columnCreateno());
        ls.add(columnLimitdate());
        ls.add(columnDatetime());
        ls.add(columnDistributioncd());
        ls.add(columnTransportcd());
        ls.add(columnPalletid());
        ls.add(columnInitnum());
        ls.add(columnCreatedatetime());
        ls.add(columnAssortdatetime());
        ls.add(columnTracetype());
        ls.add(columnLineblock());
        ls.add(columnAssortedunit());
        ls.add(columnAssortedindex());
        ls.add(columnOperationcode());
        ls.add(columnCaseinnum());
        ls.add(columnAssortnum());
        ls.add(columnAssortdifnum());
        ls.add(columnDirectioncd());
        ls.add(columnPistontype());
        ls.add(columnCustomercd());
        ls.add(columnDirectionnum());
        ls.add(columnDistwarehousecd());
        ls.add(columnRcvkey());
        ls.add(columnProductCd());
        ls.add(columnItemcdIn());
        ls.add(columnItemcdWh());
        ls.add(columnDesigncdCase());
        ls.add(columnDesigncdIn());
        ls.add(columnDesigncdWh());
        ls.add(columnSourcecasecd());
        ls.add(columnSendflg());
        ls.add(columnFromflg());
        ls.add(columnSupplierrcvno());
        ls.add(columnMixedflg());
        ls.add(columnSymbolpastdate());
        ls.add(columnLot1());
        ls.add(columnLot2());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnOtherlot1());
        ls.add(columnMakercaseno());
        ls.add(columnLendflg());
        ls.add(columnCaseinnumcalc());
        ls.add(columnCaseitfno());
        ls.add(columnCasebarcodevaliant());
        ls.add(columnCaselot4());
        ls.add(columnCasecenterno());
        ls.add(columnCasepackno());
        ls.add(columnCasepacktime());
        ls.add(columnCasebarcode());
        ls.add(columnOtherrefno2());
        ls.add(columnOrdertype());
        ls.add(columnLimitdatenow());
        ls.add(columnCasecreatetype());
        ls.add(columnReceivedate());
        ls.add(columnArrivalportdate());
        ls.add(columnShipname());
        ls.add(columnLocgroup());
        ls.add(columnLoccd());
        ls.add(columnShipdate());
        ls.add(columnShiptocd());
        ls.add(columnExamsts());
        ls.add(columnTokuhancd());
        ls.add(columnSenderLocation());
        ls.add(columnReceiverLocation());
        ls.add(columnShipmentId());
        ls.add(columnShipmentDate());
        ls.add(columnNumberOfPallets());
        ls.add(columnCarrierno());
        ls.add(columnTkhnorderno());
        ls.add(columnSrccd());
        ls.add(columnBlno());
        ls.add(columnInvoiceno());
        ls.add(columnSscc());
        ls.add(columnCaseno());
        ls.add(columnInvNum());
        ls.add(columnSortNum());
        ls.add(columnAdoptNum());
        ls.add(columnReservearea());
        ls.add(columnVaExtdata1());
        ls.add(columnVaExtdata2());
        ls.add(columnVaExtdata3());
        ls.add(columnDtExtdata2());
        ls.add(columnPalletNo());
        ls.add(columnPickListKey());
        ls.add(columnFrontBackCaseCd());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnTransportPriority());
        ls.add(columnUseType());
        ls.add(columnOutputOrder());
        ls.add(columnFactoryOrder());
        ls.add(columnWarehouseOrder());
        ls.add(columnLineblockOrder());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnTrtraceId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_TRTRACE_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrtraceList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_TRTRACE_FK2", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrtraceList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrtrace"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrtraceCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrtraceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrtrace> getEntityType() { return TTrtrace.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrtrace newEntity() { return new TTrtrace(); }
    public TTrtrace newMyEntity() { return new TTrtrace(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrtrace)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrtrace)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

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
 * The DB meta of T_TRSYMBOL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrsymbolDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrsymbolDbm _instance = new TTrsymbolDbm();
    private TTrsymbolDbm() {}
    public static TTrsymbolDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getTrsymbolId(), (et, vl) -> ((TTrsymbol)et).setTrsymbolId(ctl(vl)), "trsymbolId");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getCasecd(), (et, vl) -> ((TTrsymbol)et).setCasecd(ctl(vl)), "casecd");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getProductCd(), (et, vl) -> ((TTrsymbol)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getItemcd(), (et, vl) -> ((TTrsymbol)et).setItemcd((String)vl), "itemcd");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getProductCdCase(), (et, vl) -> ((TTrsymbol)et).setProductCdCase((String)vl), "productCdCase");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getProductCdIn(), (et, vl) -> ((TTrsymbol)et).setProductCdIn((String)vl), "productCdIn");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getLot3(), (et, vl) -> ((TTrsymbol)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getDesigncdIn(), (et, vl) -> ((TTrsymbol)et).setDesigncdIn((String)vl), "designcdIn");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getDesigncdCase(), (et, vl) -> ((TTrsymbol)et).setDesigncdCase((String)vl), "designcdCase");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getLot4(), (et, vl) -> ((TTrsymbol)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getLot1(), (et, vl) -> ((TTrsymbol)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getLot2(), (et, vl) -> ((TTrsymbol)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbollineno(), (et, vl) -> ((TTrsymbol)et).setSymbollineno(ctl(vl)), "symbollineno");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getOwnercd(), (et, vl) -> ((TTrsymbol)et).setOwnercd((String)vl), "ownercd");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getStockTypeCd(), (et, vl) -> ((TTrsymbol)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getForeigncargoflg(), (et, vl) -> ((TTrsymbol)et).setForeigncargoflg(ctb(vl)), "foreigncargoflg");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getCustomsreleaseflg(), (et, vl) -> ((TTrsymbol)et).setCustomsreleaseflg(ctb(vl)), "customsreleaseflg");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getDamageflg(), (et, vl) -> ((TTrsymbol)et).setDamageflg(ctb(vl)), "damageflg");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getReceivePlanHId(), (et, vl) -> ((TTrsymbol)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getReceivePlanBId(), (et, vl) -> ((TTrsymbol)et).setReceivePlanBId(ctb(vl)), "receivePlanBId");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getRcvlineno(), (et, vl) -> ((TTrsymbol)et).setRcvlineno(ctl(vl)), "rcvlineno");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSendrcvkey(), (et, vl) -> ((TTrsymbol)et).setSendrcvkey(ctb(vl)), "sendrcvkey");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getMakercaseno(), (et, vl) -> ((TTrsymbol)et).setMakercaseno((String)vl), "makercaseno");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolsts(), (et, vl) -> ((TTrsymbol)et).setSymbolsts((String)vl), "symbolsts");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymboladdflg(), (et, vl) -> ((TTrsymbol)et).setSymboladdflg((String)vl), "symboladdflg");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getPrintedflg(), (et, vl) -> ((TTrsymbol)et).setPrintedflg((String)vl), "printedflg");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolsnddate(), (et, vl) -> ((TTrsymbol)et).setSymbolsnddate((String)vl), "symbolsnddate");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolpastdate(), (et, vl) -> ((TTrsymbol)et).setSymbolpastdate((String)vl), "symbolpastdate");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolpalletondate(), (et, vl) -> ((TTrsymbol)et).setSymbolpalletondate((String)vl), "symbolpalletondate");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getReceivedate(), (et, vl) -> ((TTrsymbol)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getPalletId(), (et, vl) -> ((TTrsymbol)et).setPalletId(ctl(vl)), "palletId");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getBasePalletId(), (et, vl) -> ((TTrsymbol)et).setBasePalletId(ctb(vl)), "basePalletId");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getParentpalletupddate(), (et, vl) -> ((TTrsymbol)et).setParentpalletupddate(cttp(vl)), "parentpalletupddate");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getPrintingdate(), (et, vl) -> ((TTrsymbol)et).setPrintingdate((String)vl), "printingdate");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getLocationId(), (et, vl) -> ((TTrsymbol)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getRestqty(), (et, vl) -> ((TTrsymbol)et).setRestqty(ctb(vl)), "restqty");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getReceivedqty(), (et, vl) -> ((TTrsymbol)et).setReceivedqty(ctb(vl)), "receivedqty");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getDistributioncd(), (et, vl) -> ((TTrsymbol)et).setDistributioncd((String)vl), "distributioncd");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getTransportcd(), (et, vl) -> ((TTrsymbol)et).setTransportcd((String)vl), "transportcd");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getOrderno(), (et, vl) -> ((TTrsymbol)et).setOrderno((String)vl), "orderno");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getRcvPalletId(), (et, vl) -> ((TTrsymbol)et).setRcvPalletId(ctl(vl)), "rcvPalletId");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolfactorycd(), (et, vl) -> ((TTrsymbol)et).setSymbolfactorycd((String)vl), "symbolfactorycd");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolitemcd(), (et, vl) -> ((TTrsymbol)et).setSymbolitemcd((String)vl), "symbolitemcd");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolsku(), (et, vl) -> ((TTrsymbol)et).setSymbolsku((String)vl), "symbolsku");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolreceivecd(), (et, vl) -> ((TTrsymbol)et).setSymbolreceivecd((String)vl), "symbolreceivecd");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolproductmark(), (et, vl) -> ((TTrsymbol)et).setSymbolproductmark((String)vl), "symbolproductmark");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolorderno(), (et, vl) -> ((TTrsymbol)et).setSymbolorderno((String)vl), "symbolorderno");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolprinterno(), (et, vl) -> ((TTrsymbol)et).setSymbolprinterno((String)vl), "symbolprinterno");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolmakeno(), (et, vl) -> ((TTrsymbol)et).setSymbolmakeno((String)vl), "symbolmakeno");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbollot4(), (et, vl) -> ((TTrsymbol)et).setSymbollot4((String)vl), "symbollot4");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolmaketime(), (et, vl) -> ((TTrsymbol)et).setSymbolmaketime((String)vl), "symbolmaketime");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolcirculationid(), (et, vl) -> ((TTrsymbol)et).setSymbolcirculationid((String)vl), "symbolcirculationid");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbolrcvkey(), (et, vl) -> ((TTrsymbol)et).setSymbolrcvkey(ctl(vl)), "symbolrcvkey");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getSymbollot3(), (et, vl) -> ((TTrsymbol)et).setSymbollot3((String)vl), "symbollot3");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getQrdata(), (et, vl) -> ((TTrsymbol)et).setQrdata((String)vl), "qrdata");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getTrexamresultId(), (et, vl) -> ((TTrsymbol)et).setTrexamresultId(ctl(vl)), "trexamresultId");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getCaseitfno(), (et, vl) -> ((TTrsymbol)et).setCaseitfno((String)vl), "caseitfno");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getCasebarcodevaliant(), (et, vl) -> ((TTrsymbol)et).setCasebarcodevaliant((String)vl), "casebarcodevaliant");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getCaselot4(), (et, vl) -> ((TTrsymbol)et).setCaselot4((String)vl), "caselot4");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getDatetime(), (et, vl) -> ((TTrsymbol)et).setDatetime(cttp(vl)), "datetime");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getCasecenterno(), (et, vl) -> ((TTrsymbol)et).setCasecenterno((String)vl), "casecenterno");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getCasepackno(), (et, vl) -> ((TTrsymbol)et).setCasepackno((String)vl), "casepackno");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getCasepacktime(), (et, vl) -> ((TTrsymbol)et).setCasepacktime((String)vl), "casepacktime");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getCasebarcode(), (et, vl) -> ((TTrsymbol)et).setCasebarcode((String)vl), "casebarcode");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getMixedflg(), (et, vl) -> ((TTrsymbol)et).setMixedflg((String)vl), "mixedflg");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getShippedflg(), (et, vl) -> ((TTrsymbol)et).setShippedflg((String)vl), "shippedflg");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getCasecreatetype(), (et, vl) -> ((TTrsymbol)et).setCasecreatetype((String)vl), "casecreatetype");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getCreatedatetime(), (et, vl) -> ((TTrsymbol)et).setCreatedatetime(cttp(vl)), "createdatetime");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getInitnum(), (et, vl) -> ((TTrsymbol)et).setInitnum(ctl(vl)), "initnum");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getParentcasecd(), (et, vl) -> ((TTrsymbol)et).setParentcasecd(ctl(vl)), "parentcasecd");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getTrPicklistId(), (et, vl) -> ((TTrsymbol)et).setTrPicklistId(ctl(vl)), "trPicklistId");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getPicklistgno(), (et, vl) -> ((TTrsymbol)et).setPicklistgno(ctl(vl)), "picklistgno");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getRecombdatetime(), (et, vl) -> ((TTrsymbol)et).setRecombdatetime(cttp(vl)), "recombdatetime");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getReprintedflg(), (et, vl) -> ((TTrsymbol)et).setReprintedflg((String)vl), "reprintedflg");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getTracests(), (et, vl) -> ((TTrsymbol)et).setTracests(ctl(vl)), "tracests");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getClientId(), (et, vl) -> ((TTrsymbol)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getBatjproductionym(), (et, vl) -> ((TTrsymbol)et).setBatjproductionym((String)vl), "batjproductionym");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getCometodate(), (et, vl) -> ((TTrsymbol)et).setCometodate((String)vl), "cometodate");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getRcvpalletno(), (et, vl) -> ((TTrsymbol)et).setRcvpalletno((String)vl), "rcvpalletno");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getTaxpalletno(), (et, vl) -> ((TTrsymbol)et).setTaxpalletno((String)vl), "taxpalletno");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getShtypecd(), (et, vl) -> ((TTrsymbol)et).setShtypecd((String)vl), "shtypecd");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getCenterId(), (et, vl) -> ((TTrsymbol)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getRestctn(), (et, vl) -> ((TTrsymbol)et).setRestctn(ctb(vl)), "restctn");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getDelFlg(), (et, vl) -> ((TTrsymbol)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getVersionNo(), (et, vl) -> ((TTrsymbol)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getControlNo(), (et, vl) -> ((TTrsymbol)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getAddDt(), (et, vl) -> ((TTrsymbol)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getAddUser(), (et, vl) -> ((TTrsymbol)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getAddProcess(), (et, vl) -> ((TTrsymbol)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getUpdDt(), (et, vl) -> ((TTrsymbol)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getUpdUser(), (et, vl) -> ((TTrsymbol)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrsymbol)et).getUpdProcess(), (et, vl) -> ((TTrsymbol)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRSYMBOL";
    protected final String _tableDispName = "T_TRSYMBOL";
    protected final String _tablePropertyName = "TTrsymbol";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRSYMBOL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrsymbolId = cci("TRSYMBOL_ID", "TRSYMBOL_ID", null, null, Long.class, "trsymbolId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TCenterSymbolList", null, false);
    protected final ColumnInfo _columnCasecd = cci("CASECD", "CASECD", null, null, Long.class, "casecd", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcd = cci("ITEMCD", "ITEMCD", null, null, String.class, "itemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCdCase = cci("PRODUCT_CD_CASE", "PRODUCT_CD_CASE", null, null, String.class, "productCdCase", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCdIn = cci("PRODUCT_CD_IN", "PRODUCT_CD_IN", null, null, String.class, "productCdIn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncdIn = cci("DESIGNCD_IN", "DESIGNCD_IN", null, null, String.class, "designcdIn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncdCase = cci("DESIGNCD_CASE", "DESIGNCD_CASE", null, null, String.class, "designcdCase", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbollineno = cci("SYMBOLLINENO", "SYMBOLLINENO", null, null, Long.class, "symbollineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnercd = cci("OWNERCD", "OWNERCD", null, null, String.class, "ownercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeigncargoflg = cci("FOREIGNCARGOFLG", "FOREIGNCARGOFLG", null, null, java.math.BigDecimal.class, "foreigncargoflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomsreleaseflg = cci("CUSTOMSRELEASEFLG", "CUSTOMSRELEASEFLG", null, null, java.math.BigDecimal.class, "customsreleaseflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDamageflg = cci("DAMAGEFLG", "DAMAGEFLG", null, null, java.math.BigDecimal.class, "damageflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanBId = cci("RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", null, null, java.math.BigDecimal.class, "receivePlanBId", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvlineno = cci("RCVLINENO", "RCVLINENO", null, null, Long.class, "rcvlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendrcvkey = cci("SENDRCVKEY", "SENDRCVKEY", null, null, java.math.BigDecimal.class, "sendrcvkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMakercaseno = cci("MAKERCASENO", "MAKERCASENO", null, null, String.class, "makercaseno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolsts = cci("SYMBOLSTS", "SYMBOLSTS", null, null, String.class, "symbolsts", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymboladdflg = cci("SYMBOLADDFLG", "SYMBOLADDFLG", null, null, String.class, "symboladdflg", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintedflg = cci("PRINTEDFLG", "PRINTEDFLG", null, null, String.class, "printedflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolsnddate = cci("SYMBOLSNDDATE", "SYMBOLSNDDATE", null, null, String.class, "symbolsnddate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolpastdate = cci("SYMBOLPASTDATE", "SYMBOLPASTDATE", null, null, String.class, "symbolpastdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolpalletondate = cci("SYMBOLPALLETONDATE", "SYMBOLPALLETONDATE", null, null, String.class, "symbolpalletondate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("RECEIVEDATE", "RECEIVEDATE", null, null, String.class, "receivedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletId = cci("PALLET_ID", "PALLET_ID", null, null, Long.class, "palletId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBasePalletId = cci("BASE_PALLET_ID", "BASE_PALLET_ID", null, null, java.math.BigDecimal.class, "basePalletId", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParentpalletupddate = cci("PARENTPALLETUPDDATE", "PARENTPALLETUPDDATE", null, null, java.sql.Timestamp.class, "parentpalletupddate", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintingdate = cci("PRINTINGDATE", "PRINTINGDATE", null, null, String.class, "printingdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestqty = cci("RESTQTY", "RESTQTY", null, null, java.math.BigDecimal.class, "restqty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedqty = cci("RECEIVEDQTY", "RECEIVEDQTY", null, null, java.math.BigDecimal.class, "receivedqty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistributioncd = cci("DISTRIBUTIONCD", "DISTRIBUTIONCD", null, null, String.class, "distributioncd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportcd = cci("TRANSPORTCD", "TRANSPORTCD", null, null, String.class, "transportcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderno = cci("ORDERNO", "ORDERNO", null, null, String.class, "orderno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvPalletId = cci("RCV_PALLET_ID", "RCV_PALLET_ID", null, null, Long.class, "rcvPalletId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolfactorycd = cci("SYMBOLFACTORYCD", "SYMBOLFACTORYCD", null, null, String.class, "symbolfactorycd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolitemcd = cci("SYMBOLITEMCD", "SYMBOLITEMCD", null, null, String.class, "symbolitemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolsku = cci("SYMBOLSKU", "SYMBOLSKU", null, null, String.class, "symbolsku", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolreceivecd = cci("SYMBOLRECEIVECD", "SYMBOLRECEIVECD", null, null, String.class, "symbolreceivecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolproductmark = cci("SYMBOLPRODUCTMARK", "SYMBOLPRODUCTMARK", null, null, String.class, "symbolproductmark", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolorderno = cci("SYMBOLORDERNO", "SYMBOLORDERNO", null, null, String.class, "symbolorderno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolprinterno = cci("SYMBOLPRINTERNO", "SYMBOLPRINTERNO", null, null, String.class, "symbolprinterno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolmakeno = cci("SYMBOLMAKENO", "SYMBOLMAKENO", null, null, String.class, "symbolmakeno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbollot4 = cci("SYMBOLLOT4", "SYMBOLLOT4", null, null, String.class, "symbollot4", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolmaketime = cci("SYMBOLMAKETIME", "SYMBOLMAKETIME", null, null, String.class, "symbolmaketime", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolcirculationid = cci("SYMBOLCIRCULATIONID", "SYMBOLCIRCULATIONID", null, null, String.class, "symbolcirculationid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolrcvkey = cci("SYMBOLRCVKEY", "SYMBOLRCVKEY", null, null, Long.class, "symbolrcvkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbollot3 = cci("SYMBOLLOT3", "SYMBOLLOT3", null, null, String.class, "symbollot3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQrdata = cci("QRData", "QRData", null, null, String.class, "qrdata", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrexamresultId = cci("TREXAMRESULT_ID", "TREXAMRESULT_ID", null, null, Long.class, "trexamresultId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseitfno = cci("CASEITFNO", "CASEITFNO", null, null, String.class, "caseitfno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasebarcodevaliant = cci("CASEBARCODEVALIANT", "CASEBARCODEVALIANT", null, null, String.class, "casebarcodevaliant", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaselot4 = cci("CASELOT4", "CASELOT4", null, null, String.class, "caselot4", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDatetime = cci("DATETIME", "DATETIME", null, null, java.sql.Timestamp.class, "datetime", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasecenterno = cci("CASECENTERNO", "CASECENTERNO", null, null, String.class, "casecenterno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasepackno = cci("CASEPACKNO", "CASEPACKNO", null, null, String.class, "casepackno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasepacktime = cci("CASEPACKTIME", "CASEPACKTIME", null, null, String.class, "casepacktime", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasebarcode = cci("CASEBARCODE", "CASEBARCODE", null, null, String.class, "casebarcode", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMixedflg = cci("MIXEDFLG", "MIXEDFLG", null, null, String.class, "mixedflg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippedflg = cci("SHIPPEDFLG", "SHIPPEDFLG", null, null, String.class, "shippedflg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasecreatetype = cci("CASECREATETYPE", "CASECREATETYPE", null, null, String.class, "casecreatetype", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedatetime = cci("CREATEDATETIME", "CREATEDATETIME", null, null, java.sql.Timestamp.class, "createdatetime", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInitnum = cci("InitNum", "InitNum", null, null, Long.class, "initnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParentcasecd = cci("ParentCaseCd", "ParentCaseCd", null, null, Long.class, "parentcasecd", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrPicklistId = cci("TR_PICKLIST_ID", "TR_PICKLIST_ID", null, null, Long.class, "trPicklistId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicklistgno = cci("PicklistGNo", "PicklistGNo", null, null, Long.class, "picklistgno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRecombdatetime = cci("RecombDatetime", "RecombDatetime", null, null, java.sql.Timestamp.class, "recombdatetime", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReprintedflg = cci("ReprintedFlg", "ReprintedFlg", null, null, String.class, "reprintedflg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTracests = cci("TraceSts", "TraceSts", null, null, Long.class, "tracests", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatjproductionym = cci("BATJPRODUCTIONYM", "BATJPRODUCTIONYM", null, null, String.class, "batjproductionym", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCometodate = cci("COMETODATE", "COMETODATE", null, null, String.class, "cometodate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvpalletno = cci("RCVPALLETNO", "RCVPALLETNO", null, null, String.class, "rcvpalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaxpalletno = cci("TAXPALLETNO", "TAXPALLETNO", null, null, String.class, "taxpalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShtypecd = cci("SHTYPECD", "SHTYPECD", null, null, String.class, "shtypecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestctn = cci("RESTCTN", "RESTCTN", null, null, java.math.BigDecimal.class, "restctn", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsymbolId() { return _columnTrsymbolId; }
    /**
     * CASECD: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasecd() { return _columnCasecd; }
    /**
     * PRODUCT_CD: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * ITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcd() { return _columnItemcd; }
    /**
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCdCase() { return _columnProductCdCase; }
    /**
     * PRODUCT_CD_IN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCdIn() { return _columnProductCdIn; }
    /**
     * LOT3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * DESIGNCD_IN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncdIn() { return _columnDesigncdIn; }
    /**
     * DESIGNCD_CASE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncdCase() { return _columnDesigncdCase; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * LOT1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * SYMBOLLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbollineno() { return _columnSymbollineno; }
    /**
     * OWNERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnercd() { return _columnOwnercd; }
    /**
     * STOCK_TYPE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeigncargoflg() { return _columnForeigncargoflg; }
    /**
     * CUSTOMSRELEASEFLG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomsreleaseflg() { return _columnCustomsreleaseflg; }
    /**
     * DAMAGEFLG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageflg() { return _columnDamageflg; }
    /**
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
    /**
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanBId() { return _columnReceivePlanBId; }
    /**
     * RCVLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvlineno() { return _columnRcvlineno; }
    /**
     * SENDRCVKEY: {IX, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendrcvkey() { return _columnSendrcvkey; }
    /**
     * MAKERCASENO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMakercaseno() { return _columnMakercaseno; }
    /**
     * SYMBOLSTS: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolsts() { return _columnSymbolsts; }
    /**
     * SYMBOLADDFLG: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymboladdflg() { return _columnSymboladdflg; }
    /**
     * PRINTEDFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintedflg() { return _columnPrintedflg; }
    /**
     * SYMBOLSNDDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolsnddate() { return _columnSymbolsnddate; }
    /**
     * SYMBOLPASTDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolpastdate() { return _columnSymbolpastdate; }
    /**
     * SYMBOLPALLETONDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolpalletondate() { return _columnSymbolpalletondate; }
    /**
     * RECEIVEDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedate() { return _columnReceivedate; }
    /**
     * PALLET_ID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletId() { return _columnPalletId; }
    /**
     * BASE_PALLET_ID: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBasePalletId() { return _columnBasePalletId; }
    /**
     * PARENTPALLETUPDDATE: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParentpalletupddate() { return _columnParentpalletupddate; }
    /**
     * PRINTINGDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintingdate() { return _columnPrintingdate; }
    /**
     * LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * RESTQTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestqty() { return _columnRestqty; }
    /**
     * RECEIVEDQTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedqty() { return _columnReceivedqty; }
    /**
     * DISTRIBUTIONCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistributioncd() { return _columnDistributioncd; }
    /**
     * TRANSPORTCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportcd() { return _columnTransportcd; }
    /**
     * ORDERNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderno() { return _columnOrderno; }
    /**
     * RCV_PALLET_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvPalletId() { return _columnRcvPalletId; }
    /**
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolfactorycd() { return _columnSymbolfactorycd; }
    /**
     * SYMBOLITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolitemcd() { return _columnSymbolitemcd; }
    /**
     * SYMBOLSKU: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolsku() { return _columnSymbolsku; }
    /**
     * SYMBOLRECEIVECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolreceivecd() { return _columnSymbolreceivecd; }
    /**
     * SYMBOLPRODUCTMARK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolproductmark() { return _columnSymbolproductmark; }
    /**
     * SYMBOLORDERNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolorderno() { return _columnSymbolorderno; }
    /**
     * SYMBOLPRINTERNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolprinterno() { return _columnSymbolprinterno; }
    /**
     * SYMBOLMAKENO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolmakeno() { return _columnSymbolmakeno; }
    /**
     * SYMBOLLOT4: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbollot4() { return _columnSymbollot4; }
    /**
     * SYMBOLMAKETIME: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolmaketime() { return _columnSymbolmaketime; }
    /**
     * SYMBOLCIRCULATIONID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolcirculationid() { return _columnSymbolcirculationid; }
    /**
     * SYMBOLRCVKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolrcvkey() { return _columnSymbolrcvkey; }
    /**
     * SYMBOLLOT3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbollot3() { return _columnSymbollot3; }
    /**
     * QRData: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQrdata() { return _columnQrdata; }
    /**
     * TREXAMRESULT_ID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrexamresultId() { return _columnTrexamresultId; }
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
     * DATETIME: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDatetime() { return _columnDatetime; }
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
     * CASEBARCODE: {IX, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasebarcode() { return _columnCasebarcode; }
    /**
     * MIXEDFLG: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMixedflg() { return _columnMixedflg; }
    /**
     * SHIPPEDFLG: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippedflg() { return _columnShippedflg; }
    /**
     * CASECREATETYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasecreatetype() { return _columnCasecreatetype; }
    /**
     * CREATEDATETIME: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedatetime() { return _columnCreatedatetime; }
    /**
     * InitNum: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInitnum() { return _columnInitnum; }
    /**
     * ParentCaseCd: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParentcasecd() { return _columnParentcasecd; }
    /**
     * TR_PICKLIST_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrPicklistId() { return _columnTrPicklistId; }
    /**
     * PicklistGNo: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicklistgno() { return _columnPicklistgno; }
    /**
     * RecombDatetime: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecombdatetime() { return _columnRecombdatetime; }
    /**
     * ReprintedFlg: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReprintedflg() { return _columnReprintedflg; }
    /**
     * TraceSts: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTracests() { return _columnTracests; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * BATJPRODUCTIONYM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatjproductionym() { return _columnBatjproductionym; }
    /**
     * COMETODATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCometodate() { return _columnCometodate; }
    /**
     * RCVPALLETNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvpalletno() { return _columnRcvpalletno; }
    /**
     * TAXPALLETNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaxpalletno() { return _columnTaxpalletno; }
    /**
     * SHTYPECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShtypecd() { return _columnShtypecd; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * RESTCTN: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestctn() { return _columnRestctn; }
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
        ls.add(columnTrsymbolId());
        ls.add(columnCasecd());
        ls.add(columnProductCd());
        ls.add(columnItemcd());
        ls.add(columnProductCdCase());
        ls.add(columnProductCdIn());
        ls.add(columnLot3());
        ls.add(columnDesigncdIn());
        ls.add(columnDesigncdCase());
        ls.add(columnLot4());
        ls.add(columnLot1());
        ls.add(columnLot2());
        ls.add(columnSymbollineno());
        ls.add(columnOwnercd());
        ls.add(columnStockTypeCd());
        ls.add(columnForeigncargoflg());
        ls.add(columnCustomsreleaseflg());
        ls.add(columnDamageflg());
        ls.add(columnReceivePlanHId());
        ls.add(columnReceivePlanBId());
        ls.add(columnRcvlineno());
        ls.add(columnSendrcvkey());
        ls.add(columnMakercaseno());
        ls.add(columnSymbolsts());
        ls.add(columnSymboladdflg());
        ls.add(columnPrintedflg());
        ls.add(columnSymbolsnddate());
        ls.add(columnSymbolpastdate());
        ls.add(columnSymbolpalletondate());
        ls.add(columnReceivedate());
        ls.add(columnPalletId());
        ls.add(columnBasePalletId());
        ls.add(columnParentpalletupddate());
        ls.add(columnPrintingdate());
        ls.add(columnLocationId());
        ls.add(columnRestqty());
        ls.add(columnReceivedqty());
        ls.add(columnDistributioncd());
        ls.add(columnTransportcd());
        ls.add(columnOrderno());
        ls.add(columnRcvPalletId());
        ls.add(columnSymbolfactorycd());
        ls.add(columnSymbolitemcd());
        ls.add(columnSymbolsku());
        ls.add(columnSymbolreceivecd());
        ls.add(columnSymbolproductmark());
        ls.add(columnSymbolorderno());
        ls.add(columnSymbolprinterno());
        ls.add(columnSymbolmakeno());
        ls.add(columnSymbollot4());
        ls.add(columnSymbolmaketime());
        ls.add(columnSymbolcirculationid());
        ls.add(columnSymbolrcvkey());
        ls.add(columnSymbollot3());
        ls.add(columnQrdata());
        ls.add(columnTrexamresultId());
        ls.add(columnCaseitfno());
        ls.add(columnCasebarcodevaliant());
        ls.add(columnCaselot4());
        ls.add(columnDatetime());
        ls.add(columnCasecenterno());
        ls.add(columnCasepackno());
        ls.add(columnCasepacktime());
        ls.add(columnCasebarcode());
        ls.add(columnMixedflg());
        ls.add(columnShippedflg());
        ls.add(columnCasecreatetype());
        ls.add(columnCreatedatetime());
        ls.add(columnInitnum());
        ls.add(columnParentcasecd());
        ls.add(columnTrPicklistId());
        ls.add(columnPicklistgno());
        ls.add(columnRecombdatetime());
        ls.add(columnReprintedflg());
        ls.add(columnTracests());
        ls.add(columnClientId());
        ls.add(columnBatjproductionym());
        ls.add(columnCometodate());
        ls.add(columnRcvpalletno());
        ls.add(columnTaxpalletno());
        ls.add(columnShtypecd());
        ls.add(columnCenterId());
        ls.add(columnRestctn());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrsymbolId()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_CENTER_SYMBOL by TRSYMBOL_ID, named 'TCenterSymbolList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTCenterSymbolList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrsymbolId(), TCenterSymbolDbm.getInstance().columnTrsymbolId());
        return cri("T_CENTER_SYMBOL_FK3", "TCenterSymbolList", this, TCenterSymbolDbm.getInstance(), mp, false, "TTrsymbol");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrsymbol"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrsymbolCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrsymbolBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrsymbol> getEntityType() { return TTrsymbol.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrsymbol newEntity() { return new TTrsymbol(); }
    public TTrsymbol newMyEntity() { return new TTrsymbol(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrsymbol)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrsymbol)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

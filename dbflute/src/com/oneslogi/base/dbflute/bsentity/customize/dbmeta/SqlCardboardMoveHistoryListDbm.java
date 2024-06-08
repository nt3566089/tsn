package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlCardboardMoveHistoryList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlCardboardMoveHistoryListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlCardboardMoveHistoryListDbm _instance = new SqlCardboardMoveHistoryListDbm();
    private SqlCardboardMoveHistoryListDbm() {}
    public static SqlCardboardMoveHistoryListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getTrsymbolId(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setTrsymbolId(ctl(vl)), "trsymbolId");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getReceivePlanHId(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getSymbolMakeNo(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setSymbolMakeNo((String)vl), "symbolMakeNo");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getDamageFlgCd(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setDamageFlgCd(ctb(vl)), "damageFlgCd");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getDamageFlg(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setDamageFlg((String)vl), "damageFlg");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getLocationCd(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getLocGroupCd(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setLocGroupCd((String)vl), "locGroupCd");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getLocGroup(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setLocGroup((String)vl), "locGroup");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getDestinationCd(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setDestinationCd((String)vl), "destinationCd");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getDestinationNm(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setDestinationNm((String)vl), "destinationNm");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getReceiveDate(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setReceiveDate((String)vl), "receiveDate");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getShipDate(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setShipDate((String)vl), "shipDate");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getSymbolItemCd(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setSymbolItemCd((String)vl), "symbolItemCd");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getProductNm(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getLot1(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getSymbolLot4(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setSymbolLot4((String)vl), "symbolLot4");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getSymbolLot3Cd(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setSymbolLot3Cd((String)vl), "symbolLot3Cd");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getSymbolLot3(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setSymbolLot3((String)vl), "symbolLot3");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getSymbolPrinterNo(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setSymbolPrinterNo((String)vl), "symbolPrinterNo");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getSymbolProductMark(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setSymbolProductMark((String)vl), "symbolProductMark");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getStockTypeCd(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getOtherlot1(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getCaseItfNo(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setCaseItfNo((String)vl), "caseItfNo");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getCaseBarcodeValiant(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setCaseBarcodeValiant((String)vl), "caseBarcodeValiant");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getCaseLot4(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setCaseLot4((String)vl), "caseLot4");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getCaseCenterNo(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setCaseCenterNo((String)vl), "caseCenterNo");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getCasePackNo(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setCasePackNo((String)vl), "casePackNo");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getCasePackTime(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setCasePackTime((String)vl), "casePackTime");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getFromAddress1(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setFromAddress1((String)vl), "fromAddress1");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getCarrierName(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setCarrierName((String)vl), "carrierName");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getCarrierWbNo(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setCarrierWbNo((String)vl), "carrierWbNo");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getCarrierNo(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setCarrierNo((String)vl), "carrierNo");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getCarrierSName(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setCarrierSName((String)vl), "carrierSName");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getOpenFlgCd(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setOpenFlgCd((String)vl), "openFlgCd");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getOpenFlg(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setOpenFlg((String)vl), "openFlg");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getMakerCaseNo(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setMakerCaseNo((String)vl), "makerCaseNo");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getRestqtyBowl(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setRestqtyBowl(ctb(vl)), "restqtyBowl");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getRestqtyCarton(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setRestqtyCarton(ctb(vl)), "restqtyCarton");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getUnit1(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setUnit1(ctb(vl)), "unit1");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getUnit2(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setUnit2(ctb(vl)), "unit2");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getCenterCd(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getCenterNm(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getClientCd(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlCardboardMoveHistoryList)et).getClientNm(), (et, vl) -> ((SqlCardboardMoveHistoryList)et).setClientNm((String)vl), "clientNm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlCardboardMoveHistoryList";
    protected final String _tableDispName = "SqlCardboardMoveHistoryList";
    protected final String _tablePropertyName = "sqlCardboardMoveHistoryList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlCardboardMoveHistoryList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrsymbolId = cci("TRSYMBOL_ID", "TRSYMBOL_ID", null, null, Long.class, "trsymbolId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolMakeNo = cci("SYMBOL_MAKE_NO", "SYMBOL_MAKE_NO", null, null, String.class, "symbolMakeNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDamageFlgCd = cci("DAMAGE_FLG_CD", "DAMAGE_FLG_CD", null, null, java.math.BigDecimal.class, "damageFlgCd", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDamageFlg = cci("DAMAGE_FLG", "DAMAGE_FLG", null, null, String.class, "damageFlg", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocGroupCd = cci("LOC_GROUP_CD", "LOC_GROUP_CD", null, null, String.class, "locGroupCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocGroup = cci("LOC_GROUP", "LOC_GROUP", null, null, String.class, "locGroup", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationCd = cci("DESTINATION_CD", "DESTINATION_CD", null, null, String.class, "destinationCd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm = cci("DESTINATION_NM", "DESTINATION_NM", null, null, String.class, "destinationNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveDate = cci("RECEIVE_DATE", "RECEIVE_DATE", null, null, String.class, "receiveDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipDate = cci("SHIP_DATE", "SHIP_DATE", null, null, String.class, "shipDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolItemCd = cci("SYMBOL_ITEM_CD", "SYMBOL_ITEM_CD", null, null, String.class, "symbolItemCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolLot4 = cci("SYMBOL_LOT4", "SYMBOL_LOT4", null, null, String.class, "symbolLot4", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolLot3Cd = cci("SYMBOL_LOT3_CD", "SYMBOL_LOT3_CD", null, null, String.class, "symbolLot3Cd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolLot3 = cci("SYMBOL_LOT3", "SYMBOL_LOT3", null, null, String.class, "symbolLot3", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolPrinterNo = cci("SYMBOL_PRINTER_NO", "SYMBOL_PRINTER_NO", null, null, String.class, "symbolPrinterNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolProductMark = cci("SYMBOL_PRODUCT_MARK", "SYMBOL_PRODUCT_MARK", null, null, String.class, "symbolProductMark", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1 = cci("OTHERLOT1", "OTHERLOT1", null, null, String.class, "otherlot1", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseItfNo = cci("CASE_ITF_NO", "CASE_ITF_NO", null, null, String.class, "caseItfNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseBarcodeValiant = cci("CASE_BARCODE_VALIANT", "CASE_BARCODE_VALIANT", null, null, String.class, "caseBarcodeValiant", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseLot4 = cci("CASE_LOT4", "CASE_LOT4", null, null, String.class, "caseLot4", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseCenterNo = cci("CASE_CENTER_NO", "CASE_CENTER_NO", null, null, String.class, "caseCenterNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePackNo = cci("CASE_PACK_NO", "CASE_PACK_NO", null, null, String.class, "casePackNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePackTime = cci("CASE_PACK_TIME", "CASE_PACK_TIME", null, null, String.class, "casePackTime", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromAddress1 = cci("FROM_ADDRESS1", "FROM_ADDRESS1", null, null, String.class, "fromAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierName = cci("CARRIER_NAME", "CARRIER_NAME", null, null, String.class, "carrierName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierWbNo = cci("CARRIER_WB_NO", "CARRIER_WB_NO", null, null, String.class, "carrierWbNo", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNo = cci("CARRIER_NO", "CARRIER_NO", null, null, String.class, "carrierNo", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierSName = cci("CARRIER_S_NAME", "CARRIER_S_NAME", null, null, String.class, "carrierSName", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOpenFlgCd = cci("OPEN_FLG_CD", "OPEN_FLG_CD", null, null, String.class, "openFlgCd", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOpenFlg = cci("OPEN_FLG", "OPEN_FLG", null, null, String.class, "openFlg", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMakerCaseNo = cci("MAKER_CASE_NO", "MAKER_CASE_NO", null, null, String.class, "makerCaseNo", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestqtyBowl = cci("RESTQTY_BOWL", "RESTQTY_BOWL", null, null, java.math.BigDecimal.class, "restqtyBowl", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestqtyCarton = cci("RESTQTY_CARTON", "RESTQTY_CARTON", null, null, java.math.BigDecimal.class, "restqtyCarton", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit1 = cci("UNIT1", "UNIT1", null, null, java.math.BigDecimal.class, "unit1", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit2 = cci("UNIT2", "UNIT2", null, null, java.math.BigDecimal.class, "unit2", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);

    /**
     * TRSYMBOL_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsymbolId() { return _columnTrsymbolId; }
    /**
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
    /**
     * SYMBOL_MAKE_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolMakeNo() { return _columnSymbolMakeNo; }
    /**
     * DAMAGE_FLG_CD: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageFlgCd() { return _columnDamageFlgCd; }
    /**
     * DAMAGE_FLG: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageFlg() { return _columnDamageFlg; }
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * LOC_GROUP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocGroupCd() { return _columnLocGroupCd; }
    /**
     * LOC_GROUP: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocGroup() { return _columnLocGroup; }
    /**
     * DESTINATION_CD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationCd() { return _columnDestinationCd; }
    /**
     * DESTINATION_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationNm() { return _columnDestinationNm; }
    /**
     * RECEIVE_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveDate() { return _columnReceiveDate; }
    /**
     * SHIP_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipDate() { return _columnShipDate; }
    /**
     * SYMBOL_ITEM_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolItemCd() { return _columnSymbolItemCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * LOT1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * SYMBOL_LOT4: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolLot4() { return _columnSymbolLot4; }
    /**
     * SYMBOL_LOT3_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolLot3Cd() { return _columnSymbolLot3Cd; }
    /**
     * SYMBOL_LOT3: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolLot3() { return _columnSymbolLot3; }
    /**
     * SYMBOL_PRINTER_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolPrinterNo() { return _columnSymbolPrinterNo; }
    /**
     * SYMBOL_PRODUCT_MARK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolProductMark() { return _columnSymbolProductMark; }
    /**
     * STOCK_TYPE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * OTHERLOT1: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot1() { return _columnOtherlot1; }
    /**
     * CASE_ITF_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseItfNo() { return _columnCaseItfNo; }
    /**
     * CASE_BARCODE_VALIANT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseBarcodeValiant() { return _columnCaseBarcodeValiant; }
    /**
     * CASE_LOT4: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseLot4() { return _columnCaseLot4; }
    /**
     * CASE_CENTER_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseCenterNo() { return _columnCaseCenterNo; }
    /**
     * CASE_PACK_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasePackNo() { return _columnCasePackNo; }
    /**
     * CASE_PACK_TIME: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasePackTime() { return _columnCasePackTime; }
    /**
     * FROM_ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromAddress1() { return _columnFromAddress1; }
    /**
     * CARRIER_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierName() { return _columnCarrierName; }
    /**
     * CARRIER_WB_NO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierWbNo() { return _columnCarrierWbNo; }
    /**
     * CARRIER_NO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNo() { return _columnCarrierNo; }
    /**
     * CARRIER_S_NAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierSName() { return _columnCarrierSName; }
    /**
     * OPEN_FLG_CD: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOpenFlgCd() { return _columnOpenFlgCd; }
    /**
     * OPEN_FLG: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOpenFlg() { return _columnOpenFlg; }
    /**
     * MAKER_CASE_NO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMakerCaseNo() { return _columnMakerCaseNo; }
    /**
     * RESTQTY_BOWL: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestqtyBowl() { return _columnRestqtyBowl; }
    /**
     * RESTQTY_CARTON: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestqtyCarton() { return _columnRestqtyCarton; }
    /**
     * UNIT1: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit1() { return _columnUnit1; }
    /**
     * UNIT2: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit2() { return _columnUnit2; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTrsymbolId());
        ls.add(columnReceivePlanHId());
        ls.add(columnSymbolMakeNo());
        ls.add(columnDamageFlgCd());
        ls.add(columnDamageFlg());
        ls.add(columnLocationCd());
        ls.add(columnLocGroupCd());
        ls.add(columnLocGroup());
        ls.add(columnDestinationCd());
        ls.add(columnDestinationNm());
        ls.add(columnReceiveDate());
        ls.add(columnShipDate());
        ls.add(columnSymbolItemCd());
        ls.add(columnProductNm());
        ls.add(columnLot1());
        ls.add(columnSymbolLot4());
        ls.add(columnSymbolLot3Cd());
        ls.add(columnSymbolLot3());
        ls.add(columnSymbolPrinterNo());
        ls.add(columnSymbolProductMark());
        ls.add(columnStockTypeCd());
        ls.add(columnOtherlot1());
        ls.add(columnCaseItfNo());
        ls.add(columnCaseBarcodeValiant());
        ls.add(columnCaseLot4());
        ls.add(columnCaseCenterNo());
        ls.add(columnCasePackNo());
        ls.add(columnCasePackTime());
        ls.add(columnFromAddress1());
        ls.add(columnCarrierName());
        ls.add(columnCarrierWbNo());
        ls.add(columnCarrierNo());
        ls.add(columnCarrierSName());
        ls.add(columnOpenFlgCd());
        ls.add(columnOpenFlg());
        ls.add(columnMakerCaseNo());
        ls.add(columnRestqtyBowl());
        ls.add(columnRestqtyCarton());
        ls.add(columnUnit1());
        ls.add(columnUnit2());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlCardboardMoveHistoryList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlCardboardMoveHistoryList> getEntityType() { return SqlCardboardMoveHistoryList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlCardboardMoveHistoryList newEntity() { return new SqlCardboardMoveHistoryList(); }
    public SqlCardboardMoveHistoryList newMyEntity() { return new SqlCardboardMoveHistoryList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlCardboardMoveHistoryList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlCardboardMoveHistoryList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

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
 * The DB meta of T_TRRCVEXTEND. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrrcvextendDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrrcvextendDbm _instance = new TTrrcvextendDbm();
    private TTrrcvextendDbm() {}
    public static TTrrcvextendDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getReceivePlanHId(), (et, vl) -> ((TTrrcvextend)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getSbwarehousecd(), (et, vl) -> ((TTrrcvextend)et).setSbwarehousecd((String)vl), "sbwarehousecd");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getIino(), (et, vl) -> ((TTrrcvextend)et).setIino((String)vl), "iino");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getRcvschdate(), (et, vl) -> ((TTrrcvextend)et).setRcvschdate((String)vl), "rcvschdate");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getCarrierno(), (et, vl) -> ((TTrrcvextend)et).setCarrierno((String)vl), "carrierno");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getWarehousecd(), (et, vl) -> ((TTrrcvextend)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getOtherrefno1(), (et, vl) -> ((TTrrcvextend)et).setOtherrefno1((String)vl), "otherrefno1");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getProductCd(), (et, vl) -> ((TTrrcvextend)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getLot3(), (et, vl) -> ((TTrrcvextend)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getLot4(), (et, vl) -> ((TTrrcvextend)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getLot1(), (et, vl) -> ((TTrrcvextend)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getLot2(), (et, vl) -> ((TTrrcvextend)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getExpectqty1(), (et, vl) -> ((TTrrcvextend)et).setExpectqty1(ctb(vl)), "expectqty1");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getFromfax(), (et, vl) -> ((TTrrcvextend)et).setFromfax((String)vl), "fromfax");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getCarriersname(), (et, vl) -> ((TTrrcvextend)et).setCarriersname((String)vl), "carriersname");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getCarrierwbno(), (et, vl) -> ((TTrrcvextend)et).setCarrierwbno((String)vl), "carrierwbno");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getForeigncargoflg(), (et, vl) -> ((TTrrcvextend)et).setForeigncargoflg(ctb(vl)), "foreigncargoflg");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getFromrefname(), (et, vl) -> ((TTrrcvextend)et).setFromrefname((String)vl), "fromrefname");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getCarriername(), (et, vl) -> ((TTrrcvextend)et).setCarriername((String)vl), "carriername");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getCustorderno(), (et, vl) -> ((TTrrcvextend)et).setCustorderno((String)vl), "custorderno");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getArrivalportdate(), (et, vl) -> ((TTrrcvextend)et).setArrivalportdate((String)vl), "arrivalportdate");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getShipname(), (et, vl) -> ((TTrrcvextend)et).setShipname((String)vl), "shipname");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getBatdelino(), (et, vl) -> ((TTrrcvextend)et).setBatdelino((String)vl), "batdelino");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getBatdelidetailno(), (et, vl) -> ((TTrrcvextend)et).setBatdelidetailno(ctl(vl)), "batdelidetailno");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getBatwarehousecd(), (et, vl) -> ((TTrrcvextend)et).setBatwarehousecd((String)vl), "batwarehousecd");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getBatkeepwarehousecd(), (et, vl) -> ((TTrrcvextend)et).setBatkeepwarehousecd((String)vl), "batkeepwarehousecd");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getBatpartnernorcv(), (et, vl) -> ((TTrrcvextend)et).setBatpartnernorcv((String)vl), "batpartnernorcv");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getBatpartnernosnd(), (et, vl) -> ((TTrrcvextend)et).setBatpartnernosnd((String)vl), "batpartnernosnd");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getBatdelidetailnum(), (et, vl) -> ((TTrrcvextend)et).setBatdelidetailnum(ctl(vl)), "batdelidetailnum");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getBatno(), (et, vl) -> ((TTrrcvextend)et).setBatno(ctb(vl)), "batno");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getVaExtdata1(), (et, vl) -> ((TTrrcvextend)et).setVaExtdata1((String)vl), "vaExtdata1");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getVaExtdata2(), (et, vl) -> ((TTrrcvextend)et).setVaExtdata2((String)vl), "vaExtdata2");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getVaExtdata3(), (et, vl) -> ((TTrrcvextend)et).setVaExtdata3((String)vl), "vaExtdata3");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getNvExtdata1(), (et, vl) -> ((TTrrcvextend)et).setNvExtdata1((String)vl), "nvExtdata1");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getNvExtdata2(), (et, vl) -> ((TTrrcvextend)et).setNvExtdata2((String)vl), "nvExtdata2");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getNvExtdata3(), (et, vl) -> ((TTrrcvextend)et).setNvExtdata3((String)vl), "nvExtdata3");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getNmExtdata1(), (et, vl) -> ((TTrrcvextend)et).setNmExtdata1(ctl(vl)), "nmExtdata1");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getNmExtdata2(), (et, vl) -> ((TTrrcvextend)et).setNmExtdata2(ctl(vl)), "nmExtdata2");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getNmExtdata3(), (et, vl) -> ((TTrrcvextend)et).setNmExtdata3(ctl(vl)), "nmExtdata3");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getDtExtdata1(), (et, vl) -> ((TTrrcvextend)et).setDtExtdata1((String)vl), "dtExtdata1");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getDtExtdata2(), (et, vl) -> ((TTrrcvextend)et).setDtExtdata2((String)vl), "dtExtdata2");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getDtExtdata3(), (et, vl) -> ((TTrrcvextend)et).setDtExtdata3((String)vl), "dtExtdata3");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getDelFlg(), (et, vl) -> ((TTrrcvextend)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getVersionNo(), (et, vl) -> ((TTrrcvextend)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getControlNo(), (et, vl) -> ((TTrrcvextend)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getAddDt(), (et, vl) -> ((TTrrcvextend)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getAddUser(), (et, vl) -> ((TTrrcvextend)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getAddProcess(), (et, vl) -> ((TTrrcvextend)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getUpdDt(), (et, vl) -> ((TTrrcvextend)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getUpdUser(), (et, vl) -> ((TTrrcvextend)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrrcvextend)et).getUpdProcess(), (et, vl) -> ((TTrrcvextend)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrrcvextend)et).getTTrrcv(), (et, vl) -> ((TTrrcvextend)et).setTTrrcv((TTrrcv)vl), "TTrrcv");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRRCVEXTEND";
    protected final String _tableDispName = "T_TRRCVEXTEND";
    protected final String _tablePropertyName = "TTrrcvextend";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRRCVEXTEND", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, true, false, true, "bigint", 19, 0, null, null, false, null, null, "TTrrcv", null, null, false);
    protected final ColumnInfo _columnSbwarehousecd = cci("SBWAREHOUSECD", "SBWAREHOUSECD", null, null, String.class, "sbwarehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIino = cci("IINO", "IINO", null, null, String.class, "iino", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvschdate = cci("RCVSCHDATE", "RCVSCHDATE", null, null, String.class, "rcvschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierno = cci("CARRIERNO", "CARRIERNO", null, null, String.class, "carrierno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1 = cci("OTHERREFNO1", "OTHERREFNO1", null, null, String.class, "otherrefno1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty1 = cci("EXPECTQTY1", "EXPECTQTY1", null, null, java.math.BigDecimal.class, "expectqty1", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromfax = cci("FROMFAX", "FROMFAX", null, null, String.class, "fromfax", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriersname = cci("CARRIERSNAME", "CARRIERSNAME", null, null, String.class, "carriersname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierwbno = cci("CARRIERWBNO", "CARRIERWBNO", null, null, String.class, "carrierwbno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeigncargoflg = cci("FOREIGNCARGOFLG", "FOREIGNCARGOFLG", null, null, java.math.BigDecimal.class, "foreigncargoflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromrefname = cci("FROMREFNAME", "FROMREFNAME", null, null, String.class, "fromrefname", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriername = cci("CARRIERNAME", "CARRIERNAME", null, null, String.class, "carriername", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustorderno = cci("CUSTORDERNO", "CUSTORDERNO", null, null, String.class, "custorderno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArrivalportdate = cci("ARRIVALPORTDATE", "ARRIVALPORTDATE", null, null, String.class, "arrivalportdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipname = cci("SHIPNAME", "SHIPNAME", null, null, String.class, "shipname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatdelino = cci("BATDELINO", "BATDELINO", null, null, String.class, "batdelino", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatdelidetailno = cci("BATDELIDETAILNO", "BATDELIDETAILNO", null, null, Long.class, "batdelidetailno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatwarehousecd = cci("BATWAREHOUSECD", "BATWAREHOUSECD", null, null, String.class, "batwarehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatkeepwarehousecd = cci("BATKEEPWAREHOUSECD", "BATKEEPWAREHOUSECD", null, null, String.class, "batkeepwarehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatpartnernorcv = cci("BATPARTNERNORCV", "BATPARTNERNORCV", null, null, String.class, "batpartnernorcv", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatpartnernosnd = cci("BATPARTNERNOSND", "BATPARTNERNOSND", null, null, String.class, "batpartnernosnd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatdelidetailnum = cci("BATDELIDETAILNUM", "BATDELIDETAILNUM", null, null, Long.class, "batdelidetailnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatno = cci("BATNO", "BATNO", null, null, java.math.BigDecimal.class, "batno", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata1 = cci("VA_EXTDATA1", "VA_EXTDATA1", null, null, String.class, "vaExtdata1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata2 = cci("VA_EXTDATA2", "VA_EXTDATA2", null, null, String.class, "vaExtdata2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata3 = cci("VA_EXTDATA3", "VA_EXTDATA3", null, null, String.class, "vaExtdata3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata1 = cci("NV_EXTDATA1", "NV_EXTDATA1", null, null, String.class, "nvExtdata1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata2 = cci("NV_EXTDATA2", "NV_EXTDATA2", null, null, String.class, "nvExtdata2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata3 = cci("NV_EXTDATA3", "NV_EXTDATA3", null, null, String.class, "nvExtdata3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata1 = cci("NM_EXTDATA1", "NM_EXTDATA1", null, null, Long.class, "nmExtdata1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata2 = cci("NM_EXTDATA2", "NM_EXTDATA2", null, null, Long.class, "nmExtdata2", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata3 = cci("NM_EXTDATA3", "NM_EXTDATA3", null, null, Long.class, "nmExtdata3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata1 = cci("DT_EXTDATA1", "DT_EXTDATA1", null, null, String.class, "dtExtdata1", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata2 = cci("DT_EXTDATA2", "DT_EXTDATA2", null, null, String.class, "dtExtdata2", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata3 = cci("DT_EXTDATA3", "DT_EXTDATA3", null, null, String.class, "dtExtdata3", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * RECEIVE_PLAN_H_ID: {PK, NotNull, bigint(19), FK to T_TRRCV}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
    /**
     * SBWAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSbwarehousecd() { return _columnSbwarehousecd; }
    /**
     * IINO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIino() { return _columnIino; }
    /**
     * RCVSCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvschdate() { return _columnRcvschdate; }
    /**
     * CARRIERNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierno() { return _columnCarrierno; }
    /**
     * WAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * OTHERREFNO1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno1() { return _columnOtherrefno1; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
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
     * EXPECTQTY1: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty1() { return _columnExpectqty1; }
    /**
     * FROMFAX: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromfax() { return _columnFromfax; }
    /**
     * CARRIERSNAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriersname() { return _columnCarriersname; }
    /**
     * CARRIERWBNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierwbno() { return _columnCarrierwbno; }
    /**
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeigncargoflg() { return _columnForeigncargoflg; }
    /**
     * FROMREFNAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromrefname() { return _columnFromrefname; }
    /**
     * CARRIERNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriername() { return _columnCarriername; }
    /**
     * CUSTORDERNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustorderno() { return _columnCustorderno; }
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
     * BATDELINO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatdelino() { return _columnBatdelino; }
    /**
     * BATDELIDETAILNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatdelidetailno() { return _columnBatdelidetailno; }
    /**
     * BATWAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatwarehousecd() { return _columnBatwarehousecd; }
    /**
     * BATKEEPWAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatkeepwarehousecd() { return _columnBatkeepwarehousecd; }
    /**
     * BATPARTNERNORCV: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatpartnernorcv() { return _columnBatpartnernorcv; }
    /**
     * BATPARTNERNOSND: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatpartnernosnd() { return _columnBatpartnernosnd; }
    /**
     * BATDELIDETAILNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatdelidetailnum() { return _columnBatdelidetailnum; }
    /**
     * BATNO: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatno() { return _columnBatno; }
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
     * NV_EXTDATA1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata1() { return _columnNvExtdata1; }
    /**
     * NV_EXTDATA2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata2() { return _columnNvExtdata2; }
    /**
     * NV_EXTDATA3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata3() { return _columnNvExtdata3; }
    /**
     * NM_EXTDATA1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata1() { return _columnNmExtdata1; }
    /**
     * NM_EXTDATA2: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata2() { return _columnNmExtdata2; }
    /**
     * NM_EXTDATA3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata3() { return _columnNmExtdata3; }
    /**
     * DT_EXTDATA1: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata1() { return _columnDtExtdata1; }
    /**
     * DT_EXTDATA2: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata2() { return _columnDtExtdata2; }
    /**
     * DT_EXTDATA3: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata3() { return _columnDtExtdata3; }
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
        ls.add(columnReceivePlanHId());
        ls.add(columnSbwarehousecd());
        ls.add(columnIino());
        ls.add(columnRcvschdate());
        ls.add(columnCarrierno());
        ls.add(columnWarehousecd());
        ls.add(columnOtherrefno1());
        ls.add(columnProductCd());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnLot1());
        ls.add(columnLot2());
        ls.add(columnExpectqty1());
        ls.add(columnFromfax());
        ls.add(columnCarriersname());
        ls.add(columnCarrierwbno());
        ls.add(columnForeigncargoflg());
        ls.add(columnFromrefname());
        ls.add(columnCarriername());
        ls.add(columnCustorderno());
        ls.add(columnArrivalportdate());
        ls.add(columnShipname());
        ls.add(columnBatdelino());
        ls.add(columnBatdelidetailno());
        ls.add(columnBatwarehousecd());
        ls.add(columnBatkeepwarehousecd());
        ls.add(columnBatpartnernorcv());
        ls.add(columnBatpartnernosnd());
        ls.add(columnBatdelidetailnum());
        ls.add(columnBatno());
        ls.add(columnVaExtdata1());
        ls.add(columnVaExtdata2());
        ls.add(columnVaExtdata3());
        ls.add(columnNvExtdata1());
        ls.add(columnNvExtdata2());
        ls.add(columnNvExtdata3());
        ls.add(columnNmExtdata1());
        ls.add(columnNmExtdata2());
        ls.add(columnNmExtdata3());
        ls.add(columnDtExtdata1());
        ls.add(columnDtExtdata2());
        ls.add(columnDtExtdata3());
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
    protected UniqueInfo cpui() { return hpcpui(columnReceivePlanHId()); }
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
     * T_TRRCV by my RECEIVE_PLAN_H_ID, named 'TTrrcv'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTTrrcv() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanHId(), TTrrcvDbm.getInstance().columnReceivePlanHId());
        return cfi("T_TRRCVEXTEND_FK1", "TTrrcv", this, TTrrcvDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "TTrrcvextendAsOne", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrrcvextend"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrrcvextendCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrrcvextendBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrrcvextend> getEntityType() { return TTrrcvextend.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrrcvextend newEntity() { return new TTrrcvextend(); }
    public TTrrcvextend newMyEntity() { return new TTrrcvextend(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrrcvextend)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrrcvextend)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

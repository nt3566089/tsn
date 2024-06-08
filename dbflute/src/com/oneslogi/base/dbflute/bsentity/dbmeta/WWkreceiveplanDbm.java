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
 * The DB meta of W_WKRECEIVEPLAN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WWkreceiveplanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WWkreceiveplanDbm _instance = new WWkreceiveplanDbm();
    private WWkreceiveplanDbm() {}
    public static WWkreceiveplanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getWWkreceiveplanId(), (et, vl) -> ((WWkreceiveplan)et).setWWkreceiveplanId(ctl(vl)), "WWkreceiveplanId");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getPrintkey(), (et, vl) -> ((WWkreceiveplan)et).setPrintkey(ctb(vl)), "printkey");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getLineNo(), (et, vl) -> ((WWkreceiveplan)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getReceivePlanHId(), (et, vl) -> ((WWkreceiveplan)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getRcvlineno(), (et, vl) -> ((WWkreceiveplan)et).setRcvlineno(ctb(vl)), "rcvlineno");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getWarehousecd(), (et, vl) -> ((WWkreceiveplan)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getWarehouseSname(), (et, vl) -> ((WWkreceiveplan)et).setWarehouseSname((String)vl), "warehouseSname");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getSlotlocname(), (et, vl) -> ((WWkreceiveplan)et).setSlotlocname((String)vl), "slotlocname");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getRcvschdate(), (et, vl) -> ((WWkreceiveplan)et).setRcvschdate((String)vl), "rcvschdate");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getReceiveLot4(), (et, vl) -> ((WWkreceiveplan)et).setReceiveLot4((String)vl), "receiveLot4");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getReceiveLot3(), (et, vl) -> ((WWkreceiveplan)et).setReceiveLot3((String)vl), "receiveLot3");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getLocationCd(), (et, vl) -> ((WWkreceiveplan)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getCaseqtyCapacity(), (et, vl) -> ((WWkreceiveplan)et).setCaseqtyCapacity(ctl(vl)), "caseqtyCapacity");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getFloor(), (et, vl) -> ((WWkreceiveplan)et).setFloor((String)vl), "floor");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getFromfax(), (et, vl) -> ((WWkreceiveplan)et).setFromfax((String)vl), "fromfax");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getFromphone(), (et, vl) -> ((WWkreceiveplan)et).setFromphone((String)vl), "fromphone");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getSupplierrcvno(), (et, vl) -> ((WWkreceiveplan)et).setSupplierrcvno((String)vl), "supplierrcvno");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getProductCd(), (et, vl) -> ((WWkreceiveplan)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getItemname(), (et, vl) -> ((WWkreceiveplan)et).setItemname((String)vl), "itemname");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getZone(), (et, vl) -> ((WWkreceiveplan)et).setZone((String)vl), "zone");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getExpectqty(), (et, vl) -> ((WWkreceiveplan)et).setExpectqty(ctb(vl)), "expectqty");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getRcvpal(), (et, vl) -> ((WWkreceiveplan)et).setRcvpal(ctb(vl)), "rcvpal");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getRcvcase(), (et, vl) -> ((WWkreceiveplan)et).setRcvcase(ctb(vl)), "rcvcase");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getLot1(), (et, vl) -> ((WWkreceiveplan)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getLot4(), (et, vl) -> ((WWkreceiveplan)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getLot3(), (et, vl) -> ((WWkreceiveplan)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getQtycase(), (et, vl) -> ((WWkreceiveplan)et).setQtycase(ctb(vl)), "qtycase");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getQtybowl(), (et, vl) -> ((WWkreceiveplan)et).setQtybowl(ctb(vl)), "qtybowl");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getQtypal(), (et, vl) -> ((WWkreceiveplan)et).setQtypal(ctb(vl)), "qtypal");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getInoutkbn(), (et, vl) -> ((WWkreceiveplan)et).setInoutkbn((String)vl), "inoutkbn");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getItemOrderby(), (et, vl) -> ((WWkreceiveplan)et).setItemOrderby(ctl(vl)), "itemOrderby");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getPrintpageno(), (et, vl) -> ((WWkreceiveplan)et).setPrintpageno(ctl(vl)), "printpageno");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getSeqsortkey(), (et, vl) -> ((WWkreceiveplan)et).setSeqsortkey(ctb(vl)), "seqsortkey");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getDelFlg(), (et, vl) -> ((WWkreceiveplan)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getVersionNo(), (et, vl) -> ((WWkreceiveplan)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getControlNo(), (et, vl) -> ((WWkreceiveplan)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getAddDt(), (et, vl) -> ((WWkreceiveplan)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getAddUser(), (et, vl) -> ((WWkreceiveplan)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getAddProcess(), (et, vl) -> ((WWkreceiveplan)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getUpdDt(), (et, vl) -> ((WWkreceiveplan)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getUpdUser(), (et, vl) -> ((WWkreceiveplan)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WWkreceiveplan)et).getUpdProcess(), (et, vl) -> ((WWkreceiveplan)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_WKRECEIVEPLAN";
    protected final String _tableDispName = "W_WKRECEIVEPLAN";
    protected final String _tablePropertyName = "WWkreceiveplan";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_WKRECEIVEPLAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWWkreceiveplanId = cci("W_WKRECEIVEPLAN_ID", "W_WKRECEIVEPLAN_ID", null, null, Long.class, "WWkreceiveplanId", null, true, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintkey = cci("PRINTKEY", "PRINTKEY", null, null, java.math.BigDecimal.class, "printkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvlineno = cci("RCVLINENO", "RCVLINENO", null, null, java.math.BigDecimal.class, "rcvlineno", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseSname = cci("WAREHOUSE_SNAME", "WAREHOUSE_SNAME", null, null, String.class, "warehouseSname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlotlocname = cci("SLOTLOCNAME", "SLOTLOCNAME", null, null, String.class, "slotlocname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvschdate = cci("RCVSCHDATE", "RCVSCHDATE", null, null, String.class, "rcvschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveLot4 = cci("RECEIVE_LOT4", "RECEIVE_LOT4", null, null, String.class, "receiveLot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveLot3 = cci("RECEIVE_LOT3", "RECEIVE_LOT3", null, null, String.class, "receiveLot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseqtyCapacity = cci("CASEQTY_CAPACITY", "CASEQTY_CAPACITY", null, null, Long.class, "caseqtyCapacity", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFloor = cci("FLOOR", "FLOOR", null, null, String.class, "floor", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromfax = cci("FROMFAX", "FROMFAX", null, null, String.class, "fromfax", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromphone = cci("FROMPHONE", "FROMPHONE", null, null, String.class, "fromphone", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrcvno = cci("SUPPLIERRCVNO", "SUPPLIERRCVNO", null, null, String.class, "supplierrcvno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemname = cci("ITEMNAME", "ITEMNAME", null, null, String.class, "itemname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZone = cci("ZONE", "ZONE", null, null, String.class, "zone", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty = cci("EXPECTQTY", "EXPECTQTY", null, null, java.math.BigDecimal.class, "expectqty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvpal = cci("RCVPAL", "RCVPAL", null, null, java.math.BigDecimal.class, "rcvpal", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvcase = cci("RCVCASE", "RCVCASE", null, null, java.math.BigDecimal.class, "rcvcase", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtycase = cci("QTYCASE", "QTYCASE", null, null, java.math.BigDecimal.class, "qtycase", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtybowl = cci("QTYBOWL", "QTYBOWL", null, null, java.math.BigDecimal.class, "qtybowl", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtypal = cci("QTYPAL", "QTYPAL", null, null, java.math.BigDecimal.class, "qtypal", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutkbn = cci("INOUTKBN", "INOUTKBN", null, null, String.class, "inoutkbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemOrderby = cci("ITEM_ORDERBY", "ITEM_ORDERBY", null, null, Long.class, "itemOrderby", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintpageno = cci("PRINTPAGENO", "PRINTPAGENO", null, null, Long.class, "printpageno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeqsortkey = cci("SEQSORTKEY", "SEQSORTKEY", null, null, java.math.BigDecimal.class, "seqsortkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWWkreceiveplanId() { return _columnWWkreceiveplanId; }
    /**
     * PRINTKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintkey() { return _columnPrintkey; }
    /**
     * LINE_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
    /**
     * RCVLINENO: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvlineno() { return _columnRcvlineno; }
    /**
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * WAREHOUSE_SNAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseSname() { return _columnWarehouseSname; }
    /**
     * SLOTLOCNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlotlocname() { return _columnSlotlocname; }
    /**
     * RCVSCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvschdate() { return _columnRcvschdate; }
    /**
     * RECEIVE_LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveLot4() { return _columnReceiveLot4; }
    /**
     * RECEIVE_LOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveLot3() { return _columnReceiveLot3; }
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * CASEQTY_CAPACITY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseqtyCapacity() { return _columnCaseqtyCapacity; }
    /**
     * FLOOR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFloor() { return _columnFloor; }
    /**
     * FROMFAX: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromfax() { return _columnFromfax; }
    /**
     * FROMPHONE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromphone() { return _columnFromphone; }
    /**
     * SUPPLIERRCVNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierrcvno() { return _columnSupplierrcvno; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * ITEMNAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemname() { return _columnItemname; }
    /**
     * ZONE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZone() { return _columnZone; }
    /**
     * EXPECTQTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty() { return _columnExpectqty; }
    /**
     * RCVPAL: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvpal() { return _columnRcvpal; }
    /**
     * RCVCASE: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvcase() { return _columnRcvcase; }
    /**
     * LOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * LOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * QTYCASE: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtycase() { return _columnQtycase; }
    /**
     * QTYBOWL: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtybowl() { return _columnQtybowl; }
    /**
     * QTYPAL: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtypal() { return _columnQtypal; }
    /**
     * INOUTKBN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInoutkbn() { return _columnInoutkbn; }
    /**
     * ITEM_ORDERBY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemOrderby() { return _columnItemOrderby; }
    /**
     * PRINTPAGENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintpageno() { return _columnPrintpageno; }
    /**
     * SEQSORTKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeqsortkey() { return _columnSeqsortkey; }
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
        ls.add(columnWWkreceiveplanId());
        ls.add(columnPrintkey());
        ls.add(columnLineNo());
        ls.add(columnReceivePlanHId());
        ls.add(columnRcvlineno());
        ls.add(columnWarehousecd());
        ls.add(columnWarehouseSname());
        ls.add(columnSlotlocname());
        ls.add(columnRcvschdate());
        ls.add(columnReceiveLot4());
        ls.add(columnReceiveLot3());
        ls.add(columnLocationCd());
        ls.add(columnCaseqtyCapacity());
        ls.add(columnFloor());
        ls.add(columnFromfax());
        ls.add(columnFromphone());
        ls.add(columnSupplierrcvno());
        ls.add(columnProductCd());
        ls.add(columnItemname());
        ls.add(columnZone());
        ls.add(columnExpectqty());
        ls.add(columnRcvpal());
        ls.add(columnRcvcase());
        ls.add(columnLot1());
        ls.add(columnLot4());
        ls.add(columnLot3());
        ls.add(columnQtycase());
        ls.add(columnQtybowl());
        ls.add(columnQtypal());
        ls.add(columnInoutkbn());
        ls.add(columnItemOrderby());
        ls.add(columnPrintpageno());
        ls.add(columnSeqsortkey());
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
    protected UniqueInfo cpui() { return hpcpui(columnWWkreceiveplanId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WWkreceiveplan"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WWkreceiveplanCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WWkreceiveplanBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WWkreceiveplan> getEntityType() { return WWkreceiveplan.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WWkreceiveplan newEntity() { return new WWkreceiveplan(); }
    public WWkreceiveplan newMyEntity() { return new WWkreceiveplan(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WWkreceiveplan)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WWkreceiveplan)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

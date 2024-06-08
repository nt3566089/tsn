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
 * The DB meta of T_TRDIRECTREST. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrdirectrestDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrdirectrestDbm _instance = new TTrdirectrestDbm();
    private TTrdirectrestDbm() {}
    public static TTrdirectrestDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getWarehousecd(), (et, vl) -> ((TTrdirectrest)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getStockdate(), (et, vl) -> ((TTrdirectrest)et).setStockdate((String)vl), "stockdate");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getRecno(), (et, vl) -> ((TTrdirectrest)et).setRecno(ctb(vl)), "recno");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getSotedunit(), (et, vl) -> ((TTrdirectrest)et).setSotedunit((String)vl), "sotedunit");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getZone(), (et, vl) -> ((TTrdirectrest)et).setZone((String)vl), "zone");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getAssortedorder(), (et, vl) -> ((TTrdirectrest)et).setAssortedorder(ctl(vl)), "assortedorder");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getSotedloc(), (et, vl) -> ((TTrdirectrest)et).setSotedloc((String)vl), "sotedloc");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getProductCd(), (et, vl) -> ((TTrdirectrest)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getDeliverydate(), (et, vl) -> ((TTrdirectrest)et).setDeliverydate((String)vl), "deliverydate");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getDpwarehousecd(), (et, vl) -> ((TTrdirectrest)et).setDpwarehousecd((String)vl), "dpwarehousecd");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getDirectioncd(), (et, vl) -> ((TTrdirectrest)et).setDirectioncd((String)vl), "directioncd");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getPistontype(), (et, vl) -> ((TTrdirectrest)et).setPistontype((String)vl), "pistontype");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getComt(), (et, vl) -> ((TTrdirectrest)et).setComt((String)vl), "comt");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getSroprtcnt(), (et, vl) -> ((TTrdirectrest)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getCsroprtcnt(), (et, vl) -> ((TTrdirectrest)et).setCsroprtcnt(ctl(vl)), "csroprtcnt");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getCuttopdirassord(), (et, vl) -> ((TTrdirectrest)et).setCuttopdirassord(ctl(vl)), "cuttopdirassord");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getStockcasesu(), (et, vl) -> ((TTrdirectrest)et).setStockcasesu(ctl(vl)), "stockcasesu");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getStockcartonsu(), (et, vl) -> ((TTrdirectrest)et).setStockcartonsu(ctl(vl)), "stockcartonsu");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getSellshopcnt(), (et, vl) -> ((TTrdirectrest)et).setSellshopcnt(ctl(vl)), "sellshopcnt");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getLinecd(), (et, vl) -> ((TTrdirectrest)et).setLinecd((String)vl), "linecd");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getVaExtdata1(), (et, vl) -> ((TTrdirectrest)et).setVaExtdata1((String)vl), "vaExtdata1");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getVaExtdata2(), (et, vl) -> ((TTrdirectrest)et).setVaExtdata2((String)vl), "vaExtdata2");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getVaExtdata3(), (et, vl) -> ((TTrdirectrest)et).setVaExtdata3((String)vl), "vaExtdata3");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getNvExtdata1(), (et, vl) -> ((TTrdirectrest)et).setNvExtdata1((String)vl), "nvExtdata1");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getNvExtdata2(), (et, vl) -> ((TTrdirectrest)et).setNvExtdata2((String)vl), "nvExtdata2");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getNvExtdata3(), (et, vl) -> ((TTrdirectrest)et).setNvExtdata3((String)vl), "nvExtdata3");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getNmExtdata1(), (et, vl) -> ((TTrdirectrest)et).setNmExtdata1(ctl(vl)), "nmExtdata1");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getNmExtdata2(), (et, vl) -> ((TTrdirectrest)et).setNmExtdata2(ctl(vl)), "nmExtdata2");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getNmExtdata3(), (et, vl) -> ((TTrdirectrest)et).setNmExtdata3(ctl(vl)), "nmExtdata3");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getDtExtdata1(), (et, vl) -> ((TTrdirectrest)et).setDtExtdata1((String)vl), "dtExtdata1");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getDtExtdata2(), (et, vl) -> ((TTrdirectrest)et).setDtExtdata2((String)vl), "dtExtdata2");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getDtExtdata3(), (et, vl) -> ((TTrdirectrest)et).setDtExtdata3((String)vl), "dtExtdata3");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getDelFlg(), (et, vl) -> ((TTrdirectrest)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getVersionNo(), (et, vl) -> ((TTrdirectrest)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getControlNo(), (et, vl) -> ((TTrdirectrest)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getAddDt(), (et, vl) -> ((TTrdirectrest)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getAddUser(), (et, vl) -> ((TTrdirectrest)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getAddProcess(), (et, vl) -> ((TTrdirectrest)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getUpdDt(), (et, vl) -> ((TTrdirectrest)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getUpdUser(), (et, vl) -> ((TTrdirectrest)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrdirectrest)et).getUpdProcess(), (et, vl) -> ((TTrdirectrest)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRDIRECTREST";
    protected final String _tableDispName = "T_TRDIRECTREST";
    protected final String _tablePropertyName = "TTrdirectrest";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRDIRECTREST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, true, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockdate = cci("STOCKDATE", "STOCKDATE", null, null, String.class, "stockdate", null, true, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRecno = cci("RECNO", "RECNO", null, null, java.math.BigDecimal.class, "recno", null, true, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSotedunit = cci("SOTEDUNIT", "SOTEDUNIT", null, null, String.class, "sotedunit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZone = cci("ZONE", "ZONE", null, null, String.class, "zone", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortedorder = cci("ASSORTEDORDER", "ASSORTEDORDER", null, null, Long.class, "assortedorder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSotedloc = cci("SOTEDLOC", "SOTEDLOC", null, null, String.class, "sotedloc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliverydate = cci("DELIVERYDATE", "DELIVERYDATE", null, null, String.class, "deliverydate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpwarehousecd = cci("DPWAREHOUSECD", "DPWAREHOUSECD", null, null, String.class, "dpwarehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectioncd = cci("DIRECTIONCD", "DIRECTIONCD", null, null, String.class, "directioncd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPistontype = cci("PISTONTYPE", "PISTONTYPE", null, null, String.class, "pistontype", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnComt = cci("COMT", "COMT", null, null, String.class, "comt", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCsroprtcnt = cci("CSROPRTCNT", "CSROPRTCNT", null, null, Long.class, "csroprtcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCuttopdirassord = cci("CUTTOPDIRASSORD", "CUTTOPDIRASSORD", null, null, Long.class, "cuttopdirassord", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockcasesu = cci("STOCKCASESU", "STOCKCASESU", null, null, Long.class, "stockcasesu", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockcartonsu = cci("STOCKCARTONSU", "STOCKCARTONSU", null, null, Long.class, "stockcartonsu", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSellshopcnt = cci("SELLSHOPCNT", "SELLSHOPCNT", null, null, Long.class, "sellshopcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinecd = cci("LINECD", "LINECD", null, null, String.class, "linecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * STOCKDATE: {PK, NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockdate() { return _columnStockdate; }
    /**
     * RECNO: {PK, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecno() { return _columnRecno; }
    /**
     * SOTEDUNIT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSotedunit() { return _columnSotedunit; }
    /**
     * ZONE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZone() { return _columnZone; }
    /**
     * ASSORTEDORDER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortedorder() { return _columnAssortedorder; }
    /**
     * SOTEDLOC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSotedloc() { return _columnSotedloc; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * DELIVERYDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliverydate() { return _columnDeliverydate; }
    /**
     * DPWAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpwarehousecd() { return _columnDpwarehousecd; }
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
     * COMT: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnComt() { return _columnComt; }
    /**
     * SROPRTCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtcnt() { return _columnSroprtcnt; }
    /**
     * CSROPRTCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCsroprtcnt() { return _columnCsroprtcnt; }
    /**
     * CUTTOPDIRASSORD: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCuttopdirassord() { return _columnCuttopdirassord; }
    /**
     * STOCKCASESU: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockcasesu() { return _columnStockcasesu; }
    /**
     * STOCKCARTONSU: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockcartonsu() { return _columnStockcartonsu; }
    /**
     * SELLSHOPCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSellshopcnt() { return _columnSellshopcnt; }
    /**
     * LINECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinecd() { return _columnLinecd; }
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
        ls.add(columnWarehousecd());
        ls.add(columnStockdate());
        ls.add(columnRecno());
        ls.add(columnSotedunit());
        ls.add(columnZone());
        ls.add(columnAssortedorder());
        ls.add(columnSotedloc());
        ls.add(columnProductCd());
        ls.add(columnDeliverydate());
        ls.add(columnDpwarehousecd());
        ls.add(columnDirectioncd());
        ls.add(columnPistontype());
        ls.add(columnComt());
        ls.add(columnSroprtcnt());
        ls.add(columnCsroprtcnt());
        ls.add(columnCuttopdirassord());
        ls.add(columnStockcasesu());
        ls.add(columnStockcartonsu());
        ls.add(columnSellshopcnt());
        ls.add(columnLinecd());
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
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnWarehousecd());
        ls.add(columnStockdate());
        ls.add(columnRecno());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrdirectrest"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrdirectrestCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrdirectrestBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrdirectrest> getEntityType() { return TTrdirectrest.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrdirectrest newEntity() { return new TTrdirectrest(); }
    public TTrdirectrest newMyEntity() { return new TTrdirectrest(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrdirectrest)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrdirectrest)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

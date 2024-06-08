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
 * The DB meta of T_TRASSORTORDER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrassortorderDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrassortorderDbm _instance = new TTrassortorderDbm();
    private TTrassortorderDbm() {}
    public static TTrassortorderDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getDirectionorderkey(), (et, vl) -> ((TTrassortorder)et).setDirectionorderkey(ctl(vl)), "directionorderkey");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getDirectionordergno(), (et, vl) -> ((TTrassortorder)et).setDirectionordergno(ctl(vl)), "directionordergno");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getActflg(), (et, vl) -> ((TTrassortorder)et).setActflg(ctb(vl)), "actflg");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getWarehousecd(), (et, vl) -> ((TTrassortorder)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getRcvdate(), (et, vl) -> ((TTrassortorder)et).setRcvdate((String)vl), "rcvdate");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getShiporder(), (et, vl) -> ((TTrassortorder)et).setShiporder(ctl(vl)), "shiporder");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getRangestart(), (et, vl) -> ((TTrassortorder)et).setRangestart(ctb(vl)), "rangestart");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getRangeend(), (et, vl) -> ((TTrassortorder)et).setRangeend(ctb(vl)), "rangeend");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getDpwarehousecd(), (et, vl) -> ((TTrassortorder)et).setDpwarehousecd((String)vl), "dpwarehousecd");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getDeliverydate(), (et, vl) -> ((TTrassortorder)et).setDeliverydate((String)vl), "deliverydate");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getItemcd(), (et, vl) -> ((TTrassortorder)et).setItemcd((String)vl), "itemcd");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getLinecd(), (et, vl) -> ((TTrassortorder)et).setLinecd((String)vl), "linecd");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getSotedunit(), (et, vl) -> ((TTrassortorder)et).setSotedunit((String)vl), "sotedunit");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getAssortedorder(), (et, vl) -> ((TTrassortorder)et).setAssortedorder(ctl(vl)), "assortedorder");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getDeliveryseqno(), (et, vl) -> ((TTrassortorder)et).setDeliveryseqno(ctl(vl)), "deliveryseqno");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getDeliverybranchno(), (et, vl) -> ((TTrassortorder)et).setDeliverybranchno(ctb(vl)), "deliverybranchno");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getCaseno(), (et, vl) -> ((TTrassortorder)et).setCaseno((String)vl), "caseno");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getCaseserial(), (et, vl) -> ((TTrassortorder)et).setCaseserial((String)vl), "caseserial");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getSotedloc(), (et, vl) -> ((TTrassortorder)et).setSotedloc((String)vl), "sotedloc");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getProductCd(), (et, vl) -> ((TTrassortorder)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getDirectioncd(), (et, vl) -> ((TTrassortorder)et).setDirectioncd((String)vl), "directioncd");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getPistontype(), (et, vl) -> ((TTrassortorder)et).setPistontype((String)vl), "pistontype");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getCustomercd(), (et, vl) -> ((TTrassortorder)et).setCustomercd((String)vl), "customercd");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getDirectionnum(), (et, vl) -> ((TTrassortorder)et).setDirectionnum(ctl(vl)), "directionnum");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getSroprtcnt(), (et, vl) -> ((TTrassortorder)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getVaExtdata1(), (et, vl) -> ((TTrassortorder)et).setVaExtdata1((String)vl), "vaExtdata1");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getVaExtdata2(), (et, vl) -> ((TTrassortorder)et).setVaExtdata2((String)vl), "vaExtdata2");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getVaExtdata3(), (et, vl) -> ((TTrassortorder)et).setVaExtdata3((String)vl), "vaExtdata3");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getNvExtdata1(), (et, vl) -> ((TTrassortorder)et).setNvExtdata1((String)vl), "nvExtdata1");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getNvExtdata2(), (et, vl) -> ((TTrassortorder)et).setNvExtdata2((String)vl), "nvExtdata2");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getNvExtdata3(), (et, vl) -> ((TTrassortorder)et).setNvExtdata3((String)vl), "nvExtdata3");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getNmExtdata1(), (et, vl) -> ((TTrassortorder)et).setNmExtdata1(ctl(vl)), "nmExtdata1");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getNmExtdata2(), (et, vl) -> ((TTrassortorder)et).setNmExtdata2(ctl(vl)), "nmExtdata2");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getNmExtdata3(), (et, vl) -> ((TTrassortorder)et).setNmExtdata3(ctl(vl)), "nmExtdata3");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getDtExtdata1(), (et, vl) -> ((TTrassortorder)et).setDtExtdata1((String)vl), "dtExtdata1");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getDtExtdata2(), (et, vl) -> ((TTrassortorder)et).setDtExtdata2((String)vl), "dtExtdata2");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getDtExtdata3(), (et, vl) -> ((TTrassortorder)et).setDtExtdata3((String)vl), "dtExtdata3");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getDelFlg(), (et, vl) -> ((TTrassortorder)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getVersionNo(), (et, vl) -> ((TTrassortorder)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getControlNo(), (et, vl) -> ((TTrassortorder)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getAddDt(), (et, vl) -> ((TTrassortorder)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getAddUser(), (et, vl) -> ((TTrassortorder)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getAddProcess(), (et, vl) -> ((TTrassortorder)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getUpdDt(), (et, vl) -> ((TTrassortorder)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getUpdUser(), (et, vl) -> ((TTrassortorder)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrassortorder)et).getUpdProcess(), (et, vl) -> ((TTrassortorder)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRASSORTORDER";
    protected final String _tableDispName = "T_TRASSORTORDER";
    protected final String _tablePropertyName = "TTrassortorder";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRASSORTORDER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDirectionorderkey = cci("DIRECTIONORDERKEY", "DIRECTIONORDERKEY", null, null, Long.class, "directionorderkey", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionordergno = cci("DIRECTIONORDERGNO", "DIRECTIONORDERGNO", null, null, Long.class, "directionordergno", null, true, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnActflg = cci("ACTFLG", "ACTFLG", null, null, java.math.BigDecimal.class, "actflg", null, false, false, true, "decimal", 16, 6, null, "(1)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvdate = cci("RCVDATE", "RCVDATE", null, null, String.class, "rcvdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiporder = cci("SHIPORDER", "SHIPORDER", null, null, Long.class, "shiporder", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRangestart = cci("RANGESTART", "RANGESTART", null, null, java.math.BigDecimal.class, "rangestart", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRangeend = cci("RANGEEND", "RANGEEND", null, null, java.math.BigDecimal.class, "rangeend", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpwarehousecd = cci("DPWAREHOUSECD", "DPWAREHOUSECD", null, null, String.class, "dpwarehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliverydate = cci("DELIVERYDATE", "DELIVERYDATE", null, null, String.class, "deliverydate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcd = cci("ITEMCD", "ITEMCD", null, null, String.class, "itemcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinecd = cci("LINECD", "LINECD", null, null, String.class, "linecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSotedunit = cci("SOTEDUNIT", "SOTEDUNIT", null, null, String.class, "sotedunit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortedorder = cci("ASSORTEDORDER", "ASSORTEDORDER", null, null, Long.class, "assortedorder", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryseqno = cci("DELIVERYSEQNO", "DELIVERYSEQNO", null, null, Long.class, "deliveryseqno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliverybranchno = cci("DELIVERYBRANCHNO", "DELIVERYBRANCHNO", null, null, java.math.BigDecimal.class, "deliverybranchno", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseno = cci("CASENO", "CASENO", null, null, String.class, "caseno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseserial = cci("CASESERIAL", "CASESERIAL", null, null, String.class, "caseserial", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSotedloc = cci("SOTEDLOC", "SOTEDLOC", null, null, String.class, "sotedloc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectioncd = cci("DIRECTIONCD", "DIRECTIONCD", null, null, String.class, "directioncd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPistontype = cci("PISTONTYPE", "PISTONTYPE", null, null, String.class, "pistontype", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomercd = cci("CUSTOMERCD", "CUSTOMERCD", null, null, String.class, "customercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionnum = cci("DIRECTIONNUM", "DIRECTIONNUM", null, null, Long.class, "directionnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionorderkey() { return _columnDirectionorderkey; }
    /**
     * DIRECTIONORDERGNO: {PK, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionordergno() { return _columnDirectionordergno; }
    /**
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnActflg() { return _columnActflg; }
    /**
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * RCVDATE: {IX+, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvdate() { return _columnRcvdate; }
    /**
     * SHIPORDER: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiporder() { return _columnShiporder; }
    /**
     * RANGESTART: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRangestart() { return _columnRangestart; }
    /**
     * RANGEEND: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRangeend() { return _columnRangeend; }
    /**
     * DPWAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpwarehousecd() { return _columnDpwarehousecd; }
    /**
     * DELIVERYDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliverydate() { return _columnDeliverydate; }
    /**
     * ITEMCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcd() { return _columnItemcd; }
    /**
     * LINECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinecd() { return _columnLinecd; }
    /**
     * SOTEDUNIT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSotedunit() { return _columnSotedunit; }
    /**
     * ASSORTEDORDER: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortedorder() { return _columnAssortedorder; }
    /**
     * DELIVERYSEQNO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryseqno() { return _columnDeliveryseqno; }
    /**
     * DELIVERYBRANCHNO: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliverybranchno() { return _columnDeliverybranchno; }
    /**
     * CASENO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseno() { return _columnCaseno; }
    /**
     * CASESERIAL: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseserial() { return _columnCaseserial; }
    /**
     * SOTEDLOC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSotedloc() { return _columnSotedloc; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
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
     * SROPRTCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtcnt() { return _columnSroprtcnt; }
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
        ls.add(columnDirectionorderkey());
        ls.add(columnDirectionordergno());
        ls.add(columnActflg());
        ls.add(columnWarehousecd());
        ls.add(columnRcvdate());
        ls.add(columnShiporder());
        ls.add(columnRangestart());
        ls.add(columnRangeend());
        ls.add(columnDpwarehousecd());
        ls.add(columnDeliverydate());
        ls.add(columnItemcd());
        ls.add(columnLinecd());
        ls.add(columnSotedunit());
        ls.add(columnAssortedorder());
        ls.add(columnDeliveryseqno());
        ls.add(columnDeliverybranchno());
        ls.add(columnCaseno());
        ls.add(columnCaseserial());
        ls.add(columnSotedloc());
        ls.add(columnProductCd());
        ls.add(columnDirectioncd());
        ls.add(columnPistontype());
        ls.add(columnCustomercd());
        ls.add(columnDirectionnum());
        ls.add(columnSroprtcnt());
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
        ls.add(columnDirectionorderkey());
        ls.add(columnDirectionordergno());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrassortorder"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrassortorderCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrassortorderBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrassortorder> getEntityType() { return TTrassortorder.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrassortorder newEntity() { return new TTrassortorder(); }
    public TTrassortorder newMyEntity() { return new TTrassortorder(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrassortorder)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrassortorder)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

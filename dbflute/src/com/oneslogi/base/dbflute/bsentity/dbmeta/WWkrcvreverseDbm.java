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
 * The DB meta of W_WKRCVREVERSE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WWkrcvreverseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WWkrcvreverseDbm _instance = new WWkrcvreverseDbm();
    private WWkrcvreverseDbm() {}
    public static WWkrcvreverseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getPrintkey(), (et, vl) -> ((WWkrcvreverse)et).setPrintkey(ctb(vl)), "printkey");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getRcvreverseno(), (et, vl) -> ((WWkrcvreverse)et).setRcvreverseno(ctb(vl)), "rcvreverseno");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getRcvreverselineno(), (et, vl) -> ((WWkrcvreverse)et).setRcvreverselineno(ctl(vl)), "rcvreverselineno");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getWarehousecd(), (et, vl) -> ((WWkrcvreverse)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getWarehousename(), (et, vl) -> ((WWkrcvreverse)et).setWarehousename((String)vl), "warehousename");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getTransportno(), (et, vl) -> ((WWkrcvreverse)et).setTransportno((String)vl), "transportno");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getRcvschdate(), (et, vl) -> ((WWkrcvreverse)et).setRcvschdate((String)vl), "rcvschdate");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getSuppliercd(), (et, vl) -> ((WWkrcvreverse)et).setSuppliercd((String)vl), "suppliercd");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getSuppliername(), (et, vl) -> ((WWkrcvreverse)et).setSuppliername((String)vl), "suppliername");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getProductCd(), (et, vl) -> ((WWkrcvreverse)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getItemname(), (et, vl) -> ((WWkrcvreverse)et).setItemname((String)vl), "itemname");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getRcvlimitdate(), (et, vl) -> ((WWkrcvreverse)et).setRcvlimitdate((String)vl), "rcvlimitdate");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getRcvdesigncd(), (et, vl) -> ((WWkrcvreverse)et).setRcvdesigncd((String)vl), "rcvdesigncd");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getRcvqty(), (et, vl) -> ((WWkrcvreverse)et).setRcvqty((String)vl), "rcvqty");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getWorkdatetime(), (et, vl) -> ((WWkrcvreverse)et).setWorkdatetime((String)vl), "workdatetime");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getLoc(), (et, vl) -> ((WWkrcvreverse)et).setLoc((String)vl), "loc");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getLoccd(), (et, vl) -> ((WWkrcvreverse)et).setLoccd((String)vl), "loccd");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getLimitday(), (et, vl) -> ((WWkrcvreverse)et).setLimitday((String)vl), "limitday");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getDesigncd(), (et, vl) -> ((WWkrcvreverse)et).setDesigncd((String)vl), "designcd");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getQtycase(), (et, vl) -> ((WWkrcvreverse)et).setQtycase(ctb(vl)), "qtycase");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getQtybowl(), (et, vl) -> ((WWkrcvreverse)et).setQtybowl(ctb(vl)), "qtybowl");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getFlg(), (et, vl) -> ((WWkrcvreverse)et).setFlg((String)vl), "flg");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getInsideOutsideKbn(), (et, vl) -> ((WWkrcvreverse)et).setInsideOutsideKbn((String)vl), "insideOutsideKbn");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getItemOrderby(), (et, vl) -> ((WWkrcvreverse)et).setItemOrderby(ctl(vl)), "itemOrderby");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getPrintpageno(), (et, vl) -> ((WWkrcvreverse)et).setPrintpageno(ctl(vl)), "printpageno");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getSeqsortkey(), (et, vl) -> ((WWkrcvreverse)et).setSeqsortkey(ctb(vl)), "seqsortkey");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getDelFlg(), (et, vl) -> ((WWkrcvreverse)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getVersionNo(), (et, vl) -> ((WWkrcvreverse)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getControlNo(), (et, vl) -> ((WWkrcvreverse)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getAddDt(), (et, vl) -> ((WWkrcvreverse)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getAddUser(), (et, vl) -> ((WWkrcvreverse)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getAddProcess(), (et, vl) -> ((WWkrcvreverse)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getUpdDt(), (et, vl) -> ((WWkrcvreverse)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getUpdUser(), (et, vl) -> ((WWkrcvreverse)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WWkrcvreverse)et).getUpdProcess(), (et, vl) -> ((WWkrcvreverse)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_WKRCVREVERSE";
    protected final String _tableDispName = "W_WKRCVREVERSE";
    protected final String _tablePropertyName = "WWkrcvreverse";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_WKRCVREVERSE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrintkey = cci("PRINTKEY", "PRINTKEY", null, null, java.math.BigDecimal.class, "printkey", null, true, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvreverseno = cci("RCVREVERSENO", "RCVREVERSENO", null, null, java.math.BigDecimal.class, "rcvreverseno", null, true, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvreverselineno = cci("RCVREVERSELINENO", "RCVREVERSELINENO", null, null, Long.class, "rcvreverselineno", null, true, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousename = cci("WAREHOUSENAME", "WAREHOUSENAME", null, null, String.class, "warehousename", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportno = cci("TRANSPORTNO", "TRANSPORTNO", null, null, String.class, "transportno", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvschdate = cci("RCVSCHDATE", "RCVSCHDATE", null, null, String.class, "rcvschdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuppliercd = cci("SUPPLIERCD", "SUPPLIERCD", null, null, String.class, "suppliercd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuppliername = cci("SUPPLIERNAME", "SUPPLIERNAME", null, null, String.class, "suppliername", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemname = cci("ITEMNAME", "ITEMNAME", null, null, String.class, "itemname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvlimitdate = cci("RCVLIMITDATE", "RCVLIMITDATE", null, null, String.class, "rcvlimitdate", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvdesigncd = cci("RCVDESIGNCD", "RCVDESIGNCD", null, null, String.class, "rcvdesigncd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvqty = cci("RCVQTY", "RCVQTY", null, null, String.class, "rcvqty", null, false, false, true, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkdatetime = cci("WORKDATETIME", "WORKDATETIME", null, null, String.class, "workdatetime", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoc = cci("LOC", "LOC", null, null, String.class, "loc", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoccd = cci("LOCCD", "LOCCD", null, null, String.class, "loccd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitday = cci("LIMITDAY", "LIMITDAY", null, null, String.class, "limitday", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncd = cci("DESIGNCD", "DESIGNCD", null, null, String.class, "designcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtycase = cci("QTYCASE", "QTYCASE", null, null, java.math.BigDecimal.class, "qtycase", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtybowl = cci("QTYBOWL", "QTYBOWL", null, null, java.math.BigDecimal.class, "qtybowl", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg = cci("FLG", "FLG", null, null, String.class, "flg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInsideOutsideKbn = cci("INSIDE_OUTSIDE_KBN", "INSIDE_OUTSIDE_KBN", null, null, String.class, "insideOutsideKbn", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
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
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintkey() { return _columnPrintkey; }
    /**
     * RCVREVERSENO: {PK, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvreverseno() { return _columnRcvreverseno; }
    /**
     * RCVREVERSELINENO: {PK, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvreverselineno() { return _columnRcvreverselineno; }
    /**
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * WAREHOUSENAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousename() { return _columnWarehousename; }
    /**
     * TRANSPORTNO: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportno() { return _columnTransportno; }
    /**
     * RCVSCHDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvschdate() { return _columnRcvschdate; }
    /**
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppliercd() { return _columnSuppliercd; }
    /**
     * SUPPLIERNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppliername() { return _columnSuppliername; }
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
     * RCVLIMITDATE: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvlimitdate() { return _columnRcvlimitdate; }
    /**
     * RCVDESIGNCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvdesigncd() { return _columnRcvdesigncd; }
    /**
     * RCVQTY: {NotNull, varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvqty() { return _columnRcvqty; }
    /**
     * WORKDATETIME: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkdatetime() { return _columnWorkdatetime; }
    /**
     * LOC: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoc() { return _columnLoc; }
    /**
     * LOCCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoccd() { return _columnLoccd; }
    /**
     * LIMITDAY: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitday() { return _columnLimitday; }
    /**
     * DESIGNCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncd() { return _columnDesigncd; }
    /**
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtycase() { return _columnQtycase; }
    /**
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtybowl() { return _columnQtybowl; }
    /**
     * FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg() { return _columnFlg; }
    /**
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInsideOutsideKbn() { return _columnInsideOutsideKbn; }
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
        ls.add(columnPrintkey());
        ls.add(columnRcvreverseno());
        ls.add(columnRcvreverselineno());
        ls.add(columnWarehousecd());
        ls.add(columnWarehousename());
        ls.add(columnTransportno());
        ls.add(columnRcvschdate());
        ls.add(columnSuppliercd());
        ls.add(columnSuppliername());
        ls.add(columnProductCd());
        ls.add(columnItemname());
        ls.add(columnRcvlimitdate());
        ls.add(columnRcvdesigncd());
        ls.add(columnRcvqty());
        ls.add(columnWorkdatetime());
        ls.add(columnLoc());
        ls.add(columnLoccd());
        ls.add(columnLimitday());
        ls.add(columnDesigncd());
        ls.add(columnQtycase());
        ls.add(columnQtybowl());
        ls.add(columnFlg());
        ls.add(columnInsideOutsideKbn());
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
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnPrintkey());
        ls.add(columnRcvreverseno());
        ls.add(columnRcvreverselineno());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WWkrcvreverse"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WWkrcvreverseCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WWkrcvreverseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WWkrcvreverse> getEntityType() { return WWkrcvreverse.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WWkrcvreverse newEntity() { return new WWkrcvreverse(); }
    public WWkrcvreverse newMyEntity() { return new WWkrcvreverse(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WWkrcvreverse)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WWkrcvreverse)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

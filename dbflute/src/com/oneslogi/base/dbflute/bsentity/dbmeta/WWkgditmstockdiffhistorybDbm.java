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
 * The DB meta of W_WKGDITMSTOCKDIFFHISTORYB. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WWkgditmstockdiffhistorybDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WWkgditmstockdiffhistorybDbm _instance = new WWkgditmstockdiffhistorybDbm();
    private WWkgditmstockdiffhistorybDbm() {}
    public static WWkgditmstockdiffhistorybDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getPrintkey(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setPrintkey(ctb(vl)), "printkey");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getWarehousecd(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getWarehousename(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setWarehousename((String)vl), "warehousename");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getDiffadddate(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setDiffadddate((String)vl), "diffadddate");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getDiffoccarea(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setDiffoccarea((String)vl), "diffoccarea");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getProductCd(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getItemname(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setItemname((String)vl), "itemname");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getDiffqty(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setDiffqty(ctb(vl)), "diffqty");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getInoutkbn(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setInoutkbn((String)vl), "inoutkbn");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getItemorderby(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setItemorderby(ctl(vl)), "itemorderby");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getDelFlg(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getVersionNo(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getControlNo(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getAddDt(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getAddUser(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getAddProcess(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getUpdDt(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getUpdUser(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WWkgditmstockdiffhistoryb)et).getUpdProcess(), (et, vl) -> ((WWkgditmstockdiffhistoryb)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_WKGDITMSTOCKDIFFHISTORYB";
    protected final String _tableDispName = "W_WKGDITMSTOCKDIFFHISTORYB";
    protected final String _tablePropertyName = "WWkgditmstockdiffhistoryb";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_WKGDITMSTOCKDIFFHISTORYB", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrintkey = cci("PRINTKEY", "PRINTKEY", null, null, java.math.BigDecimal.class, "printkey", null, true, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, true, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousename = cci("WAREHOUSENAME", "WAREHOUSENAME", null, null, String.class, "warehousename", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffadddate = cci("DIFFADDDATE", "DIFFADDDATE", null, null, String.class, "diffadddate", null, true, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffoccarea = cci("DIFFOCCAREA", "DIFFOCCAREA", null, null, String.class, "diffoccarea", null, true, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, true, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemname = cci("ITEMNAME", "ITEMNAME", null, null, String.class, "itemname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffqty = cci("DIFFQTY", "DIFFQTY", null, null, java.math.BigDecimal.class, "diffqty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutkbn = cci("INOUTKBN", "INOUTKBN", null, null, String.class, "inoutkbn", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemorderby = cci("ITEMORDERBY", "ITEMORDERBY", null, null, Long.class, "itemorderby", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * WAREHOUSENAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousename() { return _columnWarehousename; }
    /**
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffadddate() { return _columnDiffadddate; }
    /**
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffoccarea() { return _columnDiffoccarea; }
    /**
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * ITEMNAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemname() { return _columnItemname; }
    /**
     * DIFFQTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffqty() { return _columnDiffqty; }
    /**
     * INOUTKBN: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInoutkbn() { return _columnInoutkbn; }
    /**
     * ITEMORDERBY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemorderby() { return _columnItemorderby; }
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
        ls.add(columnWarehousecd());
        ls.add(columnWarehousename());
        ls.add(columnDiffadddate());
        ls.add(columnDiffoccarea());
        ls.add(columnProductCd());
        ls.add(columnItemname());
        ls.add(columnDiffqty());
        ls.add(columnInoutkbn());
        ls.add(columnItemorderby());
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
        ls.add(columnWarehousecd());
        ls.add(columnDiffadddate());
        ls.add(columnDiffoccarea());
        ls.add(columnProductCd());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WWkgditmstockdiffhistoryb"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WWkgditmstockdiffhistorybCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WWkgditmstockdiffhistorybBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WWkgditmstockdiffhistoryb> getEntityType() { return WWkgditmstockdiffhistoryb.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WWkgditmstockdiffhistoryb newEntity() { return new WWkgditmstockdiffhistoryb(); }
    public WWkgditmstockdiffhistoryb newMyEntity() { return new WWkgditmstockdiffhistoryb(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WWkgditmstockdiffhistoryb)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WWkgditmstockdiffhistoryb)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

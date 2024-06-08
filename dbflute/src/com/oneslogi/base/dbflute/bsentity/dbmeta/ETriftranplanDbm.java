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
 * The DB meta of E_TRIFTRANPLAN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ETriftranplanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ETriftranplanDbm _instance = new ETriftranplanDbm();
    private ETriftranplanDbm() {}
    public static ETriftranplanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getUjtype(), (et, vl) -> ((ETriftranplan)et).setUjtype((String)vl), "ujtype");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getRecno(), (et, vl) -> ((ETriftranplan)et).setRecno(ctb(vl)), "recno");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getWarehousecd(), (et, vl) -> ((ETriftranplan)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getRefno(), (et, vl) -> ((ETriftranplan)et).setRefno((String)vl), "refno");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getShipcd(), (et, vl) -> ((ETriftranplan)et).setShipcd((String)vl), "shipcd");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getShipschdate(), (et, vl) -> ((ETriftranplan)et).setShipschdate((String)vl), "shipschdate");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getShiptocd(), (et, vl) -> ((ETriftranplan)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getShiptoschdate(), (et, vl) -> ((ETriftranplan)et).setShiptoschdate((String)vl), "shiptoschdate");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getDatatype(), (et, vl) -> ((ETriftranplan)et).setDatatype((String)vl), "datatype");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getProductCd(), (et, vl) -> ((ETriftranplan)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getQty(), (et, vl) -> ((ETriftranplan)et).setQty(ctl(vl)), "qty");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getSubwarehousecd(), (et, vl) -> ((ETriftranplan)et).setSubwarehousecd((String)vl), "subwarehousecd");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getResultflg(), (et, vl) -> ((ETriftranplan)et).setResultflg((String)vl), "resultflg");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getDelFlg(), (et, vl) -> ((ETriftranplan)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getVersionNo(), (et, vl) -> ((ETriftranplan)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getControlNo(), (et, vl) -> ((ETriftranplan)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getAddDt(), (et, vl) -> ((ETriftranplan)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getAddUser(), (et, vl) -> ((ETriftranplan)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getAddProcess(), (et, vl) -> ((ETriftranplan)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getUpdDt(), (et, vl) -> ((ETriftranplan)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getUpdUser(), (et, vl) -> ((ETriftranplan)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ETriftranplan)et).getUpdProcess(), (et, vl) -> ((ETriftranplan)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_TRIFTRANPLAN";
    protected final String _tableDispName = "E_TRIFTRANPLAN";
    protected final String _tablePropertyName = "ETriftranplan";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_TRIFTRANPLAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUjtype = cci("UJTYPE", "UJTYPE", null, null, String.class, "ujtype", null, true, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRecno = cci("RECNO", "RECNO", null, null, java.math.BigDecimal.class, "recno", null, true, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefno = cci("REFNO", "REFNO", null, null, String.class, "refno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipcd = cci("SHIPCD", "SHIPCD", null, null, String.class, "shipcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschdate = cci("SHIPSCHDATE", "SHIPSCHDATE", null, null, String.class, "shipschdate", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("SHIPTOCD", "SHIPTOCD", null, null, String.class, "shiptocd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptoschdate = cci("SHIPTOSCHDATE", "SHIPTOSCHDATE", null, null, String.class, "shiptoschdate", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDatatype = cci("DATATYPE", "DATATYPE", null, null, String.class, "datatype", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, Long.class, "qty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubwarehousecd = cci("SUBWAREHOUSECD", "SUBWAREHOUSECD", null, null, String.class, "subwarehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnResultflg = cci("RESULTFLG", "RESULTFLG", null, null, String.class, "resultflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * UJTYPE: {PK, NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUjtype() { return _columnUjtype; }
    /**
     * RECNO: {PK, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecno() { return _columnRecno; }
    /**
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * REFNO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefno() { return _columnRefno; }
    /**
     * SHIPCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipcd() { return _columnShipcd; }
    /**
     * SHIPSCHDATE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschdate() { return _columnShipschdate; }
    /**
     * SHIPTOCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * SHIPTOSCHDATE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptoschdate() { return _columnShiptoschdate; }
    /**
     * DATATYPE: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDatatype() { return _columnDatatype; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * QTY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * SUBWAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubwarehousecd() { return _columnSubwarehousecd; }
    /**
     * RESULTFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnResultflg() { return _columnResultflg; }
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
        ls.add(columnUjtype());
        ls.add(columnRecno());
        ls.add(columnWarehousecd());
        ls.add(columnRefno());
        ls.add(columnShipcd());
        ls.add(columnShipschdate());
        ls.add(columnShiptocd());
        ls.add(columnShiptoschdate());
        ls.add(columnDatatype());
        ls.add(columnProductCd());
        ls.add(columnQty());
        ls.add(columnSubwarehousecd());
        ls.add(columnResultflg());
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
        ls.add(columnUjtype());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ETriftranplan"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ETriftranplanCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ETriftranplanBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ETriftranplan> getEntityType() { return ETriftranplan.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ETriftranplan newEntity() { return new ETriftranplan(); }
    public ETriftranplan newMyEntity() { return new ETriftranplan(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ETriftranplan)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ETriftranplan)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

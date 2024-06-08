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
 * The DB meta of SqlAllocateControlMasterList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlAllocateControlMasterListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlAllocateControlMasterListDbm _instance = new SqlAllocateControlMasterListDbm();
    private SqlAllocateControlMasterListDbm() {}
    public static SqlAllocateControlMasterListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getMfpickctlId(), (et, vl) -> ((SqlAllocateControlMasterList)et).setMfpickctlId(ctl(vl)), "mfpickctlId");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getProductCd(), (et, vl) -> ((SqlAllocateControlMasterList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getProductNm(), (et, vl) -> ((SqlAllocateControlMasterList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getPickfrdate(), (et, vl) -> ((SqlAllocateControlMasterList)et).setPickfrdate((String)vl), "pickfrdate");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getPicktodate(), (et, vl) -> ((SqlAllocateControlMasterList)et).setPicktodate((String)vl), "picktodate");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getValidtype(), (et, vl) -> ((SqlAllocateControlMasterList)et).setValidtype((String)vl), "validtype");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getValidtypeNm(), (et, vl) -> ((SqlAllocateControlMasterList)et).setValidtypeNm((String)vl), "validtypeNm");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getPickrank1(), (et, vl) -> ((SqlAllocateControlMasterList)et).setPickrank1((String)vl), "pickrank1");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getPickrank1Nm(), (et, vl) -> ((SqlAllocateControlMasterList)et).setPickrank1Nm((String)vl), "pickrank1Nm");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getPickrank2(), (et, vl) -> ((SqlAllocateControlMasterList)et).setPickrank2((String)vl), "pickrank2");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getPickrank2Nm(), (et, vl) -> ((SqlAllocateControlMasterList)et).setPickrank2Nm((String)vl), "pickrank2Nm");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getPickrank3(), (et, vl) -> ((SqlAllocateControlMasterList)et).setPickrank3((String)vl), "pickrank3");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getPickrank3Nm(), (et, vl) -> ((SqlAllocateControlMasterList)et).setPickrank3Nm((String)vl), "pickrank3Nm");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getPickrank4(), (et, vl) -> ((SqlAllocateControlMasterList)et).setPickrank4((String)vl), "pickrank4");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getPickrank4Nm(), (et, vl) -> ((SqlAllocateControlMasterList)et).setPickrank4Nm((String)vl), "pickrank4Nm");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getPickrank5(), (et, vl) -> ((SqlAllocateControlMasterList)et).setPickrank5((String)vl), "pickrank5");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getPickrank5Nm(), (et, vl) -> ((SqlAllocateControlMasterList)et).setPickrank5Nm((String)vl), "pickrank5Nm");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getUpdDt(), (et, vl) -> ((SqlAllocateControlMasterList)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getUpdUser(), (et, vl) -> ((SqlAllocateControlMasterList)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getClientCd(), (et, vl) -> ((SqlAllocateControlMasterList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getClientNm(), (et, vl) -> ((SqlAllocateControlMasterList)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getClientId(), (et, vl) -> ((SqlAllocateControlMasterList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getCenterCd(), (et, vl) -> ((SqlAllocateControlMasterList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getCenterNm(), (et, vl) -> ((SqlAllocateControlMasterList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterList)et).getVersionNo(), (et, vl) -> ((SqlAllocateControlMasterList)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlAllocateControlMasterList";
    protected final String _tableDispName = "SqlAllocateControlMasterList";
    protected final String _tablePropertyName = "sqlAllocateControlMasterList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlAllocateControlMasterList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMfpickctlId = cci("MFPICKCTL_ID", "MFPICKCTL_ID", null, null, Long.class, "mfpickctlId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickfrdate = cci("PICKFRDATE", "PICKFRDATE", null, null, String.class, "pickfrdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicktodate = cci("PICKTODATE", "PICKTODATE", null, null, String.class, "picktodate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValidtype = cci("VALIDTYPE", "VALIDTYPE", null, null, String.class, "validtype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValidtypeNm = cci("VALIDTYPE_NM", "VALIDTYPE_NM", null, null, String.class, "validtypeNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank1 = cci("PICKRANK1", "PICKRANK1", null, null, String.class, "pickrank1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank1Nm = cci("PICKRANK1_NM", "PICKRANK1_NM", null, null, String.class, "pickrank1Nm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank2 = cci("PICKRANK2", "PICKRANK2", null, null, String.class, "pickrank2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank2Nm = cci("PICKRANK2_NM", "PICKRANK2_NM", null, null, String.class, "pickrank2Nm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank3 = cci("PICKRANK3", "PICKRANK3", null, null, String.class, "pickrank3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank3Nm = cci("PICKRANK3_NM", "PICKRANK3_NM", null, null, String.class, "pickrank3Nm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank4 = cci("PICKRANK4", "PICKRANK4", null, null, String.class, "pickrank4", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank4Nm = cci("PICKRANK4_NM", "PICKRANK4_NM", null, null, String.class, "pickrank4Nm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank5 = cci("PICKRANK5", "PICKRANK5", null, null, String.class, "pickrank5", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank5Nm = cci("PICKRANK5_NM", "PICKRANK5_NM", null, null, String.class, "pickrank5Nm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * MFPICKCTL_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMfpickctlId() { return _columnMfpickctlId; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * PICKFRDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickfrdate() { return _columnPickfrdate; }
    /**
     * PICKTODATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicktodate() { return _columnPicktodate; }
    /**
     * VALIDTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidtype() { return _columnValidtype; }
    /**
     * VALIDTYPE_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidtypeNm() { return _columnValidtypeNm; }
    /**
     * PICKRANK1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank1() { return _columnPickrank1; }
    /**
     * PICKRANK1_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank1Nm() { return _columnPickrank1Nm; }
    /**
     * PICKRANK2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank2() { return _columnPickrank2; }
    /**
     * PICKRANK2_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank2Nm() { return _columnPickrank2Nm; }
    /**
     * PICKRANK3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank3() { return _columnPickrank3; }
    /**
     * PICKRANK3_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank3Nm() { return _columnPickrank3Nm; }
    /**
     * PICKRANK4: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank4() { return _columnPickrank4; }
    /**
     * PICKRANK4_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank4Nm() { return _columnPickrank4Nm; }
    /**
     * PICKRANK5: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank5() { return _columnPickrank5; }
    /**
     * PICKRANK5_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank5Nm() { return _columnPickrank5Nm; }
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
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
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
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMfpickctlId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnPickfrdate());
        ls.add(columnPicktodate());
        ls.add(columnValidtype());
        ls.add(columnValidtypeNm());
        ls.add(columnPickrank1());
        ls.add(columnPickrank1Nm());
        ls.add(columnPickrank2());
        ls.add(columnPickrank2Nm());
        ls.add(columnPickrank3());
        ls.add(columnPickrank3Nm());
        ls.add(columnPickrank4());
        ls.add(columnPickrank4Nm());
        ls.add(columnPickrank5());
        ls.add(columnPickrank5Nm());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnClientId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnVersionNo());
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
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlAllocateControlMasterList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlAllocateControlMasterList> getEntityType() { return SqlAllocateControlMasterList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlAllocateControlMasterList newEntity() { return new SqlAllocateControlMasterList(); }
    public SqlAllocateControlMasterList newMyEntity() { return new SqlAllocateControlMasterList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlAllocateControlMasterList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlAllocateControlMasterList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

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
 * The DB meta of SqlAllocateControlMasterEdit. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlAllocateControlMasterEditDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlAllocateControlMasterEditDbm _instance = new SqlAllocateControlMasterEditDbm();
    private SqlAllocateControlMasterEditDbm() {}
    public static SqlAllocateControlMasterEditDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getMfpickctlId(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setMfpickctlId(ctl(vl)), "mfpickctlId");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getProductCd(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getProductNm(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getPickfrdate(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setPickfrdate((String)vl), "pickfrdate");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getPicktodate(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setPicktodate((String)vl), "picktodate");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getValidtype(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setValidtype((String)vl), "validtype");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getPickrank1(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setPickrank1((String)vl), "pickrank1");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getPickrank2(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setPickrank2((String)vl), "pickrank2");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getPickrank3(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setPickrank3((String)vl), "pickrank3");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getPickrank4(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setPickrank4((String)vl), "pickrank4");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getPickrank5(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setPickrank5((String)vl), "pickrank5");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getUpdDt(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getUpdUser(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getClientCd(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getClientId(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getCenterCd(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getCenterId(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getVersionNo(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEdit)et).getDelFlg(), (et, vl) -> ((SqlAllocateControlMasterEdit)et).setDelFlg((String)vl), "delFlg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlAllocateControlMasterEdit";
    protected final String _tableDispName = "SqlAllocateControlMasterEdit";
    protected final String _tablePropertyName = "sqlAllocateControlMasterEdit";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlAllocateControlMasterEdit", _tableDbName);
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
    protected final ColumnInfo _columnPickrank1 = cci("PICKRANK1", "PICKRANK1", null, null, String.class, "pickrank1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank2 = cci("PICKRANK2", "PICKRANK2", null, null, String.class, "pickrank2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank3 = cci("PICKRANK3", "PICKRANK3", null, null, String.class, "pickrank3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank4 = cci("PICKRANK4", "PICKRANK4", null, null, String.class, "pickrank4", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickrank5 = cci("PICKRANK5", "PICKRANK5", null, null, String.class, "pickrank5", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.DelFlg, false);

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
     * PICKRANK1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank1() { return _columnPickrank1; }
    /**
     * PICKRANK2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank2() { return _columnPickrank2; }
    /**
     * PICKRANK3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank3() { return _columnPickrank3; }
    /**
     * PICKRANK4: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank4() { return _columnPickrank4; }
    /**
     * PICKRANK5: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickrank5() { return _columnPickrank5; }
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
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * DEL_FLG: {char(1), classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMfpickctlId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnPickfrdate());
        ls.add(columnPicktodate());
        ls.add(columnValidtype());
        ls.add(columnPickrank1());
        ls.add(columnPickrank2());
        ls.add(columnPickrank3());
        ls.add(columnPickrank4());
        ls.add(columnPickrank5());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnClientCd());
        ls.add(columnClientId());
        ls.add(columnCenterCd());
        ls.add(columnCenterId());
        ls.add(columnVersionNo());
        ls.add(columnDelFlg());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlAllocateControlMasterEdit"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlAllocateControlMasterEdit> getEntityType() { return SqlAllocateControlMasterEdit.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlAllocateControlMasterEdit newEntity() { return new SqlAllocateControlMasterEdit(); }
    public SqlAllocateControlMasterEdit newMyEntity() { return new SqlAllocateControlMasterEdit(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlAllocateControlMasterEdit)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlAllocateControlMasterEdit)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

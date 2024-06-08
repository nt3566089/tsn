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
 * The DB meta of SqlCenterProductControlMasterList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlCenterProductControlMasterListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlCenterProductControlMasterListDbm _instance = new SqlCenterProductControlMasterListDbm();
    private SqlCenterProductControlMasterListDbm() {}
    public static SqlCenterProductControlMasterListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlCenterProductControlMasterList)et).getMfwhItemId(), (et, vl) -> ((SqlCenterProductControlMasterList)et).setMfwhItemId(ctl(vl)), "mfwhItemId");
        setupEpg(_epgMap, et -> ((SqlCenterProductControlMasterList)et).getProductCd(), (et, vl) -> ((SqlCenterProductControlMasterList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlCenterProductControlMasterList)et).getProductNm(), (et, vl) -> ((SqlCenterProductControlMasterList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlCenterProductControlMasterList)et).getSlotlocname(), (et, vl) -> ((SqlCenterProductControlMasterList)et).setSlotlocname((String)vl), "slotlocname");
        setupEpg(_epgMap, et -> ((SqlCenterProductControlMasterList)et).getPicklocname(), (et, vl) -> ((SqlCenterProductControlMasterList)et).setPicklocname((String)vl), "picklocname");
        setupEpg(_epgMap, et -> ((SqlCenterProductControlMasterList)et).getUpdDt(), (et, vl) -> ((SqlCenterProductControlMasterList)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlCenterProductControlMasterList)et).getUpdUser(), (et, vl) -> ((SqlCenterProductControlMasterList)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((SqlCenterProductControlMasterList)et).getTransportpriority(), (et, vl) -> ((SqlCenterProductControlMasterList)et).setTransportpriority(ctb(vl)), "transportpriority");
        setupEpg(_epgMap, et -> ((SqlCenterProductControlMasterList)et).getUsernum3(), (et, vl) -> ((SqlCenterProductControlMasterList)et).setUsernum3(ctl(vl)), "usernum3");
        setupEpg(_epgMap, et -> ((SqlCenterProductControlMasterList)et).getUsernum1(), (et, vl) -> ((SqlCenterProductControlMasterList)et).setUsernum1(ctl(vl)), "usernum1");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlCenterProductControlMasterList";
    protected final String _tableDispName = "SqlCenterProductControlMasterList";
    protected final String _tablePropertyName = "sqlCenterProductControlMasterList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlCenterProductControlMasterList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMfwhItemId = cci("MFWH_ITEM_ID", "MFWH_ITEM_ID", null, null, Long.class, "mfwhItemId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlotlocname = cci("SLOTLOCNAME", "SLOTLOCNAME", null, null, String.class, "slotlocname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicklocname = cci("PICKLOCNAME", "PICKLOCNAME", null, null, String.class, "picklocname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportpriority = cci("TRANSPORTPRIORITY", "TRANSPORTPRIORITY", null, null, java.math.BigDecimal.class, "transportpriority", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum1 = cci("USERNUM1", "USERNUM1", null, null, Long.class, "usernum1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * MFWH_ITEM_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMfwhItemId() { return _columnMfwhItemId; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * SLOTLOCNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlotlocname() { return _columnSlotlocname; }
    /**
     * PICKLOCNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicklocname() { return _columnPicklocname; }
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
     * TRANSPORTPRIORITY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportpriority() { return _columnTransportpriority; }
    /**
     * USERNUM3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum3() { return _columnUsernum3; }
    /**
     * USERNUM1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum1() { return _columnUsernum1; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMfwhItemId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnSlotlocname());
        ls.add(columnPicklocname());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnTransportpriority());
        ls.add(columnUsernum3());
        ls.add(columnUsernum1());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlCenterProductControlMasterList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlCenterProductControlMasterList> getEntityType() { return SqlCenterProductControlMasterList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlCenterProductControlMasterList newEntity() { return new SqlCenterProductControlMasterList(); }
    public SqlCenterProductControlMasterList newMyEntity() { return new SqlCenterProductControlMasterList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlCenterProductControlMasterList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlCenterProductControlMasterList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

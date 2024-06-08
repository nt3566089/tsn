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
 * The DB meta of SqlInventoryDateMasterList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlInventoryDateMasterListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlInventoryDateMasterListDbm _instance = new SqlInventoryDateMasterListDbm();
    private SqlInventoryDateMasterListDbm() {}
    public static SqlInventoryDateMasterListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterList)et).getMfinvoperationId(), (et, vl) -> ((SqlInventoryDateMasterList)et).setMfinvoperationId(ctl(vl)), "mfinvoperationId");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterList)et).getTargetDate(), (et, vl) -> ((SqlInventoryDateMasterList)et).setTargetDate((String)vl), "targetDate");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterList)et).getTargetDateEdit(), (et, vl) -> ((SqlInventoryDateMasterList)et).setTargetDateEdit((String)vl), "targetDateEdit");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterList)et).getSundayFlgNm(), (et, vl) -> ((SqlInventoryDateMasterList)et).setSundayFlgNm((String)vl), "sundayFlgNm");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterList)et).getSundayFlg(), (et, vl) -> ((SqlInventoryDateMasterList)et).setSundayFlg((String)vl), "sundayFlg");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterList)et).getInvDate(), (et, vl) -> ((SqlInventoryDateMasterList)et).setInvDate((String)vl), "invDate");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterList)et).getInvDateEdit(), (et, vl) -> ((SqlInventoryDateMasterList)et).setInvDateEdit((String)vl), "invDateEdit");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterList)et).getUpdDt(), (et, vl) -> ((SqlInventoryDateMasterList)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterList)et).getUpdUser(), (et, vl) -> ((SqlInventoryDateMasterList)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterList)et).getUserNm(), (et, vl) -> ((SqlInventoryDateMasterList)et).setUserNm((String)vl), "userNm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlInventoryDateMasterList";
    protected final String _tableDispName = "SqlInventoryDateMasterList";
    protected final String _tablePropertyName = "sqlInventoryDateMasterList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlInventoryDateMasterList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMfinvoperationId = cci("MFINVOPERATION_ID", "MFINVOPERATION_ID", null, null, Long.class, "mfinvoperationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTargetDate = cci("TARGET_DATE", "TARGET_DATE", null, null, String.class, "targetDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTargetDateEdit = cci("TARGET_DATE_EDIT", "TARGET_DATE_EDIT", null, null, String.class, "targetDateEdit", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSundayFlgNm = cci("SUNDAY_FLG_NM", "SUNDAY_FLG_NM", null, null, String.class, "sundayFlgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSundayFlg = cci("SUNDAY_FLG", "SUNDAY_FLG", null, null, String.class, "sundayFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvDate = cci("INV_DATE", "INV_DATE", null, null, String.class, "invDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvDateEdit = cci("INV_DATE_EDIT", "INV_DATE_EDIT", null, null, String.class, "invDateEdit", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);

    /**
     * MFINVOPERATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMfinvoperationId() { return _columnMfinvoperationId; }
    /**
     * TARGET_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTargetDate() { return _columnTargetDate; }
    /**
     * TARGET_DATE_EDIT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTargetDateEdit() { return _columnTargetDateEdit; }
    /**
     * SUNDAY_FLG_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSundayFlgNm() { return _columnSundayFlgNm; }
    /**
     * SUNDAY_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSundayFlg() { return _columnSundayFlg; }
    /**
     * INV_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvDate() { return _columnInvDate; }
    /**
     * INV_DATE_EDIT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvDateEdit() { return _columnInvDateEdit; }
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
     * USER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNm() { return _columnUserNm; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMfinvoperationId());
        ls.add(columnTargetDate());
        ls.add(columnTargetDateEdit());
        ls.add(columnSundayFlgNm());
        ls.add(columnSundayFlg());
        ls.add(columnInvDate());
        ls.add(columnInvDateEdit());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUserNm());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlInventoryDateMasterList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlInventoryDateMasterList> getEntityType() { return SqlInventoryDateMasterList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlInventoryDateMasterList newEntity() { return new SqlInventoryDateMasterList(); }
    public SqlInventoryDateMasterList newMyEntity() { return new SqlInventoryDateMasterList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlInventoryDateMasterList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlInventoryDateMasterList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

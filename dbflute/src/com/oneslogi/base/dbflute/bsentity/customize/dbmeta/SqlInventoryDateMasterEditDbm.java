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
 * The DB meta of SqlInventoryDateMasterEdit. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlInventoryDateMasterEditDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlInventoryDateMasterEditDbm _instance = new SqlInventoryDateMasterEditDbm();
    private SqlInventoryDateMasterEditDbm() {}
    public static SqlInventoryDateMasterEditDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterEdit)et).getMfinvoperationId(), (et, vl) -> ((SqlInventoryDateMasterEdit)et).setMfinvoperationId(ctl(vl)), "mfinvoperationId");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterEdit)et).getCenterId(), (et, vl) -> ((SqlInventoryDateMasterEdit)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterEdit)et).getCenterCd(), (et, vl) -> ((SqlInventoryDateMasterEdit)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterEdit)et).getClientId(), (et, vl) -> ((SqlInventoryDateMasterEdit)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterEdit)et).getClientCd(), (et, vl) -> ((SqlInventoryDateMasterEdit)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterEdit)et).getTargetDate(), (et, vl) -> ((SqlInventoryDateMasterEdit)et).setTargetDate((String)vl), "targetDate");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterEdit)et).getTargetDateEdit(), (et, vl) -> ((SqlInventoryDateMasterEdit)et).setTargetDateEdit(cti(vl)), "targetDateEdit");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterEdit)et).getSundayFlg(), (et, vl) -> ((SqlInventoryDateMasterEdit)et).setSundayFlg((String)vl), "sundayFlg");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterEdit)et).getInvDate(), (et, vl) -> ((SqlInventoryDateMasterEdit)et).setInvDate((String)vl), "invDate");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterEdit)et).getInvDateEdit(), (et, vl) -> ((SqlInventoryDateMasterEdit)et).setInvDateEdit(cti(vl)), "invDateEdit");
        setupEpg(_epgMap, et -> ((SqlInventoryDateMasterEdit)et).getVersionNo(), (et, vl) -> ((SqlInventoryDateMasterEdit)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlInventoryDateMasterEdit";
    protected final String _tableDispName = "SqlInventoryDateMasterEdit";
    protected final String _tablePropertyName = "sqlInventoryDateMasterEdit";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlInventoryDateMasterEdit", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMfinvoperationId = cci("MFINVOPERATION_ID", "MFINVOPERATION_ID", null, null, Long.class, "mfinvoperationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTargetDate = cci("TARGET_DATE", "TARGET_DATE", null, null, String.class, "targetDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTargetDateEdit = cci("TARGET_DATE_EDIT", "TARGET_DATE_EDIT", null, null, Integer.class, "targetDateEdit", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSundayFlg = cci("SUNDAY_FLG", "SUNDAY_FLG", null, null, String.class, "sundayFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvDate = cci("INV_DATE", "INV_DATE", null, null, String.class, "invDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvDateEdit = cci("INV_DATE_EDIT", "INV_DATE_EDIT", null, null, Integer.class, "invDateEdit", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * MFINVOPERATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMfinvoperationId() { return _columnMfinvoperationId; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
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
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMfinvoperationId());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnTargetDate());
        ls.add(columnTargetDateEdit());
        ls.add(columnSundayFlg());
        ls.add(columnInvDate());
        ls.add(columnInvDateEdit());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlInventoryDateMasterEdit"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlInventoryDateMasterEdit> getEntityType() { return SqlInventoryDateMasterEdit.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlInventoryDateMasterEdit newEntity() { return new SqlInventoryDateMasterEdit(); }
    public SqlInventoryDateMasterEdit newMyEntity() { return new SqlInventoryDateMasterEdit(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlInventoryDateMasterEdit)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlInventoryDateMasterEdit)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

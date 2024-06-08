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
 * The DB meta of B_COL_EXT_USER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BColExtUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BColExtUserDbm _instance = new BColExtUserDbm();
    private BColExtUserDbm() {}
    public static BColExtUserDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BColExtUser)et).getColExtUserId(), (et, vl) -> ((BColExtUser)et).setColExtUserId(ctl(vl)), "colExtUserId");
        setupEpg(_epgMap, et -> ((BColExtUser)et).getItemId(), (et, vl) -> ((BColExtUser)et).setItemId(ctl(vl)), "itemId");
        setupEpg(_epgMap, et -> ((BColExtUser)et).getColCd(), (et, vl) -> ((BColExtUser)et).setColCd((String)vl), "colCd");
        setupEpg(_epgMap, et -> ((BColExtUser)et).getUserId(), (et, vl) -> ((BColExtUser)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((BColExtUser)et).getColOrder(), (et, vl) -> ((BColExtUser)et).setColOrder(ctl(vl)), "colOrder");
        setupEpg(_epgMap, et -> ((BColExtUser)et).getColWidth(), (et, vl) -> ((BColExtUser)et).setColWidth(ctl(vl)), "colWidth");
        setupEpg(_epgMap, et -> ((BColExtUser)et).getDelFlg(), (et, vl) -> ((BColExtUser)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BColExtUser)et).getVersionNo(), (et, vl) -> ((BColExtUser)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BColExtUser)et).getControlNo(), (et, vl) -> ((BColExtUser)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BColExtUser)et).getAddDt(), (et, vl) -> ((BColExtUser)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BColExtUser)et).getAddUser(), (et, vl) -> ((BColExtUser)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BColExtUser)et).getAddProcess(), (et, vl) -> ((BColExtUser)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BColExtUser)et).getUpdDt(), (et, vl) -> ((BColExtUser)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BColExtUser)et).getUpdUser(), (et, vl) -> ((BColExtUser)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BColExtUser)et).getUpdProcess(), (et, vl) -> ((BColExtUser)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BColExtUser)et).getBItem(), (et, vl) -> ((BColExtUser)et).setBItem((BItem)vl), "BItem");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_COL_EXT_USER";
    protected final String _tableDispName = "B_COL_EXT_USER";
    protected final String _tablePropertyName = "BColExtUser";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_COL_EXT_USER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnColExtUserId = cci("COL_EXT_USER_ID", "COL_EXT_USER_ID", null, null, Long.class, "colExtUserId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemId = cci("ITEM_ID", "ITEM_ID", null, null, Long.class, "itemId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BItem", null, null, false);
    protected final ColumnInfo _columnColCd = cci("COL_CD", "COL_CD", null, null, String.class, "colCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnColOrder = cci("COL_ORDER", "COL_ORDER", null, null, Long.class, "colOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnColWidth = cci("COL_WIDTH", "COL_WIDTH", null, null, Long.class, "colWidth", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * COL_EXT_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColExtUserId() { return _columnColExtUserId; }
    /**
     * ITEM_ID: {UQ+, NotNull, bigint(19), FK to B_ITEM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemId() { return _columnItemId; }
    /**
     * COL_CD: {+UQ, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColCd() { return _columnColCd; }
    /**
     * USER_ID: {+UQ, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * COL_ORDER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColOrder() { return _columnColOrder; }
    /**
     * COL_WIDTH: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnColWidth() { return _columnColWidth; }
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
        ls.add(columnColExtUserId());
        ls.add(columnItemId());
        ls.add(columnColCd());
        ls.add(columnUserId());
        ls.add(columnColOrder());
        ls.add(columnColWidth());
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
    protected UniqueInfo cpui() { return hpcpui(columnColExtUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnItemId());
        ls.add(columnColCd());
        ls.add(columnUserId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * B_ITEM by my ITEM_ID, named 'BItem'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBItem() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnItemId(), BItemDbm.getInstance().columnItemId());
        return cfi("B_COL_EXT_USER_FK1", "BItem", this, BItemDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BColExtUserList", false);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BColExtUser"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BColExtUserCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BColExtUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BColExtUser> getEntityType() { return BColExtUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BColExtUser newEntity() { return new BColExtUser(); }
    public BColExtUser newMyEntity() { return new BColExtUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BColExtUser)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BColExtUser)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

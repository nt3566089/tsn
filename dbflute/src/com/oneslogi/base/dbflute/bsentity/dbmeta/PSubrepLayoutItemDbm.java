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
 * The DB meta of P_SUBREP_LAYOUT_ITEM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PSubrepLayoutItemDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PSubrepLayoutItemDbm _instance = new PSubrepLayoutItemDbm();
    private PSubrepLayoutItemDbm() {}
    public static PSubrepLayoutItemDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getSubrepLayoutItemId(), (et, vl) -> ((PSubrepLayoutItem)et).setSubrepLayoutItemId(ctl(vl)), "subrepLayoutItemId");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getSubrepLayoutId(), (et, vl) -> ((PSubrepLayoutItem)et).setSubrepLayoutId(ctl(vl)), "subrepLayoutId");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getItemCd(), (et, vl) -> ((PSubrepLayoutItem)et).setItemCd((String)vl), "itemCd");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getDictId(), (et, vl) -> ((PSubrepLayoutItem)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getItemType(), (et, vl) -> ((PSubrepLayoutItem)et).setItemType((String)vl), "itemType");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getVisible(), (et, vl) -> ((PSubrepLayoutItem)et).setVisible((String)vl), "visible");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getItemFormat(), (et, vl) -> ((PSubrepLayoutItem)et).setItemFormat((String)vl), "itemFormat");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getDelFlg(), (et, vl) -> ((PSubrepLayoutItem)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getVersionNo(), (et, vl) -> ((PSubrepLayoutItem)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getControlNo(), (et, vl) -> ((PSubrepLayoutItem)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getAddDt(), (et, vl) -> ((PSubrepLayoutItem)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getAddUser(), (et, vl) -> ((PSubrepLayoutItem)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getAddProcess(), (et, vl) -> ((PSubrepLayoutItem)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getUpdDt(), (et, vl) -> ((PSubrepLayoutItem)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getUpdUser(), (et, vl) -> ((PSubrepLayoutItem)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PSubrepLayoutItem)et).getUpdProcess(), (et, vl) -> ((PSubrepLayoutItem)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PSubrepLayoutItem)et).getPSubrepLayout(), (et, vl) -> ((PSubrepLayoutItem)et).setPSubrepLayout((PSubrepLayout)vl), "PSubrepLayout");
        setupEfpg(_efpgMap, et -> ((PSubrepLayoutItem)et).getBDict(), (et, vl) -> ((PSubrepLayoutItem)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((PSubrepLayoutItem)et).getVDict(), (et, vl) -> ((PSubrepLayoutItem)et).setVDict((VDict)vl), "VDict");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_SUBREP_LAYOUT_ITEM";
    protected final String _tableDispName = "P_SUBREP_LAYOUT_ITEM";
    protected final String _tablePropertyName = "PSubrepLayoutItem";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_SUBREP_LAYOUT_ITEM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSubrepLayoutItemId = cci("SUBREP_LAYOUT_ITEM_ID", "SUBREP_LAYOUT_ITEM_ID", null, null, Long.class, "subrepLayoutItemId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubrepLayoutId = cci("SUBREP_LAYOUT_ID", "SUBREP_LAYOUT_ID", null, null, Long.class, "subrepLayoutId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "PSubrepLayout", null, null, false);
    protected final ColumnInfo _columnItemCd = cci("ITEM_CD", "ITEM_CD", null, null, String.class, "itemCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BDict,VDict", null, null, false);
    protected final ColumnInfo _columnItemType = cci("ITEM_TYPE", "ITEM_TYPE", null, null, String.class, "itemType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVisible = cci("VISIBLE", "VISIBLE", null, null, String.class, "visible", null, false, false, true, "char", 1, 0, null, "1", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemFormat = cci("ITEM_FORMAT", "ITEM_FORMAT", null, null, String.class, "itemFormat", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * SUBREP_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubrepLayoutItemId() { return _columnSubrepLayoutItemId; }
    /**
     * SUBREP_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_SUBREP_LAYOUT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubrepLayoutId() { return _columnSubrepLayoutId; }
    /**
     * ITEM_CD: {+UQ, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemCd() { return _columnItemCd; }
    /**
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * ITEM_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemType() { return _columnItemType; }
    /**
     * VISIBLE: {NotNull, char(1), default=[1]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVisible() { return _columnVisible; }
    /**
     * ITEM_FORMAT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemFormat() { return _columnItemFormat; }
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
        ls.add(columnSubrepLayoutItemId());
        ls.add(columnSubrepLayoutId());
        ls.add(columnItemCd());
        ls.add(columnDictId());
        ls.add(columnItemType());
        ls.add(columnVisible());
        ls.add(columnItemFormat());
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
    protected UniqueInfo cpui() { return hpcpui(columnSubrepLayoutItemId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnSubrepLayoutId());
        ls.add(columnItemCd());
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
     * P_SUBREP_LAYOUT by my SUBREP_LAYOUT_ID, named 'PSubrepLayout'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPSubrepLayout() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSubrepLayoutId(), PSubrepLayoutDbm.getInstance().columnSubrepLayoutId());
        return cfi("P_SUBREP_LAYOUT_ITEM_FK2", "PSubrepLayout", this, PSubrepLayoutDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "PSubrepLayoutItemList", false);
    }
    /**
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BDictDbm.getInstance().columnDictId());
        return cfi("P_SUBREP_LAYOUT_ITEM_FK1", "BDict", this, BDictDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "PSubrepLayoutItemList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_M_P_SUBREP_LAYOUT_ITEM_ID", "VDict", this, VDictDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PSubrepLayoutItem"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PSubrepLayoutItemCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PSubrepLayoutItemBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PSubrepLayoutItem> getEntityType() { return PSubrepLayoutItem.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PSubrepLayoutItem newEntity() { return new PSubrepLayoutItem(); }
    public PSubrepLayoutItem newMyEntity() { return new PSubrepLayoutItem(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PSubrepLayoutItem)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PSubrepLayoutItem)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

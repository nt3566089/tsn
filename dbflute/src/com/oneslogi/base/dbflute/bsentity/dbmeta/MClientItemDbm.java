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
 * The DB meta of M_CLIENT_ITEM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MClientItemDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MClientItemDbm _instance = new MClientItemDbm();
    private MClientItemDbm() {}
    public static MClientItemDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MClientItem)et).getClientItemId(), (et, vl) -> ((MClientItem)et).setClientItemId(ctl(vl)), "clientItemId");
        setupEpg(_epgMap, et -> ((MClientItem)et).getClientId(), (et, vl) -> ((MClientItem)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((MClientItem)et).getItemId(), (et, vl) -> ((MClientItem)et).setItemId(ctl(vl)), "itemId");
        setupEpg(_epgMap, et -> ((MClientItem)et).getDictId(), (et, vl) -> ((MClientItem)et).setDictId(ctl(vl)), "dictId");
        setupEpg(_epgMap, et -> ((MClientItem)et).getVisible(), (et, vl) -> ((MClientItem)et).setVisible((String)vl), "visible");
        setupEpg(_epgMap, et -> ((MClientItem)et).getEditable(), (et, vl) -> ((MClientItem)et).setEditable((String)vl), "editable");
        setupEpg(_epgMap, et -> ((MClientItem)et).getNecessary(), (et, vl) -> ((MClientItem)et).setNecessary((String)vl), "necessary");
        setupEpg(_epgMap, et -> ((MClientItem)et).getDelFlg(), (et, vl) -> ((MClientItem)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MClientItem)et).getVersionNo(), (et, vl) -> ((MClientItem)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MClientItem)et).getControlNo(), (et, vl) -> ((MClientItem)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MClientItem)et).getAddDt(), (et, vl) -> ((MClientItem)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MClientItem)et).getAddUser(), (et, vl) -> ((MClientItem)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MClientItem)et).getAddProcess(), (et, vl) -> ((MClientItem)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MClientItem)et).getUpdDt(), (et, vl) -> ((MClientItem)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MClientItem)et).getUpdUser(), (et, vl) -> ((MClientItem)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MClientItem)et).getUpdProcess(), (et, vl) -> ((MClientItem)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MClientItem)et).getBItem(), (et, vl) -> ((MClientItem)et).setBItem((BItem)vl), "BItem");
        setupEfpg(_efpgMap, et -> ((MClientItem)et).getMClient(), (et, vl) -> ((MClientItem)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((MClientItem)et).getBDict(), (et, vl) -> ((MClientItem)et).setBDict((BDict)vl), "BDict");
        setupEfpg(_efpgMap, et -> ((MClientItem)et).getVDict(), (et, vl) -> ((MClientItem)et).setVDict((VDict)vl), "VDict");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CLIENT_ITEM";
    protected final String _tableDispName = "M_CLIENT_ITEM";
    protected final String _tablePropertyName = "MClientItem";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CLIENT_ITEM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientItemId = cci("CLIENT_ITEM_ID", "CLIENT_ITEM_ID", null, null, Long.class, "clientItemId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnItemId = cci("ITEM_ID", "ITEM_ID", null, null, Long.class, "itemId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BItem", null, null, false);
    protected final ColumnInfo _columnDictId = cci("DICT_ID", "DICT_ID", null, null, Long.class, "dictId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BDict,VDict", null, null, false);
    protected final ColumnInfo _columnVisible = cci("VISIBLE", "VISIBLE", null, null, String.class, "visible", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEditable = cci("EDITABLE", "EDITABLE", null, null, String.class, "editable", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNecessary = cci("NECESSARY", "NECESSARY", null, null, String.class, "necessary", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * CLIENT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientItemId() { return _columnClientItemId; }
    /**
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * ITEM_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ITEM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemId() { return _columnItemId; }
    /**
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDictId() { return _columnDictId; }
    /**
     * VISIBLE: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVisible() { return _columnVisible; }
    /**
     * EDITABLE: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEditable() { return _columnEditable; }
    /**
     * NECESSARY: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNecessary() { return _columnNecessary; }
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
        ls.add(columnClientItemId());
        ls.add(columnClientId());
        ls.add(columnItemId());
        ls.add(columnDictId());
        ls.add(columnVisible());
        ls.add(columnEditable());
        ls.add(columnNecessary());
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
    protected UniqueInfo cpui() { return hpcpui(columnClientItemId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnClientId());
        ls.add(columnItemId());
        ls.add(columnDictId());
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
        return cfi("M_CLIENT_ITEM_FK1", "BItem", this, BItemDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MClientItemList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("M_CLIENT_ITEM_FK3", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MClientItemList", false);
    }
    /**
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), BDictDbm.getInstance().columnDictId());
        return cfi("M_CLIENT_ITEM_FK2", "BDict", this, BDictDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "MClientItemList", false);
    }
    /**
     * V_DICT by my DICT_ID, named 'VDict'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVDict() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDictId(), VDictDbm.getInstance().columnDictId());
        return cfi("FK_M_CLIENT_ITEM_ID", "VDict", this, VDictDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.CULTURE_ID = /*$$locationBase$$.parameterMapVDict.cultureId*/null", newArrayList("cultureId"), false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MClientItem"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MClientItemCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MClientItemBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MClientItem> getEntityType() { return MClientItem.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MClientItem newEntity() { return new MClientItem(); }
    public MClientItem newMyEntity() { return new MClientItem(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MClientItem)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MClientItem)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

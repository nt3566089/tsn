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
 * The DB meta of M_SET_STRUCTURE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MSetStructureDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MSetStructureDbm _instance = new MSetStructureDbm();
    private MSetStructureDbm() {}
    public static MSetStructureDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MSetStructure)et).getSetStructureId(), (et, vl) -> ((MSetStructure)et).setSetStructureId(ctl(vl)), "setStructureId");
        setupEpg(_epgMap, et -> ((MSetStructure)et).getSetParentId(), (et, vl) -> ((MSetStructure)et).setSetParentId(ctl(vl)), "setParentId");
        setupEpg(_epgMap, et -> ((MSetStructure)et).getProductId(), (et, vl) -> ((MSetStructure)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((MSetStructure)et).getUnitNum(), (et, vl) -> ((MSetStructure)et).setUnitNum(ctl(vl)), "unitNum");
        setupEpg(_epgMap, et -> ((MSetStructure)et).getDelFlg(), (et, vl) -> ((MSetStructure)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MSetStructure)et).getVersionNo(), (et, vl) -> ((MSetStructure)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MSetStructure)et).getControlNo(), (et, vl) -> ((MSetStructure)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MSetStructure)et).getAddDt(), (et, vl) -> ((MSetStructure)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MSetStructure)et).getAddUser(), (et, vl) -> ((MSetStructure)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MSetStructure)et).getAddProcess(), (et, vl) -> ((MSetStructure)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MSetStructure)et).getUpdDt(), (et, vl) -> ((MSetStructure)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MSetStructure)et).getUpdUser(), (et, vl) -> ((MSetStructure)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MSetStructure)et).getUpdProcess(), (et, vl) -> ((MSetStructure)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MSetStructure)et).getMProduct(), (et, vl) -> ((MSetStructure)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((MSetStructure)et).getMSetParent(), (et, vl) -> ((MSetStructure)et).setMSetParent((MSetParent)vl), "MSetParent");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_SET_STRUCTURE";
    protected final String _tableDispName = "M_SET_STRUCTURE";
    protected final String _tablePropertyName = "MSetStructure";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_SET_STRUCTURE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSetStructureId = cci("SET_STRUCTURE_ID", "SET_STRUCTURE_ID", null, null, Long.class, "setStructureId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSetParentId = cci("SET_PARENT_ID", "SET_PARENT_ID", null, null, Long.class, "setParentId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MSetParent", null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, Long.class, "unitNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * SET_STRUCTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSetStructureId() { return _columnSetStructureId; }
    /**
     * SET_PARENT_ID: {NotNull, bigint(19), FK to M_SET_PARENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSetParentId() { return _columnSetParentId; }
    /**
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * UNIT_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNum() { return _columnUnitNum; }
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
        ls.add(columnSetStructureId());
        ls.add(columnSetParentId());
        ls.add(columnProductId());
        ls.add(columnUnitNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnSetStructureId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("M_SET_STRUCTURE_FK2", "MProduct", this, MProductDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MSetStructureList", false);
    }
    /**
     * M_SET_PARENT by my SET_PARENT_ID, named 'MSetParent'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMSetParent() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSetParentId(), MSetParentDbm.getInstance().columnSetParentId());
        return cfi("M_SET_STRUCTURE_FK1", "MSetParent", this, MSetParentDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MSetStructureList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MSetStructure"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MSetStructureCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MSetStructureBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MSetStructure> getEntityType() { return MSetStructure.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MSetStructure newEntity() { return new MSetStructure(); }
    public MSetStructure newMyEntity() { return new MSetStructure(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MSetStructure)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MSetStructure)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

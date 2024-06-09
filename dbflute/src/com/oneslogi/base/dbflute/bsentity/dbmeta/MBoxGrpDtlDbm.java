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
 * The DB meta of M_BOX_GRP_DTL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MBoxGrpDtlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MBoxGrpDtlDbm _instance = new MBoxGrpDtlDbm();
    private MBoxGrpDtlDbm() {}
    public static MBoxGrpDtlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MBoxGrpDtl)et).getBoxGrpDtlId(), (et, vl) -> ((MBoxGrpDtl)et).setBoxGrpDtlId(ctl(vl)), "boxGrpDtlId");
        setupEpg(_epgMap, et -> ((MBoxGrpDtl)et).getBoxGrpId(), (et, vl) -> ((MBoxGrpDtl)et).setBoxGrpId(ctl(vl)), "boxGrpId");
        setupEpg(_epgMap, et -> ((MBoxGrpDtl)et).getBoxId(), (et, vl) -> ((MBoxGrpDtl)et).setBoxId(ctl(vl)), "boxId");
        setupEpg(_epgMap, et -> ((MBoxGrpDtl)et).getDelFlg(), (et, vl) -> ((MBoxGrpDtl)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MBoxGrpDtl)et).getVersionNo(), (et, vl) -> ((MBoxGrpDtl)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MBoxGrpDtl)et).getControlNo(), (et, vl) -> ((MBoxGrpDtl)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MBoxGrpDtl)et).getAddDt(), (et, vl) -> ((MBoxGrpDtl)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MBoxGrpDtl)et).getAddUser(), (et, vl) -> ((MBoxGrpDtl)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MBoxGrpDtl)et).getAddProcess(), (et, vl) -> ((MBoxGrpDtl)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MBoxGrpDtl)et).getUpdDt(), (et, vl) -> ((MBoxGrpDtl)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MBoxGrpDtl)et).getUpdUser(), (et, vl) -> ((MBoxGrpDtl)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MBoxGrpDtl)et).getUpdProcess(), (et, vl) -> ((MBoxGrpDtl)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MBoxGrpDtl)et).getMBoxGrp(), (et, vl) -> ((MBoxGrpDtl)et).setMBoxGrp((MBoxGrp)vl), "MBoxGrp");
        setupEfpg(_efpgMap, et -> ((MBoxGrpDtl)et).getMBox(), (et, vl) -> ((MBoxGrpDtl)et).setMBox((MBox)vl), "MBox");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_BOX_GRP_DTL";
    protected final String _tableDispName = "M_BOX_GRP_DTL";
    protected final String _tablePropertyName = "MBoxGrpDtl";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_BOX_GRP_DTL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBoxGrpDtlId = cci("BOX_GRP_DTL_ID", "BOX_GRP_DTL_ID", null, null, Long.class, "boxGrpDtlId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxGrpId = cci("BOX_GRP_ID", "BOX_GRP_ID", null, null, Long.class, "boxGrpId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MBoxGrp", null, null, false);
    protected final ColumnInfo _columnBoxId = cci("BOX_ID", "BOX_ID", null, null, Long.class, "boxId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MBox", null, null, false);
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
     * BOX_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxGrpDtlId() { return _columnBoxGrpDtlId; }
    /**
     * BOX_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to M_BOX_GRP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxGrpId() { return _columnBoxGrpId; }
    /**
     * BOX_ID: {+UQ, IX, NotNull, bigint(19), FK to M_BOX}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxId() { return _columnBoxId; }
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
        ls.add(columnBoxGrpDtlId());
        ls.add(columnBoxGrpId());
        ls.add(columnBoxId());
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
    protected UniqueInfo cpui() { return hpcpui(columnBoxGrpDtlId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnBoxGrpId());
        ls.add(columnBoxId());
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
     * M_BOX_GRP by my BOX_GRP_ID, named 'MBoxGrp'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMBoxGrp() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxGrpId(), MBoxGrpDbm.getInstance().columnBoxGrpId());
        return cfi("M_BOX_GRP_DTL_FK1", "MBoxGrp", this, MBoxGrpDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MBoxGrpDtlList", false);
    }
    /**
     * M_BOX by my BOX_ID, named 'MBox'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMBox() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxId(), MBoxDbm.getInstance().columnBoxId());
        return cfi("M_BOX_GRP_DTL_FK2", "MBox", this, MBoxDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MBoxGrpDtlList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MBoxGrpDtl"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MBoxGrpDtlCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MBoxGrpDtlBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MBoxGrpDtl> getEntityType() { return MBoxGrpDtl.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MBoxGrpDtl newEntity() { return new MBoxGrpDtl(); }
    public MBoxGrpDtl newMyEntity() { return new MBoxGrpDtl(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MBoxGrpDtl)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MBoxGrpDtl)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

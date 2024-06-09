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
 * The DB meta of T_PIC_MTHD_RCMD_DATA. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPicMthdRcmdDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPicMthdRcmdDataDbm _instance = new TPicMthdRcmdDataDbm();
    private TPicMthdRcmdDataDbm() {}
    public static TPicMthdRcmdDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TPicMthdRcmdData)et).getPicMthdRcmdDataId(), (et, vl) -> ((TPicMthdRcmdData)et).setPicMthdRcmdDataId(ctl(vl)), "picMthdRcmdDataId");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdData)et).getPickingHId(), (et, vl) -> ((TPicMthdRcmdData)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdData)et).getPicMthdRcmdId(), (et, vl) -> ((TPicMthdRcmdData)et).setPicMthdRcmdId(ctl(vl)), "picMthdRcmdId");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdData)et).getDelFlg(), (et, vl) -> ((TPicMthdRcmdData)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdData)et).getVersionNo(), (et, vl) -> ((TPicMthdRcmdData)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdData)et).getControlNo(), (et, vl) -> ((TPicMthdRcmdData)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdData)et).getAddDt(), (et, vl) -> ((TPicMthdRcmdData)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdData)et).getAddUser(), (et, vl) -> ((TPicMthdRcmdData)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdData)et).getAddProcess(), (et, vl) -> ((TPicMthdRcmdData)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdData)et).getUpdDt(), (et, vl) -> ((TPicMthdRcmdData)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdData)et).getUpdUser(), (et, vl) -> ((TPicMthdRcmdData)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdData)et).getUpdProcess(), (et, vl) -> ((TPicMthdRcmdData)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TPicMthdRcmdData)et).getTPickingH(), (et, vl) -> ((TPicMthdRcmdData)et).setTPickingH((TPickingH)vl), "TPickingH");
        setupEfpg(_efpgMap, et -> ((TPicMthdRcmdData)et).getTPicMthdRcmd(), (et, vl) -> ((TPicMthdRcmdData)et).setTPicMthdRcmd((TPicMthdRcmd)vl), "TPicMthdRcmd");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_PIC_MTHD_RCMD_DATA";
    protected final String _tableDispName = "T_PIC_MTHD_RCMD_DATA";
    protected final String _tablePropertyName = "TPicMthdRcmdData";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_PIC_MTHD_RCMD_DATA", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPicMthdRcmdDataId = cci("PIC_MTHD_RCMD_DATA_ID", "PIC_MTHD_RCMD_DATA_ID", null, null, Long.class, "picMthdRcmdDataId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TPickingH", null, null, false);
    protected final ColumnInfo _columnPicMthdRcmdId = cci("PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", null, null, Long.class, "picMthdRcmdId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TPicMthdRcmd", null, null, false);
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
     * PIC_MTHD_RCMD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicMthdRcmdDataId() { return _columnPicMthdRcmdDataId; }
    /**
     * PICKING_H_ID: {IX, NotNull, bigint(19), FK to T_PICKING_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
    /**
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicMthdRcmdId() { return _columnPicMthdRcmdId; }
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
        ls.add(columnPicMthdRcmdDataId());
        ls.add(columnPickingHId());
        ls.add(columnPicMthdRcmdId());
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
    protected UniqueInfo cpui() { return hpcpui(columnPicMthdRcmdDataId()); }
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
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPickingH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingHId(), TPickingHDbm.getInstance().columnPickingHId());
        return cfi("T_PIC_MTHD_RCMD_DATA_FK2", "TPickingH", this, TPickingHDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TPicMthdRcmdDataList", false);
    }
    /**
     * T_PIC_MTHD_RCMD by my PIC_MTHD_RCMD_ID, named 'TPicMthdRcmd'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPicMthdRcmd() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPicMthdRcmdId(), TPicMthdRcmdDbm.getInstance().columnPicMthdRcmdId());
        return cfi("T_PIC_MTHD_RCMD_DATA_FK1", "TPicMthdRcmd", this, TPicMthdRcmdDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TPicMthdRcmdDataList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TPicMthdRcmdData"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TPicMthdRcmdDataCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPicMthdRcmdData> getEntityType() { return TPicMthdRcmdData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TPicMthdRcmdData newEntity() { return new TPicMthdRcmdData(); }
    public TPicMthdRcmdData newMyEntity() { return new TPicMthdRcmdData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TPicMthdRcmdData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TPicMthdRcmdData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

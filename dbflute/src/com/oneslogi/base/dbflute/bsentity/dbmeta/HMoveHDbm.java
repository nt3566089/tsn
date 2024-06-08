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
 * The DB meta of H_MOVE_H. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class HMoveHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final HMoveHDbm _instance = new HMoveHDbm();
    private HMoveHDbm() {}
    public static HMoveHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((HMoveH)et).getMoveInstHId(), (et, vl) -> ((HMoveH)et).setMoveInstHId(ctl(vl)), "moveInstHId");
        setupEpg(_epgMap, et -> ((HMoveH)et).getHistDt(), (et, vl) -> ((HMoveH)et).setHistDt((String)vl), "histDt");
        setupEpg(_epgMap, et -> ((HMoveH)et).getClientId(), (et, vl) -> ((HMoveH)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((HMoveH)et).getClientCd(), (et, vl) -> ((HMoveH)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((HMoveH)et).getClientNm(), (et, vl) -> ((HMoveH)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((HMoveH)et).getCenterId(), (et, vl) -> ((HMoveH)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((HMoveH)et).getCenterCd(), (et, vl) -> ((HMoveH)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((HMoveH)et).getCenterNm(), (et, vl) -> ((HMoveH)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((HMoveH)et).getProcessTypeId(), (et, vl) -> ((HMoveH)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((HMoveH)et).getMoveInstComment(), (et, vl) -> ((HMoveH)et).setMoveInstComment((String)vl), "moveInstComment");
        setupEpg(_epgMap, et -> ((HMoveH)et).getDelFlg(), (et, vl) -> ((HMoveH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((HMoveH)et).getVersionNo(), (et, vl) -> ((HMoveH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((HMoveH)et).getControlNo(), (et, vl) -> ((HMoveH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((HMoveH)et).getAddDt(), (et, vl) -> ((HMoveH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((HMoveH)et).getAddUser(), (et, vl) -> ((HMoveH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((HMoveH)et).getAddProcess(), (et, vl) -> ((HMoveH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((HMoveH)et).getUpdDt(), (et, vl) -> ((HMoveH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((HMoveH)et).getUpdUser(), (et, vl) -> ((HMoveH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((HMoveH)et).getUpdProcess(), (et, vl) -> ((HMoveH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((HMoveH)et).getMProcessType(), (et, vl) -> ((HMoveH)et).setMProcessType((MProcessType)vl), "MProcessType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "H_MOVE_H";
    protected final String _tableDispName = "H_MOVE_H";
    protected final String _tablePropertyName = "HMoveH";
    protected final TableSqlName _tableSqlName = new TableSqlName("H_MOVE_H", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMoveInstHId = cci("MOVE_INST_H_ID", "MOVE_INST_H_ID", null, null, Long.class, "moveInstHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "HInventoryBList,HMoveBList", null, false);
    protected final ColumnInfo _columnHistDt = cci("HIST_DT", "HIST_DT", null, null, String.class, "histDt", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProcessType", null, null, false);
    protected final ColumnInfo _columnMoveInstComment = cci("MOVE_INST_COMMENT", "MOVE_INST_COMMENT", null, null, String.class, "moveInstComment", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * MOVE_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstHId() { return _columnMoveInstHId; }
    /**
     * HIST_DT: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHistDt() { return _columnHistDt; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeId() { return _columnProcessTypeId; }
    /**
     * MOVE_INST_COMMENT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstComment() { return _columnMoveInstComment; }
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
        ls.add(columnMoveInstHId());
        ls.add(columnHistDt());
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnProcessTypeId());
        ls.add(columnMoveInstComment());
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
    protected UniqueInfo cpui() { return hpcpui(columnMoveInstHId()); }
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
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProcessType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), MProcessTypeDbm.getInstance().columnProcessTypeId());
        return cfi("H_MOVE_H_FK1", "MProcessType", this, MProcessTypeDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "HMoveHList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * H_INVENTORY_B by MOVE_INST_H_ID, named 'HInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstHId(), HInventoryBDbm.getInstance().columnMoveInstHId());
        return cri("H_INVENTORY_B_FK5", "HInventoryBList", this, HInventoryBDbm.getInstance(), mp, false, "HMoveH");
    }
    /**
     * H_MOVE_B by MOVE_INST_H_ID, named 'HMoveBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHMoveBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstHId(), HMoveBDbm.getInstance().columnMoveInstHId());
        return cri("H_MOVE_B_FK2", "HMoveBList", this, HMoveBDbm.getInstance(), mp, false, "HMoveH");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.HMoveH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.HMoveHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.HMoveHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<HMoveH> getEntityType() { return HMoveH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public HMoveH newEntity() { return new HMoveH(); }
    public HMoveH newMyEntity() { return new HMoveH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((HMoveH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((HMoveH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

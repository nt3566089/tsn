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
 * The DB meta of T_MOVE_INST_H. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TMoveInstHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TMoveInstHDbm _instance = new TMoveInstHDbm();
    private TMoveInstHDbm() {}
    public static TMoveInstHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getMoveInstHId(), (et, vl) -> ((TMoveInstH)et).setMoveInstHId(ctl(vl)), "moveInstHId");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getClientId(), (et, vl) -> ((TMoveInstH)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getCenterId(), (et, vl) -> ((TMoveInstH)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getInstDt(), (et, vl) -> ((TMoveInstH)et).setInstDt((String)vl), "instDt");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getMoveSlipNo(), (et, vl) -> ((TMoveInstH)et).setMoveSlipNo((String)vl), "moveSlipNo");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getProcessTypeId(), (et, vl) -> ((TMoveInstH)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getMoveInstStatus(), (et, vl) -> ((TMoveInstH)et).setMoveInstStatus((String)vl), "moveInstStatus");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getInputType(), (et, vl) -> ((TMoveInstH)et).setInputType((String)vl), "inputType");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getMoveInstComment(), (et, vl) -> ((TMoveInstH)et).setMoveInstComment((String)vl), "moveInstComment");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getSourceBatchNo(), (et, vl) -> ((TMoveInstH)et).setSourceBatchNo((String)vl), "sourceBatchNo");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getDelFlg(), (et, vl) -> ((TMoveInstH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getVersionNo(), (et, vl) -> ((TMoveInstH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getControlNo(), (et, vl) -> ((TMoveInstH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getAddDt(), (et, vl) -> ((TMoveInstH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getAddUser(), (et, vl) -> ((TMoveInstH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getAddProcess(), (et, vl) -> ((TMoveInstH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getUpdDt(), (et, vl) -> ((TMoveInstH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getUpdUser(), (et, vl) -> ((TMoveInstH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TMoveInstH)et).getUpdProcess(), (et, vl) -> ((TMoveInstH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TMoveInstH)et).getMCenter(), (et, vl) -> ((TMoveInstH)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TMoveInstH)et).getMClient(), (et, vl) -> ((TMoveInstH)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TMoveInstH)et).getMProcessType(), (et, vl) -> ((TMoveInstH)et).setMProcessType((MProcessType)vl), "MProcessType");
        setupEfpg(_efpgMap, et -> ((TMoveInstH)et).getBClassDtlByInputType(), (et, vl) -> ((TMoveInstH)et).setBClassDtlByInputType((BClassDtl)vl), "BClassDtlByInputType");
        setupEfpg(_efpgMap, et -> ((TMoveInstH)et).getBClassDtlByMoveInstStatus(), (et, vl) -> ((TMoveInstH)et).setBClassDtlByMoveInstStatus((BClassDtl)vl), "BClassDtlByMoveInstStatus");
        setupEfpg(_efpgMap, et -> ((TMoveInstH)et).getTMoveInstRAsOne(), (et, vl) -> ((TMoveInstH)et).setTMoveInstRAsOne((TMoveInstR)vl), "TMoveInstRAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_MOVE_INST_H";
    protected final String _tableDispName = "T_MOVE_INST_H";
    protected final String _tablePropertyName = "TMoveInstH";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_MOVE_INST_H", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMoveInstHId = cci("MOVE_INST_H_ID", "MOVE_INST_H_ID", null, null, Long.class, "moveInstHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TInventoryBList,TMoveInstBList,TMoveRecordBList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnInstDt = cci("INST_DT", "INST_DT", null, null, String.class, "instDt", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveSlipNo = cci("MOVE_SLIP_NO", "MOVE_SLIP_NO", null, null, String.class, "moveSlipNo", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProcessType", null, null, false);
    protected final ColumnInfo _columnMoveInstStatus = cci("MOVE_INST_STATUS", "MOVE_INST_STATUS", null, null, String.class, "moveInstStatus", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByMoveInstStatus", null, CDef.DefMeta.MoveInstStatus, false);
    protected final ColumnInfo _columnInputType = cci("INPUT_TYPE", "INPUT_TYPE", null, null, String.class, "inputType", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByInputType", null, CDef.DefMeta.InputType, false);
    protected final ColumnInfo _columnMoveInstComment = cci("MOVE_INST_COMMENT", "MOVE_INST_COMMENT", null, null, String.class, "moveInstComment", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourceBatchNo = cci("SOURCE_BATCH_NO", "SOURCE_BATCH_NO", null, null, String.class, "sourceBatchNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * INST_DT: {IX, NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstDt() { return _columnInstDt; }
    /**
     * MOVE_SLIP_NO: {IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveSlipNo() { return _columnMoveSlipNo; }
    /**
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeId() { return _columnProcessTypeId; }
    /**
     * MOVE_INST_STATUS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstStatus() { return _columnMoveInstStatus; }
    /**
     * INPUT_TYPE: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=InputType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInputType() { return _columnInputType; }
    /**
     * MOVE_INST_COMMENT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstComment() { return _columnMoveInstComment; }
    /**
     * SOURCE_BATCH_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceBatchNo() { return _columnSourceBatchNo; }
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
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnInstDt());
        ls.add(columnMoveSlipNo());
        ls.add(columnProcessTypeId());
        ls.add(columnMoveInstStatus());
        ls.add(columnInputType());
        ls.add(columnMoveInstComment());
        ls.add(columnSourceBatchNo());
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
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_MOVE_INST_H_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TMoveInstHList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_MOVE_INST_H_FK3", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TMoveInstHList", false);
    }
    /**
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProcessType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), MProcessTypeDbm.getInstance().columnProcessTypeId());
        return cfi("T_MOVE_INST_H_FK1", "MProcessType", this, MProcessTypeDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TMoveInstHList", false);
    }
    /**
     * B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInputType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInputType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_MOVE_INST_H_INPUT_TYPE", "BClassDtlByInputType", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INPUT_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my MOVE_INST_STATUS, named 'BClassDtlByMoveInstStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByMoveInstStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_MOVE_INST_H_MOVE_INST_STATUS", "BClassDtlByMoveInstStatus", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'MOVE_INST_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * T_MOVE_INST_R by MOVE_INST_H_ID, named 'TMoveInstRAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTMoveInstRAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstHId(), TMoveInstRDbm.getInstance().columnMoveInstHId());
        return cfi("T_MOVE_INST_R_FK1", "TMoveInstRAsOne", this, TMoveInstRDbm.getInstance(), mp, 5, null, true, false, true, false, null, null, false, "TMoveInstH", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_INVENTORY_B by MOVE_INST_H_ID, named 'TInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstHId(), TInventoryBDbm.getInstance().columnMoveInstHId());
        return cri("T_INVENTORY_B_FK7", "TInventoryBList", this, TInventoryBDbm.getInstance(), mp, false, "TMoveInstH");
    }
    /**
     * T_MOVE_INST_B by MOVE_INST_H_ID, named 'TMoveInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstHId(), TMoveInstBDbm.getInstance().columnMoveInstHId());
        return cri("T_MOVE_INST_B_FK1", "TMoveInstBList", this, TMoveInstBDbm.getInstance(), mp, false, "TMoveInstH");
    }
    /**
     * T_MOVE_RECORD_B by MOVE_INST_H_ID, named 'TMoveRecordBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveRecordBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstHId(), TMoveRecordBDbm.getInstance().columnMoveInstHId());
        return cri("T_MOVE_RECORD_B_FK1", "TMoveRecordBList", this, TMoveRecordBDbm.getInstance(), mp, false, "TMoveInstH");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TMoveInstH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TMoveInstHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TMoveInstHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TMoveInstH> getEntityType() { return TMoveInstH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TMoveInstH newEntity() { return new TMoveInstH(); }
    public TMoveInstH newMyEntity() { return new TMoveInstH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TMoveInstH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TMoveInstH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

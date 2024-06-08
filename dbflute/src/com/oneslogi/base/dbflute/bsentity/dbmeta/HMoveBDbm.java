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
 * The DB meta of H_MOVE_B. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class HMoveBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final HMoveBDbm _instance = new HMoveBDbm();
    private HMoveBDbm() {}
    public static HMoveBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((HMoveB)et).getMoveRecordBId(), (et, vl) -> ((HMoveB)et).setMoveRecordBId(ctl(vl)), "moveRecordBId");
        setupEpg(_epgMap, et -> ((HMoveB)et).getMoveInstHId(), (et, vl) -> ((HMoveB)et).setMoveInstHId(ctl(vl)), "moveInstHId");
        setupEpg(_epgMap, et -> ((HMoveB)et).getInoutType(), (et, vl) -> ((HMoveB)et).setInoutType((String)vl), "inoutType");
        setupEpg(_epgMap, et -> ((HMoveB)et).getStockId(), (et, vl) -> ((HMoveB)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((HMoveB)et).getProcessNo(), (et, vl) -> ((HMoveB)et).setProcessNo((String)vl), "processNo");
        setupEpg(_epgMap, et -> ((HMoveB)et).getMoveDt(), (et, vl) -> ((HMoveB)et).setMoveDt((String)vl), "moveDt");
        setupEpg(_epgMap, et -> ((HMoveB)et).getMoveNum(), (et, vl) -> ((HMoveB)et).setMoveNum(ctb(vl)), "moveNum");
        setupEpg(_epgMap, et -> ((HMoveB)et).getDelFlg(), (et, vl) -> ((HMoveB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((HMoveB)et).getVersionNo(), (et, vl) -> ((HMoveB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((HMoveB)et).getControlNo(), (et, vl) -> ((HMoveB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((HMoveB)et).getAddDt(), (et, vl) -> ((HMoveB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((HMoveB)et).getAddUser(), (et, vl) -> ((HMoveB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((HMoveB)et).getAddProcess(), (et, vl) -> ((HMoveB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((HMoveB)et).getUpdDt(), (et, vl) -> ((HMoveB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((HMoveB)et).getUpdUser(), (et, vl) -> ((HMoveB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((HMoveB)et).getUpdProcess(), (et, vl) -> ((HMoveB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((HMoveB)et).getHMoveH(), (et, vl) -> ((HMoveB)et).setHMoveH((HMoveH)vl), "HMoveH");
        setupEfpg(_efpgMap, et -> ((HMoveB)et).getHStock(), (et, vl) -> ((HMoveB)et).setHStock((HStock)vl), "HStock");
        setupEfpg(_efpgMap, et -> ((HMoveB)et).getBClassDtlByInoutType(), (et, vl) -> ((HMoveB)et).setBClassDtlByInoutType((BClassDtl)vl), "BClassDtlByInoutType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "H_MOVE_B";
    protected final String _tableDispName = "H_MOVE_B";
    protected final String _tablePropertyName = "HMoveB";
    protected final TableSqlName _tableSqlName = new TableSqlName("H_MOVE_B", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMoveRecordBId = cci("MOVE_RECORD_B_ID", "MOVE_RECORD_B_ID", null, null, Long.class, "moveRecordBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveInstHId = cci("MOVE_INST_H_ID", "MOVE_INST_H_ID", null, null, Long.class, "moveInstHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "HMoveH", null, null, false);
    protected final ColumnInfo _columnInoutType = cci("INOUT_TYPE", "INOUT_TYPE", null, null, String.class, "inoutType", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByInoutType", null, CDef.DefMeta.InoutType, false);
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "HStock", null, null, false);
    protected final ColumnInfo _columnProcessNo = cci("PROCESS_NO", "PROCESS_NO", null, null, String.class, "processNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveDt = cci("MOVE_DT", "MOVE_DT", null, null, String.class, "moveDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveNum = cci("MOVE_NUM", "MOVE_NUM", null, null, java.math.BigDecimal.class, "moveNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * MOVE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveRecordBId() { return _columnMoveRecordBId; }
    /**
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to H_MOVE_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstHId() { return _columnMoveInstHId; }
    /**
     * INOUT_TYPE: {char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInoutType() { return _columnInoutType; }
    /**
     * STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * PROCESS_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessNo() { return _columnProcessNo; }
    /**
     * MOVE_DT: {IX, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveDt() { return _columnMoveDt; }
    /**
     * MOVE_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveNum() { return _columnMoveNum; }
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
        ls.add(columnMoveRecordBId());
        ls.add(columnMoveInstHId());
        ls.add(columnInoutType());
        ls.add(columnStockId());
        ls.add(columnProcessNo());
        ls.add(columnMoveDt());
        ls.add(columnMoveNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnMoveRecordBId()); }
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
     * H_MOVE_H by my MOVE_INST_H_ID, named 'HMoveH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignHMoveH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstHId(), HMoveHDbm.getInstance().columnMoveInstHId());
        return cfi("H_MOVE_B_FK2", "HMoveH", this, HMoveHDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "HMoveBList", false);
    }
    /**
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignHStock() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), HStockDbm.getInstance().columnStockId());
        return cfi("H_MOVE_B_FK1", "HStock", this, HStockDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "HMoveBList", false);
    }
    /**
     * B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInoutType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInoutType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_H_MOVE_B_INOUT_TYPE", "BClassDtlByInoutType", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INOUT_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.HMoveB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.HMoveBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.HMoveBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<HMoveB> getEntityType() { return HMoveB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public HMoveB newEntity() { return new HMoveB(); }
    public HMoveB newMyEntity() { return new HMoveB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((HMoveB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((HMoveB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

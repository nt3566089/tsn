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
 * The DB meta of T_MOVE_RECORD_B. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TMoveRecordBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TMoveRecordBDbm _instance = new TMoveRecordBDbm();
    private TMoveRecordBDbm() {}
    public static TMoveRecordBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getMoveRecordBId(), (et, vl) -> ((TMoveRecordB)et).setMoveRecordBId(ctl(vl)), "moveRecordBId");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getMoveInstHId(), (et, vl) -> ((TMoveRecordB)et).setMoveInstHId(ctl(vl)), "moveInstHId");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getMoveInstBId(), (et, vl) -> ((TMoveRecordB)et).setMoveInstBId(ctl(vl)), "moveInstBId");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getProcessNo(), (et, vl) -> ((TMoveRecordB)et).setProcessNo((String)vl), "processNo");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getLocationId(), (et, vl) -> ((TMoveRecordB)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getMoveDt(), (et, vl) -> ((TMoveRecordB)et).setMoveDt((String)vl), "moveDt");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getMoveNum(), (et, vl) -> ((TMoveRecordB)et).setMoveNum(ctb(vl)), "moveNum");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getStoreNoMergeFlg(), (et, vl) -> ((TMoveRecordB)et).setStoreNoMergeFlg((String)vl), "storeNoMergeFlg");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getAllShippingFlg(), (et, vl) -> ((TMoveRecordB)et).setAllShippingFlg((String)vl), "allShippingFlg");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getDelFlg(), (et, vl) -> ((TMoveRecordB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getVersionNo(), (et, vl) -> ((TMoveRecordB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getControlNo(), (et, vl) -> ((TMoveRecordB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getAddDt(), (et, vl) -> ((TMoveRecordB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getAddUser(), (et, vl) -> ((TMoveRecordB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getAddProcess(), (et, vl) -> ((TMoveRecordB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getUpdDt(), (et, vl) -> ((TMoveRecordB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getUpdUser(), (et, vl) -> ((TMoveRecordB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TMoveRecordB)et).getUpdProcess(), (et, vl) -> ((TMoveRecordB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TMoveRecordB)et).getMLocation(), (et, vl) -> ((TMoveRecordB)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((TMoveRecordB)et).getTMoveInstB(), (et, vl) -> ((TMoveRecordB)et).setTMoveInstB((TMoveInstB)vl), "TMoveInstB");
        setupEfpg(_efpgMap, et -> ((TMoveRecordB)et).getTMoveInstH(), (et, vl) -> ((TMoveRecordB)et).setTMoveInstH((TMoveInstH)vl), "TMoveInstH");
        setupEfpg(_efpgMap, et -> ((TMoveRecordB)et).getBClassDtlByAllShippingFlg(), (et, vl) -> ((TMoveRecordB)et).setBClassDtlByAllShippingFlg((BClassDtl)vl), "BClassDtlByAllShippingFlg");
        setupEfpg(_efpgMap, et -> ((TMoveRecordB)et).getBClassDtlByStoreNoMergeFlg(), (et, vl) -> ((TMoveRecordB)et).setBClassDtlByStoreNoMergeFlg((BClassDtl)vl), "BClassDtlByStoreNoMergeFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_MOVE_RECORD_B";
    protected final String _tableDispName = "T_MOVE_RECORD_B";
    protected final String _tablePropertyName = "TMoveRecordB";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_MOVE_RECORD_B", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMoveRecordBId = cci("MOVE_RECORD_B_ID", "MOVE_RECORD_B_ID", null, null, Long.class, "moveRecordBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TStockInoutList", null, false);
    protected final ColumnInfo _columnMoveInstHId = cci("MOVE_INST_H_ID", "MOVE_INST_H_ID", null, null, Long.class, "moveInstHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TMoveInstH", null, null, false);
    protected final ColumnInfo _columnMoveInstBId = cci("MOVE_INST_B_ID", "MOVE_INST_B_ID", null, null, Long.class, "moveInstBId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TMoveInstB", null, null, false);
    protected final ColumnInfo _columnProcessNo = cci("PROCESS_NO", "PROCESS_NO", null, null, String.class, "processNo", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnMoveDt = cci("MOVE_DT", "MOVE_DT", null, null, String.class, "moveDt", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveNum = cci("MOVE_NUM", "MOVE_NUM", null, null, java.math.BigDecimal.class, "moveNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreNoMergeFlg = cci("STORE_NO_MERGE_FLG", "STORE_NO_MERGE_FLG", null, null, String.class, "storeNoMergeFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByStoreNoMergeFlg", null, CDef.DefMeta.StoreNoMergeFlg, false);
    protected final ColumnInfo _columnAllShippingFlg = cci("ALL_SHIPPING_FLG", "ALL_SHIPPING_FLG", null, null, String.class, "allShippingFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByAllShippingFlg", null, CDef.DefMeta.AllShippingFlg, false);
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
     * MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstHId() { return _columnMoveInstHId; }
    /**
     * MOVE_INST_B_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_B}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstBId() { return _columnMoveInstBId; }
    /**
     * PROCESS_NO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessNo() { return _columnProcessNo; }
    /**
     * LOCATION_ID: {IX, bigint(19), FK to M_LOCATION}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * MOVE_DT: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveDt() { return _columnMoveDt; }
    /**
     * MOVE_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveNum() { return _columnMoveNum; }
    /**
     * STORE_NO_MERGE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNoMergeFlg() { return _columnStoreNoMergeFlg; }
    /**
     * ALL_SHIPPING_FLG: {char(1), FK to B_CLASS_DTL, classification=AllShippingFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllShippingFlg() { return _columnAllShippingFlg; }
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
        ls.add(columnMoveInstBId());
        ls.add(columnProcessNo());
        ls.add(columnLocationId());
        ls.add(columnMoveDt());
        ls.add(columnMoveNum());
        ls.add(columnStoreNoMergeFlg());
        ls.add(columnAllShippingFlg());
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
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("T_MOVE_RECORD_B_FK2", "MLocation", this, MLocationDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TMoveRecordBList", false);
    }
    /**
     * T_MOVE_INST_B by my MOVE_INST_B_ID, named 'TMoveInstB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTMoveInstB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstBId(), TMoveInstBDbm.getInstance().columnMoveInstBId());
        return cfi("T_MOVE_RECORD_B_FK3", "TMoveInstB", this, TMoveInstBDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TMoveRecordBList", false);
    }
    /**
     * T_MOVE_INST_H by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTMoveInstH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstHId(), TMoveInstHDbm.getInstance().columnMoveInstHId());
        return cfi("T_MOVE_RECORD_B_FK1", "TMoveInstH", this, TMoveInstHDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TMoveRecordBList", false);
    }
    /**
     * B_CLASS_DTL by my ALL_SHIPPING_FLG, named 'BClassDtlByAllShippingFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByAllShippingFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllShippingFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_MOVE_RECORD_B_ALL_SHIPPING_FLG", "BClassDtlByAllShippingFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ALL_SHIPPING_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my STORE_NO_MERGE_FLG, named 'BClassDtlByStoreNoMergeFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStoreNoMergeFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoMergeFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_MOVE_RECORD_B_STORE_NO_MERGE_FLG", "BClassDtlByStoreNoMergeFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'STORE_NO_MERGE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_STOCK_INOUT by MOVE_RECORD_B_ID, named 'TStockInoutList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockInoutList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveRecordBId(), TStockInoutDbm.getInstance().columnMoveRecordBId());
        return cri("T_STOCK_INOUT_FK2", "TStockInoutList", this, TStockInoutDbm.getInstance(), mp, false, "TMoveRecordB");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TMoveRecordB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TMoveRecordBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TMoveRecordBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TMoveRecordB> getEntityType() { return TMoveRecordB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TMoveRecordB newEntity() { return new TMoveRecordB(); }
    public TMoveRecordB newMyEntity() { return new TMoveRecordB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TMoveRecordB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TMoveRecordB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

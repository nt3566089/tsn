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
 * The DB meta of T_STOCK_INOUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TStockInoutDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TStockInoutDbm _instance = new TStockInoutDbm();
    private TStockInoutDbm() {}
    public static TStockInoutDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TStockInout)et).getStockInoutId(), (et, vl) -> ((TStockInout)et).setStockInoutId(ctl(vl)), "stockInoutId");
        setupEpg(_epgMap, et -> ((TStockInout)et).getFsStockInoutId(), (et, vl) -> ((TStockInout)et).setFsStockInoutId(ctl(vl)), "fsStockInoutId");
        setupEpg(_epgMap, et -> ((TStockInout)et).getBfStockInoutId(), (et, vl) -> ((TStockInout)et).setBfStockInoutId(ctl(vl)), "bfStockInoutId");
        setupEpg(_epgMap, et -> ((TStockInout)et).getMoveRecordBId(), (et, vl) -> ((TStockInout)et).setMoveRecordBId(ctl(vl)), "moveRecordBId");
        setupEpg(_epgMap, et -> ((TStockInout)et).getStoreRecordBId(), (et, vl) -> ((TStockInout)et).setStoreRecordBId(ctl(vl)), "storeRecordBId");
        setupEpg(_epgMap, et -> ((TStockInout)et).getAllocInstBId(), (et, vl) -> ((TStockInout)et).setAllocInstBId(ctl(vl)), "allocInstBId");
        setupEpg(_epgMap, et -> ((TStockInout)et).getProcessDt(), (et, vl) -> ((TStockInout)et).setProcessDt((String)vl), "processDt");
        setupEpg(_epgMap, et -> ((TStockInout)et).getProcessTypeId(), (et, vl) -> ((TStockInout)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((TStockInout)et).getProcessNo(), (et, vl) -> ((TStockInout)et).setProcessNo((String)vl), "processNo");
        setupEpg(_epgMap, et -> ((TStockInout)et).getCorrectType(), (et, vl) -> ((TStockInout)et).setCorrectType((String)vl), "correctType");
        setupEpg(_epgMap, et -> ((TStockInout)et).getStockId(), (et, vl) -> ((TStockInout)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((TStockInout)et).getInoutType(), (et, vl) -> ((TStockInout)et).setInoutType((String)vl), "inoutType");
        setupEpg(_epgMap, et -> ((TStockInout)et).getStockInoutNum(), (et, vl) -> ((TStockInout)et).setStockInoutNum(ctb(vl)), "stockInoutNum");
        setupEpg(_epgMap, et -> ((TStockInout)et).getDelFlg(), (et, vl) -> ((TStockInout)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TStockInout)et).getVersionNo(), (et, vl) -> ((TStockInout)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TStockInout)et).getControlNo(), (et, vl) -> ((TStockInout)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TStockInout)et).getAddDt(), (et, vl) -> ((TStockInout)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TStockInout)et).getAddUser(), (et, vl) -> ((TStockInout)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TStockInout)et).getAddProcess(), (et, vl) -> ((TStockInout)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TStockInout)et).getUpdDt(), (et, vl) -> ((TStockInout)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TStockInout)et).getUpdUser(), (et, vl) -> ((TStockInout)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TStockInout)et).getUpdProcess(), (et, vl) -> ((TStockInout)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TStockInout)et).getTAllocInstB(), (et, vl) -> ((TStockInout)et).setTAllocInstB((TAllocInstB)vl), "TAllocInstB");
        setupEfpg(_efpgMap, et -> ((TStockInout)et).getTStockInoutByBfStockInoutIdSelf(), (et, vl) -> ((TStockInout)et).setTStockInoutByBfStockInoutIdSelf((TStockInout)vl), "TStockInoutByBfStockInoutIdSelf");
        setupEfpg(_efpgMap, et -> ((TStockInout)et).getTStockInoutByFsStockInoutIdSelf(), (et, vl) -> ((TStockInout)et).setTStockInoutByFsStockInoutIdSelf((TStockInout)vl), "TStockInoutByFsStockInoutIdSelf");
        setupEfpg(_efpgMap, et -> ((TStockInout)et).getTMoveRecordB(), (et, vl) -> ((TStockInout)et).setTMoveRecordB((TMoveRecordB)vl), "TMoveRecordB");
        setupEfpg(_efpgMap, et -> ((TStockInout)et).getMProcessType(), (et, vl) -> ((TStockInout)et).setMProcessType((MProcessType)vl), "MProcessType");
        setupEfpg(_efpgMap, et -> ((TStockInout)et).getTStock(), (et, vl) -> ((TStockInout)et).setTStock((TStock)vl), "TStock");
        setupEfpg(_efpgMap, et -> ((TStockInout)et).getTStoreRecordB(), (et, vl) -> ((TStockInout)et).setTStoreRecordB((TStoreRecordB)vl), "TStoreRecordB");
        setupEfpg(_efpgMap, et -> ((TStockInout)et).getBClassDtlByCorrectType(), (et, vl) -> ((TStockInout)et).setBClassDtlByCorrectType((BClassDtl)vl), "BClassDtlByCorrectType");
        setupEfpg(_efpgMap, et -> ((TStockInout)et).getBClassDtlByInoutType(), (et, vl) -> ((TStockInout)et).setBClassDtlByInoutType((BClassDtl)vl), "BClassDtlByInoutType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_STOCK_INOUT";
    protected final String _tableDispName = "T_STOCK_INOUT";
    protected final String _tablePropertyName = "TStockInout";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_STOCK_INOUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStockInoutId = cci("STOCK_INOUT_ID", "STOCK_INOUT_ID", null, null, Long.class, "stockInoutId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TStockInoutByBfStockInoutIdSelfList,TStockInoutByFsStockInoutIdSelfList", null, false);
    protected final ColumnInfo _columnFsStockInoutId = cci("FS_STOCK_INOUT_ID", "FS_STOCK_INOUT_ID", null, null, Long.class, "fsStockInoutId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TStockInoutByFsStockInoutIdSelf", null, null, false);
    protected final ColumnInfo _columnBfStockInoutId = cci("BF_STOCK_INOUT_ID", "BF_STOCK_INOUT_ID", null, null, Long.class, "bfStockInoutId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TStockInoutByBfStockInoutIdSelf", null, null, false);
    protected final ColumnInfo _columnMoveRecordBId = cci("MOVE_RECORD_B_ID", "MOVE_RECORD_B_ID", null, null, Long.class, "moveRecordBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TMoveRecordB", null, null, false);
    protected final ColumnInfo _columnStoreRecordBId = cci("STORE_RECORD_B_ID", "STORE_RECORD_B_ID", null, null, Long.class, "storeRecordBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TStoreRecordB", null, null, false);
    protected final ColumnInfo _columnAllocInstBId = cci("ALLOC_INST_B_ID", "ALLOC_INST_B_ID", null, null, Long.class, "allocInstBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TAllocInstB", null, null, false);
    protected final ColumnInfo _columnProcessDt = cci("PROCESS_DT", "PROCESS_DT", null, null, String.class, "processDt", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProcessType", null, null, false);
    protected final ColumnInfo _columnProcessNo = cci("PROCESS_NO", "PROCESS_NO", null, null, String.class, "processNo", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCorrectType = cci("CORRECT_TYPE", "CORRECT_TYPE", null, null, String.class, "correctType", null, false, false, true, "char", 1, 0, null, null, false, null, null, "BClassDtlByCorrectType", null, CDef.DefMeta.CorrectType, false);
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TStock", null, null, false);
    protected final ColumnInfo _columnInoutType = cci("INOUT_TYPE", "INOUT_TYPE", null, null, String.class, "inoutType", null, false, false, true, "char", 1, 0, null, null, false, null, null, "BClassDtlByInoutType", null, CDef.DefMeta.InoutType, false);
    protected final ColumnInfo _columnStockInoutNum = cci("STOCK_INOUT_NUM", "STOCK_INOUT_NUM", null, null, java.math.BigDecimal.class, "stockInoutNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
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
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockInoutId() { return _columnStockInoutId; }
    /**
     * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFsStockInoutId() { return _columnFsStockInoutId; }
    /**
     * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBfStockInoutId() { return _columnBfStockInoutId; }
    /**
     * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveRecordBId() { return _columnMoveRecordBId; }
    /**
     * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRecordBId() { return _columnStoreRecordBId; }
    /**
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstBId() { return _columnAllocInstBId; }
    /**
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessDt() { return _columnProcessDt; }
    /**
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeId() { return _columnProcessTypeId; }
    /**
     * PROCESS_NO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessNo() { return _columnProcessNo; }
    /**
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorrectType() { return _columnCorrectType; }
    /**
     * STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInoutType() { return _columnInoutType; }
    /**
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockInoutNum() { return _columnStockInoutNum; }
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
        ls.add(columnStockInoutId());
        ls.add(columnFsStockInoutId());
        ls.add(columnBfStockInoutId());
        ls.add(columnMoveRecordBId());
        ls.add(columnStoreRecordBId());
        ls.add(columnAllocInstBId());
        ls.add(columnProcessDt());
        ls.add(columnProcessTypeId());
        ls.add(columnProcessNo());
        ls.add(columnCorrectType());
        ls.add(columnStockId());
        ls.add(columnInoutType());
        ls.add(columnStockInoutNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnStockInoutId()); }
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
     * T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTAllocInstB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstBId(), TAllocInstBDbm.getInstance().columnAllocInstBId());
        return cfi("T_STOCK_INOUT_FK5", "TAllocInstB", this, TAllocInstBDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TStockInoutList", false);
    }
    /**
     * T_STOCK_INOUT by my BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStockInoutByBfStockInoutIdSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBfStockInoutId(), TStockInoutDbm.getInstance().columnStockInoutId());
        return cfi("T_STOCK_INOUT_FK3", "TStockInoutByBfStockInoutIdSelf", this, TStockInoutDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TStockInoutByBfStockInoutIdSelfList", false);
    }
    /**
     * T_STOCK_INOUT by my FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStockInoutByFsStockInoutIdSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFsStockInoutId(), TStockInoutDbm.getInstance().columnStockInoutId());
        return cfi("T_STOCK_INOUT_FK6", "TStockInoutByFsStockInoutIdSelf", this, TStockInoutDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TStockInoutByFsStockInoutIdSelfList", false);
    }
    /**
     * T_MOVE_RECORD_B by my MOVE_RECORD_B_ID, named 'TMoveRecordB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTMoveRecordB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveRecordBId(), TMoveRecordBDbm.getInstance().columnMoveRecordBId());
        return cfi("T_STOCK_INOUT_FK2", "TMoveRecordB", this, TMoveRecordBDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TStockInoutList", false);
    }
    /**
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProcessType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), MProcessTypeDbm.getInstance().columnProcessTypeId());
        return cfi("T_STOCK_INOUT_FK1", "MProcessType", this, MProcessTypeDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TStockInoutList", false);
    }
    /**
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStock() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TStockDbm.getInstance().columnStockId());
        return cfi("T_STOCK_INOUT_FK4", "TStock", this, TStockDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "TStockInoutList", false);
    }
    /**
     * T_STORE_RECORD_B by my STORE_RECORD_B_ID, named 'TStoreRecordB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStoreRecordB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreRecordBId(), TStoreRecordBDbm.getInstance().columnStoreRecordBId());
        return cfi("T_STOCK_INOUT_FK7", "TStoreRecordB", this, TStoreRecordBDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "TStockInoutList", false);
    }
    /**
     * B_CLASS_DTL by my CORRECT_TYPE, named 'BClassDtlByCorrectType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCorrectType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCorrectType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_STOCK_INOUT_CORRECT_TYPE", "BClassDtlByCorrectType", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'CORRECT_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInoutType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInoutType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_STOCK_INOUT_INOUT_TYPE", "BClassDtlByInoutType", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INOUT_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_STOCK_INOUT by BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockInoutByBfStockInoutIdSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockInoutId(), TStockInoutDbm.getInstance().columnBfStockInoutId());
        return cri("T_STOCK_INOUT_FK3", "TStockInoutByBfStockInoutIdSelfList", this, TStockInoutDbm.getInstance(), mp, false, "TStockInoutByBfStockInoutIdSelf");
    }
    /**
     * T_STOCK_INOUT by FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockInoutByFsStockInoutIdSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockInoutId(), TStockInoutDbm.getInstance().columnFsStockInoutId());
        return cri("T_STOCK_INOUT_FK6", "TStockInoutByFsStockInoutIdSelfList", this, TStockInoutDbm.getInstance(), mp, false, "TStockInoutByFsStockInoutIdSelf");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TStockInout"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TStockInoutCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TStockInoutBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TStockInout> getEntityType() { return TStockInout.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TStockInout newEntity() { return new TStockInout(); }
    public TStockInout newMyEntity() { return new TStockInout(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TStockInout)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TStockInout)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

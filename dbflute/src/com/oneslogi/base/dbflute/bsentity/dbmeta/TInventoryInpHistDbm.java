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
 * The DB meta of T_INVENTORY_INP_HIST. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryInpHistDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TInventoryInpHistDbm _instance = new TInventoryInpHistDbm();
    private TInventoryInpHistDbm() {}
    public static TInventoryInpHistDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TInventoryInpHist)et).getInventoryInpHistId(), (et, vl) -> ((TInventoryInpHist)et).setInventoryInpHistId(ctl(vl)), "inventoryInpHistId");
        setupEpg(_epgMap, et -> ((TInventoryInpHist)et).getInputDt(), (et, vl) -> ((TInventoryInpHist)et).setInputDt(cttp(vl)), "inputDt");
        setupEpg(_epgMap, et -> ((TInventoryInpHist)et).getInventoryBId(), (et, vl) -> ((TInventoryInpHist)et).setInventoryBId(ctl(vl)), "inventoryBId");
        setupEpg(_epgMap, et -> ((TInventoryInpHist)et).getInventoryNum(), (et, vl) -> ((TInventoryInpHist)et).setInventoryNum(ctb(vl)), "inventoryNum");
        setupEpg(_epgMap, et -> ((TInventoryInpHist)et).getLastFlg(), (et, vl) -> ((TInventoryInpHist)et).setLastFlg((String)vl), "lastFlg");
        setupEpg(_epgMap, et -> ((TInventoryInpHist)et).getDelFlg(), (et, vl) -> ((TInventoryInpHist)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TInventoryInpHist)et).getVersionNo(), (et, vl) -> ((TInventoryInpHist)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TInventoryInpHist)et).getControlNo(), (et, vl) -> ((TInventoryInpHist)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TInventoryInpHist)et).getAddDt(), (et, vl) -> ((TInventoryInpHist)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TInventoryInpHist)et).getAddUser(), (et, vl) -> ((TInventoryInpHist)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TInventoryInpHist)et).getAddProcess(), (et, vl) -> ((TInventoryInpHist)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TInventoryInpHist)et).getUpdDt(), (et, vl) -> ((TInventoryInpHist)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TInventoryInpHist)et).getUpdUser(), (et, vl) -> ((TInventoryInpHist)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TInventoryInpHist)et).getUpdProcess(), (et, vl) -> ((TInventoryInpHist)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TInventoryInpHist)et).getTInventoryB(), (et, vl) -> ((TInventoryInpHist)et).setTInventoryB((TInventoryB)vl), "TInventoryB");
        setupEfpg(_efpgMap, et -> ((TInventoryInpHist)et).getBClassDtlByLastFlg(), (et, vl) -> ((TInventoryInpHist)et).setBClassDtlByLastFlg((BClassDtl)vl), "BClassDtlByLastFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_INVENTORY_INP_HIST";
    protected final String _tableDispName = "T_INVENTORY_INP_HIST";
    protected final String _tablePropertyName = "TInventoryInpHist";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_INVENTORY_INP_HIST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryInpHistId = cci("INVENTORY_INP_HIST_ID", "INVENTORY_INP_HIST_ID", null, null, Long.class, "inventoryInpHistId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInputDt = cci("INPUT_DT", "INPUT_DT", null, null, java.sql.Timestamp.class, "inputDt", null, false, false, true, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryBId = cci("INVENTORY_B_ID", "INVENTORY_B_ID", null, null, Long.class, "inventoryBId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TInventoryB", null, null, false);
    protected final ColumnInfo _columnInventoryNum = cci("INVENTORY_NUM", "INVENTORY_NUM", null, null, java.math.BigDecimal.class, "inventoryNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastFlg = cci("LAST_FLG", "LAST_FLG", null, null, String.class, "lastFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByLastFlg", null, CDef.DefMeta.LastFlg, false);
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
     * INVENTORY_INP_HIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryInpHistId() { return _columnInventoryInpHistId; }
    /**
     * INPUT_DT: {NotNull, datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInputDt() { return _columnInputDt; }
    /**
     * INVENTORY_B_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_B}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryBId() { return _columnInventoryBId; }
    /**
     * INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryNum() { return _columnInventoryNum; }
    /**
     * LAST_FLG: {char(1), FK to B_CLASS_DTL, classification=LastFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastFlg() { return _columnLastFlg; }
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
        ls.add(columnInventoryInpHistId());
        ls.add(columnInputDt());
        ls.add(columnInventoryBId());
        ls.add(columnInventoryNum());
        ls.add(columnLastFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnInventoryInpHistId()); }
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
     * T_INVENTORY_B by my INVENTORY_B_ID, named 'TInventoryB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTInventoryB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryBId(), TInventoryBDbm.getInstance().columnInventoryBId());
        return cfi("T_INVENTORY_INP_HIST_FK1", "TInventoryB", this, TInventoryBDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TInventoryInpHistList", false);
    }
    /**
     * B_CLASS_DTL by my LAST_FLG, named 'BClassDtlByLastFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLastFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLastFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_INVENTORY_INP_HIST_LAST_FLG", "BClassDtlByLastFlg", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LAST_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TInventoryInpHist"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TInventoryInpHistCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TInventoryInpHistBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TInventoryInpHist> getEntityType() { return TInventoryInpHist.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TInventoryInpHist newEntity() { return new TInventoryInpHist(); }
    public TInventoryInpHist newMyEntity() { return new TInventoryInpHist(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TInventoryInpHist)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TInventoryInpHist)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

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
 * The DB meta of T_PACKING_B. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPackingBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPackingBDbm _instance = new TPackingBDbm();
    private TPackingBDbm() {}
    public static TPackingBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TPackingB)et).getPackingBId(), (et, vl) -> ((TPackingB)et).setPackingBId(ctl(vl)), "packingBId");
        setupEpg(_epgMap, et -> ((TPackingB)et).getPackingHId(), (et, vl) -> ((TPackingB)et).setPackingHId(ctl(vl)), "packingHId");
        setupEpg(_epgMap, et -> ((TPackingB)et).getPickingBId(), (et, vl) -> ((TPackingB)et).setPickingBId(ctl(vl)), "pickingBId");
        setupEpg(_epgMap, et -> ((TPackingB)et).getAllocInstBId(), (et, vl) -> ((TPackingB)et).setAllocInstBId(ctl(vl)), "allocInstBId");
        setupEpg(_epgMap, et -> ((TPackingB)et).getPackingNum(), (et, vl) -> ((TPackingB)et).setPackingNum(ctb(vl)), "packingNum");
        setupEpg(_epgMap, et -> ((TPackingB)et).getPickingFlg(), (et, vl) -> ((TPackingB)et).setPickingFlg((String)vl), "pickingFlg");
        setupEpg(_epgMap, et -> ((TPackingB)et).getInspectionFlg(), (et, vl) -> ((TPackingB)et).setInspectionFlg((String)vl), "inspectionFlg");
        setupEpg(_epgMap, et -> ((TPackingB)et).getCasePickingNo(), (et, vl) -> ((TPackingB)et).setCasePickingNo((String)vl), "casePickingNo");
        setupEpg(_epgMap, et -> ((TPackingB)et).getDelFlg(), (et, vl) -> ((TPackingB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TPackingB)et).getVersionNo(), (et, vl) -> ((TPackingB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TPackingB)et).getControlNo(), (et, vl) -> ((TPackingB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TPackingB)et).getAddDt(), (et, vl) -> ((TPackingB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TPackingB)et).getAddUser(), (et, vl) -> ((TPackingB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TPackingB)et).getAddProcess(), (et, vl) -> ((TPackingB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TPackingB)et).getUpdDt(), (et, vl) -> ((TPackingB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TPackingB)et).getUpdUser(), (et, vl) -> ((TPackingB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TPackingB)et).getUpdProcess(), (et, vl) -> ((TPackingB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TPackingB)et).getTPickingB(), (et, vl) -> ((TPackingB)et).setTPickingB((TPickingB)vl), "TPickingB");
        setupEfpg(_efpgMap, et -> ((TPackingB)et).getTPackingH(), (et, vl) -> ((TPackingB)et).setTPackingH((TPackingH)vl), "TPackingH");
        setupEfpg(_efpgMap, et -> ((TPackingB)et).getTAllocInstB(), (et, vl) -> ((TPackingB)et).setTAllocInstB((TAllocInstB)vl), "TAllocInstB");
        setupEfpg(_efpgMap, et -> ((TPackingB)et).getBClassDtlByInspectionFlg(), (et, vl) -> ((TPackingB)et).setBClassDtlByInspectionFlg((BClassDtl)vl), "BClassDtlByInspectionFlg");
        setupEfpg(_efpgMap, et -> ((TPackingB)et).getBClassDtlByPickingFlg(), (et, vl) -> ((TPackingB)et).setBClassDtlByPickingFlg((BClassDtl)vl), "BClassDtlByPickingFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_PACKING_B";
    protected final String _tableDispName = "T_PACKING_B";
    protected final String _tablePropertyName = "TPackingB";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_PACKING_B", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPackingBId = cci("PACKING_B_ID", "PACKING_B_ID", null, null, Long.class, "packingBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingHId = cci("PACKING_H_ID", "PACKING_H_ID", null, null, Long.class, "packingHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TPackingH", null, null, false);
    protected final ColumnInfo _columnPickingBId = cci("PICKING_B_ID", "PICKING_B_ID", null, null, Long.class, "pickingBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TPickingB", null, null, false);
    protected final ColumnInfo _columnAllocInstBId = cci("ALLOC_INST_B_ID", "ALLOC_INST_B_ID", null, null, Long.class, "allocInstBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TAllocInstB", null, null, false);
    protected final ColumnInfo _columnPackingNum = cci("PACKING_NUM", "PACKING_NUM", null, null, java.math.BigDecimal.class, "packingNum", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingFlg = cci("PICKING_FLG", "PICKING_FLG", null, null, String.class, "pickingFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByPickingFlg", null, CDef.DefMeta.PickingFlg, false);
    protected final ColumnInfo _columnInspectionFlg = cci("INSPECTION_FLG", "INSPECTION_FLG", null, null, String.class, "inspectionFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByInspectionFlg", null, CDef.DefMeta.InspectionFlg, false);
    protected final ColumnInfo _columnCasePickingNo = cci("CASE_PICKING_NO", "CASE_PICKING_NO", null, null, String.class, "casePickingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * PACKING_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingBId() { return _columnPackingBId; }
    /**
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingHId() { return _columnPackingHId; }
    /**
     * PICKING_B_ID: {IX, bigint(19), FK to T_PICKING_B}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingBId() { return _columnPickingBId; }
    /**
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstBId() { return _columnAllocInstBId; }
    /**
     * PACKING_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum() { return _columnPackingNum; }
    /**
     * PICKING_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingFlg() { return _columnPickingFlg; }
    /**
     * INSPECTION_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectionFlg() { return _columnInspectionFlg; }
    /**
     * CASE_PICKING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasePickingNo() { return _columnCasePickingNo; }
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
        ls.add(columnPackingBId());
        ls.add(columnPackingHId());
        ls.add(columnPickingBId());
        ls.add(columnAllocInstBId());
        ls.add(columnPackingNum());
        ls.add(columnPickingFlg());
        ls.add(columnInspectionFlg());
        ls.add(columnCasePickingNo());
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
    protected UniqueInfo cpui() { return hpcpui(columnPackingBId()); }
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
     * T_PICKING_B by my PICKING_B_ID, named 'TPickingB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPickingB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingBId(), TPickingBDbm.getInstance().columnPickingBId());
        return cfi("T_PACKING_B_FK2", "TPickingB", this, TPickingBDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TPackingBList", false);
    }
    /**
     * T_PACKING_H by my PACKING_H_ID, named 'TPackingH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPackingH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingHId(), TPackingHDbm.getInstance().columnPackingHId());
        return cfi("T_PACKING_B_FK3", "TPackingH", this, TPackingHDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TPackingBList", false);
    }
    /**
     * T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTAllocInstB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstBId(), TAllocInstBDbm.getInstance().columnAllocInstBId());
        return cfi("T_PACKING_B_FK1", "TAllocInstB", this, TAllocInstBDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TPackingBList", false);
    }
    /**
     * B_CLASS_DTL by my INSPECTION_FLG, named 'BClassDtlByInspectionFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInspectionFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInspectionFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PACKING_B_INSPECTION_FLG", "BClassDtlByInspectionFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INSPECTION_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PICKING_FLG, named 'BClassDtlByPickingFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPickingFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PACKING_B_PICKING_FLG", "BClassDtlByPickingFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PICKING_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TPackingB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TPackingBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TPackingBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPackingB> getEntityType() { return TPackingB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TPackingB newEntity() { return new TPackingB(); }
    public TPackingB newMyEntity() { return new TPackingB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TPackingB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TPackingB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

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
 * The DB meta of P_REPORT_LAYOUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PReportLayoutDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PReportLayoutDbm _instance = new PReportLayoutDbm();
    private PReportLayoutDbm() {}
    public static PReportLayoutDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PReportLayout)et).getReportLayoutId(), (et, vl) -> ((PReportLayout)et).setReportLayoutId(ctl(vl)), "reportLayoutId");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getReportId(), (et, vl) -> ((PReportLayout)et).setReportId(ctl(vl)), "reportId");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getReportLayoutNm(), (et, vl) -> ((PReportLayout)et).setReportLayoutNm((String)vl), "reportLayoutNm");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getReportLayoutData(), (et, vl) -> ((PReportLayout)et).setReportLayoutData((String)vl), "reportLayoutData");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getUpdatable(), (et, vl) -> ((PReportLayout)et).setUpdatable((String)vl), "updatable");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getAttribute1(), (et, vl) -> ((PReportLayout)et).setAttribute1((String)vl), "attribute1");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getAttribute2(), (et, vl) -> ((PReportLayout)et).setAttribute2((String)vl), "attribute2");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getAttribute3(), (et, vl) -> ((PReportLayout)et).setAttribute3((String)vl), "attribute3");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getAttribute4(), (et, vl) -> ((PReportLayout)et).setAttribute4((String)vl), "attribute4");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getAttribute5(), (et, vl) -> ((PReportLayout)et).setAttribute5((String)vl), "attribute5");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getAutoPrintTargetFlg(), (et, vl) -> ((PReportLayout)et).setAutoPrintTargetFlg((String)vl), "autoPrintTargetFlg");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getDelFlg(), (et, vl) -> ((PReportLayout)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getVersionNo(), (et, vl) -> ((PReportLayout)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getControlNo(), (et, vl) -> ((PReportLayout)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getAddDt(), (et, vl) -> ((PReportLayout)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getAddUser(), (et, vl) -> ((PReportLayout)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getAddProcess(), (et, vl) -> ((PReportLayout)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getUpdDt(), (et, vl) -> ((PReportLayout)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getUpdUser(), (et, vl) -> ((PReportLayout)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PReportLayout)et).getUpdProcess(), (et, vl) -> ((PReportLayout)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PReportLayout)et).getPReport(), (et, vl) -> ((PReportLayout)et).setPReport((PReport)vl), "PReport");
        setupEfpg(_efpgMap, et -> ((PReportLayout)et).getBClassDtlByUpdatable(), (et, vl) -> ((PReportLayout)et).setBClassDtlByUpdatable((BClassDtl)vl), "BClassDtlByUpdatable");
        setupEfpg(_efpgMap, et -> ((PReportLayout)et).getBClassDtlByAutoPrintTargetFlg(), (et, vl) -> ((PReportLayout)et).setBClassDtlByAutoPrintTargetFlg((BClassDtl)vl), "BClassDtlByAutoPrintTargetFlg");
        setupEfpg(_efpgMap, et -> ((PReportLayout)et).getPLayoutPrintSettingAsOne(), (et, vl) -> ((PReportLayout)et).setPLayoutPrintSettingAsOne((PLayoutPrintSetting)vl), "PLayoutPrintSettingAsOne");
        setupEfpg(_efpgMap, et -> ((PReportLayout)et).getPSubrepLayoutAsOne(), (et, vl) -> ((PReportLayout)et).setPSubrepLayoutAsOne((PSubrepLayout)vl), "PSubrepLayoutAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_REPORT_LAYOUT";
    protected final String _tableDispName = "P_REPORT_LAYOUT";
    protected final String _tablePropertyName = "PReportLayout";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_REPORT_LAYOUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReportLayoutId = cci("REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", null, null, Long.class, "reportLayoutId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "PReportLayoutItemList,PUserAutoPrintSettingByReportLayoutIdList,PTerminalAutoPrintSetByReportLayoutIdList", null, false);
    protected final ColumnInfo _columnReportId = cci("REPORT_ID", "REPORT_ID", null, null, Long.class, "reportId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "PReport", null, null, false);
    protected final ColumnInfo _columnReportLayoutNm = cci("REPORT_LAYOUT_NM", "REPORT_LAYOUT_NM", null, null, String.class, "reportLayoutNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportLayoutData = cci("REPORT_LAYOUT_DATA", "REPORT_LAYOUT_DATA", null, null, String.class, "reportLayoutData", null, false, false, true, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatable = cci("UPDATABLE", "UPDATABLE", null, null, String.class, "updatable", null, false, false, true, "char", 1, 0, null, null, false, null, null, "BClassDtlByUpdatable", null, CDef.DefMeta.Updatable, false);
    protected final ColumnInfo _columnAttribute1 = cci("ATTRIBUTE1", "ATTRIBUTE1", null, null, String.class, "attribute1", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute2 = cci("ATTRIBUTE2", "ATTRIBUTE2", null, null, String.class, "attribute2", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute3 = cci("ATTRIBUTE3", "ATTRIBUTE3", null, null, String.class, "attribute3", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute4 = cci("ATTRIBUTE4", "ATTRIBUTE4", null, null, String.class, "attribute4", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute5 = cci("ATTRIBUTE5", "ATTRIBUTE5", null, null, String.class, "attribute5", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAutoPrintTargetFlg = cci("AUTO_PRINT_TARGET_FLG", "AUTO_PRINT_TARGET_FLG", null, null, String.class, "autoPrintTargetFlg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, "BClassDtlByAutoPrintTargetFlg", null, CDef.DefMeta.AutoPrintTargetFlg, false);
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
     * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportLayoutId() { return _columnReportLayoutId; }
    /**
     * REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportId() { return _columnReportId; }
    /**
     * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportLayoutNm() { return _columnReportLayoutNm; }
    /**
     * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportLayoutData() { return _columnReportLayoutData; }
    /**
     * UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdatable() { return _columnUpdatable; }
    /**
     * ATTRIBUTE1: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute1() { return _columnAttribute1; }
    /**
     * ATTRIBUTE2: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute2() { return _columnAttribute2; }
    /**
     * ATTRIBUTE3: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute3() { return _columnAttribute3; }
    /**
     * ATTRIBUTE4: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute4() { return _columnAttribute4; }
    /**
     * ATTRIBUTE5: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttribute5() { return _columnAttribute5; }
    /**
     * AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAutoPrintTargetFlg() { return _columnAutoPrintTargetFlg; }
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
        ls.add(columnReportLayoutId());
        ls.add(columnReportId());
        ls.add(columnReportLayoutNm());
        ls.add(columnReportLayoutData());
        ls.add(columnUpdatable());
        ls.add(columnAttribute1());
        ls.add(columnAttribute2());
        ls.add(columnAttribute3());
        ls.add(columnAttribute4());
        ls.add(columnAttribute5());
        ls.add(columnAutoPrintTargetFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnReportLayoutId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnReportId());
        ls.add(columnReportLayoutNm());
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
     * P_REPORT by my REPORT_ID, named 'PReport'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPReport() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReportId(), PReportDbm.getInstance().columnReportId());
        return cfi("P_REPORT_LAYOUT_FK1", "PReport", this, PReportDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "PReportLayoutList", false);
    }
    /**
     * B_CLASS_DTL by my UPDATABLE, named 'BClassDtlByUpdatable'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByUpdatable() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUpdatable(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_P_REPORT_LAYOUT_UPDATABLE", "BClassDtlByUpdatable", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'UPDATABLE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my AUTO_PRINT_TARGET_FLG, named 'BClassDtlByAutoPrintTargetFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByAutoPrintTargetFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAutoPrintTargetFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_P_REPORT_LAYOUT_AUTO_PRINT_TARGET_FLG", "BClassDtlByAutoPrintTargetFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'AUTO_PRINT_TARGET_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * P_LAYOUT_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PLayoutPrintSettingAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignPLayoutPrintSettingAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReportLayoutId(), PLayoutPrintSettingDbm.getInstance().columnReportLayoutId());
        return cfi("P_LAYOUT_PRINT_SETTING_FK4", "PLayoutPrintSettingAsOne", this, PLayoutPrintSettingDbm.getInstance(), mp, 3, null, true, false, true, false, null, null, false, "PReportLayout", false);
    }
    /**
     * P_SUBREP_LAYOUT by REPORT_LAYOUT_ID, named 'PSubrepLayoutAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignPSubrepLayoutAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReportLayoutId(), PSubrepLayoutDbm.getInstance().columnReportLayoutId());
        return cfi("P_SUBREP_LAYOUT_FK1", "PSubrepLayoutAsOne", this, PSubrepLayoutDbm.getInstance(), mp, 4, null, true, false, true, false, null, null, false, "PReportLayout", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * P_REPORT_LAYOUT_ITEM by REPORT_LAYOUT_ID, named 'PReportLayoutItemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPReportLayoutItemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReportLayoutId(), PReportLayoutItemDbm.getInstance().columnReportLayoutId());
        return cri("P_REPORT_LAYOUT_ITEM_FK2", "PReportLayoutItemList", this, PReportLayoutItemDbm.getInstance(), mp, false, "PReportLayout");
    }
    /**
     * P_USER_AUTO_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PUserAutoPrintSettingByReportLayoutIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPUserAutoPrintSettingByReportLayoutIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReportLayoutId(), PUserAutoPrintSettingDbm.getInstance().columnReportLayoutId());
        return cri("FK_P_USER_AUTO_PRINT_SETTING_TO_P_REPORT_LAYOUT_BY_REPORT_LAYOUT_ID", "PUserAutoPrintSettingByReportLayoutIdList", this, PUserAutoPrintSettingDbm.getInstance(), mp, false, "PReportLayoutByReportLayoutId");
    }
    /**
     * P_TERMINAL_AUTO_PRINT_SET by REPORT_LAYOUT_ID, named 'PTerminalAutoPrintSetByReportLayoutIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPTerminalAutoPrintSetByReportLayoutIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReportLayoutId(), PTerminalAutoPrintSetDbm.getInstance().columnReportLayoutId());
        return cri("FK_P_TERMINAL_AUTO_PRINT_SET_TO_P_REPORT_LAYOUT_BY_REPORT_LAYOUT_ID", "PTerminalAutoPrintSetByReportLayoutIdList", this, PTerminalAutoPrintSetDbm.getInstance(), mp, false, "PReportLayoutByReportLayoutId");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PReportLayout"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PReportLayoutCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PReportLayoutBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PReportLayout> getEntityType() { return PReportLayout.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PReportLayout newEntity() { return new PReportLayout(); }
    public PReportLayout newMyEntity() { return new PReportLayout(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PReportLayout)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PReportLayout)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

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
 * The DB meta of P_PRINTER_GROUP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PPrinterGroupDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PPrinterGroupDbm _instance = new PPrinterGroupDbm();
    private PPrinterGroupDbm() {}
    public static PPrinterGroupDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getPrinterGroupId(), (et, vl) -> ((PPrinterGroup)et).setPrinterGroupId(ctl(vl)), "printerGroupId");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getPrinterGroupNm(), (et, vl) -> ((PPrinterGroup)et).setPrinterGroupNm((String)vl), "printerGroupNm");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getAttribute1(), (et, vl) -> ((PPrinterGroup)et).setAttribute1((String)vl), "attribute1");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getAttribute2(), (et, vl) -> ((PPrinterGroup)et).setAttribute2((String)vl), "attribute2");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getAttribute3(), (et, vl) -> ((PPrinterGroup)et).setAttribute3((String)vl), "attribute3");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getAttribute4(), (et, vl) -> ((PPrinterGroup)et).setAttribute4((String)vl), "attribute4");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getAttribute5(), (et, vl) -> ((PPrinterGroup)et).setAttribute5((String)vl), "attribute5");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getDelFlg(), (et, vl) -> ((PPrinterGroup)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getVersionNo(), (et, vl) -> ((PPrinterGroup)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getControlNo(), (et, vl) -> ((PPrinterGroup)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getAddDt(), (et, vl) -> ((PPrinterGroup)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getAddUser(), (et, vl) -> ((PPrinterGroup)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getAddProcess(), (et, vl) -> ((PPrinterGroup)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getUpdDt(), (et, vl) -> ((PPrinterGroup)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getUpdUser(), (et, vl) -> ((PPrinterGroup)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PPrinterGroup)et).getUpdProcess(), (et, vl) -> ((PPrinterGroup)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_PRINTER_GROUP";
    protected final String _tableDispName = "P_PRINTER_GROUP";
    protected final String _tablePropertyName = "PPrinterGroup";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_PRINTER_GROUP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrinterGroupId = cci("PRINTER_GROUP_ID", "PRINTER_GROUP_ID", null, null, Long.class, "printerGroupId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "PLayoutPrintSettingList,PPrinterList,PUserAutoPrintSettingByPrinterGroupIdList,PTerminalAutoPrintSetByPrinterGroupIdList", null, false);
    protected final ColumnInfo _columnPrinterGroupNm = cci("PRINTER_GROUP_NM", "PRINTER_GROUP_NM", null, null, String.class, "printerGroupNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute1 = cci("ATTRIBUTE1", "ATTRIBUTE1", null, null, String.class, "attribute1", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute2 = cci("ATTRIBUTE2", "ATTRIBUTE2", null, null, String.class, "attribute2", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute3 = cci("ATTRIBUTE3", "ATTRIBUTE3", null, null, String.class, "attribute3", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute4 = cci("ATTRIBUTE4", "ATTRIBUTE4", null, null, String.class, "attribute4", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttribute5 = cci("ATTRIBUTE5", "ATTRIBUTE5", null, null, String.class, "attribute5", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
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
     * PRINTER_GROUP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterGroupId() { return _columnPrinterGroupId; }
    /**
     * PRINTER_GROUP_NM: {UQ, NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterGroupNm() { return _columnPrinterGroupNm; }
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
        ls.add(columnPrinterGroupId());
        ls.add(columnPrinterGroupNm());
        ls.add(columnAttribute1());
        ls.add(columnAttribute2());
        ls.add(columnAttribute3());
        ls.add(columnAttribute4());
        ls.add(columnAttribute5());
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
    protected UniqueInfo cpui() { return hpcpui(columnPrinterGroupId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnPrinterGroupNm()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * P_LAYOUT_PRINT_SETTING by PRINTER_GROUP_ID, named 'PLayoutPrintSettingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPLayoutPrintSettingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterGroupId(), PLayoutPrintSettingDbm.getInstance().columnPrinterGroupId());
        return cri("P_LAYOUT_PRINT_SETTING_FK2", "PLayoutPrintSettingList", this, PLayoutPrintSettingDbm.getInstance(), mp, false, "PPrinterGroup");
    }
    /**
     * P_PRINTER by PRINTER_GROUP_ID, named 'PPrinterList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPPrinterList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterGroupId(), PPrinterDbm.getInstance().columnPrinterGroupId());
        return cri("P_PRINTER_FK1", "PPrinterList", this, PPrinterDbm.getInstance(), mp, false, "PPrinterGroup");
    }
    /**
     * P_USER_AUTO_PRINT_SETTING by PRINTER_GROUP_ID, named 'PUserAutoPrintSettingByPrinterGroupIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPUserAutoPrintSettingByPrinterGroupIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterGroupId(), PUserAutoPrintSettingDbm.getInstance().columnPrinterGroupId());
        return cri("FK_P_USER_AUTO_PRINT_SETTING_TO_P_PRINTER_GROUP_BY_P_PRINTER_GROUP_ID", "PUserAutoPrintSettingByPrinterGroupIdList", this, PUserAutoPrintSettingDbm.getInstance(), mp, false, "PPrinterGroupByPrinterGroupId");
    }
    /**
     * P_TERMINAL_AUTO_PRINT_SET by PRINTER_GROUP_ID, named 'PTerminalAutoPrintSetByPrinterGroupIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPTerminalAutoPrintSetByPrinterGroupIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterGroupId(), PTerminalAutoPrintSetDbm.getInstance().columnPrinterGroupId());
        return cri("FK_P_TERMINAL_AUTO_PRINT_SET_TO_P_PRINTER_GROUP_BY_P_PRINTER_GROUP_ID", "PTerminalAutoPrintSetByPrinterGroupIdList", this, PTerminalAutoPrintSetDbm.getInstance(), mp, false, "PPrinterGroupByPrinterGroupId");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PPrinterGroup"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PPrinterGroupCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PPrinterGroupBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PPrinterGroup> getEntityType() { return PPrinterGroup.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PPrinterGroup newEntity() { return new PPrinterGroup(); }
    public PPrinterGroup newMyEntity() { return new PPrinterGroup(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PPrinterGroup)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PPrinterGroup)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

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
 * The DB meta of T_TRPICKLISTEXP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrpicklistexpDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrpicklistexpDbm _instance = new TTrpicklistexpDbm();
    private TTrpicklistexpDbm() {}
    public static TTrpicklistexpDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getTTrpicklistexpId(), (et, vl) -> ((TTrpicklistexp)et).setTTrpicklistexpId(ctl(vl)), "TTrpicklistexpId");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getTTrpicklistId(), (et, vl) -> ((TTrpicklistexp)et).setTTrpicklistId(ctl(vl)), "TTrpicklistId");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getPicklistKey(), (et, vl) -> ((TTrpicklistexp)et).setPicklistKey(ctl(vl)), "picklistKey");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getPicklistGNo(), (et, vl) -> ((TTrpicklistexp)et).setPicklistGNo(ctl(vl)), "picklistGNo");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getCaseCd(), (et, vl) -> ((TTrpicklistexp)et).setCaseCd(ctl(vl)), "caseCd");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getDummyCaseKbn(), (et, vl) -> ((TTrpicklistexp)et).setDummyCaseKbn((String)vl), "dummyCaseKbn");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getReadSdKbn(), (et, vl) -> ((TTrpicklistexp)et).setReadSdKbn((String)vl), "readSdKbn");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getDelFlg(), (et, vl) -> ((TTrpicklistexp)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getVersionNo(), (et, vl) -> ((TTrpicklistexp)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getControlNo(), (et, vl) -> ((TTrpicklistexp)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getAddDt(), (et, vl) -> ((TTrpicklistexp)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getAddUser(), (et, vl) -> ((TTrpicklistexp)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getAddProcess(), (et, vl) -> ((TTrpicklistexp)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getUpdDt(), (et, vl) -> ((TTrpicklistexp)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getUpdUser(), (et, vl) -> ((TTrpicklistexp)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrpicklistexp)et).getUpdProcess(), (et, vl) -> ((TTrpicklistexp)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrpicklistexp)et).getTTrPicklist(), (et, vl) -> ((TTrpicklistexp)et).setTTrPicklist((TTrPicklist)vl), "TTrPicklist");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRPICKLISTEXP";
    protected final String _tableDispName = "T_TRPICKLISTEXP";
    protected final String _tablePropertyName = "TTrpicklistexp";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRPICKLISTEXP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTTrpicklistexpId = cci("T_TRPICKLISTEXP_ID", "T_TRPICKLISTEXP_ID", null, null, Long.class, "TTrpicklistexpId", null, true, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTTrpicklistId = cci("T_TRPICKLIST_ID", "T_TRPICKLIST_ID", null, null, Long.class, "TTrpicklistId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TTrPicklist", null, null, false);
    protected final ColumnInfo _columnPicklistKey = cci("PICKLIST_KEY", "PICKLIST_KEY", null, null, Long.class, "picklistKey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicklistGNo = cci("PICKLIST_G_NO", "PICKLIST_G_NO", null, null, Long.class, "picklistGNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseCd = cci("CASE_CD", "CASE_CD", null, null, Long.class, "caseCd", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDummyCaseKbn = cci("DUMMY_CASE_KBN", "DUMMY_CASE_KBN", null, null, String.class, "dummyCaseKbn", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReadSdKbn = cci("READ_SD_KBN", "READ_SD_KBN", null, null, String.class, "readSdKbn", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * T_TRPICKLISTEXP_ID: {PK, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTTrpicklistexpId() { return _columnTTrpicklistexpId; }
    /**
     * T_TRPICKLIST_ID: {NotNull, bigint(19), FK to T_TR_PICKLIST}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTTrpicklistId() { return _columnTTrpicklistId; }
    /**
     * PICKLIST_KEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicklistKey() { return _columnPicklistKey; }
    /**
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicklistGNo() { return _columnPicklistGNo; }
    /**
     * CASE_CD: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseCd() { return _columnCaseCd; }
    /**
     * DUMMY_CASE_KBN: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDummyCaseKbn() { return _columnDummyCaseKbn; }
    /**
     * READ_SD_KBN: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReadSdKbn() { return _columnReadSdKbn; }
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
        ls.add(columnTTrpicklistexpId());
        ls.add(columnTTrpicklistId());
        ls.add(columnPicklistKey());
        ls.add(columnPicklistGNo());
        ls.add(columnCaseCd());
        ls.add(columnDummyCaseKbn());
        ls.add(columnReadSdKbn());
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
    protected UniqueInfo cpui() { return hpcpui(columnTTrpicklistexpId()); }
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
     * T_TR_PICKLIST by my T_TRPICKLIST_ID, named 'TTrPicklist'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTTrPicklist() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTTrpicklistId(), TTrPicklistDbm.getInstance().columnTTrPicklistId());
        return cfi("T_TRPICKLISTEXP_FK1", "TTrPicklist", this, TTrPicklistDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrpicklistexpList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrpicklistexp"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrpicklistexpCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrpicklistexpBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrpicklistexp> getEntityType() { return TTrpicklistexp.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrpicklistexp newEntity() { return new TTrpicklistexp(); }
    public TTrpicklistexp newMyEntity() { return new TTrpicklistexp(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrpicklistexp)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrpicklistexp)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

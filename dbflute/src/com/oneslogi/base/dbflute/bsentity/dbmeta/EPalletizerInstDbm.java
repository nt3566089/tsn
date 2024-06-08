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
 * The DB meta of E_PALLETIZER_INST. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EPalletizerInstDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EPalletizerInstDbm _instance = new EPalletizerInstDbm();
    private EPalletizerInstDbm() {}
    public static EPalletizerInstDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getPalletizerInstId(), (et, vl) -> ((EPalletizerInst)et).setPalletizerInstId(ctl(vl)), "palletizerInstId");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getReceiveCd(), (et, vl) -> ((EPalletizerInst)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getReceiveRowId(), (et, vl) -> ((EPalletizerInst)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getImportFlg(), (et, vl) -> ((EPalletizerInst)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getErrorFlg(), (et, vl) -> ((EPalletizerInst)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getErrorMessageCd(), (et, vl) -> ((EPalletizerInst)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getClientCd(), (et, vl) -> ((EPalletizerInst)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getCenterCd(), (et, vl) -> ((EPalletizerInst)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getRcvkey(), (et, vl) -> ((EPalletizerInst)et).setRcvkey((String)vl), "rcvkey");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getPrintMachineNumber(), (et, vl) -> ((EPalletizerInst)et).setPrintMachineNumber((String)vl), "printMachineNumber");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getCreateno(), (et, vl) -> ((EPalletizerInst)et).setCreateno((String)vl), "createno");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getCustorderlineno(), (et, vl) -> ((EPalletizerInst)et).setCustorderlineno((String)vl), "custorderlineno");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getPalletizeStartFlg(), (et, vl) -> ((EPalletizerInst)et).setPalletizeStartFlg((String)vl), "palletizeStartFlg");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getDelFlg(), (et, vl) -> ((EPalletizerInst)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getVersionNo(), (et, vl) -> ((EPalletizerInst)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getControlNo(), (et, vl) -> ((EPalletizerInst)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getAddDt(), (et, vl) -> ((EPalletizerInst)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getAddUser(), (et, vl) -> ((EPalletizerInst)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getAddProcess(), (et, vl) -> ((EPalletizerInst)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getUpdDt(), (et, vl) -> ((EPalletizerInst)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getUpdUser(), (et, vl) -> ((EPalletizerInst)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EPalletizerInst)et).getUpdProcess(), (et, vl) -> ((EPalletizerInst)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_PALLETIZER_INST";
    protected final String _tableDispName = "E_PALLETIZER_INST";
    protected final String _tablePropertyName = "EPalletizerInst";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_PALLETIZER_INST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPalletizerInstId = cci("PALLETIZER_INST_ID", "PALLETIZER_INST_ID", null, null, Long.class, "palletizerInstId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RCVKEY", "RCVKEY", null, null, String.class, "rcvkey", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintMachineNumber = cci("PRINT_MACHINE_NUMBER", "PRINT_MACHINE_NUMBER", null, null, String.class, "printMachineNumber", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateno = cci("CREATENO", "CREATENO", null, null, String.class, "createno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustorderlineno = cci("CUSTORDERLINENO", "CUSTORDERLINENO", null, null, String.class, "custorderlineno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletizeStartFlg = cci("PALLETIZE_START_FLG", "PALLETIZE_START_FLG", null, null, String.class, "palletizeStartFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * PALLETIZER_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletizerInstId() { return _columnPalletizerInstId; }
    /**
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * CLIENT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CENTER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * RCVKEY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvkey() { return _columnRcvkey; }
    /**
     * PRINT_MACHINE_NUMBER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintMachineNumber() { return _columnPrintMachineNumber; }
    /**
     * CREATENO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateno() { return _columnCreateno; }
    /**
     * CUSTORDERLINENO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustorderlineno() { return _columnCustorderlineno; }
    /**
     * PALLETIZE_START_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletizeStartFlg() { return _columnPalletizeStartFlg; }
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
        ls.add(columnPalletizerInstId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnClientCd());
        ls.add(columnCenterCd());
        ls.add(columnRcvkey());
        ls.add(columnPrintMachineNumber());
        ls.add(columnCreateno());
        ls.add(columnCustorderlineno());
        ls.add(columnPalletizeStartFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnPalletizerInstId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EPalletizerInst"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EPalletizerInstCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EPalletizerInstBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EPalletizerInst> getEntityType() { return EPalletizerInst.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EPalletizerInst newEntity() { return new EPalletizerInst(); }
    public EPalletizerInst newMyEntity() { return new EPalletizerInst(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EPalletizerInst)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EPalletizerInst)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

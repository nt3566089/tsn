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
 * The DB meta of P_SVF_OUTPUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PSvfOutputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PSvfOutputDbm _instance = new PSvfOutputDbm();
    private PSvfOutputDbm() {}
    public static PSvfOutputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getSvfOutputId(), (et, vl) -> ((PSvfOutput)et).setSvfOutputId(ctl(vl)), "svfOutputId");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getSendCd(), (et, vl) -> ((PSvfOutput)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getSendRowId(), (et, vl) -> ((PSvfOutput)et).setSendRowId((String)vl), "sendRowId");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getSendflg(), (et, vl) -> ((PSvfOutput)et).setSendflg((String)vl), "sendflg");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getErrorFlg(), (et, vl) -> ((PSvfOutput)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getErrorMessageCd(), (et, vl) -> ((PSvfOutput)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getCenterCd(), (et, vl) -> ((PSvfOutput)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getClientCd(), (et, vl) -> ((PSvfOutput)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getHbKbn(), (et, vl) -> ((PSvfOutput)et).setHbKbn((String)vl), "hbKbn");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getDataParts(), (et, vl) -> ((PSvfOutput)et).setDataParts((String)vl), "dataParts");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getDelFlg(), (et, vl) -> ((PSvfOutput)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getVersionNo(), (et, vl) -> ((PSvfOutput)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getControlNo(), (et, vl) -> ((PSvfOutput)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getAddDt(), (et, vl) -> ((PSvfOutput)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getAddUser(), (et, vl) -> ((PSvfOutput)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getAddProcess(), (et, vl) -> ((PSvfOutput)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getUpdDt(), (et, vl) -> ((PSvfOutput)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getUpdUser(), (et, vl) -> ((PSvfOutput)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PSvfOutput)et).getUpdProcess(), (et, vl) -> ((PSvfOutput)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_SVF_OUTPUT";
    protected final String _tableDispName = "P_SVF_OUTPUT";
    protected final String _tablePropertyName = "PSvfOutput";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_SVF_OUTPUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSvfOutputId = cci("SVF_OUTPUT_ID", "SVF_OUTPUT_ID", null, null, Long.class, "svfOutputId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowId = cci("SEND_ROW_ID", "SEND_ROW_ID", null, null, String.class, "sendRowId", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendflg = cci("SENDFLG", "SENDFLG", null, null, String.class, "sendflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHbKbn = cci("HB_KBN", "HB_KBN", null, null, String.class, "hbKbn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataParts = cci("DATA_PARTS", "DATA_PARTS", null, null, String.class, "dataParts", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * SVF_OUTPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSvfOutputId() { return _columnSvfOutputId; }
    /**
     * SEND_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * SEND_ROW_ID: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendRowId() { return _columnSendRowId; }
    /**
     * SENDFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendflg() { return _columnSendflg; }
    /**
     * ERROR_FLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * CENTER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CLIENT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * HB_KBN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHbKbn() { return _columnHbKbn; }
    /**
     * DATA_PARTS: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataParts() { return _columnDataParts; }
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
        ls.add(columnSvfOutputId());
        ls.add(columnSendCd());
        ls.add(columnSendRowId());
        ls.add(columnSendflg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnCenterCd());
        ls.add(columnClientCd());
        ls.add(columnHbKbn());
        ls.add(columnDataParts());
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
    protected UniqueInfo cpui() { return hpcpui(columnSvfOutputId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PSvfOutput"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PSvfOutputCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PSvfOutputBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PSvfOutput> getEntityType() { return PSvfOutput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PSvfOutput newEntity() { return new PSvfOutput(); }
    public PSvfOutput newMyEntity() { return new PSvfOutput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PSvfOutput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PSvfOutput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

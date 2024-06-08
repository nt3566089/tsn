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
 * The DB meta of W_CDRCATT_INST_INPUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WCdrcattInstInputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WCdrcattInstInputDbm _instance = new WCdrcattInstInputDbm();
    private WCdrcattInstInputDbm() {}
    public static WCdrcattInstInputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getCdrcattInstInputId(), (et, vl) -> ((WCdrcattInstInput)et).setCdrcattInstInputId(ctl(vl)), "cdrcattInstInputId");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getReceiveCd(), (et, vl) -> ((WCdrcattInstInput)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getCenterCd(), (et, vl) -> ((WCdrcattInstInput)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getClientCd(), (et, vl) -> ((WCdrcattInstInput)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getCompanyCd(), (et, vl) -> ((WCdrcattInstInput)et).setCompanyCd((String)vl), "companyCd");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getDpcd(), (et, vl) -> ((WCdrcattInstInput)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getDrccd(), (et, vl) -> ((WCdrcattInstInput)et).setDrccd((String)vl), "drccd");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getZzpstnid(), (et, vl) -> ((WCdrcattInstInput)et).setZzpstnid((String)vl), "zzpstnid");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getSrlin(), (et, vl) -> ((WCdrcattInstInput)et).setSrlin((String)vl), "srlin");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getSrrnk(), (et, vl) -> ((WCdrcattInstInput)et).setSrrnk(ctl(vl)), "srrnk");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getSnmprtrnkad(), (et, vl) -> ((WCdrcattInstInput)et).setSnmprtrnkad((String)vl), "snmprtrnkad");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getSrwkdy(), (et, vl) -> ((WCdrcattInstInput)et).setSrwkdy(ctb(vl)), "srwkdy");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getComt(), (et, vl) -> ((WCdrcattInstInput)et).setComt((String)vl), "comt");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getSprprsid(), (et, vl) -> ((WCdrcattInstInput)et).setSprprsid((String)vl), "sprprsid");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getOddvid(), (et, vl) -> ((WCdrcattInstInput)et).setOddvid((String)vl), "oddvid");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getHdrdbxusid(), (et, vl) -> ((WCdrcattInstInput)et).setHdrdbxusid((String)vl), "hdrdbxusid");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getIkeiincldflg(), (et, vl) -> ((WCdrcattInstInput)et).setIkeiincldflg((String)vl), "ikeiincldflg");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getRemoteisland(), (et, vl) -> ((WCdrcattInstInput)et).setRemoteisland((String)vl), "remoteisland");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getZzfrdateh(), (et, vl) -> ((WCdrcattInstInput)et).setZzfrdateh((String)vl), "zzfrdateh");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getZztodateh(), (et, vl) -> ((WCdrcattInstInput)et).setZztodateh((String)vl), "zztodateh");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getGrtnid(), (et, vl) -> ((WCdrcattInstInput)et).setGrtnid((String)vl), "grtnid");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getLineNo(), (et, vl) -> ((WCdrcattInstInput)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getWorkFlg(), (et, vl) -> ((WCdrcattInstInput)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getErrorFlg(), (et, vl) -> ((WCdrcattInstInput)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getErrorMsg(), (et, vl) -> ((WCdrcattInstInput)et).setErrorMsg((String)vl), "errorMsg");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getDelFlg(), (et, vl) -> ((WCdrcattInstInput)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getVersionNo(), (et, vl) -> ((WCdrcattInstInput)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getControlNo(), (et, vl) -> ((WCdrcattInstInput)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getAddDt(), (et, vl) -> ((WCdrcattInstInput)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getAddUser(), (et, vl) -> ((WCdrcattInstInput)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getAddProcess(), (et, vl) -> ((WCdrcattInstInput)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getUpdDt(), (et, vl) -> ((WCdrcattInstInput)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getUpdUser(), (et, vl) -> ((WCdrcattInstInput)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WCdrcattInstInput)et).getUpdProcess(), (et, vl) -> ((WCdrcattInstInput)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_CDRCATT_INST_INPUT";
    protected final String _tableDispName = "W_CDRCATT_INST_INPUT";
    protected final String _tablePropertyName = "WCdrcattInstInput";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_CDRCATT_INST_INPUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCdrcattInstInputId = cci("CDRCATT_INST_INPUT_ID", "CDRCATT_INST_INPUT_ID", null, null, Long.class, "cdrcattInstInputId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyCd = cci("COMPANY_CD", "COMPANY_CD", null, null, String.class, "companyCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDrccd = cci("DRCCD", "DRCCD", null, null, String.class, "drccd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzpstnid = cci("ZZPSTNID", "ZZPSTNID", null, null, String.class, "zzpstnid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrlin = cci("SRLIN", "SRLIN", null, null, String.class, "srlin", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrrnk = cci("SRRNK", "SRRNK", null, null, Long.class, "srrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnmprtrnkad = cci("SNMPRTRNKAD", "SNMPRTRNKAD", null, null, String.class, "snmprtrnkad", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrwkdy = cci("SRWKDY", "SRWKDY", null, null, java.math.BigDecimal.class, "srwkdy", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnComt = cci("COMT", "COMT", null, null, String.class, "comt", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprprsid = cci("SPRPRSID", "SPRPRSID", null, null, String.class, "sprprsid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOddvid = cci("ODDVID", "ODDVID", null, null, String.class, "oddvid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHdrdbxusid = cci("HDRDBXUSID", "HDRDBXUSID", null, null, String.class, "hdrdbxusid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIkeiincldflg = cci("IKEIINCLDFLG", "IKEIINCLDFLG", null, null, String.class, "ikeiincldflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemoteisland = cci("REMOTEISLAND", "REMOTEISLAND", null, null, String.class, "remoteisland", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzfrdateh = cci("ZZFRDATEH", "ZZFRDATEH", null, null, String.class, "zzfrdateh", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZztodateh = cci("ZZTODATEH", "ZZTODATEH", null, null, String.class, "zztodateh", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrtnid = cci("GRTNID", "GRTNID", null, null, String.class, "grtnid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMsg = cci("ERROR_MSG", "ERROR_MSG", null, null, String.class, "errorMsg", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
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
     * CDRCATT_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCdrcattInstInputId() { return _columnCdrcattInstInputId; }
    /**
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * COMPANY_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyCd() { return _columnCompanyCd; }
    /**
     * DPCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpcd() { return _columnDpcd; }
    /**
     * DRCCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDrccd() { return _columnDrccd; }
    /**
     * ZZPSTNID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzpstnid() { return _columnZzpstnid; }
    /**
     * SRLIN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrlin() { return _columnSrlin; }
    /**
     * SRRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrrnk() { return _columnSrrnk; }
    /**
     * SNMPRTRNKAD: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnmprtrnkad() { return _columnSnmprtrnkad; }
    /**
     * SRWKDY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrwkdy() { return _columnSrwkdy; }
    /**
     * COMT: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnComt() { return _columnComt; }
    /**
     * SPRPRSID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprprsid() { return _columnSprprsid; }
    /**
     * ODDVID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOddvid() { return _columnOddvid; }
    /**
     * HDRDBXUSID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHdrdbxusid() { return _columnHdrdbxusid; }
    /**
     * IKEIINCLDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIkeiincldflg() { return _columnIkeiincldflg; }
    /**
     * REMOTEISLAND: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemoteisland() { return _columnRemoteisland; }
    /**
     * ZZFRDATEH: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzfrdateh() { return _columnZzfrdateh; }
    /**
     * ZZTODATEH: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZztodateh() { return _columnZztodateh; }
    /**
     * GRTNID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrtnid() { return _columnGrtnid; }
    /**
     * LINE_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * WORK_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * ERROR_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MSG: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMsg() { return _columnErrorMsg; }
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
        ls.add(columnCdrcattInstInputId());
        ls.add(columnReceiveCd());
        ls.add(columnCenterCd());
        ls.add(columnClientCd());
        ls.add(columnCompanyCd());
        ls.add(columnDpcd());
        ls.add(columnDrccd());
        ls.add(columnZzpstnid());
        ls.add(columnSrlin());
        ls.add(columnSrrnk());
        ls.add(columnSnmprtrnkad());
        ls.add(columnSrwkdy());
        ls.add(columnComt());
        ls.add(columnSprprsid());
        ls.add(columnOddvid());
        ls.add(columnHdrdbxusid());
        ls.add(columnIkeiincldflg());
        ls.add(columnRemoteisland());
        ls.add(columnZzfrdateh());
        ls.add(columnZztodateh());
        ls.add(columnGrtnid());
        ls.add(columnLineNo());
        ls.add(columnWorkFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMsg());
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
    protected UniqueInfo cpui() { return hpcpui(columnCdrcattInstInputId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WCdrcattInstInput"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WCdrcattInstInputCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WCdrcattInstInputBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WCdrcattInstInput> getEntityType() { return WCdrcattInstInput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WCdrcattInstInput newEntity() { return new WCdrcattInstInput(); }
    public WCdrcattInstInput newMyEntity() { return new WCdrcattInstInput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WCdrcattInstInput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WCdrcattInstInput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

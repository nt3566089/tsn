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
 * The DB meta of T_CORDHDR. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TCordhdrDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TCordhdrDbm _instance = new TCordhdrDbm();
    private TCordhdrDbm() {}
    public static TCordhdrDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TCordhdr)et).getOrderHId(), (et, vl) -> ((TCordhdr)et).setOrderHId(ctl(vl)), "orderHId");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getCenterId(), (et, vl) -> ((TCordhdr)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getClientId(), (et, vl) -> ((TCordhdr)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getZzorgncd(), (et, vl) -> ((TCordhdr)et).setZzorgncd((String)vl), "zzorgncd");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getDpcd(), (et, vl) -> ((TCordhdr)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getZzordymd(), (et, vl) -> ((TCordhdr)et).setZzordymd((String)vl), "zzordymd");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getOrdgr(), (et, vl) -> ((TCordhdr)et).setOrdgr((String)vl), "ordgr");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getDlvymd(), (et, vl) -> ((TCordhdr)et).setDlvymd((String)vl), "dlvymd");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getDed(), (et, vl) -> ((TCordhdr)et).setDed((String)vl), "ded");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getPstnid(), (et, vl) -> ((TCordhdr)et).setPstnid((String)vl), "pstnid");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getScddlvymd(), (et, vl) -> ((TCordhdr)et).setScddlvymd((String)vl), "scddlvymd");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getScdded(), (et, vl) -> ((TCordhdr)et).setScdded((String)vl), "scdded");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getScdpstnid(), (et, vl) -> ((TCordhdr)et).setScdpstnid((String)vl), "scdpstnid");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getIoid(), (et, vl) -> ((TCordhdr)et).setIoid((String)vl), "ioid");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getCtqa(), (et, vl) -> ((TCordhdr)et).setCtqa(ctl(vl)), "ctqa");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getSta(), (et, vl) -> ((TCordhdr)et).setSta(ctb(vl)), "sta");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getWrkmfg(), (et, vl) -> ((TCordhdr)et).setWrkmfg((String)vl), "wrkmfg");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getSroprtcnt(), (et, vl) -> ((TCordhdr)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getCordrcvcnt(), (et, vl) -> ((TCordhdr)et).setCordrcvcnt(ctl(vl)), "cordrcvcnt");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getCompleteFlg(), (et, vl) -> ((TCordhdr)et).setCompleteFlg((String)vl), "completeFlg");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getRcvFlg(), (et, vl) -> ((TCordhdr)et).setRcvFlg((String)vl), "rcvFlg");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getSkipKbn(), (et, vl) -> ((TCordhdr)et).setSkipKbn((String)vl), "skipKbn");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getSortDate(), (et, vl) -> ((TCordhdr)et).setSortDate((String)vl), "sortDate");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getComment(), (et, vl) -> ((TCordhdr)et).setComment((String)vl), "comment");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getDelFlg(), (et, vl) -> ((TCordhdr)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getVersionNo(), (et, vl) -> ((TCordhdr)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getControlNo(), (et, vl) -> ((TCordhdr)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getAddDt(), (et, vl) -> ((TCordhdr)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getAddUser(), (et, vl) -> ((TCordhdr)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getAddProcess(), (et, vl) -> ((TCordhdr)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getUpdDt(), (et, vl) -> ((TCordhdr)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getUpdUser(), (et, vl) -> ((TCordhdr)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TCordhdr)et).getUpdProcess(), (et, vl) -> ((TCordhdr)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TCordhdr)et).getMCenter(), (et, vl) -> ((TCordhdr)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TCordhdr)et).getMClient(), (et, vl) -> ((TCordhdr)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_CORDHDR";
    protected final String _tableDispName = "T_CORDHDR";
    protected final String _tablePropertyName = "TCordhdr";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_CORDHDR", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnOrderHId = cci("ORDER_H_ID", "ORDER_H_ID", null, null, Long.class, "orderHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TCorddtaecList,TCorddtasrList", null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnZzorgncd = cci("ZZORGNCD", "ZZORGNCD", null, null, String.class, "zzorgncd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzordymd = cci("ZZORDYMD", "ZZORDYMD", null, null, String.class, "zzordymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdgr = cci("ORDGR", "ORDGR", null, null, String.class, "ordgr", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvymd = cci("DLVYMD", "DLVYMD", null, null, String.class, "dlvymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDed = cci("DED", "DED", null, null, String.class, "ded", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPstnid = cci("PSTNID", "PSTNID", null, null, String.class, "pstnid", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScddlvymd = cci("SCDDLVYMD", "SCDDLVYMD", null, null, String.class, "scddlvymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScdded = cci("SCDDED", "SCDDED", null, null, String.class, "scdded", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScdpstnid = cci("SCDPSTNID", "SCDPSTNID", null, null, String.class, "scdpstnid", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIoid = cci("IOID", "IOID", null, null, String.class, "ioid", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtqa = cci("CTQA", "CTQA", null, null, Long.class, "ctqa", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSta = cci("STA", "STA", null, null, java.math.BigDecimal.class, "sta", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWrkmfg = cci("WRKMFG", "WRKMFG", null, null, String.class, "wrkmfg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCordrcvcnt = cci("CORDRCVCNT", "CORDRCVCNT", null, null, Long.class, "cordrcvcnt", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompleteFlg = cci("COMPLETE_FLG", "COMPLETE_FLG", null, null, String.class, "completeFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvFlg = cci("RCV_FLG", "RCV_FLG", null, null, String.class, "rcvFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSkipKbn = cci("SKIP_KBN", "SKIP_KBN", null, null, String.class, "skipKbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortDate = cci("SORT_DATE", "SORT_DATE", null, null, String.class, "sortDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnComment = cci("COMMENT", "COMMENT", null, null, String.class, "comment", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderHId() { return _columnOrderHId; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzorgncd() { return _columnZzorgncd; }
    /**
     * DPCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpcd() { return _columnDpcd; }
    /**
     * ZZORDYMD: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzordymd() { return _columnZzordymd; }
    /**
     * ORDGR: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdgr() { return _columnOrdgr; }
    /**
     * DLVYMD: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvymd() { return _columnDlvymd; }
    /**
     * DED: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDed() { return _columnDed; }
    /**
     * PSTNID: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPstnid() { return _columnPstnid; }
    /**
     * SCDDLVYMD: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScddlvymd() { return _columnScddlvymd; }
    /**
     * SCDDED: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScdded() { return _columnScdded; }
    /**
     * SCDPSTNID: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScdpstnid() { return _columnScdpstnid; }
    /**
     * IOID: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIoid() { return _columnIoid; }
    /**
     * CTQA: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtqa() { return _columnCtqa; }
    /**
     * STA: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSta() { return _columnSta; }
    /**
     * WRKMFG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrkmfg() { return _columnWrkmfg; }
    /**
     * SROPRTCNT: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtcnt() { return _columnSroprtcnt; }
    /**
     * CORDRCVCNT: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCordrcvcnt() { return _columnCordrcvcnt; }
    /**
     * COMPLETE_FLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompleteFlg() { return _columnCompleteFlg; }
    /**
     * RCV_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvFlg() { return _columnRcvFlg; }
    /**
     * SKIP_KBN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSkipKbn() { return _columnSkipKbn; }
    /**
     * SORT_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortDate() { return _columnSortDate; }
    /**
     * COMMENT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnComment() { return _columnComment; }
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
        ls.add(columnOrderHId());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnZzorgncd());
        ls.add(columnDpcd());
        ls.add(columnZzordymd());
        ls.add(columnOrdgr());
        ls.add(columnDlvymd());
        ls.add(columnDed());
        ls.add(columnPstnid());
        ls.add(columnScddlvymd());
        ls.add(columnScdded());
        ls.add(columnScdpstnid());
        ls.add(columnIoid());
        ls.add(columnCtqa());
        ls.add(columnSta());
        ls.add(columnWrkmfg());
        ls.add(columnSroprtcnt());
        ls.add(columnCordrcvcnt());
        ls.add(columnCompleteFlg());
        ls.add(columnRcvFlg());
        ls.add(columnSkipKbn());
        ls.add(columnSortDate());
        ls.add(columnComment());
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
    protected UniqueInfo cpui() { return hpcpui(columnOrderHId()); }
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
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_CORDHDR_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TCordhdrList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_CORDHDR_FK1", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TCordhdrList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_CORDDTAEC by ORDER_H_ID, named 'TCorddtaecList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTCorddtaecList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOrderHId(), TCorddtaecDbm.getInstance().columnOrderHId());
        return cri("T_CORDDTAEC_FK1", "TCorddtaecList", this, TCorddtaecDbm.getInstance(), mp, false, "TCordhdr");
    }
    /**
     * T_CORDDTASR by ORDER_H_ID, named 'TCorddtasrList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTCorddtasrList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOrderHId(), TCorddtasrDbm.getInstance().columnOrderHId());
        return cri("T_CORDDTASR_FK1", "TCorddtasrList", this, TCorddtasrDbm.getInstance(), mp, false, "TCordhdr");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TCordhdr"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TCordhdrCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TCordhdrBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TCordhdr> getEntityType() { return TCordhdr.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TCordhdr newEntity() { return new TCordhdr(); }
    public TCordhdr newMyEntity() { return new TCordhdr(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TCordhdr)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TCordhdr)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

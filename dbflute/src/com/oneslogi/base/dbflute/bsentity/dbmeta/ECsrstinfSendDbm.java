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
 * The DB meta of E_CSRSTINF_SEND. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ECsrstinfSendDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ECsrstinfSendDbm _instance = new ECsrstinfSendDbm();
    private ECsrstinfSendDbm() {}
    public static ECsrstinfSendDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getCsrstinfSendId(), (et, vl) -> ((ECsrstinfSend)et).setCsrstinfSendId(ctl(vl)), "csrstinfSendId");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSendCd(), (et, vl) -> ((ECsrstinfSend)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSendRowCd(), (et, vl) -> ((ECsrstinfSend)et).setSendRowCd(ctl(vl)), "sendRowCd");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getWorkFlg(), (et, vl) -> ((ECsrstinfSend)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSroprtymd(), (et, vl) -> ((ECsrstinfSend)et).setSroprtymd((String)vl), "sroprtymd");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSroprtcnt(), (et, vl) -> ((ECsrstinfSend)et).setSroprtcnt((String)vl), "sroprtcnt");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getLinblk(), (et, vl) -> ((ECsrstinfSend)et).setLinblk((String)vl), "linblk");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getDlvymd(), (et, vl) -> ((ECsrstinfSend)et).setDlvymd((String)vl), "dlvymd");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getDpcd(), (et, vl) -> ((ECsrstinfSend)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getDed(), (et, vl) -> ((ECsrstinfSend)et).setDed((String)vl), "ded");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getPstnid(), (et, vl) -> ((ECsrstinfSend)et).setPstnid((String)vl), "pstnid");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSrlincd(), (et, vl) -> ((ECsrstinfSend)et).setSrlincd((String)vl), "srlincd");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSrrnk(), (et, vl) -> ((ECsrstinfSend)et).setSrrnk((String)vl), "srrnk");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSrpat(), (et, vl) -> ((ECsrstinfSend)et).setSrpat((String)vl), "srpat");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getTtbrqa(), (et, vl) -> ((ECsrstinfSend)et).setTtbrqa((String)vl), "ttbrqa");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getShpqa(), (et, vl) -> ((ECsrstinfSend)et).setShpqa((String)vl), "shpqa");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSprqasftpcl(), (et, vl) -> ((ECsrstinfSend)et).setSprqasftpcl((String)vl), "sprqasftpcl");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSprqatsnbox(), (et, vl) -> ((ECsrstinfSend)et).setSprqatsnbox((String)vl), "sprqatsnbox");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSprqajtbox(), (et, vl) -> ((ECsrstinfSend)et).setSprqajtbox((String)vl), "sprqajtbox");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSprqa100box(), (et, vl) -> ((ECsrstinfSend)et).setSprqa100box((String)vl), "sprqa100box");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSprqahl(), (et, vl) -> ((ECsrstinfSend)et).setSprqahl((String)vl), "sprqahl");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSprqahlbgbox(), (et, vl) -> ((ECsrstinfSend)et).setSprqahlbgbox((String)vl), "sprqahlbgbox");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSprqahl12box(), (et, vl) -> ((ECsrstinfSend)et).setSprqahl12box((String)vl), "sprqahl12box");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSprqahl5box(), (et, vl) -> ((ECsrstinfSend)et).setSprqahl5box((String)vl), "sprqahl5box");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getSprqaful(), (et, vl) -> ((ECsrstinfSend)et).setSprqaful((String)vl), "sprqaful");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getZzorgncd(), (et, vl) -> ((ECsrstinfSend)et).setZzorgncd((String)vl), "zzorgncd");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getDelFlg(), (et, vl) -> ((ECsrstinfSend)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getVersionNo(), (et, vl) -> ((ECsrstinfSend)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getControlNo(), (et, vl) -> ((ECsrstinfSend)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getAddDt(), (et, vl) -> ((ECsrstinfSend)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getAddUser(), (et, vl) -> ((ECsrstinfSend)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getAddProcess(), (et, vl) -> ((ECsrstinfSend)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getUpdDt(), (et, vl) -> ((ECsrstinfSend)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getUpdUser(), (et, vl) -> ((ECsrstinfSend)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ECsrstinfSend)et).getUpdProcess(), (et, vl) -> ((ECsrstinfSend)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_CSRSTINF_SEND";
    protected final String _tableDispName = "E_CSRSTINF_SEND";
    protected final String _tablePropertyName = "ECsrstinfSend";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_CSRSTINF_SEND", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCsrstinfSendId = cci("CSRSTINF_SEND_ID", "CSRSTINF_SEND_ID", null, null, Long.class, "csrstinfSendId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowCd = cci("SEND_ROW_CD", "SEND_ROW_CD", null, null, Long.class, "sendRowCd", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtymd = cci("SROPRTYMD", "SROPRTYMD", null, null, String.class, "sroprtymd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, String.class, "sroprtcnt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk = cci("LINBLK", "LINBLK", null, null, String.class, "linblk", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvymd = cci("DLVYMD", "DLVYMD", null, null, String.class, "dlvymd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDed = cci("DED", "DED", null, null, String.class, "ded", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPstnid = cci("PSTNID", "PSTNID", null, null, String.class, "pstnid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrlincd = cci("SRLINCD", "SRLINCD", null, null, String.class, "srlincd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrrnk = cci("SRRNK", "SRRNK", null, null, String.class, "srrnk", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrpat = cci("SRPAT", "SRPAT", null, null, String.class, "srpat", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTtbrqa = cci("TTBRQA", "TTBRQA", null, null, String.class, "ttbrqa", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShpqa = cci("SHPQA", "SHPQA", null, null, String.class, "shpqa", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqasftpcl = cci("SPRQASFTPCL", "SPRQASFTPCL", null, null, String.class, "sprqasftpcl", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqatsnbox = cci("SPRQATSNBOX", "SPRQATSNBOX", null, null, String.class, "sprqatsnbox", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqajtbox = cci("SPRQAJTBOX", "SPRQAJTBOX", null, null, String.class, "sprqajtbox", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqa100box = cci("SPRQA100BOX", "SPRQA100BOX", null, null, String.class, "sprqa100box", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqahl = cci("SPRQAHL", "SPRQAHL", null, null, String.class, "sprqahl", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqahlbgbox = cci("SPRQAHLBGBOX", "SPRQAHLBGBOX", null, null, String.class, "sprqahlbgbox", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqahl12box = cci("SPRQAHL12BOX", "SPRQAHL12BOX", null, null, String.class, "sprqahl12box", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqahl5box = cci("SPRQAHL5BOX", "SPRQAHL5BOX", null, null, String.class, "sprqahl5box", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprqaful = cci("SPRQAFUL", "SPRQAFUL", null, null, String.class, "sprqaful", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgncd = cci("ZZORGNCD", "ZZORGNCD", null, null, String.class, "zzorgncd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * CSRSTINF_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCsrstinfSendId() { return _columnCsrstinfSendId; }
    /**
     * SEND_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendRowCd() { return _columnSendRowCd; }
    /**
     * WORK_FLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * SROPRTYMD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtymd() { return _columnSroprtymd; }
    /**
     * SROPRTCNT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtcnt() { return _columnSroprtcnt; }
    /**
     * LINBLK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk() { return _columnLinblk; }
    /**
     * DLVYMD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvymd() { return _columnDlvymd; }
    /**
     * DPCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpcd() { return _columnDpcd; }
    /**
     * DED: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDed() { return _columnDed; }
    /**
     * PSTNID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPstnid() { return _columnPstnid; }
    /**
     * SRLINCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrlincd() { return _columnSrlincd; }
    /**
     * SRRNK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrrnk() { return _columnSrrnk; }
    /**
     * SRPAT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrpat() { return _columnSrpat; }
    /**
     * TTBRQA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTtbrqa() { return _columnTtbrqa; }
    /**
     * SHPQA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShpqa() { return _columnShpqa; }
    /**
     * SPRQASFTPCL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqasftpcl() { return _columnSprqasftpcl; }
    /**
     * SPRQATSNBOX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqatsnbox() { return _columnSprqatsnbox; }
    /**
     * SPRQAJTBOX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqajtbox() { return _columnSprqajtbox; }
    /**
     * SPRQA100BOX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqa100box() { return _columnSprqa100box; }
    /**
     * SPRQAHL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqahl() { return _columnSprqahl; }
    /**
     * SPRQAHLBGBOX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqahlbgbox() { return _columnSprqahlbgbox; }
    /**
     * SPRQAHL12BOX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqahl12box() { return _columnSprqahl12box; }
    /**
     * SPRQAHL5BOX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqahl5box() { return _columnSprqahl5box; }
    /**
     * SPRQAFUL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprqaful() { return _columnSprqaful; }
    /**
     * ZZORGNCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzorgncd() { return _columnZzorgncd; }
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
        ls.add(columnCsrstinfSendId());
        ls.add(columnSendCd());
        ls.add(columnSendRowCd());
        ls.add(columnWorkFlg());
        ls.add(columnSroprtymd());
        ls.add(columnSroprtcnt());
        ls.add(columnLinblk());
        ls.add(columnDlvymd());
        ls.add(columnDpcd());
        ls.add(columnDed());
        ls.add(columnPstnid());
        ls.add(columnSrlincd());
        ls.add(columnSrrnk());
        ls.add(columnSrpat());
        ls.add(columnTtbrqa());
        ls.add(columnShpqa());
        ls.add(columnSprqasftpcl());
        ls.add(columnSprqatsnbox());
        ls.add(columnSprqajtbox());
        ls.add(columnSprqa100box());
        ls.add(columnSprqahl());
        ls.add(columnSprqahlbgbox());
        ls.add(columnSprqahl12box());
        ls.add(columnSprqahl5box());
        ls.add(columnSprqaful());
        ls.add(columnZzorgncd());
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
    protected UniqueInfo cpui() { return hpcpui(columnCsrstinfSendId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ECsrstinfSend"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ECsrstinfSendCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ECsrstinfSendBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ECsrstinfSend> getEntityType() { return ECsrstinfSend.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ECsrstinfSend newEntity() { return new ECsrstinfSend(); }
    public ECsrstinfSend newMyEntity() { return new ECsrstinfSend(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ECsrstinfSend)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ECsrstinfSend)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

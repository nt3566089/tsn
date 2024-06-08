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
 * The DB meta of E_MH_SHIPPING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EMhShippingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EMhShippingDbm _instance = new EMhShippingDbm();
    private EMhShippingDbm() {}
    public static EMhShippingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EMhShipping)et).getMhShippingId(), (et, vl) -> ((EMhShipping)et).setMhShippingId(ctl(vl)), "mhShippingId");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getDpcd(), (et, vl) -> ((EMhShipping)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getDlvymd(), (et, vl) -> ((EMhShipping)et).setDlvymd((String)vl), "dlvymd");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getDed(), (et, vl) -> ((EMhShipping)et).setDed((String)vl), "ded");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getPstnid(), (et, vl) -> ((EMhShipping)et).setPstnid((String)vl), "pstnid");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getSrded(), (et, vl) -> ((EMhShipping)et).setSrded((String)vl), "srded");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getSrpstnid(), (et, vl) -> ((EMhShipping)et).setSrpstnid((String)vl), "srpstnid");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getSrlincd(), (et, vl) -> ((EMhShipping)et).setSrlincd((String)vl), "srlincd");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getSrrnk(), (et, vl) -> ((EMhShipping)et).setSrrnk(ctl(vl)), "srrnk");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getSscd(), (et, vl) -> ((EMhShipping)et).setSscd((String)vl), "sscd");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getSsnm(), (et, vl) -> ((EMhShipping)et).setSsnm((String)vl), "ssnm");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getZzmatnr(), (et, vl) -> ((EMhShipping)et).setZzmatnr((String)vl), "zzmatnr");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getSlqacb(), (et, vl) -> ((EMhShipping)et).setSlqacb(ctl(vl)), "slqacb");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getSlqact(), (et, vl) -> ((EMhShipping)et).setSlqact(ctl(vl)), "slqact");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getLinblk(), (et, vl) -> ((EMhShipping)et).setLinblk((String)vl), "linblk");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getLocno(), (et, vl) -> ((EMhShipping)et).setLocno((String)vl), "locno");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getLocid(), (et, vl) -> ((EMhShipping)et).setLocid((String)vl), "locid");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getDlvprtrnk(), (et, vl) -> ((EMhShipping)et).setDlvprtrnk(ctl(vl)), "dlvprtrnk");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getDlvsnm(), (et, vl) -> ((EMhShipping)et).setDlvsnm(ctl(vl)), "dlvsnm");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getDlvdtlsnm(), (et, vl) -> ((EMhShipping)et).setDlvdtlsnm(ctb(vl)), "dlvdtlsnm");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getSroprtcnt(), (et, vl) -> ((EMhShipping)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getTtsroprtcnt(), (et, vl) -> ((EMhShipping)et).setTtsroprtcnt(ctl(vl)), "ttsroprtcnt");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getTttopdedrnk(), (et, vl) -> ((EMhShipping)et).setTttopdedrnk(ctl(vl)), "tttopdedrnk");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getBrtyp(), (et, vl) -> ((EMhShipping)et).setBrtyp((String)vl), "brtyp");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getBoxno(), (et, vl) -> ((EMhShipping)et).setBoxno((String)vl), "boxno");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getBoxnocnsnm(), (et, vl) -> ((EMhShipping)et).setBoxnocnsnm((String)vl), "boxnocnsnm");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getBoxtyp(), (et, vl) -> ((EMhShipping)et).setBoxtyp((String)vl), "boxtyp");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getMgboxdid(), (et, vl) -> ((EMhShipping)et).setMgboxdid((String)vl), "mgboxdid");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getDmdid(), (et, vl) -> ((EMhShipping)et).setDmdid((String)vl), "dmdid");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getTtboxqa(), (et, vl) -> ((EMhShipping)et).setTtboxqa(ctl(vl)), "ttboxqa");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getBoxctqata(), (et, vl) -> ((EMhShipping)et).setBoxctqata(ctl(vl)), "boxctqata");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getBoxctqaapsrplc(), (et, vl) -> ((EMhShipping)et).setBoxctqaapsrplc(ctl(vl)), "boxctqaapsrplc");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getDrclstlbcbid(), (et, vl) -> ((EMhShipping)et).setDrclstlbcbid((String)vl), "drclstlbcbid");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getLbboxno(), (et, vl) -> ((EMhShipping)et).setLbboxno(ctl(vl)), "lbboxno");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getLbttboxqa(), (et, vl) -> ((EMhShipping)et).setLbttboxqa(ctl(vl)), "lbttboxqa");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getSendCd(), (et, vl) -> ((EMhShipping)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getWorkFlg(), (et, vl) -> ((EMhShipping)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getDelFlg(), (et, vl) -> ((EMhShipping)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getVersionNo(), (et, vl) -> ((EMhShipping)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getControlNo(), (et, vl) -> ((EMhShipping)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getAddDt(), (et, vl) -> ((EMhShipping)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getAddUser(), (et, vl) -> ((EMhShipping)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getAddProcess(), (et, vl) -> ((EMhShipping)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getUpdDt(), (et, vl) -> ((EMhShipping)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getUpdUser(), (et, vl) -> ((EMhShipping)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EMhShipping)et).getUpdProcess(), (et, vl) -> ((EMhShipping)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_MH_SHIPPING";
    protected final String _tableDispName = "E_MH_SHIPPING";
    protected final String _tablePropertyName = "EMhShipping";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_MH_SHIPPING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMhShippingId = cci("MH_SHIPPING_ID", "MH_SHIPPING_ID", null, null, Long.class, "mhShippingId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvymd = cci("DLVYMD", "DLVYMD", null, null, String.class, "dlvymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDed = cci("DED", "DED", null, null, String.class, "ded", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPstnid = cci("PSTNID", "PSTNID", null, null, String.class, "pstnid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrded = cci("SRDED", "SRDED", null, null, String.class, "srded", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrpstnid = cci("SRPSTNID", "SRPSTNID", null, null, String.class, "srpstnid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrlincd = cci("SRLINCD", "SRLINCD", null, null, String.class, "srlincd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrrnk = cci("SRRNK", "SRRNK", null, null, Long.class, "srrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSscd = cci("SSCD", "SSCD", null, null, String.class, "sscd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSsnm = cci("SSNM", "SSNM", null, null, String.class, "ssnm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzmatnr = cci("ZZMATNR", "ZZMATNR", null, null, String.class, "zzmatnr", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlqacb = cci("SLQACB", "SLQACB", null, null, Long.class, "slqacb", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlqact = cci("SLQACT", "SLQACT", null, null, Long.class, "slqact", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk = cci("LINBLK", "LINBLK", null, null, String.class, "linblk", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocno = cci("LOCNO", "LOCNO", null, null, String.class, "locno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocid = cci("LOCID", "LOCID", null, null, String.class, "locid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvprtrnk = cci("DLVPRTRNK", "DLVPRTRNK", null, null, Long.class, "dlvprtrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvsnm = cci("DLVSNM", "DLVSNM", null, null, Long.class, "dlvsnm", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvdtlsnm = cci("DLVDTLSNM", "DLVDTLSNM", null, null, java.math.BigDecimal.class, "dlvdtlsnm", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTtsroprtcnt = cci("TTSROPRTCNT", "TTSROPRTCNT", null, null, Long.class, "ttsroprtcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTttopdedrnk = cci("TTTOPDEDRNK", "TTTOPDEDRNK", null, null, Long.class, "tttopdedrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrtyp = cci("BRTYP", "BRTYP", null, null, String.class, "brtyp", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxno = cci("BOXNO", "BOXNO", null, null, String.class, "boxno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxnocnsnm = cci("BOXNOCNSNM", "BOXNOCNSNM", null, null, String.class, "boxnocnsnm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxtyp = cci("BOXTYP", "BOXTYP", null, null, String.class, "boxtyp", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMgboxdid = cci("MGBOXDID", "MGBOXDID", null, null, String.class, "mgboxdid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDmdid = cci("DMDID", "DMDID", null, null, String.class, "dmdid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTtboxqa = cci("TTBOXQA", "TTBOXQA", null, null, Long.class, "ttboxqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxctqata = cci("BOXCTQATA", "BOXCTQATA", null, null, Long.class, "boxctqata", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxctqaapsrplc = cci("BOXCTQAAPSRPLC", "BOXCTQAAPSRPLC", null, null, Long.class, "boxctqaapsrplc", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDrclstlbcbid = cci("DRCLSTLBCBID", "DRCLSTLBCBID", null, null, String.class, "drclstlbcbid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLbboxno = cci("LBBOXNO", "LBBOXNO", null, null, Long.class, "lbboxno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLbttboxqa = cci("LBTTBOXQA", "LBTTBOXQA", null, null, Long.class, "lbttboxqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMhShippingId() { return _columnMhShippingId; }
    /**
     * DPCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpcd() { return _columnDpcd; }
    /**
     * DLVYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvymd() { return _columnDlvymd; }
    /**
     * DED: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDed() { return _columnDed; }
    /**
     * PSTNID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPstnid() { return _columnPstnid; }
    /**
     * SRDED: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrded() { return _columnSrded; }
    /**
     * SRPSTNID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrpstnid() { return _columnSrpstnid; }
    /**
     * SRLINCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrlincd() { return _columnSrlincd; }
    /**
     * SRRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrrnk() { return _columnSrrnk; }
    /**
     * SSCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSscd() { return _columnSscd; }
    /**
     * SSNM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSsnm() { return _columnSsnm; }
    /**
     * ZZMATNR: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzmatnr() { return _columnZzmatnr; }
    /**
     * SLQACB: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlqacb() { return _columnSlqacb; }
    /**
     * SLQACT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlqact() { return _columnSlqact; }
    /**
     * LINBLK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk() { return _columnLinblk; }
    /**
     * LOCNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocno() { return _columnLocno; }
    /**
     * LOCID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocid() { return _columnLocid; }
    /**
     * DLVPRTRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvprtrnk() { return _columnDlvprtrnk; }
    /**
     * DLVSNM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvsnm() { return _columnDlvsnm; }
    /**
     * DLVDTLSNM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvdtlsnm() { return _columnDlvdtlsnm; }
    /**
     * SROPRTCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtcnt() { return _columnSroprtcnt; }
    /**
     * TTSROPRTCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTtsroprtcnt() { return _columnTtsroprtcnt; }
    /**
     * TTTOPDEDRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTttopdedrnk() { return _columnTttopdedrnk; }
    /**
     * BRTYP: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrtyp() { return _columnBrtyp; }
    /**
     * BOXNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxno() { return _columnBoxno; }
    /**
     * BOXNOCNSNM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxnocnsnm() { return _columnBoxnocnsnm; }
    /**
     * BOXTYP: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxtyp() { return _columnBoxtyp; }
    /**
     * MGBOXDID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMgboxdid() { return _columnMgboxdid; }
    /**
     * DMDID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDmdid() { return _columnDmdid; }
    /**
     * TTBOXQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTtboxqa() { return _columnTtboxqa; }
    /**
     * BOXCTQATA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxctqata() { return _columnBoxctqata; }
    /**
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxctqaapsrplc() { return _columnBoxctqaapsrplc; }
    /**
     * DRCLSTLBCBID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDrclstlbcbid() { return _columnDrclstlbcbid; }
    /**
     * LBBOXNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLbboxno() { return _columnLbboxno; }
    /**
     * LBTTBOXQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLbttboxqa() { return _columnLbttboxqa; }
    /**
     * SEND_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * WORK_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
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
        ls.add(columnMhShippingId());
        ls.add(columnDpcd());
        ls.add(columnDlvymd());
        ls.add(columnDed());
        ls.add(columnPstnid());
        ls.add(columnSrded());
        ls.add(columnSrpstnid());
        ls.add(columnSrlincd());
        ls.add(columnSrrnk());
        ls.add(columnSscd());
        ls.add(columnSsnm());
        ls.add(columnZzmatnr());
        ls.add(columnSlqacb());
        ls.add(columnSlqact());
        ls.add(columnLinblk());
        ls.add(columnLocno());
        ls.add(columnLocid());
        ls.add(columnDlvprtrnk());
        ls.add(columnDlvsnm());
        ls.add(columnDlvdtlsnm());
        ls.add(columnSroprtcnt());
        ls.add(columnTtsroprtcnt());
        ls.add(columnTttopdedrnk());
        ls.add(columnBrtyp());
        ls.add(columnBoxno());
        ls.add(columnBoxnocnsnm());
        ls.add(columnBoxtyp());
        ls.add(columnMgboxdid());
        ls.add(columnDmdid());
        ls.add(columnTtboxqa());
        ls.add(columnBoxctqata());
        ls.add(columnBoxctqaapsrplc());
        ls.add(columnDrclstlbcbid());
        ls.add(columnLbboxno());
        ls.add(columnLbttboxqa());
        ls.add(columnSendCd());
        ls.add(columnWorkFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnMhShippingId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EMhShipping"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EMhShippingCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EMhShippingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EMhShipping> getEntityType() { return EMhShipping.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EMhShipping newEntity() { return new EMhShipping(); }
    public EMhShipping newMyEntity() { return new EMhShipping(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EMhShipping)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EMhShipping)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

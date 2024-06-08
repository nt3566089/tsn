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
 * The DB meta of E_ORDER_SPLIT_DATA. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EOrderSplitDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EOrderSplitDataDbm _instance = new EOrderSplitDataDbm();
    private EOrderSplitDataDbm() {}
    public static EOrderSplitDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getOrderSplitDataId(), (et, vl) -> ((EOrderSplitData)et).setOrderSplitDataId(ctl(vl)), "orderSplitDataId");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getSendCd(), (et, vl) -> ((EOrderSplitData)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getSendRowId(), (et, vl) -> ((EOrderSplitData)et).setSendRowId(ctl(vl)), "sendRowId");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getWorkFlg(), (et, vl) -> ((EOrderSplitData)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getRecFlg(), (et, vl) -> ((EOrderSplitData)et).setRecFlg((String)vl), "recFlg");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getSrwhcd(), (et, vl) -> ((EOrderSplitData)et).setSrwhcd((String)vl), "srwhcd");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getDpcd(), (et, vl) -> ((EOrderSplitData)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getDed(), (et, vl) -> ((EOrderSplitData)et).setDed((String)vl), "ded");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getPstnid(), (et, vl) -> ((EOrderSplitData)et).setPstnid((String)vl), "pstnid");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getDlvrnk(), (et, vl) -> ((EOrderSplitData)et).setDlvrnk((String)vl), "dlvrnk");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getDlvsnm(), (et, vl) -> ((EOrderSplitData)et).setDlvsnm(ctl(vl)), "dlvsnm");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getSroprtcnt(), (et, vl) -> ((EOrderSplitData)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getSscd(), (et, vl) -> ((EOrderSplitData)et).setSscd((String)vl), "sscd");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getDlvymd(), (et, vl) -> ((EOrderSplitData)et).setDlvymd((String)vl), "dlvymd");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getZzordymd(), (et, vl) -> ((EOrderSplitData)et).setZzordymd((String)vl), "zzordymd");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getSlpmrgtmg(), (et, vl) -> ((EOrderSplitData)et).setSlpmrgtmg((String)vl), "slpmrgtmg");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getOrdgr(), (et, vl) -> ((EOrderSplitData)et).setOrdgr((String)vl), "ordgr");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getS(), (et, vl) -> ((EOrderSplitData)et).setS(ctl(vl)), "s");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getH(), (et, vl) -> ((EOrderSplitData)et).setH(ctl(vl)), "h");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getM(), (et, vl) -> ((EOrderSplitData)et).setM(ctl(vl)), "m");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getSrymd(), (et, vl) -> ((EOrderSplitData)et).setSrymd((String)vl), "srymd");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getRlybscd(), (et, vl) -> ((EOrderSplitData)et).setRlybscd((String)vl), "rlybscd");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getKeepareah1(), (et, vl) -> ((EOrderSplitData)et).setKeepareah1((String)vl), "keepareah1");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getSlptyp(), (et, vl) -> ((EOrderSplitData)et).setSlptyp((String)vl), "slptyp");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getCmpcd(), (et, vl) -> ((EOrderSplitData)et).setCmpcd((String)vl), "cmpcd");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getSlpno(), (et, vl) -> ((EOrderSplitData)et).setSlpno((String)vl), "slpno");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getSlediv(), (et, vl) -> ((EOrderSplitData)et).setSlediv((String)vl), "slediv");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getCngprtslpno(), (et, vl) -> ((EOrderSplitData)et).setCngprtslpno((String)vl), "cngprtslpno");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getSpplymd(), (et, vl) -> ((EOrderSplitData)et).setSpplymd((String)vl), "spplymd");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getCggdid(), (et, vl) -> ((EOrderSplitData)et).setCggdid((String)vl), "cggdid");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getKeepareah2(), (et, vl) -> ((EOrderSplitData)et).setKeepareah2((String)vl), "keepareah2");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getZzmatnr(), (et, vl) -> ((EOrderSplitData)et).setZzmatnr((String)vl), "zzmatnr");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getBoxno(), (et, vl) -> ((EOrderSplitData)et).setBoxno((String)vl), "boxno");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getBoxtype(), (et, vl) -> ((EOrderSplitData)et).setBoxtype((String)vl), "boxtype");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getZzmatnrtotal(), (et, vl) -> ((EOrderSplitData)et).setZzmatnrtotal(ctl(vl)), "zzmatnrtotal");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getBoxnocnsnm(), (et, vl) -> ((EOrderSplitData)et).setBoxnocnsnm((String)vl), "boxnocnsnm");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getBxoszl(), (et, vl) -> ((EOrderSplitData)et).setBxoszl(ctl(vl)), "bxoszl");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getBxoszh(), (et, vl) -> ((EOrderSplitData)et).setBxoszh(ctl(vl)), "bxoszh");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getBxoszw(), (et, vl) -> ((EOrderSplitData)et).setBxoszw(ctl(vl)), "bxoszw");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getBoxtotalweigh(), (et, vl) -> ((EOrderSplitData)et).setBoxtotalweigh(ctl(vl)), "boxtotalweigh");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getWeightype(), (et, vl) -> ((EOrderSplitData)et).setWeightype((String)vl), "weightype");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getBoxtotalnumber(), (et, vl) -> ((EOrderSplitData)et).setBoxtotalnumber(ctl(vl)), "boxtotalnumber");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getKeepaream1(), (et, vl) -> ((EOrderSplitData)et).setKeepaream1((String)vl), "keepaream1");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getDelFlg(), (et, vl) -> ((EOrderSplitData)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getVersionNo(), (et, vl) -> ((EOrderSplitData)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getControlNo(), (et, vl) -> ((EOrderSplitData)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getAddDt(), (et, vl) -> ((EOrderSplitData)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getAddUser(), (et, vl) -> ((EOrderSplitData)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getAddProcess(), (et, vl) -> ((EOrderSplitData)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getUpdDt(), (et, vl) -> ((EOrderSplitData)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getUpdUser(), (et, vl) -> ((EOrderSplitData)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EOrderSplitData)et).getUpdProcess(), (et, vl) -> ((EOrderSplitData)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_ORDER_SPLIT_DATA";
    protected final String _tableDispName = "E_ORDER_SPLIT_DATA";
    protected final String _tablePropertyName = "EOrderSplitData";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_ORDER_SPLIT_DATA", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnOrderSplitDataId = cci("ORDER_SPLIT_DATA_ID", "ORDER_SPLIT_DATA_ID", null, null, Long.class, "orderSplitDataId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowId = cci("SEND_ROW_ID", "SEND_ROW_ID", null, null, Long.class, "sendRowId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRecFlg = cci("REC_FLG", "REC_FLG", null, null, String.class, "recFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrwhcd = cci("SRWHCD", "SRWHCD", null, null, String.class, "srwhcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDed = cci("DED", "DED", null, null, String.class, "ded", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPstnid = cci("PSTNID", "PSTNID", null, null, String.class, "pstnid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvrnk = cci("DLVRNK", "DLVRNK", null, null, String.class, "dlvrnk", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvsnm = cci("DLVSNM", "DLVSNM", null, null, Long.class, "dlvsnm", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSscd = cci("SSCD", "SSCD", null, null, String.class, "sscd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvymd = cci("DLVYMD", "DLVYMD", null, null, String.class, "dlvymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzordymd = cci("ZZORDYMD", "ZZORDYMD", null, null, String.class, "zzordymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlpmrgtmg = cci("SLPMRGTMG", "SLPMRGTMG", null, null, String.class, "slpmrgtmg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdgr = cci("ORDGR", "ORDGR", null, null, String.class, "ordgr", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnS = cci("S", "S", null, null, Long.class, "s", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnH = cci("H", "H", null, null, Long.class, "h", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnM = cci("M", "M", null, null, Long.class, "m", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrymd = cci("SRYMD", "SRYMD", null, null, String.class, "srymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlybscd = cci("RLYBSCD", "RLYBSCD", null, null, String.class, "rlybscd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKeepareah1 = cci("KEEPAREAH1", "KEEPAREAH1", null, null, String.class, "keepareah1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlptyp = cci("SLPTYP", "SLPTYP", null, null, String.class, "slptyp", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCmpcd = cci("CMPCD", "CMPCD", null, null, String.class, "cmpcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlpno = cci("SLPNO", "SLPNO", null, null, String.class, "slpno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlediv = cci("SLEDIV", "SLEDIV", null, null, String.class, "slediv", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCngprtslpno = cci("CNGPRTSLPNO", "CNGPRTSLPNO", null, null, String.class, "cngprtslpno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpplymd = cci("SPPLYMD", "SPPLYMD", null, null, String.class, "spplymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdid = cci("CGGDID", "CGGDID", null, null, String.class, "cggdid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKeepareah2 = cci("KEEPAREAH2", "KEEPAREAH2", null, null, String.class, "keepareah2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzmatnr = cci("ZZMATNR", "ZZMATNR", null, null, String.class, "zzmatnr", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxno = cci("BOXNO", "BOXNO", null, null, String.class, "boxno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxtype = cci("BOXTYPE", "BOXTYPE", null, null, String.class, "boxtype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzmatnrtotal = cci("ZZMATNRTOTAL", "ZZMATNRTOTAL", null, null, Long.class, "zzmatnrtotal", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxnocnsnm = cci("BOXNOCNSNM", "BOXNOCNSNM", null, null, String.class, "boxnocnsnm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxoszl = cci("BXOSZL", "BXOSZL", null, null, Long.class, "bxoszl", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxoszh = cci("BXOSZH", "BXOSZH", null, null, Long.class, "bxoszh", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxoszw = cci("BXOSZW", "BXOSZW", null, null, Long.class, "bxoszw", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxtotalweigh = cci("BOXTOTALWEIGH", "BOXTOTALWEIGH", null, null, Long.class, "boxtotalweigh", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWeightype = cci("WEIGHTYPE", "WEIGHTYPE", null, null, String.class, "weightype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxtotalnumber = cci("BOXTOTALNUMBER", "BOXTOTALNUMBER", null, null, Long.class, "boxtotalnumber", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKeepaream1 = cci("KEEPAREAM1", "KEEPAREAM1", null, null, String.class, "keepaream1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderSplitDataId() { return _columnOrderSplitDataId; }
    /**
     * SEND_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * SEND_ROW_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendRowId() { return _columnSendRowId; }
    /**
     * WORK_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * REC_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecFlg() { return _columnRecFlg; }
    /**
     * SRWHCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrwhcd() { return _columnSrwhcd; }
    /**
     * DPCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpcd() { return _columnDpcd; }
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
     * DLVRNK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvrnk() { return _columnDlvrnk; }
    /**
     * DLVSNM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvsnm() { return _columnDlvsnm; }
    /**
     * SROPRTCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtcnt() { return _columnSroprtcnt; }
    /**
     * SSCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSscd() { return _columnSscd; }
    /**
     * DLVYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvymd() { return _columnDlvymd; }
    /**
     * ZZORDYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzordymd() { return _columnZzordymd; }
    /**
     * SLPMRGTMG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlpmrgtmg() { return _columnSlpmrgtmg; }
    /**
     * ORDGR: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdgr() { return _columnOrdgr; }
    /**
     * S: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnS() { return _columnS; }
    /**
     * H: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnH() { return _columnH; }
    /**
     * M: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnM() { return _columnM; }
    /**
     * SRYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrymd() { return _columnSrymd; }
    /**
     * RLYBSCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlybscd() { return _columnRlybscd; }
    /**
     * KEEPAREAH1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKeepareah1() { return _columnKeepareah1; }
    /**
     * SLPTYP: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlptyp() { return _columnSlptyp; }
    /**
     * CMPCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmpcd() { return _columnCmpcd; }
    /**
     * SLPNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlpno() { return _columnSlpno; }
    /**
     * SLEDIV: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlediv() { return _columnSlediv; }
    /**
     * CNGPRTSLPNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCngprtslpno() { return _columnCngprtslpno; }
    /**
     * SPPLYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpplymd() { return _columnSpplymd; }
    /**
     * CGGDID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCggdid() { return _columnCggdid; }
    /**
     * KEEPAREAH2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKeepareah2() { return _columnKeepareah2; }
    /**
     * ZZMATNR: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzmatnr() { return _columnZzmatnr; }
    /**
     * BOXNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxno() { return _columnBoxno; }
    /**
     * BOXTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxtype() { return _columnBoxtype; }
    /**
     * ZZMATNRTOTAL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzmatnrtotal() { return _columnZzmatnrtotal; }
    /**
     * BOXNOCNSNM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxnocnsnm() { return _columnBoxnocnsnm; }
    /**
     * BXOSZL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxoszl() { return _columnBxoszl; }
    /**
     * BXOSZH: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxoszh() { return _columnBxoszh; }
    /**
     * BXOSZW: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxoszw() { return _columnBxoszw; }
    /**
     * BOXTOTALWEIGH: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxtotalweigh() { return _columnBoxtotalweigh; }
    /**
     * WEIGHTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWeightype() { return _columnWeightype; }
    /**
     * BOXTOTALNUMBER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxtotalnumber() { return _columnBoxtotalnumber; }
    /**
     * KEEPAREAM1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKeepaream1() { return _columnKeepaream1; }
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
        ls.add(columnOrderSplitDataId());
        ls.add(columnSendCd());
        ls.add(columnSendRowId());
        ls.add(columnWorkFlg());
        ls.add(columnRecFlg());
        ls.add(columnSrwhcd());
        ls.add(columnDpcd());
        ls.add(columnDed());
        ls.add(columnPstnid());
        ls.add(columnDlvrnk());
        ls.add(columnDlvsnm());
        ls.add(columnSroprtcnt());
        ls.add(columnSscd());
        ls.add(columnDlvymd());
        ls.add(columnZzordymd());
        ls.add(columnSlpmrgtmg());
        ls.add(columnOrdgr());
        ls.add(columnS());
        ls.add(columnH());
        ls.add(columnM());
        ls.add(columnSrymd());
        ls.add(columnRlybscd());
        ls.add(columnKeepareah1());
        ls.add(columnSlptyp());
        ls.add(columnCmpcd());
        ls.add(columnSlpno());
        ls.add(columnSlediv());
        ls.add(columnCngprtslpno());
        ls.add(columnSpplymd());
        ls.add(columnCggdid());
        ls.add(columnKeepareah2());
        ls.add(columnZzmatnr());
        ls.add(columnBoxno());
        ls.add(columnBoxtype());
        ls.add(columnZzmatnrtotal());
        ls.add(columnBoxnocnsnm());
        ls.add(columnBxoszl());
        ls.add(columnBxoszh());
        ls.add(columnBxoszw());
        ls.add(columnBoxtotalweigh());
        ls.add(columnWeightype());
        ls.add(columnBoxtotalnumber());
        ls.add(columnKeepaream1());
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
    protected UniqueInfo cpui() { return hpcpui(columnOrderSplitDataId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EOrderSplitData"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EOrderSplitDataCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EOrderSplitDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EOrderSplitData> getEntityType() { return EOrderSplitData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EOrderSplitData newEntity() { return new EOrderSplitData(); }
    public EOrderSplitData newMyEntity() { return new EOrderSplitData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EOrderSplitData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EOrderSplitData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

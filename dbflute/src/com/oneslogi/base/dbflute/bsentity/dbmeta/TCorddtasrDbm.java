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
 * The DB meta of T_CORDDTASR. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TCorddtasrDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TCorddtasrDbm _instance = new TCorddtasrDbm();
    private TCorddtasrDbm() {}
    public static TCorddtasrDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getOrderSortId(), (et, vl) -> ((TCorddtasr)et).setOrderSortId(ctl(vl)), "orderSortId");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getOrderHId(), (et, vl) -> ((TCorddtasr)et).setOrderHId(ctl(vl)), "orderHId");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSrwhcd(), (et, vl) -> ((TCorddtasr)et).setSrwhcd((String)vl), "srwhcd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getDpcd(), (et, vl) -> ((TCorddtasr)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getZzordymd(), (et, vl) -> ((TCorddtasr)et).setZzordymd((String)vl), "zzordymd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getOrdgr(), (et, vl) -> ((TCorddtasr)et).setOrdgr((String)vl), "ordgr");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getDlvymd(), (et, vl) -> ((TCorddtasr)et).setDlvymd((String)vl), "dlvymd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getDed(), (et, vl) -> ((TCorddtasr)et).setDed((String)vl), "ded");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getPstnid(), (et, vl) -> ((TCorddtasr)et).setPstnid((String)vl), "pstnid");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getScddlvymd(), (et, vl) -> ((TCorddtasr)et).setScddlvymd((String)vl), "scddlvymd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getScdded(), (et, vl) -> ((TCorddtasr)et).setScdded((String)vl), "scdded");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getScdpstnid(), (et, vl) -> ((TCorddtasr)et).setScdpstnid((String)vl), "scdpstnid");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getHpynid(), (et, vl) -> ((TCorddtasr)et).setHpynid((String)vl), "hpynid");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getIpynid(), (et, vl) -> ((TCorddtasr)et).setIpynid((String)vl), "ipynid");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSrded(), (et, vl) -> ((TCorddtasr)et).setSrded((String)vl), "srded");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSrpstnid(), (et, vl) -> ((TCorddtasr)et).setSrpstnid((String)vl), "srpstnid");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSrymd(), (et, vl) -> ((TCorddtasr)et).setSrymd((String)vl), "srymd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSroprtcnt(), (et, vl) -> ((TCorddtasr)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSrlincd(), (et, vl) -> ((TCorddtasr)et).setSrlincd((String)vl), "srlincd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSrrnk(), (et, vl) -> ((TCorddtasr)et).setSrrnk(ctl(vl)), "srrnk");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getDlvsnm(), (et, vl) -> ((TCorddtasr)et).setDlvsnm(ctl(vl)), "dlvsnm");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getDlvdtlsnm(), (et, vl) -> ((TCorddtasr)et).setDlvdtlsnm(ctb(vl)), "dlvdtlsnm");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSscd(), (et, vl) -> ((TCorddtasr)et).setSscd((String)vl), "sscd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSsnm(), (et, vl) -> ((TCorddtasr)et).setSsnm((String)vl), "ssnm");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getHdvid(), (et, vl) -> ((TCorddtasr)et).setHdvid((String)vl), "hdvid");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getDtlsnm(), (et, vl) -> ((TCorddtasr)et).setDtlsnm((String)vl), "dtlsnm");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getZzmatnr(), (et, vl) -> ((TCorddtasr)et).setZzmatnr((String)vl), "zzmatnr");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSlqacb(), (et, vl) -> ((TCorddtasr)et).setSlqacb(ctl(vl)), "slqacb");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSlqact(), (et, vl) -> ((TCorddtasr)et).setSlqact(ctl(vl)), "slqact");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSlqanum(), (et, vl) -> ((TCorddtasr)et).setSlqanum(ctl(vl)), "slqanum");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getLinblk(), (et, vl) -> ((TCorddtasr)et).setLinblk((String)vl), "linblk");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getLocno(), (et, vl) -> ((TCorddtasr)et).setLocno((String)vl), "locno");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getLocid(), (et, vl) -> ((TCorddtasr)et).setLocid((String)vl), "locid");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getDlvprtrnk(), (et, vl) -> ((TCorddtasr)et).setDlvprtrnk(ctl(vl)), "dlvprtrnk");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSrdlvymd(), (et, vl) -> ((TCorddtasr)et).setSrdlvymd((String)vl), "srdlvymd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSrhpynid(), (et, vl) -> ((TCorddtasr)et).setSrhpynid((String)vl), "srhpynid");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSripynid(), (et, vl) -> ((TCorddtasr)et).setSripynid((String)vl), "sripynid");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSrsrlincd(), (et, vl) -> ((TCorddtasr)et).setSrsrlincd((String)vl), "srsrlincd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSrsrrnk(), (et, vl) -> ((TCorddtasr)et).setSrsrrnk(ctl(vl)), "srsrrnk");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSrdlvsnm(), (et, vl) -> ((TCorddtasr)et).setSrdlvsnm(ctl(vl)), "srdlvsnm");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSrdlvdtlsnm(), (et, vl) -> ((TCorddtasr)et).setSrdlvdtlsnm(ctl(vl)), "srdlvdtlsnm");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSrdlvprtrnk(), (et, vl) -> ((TCorddtasr)et).setSrdlvprtrnk(ctl(vl)), "srdlvprtrnk");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getBrtyp(), (et, vl) -> ((TCorddtasr)et).setBrtyp((String)vl), "brtyp");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getBoxno(), (et, vl) -> ((TCorddtasr)et).setBoxno((String)vl), "boxno");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getBoxnocnsnm(), (et, vl) -> ((TCorddtasr)et).setBoxnocnsnm((String)vl), "boxnocnsnm");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getBoxtyp(), (et, vl) -> ((TCorddtasr)et).setBoxtyp((String)vl), "boxtyp");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getMgboxdid(), (et, vl) -> ((TCorddtasr)et).setMgboxdid((String)vl), "mgboxdid");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getDmdid(), (et, vl) -> ((TCorddtasr)et).setDmdid((String)vl), "dmdid");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getTtboxqa(), (et, vl) -> ((TCorddtasr)et).setTtboxqa(ctl(vl)), "ttboxqa");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getBoxctqata(), (et, vl) -> ((TCorddtasr)et).setBoxctqata(ctl(vl)), "boxctqata");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getBoxctqaapsrplc(), (et, vl) -> ((TCorddtasr)et).setBoxctqaapsrplc(ctl(vl)), "boxctqaapsrplc");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getTtsroprtcnt(), (et, vl) -> ((TCorddtasr)et).setTtsroprtcnt(ctl(vl)), "ttsroprtcnt");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getBxmtrid(), (et, vl) -> ((TCorddtasr)et).setBxmtrid((String)vl), "bxmtrid");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSpplymd(), (et, vl) -> ((TCorddtasr)et).setSpplymd((String)vl), "spplymd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSlptyp(), (et, vl) -> ((TCorddtasr)et).setSlptyp((String)vl), "slptyp");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSeqno(), (et, vl) -> ((TCorddtasr)et).setSeqno(ctl(vl)), "seqno");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getOtorgcd(), (et, vl) -> ((TCorddtasr)et).setOtorgcd((String)vl), "otorgcd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getOrdorgcd(), (et, vl) -> ((TCorddtasr)et).setOrdorgcd((String)vl), "ordorgcd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getRlybscd(), (et, vl) -> ((TCorddtasr)et).setRlybscd((String)vl), "rlybscd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getDlvrnk(), (et, vl) -> ((TCorddtasr)et).setDlvrnk((String)vl), "dlvrnk");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getLmpdlvno(), (et, vl) -> ((TCorddtasr)et).setLmpdlvno((String)vl), "lmpdlvno");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getDivmtd(), (et, vl) -> ((TCorddtasr)et).setDivmtd((String)vl), "divmtd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSlediv(), (et, vl) -> ((TCorddtasr)et).setSlediv((String)vl), "slediv");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getHvrtrsn(), (et, vl) -> ((TCorddtasr)et).setHvrtrsn((String)vl), "hvrtrsn");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getHvrtinotymd(), (et, vl) -> ((TCorddtasr)et).setHvrtinotymd((String)vl), "hvrtinotymd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getCngprtslpno(), (et, vl) -> ((TCorddtasr)et).setCngprtslpno((String)vl), "cngprtslpno");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getTrnsctndiv(), (et, vl) -> ((TCorddtasr)et).setTrnsctndiv((String)vl), "trnsctndiv");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getEosordaftflg(), (et, vl) -> ((TCorddtasr)et).setEosordaftflg((String)vl), "eosordaftflg");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getEosslpno(), (et, vl) -> ((TCorddtasr)et).setEosslpno((String)vl), "eosslpno");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getHdrdbxdiv(), (et, vl) -> ((TCorddtasr)et).setHdrdbxdiv((String)vl), "hdrdbxdiv");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getInotrfsldiv(), (et, vl) -> ((TCorddtasr)et).setInotrfsldiv((String)vl), "inotrfsldiv");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getBxmntrfsldiv(), (et, vl) -> ((TCorddtasr)et).setBxmntrfsldiv((String)vl), "bxmntrfsldiv");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSlpmrgtmg(), (et, vl) -> ((TCorddtasr)et).setSlpmrgtmg((String)vl), "slpmrgtmg");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSlpotymd(), (et, vl) -> ((TCorddtasr)et).setSlpotymd((String)vl), "slpotymd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getCmpcd(), (et, vl) -> ((TCorddtasr)et).setCmpcd((String)vl), "cmpcd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getStscd(), (et, vl) -> ((TCorddtasr)et).setStscd((String)vl), "stscd");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getStgval(), (et, vl) -> ((TCorddtasr)et).setStgval(ctl(vl)), "stgval");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getSlpno(), (et, vl) -> ((TCorddtasr)et).setSlpno((String)vl), "slpno");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getTttopdedrnk(), (et, vl) -> ((TCorddtasr)et).setTttopdedrnk(ctl(vl)), "tttopdedrnk");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getCordrcvcnt(), (et, vl) -> ((TCorddtasr)et).setCordrcvcnt(ctl(vl)), "cordrcvcnt");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getOrddvfg(), (et, vl) -> ((TCorddtasr)et).setOrddvfg((String)vl), "orddvfg");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getLbcbqa(), (et, vl) -> ((TCorddtasr)et).setLbcbqa(ctl(vl)), "lbcbqa");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getDrclstlbcbid(), (et, vl) -> ((TCorddtasr)et).setDrclstlbcbid((String)vl), "drclstlbcbid");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getLbboxno(), (et, vl) -> ((TCorddtasr)et).setLbboxno(ctl(vl)), "lbboxno");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getLbttboxqa(), (et, vl) -> ((TCorddtasr)et).setLbttboxqa(ctl(vl)), "lbttboxqa");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getIkeiincldflg(), (et, vl) -> ((TCorddtasr)et).setIkeiincldflg((String)vl), "ikeiincldflg");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getDelFlg(), (et, vl) -> ((TCorddtasr)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getVersionNo(), (et, vl) -> ((TCorddtasr)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getControlNo(), (et, vl) -> ((TCorddtasr)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getAddDt(), (et, vl) -> ((TCorddtasr)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getAddUser(), (et, vl) -> ((TCorddtasr)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getAddProcess(), (et, vl) -> ((TCorddtasr)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getUpdDt(), (et, vl) -> ((TCorddtasr)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getUpdUser(), (et, vl) -> ((TCorddtasr)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TCorddtasr)et).getUpdProcess(), (et, vl) -> ((TCorddtasr)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TCorddtasr)et).getTCordhdr(), (et, vl) -> ((TCorddtasr)et).setTCordhdr((TCordhdr)vl), "TCordhdr");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_CORDDTASR";
    protected final String _tableDispName = "T_CORDDTASR";
    protected final String _tablePropertyName = "TCorddtasr";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_CORDDTASR", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnOrderSortId = cci("ORDER_SORT_ID", "ORDER_SORT_ID", null, null, Long.class, "orderSortId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderHId = cci("ORDER_H_ID", "ORDER_H_ID", null, null, Long.class, "orderHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TCordhdr", null, null, false);
    protected final ColumnInfo _columnSrwhcd = cci("SRWHCD", "SRWHCD", null, null, String.class, "srwhcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzordymd = cci("ZZORDYMD", "ZZORDYMD", null, null, String.class, "zzordymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdgr = cci("ORDGR", "ORDGR", null, null, String.class, "ordgr", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvymd = cci("DLVYMD", "DLVYMD", null, null, String.class, "dlvymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDed = cci("DED", "DED", null, null, String.class, "ded", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPstnid = cci("PSTNID", "PSTNID", null, null, String.class, "pstnid", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScddlvymd = cci("SCDDLVYMD", "SCDDLVYMD", null, null, String.class, "scddlvymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScdded = cci("SCDDED", "SCDDED", null, null, String.class, "scdded", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScdpstnid = cci("SCDPSTNID", "SCDPSTNID", null, null, String.class, "scdpstnid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHpynid = cci("HPYNID", "HPYNID", null, null, String.class, "hpynid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIpynid = cci("IPYNID", "IPYNID", null, null, String.class, "ipynid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrded = cci("SRDED", "SRDED", null, null, String.class, "srded", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrpstnid = cci("SRPSTNID", "SRPSTNID", null, null, String.class, "srpstnid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrymd = cci("SRYMD", "SRYMD", null, null, String.class, "srymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrlincd = cci("SRLINCD", "SRLINCD", null, null, String.class, "srlincd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrrnk = cci("SRRNK", "SRRNK", null, null, Long.class, "srrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvsnm = cci("DLVSNM", "DLVSNM", null, null, Long.class, "dlvsnm", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvdtlsnm = cci("DLVDTLSNM", "DLVDTLSNM", null, null, java.math.BigDecimal.class, "dlvdtlsnm", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSscd = cci("SSCD", "SSCD", null, null, String.class, "sscd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSsnm = cci("SSNM", "SSNM", null, null, String.class, "ssnm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHdvid = cci("HDVID", "HDVID", null, null, String.class, "hdvid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtlsnm = cci("DTLSNM", "DTLSNM", null, null, String.class, "dtlsnm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzmatnr = cci("ZZMATNR", "ZZMATNR", null, null, String.class, "zzmatnr", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlqacb = cci("SLQACB", "SLQACB", null, null, Long.class, "slqacb", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlqact = cci("SLQACT", "SLQACT", null, null, Long.class, "slqact", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlqanum = cci("SLQANUM", "SLQANUM", null, null, Long.class, "slqanum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk = cci("LINBLK", "LINBLK", null, null, String.class, "linblk", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocno = cci("LOCNO", "LOCNO", null, null, String.class, "locno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocid = cci("LOCID", "LOCID", null, null, String.class, "locid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvprtrnk = cci("DLVPRTRNK", "DLVPRTRNK", null, null, Long.class, "dlvprtrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrdlvymd = cci("SRDLVYMD", "SRDLVYMD", null, null, String.class, "srdlvymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrhpynid = cci("SRHPYNID", "SRHPYNID", null, null, String.class, "srhpynid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSripynid = cci("SRIPYNID", "SRIPYNID", null, null, String.class, "sripynid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrsrlincd = cci("SRSRLINCD", "SRSRLINCD", null, null, String.class, "srsrlincd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrsrrnk = cci("SRSRRNK", "SRSRRNK", null, null, Long.class, "srsrrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrdlvsnm = cci("SRDLVSNM", "SRDLVSNM", null, null, Long.class, "srdlvsnm", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrdlvdtlsnm = cci("SRDLVDTLSNM", "SRDLVDTLSNM", null, null, Long.class, "srdlvdtlsnm", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrdlvprtrnk = cci("SRDLVPRTRNK", "SRDLVPRTRNK", null, null, Long.class, "srdlvprtrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrtyp = cci("BRTYP", "BRTYP", null, null, String.class, "brtyp", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxno = cci("BOXNO", "BOXNO", null, null, String.class, "boxno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxnocnsnm = cci("BOXNOCNSNM", "BOXNOCNSNM", null, null, String.class, "boxnocnsnm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxtyp = cci("BOXTYP", "BOXTYP", null, null, String.class, "boxtyp", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMgboxdid = cci("MGBOXDID", "MGBOXDID", null, null, String.class, "mgboxdid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDmdid = cci("DMDID", "DMDID", null, null, String.class, "dmdid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTtboxqa = cci("TTBOXQA", "TTBOXQA", null, null, Long.class, "ttboxqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxctqata = cci("BOXCTQATA", "BOXCTQATA", null, null, Long.class, "boxctqata", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxctqaapsrplc = cci("BOXCTQAAPSRPLC", "BOXCTQAAPSRPLC", null, null, Long.class, "boxctqaapsrplc", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTtsroprtcnt = cci("TTSROPRTCNT", "TTSROPRTCNT", null, null, Long.class, "ttsroprtcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxmtrid = cci("BXMTRID", "BXMTRID", null, null, String.class, "bxmtrid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpplymd = cci("SPPLYMD", "SPPLYMD", null, null, String.class, "spplymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlptyp = cci("SLPTYP", "SLPTYP", null, null, String.class, "slptyp", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeqno = cci("SEQNO", "SEQNO", null, null, Long.class, "seqno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtorgcd = cci("OTORGCD", "OTORGCD", null, null, String.class, "otorgcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdorgcd = cci("ORDORGCD", "ORDORGCD", null, null, String.class, "ordorgcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlybscd = cci("RLYBSCD", "RLYBSCD", null, null, String.class, "rlybscd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvrnk = cci("DLVRNK", "DLVRNK", null, null, String.class, "dlvrnk", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLmpdlvno = cci("LMPDLVNO", "LMPDLVNO", null, null, String.class, "lmpdlvno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDivmtd = cci("DIVMTD", "DIVMTD", null, null, String.class, "divmtd", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlediv = cci("SLEDIV", "SLEDIV", null, null, String.class, "slediv", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHvrtrsn = cci("HVRTRSN", "HVRTRSN", null, null, String.class, "hvrtrsn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHvrtinotymd = cci("HVRTINOTYMD", "HVRTINOTYMD", null, null, String.class, "hvrtinotymd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCngprtslpno = cci("CNGPRTSLPNO", "CNGPRTSLPNO", null, null, String.class, "cngprtslpno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrnsctndiv = cci("TRNSCTNDIV", "TRNSCTNDIV", null, null, String.class, "trnsctndiv", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEosordaftflg = cci("EOSORDAFTFLG", "EOSORDAFTFLG", null, null, String.class, "eosordaftflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEosslpno = cci("EOSSLPNO", "EOSSLPNO", null, null, String.class, "eosslpno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHdrdbxdiv = cci("HDRDBXDIV", "HDRDBXDIV", null, null, String.class, "hdrdbxdiv", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInotrfsldiv = cci("INOTRFSLDIV", "INOTRFSLDIV", null, null, String.class, "inotrfsldiv", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxmntrfsldiv = cci("BXMNTRFSLDIV", "BXMNTRFSLDIV", null, null, String.class, "bxmntrfsldiv", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlpmrgtmg = cci("SLPMRGTMG", "SLPMRGTMG", null, null, String.class, "slpmrgtmg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlpotymd = cci("SLPOTYMD", "SLPOTYMD", null, null, String.class, "slpotymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCmpcd = cci("CMPCD", "CMPCD", null, null, String.class, "cmpcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStscd = cci("STSCD", "STSCD", null, null, String.class, "stscd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStgval = cci("STGVAL", "STGVAL", null, null, Long.class, "stgval", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlpno = cci("SLPNO", "SLPNO", null, null, String.class, "slpno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTttopdedrnk = cci("TTTOPDEDRNK", "TTTOPDEDRNK", null, null, Long.class, "tttopdedrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCordrcvcnt = cci("CORDRCVCNT", "CORDRCVCNT", null, null, Long.class, "cordrcvcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrddvfg = cci("ORDDVFG", "ORDDVFG", null, null, String.class, "orddvfg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLbcbqa = cci("LBCBQA", "LBCBQA", null, null, Long.class, "lbcbqa", null, false, false, false, "bigint", 19, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDrclstlbcbid = cci("DRCLSTLBCBID", "DRCLSTLBCBID", null, null, String.class, "drclstlbcbid", null, false, false, false, "char", 1, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLbboxno = cci("LBBOXNO", "LBBOXNO", null, null, Long.class, "lbboxno", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLbttboxqa = cci("LBTTBOXQA", "LBTTBOXQA", null, null, Long.class, "lbttboxqa", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIkeiincldflg = cci("IKEIINCLDFLG", "IKEIINCLDFLG", null, null, String.class, "ikeiincldflg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
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
     * ORDER_SORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderSortId() { return _columnOrderSortId; }
    /**
     * ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderHId() { return _columnOrderHId; }
    /**
     * SRWHCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrwhcd() { return _columnSrwhcd; }
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
     * PSTNID: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPstnid() { return _columnPstnid; }
    /**
     * SCDDLVYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScddlvymd() { return _columnScddlvymd; }
    /**
     * SCDDED: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScdded() { return _columnScdded; }
    /**
     * SCDPSTNID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScdpstnid() { return _columnScdpstnid; }
    /**
     * HPYNID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHpynid() { return _columnHpynid; }
    /**
     * IPYNID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIpynid() { return _columnIpynid; }
    /**
     * SRDED: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrded() { return _columnSrded; }
    /**
     * SRPSTNID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrpstnid() { return _columnSrpstnid; }
    /**
     * SRYMD: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrymd() { return _columnSrymd; }
    /**
     * SROPRTCNT: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtcnt() { return _columnSroprtcnt; }
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
     * SSCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSscd() { return _columnSscd; }
    /**
     * SSNM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSsnm() { return _columnSsnm; }
    /**
     * HDVID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHdvid() { return _columnHdvid; }
    /**
     * DTLSNM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtlsnm() { return _columnDtlsnm; }
    /**
     * ZZMATNR: {NotNull, varchar(30)}
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
     * SLQANUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlqanum() { return _columnSlqanum; }
    /**
     * LINBLK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk() { return _columnLinblk; }
    /**
     * LOCNO: {varchar(30)}
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
     * SRDLVYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrdlvymd() { return _columnSrdlvymd; }
    /**
     * SRHPYNID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrhpynid() { return _columnSrhpynid; }
    /**
     * SRIPYNID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSripynid() { return _columnSripynid; }
    /**
     * SRSRLINCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrsrlincd() { return _columnSrsrlincd; }
    /**
     * SRSRRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrsrrnk() { return _columnSrsrrnk; }
    /**
     * SRDLVSNM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrdlvsnm() { return _columnSrdlvsnm; }
    /**
     * SRDLVDTLSNM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrdlvdtlsnm() { return _columnSrdlvdtlsnm; }
    /**
     * SRDLVPRTRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrdlvprtrnk() { return _columnSrdlvprtrnk; }
    /**
     * BRTYP: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrtyp() { return _columnBrtyp; }
    /**
     * BOXNO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxno() { return _columnBoxno; }
    /**
     * BOXNOCNSNM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxnocnsnm() { return _columnBoxnocnsnm; }
    /**
     * BOXTYP: {varchar(30)}
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
     * TTSROPRTCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTtsroprtcnt() { return _columnTtsroprtcnt; }
    /**
     * BXMTRID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxmtrid() { return _columnBxmtrid; }
    /**
     * SPPLYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpplymd() { return _columnSpplymd; }
    /**
     * SLPTYP: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlptyp() { return _columnSlptyp; }
    /**
     * SEQNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeqno() { return _columnSeqno; }
    /**
     * OTORGCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtorgcd() { return _columnOtorgcd; }
    /**
     * ORDORGCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdorgcd() { return _columnOrdorgcd; }
    /**
     * RLYBSCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlybscd() { return _columnRlybscd; }
    /**
     * DLVRNK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvrnk() { return _columnDlvrnk; }
    /**
     * LMPDLVNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLmpdlvno() { return _columnLmpdlvno; }
    /**
     * DIVMTD: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDivmtd() { return _columnDivmtd; }
    /**
     * SLEDIV: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlediv() { return _columnSlediv; }
    /**
     * HVRTRSN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHvrtrsn() { return _columnHvrtrsn; }
    /**
     * HVRTINOTYMD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHvrtinotymd() { return _columnHvrtinotymd; }
    /**
     * CNGPRTSLPNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCngprtslpno() { return _columnCngprtslpno; }
    /**
     * TRNSCTNDIV: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrnsctndiv() { return _columnTrnsctndiv; }
    /**
     * EOSORDAFTFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEosordaftflg() { return _columnEosordaftflg; }
    /**
     * EOSSLPNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEosslpno() { return _columnEosslpno; }
    /**
     * HDRDBXDIV: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHdrdbxdiv() { return _columnHdrdbxdiv; }
    /**
     * INOTRFSLDIV: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInotrfsldiv() { return _columnInotrfsldiv; }
    /**
     * BXMNTRFSLDIV: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxmntrfsldiv() { return _columnBxmntrfsldiv; }
    /**
     * SLPMRGTMG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlpmrgtmg() { return _columnSlpmrgtmg; }
    /**
     * SLPOTYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlpotymd() { return _columnSlpotymd; }
    /**
     * CMPCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmpcd() { return _columnCmpcd; }
    /**
     * STSCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStscd() { return _columnStscd; }
    /**
     * STGVAL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStgval() { return _columnStgval; }
    /**
     * SLPNO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlpno() { return _columnSlpno; }
    /**
     * TTTOPDEDRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTttopdedrnk() { return _columnTttopdedrnk; }
    /**
     * CORDRCVCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCordrcvcnt() { return _columnCordrcvcnt; }
    /**
     * ORDDVFG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrddvfg() { return _columnOrddvfg; }
    /**
     * LBCBQA: {bigint(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLbcbqa() { return _columnLbcbqa; }
    /**
     * DRCLSTLBCBID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDrclstlbcbid() { return _columnDrclstlbcbid; }
    /**
     * LBBOXNO: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLbboxno() { return _columnLbboxno; }
    /**
     * LBTTBOXQA: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLbttboxqa() { return _columnLbttboxqa; }
    /**
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIkeiincldflg() { return _columnIkeiincldflg; }
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
        ls.add(columnOrderSortId());
        ls.add(columnOrderHId());
        ls.add(columnSrwhcd());
        ls.add(columnDpcd());
        ls.add(columnZzordymd());
        ls.add(columnOrdgr());
        ls.add(columnDlvymd());
        ls.add(columnDed());
        ls.add(columnPstnid());
        ls.add(columnScddlvymd());
        ls.add(columnScdded());
        ls.add(columnScdpstnid());
        ls.add(columnHpynid());
        ls.add(columnIpynid());
        ls.add(columnSrded());
        ls.add(columnSrpstnid());
        ls.add(columnSrymd());
        ls.add(columnSroprtcnt());
        ls.add(columnSrlincd());
        ls.add(columnSrrnk());
        ls.add(columnDlvsnm());
        ls.add(columnDlvdtlsnm());
        ls.add(columnSscd());
        ls.add(columnSsnm());
        ls.add(columnHdvid());
        ls.add(columnDtlsnm());
        ls.add(columnZzmatnr());
        ls.add(columnSlqacb());
        ls.add(columnSlqact());
        ls.add(columnSlqanum());
        ls.add(columnLinblk());
        ls.add(columnLocno());
        ls.add(columnLocid());
        ls.add(columnDlvprtrnk());
        ls.add(columnSrdlvymd());
        ls.add(columnSrhpynid());
        ls.add(columnSripynid());
        ls.add(columnSrsrlincd());
        ls.add(columnSrsrrnk());
        ls.add(columnSrdlvsnm());
        ls.add(columnSrdlvdtlsnm());
        ls.add(columnSrdlvprtrnk());
        ls.add(columnBrtyp());
        ls.add(columnBoxno());
        ls.add(columnBoxnocnsnm());
        ls.add(columnBoxtyp());
        ls.add(columnMgboxdid());
        ls.add(columnDmdid());
        ls.add(columnTtboxqa());
        ls.add(columnBoxctqata());
        ls.add(columnBoxctqaapsrplc());
        ls.add(columnTtsroprtcnt());
        ls.add(columnBxmtrid());
        ls.add(columnSpplymd());
        ls.add(columnSlptyp());
        ls.add(columnSeqno());
        ls.add(columnOtorgcd());
        ls.add(columnOrdorgcd());
        ls.add(columnRlybscd());
        ls.add(columnDlvrnk());
        ls.add(columnLmpdlvno());
        ls.add(columnDivmtd());
        ls.add(columnSlediv());
        ls.add(columnHvrtrsn());
        ls.add(columnHvrtinotymd());
        ls.add(columnCngprtslpno());
        ls.add(columnTrnsctndiv());
        ls.add(columnEosordaftflg());
        ls.add(columnEosslpno());
        ls.add(columnHdrdbxdiv());
        ls.add(columnInotrfsldiv());
        ls.add(columnBxmntrfsldiv());
        ls.add(columnSlpmrgtmg());
        ls.add(columnSlpotymd());
        ls.add(columnCmpcd());
        ls.add(columnStscd());
        ls.add(columnStgval());
        ls.add(columnSlpno());
        ls.add(columnTttopdedrnk());
        ls.add(columnCordrcvcnt());
        ls.add(columnOrddvfg());
        ls.add(columnLbcbqa());
        ls.add(columnDrclstlbcbid());
        ls.add(columnLbboxno());
        ls.add(columnLbttboxqa());
        ls.add(columnIkeiincldflg());
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
    protected UniqueInfo cpui() { return hpcpui(columnOrderSortId()); }
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
     * T_CORDHDR by my ORDER_H_ID, named 'TCordhdr'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTCordhdr() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOrderHId(), TCordhdrDbm.getInstance().columnOrderHId());
        return cfi("T_CORDDTASR_FK1", "TCordhdr", this, TCordhdrDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TCorddtasrList", false);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TCorddtasr"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TCorddtasrCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TCorddtasrBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TCorddtasr> getEntityType() { return TCorddtasr.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TCorddtasr newEntity() { return new TCorddtasr(); }
    public TCorddtasr newMyEntity() { return new TCorddtasr(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TCorddtasr)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TCorddtasr)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

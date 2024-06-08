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
 * The DB meta of E_PRODUCT_M_SEND. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EProductMSendDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EProductMSendDbm _instance = new EProductMSendDbm();
    private EProductMSendDbm() {}
    public static EProductMSendDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EProductMSend)et).getProductMSendId(), (et, vl) -> ((EProductMSend)et).setProductMSendId(ctl(vl)), "productMSendId");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getCompanyCd(), (et, vl) -> ((EProductMSend)et).setCompanyCd((String)vl), "companyCd");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getProductCd(), (et, vl) -> ((EProductMSend)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getBrfnfl(), (et, vl) -> ((EProductMSend)et).setBrfnfl((String)vl), "brfnfl");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getBrfnhf(), (et, vl) -> ((EProductMSend)et).setBrfnhf((String)vl), "brfnhf");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getBranfl(), (et, vl) -> ((EProductMSend)et).setBranfl((String)vl), "branfl");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getBranhf(), (et, vl) -> ((EProductMSend)et).setBranhf((String)vl), "branhf");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getIoidCls(), (et, vl) -> ((EProductMSend)et).setIoidCls((String)vl), "ioidCls");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getOtrnk(), (et, vl) -> ((EProductMSend)et).setOtrnk(ctl(vl)), "otrnk");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getBrctg(), (et, vl) -> ((EProductMSend)et).setBrctg(ctl(vl)), "brctg");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getNumct(), (et, vl) -> ((EProductMSend)et).setNumct(ctl(vl)), "numct");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getCtnum(), (et, vl) -> ((EProductMSend)et).setCtnum(ctl(vl)), "ctnum");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getCbct(), (et, vl) -> ((EProductMSend)et).setCbct(ctl(vl)), "cbct");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getPatcbqa(), (et, vl) -> ((EProductMSend)et).setPatcbqa(ctl(vl)), "patcbqa");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getCtbcdid(), (et, vl) -> ((EProductMSend)et).setCtbcdid((String)vl), "ctbcdid");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getCtbcd(), (et, vl) -> ((EProductMSend)et).setCtbcd((String)vl), "ctbcd");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getCbbcdid(), (et, vl) -> ((EProductMSend)et).setCbbcdid((String)vl), "cbbcdid");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getCbbcd(), (et, vl) -> ((EProductMSend)et).setCbbcd((String)vl), "cbbcd");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getFwbrid(), (et, vl) -> ((EProductMSend)et).setFwbrid((String)vl), "fwbrid");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getCtfm(), (et, vl) -> ((EProductMSend)et).setCtfm((String)vl), "ctfm");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getCtszl(), (et, vl) -> ((EProductMSend)et).setCtszl(ctl(vl)), "ctszl");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getCtszw(), (et, vl) -> ((EProductMSend)et).setCtszw(ctl(vl)), "ctszw");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getCtszh(), (et, vl) -> ((EProductMSend)et).setCtszh(ctl(vl)), "ctszh");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getCtcc(), (et, vl) -> ((EProductMSend)et).setCtcc(ctl(vl)), "ctcc");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getCtweight(), (et, vl) -> ((EProductMSend)et).setCtweight(ctb(vl)), "ctweight");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getZzfrdateh(), (et, vl) -> ((EProductMSend)et).setZzfrdateh((String)vl), "zzfrdateh");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getZztodateh(), (et, vl) -> ((EProductMSend)et).setZztodateh((String)vl), "zztodateh");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getSendCd(), (et, vl) -> ((EProductMSend)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getWorkFlg(), (et, vl) -> ((EProductMSend)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getDelFlg(), (et, vl) -> ((EProductMSend)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getVersionNo(), (et, vl) -> ((EProductMSend)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getControlNo(), (et, vl) -> ((EProductMSend)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getAddDt(), (et, vl) -> ((EProductMSend)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getAddUser(), (et, vl) -> ((EProductMSend)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getAddProcess(), (et, vl) -> ((EProductMSend)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getUpdDt(), (et, vl) -> ((EProductMSend)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getUpdUser(), (et, vl) -> ((EProductMSend)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EProductMSend)et).getUpdProcess(), (et, vl) -> ((EProductMSend)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_PRODUCT_M_SEND";
    protected final String _tableDispName = "E_PRODUCT_M_SEND";
    protected final String _tablePropertyName = "EProductMSend";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_PRODUCT_M_SEND", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductMSendId = cci("PRODUCT_M_SEND_ID", "PRODUCT_M_SEND_ID", null, null, Long.class, "productMSendId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyCd = cci("COMPANY_CD", "COMPANY_CD", null, null, String.class, "companyCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrfnfl = cci("BRFNFL", "BRFNFL", null, null, String.class, "brfnfl", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrfnhf = cci("BRFNHF", "BRFNHF", null, null, String.class, "brfnhf", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBranfl = cci("BRANFL", "BRANFL", null, null, String.class, "branfl", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBranhf = cci("BRANHF", "BRANHF", null, null, String.class, "branhf", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIoidCls = cci("IOID_CLS", "IOID_CLS", null, null, String.class, "ioidCls", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtrnk = cci("OTRNK", "OTRNK", null, null, Long.class, "otrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrctg = cci("BRCTG", "BRCTG", null, null, Long.class, "brctg", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNumct = cci("NUMCT", "NUMCT", null, null, Long.class, "numct", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtnum = cci("CTNUM", "CTNUM", null, null, Long.class, "ctnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCbct = cci("CBCT", "CBCT", null, null, Long.class, "cbct", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPatcbqa = cci("PATCBQA", "PATCBQA", null, null, Long.class, "patcbqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtbcdid = cci("CTBCDID", "CTBCDID", null, null, String.class, "ctbcdid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtbcd = cci("CTBCD", "CTBCD", null, null, String.class, "ctbcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCbbcdid = cci("CBBCDID", "CBBCDID", null, null, String.class, "cbbcdid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCbbcd = cci("CBBCD", "CBBCD", null, null, String.class, "cbbcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwbrid = cci("FWBRID", "FWBRID", null, null, String.class, "fwbrid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtfm = cci("CTFM", "CTFM", null, null, String.class, "ctfm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtszl = cci("CTSZL", "CTSZL", null, null, Long.class, "ctszl", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtszw = cci("CTSZW", "CTSZW", null, null, Long.class, "ctszw", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtszh = cci("CTSZH", "CTSZH", null, null, Long.class, "ctszh", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtcc = cci("CTCC", "CTCC", null, null, Long.class, "ctcc", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCtweight = cci("CTWEIGHT", "CTWEIGHT", null, null, java.math.BigDecimal.class, "ctweight", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzfrdateh = cci("ZZFRDATEH", "ZZFRDATEH", null, null, String.class, "zzfrdateh", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZztodateh = cci("ZZTODATEH", "ZZTODATEH", null, null, String.class, "zztodateh", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
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
     * PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductMSendId() { return _columnProductMSendId; }
    /**
     * COMPANY_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyCd() { return _columnCompanyCd; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * BRFNFL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrfnfl() { return _columnBrfnfl; }
    /**
     * BRFNHF: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrfnhf() { return _columnBrfnhf; }
    /**
     * BRANFL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBranfl() { return _columnBranfl; }
    /**
     * BRANHF: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBranhf() { return _columnBranhf; }
    /**
     * IOID_CLS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIoidCls() { return _columnIoidCls; }
    /**
     * OTRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtrnk() { return _columnOtrnk; }
    /**
     * BRCTG: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrctg() { return _columnBrctg; }
    /**
     * NUMCT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumct() { return _columnNumct; }
    /**
     * CTNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtnum() { return _columnCtnum; }
    /**
     * CBCT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCbct() { return _columnCbct; }
    /**
     * PATCBQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPatcbqa() { return _columnPatcbqa; }
    /**
     * CTBCDID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtbcdid() { return _columnCtbcdid; }
    /**
     * CTBCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtbcd() { return _columnCtbcd; }
    /**
     * CBBCDID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCbbcdid() { return _columnCbbcdid; }
    /**
     * CBBCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCbbcd() { return _columnCbbcd; }
    /**
     * FWBRID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwbrid() { return _columnFwbrid; }
    /**
     * CTFM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtfm() { return _columnCtfm; }
    /**
     * CTSZL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtszl() { return _columnCtszl; }
    /**
     * CTSZW: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtszw() { return _columnCtszw; }
    /**
     * CTSZH: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtszh() { return _columnCtszh; }
    /**
     * CTCC: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtcc() { return _columnCtcc; }
    /**
     * CTWEIGHT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCtweight() { return _columnCtweight; }
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
     * SEND_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * WORK_FLG: {char(1), default=[(0)]}
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
        ls.add(columnProductMSendId());
        ls.add(columnCompanyCd());
        ls.add(columnProductCd());
        ls.add(columnBrfnfl());
        ls.add(columnBrfnhf());
        ls.add(columnBranfl());
        ls.add(columnBranhf());
        ls.add(columnIoidCls());
        ls.add(columnOtrnk());
        ls.add(columnBrctg());
        ls.add(columnNumct());
        ls.add(columnCtnum());
        ls.add(columnCbct());
        ls.add(columnPatcbqa());
        ls.add(columnCtbcdid());
        ls.add(columnCtbcd());
        ls.add(columnCbbcdid());
        ls.add(columnCbbcd());
        ls.add(columnFwbrid());
        ls.add(columnCtfm());
        ls.add(columnCtszl());
        ls.add(columnCtszw());
        ls.add(columnCtszh());
        ls.add(columnCtcc());
        ls.add(columnCtweight());
        ls.add(columnZzfrdateh());
        ls.add(columnZztodateh());
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
    protected UniqueInfo cpui() { return hpcpui(columnProductMSendId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EProductMSend"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EProductMSendCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EProductMSendBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EProductMSend> getEntityType() { return EProductMSend.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EProductMSend newEntity() { return new EProductMSend(); }
    public EProductMSend newMyEntity() { return new EProductMSend(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EProductMSend)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EProductMSend)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

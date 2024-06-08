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
 * The DB meta of T_SPLINFO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TSplinfoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TSplinfoDbm _instance = new TSplinfoDbm();
    private TSplinfoDbm() {}
    public static TSplinfoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TSplinfo)et).getSplinfoId(), (et, vl) -> ((TSplinfo)et).setSplinfoId(ctl(vl)), "splinfoId");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getCenterId(), (et, vl) -> ((TSplinfo)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getClientId(), (et, vl) -> ((TSplinfo)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getSplymd(), (et, vl) -> ((TSplinfo)et).setSplymd((String)vl), "splymd");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getUpddtm(), (et, vl) -> ((TSplinfo)et).setUpddtm(cttp(vl)), "upddtm");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getCsplnun(), (et, vl) -> ((TSplinfo)et).setCsplnun(ctl(vl)), "csplnun");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getLinblk(), (et, vl) -> ((TSplinfo)et).setLinblk((String)vl), "linblk");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getLocationId(), (et, vl) -> ((TSplinfo)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getLocationCd(), (et, vl) -> ((TSplinfo)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getProductId(), (et, vl) -> ((TSplinfo)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getProductCd(), (et, vl) -> ((TSplinfo)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getSplid(), (et, vl) -> ((TSplinfo)et).setSplid(ctb(vl)), "splid");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getDpcd(), (et, vl) -> ((TSplinfo)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getDed(), (et, vl) -> ((TSplinfo)et).setDed((String)vl), "ded");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getLocKbn(), (et, vl) -> ((TSplinfo)et).setLocKbn((String)vl), "locKbn");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getPrecb(), (et, vl) -> ((TSplinfo)et).setPrecb(ctl(vl)), "precb");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getPrect(), (et, vl) -> ((TSplinfo)et).setPrect(ctl(vl)), "prect");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getCalcb(), (et, vl) -> ((TSplinfo)et).setCalcb(ctl(vl)), "calcb");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getCalct(), (et, vl) -> ((TSplinfo)et).setCalct(ctl(vl)), "calct");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getReqcb(), (et, vl) -> ((TSplinfo)et).setReqcb(ctl(vl)), "reqcb");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getReqct(), (et, vl) -> ((TSplinfo)et).setReqct(ctl(vl)), "reqct");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getStatus(), (et, vl) -> ((TSplinfo)et).setStatus((String)vl), "status");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getRescb(), (et, vl) -> ((TSplinfo)et).setRescb(ctl(vl)), "rescb");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getRestb(), (et, vl) -> ((TSplinfo)et).setRestb(ctl(vl)), "restb");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getAbstosplcbqa(), (et, vl) -> ((TSplinfo)et).setAbstosplcbqa(ctl(vl)), "abstosplcbqa");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getAbstosplctqa(), (et, vl) -> ((TSplinfo)et).setAbstosplctqa(ctl(vl)), "abstosplctqa");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getAbscbqa(), (et, vl) -> ((TSplinfo)et).setAbscbqa(ctl(vl)), "abscbqa");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getRescbqa(), (et, vl) -> ((TSplinfo)et).setRescbqa(ctl(vl)), "rescbqa");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getLbkbn(), (et, vl) -> ((TSplinfo)et).setLbkbn(ctl(vl)), "lbkbn");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getPrtrnk(), (et, vl) -> ((TSplinfo)et).setPrtrnk(ctl(vl)), "prtrnk");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getDelFlg(), (et, vl) -> ((TSplinfo)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getVersionNo(), (et, vl) -> ((TSplinfo)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getControlNo(), (et, vl) -> ((TSplinfo)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getAddDt(), (et, vl) -> ((TSplinfo)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getAddUser(), (et, vl) -> ((TSplinfo)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getAddProcess(), (et, vl) -> ((TSplinfo)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getUpdDt(), (et, vl) -> ((TSplinfo)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getUpdUser(), (et, vl) -> ((TSplinfo)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TSplinfo)et).getUpdProcess(), (et, vl) -> ((TSplinfo)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TSplinfo)et).getMCenter(), (et, vl) -> ((TSplinfo)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TSplinfo)et).getMClient(), (et, vl) -> ((TSplinfo)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_SPLINFO";
    protected final String _tableDispName = "T_SPLINFO";
    protected final String _tablePropertyName = "TSplinfo";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_SPLINFO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSplinfoId = cci("SPLINFO_ID", "SPLINFO_ID", null, null, Long.class, "splinfoId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnSplymd = cci("SPLYMD", "SPLYMD", null, null, String.class, "splymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpddtm = cci("UPDDTM", "UPDDTM", null, null, java.sql.Timestamp.class, "upddtm", null, false, false, false, "datetime2", 26, 6, null, "NULL", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCsplnun = cci("CSPLNUN", "CSPLNUN", null, null, Long.class, "csplnun", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk = cci("LINBLK", "LINBLK", null, null, String.class, "linblk", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplid = cci("SPLID", "SPLID", null, null, java.math.BigDecimal.class, "splid", null, false, false, true, "decimal", 16, 6, null, "(1)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDed = cci("DED", "DED", null, null, String.class, "ded", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocKbn = cci("LOC_KBN", "LOC_KBN", null, null, String.class, "locKbn", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrecb = cci("PRECB", "PRECB", null, null, Long.class, "precb", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrect = cci("PRECT", "PRECT", null, null, Long.class, "prect", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCalcb = cci("CALCB", "CALCB", null, null, Long.class, "calcb", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCalct = cci("CALCT", "CALCT", null, null, Long.class, "calct", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReqcb = cci("REQCB", "REQCB", null, null, Long.class, "reqcb", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReqct = cci("REQCT", "REQCT", null, null, Long.class, "reqct", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStatus = cci("STATUS", "STATUS", null, null, String.class, "status", null, false, false, true, "varchar", 30, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRescb = cci("RESCB", "RESCB", null, null, Long.class, "rescb", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestb = cci("RESTB", "RESTB", null, null, Long.class, "restb", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAbstosplcbqa = cci("ABSTOSPLCBQA", "ABSTOSPLCBQA", null, null, Long.class, "abstosplcbqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAbstosplctqa = cci("ABSTOSPLCTQA", "ABSTOSPLCTQA", null, null, Long.class, "abstosplctqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAbscbqa = cci("ABSCBQA", "ABSCBQA", null, null, Long.class, "abscbqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRescbqa = cci("RESCBQA", "RESCBQA", null, null, Long.class, "rescbqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLbkbn = cci("LBKBN", "LBKBN", null, null, Long.class, "lbkbn", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrtrnk = cci("PRTRNK", "PRTRNK", null, null, Long.class, "prtrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplinfoId() { return _columnSplinfoId; }
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
     * SPLYMD: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplymd() { return _columnSplymd; }
    /**
     * UPDDTM: {datetime2(26, 6), default=[NULL]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpddtm() { return _columnUpddtm; }
    /**
     * CSPLNUN: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCsplnun() { return _columnCsplnun; }
    /**
     * LINBLK: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk() { return _columnLinblk; }
    /**
     * LOCATION_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LOCATION_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * SPLID: {NotNull, decimal(16, 6), default=[(1)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplid() { return _columnSplid; }
    /**
     * DPCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpcd() { return _columnDpcd; }
    /**
     * DED: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDed() { return _columnDed; }
    /**
     * LOC_KBN: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocKbn() { return _columnLocKbn; }
    /**
     * PRECB: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrecb() { return _columnPrecb; }
    /**
     * PRECT: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrect() { return _columnPrect; }
    /**
     * CALCB: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCalcb() { return _columnCalcb; }
    /**
     * CALCT: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCalct() { return _columnCalct; }
    /**
     * REQCB: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReqcb() { return _columnReqcb; }
    /**
     * REQCT: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReqct() { return _columnReqct; }
    /**
     * STATUS: {NotNull, varchar(30), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatus() { return _columnStatus; }
    /**
     * RESCB: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRescb() { return _columnRescb; }
    /**
     * RESTB: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestb() { return _columnRestb; }
    /**
     * ABSTOSPLCBQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAbstosplcbqa() { return _columnAbstosplcbqa; }
    /**
     * ABSTOSPLCTQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAbstosplctqa() { return _columnAbstosplctqa; }
    /**
     * ABSCBQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAbscbqa() { return _columnAbscbqa; }
    /**
     * RESCBQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRescbqa() { return _columnRescbqa; }
    /**
     * LBKBN: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLbkbn() { return _columnLbkbn; }
    /**
     * PRTRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrtrnk() { return _columnPrtrnk; }
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
        ls.add(columnSplinfoId());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnSplymd());
        ls.add(columnUpddtm());
        ls.add(columnCsplnun());
        ls.add(columnLinblk());
        ls.add(columnLocationId());
        ls.add(columnLocationCd());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnSplid());
        ls.add(columnDpcd());
        ls.add(columnDed());
        ls.add(columnLocKbn());
        ls.add(columnPrecb());
        ls.add(columnPrect());
        ls.add(columnCalcb());
        ls.add(columnCalct());
        ls.add(columnReqcb());
        ls.add(columnReqct());
        ls.add(columnStatus());
        ls.add(columnRescb());
        ls.add(columnRestb());
        ls.add(columnAbstosplcbqa());
        ls.add(columnAbstosplctqa());
        ls.add(columnAbscbqa());
        ls.add(columnRescbqa());
        ls.add(columnLbkbn());
        ls.add(columnPrtrnk());
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
    protected UniqueInfo cpui() { return hpcpui(columnSplinfoId()); }
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
        return cfi("T_SPLINFO_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TSplinfoList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_SPLINFO_FK1", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TSplinfoList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TSplinfo"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TSplinfoCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TSplinfoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TSplinfo> getEntityType() { return TSplinfo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TSplinfo newEntity() { return new TSplinfo(); }
    public TSplinfo newMyEntity() { return new TSplinfo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TSplinfo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TSplinfo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

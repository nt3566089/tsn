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
 * The DB meta of E_MH_STOCK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EMhStockDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EMhStockDbm _instance = new EMhStockDbm();
    private EMhStockDbm() {}
    public static EMhStockDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EMhStock)et).getMhStockId(), (et, vl) -> ((EMhStock)et).setMhStockId(ctl(vl)), "mhStockId");
        setupEpg(_epgMap, et -> ((EMhStock)et).getCompanyCd(), (et, vl) -> ((EMhStock)et).setCompanyCd((String)vl), "companyCd");
        setupEpg(_epgMap, et -> ((EMhStock)et).getLinblk(), (et, vl) -> ((EMhStock)et).setLinblk((String)vl), "linblk");
        setupEpg(_epgMap, et -> ((EMhStock)et).getZoneCd(), (et, vl) -> ((EMhStock)et).setZoneCd((String)vl), "zoneCd");
        setupEpg(_epgMap, et -> ((EMhStock)et).getLocno(), (et, vl) -> ((EMhStock)et).setLocno((String)vl), "locno");
        setupEpg(_epgMap, et -> ((EMhStock)et).getLockbn(), (et, vl) -> ((EMhStock)et).setLockbn((String)vl), "lockbn");
        setupEpg(_epgMap, et -> ((EMhStock)et).getProductCd(), (et, vl) -> ((EMhStock)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EMhStock)et).getTstinvcb(), (et, vl) -> ((EMhStock)et).setTstinvcb(ctl(vl)), "tstinvcb");
        setupEpg(_epgMap, et -> ((EMhStock)et).getTstinvct(), (et, vl) -> ((EMhStock)et).setTstinvct(ctl(vl)), "tstinvct");
        setupEpg(_epgMap, et -> ((EMhStock)et).getTosplcbqa(), (et, vl) -> ((EMhStock)et).setTosplcbqa(ctl(vl)), "tosplcbqa");
        setupEpg(_epgMap, et -> ((EMhStock)et).getTosplctqa(), (et, vl) -> ((EMhStock)et).setTosplctqa(ctl(vl)), "tosplctqa");
        setupEpg(_epgMap, et -> ((EMhStock)et).getTsplcb(), (et, vl) -> ((EMhStock)et).setTsplcb(ctl(vl)), "tsplcb");
        setupEpg(_epgMap, et -> ((EMhStock)et).getTsplct(), (et, vl) -> ((EMhStock)et).setTsplct(ctl(vl)), "tsplct");
        setupEpg(_epgMap, et -> ((EMhStock)et).getPresplcbqa(), (et, vl) -> ((EMhStock)et).setPresplcbqa(ctl(vl)), "presplcbqa");
        setupEpg(_epgMap, et -> ((EMhStock)et).getPresplctqa(), (et, vl) -> ((EMhStock)et).setPresplctqa(ctl(vl)), "presplctqa");
        setupEpg(_epgMap, et -> ((EMhStock)et).getTpresplcb(), (et, vl) -> ((EMhStock)et).setTpresplcb(ctl(vl)), "tpresplcb");
        setupEpg(_epgMap, et -> ((EMhStock)et).getTpresplct(), (et, vl) -> ((EMhStock)et).setTpresplct(ctl(vl)), "tpresplct");
        setupEpg(_epgMap, et -> ((EMhStock)et).getTinvmdtcbs(), (et, vl) -> ((EMhStock)et).setTinvmdtcbs((String)vl), "tinvmdtcbs");
        setupEpg(_epgMap, et -> ((EMhStock)et).getTinvmdtcb(), (et, vl) -> ((EMhStock)et).setTinvmdtcb(ctl(vl)), "tinvmdtcb");
        setupEpg(_epgMap, et -> ((EMhStock)et).getTinvmdtcts(), (et, vl) -> ((EMhStock)et).setTinvmdtcts((String)vl), "tinvmdtcts");
        setupEpg(_epgMap, et -> ((EMhStock)et).getTinvmdtct(), (et, vl) -> ((EMhStock)et).setTinvmdtct(ctl(vl)), "tinvmdtct");
        setupEpg(_epgMap, et -> ((EMhStock)et).getCsplnun(), (et, vl) -> ((EMhStock)et).setCsplnun(ctl(vl)), "csplnun");
        setupEpg(_epgMap, et -> ((EMhStock)et).getSendCd(), (et, vl) -> ((EMhStock)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EMhStock)et).getWorkFlg(), (et, vl) -> ((EMhStock)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EMhStock)et).getDelFlg(), (et, vl) -> ((EMhStock)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EMhStock)et).getVersionNo(), (et, vl) -> ((EMhStock)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EMhStock)et).getControlNo(), (et, vl) -> ((EMhStock)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EMhStock)et).getAddDt(), (et, vl) -> ((EMhStock)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EMhStock)et).getAddUser(), (et, vl) -> ((EMhStock)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EMhStock)et).getAddProcess(), (et, vl) -> ((EMhStock)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EMhStock)et).getUpdDt(), (et, vl) -> ((EMhStock)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EMhStock)et).getUpdUser(), (et, vl) -> ((EMhStock)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EMhStock)et).getUpdProcess(), (et, vl) -> ((EMhStock)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_MH_STOCK";
    protected final String _tableDispName = "E_MH_STOCK";
    protected final String _tablePropertyName = "EMhStock";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_MH_STOCK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMhStockId = cci("MH_STOCK_ID", "MH_STOCK_ID", null, null, Long.class, "mhStockId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyCd = cci("COMPANY_CD", "COMPANY_CD", null, null, String.class, "companyCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk = cci("LINBLK", "LINBLK", null, null, String.class, "linblk", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneCd = cci("ZONE_CD", "ZONE_CD", null, null, String.class, "zoneCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocno = cci("LOCNO", "LOCNO", null, null, String.class, "locno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLockbn = cci("LOCKBN", "LOCKBN", null, null, String.class, "lockbn", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTstinvcb = cci("TSTINVCB", "TSTINVCB", null, null, Long.class, "tstinvcb", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTstinvct = cci("TSTINVCT", "TSTINVCT", null, null, Long.class, "tstinvct", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTosplcbqa = cci("TOSPLCBQA", "TOSPLCBQA", null, null, Long.class, "tosplcbqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTosplctqa = cci("TOSPLCTQA", "TOSPLCTQA", null, null, Long.class, "tosplctqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTsplcb = cci("TSPLCB", "TSPLCB", null, null, Long.class, "tsplcb", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTsplct = cci("TSPLCT", "TSPLCT", null, null, Long.class, "tsplct", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPresplcbqa = cci("PRESPLCBQA", "PRESPLCBQA", null, null, Long.class, "presplcbqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPresplctqa = cci("PRESPLCTQA", "PRESPLCTQA", null, null, Long.class, "presplctqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTpresplcb = cci("TPRESPLCB", "TPRESPLCB", null, null, Long.class, "tpresplcb", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTpresplct = cci("TPRESPLCT", "TPRESPLCT", null, null, Long.class, "tpresplct", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTinvmdtcbs = cci("TINVMDTCBS", "TINVMDTCBS", null, null, String.class, "tinvmdtcbs", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTinvmdtcb = cci("TINVMDTCB", "TINVMDTCB", null, null, Long.class, "tinvmdtcb", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTinvmdtcts = cci("TINVMDTCTS", "TINVMDTCTS", null, null, String.class, "tinvmdtcts", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTinvmdtct = cci("TINVMDTCT", "TINVMDTCT", null, null, Long.class, "tinvmdtct", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCsplnun = cci("CSPLNUN", "CSPLNUN", null, null, Long.class, "csplnun", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMhStockId() { return _columnMhStockId; }
    /**
     * COMPANY_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyCd() { return _columnCompanyCd; }
    /**
     * LINBLK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk() { return _columnLinblk; }
    /**
     * ZONE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneCd() { return _columnZoneCd; }
    /**
     * LOCNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocno() { return _columnLocno; }
    /**
     * LOCKBN: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLockbn() { return _columnLockbn; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * TSTINVCB: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTstinvcb() { return _columnTstinvcb; }
    /**
     * TSTINVCT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTstinvct() { return _columnTstinvct; }
    /**
     * TOSPLCBQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTosplcbqa() { return _columnTosplcbqa; }
    /**
     * TOSPLCTQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTosplctqa() { return _columnTosplctqa; }
    /**
     * TSPLCB: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTsplcb() { return _columnTsplcb; }
    /**
     * TSPLCT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTsplct() { return _columnTsplct; }
    /**
     * PRESPLCBQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPresplcbqa() { return _columnPresplcbqa; }
    /**
     * PRESPLCTQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPresplctqa() { return _columnPresplctqa; }
    /**
     * TPRESPLCB: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTpresplcb() { return _columnTpresplcb; }
    /**
     * TPRESPLCT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTpresplct() { return _columnTpresplct; }
    /**
     * TINVMDTCBS: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTinvmdtcbs() { return _columnTinvmdtcbs; }
    /**
     * TINVMDTCB: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTinvmdtcb() { return _columnTinvmdtcb; }
    /**
     * TINVMDTCTS: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTinvmdtcts() { return _columnTinvmdtcts; }
    /**
     * TINVMDTCT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTinvmdtct() { return _columnTinvmdtct; }
    /**
     * CSPLNUN: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCsplnun() { return _columnCsplnun; }
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
        ls.add(columnMhStockId());
        ls.add(columnCompanyCd());
        ls.add(columnLinblk());
        ls.add(columnZoneCd());
        ls.add(columnLocno());
        ls.add(columnLockbn());
        ls.add(columnProductCd());
        ls.add(columnTstinvcb());
        ls.add(columnTstinvct());
        ls.add(columnTosplcbqa());
        ls.add(columnTosplctqa());
        ls.add(columnTsplcb());
        ls.add(columnTsplct());
        ls.add(columnPresplcbqa());
        ls.add(columnPresplctqa());
        ls.add(columnTpresplcb());
        ls.add(columnTpresplct());
        ls.add(columnTinvmdtcbs());
        ls.add(columnTinvmdtcb());
        ls.add(columnTinvmdtcts());
        ls.add(columnTinvmdtct());
        ls.add(columnCsplnun());
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
    protected UniqueInfo cpui() { return hpcpui(columnMhStockId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EMhStock"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EMhStockCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EMhStockBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EMhStock> getEntityType() { return EMhStock.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EMhStock newEntity() { return new EMhStock(); }
    public EMhStock newMyEntity() { return new EMhStock(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EMhStock)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EMhStock)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

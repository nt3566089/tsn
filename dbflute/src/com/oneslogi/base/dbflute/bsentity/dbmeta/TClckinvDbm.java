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
 * The DB meta of T_CLCKINV. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TClckinvDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TClckinvDbm _instance = new TClckinvDbm();
    private TClckinvDbm() {}
    public static TClckinvDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TClckinv)et).getClckinvId(), (et, vl) -> ((TClckinv)et).setClckinvId(ctl(vl)), "clckinvId");
        setupEpg(_epgMap, et -> ((TClckinv)et).getCenterId(), (et, vl) -> ((TClckinv)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TClckinv)et).getLocationId(), (et, vl) -> ((TClckinv)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TClckinv)et).getPresrcbqa(), (et, vl) -> ((TClckinv)et).setPresrcbqa(ctl(vl)), "presrcbqa");
        setupEpg(_epgMap, et -> ((TClckinv)et).getPresrctqa(), (et, vl) -> ((TClckinv)et).setPresrctqa(ctl(vl)), "presrctqa");
        setupEpg(_epgMap, et -> ((TClckinv)et).getLckcbivq(), (et, vl) -> ((TClckinv)et).setLckcbivq(ctl(vl)), "lckcbivq");
        setupEpg(_epgMap, et -> ((TClckinv)et).getLckctivq(), (et, vl) -> ((TClckinv)et).setLckctivq(ctl(vl)), "lckctivq");
        setupEpg(_epgMap, et -> ((TClckinv)et).getDscbqa(), (et, vl) -> ((TClckinv)et).setDscbqa(ctl(vl)), "dscbqa");
        setupEpg(_epgMap, et -> ((TClckinv)et).getDsctqa(), (et, vl) -> ((TClckinv)et).setDsctqa(ctl(vl)), "dsctqa");
        setupEpg(_epgMap, et -> ((TClckinv)et).getTosplcbqa(), (et, vl) -> ((TClckinv)et).setTosplcbqa(ctl(vl)), "tosplcbqa");
        setupEpg(_epgMap, et -> ((TClckinv)et).getTosplctqa(), (et, vl) -> ((TClckinv)et).setTosplctqa(ctl(vl)), "tosplctqa");
        setupEpg(_epgMap, et -> ((TClckinv)et).getPresplcbqa(), (et, vl) -> ((TClckinv)et).setPresplcbqa(ctl(vl)), "presplcbqa");
        setupEpg(_epgMap, et -> ((TClckinv)et).getPresplctqa(), (et, vl) -> ((TClckinv)et).setPresplctqa(ctl(vl)), "presplctqa");
        setupEpg(_epgMap, et -> ((TClckinv)et).getTstinvcb(), (et, vl) -> ((TClckinv)et).setTstinvcb(ctl(vl)), "tstinvcb");
        setupEpg(_epgMap, et -> ((TClckinv)et).getTstinvct(), (et, vl) -> ((TClckinv)et).setTstinvct(ctl(vl)), "tstinvct");
        setupEpg(_epgMap, et -> ((TClckinv)et).getTsplcb(), (et, vl) -> ((TClckinv)et).setTsplcb(ctl(vl)), "tsplcb");
        setupEpg(_epgMap, et -> ((TClckinv)et).getTsplct(), (et, vl) -> ((TClckinv)et).setTsplct(ctl(vl)), "tsplct");
        setupEpg(_epgMap, et -> ((TClckinv)et).getTpresplcb(), (et, vl) -> ((TClckinv)et).setTpresplcb(ctl(vl)), "tpresplcb");
        setupEpg(_epgMap, et -> ((TClckinv)et).getTpresplct(), (et, vl) -> ((TClckinv)et).setTpresplct(ctl(vl)), "tpresplct");
        setupEpg(_epgMap, et -> ((TClckinv)et).getTinvmdtcb(), (et, vl) -> ((TClckinv)et).setTinvmdtcb(ctl(vl)), "tinvmdtcb");
        setupEpg(_epgMap, et -> ((TClckinv)et).getTinvmdtct(), (et, vl) -> ((TClckinv)et).setTinvmdtct(ctl(vl)), "tinvmdtct");
        setupEpg(_epgMap, et -> ((TClckinv)et).getCsplnun(), (et, vl) -> ((TClckinv)et).setCsplnun(ctl(vl)), "csplnun");
        setupEpg(_epgMap, et -> ((TClckinv)et).getUpfg(), (et, vl) -> ((TClckinv)et).setUpfg((String)vl), "upfg");
        setupEpg(_epgMap, et -> ((TClckinv)et).getDelFlg(), (et, vl) -> ((TClckinv)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TClckinv)et).getVersionNo(), (et, vl) -> ((TClckinv)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TClckinv)et).getControlNo(), (et, vl) -> ((TClckinv)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TClckinv)et).getAddDt(), (et, vl) -> ((TClckinv)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TClckinv)et).getAddUser(), (et, vl) -> ((TClckinv)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TClckinv)et).getAddProcess(), (et, vl) -> ((TClckinv)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TClckinv)et).getUpdDt(), (et, vl) -> ((TClckinv)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TClckinv)et).getUpdUser(), (et, vl) -> ((TClckinv)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TClckinv)et).getUpdProcess(), (et, vl) -> ((TClckinv)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_CLCKINV";
    protected final String _tableDispName = "T_CLCKINV";
    protected final String _tablePropertyName = "TClckinv";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_CLCKINV", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClckinvId = cci("CLCKINV_ID", "CLCKINV_ID", null, null, Long.class, "clckinvId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPresrcbqa = cci("PRESRCBQA", "PRESRCBQA", null, null, Long.class, "presrcbqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPresrctqa = cci("PRESRCTQA", "PRESRCTQA", null, null, Long.class, "presrctqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLckcbivq = cci("LCKCBIVQ", "LCKCBIVQ", null, null, Long.class, "lckcbivq", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLckctivq = cci("LCKCTIVQ", "LCKCTIVQ", null, null, Long.class, "lckctivq", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDscbqa = cci("DSCBQA", "DSCBQA", null, null, Long.class, "dscbqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDsctqa = cci("DSCTQA", "DSCTQA", null, null, Long.class, "dsctqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTosplcbqa = cci("TOSPLCBQA", "TOSPLCBQA", null, null, Long.class, "tosplcbqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTosplctqa = cci("TOSPLCTQA", "TOSPLCTQA", null, null, Long.class, "tosplctqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPresplcbqa = cci("PRESPLCBQA", "PRESPLCBQA", null, null, Long.class, "presplcbqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPresplctqa = cci("PRESPLCTQA", "PRESPLCTQA", null, null, Long.class, "presplctqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTstinvcb = cci("TSTINVCB", "TSTINVCB", null, null, Long.class, "tstinvcb", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTstinvct = cci("TSTINVCT", "TSTINVCT", null, null, Long.class, "tstinvct", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTsplcb = cci("TSPLCB", "TSPLCB", null, null, Long.class, "tsplcb", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTsplct = cci("TSPLCT", "TSPLCT", null, null, Long.class, "tsplct", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTpresplcb = cci("TPRESPLCB", "TPRESPLCB", null, null, Long.class, "tpresplcb", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTpresplct = cci("TPRESPLCT", "TPRESPLCT", null, null, Long.class, "tpresplct", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTinvmdtcb = cci("TINVMDTCB", "TINVMDTCB", null, null, Long.class, "tinvmdtcb", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTinvmdtct = cci("TINVMDTCT", "TINVMDTCT", null, null, Long.class, "tinvmdtct", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCsplnun = cci("CSPLNUN", "CSPLNUN", null, null, Long.class, "csplnun", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpfg = cci("UPFG", "UPFG", null, null, String.class, "upfg", null, false, false, true, "varchar", 30, 0, null, "0", false, null, null, null, null, null, false);
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
     * CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClckinvId() { return _columnClckinvId; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * PRESRCBQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPresrcbqa() { return _columnPresrcbqa; }
    /**
     * PRESRCTQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPresrctqa() { return _columnPresrctqa; }
    /**
     * LCKCBIVQ: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLckcbivq() { return _columnLckcbivq; }
    /**
     * LCKCTIVQ: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLckctivq() { return _columnLckctivq; }
    /**
     * DSCBQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDscbqa() { return _columnDscbqa; }
    /**
     * DSCTQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDsctqa() { return _columnDsctqa; }
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
     * TINVMDTCB: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTinvmdtcb() { return _columnTinvmdtcb; }
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
     * UPFG: {NotNull, varchar(30), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpfg() { return _columnUpfg; }
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
        ls.add(columnClckinvId());
        ls.add(columnCenterId());
        ls.add(columnLocationId());
        ls.add(columnPresrcbqa());
        ls.add(columnPresrctqa());
        ls.add(columnLckcbivq());
        ls.add(columnLckctivq());
        ls.add(columnDscbqa());
        ls.add(columnDsctqa());
        ls.add(columnTosplcbqa());
        ls.add(columnTosplctqa());
        ls.add(columnPresplcbqa());
        ls.add(columnPresplctqa());
        ls.add(columnTstinvcb());
        ls.add(columnTstinvct());
        ls.add(columnTsplcb());
        ls.add(columnTsplct());
        ls.add(columnTpresplcb());
        ls.add(columnTpresplct());
        ls.add(columnTinvmdtcb());
        ls.add(columnTinvmdtct());
        ls.add(columnCsplnun());
        ls.add(columnUpfg());
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
    protected UniqueInfo cpui() { return hpcpui(columnClckinvId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TClckinv"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TClckinvCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TClckinvBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TClckinv> getEntityType() { return TClckinv.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TClckinv newEntity() { return new TClckinv(); }
    public TClckinv newMyEntity() { return new TClckinv(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TClckinv)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TClckinv)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

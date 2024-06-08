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
 * The DB meta of T_CSRWHADM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TCsrwhadmDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TCsrwhadmDbm _instance = new TCsrwhadmDbm();
    private TCsrwhadmDbm() {}
    public static TCsrwhadmDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getSortPlaceManageId(), (et, vl) -> ((TCsrwhadm)et).setSortPlaceManageId(ctl(vl)), "sortPlaceManageId");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getCenterId(), (et, vl) -> ((TCsrwhadm)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getZzorgncd(), (et, vl) -> ((TCsrwhadm)et).setZzorgncd((String)vl), "zzorgncd");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getSrymd(), (et, vl) -> ((TCsrwhadm)et).setSrymd((String)vl), "srymd");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getSroprtcnt(), (et, vl) -> ((TCsrwhadm)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getPresplcnt(), (et, vl) -> ((TCsrwhadm)et).setPresplcnt(ctl(vl)), "presplcnt");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getSrpmtfg(), (et, vl) -> ((TCsrwhadm)et).setSrpmtfg((String)vl), "srpmtfg");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getMntpmtfg(), (et, vl) -> ((TCsrwhadm)et).setMntpmtfg((String)vl), "mntpmtfg");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getCordrcvcnt(), (et, vl) -> ((TCsrwhadm)et).setCordrcvcnt(ctl(vl)), "cordrcvcnt");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getRefvalue(), (et, vl) -> ((TCsrwhadm)et).setRefvalue(ctl(vl)), "refvalue");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getSftpclmgn(), (et, vl) -> ((TCsrwhadm)et).setSftpclmgn(ctl(vl)), "sftpclmgn");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getTdayesrcompfg(), (et, vl) -> ((TCsrwhadm)et).setTdayesrcompfg((String)vl), "tdayesrcompfg");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getLocidfrnk(), (et, vl) -> ((TCsrwhadm)et).setLocidfrnk((String)vl), "locidfrnk");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getLocidfbrctg1(), (et, vl) -> ((TCsrwhadm)et).setLocidfbrctg1(ctl(vl)), "locidfbrctg1");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getLocidfbrctg2(), (et, vl) -> ((TCsrwhadm)et).setLocidfbrctg2(ctl(vl)), "locidfbrctg2");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getLocidfbrctg3(), (et, vl) -> ((TCsrwhadm)et).setLocidfbrctg3(ctl(vl)), "locidfbrctg3");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getLocidfbrctg4(), (et, vl) -> ((TCsrwhadm)et).setLocidfbrctg4(ctl(vl)), "locidfbrctg4");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getLocidfbrctg5(), (et, vl) -> ((TCsrwhadm)et).setLocidfbrctg5(ctl(vl)), "locidfbrctg5");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getLocidfbrctg6(), (et, vl) -> ((TCsrwhadm)et).setLocidfbrctg6(ctl(vl)), "locidfbrctg6");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getLocidfbrctg7(), (et, vl) -> ((TCsrwhadm)et).setLocidfbrctg7(ctl(vl)), "locidfbrctg7");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getLocidfbrctg8(), (et, vl) -> ((TCsrwhadm)et).setLocidfbrctg8(ctl(vl)), "locidfbrctg8");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getLocidfbrctg9(), (et, vl) -> ((TCsrwhadm)et).setLocidfbrctg9(ctl(vl)), "locidfbrctg9");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getLocidfbrctg10(), (et, vl) -> ((TCsrwhadm)et).setLocidfbrctg10(ctl(vl)), "locidfbrctg10");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getSortingFlg(), (et, vl) -> ((TCsrwhadm)et).setSortingFlg((String)vl), "sortingFlg");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getDelFlg(), (et, vl) -> ((TCsrwhadm)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getVersionNo(), (et, vl) -> ((TCsrwhadm)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getControlNo(), (et, vl) -> ((TCsrwhadm)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getAddDt(), (et, vl) -> ((TCsrwhadm)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getAddUser(), (et, vl) -> ((TCsrwhadm)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getAddProcess(), (et, vl) -> ((TCsrwhadm)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getUpdDt(), (et, vl) -> ((TCsrwhadm)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getUpdUser(), (et, vl) -> ((TCsrwhadm)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TCsrwhadm)et).getUpdProcess(), (et, vl) -> ((TCsrwhadm)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TCsrwhadm)et).getMCenter(), (et, vl) -> ((TCsrwhadm)et).setMCenter((MCenter)vl), "MCenter");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_CSRWHADM";
    protected final String _tableDispName = "T_CSRWHADM";
    protected final String _tablePropertyName = "TCsrwhadm";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_CSRWHADM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSortPlaceManageId = cci("SORT_PLACE_MANAGE_ID", "SORT_PLACE_MANAGE_ID", null, null, Long.class, "sortPlaceManageId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnZzorgncd = cci("ZZORGNCD", "ZZORGNCD", null, null, String.class, "zzorgncd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrymd = cci("SRYMD", "SRYMD", null, null, String.class, "srymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPresplcnt = cci("PRESPLCNT", "PRESPLCNT", null, null, Long.class, "presplcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrpmtfg = cci("SRPMTFG", "SRPMTFG", null, null, String.class, "srpmtfg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMntpmtfg = cci("MNTPMTFG", "MNTPMTFG", null, null, String.class, "mntpmtfg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCordrcvcnt = cci("CORDRCVCNT", "CORDRCVCNT", null, null, Long.class, "cordrcvcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefvalue = cci("REFVALUE", "REFVALUE", null, null, Long.class, "refvalue", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSftpclmgn = cci("SFTPCLMGN", "SFTPCLMGN", null, null, Long.class, "sftpclmgn", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTdayesrcompfg = cci("TDAYESRCOMPFG", "TDAYESRCOMPFG", null, null, String.class, "tdayesrcompfg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfrnk = cci("LOCIDFRNK", "LOCIDFRNK", null, null, String.class, "locidfrnk", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg1 = cci("LOCIDFBRCTG1", "LOCIDFBRCTG1", null, null, Long.class, "locidfbrctg1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg2 = cci("LOCIDFBRCTG2", "LOCIDFBRCTG2", null, null, Long.class, "locidfbrctg2", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg3 = cci("LOCIDFBRCTG3", "LOCIDFBRCTG3", null, null, Long.class, "locidfbrctg3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg4 = cci("LOCIDFBRCTG4", "LOCIDFBRCTG4", null, null, Long.class, "locidfbrctg4", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg5 = cci("LOCIDFBRCTG5", "LOCIDFBRCTG5", null, null, Long.class, "locidfbrctg5", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg6 = cci("LOCIDFBRCTG6", "LOCIDFBRCTG6", null, null, Long.class, "locidfbrctg6", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg7 = cci("LOCIDFBRCTG7", "LOCIDFBRCTG7", null, null, Long.class, "locidfbrctg7", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg8 = cci("LOCIDFBRCTG8", "LOCIDFBRCTG8", null, null, Long.class, "locidfbrctg8", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg9 = cci("LOCIDFBRCTG9", "LOCIDFBRCTG9", null, null, Long.class, "locidfbrctg9", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg10 = cci("LOCIDFBRCTG10", "LOCIDFBRCTG10", null, null, Long.class, "locidfbrctg10", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortingFlg = cci("SORTING_FLG", "SORTING_FLG", null, null, String.class, "sortingFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * SORT_PLACE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortPlaceManageId() { return _columnSortPlaceManageId; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzorgncd() { return _columnZzorgncd; }
    /**
     * SRYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrymd() { return _columnSrymd; }
    /**
     * SROPRTCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtcnt() { return _columnSroprtcnt; }
    /**
     * PRESPLCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPresplcnt() { return _columnPresplcnt; }
    /**
     * SRPMTFG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrpmtfg() { return _columnSrpmtfg; }
    /**
     * MNTPMTFG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMntpmtfg() { return _columnMntpmtfg; }
    /**
     * CORDRCVCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCordrcvcnt() { return _columnCordrcvcnt; }
    /**
     * REFVALUE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefvalue() { return _columnRefvalue; }
    /**
     * SFTPCLMGN: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSftpclmgn() { return _columnSftpclmgn; }
    /**
     * TDAYESRCOMPFG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdayesrcompfg() { return _columnTdayesrcompfg; }
    /**
     * LOCIDFRNK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfrnk() { return _columnLocidfrnk; }
    /**
     * LOCIDFBRCTG1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg1() { return _columnLocidfbrctg1; }
    /**
     * LOCIDFBRCTG2: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg2() { return _columnLocidfbrctg2; }
    /**
     * LOCIDFBRCTG3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg3() { return _columnLocidfbrctg3; }
    /**
     * LOCIDFBRCTG4: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg4() { return _columnLocidfbrctg4; }
    /**
     * LOCIDFBRCTG5: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg5() { return _columnLocidfbrctg5; }
    /**
     * LOCIDFBRCTG6: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg6() { return _columnLocidfbrctg6; }
    /**
     * LOCIDFBRCTG7: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg7() { return _columnLocidfbrctg7; }
    /**
     * LOCIDFBRCTG8: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg8() { return _columnLocidfbrctg8; }
    /**
     * LOCIDFBRCTG9: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg9() { return _columnLocidfbrctg9; }
    /**
     * LOCIDFBRCTG10: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg10() { return _columnLocidfbrctg10; }
    /**
     * SORTING_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortingFlg() { return _columnSortingFlg; }
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
        ls.add(columnSortPlaceManageId());
        ls.add(columnCenterId());
        ls.add(columnZzorgncd());
        ls.add(columnSrymd());
        ls.add(columnSroprtcnt());
        ls.add(columnPresplcnt());
        ls.add(columnSrpmtfg());
        ls.add(columnMntpmtfg());
        ls.add(columnCordrcvcnt());
        ls.add(columnRefvalue());
        ls.add(columnSftpclmgn());
        ls.add(columnTdayesrcompfg());
        ls.add(columnLocidfrnk());
        ls.add(columnLocidfbrctg1());
        ls.add(columnLocidfbrctg2());
        ls.add(columnLocidfbrctg3());
        ls.add(columnLocidfbrctg4());
        ls.add(columnLocidfbrctg5());
        ls.add(columnLocidfbrctg6());
        ls.add(columnLocidfbrctg7());
        ls.add(columnLocidfbrctg8());
        ls.add(columnLocidfbrctg9());
        ls.add(columnLocidfbrctg10());
        ls.add(columnSortingFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnSortPlaceManageId()); }
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
        return cfi("T_CSRWHADM_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TCsrwhadmList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TCsrwhadm"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TCsrwhadmCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TCsrwhadmBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TCsrwhadm> getEntityType() { return TCsrwhadm.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TCsrwhadm newEntity() { return new TCsrwhadm(); }
    public TCsrwhadm newMyEntity() { return new TCsrwhadm(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TCsrwhadm)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TCsrwhadm)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

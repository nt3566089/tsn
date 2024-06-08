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
 * The DB meta of M_CBLK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCblkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCblkDbm _instance = new MCblkDbm();
    private MCblkDbm() {}
    public static MCblkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCblk)et).getCblkId(), (et, vl) -> ((MCblk)et).setCblkId(ctl(vl)), "cblkId");
        setupEpg(_epgMap, et -> ((MCblk)et).getCenterId(), (et, vl) -> ((MCblk)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MCblk)et).getBlkcd(), (et, vl) -> ((MCblk)et).setBlkcd((String)vl), "blkcd");
        setupEpg(_epgMap, et -> ((MCblk)et).getBlknm(), (et, vl) -> ((MCblk)et).setBlknm((String)vl), "blknm");
        setupEpg(_epgMap, et -> ((MCblk)et).getSrdtlmkfg(), (et, vl) -> ((MCblk)et).setSrdtlmkfg((String)vl), "srdtlmkfg");
        setupEpg(_epgMap, et -> ((MCblk)et).getAminpfg(), (et, vl) -> ((MCblk)et).setAminpfg((String)vl), "aminpfg");
        setupEpg(_epgMap, et -> ((MCblk)et).getLblmkfg(), (et, vl) -> ((MCblk)et).setLblmkfg((String)vl), "lblmkfg");
        setupEpg(_epgMap, et -> ((MCblk)et).getLbldfg(), (et, vl) -> ((MCblk)et).setLbldfg((String)vl), "lbldfg");
        setupEpg(_epgMap, et -> ((MCblk)et).getBcddfg(), (et, vl) -> ((MCblk)et).setBcddfg((String)vl), "bcddfg");
        setupEpg(_epgMap, et -> ((MCblk)et).getLocidfrnk(), (et, vl) -> ((MCblk)et).setLocidfrnk((String)vl), "locidfrnk");
        setupEpg(_epgMap, et -> ((MCblk)et).getLocidfbrctg1(), (et, vl) -> ((MCblk)et).setLocidfbrctg1(ctl(vl)), "locidfbrctg1");
        setupEpg(_epgMap, et -> ((MCblk)et).getLocidfbrctg2(), (et, vl) -> ((MCblk)et).setLocidfbrctg2(ctl(vl)), "locidfbrctg2");
        setupEpg(_epgMap, et -> ((MCblk)et).getLocidfbrctg3(), (et, vl) -> ((MCblk)et).setLocidfbrctg3(ctl(vl)), "locidfbrctg3");
        setupEpg(_epgMap, et -> ((MCblk)et).getLocidfbrctg4(), (et, vl) -> ((MCblk)et).setLocidfbrctg4(ctl(vl)), "locidfbrctg4");
        setupEpg(_epgMap, et -> ((MCblk)et).getLocidfbrctg5(), (et, vl) -> ((MCblk)et).setLocidfbrctg5(ctl(vl)), "locidfbrctg5");
        setupEpg(_epgMap, et -> ((MCblk)et).getLocidfbrctg6(), (et, vl) -> ((MCblk)et).setLocidfbrctg6(ctl(vl)), "locidfbrctg6");
        setupEpg(_epgMap, et -> ((MCblk)et).getLocidfbrctg7(), (et, vl) -> ((MCblk)et).setLocidfbrctg7(ctl(vl)), "locidfbrctg7");
        setupEpg(_epgMap, et -> ((MCblk)et).getLocidfbrctg8(), (et, vl) -> ((MCblk)et).setLocidfbrctg8(ctl(vl)), "locidfbrctg8");
        setupEpg(_epgMap, et -> ((MCblk)et).getLocidfbrctg9(), (et, vl) -> ((MCblk)et).setLocidfbrctg9(ctl(vl)), "locidfbrctg9");
        setupEpg(_epgMap, et -> ((MCblk)et).getLocidfbrctg10(), (et, vl) -> ((MCblk)et).setLocidfbrctg10(ctl(vl)), "locidfbrctg10");
        setupEpg(_epgMap, et -> ((MCblk)et).getSftpclrsfid(), (et, vl) -> ((MCblk)et).setSftpclrsfid((String)vl), "sftpclrsfid");
        setupEpg(_epgMap, et -> ((MCblk)et).getTsnboxrsfid(), (et, vl) -> ((MCblk)et).setTsnboxrsfid((String)vl), "tsnboxrsfid");
        setupEpg(_epgMap, et -> ((MCblk)et).getJtboxrsfid(), (et, vl) -> ((MCblk)et).setJtboxrsfid((String)vl), "jtboxrsfid");
        setupEpg(_epgMap, et -> ((MCblk)et).getHdrdboxrsfid(), (et, vl) -> ((MCblk)et).setHdrdboxrsfid((String)vl), "hdrdboxrsfid");
        setupEpg(_epgMap, et -> ((MCblk)et).getOdrdvrsfid(), (et, vl) -> ((MCblk)et).setOdrdvrsfid((String)vl), "odrdvrsfid");
        setupEpg(_epgMap, et -> ((MCblk)et).getPkgrt(), (et, vl) -> ((MCblk)et).setPkgrt(ctl(vl)), "pkgrt");
        setupEpg(_epgMap, et -> ((MCblk)et).getSprprsid(), (et, vl) -> ((MCblk)et).setSprprsid((String)vl), "sprprsid");
        setupEpg(_epgMap, et -> ((MCblk)et).getDelFlg(), (et, vl) -> ((MCblk)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCblk)et).getVersionNo(), (et, vl) -> ((MCblk)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCblk)et).getControlNo(), (et, vl) -> ((MCblk)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCblk)et).getAddDt(), (et, vl) -> ((MCblk)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCblk)et).getAddUser(), (et, vl) -> ((MCblk)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCblk)et).getAddProcess(), (et, vl) -> ((MCblk)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCblk)et).getUpdDt(), (et, vl) -> ((MCblk)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCblk)et).getUpdUser(), (et, vl) -> ((MCblk)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCblk)et).getUpdProcess(), (et, vl) -> ((MCblk)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCblk)et).getMCenter(), (et, vl) -> ((MCblk)et).setMCenter((MCenter)vl), "MCenter");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CBLK";
    protected final String _tableDispName = "M_CBLK";
    protected final String _tablePropertyName = "MCblk";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CBLK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCblkId = cci("CBLK_ID", "CBLK_ID", null, null, Long.class, "cblkId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnBlkcd = cci("BLKCD", "BLKCD", null, null, String.class, "blkcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlknm = cci("BLKNM", "BLKNM", null, null, String.class, "blknm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrdtlmkfg = cci("SRDTLMKFG", "SRDTLMKFG", null, null, String.class, "srdtlmkfg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAminpfg = cci("AMINPFG", "AMINPFG", null, null, String.class, "aminpfg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLblmkfg = cci("LBLMKFG", "LBLMKFG", null, null, String.class, "lblmkfg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLbldfg = cci("LBLDFG", "LBLDFG", null, null, String.class, "lbldfg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBcddfg = cci("BCDDFG", "BCDDFG", null, null, String.class, "bcddfg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfrnk = cci("LOCIDFRNK", "LOCIDFRNK", null, null, String.class, "locidfrnk", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnSftpclrsfid = cci("SFTPCLRSFID", "SFTPCLRSFID", null, null, String.class, "sftpclrsfid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTsnboxrsfid = cci("TSNBOXRSFID", "TSNBOXRSFID", null, null, String.class, "tsnboxrsfid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJtboxrsfid = cci("JTBOXRSFID", "JTBOXRSFID", null, null, String.class, "jtboxrsfid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHdrdboxrsfid = cci("HDRDBOXRSFID", "HDRDBOXRSFID", null, null, String.class, "hdrdboxrsfid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOdrdvrsfid = cci("ODRDVRSFID", "ODRDVRSFID", null, null, String.class, "odrdvrsfid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPkgrt = cci("PKGRT", "PKGRT", null, null, Long.class, "pkgrt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprprsid = cci("SPRPRSID", "SPRPRSID", null, null, String.class, "sprprsid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * CBLK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCblkId() { return _columnCblkId; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * BLKCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlkcd() { return _columnBlkcd; }
    /**
     * BLKNM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlknm() { return _columnBlknm; }
    /**
     * SRDTLMKFG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrdtlmkfg() { return _columnSrdtlmkfg; }
    /**
     * AMINPFG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAminpfg() { return _columnAminpfg; }
    /**
     * LBLMKFG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLblmkfg() { return _columnLblmkfg; }
    /**
     * LBLDFG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLbldfg() { return _columnLbldfg; }
    /**
     * BCDDFG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBcddfg() { return _columnBcddfg; }
    /**
     * LOCIDFRNK: {char(1)}
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
     * SFTPCLRSFID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSftpclrsfid() { return _columnSftpclrsfid; }
    /**
     * TSNBOXRSFID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTsnboxrsfid() { return _columnTsnboxrsfid; }
    /**
     * JTBOXRSFID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJtboxrsfid() { return _columnJtboxrsfid; }
    /**
     * HDRDBOXRSFID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHdrdboxrsfid() { return _columnHdrdboxrsfid; }
    /**
     * ODRDVRSFID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOdrdvrsfid() { return _columnOdrdvrsfid; }
    /**
     * PKGRT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPkgrt() { return _columnPkgrt; }
    /**
     * SPRPRSID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprprsid() { return _columnSprprsid; }
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
        ls.add(columnCblkId());
        ls.add(columnCenterId());
        ls.add(columnBlkcd());
        ls.add(columnBlknm());
        ls.add(columnSrdtlmkfg());
        ls.add(columnAminpfg());
        ls.add(columnLblmkfg());
        ls.add(columnLbldfg());
        ls.add(columnBcddfg());
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
        ls.add(columnSftpclrsfid());
        ls.add(columnTsnboxrsfid());
        ls.add(columnJtboxrsfid());
        ls.add(columnHdrdboxrsfid());
        ls.add(columnOdrdvrsfid());
        ls.add(columnPkgrt());
        ls.add(columnSprprsid());
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
    protected UniqueInfo cpui() { return hpcpui(columnCblkId()); }
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
        return cfi("M_CBLK_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCblkList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCblk"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCblkCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCblkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCblk> getEntityType() { return MCblk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCblk newEntity() { return new MCblk(); }
    public MCblk newMyEntity() { return new MCblk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCblk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCblk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

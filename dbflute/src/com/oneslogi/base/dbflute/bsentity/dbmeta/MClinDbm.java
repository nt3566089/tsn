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
 * The DB meta of M_CLIN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MClinDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MClinDbm _instance = new MClinDbm();
    private MClinDbm() {}
    public static MClinDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MClin)et).getClinId(), (et, vl) -> ((MClin)et).setClinId(ctl(vl)), "clinId");
        setupEpg(_epgMap, et -> ((MClin)et).getLincd(), (et, vl) -> ((MClin)et).setLincd((String)vl), "lincd");
        setupEpg(_epgMap, et -> ((MClin)et).getLinnm(), (et, vl) -> ((MClin)et).setLinnm((String)vl), "linnm");
        setupEpg(_epgMap, et -> ((MClin)et).getSplctg(), (et, vl) -> ((MClin)et).setSplctg((String)vl), "splctg");
        setupEpg(_epgMap, et -> ((MClin)et).getLinblk1(), (et, vl) -> ((MClin)et).setLinblk1((String)vl), "linblk1");
        setupEpg(_epgMap, et -> ((MClin)et).getLinblk2(), (et, vl) -> ((MClin)et).setLinblk2((String)vl), "linblk2");
        setupEpg(_epgMap, et -> ((MClin)et).getSftpclrsfid(), (et, vl) -> ((MClin)et).setSftpclrsfid((String)vl), "sftpclrsfid");
        setupEpg(_epgMap, et -> ((MClin)et).getTsnboxrsfid(), (et, vl) -> ((MClin)et).setTsnboxrsfid((String)vl), "tsnboxrsfid");
        setupEpg(_epgMap, et -> ((MClin)et).getJtboxrsfid(), (et, vl) -> ((MClin)et).setJtboxrsfid((String)vl), "jtboxrsfid");
        setupEpg(_epgMap, et -> ((MClin)et).getHdrdboxrsfid(), (et, vl) -> ((MClin)et).setHdrdboxrsfid((String)vl), "hdrdboxrsfid");
        setupEpg(_epgMap, et -> ((MClin)et).getOdrdvrsfid(), (et, vl) -> ((MClin)et).setOdrdvrsfid((String)vl), "odrdvrsfid");
        setupEpg(_epgMap, et -> ((MClin)et).getPkgrt(), (et, vl) -> ((MClin)et).setPkgrt(ctl(vl)), "pkgrt");
        setupEpg(_epgMap, et -> ((MClin)et).getLinblk3(), (et, vl) -> ((MClin)et).setLinblk3((String)vl), "linblk3");
        setupEpg(_epgMap, et -> ((MClin)et).getSprprsid(), (et, vl) -> ((MClin)et).setSprprsid((String)vl), "sprprsid");
        setupEpg(_epgMap, et -> ((MClin)et).getCenterId(), (et, vl) -> ((MClin)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MClin)et).getDelFlg(), (et, vl) -> ((MClin)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MClin)et).getVersionNo(), (et, vl) -> ((MClin)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MClin)et).getControlNo(), (et, vl) -> ((MClin)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MClin)et).getAddDt(), (et, vl) -> ((MClin)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MClin)et).getAddUser(), (et, vl) -> ((MClin)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MClin)et).getAddProcess(), (et, vl) -> ((MClin)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MClin)et).getUpdDt(), (et, vl) -> ((MClin)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MClin)et).getUpdUser(), (et, vl) -> ((MClin)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MClin)et).getUpdProcess(), (et, vl) -> ((MClin)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MClin)et).getMCenter(), (et, vl) -> ((MClin)et).setMCenter((MCenter)vl), "MCenter");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CLIN";
    protected final String _tableDispName = "M_CLIN";
    protected final String _tablePropertyName = "MClin";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CLIN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClinId = cci("CLIN_ID", "CLIN_ID", null, null, Long.class, "clinId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLincd = cci("LINCD", "LINCD", null, null, String.class, "lincd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinnm = cci("LINNM", "LINNM", null, null, String.class, "linnm", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplctg = cci("SPLCTG", "SPLCTG", null, null, String.class, "splctg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk1 = cci("LINBLK1", "LINBLK1", null, null, String.class, "linblk1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk2 = cci("LINBLK2", "LINBLK2", null, null, String.class, "linblk2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSftpclrsfid = cci("SFTPCLRSFID", "SFTPCLRSFID", null, null, String.class, "sftpclrsfid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTsnboxrsfid = cci("TSNBOXRSFID", "TSNBOXRSFID", null, null, String.class, "tsnboxrsfid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJtboxrsfid = cci("JTBOXRSFID", "JTBOXRSFID", null, null, String.class, "jtboxrsfid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHdrdboxrsfid = cci("HDRDBOXRSFID", "HDRDBOXRSFID", null, null, String.class, "hdrdboxrsfid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOdrdvrsfid = cci("ODRDVRSFID", "ODRDVRSFID", null, null, String.class, "odrdvrsfid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPkgrt = cci("PKGRT", "PKGRT", null, null, Long.class, "pkgrt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk3 = cci("LINBLK3", "LINBLK3", null, null, String.class, "linblk3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprprsid = cci("SPRPRSID", "SPRPRSID", null, null, String.class, "sprprsid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
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
     * CLIN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClinId() { return _columnClinId; }
    /**
     * LINCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLincd() { return _columnLincd; }
    /**
     * LINNM: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinnm() { return _columnLinnm; }
    /**
     * SPLCTG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplctg() { return _columnSplctg; }
    /**
     * LINBLK1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk1() { return _columnLinblk1; }
    /**
     * LINBLK2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk2() { return _columnLinblk2; }
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
     * LINBLK3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk3() { return _columnLinblk3; }
    /**
     * SPRPRSID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprprsid() { return _columnSprprsid; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
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
        ls.add(columnClinId());
        ls.add(columnLincd());
        ls.add(columnLinnm());
        ls.add(columnSplctg());
        ls.add(columnLinblk1());
        ls.add(columnLinblk2());
        ls.add(columnSftpclrsfid());
        ls.add(columnTsnboxrsfid());
        ls.add(columnJtboxrsfid());
        ls.add(columnHdrdboxrsfid());
        ls.add(columnOdrdvrsfid());
        ls.add(columnPkgrt());
        ls.add(columnLinblk3());
        ls.add(columnSprprsid());
        ls.add(columnCenterId());
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
    protected UniqueInfo cpui() { return hpcpui(columnClinId()); }
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
        return cfi("M_CLIN_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MClinList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MClin"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MClinCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MClinBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MClin> getEntityType() { return MClin.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MClin newEntity() { return new MClin(); }
    public MClin newMyEntity() { return new MClin(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MClin)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MClin)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

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
 * The DB meta of T_TRINVCORRECT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrinvcorrectDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrinvcorrectDbm _instance = new TTrinvcorrectDbm();
    private TTrinvcorrectDbm() {}
    public static TTrinvcorrectDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getTrinvcorrectId(), (et, vl) -> ((TTrinvcorrect)et).setTrinvcorrectId(ctl(vl)), "trinvcorrectId");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getCaseinventoryno(), (et, vl) -> ((TTrinvcorrect)et).setCaseinventoryno(ctb(vl)), "caseinventoryno");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getCorrectqty(), (et, vl) -> ((TTrinvcorrect)et).setCorrectqty(ctb(vl)), "correctqty");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getPutdmycasecd(), (et, vl) -> ((TTrinvcorrect)et).setPutdmycasecd(ctb(vl)), "putdmycasecd");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getPutdmycutcasecd(), (et, vl) -> ((TTrinvcorrect)et).setPutdmycutcasecd(ctb(vl)), "putdmycutcasecd");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getPutdmycasedetailno(), (et, vl) -> ((TTrinvcorrect)et).setPutdmycasedetailno(ctl(vl)), "putdmycasedetailno");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getPutdmydirectionno(), (et, vl) -> ((TTrinvcorrect)et).setPutdmydirectionno(ctl(vl)), "putdmydirectionno");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getPutdmydirectionordergno(), (et, vl) -> ((TTrinvcorrect)et).setPutdmydirectionordergno(ctl(vl)), "putdmydirectionordergno");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getActflg(), (et, vl) -> ((TTrinvcorrect)et).setActflg(ctb(vl)), "actflg");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getCenterId(), (et, vl) -> ((TTrinvcorrect)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getClientId(), (et, vl) -> ((TTrinvcorrect)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getDelFlg(), (et, vl) -> ((TTrinvcorrect)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getVersionNo(), (et, vl) -> ((TTrinvcorrect)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getControlNo(), (et, vl) -> ((TTrinvcorrect)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getAddDt(), (et, vl) -> ((TTrinvcorrect)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getAddUser(), (et, vl) -> ((TTrinvcorrect)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getAddProcess(), (et, vl) -> ((TTrinvcorrect)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getUpdDt(), (et, vl) -> ((TTrinvcorrect)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getUpdUser(), (et, vl) -> ((TTrinvcorrect)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrinvcorrect)et).getUpdProcess(), (et, vl) -> ((TTrinvcorrect)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrinvcorrect)et).getMCenter(), (et, vl) -> ((TTrinvcorrect)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TTrinvcorrect)et).getMClient(), (et, vl) -> ((TTrinvcorrect)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRINVCORRECT";
    protected final String _tableDispName = "T_TRINVCORRECT";
    protected final String _tablePropertyName = "TTrinvcorrect";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRINVCORRECT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrinvcorrectId = cci("TRINVCORRECT_ID", "TRINVCORRECT_ID", null, null, Long.class, "trinvcorrectId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseinventoryno = cci("CASEINVENTORYNO", "CASEINVENTORYNO", null, null, java.math.BigDecimal.class, "caseinventoryno", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCorrectqty = cci("CORRECTQTY", "CORRECTQTY", null, null, java.math.BigDecimal.class, "correctqty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPutdmycasecd = cci("PUTDMYCASECD", "PUTDMYCASECD", null, null, java.math.BigDecimal.class, "putdmycasecd", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPutdmycutcasecd = cci("PUTDMYCUTCASECD", "PUTDMYCUTCASECD", null, null, java.math.BigDecimal.class, "putdmycutcasecd", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPutdmycasedetailno = cci("PUTDMYCASEDETAILNO", "PUTDMYCASEDETAILNO", null, null, Long.class, "putdmycasedetailno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPutdmydirectionno = cci("PUTDMYDIRECTIONNO", "PUTDMYDIRECTIONNO", null, null, Long.class, "putdmydirectionno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPutdmydirectionordergno = cci("PUTDMYDIRECTIONORDERGNO", "PUTDMYDIRECTIONORDERGNO", null, null, Long.class, "putdmydirectionordergno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnActflg = cci("ACTFLG", "ACTFLG", null, null, java.math.BigDecimal.class, "actflg", null, false, false, true, "decimal", 16, 6, null, "(1)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
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
     * TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrinvcorrectId() { return _columnTrinvcorrectId; }
    /**
     * CASEINVENTORYNO: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseinventoryno() { return _columnCaseinventoryno; }
    /**
     * CORRECTQTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorrectqty() { return _columnCorrectqty; }
    /**
     * PUTDMYCASECD: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPutdmycasecd() { return _columnPutdmycasecd; }
    /**
     * PUTDMYCUTCASECD: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPutdmycutcasecd() { return _columnPutdmycutcasecd; }
    /**
     * PUTDMYCASEDETAILNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPutdmycasedetailno() { return _columnPutdmycasedetailno; }
    /**
     * PUTDMYDIRECTIONNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPutdmydirectionno() { return _columnPutdmydirectionno; }
    /**
     * PUTDMYDIRECTIONORDERGNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPutdmydirectionordergno() { return _columnPutdmydirectionordergno; }
    /**
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnActflg() { return _columnActflg; }
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
        ls.add(columnTrinvcorrectId());
        ls.add(columnCaseinventoryno());
        ls.add(columnCorrectqty());
        ls.add(columnPutdmycasecd());
        ls.add(columnPutdmycutcasecd());
        ls.add(columnPutdmycasedetailno());
        ls.add(columnPutdmydirectionno());
        ls.add(columnPutdmydirectionordergno());
        ls.add(columnActflg());
        ls.add(columnCenterId());
        ls.add(columnClientId());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrinvcorrectId()); }
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
        return cfi("T_TRINVCORRECT_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrinvcorrectList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_TRINVCORRECT_FK2", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrinvcorrectList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrinvcorrect"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrinvcorrectCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrinvcorrectBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrinvcorrect> getEntityType() { return TTrinvcorrect.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrinvcorrect newEntity() { return new TTrinvcorrect(); }
    public TTrinvcorrect newMyEntity() { return new TTrinvcorrect(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrinvcorrect)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrinvcorrect)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

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
 * The DB meta of M_MFRCVDESIGN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MMfrcvdesignDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MMfrcvdesignDbm _instance = new MMfrcvdesignDbm();
    private MMfrcvdesignDbm() {}
    public static MMfrcvdesignDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getMfrcvdesignId(), (et, vl) -> ((MMfrcvdesign)et).setMfrcvdesignId(ctl(vl)), "mfrcvdesignId");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getClientId(), (et, vl) -> ((MMfrcvdesign)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getProductId(), (et, vl) -> ((MMfrcvdesign)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getRcvfrdate(), (et, vl) -> ((MMfrcvdesign)et).setRcvfrdate((String)vl), "rcvfrdate");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getRcvtodate(), (et, vl) -> ((MMfrcvdesign)et).setRcvtodate((String)vl), "rcvtodate");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getValidtype(), (et, vl) -> ((MMfrcvdesign)et).setValidtype((String)vl), "validtype");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getVaExtdata1(), (et, vl) -> ((MMfrcvdesign)et).setVaExtdata1((String)vl), "vaExtdata1");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getVaExtdata2(), (et, vl) -> ((MMfrcvdesign)et).setVaExtdata2((String)vl), "vaExtdata2");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getVaExtdata3(), (et, vl) -> ((MMfrcvdesign)et).setVaExtdata3((String)vl), "vaExtdata3");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getNvExtdata1(), (et, vl) -> ((MMfrcvdesign)et).setNvExtdata1((String)vl), "nvExtdata1");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getNvExtdata2(), (et, vl) -> ((MMfrcvdesign)et).setNvExtdata2((String)vl), "nvExtdata2");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getNvExtdata3(), (et, vl) -> ((MMfrcvdesign)et).setNvExtdata3((String)vl), "nvExtdata3");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getNmExtdata1(), (et, vl) -> ((MMfrcvdesign)et).setNmExtdata1(ctl(vl)), "nmExtdata1");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getNmExtdata2(), (et, vl) -> ((MMfrcvdesign)et).setNmExtdata2(ctl(vl)), "nmExtdata2");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getNmExtdata3(), (et, vl) -> ((MMfrcvdesign)et).setNmExtdata3(ctl(vl)), "nmExtdata3");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getDtExtdata1(), (et, vl) -> ((MMfrcvdesign)et).setDtExtdata1((String)vl), "dtExtdata1");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getDtExtdata2(), (et, vl) -> ((MMfrcvdesign)et).setDtExtdata2((String)vl), "dtExtdata2");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getDtExtdata3(), (et, vl) -> ((MMfrcvdesign)et).setDtExtdata3((String)vl), "dtExtdata3");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getDistributioncd(), (et, vl) -> ((MMfrcvdesign)et).setDistributioncd((String)vl), "distributioncd");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getDesignflg(), (et, vl) -> ((MMfrcvdesign)et).setDesignflg((String)vl), "designflg");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getDelFlg(), (et, vl) -> ((MMfrcvdesign)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getVersionNo(), (et, vl) -> ((MMfrcvdesign)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getControlNo(), (et, vl) -> ((MMfrcvdesign)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getAddDt(), (et, vl) -> ((MMfrcvdesign)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getAddUser(), (et, vl) -> ((MMfrcvdesign)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getAddProcess(), (et, vl) -> ((MMfrcvdesign)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getUpdDt(), (et, vl) -> ((MMfrcvdesign)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getUpdUser(), (et, vl) -> ((MMfrcvdesign)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MMfrcvdesign)et).getUpdProcess(), (et, vl) -> ((MMfrcvdesign)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MMfrcvdesign)et).getMClient(), (et, vl) -> ((MMfrcvdesign)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_MFRCVDESIGN";
    protected final String _tableDispName = "M_MFRCVDESIGN";
    protected final String _tablePropertyName = "MMfrcvdesign";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_MFRCVDESIGN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMfrcvdesignId = cci("MFRCVDESIGN_ID", "MFRCVDESIGN_ID", null, null, Long.class, "mfrcvdesignId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvfrdate = cci("RCVFRDATE", "RCVFRDATE", null, null, String.class, "rcvfrdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvtodate = cci("RCVTODATE", "RCVTODATE", null, null, String.class, "rcvtodate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValidtype = cci("VALIDTYPE", "VALIDTYPE", null, null, String.class, "validtype", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata1 = cci("VA_EXTDATA1", "VA_EXTDATA1", null, null, String.class, "vaExtdata1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata2 = cci("VA_EXTDATA2", "VA_EXTDATA2", null, null, String.class, "vaExtdata2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata3 = cci("VA_EXTDATA3", "VA_EXTDATA3", null, null, String.class, "vaExtdata3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata1 = cci("NV_EXTDATA1", "NV_EXTDATA1", null, null, String.class, "nvExtdata1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata2 = cci("NV_EXTDATA2", "NV_EXTDATA2", null, null, String.class, "nvExtdata2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata3 = cci("NV_EXTDATA3", "NV_EXTDATA3", null, null, String.class, "nvExtdata3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata1 = cci("NM_EXTDATA1", "NM_EXTDATA1", null, null, Long.class, "nmExtdata1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata2 = cci("NM_EXTDATA2", "NM_EXTDATA2", null, null, Long.class, "nmExtdata2", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata3 = cci("NM_EXTDATA3", "NM_EXTDATA3", null, null, Long.class, "nmExtdata3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata1 = cci("DT_EXTDATA1", "DT_EXTDATA1", null, null, String.class, "dtExtdata1", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata2 = cci("DT_EXTDATA2", "DT_EXTDATA2", null, null, String.class, "dtExtdata2", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata3 = cci("DT_EXTDATA3", "DT_EXTDATA3", null, null, String.class, "dtExtdata3", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistributioncd = cci("DISTRIBUTIONCD", "DISTRIBUTIONCD", null, null, String.class, "distributioncd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignflg = cci("DESIGNFLG", "DESIGNFLG", null, null, String.class, "designflg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * MFRCVDESIGN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMfrcvdesignId() { return _columnMfrcvdesignId; }
    /**
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * RCVFRDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvfrdate() { return _columnRcvfrdate; }
    /**
     * RCVTODATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvtodate() { return _columnRcvtodate; }
    /**
     * VALIDTYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidtype() { return _columnValidtype; }
    /**
     * VA_EXTDATA1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata1() { return _columnVaExtdata1; }
    /**
     * VA_EXTDATA2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata2() { return _columnVaExtdata2; }
    /**
     * VA_EXTDATA3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata3() { return _columnVaExtdata3; }
    /**
     * NV_EXTDATA1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata1() { return _columnNvExtdata1; }
    /**
     * NV_EXTDATA2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata2() { return _columnNvExtdata2; }
    /**
     * NV_EXTDATA3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata3() { return _columnNvExtdata3; }
    /**
     * NM_EXTDATA1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata1() { return _columnNmExtdata1; }
    /**
     * NM_EXTDATA2: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata2() { return _columnNmExtdata2; }
    /**
     * NM_EXTDATA3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata3() { return _columnNmExtdata3; }
    /**
     * DT_EXTDATA1: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata1() { return _columnDtExtdata1; }
    /**
     * DT_EXTDATA2: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata2() { return _columnDtExtdata2; }
    /**
     * DT_EXTDATA3: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata3() { return _columnDtExtdata3; }
    /**
     * DISTRIBUTIONCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistributioncd() { return _columnDistributioncd; }
    /**
     * DESIGNFLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignflg() { return _columnDesignflg; }
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
        ls.add(columnMfrcvdesignId());
        ls.add(columnClientId());
        ls.add(columnProductId());
        ls.add(columnRcvfrdate());
        ls.add(columnRcvtodate());
        ls.add(columnValidtype());
        ls.add(columnVaExtdata1());
        ls.add(columnVaExtdata2());
        ls.add(columnVaExtdata3());
        ls.add(columnNvExtdata1());
        ls.add(columnNvExtdata2());
        ls.add(columnNvExtdata3());
        ls.add(columnNmExtdata1());
        ls.add(columnNmExtdata2());
        ls.add(columnNmExtdata3());
        ls.add(columnDtExtdata1());
        ls.add(columnDtExtdata2());
        ls.add(columnDtExtdata3());
        ls.add(columnDistributioncd());
        ls.add(columnDesignflg());
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
    protected UniqueInfo cpui() { return hpcpui(columnMfrcvdesignId()); }
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
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("M_MFRCVDESIGN_FK1", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MMfrcvdesignList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MMfrcvdesign"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MMfrcvdesignCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MMfrcvdesignBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MMfrcvdesign> getEntityType() { return MMfrcvdesign.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MMfrcvdesign newEntity() { return new MMfrcvdesign(); }
    public MMfrcvdesign newMyEntity() { return new MMfrcvdesign(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MMfrcvdesign)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MMfrcvdesign)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

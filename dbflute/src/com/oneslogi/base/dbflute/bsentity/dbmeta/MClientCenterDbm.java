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
 * The DB meta of M_CLIENT_CENTER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MClientCenterDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MClientCenterDbm _instance = new MClientCenterDbm();
    private MClientCenterDbm() {}
    public static MClientCenterDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MClientCenter)et).getClientCenterId(), (et, vl) -> ((MClientCenter)et).setClientCenterId(ctl(vl)), "clientCenterId");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getClientId(), (et, vl) -> ((MClientCenter)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getCenterId(), (et, vl) -> ((MClientCenter)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getSystemDt(), (et, vl) -> ((MClientCenter)et).setSystemDt((String)vl), "systemDt");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getBatchProgressFlg(), (et, vl) -> ((MClientCenter)et).setBatchProgressFlg((String)vl), "batchProgressFlg");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getBeforeSystemDt(), (et, vl) -> ((MClientCenter)et).setBeforeSystemDt((String)vl), "beforeSystemDt");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getCustomerId(), (et, vl) -> ((MClientCenter)et).setCustomerId(ctl(vl)), "customerId");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getDelFlg(), (et, vl) -> ((MClientCenter)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getVersionNo(), (et, vl) -> ((MClientCenter)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getControlNo(), (et, vl) -> ((MClientCenter)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getAddDt(), (et, vl) -> ((MClientCenter)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getAddUser(), (et, vl) -> ((MClientCenter)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getAddProcess(), (et, vl) -> ((MClientCenter)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getUpdDt(), (et, vl) -> ((MClientCenter)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getUpdUser(), (et, vl) -> ((MClientCenter)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MClientCenter)et).getUpdProcess(), (et, vl) -> ((MClientCenter)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MClientCenter)et).getMCenter(), (et, vl) -> ((MClientCenter)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MClientCenter)et).getMClient(), (et, vl) -> ((MClientCenter)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((MClientCenter)et).getMCustomer(), (et, vl) -> ((MClientCenter)et).setMCustomer((MCustomer)vl), "MCustomer");
        setupEfpg(_efpgMap, et -> ((MClientCenter)et).getBClassDtlByBatchProgressFlg(), (et, vl) -> ((MClientCenter)et).setBClassDtlByBatchProgressFlg((BClassDtl)vl), "BClassDtlByBatchProgressFlg");
        setupEfpg(_efpgMap, et -> ((MClientCenter)et).getBClassDtlByDelFlg(), (et, vl) -> ((MClientCenter)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
        setupEfpg(_efpgMap, et -> ((MClientCenter)et).getMParamAsOne(), (et, vl) -> ((MClientCenter)et).setMParamAsOne((MParam)vl), "MParamAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CLIENT_CENTER";
    protected final String _tableDispName = "M_CLIENT_CENTER";
    protected final String _tablePropertyName = "MClientCenter";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CLIENT_CENTER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientCenterId = cci("CLIENT_CENTER_ID", "CLIENT_CENTER_ID", null, null, Long.class, "clientCenterId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnSystemDt = cci("SYSTEM_DT", "SYSTEM_DT", null, null, String.class, "systemDt", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatchProgressFlg = cci("BATCH_PROGRESS_FLG", "BATCH_PROGRESS_FLG", null, null, String.class, "batchProgressFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByBatchProgressFlg", null, CDef.DefMeta.BatchProgressFlg, false);
    protected final ColumnInfo _columnBeforeSystemDt = cci("BEFORE_SYSTEM_DT", "BEFORE_SYSTEM_DT", null, null, String.class, "beforeSystemDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerId = cci("CUSTOMER_ID", "CUSTOMER_ID", null, null, Long.class, "customerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomer", null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, "BClassDtlByDelFlg", null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCenterId() { return _columnClientCenterId; }
    /**
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * SYSTEM_DT: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSystemDt() { return _columnSystemDt; }
    /**
     * BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatchProgressFlg() { return _columnBatchProgressFlg; }
    /**
     * BEFORE_SYSTEM_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBeforeSystemDt() { return _columnBeforeSystemDt; }
    /**
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerId() { return _columnCustomerId; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
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
        ls.add(columnClientCenterId());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnSystemDt());
        ls.add(columnBatchProgressFlg());
        ls.add(columnBeforeSystemDt());
        ls.add(columnCustomerId());
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
    protected UniqueInfo cpui() { return hpcpui(columnClientCenterId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnClientId());
        ls.add(columnCenterId());
        return hpcui(ls);
    }

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
        return cfi("M_CLIENT_CENTER_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MClientCenterList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("M_CLIENT_CENTER_FK1", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MClientCenterList", false);
    }
    /**
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("M_CLIENT_CENTER_FK3", "MCustomer", this, MCustomerDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "MClientCenterList", false);
    }
    /**
     * B_CLASS_DTL by my BATCH_PROGRESS_FLG, named 'BClassDtlByBatchProgressFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByBatchProgressFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBatchProgressFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CLIENT_CENTER_BATCH_PROGRESS_FLG", "BClassDtlByBatchProgressFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'BATCH_PROGRESS_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CLIENT_CENTER_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * M_PARAM by CLIENT_CENTER_ID, named 'MParamAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMParamAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientCenterId(), MParamDbm.getInstance().columnClientCenterId());
        return cfi("M_PARAM_FK3", "MParamAsOne", this, MParamDbm.getInstance(), mp, 5, null, true, false, true, false, null, null, false, "MClientCenter", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MClientCenter"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MClientCenterCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MClientCenterBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MClientCenter> getEntityType() { return MClientCenter.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MClientCenter newEntity() { return new MClientCenter(); }
    public MClientCenter newMyEntity() { return new MClientCenter(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MClientCenter)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MClientCenter)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

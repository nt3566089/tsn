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
 * The DB meta of T_TRITEMCONVRESULT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTritemconvresultDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTritemconvresultDbm _instance = new TTritemconvresultDbm();
    private TTritemconvresultDbm() {}
    public static TTritemconvresultDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getTritemconvresultId(), (et, vl) -> ((TTritemconvresult)et).setTritemconvresultId(ctl(vl)), "tritemconvresultId");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getItemchginstkey(), (et, vl) -> ((TTritemconvresult)et).setItemchginstkey(ctb(vl)), "itemchginstkey");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getJttsflg(), (et, vl) -> ((TTritemconvresult)et).setJttsflg((String)vl), "jttsflg");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getCompanycd(), (et, vl) -> ((TTritemconvresult)et).setCompanycd((String)vl), "companycd");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getProductCdFrom(), (et, vl) -> ((TTritemconvresult)et).setProductCdFrom((String)vl), "productCdFrom");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getProductCdTo(), (et, vl) -> ((TTritemconvresult)et).setProductCdTo((String)vl), "productCdTo");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getQty(), (et, vl) -> ((TTritemconvresult)et).setQty(ctb(vl)), "qty");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getPalletId(), (et, vl) -> ((TTritemconvresult)et).setPalletId(ctl(vl)), "palletId");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getItemchginstflg(), (et, vl) -> ((TTritemconvresult)et).setItemchginstflg((String)vl), "itemchginstflg");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getItemchginstdate(), (et, vl) -> ((TTritemconvresult)et).setItemchginstdate(cttp(vl)), "itemchginstdate");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getCenterId(), (et, vl) -> ((TTritemconvresult)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getClientId(), (et, vl) -> ((TTritemconvresult)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getDelFlg(), (et, vl) -> ((TTritemconvresult)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getVersionNo(), (et, vl) -> ((TTritemconvresult)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getControlNo(), (et, vl) -> ((TTritemconvresult)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getAddDt(), (et, vl) -> ((TTritemconvresult)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getAddUser(), (et, vl) -> ((TTritemconvresult)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getAddProcess(), (et, vl) -> ((TTritemconvresult)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getUpdDt(), (et, vl) -> ((TTritemconvresult)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getUpdUser(), (et, vl) -> ((TTritemconvresult)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTritemconvresult)et).getUpdProcess(), (et, vl) -> ((TTritemconvresult)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTritemconvresult)et).getMCenter(), (et, vl) -> ((TTritemconvresult)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TTritemconvresult)et).getMClient(), (et, vl) -> ((TTritemconvresult)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRITEMCONVRESULT";
    protected final String _tableDispName = "T_TRITEMCONVRESULT";
    protected final String _tablePropertyName = "TTritemconvresult";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRITEMCONVRESULT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTritemconvresultId = cci("TRITEMCONVRESULT_ID", "TRITEMCONVRESULT_ID", null, null, Long.class, "tritemconvresultId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemchginstkey = cci("ITEMCHGINSTKEY", "ITEMCHGINSTKEY", null, null, java.math.BigDecimal.class, "itemchginstkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJttsflg = cci("JTTSFLG", "JTTSFLG", null, null, String.class, "jttsflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanycd = cci("COMPANYCD", "COMPANYCD", null, null, String.class, "companycd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCdFrom = cci("PRODUCT_CD_FROM", "PRODUCT_CD_FROM", null, null, String.class, "productCdFrom", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCdTo = cci("PRODUCT_CD_TO", "PRODUCT_CD_TO", null, null, String.class, "productCdTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, java.math.BigDecimal.class, "qty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletId = cci("PALLET_ID", "PALLET_ID", null, null, Long.class, "palletId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemchginstflg = cci("ITEMCHGINSTFLG", "ITEMCHGINSTFLG", null, null, String.class, "itemchginstflg", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemchginstdate = cci("ITEMCHGINSTDATE", "ITEMCHGINSTDATE", null, null, java.sql.Timestamp.class, "itemchginstdate", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
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
     * TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTritemconvresultId() { return _columnTritemconvresultId; }
    /**
     * ITEMCHGINSTKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemchginstkey() { return _columnItemchginstkey; }
    /**
     * JTTSFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJttsflg() { return _columnJttsflg; }
    /**
     * COMPANYCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanycd() { return _columnCompanycd; }
    /**
     * PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCdFrom() { return _columnProductCdFrom; }
    /**
     * PRODUCT_CD_TO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCdTo() { return _columnProductCdTo; }
    /**
     * QTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * PALLET_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletId() { return _columnPalletId; }
    /**
     * ITEMCHGINSTFLG: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemchginstflg() { return _columnItemchginstflg; }
    /**
     * ITEMCHGINSTDATE: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemchginstdate() { return _columnItemchginstdate; }
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
        ls.add(columnTritemconvresultId());
        ls.add(columnItemchginstkey());
        ls.add(columnJttsflg());
        ls.add(columnCompanycd());
        ls.add(columnProductCdFrom());
        ls.add(columnProductCdTo());
        ls.add(columnQty());
        ls.add(columnPalletId());
        ls.add(columnItemchginstflg());
        ls.add(columnItemchginstdate());
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
    protected UniqueInfo cpui() { return hpcpui(columnTritemconvresultId()); }
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
        return cfi("T_TRITEMCONVRESULT_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTritemconvresultList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_TRITEMCONVRESULT_FK2", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTritemconvresultList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTritemconvresult"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTritemconvresultCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTritemconvresultBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTritemconvresult> getEntityType() { return TTritemconvresult.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTritemconvresult newEntity() { return new TTritemconvresult(); }
    public TTritemconvresult newMyEntity() { return new TTritemconvresult(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTritemconvresult)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTritemconvresult)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

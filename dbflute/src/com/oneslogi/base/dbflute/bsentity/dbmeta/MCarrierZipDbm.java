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
 * The DB meta of M_CARRIER_ZIP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierZipDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCarrierZipDbm _instance = new MCarrierZipDbm();
    private MCarrierZipDbm() {}
    public static MCarrierZipDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCarrierZip)et).getCarrierZipId(), (et, vl) -> ((MCarrierZip)et).setCarrierZipId(ctl(vl)), "carrierZipId");
        setupEpg(_epgMap, et -> ((MCarrierZip)et).getCommonCarrierId(), (et, vl) -> ((MCarrierZip)et).setCommonCarrierId(ctl(vl)), "commonCarrierId");
        setupEpg(_epgMap, et -> ((MCarrierZip)et).getZipId(), (et, vl) -> ((MCarrierZip)et).setZipId(ctl(vl)), "zipId");
        setupEpg(_epgMap, et -> ((MCarrierZip)et).getArrivalStoreCd(), (et, vl) -> ((MCarrierZip)et).setArrivalStoreCd((String)vl), "arrivalStoreCd");
        setupEpg(_epgMap, et -> ((MCarrierZip)et).getArrivalStoreNm(), (et, vl) -> ((MCarrierZip)et).setArrivalStoreNm((String)vl), "arrivalStoreNm");
        setupEpg(_epgMap, et -> ((MCarrierZip)et).getDelFlg(), (et, vl) -> ((MCarrierZip)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCarrierZip)et).getVersionNo(), (et, vl) -> ((MCarrierZip)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCarrierZip)et).getControlNo(), (et, vl) -> ((MCarrierZip)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCarrierZip)et).getAddDt(), (et, vl) -> ((MCarrierZip)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCarrierZip)et).getAddUser(), (et, vl) -> ((MCarrierZip)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCarrierZip)et).getAddProcess(), (et, vl) -> ((MCarrierZip)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCarrierZip)et).getUpdDt(), (et, vl) -> ((MCarrierZip)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCarrierZip)et).getUpdUser(), (et, vl) -> ((MCarrierZip)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCarrierZip)et).getUpdProcess(), (et, vl) -> ((MCarrierZip)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCarrierZip)et).getMCommonCarrier(), (et, vl) -> ((MCarrierZip)et).setMCommonCarrier((MCommonCarrier)vl), "MCommonCarrier");
        setupEfpg(_efpgMap, et -> ((MCarrierZip)et).getMZip(), (et, vl) -> ((MCarrierZip)et).setMZip((MZip)vl), "MZip");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CARRIER_ZIP";
    protected final String _tableDispName = "M_CARRIER_ZIP";
    protected final String _tablePropertyName = "MCarrierZip";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CARRIER_ZIP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCarrierZipId = cci("CARRIER_ZIP_ID", "CARRIER_ZIP_ID", null, null, Long.class, "carrierZipId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCommonCarrierId = cci("COMMON_CARRIER_ID", "COMMON_CARRIER_ID", null, null, Long.class, "commonCarrierId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCommonCarrier", null, null, false);
    protected final ColumnInfo _columnZipId = cci("ZIP_ID", "ZIP_ID", null, null, Long.class, "zipId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MZip", null, null, false);
    protected final ColumnInfo _columnArrivalStoreCd = cci("ARRIVAL_STORE_CD", "ARRIVAL_STORE_CD", null, null, String.class, "arrivalStoreCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArrivalStoreNm = cci("ARRIVAL_STORE_NM", "ARRIVAL_STORE_NM", null, null, String.class, "arrivalStoreNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierZipId() { return _columnCarrierZipId; }
    /**
     * COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCommonCarrierId() { return _columnCommonCarrierId; }
    /**
     * ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipId() { return _columnZipId; }
    /**
     * ARRIVAL_STORE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArrivalStoreCd() { return _columnArrivalStoreCd; }
    /**
     * ARRIVAL_STORE_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArrivalStoreNm() { return _columnArrivalStoreNm; }
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
        ls.add(columnCarrierZipId());
        ls.add(columnCommonCarrierId());
        ls.add(columnZipId());
        ls.add(columnArrivalStoreCd());
        ls.add(columnArrivalStoreNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnCarrierZipId()); }
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
     * M_COMMON_CARRIER by my COMMON_CARRIER_ID, named 'MCommonCarrier'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCommonCarrier() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCommonCarrierId(), MCommonCarrierDbm.getInstance().columnCommonCarrierId());
        return cfi("M_CARRIER_ZIP_FK1", "MCommonCarrier", this, MCommonCarrierDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCarrierZipList", false);
    }
    /**
     * M_ZIP by my ZIP_ID, named 'MZip'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMZip() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnZipId(), MZipDbm.getInstance().columnZipId());
        return cfi("M_CARRIER_ZIP_FK2", "MZip", this, MZipDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MCarrierZipList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCarrierZip"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCarrierZipCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCarrierZipBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCarrierZip> getEntityType() { return MCarrierZip.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCarrierZip newEntity() { return new MCarrierZip(); }
    public MCarrierZip newMyEntity() { return new MCarrierZip(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCarrierZip)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCarrierZip)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

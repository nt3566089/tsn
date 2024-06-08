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
 * The DB meta of T_TRCASEADOPTINVDETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrcaseadoptinvdetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrcaseadoptinvdetailDbm _instance = new TTrcaseadoptinvdetailDbm();
    private TTrcaseadoptinvdetailDbm() {}
    public static TTrcaseadoptinvdetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getTTrcaseadoptinvdetailId(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setTTrcaseadoptinvdetailId(ctl(vl)), "TTrcaseadoptinvdetailId");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getCenterId(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getClientId(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getInventoryKey(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setInventoryKey(ctl(vl)), "inventoryKey");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getInventoryBId(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setInventoryBId(ctl(vl)), "inventoryBId");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getProductCd(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getQrData(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setQrData((String)vl), "qrData");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getCaseInvQty(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setCaseInvQty(ctl(vl)), "caseInvQty");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getManufactureDate(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setManufactureDate((String)vl), "manufactureDate");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getDesignFlg(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setDesignFlg((String)vl), "designFlg");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getDelFlg(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getVersionNo(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getControlNo(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getAddDt(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getAddUser(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getAddProcess(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getUpdDt(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getUpdUser(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrcaseadoptinvdetail)et).getUpdProcess(), (et, vl) -> ((TTrcaseadoptinvdetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRCASEADOPTINVDETAIL";
    protected final String _tableDispName = "T_TRCASEADOPTINVDETAIL";
    protected final String _tablePropertyName = "TTrcaseadoptinvdetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRCASEADOPTINVDETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTTrcaseadoptinvdetailId = cci("T_TRCASEADOPTINVDETAIL_ID", "T_TRCASEADOPTINVDETAIL_ID", null, null, Long.class, "TTrcaseadoptinvdetailId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryKey = cci("INVENTORY_KEY", "INVENTORY_KEY", null, null, Long.class, "inventoryKey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryBId = cci("INVENTORY_B_ID", "INVENTORY_B_ID", null, null, Long.class, "inventoryBId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQrData = cci("QR_DATA", "QR_DATA", null, null, String.class, "qrData", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseInvQty = cci("CASE_INV_QTY", "CASE_INV_QTY", null, null, Long.class, "caseInvQty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufactureDate = cci("MANUFACTURE_DATE", "MANUFACTURE_DATE", null, null, String.class, "manufactureDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignFlg = cci("DESIGN_FLG", "DESIGN_FLG", null, null, String.class, "designFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * T_TRCASEADOPTINVDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTTrcaseadoptinvdetailId() { return _columnTTrcaseadoptinvdetailId; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * INVENTORY_KEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryKey() { return _columnInventoryKey; }
    /**
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryBId() { return _columnInventoryBId; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * QR_DATA: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQrData() { return _columnQrData; }
    /**
     * CASE_INV_QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseInvQty() { return _columnCaseInvQty; }
    /**
     * MANUFACTURE_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufactureDate() { return _columnManufactureDate; }
    /**
     * DESIGN_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignFlg() { return _columnDesignFlg; }
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
        ls.add(columnTTrcaseadoptinvdetailId());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnInventoryKey());
        ls.add(columnInventoryBId());
        ls.add(columnProductCd());
        ls.add(columnQrData());
        ls.add(columnCaseInvQty());
        ls.add(columnManufactureDate());
        ls.add(columnDesignFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnTTrcaseadoptinvdetailId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrcaseadoptinvdetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrcaseadoptinvdetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrcaseadoptinvdetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrcaseadoptinvdetail> getEntityType() { return TTrcaseadoptinvdetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrcaseadoptinvdetail newEntity() { return new TTrcaseadoptinvdetail(); }
    public TTrcaseadoptinvdetail newMyEntity() { return new TTrcaseadoptinvdetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrcaseadoptinvdetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrcaseadoptinvdetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

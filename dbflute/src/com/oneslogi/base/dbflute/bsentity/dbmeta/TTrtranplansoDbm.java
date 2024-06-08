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
 * The DB meta of T_TRTRANPLANSO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrtranplansoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrtranplansoDbm _instance = new TTrtranplansoDbm();
    private TTrtranplansoDbm() {}
    public static TTrtranplansoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getFlexibleTransportPlanInfoId(), (et, vl) -> ((TTrtranplanso)et).setFlexibleTransportPlanInfoId(ctl(vl)), "flexibleTransportPlanInfoId");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getWarehousecd(), (et, vl) -> ((TTrtranplanso)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getRefno(), (et, vl) -> ((TTrtranplanso)et).setRefno((String)vl), "refno");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getShipcd(), (et, vl) -> ((TTrtranplanso)et).setShipcd((String)vl), "shipcd");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getShipschdate(), (et, vl) -> ((TTrtranplanso)et).setShipschdate((String)vl), "shipschdate");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getShiptocd(), (et, vl) -> ((TTrtranplanso)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getShiptoschdate(), (et, vl) -> ((TTrtranplanso)et).setShiptoschdate((String)vl), "shiptoschdate");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getDatatype(), (et, vl) -> ((TTrtranplanso)et).setDatatype((String)vl), "datatype");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getProductId(), (et, vl) -> ((TTrtranplanso)et).setProductId((String)vl), "productId");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getQty(), (et, vl) -> ((TTrtranplanso)et).setQty(ctl(vl)), "qty");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getSubwarehousecd(), (et, vl) -> ((TTrtranplanso)et).setSubwarehousecd((String)vl), "subwarehousecd");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getCenterId(), (et, vl) -> ((TTrtranplanso)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getClientId(), (et, vl) -> ((TTrtranplanso)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getDelFlg(), (et, vl) -> ((TTrtranplanso)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getVersionNo(), (et, vl) -> ((TTrtranplanso)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getControlNo(), (et, vl) -> ((TTrtranplanso)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getAddDt(), (et, vl) -> ((TTrtranplanso)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getAddUser(), (et, vl) -> ((TTrtranplanso)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getAddProcess(), (et, vl) -> ((TTrtranplanso)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getUpdDt(), (et, vl) -> ((TTrtranplanso)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getUpdUser(), (et, vl) -> ((TTrtranplanso)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrtranplanso)et).getUpdProcess(), (et, vl) -> ((TTrtranplanso)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRTRANPLANSO";
    protected final String _tableDispName = "T_TRTRANPLANSO";
    protected final String _tablePropertyName = "TTrtranplanso";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRTRANPLANSO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFlexibleTransportPlanInfoId = cci("FLEXIBLE_TRANSPORT_PLAN_INFO_ID", "FLEXIBLE_TRANSPORT_PLAN_INFO_ID", null, null, Long.class, "flexibleTransportPlanInfoId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefno = cci("REFNO", "REFNO", null, null, String.class, "refno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipcd = cci("SHIPCD", "SHIPCD", null, null, String.class, "shipcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschdate = cci("SHIPSCHDATE", "SHIPSCHDATE", null, null, String.class, "shipschdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("SHIPTOCD", "SHIPTOCD", null, null, String.class, "shiptocd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptoschdate = cci("SHIPTOSCHDATE", "SHIPTOSCHDATE", null, null, String.class, "shiptoschdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDatatype = cci("DATATYPE", "DATATYPE", null, null, String.class, "datatype", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, String.class, "productId", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, Long.class, "qty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubwarehousecd = cci("SUBWAREHOUSECD", "SUBWAREHOUSECD", null, null, String.class, "subwarehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * FLEXIBLE_TRANSPORT_PLAN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexibleTransportPlanInfoId() { return _columnFlexibleTransportPlanInfoId; }
    /**
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * REFNO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefno() { return _columnRefno; }
    /**
     * SHIPCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipcd() { return _columnShipcd; }
    /**
     * SHIPSCHDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschdate() { return _columnShipschdate; }
    /**
     * SHIPTOCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * SHIPTOSCHDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptoschdate() { return _columnShiptoschdate; }
    /**
     * DATATYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDatatype() { return _columnDatatype; }
    /**
     * PRODUCT_ID: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * QTY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * SUBWAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubwarehousecd() { return _columnSubwarehousecd; }
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
        ls.add(columnFlexibleTransportPlanInfoId());
        ls.add(columnWarehousecd());
        ls.add(columnRefno());
        ls.add(columnShipcd());
        ls.add(columnShipschdate());
        ls.add(columnShiptocd());
        ls.add(columnShiptoschdate());
        ls.add(columnDatatype());
        ls.add(columnProductId());
        ls.add(columnQty());
        ls.add(columnSubwarehousecd());
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
    protected UniqueInfo cpui() { return hpcpui(columnFlexibleTransportPlanInfoId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrtranplanso"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrtranplansoCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrtranplansoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrtranplanso> getEntityType() { return TTrtranplanso.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrtranplanso newEntity() { return new TTrtranplanso(); }
    public TTrtranplanso newMyEntity() { return new TTrtranplanso(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrtranplanso)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrtranplanso)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

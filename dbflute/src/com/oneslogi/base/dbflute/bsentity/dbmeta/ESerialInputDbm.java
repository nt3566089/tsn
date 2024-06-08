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
 * The DB meta of E_SERIAL_INPUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ESerialInputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ESerialInputDbm _instance = new ESerialInputDbm();
    private ESerialInputDbm() {}
    public static ESerialInputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ESerialInput)et).getSerialInputId(), (et, vl) -> ((ESerialInput)et).setSerialInputId(ctl(vl)), "serialInputId");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getReceiveCd(), (et, vl) -> ((ESerialInput)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getReceiveRowId(), (et, vl) -> ((ESerialInput)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getImportFlg(), (et, vl) -> ((ESerialInput)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getErrorFlg(), (et, vl) -> ((ESerialInput)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getErrorMessageCd(), (et, vl) -> ((ESerialInput)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getClientCd(), (et, vl) -> ((ESerialInput)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getCenterCd(), (et, vl) -> ((ESerialInput)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getProcessType(), (et, vl) -> ((ESerialInput)et).setProcessType((String)vl), "processType");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getProductCd(), (et, vl) -> ((ESerialInput)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getSerialNo(), (et, vl) -> ((ESerialInput)et).setSerialNo((String)vl), "serialNo");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getSupplierCd(), (et, vl) -> ((ESerialInput)et).setSupplierCd((String)vl), "supplierCd");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getSupplierNm(), (et, vl) -> ((ESerialInput)et).setSupplierNm((String)vl), "supplierNm");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getReceiveSlipNo(), (et, vl) -> ((ESerialInput)et).setReceiveSlipNo((String)vl), "receiveSlipNo");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getSupplyCustomerCd(), (et, vl) -> ((ESerialInput)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getSupplyCustomerNm(), (et, vl) -> ((ESerialInput)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getPickingWorkNo(), (et, vl) -> ((ESerialInput)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getWorkDt(), (et, vl) -> ((ESerialInput)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getDelFlg(), (et, vl) -> ((ESerialInput)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getVersionNo(), (et, vl) -> ((ESerialInput)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getControlNo(), (et, vl) -> ((ESerialInput)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getAddDt(), (et, vl) -> ((ESerialInput)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getAddUser(), (et, vl) -> ((ESerialInput)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getAddProcess(), (et, vl) -> ((ESerialInput)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getUpdDt(), (et, vl) -> ((ESerialInput)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getUpdUser(), (et, vl) -> ((ESerialInput)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ESerialInput)et).getUpdProcess(), (et, vl) -> ((ESerialInput)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_SERIAL_INPUT";
    protected final String _tableDispName = "E_SERIAL_INPUT";
    protected final String _tablePropertyName = "ESerialInput";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_SERIAL_INPUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSerialInputId = cci("SERIAL_INPUT_ID", "SERIAL_INPUT_ID", null, null, Long.class, "serialInputId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessType = cci("PROCESS_TYPE", "PROCESS_TYPE", null, null, String.class, "processType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSerialNo = cci("SERIAL_NO", "SERIAL_NO", null, null, String.class, "serialNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierCd = cci("SUPPLIER_CD", "SUPPLIER_CD", null, null, String.class, "supplierCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierNm = cci("SUPPLIER_NM", "SUPPLIER_NM", null, null, String.class, "supplierNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveSlipNo = cci("RECEIVE_SLIP_NO", "RECEIVE_SLIP_NO", null, null, String.class, "receiveSlipNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * SERIAL_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSerialInputId() { return _columnSerialInputId; }
    /**
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * CLIENT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CENTER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * PROCESS_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessType() { return _columnProcessType; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * SERIAL_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSerialNo() { return _columnSerialNo; }
    /**
     * SUPPLIER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierCd() { return _columnSupplierCd; }
    /**
     * SUPPLIER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierNm() { return _columnSupplierNm; }
    /**
     * RECEIVE_SLIP_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveSlipNo() { return _columnReceiveSlipNo; }
    /**
     * SUPPLY_CUSTOMER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerCd() { return _columnSupplyCustomerCd; }
    /**
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerNm() { return _columnSupplyCustomerNm; }
    /**
     * PICKING_WORK_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
    /**
     * WORK_DT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
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
        ls.add(columnSerialInputId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnClientCd());
        ls.add(columnCenterCd());
        ls.add(columnProcessType());
        ls.add(columnProductCd());
        ls.add(columnSerialNo());
        ls.add(columnSupplierCd());
        ls.add(columnSupplierNm());
        ls.add(columnReceiveSlipNo());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnPickingWorkNo());
        ls.add(columnWorkDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnSerialInputId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ESerialInput"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ESerialInputCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ESerialInputBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ESerialInput> getEntityType() { return ESerialInput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ESerialInput newEntity() { return new ESerialInput(); }
    public ESerialInput newMyEntity() { return new ESerialInput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ESerialInput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ESerialInput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

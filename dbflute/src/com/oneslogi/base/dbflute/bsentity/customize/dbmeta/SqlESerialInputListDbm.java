package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlESerialInputList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlESerialInputListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlESerialInputListDbm _instance = new SqlESerialInputListDbm();
    private SqlESerialInputListDbm() {}
    public static SqlESerialInputListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getReceiveCd(), (et, vl) -> ((SqlESerialInputList)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getSerialInputId(), (et, vl) -> ((SqlESerialInputList)et).setSerialInputId(ctl(vl)), "serialInputId");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getReceiveRowId(), (et, vl) -> ((SqlESerialInputList)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getImportFlg(), (et, vl) -> ((SqlESerialInputList)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getErrorFlg(), (et, vl) -> ((SqlESerialInputList)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getErrorMessageCd(), (et, vl) -> ((SqlESerialInputList)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getClientCd(), (et, vl) -> ((SqlESerialInputList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getCenterCd(), (et, vl) -> ((SqlESerialInputList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getProcessType(), (et, vl) -> ((SqlESerialInputList)et).setProcessType((String)vl), "processType");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getProcessTypeNm(), (et, vl) -> ((SqlESerialInputList)et).setProcessTypeNm((String)vl), "processTypeNm");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getProductCd(), (et, vl) -> ((SqlESerialInputList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getProductId(), (et, vl) -> ((SqlESerialInputList)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getProductNm(), (et, vl) -> ((SqlESerialInputList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getSerialNo(), (et, vl) -> ((SqlESerialInputList)et).setSerialNo((String)vl), "serialNo");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getSupplierCd(), (et, vl) -> ((SqlESerialInputList)et).setSupplierCd((String)vl), "supplierCd");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getSupplierNm(), (et, vl) -> ((SqlESerialInputList)et).setSupplierNm((String)vl), "supplierNm");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getSupplierId(), (et, vl) -> ((SqlESerialInputList)et).setSupplierId(ctl(vl)), "supplierId");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getSupplierNm2(), (et, vl) -> ((SqlESerialInputList)et).setSupplierNm2((String)vl), "supplierNm2");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getReceiveSlipNo(), (et, vl) -> ((SqlESerialInputList)et).setReceiveSlipNo((String)vl), "receiveSlipNo");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getSupplyCustomerCd(), (et, vl) -> ((SqlESerialInputList)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getSupplyCustomerNm(), (et, vl) -> ((SqlESerialInputList)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getSupplyCustomerId(), (et, vl) -> ((SqlESerialInputList)et).setSupplyCustomerId(ctl(vl)), "supplyCustomerId");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getSupplyCustomerNm2(), (et, vl) -> ((SqlESerialInputList)et).setSupplyCustomerNm2((String)vl), "supplyCustomerNm2");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getPickingWorkNo(), (et, vl) -> ((SqlESerialInputList)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getWorkDt(), (et, vl) -> ((SqlESerialInputList)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getMessageNm(), (et, vl) -> ((SqlESerialInputList)et).setMessageNm((String)vl), "messageNm");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getVersionNo(), (et, vl) -> ((SqlESerialInputList)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlESerialInputList)et).getControlNo(), (et, vl) -> ((SqlESerialInputList)et).setControlNo(ctl(vl)), "controlNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlESerialInputList";
    protected final String _tableDispName = "SqlESerialInputList";
    protected final String _tablePropertyName = "sqlESerialInputList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlESerialInputList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSerialInputId = cci("SERIAL_INPUT_ID", "SERIAL_INPUT_ID", null, null, Long.class, "serialInputId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessType = cci("PROCESS_TYPE", "PROCESS_TYPE", null, null, String.class, "processType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeNm = cci("PROCESS_TYPE_NM", "PROCESS_TYPE_NM", null, null, String.class, "processTypeNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSerialNo = cci("SERIAL_NO", "SERIAL_NO", null, null, String.class, "serialNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierCd = cci("SUPPLIER_CD", "SUPPLIER_CD", null, null, String.class, "supplierCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierNm = cci("SUPPLIER_NM", "SUPPLIER_NM", null, null, String.class, "supplierNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierId = cci("SUPPLIER_ID", "SUPPLIER_ID", null, null, Long.class, "supplierId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierNm2 = cci("SUPPLIER_NM2", "SUPPLIER_NM2", null, null, String.class, "supplierNm2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveSlipNo = cci("RECEIVE_SLIP_NO", "RECEIVE_SLIP_NO", null, null, String.class, "receiveSlipNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerId = cci("SUPPLY_CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", null, null, Long.class, "supplyCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm2 = cci("SUPPLY_CUSTOMER_NM2", "SUPPLY_CUSTOMER_NM2", null, null, String.class, "supplyCustomerNm2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageNm = cci("MESSAGE_NM", "MESSAGE_NM", null, null, String.class, "messageNm", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * RECEIVE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * SERIAL_INPUT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSerialInputId() { return _columnSerialInputId; }
    /**
     * RECEIVE_ROW_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {char(1)}
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
     * PROCESS_TYPE_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeNm() { return _columnProcessTypeNm; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
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
     * SUPPLIER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierId() { return _columnSupplierId; }
    /**
     * SUPPLIER_NM2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierNm2() { return _columnSupplierNm2; }
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
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerId() { return _columnSupplyCustomerId; }
    /**
     * SUPPLY_CUSTOMER_NM2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerNm2() { return _columnSupplyCustomerNm2; }
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
     * MESSAGE_NM: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageNm() { return _columnMessageNm; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnReceiveCd());
        ls.add(columnSerialInputId());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnClientCd());
        ls.add(columnCenterCd());
        ls.add(columnProcessType());
        ls.add(columnProcessTypeNm());
        ls.add(columnProductCd());
        ls.add(columnProductId());
        ls.add(columnProductNm());
        ls.add(columnSerialNo());
        ls.add(columnSupplierCd());
        ls.add(columnSupplierNm());
        ls.add(columnSupplierId());
        ls.add(columnSupplierNm2());
        ls.add(columnReceiveSlipNo());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnSupplyCustomerId());
        ls.add(columnSupplyCustomerNm2());
        ls.add(columnPickingWorkNo());
        ls.add(columnWorkDt());
        ls.add(columnMessageNm());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlESerialInputList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlESerialInputList> getEntityType() { return SqlESerialInputList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlESerialInputList newEntity() { return new SqlESerialInputList(); }
    public SqlESerialInputList newMyEntity() { return new SqlESerialInputList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlESerialInputList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlESerialInputList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

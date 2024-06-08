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
 * The DB meta of SqlShippingTagDataOutput. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlShippingTagDataOutputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlShippingTagDataOutputDbm _instance = new SqlShippingTagDataOutputDbm();
    private SqlShippingTagDataOutputDbm() {}
    public static SqlShippingTagDataOutputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getClientId(), (et, vl) -> ((SqlShippingTagDataOutput)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getClientCd(), (et, vl) -> ((SqlShippingTagDataOutput)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getClientNm(), (et, vl) -> ((SqlShippingTagDataOutput)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getCenterId(), (et, vl) -> ((SqlShippingTagDataOutput)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getCenterCd(), (et, vl) -> ((SqlShippingTagDataOutput)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getCenterNm(), (et, vl) -> ((SqlShippingTagDataOutput)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getAllocInstHId(), (et, vl) -> ((SqlShippingTagDataOutput)et).setAllocInstHId(ctl(vl)), "allocInstHId");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getShippingDt(), (et, vl) -> ((SqlShippingTagDataOutput)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getWorkDt(), (et, vl) -> ((SqlShippingTagDataOutput)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getDeliveryCourseCd(), (et, vl) -> ((SqlShippingTagDataOutput)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getDeliveryCourseNm(), (et, vl) -> ((SqlShippingTagDataOutput)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getCarrierCd(), (et, vl) -> ((SqlShippingTagDataOutput)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getCarrierNm(), (et, vl) -> ((SqlShippingTagDataOutput)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getCarrierAbbr(), (et, vl) -> ((SqlShippingTagDataOutput)et).setCarrierAbbr((String)vl), "carrierAbbr");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getDelivCustomerCd(), (et, vl) -> ((SqlShippingTagDataOutput)et).setDelivCustomerCd((String)vl), "delivCustomerCd");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getDelivCustomerNm(), (et, vl) -> ((SqlShippingTagDataOutput)et).setDelivCustomerNm((String)vl), "delivCustomerNm");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getDelivAddress1(), (et, vl) -> ((SqlShippingTagDataOutput)et).setDelivAddress1((String)vl), "delivAddress1");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getDelivAddress2(), (et, vl) -> ((SqlShippingTagDataOutput)et).setDelivAddress2((String)vl), "delivAddress2");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getDelivAddress3(), (et, vl) -> ((SqlShippingTagDataOutput)et).setDelivAddress3((String)vl), "delivAddress3");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getSupplyCustomerCd(), (et, vl) -> ((SqlShippingTagDataOutput)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getSupplyCustomerNm(), (et, vl) -> ((SqlShippingTagDataOutput)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getSupplyCustomerAbbr(), (et, vl) -> ((SqlShippingTagDataOutput)et).setSupplyCustomerAbbr((String)vl), "supplyCustomerAbbr");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getPickingWorkNo(), (et, vl) -> ((SqlShippingTagDataOutput)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getClientShippingNo(), (et, vl) -> ((SqlShippingTagDataOutput)et).setClientShippingNo((String)vl), "clientShippingNo");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getSumPickinghCount(), (et, vl) -> ((SqlShippingTagDataOutput)et).setSumPickinghCount(ctl(vl)), "sumPickinghCount");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getEmergencyFlg(), (et, vl) -> ((SqlShippingTagDataOutput)et).setEmergencyFlg((String)vl), "emergencyFlg");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getInvoiceCreateFlg(), (et, vl) -> ((SqlShippingTagDataOutput)et).setInvoiceCreateFlg((String)vl), "invoiceCreateFlg");
        setupEpg(_epgMap, et -> ((SqlShippingTagDataOutput)et).getInvoiceCreateDt(), (et, vl) -> ((SqlShippingTagDataOutput)et).setInvoiceCreateDt(cttp(vl)), "invoiceCreateDt");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlShippingTagDataOutput";
    protected final String _tableDispName = "SqlShippingTagDataOutput";
    protected final String _tablePropertyName = "sqlShippingTagDataOutput";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlShippingTagDataOutput", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocInstHId = cci("ALLOC_INST_H_ID", "ALLOC_INST_H_ID", null, null, Long.class, "allocInstHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierAbbr = cci("CARRIER_ABBR", "CARRIER_ABBR", null, null, String.class, "carrierAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerCd = cci("DELIV_CUSTOMER_CD", "DELIV_CUSTOMER_CD", null, null, String.class, "delivCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm = cci("DELIV_CUSTOMER_NM", "DELIV_CUSTOMER_NM", null, null, String.class, "delivCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress1 = cci("DELIV_ADDRESS1", "DELIV_ADDRESS1", null, null, String.class, "delivAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress2 = cci("DELIV_ADDRESS2", "DELIV_ADDRESS2", null, null, String.class, "delivAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress3 = cci("DELIV_ADDRESS3", "DELIV_ADDRESS3", null, null, String.class, "delivAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerAbbr = cci("SUPPLY_CUSTOMER_ABBR", "SUPPLY_CUSTOMER_ABBR", null, null, String.class, "supplyCustomerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientShippingNo = cci("CLIENT_SHIPPING_NO", "CLIENT_SHIPPING_NO", null, null, String.class, "clientShippingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSumPickinghCount = cci("SUM_PICKINGH_COUNT", "SUM_PICKINGH_COUNT", null, null, Long.class, "sumPickinghCount", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmergencyFlg = cci("EMERGENCY_FLG", "EMERGENCY_FLG", null, null, String.class, "emergencyFlg", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceCreateFlg = cci("INVOICE_CREATE_FLG", "INVOICE_CREATE_FLG", null, null, String.class, "invoiceCreateFlg", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceCreateDt = cci("INVOICE_CREATE_DT", "INVOICE_CREATE_DT", null, null, java.sql.Timestamp.class, "invoiceCreateDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);

    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * ALLOC_INST_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstHId() { return _columnAllocInstHId; }
    /**
     * SHIPPING_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * WORK_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseCd() { return _columnDeliveryCourseCd; }
    /**
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseNm() { return _columnDeliveryCourseNm; }
    /**
     * CARRIER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierCd() { return _columnCarrierCd; }
    /**
     * CARRIER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNm() { return _columnCarrierNm; }
    /**
     * CARRIER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierAbbr() { return _columnCarrierAbbr; }
    /**
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerCd() { return _columnDelivCustomerCd; }
    /**
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerNm() { return _columnDelivCustomerNm; }
    /**
     * DELIV_ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress1() { return _columnDelivAddress1; }
    /**
     * DELIV_ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress2() { return _columnDelivAddress2; }
    /**
     * DELIV_ADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress3() { return _columnDelivAddress3; }
    /**
     * SUPPLY_CUSTOMER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerCd() { return _columnSupplyCustomerCd; }
    /**
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerNm() { return _columnSupplyCustomerNm; }
    /**
     * SUPPLY_CUSTOMER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerAbbr() { return _columnSupplyCustomerAbbr; }
    /**
     * PICKING_WORK_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
    /**
     * CLIENT_SHIPPING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientShippingNo() { return _columnClientShippingNo; }
    /**
     * SUM_PICKINGH_COUNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSumPickinghCount() { return _columnSumPickinghCount; }
    /**
     * EMERGENCY_FLG: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmergencyFlg() { return _columnEmergencyFlg; }
    /**
     * INVOICE_CREATE_FLG: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceCreateFlg() { return _columnInvoiceCreateFlg; }
    /**
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceCreateDt() { return _columnInvoiceCreateDt; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnAllocInstHId());
        ls.add(columnShippingDt());
        ls.add(columnWorkDt());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDeliveryCourseNm());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnCarrierAbbr());
        ls.add(columnDelivCustomerCd());
        ls.add(columnDelivCustomerNm());
        ls.add(columnDelivAddress1());
        ls.add(columnDelivAddress2());
        ls.add(columnDelivAddress3());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnSupplyCustomerAbbr());
        ls.add(columnPickingWorkNo());
        ls.add(columnClientShippingNo());
        ls.add(columnSumPickinghCount());
        ls.add(columnEmergencyFlg());
        ls.add(columnInvoiceCreateFlg());
        ls.add(columnInvoiceCreateDt());
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlShippingTagDataOutput"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlShippingTagDataOutput> getEntityType() { return SqlShippingTagDataOutput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlShippingTagDataOutput newEntity() { return new SqlShippingTagDataOutput(); }
    public SqlShippingTagDataOutput newMyEntity() { return new SqlShippingTagDataOutput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlShippingTagDataOutput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlShippingTagDataOutput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

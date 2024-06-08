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
 * The DB meta of SqlPackingSlipListPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlPackingSlipListPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlPackingSlipListPrintDbm _instance = new SqlPackingSlipListPrintDbm();
    private SqlPackingSlipListPrintDbm() {}
    public static SqlPackingSlipListPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getClientCd(), (et, vl) -> ((SqlPackingSlipListPrint)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getClientNm(), (et, vl) -> ((SqlPackingSlipListPrint)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getClientAddress1(), (et, vl) -> ((SqlPackingSlipListPrint)et).setClientAddress1((String)vl), "clientAddress1");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getClientAddress2(), (et, vl) -> ((SqlPackingSlipListPrint)et).setClientAddress2((String)vl), "clientAddress2");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getClientAddress3(), (et, vl) -> ((SqlPackingSlipListPrint)et).setClientAddress3((String)vl), "clientAddress3");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getClientTelNo(), (et, vl) -> ((SqlPackingSlipListPrint)et).setClientTelNo((String)vl), "clientTelNo");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getShippingDt(), (et, vl) -> ((SqlPackingSlipListPrint)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getClientShippingNo(), (et, vl) -> ((SqlPackingSlipListPrint)et).setClientShippingNo((String)vl), "clientShippingNo");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getSupplyCustomerNm(), (et, vl) -> ((SqlPackingSlipListPrint)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getBillAddress1(), (et, vl) -> ((SqlPackingSlipListPrint)et).setBillAddress1((String)vl), "billAddress1");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getBillAddress2(), (et, vl) -> ((SqlPackingSlipListPrint)et).setBillAddress2((String)vl), "billAddress2");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getBillAddress3(), (et, vl) -> ((SqlPackingSlipListPrint)et).setBillAddress3((String)vl), "billAddress3");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getBillTelNo(), (et, vl) -> ((SqlPackingSlipListPrint)et).setBillTelNo((String)vl), "billTelNo");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getDelivCustomerNm(), (et, vl) -> ((SqlPackingSlipListPrint)et).setDelivCustomerNm((String)vl), "delivCustomerNm");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getDelivAddress1(), (et, vl) -> ((SqlPackingSlipListPrint)et).setDelivAddress1((String)vl), "delivAddress1");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getDelivAddress2(), (et, vl) -> ((SqlPackingSlipListPrint)et).setDelivAddress2((String)vl), "delivAddress2");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getDelivAddress3(), (et, vl) -> ((SqlPackingSlipListPrint)et).setDelivAddress3((String)vl), "delivAddress3");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getDelivTelNo(), (et, vl) -> ((SqlPackingSlipListPrint)et).setDelivTelNo((String)vl), "delivTelNo");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getProductCd(), (et, vl) -> ((SqlPackingSlipListPrint)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getProductNm(), (et, vl) -> ((SqlPackingSlipListPrint)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlPackingSlipListPrint)et).getAllocNum(), (et, vl) -> ((SqlPackingSlipListPrint)et).setAllocNum(ctb(vl)), "allocNum");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlPackingSlipListPrint";
    protected final String _tableDispName = "SqlPackingSlipListPrint";
    protected final String _tablePropertyName = "sqlPackingSlipListPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlPackingSlipListPrint", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientAddress1 = cci("CLIENT_ADDRESS1", "CLIENT_ADDRESS1", null, null, String.class, "clientAddress1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientAddress2 = cci("CLIENT_ADDRESS2", "CLIENT_ADDRESS2", null, null, String.class, "clientAddress2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientAddress3 = cci("CLIENT_ADDRESS3", "CLIENT_ADDRESS3", null, null, String.class, "clientAddress3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientTelNo = cci("CLIENT_TEL_NO", "CLIENT_TEL_NO", null, null, String.class, "clientTelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientShippingNo = cci("CLIENT_SHIPPING_NO", "CLIENT_SHIPPING_NO", null, null, String.class, "clientShippingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillAddress1 = cci("BILL_ADDRESS1", "BILL_ADDRESS1", null, null, String.class, "billAddress1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillAddress2 = cci("BILL_ADDRESS2", "BILL_ADDRESS2", null, null, String.class, "billAddress2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillAddress3 = cci("BILL_ADDRESS3", "BILL_ADDRESS3", null, null, String.class, "billAddress3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillTelNo = cci("BILL_TEL_NO", "BILL_TEL_NO", null, null, String.class, "billTelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm = cci("DELIV_CUSTOMER_NM", "DELIV_CUSTOMER_NM", null, null, String.class, "delivCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress1 = cci("DELIV_ADDRESS1", "DELIV_ADDRESS1", null, null, String.class, "delivAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress2 = cci("DELIV_ADDRESS2", "DELIV_ADDRESS2", null, null, String.class, "delivAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress3 = cci("DELIV_ADDRESS3", "DELIV_ADDRESS3", null, null, String.class, "delivAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTelNo = cci("DELIV_TEL_NO", "DELIV_TEL_NO", null, null, String.class, "delivTelNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);

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
     * CLIENT_ADDRESS1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientAddress1() { return _columnClientAddress1; }
    /**
     * CLIENT_ADDRESS2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientAddress2() { return _columnClientAddress2; }
    /**
     * CLIENT_ADDRESS3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientAddress3() { return _columnClientAddress3; }
    /**
     * CLIENT_TEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientTelNo() { return _columnClientTelNo; }
    /**
     * SHIPPING_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * CLIENT_SHIPPING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientShippingNo() { return _columnClientShippingNo; }
    /**
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerNm() { return _columnSupplyCustomerNm; }
    /**
     * BILL_ADDRESS1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillAddress1() { return _columnBillAddress1; }
    /**
     * BILL_ADDRESS2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillAddress2() { return _columnBillAddress2; }
    /**
     * BILL_ADDRESS3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillAddress3() { return _columnBillAddress3; }
    /**
     * BILL_TEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillTelNo() { return _columnBillTelNo; }
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
     * DELIV_TEL_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTelNo() { return _columnDelivTelNo; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * ALLOC_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNum() { return _columnAllocNum; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnClientAddress1());
        ls.add(columnClientAddress2());
        ls.add(columnClientAddress3());
        ls.add(columnClientTelNo());
        ls.add(columnShippingDt());
        ls.add(columnClientShippingNo());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnBillAddress1());
        ls.add(columnBillAddress2());
        ls.add(columnBillAddress3());
        ls.add(columnBillTelNo());
        ls.add(columnDelivCustomerNm());
        ls.add(columnDelivAddress1());
        ls.add(columnDelivAddress2());
        ls.add(columnDelivAddress3());
        ls.add(columnDelivTelNo());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnAllocNum());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlPackingSlipListPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlPackingSlipListPrint> getEntityType() { return SqlPackingSlipListPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlPackingSlipListPrint newEntity() { return new SqlPackingSlipListPrint(); }
    public SqlPackingSlipListPrint newMyEntity() { return new SqlPackingSlipListPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlPackingSlipListPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlPackingSlipListPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

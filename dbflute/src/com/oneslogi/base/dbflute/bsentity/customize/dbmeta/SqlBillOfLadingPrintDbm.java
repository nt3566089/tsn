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
 * The DB meta of SqlBillOfLadingPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlBillOfLadingPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlBillOfLadingPrintDbm _instance = new SqlBillOfLadingPrintDbm();
    private SqlBillOfLadingPrintDbm() {}
    public static SqlBillOfLadingPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getPickingHId(), (et, vl) -> ((SqlBillOfLadingPrint)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getPickingWorkNo(), (et, vl) -> ((SqlBillOfLadingPrint)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getShippingDt(), (et, vl) -> ((SqlBillOfLadingPrint)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getClientNm(), (et, vl) -> ((SqlBillOfLadingPrint)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getAddress1(), (et, vl) -> ((SqlBillOfLadingPrint)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getZipCdFrom(), (et, vl) -> ((SqlBillOfLadingPrint)et).setZipCdFrom((String)vl), "zipCdFrom");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getBolNo(), (et, vl) -> ((SqlBillOfLadingPrint)et).setBolNo((String)vl), "bolNo");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getDelivCustomerNm(), (et, vl) -> ((SqlBillOfLadingPrint)et).setDelivCustomerNm((String)vl), "delivCustomerNm");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getDelivAddress1(), (et, vl) -> ((SqlBillOfLadingPrint)et).setDelivAddress1((String)vl), "delivAddress1");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getZipCdTo(), (et, vl) -> ((SqlBillOfLadingPrint)et).setZipCdTo((String)vl), "zipCdTo");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getCarrierNm(), (et, vl) -> ((SqlBillOfLadingPrint)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getCarrierCd(), (et, vl) -> ((SqlBillOfLadingPrint)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getCarrierTraceNum(), (et, vl) -> ((SqlBillOfLadingPrint)et).setCarrierTraceNum((String)vl), "carrierTraceNum");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getPaymentTerm(), (et, vl) -> ((SqlBillOfLadingPrint)et).setPaymentTerm((String)vl), "paymentTerm");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getClientShippingNo(), (et, vl) -> ((SqlBillOfLadingPrint)et).setClientShippingNo((String)vl), "clientShippingNo");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getPkgs(), (et, vl) -> ((SqlBillOfLadingPrint)et).setPkgs(ctl(vl)), "pkgs");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrint)et).getWeight(), (et, vl) -> ((SqlBillOfLadingPrint)et).setWeight(ctb(vl)), "weight");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlBillOfLadingPrint";
    protected final String _tableDispName = "SqlBillOfLadingPrint";
    protected final String _tablePropertyName = "sqlBillOfLadingPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlBillOfLadingPrint", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("ADDRESS1", "ADDRESS1", null, null, String.class, "address1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCdFrom = cci("ZIP_CD_FROM", "ZIP_CD_FROM", null, null, String.class, "zipCdFrom", null, false, false, false, "varchar", 543, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBolNo = cci("BOL_NO", "BOL_NO", null, null, String.class, "bolNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm = cci("DELIV_CUSTOMER_NM", "DELIV_CUSTOMER_NM", null, null, String.class, "delivCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress1 = cci("DELIV_ADDRESS1", "DELIV_ADDRESS1", null, null, String.class, "delivAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCdTo = cci("ZIP_CD_TO", "ZIP_CD_TO", null, null, String.class, "zipCdTo", null, false, false, false, "varchar", 543, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierTraceNum = cci("CARRIER_TRACE_NUM", "CARRIER_TRACE_NUM", null, null, String.class, "carrierTraceNum", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentTerm = cci("PAYMENT_TERM", "PAYMENT_TERM", null, null, String.class, "paymentTerm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientShippingNo = cci("CLIENT_SHIPPING_NO", "CLIENT_SHIPPING_NO", null, null, String.class, "clientShippingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPkgs = cci("PKGS", "PKGS", null, null, Long.class, "pkgs", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWeight = cci("WEIGHT", "WEIGHT", null, null, java.math.BigDecimal.class, "weight", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);

    /**
     * PICKING_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
    /**
     * PICKING_WORK_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
    /**
     * SHIPPING_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * ADDRESS1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress1() { return _columnAddress1; }
    /**
     * ZIP_CD_FROM: {varchar(543)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCdFrom() { return _columnZipCdFrom; }
    /**
     * BOL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolNo() { return _columnBolNo; }
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
     * ZIP_CD_TO: {varchar(543)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCdTo() { return _columnZipCdTo; }
    /**
     * CARRIER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNm() { return _columnCarrierNm; }
    /**
     * CARRIER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierCd() { return _columnCarrierCd; }
    /**
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierTraceNum() { return _columnCarrierTraceNum; }
    /**
     * PAYMENT_TERM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentTerm() { return _columnPaymentTerm; }
    /**
     * CLIENT_SHIPPING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientShippingNo() { return _columnClientShippingNo; }
    /**
     * PKGS: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPkgs() { return _columnPkgs; }
    /**
     * WEIGHT: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWeight() { return _columnWeight; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPickingHId());
        ls.add(columnPickingWorkNo());
        ls.add(columnShippingDt());
        ls.add(columnClientNm());
        ls.add(columnAddress1());
        ls.add(columnZipCdFrom());
        ls.add(columnBolNo());
        ls.add(columnDelivCustomerNm());
        ls.add(columnDelivAddress1());
        ls.add(columnZipCdTo());
        ls.add(columnCarrierNm());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierTraceNum());
        ls.add(columnPaymentTerm());
        ls.add(columnClientShippingNo());
        ls.add(columnPkgs());
        ls.add(columnWeight());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlBillOfLadingPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlBillOfLadingPrint> getEntityType() { return SqlBillOfLadingPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlBillOfLadingPrint newEntity() { return new SqlBillOfLadingPrint(); }
    public SqlBillOfLadingPrint newMyEntity() { return new SqlBillOfLadingPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlBillOfLadingPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlBillOfLadingPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

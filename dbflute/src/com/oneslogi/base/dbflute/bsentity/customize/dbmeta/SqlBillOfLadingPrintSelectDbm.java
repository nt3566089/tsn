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
 * The DB meta of SqlBillOfLadingPrintSelect. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlBillOfLadingPrintSelectDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlBillOfLadingPrintSelectDbm _instance = new SqlBillOfLadingPrintSelectDbm();
    private SqlBillOfLadingPrintSelectDbm() {}
    public static SqlBillOfLadingPrintSelectDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getPickingHId(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getBolNo(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setBolNo((String)vl), "bolNo");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getPickingWorkNo(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getShippingDt(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getCarrierCd(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getCarrierNm(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getDeliveryCourseCd(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getDeliveryCourseNm(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getSupplyCustomerCd(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getSupplyCustomerNm(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getDelivCustomerCd(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setDelivCustomerCd((String)vl), "delivCustomerCd");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getDelivCustomerNm(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setDelivCustomerNm((String)vl), "delivCustomerNm");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getDelivAddress1(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setDelivAddress1((String)vl), "delivAddress1");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getDelivAddress2(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setDelivAddress2((String)vl), "delivAddress2");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getDelivAddress3(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setDelivAddress3((String)vl), "delivAddress3");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getDelivZipCd(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setDelivZipCd((String)vl), "delivZipCd");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getCarrierTraceNum(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setCarrierTraceNum((String)vl), "carrierTraceNum");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getBolOutFlg(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setBolOutFlg((String)vl), "bolOutFlg");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getBolOutNm(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setBolOutNm((String)vl), "bolOutNm");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getBolOutDt(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setBolOutDt(cttp(vl)), "bolOutDt");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSelect)et).getUserNm(), (et, vl) -> ((SqlBillOfLadingPrintSelect)et).setUserNm((String)vl), "userNm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlBillOfLadingPrintSelect";
    protected final String _tableDispName = "SqlBillOfLadingPrintSelect";
    protected final String _tablePropertyName = "sqlBillOfLadingPrintSelect";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlBillOfLadingPrintSelect", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBolNo = cci("BOL_NO", "BOL_NO", null, null, String.class, "bolNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerCd = cci("DELIV_CUSTOMER_CD", "DELIV_CUSTOMER_CD", null, null, String.class, "delivCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm = cci("DELIV_CUSTOMER_NM", "DELIV_CUSTOMER_NM", null, null, String.class, "delivCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress1 = cci("DELIV_ADDRESS1", "DELIV_ADDRESS1", null, null, String.class, "delivAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress2 = cci("DELIV_ADDRESS2", "DELIV_ADDRESS2", null, null, String.class, "delivAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress3 = cci("DELIV_ADDRESS3", "DELIV_ADDRESS3", null, null, String.class, "delivAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivZipCd = cci("DELIV_ZIP_CD", "DELIV_ZIP_CD", null, null, String.class, "delivZipCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierTraceNum = cci("CARRIER_TRACE_NUM", "CARRIER_TRACE_NUM", null, null, String.class, "carrierTraceNum", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBolOutFlg = cci("BOL_OUT_FLG", "BOL_OUT_FLG", null, null, String.class, "bolOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.BolOutFlg, false);
    protected final ColumnInfo _columnBolOutNm = cci("BOL_OUT_NM", "BOL_OUT_NM", null, null, String.class, "bolOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBolOutDt = cci("BOL_OUT_DT", "BOL_OUT_DT", null, null, java.sql.Timestamp.class, "bolOutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);

    /**
     * PICKING_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
    /**
     * BOL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolNo() { return _columnBolNo; }
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
     * DELIV_ZIP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivZipCd() { return _columnDelivZipCd; }
    /**
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierTraceNum() { return _columnCarrierTraceNum; }
    /**
     * BOL_OUT_FLG: {char(1), classification=BolOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolOutFlg() { return _columnBolOutFlg; }
    /**
     * BOL_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolOutNm() { return _columnBolOutNm; }
    /**
     * BOL_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolOutDt() { return _columnBolOutDt; }
    /**
     * USER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNm() { return _columnUserNm; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPickingHId());
        ls.add(columnBolNo());
        ls.add(columnPickingWorkNo());
        ls.add(columnShippingDt());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDeliveryCourseNm());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnDelivCustomerCd());
        ls.add(columnDelivCustomerNm());
        ls.add(columnDelivAddress1());
        ls.add(columnDelivAddress2());
        ls.add(columnDelivAddress3());
        ls.add(columnDelivZipCd());
        ls.add(columnCarrierTraceNum());
        ls.add(columnBolOutFlg());
        ls.add(columnBolOutNm());
        ls.add(columnBolOutDt());
        ls.add(columnUserNm());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlBillOfLadingPrintSelect"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlBillOfLadingPrintSelect> getEntityType() { return SqlBillOfLadingPrintSelect.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlBillOfLadingPrintSelect newEntity() { return new SqlBillOfLadingPrintSelect(); }
    public SqlBillOfLadingPrintSelect newMyEntity() { return new SqlBillOfLadingPrintSelect(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlBillOfLadingPrintSelect)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlBillOfLadingPrintSelect)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

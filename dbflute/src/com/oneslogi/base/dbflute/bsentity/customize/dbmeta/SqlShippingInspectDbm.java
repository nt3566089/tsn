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
 * The DB meta of SqlShippingInspect. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlShippingInspectDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlShippingInspectDbm _instance = new SqlShippingInspectDbm();
    private SqlShippingInspectDbm() {}
    public static SqlShippingInspectDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getClientId(), (et, vl) -> ((SqlShippingInspect)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getCenterId(), (et, vl) -> ((SqlShippingInspect)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getAddDt(), (et, vl) -> ((SqlShippingInspect)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getSupplyCustomerCd(), (et, vl) -> ((SqlShippingInspect)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getSupplyCustomerNm(), (et, vl) -> ((SqlShippingInspect)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getDeliveryCourseCd(), (et, vl) -> ((SqlShippingInspect)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getDeliveryCourseNm(), (et, vl) -> ((SqlShippingInspect)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getCarrierCd(), (et, vl) -> ((SqlShippingInspect)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getCarrierNm(), (et, vl) -> ((SqlShippingInspect)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getSumInstNum(), (et, vl) -> ((SqlShippingInspect)et).setSumInstNum(ctb(vl)), "sumInstNum");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getJanCd(), (et, vl) -> ((SqlShippingInspect)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getProductId(), (et, vl) -> ((SqlShippingInspect)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getProductCd(), (et, vl) -> ((SqlShippingInspect)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getProductNm(), (et, vl) -> ((SqlShippingInspect)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getProductAbbr(), (et, vl) -> ((SqlShippingInspect)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getUnitNum(), (et, vl) -> ((SqlShippingInspect)et).setUnitNum(ctl(vl)), "unitNum");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getSumNetWeight(), (et, vl) -> ((SqlShippingInspect)et).setSumNetWeight(ctb(vl)), "sumNetWeight");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getSumGrossWeight(), (et, vl) -> ((SqlShippingInspect)et).setSumGrossWeight(ctb(vl)), "sumGrossWeight");
        setupEpg(_epgMap, et -> ((SqlShippingInspect)et).getAllocInstHId(), (et, vl) -> ((SqlShippingInspect)et).setAllocInstHId(ctl(vl)), "allocInstHId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlShippingInspect";
    protected final String _tableDispName = "SqlShippingInspect";
    protected final String _tablePropertyName = "sqlShippingInspect";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlShippingInspect", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSumInstNum = cci("SUM_INST_NUM", "SUM_INST_NUM", null, null, java.math.BigDecimal.class, "sumInstNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, true, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, Long.class, "unitNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSumNetWeight = cci("SUM_NET_WEIGHT", "SUM_NET_WEIGHT", null, null, java.math.BigDecimal.class, "sumNetWeight", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSumGrossWeight = cci("SUM_GROSS_WEIGHT", "SUM_GROSS_WEIGHT", null, null, java.math.BigDecimal.class, "sumGrossWeight", null, false, false, false, "decimal", 38, 12, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocInstHId = cci("ALLOC_INST_H_ID", "ALLOC_INST_H_ID", null, null, Long.class, "allocInstHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
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
     * SUM_INST_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSumInstNum() { return _columnSumInstNum; }
    /**
     * JAN_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
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
     * PRODUCT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * UNIT_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNum() { return _columnUnitNum; }
    /**
     * SUM_NET_WEIGHT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSumNetWeight() { return _columnSumNetWeight; }
    /**
     * SUM_GROSS_WEIGHT: {decimal(38, 12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSumGrossWeight() { return _columnSumGrossWeight; }
    /**
     * ALLOC_INST_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstHId() { return _columnAllocInstHId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnAddDt());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDeliveryCourseNm());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnSumInstNum());
        ls.add(columnJanCd());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnProductAbbr());
        ls.add(columnUnitNum());
        ls.add(columnSumNetWeight());
        ls.add(columnSumGrossWeight());
        ls.add(columnAllocInstHId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnProductId()); }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlShippingInspect"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlShippingInspect> getEntityType() { return SqlShippingInspect.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlShippingInspect newEntity() { return new SqlShippingInspect(); }
    public SqlShippingInspect newMyEntity() { return new SqlShippingInspect(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlShippingInspect)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlShippingInspect)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

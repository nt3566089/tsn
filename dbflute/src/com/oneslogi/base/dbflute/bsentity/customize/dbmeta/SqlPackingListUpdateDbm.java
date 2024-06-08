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
 * The DB meta of SqlPackingListUpdate. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlPackingListUpdateDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlPackingListUpdateDbm _instance = new SqlPackingListUpdateDbm();
    private SqlPackingListUpdateDbm() {}
    public static SqlPackingListUpdateDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getPackingHId(), (et, vl) -> ((SqlPackingListUpdate)et).setPackingHId(ctl(vl)), "packingHId");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getCenterId(), (et, vl) -> ((SqlPackingListUpdate)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getCenterCd(), (et, vl) -> ((SqlPackingListUpdate)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getCenterNm(), (et, vl) -> ((SqlPackingListUpdate)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getClientId(), (et, vl) -> ((SqlPackingListUpdate)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getClientCd(), (et, vl) -> ((SqlPackingListUpdate)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getClientNm(), (et, vl) -> ((SqlPackingListUpdate)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getBoxCd(), (et, vl) -> ((SqlPackingListUpdate)et).setBoxCd((String)vl), "boxCd");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getBoxNm(), (et, vl) -> ((SqlPackingListUpdate)et).setBoxNm((String)vl), "boxNm");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getProductCd(), (et, vl) -> ((SqlPackingListUpdate)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getJanCd(), (et, vl) -> ((SqlPackingListUpdate)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getProductNm(), (et, vl) -> ((SqlPackingListUpdate)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getProductId(), (et, vl) -> ((SqlPackingListUpdate)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getProductAbbr(), (et, vl) -> ((SqlPackingListUpdate)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getPackingNumSum(), (et, vl) -> ((SqlPackingListUpdate)et).setPackingNumSum(ctb(vl)), "packingNumSum");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getDelivDt(), (et, vl) -> ((SqlPackingListUpdate)et).setDelivDt((String)vl), "delivDt");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getDelivTz(), (et, vl) -> ((SqlPackingListUpdate)et).setDelivTz((String)vl), "delivTz");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getDelivZipCd(), (et, vl) -> ((SqlPackingListUpdate)et).setDelivZipCd((String)vl), "delivZipCd");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getDelivTelNo(), (et, vl) -> ((SqlPackingListUpdate)et).setDelivTelNo((String)vl), "delivTelNo");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getDelivAddress1(), (et, vl) -> ((SqlPackingListUpdate)et).setDelivAddress1((String)vl), "delivAddress1");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getDelivAddress2(), (et, vl) -> ((SqlPackingListUpdate)et).setDelivAddress2((String)vl), "delivAddress2");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getDelivAddress3(), (et, vl) -> ((SqlPackingListUpdate)et).setDelivAddress3((String)vl), "delivAddress3");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getDelivCustomerNm(), (et, vl) -> ((SqlPackingListUpdate)et).setDelivCustomerNm((String)vl), "delivCustomerNm");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getVersionNo(), (et, vl) -> ((SqlPackingListUpdate)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getProcessTypeId(), (et, vl) -> ((SqlPackingListUpdate)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getAllocInstHId(), (et, vl) -> ((SqlPackingListUpdate)et).setAllocInstHId(ctl(vl)), "allocInstHId");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getPickingHId(), (et, vl) -> ((SqlPackingListUpdate)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getShippingPackingNo(), (et, vl) -> ((SqlPackingListUpdate)et).setShippingPackingNo((String)vl), "shippingPackingNo");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getCarrierTraceNum(), (et, vl) -> ((SqlPackingListUpdate)et).setCarrierTraceNum((String)vl), "carrierTraceNum");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getPickingNumSum(), (et, vl) -> ((SqlPackingListUpdate)et).setPickingNumSum(ctb(vl)), "pickingNumSum");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getUpdDt(), (et, vl) -> ((SqlPackingListUpdate)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getCount(), (et, vl) -> ((SqlPackingListUpdate)et).setCount(ctl(vl)), "count");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlPackingListUpdate";
    protected final String _tableDispName = "SqlPackingListUpdate";
    protected final String _tablePropertyName = "sqlPackingListUpdate";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlPackingListUpdate", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPackingHId = cci("PACKING_H_ID", "PACKING_H_ID", null, null, Long.class, "packingHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxCd = cci("BOX_CD", "BOX_CD", null, null, String.class, "boxCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNm = cci("BOX_NM", "BOX_NM", null, null, String.class, "boxNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, true, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNumSum = cci("PACKING_NUM_SUM", "PACKING_NUM_SUM", null, null, java.math.BigDecimal.class, "packingNumSum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivDt = cci("DELIV_DT", "DELIV_DT", null, null, String.class, "delivDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTz = cci("DELIV_TZ", "DELIV_TZ", null, null, String.class, "delivTz", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivZipCd = cci("DELIV_ZIP_CD", "DELIV_ZIP_CD", null, null, String.class, "delivZipCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTelNo = cci("DELIV_TEL_NO", "DELIV_TEL_NO", null, null, String.class, "delivTelNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress1 = cci("DELIV_ADDRESS1", "DELIV_ADDRESS1", null, null, String.class, "delivAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress2 = cci("DELIV_ADDRESS2", "DELIV_ADDRESS2", null, null, String.class, "delivAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress3 = cci("DELIV_ADDRESS3", "DELIV_ADDRESS3", null, null, String.class, "delivAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm = cci("DELIV_CUSTOMER_NM", "DELIV_CUSTOMER_NM", null, null, String.class, "delivCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocInstHId = cci("ALLOC_INST_H_ID", "ALLOC_INST_H_ID", null, null, Long.class, "allocInstHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPackingNo = cci("SHIPPING_PACKING_NO", "SHIPPING_PACKING_NO", null, null, String.class, "shippingPackingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierTraceNum = cci("CARRIER_TRACE_NUM", "CARRIER_TRACE_NUM", null, null, String.class, "carrierTraceNum", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingNumSum = cci("PICKING_NUM_SUM", "PICKING_NUM_SUM", null, null, java.math.BigDecimal.class, "pickingNumSum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCount = cci("COUNT", "COUNT", null, null, Long.class, "count", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * PACKING_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingHId() { return _columnPackingHId; }
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
     * BOX_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxCd() { return _columnBoxCd; }
    /**
     * BOX_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNm() { return _columnBoxNm; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * JAN_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * PACKING_NUM_SUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNumSum() { return _columnPackingNumSum; }
    /**
     * DELIV_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivDt() { return _columnDelivDt; }
    /**
     * DELIV_TZ: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTz() { return _columnDelivTz; }
    /**
     * DELIV_ZIP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivZipCd() { return _columnDelivZipCd; }
    /**
     * DELIV_TEL_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTelNo() { return _columnDelivTelNo; }
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
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerNm() { return _columnDelivCustomerNm; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * PROCESS_TYPE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeId() { return _columnProcessTypeId; }
    /**
     * ALLOC_INST_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstHId() { return _columnAllocInstHId; }
    /**
     * PICKING_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
    /**
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPackingNo() { return _columnShippingPackingNo; }
    /**
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierTraceNum() { return _columnCarrierTraceNum; }
    /**
     * PICKING_NUM_SUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingNumSum() { return _columnPickingNumSum; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * COUNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCount() { return _columnCount; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPackingHId());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnBoxCd());
        ls.add(columnBoxNm());
        ls.add(columnProductCd());
        ls.add(columnJanCd());
        ls.add(columnProductNm());
        ls.add(columnProductId());
        ls.add(columnProductAbbr());
        ls.add(columnPackingNumSum());
        ls.add(columnDelivDt());
        ls.add(columnDelivTz());
        ls.add(columnDelivZipCd());
        ls.add(columnDelivTelNo());
        ls.add(columnDelivAddress1());
        ls.add(columnDelivAddress2());
        ls.add(columnDelivAddress3());
        ls.add(columnDelivCustomerNm());
        ls.add(columnVersionNo());
        ls.add(columnProcessTypeId());
        ls.add(columnAllocInstHId());
        ls.add(columnPickingHId());
        ls.add(columnShippingPackingNo());
        ls.add(columnCarrierTraceNum());
        ls.add(columnPickingNumSum());
        ls.add(columnUpdDt());
        ls.add(columnCount());
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
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlPackingListUpdate"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlPackingListUpdate> getEntityType() { return SqlPackingListUpdate.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlPackingListUpdate newEntity() { return new SqlPackingListUpdate(); }
    public SqlPackingListUpdate newMyEntity() { return new SqlPackingListUpdate(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlPackingListUpdate)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlPackingListUpdate)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

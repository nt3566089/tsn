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
 * The DB meta of SqlReceiveDataList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlReceiveDataListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlReceiveDataListDbm _instance = new SqlReceiveDataListDbm();
    private SqlReceiveDataListDbm() {}
    public static SqlReceiveDataListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getReceivePlanHId(), (et, vl) -> ((SqlReceiveDataList)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getReceivePlanBId(), (et, vl) -> ((SqlReceiveDataList)et).setReceivePlanBId(ctl(vl)), "receivePlanBId");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getReceiveStatus(), (et, vl) -> ((SqlReceiveDataList)et).setReceiveStatus((String)vl), "receiveStatus");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getProductId(), (et, vl) -> ((SqlReceiveDataList)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getProductCd(), (et, vl) -> ((SqlReceiveDataList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getPlanLot(), (et, vl) -> ((SqlReceiveDataList)et).setPlanLot((String)vl), "planLot");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getPlanLimitDt(), (et, vl) -> ((SqlReceiveDataList)et).setPlanLimitDt((String)vl), "planLimitDt");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getPlanLocationCd(), (et, vl) -> ((SqlReceiveDataList)et).setPlanLocationCd((String)vl), "planLocationCd");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getPlanStoreLabelNo(), (et, vl) -> ((SqlReceiveDataList)et).setPlanStoreLabelNo((String)vl), "planStoreLabelNo");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getPlanNum(), (et, vl) -> ((SqlReceiveDataList)et).setPlanNum(ctb(vl)), "planNum");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getStoreRecordHId(), (et, vl) -> ((SqlReceiveDataList)et).setStoreRecordHId(ctl(vl)), "storeRecordHId");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getStoreRecordBId(), (et, vl) -> ((SqlReceiveDataList)et).setStoreRecordBId(ctl(vl)), "storeRecordBId");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getLot(), (et, vl) -> ((SqlReceiveDataList)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getLimitDt(), (et, vl) -> ((SqlReceiveDataList)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getStoreDt(), (et, vl) -> ((SqlReceiveDataList)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getStoreNum(), (et, vl) -> ((SqlReceiveDataList)et).setStoreNum(ctb(vl)), "storeNum");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getStoreLocationCd(), (et, vl) -> ((SqlReceiveDataList)et).setStoreLocationCd((String)vl), "storeLocationCd");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getProductNm(), (et, vl) -> ((SqlReceiveDataList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getProductAbbr(), (et, vl) -> ((SqlReceiveDataList)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getJanCd(), (et, vl) -> ((SqlReceiveDataList)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getReceiveStatusNm(), (et, vl) -> ((SqlReceiveDataList)et).setReceiveStatusNm((String)vl), "receiveStatusNm");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getReceivePlanDt(), (et, vl) -> ((SqlReceiveDataList)et).setReceivePlanDt((String)vl), "receivePlanDt");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getPlanClientReceiveNo(), (et, vl) -> ((SqlReceiveDataList)et).setPlanClientReceiveNo((String)vl), "planClientReceiveNo");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getReceiveSlipNo(), (et, vl) -> ((SqlReceiveDataList)et).setReceiveSlipNo((String)vl), "receiveSlipNo");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getLineNo(), (et, vl) -> ((SqlReceiveDataList)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getCenterId(), (et, vl) -> ((SqlReceiveDataList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getClientId(), (et, vl) -> ((SqlReceiveDataList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getPlanSupplierCd(), (et, vl) -> ((SqlReceiveDataList)et).setPlanSupplierCd((String)vl), "planSupplierCd");
        setupEpg(_epgMap, et -> ((SqlReceiveDataList)et).getStoreSupplierCd(), (et, vl) -> ((SqlReceiveDataList)et).setStoreSupplierCd((String)vl), "storeSupplierCd");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlReceiveDataList";
    protected final String _tableDispName = "SqlReceiveDataList";
    protected final String _tablePropertyName = "sqlReceiveDataList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlReceiveDataList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceivePlanHId = cci("receive_plan_h_id", "receive_plan_h_id", null, null, Long.class, "receivePlanHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanBId = cci("receive_plan_b_id", "receive_plan_b_id", null, null, Long.class, "receivePlanBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveStatus = cci("receive_status", "receive_status", null, null, String.class, "receiveStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("product_id", "product_id", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("product_cd", "product_cd", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLot = cci("plan_lot", "plan_lot", null, null, String.class, "planLot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLimitDt = cci("plan_limit_dt", "plan_limit_dt", null, null, String.class, "planLimitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLocationCd = cci("plan_location_cd", "plan_location_cd", null, null, String.class, "planLocationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanStoreLabelNo = cci("plan_store_label_no", "plan_store_label_no", null, null, String.class, "planStoreLabelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanNum = cci("plan_num", "plan_num", null, null, java.math.BigDecimal.class, "planNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreRecordHId = cci("store_record_h_id", "store_record_h_id", null, null, Long.class, "storeRecordHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreRecordBId = cci("store_record_b_id", "store_record_b_id", null, null, Long.class, "storeRecordBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("lot", "lot", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("limit_dt", "limit_dt", null, null, String.class, "limitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("store_dt", "store_dt", null, null, String.class, "storeDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreNum = cci("store_num", "store_num", null, null, java.math.BigDecimal.class, "storeNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreLocationCd = cci("store_location_cd", "store_location_cd", null, null, String.class, "storeLocationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("product_nm", "product_nm", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("product_abbr", "product_abbr", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("jan_cd", "jan_cd", null, null, String.class, "janCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveStatusNm = cci("receive_status_nm", "receive_status_nm", null, null, String.class, "receiveStatusNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanDt = cci("receive_plan_dt", "receive_plan_dt", null, null, String.class, "receivePlanDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanClientReceiveNo = cci("plan_client_receive_no", "plan_client_receive_no", null, null, String.class, "planClientReceiveNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveSlipNo = cci("receive_slip_no", "receive_slip_no", null, null, String.class, "receiveSlipNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineNo = cci("line_no", "line_no", null, null, Long.class, "lineNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("center_id", "center_id", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("client_id", "client_id", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanSupplierCd = cci("plan_supplier_cd", "plan_supplier_cd", null, null, String.class, "planSupplierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreSupplierCd = cci("store_supplier_cd", "store_supplier_cd", null, null, String.class, "storeSupplierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);

    /**
     * receive_plan_h_id: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
    /**
     * receive_plan_b_id: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanBId() { return _columnReceivePlanBId; }
    /**
     * receive_status: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveStatus() { return _columnReceiveStatus; }
    /**
     * product_id: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * product_cd: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * plan_lot: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanLot() { return _columnPlanLot; }
    /**
     * plan_limit_dt: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanLimitDt() { return _columnPlanLimitDt; }
    /**
     * plan_location_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanLocationCd() { return _columnPlanLocationCd; }
    /**
     * plan_store_label_no: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanStoreLabelNo() { return _columnPlanStoreLabelNo; }
    /**
     * plan_num: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanNum() { return _columnPlanNum; }
    /**
     * store_record_h_id: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRecordHId() { return _columnStoreRecordHId; }
    /**
     * store_record_b_id: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRecordBId() { return _columnStoreRecordBId; }
    /**
     * lot: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * limit_dt: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * store_dt: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
    /**
     * store_num: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNum() { return _columnStoreNum; }
    /**
     * store_location_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLocationCd() { return _columnStoreLocationCd; }
    /**
     * product_nm: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * product_abbr: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * jan_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * receive_status_nm: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveStatusNm() { return _columnReceiveStatusNm; }
    /**
     * receive_plan_dt: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanDt() { return _columnReceivePlanDt; }
    /**
     * plan_client_receive_no: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanClientReceiveNo() { return _columnPlanClientReceiveNo; }
    /**
     * receive_slip_no: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveSlipNo() { return _columnReceiveSlipNo; }
    /**
     * line_no: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * center_id: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * client_id: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * plan_supplier_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanSupplierCd() { return _columnPlanSupplierCd; }
    /**
     * store_supplier_cd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreSupplierCd() { return _columnStoreSupplierCd; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnReceivePlanHId());
        ls.add(columnReceivePlanBId());
        ls.add(columnReceiveStatus());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnPlanLot());
        ls.add(columnPlanLimitDt());
        ls.add(columnPlanLocationCd());
        ls.add(columnPlanStoreLabelNo());
        ls.add(columnPlanNum());
        ls.add(columnStoreRecordHId());
        ls.add(columnStoreRecordBId());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnStoreDt());
        ls.add(columnStoreNum());
        ls.add(columnStoreLocationCd());
        ls.add(columnProductNm());
        ls.add(columnProductAbbr());
        ls.add(columnJanCd());
        ls.add(columnReceiveStatusNm());
        ls.add(columnReceivePlanDt());
        ls.add(columnPlanClientReceiveNo());
        ls.add(columnReceiveSlipNo());
        ls.add(columnLineNo());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnPlanSupplierCd());
        ls.add(columnStoreSupplierCd());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlReceiveDataList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlReceiveDataList> getEntityType() { return SqlReceiveDataList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlReceiveDataList newEntity() { return new SqlReceiveDataList(); }
    public SqlReceiveDataList newMyEntity() { return new SqlReceiveDataList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlReceiveDataList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlReceiveDataList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

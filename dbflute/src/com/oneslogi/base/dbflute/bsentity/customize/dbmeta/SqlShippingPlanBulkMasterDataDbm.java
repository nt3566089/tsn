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
 * The DB meta of SqlShippingPlanBulkMasterData. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlShippingPlanBulkMasterDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlShippingPlanBulkMasterDataDbm _instance = new SqlShippingPlanBulkMasterDataDbm();
    private SqlShippingPlanBulkMasterDataDbm() {}
    public static SqlShippingPlanBulkMasterDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getShippingInstHId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setShippingInstHId(ctl(vl)), "shippingInstHId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getShippingInstBId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setShippingInstBId(ctl(vl)), "shippingInstBId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getSupplyCustomerId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setSupplyCustomerId(ctl(vl)), "supplyCustomerId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getSupplyCustomerCd(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getSupplyCustomerNm(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getSupplyDeliveryFlg(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setSupplyDeliveryFlg((String)vl), "supplyDeliveryFlg");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDeliveryCustomerId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDeliveryCustomerId(ctl(vl)), "deliveryCustomerId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDeliveryCustomerCd(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDeliveryCustomerCd((String)vl), "deliveryCustomerCd");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDeliveryCustomerNm(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDeliveryCustomerNm((String)vl), "deliveryCustomerNm");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDeliveryZipCd(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDeliveryZipCd((String)vl), "deliveryZipCd");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDeliveryTelNo(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDeliveryTelNo((String)vl), "deliveryTelNo");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDeliveryAddress1(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDeliveryAddress1((String)vl), "deliveryAddress1");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDeliveryAddress2(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDeliveryAddress2((String)vl), "deliveryAddress2");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDeliveryAddress3(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDeliveryAddress3((String)vl), "deliveryAddress3");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDeliveryDeliveryFlg(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDeliveryDeliveryFlg((String)vl), "deliveryDeliveryFlg");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDeliveryOnetimeFlg(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDeliveryOnetimeFlg((String)vl), "deliveryOnetimeFlg");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getClientCenterId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setClientCenterId(ctl(vl)), "clientCenterId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMclientCenterCenterId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMclientCenterCenterId(ctl(vl)), "mclientCenterCenterId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMclientCenterClientId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMclientCenterClientId(ctl(vl)), "mclientCenterClientId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMclientCenterCustomerId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMclientCenterCustomerId(ctl(vl)), "mclientCenterCustomerId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMcenterCenterId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMcenterCenterId(ctl(vl)), "mcenterCenterId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMcustomerCcCustomerId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMcustomerCcCustomerId(ctl(vl)), "mcustomerCcCustomerId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMzipZipId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMzipZipId(ctl(vl)), "mzipZipId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDeliveryCourseId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDeliveryCourseId(ctl(vl)), "deliveryCourseId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDeliveryCourseCd(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDeliveryCourseNm(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMdelivCourseCarrierId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMdelivCourseCarrierId(ctl(vl)), "mdelivCourseCarrierId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMcarrierCarrierCd(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMcarrierCarrierCd((String)vl), "mcarrierCarrierCd");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMcarrierDelFlg(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMcarrierDelFlg((String)vl), "mcarrierDelFlg");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDepositCustomerId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDepositCustomerId(ctl(vl)), "depositCustomerId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDepositCustomerCd(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDepositCustomerCd((String)vl), "depositCustomerCd");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDepositCustomerNm(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDepositCustomerNm((String)vl), "depositCustomerNm");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDepositDepositFlg(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDepositDepositFlg((String)vl), "depositDepositFlg");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getStockTypeId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getStockTypeCd(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMproductProductId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMproductProductId(ctl(vl)), "mproductProductId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMproductProductCd(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMproductProductCd((String)vl), "mproductProductCd");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMproductProductNm(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMproductProductNm((String)vl), "mproductProductNm");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMsDecimalExistFlg(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMsDecimalExistFlg((String)vl), "msDecimalExistFlg");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMwWarehouseId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMwWarehouseId(ctl(vl)), "mwWarehouseId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMwWarehouseCd(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMwWarehouseCd((String)vl), "mwWarehouseCd");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMwWarehouseNm(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMwWarehouseNm((String)vl), "mwWarehouseNm");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMlLocationId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMlLocationId(ctl(vl)), "mlLocationId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMlLocationCd(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMlLocationCd((String)vl), "mlLocationCd");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMlLocationNm(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMlLocationNm((String)vl), "mlLocationNm");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMzMwWarehouseId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMzMwWarehouseId(ctl(vl)), "mzMwWarehouseId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getMzMwWarehouseCd(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setMzMwWarehouseCd((String)vl), "mzMwWarehouseCd");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getCenterCustomerId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setCenterCustomerId(ctl(vl)), "centerCustomerId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDelivCourseIdByCustomer(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDelivCourseIdByCustomer(ctl(vl)), "delivCourseIdByCustomer");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getCenterId(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlShippingPlanBulkMasterData)et).getDelivCourseCdByCustomer(), (et, vl) -> ((SqlShippingPlanBulkMasterData)et).setDelivCourseCdByCustomer((String)vl), "delivCourseCdByCustomer");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlShippingPlanBulkMasterData";
    protected final String _tableDispName = "SqlShippingPlanBulkMasterData";
    protected final String _tablePropertyName = "sqlShippingPlanBulkMasterData";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlShippingPlanBulkMasterData", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingInstHId = cci("SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", null, null, Long.class, "shippingInstHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingInstBId = cci("SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", null, null, Long.class, "shippingInstBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerId = cci("SUPPLY_CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", null, null, Long.class, "supplyCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyDeliveryFlg = cci("SUPPLY_DELIVERY_FLG", "SUPPLY_DELIVERY_FLG", null, null, String.class, "supplyDeliveryFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCustomerId = cci("DELIVERY_CUSTOMER_ID", "DELIVERY_CUSTOMER_ID", null, null, Long.class, "deliveryCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCustomerCd = cci("DELIVERY_CUSTOMER_CD", "DELIVERY_CUSTOMER_CD", null, null, String.class, "deliveryCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCustomerNm = cci("DELIVERY_CUSTOMER_NM", "DELIVERY_CUSTOMER_NM", null, null, String.class, "deliveryCustomerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryZipCd = cci("DELIVERY_ZIP_CD", "DELIVERY_ZIP_CD", null, null, String.class, "deliveryZipCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryTelNo = cci("DELIVERY_TEL_NO", "DELIVERY_TEL_NO", null, null, String.class, "deliveryTelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryAddress1 = cci("DELIVERY_ADDRESS1", "DELIVERY_ADDRESS1", null, null, String.class, "deliveryAddress1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryAddress2 = cci("DELIVERY_ADDRESS2", "DELIVERY_ADDRESS2", null, null, String.class, "deliveryAddress2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryAddress3 = cci("DELIVERY_ADDRESS3", "DELIVERY_ADDRESS3", null, null, String.class, "deliveryAddress3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryDeliveryFlg = cci("DELIVERY_DELIVERY_FLG", "DELIVERY_DELIVERY_FLG", null, null, String.class, "deliveryDeliveryFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryOnetimeFlg = cci("DELIVERY_ONETIME_FLG", "DELIVERY_ONETIME_FLG", null, null, String.class, "deliveryOnetimeFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCenterId = cci("CLIENT_CENTER_ID", "CLIENT_CENTER_ID", null, null, Long.class, "clientCenterId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMclientCenterCenterId = cci("MCLIENT_CENTER_CENTER_ID", "MCLIENT_CENTER_CENTER_ID", null, null, Long.class, "mclientCenterCenterId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMclientCenterClientId = cci("MCLIENT_CENTER_CLIENT_ID", "MCLIENT_CENTER_CLIENT_ID", null, null, Long.class, "mclientCenterClientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMclientCenterCustomerId = cci("MCLIENT_CENTER_CUSTOMER_ID", "MCLIENT_CENTER_CUSTOMER_ID", null, null, Long.class, "mclientCenterCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMcenterCenterId = cci("MCENTER_CENTER_ID", "MCENTER_CENTER_ID", null, null, Long.class, "mcenterCenterId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMcustomerCcCustomerId = cci("MCUSTOMER_CC_CUSTOMER_ID", "MCUSTOMER_CC_CUSTOMER_ID", null, null, Long.class, "mcustomerCcCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMzipZipId = cci("MZIP_ZIP_ID", "MZIP_ZIP_ID", null, null, Long.class, "mzipZipId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseId = cci("DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", null, null, Long.class, "deliveryCourseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMdelivCourseCarrierId = cci("MDELIV_COURSE_CARRIER_ID", "MDELIV_COURSE_CARRIER_ID", null, null, Long.class, "mdelivCourseCarrierId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMcarrierCarrierCd = cci("MCARRIER_CARRIER_CD", "MCARRIER_CARRIER_CD", null, null, String.class, "mcarrierCarrierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMcarrierDelFlg = cci("MCARRIER_DEL_FLG", "MCARRIER_DEL_FLG", null, null, String.class, "mcarrierDelFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositCustomerId = cci("DEPOSIT_CUSTOMER_ID", "DEPOSIT_CUSTOMER_ID", null, null, Long.class, "depositCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositCustomerCd = cci("DEPOSIT_CUSTOMER_CD", "DEPOSIT_CUSTOMER_CD", null, null, String.class, "depositCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositCustomerNm = cci("DEPOSIT_CUSTOMER_NM", "DEPOSIT_CUSTOMER_NM", null, null, String.class, "depositCustomerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositDepositFlg = cci("DEPOSIT_DEPOSIT_FLG", "DEPOSIT_DEPOSIT_FLG", null, null, String.class, "depositDepositFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMproductProductId = cci("MPRODUCT_PRODUCT_ID", "MPRODUCT_PRODUCT_ID", null, null, Long.class, "mproductProductId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMproductProductCd = cci("MPRODUCT_PRODUCT_CD", "MPRODUCT_PRODUCT_CD", null, null, String.class, "mproductProductCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMproductProductNm = cci("MPRODUCT_PRODUCT_NM", "MPRODUCT_PRODUCT_NM", null, null, String.class, "mproductProductNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMsDecimalExistFlg = cci("MS_DECIMAL_EXIST_FLG", "MS_DECIMAL_EXIST_FLG", null, null, String.class, "msDecimalExistFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMwWarehouseId = cci("MW_WAREHOUSE_ID", "MW_WAREHOUSE_ID", null, null, Long.class, "mwWarehouseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMwWarehouseCd = cci("MW_WAREHOUSE_CD", "MW_WAREHOUSE_CD", null, null, String.class, "mwWarehouseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMwWarehouseNm = cci("MW_WAREHOUSE_NM", "MW_WAREHOUSE_NM", null, null, String.class, "mwWarehouseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMlLocationId = cci("ML_LOCATION_ID", "ML_LOCATION_ID", null, null, Long.class, "mlLocationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMlLocationCd = cci("ML_LOCATION_CD", "ML_LOCATION_CD", null, null, String.class, "mlLocationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMlLocationNm = cci("ML_LOCATION_NM", "ML_LOCATION_NM", null, null, String.class, "mlLocationNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMzMwWarehouseId = cci("MZ_MW_WAREHOUSE_ID", "MZ_MW_WAREHOUSE_ID", null, null, Long.class, "mzMwWarehouseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMzMwWarehouseCd = cci("MZ_MW_WAREHOUSE_CD", "MZ_MW_WAREHOUSE_CD", null, null, String.class, "mzMwWarehouseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCustomerId = cci("CENTER_CUSTOMER_ID", "CENTER_CUSTOMER_ID", null, null, Long.class, "centerCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCourseIdByCustomer = cci("DELIV_COURSE_ID_BY_CUSTOMER", "DELIV_COURSE_ID_BY_CUSTOMER", null, null, Long.class, "delivCourseIdByCustomer", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCourseCdByCustomer = cci("DELIV_COURSE_CD_BY_CUSTOMER", "DELIV_COURSE_CD_BY_CUSTOMER", null, null, String.class, "delivCourseCdByCustomer", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);

    /**
     * SHIPPING_INST_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstHId() { return _columnShippingInstHId; }
    /**
     * SHIPPING_INST_B_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstBId() { return _columnShippingInstBId; }
    /**
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerId() { return _columnSupplyCustomerId; }
    /**
     * SUPPLY_CUSTOMER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerCd() { return _columnSupplyCustomerCd; }
    /**
     * SUPPLY_CUSTOMER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerNm() { return _columnSupplyCustomerNm; }
    /**
     * SUPPLY_DELIVERY_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyDeliveryFlg() { return _columnSupplyDeliveryFlg; }
    /**
     * DELIVERY_CUSTOMER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCustomerId() { return _columnDeliveryCustomerId; }
    /**
     * DELIVERY_CUSTOMER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCustomerCd() { return _columnDeliveryCustomerCd; }
    /**
     * DELIVERY_CUSTOMER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCustomerNm() { return _columnDeliveryCustomerNm; }
    /**
     * DELIVERY_ZIP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryZipCd() { return _columnDeliveryZipCd; }
    /**
     * DELIVERY_TEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryTelNo() { return _columnDeliveryTelNo; }
    /**
     * DELIVERY_ADDRESS1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryAddress1() { return _columnDeliveryAddress1; }
    /**
     * DELIVERY_ADDRESS2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryAddress2() { return _columnDeliveryAddress2; }
    /**
     * DELIVERY_ADDRESS3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryAddress3() { return _columnDeliveryAddress3; }
    /**
     * DELIVERY_DELIVERY_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryDeliveryFlg() { return _columnDeliveryDeliveryFlg; }
    /**
     * DELIVERY_ONETIME_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryOnetimeFlg() { return _columnDeliveryOnetimeFlg; }
    /**
     * CLIENT_CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCenterId() { return _columnClientCenterId; }
    /**
     * MCLIENT_CENTER_CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMclientCenterCenterId() { return _columnMclientCenterCenterId; }
    /**
     * MCLIENT_CENTER_CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMclientCenterClientId() { return _columnMclientCenterClientId; }
    /**
     * MCLIENT_CENTER_CUSTOMER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMclientCenterCustomerId() { return _columnMclientCenterCustomerId; }
    /**
     * MCENTER_CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMcenterCenterId() { return _columnMcenterCenterId; }
    /**
     * MCUSTOMER_CC_CUSTOMER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMcustomerCcCustomerId() { return _columnMcustomerCcCustomerId; }
    /**
     * MZIP_ZIP_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMzipZipId() { return _columnMzipZipId; }
    /**
     * DELIVERY_COURSE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseId() { return _columnDeliveryCourseId; }
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
     * MDELIV_COURSE_CARRIER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMdelivCourseCarrierId() { return _columnMdelivCourseCarrierId; }
    /**
     * MCARRIER_CARRIER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMcarrierCarrierCd() { return _columnMcarrierCarrierCd; }
    /**
     * MCARRIER_DEL_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMcarrierDelFlg() { return _columnMcarrierDelFlg; }
    /**
     * DEPOSIT_CUSTOMER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositCustomerId() { return _columnDepositCustomerId; }
    /**
     * DEPOSIT_CUSTOMER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositCustomerCd() { return _columnDepositCustomerCd; }
    /**
     * DEPOSIT_CUSTOMER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositCustomerNm() { return _columnDepositCustomerNm; }
    /**
     * DEPOSIT_DEPOSIT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositDepositFlg() { return _columnDepositDepositFlg; }
    /**
     * STOCK_TYPE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * STOCK_TYPE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * MPRODUCT_PRODUCT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMproductProductId() { return _columnMproductProductId; }
    /**
     * MPRODUCT_PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMproductProductCd() { return _columnMproductProductCd; }
    /**
     * MPRODUCT_PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMproductProductNm() { return _columnMproductProductNm; }
    /**
     * MS_DECIMAL_EXIST_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMsDecimalExistFlg() { return _columnMsDecimalExistFlg; }
    /**
     * MW_WAREHOUSE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMwWarehouseId() { return _columnMwWarehouseId; }
    /**
     * MW_WAREHOUSE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMwWarehouseCd() { return _columnMwWarehouseCd; }
    /**
     * MW_WAREHOUSE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMwWarehouseNm() { return _columnMwWarehouseNm; }
    /**
     * ML_LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMlLocationId() { return _columnMlLocationId; }
    /**
     * ML_LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMlLocationCd() { return _columnMlLocationCd; }
    /**
     * ML_LOCATION_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMlLocationNm() { return _columnMlLocationNm; }
    /**
     * MZ_MW_WAREHOUSE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMzMwWarehouseId() { return _columnMzMwWarehouseId; }
    /**
     * MZ_MW_WAREHOUSE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMzMwWarehouseCd() { return _columnMzMwWarehouseCd; }
    /**
     * CENTER_CUSTOMER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCustomerId() { return _columnCenterCustomerId; }
    /**
     * DELIV_COURSE_ID_BY_CUSTOMER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCourseIdByCustomer() { return _columnDelivCourseIdByCustomer; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * DELIV_COURSE_CD_BY_CUSTOMER: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCourseCdByCustomer() { return _columnDelivCourseCdByCustomer; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnShippingInstHId());
        ls.add(columnShippingInstBId());
        ls.add(columnSupplyCustomerId());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnSupplyDeliveryFlg());
        ls.add(columnDeliveryCustomerId());
        ls.add(columnDeliveryCustomerCd());
        ls.add(columnDeliveryCustomerNm());
        ls.add(columnDeliveryZipCd());
        ls.add(columnDeliveryTelNo());
        ls.add(columnDeliveryAddress1());
        ls.add(columnDeliveryAddress2());
        ls.add(columnDeliveryAddress3());
        ls.add(columnDeliveryDeliveryFlg());
        ls.add(columnDeliveryOnetimeFlg());
        ls.add(columnClientCenterId());
        ls.add(columnMclientCenterCenterId());
        ls.add(columnMclientCenterClientId());
        ls.add(columnMclientCenterCustomerId());
        ls.add(columnMcenterCenterId());
        ls.add(columnMcustomerCcCustomerId());
        ls.add(columnMzipZipId());
        ls.add(columnDeliveryCourseId());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDeliveryCourseNm());
        ls.add(columnMdelivCourseCarrierId());
        ls.add(columnMcarrierCarrierCd());
        ls.add(columnMcarrierDelFlg());
        ls.add(columnDepositCustomerId());
        ls.add(columnDepositCustomerCd());
        ls.add(columnDepositCustomerNm());
        ls.add(columnDepositDepositFlg());
        ls.add(columnStockTypeId());
        ls.add(columnStockTypeCd());
        ls.add(columnMproductProductId());
        ls.add(columnMproductProductCd());
        ls.add(columnMproductProductNm());
        ls.add(columnMsDecimalExistFlg());
        ls.add(columnMwWarehouseId());
        ls.add(columnMwWarehouseCd());
        ls.add(columnMwWarehouseNm());
        ls.add(columnMlLocationId());
        ls.add(columnMlLocationCd());
        ls.add(columnMlLocationNm());
        ls.add(columnMzMwWarehouseId());
        ls.add(columnMzMwWarehouseCd());
        ls.add(columnCenterCustomerId());
        ls.add(columnDelivCourseIdByCustomer());
        ls.add(columnCenterId());
        ls.add(columnDelivCourseCdByCustomer());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlShippingPlanBulkMasterData"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlShippingPlanBulkMasterData> getEntityType() { return SqlShippingPlanBulkMasterData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlShippingPlanBulkMasterData newEntity() { return new SqlShippingPlanBulkMasterData(); }
    public SqlShippingPlanBulkMasterData newMyEntity() { return new SqlShippingPlanBulkMasterData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlShippingPlanBulkMasterData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlShippingPlanBulkMasterData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

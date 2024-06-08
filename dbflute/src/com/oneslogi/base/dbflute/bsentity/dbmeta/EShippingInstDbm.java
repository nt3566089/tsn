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
 * The DB meta of E_SHIPPING_INST. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EShippingInstDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EShippingInstDbm _instance = new EShippingInstDbm();
    private EShippingInstDbm() {}
    public static EShippingInstDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EShippingInst)et).getShippingInstId(), (et, vl) -> ((EShippingInst)et).setShippingInstId(ctl(vl)), "shippingInstId");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getReceiveCd(), (et, vl) -> ((EShippingInst)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getReceiveRowId(), (et, vl) -> ((EShippingInst)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getImportFlg(), (et, vl) -> ((EShippingInst)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getErrorFlg(), (et, vl) -> ((EShippingInst)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getErrorMessageCd(), (et, vl) -> ((EShippingInst)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getClientCd(), (et, vl) -> ((EShippingInst)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getCenterCd(), (et, vl) -> ((EShippingInst)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getEmergencyFlg(), (et, vl) -> ((EShippingInst)et).setEmergencyFlg((String)vl), "emergencyFlg");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getClientShippingNo(), (et, vl) -> ((EShippingInst)et).setClientShippingNo((String)vl), "clientShippingNo");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSupplyCustomerCd(), (et, vl) -> ((EShippingInst)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSupplyCustomerNm(), (et, vl) -> ((EShippingInst)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getProcessTypeCd(), (et, vl) -> ((EShippingInst)et).setProcessTypeCd((String)vl), "processTypeCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDelivPlanDt(), (et, vl) -> ((EShippingInst)et).setDelivPlanDt((String)vl), "delivPlanDt");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getWorkDt(), (et, vl) -> ((EShippingInst)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getShippingDt(), (et, vl) -> ((EShippingInst)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDeliveryCourseCd(), (et, vl) -> ((EShippingInst)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDelivDt(), (et, vl) -> ((EShippingInst)et).setDelivDt((String)vl), "delivDt");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDelivTz(), (et, vl) -> ((EShippingInst)et).setDelivTz((String)vl), "delivTz");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDelivCustomerCd(), (et, vl) -> ((EShippingInst)et).setDelivCustomerCd((String)vl), "delivCustomerCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDelivCustomerNm(), (et, vl) -> ((EShippingInst)et).setDelivCustomerNm((String)vl), "delivCustomerNm");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDelivZipCd(), (et, vl) -> ((EShippingInst)et).setDelivZipCd((String)vl), "delivZipCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDelivAddress1(), (et, vl) -> ((EShippingInst)et).setDelivAddress1((String)vl), "delivAddress1");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDelivAddress2(), (et, vl) -> ((EShippingInst)et).setDelivAddress2((String)vl), "delivAddress2");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDelivAddress3(), (et, vl) -> ((EShippingInst)et).setDelivAddress3((String)vl), "delivAddress3");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDelivTelNo(), (et, vl) -> ((EShippingInst)et).setDelivTelNo((String)vl), "delivTelNo");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDelivAddressSupply(), (et, vl) -> ((EShippingInst)et).setDelivAddressSupply((String)vl), "delivAddressSupply");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getPickingWorkMessage(), (et, vl) -> ((EShippingInst)et).setPickingWorkMessage((String)vl), "pickingWorkMessage");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getProductCd(), (et, vl) -> ((EShippingInst)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getProductNm(), (et, vl) -> ((EShippingInst)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDepositCd(), (et, vl) -> ((EShippingInst)et).setDepositCd((String)vl), "depositCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getStockTypeCd(), (et, vl) -> ((EShippingInst)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getInstNum(), (et, vl) -> ((EShippingInst)et).setInstNum((String)vl), "instNum");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getLot(), (et, vl) -> ((EShippingInst)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getLimitDt(), (et, vl) -> ((EShippingInst)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getWarehouseCd(), (et, vl) -> ((EShippingInst)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getLocationCd(), (et, vl) -> ((EShippingInst)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getTotalPrice(), (et, vl) -> ((EShippingInst)et).setTotalPrice((String)vl), "totalPrice");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getTotalTax(), (et, vl) -> ((EShippingInst)et).setTotalTax((String)vl), "totalTax");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getUnitPrice(), (et, vl) -> ((EShippingInst)et).setUnitPrice((String)vl), "unitPrice");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getPrice(), (et, vl) -> ((EShippingInst)et).setPrice((String)vl), "price");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getTax(), (et, vl) -> ((EShippingInst)et).setTax((String)vl), "tax");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSpareStr1(), (et, vl) -> ((EShippingInst)et).setSpareStr1((String)vl), "spareStr1");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSpareStr2(), (et, vl) -> ((EShippingInst)et).setSpareStr2((String)vl), "spareStr2");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSpareStr3(), (et, vl) -> ((EShippingInst)et).setSpareStr3((String)vl), "spareStr3");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSpareNum1(), (et, vl) -> ((EShippingInst)et).setSpareNum1((String)vl), "spareNum1");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSpareNum2(), (et, vl) -> ((EShippingInst)et).setSpareNum2((String)vl), "spareNum2");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getSpareNum3(), (et, vl) -> ((EShippingInst)et).setSpareNum3((String)vl), "spareNum3");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getDelFlg(), (et, vl) -> ((EShippingInst)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getVersionNo(), (et, vl) -> ((EShippingInst)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getControlNo(), (et, vl) -> ((EShippingInst)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getAddDt(), (et, vl) -> ((EShippingInst)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getAddUser(), (et, vl) -> ((EShippingInst)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getAddProcess(), (et, vl) -> ((EShippingInst)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getUpdDt(), (et, vl) -> ((EShippingInst)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getUpdUser(), (et, vl) -> ((EShippingInst)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EShippingInst)et).getUpdProcess(), (et, vl) -> ((EShippingInst)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_SHIPPING_INST";
    protected final String _tableDispName = "E_SHIPPING_INST";
    protected final String _tablePropertyName = "EShippingInst";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_SHIPPING_INST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingInstId = cci("SHIPPING_INST_ID", "SHIPPING_INST_ID", null, null, Long.class, "shippingInstId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmergencyFlg = cci("EMERGENCY_FLG", "EMERGENCY_FLG", null, null, String.class, "emergencyFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientShippingNo = cci("CLIENT_SHIPPING_NO", "CLIENT_SHIPPING_NO", null, null, String.class, "clientShippingNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeCd = cci("PROCESS_TYPE_CD", "PROCESS_TYPE_CD", null, null, String.class, "processTypeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivPlanDt = cci("DELIV_PLAN_DT", "DELIV_PLAN_DT", null, null, String.class, "delivPlanDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivDt = cci("DELIV_DT", "DELIV_DT", null, null, String.class, "delivDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTz = cci("DELIV_TZ", "DELIV_TZ", null, null, String.class, "delivTz", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerCd = cci("DELIV_CUSTOMER_CD", "DELIV_CUSTOMER_CD", null, null, String.class, "delivCustomerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm = cci("DELIV_CUSTOMER_NM", "DELIV_CUSTOMER_NM", null, null, String.class, "delivCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivZipCd = cci("DELIV_ZIP_CD", "DELIV_ZIP_CD", null, null, String.class, "delivZipCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress1 = cci("DELIV_ADDRESS1", "DELIV_ADDRESS1", null, null, String.class, "delivAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress2 = cci("DELIV_ADDRESS2", "DELIV_ADDRESS2", null, null, String.class, "delivAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress3 = cci("DELIV_ADDRESS3", "DELIV_ADDRESS3", null, null, String.class, "delivAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTelNo = cci("DELIV_TEL_NO", "DELIV_TEL_NO", null, null, String.class, "delivTelNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddressSupply = cci("DELIV_ADDRESS_SUPPLY", "DELIV_ADDRESS_SUPPLY", null, null, String.class, "delivAddressSupply", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkMessage = cci("PICKING_WORK_MESSAGE", "PICKING_WORK_MESSAGE", null, null, String.class, "pickingWorkMessage", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositCd = cci("DEPOSIT_CD", "DEPOSIT_CD", null, null, String.class, "depositCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, String.class, "instNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalPrice = cci("TOTAL_PRICE", "TOTAL_PRICE", null, null, String.class, "totalPrice", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalTax = cci("TOTAL_TAX", "TOTAL_TAX", null, null, String.class, "totalTax", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitPrice = cci("UNIT_PRICE", "UNIT_PRICE", null, null, String.class, "unitPrice", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrice = cci("PRICE", "PRICE", null, null, String.class, "price", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTax = cci("TAX", "TAX", null, null, String.class, "tax", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr1 = cci("SPARE_STR_1", "SPARE_STR_1", null, null, String.class, "spareStr1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr2 = cci("SPARE_STR_2", "SPARE_STR_2", null, null, String.class, "spareStr2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr3 = cci("SPARE_STR_3", "SPARE_STR_3", null, null, String.class, "spareStr3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareNum1 = cci("SPARE_NUM_1", "SPARE_NUM_1", null, null, String.class, "spareNum1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareNum2 = cci("SPARE_NUM_2", "SPARE_NUM_2", null, null, String.class, "spareNum2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareNum3 = cci("SPARE_NUM_3", "SPARE_NUM_3", null, null, String.class, "spareNum3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * SHIPPING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstId() { return _columnShippingInstId; }
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
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, char(1), default=[0]}
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
     * EMERGENCY_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmergencyFlg() { return _columnEmergencyFlg; }
    /**
     * CLIENT_SHIPPING_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientShippingNo() { return _columnClientShippingNo; }
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
     * PROCESS_TYPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeCd() { return _columnProcessTypeCd; }
    /**
     * DELIV_PLAN_DT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivPlanDt() { return _columnDelivPlanDt; }
    /**
     * WORK_DT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * SHIPPING_DT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * DELIVERY_COURSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseCd() { return _columnDeliveryCourseCd; }
    /**
     * DELIV_DT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivDt() { return _columnDelivDt; }
    /**
     * DELIV_TZ: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTz() { return _columnDelivTz; }
    /**
     * DELIV_CUSTOMER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerCd() { return _columnDelivCustomerCd; }
    /**
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerNm() { return _columnDelivCustomerNm; }
    /**
     * DELIV_ZIP_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivZipCd() { return _columnDelivZipCd; }
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
     * DELIV_ADDRESS_SUPPLY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddressSupply() { return _columnDelivAddressSupply; }
    /**
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkMessage() { return _columnPickingWorkMessage; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * DEPOSIT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositCd() { return _columnDepositCd; }
    /**
     * STOCK_TYPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * INST_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstNum() { return _columnInstNum; }
    /**
     * LOT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * LIMIT_DT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * WAREHOUSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * LOCATION_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * TOTAL_PRICE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalPrice() { return _columnTotalPrice; }
    /**
     * TOTAL_TAX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalTax() { return _columnTotalTax; }
    /**
     * UNIT_PRICE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitPrice() { return _columnUnitPrice; }
    /**
     * PRICE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrice() { return _columnPrice; }
    /**
     * TAX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTax() { return _columnTax; }
    /**
     * SPARE_STR_1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr1() { return _columnSpareStr1; }
    /**
     * SPARE_STR_2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr2() { return _columnSpareStr2; }
    /**
     * SPARE_STR_3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr3() { return _columnSpareStr3; }
    /**
     * SPARE_NUM_1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareNum1() { return _columnSpareNum1; }
    /**
     * SPARE_NUM_2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareNum2() { return _columnSpareNum2; }
    /**
     * SPARE_NUM_3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareNum3() { return _columnSpareNum3; }
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
        ls.add(columnShippingInstId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnClientCd());
        ls.add(columnCenterCd());
        ls.add(columnEmergencyFlg());
        ls.add(columnClientShippingNo());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnProcessTypeCd());
        ls.add(columnDelivPlanDt());
        ls.add(columnWorkDt());
        ls.add(columnShippingDt());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDelivDt());
        ls.add(columnDelivTz());
        ls.add(columnDelivCustomerCd());
        ls.add(columnDelivCustomerNm());
        ls.add(columnDelivZipCd());
        ls.add(columnDelivAddress1());
        ls.add(columnDelivAddress2());
        ls.add(columnDelivAddress3());
        ls.add(columnDelivTelNo());
        ls.add(columnDelivAddressSupply());
        ls.add(columnPickingWorkMessage());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnDepositCd());
        ls.add(columnStockTypeCd());
        ls.add(columnInstNum());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnWarehouseCd());
        ls.add(columnLocationCd());
        ls.add(columnTotalPrice());
        ls.add(columnTotalTax());
        ls.add(columnUnitPrice());
        ls.add(columnPrice());
        ls.add(columnTax());
        ls.add(columnSpareStr1());
        ls.add(columnSpareStr2());
        ls.add(columnSpareStr3());
        ls.add(columnSpareNum1());
        ls.add(columnSpareNum2());
        ls.add(columnSpareNum3());
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
    protected UniqueInfo cpui() { return hpcpui(columnShippingInstId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EShippingInst"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EShippingInstCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EShippingInstBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EShippingInst> getEntityType() { return EShippingInst.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EShippingInst newEntity() { return new EShippingInst(); }
    public EShippingInst newMyEntity() { return new EShippingInst(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EShippingInst)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EShippingInst)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

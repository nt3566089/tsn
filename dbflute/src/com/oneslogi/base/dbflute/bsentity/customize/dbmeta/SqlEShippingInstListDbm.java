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
 * The DB meta of SqlEShippingInstList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlEShippingInstListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlEShippingInstListDbm _instance = new SqlEShippingInstListDbm();
    private SqlEShippingInstListDbm() {}
    public static SqlEShippingInstListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getShippingInstId(), (et, vl) -> ((SqlEShippingInstList)et).setShippingInstId(ctl(vl)), "shippingInstId");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getReceiveCd(), (et, vl) -> ((SqlEShippingInstList)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getReceiveRowId(), (et, vl) -> ((SqlEShippingInstList)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getImportFlg(), (et, vl) -> ((SqlEShippingInstList)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getErrorFlg(), (et, vl) -> ((SqlEShippingInstList)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getErrorMessageCd(), (et, vl) -> ((SqlEShippingInstList)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getClientCd(), (et, vl) -> ((SqlEShippingInstList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getCenterCd(), (et, vl) -> ((SqlEShippingInstList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getEmergencyFlg(), (et, vl) -> ((SqlEShippingInstList)et).setEmergencyFlg((String)vl), "emergencyFlg");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getClientShippingNo(), (et, vl) -> ((SqlEShippingInstList)et).setClientShippingNo((String)vl), "clientShippingNo");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getSupplyCustomerCd(), (et, vl) -> ((SqlEShippingInstList)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getProcessTypeCd(), (et, vl) -> ((SqlEShippingInstList)et).setProcessTypeCd((String)vl), "processTypeCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDelivPlanDt(), (et, vl) -> ((SqlEShippingInstList)et).setDelivPlanDt((String)vl), "delivPlanDt");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getWorkDt(), (et, vl) -> ((SqlEShippingInstList)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getShippingDt(), (et, vl) -> ((SqlEShippingInstList)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDeliveryCourseCd(), (et, vl) -> ((SqlEShippingInstList)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDelivDt(), (et, vl) -> ((SqlEShippingInstList)et).setDelivDt((String)vl), "delivDt");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDelivTz(), (et, vl) -> ((SqlEShippingInstList)et).setDelivTz((String)vl), "delivTz");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDelivCustomerCd(), (et, vl) -> ((SqlEShippingInstList)et).setDelivCustomerCd((String)vl), "delivCustomerCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDelivCustomerNm(), (et, vl) -> ((SqlEShippingInstList)et).setDelivCustomerNm((String)vl), "delivCustomerNm");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDelivZipCd(), (et, vl) -> ((SqlEShippingInstList)et).setDelivZipCd((String)vl), "delivZipCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDelivAddress1(), (et, vl) -> ((SqlEShippingInstList)et).setDelivAddress1((String)vl), "delivAddress1");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDelivAddress2(), (et, vl) -> ((SqlEShippingInstList)et).setDelivAddress2((String)vl), "delivAddress2");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDelivAddress3(), (et, vl) -> ((SqlEShippingInstList)et).setDelivAddress3((String)vl), "delivAddress3");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDelivTelNo(), (et, vl) -> ((SqlEShippingInstList)et).setDelivTelNo((String)vl), "delivTelNo");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDelivAddressSupply(), (et, vl) -> ((SqlEShippingInstList)et).setDelivAddressSupply((String)vl), "delivAddressSupply");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getPickingWorkMessage(), (et, vl) -> ((SqlEShippingInstList)et).setPickingWorkMessage((String)vl), "pickingWorkMessage");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getProductCd(), (et, vl) -> ((SqlEShippingInstList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getProductNm(), (et, vl) -> ((SqlEShippingInstList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDepositCd(), (et, vl) -> ((SqlEShippingInstList)et).setDepositCd((String)vl), "depositCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getStockTypeCd(), (et, vl) -> ((SqlEShippingInstList)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getInstNum(), (et, vl) -> ((SqlEShippingInstList)et).setInstNum((String)vl), "instNum");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getLot(), (et, vl) -> ((SqlEShippingInstList)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getLimitDt(), (et, vl) -> ((SqlEShippingInstList)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getWarehouseCd(), (et, vl) -> ((SqlEShippingInstList)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getLocationCd(), (et, vl) -> ((SqlEShippingInstList)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDelFlg(), (et, vl) -> ((SqlEShippingInstList)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getVersionNo(), (et, vl) -> ((SqlEShippingInstList)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getControlNo(), (et, vl) -> ((SqlEShippingInstList)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getAddDt(), (et, vl) -> ((SqlEShippingInstList)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getAddUser(), (et, vl) -> ((SqlEShippingInstList)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getAddProcess(), (et, vl) -> ((SqlEShippingInstList)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getUpdDt(), (et, vl) -> ((SqlEShippingInstList)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getUpdUser(), (et, vl) -> ((SqlEShippingInstList)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getUpdProcess(), (et, vl) -> ((SqlEShippingInstList)et).setUpdProcess((String)vl), "updProcess");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getClientId(), (et, vl) -> ((SqlEShippingInstList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getCenterId(), (et, vl) -> ((SqlEShippingInstList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getSupplyCustomerId(), (et, vl) -> ((SqlEShippingInstList)et).setSupplyCustomerId(ctl(vl)), "supplyCustomerId");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getSupplyCustomerNm(), (et, vl) -> ((SqlEShippingInstList)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getSupplyCustomerAbbr(), (et, vl) -> ((SqlEShippingInstList)et).setSupplyCustomerAbbr((String)vl), "supplyCustomerAbbr");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDeliveryCourseNm(), (et, vl) -> ((SqlEShippingInstList)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getProductId(), (et, vl) -> ((SqlEShippingInstList)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getMpProductNm(), (et, vl) -> ((SqlEShippingInstList)et).setMpProductNm((String)vl), "mpProductNm");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getProductAbbr(), (et, vl) -> ((SqlEShippingInstList)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getJanCd(), (et, vl) -> ((SqlEShippingInstList)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getLotManagFlg(), (et, vl) -> ((SqlEShippingInstList)et).setLotManagFlg((String)vl), "lotManagFlg");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getLimitDtManagFlg(), (et, vl) -> ((SqlEShippingInstList)et).setLimitDtManagFlg((String)vl), "limitDtManagFlg");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDelivCustomerId(), (et, vl) -> ((SqlEShippingInstList)et).setDelivCustomerId(ctl(vl)), "delivCustomerId");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getOneCustomerNm(), (et, vl) -> ((SqlEShippingInstList)et).setOneCustomerNm((String)vl), "oneCustomerNm");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getZipCd(), (et, vl) -> ((SqlEShippingInstList)et).setZipCd((String)vl), "zipCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getAddress1(), (et, vl) -> ((SqlEShippingInstList)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getAddress2(), (et, vl) -> ((SqlEShippingInstList)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getAddress3(), (et, vl) -> ((SqlEShippingInstList)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getTelNo(), (et, vl) -> ((SqlEShippingInstList)et).setTelNo((String)vl), "telNo");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getOnetimeFlg(), (et, vl) -> ((SqlEShippingInstList)et).setOnetimeFlg((String)vl), "onetimeFlg");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getMptProcessTypeId(), (et, vl) -> ((SqlEShippingInstList)et).setMptProcessTypeId(ctl(vl)), "mptProcessTypeId");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getProcessTypeNm(), (et, vl) -> ((SqlEShippingInstList)et).setProcessTypeNm((String)vl), "processTypeNm");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getStockTypeNm(), (et, vl) -> ((SqlEShippingInstList)et).setStockTypeNm((String)vl), "stockTypeNm");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getMstStockTypeId(), (et, vl) -> ((SqlEShippingInstList)et).setMstStockTypeId(ctl(vl)), "mstStockTypeId");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDepositNm(), (et, vl) -> ((SqlEShippingInstList)et).setDepositNm((String)vl), "depositNm");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDepositId(), (et, vl) -> ((SqlEShippingInstList)et).setDepositId(ctl(vl)), "depositId");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getWarehouseId(), (et, vl) -> ((SqlEShippingInstList)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getWarehouseNm(), (et, vl) -> ((SqlEShippingInstList)et).setWarehouseNm((String)vl), "warehouseNm");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getCclLocationId(), (et, vl) -> ((SqlEShippingInstList)et).setCclLocationId(ctl(vl)), "cclLocationId");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getCclLocationNm(), (et, vl) -> ((SqlEShippingInstList)et).setCclLocationNm((String)vl), "cclLocationNm");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getLctWarehouseCd(), (et, vl) -> ((SqlEShippingInstList)et).setLctWarehouseCd((String)vl), "lctWarehouseCd");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getMessageNm(), (et, vl) -> ((SqlEShippingInstList)et).setMessageNm((String)vl), "messageNm");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDeliveryCourseCd0(), (et, vl) -> ((SqlEShippingInstList)et).setDeliveryCourseCd0((String)vl), "deliveryCourseCd0");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getDeliveryCourseNm0(), (et, vl) -> ((SqlEShippingInstList)et).setDeliveryCourseNm0((String)vl), "deliveryCourseNm0");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getTotalPrice(), (et, vl) -> ((SqlEShippingInstList)et).setTotalPrice((String)vl), "totalPrice");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getTotalTax(), (et, vl) -> ((SqlEShippingInstList)et).setTotalTax((String)vl), "totalTax");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getUnitPrice(), (et, vl) -> ((SqlEShippingInstList)et).setUnitPrice((String)vl), "unitPrice");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getPrice(), (et, vl) -> ((SqlEShippingInstList)et).setPrice((String)vl), "price");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getTax(), (et, vl) -> ((SqlEShippingInstList)et).setTax((String)vl), "tax");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getSpareStr1(), (et, vl) -> ((SqlEShippingInstList)et).setSpareStr1((String)vl), "spareStr1");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getSpareStr2(), (et, vl) -> ((SqlEShippingInstList)et).setSpareStr2((String)vl), "spareStr2");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getSpareStr3(), (et, vl) -> ((SqlEShippingInstList)et).setSpareStr3((String)vl), "spareStr3");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getSpareNum1(), (et, vl) -> ((SqlEShippingInstList)et).setSpareNum1((String)vl), "spareNum1");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getSpareNum2(), (et, vl) -> ((SqlEShippingInstList)et).setSpareNum2((String)vl), "spareNum2");
        setupEpg(_epgMap, et -> ((SqlEShippingInstList)et).getSpareNum3(), (et, vl) -> ((SqlEShippingInstList)et).setSpareNum3((String)vl), "spareNum3");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlEShippingInstList";
    protected final String _tableDispName = "SqlEShippingInstList";
    protected final String _tablePropertyName = "sqlEShippingInstList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlEShippingInstList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingInstId = cci("SHIPPING_INST_ID", "SHIPPING_INST_ID", null, null, Long.class, "shippingInstId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmergencyFlg = cci("EMERGENCY_FLG", "EMERGENCY_FLG", null, null, String.class, "emergencyFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientShippingNo = cci("CLIENT_SHIPPING_NO", "CLIENT_SHIPPING_NO", null, null, String.class, "clientShippingNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, false, "char", 1, 0, null, null, true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerId = cci("SUPPLY_CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", null, null, Long.class, "supplyCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerAbbr = cci("SUPPLY_CUSTOMER_ABBR", "SUPPLY_CUSTOMER_ABBR", null, null, String.class, "supplyCustomerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMpProductNm = cci("MP_PRODUCT_NM", "MP_PRODUCT_NM", null, null, String.class, "mpProductNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotManagFlg = cci("LOT_MANAG_FLG", "LOT_MANAG_FLG", null, null, String.class, "lotManagFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.LotManagFlg, false);
    protected final ColumnInfo _columnLimitDtManagFlg = cci("LIMIT_DT_MANAG_FLG", "LIMIT_DT_MANAG_FLG", null, null, String.class, "limitDtManagFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.LimitDtManagFlg, false);
    protected final ColumnInfo _columnDelivCustomerId = cci("DELIV_CUSTOMER_ID", "DELIV_CUSTOMER_ID", null, null, Long.class, "delivCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOneCustomerNm = cci("ONE_CUSTOMER_NM", "ONE_CUSTOMER_NM", null, null, String.class, "oneCustomerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCd = cci("ZIP_CD", "ZIP_CD", null, null, String.class, "zipCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("ADDRESS1", "ADDRESS1", null, null, String.class, "address1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("ADDRESS2", "ADDRESS2", null, null, String.class, "address2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress3 = cci("ADDRESS3", "ADDRESS3", null, null, String.class, "address3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTelNo = cci("TEL_NO", "TEL_NO", null, null, String.class, "telNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOnetimeFlg = cci("ONETIME_FLG", "ONETIME_FLG", null, null, String.class, "onetimeFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.OnetimeFlg, false);
    protected final ColumnInfo _columnMptProcessTypeId = cci("MPT_PROCESS_TYPE_ID", "MPT_PROCESS_TYPE_ID", null, null, Long.class, "mptProcessTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeNm = cci("PROCESS_TYPE_NM", "PROCESS_TYPE_NM", null, null, String.class, "processTypeNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeNm = cci("STOCK_TYPE_NM", "STOCK_TYPE_NM", null, null, String.class, "stockTypeNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMstStockTypeId = cci("MST_STOCK_TYPE_ID", "MST_STOCK_TYPE_ID", null, null, Long.class, "mstStockTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositNm = cci("DEPOSIT_NM", "DEPOSIT_NM", null, null, String.class, "depositNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositId = cci("DEPOSIT_ID", "DEPOSIT_ID", null, null, Long.class, "depositId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseNm = cci("WAREHOUSE_NM", "WAREHOUSE_NM", null, null, String.class, "warehouseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCclLocationId = cci("CCL_LOCATION_ID", "CCL_LOCATION_ID", null, null, Long.class, "cclLocationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCclLocationNm = cci("CCL_LOCATION_NM", "CCL_LOCATION_NM", null, null, String.class, "cclLocationNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLctWarehouseCd = cci("LCT_WAREHOUSE_CD", "LCT_WAREHOUSE_CD", null, null, String.class, "lctWarehouseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageNm = cci("MESSAGE_NM", "MESSAGE_NM", null, null, String.class, "messageNm", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd0 = cci("DELIVERY_COURSE_CD_0", "DELIVERY_COURSE_CD_0", null, null, String.class, "deliveryCourseCd0", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm0 = cci("DELIVERY_COURSE_NM_0", "DELIVERY_COURSE_NM_0", null, null, String.class, "deliveryCourseNm0", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
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

    /**
     * SHIPPING_INST_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstId() { return _columnShippingInstId; }
    /**
     * RECEIVE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
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
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CENTER_CD: {varchar(30)}
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
     * DEL_FLG: {char(1), classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
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
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerId() { return _columnSupplyCustomerId; }
    /**
     * SUPPLY_CUSTOMER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerNm() { return _columnSupplyCustomerNm; }
    /**
     * SUPPLY_CUSTOMER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerAbbr() { return _columnSupplyCustomerAbbr; }
    /**
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseNm() { return _columnDeliveryCourseNm; }
    /**
     * PRODUCT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * MP_PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMpProductNm() { return _columnMpProductNm; }
    /**
     * PRODUCT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * JAN_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * LOT_MANAG_FLG: {char(1), classification=LotManagFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotManagFlg() { return _columnLotManagFlg; }
    /**
     * LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDtManagFlg() { return _columnLimitDtManagFlg; }
    /**
     * DELIV_CUSTOMER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerId() { return _columnDelivCustomerId; }
    /**
     * ONE_CUSTOMER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOneCustomerNm() { return _columnOneCustomerNm; }
    /**
     * ZIP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCd() { return _columnZipCd; }
    /**
     * ADDRESS1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress1() { return _columnAddress1; }
    /**
     * ADDRESS2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress2() { return _columnAddress2; }
    /**
     * ADDRESS3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress3() { return _columnAddress3; }
    /**
     * TEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTelNo() { return _columnTelNo; }
    /**
     * ONETIME_FLG: {char(1), classification=OnetimeFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOnetimeFlg() { return _columnOnetimeFlg; }
    /**
     * MPT_PROCESS_TYPE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMptProcessTypeId() { return _columnMptProcessTypeId; }
    /**
     * PROCESS_TYPE_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeNm() { return _columnProcessTypeNm; }
    /**
     * STOCK_TYPE_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeNm() { return _columnStockTypeNm; }
    /**
     * MST_STOCK_TYPE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMstStockTypeId() { return _columnMstStockTypeId; }
    /**
     * DEPOSIT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositNm() { return _columnDepositNm; }
    /**
     * DEPOSIT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositId() { return _columnDepositId; }
    /**
     * WAREHOUSE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseId() { return _columnWarehouseId; }
    /**
     * WAREHOUSE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseNm() { return _columnWarehouseNm; }
    /**
     * CCL_LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCclLocationId() { return _columnCclLocationId; }
    /**
     * CCL_LOCATION_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCclLocationNm() { return _columnCclLocationNm; }
    /**
     * LCT_WAREHOUSE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLctWarehouseCd() { return _columnLctWarehouseCd; }
    /**
     * MESSAGE_NM: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageNm() { return _columnMessageNm; }
    /**
     * DELIVERY_COURSE_CD_0: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseCd0() { return _columnDeliveryCourseCd0; }
    /**
     * DELIVERY_COURSE_NM_0: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseNm0() { return _columnDeliveryCourseNm0; }
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
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnSupplyCustomerId());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnSupplyCustomerAbbr());
        ls.add(columnDeliveryCourseNm());
        ls.add(columnProductId());
        ls.add(columnMpProductNm());
        ls.add(columnProductAbbr());
        ls.add(columnJanCd());
        ls.add(columnLotManagFlg());
        ls.add(columnLimitDtManagFlg());
        ls.add(columnDelivCustomerId());
        ls.add(columnOneCustomerNm());
        ls.add(columnZipCd());
        ls.add(columnAddress1());
        ls.add(columnAddress2());
        ls.add(columnAddress3());
        ls.add(columnTelNo());
        ls.add(columnOnetimeFlg());
        ls.add(columnMptProcessTypeId());
        ls.add(columnProcessTypeNm());
        ls.add(columnStockTypeNm());
        ls.add(columnMstStockTypeId());
        ls.add(columnDepositNm());
        ls.add(columnDepositId());
        ls.add(columnWarehouseId());
        ls.add(columnWarehouseNm());
        ls.add(columnCclLocationId());
        ls.add(columnCclLocationNm());
        ls.add(columnLctWarehouseCd());
        ls.add(columnMessageNm());
        ls.add(columnDeliveryCourseCd0());
        ls.add(columnDeliveryCourseNm0());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlEShippingInstList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlEShippingInstList> getEntityType() { return SqlEShippingInstList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlEShippingInstList newEntity() { return new SqlEShippingInstList(); }
    public SqlEShippingInstList newMyEntity() { return new SqlEShippingInstList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlEShippingInstList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlEShippingInstList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

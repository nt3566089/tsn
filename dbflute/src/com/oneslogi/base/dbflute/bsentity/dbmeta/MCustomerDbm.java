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
 * The DB meta of M_CUSTOMER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCustomerDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCustomerDbm _instance = new MCustomerDbm();
    private MCustomerDbm() {}
    public static MCustomerDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCustomer)et).getCustomerId(), (et, vl) -> ((MCustomer)et).setCustomerId(ctl(vl)), "customerId");
        setupEpg(_epgMap, et -> ((MCustomer)et).getClientId(), (et, vl) -> ((MCustomer)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((MCustomer)et).getCustomerCd(), (et, vl) -> ((MCustomer)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((MCustomer)et).getCustomerNm(), (et, vl) -> ((MCustomer)et).setCustomerNm((String)vl), "customerNm");
        setupEpg(_epgMap, et -> ((MCustomer)et).getCustomerAbbr(), (et, vl) -> ((MCustomer)et).setCustomerAbbr((String)vl), "customerAbbr");
        setupEpg(_epgMap, et -> ((MCustomer)et).getZipCd(), (et, vl) -> ((MCustomer)et).setZipCd((String)vl), "zipCd");
        setupEpg(_epgMap, et -> ((MCustomer)et).getTelNo(), (et, vl) -> ((MCustomer)et).setTelNo((String)vl), "telNo");
        setupEpg(_epgMap, et -> ((MCustomer)et).getAddress1(), (et, vl) -> ((MCustomer)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((MCustomer)et).getAddress2(), (et, vl) -> ((MCustomer)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((MCustomer)et).getAddress3(), (et, vl) -> ((MCustomer)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((MCustomer)et).getVendorFlg(), (et, vl) -> ((MCustomer)et).setVendorFlg((String)vl), "vendorFlg");
        setupEpg(_epgMap, et -> ((MCustomer)et).getDeliveryFlg(), (et, vl) -> ((MCustomer)et).setDeliveryFlg((String)vl), "deliveryFlg");
        setupEpg(_epgMap, et -> ((MCustomer)et).getOnetimeFlg(), (et, vl) -> ((MCustomer)et).setOnetimeFlg((String)vl), "onetimeFlg");
        setupEpg(_epgMap, et -> ((MCustomer)et).getDepositFlg(), (et, vl) -> ((MCustomer)et).setDepositFlg((String)vl), "depositFlg");
        setupEpg(_epgMap, et -> ((MCustomer)et).getAllocOrder(), (et, vl) -> ((MCustomer)et).setAllocOrder(ctl(vl)), "allocOrder");
        setupEpg(_epgMap, et -> ((MCustomer)et).getLotReverseFlg(), (et, vl) -> ((MCustomer)et).setLotReverseFlg((String)vl), "lotReverseFlg");
        setupEpg(_epgMap, et -> ((MCustomer)et).getLimitDtReverseFlg(), (et, vl) -> ((MCustomer)et).setLimitDtReverseFlg((String)vl), "limitDtReverseFlg");
        setupEpg(_epgMap, et -> ((MCustomer)et).getShippingStopFlg(), (et, vl) -> ((MCustomer)et).setShippingStopFlg((String)vl), "shippingStopFlg");
        setupEpg(_epgMap, et -> ((MCustomer)et).getDelivCustomerId(), (et, vl) -> ((MCustomer)et).setDelivCustomerId(ctl(vl)), "delivCustomerId");
        setupEpg(_epgMap, et -> ((MCustomer)et).getShowPriority(), (et, vl) -> ((MCustomer)et).setShowPriority(ctl(vl)), "showPriority");
        setupEpg(_epgMap, et -> ((MCustomer)et).getMarketType(), (et, vl) -> ((MCustomer)et).setMarketType((String)vl), "marketType");
        setupEpg(_epgMap, et -> ((MCustomer)et).getLogisticsCd(), (et, vl) -> ((MCustomer)et).setLogisticsCd((String)vl), "logisticsCd");
        setupEpg(_epgMap, et -> ((MCustomer)et).getFaxNo(), (et, vl) -> ((MCustomer)et).setFaxNo((String)vl), "faxNo");
        setupEpg(_epgMap, et -> ((MCustomer)et).getDeliveryTime(), (et, vl) -> ((MCustomer)et).setDeliveryTime((String)vl), "deliveryTime");
        setupEpg(_epgMap, et -> ((MCustomer)et).getComments(), (et, vl) -> ((MCustomer)et).setComments((String)vl), "comments");
        setupEpg(_epgMap, et -> ((MCustomer)et).getSpecialAgentsCd2(), (et, vl) -> ((MCustomer)et).setSpecialAgentsCd2((String)vl), "specialAgentsCd2");
        setupEpg(_epgMap, et -> ((MCustomer)et).getSpecialAgentsFlg(), (et, vl) -> ((MCustomer)et).setSpecialAgentsFlg((String)vl), "specialAgentsFlg");
        setupEpg(_epgMap, et -> ((MCustomer)et).getOthercolumn1(), (et, vl) -> ((MCustomer)et).setOthercolumn1((String)vl), "othercolumn1");
        setupEpg(_epgMap, et -> ((MCustomer)et).getName(), (et, vl) -> ((MCustomer)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((MCustomer)et).getAName(), (et, vl) -> ((MCustomer)et).setAName((String)vl), "AName");
        setupEpg(_epgMap, et -> ((MCustomer)et).getSsName(), (et, vl) -> ((MCustomer)et).setSsName((String)vl), "ssName");
        setupEpg(_epgMap, et -> ((MCustomer)et).getDelFlg(), (et, vl) -> ((MCustomer)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCustomer)et).getVersionNo(), (et, vl) -> ((MCustomer)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCustomer)et).getControlNo(), (et, vl) -> ((MCustomer)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCustomer)et).getAddDt(), (et, vl) -> ((MCustomer)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCustomer)et).getAddUser(), (et, vl) -> ((MCustomer)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCustomer)et).getAddProcess(), (et, vl) -> ((MCustomer)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCustomer)et).getUpdDt(), (et, vl) -> ((MCustomer)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCustomer)et).getUpdUser(), (et, vl) -> ((MCustomer)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCustomer)et).getUpdProcess(), (et, vl) -> ((MCustomer)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCustomer)et).getMClient(), (et, vl) -> ((MCustomer)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((MCustomer)et).getMCustomerSelf(), (et, vl) -> ((MCustomer)et).setMCustomerSelf((MCustomer)vl), "MCustomerSelf");
        setupEfpg(_efpgMap, et -> ((MCustomer)et).getMClientCenterByClientId(), (et, vl) -> ((MCustomer)et).setMClientCenterByClientId((MClientCenter)vl), "MClientCenterByClientId");
        setupEfpg(_efpgMap, et -> ((MCustomer)et).getBClassDtlByDelFlg(), (et, vl) -> ((MCustomer)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
        setupEfpg(_efpgMap, et -> ((MCustomer)et).getBClassDtlByDeliveryFlg(), (et, vl) -> ((MCustomer)et).setBClassDtlByDeliveryFlg((BClassDtl)vl), "BClassDtlByDeliveryFlg");
        setupEfpg(_efpgMap, et -> ((MCustomer)et).getBClassDtlByDepositFlg(), (et, vl) -> ((MCustomer)et).setBClassDtlByDepositFlg((BClassDtl)vl), "BClassDtlByDepositFlg");
        setupEfpg(_efpgMap, et -> ((MCustomer)et).getBClassDtlByLimitDtReverseFlg(), (et, vl) -> ((MCustomer)et).setBClassDtlByLimitDtReverseFlg((BClassDtl)vl), "BClassDtlByLimitDtReverseFlg");
        setupEfpg(_efpgMap, et -> ((MCustomer)et).getBClassDtlByLotReverseFlg(), (et, vl) -> ((MCustomer)et).setBClassDtlByLotReverseFlg((BClassDtl)vl), "BClassDtlByLotReverseFlg");
        setupEfpg(_efpgMap, et -> ((MCustomer)et).getBClassDtlByOnetimeFlg(), (et, vl) -> ((MCustomer)et).setBClassDtlByOnetimeFlg((BClassDtl)vl), "BClassDtlByOnetimeFlg");
        setupEfpg(_efpgMap, et -> ((MCustomer)et).getBClassDtlByShippingStopFlg(), (et, vl) -> ((MCustomer)et).setBClassDtlByShippingStopFlg((BClassDtl)vl), "BClassDtlByShippingStopFlg");
        setupEfpg(_efpgMap, et -> ((MCustomer)et).getBClassDtlByVendorFlg(), (et, vl) -> ((MCustomer)et).setBClassDtlByVendorFlg((BClassDtl)vl), "BClassDtlByVendorFlg");
        setupEfpg(_efpgMap, et -> ((MCustomer)et).getMCarrierSlipCesAsOne(), (et, vl) -> ((MCustomer)et).setMCarrierSlipCesAsOne((MCarrierSlipCes)vl), "MCarrierSlipCesAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CUSTOMER";
    protected final String _tableDispName = "M_CUSTOMER";
    protected final String _tablePropertyName = "MCustomer";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CUSTOMER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCustomerId = cci("CUSTOMER_ID", "CUSTOMER_ID", null, null, Long.class, "customerId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "MClientCenterByClientId,MCarrierSlipCesAsOne", "MCenterCustomerList,MClientList,MClientCenterList,MCustomerSelfList,MLocationList,MUserDepositList,TAllocInstBList,TAllocInstHByDelivCustomerIdList,TAllocInstHBySupplyCustomerIdList,TAllocLotList,TInventoryBByDepositIdList,TInventoryBBySupplierIdList,TInventoryInstList,TKeepingLotList,TLastLotList,TMoveInstBByDepositIdList,TMoveInstBBySupplierIdList,TReceivePlanHByPlanDepositIdList,TReceivePlanHByPlanSupplierIdList,TShippingInstBList,TShippingInstHByDelivCustomerIdList,TShippingInstHBySupplyCustomerIdList,TStockList,TStoreNoList,TStoreRecordHByDepositIdList,TStoreRecordHBySupplierIdList,WHtInventoryInputProdList,WHtReceiveNoPlanInspByDepositIdList,WHtReceiveNoPlanInspBySupplierIdList,WHtSerialReceiveInspList,WHtSerialShippingInspList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient,MClientCenterByClientId", null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerNm = cci("CUSTOMER_NM", "CUSTOMER_NM", null, null, String.class, "customerNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerAbbr = cci("CUSTOMER_ABBR", "CUSTOMER_ABBR", null, null, String.class, "customerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCd = cci("ZIP_CD", "ZIP_CD", null, null, String.class, "zipCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTelNo = cci("TEL_NO", "TEL_NO", null, null, String.class, "telNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("ADDRESS1", "ADDRESS1", null, null, String.class, "address1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("ADDRESS2", "ADDRESS2", null, null, String.class, "address2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress3 = cci("ADDRESS3", "ADDRESS3", null, null, String.class, "address3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVendorFlg = cci("VENDOR_FLG", "VENDOR_FLG", null, null, String.class, "vendorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByVendorFlg", null, CDef.DefMeta.VendorFlg, false);
    protected final ColumnInfo _columnDeliveryFlg = cci("DELIVERY_FLG", "DELIVERY_FLG", null, null, String.class, "deliveryFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByDeliveryFlg", null, CDef.DefMeta.DeliveryFlg, false);
    protected final ColumnInfo _columnOnetimeFlg = cci("ONETIME_FLG", "ONETIME_FLG", null, null, String.class, "onetimeFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByOnetimeFlg", null, CDef.DefMeta.OnetimeFlg, false);
    protected final ColumnInfo _columnDepositFlg = cci("DEPOSIT_FLG", "DEPOSIT_FLG", null, null, String.class, "depositFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByDepositFlg", null, CDef.DefMeta.DepositFlg, false);
    protected final ColumnInfo _columnAllocOrder = cci("ALLOC_ORDER", "ALLOC_ORDER", null, null, Long.class, "allocOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotReverseFlg = cci("LOT_REVERSE_FLG", "LOT_REVERSE_FLG", null, null, String.class, "lotReverseFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByLotReverseFlg", null, CDef.DefMeta.LotReverseFlg, false);
    protected final ColumnInfo _columnLimitDtReverseFlg = cci("LIMIT_DT_REVERSE_FLG", "LIMIT_DT_REVERSE_FLG", null, null, String.class, "limitDtReverseFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByLimitDtReverseFlg", null, CDef.DefMeta.LimitDtReverseFlg, false);
    protected final ColumnInfo _columnShippingStopFlg = cci("SHIPPING_STOP_FLG", "SHIPPING_STOP_FLG", null, null, String.class, "shippingStopFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByShippingStopFlg", null, CDef.DefMeta.ShippingStopFlg, false);
    protected final ColumnInfo _columnDelivCustomerId = cci("DELIV_CUSTOMER_ID", "DELIV_CUSTOMER_ID", null, null, Long.class, "delivCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomerSelf", null, null, false);
    protected final ColumnInfo _columnShowPriority = cci("SHOW_PRIORITY", "SHOW_PRIORITY", null, null, Long.class, "showPriority", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMarketType = cci("MARKET_TYPE", "MARKET_TYPE", null, null, String.class, "marketType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogisticsCd = cci("LOGISTICS_CD", "LOGISTICS_CD", null, null, String.class, "logisticsCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFaxNo = cci("FAX_NO", "FAX_NO", null, null, String.class, "faxNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryTime = cci("DELIVERY_TIME", "DELIVERY_TIME", null, null, String.class, "deliveryTime", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnComments = cci("COMMENTS", "COMMENTS", null, null, String.class, "comments", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpecialAgentsCd2 = cci("SPECIAL_AGENTS_CD2", "SPECIAL_AGENTS_CD2", null, null, String.class, "specialAgentsCd2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpecialAgentsFlg = cci("SPECIAL_AGENTS_FLG", "SPECIAL_AGENTS_FLG", null, null, String.class, "specialAgentsFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOthercolumn1 = cci("OtherColumn1", "OtherColumn1", null, null, String.class, "othercolumn1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("NAME", "NAME", null, null, String.class, "name", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAName = cci("A_NAME", "A_NAME", null, null, String.class, "AName", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSsName = cci("SS_NAME", "SS_NAME", null, null, String.class, "ssName", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, "BClassDtlByDelFlg", null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerId() { return _columnCustomerId; }
    /**
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CUSTOMER_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * CUSTOMER_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerNm() { return _columnCustomerNm; }
    /**
     * CUSTOMER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerAbbr() { return _columnCustomerAbbr; }
    /**
     * ZIP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCd() { return _columnZipCd; }
    /**
     * TEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTelNo() { return _columnTelNo; }
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
     * VENDOR_FLG: {char(1), FK to B_CLASS_DTL, classification=VendorFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorFlg() { return _columnVendorFlg; }
    /**
     * DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryFlg() { return _columnDeliveryFlg; }
    /**
     * ONETIME_FLG: {char(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOnetimeFlg() { return _columnOnetimeFlg; }
    /**
     * DEPOSIT_FLG: {char(1), FK to B_CLASS_DTL, classification=DepositFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositFlg() { return _columnDepositFlg; }
    /**
     * ALLOC_ORDER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocOrder() { return _columnAllocOrder; }
    /**
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotReverseFlg() { return _columnLotReverseFlg; }
    /**
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDtReverseFlg() { return _columnLimitDtReverseFlg; }
    /**
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStopFlg() { return _columnShippingStopFlg; }
    /**
     * DELIV_CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerId() { return _columnDelivCustomerId; }
    /**
     * SHOW_PRIORITY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShowPriority() { return _columnShowPriority; }
    /**
     * MARKET_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMarketType() { return _columnMarketType; }
    /**
     * LOGISTICS_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogisticsCd() { return _columnLogisticsCd; }
    /**
     * FAX_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFaxNo() { return _columnFaxNo; }
    /**
     * DELIVERY_TIME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryTime() { return _columnDeliveryTime; }
    /**
     * COMMENTS: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnComments() { return _columnComments; }
    /**
     * SPECIAL_AGENTS_CD2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpecialAgentsCd2() { return _columnSpecialAgentsCd2; }
    /**
     * SPECIAL_AGENTS_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpecialAgentsFlg() { return _columnSpecialAgentsFlg; }
    /**
     * OtherColumn1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOthercolumn1() { return _columnOthercolumn1; }
    /**
     * NAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * A_NAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAName() { return _columnAName; }
    /**
     * SS_NAME: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSsName() { return _columnSsName; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
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
        ls.add(columnCustomerId());
        ls.add(columnClientId());
        ls.add(columnCustomerCd());
        ls.add(columnCustomerNm());
        ls.add(columnCustomerAbbr());
        ls.add(columnZipCd());
        ls.add(columnTelNo());
        ls.add(columnAddress1());
        ls.add(columnAddress2());
        ls.add(columnAddress3());
        ls.add(columnVendorFlg());
        ls.add(columnDeliveryFlg());
        ls.add(columnOnetimeFlg());
        ls.add(columnDepositFlg());
        ls.add(columnAllocOrder());
        ls.add(columnLotReverseFlg());
        ls.add(columnLimitDtReverseFlg());
        ls.add(columnShippingStopFlg());
        ls.add(columnDelivCustomerId());
        ls.add(columnShowPriority());
        ls.add(columnMarketType());
        ls.add(columnLogisticsCd());
        ls.add(columnFaxNo());
        ls.add(columnDeliveryTime());
        ls.add(columnComments());
        ls.add(columnSpecialAgentsCd2());
        ls.add(columnSpecialAgentsFlg());
        ls.add(columnOthercolumn1());
        ls.add(columnName());
        ls.add(columnAName());
        ls.add(columnSsName());
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
    protected UniqueInfo cpui() { return hpcpui(columnCustomerId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnClientId());
        ls.add(columnCustomerCd());
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
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("M_CUSTOMER_FK2", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCustomerList", false);
    }
    /**
     * M_CUSTOMER by my DELIV_CUSTOMER_ID, named 'MCustomerSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelivCustomerId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("M_CUSTOMER_FK1", "MCustomerSelf", this, MCustomerDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MCustomerSelfList", false);
    }
    /**
     * M_CLIENT_CENTER by my CUSTOMER_ID, CLIENT_ID, named 'MClientCenterByClientId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClientCenterByClientId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnCustomerId(), MClientCenterDbm.getInstance().columnCustomerId());
        mp.put(columnClientId(), MClientCenterDbm.getInstance().columnClientId());
        return cfi("FK_M_CUSTOMER_TO_M_CLIENT_CENTER_BY_CLIENT_ID", "MClientCenterByClientId", this, MClientCenterDbm.getInstance(), mp, 2, null, false, false, false, true, null, null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CUSTOMER_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DELIVERY_FLG, named 'BClassDtlByDeliveryFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDeliveryFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDeliveryFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CUSTOMER_DELIVERY_FLG", "BClassDtlByDeliveryFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DELIVERY_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DEPOSIT_FLG, named 'BClassDtlByDepositFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDepositFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDepositFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CUSTOMER_DEPOSIT_FLG", "BClassDtlByDepositFlg", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEPOSIT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLimitDtReverseFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLimitDtReverseFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CUSTOMER_LIMIT_DT_REVERSE_FLG", "BClassDtlByLimitDtReverseFlg", this, BClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIMIT_DT_REVERSE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLotReverseFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotReverseFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CUSTOMER_LOT_REVERSE_FLG", "BClassDtlByLotReverseFlg", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LOT_REVERSE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my ONETIME_FLG, named 'BClassDtlByOnetimeFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByOnetimeFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOnetimeFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CUSTOMER_ONETIME_FLG", "BClassDtlByOnetimeFlg", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ONETIME_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByShippingStopFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingStopFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CUSTOMER_SHIPPING_STOP_FLG", "BClassDtlByShippingStopFlg", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SHIPPING_STOP_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my VENDOR_FLG, named 'BClassDtlByVendorFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByVendorFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVendorFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CUSTOMER_VENDOR_FLG", "BClassDtlByVendorFlg", this, BClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'VENDOR_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * M_CARRIER_SLIP_CES by CUSTOMER_ID, named 'MCarrierSlipCesAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMCarrierSlipCesAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MCarrierSlipCesDbm.getInstance().columnCustomerId());
        return cfi("M_CARRIER_SLIP_CES_FK1", "MCarrierSlipCesAsOne", this, MCarrierSlipCesDbm.getInstance(), mp, 11, null, true, false, true, false, null, null, false, "MCustomer", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_CENTER_CUSTOMER by CUSTOMER_ID, named 'MCenterCustomerList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterCustomerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MCenterCustomerDbm.getInstance().columnCustomerId());
        return cri("M_CENTER_CUSTOMER_FK3", "MCenterCustomerList", this, MCenterCustomerDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * M_CLIENT by CUSTOMER_ID, named 'MClientList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MClientDbm.getInstance().columnCustomerId());
        return cri("M_CLIENT_FK2", "MClientList", this, MClientDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * M_CLIENT_CENTER by CUSTOMER_ID, named 'MClientCenterList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientCenterList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MClientCenterDbm.getInstance().columnCustomerId());
        return cri("M_CLIENT_CENTER_FK3", "MClientCenterList", this, MClientCenterDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * M_CUSTOMER by DELIV_CUSTOMER_ID, named 'MCustomerSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCustomerSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MCustomerDbm.getInstance().columnDelivCustomerId());
        return cri("M_CUSTOMER_FK1", "MCustomerSelfList", this, MCustomerDbm.getInstance(), mp, false, "MCustomerSelf");
    }
    /**
     * M_LOCATION by REPLENISH_DEPOSIT_ID, named 'MLocationList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMLocationList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MLocationDbm.getInstance().columnReplenishDepositId());
        return cri("M_LOCATION_FK4", "MLocationList", this, MLocationDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * M_USER_DEPOSIT by CUSTOMER_ID, named 'MUserDepositList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMUserDepositList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MUserDepositDbm.getInstance().columnCustomerId());
        return cri("M_USER_DEPOSIT_FK2", "MUserDepositList", this, MUserDepositDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * T_ALLOC_INST_B by DEPOSIT_ID, named 'TAllocInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TAllocInstBDbm.getInstance().columnDepositId());
        return cri("T_ALLOC_INST_B_FK4", "TAllocInstBList", this, TAllocInstBDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * T_ALLOC_INST_H by DELIV_CUSTOMER_ID, named 'TAllocInstHByDelivCustomerIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstHByDelivCustomerIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TAllocInstHDbm.getInstance().columnDelivCustomerId());
        return cri("T_ALLOC_INST_H_FK1", "TAllocInstHByDelivCustomerIdList", this, TAllocInstHDbm.getInstance(), mp, false, "MCustomerByDelivCustomerId");
    }
    /**
     * T_ALLOC_INST_H by SUPPLY_CUSTOMER_ID, named 'TAllocInstHBySupplyCustomerIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstHBySupplyCustomerIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TAllocInstHDbm.getInstance().columnSupplyCustomerId());
        return cri("T_ALLOC_INST_H_FK4", "TAllocInstHBySupplyCustomerIdList", this, TAllocInstHDbm.getInstance(), mp, false, "MCustomerBySupplyCustomerId");
    }
    /**
     * T_ALLOC_LOT by CUSTOMER_ID, named 'TAllocLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TAllocLotDbm.getInstance().columnCustomerId());
        return cri("T_ALLOC_LOT_FK2", "TAllocLotList", this, TAllocLotDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * T_INVENTORY_B by DEPOSIT_ID, named 'TInventoryBByDepositIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBByDepositIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TInventoryBDbm.getInstance().columnDepositId());
        return cri("T_INVENTORY_B_FK12", "TInventoryBByDepositIdList", this, TInventoryBDbm.getInstance(), mp, false, "MCustomerByDepositId");
    }
    /**
     * T_INVENTORY_B by SUPPLIER_ID, named 'TInventoryBBySupplierIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBBySupplierIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TInventoryBDbm.getInstance().columnSupplierId());
        return cri("T_INVENTORY_B_FK8", "TInventoryBBySupplierIdList", this, TInventoryBDbm.getInstance(), mp, false, "MCustomerBySupplierId");
    }
    /**
     * T_INVENTORY_INST by DEPOSIT_ID, named 'TInventoryInstList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryInstList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TInventoryInstDbm.getInstance().columnDepositId());
        return cri("T_INVENTORY_INST_FK2", "TInventoryInstList", this, TInventoryInstDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * T_KEEPING_LOT by CUSTOMER_ID, named 'TKeepingLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTKeepingLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TKeepingLotDbm.getInstance().columnCustomerId());
        return cri("T_KEEPING_LOT_FK3", "TKeepingLotList", this, TKeepingLotDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * T_LAST_LOT by CUSTOMER_ID, named 'TLastLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTLastLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TLastLotDbm.getInstance().columnCustomerId());
        return cri("T_LAST_LOT_FK1", "TLastLotList", this, TLastLotDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * T_MOVE_INST_B by DEPOSIT_ID, named 'TMoveInstBByDepositIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstBByDepositIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TMoveInstBDbm.getInstance().columnDepositId());
        return cri("T_MOVE_INST_B_FK9", "TMoveInstBByDepositIdList", this, TMoveInstBDbm.getInstance(), mp, false, "MCustomerByDepositId");
    }
    /**
     * T_MOVE_INST_B by SUPPLIER_ID, named 'TMoveInstBBySupplierIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstBBySupplierIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TMoveInstBDbm.getInstance().columnSupplierId());
        return cri("T_MOVE_INST_B_FK4", "TMoveInstBBySupplierIdList", this, TMoveInstBDbm.getInstance(), mp, false, "MCustomerBySupplierId");
    }
    /**
     * T_RECEIVE_PLAN_H by PLAN_DEPOSIT_ID, named 'TReceivePlanHByPlanDepositIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanHByPlanDepositIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TReceivePlanHDbm.getInstance().columnPlanDepositId());
        return cri("T_RECEIVE_PLAN_H_FK3", "TReceivePlanHByPlanDepositIdList", this, TReceivePlanHDbm.getInstance(), mp, false, "MCustomerByPlanDepositId");
    }
    /**
     * T_RECEIVE_PLAN_H by PLAN_SUPPLIER_ID, named 'TReceivePlanHByPlanSupplierIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanHByPlanSupplierIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TReceivePlanHDbm.getInstance().columnPlanSupplierId());
        return cri("T_RECEIVE_PLAN_H_FK1", "TReceivePlanHByPlanSupplierIdList", this, TReceivePlanHDbm.getInstance(), mp, false, "MCustomerByPlanSupplierId");
    }
    /**
     * T_SHIPPING_INST_B by DEPOSIT_ID, named 'TShippingInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TShippingInstBDbm.getInstance().columnDepositId());
        return cri("T_SHIPPING_INST_B_FK5", "TShippingInstBList", this, TShippingInstBDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * T_SHIPPING_INST_H by DELIV_CUSTOMER_ID, named 'TShippingInstHByDelivCustomerIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstHByDelivCustomerIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TShippingInstHDbm.getInstance().columnDelivCustomerId());
        return cri("T_SHIPPING_INST_H_FK2", "TShippingInstHByDelivCustomerIdList", this, TShippingInstHDbm.getInstance(), mp, false, "MCustomerByDelivCustomerId");
    }
    /**
     * T_SHIPPING_INST_H by SUPPLY_CUSTOMER_ID, named 'TShippingInstHBySupplyCustomerIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstHBySupplyCustomerIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TShippingInstHDbm.getInstance().columnSupplyCustomerId());
        return cri("T_SHIPPING_INST_H_FK4", "TShippingInstHBySupplyCustomerIdList", this, TShippingInstHDbm.getInstance(), mp, false, "MCustomerBySupplyCustomerId");
    }
    /**
     * T_STOCK by DEPOSIT_ID, named 'TStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TStockDbm.getInstance().columnDepositId());
        return cri("T_STOCK_FK9", "TStockList", this, TStockDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * T_STORE_NO by SUPPLIER_ID, named 'TStoreNoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreNoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TStoreNoDbm.getInstance().columnSupplierId());
        return cri("T_STORE_NO_FK1", "TStoreNoList", this, TStoreNoDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * T_STORE_RECORD_H by DEPOSIT_ID, named 'TStoreRecordHByDepositIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreRecordHByDepositIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TStoreRecordHDbm.getInstance().columnDepositId());
        return cri("T_STORE_RECORD_H_FK6", "TStoreRecordHByDepositIdList", this, TStoreRecordHDbm.getInstance(), mp, false, "MCustomerByDepositId");
    }
    /**
     * T_STORE_RECORD_H by SUPPLIER_ID, named 'TStoreRecordHBySupplierIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreRecordHBySupplierIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), TStoreRecordHDbm.getInstance().columnSupplierId());
        return cri("T_STORE_RECORD_H_FK5", "TStoreRecordHBySupplierIdList", this, TStoreRecordHDbm.getInstance(), mp, false, "MCustomerBySupplierId");
    }
    /**
     * W_HT_INVENTORY_INPUT_PROD by CONSIGNMENT_CLS_ID, named 'WHtInventoryInputProdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtInventoryInputProdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), WHtInventoryInputProdDbm.getInstance().columnConsignmentClsId());
        return cri("W_HT_INVENTORY_INPUT_PROD_FK2", "WHtInventoryInputProdList", this, WHtInventoryInputProdDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * W_HT_RECEIVE_NO_PLAN_INSP by DEPOSIT_ID, named 'WHtReceiveNoPlanInspByDepositIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveNoPlanInspByDepositIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), WHtReceiveNoPlanInspDbm.getInstance().columnDepositId());
        return cri("W_HT_RECEIVE_NO_PLAN_INSP_FK10", "WHtReceiveNoPlanInspByDepositIdList", this, WHtReceiveNoPlanInspDbm.getInstance(), mp, false, "MCustomerByDepositId");
    }
    /**
     * W_HT_RECEIVE_NO_PLAN_INSP by SUPPLIER_ID, named 'WHtReceiveNoPlanInspBySupplierIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveNoPlanInspBySupplierIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), WHtReceiveNoPlanInspDbm.getInstance().columnSupplierId());
        return cri("W_HT_RECEIVE_NO_PLAN_INSP_FK8", "WHtReceiveNoPlanInspBySupplierIdList", this, WHtReceiveNoPlanInspDbm.getInstance(), mp, false, "MCustomerBySupplierId");
    }
    /**
     * W_HT_SERIAL_RECEIVE_INSP by CUSTOMER_ID, named 'WHtSerialReceiveInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtSerialReceiveInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), WHtSerialReceiveInspDbm.getInstance().columnCustomerId());
        return cri("W_HT_SERIAL_RECEIVE_INSP_FK2", "WHtSerialReceiveInspList", this, WHtSerialReceiveInspDbm.getInstance(), mp, false, "MCustomer");
    }
    /**
     * W_HT_SERIAL_SHIPPING_INSP by CUSTOMER_ID, named 'WHtSerialShippingInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtSerialShippingInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), WHtSerialShippingInspDbm.getInstance().columnCustomerId());
        return cri("W_HT_SERIAL_SHIPPING_INSP_FK2", "WHtSerialShippingInspList", this, WHtSerialShippingInspDbm.getInstance(), mp, false, "MCustomer");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCustomer"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCustomerCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCustomerBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCustomer> getEntityType() { return MCustomer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCustomer newEntity() { return new MCustomer(); }
    public MCustomer newMyEntity() { return new MCustomer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCustomer)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCustomer)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

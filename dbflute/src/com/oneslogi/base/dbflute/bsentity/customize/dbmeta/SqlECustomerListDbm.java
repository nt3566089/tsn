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
 * The DB meta of SqlECustomerList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlECustomerListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlECustomerListDbm _instance = new SqlECustomerListDbm();
    private SqlECustomerListDbm() {}
    public static SqlECustomerListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getCustomerId(), (et, vl) -> ((SqlECustomerList)et).setCustomerId(ctl(vl)), "customerId");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getReceiveCd(), (et, vl) -> ((SqlECustomerList)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getReceiveRowId(), (et, vl) -> ((SqlECustomerList)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getImportFlg(), (et, vl) -> ((SqlECustomerList)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getErrorFlg(), (et, vl) -> ((SqlECustomerList)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getErrorMessageCd(), (et, vl) -> ((SqlECustomerList)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getClientCd(), (et, vl) -> ((SqlECustomerList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getCustomerCd(), (et, vl) -> ((SqlECustomerList)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getCustomerNm(), (et, vl) -> ((SqlECustomerList)et).setCustomerNm((String)vl), "customerNm");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getCustomerAbbr(), (et, vl) -> ((SqlECustomerList)et).setCustomerAbbr((String)vl), "customerAbbr");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getVendorFlg(), (et, vl) -> ((SqlECustomerList)et).setVendorFlg((String)vl), "vendorFlg");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getDeliveryFlg(), (et, vl) -> ((SqlECustomerList)et).setDeliveryFlg((String)vl), "deliveryFlg");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getOnetimeFlg(), (et, vl) -> ((SqlECustomerList)et).setOnetimeFlg((String)vl), "onetimeFlg");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getDepositFlg(), (et, vl) -> ((SqlECustomerList)et).setDepositFlg((String)vl), "depositFlg");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getZipCd(), (et, vl) -> ((SqlECustomerList)et).setZipCd((String)vl), "zipCd");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getAddress1(), (et, vl) -> ((SqlECustomerList)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getAddress2(), (et, vl) -> ((SqlECustomerList)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getAddress3(), (et, vl) -> ((SqlECustomerList)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getTelNo(), (et, vl) -> ((SqlECustomerList)et).setTelNo((String)vl), "telNo");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getAllocOrder(), (et, vl) -> ((SqlECustomerList)et).setAllocOrder((String)vl), "allocOrder");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getShippingStopFlg(), (et, vl) -> ((SqlECustomerList)et).setShippingStopFlg((String)vl), "shippingStopFlg");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getLotReverseFlg(), (et, vl) -> ((SqlECustomerList)et).setLotReverseFlg((String)vl), "lotReverseFlg");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getLimitDtReverseFlg(), (et, vl) -> ((SqlECustomerList)et).setLimitDtReverseFlg((String)vl), "limitDtReverseFlg");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getCenterCd(), (et, vl) -> ((SqlECustomerList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getDeliveryCourseCd(), (et, vl) -> ((SqlECustomerList)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getDeliveryOrder(), (et, vl) -> ((SqlECustomerList)et).setDeliveryOrder((String)vl), "deliveryOrder");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getDeliveryReadtime(), (et, vl) -> ((SqlECustomerList)et).setDeliveryReadtime((String)vl), "deliveryReadtime");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getMessageNm(), (et, vl) -> ((SqlECustomerList)et).setMessageNm((String)vl), "messageNm");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getClientId(), (et, vl) -> ((SqlECustomerList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getClientNm(), (et, vl) -> ((SqlECustomerList)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getMzZipId(), (et, vl) -> ((SqlECustomerList)et).setMzZipId(ctl(vl)), "mzZipId");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getZipAddress1(), (et, vl) -> ((SqlECustomerList)et).setZipAddress1((String)vl), "zipAddress1");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getZipAddress2(), (et, vl) -> ((SqlECustomerList)et).setZipAddress2((String)vl), "zipAddress2");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getZipAddress3(), (et, vl) -> ((SqlECustomerList)et).setZipAddress3((String)vl), "zipAddress3");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getCenterId(), (et, vl) -> ((SqlECustomerList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getCenterNm(), (et, vl) -> ((SqlECustomerList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getDeliveryCourseNm(), (et, vl) -> ((SqlECustomerList)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getDeliveryCourseId(), (et, vl) -> ((SqlECustomerList)et).setDeliveryCourseId(ctl(vl)), "deliveryCourseId");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getMdcVersionNo(), (et, vl) -> ((SqlECustomerList)et).setMdcVersionNo(ctl(vl)), "mdcVersionNo");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getMcuCustomerId(), (et, vl) -> ((SqlECustomerList)et).setMcuCustomerId(ctl(vl)), "mcuCustomerId");
        setupEpg(_epgMap, et -> ((SqlECustomerList)et).getMcuVersionNo(), (et, vl) -> ((SqlECustomerList)et).setMcuVersionNo(ctl(vl)), "mcuVersionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlECustomerList";
    protected final String _tableDispName = "SqlECustomerList";
    protected final String _tablePropertyName = "sqlECustomerList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlECustomerList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCustomerId = cci("CUSTOMER_ID", "CUSTOMER_ID", null, null, Long.class, "customerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerNm = cci("CUSTOMER_NM", "CUSTOMER_NM", null, null, String.class, "customerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerAbbr = cci("CUSTOMER_ABBR", "CUSTOMER_ABBR", null, null, String.class, "customerAbbr", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVendorFlg = cci("VENDOR_FLG", "VENDOR_FLG", null, null, String.class, "vendorFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryFlg = cci("DELIVERY_FLG", "DELIVERY_FLG", null, null, String.class, "deliveryFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOnetimeFlg = cci("ONETIME_FLG", "ONETIME_FLG", null, null, String.class, "onetimeFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositFlg = cci("DEPOSIT_FLG", "DEPOSIT_FLG", null, null, String.class, "depositFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCd = cci("ZIP_CD", "ZIP_CD", null, null, String.class, "zipCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("ADDRESS1", "ADDRESS1", null, null, String.class, "address1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("ADDRESS2", "ADDRESS2", null, null, String.class, "address2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress3 = cci("ADDRESS3", "ADDRESS3", null, null, String.class, "address3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTelNo = cci("TEL_NO", "TEL_NO", null, null, String.class, "telNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocOrder = cci("ALLOC_ORDER", "ALLOC_ORDER", null, null, String.class, "allocOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStopFlg = cci("SHIPPING_STOP_FLG", "SHIPPING_STOP_FLG", null, null, String.class, "shippingStopFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotReverseFlg = cci("LOT_REVERSE_FLG", "LOT_REVERSE_FLG", null, null, String.class, "lotReverseFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDtReverseFlg = cci("LIMIT_DT_REVERSE_FLG", "LIMIT_DT_REVERSE_FLG", null, null, String.class, "limitDtReverseFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryOrder = cci("DELIVERY_ORDER", "DELIVERY_ORDER", null, null, String.class, "deliveryOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryReadtime = cci("DELIVERY_READTIME", "DELIVERY_READTIME", null, null, String.class, "deliveryReadtime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageNm = cci("MESSAGE_NM", "MESSAGE_NM", null, null, String.class, "messageNm", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMzZipId = cci("MZ_ZIP_ID", "MZ_ZIP_ID", null, null, Long.class, "mzZipId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipAddress1 = cci("ZIP_ADDRESS1", "ZIP_ADDRESS1", null, null, String.class, "zipAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipAddress2 = cci("ZIP_ADDRESS2", "ZIP_ADDRESS2", null, null, String.class, "zipAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipAddress3 = cci("ZIP_ADDRESS3", "ZIP_ADDRESS3", null, null, String.class, "zipAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseId = cci("DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", null, null, Long.class, "deliveryCourseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMdcVersionNo = cci("MDC_VERSION_NO", "MDC_VERSION_NO", null, null, Long.class, "mdcVersionNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMcuCustomerId = cci("MCU_CUSTOMER_ID", "MCU_CUSTOMER_ID", null, null, Long.class, "mcuCustomerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMcuVersionNo = cci("MCU_VERSION_NO", "MCU_VERSION_NO", null, null, Long.class, "mcuVersionNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * CUSTOMER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerId() { return _columnCustomerId; }
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
     * CLIENT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CUSTOMER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerNm() { return _columnCustomerNm; }
    /**
     * CUSTOMER_ABBR: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerAbbr() { return _columnCustomerAbbr; }
    /**
     * VENDOR_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorFlg() { return _columnVendorFlg; }
    /**
     * DELIVERY_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryFlg() { return _columnDeliveryFlg; }
    /**
     * ONETIME_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOnetimeFlg() { return _columnOnetimeFlg; }
    /**
     * DEPOSIT_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositFlg() { return _columnDepositFlg; }
    /**
     * ZIP_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCd() { return _columnZipCd; }
    /**
     * ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress1() { return _columnAddress1; }
    /**
     * ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress2() { return _columnAddress2; }
    /**
     * ADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress3() { return _columnAddress3; }
    /**
     * TEL_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTelNo() { return _columnTelNo; }
    /**
     * ALLOC_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocOrder() { return _columnAllocOrder; }
    /**
     * SHIPPING_STOP_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStopFlg() { return _columnShippingStopFlg; }
    /**
     * LOT_REVERSE_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotReverseFlg() { return _columnLotReverseFlg; }
    /**
     * LIMIT_DT_REVERSE_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDtReverseFlg() { return _columnLimitDtReverseFlg; }
    /**
     * CENTER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * DELIVERY_COURSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseCd() { return _columnDeliveryCourseCd; }
    /**
     * DELIVERY_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryOrder() { return _columnDeliveryOrder; }
    /**
     * DELIVERY_READTIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryReadtime() { return _columnDeliveryReadtime; }
    /**
     * MESSAGE_NM: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageNm() { return _columnMessageNm; }
    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * MZ_ZIP_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMzZipId() { return _columnMzZipId; }
    /**
     * ZIP_ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipAddress1() { return _columnZipAddress1; }
    /**
     * ZIP_ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipAddress2() { return _columnZipAddress2; }
    /**
     * ZIP_ADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipAddress3() { return _columnZipAddress3; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseNm() { return _columnDeliveryCourseNm; }
    /**
     * DELIVERY_COURSE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseId() { return _columnDeliveryCourseId; }
    /**
     * MDC_VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMdcVersionNo() { return _columnMdcVersionNo; }
    /**
     * MCU_CUSTOMER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMcuCustomerId() { return _columnMcuCustomerId; }
    /**
     * MCU_VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMcuVersionNo() { return _columnMcuVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCustomerId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnClientCd());
        ls.add(columnCustomerCd());
        ls.add(columnCustomerNm());
        ls.add(columnCustomerAbbr());
        ls.add(columnVendorFlg());
        ls.add(columnDeliveryFlg());
        ls.add(columnOnetimeFlg());
        ls.add(columnDepositFlg());
        ls.add(columnZipCd());
        ls.add(columnAddress1());
        ls.add(columnAddress2());
        ls.add(columnAddress3());
        ls.add(columnTelNo());
        ls.add(columnAllocOrder());
        ls.add(columnShippingStopFlg());
        ls.add(columnLotReverseFlg());
        ls.add(columnLimitDtReverseFlg());
        ls.add(columnCenterCd());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDeliveryOrder());
        ls.add(columnDeliveryReadtime());
        ls.add(columnMessageNm());
        ls.add(columnClientId());
        ls.add(columnClientNm());
        ls.add(columnMzZipId());
        ls.add(columnZipAddress1());
        ls.add(columnZipAddress2());
        ls.add(columnZipAddress3());
        ls.add(columnCenterId());
        ls.add(columnCenterNm());
        ls.add(columnDeliveryCourseNm());
        ls.add(columnDeliveryCourseId());
        ls.add(columnMdcVersionNo());
        ls.add(columnMcuCustomerId());
        ls.add(columnMcuVersionNo());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlECustomerList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlECustomerList> getEntityType() { return SqlECustomerList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlECustomerList newEntity() { return new SqlECustomerList(); }
    public SqlECustomerList newMyEntity() { return new SqlECustomerList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlECustomerList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlECustomerList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

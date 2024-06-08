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
 * The DB meta of SqlShipmentRequestHeader. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlShipmentRequestHeaderDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlShipmentRequestHeaderDbm _instance = new SqlShipmentRequestHeaderDbm();
    private SqlShipmentRequestHeaderDbm() {}
    public static SqlShipmentRequestHeaderDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getClientId(), (et, vl) -> ((SqlShipmentRequestHeader)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getClientCd(), (et, vl) -> ((SqlShipmentRequestHeader)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCenterId(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCenterCd(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getWarehouseId(), (et, vl) -> ((SqlShipmentRequestHeader)et).setWarehouseId((String)vl), "warehouseId");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCompId(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCompId(ctl(vl)), "compId");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCompCd(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCompCd((String)vl), "compCd");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getDeliveryCourseId(), (et, vl) -> ((SqlShipmentRequestHeader)et).setDeliveryCourseId(ctl(vl)), "deliveryCourseId");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getDeliveryCourseCd(), (et, vl) -> ((SqlShipmentRequestHeader)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getPickingWorkNo(), (et, vl) -> ((SqlShipmentRequestHeader)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getShippingSlipNo(), (et, vl) -> ((SqlShipmentRequestHeader)et).setShippingSlipNo((String)vl), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getClientShippingNo(), (et, vl) -> ((SqlShipmentRequestHeader)et).setClientShippingNo((String)vl), "clientShippingNo");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getDelivCumistomerCd(), (et, vl) -> ((SqlShipmentRequestHeader)et).setDelivCumistomerCd((String)vl), "delivCumistomerCd");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getDelivCustomerNm(), (et, vl) -> ((SqlShipmentRequestHeader)et).setDelivCustomerNm((String)vl), "delivCustomerNm");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getDelivAddressSupply(), (et, vl) -> ((SqlShipmentRequestHeader)et).setDelivAddressSupply((String)vl), "delivAddressSupply");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getDelivAddress1(), (et, vl) -> ((SqlShipmentRequestHeader)et).setDelivAddress1((String)vl), "delivAddress1");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getDelivAddress2(), (et, vl) -> ((SqlShipmentRequestHeader)et).setDelivAddress2((String)vl), "delivAddress2");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getDelivAddress3(), (et, vl) -> ((SqlShipmentRequestHeader)et).setDelivAddress3((String)vl), "delivAddress3");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getShpToCity(), (et, vl) -> ((SqlShipmentRequestHeader)et).setShpToCity((String)vl), "shpToCity");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getShpToState(), (et, vl) -> ((SqlShipmentRequestHeader)et).setShpToState((String)vl), "shpToState");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getDelivZipCd(), (et, vl) -> ((SqlShipmentRequestHeader)et).setDelivZipCd((String)vl), "delivZipCd");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getPublicCd(), (et, vl) -> ((SqlShipmentRequestHeader)et).setPublicCd((String)vl), "publicCd");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getDelivTelNo(), (et, vl) -> ((SqlShipmentRequestHeader)et).setDelivTelNo((String)vl), "delivTelNo");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getPaymentTerm(), (et, vl) -> ((SqlShipmentRequestHeader)et).setPaymentTerm((String)vl), "paymentTerm");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCollectAccountNoBillTo(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCollectAccountNoBillTo((String)vl), "collectAccountNoBillTo");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCollectZipCdBillTo(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCollectZipCdBillTo((String)vl), "collectZipCdBillTo");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCollectCountryCdBillTo(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCollectCountryCdBillTo((String)vl), "collectCountryCdBillTo");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getPaymentTermCdTaxesTo(), (et, vl) -> ((SqlShipmentRequestHeader)et).setPaymentTermCdTaxesTo((String)vl), "paymentTermCdTaxesTo");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCollectAccountNoTaxesTo(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCollectAccountNoTaxesTo((String)vl), "collectAccountNoTaxesTo");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCollectZipCdTaxesTo(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCollectZipCdTaxesTo((String)vl), "collectZipCdTaxesTo");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCollectCountryCdTaxesTo(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCollectCountryCdTaxesTo((String)vl), "collectCountryCdTaxesTo");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCodPaymentTermCd(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCodPaymentTermCd((String)vl), "codPaymentTermCd");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCodAmount(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCodAmount(ctb(vl)), "codAmount");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCodFeePayer(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCodFeePayer((String)vl), "codFeePayer");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getTermsOfSales(), (et, vl) -> ((SqlShipmentRequestHeader)et).setTermsOfSales((String)vl), "termsOfSales");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getBrokerName(), (et, vl) -> ((SqlShipmentRequestHeader)et).setBrokerName((String)vl), "brokerName");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getBrokerPhoneNo(), (et, vl) -> ((SqlShipmentRequestHeader)et).setBrokerPhoneNo((String)vl), "brokerPhoneNo");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getBrokerFaxNo(), (et, vl) -> ((SqlShipmentRequestHeader)et).setBrokerFaxNo((String)vl), "brokerFaxNo");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getSatDeliveryFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setSatDeliveryFlg((String)vl), "satDeliveryFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getResidentialDeliveryFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setResidentialDeliveryFlg((String)vl), "residentialDeliveryFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCodFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCodFlg((String)vl), "codFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getSignatureRequiredFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setSignatureRequiredFlg((String)vl), "signatureRequiredFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getSignatureReleaseFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setSignatureReleaseFlg((String)vl), "signatureReleaseFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getCallBeforeDeliveryFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setCallBeforeDeliveryFlg((String)vl), "callBeforeDeliveryFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getFreezableProtectionFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setFreezableProtectionFlg((String)vl), "freezableProtectionFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getGuaranteedPlusFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setGuaranteedPlusFlg((String)vl), "guaranteedPlusFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getResidentialPickupFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setResidentialPickupFlg((String)vl), "residentialPickupFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getDoNotStackStackFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setDoNotStackStackFlg((String)vl), "doNotStackStackFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getLimitedAccessDeliveryFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setLimitedAccessDeliveryFlg((String)vl), "limitedAccessDeliveryFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getLimitedAccessPickupFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setLimitedAccessPickupFlg((String)vl), "limitedAccessPickupFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getOverSizedFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setOverSizedFlg((String)vl), "overSizedFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getPoisonFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setPoisonFlg((String)vl), "poisonFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getFoogFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setFoogFlg((String)vl), "foogFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getLiftgateDeliveryPrepaidFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setLiftgateDeliveryPrepaidFlg((String)vl), "liftgateDeliveryPrepaidFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getLiftgateDeliveryCollectFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setLiftgateDeliveryCollectFlg((String)vl), "liftgateDeliveryCollectFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getLiftgatePickupPrepaidFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setLiftgatePickupPrepaidFlg((String)vl), "liftgatePickupPrepaidFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getLiftgatePickupCollectFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setLiftgatePickupCollectFlg((String)vl), "liftgatePickupCollectFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getInsideDeliveryPrepaidFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setInsideDeliveryPrepaidFlg((String)vl), "insideDeliveryPrepaidFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getInsideDeliveryCollectFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setInsideDeliveryCollectFlg((String)vl), "insideDeliveryCollectFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getInsidePickupPrepaidFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setInsidePickupPrepaidFlg((String)vl), "insidePickupPrepaidFlg");
        setupEpg(_epgMap, et -> ((SqlShipmentRequestHeader)et).getInsidePickupCollectFlg(), (et, vl) -> ((SqlShipmentRequestHeader)et).setInsidePickupCollectFlg((String)vl), "insidePickupCollectFlg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlShipmentRequestHeader";
    protected final String _tableDispName = "SqlShipmentRequestHeader";
    protected final String _tablePropertyName = "sqlShipmentRequestHeader";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlShipmentRequestHeader", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, String.class, "warehouseId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompId = cci("COMP_ID", "COMP_ID", null, null, Long.class, "compId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompCd = cci("COMP_CD", "COMP_CD", null, null, String.class, "compCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseId = cci("DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", null, null, Long.class, "deliveryCourseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipNo = cci("SHIPPING_SLIP_NO", "SHIPPING_SLIP_NO", null, null, String.class, "shippingSlipNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientShippingNo = cci("CLIENT_SHIPPING_NO", "CLIENT_SHIPPING_NO", null, null, String.class, "clientShippingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCumistomerCd = cci("DELIV_CUMISTOMER_CD", "DELIV_CUMISTOMER_CD", null, null, String.class, "delivCumistomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm = cci("DELIV_CUSTOMER_NM", "DELIV_CUSTOMER_NM", null, null, String.class, "delivCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddressSupply = cci("DELIV_ADDRESS_SUPPLY", "DELIV_ADDRESS_SUPPLY", null, null, String.class, "delivAddressSupply", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress1 = cci("DELIV_ADDRESS1", "DELIV_ADDRESS1", null, null, String.class, "delivAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress2 = cci("DELIV_ADDRESS2", "DELIV_ADDRESS2", null, null, String.class, "delivAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress3 = cci("DELIV_ADDRESS3", "DELIV_ADDRESS3", null, null, String.class, "delivAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShpToCity = cci("SHP_TO_CITY", "SHP_TO_CITY", null, null, String.class, "shpToCity", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShpToState = cci("SHP_TO_STATE", "SHP_TO_STATE", null, null, String.class, "shpToState", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivZipCd = cci("DELIV_ZIP_CD", "DELIV_ZIP_CD", null, null, String.class, "delivZipCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPublicCd = cci("PUBLIC_CD", "PUBLIC_CD", null, null, String.class, "publicCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTelNo = cci("DELIV_TEL_NO", "DELIV_TEL_NO", null, null, String.class, "delivTelNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentTerm = cci("PAYMENT_TERM", "PAYMENT_TERM", null, null, String.class, "paymentTerm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCollectAccountNoBillTo = cci("COLLECT_ACCOUNT_NO_BILL_TO", "COLLECT_ACCOUNT_NO_BILL_TO", null, null, String.class, "collectAccountNoBillTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCollectZipCdBillTo = cci("COLLECT_ZIP_CD_BILL_TO", "COLLECT_ZIP_CD_BILL_TO", null, null, String.class, "collectZipCdBillTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCollectCountryCdBillTo = cci("COLLECT_COUNTRY_CD_BILL_TO", "COLLECT_COUNTRY_CD_BILL_TO", null, null, String.class, "collectCountryCdBillTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentTermCdTaxesTo = cci("PAYMENT_TERM_CD_TAXES_TO", "PAYMENT_TERM_CD_TAXES_TO", null, null, String.class, "paymentTermCdTaxesTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCollectAccountNoTaxesTo = cci("COLLECT_ACCOUNT_NO_TAXES_TO", "COLLECT_ACCOUNT_NO_TAXES_TO", null, null, String.class, "collectAccountNoTaxesTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCollectZipCdTaxesTo = cci("COLLECT_ZIP_CD_TAXES_TO", "COLLECT_ZIP_CD_TAXES_TO", null, null, String.class, "collectZipCdTaxesTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCollectCountryCdTaxesTo = cci("COLLECT_COUNTRY_CD_TAXES_TO", "COLLECT_COUNTRY_CD_TAXES_TO", null, null, String.class, "collectCountryCdTaxesTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodPaymentTermCd = cci("COD_PAYMENT_TERM_CD", "COD_PAYMENT_TERM_CD", null, null, String.class, "codPaymentTermCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodAmount = cci("COD_AMOUNT", "COD_AMOUNT", null, null, java.math.BigDecimal.class, "codAmount", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodFeePayer = cci("COD_FEE_PAYER", "COD_FEE_PAYER", null, null, String.class, "codFeePayer", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTermsOfSales = cci("TERMS_OF_SALES", "TERMS_OF_SALES", null, null, String.class, "termsOfSales", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrokerName = cci("BROKER_NAME", "BROKER_NAME", null, null, String.class, "brokerName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrokerPhoneNo = cci("BROKER_PHONE_NO", "BROKER_PHONE_NO", null, null, String.class, "brokerPhoneNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrokerFaxNo = cci("BROKER_FAX_NO", "BROKER_FAX_NO", null, null, String.class, "brokerFaxNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSatDeliveryFlg = cci("SAT_DELIVERY_FLG", "SAT_DELIVERY_FLG", null, null, String.class, "satDeliveryFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnResidentialDeliveryFlg = cci("RESIDENTIAL_DELIVERY_FLG", "RESIDENTIAL_DELIVERY_FLG", null, null, String.class, "residentialDeliveryFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodFlg = cci("COD_FLG", "COD_FLG", null, null, String.class, "codFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSignatureRequiredFlg = cci("SIGNATURE_REQUIRED_FLG", "SIGNATURE_REQUIRED_FLG", null, null, String.class, "signatureRequiredFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSignatureReleaseFlg = cci("SIGNATURE_RELEASE_FLG", "SIGNATURE_RELEASE_FLG", null, null, String.class, "signatureReleaseFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCallBeforeDeliveryFlg = cci("CALL_BEFORE_DELIVERY_FLG", "CALL_BEFORE_DELIVERY_FLG", null, null, String.class, "callBeforeDeliveryFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFreezableProtectionFlg = cci("FREEZABLE_PROTECTION_FLG", "FREEZABLE_PROTECTION_FLG", null, null, String.class, "freezableProtectionFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGuaranteedPlusFlg = cci("GUARANTEED_PLUS_FLG", "GUARANTEED_PLUS_FLG", null, null, String.class, "guaranteedPlusFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnResidentialPickupFlg = cci("RESIDENTIAL_PICKUP_FLG", "RESIDENTIAL_PICKUP_FLG", null, null, String.class, "residentialPickupFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDoNotStackStackFlg = cci("DO_NOT_STACK_STACK_FLG", "DO_NOT_STACK_STACK_FLG", null, null, String.class, "doNotStackStackFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitedAccessDeliveryFlg = cci("LIMITED_ACCESS_DELIVERY_FLG", "LIMITED_ACCESS_DELIVERY_FLG", null, null, String.class, "limitedAccessDeliveryFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitedAccessPickupFlg = cci("LIMITED_ACCESS_PICKUP_FLG", "LIMITED_ACCESS_PICKUP_FLG", null, null, String.class, "limitedAccessPickupFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOverSizedFlg = cci("OVER_SIZED_FLG", "OVER_SIZED_FLG", null, null, String.class, "overSizedFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPoisonFlg = cci("POISON_FLG", "POISON_FLG", null, null, String.class, "poisonFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFoogFlg = cci("FOOG_FLG", "FOOG_FLG", null, null, String.class, "foogFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLiftgateDeliveryPrepaidFlg = cci("LIFTGATE_DELIVERY_PREPAID_FLG", "LIFTGATE_DELIVERY_PREPAID_FLG", null, null, String.class, "liftgateDeliveryPrepaidFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLiftgateDeliveryCollectFlg = cci("LIFTGATE_DELIVERY_COLLECT_FLG", "LIFTGATE_DELIVERY_COLLECT_FLG", null, null, String.class, "liftgateDeliveryCollectFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLiftgatePickupPrepaidFlg = cci("LIFTGATE_PICKUP_PREPAID_FLG", "LIFTGATE_PICKUP_PREPAID_FLG", null, null, String.class, "liftgatePickupPrepaidFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLiftgatePickupCollectFlg = cci("LIFTGATE_PICKUP_COLLECT_FLG", "LIFTGATE_PICKUP_COLLECT_FLG", null, null, String.class, "liftgatePickupCollectFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInsideDeliveryPrepaidFlg = cci("INSIDE_DELIVERY_PREPAID_FLG", "INSIDE_DELIVERY_PREPAID_FLG", null, null, String.class, "insideDeliveryPrepaidFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInsideDeliveryCollectFlg = cci("INSIDE_DELIVERY_COLLECT_FLG", "INSIDE_DELIVERY_COLLECT_FLG", null, null, String.class, "insideDeliveryCollectFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInsidePickupPrepaidFlg = cci("INSIDE_PICKUP_PREPAID_FLG", "INSIDE_PICKUP_PREPAID_FLG", null, null, String.class, "insidePickupPrepaidFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInsidePickupCollectFlg = cci("INSIDE_PICKUP_COLLECT_FLG", "INSIDE_PICKUP_COLLECT_FLG", null, null, String.class, "insidePickupCollectFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);

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
     * WAREHOUSE_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseId() { return _columnWarehouseId; }
    /**
     * COMP_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompId() { return _columnCompId; }
    /**
     * COMP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompCd() { return _columnCompCd; }
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
     * PICKING_WORK_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
    /**
     * SHIPPING_SLIP_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipNo() { return _columnShippingSlipNo; }
    /**
     * CLIENT_SHIPPING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientShippingNo() { return _columnClientShippingNo; }
    /**
     * DELIV_CUMISTOMER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCumistomerCd() { return _columnDelivCumistomerCd; }
    /**
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerNm() { return _columnDelivCustomerNm; }
    /**
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddressSupply() { return _columnDelivAddressSupply; }
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
     * SHP_TO_CITY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShpToCity() { return _columnShpToCity; }
    /**
     * SHP_TO_STATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShpToState() { return _columnShpToState; }
    /**
     * DELIV_ZIP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivZipCd() { return _columnDelivZipCd; }
    /**
     * PUBLIC_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPublicCd() { return _columnPublicCd; }
    /**
     * DELIV_TEL_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTelNo() { return _columnDelivTelNo; }
    /**
     * PAYMENT_TERM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentTerm() { return _columnPaymentTerm; }
    /**
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCollectAccountNoBillTo() { return _columnCollectAccountNoBillTo; }
    /**
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCollectZipCdBillTo() { return _columnCollectZipCdBillTo; }
    /**
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCollectCountryCdBillTo() { return _columnCollectCountryCdBillTo; }
    /**
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentTermCdTaxesTo() { return _columnPaymentTermCdTaxesTo; }
    /**
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCollectAccountNoTaxesTo() { return _columnCollectAccountNoTaxesTo; }
    /**
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCollectZipCdTaxesTo() { return _columnCollectZipCdTaxesTo; }
    /**
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCollectCountryCdTaxesTo() { return _columnCollectCountryCdTaxesTo; }
    /**
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodPaymentTermCd() { return _columnCodPaymentTermCd; }
    /**
     * COD_AMOUNT: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodAmount() { return _columnCodAmount; }
    /**
     * COD_FEE_PAYER: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodFeePayer() { return _columnCodFeePayer; }
    /**
     * TERMS_OF_SALES: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTermsOfSales() { return _columnTermsOfSales; }
    /**
     * BROKER_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrokerName() { return _columnBrokerName; }
    /**
     * BROKER_PHONE_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrokerPhoneNo() { return _columnBrokerPhoneNo; }
    /**
     * BROKER_FAX_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrokerFaxNo() { return _columnBrokerFaxNo; }
    /**
     * SAT_DELIVERY_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSatDeliveryFlg() { return _columnSatDeliveryFlg; }
    /**
     * RESIDENTIAL_DELIVERY_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnResidentialDeliveryFlg() { return _columnResidentialDeliveryFlg; }
    /**
     * COD_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodFlg() { return _columnCodFlg; }
    /**
     * SIGNATURE_REQUIRED_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSignatureRequiredFlg() { return _columnSignatureRequiredFlg; }
    /**
     * SIGNATURE_RELEASE_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSignatureReleaseFlg() { return _columnSignatureReleaseFlg; }
    /**
     * CALL_BEFORE_DELIVERY_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCallBeforeDeliveryFlg() { return _columnCallBeforeDeliveryFlg; }
    /**
     * FREEZABLE_PROTECTION_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFreezableProtectionFlg() { return _columnFreezableProtectionFlg; }
    /**
     * GUARANTEED_PLUS_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGuaranteedPlusFlg() { return _columnGuaranteedPlusFlg; }
    /**
     * RESIDENTIAL_PICKUP_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnResidentialPickupFlg() { return _columnResidentialPickupFlg; }
    /**
     * DO_NOT_STACK_STACK_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDoNotStackStackFlg() { return _columnDoNotStackStackFlg; }
    /**
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitedAccessDeliveryFlg() { return _columnLimitedAccessDeliveryFlg; }
    /**
     * LIMITED_ACCESS_PICKUP_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitedAccessPickupFlg() { return _columnLimitedAccessPickupFlg; }
    /**
     * OVER_SIZED_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOverSizedFlg() { return _columnOverSizedFlg; }
    /**
     * POISON_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPoisonFlg() { return _columnPoisonFlg; }
    /**
     * FOOG_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoogFlg() { return _columnFoogFlg; }
    /**
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLiftgateDeliveryPrepaidFlg() { return _columnLiftgateDeliveryPrepaidFlg; }
    /**
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLiftgateDeliveryCollectFlg() { return _columnLiftgateDeliveryCollectFlg; }
    /**
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLiftgatePickupPrepaidFlg() { return _columnLiftgatePickupPrepaidFlg; }
    /**
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLiftgatePickupCollectFlg() { return _columnLiftgatePickupCollectFlg; }
    /**
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInsideDeliveryPrepaidFlg() { return _columnInsideDeliveryPrepaidFlg; }
    /**
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInsideDeliveryCollectFlg() { return _columnInsideDeliveryCollectFlg; }
    /**
     * INSIDE_PICKUP_PREPAID_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInsidePickupPrepaidFlg() { return _columnInsidePickupPrepaidFlg; }
    /**
     * INSIDE_PICKUP_COLLECT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInsidePickupCollectFlg() { return _columnInsidePickupCollectFlg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnWarehouseId());
        ls.add(columnCompId());
        ls.add(columnCompCd());
        ls.add(columnDeliveryCourseId());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnPickingWorkNo());
        ls.add(columnShippingSlipNo());
        ls.add(columnClientShippingNo());
        ls.add(columnDelivCumistomerCd());
        ls.add(columnDelivCustomerNm());
        ls.add(columnDelivAddressSupply());
        ls.add(columnDelivAddress1());
        ls.add(columnDelivAddress2());
        ls.add(columnDelivAddress3());
        ls.add(columnShpToCity());
        ls.add(columnShpToState());
        ls.add(columnDelivZipCd());
        ls.add(columnPublicCd());
        ls.add(columnDelivTelNo());
        ls.add(columnPaymentTerm());
        ls.add(columnCollectAccountNoBillTo());
        ls.add(columnCollectZipCdBillTo());
        ls.add(columnCollectCountryCdBillTo());
        ls.add(columnPaymentTermCdTaxesTo());
        ls.add(columnCollectAccountNoTaxesTo());
        ls.add(columnCollectZipCdTaxesTo());
        ls.add(columnCollectCountryCdTaxesTo());
        ls.add(columnCodPaymentTermCd());
        ls.add(columnCodAmount());
        ls.add(columnCodFeePayer());
        ls.add(columnTermsOfSales());
        ls.add(columnBrokerName());
        ls.add(columnBrokerPhoneNo());
        ls.add(columnBrokerFaxNo());
        ls.add(columnSatDeliveryFlg());
        ls.add(columnResidentialDeliveryFlg());
        ls.add(columnCodFlg());
        ls.add(columnSignatureRequiredFlg());
        ls.add(columnSignatureReleaseFlg());
        ls.add(columnCallBeforeDeliveryFlg());
        ls.add(columnFreezableProtectionFlg());
        ls.add(columnGuaranteedPlusFlg());
        ls.add(columnResidentialPickupFlg());
        ls.add(columnDoNotStackStackFlg());
        ls.add(columnLimitedAccessDeliveryFlg());
        ls.add(columnLimitedAccessPickupFlg());
        ls.add(columnOverSizedFlg());
        ls.add(columnPoisonFlg());
        ls.add(columnFoogFlg());
        ls.add(columnLiftgateDeliveryPrepaidFlg());
        ls.add(columnLiftgateDeliveryCollectFlg());
        ls.add(columnLiftgatePickupPrepaidFlg());
        ls.add(columnLiftgatePickupCollectFlg());
        ls.add(columnInsideDeliveryPrepaidFlg());
        ls.add(columnInsideDeliveryCollectFlg());
        ls.add(columnInsidePickupPrepaidFlg());
        ls.add(columnInsidePickupCollectFlg());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlShipmentRequestHeader"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlShipmentRequestHeader> getEntityType() { return SqlShipmentRequestHeader.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlShipmentRequestHeader newEntity() { return new SqlShipmentRequestHeader(); }
    public SqlShipmentRequestHeader newMyEntity() { return new SqlShipmentRequestHeader(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlShipmentRequestHeader)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlShipmentRequestHeader)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

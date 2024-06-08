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
 * The DB meta of M_CARRIER_SLIP_CES. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipCesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCarrierSlipCesDbm _instance = new MCarrierSlipCesDbm();
    private MCarrierSlipCesDbm() {}
    public static MCarrierSlipCesDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getCustomerId(), (et, vl) -> ((MCarrierSlipCes)et).setCustomerId(ctl(vl)), "customerId");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getCollectAccountNoBillTo(), (et, vl) -> ((MCarrierSlipCes)et).setCollectAccountNoBillTo((String)vl), "collectAccountNoBillTo");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getCollectZipCdBillTo(), (et, vl) -> ((MCarrierSlipCes)et).setCollectZipCdBillTo((String)vl), "collectZipCdBillTo");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getCollectCountryCdBillTo(), (et, vl) -> ((MCarrierSlipCes)et).setCollectCountryCdBillTo((String)vl), "collectCountryCdBillTo");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getPaymentTermCdTaxesTo(), (et, vl) -> ((MCarrierSlipCes)et).setPaymentTermCdTaxesTo((String)vl), "paymentTermCdTaxesTo");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getCollectAccountNoTaxesTo(), (et, vl) -> ((MCarrierSlipCes)et).setCollectAccountNoTaxesTo((String)vl), "collectAccountNoTaxesTo");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getCollectZipCdTaxesTo(), (et, vl) -> ((MCarrierSlipCes)et).setCollectZipCdTaxesTo((String)vl), "collectZipCdTaxesTo");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getCollectCountryCdTaxesTo(), (et, vl) -> ((MCarrierSlipCes)et).setCollectCountryCdTaxesTo((String)vl), "collectCountryCdTaxesTo");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getCodPaymentTermCd(), (et, vl) -> ((MCarrierSlipCes)et).setCodPaymentTermCd((String)vl), "codPaymentTermCd");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getCodAmount(), (et, vl) -> ((MCarrierSlipCes)et).setCodAmount(ctb(vl)), "codAmount");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getCodFeePayer(), (et, vl) -> ((MCarrierSlipCes)et).setCodFeePayer((String)vl), "codFeePayer");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getTermsOfSales(), (et, vl) -> ((MCarrierSlipCes)et).setTermsOfSales((String)vl), "termsOfSales");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getBrokerName(), (et, vl) -> ((MCarrierSlipCes)et).setBrokerName((String)vl), "brokerName");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getBrokerPhoneNo(), (et, vl) -> ((MCarrierSlipCes)et).setBrokerPhoneNo((String)vl), "brokerPhoneNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getBrokerFaxNo(), (et, vl) -> ((MCarrierSlipCes)et).setBrokerFaxNo((String)vl), "brokerFaxNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getSatDeliveryFlg(), (et, vl) -> ((MCarrierSlipCes)et).setSatDeliveryFlg((String)vl), "satDeliveryFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getResidentialDeliveryFlg(), (et, vl) -> ((MCarrierSlipCes)et).setResidentialDeliveryFlg((String)vl), "residentialDeliveryFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getCodFlg(), (et, vl) -> ((MCarrierSlipCes)et).setCodFlg((String)vl), "codFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getSignatureRequiredFlg(), (et, vl) -> ((MCarrierSlipCes)et).setSignatureRequiredFlg((String)vl), "signatureRequiredFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getSignatureReleaseFlg(), (et, vl) -> ((MCarrierSlipCes)et).setSignatureReleaseFlg((String)vl), "signatureReleaseFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getCallBeforeDeliveryFlg(), (et, vl) -> ((MCarrierSlipCes)et).setCallBeforeDeliveryFlg((String)vl), "callBeforeDeliveryFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getFreezableProtectionFlg(), (et, vl) -> ((MCarrierSlipCes)et).setFreezableProtectionFlg((String)vl), "freezableProtectionFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getGuaranteedPlusFlg(), (et, vl) -> ((MCarrierSlipCes)et).setGuaranteedPlusFlg((String)vl), "guaranteedPlusFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getResidentialPickupFlg(), (et, vl) -> ((MCarrierSlipCes)et).setResidentialPickupFlg((String)vl), "residentialPickupFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getDoNotStackStackFlg(), (et, vl) -> ((MCarrierSlipCes)et).setDoNotStackStackFlg((String)vl), "doNotStackStackFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getLimitedAccessDeliveryFlg(), (et, vl) -> ((MCarrierSlipCes)et).setLimitedAccessDeliveryFlg((String)vl), "limitedAccessDeliveryFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getLimitedAccessPickupFlg(), (et, vl) -> ((MCarrierSlipCes)et).setLimitedAccessPickupFlg((String)vl), "limitedAccessPickupFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getOverSizedFlg(), (et, vl) -> ((MCarrierSlipCes)et).setOverSizedFlg((String)vl), "overSizedFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getPoisonFlg(), (et, vl) -> ((MCarrierSlipCes)et).setPoisonFlg((String)vl), "poisonFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getFoogFlg(), (et, vl) -> ((MCarrierSlipCes)et).setFoogFlg((String)vl), "foogFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getLiftgateDeliveryPrepaidFlg(), (et, vl) -> ((MCarrierSlipCes)et).setLiftgateDeliveryPrepaidFlg((String)vl), "liftgateDeliveryPrepaidFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getLiftgateDeliveryCollectFlg(), (et, vl) -> ((MCarrierSlipCes)et).setLiftgateDeliveryCollectFlg((String)vl), "liftgateDeliveryCollectFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getLiftgatePickupPrepaidFlg(), (et, vl) -> ((MCarrierSlipCes)et).setLiftgatePickupPrepaidFlg((String)vl), "liftgatePickupPrepaidFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getLiftgatePickupCollectFlg(), (et, vl) -> ((MCarrierSlipCes)et).setLiftgatePickupCollectFlg((String)vl), "liftgatePickupCollectFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getInsideDeliveryPrepaidFlg(), (et, vl) -> ((MCarrierSlipCes)et).setInsideDeliveryPrepaidFlg((String)vl), "insideDeliveryPrepaidFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getInsideDeliveryCollectFlg(), (et, vl) -> ((MCarrierSlipCes)et).setInsideDeliveryCollectFlg((String)vl), "insideDeliveryCollectFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getInsidePickupPrepaidFlg(), (et, vl) -> ((MCarrierSlipCes)et).setInsidePickupPrepaidFlg((String)vl), "insidePickupPrepaidFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getInsidePickupCollectFlg(), (et, vl) -> ((MCarrierSlipCes)et).setInsidePickupCollectFlg((String)vl), "insidePickupCollectFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getDelFlg(), (et, vl) -> ((MCarrierSlipCes)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getVersionNo(), (et, vl) -> ((MCarrierSlipCes)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getControlNo(), (et, vl) -> ((MCarrierSlipCes)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getAddDt(), (et, vl) -> ((MCarrierSlipCes)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getAddUser(), (et, vl) -> ((MCarrierSlipCes)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getAddProcess(), (et, vl) -> ((MCarrierSlipCes)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getUpdDt(), (et, vl) -> ((MCarrierSlipCes)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getUpdUser(), (et, vl) -> ((MCarrierSlipCes)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCarrierSlipCes)et).getUpdProcess(), (et, vl) -> ((MCarrierSlipCes)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getMCustomer(), (et, vl) -> ((MCarrierSlipCes)et).setMCustomer((MCustomer)vl), "MCustomer");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlBySatDeliveryFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlBySatDeliveryFlg((BClassDtl)vl), "BClassDtlBySatDeliveryFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByResidentialDeliveryFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByResidentialDeliveryFlg((BClassDtl)vl), "BClassDtlByResidentialDeliveryFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByCodFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByCodFlg((BClassDtl)vl), "BClassDtlByCodFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlBySignatureRequiredFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlBySignatureRequiredFlg((BClassDtl)vl), "BClassDtlBySignatureRequiredFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlBySignatureReleaseFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlBySignatureReleaseFlg((BClassDtl)vl), "BClassDtlBySignatureReleaseFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByCallBeforeDeliveryFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByCallBeforeDeliveryFlg((BClassDtl)vl), "BClassDtlByCallBeforeDeliveryFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByFreezableProtectionFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByFreezableProtectionFlg((BClassDtl)vl), "BClassDtlByFreezableProtectionFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByGuaranteedPlusFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByGuaranteedPlusFlg((BClassDtl)vl), "BClassDtlByGuaranteedPlusFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByResidentialPickupFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByResidentialPickupFlg((BClassDtl)vl), "BClassDtlByResidentialPickupFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByDoNotStackStackFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByDoNotStackStackFlg((BClassDtl)vl), "BClassDtlByDoNotStackStackFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByLimitedAccessDeliveryFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByLimitedAccessDeliveryFlg((BClassDtl)vl), "BClassDtlByLimitedAccessDeliveryFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByLimitedAccessPickupFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByLimitedAccessPickupFlg((BClassDtl)vl), "BClassDtlByLimitedAccessPickupFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByOverSizedFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByOverSizedFlg((BClassDtl)vl), "BClassDtlByOverSizedFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByPoisonFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByPoisonFlg((BClassDtl)vl), "BClassDtlByPoisonFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByFoogFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByFoogFlg((BClassDtl)vl), "BClassDtlByFoogFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByLiftgateDeliveryPrepaidFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByLiftgateDeliveryPrepaidFlg((BClassDtl)vl), "BClassDtlByLiftgateDeliveryPrepaidFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByLiftgateDeliveryCollectFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByLiftgateDeliveryCollectFlg((BClassDtl)vl), "BClassDtlByLiftgateDeliveryCollectFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByLiftgatePickupPrepaidFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByLiftgatePickupPrepaidFlg((BClassDtl)vl), "BClassDtlByLiftgatePickupPrepaidFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByLiftgatePickupCollectFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByLiftgatePickupCollectFlg((BClassDtl)vl), "BClassDtlByLiftgatePickupCollectFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByInsideDeliveryPrepaidFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByInsideDeliveryPrepaidFlg((BClassDtl)vl), "BClassDtlByInsideDeliveryPrepaidFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByInsideDeliveryCollectFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByInsideDeliveryCollectFlg((BClassDtl)vl), "BClassDtlByInsideDeliveryCollectFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByInsidePickupPrepaidFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByInsidePickupPrepaidFlg((BClassDtl)vl), "BClassDtlByInsidePickupPrepaidFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByInsidePickupCollectFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByInsidePickupCollectFlg((BClassDtl)vl), "BClassDtlByInsidePickupCollectFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipCes)et).getBClassDtlByDelFlg(), (et, vl) -> ((MCarrierSlipCes)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CARRIER_SLIP_CES";
    protected final String _tableDispName = "M_CARRIER_SLIP_CES";
    protected final String _tablePropertyName = "MCarrierSlipCes";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CARRIER_SLIP_CES", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCustomerId = cci("CUSTOMER_ID", "CUSTOMER_ID", null, null, Long.class, "customerId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "MCustomer", null, null, false);
    protected final ColumnInfo _columnCollectAccountNoBillTo = cci("COLLECT_ACCOUNT_NO_BILL_TO", "COLLECT_ACCOUNT_NO_BILL_TO", null, null, String.class, "collectAccountNoBillTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCollectZipCdBillTo = cci("COLLECT_ZIP_CD_BILL_TO", "COLLECT_ZIP_CD_BILL_TO", null, null, String.class, "collectZipCdBillTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCollectCountryCdBillTo = cci("COLLECT_COUNTRY_CD_BILL_TO", "COLLECT_COUNTRY_CD_BILL_TO", null, null, String.class, "collectCountryCdBillTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentTermCdTaxesTo = cci("PAYMENT_TERM_CD_TAXES_TO", "PAYMENT_TERM_CD_TAXES_TO", null, null, String.class, "paymentTermCdTaxesTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCollectAccountNoTaxesTo = cci("COLLECT_ACCOUNT_NO_TAXES_TO", "COLLECT_ACCOUNT_NO_TAXES_TO", null, null, String.class, "collectAccountNoTaxesTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCollectZipCdTaxesTo = cci("COLLECT_ZIP_CD_TAXES_TO", "COLLECT_ZIP_CD_TAXES_TO", null, null, String.class, "collectZipCdTaxesTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCollectCountryCdTaxesTo = cci("COLLECT_COUNTRY_CD_TAXES_TO", "COLLECT_COUNTRY_CD_TAXES_TO", null, null, String.class, "collectCountryCdTaxesTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodPaymentTermCd = cci("COD_PAYMENT_TERM_CD", "COD_PAYMENT_TERM_CD", null, null, String.class, "codPaymentTermCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodAmount = cci("COD_AMOUNT", "COD_AMOUNT", null, null, java.math.BigDecimal.class, "codAmount", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodFeePayer = cci("COD_FEE_PAYER", "COD_FEE_PAYER", null, null, String.class, "codFeePayer", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTermsOfSales = cci("TERMS_OF_SALES", "TERMS_OF_SALES", null, null, String.class, "termsOfSales", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrokerName = cci("BROKER_NAME", "BROKER_NAME", null, null, String.class, "brokerName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrokerPhoneNo = cci("BROKER_PHONE_NO", "BROKER_PHONE_NO", null, null, String.class, "brokerPhoneNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrokerFaxNo = cci("BROKER_FAX_NO", "BROKER_FAX_NO", null, null, String.class, "brokerFaxNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSatDeliveryFlg = cci("SAT_DELIVERY_FLG", "SAT_DELIVERY_FLG", null, null, String.class, "satDeliveryFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlBySatDeliveryFlg", null, CDef.DefMeta.SatDeliveryFlg, false);
    protected final ColumnInfo _columnResidentialDeliveryFlg = cci("RESIDENTIAL_DELIVERY_FLG", "RESIDENTIAL_DELIVERY_FLG", null, null, String.class, "residentialDeliveryFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByResidentialDeliveryFlg", null, CDef.DefMeta.ResidentialDeliveryFlg, false);
    protected final ColumnInfo _columnCodFlg = cci("COD_FLG", "COD_FLG", null, null, String.class, "codFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByCodFlg", null, CDef.DefMeta.CodFlg, false);
    protected final ColumnInfo _columnSignatureRequiredFlg = cci("SIGNATURE_REQUIRED_FLG", "SIGNATURE_REQUIRED_FLG", null, null, String.class, "signatureRequiredFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlBySignatureRequiredFlg", null, CDef.DefMeta.SignatureRequiredFlg, false);
    protected final ColumnInfo _columnSignatureReleaseFlg = cci("SIGNATURE_RELEASE_FLG", "SIGNATURE_RELEASE_FLG", null, null, String.class, "signatureReleaseFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlBySignatureReleaseFlg", null, CDef.DefMeta.SignatureReleaseFlg, false);
    protected final ColumnInfo _columnCallBeforeDeliveryFlg = cci("CALL_BEFORE_DELIVERY_FLG", "CALL_BEFORE_DELIVERY_FLG", null, null, String.class, "callBeforeDeliveryFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByCallBeforeDeliveryFlg", null, CDef.DefMeta.CallBeforeDeliveryFlg, false);
    protected final ColumnInfo _columnFreezableProtectionFlg = cci("FREEZABLE_PROTECTION_FLG", "FREEZABLE_PROTECTION_FLG", null, null, String.class, "freezableProtectionFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByFreezableProtectionFlg", null, CDef.DefMeta.FreezableProtectionFlg, false);
    protected final ColumnInfo _columnGuaranteedPlusFlg = cci("GUARANTEED_PLUS_FLG", "GUARANTEED_PLUS_FLG", null, null, String.class, "guaranteedPlusFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByGuaranteedPlusFlg", null, CDef.DefMeta.GuaranteedPlusFlg, false);
    protected final ColumnInfo _columnResidentialPickupFlg = cci("RESIDENTIAL_PICKUP_FLG", "RESIDENTIAL_PICKUP_FLG", null, null, String.class, "residentialPickupFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByResidentialPickupFlg", null, CDef.DefMeta.ResidentialPickupFlg, false);
    protected final ColumnInfo _columnDoNotStackStackFlg = cci("DO_NOT_STACK_STACK_FLG", "DO_NOT_STACK_STACK_FLG", null, null, String.class, "doNotStackStackFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByDoNotStackStackFlg", null, CDef.DefMeta.DoNotStackStackFlg, false);
    protected final ColumnInfo _columnLimitedAccessDeliveryFlg = cci("LIMITED_ACCESS_DELIVERY_FLG", "LIMITED_ACCESS_DELIVERY_FLG", null, null, String.class, "limitedAccessDeliveryFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByLimitedAccessDeliveryFlg", null, CDef.DefMeta.LimitedAccessDeliveryFlg, false);
    protected final ColumnInfo _columnLimitedAccessPickupFlg = cci("LIMITED_ACCESS_PICKUP_FLG", "LIMITED_ACCESS_PICKUP_FLG", null, null, String.class, "limitedAccessPickupFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByLimitedAccessPickupFlg", null, CDef.DefMeta.LimitedAccessPickupFlg, false);
    protected final ColumnInfo _columnOverSizedFlg = cci("OVER_SIZED_FLG", "OVER_SIZED_FLG", null, null, String.class, "overSizedFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByOverSizedFlg", null, CDef.DefMeta.OverSizedFlg, false);
    protected final ColumnInfo _columnPoisonFlg = cci("POISON_FLG", "POISON_FLG", null, null, String.class, "poisonFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByPoisonFlg", null, CDef.DefMeta.PoisonFlg, false);
    protected final ColumnInfo _columnFoogFlg = cci("FOOG_FLG", "FOOG_FLG", null, null, String.class, "foogFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByFoogFlg", null, CDef.DefMeta.FoogFlg, false);
    protected final ColumnInfo _columnLiftgateDeliveryPrepaidFlg = cci("LIFTGATE_DELIVERY_PREPAID_FLG", "LIFTGATE_DELIVERY_PREPAID_FLG", null, null, String.class, "liftgateDeliveryPrepaidFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByLiftgateDeliveryPrepaidFlg", null, CDef.DefMeta.LiftgateDeliveryPrepaidFlg, false);
    protected final ColumnInfo _columnLiftgateDeliveryCollectFlg = cci("LIFTGATE_DELIVERY_COLLECT_FLG", "LIFTGATE_DELIVERY_COLLECT_FLG", null, null, String.class, "liftgateDeliveryCollectFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByLiftgateDeliveryCollectFlg", null, CDef.DefMeta.LiftgateDeliveryCollectFlg, false);
    protected final ColumnInfo _columnLiftgatePickupPrepaidFlg = cci("LIFTGATE_PICKUP_PREPAID_FLG", "LIFTGATE_PICKUP_PREPAID_FLG", null, null, String.class, "liftgatePickupPrepaidFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByLiftgatePickupPrepaidFlg", null, CDef.DefMeta.LiftgatePickupPrepaidFlg, false);
    protected final ColumnInfo _columnLiftgatePickupCollectFlg = cci("LIFTGATE_PICKUP_COLLECT_FLG", "LIFTGATE_PICKUP_COLLECT_FLG", null, null, String.class, "liftgatePickupCollectFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByLiftgatePickupCollectFlg", null, CDef.DefMeta.LiftgatePickupCollectFlg, false);
    protected final ColumnInfo _columnInsideDeliveryPrepaidFlg = cci("INSIDE_DELIVERY_PREPAID_FLG", "INSIDE_DELIVERY_PREPAID_FLG", null, null, String.class, "insideDeliveryPrepaidFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByInsideDeliveryPrepaidFlg", null, CDef.DefMeta.InsideDeliveryPrepaidFlg, false);
    protected final ColumnInfo _columnInsideDeliveryCollectFlg = cci("INSIDE_DELIVERY_COLLECT_FLG", "INSIDE_DELIVERY_COLLECT_FLG", null, null, String.class, "insideDeliveryCollectFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByInsideDeliveryCollectFlg", null, CDef.DefMeta.InsideDeliveryCollectFlg, false);
    protected final ColumnInfo _columnInsidePickupPrepaidFlg = cci("INSIDE_PICKUP_PREPAID_FLG", "INSIDE_PICKUP_PREPAID_FLG", null, null, String.class, "insidePickupPrepaidFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByInsidePickupPrepaidFlg", null, CDef.DefMeta.InsidePickupPrepaidFlg, false);
    protected final ColumnInfo _columnInsidePickupCollectFlg = cci("INSIDE_PICKUP_COLLECT_FLG", "INSIDE_PICKUP_COLLECT_FLG", null, null, String.class, "insidePickupCollectFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByInsidePickupCollectFlg", null, CDef.DefMeta.InsidePickupCollectFlg, false);
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
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerId() { return _columnCustomerId; }
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
     * COD_AMOUNT: {decimal(16, 6)}
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
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSatDeliveryFlg() { return _columnSatDeliveryFlg; }
    /**
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnResidentialDeliveryFlg() { return _columnResidentialDeliveryFlg; }
    /**
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodFlg() { return _columnCodFlg; }
    /**
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSignatureRequiredFlg() { return _columnSignatureRequiredFlg; }
    /**
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSignatureReleaseFlg() { return _columnSignatureReleaseFlg; }
    /**
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCallBeforeDeliveryFlg() { return _columnCallBeforeDeliveryFlg; }
    /**
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFreezableProtectionFlg() { return _columnFreezableProtectionFlg; }
    /**
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGuaranteedPlusFlg() { return _columnGuaranteedPlusFlg; }
    /**
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnResidentialPickupFlg() { return _columnResidentialPickupFlg; }
    /**
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDoNotStackStackFlg() { return _columnDoNotStackStackFlg; }
    /**
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitedAccessDeliveryFlg() { return _columnLimitedAccessDeliveryFlg; }
    /**
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitedAccessPickupFlg() { return _columnLimitedAccessPickupFlg; }
    /**
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOverSizedFlg() { return _columnOverSizedFlg; }
    /**
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPoisonFlg() { return _columnPoisonFlg; }
    /**
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFoogFlg() { return _columnFoogFlg; }
    /**
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLiftgateDeliveryPrepaidFlg() { return _columnLiftgateDeliveryPrepaidFlg; }
    /**
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLiftgateDeliveryCollectFlg() { return _columnLiftgateDeliveryCollectFlg; }
    /**
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLiftgatePickupPrepaidFlg() { return _columnLiftgatePickupPrepaidFlg; }
    /**
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLiftgatePickupCollectFlg() { return _columnLiftgatePickupCollectFlg; }
    /**
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInsideDeliveryPrepaidFlg() { return _columnInsideDeliveryPrepaidFlg; }
    /**
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInsideDeliveryCollectFlg() { return _columnInsideDeliveryCollectFlg; }
    /**
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInsidePickupPrepaidFlg() { return _columnInsidePickupPrepaidFlg; }
    /**
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInsidePickupCollectFlg() { return _columnInsidePickupCollectFlg; }
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

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("M_CARRIER_SLIP_CES_FK1", "MCustomer", this, MCustomerDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "MCarrierSlipCesAsOne", false);
    }
    /**
     * B_CLASS_DTL by my SAT_DELIVERY_FLG, named 'BClassDtlBySatDeliveryFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySatDeliveryFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSatDeliveryFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_SAT_DELIVERY_FLG", "BClassDtlBySatDeliveryFlg", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SAT_DELIVERY_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my RESIDENTIAL_DELIVERY_FLG, named 'BClassDtlByResidentialDeliveryFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByResidentialDeliveryFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnResidentialDeliveryFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_RESIDENTIAL_DELIVERY_FLG", "BClassDtlByResidentialDeliveryFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'RESIDENTIAL_DELIVERY_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my COD_FLG, named 'BClassDtlByCodFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCodFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCodFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_COD_FLG", "BClassDtlByCodFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'COD_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SIGNATURE_REQUIRED_FLG, named 'BClassDtlBySignatureRequiredFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySignatureRequiredFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSignatureRequiredFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_SIGNATURE_REQUIRED_FLG", "BClassDtlBySignatureRequiredFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SIGNATURE_REQUIRED_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SIGNATURE_RELEASE_FLG, named 'BClassDtlBySignatureReleaseFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySignatureReleaseFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSignatureReleaseFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_SIGNATURE_RELEASE_FLG", "BClassDtlBySignatureReleaseFlg", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SIGNATURE_RELEASE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my CALL_BEFORE_DELIVERY_FLG, named 'BClassDtlByCallBeforeDeliveryFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCallBeforeDeliveryFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCallBeforeDeliveryFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_CALL_BEFORE_DELIVERY_FLG", "BClassDtlByCallBeforeDeliveryFlg", this, BClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'CALL_BEFORE_DELIVERY_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my FREEZABLE_PROTECTION_FLG, named 'BClassDtlByFreezableProtectionFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByFreezableProtectionFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFreezableProtectionFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_FREEZABLE_PROTECTION_FLG", "BClassDtlByFreezableProtectionFlg", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'FREEZABLE_PROTECTION_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my GUARANTEED_PLUS_FLG, named 'BClassDtlByGuaranteedPlusFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByGuaranteedPlusFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGuaranteedPlusFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_GUARANTEED_PLUS_FLG", "BClassDtlByGuaranteedPlusFlg", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'GUARANTEED_PLUS_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my RESIDENTIAL_PICKUP_FLG, named 'BClassDtlByResidentialPickupFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByResidentialPickupFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnResidentialPickupFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_RESIDENTIAL_PICKUP_FLG", "BClassDtlByResidentialPickupFlg", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'RESIDENTIAL_PICKUP_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DO_NOT_STACK_STACK_FLG, named 'BClassDtlByDoNotStackStackFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDoNotStackStackFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDoNotStackStackFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_DO_NOT_STACK_STACK_FLG", "BClassDtlByDoNotStackStackFlg", this, BClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DO_NOT_STACK_STACK_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LIMITED_ACCESS_DELIVERY_FLG, named 'BClassDtlByLimitedAccessDeliveryFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLimitedAccessDeliveryFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLimitedAccessDeliveryFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_LIMITED_ACCESS_DELIVERY_FLG", "BClassDtlByLimitedAccessDeliveryFlg", this, BClassDtlDbm.getInstance(), mp, 11, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIMITED_ACCESS_DELIVERY_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LIMITED_ACCESS_PICKUP_FLG, named 'BClassDtlByLimitedAccessPickupFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLimitedAccessPickupFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLimitedAccessPickupFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_LIMITED_ACCESS_PICKUP_FLG", "BClassDtlByLimitedAccessPickupFlg", this, BClassDtlDbm.getInstance(), mp, 12, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIMITED_ACCESS_PICKUP_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my OVER_SIZED_FLG, named 'BClassDtlByOverSizedFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByOverSizedFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOverSizedFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_OVER_SIZED_FLG", "BClassDtlByOverSizedFlg", this, BClassDtlDbm.getInstance(), mp, 13, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'OVER_SIZED_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my POISON_FLG, named 'BClassDtlByPoisonFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPoisonFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPoisonFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_POISON_FLG", "BClassDtlByPoisonFlg", this, BClassDtlDbm.getInstance(), mp, 14, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'POISON_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my FOOG_FLG, named 'BClassDtlByFoogFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByFoogFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFoogFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_FOOG_FLG", "BClassDtlByFoogFlg", this, BClassDtlDbm.getInstance(), mp, 15, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'FOOG_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LIFTGATE_DELIVERY_PREPAID_FLG, named 'BClassDtlByLiftgateDeliveryPrepaidFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLiftgateDeliveryPrepaidFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLiftgateDeliveryPrepaidFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_LIFTGATE_DELIVERY_PREPAID_FLG", "BClassDtlByLiftgateDeliveryPrepaidFlg", this, BClassDtlDbm.getInstance(), mp, 16, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIFTGATE_DELIVERY_PREPAID_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LIFTGATE_DELIVERY_COLLECT_FLG, named 'BClassDtlByLiftgateDeliveryCollectFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLiftgateDeliveryCollectFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLiftgateDeliveryCollectFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_LIFTGATE_DELIVERY_COLLECT_FLG", "BClassDtlByLiftgateDeliveryCollectFlg", this, BClassDtlDbm.getInstance(), mp, 17, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIFTGATE_DELIVERY_COLLECT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LIFTGATE_PICKUP_PREPAID_FLG, named 'BClassDtlByLiftgatePickupPrepaidFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLiftgatePickupPrepaidFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLiftgatePickupPrepaidFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_LIFTGATE_PICKUP_PREPAID_FLG", "BClassDtlByLiftgatePickupPrepaidFlg", this, BClassDtlDbm.getInstance(), mp, 18, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIFTGATE_PICKUP_PREPAID_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LIFTGATE_PICKUP_COLLECT_FLG, named 'BClassDtlByLiftgatePickupCollectFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLiftgatePickupCollectFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLiftgatePickupCollectFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_LIFTGATE_PICKUP_COLLECT_FLG", "BClassDtlByLiftgatePickupCollectFlg", this, BClassDtlDbm.getInstance(), mp, 19, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIFTGATE_PICKUP_COLLECT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my INSIDE_DELIVERY_PREPAID_FLG, named 'BClassDtlByInsideDeliveryPrepaidFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInsideDeliveryPrepaidFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInsideDeliveryPrepaidFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_INSIDE_DELIVERY_PREPAID_FLG", "BClassDtlByInsideDeliveryPrepaidFlg", this, BClassDtlDbm.getInstance(), mp, 20, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INSIDE_DELIVERY_PREPAID_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my INSIDE_DELIVERY_COLLECT_FLG, named 'BClassDtlByInsideDeliveryCollectFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInsideDeliveryCollectFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInsideDeliveryCollectFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_INSIDE_DELIVERY_COLLECT_FLG", "BClassDtlByInsideDeliveryCollectFlg", this, BClassDtlDbm.getInstance(), mp, 21, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INSIDE_DELIVERY_COLLECT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my INSIDE_PICKUP_PREPAID_FLG, named 'BClassDtlByInsidePickupPrepaidFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInsidePickupPrepaidFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInsidePickupPrepaidFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_INSIDE_PICKUP_PREPAID_FLG", "BClassDtlByInsidePickupPrepaidFlg", this, BClassDtlDbm.getInstance(), mp, 22, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INSIDE_PICKUP_PREPAID_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my INSIDE_PICKUP_COLLECT_FLG, named 'BClassDtlByInsidePickupCollectFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInsidePickupCollectFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInsidePickupCollectFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_INSIDE_PICKUP_COLLECT_FLG", "BClassDtlByInsidePickupCollectFlg", this, BClassDtlDbm.getInstance(), mp, 23, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INSIDE_PICKUP_COLLECT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_CES_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 24, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCarrierSlipCes"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCarrierSlipCesCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCarrierSlipCesBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCarrierSlipCes> getEntityType() { return MCarrierSlipCes.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCarrierSlipCes newEntity() { return new MCarrierSlipCes(); }
    public MCarrierSlipCes newMyEntity() { return new MCarrierSlipCes(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCarrierSlipCes)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCarrierSlipCes)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

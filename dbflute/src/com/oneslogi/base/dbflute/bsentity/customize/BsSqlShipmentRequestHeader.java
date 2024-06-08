package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlShipmentRequestHeader. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CENTER_ID, CENTER_CD, WAREHOUSE_ID, COMP_ID, COMP_CD, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, PICKING_WORK_NO, SHIPPING_SLIP_NO, CLIENT_SHIPPING_NO, DELIV_CUMISTOMER_CD, DELIV_CUSTOMER_NM, DELIV_ADDRESS_SUPPLY, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, SHP_TO_CITY, SHP_TO_STATE, DELIV_ZIP_CD, PUBLIC_CD, DELIV_TEL_NO, PAYMENT_TERM, COLLECT_ACCOUNT_NO_BILL_TO, COLLECT_ZIP_CD_BILL_TO, COLLECT_COUNTRY_CD_BILL_TO, PAYMENT_TERM_CD_TAXES_TO, COLLECT_ACCOUNT_NO_TAXES_TO, COLLECT_ZIP_CD_TAXES_TO, COLLECT_COUNTRY_CD_TAXES_TO, COD_PAYMENT_TERM_CD, COD_AMOUNT, COD_FEE_PAYER, TERMS_OF_SALES, BROKER_NAME, BROKER_PHONE_NO, BROKER_FAX_NO, SAT_DELIVERY_FLG, RESIDENTIAL_DELIVERY_FLG, COD_FLG, SIGNATURE_REQUIRED_FLG, SIGNATURE_RELEASE_FLG, CALL_BEFORE_DELIVERY_FLG, FREEZABLE_PROTECTION_FLG, GUARANTEED_PLUS_FLG, RESIDENTIAL_PICKUP_FLG, DO_NOT_STACK_STACK_FLG, LIMITED_ACCESS_DELIVERY_FLG, LIMITED_ACCESS_PICKUP_FLG, OVER_SIZED_FLG, POISON_FLG, FOOG_FLG, LIFTGATE_DELIVERY_PREPAID_FLG, LIFTGATE_DELIVERY_COLLECT_FLG, LIFTGATE_PICKUP_PREPAID_FLG, LIFTGATE_PICKUP_COLLECT_FLG, INSIDE_DELIVERY_PREPAID_FLG, INSIDE_DELIVERY_COLLECT_FLG, INSIDE_PICKUP_PREPAID_FLG, INSIDE_PICKUP_COLLECT_FLG
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String warehouseId = entity.getWarehouseId();
 * Long compId = entity.getCompId();
 * String compCd = entity.getCompCd();
 * Long deliveryCourseId = entity.getDeliveryCourseId();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String pickingWorkNo = entity.getPickingWorkNo();
 * String shippingSlipNo = entity.getShippingSlipNo();
 * String clientShippingNo = entity.getClientShippingNo();
 * String delivCumistomerCd = entity.getDelivCumistomerCd();
 * String delivCustomerNm = entity.getDelivCustomerNm();
 * String delivAddressSupply = entity.getDelivAddressSupply();
 * String delivAddress1 = entity.getDelivAddress1();
 * String delivAddress2 = entity.getDelivAddress2();
 * String delivAddress3 = entity.getDelivAddress3();
 * String shpToCity = entity.getShpToCity();
 * String shpToState = entity.getShpToState();
 * String delivZipCd = entity.getDelivZipCd();
 * String publicCd = entity.getPublicCd();
 * String delivTelNo = entity.getDelivTelNo();
 * String paymentTerm = entity.getPaymentTerm();
 * String collectAccountNoBillTo = entity.getCollectAccountNoBillTo();
 * String collectZipCdBillTo = entity.getCollectZipCdBillTo();
 * String collectCountryCdBillTo = entity.getCollectCountryCdBillTo();
 * String paymentTermCdTaxesTo = entity.getPaymentTermCdTaxesTo();
 * String collectAccountNoTaxesTo = entity.getCollectAccountNoTaxesTo();
 * String collectZipCdTaxesTo = entity.getCollectZipCdTaxesTo();
 * String collectCountryCdTaxesTo = entity.getCollectCountryCdTaxesTo();
 * String codPaymentTermCd = entity.getCodPaymentTermCd();
 * java.math.BigDecimal codAmount = entity.getCodAmount();
 * String codFeePayer = entity.getCodFeePayer();
 * String termsOfSales = entity.getTermsOfSales();
 * String brokerName = entity.getBrokerName();
 * String brokerPhoneNo = entity.getBrokerPhoneNo();
 * String brokerFaxNo = entity.getBrokerFaxNo();
 * String satDeliveryFlg = entity.getSatDeliveryFlg();
 * String residentialDeliveryFlg = entity.getResidentialDeliveryFlg();
 * String codFlg = entity.getCodFlg();
 * String signatureRequiredFlg = entity.getSignatureRequiredFlg();
 * String signatureReleaseFlg = entity.getSignatureReleaseFlg();
 * String callBeforeDeliveryFlg = entity.getCallBeforeDeliveryFlg();
 * String freezableProtectionFlg = entity.getFreezableProtectionFlg();
 * String guaranteedPlusFlg = entity.getGuaranteedPlusFlg();
 * String residentialPickupFlg = entity.getResidentialPickupFlg();
 * String doNotStackStackFlg = entity.getDoNotStackStackFlg();
 * String limitedAccessDeliveryFlg = entity.getLimitedAccessDeliveryFlg();
 * String limitedAccessPickupFlg = entity.getLimitedAccessPickupFlg();
 * String overSizedFlg = entity.getOverSizedFlg();
 * String poisonFlg = entity.getPoisonFlg();
 * String foogFlg = entity.getFoogFlg();
 * String liftgateDeliveryPrepaidFlg = entity.getLiftgateDeliveryPrepaidFlg();
 * String liftgateDeliveryCollectFlg = entity.getLiftgateDeliveryCollectFlg();
 * String liftgatePickupPrepaidFlg = entity.getLiftgatePickupPrepaidFlg();
 * String liftgatePickupCollectFlg = entity.getLiftgatePickupCollectFlg();
 * String insideDeliveryPrepaidFlg = entity.getInsideDeliveryPrepaidFlg();
 * String insideDeliveryCollectFlg = entity.getInsideDeliveryCollectFlg();
 * String insidePickupPrepaidFlg = entity.getInsidePickupPrepaidFlg();
 * String insidePickupCollectFlg = entity.getInsidePickupCollectFlg();
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setWarehouseId(warehouseId);
 * entity.setCompId(compId);
 * entity.setCompCd(compCd);
 * entity.setDeliveryCourseId(deliveryCourseId);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setPickingWorkNo(pickingWorkNo);
 * entity.setShippingSlipNo(shippingSlipNo);
 * entity.setClientShippingNo(clientShippingNo);
 * entity.setDelivCumistomerCd(delivCumistomerCd);
 * entity.setDelivCustomerNm(delivCustomerNm);
 * entity.setDelivAddressSupply(delivAddressSupply);
 * entity.setDelivAddress1(delivAddress1);
 * entity.setDelivAddress2(delivAddress2);
 * entity.setDelivAddress3(delivAddress3);
 * entity.setShpToCity(shpToCity);
 * entity.setShpToState(shpToState);
 * entity.setDelivZipCd(delivZipCd);
 * entity.setPublicCd(publicCd);
 * entity.setDelivTelNo(delivTelNo);
 * entity.setPaymentTerm(paymentTerm);
 * entity.setCollectAccountNoBillTo(collectAccountNoBillTo);
 * entity.setCollectZipCdBillTo(collectZipCdBillTo);
 * entity.setCollectCountryCdBillTo(collectCountryCdBillTo);
 * entity.setPaymentTermCdTaxesTo(paymentTermCdTaxesTo);
 * entity.setCollectAccountNoTaxesTo(collectAccountNoTaxesTo);
 * entity.setCollectZipCdTaxesTo(collectZipCdTaxesTo);
 * entity.setCollectCountryCdTaxesTo(collectCountryCdTaxesTo);
 * entity.setCodPaymentTermCd(codPaymentTermCd);
 * entity.setCodAmount(codAmount);
 * entity.setCodFeePayer(codFeePayer);
 * entity.setTermsOfSales(termsOfSales);
 * entity.setBrokerName(brokerName);
 * entity.setBrokerPhoneNo(brokerPhoneNo);
 * entity.setBrokerFaxNo(brokerFaxNo);
 * entity.setSatDeliveryFlg(satDeliveryFlg);
 * entity.setResidentialDeliveryFlg(residentialDeliveryFlg);
 * entity.setCodFlg(codFlg);
 * entity.setSignatureRequiredFlg(signatureRequiredFlg);
 * entity.setSignatureReleaseFlg(signatureReleaseFlg);
 * entity.setCallBeforeDeliveryFlg(callBeforeDeliveryFlg);
 * entity.setFreezableProtectionFlg(freezableProtectionFlg);
 * entity.setGuaranteedPlusFlg(guaranteedPlusFlg);
 * entity.setResidentialPickupFlg(residentialPickupFlg);
 * entity.setDoNotStackStackFlg(doNotStackStackFlg);
 * entity.setLimitedAccessDeliveryFlg(limitedAccessDeliveryFlg);
 * entity.setLimitedAccessPickupFlg(limitedAccessPickupFlg);
 * entity.setOverSizedFlg(overSizedFlg);
 * entity.setPoisonFlg(poisonFlg);
 * entity.setFoogFlg(foogFlg);
 * entity.setLiftgateDeliveryPrepaidFlg(liftgateDeliveryPrepaidFlg);
 * entity.setLiftgateDeliveryCollectFlg(liftgateDeliveryCollectFlg);
 * entity.setLiftgatePickupPrepaidFlg(liftgatePickupPrepaidFlg);
 * entity.setLiftgatePickupCollectFlg(liftgatePickupCollectFlg);
 * entity.setInsideDeliveryPrepaidFlg(insideDeliveryPrepaidFlg);
 * entity.setInsideDeliveryCollectFlg(insideDeliveryCollectFlg);
 * entity.setInsidePickupPrepaidFlg(insidePickupPrepaidFlg);
 * entity.setInsidePickupCollectFlg(insidePickupCollectFlg);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlShipmentRequestHeader extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** WAREHOUSE_ID: {varchar(30)} */
    protected String _warehouseId;

    /** COMP_ID: {bigint(19)} */
    protected Long _compId;

    /** COMP_CD: {varchar(30)} */
    protected String _compCd;

    /** DELIVERY_COURSE_ID: {bigint(19)} */
    protected Long _deliveryCourseId;

    /** DELIVERY_COURSE_CD: {varchar(30)} */
    protected String _deliveryCourseCd;

    /** PICKING_WORK_NO: {varchar(30)} */
    protected String _pickingWorkNo;

    /** SHIPPING_SLIP_NO: {varchar(30)} */
    protected String _shippingSlipNo;

    /** CLIENT_SHIPPING_NO: {varchar(30)} */
    protected String _clientShippingNo;

    /** DELIV_CUMISTOMER_CD: {varchar(30)} */
    protected String _delivCumistomerCd;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    protected String _delivCustomerNm;

    /** DELIV_ADDRESS_SUPPLY: {varchar(60)} */
    protected String _delivAddressSupply;

    /** DELIV_ADDRESS1: {varchar(255)} */
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {varchar(255)} */
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {varchar(255)} */
    protected String _delivAddress3;

    /** SHP_TO_CITY: {varchar(255)} */
    protected String _shpToCity;

    /** SHP_TO_STATE: {varchar(255)} */
    protected String _shpToState;

    /** DELIV_ZIP_CD: {varchar(30)} */
    protected String _delivZipCd;

    /** PUBLIC_CD: {varchar(30)} */
    protected String _publicCd;

    /** DELIV_TEL_NO: {varchar(255)} */
    protected String _delivTelNo;

    /** PAYMENT_TERM: {varchar(30)} */
    protected String _paymentTerm;

    /** COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)} */
    protected String _collectAccountNoBillTo;

    /** COLLECT_ZIP_CD_BILL_TO: {varchar(30)} */
    protected String _collectZipCdBillTo;

    /** COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)} */
    protected String _collectCountryCdBillTo;

    /** PAYMENT_TERM_CD_TAXES_TO: {varchar(30)} */
    protected String _paymentTermCdTaxesTo;

    /** COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)} */
    protected String _collectAccountNoTaxesTo;

    /** COLLECT_ZIP_CD_TAXES_TO: {varchar(30)} */
    protected String _collectZipCdTaxesTo;

    /** COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)} */
    protected String _collectCountryCdTaxesTo;

    /** COD_PAYMENT_TERM_CD: {varchar(30)} */
    protected String _codPaymentTermCd;

    /** COD_AMOUNT: {decimal(38, 6)} */
    protected java.math.BigDecimal _codAmount;

    /** COD_FEE_PAYER: {varchar(30)} */
    protected String _codFeePayer;

    /** TERMS_OF_SALES: {varchar(30)} */
    protected String _termsOfSales;

    /** BROKER_NAME: {varchar(255)} */
    protected String _brokerName;

    /** BROKER_PHONE_NO: {varchar(30)} */
    protected String _brokerPhoneNo;

    /** BROKER_FAX_NO: {varchar(30)} */
    protected String _brokerFaxNo;

    /** SAT_DELIVERY_FLG: {char(1)} */
    protected String _satDeliveryFlg;

    /** RESIDENTIAL_DELIVERY_FLG: {char(1)} */
    protected String _residentialDeliveryFlg;

    /** COD_FLG: {char(1)} */
    protected String _codFlg;

    /** SIGNATURE_REQUIRED_FLG: {char(1)} */
    protected String _signatureRequiredFlg;

    /** SIGNATURE_RELEASE_FLG: {char(1)} */
    protected String _signatureReleaseFlg;

    /** CALL_BEFORE_DELIVERY_FLG: {char(1)} */
    protected String _callBeforeDeliveryFlg;

    /** FREEZABLE_PROTECTION_FLG: {char(1)} */
    protected String _freezableProtectionFlg;

    /** GUARANTEED_PLUS_FLG: {char(1)} */
    protected String _guaranteedPlusFlg;

    /** RESIDENTIAL_PICKUP_FLG: {char(1)} */
    protected String _residentialPickupFlg;

    /** DO_NOT_STACK_STACK_FLG: {char(1)} */
    protected String _doNotStackStackFlg;

    /** LIMITED_ACCESS_DELIVERY_FLG: {char(1)} */
    protected String _limitedAccessDeliveryFlg;

    /** LIMITED_ACCESS_PICKUP_FLG: {char(1)} */
    protected String _limitedAccessPickupFlg;

    /** OVER_SIZED_FLG: {char(1)} */
    protected String _overSizedFlg;

    /** POISON_FLG: {char(1)} */
    protected String _poisonFlg;

    /** FOOG_FLG: {char(1)} */
    protected String _foogFlg;

    /** LIFTGATE_DELIVERY_PREPAID_FLG: {char(1)} */
    protected String _liftgateDeliveryPrepaidFlg;

    /** LIFTGATE_DELIVERY_COLLECT_FLG: {char(1)} */
    protected String _liftgateDeliveryCollectFlg;

    /** LIFTGATE_PICKUP_PREPAID_FLG: {char(1)} */
    protected String _liftgatePickupPrepaidFlg;

    /** LIFTGATE_PICKUP_COLLECT_FLG: {char(1)} */
    protected String _liftgatePickupCollectFlg;

    /** INSIDE_DELIVERY_PREPAID_FLG: {char(1)} */
    protected String _insideDeliveryPrepaidFlg;

    /** INSIDE_DELIVERY_COLLECT_FLG: {char(1)} */
    protected String _insideDeliveryCollectFlg;

    /** INSIDE_PICKUP_PREPAID_FLG: {char(1)} */
    protected String _insidePickupPrepaidFlg;

    /** INSIDE_PICKUP_COLLECT_FLG: {char(1)} */
    protected String _insidePickupCollectFlg;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlShipmentRequestHeaderDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlShipmentRequestHeader";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlShipmentRequestHeader) {
            BsSqlShipmentRequestHeader other = (BsSqlShipmentRequestHeader)obj;
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_warehouseId, other._warehouseId)) { return false; }
            if (!xSV(_compId, other._compId)) { return false; }
            if (!xSV(_compCd, other._compCd)) { return false; }
            if (!xSV(_deliveryCourseId, other._deliveryCourseId)) { return false; }
            if (!xSV(_deliveryCourseCd, other._deliveryCourseCd)) { return false; }
            if (!xSV(_pickingWorkNo, other._pickingWorkNo)) { return false; }
            if (!xSV(_shippingSlipNo, other._shippingSlipNo)) { return false; }
            if (!xSV(_clientShippingNo, other._clientShippingNo)) { return false; }
            if (!xSV(_delivCumistomerCd, other._delivCumistomerCd)) { return false; }
            if (!xSV(_delivCustomerNm, other._delivCustomerNm)) { return false; }
            if (!xSV(_delivAddressSupply, other._delivAddressSupply)) { return false; }
            if (!xSV(_delivAddress1, other._delivAddress1)) { return false; }
            if (!xSV(_delivAddress2, other._delivAddress2)) { return false; }
            if (!xSV(_delivAddress3, other._delivAddress3)) { return false; }
            if (!xSV(_shpToCity, other._shpToCity)) { return false; }
            if (!xSV(_shpToState, other._shpToState)) { return false; }
            if (!xSV(_delivZipCd, other._delivZipCd)) { return false; }
            if (!xSV(_publicCd, other._publicCd)) { return false; }
            if (!xSV(_delivTelNo, other._delivTelNo)) { return false; }
            if (!xSV(_paymentTerm, other._paymentTerm)) { return false; }
            if (!xSV(_collectAccountNoBillTo, other._collectAccountNoBillTo)) { return false; }
            if (!xSV(_collectZipCdBillTo, other._collectZipCdBillTo)) { return false; }
            if (!xSV(_collectCountryCdBillTo, other._collectCountryCdBillTo)) { return false; }
            if (!xSV(_paymentTermCdTaxesTo, other._paymentTermCdTaxesTo)) { return false; }
            if (!xSV(_collectAccountNoTaxesTo, other._collectAccountNoTaxesTo)) { return false; }
            if (!xSV(_collectZipCdTaxesTo, other._collectZipCdTaxesTo)) { return false; }
            if (!xSV(_collectCountryCdTaxesTo, other._collectCountryCdTaxesTo)) { return false; }
            if (!xSV(_codPaymentTermCd, other._codPaymentTermCd)) { return false; }
            if (!xSV(_codAmount, other._codAmount)) { return false; }
            if (!xSV(_codFeePayer, other._codFeePayer)) { return false; }
            if (!xSV(_termsOfSales, other._termsOfSales)) { return false; }
            if (!xSV(_brokerName, other._brokerName)) { return false; }
            if (!xSV(_brokerPhoneNo, other._brokerPhoneNo)) { return false; }
            if (!xSV(_brokerFaxNo, other._brokerFaxNo)) { return false; }
            if (!xSV(_satDeliveryFlg, other._satDeliveryFlg)) { return false; }
            if (!xSV(_residentialDeliveryFlg, other._residentialDeliveryFlg)) { return false; }
            if (!xSV(_codFlg, other._codFlg)) { return false; }
            if (!xSV(_signatureRequiredFlg, other._signatureRequiredFlg)) { return false; }
            if (!xSV(_signatureReleaseFlg, other._signatureReleaseFlg)) { return false; }
            if (!xSV(_callBeforeDeliveryFlg, other._callBeforeDeliveryFlg)) { return false; }
            if (!xSV(_freezableProtectionFlg, other._freezableProtectionFlg)) { return false; }
            if (!xSV(_guaranteedPlusFlg, other._guaranteedPlusFlg)) { return false; }
            if (!xSV(_residentialPickupFlg, other._residentialPickupFlg)) { return false; }
            if (!xSV(_doNotStackStackFlg, other._doNotStackStackFlg)) { return false; }
            if (!xSV(_limitedAccessDeliveryFlg, other._limitedAccessDeliveryFlg)) { return false; }
            if (!xSV(_limitedAccessPickupFlg, other._limitedAccessPickupFlg)) { return false; }
            if (!xSV(_overSizedFlg, other._overSizedFlg)) { return false; }
            if (!xSV(_poisonFlg, other._poisonFlg)) { return false; }
            if (!xSV(_foogFlg, other._foogFlg)) { return false; }
            if (!xSV(_liftgateDeliveryPrepaidFlg, other._liftgateDeliveryPrepaidFlg)) { return false; }
            if (!xSV(_liftgateDeliveryCollectFlg, other._liftgateDeliveryCollectFlg)) { return false; }
            if (!xSV(_liftgatePickupPrepaidFlg, other._liftgatePickupPrepaidFlg)) { return false; }
            if (!xSV(_liftgatePickupCollectFlg, other._liftgatePickupCollectFlg)) { return false; }
            if (!xSV(_insideDeliveryPrepaidFlg, other._insideDeliveryPrepaidFlg)) { return false; }
            if (!xSV(_insideDeliveryCollectFlg, other._insideDeliveryCollectFlg)) { return false; }
            if (!xSV(_insidePickupPrepaidFlg, other._insidePickupPrepaidFlg)) { return false; }
            if (!xSV(_insidePickupCollectFlg, other._insidePickupCollectFlg)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _warehouseId);
        hs = xCH(hs, _compId);
        hs = xCH(hs, _compCd);
        hs = xCH(hs, _deliveryCourseId);
        hs = xCH(hs, _deliveryCourseCd);
        hs = xCH(hs, _pickingWorkNo);
        hs = xCH(hs, _shippingSlipNo);
        hs = xCH(hs, _clientShippingNo);
        hs = xCH(hs, _delivCumistomerCd);
        hs = xCH(hs, _delivCustomerNm);
        hs = xCH(hs, _delivAddressSupply);
        hs = xCH(hs, _delivAddress1);
        hs = xCH(hs, _delivAddress2);
        hs = xCH(hs, _delivAddress3);
        hs = xCH(hs, _shpToCity);
        hs = xCH(hs, _shpToState);
        hs = xCH(hs, _delivZipCd);
        hs = xCH(hs, _publicCd);
        hs = xCH(hs, _delivTelNo);
        hs = xCH(hs, _paymentTerm);
        hs = xCH(hs, _collectAccountNoBillTo);
        hs = xCH(hs, _collectZipCdBillTo);
        hs = xCH(hs, _collectCountryCdBillTo);
        hs = xCH(hs, _paymentTermCdTaxesTo);
        hs = xCH(hs, _collectAccountNoTaxesTo);
        hs = xCH(hs, _collectZipCdTaxesTo);
        hs = xCH(hs, _collectCountryCdTaxesTo);
        hs = xCH(hs, _codPaymentTermCd);
        hs = xCH(hs, _codAmount);
        hs = xCH(hs, _codFeePayer);
        hs = xCH(hs, _termsOfSales);
        hs = xCH(hs, _brokerName);
        hs = xCH(hs, _brokerPhoneNo);
        hs = xCH(hs, _brokerFaxNo);
        hs = xCH(hs, _satDeliveryFlg);
        hs = xCH(hs, _residentialDeliveryFlg);
        hs = xCH(hs, _codFlg);
        hs = xCH(hs, _signatureRequiredFlg);
        hs = xCH(hs, _signatureReleaseFlg);
        hs = xCH(hs, _callBeforeDeliveryFlg);
        hs = xCH(hs, _freezableProtectionFlg);
        hs = xCH(hs, _guaranteedPlusFlg);
        hs = xCH(hs, _residentialPickupFlg);
        hs = xCH(hs, _doNotStackStackFlg);
        hs = xCH(hs, _limitedAccessDeliveryFlg);
        hs = xCH(hs, _limitedAccessPickupFlg);
        hs = xCH(hs, _overSizedFlg);
        hs = xCH(hs, _poisonFlg);
        hs = xCH(hs, _foogFlg);
        hs = xCH(hs, _liftgateDeliveryPrepaidFlg);
        hs = xCH(hs, _liftgateDeliveryCollectFlg);
        hs = xCH(hs, _liftgatePickupPrepaidFlg);
        hs = xCH(hs, _liftgatePickupCollectFlg);
        hs = xCH(hs, _insideDeliveryPrepaidFlg);
        hs = xCH(hs, _insideDeliveryCollectFlg);
        hs = xCH(hs, _insidePickupPrepaidFlg);
        hs = xCH(hs, _insidePickupCollectFlg);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_warehouseId));
        sb.append(dm).append(xfND(_compId));
        sb.append(dm).append(xfND(_compCd));
        sb.append(dm).append(xfND(_deliveryCourseId));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_pickingWorkNo));
        sb.append(dm).append(xfND(_shippingSlipNo));
        sb.append(dm).append(xfND(_clientShippingNo));
        sb.append(dm).append(xfND(_delivCumistomerCd));
        sb.append(dm).append(xfND(_delivCustomerNm));
        sb.append(dm).append(xfND(_delivAddressSupply));
        sb.append(dm).append(xfND(_delivAddress1));
        sb.append(dm).append(xfND(_delivAddress2));
        sb.append(dm).append(xfND(_delivAddress3));
        sb.append(dm).append(xfND(_shpToCity));
        sb.append(dm).append(xfND(_shpToState));
        sb.append(dm).append(xfND(_delivZipCd));
        sb.append(dm).append(xfND(_publicCd));
        sb.append(dm).append(xfND(_delivTelNo));
        sb.append(dm).append(xfND(_paymentTerm));
        sb.append(dm).append(xfND(_collectAccountNoBillTo));
        sb.append(dm).append(xfND(_collectZipCdBillTo));
        sb.append(dm).append(xfND(_collectCountryCdBillTo));
        sb.append(dm).append(xfND(_paymentTermCdTaxesTo));
        sb.append(dm).append(xfND(_collectAccountNoTaxesTo));
        sb.append(dm).append(xfND(_collectZipCdTaxesTo));
        sb.append(dm).append(xfND(_collectCountryCdTaxesTo));
        sb.append(dm).append(xfND(_codPaymentTermCd));
        sb.append(dm).append(xfND(_codAmount));
        sb.append(dm).append(xfND(_codFeePayer));
        sb.append(dm).append(xfND(_termsOfSales));
        sb.append(dm).append(xfND(_brokerName));
        sb.append(dm).append(xfND(_brokerPhoneNo));
        sb.append(dm).append(xfND(_brokerFaxNo));
        sb.append(dm).append(xfND(_satDeliveryFlg));
        sb.append(dm).append(xfND(_residentialDeliveryFlg));
        sb.append(dm).append(xfND(_codFlg));
        sb.append(dm).append(xfND(_signatureRequiredFlg));
        sb.append(dm).append(xfND(_signatureReleaseFlg));
        sb.append(dm).append(xfND(_callBeforeDeliveryFlg));
        sb.append(dm).append(xfND(_freezableProtectionFlg));
        sb.append(dm).append(xfND(_guaranteedPlusFlg));
        sb.append(dm).append(xfND(_residentialPickupFlg));
        sb.append(dm).append(xfND(_doNotStackStackFlg));
        sb.append(dm).append(xfND(_limitedAccessDeliveryFlg));
        sb.append(dm).append(xfND(_limitedAccessPickupFlg));
        sb.append(dm).append(xfND(_overSizedFlg));
        sb.append(dm).append(xfND(_poisonFlg));
        sb.append(dm).append(xfND(_foogFlg));
        sb.append(dm).append(xfND(_liftgateDeliveryPrepaidFlg));
        sb.append(dm).append(xfND(_liftgateDeliveryCollectFlg));
        sb.append(dm).append(xfND(_liftgatePickupPrepaidFlg));
        sb.append(dm).append(xfND(_liftgatePickupCollectFlg));
        sb.append(dm).append(xfND(_insideDeliveryPrepaidFlg));
        sb.append(dm).append(xfND(_insideDeliveryCollectFlg));
        sb.append(dm).append(xfND(_insidePickupPrepaidFlg));
        sb.append(dm).append(xfND(_insidePickupCollectFlg));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlShipmentRequestHeader clone() {
        return (SqlShipmentRequestHeader)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] WAREHOUSE_ID: {varchar(30)} <br>
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseId() {
        checkSpecifiedProperty("warehouseId");
        return convertEmptyToNull(_warehouseId);
    }

    /**
     * [set] WAREHOUSE_ID: {varchar(30)} <br>
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseId(String warehouseId) {
        registerModifiedProperty("warehouseId");
        _warehouseId = warehouseId;
    }

    /**
     * [get] COMP_ID: {bigint(19)} <br>
     * @return The value of the column 'COMP_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCompId() {
        checkSpecifiedProperty("compId");
        return _compId;
    }

    /**
     * [set] COMP_ID: {bigint(19)} <br>
     * @param compId The value of the column 'COMP_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompId(Long compId) {
        registerModifiedProperty("compId");
        _compId = compId;
    }

    /**
     * [get] COMP_CD: {varchar(30)} <br>
     * @return The value of the column 'COMP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompCd() {
        checkSpecifiedProperty("compCd");
        return convertEmptyToNull(_compCd);
    }

    /**
     * [set] COMP_CD: {varchar(30)} <br>
     * @param compCd The value of the column 'COMP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompCd(String compCd) {
        registerModifiedProperty("compCd");
        _compCd = compCd;
    }

    /**
     * [get] DELIVERY_COURSE_ID: {bigint(19)} <br>
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDeliveryCourseId() {
        checkSpecifiedProperty("deliveryCourseId");
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {bigint(19)} <br>
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        registerModifiedProperty("deliveryCourseId");
        _deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] PICKING_WORK_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkNo() {
        checkSpecifiedProperty("pickingWorkNo");
        return convertEmptyToNull(_pickingWorkNo);
    }

    /**
     * [set] PICKING_WORK_NO: {varchar(30)} <br>
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        registerModifiedProperty("pickingWorkNo");
        _pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {varchar(30)} <br>
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingSlipNo() {
        checkSpecifiedProperty("shippingSlipNo");
        return convertEmptyToNull(_shippingSlipNo);
    }

    /**
     * [set] SHIPPING_SLIP_NO: {varchar(30)} <br>
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        registerModifiedProperty("shippingSlipNo");
        _shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientShippingNo() {
        checkSpecifiedProperty("clientShippingNo");
        return convertEmptyToNull(_clientShippingNo);
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {varchar(30)} <br>
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientShippingNo(String clientShippingNo) {
        registerModifiedProperty("clientShippingNo");
        _clientShippingNo = clientShippingNo;
    }

    /**
     * [get] DELIV_CUMISTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIV_CUMISTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCumistomerCd() {
        checkSpecifiedProperty("delivCumistomerCd");
        return convertEmptyToNull(_delivCumistomerCd);
    }

    /**
     * [set] DELIV_CUMISTOMER_CD: {varchar(30)} <br>
     * @param delivCumistomerCd The value of the column 'DELIV_CUMISTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCumistomerCd(String delivCumistomerCd) {
        registerModifiedProperty("delivCumistomerCd");
        _delivCumistomerCd = delivCumistomerCd;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm() {
        checkSpecifiedProperty("delivCustomerNm");
        return convertEmptyToNull(_delivCustomerNm);
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        registerModifiedProperty("delivCustomerNm");
        _delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] DELIV_ADDRESS_SUPPLY: {varchar(60)} <br>
     * @return The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddressSupply() {
        checkSpecifiedProperty("delivAddressSupply");
        return convertEmptyToNull(_delivAddressSupply);
    }

    /**
     * [set] DELIV_ADDRESS_SUPPLY: {varchar(60)} <br>
     * @param delivAddressSupply The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddressSupply(String delivAddressSupply) {
        registerModifiedProperty("delivAddressSupply");
        _delivAddressSupply = delivAddressSupply;
    }

    /**
     * [get] DELIV_ADDRESS1: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress1() {
        checkSpecifiedProperty("delivAddress1");
        return convertEmptyToNull(_delivAddress1);
    }

    /**
     * [set] DELIV_ADDRESS1: {varchar(255)} <br>
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress1(String delivAddress1) {
        registerModifiedProperty("delivAddress1");
        _delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress2() {
        checkSpecifiedProperty("delivAddress2");
        return convertEmptyToNull(_delivAddress2);
    }

    /**
     * [set] DELIV_ADDRESS2: {varchar(255)} <br>
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress2(String delivAddress2) {
        registerModifiedProperty("delivAddress2");
        _delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress3() {
        checkSpecifiedProperty("delivAddress3");
        return convertEmptyToNull(_delivAddress3);
    }

    /**
     * [set] DELIV_ADDRESS3: {varchar(255)} <br>
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress3(String delivAddress3) {
        registerModifiedProperty("delivAddress3");
        _delivAddress3 = delivAddress3;
    }

    /**
     * [get] SHP_TO_CITY: {varchar(255)} <br>
     * @return The value of the column 'SHP_TO_CITY'. (NullAllowed even if selected: for no constraint)
     */
    public String getShpToCity() {
        checkSpecifiedProperty("shpToCity");
        return convertEmptyToNull(_shpToCity);
    }

    /**
     * [set] SHP_TO_CITY: {varchar(255)} <br>
     * @param shpToCity The value of the column 'SHP_TO_CITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShpToCity(String shpToCity) {
        registerModifiedProperty("shpToCity");
        _shpToCity = shpToCity;
    }

    /**
     * [get] SHP_TO_STATE: {varchar(255)} <br>
     * @return The value of the column 'SHP_TO_STATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShpToState() {
        checkSpecifiedProperty("shpToState");
        return convertEmptyToNull(_shpToState);
    }

    /**
     * [set] SHP_TO_STATE: {varchar(255)} <br>
     * @param shpToState The value of the column 'SHP_TO_STATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShpToState(String shpToState) {
        registerModifiedProperty("shpToState");
        _shpToState = shpToState;
    }

    /**
     * [get] DELIV_ZIP_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivZipCd() {
        checkSpecifiedProperty("delivZipCd");
        return convertEmptyToNull(_delivZipCd);
    }

    /**
     * [set] DELIV_ZIP_CD: {varchar(30)} <br>
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivZipCd(String delivZipCd) {
        registerModifiedProperty("delivZipCd");
        _delivZipCd = delivZipCd;
    }

    /**
     * [get] PUBLIC_CD: {varchar(30)} <br>
     * @return The value of the column 'PUBLIC_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPublicCd() {
        checkSpecifiedProperty("publicCd");
        return convertEmptyToNull(_publicCd);
    }

    /**
     * [set] PUBLIC_CD: {varchar(30)} <br>
     * @param publicCd The value of the column 'PUBLIC_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPublicCd(String publicCd) {
        registerModifiedProperty("publicCd");
        _publicCd = publicCd;
    }

    /**
     * [get] DELIV_TEL_NO: {varchar(255)} <br>
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTelNo() {
        checkSpecifiedProperty("delivTelNo");
        return convertEmptyToNull(_delivTelNo);
    }

    /**
     * [set] DELIV_TEL_NO: {varchar(255)} <br>
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTelNo(String delivTelNo) {
        registerModifiedProperty("delivTelNo");
        _delivTelNo = delivTelNo;
    }

    /**
     * [get] PAYMENT_TERM: {varchar(30)} <br>
     * @return The value of the column 'PAYMENT_TERM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPaymentTerm() {
        checkSpecifiedProperty("paymentTerm");
        return convertEmptyToNull(_paymentTerm);
    }

    /**
     * [set] PAYMENT_TERM: {varchar(30)} <br>
     * @param paymentTerm The value of the column 'PAYMENT_TERM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPaymentTerm(String paymentTerm) {
        registerModifiedProperty("paymentTerm");
        _paymentTerm = paymentTerm;
    }

    /**
     * [get] COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)} <br>
     * @return The value of the column 'COLLECT_ACCOUNT_NO_BILL_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCollectAccountNoBillTo() {
        checkSpecifiedProperty("collectAccountNoBillTo");
        return convertEmptyToNull(_collectAccountNoBillTo);
    }

    /**
     * [set] COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)} <br>
     * @param collectAccountNoBillTo The value of the column 'COLLECT_ACCOUNT_NO_BILL_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCollectAccountNoBillTo(String collectAccountNoBillTo) {
        registerModifiedProperty("collectAccountNoBillTo");
        _collectAccountNoBillTo = collectAccountNoBillTo;
    }

    /**
     * [get] COLLECT_ZIP_CD_BILL_TO: {varchar(30)} <br>
     * @return The value of the column 'COLLECT_ZIP_CD_BILL_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCollectZipCdBillTo() {
        checkSpecifiedProperty("collectZipCdBillTo");
        return convertEmptyToNull(_collectZipCdBillTo);
    }

    /**
     * [set] COLLECT_ZIP_CD_BILL_TO: {varchar(30)} <br>
     * @param collectZipCdBillTo The value of the column 'COLLECT_ZIP_CD_BILL_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCollectZipCdBillTo(String collectZipCdBillTo) {
        registerModifiedProperty("collectZipCdBillTo");
        _collectZipCdBillTo = collectZipCdBillTo;
    }

    /**
     * [get] COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)} <br>
     * @return The value of the column 'COLLECT_COUNTRY_CD_BILL_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCollectCountryCdBillTo() {
        checkSpecifiedProperty("collectCountryCdBillTo");
        return convertEmptyToNull(_collectCountryCdBillTo);
    }

    /**
     * [set] COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)} <br>
     * @param collectCountryCdBillTo The value of the column 'COLLECT_COUNTRY_CD_BILL_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCollectCountryCdBillTo(String collectCountryCdBillTo) {
        registerModifiedProperty("collectCountryCdBillTo");
        _collectCountryCdBillTo = collectCountryCdBillTo;
    }

    /**
     * [get] PAYMENT_TERM_CD_TAXES_TO: {varchar(30)} <br>
     * @return The value of the column 'PAYMENT_TERM_CD_TAXES_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPaymentTermCdTaxesTo() {
        checkSpecifiedProperty("paymentTermCdTaxesTo");
        return convertEmptyToNull(_paymentTermCdTaxesTo);
    }

    /**
     * [set] PAYMENT_TERM_CD_TAXES_TO: {varchar(30)} <br>
     * @param paymentTermCdTaxesTo The value of the column 'PAYMENT_TERM_CD_TAXES_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPaymentTermCdTaxesTo(String paymentTermCdTaxesTo) {
        registerModifiedProperty("paymentTermCdTaxesTo");
        _paymentTermCdTaxesTo = paymentTermCdTaxesTo;
    }

    /**
     * [get] COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)} <br>
     * @return The value of the column 'COLLECT_ACCOUNT_NO_TAXES_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCollectAccountNoTaxesTo() {
        checkSpecifiedProperty("collectAccountNoTaxesTo");
        return convertEmptyToNull(_collectAccountNoTaxesTo);
    }

    /**
     * [set] COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)} <br>
     * @param collectAccountNoTaxesTo The value of the column 'COLLECT_ACCOUNT_NO_TAXES_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCollectAccountNoTaxesTo(String collectAccountNoTaxesTo) {
        registerModifiedProperty("collectAccountNoTaxesTo");
        _collectAccountNoTaxesTo = collectAccountNoTaxesTo;
    }

    /**
     * [get] COLLECT_ZIP_CD_TAXES_TO: {varchar(30)} <br>
     * @return The value of the column 'COLLECT_ZIP_CD_TAXES_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCollectZipCdTaxesTo() {
        checkSpecifiedProperty("collectZipCdTaxesTo");
        return convertEmptyToNull(_collectZipCdTaxesTo);
    }

    /**
     * [set] COLLECT_ZIP_CD_TAXES_TO: {varchar(30)} <br>
     * @param collectZipCdTaxesTo The value of the column 'COLLECT_ZIP_CD_TAXES_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCollectZipCdTaxesTo(String collectZipCdTaxesTo) {
        registerModifiedProperty("collectZipCdTaxesTo");
        _collectZipCdTaxesTo = collectZipCdTaxesTo;
    }

    /**
     * [get] COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)} <br>
     * @return The value of the column 'COLLECT_COUNTRY_CD_TAXES_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCollectCountryCdTaxesTo() {
        checkSpecifiedProperty("collectCountryCdTaxesTo");
        return convertEmptyToNull(_collectCountryCdTaxesTo);
    }

    /**
     * [set] COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)} <br>
     * @param collectCountryCdTaxesTo The value of the column 'COLLECT_COUNTRY_CD_TAXES_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCollectCountryCdTaxesTo(String collectCountryCdTaxesTo) {
        registerModifiedProperty("collectCountryCdTaxesTo");
        _collectCountryCdTaxesTo = collectCountryCdTaxesTo;
    }

    /**
     * [get] COD_PAYMENT_TERM_CD: {varchar(30)} <br>
     * @return The value of the column 'COD_PAYMENT_TERM_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCodPaymentTermCd() {
        checkSpecifiedProperty("codPaymentTermCd");
        return convertEmptyToNull(_codPaymentTermCd);
    }

    /**
     * [set] COD_PAYMENT_TERM_CD: {varchar(30)} <br>
     * @param codPaymentTermCd The value of the column 'COD_PAYMENT_TERM_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodPaymentTermCd(String codPaymentTermCd) {
        registerModifiedProperty("codPaymentTermCd");
        _codPaymentTermCd = codPaymentTermCd;
    }

    /**
     * [get] COD_AMOUNT: {decimal(38, 6)} <br>
     * @return The value of the column 'COD_AMOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCodAmount() {
        checkSpecifiedProperty("codAmount");
        return _codAmount;
    }

    /**
     * [set] COD_AMOUNT: {decimal(38, 6)} <br>
     * @param codAmount The value of the column 'COD_AMOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodAmount(java.math.BigDecimal codAmount) {
        registerModifiedProperty("codAmount");
        _codAmount = codAmount;
    }

    /**
     * [get] COD_FEE_PAYER: {varchar(30)} <br>
     * @return The value of the column 'COD_FEE_PAYER'. (NullAllowed even if selected: for no constraint)
     */
    public String getCodFeePayer() {
        checkSpecifiedProperty("codFeePayer");
        return convertEmptyToNull(_codFeePayer);
    }

    /**
     * [set] COD_FEE_PAYER: {varchar(30)} <br>
     * @param codFeePayer The value of the column 'COD_FEE_PAYER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodFeePayer(String codFeePayer) {
        registerModifiedProperty("codFeePayer");
        _codFeePayer = codFeePayer;
    }

    /**
     * [get] TERMS_OF_SALES: {varchar(30)} <br>
     * @return The value of the column 'TERMS_OF_SALES'. (NullAllowed even if selected: for no constraint)
     */
    public String getTermsOfSales() {
        checkSpecifiedProperty("termsOfSales");
        return convertEmptyToNull(_termsOfSales);
    }

    /**
     * [set] TERMS_OF_SALES: {varchar(30)} <br>
     * @param termsOfSales The value of the column 'TERMS_OF_SALES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTermsOfSales(String termsOfSales) {
        registerModifiedProperty("termsOfSales");
        _termsOfSales = termsOfSales;
    }

    /**
     * [get] BROKER_NAME: {varchar(255)} <br>
     * @return The value of the column 'BROKER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrokerName() {
        checkSpecifiedProperty("brokerName");
        return convertEmptyToNull(_brokerName);
    }

    /**
     * [set] BROKER_NAME: {varchar(255)} <br>
     * @param brokerName The value of the column 'BROKER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrokerName(String brokerName) {
        registerModifiedProperty("brokerName");
        _brokerName = brokerName;
    }

    /**
     * [get] BROKER_PHONE_NO: {varchar(30)} <br>
     * @return The value of the column 'BROKER_PHONE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrokerPhoneNo() {
        checkSpecifiedProperty("brokerPhoneNo");
        return convertEmptyToNull(_brokerPhoneNo);
    }

    /**
     * [set] BROKER_PHONE_NO: {varchar(30)} <br>
     * @param brokerPhoneNo The value of the column 'BROKER_PHONE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrokerPhoneNo(String brokerPhoneNo) {
        registerModifiedProperty("brokerPhoneNo");
        _brokerPhoneNo = brokerPhoneNo;
    }

    /**
     * [get] BROKER_FAX_NO: {varchar(30)} <br>
     * @return The value of the column 'BROKER_FAX_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrokerFaxNo() {
        checkSpecifiedProperty("brokerFaxNo");
        return convertEmptyToNull(_brokerFaxNo);
    }

    /**
     * [set] BROKER_FAX_NO: {varchar(30)} <br>
     * @param brokerFaxNo The value of the column 'BROKER_FAX_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrokerFaxNo(String brokerFaxNo) {
        registerModifiedProperty("brokerFaxNo");
        _brokerFaxNo = brokerFaxNo;
    }

    /**
     * [get] SAT_DELIVERY_FLG: {char(1)} <br>
     * @return The value of the column 'SAT_DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSatDeliveryFlg() {
        checkSpecifiedProperty("satDeliveryFlg");
        return convertEmptyToNull(_satDeliveryFlg);
    }

    /**
     * [set] SAT_DELIVERY_FLG: {char(1)} <br>
     * @param satDeliveryFlg The value of the column 'SAT_DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSatDeliveryFlg(String satDeliveryFlg) {
        registerModifiedProperty("satDeliveryFlg");
        _satDeliveryFlg = satDeliveryFlg;
    }

    /**
     * [get] RESIDENTIAL_DELIVERY_FLG: {char(1)} <br>
     * @return The value of the column 'RESIDENTIAL_DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getResidentialDeliveryFlg() {
        checkSpecifiedProperty("residentialDeliveryFlg");
        return convertEmptyToNull(_residentialDeliveryFlg);
    }

    /**
     * [set] RESIDENTIAL_DELIVERY_FLG: {char(1)} <br>
     * @param residentialDeliveryFlg The value of the column 'RESIDENTIAL_DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setResidentialDeliveryFlg(String residentialDeliveryFlg) {
        registerModifiedProperty("residentialDeliveryFlg");
        _residentialDeliveryFlg = residentialDeliveryFlg;
    }

    /**
     * [get] COD_FLG: {char(1)} <br>
     * @return The value of the column 'COD_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCodFlg() {
        checkSpecifiedProperty("codFlg");
        return convertEmptyToNull(_codFlg);
    }

    /**
     * [set] COD_FLG: {char(1)} <br>
     * @param codFlg The value of the column 'COD_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodFlg(String codFlg) {
        registerModifiedProperty("codFlg");
        _codFlg = codFlg;
    }

    /**
     * [get] SIGNATURE_REQUIRED_FLG: {char(1)} <br>
     * @return The value of the column 'SIGNATURE_REQUIRED_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSignatureRequiredFlg() {
        checkSpecifiedProperty("signatureRequiredFlg");
        return convertEmptyToNull(_signatureRequiredFlg);
    }

    /**
     * [set] SIGNATURE_REQUIRED_FLG: {char(1)} <br>
     * @param signatureRequiredFlg The value of the column 'SIGNATURE_REQUIRED_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSignatureRequiredFlg(String signatureRequiredFlg) {
        registerModifiedProperty("signatureRequiredFlg");
        _signatureRequiredFlg = signatureRequiredFlg;
    }

    /**
     * [get] SIGNATURE_RELEASE_FLG: {char(1)} <br>
     * @return The value of the column 'SIGNATURE_RELEASE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSignatureReleaseFlg() {
        checkSpecifiedProperty("signatureReleaseFlg");
        return convertEmptyToNull(_signatureReleaseFlg);
    }

    /**
     * [set] SIGNATURE_RELEASE_FLG: {char(1)} <br>
     * @param signatureReleaseFlg The value of the column 'SIGNATURE_RELEASE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSignatureReleaseFlg(String signatureReleaseFlg) {
        registerModifiedProperty("signatureReleaseFlg");
        _signatureReleaseFlg = signatureReleaseFlg;
    }

    /**
     * [get] CALL_BEFORE_DELIVERY_FLG: {char(1)} <br>
     * @return The value of the column 'CALL_BEFORE_DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCallBeforeDeliveryFlg() {
        checkSpecifiedProperty("callBeforeDeliveryFlg");
        return convertEmptyToNull(_callBeforeDeliveryFlg);
    }

    /**
     * [set] CALL_BEFORE_DELIVERY_FLG: {char(1)} <br>
     * @param callBeforeDeliveryFlg The value of the column 'CALL_BEFORE_DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCallBeforeDeliveryFlg(String callBeforeDeliveryFlg) {
        registerModifiedProperty("callBeforeDeliveryFlg");
        _callBeforeDeliveryFlg = callBeforeDeliveryFlg;
    }

    /**
     * [get] FREEZABLE_PROTECTION_FLG: {char(1)} <br>
     * @return The value of the column 'FREEZABLE_PROTECTION_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getFreezableProtectionFlg() {
        checkSpecifiedProperty("freezableProtectionFlg");
        return convertEmptyToNull(_freezableProtectionFlg);
    }

    /**
     * [set] FREEZABLE_PROTECTION_FLG: {char(1)} <br>
     * @param freezableProtectionFlg The value of the column 'FREEZABLE_PROTECTION_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFreezableProtectionFlg(String freezableProtectionFlg) {
        registerModifiedProperty("freezableProtectionFlg");
        _freezableProtectionFlg = freezableProtectionFlg;
    }

    /**
     * [get] GUARANTEED_PLUS_FLG: {char(1)} <br>
     * @return The value of the column 'GUARANTEED_PLUS_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getGuaranteedPlusFlg() {
        checkSpecifiedProperty("guaranteedPlusFlg");
        return convertEmptyToNull(_guaranteedPlusFlg);
    }

    /**
     * [set] GUARANTEED_PLUS_FLG: {char(1)} <br>
     * @param guaranteedPlusFlg The value of the column 'GUARANTEED_PLUS_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGuaranteedPlusFlg(String guaranteedPlusFlg) {
        registerModifiedProperty("guaranteedPlusFlg");
        _guaranteedPlusFlg = guaranteedPlusFlg;
    }

    /**
     * [get] RESIDENTIAL_PICKUP_FLG: {char(1)} <br>
     * @return The value of the column 'RESIDENTIAL_PICKUP_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getResidentialPickupFlg() {
        checkSpecifiedProperty("residentialPickupFlg");
        return convertEmptyToNull(_residentialPickupFlg);
    }

    /**
     * [set] RESIDENTIAL_PICKUP_FLG: {char(1)} <br>
     * @param residentialPickupFlg The value of the column 'RESIDENTIAL_PICKUP_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setResidentialPickupFlg(String residentialPickupFlg) {
        registerModifiedProperty("residentialPickupFlg");
        _residentialPickupFlg = residentialPickupFlg;
    }

    /**
     * [get] DO_NOT_STACK_STACK_FLG: {char(1)} <br>
     * @return The value of the column 'DO_NOT_STACK_STACK_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDoNotStackStackFlg() {
        checkSpecifiedProperty("doNotStackStackFlg");
        return convertEmptyToNull(_doNotStackStackFlg);
    }

    /**
     * [set] DO_NOT_STACK_STACK_FLG: {char(1)} <br>
     * @param doNotStackStackFlg The value of the column 'DO_NOT_STACK_STACK_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDoNotStackStackFlg(String doNotStackStackFlg) {
        registerModifiedProperty("doNotStackStackFlg");
        _doNotStackStackFlg = doNotStackStackFlg;
    }

    /**
     * [get] LIMITED_ACCESS_DELIVERY_FLG: {char(1)} <br>
     * @return The value of the column 'LIMITED_ACCESS_DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitedAccessDeliveryFlg() {
        checkSpecifiedProperty("limitedAccessDeliveryFlg");
        return convertEmptyToNull(_limitedAccessDeliveryFlg);
    }

    /**
     * [set] LIMITED_ACCESS_DELIVERY_FLG: {char(1)} <br>
     * @param limitedAccessDeliveryFlg The value of the column 'LIMITED_ACCESS_DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitedAccessDeliveryFlg(String limitedAccessDeliveryFlg) {
        registerModifiedProperty("limitedAccessDeliveryFlg");
        _limitedAccessDeliveryFlg = limitedAccessDeliveryFlg;
    }

    /**
     * [get] LIMITED_ACCESS_PICKUP_FLG: {char(1)} <br>
     * @return The value of the column 'LIMITED_ACCESS_PICKUP_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitedAccessPickupFlg() {
        checkSpecifiedProperty("limitedAccessPickupFlg");
        return convertEmptyToNull(_limitedAccessPickupFlg);
    }

    /**
     * [set] LIMITED_ACCESS_PICKUP_FLG: {char(1)} <br>
     * @param limitedAccessPickupFlg The value of the column 'LIMITED_ACCESS_PICKUP_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitedAccessPickupFlg(String limitedAccessPickupFlg) {
        registerModifiedProperty("limitedAccessPickupFlg");
        _limitedAccessPickupFlg = limitedAccessPickupFlg;
    }

    /**
     * [get] OVER_SIZED_FLG: {char(1)} <br>
     * @return The value of the column 'OVER_SIZED_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOverSizedFlg() {
        checkSpecifiedProperty("overSizedFlg");
        return convertEmptyToNull(_overSizedFlg);
    }

    /**
     * [set] OVER_SIZED_FLG: {char(1)} <br>
     * @param overSizedFlg The value of the column 'OVER_SIZED_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOverSizedFlg(String overSizedFlg) {
        registerModifiedProperty("overSizedFlg");
        _overSizedFlg = overSizedFlg;
    }

    /**
     * [get] POISON_FLG: {char(1)} <br>
     * @return The value of the column 'POISON_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPoisonFlg() {
        checkSpecifiedProperty("poisonFlg");
        return convertEmptyToNull(_poisonFlg);
    }

    /**
     * [set] POISON_FLG: {char(1)} <br>
     * @param poisonFlg The value of the column 'POISON_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPoisonFlg(String poisonFlg) {
        registerModifiedProperty("poisonFlg");
        _poisonFlg = poisonFlg;
    }

    /**
     * [get] FOOG_FLG: {char(1)} <br>
     * @return The value of the column 'FOOG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoogFlg() {
        checkSpecifiedProperty("foogFlg");
        return convertEmptyToNull(_foogFlg);
    }

    /**
     * [set] FOOG_FLG: {char(1)} <br>
     * @param foogFlg The value of the column 'FOOG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoogFlg(String foogFlg) {
        registerModifiedProperty("foogFlg");
        _foogFlg = foogFlg;
    }

    /**
     * [get] LIFTGATE_DELIVERY_PREPAID_FLG: {char(1)} <br>
     * @return The value of the column 'LIFTGATE_DELIVERY_PREPAID_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLiftgateDeliveryPrepaidFlg() {
        checkSpecifiedProperty("liftgateDeliveryPrepaidFlg");
        return convertEmptyToNull(_liftgateDeliveryPrepaidFlg);
    }

    /**
     * [set] LIFTGATE_DELIVERY_PREPAID_FLG: {char(1)} <br>
     * @param liftgateDeliveryPrepaidFlg The value of the column 'LIFTGATE_DELIVERY_PREPAID_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLiftgateDeliveryPrepaidFlg(String liftgateDeliveryPrepaidFlg) {
        registerModifiedProperty("liftgateDeliveryPrepaidFlg");
        _liftgateDeliveryPrepaidFlg = liftgateDeliveryPrepaidFlg;
    }

    /**
     * [get] LIFTGATE_DELIVERY_COLLECT_FLG: {char(1)} <br>
     * @return The value of the column 'LIFTGATE_DELIVERY_COLLECT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLiftgateDeliveryCollectFlg() {
        checkSpecifiedProperty("liftgateDeliveryCollectFlg");
        return convertEmptyToNull(_liftgateDeliveryCollectFlg);
    }

    /**
     * [set] LIFTGATE_DELIVERY_COLLECT_FLG: {char(1)} <br>
     * @param liftgateDeliveryCollectFlg The value of the column 'LIFTGATE_DELIVERY_COLLECT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLiftgateDeliveryCollectFlg(String liftgateDeliveryCollectFlg) {
        registerModifiedProperty("liftgateDeliveryCollectFlg");
        _liftgateDeliveryCollectFlg = liftgateDeliveryCollectFlg;
    }

    /**
     * [get] LIFTGATE_PICKUP_PREPAID_FLG: {char(1)} <br>
     * @return The value of the column 'LIFTGATE_PICKUP_PREPAID_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLiftgatePickupPrepaidFlg() {
        checkSpecifiedProperty("liftgatePickupPrepaidFlg");
        return convertEmptyToNull(_liftgatePickupPrepaidFlg);
    }

    /**
     * [set] LIFTGATE_PICKUP_PREPAID_FLG: {char(1)} <br>
     * @param liftgatePickupPrepaidFlg The value of the column 'LIFTGATE_PICKUP_PREPAID_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLiftgatePickupPrepaidFlg(String liftgatePickupPrepaidFlg) {
        registerModifiedProperty("liftgatePickupPrepaidFlg");
        _liftgatePickupPrepaidFlg = liftgatePickupPrepaidFlg;
    }

    /**
     * [get] LIFTGATE_PICKUP_COLLECT_FLG: {char(1)} <br>
     * @return The value of the column 'LIFTGATE_PICKUP_COLLECT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLiftgatePickupCollectFlg() {
        checkSpecifiedProperty("liftgatePickupCollectFlg");
        return convertEmptyToNull(_liftgatePickupCollectFlg);
    }

    /**
     * [set] LIFTGATE_PICKUP_COLLECT_FLG: {char(1)} <br>
     * @param liftgatePickupCollectFlg The value of the column 'LIFTGATE_PICKUP_COLLECT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLiftgatePickupCollectFlg(String liftgatePickupCollectFlg) {
        registerModifiedProperty("liftgatePickupCollectFlg");
        _liftgatePickupCollectFlg = liftgatePickupCollectFlg;
    }

    /**
     * [get] INSIDE_DELIVERY_PREPAID_FLG: {char(1)} <br>
     * @return The value of the column 'INSIDE_DELIVERY_PREPAID_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInsideDeliveryPrepaidFlg() {
        checkSpecifiedProperty("insideDeliveryPrepaidFlg");
        return convertEmptyToNull(_insideDeliveryPrepaidFlg);
    }

    /**
     * [set] INSIDE_DELIVERY_PREPAID_FLG: {char(1)} <br>
     * @param insideDeliveryPrepaidFlg The value of the column 'INSIDE_DELIVERY_PREPAID_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInsideDeliveryPrepaidFlg(String insideDeliveryPrepaidFlg) {
        registerModifiedProperty("insideDeliveryPrepaidFlg");
        _insideDeliveryPrepaidFlg = insideDeliveryPrepaidFlg;
    }

    /**
     * [get] INSIDE_DELIVERY_COLLECT_FLG: {char(1)} <br>
     * @return The value of the column 'INSIDE_DELIVERY_COLLECT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInsideDeliveryCollectFlg() {
        checkSpecifiedProperty("insideDeliveryCollectFlg");
        return convertEmptyToNull(_insideDeliveryCollectFlg);
    }

    /**
     * [set] INSIDE_DELIVERY_COLLECT_FLG: {char(1)} <br>
     * @param insideDeliveryCollectFlg The value of the column 'INSIDE_DELIVERY_COLLECT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInsideDeliveryCollectFlg(String insideDeliveryCollectFlg) {
        registerModifiedProperty("insideDeliveryCollectFlg");
        _insideDeliveryCollectFlg = insideDeliveryCollectFlg;
    }

    /**
     * [get] INSIDE_PICKUP_PREPAID_FLG: {char(1)} <br>
     * @return The value of the column 'INSIDE_PICKUP_PREPAID_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInsidePickupPrepaidFlg() {
        checkSpecifiedProperty("insidePickupPrepaidFlg");
        return convertEmptyToNull(_insidePickupPrepaidFlg);
    }

    /**
     * [set] INSIDE_PICKUP_PREPAID_FLG: {char(1)} <br>
     * @param insidePickupPrepaidFlg The value of the column 'INSIDE_PICKUP_PREPAID_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInsidePickupPrepaidFlg(String insidePickupPrepaidFlg) {
        registerModifiedProperty("insidePickupPrepaidFlg");
        _insidePickupPrepaidFlg = insidePickupPrepaidFlg;
    }

    /**
     * [get] INSIDE_PICKUP_COLLECT_FLG: {char(1)} <br>
     * @return The value of the column 'INSIDE_PICKUP_COLLECT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInsidePickupCollectFlg() {
        checkSpecifiedProperty("insidePickupCollectFlg");
        return convertEmptyToNull(_insidePickupCollectFlg);
    }

    /**
     * [set] INSIDE_PICKUP_COLLECT_FLG: {char(1)} <br>
     * @param insidePickupCollectFlg The value of the column 'INSIDE_PICKUP_COLLECT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInsidePickupCollectFlg(String insidePickupCollectFlg) {
        registerModifiedProperty("insidePickupCollectFlg");
        _insidePickupCollectFlg = insidePickupCollectFlg;
    }
}

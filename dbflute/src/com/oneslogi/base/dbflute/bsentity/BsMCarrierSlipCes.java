package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of M_CARRIER_SLIP_CES as TABLE. <br>
 * キャリアEDIシステム送り状マスタ
 * <pre>
 * [primary-key]
 *     CUSTOMER_ID
 *
 * [column]
 *     CUSTOMER_ID, COLLECT_ACCOUNT_NO_BILL_TO, COLLECT_ZIP_CD_BILL_TO, COLLECT_COUNTRY_CD_BILL_TO, PAYMENT_TERM_CD_TAXES_TO, COLLECT_ACCOUNT_NO_TAXES_TO, COLLECT_ZIP_CD_TAXES_TO, COLLECT_COUNTRY_CD_TAXES_TO, COD_PAYMENT_TERM_CD, COD_AMOUNT, COD_FEE_PAYER, TERMS_OF_SALES, BROKER_NAME, BROKER_PHONE_NO, BROKER_FAX_NO, SAT_DELIVERY_FLG, RESIDENTIAL_DELIVERY_FLG, COD_FLG, SIGNATURE_REQUIRED_FLG, SIGNATURE_RELEASE_FLG, CALL_BEFORE_DELIVERY_FLG, FREEZABLE_PROTECTION_FLG, GUARANTEED_PLUS_FLG, RESIDENTIAL_PICKUP_FLG, DO_NOT_STACK_STACK_FLG, LIMITED_ACCESS_DELIVERY_FLG, LIMITED_ACCESS_PICKUP_FLG, OVER_SIZED_FLG, POISON_FLG, FOOG_FLG, LIFTGATE_DELIVERY_PREPAID_FLG, LIFTGATE_DELIVERY_COLLECT_FLG, LIFTGATE_PICKUP_PREPAID_FLG, LIFTGATE_PICKUP_COLLECT_FLG, INSIDE_DELIVERY_PREPAID_FLG, INSIDE_DELIVERY_COLLECT_FLG, INSIDE_PICKUP_PREPAID_FLG, INSIDE_PICKUP_COLLECT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CUSTOMER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CUSTOMER, B_CLASS_DTL(BySatDeliveryFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCustomer, bClassDtlBySatDeliveryFlg, bClassDtlByResidentialDeliveryFlg, bClassDtlByCodFlg, bClassDtlBySignatureRequiredFlg, bClassDtlBySignatureReleaseFlg, bClassDtlByCallBeforeDeliveryFlg, bClassDtlByFreezableProtectionFlg, bClassDtlByGuaranteedPlusFlg, bClassDtlByResidentialPickupFlg, bClassDtlByDoNotStackStackFlg, bClassDtlByLimitedAccessDeliveryFlg, bClassDtlByLimitedAccessPickupFlg, bClassDtlByOverSizedFlg, bClassDtlByPoisonFlg, bClassDtlByFoogFlg, bClassDtlByLiftgateDeliveryPrepaidFlg, bClassDtlByLiftgateDeliveryCollectFlg, bClassDtlByLiftgatePickupPrepaidFlg, bClassDtlByLiftgatePickupCollectFlg, bClassDtlByInsideDeliveryPrepaidFlg, bClassDtlByInsideDeliveryCollectFlg, bClassDtlByInsidePickupPrepaidFlg, bClassDtlByInsidePickupCollectFlg, bClassDtlByDelFlg
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long customerId = entity.getCustomerId();
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
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCustomerId(customerId);
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
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCarrierSlipCes extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER} */
    protected Long _customerId;

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

    /** COD_AMOUNT: {decimal(16, 6)} */
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

    /** SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg} */
    protected String _satDeliveryFlg;

    /** RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg} */
    protected String _residentialDeliveryFlg;

    /** COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg} */
    protected String _codFlg;

    /** SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg} */
    protected String _signatureRequiredFlg;

    /** SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg} */
    protected String _signatureReleaseFlg;

    /** CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg} */
    protected String _callBeforeDeliveryFlg;

    /** FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg} */
    protected String _freezableProtectionFlg;

    /** GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg} */
    protected String _guaranteedPlusFlg;

    /** RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg} */
    protected String _residentialPickupFlg;

    /** DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg} */
    protected String _doNotStackStackFlg;

    /** LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg} */
    protected String _limitedAccessDeliveryFlg;

    /** LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg} */
    protected String _limitedAccessPickupFlg;

    /** OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg} */
    protected String _overSizedFlg;

    /** POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg} */
    protected String _poisonFlg;

    /** FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg} */
    protected String _foogFlg;

    /** LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg} */
    protected String _liftgateDeliveryPrepaidFlg;

    /** LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg} */
    protected String _liftgateDeliveryCollectFlg;

    /** LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg} */
    protected String _liftgatePickupPrepaidFlg;

    /** LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg} */
    protected String _liftgatePickupCollectFlg;

    /** INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg} */
    protected String _insideDeliveryPrepaidFlg;

    /** INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg} */
    protected String _insideDeliveryCollectFlg;

    /** INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg} */
    protected String _insidePickupPrepaidFlg;

    /** INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg} */
    protected String _insidePickupCollectFlg;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "M_CARRIER_SLIP_CES";
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
        if (_customerId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of satDeliveryFlg as the classification of SatDeliveryFlg. <br>
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg} <br>
     * Saturday Delivery フラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SatDeliveryFlg getSatDeliveryFlgAsSatDeliveryFlg() {
        return CDef.SatDeliveryFlg.codeOf(getSatDeliveryFlg());
    }

    /**
     * Set the value of satDeliveryFlg as the classification of SatDeliveryFlg. <br>
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg} <br>
     * Saturday Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSatDeliveryFlgAsSatDeliveryFlg(CDef.SatDeliveryFlg cdef) {
        setSatDeliveryFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of residentialDeliveryFlg as the classification of ResidentialDeliveryFlg. <br>
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg} <br>
     * Residential Delivery フラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ResidentialDeliveryFlg getResidentialDeliveryFlgAsResidentialDeliveryFlg() {
        return CDef.ResidentialDeliveryFlg.codeOf(getResidentialDeliveryFlg());
    }

    /**
     * Set the value of residentialDeliveryFlg as the classification of ResidentialDeliveryFlg. <br>
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg} <br>
     * Residential Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setResidentialDeliveryFlgAsResidentialDeliveryFlg(CDef.ResidentialDeliveryFlg cdef) {
        setResidentialDeliveryFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of codFlg as the classification of CodFlg. <br>
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg} <br>
     * Collect On Delivery フラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CodFlg getCodFlgAsCodFlg() {
        return CDef.CodFlg.codeOf(getCodFlg());
    }

    /**
     * Set the value of codFlg as the classification of CodFlg. <br>
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg} <br>
     * Collect On Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCodFlgAsCodFlg(CDef.CodFlg cdef) {
        setCodFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of signatureRequiredFlg as the classification of SignatureRequiredFlg. <br>
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg} <br>
     * Signature Required フラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SignatureRequiredFlg getSignatureRequiredFlgAsSignatureRequiredFlg() {
        return CDef.SignatureRequiredFlg.codeOf(getSignatureRequiredFlg());
    }

    /**
     * Set the value of signatureRequiredFlg as the classification of SignatureRequiredFlg. <br>
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg} <br>
     * Signature Required フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSignatureRequiredFlgAsSignatureRequiredFlg(CDef.SignatureRequiredFlg cdef) {
        setSignatureRequiredFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of signatureReleaseFlg as the classification of SignatureReleaseFlg. <br>
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg} <br>
     * Signature ReleaseフラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SignatureReleaseFlg getSignatureReleaseFlgAsSignatureReleaseFlg() {
        return CDef.SignatureReleaseFlg.codeOf(getSignatureReleaseFlg());
    }

    /**
     * Set the value of signatureReleaseFlg as the classification of SignatureReleaseFlg. <br>
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg} <br>
     * Signature ReleaseフラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSignatureReleaseFlgAsSignatureReleaseFlg(CDef.SignatureReleaseFlg cdef) {
        setSignatureReleaseFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of callBeforeDeliveryFlg as the classification of CallBeforeDeliveryFlg. <br>
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg} <br>
     * Call Before Delivery フラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CallBeforeDeliveryFlg getCallBeforeDeliveryFlgAsCallBeforeDeliveryFlg() {
        return CDef.CallBeforeDeliveryFlg.codeOf(getCallBeforeDeliveryFlg());
    }

    /**
     * Set the value of callBeforeDeliveryFlg as the classification of CallBeforeDeliveryFlg. <br>
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg} <br>
     * Call Before Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCallBeforeDeliveryFlgAsCallBeforeDeliveryFlg(CDef.CallBeforeDeliveryFlg cdef) {
        setCallBeforeDeliveryFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of freezableProtectionFlg as the classification of FreezableProtectionFlg. <br>
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg} <br>
     * Freezable Protection フラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.FreezableProtectionFlg getFreezableProtectionFlgAsFreezableProtectionFlg() {
        return CDef.FreezableProtectionFlg.codeOf(getFreezableProtectionFlg());
    }

    /**
     * Set the value of freezableProtectionFlg as the classification of FreezableProtectionFlg. <br>
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg} <br>
     * Freezable Protection フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setFreezableProtectionFlgAsFreezableProtectionFlg(CDef.FreezableProtectionFlg cdef) {
        setFreezableProtectionFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of guaranteedPlusFlg as the classification of GuaranteedPlusFlg. <br>
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg} <br>
     * Guaranteed Plus フラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.GuaranteedPlusFlg getGuaranteedPlusFlgAsGuaranteedPlusFlg() {
        return CDef.GuaranteedPlusFlg.codeOf(getGuaranteedPlusFlg());
    }

    /**
     * Set the value of guaranteedPlusFlg as the classification of GuaranteedPlusFlg. <br>
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg} <br>
     * Guaranteed Plus フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setGuaranteedPlusFlgAsGuaranteedPlusFlg(CDef.GuaranteedPlusFlg cdef) {
        setGuaranteedPlusFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of residentialPickupFlg as the classification of ResidentialPickupFlg. <br>
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg} <br>
     * Residential Pickup フラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ResidentialPickupFlg getResidentialPickupFlgAsResidentialPickupFlg() {
        return CDef.ResidentialPickupFlg.codeOf(getResidentialPickupFlg());
    }

    /**
     * Set the value of residentialPickupFlg as the classification of ResidentialPickupFlg. <br>
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg} <br>
     * Residential Pickup フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setResidentialPickupFlgAsResidentialPickupFlg(CDef.ResidentialPickupFlg cdef) {
        setResidentialPickupFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of doNotStackStackFlg as the classification of DoNotStackStackFlg. <br>
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg} <br>
     * Do Not Stack Pallets フラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DoNotStackStackFlg getDoNotStackStackFlgAsDoNotStackStackFlg() {
        return CDef.DoNotStackStackFlg.codeOf(getDoNotStackStackFlg());
    }

    /**
     * Set the value of doNotStackStackFlg as the classification of DoNotStackStackFlg. <br>
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg} <br>
     * Do Not Stack Pallets フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDoNotStackStackFlgAsDoNotStackStackFlg(CDef.DoNotStackStackFlg cdef) {
        setDoNotStackStackFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of limitedAccessDeliveryFlg as the classification of LimitedAccessDeliveryFlg. <br>
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg} <br>
     * Limited Access Delivery フラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LimitedAccessDeliveryFlg getLimitedAccessDeliveryFlgAsLimitedAccessDeliveryFlg() {
        return CDef.LimitedAccessDeliveryFlg.codeOf(getLimitedAccessDeliveryFlg());
    }

    /**
     * Set the value of limitedAccessDeliveryFlg as the classification of LimitedAccessDeliveryFlg. <br>
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg} <br>
     * Limited Access Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLimitedAccessDeliveryFlgAsLimitedAccessDeliveryFlg(CDef.LimitedAccessDeliveryFlg cdef) {
        setLimitedAccessDeliveryFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of limitedAccessPickupFlg as the classification of LimitedAccessPickupFlg. <br>
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg} <br>
     * Limited Access Pickup フラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LimitedAccessPickupFlg getLimitedAccessPickupFlgAsLimitedAccessPickupFlg() {
        return CDef.LimitedAccessPickupFlg.codeOf(getLimitedAccessPickupFlg());
    }

    /**
     * Set the value of limitedAccessPickupFlg as the classification of LimitedAccessPickupFlg. <br>
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg} <br>
     * Limited Access Pickup フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLimitedAccessPickupFlgAsLimitedAccessPickupFlg(CDef.LimitedAccessPickupFlg cdef) {
        setLimitedAccessPickupFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of overSizedFlg as the classification of OverSizedFlg. <br>
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg} <br>
     * Over-Sized/Extreme Length フラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.OverSizedFlg getOverSizedFlgAsOverSizedFlg() {
        return CDef.OverSizedFlg.codeOf(getOverSizedFlg());
    }

    /**
     * Set the value of overSizedFlg as the classification of OverSizedFlg. <br>
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg} <br>
     * Over-Sized/Extreme Length フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setOverSizedFlgAsOverSizedFlg(CDef.OverSizedFlg cdef) {
        setOverSizedFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of poisonFlg as the classification of PoisonFlg. <br>
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg} <br>
     * Poison フラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PoisonFlg getPoisonFlgAsPoisonFlg() {
        return CDef.PoisonFlg.codeOf(getPoisonFlg());
    }

    /**
     * Set the value of poisonFlg as the classification of PoisonFlg. <br>
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg} <br>
     * Poison フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPoisonFlgAsPoisonFlg(CDef.PoisonFlg cdef) {
        setPoisonFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of foogFlg as the classification of FoogFlg. <br>
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg} <br>
     * Food フラグCD
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.FoogFlg getFoogFlgAsFoogFlg() {
        return CDef.FoogFlg.codeOf(getFoogFlg());
    }

    /**
     * Set the value of foogFlg as the classification of FoogFlg. <br>
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg} <br>
     * Food フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setFoogFlgAsFoogFlg(CDef.FoogFlg cdef) {
        setFoogFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of liftgateDeliveryPrepaidFlg as the classification of LiftgateDeliveryPrepaidFlg. <br>
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg} <br>
     * Liftgate at delivery フラグCD (Prepaid)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LiftgateDeliveryPrepaidFlg getLiftgateDeliveryPrepaidFlgAsLiftgateDeliveryPrepaidFlg() {
        return CDef.LiftgateDeliveryPrepaidFlg.codeOf(getLiftgateDeliveryPrepaidFlg());
    }

    /**
     * Set the value of liftgateDeliveryPrepaidFlg as the classification of LiftgateDeliveryPrepaidFlg. <br>
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg} <br>
     * Liftgate at delivery フラグCD (Prepaid)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLiftgateDeliveryPrepaidFlgAsLiftgateDeliveryPrepaidFlg(CDef.LiftgateDeliveryPrepaidFlg cdef) {
        setLiftgateDeliveryPrepaidFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of liftgateDeliveryCollectFlg as the classification of LiftgateDeliveryCollectFlg. <br>
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg} <br>
     * Liftgate at delivery フラグCD (Collect)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LiftgateDeliveryCollectFlg getLiftgateDeliveryCollectFlgAsLiftgateDeliveryCollectFlg() {
        return CDef.LiftgateDeliveryCollectFlg.codeOf(getLiftgateDeliveryCollectFlg());
    }

    /**
     * Set the value of liftgateDeliveryCollectFlg as the classification of LiftgateDeliveryCollectFlg. <br>
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg} <br>
     * Liftgate at delivery フラグCD (Collect)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLiftgateDeliveryCollectFlgAsLiftgateDeliveryCollectFlg(CDef.LiftgateDeliveryCollectFlg cdef) {
        setLiftgateDeliveryCollectFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of liftgatePickupPrepaidFlg as the classification of LiftgatePickupPrepaidFlg. <br>
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg} <br>
     * Liftgate at pickup フラグCD (Prepaid)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LiftgatePickupPrepaidFlg getLiftgatePickupPrepaidFlgAsLiftgatePickupPrepaidFlg() {
        return CDef.LiftgatePickupPrepaidFlg.codeOf(getLiftgatePickupPrepaidFlg());
    }

    /**
     * Set the value of liftgatePickupPrepaidFlg as the classification of LiftgatePickupPrepaidFlg. <br>
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg} <br>
     * Liftgate at pickup フラグCD (Prepaid)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLiftgatePickupPrepaidFlgAsLiftgatePickupPrepaidFlg(CDef.LiftgatePickupPrepaidFlg cdef) {
        setLiftgatePickupPrepaidFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of liftgatePickupCollectFlg as the classification of LiftgatePickupCollectFlg. <br>
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg} <br>
     * Liftgate at pickup フラグCD (Collect)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LiftgatePickupCollectFlg getLiftgatePickupCollectFlgAsLiftgatePickupCollectFlg() {
        return CDef.LiftgatePickupCollectFlg.codeOf(getLiftgatePickupCollectFlg());
    }

    /**
     * Set the value of liftgatePickupCollectFlg as the classification of LiftgatePickupCollectFlg. <br>
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg} <br>
     * Liftgate at pickup フラグCD (Collect)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLiftgatePickupCollectFlgAsLiftgatePickupCollectFlg(CDef.LiftgatePickupCollectFlg cdef) {
        setLiftgatePickupCollectFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of insideDeliveryPrepaidFlg as the classification of InsideDeliveryPrepaidFlg. <br>
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg} <br>
     * Inside Delivery フラグCD (Prepaid)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InsideDeliveryPrepaidFlg getInsideDeliveryPrepaidFlgAsInsideDeliveryPrepaidFlg() {
        return CDef.InsideDeliveryPrepaidFlg.codeOf(getInsideDeliveryPrepaidFlg());
    }

    /**
     * Set the value of insideDeliveryPrepaidFlg as the classification of InsideDeliveryPrepaidFlg. <br>
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg} <br>
     * Inside Delivery フラグCD (Prepaid)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInsideDeliveryPrepaidFlgAsInsideDeliveryPrepaidFlg(CDef.InsideDeliveryPrepaidFlg cdef) {
        setInsideDeliveryPrepaidFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of insideDeliveryCollectFlg as the classification of InsideDeliveryCollectFlg. <br>
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg} <br>
     * Inside Delivery フラグCD (Collect)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InsideDeliveryCollectFlg getInsideDeliveryCollectFlgAsInsideDeliveryCollectFlg() {
        return CDef.InsideDeliveryCollectFlg.codeOf(getInsideDeliveryCollectFlg());
    }

    /**
     * Set the value of insideDeliveryCollectFlg as the classification of InsideDeliveryCollectFlg. <br>
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg} <br>
     * Inside Delivery フラグCD (Collect)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInsideDeliveryCollectFlgAsInsideDeliveryCollectFlg(CDef.InsideDeliveryCollectFlg cdef) {
        setInsideDeliveryCollectFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of insidePickupPrepaidFlg as the classification of InsidePickupPrepaidFlg. <br>
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg} <br>
     * Inside Pickup フラグCD (Prepaid)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InsidePickupPrepaidFlg getInsidePickupPrepaidFlgAsInsidePickupPrepaidFlg() {
        return CDef.InsidePickupPrepaidFlg.codeOf(getInsidePickupPrepaidFlg());
    }

    /**
     * Set the value of insidePickupPrepaidFlg as the classification of InsidePickupPrepaidFlg. <br>
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg} <br>
     * Inside Pickup フラグCD (Prepaid)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInsidePickupPrepaidFlgAsInsidePickupPrepaidFlg(CDef.InsidePickupPrepaidFlg cdef) {
        setInsidePickupPrepaidFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of insidePickupCollectFlg as the classification of InsidePickupCollectFlg. <br>
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg} <br>
     * Inside Pickup フラグCD (Collect)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InsidePickupCollectFlg getInsidePickupCollectFlgAsInsidePickupCollectFlg() {
        return CDef.InsidePickupCollectFlg.codeOf(getInsidePickupCollectFlg());
    }

    /**
     * Set the value of insidePickupCollectFlg as the classification of InsidePickupCollectFlg. <br>
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg} <br>
     * Inside Pickup フラグCD (Collect)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInsidePickupCollectFlgAsInsidePickupCollectFlg(CDef.InsidePickupCollectFlg cdef) {
        setInsidePickupCollectFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of satDeliveryFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setSatDeliveryFlg_$0() {
        setSatDeliveryFlgAsSatDeliveryFlg(CDef.SatDeliveryFlg.$0);
    }

    /**
     * Set the value of satDeliveryFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setSatDeliveryFlg_$1() {
        setSatDeliveryFlgAsSatDeliveryFlg(CDef.SatDeliveryFlg.$1);
    }

    /**
     * Set the value of residentialDeliveryFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setResidentialDeliveryFlg_$0() {
        setResidentialDeliveryFlgAsResidentialDeliveryFlg(CDef.ResidentialDeliveryFlg.$0);
    }

    /**
     * Set the value of residentialDeliveryFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setResidentialDeliveryFlg_$1() {
        setResidentialDeliveryFlgAsResidentialDeliveryFlg(CDef.ResidentialDeliveryFlg.$1);
    }

    /**
     * Set the value of codFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setCodFlg_$0() {
        setCodFlgAsCodFlg(CDef.CodFlg.$0);
    }

    /**
     * Set the value of codFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setCodFlg_$1() {
        setCodFlgAsCodFlg(CDef.CodFlg.$1);
    }

    /**
     * Set the value of signatureRequiredFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setSignatureRequiredFlg_$0() {
        setSignatureRequiredFlgAsSignatureRequiredFlg(CDef.SignatureRequiredFlg.$0);
    }

    /**
     * Set the value of signatureRequiredFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setSignatureRequiredFlg_$1() {
        setSignatureRequiredFlgAsSignatureRequiredFlg(CDef.SignatureRequiredFlg.$1);
    }

    /**
     * Set the value of signatureReleaseFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setSignatureReleaseFlg_$0() {
        setSignatureReleaseFlgAsSignatureReleaseFlg(CDef.SignatureReleaseFlg.$0);
    }

    /**
     * Set the value of signatureReleaseFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setSignatureReleaseFlg_$1() {
        setSignatureReleaseFlgAsSignatureReleaseFlg(CDef.SignatureReleaseFlg.$1);
    }

    /**
     * Set the value of callBeforeDeliveryFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setCallBeforeDeliveryFlg_$0() {
        setCallBeforeDeliveryFlgAsCallBeforeDeliveryFlg(CDef.CallBeforeDeliveryFlg.$0);
    }

    /**
     * Set the value of callBeforeDeliveryFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setCallBeforeDeliveryFlg_$1() {
        setCallBeforeDeliveryFlgAsCallBeforeDeliveryFlg(CDef.CallBeforeDeliveryFlg.$1);
    }

    /**
     * Set the value of freezableProtectionFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setFreezableProtectionFlg_$0() {
        setFreezableProtectionFlgAsFreezableProtectionFlg(CDef.FreezableProtectionFlg.$0);
    }

    /**
     * Set the value of freezableProtectionFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setFreezableProtectionFlg_$1() {
        setFreezableProtectionFlgAsFreezableProtectionFlg(CDef.FreezableProtectionFlg.$1);
    }

    /**
     * Set the value of guaranteedPlusFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setGuaranteedPlusFlg_$0() {
        setGuaranteedPlusFlgAsGuaranteedPlusFlg(CDef.GuaranteedPlusFlg.$0);
    }

    /**
     * Set the value of guaranteedPlusFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setGuaranteedPlusFlg_$1() {
        setGuaranteedPlusFlgAsGuaranteedPlusFlg(CDef.GuaranteedPlusFlg.$1);
    }

    /**
     * Set the value of residentialPickupFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setResidentialPickupFlg_$0() {
        setResidentialPickupFlgAsResidentialPickupFlg(CDef.ResidentialPickupFlg.$0);
    }

    /**
     * Set the value of residentialPickupFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setResidentialPickupFlg_$1() {
        setResidentialPickupFlgAsResidentialPickupFlg(CDef.ResidentialPickupFlg.$1);
    }

    /**
     * Set the value of doNotStackStackFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setDoNotStackStackFlg_$0() {
        setDoNotStackStackFlgAsDoNotStackStackFlg(CDef.DoNotStackStackFlg.$0);
    }

    /**
     * Set the value of doNotStackStackFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setDoNotStackStackFlg_$1() {
        setDoNotStackStackFlgAsDoNotStackStackFlg(CDef.DoNotStackStackFlg.$1);
    }

    /**
     * Set the value of limitedAccessDeliveryFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setLimitedAccessDeliveryFlg_$0() {
        setLimitedAccessDeliveryFlgAsLimitedAccessDeliveryFlg(CDef.LimitedAccessDeliveryFlg.$0);
    }

    /**
     * Set the value of limitedAccessDeliveryFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setLimitedAccessDeliveryFlg_$1() {
        setLimitedAccessDeliveryFlgAsLimitedAccessDeliveryFlg(CDef.LimitedAccessDeliveryFlg.$1);
    }

    /**
     * Set the value of limitedAccessPickupFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setLimitedAccessPickupFlg_$0() {
        setLimitedAccessPickupFlgAsLimitedAccessPickupFlg(CDef.LimitedAccessPickupFlg.$0);
    }

    /**
     * Set the value of limitedAccessPickupFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setLimitedAccessPickupFlg_$1() {
        setLimitedAccessPickupFlgAsLimitedAccessPickupFlg(CDef.LimitedAccessPickupFlg.$1);
    }

    /**
     * Set the value of overSizedFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setOverSizedFlg_$0() {
        setOverSizedFlgAsOverSizedFlg(CDef.OverSizedFlg.$0);
    }

    /**
     * Set the value of overSizedFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setOverSizedFlg_$1() {
        setOverSizedFlgAsOverSizedFlg(CDef.OverSizedFlg.$1);
    }

    /**
     * Set the value of poisonFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setPoisonFlg_$0() {
        setPoisonFlgAsPoisonFlg(CDef.PoisonFlg.$0);
    }

    /**
     * Set the value of poisonFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setPoisonFlg_$1() {
        setPoisonFlgAsPoisonFlg(CDef.PoisonFlg.$1);
    }

    /**
     * Set the value of foogFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setFoogFlg_$0() {
        setFoogFlgAsFoogFlg(CDef.FoogFlg.$0);
    }

    /**
     * Set the value of foogFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setFoogFlg_$1() {
        setFoogFlgAsFoogFlg(CDef.FoogFlg.$1);
    }

    /**
     * Set the value of liftgateDeliveryPrepaidFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setLiftgateDeliveryPrepaidFlg_$0() {
        setLiftgateDeliveryPrepaidFlgAsLiftgateDeliveryPrepaidFlg(CDef.LiftgateDeliveryPrepaidFlg.$0);
    }

    /**
     * Set the value of liftgateDeliveryPrepaidFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setLiftgateDeliveryPrepaidFlg_$1() {
        setLiftgateDeliveryPrepaidFlgAsLiftgateDeliveryPrepaidFlg(CDef.LiftgateDeliveryPrepaidFlg.$1);
    }

    /**
     * Set the value of liftgateDeliveryCollectFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setLiftgateDeliveryCollectFlg_$0() {
        setLiftgateDeliveryCollectFlgAsLiftgateDeliveryCollectFlg(CDef.LiftgateDeliveryCollectFlg.$0);
    }

    /**
     * Set the value of liftgateDeliveryCollectFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setLiftgateDeliveryCollectFlg_$1() {
        setLiftgateDeliveryCollectFlgAsLiftgateDeliveryCollectFlg(CDef.LiftgateDeliveryCollectFlg.$1);
    }

    /**
     * Set the value of liftgatePickupPrepaidFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setLiftgatePickupPrepaidFlg_$0() {
        setLiftgatePickupPrepaidFlgAsLiftgatePickupPrepaidFlg(CDef.LiftgatePickupPrepaidFlg.$0);
    }

    /**
     * Set the value of liftgatePickupPrepaidFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setLiftgatePickupPrepaidFlg_$1() {
        setLiftgatePickupPrepaidFlgAsLiftgatePickupPrepaidFlg(CDef.LiftgatePickupPrepaidFlg.$1);
    }

    /**
     * Set the value of liftgatePickupCollectFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setLiftgatePickupCollectFlg_$0() {
        setLiftgatePickupCollectFlgAsLiftgatePickupCollectFlg(CDef.LiftgatePickupCollectFlg.$0);
    }

    /**
     * Set the value of liftgatePickupCollectFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setLiftgatePickupCollectFlg_$1() {
        setLiftgatePickupCollectFlgAsLiftgatePickupCollectFlg(CDef.LiftgatePickupCollectFlg.$1);
    }

    /**
     * Set the value of insideDeliveryPrepaidFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setInsideDeliveryPrepaidFlg_$0() {
        setInsideDeliveryPrepaidFlgAsInsideDeliveryPrepaidFlg(CDef.InsideDeliveryPrepaidFlg.$0);
    }

    /**
     * Set the value of insideDeliveryPrepaidFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setInsideDeliveryPrepaidFlg_$1() {
        setInsideDeliveryPrepaidFlgAsInsideDeliveryPrepaidFlg(CDef.InsideDeliveryPrepaidFlg.$1);
    }

    /**
     * Set the value of insideDeliveryCollectFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setInsideDeliveryCollectFlg_$0() {
        setInsideDeliveryCollectFlgAsInsideDeliveryCollectFlg(CDef.InsideDeliveryCollectFlg.$0);
    }

    /**
     * Set the value of insideDeliveryCollectFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setInsideDeliveryCollectFlg_$1() {
        setInsideDeliveryCollectFlgAsInsideDeliveryCollectFlg(CDef.InsideDeliveryCollectFlg.$1);
    }

    /**
     * Set the value of insidePickupPrepaidFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setInsidePickupPrepaidFlg_$0() {
        setInsidePickupPrepaidFlgAsInsidePickupPrepaidFlg(CDef.InsidePickupPrepaidFlg.$0);
    }

    /**
     * Set the value of insidePickupPrepaidFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setInsidePickupPrepaidFlg_$1() {
        setInsidePickupPrepaidFlgAsInsidePickupPrepaidFlg(CDef.InsidePickupPrepaidFlg.$1);
    }

    /**
     * Set the value of insidePickupCollectFlg as $0 (0). <br>
     * $0: Disable
     */
    public void setInsidePickupCollectFlg_$0() {
        setInsidePickupCollectFlgAsInsidePickupCollectFlg(CDef.InsidePickupCollectFlg.$0);
    }

    /**
     * Set the value of insidePickupCollectFlg as $1 (1). <br>
     * $1: Enable
     */
    public void setInsidePickupCollectFlg_$1() {
        setInsidePickupCollectFlgAsInsidePickupCollectFlg(CDef.InsidePickupCollectFlg.$1);
    }

    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of satDeliveryFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSatDeliveryFlg$0() {
        CDef.SatDeliveryFlg cdef = getSatDeliveryFlgAsSatDeliveryFlg();
        return cdef != null ? cdef.equals(CDef.SatDeliveryFlg.$0) : false;
    }

    /**
     * Is the value of satDeliveryFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSatDeliveryFlg$1() {
        CDef.SatDeliveryFlg cdef = getSatDeliveryFlgAsSatDeliveryFlg();
        return cdef != null ? cdef.equals(CDef.SatDeliveryFlg.$1) : false;
    }

    /**
     * Is the value of residentialDeliveryFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isResidentialDeliveryFlg$0() {
        CDef.ResidentialDeliveryFlg cdef = getResidentialDeliveryFlgAsResidentialDeliveryFlg();
        return cdef != null ? cdef.equals(CDef.ResidentialDeliveryFlg.$0) : false;
    }

    /**
     * Is the value of residentialDeliveryFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isResidentialDeliveryFlg$1() {
        CDef.ResidentialDeliveryFlg cdef = getResidentialDeliveryFlgAsResidentialDeliveryFlg();
        return cdef != null ? cdef.equals(CDef.ResidentialDeliveryFlg.$1) : false;
    }

    /**
     * Is the value of codFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCodFlg$0() {
        CDef.CodFlg cdef = getCodFlgAsCodFlg();
        return cdef != null ? cdef.equals(CDef.CodFlg.$0) : false;
    }

    /**
     * Is the value of codFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCodFlg$1() {
        CDef.CodFlg cdef = getCodFlgAsCodFlg();
        return cdef != null ? cdef.equals(CDef.CodFlg.$1) : false;
    }

    /**
     * Is the value of signatureRequiredFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSignatureRequiredFlg$0() {
        CDef.SignatureRequiredFlg cdef = getSignatureRequiredFlgAsSignatureRequiredFlg();
        return cdef != null ? cdef.equals(CDef.SignatureRequiredFlg.$0) : false;
    }

    /**
     * Is the value of signatureRequiredFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSignatureRequiredFlg$1() {
        CDef.SignatureRequiredFlg cdef = getSignatureRequiredFlgAsSignatureRequiredFlg();
        return cdef != null ? cdef.equals(CDef.SignatureRequiredFlg.$1) : false;
    }

    /**
     * Is the value of signatureReleaseFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSignatureReleaseFlg$0() {
        CDef.SignatureReleaseFlg cdef = getSignatureReleaseFlgAsSignatureReleaseFlg();
        return cdef != null ? cdef.equals(CDef.SignatureReleaseFlg.$0) : false;
    }

    /**
     * Is the value of signatureReleaseFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSignatureReleaseFlg$1() {
        CDef.SignatureReleaseFlg cdef = getSignatureReleaseFlgAsSignatureReleaseFlg();
        return cdef != null ? cdef.equals(CDef.SignatureReleaseFlg.$1) : false;
    }

    /**
     * Is the value of callBeforeDeliveryFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCallBeforeDeliveryFlg$0() {
        CDef.CallBeforeDeliveryFlg cdef = getCallBeforeDeliveryFlgAsCallBeforeDeliveryFlg();
        return cdef != null ? cdef.equals(CDef.CallBeforeDeliveryFlg.$0) : false;
    }

    /**
     * Is the value of callBeforeDeliveryFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCallBeforeDeliveryFlg$1() {
        CDef.CallBeforeDeliveryFlg cdef = getCallBeforeDeliveryFlgAsCallBeforeDeliveryFlg();
        return cdef != null ? cdef.equals(CDef.CallBeforeDeliveryFlg.$1) : false;
    }

    /**
     * Is the value of freezableProtectionFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreezableProtectionFlg$0() {
        CDef.FreezableProtectionFlg cdef = getFreezableProtectionFlgAsFreezableProtectionFlg();
        return cdef != null ? cdef.equals(CDef.FreezableProtectionFlg.$0) : false;
    }

    /**
     * Is the value of freezableProtectionFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFreezableProtectionFlg$1() {
        CDef.FreezableProtectionFlg cdef = getFreezableProtectionFlgAsFreezableProtectionFlg();
        return cdef != null ? cdef.equals(CDef.FreezableProtectionFlg.$1) : false;
    }

    /**
     * Is the value of guaranteedPlusFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGuaranteedPlusFlg$0() {
        CDef.GuaranteedPlusFlg cdef = getGuaranteedPlusFlgAsGuaranteedPlusFlg();
        return cdef != null ? cdef.equals(CDef.GuaranteedPlusFlg.$0) : false;
    }

    /**
     * Is the value of guaranteedPlusFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGuaranteedPlusFlg$1() {
        CDef.GuaranteedPlusFlg cdef = getGuaranteedPlusFlgAsGuaranteedPlusFlg();
        return cdef != null ? cdef.equals(CDef.GuaranteedPlusFlg.$1) : false;
    }

    /**
     * Is the value of residentialPickupFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isResidentialPickupFlg$0() {
        CDef.ResidentialPickupFlg cdef = getResidentialPickupFlgAsResidentialPickupFlg();
        return cdef != null ? cdef.equals(CDef.ResidentialPickupFlg.$0) : false;
    }

    /**
     * Is the value of residentialPickupFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isResidentialPickupFlg$1() {
        CDef.ResidentialPickupFlg cdef = getResidentialPickupFlgAsResidentialPickupFlg();
        return cdef != null ? cdef.equals(CDef.ResidentialPickupFlg.$1) : false;
    }

    /**
     * Is the value of doNotStackStackFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDoNotStackStackFlg$0() {
        CDef.DoNotStackStackFlg cdef = getDoNotStackStackFlgAsDoNotStackStackFlg();
        return cdef != null ? cdef.equals(CDef.DoNotStackStackFlg.$0) : false;
    }

    /**
     * Is the value of doNotStackStackFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDoNotStackStackFlg$1() {
        CDef.DoNotStackStackFlg cdef = getDoNotStackStackFlgAsDoNotStackStackFlg();
        return cdef != null ? cdef.equals(CDef.DoNotStackStackFlg.$1) : false;
    }

    /**
     * Is the value of limitedAccessDeliveryFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitedAccessDeliveryFlg$0() {
        CDef.LimitedAccessDeliveryFlg cdef = getLimitedAccessDeliveryFlgAsLimitedAccessDeliveryFlg();
        return cdef != null ? cdef.equals(CDef.LimitedAccessDeliveryFlg.$0) : false;
    }

    /**
     * Is the value of limitedAccessDeliveryFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitedAccessDeliveryFlg$1() {
        CDef.LimitedAccessDeliveryFlg cdef = getLimitedAccessDeliveryFlgAsLimitedAccessDeliveryFlg();
        return cdef != null ? cdef.equals(CDef.LimitedAccessDeliveryFlg.$1) : false;
    }

    /**
     * Is the value of limitedAccessPickupFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitedAccessPickupFlg$0() {
        CDef.LimitedAccessPickupFlg cdef = getLimitedAccessPickupFlgAsLimitedAccessPickupFlg();
        return cdef != null ? cdef.equals(CDef.LimitedAccessPickupFlg.$0) : false;
    }

    /**
     * Is the value of limitedAccessPickupFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitedAccessPickupFlg$1() {
        CDef.LimitedAccessPickupFlg cdef = getLimitedAccessPickupFlgAsLimitedAccessPickupFlg();
        return cdef != null ? cdef.equals(CDef.LimitedAccessPickupFlg.$1) : false;
    }

    /**
     * Is the value of overSizedFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOverSizedFlg$0() {
        CDef.OverSizedFlg cdef = getOverSizedFlgAsOverSizedFlg();
        return cdef != null ? cdef.equals(CDef.OverSizedFlg.$0) : false;
    }

    /**
     * Is the value of overSizedFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOverSizedFlg$1() {
        CDef.OverSizedFlg cdef = getOverSizedFlgAsOverSizedFlg();
        return cdef != null ? cdef.equals(CDef.OverSizedFlg.$1) : false;
    }

    /**
     * Is the value of poisonFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPoisonFlg$0() {
        CDef.PoisonFlg cdef = getPoisonFlgAsPoisonFlg();
        return cdef != null ? cdef.equals(CDef.PoisonFlg.$0) : false;
    }

    /**
     * Is the value of poisonFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPoisonFlg$1() {
        CDef.PoisonFlg cdef = getPoisonFlgAsPoisonFlg();
        return cdef != null ? cdef.equals(CDef.PoisonFlg.$1) : false;
    }

    /**
     * Is the value of foogFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFoogFlg$0() {
        CDef.FoogFlg cdef = getFoogFlgAsFoogFlg();
        return cdef != null ? cdef.equals(CDef.FoogFlg.$0) : false;
    }

    /**
     * Is the value of foogFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFoogFlg$1() {
        CDef.FoogFlg cdef = getFoogFlgAsFoogFlg();
        return cdef != null ? cdef.equals(CDef.FoogFlg.$1) : false;
    }

    /**
     * Is the value of liftgateDeliveryPrepaidFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLiftgateDeliveryPrepaidFlg$0() {
        CDef.LiftgateDeliveryPrepaidFlg cdef = getLiftgateDeliveryPrepaidFlgAsLiftgateDeliveryPrepaidFlg();
        return cdef != null ? cdef.equals(CDef.LiftgateDeliveryPrepaidFlg.$0) : false;
    }

    /**
     * Is the value of liftgateDeliveryPrepaidFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLiftgateDeliveryPrepaidFlg$1() {
        CDef.LiftgateDeliveryPrepaidFlg cdef = getLiftgateDeliveryPrepaidFlgAsLiftgateDeliveryPrepaidFlg();
        return cdef != null ? cdef.equals(CDef.LiftgateDeliveryPrepaidFlg.$1) : false;
    }

    /**
     * Is the value of liftgateDeliveryCollectFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLiftgateDeliveryCollectFlg$0() {
        CDef.LiftgateDeliveryCollectFlg cdef = getLiftgateDeliveryCollectFlgAsLiftgateDeliveryCollectFlg();
        return cdef != null ? cdef.equals(CDef.LiftgateDeliveryCollectFlg.$0) : false;
    }

    /**
     * Is the value of liftgateDeliveryCollectFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLiftgateDeliveryCollectFlg$1() {
        CDef.LiftgateDeliveryCollectFlg cdef = getLiftgateDeliveryCollectFlgAsLiftgateDeliveryCollectFlg();
        return cdef != null ? cdef.equals(CDef.LiftgateDeliveryCollectFlg.$1) : false;
    }

    /**
     * Is the value of liftgatePickupPrepaidFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLiftgatePickupPrepaidFlg$0() {
        CDef.LiftgatePickupPrepaidFlg cdef = getLiftgatePickupPrepaidFlgAsLiftgatePickupPrepaidFlg();
        return cdef != null ? cdef.equals(CDef.LiftgatePickupPrepaidFlg.$0) : false;
    }

    /**
     * Is the value of liftgatePickupPrepaidFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLiftgatePickupPrepaidFlg$1() {
        CDef.LiftgatePickupPrepaidFlg cdef = getLiftgatePickupPrepaidFlgAsLiftgatePickupPrepaidFlg();
        return cdef != null ? cdef.equals(CDef.LiftgatePickupPrepaidFlg.$1) : false;
    }

    /**
     * Is the value of liftgatePickupCollectFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLiftgatePickupCollectFlg$0() {
        CDef.LiftgatePickupCollectFlg cdef = getLiftgatePickupCollectFlgAsLiftgatePickupCollectFlg();
        return cdef != null ? cdef.equals(CDef.LiftgatePickupCollectFlg.$0) : false;
    }

    /**
     * Is the value of liftgatePickupCollectFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLiftgatePickupCollectFlg$1() {
        CDef.LiftgatePickupCollectFlg cdef = getLiftgatePickupCollectFlgAsLiftgatePickupCollectFlg();
        return cdef != null ? cdef.equals(CDef.LiftgatePickupCollectFlg.$1) : false;
    }

    /**
     * Is the value of insideDeliveryPrepaidFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInsideDeliveryPrepaidFlg$0() {
        CDef.InsideDeliveryPrepaidFlg cdef = getInsideDeliveryPrepaidFlgAsInsideDeliveryPrepaidFlg();
        return cdef != null ? cdef.equals(CDef.InsideDeliveryPrepaidFlg.$0) : false;
    }

    /**
     * Is the value of insideDeliveryPrepaidFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInsideDeliveryPrepaidFlg$1() {
        CDef.InsideDeliveryPrepaidFlg cdef = getInsideDeliveryPrepaidFlgAsInsideDeliveryPrepaidFlg();
        return cdef != null ? cdef.equals(CDef.InsideDeliveryPrepaidFlg.$1) : false;
    }

    /**
     * Is the value of insideDeliveryCollectFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInsideDeliveryCollectFlg$0() {
        CDef.InsideDeliveryCollectFlg cdef = getInsideDeliveryCollectFlgAsInsideDeliveryCollectFlg();
        return cdef != null ? cdef.equals(CDef.InsideDeliveryCollectFlg.$0) : false;
    }

    /**
     * Is the value of insideDeliveryCollectFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInsideDeliveryCollectFlg$1() {
        CDef.InsideDeliveryCollectFlg cdef = getInsideDeliveryCollectFlgAsInsideDeliveryCollectFlg();
        return cdef != null ? cdef.equals(CDef.InsideDeliveryCollectFlg.$1) : false;
    }

    /**
     * Is the value of insidePickupPrepaidFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInsidePickupPrepaidFlg$0() {
        CDef.InsidePickupPrepaidFlg cdef = getInsidePickupPrepaidFlgAsInsidePickupPrepaidFlg();
        return cdef != null ? cdef.equals(CDef.InsidePickupPrepaidFlg.$0) : false;
    }

    /**
     * Is the value of insidePickupPrepaidFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInsidePickupPrepaidFlg$1() {
        CDef.InsidePickupPrepaidFlg cdef = getInsidePickupPrepaidFlgAsInsidePickupPrepaidFlg();
        return cdef != null ? cdef.equals(CDef.InsidePickupPrepaidFlg.$1) : false;
    }

    /**
     * Is the value of insidePickupCollectFlg $0? <br>
     * $0: Disable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInsidePickupCollectFlg$0() {
        CDef.InsidePickupCollectFlg cdef = getInsidePickupCollectFlgAsInsidePickupCollectFlg();
        return cdef != null ? cdef.equals(CDef.InsidePickupCollectFlg.$0) : false;
    }

    /**
     * Is the value of insidePickupCollectFlg $1? <br>
     * $1: Enable
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInsidePickupCollectFlg$1() {
        CDef.InsidePickupCollectFlg cdef = getInsidePickupCollectFlgAsInsidePickupCollectFlg();
        return cdef != null ? cdef.equals(CDef.InsidePickupCollectFlg.$1) : false;
    }

    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'satDeliveryFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSatDeliveryFlgName() {
        CDef.SatDeliveryFlg cdef = getSatDeliveryFlgAsSatDeliveryFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'residentialDeliveryFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getResidentialDeliveryFlgName() {
        CDef.ResidentialDeliveryFlg cdef = getResidentialDeliveryFlgAsResidentialDeliveryFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'codFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCodFlgName() {
        CDef.CodFlg cdef = getCodFlgAsCodFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'signatureRequiredFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSignatureRequiredFlgName() {
        CDef.SignatureRequiredFlg cdef = getSignatureRequiredFlgAsSignatureRequiredFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'signatureReleaseFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSignatureReleaseFlgName() {
        CDef.SignatureReleaseFlg cdef = getSignatureReleaseFlgAsSignatureReleaseFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'callBeforeDeliveryFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCallBeforeDeliveryFlgName() {
        CDef.CallBeforeDeliveryFlg cdef = getCallBeforeDeliveryFlgAsCallBeforeDeliveryFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'freezableProtectionFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getFreezableProtectionFlgName() {
        CDef.FreezableProtectionFlg cdef = getFreezableProtectionFlgAsFreezableProtectionFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'guaranteedPlusFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getGuaranteedPlusFlgName() {
        CDef.GuaranteedPlusFlg cdef = getGuaranteedPlusFlgAsGuaranteedPlusFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'residentialPickupFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getResidentialPickupFlgName() {
        CDef.ResidentialPickupFlg cdef = getResidentialPickupFlgAsResidentialPickupFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'doNotStackStackFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDoNotStackStackFlgName() {
        CDef.DoNotStackStackFlg cdef = getDoNotStackStackFlgAsDoNotStackStackFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'limitedAccessDeliveryFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLimitedAccessDeliveryFlgName() {
        CDef.LimitedAccessDeliveryFlg cdef = getLimitedAccessDeliveryFlgAsLimitedAccessDeliveryFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'limitedAccessPickupFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLimitedAccessPickupFlgName() {
        CDef.LimitedAccessPickupFlg cdef = getLimitedAccessPickupFlgAsLimitedAccessPickupFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'overSizedFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getOverSizedFlgName() {
        CDef.OverSizedFlg cdef = getOverSizedFlgAsOverSizedFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'poisonFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPoisonFlgName() {
        CDef.PoisonFlg cdef = getPoisonFlgAsPoisonFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'foogFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getFoogFlgName() {
        CDef.FoogFlg cdef = getFoogFlgAsFoogFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'liftgateDeliveryPrepaidFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLiftgateDeliveryPrepaidFlgName() {
        CDef.LiftgateDeliveryPrepaidFlg cdef = getLiftgateDeliveryPrepaidFlgAsLiftgateDeliveryPrepaidFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'liftgateDeliveryCollectFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLiftgateDeliveryCollectFlgName() {
        CDef.LiftgateDeliveryCollectFlg cdef = getLiftgateDeliveryCollectFlgAsLiftgateDeliveryCollectFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'liftgatePickupPrepaidFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLiftgatePickupPrepaidFlgName() {
        CDef.LiftgatePickupPrepaidFlg cdef = getLiftgatePickupPrepaidFlgAsLiftgatePickupPrepaidFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'liftgatePickupCollectFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLiftgatePickupCollectFlgName() {
        CDef.LiftgatePickupCollectFlg cdef = getLiftgatePickupCollectFlgAsLiftgatePickupCollectFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'insideDeliveryPrepaidFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInsideDeliveryPrepaidFlgName() {
        CDef.InsideDeliveryPrepaidFlg cdef = getInsideDeliveryPrepaidFlgAsInsideDeliveryPrepaidFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'insideDeliveryCollectFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInsideDeliveryCollectFlgName() {
        CDef.InsideDeliveryCollectFlg cdef = getInsideDeliveryCollectFlgAsInsideDeliveryCollectFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'insidePickupPrepaidFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInsidePickupPrepaidFlgName() {
        CDef.InsidePickupPrepaidFlg cdef = getInsidePickupPrepaidFlgAsInsidePickupPrepaidFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'insidePickupCollectFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInsidePickupCollectFlgName() {
        CDef.InsidePickupCollectFlg cdef = getInsidePickupCollectFlgAsInsidePickupCollectFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'. */
    protected MCustomer _mCustomer;

    /**
     * [get] M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'. <br>
     * @return The entity of foreign property 'MCustomer'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomer() {
        return _mCustomer;
    }

    /**
     * [set] M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @param mCustomer The entity of foreign property 'MCustomer'. (NullAllowed)
     */
    public void setMCustomer(MCustomer mCustomer) {
        _mCustomer = mCustomer;
    }

    /** B_CLASS_DTL by my SAT_DELIVERY_FLG, named 'BClassDtlBySatDeliveryFlg'. */
    protected BClassDtl _bClassDtlBySatDeliveryFlg;

    /**
     * [get] B_CLASS_DTL by my SAT_DELIVERY_FLG, named 'BClassDtlBySatDeliveryFlg'. <br>
     * @return The entity of foreign property 'BClassDtlBySatDeliveryFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySatDeliveryFlg() {
        return _bClassDtlBySatDeliveryFlg;
    }

    /**
     * [set] B_CLASS_DTL by my SAT_DELIVERY_FLG, named 'BClassDtlBySatDeliveryFlg'.
     * @param bClassDtlBySatDeliveryFlg The entity of foreign property 'BClassDtlBySatDeliveryFlg'. (NullAllowed)
     */
    public void setBClassDtlBySatDeliveryFlg(BClassDtl bClassDtlBySatDeliveryFlg) {
        _bClassDtlBySatDeliveryFlg = bClassDtlBySatDeliveryFlg;
    }

    /** B_CLASS_DTL by my RESIDENTIAL_DELIVERY_FLG, named 'BClassDtlByResidentialDeliveryFlg'. */
    protected BClassDtl _bClassDtlByResidentialDeliveryFlg;

    /**
     * [get] B_CLASS_DTL by my RESIDENTIAL_DELIVERY_FLG, named 'BClassDtlByResidentialDeliveryFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByResidentialDeliveryFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByResidentialDeliveryFlg() {
        return _bClassDtlByResidentialDeliveryFlg;
    }

    /**
     * [set] B_CLASS_DTL by my RESIDENTIAL_DELIVERY_FLG, named 'BClassDtlByResidentialDeliveryFlg'.
     * @param bClassDtlByResidentialDeliveryFlg The entity of foreign property 'BClassDtlByResidentialDeliveryFlg'. (NullAllowed)
     */
    public void setBClassDtlByResidentialDeliveryFlg(BClassDtl bClassDtlByResidentialDeliveryFlg) {
        _bClassDtlByResidentialDeliveryFlg = bClassDtlByResidentialDeliveryFlg;
    }

    /** B_CLASS_DTL by my COD_FLG, named 'BClassDtlByCodFlg'. */
    protected BClassDtl _bClassDtlByCodFlg;

    /**
     * [get] B_CLASS_DTL by my COD_FLG, named 'BClassDtlByCodFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByCodFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCodFlg() {
        return _bClassDtlByCodFlg;
    }

    /**
     * [set] B_CLASS_DTL by my COD_FLG, named 'BClassDtlByCodFlg'.
     * @param bClassDtlByCodFlg The entity of foreign property 'BClassDtlByCodFlg'. (NullAllowed)
     */
    public void setBClassDtlByCodFlg(BClassDtl bClassDtlByCodFlg) {
        _bClassDtlByCodFlg = bClassDtlByCodFlg;
    }

    /** B_CLASS_DTL by my SIGNATURE_REQUIRED_FLG, named 'BClassDtlBySignatureRequiredFlg'. */
    protected BClassDtl _bClassDtlBySignatureRequiredFlg;

    /**
     * [get] B_CLASS_DTL by my SIGNATURE_REQUIRED_FLG, named 'BClassDtlBySignatureRequiredFlg'. <br>
     * @return The entity of foreign property 'BClassDtlBySignatureRequiredFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySignatureRequiredFlg() {
        return _bClassDtlBySignatureRequiredFlg;
    }

    /**
     * [set] B_CLASS_DTL by my SIGNATURE_REQUIRED_FLG, named 'BClassDtlBySignatureRequiredFlg'.
     * @param bClassDtlBySignatureRequiredFlg The entity of foreign property 'BClassDtlBySignatureRequiredFlg'. (NullAllowed)
     */
    public void setBClassDtlBySignatureRequiredFlg(BClassDtl bClassDtlBySignatureRequiredFlg) {
        _bClassDtlBySignatureRequiredFlg = bClassDtlBySignatureRequiredFlg;
    }

    /** B_CLASS_DTL by my SIGNATURE_RELEASE_FLG, named 'BClassDtlBySignatureReleaseFlg'. */
    protected BClassDtl _bClassDtlBySignatureReleaseFlg;

    /**
     * [get] B_CLASS_DTL by my SIGNATURE_RELEASE_FLG, named 'BClassDtlBySignatureReleaseFlg'. <br>
     * @return The entity of foreign property 'BClassDtlBySignatureReleaseFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySignatureReleaseFlg() {
        return _bClassDtlBySignatureReleaseFlg;
    }

    /**
     * [set] B_CLASS_DTL by my SIGNATURE_RELEASE_FLG, named 'BClassDtlBySignatureReleaseFlg'.
     * @param bClassDtlBySignatureReleaseFlg The entity of foreign property 'BClassDtlBySignatureReleaseFlg'. (NullAllowed)
     */
    public void setBClassDtlBySignatureReleaseFlg(BClassDtl bClassDtlBySignatureReleaseFlg) {
        _bClassDtlBySignatureReleaseFlg = bClassDtlBySignatureReleaseFlg;
    }

    /** B_CLASS_DTL by my CALL_BEFORE_DELIVERY_FLG, named 'BClassDtlByCallBeforeDeliveryFlg'. */
    protected BClassDtl _bClassDtlByCallBeforeDeliveryFlg;

    /**
     * [get] B_CLASS_DTL by my CALL_BEFORE_DELIVERY_FLG, named 'BClassDtlByCallBeforeDeliveryFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByCallBeforeDeliveryFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCallBeforeDeliveryFlg() {
        return _bClassDtlByCallBeforeDeliveryFlg;
    }

    /**
     * [set] B_CLASS_DTL by my CALL_BEFORE_DELIVERY_FLG, named 'BClassDtlByCallBeforeDeliveryFlg'.
     * @param bClassDtlByCallBeforeDeliveryFlg The entity of foreign property 'BClassDtlByCallBeforeDeliveryFlg'. (NullAllowed)
     */
    public void setBClassDtlByCallBeforeDeliveryFlg(BClassDtl bClassDtlByCallBeforeDeliveryFlg) {
        _bClassDtlByCallBeforeDeliveryFlg = bClassDtlByCallBeforeDeliveryFlg;
    }

    /** B_CLASS_DTL by my FREEZABLE_PROTECTION_FLG, named 'BClassDtlByFreezableProtectionFlg'. */
    protected BClassDtl _bClassDtlByFreezableProtectionFlg;

    /**
     * [get] B_CLASS_DTL by my FREEZABLE_PROTECTION_FLG, named 'BClassDtlByFreezableProtectionFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByFreezableProtectionFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByFreezableProtectionFlg() {
        return _bClassDtlByFreezableProtectionFlg;
    }

    /**
     * [set] B_CLASS_DTL by my FREEZABLE_PROTECTION_FLG, named 'BClassDtlByFreezableProtectionFlg'.
     * @param bClassDtlByFreezableProtectionFlg The entity of foreign property 'BClassDtlByFreezableProtectionFlg'. (NullAllowed)
     */
    public void setBClassDtlByFreezableProtectionFlg(BClassDtl bClassDtlByFreezableProtectionFlg) {
        _bClassDtlByFreezableProtectionFlg = bClassDtlByFreezableProtectionFlg;
    }

    /** B_CLASS_DTL by my GUARANTEED_PLUS_FLG, named 'BClassDtlByGuaranteedPlusFlg'. */
    protected BClassDtl _bClassDtlByGuaranteedPlusFlg;

    /**
     * [get] B_CLASS_DTL by my GUARANTEED_PLUS_FLG, named 'BClassDtlByGuaranteedPlusFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByGuaranteedPlusFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByGuaranteedPlusFlg() {
        return _bClassDtlByGuaranteedPlusFlg;
    }

    /**
     * [set] B_CLASS_DTL by my GUARANTEED_PLUS_FLG, named 'BClassDtlByGuaranteedPlusFlg'.
     * @param bClassDtlByGuaranteedPlusFlg The entity of foreign property 'BClassDtlByGuaranteedPlusFlg'. (NullAllowed)
     */
    public void setBClassDtlByGuaranteedPlusFlg(BClassDtl bClassDtlByGuaranteedPlusFlg) {
        _bClassDtlByGuaranteedPlusFlg = bClassDtlByGuaranteedPlusFlg;
    }

    /** B_CLASS_DTL by my RESIDENTIAL_PICKUP_FLG, named 'BClassDtlByResidentialPickupFlg'. */
    protected BClassDtl _bClassDtlByResidentialPickupFlg;

    /**
     * [get] B_CLASS_DTL by my RESIDENTIAL_PICKUP_FLG, named 'BClassDtlByResidentialPickupFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByResidentialPickupFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByResidentialPickupFlg() {
        return _bClassDtlByResidentialPickupFlg;
    }

    /**
     * [set] B_CLASS_DTL by my RESIDENTIAL_PICKUP_FLG, named 'BClassDtlByResidentialPickupFlg'.
     * @param bClassDtlByResidentialPickupFlg The entity of foreign property 'BClassDtlByResidentialPickupFlg'. (NullAllowed)
     */
    public void setBClassDtlByResidentialPickupFlg(BClassDtl bClassDtlByResidentialPickupFlg) {
        _bClassDtlByResidentialPickupFlg = bClassDtlByResidentialPickupFlg;
    }

    /** B_CLASS_DTL by my DO_NOT_STACK_STACK_FLG, named 'BClassDtlByDoNotStackStackFlg'. */
    protected BClassDtl _bClassDtlByDoNotStackStackFlg;

    /**
     * [get] B_CLASS_DTL by my DO_NOT_STACK_STACK_FLG, named 'BClassDtlByDoNotStackStackFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDoNotStackStackFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDoNotStackStackFlg() {
        return _bClassDtlByDoNotStackStackFlg;
    }

    /**
     * [set] B_CLASS_DTL by my DO_NOT_STACK_STACK_FLG, named 'BClassDtlByDoNotStackStackFlg'.
     * @param bClassDtlByDoNotStackStackFlg The entity of foreign property 'BClassDtlByDoNotStackStackFlg'. (NullAllowed)
     */
    public void setBClassDtlByDoNotStackStackFlg(BClassDtl bClassDtlByDoNotStackStackFlg) {
        _bClassDtlByDoNotStackStackFlg = bClassDtlByDoNotStackStackFlg;
    }

    /** B_CLASS_DTL by my LIMITED_ACCESS_DELIVERY_FLG, named 'BClassDtlByLimitedAccessDeliveryFlg'. */
    protected BClassDtl _bClassDtlByLimitedAccessDeliveryFlg;

    /**
     * [get] B_CLASS_DTL by my LIMITED_ACCESS_DELIVERY_FLG, named 'BClassDtlByLimitedAccessDeliveryFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLimitedAccessDeliveryFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLimitedAccessDeliveryFlg() {
        return _bClassDtlByLimitedAccessDeliveryFlg;
    }

    /**
     * [set] B_CLASS_DTL by my LIMITED_ACCESS_DELIVERY_FLG, named 'BClassDtlByLimitedAccessDeliveryFlg'.
     * @param bClassDtlByLimitedAccessDeliveryFlg The entity of foreign property 'BClassDtlByLimitedAccessDeliveryFlg'. (NullAllowed)
     */
    public void setBClassDtlByLimitedAccessDeliveryFlg(BClassDtl bClassDtlByLimitedAccessDeliveryFlg) {
        _bClassDtlByLimitedAccessDeliveryFlg = bClassDtlByLimitedAccessDeliveryFlg;
    }

    /** B_CLASS_DTL by my LIMITED_ACCESS_PICKUP_FLG, named 'BClassDtlByLimitedAccessPickupFlg'. */
    protected BClassDtl _bClassDtlByLimitedAccessPickupFlg;

    /**
     * [get] B_CLASS_DTL by my LIMITED_ACCESS_PICKUP_FLG, named 'BClassDtlByLimitedAccessPickupFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLimitedAccessPickupFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLimitedAccessPickupFlg() {
        return _bClassDtlByLimitedAccessPickupFlg;
    }

    /**
     * [set] B_CLASS_DTL by my LIMITED_ACCESS_PICKUP_FLG, named 'BClassDtlByLimitedAccessPickupFlg'.
     * @param bClassDtlByLimitedAccessPickupFlg The entity of foreign property 'BClassDtlByLimitedAccessPickupFlg'. (NullAllowed)
     */
    public void setBClassDtlByLimitedAccessPickupFlg(BClassDtl bClassDtlByLimitedAccessPickupFlg) {
        _bClassDtlByLimitedAccessPickupFlg = bClassDtlByLimitedAccessPickupFlg;
    }

    /** B_CLASS_DTL by my OVER_SIZED_FLG, named 'BClassDtlByOverSizedFlg'. */
    protected BClassDtl _bClassDtlByOverSizedFlg;

    /**
     * [get] B_CLASS_DTL by my OVER_SIZED_FLG, named 'BClassDtlByOverSizedFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByOverSizedFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByOverSizedFlg() {
        return _bClassDtlByOverSizedFlg;
    }

    /**
     * [set] B_CLASS_DTL by my OVER_SIZED_FLG, named 'BClassDtlByOverSizedFlg'.
     * @param bClassDtlByOverSizedFlg The entity of foreign property 'BClassDtlByOverSizedFlg'. (NullAllowed)
     */
    public void setBClassDtlByOverSizedFlg(BClassDtl bClassDtlByOverSizedFlg) {
        _bClassDtlByOverSizedFlg = bClassDtlByOverSizedFlg;
    }

    /** B_CLASS_DTL by my POISON_FLG, named 'BClassDtlByPoisonFlg'. */
    protected BClassDtl _bClassDtlByPoisonFlg;

    /**
     * [get] B_CLASS_DTL by my POISON_FLG, named 'BClassDtlByPoisonFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByPoisonFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPoisonFlg() {
        return _bClassDtlByPoisonFlg;
    }

    /**
     * [set] B_CLASS_DTL by my POISON_FLG, named 'BClassDtlByPoisonFlg'.
     * @param bClassDtlByPoisonFlg The entity of foreign property 'BClassDtlByPoisonFlg'. (NullAllowed)
     */
    public void setBClassDtlByPoisonFlg(BClassDtl bClassDtlByPoisonFlg) {
        _bClassDtlByPoisonFlg = bClassDtlByPoisonFlg;
    }

    /** B_CLASS_DTL by my FOOG_FLG, named 'BClassDtlByFoogFlg'. */
    protected BClassDtl _bClassDtlByFoogFlg;

    /**
     * [get] B_CLASS_DTL by my FOOG_FLG, named 'BClassDtlByFoogFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByFoogFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByFoogFlg() {
        return _bClassDtlByFoogFlg;
    }

    /**
     * [set] B_CLASS_DTL by my FOOG_FLG, named 'BClassDtlByFoogFlg'.
     * @param bClassDtlByFoogFlg The entity of foreign property 'BClassDtlByFoogFlg'. (NullAllowed)
     */
    public void setBClassDtlByFoogFlg(BClassDtl bClassDtlByFoogFlg) {
        _bClassDtlByFoogFlg = bClassDtlByFoogFlg;
    }

    /** B_CLASS_DTL by my LIFTGATE_DELIVERY_PREPAID_FLG, named 'BClassDtlByLiftgateDeliveryPrepaidFlg'. */
    protected BClassDtl _bClassDtlByLiftgateDeliveryPrepaidFlg;

    /**
     * [get] B_CLASS_DTL by my LIFTGATE_DELIVERY_PREPAID_FLG, named 'BClassDtlByLiftgateDeliveryPrepaidFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLiftgateDeliveryPrepaidFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLiftgateDeliveryPrepaidFlg() {
        return _bClassDtlByLiftgateDeliveryPrepaidFlg;
    }

    /**
     * [set] B_CLASS_DTL by my LIFTGATE_DELIVERY_PREPAID_FLG, named 'BClassDtlByLiftgateDeliveryPrepaidFlg'.
     * @param bClassDtlByLiftgateDeliveryPrepaidFlg The entity of foreign property 'BClassDtlByLiftgateDeliveryPrepaidFlg'. (NullAllowed)
     */
    public void setBClassDtlByLiftgateDeliveryPrepaidFlg(BClassDtl bClassDtlByLiftgateDeliveryPrepaidFlg) {
        _bClassDtlByLiftgateDeliveryPrepaidFlg = bClassDtlByLiftgateDeliveryPrepaidFlg;
    }

    /** B_CLASS_DTL by my LIFTGATE_DELIVERY_COLLECT_FLG, named 'BClassDtlByLiftgateDeliveryCollectFlg'. */
    protected BClassDtl _bClassDtlByLiftgateDeliveryCollectFlg;

    /**
     * [get] B_CLASS_DTL by my LIFTGATE_DELIVERY_COLLECT_FLG, named 'BClassDtlByLiftgateDeliveryCollectFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLiftgateDeliveryCollectFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLiftgateDeliveryCollectFlg() {
        return _bClassDtlByLiftgateDeliveryCollectFlg;
    }

    /**
     * [set] B_CLASS_DTL by my LIFTGATE_DELIVERY_COLLECT_FLG, named 'BClassDtlByLiftgateDeliveryCollectFlg'.
     * @param bClassDtlByLiftgateDeliveryCollectFlg The entity of foreign property 'BClassDtlByLiftgateDeliveryCollectFlg'. (NullAllowed)
     */
    public void setBClassDtlByLiftgateDeliveryCollectFlg(BClassDtl bClassDtlByLiftgateDeliveryCollectFlg) {
        _bClassDtlByLiftgateDeliveryCollectFlg = bClassDtlByLiftgateDeliveryCollectFlg;
    }

    /** B_CLASS_DTL by my LIFTGATE_PICKUP_PREPAID_FLG, named 'BClassDtlByLiftgatePickupPrepaidFlg'. */
    protected BClassDtl _bClassDtlByLiftgatePickupPrepaidFlg;

    /**
     * [get] B_CLASS_DTL by my LIFTGATE_PICKUP_PREPAID_FLG, named 'BClassDtlByLiftgatePickupPrepaidFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLiftgatePickupPrepaidFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLiftgatePickupPrepaidFlg() {
        return _bClassDtlByLiftgatePickupPrepaidFlg;
    }

    /**
     * [set] B_CLASS_DTL by my LIFTGATE_PICKUP_PREPAID_FLG, named 'BClassDtlByLiftgatePickupPrepaidFlg'.
     * @param bClassDtlByLiftgatePickupPrepaidFlg The entity of foreign property 'BClassDtlByLiftgatePickupPrepaidFlg'. (NullAllowed)
     */
    public void setBClassDtlByLiftgatePickupPrepaidFlg(BClassDtl bClassDtlByLiftgatePickupPrepaidFlg) {
        _bClassDtlByLiftgatePickupPrepaidFlg = bClassDtlByLiftgatePickupPrepaidFlg;
    }

    /** B_CLASS_DTL by my LIFTGATE_PICKUP_COLLECT_FLG, named 'BClassDtlByLiftgatePickupCollectFlg'. */
    protected BClassDtl _bClassDtlByLiftgatePickupCollectFlg;

    /**
     * [get] B_CLASS_DTL by my LIFTGATE_PICKUP_COLLECT_FLG, named 'BClassDtlByLiftgatePickupCollectFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByLiftgatePickupCollectFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLiftgatePickupCollectFlg() {
        return _bClassDtlByLiftgatePickupCollectFlg;
    }

    /**
     * [set] B_CLASS_DTL by my LIFTGATE_PICKUP_COLLECT_FLG, named 'BClassDtlByLiftgatePickupCollectFlg'.
     * @param bClassDtlByLiftgatePickupCollectFlg The entity of foreign property 'BClassDtlByLiftgatePickupCollectFlg'. (NullAllowed)
     */
    public void setBClassDtlByLiftgatePickupCollectFlg(BClassDtl bClassDtlByLiftgatePickupCollectFlg) {
        _bClassDtlByLiftgatePickupCollectFlg = bClassDtlByLiftgatePickupCollectFlg;
    }

    /** B_CLASS_DTL by my INSIDE_DELIVERY_PREPAID_FLG, named 'BClassDtlByInsideDeliveryPrepaidFlg'. */
    protected BClassDtl _bClassDtlByInsideDeliveryPrepaidFlg;

    /**
     * [get] B_CLASS_DTL by my INSIDE_DELIVERY_PREPAID_FLG, named 'BClassDtlByInsideDeliveryPrepaidFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByInsideDeliveryPrepaidFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInsideDeliveryPrepaidFlg() {
        return _bClassDtlByInsideDeliveryPrepaidFlg;
    }

    /**
     * [set] B_CLASS_DTL by my INSIDE_DELIVERY_PREPAID_FLG, named 'BClassDtlByInsideDeliveryPrepaidFlg'.
     * @param bClassDtlByInsideDeliveryPrepaidFlg The entity of foreign property 'BClassDtlByInsideDeliveryPrepaidFlg'. (NullAllowed)
     */
    public void setBClassDtlByInsideDeliveryPrepaidFlg(BClassDtl bClassDtlByInsideDeliveryPrepaidFlg) {
        _bClassDtlByInsideDeliveryPrepaidFlg = bClassDtlByInsideDeliveryPrepaidFlg;
    }

    /** B_CLASS_DTL by my INSIDE_DELIVERY_COLLECT_FLG, named 'BClassDtlByInsideDeliveryCollectFlg'. */
    protected BClassDtl _bClassDtlByInsideDeliveryCollectFlg;

    /**
     * [get] B_CLASS_DTL by my INSIDE_DELIVERY_COLLECT_FLG, named 'BClassDtlByInsideDeliveryCollectFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByInsideDeliveryCollectFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInsideDeliveryCollectFlg() {
        return _bClassDtlByInsideDeliveryCollectFlg;
    }

    /**
     * [set] B_CLASS_DTL by my INSIDE_DELIVERY_COLLECT_FLG, named 'BClassDtlByInsideDeliveryCollectFlg'.
     * @param bClassDtlByInsideDeliveryCollectFlg The entity of foreign property 'BClassDtlByInsideDeliveryCollectFlg'. (NullAllowed)
     */
    public void setBClassDtlByInsideDeliveryCollectFlg(BClassDtl bClassDtlByInsideDeliveryCollectFlg) {
        _bClassDtlByInsideDeliveryCollectFlg = bClassDtlByInsideDeliveryCollectFlg;
    }

    /** B_CLASS_DTL by my INSIDE_PICKUP_PREPAID_FLG, named 'BClassDtlByInsidePickupPrepaidFlg'. */
    protected BClassDtl _bClassDtlByInsidePickupPrepaidFlg;

    /**
     * [get] B_CLASS_DTL by my INSIDE_PICKUP_PREPAID_FLG, named 'BClassDtlByInsidePickupPrepaidFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByInsidePickupPrepaidFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInsidePickupPrepaidFlg() {
        return _bClassDtlByInsidePickupPrepaidFlg;
    }

    /**
     * [set] B_CLASS_DTL by my INSIDE_PICKUP_PREPAID_FLG, named 'BClassDtlByInsidePickupPrepaidFlg'.
     * @param bClassDtlByInsidePickupPrepaidFlg The entity of foreign property 'BClassDtlByInsidePickupPrepaidFlg'. (NullAllowed)
     */
    public void setBClassDtlByInsidePickupPrepaidFlg(BClassDtl bClassDtlByInsidePickupPrepaidFlg) {
        _bClassDtlByInsidePickupPrepaidFlg = bClassDtlByInsidePickupPrepaidFlg;
    }

    /** B_CLASS_DTL by my INSIDE_PICKUP_COLLECT_FLG, named 'BClassDtlByInsidePickupCollectFlg'. */
    protected BClassDtl _bClassDtlByInsidePickupCollectFlg;

    /**
     * [get] B_CLASS_DTL by my INSIDE_PICKUP_COLLECT_FLG, named 'BClassDtlByInsidePickupCollectFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByInsidePickupCollectFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInsidePickupCollectFlg() {
        return _bClassDtlByInsidePickupCollectFlg;
    }

    /**
     * [set] B_CLASS_DTL by my INSIDE_PICKUP_COLLECT_FLG, named 'BClassDtlByInsidePickupCollectFlg'.
     * @param bClassDtlByInsidePickupCollectFlg The entity of foreign property 'BClassDtlByInsidePickupCollectFlg'. (NullAllowed)
     */
    public void setBClassDtlByInsidePickupCollectFlg(BClassDtl bClassDtlByInsidePickupCollectFlg) {
        _bClassDtlByInsidePickupCollectFlg = bClassDtlByInsidePickupCollectFlg;
    }

    /** B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. */
    protected BClassDtl _bClassDtlByDelFlg;

    /**
     * [get] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    /**
     * [set] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @param bClassDtlByDelFlg The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelFlg(BClassDtl bClassDtlByDelFlg) {
        _bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

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
        if (obj instanceof BsMCarrierSlipCes) {
            BsMCarrierSlipCes other = (BsMCarrierSlipCes)obj;
            if (!xSV(_customerId, other._customerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _customerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCustomer != null)
        { sb.append(li).append(xbRDS(_mCustomer, "mCustomer")); }
        if (_bClassDtlBySatDeliveryFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySatDeliveryFlg, "bClassDtlBySatDeliveryFlg")); }
        if (_bClassDtlByResidentialDeliveryFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByResidentialDeliveryFlg, "bClassDtlByResidentialDeliveryFlg")); }
        if (_bClassDtlByCodFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCodFlg, "bClassDtlByCodFlg")); }
        if (_bClassDtlBySignatureRequiredFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySignatureRequiredFlg, "bClassDtlBySignatureRequiredFlg")); }
        if (_bClassDtlBySignatureReleaseFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySignatureReleaseFlg, "bClassDtlBySignatureReleaseFlg")); }
        if (_bClassDtlByCallBeforeDeliveryFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCallBeforeDeliveryFlg, "bClassDtlByCallBeforeDeliveryFlg")); }
        if (_bClassDtlByFreezableProtectionFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByFreezableProtectionFlg, "bClassDtlByFreezableProtectionFlg")); }
        if (_bClassDtlByGuaranteedPlusFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByGuaranteedPlusFlg, "bClassDtlByGuaranteedPlusFlg")); }
        if (_bClassDtlByResidentialPickupFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByResidentialPickupFlg, "bClassDtlByResidentialPickupFlg")); }
        if (_bClassDtlByDoNotStackStackFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDoNotStackStackFlg, "bClassDtlByDoNotStackStackFlg")); }
        if (_bClassDtlByLimitedAccessDeliveryFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLimitedAccessDeliveryFlg, "bClassDtlByLimitedAccessDeliveryFlg")); }
        if (_bClassDtlByLimitedAccessPickupFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLimitedAccessPickupFlg, "bClassDtlByLimitedAccessPickupFlg")); }
        if (_bClassDtlByOverSizedFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByOverSizedFlg, "bClassDtlByOverSizedFlg")); }
        if (_bClassDtlByPoisonFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPoisonFlg, "bClassDtlByPoisonFlg")); }
        if (_bClassDtlByFoogFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByFoogFlg, "bClassDtlByFoogFlg")); }
        if (_bClassDtlByLiftgateDeliveryPrepaidFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLiftgateDeliveryPrepaidFlg, "bClassDtlByLiftgateDeliveryPrepaidFlg")); }
        if (_bClassDtlByLiftgateDeliveryCollectFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLiftgateDeliveryCollectFlg, "bClassDtlByLiftgateDeliveryCollectFlg")); }
        if (_bClassDtlByLiftgatePickupPrepaidFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLiftgatePickupPrepaidFlg, "bClassDtlByLiftgatePickupPrepaidFlg")); }
        if (_bClassDtlByLiftgatePickupCollectFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLiftgatePickupCollectFlg, "bClassDtlByLiftgatePickupCollectFlg")); }
        if (_bClassDtlByInsideDeliveryPrepaidFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInsideDeliveryPrepaidFlg, "bClassDtlByInsideDeliveryPrepaidFlg")); }
        if (_bClassDtlByInsideDeliveryCollectFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInsideDeliveryCollectFlg, "bClassDtlByInsideDeliveryCollectFlg")); }
        if (_bClassDtlByInsidePickupPrepaidFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInsidePickupPrepaidFlg, "bClassDtlByInsidePickupPrepaidFlg")); }
        if (_bClassDtlByInsidePickupCollectFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInsidePickupCollectFlg, "bClassDtlByInsidePickupCollectFlg")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_customerId));
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
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mCustomer != null)
        { sb.append(dm).append("mCustomer"); }
        if (_bClassDtlBySatDeliveryFlg != null)
        { sb.append(dm).append("bClassDtlBySatDeliveryFlg"); }
        if (_bClassDtlByResidentialDeliveryFlg != null)
        { sb.append(dm).append("bClassDtlByResidentialDeliveryFlg"); }
        if (_bClassDtlByCodFlg != null)
        { sb.append(dm).append("bClassDtlByCodFlg"); }
        if (_bClassDtlBySignatureRequiredFlg != null)
        { sb.append(dm).append("bClassDtlBySignatureRequiredFlg"); }
        if (_bClassDtlBySignatureReleaseFlg != null)
        { sb.append(dm).append("bClassDtlBySignatureReleaseFlg"); }
        if (_bClassDtlByCallBeforeDeliveryFlg != null)
        { sb.append(dm).append("bClassDtlByCallBeforeDeliveryFlg"); }
        if (_bClassDtlByFreezableProtectionFlg != null)
        { sb.append(dm).append("bClassDtlByFreezableProtectionFlg"); }
        if (_bClassDtlByGuaranteedPlusFlg != null)
        { sb.append(dm).append("bClassDtlByGuaranteedPlusFlg"); }
        if (_bClassDtlByResidentialPickupFlg != null)
        { sb.append(dm).append("bClassDtlByResidentialPickupFlg"); }
        if (_bClassDtlByDoNotStackStackFlg != null)
        { sb.append(dm).append("bClassDtlByDoNotStackStackFlg"); }
        if (_bClassDtlByLimitedAccessDeliveryFlg != null)
        { sb.append(dm).append("bClassDtlByLimitedAccessDeliveryFlg"); }
        if (_bClassDtlByLimitedAccessPickupFlg != null)
        { sb.append(dm).append("bClassDtlByLimitedAccessPickupFlg"); }
        if (_bClassDtlByOverSizedFlg != null)
        { sb.append(dm).append("bClassDtlByOverSizedFlg"); }
        if (_bClassDtlByPoisonFlg != null)
        { sb.append(dm).append("bClassDtlByPoisonFlg"); }
        if (_bClassDtlByFoogFlg != null)
        { sb.append(dm).append("bClassDtlByFoogFlg"); }
        if (_bClassDtlByLiftgateDeliveryPrepaidFlg != null)
        { sb.append(dm).append("bClassDtlByLiftgateDeliveryPrepaidFlg"); }
        if (_bClassDtlByLiftgateDeliveryCollectFlg != null)
        { sb.append(dm).append("bClassDtlByLiftgateDeliveryCollectFlg"); }
        if (_bClassDtlByLiftgatePickupPrepaidFlg != null)
        { sb.append(dm).append("bClassDtlByLiftgatePickupPrepaidFlg"); }
        if (_bClassDtlByLiftgatePickupCollectFlg != null)
        { sb.append(dm).append("bClassDtlByLiftgatePickupCollectFlg"); }
        if (_bClassDtlByInsideDeliveryPrepaidFlg != null)
        { sb.append(dm).append("bClassDtlByInsideDeliveryPrepaidFlg"); }
        if (_bClassDtlByInsideDeliveryCollectFlg != null)
        { sb.append(dm).append("bClassDtlByInsideDeliveryCollectFlg"); }
        if (_bClassDtlByInsidePickupPrepaidFlg != null)
        { sb.append(dm).append("bClassDtlByInsidePickupPrepaidFlg"); }
        if (_bClassDtlByInsidePickupCollectFlg != null)
        { sb.append(dm).append("bClassDtlByInsidePickupCollectFlg"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCarrierSlipCes clone() {
        return (MCarrierSlipCes)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER} <br>
     * 取引先ID
     * @return The value of the column 'CUSTOMER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCustomerId() {
        checkSpecifiedProperty("customerId");
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER} <br>
     * 取引先ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCustomerId(Long customerId) {
        registerModifiedProperty("customerId");
        _customerId = customerId;
    }

    /**
     * [get] COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)} <br>
     * Collect Account # (Bill To)
     * @return The value of the column 'COLLECT_ACCOUNT_NO_BILL_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCollectAccountNoBillTo() {
        checkSpecifiedProperty("collectAccountNoBillTo");
        return convertEmptyToNull(_collectAccountNoBillTo);
    }

    /**
     * [set] COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)} <br>
     * Collect Account # (Bill To)
     * @param collectAccountNoBillTo The value of the column 'COLLECT_ACCOUNT_NO_BILL_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCollectAccountNoBillTo(String collectAccountNoBillTo) {
        registerModifiedProperty("collectAccountNoBillTo");
        _collectAccountNoBillTo = collectAccountNoBillTo;
    }

    /**
     * [get] COLLECT_ZIP_CD_BILL_TO: {varchar(30)} <br>
     * Collect Zip Code (Bill To)
     * @return The value of the column 'COLLECT_ZIP_CD_BILL_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCollectZipCdBillTo() {
        checkSpecifiedProperty("collectZipCdBillTo");
        return convertEmptyToNull(_collectZipCdBillTo);
    }

    /**
     * [set] COLLECT_ZIP_CD_BILL_TO: {varchar(30)} <br>
     * Collect Zip Code (Bill To)
     * @param collectZipCdBillTo The value of the column 'COLLECT_ZIP_CD_BILL_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCollectZipCdBillTo(String collectZipCdBillTo) {
        registerModifiedProperty("collectZipCdBillTo");
        _collectZipCdBillTo = collectZipCdBillTo;
    }

    /**
     * [get] COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)} <br>
     * Collect Country Code (Bill To)
     * @return The value of the column 'COLLECT_COUNTRY_CD_BILL_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCollectCountryCdBillTo() {
        checkSpecifiedProperty("collectCountryCdBillTo");
        return convertEmptyToNull(_collectCountryCdBillTo);
    }

    /**
     * [set] COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)} <br>
     * Collect Country Code (Bill To)
     * @param collectCountryCdBillTo The value of the column 'COLLECT_COUNTRY_CD_BILL_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCollectCountryCdBillTo(String collectCountryCdBillTo) {
        registerModifiedProperty("collectCountryCdBillTo");
        _collectCountryCdBillTo = collectCountryCdBillTo;
    }

    /**
     * [get] PAYMENT_TERM_CD_TAXES_TO: {varchar(30)} <br>
     * Payment Term Code (Taxes to)
     * @return The value of the column 'PAYMENT_TERM_CD_TAXES_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPaymentTermCdTaxesTo() {
        checkSpecifiedProperty("paymentTermCdTaxesTo");
        return convertEmptyToNull(_paymentTermCdTaxesTo);
    }

    /**
     * [set] PAYMENT_TERM_CD_TAXES_TO: {varchar(30)} <br>
     * Payment Term Code (Taxes to)
     * @param paymentTermCdTaxesTo The value of the column 'PAYMENT_TERM_CD_TAXES_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPaymentTermCdTaxesTo(String paymentTermCdTaxesTo) {
        registerModifiedProperty("paymentTermCdTaxesTo");
        _paymentTermCdTaxesTo = paymentTermCdTaxesTo;
    }

    /**
     * [get] COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)} <br>
     * Collect Account # (Taxes to)
     * @return The value of the column 'COLLECT_ACCOUNT_NO_TAXES_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCollectAccountNoTaxesTo() {
        checkSpecifiedProperty("collectAccountNoTaxesTo");
        return convertEmptyToNull(_collectAccountNoTaxesTo);
    }

    /**
     * [set] COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)} <br>
     * Collect Account # (Taxes to)
     * @param collectAccountNoTaxesTo The value of the column 'COLLECT_ACCOUNT_NO_TAXES_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCollectAccountNoTaxesTo(String collectAccountNoTaxesTo) {
        registerModifiedProperty("collectAccountNoTaxesTo");
        _collectAccountNoTaxesTo = collectAccountNoTaxesTo;
    }

    /**
     * [get] COLLECT_ZIP_CD_TAXES_TO: {varchar(30)} <br>
     * Collect Zip Code (Taxes to)
     * @return The value of the column 'COLLECT_ZIP_CD_TAXES_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCollectZipCdTaxesTo() {
        checkSpecifiedProperty("collectZipCdTaxesTo");
        return convertEmptyToNull(_collectZipCdTaxesTo);
    }

    /**
     * [set] COLLECT_ZIP_CD_TAXES_TO: {varchar(30)} <br>
     * Collect Zip Code (Taxes to)
     * @param collectZipCdTaxesTo The value of the column 'COLLECT_ZIP_CD_TAXES_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCollectZipCdTaxesTo(String collectZipCdTaxesTo) {
        registerModifiedProperty("collectZipCdTaxesTo");
        _collectZipCdTaxesTo = collectZipCdTaxesTo;
    }

    /**
     * [get] COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)} <br>
     * Collect Country Code (Taxes To)
     * @return The value of the column 'COLLECT_COUNTRY_CD_TAXES_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCollectCountryCdTaxesTo() {
        checkSpecifiedProperty("collectCountryCdTaxesTo");
        return convertEmptyToNull(_collectCountryCdTaxesTo);
    }

    /**
     * [set] COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)} <br>
     * Collect Country Code (Taxes To)
     * @param collectCountryCdTaxesTo The value of the column 'COLLECT_COUNTRY_CD_TAXES_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCollectCountryCdTaxesTo(String collectCountryCdTaxesTo) {
        registerModifiedProperty("collectCountryCdTaxesTo");
        _collectCountryCdTaxesTo = collectCountryCdTaxesTo;
    }

    /**
     * [get] COD_PAYMENT_TERM_CD: {varchar(30)} <br>
     * COD Payment Term Code
     * @return The value of the column 'COD_PAYMENT_TERM_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCodPaymentTermCd() {
        checkSpecifiedProperty("codPaymentTermCd");
        return convertEmptyToNull(_codPaymentTermCd);
    }

    /**
     * [set] COD_PAYMENT_TERM_CD: {varchar(30)} <br>
     * COD Payment Term Code
     * @param codPaymentTermCd The value of the column 'COD_PAYMENT_TERM_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodPaymentTermCd(String codPaymentTermCd) {
        registerModifiedProperty("codPaymentTermCd");
        _codPaymentTermCd = codPaymentTermCd;
    }

    /**
     * [get] COD_AMOUNT: {decimal(16, 6)} <br>
     * COD Amount
     * @return The value of the column 'COD_AMOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCodAmount() {
        checkSpecifiedProperty("codAmount");
        return _codAmount;
    }

    /**
     * [set] COD_AMOUNT: {decimal(16, 6)} <br>
     * COD Amount
     * @param codAmount The value of the column 'COD_AMOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodAmount(java.math.BigDecimal codAmount) {
        registerModifiedProperty("codAmount");
        _codAmount = codAmount;
    }

    /**
     * [get] COD_FEE_PAYER: {varchar(30)} <br>
     * COD Fee Payer
     * @return The value of the column 'COD_FEE_PAYER'. (NullAllowed even if selected: for no constraint)
     */
    public String getCodFeePayer() {
        checkSpecifiedProperty("codFeePayer");
        return convertEmptyToNull(_codFeePayer);
    }

    /**
     * [set] COD_FEE_PAYER: {varchar(30)} <br>
     * COD Fee Payer
     * @param codFeePayer The value of the column 'COD_FEE_PAYER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodFeePayer(String codFeePayer) {
        registerModifiedProperty("codFeePayer");
        _codFeePayer = codFeePayer;
    }

    /**
     * [get] TERMS_OF_SALES: {varchar(30)} <br>
     * Terms of Sales
     * @return The value of the column 'TERMS_OF_SALES'. (NullAllowed even if selected: for no constraint)
     */
    public String getTermsOfSales() {
        checkSpecifiedProperty("termsOfSales");
        return convertEmptyToNull(_termsOfSales);
    }

    /**
     * [set] TERMS_OF_SALES: {varchar(30)} <br>
     * Terms of Sales
     * @param termsOfSales The value of the column 'TERMS_OF_SALES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTermsOfSales(String termsOfSales) {
        registerModifiedProperty("termsOfSales");
        _termsOfSales = termsOfSales;
    }

    /**
     * [get] BROKER_NAME: {varchar(255)} <br>
     * Broker Name
     * @return The value of the column 'BROKER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrokerName() {
        checkSpecifiedProperty("brokerName");
        return convertEmptyToNull(_brokerName);
    }

    /**
     * [set] BROKER_NAME: {varchar(255)} <br>
     * Broker Name
     * @param brokerName The value of the column 'BROKER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrokerName(String brokerName) {
        registerModifiedProperty("brokerName");
        _brokerName = brokerName;
    }

    /**
     * [get] BROKER_PHONE_NO: {varchar(30)} <br>
     * Broker Phone #
     * @return The value of the column 'BROKER_PHONE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrokerPhoneNo() {
        checkSpecifiedProperty("brokerPhoneNo");
        return convertEmptyToNull(_brokerPhoneNo);
    }

    /**
     * [set] BROKER_PHONE_NO: {varchar(30)} <br>
     * Broker Phone #
     * @param brokerPhoneNo The value of the column 'BROKER_PHONE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrokerPhoneNo(String brokerPhoneNo) {
        registerModifiedProperty("brokerPhoneNo");
        _brokerPhoneNo = brokerPhoneNo;
    }

    /**
     * [get] BROKER_FAX_NO: {varchar(30)} <br>
     * Broker Fax #
     * @return The value of the column 'BROKER_FAX_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrokerFaxNo() {
        checkSpecifiedProperty("brokerFaxNo");
        return convertEmptyToNull(_brokerFaxNo);
    }

    /**
     * [set] BROKER_FAX_NO: {varchar(30)} <br>
     * Broker Fax #
     * @param brokerFaxNo The value of the column 'BROKER_FAX_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrokerFaxNo(String brokerFaxNo) {
        registerModifiedProperty("brokerFaxNo");
        _brokerFaxNo = brokerFaxNo;
    }

    /**
     * [get] SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg} <br>
     * Saturday Delivery Flag
     * @return The value of the column 'SAT_DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSatDeliveryFlg() {
        checkSpecifiedProperty("satDeliveryFlg");
        return convertEmptyToNull(_satDeliveryFlg);
    }

    /**
     * [set] SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg} <br>
     * Saturday Delivery Flag
     * @param satDeliveryFlg The value of the column 'SAT_DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSatDeliveryFlg(String satDeliveryFlg) {
        registerModifiedProperty("satDeliveryFlg");
        _satDeliveryFlg = satDeliveryFlg;
    }

    /**
     * [get] RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg} <br>
     * Residential Delivery Flag
     * @return The value of the column 'RESIDENTIAL_DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getResidentialDeliveryFlg() {
        checkSpecifiedProperty("residentialDeliveryFlg");
        return convertEmptyToNull(_residentialDeliveryFlg);
    }

    /**
     * [set] RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg} <br>
     * Residential Delivery Flag
     * @param residentialDeliveryFlg The value of the column 'RESIDENTIAL_DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setResidentialDeliveryFlg(String residentialDeliveryFlg) {
        registerModifiedProperty("residentialDeliveryFlg");
        _residentialDeliveryFlg = residentialDeliveryFlg;
    }

    /**
     * [get] COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg} <br>
     * Collect on Delivery Flag
     * @return The value of the column 'COD_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCodFlg() {
        checkSpecifiedProperty("codFlg");
        return convertEmptyToNull(_codFlg);
    }

    /**
     * [set] COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg} <br>
     * Collect on Delivery Flag
     * @param codFlg The value of the column 'COD_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodFlg(String codFlg) {
        registerModifiedProperty("codFlg");
        _codFlg = codFlg;
    }

    /**
     * [get] SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg} <br>
     * Signature Required Flag
     * @return The value of the column 'SIGNATURE_REQUIRED_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSignatureRequiredFlg() {
        checkSpecifiedProperty("signatureRequiredFlg");
        return convertEmptyToNull(_signatureRequiredFlg);
    }

    /**
     * [set] SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg} <br>
     * Signature Required Flag
     * @param signatureRequiredFlg The value of the column 'SIGNATURE_REQUIRED_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSignatureRequiredFlg(String signatureRequiredFlg) {
        registerModifiedProperty("signatureRequiredFlg");
        _signatureRequiredFlg = signatureRequiredFlg;
    }

    /**
     * [get] SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg} <br>
     * Signature Release Flag
     * @return The value of the column 'SIGNATURE_RELEASE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSignatureReleaseFlg() {
        checkSpecifiedProperty("signatureReleaseFlg");
        return convertEmptyToNull(_signatureReleaseFlg);
    }

    /**
     * [set] SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg} <br>
     * Signature Release Flag
     * @param signatureReleaseFlg The value of the column 'SIGNATURE_RELEASE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSignatureReleaseFlg(String signatureReleaseFlg) {
        registerModifiedProperty("signatureReleaseFlg");
        _signatureReleaseFlg = signatureReleaseFlg;
    }

    /**
     * [get] CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg} <br>
     * Call Before Delivery Flag
     * @return The value of the column 'CALL_BEFORE_DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCallBeforeDeliveryFlg() {
        checkSpecifiedProperty("callBeforeDeliveryFlg");
        return convertEmptyToNull(_callBeforeDeliveryFlg);
    }

    /**
     * [set] CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg} <br>
     * Call Before Delivery Flag
     * @param callBeforeDeliveryFlg The value of the column 'CALL_BEFORE_DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCallBeforeDeliveryFlg(String callBeforeDeliveryFlg) {
        registerModifiedProperty("callBeforeDeliveryFlg");
        _callBeforeDeliveryFlg = callBeforeDeliveryFlg;
    }

    /**
     * [get] FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg} <br>
     * Freezable Protection Flag
     * @return The value of the column 'FREEZABLE_PROTECTION_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getFreezableProtectionFlg() {
        checkSpecifiedProperty("freezableProtectionFlg");
        return convertEmptyToNull(_freezableProtectionFlg);
    }

    /**
     * [set] FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg} <br>
     * Freezable Protection Flag
     * @param freezableProtectionFlg The value of the column 'FREEZABLE_PROTECTION_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFreezableProtectionFlg(String freezableProtectionFlg) {
        registerModifiedProperty("freezableProtectionFlg");
        _freezableProtectionFlg = freezableProtectionFlg;
    }

    /**
     * [get] GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg} <br>
     * Guaranteed Plus Flag
     * @return The value of the column 'GUARANTEED_PLUS_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getGuaranteedPlusFlg() {
        checkSpecifiedProperty("guaranteedPlusFlg");
        return convertEmptyToNull(_guaranteedPlusFlg);
    }

    /**
     * [set] GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg} <br>
     * Guaranteed Plus Flag
     * @param guaranteedPlusFlg The value of the column 'GUARANTEED_PLUS_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGuaranteedPlusFlg(String guaranteedPlusFlg) {
        registerModifiedProperty("guaranteedPlusFlg");
        _guaranteedPlusFlg = guaranteedPlusFlg;
    }

    /**
     * [get] RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg} <br>
     * Residential Pickup Flag
     * @return The value of the column 'RESIDENTIAL_PICKUP_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getResidentialPickupFlg() {
        checkSpecifiedProperty("residentialPickupFlg");
        return convertEmptyToNull(_residentialPickupFlg);
    }

    /**
     * [set] RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg} <br>
     * Residential Pickup Flag
     * @param residentialPickupFlg The value of the column 'RESIDENTIAL_PICKUP_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setResidentialPickupFlg(String residentialPickupFlg) {
        registerModifiedProperty("residentialPickupFlg");
        _residentialPickupFlg = residentialPickupFlg;
    }

    /**
     * [get] DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg} <br>
     * Do Not Stack Pallets Flag
     * @return The value of the column 'DO_NOT_STACK_STACK_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDoNotStackStackFlg() {
        checkSpecifiedProperty("doNotStackStackFlg");
        return convertEmptyToNull(_doNotStackStackFlg);
    }

    /**
     * [set] DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg} <br>
     * Do Not Stack Pallets Flag
     * @param doNotStackStackFlg The value of the column 'DO_NOT_STACK_STACK_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDoNotStackStackFlg(String doNotStackStackFlg) {
        registerModifiedProperty("doNotStackStackFlg");
        _doNotStackStackFlg = doNotStackStackFlg;
    }

    /**
     * [get] LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg} <br>
     * Limited Access Delivery Flag
     * @return The value of the column 'LIMITED_ACCESS_DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitedAccessDeliveryFlg() {
        checkSpecifiedProperty("limitedAccessDeliveryFlg");
        return convertEmptyToNull(_limitedAccessDeliveryFlg);
    }

    /**
     * [set] LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg} <br>
     * Limited Access Delivery Flag
     * @param limitedAccessDeliveryFlg The value of the column 'LIMITED_ACCESS_DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitedAccessDeliveryFlg(String limitedAccessDeliveryFlg) {
        registerModifiedProperty("limitedAccessDeliveryFlg");
        _limitedAccessDeliveryFlg = limitedAccessDeliveryFlg;
    }

    /**
     * [get] LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg} <br>
     * Limited Access Pickup Flag
     * @return The value of the column 'LIMITED_ACCESS_PICKUP_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitedAccessPickupFlg() {
        checkSpecifiedProperty("limitedAccessPickupFlg");
        return convertEmptyToNull(_limitedAccessPickupFlg);
    }

    /**
     * [set] LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg} <br>
     * Limited Access Pickup Flag
     * @param limitedAccessPickupFlg The value of the column 'LIMITED_ACCESS_PICKUP_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitedAccessPickupFlg(String limitedAccessPickupFlg) {
        registerModifiedProperty("limitedAccessPickupFlg");
        _limitedAccessPickupFlg = limitedAccessPickupFlg;
    }

    /**
     * [get] OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg} <br>
     * Over-Sized / Extreme Length Flag
     * @return The value of the column 'OVER_SIZED_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOverSizedFlg() {
        checkSpecifiedProperty("overSizedFlg");
        return convertEmptyToNull(_overSizedFlg);
    }

    /**
     * [set] OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg} <br>
     * Over-Sized / Extreme Length Flag
     * @param overSizedFlg The value of the column 'OVER_SIZED_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOverSizedFlg(String overSizedFlg) {
        registerModifiedProperty("overSizedFlg");
        _overSizedFlg = overSizedFlg;
    }

    /**
     * [get] POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg} <br>
     * Poison Flag
     * @return The value of the column 'POISON_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPoisonFlg() {
        checkSpecifiedProperty("poisonFlg");
        return convertEmptyToNull(_poisonFlg);
    }

    /**
     * [set] POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg} <br>
     * Poison Flag
     * @param poisonFlg The value of the column 'POISON_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPoisonFlg(String poisonFlg) {
        registerModifiedProperty("poisonFlg");
        _poisonFlg = poisonFlg;
    }

    /**
     * [get] FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg} <br>
     * Food Flag
     * @return The value of the column 'FOOG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoogFlg() {
        checkSpecifiedProperty("foogFlg");
        return convertEmptyToNull(_foogFlg);
    }

    /**
     * [set] FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg} <br>
     * Food Flag
     * @param foogFlg The value of the column 'FOOG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoogFlg(String foogFlg) {
        registerModifiedProperty("foogFlg");
        _foogFlg = foogFlg;
    }

    /**
     * [get] LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg} <br>
     * Liftgate at delivery Flag (Prepaid)
     * @return The value of the column 'LIFTGATE_DELIVERY_PREPAID_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLiftgateDeliveryPrepaidFlg() {
        checkSpecifiedProperty("liftgateDeliveryPrepaidFlg");
        return convertEmptyToNull(_liftgateDeliveryPrepaidFlg);
    }

    /**
     * [set] LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg} <br>
     * Liftgate at delivery Flag (Prepaid)
     * @param liftgateDeliveryPrepaidFlg The value of the column 'LIFTGATE_DELIVERY_PREPAID_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLiftgateDeliveryPrepaidFlg(String liftgateDeliveryPrepaidFlg) {
        registerModifiedProperty("liftgateDeliveryPrepaidFlg");
        _liftgateDeliveryPrepaidFlg = liftgateDeliveryPrepaidFlg;
    }

    /**
     * [get] LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg} <br>
     * Liftgate at delivery Flag (Collect)
     * @return The value of the column 'LIFTGATE_DELIVERY_COLLECT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLiftgateDeliveryCollectFlg() {
        checkSpecifiedProperty("liftgateDeliveryCollectFlg");
        return convertEmptyToNull(_liftgateDeliveryCollectFlg);
    }

    /**
     * [set] LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg} <br>
     * Liftgate at delivery Flag (Collect)
     * @param liftgateDeliveryCollectFlg The value of the column 'LIFTGATE_DELIVERY_COLLECT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLiftgateDeliveryCollectFlg(String liftgateDeliveryCollectFlg) {
        registerModifiedProperty("liftgateDeliveryCollectFlg");
        _liftgateDeliveryCollectFlg = liftgateDeliveryCollectFlg;
    }

    /**
     * [get] LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg} <br>
     * Liftgate at pickup Flag (Prepaid)
     * @return The value of the column 'LIFTGATE_PICKUP_PREPAID_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLiftgatePickupPrepaidFlg() {
        checkSpecifiedProperty("liftgatePickupPrepaidFlg");
        return convertEmptyToNull(_liftgatePickupPrepaidFlg);
    }

    /**
     * [set] LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg} <br>
     * Liftgate at pickup Flag (Prepaid)
     * @param liftgatePickupPrepaidFlg The value of the column 'LIFTGATE_PICKUP_PREPAID_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLiftgatePickupPrepaidFlg(String liftgatePickupPrepaidFlg) {
        registerModifiedProperty("liftgatePickupPrepaidFlg");
        _liftgatePickupPrepaidFlg = liftgatePickupPrepaidFlg;
    }

    /**
     * [get] LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg} <br>
     * Liftgate at pickup Flag (Collect)
     * @return The value of the column 'LIFTGATE_PICKUP_COLLECT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLiftgatePickupCollectFlg() {
        checkSpecifiedProperty("liftgatePickupCollectFlg");
        return convertEmptyToNull(_liftgatePickupCollectFlg);
    }

    /**
     * [set] LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg} <br>
     * Liftgate at pickup Flag (Collect)
     * @param liftgatePickupCollectFlg The value of the column 'LIFTGATE_PICKUP_COLLECT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLiftgatePickupCollectFlg(String liftgatePickupCollectFlg) {
        registerModifiedProperty("liftgatePickupCollectFlg");
        _liftgatePickupCollectFlg = liftgatePickupCollectFlg;
    }

    /**
     * [get] INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg} <br>
     * Inside Delivery Flag (Prepaid)
     * @return The value of the column 'INSIDE_DELIVERY_PREPAID_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInsideDeliveryPrepaidFlg() {
        checkSpecifiedProperty("insideDeliveryPrepaidFlg");
        return convertEmptyToNull(_insideDeliveryPrepaidFlg);
    }

    /**
     * [set] INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg} <br>
     * Inside Delivery Flag (Prepaid)
     * @param insideDeliveryPrepaidFlg The value of the column 'INSIDE_DELIVERY_PREPAID_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInsideDeliveryPrepaidFlg(String insideDeliveryPrepaidFlg) {
        registerModifiedProperty("insideDeliveryPrepaidFlg");
        _insideDeliveryPrepaidFlg = insideDeliveryPrepaidFlg;
    }

    /**
     * [get] INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg} <br>
     * Inside Delivery Flag (Collect)
     * @return The value of the column 'INSIDE_DELIVERY_COLLECT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInsideDeliveryCollectFlg() {
        checkSpecifiedProperty("insideDeliveryCollectFlg");
        return convertEmptyToNull(_insideDeliveryCollectFlg);
    }

    /**
     * [set] INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg} <br>
     * Inside Delivery Flag (Collect)
     * @param insideDeliveryCollectFlg The value of the column 'INSIDE_DELIVERY_COLLECT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInsideDeliveryCollectFlg(String insideDeliveryCollectFlg) {
        registerModifiedProperty("insideDeliveryCollectFlg");
        _insideDeliveryCollectFlg = insideDeliveryCollectFlg;
    }

    /**
     * [get] INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg} <br>
     * Inside Pickup Flag (Prepaid)
     * @return The value of the column 'INSIDE_PICKUP_PREPAID_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInsidePickupPrepaidFlg() {
        checkSpecifiedProperty("insidePickupPrepaidFlg");
        return convertEmptyToNull(_insidePickupPrepaidFlg);
    }

    /**
     * [set] INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg} <br>
     * Inside Pickup Flag (Prepaid)
     * @param insidePickupPrepaidFlg The value of the column 'INSIDE_PICKUP_PREPAID_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInsidePickupPrepaidFlg(String insidePickupPrepaidFlg) {
        registerModifiedProperty("insidePickupPrepaidFlg");
        _insidePickupPrepaidFlg = insidePickupPrepaidFlg;
    }

    /**
     * [get] INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg} <br>
     * Inside Pickup Flag (Collect)
     * @return The value of the column 'INSIDE_PICKUP_COLLECT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInsidePickupCollectFlg() {
        checkSpecifiedProperty("insidePickupCollectFlg");
        return convertEmptyToNull(_insidePickupCollectFlg);
    }

    /**
     * [set] INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg} <br>
     * Inside Pickup Flag (Collect)
     * @param insidePickupCollectFlg The value of the column 'INSIDE_PICKUP_COLLECT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInsidePickupCollectFlg(String insidePickupCollectFlg) {
        registerModifiedProperty("insidePickupCollectFlg");
        _insidePickupCollectFlg = insidePickupCollectFlg;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}

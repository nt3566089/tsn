package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCarrierSlipCesCQ;

/**
 * The nest select set-upper of M_CARRIER_SLIP_CES.
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipCesNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCarrierSlipCesCQ _query;
    public MCarrierSlipCesNss(MCarrierSlipCesCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomer() {
        _query.xdoNss(() -> _query.queryMCustomer());
        return new MCustomerNss(_query.queryMCustomer());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SAT_DELIVERY_FLG, named 'BClassDtlBySatDeliveryFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySatDeliveryFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlBySatDeliveryFlg());
        return new BClassDtlNss(_query.queryBClassDtlBySatDeliveryFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my RESIDENTIAL_DELIVERY_FLG, named 'BClassDtlByResidentialDeliveryFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByResidentialDeliveryFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByResidentialDeliveryFlg());
        return new BClassDtlNss(_query.queryBClassDtlByResidentialDeliveryFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my COD_FLG, named 'BClassDtlByCodFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCodFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByCodFlg());
        return new BClassDtlNss(_query.queryBClassDtlByCodFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SIGNATURE_REQUIRED_FLG, named 'BClassDtlBySignatureRequiredFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySignatureRequiredFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlBySignatureRequiredFlg());
        return new BClassDtlNss(_query.queryBClassDtlBySignatureRequiredFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SIGNATURE_RELEASE_FLG, named 'BClassDtlBySignatureReleaseFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySignatureReleaseFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlBySignatureReleaseFlg());
        return new BClassDtlNss(_query.queryBClassDtlBySignatureReleaseFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my CALL_BEFORE_DELIVERY_FLG, named 'BClassDtlByCallBeforeDeliveryFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCallBeforeDeliveryFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByCallBeforeDeliveryFlg());
        return new BClassDtlNss(_query.queryBClassDtlByCallBeforeDeliveryFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my FREEZABLE_PROTECTION_FLG, named 'BClassDtlByFreezableProtectionFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByFreezableProtectionFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByFreezableProtectionFlg());
        return new BClassDtlNss(_query.queryBClassDtlByFreezableProtectionFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my GUARANTEED_PLUS_FLG, named 'BClassDtlByGuaranteedPlusFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByGuaranteedPlusFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByGuaranteedPlusFlg());
        return new BClassDtlNss(_query.queryBClassDtlByGuaranteedPlusFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my RESIDENTIAL_PICKUP_FLG, named 'BClassDtlByResidentialPickupFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByResidentialPickupFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByResidentialPickupFlg());
        return new BClassDtlNss(_query.queryBClassDtlByResidentialPickupFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my DO_NOT_STACK_STACK_FLG, named 'BClassDtlByDoNotStackStackFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDoNotStackStackFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByDoNotStackStackFlg());
        return new BClassDtlNss(_query.queryBClassDtlByDoNotStackStackFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LIMITED_ACCESS_DELIVERY_FLG, named 'BClassDtlByLimitedAccessDeliveryFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLimitedAccessDeliveryFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLimitedAccessDeliveryFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLimitedAccessDeliveryFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LIMITED_ACCESS_PICKUP_FLG, named 'BClassDtlByLimitedAccessPickupFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLimitedAccessPickupFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLimitedAccessPickupFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLimitedAccessPickupFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my OVER_SIZED_FLG, named 'BClassDtlByOverSizedFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByOverSizedFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByOverSizedFlg());
        return new BClassDtlNss(_query.queryBClassDtlByOverSizedFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my POISON_FLG, named 'BClassDtlByPoisonFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPoisonFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByPoisonFlg());
        return new BClassDtlNss(_query.queryBClassDtlByPoisonFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my FOOG_FLG, named 'BClassDtlByFoogFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByFoogFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByFoogFlg());
        return new BClassDtlNss(_query.queryBClassDtlByFoogFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LIFTGATE_DELIVERY_PREPAID_FLG, named 'BClassDtlByLiftgateDeliveryPrepaidFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLiftgateDeliveryPrepaidFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLiftgateDeliveryPrepaidFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLiftgateDeliveryPrepaidFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LIFTGATE_DELIVERY_COLLECT_FLG, named 'BClassDtlByLiftgateDeliveryCollectFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLiftgateDeliveryCollectFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLiftgateDeliveryCollectFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLiftgateDeliveryCollectFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LIFTGATE_PICKUP_PREPAID_FLG, named 'BClassDtlByLiftgatePickupPrepaidFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLiftgatePickupPrepaidFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLiftgatePickupPrepaidFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLiftgatePickupPrepaidFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LIFTGATE_PICKUP_COLLECT_FLG, named 'BClassDtlByLiftgatePickupCollectFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLiftgatePickupCollectFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLiftgatePickupCollectFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLiftgatePickupCollectFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my INSIDE_DELIVERY_PREPAID_FLG, named 'BClassDtlByInsideDeliveryPrepaidFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInsideDeliveryPrepaidFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInsideDeliveryPrepaidFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInsideDeliveryPrepaidFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my INSIDE_DELIVERY_COLLECT_FLG, named 'BClassDtlByInsideDeliveryCollectFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInsideDeliveryCollectFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInsideDeliveryCollectFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInsideDeliveryCollectFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my INSIDE_PICKUP_PREPAID_FLG, named 'BClassDtlByInsidePickupPrepaidFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInsidePickupPrepaidFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInsidePickupPrepaidFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInsidePickupPrepaidFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my INSIDE_PICKUP_COLLECT_FLG, named 'BClassDtlByInsidePickupCollectFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInsidePickupCollectFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInsidePickupCollectFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInsidePickupCollectFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDelFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByDelFlg());
        return new BClassDtlNss(_query.queryBClassDtlByDelFlg());
    }
}

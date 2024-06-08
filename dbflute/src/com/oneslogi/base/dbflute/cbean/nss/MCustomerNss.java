package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCustomerCQ;

/**
 * The nest select set-upper of M_CUSTOMER.
 * @author DBFlute(AutoGenerator)
 */
public class MCustomerNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCustomerCQ _query;
    public MCustomerNss(MCustomerCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MClientNss withMClient() {
        _query.xdoNss(() -> _query.queryMClient());
        return new MClientNss(_query.queryMClient());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CUSTOMER by my DELIV_CUSTOMER_ID, named 'MCustomerSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomerSelf() {
        _query.xdoNss(() -> _query.queryMCustomerSelf());
        return new MCustomerNss(_query.queryMCustomerSelf());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CLIENT_CENTER by my CUSTOMER_ID, CLIENT_ID, named 'MClientCenterByClientId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MClientCenterNss withMClientCenterByClientId() {
        _query.xdoNss(() -> _query.queryMClientCenterByClientId());
        return new MClientCenterNss(_query.queryMClientCenterByClientId());
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
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my DELIVERY_FLG, named 'BClassDtlByDeliveryFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDeliveryFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByDeliveryFlg());
        return new BClassDtlNss(_query.queryBClassDtlByDeliveryFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my DEPOSIT_FLG, named 'BClassDtlByDepositFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDepositFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByDepositFlg());
        return new BClassDtlNss(_query.queryBClassDtlByDepositFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLimitDtReverseFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLimitDtReverseFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLimitDtReverseFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLotReverseFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLotReverseFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLotReverseFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my ONETIME_FLG, named 'BClassDtlByOnetimeFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByOnetimeFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByOnetimeFlg());
        return new BClassDtlNss(_query.queryBClassDtlByOnetimeFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByShippingStopFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByShippingStopFlg());
        return new BClassDtlNss(_query.queryBClassDtlByShippingStopFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my VENDOR_FLG, named 'BClassDtlByVendorFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByVendorFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByVendorFlg());
        return new BClassDtlNss(_query.queryBClassDtlByVendorFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CARRIER_SLIP_CES by CUSTOMER_ID, named 'MCarrierSlipCesAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCarrierSlipCesNss withMCarrierSlipCesAsOne() {
        _query.xdoNss(() -> _query.queryMCarrierSlipCesAsOne());
        return new MCarrierSlipCesNss(_query.queryMCarrierSlipCesAsOne());
    }
}

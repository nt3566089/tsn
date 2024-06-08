package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MDeliveryCourseCQ;

/**
 * The nest select set-upper of M_DELIVERY_COURSE.
 * @author DBFlute(AutoGenerator)
 */
public class MDeliveryCourseNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MDeliveryCourseCQ _query;
    public MDeliveryCourseNss(MDeliveryCourseCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CARRIER_SLIP_YUPK by my CARRIER_SLIP_YUPK_ID, named 'MCarrierSlipYupk'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCarrierSlipYupkNss withMCarrierSlipYupk() {
        _query.xdoNss(() -> _query.queryMCarrierSlipYupk());
        return new MCarrierSlipYupkNss(_query.queryMCarrierSlipYupk());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterNss withMCenter() {
        _query.xdoNss(() -> _query.queryMCenter());
        return new MCenterNss(_query.queryMCenter());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CARRIER by my CARRIER_ID, named 'MCarrier'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCarrierNss withMCarrier() {
        _query.xdoNss(() -> _query.queryMCarrier());
        return new MCarrierNss(_query.queryMCarrier());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CARRIER_SLIP_SGW by my CARRIER_SLIP_SGW_ID, named 'MCarrierSlipSgw'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCarrierSlipSgwNss withMCarrierSlipSgw() {
        _query.xdoNss(() -> _query.queryMCarrierSlipSgw());
        return new MCarrierSlipSgwNss(_query.queryMCarrierSlipSgw());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CARRIER_SLIP_YMT by my CARRIER_SLIP_YMT_ID, named 'MCarrierSlipYmt'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCarrierSlipYmtNss withMCarrierSlipYmt() {
        _query.xdoNss(() -> _query.queryMCarrierSlipYmt());
        return new MCarrierSlipYmtNss(_query.queryMCarrierSlipYmt());
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
     * M_CENTER_CLASS_DTL by my TAG_DATA_TYPE, named 'MCenterClassDtlByTagDataType'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlByTagDataType(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlByTagDataType(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlByTagDataType(centerId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my TAG_TYPE, named 'MCenterClassDtlByTagType'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlByTagType(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlByTagType(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlByTagType(centerId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my TAG_TYPE_AFTER, named 'MCenterClassDtlByTagTypeAfter'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlByTagTypeAfter(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlByTagTypeAfter(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlByTagTypeAfter(centerId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my TRACKING_NUMBERING_UNIT, named 'BClassDtlByTrackingNumberingUnit'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByTrackingNumberingUnit() {
        _query.xdoNss(() -> _query.queryBClassDtlByTrackingNumberingUnit());
        return new BClassDtlNss(_query.queryBClassDtlByTrackingNumberingUnit());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PAYMENT_TERM, named 'BClassDtlByPaymentTerm'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPaymentTerm() {
        _query.xdoNss(() -> _query.queryBClassDtlByPaymentTerm());
        return new BClassDtlNss(_query.queryBClassDtlByPaymentTerm());
    }
}

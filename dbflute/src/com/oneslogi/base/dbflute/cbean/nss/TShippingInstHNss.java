package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TShippingInstHCQ;

/**
 * The nest select set-upper of T_SHIPPING_INST_H.
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstHNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TShippingInstHCQ _query;
    public TShippingInstHNss(TShippingInstHCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TAllocInstHNss withTAllocInstH() {
        _query.xdoNss(() -> _query.queryTAllocInstH());
        return new TAllocInstHNss(_query.queryTAllocInstH());
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
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MClientNss withMClient() {
        _query.xdoNss(() -> _query.queryMClient());
        return new MClientNss(_query.queryMClient());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MDeliveryCourseNss withMDeliveryCourse() {
        _query.xdoNss(() -> _query.queryMDeliveryCourse());
        return new MDeliveryCourseNss(_query.queryMDeliveryCourse());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CUSTOMER by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomerByDelivCustomerId() {
        _query.xdoNss(() -> _query.queryMCustomerByDelivCustomerId());
        return new MCustomerNss(_query.queryMCustomerByDelivCustomerId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProcessTypeNss withMProcessType() {
        _query.xdoNss(() -> _query.queryMProcessType());
        return new MProcessTypeNss(_query.queryMProcessType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CUSTOMER by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomerBySupplyCustomerId() {
        _query.xdoNss(() -> _query.queryMCustomerBySupplyCustomerId());
        return new MCustomerNss(_query.queryMCustomerBySupplyCustomerId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_ZIP by my DELIV_ZIP_CD, named 'MZipForDeliv'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MZipNss withMZipForDeliv() {
        _query.xdoNss(() -> _query.queryMZipForDeliv());
        return new MZipNss(_query.queryMZipForDeliv());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my DELIV_TZ, named 'BClassDtlByDelivTz'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDelivTz() {
        _query.xdoNss(() -> _query.queryBClassDtlByDelivTz());
        return new BClassDtlNss(_query.queryBClassDtlByDelivTz());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByEmergencyFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByEmergencyFlg());
        return new BClassDtlNss(_query.queryBClassDtlByEmergencyFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByErrorFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByErrorFlg());
        return new BClassDtlNss(_query.queryBClassDtlByErrorFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInputType() {
        _query.xdoNss(() -> _query.queryBClassDtlByInputType());
        return new BClassDtlNss(_query.queryBClassDtlByInputType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SHIPPING_STATUS, named 'BClassDtlByShippingStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByShippingStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlByShippingStatus());
        return new BClassDtlNss(_query.queryBClassDtlByShippingStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my STOCK_OUT_FLG, named 'BClassDtlByStockOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStockOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStockOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStockOutFlg());
    }
}

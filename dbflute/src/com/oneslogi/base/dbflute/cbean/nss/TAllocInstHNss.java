package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TAllocInstHCQ;

/**
 * The nest select set-upper of T_ALLOC_INST_H.
 * @author DBFlute(AutoGenerator)
 */
public class TAllocInstHNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TAllocInstHCQ _query;
    public TAllocInstHNss(TAllocInstHCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
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
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProcessTypeNss withMProcessType() {
        _query.xdoNss(() -> _query.queryMProcessType());
        return new MProcessTypeNss(_query.queryMProcessType());
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
     * M_CUSTOMER by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomerByDelivCustomerId() {
        _query.xdoNss(() -> _query.queryMCustomerByDelivCustomerId());
        return new MCustomerNss(_query.queryMCustomerByDelivCustomerId());
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
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MClientNss withMClient() {
        _query.xdoNss(() -> _query.queryMClient());
        return new MClientNss(_query.queryMClient());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_PICKING_H by my ALLOC_INST_H_ID, named 'TPickingH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TPickingHNss withTPickingH() {
        _query.xdoNss(() -> _query.queryTPickingH());
        return new TPickingHNss(_query.queryTPickingH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CUSTOMER by my CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'MCenterCustomerByDelivCustomerId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterCustomerNss withMCenterCustomerByDelivCustomerId() {
        _query.xdoNss(() -> _query.queryMCenterCustomerByDelivCustomerId());
        return new MCenterCustomerNss(_query.queryMCenterCustomerByDelivCustomerId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CUSTOMER by my CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'MCenterCustomerBySupplyCustomerId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterCustomerNss withMCenterCustomerBySupplyCustomerId() {
        _query.xdoNss(() -> _query.queryMCenterCustomerBySupplyCustomerId());
        return new MCenterCustomerNss(_query.queryMCenterCustomerBySupplyCustomerId());
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
}

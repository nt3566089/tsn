package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TEcOrderHCQ;

/**
 * The nest select set-upper of T_EC_ORDER_H.
 * @author DBFlute(AutoGenerator)
 */
public class TEcOrderHNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TEcOrderHCQ _query;
    public TEcOrderHNss(TEcOrderHCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_IMPORT_TYPE by my IMPORT_TYPE_ID, named 'MImportType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MImportTypeNss withMImportType() {
        _query.xdoNss(() -> _query.queryMImportType());
        return new MImportTypeNss(_query.queryMImportType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_SHIPPING_INST_H by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TShippingInstHNss withTShippingInstH() {
        _query.xdoNss(() -> _query.queryTShippingInstH());
        return new TShippingInstHNss(_query.queryTShippingInstH());
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
     * B_CLASS_DTL by my DELIV_MATCH_FLG, named 'BClassDtlByDelivMatchFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDelivMatchFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByDelivMatchFlg());
        return new BClassDtlNss(_query.queryBClassDtlByDelivMatchFlg());
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
     * B_CLASS_DTL by my GIFT_FLG, named 'BClassDtlByGiftFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByGiftFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByGiftFlg());
        return new BClassDtlNss(_query.queryBClassDtlByGiftFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my IMPORT_FLG, named 'BClassDtlByImportFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByImportFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByImportFlg());
        return new BClassDtlNss(_query.queryBClassDtlByImportFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PRIORITY_FLG, named 'BClassDtlByPriorityFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPriorityFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByPriorityFlg());
        return new BClassDtlNss(_query.queryBClassDtlByPriorityFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_EC_ORDER_R by EC_ORDER_H_ID, named 'TEcOrderRAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TEcOrderRNss withTEcOrderRAsOne() {
        _query.xdoNss(() -> _query.queryTEcOrderRAsOne());
        return new TEcOrderRNss(_query.queryTEcOrderRAsOne());
    }
}

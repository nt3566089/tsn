package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MProcessTypeCQ;

/**
 * The nest select set-upper of M_PROCESS_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class MProcessTypeNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MProcessTypeCQ _query;
    public MProcessTypeNss(MProcessTypeCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MStockTypeNss withMStockType() {
        _query.xdoNss(() -> _query.queryMStockType());
        return new MStockTypeNss(_query.queryMStockType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * V_DICT by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVDict(cultureId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my RECEIVE_FLG, named 'BClassDtlByReceiveFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByReceiveFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByReceiveFlg());
        return new BClassDtlNss(_query.queryBClassDtlByReceiveFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SHIPPING_FLG, named 'BClassDtlByShippingFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByShippingFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByShippingFlg());
        return new BClassDtlNss(_query.queryBClassDtlByShippingFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStockAdjustFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStockAdjustFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStockAdjustFlg());
    }
}

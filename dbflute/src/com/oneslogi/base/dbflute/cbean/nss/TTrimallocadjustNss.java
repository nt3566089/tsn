package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TTrimallocadjustCQ;

/**
 * The nest select set-upper of T_TRIMALLOCADJUST.
 * @author DBFlute(AutoGenerator)
 */
public class TTrimallocadjustNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TTrimallocadjustCQ _query;
    public TTrimallocadjustNss(TTrimallocadjustCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_TRIMALLOCSTOCK by my TRIMALLOCSTOCK_ID, named 'TTrimallocstock'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TTrimallocstockNss withTTrimallocstock() {
        _query.xdoNss(() -> _query.queryTTrimallocstock());
        return new TTrimallocstockNss(_query.queryTTrimallocstock());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_TRIMALLOCSCHKRI by my TRIMALLOCSCH_ID, named 'TTrimallocschkri'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TTrimallocschkriNss withTTrimallocschkri() {
        _query.xdoNss(() -> _query.queryTTrimallocschkri());
        return new TTrimallocschkriNss(_query.queryTTrimallocschkri());
    }
}

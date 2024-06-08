package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BMenuGrpCQ;

/**
 * The nest select set-upper of B_MENU_GRP.
 * @author DBFlute(AutoGenerator)
 */
public class BMenuGrpNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BMenuGrpCQ _query;
    public BMenuGrpNss(BMenuGrpCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BDictNss withBDict() {
        _query.xdoNss(() -> _query.queryBDict());
        return new BDictNss(_query.queryBDict());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_MENU_GRP by my PARENT_MENU_GRP_ID, named 'BMenuGrpSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BMenuGrpNss withBMenuGrpSelf() {
        _query.xdoNss(() -> _query.queryBMenuGrpSelf());
        return new BMenuGrpNss(_query.queryBMenuGrpSelf());
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
     * V_HT_DICT by my DICT_ID, named 'VHtDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVHtDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVHtDict(cultureId));
    }
}

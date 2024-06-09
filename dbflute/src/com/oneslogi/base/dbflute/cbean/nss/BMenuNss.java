package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BMenuCQ;

/**
 * The nest select set-upper of B_MENU.
 * @author DBFlute(AutoGenerator)
 */
public class BMenuNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BMenuCQ _query;
    public BMenuNss(BMenuCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_MENU_GRP by my MENU_GRP_ID, named 'BMenuGrp'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BMenuGrpNss withBMenuGrp() {
        _query.xdoNss(() -> _query.queryBMenuGrp());
        return new BMenuGrpNss(_query.queryBMenuGrp());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_SCREEN by my SCREEN_ID, named 'BScreen'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BScreenNss withBScreen() {
        _query.xdoNss(() -> _query.queryBScreen());
        return new BScreenNss(_query.queryBScreen());
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
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my TARGET_WINDOW, named 'BClassDtlByTargetWindow'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByTargetWindow() {
        _query.xdoNss(() -> _query.queryBClassDtlByTargetWindow());
        return new BClassDtlNss(_query.queryBClassDtlByTargetWindow());
    }
}

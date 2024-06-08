package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BDictCultureCQ;

/**
 * The nest select set-upper of B_DICT_CULTURE.
 * @author DBFlute(AutoGenerator)
 */
public class BDictCultureNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BDictCultureCQ _query;
    public BDictCultureNss(BDictCultureCQ query) { _query = query; }
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
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BCultureNss withBCulture() {
        _query.xdoNss(() -> _query.queryBCulture());
        return new BCultureNss(_query.queryBCulture());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_HT_DICT_CULTURE by DICT_CULTURE_ID, named 'MHtDictCultureAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MHtDictCultureNss withMHtDictCultureAsOne() {
        _query.xdoNss(() -> _query.queryMHtDictCultureAsOne());
        return new MHtDictCultureNss(_query.queryMHtDictCultureAsOne());
    }
}

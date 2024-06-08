package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MHtDictCultureCQ;

/**
 * The nest select set-upper of M_HT_DICT_CULTURE.
 * @author DBFlute(AutoGenerator)
 */
public class MHtDictCultureNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MHtDictCultureCQ _query;
    public MHtDictCultureNss(MHtDictCultureCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_DICT_CULTURE by my DICT_CULTURE_ID, named 'BDictCulture'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BDictCultureNss withBDictCulture() {
        _query.xdoNss(() -> _query.queryBDictCulture());
        return new BDictCultureNss(_query.queryBDictCulture());
    }
}

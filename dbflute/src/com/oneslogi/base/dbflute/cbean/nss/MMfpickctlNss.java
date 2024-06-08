package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MMfpickctlCQ;

/**
 * The nest select set-upper of M_MFPICKCTL.
 * @author DBFlute(AutoGenerator)
 */
public class MMfpickctlNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MMfpickctlCQ _query;
    public MMfpickctlNss(MMfpickctlCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MClientNss withMClient() {
        _query.xdoNss(() -> _query.queryMClient());
        return new MClientNss(_query.queryMClient());
    }
}

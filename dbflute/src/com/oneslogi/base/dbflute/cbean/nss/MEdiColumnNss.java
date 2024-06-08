package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MEdiColumnCQ;

/**
 * The nest select set-upper of M_EDI_COLUMN.
 * @author DBFlute(AutoGenerator)
 */
public class MEdiColumnNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MEdiColumnCQ _query;
    public MEdiColumnNss(MEdiColumnCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_EDI by my EDI_ID, named 'MEdi'.
     */
    public void withMEdi() {
        _query.xdoNss(() -> _query.queryMEdi());
    }
}

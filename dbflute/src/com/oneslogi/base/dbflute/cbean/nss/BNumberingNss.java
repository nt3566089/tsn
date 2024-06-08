package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BNumberingCQ;

/**
 * The nest select set-upper of B_NUMBERING.
 * @author DBFlute(AutoGenerator)
 */
public class BNumberingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BNumberingCQ _query;
    public BNumberingNss(BNumberingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my CHECK_DIGIT, named 'BClassDtlByCheckDigit'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCheckDigit() {
        _query.xdoNss(() -> _query.queryBClassDtlByCheckDigit());
        return new BClassDtlNss(_query.queryBClassDtlByCheckDigit());
    }
}

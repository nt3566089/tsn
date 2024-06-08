package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MImportTypeBCopyBCQ;

/**
 * The nest select set-upper of M_IMPORT_TYPE_B_COPY_B.
 * @author DBFlute(AutoGenerator)
 */
public class MImportTypeBCopyBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MImportTypeBCopyBCQ _query;
    public MImportTypeBCopyBNss(MImportTypeBCopyBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_IMPORT_TYPE_B by my IMPORT_TYPE_B_ID, named 'MImportTypeB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MImportTypeBNss withMImportTypeB() {
        _query.xdoNss(() -> _query.queryMImportTypeB());
        return new MImportTypeBNss(_query.queryMImportTypeB());
    }
}

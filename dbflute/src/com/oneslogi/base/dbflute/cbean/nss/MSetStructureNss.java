package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MSetStructureCQ;

/**
 * The nest select set-upper of M_SET_STRUCTURE.
 * @author DBFlute(AutoGenerator)
 */
public class MSetStructureNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MSetStructureCQ _query;
    public MSetStructureNss(MSetStructureCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductNss withMProduct() {
        _query.xdoNss(() -> _query.queryMProduct());
        return new MProductNss(_query.queryMProduct());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_SET_PARENT by my SET_PARENT_ID, named 'MSetParent'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MSetParentNss withMSetParent() {
        _query.xdoNss(() -> _query.queryMSetParent());
        return new MSetParentNss(_query.queryMSetParent());
    }
}

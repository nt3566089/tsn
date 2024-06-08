package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BDictCQ;

/**
 * The nest select set-upper of B_DICT.
 * @author DBFlute(AutoGenerator)
 */
public class BDictNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BDictCQ _query;
    public BDictNss(BDictCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my DATA_TYPE, named 'BClassDtlByDataType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDataType() {
        _query.xdoNss(() -> _query.queryBClassDtlByDataType());
        return new BClassDtlNss(_query.queryBClassDtlByDataType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_DICT_VALID by DICT_ID, named 'BDictValidAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BDictValidNss withBDictValidAsOne() {
        _query.xdoNss(() -> _query.queryBDictValidAsOne());
        return new BDictValidNss(_query.queryBDictValidAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_HT_DICT by DICT_ID, named 'MHtDictAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MHtDictNss withMHtDictAsOne() {
        _query.xdoNss(() -> _query.queryMHtDictAsOne());
        return new MHtDictNss(_query.queryMHtDictAsOne());
    }
}

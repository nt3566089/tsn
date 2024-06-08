package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MDataInputTypeCQ;

/**
 * The nest select set-upper of M_DATA_INPUT_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class MDataInputTypeNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MDataInputTypeCQ _query;
    public MDataInputTypeNss(MDataInputTypeCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my DATA_INPUT_TYPE_CD, named 'BClassDtlByDataInputTypeCd'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDataInputTypeCd() {
        _query.xdoNss(() -> _query.queryBClassDtlByDataInputTypeCd());
        return new BClassDtlNss(_query.queryBClassDtlByDataInputTypeCd());
    }
}

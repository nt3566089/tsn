package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MStockTypeCQ;

/**
 * The nest select set-upper of M_STOCK_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class MStockTypeNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MStockTypeCQ _query;
    public MStockTypeNss(MStockTypeCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
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
     * B_CLASS_DTL by my REVERSE_VALID_FLG, named 'BClassDtlByReverseValidFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByReverseValidFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByReverseValidFlg());
        return new BClassDtlNss(_query.queryBClassDtlByReverseValidFlg());
    }
}

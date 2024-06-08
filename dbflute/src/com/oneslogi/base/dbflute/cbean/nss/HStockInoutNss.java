package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HStockInoutCQ;

/**
 * The nest select set-upper of H_STOCK_INOUT.
 * @author DBFlute(AutoGenerator)
 */
public class HStockInoutNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HStockInoutCQ _query;
    public HStockInoutNss(HStockInoutCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProcessTypeNss withMProcessType() {
        _query.xdoNss(() -> _query.queryMProcessType());
        return new MProcessTypeNss(_query.queryMProcessType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * H_STOCK by my STOCK_ID, named 'HStock'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HStockNss withHStock() {
        _query.xdoNss(() -> _query.queryHStock());
        return new HStockNss(_query.queryHStock());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my CORRECT_TYPE, named 'BClassDtlByCorrectType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCorrectType() {
        _query.xdoNss(() -> _query.queryBClassDtlByCorrectType());
        return new BClassDtlNss(_query.queryBClassDtlByCorrectType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInoutType() {
        _query.xdoNss(() -> _query.queryBClassDtlByInoutType());
        return new BClassDtlNss(_query.queryBClassDtlByInoutType());
    }
}

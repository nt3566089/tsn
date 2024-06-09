package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TPicMthdRcmdCartCQ;

/**
 * The nest select set-upper of T_PIC_MTHD_RCMD_CART.
 * @author DBFlute(AutoGenerator)
 */
public class TPicMthdRcmdCartNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TPicMthdRcmdCartCQ _query;
    public TPicMthdRcmdCartNss(TPicMthdRcmdCartCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_PACKING_H by my PACKING_H_ID, named 'TPackingH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TPackingHNss withTPackingH() {
        _query.xdoNss(() -> _query.queryTPackingH());
        return new TPackingHNss(_query.queryTPackingH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_PIC_MTHD_RCMD by my PIC_MTHD_RCMD_ID, named 'TPicMthdRcmd'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TPicMthdRcmdNss withTPicMthdRcmd() {
        _query.xdoNss(() -> _query.queryTPicMthdRcmd());
        return new TPicMthdRcmdNss(_query.queryTPicMthdRcmd());
    }
}

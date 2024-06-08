package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TPicMthdRcmdDataCQ;

/**
 * The nest select set-upper of T_PIC_MTHD_RCMD_DATA.
 * @author DBFlute(AutoGenerator)
 */
public class TPicMthdRcmdDataNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TPicMthdRcmdDataCQ _query;
    public TPicMthdRcmdDataNss(TPicMthdRcmdDataCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_PIC_MTHD_RCMD by my PIC_MTHD_RCMD_ID, named 'TPicMthdRcmd'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TPicMthdRcmdNss withTPicMthdRcmd() {
        _query.xdoNss(() -> _query.queryTPicMthdRcmd());
        return new TPicMthdRcmdNss(_query.queryTPicMthdRcmd());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TPickingHNss withTPickingH() {
        _query.xdoNss(() -> _query.queryTPickingH());
        return new TPickingHNss(_query.queryTPickingH());
    }
}

package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.PPrinterCQ;

/**
 * The nest select set-upper of P_PRINTER.
 * @author DBFlute(AutoGenerator)
 */
public class PPrinterNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PPrinterCQ _query;
    public PPrinterNss(PPrinterCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroup'.
     */
    public void withPPrinterGroup() {
        _query.xdoNss(() -> _query.queryPPrinterGroup());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByVisible() {
        _query.xdoNss(() -> _query.queryBClassDtlByVisible());
        return new BClassDtlNss(_query.queryBClassDtlByVisible());
    }
}

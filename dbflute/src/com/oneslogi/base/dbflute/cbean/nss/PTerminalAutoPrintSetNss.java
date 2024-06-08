package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.PTerminalAutoPrintSetCQ;

/**
 * The nest select set-upper of P_TERMINAL_AUTO_PRINT_SET.
 * @author DBFlute(AutoGenerator)
 */
public class PTerminalAutoPrintSetNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PTerminalAutoPrintSetCQ _query;
    public PTerminalAutoPrintSetNss(PTerminalAutoPrintSetCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayoutByReportLayoutId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PReportLayoutNss withPReportLayoutByReportLayoutId() {
        _query.xdoNss(() -> _query.queryPReportLayoutByReportLayoutId());
        return new PReportLayoutNss(_query.queryPReportLayoutByReportLayoutId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroupByPrinterGroupId'.
     */
    public void withPPrinterGroupByPrinterGroupId() {
        _query.xdoNss(() -> _query.queryPPrinterGroupByPrinterGroupId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * P_PRINTER by my PRINTER_ID, named 'PPrinterByPrinterId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PPrinterNss withPPrinterByPrinterId() {
        _query.xdoNss(() -> _query.queryPPrinterByPrinterId());
        return new PPrinterNss(_query.queryPPrinterByPrinterId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttributeByPrinterAttributeId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PPrinterAttributeNss withPPrinterAttributeByPrinterAttributeId() {
        _query.xdoNss(() -> _query.queryPPrinterAttributeByPrinterAttributeId());
        return new PPrinterAttributeNss(_query.queryPPrinterAttributeByPrinterAttributeId());
    }
}

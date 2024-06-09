package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.PLayoutPrintSettingCQ;

/**
 * The nest select set-upper of P_LAYOUT_PRINT_SETTING.
 * @author DBFlute(AutoGenerator)
 */
public class PLayoutPrintSettingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PLayoutPrintSettingCQ _query;
    public PLayoutPrintSettingNss(PLayoutPrintSettingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttribute'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PPrinterAttributeNss withPPrinterAttribute() {
        _query.xdoNss(() -> _query.queryPPrinterAttribute());
        return new PPrinterAttributeNss(_query.queryPPrinterAttribute());
    }
    /**
     * With nested relation columns to select clause. <br>
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroup'.
     */
    public void withPPrinterGroup() {
        _query.xdoNss(() -> _query.queryPPrinterGroup());
    }
    /**
     * With nested relation columns to select clause. <br>
     * P_PRINTER by my PRINTER_ID, named 'PPrinter'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PPrinterNss withPPrinter() {
        _query.xdoNss(() -> _query.queryPPrinter());
        return new PPrinterNss(_query.queryPPrinter());
    }
    /**
     * With nested relation columns to select clause. <br>
     * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayout'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PReportLayoutNss withPReportLayout() {
        _query.xdoNss(() -> _query.queryPReportLayout());
        return new PReportLayoutNss(_query.queryPReportLayout());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SHEET_COLLATE, named 'BClassDtlBySheetCollate'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySheetCollate() {
        _query.xdoNss(() -> _query.queryBClassDtlBySheetCollate());
        return new BClassDtlNss(_query.queryBClassDtlBySheetCollate());
    }
}

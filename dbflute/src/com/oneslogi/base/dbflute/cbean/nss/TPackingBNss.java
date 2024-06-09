package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TPackingBCQ;

/**
 * The nest select set-upper of T_PACKING_B.
 * @author DBFlute(AutoGenerator)
 */
public class TPackingBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TPackingBCQ _query;
    public TPackingBNss(TPackingBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TAllocInstBNss withTAllocInstB() {
        _query.xdoNss(() -> _query.queryTAllocInstB());
        return new TAllocInstBNss(_query.queryTAllocInstB());
    }
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
     * T_PICKING_B by my PICKING_B_ID, named 'TPickingB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TPickingBNss withTPickingB() {
        _query.xdoNss(() -> _query.queryTPickingB());
        return new TPickingBNss(_query.queryTPickingB());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my INSPECTION_FLG, named 'BClassDtlByInspectionFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInspectionFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInspectionFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInspectionFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PICKING_FLG, named 'BClassDtlByPickingFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPickingFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByPickingFlg());
        return new BClassDtlNss(_query.queryBClassDtlByPickingFlg());
    }
}

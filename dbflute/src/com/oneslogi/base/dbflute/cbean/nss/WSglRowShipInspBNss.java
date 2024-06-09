package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.WSglRowShipInspBCQ;

/**
 * The nest select set-upper of W_SGL_ROW_SHIP_INSP_B.
 * @author DBFlute(AutoGenerator)
 */
public class WSglRowShipInspBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WSglRowShipInspBCQ _query;
    public WSglRowShipInspBNss(WSglRowShipInspBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TPickingHNss withTPickingH() {
        _query.xdoNss(() -> _query.queryTPickingH());
        return new TPickingHNss(_query.queryTPickingH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * W_SGL_ROW_SHIP_INSP_H by my SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WSglRowShipInspHNss withWSglRowShipInspH() {
        _query.xdoNss(() -> _query.queryWSglRowShipInspH());
        return new WSglRowShipInspHNss(_query.queryWSglRowShipInspH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_USER by my USER_ID, named 'BUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUser() {
        _query.xdoNss(() -> _query.queryBUser());
        return new BUserNss(_query.queryBUser());
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
}

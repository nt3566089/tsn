package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MZoneCQ;

/**
 * The nest select set-upper of M_ZONE.
 * @author DBFlute(AutoGenerator)
 */
public class MZoneNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MZoneCQ _query;
    public MZoneNss(MZoneCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MWarehouseNss withMWarehouse() {
        _query.xdoNss(() -> _query.queryMWarehouse());
        return new MWarehouseNss(_query.queryMWarehouse());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDelFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByDelFlg());
        return new BClassDtlNss(_query.queryBClassDtlByDelFlg());
    }
}
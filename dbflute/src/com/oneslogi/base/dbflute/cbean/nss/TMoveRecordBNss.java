package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TMoveRecordBCQ;

/**
 * The nest select set-upper of T_MOVE_RECORD_B.
 * @author DBFlute(AutoGenerator)
 */
public class TMoveRecordBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TMoveRecordBCQ _query;
    public TMoveRecordBNss(TMoveRecordBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MLocationNss withMLocation() {
        _query.xdoNss(() -> _query.queryMLocation());
        return new MLocationNss(_query.queryMLocation());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_MOVE_INST_B by my MOVE_INST_B_ID, named 'TMoveInstB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TMoveInstBNss withTMoveInstB() {
        _query.xdoNss(() -> _query.queryTMoveInstB());
        return new TMoveInstBNss(_query.queryTMoveInstB());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_MOVE_INST_H by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TMoveInstHNss withTMoveInstH() {
        _query.xdoNss(() -> _query.queryTMoveInstH());
        return new TMoveInstHNss(_query.queryTMoveInstH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my ALL_SHIPPING_FLG, named 'BClassDtlByAllShippingFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByAllShippingFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByAllShippingFlg());
        return new BClassDtlNss(_query.queryBClassDtlByAllShippingFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my STORE_NO_MERGE_FLG, named 'BClassDtlByStoreNoMergeFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStoreNoMergeFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStoreNoMergeFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStoreNoMergeFlg());
    }
}

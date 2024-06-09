package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TPackingRCQ;

/**
 * The nest select set-upper of T_PACKING_R.
 * @author DBFlute(AutoGenerator)
 */
public class TPackingRNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TPackingRCQ _query;
    public TPackingRNss(TPackingRCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_USER by my INSPECTION_OUT_USER_ID, named 'BUserByInspectionOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByInspectionOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByInspectionOutUserId());
        return new BUserNss(_query.queryBUserByInspectionOutUserId());
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
     * B_USER by my STW_OUT_USER_ID, named 'BUserByStwOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByStwOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByStwOutUserId());
        return new BUserNss(_query.queryBUserByStwOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_USER by my TAG_OUT_USER_ID, named 'BUserByTagOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByTagOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByTagOutUserId());
        return new BUserNss(_query.queryBUserByTagOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my STW_OUT_FLG, named 'BClassDtlByStwOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStwOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStwOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStwOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my TAG_OUT_FLG, named 'BClassDtlByTagOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByTagOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByTagOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByTagOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my INSPECTION_OUT_FLG, named 'BClassDtlByInspectionOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInspectionOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInspectionOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInspectionOutFlg());
    }
}

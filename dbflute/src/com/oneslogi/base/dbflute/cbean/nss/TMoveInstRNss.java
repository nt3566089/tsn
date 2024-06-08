package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TMoveInstRCQ;

/**
 * The nest select set-upper of T_MOVE_INST_R.
 * @author DBFlute(AutoGenerator)
 */
public class TMoveInstRNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TMoveInstRCQ _query;
    public TMoveInstRNss(TMoveInstRCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_USER by my INST_OUT_USER_ID, named 'BUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUser() {
        _query.xdoNss(() -> _query.queryBUser());
        return new BUserNss(_query.queryBUser());
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
     * B_CLASS_DTL by my INST_OUT_FLG, named 'BClassDtlByInstOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInstOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInstOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInstOutFlg());
    }
}

package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BMessageCQ;

/**
 * The nest select set-upper of B_MESSAGE.
 * @author DBFlute(AutoGenerator)
 */
public class BMessageNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BMessageCQ _query;
    public BMessageNss(BMessageCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BCultureNss withBCulture() {
        _query.xdoNss(() -> _query.queryBCulture());
        return new BCultureNss(_query.queryBCulture());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my MESSAGE_TYPE, named 'BClassDtlByMessageType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByMessageType() {
        _query.xdoNss(() -> _query.queryBClassDtlByMessageType());
        return new BClassDtlNss(_query.queryBClassDtlByMessageType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SYSTEM_TYPE, named 'BClassDtlBySystemType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySystemType() {
        _query.xdoNss(() -> _query.queryBClassDtlBySystemType());
        return new BClassDtlNss(_query.queryBClassDtlBySystemType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_HT_MESSAGE by MESSAGE_ID, named 'MHtMessageAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MHtMessageNss withMHtMessageAsOne() {
        _query.xdoNss(() -> _query.queryMHtMessageAsOne());
        return new MHtMessageNss(_query.queryMHtMessageAsOne());
    }
}

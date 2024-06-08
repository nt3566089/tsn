package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCenterCQ;

/**
 * The nest select set-upper of M_CENTER.
 * @author DBFlute(AutoGenerator)
 */
public class MCenterNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCenterCQ _query;
    public MCenterNss(MCenterCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_TIME_ZONE by my TIME_ZONE_ID, named 'BTimeZone'.
     */
    public void withBTimeZone() {
        _query.xdoNss(() -> _query.queryBTimeZone());
    }
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
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDelFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByDelFlg());
        return new BClassDtlNss(_query.queryBClassDtlByDelFlg());
    }
}

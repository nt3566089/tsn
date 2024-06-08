package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MShapeGrpCQ;

/**
 * The nest select set-upper of M_SHAPE_GRP.
 * @author DBFlute(AutoGenerator)
 */
public class MShapeGrpNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MShapeGrpCQ _query;
    public MShapeGrpNss(MShapeGrpCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MClientNss withMClient() {
        _query.xdoNss(() -> _query.queryMClient());
        return new MClientNss(_query.queryMClient());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my DECIMAL_EXIST_FLG, named 'BClassDtlByDecimalExistFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDecimalExistFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByDecimalExistFlg());
        return new BClassDtlNss(_query.queryBClassDtlByDecimalExistFlg());
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

package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MShapeCQ;

/**
 * The nest select set-upper of M_SHAPE.
 * @author DBFlute(AutoGenerator)
 */
public class MShapeNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MShapeCQ _query;
    public MShapeNss(MShapeCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * V_DICT by my SHAPE_DICT_ID, named 'VDictByShapeDictId'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVDictByShapeDictId(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVDictByShapeDictId(cultureId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * V_DICT by my SHAPE_UNIT_DICT_ID, named 'VDictByShapeUnitDictId'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVDictByShapeUnitDictId(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVDictByShapeUnitDictId(cultureId));
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

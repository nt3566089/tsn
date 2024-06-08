package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MNumberingCenterCQ;

/**
 * The nest select set-upper of M_NUMBERING_CENTER.
 * @author DBFlute(AutoGenerator)
 */
public class MNumberingCenterNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MNumberingCenterCQ _query;
    public MNumberingCenterNss(MNumberingCenterCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterNss withMCenter() {
        _query.xdoNss(() -> _query.queryMCenter());
        return new MCenterNss(_query.queryMCenter());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my USER_EDITABLE, named 'BClassDtlByUserEditable'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByUserEditable() {
        _query.xdoNss(() -> _query.queryBClassDtlByUserEditable());
        return new BClassDtlNss(_query.queryBClassDtlByUserEditable());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my CHECK_DIGIT, named 'BClassDtlByCheckDigit'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCheckDigit() {
        _query.xdoNss(() -> _query.queryBClassDtlByCheckDigit());
        return new BClassDtlNss(_query.queryBClassDtlByCheckDigit());
    }
}

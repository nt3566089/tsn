package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BColCQ;

/**
 * The nest select set-upper of B_COL.
 * @author DBFlute(AutoGenerator)
 */
public class BColNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BColCQ _query;
    public BColNss(BColCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BDictNss withBDict() {
        _query.xdoNss(() -> _query.queryBDict());
        return new BDictNss(_query.queryBDict());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_ITEM by my ITEM_ID, named 'BItem'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BItemNss withBItem() {
        _query.xdoNss(() -> _query.queryBItem());
        return new BItemNss(_query.queryBItem());
    }
    /**
     * With nested relation columns to select clause. <br>
     * V_DICT by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVDict(cultureId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * V_HT_DICT by my DICT_ID, named 'VHtDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVHtDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVHtDict(cultureId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my COL_TYPE, named 'BClassDtlByColType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByColType() {
        _query.xdoNss(() -> _query.queryBClassDtlByColType());
        return new BClassDtlNss(_query.queryBClassDtlByColType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByVisible() {
        _query.xdoNss(() -> _query.queryBClassDtlByVisible());
        return new BClassDtlNss(_query.queryBClassDtlByVisible());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my EDITABLE, named 'BClassDtlByEditable'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByEditable() {
        _query.xdoNss(() -> _query.queryBClassDtlByEditable());
        return new BClassDtlNss(_query.queryBClassDtlByEditable());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my TEXT_ALIGN, named 'BClassDtlByTextAlign'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByTextAlign() {
        _query.xdoNss(() -> _query.queryBClassDtlByTextAlign());
        return new BClassDtlNss(_query.queryBClassDtlByTextAlign());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my NECESSARY, named 'BClassDtlByNecessary'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByNecessary() {
        _query.xdoNss(() -> _query.queryBClassDtlByNecessary());
        return new BClassDtlNss(_query.queryBClassDtlByNecessary());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_COL_VALID by COL_ID, named 'BColValidAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BColValidNss withBColValidAsOne() {
        _query.xdoNss(() -> _query.queryBColValidAsOne());
        return new BColValidNss(_query.queryBColValidAsOne());
    }
}

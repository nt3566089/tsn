package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TCenterSymbolCQ;

/**
 * The nest select set-upper of T_CENTER_SYMBOL.
 * @author DBFlute(AutoGenerator)
 */
public class TCenterSymbolNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TCenterSymbolCQ _query;
    public TCenterSymbolNss(TCenterSymbolCQ query) { _query = query; }
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
     * T_CENTER_SYMBOL by my CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TCenterSymbolNss withTCenterSymbolSelf() {
        _query.xdoNss(() -> _query.queryTCenterSymbolSelf());
        return new TCenterSymbolNss(_query.queryTCenterSymbolSelf());
    }
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
     * T_TRSYMBOL by my TRSYMBOL_ID, named 'TTrsymbol'.
     */
    public void withTTrsymbol() {
        _query.xdoNss(() -> _query.queryTTrsymbol());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_PALLET by my PALLET_ID, named 'TPallet'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TPalletNss withTPallet() {
        _query.xdoNss(() -> _query.queryTPallet());
        return new TPalletNss(_query.queryTPallet());
    }
}

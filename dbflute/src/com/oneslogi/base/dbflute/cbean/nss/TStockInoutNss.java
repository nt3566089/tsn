package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TStockInoutCQ;

/**
 * The nest select set-upper of T_STOCK_INOUT.
 * @author DBFlute(AutoGenerator)
 */
public class TStockInoutNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TStockInoutCQ _query;
    public TStockInoutNss(TStockInoutCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TAllocInstBNss withTAllocInstB() {
        _query.xdoNss(() -> _query.queryTAllocInstB());
        return new TAllocInstBNss(_query.queryTAllocInstB());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_STOCK_INOUT by my FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStockInoutNss withTStockInoutByFsStockInoutIdSelf() {
        _query.xdoNss(() -> _query.queryTStockInoutByFsStockInoutIdSelf());
        return new TStockInoutNss(_query.queryTStockInoutByFsStockInoutIdSelf());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_STORE_RECORD_B by my STORE_RECORD_B_ID, named 'TStoreRecordB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStoreRecordBNss withTStoreRecordB() {
        _query.xdoNss(() -> _query.queryTStoreRecordB());
        return new TStoreRecordBNss(_query.queryTStoreRecordB());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProcessTypeNss withMProcessType() {
        _query.xdoNss(() -> _query.queryMProcessType());
        return new MProcessTypeNss(_query.queryMProcessType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_MOVE_RECORD_B by my MOVE_RECORD_B_ID, named 'TMoveRecordB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TMoveRecordBNss withTMoveRecordB() {
        _query.xdoNss(() -> _query.queryTMoveRecordB());
        return new TMoveRecordBNss(_query.queryTMoveRecordB());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStockNss withTStock() {
        _query.xdoNss(() -> _query.queryTStock());
        return new TStockNss(_query.queryTStock());
    }
    /**
     * With nested relation columns to select clause. <br>
     * T_STOCK_INOUT by my BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStockInoutNss withTStockInoutByBfStockInoutIdSelf() {
        _query.xdoNss(() -> _query.queryTStockInoutByBfStockInoutIdSelf());
        return new TStockInoutNss(_query.queryTStockInoutByBfStockInoutIdSelf());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my CORRECT_TYPE, named 'BClassDtlByCorrectType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCorrectType() {
        _query.xdoNss(() -> _query.queryBClassDtlByCorrectType());
        return new BClassDtlNss(_query.queryBClassDtlByCorrectType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInoutType() {
        _query.xdoNss(() -> _query.queryBClassDtlByInoutType());
        return new BClassDtlNss(_query.queryBClassDtlByInoutType());
    }
}

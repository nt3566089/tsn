package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MZipCQ;

/**
 * The nest select set-upper of M_ZIP.
 * @author DBFlute(AutoGenerator)
 */
public class MZipNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MZipCQ _query;
    public MZipNss(MZipCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my FLG6, named 'BClassDtlByFlg6'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByFlg6() {
        _query.xdoNss(() -> _query.queryBClassDtlByFlg6());
        return new BClassDtlNss(_query.queryBClassDtlByFlg6());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my FLG5, named 'BClassDtlByFlg5'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByFlg5() {
        _query.xdoNss(() -> _query.queryBClassDtlByFlg5());
        return new BClassDtlNss(_query.queryBClassDtlByFlg5());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my COMPANY_FLG, named 'BClassDtlByCompanyFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCompanyFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByCompanyFlg());
        return new BClassDtlNss(_query.queryBClassDtlByCompanyFlg());
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
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my REASON_TYPE, named 'BClassDtlByReasonType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByReasonType() {
        _query.xdoNss(() -> _query.queryBClassDtlByReasonType());
        return new BClassDtlNss(_query.queryBClassDtlByReasonType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my UPD_CD, named 'BClassDtlByUpdCd'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByUpdCd() {
        _query.xdoNss(() -> _query.queryBClassDtlByUpdCd());
        return new BClassDtlNss(_query.queryBClassDtlByUpdCd());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my UPD_TYPE, named 'BClassDtlByUpdType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByUpdType() {
        _query.xdoNss(() -> _query.queryBClassDtlByUpdType());
        return new BClassDtlNss(_query.queryBClassDtlByUpdType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my FLG1, named 'BClassDtlByFlg1'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByFlg1() {
        _query.xdoNss(() -> _query.queryBClassDtlByFlg1());
        return new BClassDtlNss(_query.queryBClassDtlByFlg1());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my FLG2, named 'BClassDtlByFlg2'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByFlg2() {
        _query.xdoNss(() -> _query.queryBClassDtlByFlg2());
        return new BClassDtlNss(_query.queryBClassDtlByFlg2());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my FLG3, named 'BClassDtlByFlg3'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByFlg3() {
        _query.xdoNss(() -> _query.queryBClassDtlByFlg3());
        return new BClassDtlNss(_query.queryBClassDtlByFlg3());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my FLG4, named 'BClassDtlByFlg4'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByFlg4() {
        _query.xdoNss(() -> _query.queryBClassDtlByFlg4());
        return new BClassDtlNss(_query.queryBClassDtlByFlg4());
    }
}

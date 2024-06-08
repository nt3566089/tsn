package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCarrierSlipYupkCQ;

/**
 * The nest select set-upper of M_CARRIER_SLIP_YUPK.
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipYupkNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCarrierSlipYupkCQ _query;
    public MCarrierSlipYupkNss(MCarrierSlipYupkCQ query) { _query = query; }
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
     * B_CLASS_DTL by my CHARACTER_CD, named 'BClassDtlByCharacterCd'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCharacterCd() {
        _query.xdoNss(() -> _query.queryBClassDtlByCharacterCd());
        return new BClassDtlNss(_query.queryBClassDtlByCharacterCd());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my COD_TYPE, named 'BClassDtlByCodType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCodType() {
        _query.xdoNss(() -> _query.queryBClassDtlByCodType());
        return new BClassDtlNss(_query.queryBClassDtlByCodType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my COOL_TYPE, named 'BClassDtlByCoolType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCoolType() {
        _query.xdoNss(() -> _query.queryBClassDtlByCoolType());
        return new BClassDtlNss(_query.queryBClassDtlByCoolType());
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
     * B_CLASS_DTL by my NO_STOCK_CLS, named 'BClassDtlByNoStockCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByNoStockCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByNoStockCls());
        return new BClassDtlNss(_query.queryBClassDtlByNoStockCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my NO_UPSIDE_DOWN_CLS, named 'BClassDtlByNoUpsideDownCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByNoUpsideDownCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByNoUpsideDownCls());
        return new BClassDtlNss(_query.queryBClassDtlByNoUpsideDownCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my POST_TYPE, named 'BClassDtlByPostType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPostType() {
        _query.xdoNss(() -> _query.queryBClassDtlByPostType());
        return new BClassDtlNss(_query.queryBClassDtlByPostType());
    }
}

package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCarrierSlipYmtCQ;

/**
 * The nest select set-upper of M_CARRIER_SLIP_YMT.
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipYmtNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCarrierSlipYmtCQ _query;
    public MCarrierSlipYmtNss(MCarrierSlipYmtCQ query) { _query = query; }
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
     * B_CLASS_DTL by my COOL_CLS, named 'BClassDtlByCoolCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCoolCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByCoolCls());
        return new BClassDtlNss(_query.queryBClassDtlByCoolCls());
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
     * B_CLASS_DTL by my PACKING_SHOW_FLG, named 'BClassDtlByPackingShowFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPackingShowFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByPackingShowFlg());
        return new BClassDtlNss(_query.queryBClassDtlByPackingShowFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SLIP_TYPE, named 'BClassDtlBySlipType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySlipType() {
        _query.xdoNss(() -> _query.queryBClassDtlBySlipType());
        return new BClassDtlNss(_query.queryBClassDtlBySlipType());
    }
}

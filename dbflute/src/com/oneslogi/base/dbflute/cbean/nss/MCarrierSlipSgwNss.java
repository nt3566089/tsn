package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCarrierSlipSgwCQ;

/**
 * The nest select set-upper of M_CARRIER_SLIP_SGW.
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipSgwNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCarrierSlipSgwCQ _query;
    public MCarrierSlipSgwNss(MCarrierSlipSgwCQ query) { _query = query; }
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
     * M_CENTER_CLASS_DTL by my API_BINSYU_CODE, named 'MCenterClassDtlByApiBinsyuCode'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlByApiBinsyuCode(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlByApiBinsyuCode(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlByApiBinsyuCode(centerId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my API_DAIBIKI_FLG, named 'MCenterClassDtlByApiDaibikiFlg'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlByApiDaibikiFlg(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlByApiDaibikiFlg(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlByApiDaibikiFlg(centerId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my API_DAIBIKI_TYPE, named 'MCenterClassDtlByApiDaibikiType'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlByApiDaibikiType(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlByApiDaibikiType(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlByApiDaibikiType(centerId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my API_EIDOME_FLG, named 'MCenterClassDtlByApiEidomeFlg'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlByApiEidomeFlg(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlByApiEidomeFlg(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlByApiEidomeFlg(centerId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my API_WEIGHT_CD_1, named 'MCenterClassDtlByApiWeightCd1'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlByApiWeightCd1(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlByApiWeightCd1(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlByApiWeightCd1(centerId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my API_WEIGHT_CD_2, named 'MCenterClassDtlByApiWeightCd2'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlByApiWeightCd2(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlByApiWeightCd2(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlByApiWeightCd2(centerId));
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
     * B_CLASS_DTL by my COD_CLS, named 'BClassDtlByCodCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCodCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByCodCls());
        return new BClassDtlNss(_query.queryBClassDtlByCodCls());
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
     * M_CENTER_CLASS_DTL by my SEAL_TYPE1, named 'MCenterClassDtlBySealType1'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlBySealType1(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlBySealType1(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlBySealType1(centerId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my SEAL_TYPE2, named 'MCenterClassDtlBySealType2'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlBySealType2(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlBySealType2(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlBySealType2(centerId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my SEAL_TYPE3, named 'MCenterClassDtlBySealType3'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlBySealType3(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlBySealType3(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlBySealType3(centerId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SETTLEMENT_TYPE, named 'BClassDtlBySettlementType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySettlementType() {
        _query.xdoNss(() -> _query.queryBClassDtlBySettlementType());
        return new BClassDtlNss(_query.queryBClassDtlBySettlementType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my SLIP_SHAPE_CD, named 'MCenterClassDtlBySlipShapeCd'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlBySlipShapeCd(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlBySlipShapeCd(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlBySlipShapeCd(centerId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_ITEM, named 'MCenterClassDtlByTransportTypeItem'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlByTransportTypeItem(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlByTransportTypeItem(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlByTransportTypeItem(centerId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_SPEED, named 'MCenterClassDtlByTransportTypeSpeed'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss withMCenterClassDtlByTransportTypeSpeed(final Long centerId) {
        _query.xdoNss(() -> _query.queryMCenterClassDtlByTransportTypeSpeed(centerId));
        return new MCenterClassDtlNss(_query.queryMCenterClassDtlByTransportTypeSpeed(centerId));
    }
}

package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of T_TRPALLETDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrpalletdetailCQ extends AbstractBsTTrpalletdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrpalletdetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrpalletdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRPALLETDETAIL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrpalletdetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrpalletdetailCIQ xcreateCIQ() {
        TTrpalletdetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrpalletdetailCIQ xnewCIQ() {
        return new TTrpalletdetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRPALLETDETAIL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrpalletdetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrpalletdetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trpalletdetailId;
    public ConditionValue xdfgetTrpalletdetailId()
    { if (_trpalletdetailId == null) { _trpalletdetailId = nCV(); }
      return _trpalletdetailId; }
    protected ConditionValue xgetCValueTrpalletdetailId() { return xdfgetTrpalletdetailId(); }

    /**
     * Add order-by as ascend. <br>
     * TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_TrpalletdetailId_Asc() { regOBA("TRPALLETDETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_TrpalletdetailId_Desc() { regOBD("TRPALLETDETAIL_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _palletDetailKey;
    public ConditionValue xdfgetPalletDetailKey()
    { if (_palletDetailKey == null) { _palletDetailKey = nCV(); }
      return _palletDetailKey; }
    protected ConditionValue xgetCValuePalletDetailKey() { return xdfgetPalletDetailKey(); }

    /**
     * Add order-by as ascend. <br>
     * PALLET_DETAIL_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_PalletDetailKey_Asc() { regOBA("PALLET_DETAIL_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLET_DETAIL_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_PalletDetailKey_Desc() { regOBD("PALLET_DETAIL_KEY"); return this; }

    protected ConditionValue _inoutType;
    public ConditionValue xdfgetInoutType()
    { if (_inoutType == null) { _inoutType = nCV(); }
      return _inoutType; }
    protected ConditionValue xgetCValueInoutType() { return xdfgetInoutType(); }

    /**
     * Add order-by as ascend. <br>
     * INOUT_TYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_InoutType_Asc() { regOBA("INOUT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INOUT_TYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_InoutType_Desc() { regOBD("INOUT_TYPE"); return this; }

    protected ConditionValue _trpalletId;
    public ConditionValue xdfgetTrpalletId()
    { if (_trpalletId == null) { _trpalletId = nCV(); }
      return _trpalletId; }
    protected ConditionValue xgetCValueTrpalletId() { return xdfgetTrpalletId(); }

    /**
     * Add order-by as ascend. <br>
     * TRPALLET_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_TrpalletId_Asc() { regOBA("TRPALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRPALLET_ID: {IX, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_TrpalletId_Desc() { regOBD("TRPALLET_ID"); return this; }

    protected ConditionValue _basePalletNo;
    public ConditionValue xdfgetBasePalletNo()
    { if (_basePalletNo == null) { _basePalletNo = nCV(); }
      return _basePalletNo; }
    protected ConditionValue xgetCValueBasePalletNo() { return xdfgetBasePalletNo(); }

    /**
     * Add order-by as ascend. <br>
     * BASE_PALLET_NO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_BasePalletNo_Asc() { regOBA("BASE_PALLET_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_PALLET_NO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_BasePalletNo_Desc() { regOBD("BASE_PALLET_NO"); return this; }

    protected ConditionValue _divPalletNo;
    public ConditionValue xdfgetDivPalletNo()
    { if (_divPalletNo == null) { _divPalletNo = nCV(); }
      return _divPalletNo; }
    protected ConditionValue xgetCValueDivPalletNo() { return xdfgetDivPalletNo(); }

    /**
     * Add order-by as ascend. <br>
     * DIV_PALLET_NO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_DivPalletNo_Asc() { regOBA("DIV_PALLET_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIV_PALLET_NO: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_DivPalletNo_Desc() { regOBD("DIV_PALLET_NO"); return this; }

    protected ConditionValue _workType;
    public ConditionValue xdfgetWorkType()
    { if (_workType == null) { _workType = nCV(); }
      return _workType; }
    protected ConditionValue xgetCValueWorkType() { return xdfgetWorkType(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_TYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_WorkType_Asc() { regOBA("WORK_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_TYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_WorkType_Desc() { regOBD("WORK_TYPE"); return this; }

    protected ConditionValue _workKey;
    public ConditionValue xdfgetWorkKey()
    { if (_workKey == null) { _workKey = nCV(); }
      return _workKey; }
    protected ConditionValue xgetCValueWorkKey() { return xdfgetWorkKey(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_KEY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_WorkKey_Asc() { regOBA("WORK_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_KEY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_WorkKey_Desc() { regOBD("WORK_KEY"); return this; }

    protected ConditionValue _registrationDate;
    public ConditionValue xdfgetRegistrationDate()
    { if (_registrationDate == null) { _registrationDate = nCV(); }
      return _registrationDate; }
    protected ConditionValue xgetCValueRegistrationDate() { return xdfgetRegistrationDate(); }

    /**
     * Add order-by as ascend. <br>
     * REGISTRATION_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_RegistrationDate_Asc() { regOBA("REGISTRATION_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTRATION_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_RegistrationDate_Desc() { regOBD("REGISTRATION_DATE"); return this; }

    protected ConditionValue _workDate;
    public ConditionValue xdfgetWorkDate()
    { if (_workDate == null) { _workDate = nCV(); }
      return _workDate; }
    protected ConditionValue xgetCValueWorkDate() { return xdfgetWorkDate(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_DATE: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_WorkDate_Asc() { regOBA("WORK_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_DATE: {NotNull, datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_WorkDate_Desc() { regOBD("WORK_DATE"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _designFlg;
    public ConditionValue xdfgetDesignFlg()
    { if (_designFlg == null) { _designFlg = nCV(); }
      return _designFlg; }
    protected ConditionValue xgetCValueDesignFlg() { return xdfgetDesignFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGN_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_DesignFlg_Asc() { regOBA("DESIGN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGN_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_DesignFlg_Desc() { regOBD("DESIGN_FLG"); return this; }

    protected ConditionValue _limitDate;
    public ConditionValue xdfgetLimitDate()
    { if (_limitDate == null) { _limitDate = nCV(); }
      return _limitDate; }
    protected ConditionValue xgetCValueLimitDate() { return xdfgetLimitDate(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_LimitDate_Asc() { regOBA("LIMIT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_LimitDate_Desc() { regOBD("LIMIT_DATE"); return this; }

    protected ConditionValue _firmCarryNo;
    public ConditionValue xdfgetFirmCarryNo()
    { if (_firmCarryNo == null) { _firmCarryNo = nCV(); }
      return _firmCarryNo; }
    protected ConditionValue xgetCValueFirmCarryNo() { return xdfgetFirmCarryNo(); }

    /**
     * Add order-by as ascend. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_FirmCarryNo_Asc() { regOBA("FIRM_CARRY_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRM_CARRY_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_FirmCarryNo_Desc() { regOBD("FIRM_CARRY_NO"); return this; }

    protected ConditionValue _batArticleSign;
    public ConditionValue xdfgetBatArticleSign()
    { if (_batArticleSign == null) { _batArticleSign = nCV(); }
      return _batArticleSign; }
    protected ConditionValue xgetCValueBatArticleSign() { return xdfgetBatArticleSign(); }

    /**
     * Add order-by as ascend. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_BatArticleSign_Asc() { regOBA("BAT_ARTICLE_SIGN"); return this; }

    /**
     * Add order-by as descend. <br>
     * BAT_ARTICLE_SIGN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_BatArticleSign_Desc() { regOBD("BAT_ARTICLE_SIGN"); return this; }

    protected ConditionValue _moveBLlocationId;
    public ConditionValue xdfgetMoveBLlocationId()
    { if (_moveBLlocationId == null) { _moveBLlocationId = nCV(); }
      return _moveBLlocationId; }
    protected ConditionValue xgetCValueMoveBLlocationId() { return xdfgetMoveBLlocationId(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_B_LLOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_MoveBLlocationId_Asc() { regOBA("MOVE_B_LLOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_B_LLOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_MoveBLlocationId_Desc() { regOBD("MOVE_B_LLOCATION_ID"); return this; }

    protected ConditionValue _moveBLocationCd;
    public ConditionValue xdfgetMoveBLocationCd()
    { if (_moveBLocationCd == null) { _moveBLocationCd = nCV(); }
      return _moveBLocationCd; }
    protected ConditionValue xgetCValueMoveBLocationCd() { return xdfgetMoveBLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_MoveBLocationCd_Asc() { regOBA("MOVE_B_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_B_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_MoveBLocationCd_Desc() { regOBD("MOVE_B_LOCATION_CD"); return this; }

    protected ConditionValue _moveALocationId;
    public ConditionValue xdfgetMoveALocationId()
    { if (_moveALocationId == null) { _moveALocationId = nCV(); }
      return _moveALocationId; }
    protected ConditionValue xgetCValueMoveALocationId() { return xdfgetMoveALocationId(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_A_LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_MoveALocationId_Asc() { regOBA("MOVE_A_LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_A_LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_MoveALocationId_Desc() { regOBD("MOVE_A_LOCATION_ID"); return this; }

    protected ConditionValue _moveALocationCd;
    public ConditionValue xdfgetMoveALocationCd()
    { if (_moveALocationCd == null) { _moveALocationCd = nCV(); }
      return _moveALocationCd; }
    protected ConditionValue xgetCValueMoveALocationCd() { return xdfgetMoveALocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_MoveALocationCd_Asc() { regOBA("MOVE_A_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_A_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_MoveALocationCd_Desc() { regOBD("MOVE_A_LOCATION_CD"); return this; }

    protected ConditionValue _instNum;
    public ConditionValue xdfgetInstNum()
    { if (_instNum == null) { _instNum = nCV(); }
      return _instNum; }
    protected ConditionValue xgetCValueInstNum() { return xdfgetInstNum(); }

    /**
     * Add order-by as ascend. <br>
     * INST_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_InstNum_Asc() { regOBA("INST_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INST_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_InstNum_Desc() { regOBD("INST_NUM"); return this; }

    protected ConditionValue _restQtyCase;
    public ConditionValue xdfgetRestQtyCase()
    { if (_restQtyCase == null) { _restQtyCase = nCV(); }
      return _restQtyCase; }
    protected ConditionValue xgetCValueRestQtyCase() { return xdfgetRestQtyCase(); }

    /**
     * Add order-by as ascend. <br>
     * REST_QTY_CASE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_RestQtyCase_Asc() { regOBA("REST_QTY_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * REST_QTY_CASE: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_RestQtyCase_Desc() { regOBD("REST_QTY_CASE"); return this; }

    protected ConditionValue _restQtyBowl;
    public ConditionValue xdfgetRestQtyBowl()
    { if (_restQtyBowl == null) { _restQtyBowl = nCV(); }
      return _restQtyBowl; }
    protected ConditionValue xgetCValueRestQtyBowl() { return xdfgetRestQtyBowl(); }

    /**
     * Add order-by as ascend. <br>
     * REST_QTY_BOWL: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_RestQtyBowl_Asc() { regOBA("REST_QTY_BOWL"); return this; }

    /**
     * Add order-by as descend. <br>
     * REST_QTY_BOWL: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_RestQtyBowl_Desc() { regOBD("REST_QTY_BOWL"); return this; }

    protected ConditionValue _restQty;
    public ConditionValue xdfgetRestQty()
    { if (_restQty == null) { _restQty = nCV(); }
      return _restQty; }
    protected ConditionValue xgetCValueRestQty() { return xdfgetRestQty(); }

    /**
     * Add order-by as ascend. <br>
     * REST_QTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_RestQty_Asc() { regOBA("REST_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * REST_QTY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_RestQty_Desc() { regOBD("REST_QTY"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTTrpalletdetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrpalletdetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrpalletdetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrpalletdetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrpalletdetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrpalletdetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrpalletdetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrpalletdetailCQ> _myselfExistsMap;
    public Map<String, TTrpalletdetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrpalletdetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrpalletdetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrpalletdetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrpalletdetailCB.class.getName(); }
    protected String xCQ() { return TTrpalletdetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

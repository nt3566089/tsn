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
 * The base condition-query of E_CORDDTAAM_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class BsECorddtaamSendCQ extends AbstractBsECorddtaamSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ECorddtaamSendCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsECorddtaamSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_CORDDTAAM_SEND) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ECorddtaamSendCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ECorddtaamSendCIQ xcreateCIQ() {
        ECorddtaamSendCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ECorddtaamSendCIQ xnewCIQ() {
        return new ECorddtaamSendCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_CORDDTAAM_SEND on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ECorddtaamSendCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ECorddtaamSendCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _corddtaamSendId;
    public ConditionValue xdfgetCorddtaamSendId()
    { if (_corddtaamSendId == null) { _corddtaamSendId = nCV(); }
      return _corddtaamSendId; }
    protected ConditionValue xgetCValueCorddtaamSendId() { return xdfgetCorddtaamSendId(); }

    /**
     * Add order-by as ascend. <br>
     * CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_CorddtaamSendId_Asc() { regOBA("CORDDTAAM_SEND_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_CorddtaamSendId_Desc() { regOBD("CORDDTAAM_SEND_ID"); return this; }

    protected ConditionValue _sendCd;
    public ConditionValue xdfgetSendCd()
    { if (_sendCd == null) { _sendCd = nCV(); }
      return _sendCd; }
    protected ConditionValue xgetCValueSendCd() { return xdfgetSendCd(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

    protected ConditionValue _sendRowId;
    public ConditionValue xdfgetSendRowId()
    { if (_sendRowId == null) { _sendRowId = nCV(); }
      return _sendRowId; }
    protected ConditionValue xgetCValueSendRowId() { return xdfgetSendRowId(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_SendRowId_Asc() { regOBA("SEND_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_SendRowId_Desc() { regOBD("SEND_ROW_ID"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _delivayCenterCd;
    public ConditionValue xdfgetDelivayCenterCd()
    { if (_delivayCenterCd == null) { _delivayCenterCd = nCV(); }
      return _delivayCenterCd; }
    protected ConditionValue xgetCValueDelivayCenterCd() { return xdfgetDelivayCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DelivayCenterCd_Asc() { regOBA("DELIVAY_CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DelivayCenterCd_Desc() { regOBD("DELIVAY_CENTER_CD"); return this; }

    protected ConditionValue _deliveryDatetime;
    public ConditionValue xdfgetDeliveryDatetime()
    { if (_deliveryDatetime == null) { _deliveryDatetime = nCV(); }
      return _deliveryDatetime; }
    protected ConditionValue xgetCValueDeliveryDatetime() { return xdfgetDeliveryDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DeliveryDatetime_Asc() { regOBA("DELIVERY_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DeliveryDatetime_Desc() { regOBD("DELIVERY_DATETIME"); return this; }

    protected ConditionValue _directionCd;
    public ConditionValue xdfgetDirectionCd()
    { if (_directionCd == null) { _directionCd = nCV(); }
      return _directionCd; }
    protected ConditionValue xgetCValueDirectionCd() { return xdfgetDirectionCd(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DirectionCd_Asc() { regOBA("DIRECTION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DirectionCd_Desc() { regOBD("DIRECTION_CD"); return this; }

    protected ConditionValue _pistonType;
    public ConditionValue xdfgetPistonType()
    { if (_pistonType == null) { _pistonType = nCV(); }
      return _pistonType; }
    protected ConditionValue xgetCValuePistonType() { return xdfgetPistonType(); }

    /**
     * Add order-by as ascend. <br>
     * PISTON_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_PistonType_Asc() { regOBA("PISTON_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PISTON_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_PistonType_Desc() { regOBD("PISTON_TYPE"); return this; }

    protected ConditionValue _capDirectionCd;
    public ConditionValue xdfgetCapDirectionCd()
    { if (_capDirectionCd == null) { _capDirectionCd = nCV(); }
      return _capDirectionCd; }
    protected ConditionValue xgetCValueCapDirectionCd() { return xdfgetCapDirectionCd(); }

    /**
     * Add order-by as ascend. <br>
     * CAP_DIRECTION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_CapDirectionCd_Asc() { regOBA("CAP_DIRECTION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CAP_DIRECTION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_CapDirectionCd_Desc() { regOBD("CAP_DIRECTION_CD"); return this; }

    protected ConditionValue _capPistonType;
    public ConditionValue xdfgetCapPistonType()
    { if (_capPistonType == null) { _capPistonType = nCV(); }
      return _capPistonType; }
    protected ConditionValue xgetCValueCapPistonType() { return xdfgetCapPistonType(); }

    /**
     * Add order-by as ascend. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_CapPistonType_Asc() { regOBA("CAP_PISTON_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_CapPistonType_Desc() { regOBD("CAP_PISTON_TYPE"); return this; }

    protected ConditionValue _sortLineCd;
    public ConditionValue xdfgetSortLineCd()
    { if (_sortLineCd == null) { _sortLineCd = nCV(); }
      return _sortLineCd; }
    protected ConditionValue xgetCValueSortLineCd() { return xdfgetSortLineCd(); }

    /**
     * Add order-by as ascend. <br>
     * SORT_LINE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_SortLineCd_Asc() { regOBA("SORT_LINE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_LINE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_SortLineCd_Desc() { regOBD("SORT_LINE_CD"); return this; }

    protected ConditionValue _sortOrder;
    public ConditionValue xdfgetSortOrder()
    { if (_sortOrder == null) { _sortOrder = nCV(); }
      return _sortOrder; }
    protected ConditionValue xgetCValueSortOrder() { return xdfgetSortOrder(); }

    /**
     * Add order-by as ascend. <br>
     * SORT_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_SortOrder_Asc() { regOBA("SORT_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_SortOrder_Desc() { regOBD("SORT_ORDER"); return this; }

    protected ConditionValue _customerCd;
    public ConditionValue xdfgetCustomerCd()
    { if (_customerCd == null) { _customerCd = nCV(); }
      return _customerCd; }
    protected ConditionValue xgetCValueCustomerCd() { return xdfgetCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

    protected ConditionValue _customerNm;
    public ConditionValue xdfgetCustomerNm()
    { if (_customerNm == null) { _customerNm = nCV(); }
      return _customerNm; }
    protected ConditionValue xgetCValueCustomerNm() { return xdfgetCustomerNm(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_CustomerNm_Asc() { regOBA("CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_CustomerNm_Desc() { regOBD("CUSTOMER_NM"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _slqacb;
    public ConditionValue xdfgetSlqacb()
    { if (_slqacb == null) { _slqacb = nCV(); }
      return _slqacb; }
    protected ConditionValue xgetCValueSlqacb() { return xdfgetSlqacb(); }

    /**
     * Add order-by as ascend. <br>
     * SLQACB: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_Slqacb_Asc() { regOBA("SLQACB"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLQACB: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_Slqacb_Desc() { regOBD("SLQACB"); return this; }

    protected ConditionValue _slqact;
    public ConditionValue xdfgetSlqact()
    { if (_slqact == null) { _slqact = nCV(); }
      return _slqact; }
    protected ConditionValue xgetCValueSlqact() { return xdfgetSlqact(); }

    /**
     * Add order-by as ascend. <br>
     * SLQACT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_Slqact_Asc() { regOBA("SLQACT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLQACT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_Slqact_Desc() { regOBD("SLQACT"); return this; }

    protected ConditionValue _lineBlock;
    public ConditionValue xdfgetLineBlock()
    { if (_lineBlock == null) { _lineBlock = nCV(); }
      return _lineBlock; }
    protected ConditionValue xgetCValueLineBlock() { return xdfgetLineBlock(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_BLOCK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_LineBlock_Asc() { regOBA("LINE_BLOCK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_BLOCK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_LineBlock_Desc() { regOBD("LINE_BLOCK"); return this; }

    protected ConditionValue _locationNo;
    public ConditionValue xdfgetLocationNo()
    { if (_locationNo == null) { _locationNo = nCV(); }
      return _locationNo; }
    protected ConditionValue xgetCValueLocationNo() { return xdfgetLocationNo(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_LocationNo_Asc() { regOBA("LOCATION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_LocationNo_Desc() { regOBD("LOCATION_NO"); return this; }

    protected ConditionValue _locationType;
    public ConditionValue xdfgetLocationType()
    { if (_locationType == null) { _locationType = nCV(); }
      return _locationType; }
    protected ConditionValue xgetCValueLocationType() { return xdfgetLocationType(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_LocationType_Asc() { regOBA("LOCATION_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_LocationType_Desc() { regOBD("LOCATION_TYPE"); return this; }

    protected ConditionValue _deliveryPrintRank;
    public ConditionValue xdfgetDeliveryPrintRank()
    { if (_deliveryPrintRank == null) { _deliveryPrintRank = nCV(); }
      return _deliveryPrintRank; }
    protected ConditionValue xgetCValueDeliveryPrintRank() { return xdfgetDeliveryPrintRank(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DeliveryPrintRank_Asc() { regOBA("DELIVERY_PRINT_RANK"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DeliveryPrintRank_Desc() { regOBD("DELIVERY_PRINT_RANK"); return this; }

    protected ConditionValue _deliverySeqNo;
    public ConditionValue xdfgetDeliverySeqNo()
    { if (_deliverySeqNo == null) { _deliverySeqNo = nCV(); }
      return _deliverySeqNo; }
    protected ConditionValue xgetCValueDeliverySeqNo() { return xdfgetDeliverySeqNo(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DeliverySeqNo_Asc() { regOBA("DELIVERY_SEQ_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DeliverySeqNo_Desc() { regOBD("DELIVERY_SEQ_NO"); return this; }

    protected ConditionValue _deliveryBranchNo;
    public ConditionValue xdfgetDeliveryBranchNo()
    { if (_deliveryBranchNo == null) { _deliveryBranchNo = nCV(); }
      return _deliveryBranchNo; }
    protected ConditionValue xgetCValueDeliveryBranchNo() { return xdfgetDeliveryBranchNo(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DeliveryBranchNo_Asc() { regOBA("DELIVERY_BRANCH_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DeliveryBranchNo_Desc() { regOBD("DELIVERY_BRANCH_NO"); return this; }

    protected ConditionValue _sortWorkDt;
    public ConditionValue xdfgetSortWorkDt()
    { if (_sortWorkDt == null) { _sortWorkDt = nCV(); }
      return _sortWorkDt; }
    protected ConditionValue xgetCValueSortWorkDt() { return xdfgetSortWorkDt(); }

    /**
     * Add order-by as ascend. <br>
     * SORT_WORK_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_SortWorkDt_Asc() { regOBA("SORT_WORK_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_WORK_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_SortWorkDt_Desc() { regOBD("SORT_WORK_DT"); return this; }

    protected ConditionValue _csroprtcnt;
    public ConditionValue xdfgetCsroprtcnt()
    { if (_csroprtcnt == null) { _csroprtcnt = nCV(); }
      return _csroprtcnt; }
    protected ConditionValue xgetCValueCsroprtcnt() { return xdfgetCsroprtcnt(); }

    /**
     * Add order-by as ascend. <br>
     * CSROPRTCNT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_Csroprtcnt_Asc() { regOBA("CSROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CSROPRTCNT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_Csroprtcnt_Desc() { regOBD("CSROPRTCNT"); return this; }

    protected ConditionValue _cuttopdirassord;
    public ConditionValue xdfgetCuttopdirassord()
    { if (_cuttopdirassord == null) { _cuttopdirassord = nCV(); }
      return _cuttopdirassord; }
    protected ConditionValue xgetCValueCuttopdirassord() { return xdfgetCuttopdirassord(); }

    /**
     * Add order-by as ascend. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_Cuttopdirassord_Asc() { regOBA("CUTTOPDIRASSORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_Cuttopdirassord_Desc() { regOBD("CUTTOPDIRASSORD"); return this; }

    protected ConditionValue _productType;
    public ConditionValue xdfgetProductType()
    { if (_productType == null) { _productType = nCV(); }
      return _productType; }
    protected ConditionValue xgetCValueProductType() { return xdfgetProductType(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_ProductType_Asc() { regOBA("PRODUCT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_ProductType_Desc() { regOBD("PRODUCT_TYPE"); return this; }

    protected ConditionValue _boxNo;
    public ConditionValue xdfgetBoxNo()
    { if (_boxNo == null) { _boxNo = nCV(); }
      return _boxNo; }
    protected ConditionValue xgetCValueBoxNo() { return xdfgetBoxNo(); }

    /**
     * Add order-by as ascend. <br>
     * BOX_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_BoxNo_Asc() { regOBA("BOX_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_BoxNo_Desc() { regOBD("BOX_NO"); return this; }

    protected ConditionValue _boxNoSeqNo;
    public ConditionValue xdfgetBoxNoSeqNo()
    { if (_boxNoSeqNo == null) { _boxNoSeqNo = nCV(); }
      return _boxNoSeqNo; }
    protected ConditionValue xgetCValueBoxNoSeqNo() { return xdfgetBoxNoSeqNo(); }

    /**
     * Add order-by as ascend. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_BoxNoSeqNo_Asc() { regOBA("BOX_NO_SEQ_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_BoxNoSeqNo_Desc() { regOBD("BOX_NO_SEQ_NO"); return this; }

    protected ConditionValue _boxType;
    public ConditionValue xdfgetBoxType()
    { if (_boxType == null) { _boxType = nCV(); }
      return _boxType; }
    protected ConditionValue xgetCValueBoxType() { return xdfgetBoxType(); }

    /**
     * Add order-by as ascend. <br>
     * BOX_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_BoxType_Asc() { regOBA("BOX_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_BoxType_Desc() { regOBD("BOX_TYPE"); return this; }

    protected ConditionValue _mergeBoxVisibleType;
    public ConditionValue xdfgetMergeBoxVisibleType()
    { if (_mergeBoxVisibleType == null) { _mergeBoxVisibleType = nCV(); }
      return _mergeBoxVisibleType; }
    protected ConditionValue xgetCValueMergeBoxVisibleType() { return xdfgetMergeBoxVisibleType(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_MergeBoxVisibleType_Asc() { regOBA("MERGE_BOX_VISIBLE_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_MergeBoxVisibleType_Desc() { regOBD("MERGE_BOX_VISIBLE_TYPE"); return this; }

    protected ConditionValue _dmVisibleType;
    public ConditionValue xdfgetDmVisibleType()
    { if (_dmVisibleType == null) { _dmVisibleType = nCV(); }
      return _dmVisibleType; }
    protected ConditionValue xgetCValueDmVisibleType() { return xdfgetDmVisibleType(); }

    /**
     * Add order-by as ascend. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DmVisibleType_Asc() { regOBA("DM_VISIBLE_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DmVisibleType_Desc() { regOBD("DM_VISIBLE_TYPE"); return this; }

    protected ConditionValue _totalBoxCnt;
    public ConditionValue xdfgetTotalBoxCnt()
    { if (_totalBoxCnt == null) { _totalBoxCnt = nCV(); }
      return _totalBoxCnt; }
    protected ConditionValue xgetCValueTotalBoxCnt() { return xdfgetTotalBoxCnt(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_TotalBoxCnt_Asc() { regOBA("TOTAL_BOX_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_TotalBoxCnt_Desc() { regOBD("TOTAL_BOX_CNT"); return this; }

    protected ConditionValue _boxCartonSum;
    public ConditionValue xdfgetBoxCartonSum()
    { if (_boxCartonSum == null) { _boxCartonSum = nCV(); }
      return _boxCartonSum; }
    protected ConditionValue xgetCValueBoxCartonSum() { return xdfgetBoxCartonSum(); }

    /**
     * Add order-by as ascend. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_BoxCartonSum_Asc() { regOBA("BOX_CARTON_SUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_BoxCartonSum_Desc() { regOBD("BOX_CARTON_SUM"); return this; }

    protected ConditionValue _boxCartonSortNum;
    public ConditionValue xdfgetBoxCartonSortNum()
    { if (_boxCartonSortNum == null) { _boxCartonSortNum = nCV(); }
      return _boxCartonSortNum; }
    protected ConditionValue xgetCValueBoxCartonSortNum() { return xdfgetBoxCartonSortNum(); }

    /**
     * Add order-by as ascend. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_BoxCartonSortNum_Asc() { regOBA("BOX_CARTON_SORT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_BoxCartonSortNum_Desc() { regOBD("BOX_CARTON_SORT_NUM"); return this; }

    protected ConditionValue _tttopdedrnk;
    public ConditionValue xdfgetTttopdedrnk()
    { if (_tttopdedrnk == null) { _tttopdedrnk = nCV(); }
      return _tttopdedrnk; }
    protected ConditionValue xgetCValueTttopdedrnk() { return xdfgetTttopdedrnk(); }

    /**
     * Add order-by as ascend. <br>
     * TTTOPDEDRNK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_Tttopdedrnk_Asc() { regOBA("TTTOPDEDRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * TTTOPDEDRNK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_Tttopdedrnk_Desc() { regOBD("TTTOPDEDRNK"); return this; }

    protected ConditionValue _lineBlockBoxNo;
    public ConditionValue xdfgetLineBlockBoxNo()
    { if (_lineBlockBoxNo == null) { _lineBlockBoxNo = nCV(); }
      return _lineBlockBoxNo; }
    protected ConditionValue xgetCValueLineBlockBoxNo() { return xdfgetLineBlockBoxNo(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_LineBlockBoxNo_Asc() { regOBA("LINE_BLOCK_BOX_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_LineBlockBoxNo_Desc() { regOBD("LINE_BLOCK_BOX_NO"); return this; }

    protected ConditionValue _lineBlockTotalBoxCnt;
    public ConditionValue xdfgetLineBlockTotalBoxCnt()
    { if (_lineBlockTotalBoxCnt == null) { _lineBlockTotalBoxCnt = nCV(); }
      return _lineBlockTotalBoxCnt; }
    protected ConditionValue xgetCValueLineBlockTotalBoxCnt() { return xdfgetLineBlockTotalBoxCnt(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_LineBlockTotalBoxCnt_Asc() { regOBA("LINE_BLOCK_TOTAL_BOX_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_LineBlockTotalBoxCnt_Desc() { regOBD("LINE_BLOCK_TOTAL_BOX_CNT"); return this; }

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
    public BsECorddtaamSendCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsECorddtaamSendCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsECorddtaamSendCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsECorddtaamSendCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsECorddtaamSendCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsECorddtaamSendCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsECorddtaamSendCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsECorddtaamSendCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsECorddtaamSendCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsECorddtaamSendCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsECorddtaamSendCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsECorddtaamSendCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ECorddtaamSendCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ECorddtaamSendCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ECorddtaamSendCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ECorddtaamSendCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ECorddtaamSendCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ECorddtaamSendCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ECorddtaamSendCQ> _myselfExistsMap;
    public Map<String, ECorddtaamSendCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ECorddtaamSendCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ECorddtaamSendCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ECorddtaamSendCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ECorddtaamSendCB.class.getName(); }
    protected String xCQ() { return ECorddtaamSendCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

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
 * The base condition-query of E_DUTY_FREE_INOUT_RESULT.
 * @author DBFlute(AutoGenerator)
 */
public class BsEDutyFreeInoutResultCQ extends AbstractBsEDutyFreeInoutResultCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EDutyFreeInoutResultCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEDutyFreeInoutResultCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_DUTY_FREE_INOUT_RESULT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EDutyFreeInoutResultCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EDutyFreeInoutResultCIQ xcreateCIQ() {
        EDutyFreeInoutResultCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EDutyFreeInoutResultCIQ xnewCIQ() {
        return new EDutyFreeInoutResultCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_DUTY_FREE_INOUT_RESULT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EDutyFreeInoutResultCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EDutyFreeInoutResultCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _dutyFreeInoutResultId;
    public ConditionValue xdfgetDutyFreeInoutResultId()
    { if (_dutyFreeInoutResultId == null) { _dutyFreeInoutResultId = nCV(); }
      return _dutyFreeInoutResultId; }
    protected ConditionValue xgetCValueDutyFreeInoutResultId() { return xdfgetDutyFreeInoutResultId(); }

    /**
     * Add order-by as ascend. <br>
     * DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_DutyFreeInoutResultId_Asc() { regOBA("DUTY_FREE_INOUT_RESULT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_DutyFreeInoutResultId_Desc() { regOBD("DUTY_FREE_INOUT_RESULT_ID"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_SendRowId_Asc() { regOBA("SEND_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SendRowId_Desc() { regOBD("SEND_ROW_ID"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _symbolPosKey;
    public ConditionValue xdfgetSymbolPosKey()
    { if (_symbolPosKey == null) { _symbolPosKey = nCV(); }
      return _symbolPosKey; }
    protected ConditionValue xgetCValueSymbolPosKey() { return xdfgetSymbolPosKey(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolPosKey_Asc() { regOBA("SYMBOL_POS_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolPosKey_Desc() { regOBD("SYMBOL_POS_KEY"); return this; }

    protected ConditionValue _warehouseCd;
    public ConditionValue xdfgetWarehouseCd()
    { if (_warehouseCd == null) { _warehouseCd = nCV(); }
      return _warehouseCd; }
    protected ConditionValue xgetCValueWarehouseCd() { return xdfgetWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

    protected ConditionValue _symbolFactoryCd;
    public ConditionValue xdfgetSymbolFactoryCd()
    { if (_symbolFactoryCd == null) { _symbolFactoryCd = nCV(); }
      return _symbolFactoryCd; }
    protected ConditionValue xgetCValueSymbolFactoryCd() { return xdfgetSymbolFactoryCd(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolFactoryCd_Asc() { regOBA("SYMBOL_FACTORY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolFactoryCd_Desc() { regOBD("SYMBOL_FACTORY_CD"); return this; }

    protected ConditionValue _symbolItemCd;
    public ConditionValue xdfgetSymbolItemCd()
    { if (_symbolItemCd == null) { _symbolItemCd = nCV(); }
      return _symbolItemCd; }
    protected ConditionValue xgetCValueSymbolItemCd() { return xdfgetSymbolItemCd(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolItemCd_Asc() { regOBA("SYMBOL_ITEM_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolItemCd_Desc() { regOBD("SYMBOL_ITEM_CD"); return this; }

    protected ConditionValue _symbolSku;
    public ConditionValue xdfgetSymbolSku()
    { if (_symbolSku == null) { _symbolSku = nCV(); }
      return _symbolSku; }
    protected ConditionValue xgetCValueSymbolSku() { return xdfgetSymbolSku(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_SKU: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolSku_Asc() { regOBA("SYMBOL_SKU"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_SKU: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolSku_Desc() { regOBD("SYMBOL_SKU"); return this; }

    protected ConditionValue _symbolReceiveCd;
    public ConditionValue xdfgetSymbolReceiveCd()
    { if (_symbolReceiveCd == null) { _symbolReceiveCd = nCV(); }
      return _symbolReceiveCd; }
    protected ConditionValue xgetCValueSymbolReceiveCd() { return xdfgetSymbolReceiveCd(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolReceiveCd_Asc() { regOBA("SYMBOL_RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolReceiveCd_Desc() { regOBD("SYMBOL_RECEIVE_CD"); return this; }

    protected ConditionValue _symbolProductMark;
    public ConditionValue xdfgetSymbolProductMark()
    { if (_symbolProductMark == null) { _symbolProductMark = nCV(); }
      return _symbolProductMark; }
    protected ConditionValue xgetCValueSymbolProductMark() { return xdfgetSymbolProductMark(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolProductMark_Asc() { regOBA("SYMBOL_PRODUCT_MARK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolProductMark_Desc() { regOBD("SYMBOL_PRODUCT_MARK"); return this; }

    protected ConditionValue _symbolOrderno;
    public ConditionValue xdfgetSymbolOrderno()
    { if (_symbolOrderno == null) { _symbolOrderno = nCV(); }
      return _symbolOrderno; }
    protected ConditionValue xgetCValueSymbolOrderno() { return xdfgetSymbolOrderno(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolOrderno_Asc() { regOBA("SYMBOL_ORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolOrderno_Desc() { regOBD("SYMBOL_ORDERNO"); return this; }

    protected ConditionValue _symbolPrinterno;
    public ConditionValue xdfgetSymbolPrinterno()
    { if (_symbolPrinterno == null) { _symbolPrinterno = nCV(); }
      return _symbolPrinterno; }
    protected ConditionValue xgetCValueSymbolPrinterno() { return xdfgetSymbolPrinterno(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolPrinterno_Asc() { regOBA("SYMBOL_PRINTERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolPrinterno_Desc() { regOBD("SYMBOL_PRINTERNO"); return this; }

    protected ConditionValue _symbolMakeno;
    public ConditionValue xdfgetSymbolMakeno()
    { if (_symbolMakeno == null) { _symbolMakeno = nCV(); }
      return _symbolMakeno; }
    protected ConditionValue xgetCValueSymbolMakeno() { return xdfgetSymbolMakeno(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolMakeno_Asc() { regOBA("SYMBOL_MAKENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolMakeno_Desc() { regOBD("SYMBOL_MAKENO"); return this; }

    protected ConditionValue _symbolLot4;
    public ConditionValue xdfgetSymbolLot4()
    { if (_symbolLot4 == null) { _symbolLot4 = nCV(); }
      return _symbolLot4; }
    protected ConditionValue xgetCValueSymbolLot4() { return xdfgetSymbolLot4(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_LOT4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolLot4_Asc() { regOBA("SYMBOL_LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_LOT4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolLot4_Desc() { regOBD("SYMBOL_LOT4"); return this; }

    protected ConditionValue _symbolMaketime;
    public ConditionValue xdfgetSymbolMaketime()
    { if (_symbolMaketime == null) { _symbolMaketime = nCV(); }
      return _symbolMaketime; }
    protected ConditionValue xgetCValueSymbolMaketime() { return xdfgetSymbolMaketime(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolMaketime_Asc() { regOBA("SYMBOL_MAKETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolMaketime_Desc() { regOBD("SYMBOL_MAKETIME"); return this; }

    protected ConditionValue _symbolCirculationId;
    public ConditionValue xdfgetSymbolCirculationId()
    { if (_symbolCirculationId == null) { _symbolCirculationId = nCV(); }
      return _symbolCirculationId; }
    protected ConditionValue xgetCValueSymbolCirculationId() { return xdfgetSymbolCirculationId(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolCirculationId_Asc() { regOBA("SYMBOL_CIRCULATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolCirculationId_Desc() { regOBD("SYMBOL_CIRCULATION_ID"); return this; }

    protected ConditionValue _transportCd;
    public ConditionValue xdfgetTransportCd()
    { if (_transportCd == null) { _transportCd = nCV(); }
      return _transportCd; }
    protected ConditionValue xgetCValueTransportCd() { return xdfgetTransportCd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_TransportCd_Asc() { regOBA("TRANSPORT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_TransportCd_Desc() { regOBD("TRANSPORT_CD"); return this; }

    protected ConditionValue _palletId;
    public ConditionValue xdfgetPalletId()
    { if (_palletId == null) { _palletId = nCV(); }
      return _palletId; }
    protected ConditionValue xgetCValuePalletId() { return xdfgetPalletId(); }

    /**
     * Add order-by as ascend. <br>
     * PALLET_ID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_PalletId_Asc() { regOBA("PALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLET_ID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_PalletId_Desc() { regOBD("PALLET_ID"); return this; }

    protected ConditionValue _initNum;
    public ConditionValue xdfgetInitNum()
    { if (_initNum == null) { _initNum = nCV(); }
      return _initNum; }
    protected ConditionValue xgetCValueInitNum() { return xdfgetInitNum(); }

    /**
     * Add order-by as ascend. <br>
     * INIT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_InitNum_Asc() { regOBA("INIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INIT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_InitNum_Desc() { regOBD("INIT_NUM"); return this; }

    protected ConditionValue _createDatetime;
    public ConditionValue xdfgetCreateDatetime()
    { if (_createDatetime == null) { _createDatetime = nCV(); }
      return _createDatetime; }
    protected ConditionValue xgetCValueCreateDatetime() { return xdfgetCreateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_CreateDatetime_Asc() { regOBA("CREATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_CreateDatetime_Desc() { regOBD("CREATE_DATETIME"); return this; }

    protected ConditionValue _sortingDatetime;
    public ConditionValue xdfgetSortingDatetime()
    { if (_sortingDatetime == null) { _sortingDatetime = nCV(); }
      return _sortingDatetime; }
    protected ConditionValue xgetCValueSortingDatetime() { return xdfgetSortingDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * SORTING_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SortingDatetime_Asc() { regOBA("SORTING_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTING_DATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SortingDatetime_Desc() { regOBD("SORTING_DATETIME"); return this; }

    protected ConditionValue _traceType;
    public ConditionValue xdfgetTraceType()
    { if (_traceType == null) { _traceType = nCV(); }
      return _traceType; }
    protected ConditionValue xgetCValueTraceType() { return xdfgetTraceType(); }

    /**
     * Add order-by as ascend. <br>
     * TRACE_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_TraceType_Asc() { regOBA("TRACE_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACE_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_TraceType_Desc() { regOBD("TRACE_TYPE"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_LineBlock_Asc() { regOBA("LINE_BLOCK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_BLOCK: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_LineBlock_Desc() { regOBD("LINE_BLOCK"); return this; }

    protected ConditionValue _assortEdUnit;
    public ConditionValue xdfgetAssortEdUnit()
    { if (_assortEdUnit == null) { _assortEdUnit = nCV(); }
      return _assortEdUnit; }
    protected ConditionValue xgetCValueAssortEdUnit() { return xdfgetAssortEdUnit(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_AssortEdUnit_Asc() { regOBA("ASSORT_ED_UNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_AssortEdUnit_Desc() { regOBD("ASSORT_ED_UNIT"); return this; }

    protected ConditionValue _assortEdIndex;
    public ConditionValue xdfgetAssortEdIndex()
    { if (_assortEdIndex == null) { _assortEdIndex = nCV(); }
      return _assortEdIndex; }
    protected ConditionValue xgetCValueAssortEdIndex() { return xdfgetAssortEdIndex(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_AssortEdIndex_Asc() { regOBA("ASSORT_ED_INDEX"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_AssortEdIndex_Desc() { regOBD("ASSORT_ED_INDEX"); return this; }

    protected ConditionValue _operationCode;
    public ConditionValue xdfgetOperationCode()
    { if (_operationCode == null) { _operationCode = nCV(); }
      return _operationCode; }
    protected ConditionValue xgetCValueOperationCode() { return xdfgetOperationCode(); }

    /**
     * Add order-by as ascend. <br>
     * OPERATION_CODE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_OperationCode_Asc() { regOBA("OPERATION_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPERATION_CODE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_OperationCode_Desc() { regOBD("OPERATION_CODE"); return this; }

    protected ConditionValue _caseInNum;
    public ConditionValue xdfgetCaseInNum()
    { if (_caseInNum == null) { _caseInNum = nCV(); }
      return _caseInNum; }
    protected ConditionValue xgetCValueCaseInNum() { return xdfgetCaseInNum(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_CaseInNum_Asc() { regOBA("CASE_IN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_CaseInNum_Desc() { regOBD("CASE_IN_NUM"); return this; }

    protected ConditionValue _assortNum;
    public ConditionValue xdfgetAssortNum()
    { if (_assortNum == null) { _assortNum = nCV(); }
      return _assortNum; }
    protected ConditionValue xgetCValueAssortNum() { return xdfgetAssortNum(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_AssortNum_Asc() { regOBA("ASSORT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORT_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_AssortNum_Desc() { regOBD("ASSORT_NUM"); return this; }

    protected ConditionValue _assortDifNum;
    public ConditionValue xdfgetAssortDifNum()
    { if (_assortDifNum == null) { _assortDifNum = nCV(); }
      return _assortDifNum; }
    protected ConditionValue xgetCValueAssortDifNum() { return xdfgetAssortDifNum(); }

    /**
     * Add order-by as ascend. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_AssortDifNum_Asc() { regOBA("ASSORT_DIF_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_AssortDifNum_Desc() { regOBD("ASSORT_DIF_NUM"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_DirectionCd_Asc() { regOBA("DIRECTION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_DirectionCd_Desc() { regOBD("DIRECTION_CD"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_PistonType_Asc() { regOBA("PISTON_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PISTON_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_PistonType_Desc() { regOBD("PISTON_TYPE"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

    protected ConditionValue _directionNum;
    public ConditionValue xdfgetDirectionNum()
    { if (_directionNum == null) { _directionNum = nCV(); }
      return _directionNum; }
    protected ConditionValue xgetCValueDirectionNum() { return xdfgetDirectionNum(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_DirectionNum_Asc() { regOBA("DIRECTION_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_DirectionNum_Desc() { regOBD("DIRECTION_NUM"); return this; }

    protected ConditionValue _distWarehouseCd;
    public ConditionValue xdfgetDistWarehouseCd()
    { if (_distWarehouseCd == null) { _distWarehouseCd = nCV(); }
      return _distWarehouseCd; }
    protected ConditionValue xgetCValueDistWarehouseCd() { return xdfgetDistWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_DistWarehouseCd_Asc() { regOBA("DIST_WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_DistWarehouseCd_Desc() { regOBD("DIST_WAREHOUSE_CD"); return this; }

    protected ConditionValue _symbolRcvKey;
    public ConditionValue xdfgetSymbolRcvKey()
    { if (_symbolRcvKey == null) { _symbolRcvKey = nCV(); }
      return _symbolRcvKey; }
    protected ConditionValue xgetCValueSymbolRcvKey() { return xdfgetSymbolRcvKey(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolRcvKey_Asc() { regOBA("SYMBOL_RCV_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_SymbolRcvKey_Desc() { regOBD("SYMBOL_RCV_KEY"); return this; }

    protected ConditionValue _itemCd;
    public ConditionValue xdfgetItemCd()
    { if (_itemCd == null) { _itemCd = nCV(); }
      return _itemCd; }
    protected ConditionValue xgetCValueItemCd() { return xdfgetItemCd(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_ItemCd_Asc() { regOBA("ITEM_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_ItemCd_Desc() { regOBD("ITEM_CD"); return this; }

    protected ConditionValue _designCd;
    public ConditionValue xdfgetDesignCd()
    { if (_designCd == null) { _designCd = nCV(); }
      return _designCd; }
    protected ConditionValue xgetCValueDesignCd() { return xdfgetDesignCd(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGN_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_DesignCd_Asc() { regOBA("DESIGN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGN_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_DesignCd_Desc() { regOBD("DESIGN_CD"); return this; }

    protected ConditionValue _resesrveArea;
    public ConditionValue xdfgetResesrveArea()
    { if (_resesrveArea == null) { _resesrveArea = nCV(); }
      return _resesrveArea; }
    protected ConditionValue xgetCValueResesrveArea() { return xdfgetResesrveArea(); }

    /**
     * Add order-by as ascend. <br>
     * RESESRVE_AREA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_ResesrveArea_Asc() { regOBA("RESESRVE_AREA"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESESRVE_AREA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_ResesrveArea_Desc() { regOBD("RESESRVE_AREA"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEDutyFreeInoutResultCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEDutyFreeInoutResultCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEDutyFreeInoutResultCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEDutyFreeInoutResultCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EDutyFreeInoutResultCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EDutyFreeInoutResultCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EDutyFreeInoutResultCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EDutyFreeInoutResultCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EDutyFreeInoutResultCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EDutyFreeInoutResultCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EDutyFreeInoutResultCQ> _myselfExistsMap;
    public Map<String, EDutyFreeInoutResultCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EDutyFreeInoutResultCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EDutyFreeInoutResultCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EDutyFreeInoutResultCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EDutyFreeInoutResultCB.class.getName(); }
    protected String xCQ() { return EDutyFreeInoutResultCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

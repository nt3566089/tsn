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
 * The base condition-query of E_PRODUCT_STOCK_INFO.
 * @author DBFlute(AutoGenerator)
 */
public class BsEProductStockInfoCQ extends AbstractBsEProductStockInfoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EProductStockInfoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEProductStockInfoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_PRODUCT_STOCK_INFO) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EProductStockInfoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EProductStockInfoCIQ xcreateCIQ() {
        EProductStockInfoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EProductStockInfoCIQ xnewCIQ() {
        return new EProductStockInfoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_PRODUCT_STOCK_INFO on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EProductStockInfoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EProductStockInfoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _eProductStockInfoId;
    public ConditionValue xdfgetEProductStockInfoId()
    { if (_eProductStockInfoId == null) { _eProductStockInfoId = nCV(); }
      return _eProductStockInfoId; }
    protected ConditionValue xgetCValueEProductStockInfoId() { return xdfgetEProductStockInfoId(); }

    /**
     * Add order-by as ascend. <br>
     * E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_EProductStockInfoId_Asc() { regOBA("E_PRODUCT_STOCK_INFO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_EProductStockInfoId_Desc() { regOBD("E_PRODUCT_STOCK_INFO_ID"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_SendRowId_Asc() { regOBA("SEND_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_SendRowId_Desc() { regOBD("SEND_ROW_ID"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMessageCd;
    public ConditionValue xdfgetErrorMessageCd()
    { if (_errorMessageCd == null) { _errorMessageCd = nCV(); }
      return _errorMessageCd; }
    protected ConditionValue xgetCValueErrorMessageCd() { return xdfgetErrorMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _seq;
    public ConditionValue xdfgetSeq()
    { if (_seq == null) { _seq = nCV(); }
      return _seq; }
    protected ConditionValue xgetCValueSeq() { return xdfgetSeq(); }

    /**
     * Add order-by as ascend. <br>
     * SEQ: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_Seq_Asc() { regOBA("SEQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEQ: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_Seq_Desc() { regOBD("SEQ"); return this; }

    protected ConditionValue _inOutKbn;
    public ConditionValue xdfgetInOutKbn()
    { if (_inOutKbn == null) { _inOutKbn = nCV(); }
      return _inOutKbn; }
    protected ConditionValue xgetCValueInOutKbn() { return xdfgetInOutKbn(); }

    /**
     * Add order-by as ascend. <br>
     * IN_OUT_KBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_InOutKbn_Asc() { regOBA("IN_OUT_KBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * IN_OUT_KBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_InOutKbn_Desc() { regOBD("IN_OUT_KBN"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _centerNm;
    public ConditionValue xdfgetCenterNm()
    { if (_centerNm == null) { _centerNm = nCV(); }
      return _centerNm; }
    protected ConditionValue xgetCValueCenterNm() { return xdfgetCenterNm(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_CenterNm_Asc() { regOBA("CENTER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_CenterNm_Desc() { regOBD("CENTER_NM"); return this; }

    protected ConditionValue _executeDate;
    public ConditionValue xdfgetExecuteDate()
    { if (_executeDate == null) { _executeDate = nCV(); }
      return _executeDate; }
    protected ConditionValue xgetCValueExecuteDate() { return xdfgetExecuteDate(); }

    /**
     * Add order-by as ascend. <br>
     * EXECUTE_DATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_ExecuteDate_Asc() { regOBA("EXECUTE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXECUTE_DATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_ExecuteDate_Desc() { regOBD("EXECUTE_DATE"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _productNm;
    public ConditionValue xdfgetProductNm()
    { if (_productNm == null) { _productNm = nCV(); }
      return _productNm; }
    protected ConditionValue xgetCValueProductNm() { return xdfgetProductNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _stockLocation;
    public ConditionValue xdfgetStockLocation()
    { if (_stockLocation == null) { _stockLocation = nCV(); }
      return _stockLocation; }
    protected ConditionValue xgetCValueStockLocation() { return xdfgetStockLocation(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_LOCATION: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_StockLocation_Asc() { regOBA("STOCK_LOCATION"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_LOCATION: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_StockLocation_Desc() { regOBD("STOCK_LOCATION"); return this; }

    protected ConditionValue _stockLocationNm;
    public ConditionValue xdfgetStockLocationNm()
    { if (_stockLocationNm == null) { _stockLocationNm = nCV(); }
      return _stockLocationNm; }
    protected ConditionValue xgetCValueStockLocationNm() { return xdfgetStockLocationNm(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_LOCATION_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_StockLocationNm_Asc() { regOBA("STOCK_LOCATION_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_LOCATION_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_StockLocationNm_Desc() { regOBD("STOCK_LOCATION_NM"); return this; }

    protected ConditionValue _manufactureDate;
    public ConditionValue xdfgetManufactureDate()
    { if (_manufactureDate == null) { _manufactureDate = nCV(); }
      return _manufactureDate; }
    protected ConditionValue xgetCValueManufactureDate() { return xdfgetManufactureDate(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_ManufactureDate_Asc() { regOBA("MANUFACTURE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_ManufactureDate_Desc() { regOBD("MANUFACTURE_DATE"); return this; }

    protected ConditionValue _designKbn;
    public ConditionValue xdfgetDesignKbn()
    { if (_designKbn == null) { _designKbn = nCV(); }
      return _designKbn; }
    protected ConditionValue xgetCValueDesignKbn() { return xdfgetDesignKbn(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGN_KBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_DesignKbn_Asc() { regOBA("DESIGN_KBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGN_KBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_DesignKbn_Desc() { regOBD("DESIGN_KBN"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _transportCd;
    public ConditionValue xdfgetTransportCd()
    { if (_transportCd == null) { _transportCd = nCV(); }
      return _transportCd; }
    protected ConditionValue xgetCValueTransportCd() { return xdfgetTransportCd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_TransportCd_Asc() { regOBA("TRANSPORT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORT_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_TransportCd_Desc() { regOBD("TRANSPORT_CD"); return this; }

    protected ConditionValue _firmCarryNo;
    public ConditionValue xdfgetFirmCarryNo()
    { if (_firmCarryNo == null) { _firmCarryNo = nCV(); }
      return _firmCarryNo; }
    protected ConditionValue xgetCValueFirmCarryNo() { return xdfgetFirmCarryNo(); }

    /**
     * Add order-by as ascend. <br>
     * FIRM_CARRY_NO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_FirmCarryNo_Asc() { regOBA("FIRM_CARRY_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRM_CARRY_NO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_FirmCarryNo_Desc() { regOBD("FIRM_CARRY_NO"); return this; }

    protected ConditionValue _sourceCd;
    public ConditionValue xdfgetSourceCd()
    { if (_sourceCd == null) { _sourceCd = nCV(); }
      return _sourceCd; }
    protected ConditionValue xgetCValueSourceCd() { return xdfgetSourceCd(); }

    /**
     * Add order-by as ascend. <br>
     * SOURCE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_SourceCd_Asc() { regOBA("SOURCE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOURCE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_SourceCd_Desc() { regOBD("SOURCE_CD"); return this; }

    protected ConditionValue _sourceNm;
    public ConditionValue xdfgetSourceNm()
    { if (_sourceNm == null) { _sourceNm = nCV(); }
      return _sourceNm; }
    protected ConditionValue xgetCValueSourceNm() { return xdfgetSourceNm(); }

    /**
     * Add order-by as ascend. <br>
     * SOURCE_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_SourceNm_Asc() { regOBA("SOURCE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOURCE_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_SourceNm_Desc() { regOBD("SOURCE_NM"); return this; }

    protected ConditionValue _schDate;
    public ConditionValue xdfgetSchDate()
    { if (_schDate == null) { _schDate = nCV(); }
      return _schDate; }
    protected ConditionValue xgetCValueSchDate() { return xdfgetSchDate(); }

    /**
     * Add order-by as ascend. <br>
     * SCH_DATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_SchDate_Asc() { regOBA("SCH_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCH_DATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_SchDate_Desc() { regOBD("SCH_DATE"); return this; }

    protected ConditionValue _rcvDate;
    public ConditionValue xdfgetRcvDate()
    { if (_rcvDate == null) { _rcvDate = nCV(); }
      return _rcvDate; }
    protected ConditionValue xgetCValueRcvDate() { return xdfgetRcvDate(); }

    /**
     * Add order-by as ascend. <br>
     * RCV_DATE: {NotNull, varchar(14)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_RcvDate_Asc() { regOBA("RCV_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_DATE: {NotNull, varchar(14)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_RcvDate_Desc() { regOBD("RCV_DATE"); return this; }

    protected ConditionValue _pTdayTotalDiffQty;
    public ConditionValue xdfgetPTdayTotalDiffQty()
    { if (_pTdayTotalDiffQty == null) { _pTdayTotalDiffQty = nCV(); }
      return _pTdayTotalDiffQty; }
    protected ConditionValue xgetCValuePTdayTotalDiffQty() { return xdfgetPTdayTotalDiffQty(); }

    /**
     * Add order-by as ascend. <br>
     * P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_PTdayTotalDiffQty_Asc() { regOBA("P_TDAY_TOTAL_DIFF_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_PTdayTotalDiffQty_Desc() { regOBD("P_TDAY_TOTAL_DIFF_QTY"); return this; }

    protected ConditionValue _pQty;
    public ConditionValue xdfgetPQty()
    { if (_pQty == null) { _pQty = nCV(); }
      return _pQty; }
    protected ConditionValue xgetCValuePQty() { return xdfgetPQty(); }

    /**
     * Add order-by as ascend. <br>
     * P_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_PQty_Asc() { regOBA("P_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_PQty_Desc() { regOBD("P_QTY"); return this; }

    protected ConditionValue _pInventoryNum;
    public ConditionValue xdfgetPInventoryNum()
    { if (_pInventoryNum == null) { _pInventoryNum = nCV(); }
      return _pInventoryNum; }
    protected ConditionValue xgetCValuePInventoryNum() { return xdfgetPInventoryNum(); }

    /**
     * Add order-by as ascend. <br>
     * P_INVENTORY_NUM: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_PInventoryNum_Asc() { regOBA("P_INVENTORY_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_INVENTORY_NUM: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_PInventoryNum_Desc() { regOBD("P_INVENTORY_NUM"); return this; }

    protected ConditionValue _pYdayTotalDiffQty;
    public ConditionValue xdfgetPYdayTotalDiffQty()
    { if (_pYdayTotalDiffQty == null) { _pYdayTotalDiffQty = nCV(); }
      return _pYdayTotalDiffQty; }
    protected ConditionValue xgetCValuePYdayTotalDiffQty() { return xdfgetPYdayTotalDiffQty(); }

    /**
     * Add order-by as ascend. <br>
     * P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_PYdayTotalDiffQty_Asc() { regOBA("P_YDAY_TOTAL_DIFF_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_PYdayTotalDiffQty_Desc() { regOBD("P_YDAY_TOTAL_DIFF_QTY"); return this; }

    protected ConditionValue _pTdayDiffQty;
    public ConditionValue xdfgetPTdayDiffQty()
    { if (_pTdayDiffQty == null) { _pTdayDiffQty = nCV(); }
      return _pTdayDiffQty; }
    protected ConditionValue xgetCValuePTdayDiffQty() { return xdfgetPTdayDiffQty(); }

    /**
     * Add order-by as ascend. <br>
     * P_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_PTdayDiffQty_Asc() { regOBA("P_TDAY_DIFF_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_PTdayDiffQty_Desc() { regOBD("P_TDAY_DIFF_QTY"); return this; }

    protected ConditionValue _slYdayTotalDiffQty;
    public ConditionValue xdfgetSlYdayTotalDiffQty()
    { if (_slYdayTotalDiffQty == null) { _slYdayTotalDiffQty = nCV(); }
      return _slYdayTotalDiffQty; }
    protected ConditionValue xgetCValueSlYdayTotalDiffQty() { return xdfgetSlYdayTotalDiffQty(); }

    /**
     * Add order-by as ascend. <br>
     * SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_SlYdayTotalDiffQty_Asc() { regOBA("SL_YDAY_TOTAL_DIFF_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_SlYdayTotalDiffQty_Desc() { regOBD("SL_YDAY_TOTAL_DIFF_QTY"); return this; }

    protected ConditionValue _slTdayDiffQty;
    public ConditionValue xdfgetSlTdayDiffQty()
    { if (_slTdayDiffQty == null) { _slTdayDiffQty = nCV(); }
      return _slTdayDiffQty; }
    protected ConditionValue xgetCValueSlTdayDiffQty() { return xdfgetSlTdayDiffQty(); }

    /**
     * Add order-by as ascend. <br>
     * SL_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_SlTdayDiffQty_Asc() { regOBA("SL_TDAY_DIFF_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SL_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_SlTdayDiffQty_Desc() { regOBD("SL_TDAY_DIFF_QTY"); return this; }

    protected ConditionValue _qty;
    public ConditionValue xdfgetQty()
    { if (_qty == null) { _qty = nCV(); }
      return _qty; }
    protected ConditionValue xgetCValueQty() { return xdfgetQty(); }

    /**
     * Add order-by as ascend. <br>
     * QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_Qty_Asc() { regOBA("QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_Qty_Desc() { regOBD("QTY"); return this; }

    protected ConditionValue _inventoryNum;
    public ConditionValue xdfgetInventoryNum()
    { if (_inventoryNum == null) { _inventoryNum = nCV(); }
      return _inventoryNum; }
    protected ConditionValue xgetCValueInventoryNum() { return xdfgetInventoryNum(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_NUM: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_InventoryNum_Asc() { regOBA("INVENTORY_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_NUM: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_InventoryNum_Desc() { regOBD("INVENTORY_NUM"); return this; }

    protected ConditionValue _userUse4;
    public ConditionValue xdfgetUserUse4()
    { if (_userUse4 == null) { _userUse4 = nCV(); }
      return _userUse4; }
    protected ConditionValue xgetCValueUserUse4() { return xdfgetUserUse4(); }

    /**
     * Add order-by as ascend. <br>
     * USER_USE4: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_UserUse4_Asc() { regOBA("USER_USE4"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_USE4: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_UserUse4_Desc() { regOBD("USER_USE4"); return this; }

    protected ConditionValue _lotAtrb1Title;
    public ConditionValue xdfgetLotAtrb1Title()
    { if (_lotAtrb1Title == null) { _lotAtrb1Title = nCV(); }
      return _lotAtrb1Title; }
    protected ConditionValue xgetCValueLotAtrb1Title() { return xdfgetLotAtrb1Title(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ATRB1_TITLE: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_LotAtrb1Title_Asc() { regOBA("LOT_ATRB1_TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ATRB1_TITLE: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_LotAtrb1Title_Desc() { regOBD("LOT_ATRB1_TITLE"); return this; }

    protected ConditionValue _userNum4;
    public ConditionValue xdfgetUserNum4()
    { if (_userNum4 == null) { _userNum4 = nCV(); }
      return _userNum4; }
    protected ConditionValue xgetCValueUserNum4() { return xdfgetUserNum4(); }

    /**
     * Add order-by as ascend. <br>
     * USER_NUM4: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_UserNum4_Asc() { regOBA("USER_NUM4"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_NUM4: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_UserNum4_Desc() { regOBD("USER_NUM4"); return this; }

    protected ConditionValue _userNum3;
    public ConditionValue xdfgetUserNum3()
    { if (_userNum3 == null) { _userNum3 = nCV(); }
      return _userNum3; }
    protected ConditionValue xgetCValueUserNum3() { return xdfgetUserNum3(); }

    /**
     * Add order-by as ascend. <br>
     * USER_NUM3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_UserNum3_Asc() { regOBA("USER_NUM3"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_NUM3: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_UserNum3_Desc() { regOBD("USER_NUM3"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEProductStockInfoCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEProductStockInfoCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEProductStockInfoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEProductStockInfoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EProductStockInfoCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EProductStockInfoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EProductStockInfoCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EProductStockInfoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EProductStockInfoCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EProductStockInfoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EProductStockInfoCQ> _myselfExistsMap;
    public Map<String, EProductStockInfoCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EProductStockInfoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EProductStockInfoCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EProductStockInfoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EProductStockInfoCB.class.getName(); }
    protected String xCQ() { return EProductStockInfoCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

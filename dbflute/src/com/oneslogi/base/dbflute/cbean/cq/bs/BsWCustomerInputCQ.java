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
 * The base condition-query of W_CUSTOMER_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public class BsWCustomerInputCQ extends AbstractBsWCustomerInputCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WCustomerInputCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWCustomerInputCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_CUSTOMER_INPUT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WCustomerInputCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WCustomerInputCIQ xcreateCIQ() {
        WCustomerInputCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WCustomerInputCIQ xnewCIQ() {
        return new WCustomerInputCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_CUSTOMER_INPUT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WCustomerInputCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WCustomerInputCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _customerInputId;
    public ConditionValue xdfgetCustomerInputId()
    { if (_customerInputId == null) { _customerInputId = nCV(); }
      return _customerInputId; }
    protected ConditionValue xgetCValueCustomerInputId() { return xdfgetCustomerInputId(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_CustomerInputId_Asc() { regOBA("CUSTOMER_INPUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_CustomerInputId_Desc() { regOBD("CUSTOMER_INPUT_ID"); return this; }

    protected ConditionValue _clientCd;
    public ConditionValue xdfgetClientCd()
    { if (_clientCd == null) { _clientCd = nCV(); }
      return _clientCd; }
    protected ConditionValue xgetCValueClientCd() { return xdfgetClientCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

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
    public BsWCustomerInputCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

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
    public BsWCustomerInputCQ addOrderBy_CustomerNm_Asc() { regOBA("CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_CustomerNm_Desc() { regOBD("CUSTOMER_NM"); return this; }

    protected ConditionValue _customerAbbr;
    public ConditionValue xdfgetCustomerAbbr()
    { if (_customerAbbr == null) { _customerAbbr = nCV(); }
      return _customerAbbr; }
    protected ConditionValue xgetCValueCustomerAbbr() { return xdfgetCustomerAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_ABBR: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_CustomerAbbr_Asc() { regOBA("CUSTOMER_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_ABBR: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_CustomerAbbr_Desc() { regOBD("CUSTOMER_ABBR"); return this; }

    protected ConditionValue _zipCd;
    public ConditionValue xdfgetZipCd()
    { if (_zipCd == null) { _zipCd = nCV(); }
      return _zipCd; }
    protected ConditionValue xgetCValueZipCd() { return xdfgetZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * ZIP_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_ZipCd_Asc() { regOBA("ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_ZipCd_Desc() { regOBD("ZIP_CD"); return this; }

    protected ConditionValue _telNo;
    public ConditionValue xdfgetTelNo()
    { if (_telNo == null) { _telNo = nCV(); }
      return _telNo; }
    protected ConditionValue xgetCValueTelNo() { return xdfgetTelNo(); }

    /**
     * Add order-by as ascend. <br>
     * TEL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_TelNo_Asc() { regOBA("TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_TelNo_Desc() { regOBD("TEL_NO"); return this; }

    protected ConditionValue _address1;
    public ConditionValue xdfgetAddress1()
    { if (_address1 == null) { _address1 = nCV(); }
      return _address1; }
    protected ConditionValue xgetCValueAddress1() { return xdfgetAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_Address1_Asc() { regOBA("ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_Address1_Desc() { regOBD("ADDRESS1"); return this; }

    protected ConditionValue _address2;
    public ConditionValue xdfgetAddress2()
    { if (_address2 == null) { _address2 = nCV(); }
      return _address2; }
    protected ConditionValue xgetCValueAddress2() { return xdfgetAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_Address2_Asc() { regOBA("ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_Address2_Desc() { regOBD("ADDRESS2"); return this; }

    protected ConditionValue _address3;
    public ConditionValue xdfgetAddress3()
    { if (_address3 == null) { _address3 = nCV(); }
      return _address3; }
    protected ConditionValue xgetCValueAddress3() { return xdfgetAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_Address3_Asc() { regOBA("ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_Address3_Desc() { regOBD("ADDRESS3"); return this; }

    protected ConditionValue _vendorFlg;
    public ConditionValue xdfgetVendorFlg()
    { if (_vendorFlg == null) { _vendorFlg = nCV(); }
      return _vendorFlg; }
    protected ConditionValue xgetCValueVendorFlg() { return xdfgetVendorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * VENDOR_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_VendorFlg_Asc() { regOBA("VENDOR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * VENDOR_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_VendorFlg_Desc() { regOBD("VENDOR_FLG"); return this; }

    protected ConditionValue _deliveryFlg;
    public ConditionValue xdfgetDeliveryFlg()
    { if (_deliveryFlg == null) { _deliveryFlg = nCV(); }
      return _deliveryFlg; }
    protected ConditionValue xgetCValueDeliveryFlg() { return xdfgetDeliveryFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_DeliveryFlg_Asc() { regOBA("DELIVERY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_DeliveryFlg_Desc() { regOBD("DELIVERY_FLG"); return this; }

    protected ConditionValue _onetimeFlg;
    public ConditionValue xdfgetOnetimeFlg()
    { if (_onetimeFlg == null) { _onetimeFlg = nCV(); }
      return _onetimeFlg; }
    protected ConditionValue xgetCValueOnetimeFlg() { return xdfgetOnetimeFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ONETIME_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_OnetimeFlg_Asc() { regOBA("ONETIME_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ONETIME_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_OnetimeFlg_Desc() { regOBD("ONETIME_FLG"); return this; }

    protected ConditionValue _depositFlg;
    public ConditionValue xdfgetDepositFlg()
    { if (_depositFlg == null) { _depositFlg = nCV(); }
      return _depositFlg; }
    protected ConditionValue xgetCValueDepositFlg() { return xdfgetDepositFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_DepositFlg_Asc() { regOBA("DEPOSIT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_DepositFlg_Desc() { regOBD("DEPOSIT_FLG"); return this; }

    protected ConditionValue _allocOrder;
    public ConditionValue xdfgetAllocOrder()
    { if (_allocOrder == null) { _allocOrder = nCV(); }
      return _allocOrder; }
    protected ConditionValue xgetCValueAllocOrder() { return xdfgetAllocOrder(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_AllocOrder_Asc() { regOBA("ALLOC_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_AllocOrder_Desc() { regOBD("ALLOC_ORDER"); return this; }

    protected ConditionValue _lotReverseFlg;
    public ConditionValue xdfgetLotReverseFlg()
    { if (_lotReverseFlg == null) { _lotReverseFlg = nCV(); }
      return _lotReverseFlg; }
    protected ConditionValue xgetCValueLotReverseFlg() { return xdfgetLotReverseFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_REVERSE_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_LotReverseFlg_Asc() { regOBA("LOT_REVERSE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_REVERSE_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_LotReverseFlg_Desc() { regOBD("LOT_REVERSE_FLG"); return this; }

    protected ConditionValue _limitDtReverseFlg;
    public ConditionValue xdfgetLimitDtReverseFlg()
    { if (_limitDtReverseFlg == null) { _limitDtReverseFlg = nCV(); }
      return _limitDtReverseFlg; }
    protected ConditionValue xgetCValueLimitDtReverseFlg() { return xdfgetLimitDtReverseFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT_REVERSE_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_LimitDtReverseFlg_Asc() { regOBA("LIMIT_DT_REVERSE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT_REVERSE_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_LimitDtReverseFlg_Desc() { regOBD("LIMIT_DT_REVERSE_FLG"); return this; }

    protected ConditionValue _shippingStopFlg;
    public ConditionValue xdfgetShippingStopFlg()
    { if (_shippingStopFlg == null) { _shippingStopFlg = nCV(); }
      return _shippingStopFlg; }
    protected ConditionValue xgetCValueShippingStopFlg() { return xdfgetShippingStopFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_STOP_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_ShippingStopFlg_Asc() { regOBA("SHIPPING_STOP_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STOP_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_ShippingStopFlg_Desc() { regOBD("SHIPPING_STOP_FLG"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _deliveryCourseCd;
    public ConditionValue xdfgetDeliveryCourseCd()
    { if (_deliveryCourseCd == null) { _deliveryCourseCd = nCV(); }
      return _deliveryCourseCd; }
    protected ConditionValue xgetCValueDeliveryCourseCd() { return xdfgetDeliveryCourseCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_DeliveryCourseCd_Asc() { regOBA("DELIVERY_COURSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_DeliveryCourseCd_Desc() { regOBD("DELIVERY_COURSE_CD"); return this; }

    protected ConditionValue _deliveryOrder;
    public ConditionValue xdfgetDeliveryOrder()
    { if (_deliveryOrder == null) { _deliveryOrder = nCV(); }
      return _deliveryOrder; }
    protected ConditionValue xgetCValueDeliveryOrder() { return xdfgetDeliveryOrder(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_DeliveryOrder_Asc() { regOBA("DELIVERY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_DeliveryOrder_Desc() { regOBD("DELIVERY_ORDER"); return this; }

    protected ConditionValue _deliveryReadTime;
    public ConditionValue xdfgetDeliveryReadTime()
    { if (_deliveryReadTime == null) { _deliveryReadTime = nCV(); }
      return _deliveryReadTime; }
    protected ConditionValue xgetCValueDeliveryReadTime() { return xdfgetDeliveryReadTime(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_READ_TIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_DeliveryReadTime_Asc() { regOBA("DELIVERY_READ_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_READ_TIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_DeliveryReadTime_Desc() { regOBD("DELIVERY_READ_TIME"); return this; }

    protected ConditionValue _lineNo;
    public ConditionValue xdfgetLineNo()
    { if (_lineNo == null) { _lineNo = nCV(); }
      return _lineNo; }
    protected ConditionValue xgetCValueLineNo() { return xdfgetLineNo(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_LineNo_Asc() { regOBA("LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_LineNo_Desc() { regOBD("LINE_NO"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMsg;
    public ConditionValue xdfgetErrorMsg()
    { if (_errorMsg == null) { _errorMsg = nCV(); }
      return _errorMsg; }
    protected ConditionValue xgetCValueErrorMsg() { return xdfgetErrorMsg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_ErrorMsg_Asc() { regOBA("ERROR_MSG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_ErrorMsg_Desc() { regOBD("ERROR_MSG"); return this; }

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
    public BsWCustomerInputCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWCustomerInputCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWCustomerInputCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWCustomerInputCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWCustomerInputCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWCustomerInputCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWCustomerInputCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWCustomerInputCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWCustomerInputCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWCustomerInputCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWCustomerInputCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWCustomerInputCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WCustomerInputCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WCustomerInputCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WCustomerInputCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WCustomerInputCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WCustomerInputCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WCustomerInputCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WCustomerInputCQ> _myselfExistsMap;
    public Map<String, WCustomerInputCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WCustomerInputCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WCustomerInputCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WCustomerInputCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WCustomerInputCB.class.getName(); }
    protected String xCQ() { return WCustomerInputCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

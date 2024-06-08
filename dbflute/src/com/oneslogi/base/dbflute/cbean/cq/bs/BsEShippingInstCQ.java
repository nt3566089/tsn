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
 * The base condition-query of E_SHIPPING_INST.
 * @author DBFlute(AutoGenerator)
 */
public class BsEShippingInstCQ extends AbstractBsEShippingInstCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EShippingInstCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEShippingInstCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_SHIPPING_INST) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EShippingInstCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EShippingInstCIQ xcreateCIQ() {
        EShippingInstCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EShippingInstCIQ xnewCIQ() {
        return new EShippingInstCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_SHIPPING_INST on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EShippingInstCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EShippingInstCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingInstId;
    public ConditionValue xdfgetShippingInstId()
    { if (_shippingInstId == null) { _shippingInstId = nCV(); }
      return _shippingInstId; }
    protected ConditionValue xgetCValueShippingInstId() { return xdfgetShippingInstId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ShippingInstId_Asc() { regOBA("SHIPPING_INST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ShippingInstId_Desc() { regOBD("SHIPPING_INST_ID"); return this; }

    protected ConditionValue _receiveCd;
    public ConditionValue xdfgetReceiveCd()
    { if (_receiveCd == null) { _receiveCd = nCV(); }
      return _receiveCd; }
    protected ConditionValue xgetCValueReceiveCd() { return xdfgetReceiveCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

    protected ConditionValue _receiveRowId;
    public ConditionValue xdfgetReceiveRowId()
    { if (_receiveRowId == null) { _receiveRowId = nCV(); }
      return _receiveRowId; }
    protected ConditionValue xgetCValueReceiveRowId() { return xdfgetReceiveRowId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

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
    public BsEShippingInstCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsEShippingInstCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

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
    public BsEShippingInstCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

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
    public BsEShippingInstCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _emergencyFlg;
    public ConditionValue xdfgetEmergencyFlg()
    { if (_emergencyFlg == null) { _emergencyFlg = nCV(); }
      return _emergencyFlg; }
    protected ConditionValue xgetCValueEmergencyFlg() { return xdfgetEmergencyFlg(); }

    /**
     * Add order-by as ascend. <br>
     * EMERGENCY_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_EmergencyFlg_Asc() { regOBA("EMERGENCY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMERGENCY_FLG: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_EmergencyFlg_Desc() { regOBD("EMERGENCY_FLG"); return this; }

    protected ConditionValue _clientShippingNo;
    public ConditionValue xdfgetClientShippingNo()
    { if (_clientShippingNo == null) { _clientShippingNo = nCV(); }
      return _clientShippingNo; }
    protected ConditionValue xgetCValueClientShippingNo() { return xdfgetClientShippingNo(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_SHIPPING_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ClientShippingNo_Asc() { regOBA("CLIENT_SHIPPING_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_SHIPPING_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ClientShippingNo_Desc() { regOBD("CLIENT_SHIPPING_NO"); return this; }

    protected ConditionValue _supplyCustomerCd;
    public ConditionValue xdfgetSupplyCustomerCd()
    { if (_supplyCustomerCd == null) { _supplyCustomerCd = nCV(); }
      return _supplyCustomerCd; }
    protected ConditionValue xgetCValueSupplyCustomerCd() { return xdfgetSupplyCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLY_CUSTOMER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SupplyCustomerCd_Asc() { regOBA("SUPPLY_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SupplyCustomerCd_Desc() { regOBD("SUPPLY_CUSTOMER_CD"); return this; }

    protected ConditionValue _supplyCustomerNm;
    public ConditionValue xdfgetSupplyCustomerNm()
    { if (_supplyCustomerNm == null) { _supplyCustomerNm = nCV(); }
      return _supplyCustomerNm; }
    protected ConditionValue xgetCValueSupplyCustomerNm() { return xdfgetSupplyCustomerNm(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SupplyCustomerNm_Asc() { regOBA("SUPPLY_CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SupplyCustomerNm_Desc() { regOBD("SUPPLY_CUSTOMER_NM"); return this; }

    protected ConditionValue _processTypeCd;
    public ConditionValue xdfgetProcessTypeCd()
    { if (_processTypeCd == null) { _processTypeCd = nCV(); }
      return _processTypeCd; }
    protected ConditionValue xgetCValueProcessTypeCd() { return xdfgetProcessTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ProcessTypeCd_Asc() { regOBA("PROCESS_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ProcessTypeCd_Desc() { regOBD("PROCESS_TYPE_CD"); return this; }

    protected ConditionValue _delivPlanDt;
    public ConditionValue xdfgetDelivPlanDt()
    { if (_delivPlanDt == null) { _delivPlanDt = nCV(); }
      return _delivPlanDt; }
    protected ConditionValue xgetCValueDelivPlanDt() { return xdfgetDelivPlanDt(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_PLAN_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivPlanDt_Asc() { regOBA("DELIV_PLAN_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_PLAN_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivPlanDt_Desc() { regOBD("DELIV_PLAN_DT"); return this; }

    protected ConditionValue _workDt;
    public ConditionValue xdfgetWorkDt()
    { if (_workDt == null) { _workDt = nCV(); }
      return _workDt; }
    protected ConditionValue xgetCValueWorkDt() { return xdfgetWorkDt(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_WorkDt_Asc() { regOBA("WORK_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_WorkDt_Desc() { regOBD("WORK_DT"); return this; }

    protected ConditionValue _shippingDt;
    public ConditionValue xdfgetShippingDt()
    { if (_shippingDt == null) { _shippingDt = nCV(); }
      return _shippingDt; }
    protected ConditionValue xgetCValueShippingDt() { return xdfgetShippingDt(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

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
    public BsEShippingInstCQ addOrderBy_DeliveryCourseCd_Asc() { regOBA("DELIVERY_COURSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DeliveryCourseCd_Desc() { regOBD("DELIVERY_COURSE_CD"); return this; }

    protected ConditionValue _delivDt;
    public ConditionValue xdfgetDelivDt()
    { if (_delivDt == null) { _delivDt = nCV(); }
      return _delivDt; }
    protected ConditionValue xgetCValueDelivDt() { return xdfgetDelivDt(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivDt_Asc() { regOBA("DELIV_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivDt_Desc() { regOBD("DELIV_DT"); return this; }

    protected ConditionValue _delivTz;
    public ConditionValue xdfgetDelivTz()
    { if (_delivTz == null) { _delivTz = nCV(); }
      return _delivTz; }
    protected ConditionValue xgetCValueDelivTz() { return xdfgetDelivTz(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TZ: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivTz_Asc() { regOBA("DELIV_TZ"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TZ: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivTz_Desc() { regOBD("DELIV_TZ"); return this; }

    protected ConditionValue _delivCustomerCd;
    public ConditionValue xdfgetDelivCustomerCd()
    { if (_delivCustomerCd == null) { _delivCustomerCd = nCV(); }
      return _delivCustomerCd; }
    protected ConditionValue xgetCValueDelivCustomerCd() { return xdfgetDelivCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivCustomerCd_Asc() { regOBA("DELIV_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivCustomerCd_Desc() { regOBD("DELIV_CUSTOMER_CD"); return this; }

    protected ConditionValue _delivCustomerNm;
    public ConditionValue xdfgetDelivCustomerNm()
    { if (_delivCustomerNm == null) { _delivCustomerNm = nCV(); }
      return _delivCustomerNm; }
    protected ConditionValue xgetCValueDelivCustomerNm() { return xdfgetDelivCustomerNm(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivCustomerNm_Asc() { regOBA("DELIV_CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivCustomerNm_Desc() { regOBD("DELIV_CUSTOMER_NM"); return this; }

    protected ConditionValue _delivZipCd;
    public ConditionValue xdfgetDelivZipCd()
    { if (_delivZipCd == null) { _delivZipCd = nCV(); }
      return _delivZipCd; }
    protected ConditionValue xgetCValueDelivZipCd() { return xdfgetDelivZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ZIP_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivZipCd_Asc() { regOBA("DELIV_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ZIP_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivZipCd_Desc() { regOBD("DELIV_ZIP_CD"); return this; }

    protected ConditionValue _delivAddress1;
    public ConditionValue xdfgetDelivAddress1()
    { if (_delivAddress1 == null) { _delivAddress1 = nCV(); }
      return _delivAddress1; }
    protected ConditionValue xgetCValueDelivAddress1() { return xdfgetDelivAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivAddress1_Asc() { regOBA("DELIV_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivAddress1_Desc() { regOBD("DELIV_ADDRESS1"); return this; }

    protected ConditionValue _delivAddress2;
    public ConditionValue xdfgetDelivAddress2()
    { if (_delivAddress2 == null) { _delivAddress2 = nCV(); }
      return _delivAddress2; }
    protected ConditionValue xgetCValueDelivAddress2() { return xdfgetDelivAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivAddress2_Asc() { regOBA("DELIV_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivAddress2_Desc() { regOBD("DELIV_ADDRESS2"); return this; }

    protected ConditionValue _delivAddress3;
    public ConditionValue xdfgetDelivAddress3()
    { if (_delivAddress3 == null) { _delivAddress3 = nCV(); }
      return _delivAddress3; }
    protected ConditionValue xgetCValueDelivAddress3() { return xdfgetDelivAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivAddress3_Asc() { regOBA("DELIV_ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivAddress3_Desc() { regOBD("DELIV_ADDRESS3"); return this; }

    protected ConditionValue _delivTelNo;
    public ConditionValue xdfgetDelivTelNo()
    { if (_delivTelNo == null) { _delivTelNo = nCV(); }
      return _delivTelNo; }
    protected ConditionValue xgetCValueDelivTelNo() { return xdfgetDelivTelNo(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivTelNo_Asc() { regOBA("DELIV_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivTelNo_Desc() { regOBD("DELIV_TEL_NO"); return this; }

    protected ConditionValue _delivAddressSupply;
    public ConditionValue xdfgetDelivAddressSupply()
    { if (_delivAddressSupply == null) { _delivAddressSupply = nCV(); }
      return _delivAddressSupply; }
    protected ConditionValue xgetCValueDelivAddressSupply() { return xdfgetDelivAddressSupply(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivAddressSupply_Asc() { regOBA("DELIV_ADDRESS_SUPPLY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelivAddressSupply_Desc() { regOBD("DELIV_ADDRESS_SUPPLY"); return this; }

    protected ConditionValue _pickingWorkMessage;
    public ConditionValue xdfgetPickingWorkMessage()
    { if (_pickingWorkMessage == null) { _pickingWorkMessage = nCV(); }
      return _pickingWorkMessage; }
    protected ConditionValue xgetCValuePickingWorkMessage() { return xdfgetPickingWorkMessage(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_PickingWorkMessage_Asc() { regOBA("PICKING_WORK_MESSAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_PickingWorkMessage_Desc() { regOBD("PICKING_WORK_MESSAGE"); return this; }

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
    public BsEShippingInstCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _productNm;
    public ConditionValue xdfgetProductNm()
    { if (_productNm == null) { _productNm = nCV(); }
      return _productNm; }
    protected ConditionValue xgetCValueProductNm() { return xdfgetProductNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _depositCd;
    public ConditionValue xdfgetDepositCd()
    { if (_depositCd == null) { _depositCd = nCV(); }
      return _depositCd; }
    protected ConditionValue xgetCValueDepositCd() { return xdfgetDepositCd(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DepositCd_Asc() { regOBA("DEPOSIT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DepositCd_Desc() { regOBD("DEPOSIT_CD"); return this; }

    protected ConditionValue _stockTypeCd;
    public ConditionValue xdfgetStockTypeCd()
    { if (_stockTypeCd == null) { _stockTypeCd = nCV(); }
      return _stockTypeCd; }
    protected ConditionValue xgetCValueStockTypeCd() { return xdfgetStockTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_StockTypeCd_Asc() { regOBA("STOCK_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_StockTypeCd_Desc() { regOBD("STOCK_TYPE_CD"); return this; }

    protected ConditionValue _instNum;
    public ConditionValue xdfgetInstNum()
    { if (_instNum == null) { _instNum = nCV(); }
      return _instNum; }
    protected ConditionValue xgetCValueInstNum() { return xdfgetInstNum(); }

    /**
     * Add order-by as ascend. <br>
     * INST_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_InstNum_Asc() { regOBA("INST_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INST_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_InstNum_Desc() { regOBD("INST_NUM"); return this; }

    protected ConditionValue _lot;
    public ConditionValue xdfgetLot()
    { if (_lot == null) { _lot = nCV(); }
      return _lot; }
    protected ConditionValue xgetCValueLot() { return xdfgetLot(); }

    /**
     * Add order-by as ascend. <br>
     * LOT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

    protected ConditionValue _limitDt;
    public ConditionValue xdfgetLimitDt()
    { if (_limitDt == null) { _limitDt = nCV(); }
      return _limitDt; }
    protected ConditionValue xgetCValueLimitDt() { return xdfgetLimitDt(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

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
    public BsEShippingInstCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _totalPrice;
    public ConditionValue xdfgetTotalPrice()
    { if (_totalPrice == null) { _totalPrice = nCV(); }
      return _totalPrice; }
    protected ConditionValue xgetCValueTotalPrice() { return xdfgetTotalPrice(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_PRICE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_TotalPrice_Asc() { regOBA("TOTAL_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_PRICE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_TotalPrice_Desc() { regOBD("TOTAL_PRICE"); return this; }

    protected ConditionValue _totalTax;
    public ConditionValue xdfgetTotalTax()
    { if (_totalTax == null) { _totalTax = nCV(); }
      return _totalTax; }
    protected ConditionValue xgetCValueTotalTax() { return xdfgetTotalTax(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_TAX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_TotalTax_Asc() { regOBA("TOTAL_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_TAX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_TotalTax_Desc() { regOBD("TOTAL_TAX"); return this; }

    protected ConditionValue _unitPrice;
    public ConditionValue xdfgetUnitPrice()
    { if (_unitPrice == null) { _unitPrice = nCV(); }
      return _unitPrice; }
    protected ConditionValue xgetCValueUnitPrice() { return xdfgetUnitPrice(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_PRICE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_UnitPrice_Asc() { regOBA("UNIT_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_PRICE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_UnitPrice_Desc() { regOBD("UNIT_PRICE"); return this; }

    protected ConditionValue _price;
    public ConditionValue xdfgetPrice()
    { if (_price == null) { _price = nCV(); }
      return _price; }
    protected ConditionValue xgetCValuePrice() { return xdfgetPrice(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_Price_Asc() { regOBA("PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_Price_Desc() { regOBD("PRICE"); return this; }

    protected ConditionValue _tax;
    public ConditionValue xdfgetTax()
    { if (_tax == null) { _tax = nCV(); }
      return _tax; }
    protected ConditionValue xgetCValueTax() { return xdfgetTax(); }

    /**
     * Add order-by as ascend. <br>
     * TAX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_Tax_Asc() { regOBA("TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAX: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_Tax_Desc() { regOBD("TAX"); return this; }

    protected ConditionValue _spareStr1;
    public ConditionValue xdfgetSpareStr1()
    { if (_spareStr1 == null) { _spareStr1 = nCV(); }
      return _spareStr1; }
    protected ConditionValue xgetCValueSpareStr1() { return xdfgetSpareStr1(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_STR_1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SpareStr1_Asc() { regOBA("SPARE_STR_1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR_1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SpareStr1_Desc() { regOBD("SPARE_STR_1"); return this; }

    protected ConditionValue _spareStr2;
    public ConditionValue xdfgetSpareStr2()
    { if (_spareStr2 == null) { _spareStr2 = nCV(); }
      return _spareStr2; }
    protected ConditionValue xgetCValueSpareStr2() { return xdfgetSpareStr2(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_STR_2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SpareStr2_Asc() { regOBA("SPARE_STR_2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR_2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SpareStr2_Desc() { regOBD("SPARE_STR_2"); return this; }

    protected ConditionValue _spareStr3;
    public ConditionValue xdfgetSpareStr3()
    { if (_spareStr3 == null) { _spareStr3 = nCV(); }
      return _spareStr3; }
    protected ConditionValue xgetCValueSpareStr3() { return xdfgetSpareStr3(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_STR_3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SpareStr3_Asc() { regOBA("SPARE_STR_3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR_3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SpareStr3_Desc() { regOBD("SPARE_STR_3"); return this; }

    protected ConditionValue _spareNum1;
    public ConditionValue xdfgetSpareNum1()
    { if (_spareNum1 == null) { _spareNum1 = nCV(); }
      return _spareNum1; }
    protected ConditionValue xgetCValueSpareNum1() { return xdfgetSpareNum1(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_NUM_1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SpareNum1_Asc() { regOBA("SPARE_NUM_1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_NUM_1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SpareNum1_Desc() { regOBD("SPARE_NUM_1"); return this; }

    protected ConditionValue _spareNum2;
    public ConditionValue xdfgetSpareNum2()
    { if (_spareNum2 == null) { _spareNum2 = nCV(); }
      return _spareNum2; }
    protected ConditionValue xgetCValueSpareNum2() { return xdfgetSpareNum2(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_NUM_2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SpareNum2_Asc() { regOBA("SPARE_NUM_2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_NUM_2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SpareNum2_Desc() { regOBD("SPARE_NUM_2"); return this; }

    protected ConditionValue _spareNum3;
    public ConditionValue xdfgetSpareNum3()
    { if (_spareNum3 == null) { _spareNum3 = nCV(); }
      return _spareNum3; }
    protected ConditionValue xgetCValueSpareNum3() { return xdfgetSpareNum3(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_NUM_3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SpareNum3_Asc() { regOBA("SPARE_NUM_3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_NUM_3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_SpareNum3_Desc() { regOBD("SPARE_NUM_3"); return this; }

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
    public BsEShippingInstCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEShippingInstCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEShippingInstCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEShippingInstCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEShippingInstCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEShippingInstCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEShippingInstCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEShippingInstCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEShippingInstCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEShippingInstCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEShippingInstCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEShippingInstCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EShippingInstCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EShippingInstCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EShippingInstCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EShippingInstCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EShippingInstCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EShippingInstCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EShippingInstCQ> _myselfExistsMap;
    public Map<String, EShippingInstCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EShippingInstCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EShippingInstCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EShippingInstCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EShippingInstCB.class.getName(); }
    protected String xCQ() { return EShippingInstCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

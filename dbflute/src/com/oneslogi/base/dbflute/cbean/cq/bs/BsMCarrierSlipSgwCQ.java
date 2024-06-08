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
 * The base condition-query of M_CARRIER_SLIP_SGW.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCarrierSlipSgwCQ extends AbstractBsMCarrierSlipSgwCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCarrierSlipSgwCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierSlipSgwCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CARRIER_SLIP_SGW) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCarrierSlipSgwCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCarrierSlipSgwCIQ xcreateCIQ() {
        MCarrierSlipSgwCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCarrierSlipSgwCIQ xnewCIQ() {
        return new MCarrierSlipSgwCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CARRIER_SLIP_SGW on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCarrierSlipSgwCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCarrierSlipSgwCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _carrierSlipSgwId;
    public ConditionValue xdfgetCarrierSlipSgwId()
    { if (_carrierSlipSgwId == null) { _carrierSlipSgwId = nCV(); }
      return _carrierSlipSgwId; }
    protected ConditionValue xgetCValueCarrierSlipSgwId() { return xdfgetCarrierSlipSgwId(); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierSlipSgwId_ExistsReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierSlipSgwId_ExistsReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipSgwId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierSlipSgwId_ExistsReferrer_MDeliveryCourseList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierSlipSgwId_NotExistsReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierSlipSgwId_NotExistsReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipSgwId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierSlipSgwId_NotExistsReferrer_MDeliveryCourseList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierSlipSgwId_SpecifyDerivedReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierSlipSgwId_SpecifyDerivedReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipSgwId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierSlipSgwId_SpecifyDerivedReferrer_MDeliveryCourseList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierSlipSgwId_QueryDerivedReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierSlipSgwId_QueryDerivedReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipSgwId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierSlipSgwId_QueryDerivedReferrer_MDeliveryCourseList", sq); }
    public Map<String, Object> xdfgetCarrierSlipSgwId_QueryDerivedReferrer_MDeliveryCourseListParameter() { return xgetSQuePmMap("carrierSlipSgwId_QueryDerivedReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipSgwId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object pm) { return xkeepSQuePm("carrierSlipSgwId_QueryDerivedReferrer_MDeliveryCourseList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_CarrierSlipSgwId_Asc() { regOBA("CARRIER_SLIP_SGW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_CarrierSlipSgwId_Desc() { regOBD("CARRIER_SLIP_SGW_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _tagType;
    public ConditionValue xdfgetTagType()
    { if (_tagType == null) { _tagType = nCV(); }
      return _tagType; }
    protected ConditionValue xgetCValueTagType() { return xdfgetTagType(); }

    /**
     * Add order-by as ascend. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_TagType_Asc() { regOBA("TAG_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_TagType_Desc() { regOBD("TAG_TYPE"); return this; }

    protected ConditionValue _tagNm;
    public ConditionValue xdfgetTagNm()
    { if (_tagNm == null) { _tagNm = nCV(); }
      return _tagNm; }
    protected ConditionValue xgetCValueTagNm() { return xdfgetTagNm(); }

    /**
     * Add order-by as ascend. <br>
     * TAG_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_TagNm_Asc() { regOBA("TAG_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_TagNm_Desc() { regOBD("TAG_NM"); return this; }

    protected ConditionValue _characterCd;
    public ConditionValue xdfgetCharacterCd()
    { if (_characterCd == null) { _characterCd = nCV(); }
      return _characterCd; }
    protected ConditionValue xgetCValueCharacterCd() { return xdfgetCharacterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_CharacterCd_Asc() { regOBA("CHARACTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_CharacterCd_Desc() { regOBD("CHARACTER_CD"); return this; }

    protected ConditionValue _slipCustomerCd;
    public ConditionValue xdfgetSlipCustomerCd()
    { if (_slipCustomerCd == null) { _slipCustomerCd = nCV(); }
      return _slipCustomerCd; }
    protected ConditionValue xgetCValueSlipCustomerCd() { return xdfgetSlipCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipCustomerCd_Asc() { regOBA("SLIP_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CUSTOMER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipCustomerCd_Desc() { regOBD("SLIP_CUSTOMER_CD"); return this; }

    protected ConditionValue _webApiRequestUrl;
    public ConditionValue xdfgetWebApiRequestUrl()
    { if (_webApiRequestUrl == null) { _webApiRequestUrl = nCV(); }
      return _webApiRequestUrl; }
    protected ConditionValue xgetCValueWebApiRequestUrl() { return xdfgetWebApiRequestUrl(); }

    /**
     * Add order-by as ascend. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_WebApiRequestUrl_Asc() { regOBA("WEB_API_REQUEST_URL"); return this; }

    /**
     * Add order-by as descend. <br>
     * WEB_API_REQUEST_URL: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_WebApiRequestUrl_Desc() { regOBD("WEB_API_REQUEST_URL"); return this; }

    protected ConditionValue _customerId;
    public ConditionValue xdfgetCustomerId()
    { if (_customerId == null) { _customerId = nCV(); }
      return _customerId; }
    protected ConditionValue xgetCValueCustomerId() { return xdfgetCustomerId(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_CustomerId_Asc() { regOBA("CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_CustomerId_Desc() { regOBD("CUSTOMER_ID"); return this; }

    protected ConditionValue _loginPassword;
    public ConditionValue xdfgetLoginPassword()
    { if (_loginPassword == null) { _loginPassword = nCV(); }
      return _loginPassword; }
    protected ConditionValue xgetCValueLoginPassword() { return xdfgetLoginPassword(); }

    /**
     * Add order-by as ascend. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_LoginPassword_Asc() { regOBA("LOGIN_PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGIN_PASSWORD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_LoginPassword_Desc() { regOBD("LOGIN_PASSWORD"); return this; }

    protected ConditionValue _deptConsignorNm;
    public ConditionValue xdfgetDeptConsignorNm()
    { if (_deptConsignorNm == null) { _deptConsignorNm = nCV(); }
      return _deptConsignorNm; }
    protected ConditionValue xgetCValueDeptConsignorNm() { return xdfgetDeptConsignorNm(); }

    /**
     * Add order-by as ascend. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_DeptConsignorNm_Asc() { regOBA("DEPT_CONSIGNOR_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_DeptConsignorNm_Desc() { regOBD("DEPT_CONSIGNOR_NM"); return this; }

    protected ConditionValue _consignorTelNo;
    public ConditionValue xdfgetConsignorTelNo()
    { if (_consignorTelNo == null) { _consignorTelNo = nCV(); }
      return _consignorTelNo; }
    protected ConditionValue xgetCValueConsignorTelNo() { return xdfgetConsignorTelNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ConsignorTelNo_Asc() { regOBA("CONSIGNOR_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONSIGNOR_TEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ConsignorTelNo_Desc() { regOBD("CONSIGNOR_TEL_NO"); return this; }

    protected ConditionValue _slipClientTelNo;
    public ConditionValue xdfgetSlipClientTelNo()
    { if (_slipClientTelNo == null) { _slipClientTelNo = nCV(); }
      return _slipClientTelNo; }
    protected ConditionValue xgetCValueSlipClientTelNo() { return xdfgetSlipClientTelNo(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipClientTelNo_Asc() { regOBA("SLIP_CLIENT_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipClientTelNo_Desc() { regOBD("SLIP_CLIENT_TEL_NO"); return this; }

    protected ConditionValue _slipClientZipCd;
    public ConditionValue xdfgetSlipClientZipCd()
    { if (_slipClientZipCd == null) { _slipClientZipCd = nCV(); }
      return _slipClientZipCd; }
    protected ConditionValue xgetCValueSlipClientZipCd() { return xdfgetSlipClientZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipClientZipCd_Asc() { regOBA("SLIP_CLIENT_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipClientZipCd_Desc() { regOBD("SLIP_CLIENT_ZIP_CD"); return this; }

    protected ConditionValue _slipClientAddress1;
    public ConditionValue xdfgetSlipClientAddress1()
    { if (_slipClientAddress1 == null) { _slipClientAddress1 = nCV(); }
      return _slipClientAddress1; }
    protected ConditionValue xgetCValueSlipClientAddress1() { return xdfgetSlipClientAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipClientAddress1_Asc() { regOBA("SLIP_CLIENT_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipClientAddress1_Desc() { regOBD("SLIP_CLIENT_ADDRESS1"); return this; }

    protected ConditionValue _slipClientAddress2;
    public ConditionValue xdfgetSlipClientAddress2()
    { if (_slipClientAddress2 == null) { _slipClientAddress2 = nCV(); }
      return _slipClientAddress2; }
    protected ConditionValue xgetCValueSlipClientAddress2() { return xdfgetSlipClientAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipClientAddress2_Asc() { regOBA("SLIP_CLIENT_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipClientAddress2_Desc() { regOBD("SLIP_CLIENT_ADDRESS2"); return this; }

    protected ConditionValue _slipClientNm1;
    public ConditionValue xdfgetSlipClientNm1()
    { if (_slipClientNm1 == null) { _slipClientNm1 = nCV(); }
      return _slipClientNm1; }
    protected ConditionValue xgetCValueSlipClientNm1() { return xdfgetSlipClientNm1(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipClientNm1_Asc() { regOBA("SLIP_CLIENT_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipClientNm1_Desc() { regOBD("SLIP_CLIENT_NM1"); return this; }

    protected ConditionValue _slipClientNm2;
    public ConditionValue xdfgetSlipClientNm2()
    { if (_slipClientNm2 == null) { _slipClientNm2 = nCV(); }
      return _slipClientNm2; }
    protected ConditionValue xgetCValueSlipClientNm2() { return xdfgetSlipClientNm2(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_CLIENT_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipClientNm2_Asc() { regOBA("SLIP_CLIENT_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipClientNm2_Desc() { regOBD("SLIP_CLIENT_NM2"); return this; }

    protected ConditionValue _slipShapeCd;
    public ConditionValue xdfgetSlipShapeCd()
    { if (_slipShapeCd == null) { _slipShapeCd = nCV(); }
      return _slipShapeCd; }
    protected ConditionValue xgetCValueSlipShapeCd() { return xdfgetSlipShapeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipShapeCd_Asc() { regOBA("SLIP_SHAPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipShapeCd_Desc() { regOBD("SLIP_SHAPE_CD"); return this; }

    protected ConditionValue _slipItemNm1;
    public ConditionValue xdfgetSlipItemNm1()
    { if (_slipItemNm1 == null) { _slipItemNm1 = nCV(); }
      return _slipItemNm1; }
    protected ConditionValue xgetCValueSlipItemNm1() { return xdfgetSlipItemNm1(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipItemNm1_Asc() { regOBA("SLIP_ITEM_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipItemNm1_Desc() { regOBD("SLIP_ITEM_NM1"); return this; }

    protected ConditionValue _slipItemNm2;
    public ConditionValue xdfgetSlipItemNm2()
    { if (_slipItemNm2 == null) { _slipItemNm2 = nCV(); }
      return _slipItemNm2; }
    protected ConditionValue xgetCValueSlipItemNm2() { return xdfgetSlipItemNm2(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipItemNm2_Asc() { regOBA("SLIP_ITEM_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipItemNm2_Desc() { regOBD("SLIP_ITEM_NM2"); return this; }

    protected ConditionValue _slipItemNm3;
    public ConditionValue xdfgetSlipItemNm3()
    { if (_slipItemNm3 == null) { _slipItemNm3 = nCV(); }
      return _slipItemNm3; }
    protected ConditionValue xgetCValueSlipItemNm3() { return xdfgetSlipItemNm3(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipItemNm3_Asc() { regOBA("SLIP_ITEM_NM3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipItemNm3_Desc() { regOBD("SLIP_ITEM_NM3"); return this; }

    protected ConditionValue _slipItemNm4;
    public ConditionValue xdfgetSlipItemNm4()
    { if (_slipItemNm4 == null) { _slipItemNm4 = nCV(); }
      return _slipItemNm4; }
    protected ConditionValue xgetCValueSlipItemNm4() { return xdfgetSlipItemNm4(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipItemNm4_Asc() { regOBA("SLIP_ITEM_NM4"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipItemNm4_Desc() { regOBD("SLIP_ITEM_NM4"); return this; }

    protected ConditionValue _slipItemNm5;
    public ConditionValue xdfgetSlipItemNm5()
    { if (_slipItemNm5 == null) { _slipItemNm5 = nCV(); }
      return _slipItemNm5; }
    protected ConditionValue xgetCValueSlipItemNm5() { return xdfgetSlipItemNm5(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipItemNm5_Asc() { regOBA("SLIP_ITEM_NM5"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SlipItemNm5_Desc() { regOBD("SLIP_ITEM_NM5"); return this; }

    protected ConditionValue _transportTypeSpeed;
    public ConditionValue xdfgetTransportTypeSpeed()
    { if (_transportTypeSpeed == null) { _transportTypeSpeed = nCV(); }
      return _transportTypeSpeed; }
    protected ConditionValue xgetCValueTransportTypeSpeed() { return xdfgetTransportTypeSpeed(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_TransportTypeSpeed_Asc() { regOBA("TRANSPORT_TYPE_SPEED"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_TransportTypeSpeed_Desc() { regOBD("TRANSPORT_TYPE_SPEED"); return this; }

    protected ConditionValue _transportTypeItem;
    public ConditionValue xdfgetTransportTypeItem()
    { if (_transportTypeItem == null) { _transportTypeItem = nCV(); }
      return _transportTypeItem; }
    protected ConditionValue xgetCValueTransportTypeItem() { return xdfgetTransportTypeItem(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_TransportTypeItem_Asc() { regOBA("TRANSPORT_TYPE_ITEM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_TransportTypeItem_Desc() { regOBD("TRANSPORT_TYPE_ITEM"); return this; }

    protected ConditionValue _settlementType;
    public ConditionValue xdfgetSettlementType()
    { if (_settlementType == null) { _settlementType = nCV(); }
      return _settlementType; }
    protected ConditionValue xgetCValueSettlementType() { return xdfgetSettlementType(); }

    /**
     * Add order-by as ascend. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SettlementType_Asc() { regOBA("SETTLEMENT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SettlementType_Desc() { regOBD("SETTLEMENT_TYPE"); return this; }

    protected ConditionValue _sealType1;
    public ConditionValue xdfgetSealType1()
    { if (_sealType1 == null) { _sealType1 = nCV(); }
      return _sealType1; }
    protected ConditionValue xgetCValueSealType1() { return xdfgetSealType1(); }

    /**
     * Add order-by as ascend. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SealType1_Asc() { regOBA("SEAL_TYPE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SealType1_Desc() { regOBD("SEAL_TYPE1"); return this; }

    protected ConditionValue _sealType2;
    public ConditionValue xdfgetSealType2()
    { if (_sealType2 == null) { _sealType2 = nCV(); }
      return _sealType2; }
    protected ConditionValue xgetCValueSealType2() { return xdfgetSealType2(); }

    /**
     * Add order-by as ascend. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SealType2_Asc() { regOBA("SEAL_TYPE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SealType2_Desc() { regOBD("SEAL_TYPE2"); return this; }

    protected ConditionValue _sealType3;
    public ConditionValue xdfgetSealType3()
    { if (_sealType3 == null) { _sealType3 = nCV(); }
      return _sealType3; }
    protected ConditionValue xgetCValueSealType3() { return xdfgetSealType3(); }

    /**
     * Add order-by as ascend. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SealType3_Asc() { regOBA("SEAL_TYPE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SealType3_Desc() { regOBD("SEAL_TYPE3"); return this; }

    protected ConditionValue _codCls;
    public ConditionValue xdfgetCodCls()
    { if (_codCls == null) { _codCls = nCV(); }
      return _codCls; }
    protected ConditionValue xgetCValueCodCls() { return xdfgetCodCls(); }

    /**
     * Add order-by as ascend. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_CodCls_Asc() { regOBA("COD_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_CodCls_Desc() { regOBD("COD_CLS"); return this; }

    protected ConditionValue _sendCd;
    public ConditionValue xdfgetSendCd()
    { if (_sendCd == null) { _sendCd = nCV(); }
      return _sendCd; }
    protected ConditionValue xgetCValueSendCd() { return xdfgetSendCd(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

    protected ConditionValue _apiOkuriCode;
    public ConditionValue xdfgetApiOkuriCode()
    { if (_apiOkuriCode == null) { _apiOkuriCode = nCV(); }
      return _apiOkuriCode; }
    protected ConditionValue xgetCValueApiOkuriCode() { return xdfgetApiOkuriCode(); }

    /**
     * Add order-by as ascend. <br>
     * API_OKURI_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ApiOkuriCode_Asc() { regOBA("API_OKURI_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * API_OKURI_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ApiOkuriCode_Desc() { regOBD("API_OKURI_CODE"); return this; }

    protected ConditionValue _apiBinsyuCode;
    public ConditionValue xdfgetApiBinsyuCode()
    { if (_apiBinsyuCode == null) { _apiBinsyuCode = nCV(); }
      return _apiBinsyuCode; }
    protected ConditionValue xgetCValueApiBinsyuCode() { return xdfgetApiBinsyuCode(); }

    /**
     * Add order-by as ascend. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ApiBinsyuCode_Asc() { regOBA("API_BINSYU_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ApiBinsyuCode_Desc() { regOBD("API_BINSYU_CODE"); return this; }

    protected ConditionValue _apiDaibikiFlg;
    public ConditionValue xdfgetApiDaibikiFlg()
    { if (_apiDaibikiFlg == null) { _apiDaibikiFlg = nCV(); }
      return _apiDaibikiFlg; }
    protected ConditionValue xgetCValueApiDaibikiFlg() { return xdfgetApiDaibikiFlg(); }

    /**
     * Add order-by as ascend. <br>
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ApiDaibikiFlg_Asc() { regOBA("API_DAIBIKI_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ApiDaibikiFlg_Desc() { regOBD("API_DAIBIKI_FLG"); return this; }

    protected ConditionValue _apiDaibikiType;
    public ConditionValue xdfgetApiDaibikiType()
    { if (_apiDaibikiType == null) { _apiDaibikiType = nCV(); }
      return _apiDaibikiType; }
    protected ConditionValue xgetCValueApiDaibikiType() { return xdfgetApiDaibikiType(); }

    /**
     * Add order-by as ascend. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ApiDaibikiType_Asc() { regOBA("API_DAIBIKI_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ApiDaibikiType_Desc() { regOBD("API_DAIBIKI_TYPE"); return this; }

    protected ConditionValue _apiWeightCd1;
    public ConditionValue xdfgetApiWeightCd1()
    { if (_apiWeightCd1 == null) { _apiWeightCd1 = nCV(); }
      return _apiWeightCd1; }
    protected ConditionValue xgetCValueApiWeightCd1() { return xdfgetApiWeightCd1(); }

    /**
     * Add order-by as ascend. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ApiWeightCd1_Asc() { regOBA("API_WEIGHT_CD_1"); return this; }

    /**
     * Add order-by as descend. <br>
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ApiWeightCd1_Desc() { regOBD("API_WEIGHT_CD_1"); return this; }

    protected ConditionValue _apiWeightCd2;
    public ConditionValue xdfgetApiWeightCd2()
    { if (_apiWeightCd2 == null) { _apiWeightCd2 = nCV(); }
      return _apiWeightCd2; }
    protected ConditionValue xgetCValueApiWeightCd2() { return xdfgetApiWeightCd2(); }

    /**
     * Add order-by as ascend. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ApiWeightCd2_Asc() { regOBA("API_WEIGHT_CD_2"); return this; }

    /**
     * Add order-by as descend. <br>
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ApiWeightCd2_Desc() { regOBD("API_WEIGHT_CD_2"); return this; }

    protected ConditionValue _apiEidomeFlg;
    public ConditionValue xdfgetApiEidomeFlg()
    { if (_apiEidomeFlg == null) { _apiEidomeFlg = nCV(); }
      return _apiEidomeFlg; }
    protected ConditionValue xgetCValueApiEidomeFlg() { return xdfgetApiEidomeFlg(); }

    /**
     * Add order-by as ascend. <br>
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ApiEidomeFlg_Asc() { regOBA("API_EIDOME_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ApiEidomeFlg_Desc() { regOBD("API_EIDOME_FLG"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCarrierSlipSgwCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCarrierSlipSgwCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCarrierSlipSgwCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCarrierSlipSgwCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCarrierSlipSgwCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCarrierSlipSgwCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCarrierSlipSgwCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCarrierSlipSgwCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipSgwCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCarrierSlipSgwCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCarrierSlipSgwCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCarrierSlipSgwCQ bq = (MCarrierSlipSgwCQ)bqs;
        MCarrierSlipSgwCQ uq = (MCarrierSlipSgwCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMCenterClassDtlByApiBinsyuCode()) {
            uq.xsetParameterMapMCenterClassDtlByApiBinsyuCode(bq.xdfgetParameterMapMCenterClassDtlByApiBinsyuCode());
            uq.xdfgetConditionQueryMCenterClassDtlByApiBinsyuCode().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlByApiBinsyuCode(), uq.xdfgetConditionQueryMCenterClassDtlByApiBinsyuCode());
        }
        if (bq.hasConditionQueryMCenterClassDtlByApiDaibikiFlg()) {
            uq.xsetParameterMapMCenterClassDtlByApiDaibikiFlg(bq.xdfgetParameterMapMCenterClassDtlByApiDaibikiFlg());
            uq.xdfgetConditionQueryMCenterClassDtlByApiDaibikiFlg().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlByApiDaibikiFlg(), uq.xdfgetConditionQueryMCenterClassDtlByApiDaibikiFlg());
        }
        if (bq.hasConditionQueryMCenterClassDtlByApiDaibikiType()) {
            uq.xsetParameterMapMCenterClassDtlByApiDaibikiType(bq.xdfgetParameterMapMCenterClassDtlByApiDaibikiType());
            uq.xdfgetConditionQueryMCenterClassDtlByApiDaibikiType().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlByApiDaibikiType(), uq.xdfgetConditionQueryMCenterClassDtlByApiDaibikiType());
        }
        if (bq.hasConditionQueryMCenterClassDtlByApiEidomeFlg()) {
            uq.xsetParameterMapMCenterClassDtlByApiEidomeFlg(bq.xdfgetParameterMapMCenterClassDtlByApiEidomeFlg());
            uq.xdfgetConditionQueryMCenterClassDtlByApiEidomeFlg().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlByApiEidomeFlg(), uq.xdfgetConditionQueryMCenterClassDtlByApiEidomeFlg());
        }
        if (bq.hasConditionQueryMCenterClassDtlByApiWeightCd1()) {
            uq.xsetParameterMapMCenterClassDtlByApiWeightCd1(bq.xdfgetParameterMapMCenterClassDtlByApiWeightCd1());
            uq.xdfgetConditionQueryMCenterClassDtlByApiWeightCd1().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlByApiWeightCd1(), uq.xdfgetConditionQueryMCenterClassDtlByApiWeightCd1());
        }
        if (bq.hasConditionQueryMCenterClassDtlByApiWeightCd2()) {
            uq.xsetParameterMapMCenterClassDtlByApiWeightCd2(bq.xdfgetParameterMapMCenterClassDtlByApiWeightCd2());
            uq.xdfgetConditionQueryMCenterClassDtlByApiWeightCd2().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlByApiWeightCd2(), uq.xdfgetConditionQueryMCenterClassDtlByApiWeightCd2());
        }
        if (bq.hasConditionQueryBClassDtlByCharacterCd()) {
            uq.queryBClassDtlByCharacterCd().reflectRelationOnUnionQuery(bq.queryBClassDtlByCharacterCd(), uq.queryBClassDtlByCharacterCd());
        }
        if (bq.hasConditionQueryBClassDtlByCodCls()) {
            uq.queryBClassDtlByCodCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByCodCls(), uq.queryBClassDtlByCodCls());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
        if (bq.hasConditionQueryMCenterClassDtlBySealType1()) {
            uq.xsetParameterMapMCenterClassDtlBySealType1(bq.xdfgetParameterMapMCenterClassDtlBySealType1());
            uq.xdfgetConditionQueryMCenterClassDtlBySealType1().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlBySealType1(), uq.xdfgetConditionQueryMCenterClassDtlBySealType1());
        }
        if (bq.hasConditionQueryMCenterClassDtlBySealType2()) {
            uq.xsetParameterMapMCenterClassDtlBySealType2(bq.xdfgetParameterMapMCenterClassDtlBySealType2());
            uq.xdfgetConditionQueryMCenterClassDtlBySealType2().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlBySealType2(), uq.xdfgetConditionQueryMCenterClassDtlBySealType2());
        }
        if (bq.hasConditionQueryMCenterClassDtlBySealType3()) {
            uq.xsetParameterMapMCenterClassDtlBySealType3(bq.xdfgetParameterMapMCenterClassDtlBySealType3());
            uq.xdfgetConditionQueryMCenterClassDtlBySealType3().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlBySealType3(), uq.xdfgetConditionQueryMCenterClassDtlBySealType3());
        }
        if (bq.hasConditionQueryBClassDtlBySettlementType()) {
            uq.queryBClassDtlBySettlementType().reflectRelationOnUnionQuery(bq.queryBClassDtlBySettlementType(), uq.queryBClassDtlBySettlementType());
        }
        if (bq.hasConditionQueryMCenterClassDtlBySlipShapeCd()) {
            uq.xsetParameterMapMCenterClassDtlBySlipShapeCd(bq.xdfgetParameterMapMCenterClassDtlBySlipShapeCd());
            uq.xdfgetConditionQueryMCenterClassDtlBySlipShapeCd().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlBySlipShapeCd(), uq.xdfgetConditionQueryMCenterClassDtlBySlipShapeCd());
        }
        if (bq.hasConditionQueryMCenterClassDtlByTransportTypeItem()) {
            uq.xsetParameterMapMCenterClassDtlByTransportTypeItem(bq.xdfgetParameterMapMCenterClassDtlByTransportTypeItem());
            uq.xdfgetConditionQueryMCenterClassDtlByTransportTypeItem().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlByTransportTypeItem(), uq.xdfgetConditionQueryMCenterClassDtlByTransportTypeItem());
        }
        if (bq.hasConditionQueryMCenterClassDtlByTransportTypeSpeed()) {
            uq.xsetParameterMapMCenterClassDtlByTransportTypeSpeed(bq.xdfgetParameterMapMCenterClassDtlByTransportTypeSpeed());
            uq.xdfgetConditionQueryMCenterClassDtlByTransportTypeSpeed().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryMCenterClassDtlByTransportTypeSpeed(), uq.xdfgetConditionQueryMCenterClassDtlByTransportTypeSpeed());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my API_BINSYU_CODE, named 'MCenterClassDtlByApiBinsyuCode'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlByApiBinsyuCode(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlByApiBinsyuCode();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlByApiBinsyuCode", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlByApiBinsyuCode();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlByApiBinsyuCode() {
        String prop = "mCenterClassDtlByApiBinsyuCode";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlByApiBinsyuCode()); xsetupOuterJoinMCenterClassDtlByApiBinsyuCode(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlByApiBinsyuCode;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlByApiBinsyuCode()
    { if (_parameterMapMCenterClassDtlByApiBinsyuCode == null) { _parameterMapMCenterClassDtlByApiBinsyuCode = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlByApiBinsyuCode; }
    public void xsetParameterMapMCenterClassDtlByApiBinsyuCode(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlByApiBinsyuCode = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlByApiBinsyuCode() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "mCenterClassDtlByApiBinsyuCode"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlByApiBinsyuCode", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlByApiBinsyuCode() { xregOutJo("mCenterClassDtlByApiBinsyuCode"); }
    public boolean hasConditionQueryMCenterClassDtlByApiBinsyuCode() { return xhasQueRlMap("mCenterClassDtlByApiBinsyuCode"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my API_DAIBIKI_FLG, named 'MCenterClassDtlByApiDaibikiFlg'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlByApiDaibikiFlg(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlByApiDaibikiFlg();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlByApiDaibikiFlg", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlByApiDaibikiFlg();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlByApiDaibikiFlg() {
        String prop = "mCenterClassDtlByApiDaibikiFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlByApiDaibikiFlg()); xsetupOuterJoinMCenterClassDtlByApiDaibikiFlg(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlByApiDaibikiFlg;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlByApiDaibikiFlg()
    { if (_parameterMapMCenterClassDtlByApiDaibikiFlg == null) { _parameterMapMCenterClassDtlByApiDaibikiFlg = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlByApiDaibikiFlg; }
    public void xsetParameterMapMCenterClassDtlByApiDaibikiFlg(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlByApiDaibikiFlg = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlByApiDaibikiFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "mCenterClassDtlByApiDaibikiFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlByApiDaibikiFlg", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlByApiDaibikiFlg() { xregOutJo("mCenterClassDtlByApiDaibikiFlg"); }
    public boolean hasConditionQueryMCenterClassDtlByApiDaibikiFlg() { return xhasQueRlMap("mCenterClassDtlByApiDaibikiFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my API_DAIBIKI_TYPE, named 'MCenterClassDtlByApiDaibikiType'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlByApiDaibikiType(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlByApiDaibikiType();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlByApiDaibikiType", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlByApiDaibikiType();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlByApiDaibikiType() {
        String prop = "mCenterClassDtlByApiDaibikiType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlByApiDaibikiType()); xsetupOuterJoinMCenterClassDtlByApiDaibikiType(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlByApiDaibikiType;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlByApiDaibikiType()
    { if (_parameterMapMCenterClassDtlByApiDaibikiType == null) { _parameterMapMCenterClassDtlByApiDaibikiType = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlByApiDaibikiType; }
    public void xsetParameterMapMCenterClassDtlByApiDaibikiType(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlByApiDaibikiType = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlByApiDaibikiType() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "mCenterClassDtlByApiDaibikiType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlByApiDaibikiType", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlByApiDaibikiType() { xregOutJo("mCenterClassDtlByApiDaibikiType"); }
    public boolean hasConditionQueryMCenterClassDtlByApiDaibikiType() { return xhasQueRlMap("mCenterClassDtlByApiDaibikiType"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my API_EIDOME_FLG, named 'MCenterClassDtlByApiEidomeFlg'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlByApiEidomeFlg(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlByApiEidomeFlg();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlByApiEidomeFlg", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlByApiEidomeFlg();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlByApiEidomeFlg() {
        String prop = "mCenterClassDtlByApiEidomeFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlByApiEidomeFlg()); xsetupOuterJoinMCenterClassDtlByApiEidomeFlg(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlByApiEidomeFlg;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlByApiEidomeFlg()
    { if (_parameterMapMCenterClassDtlByApiEidomeFlg == null) { _parameterMapMCenterClassDtlByApiEidomeFlg = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlByApiEidomeFlg; }
    public void xsetParameterMapMCenterClassDtlByApiEidomeFlg(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlByApiEidomeFlg = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlByApiEidomeFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "mCenterClassDtlByApiEidomeFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlByApiEidomeFlg", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlByApiEidomeFlg() { xregOutJo("mCenterClassDtlByApiEidomeFlg"); }
    public boolean hasConditionQueryMCenterClassDtlByApiEidomeFlg() { return xhasQueRlMap("mCenterClassDtlByApiEidomeFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my API_WEIGHT_CD_1, named 'MCenterClassDtlByApiWeightCd1'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlByApiWeightCd1(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlByApiWeightCd1();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlByApiWeightCd1", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlByApiWeightCd1();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlByApiWeightCd1() {
        String prop = "mCenterClassDtlByApiWeightCd1";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlByApiWeightCd1()); xsetupOuterJoinMCenterClassDtlByApiWeightCd1(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlByApiWeightCd1;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlByApiWeightCd1()
    { if (_parameterMapMCenterClassDtlByApiWeightCd1 == null) { _parameterMapMCenterClassDtlByApiWeightCd1 = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlByApiWeightCd1; }
    public void xsetParameterMapMCenterClassDtlByApiWeightCd1(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlByApiWeightCd1 = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlByApiWeightCd1() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "mCenterClassDtlByApiWeightCd1"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlByApiWeightCd1", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlByApiWeightCd1() { xregOutJo("mCenterClassDtlByApiWeightCd1"); }
    public boolean hasConditionQueryMCenterClassDtlByApiWeightCd1() { return xhasQueRlMap("mCenterClassDtlByApiWeightCd1"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my API_WEIGHT_CD_2, named 'MCenterClassDtlByApiWeightCd2'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlByApiWeightCd2(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlByApiWeightCd2();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlByApiWeightCd2", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlByApiWeightCd2();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlByApiWeightCd2() {
        String prop = "mCenterClassDtlByApiWeightCd2";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlByApiWeightCd2()); xsetupOuterJoinMCenterClassDtlByApiWeightCd2(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlByApiWeightCd2;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlByApiWeightCd2()
    { if (_parameterMapMCenterClassDtlByApiWeightCd2 == null) { _parameterMapMCenterClassDtlByApiWeightCd2 = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlByApiWeightCd2; }
    public void xsetParameterMapMCenterClassDtlByApiWeightCd2(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlByApiWeightCd2 = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlByApiWeightCd2() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "mCenterClassDtlByApiWeightCd2"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlByApiWeightCd2", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlByApiWeightCd2() { xregOutJo("mCenterClassDtlByApiWeightCd2"); }
    public boolean hasConditionQueryMCenterClassDtlByApiWeightCd2() { return xhasQueRlMap("mCenterClassDtlByApiWeightCd2"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my CHARACTER_CD, named 'BClassDtlByCharacterCd'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCharacterCd() {
        return xdfgetConditionQueryBClassDtlByCharacterCd();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCharacterCd() {
        String prop = "bClassDtlByCharacterCd";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCharacterCd()); xsetupOuterJoinBClassDtlByCharacterCd(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCharacterCd() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "bClassDtlByCharacterCd"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCharacterCd", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCharacterCd() { xregOutJo("bClassDtlByCharacterCd"); }
    public boolean hasConditionQueryBClassDtlByCharacterCd() { return xhasQueRlMap("bClassDtlByCharacterCd"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my COD_CLS, named 'BClassDtlByCodCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCodCls() {
        return xdfgetConditionQueryBClassDtlByCodCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCodCls() {
        String prop = "bClassDtlByCodCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCodCls()); xsetupOuterJoinBClassDtlByCodCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCodCls() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "bClassDtlByCodCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCodCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCodCls() { xregOutJo("bClassDtlByCodCls"); }
    public boolean hasConditionQueryBClassDtlByCodCls() { return xhasQueRlMap("bClassDtlByCodCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelFlg() {
        return xdfgetConditionQueryBClassDtlByDelFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelFlg() {
        String prop = "bClassDtlByDelFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelFlg()); xsetupOuterJoinBClassDtlByDelFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my SEAL_TYPE1, named 'MCenterClassDtlBySealType1'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlBySealType1(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlBySealType1();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlBySealType1", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlBySealType1();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlBySealType1() {
        String prop = "mCenterClassDtlBySealType1";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlBySealType1()); xsetupOuterJoinMCenterClassDtlBySealType1(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlBySealType1;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlBySealType1()
    { if (_parameterMapMCenterClassDtlBySealType1 == null) { _parameterMapMCenterClassDtlBySealType1 = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlBySealType1; }
    public void xsetParameterMapMCenterClassDtlBySealType1(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlBySealType1 = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlBySealType1() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "mCenterClassDtlBySealType1"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlBySealType1", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlBySealType1() { xregOutJo("mCenterClassDtlBySealType1"); }
    public boolean hasConditionQueryMCenterClassDtlBySealType1() { return xhasQueRlMap("mCenterClassDtlBySealType1"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my SEAL_TYPE2, named 'MCenterClassDtlBySealType2'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlBySealType2(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlBySealType2();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlBySealType2", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlBySealType2();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlBySealType2() {
        String prop = "mCenterClassDtlBySealType2";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlBySealType2()); xsetupOuterJoinMCenterClassDtlBySealType2(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlBySealType2;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlBySealType2()
    { if (_parameterMapMCenterClassDtlBySealType2 == null) { _parameterMapMCenterClassDtlBySealType2 = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlBySealType2; }
    public void xsetParameterMapMCenterClassDtlBySealType2(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlBySealType2 = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlBySealType2() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "mCenterClassDtlBySealType2"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlBySealType2", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlBySealType2() { xregOutJo("mCenterClassDtlBySealType2"); }
    public boolean hasConditionQueryMCenterClassDtlBySealType2() { return xhasQueRlMap("mCenterClassDtlBySealType2"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my SEAL_TYPE3, named 'MCenterClassDtlBySealType3'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlBySealType3(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlBySealType3();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlBySealType3", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlBySealType3();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlBySealType3() {
        String prop = "mCenterClassDtlBySealType3";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlBySealType3()); xsetupOuterJoinMCenterClassDtlBySealType3(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlBySealType3;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlBySealType3()
    { if (_parameterMapMCenterClassDtlBySealType3 == null) { _parameterMapMCenterClassDtlBySealType3 = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlBySealType3; }
    public void xsetParameterMapMCenterClassDtlBySealType3(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlBySealType3 = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlBySealType3() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "mCenterClassDtlBySealType3"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlBySealType3", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlBySealType3() { xregOutJo("mCenterClassDtlBySealType3"); }
    public boolean hasConditionQueryMCenterClassDtlBySealType3() { return xhasQueRlMap("mCenterClassDtlBySealType3"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SETTLEMENT_TYPE, named 'BClassDtlBySettlementType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySettlementType() {
        return xdfgetConditionQueryBClassDtlBySettlementType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySettlementType() {
        String prop = "bClassDtlBySettlementType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySettlementType()); xsetupOuterJoinBClassDtlBySettlementType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySettlementType() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "bClassDtlBySettlementType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySettlementType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySettlementType() { xregOutJo("bClassDtlBySettlementType"); }
    public boolean hasConditionQueryBClassDtlBySettlementType() { return xhasQueRlMap("bClassDtlBySettlementType"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my SLIP_SHAPE_CD, named 'MCenterClassDtlBySlipShapeCd'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlBySlipShapeCd(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlBySlipShapeCd();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlBySlipShapeCd", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlBySlipShapeCd();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlBySlipShapeCd() {
        String prop = "mCenterClassDtlBySlipShapeCd";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlBySlipShapeCd()); xsetupOuterJoinMCenterClassDtlBySlipShapeCd(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlBySlipShapeCd;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlBySlipShapeCd()
    { if (_parameterMapMCenterClassDtlBySlipShapeCd == null) { _parameterMapMCenterClassDtlBySlipShapeCd = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlBySlipShapeCd; }
    public void xsetParameterMapMCenterClassDtlBySlipShapeCd(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlBySlipShapeCd = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlBySlipShapeCd() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "mCenterClassDtlBySlipShapeCd"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlBySlipShapeCd", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlBySlipShapeCd() { xregOutJo("mCenterClassDtlBySlipShapeCd"); }
    public boolean hasConditionQueryMCenterClassDtlBySlipShapeCd() { return xhasQueRlMap("mCenterClassDtlBySlipShapeCd"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_ITEM, named 'MCenterClassDtlByTransportTypeItem'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlByTransportTypeItem(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlByTransportTypeItem();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlByTransportTypeItem", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlByTransportTypeItem();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlByTransportTypeItem() {
        String prop = "mCenterClassDtlByTransportTypeItem";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlByTransportTypeItem()); xsetupOuterJoinMCenterClassDtlByTransportTypeItem(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlByTransportTypeItem;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlByTransportTypeItem()
    { if (_parameterMapMCenterClassDtlByTransportTypeItem == null) { _parameterMapMCenterClassDtlByTransportTypeItem = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlByTransportTypeItem; }
    public void xsetParameterMapMCenterClassDtlByTransportTypeItem(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlByTransportTypeItem = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlByTransportTypeItem() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "mCenterClassDtlByTransportTypeItem"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlByTransportTypeItem", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlByTransportTypeItem() { xregOutJo("mCenterClassDtlByTransportTypeItem"); }
    public boolean hasConditionQueryMCenterClassDtlByTransportTypeItem() { return xhasQueRlMap("mCenterClassDtlByTransportTypeItem"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_SPEED, named 'MCenterClassDtlByTransportTypeSpeed'.
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterClassDtlCQ queryMCenterClassDtlByTransportTypeSpeed(Long centerId) {
        Map<String, Object> parameterMap = xdfgetParameterMapMCenterClassDtlByTransportTypeSpeed();
        parameterMap.put("centerId", centerId);
        xassertFCDP("mCenterClassDtlByTransportTypeSpeed", parameterMap);
        return xdfgetConditionQueryMCenterClassDtlByTransportTypeSpeed();
    }
    public MCenterClassDtlCQ xdfgetConditionQueryMCenterClassDtlByTransportTypeSpeed() {
        String prop = "mCenterClassDtlByTransportTypeSpeed";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenterClassDtlByTransportTypeSpeed()); xsetupOuterJoinMCenterClassDtlByTransportTypeSpeed(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapMCenterClassDtlByTransportTypeSpeed;
    public Map<String, Object> xdfgetParameterMapMCenterClassDtlByTransportTypeSpeed()
    { if (_parameterMapMCenterClassDtlByTransportTypeSpeed == null) { _parameterMapMCenterClassDtlByTransportTypeSpeed = newLinkedHashMapSized(4); }
      return _parameterMapMCenterClassDtlByTransportTypeSpeed; }
    public void xsetParameterMapMCenterClassDtlByTransportTypeSpeed(Map<String, Object> parameterMap)
    { _parameterMapMCenterClassDtlByTransportTypeSpeed = parameterMap; } // for UnionQuery
    protected MCenterClassDtlCQ xcreateQueryMCenterClassDtlByTransportTypeSpeed() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_SGW", "mCenterClassDtlByTransportTypeSpeed"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenterClassDtlByTransportTypeSpeed", nrp);
    }
    protected void xsetupOuterJoinMCenterClassDtlByTransportTypeSpeed() { xregOutJo("mCenterClassDtlByTransportTypeSpeed"); }
    public boolean hasConditionQueryMCenterClassDtlByTransportTypeSpeed() { return xhasQueRlMap("mCenterClassDtlByTransportTypeSpeed"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("mCenterClassDtlByApiBinsyuCode".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlByApiBinsyuCode; }
        if ("mCenterClassDtlByApiDaibikiFlg".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlByApiDaibikiFlg; }
        if ("mCenterClassDtlByApiDaibikiType".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlByApiDaibikiType; }
        if ("mCenterClassDtlByApiEidomeFlg".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlByApiEidomeFlg; }
        if ("mCenterClassDtlByApiWeightCd1".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlByApiWeightCd1; }
        if ("mCenterClassDtlByApiWeightCd2".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlByApiWeightCd2; }
        if ("mCenterClassDtlBySealType1".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlBySealType1; }
        if ("mCenterClassDtlBySealType2".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlBySealType2; }
        if ("mCenterClassDtlBySealType3".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlBySealType3; }
        if ("mCenterClassDtlBySlipShapeCd".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlBySlipShapeCd; }
        if ("mCenterClassDtlByTransportTypeItem".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlByTransportTypeItem; }
        if ("mCenterClassDtlByTransportTypeSpeed".equalsIgnoreCase(property)) { return _parameterMapMCenterClassDtlByTransportTypeSpeed; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCarrierSlipSgwCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCarrierSlipSgwCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCarrierSlipSgwCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCarrierSlipSgwCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCarrierSlipSgwCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCarrierSlipSgwCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCarrierSlipSgwCQ> _myselfExistsMap;
    public Map<String, MCarrierSlipSgwCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCarrierSlipSgwCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCarrierSlipSgwCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCarrierSlipSgwCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCarrierSlipSgwCB.class.getName(); }
    protected String xCQ() { return MCarrierSlipSgwCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

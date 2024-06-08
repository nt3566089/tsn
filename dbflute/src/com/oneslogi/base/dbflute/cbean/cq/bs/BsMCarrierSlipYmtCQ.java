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
 * The base condition-query of M_CARRIER_SLIP_YMT.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCarrierSlipYmtCQ extends AbstractBsMCarrierSlipYmtCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCarrierSlipYmtCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierSlipYmtCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CARRIER_SLIP_YMT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCarrierSlipYmtCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCarrierSlipYmtCIQ xcreateCIQ() {
        MCarrierSlipYmtCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCarrierSlipYmtCIQ xnewCIQ() {
        return new MCarrierSlipYmtCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CARRIER_SLIP_YMT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCarrierSlipYmtCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCarrierSlipYmtCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _carrierSlipYmtId;
    public ConditionValue xdfgetCarrierSlipYmtId()
    { if (_carrierSlipYmtId == null) { _carrierSlipYmtId = nCV(); }
      return _carrierSlipYmtId; }
    protected ConditionValue xgetCValueCarrierSlipYmtId() { return xdfgetCarrierSlipYmtId(); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierSlipYmtId_ExistsReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierSlipYmtId_ExistsReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipYmtId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierSlipYmtId_ExistsReferrer_MDeliveryCourseList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierSlipYmtId_NotExistsReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierSlipYmtId_NotExistsReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipYmtId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierSlipYmtId_NotExistsReferrer_MDeliveryCourseList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierSlipYmtId_SpecifyDerivedReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierSlipYmtId_SpecifyDerivedReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipYmtId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierSlipYmtId_SpecifyDerivedReferrer_MDeliveryCourseList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierSlipYmtId_QueryDerivedReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierSlipYmtId_QueryDerivedReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipYmtId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierSlipYmtId_QueryDerivedReferrer_MDeliveryCourseList", sq); }
    public Map<String, Object> xdfgetCarrierSlipYmtId_QueryDerivedReferrer_MDeliveryCourseListParameter() { return xgetSQuePmMap("carrierSlipYmtId_QueryDerivedReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipYmtId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object pm) { return xkeepSQuePm("carrierSlipYmtId_QueryDerivedReferrer_MDeliveryCourseList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_CarrierSlipYmtId_Asc() { regOBA("CARRIER_SLIP_YMT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_CarrierSlipYmtId_Desc() { regOBD("CARRIER_SLIP_YMT_ID"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_TagType_Asc() { regOBA("TAG_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_TagType_Desc() { regOBD("TAG_TYPE"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_TagNm_Asc() { regOBA("TAG_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_TagNm_Desc() { regOBD("TAG_NM"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_CharacterCd_Asc() { regOBA("CHARACTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_CharacterCd_Desc() { regOBD("CHARACTER_CD"); return this; }

    protected ConditionValue _slipType;
    public ConditionValue xdfgetSlipType()
    { if (_slipType == null) { _slipType = nCV(); }
      return _slipType; }
    protected ConditionValue xgetCValueSlipType() { return xdfgetSlipType(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipType_Asc() { regOBA("SLIP_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipType_Desc() { regOBD("SLIP_TYPE"); return this; }

    protected ConditionValue _coolCls;
    public ConditionValue xdfgetCoolCls()
    { if (_coolCls == null) { _coolCls = nCV(); }
      return _coolCls; }
    protected ConditionValue xgetCValueCoolCls() { return xdfgetCoolCls(); }

    /**
     * Add order-by as ascend. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_CoolCls_Asc() { regOBA("COOL_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_CoolCls_Desc() { regOBD("COOL_CLS"); return this; }

    protected ConditionValue _honorific;
    public ConditionValue xdfgetHonorific()
    { if (_honorific == null) { _honorific = nCV(); }
      return _honorific; }
    protected ConditionValue xgetCValueHonorific() { return xdfgetHonorific(); }

    /**
     * Add order-by as ascend. <br>
     * HONORIFIC: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_Honorific_Asc() { regOBA("HONORIFIC"); return this; }

    /**
     * Add order-by as descend. <br>
     * HONORIFIC: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_Honorific_Desc() { regOBD("HONORIFIC"); return this; }

    protected ConditionValue _packingShowFlg;
    public ConditionValue xdfgetPackingShowFlg()
    { if (_packingShowFlg == null) { _packingShowFlg = nCV(); }
      return _packingShowFlg; }
    protected ConditionValue xgetCValuePackingShowFlg() { return xdfgetPackingShowFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_PackingShowFlg_Asc() { regOBA("PACKING_SHOW_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_PackingShowFlg_Desc() { regOBD("PACKING_SHOW_FLG"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_SlipClientTelNo_Asc() { regOBA("SLIP_CLIENT_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipClientTelNo_Desc() { regOBD("SLIP_CLIENT_TEL_NO"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_SlipClientZipCd_Asc() { regOBA("SLIP_CLIENT_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipClientZipCd_Desc() { regOBD("SLIP_CLIENT_ZIP_CD"); return this; }

    protected ConditionValue _slipClientAddress1;
    public ConditionValue xdfgetSlipClientAddress1()
    { if (_slipClientAddress1 == null) { _slipClientAddress1 = nCV(); }
      return _slipClientAddress1; }
    protected ConditionValue xgetCValueSlipClientAddress1() { return xdfgetSlipClientAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipClientAddress1_Asc() { regOBA("SLIP_CLIENT_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipClientAddress1_Desc() { regOBD("SLIP_CLIENT_ADDRESS1"); return this; }

    protected ConditionValue _slipClientAddress2;
    public ConditionValue xdfgetSlipClientAddress2()
    { if (_slipClientAddress2 == null) { _slipClientAddress2 = nCV(); }
      return _slipClientAddress2; }
    protected ConditionValue xgetCValueSlipClientAddress2() { return xdfgetSlipClientAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipClientAddress2_Asc() { regOBA("SLIP_CLIENT_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipClientAddress2_Desc() { regOBD("SLIP_CLIENT_ADDRESS2"); return this; }

    protected ConditionValue _slipClientAddress3;
    public ConditionValue xdfgetSlipClientAddress3()
    { if (_slipClientAddress3 == null) { _slipClientAddress3 = nCV(); }
      return _slipClientAddress3; }
    protected ConditionValue xgetCValueSlipClientAddress3() { return xdfgetSlipClientAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipClientAddress3_Asc() { regOBA("SLIP_CLIENT_ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipClientAddress3_Desc() { regOBD("SLIP_CLIENT_ADDRESS3"); return this; }

    protected ConditionValue _slipClientAddress4;
    public ConditionValue xdfgetSlipClientAddress4()
    { if (_slipClientAddress4 == null) { _slipClientAddress4 = nCV(); }
      return _slipClientAddress4; }
    protected ConditionValue xgetCValueSlipClientAddress4() { return xdfgetSlipClientAddress4(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipClientAddress4_Asc() { regOBA("SLIP_CLIENT_ADDRESS4"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipClientAddress4_Desc() { regOBD("SLIP_CLIENT_ADDRESS4"); return this; }

    protected ConditionValue _slipClientNm;
    public ConditionValue xdfgetSlipClientNm()
    { if (_slipClientNm == null) { _slipClientNm = nCV(); }
      return _slipClientNm; }
    protected ConditionValue xgetCValueSlipClientNm() { return xdfgetSlipClientNm(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipClientNm_Asc() { regOBA("SLIP_CLIENT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipClientNm_Desc() { regOBD("SLIP_CLIENT_NM"); return this; }

    protected ConditionValue _slipItemCd1;
    public ConditionValue xdfgetSlipItemCd1()
    { if (_slipItemCd1 == null) { _slipItemCd1 = nCV(); }
      return _slipItemCd1; }
    protected ConditionValue xgetCValueSlipItemCd1() { return xdfgetSlipItemCd1(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipItemCd1_Asc() { regOBA("SLIP_ITEM_CD1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipItemCd1_Desc() { regOBD("SLIP_ITEM_CD1"); return this; }

    protected ConditionValue _slipItemNm1;
    public ConditionValue xdfgetSlipItemNm1()
    { if (_slipItemNm1 == null) { _slipItemNm1 = nCV(); }
      return _slipItemNm1; }
    protected ConditionValue xgetCValueSlipItemNm1() { return xdfgetSlipItemNm1(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipItemNm1_Asc() { regOBA("SLIP_ITEM_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipItemNm1_Desc() { regOBD("SLIP_ITEM_NM1"); return this; }

    protected ConditionValue _slipItemCd2;
    public ConditionValue xdfgetSlipItemCd2()
    { if (_slipItemCd2 == null) { _slipItemCd2 = nCV(); }
      return _slipItemCd2; }
    protected ConditionValue xgetCValueSlipItemCd2() { return xdfgetSlipItemCd2(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipItemCd2_Asc() { regOBA("SLIP_ITEM_CD2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipItemCd2_Desc() { regOBD("SLIP_ITEM_CD2"); return this; }

    protected ConditionValue _slipItemNm2;
    public ConditionValue xdfgetSlipItemNm2()
    { if (_slipItemNm2 == null) { _slipItemNm2 = nCV(); }
      return _slipItemNm2; }
    protected ConditionValue xgetCValueSlipItemNm2() { return xdfgetSlipItemNm2(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipItemNm2_Asc() { regOBA("SLIP_ITEM_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SlipItemNm2_Desc() { regOBD("SLIP_ITEM_NM2"); return this; }

    protected ConditionValue _freightHandling1;
    public ConditionValue xdfgetFreightHandling1()
    { if (_freightHandling1 == null) { _freightHandling1 = nCV(); }
      return _freightHandling1; }
    protected ConditionValue xgetCValueFreightHandling1() { return xdfgetFreightHandling1(); }

    /**
     * Add order-by as ascend. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_FreightHandling1_Asc() { regOBA("FREIGHT_HANDLING1"); return this; }

    /**
     * Add order-by as descend. <br>
     * FREIGHT_HANDLING1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_FreightHandling1_Desc() { regOBD("FREIGHT_HANDLING1"); return this; }

    protected ConditionValue _freightHandling2;
    public ConditionValue xdfgetFreightHandling2()
    { if (_freightHandling2 == null) { _freightHandling2 = nCV(); }
      return _freightHandling2; }
    protected ConditionValue xgetCValueFreightHandling2() { return xdfgetFreightHandling2(); }

    /**
     * Add order-by as ascend. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_FreightHandling2_Asc() { regOBA("FREIGHT_HANDLING2"); return this; }

    /**
     * Add order-by as descend. <br>
     * FREIGHT_HANDLING2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_FreightHandling2_Desc() { regOBD("FREIGHT_HANDLING2"); return this; }

    protected ConditionValue _article;
    public ConditionValue xdfgetArticle()
    { if (_article == null) { _article = nCV(); }
      return _article; }
    protected ConditionValue xgetCValueArticle() { return xdfgetArticle(); }

    /**
     * Add order-by as ascend. <br>
     * ARTICLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_Article_Asc() { regOBA("ARTICLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARTICLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_Article_Desc() { regOBD("ARTICLE"); return this; }

    protected ConditionValue _billingCustomerCd;
    public ConditionValue xdfgetBillingCustomerCd()
    { if (_billingCustomerCd == null) { _billingCustomerCd = nCV(); }
      return _billingCustomerCd; }
    protected ConditionValue xgetCValueBillingCustomerCd() { return xdfgetBillingCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_BillingCustomerCd_Asc() { regOBA("BILLING_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILLING_CUSTOMER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_BillingCustomerCd_Desc() { regOBD("BILLING_CUSTOMER_CD"); return this; }

    protected ConditionValue _fareNo;
    public ConditionValue xdfgetFareNo()
    { if (_fareNo == null) { _fareNo = nCV(); }
      return _fareNo; }
    protected ConditionValue xgetCValueFareNo() { return xdfgetFareNo(); }

    /**
     * Add order-by as ascend. <br>
     * FARE_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_FareNo_Asc() { regOBA("FARE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FARE_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_FareNo_Desc() { regOBD("FARE_NO"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCarrierSlipYmtCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYmtCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCarrierSlipYmtCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCarrierSlipYmtCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCarrierSlipYmtCQ bq = (MCarrierSlipYmtCQ)bqs;
        MCarrierSlipYmtCQ uq = (MCarrierSlipYmtCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryBClassDtlByCharacterCd()) {
            uq.queryBClassDtlByCharacterCd().reflectRelationOnUnionQuery(bq.queryBClassDtlByCharacterCd(), uq.queryBClassDtlByCharacterCd());
        }
        if (bq.hasConditionQueryBClassDtlByCoolCls()) {
            uq.queryBClassDtlByCoolCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByCoolCls(), uq.queryBClassDtlByCoolCls());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPackingShowFlg()) {
            uq.queryBClassDtlByPackingShowFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByPackingShowFlg(), uq.queryBClassDtlByPackingShowFlg());
        }
        if (bq.hasConditionQueryBClassDtlBySlipType()) {
            uq.queryBClassDtlBySlipType().reflectRelationOnUnionQuery(bq.queryBClassDtlBySlipType(), uq.queryBClassDtlBySlipType());
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
        String nrp = xresolveNRP("M_CARRIER_SLIP_YMT", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

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
        String nrp = xresolveNRP("M_CARRIER_SLIP_YMT", "bClassDtlByCharacterCd"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCharacterCd", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCharacterCd() { xregOutJo("bClassDtlByCharacterCd"); }
    public boolean hasConditionQueryBClassDtlByCharacterCd() { return xhasQueRlMap("bClassDtlByCharacterCd"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my COOL_CLS, named 'BClassDtlByCoolCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCoolCls() {
        return xdfgetConditionQueryBClassDtlByCoolCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCoolCls() {
        String prop = "bClassDtlByCoolCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCoolCls()); xsetupOuterJoinBClassDtlByCoolCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCoolCls() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_YMT", "bClassDtlByCoolCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCoolCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCoolCls() { xregOutJo("bClassDtlByCoolCls"); }
    public boolean hasConditionQueryBClassDtlByCoolCls() { return xhasQueRlMap("bClassDtlByCoolCls"); }

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
        String nrp = xresolveNRP("M_CARRIER_SLIP_YMT", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my PACKING_SHOW_FLG, named 'BClassDtlByPackingShowFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPackingShowFlg() {
        return xdfgetConditionQueryBClassDtlByPackingShowFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPackingShowFlg() {
        String prop = "bClassDtlByPackingShowFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPackingShowFlg()); xsetupOuterJoinBClassDtlByPackingShowFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPackingShowFlg() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_YMT", "bClassDtlByPackingShowFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPackingShowFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPackingShowFlg() { xregOutJo("bClassDtlByPackingShowFlg"); }
    public boolean hasConditionQueryBClassDtlByPackingShowFlg() { return xhasQueRlMap("bClassDtlByPackingShowFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SLIP_TYPE, named 'BClassDtlBySlipType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySlipType() {
        return xdfgetConditionQueryBClassDtlBySlipType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySlipType() {
        String prop = "bClassDtlBySlipType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySlipType()); xsetupOuterJoinBClassDtlBySlipType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySlipType() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_YMT", "bClassDtlBySlipType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySlipType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySlipType() { xregOutJo("bClassDtlBySlipType"); }
    public boolean hasConditionQueryBClassDtlBySlipType() { return xhasQueRlMap("bClassDtlBySlipType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCarrierSlipYmtCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCarrierSlipYmtCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCarrierSlipYmtCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCarrierSlipYmtCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCarrierSlipYmtCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCarrierSlipYmtCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCarrierSlipYmtCQ> _myselfExistsMap;
    public Map<String, MCarrierSlipYmtCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCarrierSlipYmtCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCarrierSlipYmtCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCarrierSlipYmtCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCarrierSlipYmtCB.class.getName(); }
    protected String xCQ() { return MCarrierSlipYmtCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

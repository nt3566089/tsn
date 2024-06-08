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
 * The base condition-query of M_CARRIER_SLIP_YUPK.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCarrierSlipYupkCQ extends AbstractBsMCarrierSlipYupkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCarrierSlipYupkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierSlipYupkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CARRIER_SLIP_YUPK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCarrierSlipYupkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCarrierSlipYupkCIQ xcreateCIQ() {
        MCarrierSlipYupkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCarrierSlipYupkCIQ xnewCIQ() {
        return new MCarrierSlipYupkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CARRIER_SLIP_YUPK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCarrierSlipYupkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCarrierSlipYupkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _carrierSlipYupkId;
    public ConditionValue xdfgetCarrierSlipYupkId()
    { if (_carrierSlipYupkId == null) { _carrierSlipYupkId = nCV(); }
      return _carrierSlipYupkId; }
    protected ConditionValue xgetCValueCarrierSlipYupkId() { return xdfgetCarrierSlipYupkId(); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierSlipYupkId_ExistsReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierSlipYupkId_ExistsReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipYupkId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierSlipYupkId_ExistsReferrer_MDeliveryCourseList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierSlipYupkId_NotExistsReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierSlipYupkId_NotExistsReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipYupkId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierSlipYupkId_NotExistsReferrer_MDeliveryCourseList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierSlipYupkId_SpecifyDerivedReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierSlipYupkId_SpecifyDerivedReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipYupkId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierSlipYupkId_SpecifyDerivedReferrer_MDeliveryCourseList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCarrierSlipYupkId_QueryDerivedReferrer_MDeliveryCourseList() { return xgetSQueMap("carrierSlipYupkId_QueryDerivedReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipYupkId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("carrierSlipYupkId_QueryDerivedReferrer_MDeliveryCourseList", sq); }
    public Map<String, Object> xdfgetCarrierSlipYupkId_QueryDerivedReferrer_MDeliveryCourseListParameter() { return xgetSQuePmMap("carrierSlipYupkId_QueryDerivedReferrer_MDeliveryCourseList"); }
    public String keepCarrierSlipYupkId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object pm) { return xkeepSQuePm("carrierSlipYupkId_QueryDerivedReferrer_MDeliveryCourseList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_CarrierSlipYupkId_Asc() { regOBA("CARRIER_SLIP_YUPK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_CarrierSlipYupkId_Desc() { regOBD("CARRIER_SLIP_YUPK_ID"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_TagType_Asc() { regOBA("TAG_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_TagType_Desc() { regOBD("TAG_TYPE"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_TagNm_Asc() { regOBA("TAG_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_TagNm_Desc() { regOBD("TAG_NM"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_CharacterCd_Asc() { regOBA("CHARACTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_CharacterCd_Desc() { regOBD("CHARACTER_CD"); return this; }

    protected ConditionValue _postType;
    public ConditionValue xdfgetPostType()
    { if (_postType == null) { _postType = nCV(); }
      return _postType; }
    protected ConditionValue xgetCValuePostType() { return xdfgetPostType(); }

    /**
     * Add order-by as ascend. <br>
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_PostType_Asc() { regOBA("POST_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_PostType_Desc() { regOBD("POST_TYPE"); return this; }

    protected ConditionValue _coolType;
    public ConditionValue xdfgetCoolType()
    { if (_coolType == null) { _coolType = nCV(); }
      return _coolType; }
    protected ConditionValue xgetCValueCoolType() { return xdfgetCoolType(); }

    /**
     * Add order-by as ascend. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_CoolType_Asc() { regOBA("COOL_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_CoolType_Desc() { regOBD("COOL_TYPE"); return this; }

    protected ConditionValue _codType;
    public ConditionValue xdfgetCodType()
    { if (_codType == null) { _codType = nCV(); }
      return _codType; }
    protected ConditionValue xgetCValueCodType() { return xdfgetCodType(); }

    /**
     * Add order-by as ascend. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_CodType_Asc() { regOBA("COD_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_CodType_Desc() { regOBD("COD_TYPE"); return this; }

    protected ConditionValue _carrierType;
    public ConditionValue xdfgetCarrierType()
    { if (_carrierType == null) { _carrierType = nCV(); }
      return _carrierType; }
    protected ConditionValue xgetCValueCarrierType() { return xdfgetCarrierType(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_CarrierType_Asc() { regOBA("CARRIER_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_CarrierType_Desc() { regOBD("CARRIER_TYPE"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_SlipClientZipCd_Asc() { regOBA("SLIP_CLIENT_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipClientZipCd_Desc() { regOBD("SLIP_CLIENT_ZIP_CD"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_SlipClientAddress1_Asc() { regOBA("SLIP_CLIENT_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipClientAddress1_Desc() { regOBD("SLIP_CLIENT_ADDRESS1"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_SlipClientAddress2_Asc() { regOBA("SLIP_CLIENT_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipClientAddress2_Desc() { regOBD("SLIP_CLIENT_ADDRESS2"); return this; }

    protected ConditionValue _slipClientAddress3;
    public ConditionValue xdfgetSlipClientAddress3()
    { if (_slipClientAddress3 == null) { _slipClientAddress3 = nCV(); }
      return _slipClientAddress3; }
    protected ConditionValue xgetCValueSlipClientAddress3() { return xdfgetSlipClientAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipClientAddress3_Asc() { regOBA("SLIP_CLIENT_ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipClientAddress3_Desc() { regOBD("SLIP_CLIENT_ADDRESS3"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_SlipClientNm1_Asc() { regOBA("SLIP_CLIENT_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipClientNm1_Desc() { regOBD("SLIP_CLIENT_NM1"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_SlipClientTelNo_Asc() { regOBA("SLIP_CLIENT_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipClientTelNo_Desc() { regOBD("SLIP_CLIENT_TEL_NO"); return this; }

    protected ConditionValue _slipClientMail;
    public ConditionValue xdfgetSlipClientMail()
    { if (_slipClientMail == null) { _slipClientMail = nCV(); }
      return _slipClientMail; }
    protected ConditionValue xgetCValueSlipClientMail() { return xdfgetSlipClientMail(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipClientMail_Asc() { regOBA("SLIP_CLIENT_MAIL"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_CLIENT_MAIL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipClientMail_Desc() { regOBD("SLIP_CLIENT_MAIL"); return this; }

    protected ConditionValue _noUpsideDownCls;
    public ConditionValue xdfgetNoUpsideDownCls()
    { if (_noUpsideDownCls == null) { _noUpsideDownCls = nCV(); }
      return _noUpsideDownCls; }
    protected ConditionValue xgetCValueNoUpsideDownCls() { return xdfgetNoUpsideDownCls(); }

    /**
     * Add order-by as ascend. <br>
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_NoUpsideDownCls_Asc() { regOBA("NO_UPSIDE_DOWN_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_NoUpsideDownCls_Desc() { regOBD("NO_UPSIDE_DOWN_CLS"); return this; }

    protected ConditionValue _noStockCls;
    public ConditionValue xdfgetNoStockCls()
    { if (_noStockCls == null) { _noStockCls = nCV(); }
      return _noStockCls; }
    protected ConditionValue xgetCValueNoStockCls() { return xdfgetNoStockCls(); }

    /**
     * Add order-by as ascend. <br>
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_NoStockCls_Asc() { regOBA("NO_STOCK_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_NoStockCls_Desc() { regOBD("NO_STOCK_CLS"); return this; }

    protected ConditionValue _slipProductSizeCls;
    public ConditionValue xdfgetSlipProductSizeCls()
    { if (_slipProductSizeCls == null) { _slipProductSizeCls = nCV(); }
      return _slipProductSizeCls; }
    protected ConditionValue xgetCValueSlipProductSizeCls() { return xdfgetSlipProductSizeCls(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipProductSizeCls_Asc() { regOBA("SLIP_PRODUCT_SIZE_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipProductSizeCls_Desc() { regOBD("SLIP_PRODUCT_SIZE_CLS"); return this; }

    protected ConditionValue _slipProductNo;
    public ConditionValue xdfgetSlipProductNo()
    { if (_slipProductNo == null) { _slipProductNo = nCV(); }
      return _slipProductNo; }
    protected ConditionValue xgetCValueSlipProductNo() { return xdfgetSlipProductNo(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipProductNo_Asc() { regOBA("SLIP_PRODUCT_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_PRODUCT_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipProductNo_Desc() { regOBD("SLIP_PRODUCT_NO"); return this; }

    protected ConditionValue _slipItemNm;
    public ConditionValue xdfgetSlipItemNm()
    { if (_slipItemNm == null) { _slipItemNm = nCV(); }
      return _slipItemNm; }
    protected ConditionValue xgetCValueSlipItemNm() { return xdfgetSlipItemNm(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipItemNm_Asc() { regOBA("SLIP_ITEM_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SlipItemNm_Desc() { regOBD("SLIP_ITEM_NM"); return this; }

    protected ConditionValue _shipReserveDataMark;
    public ConditionValue xdfgetShipReserveDataMark()
    { if (_shipReserveDataMark == null) { _shipReserveDataMark = nCV(); }
      return _shipReserveDataMark; }
    protected ConditionValue xgetCValueShipReserveDataMark() { return xdfgetShipReserveDataMark(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_ShipReserveDataMark_Asc() { regOBA("SHIP_RESERVE_DATA_MARK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_ShipReserveDataMark_Desc() { regOBD("SHIP_RESERVE_DATA_MARK"); return this; }

    protected ConditionValue _deliCertPreYears;
    public ConditionValue xdfgetDeliCertPreYears()
    { if (_deliCertPreYears == null) { _deliCertPreYears = nCV(); }
      return _deliCertPreYears; }
    protected ConditionValue xgetCValueDeliCertPreYears() { return xdfgetDeliCertPreYears(); }

    /**
     * Add order-by as ascend. <br>
     * DELI_CERT_PRE_YEARS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_DeliCertPreYears_Asc() { regOBA("DELI_CERT_PRE_YEARS"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELI_CERT_PRE_YEARS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_DeliCertPreYears_Desc() { regOBD("DELI_CERT_PRE_YEARS"); return this; }

    protected ConditionValue _sendNm;
    public ConditionValue xdfgetSendNm()
    { if (_sendNm == null) { _sendNm = nCV(); }
      return _sendNm; }
    protected ConditionValue xgetCValueSendNm() { return xdfgetSendNm(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SendNm_Asc() { regOBA("SEND_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_SendNm_Desc() { regOBD("SEND_NM"); return this; }

    protected ConditionValue _productTypeCode;
    public ConditionValue xdfgetProductTypeCode()
    { if (_productTypeCode == null) { _productTypeCode = nCV(); }
      return _productTypeCode; }
    protected ConditionValue xgetCValueProductTypeCode() { return xdfgetProductTypeCode(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_ProductTypeCode_Asc() { regOBA("PRODUCT_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_TYPE_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_ProductTypeCode_Desc() { regOBD("PRODUCT_TYPE_CODE"); return this; }

    protected ConditionValue _postBizCardCustomerNo;
    public ConditionValue xdfgetPostBizCardCustomerNo()
    { if (_postBizCardCustomerNo == null) { _postBizCardCustomerNo = nCV(); }
      return _postBizCardCustomerNo; }
    protected ConditionValue xgetCValuePostBizCardCustomerNo() { return xdfgetPostBizCardCustomerNo(); }

    /**
     * Add order-by as ascend. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_PostBizCardCustomerNo_Asc() { regOBA("POST_BIZ_CARD_CUSTOMER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_PostBizCardCustomerNo_Desc() { regOBD("POST_BIZ_CARD_CUSTOMER_NO"); return this; }

    protected ConditionValue _shippingCompanyCode;
    public ConditionValue xdfgetShippingCompanyCode()
    { if (_shippingCompanyCode == null) { _shippingCompanyCode = nCV(); }
      return _shippingCompanyCode; }
    protected ConditionValue xgetCValueShippingCompanyCode() { return xdfgetShippingCompanyCode(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_ShippingCompanyCode_Asc() { regOBA("SHIPPING_COMPANY_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_ShippingCompanyCode_Desc() { regOBD("SHIPPING_COMPANY_CODE"); return this; }

    protected ConditionValue _shipmentCode;
    public ConditionValue xdfgetShipmentCode()
    { if (_shipmentCode == null) { _shipmentCode = nCV(); }
      return _shipmentCode; }
    protected ConditionValue xgetCValueShipmentCode() { return xdfgetShipmentCode(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPMENT_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_ShipmentCode_Asc() { regOBA("SHIPMENT_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPMENT_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_ShipmentCode_Desc() { regOBD("SHIPMENT_CODE"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCarrierSlipYupkCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCarrierSlipYupkCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCarrierSlipYupkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCarrierSlipYupkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCarrierSlipYupkCQ bq = (MCarrierSlipYupkCQ)bqs;
        MCarrierSlipYupkCQ uq = (MCarrierSlipYupkCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryBClassDtlByCharacterCd()) {
            uq.queryBClassDtlByCharacterCd().reflectRelationOnUnionQuery(bq.queryBClassDtlByCharacterCd(), uq.queryBClassDtlByCharacterCd());
        }
        if (bq.hasConditionQueryBClassDtlByCodType()) {
            uq.queryBClassDtlByCodType().reflectRelationOnUnionQuery(bq.queryBClassDtlByCodType(), uq.queryBClassDtlByCodType());
        }
        if (bq.hasConditionQueryBClassDtlByCoolType()) {
            uq.queryBClassDtlByCoolType().reflectRelationOnUnionQuery(bq.queryBClassDtlByCoolType(), uq.queryBClassDtlByCoolType());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
        if (bq.hasConditionQueryBClassDtlByNoStockCls()) {
            uq.queryBClassDtlByNoStockCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByNoStockCls(), uq.queryBClassDtlByNoStockCls());
        }
        if (bq.hasConditionQueryBClassDtlByNoUpsideDownCls()) {
            uq.queryBClassDtlByNoUpsideDownCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByNoUpsideDownCls(), uq.queryBClassDtlByNoUpsideDownCls());
        }
        if (bq.hasConditionQueryBClassDtlByPostType()) {
            uq.queryBClassDtlByPostType().reflectRelationOnUnionQuery(bq.queryBClassDtlByPostType(), uq.queryBClassDtlByPostType());
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
        String nrp = xresolveNRP("M_CARRIER_SLIP_YUPK", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("M_CARRIER_SLIP_YUPK", "bClassDtlByCharacterCd"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCharacterCd", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCharacterCd() { xregOutJo("bClassDtlByCharacterCd"); }
    public boolean hasConditionQueryBClassDtlByCharacterCd() { return xhasQueRlMap("bClassDtlByCharacterCd"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my COD_TYPE, named 'BClassDtlByCodType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCodType() {
        return xdfgetConditionQueryBClassDtlByCodType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCodType() {
        String prop = "bClassDtlByCodType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCodType()); xsetupOuterJoinBClassDtlByCodType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCodType() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_YUPK", "bClassDtlByCodType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCodType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCodType() { xregOutJo("bClassDtlByCodType"); }
    public boolean hasConditionQueryBClassDtlByCodType() { return xhasQueRlMap("bClassDtlByCodType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my COOL_TYPE, named 'BClassDtlByCoolType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCoolType() {
        return xdfgetConditionQueryBClassDtlByCoolType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCoolType() {
        String prop = "bClassDtlByCoolType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCoolType()); xsetupOuterJoinBClassDtlByCoolType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCoolType() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_YUPK", "bClassDtlByCoolType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCoolType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCoolType() { xregOutJo("bClassDtlByCoolType"); }
    public boolean hasConditionQueryBClassDtlByCoolType() { return xhasQueRlMap("bClassDtlByCoolType"); }

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
        String nrp = xresolveNRP("M_CARRIER_SLIP_YUPK", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my NO_STOCK_CLS, named 'BClassDtlByNoStockCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByNoStockCls() {
        return xdfgetConditionQueryBClassDtlByNoStockCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByNoStockCls() {
        String prop = "bClassDtlByNoStockCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByNoStockCls()); xsetupOuterJoinBClassDtlByNoStockCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByNoStockCls() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_YUPK", "bClassDtlByNoStockCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByNoStockCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByNoStockCls() { xregOutJo("bClassDtlByNoStockCls"); }
    public boolean hasConditionQueryBClassDtlByNoStockCls() { return xhasQueRlMap("bClassDtlByNoStockCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my NO_UPSIDE_DOWN_CLS, named 'BClassDtlByNoUpsideDownCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByNoUpsideDownCls() {
        return xdfgetConditionQueryBClassDtlByNoUpsideDownCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByNoUpsideDownCls() {
        String prop = "bClassDtlByNoUpsideDownCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByNoUpsideDownCls()); xsetupOuterJoinBClassDtlByNoUpsideDownCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByNoUpsideDownCls() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_YUPK", "bClassDtlByNoUpsideDownCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByNoUpsideDownCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByNoUpsideDownCls() { xregOutJo("bClassDtlByNoUpsideDownCls"); }
    public boolean hasConditionQueryBClassDtlByNoUpsideDownCls() { return xhasQueRlMap("bClassDtlByNoUpsideDownCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my POST_TYPE, named 'BClassDtlByPostType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPostType() {
        return xdfgetConditionQueryBClassDtlByPostType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPostType() {
        String prop = "bClassDtlByPostType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPostType()); xsetupOuterJoinBClassDtlByPostType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPostType() {
        String nrp = xresolveNRP("M_CARRIER_SLIP_YUPK", "bClassDtlByPostType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPostType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPostType() { xregOutJo("bClassDtlByPostType"); }
    public boolean hasConditionQueryBClassDtlByPostType() { return xhasQueRlMap("bClassDtlByPostType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCarrierSlipYupkCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCarrierSlipYupkCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCarrierSlipYupkCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCarrierSlipYupkCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCarrierSlipYupkCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCarrierSlipYupkCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCarrierSlipYupkCQ> _myselfExistsMap;
    public Map<String, MCarrierSlipYupkCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCarrierSlipYupkCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCarrierSlipYupkCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCarrierSlipYupkCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCarrierSlipYupkCB.class.getName(); }
    protected String xCQ() { return MCarrierSlipYupkCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

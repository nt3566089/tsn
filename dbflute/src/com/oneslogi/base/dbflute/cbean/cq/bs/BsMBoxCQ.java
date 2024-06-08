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
 * The base condition-query of M_BOX.
 * @author DBFlute(AutoGenerator)
 */
public class BsMBoxCQ extends AbstractBsMBoxCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MBoxCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMBoxCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_BOX) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MBoxCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MBoxCIQ xcreateCIQ() {
        MBoxCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MBoxCIQ xnewCIQ() {
        return new MBoxCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_BOX on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MBoxCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MBoxCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _boxId;
    public ConditionValue xdfgetBoxId()
    { if (_boxId == null) { _boxId = nCV(); }
      return _boxId; }
    protected ConditionValue xgetCValueBoxId() { return xdfgetBoxId(); }

    public Map<String, MBoxGrpCQ> xdfgetBoxId_ExistsReferrer_MBoxGrpList() { return xgetSQueMap("boxId_ExistsReferrer_MBoxGrpList"); }
    public String keepBoxId_ExistsReferrer_MBoxGrpList(MBoxGrpCQ sq) { return xkeepSQue("boxId_ExistsReferrer_MBoxGrpList", sq); }

    public Map<String, MBoxGrpDtlCQ> xdfgetBoxId_ExistsReferrer_MBoxGrpDtlList() { return xgetSQueMap("boxId_ExistsReferrer_MBoxGrpDtlList"); }
    public String keepBoxId_ExistsReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq) { return xkeepSQue("boxId_ExistsReferrer_MBoxGrpDtlList", sq); }

    public Map<String, MCarrierBoxCQ> xdfgetBoxId_ExistsReferrer_MCarrierBoxList() { return xgetSQueMap("boxId_ExistsReferrer_MCarrierBoxList"); }
    public String keepBoxId_ExistsReferrer_MCarrierBoxList(MCarrierBoxCQ sq) { return xkeepSQue("boxId_ExistsReferrer_MCarrierBoxList", sq); }

    public Map<String, MParamCQ> xdfgetBoxId_ExistsReferrer_MParamList() { return xgetSQueMap("boxId_ExistsReferrer_MParamList"); }
    public String keepBoxId_ExistsReferrer_MParamList(MParamCQ sq) { return xkeepSQue("boxId_ExistsReferrer_MParamList", sq); }

    public Map<String, TPackingHCQ> xdfgetBoxId_ExistsReferrer_TPackingHList() { return xgetSQueMap("boxId_ExistsReferrer_TPackingHList"); }
    public String keepBoxId_ExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("boxId_ExistsReferrer_TPackingHList", sq); }

    public Map<String, WHtShippingCQ> xdfgetBoxId_ExistsReferrer_WHtShippingList() { return xgetSQueMap("boxId_ExistsReferrer_WHtShippingList"); }
    public String keepBoxId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("boxId_ExistsReferrer_WHtShippingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetBoxId_ExistsReferrer_WSglRowShipInspHList() { return xgetSQueMap("boxId_ExistsReferrer_WSglRowShipInspHList"); }
    public String keepBoxId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("boxId_ExistsReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetBoxId_ExistsReferrer_WShippingInterruptList() { return xgetSQueMap("boxId_ExistsReferrer_WShippingInterruptList"); }
    public String keepBoxId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("boxId_ExistsReferrer_WShippingInterruptList", sq); }

    public Map<String, MBoxGrpCQ> xdfgetBoxId_NotExistsReferrer_MBoxGrpList() { return xgetSQueMap("boxId_NotExistsReferrer_MBoxGrpList"); }
    public String keepBoxId_NotExistsReferrer_MBoxGrpList(MBoxGrpCQ sq) { return xkeepSQue("boxId_NotExistsReferrer_MBoxGrpList", sq); }

    public Map<String, MBoxGrpDtlCQ> xdfgetBoxId_NotExistsReferrer_MBoxGrpDtlList() { return xgetSQueMap("boxId_NotExistsReferrer_MBoxGrpDtlList"); }
    public String keepBoxId_NotExistsReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq) { return xkeepSQue("boxId_NotExistsReferrer_MBoxGrpDtlList", sq); }

    public Map<String, MCarrierBoxCQ> xdfgetBoxId_NotExistsReferrer_MCarrierBoxList() { return xgetSQueMap("boxId_NotExistsReferrer_MCarrierBoxList"); }
    public String keepBoxId_NotExistsReferrer_MCarrierBoxList(MCarrierBoxCQ sq) { return xkeepSQue("boxId_NotExistsReferrer_MCarrierBoxList", sq); }

    public Map<String, MParamCQ> xdfgetBoxId_NotExistsReferrer_MParamList() { return xgetSQueMap("boxId_NotExistsReferrer_MParamList"); }
    public String keepBoxId_NotExistsReferrer_MParamList(MParamCQ sq) { return xkeepSQue("boxId_NotExistsReferrer_MParamList", sq); }

    public Map<String, TPackingHCQ> xdfgetBoxId_NotExistsReferrer_TPackingHList() { return xgetSQueMap("boxId_NotExistsReferrer_TPackingHList"); }
    public String keepBoxId_NotExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("boxId_NotExistsReferrer_TPackingHList", sq); }

    public Map<String, WHtShippingCQ> xdfgetBoxId_NotExistsReferrer_WHtShippingList() { return xgetSQueMap("boxId_NotExistsReferrer_WHtShippingList"); }
    public String keepBoxId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("boxId_NotExistsReferrer_WHtShippingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetBoxId_NotExistsReferrer_WSglRowShipInspHList() { return xgetSQueMap("boxId_NotExistsReferrer_WSglRowShipInspHList"); }
    public String keepBoxId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("boxId_NotExistsReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetBoxId_NotExistsReferrer_WShippingInterruptList() { return xgetSQueMap("boxId_NotExistsReferrer_WShippingInterruptList"); }
    public String keepBoxId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("boxId_NotExistsReferrer_WShippingInterruptList", sq); }

    public Map<String, MBoxGrpCQ> xdfgetBoxId_SpecifyDerivedReferrer_MBoxGrpList() { return xgetSQueMap("boxId_SpecifyDerivedReferrer_MBoxGrpList"); }
    public String keepBoxId_SpecifyDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq) { return xkeepSQue("boxId_SpecifyDerivedReferrer_MBoxGrpList", sq); }

    public Map<String, MBoxGrpDtlCQ> xdfgetBoxId_SpecifyDerivedReferrer_MBoxGrpDtlList() { return xgetSQueMap("boxId_SpecifyDerivedReferrer_MBoxGrpDtlList"); }
    public String keepBoxId_SpecifyDerivedReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq) { return xkeepSQue("boxId_SpecifyDerivedReferrer_MBoxGrpDtlList", sq); }

    public Map<String, MCarrierBoxCQ> xdfgetBoxId_SpecifyDerivedReferrer_MCarrierBoxList() { return xgetSQueMap("boxId_SpecifyDerivedReferrer_MCarrierBoxList"); }
    public String keepBoxId_SpecifyDerivedReferrer_MCarrierBoxList(MCarrierBoxCQ sq) { return xkeepSQue("boxId_SpecifyDerivedReferrer_MCarrierBoxList", sq); }

    public Map<String, MParamCQ> xdfgetBoxId_SpecifyDerivedReferrer_MParamList() { return xgetSQueMap("boxId_SpecifyDerivedReferrer_MParamList"); }
    public String keepBoxId_SpecifyDerivedReferrer_MParamList(MParamCQ sq) { return xkeepSQue("boxId_SpecifyDerivedReferrer_MParamList", sq); }

    public Map<String, TPackingHCQ> xdfgetBoxId_SpecifyDerivedReferrer_TPackingHList() { return xgetSQueMap("boxId_SpecifyDerivedReferrer_TPackingHList"); }
    public String keepBoxId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("boxId_SpecifyDerivedReferrer_TPackingHList", sq); }

    public Map<String, WHtShippingCQ> xdfgetBoxId_SpecifyDerivedReferrer_WHtShippingList() { return xgetSQueMap("boxId_SpecifyDerivedReferrer_WHtShippingList"); }
    public String keepBoxId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("boxId_SpecifyDerivedReferrer_WHtShippingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetBoxId_SpecifyDerivedReferrer_WSglRowShipInspHList() { return xgetSQueMap("boxId_SpecifyDerivedReferrer_WSglRowShipInspHList"); }
    public String keepBoxId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("boxId_SpecifyDerivedReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetBoxId_SpecifyDerivedReferrer_WShippingInterruptList() { return xgetSQueMap("boxId_SpecifyDerivedReferrer_WShippingInterruptList"); }
    public String keepBoxId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("boxId_SpecifyDerivedReferrer_WShippingInterruptList", sq); }

    public Map<String, MBoxGrpCQ> xdfgetBoxId_QueryDerivedReferrer_MBoxGrpList() { return xgetSQueMap("boxId_QueryDerivedReferrer_MBoxGrpList"); }
    public String keepBoxId_QueryDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq) { return xkeepSQue("boxId_QueryDerivedReferrer_MBoxGrpList", sq); }
    public Map<String, Object> xdfgetBoxId_QueryDerivedReferrer_MBoxGrpListParameter() { return xgetSQuePmMap("boxId_QueryDerivedReferrer_MBoxGrpList"); }
    public String keepBoxId_QueryDerivedReferrer_MBoxGrpListParameter(Object pm) { return xkeepSQuePm("boxId_QueryDerivedReferrer_MBoxGrpList", pm); }

    public Map<String, MBoxGrpDtlCQ> xdfgetBoxId_QueryDerivedReferrer_MBoxGrpDtlList() { return xgetSQueMap("boxId_QueryDerivedReferrer_MBoxGrpDtlList"); }
    public String keepBoxId_QueryDerivedReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq) { return xkeepSQue("boxId_QueryDerivedReferrer_MBoxGrpDtlList", sq); }
    public Map<String, Object> xdfgetBoxId_QueryDerivedReferrer_MBoxGrpDtlListParameter() { return xgetSQuePmMap("boxId_QueryDerivedReferrer_MBoxGrpDtlList"); }
    public String keepBoxId_QueryDerivedReferrer_MBoxGrpDtlListParameter(Object pm) { return xkeepSQuePm("boxId_QueryDerivedReferrer_MBoxGrpDtlList", pm); }

    public Map<String, MCarrierBoxCQ> xdfgetBoxId_QueryDerivedReferrer_MCarrierBoxList() { return xgetSQueMap("boxId_QueryDerivedReferrer_MCarrierBoxList"); }
    public String keepBoxId_QueryDerivedReferrer_MCarrierBoxList(MCarrierBoxCQ sq) { return xkeepSQue("boxId_QueryDerivedReferrer_MCarrierBoxList", sq); }
    public Map<String, Object> xdfgetBoxId_QueryDerivedReferrer_MCarrierBoxListParameter() { return xgetSQuePmMap("boxId_QueryDerivedReferrer_MCarrierBoxList"); }
    public String keepBoxId_QueryDerivedReferrer_MCarrierBoxListParameter(Object pm) { return xkeepSQuePm("boxId_QueryDerivedReferrer_MCarrierBoxList", pm); }

    public Map<String, MParamCQ> xdfgetBoxId_QueryDerivedReferrer_MParamList() { return xgetSQueMap("boxId_QueryDerivedReferrer_MParamList"); }
    public String keepBoxId_QueryDerivedReferrer_MParamList(MParamCQ sq) { return xkeepSQue("boxId_QueryDerivedReferrer_MParamList", sq); }
    public Map<String, Object> xdfgetBoxId_QueryDerivedReferrer_MParamListParameter() { return xgetSQuePmMap("boxId_QueryDerivedReferrer_MParamList"); }
    public String keepBoxId_QueryDerivedReferrer_MParamListParameter(Object pm) { return xkeepSQuePm("boxId_QueryDerivedReferrer_MParamList", pm); }

    public Map<String, TPackingHCQ> xdfgetBoxId_QueryDerivedReferrer_TPackingHList() { return xgetSQueMap("boxId_QueryDerivedReferrer_TPackingHList"); }
    public String keepBoxId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("boxId_QueryDerivedReferrer_TPackingHList", sq); }
    public Map<String, Object> xdfgetBoxId_QueryDerivedReferrer_TPackingHListParameter() { return xgetSQuePmMap("boxId_QueryDerivedReferrer_TPackingHList"); }
    public String keepBoxId_QueryDerivedReferrer_TPackingHListParameter(Object pm) { return xkeepSQuePm("boxId_QueryDerivedReferrer_TPackingHList", pm); }

    public Map<String, WHtShippingCQ> xdfgetBoxId_QueryDerivedReferrer_WHtShippingList() { return xgetSQueMap("boxId_QueryDerivedReferrer_WHtShippingList"); }
    public String keepBoxId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("boxId_QueryDerivedReferrer_WHtShippingList", sq); }
    public Map<String, Object> xdfgetBoxId_QueryDerivedReferrer_WHtShippingListParameter() { return xgetSQuePmMap("boxId_QueryDerivedReferrer_WHtShippingList"); }
    public String keepBoxId_QueryDerivedReferrer_WHtShippingListParameter(Object pm) { return xkeepSQuePm("boxId_QueryDerivedReferrer_WHtShippingList", pm); }

    public Map<String, WSglRowShipInspHCQ> xdfgetBoxId_QueryDerivedReferrer_WSglRowShipInspHList() { return xgetSQueMap("boxId_QueryDerivedReferrer_WSglRowShipInspHList"); }
    public String keepBoxId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("boxId_QueryDerivedReferrer_WSglRowShipInspHList", sq); }
    public Map<String, Object> xdfgetBoxId_QueryDerivedReferrer_WSglRowShipInspHListParameter() { return xgetSQuePmMap("boxId_QueryDerivedReferrer_WSglRowShipInspHList"); }
    public String keepBoxId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object pm) { return xkeepSQuePm("boxId_QueryDerivedReferrer_WSglRowShipInspHList", pm); }

    public Map<String, WShippingInterruptCQ> xdfgetBoxId_QueryDerivedReferrer_WShippingInterruptList() { return xgetSQueMap("boxId_QueryDerivedReferrer_WShippingInterruptList"); }
    public String keepBoxId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("boxId_QueryDerivedReferrer_WShippingInterruptList", sq); }
    public Map<String, Object> xdfgetBoxId_QueryDerivedReferrer_WShippingInterruptListParameter() { return xgetSQuePmMap("boxId_QueryDerivedReferrer_WShippingInterruptList"); }
    public String keepBoxId_QueryDerivedReferrer_WShippingInterruptListParameter(Object pm) { return xkeepSQuePm("boxId_QueryDerivedReferrer_WShippingInterruptList", pm); }

    /**
     * Add order-by as ascend. <br>
     * BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_BoxId_Asc() { regOBA("BOX_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_BoxId_Desc() { regOBD("BOX_ID"); return this; }

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
    public BsMBoxCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _boxCd;
    public ConditionValue xdfgetBoxCd()
    { if (_boxCd == null) { _boxCd = nCV(); }
      return _boxCd; }
    protected ConditionValue xgetCValueBoxCd() { return xdfgetBoxCd(); }

    /**
     * Add order-by as ascend. <br>
     * BOX_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_BoxCd_Asc() { regOBA("BOX_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_BoxCd_Desc() { regOBD("BOX_CD"); return this; }

    protected ConditionValue _boxNm;
    public ConditionValue xdfgetBoxNm()
    { if (_boxNm == null) { _boxNm = nCV(); }
      return _boxNm; }
    protected ConditionValue xgetCValueBoxNm() { return xdfgetBoxNm(); }

    /**
     * Add order-by as ascend. <br>
     * BOX_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_BoxNm_Asc() { regOBA("BOX_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_BoxNm_Desc() { regOBD("BOX_NM"); return this; }

    protected ConditionValue _length;
    public ConditionValue xdfgetLength()
    { if (_length == null) { _length = nCV(); }
      return _length; }
    protected ConditionValue xgetCValueLength() { return xdfgetLength(); }

    /**
     * Add order-by as ascend. <br>
     * LENGTH: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Length_Asc() { regOBA("LENGTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * LENGTH: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Length_Desc() { regOBD("LENGTH"); return this; }

    protected ConditionValue _width;
    public ConditionValue xdfgetWidth()
    { if (_width == null) { _width = nCV(); }
      return _width; }
    protected ConditionValue xgetCValueWidth() { return xdfgetWidth(); }

    /**
     * Add order-by as ascend. <br>
     * WIDTH: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Width_Asc() { regOBA("WIDTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * WIDTH: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Width_Desc() { regOBD("WIDTH"); return this; }

    protected ConditionValue _height;
    public ConditionValue xdfgetHeight()
    { if (_height == null) { _height = nCV(); }
      return _height; }
    protected ConditionValue xgetCValueHeight() { return xdfgetHeight(); }

    /**
     * Add order-by as ascend. <br>
     * HEIGHT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Height_Asc() { regOBA("HEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEIGHT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Height_Desc() { regOBD("HEIGHT"); return this; }

    protected ConditionValue _volume;
    public ConditionValue xdfgetVolume()
    { if (_volume == null) { _volume = nCV(); }
      return _volume; }
    protected ConditionValue xgetCValueVolume() { return xdfgetVolume(); }

    /**
     * Add order-by as ascend. <br>
     * VOLUME: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Volume_Asc() { regOBA("VOLUME"); return this; }

    /**
     * Add order-by as descend. <br>
     * VOLUME: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Volume_Desc() { regOBD("VOLUME"); return this; }

    protected ConditionValue _volumeRate;
    public ConditionValue xdfgetVolumeRate()
    { if (_volumeRate == null) { _volumeRate = nCV(); }
      return _volumeRate; }
    protected ConditionValue xgetCValueVolumeRate() { return xdfgetVolumeRate(); }

    /**
     * Add order-by as ascend. <br>
     * VOLUME_RATE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_VolumeRate_Asc() { regOBA("VOLUME_RATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VOLUME_RATE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_VolumeRate_Desc() { regOBD("VOLUME_RATE"); return this; }

    protected ConditionValue _permitVolume;
    public ConditionValue xdfgetPermitVolume()
    { if (_permitVolume == null) { _permitVolume = nCV(); }
      return _permitVolume; }
    protected ConditionValue xgetCValuePermitVolume() { return xdfgetPermitVolume(); }

    /**
     * Add order-by as ascend. <br>
     * PERMIT_VOLUME: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_PermitVolume_Asc() { regOBA("PERMIT_VOLUME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PERMIT_VOLUME: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_PermitVolume_Desc() { regOBD("PERMIT_VOLUME"); return this; }

    protected ConditionValue _permitWeight;
    public ConditionValue xdfgetPermitWeight()
    { if (_permitWeight == null) { _permitWeight = nCV(); }
      return _permitWeight; }
    protected ConditionValue xgetCValuePermitWeight() { return xdfgetPermitWeight(); }

    /**
     * Add order-by as ascend. <br>
     * PERMIT_WEIGHT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_PermitWeight_Asc() { regOBA("PERMIT_WEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PERMIT_WEIGHT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_PermitWeight_Desc() { regOBD("PERMIT_WEIGHT"); return this; }

    protected ConditionValue _boxType;
    public ConditionValue xdfgetBoxType()
    { if (_boxType == null) { _boxType = nCV(); }
      return _boxType; }
    protected ConditionValue xgetCValueBoxType() { return xdfgetBoxType(); }

    /**
     * Add order-by as ascend. <br>
     * BOX_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_BoxType_Asc() { regOBA("BOX_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOX_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_BoxType_Desc() { regOBD("BOX_TYPE"); return this; }

    protected ConditionValue _bxoszl;
    public ConditionValue xdfgetBxoszl()
    { if (_bxoszl == null) { _bxoszl = nCV(); }
      return _bxoszl; }
    protected ConditionValue xgetCValueBxoszl() { return xdfgetBxoszl(); }

    /**
     * Add order-by as ascend. <br>
     * BXOSZL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Bxoszl_Asc() { regOBA("BXOSZL"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXOSZL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Bxoszl_Desc() { regOBD("BXOSZL"); return this; }

    protected ConditionValue _bxoszw;
    public ConditionValue xdfgetBxoszw()
    { if (_bxoszw == null) { _bxoszw = nCV(); }
      return _bxoszw; }
    protected ConditionValue xgetCValueBxoszw() { return xdfgetBxoszw(); }

    /**
     * Add order-by as ascend. <br>
     * BXOSZW: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Bxoszw_Asc() { regOBA("BXOSZW"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXOSZW: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Bxoszw_Desc() { regOBD("BXOSZW"); return this; }

    protected ConditionValue _bxoszh;
    public ConditionValue xdfgetBxoszh()
    { if (_bxoszh == null) { _bxoszh = nCV(); }
      return _bxoszh; }
    protected ConditionValue xgetCValueBxoszh() { return xdfgetBxoszh(); }

    /**
     * Add order-by as ascend. <br>
     * BXOSZH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Bxoszh_Asc() { regOBA("BXOSZH"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXOSZH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Bxoszh_Desc() { regOBD("BXOSZH"); return this; }

    protected ConditionValue _bxweight;
    public ConditionValue xdfgetBxweight()
    { if (_bxweight == null) { _bxweight = nCV(); }
      return _bxweight; }
    protected ConditionValue xgetCValueBxweight() { return xdfgetBxweight(); }

    /**
     * Add order-by as ascend. <br>
     * BXWEIGHT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Bxweight_Asc() { regOBA("BXWEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXWEIGHT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Bxweight_Desc() { regOBD("BXWEIGHT"); return this; }

    protected ConditionValue _bxcpy;
    public ConditionValue xdfgetBxcpy()
    { if (_bxcpy == null) { _bxcpy = nCV(); }
      return _bxcpy; }
    protected ConditionValue xgetCValueBxcpy() { return xdfgetBxcpy(); }

    /**
     * Add order-by as ascend. <br>
     * bxcpy: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Bxcpy_Asc() { regOBA("bxcpy"); return this; }

    /**
     * Add order-by as descend. <br>
     * bxcpy: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_Bxcpy_Desc() { regOBD("bxcpy"); return this; }

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
    public BsMBoxCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMBoxCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMBoxCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMBoxCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMBoxCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMBoxCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMBoxCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMBoxCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMBoxCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMBoxCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMBoxCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMBoxCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MBoxCQ bq = (MBoxCQ)bqs;
        MBoxCQ uq = (MBoxCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
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
        String nrp = xresolveNRP("M_BOX", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

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
        String nrp = xresolveNRP("M_BOX", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MBoxCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MBoxCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MBoxCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MBoxCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MBoxCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MBoxCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MBoxCQ> _myselfExistsMap;
    public Map<String, MBoxCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MBoxCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MBoxCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MBoxCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MBoxCB.class.getName(); }
    protected String xCQ() { return MBoxCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

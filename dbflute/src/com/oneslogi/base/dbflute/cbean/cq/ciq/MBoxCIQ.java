package com.oneslogi.base.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.bs.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of M_BOX.
 * @author DBFlute(AutoGenerator)
 */
public class MBoxCIQ extends AbstractBsMBoxCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMBoxCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MBoxCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMBoxCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueBoxId() { return _myCQ.xdfgetBoxId(); }
    public String keepBoxId_ExistsReferrer_MBoxGrpList(MBoxGrpCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBoxId_ExistsReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBoxId_ExistsReferrer_MCarrierBoxList(MCarrierBoxCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBoxId_ExistsReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBoxId_ExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBoxId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBoxId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBoxId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBoxId_NotExistsReferrer_MBoxGrpList(MBoxGrpCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBoxId_NotExistsReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBoxId_NotExistsReferrer_MCarrierBoxList(MCarrierBoxCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBoxId_NotExistsReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBoxId_NotExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBoxId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBoxId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBoxId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBoxId_SpecifyDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBoxId_SpecifyDerivedReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBoxId_SpecifyDerivedReferrer_MCarrierBoxList(MCarrierBoxCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBoxId_SpecifyDerivedReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBoxId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBoxId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBoxId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBoxId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_MBoxGrpListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_MBoxGrpDtlListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_MCarrierBoxList(MCarrierBoxCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_MCarrierBoxListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_MParamListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_TPackingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_WHtShippingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxId_QueryDerivedReferrer_WShippingInterruptListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueBoxCd() { return _myCQ.xdfgetBoxCd(); }
    protected ConditionValue xgetCValueBoxNm() { return _myCQ.xdfgetBoxNm(); }
    protected ConditionValue xgetCValueLength() { return _myCQ.xdfgetLength(); }
    protected ConditionValue xgetCValueWidth() { return _myCQ.xdfgetWidth(); }
    protected ConditionValue xgetCValueHeight() { return _myCQ.xdfgetHeight(); }
    protected ConditionValue xgetCValueVolume() { return _myCQ.xdfgetVolume(); }
    protected ConditionValue xgetCValueVolumeRate() { return _myCQ.xdfgetVolumeRate(); }
    protected ConditionValue xgetCValuePermitVolume() { return _myCQ.xdfgetPermitVolume(); }
    protected ConditionValue xgetCValuePermitWeight() { return _myCQ.xdfgetPermitWeight(); }
    protected ConditionValue xgetCValueBoxType() { return _myCQ.xdfgetBoxType(); }
    protected ConditionValue xgetCValueBxoszl() { return _myCQ.xdfgetBxoszl(); }
    protected ConditionValue xgetCValueBxoszw() { return _myCQ.xdfgetBxoszw(); }
    protected ConditionValue xgetCValueBxoszh() { return _myCQ.xdfgetBxoszh(); }
    protected ConditionValue xgetCValueBxweight() { return _myCQ.xdfgetBxweight(); }
    protected ConditionValue xgetCValueBxcpy() { return _myCQ.xdfgetBxcpy(); }
    protected ConditionValue xgetCValueDelFlg() { return _myCQ.xdfgetDelFlg(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected ConditionValue xgetCValueControlNo() { return _myCQ.xdfgetControlNo(); }
    protected ConditionValue xgetCValueAddDt() { return _myCQ.xdfgetAddDt(); }
    protected ConditionValue xgetCValueAddUser() { return _myCQ.xdfgetAddUser(); }
    protected ConditionValue xgetCValueAddProcess() { return _myCQ.xdfgetAddProcess(); }
    protected ConditionValue xgetCValueUpdDt() { return _myCQ.xdfgetUpdDt(); }
    protected ConditionValue xgetCValueUpdUser() { return _myCQ.xdfgetUpdUser(); }
    protected ConditionValue xgetCValueUpdProcess() { return _myCQ.xdfgetUpdProcess(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(MBoxCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MBoxCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MBoxCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MBoxCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MBoxCB.class.getName(); }
    protected String xinCQ() { return MBoxCQ.class.getName(); }
}

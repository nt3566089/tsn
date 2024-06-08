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
 * The condition-query for in-line of M_DELIVERY_COURSE.
 * @author DBFlute(AutoGenerator)
 */
public class MDeliveryCourseCIQ extends AbstractBsMDeliveryCourseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMDeliveryCourseCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MDeliveryCourseCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMDeliveryCourseCQ myCQ) {
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
    protected ConditionValue xgetCValueDeliveryCourseId() { return _myCQ.xdfgetDeliveryCourseId(); }
    public String keepDeliveryCourseId_ExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDeliveryCourseId_ExistsReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDeliveryCourseId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDeliveryCourseId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDeliveryCourseId_ExistsReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDeliveryCourseId_NotExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDeliveryCourseId_NotExistsReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDeliveryCourseId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDeliveryCourseId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDeliveryCourseId_NotExistsReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDeliveryCourseId_SpecifyDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDeliveryCourseId_SpecifyDerivedReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDeliveryCourseId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDeliveryCourseId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDeliveryCourseId_SpecifyDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDeliveryCourseId_QueryDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDeliveryCourseId_QueryDerivedReferrer_MCenterCustomerListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDeliveryCourseId_QueryDerivedReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDeliveryCourseId_QueryDerivedReferrer_MParamListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDeliveryCourseId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDeliveryCourseId_QueryDerivedReferrer_TAllocInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDeliveryCourseId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDeliveryCourseId_QueryDerivedReferrer_TShippingInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDeliveryCourseId_QueryDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDeliveryCourseId_QueryDerivedReferrer_WHtLoadingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueDeliveryCourseCd() { return _myCQ.xdfgetDeliveryCourseCd(); }
    protected ConditionValue xgetCValueDeliveryCourseNm() { return _myCQ.xdfgetDeliveryCourseNm(); }
    protected ConditionValue xgetCValueCarrierId() { return _myCQ.xdfgetCarrierId(); }
    public String keepCarrierId_InScopeRelation_MCarrier(MCarrierCQ sq)
    { return _myCQ.keepCarrierId_InScopeRelation_MCarrier(sq); }
    public String keepCarrierId_NotInScopeRelation_MCarrier(MCarrierCQ sq)
    { return _myCQ.keepCarrierId_NotInScopeRelation_MCarrier(sq); }
    protected ConditionValue xgetCValuePickingTime() { return _myCQ.xdfgetPickingTime(); }
    protected ConditionValue xgetCValueStowageTime() { return _myCQ.xdfgetStowageTime(); }
    protected ConditionValue xgetCValueShippingTime() { return _myCQ.xdfgetShippingTime(); }
    protected ConditionValue xgetCValueCarrierSlipYmtId() { return _myCQ.xdfgetCarrierSlipYmtId(); }
    public String keepCarrierSlipYmtId_InScopeRelation_MCarrierSlipYmt(MCarrierSlipYmtCQ sq)
    { return _myCQ.keepCarrierSlipYmtId_InScopeRelation_MCarrierSlipYmt(sq); }
    public String keepCarrierSlipYmtId_NotInScopeRelation_MCarrierSlipYmt(MCarrierSlipYmtCQ sq)
    { return _myCQ.keepCarrierSlipYmtId_NotInScopeRelation_MCarrierSlipYmt(sq); }
    protected ConditionValue xgetCValueCarrierSlipSgwId() { return _myCQ.xdfgetCarrierSlipSgwId(); }
    public String keepCarrierSlipSgwId_InScopeRelation_MCarrierSlipSgw(MCarrierSlipSgwCQ sq)
    { return _myCQ.keepCarrierSlipSgwId_InScopeRelation_MCarrierSlipSgw(sq); }
    public String keepCarrierSlipSgwId_NotInScopeRelation_MCarrierSlipSgw(MCarrierSlipSgwCQ sq)
    { return _myCQ.keepCarrierSlipSgwId_NotInScopeRelation_MCarrierSlipSgw(sq); }
    protected ConditionValue xgetCValueCarrierSlipYupkId() { return _myCQ.xdfgetCarrierSlipYupkId(); }
    public String keepCarrierSlipYupkId_InScopeRelation_MCarrierSlipYupk(MCarrierSlipYupkCQ sq)
    { return _myCQ.keepCarrierSlipYupkId_InScopeRelation_MCarrierSlipYupk(sq); }
    public String keepCarrierSlipYupkId_NotInScopeRelation_MCarrierSlipYupk(MCarrierSlipYupkCQ sq)
    { return _myCQ.keepCarrierSlipYupkId_NotInScopeRelation_MCarrierSlipYupk(sq); }
    protected ConditionValue xgetCValueTrackingNumberingKey() { return _myCQ.xdfgetTrackingNumberingKey(); }
    protected ConditionValue xgetCValueTrackingNumberingAfterKey() { return _myCQ.xdfgetTrackingNumberingAfterKey(); }
    protected ConditionValue xgetCValueTrackingNumberingUnit() { return _myCQ.xdfgetTrackingNumberingUnit(); }
    protected ConditionValue xgetCValueTagType() { return _myCQ.xdfgetTagType(); }
    protected ConditionValue xgetCValueTagTypeAfter() { return _myCQ.xdfgetTagTypeAfter(); }
    protected ConditionValue xgetCValueTagDataType() { return _myCQ.xdfgetTagDataType(); }
    protected ConditionValue xgetCValuePaymentTerm() { return _myCQ.xdfgetPaymentTerm(); }
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
    public String keepScalarCondition(MDeliveryCourseCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MDeliveryCourseCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MDeliveryCourseCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MDeliveryCourseCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MDeliveryCourseCB.class.getName(); }
    protected String xinCQ() { return MDeliveryCourseCQ.class.getName(); }
}

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
 * The condition-query for in-line of T_ALLOC_INST_H.
 * @author DBFlute(AutoGenerator)
 */
public class TAllocInstHCIQ extends AbstractBsTAllocInstHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTAllocInstHCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TAllocInstHCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTAllocInstHCQ myCQ) {
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
    protected ConditionValue xgetCValueAllocInstHId() { return _myCQ.xdfgetAllocInstHId(); }
    public String keepAllocInstHId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAllocInstHId_ExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAllocInstHId_ExistsReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAllocInstHId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAllocInstHId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAllocInstHId_NotExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAllocInstHId_NotExistsReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAllocInstHId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAllocInstHId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepAllocInstHId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepAllocInstHId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepAllocInstHId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepAllocInstHId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAllocInstHId_QueryDerivedReferrer_TAllocInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAllocInstHId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAllocInstHId_QueryDerivedReferrer_TPackingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAllocInstHId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAllocInstHId_QueryDerivedReferrer_TPickingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAllocInstHId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAllocInstHId_QueryDerivedReferrer_TShippingInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueProcessTypeId() { return _myCQ.xdfgetProcessTypeId(); }
    public String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_InScopeRelation_MProcessType(sq); }
    public String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_NotInScopeRelation_MProcessType(sq); }
    protected ConditionValue xgetCValueShippingDt() { return _myCQ.xdfgetShippingDt(); }
    protected ConditionValue xgetCValueWorkDt() { return _myCQ.xdfgetWorkDt(); }
    protected ConditionValue xgetCValueDelivPlanDt() { return _myCQ.xdfgetDelivPlanDt(); }
    protected ConditionValue xgetCValueDelivDt() { return _myCQ.xdfgetDelivDt(); }
    protected ConditionValue xgetCValueDelivTz() { return _myCQ.xdfgetDelivTz(); }
    protected ConditionValue xgetCValueSupplyCustomerId() { return _myCQ.xdfgetSupplyCustomerId(); }
    public String keepSupplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId(MCustomerCQ sq)
    { return _myCQ.keepSupplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId(sq); }
    public String keepSupplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId(MCustomerCQ sq)
    { return _myCQ.keepSupplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId(sq); }
    protected ConditionValue xgetCValueSupplyCustomerCd() { return _myCQ.xdfgetSupplyCustomerCd(); }
    protected ConditionValue xgetCValueSupplyCustomerNm() { return _myCQ.xdfgetSupplyCustomerNm(); }
    protected ConditionValue xgetCValueDelivCustomerId() { return _myCQ.xdfgetDelivCustomerId(); }
    public String keepDelivCustomerId_InScopeRelation_MCustomerByDelivCustomerId(MCustomerCQ sq)
    { return _myCQ.keepDelivCustomerId_InScopeRelation_MCustomerByDelivCustomerId(sq); }
    public String keepDelivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId(MCustomerCQ sq)
    { return _myCQ.keepDelivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId(sq); }
    protected ConditionValue xgetCValueDelivCustomerCd() { return _myCQ.xdfgetDelivCustomerCd(); }
    protected ConditionValue xgetCValueDelivZipCd() { return _myCQ.xdfgetDelivZipCd(); }
    protected ConditionValue xgetCValueDelivAddress1() { return _myCQ.xdfgetDelivAddress1(); }
    protected ConditionValue xgetCValueDelivAddress2() { return _myCQ.xdfgetDelivAddress2(); }
    protected ConditionValue xgetCValueDelivAddress3() { return _myCQ.xdfgetDelivAddress3(); }
    protected ConditionValue xgetCValueDelivAddressSupply() { return _myCQ.xdfgetDelivAddressSupply(); }
    protected ConditionValue xgetCValueDelivCustomerNm() { return _myCQ.xdfgetDelivCustomerNm(); }
    protected ConditionValue xgetCValueDelivTelNo() { return _myCQ.xdfgetDelivTelNo(); }
    protected ConditionValue xgetCValueDeliveryCourseId() { return _myCQ.xdfgetDeliveryCourseId(); }
    public String keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq)
    { return _myCQ.keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(sq); }
    public String keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq)
    { return _myCQ.keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(sq); }
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
    public String keepScalarCondition(TAllocInstHCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TAllocInstHCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TAllocInstHCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TAllocInstHCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TAllocInstHCB.class.getName(); }
    protected String xinCQ() { return TAllocInstHCQ.class.getName(); }
}

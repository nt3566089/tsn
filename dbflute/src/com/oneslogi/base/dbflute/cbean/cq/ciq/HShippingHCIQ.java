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
 * The condition-query for in-line of H_SHIPPING_H.
 * @author DBFlute(AutoGenerator)
 */
public class HShippingHCIQ extends AbstractBsHShippingHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsHShippingHCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public HShippingHCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsHShippingHCQ myCQ) {
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
    protected ConditionValue xgetCValueShippingInstHId() { return _myCQ.xdfgetShippingInstHId(); }
    public String keepShippingInstHId_ExistsReferrer_HPackingHList(HPackingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShippingInstHId_ExistsReferrer_HShippingBList(HShippingBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShippingInstHId_NotExistsReferrer_HPackingHList(HPackingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShippingInstHId_NotExistsReferrer_HShippingBList(HShippingBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShippingInstHId_SpecifyDerivedReferrer_HPackingHList(HPackingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShippingInstHId_SpecifyDerivedReferrer_HShippingBList(HShippingBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShippingInstHId_QueryDerivedReferrer_HPackingHList(HPackingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShippingInstHId_QueryDerivedReferrer_HPackingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShippingInstHId_QueryDerivedReferrer_HShippingBList(HShippingBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShippingInstHId_QueryDerivedReferrer_HShippingBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueHistDt() { return _myCQ.xdfgetHistDt(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    protected ConditionValue xgetCValueClientCd() { return _myCQ.xdfgetClientCd(); }
    protected ConditionValue xgetCValueClientNm() { return _myCQ.xdfgetClientNm(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueCenterNm() { return _myCQ.xdfgetCenterNm(); }
    protected ConditionValue xgetCValueProcessTypeId() { return _myCQ.xdfgetProcessTypeId(); }
    public String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_InScopeRelation_MProcessType(sq); }
    public String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_NotInScopeRelation_MProcessType(sq); }
    protected ConditionValue xgetCValueDelivPlanDt() { return _myCQ.xdfgetDelivPlanDt(); }
    protected ConditionValue xgetCValueDelivDt() { return _myCQ.xdfgetDelivDt(); }
    protected ConditionValue xgetCValueDelivTz() { return _myCQ.xdfgetDelivTz(); }
    protected ConditionValue xgetCValueShippingDt() { return _myCQ.xdfgetShippingDt(); }
    protected ConditionValue xgetCValueWorkDt() { return _myCQ.xdfgetWorkDt(); }
    protected ConditionValue xgetCValueClientShippingNo() { return _myCQ.xdfgetClientShippingNo(); }
    protected ConditionValue xgetCValueShippingSlipNo() { return _myCQ.xdfgetShippingSlipNo(); }
    protected ConditionValue xgetCValueSupplyCustomerId() { return _myCQ.xdfgetSupplyCustomerId(); }
    protected ConditionValue xgetCValueSupplyCustomerCd() { return _myCQ.xdfgetSupplyCustomerCd(); }
    protected ConditionValue xgetCValueSupplyCustomerNm() { return _myCQ.xdfgetSupplyCustomerNm(); }
    protected ConditionValue xgetCValueDelivCustomerId() { return _myCQ.xdfgetDelivCustomerId(); }
    protected ConditionValue xgetCValueDelivCustomerCd() { return _myCQ.xdfgetDelivCustomerCd(); }
    protected ConditionValue xgetCValueDelivZipCd() { return _myCQ.xdfgetDelivZipCd(); }
    protected ConditionValue xgetCValueDelivAddress1() { return _myCQ.xdfgetDelivAddress1(); }
    protected ConditionValue xgetCValueDelivAddress2() { return _myCQ.xdfgetDelivAddress2(); }
    protected ConditionValue xgetCValueDelivAddress3() { return _myCQ.xdfgetDelivAddress3(); }
    protected ConditionValue xgetCValueDelivAddressSupply() { return _myCQ.xdfgetDelivAddressSupply(); }
    protected ConditionValue xgetCValueDelivCustomerNm() { return _myCQ.xdfgetDelivCustomerNm(); }
    protected ConditionValue xgetCValueDelivTelNo() { return _myCQ.xdfgetDelivTelNo(); }
    protected ConditionValue xgetCValueDeliveryCourseId() { return _myCQ.xdfgetDeliveryCourseId(); }
    protected ConditionValue xgetCValueDeliveryCourseCd() { return _myCQ.xdfgetDeliveryCourseCd(); }
    protected ConditionValue xgetCValueDeliveryCourseNm() { return _myCQ.xdfgetDeliveryCourseNm(); }
    protected ConditionValue xgetCValueCarrierId() { return _myCQ.xdfgetCarrierId(); }
    protected ConditionValue xgetCValueCarrierCd() { return _myCQ.xdfgetCarrierCd(); }
    protected ConditionValue xgetCValueCarrierNm() { return _myCQ.xdfgetCarrierNm(); }
    protected ConditionValue xgetCValueEmergencyFlg() { return _myCQ.xdfgetEmergencyFlg(); }
    protected ConditionValue xgetCValuePickingWorkMessage() { return _myCQ.xdfgetPickingWorkMessage(); }
    protected ConditionValue xgetCValueTotalPrice() { return _myCQ.xdfgetTotalPrice(); }
    protected ConditionValue xgetCValueTotalTax() { return _myCQ.xdfgetTotalTax(); }
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
    public String keepScalarCondition(HShippingHCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(HShippingHCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(HShippingHCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(HShippingHCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return HShippingHCB.class.getName(); }
    protected String xinCQ() { return HShippingHCQ.class.getName(); }
}

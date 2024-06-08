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
 * The condition-query for in-line of T_EC_ORDER_B.
 * @author DBFlute(AutoGenerator)
 */
public class TEcOrderBCIQ extends AbstractBsTEcOrderBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTEcOrderBCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TEcOrderBCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTEcOrderBCQ myCQ) {
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
    protected ConditionValue xgetCValueEcOrderBId() { return _myCQ.xdfgetEcOrderBId(); }
    public String keepEcOrderBId_ExistsReferrer_TAmazonOrderList(TAmazonOrderCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepEcOrderBId_ExistsReferrer_TRakutenOrderList(TRakutenOrderCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepEcOrderBId_ExistsReferrer_TYahooOrderList(TYahooOrderCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepEcOrderBId_NotExistsReferrer_TAmazonOrderList(TAmazonOrderCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepEcOrderBId_NotExistsReferrer_TRakutenOrderList(TRakutenOrderCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepEcOrderBId_NotExistsReferrer_TYahooOrderList(TYahooOrderCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepEcOrderBId_SpecifyDerivedReferrer_TAmazonOrderList(TAmazonOrderCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepEcOrderBId_SpecifyDerivedReferrer_TRakutenOrderList(TRakutenOrderCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepEcOrderBId_SpecifyDerivedReferrer_TYahooOrderList(TYahooOrderCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepEcOrderBId_QueryDerivedReferrer_TAmazonOrderList(TAmazonOrderCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepEcOrderBId_QueryDerivedReferrer_TAmazonOrderListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepEcOrderBId_QueryDerivedReferrer_TRakutenOrderList(TRakutenOrderCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepEcOrderBId_QueryDerivedReferrer_TRakutenOrderListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepEcOrderBId_QueryDerivedReferrer_TYahooOrderList(TYahooOrderCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepEcOrderBId_QueryDerivedReferrer_TYahooOrderListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueEcOrderHId() { return _myCQ.xdfgetEcOrderHId(); }
    public String keepEcOrderHId_InScopeRelation_TEcOrderH(TEcOrderHCQ sq)
    { return _myCQ.keepEcOrderHId_InScopeRelation_TEcOrderH(sq); }
    public String keepEcOrderHId_NotInScopeRelation_TEcOrderH(TEcOrderHCQ sq)
    { return _myCQ.keepEcOrderHId_NotInScopeRelation_TEcOrderH(sq); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueProductNm() { return _myCQ.xdfgetProductNm(); }
    protected ConditionValue xgetCValueProductOption() { return _myCQ.xdfgetProductOption(); }
    protected ConditionValue xgetCValueOrderNum() { return _myCQ.xdfgetOrderNum(); }
    protected ConditionValue xgetCValueUnitPrice() { return _myCQ.xdfgetUnitPrice(); }
    protected ConditionValue xgetCValueUnitTotalPrice() { return _myCQ.xdfgetUnitTotalPrice(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
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
    public String keepScalarCondition(TEcOrderBCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TEcOrderBCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TEcOrderBCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TEcOrderBCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TEcOrderBCB.class.getName(); }
    protected String xinCQ() { return TEcOrderBCQ.class.getName(); }
}

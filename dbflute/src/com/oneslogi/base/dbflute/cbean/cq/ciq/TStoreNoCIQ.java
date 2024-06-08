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
 * The condition-query for in-line of T_STORE_NO.
 * @author DBFlute(AutoGenerator)
 */
public class TStoreNoCIQ extends AbstractBsTStoreNoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTStoreNoCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TStoreNoCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTStoreNoCQ myCQ) {
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
    protected ConditionValue xgetCValueStoreNoId() { return _myCQ.xdfgetStoreNoId(); }
    public String keepStoreNoId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStoreNoId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStoreNoId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStoreNoId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStoreNoId_ExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStoreNoId_ExistsReferrer_TStoreNoSelfList(TStoreNoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStoreNoId_ExistsReferrer_TStoreNoRAsOne(TStoreNoRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStoreNoId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStoreNoId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStoreNoId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStoreNoId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStoreNoId_NotExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStoreNoId_NotExistsReferrer_TStoreNoSelfList(TStoreNoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStoreNoId_NotExistsReferrer_TStoreNoRAsOne(TStoreNoRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStoreNoId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStoreNoId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStoreNoId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStoreNoId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStoreNoId_SpecifyDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStoreNoId_SpecifyDerivedReferrer_TStoreNoSelfList(TStoreNoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStoreNoId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStoreNoId_QueryDerivedReferrer_TAllocInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStoreNoId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStoreNoId_QueryDerivedReferrer_TInventoryBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStoreNoId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStoreNoId_QueryDerivedReferrer_TMoveInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStoreNoId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStoreNoId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStoreNoId_QueryDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStoreNoId_QueryDerivedReferrer_TStockListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStoreNoId_QueryDerivedReferrer_TStoreNoSelfList(TStoreNoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStoreNoId_QueryDerivedReferrer_TStoreNoSelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueStoreLabelNo() { return _myCQ.xdfgetStoreLabelNo(); }
    protected ConditionValue xgetCValueOldStoreNumId() { return _myCQ.xdfgetOldStoreNumId(); }
    public String keepOldStoreNumId_InScopeRelation_TStoreNoSelf(TStoreNoCQ sq)
    { return _myCQ.keepOldStoreNumId_InScopeRelation_TStoreNoSelf(sq); }
    public String keepOldStoreNumId_NotInScopeRelation_TStoreNoSelf(TStoreNoCQ sq)
    { return _myCQ.keepOldStoreNumId_NotInScopeRelation_TStoreNoSelf(sq); }
    protected ConditionValue xgetCValueSupplierId() { return _myCQ.xdfgetSupplierId(); }
    public String keepSupplierId_InScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepSupplierId_InScopeRelation_MCustomer(sq); }
    public String keepSupplierId_NotInScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepSupplierId_NotInScopeRelation_MCustomer(sq); }
    protected ConditionValue xgetCValueStoreDt() { return _myCQ.xdfgetStoreDt(); }
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
    public String keepScalarCondition(TStoreNoCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TStoreNoCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TStoreNoCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TStoreNoCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TStoreNoCB.class.getName(); }
    protected String xinCQ() { return TStoreNoCQ.class.getName(); }
}

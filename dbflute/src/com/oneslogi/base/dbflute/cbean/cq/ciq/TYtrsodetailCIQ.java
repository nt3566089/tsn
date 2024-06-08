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
 * The condition-query for in-line of T_YTRSODETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TYtrsodetailCIQ extends AbstractBsTYtrsodetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTYtrsodetailCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TYtrsodetailCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTYtrsodetailCQ myCQ) {
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
    protected ConditionValue xgetCValueTrsodetailId() { return _myCQ.xdfgetTrsodetailId(); }
    public String keepTrsodetailId_ExistsReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepTrsodetailId_ExistsReferrer_TTrpickdetailList(TTrpickdetailCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepTrsodetailId_NotExistsReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepTrsodetailId_NotExistsReferrer_TTrpickdetailList(TTrpickdetailCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepTrsodetailId_SpecifyDerivedReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepTrsodetailId_SpecifyDerivedReferrer_TTrpickdetailList(TTrpickdetailCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepTrsodetailId_QueryDerivedReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTrsodetailId_QueryDerivedReferrer_TTrimallocschkriListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTrsodetailId_QueryDerivedReferrer_TTrpickdetailList(TTrpickdetailCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTrsodetailId_QueryDerivedReferrer_TTrpickdetailListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueTrsoId() { return _myCQ.xdfgetTrsoId(); }
    public String keepTrsoId_InScopeRelation_TYtrso(TYtrsoCQ sq)
    { return _myCQ.keepTrsoId_InScopeRelation_TYtrso(sq); }
    public String keepTrsoId_NotInScopeRelation_TYtrso(TYtrsoCQ sq)
    { return _myCQ.keepTrsoId_NotInScopeRelation_TYtrso(sq); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_MProduct(sq); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_MProduct(sq); }
    protected ConditionValue xgetCValueSoLineNo() { return _myCQ.xdfgetSoLineNo(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueIfitemCd() { return _myCQ.xdfgetIfitemCd(); }
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    protected ConditionValue xgetCValueLocationCd() { return _myCQ.xdfgetLocationCd(); }
    protected ConditionValue xgetCValueDamageFlg() { return _myCQ.xdfgetDamageFlg(); }
    protected ConditionValue xgetCValueNoShippingFlg() { return _myCQ.xdfgetNoShippingFlg(); }
    protected ConditionValue xgetCValueExpectQty() { return _myCQ.xdfgetExpectQty(); }
    protected ConditionValue xgetCValueAllocQty() { return _myCQ.xdfgetAllocQty(); }
    protected ConditionValue xgetCValuePickedQty() { return _myCQ.xdfgetPickedQty(); }
    protected ConditionValue xgetCValueSortedQty() { return _myCQ.xdfgetSortedQty(); }
    protected ConditionValue xgetCValueInspectedQty() { return _myCQ.xdfgetInspectedQty(); }
    protected ConditionValue xgetCValueShippedQty() { return _myCQ.xdfgetShippedQty(); }
    protected ConditionValue xgetCValueAdjustQty() { return _myCQ.xdfgetAdjustQty(); }
    protected ConditionValue xgetCValueLocFlg() { return _myCQ.xdfgetLocFlg(); }
    protected ConditionValue xgetCValueStdDifFlg() { return _myCQ.xdfgetStdDifFlg(); }
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
    public String keepScalarCondition(TYtrsodetailCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TYtrsodetailCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TYtrsodetailCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TYtrsodetailCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TYtrsodetailCB.class.getName(); }
    protected String xinCQ() { return TYtrsodetailCQ.class.getName(); }
}

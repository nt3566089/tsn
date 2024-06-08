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
 * The condition-query for in-line of T_TRSOJTDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TTrsojtdetailCIQ extends AbstractBsTTrsojtdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrsojtdetailCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrsojtdetailCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrsojtdetailCQ myCQ) {
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
    protected ConditionValue xgetCValueSojtlineid() { return _myCQ.xdfgetSojtlineid(); }
    protected ConditionValue xgetCValueSojtid() { return _myCQ.xdfgetSojtid(); }
    protected ConditionValue xgetCValueSojtlineno() { return _myCQ.xdfgetSojtlineno(); }
    protected ConditionValue xgetCValueDatatype() { return _myCQ.xdfgetDatatype(); }
    protected ConditionValue xgetCValuePlanseq() { return _myCQ.xdfgetPlanseq(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    protected ConditionValue xgetCValueLot3() { return _myCQ.xdfgetLot3(); }
    protected ConditionValue xgetCValueLot4() { return _myCQ.xdfgetLot4(); }
    protected ConditionValue xgetCValueExpectqty1() { return _myCQ.xdfgetExpectqty1(); }
    protected ConditionValue xgetCValuePickedqty1() { return _myCQ.xdfgetPickedqty1(); }
    protected ConditionValue xgetCValuePoid() { return _myCQ.xdfgetPoid(); }
    protected ConditionValue xgetCValuePalletId() { return _myCQ.xdfgetPalletId(); }
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    protected ConditionValue xgetCValueSoid() { return _myCQ.xdfgetSoid(); }
    protected ConditionValue xgetCValueSodetailid() { return _myCQ.xdfgetSodetailid(); }
    protected ConditionValue xgetCValueTrsoaddflg() { return _myCQ.xdfgetTrsoaddflg(); }
    protected ConditionValue xgetCValuePlanoutseq() { return _myCQ.xdfgetPlanoutseq(); }
    protected ConditionValue xgetCValuePlanprice1() { return _myCQ.xdfgetPlanprice1(); }
    protected ConditionValue xgetCValuePlanprice2() { return _myCQ.xdfgetPlanprice2(); }
    protected ConditionValue xgetCValuePlanitemname() { return _myCQ.xdfgetPlanitemname(); }
    protected ConditionValue xgetCValuePlandata1() { return _myCQ.xdfgetPlandata1(); }
    protected ConditionValue xgetCValuePlandata2() { return _myCQ.xdfgetPlandata2(); }
    protected ConditionValue xgetCValuePlandata3() { return _myCQ.xdfgetPlandata3(); }
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
    public String keepScalarCondition(TTrsojtdetailCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrsojtdetailCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrsojtdetailCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrsojtdetailCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrsojtdetailCB.class.getName(); }
    protected String xinCQ() { return TTrsojtdetailCQ.class.getName(); }
}

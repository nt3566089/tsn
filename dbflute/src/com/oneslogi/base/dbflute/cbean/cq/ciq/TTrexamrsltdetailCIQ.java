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
 * The condition-query for in-line of T_TREXAMRSLTDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TTrexamrsltdetailCIQ extends AbstractBsTTrexamrsltdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrexamrsltdetailCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrexamrsltdetailCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrexamrsltdetailCQ myCQ) {
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
    protected ConditionValue xgetCValueTrexamrsltdetailId() { return _myCQ.xdfgetTrexamrsltdetailId(); }
    protected ConditionValue xgetCValueTrexamresultId() { return _myCQ.xdfgetTrexamresultId(); }
    protected ConditionValue xgetCValueExamlineno() { return _myCQ.xdfgetExamlineno(); }
    protected ConditionValue xgetCValueZaikoinvId() { return _myCQ.xdfgetZaikoinvId(); }
    protected ConditionValue xgetCValueZaikoinv() { return _myCQ.xdfgetZaikoinv(); }
    protected ConditionValue xgetCValueExamqty() { return _myCQ.xdfgetExamqty(); }
    protected ConditionValue xgetCValueRes40qty1() { return _myCQ.xdfgetRes40qty1(); }
    protected ConditionValue xgetCValueRes40qty2() { return _myCQ.xdfgetRes40qty2(); }
    protected ConditionValue xgetCValueInferiorqty() { return _myCQ.xdfgetInferiorqty(); }
    protected ConditionValue xgetCValueAftzaikoinvId() { return _myCQ.xdfgetAftzaikoinvId(); }
    protected ConditionValue xgetCValueAftzaikoinv() { return _myCQ.xdfgetAftzaikoinv(); }
    protected ConditionValue xgetCValueReservationflg() { return _myCQ.xdfgetReservationflg(); }
    protected ConditionValue xgetCValueExamdetailsts() { return _myCQ.xdfgetExamdetailsts(); }
    protected ConditionValue xgetCValueExamdate() { return _myCQ.xdfgetExamdate(); }
    protected ConditionValue xgetCValueNotexamqty() { return _myCQ.xdfgetNotexamqty(); }
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
    public String keepScalarCondition(TTrexamrsltdetailCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrexamrsltdetailCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrexamrsltdetailCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrexamrsltdetailCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrexamrsltdetailCB.class.getName(); }
    protected String xinCQ() { return TTrexamrsltdetailCQ.class.getName(); }
}

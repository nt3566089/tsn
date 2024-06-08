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
 * The condition-query for in-line of T_TRTEMPALLOCATESEQDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TTrtempallocateseqdetailCIQ extends AbstractBsTTrtempallocateseqdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrtempallocateseqdetailCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrtempallocateseqdetailCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrtempallocateseqdetailCQ myCQ) {
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
    protected ConditionValue xgetCValueTemporaryAllocDetailId() { return _myCQ.xdfgetTemporaryAllocDetailId(); }
    protected ConditionValue xgetCValueTemporaryAllocId() { return _myCQ.xdfgetTemporaryAllocId(); }
    public String keepTemporaryAllocId_InScopeRelation_TTrtempallocateseq(TTrtempallocateseqCQ sq)
    { return _myCQ.keepTemporaryAllocId_InScopeRelation_TTrtempallocateseq(sq); }
    public String keepTemporaryAllocId_NotInScopeRelation_TTrtempallocateseq(TTrtempallocateseqCQ sq)
    { return _myCQ.keepTemporaryAllocId_NotInScopeRelation_TTrtempallocateseq(sq); }
    protected ConditionValue xgetCValueAllocateseq() { return _myCQ.xdfgetAllocateseq(); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    protected ConditionValue xgetCValueListkbn() { return _myCQ.xdfgetListkbn(); }
    protected ConditionValue xgetCValueDetaillineno() { return _myCQ.xdfgetDetaillineno(); }
    protected ConditionValue xgetCValuePalletId() { return _myCQ.xdfgetPalletId(); }
    protected ConditionValue xgetCValueTemppickedqty1() { return _myCQ.xdfgetTemppickedqty1(); }
    protected ConditionValue xgetCValueTemppickedqty2() { return _myCQ.xdfgetTemppickedqty2(); }
    protected ConditionValue xgetCValueTemppickedqty3() { return _myCQ.xdfgetTemppickedqty3(); }
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
    public String keepScalarCondition(TTrtempallocateseqdetailCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrtempallocateseqdetailCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrtempallocateseqdetailCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrtempallocateseqdetailCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrtempallocateseqdetailCB.class.getName(); }
    protected String xinCQ() { return TTrtempallocateseqdetailCQ.class.getName(); }
}

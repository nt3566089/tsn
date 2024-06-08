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
 * The condition-query for in-line of T_PIC_MTHD_RCMD_CART.
 * @author DBFlute(AutoGenerator)
 */
public class TPicMthdRcmdCartCIQ extends AbstractBsTPicMthdRcmdCartCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTPicMthdRcmdCartCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TPicMthdRcmdCartCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTPicMthdRcmdCartCQ myCQ) {
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
    protected ConditionValue xgetCValuePicMthdRcmdCartId() { return _myCQ.xdfgetPicMthdRcmdCartId(); }
    protected ConditionValue xgetCValuePackingHId() { return _myCQ.xdfgetPackingHId(); }
    public String keepPackingHId_InScopeRelation_TPackingH(TPackingHCQ sq)
    { return _myCQ.keepPackingHId_InScopeRelation_TPackingH(sq); }
    public String keepPackingHId_NotInScopeRelation_TPackingH(TPackingHCQ sq)
    { return _myCQ.keepPackingHId_NotInScopeRelation_TPackingH(sq); }
    protected ConditionValue xgetCValueCartNo() { return _myCQ.xdfgetCartNo(); }
    protected ConditionValue xgetCValuePicMthdRcmdId() { return _myCQ.xdfgetPicMthdRcmdId(); }
    public String keepPicMthdRcmdId_InScopeRelation_TPicMthdRcmd(TPicMthdRcmdCQ sq)
    { return _myCQ.keepPicMthdRcmdId_InScopeRelation_TPicMthdRcmd(sq); }
    public String keepPicMthdRcmdId_NotInScopeRelation_TPicMthdRcmd(TPicMthdRcmdCQ sq)
    { return _myCQ.keepPicMthdRcmdId_NotInScopeRelation_TPicMthdRcmd(sq); }
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
    public String keepScalarCondition(TPicMthdRcmdCartCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TPicMthdRcmdCartCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TPicMthdRcmdCartCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TPicMthdRcmdCartCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TPicMthdRcmdCartCB.class.getName(); }
    protected String xinCQ() { return TPicMthdRcmdCartCQ.class.getName(); }
}

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
 * The condition-query for in-line of T_CLCKINV.
 * @author DBFlute(AutoGenerator)
 */
public class TClckinvCIQ extends AbstractBsTClckinvCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTClckinvCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TClckinvCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTClckinvCQ myCQ) {
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
    protected ConditionValue xgetCValueClckinvId() { return _myCQ.xdfgetClckinvId(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    protected ConditionValue xgetCValuePresrcbqa() { return _myCQ.xdfgetPresrcbqa(); }
    protected ConditionValue xgetCValuePresrctqa() { return _myCQ.xdfgetPresrctqa(); }
    protected ConditionValue xgetCValueLckcbivq() { return _myCQ.xdfgetLckcbivq(); }
    protected ConditionValue xgetCValueLckctivq() { return _myCQ.xdfgetLckctivq(); }
    protected ConditionValue xgetCValueDscbqa() { return _myCQ.xdfgetDscbqa(); }
    protected ConditionValue xgetCValueDsctqa() { return _myCQ.xdfgetDsctqa(); }
    protected ConditionValue xgetCValueTosplcbqa() { return _myCQ.xdfgetTosplcbqa(); }
    protected ConditionValue xgetCValueTosplctqa() { return _myCQ.xdfgetTosplctqa(); }
    protected ConditionValue xgetCValuePresplcbqa() { return _myCQ.xdfgetPresplcbqa(); }
    protected ConditionValue xgetCValuePresplctqa() { return _myCQ.xdfgetPresplctqa(); }
    protected ConditionValue xgetCValueTstinvcb() { return _myCQ.xdfgetTstinvcb(); }
    protected ConditionValue xgetCValueTstinvct() { return _myCQ.xdfgetTstinvct(); }
    protected ConditionValue xgetCValueTsplcb() { return _myCQ.xdfgetTsplcb(); }
    protected ConditionValue xgetCValueTsplct() { return _myCQ.xdfgetTsplct(); }
    protected ConditionValue xgetCValueTpresplcb() { return _myCQ.xdfgetTpresplcb(); }
    protected ConditionValue xgetCValueTpresplct() { return _myCQ.xdfgetTpresplct(); }
    protected ConditionValue xgetCValueTinvmdtcb() { return _myCQ.xdfgetTinvmdtcb(); }
    protected ConditionValue xgetCValueTinvmdtct() { return _myCQ.xdfgetTinvmdtct(); }
    protected ConditionValue xgetCValueCsplnun() { return _myCQ.xdfgetCsplnun(); }
    protected ConditionValue xgetCValueUpfg() { return _myCQ.xdfgetUpfg(); }
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
    public String keepScalarCondition(TClckinvCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TClckinvCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TClckinvCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TClckinvCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TClckinvCB.class.getName(); }
    protected String xinCQ() { return TClckinvCQ.class.getName(); }
}

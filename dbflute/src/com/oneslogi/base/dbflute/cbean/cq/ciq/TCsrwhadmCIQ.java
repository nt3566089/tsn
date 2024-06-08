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
 * The condition-query for in-line of T_CSRWHADM.
 * @author DBFlute(AutoGenerator)
 */
public class TCsrwhadmCIQ extends AbstractBsTCsrwhadmCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTCsrwhadmCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TCsrwhadmCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTCsrwhadmCQ myCQ) {
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
    protected ConditionValue xgetCValueSortPlaceManageId() { return _myCQ.xdfgetSortPlaceManageId(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueZzorgncd() { return _myCQ.xdfgetZzorgncd(); }
    protected ConditionValue xgetCValueSrymd() { return _myCQ.xdfgetSrymd(); }
    protected ConditionValue xgetCValueSroprtcnt() { return _myCQ.xdfgetSroprtcnt(); }
    protected ConditionValue xgetCValuePresplcnt() { return _myCQ.xdfgetPresplcnt(); }
    protected ConditionValue xgetCValueSrpmtfg() { return _myCQ.xdfgetSrpmtfg(); }
    protected ConditionValue xgetCValueMntpmtfg() { return _myCQ.xdfgetMntpmtfg(); }
    protected ConditionValue xgetCValueCordrcvcnt() { return _myCQ.xdfgetCordrcvcnt(); }
    protected ConditionValue xgetCValueRefvalue() { return _myCQ.xdfgetRefvalue(); }
    protected ConditionValue xgetCValueSftpclmgn() { return _myCQ.xdfgetSftpclmgn(); }
    protected ConditionValue xgetCValueTdayesrcompfg() { return _myCQ.xdfgetTdayesrcompfg(); }
    protected ConditionValue xgetCValueLocidfrnk() { return _myCQ.xdfgetLocidfrnk(); }
    protected ConditionValue xgetCValueLocidfbrctg1() { return _myCQ.xdfgetLocidfbrctg1(); }
    protected ConditionValue xgetCValueLocidfbrctg2() { return _myCQ.xdfgetLocidfbrctg2(); }
    protected ConditionValue xgetCValueLocidfbrctg3() { return _myCQ.xdfgetLocidfbrctg3(); }
    protected ConditionValue xgetCValueLocidfbrctg4() { return _myCQ.xdfgetLocidfbrctg4(); }
    protected ConditionValue xgetCValueLocidfbrctg5() { return _myCQ.xdfgetLocidfbrctg5(); }
    protected ConditionValue xgetCValueLocidfbrctg6() { return _myCQ.xdfgetLocidfbrctg6(); }
    protected ConditionValue xgetCValueLocidfbrctg7() { return _myCQ.xdfgetLocidfbrctg7(); }
    protected ConditionValue xgetCValueLocidfbrctg8() { return _myCQ.xdfgetLocidfbrctg8(); }
    protected ConditionValue xgetCValueLocidfbrctg9() { return _myCQ.xdfgetLocidfbrctg9(); }
    protected ConditionValue xgetCValueLocidfbrctg10() { return _myCQ.xdfgetLocidfbrctg10(); }
    protected ConditionValue xgetCValueSortingFlg() { return _myCQ.xdfgetSortingFlg(); }
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
    public String keepScalarCondition(TCsrwhadmCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TCsrwhadmCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TCsrwhadmCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TCsrwhadmCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TCsrwhadmCB.class.getName(); }
    protected String xinCQ() { return TCsrwhadmCQ.class.getName(); }
}

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
 * The condition-query for in-line of M_CRELAYBS.
 * @author DBFlute(AutoGenerator)
 */
public class MCrelaybsCIQ extends AbstractBsMCrelaybsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMCrelaybsCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MCrelaybsCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMCrelaybsCQ myCQ) {
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
    protected ConditionValue xgetCValueCrelaybsId() { return _myCQ.xdfgetCrelaybsId(); }
    protected ConditionValue xgetCValueRlybscd() { return _myCQ.xdfgetRlybscd(); }
    protected ConditionValue xgetCValueDlvdpcd() { return _myCQ.xdfgetDlvdpcd(); }
    protected ConditionValue xgetCValueRlybsnm() { return _myCQ.xdfgetRlybsnm(); }
    protected ConditionValue xgetCValueRlybssnm() { return _myCQ.xdfgetRlybssnm(); }
    protected ConditionValue xgetCValueRlybsp() { return _myCQ.xdfgetRlybsp(); }
    protected ConditionValue xgetCValueRlybsacd() { return _myCQ.xdfgetRlybsacd(); }
    protected ConditionValue xgetCValueRlybsccd() { return _myCQ.xdfgetRlybsccd(); }
    protected ConditionValue xgetCValueRlybsar() { return _myCQ.xdfgetRlybsar(); }
    protected ConditionValue xgetCValueRlybstl() { return _myCQ.xdfgetRlybstl(); }
    protected ConditionValue xgetCValueRlybsfn() { return _myCQ.xdfgetRlybsfn(); }
    protected ConditionValue xgetCValueRlybsid() { return _myCQ.xdfgetRlybsid(); }
    protected ConditionValue xgetCValueRlyshan() { return _myCQ.xdfgetRlyshan(); }
    protected ConditionValue xgetCValueDelymd() { return _myCQ.xdfgetDelymd(); }
    protected ConditionValue xgetCValueChngyd() { return _myCQ.xdfgetChngyd(); }
    protected ConditionValue xgetCValueUpdtm() { return _myCQ.xdfgetUpdtm(); }
    protected ConditionValue xgetCValueZzfrdateh() { return _myCQ.xdfgetZzfrdateh(); }
    protected ConditionValue xgetCValueZztodateh() { return _myCQ.xdfgetZztodateh(); }
    protected ConditionValue xgetCValueRcdupdps() { return _myCQ.xdfgetRcdupdps(); }
    protected ConditionValue xgetCValueUpdpocd() { return _myCQ.xdfgetUpdpocd(); }
    protected ConditionValue xgetCValueOtcmpfg() { return _myCQ.xdfgetOtcmpfg(); }
    protected ConditionValue xgetCValueTmcmpfg() { return _myCQ.xdfgetTmcmpfg(); }
    protected ConditionValue xgetCValueStmid() { return _myCQ.xdfgetStmid(); }
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
    public String keepScalarCondition(MCrelaybsCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MCrelaybsCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MCrelaybsCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MCrelaybsCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MCrelaybsCB.class.getName(); }
    protected String xinCQ() { return MCrelaybsCQ.class.getName(); }
}

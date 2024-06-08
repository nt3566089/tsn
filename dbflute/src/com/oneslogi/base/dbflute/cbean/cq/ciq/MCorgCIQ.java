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
 * The condition-query for in-line of M_CORG.
 * @author DBFlute(AutoGenerator)
 */
public class MCorgCIQ extends AbstractBsMCorgCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMCorgCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MCorgCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMCorgCQ myCQ) {
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
    protected ConditionValue xgetCValueCorgId() { return _myCQ.xdfgetCorgId(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueOrgid() { return _myCQ.xdfgetOrgid(); }
    protected ConditionValue xgetCValueOrgnmkjf() { return _myCQ.xdfgetOrgnmkjf(); }
    protected ConditionValue xgetCValueOrgnmknf() { return _myCQ.xdfgetOrgnmknf(); }
    protected ConditionValue xgetCValueOrgnmkj() { return _myCQ.xdfgetOrgnmkj(); }
    protected ConditionValue xgetCValueOrgnmkn() { return _myCQ.xdfgetOrgnmkn(); }
    protected ConditionValue xgetCValueUporgncd() { return _myCQ.xdfgetUporgncd(); }
    protected ConditionValue xgetCValueZzbasecd() { return _myCQ.xdfgetZzbasecd(); }
    protected ConditionValue xgetCValueZzcomacd() { return _myCQ.xdfgetZzcomacd(); }
    protected ConditionValue xgetCValueZzwhmgid() { return _myCQ.xdfgetZzwhmgid(); }
    protected ConditionValue xgetCValueOtrnk() { return _myCQ.xdfgetOtrnk(); }
    protected ConditionValue xgetCValueRdvdid() { return _myCQ.xdfgetRdvdid(); }
    protected ConditionValue xgetCValueZzablymd() { return _myCQ.xdfgetZzablymd(); }
    protected ConditionValue xgetCValueZzfrdateh() { return _myCQ.xdfgetZzfrdateh(); }
    protected ConditionValue xgetCValueZztodateh() { return _myCQ.xdfgetZztodateh(); }
    protected ConditionValue xgetCValueSasasid() { return _myCQ.xdfgetSasasid(); }
    protected ConditionValue xgetCValueCmlrasid() { return _myCQ.xdfgetCmlrasid(); }
    protected ConditionValue xgetCValueAnwhnm() { return _myCQ.xdfgetAnwhnm(); }
    protected ConditionValue xgetCValueOdtscd() { return _myCQ.xdfgetOdtscd(); }
    protected ConditionValue xgetCValueLnarcd() { return _myCQ.xdfgetLnarcd(); }
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
    public String keepScalarCondition(MCorgCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MCorgCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MCorgCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MCorgCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MCorgCB.class.getName(); }
    protected String xinCQ() { return MCorgCQ.class.getName(); }
}

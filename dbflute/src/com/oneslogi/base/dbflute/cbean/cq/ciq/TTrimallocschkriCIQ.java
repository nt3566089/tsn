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
 * The condition-query for in-line of T_TRIMALLOCSCHKRI.
 * @author DBFlute(AutoGenerator)
 */
public class TTrimallocschkriCIQ extends AbstractBsTTrimallocschkriCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrimallocschkriCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrimallocschkriCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrimallocschkriCQ myCQ) {
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
    protected ConditionValue xgetCValueTrimallocschId() { return _myCQ.xdfgetTrimallocschId(); }
    public String keepTrimallocschId_ExistsReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepTrimallocschId_NotExistsReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepTrimallocschId_SpecifyDerivedReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepTrimallocschId_QueryDerivedReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTrimallocschId_QueryDerivedReferrer_TTrimallocadjustListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueTrimallocHId() { return _myCQ.xdfgetTrimallocHId(); }
    public String keepTrimallocHId_InScopeRelation_TTrimallocH(TTrimallocHCQ sq)
    { return _myCQ.keepTrimallocHId_InScopeRelation_TTrimallocH(sq); }
    public String keepTrimallocHId_NotInScopeRelation_TTrimallocH(TTrimallocHCQ sq)
    { return _myCQ.keepTrimallocHId_NotInScopeRelation_TTrimallocH(sq); }
    protected ConditionValue xgetCValueTrsodetailId() { return _myCQ.xdfgetTrsodetailId(); }
    public String keepTrsodetailId_InScopeRelation_TYtrsodetail(TYtrsodetailCQ sq)
    { return _myCQ.keepTrsodetailId_InScopeRelation_TYtrsodetail(sq); }
    public String keepTrsodetailId_NotInScopeRelation_TYtrsodetail(TYtrsodetailCQ sq)
    { return _myCQ.keepTrsodetailId_NotInScopeRelation_TYtrsodetail(sq); }
    protected ConditionValue xgetCValueAllocImpKey() { return _myCQ.xdfgetAllocImpKey(); }
    protected ConditionValue xgetCValueAlcImpResgNo() { return _myCQ.xdfgetAlcImpResgNo(); }
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    protected ConditionValue xgetCValueLocationCd() { return _myCQ.xdfgetLocationCd(); }
    protected ConditionValue xgetCValueExpectQty() { return _myCQ.xdfgetExpectQty(); }
    protected ConditionValue xgetCValueManufacturedate() { return _myCQ.xdfgetManufacturedate(); }
    protected ConditionValue xgetCValueDesignFlg() { return _myCQ.xdfgetDesignFlg(); }
    protected ConditionValue xgetCValueAlcimexpFlg() { return _myCQ.xdfgetAlcimexpFlg(); }
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
    public String keepScalarCondition(TTrimallocschkriCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrimallocschkriCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrimallocschkriCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrimallocschkriCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrimallocschkriCB.class.getName(); }
    protected String xinCQ() { return TTrimallocschkriCQ.class.getName(); }
}

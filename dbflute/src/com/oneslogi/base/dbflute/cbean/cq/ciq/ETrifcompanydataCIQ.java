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
 * The condition-query for in-line of E_TRIFCOMPANYDATA.
 * @author DBFlute(AutoGenerator)
 */
public class ETrifcompanydataCIQ extends AbstractBsETrifcompanydataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsETrifcompanydataCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ETrifcompanydataCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsETrifcompanydataCQ myCQ) {
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
    protected ConditionValue xgetCValueIfdatakey() { return _myCQ.xdfgetIfdatakey(); }
    protected ConditionValue xgetCValueSegname() { return _myCQ.xdfgetSegname(); }
    protected ConditionValue xgetCValueRefno() { return _myCQ.xdfgetRefno(); }
    protected ConditionValue xgetCValueCompanycd() { return _myCQ.xdfgetCompanycd(); }
    protected ConditionValue xgetCValueItemadmin() { return _myCQ.xdfgetItemadmin(); }
    protected ConditionValue xgetCValueCompanygroup() { return _myCQ.xdfgetCompanygroup(); }
    protected ConditionValue xgetCValueActflg() { return _myCQ.xdfgetActflg(); }
    protected ConditionValue xgetCValueName() { return _myCQ.xdfgetName(); }
    protected ConditionValue xgetCValueSname() { return _myCQ.xdfgetSname(); }
    protected ConditionValue xgetCValueAname() { return _myCQ.xdfgetAname(); }
    protected ConditionValue xgetCValueAddress1() { return _myCQ.xdfgetAddress1(); }
    protected ConditionValue xgetCValueAddress2() { return _myCQ.xdfgetAddress2(); }
    protected ConditionValue xgetCValueAddress3() { return _myCQ.xdfgetAddress3(); }
    protected ConditionValue xgetCValuePostno() { return _myCQ.xdfgetPostno(); }
    protected ConditionValue xgetCValueCountrycd() { return _myCQ.xdfgetCountrycd(); }
    protected ConditionValue xgetCValuePortcd() { return _myCQ.xdfgetPortcd(); }
    protected ConditionValue xgetCValueDistrictcd() { return _myCQ.xdfgetDistrictcd(); }
    protected ConditionValue xgetCValuePhone1() { return _myCQ.xdfgetPhone1(); }
    protected ConditionValue xgetCValuePhone2() { return _myCQ.xdfgetPhone2(); }
    protected ConditionValue xgetCValueFax1() { return _myCQ.xdfgetFax1(); }
    protected ConditionValue xgetCValueFax2() { return _myCQ.xdfgetFax2(); }
    protected ConditionValue xgetCValueRefname() { return _myCQ.xdfgetRefname(); }
    protected ConditionValue xgetCValueEmail() { return _myCQ.xdfgetEmail(); }
    protected ConditionValue xgetCValueUrl() { return _myCQ.xdfgetUrl(); }
    protected ConditionValue xgetCValueTypeowner() { return _myCQ.xdfgetTypeowner(); }
    protected ConditionValue xgetCValueTypecustomer() { return _myCQ.xdfgetTypecustomer(); }
    protected ConditionValue xgetCValueTypeshipto() { return _myCQ.xdfgetTypeshipto(); }
    protected ConditionValue xgetCValueTypesupplier() { return _myCQ.xdfgetTypesupplier(); }
    protected ConditionValue xgetCValueTypewarehouse() { return _myCQ.xdfgetTypewarehouse(); }
    protected ConditionValue xgetCValueTypecarrier() { return _myCQ.xdfgetTypecarrier(); }
    protected ConditionValue xgetCValueTypeetc() { return _myCQ.xdfgetTypeetc(); }
    protected ConditionValue xgetCValueOwnoranotherflg() { return _myCQ.xdfgetOwnoranotherflg(); }
    protected ConditionValue xgetCValueNotes() { return _myCQ.xdfgetNotes(); }
    protected ConditionValue xgetCValueFUser1() { return _myCQ.xdfgetFUser1(); }
    protected ConditionValue xgetCValueFUser2() { return _myCQ.xdfgetFUser2(); }
    protected ConditionValue xgetCValueFUser3() { return _myCQ.xdfgetFUser3(); }
    protected ConditionValue xgetCValueFUser4() { return _myCQ.xdfgetFUser4(); }
    protected ConditionValue xgetCValueFUser5() { return _myCQ.xdfgetFUser5(); }
    protected ConditionValue xgetCValueTransportpriority() { return _myCQ.xdfgetTransportpriority(); }
    protected ConditionValue xgetCValuePurchasetype() { return _myCQ.xdfgetPurchasetype(); }
    protected ConditionValue xgetCValueCalendarcd() { return _myCQ.xdfgetCalendarcd(); }
    protected ConditionValue xgetCValueOwnercustomercd() { return _myCQ.xdfgetOwnercustomercd(); }
    protected ConditionValue xgetCValueOwnersuppliercd() { return _myCQ.xdfgetOwnersuppliercd(); }
    protected ConditionValue xgetCValueOwnerrefflg() { return _myCQ.xdfgetOwnerrefflg(); }
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
    public String keepScalarCondition(ETrifcompanydataCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(ETrifcompanydataCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(ETrifcompanydataCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(ETrifcompanydataCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ETrifcompanydataCB.class.getName(); }
    protected String xinCQ() { return ETrifcompanydataCQ.class.getName(); }
}

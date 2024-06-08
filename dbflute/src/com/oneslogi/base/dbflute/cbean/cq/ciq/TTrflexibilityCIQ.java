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
 * The condition-query for in-line of T_TRFLEXIBILITY.
 * @author DBFlute(AutoGenerator)
 */
public class TTrflexibilityCIQ extends AbstractBsTTrflexibilityCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrflexibilityCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrflexibilityCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrflexibilityCQ myCQ) {
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
    protected ConditionValue xgetCValueFlexibleTransportInfoId() { return _myCQ.xdfgetFlexibleTransportInfoId(); }
    public String keepFlexibleTransportInfoId_ExistsReferrer_TTrflexibilitydetailList(TTrflexibilitydetailCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepFlexibleTransportInfoId_NotExistsReferrer_TTrflexibilitydetailList(TTrflexibilitydetailCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepFlexibleTransportInfoId_SpecifyDerivedReferrer_TTrflexibilitydetailList(TTrflexibilitydetailCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepFlexibleTransportInfoId_QueryDerivedReferrer_TTrflexibilitydetailList(TTrflexibilitydetailCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepFlexibleTransportInfoId_QueryDerivedReferrer_TTrflexibilitydetailListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueSuppliercd() { return _myCQ.xdfgetSuppliercd(); }
    protected ConditionValue xgetCValueShipcd() { return _myCQ.xdfgetShipcd(); }
    protected ConditionValue xgetCValueSchdate() { return _myCQ.xdfgetSchdate(); }
    protected ConditionValue xgetCValueFlexibityno() { return _myCQ.xdfgetFlexibityno(); }
    protected ConditionValue xgetCValueTransportcd() { return _myCQ.xdfgetTransportcd(); }
    protected ConditionValue xgetCValueRcvdate() { return _myCQ.xdfgetRcvdate(); }
    protected ConditionValue xgetCValueSts() { return _myCQ.xdfgetSts(); }
    protected ConditionValue xgetCValueInstractdatetime() { return _myCQ.xdfgetInstractdatetime(); }
    protected ConditionValue xgetCValueVaExtdata1() { return _myCQ.xdfgetVaExtdata1(); }
    protected ConditionValue xgetCValueNmExtdata1() { return _myCQ.xdfgetNmExtdata1(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
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
    public String keepScalarCondition(TTrflexibilityCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrflexibilityCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrflexibilityCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrflexibilityCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrflexibilityCB.class.getName(); }
    protected String xinCQ() { return TTrflexibilityCQ.class.getName(); }
}

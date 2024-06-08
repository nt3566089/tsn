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
 * The condition-query for in-line of T_TRSOLIST.
 * @author DBFlute(AutoGenerator)
 */
public class TTrsolistCIQ extends AbstractBsTTrsolistCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrsolistCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrsolistCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrsolistCQ myCQ) {
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
    protected ConditionValue xgetCValueShippingListPrintId() { return _myCQ.xdfgetShippingListPrintId(); }
    protected ConditionValue xgetCValueTrsolistkey() { return _myCQ.xdfgetTrsolistkey(); }
    protected ConditionValue xgetCValueListkbn() { return _myCQ.xdfgetListkbn(); }
    protected ConditionValue xgetCValuePrintedflg() { return _myCQ.xdfgetPrintedflg(); }
    protected ConditionValue xgetCValueTrsoliststs() { return _myCQ.xdfgetTrsoliststs(); }
    protected ConditionValue xgetCValuePrintdatetime() { return _myCQ.xdfgetPrintdatetime(); }
    protected ConditionValue xgetCValueShipschdate() { return _myCQ.xdfgetShipschdate(); }
    protected ConditionValue xgetCValueWorkallocateid() { return _myCQ.xdfgetWorkallocateid(); }
    protected ConditionValue xgetCValueRmano() { return _myCQ.xdfgetRmano(); }
    protected ConditionValue xgetCValueOwnersono() { return _myCQ.xdfgetOwnersono(); }
    protected ConditionValue xgetCValueShiptocd() { return _myCQ.xdfgetShiptocd(); }
    protected ConditionValue xgetCValueItemcd() { return _myCQ.xdfgetItemcd(); }
    protected ConditionValue xgetCValueSoid() { return _myCQ.xdfgetSoid(); }
    protected ConditionValue xgetCValueSodetailid() { return _myCQ.xdfgetSodetailid(); }
    protected ConditionValue xgetCValueSopalletno() { return _myCQ.xdfgetSopalletno(); }
    protected ConditionValue xgetCValueFloor() { return _myCQ.xdfgetFloor(); }
    protected ConditionValue xgetCValuePickingInstId() { return _myCQ.xdfgetPickingInstId(); }
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
    public String keepScalarCondition(TTrsolistCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrsolistCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrsolistCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrsolistCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrsolistCB.class.getName(); }
    protected String xinCQ() { return TTrsolistCQ.class.getName(); }
}

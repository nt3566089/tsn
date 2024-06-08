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
 * The condition-query for in-line of T_TRFLEXIBILITYDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TTrflexibilitydetailCIQ extends AbstractBsTTrflexibilitydetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrflexibilitydetailCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrflexibilitydetailCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrflexibilitydetailCQ myCQ) {
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
    protected ConditionValue xgetCValueFlexibleTransportDetailInfoId() { return _myCQ.xdfgetFlexibleTransportDetailInfoId(); }
    protected ConditionValue xgetCValueFlexibleTransportInfoId() { return _myCQ.xdfgetFlexibleTransportInfoId(); }
    public String keepFlexibleTransportInfoId_InScopeRelation_TTrflexibility(TTrflexibilityCQ sq)
    { return _myCQ.keepFlexibleTransportInfoId_InScopeRelation_TTrflexibility(sq); }
    public String keepFlexibleTransportInfoId_NotInScopeRelation_TTrflexibility(TTrflexibilityCQ sq)
    { return _myCQ.keepFlexibleTransportInfoId_NotInScopeRelation_TTrflexibility(sq); }
    protected ConditionValue xgetCValueFlexibitylineno() { return _myCQ.xdfgetFlexibitylineno(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    protected ConditionValue xgetCValueStddifflg() { return _myCQ.xdfgetStddifflg(); }
    protected ConditionValue xgetCValueFlexpicklistno() { return _myCQ.xdfgetFlexpicklistno(); }
    protected ConditionValue xgetCValuePrintedflg() { return _myCQ.xdfgetPrintedflg(); }
    protected ConditionValue xgetCValueCompleteflg() { return _myCQ.xdfgetCompleteflg(); }
    protected ConditionValue xgetCValueManufacturedate() { return _myCQ.xdfgetManufacturedate(); }
    protected ConditionValue xgetCValueDesigncd() { return _myCQ.xdfgetDesigncd(); }
    protected ConditionValue xgetCValueQtycase() { return _myCQ.xdfgetQtycase(); }
    protected ConditionValue xgetCValueQtybowl() { return _myCQ.xdfgetQtybowl(); }
    protected ConditionValue xgetCValueHtqtycase() { return _myCQ.xdfgetHtqtycase(); }
    protected ConditionValue xgetCValueHtqtybowl() { return _myCQ.xdfgetHtqtybowl(); }
    protected ConditionValue xgetCValueNvExtdata1() { return _myCQ.xdfgetNvExtdata1(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    protected ConditionValue xgetCValueSoid() { return _myCQ.xdfgetSoid(); }
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
    public String keepScalarCondition(TTrflexibilitydetailCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrflexibilitydetailCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrflexibilitydetailCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrflexibilitydetailCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrflexibilitydetailCB.class.getName(); }
    protected String xinCQ() { return TTrflexibilitydetailCQ.class.getName(); }
}

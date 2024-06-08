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
 * The condition-query for in-line of W_WKRCVREVERSE.
 * @author DBFlute(AutoGenerator)
 */
public class WWkrcvreverseCIQ extends AbstractBsWWkrcvreverseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWWkrcvreverseCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WWkrcvreverseCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWWkrcvreverseCQ myCQ) {
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
    protected ConditionValue xgetCValuePrintkey() { return _myCQ.xdfgetPrintkey(); }
    protected ConditionValue xgetCValueRcvreverseno() { return _myCQ.xdfgetRcvreverseno(); }
    protected ConditionValue xgetCValueRcvreverselineno() { return _myCQ.xdfgetRcvreverselineno(); }
    protected ConditionValue xgetCValueWarehousecd() { return _myCQ.xdfgetWarehousecd(); }
    protected ConditionValue xgetCValueWarehousename() { return _myCQ.xdfgetWarehousename(); }
    protected ConditionValue xgetCValueTransportno() { return _myCQ.xdfgetTransportno(); }
    protected ConditionValue xgetCValueRcvschdate() { return _myCQ.xdfgetRcvschdate(); }
    protected ConditionValue xgetCValueSuppliercd() { return _myCQ.xdfgetSuppliercd(); }
    protected ConditionValue xgetCValueSuppliername() { return _myCQ.xdfgetSuppliername(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueItemname() { return _myCQ.xdfgetItemname(); }
    protected ConditionValue xgetCValueRcvlimitdate() { return _myCQ.xdfgetRcvlimitdate(); }
    protected ConditionValue xgetCValueRcvdesigncd() { return _myCQ.xdfgetRcvdesigncd(); }
    protected ConditionValue xgetCValueRcvqty() { return _myCQ.xdfgetRcvqty(); }
    protected ConditionValue xgetCValueWorkdatetime() { return _myCQ.xdfgetWorkdatetime(); }
    protected ConditionValue xgetCValueLoc() { return _myCQ.xdfgetLoc(); }
    protected ConditionValue xgetCValueLoccd() { return _myCQ.xdfgetLoccd(); }
    protected ConditionValue xgetCValueLimitday() { return _myCQ.xdfgetLimitday(); }
    protected ConditionValue xgetCValueDesigncd() { return _myCQ.xdfgetDesigncd(); }
    protected ConditionValue xgetCValueQtycase() { return _myCQ.xdfgetQtycase(); }
    protected ConditionValue xgetCValueQtybowl() { return _myCQ.xdfgetQtybowl(); }
    protected ConditionValue xgetCValueFlg() { return _myCQ.xdfgetFlg(); }
    protected ConditionValue xgetCValueInsideOutsideKbn() { return _myCQ.xdfgetInsideOutsideKbn(); }
    protected ConditionValue xgetCValueItemOrderby() { return _myCQ.xdfgetItemOrderby(); }
    protected ConditionValue xgetCValuePrintpageno() { return _myCQ.xdfgetPrintpageno(); }
    protected ConditionValue xgetCValueSeqsortkey() { return _myCQ.xdfgetSeqsortkey(); }
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
    public String keepScalarCondition(WWkrcvreverseCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WWkrcvreverseCB.class.getName(); }
    protected String xinCQ() { return WWkrcvreverseCQ.class.getName(); }
}

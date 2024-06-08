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
 * The condition-query for in-line of W_WKRECEIVEPLAN.
 * @author DBFlute(AutoGenerator)
 */
public class WWkreceiveplanCIQ extends AbstractBsWWkreceiveplanCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWWkreceiveplanCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WWkreceiveplanCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWWkreceiveplanCQ myCQ) {
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
    protected ConditionValue xgetCValueWWkreceiveplanId() { return _myCQ.xdfgetWWkreceiveplanId(); }
    protected ConditionValue xgetCValuePrintkey() { return _myCQ.xdfgetPrintkey(); }
    protected ConditionValue xgetCValueLineNo() { return _myCQ.xdfgetLineNo(); }
    protected ConditionValue xgetCValueReceivePlanHId() { return _myCQ.xdfgetReceivePlanHId(); }
    protected ConditionValue xgetCValueRcvlineno() { return _myCQ.xdfgetRcvlineno(); }
    protected ConditionValue xgetCValueWarehousecd() { return _myCQ.xdfgetWarehousecd(); }
    protected ConditionValue xgetCValueWarehouseSname() { return _myCQ.xdfgetWarehouseSname(); }
    protected ConditionValue xgetCValueSlotlocname() { return _myCQ.xdfgetSlotlocname(); }
    protected ConditionValue xgetCValueRcvschdate() { return _myCQ.xdfgetRcvschdate(); }
    protected ConditionValue xgetCValueReceiveLot4() { return _myCQ.xdfgetReceiveLot4(); }
    protected ConditionValue xgetCValueReceiveLot3() { return _myCQ.xdfgetReceiveLot3(); }
    protected ConditionValue xgetCValueLocationCd() { return _myCQ.xdfgetLocationCd(); }
    protected ConditionValue xgetCValueCaseqtyCapacity() { return _myCQ.xdfgetCaseqtyCapacity(); }
    protected ConditionValue xgetCValueFloor() { return _myCQ.xdfgetFloor(); }
    protected ConditionValue xgetCValueFromfax() { return _myCQ.xdfgetFromfax(); }
    protected ConditionValue xgetCValueFromphone() { return _myCQ.xdfgetFromphone(); }
    protected ConditionValue xgetCValueSupplierrcvno() { return _myCQ.xdfgetSupplierrcvno(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueItemname() { return _myCQ.xdfgetItemname(); }
    protected ConditionValue xgetCValueZone() { return _myCQ.xdfgetZone(); }
    protected ConditionValue xgetCValueExpectqty() { return _myCQ.xdfgetExpectqty(); }
    protected ConditionValue xgetCValueRcvpal() { return _myCQ.xdfgetRcvpal(); }
    protected ConditionValue xgetCValueRcvcase() { return _myCQ.xdfgetRcvcase(); }
    protected ConditionValue xgetCValueLot1() { return _myCQ.xdfgetLot1(); }
    protected ConditionValue xgetCValueLot4() { return _myCQ.xdfgetLot4(); }
    protected ConditionValue xgetCValueLot3() { return _myCQ.xdfgetLot3(); }
    protected ConditionValue xgetCValueQtycase() { return _myCQ.xdfgetQtycase(); }
    protected ConditionValue xgetCValueQtybowl() { return _myCQ.xdfgetQtybowl(); }
    protected ConditionValue xgetCValueQtypal() { return _myCQ.xdfgetQtypal(); }
    protected ConditionValue xgetCValueInoutkbn() { return _myCQ.xdfgetInoutkbn(); }
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
    public String keepScalarCondition(WWkreceiveplanCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WWkreceiveplanCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WWkreceiveplanCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WWkreceiveplanCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WWkreceiveplanCB.class.getName(); }
    protected String xinCQ() { return WWkreceiveplanCQ.class.getName(); }
}

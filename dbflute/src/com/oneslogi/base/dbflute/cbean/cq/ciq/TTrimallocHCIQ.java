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
 * The condition-query for in-line of T_TRIMALLOC_H.
 * @author DBFlute(AutoGenerator)
 */
public class TTrimallocHCIQ extends AbstractBsTTrimallocHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrimallocHCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrimallocHCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrimallocHCQ myCQ) {
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
    protected ConditionValue xgetCValueTrimallocHId() { return _myCQ.xdfgetTrimallocHId(); }
    public String keepTrimallocHId_ExistsReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepTrimallocHId_NotExistsReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepTrimallocHId_SpecifyDerivedReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepTrimallocHId_QueryDerivedReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTrimallocHId_QueryDerivedReferrer_TTrimallocschkriListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueAllocImpKey() { return _myCQ.xdfgetAllocImpKey(); }
    protected ConditionValue xgetCValueWarehousecd() { return _myCQ.xdfgetWarehousecd(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueShipschDate() { return _myCQ.xdfgetShipschDate(); }
    protected ConditionValue xgetCValuePickBatchKey() { return _myCQ.xdfgetPickBatchKey(); }
    protected ConditionValue xgetCValueRestockFlg() { return _myCQ.xdfgetRestockFlg(); }
    protected ConditionValue xgetCValuePriorities() { return _myCQ.xdfgetPriorities(); }
    protected ConditionValue xgetCValuePickadjustSts() { return _myCQ.xdfgetPickadjustSts(); }
    protected ConditionValue xgetCValueAlcimrsnFlg() { return _myCQ.xdfgetAlcimrsnFlg(); }
    protected ConditionValue xgetCValueQtyAdjustFlg() { return _myCQ.xdfgetQtyAdjustFlg(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    protected ConditionValue xgetCValueRcvStkexaDate() { return _myCQ.xdfgetRcvStkexaDate(); }
    protected ConditionValue xgetCValueStockShortageQty() { return _myCQ.xdfgetStockShortageQty(); }
    protected ConditionValue xgetCValueStockSumQty() { return _myCQ.xdfgetStockSumQty(); }
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
    public String keepScalarCondition(TTrimallocHCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrimallocHCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrimallocHCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrimallocHCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrimallocHCB.class.getName(); }
    protected String xinCQ() { return TTrimallocHCQ.class.getName(); }
}

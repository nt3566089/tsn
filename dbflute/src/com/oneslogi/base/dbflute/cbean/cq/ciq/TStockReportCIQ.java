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
 * The condition-query for in-line of T_STOCK_REPORT.
 * @author DBFlute(AutoGenerator)
 */
public class TStockReportCIQ extends AbstractBsTStockReportCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTStockReportCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TStockReportCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTStockReportCQ myCQ) {
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
    protected ConditionValue xgetCValueStockId() { return _myCQ.xdfgetStockId(); }
    public String keepStockId_InScopeRelation_TStock(TStockCQ sq)
    { return _myCQ.keepStockId_InScopeRelation_TStock(sq); }
    public String keepStockId_NotInScopeRelation_TStock(TStockCQ sq)
    { return _myCQ.keepStockId_NotInScopeRelation_TStock(sq); }
    protected ConditionValue xgetCValueStoreNumDay() { return _myCQ.xdfgetStoreNumDay(); }
    protected ConditionValue xgetCValuePickingNumDay() { return _myCQ.xdfgetPickingNumDay(); }
    protected ConditionValue xgetCValueMovePlsNumDay() { return _myCQ.xdfgetMovePlsNumDay(); }
    protected ConditionValue xgetCValueMoveMnsNumDay() { return _myCQ.xdfgetMoveMnsNumDay(); }
    protected ConditionValue xgetCValueAdjPlsNumDay() { return _myCQ.xdfgetAdjPlsNumDay(); }
    protected ConditionValue xgetCValueAdjMnsNumDay() { return _myCQ.xdfgetAdjMnsNumDay(); }
    protected ConditionValue xgetCValuePChargeNumDay() { return _myCQ.xdfgetPChargeNumDay(); }
    protected ConditionValue xgetCValuePAllocNumDay() { return _myCQ.xdfgetPAllocNumDay(); }
    protected ConditionValue xgetCValuePMoveNumDay() { return _myCQ.xdfgetPMoveNumDay(); }
    protected ConditionValue xgetCValuePTransitNumDay() { return _myCQ.xdfgetPTransitNumDay(); }
    protected ConditionValue xgetCValueStoreNumMonth() { return _myCQ.xdfgetStoreNumMonth(); }
    protected ConditionValue xgetCValuePickingNumMonth() { return _myCQ.xdfgetPickingNumMonth(); }
    protected ConditionValue xgetCValueMovePlsNumMonth() { return _myCQ.xdfgetMovePlsNumMonth(); }
    protected ConditionValue xgetCValueMoveMnsNumMonth() { return _myCQ.xdfgetMoveMnsNumMonth(); }
    protected ConditionValue xgetCValueAdjPlsNumMonth() { return _myCQ.xdfgetAdjPlsNumMonth(); }
    protected ConditionValue xgetCValueAdjMnsNumMonth() { return _myCQ.xdfgetAdjMnsNumMonth(); }
    protected ConditionValue xgetCValuePChargeNumMonth() { return _myCQ.xdfgetPChargeNumMonth(); }
    protected ConditionValue xgetCValuePAllocNumMonth() { return _myCQ.xdfgetPAllocNumMonth(); }
    protected ConditionValue xgetCValuePMoveNumMonth() { return _myCQ.xdfgetPMoveNumMonth(); }
    protected ConditionValue xgetCValuePTransitNumMonth() { return _myCQ.xdfgetPTransitNumMonth(); }
    protected ConditionValue xgetCValueChargeNum10() { return _myCQ.xdfgetChargeNum10(); }
    protected ConditionValue xgetCValueAllocNum10() { return _myCQ.xdfgetAllocNum10(); }
    protected ConditionValue xgetCValueMoveNum10() { return _myCQ.xdfgetMoveNum10(); }
    protected ConditionValue xgetCValueTransitNum10() { return _myCQ.xdfgetTransitNum10(); }
    protected ConditionValue xgetCValueChargeNum15() { return _myCQ.xdfgetChargeNum15(); }
    protected ConditionValue xgetCValueAllocNum15() { return _myCQ.xdfgetAllocNum15(); }
    protected ConditionValue xgetCValueMoveNum15() { return _myCQ.xdfgetMoveNum15(); }
    protected ConditionValue xgetCValueTransitNum15() { return _myCQ.xdfgetTransitNum15(); }
    protected ConditionValue xgetCValueChargeNum20() { return _myCQ.xdfgetChargeNum20(); }
    protected ConditionValue xgetCValueAllocNum20() { return _myCQ.xdfgetAllocNum20(); }
    protected ConditionValue xgetCValueMoveNum20() { return _myCQ.xdfgetMoveNum20(); }
    protected ConditionValue xgetCValueTransitNum20() { return _myCQ.xdfgetTransitNum20(); }
    protected ConditionValue xgetCValueChargeNumLast() { return _myCQ.xdfgetChargeNumLast(); }
    protected ConditionValue xgetCValueAllocNumLast() { return _myCQ.xdfgetAllocNumLast(); }
    protected ConditionValue xgetCValueMoveNumLast() { return _myCQ.xdfgetMoveNumLast(); }
    protected ConditionValue xgetCValueTransitNumLast() { return _myCQ.xdfgetTransitNumLast(); }
    protected ConditionValue xgetCValueLastStoreDt() { return _myCQ.xdfgetLastStoreDt(); }
    protected ConditionValue xgetCValueLastPickingDt() { return _myCQ.xdfgetLastPickingDt(); }
    protected ConditionValue xgetCValueLastreceivedate() { return _myCQ.xdfgetLastreceivedate(); }
    protected ConditionValue xgetCValueLastshipdate() { return _myCQ.xdfgetLastshipdate(); }
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
    public String keepScalarCondition(TStockReportCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TStockReportCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TStockReportCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TStockReportCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TStockReportCB.class.getName(); }
    protected String xinCQ() { return TStockReportCQ.class.getName(); }
}

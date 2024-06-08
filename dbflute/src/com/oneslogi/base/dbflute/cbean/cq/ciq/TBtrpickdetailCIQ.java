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
 * The condition-query for in-line of T_BTRPICKDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TBtrpickdetailCIQ extends AbstractBsTBtrpickdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTBtrpickdetailCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TBtrpickdetailCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTBtrpickdetailCQ myCQ) {
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
    protected ConditionValue xgetCValuePickingInstDetailId() { return _myCQ.xdfgetPickingInstDetailId(); }
    protected ConditionValue xgetCValuePickingInstId() { return _myCQ.xdfgetPickingInstId(); }
    protected ConditionValue xgetCValuePickbatchlineno() { return _myCQ.xdfgetPickbatchlineno(); }
    protected ConditionValue xgetCValueSoid() { return _myCQ.xdfgetSoid(); }
    protected ConditionValue xgetCValueSodetailid() { return _myCQ.xdfgetSodetailid(); }
    protected ConditionValue xgetCValueSts() { return _myCQ.xdfgetSts(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    protected ConditionValue xgetCValueIfProductId() { return _myCQ.xdfgetIfProductId(); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    protected ConditionValue xgetCValueLocgroup() { return _myCQ.xdfgetLocgroup(); }
    protected ConditionValue xgetCValueLoctype() { return _myCQ.xdfgetLoctype(); }
    protected ConditionValue xgetCValuePicktype() { return _myCQ.xdfgetPicktype(); }
    protected ConditionValue xgetCValueAlloctype() { return _myCQ.xdfgetAlloctype(); }
    protected ConditionValue xgetCValueTagcd() { return _myCQ.xdfgetTagcd(); }
    protected ConditionValue xgetCValueActualtagcd() { return _myCQ.xdfgetActualtagcd(); }
    protected ConditionValue xgetCValueFromLocationId() { return _myCQ.xdfgetFromLocationId(); }
    protected ConditionValue xgetCValueFromtagcd() { return _myCQ.xdfgetFromtagcd(); }
    protected ConditionValue xgetCValueToLocationId() { return _myCQ.xdfgetToLocationId(); }
    protected ConditionValue xgetCValueTotagcd() { return _myCQ.xdfgetTotagcd(); }
    protected ConditionValue xgetCValueExpectqty1() { return _myCQ.xdfgetExpectqty1(); }
    protected ConditionValue xgetCValuePickedqty1() { return _myCQ.xdfgetPickedqty1(); }
    protected ConditionValue xgetCValuePallettype() { return _myCQ.xdfgetPallettype(); }
    protected ConditionValue xgetCValueSortedqty1() { return _myCQ.xdfgetSortedqty1(); }
    protected ConditionValue xgetCValueShippedqty1() { return _myCQ.xdfgetShippedqty1(); }
    protected ConditionValue xgetCValueRcvkey() { return _myCQ.xdfgetRcvkey(); }
    protected ConditionValue xgetCValueRcvlineno() { return _myCQ.xdfgetRcvlineno(); }
    protected ConditionValue xgetCValuePickusercd() { return _myCQ.xdfgetPickusercd(); }
    protected ConditionValue xgetCValueLotreserveflg() { return _myCQ.xdfgetLotreserveflg(); }
    protected ConditionValue xgetCValueLabelprintedflg() { return _myCQ.xdfgetLabelprintedflg(); }
    protected ConditionValue xgetCValueAllocstyletype() { return _myCQ.xdfgetAllocstyletype(); }
    protected ConditionValue xgetCValueFullpalletkey() { return _myCQ.xdfgetFullpalletkey(); }
    protected ConditionValue xgetCValuePickingunit() { return _myCQ.xdfgetPickingunit(); }
    protected ConditionValue xgetCValueWorkallocateid() { return _myCQ.xdfgetWorkallocateid(); }
    protected ConditionValue xgetCValueWorkallocatename() { return _myCQ.xdfgetWorkallocatename(); }
    protected ConditionValue xgetCValueAlertflg() { return _myCQ.xdfgetAlertflg(); }
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
    public String keepScalarCondition(TBtrpickdetailCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TBtrpickdetailCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TBtrpickdetailCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TBtrpickdetailCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TBtrpickdetailCB.class.getName(); }
    protected String xinCQ() { return TBtrpickdetailCQ.class.getName(); }
}

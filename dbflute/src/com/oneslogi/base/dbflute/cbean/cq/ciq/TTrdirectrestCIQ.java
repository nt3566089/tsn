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
 * The condition-query for in-line of T_TRDIRECTREST.
 * @author DBFlute(AutoGenerator)
 */
public class TTrdirectrestCIQ extends AbstractBsTTrdirectrestCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrdirectrestCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrdirectrestCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrdirectrestCQ myCQ) {
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
    protected ConditionValue xgetCValueWarehousecd() { return _myCQ.xdfgetWarehousecd(); }
    protected ConditionValue xgetCValueStockdate() { return _myCQ.xdfgetStockdate(); }
    protected ConditionValue xgetCValueRecno() { return _myCQ.xdfgetRecno(); }
    protected ConditionValue xgetCValueSotedunit() { return _myCQ.xdfgetSotedunit(); }
    protected ConditionValue xgetCValueZone() { return _myCQ.xdfgetZone(); }
    protected ConditionValue xgetCValueAssortedorder() { return _myCQ.xdfgetAssortedorder(); }
    protected ConditionValue xgetCValueSotedloc() { return _myCQ.xdfgetSotedloc(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueDeliverydate() { return _myCQ.xdfgetDeliverydate(); }
    protected ConditionValue xgetCValueDpwarehousecd() { return _myCQ.xdfgetDpwarehousecd(); }
    protected ConditionValue xgetCValueDirectioncd() { return _myCQ.xdfgetDirectioncd(); }
    protected ConditionValue xgetCValuePistontype() { return _myCQ.xdfgetPistontype(); }
    protected ConditionValue xgetCValueComt() { return _myCQ.xdfgetComt(); }
    protected ConditionValue xgetCValueSroprtcnt() { return _myCQ.xdfgetSroprtcnt(); }
    protected ConditionValue xgetCValueCsroprtcnt() { return _myCQ.xdfgetCsroprtcnt(); }
    protected ConditionValue xgetCValueCuttopdirassord() { return _myCQ.xdfgetCuttopdirassord(); }
    protected ConditionValue xgetCValueStockcasesu() { return _myCQ.xdfgetStockcasesu(); }
    protected ConditionValue xgetCValueStockcartonsu() { return _myCQ.xdfgetStockcartonsu(); }
    protected ConditionValue xgetCValueSellshopcnt() { return _myCQ.xdfgetSellshopcnt(); }
    protected ConditionValue xgetCValueLinecd() { return _myCQ.xdfgetLinecd(); }
    protected ConditionValue xgetCValueVaExtdata1() { return _myCQ.xdfgetVaExtdata1(); }
    protected ConditionValue xgetCValueVaExtdata2() { return _myCQ.xdfgetVaExtdata2(); }
    protected ConditionValue xgetCValueVaExtdata3() { return _myCQ.xdfgetVaExtdata3(); }
    protected ConditionValue xgetCValueNvExtdata1() { return _myCQ.xdfgetNvExtdata1(); }
    protected ConditionValue xgetCValueNvExtdata2() { return _myCQ.xdfgetNvExtdata2(); }
    protected ConditionValue xgetCValueNvExtdata3() { return _myCQ.xdfgetNvExtdata3(); }
    protected ConditionValue xgetCValueNmExtdata1() { return _myCQ.xdfgetNmExtdata1(); }
    protected ConditionValue xgetCValueNmExtdata2() { return _myCQ.xdfgetNmExtdata2(); }
    protected ConditionValue xgetCValueNmExtdata3() { return _myCQ.xdfgetNmExtdata3(); }
    protected ConditionValue xgetCValueDtExtdata1() { return _myCQ.xdfgetDtExtdata1(); }
    protected ConditionValue xgetCValueDtExtdata2() { return _myCQ.xdfgetDtExtdata2(); }
    protected ConditionValue xgetCValueDtExtdata3() { return _myCQ.xdfgetDtExtdata3(); }
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
    public String keepScalarCondition(TTrdirectrestCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrdirectrestCB.class.getName(); }
    protected String xinCQ() { return TTrdirectrestCQ.class.getName(); }
}

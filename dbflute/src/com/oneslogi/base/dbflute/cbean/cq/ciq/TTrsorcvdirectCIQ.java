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
 * The condition-query for in-line of T_TRSORCVDIRECT.
 * @author DBFlute(AutoGenerator)
 */
public class TTrsorcvdirectCIQ extends AbstractBsTTrsorcvdirectCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrsorcvdirectCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrsorcvdirectCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrsorcvdirectCQ myCQ) {
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
    protected ConditionValue xgetCValueSojtlineid() { return _myCQ.xdfgetSojtlineid(); }
    protected ConditionValue xgetCValueSorcvdirectkey() { return _myCQ.xdfgetSorcvdirectkey(); }
    protected ConditionValue xgetCValueInstructionsdate() { return _myCQ.xdfgetInstructionsdate(); }
    protected ConditionValue xgetCValueOwnerdirectno() { return _myCQ.xdfgetOwnerdirectno(); }
    protected ConditionValue xgetCValueSalestype() { return _myCQ.xdfgetSalestype(); }
    protected ConditionValue xgetCValueSalestypecd() { return _myCQ.xdfgetSalestypecd(); }
    protected ConditionValue xgetCValueShiptocode() { return _myCQ.xdfgetShiptocode(); }
    protected ConditionValue xgetCValueOriginalpono() { return _myCQ.xdfgetOriginalpono(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    protected ConditionValue xgetCValueExpectqty() { return _myCQ.xdfgetExpectqty(); }
    protected ConditionValue xgetCValuePlanprice() { return _myCQ.xdfgetPlanprice(); }
    protected ConditionValue xgetCValuePlanpricetotal() { return _myCQ.xdfgetPlanpricetotal(); }
    protected ConditionValue xgetCValuePlanname() { return _myCQ.xdfgetPlanname(); }
    protected ConditionValue xgetCValuePlanpost() { return _myCQ.xdfgetPlanpost(); }
    protected ConditionValue xgetCValuePlanaddress1() { return _myCQ.xdfgetPlanaddress1(); }
    protected ConditionValue xgetCValuePlanaddress2() { return _myCQ.xdfgetPlanaddress2(); }
    protected ConditionValue xgetCValuePlanitemname() { return _myCQ.xdfgetPlanitemname(); }
    protected ConditionValue xgetCValueWarehouseplant() { return _myCQ.xdfgetWarehouseplant(); }
    protected ConditionValue xgetCValueWarehouseplantname() { return _myCQ.xdfgetWarehouseplantname(); }
    protected ConditionValue xgetCValueWarehousename() { return _myCQ.xdfgetWarehousename(); }
    protected ConditionValue xgetCValueOrderdate() { return _myCQ.xdfgetOrderdate(); }
    protected ConditionValue xgetCValueDeliverydate() { return _myCQ.xdfgetDeliverydate(); }
    protected ConditionValue xgetCValuePurchasenumber() { return _myCQ.xdfgetPurchasenumber(); }
    protected ConditionValue xgetCValueOrdernumber() { return _myCQ.xdfgetOrdernumber(); }
    protected ConditionValue xgetCValueItemlineno() { return _myCQ.xdfgetItemlineno(); }
    protected ConditionValue xgetCValueSkucode() { return _myCQ.xdfgetSkucode(); }
    protected ConditionValue xgetCValueCardboard() { return _myCQ.xdfgetCardboard(); }
    protected ConditionValue xgetCValueCarton() { return _myCQ.xdfgetCarton(); }
    protected ConditionValue xgetCValueTotalexpectqty() { return _myCQ.xdfgetTotalexpectqty(); }
    protected ConditionValue xgetCValueTotalcardboardqty() { return _myCQ.xdfgetTotalcardboardqty(); }
    protected ConditionValue xgetCValueTotalcartonqty() { return _myCQ.xdfgetTotalcartonqty(); }
    protected ConditionValue xgetCValueNote() { return _myCQ.xdfgetNote(); }
    protected ConditionValue xgetCValueReserve2() { return _myCQ.xdfgetReserve2(); }
    protected ConditionValue xgetCValueReserve3() { return _myCQ.xdfgetReserve3(); }
    protected ConditionValue xgetCValueReserve() { return _myCQ.xdfgetReserve(); }
    protected ConditionValue xgetCValueCenterid() { return _myCQ.xdfgetCenterid(); }
    protected ConditionValue xgetCValueClientid() { return _myCQ.xdfgetClientid(); }
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
    public String keepScalarCondition(TTrsorcvdirectCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrsorcvdirectCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrsorcvdirectCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrsorcvdirectCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrsorcvdirectCB.class.getName(); }
    protected String xinCQ() { return TTrsorcvdirectCQ.class.getName(); }
}

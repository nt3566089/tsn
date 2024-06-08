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
 * The condition-query for in-line of W_WKPALLETSOALLOC.
 * @author DBFlute(AutoGenerator)
 */
public class WWkpalletsoallocCIQ extends AbstractBsWWkpalletsoallocCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWWkpalletsoallocCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WWkpalletsoallocCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWWkpalletsoallocCQ myCQ) {
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
    protected ConditionValue xgetCValueWkpalletsoallocId() { return _myCQ.xdfgetWkpalletsoallocId(); }
    protected ConditionValue xgetCValueTrpalletId() { return _myCQ.xdfgetTrpalletId(); }
    protected ConditionValue xgetCValuePalletno() { return _myCQ.xdfgetPalletno(); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    protected ConditionValue xgetCValueReceivePlanHId() { return _myCQ.xdfgetReceivePlanHId(); }
    protected ConditionValue xgetCValueRcvlineno() { return _myCQ.xdfgetRcvlineno(); }
    protected ConditionValue xgetCValuePrintedflg() { return _myCQ.xdfgetPrintedflg(); }
    protected ConditionValue xgetCValuePrintingdate() { return _myCQ.xdfgetPrintingdate(); }
    protected ConditionValue xgetCValueFirmcarryno() { return _myCQ.xdfgetFirmcarryno(); }
    protected ConditionValue xgetCValueTransportno() { return _myCQ.xdfgetTransportno(); }
    protected ConditionValue xgetCValueSourcecd() { return _myCQ.xdfgetSourcecd(); }
    protected ConditionValue xgetCValueSchdate() { return _myCQ.xdfgetSchdate(); }
    protected ConditionValue xgetCValueReceivecd() { return _myCQ.xdfgetReceivecd(); }
    protected ConditionValue xgetCValueRcvdate() { return _myCQ.xdfgetRcvdate(); }
    protected ConditionValue xgetCValueReceivedate() { return _myCQ.xdfgetReceivedate(); }
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueLot3() { return _myCQ.xdfgetLot3(); }
    protected ConditionValue xgetCValueLimitdate() { return _myCQ.xdfgetLimitdate(); }
    protected ConditionValue xgetCValueBatarticlesign() { return _myCQ.xdfgetBatarticlesign(); }
    protected ConditionValue xgetCValueOtherlot1() { return _myCQ.xdfgetOtherlot1(); }
    protected ConditionValue xgetCValueReceiveqtycase() { return _myCQ.xdfgetReceiveqtycase(); }
    protected ConditionValue xgetCValueReceiveqtybowl() { return _myCQ.xdfgetReceiveqtybowl(); }
    protected ConditionValue xgetCValueReceiveqty() { return _myCQ.xdfgetReceiveqty(); }
    protected ConditionValue xgetCValueRestqtycase() { return _myCQ.xdfgetRestqtycase(); }
    protected ConditionValue xgetCValueRestqtybowl() { return _myCQ.xdfgetRestqtybowl(); }
    protected ConditionValue xgetCValueRestqty() { return _myCQ.xdfgetRestqty(); }
    protected ConditionValue xgetCValueAllocqty1() { return _myCQ.xdfgetAllocqty1(); }
    protected ConditionValue xgetCValueTempallocqtycase() { return _myCQ.xdfgetTempallocqtycase(); }
    protected ConditionValue xgetCValueTempallocqtybowl() { return _myCQ.xdfgetTempallocqtybowl(); }
    protected ConditionValue xgetCValueFullpalletflg() { return _myCQ.xdfgetFullpalletflg(); }
    protected ConditionValue xgetCValuePalletsts() { return _myCQ.xdfgetPalletsts(); }
    protected ConditionValue xgetCValuePluralproductionkbn() { return _myCQ.xdfgetPluralproductionkbn(); }
    protected ConditionValue xgetCValuePalletcuttingkbn() { return _myCQ.xdfgetPalletcuttingkbn(); }
    protected ConditionValue xgetCValueRcvpalletno() { return _myCQ.xdfgetRcvpalletno(); }
    protected ConditionValue xgetCValuePalletaddflg() { return _myCQ.xdfgetPalletaddflg(); }
    protected ConditionValue xgetCValueAcceptusercd() { return _myCQ.xdfgetAcceptusercd(); }
    protected ConditionValue xgetCValueAcceptdate() { return _myCQ.xdfgetAcceptdate(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
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
    public String keepScalarCondition(WWkpalletsoallocCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WWkpalletsoallocCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WWkpalletsoallocCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WWkpalletsoallocCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WWkpalletsoallocCB.class.getName(); }
    protected String xinCQ() { return WWkpalletsoallocCQ.class.getName(); }
}

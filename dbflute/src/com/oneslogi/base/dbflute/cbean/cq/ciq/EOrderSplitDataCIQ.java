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
 * The condition-query for in-line of E_ORDER_SPLIT_DATA.
 * @author DBFlute(AutoGenerator)
 */
public class EOrderSplitDataCIQ extends AbstractBsEOrderSplitDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEOrderSplitDataCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EOrderSplitDataCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEOrderSplitDataCQ myCQ) {
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
    protected ConditionValue xgetCValueOrderSplitDataId() { return _myCQ.xdfgetOrderSplitDataId(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueSendRowId() { return _myCQ.xdfgetSendRowId(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
    protected ConditionValue xgetCValueRecFlg() { return _myCQ.xdfgetRecFlg(); }
    protected ConditionValue xgetCValueSrwhcd() { return _myCQ.xdfgetSrwhcd(); }
    protected ConditionValue xgetCValueDpcd() { return _myCQ.xdfgetDpcd(); }
    protected ConditionValue xgetCValueDed() { return _myCQ.xdfgetDed(); }
    protected ConditionValue xgetCValuePstnid() { return _myCQ.xdfgetPstnid(); }
    protected ConditionValue xgetCValueDlvrnk() { return _myCQ.xdfgetDlvrnk(); }
    protected ConditionValue xgetCValueDlvsnm() { return _myCQ.xdfgetDlvsnm(); }
    protected ConditionValue xgetCValueSroprtcnt() { return _myCQ.xdfgetSroprtcnt(); }
    protected ConditionValue xgetCValueSscd() { return _myCQ.xdfgetSscd(); }
    protected ConditionValue xgetCValueDlvymd() { return _myCQ.xdfgetDlvymd(); }
    protected ConditionValue xgetCValueZzordymd() { return _myCQ.xdfgetZzordymd(); }
    protected ConditionValue xgetCValueSlpmrgtmg() { return _myCQ.xdfgetSlpmrgtmg(); }
    protected ConditionValue xgetCValueOrdgr() { return _myCQ.xdfgetOrdgr(); }
    protected ConditionValue xgetCValueS() { return _myCQ.xdfgetS(); }
    protected ConditionValue xgetCValueH() { return _myCQ.xdfgetH(); }
    protected ConditionValue xgetCValueM() { return _myCQ.xdfgetM(); }
    protected ConditionValue xgetCValueSrymd() { return _myCQ.xdfgetSrymd(); }
    protected ConditionValue xgetCValueRlybscd() { return _myCQ.xdfgetRlybscd(); }
    protected ConditionValue xgetCValueKeepareah1() { return _myCQ.xdfgetKeepareah1(); }
    protected ConditionValue xgetCValueSlptyp() { return _myCQ.xdfgetSlptyp(); }
    protected ConditionValue xgetCValueCmpcd() { return _myCQ.xdfgetCmpcd(); }
    protected ConditionValue xgetCValueSlpno() { return _myCQ.xdfgetSlpno(); }
    protected ConditionValue xgetCValueSlediv() { return _myCQ.xdfgetSlediv(); }
    protected ConditionValue xgetCValueCngprtslpno() { return _myCQ.xdfgetCngprtslpno(); }
    protected ConditionValue xgetCValueSpplymd() { return _myCQ.xdfgetSpplymd(); }
    protected ConditionValue xgetCValueCggdid() { return _myCQ.xdfgetCggdid(); }
    protected ConditionValue xgetCValueKeepareah2() { return _myCQ.xdfgetKeepareah2(); }
    protected ConditionValue xgetCValueZzmatnr() { return _myCQ.xdfgetZzmatnr(); }
    protected ConditionValue xgetCValueBoxno() { return _myCQ.xdfgetBoxno(); }
    protected ConditionValue xgetCValueBoxtype() { return _myCQ.xdfgetBoxtype(); }
    protected ConditionValue xgetCValueZzmatnrtotal() { return _myCQ.xdfgetZzmatnrtotal(); }
    protected ConditionValue xgetCValueBoxnocnsnm() { return _myCQ.xdfgetBoxnocnsnm(); }
    protected ConditionValue xgetCValueBxoszl() { return _myCQ.xdfgetBxoszl(); }
    protected ConditionValue xgetCValueBxoszh() { return _myCQ.xdfgetBxoszh(); }
    protected ConditionValue xgetCValueBxoszw() { return _myCQ.xdfgetBxoszw(); }
    protected ConditionValue xgetCValueBoxtotalweigh() { return _myCQ.xdfgetBoxtotalweigh(); }
    protected ConditionValue xgetCValueWeightype() { return _myCQ.xdfgetWeightype(); }
    protected ConditionValue xgetCValueBoxtotalnumber() { return _myCQ.xdfgetBoxtotalnumber(); }
    protected ConditionValue xgetCValueKeepaream1() { return _myCQ.xdfgetKeepaream1(); }
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
    public String keepScalarCondition(EOrderSplitDataCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EOrderSplitDataCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EOrderSplitDataCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EOrderSplitDataCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EOrderSplitDataCB.class.getName(); }
    protected String xinCQ() { return EOrderSplitDataCQ.class.getName(); }
}

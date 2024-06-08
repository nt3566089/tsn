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
 * The condition-query for in-line of E_SHIPPING_PLAN_BULK_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public class EShippingPlanBulkInputCIQ extends AbstractBsEShippingPlanBulkInputCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEShippingPlanBulkInputCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EShippingPlanBulkInputCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEShippingPlanBulkInputCQ myCQ) {
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
    protected ConditionValue xgetCValueBondedShippingPlanBulkInputId() { return _myCQ.xdfgetBondedShippingPlanBulkInputId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueHedderFlg() { return _myCQ.xdfgetHedderFlg(); }
    protected ConditionValue xgetCValueZzorgncd() { return _myCQ.xdfgetZzorgncd(); }
    protected ConditionValue xgetCValueDpcd() { return _myCQ.xdfgetDpcd(); }
    protected ConditionValue xgetCValueOrdgr() { return _myCQ.xdfgetOrdgr(); }
    protected ConditionValue xgetCValueRmano() { return _myCQ.xdfgetRmano(); }
    protected ConditionValue xgetCValueSscd() { return _myCQ.xdfgetSscd(); }
    protected ConditionValue xgetCValueSlptyp() { return _myCQ.xdfgetSlptyp(); }
    protected ConditionValue xgetCValueSlpno() { return _myCQ.xdfgetSlpno(); }
    protected ConditionValue xgetCValueSeqno() { return _myCQ.xdfgetSeqno(); }
    protected ConditionValue xgetCValueZzordymd() { return _myCQ.xdfgetZzordymd(); }
    protected ConditionValue xgetCValueZzwaymd1() { return _myCQ.xdfgetZzwaymd1(); }
    protected ConditionValue xgetCValueOtorgcd() { return _myCQ.xdfgetOtorgcd(); }
    protected ConditionValue xgetCValueOrdorgcd() { return _myCQ.xdfgetOrdorgcd(); }
    protected ConditionValue xgetCValueRlybscd() { return _myCQ.xdfgetRlybscd(); }
    protected ConditionValue xgetCValueDed() { return _myCQ.xdfgetDed(); }
    protected ConditionValue xgetCValuePstnid() { return _myCQ.xdfgetPstnid(); }
    protected ConditionValue xgetCValueDlvrnk() { return _myCQ.xdfgetDlvrnk(); }
    protected ConditionValue xgetCValueLmpdlvno() { return _myCQ.xdfgetLmpdlvno(); }
    protected ConditionValue xgetCValueDivmtd() { return _myCQ.xdfgetDivmtd(); }
    protected ConditionValue xgetCValueHdvid() { return _myCQ.xdfgetHdvid(); }
    protected ConditionValue xgetCValueName1() { return _myCQ.xdfgetName1(); }
    protected ConditionValue xgetCValueZregprca() { return _myCQ.xdfgetZregprca(); }
    protected ConditionValue xgetCValueZregprcc() { return _myCQ.xdfgetZregprcc(); }
    protected ConditionValue xgetCValueZzsaltax() { return _myCQ.xdfgetZzsaltax(); }
    protected ConditionValue xgetCValueZzgodfpc() { return _myCQ.xdfgetZzgodfpc(); }
    protected ConditionValue xgetCValueZzgodspc() { return _myCQ.xdfgetZzgodspc(); }
    protected ConditionValue xgetCValueZzgodctx() { return _myCQ.xdfgetZzgodctx(); }
    protected ConditionValue xgetCValueLogisticscd() { return _myCQ.xdfgetLogisticscd(); }
    protected ConditionValue xgetCValueSlediv() { return _myCQ.xdfgetSlediv(); }
    protected ConditionValue xgetCValueHvrtrsn() { return _myCQ.xdfgetHvrtrsn(); }
    protected ConditionValue xgetCValueZzvbelnb() { return _myCQ.xdfgetZzvbelnb(); }
    protected ConditionValue xgetCValueCngprtslpno() { return _myCQ.xdfgetCngprtslpno(); }
    protected ConditionValue xgetCValueTrnsctndiv() { return _myCQ.xdfgetTrnsctndiv(); }
    protected ConditionValue xgetCValueEosordaftflg() { return _myCQ.xdfgetEosordaftflg(); }
    protected ConditionValue xgetCValueEosslpno() { return _myCQ.xdfgetEosslpno(); }
    protected ConditionValue xgetCValueHdrdbxdiv() { return _myCQ.xdfgetHdrdbxdiv(); }
    protected ConditionValue xgetCValueInotrfsldiv() { return _myCQ.xdfgetInotrfsldiv(); }
    protected ConditionValue xgetCValueBxmntrfsldiv() { return _myCQ.xdfgetBxmntrfsldiv(); }
    protected ConditionValue xgetCValueSlpmrgtmg() { return _myCQ.xdfgetSlpmrgtmg(); }
    protected ConditionValue xgetCValueZzblotdt() { return _myCQ.xdfgetZzblotdt(); }
    protected ConditionValue xgetCValueCggdid() { return _myCQ.xdfgetCggdid(); }
    protected ConditionValue xgetCValueMatnr() { return _myCQ.xdfgetMatnr(); }
    protected ConditionValue xgetCValueKwmeng() { return _myCQ.xdfgetKwmeng(); }
    protected ConditionValue xgetCValueMvgr1() { return _myCQ.xdfgetMvgr1(); }
    protected ConditionValue xgetCValueMvgr4() { return _myCQ.xdfgetMvgr4(); }
    protected ConditionValue xgetCValueKzwi3() { return _myCQ.xdfgetKzwi3(); }
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
    public String keepScalarCondition(EShippingPlanBulkInputCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EShippingPlanBulkInputCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EShippingPlanBulkInputCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EShippingPlanBulkInputCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EShippingPlanBulkInputCB.class.getName(); }
    protected String xinCQ() { return EShippingPlanBulkInputCQ.class.getName(); }
}

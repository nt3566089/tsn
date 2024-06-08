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
 * The condition-query for in-line of T_TREXAMRESULT.
 * @author DBFlute(AutoGenerator)
 */
public class TTrexamresultCIQ extends AbstractBsTTrexamresultCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrexamresultCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrexamresultCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrexamresultCQ myCQ) {
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
    protected ConditionValue xgetCValueTrexamresultId() { return _myCQ.xdfgetTrexamresultId(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    protected ConditionValue xgetCValueSupplierrcvno() { return _myCQ.xdfgetSupplierrcvno(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueLot1() { return _myCQ.xdfgetLot1(); }
    protected ConditionValue xgetCValueLot2() { return _myCQ.xdfgetLot2(); }
    protected ConditionValue xgetCValueLot3() { return _myCQ.xdfgetLot3(); }
    protected ConditionValue xgetCValueLot4() { return _myCQ.xdfgetLot4(); }
    protected ConditionValue xgetCValueLot5() { return _myCQ.xdfgetLot5(); }
    protected ConditionValue xgetCValueOtherlot2() { return _myCQ.xdfgetOtherlot2(); }
    protected ConditionValue xgetCValueOtherlot3() { return _myCQ.xdfgetOtherlot3(); }
    protected ConditionValue xgetCValueOtherlot4() { return _myCQ.xdfgetOtherlot4(); }
    protected ConditionValue xgetCValueOtherlot5() { return _myCQ.xdfgetOtherlot5(); }
    protected ConditionValue xgetCValueDamageflg() { return _myCQ.xdfgetDamageflg(); }
    protected ConditionValue xgetCValueNoshippingflg() { return _myCQ.xdfgetNoshippingflg(); }
    protected ConditionValue xgetCValueForeigncargoflg() { return _myCQ.xdfgetForeigncargoflg(); }
    protected ConditionValue xgetCValueCustomsreleaseflg() { return _myCQ.xdfgetCustomsreleaseflg(); }
    protected ConditionValue xgetCValueTaxflg() { return _myCQ.xdfgetTaxflg(); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    protected ConditionValue xgetCValueExamsts() { return _myCQ.xdfgetExamsts(); }
    protected ConditionValue xgetCValueExamendsts() { return _myCQ.xdfgetExamendsts(); }
    protected ConditionValue xgetCValueAddflg() { return _myCQ.xdfgetAddflg(); }
    protected ConditionValue xgetCValueReceivedate() { return _myCQ.xdfgetReceivedate(); }
    protected ConditionValue xgetCValueSendflg() { return _myCQ.xdfgetSendflg(); }
    protected ConditionValue xgetCValueExamqty() { return _myCQ.xdfgetExamqty(); }
    protected ConditionValue xgetCValueRes40qty() { return _myCQ.xdfgetRes40qty(); }
    protected ConditionValue xgetCValueInferiorqty() { return _myCQ.xdfgetInferiorqty(); }
    protected ConditionValue xgetCValueNotexamqty() { return _myCQ.xdfgetNotexamqty(); }
    protected ConditionValue xgetCValueFirstexamsendflg() { return _myCQ.xdfgetFirstexamsendflg(); }
    protected ConditionValue xgetCValueQualityexamflg() { return _myCQ.xdfgetQualityexamflg(); }
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
    public String keepScalarCondition(TTrexamresultCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrexamresultCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrexamresultCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrexamresultCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrexamresultCB.class.getName(); }
    protected String xinCQ() { return TTrexamresultCQ.class.getName(); }
}

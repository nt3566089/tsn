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
 * The condition-query for in-line of T_TRINVREANSWER.
 * @author DBFlute(AutoGenerator)
 */
public class TTrinvreanswerCIQ extends AbstractBsTTrinvreanswerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrinvreanswerCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrinvreanswerCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrinvreanswerCQ myCQ) {
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
    protected ConditionValue xgetCValueTrinvreanswerId() { return _myCQ.xdfgetTrinvreanswerId(); }
    protected ConditionValue xgetCValueInvinqkey() { return _myCQ.xdfgetInvinqkey(); }
    protected ConditionValue xgetCValueAnswerlineno() { return _myCQ.xdfgetAnswerlineno(); }
    protected ConditionValue xgetCValueInvinqno() { return _myCQ.xdfgetInvinqno(); }
    protected ConditionValue xgetCValueInvinqdate() { return _myCQ.xdfgetInvinqdate(); }
    protected ConditionValue xgetCValueCompanycd() { return _myCQ.xdfgetCompanycd(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueManufacturdate() { return _myCQ.xdfgetManufacturdate(); }
    protected ConditionValue xgetCValueDesigncd() { return _myCQ.xdfgetDesigncd(); }
    protected ConditionValue xgetCValueStockkbn() { return _myCQ.xdfgetStockkbn(); }
    protected ConditionValue xgetCValueStockqty() { return _myCQ.xdfgetStockqty(); }
    protected ConditionValue xgetCValueTransportcd() { return _myCQ.xdfgetTransportcd(); }
    protected ConditionValue xgetCValueFirmcarryno() { return _myCQ.xdfgetFirmcarryno(); }
    protected ConditionValue xgetCValueShipcd() { return _myCQ.xdfgetShipcd(); }
    protected ConditionValue xgetCValueShipschdate() { return _myCQ.xdfgetShipschdate(); }
    protected ConditionValue xgetCValueReceivedate() { return _myCQ.xdfgetReceivedate(); }
    protected ConditionValue xgetCValueRcvschdate() { return _myCQ.xdfgetRcvschdate(); }
    protected ConditionValue xgetCValueExpectqty() { return _myCQ.xdfgetExpectqty(); }
    protected ConditionValue xgetCValueGetdate() { return _myCQ.xdfgetGetdate(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
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
    public String keepScalarCondition(TTrinvreanswerCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrinvreanswerCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrinvreanswerCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrinvreanswerCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrinvreanswerCB.class.getName(); }
    protected String xinCQ() { return TTrinvreanswerCQ.class.getName(); }
}

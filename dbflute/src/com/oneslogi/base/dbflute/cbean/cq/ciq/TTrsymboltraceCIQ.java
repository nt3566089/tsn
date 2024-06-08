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
 * The condition-query for in-line of T_TRSYMBOLTRACE.
 * @author DBFlute(AutoGenerator)
 */
public class TTrsymboltraceCIQ extends AbstractBsTTrsymboltraceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrsymboltraceCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrsymboltraceCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrsymboltraceCQ myCQ) {
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
    protected ConditionValue xgetCValueTrsymboltraceId() { return _myCQ.xdfgetTrsymboltraceId(); }
    protected ConditionValue xgetCValueSymboltracekey() { return _myCQ.xdfgetSymboltracekey(); }
    protected ConditionValue xgetCValueTrsymbolId() { return _myCQ.xdfgetTrsymbolId(); }
    protected ConditionValue xgetCValueCreatedatetime() { return _myCQ.xdfgetCreatedatetime(); }
    protected ConditionValue xgetCValueWarehousecd() { return _myCQ.xdfgetWarehousecd(); }
    protected ConditionValue xgetCValueTracetype() { return _myCQ.xdfgetTracetype(); }
    protected ConditionValue xgetCValueInitnum() { return _myCQ.xdfgetInitnum(); }
    protected ConditionValue xgetCValueCaseinnum() { return _myCQ.xdfgetCaseinnum(); }
    protected ConditionValue xgetCValueAssortnum() { return _myCQ.xdfgetAssortnum(); }
    protected ConditionValue xgetCValueDirectionnum() { return _myCQ.xdfgetDirectionnum(); }
    protected ConditionValue xgetCValueCustomercd() { return _myCQ.xdfgetCustomercd(); }
    protected ConditionValue xgetCValueDistwarehousecd() { return _myCQ.xdfgetDistwarehousecd(); }
    protected ConditionValue xgetCValueMixedflg() { return _myCQ.xdfgetMixedflg(); }
    protected ConditionValue xgetCValueLoccd() { return _myCQ.xdfgetLoccd(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueLot1() { return _myCQ.xdfgetLot1(); }
    protected ConditionValue xgetCValueLot2() { return _myCQ.xdfgetLot2(); }
    protected ConditionValue xgetCValueLot3() { return _myCQ.xdfgetLot3(); }
    protected ConditionValue xgetCValueLot4() { return _myCQ.xdfgetLot4(); }
    protected ConditionValue xgetCValueOtherlot1() { return _myCQ.xdfgetOtherlot1(); }
    protected ConditionValue xgetCValueNoshippingflg() { return _myCQ.xdfgetNoshippingflg(); }
    protected ConditionValue xgetCValueIfitemcd() { return _myCQ.xdfgetIfitemcd(); }
    protected ConditionValue xgetCValueSendflg() { return _myCQ.xdfgetSendflg(); }
    protected ConditionValue xgetCValueRcvkey() { return _myCQ.xdfgetRcvkey(); }
    protected ConditionValue xgetCValuePalletno() { return _myCQ.xdfgetPalletno(); }
    protected ConditionValue xgetCValueSokey() { return _myCQ.xdfgetSokey(); }
    protected ConditionValue xgetCValueFax1() { return _myCQ.xdfgetFax1(); }
    protected ConditionValue xgetCValueOriginalpono() { return _myCQ.xdfgetOriginalpono(); }
    protected ConditionValue xgetCValueMosjtsendflg() { return _myCQ.xdfgetMosjtsendflg(); }
    protected ConditionValue xgetCValueShipdate() { return _myCQ.xdfgetShipdate(); }
    protected ConditionValue xgetCValueDelivname() { return _myCQ.xdfgetDelivname(); }
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
    public String keepScalarCondition(TTrsymboltraceCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrsymboltraceCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrsymboltraceCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrsymboltraceCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrsymboltraceCB.class.getName(); }
    protected String xinCQ() { return TTrsymboltraceCQ.class.getName(); }
}

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
 * The condition-query for in-line of M_MFWHxITEM.
 * @author DBFlute(AutoGenerator)
 */
public class MMfwhxitemCIQ extends AbstractBsMMfwhxitemCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMMfwhxitemCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MMfwhxitemCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMMfwhxitemCQ myCQ) {
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
    protected ConditionValue xgetCValueMfwhItemId() { return _myCQ.xdfgetMfwhItemId(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueSlotlocname() { return _myCQ.xdfgetSlotlocname(); }
    protected ConditionValue xgetCValuePicklocname() { return _myCQ.xdfgetPicklocname(); }
    protected ConditionValue xgetCValuePhysicaltype() { return _myCQ.xdfgetPhysicaltype(); }
    protected ConditionValue xgetCValuePhysicalcycle() { return _myCQ.xdfgetPhysicalcycle(); }
    protected ConditionValue xgetCValuePhysicalgroup() { return _myCQ.xdfgetPhysicalgroup(); }
    protected ConditionValue xgetCValuePhysicaldate() { return _myCQ.xdfgetPhysicaldate(); }
    protected ConditionValue xgetCValueReordertype() { return _myCQ.xdfgetReordertype(); }
    protected ConditionValue xgetCValueReorderinterval() { return _myCQ.xdfgetReorderinterval(); }
    protected ConditionValue xgetCValueReorderpoint() { return _myCQ.xdfgetReorderpoint(); }
    protected ConditionValue xgetCValueReorderqty() { return _myCQ.xdfgetReorderqty(); }
    protected ConditionValue xgetCValueReorderleadtime() { return _myCQ.xdfgetReorderleadtime(); }
    protected ConditionValue xgetCValueReorderlastday() { return _myCQ.xdfgetReorderlastday(); }
    protected ConditionValue xgetCValueSuppliercd() { return _myCQ.xdfgetSuppliercd(); }
    protected ConditionValue xgetCValueReplenishpoint() { return _myCQ.xdfgetReplenishpoint(); }
    protected ConditionValue xgetCValueMaxqty() { return _myCQ.xdfgetMaxqty(); }
    protected ConditionValue xgetCValueCauseloc() { return _myCQ.xdfgetCauseloc(); }
    protected ConditionValue xgetCValueShippingtype() { return _myCQ.xdfgetShippingtype(); }
    protected ConditionValue xgetCValueSlotpolicykey() { return _myCQ.xdfgetSlotpolicykey(); }
    protected ConditionValue xgetCValueInworkingkey() { return _myCQ.xdfgetInworkingkey(); }
    protected ConditionValue xgetCValueOutworkingkey() { return _myCQ.xdfgetOutworkingkey(); }
    protected ConditionValue xgetCValueProcessworkingkey() { return _myCQ.xdfgetProcessworkingkey(); }
    protected ConditionValue xgetCValueUseruse1() { return _myCQ.xdfgetUseruse1(); }
    protected ConditionValue xgetCValueUseruse2() { return _myCQ.xdfgetUseruse2(); }
    protected ConditionValue xgetCValueUseruse3() { return _myCQ.xdfgetUseruse3(); }
    protected ConditionValue xgetCValueUseruse4() { return _myCQ.xdfgetUseruse4(); }
    protected ConditionValue xgetCValueUseruse5() { return _myCQ.xdfgetUseruse5(); }
    protected ConditionValue xgetCValueSerialflg() { return _myCQ.xdfgetSerialflg(); }
    protected ConditionValue xgetCValueFullpalletflg() { return _myCQ.xdfgetFullpalletflg(); }
    protected ConditionValue xgetCValuePlslotlocname() { return _myCQ.xdfgetPlslotlocname(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_MProduct(sq); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_MProduct(sq); }
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
    public String keepScalarCondition(MMfwhxitemCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MMfwhxitemCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MMfwhxitemCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MMfwhxitemCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MMfwhxitemCB.class.getName(); }
    protected String xinCQ() { return MMfwhxitemCQ.class.getName(); }
}

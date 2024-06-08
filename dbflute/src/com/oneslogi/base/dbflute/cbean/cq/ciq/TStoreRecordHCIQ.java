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
 * The condition-query for in-line of T_STORE_RECORD_H.
 * @author DBFlute(AutoGenerator)
 */
public class TStoreRecordHCIQ extends AbstractBsTStoreRecordHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTStoreRecordHCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TStoreRecordHCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTStoreRecordHCQ myCQ) {
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
    protected ConditionValue xgetCValueStoreRecordHId() { return _myCQ.xdfgetStoreRecordHId(); }
    public String keepStoreRecordHId_ExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStoreRecordHId_ExistsReferrer_TStoreRecordRAsOne(TStoreRecordRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStoreRecordHId_NotExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStoreRecordHId_NotExistsReferrer_TStoreRecordRAsOne(TStoreRecordRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStoreRecordHId_SpecifyDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStoreRecordHId_QueryDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStoreRecordHId_QueryDerivedReferrer_TStoreRecordBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueReceivePlanHId() { return _myCQ.xdfgetReceivePlanHId(); }
    public String keepReceivePlanHId_InScopeRelation_TReceivePlanH(TReceivePlanHCQ sq)
    { return _myCQ.keepReceivePlanHId_InScopeRelation_TReceivePlanH(sq); }
    public String keepReceivePlanHId_NotInScopeRelation_TReceivePlanH(TReceivePlanHCQ sq)
    { return _myCQ.keepReceivePlanHId_NotInScopeRelation_TReceivePlanH(sq); }
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
    protected ConditionValue xgetCValueProcessTypeId() { return _myCQ.xdfgetProcessTypeId(); }
    public String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_InScopeRelation_MProcessType(sq); }
    public String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_NotInScopeRelation_MProcessType(sq); }
    protected ConditionValue xgetCValueStockTypeId() { return _myCQ.xdfgetStockTypeId(); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_InScopeRelation_MStockType(sq); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_NotInScopeRelation_MStockType(sq); }
    protected ConditionValue xgetCValueClientReceiveNo() { return _myCQ.xdfgetClientReceiveNo(); }
    protected ConditionValue xgetCValueSupplierId() { return _myCQ.xdfgetSupplierId(); }
    public String keepSupplierId_InScopeRelation_MCustomerBySupplierId(MCustomerCQ sq)
    { return _myCQ.keepSupplierId_InScopeRelation_MCustomerBySupplierId(sq); }
    public String keepSupplierId_NotInScopeRelation_MCustomerBySupplierId(MCustomerCQ sq)
    { return _myCQ.keepSupplierId_NotInScopeRelation_MCustomerBySupplierId(sq); }
    protected ConditionValue xgetCValueDepositId() { return _myCQ.xdfgetDepositId(); }
    public String keepDepositId_InScopeRelation_MCustomerByDepositId(MCustomerCQ sq)
    { return _myCQ.keepDepositId_InScopeRelation_MCustomerByDepositId(sq); }
    public String keepDepositId_NotInScopeRelation_MCustomerByDepositId(MCustomerCQ sq)
    { return _myCQ.keepDepositId_NotInScopeRelation_MCustomerByDepositId(sq); }
    protected ConditionValue xgetCValueStoreRecordHComment() { return _myCQ.xdfgetStoreRecordHComment(); }
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
    public String keepScalarCondition(TStoreRecordHCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TStoreRecordHCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TStoreRecordHCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TStoreRecordHCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TStoreRecordHCB.class.getName(); }
    protected String xinCQ() { return TStoreRecordHCQ.class.getName(); }
}

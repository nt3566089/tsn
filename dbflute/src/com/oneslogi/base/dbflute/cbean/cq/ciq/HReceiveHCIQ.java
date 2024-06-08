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
 * The condition-query for in-line of H_RECEIVE_H.
 * @author DBFlute(AutoGenerator)
 */
public class HReceiveHCIQ extends AbstractBsHReceiveHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsHReceiveHCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public HReceiveHCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsHReceiveHCQ myCQ) {
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
    public String keepStoreRecordHId_ExistsReferrer_HReceiveBList(HReceiveBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStoreRecordHId_NotExistsReferrer_HReceiveBList(HReceiveBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStoreRecordHId_SpecifyDerivedReferrer_HReceiveBList(HReceiveBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStoreRecordHId_QueryDerivedReferrer_HReceiveBList(HReceiveBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStoreRecordHId_QueryDerivedReferrer_HReceiveBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueHistDt() { return _myCQ.xdfgetHistDt(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    protected ConditionValue xgetCValueClientCd() { return _myCQ.xdfgetClientCd(); }
    protected ConditionValue xgetCValueClientNm() { return _myCQ.xdfgetClientNm(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueCenterNm() { return _myCQ.xdfgetCenterNm(); }
    protected ConditionValue xgetCValueProcessTypeId() { return _myCQ.xdfgetProcessTypeId(); }
    public String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_InScopeRelation_MProcessType(sq); }
    public String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_NotInScopeRelation_MProcessType(sq); }
    protected ConditionValue xgetCValueReceivePlanDt() { return _myCQ.xdfgetReceivePlanDt(); }
    protected ConditionValue xgetCValueClientReceiveNo() { return _myCQ.xdfgetClientReceiveNo(); }
    protected ConditionValue xgetCValueReceiveSlipNo() { return _myCQ.xdfgetReceiveSlipNo(); }
    protected ConditionValue xgetCValueSupplierId() { return _myCQ.xdfgetSupplierId(); }
    protected ConditionValue xgetCValueSupplierCd() { return _myCQ.xdfgetSupplierCd(); }
    protected ConditionValue xgetCValueSupplierNm() { return _myCQ.xdfgetSupplierNm(); }
    protected ConditionValue xgetCValueDepositId() { return _myCQ.xdfgetDepositId(); }
    protected ConditionValue xgetCValueDepositCd() { return _myCQ.xdfgetDepositCd(); }
    protected ConditionValue xgetCValueDepositNm() { return _myCQ.xdfgetDepositNm(); }
    protected ConditionValue xgetCValueReceiveDeliveryStatus() { return _myCQ.xdfgetReceiveDeliveryStatus(); }
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
    public String keepScalarCondition(HReceiveHCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(HReceiveHCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(HReceiveHCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(HReceiveHCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return HReceiveHCB.class.getName(); }
    protected String xinCQ() { return HReceiveHCQ.class.getName(); }
}

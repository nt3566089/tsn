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
 * The condition-query for in-line of T_MOVE_INST_H.
 * @author DBFlute(AutoGenerator)
 */
public class TMoveInstHCIQ extends AbstractBsTMoveInstHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTMoveInstHCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TMoveInstHCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTMoveInstHCQ myCQ) {
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
    protected ConditionValue xgetCValueMoveInstHId() { return _myCQ.xdfgetMoveInstHId(); }
    public String keepMoveInstHId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMoveInstHId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMoveInstHId_ExistsReferrer_TMoveInstRAsOne(TMoveInstRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMoveInstHId_ExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMoveInstHId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMoveInstHId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMoveInstHId_NotExistsReferrer_TMoveInstRAsOne(TMoveInstRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMoveInstHId_NotExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMoveInstHId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMoveInstHId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMoveInstHId_SpecifyDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMoveInstHId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMoveInstHId_QueryDerivedReferrer_TInventoryBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMoveInstHId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMoveInstHId_QueryDerivedReferrer_TMoveInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMoveInstHId_QueryDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMoveInstHId_QueryDerivedReferrer_TMoveRecordBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
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
    protected ConditionValue xgetCValueInstDt() { return _myCQ.xdfgetInstDt(); }
    protected ConditionValue xgetCValueMoveSlipNo() { return _myCQ.xdfgetMoveSlipNo(); }
    protected ConditionValue xgetCValueProcessTypeId() { return _myCQ.xdfgetProcessTypeId(); }
    public String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_InScopeRelation_MProcessType(sq); }
    public String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_NotInScopeRelation_MProcessType(sq); }
    protected ConditionValue xgetCValueMoveInstStatus() { return _myCQ.xdfgetMoveInstStatus(); }
    protected ConditionValue xgetCValueInputType() { return _myCQ.xdfgetInputType(); }
    protected ConditionValue xgetCValueMoveInstComment() { return _myCQ.xdfgetMoveInstComment(); }
    protected ConditionValue xgetCValueSourceBatchNo() { return _myCQ.xdfgetSourceBatchNo(); }
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
    public String keepScalarCondition(TMoveInstHCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TMoveInstHCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TMoveInstHCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TMoveInstHCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TMoveInstHCB.class.getName(); }
    protected String xinCQ() { return TMoveInstHCQ.class.getName(); }
}

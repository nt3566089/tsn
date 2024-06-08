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
 * The condition-query for in-line of T_YTRSO.
 * @author DBFlute(AutoGenerator)
 */
public class TYtrsoCIQ extends AbstractBsTYtrsoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTYtrsoCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TYtrsoCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTYtrsoCQ myCQ) {
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
    protected ConditionValue xgetCValueTrsrId() { return _myCQ.xdfgetTrsrId(); }
    public String keepTrsrId_ExistsReferrer_TYtrsodetailList(TYtrsodetailCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepTrsrId_NotExistsReferrer_TYtrsodetailList(TYtrsodetailCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepTrsrId_SpecifyDerivedReferrer_TYtrsodetailList(TYtrsodetailCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepTrsrId_QueryDerivedReferrer_TYtrsodetailList(TYtrsodetailCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTrsrId_QueryDerivedReferrer_TYtrsodetailListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
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
    protected ConditionValue xgetCValueSoKey() { return _myCQ.xdfgetSoKey(); }
    protected ConditionValue xgetCValueSrStatus() { return _myCQ.xdfgetSrStatus(); }
    protected ConditionValue xgetCValueRestockNumber() { return _myCQ.xdfgetRestockNumber(); }
    protected ConditionValue xgetCValueRestockKbn() { return _myCQ.xdfgetRestockKbn(); }
    protected ConditionValue xgetCValueSortingRackNo() { return _myCQ.xdfgetSortingRackNo(); }
    protected ConditionValue xgetCValueRestockSortKey() { return _myCQ.xdfgetRestockSortKey(); }
    protected ConditionValue xgetCValueShipSchDate() { return _myCQ.xdfgetShipSchDate(); }
    protected ConditionValue xgetCValueShipDate() { return _myCQ.xdfgetShipDate(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueSortRestockFlg() { return _myCQ.xdfgetSortRestockFlg(); }
    protected ConditionValue xgetCValueDeliveryCenterCd() { return _myCQ.xdfgetDeliveryCenterCd(); }
    protected ConditionValue xgetCValueLineBlock() { return _myCQ.xdfgetLineBlock(); }
    protected ConditionValue xgetCValueDeliveryDirection() { return _myCQ.xdfgetDeliveryDirection(); }
    protected ConditionValue xgetCValuePickBatchKey() { return _myCQ.xdfgetPickBatchKey(); }
    protected ConditionValue xgetCValuePicklistComment() { return _myCQ.xdfgetPicklistComment(); }
    protected ConditionValue xgetCValueFromPicklistNo() { return _myCQ.xdfgetFromPicklistNo(); }
    protected ConditionValue xgetCValueToPicklistNo() { return _myCQ.xdfgetToPicklistNo(); }
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
    public String keepScalarCondition(TYtrsoCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TYtrsoCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TYtrsoCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TYtrsoCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TYtrsoCB.class.getName(); }
    protected String xinCQ() { return TYtrsoCQ.class.getName(); }
}

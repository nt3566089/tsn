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
 * The condition-query for in-line of T_PACKING_H.
 * @author DBFlute(AutoGenerator)
 */
public class TPackingHCIQ extends AbstractBsTPackingHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTPackingHCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TPackingHCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTPackingHCQ myCQ) {
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
    protected ConditionValue xgetCValuePackingHId() { return _myCQ.xdfgetPackingHId(); }
    public String keepPackingHId_ExistsReferrer_TPackingBList(TPackingBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPackingHId_ExistsReferrer_TPackingRAsOne(TPackingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPackingHId_ExistsReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPackingHId_NotExistsReferrer_TPackingBList(TPackingBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPackingHId_NotExistsReferrer_TPackingRAsOne(TPackingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPackingHId_NotExistsReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPackingHId_SpecifyDerivedReferrer_TPackingBList(TPackingBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPackingHId_SpecifyDerivedReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPackingHId_QueryDerivedReferrer_TPackingBList(TPackingBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPackingHId_QueryDerivedReferrer_TPackingBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPackingHId_QueryDerivedReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPackingHId_QueryDerivedReferrer_TPicMthdRcmdCartListParameter(Object vl)
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
    protected ConditionValue xgetCValueProcessTypeId() { return _myCQ.xdfgetProcessTypeId(); }
    public String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_InScopeRelation_MProcessType(sq); }
    public String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_NotInScopeRelation_MProcessType(sq); }
    protected ConditionValue xgetCValuePackingStatus() { return _myCQ.xdfgetPackingStatus(); }
    protected ConditionValue xgetCValueAllocInstHId() { return _myCQ.xdfgetAllocInstHId(); }
    public String keepAllocInstHId_InScopeRelation_TAllocInstH(TAllocInstHCQ sq)
    { return _myCQ.keepAllocInstHId_InScopeRelation_TAllocInstH(sq); }
    public String keepAllocInstHId_NotInScopeRelation_TAllocInstH(TAllocInstHCQ sq)
    { return _myCQ.keepAllocInstHId_NotInScopeRelation_TAllocInstH(sq); }
    protected ConditionValue xgetCValuePickingHId() { return _myCQ.xdfgetPickingHId(); }
    public String keepPickingHId_InScopeRelation_TPickingH(TPickingHCQ sq)
    { return _myCQ.keepPickingHId_InScopeRelation_TPickingH(sq); }
    public String keepPickingHId_NotInScopeRelation_TPickingH(TPickingHCQ sq)
    { return _myCQ.keepPickingHId_NotInScopeRelation_TPickingH(sq); }
    protected ConditionValue xgetCValueShippingPackingNo() { return _myCQ.xdfgetShippingPackingNo(); }
    protected ConditionValue xgetCValueCarrierTraceNum() { return _myCQ.xdfgetCarrierTraceNum(); }
    protected ConditionValue xgetCValueBoxId() { return _myCQ.xdfgetBoxId(); }
    public String keepBoxId_InScopeRelation_MBox(MBoxCQ sq)
    { return _myCQ.keepBoxId_InScopeRelation_MBox(sq); }
    public String keepBoxId_NotInScopeRelation_MBox(MBoxCQ sq)
    { return _myCQ.keepBoxId_NotInScopeRelation_MBox(sq); }
    protected ConditionValue xgetCValueGrossWeight() { return _myCQ.xdfgetGrossWeight(); }
    protected ConditionValue xgetCValueTotalVolume() { return _myCQ.xdfgetTotalVolume(); }
    protected ConditionValue xgetCValueMixedFlg() { return _myCQ.xdfgetMixedFlg(); }
    protected ConditionValue xgetCValueMultiPicFlg() { return _myCQ.xdfgetMultiPicFlg(); }
    protected ConditionValue xgetCValueCartNo() { return _myCQ.xdfgetCartNo(); }
    protected ConditionValue xgetCValueBucketColNo() { return _myCQ.xdfgetBucketColNo(); }
    protected ConditionValue xgetCValueBucketRowNo() { return _myCQ.xdfgetBucketRowNo(); }
    protected ConditionValue xgetCValueSeedingNo() { return _myCQ.xdfgetSeedingNo(); }
    protected ConditionValue xgetCValueLoadingFlg() { return _myCQ.xdfgetLoadingFlg(); }
    protected ConditionValue xgetCValueDelFlg() { return _myCQ.xdfgetDelFlg(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected ConditionValue xgetCValueControlNo() { return _myCQ.xdfgetControlNo(); }
    protected ConditionValue xgetCValueAddDt() { return _myCQ.xdfgetAddDt(); }
    protected ConditionValue xgetCValueAddUser() { return _myCQ.xdfgetAddUser(); }
    protected ConditionValue xgetCValueAddProcess() { return _myCQ.xdfgetAddProcess(); }
    protected ConditionValue xgetCValueUpdDt() { return _myCQ.xdfgetUpdDt(); }
    protected ConditionValue xgetCValueUpdUser() { return _myCQ.xdfgetUpdUser(); }
    public String keepUpdUser_InScopeRelation_BUserByUpdUser(BUserCQ sq)
    { return _myCQ.keepUpdUser_InScopeRelation_BUserByUpdUser(sq); }
    public String keepUpdUser_NotInScopeRelation_BUserByUpdUser(BUserCQ sq)
    { return _myCQ.keepUpdUser_NotInScopeRelation_BUserByUpdUser(sq); }
    protected ConditionValue xgetCValueUpdProcess() { return _myCQ.xdfgetUpdProcess(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(TPackingHCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TPackingHCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TPackingHCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TPackingHCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TPackingHCB.class.getName(); }
    protected String xinCQ() { return TPackingHCQ.class.getName(); }
}

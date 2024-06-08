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
 * The condition-query for in-line of T_PIC_MTHD_RCMD.
 * @author DBFlute(AutoGenerator)
 */
public class TPicMthdRcmdCIQ extends AbstractBsTPicMthdRcmdCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTPicMthdRcmdCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TPicMthdRcmdCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTPicMthdRcmdCQ myCQ) {
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
    protected ConditionValue xgetCValuePicMthdRcmdId() { return _myCQ.xdfgetPicMthdRcmdId(); }
    public String keepPicMthdRcmdId_ExistsReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPicMthdRcmdId_ExistsReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPicMthdRcmdId_NotExistsReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPicMthdRcmdId_NotExistsReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPicMthdRcmdId_SpecifyDerivedReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPicMthdRcmdId_SpecifyDerivedReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdCartListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdDataListParameter(Object vl)
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
    protected ConditionValue xgetCValuePickingBatchNo() { return _myCQ.xdfgetPickingBatchNo(); }
    protected ConditionValue xgetCValueRcmdPickingCls() { return _myCQ.xdfgetRcmdPickingCls(); }
    protected ConditionValue xgetCValuePackingNum() { return _myCQ.xdfgetPackingNum(); }
    protected ConditionValue xgetCValueWorkVolume() { return _myCQ.xdfgetWorkVolume(); }
    protected ConditionValue xgetCValueDeliveryCourseCd() { return _myCQ.xdfgetDeliveryCourseCd(); }
    protected ConditionValue xgetCValueDeliveryCourseNm() { return _myCQ.xdfgetDeliveryCourseNm(); }
    protected ConditionValue xgetCValueCarrierCd() { return _myCQ.xdfgetCarrierCd(); }
    protected ConditionValue xgetCValueCarrierNm() { return _myCQ.xdfgetCarrierNm(); }
    protected ConditionValue xgetCValueEmergencyFlg() { return _myCQ.xdfgetEmergencyFlg(); }
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
    public String keepScalarCondition(TPicMthdRcmdCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TPicMthdRcmdCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TPicMthdRcmdCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TPicMthdRcmdCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TPicMthdRcmdCB.class.getName(); }
    protected String xinCQ() { return TPicMthdRcmdCQ.class.getName(); }
}

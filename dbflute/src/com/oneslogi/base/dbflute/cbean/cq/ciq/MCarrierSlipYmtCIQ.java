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
 * The condition-query for in-line of M_CARRIER_SLIP_YMT.
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipYmtCIQ extends AbstractBsMCarrierSlipYmtCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMCarrierSlipYmtCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MCarrierSlipYmtCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMCarrierSlipYmtCQ myCQ) {
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
    protected ConditionValue xgetCValueCarrierSlipYmtId() { return _myCQ.xdfgetCarrierSlipYmtId(); }
    public String keepCarrierSlipYmtId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCarrierSlipYmtId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCarrierSlipYmtId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCarrierSlipYmtId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCarrierSlipYmtId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueTagType() { return _myCQ.xdfgetTagType(); }
    protected ConditionValue xgetCValueTagNm() { return _myCQ.xdfgetTagNm(); }
    protected ConditionValue xgetCValueCharacterCd() { return _myCQ.xdfgetCharacterCd(); }
    protected ConditionValue xgetCValueSlipType() { return _myCQ.xdfgetSlipType(); }
    protected ConditionValue xgetCValueCoolCls() { return _myCQ.xdfgetCoolCls(); }
    protected ConditionValue xgetCValueHonorific() { return _myCQ.xdfgetHonorific(); }
    protected ConditionValue xgetCValuePackingShowFlg() { return _myCQ.xdfgetPackingShowFlg(); }
    protected ConditionValue xgetCValueSlipClientTelNo() { return _myCQ.xdfgetSlipClientTelNo(); }
    protected ConditionValue xgetCValueSlipClientZipCd() { return _myCQ.xdfgetSlipClientZipCd(); }
    protected ConditionValue xgetCValueSlipClientAddress1() { return _myCQ.xdfgetSlipClientAddress1(); }
    protected ConditionValue xgetCValueSlipClientAddress2() { return _myCQ.xdfgetSlipClientAddress2(); }
    protected ConditionValue xgetCValueSlipClientAddress3() { return _myCQ.xdfgetSlipClientAddress3(); }
    protected ConditionValue xgetCValueSlipClientAddress4() { return _myCQ.xdfgetSlipClientAddress4(); }
    protected ConditionValue xgetCValueSlipClientNm() { return _myCQ.xdfgetSlipClientNm(); }
    protected ConditionValue xgetCValueSlipItemCd1() { return _myCQ.xdfgetSlipItemCd1(); }
    protected ConditionValue xgetCValueSlipItemNm1() { return _myCQ.xdfgetSlipItemNm1(); }
    protected ConditionValue xgetCValueSlipItemCd2() { return _myCQ.xdfgetSlipItemCd2(); }
    protected ConditionValue xgetCValueSlipItemNm2() { return _myCQ.xdfgetSlipItemNm2(); }
    protected ConditionValue xgetCValueFreightHandling1() { return _myCQ.xdfgetFreightHandling1(); }
    protected ConditionValue xgetCValueFreightHandling2() { return _myCQ.xdfgetFreightHandling2(); }
    protected ConditionValue xgetCValueArticle() { return _myCQ.xdfgetArticle(); }
    protected ConditionValue xgetCValueBillingCustomerCd() { return _myCQ.xdfgetBillingCustomerCd(); }
    protected ConditionValue xgetCValueFareNo() { return _myCQ.xdfgetFareNo(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
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
    public String keepScalarCondition(MCarrierSlipYmtCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MCarrierSlipYmtCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MCarrierSlipYmtCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MCarrierSlipYmtCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MCarrierSlipYmtCB.class.getName(); }
    protected String xinCQ() { return MCarrierSlipYmtCQ.class.getName(); }
}

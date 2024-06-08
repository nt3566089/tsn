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
 * The condition-query for in-line of M_CARRIER_SLIP_SGW.
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipSgwCIQ extends AbstractBsMCarrierSlipSgwCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMCarrierSlipSgwCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MCarrierSlipSgwCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMCarrierSlipSgwCQ myCQ) {
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
    protected ConditionValue xgetCValueCarrierSlipSgwId() { return _myCQ.xdfgetCarrierSlipSgwId(); }
    public String keepCarrierSlipSgwId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCarrierSlipSgwId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCarrierSlipSgwId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCarrierSlipSgwId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCarrierSlipSgwId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueTagType() { return _myCQ.xdfgetTagType(); }
    protected ConditionValue xgetCValueTagNm() { return _myCQ.xdfgetTagNm(); }
    protected ConditionValue xgetCValueCharacterCd() { return _myCQ.xdfgetCharacterCd(); }
    protected ConditionValue xgetCValueSlipCustomerCd() { return _myCQ.xdfgetSlipCustomerCd(); }
    protected ConditionValue xgetCValueWebApiRequestUrl() { return _myCQ.xdfgetWebApiRequestUrl(); }
    protected ConditionValue xgetCValueCustomerId() { return _myCQ.xdfgetCustomerId(); }
    protected ConditionValue xgetCValueLoginPassword() { return _myCQ.xdfgetLoginPassword(); }
    protected ConditionValue xgetCValueDeptConsignorNm() { return _myCQ.xdfgetDeptConsignorNm(); }
    protected ConditionValue xgetCValueConsignorTelNo() { return _myCQ.xdfgetConsignorTelNo(); }
    protected ConditionValue xgetCValueSlipClientTelNo() { return _myCQ.xdfgetSlipClientTelNo(); }
    protected ConditionValue xgetCValueSlipClientZipCd() { return _myCQ.xdfgetSlipClientZipCd(); }
    protected ConditionValue xgetCValueSlipClientAddress1() { return _myCQ.xdfgetSlipClientAddress1(); }
    protected ConditionValue xgetCValueSlipClientAddress2() { return _myCQ.xdfgetSlipClientAddress2(); }
    protected ConditionValue xgetCValueSlipClientNm1() { return _myCQ.xdfgetSlipClientNm1(); }
    protected ConditionValue xgetCValueSlipClientNm2() { return _myCQ.xdfgetSlipClientNm2(); }
    protected ConditionValue xgetCValueSlipShapeCd() { return _myCQ.xdfgetSlipShapeCd(); }
    protected ConditionValue xgetCValueSlipItemNm1() { return _myCQ.xdfgetSlipItemNm1(); }
    protected ConditionValue xgetCValueSlipItemNm2() { return _myCQ.xdfgetSlipItemNm2(); }
    protected ConditionValue xgetCValueSlipItemNm3() { return _myCQ.xdfgetSlipItemNm3(); }
    protected ConditionValue xgetCValueSlipItemNm4() { return _myCQ.xdfgetSlipItemNm4(); }
    protected ConditionValue xgetCValueSlipItemNm5() { return _myCQ.xdfgetSlipItemNm5(); }
    protected ConditionValue xgetCValueTransportTypeSpeed() { return _myCQ.xdfgetTransportTypeSpeed(); }
    protected ConditionValue xgetCValueTransportTypeItem() { return _myCQ.xdfgetTransportTypeItem(); }
    protected ConditionValue xgetCValueSettlementType() { return _myCQ.xdfgetSettlementType(); }
    protected ConditionValue xgetCValueSealType1() { return _myCQ.xdfgetSealType1(); }
    protected ConditionValue xgetCValueSealType2() { return _myCQ.xdfgetSealType2(); }
    protected ConditionValue xgetCValueSealType3() { return _myCQ.xdfgetSealType3(); }
    protected ConditionValue xgetCValueCodCls() { return _myCQ.xdfgetCodCls(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueApiOkuriCode() { return _myCQ.xdfgetApiOkuriCode(); }
    protected ConditionValue xgetCValueApiBinsyuCode() { return _myCQ.xdfgetApiBinsyuCode(); }
    protected ConditionValue xgetCValueApiDaibikiFlg() { return _myCQ.xdfgetApiDaibikiFlg(); }
    protected ConditionValue xgetCValueApiDaibikiType() { return _myCQ.xdfgetApiDaibikiType(); }
    protected ConditionValue xgetCValueApiWeightCd1() { return _myCQ.xdfgetApiWeightCd1(); }
    protected ConditionValue xgetCValueApiWeightCd2() { return _myCQ.xdfgetApiWeightCd2(); }
    protected ConditionValue xgetCValueApiEidomeFlg() { return _myCQ.xdfgetApiEidomeFlg(); }
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
    public String keepScalarCondition(MCarrierSlipSgwCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MCarrierSlipSgwCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MCarrierSlipSgwCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MCarrierSlipSgwCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MCarrierSlipSgwCB.class.getName(); }
    protected String xinCQ() { return MCarrierSlipSgwCQ.class.getName(); }
}

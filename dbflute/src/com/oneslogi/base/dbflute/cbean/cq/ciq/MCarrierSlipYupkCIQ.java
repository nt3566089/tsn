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
 * The condition-query for in-line of M_CARRIER_SLIP_YUPK.
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipYupkCIQ extends AbstractBsMCarrierSlipYupkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMCarrierSlipYupkCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MCarrierSlipYupkCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMCarrierSlipYupkCQ myCQ) {
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
    protected ConditionValue xgetCValueCarrierSlipYupkId() { return _myCQ.xdfgetCarrierSlipYupkId(); }
    public String keepCarrierSlipYupkId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCarrierSlipYupkId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCarrierSlipYupkId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCarrierSlipYupkId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCarrierSlipYupkId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueTagType() { return _myCQ.xdfgetTagType(); }
    protected ConditionValue xgetCValueTagNm() { return _myCQ.xdfgetTagNm(); }
    protected ConditionValue xgetCValueCharacterCd() { return _myCQ.xdfgetCharacterCd(); }
    protected ConditionValue xgetCValuePostType() { return _myCQ.xdfgetPostType(); }
    protected ConditionValue xgetCValueCoolType() { return _myCQ.xdfgetCoolType(); }
    protected ConditionValue xgetCValueCodType() { return _myCQ.xdfgetCodType(); }
    protected ConditionValue xgetCValueCarrierType() { return _myCQ.xdfgetCarrierType(); }
    protected ConditionValue xgetCValueSlipClientZipCd() { return _myCQ.xdfgetSlipClientZipCd(); }
    protected ConditionValue xgetCValueSlipClientAddress1() { return _myCQ.xdfgetSlipClientAddress1(); }
    protected ConditionValue xgetCValueSlipClientAddress2() { return _myCQ.xdfgetSlipClientAddress2(); }
    protected ConditionValue xgetCValueSlipClientAddress3() { return _myCQ.xdfgetSlipClientAddress3(); }
    protected ConditionValue xgetCValueSlipClientNm1() { return _myCQ.xdfgetSlipClientNm1(); }
    protected ConditionValue xgetCValueSlipClientTelNo() { return _myCQ.xdfgetSlipClientTelNo(); }
    protected ConditionValue xgetCValueSlipClientMail() { return _myCQ.xdfgetSlipClientMail(); }
    protected ConditionValue xgetCValueNoUpsideDownCls() { return _myCQ.xdfgetNoUpsideDownCls(); }
    protected ConditionValue xgetCValueNoStockCls() { return _myCQ.xdfgetNoStockCls(); }
    protected ConditionValue xgetCValueSlipProductSizeCls() { return _myCQ.xdfgetSlipProductSizeCls(); }
    protected ConditionValue xgetCValueSlipProductNo() { return _myCQ.xdfgetSlipProductNo(); }
    protected ConditionValue xgetCValueSlipItemNm() { return _myCQ.xdfgetSlipItemNm(); }
    protected ConditionValue xgetCValueShipReserveDataMark() { return _myCQ.xdfgetShipReserveDataMark(); }
    protected ConditionValue xgetCValueDeliCertPreYears() { return _myCQ.xdfgetDeliCertPreYears(); }
    protected ConditionValue xgetCValueSendNm() { return _myCQ.xdfgetSendNm(); }
    protected ConditionValue xgetCValueProductTypeCode() { return _myCQ.xdfgetProductTypeCode(); }
    protected ConditionValue xgetCValuePostBizCardCustomerNo() { return _myCQ.xdfgetPostBizCardCustomerNo(); }
    protected ConditionValue xgetCValueShippingCompanyCode() { return _myCQ.xdfgetShippingCompanyCode(); }
    protected ConditionValue xgetCValueShipmentCode() { return _myCQ.xdfgetShipmentCode(); }
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
    public String keepScalarCondition(MCarrierSlipYupkCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MCarrierSlipYupkCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MCarrierSlipYupkCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MCarrierSlipYupkCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MCarrierSlipYupkCB.class.getName(); }
    protected String xinCQ() { return MCarrierSlipYupkCQ.class.getName(); }
}

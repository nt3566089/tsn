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
 * The condition-query for in-line of M_PARAM.
 * @author DBFlute(AutoGenerator)
 */
public class MParamCIQ extends AbstractBsMParamCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMParamCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MParamCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMParamCQ myCQ) {
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
    protected ConditionValue xgetCValueClientCenterId() { return _myCQ.xdfgetClientCenterId(); }
    public String keepClientCenterId_InScopeRelation_MClientCenter(MClientCenterCQ sq)
    { return _myCQ.keepClientCenterId_InScopeRelation_MClientCenter(sq); }
    public String keepClientCenterId_NotInScopeRelation_MClientCenter(MClientCenterCQ sq)
    { return _myCQ.keepClientCenterId_NotInScopeRelation_MClientCenter(sq); }
    protected ConditionValue xgetCValueDeliveryCourseId() { return _myCQ.xdfgetDeliveryCourseId(); }
    public String keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq)
    { return _myCQ.keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(sq); }
    public String keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq)
    { return _myCQ.keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(sq); }
    protected ConditionValue xgetCValueStoreDtFlg() { return _myCQ.xdfgetStoreDtFlg(); }
    protected ConditionValue xgetCValueStoreNoFlg() { return _myCQ.xdfgetStoreNoFlg(); }
    protected ConditionValue xgetCValueMergeCls() { return _myCQ.xdfgetMergeCls(); }
    protected ConditionValue xgetCValueTKeepingDays() { return _myCQ.xdfgetTKeepingDays(); }
    protected ConditionValue xgetCValueHKeepingDays() { return _myCQ.xdfgetHKeepingDays(); }
    protected ConditionValue xgetCValueDKeepingDays() { return _myCQ.xdfgetDKeepingDays(); }
    protected ConditionValue xgetCValueOverStoreNumFlg() { return _myCQ.xdfgetOverStoreNumFlg(); }
    protected ConditionValue xgetCValuePastStoreDtFlg() { return _myCQ.xdfgetPastStoreDtFlg(); }
    protected ConditionValue xgetCValueUseHtShipFlg() { return _myCQ.xdfgetUseHtShipFlg(); }
    protected ConditionValue xgetCValueAllocSortKey() { return _myCQ.xdfgetAllocSortKey(); }
    protected ConditionValue xgetCValueRgReplenishUnitCls() { return _myCQ.xdfgetRgReplenishUnitCls(); }
    protected ConditionValue xgetCValueEmReplenishUnitCls() { return _myCQ.xdfgetEmReplenishUnitCls(); }
    protected ConditionValue xgetCValueEmReplenishZoneId() { return _myCQ.xdfgetEmReplenishZoneId(); }
    public String keepEmReplenishZoneId_InScopeRelation_MZone(MZoneCQ sq)
    { return _myCQ.keepEmReplenishZoneId_InScopeRelation_MZone(sq); }
    public String keepEmReplenishZoneId_NotInScopeRelation_MZone(MZoneCQ sq)
    { return _myCQ.keepEmReplenishZoneId_NotInScopeRelation_MZone(sq); }
    protected ConditionValue xgetCValueEmReplenishAllocCls() { return _myCQ.xdfgetEmReplenishAllocCls(); }
    protected ConditionValue xgetCValuePackingCalCls() { return _myCQ.xdfgetPackingCalCls(); }
    protected ConditionValue xgetCValuePackingProcessCls() { return _myCQ.xdfgetPackingProcessCls(); }
    protected ConditionValue xgetCValueProductPartPacking() { return _myCQ.xdfgetProductPartPacking(); }
    protected ConditionValue xgetCValueDecimalProductPacking() { return _myCQ.xdfgetDecimalProductPacking(); }
    protected ConditionValue xgetCValuePackingBoxGroupId() { return _myCQ.xdfgetPackingBoxGroupId(); }
    public String keepPackingBoxGroupId_InScopeRelation_MBoxGrp(MBoxGrpCQ sq)
    { return _myCQ.keepPackingBoxGroupId_InScopeRelation_MBoxGrp(sq); }
    public String keepPackingBoxGroupId_NotInScopeRelation_MBoxGrp(MBoxGrpCQ sq)
    { return _myCQ.keepPackingBoxGroupId_NotInScopeRelation_MBoxGrp(sq); }
    protected ConditionValue xgetCValueTotalPicFlg() { return _myCQ.xdfgetTotalPicFlg(); }
    protected ConditionValue xgetCValueMultiPicCls() { return _myCQ.xdfgetMultiPicCls(); }
    protected ConditionValue xgetCValueBacketColNum() { return _myCQ.xdfgetBacketColNum(); }
    protected ConditionValue xgetCValueBacketRowNum() { return _myCQ.xdfgetBacketRowNum(); }
    protected ConditionValue xgetCValueCasePicFlg() { return _myCQ.xdfgetCasePicFlg(); }
    protected ConditionValue xgetCValueSglRowPicFlg() { return _myCQ.xdfgetSglRowPicFlg(); }
    protected ConditionValue xgetCValueSglRowPicMaxInstNum() { return _myCQ.xdfgetSglRowPicMaxInstNum(); }
    protected ConditionValue xgetCValuePicMthdRcmdFlg() { return _myCQ.xdfgetPicMthdRcmdFlg(); }
    protected ConditionValue xgetCValuePicMthdRcmdBreakKey() { return _myCQ.xdfgetPicMthdRcmdBreakKey(); }
    protected ConditionValue xgetCValuePicMthdRcmdApiKey() { return _myCQ.xdfgetPicMthdRcmdApiKey(); }
    protected ConditionValue xgetCValuePicMthdRcmdMltPlOut() { return _myCQ.xdfgetPicMthdRcmdMltPlOut(); }
    protected ConditionValue xgetCValuePicMthdRcmdSplSlOut() { return _myCQ.xdfgetPicMthdRcmdSplSlOut(); }
    protected ConditionValue xgetCValueProductLabelOutUnit() { return _myCQ.xdfgetProductLabelOutUnit(); }
    protected ConditionValue xgetCValueResultAfterProductLabel() { return _myCQ.xdfgetResultAfterProductLabel(); }
    protected ConditionValue xgetCValueResultAfterProductTarget() { return _myCQ.xdfgetResultAfterProductTarget(); }
    protected ConditionValue xgetCValueProductLabelJanBarcode() { return _myCQ.xdfgetProductLabelJanBarcode(); }
    protected ConditionValue xgetCValueProductLabelProdBarcode() { return _myCQ.xdfgetProductLabelProdBarcode(); }
    protected ConditionValue xgetCValueProductLabelJanStartbit() { return _myCQ.xdfgetProductLabelJanStartbit(); }
    protected ConditionValue xgetCValueProductLabelJanEndbit() { return _myCQ.xdfgetProductLabelJanEndbit(); }
    protected ConditionValue xgetCValueProductLabelProdStartbit() { return _myCQ.xdfgetProductLabelProdStartbit(); }
    protected ConditionValue xgetCValueProductLabelProdEndbit() { return _myCQ.xdfgetProductLabelProdEndbit(); }
    protected ConditionValue xgetCValueBoxSelectSkip() { return _myCQ.xdfgetBoxSelectSkip(); }
    protected ConditionValue xgetCValueDefaultBoxId() { return _myCQ.xdfgetDefaultBoxId(); }
    public String keepDefaultBoxId_InScopeRelation_MBox(MBoxCQ sq)
    { return _myCQ.keepDefaultBoxId_InScopeRelation_MBox(sq); }
    public String keepDefaultBoxId_NotInScopeRelation_MBox(MBoxCQ sq)
    { return _myCQ.keepDefaultBoxId_NotInScopeRelation_MBox(sq); }
    protected ConditionValue xgetCValueErrorSoundPlayFlg() { return _myCQ.xdfgetErrorSoundPlayFlg(); }
    protected ConditionValue xgetCValueWarnSoundPlayFlg() { return _myCQ.xdfgetWarnSoundPlayFlg(); }
    protected ConditionValue xgetCValueInspSoundPlayFlg() { return _myCQ.xdfgetInspSoundPlayFlg(); }
    protected ConditionValue xgetCValueInspCompSoundPlayFlg() { return _myCQ.xdfgetInspCompSoundPlayFlg(); }
    protected ConditionValue xgetCValueAfterTagOutFlg() { return _myCQ.xdfgetAfterTagOutFlg(); }
    protected ConditionValue xgetCValueTagDeliveryOutFlg() { return _myCQ.xdfgetTagDeliveryOutFlg(); }
    protected ConditionValue xgetCValueAfterDelivSlipOutFlg() { return _myCQ.xdfgetAfterDelivSlipOutFlg(); }
    protected ConditionValue xgetCValueAfterDelivSlipOutTgt() { return _myCQ.xdfgetAfterDelivSlipOutTgt(); }
    protected ConditionValue xgetCValueSglRowInspAfterOutCls() { return _myCQ.xdfgetSglRowInspAfterOutCls(); }
    protected ConditionValue xgetCValueHtCharReadFlg() { return _myCQ.xdfgetHtCharReadFlg(); }
    protected ConditionValue xgetCValueHtLotInputType() { return _myCQ.xdfgetHtLotInputType(); }
    protected ConditionValue xgetCValueHtSerialInputType() { return _myCQ.xdfgetHtSerialInputType(); }
    protected ConditionValue xgetCValueInspectionLabelOutFlg() { return _myCQ.xdfgetInspectionLabelOutFlg(); }
    protected ConditionValue xgetCValueAutoShipInstFlg() { return _myCQ.xdfgetAutoShipInstFlg(); }
    protected ConditionValue xgetCValueStockOutAutoInstFlg() { return _myCQ.xdfgetStockOutAutoInstFlg(); }
    protected ConditionValue xgetCValueAutoEmgSetFlg() { return _myCQ.xdfgetAutoEmgSetFlg(); }
    protected ConditionValue xgetCValueAutoEmgSetTgt() { return _myCQ.xdfgetAutoEmgSetTgt(); }
    protected ConditionValue xgetCValueAutoEmgSetMinute() { return _myCQ.xdfgetAutoEmgSetMinute(); }
    protected ConditionValue xgetCValueStockOutInstCxlFlg() { return _myCQ.xdfgetStockOutInstCxlFlg(); }
    protected ConditionValue xgetCValueStockOutAllocCls() { return _myCQ.xdfgetStockOutAllocCls(); }
    protected ConditionValue xgetCValueStockOutInstSplitFlg() { return _myCQ.xdfgetStockOutInstSplitFlg(); }
    protected ConditionValue xgetCValueCesIntegrationFlg() { return _myCQ.xdfgetCesIntegrationFlg(); }
    protected ConditionValue xgetCValuePackingSlipAutoOutputFlg() { return _myCQ.xdfgetPackingSlipAutoOutputFlg(); }
    protected ConditionValue xgetCValueCenterKbn() { return _myCQ.xdfgetCenterKbn(); }
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
    public String keepScalarCondition(MParamCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MParamCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MParamCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MParamCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MParamCB.class.getName(); }
    protected String xinCQ() { return MParamCQ.class.getName(); }
}

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
 * The condition-query for in-line of W_HT_SHIPPING_PICKING.
 * @author DBFlute(AutoGenerator)
 */
public class WHtShippingPickingCIQ extends AbstractBsWHtShippingPickingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWHtShippingPickingCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WHtShippingPickingCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWHtShippingPickingCQ myCQ) {
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
    protected ConditionValue xgetCValueHtShippingPickingId() { return _myCQ.xdfgetHtShippingPickingId(); }
    protected ConditionValue xgetCValueMacAddress() { return _myCQ.xdfgetMacAddress(); }
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
    protected ConditionValue xgetCValuePickingBId() { return _myCQ.xdfgetPickingBId(); }
    protected ConditionValue xgetCValuePickingWorkNo() { return _myCQ.xdfgetPickingWorkNo(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_MProduct(sq); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_MProduct(sq); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueProductNm() { return _myCQ.xdfgetProductNm(); }
    protected ConditionValue xgetCValueInstNum() { return _myCQ.xdfgetInstNum(); }
    protected ConditionValue xgetCValueSpgQtyOns() { return _myCQ.xdfgetSpgQtyOns(); }
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    public String keepLocationId_InScopeRelation_MLocation(MLocationCQ sq)
    { return _myCQ.keepLocationId_InScopeRelation_MLocation(sq); }
    public String keepLocationId_NotInScopeRelation_MLocation(MLocationCQ sq)
    { return _myCQ.keepLocationId_NotInScopeRelation_MLocation(sq); }
    protected ConditionValue xgetCValueLocationCd() { return _myCQ.xdfgetLocationCd(); }
    protected ConditionValue xgetCValueLocationNm() { return _myCQ.xdfgetLocationNm(); }
    protected ConditionValue xgetCValueLot() { return _myCQ.xdfgetLot(); }
    protected ConditionValue xgetCValueLimitDt() { return _myCQ.xdfgetLimitDt(); }
    protected ConditionValue xgetCValueWorkStartDt() { return _myCQ.xdfgetWorkStartDt(); }
    protected ConditionValue xgetCValueWorkEndDt() { return _myCQ.xdfgetWorkEndDt(); }
    protected ConditionValue xgetCValueStoreLabelNo() { return _myCQ.xdfgetStoreLabelNo(); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    public String keepLotId_InScopeRelation_TLot(TLotCQ sq)
    { return _myCQ.keepLotId_InScopeRelation_TLot(sq); }
    public String keepLotId_NotInScopeRelation_TLot(TLotCQ sq)
    { return _myCQ.keepLotId_NotInScopeRelation_TLot(sq); }
    protected ConditionValue xgetCValuePickingFlg() { return _myCQ.xdfgetPickingFlg(); }
    protected ConditionValue xgetCValueSkipNum() { return _myCQ.xdfgetSkipNum(); }
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
    public String keepScalarCondition(WHtShippingPickingCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WHtShippingPickingCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WHtShippingPickingCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WHtShippingPickingCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WHtShippingPickingCB.class.getName(); }
    protected String xinCQ() { return WHtShippingPickingCQ.class.getName(); }
}

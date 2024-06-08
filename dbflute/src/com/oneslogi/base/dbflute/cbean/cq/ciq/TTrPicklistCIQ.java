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
 * The condition-query for in-line of T_TR_PICKLIST.
 * @author DBFlute(AutoGenerator)
 */
public class TTrPicklistCIQ extends AbstractBsTTrPicklistCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrPicklistCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrPicklistCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrPicklistCQ myCQ) {
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
    protected ConditionValue xgetCValueTTrPicklistId() { return _myCQ.xdfgetTTrPicklistId(); }
    public String keepTTrPicklistId_ExistsReferrer_TTrpicklistexpList(TTrpicklistexpCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepTTrPicklistId_NotExistsReferrer_TTrpicklistexpList(TTrpicklistexpCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepTTrPicklistId_SpecifyDerivedReferrer_TTrpicklistexpList(TTrpicklistexpCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepTTrPicklistId_QueryDerivedReferrer_TTrpicklistexpList(TTrpicklistexpCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTTrPicklistId_QueryDerivedReferrer_TTrpicklistexpListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueTrpickdetailId() { return _myCQ.xdfgetTrpickdetailId(); }
    public String keepTrpickdetailId_InScopeRelation_TTrpickdetail(TTrpickdetailCQ sq)
    { return _myCQ.keepTrpickdetailId_InScopeRelation_TTrpickdetail(sq); }
    public String keepTrpickdetailId_NotInScopeRelation_TTrpickdetail(TTrpickdetailCQ sq)
    { return _myCQ.keepTrpickdetailId_NotInScopeRelation_TTrpickdetail(sq); }
    protected ConditionValue xgetCValuePickListKey() { return _myCQ.xdfgetPickListKey(); }
    protected ConditionValue xgetCValuePicklistGNo() { return _myCQ.xdfgetPicklistGNo(); }
    protected ConditionValue xgetCValuePlBatchKey() { return _myCQ.xdfgetPlBatchKey(); }
    protected ConditionValue xgetCValueStockId() { return _myCQ.xdfgetStockId(); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    protected ConditionValue xgetCValuePicklistDate() { return _myCQ.xdfgetPicklistDate(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueManufactureDate() { return _myCQ.xdfgetManufactureDate(); }
    protected ConditionValue xgetCValueDesignFlg() { return _myCQ.xdfgetDesignFlg(); }
    protected ConditionValue xgetCValueMonthFlg() { return _myCQ.xdfgetMonthFlg(); }
    protected ConditionValue xgetCValueDailyFlg() { return _myCQ.xdfgetDailyFlg(); }
    protected ConditionValue xgetCValueFrontRackFlg() { return _myCQ.xdfgetFrontRackFlg(); }
    protected ConditionValue xgetCValueLocFlg() { return _myCQ.xdfgetLocFlg(); }
    protected ConditionValue xgetCValueStdDifFlg() { return _myCQ.xdfgetStdDifFlg(); }
    protected ConditionValue xgetCValueOrderType() { return _myCQ.xdfgetOrderType(); }
    protected ConditionValue xgetCValueShipTosub() { return _myCQ.xdfgetShipTosub(); }
    protected ConditionValue xgetCValueRmaNo() { return _myCQ.xdfgetRmaNo(); }
    protected ConditionValue xgetCValueSotedLocationId() { return _myCQ.xdfgetSotedLocationId(); }
    protected ConditionValue xgetCValueSotedLocationCd() { return _myCQ.xdfgetSotedLocationCd(); }
    protected ConditionValue xgetCValueAllocLocationId() { return _myCQ.xdfgetAllocLocationId(); }
    protected ConditionValue xgetCValueAllocLocationCd() { return _myCQ.xdfgetAllocLocationCd(); }
    protected ConditionValue xgetCValueRootOutSeq() { return _myCQ.xdfgetRootOutSeq(); }
    protected ConditionValue xgetCValueDirectionComment() { return _myCQ.xdfgetDirectionComment(); }
    protected ConditionValue xgetCValueQtyCase() { return _myCQ.xdfgetQtyCase(); }
    protected ConditionValue xgetCValueQtyBowl() { return _myCQ.xdfgetQtyBowl(); }
    protected ConditionValue xgetCValueQty() { return _myCQ.xdfgetQty(); }
    protected ConditionValue xgetCValueHtQtyCase() { return _myCQ.xdfgetHtQtyCase(); }
    protected ConditionValue xgetCValueHtQtyBowl() { return _myCQ.xdfgetHtQtyBowl(); }
    protected ConditionValue xgetCValueHtQty() { return _myCQ.xdfgetHtQty(); }
    protected ConditionValue xgetCValueCompleteSts() { return _myCQ.xdfgetCompleteSts(); }
    protected ConditionValue xgetCValueStartTime() { return _myCQ.xdfgetStartTime(); }
    protected ConditionValue xgetCValueEndTime() { return _myCQ.xdfgetEndTime(); }
    protected ConditionValue xgetCValueUserCd() { return _myCQ.xdfgetUserCd(); }
    protected ConditionValue xgetCValueSuppliercd() { return _myCQ.xdfgetSuppliercd(); }
    protected ConditionValue xgetCValueSchdate() { return _myCQ.xdfgetSchdate(); }
    protected ConditionValue xgetCValueCaseOutNumber() { return _myCQ.xdfgetCaseOutNumber(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    protected ConditionValue xgetCValueLineBlock() { return _myCQ.xdfgetLineBlock(); }
    protected ConditionValue xgetCValueSortingRackNo() { return _myCQ.xdfgetSortingRackNo(); }
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
    public String keepScalarCondition(TTrPicklistCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrPicklistCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrPicklistCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrPicklistCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrPicklistCB.class.getName(); }
    protected String xinCQ() { return TTrPicklistCQ.class.getName(); }
}

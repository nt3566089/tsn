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
 * The condition-query for in-line of H_STOCK.
 * @author DBFlute(AutoGenerator)
 */
public class HStockCIQ extends AbstractBsHStockCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsHStockCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public HStockCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsHStockCQ myCQ) {
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
    protected ConditionValue xgetCValueStockId() { return _myCQ.xdfgetStockId(); }
    public String keepStockId_ExistsReferrer_HInventoryBList(HInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockId_ExistsReferrer_HMoveBList(HMoveBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockId_ExistsReferrer_HPackingBList(HPackingBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockId_ExistsReferrer_HReceiveBList(HReceiveBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockId_ExistsReferrer_HStockInoutList(HStockInoutCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockId_ExistsReferrer_HStockReportList(HStockReportCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockId_NotExistsReferrer_HInventoryBList(HInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockId_NotExistsReferrer_HMoveBList(HMoveBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockId_NotExistsReferrer_HPackingBList(HPackingBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockId_NotExistsReferrer_HReceiveBList(HReceiveBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockId_NotExistsReferrer_HStockInoutList(HStockInoutCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockId_NotExistsReferrer_HStockReportList(HStockReportCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockId_SpecifyDerivedReferrer_HInventoryBList(HInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStockId_SpecifyDerivedReferrer_HMoveBList(HMoveBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStockId_SpecifyDerivedReferrer_HPackingBList(HPackingBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStockId_SpecifyDerivedReferrer_HReceiveBList(HReceiveBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStockId_SpecifyDerivedReferrer_HStockInoutList(HStockInoutCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStockId_SpecifyDerivedReferrer_HStockReportList(HStockReportCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_HInventoryBList(HInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_HInventoryBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_HMoveBList(HMoveBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_HMoveBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_HPackingBList(HPackingBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_HPackingBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_HReceiveBList(HReceiveBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_HReceiveBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_HStockInoutList(HStockInoutCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_HStockInoutListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_HStockReportList(HStockReportCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockId_QueryDerivedReferrer_HStockReportListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    protected ConditionValue xgetCValueClientCd() { return _myCQ.xdfgetClientCd(); }
    protected ConditionValue xgetCValueClientNm() { return _myCQ.xdfgetClientNm(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueCenterNm() { return _myCQ.xdfgetCenterNm(); }
    protected ConditionValue xgetCValueWarehouseId() { return _myCQ.xdfgetWarehouseId(); }
    protected ConditionValue xgetCValueWarehouseCd() { return _myCQ.xdfgetWarehouseCd(); }
    protected ConditionValue xgetCValueWarehouseNm() { return _myCQ.xdfgetWarehouseNm(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueProductNm() { return _myCQ.xdfgetProductNm(); }
    protected ConditionValue xgetCValueProductAbbr() { return _myCQ.xdfgetProductAbbr(); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueStockTypeId() { return _myCQ.xdfgetStockTypeId(); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_InScopeRelation_MStockType(sq); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_NotInScopeRelation_MStockType(sq); }
    protected ConditionValue xgetCValueZoneId() { return _myCQ.xdfgetZoneId(); }
    protected ConditionValue xgetCValueZoneCd() { return _myCQ.xdfgetZoneCd(); }
    protected ConditionValue xgetCValueZoneNm() { return _myCQ.xdfgetZoneNm(); }
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    protected ConditionValue xgetCValueLocationCd() { return _myCQ.xdfgetLocationCd(); }
    protected ConditionValue xgetCValueLocationNm() { return _myCQ.xdfgetLocationNm(); }
    protected ConditionValue xgetCValueDepositId() { return _myCQ.xdfgetDepositId(); }
    protected ConditionValue xgetCValueDepositCd() { return _myCQ.xdfgetDepositCd(); }
    protected ConditionValue xgetCValueDepositNm() { return _myCQ.xdfgetDepositNm(); }
    protected ConditionValue xgetCValueDepositAbbr() { return _myCQ.xdfgetDepositAbbr(); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    protected ConditionValue xgetCValueLot() { return _myCQ.xdfgetLot(); }
    protected ConditionValue xgetCValueLimitDt() { return _myCQ.xdfgetLimitDt(); }
    protected ConditionValue xgetCValueShapeId() { return _myCQ.xdfgetShapeId(); }
    public String keepShapeId_InScopeRelation_MShape(MShapeCQ sq)
    { return _myCQ.keepShapeId_InScopeRelation_MShape(sq); }
    public String keepShapeId_NotInScopeRelation_MShape(MShapeCQ sq)
    { return _myCQ.keepShapeId_NotInScopeRelation_MShape(sq); }
    protected ConditionValue xgetCValueStoreNoId() { return _myCQ.xdfgetStoreNoId(); }
    protected ConditionValue xgetCValueStoreLabelNo() { return _myCQ.xdfgetStoreLabelNo(); }
    protected ConditionValue xgetCValueOldStoreNumId() { return _myCQ.xdfgetOldStoreNumId(); }
    protected ConditionValue xgetCValueOldStoreLabelNo() { return _myCQ.xdfgetOldStoreLabelNo(); }
    protected ConditionValue xgetCValueSupplierId() { return _myCQ.xdfgetSupplierId(); }
    protected ConditionValue xgetCValueSupplierCd() { return _myCQ.xdfgetSupplierCd(); }
    protected ConditionValue xgetCValueSupplierNm() { return _myCQ.xdfgetSupplierNm(); }
    protected ConditionValue xgetCValueSupplierAbbr() { return _myCQ.xdfgetSupplierAbbr(); }
    protected ConditionValue xgetCValueStoreDt() { return _myCQ.xdfgetStoreDt(); }
    protected ConditionValue xgetCValueUnitNum() { return _myCQ.xdfgetUnitNum(); }
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
    public String keepScalarCondition(HStockCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(HStockCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(HStockCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(HStockCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return HStockCB.class.getName(); }
    protected String xinCQ() { return HStockCQ.class.getName(); }
}

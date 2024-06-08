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
 * The condition-query for in-line of T_INVENTORY_INST.
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryInstCIQ extends AbstractBsTInventoryInstCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTInventoryInstCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TInventoryInstCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTInventoryInstCQ myCQ) {
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
    protected ConditionValue xgetCValueInventoryInstId() { return _myCQ.xdfgetInventoryInstId(); }
    protected ConditionValue xgetCValueInventoryHId() { return _myCQ.xdfgetInventoryHId(); }
    public String keepInventoryHId_InScopeRelation_TInventoryH(TInventoryHCQ sq)
    { return _myCQ.keepInventoryHId_InScopeRelation_TInventoryH(sq); }
    public String keepInventoryHId_NotInScopeRelation_TInventoryH(TInventoryHCQ sq)
    { return _myCQ.keepInventoryHId_NotInScopeRelation_TInventoryH(sq); }
    protected ConditionValue xgetCValueDepositId() { return _myCQ.xdfgetDepositId(); }
    public String keepDepositId_InScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepDepositId_InScopeRelation_MCustomer(sq); }
    public String keepDepositId_NotInScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepDepositId_NotInScopeRelation_MCustomer(sq); }
    protected ConditionValue xgetCValueStockTypeId() { return _myCQ.xdfgetStockTypeId(); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_InScopeRelation_MStockType(sq); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_NotInScopeRelation_MStockType(sq); }
    protected ConditionValue xgetCValueFromLocationCd() { return _myCQ.xdfgetFromLocationCd(); }
    protected ConditionValue xgetCValueToLocationCd() { return _myCQ.xdfgetToLocationCd(); }
    protected ConditionValue xgetCValueZoneId() { return _myCQ.xdfgetZoneId(); }
    public String keepZoneId_InScopeRelation_MZone(MZoneCQ sq)
    { return _myCQ.keepZoneId_InScopeRelation_MZone(sq); }
    public String keepZoneId_NotInScopeRelation_MZone(MZoneCQ sq)
    { return _myCQ.keepZoneId_NotInScopeRelation_MZone(sq); }
    protected ConditionValue xgetCValueFromStockInoutDt() { return _myCQ.xdfgetFromStockInoutDt(); }
    protected ConditionValue xgetCValueToStockInoutDt() { return _myCQ.xdfgetToStockInoutDt(); }
    protected ConditionValue xgetCValueStockExistOnlyFlg() { return _myCQ.xdfgetStockExistOnlyFlg(); }
    protected ConditionValue xgetCValueInventoryInstKbn() { return _myCQ.xdfgetInventoryInstKbn(); }
    protected ConditionValue xgetCValueLineBlock() { return _myCQ.xdfgetLineBlock(); }
    protected ConditionValue xgetCValueDirectionalPiston() { return _myCQ.xdfgetDirectionalPiston(); }
    protected ConditionValue xgetCValueSortingOrder() { return _myCQ.xdfgetSortingOrder(); }
    protected ConditionValue xgetCValueSortingNumTimes() { return _myCQ.xdfgetSortingNumTimes(); }
    protected ConditionValue xgetCValueLocationCd() { return _myCQ.xdfgetLocationCd(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueProductDivision() { return _myCQ.xdfgetProductDivision(); }
    protected ConditionValue xgetCValueLocationGrp() { return _myCQ.xdfgetLocationGrp(); }
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
    public String keepScalarCondition(TInventoryInstCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TInventoryInstCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TInventoryInstCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TInventoryInstCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TInventoryInstCB.class.getName(); }
    protected String xinCQ() { return TInventoryInstCQ.class.getName(); }
}

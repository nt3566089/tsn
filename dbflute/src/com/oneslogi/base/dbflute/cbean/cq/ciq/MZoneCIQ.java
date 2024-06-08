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
 * The condition-query for in-line of M_ZONE.
 * @author DBFlute(AutoGenerator)
 */
public class MZoneCIQ extends AbstractBsMZoneCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMZoneCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MZoneCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMZoneCQ myCQ) {
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
    protected ConditionValue xgetCValueZoneId() { return _myCQ.xdfgetZoneId(); }
    public String keepZoneId_ExistsReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepZoneId_ExistsReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepZoneId_ExistsReferrer_TInventoryInstList(TInventoryInstCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepZoneId_NotExistsReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepZoneId_NotExistsReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepZoneId_NotExistsReferrer_TInventoryInstList(TInventoryInstCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepZoneId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepZoneId_SpecifyDerivedReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepZoneId_SpecifyDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepZoneId_QueryDerivedReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepZoneId_QueryDerivedReferrer_MLocationListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepZoneId_QueryDerivedReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepZoneId_QueryDerivedReferrer_MParamListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepZoneId_QueryDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepZoneId_QueryDerivedReferrer_TInventoryInstListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueWarehouseId() { return _myCQ.xdfgetWarehouseId(); }
    public String keepWarehouseId_InScopeRelation_MWarehouse(MWarehouseCQ sq)
    { return _myCQ.keepWarehouseId_InScopeRelation_MWarehouse(sq); }
    public String keepWarehouseId_NotInScopeRelation_MWarehouse(MWarehouseCQ sq)
    { return _myCQ.keepWarehouseId_NotInScopeRelation_MWarehouse(sq); }
    protected ConditionValue xgetCValueZoneCd() { return _myCQ.xdfgetZoneCd(); }
    protected ConditionValue xgetCValueZoneNm() { return _myCQ.xdfgetZoneNm(); }
    protected ConditionValue xgetCValuePickingOrder() { return _myCQ.xdfgetPickingOrder(); }
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
    public String keepScalarCondition(MZoneCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MZoneCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MZoneCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MZoneCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MZoneCB.class.getName(); }
    protected String xinCQ() { return MZoneCQ.class.getName(); }
}

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
 * The condition-query for in-line of T_TRPALLETDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TTrpalletdetailCIQ extends AbstractBsTTrpalletdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrpalletdetailCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrpalletdetailCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrpalletdetailCQ myCQ) {
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
    protected ConditionValue xgetCValueTrpalletdetailId() { return _myCQ.xdfgetTrpalletdetailId(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    protected ConditionValue xgetCValuePalletDetailKey() { return _myCQ.xdfgetPalletDetailKey(); }
    protected ConditionValue xgetCValueInoutType() { return _myCQ.xdfgetInoutType(); }
    protected ConditionValue xgetCValueTrpalletId() { return _myCQ.xdfgetTrpalletId(); }
    protected ConditionValue xgetCValueBasePalletNo() { return _myCQ.xdfgetBasePalletNo(); }
    protected ConditionValue xgetCValueDivPalletNo() { return _myCQ.xdfgetDivPalletNo(); }
    protected ConditionValue xgetCValueWorkType() { return _myCQ.xdfgetWorkType(); }
    protected ConditionValue xgetCValueWorkKey() { return _myCQ.xdfgetWorkKey(); }
    protected ConditionValue xgetCValueRegistrationDate() { return _myCQ.xdfgetRegistrationDate(); }
    protected ConditionValue xgetCValueWorkDate() { return _myCQ.xdfgetWorkDate(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueDesignFlg() { return _myCQ.xdfgetDesignFlg(); }
    protected ConditionValue xgetCValueLimitDate() { return _myCQ.xdfgetLimitDate(); }
    protected ConditionValue xgetCValueFirmCarryNo() { return _myCQ.xdfgetFirmCarryNo(); }
    protected ConditionValue xgetCValueBatArticleSign() { return _myCQ.xdfgetBatArticleSign(); }
    protected ConditionValue xgetCValueMoveBLlocationId() { return _myCQ.xdfgetMoveBLlocationId(); }
    protected ConditionValue xgetCValueMoveBLocationCd() { return _myCQ.xdfgetMoveBLocationCd(); }
    protected ConditionValue xgetCValueMoveALocationId() { return _myCQ.xdfgetMoveALocationId(); }
    protected ConditionValue xgetCValueMoveALocationCd() { return _myCQ.xdfgetMoveALocationCd(); }
    protected ConditionValue xgetCValueInstNum() { return _myCQ.xdfgetInstNum(); }
    protected ConditionValue xgetCValueRestQtyCase() { return _myCQ.xdfgetRestQtyCase(); }
    protected ConditionValue xgetCValueRestQtyBowl() { return _myCQ.xdfgetRestQtyBowl(); }
    protected ConditionValue xgetCValueRestQty() { return _myCQ.xdfgetRestQty(); }
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
    public String keepScalarCondition(TTrpalletdetailCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrpalletdetailCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrpalletdetailCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrpalletdetailCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrpalletdetailCB.class.getName(); }
    protected String xinCQ() { return TTrpalletdetailCQ.class.getName(); }
}

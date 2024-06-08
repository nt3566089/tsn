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
 * The condition-query for in-line of W_SGL_ROW_SHIP_INSP_B.
 * @author DBFlute(AutoGenerator)
 */
public class WSglRowShipInspBCIQ extends AbstractBsWSglRowShipInspBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWSglRowShipInspBCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WSglRowShipInspBCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWSglRowShipInspBCQ myCQ) {
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
    protected ConditionValue xgetCValueSglRowShipInspBId() { return _myCQ.xdfgetSglRowShipInspBId(); }
    protected ConditionValue xgetCValueSglRowShipInspHId() { return _myCQ.xdfgetSglRowShipInspHId(); }
    public String keepSglRowShipInspHId_InScopeRelation_WSglRowShipInspH(WSglRowShipInspHCQ sq)
    { return _myCQ.keepSglRowShipInspHId_InScopeRelation_WSglRowShipInspH(sq); }
    public String keepSglRowShipInspHId_NotInScopeRelation_WSglRowShipInspH(WSglRowShipInspHCQ sq)
    { return _myCQ.keepSglRowShipInspHId_NotInScopeRelation_WSglRowShipInspH(sq); }
    protected ConditionValue xgetCValuePickingHId() { return _myCQ.xdfgetPickingHId(); }
    public String keepPickingHId_InScopeRelation_TPickingH(TPickingHCQ sq)
    { return _myCQ.keepPickingHId_InScopeRelation_TPickingH(sq); }
    public String keepPickingHId_NotInScopeRelation_TPickingH(TPickingHCQ sq)
    { return _myCQ.keepPickingHId_NotInScopeRelation_TPickingH(sq); }
    protected ConditionValue xgetCValueUserId() { return _myCQ.xdfgetUserId(); }
    public String keepUserId_InScopeRelation_BUser(BUserCQ sq)
    { return _myCQ.keepUserId_InScopeRelation_BUser(sq); }
    public String keepUserId_NotInScopeRelation_BUser(BUserCQ sq)
    { return _myCQ.keepUserId_NotInScopeRelation_BUser(sq); }
    protected ConditionValue xgetCValueInspectedNum() { return _myCQ.xdfgetInspectedNum(); }
    protected ConditionValue xgetCValueInspectionFlg() { return _myCQ.xdfgetInspectionFlg(); }
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
    public String keepScalarCondition(WSglRowShipInspBCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WSglRowShipInspBCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WSglRowShipInspBCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WSglRowShipInspBCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WSglRowShipInspBCB.class.getName(); }
    protected String xinCQ() { return WSglRowShipInspBCQ.class.getName(); }
}

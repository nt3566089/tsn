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
 * The condition-query for in-line of T_TRPICKDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TTrpickdetailCIQ extends AbstractBsTTrpickdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrpickdetailCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrpickdetailCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrpickdetailCQ myCQ) {
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
    protected ConditionValue xgetCValueTrpickdetailId() { return _myCQ.xdfgetTrpickdetailId(); }
    public String keepTrpickdetailId_ExistsReferrer_TTrPicklistList(TTrPicklistCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepTrpickdetailId_NotExistsReferrer_TTrPicklistList(TTrPicklistCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepTrpickdetailId_SpecifyDerivedReferrer_TTrPicklistList(TTrPicklistCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepTrpickdetailId_QueryDerivedReferrer_TTrPicklistList(TTrPicklistCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTrpickdetailId_QueryDerivedReferrer_TTrPicklistListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueTrsodetailId() { return _myCQ.xdfgetTrsodetailId(); }
    public String keepTrsodetailId_InScopeRelation_TYtrsodetail(TYtrsodetailCQ sq)
    { return _myCQ.keepTrsodetailId_InScopeRelation_TYtrsodetail(sq); }
    public String keepTrsodetailId_NotInScopeRelation_TYtrsodetail(TYtrsodetailCQ sq)
    { return _myCQ.keepTrsodetailId_NotInScopeRelation_TYtrsodetail(sq); }
    protected ConditionValue xgetCValueMoveInstHId() { return _myCQ.xdfgetMoveInstHId(); }
    protected ConditionValue xgetCValueStockId() { return _myCQ.xdfgetStockId(); }
    public String keepStockId_InScopeRelation_TStock(TStockCQ sq)
    { return _myCQ.keepStockId_InScopeRelation_TStock(sq); }
    public String keepStockId_NotInScopeRelation_TStock(TStockCQ sq)
    { return _myCQ.keepStockId_NotInScopeRelation_TStock(sq); }
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    public String keepLocationId_InScopeRelation_MLocation(MLocationCQ sq)
    { return _myCQ.keepLocationId_InScopeRelation_MLocation(sq); }
    public String keepLocationId_NotInScopeRelation_MLocation(MLocationCQ sq)
    { return _myCQ.keepLocationId_NotInScopeRelation_MLocation(sq); }
    protected ConditionValue xgetCValuePickBatchKey() { return _myCQ.xdfgetPickBatchKey(); }
    protected ConditionValue xgetCValuePickBatchLineNo() { return _myCQ.xdfgetPickBatchLineNo(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueIfitemCd() { return _myCQ.xdfgetIfitemCd(); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    protected ConditionValue xgetCValueLocationCd() { return _myCQ.xdfgetLocationCd(); }
    protected ConditionValue xgetCValueExpectQty() { return _myCQ.xdfgetExpectQty(); }
    protected ConditionValue xgetCValuePickedQty() { return _myCQ.xdfgetPickedQty(); }
    protected ConditionValue xgetCValueSortedQty() { return _myCQ.xdfgetSortedQty(); }
    protected ConditionValue xgetCValueShippedQty() { return _myCQ.xdfgetShippedQty(); }
    protected ConditionValue xgetCValuePickUserCd() { return _myCQ.xdfgetPickUserCd(); }
    protected ConditionValue xgetCValueLabelPrintedFlg() { return _myCQ.xdfgetLabelPrintedFlg(); }
    protected ConditionValue xgetCValueMonthFlg() { return _myCQ.xdfgetMonthFlg(); }
    protected ConditionValue xgetCValuePlBatchKey() { return _myCQ.xdfgetPlBatchKey(); }
    protected ConditionValue xgetCValueWorkallocatename() { return _myCQ.xdfgetWorkallocatename(); }
    protected ConditionValue xgetCValueAlertflg() { return _myCQ.xdfgetAlertflg(); }
    protected ConditionValue xgetCValueReverseFlg() { return _myCQ.xdfgetReverseFlg(); }
    protected ConditionValue xgetCValueReverseListOutputFlg() { return _myCQ.xdfgetReverseListOutputFlg(); }
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
    public String keepScalarCondition(TTrpickdetailCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrpickdetailCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrpickdetailCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrpickdetailCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrpickdetailCB.class.getName(); }
    protected String xinCQ() { return TTrpickdetailCQ.class.getName(); }
}

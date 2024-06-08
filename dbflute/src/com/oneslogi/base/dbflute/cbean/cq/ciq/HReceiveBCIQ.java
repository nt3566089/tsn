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
 * The condition-query for in-line of H_RECEIVE_B.
 * @author DBFlute(AutoGenerator)
 */
public class HReceiveBCIQ extends AbstractBsHReceiveBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsHReceiveBCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public HReceiveBCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsHReceiveBCQ myCQ) {
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
    protected ConditionValue xgetCValueStoreRecordBId() { return _myCQ.xdfgetStoreRecordBId(); }
    public String keepStoreRecordBId_ExistsReferrer_HReceiveSpareAsOne(HReceiveSpareCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStoreRecordBId_NotExistsReferrer_HReceiveSpareAsOne(HReceiveSpareCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    protected ConditionValue xgetCValueStoreRecordHId() { return _myCQ.xdfgetStoreRecordHId(); }
    public String keepStoreRecordHId_InScopeRelation_HReceiveH(HReceiveHCQ sq)
    { return _myCQ.keepStoreRecordHId_InScopeRelation_HReceiveH(sq); }
    public String keepStoreRecordHId_NotInScopeRelation_HReceiveH(HReceiveHCQ sq)
    { return _myCQ.keepStoreRecordHId_NotInScopeRelation_HReceiveH(sq); }
    protected ConditionValue xgetCValueStockId() { return _myCQ.xdfgetStockId(); }
    public String keepStockId_InScopeRelation_HStock(HStockCQ sq)
    { return _myCQ.keepStockId_InScopeRelation_HStock(sq); }
    public String keepStockId_NotInScopeRelation_HStock(HStockCQ sq)
    { return _myCQ.keepStockId_NotInScopeRelation_HStock(sq); }
    protected ConditionValue xgetCValuePlanNum() { return _myCQ.xdfgetPlanNum(); }
    protected ConditionValue xgetCValueProcessNo() { return _myCQ.xdfgetProcessNo(); }
    protected ConditionValue xgetCValueStoreDt() { return _myCQ.xdfgetStoreDt(); }
    protected ConditionValue xgetCValueStoreNum() { return _myCQ.xdfgetStoreNum(); }
    protected ConditionValue xgetCValueStoreFlg() { return _myCQ.xdfgetStoreFlg(); }
    protected ConditionValue xgetCValueStoreLocationId() { return _myCQ.xdfgetStoreLocationId(); }
    protected ConditionValue xgetCValueStoreLocationCd() { return _myCQ.xdfgetStoreLocationCd(); }
    protected ConditionValue xgetCValueStoreLocationNm() { return _myCQ.xdfgetStoreLocationNm(); }
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
    public String keepScalarCondition(HReceiveBCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(HReceiveBCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(HReceiveBCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(HReceiveBCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return HReceiveBCB.class.getName(); }
    protected String xinCQ() { return HReceiveBCQ.class.getName(); }
}

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
 * The condition-query for in-line of T_CORDHDR.
 * @author DBFlute(AutoGenerator)
 */
public class TCordhdrCIQ extends AbstractBsTCordhdrCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTCordhdrCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TCordhdrCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTCordhdrCQ myCQ) {
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
    protected ConditionValue xgetCValueOrderHId() { return _myCQ.xdfgetOrderHId(); }
    public String keepOrderHId_ExistsReferrer_TCorddtaecList(TCorddtaecCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepOrderHId_ExistsReferrer_TCorddtasrList(TCorddtasrCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepOrderHId_NotExistsReferrer_TCorddtaecList(TCorddtaecCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepOrderHId_NotExistsReferrer_TCorddtasrList(TCorddtasrCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepOrderHId_SpecifyDerivedReferrer_TCorddtaecList(TCorddtaecCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepOrderHId_SpecifyDerivedReferrer_TCorddtasrList(TCorddtasrCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepOrderHId_QueryDerivedReferrer_TCorddtaecList(TCorddtaecCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepOrderHId_QueryDerivedReferrer_TCorddtaecListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepOrderHId_QueryDerivedReferrer_TCorddtasrList(TCorddtasrCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepOrderHId_QueryDerivedReferrer_TCorddtasrListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
    protected ConditionValue xgetCValueZzorgncd() { return _myCQ.xdfgetZzorgncd(); }
    protected ConditionValue xgetCValueDpcd() { return _myCQ.xdfgetDpcd(); }
    protected ConditionValue xgetCValueZzordymd() { return _myCQ.xdfgetZzordymd(); }
    protected ConditionValue xgetCValueOrdgr() { return _myCQ.xdfgetOrdgr(); }
    protected ConditionValue xgetCValueDlvymd() { return _myCQ.xdfgetDlvymd(); }
    protected ConditionValue xgetCValueDed() { return _myCQ.xdfgetDed(); }
    protected ConditionValue xgetCValuePstnid() { return _myCQ.xdfgetPstnid(); }
    protected ConditionValue xgetCValueScddlvymd() { return _myCQ.xdfgetScddlvymd(); }
    protected ConditionValue xgetCValueScdded() { return _myCQ.xdfgetScdded(); }
    protected ConditionValue xgetCValueScdpstnid() { return _myCQ.xdfgetScdpstnid(); }
    protected ConditionValue xgetCValueIoid() { return _myCQ.xdfgetIoid(); }
    protected ConditionValue xgetCValueCtqa() { return _myCQ.xdfgetCtqa(); }
    protected ConditionValue xgetCValueSta() { return _myCQ.xdfgetSta(); }
    protected ConditionValue xgetCValueWrkmfg() { return _myCQ.xdfgetWrkmfg(); }
    protected ConditionValue xgetCValueSroprtcnt() { return _myCQ.xdfgetSroprtcnt(); }
    protected ConditionValue xgetCValueCordrcvcnt() { return _myCQ.xdfgetCordrcvcnt(); }
    protected ConditionValue xgetCValueCompleteFlg() { return _myCQ.xdfgetCompleteFlg(); }
    protected ConditionValue xgetCValueRcvFlg() { return _myCQ.xdfgetRcvFlg(); }
    protected ConditionValue xgetCValueSkipKbn() { return _myCQ.xdfgetSkipKbn(); }
    protected ConditionValue xgetCValueSortDate() { return _myCQ.xdfgetSortDate(); }
    protected ConditionValue xgetCValueComment() { return _myCQ.xdfgetComment(); }
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
    public String keepScalarCondition(TCordhdrCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TCordhdrCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TCordhdrCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TCordhdrCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TCordhdrCB.class.getName(); }
    protected String xinCQ() { return TCordhdrCQ.class.getName(); }
}

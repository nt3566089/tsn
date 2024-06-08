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
 * The condition-query for in-line of E_CSRSTINF_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class ECsrstinfSendCIQ extends AbstractBsECsrstinfSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsECsrstinfSendCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ECsrstinfSendCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsECsrstinfSendCQ myCQ) {
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
    protected ConditionValue xgetCValueCsrstinfSendId() { return _myCQ.xdfgetCsrstinfSendId(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueSendRowCd() { return _myCQ.xdfgetSendRowCd(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
    protected ConditionValue xgetCValueSroprtymd() { return _myCQ.xdfgetSroprtymd(); }
    protected ConditionValue xgetCValueSroprtcnt() { return _myCQ.xdfgetSroprtcnt(); }
    protected ConditionValue xgetCValueLinblk() { return _myCQ.xdfgetLinblk(); }
    protected ConditionValue xgetCValueDlvymd() { return _myCQ.xdfgetDlvymd(); }
    protected ConditionValue xgetCValueDpcd() { return _myCQ.xdfgetDpcd(); }
    protected ConditionValue xgetCValueDed() { return _myCQ.xdfgetDed(); }
    protected ConditionValue xgetCValuePstnid() { return _myCQ.xdfgetPstnid(); }
    protected ConditionValue xgetCValueSrlincd() { return _myCQ.xdfgetSrlincd(); }
    protected ConditionValue xgetCValueSrrnk() { return _myCQ.xdfgetSrrnk(); }
    protected ConditionValue xgetCValueSrpat() { return _myCQ.xdfgetSrpat(); }
    protected ConditionValue xgetCValueTtbrqa() { return _myCQ.xdfgetTtbrqa(); }
    protected ConditionValue xgetCValueShpqa() { return _myCQ.xdfgetShpqa(); }
    protected ConditionValue xgetCValueSprqasftpcl() { return _myCQ.xdfgetSprqasftpcl(); }
    protected ConditionValue xgetCValueSprqatsnbox() { return _myCQ.xdfgetSprqatsnbox(); }
    protected ConditionValue xgetCValueSprqajtbox() { return _myCQ.xdfgetSprqajtbox(); }
    protected ConditionValue xgetCValueSprqa100box() { return _myCQ.xdfgetSprqa100box(); }
    protected ConditionValue xgetCValueSprqahl() { return _myCQ.xdfgetSprqahl(); }
    protected ConditionValue xgetCValueSprqahlbgbox() { return _myCQ.xdfgetSprqahlbgbox(); }
    protected ConditionValue xgetCValueSprqahl12box() { return _myCQ.xdfgetSprqahl12box(); }
    protected ConditionValue xgetCValueSprqahl5box() { return _myCQ.xdfgetSprqahl5box(); }
    protected ConditionValue xgetCValueSprqaful() { return _myCQ.xdfgetSprqaful(); }
    protected ConditionValue xgetCValueZzorgncd() { return _myCQ.xdfgetZzorgncd(); }
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
    public String keepScalarCondition(ECsrstinfSendCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(ECsrstinfSendCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(ECsrstinfSendCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(ECsrstinfSendCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ECsrstinfSendCB.class.getName(); }
    protected String xinCQ() { return ECsrstinfSendCQ.class.getName(); }
}

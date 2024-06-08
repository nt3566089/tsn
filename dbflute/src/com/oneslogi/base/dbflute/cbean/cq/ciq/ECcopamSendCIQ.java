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
 * The condition-query for in-line of E_CCOPAM_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class ECcopamSendCIQ extends AbstractBsECcopamSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsECcopamSendCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ECcopamSendCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsECcopamSendCQ myCQ) {
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
    protected ConditionValue xgetCValueCcopamSendId() { return _myCQ.xdfgetCcopamSendId(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueSendRowId() { return _myCQ.xdfgetSendRowId(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
    protected ConditionValue xgetCValueCcopamId() { return _myCQ.xdfgetCcopamId(); }
    protected ConditionValue xgetCValueSnno1() { return _myCQ.xdfgetSnno1(); }
    protected ConditionValue xgetCValueSnno2() { return _myCQ.xdfgetSnno2(); }
    protected ConditionValue xgetCValueSnno3() { return _myCQ.xdfgetSnno3(); }
    protected ConditionValue xgetCValueCarno() { return _myCQ.xdfgetCarno(); }
    protected ConditionValue xgetCValueSnymd() { return _myCQ.xdfgetSnymd(); }
    protected ConditionValue xgetCValueArvymd() { return _myCQ.xdfgetArvymd(); }
    protected ConditionValue xgetCValueSfcd() { return _myCQ.xdfgetSfcd(); }
    protected ConditionValue xgetCValueStcd() { return _myCQ.xdfgetStcd(); }
    protected ConditionValue xgetCValueGnlpltqa() { return _myCQ.xdfgetGnlpltqa(); }
    protected ConditionValue xgetCValueOtpltqa() { return _myCQ.xdfgetOtpltqa(); }
    protected ConditionValue xgetCValuePlncarknd() { return _myCQ.xdfgetPlncarknd(); }
    protected ConditionValue xgetCValueAmcarknd() { return _myCQ.xdfgetAmcarknd(); }
    protected ConditionValue xgetCValueSelno1() { return _myCQ.xdfgetSelno1(); }
    protected ConditionValue xgetCValueSelno2() { return _myCQ.xdfgetSelno2(); }
    protected ConditionValue xgetCValueSelno3() { return _myCQ.xdfgetSelno3(); }
    protected ConditionValue xgetCValueTrannm() { return _myCQ.xdfgetTrannm(); }
    protected ConditionValue xgetCValueTdrelayid() { return _myCQ.xdfgetTdrelayid(); }
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
    public String keepScalarCondition(ECcopamSendCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(ECcopamSendCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(ECcopamSendCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(ECcopamSendCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ECcopamSendCB.class.getName(); }
    protected String xinCQ() { return ECcopamSendCQ.class.getName(); }
}

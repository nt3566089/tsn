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
 * The condition-query for in-line of W_CDRCATT_INST_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public class WCdrcattInstInputCIQ extends AbstractBsWCdrcattInstInputCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWCdrcattInstInputCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WCdrcattInstInputCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWCdrcattInstInputCQ myCQ) {
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
    protected ConditionValue xgetCValueCdrcattInstInputId() { return _myCQ.xdfgetCdrcattInstInputId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueClientCd() { return _myCQ.xdfgetClientCd(); }
    protected ConditionValue xgetCValueCompanyCd() { return _myCQ.xdfgetCompanyCd(); }
    protected ConditionValue xgetCValueDpcd() { return _myCQ.xdfgetDpcd(); }
    protected ConditionValue xgetCValueDrccd() { return _myCQ.xdfgetDrccd(); }
    protected ConditionValue xgetCValueZzpstnid() { return _myCQ.xdfgetZzpstnid(); }
    protected ConditionValue xgetCValueSrlin() { return _myCQ.xdfgetSrlin(); }
    protected ConditionValue xgetCValueSrrnk() { return _myCQ.xdfgetSrrnk(); }
    protected ConditionValue xgetCValueSnmprtrnkad() { return _myCQ.xdfgetSnmprtrnkad(); }
    protected ConditionValue xgetCValueSrwkdy() { return _myCQ.xdfgetSrwkdy(); }
    protected ConditionValue xgetCValueComt() { return _myCQ.xdfgetComt(); }
    protected ConditionValue xgetCValueSprprsid() { return _myCQ.xdfgetSprprsid(); }
    protected ConditionValue xgetCValueOddvid() { return _myCQ.xdfgetOddvid(); }
    protected ConditionValue xgetCValueHdrdbxusid() { return _myCQ.xdfgetHdrdbxusid(); }
    protected ConditionValue xgetCValueIkeiincldflg() { return _myCQ.xdfgetIkeiincldflg(); }
    protected ConditionValue xgetCValueRemoteisland() { return _myCQ.xdfgetRemoteisland(); }
    protected ConditionValue xgetCValueZzfrdateh() { return _myCQ.xdfgetZzfrdateh(); }
    protected ConditionValue xgetCValueZztodateh() { return _myCQ.xdfgetZztodateh(); }
    protected ConditionValue xgetCValueGrtnid() { return _myCQ.xdfgetGrtnid(); }
    protected ConditionValue xgetCValueLineNo() { return _myCQ.xdfgetLineNo(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMsg() { return _myCQ.xdfgetErrorMsg(); }
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
    public String keepScalarCondition(WCdrcattInstInputCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WCdrcattInstInputCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WCdrcattInstInputCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WCdrcattInstInputCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WCdrcattInstInputCB.class.getName(); }
    protected String xinCQ() { return WCdrcattInstInputCQ.class.getName(); }
}

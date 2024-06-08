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
 * The condition-query for in-line of E_MH_STOCK.
 * @author DBFlute(AutoGenerator)
 */
public class EMhStockCIQ extends AbstractBsEMhStockCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEMhStockCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EMhStockCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEMhStockCQ myCQ) {
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
    protected ConditionValue xgetCValueMhStockId() { return _myCQ.xdfgetMhStockId(); }
    protected ConditionValue xgetCValueCompanyCd() { return _myCQ.xdfgetCompanyCd(); }
    protected ConditionValue xgetCValueLinblk() { return _myCQ.xdfgetLinblk(); }
    protected ConditionValue xgetCValueZoneCd() { return _myCQ.xdfgetZoneCd(); }
    protected ConditionValue xgetCValueLocno() { return _myCQ.xdfgetLocno(); }
    protected ConditionValue xgetCValueLockbn() { return _myCQ.xdfgetLockbn(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueTstinvcb() { return _myCQ.xdfgetTstinvcb(); }
    protected ConditionValue xgetCValueTstinvct() { return _myCQ.xdfgetTstinvct(); }
    protected ConditionValue xgetCValueTosplcbqa() { return _myCQ.xdfgetTosplcbqa(); }
    protected ConditionValue xgetCValueTosplctqa() { return _myCQ.xdfgetTosplctqa(); }
    protected ConditionValue xgetCValueTsplcb() { return _myCQ.xdfgetTsplcb(); }
    protected ConditionValue xgetCValueTsplct() { return _myCQ.xdfgetTsplct(); }
    protected ConditionValue xgetCValuePresplcbqa() { return _myCQ.xdfgetPresplcbqa(); }
    protected ConditionValue xgetCValuePresplctqa() { return _myCQ.xdfgetPresplctqa(); }
    protected ConditionValue xgetCValueTpresplcb() { return _myCQ.xdfgetTpresplcb(); }
    protected ConditionValue xgetCValueTpresplct() { return _myCQ.xdfgetTpresplct(); }
    protected ConditionValue xgetCValueTinvmdtcbs() { return _myCQ.xdfgetTinvmdtcbs(); }
    protected ConditionValue xgetCValueTinvmdtcb() { return _myCQ.xdfgetTinvmdtcb(); }
    protected ConditionValue xgetCValueTinvmdtcts() { return _myCQ.xdfgetTinvmdtcts(); }
    protected ConditionValue xgetCValueTinvmdtct() { return _myCQ.xdfgetTinvmdtct(); }
    protected ConditionValue xgetCValueCsplnun() { return _myCQ.xdfgetCsplnun(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
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
    public String keepScalarCondition(EMhStockCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EMhStockCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EMhStockCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EMhStockCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EMhStockCB.class.getName(); }
    protected String xinCQ() { return EMhStockCQ.class.getName(); }
}

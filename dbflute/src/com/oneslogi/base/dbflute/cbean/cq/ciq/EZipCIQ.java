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
 * The condition-query for in-line of E_ZIP.
 * @author DBFlute(AutoGenerator)
 */
public class EZipCIQ extends AbstractBsEZipCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEZipCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EZipCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEZipCQ myCQ) {
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
    protected ConditionValue xgetCValueZipId() { return _myCQ.xdfgetZipId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueZipCd() { return _myCQ.xdfgetZipCd(); }
    protected ConditionValue xgetCValuePublicCd() { return _myCQ.xdfgetPublicCd(); }
    protected ConditionValue xgetCValueZipCd5() { return _myCQ.xdfgetZipCd5(); }
    protected ConditionValue xgetCValueAddressKn1() { return _myCQ.xdfgetAddressKn1(); }
    protected ConditionValue xgetCValueAddressKn2() { return _myCQ.xdfgetAddressKn2(); }
    protected ConditionValue xgetCValueAddressKn3() { return _myCQ.xdfgetAddressKn3(); }
    protected ConditionValue xgetCValueCompanyKn() { return _myCQ.xdfgetCompanyKn(); }
    protected ConditionValue xgetCValueAddress1() { return _myCQ.xdfgetAddress1(); }
    protected ConditionValue xgetCValueAddress2() { return _myCQ.xdfgetAddress2(); }
    protected ConditionValue xgetCValueAddress3() { return _myCQ.xdfgetAddress3(); }
    protected ConditionValue xgetCValueAddress4() { return _myCQ.xdfgetAddress4(); }
    protected ConditionValue xgetCValueCompanyNm() { return _myCQ.xdfgetCompanyNm(); }
    protected ConditionValue xgetCValueFlg1() { return _myCQ.xdfgetFlg1(); }
    protected ConditionValue xgetCValueFlg2() { return _myCQ.xdfgetFlg2(); }
    protected ConditionValue xgetCValueFlg3() { return _myCQ.xdfgetFlg3(); }
    protected ConditionValue xgetCValueFlg4() { return _myCQ.xdfgetFlg4(); }
    protected ConditionValue xgetCValueUpdType() { return _myCQ.xdfgetUpdType(); }
    protected ConditionValue xgetCValueReasonType() { return _myCQ.xdfgetReasonType(); }
    protected ConditionValue xgetCValueHandlingAddress() { return _myCQ.xdfgetHandlingAddress(); }
    protected ConditionValue xgetCValueFlg5() { return _myCQ.xdfgetFlg5(); }
    protected ConditionValue xgetCValueFlg6() { return _myCQ.xdfgetFlg6(); }
    protected ConditionValue xgetCValueUpdCd() { return _myCQ.xdfgetUpdCd(); }
    protected ConditionValue xgetCValueCompanyFlg() { return _myCQ.xdfgetCompanyFlg(); }
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
    public String keepScalarCondition(EZipCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EZipCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EZipCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EZipCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EZipCB.class.getName(); }
    protected String xinCQ() { return EZipCQ.class.getName(); }
}

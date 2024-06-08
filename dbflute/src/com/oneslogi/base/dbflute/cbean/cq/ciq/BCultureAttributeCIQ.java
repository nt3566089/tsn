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
 * The condition-query for in-line of B_CULTURE_ATTRIBUTE.
 * @author DBFlute(AutoGenerator)
 */
public class BCultureAttributeCIQ extends AbstractBsBCultureAttributeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBCultureAttributeCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BCultureAttributeCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBCultureAttributeCQ myCQ) {
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
    protected ConditionValue xgetCValueCultureId() { return _myCQ.xdfgetCultureId(); }
    public String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq)
    { return _myCQ.keepCultureId_InScopeRelation_BCulture(sq); }
    public String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq)
    { return _myCQ.keepCultureId_NotInScopeRelation_BCulture(sq); }
    protected ConditionValue xgetCValueDateTimeFormatDisplay() { return _myCQ.xdfgetDateTimeFormatDisplay(); }
    protected ConditionValue xgetCValueDateTimeFormatReport() { return _myCQ.xdfgetDateTimeFormatReport(); }
    protected ConditionValue xgetCValueDateTimeFormatExcel() { return _myCQ.xdfgetDateTimeFormatExcel(); }
    protected ConditionValue xgetCValueDateTimeFormatText() { return _myCQ.xdfgetDateTimeFormatText(); }
    protected ConditionValue xgetCValueDateFormatDisplay() { return _myCQ.xdfgetDateFormatDisplay(); }
    protected ConditionValue xgetCValueDateFormatReport() { return _myCQ.xdfgetDateFormatReport(); }
    protected ConditionValue xgetCValueDateFormatExcel() { return _myCQ.xdfgetDateFormatExcel(); }
    protected ConditionValue xgetCValueDateFormatText() { return _myCQ.xdfgetDateFormatText(); }
    protected ConditionValue xgetCValueTimeFormatDisplay() { return _myCQ.xdfgetTimeFormatDisplay(); }
    protected ConditionValue xgetCValueTimeFormatReport() { return _myCQ.xdfgetTimeFormatReport(); }
    protected ConditionValue xgetCValueTimeFormatExcel() { return _myCQ.xdfgetTimeFormatExcel(); }
    protected ConditionValue xgetCValueTimeFormatText() { return _myCQ.xdfgetTimeFormatText(); }
    protected ConditionValue xgetCValueNumberFormatDisplay() { return _myCQ.xdfgetNumberFormatDisplay(); }
    protected ConditionValue xgetCValueNumberFormatReport() { return _myCQ.xdfgetNumberFormatReport(); }
    protected ConditionValue xgetCValueNumberFormatExcel() { return _myCQ.xdfgetNumberFormatExcel(); }
    protected ConditionValue xgetCValueNumberFormatText() { return _myCQ.xdfgetNumberFormatText(); }
    protected ConditionValue xgetCValueCurrencyFormatReport() { return _myCQ.xdfgetCurrencyFormatReport(); }
    protected ConditionValue xgetCValueFontNameExcel() { return _myCQ.xdfgetFontNameExcel(); }
    protected ConditionValue xgetCValueFontSizeExcel() { return _myCQ.xdfgetFontSizeExcel(); }
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
    public String keepScalarCondition(BCultureAttributeCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BCultureAttributeCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BCultureAttributeCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BCultureAttributeCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BCultureAttributeCB.class.getName(); }
    protected String xinCQ() { return BCultureAttributeCQ.class.getName(); }
}

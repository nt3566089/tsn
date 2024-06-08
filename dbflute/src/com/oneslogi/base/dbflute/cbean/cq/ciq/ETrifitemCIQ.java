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
 * The condition-query for in-line of E_TRIFITEM.
 * @author DBFlute(AutoGenerator)
 */
public class ETrifitemCIQ extends AbstractBsETrifitemCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsETrifitemCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ETrifitemCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsETrifitemCQ myCQ) {
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
    protected ConditionValue xgetCValueImportkey() { return _myCQ.xdfgetImportkey(); }
    protected ConditionValue xgetCValueSts() { return _myCQ.xdfgetSts(); }
    protected ConditionValue xgetCValueImpcheckkey() { return _myCQ.xdfgetImpcheckkey(); }
    protected ConditionValue xgetCValueItemadmin() { return _myCQ.xdfgetItemadmin(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueItemgroup() { return _myCQ.xdfgetItemgroup(); }
    protected ConditionValue xgetCValueActflg() { return _myCQ.xdfgetActflg(); }
    protected ConditionValue xgetCValueInvtype() { return _myCQ.xdfgetInvtype(); }
    protected ConditionValue xgetCValueSetitemflg() { return _myCQ.xdfgetSetitemflg(); }
    protected ConditionValue xgetCValueName() { return _myCQ.xdfgetName(); }
    protected ConditionValue xgetCValueSname() { return _myCQ.xdfgetSname(); }
    protected ConditionValue xgetCValueAname() { return _myCQ.xdfgetAname(); }
    protected ConditionValue xgetCValueOwneritemcd() { return _myCQ.xdfgetOwneritemcd(); }
    protected ConditionValue xgetCValueSupplieritemcd() { return _myCQ.xdfgetSupplieritemcd(); }
    protected ConditionValue xgetCValuePositemcd() { return _myCQ.xdfgetPositemcd(); }
    protected ConditionValue xgetCValueItfcd() { return _myCQ.xdfgetItfcd(); }
    protected ConditionValue xgetCValueManuitemcd() { return _myCQ.xdfgetManuitemcd(); }
    protected ConditionValue xgetCValuePriceBuy() { return _myCQ.xdfgetPriceBuy(); }
    protected ConditionValue xgetCValuePriceWholesale() { return _myCQ.xdfgetPriceWholesale(); }
    protected ConditionValue xgetCValuePriceSale() { return _myCQ.xdfgetPriceSale(); }
    protected ConditionValue xgetCValueAbctype() { return _myCQ.xdfgetAbctype(); }
    protected ConditionValue xgetCValueQty1type() { return _myCQ.xdfgetQty1type(); }
    protected ConditionValue xgetCValueUnit1() { return _myCQ.xdfgetUnit1(); }
    protected ConditionValue xgetCValueUnit1style() { return _myCQ.xdfgetUnit1style(); }
    protected ConditionValue xgetCValueLength1() { return _myCQ.xdfgetLength1(); }
    protected ConditionValue xgetCValueWidth1() { return _myCQ.xdfgetWidth1(); }
    protected ConditionValue xgetCValueHeight1() { return _myCQ.xdfgetHeight1(); }
    protected ConditionValue xgetCValueGrossweight1() { return _myCQ.xdfgetGrossweight1(); }
    protected ConditionValue xgetCValueNetweight1() { return _myCQ.xdfgetNetweight1(); }
    protected ConditionValue xgetCValueCube1() { return _myCQ.xdfgetCube1(); }
    protected ConditionValue xgetCValueLiter1() { return _myCQ.xdfgetLiter1(); }
    protected ConditionValue xgetCValueUnit2() { return _myCQ.xdfgetUnit2(); }
    protected ConditionValue xgetCValueUnit2style() { return _myCQ.xdfgetUnit2style(); }
    protected ConditionValue xgetCValueLength2() { return _myCQ.xdfgetLength2(); }
    protected ConditionValue xgetCValueWidth2() { return _myCQ.xdfgetWidth2(); }
    protected ConditionValue xgetCValueHeight2() { return _myCQ.xdfgetHeight2(); }
    protected ConditionValue xgetCValueGrossweight2() { return _myCQ.xdfgetGrossweight2(); }
    protected ConditionValue xgetCValueNetweight2() { return _myCQ.xdfgetNetweight2(); }
    protected ConditionValue xgetCValueCube2() { return _myCQ.xdfgetCube2(); }
    protected ConditionValue xgetCValueLiter2() { return _myCQ.xdfgetLiter2(); }
    protected ConditionValue xgetCValueUnit3() { return _myCQ.xdfgetUnit3(); }
    protected ConditionValue xgetCValueUnit3style() { return _myCQ.xdfgetUnit3style(); }
    protected ConditionValue xgetCValueLength3() { return _myCQ.xdfgetLength3(); }
    protected ConditionValue xgetCValueWidth3() { return _myCQ.xdfgetWidth3(); }
    protected ConditionValue xgetCValueHeight3() { return _myCQ.xdfgetHeight3(); }
    protected ConditionValue xgetCValueGrossweight3() { return _myCQ.xdfgetGrossweight3(); }
    protected ConditionValue xgetCValueNetweight3() { return _myCQ.xdfgetNetweight3(); }
    protected ConditionValue xgetCValueCube3() { return _myCQ.xdfgetCube3(); }
    protected ConditionValue xgetCValueLiter3() { return _myCQ.xdfgetLiter3(); }
    protected ConditionValue xgetCValuePQty() { return _myCQ.xdfgetPQty(); }
    protected ConditionValue xgetCValuePHeight() { return _myCQ.xdfgetPHeight(); }
    protected ConditionValue xgetCValuePOdd() { return _myCQ.xdfgetPOdd(); }
    protected ConditionValue xgetCValueNotes() { return _myCQ.xdfgetNotes(); }
    protected ConditionValue xgetCValueFUser1() { return _myCQ.xdfgetFUser1(); }
    protected ConditionValue xgetCValueFUser2() { return _myCQ.xdfgetFUser2(); }
    protected ConditionValue xgetCValueFUser3() { return _myCQ.xdfgetFUser3(); }
    protected ConditionValue xgetCValueFUser4() { return _myCQ.xdfgetFUser4(); }
    protected ConditionValue xgetCValueFUser5() { return _myCQ.xdfgetFUser5(); }
    protected ConditionValue xgetCValuePriceInsurance() { return _myCQ.xdfgetPriceInsurance(); }
    protected ConditionValue xgetCValueLimitday() { return _myCQ.xdfgetLimitday(); }
    protected ConditionValue xgetCValueSuppliercd() { return _myCQ.xdfgetSuppliercd(); }
    protected ConditionValue xgetCValueUseruse1() { return _myCQ.xdfgetUseruse1(); }
    protected ConditionValue xgetCValueUseruse2() { return _myCQ.xdfgetUseruse2(); }
    protected ConditionValue xgetCValueUseruse3() { return _myCQ.xdfgetUseruse3(); }
    protected ConditionValue xgetCValueUseruse4() { return _myCQ.xdfgetUseruse4(); }
    protected ConditionValue xgetCValueUseruse5() { return _myCQ.xdfgetUseruse5(); }
    protected ConditionValue xgetCValuePricelevel() { return _myCQ.xdfgetPricelevel(); }
    protected ConditionValue xgetCValueItemcatalogurl() { return _myCQ.xdfgetItemcatalogurl(); }
    protected ConditionValue xgetCValueUsernum1() { return _myCQ.xdfgetUsernum1(); }
    protected ConditionValue xgetCValueUsernum2() { return _myCQ.xdfgetUsernum2(); }
    protected ConditionValue xgetCValueUsernum3() { return _myCQ.xdfgetUsernum3(); }
    protected ConditionValue xgetCValueUsernum4() { return _myCQ.xdfgetUsernum4(); }
    protected ConditionValue xgetCValueUsernum5() { return _myCQ.xdfgetUsernum5(); }
    protected ConditionValue xgetCValueUserdate1() { return _myCQ.xdfgetUserdate1(); }
    protected ConditionValue xgetCValueUserdate2() { return _myCQ.xdfgetUserdate2(); }
    protected ConditionValue xgetCValueUserdate3() { return _myCQ.xdfgetUserdate3(); }
    protected ConditionValue xgetCValueUserdate4() { return _myCQ.xdfgetUserdate4(); }
    protected ConditionValue xgetCValueUserdate5() { return _myCQ.xdfgetUserdate5(); }
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
    public String keepScalarCondition(ETrifitemCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(ETrifitemCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(ETrifitemCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(ETrifitemCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ETrifitemCB.class.getName(); }
    protected String xinCQ() { return ETrifitemCQ.class.getName(); }
}

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
 * The condition-query for in-line of T_TRFLEXIBILITYPRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class TTrflexibilityproductCIQ extends AbstractBsTTrflexibilityproductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrflexibilityproductCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrflexibilityproductCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrflexibilityproductCQ myCQ) {
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
    protected ConditionValue xgetCValueTrflexibilityproductId() { return _myCQ.xdfgetTrflexibilityproductId(); }
    protected ConditionValue xgetCValueSuppliercd() { return _myCQ.xdfgetSuppliercd(); }
    protected ConditionValue xgetCValueShipcd() { return _myCQ.xdfgetShipcd(); }
    protected ConditionValue xgetCValueSchdate() { return _myCQ.xdfgetSchdate(); }
    protected ConditionValue xgetCValueFlexibityno() { return _myCQ.xdfgetFlexibityno(); }
    protected ConditionValue xgetCValueTransportcd() { return _myCQ.xdfgetTransportcd(); }
    protected ConditionValue xgetCValueRcvdate() { return _myCQ.xdfgetRcvdate(); }
    protected ConditionValue xgetCValueOwnercd() { return _myCQ.xdfgetOwnercd(); }
    protected ConditionValue xgetCValueInstractdatetime() { return _myCQ.xdfgetInstractdatetime(); }
    protected ConditionValue xgetCValueRcvmakeflg() { return _myCQ.xdfgetRcvmakeflg(); }
    protected ConditionValue xgetCValueReflineno() { return _myCQ.xdfgetReflineno(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueManufacturedate() { return _myCQ.xdfgetManufacturedate(); }
    protected ConditionValue xgetCValueDesigncd() { return _myCQ.xdfgetDesigncd(); }
    protected ConditionValue xgetCValueQtycase() { return _myCQ.xdfgetQtycase(); }
    protected ConditionValue xgetCValueQtybowl() { return _myCQ.xdfgetQtybowl(); }
    protected ConditionValue xgetCValueCaseinfoflg() { return _myCQ.xdfgetCaseinfoflg(); }
    protected ConditionValue xgetCValueFactorycd() { return _myCQ.xdfgetFactorycd(); }
    protected ConditionValue xgetCValueItemcdCase() { return _myCQ.xdfgetItemcdCase(); }
    protected ConditionValue xgetCValueSkucd() { return _myCQ.xdfgetSkucd(); }
    protected ConditionValue xgetCValueDestinationcd() { return _myCQ.xdfgetDestinationcd(); }
    protected ConditionValue xgetCValueManufacturecd() { return _myCQ.xdfgetManufacturecd(); }
    protected ConditionValue xgetCValueOrderno() { return _myCQ.xdfgetOrderno(); }
    protected ConditionValue xgetCValueMachineno() { return _myCQ.xdfgetMachineno(); }
    protected ConditionValue xgetCValueCreateno() { return _myCQ.xdfgetCreateno(); }
    protected ConditionValue xgetCValueLimitdate() { return _myCQ.xdfgetLimitdate(); }
    protected ConditionValue xgetCValueDatetime() { return _myCQ.xdfgetDatetime(); }
    protected ConditionValue xgetCValueDistributioncd() { return _myCQ.xdfgetDistributioncd(); }
    protected ConditionValue xgetCValueOperationnum() { return _myCQ.xdfgetOperationnum(); }
    protected ConditionValue xgetCValueRcvkey() { return _myCQ.xdfgetRcvkey(); }
    protected ConditionValue xgetCValueFirmcarryno() { return _myCQ.xdfgetFirmcarryno(); }
    protected ConditionValue xgetCValueBatjproductionym() { return _myCQ.xdfgetBatjproductionym(); }
    protected ConditionValue xgetCValueCometodate() { return _myCQ.xdfgetCometodate(); }
    protected ConditionValue xgetCValueReceivedate() { return _myCQ.xdfgetReceivedate(); }
    protected ConditionValue xgetCValueCardboardno() { return _myCQ.xdfgetCardboardno(); }
    protected ConditionValue xgetCValueRcvpalletno() { return _myCQ.xdfgetRcvpalletno(); }
    protected ConditionValue xgetCValueTaxpalletno() { return _myCQ.xdfgetTaxpalletno(); }
    protected ConditionValue xgetCValueItemcdIn() { return _myCQ.xdfgetItemcdIn(); }
    protected ConditionValue xgetCValueItemcdWh() { return _myCQ.xdfgetItemcdWh(); }
    protected ConditionValue xgetCValueDesigncdIn() { return _myCQ.xdfgetDesigncdIn(); }
    protected ConditionValue xgetCValueDesigncdWh() { return _myCQ.xdfgetDesigncdWh(); }
    protected ConditionValue xgetCValueVaExtdata1() { return _myCQ.xdfgetVaExtdata1(); }
    protected ConditionValue xgetCValueVaExtdata2() { return _myCQ.xdfgetVaExtdata2(); }
    protected ConditionValue xgetCValueVaExtdata3() { return _myCQ.xdfgetVaExtdata3(); }
    protected ConditionValue xgetCValueNvExtdata1() { return _myCQ.xdfgetNvExtdata1(); }
    protected ConditionValue xgetCValueNvExtdata2() { return _myCQ.xdfgetNvExtdata2(); }
    protected ConditionValue xgetCValueNvExtdata3() { return _myCQ.xdfgetNvExtdata3(); }
    protected ConditionValue xgetCValueNmExtdata1() { return _myCQ.xdfgetNmExtdata1(); }
    protected ConditionValue xgetCValueNmExtdata2() { return _myCQ.xdfgetNmExtdata2(); }
    protected ConditionValue xgetCValueNmExtdata3() { return _myCQ.xdfgetNmExtdata3(); }
    protected ConditionValue xgetCValueDtExtdata1() { return _myCQ.xdfgetDtExtdata1(); }
    protected ConditionValue xgetCValueDtExtdata2() { return _myCQ.xdfgetDtExtdata2(); }
    protected ConditionValue xgetCValueDtExtdata3() { return _myCQ.xdfgetDtExtdata3(); }
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
    public String keepScalarCondition(TTrflexibilityproductCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrflexibilityproductCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrflexibilityproductCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrflexibilityproductCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrflexibilityproductCB.class.getName(); }
    protected String xinCQ() { return TTrflexibilityproductCQ.class.getName(); }
}

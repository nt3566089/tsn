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
 * The condition-query for in-line of T_TRSYMBOL.
 * @author DBFlute(AutoGenerator)
 */
public class TTrsymbolCIQ extends AbstractBsTTrsymbolCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrsymbolCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrsymbolCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrsymbolCQ myCQ) {
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
    protected ConditionValue xgetCValueTrsymbolId() { return _myCQ.xdfgetTrsymbolId(); }
    public String keepTrsymbolId_ExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepTrsymbolId_NotExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepTrsymbolId_SpecifyDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepTrsymbolId_QueryDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTrsymbolId_QueryDerivedReferrer_TCenterSymbolListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCasecd() { return _myCQ.xdfgetCasecd(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueItemcd() { return _myCQ.xdfgetItemcd(); }
    protected ConditionValue xgetCValueProductCdCase() { return _myCQ.xdfgetProductCdCase(); }
    protected ConditionValue xgetCValueProductCdIn() { return _myCQ.xdfgetProductCdIn(); }
    protected ConditionValue xgetCValueLot3() { return _myCQ.xdfgetLot3(); }
    protected ConditionValue xgetCValueDesigncdIn() { return _myCQ.xdfgetDesigncdIn(); }
    protected ConditionValue xgetCValueDesigncdCase() { return _myCQ.xdfgetDesigncdCase(); }
    protected ConditionValue xgetCValueLot4() { return _myCQ.xdfgetLot4(); }
    protected ConditionValue xgetCValueLot1() { return _myCQ.xdfgetLot1(); }
    protected ConditionValue xgetCValueLot2() { return _myCQ.xdfgetLot2(); }
    protected ConditionValue xgetCValueSymbollineno() { return _myCQ.xdfgetSymbollineno(); }
    protected ConditionValue xgetCValueOwnercd() { return _myCQ.xdfgetOwnercd(); }
    protected ConditionValue xgetCValueStockTypeCd() { return _myCQ.xdfgetStockTypeCd(); }
    protected ConditionValue xgetCValueForeigncargoflg() { return _myCQ.xdfgetForeigncargoflg(); }
    protected ConditionValue xgetCValueCustomsreleaseflg() { return _myCQ.xdfgetCustomsreleaseflg(); }
    protected ConditionValue xgetCValueDamageflg() { return _myCQ.xdfgetDamageflg(); }
    protected ConditionValue xgetCValueReceivePlanHId() { return _myCQ.xdfgetReceivePlanHId(); }
    protected ConditionValue xgetCValueReceivePlanBId() { return _myCQ.xdfgetReceivePlanBId(); }
    protected ConditionValue xgetCValueRcvlineno() { return _myCQ.xdfgetRcvlineno(); }
    protected ConditionValue xgetCValueSendrcvkey() { return _myCQ.xdfgetSendrcvkey(); }
    protected ConditionValue xgetCValueMakercaseno() { return _myCQ.xdfgetMakercaseno(); }
    protected ConditionValue xgetCValueSymbolsts() { return _myCQ.xdfgetSymbolsts(); }
    protected ConditionValue xgetCValueSymboladdflg() { return _myCQ.xdfgetSymboladdflg(); }
    protected ConditionValue xgetCValuePrintedflg() { return _myCQ.xdfgetPrintedflg(); }
    protected ConditionValue xgetCValueSymbolsnddate() { return _myCQ.xdfgetSymbolsnddate(); }
    protected ConditionValue xgetCValueSymbolpastdate() { return _myCQ.xdfgetSymbolpastdate(); }
    protected ConditionValue xgetCValueSymbolpalletondate() { return _myCQ.xdfgetSymbolpalletondate(); }
    protected ConditionValue xgetCValueReceivedate() { return _myCQ.xdfgetReceivedate(); }
    protected ConditionValue xgetCValuePalletId() { return _myCQ.xdfgetPalletId(); }
    protected ConditionValue xgetCValueBasePalletId() { return _myCQ.xdfgetBasePalletId(); }
    protected ConditionValue xgetCValueParentpalletupddate() { return _myCQ.xdfgetParentpalletupddate(); }
    protected ConditionValue xgetCValuePrintingdate() { return _myCQ.xdfgetPrintingdate(); }
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    protected ConditionValue xgetCValueRestqty() { return _myCQ.xdfgetRestqty(); }
    protected ConditionValue xgetCValueReceivedqty() { return _myCQ.xdfgetReceivedqty(); }
    protected ConditionValue xgetCValueDistributioncd() { return _myCQ.xdfgetDistributioncd(); }
    protected ConditionValue xgetCValueTransportcd() { return _myCQ.xdfgetTransportcd(); }
    protected ConditionValue xgetCValueOrderno() { return _myCQ.xdfgetOrderno(); }
    protected ConditionValue xgetCValueRcvPalletId() { return _myCQ.xdfgetRcvPalletId(); }
    protected ConditionValue xgetCValueSymbolfactorycd() { return _myCQ.xdfgetSymbolfactorycd(); }
    protected ConditionValue xgetCValueSymbolitemcd() { return _myCQ.xdfgetSymbolitemcd(); }
    protected ConditionValue xgetCValueSymbolsku() { return _myCQ.xdfgetSymbolsku(); }
    protected ConditionValue xgetCValueSymbolreceivecd() { return _myCQ.xdfgetSymbolreceivecd(); }
    protected ConditionValue xgetCValueSymbolproductmark() { return _myCQ.xdfgetSymbolproductmark(); }
    protected ConditionValue xgetCValueSymbolorderno() { return _myCQ.xdfgetSymbolorderno(); }
    protected ConditionValue xgetCValueSymbolprinterno() { return _myCQ.xdfgetSymbolprinterno(); }
    protected ConditionValue xgetCValueSymbolmakeno() { return _myCQ.xdfgetSymbolmakeno(); }
    protected ConditionValue xgetCValueSymbollot4() { return _myCQ.xdfgetSymbollot4(); }
    protected ConditionValue xgetCValueSymbolmaketime() { return _myCQ.xdfgetSymbolmaketime(); }
    protected ConditionValue xgetCValueSymbolcirculationid() { return _myCQ.xdfgetSymbolcirculationid(); }
    protected ConditionValue xgetCValueSymbolrcvkey() { return _myCQ.xdfgetSymbolrcvkey(); }
    protected ConditionValue xgetCValueSymbollot3() { return _myCQ.xdfgetSymbollot3(); }
    protected ConditionValue xgetCValueQrdata() { return _myCQ.xdfgetQrdata(); }
    protected ConditionValue xgetCValueTrexamresultId() { return _myCQ.xdfgetTrexamresultId(); }
    protected ConditionValue xgetCValueCaseitfno() { return _myCQ.xdfgetCaseitfno(); }
    protected ConditionValue xgetCValueCasebarcodevaliant() { return _myCQ.xdfgetCasebarcodevaliant(); }
    protected ConditionValue xgetCValueCaselot4() { return _myCQ.xdfgetCaselot4(); }
    protected ConditionValue xgetCValueDatetime() { return _myCQ.xdfgetDatetime(); }
    protected ConditionValue xgetCValueCasecenterno() { return _myCQ.xdfgetCasecenterno(); }
    protected ConditionValue xgetCValueCasepackno() { return _myCQ.xdfgetCasepackno(); }
    protected ConditionValue xgetCValueCasepacktime() { return _myCQ.xdfgetCasepacktime(); }
    protected ConditionValue xgetCValueCasebarcode() { return _myCQ.xdfgetCasebarcode(); }
    protected ConditionValue xgetCValueMixedflg() { return _myCQ.xdfgetMixedflg(); }
    protected ConditionValue xgetCValueShippedflg() { return _myCQ.xdfgetShippedflg(); }
    protected ConditionValue xgetCValueCasecreatetype() { return _myCQ.xdfgetCasecreatetype(); }
    protected ConditionValue xgetCValueCreatedatetime() { return _myCQ.xdfgetCreatedatetime(); }
    protected ConditionValue xgetCValueInitnum() { return _myCQ.xdfgetInitnum(); }
    protected ConditionValue xgetCValueParentcasecd() { return _myCQ.xdfgetParentcasecd(); }
    protected ConditionValue xgetCValueTrPicklistId() { return _myCQ.xdfgetTrPicklistId(); }
    protected ConditionValue xgetCValuePicklistgno() { return _myCQ.xdfgetPicklistgno(); }
    protected ConditionValue xgetCValueRecombdatetime() { return _myCQ.xdfgetRecombdatetime(); }
    protected ConditionValue xgetCValueReprintedflg() { return _myCQ.xdfgetReprintedflg(); }
    protected ConditionValue xgetCValueTracests() { return _myCQ.xdfgetTracests(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    protected ConditionValue xgetCValueBatjproductionym() { return _myCQ.xdfgetBatjproductionym(); }
    protected ConditionValue xgetCValueCometodate() { return _myCQ.xdfgetCometodate(); }
    protected ConditionValue xgetCValueRcvpalletno() { return _myCQ.xdfgetRcvpalletno(); }
    protected ConditionValue xgetCValueTaxpalletno() { return _myCQ.xdfgetTaxpalletno(); }
    protected ConditionValue xgetCValueShtypecd() { return _myCQ.xdfgetShtypecd(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    protected ConditionValue xgetCValueRestctn() { return _myCQ.xdfgetRestctn(); }
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
    public String keepScalarCondition(TTrsymbolCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrsymbolCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrsymbolCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrsymbolCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrsymbolCB.class.getName(); }
    protected String xinCQ() { return TTrsymbolCQ.class.getName(); }
}

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
 * The condition-query for in-line of E_TRACKING_INFO_IMPORT.
 * @author DBFlute(AutoGenerator)
 */
public class ETrackingInfoImportCIQ extends AbstractBsETrackingInfoImportCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsETrackingInfoImportCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ETrackingInfoImportCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsETrackingInfoImportCQ myCQ) {
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
    protected ConditionValue xgetCValueTrackingInfoImportId() { return _myCQ.xdfgetTrackingInfoImportId(); }
    protected ConditionValue xgetCValueSymbolposkey() { return _myCQ.xdfgetSymbolposkey(); }
    protected ConditionValue xgetCValueWarehousecd() { return _myCQ.xdfgetWarehousecd(); }
    protected ConditionValue xgetCValueWarehouseSname() { return _myCQ.xdfgetWarehouseSname(); }
    protected ConditionValue xgetCValueFactorySname() { return _myCQ.xdfgetFactorySname(); }
    protected ConditionValue xgetCValueFactorycd() { return _myCQ.xdfgetFactorycd(); }
    protected ConditionValue xgetCValueItemcdCase() { return _myCQ.xdfgetItemcdCase(); }
    protected ConditionValue xgetCValueItemSnameCase() { return _myCQ.xdfgetItemSnameCase(); }
    protected ConditionValue xgetCValueItemcdWh() { return _myCQ.xdfgetItemcdWh(); }
    protected ConditionValue xgetCValueItemSnameWh() { return _myCQ.xdfgetItemSnameWh(); }
    protected ConditionValue xgetCValueRcvkey() { return _myCQ.xdfgetRcvkey(); }
    protected ConditionValue xgetCValueMachineno() { return _myCQ.xdfgetMachineno(); }
    protected ConditionValue xgetCValueCreateno() { return _myCQ.xdfgetCreateno(); }
    protected ConditionValue xgetCValueLimitdatenow() { return _myCQ.xdfgetLimitdatenow(); }
    protected ConditionValue xgetCValueDesigncdCase() { return _myCQ.xdfgetDesigncdCase(); }
    protected ConditionValue xgetCValueLot1() { return _myCQ.xdfgetLot1(); }
    protected ConditionValue xgetCValueManufacturecd() { return _myCQ.xdfgetManufacturecd(); }
    protected ConditionValue xgetCValueOtherlot1() { return _myCQ.xdfgetOtherlot1(); }
    protected ConditionValue xgetCValueCasecreatetype() { return _myCQ.xdfgetCasecreatetype(); }
    protected ConditionValue xgetCValueCasecreatetypeNm() { return _myCQ.xdfgetCasecreatetypeNm(); }
    protected ConditionValue xgetCValueReceivedate() { return _myCQ.xdfgetReceivedate(); }
    protected ConditionValue xgetCValueArrivalportdate() { return _myCQ.xdfgetArrivalportdate(); }
    protected ConditionValue xgetCValueShipname() { return _myCQ.xdfgetShipname(); }
    protected ConditionValue xgetCValueInitnum() { return _myCQ.xdfgetInitnum(); }
    protected ConditionValue xgetCValueMixedflg() { return _myCQ.xdfgetMixedflg(); }
    protected ConditionValue xgetCValueLendflg() { return _myCQ.xdfgetLendflg(); }
    protected ConditionValue xgetCValueLocgroup() { return _myCQ.xdfgetLocgroup(); }
    protected ConditionValue xgetCValueLoccd() { return _myCQ.xdfgetLoccd(); }
    protected ConditionValue xgetCValueShipdate() { return _myCQ.xdfgetShipdate(); }
    protected ConditionValue xgetCValueCurrentLocationCd() { return _myCQ.xdfgetCurrentLocationCd(); }
    protected ConditionValue xgetCValueCurrentLocationSname() { return _myCQ.xdfgetCurrentLocationSname(); }
    protected ConditionValue xgetCValueAdddatetime() { return _myCQ.xdfgetAdddatetime(); }
    protected ConditionValue xgetCValueTracetype() { return _myCQ.xdfgetTracetype(); }
    protected ConditionValue xgetCValueOthercd1() { return _myCQ.xdfgetOthercd1(); }
    protected ConditionValue xgetCValueExamsts() { return _myCQ.xdfgetExamsts(); }
    protected ConditionValue xgetCValueCaseinnumbowl() { return _myCQ.xdfgetCaseinnumbowl(); }
    protected ConditionValue xgetCValueShipnumbowl() { return _myCQ.xdfgetShipnumbowl(); }
    protected ConditionValue xgetCValueSupplierrcvno() { return _myCQ.xdfgetSupplierrcvno(); }
    protected ConditionValue xgetCValueTokuhancd() { return _myCQ.xdfgetTokuhancd(); }
    protected ConditionValue xgetCValueTokuhanNm() { return _myCQ.xdfgetTokuhanNm(); }
    protected ConditionValue xgetCValueMakercaseno() { return _myCQ.xdfgetMakercaseno(); }
    protected ConditionValue xgetCValueCaseitfno() { return _myCQ.xdfgetCaseitfno(); }
    protected ConditionValue xgetCValueCasebarcodevaliant() { return _myCQ.xdfgetCasebarcodevaliant(); }
    protected ConditionValue xgetCValueCaselot4() { return _myCQ.xdfgetCaselot4(); }
    protected ConditionValue xgetCValueCasecenterno() { return _myCQ.xdfgetCasecenterno(); }
    protected ConditionValue xgetCValueCasepackno() { return _myCQ.xdfgetCasepackno(); }
    protected ConditionValue xgetCValueCasepacktime() { return _myCQ.xdfgetCasepacktime(); }
    protected ConditionValue xgetCValueSenderLocation() { return _myCQ.xdfgetSenderLocation(); }
    protected ConditionValue xgetCValueReceiverLocation() { return _myCQ.xdfgetReceiverLocation(); }
    protected ConditionValue xgetCValueShipmentId() { return _myCQ.xdfgetShipmentId(); }
    protected ConditionValue xgetCValueShipmentDate() { return _myCQ.xdfgetShipmentDate(); }
    protected ConditionValue xgetCValueNumberOfPallets() { return _myCQ.xdfgetNumberOfPallets(); }
    protected ConditionValue xgetCValueCarrierno() { return _myCQ.xdfgetCarrierno(); }
    protected ConditionValue xgetCValueTkhnorderno() { return _myCQ.xdfgetTkhnorderno(); }
    protected ConditionValue xgetCValueSrccd() { return _myCQ.xdfgetSrccd(); }
    protected ConditionValue xgetCValueBlno() { return _myCQ.xdfgetBlno(); }
    protected ConditionValue xgetCValueInvoiceno() { return _myCQ.xdfgetInvoiceno(); }
    protected ConditionValue xgetCValueSscc() { return _myCQ.xdfgetSscc(); }
    protected ConditionValue xgetCValueCaseno() { return _myCQ.xdfgetCaseno(); }
    protected ConditionValue xgetCValueInvNum() { return _myCQ.xdfgetInvNum(); }
    protected ConditionValue xgetCValueSortNum() { return _myCQ.xdfgetSortNum(); }
    protected ConditionValue xgetCValueAdoptNum() { return _myCQ.xdfgetAdoptNum(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueSendFlg() { return _myCQ.xdfgetSendFlg(); }
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
    public String keepScalarCondition(ETrackingInfoImportCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(ETrackingInfoImportCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(ETrackingInfoImportCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(ETrackingInfoImportCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ETrackingInfoImportCB.class.getName(); }
    protected String xinCQ() { return ETrackingInfoImportCQ.class.getName(); }
}

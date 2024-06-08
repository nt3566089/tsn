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
 * The condition-query for in-line of E_SHOP_IMPORT_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class EShopImportSendCIQ extends AbstractBsEShopImportSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEShopImportSendCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EShopImportSendCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEShopImportSendCQ myCQ) {
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
    protected ConditionValue xgetCValueShopImportSendId() { return _myCQ.xdfgetShopImportSendId(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueSendRowId() { return _myCQ.xdfgetSendRowId(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
    protected ConditionValue xgetCValueSymbolPosKey() { return _myCQ.xdfgetSymbolPosKey(); }
    protected ConditionValue xgetCValueWarehouseCd() { return _myCQ.xdfgetWarehouseCd(); }
    protected ConditionValue xgetCValueWarehouseSname() { return _myCQ.xdfgetWarehouseSname(); }
    protected ConditionValue xgetCValueFactoryCd() { return _myCQ.xdfgetFactoryCd(); }
    protected ConditionValue xgetCValueFactorySname() { return _myCQ.xdfgetFactorySname(); }
    protected ConditionValue xgetCValueItemCdCase() { return _myCQ.xdfgetItemCdCase(); }
    protected ConditionValue xgetCValueItemSnameCase() { return _myCQ.xdfgetItemSnameCase(); }
    protected ConditionValue xgetCValueItemCdWh() { return _myCQ.xdfgetItemCdWh(); }
    protected ConditionValue xgetCValueItemSnameWh() { return _myCQ.xdfgetItemSnameWh(); }
    protected ConditionValue xgetCValueRcvKey() { return _myCQ.xdfgetRcvKey(); }
    protected ConditionValue xgetCValueMachineNo() { return _myCQ.xdfgetMachineNo(); }
    protected ConditionValue xgetCValueCreateNo() { return _myCQ.xdfgetCreateNo(); }
    protected ConditionValue xgetCValueLimitDateNow() { return _myCQ.xdfgetLimitDateNow(); }
    protected ConditionValue xgetCValueDesignCdCase() { return _myCQ.xdfgetDesignCdCase(); }
    protected ConditionValue xgetCValueFirmtransportNo() { return _myCQ.xdfgetFirmtransportNo(); }
    protected ConditionValue xgetCValueManufactureCd() { return _myCQ.xdfgetManufactureCd(); }
    protected ConditionValue xgetCValueOtherLot1() { return _myCQ.xdfgetOtherLot1(); }
    protected ConditionValue xgetCValueCaseCreateType() { return _myCQ.xdfgetCaseCreateType(); }
    protected ConditionValue xgetCValueCodeSname() { return _myCQ.xdfgetCodeSname(); }
    protected ConditionValue xgetCValueReceiveDate() { return _myCQ.xdfgetReceiveDate(); }
    protected ConditionValue xgetCValueArrivalPortDate() { return _myCQ.xdfgetArrivalPortDate(); }
    protected ConditionValue xgetCValueShipName() { return _myCQ.xdfgetShipName(); }
    protected ConditionValue xgetCValueInitNum() { return _myCQ.xdfgetInitNum(); }
    protected ConditionValue xgetCValueMixedFlg() { return _myCQ.xdfgetMixedFlg(); }
    protected ConditionValue xgetCValueLendFlg() { return _myCQ.xdfgetLendFlg(); }
    protected ConditionValue xgetCValueLocGroup() { return _myCQ.xdfgetLocGroup(); }
    protected ConditionValue xgetCValueLocCd() { return _myCQ.xdfgetLocCd(); }
    protected ConditionValue xgetCValueShipDate() { return _myCQ.xdfgetShipDate(); }
    protected ConditionValue xgetCValueCurrentLocationCd() { return _myCQ.xdfgetCurrentLocationCd(); }
    protected ConditionValue xgetCValueCurrentLocationSname() { return _myCQ.xdfgetCurrentLocationSname(); }
    protected ConditionValue xgetCValueShipToCd() { return _myCQ.xdfgetShipToCd(); }
    protected ConditionValue xgetCValueShipToSname() { return _myCQ.xdfgetShipToSname(); }
    protected ConditionValue xgetCValueCreateDatetime() { return _myCQ.xdfgetCreateDatetime(); }
    protected ConditionValue xgetCValueTraceType() { return _myCQ.xdfgetTraceType(); }
    protected ConditionValue xgetCValueTraceTypeSname() { return _myCQ.xdfgetTraceTypeSname(); }
    protected ConditionValue xgetCValueExamSts() { return _myCQ.xdfgetExamSts(); }
    protected ConditionValue xgetCValueCaseInNum() { return _myCQ.xdfgetCaseInNum(); }
    protected ConditionValue xgetCValueShippingNum() { return _myCQ.xdfgetShippingNum(); }
    protected ConditionValue xgetCValueAssortDatetime() { return _myCQ.xdfgetAssortDatetime(); }
    protected ConditionValue xgetCValueLineBlock() { return _myCQ.xdfgetLineBlock(); }
    protected ConditionValue xgetCValueAssortedUnit() { return _myCQ.xdfgetAssortedUnit(); }
    protected ConditionValue xgetCValueAssortedIndex() { return _myCQ.xdfgetAssortedIndex(); }
    protected ConditionValue xgetCValueOperationCode() { return _myCQ.xdfgetOperationCode(); }
    protected ConditionValue xgetCValueOperationNum() { return _myCQ.xdfgetOperationNum(); }
    protected ConditionValue xgetCValueAssortNum() { return _myCQ.xdfgetAssortNum(); }
    protected ConditionValue xgetCValueAssortDifNum() { return _myCQ.xdfgetAssortDifNum(); }
    protected ConditionValue xgetCValueDirectionCd() { return _myCQ.xdfgetDirectionCd(); }
    protected ConditionValue xgetCValuePistonType() { return _myCQ.xdfgetPistonType(); }
    protected ConditionValue xgetCValueCustomerCd() { return _myCQ.xdfgetCustomerCd(); }
    protected ConditionValue xgetCValueDirectionNum() { return _myCQ.xdfgetDirectionNum(); }
    protected ConditionValue xgetCValueSupplierRcvNo() { return _myCQ.xdfgetSupplierRcvNo(); }
    protected ConditionValue xgetCValueTokuhanCd() { return _myCQ.xdfgetTokuhanCd(); }
    protected ConditionValue xgetCValueTokuhanSname() { return _myCQ.xdfgetTokuhanSname(); }
    protected ConditionValue xgetCValueMakerCaseNo() { return _myCQ.xdfgetMakerCaseNo(); }
    protected ConditionValue xgetCValueCaseItfNo() { return _myCQ.xdfgetCaseItfNo(); }
    protected ConditionValue xgetCValueCaseBarcodeValiant() { return _myCQ.xdfgetCaseBarcodeValiant(); }
    protected ConditionValue xgetCValueCaseLot4() { return _myCQ.xdfgetCaseLot4(); }
    protected ConditionValue xgetCValueCaseCenterNo() { return _myCQ.xdfgetCaseCenterNo(); }
    protected ConditionValue xgetCValueCasePackNo() { return _myCQ.xdfgetCasePackNo(); }
    protected ConditionValue xgetCValueCasePackTime() { return _myCQ.xdfgetCasePackTime(); }
    protected ConditionValue xgetCValueSenderLocation() { return _myCQ.xdfgetSenderLocation(); }
    protected ConditionValue xgetCValueReceiverLocation() { return _myCQ.xdfgetReceiverLocation(); }
    protected ConditionValue xgetCValueShipmentId() { return _myCQ.xdfgetShipmentId(); }
    protected ConditionValue xgetCValueShipmentDate() { return _myCQ.xdfgetShipmentDate(); }
    protected ConditionValue xgetCValueNumberOfPallets() { return _myCQ.xdfgetNumberOfPallets(); }
    protected ConditionValue xgetCValueCarrierNo() { return _myCQ.xdfgetCarrierNo(); }
    protected ConditionValue xgetCValueOrderNo() { return _myCQ.xdfgetOrderNo(); }
    protected ConditionValue xgetCValueSrcCd() { return _myCQ.xdfgetSrcCd(); }
    protected ConditionValue xgetCValueBlNo() { return _myCQ.xdfgetBlNo(); }
    protected ConditionValue xgetCValueInvoiceNo() { return _myCQ.xdfgetInvoiceNo(); }
    protected ConditionValue xgetCValueSscc() { return _myCQ.xdfgetSscc(); }
    protected ConditionValue xgetCValueCaseNo() { return _myCQ.xdfgetCaseNo(); }
    protected ConditionValue xgetCValueInvNum() { return _myCQ.xdfgetInvNum(); }
    protected ConditionValue xgetCValueSortNum() { return _myCQ.xdfgetSortNum(); }
    protected ConditionValue xgetCValueAdoptNum() { return _myCQ.xdfgetAdoptNum(); }
    protected ConditionValue xgetCValueDeliveryDatetime() { return _myCQ.xdfgetDeliveryDatetime(); }
    protected ConditionValue xgetCValueSpareStr() { return _myCQ.xdfgetSpareStr(); }
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
    public String keepScalarCondition(EShopImportSendCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EShopImportSendCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EShopImportSendCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EShopImportSendCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EShopImportSendCB.class.getName(); }
    protected String xinCQ() { return EShopImportSendCQ.class.getName(); }
}

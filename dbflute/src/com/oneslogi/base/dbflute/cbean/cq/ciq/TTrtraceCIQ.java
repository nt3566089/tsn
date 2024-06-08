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
 * The condition-query for in-line of T_TRTRACE.
 * @author DBFlute(AutoGenerator)
 */
public class TTrtraceCIQ extends AbstractBsTTrtraceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrtraceCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrtraceCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrtraceCQ myCQ) {
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
    protected ConditionValue xgetCValueTrtraceId() { return _myCQ.xdfgetTrtraceId(); }
    protected ConditionValue xgetCValueTracekey() { return _myCQ.xdfgetTracekey(); }
    protected ConditionValue xgetCValueSndrcvdatetime() { return _myCQ.xdfgetSndrcvdatetime(); }
    protected ConditionValue xgetCValueWarehousecd() { return _myCQ.xdfgetWarehousecd(); }
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
    protected ConditionValue xgetCValueTransportcd() { return _myCQ.xdfgetTransportcd(); }
    protected ConditionValue xgetCValuePalletid() { return _myCQ.xdfgetPalletid(); }
    protected ConditionValue xgetCValueInitnum() { return _myCQ.xdfgetInitnum(); }
    protected ConditionValue xgetCValueCreatedatetime() { return _myCQ.xdfgetCreatedatetime(); }
    protected ConditionValue xgetCValueAssortdatetime() { return _myCQ.xdfgetAssortdatetime(); }
    protected ConditionValue xgetCValueTracetype() { return _myCQ.xdfgetTracetype(); }
    protected ConditionValue xgetCValueLineblock() { return _myCQ.xdfgetLineblock(); }
    protected ConditionValue xgetCValueAssortedunit() { return _myCQ.xdfgetAssortedunit(); }
    protected ConditionValue xgetCValueAssortedindex() { return _myCQ.xdfgetAssortedindex(); }
    protected ConditionValue xgetCValueOperationcode() { return _myCQ.xdfgetOperationcode(); }
    protected ConditionValue xgetCValueCaseinnum() { return _myCQ.xdfgetCaseinnum(); }
    protected ConditionValue xgetCValueAssortnum() { return _myCQ.xdfgetAssortnum(); }
    protected ConditionValue xgetCValueAssortdifnum() { return _myCQ.xdfgetAssortdifnum(); }
    protected ConditionValue xgetCValueDirectioncd() { return _myCQ.xdfgetDirectioncd(); }
    protected ConditionValue xgetCValuePistontype() { return _myCQ.xdfgetPistontype(); }
    protected ConditionValue xgetCValueCustomercd() { return _myCQ.xdfgetCustomercd(); }
    protected ConditionValue xgetCValueDirectionnum() { return _myCQ.xdfgetDirectionnum(); }
    protected ConditionValue xgetCValueDistwarehousecd() { return _myCQ.xdfgetDistwarehousecd(); }
    protected ConditionValue xgetCValueRcvkey() { return _myCQ.xdfgetRcvkey(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueItemcdIn() { return _myCQ.xdfgetItemcdIn(); }
    protected ConditionValue xgetCValueItemcdWh() { return _myCQ.xdfgetItemcdWh(); }
    protected ConditionValue xgetCValueDesigncdCase() { return _myCQ.xdfgetDesigncdCase(); }
    protected ConditionValue xgetCValueDesigncdIn() { return _myCQ.xdfgetDesigncdIn(); }
    protected ConditionValue xgetCValueDesigncdWh() { return _myCQ.xdfgetDesigncdWh(); }
    protected ConditionValue xgetCValueSourcecasecd() { return _myCQ.xdfgetSourcecasecd(); }
    protected ConditionValue xgetCValueSendflg() { return _myCQ.xdfgetSendflg(); }
    protected ConditionValue xgetCValueFromflg() { return _myCQ.xdfgetFromflg(); }
    protected ConditionValue xgetCValueSupplierrcvno() { return _myCQ.xdfgetSupplierrcvno(); }
    protected ConditionValue xgetCValueMixedflg() { return _myCQ.xdfgetMixedflg(); }
    protected ConditionValue xgetCValueSymbolpastdate() { return _myCQ.xdfgetSymbolpastdate(); }
    protected ConditionValue xgetCValueLot1() { return _myCQ.xdfgetLot1(); }
    protected ConditionValue xgetCValueLot2() { return _myCQ.xdfgetLot2(); }
    protected ConditionValue xgetCValueLot3() { return _myCQ.xdfgetLot3(); }
    protected ConditionValue xgetCValueLot4() { return _myCQ.xdfgetLot4(); }
    protected ConditionValue xgetCValueOtherlot1() { return _myCQ.xdfgetOtherlot1(); }
    protected ConditionValue xgetCValueMakercaseno() { return _myCQ.xdfgetMakercaseno(); }
    protected ConditionValue xgetCValueLendflg() { return _myCQ.xdfgetLendflg(); }
    protected ConditionValue xgetCValueCaseinnumcalc() { return _myCQ.xdfgetCaseinnumcalc(); }
    protected ConditionValue xgetCValueCaseitfno() { return _myCQ.xdfgetCaseitfno(); }
    protected ConditionValue xgetCValueCasebarcodevaliant() { return _myCQ.xdfgetCasebarcodevaliant(); }
    protected ConditionValue xgetCValueCaselot4() { return _myCQ.xdfgetCaselot4(); }
    protected ConditionValue xgetCValueCasecenterno() { return _myCQ.xdfgetCasecenterno(); }
    protected ConditionValue xgetCValueCasepackno() { return _myCQ.xdfgetCasepackno(); }
    protected ConditionValue xgetCValueCasepacktime() { return _myCQ.xdfgetCasepacktime(); }
    protected ConditionValue xgetCValueCasebarcode() { return _myCQ.xdfgetCasebarcode(); }
    protected ConditionValue xgetCValueOtherrefno2() { return _myCQ.xdfgetOtherrefno2(); }
    protected ConditionValue xgetCValueOrdertype() { return _myCQ.xdfgetOrdertype(); }
    protected ConditionValue xgetCValueLimitdatenow() { return _myCQ.xdfgetLimitdatenow(); }
    protected ConditionValue xgetCValueCasecreatetype() { return _myCQ.xdfgetCasecreatetype(); }
    protected ConditionValue xgetCValueReceivedate() { return _myCQ.xdfgetReceivedate(); }
    protected ConditionValue xgetCValueArrivalportdate() { return _myCQ.xdfgetArrivalportdate(); }
    protected ConditionValue xgetCValueShipname() { return _myCQ.xdfgetShipname(); }
    protected ConditionValue xgetCValueLocgroup() { return _myCQ.xdfgetLocgroup(); }
    protected ConditionValue xgetCValueLoccd() { return _myCQ.xdfgetLoccd(); }
    protected ConditionValue xgetCValueShipdate() { return _myCQ.xdfgetShipdate(); }
    protected ConditionValue xgetCValueShiptocd() { return _myCQ.xdfgetShiptocd(); }
    protected ConditionValue xgetCValueExamsts() { return _myCQ.xdfgetExamsts(); }
    protected ConditionValue xgetCValueTokuhancd() { return _myCQ.xdfgetTokuhancd(); }
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
    protected ConditionValue xgetCValueReservearea() { return _myCQ.xdfgetReservearea(); }
    protected ConditionValue xgetCValueVaExtdata1() { return _myCQ.xdfgetVaExtdata1(); }
    protected ConditionValue xgetCValueVaExtdata2() { return _myCQ.xdfgetVaExtdata2(); }
    protected ConditionValue xgetCValueVaExtdata3() { return _myCQ.xdfgetVaExtdata3(); }
    protected ConditionValue xgetCValueDtExtdata2() { return _myCQ.xdfgetDtExtdata2(); }
    protected ConditionValue xgetCValuePalletNo() { return _myCQ.xdfgetPalletNo(); }
    protected ConditionValue xgetCValuePickListKey() { return _myCQ.xdfgetPickListKey(); }
    protected ConditionValue xgetCValueFrontBackCaseCd() { return _myCQ.xdfgetFrontBackCaseCd(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
    protected ConditionValue xgetCValueTransportPriority() { return _myCQ.xdfgetTransportPriority(); }
    protected ConditionValue xgetCValueUseType() { return _myCQ.xdfgetUseType(); }
    protected ConditionValue xgetCValueOutputOrder() { return _myCQ.xdfgetOutputOrder(); }
    protected ConditionValue xgetCValueFactoryOrder() { return _myCQ.xdfgetFactoryOrder(); }
    protected ConditionValue xgetCValueWarehouseOrder() { return _myCQ.xdfgetWarehouseOrder(); }
    protected ConditionValue xgetCValueLineblockOrder() { return _myCQ.xdfgetLineblockOrder(); }
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
    public String keepScalarCondition(TTrtraceCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrtraceCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrtraceCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrtraceCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrtraceCB.class.getName(); }
    protected String xinCQ() { return TTrtraceCQ.class.getName(); }
}

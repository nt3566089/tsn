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
 * The condition-query for in-line of E_SHIPPING_RECORD_DATA.
 * @author DBFlute(AutoGenerator)
 */
public class EShippingRecordDataCIQ extends AbstractBsEShippingRecordDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEShippingRecordDataCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EShippingRecordDataCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEShippingRecordDataCQ myCQ) {
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
    protected ConditionValue xgetCValueShippingRecordDataId() { return _myCQ.xdfgetShippingRecordDataId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueDataFlg() { return _myCQ.xdfgetDataFlg(); }
    protected ConditionValue xgetCValueRecordData() { return _myCQ.xdfgetRecordData(); }
    protected ConditionValue xgetCValueTransportcd() { return _myCQ.xdfgetTransportcd(); }
    protected ConditionValue xgetCValueItemcdH() { return _myCQ.xdfgetItemcdH(); }
    protected ConditionValue xgetCValueOrdernoH() { return _myCQ.xdfgetOrdernoH(); }
    protected ConditionValue xgetCValueCaseqty() { return _myCQ.xdfgetCaseqty(); }
    protected ConditionValue xgetCValueFractqty() { return _myCQ.xdfgetFractqty(); }
    protected ConditionValue xgetCValueShiptocd() { return _myCQ.xdfgetShiptocd(); }
    protected ConditionValue xgetCValueFactorycd() { return _myCQ.xdfgetFactorycd(); }
    protected ConditionValue xgetCValueItemcdM() { return _myCQ.xdfgetItemcdM(); }
    protected ConditionValue xgetCValueSkucd() { return _myCQ.xdfgetSkucd(); }
    protected ConditionValue xgetCValueDestinationcd() { return _myCQ.xdfgetDestinationcd(); }
    protected ConditionValue xgetCValueManufacturecd() { return _myCQ.xdfgetManufacturecd(); }
    protected ConditionValue xgetCValueOrdernoM() { return _myCQ.xdfgetOrdernoM(); }
    protected ConditionValue xgetCValueMachineno() { return _myCQ.xdfgetMachineno(); }
    protected ConditionValue xgetCValueCreateno() { return _myCQ.xdfgetCreateno(); }
    protected ConditionValue xgetCValueLimitdate() { return _myCQ.xdfgetLimitdate(); }
    protected ConditionValue xgetCValueCaselot4() { return _myCQ.xdfgetCaselot4(); }
    protected ConditionValue xgetCValueDistributioncd() { return _myCQ.xdfgetDistributioncd(); }
    protected ConditionValue xgetCValuePalletid() { return _myCQ.xdfgetPalletid(); }
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
    public String keepScalarCondition(EShippingRecordDataCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EShippingRecordDataCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EShippingRecordDataCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EShippingRecordDataCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EShippingRecordDataCB.class.getName(); }
    protected String xinCQ() { return EShippingRecordDataCQ.class.getName(); }
}

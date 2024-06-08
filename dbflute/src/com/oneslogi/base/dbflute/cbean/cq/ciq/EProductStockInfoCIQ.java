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
 * The condition-query for in-line of E_PRODUCT_STOCK_INFO.
 * @author DBFlute(AutoGenerator)
 */
public class EProductStockInfoCIQ extends AbstractBsEProductStockInfoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEProductStockInfoCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EProductStockInfoCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEProductStockInfoCQ myCQ) {
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
    protected ConditionValue xgetCValueEProductStockInfoId() { return _myCQ.xdfgetEProductStockInfoId(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueSendRowId() { return _myCQ.xdfgetSendRowId(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    protected ConditionValue xgetCValueSeq() { return _myCQ.xdfgetSeq(); }
    protected ConditionValue xgetCValueInOutKbn() { return _myCQ.xdfgetInOutKbn(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueCenterNm() { return _myCQ.xdfgetCenterNm(); }
    protected ConditionValue xgetCValueExecuteDate() { return _myCQ.xdfgetExecuteDate(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueProductNm() { return _myCQ.xdfgetProductNm(); }
    protected ConditionValue xgetCValueStockLocation() { return _myCQ.xdfgetStockLocation(); }
    protected ConditionValue xgetCValueStockLocationNm() { return _myCQ.xdfgetStockLocationNm(); }
    protected ConditionValue xgetCValueManufactureDate() { return _myCQ.xdfgetManufactureDate(); }
    protected ConditionValue xgetCValueDesignKbn() { return _myCQ.xdfgetDesignKbn(); }
    protected ConditionValue xgetCValueLocationCd() { return _myCQ.xdfgetLocationCd(); }
    protected ConditionValue xgetCValueTransportCd() { return _myCQ.xdfgetTransportCd(); }
    protected ConditionValue xgetCValueFirmCarryNo() { return _myCQ.xdfgetFirmCarryNo(); }
    protected ConditionValue xgetCValueSourceCd() { return _myCQ.xdfgetSourceCd(); }
    protected ConditionValue xgetCValueSourceNm() { return _myCQ.xdfgetSourceNm(); }
    protected ConditionValue xgetCValueSchDate() { return _myCQ.xdfgetSchDate(); }
    protected ConditionValue xgetCValueRcvDate() { return _myCQ.xdfgetRcvDate(); }
    protected ConditionValue xgetCValuePTdayTotalDiffQty() { return _myCQ.xdfgetPTdayTotalDiffQty(); }
    protected ConditionValue xgetCValuePQty() { return _myCQ.xdfgetPQty(); }
    protected ConditionValue xgetCValuePInventoryNum() { return _myCQ.xdfgetPInventoryNum(); }
    protected ConditionValue xgetCValuePYdayTotalDiffQty() { return _myCQ.xdfgetPYdayTotalDiffQty(); }
    protected ConditionValue xgetCValuePTdayDiffQty() { return _myCQ.xdfgetPTdayDiffQty(); }
    protected ConditionValue xgetCValueSlYdayTotalDiffQty() { return _myCQ.xdfgetSlYdayTotalDiffQty(); }
    protected ConditionValue xgetCValueSlTdayDiffQty() { return _myCQ.xdfgetSlTdayDiffQty(); }
    protected ConditionValue xgetCValueQty() { return _myCQ.xdfgetQty(); }
    protected ConditionValue xgetCValueInventoryNum() { return _myCQ.xdfgetInventoryNum(); }
    protected ConditionValue xgetCValueUserUse4() { return _myCQ.xdfgetUserUse4(); }
    protected ConditionValue xgetCValueLotAtrb1Title() { return _myCQ.xdfgetLotAtrb1Title(); }
    protected ConditionValue xgetCValueUserNum4() { return _myCQ.xdfgetUserNum4(); }
    protected ConditionValue xgetCValueUserNum3() { return _myCQ.xdfgetUserNum3(); }
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
    public String keepScalarCondition(EProductStockInfoCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EProductStockInfoCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EProductStockInfoCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EProductStockInfoCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EProductStockInfoCB.class.getName(); }
    protected String xinCQ() { return EProductStockInfoCQ.class.getName(); }
}

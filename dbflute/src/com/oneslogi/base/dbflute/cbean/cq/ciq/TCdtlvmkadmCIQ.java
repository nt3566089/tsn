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
 * The condition-query for in-line of T_CDTLVMKADM.
 * @author DBFlute(AutoGenerator)
 */
public class TCdtlvmkadmCIQ extends AbstractBsTCdtlvmkadmCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTCdtlvmkadmCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TCdtlvmkadmCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTCdtlvmkadmCQ myCQ) {
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
    protected ConditionValue xgetCValueSpecificationLabelMakeManageId() { return _myCQ.xdfgetSpecificationLabelMakeManageId(); }
    protected ConditionValue xgetCValueZzorgncd() { return _myCQ.xdfgetZzorgncd(); }
    protected ConditionValue xgetCValueSrymd() { return _myCQ.xdfgetSrymd(); }
    protected ConditionValue xgetCValueSroprtcnt() { return _myCQ.xdfgetSroprtcnt(); }
    protected ConditionValue xgetCValueDlvymd() { return _myCQ.xdfgetDlvymd(); }
    protected ConditionValue xgetCValueDpcd() { return _myCQ.xdfgetDpcd(); }
    protected ConditionValue xgetCValueDed() { return _myCQ.xdfgetDed(); }
    protected ConditionValue xgetCValuePstnid() { return _myCQ.xdfgetPstnid(); }
    protected ConditionValue xgetCValueLinblk() { return _myCQ.xdfgetLinblk(); }
    protected ConditionValue xgetCValueSrrnk() { return _myCQ.xdfgetSrrnk(); }
    protected ConditionValue xgetCValueMkdtm() { return _myCQ.xdfgetMkdtm(); }
    protected ConditionValue xgetCValueLstdsymd() { return _myCQ.xdfgetLstdsymd(); }
    protected ConditionValue xgetCValueSrlincd() { return _myCQ.xdfgetSrlincd(); }
    protected ConditionValue xgetCValueSrsrrnk() { return _myCQ.xdfgetSrsrrnk(); }
    protected ConditionValue xgetCValueSpecificationPrintedflg() { return _myCQ.xdfgetSpecificationPrintedflg(); }
    protected ConditionValue xgetCValueLabelPrintedflg() { return _myCQ.xdfgetLabelPrintedflg(); }
    protected ConditionValue xgetCValueReportId() { return _myCQ.xdfgetReportId(); }
    protected ConditionValue xgetCValueReportNm() { return _myCQ.xdfgetReportNm(); }
    protected ConditionValue xgetCValueStockNum() { return _myCQ.xdfgetStockNum(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
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
    public String keepScalarCondition(TCdtlvmkadmCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TCdtlvmkadmCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TCdtlvmkadmCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TCdtlvmkadmCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TCdtlvmkadmCB.class.getName(); }
    protected String xinCQ() { return TCdtlvmkadmCQ.class.getName(); }
}

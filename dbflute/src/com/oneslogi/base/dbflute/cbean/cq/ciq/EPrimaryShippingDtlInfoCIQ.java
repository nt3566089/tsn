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
 * The condition-query for in-line of E_PRIMARY_SHIPPING_DTL_INFO.
 * @author DBFlute(AutoGenerator)
 */
public class EPrimaryShippingDtlInfoCIQ extends AbstractBsEPrimaryShippingDtlInfoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEPrimaryShippingDtlInfoCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EPrimaryShippingDtlInfoCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEPrimaryShippingDtlInfoCQ myCQ) {
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
    protected ConditionValue xgetCValuePrimaryShippingDtlInfoId() { return _myCQ.xdfgetPrimaryShippingDtlInfoId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueZzbukrs() { return _myCQ.xdfgetZzbukrs(); }
    protected ConditionValue xgetCValueZzsndymd() { return _myCQ.xdfgetZzsndymd(); }
    protected ConditionValue xgetCValueRcdid() { return _myCQ.xdfgetRcdid(); }
    protected ConditionValue xgetCValueZzrefeno() { return _myCQ.xdfgetZzrefeno(); }
    protected ConditionValue xgetCValueBnwhcd() { return _myCQ.xdfgetBnwhcd(); }
    protected ConditionValue xgetCValueHdrid() { return _myCQ.xdfgetHdrid(); }
    protected ConditionValue xgetCValueDtlno() { return _myCQ.xdfgetDtlno(); }
    protected ConditionValue xgetCValueSpndda() { return _myCQ.xdfgetSpndda(); }
    protected ConditionValue xgetCValuePdlgtm() { return _myCQ.xdfgetPdlgtm(); }
    protected ConditionValue xgetCValueZzsendno() { return _myCQ.xdfgetZzsendno(); }
    protected ConditionValue xgetCValuePrcsorg() { return _myCQ.xdfgetPrcsorg(); }
    protected ConditionValue xgetCValueEkgrp() { return _myCQ.xdfgetEkgrp(); }
    protected ConditionValue xgetCValueSpcd() { return _myCQ.xdfgetSpcd(); }
    protected ConditionValue xgetCValueSpskplcd() { return _myCQ.xdfgetSpskplcd(); }
    protected ConditionValue xgetCValueRccd() { return _myCQ.xdfgetRccd(); }
    protected ConditionValue xgetCValueRcskplcd() { return _myCQ.xdfgetRcskplcd(); }
    protected ConditionValue xgetCValueZzrcvymd() { return _myCQ.xdfgetZzrcvymd(); }
    protected ConditionValue xgetCValueZzshtype() { return _myCQ.xdfgetZzshtype(); }
    protected ConditionValue xgetCValueAgcd() { return _myCQ.xdfgetAgcd(); }
    protected ConditionValue xgetCValueZzcbxqty() { return _myCQ.xdfgetZzcbxqty(); }
    protected ConditionValue xgetCValueZzpltqty() { return _myCQ.xdfgetZzpltqty(); }
    protected ConditionValue xgetCValueZztplqty() { return _myCQ.xdfgetZztplqty(); }
    protected ConditionValue xgetCValueZzshpcls() { return _myCQ.xdfgetZzshpcls(); }
    protected ConditionValue xgetCValueZzrefe01() { return _myCQ.xdfgetZzrefe01(); }
    protected ConditionValue xgetCValueZzrefe02() { return _myCQ.xdfgetZzrefe02(); }
    protected ConditionValue xgetCValueZzrefe03() { return _myCQ.xdfgetZzrefe03(); }
    protected ConditionValue xgetCValueZzrefe04() { return _myCQ.xdfgetZzrefe04(); }
    protected ConditionValue xgetCValueZzrefe05() { return _myCQ.xdfgetZzrefe05(); }
    protected ConditionValue xgetCValueZzrefe06() { return _myCQ.xdfgetZzrefe06(); }
    protected ConditionValue xgetCValueZzrefe07() { return _myCQ.xdfgetZzrefe07(); }
    protected ConditionValue xgetCValueZzrefe08() { return _myCQ.xdfgetZzrefe08(); }
    protected ConditionValue xgetCValueZzrefe09() { return _myCQ.xdfgetZzrefe09(); }
    protected ConditionValue xgetCValueZzrefe10() { return _myCQ.xdfgetZzrefe10(); }
    protected ConditionValue xgetCValueDtlqa() { return _myCQ.xdfgetDtlqa(); }
    protected ConditionValue xgetCValueZzrefeno2() { return _myCQ.xdfgetZzrefeno2(); }
    protected ConditionValue xgetCValueOprtno() { return _myCQ.xdfgetOprtno(); }
    protected ConditionValue xgetCValueBlocknm() { return _myCQ.xdfgetBlocknm(); }
    protected ConditionValue xgetCValueZzmatnr() { return _myCQ.xdfgetZzmatnr(); }
    protected ConditionValue xgetCValueLotno() { return _myCQ.xdfgetLotno(); }
    protected ConditionValue xgetCValueQuanty() { return _myCQ.xdfgetQuanty(); }
    protected ConditionValue xgetCValueGrpcsd() { return _myCQ.xdfgetGrpcsd(); }
    protected ConditionValue xgetCValueSfpoqa() { return _myCQ.xdfgetSfpoqa(); }
    protected ConditionValue xgetCValueDsskplcd() { return _myCQ.xdfgetDsskplcd(); }
    protected ConditionValue xgetCValueMfinf() { return _myCQ.xdfgetMfinf(); }
    protected ConditionValue xgetCValueSfthdes() { return _myCQ.xdfgetSfthdes(); }
    protected ConditionValue xgetCValueCnfatcl() { return _myCQ.xdfgetCnfatcl(); }
    protected ConditionValue xgetCValueLastgr() { return _myCQ.xdfgetLastgr(); }
    protected ConditionValue xgetCValueSflastdes() { return _myCQ.xdfgetSflastdes(); }
    protected ConditionValue xgetCValueShno() { return _myCQ.xdfgetShno(); }
    protected ConditionValue xgetCValuePltno() { return _myCQ.xdfgetPltno(); }
    protected ConditionValue xgetCValueTradelivno() { return _myCQ.xdfgetTradelivno(); }
    protected ConditionValue xgetCValueBatjmfym() { return _myCQ.xdfgetBatjmfym(); }
    protected ConditionValue xgetCValueSffil() { return _myCQ.xdfgetSffil(); }
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
    public String keepScalarCondition(EPrimaryShippingDtlInfoCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EPrimaryShippingDtlInfoCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EPrimaryShippingDtlInfoCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EPrimaryShippingDtlInfoCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EPrimaryShippingDtlInfoCB.class.getName(); }
    protected String xinCQ() { return EPrimaryShippingDtlInfoCQ.class.getName(); }
}

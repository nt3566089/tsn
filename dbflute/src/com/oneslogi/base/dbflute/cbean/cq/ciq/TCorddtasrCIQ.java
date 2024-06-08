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
 * The condition-query for in-line of T_CORDDTASR.
 * @author DBFlute(AutoGenerator)
 */
public class TCorddtasrCIQ extends AbstractBsTCorddtasrCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTCorddtasrCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TCorddtasrCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTCorddtasrCQ myCQ) {
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
    protected ConditionValue xgetCValueOrderSortId() { return _myCQ.xdfgetOrderSortId(); }
    protected ConditionValue xgetCValueOrderHId() { return _myCQ.xdfgetOrderHId(); }
    public String keepOrderHId_InScopeRelation_TCordhdr(TCordhdrCQ sq)
    { return _myCQ.keepOrderHId_InScopeRelation_TCordhdr(sq); }
    public String keepOrderHId_NotInScopeRelation_TCordhdr(TCordhdrCQ sq)
    { return _myCQ.keepOrderHId_NotInScopeRelation_TCordhdr(sq); }
    protected ConditionValue xgetCValueSrwhcd() { return _myCQ.xdfgetSrwhcd(); }
    protected ConditionValue xgetCValueDpcd() { return _myCQ.xdfgetDpcd(); }
    protected ConditionValue xgetCValueZzordymd() { return _myCQ.xdfgetZzordymd(); }
    protected ConditionValue xgetCValueOrdgr() { return _myCQ.xdfgetOrdgr(); }
    protected ConditionValue xgetCValueDlvymd() { return _myCQ.xdfgetDlvymd(); }
    protected ConditionValue xgetCValueDed() { return _myCQ.xdfgetDed(); }
    protected ConditionValue xgetCValuePstnid() { return _myCQ.xdfgetPstnid(); }
    protected ConditionValue xgetCValueScddlvymd() { return _myCQ.xdfgetScddlvymd(); }
    protected ConditionValue xgetCValueScdded() { return _myCQ.xdfgetScdded(); }
    protected ConditionValue xgetCValueScdpstnid() { return _myCQ.xdfgetScdpstnid(); }
    protected ConditionValue xgetCValueHpynid() { return _myCQ.xdfgetHpynid(); }
    protected ConditionValue xgetCValueIpynid() { return _myCQ.xdfgetIpynid(); }
    protected ConditionValue xgetCValueSrded() { return _myCQ.xdfgetSrded(); }
    protected ConditionValue xgetCValueSrpstnid() { return _myCQ.xdfgetSrpstnid(); }
    protected ConditionValue xgetCValueSrymd() { return _myCQ.xdfgetSrymd(); }
    protected ConditionValue xgetCValueSroprtcnt() { return _myCQ.xdfgetSroprtcnt(); }
    protected ConditionValue xgetCValueSrlincd() { return _myCQ.xdfgetSrlincd(); }
    protected ConditionValue xgetCValueSrrnk() { return _myCQ.xdfgetSrrnk(); }
    protected ConditionValue xgetCValueDlvsnm() { return _myCQ.xdfgetDlvsnm(); }
    protected ConditionValue xgetCValueDlvdtlsnm() { return _myCQ.xdfgetDlvdtlsnm(); }
    protected ConditionValue xgetCValueSscd() { return _myCQ.xdfgetSscd(); }
    protected ConditionValue xgetCValueSsnm() { return _myCQ.xdfgetSsnm(); }
    protected ConditionValue xgetCValueHdvid() { return _myCQ.xdfgetHdvid(); }
    protected ConditionValue xgetCValueDtlsnm() { return _myCQ.xdfgetDtlsnm(); }
    protected ConditionValue xgetCValueZzmatnr() { return _myCQ.xdfgetZzmatnr(); }
    protected ConditionValue xgetCValueSlqacb() { return _myCQ.xdfgetSlqacb(); }
    protected ConditionValue xgetCValueSlqact() { return _myCQ.xdfgetSlqact(); }
    protected ConditionValue xgetCValueSlqanum() { return _myCQ.xdfgetSlqanum(); }
    protected ConditionValue xgetCValueLinblk() { return _myCQ.xdfgetLinblk(); }
    protected ConditionValue xgetCValueLocno() { return _myCQ.xdfgetLocno(); }
    protected ConditionValue xgetCValueLocid() { return _myCQ.xdfgetLocid(); }
    protected ConditionValue xgetCValueDlvprtrnk() { return _myCQ.xdfgetDlvprtrnk(); }
    protected ConditionValue xgetCValueSrdlvymd() { return _myCQ.xdfgetSrdlvymd(); }
    protected ConditionValue xgetCValueSrhpynid() { return _myCQ.xdfgetSrhpynid(); }
    protected ConditionValue xgetCValueSripynid() { return _myCQ.xdfgetSripynid(); }
    protected ConditionValue xgetCValueSrsrlincd() { return _myCQ.xdfgetSrsrlincd(); }
    protected ConditionValue xgetCValueSrsrrnk() { return _myCQ.xdfgetSrsrrnk(); }
    protected ConditionValue xgetCValueSrdlvsnm() { return _myCQ.xdfgetSrdlvsnm(); }
    protected ConditionValue xgetCValueSrdlvdtlsnm() { return _myCQ.xdfgetSrdlvdtlsnm(); }
    protected ConditionValue xgetCValueSrdlvprtrnk() { return _myCQ.xdfgetSrdlvprtrnk(); }
    protected ConditionValue xgetCValueBrtyp() { return _myCQ.xdfgetBrtyp(); }
    protected ConditionValue xgetCValueBoxno() { return _myCQ.xdfgetBoxno(); }
    protected ConditionValue xgetCValueBoxnocnsnm() { return _myCQ.xdfgetBoxnocnsnm(); }
    protected ConditionValue xgetCValueBoxtyp() { return _myCQ.xdfgetBoxtyp(); }
    protected ConditionValue xgetCValueMgboxdid() { return _myCQ.xdfgetMgboxdid(); }
    protected ConditionValue xgetCValueDmdid() { return _myCQ.xdfgetDmdid(); }
    protected ConditionValue xgetCValueTtboxqa() { return _myCQ.xdfgetTtboxqa(); }
    protected ConditionValue xgetCValueBoxctqata() { return _myCQ.xdfgetBoxctqata(); }
    protected ConditionValue xgetCValueBoxctqaapsrplc() { return _myCQ.xdfgetBoxctqaapsrplc(); }
    protected ConditionValue xgetCValueTtsroprtcnt() { return _myCQ.xdfgetTtsroprtcnt(); }
    protected ConditionValue xgetCValueBxmtrid() { return _myCQ.xdfgetBxmtrid(); }
    protected ConditionValue xgetCValueSpplymd() { return _myCQ.xdfgetSpplymd(); }
    protected ConditionValue xgetCValueSlptyp() { return _myCQ.xdfgetSlptyp(); }
    protected ConditionValue xgetCValueSeqno() { return _myCQ.xdfgetSeqno(); }
    protected ConditionValue xgetCValueOtorgcd() { return _myCQ.xdfgetOtorgcd(); }
    protected ConditionValue xgetCValueOrdorgcd() { return _myCQ.xdfgetOrdorgcd(); }
    protected ConditionValue xgetCValueRlybscd() { return _myCQ.xdfgetRlybscd(); }
    protected ConditionValue xgetCValueDlvrnk() { return _myCQ.xdfgetDlvrnk(); }
    protected ConditionValue xgetCValueLmpdlvno() { return _myCQ.xdfgetLmpdlvno(); }
    protected ConditionValue xgetCValueDivmtd() { return _myCQ.xdfgetDivmtd(); }
    protected ConditionValue xgetCValueSlediv() { return _myCQ.xdfgetSlediv(); }
    protected ConditionValue xgetCValueHvrtrsn() { return _myCQ.xdfgetHvrtrsn(); }
    protected ConditionValue xgetCValueHvrtinotymd() { return _myCQ.xdfgetHvrtinotymd(); }
    protected ConditionValue xgetCValueCngprtslpno() { return _myCQ.xdfgetCngprtslpno(); }
    protected ConditionValue xgetCValueTrnsctndiv() { return _myCQ.xdfgetTrnsctndiv(); }
    protected ConditionValue xgetCValueEosordaftflg() { return _myCQ.xdfgetEosordaftflg(); }
    protected ConditionValue xgetCValueEosslpno() { return _myCQ.xdfgetEosslpno(); }
    protected ConditionValue xgetCValueHdrdbxdiv() { return _myCQ.xdfgetHdrdbxdiv(); }
    protected ConditionValue xgetCValueInotrfsldiv() { return _myCQ.xdfgetInotrfsldiv(); }
    protected ConditionValue xgetCValueBxmntrfsldiv() { return _myCQ.xdfgetBxmntrfsldiv(); }
    protected ConditionValue xgetCValueSlpmrgtmg() { return _myCQ.xdfgetSlpmrgtmg(); }
    protected ConditionValue xgetCValueSlpotymd() { return _myCQ.xdfgetSlpotymd(); }
    protected ConditionValue xgetCValueCmpcd() { return _myCQ.xdfgetCmpcd(); }
    protected ConditionValue xgetCValueStscd() { return _myCQ.xdfgetStscd(); }
    protected ConditionValue xgetCValueStgval() { return _myCQ.xdfgetStgval(); }
    protected ConditionValue xgetCValueSlpno() { return _myCQ.xdfgetSlpno(); }
    protected ConditionValue xgetCValueTttopdedrnk() { return _myCQ.xdfgetTttopdedrnk(); }
    protected ConditionValue xgetCValueCordrcvcnt() { return _myCQ.xdfgetCordrcvcnt(); }
    protected ConditionValue xgetCValueOrddvfg() { return _myCQ.xdfgetOrddvfg(); }
    protected ConditionValue xgetCValueLbcbqa() { return _myCQ.xdfgetLbcbqa(); }
    protected ConditionValue xgetCValueDrclstlbcbid() { return _myCQ.xdfgetDrclstlbcbid(); }
    protected ConditionValue xgetCValueLbboxno() { return _myCQ.xdfgetLbboxno(); }
    protected ConditionValue xgetCValueLbttboxqa() { return _myCQ.xdfgetLbttboxqa(); }
    protected ConditionValue xgetCValueIkeiincldflg() { return _myCQ.xdfgetIkeiincldflg(); }
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
    public String keepScalarCondition(TCorddtasrCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TCorddtasrCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TCorddtasrCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TCorddtasrCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TCorddtasrCB.class.getName(); }
    protected String xinCQ() { return TCorddtasrCQ.class.getName(); }
}

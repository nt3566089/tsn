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
 * The condition-query for in-line of E_MFCOMPANY.
 * @author DBFlute(AutoGenerator)
 */
public class EMfcompanyCIQ extends AbstractBsEMfcompanyCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEMfcompanyCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EMfcompanyCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEMfcompanyCQ myCQ) {
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
    protected ConditionValue xgetCValueMfcompanyId() { return _myCQ.xdfgetMfcompanyId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueZzorgncd() { return _myCQ.xdfgetZzorgncd(); }
    protected ConditionValue xgetCValueZzorgnid() { return _myCQ.xdfgetZzorgnid(); }
    protected ConditionValue xgetCValueOrgnmkjf() { return _myCQ.xdfgetOrgnmkjf(); }
    protected ConditionValue xgetCValueJtonfnf() { return _myCQ.xdfgetJtonfnf(); }
    protected ConditionValue xgetCValueOnfnha() { return _myCQ.xdfgetOnfnha(); }
    protected ConditionValue xgetCValueJtonfnh() { return _myCQ.xdfgetJtonfnh(); }
    protected ConditionValue xgetCValueZzorgnam() { return _myCQ.xdfgetZzorgnam(); }
    protected ConditionValue xgetCValueJtonanf() { return _myCQ.xdfgetJtonanf(); }
    protected ConditionValue xgetCValueOnanha() { return _myCQ.xdfgetOnanha(); }
    protected ConditionValue xgetCValueJtonanh() { return _myCQ.xdfgetJtonanh(); }
    protected ConditionValue xgetCValueAnwhnm() { return _myCQ.xdfgetAnwhnm(); }
    protected ConditionValue xgetCValueIoorid() { return _myCQ.xdfgetIoorid(); }
    protected ConditionValue xgetCValueOrgpsno() { return _myCQ.xdfgetOrgpsno(); }
    protected ConditionValue xgetCValueAdvcd() { return _myCQ.xdfgetAdvcd(); }
    protected ConditionValue xgetCValueCounc() { return _myCQ.xdfgetCounc(); }
    protected ConditionValue xgetCValueOrgadr1() { return _myCQ.xdfgetOrgadr1(); }
    protected ConditionValue xgetCValueOrgtel() { return _myCQ.xdfgetOrgtel(); }
    protected ConditionValue xgetCValueOrtl2() { return _myCQ.xdfgetOrtl2(); }
    protected ConditionValue xgetCValueOrgfax() { return _myCQ.xdfgetOrgfax(); }
    protected ConditionValue xgetCValueZzhorgcd() { return _myCQ.xdfgetZzhorgcd(); }
    protected ConditionValue xgetCValueZzbasecd() { return _myCQ.xdfgetZzbasecd(); }
    protected ConditionValue xgetCValueCsadmag() { return _myCQ.xdfgetCsadmag(); }
    protected ConditionValue xgetCValueTaxocd() { return _myCQ.xdfgetTaxocd(); }
    protected ConditionValue xgetCValueUptaxid() { return _myCQ.xdfgetUptaxid(); }
    protected ConditionValue xgetCValueStatcid() { return _myCQ.xdfgetStatcid(); }
    protected ConditionValue xgetCValueStlndid() { return _myCQ.xdfgetStlndid(); }
    protected ConditionValue xgetCValueZzwhmgid() { return _myCQ.xdfgetZzwhmgid(); }
    protected ConditionValue xgetCValueTscpnm() { return _myCQ.xdfgetTscpnm(); }
    protected ConditionValue xgetCValueDepcd() { return _myCQ.xdfgetDepcd(); }
    protected ConditionValue xgetCValueCnlid() { return _myCQ.xdfgetCnlid(); }
    protected ConditionValue xgetCValueOtrnk() { return _myCQ.xdfgetOtrnk(); }
    protected ConditionValue xgetCValueOrattid1() { return _myCQ.xdfgetOrattid1(); }
    protected ConditionValue xgetCValueOrattid2() { return _myCQ.xdfgetOrattid2(); }
    protected ConditionValue xgetCValueOrattid3() { return _myCQ.xdfgetOrattid3(); }
    protected ConditionValue xgetCValueAttid1() { return _myCQ.xdfgetAttid1(); }
    protected ConditionValue xgetCValueAttid2() { return _myCQ.xdfgetAttid2(); }
    protected ConditionValue xgetCValueAttid3() { return _myCQ.xdfgetAttid3(); }
    protected ConditionValue xgetCValueOrattid4() { return _myCQ.xdfgetOrattid4(); }
    protected ConditionValue xgetCValueBsdid() { return _myCQ.xdfgetBsdid(); }
    protected ConditionValue xgetCValueRpbcd() { return _myCQ.xdfgetRpbcd(); }
    protected ConditionValue xgetCValueFauorgcd() { return _myCQ.xdfgetFauorgcd(); }
    protected ConditionValue xgetCValueAuorgcd() { return _myCQ.xdfgetAuorgcd(); }
    protected ConditionValue xgetCValueCstctcd() { return _myCQ.xdfgetCstctcd(); }
    protected ConditionValue xgetCValueBizarcd() { return _myCQ.xdfgetBizarcd(); }
    protected ConditionValue xgetCValueFwctcd() { return _myCQ.xdfgetFwctcd(); }
    protected ConditionValue xgetCValueRdvdid() { return _myCQ.xdfgetRdvdid(); }
    protected ConditionValue xgetCValueZzablymd() { return _myCQ.xdfgetZzablymd(); }
    protected ConditionValue xgetCValueBptnid() { return _myCQ.xdfgetBptnid(); }
    protected ConditionValue xgetCValueSnkhg() { return _myCQ.xdfgetSnkhg(); }
    protected ConditionValue xgetCValueTxcansfg() { return _myCQ.xdfgetTxcansfg(); }
    protected ConditionValue xgetCValueCsnpt() { return _myCQ.xdfgetCsnpt(); }
    protected ConditionValue xgetCValueTbsocstm() { return _myCQ.xdfgetTbsocstm(); }
    protected ConditionValue xgetCValueOdtscd() { return _myCQ.xdfgetOdtscd(); }
    protected ConditionValue xgetCValueLnarcd() { return _myCQ.xdfgetLnarcd(); }
    protected ConditionValue xgetCValueSasasid() { return _myCQ.xdfgetSasasid(); }
    protected ConditionValue xgetCValueCmlrasid() { return _myCQ.xdfgetCmlrasid(); }
    protected ConditionValue xgetCValueCsoid() { return _myCQ.xdfgetCsoid(); }
    protected ConditionValue xgetCValueUpmn() { return _myCQ.xdfgetUpmn(); }
    protected ConditionValue xgetCValueChngyd() { return _myCQ.xdfgetChngyd(); }
    protected ConditionValue xgetCValueUpdtm() { return _myCQ.xdfgetUpdtm(); }
    protected ConditionValue xgetCValueUpdis() { return _myCQ.xdfgetUpdis(); }
    protected ConditionValue xgetCValueUpbmn() { return _myCQ.xdfgetUpbmn(); }
    protected ConditionValue xgetCValueBchngyd() { return _myCQ.xdfgetBchngyd(); }
    protected ConditionValue xgetCValueBupdtm() { return _myCQ.xdfgetBupdtm(); }
    protected ConditionValue xgetCValueUpobmn() { return _myCQ.xdfgetUpobmn(); }
    protected ConditionValue xgetCValueObchngyd() { return _myCQ.xdfgetObchngyd(); }
    protected ConditionValue xgetCValueObupdtm() { return _myCQ.xdfgetObupdtm(); }
    protected ConditionValue xgetCValueZzfrdateh() { return _myCQ.xdfgetZzfrdateh(); }
    protected ConditionValue xgetCValueZztodateh() { return _myCQ.xdfgetZztodateh(); }
    protected ConditionValue xgetCValueRcdupdps() { return _myCQ.xdfgetRcdupdps(); }
    protected ConditionValue xgetCValueUpdusrid() { return _myCQ.xdfgetUpdusrid(); }
    protected ConditionValue xgetCValueUpdpocd() { return _myCQ.xdfgetUpdpocd(); }
    protected ConditionValue xgetCValueOtcmpfg() { return _myCQ.xdfgetOtcmpfg(); }
    protected ConditionValue xgetCValueTmcmpfg() { return _myCQ.xdfgetTmcmpfg(); }
    protected ConditionValue xgetCValueStmid() { return _myCQ.xdfgetStmid(); }
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
    public String keepScalarCondition(EMfcompanyCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EMfcompanyCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EMfcompanyCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EMfcompanyCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EMfcompanyCB.class.getName(); }
    protected String xinCQ() { return EMfcompanyCQ.class.getName(); }
}

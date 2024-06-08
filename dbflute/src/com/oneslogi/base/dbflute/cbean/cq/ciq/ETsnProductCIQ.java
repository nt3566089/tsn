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
 * The condition-query for in-line of E_TSN_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class ETsnProductCIQ extends AbstractBsETsnProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsETsnProductCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ETsnProductCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsETsnProductCQ myCQ) {
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
    protected ConditionValue xgetCValueTsnProductId() { return _myCQ.xdfgetTsnProductId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueZzmatnr() { return _myCQ.xdfgetZzmatnr(); }
    protected ConditionValue xgetCValueBrfnfl() { return _myCQ.xdfgetBrfnfl(); }
    protected ConditionValue xgetCValueBrfnhf() { return _myCQ.xdfgetBrfnhf(); }
    protected ConditionValue xgetCValueBranfl() { return _myCQ.xdfgetBranfl(); }
    protected ConditionValue xgetCValueBranhf() { return _myCQ.xdfgetBranhf(); }
    protected ConditionValue xgetCValueSobrfnfl() { return _myCQ.xdfgetSobrfnfl(); }
    protected ConditionValue xgetCValueSobrfnhf() { return _myCQ.xdfgetSobrfnhf(); }
    protected ConditionValue xgetCValueBrkname() { return _myCQ.xdfgetBrkname(); }
    protected ConditionValue xgetCValueCggdid() { return _myCQ.xdfgetCggdid(); }
    protected ConditionValue xgetCValueZzdevcid() { return _myCQ.xdfgetZzdevcid(); }
    protected ConditionValue xgetCValueUsid() { return _myCQ.xdfgetUsid(); }
    protected ConditionValue xgetCValueCgrid() { return _myCQ.xdfgetCgrid(); }
    protected ConditionValue xgetCValueCbcccvce() { return _myCQ.xdfgetCbcccvce(); }
    protected ConditionValue xgetCValueSfcbqa() { return _myCQ.xdfgetSfcbqa(); }
    protected ConditionValue xgetCValueCtnum() { return _myCQ.xdfgetCtnum(); }
    protected ConditionValue xgetCValueCbnum() { return _myCQ.xdfgetCbnum(); }
    protected ConditionValue xgetCValuePatcbqa() { return _myCQ.xdfgetPatcbqa(); }
    protected ConditionValue xgetCValueZzseffid() { return _myCQ.xdfgetZzseffid(); }
    protected ConditionValue xgetCValueZzablymd() { return _myCQ.xdfgetZzablymd(); }
    protected ConditionValue xgetCValueCrspymd() { return _myCQ.xdfgetCrspymd(); }
    protected ConditionValue xgetCValueSeymd() { return _myCQ.xdfgetSeymd(); }
    protected ConditionValue xgetCValueDpbnyd() { return _myCQ.xdfgetDpbnyd(); }
    protected ConditionValue xgetCValueSobgnymd() { return _myCQ.xdfgetSobgnymd(); }
    protected ConditionValue xgetCValueExslymd() { return _myCQ.xdfgetExslymd(); }
    protected ConditionValue xgetCValueAubrid() { return _myCQ.xdfgetAubrid(); }
    protected ConditionValue xgetCValueFwbrid() { return _myCQ.xdfgetFwbrid(); }
    protected ConditionValue xgetCValueBrcrid() { return _myCQ.xdfgetBrcrid(); }
    protected ConditionValue xgetCValuePabrcd() { return _myCQ.xdfgetPabrcd(); }
    protected ConditionValue xgetCValueAubrcd() { return _myCQ.xdfgetAubrcd(); }
    protected ConditionValue xgetCValueZzmatnra() { return _myCQ.xdfgetZzmatnra(); }
    protected ConditionValue xgetCValueMraucd() { return _myCQ.xdfgetMraucd(); }
    protected ConditionValue xgetCValueZzsomium() { return _myCQ.xdfgetZzsomium(); }
    protected ConditionValue xgetCValueZzregprca() { return _myCQ.xdfgetZzregprca(); }
    protected ConditionValue xgetCValueTfpr() { return _myCQ.xdfgetTfpr(); }
    protected ConditionValue xgetCValueMgrta() { return _myCQ.xdfgetMgrta(); }
    protected ConditionValue xgetCValueMgrtok() { return _myCQ.xdfgetMgrtok(); }
    protected ConditionValue xgetCValueTlnpru() { return _myCQ.xdfgetTlnpru(); }
    protected ConditionValue xgetCValueHanumwt() { return _myCQ.xdfgetHanumwt(); }
    protected ConditionValue xgetCValueCnscvct() { return _myCQ.xdfgetCnscvct(); }
    protected ConditionValue xgetCValueCgtaxcct() { return _myCQ.xdfgetCgtaxcct(); }
    protected ConditionValue xgetCValueNtxqart() { return _myCQ.xdfgetNtxqart(); }
    protected ConditionValue xgetCValueLtxqart() { return _myCQ.xdfgetLtxqart(); }
    protected ConditionValue xgetCValueAdvtaxrt() { return _myCQ.xdfgetAdvtaxrt(); }
    protected ConditionValue xgetCValueCtytaxrt() { return _myCQ.xdfgetCtytaxrt(); }
    protected ConditionValue xgetCValuePrfprt() { return _myCQ.xdfgetPrfprt(); }
    protected ConditionValue xgetCValueNotax() { return _myCQ.xdfgetNotax(); }
    protected ConditionValue xgetCValueBrkd() { return _myCQ.xdfgetBrkd(); }
    protected ConditionValue xgetCValueFmlycd() { return _myCQ.xdfgetFmlycd(); }
    protected ConditionValue xgetCValuePrgrcd() { return _myCQ.xdfgetPrgrcd(); }
    protected ConditionValue xgetCValueNctncls() { return _myCQ.xdfgetNctncls(); }
    protected ConditionValue xgetCValueTarcls() { return _myCQ.xdfgetTarcls(); }
    protected ConditionValue xgetCValuePdpkspcd() { return _myCQ.xdfgetPdpkspcd(); }
    protected ConditionValue xgetCValueFltid() { return _myCQ.xdfgetFltid(); }
    protected ConditionValue xgetCValueKsubcdid() { return _myCQ.xdfgetKsubcdid(); }
    protected ConditionValue xgetCValueKsubcd() { return _myCQ.xdfgetKsubcd(); }
    protected ConditionValue xgetCValueCtbcdid() { return _myCQ.xdfgetCtbcdid(); }
    protected ConditionValue xgetCValueCtbcd() { return _myCQ.xdfgetCtbcd(); }
    protected ConditionValue xgetCValueCbbcdid() { return _myCQ.xdfgetCbbcdid(); }
    protected ConditionValue xgetCValueCbbcd() { return _myCQ.xdfgetCbbcd(); }
    protected ConditionValue xgetCValueCtfm() { return _myCQ.xdfgetCtfm(); }
    protected ConditionValue xgetCValueCtszl() { return _myCQ.xdfgetCtszl(); }
    protected ConditionValue xgetCValueCtszw() { return _myCQ.xdfgetCtszw(); }
    protected ConditionValue xgetCValueCtszh() { return _myCQ.xdfgetCtszh(); }
    protected ConditionValue xgetCValueCtcc() { return _myCQ.xdfgetCtcc(); }
    protected ConditionValue xgetCValueCtweight() { return _myCQ.xdfgetCtweight(); }
    protected ConditionValue xgetCValueCbszl() { return _myCQ.xdfgetCbszl(); }
    protected ConditionValue xgetCValueCbszw() { return _myCQ.xdfgetCbszw(); }
    protected ConditionValue xgetCValueCbszh() { return _myCQ.xdfgetCbszh(); }
    protected ConditionValue xgetCValueCbcc() { return _myCQ.xdfgetCbcc(); }
    protected ConditionValue xgetCValueCbwt() { return _myCQ.xdfgetCbwt(); }
    protected ConditionValue xgetCValueBscdt() { return _myCQ.xdfgetBscdt(); }
    protected ConditionValue xgetCValueBscdk() { return _myCQ.xdfgetBscdk(); }
    protected ConditionValue xgetCValueBscdc() { return _myCQ.xdfgetBscdc(); }
    protected ConditionValue xgetCValueBscdq() { return _myCQ.xdfgetBscdq(); }
    protected ConditionValue xgetCValueBscdh() { return _myCQ.xdfgetBscdh(); }
    protected ConditionValue xgetCValueSpagcdt() { return _myCQ.xdfgetSpagcdt(); }
    protected ConditionValue xgetCValueSpagcdk() { return _myCQ.xdfgetSpagcdk(); }
    protected ConditionValue xgetCValueSpagcdc() { return _myCQ.xdfgetSpagcdc(); }
    protected ConditionValue xgetCValueSpagcdq() { return _myCQ.xdfgetSpagcdq(); }
    protected ConditionValue xgetCValueSpagcdh() { return _myCQ.xdfgetSpagcdh(); }
    protected ConditionValue xgetCValueRbscd1() { return _myCQ.xdfgetRbscd1(); }
    protected ConditionValue xgetCValueRbscd2() { return _myCQ.xdfgetRbscd2(); }
    protected ConditionValue xgetCValueRbscd3() { return _myCQ.xdfgetRbscd3(); }
    protected ConditionValue xgetCValueRbscd4() { return _myCQ.xdfgetRbscd4(); }
    protected ConditionValue xgetCValueRbscd5() { return _myCQ.xdfgetRbscd5(); }
    protected ConditionValue xgetCValueUssbcd1() { return _myCQ.xdfgetUssbcd1(); }
    protected ConditionValue xgetCValueUssbcd2() { return _myCQ.xdfgetUssbcd2(); }
    protected ConditionValue xgetCValueUssbcd3() { return _myCQ.xdfgetUssbcd3(); }
    protected ConditionValue xgetCValueUssbcd4() { return _myCQ.xdfgetUssbcd4(); }
    protected ConditionValue xgetCValueUssbcd5() { return _myCQ.xdfgetUssbcd5(); }
    protected ConditionValue xgetCValueSplcpcd() { return _myCQ.xdfgetSplcpcd(); }
    protected ConditionValue xgetCValueMakercd() { return _myCQ.xdfgetMakercd(); }
    protected ConditionValue xgetCValueLand1() { return _myCQ.xdfgetLand1(); }
    protected ConditionValue xgetCValueCgclsdid() { return _myCQ.xdfgetCgclsdid(); }
    protected ConditionValue xgetCValueGnlotrnk() { return _myCQ.xdfgetGnlotrnk(); }
    protected ConditionValue xgetCValueMrotrnk() { return _myCQ.xdfgetMrotrnk(); }
    protected ConditionValue xgetCValueCoid() { return _myCQ.xdfgetCoid(); }
    protected ConditionValue xgetCValueBrwkid() { return _myCQ.xdfgetBrwkid(); }
    protected ConditionValue xgetCValueShunid() { return _myCQ.xdfgetShunid(); }
    protected ConditionValue xgetCValueDstkbn() { return _myCQ.xdfgetDstkbn(); }
    protected ConditionValue xgetCValueReomatnr() { return _myCQ.xdfgetReomatnr(); }
    protected ConditionValue xgetCValueDspeckb() { return _myCQ.xdfgetDspeckb(); }
    protected ConditionValue xgetCValueSgmid() { return _myCQ.xdfgetSgmid(); }
    protected ConditionValue xgetCValueMakileng() { return _myCQ.xdfgetMakileng(); }
    protected ConditionValue xgetCValueMakidia() { return _myCQ.xdfgetMakidia(); }
    protected ConditionValue xgetCValueGdmsrp() { return _myCQ.xdfgetGdmsrp(); }
    protected ConditionValue xgetCValueGdslu() { return _myCQ.xdfgetGdslu(); }
    protected ConditionValue xgetCValueGdpru() { return _myCQ.xdfgetGdpru(); }
    protected ConditionValue xgetCValueExima() { return _myCQ.xdfgetExima(); }
    protected ConditionValue xgetCValueEximb() { return _myCQ.xdfgetEximb(); }
    protected ConditionValue xgetCValueEximc() { return _myCQ.xdfgetEximc(); }
    protected ConditionValue xgetCValueEximd() { return _myCQ.xdfgetEximd(); }
    protected ConditionValue xgetCValueExime() { return _myCQ.xdfgetExime(); }
    protected ConditionValue xgetCValueEximf() { return _myCQ.xdfgetEximf(); }
    protected ConditionValue xgetCValueEximg() { return _myCQ.xdfgetEximg(); }
    protected ConditionValue xgetCValueEximh() { return _myCQ.xdfgetEximh(); }
    protected ConditionValue xgetCValueEximi() { return _myCQ.xdfgetEximi(); }
    protected ConditionValue xgetCValueEximj() { return _myCQ.xdfgetEximj(); }
    protected ConditionValue xgetCValueEximk() { return _myCQ.xdfgetEximk(); }
    protected ConditionValue xgetCValueEximl() { return _myCQ.xdfgetEximl(); }
    protected ConditionValue xgetCValueEximm() { return _myCQ.xdfgetEximm(); }
    protected ConditionValue xgetCValueEximn() { return _myCQ.xdfgetEximn(); }
    protected ConditionValue xgetCValueEximo() { return _myCQ.xdfgetEximo(); }
    protected ConditionValue xgetCValueEximp() { return _myCQ.xdfgetEximp(); }
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
    protected ConditionValue xgetCValueAubrchfg() { return _myCQ.xdfgetAubrchfg(); }
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
    public String keepScalarCondition(ETsnProductCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(ETsnProductCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(ETsnProductCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(ETsnProductCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ETsnProductCB.class.getName(); }
    protected String xinCQ() { return ETsnProductCQ.class.getName(); }
}

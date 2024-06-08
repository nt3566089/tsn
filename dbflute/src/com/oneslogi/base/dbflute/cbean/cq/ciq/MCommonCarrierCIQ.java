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
 * The condition-query for in-line of M_COMMON_CARRIER.
 * @author DBFlute(AutoGenerator)
 */
public class MCommonCarrierCIQ extends AbstractBsMCommonCarrierCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMCommonCarrierCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MCommonCarrierCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMCommonCarrierCQ myCQ) {
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
    protected ConditionValue xgetCValueCommonCarrierId() { return _myCQ.xdfgetCommonCarrierId(); }
    public String keepCommonCarrierId_ExistsReferrer_MCarrierList(MCarrierCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCommonCarrierId_ExistsReferrer_MCarrierZipList(MCarrierZipCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCommonCarrierId_NotExistsReferrer_MCarrierList(MCarrierCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCommonCarrierId_NotExistsReferrer_MCarrierZipList(MCarrierZipCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCommonCarrierId_SpecifyDerivedReferrer_MCarrierList(MCarrierCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCommonCarrierId_SpecifyDerivedReferrer_MCarrierZipList(MCarrierZipCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCommonCarrierId_QueryDerivedReferrer_MCarrierList(MCarrierCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCommonCarrierId_QueryDerivedReferrer_MCarrierListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCommonCarrierId_QueryDerivedReferrer_MCarrierZipList(MCarrierZipCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCommonCarrierId_QueryDerivedReferrer_MCarrierZipListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCarrierCd() { return _myCQ.xdfgetCarrierCd(); }
    protected ConditionValue xgetCValueCarrierNm() { return _myCQ.xdfgetCarrierNm(); }
    protected ConditionValue xgetCValueCarrierAbbr() { return _myCQ.xdfgetCarrierAbbr(); }
    protected ConditionValue xgetCValueArrivalStoreBarcode() { return _myCQ.xdfgetArrivalStoreBarcode(); }
    protected ConditionValue xgetCValueArrivalStoreStartBit() { return _myCQ.xdfgetArrivalStoreStartBit(); }
    protected ConditionValue xgetCValueArrivalStoreEndBit() { return _myCQ.xdfgetArrivalStoreEndBit(); }
    protected ConditionValue xgetCValueArrivalStoreFormat() { return _myCQ.xdfgetArrivalStoreFormat(); }
    protected ConditionValue xgetCValueTrackingBarcode() { return _myCQ.xdfgetTrackingBarcode(); }
    protected ConditionValue xgetCValueTrackingStartBit() { return _myCQ.xdfgetTrackingStartBit(); }
    protected ConditionValue xgetCValueTrackingEndBit() { return _myCQ.xdfgetTrackingEndBit(); }
    protected ConditionValue xgetCValueBolOutputTargetFlg() { return _myCQ.xdfgetBolOutputTargetFlg(); }
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
    public String keepScalarCondition(MCommonCarrierCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MCommonCarrierCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MCommonCarrierCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MCommonCarrierCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MCommonCarrierCB.class.getName(); }
    protected String xinCQ() { return MCommonCarrierCQ.class.getName(); }
}

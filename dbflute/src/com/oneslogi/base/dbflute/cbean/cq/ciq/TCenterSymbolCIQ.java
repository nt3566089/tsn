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
 * The condition-query for in-line of T_CENTER_SYMBOL.
 * @author DBFlute(AutoGenerator)
 */
public class TCenterSymbolCIQ extends AbstractBsTCenterSymbolCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTCenterSymbolCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TCenterSymbolCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTCenterSymbolCQ myCQ) {
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
    protected ConditionValue xgetCValueCenterSymbolId() { return _myCQ.xdfgetCenterSymbolId(); }
    public String keepCenterSymbolId_ExistsReferrer_TCenterSymbolSelfList(TCenterSymbolCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterSymbolId_NotExistsReferrer_TCenterSymbolSelfList(TCenterSymbolCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterSymbolId_SpecifyDerivedReferrer_TCenterSymbolSelfList(TCenterSymbolCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterSymbolId_QueryDerivedReferrer_TCenterSymbolSelfList(TCenterSymbolCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterSymbolId_QueryDerivedReferrer_TCenterSymbolSelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
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
    protected ConditionValue xgetCValuePalletId() { return _myCQ.xdfgetPalletId(); }
    public String keepPalletId_InScopeRelation_TPallet(TPalletCQ sq)
    { return _myCQ.keepPalletId_InScopeRelation_TPallet(sq); }
    public String keepPalletId_NotInScopeRelation_TPallet(TPalletCQ sq)
    { return _myCQ.keepPalletId_NotInScopeRelation_TPallet(sq); }
    protected ConditionValue xgetCValueTrsymbolId() { return _myCQ.xdfgetTrsymbolId(); }
    public String keepTrsymbolId_InScopeRelation_TTrsymbol(TTrsymbolCQ sq)
    { return _myCQ.keepTrsymbolId_InScopeRelation_TTrsymbol(sq); }
    public String keepTrsymbolId_NotInScopeRelation_TTrsymbol(TTrsymbolCQ sq)
    { return _myCQ.keepTrsymbolId_NotInScopeRelation_TTrsymbol(sq); }
    protected ConditionValue xgetCValueChildCenterSymbolId() { return _myCQ.xdfgetChildCenterSymbolId(); }
    public String keepChildCenterSymbolId_InScopeRelation_TCenterSymbolSelf(TCenterSymbolCQ sq)
    { return _myCQ.keepChildCenterSymbolId_InScopeRelation_TCenterSymbolSelf(sq); }
    public String keepChildCenterSymbolId_NotInScopeRelation_TCenterSymbolSelf(TCenterSymbolCQ sq)
    { return _myCQ.keepChildCenterSymbolId_NotInScopeRelation_TCenterSymbolSelf(sq); }
    protected ConditionValue xgetCValueSortstockNumber() { return _myCQ.xdfgetSortstockNumber(); }
    protected ConditionValue xgetCValueQrCode() { return _myCQ.xdfgetQrCode(); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    protected ConditionValue xgetCValueCaseMoveSts() { return _myCQ.xdfgetCaseMoveSts(); }
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
    public String keepScalarCondition(TCenterSymbolCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TCenterSymbolCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TCenterSymbolCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TCenterSymbolCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TCenterSymbolCB.class.getName(); }
    protected String xinCQ() { return TCenterSymbolCQ.class.getName(); }
}

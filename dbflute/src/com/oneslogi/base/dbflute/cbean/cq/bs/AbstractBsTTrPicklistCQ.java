package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of T_TR_PICKLIST.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrPicklistCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrPicklistCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "T_TR_PICKLIST";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrPicklistId The value of tTrPicklistId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrPicklistId_Equal(Long tTrPicklistId) {
        doSetTTrPicklistId_Equal(tTrPicklistId);
    }

    protected void doSetTTrPicklistId_Equal(Long tTrPicklistId) {
        regTTrPicklistId(CK_EQ, tTrPicklistId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrPicklistId The value of tTrPicklistId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrPicklistId_NotEqual(Long tTrPicklistId) {
        doSetTTrPicklistId_NotEqual(tTrPicklistId);
    }

    protected void doSetTTrPicklistId_NotEqual(Long tTrPicklistId) {
        regTTrPicklistId(CK_NES, tTrPicklistId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrPicklistId The value of tTrPicklistId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrPicklistId_GreaterThan(Long tTrPicklistId) {
        regTTrPicklistId(CK_GT, tTrPicklistId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrPicklistId The value of tTrPicklistId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrPicklistId_LessThan(Long tTrPicklistId) {
        regTTrPicklistId(CK_LT, tTrPicklistId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrPicklistId The value of tTrPicklistId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrPicklistId_GreaterEqual(Long tTrPicklistId) {
        regTTrPicklistId(CK_GE, tTrPicklistId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrPicklistId The value of tTrPicklistId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTTrPicklistId_LessEqual(Long tTrPicklistId) {
        regTTrPicklistId(CK_LE, tTrPicklistId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of tTrPicklistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tTrPicklistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTTrPicklistId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTTrPicklistId(), "T_TR_PICKLIST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrPicklistIdList The collection of tTrPicklistId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTTrPicklistId_InScope(Collection<Long> tTrPicklistIdList) {
        doSetTTrPicklistId_InScope(tTrPicklistIdList);
    }

    protected void doSetTTrPicklistId_InScope(Collection<Long> tTrPicklistIdList) {
        regINS(CK_INS, cTL(tTrPicklistIdList), xgetCValueTTrPicklistId(), "T_TR_PICKLIST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tTrPicklistIdList The collection of tTrPicklistId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTTrPicklistId_NotInScope(Collection<Long> tTrPicklistIdList) {
        doSetTTrPicklistId_NotInScope(tTrPicklistIdList);
    }

    protected void doSetTTrPicklistId_NotInScope(Collection<Long> tTrPicklistIdList) {
        regINS(CK_NINS, cTL(tTrPicklistIdList), xgetCValueTTrPicklistId(), "T_TR_PICKLIST_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select T_TRPICKLIST_ID from T_TRPICKLISTEXP where ...)} <br>
     * T_TRPICKLISTEXP by T_TRPICKLIST_ID, named 'TTrpicklistexpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrpicklistexpList</span>(trpicklistexpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trpicklistexpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrpicklistexpList for 'exists'. (NotNull)
     */
    public void existsTTrpicklistexpList(SubQuery<TTrpicklistexpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpicklistexpCB cb = new TTrpicklistexpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTTrPicklistId_ExistsReferrer_TTrpicklistexpList(cb.query());
        registerExistsReferrer(cb.query(), "T_TR_PICKLIST_ID", "T_TRPICKLIST_ID", pp, "tTrpicklistexpList");
    }
    public abstract String keepTTrPicklistId_ExistsReferrer_TTrpicklistexpList(TTrpicklistexpCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select T_TRPICKLIST_ID from T_TRPICKLISTEXP where ...)} <br>
     * T_TRPICKLISTEXP by T_TRPICKLIST_ID, named 'TTrpicklistexpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrpicklistexpList</span>(trpicklistexpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trpicklistexpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrPicklistId_NotExistsReferrer_TTrpicklistexpList for 'not exists'. (NotNull)
     */
    public void notExistsTTrpicklistexpList(SubQuery<TTrpicklistexpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpicklistexpCB cb = new TTrpicklistexpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTTrPicklistId_NotExistsReferrer_TTrpicklistexpList(cb.query());
        registerNotExistsReferrer(cb.query(), "T_TR_PICKLIST_ID", "T_TRPICKLIST_ID", pp, "tTrpicklistexpList");
    }
    public abstract String keepTTrPicklistId_NotExistsReferrer_TTrpicklistexpList(TTrpicklistexpCQ sq);

    public void xsderiveTTrpicklistexpList(String fn, SubQuery<TTrpicklistexpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpicklistexpCB cb = new TTrpicklistexpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTTrPicklistId_SpecifyDerivedReferrer_TTrpicklistexpList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "T_TR_PICKLIST_ID", "T_TRPICKLIST_ID", pp, "tTrpicklistexpList", al, op);
    }
    public abstract String keepTTrPicklistId_SpecifyDerivedReferrer_TTrpicklistexpList(TTrpicklistexpCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRPICKLISTEXP where ...)} <br>
     * T_TRPICKLISTEXP by T_TRPICKLIST_ID, named 'TTrpicklistexpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrpicklistexpList()</span>.<span style="color: #CC4747">max</span>(trpicklistexpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trpicklistexpCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trpicklistexpCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrpicklistexpCB> derivedTTrpicklistexpList() {
        return xcreateQDRFunctionTTrpicklistexpList();
    }
    protected HpQDRFunction<TTrpicklistexpCB> xcreateQDRFunctionTTrpicklistexpList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrpicklistexpList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrpicklistexpList(String fn, SubQuery<TTrpicklistexpCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpicklistexpCB cb = new TTrpicklistexpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTTrPicklistId_QueryDerivedReferrer_TTrpicklistexpList(cb.query()); String prpp = keepTTrPicklistId_QueryDerivedReferrer_TTrpicklistexpListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "T_TR_PICKLIST_ID", "T_TRPICKLIST_ID", sqpp, "tTrpicklistexpList", rd, vl, prpp, op);
    }
    public abstract String keepTTrPicklistId_QueryDerivedReferrer_TTrpicklistexpList(TTrpicklistexpCQ sq);
    public abstract String keepTTrPicklistId_QueryDerivedReferrer_TTrpicklistexpListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTTrPicklistId_IsNull() { regTTrPicklistId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTTrPicklistId_IsNotNull() { regTTrPicklistId(CK_ISNN, DOBJ); }

    protected void regTTrPicklistId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTTrPicklistId(), "T_TR_PICKLIST_ID"); }
    protected abstract ConditionValue xgetCValueTTrPicklistId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL}
     * @param trpickdetailId The value of trpickdetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpickdetailId_Equal(Long trpickdetailId) {
        doSetTrpickdetailId_Equal(trpickdetailId);
    }

    protected void doSetTrpickdetailId_Equal(Long trpickdetailId) {
        regTrpickdetailId(CK_EQ, trpickdetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL}
     * @param trpickdetailId The value of trpickdetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpickdetailId_NotEqual(Long trpickdetailId) {
        doSetTrpickdetailId_NotEqual(trpickdetailId);
    }

    protected void doSetTrpickdetailId_NotEqual(Long trpickdetailId) {
        regTrpickdetailId(CK_NES, trpickdetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL}
     * @param trpickdetailId The value of trpickdetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpickdetailId_GreaterThan(Long trpickdetailId) {
        regTrpickdetailId(CK_GT, trpickdetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL}
     * @param trpickdetailId The value of trpickdetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpickdetailId_LessThan(Long trpickdetailId) {
        regTrpickdetailId(CK_LT, trpickdetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL}
     * @param trpickdetailId The value of trpickdetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpickdetailId_GreaterEqual(Long trpickdetailId) {
        regTrpickdetailId(CK_GE, trpickdetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL}
     * @param trpickdetailId The value of trpickdetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpickdetailId_LessEqual(Long trpickdetailId) {
        regTrpickdetailId(CK_LE, trpickdetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL}
     * @param minNumber The min number of trpickdetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trpickdetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrpickdetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrpickdetailId(), "TRPICKDETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL}
     * @param trpickdetailIdList The collection of trpickdetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpickdetailId_InScope(Collection<Long> trpickdetailIdList) {
        doSetTrpickdetailId_InScope(trpickdetailIdList);
    }

    protected void doSetTrpickdetailId_InScope(Collection<Long> trpickdetailIdList) {
        regINS(CK_INS, cTL(trpickdetailIdList), xgetCValueTrpickdetailId(), "TRPICKDETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL}
     * @param trpickdetailIdList The collection of trpickdetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpickdetailId_NotInScope(Collection<Long> trpickdetailIdList) {
        doSetTrpickdetailId_NotInScope(trpickdetailIdList);
    }

    protected void doSetTrpickdetailId_NotInScope(Collection<Long> trpickdetailIdList) {
        regINS(CK_NINS, cTL(trpickdetailIdList), xgetCValueTrpickdetailId(), "TRPICKDETAIL_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TRPICKDETAIL_ID from T_TRPICKDETAIL where ...)} <br />
     * T_TRPICKDETAIL by my TRPICKDETAIL_ID, named 'TTrpickdetail'.
     * @param subCBLambda The callback for sub-query of TTrpickdetail for 'in-scope'. (NotNull)
     */
    public void inScopeTTrpickdetail(SubQuery<TTrpickdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpickdetailCB cb = new TTrpickdetailCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrpickdetailId_InScopeRelation_TTrpickdetail(cb.query());
        registerInScopeRelation(cb.query(), "TRPICKDETAIL_ID", "TRPICKDETAIL_ID", pp, "tTrpickdetail", false);
    }
    public abstract String keepTrpickdetailId_InScopeRelation_TTrpickdetail(TTrpickdetailCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TRPICKDETAIL_ID from T_TRPICKDETAIL where ...)} <br />
     * T_TRPICKDETAIL by my TRPICKDETAIL_ID, named 'TTrpickdetail'.
     * @param subCBLambda The callback for sub-query of TTrpickdetail for 'not in-scope'. (NotNull)
     */
    public void notInScopeTTrpickdetail(SubQuery<TTrpickdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpickdetailCB cb = new TTrpickdetailCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrpickdetailId_NotInScopeRelation_TTrpickdetail(cb.query());
        registerInScopeRelation(cb.query(), "TRPICKDETAIL_ID", "TRPICKDETAIL_ID", pp, "tTrpickdetail", true);
    }
    public abstract String keepTrpickdetailId_NotInScopeRelation_TTrpickdetail(TTrpickdetailCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL}
     */
    public void setTrpickdetailId_IsNull() { regTrpickdetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL}
     */
    public void setTrpickdetailId_IsNotNull() { regTrpickdetailId(CK_ISNN, DOBJ); }

    protected void regTrpickdetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrpickdetailId(), "TRPICKDETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTrpickdetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {NotNull, bigint(19)}
     * @param pickListKey The value of pickListKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickListKey_Equal(Long pickListKey) {
        doSetPickListKey_Equal(pickListKey);
    }

    protected void doSetPickListKey_Equal(Long pickListKey) {
        regPickListKey(CK_EQ, pickListKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {NotNull, bigint(19)}
     * @param pickListKey The value of pickListKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickListKey_NotEqual(Long pickListKey) {
        doSetPickListKey_NotEqual(pickListKey);
    }

    protected void doSetPickListKey_NotEqual(Long pickListKey) {
        regPickListKey(CK_NES, pickListKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {NotNull, bigint(19)}
     * @param pickListKey The value of pickListKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickListKey_GreaterThan(Long pickListKey) {
        regPickListKey(CK_GT, pickListKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {NotNull, bigint(19)}
     * @param pickListKey The value of pickListKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickListKey_LessThan(Long pickListKey) {
        regPickListKey(CK_LT, pickListKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {NotNull, bigint(19)}
     * @param pickListKey The value of pickListKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickListKey_GreaterEqual(Long pickListKey) {
        regPickListKey(CK_GE, pickListKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {NotNull, bigint(19)}
     * @param pickListKey The value of pickListKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickListKey_LessEqual(Long pickListKey) {
        regPickListKey(CK_LE, pickListKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_LIST_KEY: {NotNull, bigint(19)}
     * @param minNumber The min number of pickListKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickListKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickListKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickListKey(), "PICK_LIST_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICK_LIST_KEY: {NotNull, bigint(19)}
     * @param pickListKeyList The collection of pickListKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickListKey_InScope(Collection<Long> pickListKeyList) {
        doSetPickListKey_InScope(pickListKeyList);
    }

    protected void doSetPickListKey_InScope(Collection<Long> pickListKeyList) {
        regINS(CK_INS, cTL(pickListKeyList), xgetCValuePickListKey(), "PICK_LIST_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICK_LIST_KEY: {NotNull, bigint(19)}
     * @param pickListKeyList The collection of pickListKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickListKey_NotInScope(Collection<Long> pickListKeyList) {
        doSetPickListKey_NotInScope(pickListKeyList);
    }

    protected void doSetPickListKey_NotInScope(Collection<Long> pickListKeyList) {
        regINS(CK_NINS, cTL(pickListKeyList), xgetCValuePickListKey(), "PICK_LIST_KEY");
    }

    protected void regPickListKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickListKey(), "PICK_LIST_KEY"); }
    protected abstract ConditionValue xgetCValuePickListKey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNo The value of picklistGNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistGNo_Equal(Long picklistGNo) {
        doSetPicklistGNo_Equal(picklistGNo);
    }

    protected void doSetPicklistGNo_Equal(Long picklistGNo) {
        regPicklistGNo(CK_EQ, picklistGNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNo The value of picklistGNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistGNo_NotEqual(Long picklistGNo) {
        doSetPicklistGNo_NotEqual(picklistGNo);
    }

    protected void doSetPicklistGNo_NotEqual(Long picklistGNo) {
        regPicklistGNo(CK_NES, picklistGNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNo The value of picklistGNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistGNo_GreaterThan(Long picklistGNo) {
        regPicklistGNo(CK_GT, picklistGNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNo The value of picklistGNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistGNo_LessThan(Long picklistGNo) {
        regPicklistGNo(CK_LT, picklistGNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNo The value of picklistGNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistGNo_GreaterEqual(Long picklistGNo) {
        regPicklistGNo(CK_GE, picklistGNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNo The value of picklistGNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistGNo_LessEqual(Long picklistGNo) {
        regPicklistGNo(CK_LE, picklistGNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param minNumber The min number of picklistGNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of picklistGNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPicklistGNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePicklistGNo(), "PICKLIST_G_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNoList The collection of picklistGNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistGNo_InScope(Collection<Long> picklistGNoList) {
        doSetPicklistGNo_InScope(picklistGNoList);
    }

    protected void doSetPicklistGNo_InScope(Collection<Long> picklistGNoList) {
        regINS(CK_INS, cTL(picklistGNoList), xgetCValuePicklistGNo(), "PICKLIST_G_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @param picklistGNoList The collection of picklistGNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistGNo_NotInScope(Collection<Long> picklistGNoList) {
        doSetPicklistGNo_NotInScope(picklistGNoList);
    }

    protected void doSetPicklistGNo_NotInScope(Collection<Long> picklistGNoList) {
        regINS(CK_NINS, cTL(picklistGNoList), xgetCValuePicklistGNo(), "PICKLIST_G_NO");
    }

    protected void regPicklistGNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicklistGNo(), "PICKLIST_G_NO"); }
    protected abstract ConditionValue xgetCValuePicklistGNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, NotNull, bigint(19)}
     * @param plBatchKey The value of plBatchKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlBatchKey_Equal(Long plBatchKey) {
        doSetPlBatchKey_Equal(plBatchKey);
    }

    protected void doSetPlBatchKey_Equal(Long plBatchKey) {
        regPlBatchKey(CK_EQ, plBatchKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, NotNull, bigint(19)}
     * @param plBatchKey The value of plBatchKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlBatchKey_NotEqual(Long plBatchKey) {
        doSetPlBatchKey_NotEqual(plBatchKey);
    }

    protected void doSetPlBatchKey_NotEqual(Long plBatchKey) {
        regPlBatchKey(CK_NES, plBatchKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, NotNull, bigint(19)}
     * @param plBatchKey The value of plBatchKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlBatchKey_GreaterThan(Long plBatchKey) {
        regPlBatchKey(CK_GT, plBatchKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, NotNull, bigint(19)}
     * @param plBatchKey The value of plBatchKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlBatchKey_LessThan(Long plBatchKey) {
        regPlBatchKey(CK_LT, plBatchKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, NotNull, bigint(19)}
     * @param plBatchKey The value of plBatchKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlBatchKey_GreaterEqual(Long plBatchKey) {
        regPlBatchKey(CK_GE, plBatchKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, NotNull, bigint(19)}
     * @param plBatchKey The value of plBatchKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlBatchKey_LessEqual(Long plBatchKey) {
        regPlBatchKey(CK_LE, plBatchKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of plBatchKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of plBatchKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlBatchKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlBatchKey(), "PL_BATCH_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PL_BATCH_KEY: {IX, NotNull, bigint(19)}
     * @param plBatchKeyList The collection of plBatchKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlBatchKey_InScope(Collection<Long> plBatchKeyList) {
        doSetPlBatchKey_InScope(plBatchKeyList);
    }

    protected void doSetPlBatchKey_InScope(Collection<Long> plBatchKeyList) {
        regINS(CK_INS, cTL(plBatchKeyList), xgetCValuePlBatchKey(), "PL_BATCH_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PL_BATCH_KEY: {IX, NotNull, bigint(19)}
     * @param plBatchKeyList The collection of plBatchKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlBatchKey_NotInScope(Collection<Long> plBatchKeyList) {
        doSetPlBatchKey_NotInScope(plBatchKeyList);
    }

    protected void doSetPlBatchKey_NotInScope(Collection<Long> plBatchKeyList) {
        regINS(CK_NINS, cTL(plBatchKeyList), xgetCValuePlBatchKey(), "PL_BATCH_KEY");
    }

    protected void regPlBatchKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlBatchKey(), "PL_BATCH_KEY"); }
    protected abstract ConditionValue xgetCValuePlBatchKey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19)}
     * @param stockId The value of stockId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_Equal(Long stockId) {
        doSetStockId_Equal(stockId);
    }

    protected void doSetStockId_Equal(Long stockId) {
        regStockId(CK_EQ, stockId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19)}
     * @param stockId The value of stockId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_NotEqual(Long stockId) {
        doSetStockId_NotEqual(stockId);
    }

    protected void doSetStockId_NotEqual(Long stockId) {
        regStockId(CK_NES, stockId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19)}
     * @param stockId The value of stockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterThan(Long stockId) {
        regStockId(CK_GT, stockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19)}
     * @param stockId The value of stockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessThan(Long stockId) {
        regStockId(CK_LT, stockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19)}
     * @param stockId The value of stockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterEqual(Long stockId) {
        regStockId(CK_GE, stockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19)}
     * @param stockId The value of stockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessEqual(Long stockId) {
        regStockId(CK_LE, stockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockId(), "STOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19)}
     * @param stockIdList The collection of stockId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_InScope(Collection<Long> stockIdList) {
        doSetStockId_InScope(stockIdList);
    }

    protected void doSetStockId_InScope(Collection<Long> stockIdList) {
        regINS(CK_INS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19)}
     * @param stockIdList The collection of stockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_NotInScope(Collection<Long> stockIdList) {
        doSetStockId_NotInScope(stockIdList);
    }

    protected void doSetStockId_NotInScope(Collection<Long> stockIdList) {
        regINS(CK_NINS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    protected void regStockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockId(), "STOCK_ID"); }
    protected abstract ConditionValue xgetCValueStockId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_Equal(Long lotId) {
        doSetLotId_Equal(lotId);
    }

    protected void doSetLotId_Equal(Long lotId) {
        regLotId(CK_EQ, lotId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_NotEqual(Long lotId) {
        doSetLotId_NotEqual(lotId);
    }

    protected void doSetLotId_NotEqual(Long lotId) {
        regLotId(CK_NES, lotId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotIdList The collection of lotId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_InScope(Collection<Long> lotIdList) {
        doSetLotId_InScope(lotIdList);
    }

    protected void doSetLotId_InScope(Collection<Long> lotIdList) {
        regINS(CK_INS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotIdList The collection of lotId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_NotInScope(Collection<Long> lotIdList) {
        doSetLotId_NotInScope(lotIdList);
    }

    protected void doSetLotId_NotInScope(Collection<Long> lotIdList) {
        regINS(CK_NINS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     */
    public void setLotId_IsNull() { regLotId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     */
    public void setLotId_IsNotNull() { regLotId(CK_ISNN, DOBJ); }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_DATE: {IX, NotNull, varchar(8)}
     * @param picklistDate The value of picklistDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistDate_Equal(String picklistDate) {
        doSetPicklistDate_Equal(fRES(picklistDate));
    }

    protected void doSetPicklistDate_Equal(String picklistDate) {
        regPicklistDate(CK_EQ, picklistDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_DATE: {IX, NotNull, varchar(8)}
     * @param picklistDate The value of picklistDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistDate_NotEqual(String picklistDate) {
        doSetPicklistDate_NotEqual(fRES(picklistDate));
    }

    protected void doSetPicklistDate_NotEqual(String picklistDate) {
        regPicklistDate(CK_NES, picklistDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_DATE: {IX, NotNull, varchar(8)}
     * @param picklistDate The value of picklistDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistDate_GreaterThan(String picklistDate) {
        regPicklistDate(CK_GT, fRES(picklistDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_DATE: {IX, NotNull, varchar(8)}
     * @param picklistDate The value of picklistDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistDate_LessThan(String picklistDate) {
        regPicklistDate(CK_LT, fRES(picklistDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_DATE: {IX, NotNull, varchar(8)}
     * @param picklistDate The value of picklistDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistDate_GreaterEqual(String picklistDate) {
        regPicklistDate(CK_GE, fRES(picklistDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLIST_DATE: {IX, NotNull, varchar(8)}
     * @param picklistDate The value of picklistDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistDate_LessEqual(String picklistDate) {
        regPicklistDate(CK_LE, fRES(picklistDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKLIST_DATE: {IX, NotNull, varchar(8)}
     * @param picklistDateList The collection of picklistDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistDate_InScope(Collection<String> picklistDateList) {
        doSetPicklistDate_InScope(picklistDateList);
    }

    protected void doSetPicklistDate_InScope(Collection<String> picklistDateList) {
        regINS(CK_INS, cTL(picklistDateList), xgetCValuePicklistDate(), "PICKLIST_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKLIST_DATE: {IX, NotNull, varchar(8)}
     * @param picklistDateList The collection of picklistDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistDate_NotInScope(Collection<String> picklistDateList) {
        doSetPicklistDate_NotInScope(picklistDateList);
    }

    protected void doSetPicklistDate_NotInScope(Collection<String> picklistDateList) {
        regINS(CK_NINS, cTL(picklistDateList), xgetCValuePicklistDate(), "PICKLIST_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKLIST_DATE: {IX, NotNull, varchar(8)} <br>
     * <pre>e.g. setPicklistDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param picklistDate The value of picklistDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPicklistDate_LikeSearch(String picklistDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(picklistDate), xgetCValuePicklistDate(), "PICKLIST_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKLIST_DATE: {IX, NotNull, varchar(8)}
     * @param picklistDate The value of picklistDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPicklistDate_NotLikeSearch(String picklistDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(picklistDate), xgetCValuePicklistDate(), "PICKLIST_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKLIST_DATE: {IX, NotNull, varchar(8)}
     * @param picklistDate The value of picklistDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistDate_PrefixSearch(String picklistDate) {
        setPicklistDate_LikeSearch(picklistDate, xcLSOPPre());
    }

    protected void regPicklistDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicklistDate(), "PICKLIST_DATE"); }
    protected abstract ConditionValue xgetCValuePicklistDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_Equal(String productCd) {
        doSetProductCd_Equal(fRES(productCd));
    }

    protected void doSetProductCd_Equal(String productCd) {
        regProductCd(CK_EQ, productCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotEqual(String productCd) {
        doSetProductCd_NotEqual(fRES(productCd));
    }

    protected void doSetProductCd_NotEqual(String productCd) {
        regProductCd(CK_NES, productCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCdList The collection of productCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_InScope(Collection<String> productCdList) {
        doSetProductCd_InScope(productCdList);
    }

    protected void doSetProductCd_InScope(Collection<String> productCdList) {
        regINS(CK_INS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCdList The collection of productCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotInScope(Collection<String> productCdList) {
        doSetProductCd_NotInScope(productCdList);
    }

    protected void doSetProductCd_NotInScope(Collection<String> productCdList) {
        regINS(CK_NINS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setProductCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCd The value of productCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCd_LikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {IX, NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_Equal(String manufactureDate) {
        doSetManufactureDate_Equal(fRES(manufactureDate));
    }

    protected void doSetManufactureDate_Equal(String manufactureDate) {
        regManufactureDate(CK_EQ, manufactureDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {IX, NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_NotEqual(String manufactureDate) {
        doSetManufactureDate_NotEqual(fRES(manufactureDate));
    }

    protected void doSetManufactureDate_NotEqual(String manufactureDate) {
        regManufactureDate(CK_NES, manufactureDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {IX, NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_GreaterThan(String manufactureDate) {
        regManufactureDate(CK_GT, fRES(manufactureDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {IX, NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_LessThan(String manufactureDate) {
        regManufactureDate(CK_LT, fRES(manufactureDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {IX, NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_GreaterEqual(String manufactureDate) {
        regManufactureDate(CK_GE, fRES(manufactureDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {IX, NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_LessEqual(String manufactureDate) {
        regManufactureDate(CK_LE, fRES(manufactureDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {IX, NotNull, varchar(8)}
     * @param manufactureDateList The collection of manufactureDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_InScope(Collection<String> manufactureDateList) {
        doSetManufactureDate_InScope(manufactureDateList);
    }

    protected void doSetManufactureDate_InScope(Collection<String> manufactureDateList) {
        regINS(CK_INS, cTL(manufactureDateList), xgetCValueManufactureDate(), "MANUFACTURE_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {IX, NotNull, varchar(8)}
     * @param manufactureDateList The collection of manufactureDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_NotInScope(Collection<String> manufactureDateList) {
        doSetManufactureDate_NotInScope(manufactureDateList);
    }

    protected void doSetManufactureDate_NotInScope(Collection<String> manufactureDateList) {
        regINS(CK_NINS, cTL(manufactureDateList), xgetCValueManufactureDate(), "MANUFACTURE_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {IX, NotNull, varchar(8)} <br>
     * <pre>e.g. setManufactureDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufactureDate The value of manufactureDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufactureDate_LikeSearch(String manufactureDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufactureDate), xgetCValueManufactureDate(), "MANUFACTURE_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {IX, NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufactureDate_NotLikeSearch(String manufactureDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufactureDate), xgetCValueManufactureDate(), "MANUFACTURE_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {IX, NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_PrefixSearch(String manufactureDate) {
        setManufactureDate_LikeSearch(manufactureDate, xcLSOPPre());
    }

    protected void regManufactureDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufactureDate(), "MANUFACTURE_DATE"); }
    protected abstract ConditionValue xgetCValueManufactureDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @param designFlg The value of designFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_Equal(String designFlg) {
        doSetDesignFlg_Equal(fRES(designFlg));
    }

    protected void doSetDesignFlg_Equal(String designFlg) {
        regDesignFlg(CK_EQ, designFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @param designFlg The value of designFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_NotEqual(String designFlg) {
        doSetDesignFlg_NotEqual(fRES(designFlg));
    }

    protected void doSetDesignFlg_NotEqual(String designFlg) {
        regDesignFlg(CK_NES, designFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @param designFlg The value of designFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_GreaterThan(String designFlg) {
        regDesignFlg(CK_GT, fRES(designFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @param designFlg The value of designFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_LessThan(String designFlg) {
        regDesignFlg(CK_LT, fRES(designFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @param designFlg The value of designFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_GreaterEqual(String designFlg) {
        regDesignFlg(CK_GE, fRES(designFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @param designFlg The value of designFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_LessEqual(String designFlg) {
        regDesignFlg(CK_LE, fRES(designFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @param designFlgList The collection of designFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_InScope(Collection<String> designFlgList) {
        doSetDesignFlg_InScope(designFlgList);
    }

    protected void doSetDesignFlg_InScope(Collection<String> designFlgList) {
        regINS(CK_INS, cTL(designFlgList), xgetCValueDesignFlg(), "DESIGN_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @param designFlgList The collection of designFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_NotInScope(Collection<String> designFlgList) {
        doSetDesignFlg_NotInScope(designFlgList);
    }

    protected void doSetDesignFlg_NotInScope(Collection<String> designFlgList) {
        regINS(CK_NINS, cTL(designFlgList), xgetCValueDesignFlg(), "DESIGN_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {NotNull, varchar(30)} <br>
     * <pre>e.g. setDesignFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designFlg The value of designFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesignFlg_LikeSearch(String designFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designFlg), xgetCValueDesignFlg(), "DESIGN_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @param designFlg The value of designFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesignFlg_NotLikeSearch(String designFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designFlg), xgetCValueDesignFlg(), "DESIGN_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @param designFlg The value of designFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_PrefixSearch(String designFlg) {
        setDesignFlg_LikeSearch(designFlg, xcLSOPPre());
    }

    protected void regDesignFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesignFlg(), "DESIGN_FLG"); }
    protected abstract ConditionValue xgetCValueDesignFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_Equal(String monthFlg) {
        doSetMonthFlg_Equal(fRES(monthFlg));
    }

    protected void doSetMonthFlg_Equal(String monthFlg) {
        regMonthFlg(CK_EQ, monthFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_NotEqual(String monthFlg) {
        doSetMonthFlg_NotEqual(fRES(monthFlg));
    }

    protected void doSetMonthFlg_NotEqual(String monthFlg) {
        regMonthFlg(CK_NES, monthFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_GreaterThan(String monthFlg) {
        regMonthFlg(CK_GT, fRES(monthFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_LessThan(String monthFlg) {
        regMonthFlg(CK_LT, fRES(monthFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_GreaterEqual(String monthFlg) {
        regMonthFlg(CK_GE, fRES(monthFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_LessEqual(String monthFlg) {
        regMonthFlg(CK_LE, fRES(monthFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlgList The collection of monthFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_InScope(Collection<String> monthFlgList) {
        doSetMonthFlg_InScope(monthFlgList);
    }

    protected void doSetMonthFlg_InScope(Collection<String> monthFlgList) {
        regINS(CK_INS, cTL(monthFlgList), xgetCValueMonthFlg(), "MONTH_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlgList The collection of monthFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_NotInScope(Collection<String> monthFlgList) {
        doSetMonthFlg_NotInScope(monthFlgList);
    }

    protected void doSetMonthFlg_NotInScope(Collection<String> monthFlgList) {
        regINS(CK_NINS, cTL(monthFlgList), xgetCValueMonthFlg(), "MONTH_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MONTH_FLG: {varchar(30)} <br>
     * <pre>e.g. setMonthFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param monthFlg The value of monthFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMonthFlg_LikeSearch(String monthFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(monthFlg), xgetCValueMonthFlg(), "MONTH_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMonthFlg_NotLikeSearch(String monthFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(monthFlg), xgetCValueMonthFlg(), "MONTH_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_PrefixSearch(String monthFlg) {
        setMonthFlg_LikeSearch(monthFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     */
    public void setMonthFlg_IsNull() { regMonthFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     */
    public void setMonthFlg_IsNullOrEmpty() { regMonthFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     */
    public void setMonthFlg_IsNotNull() { regMonthFlg(CK_ISNN, DOBJ); }

    protected void regMonthFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMonthFlg(), "MONTH_FLG"); }
    protected abstract ConditionValue xgetCValueMonthFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAILY_FLG: {varchar(30)}
     * @param dailyFlg The value of dailyFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDailyFlg_Equal(String dailyFlg) {
        doSetDailyFlg_Equal(fRES(dailyFlg));
    }

    protected void doSetDailyFlg_Equal(String dailyFlg) {
        regDailyFlg(CK_EQ, dailyFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAILY_FLG: {varchar(30)}
     * @param dailyFlg The value of dailyFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDailyFlg_NotEqual(String dailyFlg) {
        doSetDailyFlg_NotEqual(fRES(dailyFlg));
    }

    protected void doSetDailyFlg_NotEqual(String dailyFlg) {
        regDailyFlg(CK_NES, dailyFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAILY_FLG: {varchar(30)}
     * @param dailyFlg The value of dailyFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDailyFlg_GreaterThan(String dailyFlg) {
        regDailyFlg(CK_GT, fRES(dailyFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAILY_FLG: {varchar(30)}
     * @param dailyFlg The value of dailyFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDailyFlg_LessThan(String dailyFlg) {
        regDailyFlg(CK_LT, fRES(dailyFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAILY_FLG: {varchar(30)}
     * @param dailyFlg The value of dailyFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDailyFlg_GreaterEqual(String dailyFlg) {
        regDailyFlg(CK_GE, fRES(dailyFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAILY_FLG: {varchar(30)}
     * @param dailyFlg The value of dailyFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDailyFlg_LessEqual(String dailyFlg) {
        regDailyFlg(CK_LE, fRES(dailyFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAILY_FLG: {varchar(30)}
     * @param dailyFlgList The collection of dailyFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDailyFlg_InScope(Collection<String> dailyFlgList) {
        doSetDailyFlg_InScope(dailyFlgList);
    }

    protected void doSetDailyFlg_InScope(Collection<String> dailyFlgList) {
        regINS(CK_INS, cTL(dailyFlgList), xgetCValueDailyFlg(), "DAILY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAILY_FLG: {varchar(30)}
     * @param dailyFlgList The collection of dailyFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDailyFlg_NotInScope(Collection<String> dailyFlgList) {
        doSetDailyFlg_NotInScope(dailyFlgList);
    }

    protected void doSetDailyFlg_NotInScope(Collection<String> dailyFlgList) {
        regINS(CK_NINS, cTL(dailyFlgList), xgetCValueDailyFlg(), "DAILY_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAILY_FLG: {varchar(30)} <br>
     * <pre>e.g. setDailyFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dailyFlg The value of dailyFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDailyFlg_LikeSearch(String dailyFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dailyFlg), xgetCValueDailyFlg(), "DAILY_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAILY_FLG: {varchar(30)}
     * @param dailyFlg The value of dailyFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDailyFlg_NotLikeSearch(String dailyFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dailyFlg), xgetCValueDailyFlg(), "DAILY_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAILY_FLG: {varchar(30)}
     * @param dailyFlg The value of dailyFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDailyFlg_PrefixSearch(String dailyFlg) {
        setDailyFlg_LikeSearch(dailyFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DAILY_FLG: {varchar(30)}
     */
    public void setDailyFlg_IsNull() { regDailyFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DAILY_FLG: {varchar(30)}
     */
    public void setDailyFlg_IsNullOrEmpty() { regDailyFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DAILY_FLG: {varchar(30)}
     */
    public void setDailyFlg_IsNotNull() { regDailyFlg(CK_ISNN, DOBJ); }

    protected void regDailyFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDailyFlg(), "DAILY_FLG"); }
    protected abstract ConditionValue xgetCValueDailyFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     * @param frontRackFlg The value of frontRackFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontRackFlg_Equal(String frontRackFlg) {
        doSetFrontRackFlg_Equal(fRES(frontRackFlg));
    }

    protected void doSetFrontRackFlg_Equal(String frontRackFlg) {
        regFrontRackFlg(CK_EQ, frontRackFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     * @param frontRackFlg The value of frontRackFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontRackFlg_NotEqual(String frontRackFlg) {
        doSetFrontRackFlg_NotEqual(fRES(frontRackFlg));
    }

    protected void doSetFrontRackFlg_NotEqual(String frontRackFlg) {
        regFrontRackFlg(CK_NES, frontRackFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     * @param frontRackFlg The value of frontRackFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontRackFlg_GreaterThan(String frontRackFlg) {
        regFrontRackFlg(CK_GT, fRES(frontRackFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     * @param frontRackFlg The value of frontRackFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontRackFlg_LessThan(String frontRackFlg) {
        regFrontRackFlg(CK_LT, fRES(frontRackFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     * @param frontRackFlg The value of frontRackFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontRackFlg_GreaterEqual(String frontRackFlg) {
        regFrontRackFlg(CK_GE, fRES(frontRackFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     * @param frontRackFlg The value of frontRackFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontRackFlg_LessEqual(String frontRackFlg) {
        regFrontRackFlg(CK_LE, fRES(frontRackFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     * @param frontRackFlgList The collection of frontRackFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontRackFlg_InScope(Collection<String> frontRackFlgList) {
        doSetFrontRackFlg_InScope(frontRackFlgList);
    }

    protected void doSetFrontRackFlg_InScope(Collection<String> frontRackFlgList) {
        regINS(CK_INS, cTL(frontRackFlgList), xgetCValueFrontRackFlg(), "FRONT_RACK_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     * @param frontRackFlgList The collection of frontRackFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontRackFlg_NotInScope(Collection<String> frontRackFlgList) {
        doSetFrontRackFlg_NotInScope(frontRackFlgList);
    }

    protected void doSetFrontRackFlg_NotInScope(Collection<String> frontRackFlgList) {
        regINS(CK_NINS, cTL(frontRackFlgList), xgetCValueFrontRackFlg(), "FRONT_RACK_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FRONT_RACK_FLG: {varchar(30)} <br>
     * <pre>e.g. setFrontRackFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param frontRackFlg The value of frontRackFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFrontRackFlg_LikeSearch(String frontRackFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(frontRackFlg), xgetCValueFrontRackFlg(), "FRONT_RACK_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     * @param frontRackFlg The value of frontRackFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFrontRackFlg_NotLikeSearch(String frontRackFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(frontRackFlg), xgetCValueFrontRackFlg(), "FRONT_RACK_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     * @param frontRackFlg The value of frontRackFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrontRackFlg_PrefixSearch(String frontRackFlg) {
        setFrontRackFlg_LikeSearch(frontRackFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     */
    public void setFrontRackFlg_IsNull() { regFrontRackFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     */
    public void setFrontRackFlg_IsNullOrEmpty() { regFrontRackFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FRONT_RACK_FLG: {varchar(30)}
     */
    public void setFrontRackFlg_IsNotNull() { regFrontRackFlg(CK_ISNN, DOBJ); }

    protected void regFrontRackFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFrontRackFlg(), "FRONT_RACK_FLG"); }
    protected abstract ConditionValue xgetCValueFrontRackFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_FLG: {varchar(30)}
     * @param locFlg The value of locFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocFlg_Equal(String locFlg) {
        doSetLocFlg_Equal(fRES(locFlg));
    }

    protected void doSetLocFlg_Equal(String locFlg) {
        regLocFlg(CK_EQ, locFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_FLG: {varchar(30)}
     * @param locFlg The value of locFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocFlg_NotEqual(String locFlg) {
        doSetLocFlg_NotEqual(fRES(locFlg));
    }

    protected void doSetLocFlg_NotEqual(String locFlg) {
        regLocFlg(CK_NES, locFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_FLG: {varchar(30)}
     * @param locFlg The value of locFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocFlg_GreaterThan(String locFlg) {
        regLocFlg(CK_GT, fRES(locFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_FLG: {varchar(30)}
     * @param locFlg The value of locFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocFlg_LessThan(String locFlg) {
        regLocFlg(CK_LT, fRES(locFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_FLG: {varchar(30)}
     * @param locFlg The value of locFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocFlg_GreaterEqual(String locFlg) {
        regLocFlg(CK_GE, fRES(locFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_FLG: {varchar(30)}
     * @param locFlg The value of locFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocFlg_LessEqual(String locFlg) {
        regLocFlg(CK_LE, fRES(locFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOC_FLG: {varchar(30)}
     * @param locFlgList The collection of locFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocFlg_InScope(Collection<String> locFlgList) {
        doSetLocFlg_InScope(locFlgList);
    }

    protected void doSetLocFlg_InScope(Collection<String> locFlgList) {
        regINS(CK_INS, cTL(locFlgList), xgetCValueLocFlg(), "LOC_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOC_FLG: {varchar(30)}
     * @param locFlgList The collection of locFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocFlg_NotInScope(Collection<String> locFlgList) {
        doSetLocFlg_NotInScope(locFlgList);
    }

    protected void doSetLocFlg_NotInScope(Collection<String> locFlgList) {
        regINS(CK_NINS, cTL(locFlgList), xgetCValueLocFlg(), "LOC_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_FLG: {varchar(30)} <br>
     * <pre>e.g. setLocFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locFlg The value of locFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocFlg_LikeSearch(String locFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locFlg), xgetCValueLocFlg(), "LOC_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_FLG: {varchar(30)}
     * @param locFlg The value of locFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocFlg_NotLikeSearch(String locFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locFlg), xgetCValueLocFlg(), "LOC_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_FLG: {varchar(30)}
     * @param locFlg The value of locFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocFlg_PrefixSearch(String locFlg) {
        setLocFlg_LikeSearch(locFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOC_FLG: {varchar(30)}
     */
    public void setLocFlg_IsNull() { regLocFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOC_FLG: {varchar(30)}
     */
    public void setLocFlg_IsNullOrEmpty() { regLocFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOC_FLG: {varchar(30)}
     */
    public void setLocFlg_IsNotNull() { regLocFlg(CK_ISNN, DOBJ); }

    protected void regLocFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocFlg(), "LOC_FLG"); }
    protected abstract ConditionValue xgetCValueLocFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {varchar(30)}
     * @param stdDifFlg The value of stdDifFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStdDifFlg_Equal(String stdDifFlg) {
        doSetStdDifFlg_Equal(fRES(stdDifFlg));
    }

    protected void doSetStdDifFlg_Equal(String stdDifFlg) {
        regStdDifFlg(CK_EQ, stdDifFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {varchar(30)}
     * @param stdDifFlg The value of stdDifFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStdDifFlg_NotEqual(String stdDifFlg) {
        doSetStdDifFlg_NotEqual(fRES(stdDifFlg));
    }

    protected void doSetStdDifFlg_NotEqual(String stdDifFlg) {
        regStdDifFlg(CK_NES, stdDifFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {varchar(30)}
     * @param stdDifFlg The value of stdDifFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStdDifFlg_GreaterThan(String stdDifFlg) {
        regStdDifFlg(CK_GT, fRES(stdDifFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {varchar(30)}
     * @param stdDifFlg The value of stdDifFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStdDifFlg_LessThan(String stdDifFlg) {
        regStdDifFlg(CK_LT, fRES(stdDifFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {varchar(30)}
     * @param stdDifFlg The value of stdDifFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStdDifFlg_GreaterEqual(String stdDifFlg) {
        regStdDifFlg(CK_GE, fRES(stdDifFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {varchar(30)}
     * @param stdDifFlg The value of stdDifFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStdDifFlg_LessEqual(String stdDifFlg) {
        regStdDifFlg(CK_LE, fRES(stdDifFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STD_DIF_FLG: {varchar(30)}
     * @param stdDifFlgList The collection of stdDifFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStdDifFlg_InScope(Collection<String> stdDifFlgList) {
        doSetStdDifFlg_InScope(stdDifFlgList);
    }

    protected void doSetStdDifFlg_InScope(Collection<String> stdDifFlgList) {
        regINS(CK_INS, cTL(stdDifFlgList), xgetCValueStdDifFlg(), "STD_DIF_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STD_DIF_FLG: {varchar(30)}
     * @param stdDifFlgList The collection of stdDifFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStdDifFlg_NotInScope(Collection<String> stdDifFlgList) {
        doSetStdDifFlg_NotInScope(stdDifFlgList);
    }

    protected void doSetStdDifFlg_NotInScope(Collection<String> stdDifFlgList) {
        regINS(CK_NINS, cTL(stdDifFlgList), xgetCValueStdDifFlg(), "STD_DIF_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STD_DIF_FLG: {varchar(30)} <br>
     * <pre>e.g. setStdDifFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stdDifFlg The value of stdDifFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStdDifFlg_LikeSearch(String stdDifFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stdDifFlg), xgetCValueStdDifFlg(), "STD_DIF_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STD_DIF_FLG: {varchar(30)}
     * @param stdDifFlg The value of stdDifFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStdDifFlg_NotLikeSearch(String stdDifFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stdDifFlg), xgetCValueStdDifFlg(), "STD_DIF_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STD_DIF_FLG: {varchar(30)}
     * @param stdDifFlg The value of stdDifFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStdDifFlg_PrefixSearch(String stdDifFlg) {
        setStdDifFlg_LikeSearch(stdDifFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {varchar(30)}
     */
    public void setStdDifFlg_IsNull() { regStdDifFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {varchar(30)}
     */
    public void setStdDifFlg_IsNullOrEmpty() { regStdDifFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {varchar(30)}
     */
    public void setStdDifFlg_IsNotNull() { regStdDifFlg(CK_ISNN, DOBJ); }

    protected void regStdDifFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStdDifFlg(), "STD_DIF_FLG"); }
    protected abstract ConditionValue xgetCValueStdDifFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     * @param orderType The value of orderType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderType_Equal(String orderType) {
        doSetOrderType_Equal(fRES(orderType));
    }

    protected void doSetOrderType_Equal(String orderType) {
        regOrderType(CK_EQ, orderType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     * @param orderType The value of orderType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderType_NotEqual(String orderType) {
        doSetOrderType_NotEqual(fRES(orderType));
    }

    protected void doSetOrderType_NotEqual(String orderType) {
        regOrderType(CK_NES, orderType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     * @param orderType The value of orderType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderType_GreaterThan(String orderType) {
        regOrderType(CK_GT, fRES(orderType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     * @param orderType The value of orderType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderType_LessThan(String orderType) {
        regOrderType(CK_LT, fRES(orderType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     * @param orderType The value of orderType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderType_GreaterEqual(String orderType) {
        regOrderType(CK_GE, fRES(orderType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     * @param orderType The value of orderType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderType_LessEqual(String orderType) {
        regOrderType(CK_LE, fRES(orderType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     * @param orderTypeList The collection of orderType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderType_InScope(Collection<String> orderTypeList) {
        doSetOrderType_InScope(orderTypeList);
    }

    protected void doSetOrderType_InScope(Collection<String> orderTypeList) {
        regINS(CK_INS, cTL(orderTypeList), xgetCValueOrderType(), "ORDER_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     * @param orderTypeList The collection of orderType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderType_NotInScope(Collection<String> orderTypeList) {
        doSetOrderType_NotInScope(orderTypeList);
    }

    protected void doSetOrderType_NotInScope(Collection<String> orderTypeList) {
        regINS(CK_NINS, cTL(orderTypeList), xgetCValueOrderType(), "ORDER_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TYPE: {IX, varchar(30)} <br>
     * <pre>e.g. setOrderType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderType The value of orderType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderType_LikeSearch(String orderType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderType), xgetCValueOrderType(), "ORDER_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     * @param orderType The value of orderType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderType_NotLikeSearch(String orderType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderType), xgetCValueOrderType(), "ORDER_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     * @param orderType The value of orderType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderType_PrefixSearch(String orderType) {
        setOrderType_LikeSearch(orderType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     */
    public void setOrderType_IsNull() { regOrderType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     */
    public void setOrderType_IsNullOrEmpty() { regOrderType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_TYPE: {IX, varchar(30)}
     */
    public void setOrderType_IsNotNull() { regOrderType(CK_ISNN, DOBJ); }

    protected void regOrderType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderType(), "ORDER_TYPE"); }
    protected abstract ConditionValue xgetCValueOrderType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TOSUB: {varchar(30)}
     * @param shipTosub The value of shipTosub as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipTosub_Equal(String shipTosub) {
        doSetShipTosub_Equal(fRES(shipTosub));
    }

    protected void doSetShipTosub_Equal(String shipTosub) {
        regShipTosub(CK_EQ, shipTosub);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TOSUB: {varchar(30)}
     * @param shipTosub The value of shipTosub as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipTosub_NotEqual(String shipTosub) {
        doSetShipTosub_NotEqual(fRES(shipTosub));
    }

    protected void doSetShipTosub_NotEqual(String shipTosub) {
        regShipTosub(CK_NES, shipTosub);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TOSUB: {varchar(30)}
     * @param shipTosub The value of shipTosub as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipTosub_GreaterThan(String shipTosub) {
        regShipTosub(CK_GT, fRES(shipTosub));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TOSUB: {varchar(30)}
     * @param shipTosub The value of shipTosub as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipTosub_LessThan(String shipTosub) {
        regShipTosub(CK_LT, fRES(shipTosub));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TOSUB: {varchar(30)}
     * @param shipTosub The value of shipTosub as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipTosub_GreaterEqual(String shipTosub) {
        regShipTosub(CK_GE, fRES(shipTosub));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TOSUB: {varchar(30)}
     * @param shipTosub The value of shipTosub as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipTosub_LessEqual(String shipTosub) {
        regShipTosub(CK_LE, fRES(shipTosub));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_TOSUB: {varchar(30)}
     * @param shipTosubList The collection of shipTosub as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipTosub_InScope(Collection<String> shipTosubList) {
        doSetShipTosub_InScope(shipTosubList);
    }

    protected void doSetShipTosub_InScope(Collection<String> shipTosubList) {
        regINS(CK_INS, cTL(shipTosubList), xgetCValueShipTosub(), "SHIP_TOSUB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_TOSUB: {varchar(30)}
     * @param shipTosubList The collection of shipTosub as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipTosub_NotInScope(Collection<String> shipTosubList) {
        doSetShipTosub_NotInScope(shipTosubList);
    }

    protected void doSetShipTosub_NotInScope(Collection<String> shipTosubList) {
        regINS(CK_NINS, cTL(shipTosubList), xgetCValueShipTosub(), "SHIP_TOSUB");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_TOSUB: {varchar(30)} <br>
     * <pre>e.g. setShipTosub_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipTosub The value of shipTosub as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipTosub_LikeSearch(String shipTosub, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipTosub), xgetCValueShipTosub(), "SHIP_TOSUB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_TOSUB: {varchar(30)}
     * @param shipTosub The value of shipTosub as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipTosub_NotLikeSearch(String shipTosub, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipTosub), xgetCValueShipTosub(), "SHIP_TOSUB", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_TOSUB: {varchar(30)}
     * @param shipTosub The value of shipTosub as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipTosub_PrefixSearch(String shipTosub) {
        setShipTosub_LikeSearch(shipTosub, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_TOSUB: {varchar(30)}
     */
    public void setShipTosub_IsNull() { regShipTosub(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_TOSUB: {varchar(30)}
     */
    public void setShipTosub_IsNullOrEmpty() { regShipTosub(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_TOSUB: {varchar(30)}
     */
    public void setShipTosub_IsNotNull() { regShipTosub(CK_ISNN, DOBJ); }

    protected void regShipTosub(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipTosub(), "SHIP_TOSUB"); }
    protected abstract ConditionValue xgetCValueShipTosub();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMA_NO: {varchar(30)}
     * @param rmaNo The value of rmaNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmaNo_Equal(String rmaNo) {
        doSetRmaNo_Equal(fRES(rmaNo));
    }

    protected void doSetRmaNo_Equal(String rmaNo) {
        regRmaNo(CK_EQ, rmaNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMA_NO: {varchar(30)}
     * @param rmaNo The value of rmaNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmaNo_NotEqual(String rmaNo) {
        doSetRmaNo_NotEqual(fRES(rmaNo));
    }

    protected void doSetRmaNo_NotEqual(String rmaNo) {
        regRmaNo(CK_NES, rmaNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMA_NO: {varchar(30)}
     * @param rmaNo The value of rmaNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmaNo_GreaterThan(String rmaNo) {
        regRmaNo(CK_GT, fRES(rmaNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMA_NO: {varchar(30)}
     * @param rmaNo The value of rmaNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmaNo_LessThan(String rmaNo) {
        regRmaNo(CK_LT, fRES(rmaNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMA_NO: {varchar(30)}
     * @param rmaNo The value of rmaNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmaNo_GreaterEqual(String rmaNo) {
        regRmaNo(CK_GE, fRES(rmaNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMA_NO: {varchar(30)}
     * @param rmaNo The value of rmaNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmaNo_LessEqual(String rmaNo) {
        regRmaNo(CK_LE, fRES(rmaNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RMA_NO: {varchar(30)}
     * @param rmaNoList The collection of rmaNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmaNo_InScope(Collection<String> rmaNoList) {
        doSetRmaNo_InScope(rmaNoList);
    }

    protected void doSetRmaNo_InScope(Collection<String> rmaNoList) {
        regINS(CK_INS, cTL(rmaNoList), xgetCValueRmaNo(), "RMA_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RMA_NO: {varchar(30)}
     * @param rmaNoList The collection of rmaNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmaNo_NotInScope(Collection<String> rmaNoList) {
        doSetRmaNo_NotInScope(rmaNoList);
    }

    protected void doSetRmaNo_NotInScope(Collection<String> rmaNoList) {
        regINS(CK_NINS, cTL(rmaNoList), xgetCValueRmaNo(), "RMA_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMA_NO: {varchar(30)} <br>
     * <pre>e.g. setRmaNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rmaNo The value of rmaNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRmaNo_LikeSearch(String rmaNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rmaNo), xgetCValueRmaNo(), "RMA_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMA_NO: {varchar(30)}
     * @param rmaNo The value of rmaNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRmaNo_NotLikeSearch(String rmaNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rmaNo), xgetCValueRmaNo(), "RMA_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMA_NO: {varchar(30)}
     * @param rmaNo The value of rmaNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmaNo_PrefixSearch(String rmaNo) {
        setRmaNo_LikeSearch(rmaNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RMA_NO: {varchar(30)}
     */
    public void setRmaNo_IsNull() { regRmaNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RMA_NO: {varchar(30)}
     */
    public void setRmaNo_IsNullOrEmpty() { regRmaNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RMA_NO: {varchar(30)}
     */
    public void setRmaNo_IsNotNull() { regRmaNo(CK_ISNN, DOBJ); }

    protected void regRmaNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRmaNo(), "RMA_NO"); }
    protected abstract ConditionValue xgetCValueRmaNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOTED_LOCATION_ID: {bigint(19)}
     * @param sotedLocationId The value of sotedLocationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSotedLocationId_Equal(Long sotedLocationId) {
        doSetSotedLocationId_Equal(sotedLocationId);
    }

    protected void doSetSotedLocationId_Equal(Long sotedLocationId) {
        regSotedLocationId(CK_EQ, sotedLocationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOTED_LOCATION_ID: {bigint(19)}
     * @param sotedLocationId The value of sotedLocationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSotedLocationId_NotEqual(Long sotedLocationId) {
        doSetSotedLocationId_NotEqual(sotedLocationId);
    }

    protected void doSetSotedLocationId_NotEqual(Long sotedLocationId) {
        regSotedLocationId(CK_NES, sotedLocationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOTED_LOCATION_ID: {bigint(19)}
     * @param sotedLocationId The value of sotedLocationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSotedLocationId_GreaterThan(Long sotedLocationId) {
        regSotedLocationId(CK_GT, sotedLocationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOTED_LOCATION_ID: {bigint(19)}
     * @param sotedLocationId The value of sotedLocationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSotedLocationId_LessThan(Long sotedLocationId) {
        regSotedLocationId(CK_LT, sotedLocationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOTED_LOCATION_ID: {bigint(19)}
     * @param sotedLocationId The value of sotedLocationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSotedLocationId_GreaterEqual(Long sotedLocationId) {
        regSotedLocationId(CK_GE, sotedLocationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOTED_LOCATION_ID: {bigint(19)}
     * @param sotedLocationId The value of sotedLocationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSotedLocationId_LessEqual(Long sotedLocationId) {
        regSotedLocationId(CK_LE, sotedLocationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOTED_LOCATION_ID: {bigint(19)}
     * @param minNumber The min number of sotedLocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sotedLocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSotedLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSotedLocationId(), "SOTED_LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOTED_LOCATION_ID: {bigint(19)}
     * @param sotedLocationIdList The collection of sotedLocationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedLocationId_InScope(Collection<Long> sotedLocationIdList) {
        doSetSotedLocationId_InScope(sotedLocationIdList);
    }

    protected void doSetSotedLocationId_InScope(Collection<Long> sotedLocationIdList) {
        regINS(CK_INS, cTL(sotedLocationIdList), xgetCValueSotedLocationId(), "SOTED_LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOTED_LOCATION_ID: {bigint(19)}
     * @param sotedLocationIdList The collection of sotedLocationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedLocationId_NotInScope(Collection<Long> sotedLocationIdList) {
        doSetSotedLocationId_NotInScope(sotedLocationIdList);
    }

    protected void doSetSotedLocationId_NotInScope(Collection<Long> sotedLocationIdList) {
        regINS(CK_NINS, cTL(sotedLocationIdList), xgetCValueSotedLocationId(), "SOTED_LOCATION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOTED_LOCATION_ID: {bigint(19)}
     */
    public void setSotedLocationId_IsNull() { regSotedLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOTED_LOCATION_ID: {bigint(19)}
     */
    public void setSotedLocationId_IsNotNull() { regSotedLocationId(CK_ISNN, DOBJ); }

    protected void regSotedLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSotedLocationId(), "SOTED_LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueSotedLocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     * @param sotedLocationCd The value of sotedLocationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedLocationCd_Equal(String sotedLocationCd) {
        doSetSotedLocationCd_Equal(fRES(sotedLocationCd));
    }

    protected void doSetSotedLocationCd_Equal(String sotedLocationCd) {
        regSotedLocationCd(CK_EQ, sotedLocationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     * @param sotedLocationCd The value of sotedLocationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedLocationCd_NotEqual(String sotedLocationCd) {
        doSetSotedLocationCd_NotEqual(fRES(sotedLocationCd));
    }

    protected void doSetSotedLocationCd_NotEqual(String sotedLocationCd) {
        regSotedLocationCd(CK_NES, sotedLocationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     * @param sotedLocationCd The value of sotedLocationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedLocationCd_GreaterThan(String sotedLocationCd) {
        regSotedLocationCd(CK_GT, fRES(sotedLocationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     * @param sotedLocationCd The value of sotedLocationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedLocationCd_LessThan(String sotedLocationCd) {
        regSotedLocationCd(CK_LT, fRES(sotedLocationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     * @param sotedLocationCd The value of sotedLocationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedLocationCd_GreaterEqual(String sotedLocationCd) {
        regSotedLocationCd(CK_GE, fRES(sotedLocationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     * @param sotedLocationCd The value of sotedLocationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedLocationCd_LessEqual(String sotedLocationCd) {
        regSotedLocationCd(CK_LE, fRES(sotedLocationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     * @param sotedLocationCdList The collection of sotedLocationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedLocationCd_InScope(Collection<String> sotedLocationCdList) {
        doSetSotedLocationCd_InScope(sotedLocationCdList);
    }

    protected void doSetSotedLocationCd_InScope(Collection<String> sotedLocationCdList) {
        regINS(CK_INS, cTL(sotedLocationCdList), xgetCValueSotedLocationCd(), "SOTED_LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     * @param sotedLocationCdList The collection of sotedLocationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedLocationCd_NotInScope(Collection<String> sotedLocationCdList) {
        doSetSotedLocationCd_NotInScope(sotedLocationCdList);
    }

    protected void doSetSotedLocationCd_NotInScope(Collection<String> sotedLocationCdList) {
        regINS(CK_NINS, cTL(sotedLocationCdList), xgetCValueSotedLocationCd(), "SOTED_LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTED_LOCATION_CD: {varchar(30)} <br>
     * <pre>e.g. setSotedLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sotedLocationCd The value of sotedLocationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSotedLocationCd_LikeSearch(String sotedLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sotedLocationCd), xgetCValueSotedLocationCd(), "SOTED_LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     * @param sotedLocationCd The value of sotedLocationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSotedLocationCd_NotLikeSearch(String sotedLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sotedLocationCd), xgetCValueSotedLocationCd(), "SOTED_LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     * @param sotedLocationCd The value of sotedLocationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedLocationCd_PrefixSearch(String sotedLocationCd) {
        setSotedLocationCd_LikeSearch(sotedLocationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     */
    public void setSotedLocationCd_IsNull() { regSotedLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     */
    public void setSotedLocationCd_IsNullOrEmpty() { regSotedLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOTED_LOCATION_CD: {varchar(30)}
     */
    public void setSotedLocationCd_IsNotNull() { regSotedLocationCd(CK_ISNN, DOBJ); }

    protected void regSotedLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSotedLocationCd(), "SOTED_LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueSotedLocationCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_ID: {bigint(19)}
     * @param allocLocationId The value of allocLocationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocLocationId_Equal(Long allocLocationId) {
        doSetAllocLocationId_Equal(allocLocationId);
    }

    protected void doSetAllocLocationId_Equal(Long allocLocationId) {
        regAllocLocationId(CK_EQ, allocLocationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_ID: {bigint(19)}
     * @param allocLocationId The value of allocLocationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocLocationId_NotEqual(Long allocLocationId) {
        doSetAllocLocationId_NotEqual(allocLocationId);
    }

    protected void doSetAllocLocationId_NotEqual(Long allocLocationId) {
        regAllocLocationId(CK_NES, allocLocationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_ID: {bigint(19)}
     * @param allocLocationId The value of allocLocationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocLocationId_GreaterThan(Long allocLocationId) {
        regAllocLocationId(CK_GT, allocLocationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_ID: {bigint(19)}
     * @param allocLocationId The value of allocLocationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocLocationId_LessThan(Long allocLocationId) {
        regAllocLocationId(CK_LT, allocLocationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_ID: {bigint(19)}
     * @param allocLocationId The value of allocLocationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocLocationId_GreaterEqual(Long allocLocationId) {
        regAllocLocationId(CK_GE, allocLocationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_ID: {bigint(19)}
     * @param allocLocationId The value of allocLocationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocLocationId_LessEqual(Long allocLocationId) {
        regAllocLocationId(CK_LE, allocLocationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_ID: {bigint(19)}
     * @param minNumber The min number of allocLocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocLocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocLocationId(), "ALLOC_LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_LOCATION_ID: {bigint(19)}
     * @param allocLocationIdList The collection of allocLocationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocLocationId_InScope(Collection<Long> allocLocationIdList) {
        doSetAllocLocationId_InScope(allocLocationIdList);
    }

    protected void doSetAllocLocationId_InScope(Collection<Long> allocLocationIdList) {
        regINS(CK_INS, cTL(allocLocationIdList), xgetCValueAllocLocationId(), "ALLOC_LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_LOCATION_ID: {bigint(19)}
     * @param allocLocationIdList The collection of allocLocationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocLocationId_NotInScope(Collection<Long> allocLocationIdList) {
        doSetAllocLocationId_NotInScope(allocLocationIdList);
    }

    protected void doSetAllocLocationId_NotInScope(Collection<Long> allocLocationIdList) {
        regINS(CK_NINS, cTL(allocLocationIdList), xgetCValueAllocLocationId(), "ALLOC_LOCATION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_ID: {bigint(19)}
     */
    public void setAllocLocationId_IsNull() { regAllocLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_ID: {bigint(19)}
     */
    public void setAllocLocationId_IsNotNull() { regAllocLocationId(CK_ISNN, DOBJ); }

    protected void regAllocLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocLocationId(), "ALLOC_LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueAllocLocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     * @param allocLocationCd The value of allocLocationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocLocationCd_Equal(String allocLocationCd) {
        doSetAllocLocationCd_Equal(fRES(allocLocationCd));
    }

    protected void doSetAllocLocationCd_Equal(String allocLocationCd) {
        regAllocLocationCd(CK_EQ, allocLocationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     * @param allocLocationCd The value of allocLocationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocLocationCd_NotEqual(String allocLocationCd) {
        doSetAllocLocationCd_NotEqual(fRES(allocLocationCd));
    }

    protected void doSetAllocLocationCd_NotEqual(String allocLocationCd) {
        regAllocLocationCd(CK_NES, allocLocationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     * @param allocLocationCd The value of allocLocationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocLocationCd_GreaterThan(String allocLocationCd) {
        regAllocLocationCd(CK_GT, fRES(allocLocationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     * @param allocLocationCd The value of allocLocationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocLocationCd_LessThan(String allocLocationCd) {
        regAllocLocationCd(CK_LT, fRES(allocLocationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     * @param allocLocationCd The value of allocLocationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocLocationCd_GreaterEqual(String allocLocationCd) {
        regAllocLocationCd(CK_GE, fRES(allocLocationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     * @param allocLocationCd The value of allocLocationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocLocationCd_LessEqual(String allocLocationCd) {
        regAllocLocationCd(CK_LE, fRES(allocLocationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     * @param allocLocationCdList The collection of allocLocationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocLocationCd_InScope(Collection<String> allocLocationCdList) {
        doSetAllocLocationCd_InScope(allocLocationCdList);
    }

    protected void doSetAllocLocationCd_InScope(Collection<String> allocLocationCdList) {
        regINS(CK_INS, cTL(allocLocationCdList), xgetCValueAllocLocationCd(), "ALLOC_LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     * @param allocLocationCdList The collection of allocLocationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocLocationCd_NotInScope(Collection<String> allocLocationCdList) {
        doSetAllocLocationCd_NotInScope(allocLocationCdList);
    }

    protected void doSetAllocLocationCd_NotInScope(Collection<String> allocLocationCdList) {
        regINS(CK_NINS, cTL(allocLocationCdList), xgetCValueAllocLocationCd(), "ALLOC_LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_LOCATION_CD: {varchar(30)} <br>
     * <pre>e.g. setAllocLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param allocLocationCd The value of allocLocationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAllocLocationCd_LikeSearch(String allocLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(allocLocationCd), xgetCValueAllocLocationCd(), "ALLOC_LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     * @param allocLocationCd The value of allocLocationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAllocLocationCd_NotLikeSearch(String allocLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(allocLocationCd), xgetCValueAllocLocationCd(), "ALLOC_LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     * @param allocLocationCd The value of allocLocationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocLocationCd_PrefixSearch(String allocLocationCd) {
        setAllocLocationCd_LikeSearch(allocLocationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     */
    public void setAllocLocationCd_IsNull() { regAllocLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     */
    public void setAllocLocationCd_IsNullOrEmpty() { regAllocLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_LOCATION_CD: {varchar(30)}
     */
    public void setAllocLocationCd_IsNotNull() { regAllocLocationCd(CK_ISNN, DOBJ); }

    protected void regAllocLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocLocationCd(), "ALLOC_LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueAllocLocationCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROOT_OUT_SEQ: {bigint(19)}
     * @param rootOutSeq The value of rootOutSeq as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRootOutSeq_Equal(Long rootOutSeq) {
        doSetRootOutSeq_Equal(rootOutSeq);
    }

    protected void doSetRootOutSeq_Equal(Long rootOutSeq) {
        regRootOutSeq(CK_EQ, rootOutSeq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROOT_OUT_SEQ: {bigint(19)}
     * @param rootOutSeq The value of rootOutSeq as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRootOutSeq_NotEqual(Long rootOutSeq) {
        doSetRootOutSeq_NotEqual(rootOutSeq);
    }

    protected void doSetRootOutSeq_NotEqual(Long rootOutSeq) {
        regRootOutSeq(CK_NES, rootOutSeq);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROOT_OUT_SEQ: {bigint(19)}
     * @param rootOutSeq The value of rootOutSeq as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRootOutSeq_GreaterThan(Long rootOutSeq) {
        regRootOutSeq(CK_GT, rootOutSeq);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROOT_OUT_SEQ: {bigint(19)}
     * @param rootOutSeq The value of rootOutSeq as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRootOutSeq_LessThan(Long rootOutSeq) {
        regRootOutSeq(CK_LT, rootOutSeq);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROOT_OUT_SEQ: {bigint(19)}
     * @param rootOutSeq The value of rootOutSeq as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRootOutSeq_GreaterEqual(Long rootOutSeq) {
        regRootOutSeq(CK_GE, rootOutSeq);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROOT_OUT_SEQ: {bigint(19)}
     * @param rootOutSeq The value of rootOutSeq as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRootOutSeq_LessEqual(Long rootOutSeq) {
        regRootOutSeq(CK_LE, rootOutSeq);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ROOT_OUT_SEQ: {bigint(19)}
     * @param minNumber The min number of rootOutSeq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rootOutSeq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRootOutSeq_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRootOutSeq(), "ROOT_OUT_SEQ", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROOT_OUT_SEQ: {bigint(19)}
     * @param rootOutSeqList The collection of rootOutSeq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRootOutSeq_InScope(Collection<Long> rootOutSeqList) {
        doSetRootOutSeq_InScope(rootOutSeqList);
    }

    protected void doSetRootOutSeq_InScope(Collection<Long> rootOutSeqList) {
        regINS(CK_INS, cTL(rootOutSeqList), xgetCValueRootOutSeq(), "ROOT_OUT_SEQ");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROOT_OUT_SEQ: {bigint(19)}
     * @param rootOutSeqList The collection of rootOutSeq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRootOutSeq_NotInScope(Collection<Long> rootOutSeqList) {
        doSetRootOutSeq_NotInScope(rootOutSeqList);
    }

    protected void doSetRootOutSeq_NotInScope(Collection<Long> rootOutSeqList) {
        regINS(CK_NINS, cTL(rootOutSeqList), xgetCValueRootOutSeq(), "ROOT_OUT_SEQ");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ROOT_OUT_SEQ: {bigint(19)}
     */
    public void setRootOutSeq_IsNull() { regRootOutSeq(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ROOT_OUT_SEQ: {bigint(19)}
     */
    public void setRootOutSeq_IsNotNull() { regRootOutSeq(CK_ISNN, DOBJ); }

    protected void regRootOutSeq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRootOutSeq(), "ROOT_OUT_SEQ"); }
    protected abstract ConditionValue xgetCValueRootOutSeq();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     * @param directionComment The value of directionComment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionComment_Equal(String directionComment) {
        doSetDirectionComment_Equal(fRES(directionComment));
    }

    protected void doSetDirectionComment_Equal(String directionComment) {
        regDirectionComment(CK_EQ, directionComment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     * @param directionComment The value of directionComment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionComment_NotEqual(String directionComment) {
        doSetDirectionComment_NotEqual(fRES(directionComment));
    }

    protected void doSetDirectionComment_NotEqual(String directionComment) {
        regDirectionComment(CK_NES, directionComment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     * @param directionComment The value of directionComment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionComment_GreaterThan(String directionComment) {
        regDirectionComment(CK_GT, fRES(directionComment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     * @param directionComment The value of directionComment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionComment_LessThan(String directionComment) {
        regDirectionComment(CK_LT, fRES(directionComment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     * @param directionComment The value of directionComment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionComment_GreaterEqual(String directionComment) {
        regDirectionComment(CK_GE, fRES(directionComment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     * @param directionComment The value of directionComment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionComment_LessEqual(String directionComment) {
        regDirectionComment(CK_LE, fRES(directionComment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     * @param directionCommentList The collection of directionComment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionComment_InScope(Collection<String> directionCommentList) {
        doSetDirectionComment_InScope(directionCommentList);
    }

    protected void doSetDirectionComment_InScope(Collection<String> directionCommentList) {
        regINS(CK_INS, cTL(directionCommentList), xgetCValueDirectionComment(), "DIRECTION_COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     * @param directionCommentList The collection of directionComment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionComment_NotInScope(Collection<String> directionCommentList) {
        doSetDirectionComment_NotInScope(directionCommentList);
    }

    protected void doSetDirectionComment_NotInScope(Collection<String> directionCommentList) {
        regINS(CK_NINS, cTL(directionCommentList), xgetCValueDirectionComment(), "DIRECTION_COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_COMMENT: {varchar(30)} <br>
     * <pre>e.g. setDirectionComment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directionComment The value of directionComment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectionComment_LikeSearch(String directionComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directionComment), xgetCValueDirectionComment(), "DIRECTION_COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     * @param directionComment The value of directionComment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectionComment_NotLikeSearch(String directionComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directionComment), xgetCValueDirectionComment(), "DIRECTION_COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     * @param directionComment The value of directionComment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionComment_PrefixSearch(String directionComment) {
        setDirectionComment_LikeSearch(directionComment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     */
    public void setDirectionComment_IsNull() { regDirectionComment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     */
    public void setDirectionComment_IsNullOrEmpty() { regDirectionComment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTION_COMMENT: {varchar(30)}
     */
    public void setDirectionComment_IsNotNull() { regDirectionComment(CK_ISNN, DOBJ); }

    protected void regDirectionComment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectionComment(), "DIRECTION_COMMENT"); }
    protected abstract ConditionValue xgetCValueDirectionComment();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY_CASE: {NotNull, bigint(19)}
     * @param qtyCase The value of qtyCase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtyCase_Equal(Long qtyCase) {
        doSetQtyCase_Equal(qtyCase);
    }

    protected void doSetQtyCase_Equal(Long qtyCase) {
        regQtyCase(CK_EQ, qtyCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY_CASE: {NotNull, bigint(19)}
     * @param qtyCase The value of qtyCase as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtyCase_NotEqual(Long qtyCase) {
        doSetQtyCase_NotEqual(qtyCase);
    }

    protected void doSetQtyCase_NotEqual(Long qtyCase) {
        regQtyCase(CK_NES, qtyCase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY_CASE: {NotNull, bigint(19)}
     * @param qtyCase The value of qtyCase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtyCase_GreaterThan(Long qtyCase) {
        regQtyCase(CK_GT, qtyCase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY_CASE: {NotNull, bigint(19)}
     * @param qtyCase The value of qtyCase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtyCase_LessThan(Long qtyCase) {
        regQtyCase(CK_LT, qtyCase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY_CASE: {NotNull, bigint(19)}
     * @param qtyCase The value of qtyCase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtyCase_GreaterEqual(Long qtyCase) {
        regQtyCase(CK_GE, qtyCase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY_CASE: {NotNull, bigint(19)}
     * @param qtyCase The value of qtyCase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtyCase_LessEqual(Long qtyCase) {
        regQtyCase(CK_LE, qtyCase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY_CASE: {NotNull, bigint(19)}
     * @param minNumber The min number of qtyCase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qtyCase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQtyCase_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQtyCase(), "QTY_CASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY_CASE: {NotNull, bigint(19)}
     * @param qtyCaseList The collection of qtyCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtyCase_InScope(Collection<Long> qtyCaseList) {
        doSetQtyCase_InScope(qtyCaseList);
    }

    protected void doSetQtyCase_InScope(Collection<Long> qtyCaseList) {
        regINS(CK_INS, cTL(qtyCaseList), xgetCValueQtyCase(), "QTY_CASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY_CASE: {NotNull, bigint(19)}
     * @param qtyCaseList The collection of qtyCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtyCase_NotInScope(Collection<Long> qtyCaseList) {
        doSetQtyCase_NotInScope(qtyCaseList);
    }

    protected void doSetQtyCase_NotInScope(Collection<Long> qtyCaseList) {
        regINS(CK_NINS, cTL(qtyCaseList), xgetCValueQtyCase(), "QTY_CASE");
    }

    protected void regQtyCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQtyCase(), "QTY_CASE"); }
    protected abstract ConditionValue xgetCValueQtyCase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY_BOWL: {NotNull, bigint(19)}
     * @param qtyBowl The value of qtyBowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtyBowl_Equal(Long qtyBowl) {
        doSetQtyBowl_Equal(qtyBowl);
    }

    protected void doSetQtyBowl_Equal(Long qtyBowl) {
        regQtyBowl(CK_EQ, qtyBowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY_BOWL: {NotNull, bigint(19)}
     * @param qtyBowl The value of qtyBowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtyBowl_NotEqual(Long qtyBowl) {
        doSetQtyBowl_NotEqual(qtyBowl);
    }

    protected void doSetQtyBowl_NotEqual(Long qtyBowl) {
        regQtyBowl(CK_NES, qtyBowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY_BOWL: {NotNull, bigint(19)}
     * @param qtyBowl The value of qtyBowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtyBowl_GreaterThan(Long qtyBowl) {
        regQtyBowl(CK_GT, qtyBowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY_BOWL: {NotNull, bigint(19)}
     * @param qtyBowl The value of qtyBowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtyBowl_LessThan(Long qtyBowl) {
        regQtyBowl(CK_LT, qtyBowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY_BOWL: {NotNull, bigint(19)}
     * @param qtyBowl The value of qtyBowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtyBowl_GreaterEqual(Long qtyBowl) {
        regQtyBowl(CK_GE, qtyBowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY_BOWL: {NotNull, bigint(19)}
     * @param qtyBowl The value of qtyBowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtyBowl_LessEqual(Long qtyBowl) {
        regQtyBowl(CK_LE, qtyBowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY_BOWL: {NotNull, bigint(19)}
     * @param minNumber The min number of qtyBowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qtyBowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQtyBowl_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQtyBowl(), "QTY_BOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY_BOWL: {NotNull, bigint(19)}
     * @param qtyBowlList The collection of qtyBowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtyBowl_InScope(Collection<Long> qtyBowlList) {
        doSetQtyBowl_InScope(qtyBowlList);
    }

    protected void doSetQtyBowl_InScope(Collection<Long> qtyBowlList) {
        regINS(CK_INS, cTL(qtyBowlList), xgetCValueQtyBowl(), "QTY_BOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY_BOWL: {NotNull, bigint(19)}
     * @param qtyBowlList The collection of qtyBowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtyBowl_NotInScope(Collection<Long> qtyBowlList) {
        doSetQtyBowl_NotInScope(qtyBowlList);
    }

    protected void doSetQtyBowl_NotInScope(Collection<Long> qtyBowlList) {
        regINS(CK_NINS, cTL(qtyBowlList), xgetCValueQtyBowl(), "QTY_BOWL");
    }

    protected void regQtyBowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQtyBowl(), "QTY_BOWL"); }
    protected abstract ConditionValue xgetCValueQtyBowl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qty The value of qty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_Equal(Long qty) {
        doSetQty_Equal(qty);
    }

    protected void doSetQty_Equal(Long qty) {
        regQty(CK_EQ, qty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qty The value of qty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_NotEqual(Long qty) {
        doSetQty_NotEqual(qty);
    }

    protected void doSetQty_NotEqual(Long qty) {
        regQty(CK_NES, qty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qty The value of qty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_GreaterThan(Long qty) {
        regQty(CK_GT, qty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qty The value of qty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_LessThan(Long qty) {
        regQty(CK_LT, qty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qty The value of qty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_GreaterEqual(Long qty) {
        regQty(CK_GE, qty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qty The value of qty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_LessEqual(Long qty) {
        regQty(CK_LE, qty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param minNumber The min number of qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty(), "QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qtyList The collection of qty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_InScope(Collection<Long> qtyList) {
        doSetQty_InScope(qtyList);
    }

    protected void doSetQty_InScope(Collection<Long> qtyList) {
        regINS(CK_INS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qtyList The collection of qty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_NotInScope(Collection<Long> qtyList) {
        doSetQty_NotInScope(qtyList);
    }

    protected void doSetQty_NotInScope(Collection<Long> qtyList) {
        regINS(CK_NINS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    protected void regQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty(), "QTY"); }
    protected abstract ConditionValue xgetCValueQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY_CASE: {NotNull, bigint(19)}
     * @param htQtyCase The value of htQtyCase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQtyCase_Equal(Long htQtyCase) {
        doSetHtQtyCase_Equal(htQtyCase);
    }

    protected void doSetHtQtyCase_Equal(Long htQtyCase) {
        regHtQtyCase(CK_EQ, htQtyCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY_CASE: {NotNull, bigint(19)}
     * @param htQtyCase The value of htQtyCase as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQtyCase_NotEqual(Long htQtyCase) {
        doSetHtQtyCase_NotEqual(htQtyCase);
    }

    protected void doSetHtQtyCase_NotEqual(Long htQtyCase) {
        regHtQtyCase(CK_NES, htQtyCase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY_CASE: {NotNull, bigint(19)}
     * @param htQtyCase The value of htQtyCase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQtyCase_GreaterThan(Long htQtyCase) {
        regHtQtyCase(CK_GT, htQtyCase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY_CASE: {NotNull, bigint(19)}
     * @param htQtyCase The value of htQtyCase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQtyCase_LessThan(Long htQtyCase) {
        regHtQtyCase(CK_LT, htQtyCase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY_CASE: {NotNull, bigint(19)}
     * @param htQtyCase The value of htQtyCase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQtyCase_GreaterEqual(Long htQtyCase) {
        regHtQtyCase(CK_GE, htQtyCase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY_CASE: {NotNull, bigint(19)}
     * @param htQtyCase The value of htQtyCase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQtyCase_LessEqual(Long htQtyCase) {
        regHtQtyCase(CK_LE, htQtyCase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY_CASE: {NotNull, bigint(19)}
     * @param minNumber The min number of htQtyCase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of htQtyCase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHtQtyCase_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHtQtyCase(), "HT_QTY_CASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HT_QTY_CASE: {NotNull, bigint(19)}
     * @param htQtyCaseList The collection of htQtyCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtQtyCase_InScope(Collection<Long> htQtyCaseList) {
        doSetHtQtyCase_InScope(htQtyCaseList);
    }

    protected void doSetHtQtyCase_InScope(Collection<Long> htQtyCaseList) {
        regINS(CK_INS, cTL(htQtyCaseList), xgetCValueHtQtyCase(), "HT_QTY_CASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HT_QTY_CASE: {NotNull, bigint(19)}
     * @param htQtyCaseList The collection of htQtyCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtQtyCase_NotInScope(Collection<Long> htQtyCaseList) {
        doSetHtQtyCase_NotInScope(htQtyCaseList);
    }

    protected void doSetHtQtyCase_NotInScope(Collection<Long> htQtyCaseList) {
        regINS(CK_NINS, cTL(htQtyCaseList), xgetCValueHtQtyCase(), "HT_QTY_CASE");
    }

    protected void regHtQtyCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHtQtyCase(), "HT_QTY_CASE"); }
    protected abstract ConditionValue xgetCValueHtQtyCase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY_BOWL: {NotNull, bigint(19)}
     * @param htQtyBowl The value of htQtyBowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQtyBowl_Equal(Long htQtyBowl) {
        doSetHtQtyBowl_Equal(htQtyBowl);
    }

    protected void doSetHtQtyBowl_Equal(Long htQtyBowl) {
        regHtQtyBowl(CK_EQ, htQtyBowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY_BOWL: {NotNull, bigint(19)}
     * @param htQtyBowl The value of htQtyBowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQtyBowl_NotEqual(Long htQtyBowl) {
        doSetHtQtyBowl_NotEqual(htQtyBowl);
    }

    protected void doSetHtQtyBowl_NotEqual(Long htQtyBowl) {
        regHtQtyBowl(CK_NES, htQtyBowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY_BOWL: {NotNull, bigint(19)}
     * @param htQtyBowl The value of htQtyBowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQtyBowl_GreaterThan(Long htQtyBowl) {
        regHtQtyBowl(CK_GT, htQtyBowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY_BOWL: {NotNull, bigint(19)}
     * @param htQtyBowl The value of htQtyBowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQtyBowl_LessThan(Long htQtyBowl) {
        regHtQtyBowl(CK_LT, htQtyBowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY_BOWL: {NotNull, bigint(19)}
     * @param htQtyBowl The value of htQtyBowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQtyBowl_GreaterEqual(Long htQtyBowl) {
        regHtQtyBowl(CK_GE, htQtyBowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY_BOWL: {NotNull, bigint(19)}
     * @param htQtyBowl The value of htQtyBowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQtyBowl_LessEqual(Long htQtyBowl) {
        regHtQtyBowl(CK_LE, htQtyBowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY_BOWL: {NotNull, bigint(19)}
     * @param minNumber The min number of htQtyBowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of htQtyBowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHtQtyBowl_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHtQtyBowl(), "HT_QTY_BOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HT_QTY_BOWL: {NotNull, bigint(19)}
     * @param htQtyBowlList The collection of htQtyBowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtQtyBowl_InScope(Collection<Long> htQtyBowlList) {
        doSetHtQtyBowl_InScope(htQtyBowlList);
    }

    protected void doSetHtQtyBowl_InScope(Collection<Long> htQtyBowlList) {
        regINS(CK_INS, cTL(htQtyBowlList), xgetCValueHtQtyBowl(), "HT_QTY_BOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HT_QTY_BOWL: {NotNull, bigint(19)}
     * @param htQtyBowlList The collection of htQtyBowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtQtyBowl_NotInScope(Collection<Long> htQtyBowlList) {
        doSetHtQtyBowl_NotInScope(htQtyBowlList);
    }

    protected void doSetHtQtyBowl_NotInScope(Collection<Long> htQtyBowlList) {
        regINS(CK_NINS, cTL(htQtyBowlList), xgetCValueHtQtyBowl(), "HT_QTY_BOWL");
    }

    protected void regHtQtyBowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHtQtyBowl(), "HT_QTY_BOWL"); }
    protected abstract ConditionValue xgetCValueHtQtyBowl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY: {NotNull, bigint(19)}
     * @param htQty The value of htQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQty_Equal(Long htQty) {
        doSetHtQty_Equal(htQty);
    }

    protected void doSetHtQty_Equal(Long htQty) {
        regHtQty(CK_EQ, htQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY: {NotNull, bigint(19)}
     * @param htQty The value of htQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQty_NotEqual(Long htQty) {
        doSetHtQty_NotEqual(htQty);
    }

    protected void doSetHtQty_NotEqual(Long htQty) {
        regHtQty(CK_NES, htQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY: {NotNull, bigint(19)}
     * @param htQty The value of htQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQty_GreaterThan(Long htQty) {
        regHtQty(CK_GT, htQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY: {NotNull, bigint(19)}
     * @param htQty The value of htQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQty_LessThan(Long htQty) {
        regHtQty(CK_LT, htQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY: {NotNull, bigint(19)}
     * @param htQty The value of htQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQty_GreaterEqual(Long htQty) {
        regHtQty(CK_GE, htQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY: {NotNull, bigint(19)}
     * @param htQty The value of htQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtQty_LessEqual(Long htQty) {
        regHtQty(CK_LE, htQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HT_QTY: {NotNull, bigint(19)}
     * @param minNumber The min number of htQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of htQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHtQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHtQty(), "HT_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HT_QTY: {NotNull, bigint(19)}
     * @param htQtyList The collection of htQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtQty_InScope(Collection<Long> htQtyList) {
        doSetHtQty_InScope(htQtyList);
    }

    protected void doSetHtQty_InScope(Collection<Long> htQtyList) {
        regINS(CK_INS, cTL(htQtyList), xgetCValueHtQty(), "HT_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HT_QTY: {NotNull, bigint(19)}
     * @param htQtyList The collection of htQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtQty_NotInScope(Collection<Long> htQtyList) {
        doSetHtQty_NotInScope(htQtyList);
    }

    protected void doSetHtQty_NotInScope(Collection<Long> htQtyList) {
        regINS(CK_NINS, cTL(htQtyList), xgetCValueHtQty(), "HT_QTY");
    }

    protected void regHtQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHtQty(), "HT_QTY"); }
    protected abstract ConditionValue xgetCValueHtQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPLETE_STS: {varchar(30)}
     * @param completeSts The value of completeSts as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteSts_Equal(String completeSts) {
        doSetCompleteSts_Equal(fRES(completeSts));
    }

    protected void doSetCompleteSts_Equal(String completeSts) {
        regCompleteSts(CK_EQ, completeSts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPLETE_STS: {varchar(30)}
     * @param completeSts The value of completeSts as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteSts_NotEqual(String completeSts) {
        doSetCompleteSts_NotEqual(fRES(completeSts));
    }

    protected void doSetCompleteSts_NotEqual(String completeSts) {
        regCompleteSts(CK_NES, completeSts);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPLETE_STS: {varchar(30)}
     * @param completeSts The value of completeSts as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteSts_GreaterThan(String completeSts) {
        regCompleteSts(CK_GT, fRES(completeSts));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPLETE_STS: {varchar(30)}
     * @param completeSts The value of completeSts as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteSts_LessThan(String completeSts) {
        regCompleteSts(CK_LT, fRES(completeSts));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPLETE_STS: {varchar(30)}
     * @param completeSts The value of completeSts as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteSts_GreaterEqual(String completeSts) {
        regCompleteSts(CK_GE, fRES(completeSts));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPLETE_STS: {varchar(30)}
     * @param completeSts The value of completeSts as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteSts_LessEqual(String completeSts) {
        regCompleteSts(CK_LE, fRES(completeSts));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPLETE_STS: {varchar(30)}
     * @param completeStsList The collection of completeSts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteSts_InScope(Collection<String> completeStsList) {
        doSetCompleteSts_InScope(completeStsList);
    }

    protected void doSetCompleteSts_InScope(Collection<String> completeStsList) {
        regINS(CK_INS, cTL(completeStsList), xgetCValueCompleteSts(), "COMPLETE_STS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPLETE_STS: {varchar(30)}
     * @param completeStsList The collection of completeSts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteSts_NotInScope(Collection<String> completeStsList) {
        doSetCompleteSts_NotInScope(completeStsList);
    }

    protected void doSetCompleteSts_NotInScope(Collection<String> completeStsList) {
        regINS(CK_NINS, cTL(completeStsList), xgetCValueCompleteSts(), "COMPLETE_STS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPLETE_STS: {varchar(30)} <br>
     * <pre>e.g. setCompleteSts_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param completeSts The value of completeSts as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompleteSts_LikeSearch(String completeSts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(completeSts), xgetCValueCompleteSts(), "COMPLETE_STS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPLETE_STS: {varchar(30)}
     * @param completeSts The value of completeSts as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompleteSts_NotLikeSearch(String completeSts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(completeSts), xgetCValueCompleteSts(), "COMPLETE_STS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPLETE_STS: {varchar(30)}
     * @param completeSts The value of completeSts as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteSts_PrefixSearch(String completeSts) {
        setCompleteSts_LikeSearch(completeSts, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPLETE_STS: {varchar(30)}
     */
    public void setCompleteSts_IsNull() { regCompleteSts(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPLETE_STS: {varchar(30)}
     */
    public void setCompleteSts_IsNullOrEmpty() { regCompleteSts(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPLETE_STS: {varchar(30)}
     */
    public void setCompleteSts_IsNotNull() { regCompleteSts(CK_ISNN, DOBJ); }

    protected void regCompleteSts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompleteSts(), "COMPLETE_STS"); }
    protected abstract ConditionValue xgetCValueCompleteSts();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * START_TIME: {datetime2(26, 6)}
     * @param startTime The value of startTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_Equal(java.sql.Timestamp startTime) {
        regStartTime(CK_EQ,  startTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * START_TIME: {datetime2(26, 6)}
     * @param startTime The value of startTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_GreaterThan(java.sql.Timestamp startTime) {
        regStartTime(CK_GT,  startTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * START_TIME: {datetime2(26, 6)}
     * @param startTime The value of startTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_LessThan(java.sql.Timestamp startTime) {
        regStartTime(CK_LT,  startTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * START_TIME: {datetime2(26, 6)}
     * @param startTime The value of startTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_GreaterEqual(java.sql.Timestamp startTime) {
        regStartTime(CK_GE,  startTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * START_TIME: {datetime2(26, 6)}
     * @param startTime The value of startTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_LessEqual(java.sql.Timestamp startTime) {
        regStartTime(CK_LE, startTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * START_TIME: {datetime2(26, 6)}
     * <pre>e.g. setStartTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of startTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of startTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setStartTime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueStartTime(), "START_TIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * START_TIME: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of startTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of startTime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setStartTime_DateFromTo(Date fromDate, Date toDate) {
        setStartTime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * START_TIME: {datetime2(26, 6)}
     */
    public void setStartTime_IsNull() { regStartTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * START_TIME: {datetime2(26, 6)}
     */
    public void setStartTime_IsNotNull() { regStartTime(CK_ISNN, DOBJ); }

    protected void regStartTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStartTime(), "START_TIME"); }
    protected abstract ConditionValue xgetCValueStartTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_TIME: {datetime2(26, 6)}
     * @param endTime The value of endTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_Equal(java.sql.Timestamp endTime) {
        regEndTime(CK_EQ,  endTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * END_TIME: {datetime2(26, 6)}
     * @param endTime The value of endTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_GreaterThan(java.sql.Timestamp endTime) {
        regEndTime(CK_GT,  endTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * END_TIME: {datetime2(26, 6)}
     * @param endTime The value of endTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_LessThan(java.sql.Timestamp endTime) {
        regEndTime(CK_LT,  endTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_TIME: {datetime2(26, 6)}
     * @param endTime The value of endTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_GreaterEqual(java.sql.Timestamp endTime) {
        regEndTime(CK_GE,  endTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_TIME: {datetime2(26, 6)}
     * @param endTime The value of endTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_LessEqual(java.sql.Timestamp endTime) {
        regEndTime(CK_LE, endTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * END_TIME: {datetime2(26, 6)}
     * <pre>e.g. setEndTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setEndTime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueEndTime(), "END_TIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * END_TIME: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of endTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of endTime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setEndTime_DateFromTo(Date fromDate, Date toDate) {
        setEndTime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * END_TIME: {datetime2(26, 6)}
     */
    public void setEndTime_IsNull() { regEndTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * END_TIME: {datetime2(26, 6)}
     */
    public void setEndTime_IsNotNull() { regEndTime(CK_ISNN, DOBJ); }

    protected void regEndTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEndTime(), "END_TIME"); }
    protected abstract ConditionValue xgetCValueEndTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {varchar(30)}
     * @param userCd The value of userCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_Equal(String userCd) {
        doSetUserCd_Equal(fRES(userCd));
    }

    protected void doSetUserCd_Equal(String userCd) {
        regUserCd(CK_EQ, userCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {varchar(30)}
     * @param userCd The value of userCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_NotEqual(String userCd) {
        doSetUserCd_NotEqual(fRES(userCd));
    }

    protected void doSetUserCd_NotEqual(String userCd) {
        regUserCd(CK_NES, userCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {varchar(30)}
     * @param userCd The value of userCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_GreaterThan(String userCd) {
        regUserCd(CK_GT, fRES(userCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {varchar(30)}
     * @param userCd The value of userCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_LessThan(String userCd) {
        regUserCd(CK_LT, fRES(userCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {varchar(30)}
     * @param userCd The value of userCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_GreaterEqual(String userCd) {
        regUserCd(CK_GE, fRES(userCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {varchar(30)}
     * @param userCd The value of userCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_LessEqual(String userCd) {
        regUserCd(CK_LE, fRES(userCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_CD: {varchar(30)}
     * @param userCdList The collection of userCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_InScope(Collection<String> userCdList) {
        doSetUserCd_InScope(userCdList);
    }

    protected void doSetUserCd_InScope(Collection<String> userCdList) {
        regINS(CK_INS, cTL(userCdList), xgetCValueUserCd(), "USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_CD: {varchar(30)}
     * @param userCdList The collection of userCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_NotInScope(Collection<String> userCdList) {
        doSetUserCd_NotInScope(userCdList);
    }

    protected void doSetUserCd_NotInScope(Collection<String> userCdList) {
        regINS(CK_NINS, cTL(userCdList), xgetCValueUserCd(), "USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {varchar(30)} <br>
     * <pre>e.g. setUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userCd The value of userCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserCd_LikeSearch(String userCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userCd), xgetCValueUserCd(), "USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {varchar(30)}
     * @param userCd The value of userCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserCd_NotLikeSearch(String userCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userCd), xgetCValueUserCd(), "USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {varchar(30)}
     * @param userCd The value of userCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_PrefixSearch(String userCd) {
        setUserCd_LikeSearch(userCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_CD: {varchar(30)}
     */
    public void setUserCd_IsNull() { regUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USER_CD: {varchar(30)}
     */
    public void setUserCd_IsNullOrEmpty() { regUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_CD: {varchar(30)}
     */
    public void setUserCd_IsNotNull() { regUserCd(CK_ISNN, DOBJ); }

    protected void regUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserCd(), "USER_CD"); }
    protected abstract ConditionValue xgetCValueUserCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_Equal(String suppliercd) {
        doSetSuppliercd_Equal(fRES(suppliercd));
    }

    protected void doSetSuppliercd_Equal(String suppliercd) {
        regSuppliercd(CK_EQ, suppliercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_NotEqual(String suppliercd) {
        doSetSuppliercd_NotEqual(fRES(suppliercd));
    }

    protected void doSetSuppliercd_NotEqual(String suppliercd) {
        regSuppliercd(CK_NES, suppliercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_GreaterThan(String suppliercd) {
        regSuppliercd(CK_GT, fRES(suppliercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_LessThan(String suppliercd) {
        regSuppliercd(CK_LT, fRES(suppliercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_GreaterEqual(String suppliercd) {
        regSuppliercd(CK_GE, fRES(suppliercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_LessEqual(String suppliercd) {
        regSuppliercd(CK_LE, fRES(suppliercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercdList The collection of suppliercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_InScope(Collection<String> suppliercdList) {
        doSetSuppliercd_InScope(suppliercdList);
    }

    protected void doSetSuppliercd_InScope(Collection<String> suppliercdList) {
        regINS(CK_INS, cTL(suppliercdList), xgetCValueSuppliercd(), "SUPPLIERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercdList The collection of suppliercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_NotInScope(Collection<String> suppliercdList) {
        doSetSuppliercd_NotInScope(suppliercdList);
    }

    protected void doSetSuppliercd_NotInScope(Collection<String> suppliercdList) {
        regINS(CK_NINS, cTL(suppliercdList), xgetCValueSuppliercd(), "SUPPLIERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)} <br>
     * <pre>e.g. setSuppliercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param suppliercd The value of suppliercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSuppliercd_LikeSearch(String suppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(suppliercd), xgetCValueSuppliercd(), "SUPPLIERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSuppliercd_NotLikeSearch(String suppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(suppliercd), xgetCValueSuppliercd(), "SUPPLIERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_PrefixSearch(String suppliercd) {
        setSuppliercd_LikeSearch(suppliercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNull() { regSuppliercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNullOrEmpty() { regSuppliercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNotNull() { regSuppliercd(CK_ISNN, DOBJ); }

    protected void regSuppliercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuppliercd(), "SUPPLIERCD"); }
    protected abstract ConditionValue xgetCValueSuppliercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_Equal(String schdate) {
        doSetSchdate_Equal(fRES(schdate));
    }

    protected void doSetSchdate_Equal(String schdate) {
        regSchdate(CK_EQ, schdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_NotEqual(String schdate) {
        doSetSchdate_NotEqual(fRES(schdate));
    }

    protected void doSetSchdate_NotEqual(String schdate) {
        regSchdate(CK_NES, schdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_GreaterThan(String schdate) {
        regSchdate(CK_GT, fRES(schdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_LessThan(String schdate) {
        regSchdate(CK_LT, fRES(schdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_GreaterEqual(String schdate) {
        regSchdate(CK_GE, fRES(schdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_LessEqual(String schdate) {
        regSchdate(CK_LE, fRES(schdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdateList The collection of schdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_InScope(Collection<String> schdateList) {
        doSetSchdate_InScope(schdateList);
    }

    protected void doSetSchdate_InScope(Collection<String> schdateList) {
        regINS(CK_INS, cTL(schdateList), xgetCValueSchdate(), "SCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdateList The collection of schdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_NotInScope(Collection<String> schdateList) {
        doSetSchdate_NotInScope(schdateList);
    }

    protected void doSetSchdate_NotInScope(Collection<String> schdateList) {
        regINS(CK_NINS, cTL(schdateList), xgetCValueSchdate(), "SCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHDATE: {varchar(8)} <br>
     * <pre>e.g. setSchdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param schdate The value of schdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSchdate_LikeSearch(String schdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(schdate), xgetCValueSchdate(), "SCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSchdate_NotLikeSearch(String schdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(schdate), xgetCValueSchdate(), "SCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_PrefixSearch(String schdate) {
        setSchdate_LikeSearch(schdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     */
    public void setSchdate_IsNull() { regSchdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     */
    public void setSchdate_IsNullOrEmpty() { regSchdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     */
    public void setSchdate_IsNotNull() { regSchdate(CK_ISNN, DOBJ); }

    protected void regSchdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchdate(), "SCHDATE"); }
    protected abstract ConditionValue xgetCValueSchdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_NUMBER: {bigint(19)}
     * @param caseOutNumber The value of caseOutNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutNumber_Equal(Long caseOutNumber) {
        doSetCaseOutNumber_Equal(caseOutNumber);
    }

    protected void doSetCaseOutNumber_Equal(Long caseOutNumber) {
        regCaseOutNumber(CK_EQ, caseOutNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_NUMBER: {bigint(19)}
     * @param caseOutNumber The value of caseOutNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutNumber_NotEqual(Long caseOutNumber) {
        doSetCaseOutNumber_NotEqual(caseOutNumber);
    }

    protected void doSetCaseOutNumber_NotEqual(Long caseOutNumber) {
        regCaseOutNumber(CK_NES, caseOutNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_NUMBER: {bigint(19)}
     * @param caseOutNumber The value of caseOutNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutNumber_GreaterThan(Long caseOutNumber) {
        regCaseOutNumber(CK_GT, caseOutNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_NUMBER: {bigint(19)}
     * @param caseOutNumber The value of caseOutNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutNumber_LessThan(Long caseOutNumber) {
        regCaseOutNumber(CK_LT, caseOutNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_NUMBER: {bigint(19)}
     * @param caseOutNumber The value of caseOutNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutNumber_GreaterEqual(Long caseOutNumber) {
        regCaseOutNumber(CK_GE, caseOutNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_NUMBER: {bigint(19)}
     * @param caseOutNumber The value of caseOutNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutNumber_LessEqual(Long caseOutNumber) {
        regCaseOutNumber(CK_LE, caseOutNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_NUMBER: {bigint(19)}
     * @param minNumber The min number of caseOutNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseOutNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseOutNumber_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseOutNumber(), "CASE_OUT_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASE_OUT_NUMBER: {bigint(19)}
     * @param caseOutNumberList The collection of caseOutNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutNumber_InScope(Collection<Long> caseOutNumberList) {
        doSetCaseOutNumber_InScope(caseOutNumberList);
    }

    protected void doSetCaseOutNumber_InScope(Collection<Long> caseOutNumberList) {
        regINS(CK_INS, cTL(caseOutNumberList), xgetCValueCaseOutNumber(), "CASE_OUT_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASE_OUT_NUMBER: {bigint(19)}
     * @param caseOutNumberList The collection of caseOutNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutNumber_NotInScope(Collection<Long> caseOutNumberList) {
        doSetCaseOutNumber_NotInScope(caseOutNumberList);
    }

    protected void doSetCaseOutNumber_NotInScope(Collection<Long> caseOutNumberList) {
        regINS(CK_NINS, cTL(caseOutNumberList), xgetCValueCaseOutNumber(), "CASE_OUT_NUMBER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_OUT_NUMBER: {bigint(19)}
     */
    public void setCaseOutNumber_IsNull() { regCaseOutNumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_OUT_NUMBER: {bigint(19)}
     */
    public void setCaseOutNumber_IsNotNull() { regCaseOutNumber(CK_ISNN, DOBJ); }

    protected void regCaseOutNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseOutNumber(), "CASE_OUT_NUMBER"); }
    protected abstract ConditionValue xgetCValueCaseOutNumber();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, bigint(19)}
     * @param centerId The value of centerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_Equal(Long centerId) {
        doSetCenterId_Equal(centerId);
    }

    protected void doSetCenterId_Equal(Long centerId) {
        regCenterId(CK_EQ, centerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, bigint(19)}
     * @param centerId The value of centerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_NotEqual(Long centerId) {
        doSetCenterId_NotEqual(centerId);
    }

    protected void doSetCenterId_NotEqual(Long centerId) {
        regCenterId(CK_NES, centerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {IX, bigint(19)}
     * @param centerIdList The collection of centerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_InScope(Collection<Long> centerIdList) {
        doSetCenterId_InScope(centerIdList);
    }

    protected void doSetCenterId_InScope(Collection<Long> centerIdList) {
        regINS(CK_INS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {IX, bigint(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, bigint(19)}
     */
    public void setCenterId_IsNull() { regCenterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, bigint(19)}
     */
    public void setCenterId_IsNotNull() { regCenterId(CK_ISNN, DOBJ); }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_Equal(Long clientId) {
        doSetClientId_Equal(clientId);
    }

    protected void doSetClientId_Equal(Long clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(Long clientId) {
        doSetClientId_NotEqual(clientId);
    }

    protected void doSetClientId_NotEqual(Long clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<Long> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<Long> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     */
    public void setClientId_IsNull() { regClientId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     */
    public void setClientId_IsNotNull() { regClientId(CK_ISNN, DOBJ); }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_Equal(String lineBlock) {
        doSetLineBlock_Equal(fRES(lineBlock));
    }

    protected void doSetLineBlock_Equal(String lineBlock) {
        regLineBlock(CK_EQ, lineBlock);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_NotEqual(String lineBlock) {
        doSetLineBlock_NotEqual(fRES(lineBlock));
    }

    protected void doSetLineBlock_NotEqual(String lineBlock) {
        regLineBlock(CK_NES, lineBlock);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_GreaterThan(String lineBlock) {
        regLineBlock(CK_GT, fRES(lineBlock));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_LessThan(String lineBlock) {
        regLineBlock(CK_LT, fRES(lineBlock));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_GreaterEqual(String lineBlock) {
        regLineBlock(CK_GE, fRES(lineBlock));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_LessEqual(String lineBlock) {
        regLineBlock(CK_LE, fRES(lineBlock));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlockList The collection of lineBlock as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_InScope(Collection<String> lineBlockList) {
        doSetLineBlock_InScope(lineBlockList);
    }

    protected void doSetLineBlock_InScope(Collection<String> lineBlockList) {
        regINS(CK_INS, cTL(lineBlockList), xgetCValueLineBlock(), "LINE_BLOCK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlockList The collection of lineBlock as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_NotInScope(Collection<String> lineBlockList) {
        doSetLineBlock_NotInScope(lineBlockList);
    }

    protected void doSetLineBlock_NotInScope(Collection<String> lineBlockList) {
        regINS(CK_NINS, cTL(lineBlockList), xgetCValueLineBlock(), "LINE_BLOCK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)} <br>
     * <pre>e.g. setLineBlock_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineBlock The value of lineBlock as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineBlock_LikeSearch(String lineBlock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineBlock), xgetCValueLineBlock(), "LINE_BLOCK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineBlock_NotLikeSearch(String lineBlock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineBlock), xgetCValueLineBlock(), "LINE_BLOCK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     * @param lineBlock The value of lineBlock as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_PrefixSearch(String lineBlock) {
        setLineBlock_LikeSearch(lineBlock, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     */
    public void setLineBlock_IsNull() { regLineBlock(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     */
    public void setLineBlock_IsNullOrEmpty() { regLineBlock(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(30)}
     */
    public void setLineBlock_IsNotNull() { regLineBlock(CK_ISNN, DOBJ); }

    protected void regLineBlock(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineBlock(), "LINE_BLOCK"); }
    protected abstract ConditionValue xgetCValueLineBlock();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_Equal(String sortingRackNo) {
        doSetSortingRackNo_Equal(fRES(sortingRackNo));
    }

    protected void doSetSortingRackNo_Equal(String sortingRackNo) {
        regSortingRackNo(CK_EQ, sortingRackNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_NotEqual(String sortingRackNo) {
        doSetSortingRackNo_NotEqual(fRES(sortingRackNo));
    }

    protected void doSetSortingRackNo_NotEqual(String sortingRackNo) {
        regSortingRackNo(CK_NES, sortingRackNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_GreaterThan(String sortingRackNo) {
        regSortingRackNo(CK_GT, fRES(sortingRackNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_LessThan(String sortingRackNo) {
        regSortingRackNo(CK_LT, fRES(sortingRackNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_GreaterEqual(String sortingRackNo) {
        regSortingRackNo(CK_GE, fRES(sortingRackNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_LessEqual(String sortingRackNo) {
        regSortingRackNo(CK_LE, fRES(sortingRackNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNoList The collection of sortingRackNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_InScope(Collection<String> sortingRackNoList) {
        doSetSortingRackNo_InScope(sortingRackNoList);
    }

    protected void doSetSortingRackNo_InScope(Collection<String> sortingRackNoList) {
        regINS(CK_INS, cTL(sortingRackNoList), xgetCValueSortingRackNo(), "SORTING_RACK_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNoList The collection of sortingRackNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_NotInScope(Collection<String> sortingRackNoList) {
        doSetSortingRackNo_NotInScope(sortingRackNoList);
    }

    protected void doSetSortingRackNo_NotInScope(Collection<String> sortingRackNoList) {
        regINS(CK_NINS, cTL(sortingRackNoList), xgetCValueSortingRackNo(), "SORTING_RACK_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)} <br>
     * <pre>e.g. setSortingRackNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortingRackNo The value of sortingRackNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortingRackNo_LikeSearch(String sortingRackNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortingRackNo), xgetCValueSortingRackNo(), "SORTING_RACK_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortingRackNo_NotLikeSearch(String sortingRackNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortingRackNo), xgetCValueSortingRackNo(), "SORTING_RACK_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @param sortingRackNo The value of sortingRackNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingRackNo_PrefixSearch(String sortingRackNo) {
        setSortingRackNo_LikeSearch(sortingRackNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     */
    public void setSortingRackNo_IsNull() { regSortingRackNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     */
    public void setSortingRackNo_IsNullOrEmpty() { regSortingRackNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORTING_RACK_NO: {varchar(30)}
     */
    public void setSortingRackNo_IsNotNull() { regSortingRackNo(CK_ISNN, DOBJ); }

    protected void regSortingRackNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortingRackNo(), "SORTING_RACK_NO"); }
    protected abstract ConditionValue xgetCValueSortingRackNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_Equal_AsDelFlg(CDef.DelFlg cdef) {
        doSetDelFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未削除
     */
    public void setDelFlg_Equal_$0() {
        setDelFlg_Equal_AsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 削除済
     */
    public void setDelFlg_Equal_$1() {
        setDelFlg_Equal_AsDelFlg(CDef.DelFlg.$1);
    }

    protected void doSetDelFlg_Equal(String delFlg) {
        regDelFlg(CK_EQ, delFlg);
    }

    protected void regDelFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlg(), "DEL_FLG"); }
    protected abstract ConditionValue xgetCValueDelFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     * @param controlNo The value of controlNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setControlNo_Equal(Long controlNo) {
        doSetControlNo_Equal(controlNo);
    }

    protected void doSetControlNo_Equal(Long controlNo) {
        regControlNo(CK_EQ, controlNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     * @param controlNo The value of controlNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setControlNo_NotEqual(Long controlNo) {
        doSetControlNo_NotEqual(controlNo);
    }

    protected void doSetControlNo_NotEqual(Long controlNo) {
        regControlNo(CK_NES, controlNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     * @param minNumber The min number of controlNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of controlNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setControlNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueControlNo(), "CONTROL_NO", rangeOfOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     */
    public void setControlNo_IsNull() { regControlNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     */
    public void setControlNo_IsNotNull() { regControlNo(CK_ISNN, DOBJ); }

    protected void regControlNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueControlNo(), "CONTROL_NO"); }
    protected abstract ConditionValue xgetCValueControlNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @param addDt The value of addDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddDt_Equal(java.sql.Timestamp addDt) {
        regAddDt(CK_EQ,  addDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @param addDt The value of addDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddDt_LessEqual(java.sql.Timestamp addDt) {
        regAddDt(CK_LE, addDt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_DT: {datetime2(26, 6)}
     */
    public void setAddDt_IsNull() { regAddDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_DT: {datetime2(26, 6)}
     */
    public void setAddDt_IsNotNull() { regAddDt(CK_ISNN, DOBJ); }

    protected void regAddDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddDt(), "ADD_DT"); }
    protected abstract ConditionValue xgetCValueAddDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_USER: {varchar(255)}
     * @param addUser The value of addUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddUser_Equal(String addUser) {
        doSetAddUser_Equal(fRES(addUser));
    }

    protected void doSetAddUser_Equal(String addUser) {
        regAddUser(CK_EQ, addUser);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_USER: {varchar(255)}
     */
    public void setAddUser_IsNull() { regAddUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_USER: {varchar(255)}
     */
    public void setAddUser_IsNullOrEmpty() { regAddUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_USER: {varchar(255)}
     */
    public void setAddUser_IsNotNull() { regAddUser(CK_ISNN, DOBJ); }

    protected void regAddUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddUser(), "ADD_USER"); }
    protected abstract ConditionValue xgetCValueAddUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @param addProcess The value of addProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddProcess_Equal(String addProcess) {
        doSetAddProcess_Equal(fRES(addProcess));
    }

    protected void doSetAddProcess_Equal(String addProcess) {
        regAddProcess(CK_EQ, addProcess);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {varchar(4000)}
     */
    public void setAddProcess_IsNull() { regAddProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {varchar(4000)}
     */
    public void setAddProcess_IsNullOrEmpty() { regAddProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {varchar(4000)}
     */
    public void setAddProcess_IsNotNull() { regAddProcess(CK_ISNN, DOBJ); }

    protected void regAddProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddProcess(), "ADD_PROCESS"); }
    protected abstract ConditionValue xgetCValueAddProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @param updDt The value of updDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDt_Equal(java.sql.Timestamp updDt) {
        regUpdDt(CK_EQ,  updDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @param updDt The value of updDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDt_LessEqual(java.sql.Timestamp updDt) {
        regUpdDt(CK_LE, updDt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_DT: {datetime2(26, 6)}
     */
    public void setUpdDt_IsNull() { regUpdDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_DT: {datetime2(26, 6)}
     */
    public void setUpdDt_IsNotNull() { regUpdDt(CK_ISNN, DOBJ); }

    protected void regUpdDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdDt(), "UPD_DT"); }
    protected abstract ConditionValue xgetCValueUpdDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255)}
     * @param updUser The value of updUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUser_Equal(String updUser) {
        doSetUpdUser_Equal(fRES(updUser));
    }

    protected void doSetUpdUser_Equal(String updUser) {
        regUpdUser(CK_EQ, updUser);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255)}
     */
    public void setUpdUser_IsNull() { regUpdUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255)}
     */
    public void setUpdUser_IsNullOrEmpty() { regUpdUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255)}
     */
    public void setUpdUser_IsNotNull() { regUpdUser(CK_ISNN, DOBJ); }

    protected void regUpdUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdUser(), "UPD_USER"); }
    protected abstract ConditionValue xgetCValueUpdUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @param updProcess The value of updProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdProcess_Equal(String updProcess) {
        doSetUpdProcess_Equal(fRES(updProcess));
    }

    protected void doSetUpdProcess_Equal(String updProcess) {
        regUpdProcess(CK_EQ, updProcess);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {varchar(4000)}
     */
    public void setUpdProcess_IsNull() { regUpdProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {varchar(4000)}
     */
    public void setUpdProcess_IsNullOrEmpty() { regUpdProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {varchar(4000)}
     */
    public void setUpdProcess_IsNotNull() { regUpdProcess(CK_ISNN, DOBJ); }

    protected void regUpdProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdProcess(), "UPD_PROCESS"); }
    protected abstract ConditionValue xgetCValueUpdProcess();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrPicklistCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrPicklistCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrPicklistCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrPicklistCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrPicklistCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrPicklistCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrPicklistCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrPicklistCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrPicklistCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrPicklistCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrPicklistCB&gt;() {
     *     public void query(TTrPicklistCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrPicklistCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrPicklistCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrPicklistCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrPicklistCQ sq);

    protected TTrPicklistCB xcreateScalarConditionCB() {
        TTrPicklistCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrPicklistCB xcreateScalarConditionPartitionByCB() {
        TTrPicklistCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrPicklistCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrPicklistCB cb = new TTrPicklistCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "T_TR_PICKLIST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrPicklistCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrPicklistCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrPicklistCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrPicklistCB cb = new TTrPicklistCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "T_TR_PICKLIST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrPicklistCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrPicklistCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrPicklistCB cb = new TTrPicklistCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrPicklistCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param option The option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOption option) { // is user public!
        xdoWithManualOrder(option);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    /**
     * Order along the list of manual values. #beforejava8 <br>
     * This function with Union is unsupported! <br>
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderOption option = new ManualOrderOption();
        option.acceptOrderValueList(orderValueList);
        withManualOrder(option);
    }

    @Override
    protected void filterFromToOption(String columnDbName, FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected TTrPicklistCB newMyCB() {
        return new TTrPicklistCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrPicklistCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

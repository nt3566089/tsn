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
 * The abstract condition-query of T_TRIMALLOCSCHKRI.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrimallocschkriCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrimallocschkriCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRIMALLOCSCHKRI";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocschId The value of trimallocschId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocschId_Equal(Long trimallocschId) {
        doSetTrimallocschId_Equal(trimallocschId);
    }

    protected void doSetTrimallocschId_Equal(Long trimallocschId) {
        regTrimallocschId(CK_EQ, trimallocschId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocschId The value of trimallocschId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocschId_NotEqual(Long trimallocschId) {
        doSetTrimallocschId_NotEqual(trimallocschId);
    }

    protected void doSetTrimallocschId_NotEqual(Long trimallocschId) {
        regTrimallocschId(CK_NES, trimallocschId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocschId The value of trimallocschId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocschId_GreaterThan(Long trimallocschId) {
        regTrimallocschId(CK_GT, trimallocschId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocschId The value of trimallocschId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocschId_LessThan(Long trimallocschId) {
        regTrimallocschId(CK_LT, trimallocschId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocschId The value of trimallocschId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocschId_GreaterEqual(Long trimallocschId) {
        regTrimallocschId(CK_GE, trimallocschId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocschId The value of trimallocschId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocschId_LessEqual(Long trimallocschId) {
        regTrimallocschId(CK_LE, trimallocschId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trimallocschId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trimallocschId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrimallocschId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrimallocschId(), "TRIMALLOCSCH_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocschIdList The collection of trimallocschId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrimallocschId_InScope(Collection<Long> trimallocschIdList) {
        doSetTrimallocschId_InScope(trimallocschIdList);
    }

    protected void doSetTrimallocschId_InScope(Collection<Long> trimallocschIdList) {
        regINS(CK_INS, cTL(trimallocschIdList), xgetCValueTrimallocschId(), "TRIMALLOCSCH_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocschIdList The collection of trimallocschId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrimallocschId_NotInScope(Collection<Long> trimallocschIdList) {
        doSetTrimallocschId_NotInScope(trimallocschIdList);
    }

    protected void doSetTrimallocschId_NotInScope(Collection<Long> trimallocschIdList) {
        regINS(CK_NINS, cTL(trimallocschIdList), xgetCValueTrimallocschId(), "TRIMALLOCSCH_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TRIMALLOCSCH_ID from T_TRIMALLOCADJUST where ...)} <br>
     * T_TRIMALLOCADJUST by TRIMALLOCSCH_ID, named 'TTrimallocadjustAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrimallocadjustList</span>(trimallocadjustCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trimallocadjustCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrimallocadjustList for 'exists'. (NotNull)
     */
    public void existsTTrimallocadjustList(SubQuery<TTrimallocadjustCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocadjustCB cb = new TTrimallocadjustCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTrimallocschId_ExistsReferrer_TTrimallocadjustList(cb.query());
        registerExistsReferrer(cb.query(), "TRIMALLOCSCH_ID", "TRIMALLOCSCH_ID", pp, "tTrimallocadjustList");
    }
    public abstract String keepTrimallocschId_ExistsReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TRIMALLOCSCH_ID from T_TRIMALLOCADJUST where ...)} <br>
     * T_TRIMALLOCADJUST by TRIMALLOCSCH_ID, named 'TTrimallocadjustAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrimallocadjustList</span>(trimallocadjustCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trimallocadjustCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TrimallocschId_NotExistsReferrer_TTrimallocadjustList for 'not exists'. (NotNull)
     */
    public void notExistsTTrimallocadjustList(SubQuery<TTrimallocadjustCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocadjustCB cb = new TTrimallocadjustCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTrimallocschId_NotExistsReferrer_TTrimallocadjustList(cb.query());
        registerNotExistsReferrer(cb.query(), "TRIMALLOCSCH_ID", "TRIMALLOCSCH_ID", pp, "tTrimallocadjustList");
    }
    public abstract String keepTrimallocschId_NotExistsReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq);

    public void xsderiveTTrimallocadjustList(String fn, SubQuery<TTrimallocadjustCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocadjustCB cb = new TTrimallocadjustCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTrimallocschId_SpecifyDerivedReferrer_TTrimallocadjustList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TRIMALLOCSCH_ID", "TRIMALLOCSCH_ID", pp, "tTrimallocadjustList", al, op);
    }
    public abstract String keepTrimallocschId_SpecifyDerivedReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRIMALLOCADJUST where ...)} <br>
     * T_TRIMALLOCADJUST by TRIMALLOCSCH_ID, named 'TTrimallocadjustAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrimallocadjustList()</span>.<span style="color: #CC4747">max</span>(trimallocadjustCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trimallocadjustCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trimallocadjustCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrimallocadjustCB> derivedTTrimallocadjustList() {
        return xcreateQDRFunctionTTrimallocadjustList();
    }
    protected HpQDRFunction<TTrimallocadjustCB> xcreateQDRFunctionTTrimallocadjustList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrimallocadjustList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrimallocadjustList(String fn, SubQuery<TTrimallocadjustCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocadjustCB cb = new TTrimallocadjustCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTrimallocschId_QueryDerivedReferrer_TTrimallocadjustList(cb.query()); String prpp = keepTrimallocschId_QueryDerivedReferrer_TTrimallocadjustListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TRIMALLOCSCH_ID", "TRIMALLOCSCH_ID", sqpp, "tTrimallocadjustList", rd, vl, prpp, op);
    }
    public abstract String keepTrimallocschId_QueryDerivedReferrer_TTrimallocadjustList(TTrimallocadjustCQ sq);
    public abstract String keepTrimallocschId_QueryDerivedReferrer_TTrimallocadjustListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrimallocschId_IsNull() { regTrimallocschId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrimallocschId_IsNotNull() { regTrimallocschId(CK_ISNN, DOBJ); }

    protected void regTrimallocschId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrimallocschId(), "TRIMALLOCSCH_ID"); }
    protected abstract ConditionValue xgetCValueTrimallocschId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H}
     * @param trimallocHId The value of trimallocHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocHId_Equal(Long trimallocHId) {
        doSetTrimallocHId_Equal(trimallocHId);
    }

    protected void doSetTrimallocHId_Equal(Long trimallocHId) {
        regTrimallocHId(CK_EQ, trimallocHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H}
     * @param trimallocHId The value of trimallocHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocHId_NotEqual(Long trimallocHId) {
        doSetTrimallocHId_NotEqual(trimallocHId);
    }

    protected void doSetTrimallocHId_NotEqual(Long trimallocHId) {
        regTrimallocHId(CK_NES, trimallocHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H}
     * @param trimallocHId The value of trimallocHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocHId_GreaterThan(Long trimallocHId) {
        regTrimallocHId(CK_GT, trimallocHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H}
     * @param trimallocHId The value of trimallocHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocHId_LessThan(Long trimallocHId) {
        regTrimallocHId(CK_LT, trimallocHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H}
     * @param trimallocHId The value of trimallocHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocHId_GreaterEqual(Long trimallocHId) {
        regTrimallocHId(CK_GE, trimallocHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H}
     * @param trimallocHId The value of trimallocHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocHId_LessEqual(Long trimallocHId) {
        regTrimallocHId(CK_LE, trimallocHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H}
     * @param minNumber The min number of trimallocHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trimallocHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrimallocHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrimallocHId(), "TRIMALLOC_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H}
     * @param trimallocHIdList The collection of trimallocHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrimallocHId_InScope(Collection<Long> trimallocHIdList) {
        doSetTrimallocHId_InScope(trimallocHIdList);
    }

    protected void doSetTrimallocHId_InScope(Collection<Long> trimallocHIdList) {
        regINS(CK_INS, cTL(trimallocHIdList), xgetCValueTrimallocHId(), "TRIMALLOC_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H}
     * @param trimallocHIdList The collection of trimallocHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrimallocHId_NotInScope(Collection<Long> trimallocHIdList) {
        doSetTrimallocHId_NotInScope(trimallocHIdList);
    }

    protected void doSetTrimallocHId_NotInScope(Collection<Long> trimallocHIdList) {
        regINS(CK_NINS, cTL(trimallocHIdList), xgetCValueTrimallocHId(), "TRIMALLOC_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TRIMALLOC_H_ID from T_TRIMALLOC_H where ...)} <br />
     * T_TRIMALLOC_H by my TRIMALLOC_H_ID, named 'TTrimallocH'.
     * @param subCBLambda The callback for sub-query of TTrimallocH for 'in-scope'. (NotNull)
     */
    public void inScopeTTrimallocH(SubQuery<TTrimallocHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocHCB cb = new TTrimallocHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrimallocHId_InScopeRelation_TTrimallocH(cb.query());
        registerInScopeRelation(cb.query(), "TRIMALLOC_H_ID", "TRIMALLOC_H_ID", pp, "tTrimallocH", false);
    }
    public abstract String keepTrimallocHId_InScopeRelation_TTrimallocH(TTrimallocHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TRIMALLOC_H_ID from T_TRIMALLOC_H where ...)} <br />
     * T_TRIMALLOC_H by my TRIMALLOC_H_ID, named 'TTrimallocH'.
     * @param subCBLambda The callback for sub-query of TTrimallocH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTTrimallocH(SubQuery<TTrimallocHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocHCB cb = new TTrimallocHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrimallocHId_NotInScopeRelation_TTrimallocH(cb.query());
        registerInScopeRelation(cb.query(), "TRIMALLOC_H_ID", "TRIMALLOC_H_ID", pp, "tTrimallocH", true);
    }
    public abstract String keepTrimallocHId_NotInScopeRelation_TTrimallocH(TTrimallocHCQ sq);

    protected void regTrimallocHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrimallocHId(), "TRIMALLOC_H_ID"); }
    protected abstract ConditionValue xgetCValueTrimallocHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailId The value of trsodetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_Equal(Long trsodetailId) {
        doSetTrsodetailId_Equal(trsodetailId);
    }

    protected void doSetTrsodetailId_Equal(Long trsodetailId) {
        regTrsodetailId(CK_EQ, trsodetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailId The value of trsodetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_NotEqual(Long trsodetailId) {
        doSetTrsodetailId_NotEqual(trsodetailId);
    }

    protected void doSetTrsodetailId_NotEqual(Long trsodetailId) {
        regTrsodetailId(CK_NES, trsodetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailId The value of trsodetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_GreaterThan(Long trsodetailId) {
        regTrsodetailId(CK_GT, trsodetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailId The value of trsodetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_LessThan(Long trsodetailId) {
        regTrsodetailId(CK_LT, trsodetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailId The value of trsodetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_GreaterEqual(Long trsodetailId) {
        regTrsodetailId(CK_GE, trsodetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailId The value of trsodetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_LessEqual(Long trsodetailId) {
        regTrsodetailId(CK_LE, trsodetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL}
     * @param minNumber The min number of trsodetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsodetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsodetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsodetailId(), "TRSODETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailIdList The collection of trsodetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsodetailId_InScope(Collection<Long> trsodetailIdList) {
        doSetTrsodetailId_InScope(trsodetailIdList);
    }

    protected void doSetTrsodetailId_InScope(Collection<Long> trsodetailIdList) {
        regINS(CK_INS, cTL(trsodetailIdList), xgetCValueTrsodetailId(), "TRSODETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailIdList The collection of trsodetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsodetailId_NotInScope(Collection<Long> trsodetailIdList) {
        doSetTrsodetailId_NotInScope(trsodetailIdList);
    }

    protected void doSetTrsodetailId_NotInScope(Collection<Long> trsodetailIdList) {
        regINS(CK_NINS, cTL(trsodetailIdList), xgetCValueTrsodetailId(), "TRSODETAIL_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TRSODETAIL_ID from T_YTRSODETAIL where ...)} <br />
     * T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'.
     * @param subCBLambda The callback for sub-query of TYtrsodetail for 'in-scope'. (NotNull)
     */
    public void inScopeTYtrsodetail(SubQuery<TYtrsodetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrsodetailId_InScopeRelation_TYtrsodetail(cb.query());
        registerInScopeRelation(cb.query(), "TRSODETAIL_ID", "TRSODETAIL_ID", pp, "tYtrsodetail", false);
    }
    public abstract String keepTrsodetailId_InScopeRelation_TYtrsodetail(TYtrsodetailCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TRSODETAIL_ID from T_YTRSODETAIL where ...)} <br />
     * T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'.
     * @param subCBLambda The callback for sub-query of TYtrsodetail for 'not in-scope'. (NotNull)
     */
    public void notInScopeTYtrsodetail(SubQuery<TYtrsodetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrsodetailId_NotInScopeRelation_TYtrsodetail(cb.query());
        registerInScopeRelation(cb.query(), "TRSODETAIL_ID", "TRSODETAIL_ID", pp, "tYtrsodetail", true);
    }
    public abstract String keepTrsodetailId_NotInScopeRelation_TYtrsodetail(TYtrsodetailCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL}
     */
    public void setTrsodetailId_IsNull() { regTrsodetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL}
     */
    public void setTrsodetailId_IsNotNull() { regTrsodetailId(CK_ISNN, DOBJ); }

    protected void regTrsodetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsodetailId(), "TRSODETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTrsodetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_Equal(Long allocImpKey) {
        doSetAllocImpKey_Equal(allocImpKey);
    }

    protected void doSetAllocImpKey_Equal(Long allocImpKey) {
        regAllocImpKey(CK_EQ, allocImpKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_NotEqual(Long allocImpKey) {
        doSetAllocImpKey_NotEqual(allocImpKey);
    }

    protected void doSetAllocImpKey_NotEqual(Long allocImpKey) {
        regAllocImpKey(CK_NES, allocImpKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_GreaterThan(Long allocImpKey) {
        regAllocImpKey(CK_GT, allocImpKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_LessThan(Long allocImpKey) {
        regAllocImpKey(CK_LT, allocImpKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_GreaterEqual(Long allocImpKey) {
        regAllocImpKey(CK_GE, allocImpKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_LessEqual(Long allocImpKey) {
        regAllocImpKey(CK_LE, allocImpKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param minNumber The min number of allocImpKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocImpKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocImpKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocImpKey(), "ALLOC_IMP_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKeyList The collection of allocImpKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocImpKey_InScope(Collection<Long> allocImpKeyList) {
        doSetAllocImpKey_InScope(allocImpKeyList);
    }

    protected void doSetAllocImpKey_InScope(Collection<Long> allocImpKeyList) {
        regINS(CK_INS, cTL(allocImpKeyList), xgetCValueAllocImpKey(), "ALLOC_IMP_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKeyList The collection of allocImpKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocImpKey_NotInScope(Collection<Long> allocImpKeyList) {
        doSetAllocImpKey_NotInScope(allocImpKeyList);
    }

    protected void doSetAllocImpKey_NotInScope(Collection<Long> allocImpKeyList) {
        regINS(CK_NINS, cTL(allocImpKeyList), xgetCValueAllocImpKey(), "ALLOC_IMP_KEY");
    }

    protected void regAllocImpKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocImpKey(), "ALLOC_IMP_KEY"); }
    protected abstract ConditionValue xgetCValueAllocImpKey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_RESG_No: {NotNull, bigint(19)}
     * @param alcImpResgNo The value of alcImpResgNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_Equal(Long alcImpResgNo) {
        doSetAlcImpResgNo_Equal(alcImpResgNo);
    }

    protected void doSetAlcImpResgNo_Equal(Long alcImpResgNo) {
        regAlcImpResgNo(CK_EQ, alcImpResgNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_RESG_No: {NotNull, bigint(19)}
     * @param alcImpResgNo The value of alcImpResgNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_NotEqual(Long alcImpResgNo) {
        doSetAlcImpResgNo_NotEqual(alcImpResgNo);
    }

    protected void doSetAlcImpResgNo_NotEqual(Long alcImpResgNo) {
        regAlcImpResgNo(CK_NES, alcImpResgNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_RESG_No: {NotNull, bigint(19)}
     * @param alcImpResgNo The value of alcImpResgNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_GreaterThan(Long alcImpResgNo) {
        regAlcImpResgNo(CK_GT, alcImpResgNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_RESG_No: {NotNull, bigint(19)}
     * @param alcImpResgNo The value of alcImpResgNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_LessThan(Long alcImpResgNo) {
        regAlcImpResgNo(CK_LT, alcImpResgNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_RESG_No: {NotNull, bigint(19)}
     * @param alcImpResgNo The value of alcImpResgNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_GreaterEqual(Long alcImpResgNo) {
        regAlcImpResgNo(CK_GE, alcImpResgNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_RESG_No: {NotNull, bigint(19)}
     * @param alcImpResgNo The value of alcImpResgNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_LessEqual(Long alcImpResgNo) {
        regAlcImpResgNo(CK_LE, alcImpResgNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_RESG_No: {NotNull, bigint(19)}
     * @param minNumber The min number of alcImpResgNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of alcImpResgNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAlcImpResgNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAlcImpResgNo(), "ALC_IMP_RESG_No", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALC_IMP_RESG_No: {NotNull, bigint(19)}
     * @param alcImpResgNoList The collection of alcImpResgNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_InScope(Collection<Long> alcImpResgNoList) {
        doSetAlcImpResgNo_InScope(alcImpResgNoList);
    }

    protected void doSetAlcImpResgNo_InScope(Collection<Long> alcImpResgNoList) {
        regINS(CK_INS, cTL(alcImpResgNoList), xgetCValueAlcImpResgNo(), "ALC_IMP_RESG_No");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALC_IMP_RESG_No: {NotNull, bigint(19)}
     * @param alcImpResgNoList The collection of alcImpResgNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_NotInScope(Collection<Long> alcImpResgNoList) {
        doSetAlcImpResgNo_NotInScope(alcImpResgNoList);
    }

    protected void doSetAlcImpResgNo_NotInScope(Collection<Long> alcImpResgNoList) {
        regINS(CK_NINS, cTL(alcImpResgNoList), xgetCValueAlcImpResgNo(), "ALC_IMP_RESG_No");
    }

    protected void regAlcImpResgNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAlcImpResgNo(), "ALC_IMP_RESG_No"); }
    protected abstract ConditionValue xgetCValueAlcImpResgNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_Equal(Long locationId) {
        doSetLocationId_Equal(locationId);
    }

    protected void doSetLocationId_Equal(Long locationId) {
        regLocationId(CK_EQ, locationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_NotEqual(Long locationId) {
        doSetLocationId_NotEqual(locationId);
    }

    protected void doSetLocationId_NotEqual(Long locationId) {
        regLocationId(CK_NES, locationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationIdList The collection of locationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_InScope(Collection<Long> locationIdList) {
        doSetLocationId_InScope(locationIdList);
    }

    protected void doSetLocationId_InScope(Collection<Long> locationIdList) {
        regINS(CK_INS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<Long> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<Long> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     */
    public void setLocationId_IsNull() { regLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     */
    public void setLocationId_IsNotNull() { regLocationId(CK_ISNN, DOBJ); }

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_Equal(String locationCd) {
        doSetLocationCd_Equal(fRES(locationCd));
    }

    protected void doSetLocationCd_Equal(String locationCd) {
        regLocationCd(CK_EQ, locationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotEqual(String locationCd) {
        doSetLocationCd_NotEqual(fRES(locationCd));
    }

    protected void doSetLocationCd_NotEqual(String locationCd) {
        regLocationCd(CK_NES, locationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterThan(String locationCd) {
        regLocationCd(CK_GT, fRES(locationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessThan(String locationCd) {
        regLocationCd(CK_LT, fRES(locationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterEqual(String locationCd) {
        regLocationCd(CK_GE, fRES(locationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessEqual(String locationCd) {
        regLocationCd(CK_LE, fRES(locationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCdList The collection of locationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_InScope(Collection<String> locationCdList) {
        doSetLocationCd_InScope(locationCdList);
    }

    protected void doSetLocationCd_InScope(Collection<String> locationCdList) {
        regINS(CK_INS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCdList The collection of locationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotInScope(Collection<String> locationCdList) {
        doSetLocationCd_NotInScope(locationCdList);
    }

    protected void doSetLocationCd_NotInScope(Collection<String> locationCdList) {
        regINS(CK_NINS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)} <br>
     * <pre>e.g. setLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationCd The value of locationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationCd_LikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd_NotLikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     * @param locationCd The value of locationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        setLocationCd_LikeSearch(locationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     */
    public void setLocationCd_IsNull() { regLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     */
    public void setLocationCd_IsNullOrEmpty() { regLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(30)}
     */
    public void setLocationCd_IsNotNull() { regLocationCd(CK_ISNN, DOBJ); }

    protected void regLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd(), "LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueLocationCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19)}
     * @param expectQty The value of expectQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_Equal(Long expectQty) {
        doSetExpectQty_Equal(expectQty);
    }

    protected void doSetExpectQty_Equal(Long expectQty) {
        regExpectQty(CK_EQ, expectQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19)}
     * @param expectQty The value of expectQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_NotEqual(Long expectQty) {
        doSetExpectQty_NotEqual(expectQty);
    }

    protected void doSetExpectQty_NotEqual(Long expectQty) {
        regExpectQty(CK_NES, expectQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19)}
     * @param expectQty The value of expectQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_GreaterThan(Long expectQty) {
        regExpectQty(CK_GT, expectQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19)}
     * @param expectQty The value of expectQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_LessThan(Long expectQty) {
        regExpectQty(CK_LT, expectQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19)}
     * @param expectQty The value of expectQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_GreaterEqual(Long expectQty) {
        regExpectQty(CK_GE, expectQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19)}
     * @param expectQty The value of expectQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_LessEqual(Long expectQty) {
        regExpectQty(CK_LE, expectQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19)}
     * @param minNumber The min number of expectQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expectQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExpectQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpectQty(), "EXPECT_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19)}
     * @param expectQtyList The collection of expectQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectQty_InScope(Collection<Long> expectQtyList) {
        doSetExpectQty_InScope(expectQtyList);
    }

    protected void doSetExpectQty_InScope(Collection<Long> expectQtyList) {
        regINS(CK_INS, cTL(expectQtyList), xgetCValueExpectQty(), "EXPECT_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19)}
     * @param expectQtyList The collection of expectQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectQty_NotInScope(Collection<Long> expectQtyList) {
        doSetExpectQty_NotInScope(expectQtyList);
    }

    protected void doSetExpectQty_NotInScope(Collection<Long> expectQtyList) {
        regINS(CK_NINS, cTL(expectQtyList), xgetCValueExpectQty(), "EXPECT_QTY");
    }

    protected void regExpectQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectQty(), "EXPECT_QTY"); }
    protected abstract ConditionValue xgetCValueExpectQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_Equal(String manufacturedate) {
        doSetManufacturedate_Equal(fRES(manufacturedate));
    }

    protected void doSetManufacturedate_Equal(String manufacturedate) {
        regManufacturedate(CK_EQ, manufacturedate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_NotEqual(String manufacturedate) {
        doSetManufacturedate_NotEqual(fRES(manufacturedate));
    }

    protected void doSetManufacturedate_NotEqual(String manufacturedate) {
        regManufacturedate(CK_NES, manufacturedate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_GreaterThan(String manufacturedate) {
        regManufacturedate(CK_GT, fRES(manufacturedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_LessThan(String manufacturedate) {
        regManufacturedate(CK_LT, fRES(manufacturedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_GreaterEqual(String manufacturedate) {
        regManufacturedate(CK_GE, fRES(manufacturedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_LessEqual(String manufacturedate) {
        regManufacturedate(CK_LE, fRES(manufacturedate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedateList The collection of manufacturedate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_InScope(Collection<String> manufacturedateList) {
        doSetManufacturedate_InScope(manufacturedateList);
    }

    protected void doSetManufacturedate_InScope(Collection<String> manufacturedateList) {
        regINS(CK_INS, cTL(manufacturedateList), xgetCValueManufacturedate(), "MANUFACTUREDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedateList The collection of manufacturedate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_NotInScope(Collection<String> manufacturedateList) {
        doSetManufacturedate_NotInScope(manufacturedateList);
    }

    protected void doSetManufacturedate_NotInScope(Collection<String> manufacturedateList) {
        regINS(CK_NINS, cTL(manufacturedateList), xgetCValueManufacturedate(), "MANUFACTUREDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setManufacturedate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufacturedate The value of manufacturedate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufacturedate_LikeSearch(String manufacturedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufacturedate), xgetCValueManufacturedate(), "MANUFACTUREDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufacturedate_NotLikeSearch(String manufacturedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufacturedate), xgetCValueManufacturedate(), "MANUFACTUREDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_PrefixSearch(String manufacturedate) {
        setManufacturedate_LikeSearch(manufacturedate, xcLSOPPre());
    }

    protected void regManufacturedate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufacturedate(), "MANUFACTUREDATE"); }
    protected abstract ConditionValue xgetCValueManufacturedate();

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
     * ALCIMEXP_FLG: {NotNull, varchar(30)}
     * @param alcimexpFlg The value of alcimexpFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimexpFlg_Equal(String alcimexpFlg) {
        doSetAlcimexpFlg_Equal(fRES(alcimexpFlg));
    }

    protected void doSetAlcimexpFlg_Equal(String alcimexpFlg) {
        regAlcimexpFlg(CK_EQ, alcimexpFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALCIMEXP_FLG: {NotNull, varchar(30)}
     * @param alcimexpFlg The value of alcimexpFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimexpFlg_NotEqual(String alcimexpFlg) {
        doSetAlcimexpFlg_NotEqual(fRES(alcimexpFlg));
    }

    protected void doSetAlcimexpFlg_NotEqual(String alcimexpFlg) {
        regAlcimexpFlg(CK_NES, alcimexpFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALCIMEXP_FLG: {NotNull, varchar(30)}
     * @param alcimexpFlg The value of alcimexpFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimexpFlg_GreaterThan(String alcimexpFlg) {
        regAlcimexpFlg(CK_GT, fRES(alcimexpFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALCIMEXP_FLG: {NotNull, varchar(30)}
     * @param alcimexpFlg The value of alcimexpFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimexpFlg_LessThan(String alcimexpFlg) {
        regAlcimexpFlg(CK_LT, fRES(alcimexpFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALCIMEXP_FLG: {NotNull, varchar(30)}
     * @param alcimexpFlg The value of alcimexpFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimexpFlg_GreaterEqual(String alcimexpFlg) {
        regAlcimexpFlg(CK_GE, fRES(alcimexpFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALCIMEXP_FLG: {NotNull, varchar(30)}
     * @param alcimexpFlg The value of alcimexpFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimexpFlg_LessEqual(String alcimexpFlg) {
        regAlcimexpFlg(CK_LE, fRES(alcimexpFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALCIMEXP_FLG: {NotNull, varchar(30)}
     * @param alcimexpFlgList The collection of alcimexpFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimexpFlg_InScope(Collection<String> alcimexpFlgList) {
        doSetAlcimexpFlg_InScope(alcimexpFlgList);
    }

    protected void doSetAlcimexpFlg_InScope(Collection<String> alcimexpFlgList) {
        regINS(CK_INS, cTL(alcimexpFlgList), xgetCValueAlcimexpFlg(), "ALCIMEXP_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALCIMEXP_FLG: {NotNull, varchar(30)}
     * @param alcimexpFlgList The collection of alcimexpFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimexpFlg_NotInScope(Collection<String> alcimexpFlgList) {
        doSetAlcimexpFlg_NotInScope(alcimexpFlgList);
    }

    protected void doSetAlcimexpFlg_NotInScope(Collection<String> alcimexpFlgList) {
        regINS(CK_NINS, cTL(alcimexpFlgList), xgetCValueAlcimexpFlg(), "ALCIMEXP_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALCIMEXP_FLG: {NotNull, varchar(30)} <br>
     * <pre>e.g. setAlcimexpFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param alcimexpFlg The value of alcimexpFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAlcimexpFlg_LikeSearch(String alcimexpFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(alcimexpFlg), xgetCValueAlcimexpFlg(), "ALCIMEXP_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALCIMEXP_FLG: {NotNull, varchar(30)}
     * @param alcimexpFlg The value of alcimexpFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAlcimexpFlg_NotLikeSearch(String alcimexpFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(alcimexpFlg), xgetCValueAlcimexpFlg(), "ALCIMEXP_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALCIMEXP_FLG: {NotNull, varchar(30)}
     * @param alcimexpFlg The value of alcimexpFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimexpFlg_PrefixSearch(String alcimexpFlg) {
        setAlcimexpFlg_LikeSearch(alcimexpFlg, xcLSOPPre());
    }

    protected void regAlcimexpFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAlcimexpFlg(), "ALCIMEXP_FLG"); }
    protected abstract ConditionValue xgetCValueAlcimexpFlg();

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
    public HpSLCFunction<TTrimallocschkriCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrimallocschkriCB.class);
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
    public HpSLCFunction<TTrimallocschkriCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrimallocschkriCB.class);
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
    public HpSLCFunction<TTrimallocschkriCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrimallocschkriCB.class);
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
    public HpSLCFunction<TTrimallocschkriCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrimallocschkriCB.class);
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
    public HpSLCFunction<TTrimallocschkriCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrimallocschkriCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrimallocschkriCB&gt;() {
     *     public void query(TTrimallocschkriCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrimallocschkriCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrimallocschkriCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocschkriCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrimallocschkriCQ sq);

    protected TTrimallocschkriCB xcreateScalarConditionCB() {
        TTrimallocschkriCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrimallocschkriCB xcreateScalarConditionPartitionByCB() {
        TTrimallocschkriCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrimallocschkriCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocschkriCB cb = new TTrimallocschkriCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRIMALLOCSCH_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrimallocschkriCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrimallocschkriCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrimallocschkriCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocschkriCB cb = new TTrimallocschkriCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRIMALLOCSCH_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrimallocschkriCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrimallocschkriCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocschkriCB cb = new TTrimallocschkriCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrimallocschkriCQ sq);

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
    protected TTrimallocschkriCB newMyCB() {
        return new TTrimallocschkriCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrimallocschkriCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

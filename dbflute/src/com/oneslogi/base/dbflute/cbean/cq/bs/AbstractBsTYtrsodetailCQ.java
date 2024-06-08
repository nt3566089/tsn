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
 * The abstract condition-query of T_YTRSODETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTYtrsodetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTYtrsodetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_YTRSODETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsodetailId The value of trsodetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_GreaterThan(Long trsodetailId) {
        regTrsodetailId(CK_GT, trsodetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsodetailId The value of trsodetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_LessThan(Long trsodetailId) {
        regTrsodetailId(CK_LT, trsodetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsodetailId The value of trsodetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_GreaterEqual(Long trsodetailId) {
        regTrsodetailId(CK_GE, trsodetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsodetailId The value of trsodetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_LessEqual(Long trsodetailId) {
        regTrsodetailId(CK_LE, trsodetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trsodetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsodetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsodetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsodetailId(), "TRSODETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsodetailIdList The collection of trsodetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsodetailId_NotInScope(Collection<Long> trsodetailIdList) {
        doSetTrsodetailId_NotInScope(trsodetailIdList);
    }

    protected void doSetTrsodetailId_NotInScope(Collection<Long> trsodetailIdList) {
        regINS(CK_NINS, cTL(trsodetailIdList), xgetCValueTrsodetailId(), "TRSODETAIL_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TRSODETAIL_ID from T_TRIMALLOCSCHKRI where ...)} <br>
     * T_TRIMALLOCSCHKRI by TRSODETAIL_ID, named 'TTrimallocschkriAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrimallocschkriList</span>(trimallocschkriCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trimallocschkriCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrimallocschkriList for 'exists'. (NotNull)
     */
    public void existsTTrimallocschkriList(SubQuery<TTrimallocschkriCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocschkriCB cb = new TTrimallocschkriCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTrsodetailId_ExistsReferrer_TTrimallocschkriList(cb.query());
        registerExistsReferrer(cb.query(), "TRSODETAIL_ID", "TRSODETAIL_ID", pp, "tTrimallocschkriList");
    }
    public abstract String keepTrsodetailId_ExistsReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TRSODETAIL_ID from T_TRPICKDETAIL where ...)} <br>
     * T_TRPICKDETAIL by TRSODETAIL_ID, named 'TTrpickdetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrpickdetailList</span>(trpickdetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trpickdetailCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrpickdetailList for 'exists'. (NotNull)
     */
    public void existsTTrpickdetailList(SubQuery<TTrpickdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpickdetailCB cb = new TTrpickdetailCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTrsodetailId_ExistsReferrer_TTrpickdetailList(cb.query());
        registerExistsReferrer(cb.query(), "TRSODETAIL_ID", "TRSODETAIL_ID", pp, "tTrpickdetailList");
    }
    public abstract String keepTrsodetailId_ExistsReferrer_TTrpickdetailList(TTrpickdetailCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TRSODETAIL_ID from T_TRIMALLOCSCHKRI where ...)} <br>
     * T_TRIMALLOCSCHKRI by TRSODETAIL_ID, named 'TTrimallocschkriAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrimallocschkriList</span>(trimallocschkriCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trimallocschkriCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TrsodetailId_NotExistsReferrer_TTrimallocschkriList for 'not exists'. (NotNull)
     */
    public void notExistsTTrimallocschkriList(SubQuery<TTrimallocschkriCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocschkriCB cb = new TTrimallocschkriCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTrsodetailId_NotExistsReferrer_TTrimallocschkriList(cb.query());
        registerNotExistsReferrer(cb.query(), "TRSODETAIL_ID", "TRSODETAIL_ID", pp, "tTrimallocschkriList");
    }
    public abstract String keepTrsodetailId_NotExistsReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TRSODETAIL_ID from T_TRPICKDETAIL where ...)} <br>
     * T_TRPICKDETAIL by TRSODETAIL_ID, named 'TTrpickdetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrpickdetailList</span>(trpickdetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trpickdetailCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TrsodetailId_NotExistsReferrer_TTrpickdetailList for 'not exists'. (NotNull)
     */
    public void notExistsTTrpickdetailList(SubQuery<TTrpickdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpickdetailCB cb = new TTrpickdetailCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTrsodetailId_NotExistsReferrer_TTrpickdetailList(cb.query());
        registerNotExistsReferrer(cb.query(), "TRSODETAIL_ID", "TRSODETAIL_ID", pp, "tTrpickdetailList");
    }
    public abstract String keepTrsodetailId_NotExistsReferrer_TTrpickdetailList(TTrpickdetailCQ sq);

    public void xsderiveTTrimallocschkriList(String fn, SubQuery<TTrimallocschkriCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocschkriCB cb = new TTrimallocschkriCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTrsodetailId_SpecifyDerivedReferrer_TTrimallocschkriList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TRSODETAIL_ID", "TRSODETAIL_ID", pp, "tTrimallocschkriList", al, op);
    }
    public abstract String keepTrsodetailId_SpecifyDerivedReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq);

    public void xsderiveTTrpickdetailList(String fn, SubQuery<TTrpickdetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpickdetailCB cb = new TTrpickdetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTrsodetailId_SpecifyDerivedReferrer_TTrpickdetailList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TRSODETAIL_ID", "TRSODETAIL_ID", pp, "tTrpickdetailList", al, op);
    }
    public abstract String keepTrsodetailId_SpecifyDerivedReferrer_TTrpickdetailList(TTrpickdetailCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRIMALLOCSCHKRI where ...)} <br>
     * T_TRIMALLOCSCHKRI by TRSODETAIL_ID, named 'TTrimallocschkriAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrimallocschkriList()</span>.<span style="color: #CC4747">max</span>(trimallocschkriCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trimallocschkriCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trimallocschkriCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrimallocschkriCB> derivedTTrimallocschkriList() {
        return xcreateQDRFunctionTTrimallocschkriList();
    }
    protected HpQDRFunction<TTrimallocschkriCB> xcreateQDRFunctionTTrimallocschkriList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrimallocschkriList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrimallocschkriList(String fn, SubQuery<TTrimallocschkriCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocschkriCB cb = new TTrimallocschkriCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTrsodetailId_QueryDerivedReferrer_TTrimallocschkriList(cb.query()); String prpp = keepTrsodetailId_QueryDerivedReferrer_TTrimallocschkriListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TRSODETAIL_ID", "TRSODETAIL_ID", sqpp, "tTrimallocschkriList", rd, vl, prpp, op);
    }
    public abstract String keepTrsodetailId_QueryDerivedReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq);
    public abstract String keepTrsodetailId_QueryDerivedReferrer_TTrimallocschkriListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRPICKDETAIL where ...)} <br>
     * T_TRPICKDETAIL by TRSODETAIL_ID, named 'TTrpickdetailAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrpickdetailList()</span>.<span style="color: #CC4747">max</span>(trpickdetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trpickdetailCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trpickdetailCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrpickdetailCB> derivedTTrpickdetailList() {
        return xcreateQDRFunctionTTrpickdetailList();
    }
    protected HpQDRFunction<TTrpickdetailCB> xcreateQDRFunctionTTrpickdetailList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrpickdetailList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrpickdetailList(String fn, SubQuery<TTrpickdetailCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpickdetailCB cb = new TTrpickdetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTrsodetailId_QueryDerivedReferrer_TTrpickdetailList(cb.query()); String prpp = keepTrsodetailId_QueryDerivedReferrer_TTrpickdetailListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TRSODETAIL_ID", "TRSODETAIL_ID", sqpp, "tTrpickdetailList", rd, vl, prpp, op);
    }
    public abstract String keepTrsodetailId_QueryDerivedReferrer_TTrpickdetailList(TTrpickdetailCQ sq);
    public abstract String keepTrsodetailId_QueryDerivedReferrer_TTrpickdetailListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrsodetailId_IsNull() { regTrsodetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrsodetailId_IsNotNull() { regTrsodetailId(CK_ISNN, DOBJ); }

    protected void regTrsodetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsodetailId(), "TRSODETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTrsodetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO}
     * @param trsoId The value of trsoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsoId_Equal(Long trsoId) {
        doSetTrsoId_Equal(trsoId);
    }

    protected void doSetTrsoId_Equal(Long trsoId) {
        regTrsoId(CK_EQ, trsoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO}
     * @param trsoId The value of trsoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsoId_NotEqual(Long trsoId) {
        doSetTrsoId_NotEqual(trsoId);
    }

    protected void doSetTrsoId_NotEqual(Long trsoId) {
        regTrsoId(CK_NES, trsoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO}
     * @param trsoId The value of trsoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsoId_GreaterThan(Long trsoId) {
        regTrsoId(CK_GT, trsoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO}
     * @param trsoId The value of trsoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsoId_LessThan(Long trsoId) {
        regTrsoId(CK_LT, trsoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO}
     * @param trsoId The value of trsoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsoId_GreaterEqual(Long trsoId) {
        regTrsoId(CK_GE, trsoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO}
     * @param trsoId The value of trsoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsoId_LessEqual(Long trsoId) {
        regTrsoId(CK_LE, trsoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO}
     * @param minNumber The min number of trsoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsoId(), "TRSO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO}
     * @param trsoIdList The collection of trsoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoId_InScope(Collection<Long> trsoIdList) {
        doSetTrsoId_InScope(trsoIdList);
    }

    protected void doSetTrsoId_InScope(Collection<Long> trsoIdList) {
        regINS(CK_INS, cTL(trsoIdList), xgetCValueTrsoId(), "TRSO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO}
     * @param trsoIdList The collection of trsoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoId_NotInScope(Collection<Long> trsoIdList) {
        doSetTrsoId_NotInScope(trsoIdList);
    }

    protected void doSetTrsoId_NotInScope(Collection<Long> trsoIdList) {
        regINS(CK_NINS, cTL(trsoIdList), xgetCValueTrsoId(), "TRSO_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TRSO_ID from T_YTRSO where ...)} <br />
     * T_YTRSO by my TRSO_ID, named 'TYtrso'.
     * @param subCBLambda The callback for sub-query of TYtrso for 'in-scope'. (NotNull)
     */
    public void inScopeTYtrso(SubQuery<TYtrsoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsoCB cb = new TYtrsoCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrsoId_InScopeRelation_TYtrso(cb.query());
        registerInScopeRelation(cb.query(), "TRSO_ID", "TRSR_ID", pp, "tYtrso", false);
    }
    public abstract String keepTrsoId_InScopeRelation_TYtrso(TYtrsoCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TRSO_ID from T_YTRSO where ...)} <br />
     * T_YTRSO by my TRSO_ID, named 'TYtrso'.
     * @param subCBLambda The callback for sub-query of TYtrso for 'not in-scope'. (NotNull)
     */
    public void notInScopeTYtrso(SubQuery<TYtrsoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsoCB cb = new TYtrsoCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrsoId_NotInScopeRelation_TYtrso(cb.query());
        registerInScopeRelation(cb.query(), "TRSO_ID", "TRSR_ID", pp, "tYtrso", true);
    }
    public abstract String keepTrsoId_NotInScopeRelation_TYtrso(TYtrsoCQ sq);

    protected void regTrsoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsoId(), "TRSO_ID"); }
    protected abstract ConditionValue xgetCValueTrsoId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(Long productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Long productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'in-scope'. (NotNull)
     */
    public void inScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", false);
    }
    public abstract String keepProductId_InScopeRelation_MProduct(MProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", true);
    }
    public abstract String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq);

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_LINE_NO: {NotNull, bigint(19)}
     * @param soLineNo The value of soLineNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoLineNo_Equal(Long soLineNo) {
        doSetSoLineNo_Equal(soLineNo);
    }

    protected void doSetSoLineNo_Equal(Long soLineNo) {
        regSoLineNo(CK_EQ, soLineNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_LINE_NO: {NotNull, bigint(19)}
     * @param soLineNo The value of soLineNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoLineNo_NotEqual(Long soLineNo) {
        doSetSoLineNo_NotEqual(soLineNo);
    }

    protected void doSetSoLineNo_NotEqual(Long soLineNo) {
        regSoLineNo(CK_NES, soLineNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_LINE_NO: {NotNull, bigint(19)}
     * @param soLineNo The value of soLineNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoLineNo_GreaterThan(Long soLineNo) {
        regSoLineNo(CK_GT, soLineNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_LINE_NO: {NotNull, bigint(19)}
     * @param soLineNo The value of soLineNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoLineNo_LessThan(Long soLineNo) {
        regSoLineNo(CK_LT, soLineNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_LINE_NO: {NotNull, bigint(19)}
     * @param soLineNo The value of soLineNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoLineNo_GreaterEqual(Long soLineNo) {
        regSoLineNo(CK_GE, soLineNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SO_LINE_NO: {NotNull, bigint(19)}
     * @param soLineNo The value of soLineNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoLineNo_LessEqual(Long soLineNo) {
        regSoLineNo(CK_LE, soLineNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SO_LINE_NO: {NotNull, bigint(19)}
     * @param minNumber The min number of soLineNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of soLineNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSoLineNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSoLineNo(), "SO_LINE_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SO_LINE_NO: {NotNull, bigint(19)}
     * @param soLineNoList The collection of soLineNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoLineNo_InScope(Collection<Long> soLineNoList) {
        doSetSoLineNo_InScope(soLineNoList);
    }

    protected void doSetSoLineNo_InScope(Collection<Long> soLineNoList) {
        regINS(CK_INS, cTL(soLineNoList), xgetCValueSoLineNo(), "SO_LINE_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SO_LINE_NO: {NotNull, bigint(19)}
     * @param soLineNoList The collection of soLineNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoLineNo_NotInScope(Collection<Long> soLineNoList) {
        doSetSoLineNo_NotInScope(soLineNoList);
    }

    protected void doSetSoLineNo_NotInScope(Collection<Long> soLineNoList) {
        regINS(CK_NINS, cTL(soLineNoList), xgetCValueSoLineNo(), "SO_LINE_NO");
    }

    protected void regSoLineNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSoLineNo(), "SO_LINE_NO"); }
    protected abstract ConditionValue xgetCValueSoLineNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)} <br>
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_Equal(String ifitemCd) {
        doSetIfitemCd_Equal(fRES(ifitemCd));
    }

    protected void doSetIfitemCd_Equal(String ifitemCd) {
        regIfitemCd(CK_EQ, ifitemCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_NotEqual(String ifitemCd) {
        doSetIfitemCd_NotEqual(fRES(ifitemCd));
    }

    protected void doSetIfitemCd_NotEqual(String ifitemCd) {
        regIfitemCd(CK_NES, ifitemCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_GreaterThan(String ifitemCd) {
        regIfitemCd(CK_GT, fRES(ifitemCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_LessThan(String ifitemCd) {
        regIfitemCd(CK_LT, fRES(ifitemCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_GreaterEqual(String ifitemCd) {
        regIfitemCd(CK_GE, fRES(ifitemCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_LessEqual(String ifitemCd) {
        regIfitemCd(CK_LE, fRES(ifitemCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCdList The collection of ifitemCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_InScope(Collection<String> ifitemCdList) {
        doSetIfitemCd_InScope(ifitemCdList);
    }

    protected void doSetIfitemCd_InScope(Collection<String> ifitemCdList) {
        regINS(CK_INS, cTL(ifitemCdList), xgetCValueIfitemCd(), "IFITEM_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCdList The collection of ifitemCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_NotInScope(Collection<String> ifitemCdList) {
        doSetIfitemCd_NotInScope(ifitemCdList);
    }

    protected void doSetIfitemCd_NotInScope(Collection<String> ifitemCdList) {
        regINS(CK_NINS, cTL(ifitemCdList), xgetCValueIfitemCd(), "IFITEM_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEM_CD: {varchar(30)} <br>
     * <pre>e.g. setIfitemCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ifitemCd The value of ifitemCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIfitemCd_LikeSearch(String ifitemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ifitemCd), xgetCValueIfitemCd(), "IFITEM_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIfitemCd_NotLikeSearch(String ifitemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ifitemCd), xgetCValueIfitemCd(), "IFITEM_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_PrefixSearch(String ifitemCd) {
        setIfitemCd_LikeSearch(ifitemCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     */
    public void setIfitemCd_IsNull() { regIfitemCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     */
    public void setIfitemCd_IsNullOrEmpty() { regIfitemCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     */
    public void setIfitemCd_IsNotNull() { regIfitemCd(CK_ISNN, DOBJ); }

    protected void regIfitemCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIfitemCd(), "IFITEM_CD"); }
    protected abstract ConditionValue xgetCValueIfitemCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
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
     * LOCATION_ID: {NotNull, bigint(19)}
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
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
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
     * LOCATION_ID: {NotNull, bigint(19)}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<Long> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<Long> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {IX+, NotNull, varchar(30)}
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
     * LOCATION_CD: {IX+, NotNull, varchar(30)}
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
     * LOCATION_CD: {IX+, NotNull, varchar(30)}
     * @param locationCd The value of locationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterThan(String locationCd) {
        regLocationCd(CK_GT, fRES(locationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {IX+, NotNull, varchar(30)}
     * @param locationCd The value of locationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessThan(String locationCd) {
        regLocationCd(CK_LT, fRES(locationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {IX+, NotNull, varchar(30)}
     * @param locationCd The value of locationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterEqual(String locationCd) {
        regLocationCd(CK_GE, fRES(locationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {IX+, NotNull, varchar(30)}
     * @param locationCd The value of locationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessEqual(String locationCd) {
        regLocationCd(CK_LE, fRES(locationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {IX+, NotNull, varchar(30)}
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
     * LOCATION_CD: {IX+, NotNull, varchar(30)}
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
     * LOCATION_CD: {IX+, NotNull, varchar(30)} <br>
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
     * LOCATION_CD: {IX+, NotNull, varchar(30)}
     * @param locationCd The value of locationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd_NotLikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {IX+, NotNull, varchar(30)}
     * @param locationCd The value of locationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        setLocationCd_LikeSearch(locationCd, xcLSOPPre());
    }

    protected void regLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd(), "LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueLocationCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param damageFlg The value of damageFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageFlg_Equal(Long damageFlg) {
        doSetDamageFlg_Equal(damageFlg);
    }

    protected void doSetDamageFlg_Equal(Long damageFlg) {
        regDamageFlg(CK_EQ, damageFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param damageFlg The value of damageFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageFlg_NotEqual(Long damageFlg) {
        doSetDamageFlg_NotEqual(damageFlg);
    }

    protected void doSetDamageFlg_NotEqual(Long damageFlg) {
        regDamageFlg(CK_NES, damageFlg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param damageFlg The value of damageFlg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageFlg_GreaterThan(Long damageFlg) {
        regDamageFlg(CK_GT, damageFlg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param damageFlg The value of damageFlg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageFlg_LessThan(Long damageFlg) {
        regDamageFlg(CK_LT, damageFlg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param damageFlg The value of damageFlg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageFlg_GreaterEqual(Long damageFlg) {
        regDamageFlg(CK_GE, damageFlg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param damageFlg The value of damageFlg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageFlg_LessEqual(Long damageFlg) {
        regDamageFlg(CK_LE, damageFlg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of damageFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of damageFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDamageFlg_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDamageFlg(), "DAMAGE_FLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param damageFlgList The collection of damageFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageFlg_InScope(Collection<Long> damageFlgList) {
        doSetDamageFlg_InScope(damageFlgList);
    }

    protected void doSetDamageFlg_InScope(Collection<Long> damageFlgList) {
        regINS(CK_INS, cTL(damageFlgList), xgetCValueDamageFlg(), "DAMAGE_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param damageFlgList The collection of damageFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageFlg_NotInScope(Collection<Long> damageFlgList) {
        doSetDamageFlg_NotInScope(damageFlgList);
    }

    protected void doSetDamageFlg_NotInScope(Collection<Long> damageFlgList) {
        regINS(CK_NINS, cTL(damageFlgList), xgetCValueDamageFlg(), "DAMAGE_FLG");
    }

    protected void regDamageFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDamageFlg(), "DAMAGE_FLG"); }
    protected abstract ConditionValue xgetCValueDamageFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param noShippingFlg The value of noShippingFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoShippingFlg_Equal(Long noShippingFlg) {
        doSetNoShippingFlg_Equal(noShippingFlg);
    }

    protected void doSetNoShippingFlg_Equal(Long noShippingFlg) {
        regNoShippingFlg(CK_EQ, noShippingFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param noShippingFlg The value of noShippingFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoShippingFlg_NotEqual(Long noShippingFlg) {
        doSetNoShippingFlg_NotEqual(noShippingFlg);
    }

    protected void doSetNoShippingFlg_NotEqual(Long noShippingFlg) {
        regNoShippingFlg(CK_NES, noShippingFlg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param noShippingFlg The value of noShippingFlg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoShippingFlg_GreaterThan(Long noShippingFlg) {
        regNoShippingFlg(CK_GT, noShippingFlg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param noShippingFlg The value of noShippingFlg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoShippingFlg_LessThan(Long noShippingFlg) {
        regNoShippingFlg(CK_LT, noShippingFlg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param noShippingFlg The value of noShippingFlg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoShippingFlg_GreaterEqual(Long noShippingFlg) {
        regNoShippingFlg(CK_GE, noShippingFlg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param noShippingFlg The value of noShippingFlg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoShippingFlg_LessEqual(Long noShippingFlg) {
        regNoShippingFlg(CK_LE, noShippingFlg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of noShippingFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of noShippingFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNoShippingFlg_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNoShippingFlg(), "NO_SHIPPING_FLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param noShippingFlgList The collection of noShippingFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoShippingFlg_InScope(Collection<Long> noShippingFlgList) {
        doSetNoShippingFlg_InScope(noShippingFlgList);
    }

    protected void doSetNoShippingFlg_InScope(Collection<Long> noShippingFlgList) {
        regINS(CK_INS, cTL(noShippingFlgList), xgetCValueNoShippingFlg(), "NO_SHIPPING_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param noShippingFlgList The collection of noShippingFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoShippingFlg_NotInScope(Collection<Long> noShippingFlgList) {
        doSetNoShippingFlg_NotInScope(noShippingFlgList);
    }

    protected void doSetNoShippingFlg_NotInScope(Collection<Long> noShippingFlgList) {
        regINS(CK_NINS, cTL(noShippingFlgList), xgetCValueNoShippingFlg(), "NO_SHIPPING_FLG");
    }

    protected void regNoShippingFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoShippingFlg(), "NO_SHIPPING_FLG"); }
    protected abstract ConditionValue xgetCValueNoShippingFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
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
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
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
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param expectQty The value of expectQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_GreaterThan(Long expectQty) {
        regExpectQty(CK_GT, expectQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param expectQty The value of expectQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_LessThan(Long expectQty) {
        regExpectQty(CK_LT, expectQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param expectQty The value of expectQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_GreaterEqual(Long expectQty) {
        regExpectQty(CK_GE, expectQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param expectQty The value of expectQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_LessEqual(Long expectQty) {
        regExpectQty(CK_LE, expectQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of expectQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expectQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExpectQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpectQty(), "EXPECT_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
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
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param allocQty The value of allocQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocQty_Equal(Long allocQty) {
        doSetAllocQty_Equal(allocQty);
    }

    protected void doSetAllocQty_Equal(Long allocQty) {
        regAllocQty(CK_EQ, allocQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param allocQty The value of allocQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocQty_NotEqual(Long allocQty) {
        doSetAllocQty_NotEqual(allocQty);
    }

    protected void doSetAllocQty_NotEqual(Long allocQty) {
        regAllocQty(CK_NES, allocQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param allocQty The value of allocQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocQty_GreaterThan(Long allocQty) {
        regAllocQty(CK_GT, allocQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param allocQty The value of allocQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocQty_LessThan(Long allocQty) {
        regAllocQty(CK_LT, allocQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param allocQty The value of allocQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocQty_GreaterEqual(Long allocQty) {
        regAllocQty(CK_GE, allocQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param allocQty The value of allocQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocQty_LessEqual(Long allocQty) {
        regAllocQty(CK_LE, allocQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of allocQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocQty(), "ALLOC_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param allocQtyList The collection of allocQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocQty_InScope(Collection<Long> allocQtyList) {
        doSetAllocQty_InScope(allocQtyList);
    }

    protected void doSetAllocQty_InScope(Collection<Long> allocQtyList) {
        regINS(CK_INS, cTL(allocQtyList), xgetCValueAllocQty(), "ALLOC_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param allocQtyList The collection of allocQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocQty_NotInScope(Collection<Long> allocQtyList) {
        doSetAllocQty_NotInScope(allocQtyList);
    }

    protected void doSetAllocQty_NotInScope(Collection<Long> allocQtyList) {
        regINS(CK_NINS, cTL(allocQtyList), xgetCValueAllocQty(), "ALLOC_QTY");
    }

    protected void regAllocQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocQty(), "ALLOC_QTY"); }
    protected abstract ConditionValue xgetCValueAllocQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQty The value of pickedQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedQty_Equal(Long pickedQty) {
        doSetPickedQty_Equal(pickedQty);
    }

    protected void doSetPickedQty_Equal(Long pickedQty) {
        regPickedQty(CK_EQ, pickedQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQty The value of pickedQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedQty_NotEqual(Long pickedQty) {
        doSetPickedQty_NotEqual(pickedQty);
    }

    protected void doSetPickedQty_NotEqual(Long pickedQty) {
        regPickedQty(CK_NES, pickedQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQty The value of pickedQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedQty_GreaterThan(Long pickedQty) {
        regPickedQty(CK_GT, pickedQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQty The value of pickedQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedQty_LessThan(Long pickedQty) {
        regPickedQty(CK_LT, pickedQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQty The value of pickedQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedQty_GreaterEqual(Long pickedQty) {
        regPickedQty(CK_GE, pickedQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQty The value of pickedQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedQty_LessEqual(Long pickedQty) {
        regPickedQty(CK_LE, pickedQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of pickedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickedQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickedQty(), "PICKED_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQtyList The collection of pickedQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedQty_InScope(Collection<Long> pickedQtyList) {
        doSetPickedQty_InScope(pickedQtyList);
    }

    protected void doSetPickedQty_InScope(Collection<Long> pickedQtyList) {
        regINS(CK_INS, cTL(pickedQtyList), xgetCValuePickedQty(), "PICKED_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQtyList The collection of pickedQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedQty_NotInScope(Collection<Long> pickedQtyList) {
        doSetPickedQty_NotInScope(pickedQtyList);
    }

    protected void doSetPickedQty_NotInScope(Collection<Long> pickedQtyList) {
        regINS(CK_NINS, cTL(pickedQtyList), xgetCValuePickedQty(), "PICKED_QTY");
    }

    protected void regPickedQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickedQty(), "PICKED_QTY"); }
    protected abstract ConditionValue xgetCValuePickedQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQty The value of sortedQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_Equal(Long sortedQty) {
        doSetSortedQty_Equal(sortedQty);
    }

    protected void doSetSortedQty_Equal(Long sortedQty) {
        regSortedQty(CK_EQ, sortedQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQty The value of sortedQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_NotEqual(Long sortedQty) {
        doSetSortedQty_NotEqual(sortedQty);
    }

    protected void doSetSortedQty_NotEqual(Long sortedQty) {
        regSortedQty(CK_NES, sortedQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQty The value of sortedQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_GreaterThan(Long sortedQty) {
        regSortedQty(CK_GT, sortedQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQty The value of sortedQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_LessThan(Long sortedQty) {
        regSortedQty(CK_LT, sortedQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQty The value of sortedQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_GreaterEqual(Long sortedQty) {
        regSortedQty(CK_GE, sortedQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQty The value of sortedQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_LessEqual(Long sortedQty) {
        regSortedQty(CK_LE, sortedQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of sortedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortedQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortedQty(), "SORTED_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQtyList The collection of sortedQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedQty_InScope(Collection<Long> sortedQtyList) {
        doSetSortedQty_InScope(sortedQtyList);
    }

    protected void doSetSortedQty_InScope(Collection<Long> sortedQtyList) {
        regINS(CK_INS, cTL(sortedQtyList), xgetCValueSortedQty(), "SORTED_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQtyList The collection of sortedQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedQty_NotInScope(Collection<Long> sortedQtyList) {
        doSetSortedQty_NotInScope(sortedQtyList);
    }

    protected void doSetSortedQty_NotInScope(Collection<Long> sortedQtyList) {
        regINS(CK_NINS, cTL(sortedQtyList), xgetCValueSortedQty(), "SORTED_QTY");
    }

    protected void regSortedQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortedQty(), "SORTED_QTY"); }
    protected abstract ConditionValue xgetCValueSortedQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedQty The value of inspectedQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedQty_Equal(Long inspectedQty) {
        doSetInspectedQty_Equal(inspectedQty);
    }

    protected void doSetInspectedQty_Equal(Long inspectedQty) {
        regInspectedQty(CK_EQ, inspectedQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedQty The value of inspectedQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedQty_NotEqual(Long inspectedQty) {
        doSetInspectedQty_NotEqual(inspectedQty);
    }

    protected void doSetInspectedQty_NotEqual(Long inspectedQty) {
        regInspectedQty(CK_NES, inspectedQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedQty The value of inspectedQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedQty_GreaterThan(Long inspectedQty) {
        regInspectedQty(CK_GT, inspectedQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedQty The value of inspectedQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedQty_LessThan(Long inspectedQty) {
        regInspectedQty(CK_LT, inspectedQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedQty The value of inspectedQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedQty_GreaterEqual(Long inspectedQty) {
        regInspectedQty(CK_GE, inspectedQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedQty The value of inspectedQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectedQty_LessEqual(Long inspectedQty) {
        regInspectedQty(CK_LE, inspectedQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of inspectedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inspectedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInspectedQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInspectedQty(), "INSPECTED_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedQtyList The collection of inspectedQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedQty_InScope(Collection<Long> inspectedQtyList) {
        doSetInspectedQty_InScope(inspectedQtyList);
    }

    protected void doSetInspectedQty_InScope(Collection<Long> inspectedQtyList) {
        regINS(CK_INS, cTL(inspectedQtyList), xgetCValueInspectedQty(), "INSPECTED_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param inspectedQtyList The collection of inspectedQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedQty_NotInScope(Collection<Long> inspectedQtyList) {
        doSetInspectedQty_NotInScope(inspectedQtyList);
    }

    protected void doSetInspectedQty_NotInScope(Collection<Long> inspectedQtyList) {
        regINS(CK_NINS, cTL(inspectedQtyList), xgetCValueInspectedQty(), "INSPECTED_QTY");
    }

    protected void regInspectedQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectedQty(), "INSPECTED_QTY"); }
    protected abstract ConditionValue xgetCValueInspectedQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQty The value of shippedQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedQty_Equal(Long shippedQty) {
        doSetShippedQty_Equal(shippedQty);
    }

    protected void doSetShippedQty_Equal(Long shippedQty) {
        regShippedQty(CK_EQ, shippedQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQty The value of shippedQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedQty_NotEqual(Long shippedQty) {
        doSetShippedQty_NotEqual(shippedQty);
    }

    protected void doSetShippedQty_NotEqual(Long shippedQty) {
        regShippedQty(CK_NES, shippedQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQty The value of shippedQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedQty_GreaterThan(Long shippedQty) {
        regShippedQty(CK_GT, shippedQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQty The value of shippedQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedQty_LessThan(Long shippedQty) {
        regShippedQty(CK_LT, shippedQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQty The value of shippedQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedQty_GreaterEqual(Long shippedQty) {
        regShippedQty(CK_GE, shippedQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQty The value of shippedQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedQty_LessEqual(Long shippedQty) {
        regShippedQty(CK_LE, shippedQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of shippedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippedQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippedQty(), "SHIPPED_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQtyList The collection of shippedQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedQty_InScope(Collection<Long> shippedQtyList) {
        doSetShippedQty_InScope(shippedQtyList);
    }

    protected void doSetShippedQty_InScope(Collection<Long> shippedQtyList) {
        regINS(CK_INS, cTL(shippedQtyList), xgetCValueShippedQty(), "SHIPPED_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQtyList The collection of shippedQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedQty_NotInScope(Collection<Long> shippedQtyList) {
        doSetShippedQty_NotInScope(shippedQtyList);
    }

    protected void doSetShippedQty_NotInScope(Collection<Long> shippedQtyList) {
        regINS(CK_NINS, cTL(shippedQtyList), xgetCValueShippedQty(), "SHIPPED_QTY");
    }

    protected void regShippedQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippedQty(), "SHIPPED_QTY"); }
    protected abstract ConditionValue xgetCValueShippedQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUST_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustQty The value of adjustQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustQty_Equal(Long adjustQty) {
        doSetAdjustQty_Equal(adjustQty);
    }

    protected void doSetAdjustQty_Equal(Long adjustQty) {
        regAdjustQty(CK_EQ, adjustQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUST_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustQty The value of adjustQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustQty_NotEqual(Long adjustQty) {
        doSetAdjustQty_NotEqual(adjustQty);
    }

    protected void doSetAdjustQty_NotEqual(Long adjustQty) {
        regAdjustQty(CK_NES, adjustQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUST_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustQty The value of adjustQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustQty_GreaterThan(Long adjustQty) {
        regAdjustQty(CK_GT, adjustQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUST_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustQty The value of adjustQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustQty_LessThan(Long adjustQty) {
        regAdjustQty(CK_LT, adjustQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUST_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustQty The value of adjustQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustQty_GreaterEqual(Long adjustQty) {
        regAdjustQty(CK_GE, adjustQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUST_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustQty The value of adjustQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustQty_LessEqual(Long adjustQty) {
        regAdjustQty(CK_LE, adjustQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUST_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of adjustQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustQty(), "ADJUST_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUST_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustQtyList The collection of adjustQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustQty_InScope(Collection<Long> adjustQtyList) {
        doSetAdjustQty_InScope(adjustQtyList);
    }

    protected void doSetAdjustQty_InScope(Collection<Long> adjustQtyList) {
        regINS(CK_INS, cTL(adjustQtyList), xgetCValueAdjustQty(), "ADJUST_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUST_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustQtyList The collection of adjustQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustQty_NotInScope(Collection<Long> adjustQtyList) {
        doSetAdjustQty_NotInScope(adjustQtyList);
    }

    protected void doSetAdjustQty_NotInScope(Collection<Long> adjustQtyList) {
        regINS(CK_NINS, cTL(adjustQtyList), xgetCValueAdjustQty(), "ADJUST_QTY");
    }

    protected void regAdjustQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustQty(), "ADJUST_QTY"); }
    protected abstract ConditionValue xgetCValueAdjustQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOC_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param locFlg The value of locFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocFlg_Equal(Long locFlg) {
        doSetLocFlg_Equal(locFlg);
    }

    protected void doSetLocFlg_Equal(Long locFlg) {
        regLocFlg(CK_EQ, locFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOC_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param locFlg The value of locFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocFlg_NotEqual(Long locFlg) {
        doSetLocFlg_NotEqual(locFlg);
    }

    protected void doSetLocFlg_NotEqual(Long locFlg) {
        regLocFlg(CK_NES, locFlg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOC_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param locFlg The value of locFlg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocFlg_GreaterThan(Long locFlg) {
        regLocFlg(CK_GT, locFlg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOC_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param locFlg The value of locFlg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocFlg_LessThan(Long locFlg) {
        regLocFlg(CK_LT, locFlg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOC_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param locFlg The value of locFlg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocFlg_GreaterEqual(Long locFlg) {
        regLocFlg(CK_GE, locFlg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOC_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param locFlg The value of locFlg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocFlg_LessEqual(Long locFlg) {
        regLocFlg(CK_LE, locFlg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOC_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of locFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocFlg_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocFlg(), "LOC_FLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOC_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param locFlgList The collection of locFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocFlg_InScope(Collection<Long> locFlgList) {
        doSetLocFlg_InScope(locFlgList);
    }

    protected void doSetLocFlg_InScope(Collection<Long> locFlgList) {
        regINS(CK_INS, cTL(locFlgList), xgetCValueLocFlg(), "LOC_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOC_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param locFlgList The collection of locFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocFlg_NotInScope(Collection<Long> locFlgList) {
        doSetLocFlg_NotInScope(locFlgList);
    }

    protected void doSetLocFlg_NotInScope(Collection<Long> locFlgList) {
        regINS(CK_NINS, cTL(locFlgList), xgetCValueLocFlg(), "LOC_FLG");
    }

    protected void regLocFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocFlg(), "LOC_FLG"); }
    protected abstract ConditionValue xgetCValueLocFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param stdDifFlg The value of stdDifFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStdDifFlg_Equal(Long stdDifFlg) {
        doSetStdDifFlg_Equal(stdDifFlg);
    }

    protected void doSetStdDifFlg_Equal(Long stdDifFlg) {
        regStdDifFlg(CK_EQ, stdDifFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param stdDifFlg The value of stdDifFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStdDifFlg_NotEqual(Long stdDifFlg) {
        doSetStdDifFlg_NotEqual(stdDifFlg);
    }

    protected void doSetStdDifFlg_NotEqual(Long stdDifFlg) {
        regStdDifFlg(CK_NES, stdDifFlg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param stdDifFlg The value of stdDifFlg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStdDifFlg_GreaterThan(Long stdDifFlg) {
        regStdDifFlg(CK_GT, stdDifFlg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param stdDifFlg The value of stdDifFlg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStdDifFlg_LessThan(Long stdDifFlg) {
        regStdDifFlg(CK_LT, stdDifFlg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param stdDifFlg The value of stdDifFlg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStdDifFlg_GreaterEqual(Long stdDifFlg) {
        regStdDifFlg(CK_GE, stdDifFlg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param stdDifFlg The value of stdDifFlg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStdDifFlg_LessEqual(Long stdDifFlg) {
        regStdDifFlg(CK_LE, stdDifFlg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of stdDifFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stdDifFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStdDifFlg_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStdDifFlg(), "STD_DIF_FLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param stdDifFlgList The collection of stdDifFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStdDifFlg_InScope(Collection<Long> stdDifFlgList) {
        doSetStdDifFlg_InScope(stdDifFlgList);
    }

    protected void doSetStdDifFlg_InScope(Collection<Long> stdDifFlgList) {
        regINS(CK_INS, cTL(stdDifFlgList), xgetCValueStdDifFlg(), "STD_DIF_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]}
     * @param stdDifFlgList The collection of stdDifFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStdDifFlg_NotInScope(Collection<Long> stdDifFlgList) {
        doSetStdDifFlg_NotInScope(stdDifFlgList);
    }

    protected void doSetStdDifFlg_NotInScope(Collection<Long> stdDifFlgList) {
        regINS(CK_NINS, cTL(stdDifFlgList), xgetCValueStdDifFlg(), "STD_DIF_FLG");
    }

    protected void regStdDifFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStdDifFlg(), "STD_DIF_FLG"); }
    protected abstract ConditionValue xgetCValueStdDifFlg();

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
    public HpSLCFunction<TYtrsodetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TYtrsodetailCB.class);
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
    public HpSLCFunction<TYtrsodetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TYtrsodetailCB.class);
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
    public HpSLCFunction<TYtrsodetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TYtrsodetailCB.class);
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
    public HpSLCFunction<TYtrsodetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TYtrsodetailCB.class);
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
    public HpSLCFunction<TYtrsodetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TYtrsodetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TYtrsodetailCB&gt;() {
     *     public void query(TYtrsodetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TYtrsodetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TYtrsodetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TYtrsodetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TYtrsodetailCQ sq);

    protected TYtrsodetailCB xcreateScalarConditionCB() {
        TYtrsodetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TYtrsodetailCB xcreateScalarConditionPartitionByCB() {
        TYtrsodetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TYtrsodetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRSODETAIL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TYtrsodetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TYtrsodetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TYtrsodetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRSODETAIL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TYtrsodetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TYtrsodetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TYtrsodetailCQ sq);

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
    protected TYtrsodetailCB newMyCB() {
        return new TYtrsodetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TYtrsodetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

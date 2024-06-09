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
 * The abstract condition-query of T_STOCK_INOUT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTStockInoutCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTStockInoutCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_STOCK_INOUT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutId The value of stockInoutId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutId_Equal(Long stockInoutId) {
        doSetStockInoutId_Equal(stockInoutId);
    }

    protected void doSetStockInoutId_Equal(Long stockInoutId) {
        regStockInoutId(CK_EQ, stockInoutId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutId The value of stockInoutId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutId_NotEqual(Long stockInoutId) {
        doSetStockInoutId_NotEqual(stockInoutId);
    }

    protected void doSetStockInoutId_NotEqual(Long stockInoutId) {
        regStockInoutId(CK_NES, stockInoutId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutId The value of stockInoutId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutId_GreaterThan(Long stockInoutId) {
        regStockInoutId(CK_GT, stockInoutId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutId The value of stockInoutId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutId_LessThan(Long stockInoutId) {
        regStockInoutId(CK_LT, stockInoutId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutId The value of stockInoutId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutId_GreaterEqual(Long stockInoutId) {
        regStockInoutId(CK_GE, stockInoutId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutId The value of stockInoutId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutId_LessEqual(Long stockInoutId) {
        regStockInoutId(CK_LE, stockInoutId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of stockInoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockInoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockInoutId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockInoutId(), "STOCK_INOUT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutIdList The collection of stockInoutId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockInoutId_InScope(Collection<Long> stockInoutIdList) {
        doSetStockInoutId_InScope(stockInoutIdList);
    }

    protected void doSetStockInoutId_InScope(Collection<Long> stockInoutIdList) {
        regINS(CK_INS, cTL(stockInoutIdList), xgetCValueStockInoutId(), "STOCK_INOUT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param stockInoutIdList The collection of stockInoutId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockInoutId_NotInScope(Collection<Long> stockInoutIdList) {
        doSetStockInoutId_NotInScope(stockInoutIdList);
    }

    protected void doSetStockInoutId_NotInScope(Collection<Long> stockInoutIdList) {
        regINS(CK_NINS, cTL(stockInoutIdList), xgetCValueStockInoutId(), "STOCK_INOUT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select BF_STOCK_INOUT_ID from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStockInoutByBfStockInoutIdSelfList</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStockInoutByBfStockInoutIdSelfList for 'exists'. (NotNull)
     */
    public void existsTStockInoutByBfStockInoutIdSelfList(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockInoutId_ExistsReferrer_TStockInoutByBfStockInoutIdSelfList(cb.query());
        registerExistsReferrer(cb.query(), "STOCK_INOUT_ID", "BF_STOCK_INOUT_ID", pp, "tStockInoutByBfStockInoutIdSelfList");
    }
    public abstract String keepStockInoutId_ExistsReferrer_TStockInoutByBfStockInoutIdSelfList(TStockInoutCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select FS_STOCK_INOUT_ID from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStockInoutByFsStockInoutIdSelfList</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStockInoutByFsStockInoutIdSelfList for 'exists'. (NotNull)
     */
    public void existsTStockInoutByFsStockInoutIdSelfList(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockInoutId_ExistsReferrer_TStockInoutByFsStockInoutIdSelfList(cb.query());
        registerExistsReferrer(cb.query(), "STOCK_INOUT_ID", "FS_STOCK_INOUT_ID", pp, "tStockInoutByFsStockInoutIdSelfList");
    }
    public abstract String keepStockInoutId_ExistsReferrer_TStockInoutByFsStockInoutIdSelfList(TStockInoutCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select BF_STOCK_INOUT_ID from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockInoutByBfStockInoutIdSelfList</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StockInoutId_NotExistsReferrer_TStockInoutByBfStockInoutIdSelfList for 'not exists'. (NotNull)
     */
    public void notExistsTStockInoutByBfStockInoutIdSelfList(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockInoutId_NotExistsReferrer_TStockInoutByBfStockInoutIdSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "STOCK_INOUT_ID", "BF_STOCK_INOUT_ID", pp, "tStockInoutByBfStockInoutIdSelfList");
    }
    public abstract String keepStockInoutId_NotExistsReferrer_TStockInoutByBfStockInoutIdSelfList(TStockInoutCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select FS_STOCK_INOUT_ID from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockInoutByFsStockInoutIdSelfList</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StockInoutId_NotExistsReferrer_TStockInoutByFsStockInoutIdSelfList for 'not exists'. (NotNull)
     */
    public void notExistsTStockInoutByFsStockInoutIdSelfList(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStockInoutId_NotExistsReferrer_TStockInoutByFsStockInoutIdSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "STOCK_INOUT_ID", "FS_STOCK_INOUT_ID", pp, "tStockInoutByFsStockInoutIdSelfList");
    }
    public abstract String keepStockInoutId_NotExistsReferrer_TStockInoutByFsStockInoutIdSelfList(TStockInoutCQ sq);

    public void xsderiveTStockInoutByBfStockInoutIdSelfList(String fn, SubQuery<TStockInoutCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepStockInoutId_SpecifyDerivedReferrer_TStockInoutByBfStockInoutIdSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "STOCK_INOUT_ID", "BF_STOCK_INOUT_ID", pp, "tStockInoutByBfStockInoutIdSelfList", al, op);
    }
    public abstract String keepStockInoutId_SpecifyDerivedReferrer_TStockInoutByBfStockInoutIdSelfList(TStockInoutCQ sq);

    public void xsderiveTStockInoutByFsStockInoutIdSelfList(String fn, SubQuery<TStockInoutCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepStockInoutId_SpecifyDerivedReferrer_TStockInoutByFsStockInoutIdSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "STOCK_INOUT_ID", "FS_STOCK_INOUT_ID", pp, "tStockInoutByFsStockInoutIdSelfList", al, op);
    }
    public abstract String keepStockInoutId_SpecifyDerivedReferrer_TStockInoutByFsStockInoutIdSelfList(TStockInoutCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStockInoutByBfStockInoutIdSelfList()</span>.<span style="color: #CC4747">max</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inoutCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStockInoutCB> derivedTStockInoutByBfStockInoutIdSelfList() {
        return xcreateQDRFunctionTStockInoutByBfStockInoutIdSelfList();
    }
    protected HpQDRFunction<TStockInoutCB> xcreateQDRFunctionTStockInoutByBfStockInoutIdSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStockInoutByBfStockInoutIdSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStockInoutByBfStockInoutIdSelfList(String fn, SubQuery<TStockInoutCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepStockInoutId_QueryDerivedReferrer_TStockInoutByBfStockInoutIdSelfList(cb.query()); String prpp = keepStockInoutId_QueryDerivedReferrer_TStockInoutByBfStockInoutIdSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "STOCK_INOUT_ID", "BF_STOCK_INOUT_ID", sqpp, "tStockInoutByBfStockInoutIdSelfList", rd, vl, prpp, op);
    }
    public abstract String keepStockInoutId_QueryDerivedReferrer_TStockInoutByBfStockInoutIdSelfList(TStockInoutCQ sq);
    public abstract String keepStockInoutId_QueryDerivedReferrer_TStockInoutByBfStockInoutIdSelfListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_STOCK_INOUT where ...)} <br>
     * T_STOCK_INOUT by FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStockInoutByFsStockInoutIdSelfList()</span>.<span style="color: #CC4747">max</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inoutCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStockInoutCB> derivedTStockInoutByFsStockInoutIdSelfList() {
        return xcreateQDRFunctionTStockInoutByFsStockInoutIdSelfList();
    }
    protected HpQDRFunction<TStockInoutCB> xcreateQDRFunctionTStockInoutByFsStockInoutIdSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStockInoutByFsStockInoutIdSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStockInoutByFsStockInoutIdSelfList(String fn, SubQuery<TStockInoutCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepStockInoutId_QueryDerivedReferrer_TStockInoutByFsStockInoutIdSelfList(cb.query()); String prpp = keepStockInoutId_QueryDerivedReferrer_TStockInoutByFsStockInoutIdSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "STOCK_INOUT_ID", "FS_STOCK_INOUT_ID", sqpp, "tStockInoutByFsStockInoutIdSelfList", rd, vl, prpp, op);
    }
    public abstract String keepStockInoutId_QueryDerivedReferrer_TStockInoutByFsStockInoutIdSelfList(TStockInoutCQ sq);
    public abstract String keepStockInoutId_QueryDerivedReferrer_TStockInoutByFsStockInoutIdSelfListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setStockInoutId_IsNull() { regStockInoutId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_INOUT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setStockInoutId_IsNotNull() { regStockInoutId(CK_ISNN, DOBJ); }

    protected void regStockInoutId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockInoutId(), "STOCK_INOUT_ID"); }
    protected abstract ConditionValue xgetCValueStockInoutId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param fsStockInoutId The value of fsStockInoutId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFsStockInoutId_Equal(Long fsStockInoutId) {
        doSetFsStockInoutId_Equal(fsStockInoutId);
    }

    protected void doSetFsStockInoutId_Equal(Long fsStockInoutId) {
        regFsStockInoutId(CK_EQ, fsStockInoutId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param fsStockInoutId The value of fsStockInoutId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFsStockInoutId_NotEqual(Long fsStockInoutId) {
        doSetFsStockInoutId_NotEqual(fsStockInoutId);
    }

    protected void doSetFsStockInoutId_NotEqual(Long fsStockInoutId) {
        regFsStockInoutId(CK_NES, fsStockInoutId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param fsStockInoutId The value of fsStockInoutId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFsStockInoutId_GreaterThan(Long fsStockInoutId) {
        regFsStockInoutId(CK_GT, fsStockInoutId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param fsStockInoutId The value of fsStockInoutId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFsStockInoutId_LessThan(Long fsStockInoutId) {
        regFsStockInoutId(CK_LT, fsStockInoutId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param fsStockInoutId The value of fsStockInoutId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFsStockInoutId_GreaterEqual(Long fsStockInoutId) {
        regFsStockInoutId(CK_GE, fsStockInoutId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param fsStockInoutId The value of fsStockInoutId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFsStockInoutId_LessEqual(Long fsStockInoutId) {
        regFsStockInoutId(CK_LE, fsStockInoutId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param minNumber The min number of fsStockInoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fsStockInoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFsStockInoutId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFsStockInoutId(), "FS_STOCK_INOUT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param fsStockInoutIdList The collection of fsStockInoutId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFsStockInoutId_InScope(Collection<Long> fsStockInoutIdList) {
        doSetFsStockInoutId_InScope(fsStockInoutIdList);
    }

    protected void doSetFsStockInoutId_InScope(Collection<Long> fsStockInoutIdList) {
        regINS(CK_INS, cTL(fsStockInoutIdList), xgetCValueFsStockInoutId(), "FS_STOCK_INOUT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param fsStockInoutIdList The collection of fsStockInoutId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFsStockInoutId_NotInScope(Collection<Long> fsStockInoutIdList) {
        doSetFsStockInoutId_NotInScope(fsStockInoutIdList);
    }

    protected void doSetFsStockInoutId_NotInScope(Collection<Long> fsStockInoutIdList) {
        regINS(CK_NINS, cTL(fsStockInoutIdList), xgetCValueFsStockInoutId(), "FS_STOCK_INOUT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select FS_STOCK_INOUT_ID from T_STOCK_INOUT where ...)} <br />
     * T_STOCK_INOUT by my FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelf'.
     * @param subCBLambda The callback for sub-query of TStockInoutByFsStockInoutIdSelf for 'in-scope'. (NotNull)
     */
    public void inScopeTStockInoutByFsStockInoutIdSelf(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepFsStockInoutId_InScopeRelation_TStockInoutByFsStockInoutIdSelf(cb.query());
        registerInScopeRelation(cb.query(), "FS_STOCK_INOUT_ID", "STOCK_INOUT_ID", pp, "tStockInoutByFsStockInoutIdSelf", false);
    }
    public abstract String keepFsStockInoutId_InScopeRelation_TStockInoutByFsStockInoutIdSelf(TStockInoutCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select FS_STOCK_INOUT_ID from T_STOCK_INOUT where ...)} <br />
     * T_STOCK_INOUT by my FS_STOCK_INOUT_ID, named 'TStockInoutByFsStockInoutIdSelf'.
     * @param subCBLambda The callback for sub-query of TStockInoutByFsStockInoutIdSelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeTStockInoutByFsStockInoutIdSelf(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepFsStockInoutId_NotInScopeRelation_TStockInoutByFsStockInoutIdSelf(cb.query());
        registerInScopeRelation(cb.query(), "FS_STOCK_INOUT_ID", "STOCK_INOUT_ID", pp, "tStockInoutByFsStockInoutIdSelf", true);
    }
    public abstract String keepFsStockInoutId_NotInScopeRelation_TStockInoutByFsStockInoutIdSelf(TStockInoutCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     */
    public void setFsStockInoutId_IsNull() { regFsStockInoutId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FS_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     */
    public void setFsStockInoutId_IsNotNull() { regFsStockInoutId(CK_ISNN, DOBJ); }

    protected void regFsStockInoutId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFsStockInoutId(), "FS_STOCK_INOUT_ID"); }
    protected abstract ConditionValue xgetCValueFsStockInoutId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param bfStockInoutId The value of bfStockInoutId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBfStockInoutId_Equal(Long bfStockInoutId) {
        doSetBfStockInoutId_Equal(bfStockInoutId);
    }

    protected void doSetBfStockInoutId_Equal(Long bfStockInoutId) {
        regBfStockInoutId(CK_EQ, bfStockInoutId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param bfStockInoutId The value of bfStockInoutId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBfStockInoutId_NotEqual(Long bfStockInoutId) {
        doSetBfStockInoutId_NotEqual(bfStockInoutId);
    }

    protected void doSetBfStockInoutId_NotEqual(Long bfStockInoutId) {
        regBfStockInoutId(CK_NES, bfStockInoutId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param bfStockInoutId The value of bfStockInoutId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBfStockInoutId_GreaterThan(Long bfStockInoutId) {
        regBfStockInoutId(CK_GT, bfStockInoutId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param bfStockInoutId The value of bfStockInoutId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBfStockInoutId_LessThan(Long bfStockInoutId) {
        regBfStockInoutId(CK_LT, bfStockInoutId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param bfStockInoutId The value of bfStockInoutId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBfStockInoutId_GreaterEqual(Long bfStockInoutId) {
        regBfStockInoutId(CK_GE, bfStockInoutId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param bfStockInoutId The value of bfStockInoutId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBfStockInoutId_LessEqual(Long bfStockInoutId) {
        regBfStockInoutId(CK_LE, bfStockInoutId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param minNumber The min number of bfStockInoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bfStockInoutId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBfStockInoutId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBfStockInoutId(), "BF_STOCK_INOUT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param bfStockInoutIdList The collection of bfStockInoutId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBfStockInoutId_InScope(Collection<Long> bfStockInoutIdList) {
        doSetBfStockInoutId_InScope(bfStockInoutIdList);
    }

    protected void doSetBfStockInoutId_InScope(Collection<Long> bfStockInoutIdList) {
        regINS(CK_INS, cTL(bfStockInoutIdList), xgetCValueBfStockInoutId(), "BF_STOCK_INOUT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     * @param bfStockInoutIdList The collection of bfStockInoutId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBfStockInoutId_NotInScope(Collection<Long> bfStockInoutIdList) {
        doSetBfStockInoutId_NotInScope(bfStockInoutIdList);
    }

    protected void doSetBfStockInoutId_NotInScope(Collection<Long> bfStockInoutIdList) {
        regINS(CK_NINS, cTL(bfStockInoutIdList), xgetCValueBfStockInoutId(), "BF_STOCK_INOUT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BF_STOCK_INOUT_ID from T_STOCK_INOUT where ...)} <br />
     * T_STOCK_INOUT by my BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelf'.
     * @param subCBLambda The callback for sub-query of TStockInoutByBfStockInoutIdSelf for 'in-scope'. (NotNull)
     */
    public void inScopeTStockInoutByBfStockInoutIdSelf(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepBfStockInoutId_InScopeRelation_TStockInoutByBfStockInoutIdSelf(cb.query());
        registerInScopeRelation(cb.query(), "BF_STOCK_INOUT_ID", "STOCK_INOUT_ID", pp, "tStockInoutByBfStockInoutIdSelf", false);
    }
    public abstract String keepBfStockInoutId_InScopeRelation_TStockInoutByBfStockInoutIdSelf(TStockInoutCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BF_STOCK_INOUT_ID from T_STOCK_INOUT where ...)} <br />
     * T_STOCK_INOUT by my BF_STOCK_INOUT_ID, named 'TStockInoutByBfStockInoutIdSelf'.
     * @param subCBLambda The callback for sub-query of TStockInoutByBfStockInoutIdSelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeTStockInoutByBfStockInoutIdSelf(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepBfStockInoutId_NotInScopeRelation_TStockInoutByBfStockInoutIdSelf(cb.query());
        registerInScopeRelation(cb.query(), "BF_STOCK_INOUT_ID", "STOCK_INOUT_ID", pp, "tStockInoutByBfStockInoutIdSelf", true);
    }
    public abstract String keepBfStockInoutId_NotInScopeRelation_TStockInoutByBfStockInoutIdSelf(TStockInoutCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     */
    public void setBfStockInoutId_IsNull() { regBfStockInoutId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BF_STOCK_INOUT_ID: {IX, bigint(19), FK to T_STOCK_INOUT}
     */
    public void setBfStockInoutId_IsNotNull() { regBfStockInoutId(CK_ISNN, DOBJ); }

    protected void regBfStockInoutId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBfStockInoutId(), "BF_STOCK_INOUT_ID"); }
    protected abstract ConditionValue xgetCValueBfStockInoutId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
     * @param moveRecordBId The value of moveRecordBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveRecordBId_Equal(Long moveRecordBId) {
        doSetMoveRecordBId_Equal(moveRecordBId);
    }

    protected void doSetMoveRecordBId_Equal(Long moveRecordBId) {
        regMoveRecordBId(CK_EQ, moveRecordBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
     * @param moveRecordBId The value of moveRecordBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveRecordBId_NotEqual(Long moveRecordBId) {
        doSetMoveRecordBId_NotEqual(moveRecordBId);
    }

    protected void doSetMoveRecordBId_NotEqual(Long moveRecordBId) {
        regMoveRecordBId(CK_NES, moveRecordBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
     * @param moveRecordBId The value of moveRecordBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveRecordBId_GreaterThan(Long moveRecordBId) {
        regMoveRecordBId(CK_GT, moveRecordBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
     * @param moveRecordBId The value of moveRecordBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveRecordBId_LessThan(Long moveRecordBId) {
        regMoveRecordBId(CK_LT, moveRecordBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
     * @param moveRecordBId The value of moveRecordBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveRecordBId_GreaterEqual(Long moveRecordBId) {
        regMoveRecordBId(CK_GE, moveRecordBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
     * @param moveRecordBId The value of moveRecordBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveRecordBId_LessEqual(Long moveRecordBId) {
        regMoveRecordBId(CK_LE, moveRecordBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
     * @param minNumber The min number of moveRecordBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveRecordBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveRecordBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveRecordBId(), "MOVE_RECORD_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
     * @param moveRecordBIdList The collection of moveRecordBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveRecordBId_InScope(Collection<Long> moveRecordBIdList) {
        doSetMoveRecordBId_InScope(moveRecordBIdList);
    }

    protected void doSetMoveRecordBId_InScope(Collection<Long> moveRecordBIdList) {
        regINS(CK_INS, cTL(moveRecordBIdList), xgetCValueMoveRecordBId(), "MOVE_RECORD_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
     * @param moveRecordBIdList The collection of moveRecordBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveRecordBId_NotInScope(Collection<Long> moveRecordBIdList) {
        doSetMoveRecordBId_NotInScope(moveRecordBIdList);
    }

    protected void doSetMoveRecordBId_NotInScope(Collection<Long> moveRecordBIdList) {
        regINS(CK_NINS, cTL(moveRecordBIdList), xgetCValueMoveRecordBId(), "MOVE_RECORD_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MOVE_RECORD_B_ID from T_MOVE_RECORD_B where ...)} <br />
     * T_MOVE_RECORD_B by my MOVE_RECORD_B_ID, named 'TMoveRecordB'.
     * @param subCBLambda The callback for sub-query of TMoveRecordB for 'in-scope'. (NotNull)
     */
    public void inScopeTMoveRecordB(SubQuery<TMoveRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepMoveRecordBId_InScopeRelation_TMoveRecordB(cb.query());
        registerInScopeRelation(cb.query(), "MOVE_RECORD_B_ID", "MOVE_RECORD_B_ID", pp, "tMoveRecordB", false);
    }
    public abstract String keepMoveRecordBId_InScopeRelation_TMoveRecordB(TMoveRecordBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MOVE_RECORD_B_ID from T_MOVE_RECORD_B where ...)} <br />
     * T_MOVE_RECORD_B by my MOVE_RECORD_B_ID, named 'TMoveRecordB'.
     * @param subCBLambda The callback for sub-query of TMoveRecordB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTMoveRecordB(SubQuery<TMoveRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveRecordBCB cb = new TMoveRecordBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepMoveRecordBId_NotInScopeRelation_TMoveRecordB(cb.query());
        registerInScopeRelation(cb.query(), "MOVE_RECORD_B_ID", "MOVE_RECORD_B_ID", pp, "tMoveRecordB", true);
    }
    public abstract String keepMoveRecordBId_NotInScopeRelation_TMoveRecordB(TMoveRecordBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
     */
    public void setMoveRecordBId_IsNull() { regMoveRecordBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVE_RECORD_B_ID: {IX, bigint(19), FK to T_MOVE_RECORD_B}
     */
    public void setMoveRecordBId_IsNotNull() { regMoveRecordBId(CK_ISNN, DOBJ); }

    protected void regMoveRecordBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveRecordBId(), "MOVE_RECORD_B_ID"); }
    protected abstract ConditionValue xgetCValueMoveRecordBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
     * @param storeRecordBId The value of storeRecordBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_Equal(Long storeRecordBId) {
        doSetStoreRecordBId_Equal(storeRecordBId);
    }

    protected void doSetStoreRecordBId_Equal(Long storeRecordBId) {
        regStoreRecordBId(CK_EQ, storeRecordBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
     * @param storeRecordBId The value of storeRecordBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_NotEqual(Long storeRecordBId) {
        doSetStoreRecordBId_NotEqual(storeRecordBId);
    }

    protected void doSetStoreRecordBId_NotEqual(Long storeRecordBId) {
        regStoreRecordBId(CK_NES, storeRecordBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
     * @param storeRecordBId The value of storeRecordBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_GreaterThan(Long storeRecordBId) {
        regStoreRecordBId(CK_GT, storeRecordBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
     * @param storeRecordBId The value of storeRecordBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_LessThan(Long storeRecordBId) {
        regStoreRecordBId(CK_LT, storeRecordBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
     * @param storeRecordBId The value of storeRecordBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_GreaterEqual(Long storeRecordBId) {
        regStoreRecordBId(CK_GE, storeRecordBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
     * @param storeRecordBId The value of storeRecordBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_LessEqual(Long storeRecordBId) {
        regStoreRecordBId(CK_LE, storeRecordBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
     * @param minNumber The min number of storeRecordBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeRecordBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreRecordBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreRecordBId(), "STORE_RECORD_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
     * @param storeRecordBIdList The collection of storeRecordBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBId_InScope(Collection<Long> storeRecordBIdList) {
        doSetStoreRecordBId_InScope(storeRecordBIdList);
    }

    protected void doSetStoreRecordBId_InScope(Collection<Long> storeRecordBIdList) {
        regINS(CK_INS, cTL(storeRecordBIdList), xgetCValueStoreRecordBId(), "STORE_RECORD_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
     * @param storeRecordBIdList The collection of storeRecordBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBId_NotInScope(Collection<Long> storeRecordBIdList) {
        doSetStoreRecordBId_NotInScope(storeRecordBIdList);
    }

    protected void doSetStoreRecordBId_NotInScope(Collection<Long> storeRecordBIdList) {
        regINS(CK_NINS, cTL(storeRecordBIdList), xgetCValueStoreRecordBId(), "STORE_RECORD_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STORE_RECORD_B_ID from T_STORE_RECORD_B where ...)} <br />
     * T_STORE_RECORD_B by my STORE_RECORD_B_ID, named 'TStoreRecordB'.
     * @param subCBLambda The callback for sub-query of TStoreRecordB for 'in-scope'. (NotNull)
     */
    public void inScopeTStoreRecordB(SubQuery<TStoreRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreRecordBId_InScopeRelation_TStoreRecordB(cb.query());
        registerInScopeRelation(cb.query(), "STORE_RECORD_B_ID", "STORE_RECORD_B_ID", pp, "tStoreRecordB", false);
    }
    public abstract String keepStoreRecordBId_InScopeRelation_TStoreRecordB(TStoreRecordBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STORE_RECORD_B_ID from T_STORE_RECORD_B where ...)} <br />
     * T_STORE_RECORD_B by my STORE_RECORD_B_ID, named 'TStoreRecordB'.
     * @param subCBLambda The callback for sub-query of TStoreRecordB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTStoreRecordB(SubQuery<TStoreRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreRecordBId_NotInScopeRelation_TStoreRecordB(cb.query());
        registerInScopeRelation(cb.query(), "STORE_RECORD_B_ID", "STORE_RECORD_B_ID", pp, "tStoreRecordB", true);
    }
    public abstract String keepStoreRecordBId_NotInScopeRelation_TStoreRecordB(TStoreRecordBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
     */
    public void setStoreRecordBId_IsNull() { regStoreRecordBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {IX, bigint(19), FK to T_STORE_RECORD_B}
     */
    public void setStoreRecordBId_IsNotNull() { regStoreRecordBId(CK_ISNN, DOBJ); }

    protected void regStoreRecordBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreRecordBId(), "STORE_RECORD_B_ID"); }
    protected abstract ConditionValue xgetCValueStoreRecordBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @param allocInstBId The value of allocInstBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_Equal(Long allocInstBId) {
        doSetAllocInstBId_Equal(allocInstBId);
    }

    protected void doSetAllocInstBId_Equal(Long allocInstBId) {
        regAllocInstBId(CK_EQ, allocInstBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @param allocInstBId The value of allocInstBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_NotEqual(Long allocInstBId) {
        doSetAllocInstBId_NotEqual(allocInstBId);
    }

    protected void doSetAllocInstBId_NotEqual(Long allocInstBId) {
        regAllocInstBId(CK_NES, allocInstBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @param allocInstBId The value of allocInstBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_GreaterThan(Long allocInstBId) {
        regAllocInstBId(CK_GT, allocInstBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @param allocInstBId The value of allocInstBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_LessThan(Long allocInstBId) {
        regAllocInstBId(CK_LT, allocInstBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @param allocInstBId The value of allocInstBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_GreaterEqual(Long allocInstBId) {
        regAllocInstBId(CK_GE, allocInstBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @param allocInstBId The value of allocInstBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_LessEqual(Long allocInstBId) {
        regAllocInstBId(CK_LE, allocInstBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @param minNumber The min number of allocInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocInstBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocInstBId(), "ALLOC_INST_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @param allocInstBIdList The collection of allocInstBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstBId_InScope(Collection<Long> allocInstBIdList) {
        doSetAllocInstBId_InScope(allocInstBIdList);
    }

    protected void doSetAllocInstBId_InScope(Collection<Long> allocInstBIdList) {
        regINS(CK_INS, cTL(allocInstBIdList), xgetCValueAllocInstBId(), "ALLOC_INST_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     * @param allocInstBIdList The collection of allocInstBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstBId_NotInScope(Collection<Long> allocInstBIdList) {
        doSetAllocInstBId_NotInScope(allocInstBIdList);
    }

    protected void doSetAllocInstBId_NotInScope(Collection<Long> allocInstBIdList) {
        regINS(CK_NINS, cTL(allocInstBIdList), xgetCValueAllocInstBId(), "ALLOC_INST_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ALLOC_INST_B_ID from T_ALLOC_INST_B where ...)} <br />
     * T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @param subCBLambda The callback for sub-query of TAllocInstB for 'in-scope'. (NotNull)
     */
    public void inScopeTAllocInstB(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepAllocInstBId_InScopeRelation_TAllocInstB(cb.query());
        registerInScopeRelation(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tAllocInstB", false);
    }
    public abstract String keepAllocInstBId_InScopeRelation_TAllocInstB(TAllocInstBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ALLOC_INST_B_ID from T_ALLOC_INST_B where ...)} <br />
     * T_ALLOC_INST_B by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @param subCBLambda The callback for sub-query of TAllocInstB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTAllocInstB(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepAllocInstBId_NotInScopeRelation_TAllocInstB(cb.query());
        registerInScopeRelation(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tAllocInstB", true);
    }
    public abstract String keepAllocInstBId_NotInScopeRelation_TAllocInstB(TAllocInstBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     */
    public void setAllocInstBId_IsNull() { regAllocInstBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, bigint(19), FK to T_ALLOC_INST_B}
     */
    public void setAllocInstBId_IsNotNull() { regAllocInstBId(CK_ISNN, DOBJ); }

    protected void regAllocInstBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocInstBId(), "ALLOC_INST_B_ID"); }
    protected abstract ConditionValue xgetCValueAllocInstBId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_Equal(String processDt) {
        doSetProcessDt_Equal(fRES(processDt));
    }

    protected void doSetProcessDt_Equal(String processDt) {
        regProcessDt(CK_EQ, processDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_NotEqual(String processDt) {
        doSetProcessDt_NotEqual(fRES(processDt));
    }

    protected void doSetProcessDt_NotEqual(String processDt) {
        regProcessDt(CK_NES, processDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_GreaterThan(String processDt) {
        regProcessDt(CK_GT, fRES(processDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_LessThan(String processDt) {
        regProcessDt(CK_LT, fRES(processDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_GreaterEqual(String processDt) {
        regProcessDt(CK_GE, fRES(processDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_LessEqual(String processDt) {
        regProcessDt(CK_LE, fRES(processDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDtList The collection of processDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_InScope(Collection<String> processDtList) {
        doSetProcessDt_InScope(processDtList);
    }

    protected void doSetProcessDt_InScope(Collection<String> processDtList) {
        regINS(CK_INS, cTL(processDtList), xgetCValueProcessDt(), "PROCESS_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDtList The collection of processDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_NotInScope(Collection<String> processDtList) {
        doSetProcessDt_NotInScope(processDtList);
    }

    protected void doSetProcessDt_NotInScope(Collection<String> processDtList) {
        regINS(CK_NINS, cTL(processDtList), xgetCValueProcessDt(), "PROCESS_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)} <br>
     * <pre>e.g. setProcessDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processDt The value of processDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessDt_LikeSearch(String processDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processDt), xgetCValueProcessDt(), "PROCESS_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessDt_NotLikeSearch(String processDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processDt), xgetCValueProcessDt(), "PROCESS_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {IX, NotNull, varchar(8)}
     * @param processDt The value of processDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_PrefixSearch(String processDt) {
        setProcessDt_LikeSearch(processDt, xcLSOPPre());
    }

    protected void regProcessDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessDt(), "PROCESS_DT"); }
    protected abstract ConditionValue xgetCValueProcessDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_Equal(Long processTypeId) {
        doSetProcessTypeId_Equal(processTypeId);
    }

    protected void doSetProcessTypeId_Equal(Long processTypeId) {
        regProcessTypeId(CK_EQ, processTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotEqual(Long processTypeId) {
        doSetProcessTypeId_NotEqual(processTypeId);
    }

    protected void doSetProcessTypeId_NotEqual(Long processTypeId) {
        regProcessTypeId(CK_NES, processTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterThan(Long processTypeId) {
        regProcessTypeId(CK_GT, processTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessThan(Long processTypeId) {
        regProcessTypeId(CK_LT, processTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterEqual(Long processTypeId) {
        regProcessTypeId(CK_GE, processTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessEqual(Long processTypeId) {
        regProcessTypeId(CK_LE, processTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param minNumber The min number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProcessTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeIdList The collection of processTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_InScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_InScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_InScope(Collection<Long> processTypeIdList) {
        regINS(CK_INS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeIdList The collection of processTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_NotInScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        regINS(CK_NINS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PROCESS_TYPE_ID from M_PROCESS_TYPE where ...)} <br />
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param subCBLambda The callback for sub-query of MProcessType for 'in-scope'. (NotNull)
     */
    public void inScopeMProcessType(SubQuery<MProcessTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProcessTypeCB cb = new MProcessTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProcessTypeId_InScopeRelation_MProcessType(cb.query());
        registerInScopeRelation(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "mProcessType", false);
    }
    public abstract String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PROCESS_TYPE_ID from M_PROCESS_TYPE where ...)} <br />
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param subCBLambda The callback for sub-query of MProcessType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProcessType(SubQuery<MProcessTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProcessTypeCB cb = new MProcessTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProcessTypeId_NotInScopeRelation_MProcessType(cb.query());
        registerInScopeRelation(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "mProcessType", true);
    }
    public abstract String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq);

    protected void regProcessTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueProcessTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_Equal(String processNo) {
        doSetProcessNo_Equal(fRES(processNo));
    }

    protected void doSetProcessNo_Equal(String processNo) {
        regProcessNo(CK_EQ, processNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_NotEqual(String processNo) {
        doSetProcessNo_NotEqual(fRES(processNo));
    }

    protected void doSetProcessNo_NotEqual(String processNo) {
        regProcessNo(CK_NES, processNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_GreaterThan(String processNo) {
        regProcessNo(CK_GT, fRES(processNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_LessThan(String processNo) {
        regProcessNo(CK_LT, fRES(processNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_GreaterEqual(String processNo) {
        regProcessNo(CK_GE, fRES(processNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_LessEqual(String processNo) {
        regProcessNo(CK_LE, fRES(processNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNoList The collection of processNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_InScope(Collection<String> processNoList) {
        doSetProcessNo_InScope(processNoList);
    }

    protected void doSetProcessNo_InScope(Collection<String> processNoList) {
        regINS(CK_INS, cTL(processNoList), xgetCValueProcessNo(), "PROCESS_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNoList The collection of processNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_NotInScope(Collection<String> processNoList) {
        doSetProcessNo_NotInScope(processNoList);
    }

    protected void doSetProcessNo_NotInScope(Collection<String> processNoList) {
        regINS(CK_NINS, cTL(processNoList), xgetCValueProcessNo(), "PROCESS_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setProcessNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processNo The value of processNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessNo_LikeSearch(String processNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processNo), xgetCValueProcessNo(), "PROCESS_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessNo_NotLikeSearch(String processNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processNo), xgetCValueProcessNo(), "PROCESS_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, varchar(30)}
     * @param processNo The value of processNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_PrefixSearch(String processNo) {
        setProcessNo_LikeSearch(processNo, xcLSOPPre());
    }

    protected void regProcessNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessNo(), "PROCESS_NO"); }
    protected abstract ConditionValue xgetCValueProcessNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType}
     * @param correctType The value of correctType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectType_Equal(String correctType) {
        doSetCorrectType_Equal(fRES(correctType));
    }

    /**
     * Equal(=). As CorrectType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} <br>
     * 赤黒区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectType_Equal_AsCorrectType(CDef.CorrectType cdef) {
        doSetCorrectType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 黒
     */
    public void setCorrectType_Equal_$0() {
        setCorrectType_Equal_AsCorrectType(CDef.CorrectType.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 赤
     */
    public void setCorrectType_Equal_$1() {
        setCorrectType_Equal_AsCorrectType(CDef.CorrectType.$1);
    }

    protected void doSetCorrectType_Equal(String correctType) {
        regCorrectType(CK_EQ, correctType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType}
     * @param correctType The value of correctType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectType_NotEqual(String correctType) {
        doSetCorrectType_NotEqual(fRES(correctType));
    }

    /**
     * NotEqual(&lt;&gt;). As CorrectType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} <br>
     * 赤黒区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectType_NotEqual_AsCorrectType(CDef.CorrectType cdef) {
        doSetCorrectType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 黒
     */
    public void setCorrectType_NotEqual_$0() {
        setCorrectType_NotEqual_AsCorrectType(CDef.CorrectType.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 赤
     */
    public void setCorrectType_NotEqual_$1() {
        setCorrectType_NotEqual_AsCorrectType(CDef.CorrectType.$1);
    }

    protected void doSetCorrectType_NotEqual(String correctType) {
        regCorrectType(CK_NES, correctType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType}
     * @param correctTypeList The collection of correctType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectType_InScope(Collection<String> correctTypeList) {
        doSetCorrectType_InScope(correctTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CorrectType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} <br>
     * 赤黒区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectType_InScope_AsCorrectType(Collection<CDef.CorrectType> cdefList) {
        doSetCorrectType_InScope(cTStrL(cdefList));
    }

    protected void doSetCorrectType_InScope(Collection<String> correctTypeList) {
        regINS(CK_INS, cTL(correctTypeList), xgetCValueCorrectType(), "CORRECT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType}
     * @param correctTypeList The collection of correctType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectType_NotInScope(Collection<String> correctTypeList) {
        doSetCorrectType_NotInScope(correctTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CorrectType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CORRECT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=CorrectType} <br>
     * 赤黒区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectType_NotInScope_AsCorrectType(Collection<CDef.CorrectType> cdefList) {
        doSetCorrectType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCorrectType_NotInScope(Collection<String> correctTypeList) {
        regINS(CK_NINS, cTL(correctTypeList), xgetCValueCorrectType(), "CORRECT_TYPE");
    }

    protected void regCorrectType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCorrectType(), "CORRECT_TYPE"); }
    protected abstract ConditionValue xgetCValueCorrectType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK}
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
     * STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK}
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
     * STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK}
     * @param stockId The value of stockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterThan(Long stockId) {
        regStockId(CK_GT, stockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK}
     * @param stockId The value of stockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessThan(Long stockId) {
        regStockId(CK_LT, stockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK}
     * @param stockId The value of stockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterEqual(Long stockId) {
        regStockId(CK_GE, stockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK}
     * @param stockId The value of stockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessEqual(Long stockId) {
        regStockId(CK_LE, stockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK}
     * @param minNumber The min number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockId(), "STOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK}
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
     * STOCK_ID: {IX, NotNull, bigint(19), FK to T_STOCK}
     * @param stockIdList The collection of stockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_NotInScope(Collection<Long> stockIdList) {
        doSetStockId_NotInScope(stockIdList);
    }

    protected void doSetStockId_NotInScope(Collection<Long> stockIdList) {
        regINS(CK_NINS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STOCK_ID from T_STOCK where ...)} <br />
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @param subCBLambda The callback for sub-query of TStock for 'in-scope'. (NotNull)
     */
    public void inScopeTStock(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_InScopeRelation_TStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStock", false);
    }
    public abstract String keepStockId_InScopeRelation_TStock(TStockCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_ID from T_STOCK where ...)} <br />
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @param subCBLambda The callback for sub-query of TStock for 'not in-scope'. (NotNull)
     */
    public void notInScopeTStock(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_NotInScopeRelation_TStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStock", true);
    }
    public abstract String keepStockId_NotInScopeRelation_TStock(TStockCQ sq);

    protected void regStockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockId(), "STOCK_ID"); }
    protected abstract ConditionValue xgetCValueStockId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @param inoutType The value of inoutType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_Equal(String inoutType) {
        doSetInoutType_Equal(fRES(inoutType));
    }

    /**
     * Equal(=). As InoutType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInoutType_Equal_AsInoutType(CDef.InoutType cdef) {
        doSetInoutType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 入庫
     */
    public void setInoutType_Equal_$0() {
        setInoutType_Equal_AsInoutType(CDef.InoutType.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出庫
     */
    public void setInoutType_Equal_$1() {
        setInoutType_Equal_AsInoutType(CDef.InoutType.$1);
    }

    protected void doSetInoutType_Equal(String inoutType) {
        regInoutType(CK_EQ, inoutType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @param inoutType The value of inoutType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_NotEqual(String inoutType) {
        doSetInoutType_NotEqual(fRES(inoutType));
    }

    /**
     * NotEqual(&lt;&gt;). As InoutType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInoutType_NotEqual_AsInoutType(CDef.InoutType cdef) {
        doSetInoutType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 入庫
     */
    public void setInoutType_NotEqual_$0() {
        setInoutType_NotEqual_AsInoutType(CDef.InoutType.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出庫
     */
    public void setInoutType_NotEqual_$1() {
        setInoutType_NotEqual_AsInoutType(CDef.InoutType.$1);
    }

    protected void doSetInoutType_NotEqual(String inoutType) {
        regInoutType(CK_NES, inoutType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @param inoutTypeList The collection of inoutType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_InScope(Collection<String> inoutTypeList) {
        doSetInoutType_InScope(inoutTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As InoutType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_InScope_AsInoutType(Collection<CDef.InoutType> cdefList) {
        doSetInoutType_InScope(cTStrL(cdefList));
    }

    protected void doSetInoutType_InScope(Collection<String> inoutTypeList) {
        regINS(CK_INS, cTL(inoutTypeList), xgetCValueInoutType(), "INOUT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType}
     * @param inoutTypeList The collection of inoutType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_NotInScope(Collection<String> inoutTypeList) {
        doSetInoutType_NotInScope(inoutTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InoutType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutType_NotInScope_AsInoutType(Collection<CDef.InoutType> cdefList) {
        doSetInoutType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInoutType_NotInScope(Collection<String> inoutTypeList) {
        regINS(CK_NINS, cTL(inoutTypeList), xgetCValueInoutType(), "INOUT_TYPE");
    }

    protected void regInoutType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInoutType(), "INOUT_TYPE"); }
    protected abstract ConditionValue xgetCValueInoutType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param stockInoutNum The value of stockInoutNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutNum_Equal(java.math.BigDecimal stockInoutNum) {
        doSetStockInoutNum_Equal(stockInoutNum);
    }

    protected void doSetStockInoutNum_Equal(java.math.BigDecimal stockInoutNum) {
        regStockInoutNum(CK_EQ, stockInoutNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param stockInoutNum The value of stockInoutNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutNum_NotEqual(java.math.BigDecimal stockInoutNum) {
        doSetStockInoutNum_NotEqual(stockInoutNum);
    }

    protected void doSetStockInoutNum_NotEqual(java.math.BigDecimal stockInoutNum) {
        regStockInoutNum(CK_NES, stockInoutNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param stockInoutNum The value of stockInoutNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutNum_GreaterThan(java.math.BigDecimal stockInoutNum) {
        regStockInoutNum(CK_GT, stockInoutNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param stockInoutNum The value of stockInoutNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutNum_LessThan(java.math.BigDecimal stockInoutNum) {
        regStockInoutNum(CK_LT, stockInoutNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param stockInoutNum The value of stockInoutNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutNum_GreaterEqual(java.math.BigDecimal stockInoutNum) {
        regStockInoutNum(CK_GE, stockInoutNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param stockInoutNum The value of stockInoutNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockInoutNum_LessEqual(java.math.BigDecimal stockInoutNum) {
        regStockInoutNum(CK_LE, stockInoutNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of stockInoutNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockInoutNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockInoutNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockInoutNum(), "STOCK_INOUT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param stockInoutNumList The collection of stockInoutNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockInoutNum_InScope(Collection<java.math.BigDecimal> stockInoutNumList) {
        doSetStockInoutNum_InScope(stockInoutNumList);
    }

    protected void doSetStockInoutNum_InScope(Collection<java.math.BigDecimal> stockInoutNumList) {
        regINS(CK_INS, cTL(stockInoutNumList), xgetCValueStockInoutNum(), "STOCK_INOUT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_INOUT_NUM: {NotNull, decimal(16, 6), default=[(0)]}
     * @param stockInoutNumList The collection of stockInoutNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockInoutNum_NotInScope(Collection<java.math.BigDecimal> stockInoutNumList) {
        doSetStockInoutNum_NotInScope(stockInoutNumList);
    }

    protected void doSetStockInoutNum_NotInScope(Collection<java.math.BigDecimal> stockInoutNumList) {
        regINS(CK_NINS, cTL(stockInoutNumList), xgetCValueStockInoutNum(), "STOCK_INOUT_NUM");
    }

    protected void regStockInoutNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockInoutNum(), "STOCK_INOUT_NUM"); }
    protected abstract ConditionValue xgetCValueStockInoutNum();

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
    public HpSLCFunction<TStockInoutCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TStockInoutCB.class);
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
    public HpSLCFunction<TStockInoutCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TStockInoutCB.class);
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
    public HpSLCFunction<TStockInoutCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TStockInoutCB.class);
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
    public HpSLCFunction<TStockInoutCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TStockInoutCB.class);
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
    public HpSLCFunction<TStockInoutCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TStockInoutCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TStockInoutCB&gt;() {
     *     public void query(TStockInoutCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TStockInoutCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TStockInoutCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockInoutCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TStockInoutCQ sq);

    protected TStockInoutCB xcreateScalarConditionCB() {
        TStockInoutCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TStockInoutCB xcreateScalarConditionPartitionByCB() {
        TStockInoutCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TStockInoutCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "STOCK_INOUT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TStockInoutCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TStockInoutCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TStockInoutCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "STOCK_INOUT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TStockInoutCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TStockInoutCQ sq);

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
    protected TStockInoutCB newMyCB() {
        return new TStockInoutCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TStockInoutCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

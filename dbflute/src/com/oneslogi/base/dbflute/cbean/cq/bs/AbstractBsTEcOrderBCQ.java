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
 * The abstract condition-query of T_EC_ORDER_B.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTEcOrderBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTEcOrderBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_EC_ORDER_B";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderBId The value of ecOrderBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderBId_Equal(Long ecOrderBId) {
        doSetEcOrderBId_Equal(ecOrderBId);
    }

    protected void doSetEcOrderBId_Equal(Long ecOrderBId) {
        regEcOrderBId(CK_EQ, ecOrderBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderBId The value of ecOrderBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderBId_NotEqual(Long ecOrderBId) {
        doSetEcOrderBId_NotEqual(ecOrderBId);
    }

    protected void doSetEcOrderBId_NotEqual(Long ecOrderBId) {
        regEcOrderBId(CK_NES, ecOrderBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderBId The value of ecOrderBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderBId_GreaterThan(Long ecOrderBId) {
        regEcOrderBId(CK_GT, ecOrderBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderBId The value of ecOrderBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderBId_LessThan(Long ecOrderBId) {
        regEcOrderBId(CK_LT, ecOrderBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderBId The value of ecOrderBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderBId_GreaterEqual(Long ecOrderBId) {
        regEcOrderBId(CK_GE, ecOrderBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderBId The value of ecOrderBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderBId_LessEqual(Long ecOrderBId) {
        regEcOrderBId(CK_LE, ecOrderBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of ecOrderBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ecOrderBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEcOrderBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEcOrderBId(), "EC_ORDER_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderBIdList The collection of ecOrderBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBId_InScope(Collection<Long> ecOrderBIdList) {
        doSetEcOrderBId_InScope(ecOrderBIdList);
    }

    protected void doSetEcOrderBId_InScope(Collection<Long> ecOrderBIdList) {
        regINS(CK_INS, cTL(ecOrderBIdList), xgetCValueEcOrderBId(), "EC_ORDER_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ecOrderBIdList The collection of ecOrderBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBId_NotInScope(Collection<Long> ecOrderBIdList) {
        doSetEcOrderBId_NotInScope(ecOrderBIdList);
    }

    protected void doSetEcOrderBId_NotInScope(Collection<Long> ecOrderBIdList) {
        regINS(CK_NINS, cTL(ecOrderBIdList), xgetCValueEcOrderBId(), "EC_ORDER_B_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select EC_ORDER_B_ID from T_AMAZON_ORDER where ...)} <br>
     * T_AMAZON_ORDER by EC_ORDER_B_ID, named 'TAmazonOrderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAmazonOrderList</span>(orderCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orderCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAmazonOrderList for 'exists'. (NotNull)
     */
    public void existsTAmazonOrderList(SubQuery<TAmazonOrderCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAmazonOrderCB cb = new TAmazonOrderCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEcOrderBId_ExistsReferrer_TAmazonOrderList(cb.query());
        registerExistsReferrer(cb.query(), "EC_ORDER_B_ID", "EC_ORDER_B_ID", pp, "tAmazonOrderList");
    }
    public abstract String keepEcOrderBId_ExistsReferrer_TAmazonOrderList(TAmazonOrderCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select EC_ORDER_B_ID from T_RAKUTEN_ORDER where ...)} <br>
     * T_RAKUTEN_ORDER by EC_ORDER_B_ID, named 'TRakutenOrderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTRakutenOrderList</span>(orderCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orderCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TRakutenOrderList for 'exists'. (NotNull)
     */
    public void existsTRakutenOrderList(SubQuery<TRakutenOrderCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TRakutenOrderCB cb = new TRakutenOrderCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEcOrderBId_ExistsReferrer_TRakutenOrderList(cb.query());
        registerExistsReferrer(cb.query(), "EC_ORDER_B_ID", "EC_ORDER_B_ID", pp, "tRakutenOrderList");
    }
    public abstract String keepEcOrderBId_ExistsReferrer_TRakutenOrderList(TRakutenOrderCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select EC_ORDER_B_ID from T_YAHOO_ORDER where ...)} <br>
     * T_YAHOO_ORDER by EC_ORDER_B_ID, named 'TYahooOrderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTYahooOrderList</span>(orderCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orderCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TYahooOrderList for 'exists'. (NotNull)
     */
    public void existsTYahooOrderList(SubQuery<TYahooOrderCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYahooOrderCB cb = new TYahooOrderCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEcOrderBId_ExistsReferrer_TYahooOrderList(cb.query());
        registerExistsReferrer(cb.query(), "EC_ORDER_B_ID", "EC_ORDER_B_ID", pp, "tYahooOrderList");
    }
    public abstract String keepEcOrderBId_ExistsReferrer_TYahooOrderList(TYahooOrderCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select EC_ORDER_B_ID from T_AMAZON_ORDER where ...)} <br>
     * T_AMAZON_ORDER by EC_ORDER_B_ID, named 'TAmazonOrderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAmazonOrderList</span>(orderCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orderCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of EcOrderBId_NotExistsReferrer_TAmazonOrderList for 'not exists'. (NotNull)
     */
    public void notExistsTAmazonOrderList(SubQuery<TAmazonOrderCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAmazonOrderCB cb = new TAmazonOrderCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEcOrderBId_NotExistsReferrer_TAmazonOrderList(cb.query());
        registerNotExistsReferrer(cb.query(), "EC_ORDER_B_ID", "EC_ORDER_B_ID", pp, "tAmazonOrderList");
    }
    public abstract String keepEcOrderBId_NotExistsReferrer_TAmazonOrderList(TAmazonOrderCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select EC_ORDER_B_ID from T_RAKUTEN_ORDER where ...)} <br>
     * T_RAKUTEN_ORDER by EC_ORDER_B_ID, named 'TRakutenOrderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTRakutenOrderList</span>(orderCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orderCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of EcOrderBId_NotExistsReferrer_TRakutenOrderList for 'not exists'. (NotNull)
     */
    public void notExistsTRakutenOrderList(SubQuery<TRakutenOrderCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TRakutenOrderCB cb = new TRakutenOrderCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEcOrderBId_NotExistsReferrer_TRakutenOrderList(cb.query());
        registerNotExistsReferrer(cb.query(), "EC_ORDER_B_ID", "EC_ORDER_B_ID", pp, "tRakutenOrderList");
    }
    public abstract String keepEcOrderBId_NotExistsReferrer_TRakutenOrderList(TRakutenOrderCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select EC_ORDER_B_ID from T_YAHOO_ORDER where ...)} <br>
     * T_YAHOO_ORDER by EC_ORDER_B_ID, named 'TYahooOrderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTYahooOrderList</span>(orderCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orderCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of EcOrderBId_NotExistsReferrer_TYahooOrderList for 'not exists'. (NotNull)
     */
    public void notExistsTYahooOrderList(SubQuery<TYahooOrderCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYahooOrderCB cb = new TYahooOrderCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEcOrderBId_NotExistsReferrer_TYahooOrderList(cb.query());
        registerNotExistsReferrer(cb.query(), "EC_ORDER_B_ID", "EC_ORDER_B_ID", pp, "tYahooOrderList");
    }
    public abstract String keepEcOrderBId_NotExistsReferrer_TYahooOrderList(TYahooOrderCQ sq);

    public void xsderiveTAmazonOrderList(String fn, SubQuery<TAmazonOrderCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAmazonOrderCB cb = new TAmazonOrderCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepEcOrderBId_SpecifyDerivedReferrer_TAmazonOrderList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "EC_ORDER_B_ID", "EC_ORDER_B_ID", pp, "tAmazonOrderList", al, op);
    }
    public abstract String keepEcOrderBId_SpecifyDerivedReferrer_TAmazonOrderList(TAmazonOrderCQ sq);

    public void xsderiveTRakutenOrderList(String fn, SubQuery<TRakutenOrderCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TRakutenOrderCB cb = new TRakutenOrderCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepEcOrderBId_SpecifyDerivedReferrer_TRakutenOrderList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "EC_ORDER_B_ID", "EC_ORDER_B_ID", pp, "tRakutenOrderList", al, op);
    }
    public abstract String keepEcOrderBId_SpecifyDerivedReferrer_TRakutenOrderList(TRakutenOrderCQ sq);

    public void xsderiveTYahooOrderList(String fn, SubQuery<TYahooOrderCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYahooOrderCB cb = new TYahooOrderCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepEcOrderBId_SpecifyDerivedReferrer_TYahooOrderList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "EC_ORDER_B_ID", "EC_ORDER_B_ID", pp, "tYahooOrderList", al, op);
    }
    public abstract String keepEcOrderBId_SpecifyDerivedReferrer_TYahooOrderList(TYahooOrderCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_AMAZON_ORDER where ...)} <br>
     * T_AMAZON_ORDER by EC_ORDER_B_ID, named 'TAmazonOrderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAmazonOrderList()</span>.<span style="color: #CC4747">max</span>(orderCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orderCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     orderCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAmazonOrderCB> derivedTAmazonOrderList() {
        return xcreateQDRFunctionTAmazonOrderList();
    }
    protected HpQDRFunction<TAmazonOrderCB> xcreateQDRFunctionTAmazonOrderList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAmazonOrderList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAmazonOrderList(String fn, SubQuery<TAmazonOrderCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAmazonOrderCB cb = new TAmazonOrderCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepEcOrderBId_QueryDerivedReferrer_TAmazonOrderList(cb.query()); String prpp = keepEcOrderBId_QueryDerivedReferrer_TAmazonOrderListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "EC_ORDER_B_ID", "EC_ORDER_B_ID", sqpp, "tAmazonOrderList", rd, vl, prpp, op);
    }
    public abstract String keepEcOrderBId_QueryDerivedReferrer_TAmazonOrderList(TAmazonOrderCQ sq);
    public abstract String keepEcOrderBId_QueryDerivedReferrer_TAmazonOrderListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_RAKUTEN_ORDER where ...)} <br>
     * T_RAKUTEN_ORDER by EC_ORDER_B_ID, named 'TRakutenOrderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTRakutenOrderList()</span>.<span style="color: #CC4747">max</span>(orderCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orderCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     orderCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TRakutenOrderCB> derivedTRakutenOrderList() {
        return xcreateQDRFunctionTRakutenOrderList();
    }
    protected HpQDRFunction<TRakutenOrderCB> xcreateQDRFunctionTRakutenOrderList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTRakutenOrderList(fn, sq, rd, vl, op));
    }
    public void xqderiveTRakutenOrderList(String fn, SubQuery<TRakutenOrderCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TRakutenOrderCB cb = new TRakutenOrderCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepEcOrderBId_QueryDerivedReferrer_TRakutenOrderList(cb.query()); String prpp = keepEcOrderBId_QueryDerivedReferrer_TRakutenOrderListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "EC_ORDER_B_ID", "EC_ORDER_B_ID", sqpp, "tRakutenOrderList", rd, vl, prpp, op);
    }
    public abstract String keepEcOrderBId_QueryDerivedReferrer_TRakutenOrderList(TRakutenOrderCQ sq);
    public abstract String keepEcOrderBId_QueryDerivedReferrer_TRakutenOrderListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_YAHOO_ORDER where ...)} <br>
     * T_YAHOO_ORDER by EC_ORDER_B_ID, named 'TYahooOrderAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTYahooOrderList()</span>.<span style="color: #CC4747">max</span>(orderCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orderCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     orderCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TYahooOrderCB> derivedTYahooOrderList() {
        return xcreateQDRFunctionTYahooOrderList();
    }
    protected HpQDRFunction<TYahooOrderCB> xcreateQDRFunctionTYahooOrderList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTYahooOrderList(fn, sq, rd, vl, op));
    }
    public void xqderiveTYahooOrderList(String fn, SubQuery<TYahooOrderCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYahooOrderCB cb = new TYahooOrderCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepEcOrderBId_QueryDerivedReferrer_TYahooOrderList(cb.query()); String prpp = keepEcOrderBId_QueryDerivedReferrer_TYahooOrderListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "EC_ORDER_B_ID", "EC_ORDER_B_ID", sqpp, "tYahooOrderList", rd, vl, prpp, op);
    }
    public abstract String keepEcOrderBId_QueryDerivedReferrer_TYahooOrderList(TYahooOrderCQ sq);
    public abstract String keepEcOrderBId_QueryDerivedReferrer_TYahooOrderListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setEcOrderBId_IsNull() { regEcOrderBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setEcOrderBId_IsNotNull() { regEcOrderBId(CK_ISNN, DOBJ); }

    protected void regEcOrderBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEcOrderBId(), "EC_ORDER_B_ID"); }
    protected abstract ConditionValue xgetCValueEcOrderBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H}
     * @param ecOrderHId The value of ecOrderHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_Equal(Long ecOrderHId) {
        doSetEcOrderHId_Equal(ecOrderHId);
    }

    protected void doSetEcOrderHId_Equal(Long ecOrderHId) {
        regEcOrderHId(CK_EQ, ecOrderHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H}
     * @param ecOrderHId The value of ecOrderHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_NotEqual(Long ecOrderHId) {
        doSetEcOrderHId_NotEqual(ecOrderHId);
    }

    protected void doSetEcOrderHId_NotEqual(Long ecOrderHId) {
        regEcOrderHId(CK_NES, ecOrderHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H}
     * @param ecOrderHId The value of ecOrderHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_GreaterThan(Long ecOrderHId) {
        regEcOrderHId(CK_GT, ecOrderHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H}
     * @param ecOrderHId The value of ecOrderHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_LessThan(Long ecOrderHId) {
        regEcOrderHId(CK_LT, ecOrderHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H}
     * @param ecOrderHId The value of ecOrderHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_GreaterEqual(Long ecOrderHId) {
        regEcOrderHId(CK_GE, ecOrderHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H}
     * @param ecOrderHId The value of ecOrderHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderHId_LessEqual(Long ecOrderHId) {
        regEcOrderHId(CK_LE, ecOrderHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H}
     * @param minNumber The min number of ecOrderHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ecOrderHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEcOrderHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEcOrderHId(), "EC_ORDER_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H}
     * @param ecOrderHIdList The collection of ecOrderHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderHId_InScope(Collection<Long> ecOrderHIdList) {
        doSetEcOrderHId_InScope(ecOrderHIdList);
    }

    protected void doSetEcOrderHId_InScope(Collection<Long> ecOrderHIdList) {
        regINS(CK_INS, cTL(ecOrderHIdList), xgetCValueEcOrderHId(), "EC_ORDER_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H}
     * @param ecOrderHIdList The collection of ecOrderHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderHId_NotInScope(Collection<Long> ecOrderHIdList) {
        doSetEcOrderHId_NotInScope(ecOrderHIdList);
    }

    protected void doSetEcOrderHId_NotInScope(Collection<Long> ecOrderHIdList) {
        regINS(CK_NINS, cTL(ecOrderHIdList), xgetCValueEcOrderHId(), "EC_ORDER_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select EC_ORDER_H_ID from T_EC_ORDER_H where ...)} <br />
     * T_EC_ORDER_H by my EC_ORDER_H_ID, named 'TEcOrderH'.
     * @param subCBLambda The callback for sub-query of TEcOrderH for 'in-scope'. (NotNull)
     */
    public void inScopeTEcOrderH(SubQuery<TEcOrderHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepEcOrderHId_InScopeRelation_TEcOrderH(cb.query());
        registerInScopeRelation(cb.query(), "EC_ORDER_H_ID", "EC_ORDER_H_ID", pp, "tEcOrderH", false);
    }
    public abstract String keepEcOrderHId_InScopeRelation_TEcOrderH(TEcOrderHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select EC_ORDER_H_ID from T_EC_ORDER_H where ...)} <br />
     * T_EC_ORDER_H by my EC_ORDER_H_ID, named 'TEcOrderH'.
     * @param subCBLambda The callback for sub-query of TEcOrderH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTEcOrderH(SubQuery<TEcOrderHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepEcOrderHId_NotInScopeRelation_TEcOrderH(cb.query());
        registerInScopeRelation(cb.query(), "EC_ORDER_H_ID", "EC_ORDER_H_ID", pp, "tEcOrderH", true);
    }
    public abstract String keepEcOrderHId_NotInScopeRelation_TEcOrderH(TEcOrderHCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H}
     */
    public void setEcOrderHId_IsNull() { regEcOrderHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H}
     */
    public void setEcOrderHId_IsNotNull() { regEcOrderHId(CK_ISNN, DOBJ); }

    protected void regEcOrderHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEcOrderHId(), "EC_ORDER_H_ID"); }
    protected abstract ConditionValue xgetCValueEcOrderHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(100)}
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
     * PRODUCT_CD: {varchar(100)}
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
     * PRODUCT_CD: {varchar(100)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(100)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(100)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(100)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(100)}
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
     * PRODUCT_CD: {varchar(100)}
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
     * PRODUCT_CD: {varchar(100)} <br>
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
     * PRODUCT_CD: {varchar(100)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(100)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(100)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(100)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(100)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_Equal(String productNm) {
        doSetProductNm_Equal(fRES(productNm));
    }

    protected void doSetProductNm_Equal(String productNm) {
        regProductNm(CK_EQ, productNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_NotEqual(String productNm) {
        doSetProductNm_NotEqual(fRES(productNm));
    }

    protected void doSetProductNm_NotEqual(String productNm) {
        regProductNm(CK_NES, productNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterThan(String productNm) {
        regProductNm(CK_GT, fRES(productNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessThan(String productNm) {
        regProductNm(CK_LT, fRES(productNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterEqual(String productNm) {
        regProductNm(CK_GE, fRES(productNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessEqual(String productNm) {
        regProductNm(CK_LE, fRES(productNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNmList The collection of productNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_InScope(Collection<String> productNmList) {
        doSetProductNm_InScope(productNmList);
    }

    protected void doSetProductNm_InScope(Collection<String> productNmList) {
        regINS(CK_INS, cTL(productNmList), xgetCValueProductNm(), "PRODUCT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNmList The collection of productNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_NotInScope(Collection<String> productNmList) {
        doSetProductNm_NotInScope(productNmList);
    }

    protected void doSetProductNm_NotInScope(Collection<String> productNmList) {
        regINS(CK_NINS, cTL(productNmList), xgetCValueProductNm(), "PRODUCT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)} <br>
     * <pre>e.g. setProductNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productNm The value of productNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductNm_LikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNm_NotLikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_PrefixSearch(String productNm) {
        setProductNm_LikeSearch(productNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     */
    public void setProductNm_IsNull() { regProductNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     */
    public void setProductNm_IsNullOrEmpty() { regProductNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     */
    public void setProductNm_IsNotNull() { regProductNm(CK_ISNN, DOBJ); }

    protected void regProductNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductNm(), "PRODUCT_NM"); }
    protected abstract ConditionValue xgetCValueProductNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_OPTION: {varchar(255)}
     * @param productOption The value of productOption as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductOption_Equal(String productOption) {
        doSetProductOption_Equal(fRES(productOption));
    }

    protected void doSetProductOption_Equal(String productOption) {
        regProductOption(CK_EQ, productOption);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_OPTION: {varchar(255)}
     * @param productOption The value of productOption as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductOption_NotEqual(String productOption) {
        doSetProductOption_NotEqual(fRES(productOption));
    }

    protected void doSetProductOption_NotEqual(String productOption) {
        regProductOption(CK_NES, productOption);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_OPTION: {varchar(255)}
     * @param productOption The value of productOption as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductOption_GreaterThan(String productOption) {
        regProductOption(CK_GT, fRES(productOption));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_OPTION: {varchar(255)}
     * @param productOption The value of productOption as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductOption_LessThan(String productOption) {
        regProductOption(CK_LT, fRES(productOption));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_OPTION: {varchar(255)}
     * @param productOption The value of productOption as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductOption_GreaterEqual(String productOption) {
        regProductOption(CK_GE, fRES(productOption));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_OPTION: {varchar(255)}
     * @param productOption The value of productOption as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductOption_LessEqual(String productOption) {
        regProductOption(CK_LE, fRES(productOption));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_OPTION: {varchar(255)}
     * @param productOptionList The collection of productOption as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductOption_InScope(Collection<String> productOptionList) {
        doSetProductOption_InScope(productOptionList);
    }

    protected void doSetProductOption_InScope(Collection<String> productOptionList) {
        regINS(CK_INS, cTL(productOptionList), xgetCValueProductOption(), "PRODUCT_OPTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_OPTION: {varchar(255)}
     * @param productOptionList The collection of productOption as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductOption_NotInScope(Collection<String> productOptionList) {
        doSetProductOption_NotInScope(productOptionList);
    }

    protected void doSetProductOption_NotInScope(Collection<String> productOptionList) {
        regINS(CK_NINS, cTL(productOptionList), xgetCValueProductOption(), "PRODUCT_OPTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_OPTION: {varchar(255)} <br>
     * <pre>e.g. setProductOption_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productOption The value of productOption as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductOption_LikeSearch(String productOption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productOption), xgetCValueProductOption(), "PRODUCT_OPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_OPTION: {varchar(255)}
     * @param productOption The value of productOption as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductOption_NotLikeSearch(String productOption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productOption), xgetCValueProductOption(), "PRODUCT_OPTION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_OPTION: {varchar(255)}
     * @param productOption The value of productOption as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductOption_PrefixSearch(String productOption) {
        setProductOption_LikeSearch(productOption, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_OPTION: {varchar(255)}
     */
    public void setProductOption_IsNull() { regProductOption(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_OPTION: {varchar(255)}
     */
    public void setProductOption_IsNullOrEmpty() { regProductOption(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_OPTION: {varchar(255)}
     */
    public void setProductOption_IsNotNull() { regProductOption(CK_ISNN, DOBJ); }

    protected void regProductOption(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductOption(), "PRODUCT_OPTION"); }
    protected abstract ConditionValue xgetCValueProductOption();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNum The value of orderNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_Equal(Long orderNum) {
        doSetOrderNum_Equal(orderNum);
    }

    protected void doSetOrderNum_Equal(Long orderNum) {
        regOrderNum(CK_EQ, orderNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNum The value of orderNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_NotEqual(Long orderNum) {
        doSetOrderNum_NotEqual(orderNum);
    }

    protected void doSetOrderNum_NotEqual(Long orderNum) {
        regOrderNum(CK_NES, orderNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNum The value of orderNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_GreaterThan(Long orderNum) {
        regOrderNum(CK_GT, orderNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNum The value of orderNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_LessThan(Long orderNum) {
        regOrderNum(CK_LT, orderNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNum The value of orderNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_GreaterEqual(Long orderNum) {
        regOrderNum(CK_GE, orderNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNum The value of orderNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_LessEqual(Long orderNum) {
        regOrderNum(CK_LE, orderNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param minNumber The min number of orderNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of orderNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOrderNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOrderNum(), "ORDER_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNumList The collection of orderNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNum_InScope(Collection<Long> orderNumList) {
        doSetOrderNum_InScope(orderNumList);
    }

    protected void doSetOrderNum_InScope(Collection<Long> orderNumList) {
        regINS(CK_INS, cTL(orderNumList), xgetCValueOrderNum(), "ORDER_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNumList The collection of orderNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNum_NotInScope(Collection<Long> orderNumList) {
        doSetOrderNum_NotInScope(orderNumList);
    }

    protected void doSetOrderNum_NotInScope(Collection<Long> orderNumList) {
        regINS(CK_NINS, cTL(orderNumList), xgetCValueOrderNum(), "ORDER_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     */
    public void setOrderNum_IsNull() { regOrderNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     */
    public void setOrderNum_IsNotNull() { regOrderNum(CK_ISNN, DOBJ); }

    protected void regOrderNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderNum(), "ORDER_NUM"); }
    protected abstract ConditionValue xgetCValueOrderNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPrice The value of unitPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_Equal(Long unitPrice) {
        doSetUnitPrice_Equal(unitPrice);
    }

    protected void doSetUnitPrice_Equal(Long unitPrice) {
        regUnitPrice(CK_EQ, unitPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPrice The value of unitPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_NotEqual(Long unitPrice) {
        doSetUnitPrice_NotEqual(unitPrice);
    }

    protected void doSetUnitPrice_NotEqual(Long unitPrice) {
        regUnitPrice(CK_NES, unitPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPrice The value of unitPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_GreaterThan(Long unitPrice) {
        regUnitPrice(CK_GT, unitPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPrice The value of unitPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_LessThan(Long unitPrice) {
        regUnitPrice(CK_LT, unitPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPrice The value of unitPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_GreaterEqual(Long unitPrice) {
        regUnitPrice(CK_GE, unitPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPrice The value of unitPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_LessEqual(Long unitPrice) {
        regUnitPrice(CK_LE, unitPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param minNumber The min number of unitPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unitPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnitPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnitPrice(), "UNIT_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPriceList The collection of unitPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_InScope(Collection<Long> unitPriceList) {
        doSetUnitPrice_InScope(unitPriceList);
    }

    protected void doSetUnitPrice_InScope(Collection<Long> unitPriceList) {
        regINS(CK_INS, cTL(unitPriceList), xgetCValueUnitPrice(), "UNIT_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPriceList The collection of unitPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_NotInScope(Collection<Long> unitPriceList) {
        doSetUnitPrice_NotInScope(unitPriceList);
    }

    protected void doSetUnitPrice_NotInScope(Collection<Long> unitPriceList) {
        regINS(CK_NINS, cTL(unitPriceList), xgetCValueUnitPrice(), "UNIT_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     */
    public void setUnitPrice_IsNull() { regUnitPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     */
    public void setUnitPrice_IsNotNull() { regUnitPrice(CK_ISNN, DOBJ); }

    protected void regUnitPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitPrice(), "UNIT_PRICE"); }
    protected abstract ConditionValue xgetCValueUnitPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_TOTAL_PRICE: {bigint(19)}
     * @param unitTotalPrice The value of unitTotalPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitTotalPrice_Equal(Long unitTotalPrice) {
        doSetUnitTotalPrice_Equal(unitTotalPrice);
    }

    protected void doSetUnitTotalPrice_Equal(Long unitTotalPrice) {
        regUnitTotalPrice(CK_EQ, unitTotalPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_TOTAL_PRICE: {bigint(19)}
     * @param unitTotalPrice The value of unitTotalPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitTotalPrice_NotEqual(Long unitTotalPrice) {
        doSetUnitTotalPrice_NotEqual(unitTotalPrice);
    }

    protected void doSetUnitTotalPrice_NotEqual(Long unitTotalPrice) {
        regUnitTotalPrice(CK_NES, unitTotalPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_TOTAL_PRICE: {bigint(19)}
     * @param unitTotalPrice The value of unitTotalPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitTotalPrice_GreaterThan(Long unitTotalPrice) {
        regUnitTotalPrice(CK_GT, unitTotalPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_TOTAL_PRICE: {bigint(19)}
     * @param unitTotalPrice The value of unitTotalPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitTotalPrice_LessThan(Long unitTotalPrice) {
        regUnitTotalPrice(CK_LT, unitTotalPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_TOTAL_PRICE: {bigint(19)}
     * @param unitTotalPrice The value of unitTotalPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitTotalPrice_GreaterEqual(Long unitTotalPrice) {
        regUnitTotalPrice(CK_GE, unitTotalPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_TOTAL_PRICE: {bigint(19)}
     * @param unitTotalPrice The value of unitTotalPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitTotalPrice_LessEqual(Long unitTotalPrice) {
        regUnitTotalPrice(CK_LE, unitTotalPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_TOTAL_PRICE: {bigint(19)}
     * @param minNumber The min number of unitTotalPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unitTotalPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnitTotalPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnitTotalPrice(), "UNIT_TOTAL_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_TOTAL_PRICE: {bigint(19)}
     * @param unitTotalPriceList The collection of unitTotalPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitTotalPrice_InScope(Collection<Long> unitTotalPriceList) {
        doSetUnitTotalPrice_InScope(unitTotalPriceList);
    }

    protected void doSetUnitTotalPrice_InScope(Collection<Long> unitTotalPriceList) {
        regINS(CK_INS, cTL(unitTotalPriceList), xgetCValueUnitTotalPrice(), "UNIT_TOTAL_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_TOTAL_PRICE: {bigint(19)}
     * @param unitTotalPriceList The collection of unitTotalPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitTotalPrice_NotInScope(Collection<Long> unitTotalPriceList) {
        doSetUnitTotalPrice_NotInScope(unitTotalPriceList);
    }

    protected void doSetUnitTotalPrice_NotInScope(Collection<Long> unitTotalPriceList) {
        regINS(CK_NINS, cTL(unitTotalPriceList), xgetCValueUnitTotalPrice(), "UNIT_TOTAL_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_TOTAL_PRICE: {bigint(19)}
     */
    public void setUnitTotalPrice_IsNull() { regUnitTotalPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_TOTAL_PRICE: {bigint(19)}
     */
    public void setUnitTotalPrice_IsNotNull() { regUnitTotalPrice(CK_ISNN, DOBJ); }

    protected void regUnitTotalPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitTotalPrice(), "UNIT_TOTAL_PRICE"); }
    protected abstract ConditionValue xgetCValueUnitTotalPrice();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlg The value of errorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal(String errorFlg) {
        doSetErrorFlg_Equal(fRES(errorFlg));
    }

    /**
     * Equal(=). As ErrorFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal_AsErrorFlg(CDef.ErrorFlg cdef) {
        doSetErrorFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: エラー無
     */
    public void setErrorFlg_Equal_$0() {
        setErrorFlg_Equal_AsErrorFlg(CDef.ErrorFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: エラー有
     */
    public void setErrorFlg_Equal_$1() {
        setErrorFlg_Equal_AsErrorFlg(CDef.ErrorFlg.$1);
    }

    protected void doSetErrorFlg_Equal(String errorFlg) {
        regErrorFlg(CK_EQ, errorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlg The value of errorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual(String errorFlg) {
        doSetErrorFlg_NotEqual(fRES(errorFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ErrorFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual_AsErrorFlg(CDef.ErrorFlg cdef) {
        doSetErrorFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: エラー無
     */
    public void setErrorFlg_NotEqual_$0() {
        setErrorFlg_NotEqual_AsErrorFlg(CDef.ErrorFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: エラー有
     */
    public void setErrorFlg_NotEqual_$1() {
        setErrorFlg_NotEqual_AsErrorFlg(CDef.ErrorFlg.$1);
    }

    protected void doSetErrorFlg_NotEqual(String errorFlg) {
        regErrorFlg(CK_NES, errorFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlgList The collection of errorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope(Collection<String> errorFlgList) {
        doSetErrorFlg_InScope(errorFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ErrorFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope_AsErrorFlg(Collection<CDef.ErrorFlg> cdefList) {
        doSetErrorFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetErrorFlg_InScope(Collection<String> errorFlgList) {
        regINS(CK_INS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlgList The collection of errorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope(Collection<String> errorFlgList) {
        doSetErrorFlg_NotInScope(errorFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ErrorFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope_AsErrorFlg(Collection<CDef.ErrorFlg> cdefList) {
        doSetErrorFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetErrorFlg_NotInScope(Collection<String> errorFlgList) {
        regINS(CK_NINS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     */
    public void setErrorFlg_IsNull() { regErrorFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     */
    public void setErrorFlg_IsNotNull() { regErrorFlg(CK_ISNN, DOBJ); }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_Equal(String errorMessageCd) {
        doSetErrorMessageCd_Equal(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_Equal(String errorMessageCd) {
        regErrorMessageCd(CK_EQ, errorMessageCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotEqual(String errorMessageCd) {
        doSetErrorMessageCd_NotEqual(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_NotEqual(String errorMessageCd) {
        regErrorMessageCd(CK_NES, errorMessageCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterThan(String errorMessageCd) {
        regErrorMessageCd(CK_GT, fRES(errorMessageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessThan(String errorMessageCd) {
        regErrorMessageCd(CK_LT, fRES(errorMessageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterEqual(String errorMessageCd) {
        regErrorMessageCd(CK_GE, fRES(errorMessageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessEqual(String errorMessageCd) {
        regErrorMessageCd(CK_LE, fRES(errorMessageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCdList The collection of errorMessageCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_InScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        regINS(CK_INS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCdList The collection of errorMessageCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_NotInScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        regINS(CK_NINS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)} <br>
     * <pre>e.g. setErrorMessageCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorMessageCd The value of errorMessageCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorMessageCd_LikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMessageCd_NotLikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_PrefixSearch(String errorMessageCd) {
        setErrorMessageCd_LikeSearch(errorMessageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNull() { regErrorMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNullOrEmpty() { regErrorMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNotNull() { regErrorMessageCd(CK_ISNN, DOBJ); }

    protected void regErrorMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueErrorMessageCd();

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
    public HpSLCFunction<TEcOrderBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TEcOrderBCB.class);
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
    public HpSLCFunction<TEcOrderBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TEcOrderBCB.class);
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
    public HpSLCFunction<TEcOrderBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TEcOrderBCB.class);
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
    public HpSLCFunction<TEcOrderBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TEcOrderBCB.class);
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
    public HpSLCFunction<TEcOrderBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TEcOrderBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TEcOrderBCB&gt;() {
     *     public void query(TEcOrderBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TEcOrderBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TEcOrderBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TEcOrderBCQ sq);

    protected TEcOrderBCB xcreateScalarConditionCB() {
        TEcOrderBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TEcOrderBCB xcreateScalarConditionPartitionByCB() {
        TEcOrderBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TEcOrderBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderBCB cb = new TEcOrderBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "EC_ORDER_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TEcOrderBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TEcOrderBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TEcOrderBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TEcOrderBCB cb = new TEcOrderBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "EC_ORDER_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TEcOrderBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TEcOrderBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderBCB cb = new TEcOrderBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TEcOrderBCQ sq);

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
    protected TEcOrderBCB newMyCB() {
        return new TEcOrderBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TEcOrderBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

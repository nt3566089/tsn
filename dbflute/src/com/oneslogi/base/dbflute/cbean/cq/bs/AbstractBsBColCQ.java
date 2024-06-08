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
 * The abstract condition-query of B_COL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBColCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBColCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_COL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colId The value of colId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setColId_Equal(Long colId) {
        doSetColId_Equal(colId);
    }

    protected void doSetColId_Equal(Long colId) {
        regColId(CK_EQ, colId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colId The value of colId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColId_NotEqual(Long colId) {
        doSetColId_NotEqual(colId);
    }

    protected void doSetColId_NotEqual(Long colId) {
        regColId(CK_NES, colId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colId The value of colId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColId_GreaterThan(Long colId) {
        regColId(CK_GT, colId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colId The value of colId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColId_LessThan(Long colId) {
        regColId(CK_LT, colId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colId The value of colId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColId_GreaterEqual(Long colId) {
        regColId(CK_GE, colId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colId The value of colId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColId_LessEqual(Long colId) {
        regColId(CK_LE, colId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of colId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of colId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setColId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueColId(), "COL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colIdList The collection of colId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColId_InScope(Collection<Long> colIdList) {
        doSetColId_InScope(colIdList);
    }

    protected void doSetColId_InScope(Collection<Long> colIdList) {
        regINS(CK_INS, cTL(colIdList), xgetCValueColId(), "COL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colIdList The collection of colId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColId_NotInScope(Collection<Long> colIdList) {
        doSetColId_NotInScope(colIdList);
    }

    protected void doSetColId_NotInScope(Collection<Long> colIdList) {
        regINS(CK_NINS, cTL(colIdList), xgetCValueColId(), "COL_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select COL_ID from B_COL_ROLE where ...)} <br>
     * B_COL_ROLE by COL_ID, named 'BColRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBColRoleList</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BColRoleList for 'exists'. (NotNull)
     */
    public void existsBColRoleList(SubQuery<BColRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColRoleCB cb = new BColRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepColId_ExistsReferrer_BColRoleList(cb.query());
        registerExistsReferrer(cb.query(), "COL_ID", "COL_ID", pp, "bColRoleList");
    }
    public abstract String keepColId_ExistsReferrer_BColRoleList(BColRoleCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select COL_ID from B_COL_VALID where ...)} <br>
     * B_COL_VALID by COL_ID, named 'BColValidAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBColValidAsOne</span>(validCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     validCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BColValidAsOne for 'exists'. (NotNull)
     */
    public void existsBColValidAsOne(SubQuery<BColValidCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColValidCB cb = new BColValidCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepColId_ExistsReferrer_BColValidAsOne(cb.query());
        registerExistsReferrer(cb.query(), "COL_ID", "COL_ID", pp, "bColValidAsOne");
    }
    public abstract String keepColId_ExistsReferrer_BColValidAsOne(BColValidCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select COL_ID from M_CENTER_COL where ...)} <br>
     * M_CENTER_COL by COL_ID, named 'MCenterColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterColList</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterColList for 'exists'. (NotNull)
     */
    public void existsMCenterColList(SubQuery<MCenterColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterColCB cb = new MCenterColCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepColId_ExistsReferrer_MCenterColList(cb.query());
        registerExistsReferrer(cb.query(), "COL_ID", "COL_ID", pp, "mCenterColList");
    }
    public abstract String keepColId_ExistsReferrer_MCenterColList(MCenterColCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select COL_ID from M_CLIENT_COL where ...)} <br>
     * M_CLIENT_COL by COL_ID, named 'MClientColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMClientColList</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MClientColList for 'exists'. (NotNull)
     */
    public void existsMClientColList(SubQuery<MClientColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientColCB cb = new MClientColCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepColId_ExistsReferrer_MClientColList(cb.query());
        registerExistsReferrer(cb.query(), "COL_ID", "COL_ID", pp, "mClientColList");
    }
    public abstract String keepColId_ExistsReferrer_MClientColList(MClientColCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select COL_ID from B_COL_ROLE where ...)} <br>
     * B_COL_ROLE by COL_ID, named 'BColRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBColRoleList</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ColId_NotExistsReferrer_BColRoleList for 'not exists'. (NotNull)
     */
    public void notExistsBColRoleList(SubQuery<BColRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColRoleCB cb = new BColRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepColId_NotExistsReferrer_BColRoleList(cb.query());
        registerNotExistsReferrer(cb.query(), "COL_ID", "COL_ID", pp, "bColRoleList");
    }
    public abstract String keepColId_NotExistsReferrer_BColRoleList(BColRoleCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select COL_ID from B_COL_VALID where ...)} <br>
     * B_COL_VALID by COL_ID, named 'BColValidAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBColValidAsOne</span>(validCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     validCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ColId_NotExistsReferrer_BColValidAsOne for 'not exists'. (NotNull)
     */
    public void notExistsBColValidAsOne(SubQuery<BColValidCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColValidCB cb = new BColValidCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepColId_NotExistsReferrer_BColValidAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "COL_ID", "COL_ID", pp, "bColValidAsOne");
    }
    public abstract String keepColId_NotExistsReferrer_BColValidAsOne(BColValidCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select COL_ID from M_CENTER_COL where ...)} <br>
     * M_CENTER_COL by COL_ID, named 'MCenterColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterColList</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ColId_NotExistsReferrer_MCenterColList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterColList(SubQuery<MCenterColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterColCB cb = new MCenterColCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepColId_NotExistsReferrer_MCenterColList(cb.query());
        registerNotExistsReferrer(cb.query(), "COL_ID", "COL_ID", pp, "mCenterColList");
    }
    public abstract String keepColId_NotExistsReferrer_MCenterColList(MCenterColCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select COL_ID from M_CLIENT_COL where ...)} <br>
     * M_CLIENT_COL by COL_ID, named 'MClientColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClientColList</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ColId_NotExistsReferrer_MClientColList for 'not exists'. (NotNull)
     */
    public void notExistsMClientColList(SubQuery<MClientColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientColCB cb = new MClientColCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepColId_NotExistsReferrer_MClientColList(cb.query());
        registerNotExistsReferrer(cb.query(), "COL_ID", "COL_ID", pp, "mClientColList");
    }
    public abstract String keepColId_NotExistsReferrer_MClientColList(MClientColCQ sq);

    public void xsderiveBColRoleList(String fn, SubQuery<BColRoleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColRoleCB cb = new BColRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepColId_SpecifyDerivedReferrer_BColRoleList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COL_ID", "COL_ID", pp, "bColRoleList", al, op);
    }
    public abstract String keepColId_SpecifyDerivedReferrer_BColRoleList(BColRoleCQ sq);

    public void xsderiveMCenterColList(String fn, SubQuery<MCenterColCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterColCB cb = new MCenterColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepColId_SpecifyDerivedReferrer_MCenterColList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COL_ID", "COL_ID", pp, "mCenterColList", al, op);
    }
    public abstract String keepColId_SpecifyDerivedReferrer_MCenterColList(MCenterColCQ sq);

    public void xsderiveMClientColList(String fn, SubQuery<MClientColCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientColCB cb = new MClientColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepColId_SpecifyDerivedReferrer_MClientColList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COL_ID", "COL_ID", pp, "mClientColList", al, op);
    }
    public abstract String keepColId_SpecifyDerivedReferrer_MClientColList(MClientColCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_COL_ROLE where ...)} <br>
     * B_COL_ROLE by COL_ID, named 'BColRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBColRoleList()</span>.<span style="color: #CC4747">max</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     roleCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BColRoleCB> derivedBColRoleList() {
        return xcreateQDRFunctionBColRoleList();
    }
    protected HpQDRFunction<BColRoleCB> xcreateQDRFunctionBColRoleList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBColRoleList(fn, sq, rd, vl, op));
    }
    public void xqderiveBColRoleList(String fn, SubQuery<BColRoleCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColRoleCB cb = new BColRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepColId_QueryDerivedReferrer_BColRoleList(cb.query()); String prpp = keepColId_QueryDerivedReferrer_BColRoleListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COL_ID", "COL_ID", sqpp, "bColRoleList", rd, vl, prpp, op);
    }
    public abstract String keepColId_QueryDerivedReferrer_BColRoleList(BColRoleCQ sq);
    public abstract String keepColId_QueryDerivedReferrer_BColRoleListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CENTER_COL where ...)} <br>
     * M_CENTER_COL by COL_ID, named 'MCenterColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterColList()</span>.<span style="color: #CC4747">max</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     colCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterColCB> derivedMCenterColList() {
        return xcreateQDRFunctionMCenterColList();
    }
    protected HpQDRFunction<MCenterColCB> xcreateQDRFunctionMCenterColList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterColList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterColList(String fn, SubQuery<MCenterColCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterColCB cb = new MCenterColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepColId_QueryDerivedReferrer_MCenterColList(cb.query()); String prpp = keepColId_QueryDerivedReferrer_MCenterColListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COL_ID", "COL_ID", sqpp, "mCenterColList", rd, vl, prpp, op);
    }
    public abstract String keepColId_QueryDerivedReferrer_MCenterColList(MCenterColCQ sq);
    public abstract String keepColId_QueryDerivedReferrer_MCenterColListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CLIENT_COL where ...)} <br>
     * M_CLIENT_COL by COL_ID, named 'MClientColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMClientColList()</span>.<span style="color: #CC4747">max</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     colCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MClientColCB> derivedMClientColList() {
        return xcreateQDRFunctionMClientColList();
    }
    protected HpQDRFunction<MClientColCB> xcreateQDRFunctionMClientColList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMClientColList(fn, sq, rd, vl, op));
    }
    public void xqderiveMClientColList(String fn, SubQuery<MClientColCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientColCB cb = new MClientColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepColId_QueryDerivedReferrer_MClientColList(cb.query()); String prpp = keepColId_QueryDerivedReferrer_MClientColListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COL_ID", "COL_ID", sqpp, "mClientColList", rd, vl, prpp, op);
    }
    public abstract String keepColId_QueryDerivedReferrer_MClientColList(MClientColCQ sq);
    public abstract String keepColId_QueryDerivedReferrer_MClientColListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setColId_IsNull() { regColId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setColId_IsNotNull() { regColId(CK_ISNN, DOBJ); }

    protected void regColId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColId(), "COL_ID"); }
    protected abstract ConditionValue xgetCValueColId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM}
     * @param itemId The value of itemId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_Equal(Long itemId) {
        doSetItemId_Equal(itemId);
    }

    protected void doSetItemId_Equal(Long itemId) {
        regItemId(CK_EQ, itemId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM}
     * @param itemId The value of itemId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_NotEqual(Long itemId) {
        doSetItemId_NotEqual(itemId);
    }

    protected void doSetItemId_NotEqual(Long itemId) {
        regItemId(CK_NES, itemId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM}
     * @param itemId The value of itemId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_GreaterThan(Long itemId) {
        regItemId(CK_GT, itemId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM}
     * @param itemId The value of itemId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_LessThan(Long itemId) {
        regItemId(CK_LT, itemId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM}
     * @param itemId The value of itemId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_GreaterEqual(Long itemId) {
        regItemId(CK_GE, itemId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM}
     * @param itemId The value of itemId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_LessEqual(Long itemId) {
        regItemId(CK_LE, itemId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM}
     * @param minNumber The min number of itemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of itemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setItemId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueItemId(), "ITEM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM}
     * @param itemIdList The collection of itemId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemId_InScope(Collection<Long> itemIdList) {
        doSetItemId_InScope(itemIdList);
    }

    protected void doSetItemId_InScope(Collection<Long> itemIdList) {
        regINS(CK_INS, cTL(itemIdList), xgetCValueItemId(), "ITEM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM}
     * @param itemIdList The collection of itemId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemId_NotInScope(Collection<Long> itemIdList) {
        doSetItemId_NotInScope(itemIdList);
    }

    protected void doSetItemId_NotInScope(Collection<Long> itemIdList) {
        regINS(CK_NINS, cTL(itemIdList), xgetCValueItemId(), "ITEM_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ITEM_ID from B_ITEM where ...)} <br />
     * B_ITEM by my ITEM_ID, named 'BItem'.
     * @param subCBLambda The callback for sub-query of BItem for 'in-scope'. (NotNull)
     */
    public void inScopeBItem(SubQuery<BItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BItemCB cb = new BItemCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepItemId_InScopeRelation_BItem(cb.query());
        registerInScopeRelation(cb.query(), "ITEM_ID", "ITEM_ID", pp, "bItem", false);
    }
    public abstract String keepItemId_InScopeRelation_BItem(BItemCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ITEM_ID from B_ITEM where ...)} <br />
     * B_ITEM by my ITEM_ID, named 'BItem'.
     * @param subCBLambda The callback for sub-query of BItem for 'not in-scope'. (NotNull)
     */
    public void notInScopeBItem(SubQuery<BItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BItemCB cb = new BItemCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepItemId_NotInScopeRelation_BItem(cb.query());
        registerInScopeRelation(cb.query(), "ITEM_ID", "ITEM_ID", pp, "bItem", true);
    }
    public abstract String keepItemId_NotInScopeRelation_BItem(BItemCQ sq);

    protected void regItemId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemId(), "ITEM_ID"); }
    protected abstract ConditionValue xgetCValueItemId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, varchar(100)}
     * @param colCd The value of colCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_Equal(String colCd) {
        doSetColCd_Equal(fRES(colCd));
    }

    protected void doSetColCd_Equal(String colCd) {
        regColCd(CK_EQ, colCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, varchar(100)}
     * @param colCd The value of colCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_NotEqual(String colCd) {
        doSetColCd_NotEqual(fRES(colCd));
    }

    protected void doSetColCd_NotEqual(String colCd) {
        regColCd(CK_NES, colCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, varchar(100)}
     * @param colCd The value of colCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_GreaterThan(String colCd) {
        regColCd(CK_GT, fRES(colCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, varchar(100)}
     * @param colCd The value of colCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_LessThan(String colCd) {
        regColCd(CK_LT, fRES(colCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, varchar(100)}
     * @param colCd The value of colCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_GreaterEqual(String colCd) {
        regColCd(CK_GE, fRES(colCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, varchar(100)}
     * @param colCd The value of colCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_LessEqual(String colCd) {
        regColCd(CK_LE, fRES(colCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COL_CD: {+UQ, varchar(100)}
     * @param colCdList The collection of colCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_InScope(Collection<String> colCdList) {
        doSetColCd_InScope(colCdList);
    }

    protected void doSetColCd_InScope(Collection<String> colCdList) {
        regINS(CK_INS, cTL(colCdList), xgetCValueColCd(), "COL_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COL_CD: {+UQ, varchar(100)}
     * @param colCdList The collection of colCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_NotInScope(Collection<String> colCdList) {
        doSetColCd_NotInScope(colCdList);
    }

    protected void doSetColCd_NotInScope(Collection<String> colCdList) {
        regINS(CK_NINS, cTL(colCdList), xgetCValueColCd(), "COL_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COL_CD: {+UQ, varchar(100)} <br>
     * <pre>e.g. setColCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param colCd The value of colCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setColCd_LikeSearch(String colCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(colCd), xgetCValueColCd(), "COL_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COL_CD: {+UQ, varchar(100)}
     * @param colCd The value of colCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setColCd_NotLikeSearch(String colCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(colCd), xgetCValueColCd(), "COL_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COL_CD: {+UQ, varchar(100)}
     * @param colCd The value of colCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_PrefixSearch(String colCd) {
        setColCd_LikeSearch(colCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, varchar(100)}
     */
    public void setColCd_IsNull() { regColCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, varchar(100)}
     */
    public void setColCd_IsNullOrEmpty() { regColCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, varchar(100)}
     */
    public void setColCd_IsNotNull() { regColCd(CK_ISNN, DOBJ); }

    protected void regColCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColCd(), "COL_CD"); }
    protected abstract ConditionValue xgetCValueColCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_Equal(Long dictId) {
        doSetDictId_Equal(dictId);
    }

    protected void doSetDictId_Equal(Long dictId) {
        regDictId(CK_EQ, dictId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_NotEqual(Long dictId) {
        doSetDictId_NotEqual(dictId);
    }

    protected void doSetDictId_NotEqual(Long dictId) {
        regDictId(CK_NES, dictId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterThan(Long dictId) {
        regDictId(CK_GT, dictId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessThan(Long dictId) {
        regDictId(CK_LT, dictId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterEqual(Long dictId) {
        regDictId(CK_GE, dictId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessEqual(Long dictId) {
        regDictId(CK_LE, dictId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param minNumber The min number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDictId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDictId(), "DICT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictIdList The collection of dictId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictId_InScope(Collection<Long> dictIdList) {
        doSetDictId_InScope(dictIdList);
    }

    protected void doSetDictId_InScope(Collection<Long> dictIdList) {
        regINS(CK_INS, cTL(dictIdList), xgetCValueDictId(), "DICT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictIdList The collection of dictId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictId_NotInScope(Collection<Long> dictIdList) {
        doSetDictId_NotInScope(dictIdList);
    }

    protected void doSetDictId_NotInScope(Collection<Long> dictIdList) {
        regINS(CK_NINS, cTL(dictIdList), xgetCValueDictId(), "DICT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DICT_ID from B_DICT where ...)} <br />
     * B_DICT by my DICT_ID, named 'BDict'.
     * @param subCBLambda The callback for sub-query of BDict for 'in-scope'. (NotNull)
     */
    public void inScopeBDict(SubQuery<BDictCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictCB cb = new BDictCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDictId_InScopeRelation_BDict(cb.query());
        registerInScopeRelation(cb.query(), "DICT_ID", "DICT_ID", pp, "bDict", false);
    }
    public abstract String keepDictId_InScopeRelation_BDict(BDictCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DICT_ID from B_DICT where ...)} <br />
     * B_DICT by my DICT_ID, named 'BDict'.
     * @param subCBLambda The callback for sub-query of BDict for 'not in-scope'. (NotNull)
     */
    public void notInScopeBDict(SubQuery<BDictCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictCB cb = new BDictCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDictId_NotInScopeRelation_BDict(cb.query());
        registerInScopeRelation(cb.query(), "DICT_ID", "DICT_ID", pp, "bDict", true);
    }
    public abstract String keepDictId_NotInScopeRelation_BDict(BDictCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     */
    public void setDictId_IsNull() { regDictId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     */
    public void setDictId_IsNotNull() { regDictId(CK_ISNN, DOBJ); }

    protected void regDictId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDictId(), "DICT_ID"); }
    protected abstract ConditionValue xgetCValueDictId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrder The value of colOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setColOrder_Equal(Long colOrder) {
        doSetColOrder_Equal(colOrder);
    }

    protected void doSetColOrder_Equal(Long colOrder) {
        regColOrder(CK_EQ, colOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrder The value of colOrder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColOrder_NotEqual(Long colOrder) {
        doSetColOrder_NotEqual(colOrder);
    }

    protected void doSetColOrder_NotEqual(Long colOrder) {
        regColOrder(CK_NES, colOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrder The value of colOrder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColOrder_GreaterThan(Long colOrder) {
        regColOrder(CK_GT, colOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrder The value of colOrder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColOrder_LessThan(Long colOrder) {
        regColOrder(CK_LT, colOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrder The value of colOrder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColOrder_GreaterEqual(Long colOrder) {
        regColOrder(CK_GE, colOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrder The value of colOrder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColOrder_LessEqual(Long colOrder) {
        regColOrder(CK_LE, colOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param minNumber The min number of colOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of colOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setColOrder_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueColOrder(), "COL_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrderList The collection of colOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColOrder_InScope(Collection<Long> colOrderList) {
        doSetColOrder_InScope(colOrderList);
    }

    protected void doSetColOrder_InScope(Collection<Long> colOrderList) {
        regINS(CK_INS, cTL(colOrderList), xgetCValueColOrder(), "COL_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrderList The collection of colOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColOrder_NotInScope(Collection<Long> colOrderList) {
        doSetColOrder_NotInScope(colOrderList);
    }

    protected void doSetColOrder_NotInScope(Collection<Long> colOrderList) {
        regINS(CK_NINS, cTL(colOrderList), xgetCValueColOrder(), "COL_ORDER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     */
    public void setColOrder_IsNull() { regColOrder(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     */
    public void setColOrder_IsNotNull() { regColOrder(CK_ISNN, DOBJ); }

    protected void regColOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColOrder(), "COL_ORDER"); }
    protected abstract ConditionValue xgetCValueColOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType}
     * @param colType The value of colType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColType_Equal(String colType) {
        doSetColType_Equal(fRES(colType));
    }

    /**
     * Equal(=). As ColType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType} <br>
     * 列型
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setColType_Equal_AsColType(CDef.ColType cdef) {
        doSetColType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $calcnumber (calcnumber). And OnlyOnceRegistered. <br>
     * $calcnumber: 計算数値
     */
    public void setColType_Equal_$calcnumber() {
        setColType_Equal_AsColType(CDef.ColType.$calcnumber);
    }

    /**
     * Equal(=). As $checkbox (checkbox). And OnlyOnceRegistered. <br>
     * $checkbox: チェックボックス
     */
    public void setColType_Equal_$checkbox() {
        setColType_Equal_AsColType(CDef.ColType.$checkbox);
    }

    /**
     * Equal(=). As $date (date). And OnlyOnceRegistered. <br>
     * $date: 日付
     */
    public void setColType_Equal_$date() {
        setColType_Equal_AsColType(CDef.ColType.$date);
    }

    /**
     * Equal(=). As $datetime (datetime). And OnlyOnceRegistered. <br>
     * $datetime: 日時
     */
    public void setColType_Equal_$datetime() {
        setColType_Equal_AsColType(CDef.ColType.$datetime);
    }

    /**
     * Equal(=). As $dropdown (dropdown). And OnlyOnceRegistered. <br>
     * $dropdown: コンボボックス
     */
    public void setColType_Equal_$dropdown() {
        setColType_Equal_AsColType(CDef.ColType.$dropdown);
    }

    /**
     * Equal(=). As $number (number). And OnlyOnceRegistered. <br>
     * $number: 数値
     */
    public void setColType_Equal_$number() {
        setColType_Equal_AsColType(CDef.ColType.$number);
    }

    /**
     * Equal(=). As $text (text). And OnlyOnceRegistered. <br>
     * $text: テキスト
     */
    public void setColType_Equal_$text() {
        setColType_Equal_AsColType(CDef.ColType.$text);
    }

    protected void doSetColType_Equal(String colType) {
        regColType(CK_EQ, colType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType}
     * @param colType The value of colType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColType_NotEqual(String colType) {
        doSetColType_NotEqual(fRES(colType));
    }

    /**
     * NotEqual(&lt;&gt;). As ColType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType} <br>
     * 列型
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setColType_NotEqual_AsColType(CDef.ColType cdef) {
        doSetColType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $calcnumber (calcnumber). And OnlyOnceRegistered. <br>
     * $calcnumber: 計算数値
     */
    public void setColType_NotEqual_$calcnumber() {
        setColType_NotEqual_AsColType(CDef.ColType.$calcnumber);
    }

    /**
     * NotEqual(&lt;&gt;). As $checkbox (checkbox). And OnlyOnceRegistered. <br>
     * $checkbox: チェックボックス
     */
    public void setColType_NotEqual_$checkbox() {
        setColType_NotEqual_AsColType(CDef.ColType.$checkbox);
    }

    /**
     * NotEqual(&lt;&gt;). As $date (date). And OnlyOnceRegistered. <br>
     * $date: 日付
     */
    public void setColType_NotEqual_$date() {
        setColType_NotEqual_AsColType(CDef.ColType.$date);
    }

    /**
     * NotEqual(&lt;&gt;). As $datetime (datetime). And OnlyOnceRegistered. <br>
     * $datetime: 日時
     */
    public void setColType_NotEqual_$datetime() {
        setColType_NotEqual_AsColType(CDef.ColType.$datetime);
    }

    /**
     * NotEqual(&lt;&gt;). As $dropdown (dropdown). And OnlyOnceRegistered. <br>
     * $dropdown: コンボボックス
     */
    public void setColType_NotEqual_$dropdown() {
        setColType_NotEqual_AsColType(CDef.ColType.$dropdown);
    }

    /**
     * NotEqual(&lt;&gt;). As $number (number). And OnlyOnceRegistered. <br>
     * $number: 数値
     */
    public void setColType_NotEqual_$number() {
        setColType_NotEqual_AsColType(CDef.ColType.$number);
    }

    /**
     * NotEqual(&lt;&gt;). As $text (text). And OnlyOnceRegistered. <br>
     * $text: テキスト
     */
    public void setColType_NotEqual_$text() {
        setColType_NotEqual_AsColType(CDef.ColType.$text);
    }

    protected void doSetColType_NotEqual(String colType) {
        regColType(CK_NES, colType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType}
     * @param colTypeList The collection of colType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColType_InScope(Collection<String> colTypeList) {
        doSetColType_InScope(colTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As ColType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType} <br>
     * 列型
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColType_InScope_AsColType(Collection<CDef.ColType> cdefList) {
        doSetColType_InScope(cTStrL(cdefList));
    }

    protected void doSetColType_InScope(Collection<String> colTypeList) {
        regINS(CK_INS, cTL(colTypeList), xgetCValueColType(), "COL_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType}
     * @param colTypeList The collection of colType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColType_NotInScope(Collection<String> colTypeList) {
        doSetColType_NotInScope(colTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ColType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType} <br>
     * 列型
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColType_NotInScope_AsColType(Collection<CDef.ColType> cdefList) {
        doSetColType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetColType_NotInScope(Collection<String> colTypeList) {
        regINS(CK_NINS, cTL(colTypeList), xgetCValueColType(), "COL_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType}
     */
    public void setColType_IsNull() { regColType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType}
     */
    public void setColType_IsNullOrEmpty() { regColType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType}
     */
    public void setColType_IsNotNull() { regColType(CK_ISNN, DOBJ); }

    protected void regColType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColType(), "COL_TYPE"); }
    protected abstract ConditionValue xgetCValueColType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @param visible The value of visible as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_Equal(String visible) {
        doSetVisible_Equal(fRES(visible));
    }

    /**
     * Equal(=). As Visible. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setVisible_Equal_AsVisible(CDef.Visible cdef) {
        doSetVisible_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 非表示
     */
    public void setVisible_Equal_$0() {
        setVisible_Equal_AsVisible(CDef.Visible.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 表示
     */
    public void setVisible_Equal_$1() {
        setVisible_Equal_AsVisible(CDef.Visible.$1);
    }

    protected void doSetVisible_Equal(String visible) {
        regVisible(CK_EQ, visible);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @param visible The value of visible as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_NotEqual(String visible) {
        doSetVisible_NotEqual(fRES(visible));
    }

    /**
     * NotEqual(&lt;&gt;). As Visible. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setVisible_NotEqual_AsVisible(CDef.Visible cdef) {
        doSetVisible_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 非表示
     */
    public void setVisible_NotEqual_$0() {
        setVisible_NotEqual_AsVisible(CDef.Visible.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 表示
     */
    public void setVisible_NotEqual_$1() {
        setVisible_NotEqual_AsVisible(CDef.Visible.$1);
    }

    protected void doSetVisible_NotEqual(String visible) {
        regVisible(CK_NES, visible);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @param visibleList The collection of visible as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_InScope(Collection<String> visibleList) {
        doSetVisible_InScope(visibleList);
    }

    /**
     * InScope {in ('a', 'b')}. As Visible. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_InScope_AsVisible(Collection<CDef.Visible> cdefList) {
        doSetVisible_InScope(cTStrL(cdefList));
    }

    protected void doSetVisible_InScope(Collection<String> visibleList) {
        regINS(CK_INS, cTL(visibleList), xgetCValueVisible(), "VISIBLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @param visibleList The collection of visible as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_NotInScope(Collection<String> visibleList) {
        doSetVisible_NotInScope(visibleList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Visible. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisible_NotInScope_AsVisible(Collection<CDef.Visible> cdefList) {
        doSetVisible_NotInScope(cTStrL(cdefList));
    }

    protected void doSetVisible_NotInScope(Collection<String> visibleList) {
        regINS(CK_NINS, cTL(visibleList), xgetCValueVisible(), "VISIBLE");
    }

    protected void regVisible(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVisible(), "VISIBLE"); }
    protected abstract ConditionValue xgetCValueVisible();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable}
     * @param editable The value of editable as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEditable_Equal(String editable) {
        doSetEditable_Equal(fRES(editable));
    }

    /**
     * Equal(=). As Editable. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEditable_Equal_AsEditable(CDef.Editable cdef) {
        doSetEditable_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 編集不可
     */
    public void setEditable_Equal_$0() {
        setEditable_Equal_AsEditable(CDef.Editable.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 編集可
     */
    public void setEditable_Equal_$1() {
        setEditable_Equal_AsEditable(CDef.Editable.$1);
    }

    protected void doSetEditable_Equal(String editable) {
        regEditable(CK_EQ, editable);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable}
     * @param editable The value of editable as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEditable_NotEqual(String editable) {
        doSetEditable_NotEqual(fRES(editable));
    }

    /**
     * NotEqual(&lt;&gt;). As Editable. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEditable_NotEqual_AsEditable(CDef.Editable cdef) {
        doSetEditable_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 編集不可
     */
    public void setEditable_NotEqual_$0() {
        setEditable_NotEqual_AsEditable(CDef.Editable.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 編集可
     */
    public void setEditable_NotEqual_$1() {
        setEditable_NotEqual_AsEditable(CDef.Editable.$1);
    }

    protected void doSetEditable_NotEqual(String editable) {
        regEditable(CK_NES, editable);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable}
     * @param editableList The collection of editable as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEditable_InScope(Collection<String> editableList) {
        doSetEditable_InScope(editableList);
    }

    /**
     * InScope {in ('a', 'b')}. As Editable. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEditable_InScope_AsEditable(Collection<CDef.Editable> cdefList) {
        doSetEditable_InScope(cTStrL(cdefList));
    }

    protected void doSetEditable_InScope(Collection<String> editableList) {
        regINS(CK_INS, cTL(editableList), xgetCValueEditable(), "EDITABLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable}
     * @param editableList The collection of editable as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEditable_NotInScope(Collection<String> editableList) {
        doSetEditable_NotInScope(editableList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Editable. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEditable_NotInScope_AsEditable(Collection<CDef.Editable> cdefList) {
        doSetEditable_NotInScope(cTStrL(cdefList));
    }

    protected void doSetEditable_NotInScope(Collection<String> editableList) {
        regINS(CK_NINS, cTL(editableList), xgetCValueEditable(), "EDITABLE");
    }

    protected void regEditable(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEditable(), "EDITABLE"); }
    protected abstract ConditionValue xgetCValueEditable();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign}
     * @param textAlign The value of textAlign as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTextAlign_Equal(String textAlign) {
        doSetTextAlign_Equal(fRES(textAlign));
    }

    /**
     * Equal(=). As TextAlign. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign} <br>
     * 表示位置
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTextAlign_Equal_AsTextAlign(CDef.TextAlign cdef) {
        doSetTextAlign_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $center (center). And OnlyOnceRegistered. <br>
     * $center: 中央揃え
     */
    public void setTextAlign_Equal_$center() {
        setTextAlign_Equal_AsTextAlign(CDef.TextAlign.$center);
    }

    /**
     * Equal(=). As $left (left). And OnlyOnceRegistered. <br>
     * $left: 左寄せ
     */
    public void setTextAlign_Equal_$left() {
        setTextAlign_Equal_AsTextAlign(CDef.TextAlign.$left);
    }

    /**
     * Equal(=). As $right (right). And OnlyOnceRegistered. <br>
     * $right: 右寄せ
     */
    public void setTextAlign_Equal_$right() {
        setTextAlign_Equal_AsTextAlign(CDef.TextAlign.$right);
    }

    protected void doSetTextAlign_Equal(String textAlign) {
        regTextAlign(CK_EQ, textAlign);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign}
     * @param textAlign The value of textAlign as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTextAlign_NotEqual(String textAlign) {
        doSetTextAlign_NotEqual(fRES(textAlign));
    }

    /**
     * NotEqual(&lt;&gt;). As TextAlign. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign} <br>
     * 表示位置
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTextAlign_NotEqual_AsTextAlign(CDef.TextAlign cdef) {
        doSetTextAlign_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $center (center). And OnlyOnceRegistered. <br>
     * $center: 中央揃え
     */
    public void setTextAlign_NotEqual_$center() {
        setTextAlign_NotEqual_AsTextAlign(CDef.TextAlign.$center);
    }

    /**
     * NotEqual(&lt;&gt;). As $left (left). And OnlyOnceRegistered. <br>
     * $left: 左寄せ
     */
    public void setTextAlign_NotEqual_$left() {
        setTextAlign_NotEqual_AsTextAlign(CDef.TextAlign.$left);
    }

    /**
     * NotEqual(&lt;&gt;). As $right (right). And OnlyOnceRegistered. <br>
     * $right: 右寄せ
     */
    public void setTextAlign_NotEqual_$right() {
        setTextAlign_NotEqual_AsTextAlign(CDef.TextAlign.$right);
    }

    protected void doSetTextAlign_NotEqual(String textAlign) {
        regTextAlign(CK_NES, textAlign);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign}
     * @param textAlignList The collection of textAlign as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTextAlign_InScope(Collection<String> textAlignList) {
        doSetTextAlign_InScope(textAlignList);
    }

    /**
     * InScope {in ('a', 'b')}. As TextAlign. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign} <br>
     * 表示位置
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTextAlign_InScope_AsTextAlign(Collection<CDef.TextAlign> cdefList) {
        doSetTextAlign_InScope(cTStrL(cdefList));
    }

    protected void doSetTextAlign_InScope(Collection<String> textAlignList) {
        regINS(CK_INS, cTL(textAlignList), xgetCValueTextAlign(), "TEXT_ALIGN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign}
     * @param textAlignList The collection of textAlign as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTextAlign_NotInScope(Collection<String> textAlignList) {
        doSetTextAlign_NotInScope(textAlignList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As TextAlign. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign} <br>
     * 表示位置
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTextAlign_NotInScope_AsTextAlign(Collection<CDef.TextAlign> cdefList) {
        doSetTextAlign_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTextAlign_NotInScope(Collection<String> textAlignList) {
        regINS(CK_NINS, cTL(textAlignList), xgetCValueTextAlign(), "TEXT_ALIGN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign}
     */
    public void setTextAlign_IsNull() { regTextAlign(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign}
     */
    public void setTextAlign_IsNullOrEmpty() { regTextAlign(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign}
     */
    public void setTextAlign_IsNotNull() { regTextAlign(CK_ISNN, DOBJ); }

    protected void regTextAlign(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTextAlign(), "TEXT_ALIGN"); }
    protected abstract ConditionValue xgetCValueTextAlign();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary}
     * @param necessary The value of necessary as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_Equal(String necessary) {
        doSetNecessary_Equal(fRES(necessary));
    }

    /**
     * Equal(=). As Necessary. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary} <br>
     * 必須
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setNecessary_Equal_AsNecessary(CDef.Necessary cdef) {
        doSetNecessary_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 任意
     */
    public void setNecessary_Equal_$0() {
        setNecessary_Equal_AsNecessary(CDef.Necessary.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 必須
     */
    public void setNecessary_Equal_$1() {
        setNecessary_Equal_AsNecessary(CDef.Necessary.$1);
    }

    protected void doSetNecessary_Equal(String necessary) {
        regNecessary(CK_EQ, necessary);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary}
     * @param necessary The value of necessary as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_NotEqual(String necessary) {
        doSetNecessary_NotEqual(fRES(necessary));
    }

    /**
     * NotEqual(&lt;&gt;). As Necessary. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary} <br>
     * 必須
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setNecessary_NotEqual_AsNecessary(CDef.Necessary cdef) {
        doSetNecessary_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 任意
     */
    public void setNecessary_NotEqual_$0() {
        setNecessary_NotEqual_AsNecessary(CDef.Necessary.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 必須
     */
    public void setNecessary_NotEqual_$1() {
        setNecessary_NotEqual_AsNecessary(CDef.Necessary.$1);
    }

    protected void doSetNecessary_NotEqual(String necessary) {
        regNecessary(CK_NES, necessary);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary}
     * @param necessaryList The collection of necessary as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_InScope(Collection<String> necessaryList) {
        doSetNecessary_InScope(necessaryList);
    }

    /**
     * InScope {in ('a', 'b')}. As Necessary. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary} <br>
     * 必須
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_InScope_AsNecessary(Collection<CDef.Necessary> cdefList) {
        doSetNecessary_InScope(cTStrL(cdefList));
    }

    protected void doSetNecessary_InScope(Collection<String> necessaryList) {
        regINS(CK_INS, cTL(necessaryList), xgetCValueNecessary(), "NECESSARY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary}
     * @param necessaryList The collection of necessary as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_NotInScope(Collection<String> necessaryList) {
        doSetNecessary_NotInScope(necessaryList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Necessary. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary} <br>
     * 必須
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_NotInScope_AsNecessary(Collection<CDef.Necessary> cdefList) {
        doSetNecessary_NotInScope(cTStrL(cdefList));
    }

    protected void doSetNecessary_NotInScope(Collection<String> necessaryList) {
        regINS(CK_NINS, cTL(necessaryList), xgetCValueNecessary(), "NECESSARY");
    }

    protected void regNecessary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNecessary(), "NECESSARY"); }
    protected abstract ConditionValue xgetCValueNecessary();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidth The value of colWidth as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setColWidth_Equal(Long colWidth) {
        doSetColWidth_Equal(colWidth);
    }

    protected void doSetColWidth_Equal(Long colWidth) {
        regColWidth(CK_EQ, colWidth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidth The value of colWidth as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColWidth_NotEqual(Long colWidth) {
        doSetColWidth_NotEqual(colWidth);
    }

    protected void doSetColWidth_NotEqual(Long colWidth) {
        regColWidth(CK_NES, colWidth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidth The value of colWidth as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColWidth_GreaterThan(Long colWidth) {
        regColWidth(CK_GT, colWidth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidth The value of colWidth as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColWidth_LessThan(Long colWidth) {
        regColWidth(CK_LT, colWidth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidth The value of colWidth as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColWidth_GreaterEqual(Long colWidth) {
        regColWidth(CK_GE, colWidth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidth The value of colWidth as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColWidth_LessEqual(Long colWidth) {
        regColWidth(CK_LE, colWidth);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param minNumber The min number of colWidth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of colWidth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setColWidth_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueColWidth(), "COL_WIDTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidthList The collection of colWidth as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColWidth_InScope(Collection<Long> colWidthList) {
        doSetColWidth_InScope(colWidthList);
    }

    protected void doSetColWidth_InScope(Collection<Long> colWidthList) {
        regINS(CK_INS, cTL(colWidthList), xgetCValueColWidth(), "COL_WIDTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidthList The collection of colWidth as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColWidth_NotInScope(Collection<Long> colWidthList) {
        doSetColWidth_NotInScope(colWidthList);
    }

    protected void doSetColWidth_NotInScope(Collection<Long> colWidthList) {
        regINS(CK_NINS, cTL(colWidthList), xgetCValueColWidth(), "COL_WIDTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     */
    public void setColWidth_IsNull() { regColWidth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     */
    public void setColWidth_IsNotNull() { regColWidth(CK_ISNN, DOBJ); }

    protected void regColWidth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColWidth(), "COL_WIDTH"); }
    protected abstract ConditionValue xgetCValueColWidth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * IN_COL_INDEX: {bigint(19)}
     * @param inColIndex The value of inColIndex as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInColIndex_Equal(Long inColIndex) {
        doSetInColIndex_Equal(inColIndex);
    }

    protected void doSetInColIndex_Equal(Long inColIndex) {
        regInColIndex(CK_EQ, inColIndex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IN_COL_INDEX: {bigint(19)}
     * @param inColIndex The value of inColIndex as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInColIndex_NotEqual(Long inColIndex) {
        doSetInColIndex_NotEqual(inColIndex);
    }

    protected void doSetInColIndex_NotEqual(Long inColIndex) {
        regInColIndex(CK_NES, inColIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IN_COL_INDEX: {bigint(19)}
     * @param inColIndex The value of inColIndex as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInColIndex_GreaterThan(Long inColIndex) {
        regInColIndex(CK_GT, inColIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IN_COL_INDEX: {bigint(19)}
     * @param inColIndex The value of inColIndex as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInColIndex_LessThan(Long inColIndex) {
        regInColIndex(CK_LT, inColIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IN_COL_INDEX: {bigint(19)}
     * @param inColIndex The value of inColIndex as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInColIndex_GreaterEqual(Long inColIndex) {
        regInColIndex(CK_GE, inColIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IN_COL_INDEX: {bigint(19)}
     * @param inColIndex The value of inColIndex as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInColIndex_LessEqual(Long inColIndex) {
        regInColIndex(CK_LE, inColIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * IN_COL_INDEX: {bigint(19)}
     * @param minNumber The min number of inColIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inColIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInColIndex_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInColIndex(), "IN_COL_INDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IN_COL_INDEX: {bigint(19)}
     * @param inColIndexList The collection of inColIndex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInColIndex_InScope(Collection<Long> inColIndexList) {
        doSetInColIndex_InScope(inColIndexList);
    }

    protected void doSetInColIndex_InScope(Collection<Long> inColIndexList) {
        regINS(CK_INS, cTL(inColIndexList), xgetCValueInColIndex(), "IN_COL_INDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IN_COL_INDEX: {bigint(19)}
     * @param inColIndexList The collection of inColIndex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInColIndex_NotInScope(Collection<Long> inColIndexList) {
        doSetInColIndex_NotInScope(inColIndexList);
    }

    protected void doSetInColIndex_NotInScope(Collection<Long> inColIndexList) {
        regINS(CK_NINS, cTL(inColIndexList), xgetCValueInColIndex(), "IN_COL_INDEX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IN_COL_INDEX: {bigint(19)}
     */
    public void setInColIndex_IsNull() { regInColIndex(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IN_COL_INDEX: {bigint(19)}
     */
    public void setInColIndex_IsNotNull() { regInColIndex(CK_ISNN, DOBJ); }

    protected void regInColIndex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInColIndex(), "IN_COL_INDEX"); }
    protected abstract ConditionValue xgetCValueInColIndex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     * @param inColDefaultValue The value of inColDefaultValue as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInColDefaultValue_Equal(String inColDefaultValue) {
        doSetInColDefaultValue_Equal(fRES(inColDefaultValue));
    }

    protected void doSetInColDefaultValue_Equal(String inColDefaultValue) {
        regInColDefaultValue(CK_EQ, inColDefaultValue);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     * @param inColDefaultValue The value of inColDefaultValue as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInColDefaultValue_NotEqual(String inColDefaultValue) {
        doSetInColDefaultValue_NotEqual(fRES(inColDefaultValue));
    }

    protected void doSetInColDefaultValue_NotEqual(String inColDefaultValue) {
        regInColDefaultValue(CK_NES, inColDefaultValue);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     * @param inColDefaultValue The value of inColDefaultValue as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInColDefaultValue_GreaterThan(String inColDefaultValue) {
        regInColDefaultValue(CK_GT, fRES(inColDefaultValue));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     * @param inColDefaultValue The value of inColDefaultValue as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInColDefaultValue_LessThan(String inColDefaultValue) {
        regInColDefaultValue(CK_LT, fRES(inColDefaultValue));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     * @param inColDefaultValue The value of inColDefaultValue as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInColDefaultValue_GreaterEqual(String inColDefaultValue) {
        regInColDefaultValue(CK_GE, fRES(inColDefaultValue));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     * @param inColDefaultValue The value of inColDefaultValue as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInColDefaultValue_LessEqual(String inColDefaultValue) {
        regInColDefaultValue(CK_LE, fRES(inColDefaultValue));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     * @param inColDefaultValueList The collection of inColDefaultValue as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInColDefaultValue_InScope(Collection<String> inColDefaultValueList) {
        doSetInColDefaultValue_InScope(inColDefaultValueList);
    }

    protected void doSetInColDefaultValue_InScope(Collection<String> inColDefaultValueList) {
        regINS(CK_INS, cTL(inColDefaultValueList), xgetCValueInColDefaultValue(), "IN_COL_DEFAULT_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     * @param inColDefaultValueList The collection of inColDefaultValue as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInColDefaultValue_NotInScope(Collection<String> inColDefaultValueList) {
        doSetInColDefaultValue_NotInScope(inColDefaultValueList);
    }

    protected void doSetInColDefaultValue_NotInScope(Collection<String> inColDefaultValueList) {
        regINS(CK_NINS, cTL(inColDefaultValueList), xgetCValueInColDefaultValue(), "IN_COL_DEFAULT_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)} <br>
     * <pre>e.g. setInColDefaultValue_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inColDefaultValue The value of inColDefaultValue as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInColDefaultValue_LikeSearch(String inColDefaultValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inColDefaultValue), xgetCValueInColDefaultValue(), "IN_COL_DEFAULT_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     * @param inColDefaultValue The value of inColDefaultValue as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInColDefaultValue_NotLikeSearch(String inColDefaultValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inColDefaultValue), xgetCValueInColDefaultValue(), "IN_COL_DEFAULT_VALUE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     * @param inColDefaultValue The value of inColDefaultValue as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInColDefaultValue_PrefixSearch(String inColDefaultValue) {
        setInColDefaultValue_LikeSearch(inColDefaultValue, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     */
    public void setInColDefaultValue_IsNull() { regInColDefaultValue(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     */
    public void setInColDefaultValue_IsNullOrEmpty() { regInColDefaultValue(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     */
    public void setInColDefaultValue_IsNotNull() { regInColDefaultValue(CK_ISNN, DOBJ); }

    protected void regInColDefaultValue(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInColDefaultValue(), "IN_COL_DEFAULT_VALUE"); }
    protected abstract ConditionValue xgetCValueInColDefaultValue();

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
    public HpSLCFunction<BColCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BColCB.class);
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
    public HpSLCFunction<BColCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BColCB.class);
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
    public HpSLCFunction<BColCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BColCB.class);
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
    public HpSLCFunction<BColCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BColCB.class);
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
    public HpSLCFunction<BColCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BColCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BColCB&gt;() {
     *     public void query(BColCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BColCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BColCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BColCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BColCQ sq);

    protected BColCB xcreateScalarConditionCB() {
        BColCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BColCB xcreateScalarConditionPartitionByCB() {
        BColCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BColCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColCB cb = new BColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "COL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BColCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BColCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BColCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColCB cb = new BColCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BColCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColCB cb = new BColCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BColCQ sq);

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
    protected BColCB newMyCB() {
        return new BColCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BColCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

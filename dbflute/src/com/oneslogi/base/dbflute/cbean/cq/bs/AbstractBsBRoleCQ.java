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
 * The abstract condition-query of B_ROLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBRoleCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBRoleCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_ROLE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleId The value of roleId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_Equal(Long roleId) {
        doSetRoleId_Equal(roleId);
    }

    protected void doSetRoleId_Equal(Long roleId) {
        regRoleId(CK_EQ, roleId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleId The value of roleId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_NotEqual(Long roleId) {
        doSetRoleId_NotEqual(roleId);
    }

    protected void doSetRoleId_NotEqual(Long roleId) {
        regRoleId(CK_NES, roleId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleId The value of roleId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_GreaterThan(Long roleId) {
        regRoleId(CK_GT, roleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleId The value of roleId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_LessThan(Long roleId) {
        regRoleId(CK_LT, roleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleId The value of roleId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_GreaterEqual(Long roleId) {
        regRoleId(CK_GE, roleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleId The value of roleId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleId_LessEqual(Long roleId) {
        regRoleId(CK_LE, roleId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of roleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of roleId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRoleId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRoleId(), "ROLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleIdList The collection of roleId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleId_InScope(Collection<Long> roleIdList) {
        doSetRoleId_InScope(roleIdList);
    }

    protected void doSetRoleId_InScope(Collection<Long> roleIdList) {
        regINS(CK_INS, cTL(roleIdList), xgetCValueRoleId(), "ROLE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleIdList The collection of roleId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleId_NotInScope(Collection<Long> roleIdList) {
        doSetRoleId_NotInScope(roleIdList);
    }

    protected void doSetRoleId_NotInScope(Collection<Long> roleIdList) {
        regINS(CK_NINS, cTL(roleIdList), xgetCValueRoleId(), "ROLE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ROLE_ID from B_COL_ROLE where ...)} <br>
     * B_COL_ROLE by ROLE_ID, named 'BColRoleAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRoleId_ExistsReferrer_BColRoleList(cb.query());
        registerExistsReferrer(cb.query(), "ROLE_ID", "ROLE_ID", pp, "bColRoleList");
    }
    public abstract String keepRoleId_ExistsReferrer_BColRoleList(BColRoleCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ROLE_ID from B_FUNC_ROLE where ...)} <br>
     * B_FUNC_ROLE by ROLE_ID, named 'BFuncRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBFuncRoleList</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BFuncRoleList for 'exists'. (NotNull)
     */
    public void existsBFuncRoleList(SubQuery<BFuncRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BFuncRoleCB cb = new BFuncRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRoleId_ExistsReferrer_BFuncRoleList(cb.query());
        registerExistsReferrer(cb.query(), "ROLE_ID", "ROLE_ID", pp, "bFuncRoleList");
    }
    public abstract String keepRoleId_ExistsReferrer_BFuncRoleList(BFuncRoleCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ROLE_ID from B_ITEM_ROLE where ...)} <br>
     * B_ITEM_ROLE by ROLE_ID, named 'BItemRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBItemRoleList</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BItemRoleList for 'exists'. (NotNull)
     */
    public void existsBItemRoleList(SubQuery<BItemRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BItemRoleCB cb = new BItemRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRoleId_ExistsReferrer_BItemRoleList(cb.query());
        registerExistsReferrer(cb.query(), "ROLE_ID", "ROLE_ID", pp, "bItemRoleList");
    }
    public abstract String keepRoleId_ExistsReferrer_BItemRoleList(BItemRoleCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ROLE_ID from B_ROLE_GRP_DTL where ...)} <br>
     * B_ROLE_GRP_DTL by ROLE_ID, named 'BRoleGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBRoleGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BRoleGrpDtlList for 'exists'. (NotNull)
     */
    public void existsBRoleGrpDtlList(SubQuery<BRoleGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BRoleGrpDtlCB cb = new BRoleGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRoleId_ExistsReferrer_BRoleGrpDtlList(cb.query());
        registerExistsReferrer(cb.query(), "ROLE_ID", "ROLE_ID", pp, "bRoleGrpDtlList");
    }
    public abstract String keepRoleId_ExistsReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ROLE_ID from B_SCREEN_ROLE where ...)} <br>
     * B_SCREEN_ROLE by ROLE_ID, named 'BScreenRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBScreenRoleList</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BScreenRoleList for 'exists'. (NotNull)
     */
    public void existsBScreenRoleList(SubQuery<BScreenRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BScreenRoleCB cb = new BScreenRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRoleId_ExistsReferrer_BScreenRoleList(cb.query());
        registerExistsReferrer(cb.query(), "ROLE_ID", "ROLE_ID", pp, "bScreenRoleList");
    }
    public abstract String keepRoleId_ExistsReferrer_BScreenRoleList(BScreenRoleCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ROLE_ID from B_COL_ROLE where ...)} <br>
     * B_COL_ROLE by ROLE_ID, named 'BColRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBColRoleList</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RoleId_NotExistsReferrer_BColRoleList for 'not exists'. (NotNull)
     */
    public void notExistsBColRoleList(SubQuery<BColRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColRoleCB cb = new BColRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRoleId_NotExistsReferrer_BColRoleList(cb.query());
        registerNotExistsReferrer(cb.query(), "ROLE_ID", "ROLE_ID", pp, "bColRoleList");
    }
    public abstract String keepRoleId_NotExistsReferrer_BColRoleList(BColRoleCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ROLE_ID from B_FUNC_ROLE where ...)} <br>
     * B_FUNC_ROLE by ROLE_ID, named 'BFuncRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBFuncRoleList</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RoleId_NotExistsReferrer_BFuncRoleList for 'not exists'. (NotNull)
     */
    public void notExistsBFuncRoleList(SubQuery<BFuncRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BFuncRoleCB cb = new BFuncRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRoleId_NotExistsReferrer_BFuncRoleList(cb.query());
        registerNotExistsReferrer(cb.query(), "ROLE_ID", "ROLE_ID", pp, "bFuncRoleList");
    }
    public abstract String keepRoleId_NotExistsReferrer_BFuncRoleList(BFuncRoleCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ROLE_ID from B_ITEM_ROLE where ...)} <br>
     * B_ITEM_ROLE by ROLE_ID, named 'BItemRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBItemRoleList</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RoleId_NotExistsReferrer_BItemRoleList for 'not exists'. (NotNull)
     */
    public void notExistsBItemRoleList(SubQuery<BItemRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BItemRoleCB cb = new BItemRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRoleId_NotExistsReferrer_BItemRoleList(cb.query());
        registerNotExistsReferrer(cb.query(), "ROLE_ID", "ROLE_ID", pp, "bItemRoleList");
    }
    public abstract String keepRoleId_NotExistsReferrer_BItemRoleList(BItemRoleCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ROLE_ID from B_ROLE_GRP_DTL where ...)} <br>
     * B_ROLE_GRP_DTL by ROLE_ID, named 'BRoleGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBRoleGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RoleId_NotExistsReferrer_BRoleGrpDtlList for 'not exists'. (NotNull)
     */
    public void notExistsBRoleGrpDtlList(SubQuery<BRoleGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BRoleGrpDtlCB cb = new BRoleGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRoleId_NotExistsReferrer_BRoleGrpDtlList(cb.query());
        registerNotExistsReferrer(cb.query(), "ROLE_ID", "ROLE_ID", pp, "bRoleGrpDtlList");
    }
    public abstract String keepRoleId_NotExistsReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ROLE_ID from B_SCREEN_ROLE where ...)} <br>
     * B_SCREEN_ROLE by ROLE_ID, named 'BScreenRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBScreenRoleList</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RoleId_NotExistsReferrer_BScreenRoleList for 'not exists'. (NotNull)
     */
    public void notExistsBScreenRoleList(SubQuery<BScreenRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BScreenRoleCB cb = new BScreenRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRoleId_NotExistsReferrer_BScreenRoleList(cb.query());
        registerNotExistsReferrer(cb.query(), "ROLE_ID", "ROLE_ID", pp, "bScreenRoleList");
    }
    public abstract String keepRoleId_NotExistsReferrer_BScreenRoleList(BScreenRoleCQ sq);

    public void xsderiveBColRoleList(String fn, SubQuery<BColRoleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColRoleCB cb = new BColRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepRoleId_SpecifyDerivedReferrer_BColRoleList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ROLE_ID", "ROLE_ID", pp, "bColRoleList", al, op);
    }
    public abstract String keepRoleId_SpecifyDerivedReferrer_BColRoleList(BColRoleCQ sq);

    public void xsderiveBFuncRoleList(String fn, SubQuery<BFuncRoleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BFuncRoleCB cb = new BFuncRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepRoleId_SpecifyDerivedReferrer_BFuncRoleList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ROLE_ID", "ROLE_ID", pp, "bFuncRoleList", al, op);
    }
    public abstract String keepRoleId_SpecifyDerivedReferrer_BFuncRoleList(BFuncRoleCQ sq);

    public void xsderiveBItemRoleList(String fn, SubQuery<BItemRoleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BItemRoleCB cb = new BItemRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepRoleId_SpecifyDerivedReferrer_BItemRoleList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ROLE_ID", "ROLE_ID", pp, "bItemRoleList", al, op);
    }
    public abstract String keepRoleId_SpecifyDerivedReferrer_BItemRoleList(BItemRoleCQ sq);

    public void xsderiveBRoleGrpDtlList(String fn, SubQuery<BRoleGrpDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BRoleGrpDtlCB cb = new BRoleGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepRoleId_SpecifyDerivedReferrer_BRoleGrpDtlList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ROLE_ID", "ROLE_ID", pp, "bRoleGrpDtlList", al, op);
    }
    public abstract String keepRoleId_SpecifyDerivedReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq);

    public void xsderiveBScreenRoleList(String fn, SubQuery<BScreenRoleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BScreenRoleCB cb = new BScreenRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepRoleId_SpecifyDerivedReferrer_BScreenRoleList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ROLE_ID", "ROLE_ID", pp, "bScreenRoleList", al, op);
    }
    public abstract String keepRoleId_SpecifyDerivedReferrer_BScreenRoleList(BScreenRoleCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_COL_ROLE where ...)} <br>
     * B_COL_ROLE by ROLE_ID, named 'BColRoleAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepRoleId_QueryDerivedReferrer_BColRoleList(cb.query()); String prpp = keepRoleId_QueryDerivedReferrer_BColRoleListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ROLE_ID", "ROLE_ID", sqpp, "bColRoleList", rd, vl, prpp, op);
    }
    public abstract String keepRoleId_QueryDerivedReferrer_BColRoleList(BColRoleCQ sq);
    public abstract String keepRoleId_QueryDerivedReferrer_BColRoleListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_FUNC_ROLE where ...)} <br>
     * B_FUNC_ROLE by ROLE_ID, named 'BFuncRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBFuncRoleList()</span>.<span style="color: #CC4747">max</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     roleCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BFuncRoleCB> derivedBFuncRoleList() {
        return xcreateQDRFunctionBFuncRoleList();
    }
    protected HpQDRFunction<BFuncRoleCB> xcreateQDRFunctionBFuncRoleList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBFuncRoleList(fn, sq, rd, vl, op));
    }
    public void xqderiveBFuncRoleList(String fn, SubQuery<BFuncRoleCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BFuncRoleCB cb = new BFuncRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepRoleId_QueryDerivedReferrer_BFuncRoleList(cb.query()); String prpp = keepRoleId_QueryDerivedReferrer_BFuncRoleListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ROLE_ID", "ROLE_ID", sqpp, "bFuncRoleList", rd, vl, prpp, op);
    }
    public abstract String keepRoleId_QueryDerivedReferrer_BFuncRoleList(BFuncRoleCQ sq);
    public abstract String keepRoleId_QueryDerivedReferrer_BFuncRoleListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_ITEM_ROLE where ...)} <br>
     * B_ITEM_ROLE by ROLE_ID, named 'BItemRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBItemRoleList()</span>.<span style="color: #CC4747">max</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     roleCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BItemRoleCB> derivedBItemRoleList() {
        return xcreateQDRFunctionBItemRoleList();
    }
    protected HpQDRFunction<BItemRoleCB> xcreateQDRFunctionBItemRoleList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBItemRoleList(fn, sq, rd, vl, op));
    }
    public void xqderiveBItemRoleList(String fn, SubQuery<BItemRoleCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BItemRoleCB cb = new BItemRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepRoleId_QueryDerivedReferrer_BItemRoleList(cb.query()); String prpp = keepRoleId_QueryDerivedReferrer_BItemRoleListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ROLE_ID", "ROLE_ID", sqpp, "bItemRoleList", rd, vl, prpp, op);
    }
    public abstract String keepRoleId_QueryDerivedReferrer_BItemRoleList(BItemRoleCQ sq);
    public abstract String keepRoleId_QueryDerivedReferrer_BItemRoleListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_ROLE_GRP_DTL where ...)} <br>
     * B_ROLE_GRP_DTL by ROLE_ID, named 'BRoleGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBRoleGrpDtlList()</span>.<span style="color: #CC4747">max</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dtlCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BRoleGrpDtlCB> derivedBRoleGrpDtlList() {
        return xcreateQDRFunctionBRoleGrpDtlList();
    }
    protected HpQDRFunction<BRoleGrpDtlCB> xcreateQDRFunctionBRoleGrpDtlList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBRoleGrpDtlList(fn, sq, rd, vl, op));
    }
    public void xqderiveBRoleGrpDtlList(String fn, SubQuery<BRoleGrpDtlCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BRoleGrpDtlCB cb = new BRoleGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepRoleId_QueryDerivedReferrer_BRoleGrpDtlList(cb.query()); String prpp = keepRoleId_QueryDerivedReferrer_BRoleGrpDtlListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ROLE_ID", "ROLE_ID", sqpp, "bRoleGrpDtlList", rd, vl, prpp, op);
    }
    public abstract String keepRoleId_QueryDerivedReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq);
    public abstract String keepRoleId_QueryDerivedReferrer_BRoleGrpDtlListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_SCREEN_ROLE where ...)} <br>
     * B_SCREEN_ROLE by ROLE_ID, named 'BScreenRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBScreenRoleList()</span>.<span style="color: #CC4747">max</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     roleCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BScreenRoleCB> derivedBScreenRoleList() {
        return xcreateQDRFunctionBScreenRoleList();
    }
    protected HpQDRFunction<BScreenRoleCB> xcreateQDRFunctionBScreenRoleList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBScreenRoleList(fn, sq, rd, vl, op));
    }
    public void xqderiveBScreenRoleList(String fn, SubQuery<BScreenRoleCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BScreenRoleCB cb = new BScreenRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepRoleId_QueryDerivedReferrer_BScreenRoleList(cb.query()); String prpp = keepRoleId_QueryDerivedReferrer_BScreenRoleListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ROLE_ID", "ROLE_ID", sqpp, "bScreenRoleList", rd, vl, prpp, op);
    }
    public abstract String keepRoleId_QueryDerivedReferrer_BScreenRoleList(BScreenRoleCQ sq);
    public abstract String keepRoleId_QueryDerivedReferrer_BScreenRoleListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setRoleId_IsNull() { regRoleId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ROLE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setRoleId_IsNotNull() { regRoleId(CK_ISNN, DOBJ); }

    protected void regRoleId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRoleId(), "ROLE_ID"); }
    protected abstract ConditionValue xgetCValueRoleId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_CD: {UQ, NotNull, varchar(30)}
     * @param roleCd The value of roleCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleCd_Equal(String roleCd) {
        doSetRoleCd_Equal(fRES(roleCd));
    }

    protected void doSetRoleCd_Equal(String roleCd) {
        regRoleCd(CK_EQ, roleCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_CD: {UQ, NotNull, varchar(30)}
     * @param roleCd The value of roleCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleCd_NotEqual(String roleCd) {
        doSetRoleCd_NotEqual(fRES(roleCd));
    }

    protected void doSetRoleCd_NotEqual(String roleCd) {
        regRoleCd(CK_NES, roleCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_CD: {UQ, NotNull, varchar(30)}
     * @param roleCd The value of roleCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleCd_GreaterThan(String roleCd) {
        regRoleCd(CK_GT, fRES(roleCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_CD: {UQ, NotNull, varchar(30)}
     * @param roleCd The value of roleCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleCd_LessThan(String roleCd) {
        regRoleCd(CK_LT, fRES(roleCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_CD: {UQ, NotNull, varchar(30)}
     * @param roleCd The value of roleCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleCd_GreaterEqual(String roleCd) {
        regRoleCd(CK_GE, fRES(roleCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_CD: {UQ, NotNull, varchar(30)}
     * @param roleCd The value of roleCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleCd_LessEqual(String roleCd) {
        regRoleCd(CK_LE, fRES(roleCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ROLE_CD: {UQ, NotNull, varchar(30)}
     * @param roleCdList The collection of roleCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleCd_InScope(Collection<String> roleCdList) {
        doSetRoleCd_InScope(roleCdList);
    }

    protected void doSetRoleCd_InScope(Collection<String> roleCdList) {
        regINS(CK_INS, cTL(roleCdList), xgetCValueRoleCd(), "ROLE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ROLE_CD: {UQ, NotNull, varchar(30)}
     * @param roleCdList The collection of roleCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleCd_NotInScope(Collection<String> roleCdList) {
        doSetRoleCd_NotInScope(roleCdList);
    }

    protected void doSetRoleCd_NotInScope(Collection<String> roleCdList) {
        regINS(CK_NINS, cTL(roleCdList), xgetCValueRoleCd(), "ROLE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ROLE_CD: {UQ, NotNull, varchar(30)} <br>
     * <pre>e.g. setRoleCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param roleCd The value of roleCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRoleCd_LikeSearch(String roleCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(roleCd), xgetCValueRoleCd(), "ROLE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ROLE_CD: {UQ, NotNull, varchar(30)}
     * @param roleCd The value of roleCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRoleCd_NotLikeSearch(String roleCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(roleCd), xgetCValueRoleCd(), "ROLE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ROLE_CD: {UQ, NotNull, varchar(30)}
     * @param roleCd The value of roleCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleCd_PrefixSearch(String roleCd) {
        setRoleCd_LikeSearch(roleCd, xcLSOPPre());
    }

    protected void regRoleCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRoleCd(), "ROLE_CD"); }
    protected abstract ConditionValue xgetCValueRoleCd();

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
    public HpSLCFunction<BRoleCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BRoleCB.class);
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
    public HpSLCFunction<BRoleCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BRoleCB.class);
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
    public HpSLCFunction<BRoleCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BRoleCB.class);
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
    public HpSLCFunction<BRoleCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BRoleCB.class);
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
    public HpSLCFunction<BRoleCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BRoleCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BRoleCB&gt;() {
     *     public void query(BRoleCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BRoleCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BRoleCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BRoleCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BRoleCQ sq);

    protected BRoleCB xcreateScalarConditionCB() {
        BRoleCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BRoleCB xcreateScalarConditionPartitionByCB() {
        BRoleCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BRoleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BRoleCB cb = new BRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ROLE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BRoleCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BRoleCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BRoleCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BRoleCB cb = new BRoleCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ROLE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BRoleCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BRoleCB cb = new BRoleCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BRoleCQ sq);

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
    protected BRoleCB newMyCB() {
        return new BRoleCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BRoleCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

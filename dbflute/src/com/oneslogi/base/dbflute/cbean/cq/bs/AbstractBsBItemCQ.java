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
 * The abstract condition-query of B_ITEM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBItemCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBItemCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_ITEM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param itemId The value of itemId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_GreaterThan(Long itemId) {
        regItemId(CK_GT, itemId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param itemId The value of itemId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_LessThan(Long itemId) {
        regItemId(CK_LT, itemId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param itemId The value of itemId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_GreaterEqual(Long itemId) {
        regItemId(CK_GE, itemId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param itemId The value of itemId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_LessEqual(Long itemId) {
        regItemId(CK_LE, itemId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of itemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of itemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setItemId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueItemId(), "ITEM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param itemIdList The collection of itemId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemId_NotInScope(Collection<Long> itemIdList) {
        doSetItemId_NotInScope(itemIdList);
    }

    protected void doSetItemId_NotInScope(Collection<Long> itemIdList) {
        regINS(CK_NINS, cTL(itemIdList), xgetCValueItemId(), "ITEM_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ITEM_ID from B_COL where ...)} <br>
     * B_COL by ITEM_ID, named 'BColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBColList</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BColList for 'exists'. (NotNull)
     */
    public void existsBColList(SubQuery<BColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColCB cb = new BColCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepItemId_ExistsReferrer_BColList(cb.query());
        registerExistsReferrer(cb.query(), "ITEM_ID", "ITEM_ID", pp, "bColList");
    }
    public abstract String keepItemId_ExistsReferrer_BColList(BColCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ITEM_ID from B_COL_EXT_BASE where ...)} <br>
     * B_COL_EXT_BASE by ITEM_ID, named 'BColExtBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBColExtBaseList</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BColExtBaseList for 'exists'. (NotNull)
     */
    public void existsBColExtBaseList(SubQuery<BColExtBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColExtBaseCB cb = new BColExtBaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepItemId_ExistsReferrer_BColExtBaseList(cb.query());
        registerExistsReferrer(cb.query(), "ITEM_ID", "ITEM_ID", pp, "bColExtBaseList");
    }
    public abstract String keepItemId_ExistsReferrer_BColExtBaseList(BColExtBaseCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ITEM_ID from B_COL_EXT_USER where ...)} <br>
     * B_COL_EXT_USER by ITEM_ID, named 'BColExtUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBColExtUserList</span>(userCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     userCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BColExtUserList for 'exists'. (NotNull)
     */
    public void existsBColExtUserList(SubQuery<BColExtUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColExtUserCB cb = new BColExtUserCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepItemId_ExistsReferrer_BColExtUserList(cb.query());
        registerExistsReferrer(cb.query(), "ITEM_ID", "ITEM_ID", pp, "bColExtUserList");
    }
    public abstract String keepItemId_ExistsReferrer_BColExtUserList(BColExtUserCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ITEM_ID from B_ITEM_ROLE where ...)} <br>
     * B_ITEM_ROLE by ITEM_ID, named 'BItemRoleAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepItemId_ExistsReferrer_BItemRoleList(cb.query());
        registerExistsReferrer(cb.query(), "ITEM_ID", "ITEM_ID", pp, "bItemRoleList");
    }
    public abstract String keepItemId_ExistsReferrer_BItemRoleList(BItemRoleCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ITEM_ID from B_ITEM_VALID where ...)} <br>
     * B_ITEM_VALID by ITEM_ID, named 'BItemValidAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBItemValidAsOne</span>(validCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     validCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BItemValidAsOne for 'exists'. (NotNull)
     */
    public void existsBItemValidAsOne(SubQuery<BItemValidCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BItemValidCB cb = new BItemValidCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepItemId_ExistsReferrer_BItemValidAsOne(cb.query());
        registerExistsReferrer(cb.query(), "ITEM_ID", "ITEM_ID", pp, "bItemValidAsOne");
    }
    public abstract String keepItemId_ExistsReferrer_BItemValidAsOne(BItemValidCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ITEM_ID from M_CENTER_ITEM where ...)} <br>
     * M_CENTER_ITEM by ITEM_ID, named 'MCenterItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterItemList for 'exists'. (NotNull)
     */
    public void existsMCenterItemList(SubQuery<MCenterItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterItemCB cb = new MCenterItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepItemId_ExistsReferrer_MCenterItemList(cb.query());
        registerExistsReferrer(cb.query(), "ITEM_ID", "ITEM_ID", pp, "mCenterItemList");
    }
    public abstract String keepItemId_ExistsReferrer_MCenterItemList(MCenterItemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ITEM_ID from M_CLIENT_ITEM where ...)} <br>
     * M_CLIENT_ITEM by ITEM_ID, named 'MClientItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMClientItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MClientItemList for 'exists'. (NotNull)
     */
    public void existsMClientItemList(SubQuery<MClientItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientItemCB cb = new MClientItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepItemId_ExistsReferrer_MClientItemList(cb.query());
        registerExistsReferrer(cb.query(), "ITEM_ID", "ITEM_ID", pp, "mClientItemList");
    }
    public abstract String keepItemId_ExistsReferrer_MClientItemList(MClientItemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ITEM_ID from B_COL where ...)} <br>
     * B_COL by ITEM_ID, named 'BColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBColList</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ItemId_NotExistsReferrer_BColList for 'not exists'. (NotNull)
     */
    public void notExistsBColList(SubQuery<BColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColCB cb = new BColCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepItemId_NotExistsReferrer_BColList(cb.query());
        registerNotExistsReferrer(cb.query(), "ITEM_ID", "ITEM_ID", pp, "bColList");
    }
    public abstract String keepItemId_NotExistsReferrer_BColList(BColCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ITEM_ID from B_COL_EXT_BASE where ...)} <br>
     * B_COL_EXT_BASE by ITEM_ID, named 'BColExtBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBColExtBaseList</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ItemId_NotExistsReferrer_BColExtBaseList for 'not exists'. (NotNull)
     */
    public void notExistsBColExtBaseList(SubQuery<BColExtBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColExtBaseCB cb = new BColExtBaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepItemId_NotExistsReferrer_BColExtBaseList(cb.query());
        registerNotExistsReferrer(cb.query(), "ITEM_ID", "ITEM_ID", pp, "bColExtBaseList");
    }
    public abstract String keepItemId_NotExistsReferrer_BColExtBaseList(BColExtBaseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ITEM_ID from B_COL_EXT_USER where ...)} <br>
     * B_COL_EXT_USER by ITEM_ID, named 'BColExtUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBColExtUserList</span>(userCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     userCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ItemId_NotExistsReferrer_BColExtUserList for 'not exists'. (NotNull)
     */
    public void notExistsBColExtUserList(SubQuery<BColExtUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColExtUserCB cb = new BColExtUserCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepItemId_NotExistsReferrer_BColExtUserList(cb.query());
        registerNotExistsReferrer(cb.query(), "ITEM_ID", "ITEM_ID", pp, "bColExtUserList");
    }
    public abstract String keepItemId_NotExistsReferrer_BColExtUserList(BColExtUserCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ITEM_ID from B_ITEM_ROLE where ...)} <br>
     * B_ITEM_ROLE by ITEM_ID, named 'BItemRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBItemRoleList</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ItemId_NotExistsReferrer_BItemRoleList for 'not exists'. (NotNull)
     */
    public void notExistsBItemRoleList(SubQuery<BItemRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BItemRoleCB cb = new BItemRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepItemId_NotExistsReferrer_BItemRoleList(cb.query());
        registerNotExistsReferrer(cb.query(), "ITEM_ID", "ITEM_ID", pp, "bItemRoleList");
    }
    public abstract String keepItemId_NotExistsReferrer_BItemRoleList(BItemRoleCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ITEM_ID from B_ITEM_VALID where ...)} <br>
     * B_ITEM_VALID by ITEM_ID, named 'BItemValidAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBItemValidAsOne</span>(validCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     validCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ItemId_NotExistsReferrer_BItemValidAsOne for 'not exists'. (NotNull)
     */
    public void notExistsBItemValidAsOne(SubQuery<BItemValidCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BItemValidCB cb = new BItemValidCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepItemId_NotExistsReferrer_BItemValidAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "ITEM_ID", "ITEM_ID", pp, "bItemValidAsOne");
    }
    public abstract String keepItemId_NotExistsReferrer_BItemValidAsOne(BItemValidCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ITEM_ID from M_CENTER_ITEM where ...)} <br>
     * M_CENTER_ITEM by ITEM_ID, named 'MCenterItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ItemId_NotExistsReferrer_MCenterItemList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterItemList(SubQuery<MCenterItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterItemCB cb = new MCenterItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepItemId_NotExistsReferrer_MCenterItemList(cb.query());
        registerNotExistsReferrer(cb.query(), "ITEM_ID", "ITEM_ID", pp, "mCenterItemList");
    }
    public abstract String keepItemId_NotExistsReferrer_MCenterItemList(MCenterItemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ITEM_ID from M_CLIENT_ITEM where ...)} <br>
     * M_CLIENT_ITEM by ITEM_ID, named 'MClientItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClientItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ItemId_NotExistsReferrer_MClientItemList for 'not exists'. (NotNull)
     */
    public void notExistsMClientItemList(SubQuery<MClientItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientItemCB cb = new MClientItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepItemId_NotExistsReferrer_MClientItemList(cb.query());
        registerNotExistsReferrer(cb.query(), "ITEM_ID", "ITEM_ID", pp, "mClientItemList");
    }
    public abstract String keepItemId_NotExistsReferrer_MClientItemList(MClientItemCQ sq);

    public void xsderiveBColList(String fn, SubQuery<BColCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColCB cb = new BColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepItemId_SpecifyDerivedReferrer_BColList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ITEM_ID", "ITEM_ID", pp, "bColList", al, op);
    }
    public abstract String keepItemId_SpecifyDerivedReferrer_BColList(BColCQ sq);

    public void xsderiveBColExtBaseList(String fn, SubQuery<BColExtBaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColExtBaseCB cb = new BColExtBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepItemId_SpecifyDerivedReferrer_BColExtBaseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ITEM_ID", "ITEM_ID", pp, "bColExtBaseList", al, op);
    }
    public abstract String keepItemId_SpecifyDerivedReferrer_BColExtBaseList(BColExtBaseCQ sq);

    public void xsderiveBColExtUserList(String fn, SubQuery<BColExtUserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColExtUserCB cb = new BColExtUserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepItemId_SpecifyDerivedReferrer_BColExtUserList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ITEM_ID", "ITEM_ID", pp, "bColExtUserList", al, op);
    }
    public abstract String keepItemId_SpecifyDerivedReferrer_BColExtUserList(BColExtUserCQ sq);

    public void xsderiveBItemRoleList(String fn, SubQuery<BItemRoleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BItemRoleCB cb = new BItemRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepItemId_SpecifyDerivedReferrer_BItemRoleList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ITEM_ID", "ITEM_ID", pp, "bItemRoleList", al, op);
    }
    public abstract String keepItemId_SpecifyDerivedReferrer_BItemRoleList(BItemRoleCQ sq);

    public void xsderiveMCenterItemList(String fn, SubQuery<MCenterItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterItemCB cb = new MCenterItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepItemId_SpecifyDerivedReferrer_MCenterItemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ITEM_ID", "ITEM_ID", pp, "mCenterItemList", al, op);
    }
    public abstract String keepItemId_SpecifyDerivedReferrer_MCenterItemList(MCenterItemCQ sq);

    public void xsderiveMClientItemList(String fn, SubQuery<MClientItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientItemCB cb = new MClientItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepItemId_SpecifyDerivedReferrer_MClientItemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ITEM_ID", "ITEM_ID", pp, "mClientItemList", al, op);
    }
    public abstract String keepItemId_SpecifyDerivedReferrer_MClientItemList(MClientItemCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_COL where ...)} <br>
     * B_COL by ITEM_ID, named 'BColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBColList()</span>.<span style="color: #CC4747">max</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     colCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BColCB> derivedBColList() {
        return xcreateQDRFunctionBColList();
    }
    protected HpQDRFunction<BColCB> xcreateQDRFunctionBColList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBColList(fn, sq, rd, vl, op));
    }
    public void xqderiveBColList(String fn, SubQuery<BColCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColCB cb = new BColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepItemId_QueryDerivedReferrer_BColList(cb.query()); String prpp = keepItemId_QueryDerivedReferrer_BColListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ITEM_ID", "ITEM_ID", sqpp, "bColList", rd, vl, prpp, op);
    }
    public abstract String keepItemId_QueryDerivedReferrer_BColList(BColCQ sq);
    public abstract String keepItemId_QueryDerivedReferrer_BColListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_COL_EXT_BASE where ...)} <br>
     * B_COL_EXT_BASE by ITEM_ID, named 'BColExtBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBColExtBaseList()</span>.<span style="color: #CC4747">max</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     baseCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BColExtBaseCB> derivedBColExtBaseList() {
        return xcreateQDRFunctionBColExtBaseList();
    }
    protected HpQDRFunction<BColExtBaseCB> xcreateQDRFunctionBColExtBaseList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBColExtBaseList(fn, sq, rd, vl, op));
    }
    public void xqderiveBColExtBaseList(String fn, SubQuery<BColExtBaseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColExtBaseCB cb = new BColExtBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepItemId_QueryDerivedReferrer_BColExtBaseList(cb.query()); String prpp = keepItemId_QueryDerivedReferrer_BColExtBaseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ITEM_ID", "ITEM_ID", sqpp, "bColExtBaseList", rd, vl, prpp, op);
    }
    public abstract String keepItemId_QueryDerivedReferrer_BColExtBaseList(BColExtBaseCQ sq);
    public abstract String keepItemId_QueryDerivedReferrer_BColExtBaseListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_COL_EXT_USER where ...)} <br>
     * B_COL_EXT_USER by ITEM_ID, named 'BColExtUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBColExtUserList()</span>.<span style="color: #CC4747">max</span>(userCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     userCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     userCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BColExtUserCB> derivedBColExtUserList() {
        return xcreateQDRFunctionBColExtUserList();
    }
    protected HpQDRFunction<BColExtUserCB> xcreateQDRFunctionBColExtUserList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBColExtUserList(fn, sq, rd, vl, op));
    }
    public void xqderiveBColExtUserList(String fn, SubQuery<BColExtUserCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColExtUserCB cb = new BColExtUserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepItemId_QueryDerivedReferrer_BColExtUserList(cb.query()); String prpp = keepItemId_QueryDerivedReferrer_BColExtUserListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ITEM_ID", "ITEM_ID", sqpp, "bColExtUserList", rd, vl, prpp, op);
    }
    public abstract String keepItemId_QueryDerivedReferrer_BColExtUserList(BColExtUserCQ sq);
    public abstract String keepItemId_QueryDerivedReferrer_BColExtUserListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_ITEM_ROLE where ...)} <br>
     * B_ITEM_ROLE by ITEM_ID, named 'BItemRoleAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepItemId_QueryDerivedReferrer_BItemRoleList(cb.query()); String prpp = keepItemId_QueryDerivedReferrer_BItemRoleListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ITEM_ID", "ITEM_ID", sqpp, "bItemRoleList", rd, vl, prpp, op);
    }
    public abstract String keepItemId_QueryDerivedReferrer_BItemRoleList(BItemRoleCQ sq);
    public abstract String keepItemId_QueryDerivedReferrer_BItemRoleListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CENTER_ITEM where ...)} <br>
     * M_CENTER_ITEM by ITEM_ID, named 'MCenterItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterItemList()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     itemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterItemCB> derivedMCenterItemList() {
        return xcreateQDRFunctionMCenterItemList();
    }
    protected HpQDRFunction<MCenterItemCB> xcreateQDRFunctionMCenterItemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterItemList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterItemList(String fn, SubQuery<MCenterItemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterItemCB cb = new MCenterItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepItemId_QueryDerivedReferrer_MCenterItemList(cb.query()); String prpp = keepItemId_QueryDerivedReferrer_MCenterItemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ITEM_ID", "ITEM_ID", sqpp, "mCenterItemList", rd, vl, prpp, op);
    }
    public abstract String keepItemId_QueryDerivedReferrer_MCenterItemList(MCenterItemCQ sq);
    public abstract String keepItemId_QueryDerivedReferrer_MCenterItemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CLIENT_ITEM where ...)} <br>
     * M_CLIENT_ITEM by ITEM_ID, named 'MClientItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMClientItemList()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     itemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MClientItemCB> derivedMClientItemList() {
        return xcreateQDRFunctionMClientItemList();
    }
    protected HpQDRFunction<MClientItemCB> xcreateQDRFunctionMClientItemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMClientItemList(fn, sq, rd, vl, op));
    }
    public void xqderiveMClientItemList(String fn, SubQuery<MClientItemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientItemCB cb = new MClientItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepItemId_QueryDerivedReferrer_MClientItemList(cb.query()); String prpp = keepItemId_QueryDerivedReferrer_MClientItemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ITEM_ID", "ITEM_ID", sqpp, "mClientItemList", rd, vl, prpp, op);
    }
    public abstract String keepItemId_QueryDerivedReferrer_MClientItemList(MClientItemCQ sq);
    public abstract String keepItemId_QueryDerivedReferrer_MClientItemListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setItemId_IsNull() { regItemId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setItemId_IsNotNull() { regItemId(CK_ISNN, DOBJ); }

    protected void regItemId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemId(), "ITEM_ID"); }
    protected abstract ConditionValue xgetCValueItemId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_Equal(Long screenId) {
        doSetScreenId_Equal(screenId);
    }

    protected void doSetScreenId_Equal(Long screenId) {
        regScreenId(CK_EQ, screenId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_NotEqual(Long screenId) {
        doSetScreenId_NotEqual(screenId);
    }

    protected void doSetScreenId_NotEqual(Long screenId) {
        regScreenId(CK_NES, screenId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_GreaterThan(Long screenId) {
        regScreenId(CK_GT, screenId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_LessThan(Long screenId) {
        regScreenId(CK_LT, screenId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_GreaterEqual(Long screenId) {
        regScreenId(CK_GE, screenId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenId The value of screenId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_LessEqual(Long screenId) {
        regScreenId(CK_LE, screenId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param minNumber The min number of screenId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of screenId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setScreenId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueScreenId(), "SCREEN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenIdList The collection of screenId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenId_InScope(Collection<Long> screenIdList) {
        doSetScreenId_InScope(screenIdList);
    }

    protected void doSetScreenId_InScope(Collection<Long> screenIdList) {
        regINS(CK_INS, cTL(screenIdList), xgetCValueScreenId(), "SCREEN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @param screenIdList The collection of screenId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenId_NotInScope(Collection<Long> screenIdList) {
        doSetScreenId_NotInScope(screenIdList);
    }

    protected void doSetScreenId_NotInScope(Collection<Long> screenIdList) {
        regINS(CK_NINS, cTL(screenIdList), xgetCValueScreenId(), "SCREEN_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SCREEN_ID from B_SCREEN where ...)} <br />
     * B_SCREEN by my SCREEN_ID, named 'BScreen'.
     * @param subCBLambda The callback for sub-query of BScreen for 'in-scope'. (NotNull)
     */
    public void inScopeBScreen(SubQuery<BScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BScreenCB cb = new BScreenCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepScreenId_InScopeRelation_BScreen(cb.query());
        registerInScopeRelation(cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "bScreen", false);
    }
    public abstract String keepScreenId_InScopeRelation_BScreen(BScreenCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SCREEN_ID from B_SCREEN where ...)} <br />
     * B_SCREEN by my SCREEN_ID, named 'BScreen'.
     * @param subCBLambda The callback for sub-query of BScreen for 'not in-scope'. (NotNull)
     */
    public void notInScopeBScreen(SubQuery<BScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BScreenCB cb = new BScreenCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepScreenId_NotInScopeRelation_BScreen(cb.query());
        registerInScopeRelation(cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "bScreen", true);
    }
    public abstract String keepScreenId_NotInScopeRelation_BScreen(BScreenCQ sq);

    protected void regScreenId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScreenId(), "SCREEN_ID"); }
    protected abstract ConditionValue xgetCValueScreenId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {UQ+, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_Equal(String itemCd) {
        doSetItemCd_Equal(fRES(itemCd));
    }

    protected void doSetItemCd_Equal(String itemCd) {
        regItemCd(CK_EQ, itemCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {UQ+, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_NotEqual(String itemCd) {
        doSetItemCd_NotEqual(fRES(itemCd));
    }

    protected void doSetItemCd_NotEqual(String itemCd) {
        regItemCd(CK_NES, itemCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {UQ+, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_GreaterThan(String itemCd) {
        regItemCd(CK_GT, fRES(itemCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {UQ+, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_LessThan(String itemCd) {
        regItemCd(CK_LT, fRES(itemCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {UQ+, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_GreaterEqual(String itemCd) {
        regItemCd(CK_GE, fRES(itemCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {UQ+, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_LessEqual(String itemCd) {
        regItemCd(CK_LE, fRES(itemCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CD: {UQ+, NotNull, varchar(100)}
     * @param itemCdList The collection of itemCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_InScope(Collection<String> itemCdList) {
        doSetItemCd_InScope(itemCdList);
    }

    protected void doSetItemCd_InScope(Collection<String> itemCdList) {
        regINS(CK_INS, cTL(itemCdList), xgetCValueItemCd(), "ITEM_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CD: {UQ+, NotNull, varchar(100)}
     * @param itemCdList The collection of itemCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_NotInScope(Collection<String> itemCdList) {
        doSetItemCd_NotInScope(itemCdList);
    }

    protected void doSetItemCd_NotInScope(Collection<String> itemCdList) {
        regINS(CK_NINS, cTL(itemCdList), xgetCValueItemCd(), "ITEM_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD: {UQ+, NotNull, varchar(100)} <br>
     * <pre>e.g. setItemCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemCd The value of itemCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemCd_LikeSearch(String itemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemCd), xgetCValueItemCd(), "ITEM_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD: {UQ+, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemCd_NotLikeSearch(String itemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemCd), xgetCValueItemCd(), "ITEM_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD: {UQ+, NotNull, varchar(100)}
     * @param itemCd The value of itemCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_PrefixSearch(String itemCd) {
        setItemCd_LikeSearch(itemCd, xcLSOPPre());
    }

    protected void regItemCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemCd(), "ITEM_CD"); }
    protected abstract ConditionValue xgetCValueItemCd();

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
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType}
     * @param itemType The value of itemType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_Equal(String itemType) {
        doSetItemType_Equal(fRES(itemType));
    }

    /**
     * Equal(=). As ItemType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType} <br>
     * 項目型
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setItemType_Equal_AsItemType(CDef.ItemType cdef) {
        doSetItemType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $checkbox (checkbox). And OnlyOnceRegistered. <br>
     * $checkbox: チェックボックス
     */
    public void setItemType_Equal_$checkbox() {
        setItemType_Equal_AsItemType(CDef.ItemType.$checkbox);
    }

    /**
     * Equal(=). As $date (date). And OnlyOnceRegistered. <br>
     * $date: 日付
     */
    public void setItemType_Equal_$date() {
        setItemType_Equal_AsItemType(CDef.ItemType.$date);
    }

    /**
     * Equal(=). As $datetime (datetime). And OnlyOnceRegistered. <br>
     * $datetime: 日時
     */
    public void setItemType_Equal_$datetime() {
        setItemType_Equal_AsItemType(CDef.ItemType.$datetime);
    }

    /**
     * Equal(=). As $dropdown (dropdown). And OnlyOnceRegistered. <br>
     * $dropdown: コンボボックス
     */
    public void setItemType_Equal_$dropdown() {
        setItemType_Equal_AsItemType(CDef.ItemType.$dropdown);
    }

    /**
     * Equal(=). As $grid (grid). And OnlyOnceRegistered. <br>
     * $grid: グリッド
     */
    public void setItemType_Equal_$grid() {
        setItemType_Equal_AsItemType(CDef.ItemType.$grid);
    }

    /**
     * Equal(=). As $number (number). And OnlyOnceRegistered. <br>
     * $number: 数値
     */
    public void setItemType_Equal_$number() {
        setItemType_Equal_AsItemType(CDef.ItemType.$number);
    }

    /**
     * Equal(=). As $text (text). And OnlyOnceRegistered. <br>
     * $text: テキスト
     */
    public void setItemType_Equal_$text() {
        setItemType_Equal_AsItemType(CDef.ItemType.$text);
    }

    protected void doSetItemType_Equal(String itemType) {
        regItemType(CK_EQ, itemType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType}
     * @param itemType The value of itemType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_NotEqual(String itemType) {
        doSetItemType_NotEqual(fRES(itemType));
    }

    /**
     * NotEqual(&lt;&gt;). As ItemType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType} <br>
     * 項目型
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setItemType_NotEqual_AsItemType(CDef.ItemType cdef) {
        doSetItemType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $checkbox (checkbox). And OnlyOnceRegistered. <br>
     * $checkbox: チェックボックス
     */
    public void setItemType_NotEqual_$checkbox() {
        setItemType_NotEqual_AsItemType(CDef.ItemType.$checkbox);
    }

    /**
     * NotEqual(&lt;&gt;). As $date (date). And OnlyOnceRegistered. <br>
     * $date: 日付
     */
    public void setItemType_NotEqual_$date() {
        setItemType_NotEqual_AsItemType(CDef.ItemType.$date);
    }

    /**
     * NotEqual(&lt;&gt;). As $datetime (datetime). And OnlyOnceRegistered. <br>
     * $datetime: 日時
     */
    public void setItemType_NotEqual_$datetime() {
        setItemType_NotEqual_AsItemType(CDef.ItemType.$datetime);
    }

    /**
     * NotEqual(&lt;&gt;). As $dropdown (dropdown). And OnlyOnceRegistered. <br>
     * $dropdown: コンボボックス
     */
    public void setItemType_NotEqual_$dropdown() {
        setItemType_NotEqual_AsItemType(CDef.ItemType.$dropdown);
    }

    /**
     * NotEqual(&lt;&gt;). As $grid (grid). And OnlyOnceRegistered. <br>
     * $grid: グリッド
     */
    public void setItemType_NotEqual_$grid() {
        setItemType_NotEqual_AsItemType(CDef.ItemType.$grid);
    }

    /**
     * NotEqual(&lt;&gt;). As $number (number). And OnlyOnceRegistered. <br>
     * $number: 数値
     */
    public void setItemType_NotEqual_$number() {
        setItemType_NotEqual_AsItemType(CDef.ItemType.$number);
    }

    /**
     * NotEqual(&lt;&gt;). As $text (text). And OnlyOnceRegistered. <br>
     * $text: テキスト
     */
    public void setItemType_NotEqual_$text() {
        setItemType_NotEqual_AsItemType(CDef.ItemType.$text);
    }

    protected void doSetItemType_NotEqual(String itemType) {
        regItemType(CK_NES, itemType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType}
     * @param itemTypeList The collection of itemType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_InScope(Collection<String> itemTypeList) {
        doSetItemType_InScope(itemTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As ItemType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType} <br>
     * 項目型
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_InScope_AsItemType(Collection<CDef.ItemType> cdefList) {
        doSetItemType_InScope(cTStrL(cdefList));
    }

    protected void doSetItemType_InScope(Collection<String> itemTypeList) {
        regINS(CK_INS, cTL(itemTypeList), xgetCValueItemType(), "ITEM_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType}
     * @param itemTypeList The collection of itemType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_NotInScope(Collection<String> itemTypeList) {
        doSetItemType_NotInScope(itemTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ItemType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType} <br>
     * 項目型
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemType_NotInScope_AsItemType(Collection<CDef.ItemType> cdefList) {
        doSetItemType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetItemType_NotInScope(Collection<String> itemTypeList) {
        regINS(CK_NINS, cTL(itemTypeList), xgetCValueItemType(), "ITEM_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType}
     */
    public void setItemType_IsNull() { regItemType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType}
     */
    public void setItemType_IsNullOrEmpty() { regItemType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType}
     */
    public void setItemType_IsNotNull() { regItemType(CK_ISNN, DOBJ); }

    protected void regItemType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemType(), "ITEM_TYPE"); }
    protected abstract ConditionValue xgetCValueItemType();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired}
     * @param displayRequired The value of displayRequired as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDisplayRequired_Equal(String displayRequired) {
        doSetDisplayRequired_Equal(fRES(displayRequired));
    }

    /**
     * Equal(=). As DisplayRequired. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired} <br>
     * 表示必須
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayRequired_Equal_AsDisplayRequired(CDef.DisplayRequired cdef) {
        doSetDisplayRequired_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 任意
     */
    public void setDisplayRequired_Equal_$0() {
        setDisplayRequired_Equal_AsDisplayRequired(CDef.DisplayRequired.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 必須
     */
    public void setDisplayRequired_Equal_$1() {
        setDisplayRequired_Equal_AsDisplayRequired(CDef.DisplayRequired.$1);
    }

    protected void doSetDisplayRequired_Equal(String displayRequired) {
        regDisplayRequired(CK_EQ, displayRequired);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired}
     * @param displayRequired The value of displayRequired as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDisplayRequired_NotEqual(String displayRequired) {
        doSetDisplayRequired_NotEqual(fRES(displayRequired));
    }

    /**
     * NotEqual(&lt;&gt;). As DisplayRequired. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired} <br>
     * 表示必須
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayRequired_NotEqual_AsDisplayRequired(CDef.DisplayRequired cdef) {
        doSetDisplayRequired_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 任意
     */
    public void setDisplayRequired_NotEqual_$0() {
        setDisplayRequired_NotEqual_AsDisplayRequired(CDef.DisplayRequired.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 必須
     */
    public void setDisplayRequired_NotEqual_$1() {
        setDisplayRequired_NotEqual_AsDisplayRequired(CDef.DisplayRequired.$1);
    }

    protected void doSetDisplayRequired_NotEqual(String displayRequired) {
        regDisplayRequired(CK_NES, displayRequired);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired}
     * @param displayRequiredList The collection of displayRequired as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDisplayRequired_InScope(Collection<String> displayRequiredList) {
        doSetDisplayRequired_InScope(displayRequiredList);
    }

    /**
     * InScope {in ('a', 'b')}. As DisplayRequired. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired} <br>
     * 表示必須
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDisplayRequired_InScope_AsDisplayRequired(Collection<CDef.DisplayRequired> cdefList) {
        doSetDisplayRequired_InScope(cTStrL(cdefList));
    }

    protected void doSetDisplayRequired_InScope(Collection<String> displayRequiredList) {
        regINS(CK_INS, cTL(displayRequiredList), xgetCValueDisplayRequired(), "DISPLAY_REQUIRED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired}
     * @param displayRequiredList The collection of displayRequired as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDisplayRequired_NotInScope(Collection<String> displayRequiredList) {
        doSetDisplayRequired_NotInScope(displayRequiredList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DisplayRequired. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired} <br>
     * 表示必須
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDisplayRequired_NotInScope_AsDisplayRequired(Collection<CDef.DisplayRequired> cdefList) {
        doSetDisplayRequired_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDisplayRequired_NotInScope(Collection<String> displayRequiredList) {
        regINS(CK_NINS, cTL(displayRequiredList), xgetCValueDisplayRequired(), "DISPLAY_REQUIRED");
    }

    protected void regDisplayRequired(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDisplayRequired(), "DISPLAY_REQUIRED"); }
    protected abstract ConditionValue xgetCValueDisplayRequired();

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
    public HpSLCFunction<BItemCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BItemCB.class);
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
    public HpSLCFunction<BItemCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BItemCB.class);
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
    public HpSLCFunction<BItemCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BItemCB.class);
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
    public HpSLCFunction<BItemCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BItemCB.class);
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
    public HpSLCFunction<BItemCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BItemCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BItemCB&gt;() {
     *     public void query(BItemCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BItemCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BItemCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BItemCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BItemCQ sq);

    protected BItemCB xcreateScalarConditionCB() {
        BItemCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BItemCB xcreateScalarConditionPartitionByCB() {
        BItemCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BItemCB cb = new BItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ITEM_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BItemCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BItemCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BItemCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BItemCB cb = new BItemCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ITEM_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BItemCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BItemCB cb = new BItemCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BItemCQ sq);

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
    protected BItemCB newMyCB() {
        return new BItemCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BItemCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

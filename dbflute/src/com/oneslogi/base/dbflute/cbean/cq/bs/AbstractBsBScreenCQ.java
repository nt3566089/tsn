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
 * The abstract condition-query of B_SCREEN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBScreenCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBScreenCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_SCREEN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param screenId The value of screenId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_GreaterThan(Long screenId) {
        regScreenId(CK_GT, screenId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param screenId The value of screenId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_LessThan(Long screenId) {
        regScreenId(CK_LT, screenId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param screenId The value of screenId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_GreaterEqual(Long screenId) {
        regScreenId(CK_GE, screenId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param screenId The value of screenId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScreenId_LessEqual(Long screenId) {
        regScreenId(CK_LE, screenId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of screenId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of screenId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setScreenId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueScreenId(), "SCREEN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param screenIdList The collection of screenId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenId_NotInScope(Collection<Long> screenIdList) {
        doSetScreenId_NotInScope(screenIdList);
    }

    protected void doSetScreenId_NotInScope(Collection<Long> screenIdList) {
        regINS(CK_NINS, cTL(screenIdList), xgetCValueScreenId(), "SCREEN_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SCREEN_ID from B_ITEM where ...)} <br>
     * B_ITEM by SCREEN_ID, named 'BItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BItemList for 'exists'. (NotNull)
     */
    public void existsBItemList(SubQuery<BItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BItemCB cb = new BItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScreenId_ExistsReferrer_BItemList(cb.query());
        registerExistsReferrer(cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "bItemList");
    }
    public abstract String keepScreenId_ExistsReferrer_BItemList(BItemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SCREEN_ID from B_MENU where ...)} <br>
     * B_MENU by SCREEN_ID, named 'BMenuAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBMenuList</span>(menuCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     menuCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BMenuList for 'exists'. (NotNull)
     */
    public void existsBMenuList(SubQuery<BMenuCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMenuCB cb = new BMenuCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScreenId_ExistsReferrer_BMenuList(cb.query());
        registerExistsReferrer(cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "bMenuList");
    }
    public abstract String keepScreenId_ExistsReferrer_BMenuList(BMenuCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SCREEN_ID from B_SCREEN_ROLE where ...)} <br>
     * B_SCREEN_ROLE by SCREEN_ID, named 'BScreenRoleAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScreenId_ExistsReferrer_BScreenRoleList(cb.query());
        registerExistsReferrer(cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "bScreenRoleList");
    }
    public abstract String keepScreenId_ExistsReferrer_BScreenRoleList(BScreenRoleCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SCREEN_ID from M_CENTER_SCREEN where ...)} <br>
     * M_CENTER_SCREEN by SCREEN_ID, named 'MCenterScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterScreenList</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterScreenList for 'exists'. (NotNull)
     */
    public void existsMCenterScreenList(SubQuery<MCenterScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterScreenCB cb = new MCenterScreenCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScreenId_ExistsReferrer_MCenterScreenList(cb.query());
        registerExistsReferrer(cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "mCenterScreenList");
    }
    public abstract String keepScreenId_ExistsReferrer_MCenterScreenList(MCenterScreenCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SCREEN_ID from M_CLIENT_SCREEN where ...)} <br>
     * M_CLIENT_SCREEN by SCREEN_ID, named 'MClientScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMClientScreenList</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MClientScreenList for 'exists'. (NotNull)
     */
    public void existsMClientScreenList(SubQuery<MClientScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientScreenCB cb = new MClientScreenCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScreenId_ExistsReferrer_MClientScreenList(cb.query());
        registerExistsReferrer(cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "mClientScreenList");
    }
    public abstract String keepScreenId_ExistsReferrer_MClientScreenList(MClientScreenCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SCREEN_ID from B_ITEM where ...)} <br>
     * B_ITEM by SCREEN_ID, named 'BItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ScreenId_NotExistsReferrer_BItemList for 'not exists'. (NotNull)
     */
    public void notExistsBItemList(SubQuery<BItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BItemCB cb = new BItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScreenId_NotExistsReferrer_BItemList(cb.query());
        registerNotExistsReferrer(cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "bItemList");
    }
    public abstract String keepScreenId_NotExistsReferrer_BItemList(BItemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SCREEN_ID from B_MENU where ...)} <br>
     * B_MENU by SCREEN_ID, named 'BMenuAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBMenuList</span>(menuCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     menuCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ScreenId_NotExistsReferrer_BMenuList for 'not exists'. (NotNull)
     */
    public void notExistsBMenuList(SubQuery<BMenuCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMenuCB cb = new BMenuCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScreenId_NotExistsReferrer_BMenuList(cb.query());
        registerNotExistsReferrer(cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "bMenuList");
    }
    public abstract String keepScreenId_NotExistsReferrer_BMenuList(BMenuCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SCREEN_ID from B_SCREEN_ROLE where ...)} <br>
     * B_SCREEN_ROLE by SCREEN_ID, named 'BScreenRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBScreenRoleList</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ScreenId_NotExistsReferrer_BScreenRoleList for 'not exists'. (NotNull)
     */
    public void notExistsBScreenRoleList(SubQuery<BScreenRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BScreenRoleCB cb = new BScreenRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScreenId_NotExistsReferrer_BScreenRoleList(cb.query());
        registerNotExistsReferrer(cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "bScreenRoleList");
    }
    public abstract String keepScreenId_NotExistsReferrer_BScreenRoleList(BScreenRoleCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SCREEN_ID from M_CENTER_SCREEN where ...)} <br>
     * M_CENTER_SCREEN by SCREEN_ID, named 'MCenterScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterScreenList</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ScreenId_NotExistsReferrer_MCenterScreenList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterScreenList(SubQuery<MCenterScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterScreenCB cb = new MCenterScreenCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScreenId_NotExistsReferrer_MCenterScreenList(cb.query());
        registerNotExistsReferrer(cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "mCenterScreenList");
    }
    public abstract String keepScreenId_NotExistsReferrer_MCenterScreenList(MCenterScreenCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SCREEN_ID from M_CLIENT_SCREEN where ...)} <br>
     * M_CLIENT_SCREEN by SCREEN_ID, named 'MClientScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClientScreenList</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ScreenId_NotExistsReferrer_MClientScreenList for 'not exists'. (NotNull)
     */
    public void notExistsMClientScreenList(SubQuery<MClientScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientScreenCB cb = new MClientScreenCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepScreenId_NotExistsReferrer_MClientScreenList(cb.query());
        registerNotExistsReferrer(cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "mClientScreenList");
    }
    public abstract String keepScreenId_NotExistsReferrer_MClientScreenList(MClientScreenCQ sq);

    public void xsderiveBItemList(String fn, SubQuery<BItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BItemCB cb = new BItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepScreenId_SpecifyDerivedReferrer_BItemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "bItemList", al, op);
    }
    public abstract String keepScreenId_SpecifyDerivedReferrer_BItemList(BItemCQ sq);

    public void xsderiveBMenuList(String fn, SubQuery<BMenuCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMenuCB cb = new BMenuCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepScreenId_SpecifyDerivedReferrer_BMenuList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "bMenuList", al, op);
    }
    public abstract String keepScreenId_SpecifyDerivedReferrer_BMenuList(BMenuCQ sq);

    public void xsderiveBScreenRoleList(String fn, SubQuery<BScreenRoleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BScreenRoleCB cb = new BScreenRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepScreenId_SpecifyDerivedReferrer_BScreenRoleList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "bScreenRoleList", al, op);
    }
    public abstract String keepScreenId_SpecifyDerivedReferrer_BScreenRoleList(BScreenRoleCQ sq);

    public void xsderiveMCenterScreenList(String fn, SubQuery<MCenterScreenCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterScreenCB cb = new MCenterScreenCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepScreenId_SpecifyDerivedReferrer_MCenterScreenList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "mCenterScreenList", al, op);
    }
    public abstract String keepScreenId_SpecifyDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq);

    public void xsderiveMClientScreenList(String fn, SubQuery<MClientScreenCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientScreenCB cb = new MClientScreenCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepScreenId_SpecifyDerivedReferrer_MClientScreenList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SCREEN_ID", "SCREEN_ID", pp, "mClientScreenList", al, op);
    }
    public abstract String keepScreenId_SpecifyDerivedReferrer_MClientScreenList(MClientScreenCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_ITEM where ...)} <br>
     * B_ITEM by SCREEN_ID, named 'BItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBItemList()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     itemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BItemCB> derivedBItemList() {
        return xcreateQDRFunctionBItemList();
    }
    protected HpQDRFunction<BItemCB> xcreateQDRFunctionBItemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBItemList(fn, sq, rd, vl, op));
    }
    public void xqderiveBItemList(String fn, SubQuery<BItemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BItemCB cb = new BItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepScreenId_QueryDerivedReferrer_BItemList(cb.query()); String prpp = keepScreenId_QueryDerivedReferrer_BItemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SCREEN_ID", "SCREEN_ID", sqpp, "bItemList", rd, vl, prpp, op);
    }
    public abstract String keepScreenId_QueryDerivedReferrer_BItemList(BItemCQ sq);
    public abstract String keepScreenId_QueryDerivedReferrer_BItemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_MENU where ...)} <br>
     * B_MENU by SCREEN_ID, named 'BMenuAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBMenuList()</span>.<span style="color: #CC4747">max</span>(menuCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     menuCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     menuCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BMenuCB> derivedBMenuList() {
        return xcreateQDRFunctionBMenuList();
    }
    protected HpQDRFunction<BMenuCB> xcreateQDRFunctionBMenuList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBMenuList(fn, sq, rd, vl, op));
    }
    public void xqderiveBMenuList(String fn, SubQuery<BMenuCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMenuCB cb = new BMenuCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepScreenId_QueryDerivedReferrer_BMenuList(cb.query()); String prpp = keepScreenId_QueryDerivedReferrer_BMenuListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SCREEN_ID", "SCREEN_ID", sqpp, "bMenuList", rd, vl, prpp, op);
    }
    public abstract String keepScreenId_QueryDerivedReferrer_BMenuList(BMenuCQ sq);
    public abstract String keepScreenId_QueryDerivedReferrer_BMenuListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_SCREEN_ROLE where ...)} <br>
     * B_SCREEN_ROLE by SCREEN_ID, named 'BScreenRoleAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepScreenId_QueryDerivedReferrer_BScreenRoleList(cb.query()); String prpp = keepScreenId_QueryDerivedReferrer_BScreenRoleListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SCREEN_ID", "SCREEN_ID", sqpp, "bScreenRoleList", rd, vl, prpp, op);
    }
    public abstract String keepScreenId_QueryDerivedReferrer_BScreenRoleList(BScreenRoleCQ sq);
    public abstract String keepScreenId_QueryDerivedReferrer_BScreenRoleListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CENTER_SCREEN where ...)} <br>
     * M_CENTER_SCREEN by SCREEN_ID, named 'MCenterScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterScreenList()</span>.<span style="color: #CC4747">max</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     screenCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterScreenCB> derivedMCenterScreenList() {
        return xcreateQDRFunctionMCenterScreenList();
    }
    protected HpQDRFunction<MCenterScreenCB> xcreateQDRFunctionMCenterScreenList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterScreenList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterScreenList(String fn, SubQuery<MCenterScreenCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterScreenCB cb = new MCenterScreenCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepScreenId_QueryDerivedReferrer_MCenterScreenList(cb.query()); String prpp = keepScreenId_QueryDerivedReferrer_MCenterScreenListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SCREEN_ID", "SCREEN_ID", sqpp, "mCenterScreenList", rd, vl, prpp, op);
    }
    public abstract String keepScreenId_QueryDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq);
    public abstract String keepScreenId_QueryDerivedReferrer_MCenterScreenListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CLIENT_SCREEN where ...)} <br>
     * M_CLIENT_SCREEN by SCREEN_ID, named 'MClientScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMClientScreenList()</span>.<span style="color: #CC4747">max</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     screenCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MClientScreenCB> derivedMClientScreenList() {
        return xcreateQDRFunctionMClientScreenList();
    }
    protected HpQDRFunction<MClientScreenCB> xcreateQDRFunctionMClientScreenList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMClientScreenList(fn, sq, rd, vl, op));
    }
    public void xqderiveMClientScreenList(String fn, SubQuery<MClientScreenCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientScreenCB cb = new MClientScreenCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepScreenId_QueryDerivedReferrer_MClientScreenList(cb.query()); String prpp = keepScreenId_QueryDerivedReferrer_MClientScreenListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SCREEN_ID", "SCREEN_ID", sqpp, "mClientScreenList", rd, vl, prpp, op);
    }
    public abstract String keepScreenId_QueryDerivedReferrer_MClientScreenList(MClientScreenCQ sq);
    public abstract String keepScreenId_QueryDerivedReferrer_MClientScreenListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setScreenId_IsNull() { regScreenId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCREEN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setScreenId_IsNotNull() { regScreenId(CK_ISNN, DOBJ); }

    protected void regScreenId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScreenId(), "SCREEN_ID"); }
    protected abstract ConditionValue xgetCValueScreenId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCREEN_CD: {UQ, NotNull, varchar(100)}
     * @param screenCd The value of screenCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenCd_Equal(String screenCd) {
        doSetScreenCd_Equal(fRES(screenCd));
    }

    protected void doSetScreenCd_Equal(String screenCd) {
        regScreenCd(CK_EQ, screenCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCREEN_CD: {UQ, NotNull, varchar(100)}
     * @param screenCd The value of screenCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenCd_NotEqual(String screenCd) {
        doSetScreenCd_NotEqual(fRES(screenCd));
    }

    protected void doSetScreenCd_NotEqual(String screenCd) {
        regScreenCd(CK_NES, screenCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCREEN_CD: {UQ, NotNull, varchar(100)}
     * @param screenCd The value of screenCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenCd_GreaterThan(String screenCd) {
        regScreenCd(CK_GT, fRES(screenCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCREEN_CD: {UQ, NotNull, varchar(100)}
     * @param screenCd The value of screenCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenCd_LessThan(String screenCd) {
        regScreenCd(CK_LT, fRES(screenCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCREEN_CD: {UQ, NotNull, varchar(100)}
     * @param screenCd The value of screenCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenCd_GreaterEqual(String screenCd) {
        regScreenCd(CK_GE, fRES(screenCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCREEN_CD: {UQ, NotNull, varchar(100)}
     * @param screenCd The value of screenCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenCd_LessEqual(String screenCd) {
        regScreenCd(CK_LE, fRES(screenCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCREEN_CD: {UQ, NotNull, varchar(100)}
     * @param screenCdList The collection of screenCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenCd_InScope(Collection<String> screenCdList) {
        doSetScreenCd_InScope(screenCdList);
    }

    protected void doSetScreenCd_InScope(Collection<String> screenCdList) {
        regINS(CK_INS, cTL(screenCdList), xgetCValueScreenCd(), "SCREEN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCREEN_CD: {UQ, NotNull, varchar(100)}
     * @param screenCdList The collection of screenCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenCd_NotInScope(Collection<String> screenCdList) {
        doSetScreenCd_NotInScope(screenCdList);
    }

    protected void doSetScreenCd_NotInScope(Collection<String> screenCdList) {
        regINS(CK_NINS, cTL(screenCdList), xgetCValueScreenCd(), "SCREEN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCREEN_CD: {UQ, NotNull, varchar(100)} <br>
     * <pre>e.g. setScreenCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param screenCd The value of screenCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScreenCd_LikeSearch(String screenCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(screenCd), xgetCValueScreenCd(), "SCREEN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCREEN_CD: {UQ, NotNull, varchar(100)}
     * @param screenCd The value of screenCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScreenCd_NotLikeSearch(String screenCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(screenCd), xgetCValueScreenCd(), "SCREEN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCREEN_CD: {UQ, NotNull, varchar(100)}
     * @param screenCd The value of screenCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScreenCd_PrefixSearch(String screenCd) {
        setScreenCd_LikeSearch(screenCd, xcLSOPPre());
    }

    protected void regScreenCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScreenCd(), "SCREEN_CD"); }
    protected abstract ConditionValue xgetCValueScreenCd();

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
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_Equal(String systemType) {
        doSetSystemType_Equal(fRES(systemType));
    }

    protected void doSetSystemType_Equal(String systemType) {
        regSystemType(CK_EQ, systemType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_NotEqual(String systemType) {
        doSetSystemType_NotEqual(fRES(systemType));
    }

    protected void doSetSystemType_NotEqual(String systemType) {
        regSystemType(CK_NES, systemType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_GreaterThan(String systemType) {
        regSystemType(CK_GT, fRES(systemType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_LessThan(String systemType) {
        regSystemType(CK_LT, fRES(systemType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_GreaterEqual(String systemType) {
        regSystemType(CK_GE, fRES(systemType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_LessEqual(String systemType) {
        regSystemType(CK_LE, fRES(systemType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemTypeList The collection of systemType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_InScope(Collection<String> systemTypeList) {
        doSetSystemType_InScope(systemTypeList);
    }

    protected void doSetSystemType_InScope(Collection<String> systemTypeList) {
        regINS(CK_INS, cTL(systemTypeList), xgetCValueSystemType(), "SYSTEM_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemTypeList The collection of systemType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_NotInScope(Collection<String> systemTypeList) {
        doSetSystemType_NotInScope(systemTypeList);
    }

    protected void doSetSystemType_NotInScope(Collection<String> systemTypeList) {
        regINS(CK_NINS, cTL(systemTypeList), xgetCValueSystemType(), "SYSTEM_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)} <br>
     * <pre>e.g. setSystemType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param systemType The value of systemType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSystemType_LikeSearch(String systemType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(systemType), xgetCValueSystemType(), "SYSTEM_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSystemType_NotLikeSearch(String systemType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(systemType), xgetCValueSystemType(), "SYSTEM_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_PrefixSearch(String systemType) {
        setSystemType_LikeSearch(systemType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     */
    public void setSystemType_IsNull() { regSystemType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     */
    public void setSystemType_IsNullOrEmpty() { regSystemType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     */
    public void setSystemType_IsNotNull() { regSystemType(CK_ISNN, DOBJ); }

    protected void regSystemType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSystemType(), "SYSTEM_TYPE"); }
    protected abstract ConditionValue xgetCValueSystemType();

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
    public HpSLCFunction<BScreenCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BScreenCB.class);
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
    public HpSLCFunction<BScreenCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BScreenCB.class);
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
    public HpSLCFunction<BScreenCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BScreenCB.class);
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
    public HpSLCFunction<BScreenCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BScreenCB.class);
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
    public HpSLCFunction<BScreenCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BScreenCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BScreenCB&gt;() {
     *     public void query(BScreenCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BScreenCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BScreenCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BScreenCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BScreenCQ sq);

    protected BScreenCB xcreateScalarConditionCB() {
        BScreenCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BScreenCB xcreateScalarConditionPartitionByCB() {
        BScreenCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BScreenCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BScreenCB cb = new BScreenCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SCREEN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BScreenCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BScreenCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BScreenCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BScreenCB cb = new BScreenCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SCREEN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BScreenCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BScreenCB cb = new BScreenCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BScreenCQ sq);

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
    protected BScreenCB newMyCB() {
        return new BScreenCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BScreenCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of B_MENU_GRP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBMenuGrpCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBMenuGrpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_MENU_GRP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuGrpId The value of menuGrpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuGrpId_Equal(Long menuGrpId) {
        doSetMenuGrpId_Equal(menuGrpId);
    }

    protected void doSetMenuGrpId_Equal(Long menuGrpId) {
        regMenuGrpId(CK_EQ, menuGrpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuGrpId The value of menuGrpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuGrpId_NotEqual(Long menuGrpId) {
        doSetMenuGrpId_NotEqual(menuGrpId);
    }

    protected void doSetMenuGrpId_NotEqual(Long menuGrpId) {
        regMenuGrpId(CK_NES, menuGrpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuGrpId The value of menuGrpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuGrpId_GreaterThan(Long menuGrpId) {
        regMenuGrpId(CK_GT, menuGrpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuGrpId The value of menuGrpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuGrpId_LessThan(Long menuGrpId) {
        regMenuGrpId(CK_LT, menuGrpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuGrpId The value of menuGrpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuGrpId_GreaterEqual(Long menuGrpId) {
        regMenuGrpId(CK_GE, menuGrpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuGrpId The value of menuGrpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMenuGrpId_LessEqual(Long menuGrpId) {
        regMenuGrpId(CK_LE, menuGrpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of menuGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of menuGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMenuGrpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMenuGrpId(), "MENU_GRP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MENU_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuGrpIdList The collection of menuGrpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuGrpId_InScope(Collection<Long> menuGrpIdList) {
        doSetMenuGrpId_InScope(menuGrpIdList);
    }

    protected void doSetMenuGrpId_InScope(Collection<Long> menuGrpIdList) {
        regINS(CK_INS, cTL(menuGrpIdList), xgetCValueMenuGrpId(), "MENU_GRP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MENU_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param menuGrpIdList The collection of menuGrpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuGrpId_NotInScope(Collection<Long> menuGrpIdList) {
        doSetMenuGrpId_NotInScope(menuGrpIdList);
    }

    protected void doSetMenuGrpId_NotInScope(Collection<Long> menuGrpIdList) {
        regINS(CK_NINS, cTL(menuGrpIdList), xgetCValueMenuGrpId(), "MENU_GRP_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MENU_GRP_ID from B_MENU where ...)} <br>
     * B_MENU by MENU_GRP_ID, named 'BMenuAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMenuGrpId_ExistsReferrer_BMenuList(cb.query());
        registerExistsReferrer(cb.query(), "MENU_GRP_ID", "MENU_GRP_ID", pp, "bMenuList");
    }
    public abstract String keepMenuGrpId_ExistsReferrer_BMenuList(BMenuCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PARENT_MENU_GRP_ID from B_MENU_GRP where ...)} <br>
     * B_MENU_GRP by PARENT_MENU_GRP_ID, named 'BMenuGrpSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBMenuGrpSelfList</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BMenuGrpSelfList for 'exists'. (NotNull)
     */
    public void existsBMenuGrpSelfList(SubQuery<BMenuGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMenuGrpId_ExistsReferrer_BMenuGrpSelfList(cb.query());
        registerExistsReferrer(cb.query(), "MENU_GRP_ID", "PARENT_MENU_GRP_ID", pp, "bMenuGrpSelfList");
    }
    public abstract String keepMenuGrpId_ExistsReferrer_BMenuGrpSelfList(BMenuGrpCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MENU_GRP_ID from B_MENU where ...)} <br>
     * B_MENU by MENU_GRP_ID, named 'BMenuAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBMenuList</span>(menuCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     menuCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MenuGrpId_NotExistsReferrer_BMenuList for 'not exists'. (NotNull)
     */
    public void notExistsBMenuList(SubQuery<BMenuCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMenuCB cb = new BMenuCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMenuGrpId_NotExistsReferrer_BMenuList(cb.query());
        registerNotExistsReferrer(cb.query(), "MENU_GRP_ID", "MENU_GRP_ID", pp, "bMenuList");
    }
    public abstract String keepMenuGrpId_NotExistsReferrer_BMenuList(BMenuCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PARENT_MENU_GRP_ID from B_MENU_GRP where ...)} <br>
     * B_MENU_GRP by PARENT_MENU_GRP_ID, named 'BMenuGrpSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBMenuGrpSelfList</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MenuGrpId_NotExistsReferrer_BMenuGrpSelfList for 'not exists'. (NotNull)
     */
    public void notExistsBMenuGrpSelfList(SubQuery<BMenuGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMenuGrpId_NotExistsReferrer_BMenuGrpSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "MENU_GRP_ID", "PARENT_MENU_GRP_ID", pp, "bMenuGrpSelfList");
    }
    public abstract String keepMenuGrpId_NotExistsReferrer_BMenuGrpSelfList(BMenuGrpCQ sq);

    public void xsderiveBMenuList(String fn, SubQuery<BMenuCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMenuCB cb = new BMenuCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMenuGrpId_SpecifyDerivedReferrer_BMenuList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MENU_GRP_ID", "MENU_GRP_ID", pp, "bMenuList", al, op);
    }
    public abstract String keepMenuGrpId_SpecifyDerivedReferrer_BMenuList(BMenuCQ sq);

    public void xsderiveBMenuGrpSelfList(String fn, SubQuery<BMenuGrpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMenuGrpId_SpecifyDerivedReferrer_BMenuGrpSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MENU_GRP_ID", "PARENT_MENU_GRP_ID", pp, "bMenuGrpSelfList", al, op);
    }
    public abstract String keepMenuGrpId_SpecifyDerivedReferrer_BMenuGrpSelfList(BMenuGrpCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_MENU where ...)} <br>
     * B_MENU by MENU_GRP_ID, named 'BMenuAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepMenuGrpId_QueryDerivedReferrer_BMenuList(cb.query()); String prpp = keepMenuGrpId_QueryDerivedReferrer_BMenuListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MENU_GRP_ID", "MENU_GRP_ID", sqpp, "bMenuList", rd, vl, prpp, op);
    }
    public abstract String keepMenuGrpId_QueryDerivedReferrer_BMenuList(BMenuCQ sq);
    public abstract String keepMenuGrpId_QueryDerivedReferrer_BMenuListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_MENU_GRP where ...)} <br>
     * B_MENU_GRP by PARENT_MENU_GRP_ID, named 'BMenuGrpSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBMenuGrpSelfList()</span>.<span style="color: #CC4747">max</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     grpCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BMenuGrpCB> derivedBMenuGrpSelfList() {
        return xcreateQDRFunctionBMenuGrpSelfList();
    }
    protected HpQDRFunction<BMenuGrpCB> xcreateQDRFunctionBMenuGrpSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBMenuGrpSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveBMenuGrpSelfList(String fn, SubQuery<BMenuGrpCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMenuGrpId_QueryDerivedReferrer_BMenuGrpSelfList(cb.query()); String prpp = keepMenuGrpId_QueryDerivedReferrer_BMenuGrpSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MENU_GRP_ID", "PARENT_MENU_GRP_ID", sqpp, "bMenuGrpSelfList", rd, vl, prpp, op);
    }
    public abstract String keepMenuGrpId_QueryDerivedReferrer_BMenuGrpSelfList(BMenuGrpCQ sq);
    public abstract String keepMenuGrpId_QueryDerivedReferrer_BMenuGrpSelfListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMenuGrpId_IsNull() { regMenuGrpId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MENU_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMenuGrpId_IsNotNull() { regMenuGrpId(CK_ISNN, DOBJ); }

    protected void regMenuGrpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMenuGrpId(), "MENU_GRP_ID"); }
    protected abstract ConditionValue xgetCValueMenuGrpId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_CD: {UQ, NotNull, varchar(30)}
     * @param menuGrpCd The value of menuGrpCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuGrpCd_Equal(String menuGrpCd) {
        doSetMenuGrpCd_Equal(fRES(menuGrpCd));
    }

    protected void doSetMenuGrpCd_Equal(String menuGrpCd) {
        regMenuGrpCd(CK_EQ, menuGrpCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_CD: {UQ, NotNull, varchar(30)}
     * @param menuGrpCd The value of menuGrpCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuGrpCd_NotEqual(String menuGrpCd) {
        doSetMenuGrpCd_NotEqual(fRES(menuGrpCd));
    }

    protected void doSetMenuGrpCd_NotEqual(String menuGrpCd) {
        regMenuGrpCd(CK_NES, menuGrpCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_CD: {UQ, NotNull, varchar(30)}
     * @param menuGrpCd The value of menuGrpCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuGrpCd_GreaterThan(String menuGrpCd) {
        regMenuGrpCd(CK_GT, fRES(menuGrpCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_CD: {UQ, NotNull, varchar(30)}
     * @param menuGrpCd The value of menuGrpCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuGrpCd_LessThan(String menuGrpCd) {
        regMenuGrpCd(CK_LT, fRES(menuGrpCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_CD: {UQ, NotNull, varchar(30)}
     * @param menuGrpCd The value of menuGrpCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuGrpCd_GreaterEqual(String menuGrpCd) {
        regMenuGrpCd(CK_GE, fRES(menuGrpCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MENU_GRP_CD: {UQ, NotNull, varchar(30)}
     * @param menuGrpCd The value of menuGrpCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuGrpCd_LessEqual(String menuGrpCd) {
        regMenuGrpCd(CK_LE, fRES(menuGrpCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MENU_GRP_CD: {UQ, NotNull, varchar(30)}
     * @param menuGrpCdList The collection of menuGrpCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuGrpCd_InScope(Collection<String> menuGrpCdList) {
        doSetMenuGrpCd_InScope(menuGrpCdList);
    }

    protected void doSetMenuGrpCd_InScope(Collection<String> menuGrpCdList) {
        regINS(CK_INS, cTL(menuGrpCdList), xgetCValueMenuGrpCd(), "MENU_GRP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MENU_GRP_CD: {UQ, NotNull, varchar(30)}
     * @param menuGrpCdList The collection of menuGrpCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuGrpCd_NotInScope(Collection<String> menuGrpCdList) {
        doSetMenuGrpCd_NotInScope(menuGrpCdList);
    }

    protected void doSetMenuGrpCd_NotInScope(Collection<String> menuGrpCdList) {
        regINS(CK_NINS, cTL(menuGrpCdList), xgetCValueMenuGrpCd(), "MENU_GRP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MENU_GRP_CD: {UQ, NotNull, varchar(30)} <br>
     * <pre>e.g. setMenuGrpCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param menuGrpCd The value of menuGrpCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMenuGrpCd_LikeSearch(String menuGrpCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(menuGrpCd), xgetCValueMenuGrpCd(), "MENU_GRP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MENU_GRP_CD: {UQ, NotNull, varchar(30)}
     * @param menuGrpCd The value of menuGrpCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMenuGrpCd_NotLikeSearch(String menuGrpCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(menuGrpCd), xgetCValueMenuGrpCd(), "MENU_GRP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MENU_GRP_CD: {UQ, NotNull, varchar(30)}
     * @param menuGrpCd The value of menuGrpCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMenuGrpCd_PrefixSearch(String menuGrpCd) {
        setMenuGrpCd_LikeSearch(menuGrpCd, xcLSOPPre());
    }

    protected void regMenuGrpCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMenuGrpCd(), "MENU_GRP_CD"); }
    protected abstract ConditionValue xgetCValueMenuGrpCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
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
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
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
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterThan(Long dictId) {
        regDictId(CK_GT, dictId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessThan(Long dictId) {
        regDictId(CK_LT, dictId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterEqual(Long dictId) {
        regDictId(CK_GE, dictId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessEqual(Long dictId) {
        regDictId(CK_LE, dictId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param minNumber The min number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDictId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDictId(), "DICT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
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
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
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

    protected void regDictId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDictId(), "DICT_ID"); }
    protected abstract ConditionValue xgetCValueDictId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_MENU_GRP_ID: {IX, bigint(19), FK to B_MENU_GRP}
     * @param parentMenuGrpId The value of parentMenuGrpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentMenuGrpId_Equal(Long parentMenuGrpId) {
        doSetParentMenuGrpId_Equal(parentMenuGrpId);
    }

    protected void doSetParentMenuGrpId_Equal(Long parentMenuGrpId) {
        regParentMenuGrpId(CK_EQ, parentMenuGrpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_MENU_GRP_ID: {IX, bigint(19), FK to B_MENU_GRP}
     * @param parentMenuGrpId The value of parentMenuGrpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentMenuGrpId_NotEqual(Long parentMenuGrpId) {
        doSetParentMenuGrpId_NotEqual(parentMenuGrpId);
    }

    protected void doSetParentMenuGrpId_NotEqual(Long parentMenuGrpId) {
        regParentMenuGrpId(CK_NES, parentMenuGrpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_MENU_GRP_ID: {IX, bigint(19), FK to B_MENU_GRP}
     * @param parentMenuGrpId The value of parentMenuGrpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentMenuGrpId_GreaterThan(Long parentMenuGrpId) {
        regParentMenuGrpId(CK_GT, parentMenuGrpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_MENU_GRP_ID: {IX, bigint(19), FK to B_MENU_GRP}
     * @param parentMenuGrpId The value of parentMenuGrpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentMenuGrpId_LessThan(Long parentMenuGrpId) {
        regParentMenuGrpId(CK_LT, parentMenuGrpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_MENU_GRP_ID: {IX, bigint(19), FK to B_MENU_GRP}
     * @param parentMenuGrpId The value of parentMenuGrpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentMenuGrpId_GreaterEqual(Long parentMenuGrpId) {
        regParentMenuGrpId(CK_GE, parentMenuGrpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_MENU_GRP_ID: {IX, bigint(19), FK to B_MENU_GRP}
     * @param parentMenuGrpId The value of parentMenuGrpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentMenuGrpId_LessEqual(Long parentMenuGrpId) {
        regParentMenuGrpId(CK_LE, parentMenuGrpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_MENU_GRP_ID: {IX, bigint(19), FK to B_MENU_GRP}
     * @param minNumber The min number of parentMenuGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of parentMenuGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setParentMenuGrpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueParentMenuGrpId(), "PARENT_MENU_GRP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARENT_MENU_GRP_ID: {IX, bigint(19), FK to B_MENU_GRP}
     * @param parentMenuGrpIdList The collection of parentMenuGrpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentMenuGrpId_InScope(Collection<Long> parentMenuGrpIdList) {
        doSetParentMenuGrpId_InScope(parentMenuGrpIdList);
    }

    protected void doSetParentMenuGrpId_InScope(Collection<Long> parentMenuGrpIdList) {
        regINS(CK_INS, cTL(parentMenuGrpIdList), xgetCValueParentMenuGrpId(), "PARENT_MENU_GRP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARENT_MENU_GRP_ID: {IX, bigint(19), FK to B_MENU_GRP}
     * @param parentMenuGrpIdList The collection of parentMenuGrpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentMenuGrpId_NotInScope(Collection<Long> parentMenuGrpIdList) {
        doSetParentMenuGrpId_NotInScope(parentMenuGrpIdList);
    }

    protected void doSetParentMenuGrpId_NotInScope(Collection<Long> parentMenuGrpIdList) {
        regINS(CK_NINS, cTL(parentMenuGrpIdList), xgetCValueParentMenuGrpId(), "PARENT_MENU_GRP_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PARENT_MENU_GRP_ID from B_MENU_GRP where ...)} <br />
     * B_MENU_GRP by my PARENT_MENU_GRP_ID, named 'BMenuGrpSelf'.
     * @param subCBLambda The callback for sub-query of BMenuGrpSelf for 'in-scope'. (NotNull)
     */
    public void inScopeBMenuGrpSelf(SubQuery<BMenuGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepParentMenuGrpId_InScopeRelation_BMenuGrpSelf(cb.query());
        registerInScopeRelation(cb.query(), "PARENT_MENU_GRP_ID", "MENU_GRP_ID", pp, "bMenuGrpSelf", false);
    }
    public abstract String keepParentMenuGrpId_InScopeRelation_BMenuGrpSelf(BMenuGrpCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PARENT_MENU_GRP_ID from B_MENU_GRP where ...)} <br />
     * B_MENU_GRP by my PARENT_MENU_GRP_ID, named 'BMenuGrpSelf'.
     * @param subCBLambda The callback for sub-query of BMenuGrpSelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeBMenuGrpSelf(SubQuery<BMenuGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepParentMenuGrpId_NotInScopeRelation_BMenuGrpSelf(cb.query());
        registerInScopeRelation(cb.query(), "PARENT_MENU_GRP_ID", "MENU_GRP_ID", pp, "bMenuGrpSelf", true);
    }
    public abstract String keepParentMenuGrpId_NotInScopeRelation_BMenuGrpSelf(BMenuGrpCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PARENT_MENU_GRP_ID: {IX, bigint(19), FK to B_MENU_GRP}
     */
    public void setParentMenuGrpId_IsNull() { regParentMenuGrpId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PARENT_MENU_GRP_ID: {IX, bigint(19), FK to B_MENU_GRP}
     */
    public void setParentMenuGrpId_IsNotNull() { regParentMenuGrpId(CK_ISNN, DOBJ); }

    protected void regParentMenuGrpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParentMenuGrpId(), "PARENT_MENU_GRP_ID"); }
    protected abstract ConditionValue xgetCValueParentMenuGrpId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_Equal(Long viewOrder) {
        doSetViewOrder_Equal(viewOrder);
    }

    protected void doSetViewOrder_Equal(Long viewOrder) {
        regViewOrder(CK_EQ, viewOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_NotEqual(Long viewOrder) {
        doSetViewOrder_NotEqual(viewOrder);
    }

    protected void doSetViewOrder_NotEqual(Long viewOrder) {
        regViewOrder(CK_NES, viewOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_GreaterThan(Long viewOrder) {
        regViewOrder(CK_GT, viewOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_LessThan(Long viewOrder) {
        regViewOrder(CK_LT, viewOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_GreaterEqual(Long viewOrder) {
        regViewOrder(CK_GE, viewOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_LessEqual(Long viewOrder) {
        regViewOrder(CK_LE, viewOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param minNumber The min number of viewOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of viewOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setViewOrder_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueViewOrder(), "VIEW_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrderList The collection of viewOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setViewOrder_InScope(Collection<Long> viewOrderList) {
        doSetViewOrder_InScope(viewOrderList);
    }

    protected void doSetViewOrder_InScope(Collection<Long> viewOrderList) {
        regINS(CK_INS, cTL(viewOrderList), xgetCValueViewOrder(), "VIEW_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrderList The collection of viewOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setViewOrder_NotInScope(Collection<Long> viewOrderList) {
        doSetViewOrder_NotInScope(viewOrderList);
    }

    protected void doSetViewOrder_NotInScope(Collection<Long> viewOrderList) {
        regINS(CK_NINS, cTL(viewOrderList), xgetCValueViewOrder(), "VIEW_ORDER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     */
    public void setViewOrder_IsNull() { regViewOrder(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     */
    public void setViewOrder_IsNotNull() { regViewOrder(CK_ISNN, DOBJ); }

    protected void regViewOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueViewOrder(), "VIEW_ORDER"); }
    protected abstract ConditionValue xgetCValueViewOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE_TYPE: {varchar(30)}
     * @param visibleType The value of visibleType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisibleType_Equal(String visibleType) {
        doSetVisibleType_Equal(fRES(visibleType));
    }

    protected void doSetVisibleType_Equal(String visibleType) {
        regVisibleType(CK_EQ, visibleType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE_TYPE: {varchar(30)}
     * @param visibleType The value of visibleType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisibleType_NotEqual(String visibleType) {
        doSetVisibleType_NotEqual(fRES(visibleType));
    }

    protected void doSetVisibleType_NotEqual(String visibleType) {
        regVisibleType(CK_NES, visibleType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE_TYPE: {varchar(30)}
     * @param visibleType The value of visibleType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisibleType_GreaterThan(String visibleType) {
        regVisibleType(CK_GT, fRES(visibleType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE_TYPE: {varchar(30)}
     * @param visibleType The value of visibleType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisibleType_LessThan(String visibleType) {
        regVisibleType(CK_LT, fRES(visibleType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE_TYPE: {varchar(30)}
     * @param visibleType The value of visibleType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisibleType_GreaterEqual(String visibleType) {
        regVisibleType(CK_GE, fRES(visibleType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VISIBLE_TYPE: {varchar(30)}
     * @param visibleType The value of visibleType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisibleType_LessEqual(String visibleType) {
        regVisibleType(CK_LE, fRES(visibleType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE_TYPE: {varchar(30)}
     * @param visibleTypeList The collection of visibleType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisibleType_InScope(Collection<String> visibleTypeList) {
        doSetVisibleType_InScope(visibleTypeList);
    }

    protected void doSetVisibleType_InScope(Collection<String> visibleTypeList) {
        regINS(CK_INS, cTL(visibleTypeList), xgetCValueVisibleType(), "VISIBLE_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VISIBLE_TYPE: {varchar(30)}
     * @param visibleTypeList The collection of visibleType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisibleType_NotInScope(Collection<String> visibleTypeList) {
        doSetVisibleType_NotInScope(visibleTypeList);
    }

    protected void doSetVisibleType_NotInScope(Collection<String> visibleTypeList) {
        regINS(CK_NINS, cTL(visibleTypeList), xgetCValueVisibleType(), "VISIBLE_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VISIBLE_TYPE: {varchar(30)} <br>
     * <pre>e.g. setVisibleType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param visibleType The value of visibleType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVisibleType_LikeSearch(String visibleType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(visibleType), xgetCValueVisibleType(), "VISIBLE_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VISIBLE_TYPE: {varchar(30)}
     * @param visibleType The value of visibleType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVisibleType_NotLikeSearch(String visibleType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(visibleType), xgetCValueVisibleType(), "VISIBLE_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VISIBLE_TYPE: {varchar(30)}
     * @param visibleType The value of visibleType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVisibleType_PrefixSearch(String visibleType) {
        setVisibleType_LikeSearch(visibleType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VISIBLE_TYPE: {varchar(30)}
     */
    public void setVisibleType_IsNull() { regVisibleType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VISIBLE_TYPE: {varchar(30)}
     */
    public void setVisibleType_IsNullOrEmpty() { regVisibleType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VISIBLE_TYPE: {varchar(30)}
     */
    public void setVisibleType_IsNotNull() { regVisibleType(CK_ISNN, DOBJ); }

    protected void regVisibleType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVisibleType(), "VISIBLE_TYPE"); }
    protected abstract ConditionValue xgetCValueVisibleType();

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
    public HpSLCFunction<BMenuGrpCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BMenuGrpCB.class);
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
    public HpSLCFunction<BMenuGrpCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BMenuGrpCB.class);
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
    public HpSLCFunction<BMenuGrpCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BMenuGrpCB.class);
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
    public HpSLCFunction<BMenuGrpCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BMenuGrpCB.class);
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
    public HpSLCFunction<BMenuGrpCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BMenuGrpCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BMenuGrpCB&gt;() {
     *     public void query(BMenuGrpCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BMenuGrpCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BMenuGrpCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BMenuGrpCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BMenuGrpCQ sq);

    protected BMenuGrpCB xcreateScalarConditionCB() {
        BMenuGrpCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BMenuGrpCB xcreateScalarConditionPartitionByCB() {
        BMenuGrpCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BMenuGrpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MENU_GRP_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BMenuGrpCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BMenuGrpCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BMenuGrpCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MENU_GRP_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BMenuGrpCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BMenuGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BMenuGrpCQ sq);

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
    protected BMenuGrpCB newMyCB() {
        return new BMenuGrpCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BMenuGrpCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

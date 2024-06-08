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
 * The abstract condition-query of B_ROLE_GRP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBRoleGrpCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBRoleGrpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_ROLE_GRP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpId The value of roleGrpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_Equal(Long roleGrpId) {
        doSetRoleGrpId_Equal(roleGrpId);
    }

    protected void doSetRoleGrpId_Equal(Long roleGrpId) {
        regRoleGrpId(CK_EQ, roleGrpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpId The value of roleGrpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_NotEqual(Long roleGrpId) {
        doSetRoleGrpId_NotEqual(roleGrpId);
    }

    protected void doSetRoleGrpId_NotEqual(Long roleGrpId) {
        regRoleGrpId(CK_NES, roleGrpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpId The value of roleGrpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_GreaterThan(Long roleGrpId) {
        regRoleGrpId(CK_GT, roleGrpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpId The value of roleGrpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_LessThan(Long roleGrpId) {
        regRoleGrpId(CK_LT, roleGrpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpId The value of roleGrpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_GreaterEqual(Long roleGrpId) {
        regRoleGrpId(CK_GE, roleGrpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpId The value of roleGrpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleGrpId_LessEqual(Long roleGrpId) {
        regRoleGrpId(CK_LE, roleGrpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of roleGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of roleGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRoleGrpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRoleGrpId(), "ROLE_GRP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpIdList The collection of roleGrpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpId_InScope(Collection<Long> roleGrpIdList) {
        doSetRoleGrpId_InScope(roleGrpIdList);
    }

    protected void doSetRoleGrpId_InScope(Collection<Long> roleGrpIdList) {
        regINS(CK_INS, cTL(roleGrpIdList), xgetCValueRoleGrpId(), "ROLE_GRP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param roleGrpIdList The collection of roleGrpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpId_NotInScope(Collection<Long> roleGrpIdList) {
        doSetRoleGrpId_NotInScope(roleGrpIdList);
    }

    protected void doSetRoleGrpId_NotInScope(Collection<Long> roleGrpIdList) {
        regINS(CK_NINS, cTL(roleGrpIdList), xgetCValueRoleGrpId(), "ROLE_GRP_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ROLE_GRP_ID from B_ROLE_GRP_DTL where ...)} <br>
     * B_ROLE_GRP_DTL by ROLE_GRP_ID, named 'BRoleGrpDtlAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRoleGrpId_ExistsReferrer_BRoleGrpDtlList(cb.query());
        registerExistsReferrer(cb.query(), "ROLE_GRP_ID", "ROLE_GRP_ID", pp, "bRoleGrpDtlList");
    }
    public abstract String keepRoleGrpId_ExistsReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ROLE_GRP_ID from B_USER where ...)} <br>
     * B_USER by ROLE_GRP_ID, named 'BUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBUserList</span>(userCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     userCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BUserList for 'exists'. (NotNull)
     */
    public void existsBUserList(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRoleGrpId_ExistsReferrer_BUserList(cb.query());
        registerExistsReferrer(cb.query(), "ROLE_GRP_ID", "ROLE_GRP_ID", pp, "bUserList");
    }
    public abstract String keepRoleGrpId_ExistsReferrer_BUserList(BUserCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ROLE_GRP_ID from B_ROLE_GRP_DTL where ...)} <br>
     * B_ROLE_GRP_DTL by ROLE_GRP_ID, named 'BRoleGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBRoleGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RoleGrpId_NotExistsReferrer_BRoleGrpDtlList for 'not exists'. (NotNull)
     */
    public void notExistsBRoleGrpDtlList(SubQuery<BRoleGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BRoleGrpDtlCB cb = new BRoleGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRoleGrpId_NotExistsReferrer_BRoleGrpDtlList(cb.query());
        registerNotExistsReferrer(cb.query(), "ROLE_GRP_ID", "ROLE_GRP_ID", pp, "bRoleGrpDtlList");
    }
    public abstract String keepRoleGrpId_NotExistsReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ROLE_GRP_ID from B_USER where ...)} <br>
     * B_USER by ROLE_GRP_ID, named 'BUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBUserList</span>(userCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     userCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RoleGrpId_NotExistsReferrer_BUserList for 'not exists'. (NotNull)
     */
    public void notExistsBUserList(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepRoleGrpId_NotExistsReferrer_BUserList(cb.query());
        registerNotExistsReferrer(cb.query(), "ROLE_GRP_ID", "ROLE_GRP_ID", pp, "bUserList");
    }
    public abstract String keepRoleGrpId_NotExistsReferrer_BUserList(BUserCQ sq);

    public void xsderiveBRoleGrpDtlList(String fn, SubQuery<BRoleGrpDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BRoleGrpDtlCB cb = new BRoleGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepRoleGrpId_SpecifyDerivedReferrer_BRoleGrpDtlList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ROLE_GRP_ID", "ROLE_GRP_ID", pp, "bRoleGrpDtlList", al, op);
    }
    public abstract String keepRoleGrpId_SpecifyDerivedReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq);

    public void xsderiveBUserList(String fn, SubQuery<BUserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BUserCB cb = new BUserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepRoleGrpId_SpecifyDerivedReferrer_BUserList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ROLE_GRP_ID", "ROLE_GRP_ID", pp, "bUserList", al, op);
    }
    public abstract String keepRoleGrpId_SpecifyDerivedReferrer_BUserList(BUserCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_ROLE_GRP_DTL where ...)} <br>
     * B_ROLE_GRP_DTL by ROLE_GRP_ID, named 'BRoleGrpDtlAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepRoleGrpId_QueryDerivedReferrer_BRoleGrpDtlList(cb.query()); String prpp = keepRoleGrpId_QueryDerivedReferrer_BRoleGrpDtlListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ROLE_GRP_ID", "ROLE_GRP_ID", sqpp, "bRoleGrpDtlList", rd, vl, prpp, op);
    }
    public abstract String keepRoleGrpId_QueryDerivedReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq);
    public abstract String keepRoleGrpId_QueryDerivedReferrer_BRoleGrpDtlListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_USER where ...)} <br>
     * B_USER by ROLE_GRP_ID, named 'BUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBUserList()</span>.<span style="color: #CC4747">max</span>(userCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     userCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     userCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BUserCB> derivedBUserList() {
        return xcreateQDRFunctionBUserList();
    }
    protected HpQDRFunction<BUserCB> xcreateQDRFunctionBUserList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBUserList(fn, sq, rd, vl, op));
    }
    public void xqderiveBUserList(String fn, SubQuery<BUserCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BUserCB cb = new BUserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepRoleGrpId_QueryDerivedReferrer_BUserList(cb.query()); String prpp = keepRoleGrpId_QueryDerivedReferrer_BUserListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ROLE_GRP_ID", "ROLE_GRP_ID", sqpp, "bUserList", rd, vl, prpp, op);
    }
    public abstract String keepRoleGrpId_QueryDerivedReferrer_BUserList(BUserCQ sq);
    public abstract String keepRoleGrpId_QueryDerivedReferrer_BUserListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setRoleGrpId_IsNull() { regRoleGrpId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ROLE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setRoleGrpId_IsNotNull() { regRoleGrpId(CK_ISNN, DOBJ); }

    protected void regRoleGrpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRoleGrpId(), "ROLE_GRP_ID"); }
    protected abstract ConditionValue xgetCValueRoleGrpId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_CD: {UQ+, NotNull, varchar(30)}
     * @param roleGrpCd The value of roleGrpCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpCd_Equal(String roleGrpCd) {
        doSetRoleGrpCd_Equal(fRES(roleGrpCd));
    }

    protected void doSetRoleGrpCd_Equal(String roleGrpCd) {
        regRoleGrpCd(CK_EQ, roleGrpCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_CD: {UQ+, NotNull, varchar(30)}
     * @param roleGrpCd The value of roleGrpCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpCd_NotEqual(String roleGrpCd) {
        doSetRoleGrpCd_NotEqual(fRES(roleGrpCd));
    }

    protected void doSetRoleGrpCd_NotEqual(String roleGrpCd) {
        regRoleGrpCd(CK_NES, roleGrpCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_CD: {UQ+, NotNull, varchar(30)}
     * @param roleGrpCd The value of roleGrpCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpCd_GreaterThan(String roleGrpCd) {
        regRoleGrpCd(CK_GT, fRES(roleGrpCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_CD: {UQ+, NotNull, varchar(30)}
     * @param roleGrpCd The value of roleGrpCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpCd_LessThan(String roleGrpCd) {
        regRoleGrpCd(CK_LT, fRES(roleGrpCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_CD: {UQ+, NotNull, varchar(30)}
     * @param roleGrpCd The value of roleGrpCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpCd_GreaterEqual(String roleGrpCd) {
        regRoleGrpCd(CK_GE, fRES(roleGrpCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_GRP_CD: {UQ+, NotNull, varchar(30)}
     * @param roleGrpCd The value of roleGrpCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpCd_LessEqual(String roleGrpCd) {
        regRoleGrpCd(CK_LE, fRES(roleGrpCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ROLE_GRP_CD: {UQ+, NotNull, varchar(30)}
     * @param roleGrpCdList The collection of roleGrpCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpCd_InScope(Collection<String> roleGrpCdList) {
        doSetRoleGrpCd_InScope(roleGrpCdList);
    }

    protected void doSetRoleGrpCd_InScope(Collection<String> roleGrpCdList) {
        regINS(CK_INS, cTL(roleGrpCdList), xgetCValueRoleGrpCd(), "ROLE_GRP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ROLE_GRP_CD: {UQ+, NotNull, varchar(30)}
     * @param roleGrpCdList The collection of roleGrpCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpCd_NotInScope(Collection<String> roleGrpCdList) {
        doSetRoleGrpCd_NotInScope(roleGrpCdList);
    }

    protected void doSetRoleGrpCd_NotInScope(Collection<String> roleGrpCdList) {
        regINS(CK_NINS, cTL(roleGrpCdList), xgetCValueRoleGrpCd(), "ROLE_GRP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ROLE_GRP_CD: {UQ+, NotNull, varchar(30)} <br>
     * <pre>e.g. setRoleGrpCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param roleGrpCd The value of roleGrpCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRoleGrpCd_LikeSearch(String roleGrpCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(roleGrpCd), xgetCValueRoleGrpCd(), "ROLE_GRP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ROLE_GRP_CD: {UQ+, NotNull, varchar(30)}
     * @param roleGrpCd The value of roleGrpCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRoleGrpCd_NotLikeSearch(String roleGrpCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(roleGrpCd), xgetCValueRoleGrpCd(), "ROLE_GRP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ROLE_GRP_CD: {UQ+, NotNull, varchar(30)}
     * @param roleGrpCd The value of roleGrpCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleGrpCd_PrefixSearch(String roleGrpCd) {
        setRoleGrpCd_LikeSearch(roleGrpCd, xcLSOPPre());
    }

    protected void regRoleGrpCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRoleGrpCd(), "ROLE_GRP_CD"); }
    protected abstract ConditionValue xgetCValueRoleGrpCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
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
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
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
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterThan(Long dictId) {
        regDictId(CK_GT, dictId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessThan(Long dictId) {
        regDictId(CK_LT, dictId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterEqual(Long dictId) {
        regDictId(CK_GE, dictId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessEqual(Long dictId) {
        regDictId(CK_LE, dictId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
     * @param minNumber The min number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDictId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDictId(), "DICT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
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
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
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
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
     */
    public void setDictId_IsNull() { regDictId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DICT_ID: {+UQ, IX, bigint(19), FK to B_DICT}
     */
    public void setDictId_IsNotNull() { regDictId(CK_ISNN, DOBJ); }

    protected void regDictId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDictId(), "DICT_ID"); }
    protected abstract ConditionValue xgetCValueDictId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass}
     * @param roleControlClass The value of roleControlClass as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleControlClass_Equal(String roleControlClass) {
        doSetRoleControlClass_Equal(fRES(roleControlClass));
    }

    /**
     * Equal(=). As RoleControlClass. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass} <br>
     * 権限制御区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleControlClass_Equal_AsRoleControlClass(CDef.RoleControlClass cdef) {
        doSetRoleControlClass_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 許可を指定
     */
    public void setRoleControlClass_Equal_$1() {
        setRoleControlClass_Equal_AsRoleControlClass(CDef.RoleControlClass.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 拒否を指定
     */
    public void setRoleControlClass_Equal_$2() {
        setRoleControlClass_Equal_AsRoleControlClass(CDef.RoleControlClass.$2);
    }

    protected void doSetRoleControlClass_Equal(String roleControlClass) {
        regRoleControlClass(CK_EQ, roleControlClass);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass}
     * @param roleControlClass The value of roleControlClass as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleControlClass_NotEqual(String roleControlClass) {
        doSetRoleControlClass_NotEqual(fRES(roleControlClass));
    }

    /**
     * NotEqual(&lt;&gt;). As RoleControlClass. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass} <br>
     * 権限制御区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setRoleControlClass_NotEqual_AsRoleControlClass(CDef.RoleControlClass cdef) {
        doSetRoleControlClass_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 許可を指定
     */
    public void setRoleControlClass_NotEqual_$1() {
        setRoleControlClass_NotEqual_AsRoleControlClass(CDef.RoleControlClass.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 拒否を指定
     */
    public void setRoleControlClass_NotEqual_$2() {
        setRoleControlClass_NotEqual_AsRoleControlClass(CDef.RoleControlClass.$2);
    }

    protected void doSetRoleControlClass_NotEqual(String roleControlClass) {
        regRoleControlClass(CK_NES, roleControlClass);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass}
     * @param roleControlClassList The collection of roleControlClass as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleControlClass_InScope(Collection<String> roleControlClassList) {
        doSetRoleControlClass_InScope(roleControlClassList);
    }

    /**
     * InScope {in ('a', 'b')}. As RoleControlClass. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass} <br>
     * 権限制御区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleControlClass_InScope_AsRoleControlClass(Collection<CDef.RoleControlClass> cdefList) {
        doSetRoleControlClass_InScope(cTStrL(cdefList));
    }

    protected void doSetRoleControlClass_InScope(Collection<String> roleControlClassList) {
        regINS(CK_INS, cTL(roleControlClassList), xgetCValueRoleControlClass(), "ROLE_CONTROL_CLASS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass}
     * @param roleControlClassList The collection of roleControlClass as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleControlClass_NotInScope(Collection<String> roleControlClassList) {
        doSetRoleControlClass_NotInScope(roleControlClassList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As RoleControlClass. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ROLE_CONTROL_CLASS: {NotNull, varchar(30), FK to B_CLASS_DTL, classification=RoleControlClass} <br>
     * 権限制御区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRoleControlClass_NotInScope_AsRoleControlClass(Collection<CDef.RoleControlClass> cdefList) {
        doSetRoleControlClass_NotInScope(cTStrL(cdefList));
    }

    protected void doSetRoleControlClass_NotInScope(Collection<String> roleControlClassList) {
        regINS(CK_NINS, cTL(roleControlClassList), xgetCValueRoleControlClass(), "ROLE_CONTROL_CLASS");
    }

    protected void regRoleControlClass(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRoleControlClass(), "ROLE_CONTROL_CLASS"); }
    protected abstract ConditionValue xgetCValueRoleControlClass();

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
    public HpSLCFunction<BRoleGrpCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BRoleGrpCB.class);
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
    public HpSLCFunction<BRoleGrpCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BRoleGrpCB.class);
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
    public HpSLCFunction<BRoleGrpCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BRoleGrpCB.class);
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
    public HpSLCFunction<BRoleGrpCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BRoleGrpCB.class);
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
    public HpSLCFunction<BRoleGrpCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BRoleGrpCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BRoleGrpCB&gt;() {
     *     public void query(BRoleGrpCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BRoleGrpCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BRoleGrpCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BRoleGrpCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BRoleGrpCQ sq);

    protected BRoleGrpCB xcreateScalarConditionCB() {
        BRoleGrpCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BRoleGrpCB xcreateScalarConditionPartitionByCB() {
        BRoleGrpCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BRoleGrpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BRoleGrpCB cb = new BRoleGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ROLE_GRP_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BRoleGrpCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BRoleGrpCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BRoleGrpCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BRoleGrpCB cb = new BRoleGrpCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ROLE_GRP_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BRoleGrpCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BRoleGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BRoleGrpCB cb = new BRoleGrpCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BRoleGrpCQ sq);

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
    protected BRoleGrpCB newMyCB() {
        return new BRoleGrpCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BRoleGrpCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

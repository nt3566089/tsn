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
 * The abstract condition-query of B_CLASS_GRP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBClassGrpCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBClassGrpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_CLASS_GRP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_ID: {PK, NotNull, bigint(19)}
     * @param classGrpId The value of classGrpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassGrpId_Equal(Long classGrpId) {
        doSetClassGrpId_Equal(classGrpId);
    }

    protected void doSetClassGrpId_Equal(Long classGrpId) {
        regClassGrpId(CK_EQ, classGrpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_ID: {PK, NotNull, bigint(19)}
     * @param classGrpId The value of classGrpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassGrpId_NotEqual(Long classGrpId) {
        doSetClassGrpId_NotEqual(classGrpId);
    }

    protected void doSetClassGrpId_NotEqual(Long classGrpId) {
        regClassGrpId(CK_NES, classGrpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_ID: {PK, NotNull, bigint(19)}
     * @param classGrpId The value of classGrpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassGrpId_GreaterThan(Long classGrpId) {
        regClassGrpId(CK_GT, classGrpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_ID: {PK, NotNull, bigint(19)}
     * @param classGrpId The value of classGrpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassGrpId_LessThan(Long classGrpId) {
        regClassGrpId(CK_LT, classGrpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_ID: {PK, NotNull, bigint(19)}
     * @param classGrpId The value of classGrpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassGrpId_GreaterEqual(Long classGrpId) {
        regClassGrpId(CK_GE, classGrpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_ID: {PK, NotNull, bigint(19)}
     * @param classGrpId The value of classGrpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassGrpId_LessEqual(Long classGrpId) {
        regClassGrpId(CK_LE, classGrpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_ID: {PK, NotNull, bigint(19)}
     * @param minNumber The min number of classGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of classGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClassGrpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClassGrpId(), "CLASS_GRP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLASS_GRP_ID: {PK, NotNull, bigint(19)}
     * @param classGrpIdList The collection of classGrpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpId_InScope(Collection<Long> classGrpIdList) {
        doSetClassGrpId_InScope(classGrpIdList);
    }

    protected void doSetClassGrpId_InScope(Collection<Long> classGrpIdList) {
        regINS(CK_INS, cTL(classGrpIdList), xgetCValueClassGrpId(), "CLASS_GRP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLASS_GRP_ID: {PK, NotNull, bigint(19)}
     * @param classGrpIdList The collection of classGrpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpId_NotInScope(Collection<Long> classGrpIdList) {
        doSetClassGrpId_NotInScope(classGrpIdList);
    }

    protected void doSetClassGrpId_NotInScope(Collection<Long> classGrpIdList) {
        regINS(CK_NINS, cTL(classGrpIdList), xgetCValueClassGrpId(), "CLASS_GRP_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLASS_GRP_ID from B_CLASS_GRP_DTL where ...)} <br>
     * B_CLASS_GRP_DTL by CLASS_GRP_ID, named 'BClassGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBClassGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BClassGrpDtlList for 'exists'. (NotNull)
     */
    public void existsBClassGrpDtlList(SubQuery<BClassGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassGrpDtlCB cb = new BClassGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClassGrpId_ExistsReferrer_BClassGrpDtlList(cb.query());
        registerExistsReferrer(cb.query(), "CLASS_GRP_ID", "CLASS_GRP_ID", pp, "bClassGrpDtlList");
    }
    public abstract String keepClassGrpId_ExistsReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLASS_GRP_ID from B_CLASS_GRP_DTL where ...)} <br>
     * B_CLASS_GRP_DTL by CLASS_GRP_ID, named 'BClassGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBClassGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClassGrpId_NotExistsReferrer_BClassGrpDtlList for 'not exists'. (NotNull)
     */
    public void notExistsBClassGrpDtlList(SubQuery<BClassGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassGrpDtlCB cb = new BClassGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClassGrpId_NotExistsReferrer_BClassGrpDtlList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLASS_GRP_ID", "CLASS_GRP_ID", pp, "bClassGrpDtlList");
    }
    public abstract String keepClassGrpId_NotExistsReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq);

    public void xsderiveBClassGrpDtlList(String fn, SubQuery<BClassGrpDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassGrpDtlCB cb = new BClassGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClassGrpId_SpecifyDerivedReferrer_BClassGrpDtlList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLASS_GRP_ID", "CLASS_GRP_ID", pp, "bClassGrpDtlList", al, op);
    }
    public abstract String keepClassGrpId_SpecifyDerivedReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_CLASS_GRP_DTL where ...)} <br>
     * B_CLASS_GRP_DTL by CLASS_GRP_ID, named 'BClassGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBClassGrpDtlList()</span>.<span style="color: #CC4747">max</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dtlCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BClassGrpDtlCB> derivedBClassGrpDtlList() {
        return xcreateQDRFunctionBClassGrpDtlList();
    }
    protected HpQDRFunction<BClassGrpDtlCB> xcreateQDRFunctionBClassGrpDtlList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBClassGrpDtlList(fn, sq, rd, vl, op));
    }
    public void xqderiveBClassGrpDtlList(String fn, SubQuery<BClassGrpDtlCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassGrpDtlCB cb = new BClassGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClassGrpId_QueryDerivedReferrer_BClassGrpDtlList(cb.query()); String prpp = keepClassGrpId_QueryDerivedReferrer_BClassGrpDtlListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLASS_GRP_ID", "CLASS_GRP_ID", sqpp, "bClassGrpDtlList", rd, vl, prpp, op);
    }
    public abstract String keepClassGrpId_QueryDerivedReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq);
    public abstract String keepClassGrpId_QueryDerivedReferrer_BClassGrpDtlListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLASS_GRP_ID: {PK, NotNull, bigint(19)}
     */
    public void setClassGrpId_IsNull() { regClassGrpId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLASS_GRP_ID: {PK, NotNull, bigint(19)}
     */
    public void setClassGrpId_IsNotNull() { regClassGrpId(CK_ISNN, DOBJ); }

    protected void regClassGrpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClassGrpId(), "CLASS_GRP_ID"); }
    protected abstract ConditionValue xgetCValueClassGrpId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @param classGrpCd The value of classGrpCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpCd_Equal(String classGrpCd) {
        doSetClassGrpCd_Equal(fRES(classGrpCd));
    }

    protected void doSetClassGrpCd_Equal(String classGrpCd) {
        regClassGrpCd(CK_EQ, classGrpCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @param classGrpCd The value of classGrpCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpCd_NotEqual(String classGrpCd) {
        doSetClassGrpCd_NotEqual(fRES(classGrpCd));
    }

    protected void doSetClassGrpCd_NotEqual(String classGrpCd) {
        regClassGrpCd(CK_NES, classGrpCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @param classGrpCd The value of classGrpCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpCd_GreaterThan(String classGrpCd) {
        regClassGrpCd(CK_GT, fRES(classGrpCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @param classGrpCd The value of classGrpCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpCd_LessThan(String classGrpCd) {
        regClassGrpCd(CK_LT, fRES(classGrpCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @param classGrpCd The value of classGrpCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpCd_GreaterEqual(String classGrpCd) {
        regClassGrpCd(CK_GE, fRES(classGrpCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @param classGrpCd The value of classGrpCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpCd_LessEqual(String classGrpCd) {
        regClassGrpCd(CK_LE, fRES(classGrpCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @param classGrpCdList The collection of classGrpCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpCd_InScope(Collection<String> classGrpCdList) {
        doSetClassGrpCd_InScope(classGrpCdList);
    }

    protected void doSetClassGrpCd_InScope(Collection<String> classGrpCdList) {
        regINS(CK_INS, cTL(classGrpCdList), xgetCValueClassGrpCd(), "CLASS_GRP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @param classGrpCdList The collection of classGrpCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpCd_NotInScope(Collection<String> classGrpCdList) {
        doSetClassGrpCd_NotInScope(classGrpCdList);
    }

    protected void doSetClassGrpCd_NotInScope(Collection<String> classGrpCdList) {
        regINS(CK_NINS, cTL(classGrpCdList), xgetCValueClassGrpCd(), "CLASS_GRP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)} <br>
     * <pre>e.g. setClassGrpCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param classGrpCd The value of classGrpCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClassGrpCd_LikeSearch(String classGrpCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(classGrpCd), xgetCValueClassGrpCd(), "CLASS_GRP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @param classGrpCd The value of classGrpCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClassGrpCd_NotLikeSearch(String classGrpCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(classGrpCd), xgetCValueClassGrpCd(), "CLASS_GRP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_GRP_CD: {+UQ, NotNull, varchar(30)}
     * @param classGrpCd The value of classGrpCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpCd_PrefixSearch(String classGrpCd) {
        setClassGrpCd_LikeSearch(classGrpCd, xcLSOPPre());
    }

    protected void regClassGrpCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClassGrpCd(), "CLASS_GRP_CD"); }
    protected abstract ConditionValue xgetCValueClassGrpCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @param classGrpComment The value of classGrpComment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpComment_Equal(String classGrpComment) {
        doSetClassGrpComment_Equal(fRES(classGrpComment));
    }

    protected void doSetClassGrpComment_Equal(String classGrpComment) {
        regClassGrpComment(CK_EQ, classGrpComment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @param classGrpComment The value of classGrpComment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpComment_NotEqual(String classGrpComment) {
        doSetClassGrpComment_NotEqual(fRES(classGrpComment));
    }

    protected void doSetClassGrpComment_NotEqual(String classGrpComment) {
        regClassGrpComment(CK_NES, classGrpComment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @param classGrpComment The value of classGrpComment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpComment_GreaterThan(String classGrpComment) {
        regClassGrpComment(CK_GT, fRES(classGrpComment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @param classGrpComment The value of classGrpComment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpComment_LessThan(String classGrpComment) {
        regClassGrpComment(CK_LT, fRES(classGrpComment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @param classGrpComment The value of classGrpComment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpComment_GreaterEqual(String classGrpComment) {
        regClassGrpComment(CK_GE, fRES(classGrpComment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @param classGrpComment The value of classGrpComment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpComment_LessEqual(String classGrpComment) {
        regClassGrpComment(CK_LE, fRES(classGrpComment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @param classGrpCommentList The collection of classGrpComment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpComment_InScope(Collection<String> classGrpCommentList) {
        doSetClassGrpComment_InScope(classGrpCommentList);
    }

    protected void doSetClassGrpComment_InScope(Collection<String> classGrpCommentList) {
        regINS(CK_INS, cTL(classGrpCommentList), xgetCValueClassGrpComment(), "CLASS_GRP_COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @param classGrpCommentList The collection of classGrpComment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpComment_NotInScope(Collection<String> classGrpCommentList) {
        doSetClassGrpComment_NotInScope(classGrpCommentList);
    }

    protected void doSetClassGrpComment_NotInScope(Collection<String> classGrpCommentList) {
        regINS(CK_NINS, cTL(classGrpCommentList), xgetCValueClassGrpComment(), "CLASS_GRP_COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_GRP_COMMENT: {varchar(60)} <br>
     * <pre>e.g. setClassGrpComment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param classGrpComment The value of classGrpComment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClassGrpComment_LikeSearch(String classGrpComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(classGrpComment), xgetCValueClassGrpComment(), "CLASS_GRP_COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @param classGrpComment The value of classGrpComment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClassGrpComment_NotLikeSearch(String classGrpComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(classGrpComment), xgetCValueClassGrpComment(), "CLASS_GRP_COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     * @param classGrpComment The value of classGrpComment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassGrpComment_PrefixSearch(String classGrpComment) {
        setClassGrpComment_LikeSearch(classGrpComment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     */
    public void setClassGrpComment_IsNull() { regClassGrpComment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     */
    public void setClassGrpComment_IsNullOrEmpty() { regClassGrpComment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLASS_GRP_COMMENT: {varchar(60)}
     */
    public void setClassGrpComment_IsNotNull() { regClassGrpComment(CK_ISNN, DOBJ); }

    protected void regClassGrpComment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClassGrpComment(), "CLASS_GRP_COMMENT"); }
    protected abstract ConditionValue xgetCValueClassGrpComment();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classId The value of classId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_Equal(Long classId) {
        doSetClassId_Equal(classId);
    }

    protected void doSetClassId_Equal(Long classId) {
        regClassId(CK_EQ, classId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classId The value of classId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_NotEqual(Long classId) {
        doSetClassId_NotEqual(classId);
    }

    protected void doSetClassId_NotEqual(Long classId) {
        regClassId(CK_NES, classId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classId The value of classId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_GreaterThan(Long classId) {
        regClassId(CK_GT, classId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classId The value of classId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_LessThan(Long classId) {
        regClassId(CK_LT, classId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classId The value of classId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_GreaterEqual(Long classId) {
        regClassId(CK_GE, classId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classId The value of classId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_LessEqual(Long classId) {
        regClassId(CK_LE, classId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param minNumber The min number of classId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of classId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClassId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClassId(), "CLASS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classIdList The collection of classId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassId_InScope(Collection<Long> classIdList) {
        doSetClassId_InScope(classIdList);
    }

    protected void doSetClassId_InScope(Collection<Long> classIdList) {
        regINS(CK_INS, cTL(classIdList), xgetCValueClassId(), "CLASS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classIdList The collection of classId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassId_NotInScope(Collection<Long> classIdList) {
        doSetClassId_NotInScope(classIdList);
    }

    protected void doSetClassId_NotInScope(Collection<Long> classIdList) {
        regINS(CK_NINS, cTL(classIdList), xgetCValueClassId(), "CLASS_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLASS_ID from B_CLASS where ...)} <br />
     * B_CLASS by my CLASS_ID, named 'BClass'.
     * @param subCBLambda The callback for sub-query of BClass for 'in-scope'. (NotNull)
     */
    public void inScopeBClass(SubQuery<BClassCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassCB cb = new BClassCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClassId_InScopeRelation_BClass(cb.query());
        registerInScopeRelation(cb.query(), "CLASS_ID", "CLASS_ID", pp, "bClass", false);
    }
    public abstract String keepClassId_InScopeRelation_BClass(BClassCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLASS_ID from B_CLASS where ...)} <br />
     * B_CLASS by my CLASS_ID, named 'BClass'.
     * @param subCBLambda The callback for sub-query of BClass for 'not in-scope'. (NotNull)
     */
    public void notInScopeBClass(SubQuery<BClassCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassCB cb = new BClassCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClassId_NotInScopeRelation_BClass(cb.query());
        registerInScopeRelation(cb.query(), "CLASS_ID", "CLASS_ID", pp, "bClass", true);
    }
    public abstract String keepClassId_NotInScopeRelation_BClass(BClassCQ sq);

    protected void regClassId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClassId(), "CLASS_ID"); }
    protected abstract ConditionValue xgetCValueClassId();

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
    public HpSLCFunction<BClassGrpCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BClassGrpCB.class);
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
    public HpSLCFunction<BClassGrpCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BClassGrpCB.class);
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
    public HpSLCFunction<BClassGrpCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BClassGrpCB.class);
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
    public HpSLCFunction<BClassGrpCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BClassGrpCB.class);
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
    public HpSLCFunction<BClassGrpCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BClassGrpCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BClassGrpCB&gt;() {
     *     public void query(BClassGrpCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BClassGrpCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BClassGrpCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassGrpCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BClassGrpCQ sq);

    protected BClassGrpCB xcreateScalarConditionCB() {
        BClassGrpCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BClassGrpCB xcreateScalarConditionPartitionByCB() {
        BClassGrpCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BClassGrpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassGrpCB cb = new BClassGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CLASS_GRP_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BClassGrpCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BClassGrpCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BClassGrpCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassGrpCB cb = new BClassGrpCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CLASS_GRP_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BClassGrpCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BClassGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassGrpCB cb = new BClassGrpCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BClassGrpCQ sq);

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
    protected BClassGrpCB newMyCB() {
        return new BClassGrpCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BClassGrpCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

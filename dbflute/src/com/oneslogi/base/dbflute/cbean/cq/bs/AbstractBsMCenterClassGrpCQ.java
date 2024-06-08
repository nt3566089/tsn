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
 * The abstract condition-query of M_CENTER_CLASS_GRP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCenterClassGrpCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCenterClassGrpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CENTER_CLASS_GRP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassGrpId The value of centerClassGrpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassGrpId_Equal(Long centerClassGrpId) {
        doSetCenterClassGrpId_Equal(centerClassGrpId);
    }

    protected void doSetCenterClassGrpId_Equal(Long centerClassGrpId) {
        regCenterClassGrpId(CK_EQ, centerClassGrpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassGrpId The value of centerClassGrpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassGrpId_NotEqual(Long centerClassGrpId) {
        doSetCenterClassGrpId_NotEqual(centerClassGrpId);
    }

    protected void doSetCenterClassGrpId_NotEqual(Long centerClassGrpId) {
        regCenterClassGrpId(CK_NES, centerClassGrpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassGrpId The value of centerClassGrpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassGrpId_GreaterThan(Long centerClassGrpId) {
        regCenterClassGrpId(CK_GT, centerClassGrpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassGrpId The value of centerClassGrpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassGrpId_LessThan(Long centerClassGrpId) {
        regCenterClassGrpId(CK_LT, centerClassGrpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassGrpId The value of centerClassGrpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassGrpId_GreaterEqual(Long centerClassGrpId) {
        regCenterClassGrpId(CK_GE, centerClassGrpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassGrpId The value of centerClassGrpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassGrpId_LessEqual(Long centerClassGrpId) {
        regCenterClassGrpId(CK_LE, centerClassGrpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of centerClassGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerClassGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterClassGrpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterClassGrpId(), "CENTER_CLASS_GRP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_CLASS_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassGrpIdList The collection of centerClassGrpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterClassGrpId_InScope(Collection<Long> centerClassGrpIdList) {
        doSetCenterClassGrpId_InScope(centerClassGrpIdList);
    }

    protected void doSetCenterClassGrpId_InScope(Collection<Long> centerClassGrpIdList) {
        regINS(CK_INS, cTL(centerClassGrpIdList), xgetCValueCenterClassGrpId(), "CENTER_CLASS_GRP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_CLASS_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerClassGrpIdList The collection of centerClassGrpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterClassGrpId_NotInScope(Collection<Long> centerClassGrpIdList) {
        doSetCenterClassGrpId_NotInScope(centerClassGrpIdList);
    }

    protected void doSetCenterClassGrpId_NotInScope(Collection<Long> centerClassGrpIdList) {
        regINS(CK_NINS, cTL(centerClassGrpIdList), xgetCValueCenterClassGrpId(), "CENTER_CLASS_GRP_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CENTER_CLASS_GRP_ID from M_CENTER_CLASS_GRP_DTL where ...)} <br>
     * M_CENTER_CLASS_GRP_DTL by CENTER_CLASS_GRP_ID, named 'MCenterClassGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterClassGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterClassGrpDtlList for 'exists'. (NotNull)
     */
    public void existsMCenterClassGrpDtlList(SubQuery<MCenterClassGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassGrpDtlCB cb = new MCenterClassGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterClassGrpId_ExistsReferrer_MCenterClassGrpDtlList(cb.query());
        registerExistsReferrer(cb.query(), "CENTER_CLASS_GRP_ID", "CENTER_CLASS_GRP_ID", pp, "mCenterClassGrpDtlList");
    }
    public abstract String keepCenterClassGrpId_ExistsReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CENTER_CLASS_GRP_ID from M_CENTER_CLASS_GRP_DTL where ...)} <br>
     * M_CENTER_CLASS_GRP_DTL by CENTER_CLASS_GRP_ID, named 'MCenterClassGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterClassGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CenterClassGrpId_NotExistsReferrer_MCenterClassGrpDtlList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterClassGrpDtlList(SubQuery<MCenterClassGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassGrpDtlCB cb = new MCenterClassGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCenterClassGrpId_NotExistsReferrer_MCenterClassGrpDtlList(cb.query());
        registerNotExistsReferrer(cb.query(), "CENTER_CLASS_GRP_ID", "CENTER_CLASS_GRP_ID", pp, "mCenterClassGrpDtlList");
    }
    public abstract String keepCenterClassGrpId_NotExistsReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq);

    public void xsderiveMCenterClassGrpDtlList(String fn, SubQuery<MCenterClassGrpDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassGrpDtlCB cb = new MCenterClassGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCenterClassGrpId_SpecifyDerivedReferrer_MCenterClassGrpDtlList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CENTER_CLASS_GRP_ID", "CENTER_CLASS_GRP_ID", pp, "mCenterClassGrpDtlList", al, op);
    }
    public abstract String keepCenterClassGrpId_SpecifyDerivedReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CENTER_CLASS_GRP_DTL where ...)} <br>
     * M_CENTER_CLASS_GRP_DTL by CENTER_CLASS_GRP_ID, named 'MCenterClassGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterClassGrpDtlList()</span>.<span style="color: #CC4747">max</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dtlCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterClassGrpDtlCB> derivedMCenterClassGrpDtlList() {
        return xcreateQDRFunctionMCenterClassGrpDtlList();
    }
    protected HpQDRFunction<MCenterClassGrpDtlCB> xcreateQDRFunctionMCenterClassGrpDtlList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterClassGrpDtlList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterClassGrpDtlList(String fn, SubQuery<MCenterClassGrpDtlCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassGrpDtlCB cb = new MCenterClassGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCenterClassGrpId_QueryDerivedReferrer_MCenterClassGrpDtlList(cb.query()); String prpp = keepCenterClassGrpId_QueryDerivedReferrer_MCenterClassGrpDtlListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CENTER_CLASS_GRP_ID", "CENTER_CLASS_GRP_ID", sqpp, "mCenterClassGrpDtlList", rd, vl, prpp, op);
    }
    public abstract String keepCenterClassGrpId_QueryDerivedReferrer_MCenterClassGrpDtlList(MCenterClassGrpDtlCQ sq);
    public abstract String keepCenterClassGrpId_QueryDerivedReferrer_MCenterClassGrpDtlListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_CLASS_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCenterClassGrpId_IsNull() { regCenterClassGrpId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_CLASS_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCenterClassGrpId_IsNotNull() { regCenterClassGrpId(CK_ISNN, DOBJ); }

    protected void regCenterClassGrpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterClassGrpId(), "CENTER_CLASS_GRP_ID"); }
    protected abstract ConditionValue xgetCValueCenterClassGrpId();

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
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassId The value of centerClassId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassId_Equal(Long centerClassId) {
        doSetCenterClassId_Equal(centerClassId);
    }

    protected void doSetCenterClassId_Equal(Long centerClassId) {
        regCenterClassId(CK_EQ, centerClassId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassId The value of centerClassId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassId_NotEqual(Long centerClassId) {
        doSetCenterClassId_NotEqual(centerClassId);
    }

    protected void doSetCenterClassId_NotEqual(Long centerClassId) {
        regCenterClassId(CK_NES, centerClassId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassId The value of centerClassId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassId_GreaterThan(Long centerClassId) {
        regCenterClassId(CK_GT, centerClassId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassId The value of centerClassId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassId_LessThan(Long centerClassId) {
        regCenterClassId(CK_LT, centerClassId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassId The value of centerClassId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassId_GreaterEqual(Long centerClassId) {
        regCenterClassId(CK_GE, centerClassId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassId The value of centerClassId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassId_LessEqual(Long centerClassId) {
        regCenterClassId(CK_LE, centerClassId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param minNumber The min number of centerClassId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerClassId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterClassId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterClassId(), "CENTER_CLASS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassIdList The collection of centerClassId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterClassId_InScope(Collection<Long> centerClassIdList) {
        doSetCenterClassId_InScope(centerClassIdList);
    }

    protected void doSetCenterClassId_InScope(Collection<Long> centerClassIdList) {
        regINS(CK_INS, cTL(centerClassIdList), xgetCValueCenterClassId(), "CENTER_CLASS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to M_CENTER_CLASS}
     * @param centerClassIdList The collection of centerClassId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterClassId_NotInScope(Collection<Long> centerClassIdList) {
        doSetCenterClassId_NotInScope(centerClassIdList);
    }

    protected void doSetCenterClassId_NotInScope(Collection<Long> centerClassIdList) {
        regINS(CK_NINS, cTL(centerClassIdList), xgetCValueCenterClassId(), "CENTER_CLASS_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CENTER_CLASS_ID from M_CENTER_CLASS where ...)} <br />
     * M_CENTER_CLASS by my CENTER_CLASS_ID, named 'MCenterClass'.
     * @param subCBLambda The callback for sub-query of MCenterClass for 'in-scope'. (NotNull)
     */
    public void inScopeMCenterClass(SubQuery<MCenterClassCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassCB cb = new MCenterClassCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterClassId_InScopeRelation_MCenterClass(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_CLASS_ID", "CENTER_CLASS_ID", pp, "mCenterClass", false);
    }
    public abstract String keepCenterClassId_InScopeRelation_MCenterClass(MCenterClassCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CENTER_CLASS_ID from M_CENTER_CLASS where ...)} <br />
     * M_CENTER_CLASS by my CENTER_CLASS_ID, named 'MCenterClass'.
     * @param subCBLambda The callback for sub-query of MCenterClass for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCenterClass(SubQuery<MCenterClassCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassCB cb = new MCenterClassCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterClassId_NotInScopeRelation_MCenterClass(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_CLASS_ID", "CENTER_CLASS_ID", pp, "mCenterClass", true);
    }
    public abstract String keepCenterClassId_NotInScopeRelation_MCenterClass(MCenterClassCQ sq);

    protected void regCenterClassId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterClassId(), "CENTER_CLASS_ID"); }
    protected abstract ConditionValue xgetCValueCenterClassId();

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
    public HpSLCFunction<MCenterClassGrpCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCenterClassGrpCB.class);
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
    public HpSLCFunction<MCenterClassGrpCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCenterClassGrpCB.class);
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
    public HpSLCFunction<MCenterClassGrpCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCenterClassGrpCB.class);
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
    public HpSLCFunction<MCenterClassGrpCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCenterClassGrpCB.class);
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
    public HpSLCFunction<MCenterClassGrpCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCenterClassGrpCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCenterClassGrpCB&gt;() {
     *     public void query(MCenterClassGrpCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCenterClassGrpCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCenterClassGrpCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassGrpCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCenterClassGrpCQ sq);

    protected MCenterClassGrpCB xcreateScalarConditionCB() {
        MCenterClassGrpCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCenterClassGrpCB xcreateScalarConditionPartitionByCB() {
        MCenterClassGrpCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCenterClassGrpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassGrpCB cb = new MCenterClassGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CENTER_CLASS_GRP_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCenterClassGrpCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCenterClassGrpCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCenterClassGrpCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassGrpCB cb = new MCenterClassGrpCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CENTER_CLASS_GRP_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCenterClassGrpCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCenterClassGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassGrpCB cb = new MCenterClassGrpCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCenterClassGrpCQ sq);

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
    protected MCenterClassGrpCB newMyCB() {
        return new MCenterClassGrpCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCenterClassGrpCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

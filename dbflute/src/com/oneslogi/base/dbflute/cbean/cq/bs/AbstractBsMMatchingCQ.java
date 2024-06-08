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
 * The abstract condition-query of M_MATCHING.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMMatchingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMMatchingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_MATCHING";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MATCHING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param matchingId The value of matchingId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMatchingId_Equal(Long matchingId) {
        doSetMatchingId_Equal(matchingId);
    }

    protected void doSetMatchingId_Equal(Long matchingId) {
        regMatchingId(CK_EQ, matchingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MATCHING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param matchingId The value of matchingId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMatchingId_NotEqual(Long matchingId) {
        doSetMatchingId_NotEqual(matchingId);
    }

    protected void doSetMatchingId_NotEqual(Long matchingId) {
        regMatchingId(CK_NES, matchingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MATCHING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param matchingId The value of matchingId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMatchingId_GreaterThan(Long matchingId) {
        regMatchingId(CK_GT, matchingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MATCHING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param matchingId The value of matchingId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMatchingId_LessThan(Long matchingId) {
        regMatchingId(CK_LT, matchingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MATCHING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param matchingId The value of matchingId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMatchingId_GreaterEqual(Long matchingId) {
        regMatchingId(CK_GE, matchingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MATCHING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param matchingId The value of matchingId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMatchingId_LessEqual(Long matchingId) {
        regMatchingId(CK_LE, matchingId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MATCHING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of matchingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of matchingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMatchingId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMatchingId(), "MATCHING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MATCHING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param matchingIdList The collection of matchingId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingId_InScope(Collection<Long> matchingIdList) {
        doSetMatchingId_InScope(matchingIdList);
    }

    protected void doSetMatchingId_InScope(Collection<Long> matchingIdList) {
        regINS(CK_INS, cTL(matchingIdList), xgetCValueMatchingId(), "MATCHING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MATCHING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param matchingIdList The collection of matchingId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingId_NotInScope(Collection<Long> matchingIdList) {
        doSetMatchingId_NotInScope(matchingIdList);
    }

    protected void doSetMatchingId_NotInScope(Collection<Long> matchingIdList) {
        regINS(CK_NINS, cTL(matchingIdList), xgetCValueMatchingId(), "MATCHING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MATCHING_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMatchingId_IsNull() { regMatchingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MATCHING_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMatchingId_IsNotNull() { regMatchingId(CK_ISNN, DOBJ); }

    protected void regMatchingId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMatchingId(), "MATCHING_ID"); }
    protected abstract ConditionValue xgetCValueMatchingId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATCHING_TYPE: {UQ+, NotNull, varchar(30)}
     * @param matchingType The value of matchingType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingType_Equal(String matchingType) {
        doSetMatchingType_Equal(fRES(matchingType));
    }

    protected void doSetMatchingType_Equal(String matchingType) {
        regMatchingType(CK_EQ, matchingType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATCHING_TYPE: {UQ+, NotNull, varchar(30)}
     * @param matchingType The value of matchingType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingType_NotEqual(String matchingType) {
        doSetMatchingType_NotEqual(fRES(matchingType));
    }

    protected void doSetMatchingType_NotEqual(String matchingType) {
        regMatchingType(CK_NES, matchingType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATCHING_TYPE: {UQ+, NotNull, varchar(30)}
     * @param matchingType The value of matchingType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingType_GreaterThan(String matchingType) {
        regMatchingType(CK_GT, fRES(matchingType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATCHING_TYPE: {UQ+, NotNull, varchar(30)}
     * @param matchingType The value of matchingType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingType_LessThan(String matchingType) {
        regMatchingType(CK_LT, fRES(matchingType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATCHING_TYPE: {UQ+, NotNull, varchar(30)}
     * @param matchingType The value of matchingType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingType_GreaterEqual(String matchingType) {
        regMatchingType(CK_GE, fRES(matchingType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATCHING_TYPE: {UQ+, NotNull, varchar(30)}
     * @param matchingType The value of matchingType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingType_LessEqual(String matchingType) {
        regMatchingType(CK_LE, fRES(matchingType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MATCHING_TYPE: {UQ+, NotNull, varchar(30)}
     * @param matchingTypeList The collection of matchingType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingType_InScope(Collection<String> matchingTypeList) {
        doSetMatchingType_InScope(matchingTypeList);
    }

    protected void doSetMatchingType_InScope(Collection<String> matchingTypeList) {
        regINS(CK_INS, cTL(matchingTypeList), xgetCValueMatchingType(), "MATCHING_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MATCHING_TYPE: {UQ+, NotNull, varchar(30)}
     * @param matchingTypeList The collection of matchingType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingType_NotInScope(Collection<String> matchingTypeList) {
        doSetMatchingType_NotInScope(matchingTypeList);
    }

    protected void doSetMatchingType_NotInScope(Collection<String> matchingTypeList) {
        regINS(CK_NINS, cTL(matchingTypeList), xgetCValueMatchingType(), "MATCHING_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MATCHING_TYPE: {UQ+, NotNull, varchar(30)} <br>
     * <pre>e.g. setMatchingType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param matchingType The value of matchingType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMatchingType_LikeSearch(String matchingType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(matchingType), xgetCValueMatchingType(), "MATCHING_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MATCHING_TYPE: {UQ+, NotNull, varchar(30)}
     * @param matchingType The value of matchingType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMatchingType_NotLikeSearch(String matchingType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(matchingType), xgetCValueMatchingType(), "MATCHING_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MATCHING_TYPE: {UQ+, NotNull, varchar(30)}
     * @param matchingType The value of matchingType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingType_PrefixSearch(String matchingType) {
        setMatchingType_LikeSearch(matchingType, xcLSOPPre());
    }

    protected void regMatchingType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMatchingType(), "MATCHING_TYPE"); }
    protected abstract ConditionValue xgetCValueMatchingType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATCHING_KEYWORD: {+UQ, NotNull, varchar(100)}
     * @param matchingKeyword The value of matchingKeyword as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingKeyword_Equal(String matchingKeyword) {
        doSetMatchingKeyword_Equal(fRES(matchingKeyword));
    }

    protected void doSetMatchingKeyword_Equal(String matchingKeyword) {
        regMatchingKeyword(CK_EQ, matchingKeyword);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATCHING_KEYWORD: {+UQ, NotNull, varchar(100)}
     * @param matchingKeyword The value of matchingKeyword as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingKeyword_NotEqual(String matchingKeyword) {
        doSetMatchingKeyword_NotEqual(fRES(matchingKeyword));
    }

    protected void doSetMatchingKeyword_NotEqual(String matchingKeyword) {
        regMatchingKeyword(CK_NES, matchingKeyword);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATCHING_KEYWORD: {+UQ, NotNull, varchar(100)}
     * @param matchingKeyword The value of matchingKeyword as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingKeyword_GreaterThan(String matchingKeyword) {
        regMatchingKeyword(CK_GT, fRES(matchingKeyword));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATCHING_KEYWORD: {+UQ, NotNull, varchar(100)}
     * @param matchingKeyword The value of matchingKeyword as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingKeyword_LessThan(String matchingKeyword) {
        regMatchingKeyword(CK_LT, fRES(matchingKeyword));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATCHING_KEYWORD: {+UQ, NotNull, varchar(100)}
     * @param matchingKeyword The value of matchingKeyword as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingKeyword_GreaterEqual(String matchingKeyword) {
        regMatchingKeyword(CK_GE, fRES(matchingKeyword));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MATCHING_KEYWORD: {+UQ, NotNull, varchar(100)}
     * @param matchingKeyword The value of matchingKeyword as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingKeyword_LessEqual(String matchingKeyword) {
        regMatchingKeyword(CK_LE, fRES(matchingKeyword));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MATCHING_KEYWORD: {+UQ, NotNull, varchar(100)}
     * @param matchingKeywordList The collection of matchingKeyword as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingKeyword_InScope(Collection<String> matchingKeywordList) {
        doSetMatchingKeyword_InScope(matchingKeywordList);
    }

    protected void doSetMatchingKeyword_InScope(Collection<String> matchingKeywordList) {
        regINS(CK_INS, cTL(matchingKeywordList), xgetCValueMatchingKeyword(), "MATCHING_KEYWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MATCHING_KEYWORD: {+UQ, NotNull, varchar(100)}
     * @param matchingKeywordList The collection of matchingKeyword as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingKeyword_NotInScope(Collection<String> matchingKeywordList) {
        doSetMatchingKeyword_NotInScope(matchingKeywordList);
    }

    protected void doSetMatchingKeyword_NotInScope(Collection<String> matchingKeywordList) {
        regINS(CK_NINS, cTL(matchingKeywordList), xgetCValueMatchingKeyword(), "MATCHING_KEYWORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MATCHING_KEYWORD: {+UQ, NotNull, varchar(100)} <br>
     * <pre>e.g. setMatchingKeyword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param matchingKeyword The value of matchingKeyword as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMatchingKeyword_LikeSearch(String matchingKeyword, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(matchingKeyword), xgetCValueMatchingKeyword(), "MATCHING_KEYWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MATCHING_KEYWORD: {+UQ, NotNull, varchar(100)}
     * @param matchingKeyword The value of matchingKeyword as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMatchingKeyword_NotLikeSearch(String matchingKeyword, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(matchingKeyword), xgetCValueMatchingKeyword(), "MATCHING_KEYWORD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MATCHING_KEYWORD: {+UQ, NotNull, varchar(100)}
     * @param matchingKeyword The value of matchingKeyword as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMatchingKeyword_PrefixSearch(String matchingKeyword) {
        setMatchingKeyword_LikeSearch(matchingKeyword, xcLSOPPre());
    }

    protected void regMatchingKeyword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMatchingKeyword(), "MATCHING_KEYWORD"); }
    protected abstract ConditionValue xgetCValueMatchingKeyword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFORM_CD: {NotNull, varchar(100)}
     * @param transformCd The value of transformCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransformCd_Equal(String transformCd) {
        doSetTransformCd_Equal(fRES(transformCd));
    }

    protected void doSetTransformCd_Equal(String transformCd) {
        regTransformCd(CK_EQ, transformCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFORM_CD: {NotNull, varchar(100)}
     * @param transformCd The value of transformCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransformCd_NotEqual(String transformCd) {
        doSetTransformCd_NotEqual(fRES(transformCd));
    }

    protected void doSetTransformCd_NotEqual(String transformCd) {
        regTransformCd(CK_NES, transformCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFORM_CD: {NotNull, varchar(100)}
     * @param transformCd The value of transformCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransformCd_GreaterThan(String transformCd) {
        regTransformCd(CK_GT, fRES(transformCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFORM_CD: {NotNull, varchar(100)}
     * @param transformCd The value of transformCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransformCd_LessThan(String transformCd) {
        regTransformCd(CK_LT, fRES(transformCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFORM_CD: {NotNull, varchar(100)}
     * @param transformCd The value of transformCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransformCd_GreaterEqual(String transformCd) {
        regTransformCd(CK_GE, fRES(transformCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFORM_CD: {NotNull, varchar(100)}
     * @param transformCd The value of transformCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransformCd_LessEqual(String transformCd) {
        regTransformCd(CK_LE, fRES(transformCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSFORM_CD: {NotNull, varchar(100)}
     * @param transformCdList The collection of transformCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransformCd_InScope(Collection<String> transformCdList) {
        doSetTransformCd_InScope(transformCdList);
    }

    protected void doSetTransformCd_InScope(Collection<String> transformCdList) {
        regINS(CK_INS, cTL(transformCdList), xgetCValueTransformCd(), "TRANSFORM_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSFORM_CD: {NotNull, varchar(100)}
     * @param transformCdList The collection of transformCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransformCd_NotInScope(Collection<String> transformCdList) {
        doSetTransformCd_NotInScope(transformCdList);
    }

    protected void doSetTransformCd_NotInScope(Collection<String> transformCdList) {
        regINS(CK_NINS, cTL(transformCdList), xgetCValueTransformCd(), "TRANSFORM_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSFORM_CD: {NotNull, varchar(100)} <br>
     * <pre>e.g. setTransformCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transformCd The value of transformCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransformCd_LikeSearch(String transformCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transformCd), xgetCValueTransformCd(), "TRANSFORM_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSFORM_CD: {NotNull, varchar(100)}
     * @param transformCd The value of transformCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransformCd_NotLikeSearch(String transformCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transformCd), xgetCValueTransformCd(), "TRANSFORM_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSFORM_CD: {NotNull, varchar(100)}
     * @param transformCd The value of transformCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransformCd_PrefixSearch(String transformCd) {
        setTransformCd_LikeSearch(transformCd, xcLSOPPre());
    }

    protected void regTransformCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransformCd(), "TRANSFORM_CD"); }
    protected abstract ConditionValue xgetCValueTransformCd();

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
    public HpSLCFunction<MMatchingCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MMatchingCB.class);
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
    public HpSLCFunction<MMatchingCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MMatchingCB.class);
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
    public HpSLCFunction<MMatchingCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MMatchingCB.class);
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
    public HpSLCFunction<MMatchingCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MMatchingCB.class);
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
    public HpSLCFunction<MMatchingCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MMatchingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MMatchingCB&gt;() {
     *     public void query(MMatchingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MMatchingCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MMatchingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MMatchingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MMatchingCQ sq);

    protected MMatchingCB xcreateScalarConditionCB() {
        MMatchingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MMatchingCB xcreateScalarConditionPartitionByCB() {
        MMatchingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MMatchingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMatchingCB cb = new MMatchingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MATCHING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MMatchingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MMatchingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MMatchingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMatchingCB cb = new MMatchingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MATCHING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MMatchingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MMatchingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMatchingCB cb = new MMatchingCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MMatchingCQ sq);

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
    protected MMatchingCB newMyCB() {
        return new MMatchingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MMatchingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

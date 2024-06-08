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
 * The abstract condition-query of B_ARG_VALID.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBArgValidCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBArgValidCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_ARG_VALID";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARG_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ARG}
     * @param argId The value of argId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setArgId_Equal(Long argId) {
        doSetArgId_Equal(argId);
    }

    protected void doSetArgId_Equal(Long argId) {
        regArgId(CK_EQ, argId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ARG_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ARG}
     * @param argId The value of argId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArgId_NotEqual(Long argId) {
        doSetArgId_NotEqual(argId);
    }

    protected void doSetArgId_NotEqual(Long argId) {
        regArgId(CK_NES, argId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ARG_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ARG}
     * @param argId The value of argId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArgId_GreaterThan(Long argId) {
        regArgId(CK_GT, argId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ARG_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ARG}
     * @param argId The value of argId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArgId_LessThan(Long argId) {
        regArgId(CK_LT, argId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARG_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ARG}
     * @param argId The value of argId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArgId_GreaterEqual(Long argId) {
        regArgId(CK_GE, argId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARG_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ARG}
     * @param argId The value of argId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArgId_LessEqual(Long argId) {
        regArgId(CK_LE, argId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ARG_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ARG}
     * @param minNumber The min number of argId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of argId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setArgId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueArgId(), "ARG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ARG_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ARG}
     * @param argIdList The collection of argId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgId_InScope(Collection<Long> argIdList) {
        doSetArgId_InScope(argIdList);
    }

    protected void doSetArgId_InScope(Collection<Long> argIdList) {
        regINS(CK_INS, cTL(argIdList), xgetCValueArgId(), "ARG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ARG_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ARG}
     * @param argIdList The collection of argId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgId_NotInScope(Collection<Long> argIdList) {
        doSetArgId_NotInScope(argIdList);
    }

    protected void doSetArgId_NotInScope(Collection<Long> argIdList) {
        regINS(CK_NINS, cTL(argIdList), xgetCValueArgId(), "ARG_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ARG_ID from B_ARG where ...)} <br />
     * B_ARG by my ARG_ID, named 'BArg'.
     * @param subCBLambda The callback for sub-query of BArg for 'in-scope'. (NotNull)
     */
    public void inScopeBArg(SubQuery<BArgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BArgCB cb = new BArgCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepArgId_InScopeRelation_BArg(cb.query());
        registerInScopeRelation(cb.query(), "ARG_ID", "ARG_ID", pp, "bArg", false);
    }
    public abstract String keepArgId_InScopeRelation_BArg(BArgCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ARG_ID from B_ARG where ...)} <br />
     * B_ARG by my ARG_ID, named 'BArg'.
     * @param subCBLambda The callback for sub-query of BArg for 'not in-scope'. (NotNull)
     */
    public void notInScopeBArg(SubQuery<BArgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BArgCB cb = new BArgCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepArgId_NotInScopeRelation_BArg(cb.query());
        registerInScopeRelation(cb.query(), "ARG_ID", "ARG_ID", pp, "bArg", true);
    }
    public abstract String keepArgId_NotInScopeRelation_BArg(BArgCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARG_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ARG}
     */
    public void setArgId_IsNull() { regArgId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARG_ID: {PK, ID, NotNull, bigint identity(19), FK to B_ARG}
     */
    public void setArgId_IsNotNull() { regArgId(CK_ISNN, DOBJ); }

    protected void regArgId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArgId(), "ARG_ID"); }
    protected abstract ConditionValue xgetCValueArgId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_LIMIT: {varchar(100)}
     * @param inputLimit The value of inputLimit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputLimit_Equal(String inputLimit) {
        doSetInputLimit_Equal(fRES(inputLimit));
    }

    protected void doSetInputLimit_Equal(String inputLimit) {
        regInputLimit(CK_EQ, inputLimit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_LIMIT: {varchar(100)}
     * @param inputLimit The value of inputLimit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputLimit_NotEqual(String inputLimit) {
        doSetInputLimit_NotEqual(fRES(inputLimit));
    }

    protected void doSetInputLimit_NotEqual(String inputLimit) {
        regInputLimit(CK_NES, inputLimit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_LIMIT: {varchar(100)}
     * @param inputLimit The value of inputLimit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputLimit_GreaterThan(String inputLimit) {
        regInputLimit(CK_GT, fRES(inputLimit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_LIMIT: {varchar(100)}
     * @param inputLimit The value of inputLimit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputLimit_LessThan(String inputLimit) {
        regInputLimit(CK_LT, fRES(inputLimit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_LIMIT: {varchar(100)}
     * @param inputLimit The value of inputLimit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputLimit_GreaterEqual(String inputLimit) {
        regInputLimit(CK_GE, fRES(inputLimit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_LIMIT: {varchar(100)}
     * @param inputLimit The value of inputLimit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputLimit_LessEqual(String inputLimit) {
        regInputLimit(CK_LE, fRES(inputLimit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_LIMIT: {varchar(100)}
     * @param inputLimitList The collection of inputLimit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputLimit_InScope(Collection<String> inputLimitList) {
        doSetInputLimit_InScope(inputLimitList);
    }

    protected void doSetInputLimit_InScope(Collection<String> inputLimitList) {
        regINS(CK_INS, cTL(inputLimitList), xgetCValueInputLimit(), "INPUT_LIMIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_LIMIT: {varchar(100)}
     * @param inputLimitList The collection of inputLimit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputLimit_NotInScope(Collection<String> inputLimitList) {
        doSetInputLimit_NotInScope(inputLimitList);
    }

    protected void doSetInputLimit_NotInScope(Collection<String> inputLimitList) {
        regINS(CK_NINS, cTL(inputLimitList), xgetCValueInputLimit(), "INPUT_LIMIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INPUT_LIMIT: {varchar(100)} <br>
     * <pre>e.g. setInputLimit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inputLimit The value of inputLimit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInputLimit_LikeSearch(String inputLimit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inputLimit), xgetCValueInputLimit(), "INPUT_LIMIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INPUT_LIMIT: {varchar(100)}
     * @param inputLimit The value of inputLimit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInputLimit_NotLikeSearch(String inputLimit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inputLimit), xgetCValueInputLimit(), "INPUT_LIMIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INPUT_LIMIT: {varchar(100)}
     * @param inputLimit The value of inputLimit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputLimit_PrefixSearch(String inputLimit) {
        setInputLimit_LikeSearch(inputLimit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INPUT_LIMIT: {varchar(100)}
     */
    public void setInputLimit_IsNull() { regInputLimit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INPUT_LIMIT: {varchar(100)}
     */
    public void setInputLimit_IsNullOrEmpty() { regInputLimit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INPUT_LIMIT: {varchar(100)}
     */
    public void setInputLimit_IsNotNull() { regInputLimit(CK_ISNN, DOBJ); }

    protected void regInputLimit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInputLimit(), "INPUT_LIMIT"); }
    protected abstract ConditionValue xgetCValueInputLimit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     * @param limitMessageCd The value of limitMessageCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitMessageCd_Equal(String limitMessageCd) {
        doSetLimitMessageCd_Equal(fRES(limitMessageCd));
    }

    protected void doSetLimitMessageCd_Equal(String limitMessageCd) {
        regLimitMessageCd(CK_EQ, limitMessageCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     * @param limitMessageCd The value of limitMessageCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitMessageCd_NotEqual(String limitMessageCd) {
        doSetLimitMessageCd_NotEqual(fRES(limitMessageCd));
    }

    protected void doSetLimitMessageCd_NotEqual(String limitMessageCd) {
        regLimitMessageCd(CK_NES, limitMessageCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     * @param limitMessageCd The value of limitMessageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitMessageCd_GreaterThan(String limitMessageCd) {
        regLimitMessageCd(CK_GT, fRES(limitMessageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     * @param limitMessageCd The value of limitMessageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitMessageCd_LessThan(String limitMessageCd) {
        regLimitMessageCd(CK_LT, fRES(limitMessageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     * @param limitMessageCd The value of limitMessageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitMessageCd_GreaterEqual(String limitMessageCd) {
        regLimitMessageCd(CK_GE, fRES(limitMessageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     * @param limitMessageCd The value of limitMessageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitMessageCd_LessEqual(String limitMessageCd) {
        regLimitMessageCd(CK_LE, fRES(limitMessageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     * @param limitMessageCdList The collection of limitMessageCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitMessageCd_InScope(Collection<String> limitMessageCdList) {
        doSetLimitMessageCd_InScope(limitMessageCdList);
    }

    protected void doSetLimitMessageCd_InScope(Collection<String> limitMessageCdList) {
        regINS(CK_INS, cTL(limitMessageCdList), xgetCValueLimitMessageCd(), "LIMIT_MESSAGE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     * @param limitMessageCdList The collection of limitMessageCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitMessageCd_NotInScope(Collection<String> limitMessageCdList) {
        doSetLimitMessageCd_NotInScope(limitMessageCdList);
    }

    protected void doSetLimitMessageCd_NotInScope(Collection<String> limitMessageCdList) {
        regINS(CK_NINS, cTL(limitMessageCdList), xgetCValueLimitMessageCd(), "LIMIT_MESSAGE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)} <br>
     * <pre>e.g. setLimitMessageCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitMessageCd The value of limitMessageCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitMessageCd_LikeSearch(String limitMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitMessageCd), xgetCValueLimitMessageCd(), "LIMIT_MESSAGE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     * @param limitMessageCd The value of limitMessageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitMessageCd_NotLikeSearch(String limitMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitMessageCd), xgetCValueLimitMessageCd(), "LIMIT_MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     * @param limitMessageCd The value of limitMessageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitMessageCd_PrefixSearch(String limitMessageCd) {
        setLimitMessageCd_LikeSearch(limitMessageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     */
    public void setLimitMessageCd_IsNull() { regLimitMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     */
    public void setLimitMessageCd_IsNullOrEmpty() { regLimitMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_MESSAGE_CD: {varchar(100)}
     */
    public void setLimitMessageCd_IsNotNull() { regLimitMessageCd(CK_ISNN, DOBJ); }

    protected void regLimitMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitMessageCd(), "LIMIT_MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueLimitMessageCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_CHARS: {bigint(19)}
     * @param minChars The value of minChars as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinChars_Equal(Long minChars) {
        doSetMinChars_Equal(minChars);
    }

    protected void doSetMinChars_Equal(Long minChars) {
        regMinChars(CK_EQ, minChars);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_CHARS: {bigint(19)}
     * @param minChars The value of minChars as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinChars_NotEqual(Long minChars) {
        doSetMinChars_NotEqual(minChars);
    }

    protected void doSetMinChars_NotEqual(Long minChars) {
        regMinChars(CK_NES, minChars);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_CHARS: {bigint(19)}
     * @param minChars The value of minChars as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinChars_GreaterThan(Long minChars) {
        regMinChars(CK_GT, minChars);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_CHARS: {bigint(19)}
     * @param minChars The value of minChars as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinChars_LessThan(Long minChars) {
        regMinChars(CK_LT, minChars);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_CHARS: {bigint(19)}
     * @param minChars The value of minChars as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinChars_GreaterEqual(Long minChars) {
        regMinChars(CK_GE, minChars);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_CHARS: {bigint(19)}
     * @param minChars The value of minChars as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinChars_LessEqual(Long minChars) {
        regMinChars(CK_LE, minChars);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_CHARS: {bigint(19)}
     * @param minNumber The min number of minChars. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of minChars. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMinChars_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMinChars(), "MIN_CHARS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_CHARS: {bigint(19)}
     * @param minCharsList The collection of minChars as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinChars_InScope(Collection<Long> minCharsList) {
        doSetMinChars_InScope(minCharsList);
    }

    protected void doSetMinChars_InScope(Collection<Long> minCharsList) {
        regINS(CK_INS, cTL(minCharsList), xgetCValueMinChars(), "MIN_CHARS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_CHARS: {bigint(19)}
     * @param minCharsList The collection of minChars as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinChars_NotInScope(Collection<Long> minCharsList) {
        doSetMinChars_NotInScope(minCharsList);
    }

    protected void doSetMinChars_NotInScope(Collection<Long> minCharsList) {
        regINS(CK_NINS, cTL(minCharsList), xgetCValueMinChars(), "MIN_CHARS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MIN_CHARS: {bigint(19)}
     */
    public void setMinChars_IsNull() { regMinChars(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MIN_CHARS: {bigint(19)}
     */
    public void setMinChars_IsNotNull() { regMinChars(CK_ISNN, DOBJ); }

    protected void regMinChars(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMinChars(), "MIN_CHARS"); }
    protected abstract ConditionValue xgetCValueMinChars();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_CHARS: {bigint(19)}
     * @param maxChars The value of maxChars as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxChars_Equal(Long maxChars) {
        doSetMaxChars_Equal(maxChars);
    }

    protected void doSetMaxChars_Equal(Long maxChars) {
        regMaxChars(CK_EQ, maxChars);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_CHARS: {bigint(19)}
     * @param maxChars The value of maxChars as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxChars_NotEqual(Long maxChars) {
        doSetMaxChars_NotEqual(maxChars);
    }

    protected void doSetMaxChars_NotEqual(Long maxChars) {
        regMaxChars(CK_NES, maxChars);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_CHARS: {bigint(19)}
     * @param maxChars The value of maxChars as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxChars_GreaterThan(Long maxChars) {
        regMaxChars(CK_GT, maxChars);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_CHARS: {bigint(19)}
     * @param maxChars The value of maxChars as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxChars_LessThan(Long maxChars) {
        regMaxChars(CK_LT, maxChars);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_CHARS: {bigint(19)}
     * @param maxChars The value of maxChars as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxChars_GreaterEqual(Long maxChars) {
        regMaxChars(CK_GE, maxChars);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_CHARS: {bigint(19)}
     * @param maxChars The value of maxChars as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxChars_LessEqual(Long maxChars) {
        regMaxChars(CK_LE, maxChars);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_CHARS: {bigint(19)}
     * @param minNumber The min number of maxChars. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of maxChars. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMaxChars_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMaxChars(), "MAX_CHARS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_CHARS: {bigint(19)}
     * @param maxCharsList The collection of maxChars as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxChars_InScope(Collection<Long> maxCharsList) {
        doSetMaxChars_InScope(maxCharsList);
    }

    protected void doSetMaxChars_InScope(Collection<Long> maxCharsList) {
        regINS(CK_INS, cTL(maxCharsList), xgetCValueMaxChars(), "MAX_CHARS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_CHARS: {bigint(19)}
     * @param maxCharsList The collection of maxChars as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxChars_NotInScope(Collection<Long> maxCharsList) {
        doSetMaxChars_NotInScope(maxCharsList);
    }

    protected void doSetMaxChars_NotInScope(Collection<Long> maxCharsList) {
        regINS(CK_NINS, cTL(maxCharsList), xgetCValueMaxChars(), "MAX_CHARS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAX_CHARS: {bigint(19)}
     */
    public void setMaxChars_IsNull() { regMaxChars(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAX_CHARS: {bigint(19)}
     */
    public void setMaxChars_IsNotNull() { regMaxChars(CK_ISNN, DOBJ); }

    protected void regMaxChars(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxChars(), "MAX_CHARS"); }
    protected abstract ConditionValue xgetCValueMaxChars();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBER: {decimal(16, 6)}
     * @param minNumber The value of minNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumber_Equal(java.math.BigDecimal minNumber) {
        doSetMinNumber_Equal(minNumber);
    }

    protected void doSetMinNumber_Equal(java.math.BigDecimal minNumber) {
        regMinNumber(CK_EQ, minNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBER: {decimal(16, 6)}
     * @param minNumber The value of minNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumber_NotEqual(java.math.BigDecimal minNumber) {
        doSetMinNumber_NotEqual(minNumber);
    }

    protected void doSetMinNumber_NotEqual(java.math.BigDecimal minNumber) {
        regMinNumber(CK_NES, minNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBER: {decimal(16, 6)}
     * @param minNumber The value of minNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumber_GreaterThan(java.math.BigDecimal minNumber) {
        regMinNumber(CK_GT, minNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBER: {decimal(16, 6)}
     * @param minNumber The value of minNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumber_LessThan(java.math.BigDecimal minNumber) {
        regMinNumber(CK_LT, minNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBER: {decimal(16, 6)}
     * @param minNumber The value of minNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumber_GreaterEqual(java.math.BigDecimal minNumber) {
        regMinNumber(CK_GE, minNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBER: {decimal(16, 6)}
     * @param minNumber The value of minNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumber_LessEqual(java.math.BigDecimal minNumber) {
        regMinNumber(CK_LE, minNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBER: {decimal(16, 6)}
     * @param minNumber The min number of minNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of minNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMinNumber_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMinNumber(), "MIN_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_NUMBER: {decimal(16, 6)}
     * @param minNumberList The collection of minNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinNumber_InScope(Collection<java.math.BigDecimal> minNumberList) {
        doSetMinNumber_InScope(minNumberList);
    }

    protected void doSetMinNumber_InScope(Collection<java.math.BigDecimal> minNumberList) {
        regINS(CK_INS, cTL(minNumberList), xgetCValueMinNumber(), "MIN_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_NUMBER: {decimal(16, 6)}
     * @param minNumberList The collection of minNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinNumber_NotInScope(Collection<java.math.BigDecimal> minNumberList) {
        doSetMinNumber_NotInScope(minNumberList);
    }

    protected void doSetMinNumber_NotInScope(Collection<java.math.BigDecimal> minNumberList) {
        regINS(CK_NINS, cTL(minNumberList), xgetCValueMinNumber(), "MIN_NUMBER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MIN_NUMBER: {decimal(16, 6)}
     */
    public void setMinNumber_IsNull() { regMinNumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MIN_NUMBER: {decimal(16, 6)}
     */
    public void setMinNumber_IsNotNull() { regMinNumber(CK_ISNN, DOBJ); }

    protected void regMinNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMinNumber(), "MIN_NUMBER"); }
    protected abstract ConditionValue xgetCValueMinNumber();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_NUMBER: {decimal(16, 6)}
     * @param maxNumber The value of maxNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxNumber_Equal(java.math.BigDecimal maxNumber) {
        doSetMaxNumber_Equal(maxNumber);
    }

    protected void doSetMaxNumber_Equal(java.math.BigDecimal maxNumber) {
        regMaxNumber(CK_EQ, maxNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_NUMBER: {decimal(16, 6)}
     * @param maxNumber The value of maxNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxNumber_NotEqual(java.math.BigDecimal maxNumber) {
        doSetMaxNumber_NotEqual(maxNumber);
    }

    protected void doSetMaxNumber_NotEqual(java.math.BigDecimal maxNumber) {
        regMaxNumber(CK_NES, maxNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_NUMBER: {decimal(16, 6)}
     * @param maxNumber The value of maxNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxNumber_GreaterThan(java.math.BigDecimal maxNumber) {
        regMaxNumber(CK_GT, maxNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_NUMBER: {decimal(16, 6)}
     * @param maxNumber The value of maxNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxNumber_LessThan(java.math.BigDecimal maxNumber) {
        regMaxNumber(CK_LT, maxNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_NUMBER: {decimal(16, 6)}
     * @param maxNumber The value of maxNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxNumber_GreaterEqual(java.math.BigDecimal maxNumber) {
        regMaxNumber(CK_GE, maxNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_NUMBER: {decimal(16, 6)}
     * @param maxNumber The value of maxNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxNumber_LessEqual(java.math.BigDecimal maxNumber) {
        regMaxNumber(CK_LE, maxNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_NUMBER: {decimal(16, 6)}
     * @param minNumber The min number of maxNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of maxNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMaxNumber_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMaxNumber(), "MAX_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_NUMBER: {decimal(16, 6)}
     * @param maxNumberList The collection of maxNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxNumber_InScope(Collection<java.math.BigDecimal> maxNumberList) {
        doSetMaxNumber_InScope(maxNumberList);
    }

    protected void doSetMaxNumber_InScope(Collection<java.math.BigDecimal> maxNumberList) {
        regINS(CK_INS, cTL(maxNumberList), xgetCValueMaxNumber(), "MAX_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_NUMBER: {decimal(16, 6)}
     * @param maxNumberList The collection of maxNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxNumber_NotInScope(Collection<java.math.BigDecimal> maxNumberList) {
        doSetMaxNumber_NotInScope(maxNumberList);
    }

    protected void doSetMaxNumber_NotInScope(Collection<java.math.BigDecimal> maxNumberList) {
        regINS(CK_NINS, cTL(maxNumberList), xgetCValueMaxNumber(), "MAX_NUMBER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAX_NUMBER: {decimal(16, 6)}
     */
    public void setMaxNumber_IsNull() { regMaxNumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAX_NUMBER: {decimal(16, 6)}
     */
    public void setMaxNumber_IsNotNull() { regMaxNumber(CK_ISNN, DOBJ); }

    protected void regMaxNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxNumber(), "MAX_NUMBER"); }
    protected abstract ConditionValue xgetCValueMaxNumber();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INTEGER_LENGTH: {bigint(19)}
     * @param integerLength The value of integerLength as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIntegerLength_Equal(Long integerLength) {
        doSetIntegerLength_Equal(integerLength);
    }

    protected void doSetIntegerLength_Equal(Long integerLength) {
        regIntegerLength(CK_EQ, integerLength);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INTEGER_LENGTH: {bigint(19)}
     * @param integerLength The value of integerLength as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIntegerLength_NotEqual(Long integerLength) {
        doSetIntegerLength_NotEqual(integerLength);
    }

    protected void doSetIntegerLength_NotEqual(Long integerLength) {
        regIntegerLength(CK_NES, integerLength);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INTEGER_LENGTH: {bigint(19)}
     * @param integerLength The value of integerLength as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIntegerLength_GreaterThan(Long integerLength) {
        regIntegerLength(CK_GT, integerLength);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INTEGER_LENGTH: {bigint(19)}
     * @param integerLength The value of integerLength as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIntegerLength_LessThan(Long integerLength) {
        regIntegerLength(CK_LT, integerLength);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INTEGER_LENGTH: {bigint(19)}
     * @param integerLength The value of integerLength as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIntegerLength_GreaterEqual(Long integerLength) {
        regIntegerLength(CK_GE, integerLength);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INTEGER_LENGTH: {bigint(19)}
     * @param integerLength The value of integerLength as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIntegerLength_LessEqual(Long integerLength) {
        regIntegerLength(CK_LE, integerLength);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INTEGER_LENGTH: {bigint(19)}
     * @param minNumber The min number of integerLength. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of integerLength. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIntegerLength_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIntegerLength(), "INTEGER_LENGTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INTEGER_LENGTH: {bigint(19)}
     * @param integerLengthList The collection of integerLength as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntegerLength_InScope(Collection<Long> integerLengthList) {
        doSetIntegerLength_InScope(integerLengthList);
    }

    protected void doSetIntegerLength_InScope(Collection<Long> integerLengthList) {
        regINS(CK_INS, cTL(integerLengthList), xgetCValueIntegerLength(), "INTEGER_LENGTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INTEGER_LENGTH: {bigint(19)}
     * @param integerLengthList The collection of integerLength as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntegerLength_NotInScope(Collection<Long> integerLengthList) {
        doSetIntegerLength_NotInScope(integerLengthList);
    }

    protected void doSetIntegerLength_NotInScope(Collection<Long> integerLengthList) {
        regINS(CK_NINS, cTL(integerLengthList), xgetCValueIntegerLength(), "INTEGER_LENGTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INTEGER_LENGTH: {bigint(19)}
     */
    public void setIntegerLength_IsNull() { regIntegerLength(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INTEGER_LENGTH: {bigint(19)}
     */
    public void setIntegerLength_IsNotNull() { regIntegerLength(CK_ISNN, DOBJ); }

    protected void regIntegerLength(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIntegerLength(), "INTEGER_LENGTH"); }
    protected abstract ConditionValue xgetCValueIntegerLength();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_LENGTH: {bigint(19)}
     * @param decimalLength The value of decimalLength as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDecimalLength_Equal(Long decimalLength) {
        doSetDecimalLength_Equal(decimalLength);
    }

    protected void doSetDecimalLength_Equal(Long decimalLength) {
        regDecimalLength(CK_EQ, decimalLength);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_LENGTH: {bigint(19)}
     * @param decimalLength The value of decimalLength as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDecimalLength_NotEqual(Long decimalLength) {
        doSetDecimalLength_NotEqual(decimalLength);
    }

    protected void doSetDecimalLength_NotEqual(Long decimalLength) {
        regDecimalLength(CK_NES, decimalLength);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_LENGTH: {bigint(19)}
     * @param decimalLength The value of decimalLength as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDecimalLength_GreaterThan(Long decimalLength) {
        regDecimalLength(CK_GT, decimalLength);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_LENGTH: {bigint(19)}
     * @param decimalLength The value of decimalLength as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDecimalLength_LessThan(Long decimalLength) {
        regDecimalLength(CK_LT, decimalLength);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_LENGTH: {bigint(19)}
     * @param decimalLength The value of decimalLength as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDecimalLength_GreaterEqual(Long decimalLength) {
        regDecimalLength(CK_GE, decimalLength);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_LENGTH: {bigint(19)}
     * @param decimalLength The value of decimalLength as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDecimalLength_LessEqual(Long decimalLength) {
        regDecimalLength(CK_LE, decimalLength);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_LENGTH: {bigint(19)}
     * @param minNumber The min number of decimalLength. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of decimalLength. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDecimalLength_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDecimalLength(), "DECIMAL_LENGTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DECIMAL_LENGTH: {bigint(19)}
     * @param decimalLengthList The collection of decimalLength as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDecimalLength_InScope(Collection<Long> decimalLengthList) {
        doSetDecimalLength_InScope(decimalLengthList);
    }

    protected void doSetDecimalLength_InScope(Collection<Long> decimalLengthList) {
        regINS(CK_INS, cTL(decimalLengthList), xgetCValueDecimalLength(), "DECIMAL_LENGTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DECIMAL_LENGTH: {bigint(19)}
     * @param decimalLengthList The collection of decimalLength as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDecimalLength_NotInScope(Collection<Long> decimalLengthList) {
        doSetDecimalLength_NotInScope(decimalLengthList);
    }

    protected void doSetDecimalLength_NotInScope(Collection<Long> decimalLengthList) {
        regINS(CK_NINS, cTL(decimalLengthList), xgetCValueDecimalLength(), "DECIMAL_LENGTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DECIMAL_LENGTH: {bigint(19)}
     */
    public void setDecimalLength_IsNull() { regDecimalLength(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DECIMAL_LENGTH: {bigint(19)}
     */
    public void setDecimalLength_IsNotNull() { regDecimalLength(CK_ISNN, DOBJ); }

    protected void regDecimalLength(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDecimalLength(), "DECIMAL_LENGTH"); }
    protected abstract ConditionValue xgetCValueDecimalLength();

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
    public HpSLCFunction<BArgValidCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BArgValidCB.class);
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
    public HpSLCFunction<BArgValidCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BArgValidCB.class);
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
    public HpSLCFunction<BArgValidCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BArgValidCB.class);
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
    public HpSLCFunction<BArgValidCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BArgValidCB.class);
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
    public HpSLCFunction<BArgValidCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BArgValidCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BArgValidCB&gt;() {
     *     public void query(BArgValidCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BArgValidCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BArgValidCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BArgValidCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BArgValidCQ sq);

    protected BArgValidCB xcreateScalarConditionCB() {
        BArgValidCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BArgValidCB xcreateScalarConditionPartitionByCB() {
        BArgValidCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BArgValidCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BArgValidCB cb = new BArgValidCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ARG_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BArgValidCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BArgValidCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BArgValidCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BArgValidCB cb = new BArgValidCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ARG_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BArgValidCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BArgValidCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BArgValidCB cb = new BArgValidCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BArgValidCQ sq);

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
    protected BArgValidCB newMyCB() {
        return new BArgValidCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BArgValidCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

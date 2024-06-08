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
 * The abstract condition-query of B_ARG.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBArgCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBArgCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_ARG";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARG_ID: {PK, NotNull, bigint(19)}
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
     * ARG_ID: {PK, NotNull, bigint(19)}
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
     * ARG_ID: {PK, NotNull, bigint(19)}
     * @param argId The value of argId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArgId_GreaterThan(Long argId) {
        regArgId(CK_GT, argId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ARG_ID: {PK, NotNull, bigint(19)}
     * @param argId The value of argId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArgId_LessThan(Long argId) {
        regArgId(CK_LT, argId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARG_ID: {PK, NotNull, bigint(19)}
     * @param argId The value of argId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArgId_GreaterEqual(Long argId) {
        regArgId(CK_GE, argId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARG_ID: {PK, NotNull, bigint(19)}
     * @param argId The value of argId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArgId_LessEqual(Long argId) {
        regArgId(CK_LE, argId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ARG_ID: {PK, NotNull, bigint(19)}
     * @param minNumber The min number of argId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of argId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setArgId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueArgId(), "ARG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ARG_ID: {PK, NotNull, bigint(19)}
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
     * ARG_ID: {PK, NotNull, bigint(19)}
     * @param argIdList The collection of argId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgId_NotInScope(Collection<Long> argIdList) {
        doSetArgId_NotInScope(argIdList);
    }

    protected void doSetArgId_NotInScope(Collection<Long> argIdList) {
        regINS(CK_NINS, cTL(argIdList), xgetCValueArgId(), "ARG_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ARG_ID from B_ARG_VALID where ...)} <br>
     * B_ARG_VALID by ARG_ID, named 'BArgValidAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBArgValidAsOne</span>(validCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     validCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BArgValidAsOne for 'exists'. (NotNull)
     */
    public void existsBArgValidAsOne(SubQuery<BArgValidCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BArgValidCB cb = new BArgValidCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepArgId_ExistsReferrer_BArgValidAsOne(cb.query());
        registerExistsReferrer(cb.query(), "ARG_ID", "ARG_ID", pp, "bArgValidAsOne");
    }
    public abstract String keepArgId_ExistsReferrer_BArgValidAsOne(BArgValidCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ARG_ID from B_ARG_VALID where ...)} <br>
     * B_ARG_VALID by ARG_ID, named 'BArgValidAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBArgValidAsOne</span>(validCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     validCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ArgId_NotExistsReferrer_BArgValidAsOne for 'not exists'. (NotNull)
     */
    public void notExistsBArgValidAsOne(SubQuery<BArgValidCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BArgValidCB cb = new BArgValidCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepArgId_NotExistsReferrer_BArgValidAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "ARG_ID", "ARG_ID", pp, "bArgValidAsOne");
    }
    public abstract String keepArgId_NotExistsReferrer_BArgValidAsOne(BArgValidCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARG_ID: {PK, NotNull, bigint(19)}
     */
    public void setArgId_IsNull() { regArgId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARG_ID: {PK, NotNull, bigint(19)}
     */
    public void setArgId_IsNotNull() { regArgId(CK_ISNN, DOBJ); }

    protected void regArgId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArgId(), "ARG_ID"); }
    protected abstract ConditionValue xgetCValueArgId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC}
     * @param funcId The value of funcId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFuncId_Equal(Long funcId) {
        doSetFuncId_Equal(funcId);
    }

    protected void doSetFuncId_Equal(Long funcId) {
        regFuncId(CK_EQ, funcId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC}
     * @param funcId The value of funcId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFuncId_NotEqual(Long funcId) {
        doSetFuncId_NotEqual(funcId);
    }

    protected void doSetFuncId_NotEqual(Long funcId) {
        regFuncId(CK_NES, funcId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC}
     * @param funcId The value of funcId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFuncId_GreaterThan(Long funcId) {
        regFuncId(CK_GT, funcId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC}
     * @param funcId The value of funcId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFuncId_LessThan(Long funcId) {
        regFuncId(CK_LT, funcId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC}
     * @param funcId The value of funcId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFuncId_GreaterEqual(Long funcId) {
        regFuncId(CK_GE, funcId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC}
     * @param funcId The value of funcId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFuncId_LessEqual(Long funcId) {
        regFuncId(CK_LE, funcId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC}
     * @param minNumber The min number of funcId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of funcId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFuncId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFuncId(), "FUNC_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC}
     * @param funcIdList The collection of funcId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncId_InScope(Collection<Long> funcIdList) {
        doSetFuncId_InScope(funcIdList);
    }

    protected void doSetFuncId_InScope(Collection<Long> funcIdList) {
        regINS(CK_INS, cTL(funcIdList), xgetCValueFuncId(), "FUNC_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FUNC_ID: {UQ+, IX, NotNull, bigint(19), FK to B_FUNC}
     * @param funcIdList The collection of funcId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncId_NotInScope(Collection<Long> funcIdList) {
        doSetFuncId_NotInScope(funcIdList);
    }

    protected void doSetFuncId_NotInScope(Collection<Long> funcIdList) {
        regINS(CK_NINS, cTL(funcIdList), xgetCValueFuncId(), "FUNC_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select FUNC_ID from B_FUNC where ...)} <br />
     * B_FUNC by my FUNC_ID, named 'BFunc'.
     * @param subCBLambda The callback for sub-query of BFunc for 'in-scope'. (NotNull)
     */
    public void inScopeBFunc(SubQuery<BFuncCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BFuncCB cb = new BFuncCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepFuncId_InScopeRelation_BFunc(cb.query());
        registerInScopeRelation(cb.query(), "FUNC_ID", "FUNC_ID", pp, "bFunc", false);
    }
    public abstract String keepFuncId_InScopeRelation_BFunc(BFuncCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select FUNC_ID from B_FUNC where ...)} <br />
     * B_FUNC by my FUNC_ID, named 'BFunc'.
     * @param subCBLambda The callback for sub-query of BFunc for 'not in-scope'. (NotNull)
     */
    public void notInScopeBFunc(SubQuery<BFuncCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BFuncCB cb = new BFuncCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepFuncId_NotInScopeRelation_BFunc(cb.query());
        registerInScopeRelation(cb.query(), "FUNC_ID", "FUNC_ID", pp, "bFunc", true);
    }
    public abstract String keepFuncId_NotInScopeRelation_BFunc(BFuncCQ sq);

    protected void regFuncId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFuncId(), "FUNC_ID"); }
    protected abstract ConditionValue xgetCValueFuncId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARG_CD: {+UQ, NotNull, varchar(100)}
     * @param argCd The value of argCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgCd_Equal(String argCd) {
        doSetArgCd_Equal(fRES(argCd));
    }

    protected void doSetArgCd_Equal(String argCd) {
        regArgCd(CK_EQ, argCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARG_CD: {+UQ, NotNull, varchar(100)}
     * @param argCd The value of argCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgCd_NotEqual(String argCd) {
        doSetArgCd_NotEqual(fRES(argCd));
    }

    protected void doSetArgCd_NotEqual(String argCd) {
        regArgCd(CK_NES, argCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARG_CD: {+UQ, NotNull, varchar(100)}
     * @param argCd The value of argCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgCd_GreaterThan(String argCd) {
        regArgCd(CK_GT, fRES(argCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARG_CD: {+UQ, NotNull, varchar(100)}
     * @param argCd The value of argCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgCd_LessThan(String argCd) {
        regArgCd(CK_LT, fRES(argCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARG_CD: {+UQ, NotNull, varchar(100)}
     * @param argCd The value of argCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgCd_GreaterEqual(String argCd) {
        regArgCd(CK_GE, fRES(argCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARG_CD: {+UQ, NotNull, varchar(100)}
     * @param argCd The value of argCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgCd_LessEqual(String argCd) {
        regArgCd(CK_LE, fRES(argCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARG_CD: {+UQ, NotNull, varchar(100)}
     * @param argCdList The collection of argCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgCd_InScope(Collection<String> argCdList) {
        doSetArgCd_InScope(argCdList);
    }

    protected void doSetArgCd_InScope(Collection<String> argCdList) {
        regINS(CK_INS, cTL(argCdList), xgetCValueArgCd(), "ARG_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARG_CD: {+UQ, NotNull, varchar(100)}
     * @param argCdList The collection of argCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgCd_NotInScope(Collection<String> argCdList) {
        doSetArgCd_NotInScope(argCdList);
    }

    protected void doSetArgCd_NotInScope(Collection<String> argCdList) {
        regINS(CK_NINS, cTL(argCdList), xgetCValueArgCd(), "ARG_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARG_CD: {+UQ, NotNull, varchar(100)} <br>
     * <pre>e.g. setArgCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param argCd The value of argCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArgCd_LikeSearch(String argCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(argCd), xgetCValueArgCd(), "ARG_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARG_CD: {+UQ, NotNull, varchar(100)}
     * @param argCd The value of argCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArgCd_NotLikeSearch(String argCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(argCd), xgetCValueArgCd(), "ARG_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARG_CD: {+UQ, NotNull, varchar(100)}
     * @param argCd The value of argCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgCd_PrefixSearch(String argCd) {
        setArgCd_LikeSearch(argCd, xcLSOPPre());
    }

    protected void regArgCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArgCd(), "ARG_CD"); }
    protected abstract ConditionValue xgetCValueArgCd();

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
     * ARG_TYPE: {varchar(30)}
     * @param argType The value of argType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgType_Equal(String argType) {
        doSetArgType_Equal(fRES(argType));
    }

    protected void doSetArgType_Equal(String argType) {
        regArgType(CK_EQ, argType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARG_TYPE: {varchar(30)}
     * @param argType The value of argType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgType_NotEqual(String argType) {
        doSetArgType_NotEqual(fRES(argType));
    }

    protected void doSetArgType_NotEqual(String argType) {
        regArgType(CK_NES, argType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARG_TYPE: {varchar(30)}
     * @param argType The value of argType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgType_GreaterThan(String argType) {
        regArgType(CK_GT, fRES(argType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARG_TYPE: {varchar(30)}
     * @param argType The value of argType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgType_LessThan(String argType) {
        regArgType(CK_LT, fRES(argType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARG_TYPE: {varchar(30)}
     * @param argType The value of argType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgType_GreaterEqual(String argType) {
        regArgType(CK_GE, fRES(argType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARG_TYPE: {varchar(30)}
     * @param argType The value of argType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgType_LessEqual(String argType) {
        regArgType(CK_LE, fRES(argType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARG_TYPE: {varchar(30)}
     * @param argTypeList The collection of argType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgType_InScope(Collection<String> argTypeList) {
        doSetArgType_InScope(argTypeList);
    }

    protected void doSetArgType_InScope(Collection<String> argTypeList) {
        regINS(CK_INS, cTL(argTypeList), xgetCValueArgType(), "ARG_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARG_TYPE: {varchar(30)}
     * @param argTypeList The collection of argType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgType_NotInScope(Collection<String> argTypeList) {
        doSetArgType_NotInScope(argTypeList);
    }

    protected void doSetArgType_NotInScope(Collection<String> argTypeList) {
        regINS(CK_NINS, cTL(argTypeList), xgetCValueArgType(), "ARG_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARG_TYPE: {varchar(30)} <br>
     * <pre>e.g. setArgType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param argType The value of argType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArgType_LikeSearch(String argType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(argType), xgetCValueArgType(), "ARG_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARG_TYPE: {varchar(30)}
     * @param argType The value of argType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArgType_NotLikeSearch(String argType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(argType), xgetCValueArgType(), "ARG_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARG_TYPE: {varchar(30)}
     * @param argType The value of argType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArgType_PrefixSearch(String argType) {
        setArgType_LikeSearch(argType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARG_TYPE: {varchar(30)}
     */
    public void setArgType_IsNull() { regArgType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARG_TYPE: {varchar(30)}
     */
    public void setArgType_IsNullOrEmpty() { regArgType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARG_TYPE: {varchar(30)}
     */
    public void setArgType_IsNotNull() { regArgType(CK_ISNN, DOBJ); }

    protected void regArgType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArgType(), "ARG_TYPE"); }
    protected abstract ConditionValue xgetCValueArgType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0]}
     * @param necessary The value of necessary as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_Equal(String necessary) {
        doSetNecessary_Equal(fRES(necessary));
    }

    protected void doSetNecessary_Equal(String necessary) {
        regNecessary(CK_EQ, necessary);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0]}
     * @param necessary The value of necessary as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_NotEqual(String necessary) {
        doSetNecessary_NotEqual(fRES(necessary));
    }

    protected void doSetNecessary_NotEqual(String necessary) {
        regNecessary(CK_NES, necessary);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0]}
     * @param necessary The value of necessary as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_GreaterThan(String necessary) {
        regNecessary(CK_GT, fRES(necessary));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0]}
     * @param necessary The value of necessary as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_LessThan(String necessary) {
        regNecessary(CK_LT, fRES(necessary));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0]}
     * @param necessary The value of necessary as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_GreaterEqual(String necessary) {
        regNecessary(CK_GE, fRES(necessary));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0]}
     * @param necessary The value of necessary as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_LessEqual(String necessary) {
        regNecessary(CK_LE, fRES(necessary));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0]}
     * @param necessaryList The collection of necessary as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_InScope(Collection<String> necessaryList) {
        doSetNecessary_InScope(necessaryList);
    }

    protected void doSetNecessary_InScope(Collection<String> necessaryList) {
        regINS(CK_INS, cTL(necessaryList), xgetCValueNecessary(), "NECESSARY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0]}
     * @param necessaryList The collection of necessary as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_NotInScope(Collection<String> necessaryList) {
        doSetNecessary_NotInScope(necessaryList);
    }

    protected void doSetNecessary_NotInScope(Collection<String> necessaryList) {
        regINS(CK_NINS, cTL(necessaryList), xgetCValueNecessary(), "NECESSARY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setNecessary_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param necessary The value of necessary as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNecessary_LikeSearch(String necessary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(necessary), xgetCValueNecessary(), "NECESSARY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0]}
     * @param necessary The value of necessary as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNecessary_NotLikeSearch(String necessary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(necessary), xgetCValueNecessary(), "NECESSARY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NECESSARY: {NotNull, char(1), default=[0]}
     * @param necessary The value of necessary as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNecessary_PrefixSearch(String necessary) {
        setNecessary_LikeSearch(necessary, xcLSOPPre());
    }

    protected void regNecessary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNecessary(), "NECESSARY"); }
    protected abstract ConditionValue xgetCValueNecessary();

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
    public HpSLCFunction<BArgCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BArgCB.class);
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
    public HpSLCFunction<BArgCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BArgCB.class);
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
    public HpSLCFunction<BArgCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BArgCB.class);
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
    public HpSLCFunction<BArgCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BArgCB.class);
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
    public HpSLCFunction<BArgCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BArgCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BArgCB&gt;() {
     *     public void query(BArgCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BArgCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BArgCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BArgCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BArgCQ sq);

    protected BArgCB xcreateScalarConditionCB() {
        BArgCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BArgCB xcreateScalarConditionPartitionByCB() {
        BArgCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BArgCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BArgCB cb = new BArgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ARG_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BArgCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BArgCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BArgCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BArgCB cb = new BArgCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ARG_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BArgCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BArgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BArgCB cb = new BArgCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BArgCQ sq);

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
    protected BArgCB newMyCB() {
        return new BArgCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BArgCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of T_TRSYMBOLTRACE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrsymboltraceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrsymboltraceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSYMBOLTRACE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymboltraceId The value of trsymboltraceId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymboltraceId_Equal(Long trsymboltraceId) {
        doSetTrsymboltraceId_Equal(trsymboltraceId);
    }

    protected void doSetTrsymboltraceId_Equal(Long trsymboltraceId) {
        regTrsymboltraceId(CK_EQ, trsymboltraceId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymboltraceId The value of trsymboltraceId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymboltraceId_NotEqual(Long trsymboltraceId) {
        doSetTrsymboltraceId_NotEqual(trsymboltraceId);
    }

    protected void doSetTrsymboltraceId_NotEqual(Long trsymboltraceId) {
        regTrsymboltraceId(CK_NES, trsymboltraceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymboltraceId The value of trsymboltraceId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymboltraceId_GreaterThan(Long trsymboltraceId) {
        regTrsymboltraceId(CK_GT, trsymboltraceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymboltraceId The value of trsymboltraceId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymboltraceId_LessThan(Long trsymboltraceId) {
        regTrsymboltraceId(CK_LT, trsymboltraceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymboltraceId The value of trsymboltraceId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymboltraceId_GreaterEqual(Long trsymboltraceId) {
        regTrsymboltraceId(CK_GE, trsymboltraceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymboltraceId The value of trsymboltraceId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymboltraceId_LessEqual(Long trsymboltraceId) {
        regTrsymboltraceId(CK_LE, trsymboltraceId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param minNumber The min number of trsymboltraceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsymboltraceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsymboltraceId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsymboltraceId(), "TRSYMBOLTRACE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymboltraceIdList The collection of trsymboltraceId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymboltraceId_InScope(Collection<Long> trsymboltraceIdList) {
        doSetTrsymboltraceId_InScope(trsymboltraceIdList);
    }

    protected void doSetTrsymboltraceId_InScope(Collection<Long> trsymboltraceIdList) {
        regINS(CK_INS, cTL(trsymboltraceIdList), xgetCValueTrsymboltraceId(), "TRSYMBOLTRACE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymboltraceIdList The collection of trsymboltraceId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymboltraceId_NotInScope(Collection<Long> trsymboltraceIdList) {
        doSetTrsymboltraceId_NotInScope(trsymboltraceIdList);
    }

    protected void doSetTrsymboltraceId_NotInScope(Collection<Long> trsymboltraceIdList) {
        regINS(CK_NINS, cTL(trsymboltraceIdList), xgetCValueTrsymboltraceId(), "TRSYMBOLTRACE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     */
    public void setTrsymboltraceId_IsNull() { regTrsymboltraceId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     */
    public void setTrsymboltraceId_IsNotNull() { regTrsymboltraceId(CK_ISNN, DOBJ); }

    protected void regTrsymboltraceId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsymboltraceId(), "TRSYMBOLTRACE_ID"); }
    protected abstract ConditionValue xgetCValueTrsymboltraceId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekey The value of symboltracekey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymboltracekey_Equal(java.math.BigDecimal symboltracekey) {
        doSetSymboltracekey_Equal(symboltracekey);
    }

    protected void doSetSymboltracekey_Equal(java.math.BigDecimal symboltracekey) {
        regSymboltracekey(CK_EQ, symboltracekey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekey The value of symboltracekey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymboltracekey_NotEqual(java.math.BigDecimal symboltracekey) {
        doSetSymboltracekey_NotEqual(symboltracekey);
    }

    protected void doSetSymboltracekey_NotEqual(java.math.BigDecimal symboltracekey) {
        regSymboltracekey(CK_NES, symboltracekey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekey The value of symboltracekey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymboltracekey_GreaterThan(java.math.BigDecimal symboltracekey) {
        regSymboltracekey(CK_GT, symboltracekey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekey The value of symboltracekey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymboltracekey_LessThan(java.math.BigDecimal symboltracekey) {
        regSymboltracekey(CK_LT, symboltracekey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekey The value of symboltracekey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymboltracekey_GreaterEqual(java.math.BigDecimal symboltracekey) {
        regSymboltracekey(CK_GE, symboltracekey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekey The value of symboltracekey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymboltracekey_LessEqual(java.math.BigDecimal symboltracekey) {
        regSymboltracekey(CK_LE, symboltracekey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of symboltracekey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of symboltracekey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSymboltracekey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSymboltracekey(), "SYMBOLTRACEKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekeyList The collection of symboltracekey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboltracekey_InScope(Collection<java.math.BigDecimal> symboltracekeyList) {
        doSetSymboltracekey_InScope(symboltracekeyList);
    }

    protected void doSetSymboltracekey_InScope(Collection<java.math.BigDecimal> symboltracekeyList) {
        regINS(CK_INS, cTL(symboltracekeyList), xgetCValueSymboltracekey(), "SYMBOLTRACEKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @param symboltracekeyList The collection of symboltracekey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboltracekey_NotInScope(Collection<java.math.BigDecimal> symboltracekeyList) {
        doSetSymboltracekey_NotInScope(symboltracekeyList);
    }

    protected void doSetSymboltracekey_NotInScope(Collection<java.math.BigDecimal> symboltracekeyList) {
        regINS(CK_NINS, cTL(symboltracekeyList), xgetCValueSymboltracekey(), "SYMBOLTRACEKEY");
    }

    protected void regSymboltracekey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymboltracekey(), "SYMBOLTRACEKEY"); }
    protected abstract ConditionValue xgetCValueSymboltracekey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {IX+, bigint(19)}
     * @param trsymbolId The value of trsymbolId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_Equal(Long trsymbolId) {
        doSetTrsymbolId_Equal(trsymbolId);
    }

    protected void doSetTrsymbolId_Equal(Long trsymbolId) {
        regTrsymbolId(CK_EQ, trsymbolId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {IX+, bigint(19)}
     * @param trsymbolId The value of trsymbolId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_NotEqual(Long trsymbolId) {
        doSetTrsymbolId_NotEqual(trsymbolId);
    }

    protected void doSetTrsymbolId_NotEqual(Long trsymbolId) {
        regTrsymbolId(CK_NES, trsymbolId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {IX+, bigint(19)}
     * @param trsymbolId The value of trsymbolId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_GreaterThan(Long trsymbolId) {
        regTrsymbolId(CK_GT, trsymbolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {IX+, bigint(19)}
     * @param trsymbolId The value of trsymbolId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_LessThan(Long trsymbolId) {
        regTrsymbolId(CK_LT, trsymbolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {IX+, bigint(19)}
     * @param trsymbolId The value of trsymbolId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_GreaterEqual(Long trsymbolId) {
        regTrsymbolId(CK_GE, trsymbolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {IX+, bigint(19)}
     * @param trsymbolId The value of trsymbolId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_LessEqual(Long trsymbolId) {
        regTrsymbolId(CK_LE, trsymbolId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {IX+, bigint(19)}
     * @param minNumber The min number of trsymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsymbolId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsymbolId(), "TRSYMBOL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID: {IX+, bigint(19)}
     * @param trsymbolIdList The collection of trsymbolId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolId_InScope(Collection<Long> trsymbolIdList) {
        doSetTrsymbolId_InScope(trsymbolIdList);
    }

    protected void doSetTrsymbolId_InScope(Collection<Long> trsymbolIdList) {
        regINS(CK_INS, cTL(trsymbolIdList), xgetCValueTrsymbolId(), "TRSYMBOL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID: {IX+, bigint(19)}
     * @param trsymbolIdList The collection of trsymbolId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolId_NotInScope(Collection<Long> trsymbolIdList) {
        doSetTrsymbolId_NotInScope(trsymbolIdList);
    }

    protected void doSetTrsymbolId_NotInScope(Collection<Long> trsymbolIdList) {
        regINS(CK_NINS, cTL(trsymbolIdList), xgetCValueTrsymbolId(), "TRSYMBOL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {IX+, bigint(19)}
     */
    public void setTrsymbolId_IsNull() { regTrsymbolId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {IX+, bigint(19)}
     */
    public void setTrsymbolId_IsNotNull() { regTrsymbolId(CK_ISNN, DOBJ); }

    protected void regTrsymbolId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsymbolId(), "TRSYMBOL_ID"); }
    protected abstract ConditionValue xgetCValueTrsymbolId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_Equal(String createdatetime) {
        doSetCreatedatetime_Equal(fRES(createdatetime));
    }

    protected void doSetCreatedatetime_Equal(String createdatetime) {
        regCreatedatetime(CK_EQ, createdatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_NotEqual(String createdatetime) {
        doSetCreatedatetime_NotEqual(fRES(createdatetime));
    }

    protected void doSetCreatedatetime_NotEqual(String createdatetime) {
        regCreatedatetime(CK_NES, createdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_GreaterThan(String createdatetime) {
        regCreatedatetime(CK_GT, fRES(createdatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_LessThan(String createdatetime) {
        regCreatedatetime(CK_LT, fRES(createdatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_GreaterEqual(String createdatetime) {
        regCreatedatetime(CK_GE, fRES(createdatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_LessEqual(String createdatetime) {
        regCreatedatetime(CK_LE, fRES(createdatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetimeList The collection of createdatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_InScope(Collection<String> createdatetimeList) {
        doSetCreatedatetime_InScope(createdatetimeList);
    }

    protected void doSetCreatedatetime_InScope(Collection<String> createdatetimeList) {
        regINS(CK_INS, cTL(createdatetimeList), xgetCValueCreatedatetime(), "CREATEDATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetimeList The collection of createdatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_NotInScope(Collection<String> createdatetimeList) {
        doSetCreatedatetime_NotInScope(createdatetimeList);
    }

    protected void doSetCreatedatetime_NotInScope(Collection<String> createdatetimeList) {
        regINS(CK_NINS, cTL(createdatetimeList), xgetCValueCreatedatetime(), "CREATEDATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(8)} <br>
     * <pre>e.g. setCreatedatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createdatetime The value of createdatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreatedatetime_LikeSearch(String createdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createdatetime), xgetCValueCreatedatetime(), "CREATEDATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreatedatetime_NotLikeSearch(String createdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createdatetime), xgetCValueCreatedatetime(), "CREATEDATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     * @param createdatetime The value of createdatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_PrefixSearch(String createdatetime) {
        setCreatedatetime_LikeSearch(createdatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     */
    public void setCreatedatetime_IsNull() { regCreatedatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     */
    public void setCreatedatetime_IsNullOrEmpty() { regCreatedatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(8)}
     */
    public void setCreatedatetime_IsNotNull() { regCreatedatetime(CK_ISNN, DOBJ); }

    protected void regCreatedatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedatetime(), "CREATEDATETIME"); }
    protected abstract ConditionValue xgetCValueCreatedatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecd The value of warehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_Equal(String warehousecd) {
        doSetWarehousecd_Equal(fRES(warehousecd));
    }

    protected void doSetWarehousecd_Equal(String warehousecd) {
        regWarehousecd(CK_EQ, warehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecd The value of warehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotEqual(String warehousecd) {
        doSetWarehousecd_NotEqual(fRES(warehousecd));
    }

    protected void doSetWarehousecd_NotEqual(String warehousecd) {
        regWarehousecd(CK_NES, warehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecdList The collection of warehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_InScope(Collection<String> warehousecdList) {
        doSetWarehousecd_InScope(warehousecdList);
    }

    protected void doSetWarehousecd_InScope(Collection<String> warehousecdList) {
        regINS(CK_INS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecdList The collection of warehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotInScope(Collection<String> warehousecdList) {
        doSetWarehousecd_NotInScope(warehousecdList);
    }

    protected void doSetWarehousecd_NotInScope(Collection<String> warehousecdList) {
        regINS(CK_NINS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)} <br>
     * <pre>e.g. setWarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousecd The value of warehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousecd_LikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     */
    public void setWarehousecd_IsNull() { regWarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     */
    public void setWarehousecd_IsNullOrEmpty() { regWarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX, varchar(30)}
     */
    public void setWarehousecd_IsNotNull() { regWarehousecd(CK_ISNN, DOBJ); }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_Equal(String tracetype) {
        doSetTracetype_Equal(fRES(tracetype));
    }

    protected void doSetTracetype_Equal(String tracetype) {
        regTracetype(CK_EQ, tracetype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_NotEqual(String tracetype) {
        doSetTracetype_NotEqual(fRES(tracetype));
    }

    protected void doSetTracetype_NotEqual(String tracetype) {
        regTracetype(CK_NES, tracetype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_GreaterThan(String tracetype) {
        regTracetype(CK_GT, fRES(tracetype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_LessThan(String tracetype) {
        regTracetype(CK_LT, fRES(tracetype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_GreaterEqual(String tracetype) {
        regTracetype(CK_GE, fRES(tracetype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_LessEqual(String tracetype) {
        regTracetype(CK_LE, fRES(tracetype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetypeList The collection of tracetype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_InScope(Collection<String> tracetypeList) {
        doSetTracetype_InScope(tracetypeList);
    }

    protected void doSetTracetype_InScope(Collection<String> tracetypeList) {
        regINS(CK_INS, cTL(tracetypeList), xgetCValueTracetype(), "TRACETYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetypeList The collection of tracetype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_NotInScope(Collection<String> tracetypeList) {
        doSetTracetype_NotInScope(tracetypeList);
    }

    protected void doSetTracetype_NotInScope(Collection<String> tracetypeList) {
        regINS(CK_NINS, cTL(tracetypeList), xgetCValueTracetype(), "TRACETYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)} <br>
     * <pre>e.g. setTracetype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tracetype The value of tracetype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTracetype_LikeSearch(String tracetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tracetype), xgetCValueTracetype(), "TRACETYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTracetype_NotLikeSearch(String tracetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tracetype), xgetCValueTracetype(), "TRACETYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_PrefixSearch(String tracetype) {
        setTracetype_LikeSearch(tracetype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     */
    public void setTracetype_IsNull() { regTracetype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     */
    public void setTracetype_IsNullOrEmpty() { regTracetype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     */
    public void setTracetype_IsNotNull() { regTracetype(CK_ISNN, DOBJ); }

    protected void regTracetype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTracetype(), "TRACETYPE"); }
    protected abstract ConditionValue xgetCValueTracetype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_Equal(Long initnum) {
        doSetInitnum_Equal(initnum);
    }

    protected void doSetInitnum_Equal(Long initnum) {
        regInitnum(CK_EQ, initnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_NotEqual(Long initnum) {
        doSetInitnum_NotEqual(initnum);
    }

    protected void doSetInitnum_NotEqual(Long initnum) {
        regInitnum(CK_NES, initnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_GreaterThan(Long initnum) {
        regInitnum(CK_GT, initnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_LessThan(Long initnum) {
        regInitnum(CK_LT, initnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_GreaterEqual(Long initnum) {
        regInitnum(CK_GE, initnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_LessEqual(Long initnum) {
        regInitnum(CK_LE, initnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param minNumber The min number of initnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of initnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInitnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInitnum(), "INITNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnumList The collection of initnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_InScope(Collection<Long> initnumList) {
        doSetInitnum_InScope(initnumList);
    }

    protected void doSetInitnum_InScope(Collection<Long> initnumList) {
        regINS(CK_INS, cTL(initnumList), xgetCValueInitnum(), "INITNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnumList The collection of initnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_NotInScope(Collection<Long> initnumList) {
        doSetInitnum_NotInScope(initnumList);
    }

    protected void doSetInitnum_NotInScope(Collection<Long> initnumList) {
        regINS(CK_NINS, cTL(initnumList), xgetCValueInitnum(), "INITNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     */
    public void setInitnum_IsNull() { regInitnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     */
    public void setInitnum_IsNotNull() { regInitnum(CK_ISNN, DOBJ); }

    protected void regInitnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInitnum(), "INITNUM"); }
    protected abstract ConditionValue xgetCValueInitnum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnum The value of caseinnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnum_Equal(Long caseinnum) {
        doSetCaseinnum_Equal(caseinnum);
    }

    protected void doSetCaseinnum_Equal(Long caseinnum) {
        regCaseinnum(CK_EQ, caseinnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnum The value of caseinnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnum_NotEqual(Long caseinnum) {
        doSetCaseinnum_NotEqual(caseinnum);
    }

    protected void doSetCaseinnum_NotEqual(Long caseinnum) {
        regCaseinnum(CK_NES, caseinnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnum The value of caseinnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnum_GreaterThan(Long caseinnum) {
        regCaseinnum(CK_GT, caseinnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnum The value of caseinnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnum_LessThan(Long caseinnum) {
        regCaseinnum(CK_LT, caseinnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnum The value of caseinnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnum_GreaterEqual(Long caseinnum) {
        regCaseinnum(CK_GE, caseinnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnum The value of caseinnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnum_LessEqual(Long caseinnum) {
        regCaseinnum(CK_LE, caseinnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param minNumber The min number of caseinnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseinnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseinnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseinnum(), "CASEINNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnumList The collection of caseinnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_InScope(Collection<Long> caseinnumList) {
        doSetCaseinnum_InScope(caseinnumList);
    }

    protected void doSetCaseinnum_InScope(Collection<Long> caseinnumList) {
        regINS(CK_INS, cTL(caseinnumList), xgetCValueCaseinnum(), "CASEINNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINNUM: {bigint(19)}
     * @param caseinnumList The collection of caseinnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_NotInScope(Collection<Long> caseinnumList) {
        doSetCaseinnum_NotInScope(caseinnumList);
    }

    protected void doSetCaseinnum_NotInScope(Collection<Long> caseinnumList) {
        regINS(CK_NINS, cTL(caseinnumList), xgetCValueCaseinnum(), "CASEINNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     */
    public void setCaseinnum_IsNull() { regCaseinnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEINNUM: {bigint(19)}
     */
    public void setCaseinnum_IsNotNull() { regCaseinnum(CK_ISNN, DOBJ); }

    protected void regCaseinnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseinnum(), "CASEINNUM"); }
    protected abstract ConditionValue xgetCValueCaseinnum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_Equal(Long assortnum) {
        doSetAssortnum_Equal(assortnum);
    }

    protected void doSetAssortnum_Equal(Long assortnum) {
        regAssortnum(CK_EQ, assortnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_NotEqual(Long assortnum) {
        doSetAssortnum_NotEqual(assortnum);
    }

    protected void doSetAssortnum_NotEqual(Long assortnum) {
        regAssortnum(CK_NES, assortnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_GreaterThan(Long assortnum) {
        regAssortnum(CK_GT, assortnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_LessThan(Long assortnum) {
        regAssortnum(CK_LT, assortnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_GreaterEqual(Long assortnum) {
        regAssortnum(CK_GE, assortnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnum The value of assortnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortnum_LessEqual(Long assortnum) {
        regAssortnum(CK_LE, assortnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param minNumber The min number of assortnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of assortnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAssortnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssortnum(), "ASSORTNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnumList The collection of assortnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_InScope(Collection<Long> assortnumList) {
        doSetAssortnum_InScope(assortnumList);
    }

    protected void doSetAssortnum_InScope(Collection<Long> assortnumList) {
        regINS(CK_INS, cTL(assortnumList), xgetCValueAssortnum(), "ASSORTNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     * @param assortnumList The collection of assortnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_NotInScope(Collection<Long> assortnumList) {
        doSetAssortnum_NotInScope(assortnumList);
    }

    protected void doSetAssortnum_NotInScope(Collection<Long> assortnumList) {
        regINS(CK_NINS, cTL(assortnumList), xgetCValueAssortnum(), "ASSORTNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     */
    public void setAssortnum_IsNull() { regAssortnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTNUM: {bigint(19)}
     */
    public void setAssortnum_IsNotNull() { regAssortnum(CK_ISNN, DOBJ); }

    protected void regAssortnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortnum(), "ASSORTNUM"); }
    protected abstract ConditionValue xgetCValueAssortnum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_Equal(Long directionnum) {
        doSetDirectionnum_Equal(directionnum);
    }

    protected void doSetDirectionnum_Equal(Long directionnum) {
        regDirectionnum(CK_EQ, directionnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_NotEqual(Long directionnum) {
        doSetDirectionnum_NotEqual(directionnum);
    }

    protected void doSetDirectionnum_NotEqual(Long directionnum) {
        regDirectionnum(CK_NES, directionnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_GreaterThan(Long directionnum) {
        regDirectionnum(CK_GT, directionnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_LessThan(Long directionnum) {
        regDirectionnum(CK_LT, directionnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_GreaterEqual(Long directionnum) {
        regDirectionnum(CK_GE, directionnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_LessEqual(Long directionnum) {
        regDirectionnum(CK_LE, directionnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param minNumber The min number of directionnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of directionnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDirectionnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDirectionnum(), "DIRECTIONNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnumList The collection of directionnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_InScope(Collection<Long> directionnumList) {
        doSetDirectionnum_InScope(directionnumList);
    }

    protected void doSetDirectionnum_InScope(Collection<Long> directionnumList) {
        regINS(CK_INS, cTL(directionnumList), xgetCValueDirectionnum(), "DIRECTIONNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnumList The collection of directionnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_NotInScope(Collection<Long> directionnumList) {
        doSetDirectionnum_NotInScope(directionnumList);
    }

    protected void doSetDirectionnum_NotInScope(Collection<Long> directionnumList) {
        regINS(CK_NINS, cTL(directionnumList), xgetCValueDirectionnum(), "DIRECTIONNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     */
    public void setDirectionnum_IsNull() { regDirectionnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     */
    public void setDirectionnum_IsNotNull() { regDirectionnum(CK_ISNN, DOBJ); }

    protected void regDirectionnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectionnum(), "DIRECTIONNUM"); }
    protected abstract ConditionValue xgetCValueDirectionnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_Equal(String customercd) {
        doSetCustomercd_Equal(fRES(customercd));
    }

    protected void doSetCustomercd_Equal(String customercd) {
        regCustomercd(CK_EQ, customercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_NotEqual(String customercd) {
        doSetCustomercd_NotEqual(fRES(customercd));
    }

    protected void doSetCustomercd_NotEqual(String customercd) {
        regCustomercd(CK_NES, customercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_GreaterThan(String customercd) {
        regCustomercd(CK_GT, fRES(customercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_LessThan(String customercd) {
        regCustomercd(CK_LT, fRES(customercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_GreaterEqual(String customercd) {
        regCustomercd(CK_GE, fRES(customercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_LessEqual(String customercd) {
        regCustomercd(CK_LE, fRES(customercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercdList The collection of customercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_InScope(Collection<String> customercdList) {
        doSetCustomercd_InScope(customercdList);
    }

    protected void doSetCustomercd_InScope(Collection<String> customercdList) {
        regINS(CK_INS, cTL(customercdList), xgetCValueCustomercd(), "CUSTOMERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercdList The collection of customercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_NotInScope(Collection<String> customercdList) {
        doSetCustomercd_NotInScope(customercdList);
    }

    protected void doSetCustomercd_NotInScope(Collection<String> customercdList) {
        regINS(CK_NINS, cTL(customercdList), xgetCValueCustomercd(), "CUSTOMERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)} <br>
     * <pre>e.g. setCustomercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customercd The value of customercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomercd_LikeSearch(String customercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customercd), xgetCValueCustomercd(), "CUSTOMERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomercd_NotLikeSearch(String customercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customercd), xgetCValueCustomercd(), "CUSTOMERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_PrefixSearch(String customercd) {
        setCustomercd_LikeSearch(customercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     */
    public void setCustomercd_IsNull() { regCustomercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     */
    public void setCustomercd_IsNullOrEmpty() { regCustomercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     */
    public void setCustomercd_IsNotNull() { regCustomercd(CK_ISNN, DOBJ); }

    protected void regCustomercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomercd(), "CUSTOMERCD"); }
    protected abstract ConditionValue xgetCValueCustomercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_Equal(String distwarehousecd) {
        doSetDistwarehousecd_Equal(fRES(distwarehousecd));
    }

    protected void doSetDistwarehousecd_Equal(String distwarehousecd) {
        regDistwarehousecd(CK_EQ, distwarehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_NotEqual(String distwarehousecd) {
        doSetDistwarehousecd_NotEqual(fRES(distwarehousecd));
    }

    protected void doSetDistwarehousecd_NotEqual(String distwarehousecd) {
        regDistwarehousecd(CK_NES, distwarehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_GreaterThan(String distwarehousecd) {
        regDistwarehousecd(CK_GT, fRES(distwarehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_LessThan(String distwarehousecd) {
        regDistwarehousecd(CK_LT, fRES(distwarehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_GreaterEqual(String distwarehousecd) {
        regDistwarehousecd(CK_GE, fRES(distwarehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_LessEqual(String distwarehousecd) {
        regDistwarehousecd(CK_LE, fRES(distwarehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecdList The collection of distwarehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_InScope(Collection<String> distwarehousecdList) {
        doSetDistwarehousecd_InScope(distwarehousecdList);
    }

    protected void doSetDistwarehousecd_InScope(Collection<String> distwarehousecdList) {
        regINS(CK_INS, cTL(distwarehousecdList), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecdList The collection of distwarehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_NotInScope(Collection<String> distwarehousecdList) {
        doSetDistwarehousecd_NotInScope(distwarehousecdList);
    }

    protected void doSetDistwarehousecd_NotInScope(Collection<String> distwarehousecdList) {
        regINS(CK_NINS, cTL(distwarehousecdList), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)} <br>
     * <pre>e.g. setDistwarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param distwarehousecd The value of distwarehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistwarehousecd_LikeSearch(String distwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(distwarehousecd), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistwarehousecd_NotLikeSearch(String distwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(distwarehousecd), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     * @param distwarehousecd The value of distwarehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_PrefixSearch(String distwarehousecd) {
        setDistwarehousecd_LikeSearch(distwarehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     */
    public void setDistwarehousecd_IsNull() { regDistwarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     */
    public void setDistwarehousecd_IsNullOrEmpty() { regDistwarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(30)}
     */
    public void setDistwarehousecd_IsNotNull() { regDistwarehousecd(CK_ISNN, DOBJ); }

    protected void regDistwarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistwarehousecd(), "DISTWAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueDistwarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_Equal(String mixedflg) {
        doSetMixedflg_Equal(fRES(mixedflg));
    }

    protected void doSetMixedflg_Equal(String mixedflg) {
        regMixedflg(CK_EQ, mixedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_NotEqual(String mixedflg) {
        doSetMixedflg_NotEqual(fRES(mixedflg));
    }

    protected void doSetMixedflg_NotEqual(String mixedflg) {
        regMixedflg(CK_NES, mixedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_GreaterThan(String mixedflg) {
        regMixedflg(CK_GT, fRES(mixedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_LessThan(String mixedflg) {
        regMixedflg(CK_LT, fRES(mixedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_GreaterEqual(String mixedflg) {
        regMixedflg(CK_GE, fRES(mixedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_LessEqual(String mixedflg) {
        regMixedflg(CK_LE, fRES(mixedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflgList The collection of mixedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_InScope(Collection<String> mixedflgList) {
        doSetMixedflg_InScope(mixedflgList);
    }

    protected void doSetMixedflg_InScope(Collection<String> mixedflgList) {
        regINS(CK_INS, cTL(mixedflgList), xgetCValueMixedflg(), "MIXEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflgList The collection of mixedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_NotInScope(Collection<String> mixedflgList) {
        doSetMixedflg_NotInScope(mixedflgList);
    }

    protected void doSetMixedflg_NotInScope(Collection<String> mixedflgList) {
        regINS(CK_NINS, cTL(mixedflgList), xgetCValueMixedflg(), "MIXEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)} <br>
     * <pre>e.g. setMixedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mixedflg The value of mixedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMixedflg_LikeSearch(String mixedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mixedflg), xgetCValueMixedflg(), "MIXEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMixedflg_NotLikeSearch(String mixedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mixedflg), xgetCValueMixedflg(), "MIXEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_PrefixSearch(String mixedflg) {
        setMixedflg_LikeSearch(mixedflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     */
    public void setMixedflg_IsNull() { regMixedflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     */
    public void setMixedflg_IsNotNull() { regMixedflg(CK_ISNN, DOBJ); }

    protected void regMixedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMixedflg(), "MIXEDFLG"); }
    protected abstract ConditionValue xgetCValueMixedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_Equal(String loccd) {
        doSetLoccd_Equal(fRES(loccd));
    }

    protected void doSetLoccd_Equal(String loccd) {
        regLoccd(CK_EQ, loccd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_NotEqual(String loccd) {
        doSetLoccd_NotEqual(fRES(loccd));
    }

    protected void doSetLoccd_NotEqual(String loccd) {
        regLoccd(CK_NES, loccd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_GreaterThan(String loccd) {
        regLoccd(CK_GT, fRES(loccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_LessThan(String loccd) {
        regLoccd(CK_LT, fRES(loccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_GreaterEqual(String loccd) {
        regLoccd(CK_GE, fRES(loccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_LessEqual(String loccd) {
        regLoccd(CK_LE, fRES(loccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccdList The collection of loccd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_InScope(Collection<String> loccdList) {
        doSetLoccd_InScope(loccdList);
    }

    protected void doSetLoccd_InScope(Collection<String> loccdList) {
        regINS(CK_INS, cTL(loccdList), xgetCValueLoccd(), "LOCCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccdList The collection of loccd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_NotInScope(Collection<String> loccdList) {
        doSetLoccd_NotInScope(loccdList);
    }

    protected void doSetLoccd_NotInScope(Collection<String> loccdList) {
        regINS(CK_NINS, cTL(loccdList), xgetCValueLoccd(), "LOCCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)} <br>
     * <pre>e.g. setLoccd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loccd The value of loccd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoccd_LikeSearch(String loccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loccd), xgetCValueLoccd(), "LOCCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoccd_NotLikeSearch(String loccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loccd), xgetCValueLoccd(), "LOCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_PrefixSearch(String loccd) {
        setLoccd_LikeSearch(loccd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNull() { regLoccd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNullOrEmpty() { regLoccd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNotNull() { regLoccd(CK_ISNN, DOBJ); }

    protected void regLoccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoccd(), "LOCCD"); }
    protected abstract ConditionValue xgetCValueLoccd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_Equal(String productCd) {
        doSetProductCd_Equal(fRES(productCd));
    }

    protected void doSetProductCd_Equal(String productCd) {
        regProductCd(CK_EQ, productCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotEqual(String productCd) {
        doSetProductCd_NotEqual(fRES(productCd));
    }

    protected void doSetProductCd_NotEqual(String productCd) {
        regProductCd(CK_NES, productCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCdList The collection of productCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_InScope(Collection<String> productCdList) {
        doSetProductCd_InScope(productCdList);
    }

    protected void doSetProductCd_InScope(Collection<String> productCdList) {
        regINS(CK_INS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCdList The collection of productCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotInScope(Collection<String> productCdList) {
        doSetProductCd_NotInScope(productCdList);
    }

    protected void doSetProductCd_NotInScope(Collection<String> productCdList) {
        regINS(CK_NINS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)} <br>
     * <pre>e.g. setProductCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCd The value of productCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCd_LikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_Equal(String lot1) {
        doSetLot1_Equal(fRES(lot1));
    }

    protected void doSetLot1_Equal(String lot1) {
        regLot1(CK_EQ, lot1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_NotEqual(String lot1) {
        doSetLot1_NotEqual(fRES(lot1));
    }

    protected void doSetLot1_NotEqual(String lot1) {
        regLot1(CK_NES, lot1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterThan(String lot1) {
        regLot1(CK_GT, fRES(lot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessThan(String lot1) {
        regLot1(CK_LT, fRES(lot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterEqual(String lot1) {
        regLot1(CK_GE, fRES(lot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessEqual(String lot1) {
        regLot1(CK_LE, fRES(lot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1List The collection of lot1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_InScope(Collection<String> lot1List) {
        doSetLot1_InScope(lot1List);
    }

    protected void doSetLot1_InScope(Collection<String> lot1List) {
        regINS(CK_INS, cTL(lot1List), xgetCValueLot1(), "LOT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1List The collection of lot1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_NotInScope(Collection<String> lot1List) {
        doSetLot1_NotInScope(lot1List);
    }

    protected void doSetLot1_NotInScope(Collection<String> lot1List) {
        regINS(CK_NINS, cTL(lot1List), xgetCValueLot1(), "LOT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)} <br>
     * <pre>e.g. setLot1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot1 The value of lot1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot1_LikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot1_NotLikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_PrefixSearch(String lot1) {
        setLot1_LikeSearch(lot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNull() { regLot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNullOrEmpty() { regLot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNotNull() { regLot1(CK_ISNN, DOBJ); }

    protected void regLot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot1(), "LOT1"); }
    protected abstract ConditionValue xgetCValueLot1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_Equal(String lot2) {
        doSetLot2_Equal(fRES(lot2));
    }

    protected void doSetLot2_Equal(String lot2) {
        regLot2(CK_EQ, lot2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_NotEqual(String lot2) {
        doSetLot2_NotEqual(fRES(lot2));
    }

    protected void doSetLot2_NotEqual(String lot2) {
        regLot2(CK_NES, lot2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterThan(String lot2) {
        regLot2(CK_GT, fRES(lot2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessThan(String lot2) {
        regLot2(CK_LT, fRES(lot2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterEqual(String lot2) {
        regLot2(CK_GE, fRES(lot2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessEqual(String lot2) {
        regLot2(CK_LE, fRES(lot2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2List The collection of lot2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_InScope(Collection<String> lot2List) {
        doSetLot2_InScope(lot2List);
    }

    protected void doSetLot2_InScope(Collection<String> lot2List) {
        regINS(CK_INS, cTL(lot2List), xgetCValueLot2(), "LOT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2List The collection of lot2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_NotInScope(Collection<String> lot2List) {
        doSetLot2_NotInScope(lot2List);
    }

    protected void doSetLot2_NotInScope(Collection<String> lot2List) {
        regINS(CK_NINS, cTL(lot2List), xgetCValueLot2(), "LOT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)} <br>
     * <pre>e.g. setLot2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot2 The value of lot2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot2_LikeSearch(String lot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot2), xgetCValueLot2(), "LOT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot2_NotLikeSearch(String lot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot2), xgetCValueLot2(), "LOT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_PrefixSearch(String lot2) {
        setLot2_LikeSearch(lot2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNull() { regLot2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNullOrEmpty() { regLot2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNotNull() { regLot2(CK_ISNN, DOBJ); }

    protected void regLot2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot2(), "LOT2"); }
    protected abstract ConditionValue xgetCValueLot2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_Equal(String lot3) {
        doSetLot3_Equal(fRES(lot3));
    }

    protected void doSetLot3_Equal(String lot3) {
        regLot3(CK_EQ, lot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotEqual(String lot3) {
        doSetLot3_NotEqual(fRES(lot3));
    }

    protected void doSetLot3_NotEqual(String lot3) {
        regLot3(CK_NES, lot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterThan(String lot3) {
        regLot3(CK_GT, fRES(lot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessThan(String lot3) {
        regLot3(CK_LT, fRES(lot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterEqual(String lot3) {
        regLot3(CK_GE, fRES(lot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessEqual(String lot3) {
        regLot3(CK_LE, fRES(lot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3List The collection of lot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_InScope(Collection<String> lot3List) {
        doSetLot3_InScope(lot3List);
    }

    protected void doSetLot3_InScope(Collection<String> lot3List) {
        regINS(CK_INS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3List The collection of lot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotInScope(Collection<String> lot3List) {
        doSetLot3_NotInScope(lot3List);
    }

    protected void doSetLot3_NotInScope(Collection<String> lot3List) {
        regINS(CK_NINS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)} <br>
     * <pre>e.g. setLot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot3 The value of lot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot3_LikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot3_NotLikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_PrefixSearch(String lot3) {
        setLot3_LikeSearch(lot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNull() { regLot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNullOrEmpty() { regLot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNotNull() { regLot3(CK_ISNN, DOBJ); }

    protected void regLot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot3(), "LOT3"); }
    protected abstract ConditionValue xgetCValueLot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_Equal(String lot4) {
        doSetLot4_Equal(fRES(lot4));
    }

    protected void doSetLot4_Equal(String lot4) {
        regLot4(CK_EQ, lot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotEqual(String lot4) {
        doSetLot4_NotEqual(fRES(lot4));
    }

    protected void doSetLot4_NotEqual(String lot4) {
        regLot4(CK_NES, lot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterThan(String lot4) {
        regLot4(CK_GT, fRES(lot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessThan(String lot4) {
        regLot4(CK_LT, fRES(lot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterEqual(String lot4) {
        regLot4(CK_GE, fRES(lot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessEqual(String lot4) {
        regLot4(CK_LE, fRES(lot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4List The collection of lot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_InScope(Collection<String> lot4List) {
        doSetLot4_InScope(lot4List);
    }

    protected void doSetLot4_InScope(Collection<String> lot4List) {
        regINS(CK_INS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4List The collection of lot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotInScope(Collection<String> lot4List) {
        doSetLot4_NotInScope(lot4List);
    }

    protected void doSetLot4_NotInScope(Collection<String> lot4List) {
        regINS(CK_NINS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)} <br>
     * <pre>e.g. setLot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot4 The value of lot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot4_LikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot4_NotLikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_PrefixSearch(String lot4) {
        setLot4_LikeSearch(lot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNull() { regLot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNullOrEmpty() { regLot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNotNull() { regLot4(CK_ISNN, DOBJ); }

    protected void regLot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot4(), "LOT4"); }
    protected abstract ConditionValue xgetCValueLot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_Equal(String otherlot1) {
        doSetOtherlot1_Equal(fRES(otherlot1));
    }

    protected void doSetOtherlot1_Equal(String otherlot1) {
        regOtherlot1(CK_EQ, otherlot1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_NotEqual(String otherlot1) {
        doSetOtherlot1_NotEqual(fRES(otherlot1));
    }

    protected void doSetOtherlot1_NotEqual(String otherlot1) {
        regOtherlot1(CK_NES, otherlot1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_GreaterThan(String otherlot1) {
        regOtherlot1(CK_GT, fRES(otherlot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_LessThan(String otherlot1) {
        regOtherlot1(CK_LT, fRES(otherlot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_GreaterEqual(String otherlot1) {
        regOtherlot1(CK_GE, fRES(otherlot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_LessEqual(String otherlot1) {
        regOtherlot1(CK_LE, fRES(otherlot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1List The collection of otherlot1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_InScope(Collection<String> otherlot1List) {
        doSetOtherlot1_InScope(otherlot1List);
    }

    protected void doSetOtherlot1_InScope(Collection<String> otherlot1List) {
        regINS(CK_INS, cTL(otherlot1List), xgetCValueOtherlot1(), "OTHERLOT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1List The collection of otherlot1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_NotInScope(Collection<String> otherlot1List) {
        doSetOtherlot1_NotInScope(otherlot1List);
    }

    protected void doSetOtherlot1_NotInScope(Collection<String> otherlot1List) {
        regINS(CK_NINS, cTL(otherlot1List), xgetCValueOtherlot1(), "OTHERLOT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)} <br>
     * <pre>e.g. setOtherlot1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherlot1 The value of otherlot1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherlot1_LikeSearch(String otherlot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherlot1), xgetCValueOtherlot1(), "OTHERLOT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot1_NotLikeSearch(String otherlot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot1), xgetCValueOtherlot1(), "OTHERLOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_PrefixSearch(String otherlot1) {
        setOtherlot1_LikeSearch(otherlot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNull() { regOtherlot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNullOrEmpty() { regOtherlot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNotNull() { regOtherlot1(CK_ISNN, DOBJ); }

    protected void regOtherlot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot1(), "OTHERLOT1"); }
    protected abstract ConditionValue xgetCValueOtherlot1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6)}
     * @param noshippingflg The value of noshippingflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_Equal(java.math.BigDecimal noshippingflg) {
        doSetNoshippingflg_Equal(noshippingflg);
    }

    protected void doSetNoshippingflg_Equal(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_EQ, noshippingflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6)}
     * @param noshippingflg The value of noshippingflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_NotEqual(java.math.BigDecimal noshippingflg) {
        doSetNoshippingflg_NotEqual(noshippingflg);
    }

    protected void doSetNoshippingflg_NotEqual(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_NES, noshippingflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6)}
     * @param noshippingflg The value of noshippingflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_GreaterThan(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_GT, noshippingflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6)}
     * @param noshippingflg The value of noshippingflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_LessThan(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_LT, noshippingflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6)}
     * @param noshippingflg The value of noshippingflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_GreaterEqual(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_GE, noshippingflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6)}
     * @param noshippingflg The value of noshippingflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_LessEqual(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_LE, noshippingflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6)}
     * @param minNumber The min number of noshippingflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of noshippingflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNoshippingflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNoshippingflg(), "NOSHIPPINGFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6)}
     * @param noshippingflgList The collection of noshippingflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_InScope(Collection<java.math.BigDecimal> noshippingflgList) {
        doSetNoshippingflg_InScope(noshippingflgList);
    }

    protected void doSetNoshippingflg_InScope(Collection<java.math.BigDecimal> noshippingflgList) {
        regINS(CK_INS, cTL(noshippingflgList), xgetCValueNoshippingflg(), "NOSHIPPINGFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6)}
     * @param noshippingflgList The collection of noshippingflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_NotInScope(Collection<java.math.BigDecimal> noshippingflgList) {
        doSetNoshippingflg_NotInScope(noshippingflgList);
    }

    protected void doSetNoshippingflg_NotInScope(Collection<java.math.BigDecimal> noshippingflgList) {
        regINS(CK_NINS, cTL(noshippingflgList), xgetCValueNoshippingflg(), "NOSHIPPINGFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6)}
     */
    public void setNoshippingflg_IsNull() { regNoshippingflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6)}
     */
    public void setNoshippingflg_IsNotNull() { regNoshippingflg(CK_ISNN, DOBJ); }

    protected void regNoshippingflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoshippingflg(), "NOSHIPPINGFLG"); }
    protected abstract ConditionValue xgetCValueNoshippingflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_Equal(String ifitemcd) {
        doSetIfitemcd_Equal(fRES(ifitemcd));
    }

    protected void doSetIfitemcd_Equal(String ifitemcd) {
        regIfitemcd(CK_EQ, ifitemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_NotEqual(String ifitemcd) {
        doSetIfitemcd_NotEqual(fRES(ifitemcd));
    }

    protected void doSetIfitemcd_NotEqual(String ifitemcd) {
        regIfitemcd(CK_NES, ifitemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_GreaterThan(String ifitemcd) {
        regIfitemcd(CK_GT, fRES(ifitemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_LessThan(String ifitemcd) {
        regIfitemcd(CK_LT, fRES(ifitemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_GreaterEqual(String ifitemcd) {
        regIfitemcd(CK_GE, fRES(ifitemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_LessEqual(String ifitemcd) {
        regIfitemcd(CK_LE, fRES(ifitemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcdList The collection of ifitemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_InScope(Collection<String> ifitemcdList) {
        doSetIfitemcd_InScope(ifitemcdList);
    }

    protected void doSetIfitemcd_InScope(Collection<String> ifitemcdList) {
        regINS(CK_INS, cTL(ifitemcdList), xgetCValueIfitemcd(), "IFITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcdList The collection of ifitemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_NotInScope(Collection<String> ifitemcdList) {
        doSetIfitemcd_NotInScope(ifitemcdList);
    }

    protected void doSetIfitemcd_NotInScope(Collection<String> ifitemcdList) {
        regINS(CK_NINS, cTL(ifitemcdList), xgetCValueIfitemcd(), "IFITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)} <br>
     * <pre>e.g. setIfitemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ifitemcd The value of ifitemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIfitemcd_LikeSearch(String ifitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ifitemcd), xgetCValueIfitemcd(), "IFITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIfitemcd_NotLikeSearch(String ifitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ifitemcd), xgetCValueIfitemcd(), "IFITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEMCD: {varchar(30)}
     * @param ifitemcd The value of ifitemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemcd_PrefixSearch(String ifitemcd) {
        setIfitemcd_LikeSearch(ifitemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     */
    public void setIfitemcd_IsNull() { regIfitemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     */
    public void setIfitemcd_IsNullOrEmpty() { regIfitemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IFITEMCD: {varchar(30)}
     */
    public void setIfitemcd_IsNotNull() { regIfitemcd(CK_ISNN, DOBJ); }

    protected void regIfitemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIfitemcd(), "IFITEMCD"); }
    protected abstract ConditionValue xgetCValueIfitemcd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {IX+, decimal(16, 6)}
     * @param sendflg The value of sendflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendflg_Equal(java.math.BigDecimal sendflg) {
        doSetSendflg_Equal(sendflg);
    }

    protected void doSetSendflg_Equal(java.math.BigDecimal sendflg) {
        regSendflg(CK_EQ, sendflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {IX+, decimal(16, 6)}
     * @param sendflg The value of sendflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendflg_NotEqual(java.math.BigDecimal sendflg) {
        doSetSendflg_NotEqual(sendflg);
    }

    protected void doSetSendflg_NotEqual(java.math.BigDecimal sendflg) {
        regSendflg(CK_NES, sendflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {IX+, decimal(16, 6)}
     * @param sendflg The value of sendflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendflg_GreaterThan(java.math.BigDecimal sendflg) {
        regSendflg(CK_GT, sendflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {IX+, decimal(16, 6)}
     * @param sendflg The value of sendflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendflg_LessThan(java.math.BigDecimal sendflg) {
        regSendflg(CK_LT, sendflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {IX+, decimal(16, 6)}
     * @param sendflg The value of sendflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendflg_GreaterEqual(java.math.BigDecimal sendflg) {
        regSendflg(CK_GE, sendflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {IX+, decimal(16, 6)}
     * @param sendflg The value of sendflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendflg_LessEqual(java.math.BigDecimal sendflg) {
        regSendflg(CK_LE, sendflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {IX+, decimal(16, 6)}
     * @param minNumber The min number of sendflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sendflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSendflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSendflg(), "SENDFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SENDFLG: {IX+, decimal(16, 6)}
     * @param sendflgList The collection of sendflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_InScope(Collection<java.math.BigDecimal> sendflgList) {
        doSetSendflg_InScope(sendflgList);
    }

    protected void doSetSendflg_InScope(Collection<java.math.BigDecimal> sendflgList) {
        regINS(CK_INS, cTL(sendflgList), xgetCValueSendflg(), "SENDFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SENDFLG: {IX+, decimal(16, 6)}
     * @param sendflgList The collection of sendflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_NotInScope(Collection<java.math.BigDecimal> sendflgList) {
        doSetSendflg_NotInScope(sendflgList);
    }

    protected void doSetSendflg_NotInScope(Collection<java.math.BigDecimal> sendflgList) {
        regINS(CK_NINS, cTL(sendflgList), xgetCValueSendflg(), "SENDFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SENDFLG: {IX+, decimal(16, 6)}
     */
    public void setSendflg_IsNull() { regSendflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SENDFLG: {IX+, decimal(16, 6)}
     */
    public void setSendflg_IsNotNull() { regSendflg(CK_ISNN, DOBJ); }

    protected void regSendflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendflg(), "SENDFLG"); }
    protected abstract ConditionValue xgetCValueSendflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_Equal(java.math.BigDecimal rcvkey) {
        doSetRcvkey_Equal(rcvkey);
    }

    protected void doSetRcvkey_Equal(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_EQ, rcvkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_NotEqual(java.math.BigDecimal rcvkey) {
        doSetRcvkey_NotEqual(rcvkey);
    }

    protected void doSetRcvkey_NotEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_NES, rcvkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GT, rcvkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LT, rcvkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GE, rcvkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LE, rcvkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param minNumber The min number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvkey(), "RCVKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkeyList The collection of rcvkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_InScope(Collection<java.math.BigDecimal> rcvkeyList) {
        doSetRcvkey_InScope(rcvkeyList);
    }

    protected void doSetRcvkey_InScope(Collection<java.math.BigDecimal> rcvkeyList) {
        regINS(CK_INS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkeyList The collection of rcvkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        doSetRcvkey_NotInScope(rcvkeyList);
    }

    protected void doSetRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        regINS(CK_NINS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     */
    public void setRcvkey_IsNull() { regRcvkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     */
    public void setRcvkey_IsNotNull() { regRcvkey(CK_ISNN, DOBJ); }

    protected void regRcvkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvkey(), "RCVKEY"); }
    protected abstract ConditionValue xgetCValueRcvkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {decimal(16, 6)}
     * @param palletno The value of palletno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_Equal(java.math.BigDecimal palletno) {
        doSetPalletno_Equal(palletno);
    }

    protected void doSetPalletno_Equal(java.math.BigDecimal palletno) {
        regPalletno(CK_EQ, palletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {decimal(16, 6)}
     * @param palletno The value of palletno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_NotEqual(java.math.BigDecimal palletno) {
        doSetPalletno_NotEqual(palletno);
    }

    protected void doSetPalletno_NotEqual(java.math.BigDecimal palletno) {
        regPalletno(CK_NES, palletno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {decimal(16, 6)}
     * @param palletno The value of palletno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_GreaterThan(java.math.BigDecimal palletno) {
        regPalletno(CK_GT, palletno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {decimal(16, 6)}
     * @param palletno The value of palletno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_LessThan(java.math.BigDecimal palletno) {
        regPalletno(CK_LT, palletno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {decimal(16, 6)}
     * @param palletno The value of palletno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_GreaterEqual(java.math.BigDecimal palletno) {
        regPalletno(CK_GE, palletno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {decimal(16, 6)}
     * @param palletno The value of palletno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletno_LessEqual(java.math.BigDecimal palletno) {
        regPalletno(CK_LE, palletno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETNO: {decimal(16, 6)}
     * @param minNumber The min number of palletno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletno(), "PALLETNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETNO: {decimal(16, 6)}
     * @param palletnoList The collection of palletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_InScope(Collection<java.math.BigDecimal> palletnoList) {
        doSetPalletno_InScope(palletnoList);
    }

    protected void doSetPalletno_InScope(Collection<java.math.BigDecimal> palletnoList) {
        regINS(CK_INS, cTL(palletnoList), xgetCValuePalletno(), "PALLETNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETNO: {decimal(16, 6)}
     * @param palletnoList The collection of palletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletno_NotInScope(Collection<java.math.BigDecimal> palletnoList) {
        doSetPalletno_NotInScope(palletnoList);
    }

    protected void doSetPalletno_NotInScope(Collection<java.math.BigDecimal> palletnoList) {
        regINS(CK_NINS, cTL(palletnoList), xgetCValuePalletno(), "PALLETNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLETNO: {decimal(16, 6)}
     */
    public void setPalletno_IsNull() { regPalletno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLETNO: {decimal(16, 6)}
     */
    public void setPalletno_IsNotNull() { regPalletno(CK_ISNN, DOBJ); }

    protected void regPalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletno(), "PALLETNO"); }
    protected abstract ConditionValue xgetCValuePalletno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokey The value of sokey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_Equal(java.math.BigDecimal sokey) {
        doSetSokey_Equal(sokey);
    }

    protected void doSetSokey_Equal(java.math.BigDecimal sokey) {
        regSokey(CK_EQ, sokey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokey The value of sokey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_NotEqual(java.math.BigDecimal sokey) {
        doSetSokey_NotEqual(sokey);
    }

    protected void doSetSokey_NotEqual(java.math.BigDecimal sokey) {
        regSokey(CK_NES, sokey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokey The value of sokey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_GreaterThan(java.math.BigDecimal sokey) {
        regSokey(CK_GT, sokey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokey The value of sokey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_LessThan(java.math.BigDecimal sokey) {
        regSokey(CK_LT, sokey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokey The value of sokey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_GreaterEqual(java.math.BigDecimal sokey) {
        regSokey(CK_GE, sokey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokey The value of sokey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_LessEqual(java.math.BigDecimal sokey) {
        regSokey(CK_LE, sokey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param minNumber The min number of sokey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sokey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSokey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSokey(), "SOKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokeyList The collection of sokey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSokey_InScope(Collection<java.math.BigDecimal> sokeyList) {
        doSetSokey_InScope(sokeyList);
    }

    protected void doSetSokey_InScope(Collection<java.math.BigDecimal> sokeyList) {
        regINS(CK_INS, cTL(sokeyList), xgetCValueSokey(), "SOKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     * @param sokeyList The collection of sokey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSokey_NotInScope(Collection<java.math.BigDecimal> sokeyList) {
        doSetSokey_NotInScope(sokeyList);
    }

    protected void doSetSokey_NotInScope(Collection<java.math.BigDecimal> sokeyList) {
        regINS(CK_NINS, cTL(sokeyList), xgetCValueSokey(), "SOKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     */
    public void setSokey_IsNull() { regSokey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOKEY: {decimal(16, 6)}
     */
    public void setSokey_IsNotNull() { regSokey(CK_ISNN, DOBJ); }

    protected void regSokey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSokey(), "SOKEY"); }
    protected abstract ConditionValue xgetCValueSokey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_Equal(String fax1) {
        doSetFax1_Equal(fRES(fax1));
    }

    protected void doSetFax1_Equal(String fax1) {
        regFax1(CK_EQ, fax1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_NotEqual(String fax1) {
        doSetFax1_NotEqual(fRES(fax1));
    }

    protected void doSetFax1_NotEqual(String fax1) {
        regFax1(CK_NES, fax1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_GreaterThan(String fax1) {
        regFax1(CK_GT, fRES(fax1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_LessThan(String fax1) {
        regFax1(CK_LT, fRES(fax1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_GreaterEqual(String fax1) {
        regFax1(CK_GE, fRES(fax1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_LessEqual(String fax1) {
        regFax1(CK_LE, fRES(fax1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1List The collection of fax1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_InScope(Collection<String> fax1List) {
        doSetFax1_InScope(fax1List);
    }

    protected void doSetFax1_InScope(Collection<String> fax1List) {
        regINS(CK_INS, cTL(fax1List), xgetCValueFax1(), "FAX1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1List The collection of fax1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_NotInScope(Collection<String> fax1List) {
        doSetFax1_NotInScope(fax1List);
    }

    protected void doSetFax1_NotInScope(Collection<String> fax1List) {
        regINS(CK_NINS, cTL(fax1List), xgetCValueFax1(), "FAX1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)} <br>
     * <pre>e.g. setFax1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fax1 The value of fax1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFax1_LikeSearch(String fax1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fax1), xgetCValueFax1(), "FAX1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFax1_NotLikeSearch(String fax1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fax1), xgetCValueFax1(), "FAX1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_PrefixSearch(String fax1) {
        setFax1_LikeSearch(fax1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     */
    public void setFax1_IsNull() { regFax1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     */
    public void setFax1_IsNullOrEmpty() { regFax1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     */
    public void setFax1_IsNotNull() { regFax1(CK_ISNN, DOBJ); }

    protected void regFax1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFax1(), "FAX1"); }
    protected abstract ConditionValue xgetCValueFax1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_Equal(String originalpono) {
        doSetOriginalpono_Equal(fRES(originalpono));
    }

    protected void doSetOriginalpono_Equal(String originalpono) {
        regOriginalpono(CK_EQ, originalpono);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_NotEqual(String originalpono) {
        doSetOriginalpono_NotEqual(fRES(originalpono));
    }

    protected void doSetOriginalpono_NotEqual(String originalpono) {
        regOriginalpono(CK_NES, originalpono);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_GreaterThan(String originalpono) {
        regOriginalpono(CK_GT, fRES(originalpono));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_LessThan(String originalpono) {
        regOriginalpono(CK_LT, fRES(originalpono));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_GreaterEqual(String originalpono) {
        regOriginalpono(CK_GE, fRES(originalpono));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_LessEqual(String originalpono) {
        regOriginalpono(CK_LE, fRES(originalpono));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalponoList The collection of originalpono as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_InScope(Collection<String> originalponoList) {
        doSetOriginalpono_InScope(originalponoList);
    }

    protected void doSetOriginalpono_InScope(Collection<String> originalponoList) {
        regINS(CK_INS, cTL(originalponoList), xgetCValueOriginalpono(), "ORIGINALPONO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalponoList The collection of originalpono as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_NotInScope(Collection<String> originalponoList) {
        doSetOriginalpono_NotInScope(originalponoList);
    }

    protected void doSetOriginalpono_NotInScope(Collection<String> originalponoList) {
        regINS(CK_NINS, cTL(originalponoList), xgetCValueOriginalpono(), "ORIGINALPONO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORIGINALPONO: {varchar(60)} <br>
     * <pre>e.g. setOriginalpono_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param originalpono The value of originalpono as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOriginalpono_LikeSearch(String originalpono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(originalpono), xgetCValueOriginalpono(), "ORIGINALPONO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOriginalpono_NotLikeSearch(String originalpono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(originalpono), xgetCValueOriginalpono(), "ORIGINALPONO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     * @param originalpono The value of originalpono as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_PrefixSearch(String originalpono) {
        setOriginalpono_LikeSearch(originalpono, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     */
    public void setOriginalpono_IsNull() { regOriginalpono(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     */
    public void setOriginalpono_IsNullOrEmpty() { regOriginalpono(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORIGINALPONO: {varchar(60)}
     */
    public void setOriginalpono_IsNotNull() { regOriginalpono(CK_ISNN, DOBJ); }

    protected void regOriginalpono(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOriginalpono(), "ORIGINALPONO"); }
    protected abstract ConditionValue xgetCValueOriginalpono();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOSJTSENDFLG: {char(1), default=[0]}
     * @param mosjtsendflg The value of mosjtsendflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMosjtsendflg_Equal(String mosjtsendflg) {
        doSetMosjtsendflg_Equal(fRES(mosjtsendflg));
    }

    protected void doSetMosjtsendflg_Equal(String mosjtsendflg) {
        regMosjtsendflg(CK_EQ, mosjtsendflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOSJTSENDFLG: {char(1), default=[0]}
     * @param mosjtsendflg The value of mosjtsendflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMosjtsendflg_NotEqual(String mosjtsendflg) {
        doSetMosjtsendflg_NotEqual(fRES(mosjtsendflg));
    }

    protected void doSetMosjtsendflg_NotEqual(String mosjtsendflg) {
        regMosjtsendflg(CK_NES, mosjtsendflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOSJTSENDFLG: {char(1), default=[0]}
     * @param mosjtsendflg The value of mosjtsendflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMosjtsendflg_GreaterThan(String mosjtsendflg) {
        regMosjtsendflg(CK_GT, fRES(mosjtsendflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOSJTSENDFLG: {char(1), default=[0]}
     * @param mosjtsendflg The value of mosjtsendflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMosjtsendflg_LessThan(String mosjtsendflg) {
        regMosjtsendflg(CK_LT, fRES(mosjtsendflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOSJTSENDFLG: {char(1), default=[0]}
     * @param mosjtsendflg The value of mosjtsendflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMosjtsendflg_GreaterEqual(String mosjtsendflg) {
        regMosjtsendflg(CK_GE, fRES(mosjtsendflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOSJTSENDFLG: {char(1), default=[0]}
     * @param mosjtsendflg The value of mosjtsendflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMosjtsendflg_LessEqual(String mosjtsendflg) {
        regMosjtsendflg(CK_LE, fRES(mosjtsendflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOSJTSENDFLG: {char(1), default=[0]}
     * @param mosjtsendflgList The collection of mosjtsendflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMosjtsendflg_InScope(Collection<String> mosjtsendflgList) {
        doSetMosjtsendflg_InScope(mosjtsendflgList);
    }

    protected void doSetMosjtsendflg_InScope(Collection<String> mosjtsendflgList) {
        regINS(CK_INS, cTL(mosjtsendflgList), xgetCValueMosjtsendflg(), "MOSJTSENDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOSJTSENDFLG: {char(1), default=[0]}
     * @param mosjtsendflgList The collection of mosjtsendflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMosjtsendflg_NotInScope(Collection<String> mosjtsendflgList) {
        doSetMosjtsendflg_NotInScope(mosjtsendflgList);
    }

    protected void doSetMosjtsendflg_NotInScope(Collection<String> mosjtsendflgList) {
        regINS(CK_NINS, cTL(mosjtsendflgList), xgetCValueMosjtsendflg(), "MOSJTSENDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOSJTSENDFLG: {char(1), default=[0]} <br>
     * <pre>e.g. setMosjtsendflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mosjtsendflg The value of mosjtsendflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMosjtsendflg_LikeSearch(String mosjtsendflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mosjtsendflg), xgetCValueMosjtsendflg(), "MOSJTSENDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOSJTSENDFLG: {char(1), default=[0]}
     * @param mosjtsendflg The value of mosjtsendflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMosjtsendflg_NotLikeSearch(String mosjtsendflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mosjtsendflg), xgetCValueMosjtsendflg(), "MOSJTSENDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOSJTSENDFLG: {char(1), default=[0]}
     * @param mosjtsendflg The value of mosjtsendflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMosjtsendflg_PrefixSearch(String mosjtsendflg) {
        setMosjtsendflg_LikeSearch(mosjtsendflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOSJTSENDFLG: {char(1), default=[0]}
     */
    public void setMosjtsendflg_IsNull() { regMosjtsendflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOSJTSENDFLG: {char(1), default=[0]}
     */
    public void setMosjtsendflg_IsNotNull() { regMosjtsendflg(CK_ISNN, DOBJ); }

    protected void regMosjtsendflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMosjtsendflg(), "MOSJTSENDFLG"); }
    protected abstract ConditionValue xgetCValueMosjtsendflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_Equal(String shipdate) {
        doSetShipdate_Equal(fRES(shipdate));
    }

    protected void doSetShipdate_Equal(String shipdate) {
        regShipdate(CK_EQ, shipdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_NotEqual(String shipdate) {
        doSetShipdate_NotEqual(fRES(shipdate));
    }

    protected void doSetShipdate_NotEqual(String shipdate) {
        regShipdate(CK_NES, shipdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_GreaterThan(String shipdate) {
        regShipdate(CK_GT, fRES(shipdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_LessThan(String shipdate) {
        regShipdate(CK_LT, fRES(shipdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_GreaterEqual(String shipdate) {
        regShipdate(CK_GE, fRES(shipdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_LessEqual(String shipdate) {
        regShipdate(CK_LE, fRES(shipdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdateList The collection of shipdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_InScope(Collection<String> shipdateList) {
        doSetShipdate_InScope(shipdateList);
    }

    protected void doSetShipdate_InScope(Collection<String> shipdateList) {
        regINS(CK_INS, cTL(shipdateList), xgetCValueShipdate(), "SHIPDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdateList The collection of shipdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_NotInScope(Collection<String> shipdateList) {
        doSetShipdate_NotInScope(shipdateList);
    }

    protected void doSetShipdate_NotInScope(Collection<String> shipdateList) {
        regINS(CK_NINS, cTL(shipdateList), xgetCValueShipdate(), "SHIPDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)} <br>
     * <pre>e.g. setShipdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipdate The value of shipdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipdate_LikeSearch(String shipdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipdate), xgetCValueShipdate(), "SHIPDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipdate_NotLikeSearch(String shipdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipdate), xgetCValueShipdate(), "SHIPDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_PrefixSearch(String shipdate) {
        setShipdate_LikeSearch(shipdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     */
    public void setShipdate_IsNull() { regShipdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     */
    public void setShipdate_IsNullOrEmpty() { regShipdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     */
    public void setShipdate_IsNotNull() { regShipdate(CK_ISNN, DOBJ); }

    protected void regShipdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipdate(), "SHIPDATE"); }
    protected abstract ConditionValue xgetCValueShipdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_Equal(String delivname) {
        doSetDelivname_Equal(fRES(delivname));
    }

    protected void doSetDelivname_Equal(String delivname) {
        regDelivname(CK_EQ, delivname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_NotEqual(String delivname) {
        doSetDelivname_NotEqual(fRES(delivname));
    }

    protected void doSetDelivname_NotEqual(String delivname) {
        regDelivname(CK_NES, delivname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_GreaterThan(String delivname) {
        regDelivname(CK_GT, fRES(delivname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_LessThan(String delivname) {
        regDelivname(CK_LT, fRES(delivname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_GreaterEqual(String delivname) {
        regDelivname(CK_GE, fRES(delivname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_LessEqual(String delivname) {
        regDelivname(CK_LE, fRES(delivname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivnameList The collection of delivname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_InScope(Collection<String> delivnameList) {
        doSetDelivname_InScope(delivnameList);
    }

    protected void doSetDelivname_InScope(Collection<String> delivnameList) {
        regINS(CK_INS, cTL(delivnameList), xgetCValueDelivname(), "DELIVNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivnameList The collection of delivname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_NotInScope(Collection<String> delivnameList) {
        doSetDelivname_NotInScope(delivnameList);
    }

    protected void doSetDelivname_NotInScope(Collection<String> delivnameList) {
        regINS(CK_NINS, cTL(delivnameList), xgetCValueDelivname(), "DELIVNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVNAME: {varchar(255)} <br>
     * <pre>e.g. setDelivname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivname The value of delivname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivname_LikeSearch(String delivname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivname), xgetCValueDelivname(), "DELIVNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivname_NotLikeSearch(String delivname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivname), xgetCValueDelivname(), "DELIVNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_PrefixSearch(String delivname) {
        setDelivname_LikeSearch(delivname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     */
    public void setDelivname_IsNull() { regDelivname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     */
    public void setDelivname_IsNullOrEmpty() { regDelivname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     */
    public void setDelivname_IsNotNull() { regDelivname(CK_ISNN, DOBJ); }

    protected void regDelivname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivname(), "DELIVNAME"); }
    protected abstract ConditionValue xgetCValueDelivname();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_Equal(Long centerId) {
        doSetCenterId_Equal(centerId);
    }

    protected void doSetCenterId_Equal(Long centerId) {
        regCenterId(CK_EQ, centerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_NotEqual(Long centerId) {
        doSetCenterId_NotEqual(centerId);
    }

    protected void doSetCenterId_NotEqual(Long centerId) {
        regCenterId(CK_NES, centerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerIdList The collection of centerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_InScope(Collection<Long> centerIdList) {
        doSetCenterId_InScope(centerIdList);
    }

    protected void doSetCenterId_InScope(Collection<Long> centerIdList) {
        regINS(CK_INS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CENTER_ID from M_CENTER where ...)} <br />
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'in-scope'. (NotNull)
     */
    public void inScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_InScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", false);
    }
    public abstract String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CENTER_ID from M_CENTER where ...)} <br />
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_NotInScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", true);
    }
    public abstract String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq);

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_Equal(Long clientId) {
        doSetClientId_Equal(clientId);
    }

    protected void doSetClientId_Equal(Long clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(Long clientId) {
        doSetClientId_NotEqual(clientId);
    }

    protected void doSetClientId_NotEqual(Long clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<Long> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<Long> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLIENT_ID from M_CLIENT where ...)} <br />
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'in-scope'. (NotNull)
     */
    public void inScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_InScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", false);
    }
    public abstract String keepClientId_InScopeRelation_MClient(MClientCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLIENT_ID from M_CLIENT where ...)} <br />
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'not in-scope'. (NotNull)
     */
    public void notInScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_NotInScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", true);
    }
    public abstract String keepClientId_NotInScopeRelation_MClient(MClientCQ sq);

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

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
    public HpSLCFunction<TTrsymboltraceCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrsymboltraceCB.class);
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
    public HpSLCFunction<TTrsymboltraceCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrsymboltraceCB.class);
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
    public HpSLCFunction<TTrsymboltraceCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrsymboltraceCB.class);
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
    public HpSLCFunction<TTrsymboltraceCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrsymboltraceCB.class);
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
    public HpSLCFunction<TTrsymboltraceCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrsymboltraceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrsymboltraceCB&gt;() {
     *     public void query(TTrsymboltraceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrsymboltraceCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrsymboltraceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymboltraceCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrsymboltraceCQ sq);

    protected TTrsymboltraceCB xcreateScalarConditionCB() {
        TTrsymboltraceCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrsymboltraceCB xcreateScalarConditionPartitionByCB() {
        TTrsymboltraceCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrsymboltraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymboltraceCB cb = new TTrsymboltraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRSYMBOLTRACE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrsymboltraceCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrsymboltraceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrsymboltraceCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymboltraceCB cb = new TTrsymboltraceCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRSYMBOLTRACE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrsymboltraceCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrsymboltraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsymboltraceCB cb = new TTrsymboltraceCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrsymboltraceCQ sq);

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
    protected TTrsymboltraceCB newMyCB() {
        return new TTrsymboltraceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrsymboltraceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

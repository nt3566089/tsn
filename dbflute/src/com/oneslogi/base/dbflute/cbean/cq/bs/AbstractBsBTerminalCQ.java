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
 * The abstract condition-query of B_TERMINAL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBTerminalCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBTerminalCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_TERMINAL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalId The value of terminalId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalId_Equal(Long terminalId) {
        doSetTerminalId_Equal(terminalId);
    }

    protected void doSetTerminalId_Equal(Long terminalId) {
        regTerminalId(CK_EQ, terminalId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalId The value of terminalId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalId_NotEqual(Long terminalId) {
        doSetTerminalId_NotEqual(terminalId);
    }

    protected void doSetTerminalId_NotEqual(Long terminalId) {
        regTerminalId(CK_NES, terminalId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalId The value of terminalId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalId_GreaterThan(Long terminalId) {
        regTerminalId(CK_GT, terminalId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalId The value of terminalId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalId_LessThan(Long terminalId) {
        regTerminalId(CK_LT, terminalId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalId The value of terminalId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalId_GreaterEqual(Long terminalId) {
        regTerminalId(CK_GE, terminalId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalId The value of terminalId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTerminalId_LessEqual(Long terminalId) {
        regTerminalId(CK_LE, terminalId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of terminalId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of terminalId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTerminalId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTerminalId(), "TERMINAL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TERMINAL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalIdList The collection of terminalId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalId_InScope(Collection<Long> terminalIdList) {
        doSetTerminalId_InScope(terminalIdList);
    }

    protected void doSetTerminalId_InScope(Collection<Long> terminalIdList) {
        regINS(CK_INS, cTL(terminalIdList), xgetCValueTerminalId(), "TERMINAL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TERMINAL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param terminalIdList The collection of terminalId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalId_NotInScope(Collection<Long> terminalIdList) {
        doSetTerminalId_NotInScope(terminalIdList);
    }

    protected void doSetTerminalId_NotInScope(Collection<Long> terminalIdList) {
        regINS(CK_NINS, cTL(terminalIdList), xgetCValueTerminalId(), "TERMINAL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TERMINAL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTerminalId_IsNull() { regTerminalId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TERMINAL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTerminalId_IsNotNull() { regTerminalId(CK_ISNN, DOBJ); }

    protected void regTerminalId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTerminalId(), "TERMINAL_ID"); }
    protected abstract ConditionValue xgetCValueTerminalId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_CD: {UQ, NotNull, varchar(30)}
     * @param terminalCd The value of terminalCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_Equal(String terminalCd) {
        doSetTerminalCd_Equal(fRES(terminalCd));
    }

    protected void doSetTerminalCd_Equal(String terminalCd) {
        regTerminalCd(CK_EQ, terminalCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_CD: {UQ, NotNull, varchar(30)}
     * @param terminalCd The value of terminalCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_NotEqual(String terminalCd) {
        doSetTerminalCd_NotEqual(fRES(terminalCd));
    }

    protected void doSetTerminalCd_NotEqual(String terminalCd) {
        regTerminalCd(CK_NES, terminalCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_CD: {UQ, NotNull, varchar(30)}
     * @param terminalCd The value of terminalCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_GreaterThan(String terminalCd) {
        regTerminalCd(CK_GT, fRES(terminalCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_CD: {UQ, NotNull, varchar(30)}
     * @param terminalCd The value of terminalCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_LessThan(String terminalCd) {
        regTerminalCd(CK_LT, fRES(terminalCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_CD: {UQ, NotNull, varchar(30)}
     * @param terminalCd The value of terminalCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_GreaterEqual(String terminalCd) {
        regTerminalCd(CK_GE, fRES(terminalCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_CD: {UQ, NotNull, varchar(30)}
     * @param terminalCd The value of terminalCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_LessEqual(String terminalCd) {
        regTerminalCd(CK_LE, fRES(terminalCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TERMINAL_CD: {UQ, NotNull, varchar(30)}
     * @param terminalCdList The collection of terminalCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_InScope(Collection<String> terminalCdList) {
        doSetTerminalCd_InScope(terminalCdList);
    }

    protected void doSetTerminalCd_InScope(Collection<String> terminalCdList) {
        regINS(CK_INS, cTL(terminalCdList), xgetCValueTerminalCd(), "TERMINAL_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TERMINAL_CD: {UQ, NotNull, varchar(30)}
     * @param terminalCdList The collection of terminalCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_NotInScope(Collection<String> terminalCdList) {
        doSetTerminalCd_NotInScope(terminalCdList);
    }

    protected void doSetTerminalCd_NotInScope(Collection<String> terminalCdList) {
        regINS(CK_NINS, cTL(terminalCdList), xgetCValueTerminalCd(), "TERMINAL_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_CD: {UQ, NotNull, varchar(30)} <br>
     * <pre>e.g. setTerminalCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param terminalCd The value of terminalCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTerminalCd_LikeSearch(String terminalCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(terminalCd), xgetCValueTerminalCd(), "TERMINAL_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_CD: {UQ, NotNull, varchar(30)}
     * @param terminalCd The value of terminalCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTerminalCd_NotLikeSearch(String terminalCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(terminalCd), xgetCValueTerminalCd(), "TERMINAL_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_CD: {UQ, NotNull, varchar(30)}
     * @param terminalCd The value of terminalCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalCd_PrefixSearch(String terminalCd) {
        setTerminalCd_LikeSearch(terminalCd, xcLSOPPre());
    }

    protected void regTerminalCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTerminalCd(), "TERMINAL_CD"); }
    protected abstract ConditionValue xgetCValueTerminalCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_NM: {varchar(60)}
     * @param terminalNm The value of terminalNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_Equal(String terminalNm) {
        doSetTerminalNm_Equal(fRES(terminalNm));
    }

    protected void doSetTerminalNm_Equal(String terminalNm) {
        regTerminalNm(CK_EQ, terminalNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_NM: {varchar(60)}
     * @param terminalNm The value of terminalNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_NotEqual(String terminalNm) {
        doSetTerminalNm_NotEqual(fRES(terminalNm));
    }

    protected void doSetTerminalNm_NotEqual(String terminalNm) {
        regTerminalNm(CK_NES, terminalNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_NM: {varchar(60)}
     * @param terminalNm The value of terminalNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_GreaterThan(String terminalNm) {
        regTerminalNm(CK_GT, fRES(terminalNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_NM: {varchar(60)}
     * @param terminalNm The value of terminalNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_LessThan(String terminalNm) {
        regTerminalNm(CK_LT, fRES(terminalNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_NM: {varchar(60)}
     * @param terminalNm The value of terminalNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_GreaterEqual(String terminalNm) {
        regTerminalNm(CK_GE, fRES(terminalNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL_NM: {varchar(60)}
     * @param terminalNm The value of terminalNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_LessEqual(String terminalNm) {
        regTerminalNm(CK_LE, fRES(terminalNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TERMINAL_NM: {varchar(60)}
     * @param terminalNmList The collection of terminalNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_InScope(Collection<String> terminalNmList) {
        doSetTerminalNm_InScope(terminalNmList);
    }

    protected void doSetTerminalNm_InScope(Collection<String> terminalNmList) {
        regINS(CK_INS, cTL(terminalNmList), xgetCValueTerminalNm(), "TERMINAL_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TERMINAL_NM: {varchar(60)}
     * @param terminalNmList The collection of terminalNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_NotInScope(Collection<String> terminalNmList) {
        doSetTerminalNm_NotInScope(terminalNmList);
    }

    protected void doSetTerminalNm_NotInScope(Collection<String> terminalNmList) {
        regINS(CK_NINS, cTL(terminalNmList), xgetCValueTerminalNm(), "TERMINAL_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_NM: {varchar(60)} <br>
     * <pre>e.g. setTerminalNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param terminalNm The value of terminalNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTerminalNm_LikeSearch(String terminalNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(terminalNm), xgetCValueTerminalNm(), "TERMINAL_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_NM: {varchar(60)}
     * @param terminalNm The value of terminalNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTerminalNm_NotLikeSearch(String terminalNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(terminalNm), xgetCValueTerminalNm(), "TERMINAL_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL_NM: {varchar(60)}
     * @param terminalNm The value of terminalNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminalNm_PrefixSearch(String terminalNm) {
        setTerminalNm_LikeSearch(terminalNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TERMINAL_NM: {varchar(60)}
     */
    public void setTerminalNm_IsNull() { regTerminalNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TERMINAL_NM: {varchar(60)}
     */
    public void setTerminalNm_IsNullOrEmpty() { regTerminalNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TERMINAL_NM: {varchar(60)}
     */
    public void setTerminalNm_IsNotNull() { regTerminalNm(CK_ISNN, DOBJ); }

    protected void regTerminalNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTerminalNm(), "TERMINAL_NM"); }
    protected abstract ConditionValue xgetCValueTerminalNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UUID: {UQ, varchar(100)}
     * @param uuid The value of uuid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUuid_Equal(String uuid) {
        doSetUuid_Equal(fRES(uuid));
    }

    protected void doSetUuid_Equal(String uuid) {
        regUuid(CK_EQ, uuid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UUID: {UQ, varchar(100)}
     * @param uuid The value of uuid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUuid_NotEqual(String uuid) {
        doSetUuid_NotEqual(fRES(uuid));
    }

    protected void doSetUuid_NotEqual(String uuid) {
        regUuid(CK_NES, uuid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UUID: {UQ, varchar(100)}
     * @param uuid The value of uuid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUuid_GreaterThan(String uuid) {
        regUuid(CK_GT, fRES(uuid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UUID: {UQ, varchar(100)}
     * @param uuid The value of uuid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUuid_LessThan(String uuid) {
        regUuid(CK_LT, fRES(uuid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UUID: {UQ, varchar(100)}
     * @param uuid The value of uuid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUuid_GreaterEqual(String uuid) {
        regUuid(CK_GE, fRES(uuid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UUID: {UQ, varchar(100)}
     * @param uuid The value of uuid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUuid_LessEqual(String uuid) {
        regUuid(CK_LE, fRES(uuid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UUID: {UQ, varchar(100)}
     * @param uuidList The collection of uuid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUuid_InScope(Collection<String> uuidList) {
        doSetUuid_InScope(uuidList);
    }

    protected void doSetUuid_InScope(Collection<String> uuidList) {
        regINS(CK_INS, cTL(uuidList), xgetCValueUuid(), "UUID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UUID: {UQ, varchar(100)}
     * @param uuidList The collection of uuid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUuid_NotInScope(Collection<String> uuidList) {
        doSetUuid_NotInScope(uuidList);
    }

    protected void doSetUuid_NotInScope(Collection<String> uuidList) {
        regINS(CK_NINS, cTL(uuidList), xgetCValueUuid(), "UUID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UUID: {UQ, varchar(100)} <br>
     * <pre>e.g. setUuid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uuid The value of uuid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUuid_LikeSearch(String uuid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uuid), xgetCValueUuid(), "UUID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UUID: {UQ, varchar(100)}
     * @param uuid The value of uuid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUuid_NotLikeSearch(String uuid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uuid), xgetCValueUuid(), "UUID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UUID: {UQ, varchar(100)}
     * @param uuid The value of uuid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUuid_PrefixSearch(String uuid) {
        setUuid_LikeSearch(uuid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UUID: {UQ, varchar(100)}
     */
    public void setUuid_IsNull() { regUuid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UUID: {UQ, varchar(100)}
     */
    public void setUuid_IsNullOrEmpty() { regUuid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UUID: {UQ, varchar(100)}
     */
    public void setUuid_IsNotNull() { regUuid(CK_ISNN, DOBJ); }

    protected void regUuid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUuid(), "UUID"); }
    protected abstract ConditionValue xgetCValueUuid();

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
    public HpSLCFunction<BTerminalCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BTerminalCB.class);
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
    public HpSLCFunction<BTerminalCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BTerminalCB.class);
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
    public HpSLCFunction<BTerminalCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BTerminalCB.class);
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
    public HpSLCFunction<BTerminalCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BTerminalCB.class);
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
    public HpSLCFunction<BTerminalCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BTerminalCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BTerminalCB&gt;() {
     *     public void query(BTerminalCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BTerminalCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BTerminalCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BTerminalCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BTerminalCQ sq);

    protected BTerminalCB xcreateScalarConditionCB() {
        BTerminalCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BTerminalCB xcreateScalarConditionPartitionByCB() {
        BTerminalCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BTerminalCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BTerminalCB cb = new BTerminalCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TERMINAL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BTerminalCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BTerminalCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BTerminalCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BTerminalCB cb = new BTerminalCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TERMINAL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BTerminalCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BTerminalCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BTerminalCB cb = new BTerminalCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BTerminalCQ sq);

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
    protected BTerminalCB newMyCB() {
        return new BTerminalCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BTerminalCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

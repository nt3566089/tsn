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
 * The abstract condition-query of B_SYSTEM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBSystemCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBSystemCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_SYSTEM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemId The value of systemId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemId_Equal(Long systemId) {
        doSetSystemId_Equal(systemId);
    }

    protected void doSetSystemId_Equal(Long systemId) {
        regSystemId(CK_EQ, systemId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemId The value of systemId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemId_NotEqual(Long systemId) {
        doSetSystemId_NotEqual(systemId);
    }

    protected void doSetSystemId_NotEqual(Long systemId) {
        regSystemId(CK_NES, systemId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemId The value of systemId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemId_GreaterThan(Long systemId) {
        regSystemId(CK_GT, systemId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemId The value of systemId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemId_LessThan(Long systemId) {
        regSystemId(CK_LT, systemId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemId The value of systemId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemId_GreaterEqual(Long systemId) {
        regSystemId(CK_GE, systemId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemId The value of systemId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemId_LessEqual(Long systemId) {
        regSystemId(CK_LE, systemId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of systemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of systemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSystemId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSystemId(), "SYSTEM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSTEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemIdList The collection of systemId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemId_InScope(Collection<Long> systemIdList) {
        doSetSystemId_InScope(systemIdList);
    }

    protected void doSetSystemId_InScope(Collection<Long> systemIdList) {
        regINS(CK_INS, cTL(systemIdList), xgetCValueSystemId(), "SYSTEM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSTEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param systemIdList The collection of systemId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemId_NotInScope(Collection<Long> systemIdList) {
        doSetSystemId_NotInScope(systemIdList);
    }

    protected void doSetSystemId_NotInScope(Collection<Long> systemIdList) {
        regINS(CK_NINS, cTL(systemIdList), xgetCValueSystemId(), "SYSTEM_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSTEM_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSystemId_IsNull() { regSystemId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSTEM_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSystemId_IsNotNull() { regSystemId(CK_ISNN, DOBJ); }

    protected void regSystemId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSystemId(), "SYSTEM_ID"); }
    protected abstract ConditionValue xgetCValueSystemId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_NM: {varchar(60)}
     * @param systemNm The value of systemNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemNm_Equal(String systemNm) {
        doSetSystemNm_Equal(fRES(systemNm));
    }

    protected void doSetSystemNm_Equal(String systemNm) {
        regSystemNm(CK_EQ, systemNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_NM: {varchar(60)}
     * @param systemNm The value of systemNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemNm_NotEqual(String systemNm) {
        doSetSystemNm_NotEqual(fRES(systemNm));
    }

    protected void doSetSystemNm_NotEqual(String systemNm) {
        regSystemNm(CK_NES, systemNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_NM: {varchar(60)}
     * @param systemNm The value of systemNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemNm_GreaterThan(String systemNm) {
        regSystemNm(CK_GT, fRES(systemNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_NM: {varchar(60)}
     * @param systemNm The value of systemNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemNm_LessThan(String systemNm) {
        regSystemNm(CK_LT, fRES(systemNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_NM: {varchar(60)}
     * @param systemNm The value of systemNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemNm_GreaterEqual(String systemNm) {
        regSystemNm(CK_GE, fRES(systemNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_NM: {varchar(60)}
     * @param systemNm The value of systemNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemNm_LessEqual(String systemNm) {
        regSystemNm(CK_LE, fRES(systemNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_NM: {varchar(60)}
     * @param systemNmList The collection of systemNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemNm_InScope(Collection<String> systemNmList) {
        doSetSystemNm_InScope(systemNmList);
    }

    protected void doSetSystemNm_InScope(Collection<String> systemNmList) {
        regINS(CK_INS, cTL(systemNmList), xgetCValueSystemNm(), "SYSTEM_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_NM: {varchar(60)}
     * @param systemNmList The collection of systemNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemNm_NotInScope(Collection<String> systemNmList) {
        doSetSystemNm_NotInScope(systemNmList);
    }

    protected void doSetSystemNm_NotInScope(Collection<String> systemNmList) {
        regINS(CK_NINS, cTL(systemNmList), xgetCValueSystemNm(), "SYSTEM_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_NM: {varchar(60)} <br>
     * <pre>e.g. setSystemNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param systemNm The value of systemNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSystemNm_LikeSearch(String systemNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(systemNm), xgetCValueSystemNm(), "SYSTEM_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_NM: {varchar(60)}
     * @param systemNm The value of systemNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSystemNm_NotLikeSearch(String systemNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(systemNm), xgetCValueSystemNm(), "SYSTEM_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_NM: {varchar(60)}
     * @param systemNm The value of systemNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemNm_PrefixSearch(String systemNm) {
        setSystemNm_LikeSearch(systemNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSTEM_NM: {varchar(60)}
     */
    public void setSystemNm_IsNull() { regSystemNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYSTEM_NM: {varchar(60)}
     */
    public void setSystemNm_IsNullOrEmpty() { regSystemNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSTEM_NM: {varchar(60)}
     */
    public void setSystemNm_IsNotNull() { regSystemNm(CK_ISNN, DOBJ); }

    protected void regSystemNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSystemNm(), "SYSTEM_NM"); }
    protected abstract ConditionValue xgetCValueSystemNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneId The value of timeZoneId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_Equal(Long timeZoneId) {
        doSetTimeZoneId_Equal(timeZoneId);
    }

    protected void doSetTimeZoneId_Equal(Long timeZoneId) {
        regTimeZoneId(CK_EQ, timeZoneId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneId The value of timeZoneId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_NotEqual(Long timeZoneId) {
        doSetTimeZoneId_NotEqual(timeZoneId);
    }

    protected void doSetTimeZoneId_NotEqual(Long timeZoneId) {
        regTimeZoneId(CK_NES, timeZoneId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneId The value of timeZoneId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_GreaterThan(Long timeZoneId) {
        regTimeZoneId(CK_GT, timeZoneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneId The value of timeZoneId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_LessThan(Long timeZoneId) {
        regTimeZoneId(CK_LT, timeZoneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneId The value of timeZoneId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_GreaterEqual(Long timeZoneId) {
        regTimeZoneId(CK_GE, timeZoneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneId The value of timeZoneId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_LessEqual(Long timeZoneId) {
        regTimeZoneId(CK_LE, timeZoneId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param minNumber The min number of timeZoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of timeZoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTimeZoneId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTimeZoneId(), "TIME_ZONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneIdList The collection of timeZoneId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneId_InScope(Collection<Long> timeZoneIdList) {
        doSetTimeZoneId_InScope(timeZoneIdList);
    }

    protected void doSetTimeZoneId_InScope(Collection<Long> timeZoneIdList) {
        regINS(CK_INS, cTL(timeZoneIdList), xgetCValueTimeZoneId(), "TIME_ZONE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @param timeZoneIdList The collection of timeZoneId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneId_NotInScope(Collection<Long> timeZoneIdList) {
        doSetTimeZoneId_NotInScope(timeZoneIdList);
    }

    protected void doSetTimeZoneId_NotInScope(Collection<Long> timeZoneIdList) {
        regINS(CK_NINS, cTL(timeZoneIdList), xgetCValueTimeZoneId(), "TIME_ZONE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TIME_ZONE_ID from B_TIME_ZONE where ...)} <br />
     * B_TIME_ZONE by my TIME_ZONE_ID, named 'BTimeZone'.
     * @param subCBLambda The callback for sub-query of BTimeZone for 'in-scope'. (NotNull)
     */
    public void inScopeBTimeZone(SubQuery<BTimeZoneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BTimeZoneCB cb = new BTimeZoneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTimeZoneId_InScopeRelation_BTimeZone(cb.query());
        registerInScopeRelation(cb.query(), "TIME_ZONE_ID", "TIME_ZONE_ID", pp, "bTimeZone", false);
    }
    public abstract String keepTimeZoneId_InScopeRelation_BTimeZone(BTimeZoneCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TIME_ZONE_ID from B_TIME_ZONE where ...)} <br />
     * B_TIME_ZONE by my TIME_ZONE_ID, named 'BTimeZone'.
     * @param subCBLambda The callback for sub-query of BTimeZone for 'not in-scope'. (NotNull)
     */
    public void notInScopeBTimeZone(SubQuery<BTimeZoneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BTimeZoneCB cb = new BTimeZoneCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTimeZoneId_NotInScopeRelation_BTimeZone(cb.query());
        registerInScopeRelation(cb.query(), "TIME_ZONE_ID", "TIME_ZONE_ID", pp, "bTimeZone", true);
    }
    public abstract String keepTimeZoneId_NotInScopeRelation_BTimeZone(BTimeZoneCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     */
    public void setTimeZoneId_IsNull() { regTimeZoneId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     */
    public void setTimeZoneId_IsNotNull() { regTimeZoneId(CK_ISNN, DOBJ); }

    protected void regTimeZoneId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimeZoneId(), "TIME_ZONE_ID"); }
    protected abstract ConditionValue xgetCValueTimeZoneId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {varchar(255)}
     * @param password The value of password as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_Equal(String password) {
        doSetPassword_Equal(fRES(password));
    }

    protected void doSetPassword_Equal(String password) {
        regPassword(CK_EQ, password);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {varchar(255)}
     * @param password The value of password as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotEqual(String password) {
        doSetPassword_NotEqual(fRES(password));
    }

    protected void doSetPassword_NotEqual(String password) {
        regPassword(CK_NES, password);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {varchar(255)}
     * @param password The value of password as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_GreaterThan(String password) {
        regPassword(CK_GT, fRES(password));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {varchar(255)}
     * @param password The value of password as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_LessThan(String password) {
        regPassword(CK_LT, fRES(password));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {varchar(255)}
     * @param password The value of password as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_GreaterEqual(String password) {
        regPassword(CK_GE, fRES(password));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {varchar(255)}
     * @param password The value of password as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_LessEqual(String password) {
        regPassword(CK_LE, fRES(password));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD: {varchar(255)}
     * @param passwordList The collection of password as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        doSetPassword_InScope(passwordList);
    }

    protected void doSetPassword_InScope(Collection<String> passwordList) {
        regINS(CK_INS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD: {varchar(255)}
     * @param passwordList The collection of password as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotInScope(Collection<String> passwordList) {
        doSetPassword_NotInScope(passwordList);
    }

    protected void doSetPassword_NotInScope(Collection<String> passwordList) {
        regINS(CK_NINS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {varchar(255)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {varchar(255)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPassword_NotLikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {varchar(255)}
     * @param password The value of password as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_PrefixSearch(String password) {
        setPassword_LikeSearch(password, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PASSWORD: {varchar(255)}
     */
    public void setPassword_IsNull() { regPassword(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PASSWORD: {varchar(255)}
     */
    public void setPassword_IsNullOrEmpty() { regPassword(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PASSWORD: {varchar(255)}
     */
    public void setPassword_IsNotNull() { regPassword(CK_ISNN, DOBJ); }

    protected void regPassword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePassword(), "PASSWORD"); }
    protected abstract ConditionValue xgetCValuePassword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALT: {varchar(100)}
     * @param salt The value of salt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalt_Equal(String salt) {
        doSetSalt_Equal(fRES(salt));
    }

    protected void doSetSalt_Equal(String salt) {
        regSalt(CK_EQ, salt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALT: {varchar(100)}
     * @param salt The value of salt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalt_NotEqual(String salt) {
        doSetSalt_NotEqual(fRES(salt));
    }

    protected void doSetSalt_NotEqual(String salt) {
        regSalt(CK_NES, salt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALT: {varchar(100)}
     * @param salt The value of salt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalt_GreaterThan(String salt) {
        regSalt(CK_GT, fRES(salt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALT: {varchar(100)}
     * @param salt The value of salt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalt_LessThan(String salt) {
        regSalt(CK_LT, fRES(salt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALT: {varchar(100)}
     * @param salt The value of salt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalt_GreaterEqual(String salt) {
        regSalt(CK_GE, fRES(salt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALT: {varchar(100)}
     * @param salt The value of salt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalt_LessEqual(String salt) {
        regSalt(CK_LE, fRES(salt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALT: {varchar(100)}
     * @param saltList The collection of salt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalt_InScope(Collection<String> saltList) {
        doSetSalt_InScope(saltList);
    }

    protected void doSetSalt_InScope(Collection<String> saltList) {
        regINS(CK_INS, cTL(saltList), xgetCValueSalt(), "SALT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALT: {varchar(100)}
     * @param saltList The collection of salt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalt_NotInScope(Collection<String> saltList) {
        doSetSalt_NotInScope(saltList);
    }

    protected void doSetSalt_NotInScope(Collection<String> saltList) {
        regINS(CK_NINS, cTL(saltList), xgetCValueSalt(), "SALT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALT: {varchar(100)} <br>
     * <pre>e.g. setSalt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salt The value of salt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalt_LikeSearch(String salt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salt), xgetCValueSalt(), "SALT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALT: {varchar(100)}
     * @param salt The value of salt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalt_NotLikeSearch(String salt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salt), xgetCValueSalt(), "SALT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALT: {varchar(100)}
     * @param salt The value of salt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalt_PrefixSearch(String salt) {
        setSalt_LikeSearch(salt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALT: {varchar(100)}
     */
    public void setSalt_IsNull() { regSalt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALT: {varchar(100)}
     */
    public void setSalt_IsNullOrEmpty() { regSalt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALT: {varchar(100)}
     */
    public void setSalt_IsNotNull() { regSalt(CK_ISNN, DOBJ); }

    protected void regSalt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalt(), "SALT"); }
    protected abstract ConditionValue xgetCValueSalt();

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
    public HpSLCFunction<BSystemCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BSystemCB.class);
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
    public HpSLCFunction<BSystemCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BSystemCB.class);
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
    public HpSLCFunction<BSystemCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BSystemCB.class);
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
    public HpSLCFunction<BSystemCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BSystemCB.class);
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
    public HpSLCFunction<BSystemCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BSystemCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BSystemCB&gt;() {
     *     public void query(BSystemCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BSystemCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BSystemCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BSystemCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BSystemCQ sq);

    protected BSystemCB xcreateScalarConditionCB() {
        BSystemCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BSystemCB xcreateScalarConditionPartitionByCB() {
        BSystemCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BSystemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BSystemCB cb = new BSystemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SYSTEM_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BSystemCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BSystemCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BSystemCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BSystemCB cb = new BSystemCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SYSTEM_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BSystemCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BSystemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BSystemCB cb = new BSystemCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BSystemCQ sq);

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
    protected BSystemCB newMyCB() {
        return new BSystemCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BSystemCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of B_USER_AUTH.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBUserAuthCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBUserAuthCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_USER_AUTH";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, NotNull, bigint(19), FK to B_USER}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Long userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Long userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, NotNull, bigint(19), FK to B_USER}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Long userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Long userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, NotNull, bigint(19), FK to B_USER}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Long userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, NotNull, bigint(19), FK to B_USER}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Long userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, NotNull, bigint(19), FK to B_USER}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Long userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, NotNull, bigint(19), FK to B_USER}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Long userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, NotNull, bigint(19), FK to B_USER}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {PK, NotNull, bigint(19), FK to B_USER}
     * @param userIdList The collection of userId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_InScope(Collection<Long> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Long> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {PK, NotNull, bigint(19), FK to B_USER}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Long> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Long> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select USER_ID from B_USER where ...)} <br />
     * B_USER by my USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'in-scope'. (NotNull)
     */
    public void inScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepUserId_InScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "USER_ID", "USER_ID", pp, "bUser", false);
    }
    public abstract String keepUserId_InScopeRelation_BUser(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select USER_ID from B_USER where ...)} <br />
     * B_USER by my USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepUserId_NotInScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "USER_ID", "USER_ID", pp, "bUser", true);
    }
    public abstract String keepUserId_NotInScopeRelation_BUser(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_ID: {PK, NotNull, bigint(19), FK to B_USER}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_ID: {PK, NotNull, bigint(19), FK to B_USER}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

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
     * SALT: {UQ, NotNull, varchar(100)}
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
     * SALT: {UQ, NotNull, varchar(100)}
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
     * SALT: {UQ, NotNull, varchar(100)}
     * @param salt The value of salt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalt_GreaterThan(String salt) {
        regSalt(CK_GT, fRES(salt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALT: {UQ, NotNull, varchar(100)}
     * @param salt The value of salt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalt_LessThan(String salt) {
        regSalt(CK_LT, fRES(salt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALT: {UQ, NotNull, varchar(100)}
     * @param salt The value of salt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalt_GreaterEqual(String salt) {
        regSalt(CK_GE, fRES(salt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALT: {UQ, NotNull, varchar(100)}
     * @param salt The value of salt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalt_LessEqual(String salt) {
        regSalt(CK_LE, fRES(salt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALT: {UQ, NotNull, varchar(100)}
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
     * SALT: {UQ, NotNull, varchar(100)}
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
     * SALT: {UQ, NotNull, varchar(100)} <br>
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
     * SALT: {UQ, NotNull, varchar(100)}
     * @param salt The value of salt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalt_NotLikeSearch(String salt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salt), xgetCValueSalt(), "SALT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALT: {UQ, NotNull, varchar(100)}
     * @param salt The value of salt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalt_PrefixSearch(String salt) {
        setSalt_LikeSearch(salt, xcLSOPPre());
    }

    protected void regSalt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalt(), "SALT"); }
    protected abstract ConditionValue xgetCValueSalt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset}
     * @param passwordReset The value of passwordReset as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordReset_Equal(String passwordReset) {
        doSetPasswordReset_Equal(fRES(passwordReset));
    }

    /**
     * Equal(=). As PasswordReset. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset} <br>
     * パスワードリセット
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPasswordReset_Equal_AsPasswordReset(CDef.PasswordReset cdef) {
        doSetPasswordReset_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 強制しない
     */
    public void setPasswordReset_Equal_$0() {
        setPasswordReset_Equal_AsPasswordReset(CDef.PasswordReset.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 強制する
     */
    public void setPasswordReset_Equal_$1() {
        setPasswordReset_Equal_AsPasswordReset(CDef.PasswordReset.$1);
    }

    protected void doSetPasswordReset_Equal(String passwordReset) {
        regPasswordReset(CK_EQ, passwordReset);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset}
     * @param passwordReset The value of passwordReset as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordReset_NotEqual(String passwordReset) {
        doSetPasswordReset_NotEqual(fRES(passwordReset));
    }

    /**
     * NotEqual(&lt;&gt;). As PasswordReset. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset} <br>
     * パスワードリセット
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPasswordReset_NotEqual_AsPasswordReset(CDef.PasswordReset cdef) {
        doSetPasswordReset_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 強制しない
     */
    public void setPasswordReset_NotEqual_$0() {
        setPasswordReset_NotEqual_AsPasswordReset(CDef.PasswordReset.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 強制する
     */
    public void setPasswordReset_NotEqual_$1() {
        setPasswordReset_NotEqual_AsPasswordReset(CDef.PasswordReset.$1);
    }

    protected void doSetPasswordReset_NotEqual(String passwordReset) {
        regPasswordReset(CK_NES, passwordReset);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset}
     * @param passwordResetList The collection of passwordReset as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordReset_InScope(Collection<String> passwordResetList) {
        doSetPasswordReset_InScope(passwordResetList);
    }

    /**
     * InScope {in ('a', 'b')}. As PasswordReset. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset} <br>
     * パスワードリセット
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordReset_InScope_AsPasswordReset(Collection<CDef.PasswordReset> cdefList) {
        doSetPasswordReset_InScope(cTStrL(cdefList));
    }

    protected void doSetPasswordReset_InScope(Collection<String> passwordResetList) {
        regINS(CK_INS, cTL(passwordResetList), xgetCValuePasswordReset(), "PASSWORD_RESET");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset}
     * @param passwordResetList The collection of passwordReset as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordReset_NotInScope(Collection<String> passwordResetList) {
        doSetPasswordReset_NotInScope(passwordResetList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PasswordReset. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset} <br>
     * パスワードリセット
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordReset_NotInScope_AsPasswordReset(Collection<CDef.PasswordReset> cdefList) {
        doSetPasswordReset_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPasswordReset_NotInScope(Collection<String> passwordResetList) {
        regINS(CK_NINS, cTL(passwordResetList), xgetCValuePasswordReset(), "PASSWORD_RESET");
    }

    protected void regPasswordReset(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePasswordReset(), "PASSWORD_RESET"); }
    protected abstract ConditionValue xgetCValuePasswordReset();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_MODIFIED_DATE: {datetime2(26, 6)}
     * @param passwordModifiedDate The value of passwordModifiedDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPasswordModifiedDate_Equal(java.sql.Timestamp passwordModifiedDate) {
        regPasswordModifiedDate(CK_EQ,  passwordModifiedDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_MODIFIED_DATE: {datetime2(26, 6)}
     * @param passwordModifiedDate The value of passwordModifiedDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPasswordModifiedDate_GreaterThan(java.sql.Timestamp passwordModifiedDate) {
        regPasswordModifiedDate(CK_GT,  passwordModifiedDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_MODIFIED_DATE: {datetime2(26, 6)}
     * @param passwordModifiedDate The value of passwordModifiedDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPasswordModifiedDate_LessThan(java.sql.Timestamp passwordModifiedDate) {
        regPasswordModifiedDate(CK_LT,  passwordModifiedDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_MODIFIED_DATE: {datetime2(26, 6)}
     * @param passwordModifiedDate The value of passwordModifiedDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPasswordModifiedDate_GreaterEqual(java.sql.Timestamp passwordModifiedDate) {
        regPasswordModifiedDate(CK_GE,  passwordModifiedDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_MODIFIED_DATE: {datetime2(26, 6)}
     * @param passwordModifiedDate The value of passwordModifiedDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPasswordModifiedDate_LessEqual(java.sql.Timestamp passwordModifiedDate) {
        regPasswordModifiedDate(CK_LE, passwordModifiedDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_MODIFIED_DATE: {datetime2(26, 6)}
     * <pre>e.g. setPasswordModifiedDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of passwordModifiedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of passwordModifiedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPasswordModifiedDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePasswordModifiedDate(), "PASSWORD_MODIFIED_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_MODIFIED_DATE: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of passwordModifiedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of passwordModifiedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPasswordModifiedDate_DateFromTo(Date fromDate, Date toDate) {
        setPasswordModifiedDate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PASSWORD_MODIFIED_DATE: {datetime2(26, 6)}
     */
    public void setPasswordModifiedDate_IsNull() { regPasswordModifiedDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PASSWORD_MODIFIED_DATE: {datetime2(26, 6)}
     */
    public void setPasswordModifiedDate_IsNotNull() { regPasswordModifiedDate(CK_ISNN, DOBJ); }

    protected void regPasswordModifiedDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePasswordModifiedDate(), "PASSWORD_MODIFIED_DATE"); }
    protected abstract ConditionValue xgetCValuePasswordModifiedDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_LOGIN_DATE: {datetime2(26, 6)}
     * @param lastLoginDate The value of lastLoginDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastLoginDate_Equal(java.sql.Timestamp lastLoginDate) {
        regLastLoginDate(CK_EQ,  lastLoginDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_LOGIN_DATE: {datetime2(26, 6)}
     * @param lastLoginDate The value of lastLoginDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastLoginDate_GreaterThan(java.sql.Timestamp lastLoginDate) {
        regLastLoginDate(CK_GT,  lastLoginDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_LOGIN_DATE: {datetime2(26, 6)}
     * @param lastLoginDate The value of lastLoginDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastLoginDate_LessThan(java.sql.Timestamp lastLoginDate) {
        regLastLoginDate(CK_LT,  lastLoginDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_LOGIN_DATE: {datetime2(26, 6)}
     * @param lastLoginDate The value of lastLoginDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastLoginDate_GreaterEqual(java.sql.Timestamp lastLoginDate) {
        regLastLoginDate(CK_GE,  lastLoginDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_LOGIN_DATE: {datetime2(26, 6)}
     * @param lastLoginDate The value of lastLoginDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastLoginDate_LessEqual(java.sql.Timestamp lastLoginDate) {
        regLastLoginDate(CK_LE, lastLoginDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_LOGIN_DATE: {datetime2(26, 6)}
     * <pre>e.g. setLastLoginDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastLoginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastLoginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLastLoginDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueLastLoginDate(), "LAST_LOGIN_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_LOGIN_DATE: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of lastLoginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of lastLoginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setLastLoginDate_DateFromTo(Date fromDate, Date toDate) {
        setLastLoginDate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LAST_LOGIN_DATE: {datetime2(26, 6)}
     */
    public void setLastLoginDate_IsNull() { regLastLoginDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LAST_LOGIN_DATE: {datetime2(26, 6)}
     */
    public void setLastLoginDate_IsNotNull() { regLastLoginDate(CK_ISNN, DOBJ); }

    protected void regLastLoginDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastLoginDate(), "LAST_LOGIN_DATE"); }
    protected abstract ConditionValue xgetCValueLastLoginDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)}
     * @param lastFailedLoginDate The value of lastFailedLoginDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastFailedLoginDate_Equal(java.sql.Timestamp lastFailedLoginDate) {
        regLastFailedLoginDate(CK_EQ,  lastFailedLoginDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)}
     * @param lastFailedLoginDate The value of lastFailedLoginDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastFailedLoginDate_GreaterThan(java.sql.Timestamp lastFailedLoginDate) {
        regLastFailedLoginDate(CK_GT,  lastFailedLoginDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)}
     * @param lastFailedLoginDate The value of lastFailedLoginDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastFailedLoginDate_LessThan(java.sql.Timestamp lastFailedLoginDate) {
        regLastFailedLoginDate(CK_LT,  lastFailedLoginDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)}
     * @param lastFailedLoginDate The value of lastFailedLoginDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastFailedLoginDate_GreaterEqual(java.sql.Timestamp lastFailedLoginDate) {
        regLastFailedLoginDate(CK_GE,  lastFailedLoginDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)}
     * @param lastFailedLoginDate The value of lastFailedLoginDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastFailedLoginDate_LessEqual(java.sql.Timestamp lastFailedLoginDate) {
        regLastFailedLoginDate(CK_LE, lastFailedLoginDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)}
     * <pre>e.g. setLastFailedLoginDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastFailedLoginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastFailedLoginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLastFailedLoginDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueLastFailedLoginDate(), "LAST_FAILED_LOGIN_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of lastFailedLoginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of lastFailedLoginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setLastFailedLoginDate_DateFromTo(Date fromDate, Date toDate) {
        setLastFailedLoginDate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)}
     */
    public void setLastFailedLoginDate_IsNull() { regLastFailedLoginDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)}
     */
    public void setLastFailedLoginDate_IsNotNull() { regLastFailedLoginDate(CK_ISNN, DOBJ); }

    protected void regLastFailedLoginDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastFailedLoginDate(), "LAST_FAILED_LOGIN_DATE"); }
    protected abstract ConditionValue xgetCValueLastFailedLoginDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]}
     * @param failedLoginAttempts The value of failedLoginAttempts as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFailedLoginAttempts_Equal(Long failedLoginAttempts) {
        doSetFailedLoginAttempts_Equal(failedLoginAttempts);
    }

    protected void doSetFailedLoginAttempts_Equal(Long failedLoginAttempts) {
        regFailedLoginAttempts(CK_EQ, failedLoginAttempts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]}
     * @param failedLoginAttempts The value of failedLoginAttempts as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFailedLoginAttempts_NotEqual(Long failedLoginAttempts) {
        doSetFailedLoginAttempts_NotEqual(failedLoginAttempts);
    }

    protected void doSetFailedLoginAttempts_NotEqual(Long failedLoginAttempts) {
        regFailedLoginAttempts(CK_NES, failedLoginAttempts);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]}
     * @param failedLoginAttempts The value of failedLoginAttempts as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFailedLoginAttempts_GreaterThan(Long failedLoginAttempts) {
        regFailedLoginAttempts(CK_GT, failedLoginAttempts);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]}
     * @param failedLoginAttempts The value of failedLoginAttempts as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFailedLoginAttempts_LessThan(Long failedLoginAttempts) {
        regFailedLoginAttempts(CK_LT, failedLoginAttempts);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]}
     * @param failedLoginAttempts The value of failedLoginAttempts as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFailedLoginAttempts_GreaterEqual(Long failedLoginAttempts) {
        regFailedLoginAttempts(CK_GE, failedLoginAttempts);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]}
     * @param failedLoginAttempts The value of failedLoginAttempts as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFailedLoginAttempts_LessEqual(Long failedLoginAttempts) {
        regFailedLoginAttempts(CK_LE, failedLoginAttempts);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of failedLoginAttempts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of failedLoginAttempts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFailedLoginAttempts_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFailedLoginAttempts(), "FAILED_LOGIN_ATTEMPTS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]}
     * @param failedLoginAttemptsList The collection of failedLoginAttempts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFailedLoginAttempts_InScope(Collection<Long> failedLoginAttemptsList) {
        doSetFailedLoginAttempts_InScope(failedLoginAttemptsList);
    }

    protected void doSetFailedLoginAttempts_InScope(Collection<Long> failedLoginAttemptsList) {
        regINS(CK_INS, cTL(failedLoginAttemptsList), xgetCValueFailedLoginAttempts(), "FAILED_LOGIN_ATTEMPTS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]}
     * @param failedLoginAttemptsList The collection of failedLoginAttempts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFailedLoginAttempts_NotInScope(Collection<Long> failedLoginAttemptsList) {
        doSetFailedLoginAttempts_NotInScope(failedLoginAttemptsList);
    }

    protected void doSetFailedLoginAttempts_NotInScope(Collection<Long> failedLoginAttemptsList) {
        regINS(CK_NINS, cTL(failedLoginAttemptsList), xgetCValueFailedLoginAttempts(), "FAILED_LOGIN_ATTEMPTS");
    }

    protected void regFailedLoginAttempts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFailedLoginAttempts(), "FAILED_LOGIN_ATTEMPTS"); }
    protected abstract ConditionValue xgetCValueFailedLoginAttempts();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout}
     * @param lockout The value of lockout as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockout_Equal(String lockout) {
        doSetLockout_Equal(fRES(lockout));
    }

    /**
     * Equal(=). As Lockout. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout} <br>
     * ロックアウト
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLockout_Equal_AsLockout(CDef.Lockout cdef) {
        doSetLockout_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: アンロック
     */
    public void setLockout_Equal_$0() {
        setLockout_Equal_AsLockout(CDef.Lockout.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: ロックアウト
     */
    public void setLockout_Equal_$1() {
        setLockout_Equal_AsLockout(CDef.Lockout.$1);
    }

    protected void doSetLockout_Equal(String lockout) {
        regLockout(CK_EQ, lockout);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout}
     * @param lockout The value of lockout as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockout_NotEqual(String lockout) {
        doSetLockout_NotEqual(fRES(lockout));
    }

    /**
     * NotEqual(&lt;&gt;). As Lockout. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout} <br>
     * ロックアウト
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLockout_NotEqual_AsLockout(CDef.Lockout cdef) {
        doSetLockout_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: アンロック
     */
    public void setLockout_NotEqual_$0() {
        setLockout_NotEqual_AsLockout(CDef.Lockout.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: ロックアウト
     */
    public void setLockout_NotEqual_$1() {
        setLockout_NotEqual_AsLockout(CDef.Lockout.$1);
    }

    protected void doSetLockout_NotEqual(String lockout) {
        regLockout(CK_NES, lockout);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout}
     * @param lockoutList The collection of lockout as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockout_InScope(Collection<String> lockoutList) {
        doSetLockout_InScope(lockoutList);
    }

    /**
     * InScope {in ('a', 'b')}. As Lockout. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout} <br>
     * ロックアウト
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockout_InScope_AsLockout(Collection<CDef.Lockout> cdefList) {
        doSetLockout_InScope(cTStrL(cdefList));
    }

    protected void doSetLockout_InScope(Collection<String> lockoutList) {
        regINS(CK_INS, cTL(lockoutList), xgetCValueLockout(), "LOCKOUT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout}
     * @param lockoutList The collection of lockout as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockout_NotInScope(Collection<String> lockoutList) {
        doSetLockout_NotInScope(lockoutList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Lockout. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout} <br>
     * ロックアウト
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLockout_NotInScope_AsLockout(Collection<CDef.Lockout> cdefList) {
        doSetLockout_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLockout_NotInScope(Collection<String> lockoutList) {
        regINS(CK_NINS, cTL(lockoutList), xgetCValueLockout(), "LOCKOUT");
    }

    protected void regLockout(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLockout(), "LOCKOUT"); }
    protected abstract ConditionValue xgetCValueLockout();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCKOUT_DATE: {datetime2(26, 6)}
     * @param lockoutDate The value of lockoutDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLockoutDate_Equal(java.sql.Timestamp lockoutDate) {
        regLockoutDate(CK_EQ,  lockoutDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCKOUT_DATE: {datetime2(26, 6)}
     * @param lockoutDate The value of lockoutDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLockoutDate_GreaterThan(java.sql.Timestamp lockoutDate) {
        regLockoutDate(CK_GT,  lockoutDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCKOUT_DATE: {datetime2(26, 6)}
     * @param lockoutDate The value of lockoutDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLockoutDate_LessThan(java.sql.Timestamp lockoutDate) {
        regLockoutDate(CK_LT,  lockoutDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCKOUT_DATE: {datetime2(26, 6)}
     * @param lockoutDate The value of lockoutDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLockoutDate_GreaterEqual(java.sql.Timestamp lockoutDate) {
        regLockoutDate(CK_GE,  lockoutDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCKOUT_DATE: {datetime2(26, 6)}
     * @param lockoutDate The value of lockoutDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLockoutDate_LessEqual(java.sql.Timestamp lockoutDate) {
        regLockoutDate(CK_LE, lockoutDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCKOUT_DATE: {datetime2(26, 6)}
     * <pre>e.g. setLockoutDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lockoutDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lockoutDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLockoutDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueLockoutDate(), "LOCKOUT_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCKOUT_DATE: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of lockoutDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of lockoutDate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setLockoutDate_DateFromTo(Date fromDate, Date toDate) {
        setLockoutDate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCKOUT_DATE: {datetime2(26, 6)}
     */
    public void setLockoutDate_IsNull() { regLockoutDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCKOUT_DATE: {datetime2(26, 6)}
     */
    public void setLockoutDate_IsNotNull() { regLockoutDate(CK_ISNN, DOBJ); }

    protected void regLockoutDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLockoutDate(), "LOCKOUT_DATE"); }
    protected abstract ConditionValue xgetCValueLockoutDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)}
     * @param availableStartDate The value of availableStartDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAvailableStartDate_Equal(java.sql.Timestamp availableStartDate) {
        regAvailableStartDate(CK_EQ,  availableStartDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)}
     * @param availableStartDate The value of availableStartDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAvailableStartDate_GreaterThan(java.sql.Timestamp availableStartDate) {
        regAvailableStartDate(CK_GT,  availableStartDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)}
     * @param availableStartDate The value of availableStartDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAvailableStartDate_LessThan(java.sql.Timestamp availableStartDate) {
        regAvailableStartDate(CK_LT,  availableStartDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)}
     * @param availableStartDate The value of availableStartDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAvailableStartDate_GreaterEqual(java.sql.Timestamp availableStartDate) {
        regAvailableStartDate(CK_GE,  availableStartDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)}
     * @param availableStartDate The value of availableStartDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAvailableStartDate_LessEqual(java.sql.Timestamp availableStartDate) {
        regAvailableStartDate(CK_LE, availableStartDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)}
     * <pre>e.g. setAvailableStartDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of availableStartDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of availableStartDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setAvailableStartDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueAvailableStartDate(), "AVAILABLE_START_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of availableStartDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of availableStartDate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setAvailableStartDate_DateFromTo(Date fromDate, Date toDate) {
        setAvailableStartDate_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regAvailableStartDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAvailableStartDate(), "AVAILABLE_START_DATE"); }
    protected abstract ConditionValue xgetCValueAvailableStartDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)}
     * @param availableEndDate The value of availableEndDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAvailableEndDate_Equal(java.sql.Timestamp availableEndDate) {
        regAvailableEndDate(CK_EQ,  availableEndDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)}
     * @param availableEndDate The value of availableEndDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAvailableEndDate_GreaterThan(java.sql.Timestamp availableEndDate) {
        regAvailableEndDate(CK_GT,  availableEndDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)}
     * @param availableEndDate The value of availableEndDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAvailableEndDate_LessThan(java.sql.Timestamp availableEndDate) {
        regAvailableEndDate(CK_LT,  availableEndDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)}
     * @param availableEndDate The value of availableEndDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAvailableEndDate_GreaterEqual(java.sql.Timestamp availableEndDate) {
        regAvailableEndDate(CK_GE,  availableEndDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)}
     * @param availableEndDate The value of availableEndDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAvailableEndDate_LessEqual(java.sql.Timestamp availableEndDate) {
        regAvailableEndDate(CK_LE, availableEndDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)}
     * <pre>e.g. setAvailableEndDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of availableEndDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of availableEndDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setAvailableEndDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueAvailableEndDate(), "AVAILABLE_END_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of availableEndDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of availableEndDate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setAvailableEndDate_DateFromTo(Date fromDate, Date toDate) {
        setAvailableEndDate_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regAvailableEndDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAvailableEndDate(), "AVAILABLE_END_DATE"); }
    protected abstract ConditionValue xgetCValueAvailableEndDate();

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
    public HpSLCFunction<BUserAuthCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BUserAuthCB.class);
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
    public HpSLCFunction<BUserAuthCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BUserAuthCB.class);
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
    public HpSLCFunction<BUserAuthCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BUserAuthCB.class);
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
    public HpSLCFunction<BUserAuthCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BUserAuthCB.class);
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
    public HpSLCFunction<BUserAuthCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BUserAuthCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BUserAuthCB&gt;() {
     *     public void query(BUserAuthCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BUserAuthCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BUserAuthCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BUserAuthCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BUserAuthCQ sq);

    protected BUserAuthCB xcreateScalarConditionCB() {
        BUserAuthCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BUserAuthCB xcreateScalarConditionPartitionByCB() {
        BUserAuthCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BUserAuthCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BUserAuthCB cb = new BUserAuthCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "USER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BUserAuthCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BUserAuthCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BUserAuthCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BUserAuthCB cb = new BUserAuthCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "USER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BUserAuthCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BUserAuthCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserAuthCB cb = new BUserAuthCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BUserAuthCQ sq);

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
    protected BUserAuthCB newMyCB() {
        return new BUserAuthCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BUserAuthCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

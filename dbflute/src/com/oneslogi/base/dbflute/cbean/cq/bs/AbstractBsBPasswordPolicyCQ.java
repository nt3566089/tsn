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
 * The abstract condition-query of B_PASSWORD_POLICY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBPasswordPolicyCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBPasswordPolicyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_PASSWORD_POLICY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param passwordPolicyId The value of passwordPolicyId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPasswordPolicyId_Equal(Long passwordPolicyId) {
        doSetPasswordPolicyId_Equal(passwordPolicyId);
    }

    protected void doSetPasswordPolicyId_Equal(Long passwordPolicyId) {
        regPasswordPolicyId(CK_EQ, passwordPolicyId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param passwordPolicyId The value of passwordPolicyId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPasswordPolicyId_NotEqual(Long passwordPolicyId) {
        doSetPasswordPolicyId_NotEqual(passwordPolicyId);
    }

    protected void doSetPasswordPolicyId_NotEqual(Long passwordPolicyId) {
        regPasswordPolicyId(CK_NES, passwordPolicyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param passwordPolicyId The value of passwordPolicyId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPasswordPolicyId_GreaterThan(Long passwordPolicyId) {
        regPasswordPolicyId(CK_GT, passwordPolicyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param passwordPolicyId The value of passwordPolicyId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPasswordPolicyId_LessThan(Long passwordPolicyId) {
        regPasswordPolicyId(CK_LT, passwordPolicyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param passwordPolicyId The value of passwordPolicyId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPasswordPolicyId_GreaterEqual(Long passwordPolicyId) {
        regPasswordPolicyId(CK_GE, passwordPolicyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param passwordPolicyId The value of passwordPolicyId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPasswordPolicyId_LessEqual(Long passwordPolicyId) {
        regPasswordPolicyId(CK_LE, passwordPolicyId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of passwordPolicyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of passwordPolicyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPasswordPolicyId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePasswordPolicyId(), "PASSWORD_POLICY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param passwordPolicyIdList The collection of passwordPolicyId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordPolicyId_InScope(Collection<Long> passwordPolicyIdList) {
        doSetPasswordPolicyId_InScope(passwordPolicyIdList);
    }

    protected void doSetPasswordPolicyId_InScope(Collection<Long> passwordPolicyIdList) {
        regINS(CK_INS, cTL(passwordPolicyIdList), xgetCValuePasswordPolicyId(), "PASSWORD_POLICY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param passwordPolicyIdList The collection of passwordPolicyId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordPolicyId_NotInScope(Collection<Long> passwordPolicyIdList) {
        doSetPasswordPolicyId_NotInScope(passwordPolicyIdList);
    }

    protected void doSetPasswordPolicyId_NotInScope(Collection<Long> passwordPolicyIdList) {
        regINS(CK_NINS, cTL(passwordPolicyIdList), xgetCValuePasswordPolicyId(), "PASSWORD_POLICY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPasswordPolicyId_IsNull() { regPasswordPolicyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPasswordPolicyId_IsNotNull() { regPasswordPolicyId(CK_ISNN, DOBJ); }

    protected void regPasswordPolicyId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePasswordPolicyId(), "PASSWORD_POLICY_ID"); }
    protected abstract ConditionValue xgetCValuePasswordPolicyId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)}
     * @param passwordPolicyNm The value of passwordPolicyNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordPolicyNm_Equal(String passwordPolicyNm) {
        doSetPasswordPolicyNm_Equal(fRES(passwordPolicyNm));
    }

    protected void doSetPasswordPolicyNm_Equal(String passwordPolicyNm) {
        regPasswordPolicyNm(CK_EQ, passwordPolicyNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)}
     * @param passwordPolicyNm The value of passwordPolicyNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordPolicyNm_NotEqual(String passwordPolicyNm) {
        doSetPasswordPolicyNm_NotEqual(fRES(passwordPolicyNm));
    }

    protected void doSetPasswordPolicyNm_NotEqual(String passwordPolicyNm) {
        regPasswordPolicyNm(CK_NES, passwordPolicyNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)}
     * @param passwordPolicyNm The value of passwordPolicyNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordPolicyNm_GreaterThan(String passwordPolicyNm) {
        regPasswordPolicyNm(CK_GT, fRES(passwordPolicyNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)}
     * @param passwordPolicyNm The value of passwordPolicyNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordPolicyNm_LessThan(String passwordPolicyNm) {
        regPasswordPolicyNm(CK_LT, fRES(passwordPolicyNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)}
     * @param passwordPolicyNm The value of passwordPolicyNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordPolicyNm_GreaterEqual(String passwordPolicyNm) {
        regPasswordPolicyNm(CK_GE, fRES(passwordPolicyNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)}
     * @param passwordPolicyNm The value of passwordPolicyNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordPolicyNm_LessEqual(String passwordPolicyNm) {
        regPasswordPolicyNm(CK_LE, fRES(passwordPolicyNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)}
     * @param passwordPolicyNmList The collection of passwordPolicyNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordPolicyNm_InScope(Collection<String> passwordPolicyNmList) {
        doSetPasswordPolicyNm_InScope(passwordPolicyNmList);
    }

    protected void doSetPasswordPolicyNm_InScope(Collection<String> passwordPolicyNmList) {
        regINS(CK_INS, cTL(passwordPolicyNmList), xgetCValuePasswordPolicyNm(), "PASSWORD_POLICY_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)}
     * @param passwordPolicyNmList The collection of passwordPolicyNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordPolicyNm_NotInScope(Collection<String> passwordPolicyNmList) {
        doSetPasswordPolicyNm_NotInScope(passwordPolicyNmList);
    }

    protected void doSetPasswordPolicyNm_NotInScope(Collection<String> passwordPolicyNmList) {
        regINS(CK_NINS, cTL(passwordPolicyNmList), xgetCValuePasswordPolicyNm(), "PASSWORD_POLICY_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)} <br>
     * <pre>e.g. setPasswordPolicyNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param passwordPolicyNm The value of passwordPolicyNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPasswordPolicyNm_LikeSearch(String passwordPolicyNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(passwordPolicyNm), xgetCValuePasswordPolicyNm(), "PASSWORD_POLICY_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)}
     * @param passwordPolicyNm The value of passwordPolicyNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPasswordPolicyNm_NotLikeSearch(String passwordPolicyNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(passwordPolicyNm), xgetCValuePasswordPolicyNm(), "PASSWORD_POLICY_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)}
     * @param passwordPolicyNm The value of passwordPolicyNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPasswordPolicyNm_PrefixSearch(String passwordPolicyNm) {
        setPasswordPolicyNm_LikeSearch(passwordPolicyNm, xcLSOPPre());
    }

    protected void regPasswordPolicyNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePasswordPolicyNm(), "PASSWORD_POLICY_NM"); }
    protected abstract ConditionValue xgetCValuePasswordPolicyNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]}
     * @param firstChangeControl The value of firstChangeControl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstChangeControl_Equal(String firstChangeControl) {
        doSetFirstChangeControl_Equal(fRES(firstChangeControl));
    }

    protected void doSetFirstChangeControl_Equal(String firstChangeControl) {
        regFirstChangeControl(CK_EQ, firstChangeControl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]}
     * @param firstChangeControl The value of firstChangeControl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstChangeControl_NotEqual(String firstChangeControl) {
        doSetFirstChangeControl_NotEqual(fRES(firstChangeControl));
    }

    protected void doSetFirstChangeControl_NotEqual(String firstChangeControl) {
        regFirstChangeControl(CK_NES, firstChangeControl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]}
     * @param firstChangeControl The value of firstChangeControl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstChangeControl_GreaterThan(String firstChangeControl) {
        regFirstChangeControl(CK_GT, fRES(firstChangeControl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]}
     * @param firstChangeControl The value of firstChangeControl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstChangeControl_LessThan(String firstChangeControl) {
        regFirstChangeControl(CK_LT, fRES(firstChangeControl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]}
     * @param firstChangeControl The value of firstChangeControl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstChangeControl_GreaterEqual(String firstChangeControl) {
        regFirstChangeControl(CK_GE, fRES(firstChangeControl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]}
     * @param firstChangeControl The value of firstChangeControl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstChangeControl_LessEqual(String firstChangeControl) {
        regFirstChangeControl(CK_LE, fRES(firstChangeControl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]}
     * @param firstChangeControlList The collection of firstChangeControl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstChangeControl_InScope(Collection<String> firstChangeControlList) {
        doSetFirstChangeControl_InScope(firstChangeControlList);
    }

    protected void doSetFirstChangeControl_InScope(Collection<String> firstChangeControlList) {
        regINS(CK_INS, cTL(firstChangeControlList), xgetCValueFirstChangeControl(), "FIRST_CHANGE_CONTROL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]}
     * @param firstChangeControlList The collection of firstChangeControl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstChangeControl_NotInScope(Collection<String> firstChangeControlList) {
        doSetFirstChangeControl_NotInScope(firstChangeControlList);
    }

    protected void doSetFirstChangeControl_NotInScope(Collection<String> firstChangeControlList) {
        regINS(CK_NINS, cTL(firstChangeControlList), xgetCValueFirstChangeControl(), "FIRST_CHANGE_CONTROL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]} <br>
     * <pre>e.g. setFirstChangeControl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firstChangeControl The value of firstChangeControl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirstChangeControl_LikeSearch(String firstChangeControl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firstChangeControl), xgetCValueFirstChangeControl(), "FIRST_CHANGE_CONTROL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]}
     * @param firstChangeControl The value of firstChangeControl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirstChangeControl_NotLikeSearch(String firstChangeControl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firstChangeControl), xgetCValueFirstChangeControl(), "FIRST_CHANGE_CONTROL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]}
     * @param firstChangeControl The value of firstChangeControl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstChangeControl_PrefixSearch(String firstChangeControl) {
        setFirstChangeControl_LikeSearch(firstChangeControl, xcLSOPPre());
    }

    protected void regFirstChangeControl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstChangeControl(), "FIRST_CHANGE_CONTROL"); }
    protected abstract ConditionValue xgetCValueFirstChangeControl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_LENGTH: {NotNull, bigint(19), default=[(0)]}
     * @param minLength The value of minLength as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinLength_Equal(Long minLength) {
        doSetMinLength_Equal(minLength);
    }

    protected void doSetMinLength_Equal(Long minLength) {
        regMinLength(CK_EQ, minLength);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_LENGTH: {NotNull, bigint(19), default=[(0)]}
     * @param minLength The value of minLength as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinLength_NotEqual(Long minLength) {
        doSetMinLength_NotEqual(minLength);
    }

    protected void doSetMinLength_NotEqual(Long minLength) {
        regMinLength(CK_NES, minLength);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_LENGTH: {NotNull, bigint(19), default=[(0)]}
     * @param minLength The value of minLength as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinLength_GreaterThan(Long minLength) {
        regMinLength(CK_GT, minLength);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_LENGTH: {NotNull, bigint(19), default=[(0)]}
     * @param minLength The value of minLength as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinLength_LessThan(Long minLength) {
        regMinLength(CK_LT, minLength);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_LENGTH: {NotNull, bigint(19), default=[(0)]}
     * @param minLength The value of minLength as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinLength_GreaterEqual(Long minLength) {
        regMinLength(CK_GE, minLength);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_LENGTH: {NotNull, bigint(19), default=[(0)]}
     * @param minLength The value of minLength as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinLength_LessEqual(Long minLength) {
        regMinLength(CK_LE, minLength);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_LENGTH: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of minLength. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of minLength. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMinLength_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMinLength(), "MIN_LENGTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_LENGTH: {NotNull, bigint(19), default=[(0)]}
     * @param minLengthList The collection of minLength as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinLength_InScope(Collection<Long> minLengthList) {
        doSetMinLength_InScope(minLengthList);
    }

    protected void doSetMinLength_InScope(Collection<Long> minLengthList) {
        regINS(CK_INS, cTL(minLengthList), xgetCValueMinLength(), "MIN_LENGTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_LENGTH: {NotNull, bigint(19), default=[(0)]}
     * @param minLengthList The collection of minLength as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinLength_NotInScope(Collection<Long> minLengthList) {
        doSetMinLength_NotInScope(minLengthList);
    }

    protected void doSetMinLength_NotInScope(Collection<Long> minLengthList) {
        regINS(CK_NINS, cTL(minLengthList), xgetCValueMinLength(), "MIN_LENGTH");
    }

    protected void regMinLength(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMinLength(), "MIN_LENGTH"); }
    protected abstract ConditionValue xgetCValueMinLength();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_ALPHA: {NotNull, bigint(19), default=[(0)]}
     * @param minAlpha The value of minAlpha as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinAlpha_Equal(Long minAlpha) {
        doSetMinAlpha_Equal(minAlpha);
    }

    protected void doSetMinAlpha_Equal(Long minAlpha) {
        regMinAlpha(CK_EQ, minAlpha);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_ALPHA: {NotNull, bigint(19), default=[(0)]}
     * @param minAlpha The value of minAlpha as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinAlpha_NotEqual(Long minAlpha) {
        doSetMinAlpha_NotEqual(minAlpha);
    }

    protected void doSetMinAlpha_NotEqual(Long minAlpha) {
        regMinAlpha(CK_NES, minAlpha);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_ALPHA: {NotNull, bigint(19), default=[(0)]}
     * @param minAlpha The value of minAlpha as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinAlpha_GreaterThan(Long minAlpha) {
        regMinAlpha(CK_GT, minAlpha);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_ALPHA: {NotNull, bigint(19), default=[(0)]}
     * @param minAlpha The value of minAlpha as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinAlpha_LessThan(Long minAlpha) {
        regMinAlpha(CK_LT, minAlpha);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_ALPHA: {NotNull, bigint(19), default=[(0)]}
     * @param minAlpha The value of minAlpha as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinAlpha_GreaterEqual(Long minAlpha) {
        regMinAlpha(CK_GE, minAlpha);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_ALPHA: {NotNull, bigint(19), default=[(0)]}
     * @param minAlpha The value of minAlpha as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinAlpha_LessEqual(Long minAlpha) {
        regMinAlpha(CK_LE, minAlpha);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_ALPHA: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of minAlpha. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of minAlpha. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMinAlpha_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMinAlpha(), "MIN_ALPHA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_ALPHA: {NotNull, bigint(19), default=[(0)]}
     * @param minAlphaList The collection of minAlpha as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinAlpha_InScope(Collection<Long> minAlphaList) {
        doSetMinAlpha_InScope(minAlphaList);
    }

    protected void doSetMinAlpha_InScope(Collection<Long> minAlphaList) {
        regINS(CK_INS, cTL(minAlphaList), xgetCValueMinAlpha(), "MIN_ALPHA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_ALPHA: {NotNull, bigint(19), default=[(0)]}
     * @param minAlphaList The collection of minAlpha as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinAlpha_NotInScope(Collection<Long> minAlphaList) {
        doSetMinAlpha_NotInScope(minAlphaList);
    }

    protected void doSetMinAlpha_NotInScope(Collection<Long> minAlphaList) {
        regINS(CK_NINS, cTL(minAlphaList), xgetCValueMinAlpha(), "MIN_ALPHA");
    }

    protected void regMinAlpha(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMinAlpha(), "MIN_ALPHA"); }
    protected abstract ConditionValue xgetCValueMinAlpha();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minLowerCase The value of minLowerCase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinLowerCase_Equal(Long minLowerCase) {
        doSetMinLowerCase_Equal(minLowerCase);
    }

    protected void doSetMinLowerCase_Equal(Long minLowerCase) {
        regMinLowerCase(CK_EQ, minLowerCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minLowerCase The value of minLowerCase as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinLowerCase_NotEqual(Long minLowerCase) {
        doSetMinLowerCase_NotEqual(minLowerCase);
    }

    protected void doSetMinLowerCase_NotEqual(Long minLowerCase) {
        regMinLowerCase(CK_NES, minLowerCase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minLowerCase The value of minLowerCase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinLowerCase_GreaterThan(Long minLowerCase) {
        regMinLowerCase(CK_GT, minLowerCase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minLowerCase The value of minLowerCase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinLowerCase_LessThan(Long minLowerCase) {
        regMinLowerCase(CK_LT, minLowerCase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minLowerCase The value of minLowerCase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinLowerCase_GreaterEqual(Long minLowerCase) {
        regMinLowerCase(CK_GE, minLowerCase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minLowerCase The value of minLowerCase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinLowerCase_LessEqual(Long minLowerCase) {
        regMinLowerCase(CK_LE, minLowerCase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of minLowerCase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of minLowerCase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMinLowerCase_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMinLowerCase(), "MIN_LOWER_CASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minLowerCaseList The collection of minLowerCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinLowerCase_InScope(Collection<Long> minLowerCaseList) {
        doSetMinLowerCase_InScope(minLowerCaseList);
    }

    protected void doSetMinLowerCase_InScope(Collection<Long> minLowerCaseList) {
        regINS(CK_INS, cTL(minLowerCaseList), xgetCValueMinLowerCase(), "MIN_LOWER_CASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minLowerCaseList The collection of minLowerCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinLowerCase_NotInScope(Collection<Long> minLowerCaseList) {
        doSetMinLowerCase_NotInScope(minLowerCaseList);
    }

    protected void doSetMinLowerCase_NotInScope(Collection<Long> minLowerCaseList) {
        regINS(CK_NINS, cTL(minLowerCaseList), xgetCValueMinLowerCase(), "MIN_LOWER_CASE");
    }

    protected void regMinLowerCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMinLowerCase(), "MIN_LOWER_CASE"); }
    protected abstract ConditionValue xgetCValueMinLowerCase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minUpperCase The value of minUpperCase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinUpperCase_Equal(Long minUpperCase) {
        doSetMinUpperCase_Equal(minUpperCase);
    }

    protected void doSetMinUpperCase_Equal(Long minUpperCase) {
        regMinUpperCase(CK_EQ, minUpperCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minUpperCase The value of minUpperCase as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinUpperCase_NotEqual(Long minUpperCase) {
        doSetMinUpperCase_NotEqual(minUpperCase);
    }

    protected void doSetMinUpperCase_NotEqual(Long minUpperCase) {
        regMinUpperCase(CK_NES, minUpperCase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minUpperCase The value of minUpperCase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinUpperCase_GreaterThan(Long minUpperCase) {
        regMinUpperCase(CK_GT, minUpperCase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minUpperCase The value of minUpperCase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinUpperCase_LessThan(Long minUpperCase) {
        regMinUpperCase(CK_LT, minUpperCase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minUpperCase The value of minUpperCase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinUpperCase_GreaterEqual(Long minUpperCase) {
        regMinUpperCase(CK_GE, minUpperCase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minUpperCase The value of minUpperCase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinUpperCase_LessEqual(Long minUpperCase) {
        regMinUpperCase(CK_LE, minUpperCase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of minUpperCase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of minUpperCase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMinUpperCase_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMinUpperCase(), "MIN_UPPER_CASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minUpperCaseList The collection of minUpperCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinUpperCase_InScope(Collection<Long> minUpperCaseList) {
        doSetMinUpperCase_InScope(minUpperCaseList);
    }

    protected void doSetMinUpperCase_InScope(Collection<Long> minUpperCaseList) {
        regINS(CK_INS, cTL(minUpperCaseList), xgetCValueMinUpperCase(), "MIN_UPPER_CASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]}
     * @param minUpperCaseList The collection of minUpperCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinUpperCase_NotInScope(Collection<Long> minUpperCaseList) {
        doSetMinUpperCase_NotInScope(minUpperCaseList);
    }

    protected void doSetMinUpperCase_NotInScope(Collection<Long> minUpperCaseList) {
        regINS(CK_NINS, cTL(minUpperCaseList), xgetCValueMinUpperCase(), "MIN_UPPER_CASE");
    }

    protected void regMinUpperCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMinUpperCase(), "MIN_UPPER_CASE"); }
    protected abstract ConditionValue xgetCValueMinUpperCase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]}
     * @param minNumbers The value of minNumbers as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumbers_Equal(Long minNumbers) {
        doSetMinNumbers_Equal(minNumbers);
    }

    protected void doSetMinNumbers_Equal(Long minNumbers) {
        regMinNumbers(CK_EQ, minNumbers);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]}
     * @param minNumbers The value of minNumbers as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumbers_NotEqual(Long minNumbers) {
        doSetMinNumbers_NotEqual(minNumbers);
    }

    protected void doSetMinNumbers_NotEqual(Long minNumbers) {
        regMinNumbers(CK_NES, minNumbers);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]}
     * @param minNumbers The value of minNumbers as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumbers_GreaterThan(Long minNumbers) {
        regMinNumbers(CK_GT, minNumbers);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]}
     * @param minNumbers The value of minNumbers as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumbers_LessThan(Long minNumbers) {
        regMinNumbers(CK_LT, minNumbers);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]}
     * @param minNumbers The value of minNumbers as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumbers_GreaterEqual(Long minNumbers) {
        regMinNumbers(CK_GE, minNumbers);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]}
     * @param minNumbers The value of minNumbers as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinNumbers_LessEqual(Long minNumbers) {
        regMinNumbers(CK_LE, minNumbers);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of minNumbers. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of minNumbers. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMinNumbers_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMinNumbers(), "MIN_NUMBERS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]}
     * @param minNumbersList The collection of minNumbers as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinNumbers_InScope(Collection<Long> minNumbersList) {
        doSetMinNumbers_InScope(minNumbersList);
    }

    protected void doSetMinNumbers_InScope(Collection<Long> minNumbersList) {
        regINS(CK_INS, cTL(minNumbersList), xgetCValueMinNumbers(), "MIN_NUMBERS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]}
     * @param minNumbersList The collection of minNumbers as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinNumbers_NotInScope(Collection<Long> minNumbersList) {
        doSetMinNumbers_NotInScope(minNumbersList);
    }

    protected void doSetMinNumbers_NotInScope(Collection<Long> minNumbersList) {
        regINS(CK_NINS, cTL(minNumbersList), xgetCValueMinNumbers(), "MIN_NUMBERS");
    }

    protected void regMinNumbers(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMinNumbers(), "MIN_NUMBERS"); }
    protected abstract ConditionValue xgetCValueMinNumbers();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]}
     * @param minSymbol The value of minSymbol as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinSymbol_Equal(Long minSymbol) {
        doSetMinSymbol_Equal(minSymbol);
    }

    protected void doSetMinSymbol_Equal(Long minSymbol) {
        regMinSymbol(CK_EQ, minSymbol);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]}
     * @param minSymbol The value of minSymbol as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinSymbol_NotEqual(Long minSymbol) {
        doSetMinSymbol_NotEqual(minSymbol);
    }

    protected void doSetMinSymbol_NotEqual(Long minSymbol) {
        regMinSymbol(CK_NES, minSymbol);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]}
     * @param minSymbol The value of minSymbol as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinSymbol_GreaterThan(Long minSymbol) {
        regMinSymbol(CK_GT, minSymbol);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]}
     * @param minSymbol The value of minSymbol as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinSymbol_LessThan(Long minSymbol) {
        regMinSymbol(CK_LT, minSymbol);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]}
     * @param minSymbol The value of minSymbol as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinSymbol_GreaterEqual(Long minSymbol) {
        regMinSymbol(CK_GE, minSymbol);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]}
     * @param minSymbol The value of minSymbol as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMinSymbol_LessEqual(Long minSymbol) {
        regMinSymbol(CK_LE, minSymbol);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of minSymbol. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of minSymbol. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMinSymbol_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMinSymbol(), "MIN_SYMBOL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]}
     * @param minSymbolList The collection of minSymbol as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinSymbol_InScope(Collection<Long> minSymbolList) {
        doSetMinSymbol_InScope(minSymbolList);
    }

    protected void doSetMinSymbol_InScope(Collection<Long> minSymbolList) {
        regINS(CK_INS, cTL(minSymbolList), xgetCValueMinSymbol(), "MIN_SYMBOL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]}
     * @param minSymbolList The collection of minSymbol as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMinSymbol_NotInScope(Collection<Long> minSymbolList) {
        doSetMinSymbol_NotInScope(minSymbolList);
    }

    protected void doSetMinSymbol_NotInScope(Collection<Long> minSymbolList) {
        regINS(CK_NINS, cTL(minSymbolList), xgetCValueMinSymbol(), "MIN_SYMBOL");
    }

    protected void regMinSymbol(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMinSymbol(), "MIN_SYMBOL"); }
    protected abstract ConditionValue xgetCValueMinSymbol();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_AGE: {NotNull, bigint(19), default=[(0)]}
     * @param maxAge The value of maxAge as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxAge_Equal(Long maxAge) {
        doSetMaxAge_Equal(maxAge);
    }

    protected void doSetMaxAge_Equal(Long maxAge) {
        regMaxAge(CK_EQ, maxAge);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_AGE: {NotNull, bigint(19), default=[(0)]}
     * @param maxAge The value of maxAge as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxAge_NotEqual(Long maxAge) {
        doSetMaxAge_NotEqual(maxAge);
    }

    protected void doSetMaxAge_NotEqual(Long maxAge) {
        regMaxAge(CK_NES, maxAge);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_AGE: {NotNull, bigint(19), default=[(0)]}
     * @param maxAge The value of maxAge as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxAge_GreaterThan(Long maxAge) {
        regMaxAge(CK_GT, maxAge);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_AGE: {NotNull, bigint(19), default=[(0)]}
     * @param maxAge The value of maxAge as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxAge_LessThan(Long maxAge) {
        regMaxAge(CK_LT, maxAge);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_AGE: {NotNull, bigint(19), default=[(0)]}
     * @param maxAge The value of maxAge as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxAge_GreaterEqual(Long maxAge) {
        regMaxAge(CK_GE, maxAge);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_AGE: {NotNull, bigint(19), default=[(0)]}
     * @param maxAge The value of maxAge as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxAge_LessEqual(Long maxAge) {
        regMaxAge(CK_LE, maxAge);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_AGE: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of maxAge. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of maxAge. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMaxAge_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMaxAge(), "MAX_AGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_AGE: {NotNull, bigint(19), default=[(0)]}
     * @param maxAgeList The collection of maxAge as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxAge_InScope(Collection<Long> maxAgeList) {
        doSetMaxAge_InScope(maxAgeList);
    }

    protected void doSetMaxAge_InScope(Collection<Long> maxAgeList) {
        regINS(CK_INS, cTL(maxAgeList), xgetCValueMaxAge(), "MAX_AGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_AGE: {NotNull, bigint(19), default=[(0)]}
     * @param maxAgeList The collection of maxAge as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxAge_NotInScope(Collection<Long> maxAgeList) {
        doSetMaxAge_NotInScope(maxAgeList);
    }

    protected void doSetMaxAge_NotInScope(Collection<Long> maxAgeList) {
        regINS(CK_NINS, cTL(maxAgeList), xgetCValueMaxAge(), "MAX_AGE");
    }

    protected void regMaxAge(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxAge(), "MAX_AGE"); }
    protected abstract ConditionValue xgetCValueMaxAge();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_FAILURE: {NotNull, bigint(19), default=[(0)]}
     * @param maxFailure The value of maxFailure as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxFailure_Equal(Long maxFailure) {
        doSetMaxFailure_Equal(maxFailure);
    }

    protected void doSetMaxFailure_Equal(Long maxFailure) {
        regMaxFailure(CK_EQ, maxFailure);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_FAILURE: {NotNull, bigint(19), default=[(0)]}
     * @param maxFailure The value of maxFailure as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxFailure_NotEqual(Long maxFailure) {
        doSetMaxFailure_NotEqual(maxFailure);
    }

    protected void doSetMaxFailure_NotEqual(Long maxFailure) {
        regMaxFailure(CK_NES, maxFailure);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_FAILURE: {NotNull, bigint(19), default=[(0)]}
     * @param maxFailure The value of maxFailure as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxFailure_GreaterThan(Long maxFailure) {
        regMaxFailure(CK_GT, maxFailure);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_FAILURE: {NotNull, bigint(19), default=[(0)]}
     * @param maxFailure The value of maxFailure as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxFailure_LessThan(Long maxFailure) {
        regMaxFailure(CK_LT, maxFailure);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_FAILURE: {NotNull, bigint(19), default=[(0)]}
     * @param maxFailure The value of maxFailure as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxFailure_GreaterEqual(Long maxFailure) {
        regMaxFailure(CK_GE, maxFailure);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_FAILURE: {NotNull, bigint(19), default=[(0)]}
     * @param maxFailure The value of maxFailure as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxFailure_LessEqual(Long maxFailure) {
        regMaxFailure(CK_LE, maxFailure);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_FAILURE: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of maxFailure. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of maxFailure. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMaxFailure_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMaxFailure(), "MAX_FAILURE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_FAILURE: {NotNull, bigint(19), default=[(0)]}
     * @param maxFailureList The collection of maxFailure as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxFailure_InScope(Collection<Long> maxFailureList) {
        doSetMaxFailure_InScope(maxFailureList);
    }

    protected void doSetMaxFailure_InScope(Collection<Long> maxFailureList) {
        regINS(CK_INS, cTL(maxFailureList), xgetCValueMaxFailure(), "MAX_FAILURE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_FAILURE: {NotNull, bigint(19), default=[(0)]}
     * @param maxFailureList The collection of maxFailure as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxFailure_NotInScope(Collection<Long> maxFailureList) {
        doSetMaxFailure_NotInScope(maxFailureList);
    }

    protected void doSetMaxFailure_NotInScope(Collection<Long> maxFailureList) {
        regINS(CK_NINS, cTL(maxFailureList), xgetCValueMaxFailure(), "MAX_FAILURE");
    }

    protected void regMaxFailure(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxFailure(), "MAX_FAILURE"); }
    protected abstract ConditionValue xgetCValueMaxFailure();

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
    public HpSLCFunction<BPasswordPolicyCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BPasswordPolicyCB.class);
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
    public HpSLCFunction<BPasswordPolicyCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BPasswordPolicyCB.class);
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
    public HpSLCFunction<BPasswordPolicyCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BPasswordPolicyCB.class);
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
    public HpSLCFunction<BPasswordPolicyCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BPasswordPolicyCB.class);
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
    public HpSLCFunction<BPasswordPolicyCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BPasswordPolicyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BPasswordPolicyCB&gt;() {
     *     public void query(BPasswordPolicyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BPasswordPolicyCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BPasswordPolicyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BPasswordPolicyCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BPasswordPolicyCQ sq);

    protected BPasswordPolicyCB xcreateScalarConditionCB() {
        BPasswordPolicyCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BPasswordPolicyCB xcreateScalarConditionPartitionByCB() {
        BPasswordPolicyCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BPasswordPolicyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BPasswordPolicyCB cb = new BPasswordPolicyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PASSWORD_POLICY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BPasswordPolicyCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BPasswordPolicyCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BPasswordPolicyCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BPasswordPolicyCB cb = new BPasswordPolicyCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PASSWORD_POLICY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BPasswordPolicyCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BPasswordPolicyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BPasswordPolicyCB cb = new BPasswordPolicyCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BPasswordPolicyCQ sq);

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
    protected BPasswordPolicyCB newMyCB() {
        return new BPasswordPolicyCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BPasswordPolicyCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

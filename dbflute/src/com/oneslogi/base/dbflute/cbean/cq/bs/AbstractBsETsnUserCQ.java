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
 * The abstract condition-query of E_TSN_USER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsETsnUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsETsnUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_TSN_USER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnUserId The value of tsnUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnUserId_Equal(Long tsnUserId) {
        doSetTsnUserId_Equal(tsnUserId);
    }

    protected void doSetTsnUserId_Equal(Long tsnUserId) {
        regTsnUserId(CK_EQ, tsnUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnUserId The value of tsnUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnUserId_NotEqual(Long tsnUserId) {
        doSetTsnUserId_NotEqual(tsnUserId);
    }

    protected void doSetTsnUserId_NotEqual(Long tsnUserId) {
        regTsnUserId(CK_NES, tsnUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnUserId The value of tsnUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnUserId_GreaterThan(Long tsnUserId) {
        regTsnUserId(CK_GT, tsnUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnUserId The value of tsnUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnUserId_LessThan(Long tsnUserId) {
        regTsnUserId(CK_LT, tsnUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnUserId The value of tsnUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnUserId_GreaterEqual(Long tsnUserId) {
        regTsnUserId(CK_GE, tsnUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnUserId The value of tsnUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsnUserId_LessEqual(Long tsnUserId) {
        regTsnUserId(CK_LE, tsnUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TSN_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of tsnUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tsnUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTsnUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTsnUserId(), "TSN_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSN_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnUserIdList The collection of tsnUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnUserId_InScope(Collection<Long> tsnUserIdList) {
        doSetTsnUserId_InScope(tsnUserIdList);
    }

    protected void doSetTsnUserId_InScope(Collection<Long> tsnUserIdList) {
        regINS(CK_INS, cTL(tsnUserIdList), xgetCValueTsnUserId(), "TSN_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSN_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tsnUserIdList The collection of tsnUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnUserId_NotInScope(Collection<Long> tsnUserIdList) {
        doSetTsnUserId_NotInScope(tsnUserIdList);
    }

    protected void doSetTsnUserId_NotInScope(Collection<Long> tsnUserIdList) {
        regINS(CK_NINS, cTL(tsnUserIdList), xgetCValueTsnUserId(), "TSN_USER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSN_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTsnUserId_IsNull() { regTsnUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSN_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTsnUserId_IsNotNull() { regTsnUserId(CK_ISNN, DOBJ); }

    protected void regTsnUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTsnUserId(), "TSN_USER_ID"); }
    protected abstract ConditionValue xgetCValueTsnUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_Equal(String importFlg) {
        doSetImportFlg_Equal(fRES(importFlg));
    }

    protected void doSetImportFlg_Equal(String importFlg) {
        regImportFlg(CK_EQ, importFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotEqual(String importFlg) {
        doSetImportFlg_NotEqual(fRES(importFlg));
    }

    protected void doSetImportFlg_NotEqual(String importFlg) {
        regImportFlg(CK_NES, importFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterThan(String importFlg) {
        regImportFlg(CK_GT, fRES(importFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessThan(String importFlg) {
        regImportFlg(CK_LT, fRES(importFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterEqual(String importFlg) {
        regImportFlg(CK_GE, fRES(importFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessEqual(String importFlg) {
        regImportFlg(CK_LE, fRES(importFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlgList The collection of importFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_InScope(Collection<String> importFlgList) {
        doSetImportFlg_InScope(importFlgList);
    }

    protected void doSetImportFlg_InScope(Collection<String> importFlgList) {
        regINS(CK_INS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlgList The collection of importFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotInScope(Collection<String> importFlgList) {
        doSetImportFlg_NotInScope(importFlgList);
    }

    protected void doSetImportFlg_NotInScope(Collection<String> importFlgList) {
        regINS(CK_NINS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setImportFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param importFlg The value of importFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImportFlg_LikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImportFlg_NotLikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_PrefixSearch(String importFlg) {
        setImportFlg_LikeSearch(importFlg, xcLSOPPre());
    }

    protected void regImportFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportFlg(), "IMPORT_FLG"); }
    protected abstract ConditionValue xgetCValueImportFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMON_AUTH_ID: {char(1)}
     * @param commonAuthId The value of commonAuthId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonAuthId_Equal(String commonAuthId) {
        doSetCommonAuthId_Equal(fRES(commonAuthId));
    }

    protected void doSetCommonAuthId_Equal(String commonAuthId) {
        regCommonAuthId(CK_EQ, commonAuthId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMON_AUTH_ID: {char(1)}
     * @param commonAuthId The value of commonAuthId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonAuthId_NotEqual(String commonAuthId) {
        doSetCommonAuthId_NotEqual(fRES(commonAuthId));
    }

    protected void doSetCommonAuthId_NotEqual(String commonAuthId) {
        regCommonAuthId(CK_NES, commonAuthId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMON_AUTH_ID: {char(1)}
     * @param commonAuthId The value of commonAuthId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonAuthId_GreaterThan(String commonAuthId) {
        regCommonAuthId(CK_GT, fRES(commonAuthId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMON_AUTH_ID: {char(1)}
     * @param commonAuthId The value of commonAuthId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonAuthId_LessThan(String commonAuthId) {
        regCommonAuthId(CK_LT, fRES(commonAuthId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMON_AUTH_ID: {char(1)}
     * @param commonAuthId The value of commonAuthId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonAuthId_GreaterEqual(String commonAuthId) {
        regCommonAuthId(CK_GE, fRES(commonAuthId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMON_AUTH_ID: {char(1)}
     * @param commonAuthId The value of commonAuthId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonAuthId_LessEqual(String commonAuthId) {
        regCommonAuthId(CK_LE, fRES(commonAuthId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMON_AUTH_ID: {char(1)}
     * @param commonAuthIdList The collection of commonAuthId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonAuthId_InScope(Collection<String> commonAuthIdList) {
        doSetCommonAuthId_InScope(commonAuthIdList);
    }

    protected void doSetCommonAuthId_InScope(Collection<String> commonAuthIdList) {
        regINS(CK_INS, cTL(commonAuthIdList), xgetCValueCommonAuthId(), "COMMON_AUTH_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMMON_AUTH_ID: {char(1)}
     * @param commonAuthIdList The collection of commonAuthId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonAuthId_NotInScope(Collection<String> commonAuthIdList) {
        doSetCommonAuthId_NotInScope(commonAuthIdList);
    }

    protected void doSetCommonAuthId_NotInScope(Collection<String> commonAuthIdList) {
        regINS(CK_NINS, cTL(commonAuthIdList), xgetCValueCommonAuthId(), "COMMON_AUTH_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMON_AUTH_ID: {char(1)} <br>
     * <pre>e.g. setCommonAuthId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param commonAuthId The value of commonAuthId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCommonAuthId_LikeSearch(String commonAuthId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(commonAuthId), xgetCValueCommonAuthId(), "COMMON_AUTH_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMON_AUTH_ID: {char(1)}
     * @param commonAuthId The value of commonAuthId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCommonAuthId_NotLikeSearch(String commonAuthId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(commonAuthId), xgetCValueCommonAuthId(), "COMMON_AUTH_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMON_AUTH_ID: {char(1)}
     * @param commonAuthId The value of commonAuthId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonAuthId_PrefixSearch(String commonAuthId) {
        setCommonAuthId_LikeSearch(commonAuthId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMMON_AUTH_ID: {char(1)}
     */
    public void setCommonAuthId_IsNull() { regCommonAuthId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMMON_AUTH_ID: {char(1)}
     */
    public void setCommonAuthId_IsNotNull() { regCommonAuthId(CK_ISNN, DOBJ); }

    protected void regCommonAuthId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCommonAuthId(), "COMMON_AUTH_ID"); }
    protected abstract ConditionValue xgetCValueCommonAuthId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMPLOYEE_NO: {varchar(255)}
     * @param employeeNo The value of employeeNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmployeeNo_Equal(String employeeNo) {
        doSetEmployeeNo_Equal(fRES(employeeNo));
    }

    protected void doSetEmployeeNo_Equal(String employeeNo) {
        regEmployeeNo(CK_EQ, employeeNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMPLOYEE_NO: {varchar(255)}
     * @param employeeNo The value of employeeNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmployeeNo_NotEqual(String employeeNo) {
        doSetEmployeeNo_NotEqual(fRES(employeeNo));
    }

    protected void doSetEmployeeNo_NotEqual(String employeeNo) {
        regEmployeeNo(CK_NES, employeeNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMPLOYEE_NO: {varchar(255)}
     * @param employeeNo The value of employeeNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmployeeNo_GreaterThan(String employeeNo) {
        regEmployeeNo(CK_GT, fRES(employeeNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMPLOYEE_NO: {varchar(255)}
     * @param employeeNo The value of employeeNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmployeeNo_LessThan(String employeeNo) {
        regEmployeeNo(CK_LT, fRES(employeeNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMPLOYEE_NO: {varchar(255)}
     * @param employeeNo The value of employeeNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmployeeNo_GreaterEqual(String employeeNo) {
        regEmployeeNo(CK_GE, fRES(employeeNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMPLOYEE_NO: {varchar(255)}
     * @param employeeNo The value of employeeNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmployeeNo_LessEqual(String employeeNo) {
        regEmployeeNo(CK_LE, fRES(employeeNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMPLOYEE_NO: {varchar(255)}
     * @param employeeNoList The collection of employeeNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmployeeNo_InScope(Collection<String> employeeNoList) {
        doSetEmployeeNo_InScope(employeeNoList);
    }

    protected void doSetEmployeeNo_InScope(Collection<String> employeeNoList) {
        regINS(CK_INS, cTL(employeeNoList), xgetCValueEmployeeNo(), "EMPLOYEE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMPLOYEE_NO: {varchar(255)}
     * @param employeeNoList The collection of employeeNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmployeeNo_NotInScope(Collection<String> employeeNoList) {
        doSetEmployeeNo_NotInScope(employeeNoList);
    }

    protected void doSetEmployeeNo_NotInScope(Collection<String> employeeNoList) {
        regINS(CK_NINS, cTL(employeeNoList), xgetCValueEmployeeNo(), "EMPLOYEE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMPLOYEE_NO: {varchar(255)} <br>
     * <pre>e.g. setEmployeeNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param employeeNo The value of employeeNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEmployeeNo_LikeSearch(String employeeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(employeeNo), xgetCValueEmployeeNo(), "EMPLOYEE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMPLOYEE_NO: {varchar(255)}
     * @param employeeNo The value of employeeNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEmployeeNo_NotLikeSearch(String employeeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(employeeNo), xgetCValueEmployeeNo(), "EMPLOYEE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMPLOYEE_NO: {varchar(255)}
     * @param employeeNo The value of employeeNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmployeeNo_PrefixSearch(String employeeNo) {
        setEmployeeNo_LikeSearch(employeeNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EMPLOYEE_NO: {varchar(255)}
     */
    public void setEmployeeNo_IsNull() { regEmployeeNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EMPLOYEE_NO: {varchar(255)}
     */
    public void setEmployeeNo_IsNullOrEmpty() { regEmployeeNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EMPLOYEE_NO: {varchar(255)}
     */
    public void setEmployeeNo_IsNotNull() { regEmployeeNo(CK_ISNN, DOBJ); }

    protected void regEmployeeNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmployeeNo(), "EMPLOYEE_NO"); }
    protected abstract ConditionValue xgetCValueEmployeeNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_TYPE: {varchar(255)}
     * @param idType The value of idType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdType_Equal(String idType) {
        doSetIdType_Equal(fRES(idType));
    }

    protected void doSetIdType_Equal(String idType) {
        regIdType(CK_EQ, idType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_TYPE: {varchar(255)}
     * @param idType The value of idType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdType_NotEqual(String idType) {
        doSetIdType_NotEqual(fRES(idType));
    }

    protected void doSetIdType_NotEqual(String idType) {
        regIdType(CK_NES, idType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_TYPE: {varchar(255)}
     * @param idType The value of idType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdType_GreaterThan(String idType) {
        regIdType(CK_GT, fRES(idType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_TYPE: {varchar(255)}
     * @param idType The value of idType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdType_LessThan(String idType) {
        regIdType(CK_LT, fRES(idType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_TYPE: {varchar(255)}
     * @param idType The value of idType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdType_GreaterEqual(String idType) {
        regIdType(CK_GE, fRES(idType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ID_TYPE: {varchar(255)}
     * @param idType The value of idType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdType_LessEqual(String idType) {
        regIdType(CK_LE, fRES(idType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ID_TYPE: {varchar(255)}
     * @param idTypeList The collection of idType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdType_InScope(Collection<String> idTypeList) {
        doSetIdType_InScope(idTypeList);
    }

    protected void doSetIdType_InScope(Collection<String> idTypeList) {
        regINS(CK_INS, cTL(idTypeList), xgetCValueIdType(), "ID_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ID_TYPE: {varchar(255)}
     * @param idTypeList The collection of idType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdType_NotInScope(Collection<String> idTypeList) {
        doSetIdType_NotInScope(idTypeList);
    }

    protected void doSetIdType_NotInScope(Collection<String> idTypeList) {
        regINS(CK_NINS, cTL(idTypeList), xgetCValueIdType(), "ID_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ID_TYPE: {varchar(255)} <br>
     * <pre>e.g. setIdType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param idType The value of idType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIdType_LikeSearch(String idType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(idType), xgetCValueIdType(), "ID_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ID_TYPE: {varchar(255)}
     * @param idType The value of idType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIdType_NotLikeSearch(String idType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(idType), xgetCValueIdType(), "ID_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ID_TYPE: {varchar(255)}
     * @param idType The value of idType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIdType_PrefixSearch(String idType) {
        setIdType_LikeSearch(idType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ID_TYPE: {varchar(255)}
     */
    public void setIdType_IsNull() { regIdType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ID_TYPE: {varchar(255)}
     */
    public void setIdType_IsNullOrEmpty() { regIdType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ID_TYPE: {varchar(255)}
     */
    public void setIdType_IsNotNull() { regIdType(CK_ISNN, DOBJ); }

    protected void regIdType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIdType(), "ID_TYPE"); }
    protected abstract ConditionValue xgetCValueIdType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENROLLMENT_STATUS: {varchar(255)}
     * @param enrollmentStatus The value of enrollmentStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnrollmentStatus_Equal(String enrollmentStatus) {
        doSetEnrollmentStatus_Equal(fRES(enrollmentStatus));
    }

    protected void doSetEnrollmentStatus_Equal(String enrollmentStatus) {
        regEnrollmentStatus(CK_EQ, enrollmentStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENROLLMENT_STATUS: {varchar(255)}
     * @param enrollmentStatus The value of enrollmentStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnrollmentStatus_NotEqual(String enrollmentStatus) {
        doSetEnrollmentStatus_NotEqual(fRES(enrollmentStatus));
    }

    protected void doSetEnrollmentStatus_NotEqual(String enrollmentStatus) {
        regEnrollmentStatus(CK_NES, enrollmentStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENROLLMENT_STATUS: {varchar(255)}
     * @param enrollmentStatus The value of enrollmentStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnrollmentStatus_GreaterThan(String enrollmentStatus) {
        regEnrollmentStatus(CK_GT, fRES(enrollmentStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENROLLMENT_STATUS: {varchar(255)}
     * @param enrollmentStatus The value of enrollmentStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnrollmentStatus_LessThan(String enrollmentStatus) {
        regEnrollmentStatus(CK_LT, fRES(enrollmentStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENROLLMENT_STATUS: {varchar(255)}
     * @param enrollmentStatus The value of enrollmentStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnrollmentStatus_GreaterEqual(String enrollmentStatus) {
        regEnrollmentStatus(CK_GE, fRES(enrollmentStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENROLLMENT_STATUS: {varchar(255)}
     * @param enrollmentStatus The value of enrollmentStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnrollmentStatus_LessEqual(String enrollmentStatus) {
        regEnrollmentStatus(CK_LE, fRES(enrollmentStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ENROLLMENT_STATUS: {varchar(255)}
     * @param enrollmentStatusList The collection of enrollmentStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnrollmentStatus_InScope(Collection<String> enrollmentStatusList) {
        doSetEnrollmentStatus_InScope(enrollmentStatusList);
    }

    protected void doSetEnrollmentStatus_InScope(Collection<String> enrollmentStatusList) {
        regINS(CK_INS, cTL(enrollmentStatusList), xgetCValueEnrollmentStatus(), "ENROLLMENT_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ENROLLMENT_STATUS: {varchar(255)}
     * @param enrollmentStatusList The collection of enrollmentStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnrollmentStatus_NotInScope(Collection<String> enrollmentStatusList) {
        doSetEnrollmentStatus_NotInScope(enrollmentStatusList);
    }

    protected void doSetEnrollmentStatus_NotInScope(Collection<String> enrollmentStatusList) {
        regINS(CK_NINS, cTL(enrollmentStatusList), xgetCValueEnrollmentStatus(), "ENROLLMENT_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENROLLMENT_STATUS: {varchar(255)} <br>
     * <pre>e.g. setEnrollmentStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param enrollmentStatus The value of enrollmentStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEnrollmentStatus_LikeSearch(String enrollmentStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(enrollmentStatus), xgetCValueEnrollmentStatus(), "ENROLLMENT_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENROLLMENT_STATUS: {varchar(255)}
     * @param enrollmentStatus The value of enrollmentStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEnrollmentStatus_NotLikeSearch(String enrollmentStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(enrollmentStatus), xgetCValueEnrollmentStatus(), "ENROLLMENT_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENROLLMENT_STATUS: {varchar(255)}
     * @param enrollmentStatus The value of enrollmentStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEnrollmentStatus_PrefixSearch(String enrollmentStatus) {
        setEnrollmentStatus_LikeSearch(enrollmentStatus, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ENROLLMENT_STATUS: {varchar(255)}
     */
    public void setEnrollmentStatus_IsNull() { regEnrollmentStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ENROLLMENT_STATUS: {varchar(255)}
     */
    public void setEnrollmentStatus_IsNullOrEmpty() { regEnrollmentStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ENROLLMENT_STATUS: {varchar(255)}
     */
    public void setEnrollmentStatus_IsNotNull() { regEnrollmentStatus(CK_ISNN, DOBJ); }

    protected void regEnrollmentStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEnrollmentStatus(), "ENROLLMENT_STATUS"); }
    protected abstract ConditionValue xgetCValueEnrollmentStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME: {varchar(255)}
     * @param lastName The value of lastName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_Equal(String lastName) {
        doSetLastName_Equal(fRES(lastName));
    }

    protected void doSetLastName_Equal(String lastName) {
        regLastName(CK_EQ, lastName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME: {varchar(255)}
     * @param lastName The value of lastName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_NotEqual(String lastName) {
        doSetLastName_NotEqual(fRES(lastName));
    }

    protected void doSetLastName_NotEqual(String lastName) {
        regLastName(CK_NES, lastName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME: {varchar(255)}
     * @param lastName The value of lastName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_GreaterThan(String lastName) {
        regLastName(CK_GT, fRES(lastName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME: {varchar(255)}
     * @param lastName The value of lastName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_LessThan(String lastName) {
        regLastName(CK_LT, fRES(lastName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME: {varchar(255)}
     * @param lastName The value of lastName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_GreaterEqual(String lastName) {
        regLastName(CK_GE, fRES(lastName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME: {varchar(255)}
     * @param lastName The value of lastName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_LessEqual(String lastName) {
        regLastName(CK_LE, fRES(lastName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAST_NAME: {varchar(255)}
     * @param lastNameList The collection of lastName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_InScope(Collection<String> lastNameList) {
        doSetLastName_InScope(lastNameList);
    }

    protected void doSetLastName_InScope(Collection<String> lastNameList) {
        regINS(CK_INS, cTL(lastNameList), xgetCValueLastName(), "LAST_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAST_NAME: {varchar(255)}
     * @param lastNameList The collection of lastName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_NotInScope(Collection<String> lastNameList) {
        doSetLastName_NotInScope(lastNameList);
    }

    protected void doSetLastName_NotInScope(Collection<String> lastNameList) {
        regINS(CK_NINS, cTL(lastNameList), xgetCValueLastName(), "LAST_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_NAME: {varchar(255)} <br>
     * <pre>e.g. setLastName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lastName The value of lastName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLastName_LikeSearch(String lastName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lastName), xgetCValueLastName(), "LAST_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_NAME: {varchar(255)}
     * @param lastName The value of lastName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLastName_NotLikeSearch(String lastName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lastName), xgetCValueLastName(), "LAST_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_NAME: {varchar(255)}
     * @param lastName The value of lastName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_PrefixSearch(String lastName) {
        setLastName_LikeSearch(lastName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LAST_NAME: {varchar(255)}
     */
    public void setLastName_IsNull() { regLastName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LAST_NAME: {varchar(255)}
     */
    public void setLastName_IsNullOrEmpty() { regLastName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LAST_NAME: {varchar(255)}
     */
    public void setLastName_IsNotNull() { regLastName(CK_ISNN, DOBJ); }

    protected void regLastName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastName(), "LAST_NAME"); }
    protected abstract ConditionValue xgetCValueLastName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME: {varchar(255)}
     * @param firstName The value of firstName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_Equal(String firstName) {
        doSetFirstName_Equal(fRES(firstName));
    }

    protected void doSetFirstName_Equal(String firstName) {
        regFirstName(CK_EQ, firstName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME: {varchar(255)}
     * @param firstName The value of firstName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_NotEqual(String firstName) {
        doSetFirstName_NotEqual(fRES(firstName));
    }

    protected void doSetFirstName_NotEqual(String firstName) {
        regFirstName(CK_NES, firstName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME: {varchar(255)}
     * @param firstName The value of firstName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_GreaterThan(String firstName) {
        regFirstName(CK_GT, fRES(firstName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME: {varchar(255)}
     * @param firstName The value of firstName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_LessThan(String firstName) {
        regFirstName(CK_LT, fRES(firstName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME: {varchar(255)}
     * @param firstName The value of firstName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_GreaterEqual(String firstName) {
        regFirstName(CK_GE, fRES(firstName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME: {varchar(255)}
     * @param firstName The value of firstName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_LessEqual(String firstName) {
        regFirstName(CK_LE, fRES(firstName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRST_NAME: {varchar(255)}
     * @param firstNameList The collection of firstName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_InScope(Collection<String> firstNameList) {
        doSetFirstName_InScope(firstNameList);
    }

    protected void doSetFirstName_InScope(Collection<String> firstNameList) {
        regINS(CK_INS, cTL(firstNameList), xgetCValueFirstName(), "FIRST_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRST_NAME: {varchar(255)}
     * @param firstNameList The collection of firstName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_NotInScope(Collection<String> firstNameList) {
        doSetFirstName_NotInScope(firstNameList);
    }

    protected void doSetFirstName_NotInScope(Collection<String> firstNameList) {
        regINS(CK_NINS, cTL(firstNameList), xgetCValueFirstName(), "FIRST_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_NAME: {varchar(255)} <br>
     * <pre>e.g. setFirstName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firstName The value of firstName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirstName_LikeSearch(String firstName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firstName), xgetCValueFirstName(), "FIRST_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_NAME: {varchar(255)}
     * @param firstName The value of firstName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirstName_NotLikeSearch(String firstName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firstName), xgetCValueFirstName(), "FIRST_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_NAME: {varchar(255)}
     * @param firstName The value of firstName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_PrefixSearch(String firstName) {
        setFirstName_LikeSearch(firstName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRST_NAME: {varchar(255)}
     */
    public void setFirstName_IsNull() { regFirstName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FIRST_NAME: {varchar(255)}
     */
    public void setFirstName_IsNullOrEmpty() { regFirstName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRST_NAME: {varchar(255)}
     */
    public void setFirstName_IsNotNull() { regFirstName(CK_ISNN, DOBJ); }

    protected void regFirstName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstName(), "FIRST_NAME"); }
    protected abstract ConditionValue xgetCValueFirstName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME_KANA: {varchar(255)}
     * @param lastNameKana The value of lastNameKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastNameKana_Equal(String lastNameKana) {
        doSetLastNameKana_Equal(fRES(lastNameKana));
    }

    protected void doSetLastNameKana_Equal(String lastNameKana) {
        regLastNameKana(CK_EQ, lastNameKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME_KANA: {varchar(255)}
     * @param lastNameKana The value of lastNameKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastNameKana_NotEqual(String lastNameKana) {
        doSetLastNameKana_NotEqual(fRES(lastNameKana));
    }

    protected void doSetLastNameKana_NotEqual(String lastNameKana) {
        regLastNameKana(CK_NES, lastNameKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME_KANA: {varchar(255)}
     * @param lastNameKana The value of lastNameKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastNameKana_GreaterThan(String lastNameKana) {
        regLastNameKana(CK_GT, fRES(lastNameKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME_KANA: {varchar(255)}
     * @param lastNameKana The value of lastNameKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastNameKana_LessThan(String lastNameKana) {
        regLastNameKana(CK_LT, fRES(lastNameKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME_KANA: {varchar(255)}
     * @param lastNameKana The value of lastNameKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastNameKana_GreaterEqual(String lastNameKana) {
        regLastNameKana(CK_GE, fRES(lastNameKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAST_NAME_KANA: {varchar(255)}
     * @param lastNameKana The value of lastNameKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastNameKana_LessEqual(String lastNameKana) {
        regLastNameKana(CK_LE, fRES(lastNameKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAST_NAME_KANA: {varchar(255)}
     * @param lastNameKanaList The collection of lastNameKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastNameKana_InScope(Collection<String> lastNameKanaList) {
        doSetLastNameKana_InScope(lastNameKanaList);
    }

    protected void doSetLastNameKana_InScope(Collection<String> lastNameKanaList) {
        regINS(CK_INS, cTL(lastNameKanaList), xgetCValueLastNameKana(), "LAST_NAME_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LAST_NAME_KANA: {varchar(255)}
     * @param lastNameKanaList The collection of lastNameKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastNameKana_NotInScope(Collection<String> lastNameKanaList) {
        doSetLastNameKana_NotInScope(lastNameKanaList);
    }

    protected void doSetLastNameKana_NotInScope(Collection<String> lastNameKanaList) {
        regINS(CK_NINS, cTL(lastNameKanaList), xgetCValueLastNameKana(), "LAST_NAME_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_NAME_KANA: {varchar(255)} <br>
     * <pre>e.g. setLastNameKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lastNameKana The value of lastNameKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLastNameKana_LikeSearch(String lastNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lastNameKana), xgetCValueLastNameKana(), "LAST_NAME_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_NAME_KANA: {varchar(255)}
     * @param lastNameKana The value of lastNameKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLastNameKana_NotLikeSearch(String lastNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lastNameKana), xgetCValueLastNameKana(), "LAST_NAME_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAST_NAME_KANA: {varchar(255)}
     * @param lastNameKana The value of lastNameKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastNameKana_PrefixSearch(String lastNameKana) {
        setLastNameKana_LikeSearch(lastNameKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LAST_NAME_KANA: {varchar(255)}
     */
    public void setLastNameKana_IsNull() { regLastNameKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LAST_NAME_KANA: {varchar(255)}
     */
    public void setLastNameKana_IsNullOrEmpty() { regLastNameKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LAST_NAME_KANA: {varchar(255)}
     */
    public void setLastNameKana_IsNotNull() { regLastNameKana(CK_ISNN, DOBJ); }

    protected void regLastNameKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastNameKana(), "LAST_NAME_KANA"); }
    protected abstract ConditionValue xgetCValueLastNameKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     * @param firstNameKana The value of firstNameKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstNameKana_Equal(String firstNameKana) {
        doSetFirstNameKana_Equal(fRES(firstNameKana));
    }

    protected void doSetFirstNameKana_Equal(String firstNameKana) {
        regFirstNameKana(CK_EQ, firstNameKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     * @param firstNameKana The value of firstNameKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstNameKana_NotEqual(String firstNameKana) {
        doSetFirstNameKana_NotEqual(fRES(firstNameKana));
    }

    protected void doSetFirstNameKana_NotEqual(String firstNameKana) {
        regFirstNameKana(CK_NES, firstNameKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     * @param firstNameKana The value of firstNameKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstNameKana_GreaterThan(String firstNameKana) {
        regFirstNameKana(CK_GT, fRES(firstNameKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     * @param firstNameKana The value of firstNameKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstNameKana_LessThan(String firstNameKana) {
        regFirstNameKana(CK_LT, fRES(firstNameKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     * @param firstNameKana The value of firstNameKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstNameKana_GreaterEqual(String firstNameKana) {
        regFirstNameKana(CK_GE, fRES(firstNameKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     * @param firstNameKana The value of firstNameKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstNameKana_LessEqual(String firstNameKana) {
        regFirstNameKana(CK_LE, fRES(firstNameKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     * @param firstNameKanaList The collection of firstNameKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstNameKana_InScope(Collection<String> firstNameKanaList) {
        doSetFirstNameKana_InScope(firstNameKanaList);
    }

    protected void doSetFirstNameKana_InScope(Collection<String> firstNameKanaList) {
        regINS(CK_INS, cTL(firstNameKanaList), xgetCValueFirstNameKana(), "FIRST_NAME_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     * @param firstNameKanaList The collection of firstNameKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstNameKana_NotInScope(Collection<String> firstNameKanaList) {
        doSetFirstNameKana_NotInScope(firstNameKanaList);
    }

    protected void doSetFirstNameKana_NotInScope(Collection<String> firstNameKanaList) {
        regINS(CK_NINS, cTL(firstNameKanaList), xgetCValueFirstNameKana(), "FIRST_NAME_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_NAME_KANA: {varchar(255)} <br>
     * <pre>e.g. setFirstNameKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firstNameKana The value of firstNameKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirstNameKana_LikeSearch(String firstNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firstNameKana), xgetCValueFirstNameKana(), "FIRST_NAME_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     * @param firstNameKana The value of firstNameKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirstNameKana_NotLikeSearch(String firstNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firstNameKana), xgetCValueFirstNameKana(), "FIRST_NAME_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     * @param firstNameKana The value of firstNameKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstNameKana_PrefixSearch(String firstNameKana) {
        setFirstNameKana_LikeSearch(firstNameKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     */
    public void setFirstNameKana_IsNull() { regFirstNameKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     */
    public void setFirstNameKana_IsNullOrEmpty() { regFirstNameKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     */
    public void setFirstNameKana_IsNotNull() { regFirstNameKana(CK_ISNN, DOBJ); }

    protected void regFirstNameKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstNameKana(), "FIRST_NAME_KANA"); }
    protected abstract ConditionValue xgetCValueFirstNameKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_Equal(String mailAddress) {
        doSetMailAddress_Equal(fRES(mailAddress));
    }

    protected void doSetMailAddress_Equal(String mailAddress) {
        regMailAddress(CK_EQ, mailAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_NotEqual(String mailAddress) {
        doSetMailAddress_NotEqual(fRES(mailAddress));
    }

    protected void doSetMailAddress_NotEqual(String mailAddress) {
        regMailAddress(CK_NES, mailAddress);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_GreaterThan(String mailAddress) {
        regMailAddress(CK_GT, fRES(mailAddress));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_LessThan(String mailAddress) {
        regMailAddress(CK_LT, fRES(mailAddress));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_GreaterEqual(String mailAddress) {
        regMailAddress(CK_GE, fRES(mailAddress));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_LessEqual(String mailAddress) {
        regMailAddress(CK_LE, fRES(mailAddress));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddressList The collection of mailAddress as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_InScope(Collection<String> mailAddressList) {
        doSetMailAddress_InScope(mailAddressList);
    }

    protected void doSetMailAddress_InScope(Collection<String> mailAddressList) {
        regINS(CK_INS, cTL(mailAddressList), xgetCValueMailAddress(), "MAIL_ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddressList The collection of mailAddress as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_NotInScope(Collection<String> mailAddressList) {
        doSetMailAddress_NotInScope(mailAddressList);
    }

    protected void doSetMailAddress_NotInScope(Collection<String> mailAddressList) {
        regINS(CK_NINS, cTL(mailAddressList), xgetCValueMailAddress(), "MAIL_ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)} <br>
     * <pre>e.g. setMailAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mailAddress The value of mailAddress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMailAddress_LikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mailAddress), xgetCValueMailAddress(), "MAIL_ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMailAddress_NotLikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mailAddress), xgetCValueMailAddress(), "MAIL_ADDRESS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_PrefixSearch(String mailAddress) {
        setMailAddress_LikeSearch(mailAddress, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     */
    public void setMailAddress_IsNull() { regMailAddress(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     */
    public void setMailAddress_IsNullOrEmpty() { regMailAddress(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     */
    public void setMailAddress_IsNotNull() { regMailAddress(CK_ISNN, DOBJ); }

    protected void regMailAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMailAddress(), "MAIL_ADDRESS"); }
    protected abstract ConditionValue xgetCValueMailAddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADMIN_FLG: {varchar(255)}
     * @param adminFlg The value of adminFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdminFlg_Equal(String adminFlg) {
        doSetAdminFlg_Equal(fRES(adminFlg));
    }

    protected void doSetAdminFlg_Equal(String adminFlg) {
        regAdminFlg(CK_EQ, adminFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADMIN_FLG: {varchar(255)}
     * @param adminFlg The value of adminFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdminFlg_NotEqual(String adminFlg) {
        doSetAdminFlg_NotEqual(fRES(adminFlg));
    }

    protected void doSetAdminFlg_NotEqual(String adminFlg) {
        regAdminFlg(CK_NES, adminFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADMIN_FLG: {varchar(255)}
     * @param adminFlg The value of adminFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdminFlg_GreaterThan(String adminFlg) {
        regAdminFlg(CK_GT, fRES(adminFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADMIN_FLG: {varchar(255)}
     * @param adminFlg The value of adminFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdminFlg_LessThan(String adminFlg) {
        regAdminFlg(CK_LT, fRES(adminFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADMIN_FLG: {varchar(255)}
     * @param adminFlg The value of adminFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdminFlg_GreaterEqual(String adminFlg) {
        regAdminFlg(CK_GE, fRES(adminFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADMIN_FLG: {varchar(255)}
     * @param adminFlg The value of adminFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdminFlg_LessEqual(String adminFlg) {
        regAdminFlg(CK_LE, fRES(adminFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADMIN_FLG: {varchar(255)}
     * @param adminFlgList The collection of adminFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdminFlg_InScope(Collection<String> adminFlgList) {
        doSetAdminFlg_InScope(adminFlgList);
    }

    protected void doSetAdminFlg_InScope(Collection<String> adminFlgList) {
        regINS(CK_INS, cTL(adminFlgList), xgetCValueAdminFlg(), "ADMIN_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADMIN_FLG: {varchar(255)}
     * @param adminFlgList The collection of adminFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdminFlg_NotInScope(Collection<String> adminFlgList) {
        doSetAdminFlg_NotInScope(adminFlgList);
    }

    protected void doSetAdminFlg_NotInScope(Collection<String> adminFlgList) {
        regINS(CK_NINS, cTL(adminFlgList), xgetCValueAdminFlg(), "ADMIN_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADMIN_FLG: {varchar(255)} <br>
     * <pre>e.g. setAdminFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param adminFlg The value of adminFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAdminFlg_LikeSearch(String adminFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(adminFlg), xgetCValueAdminFlg(), "ADMIN_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADMIN_FLG: {varchar(255)}
     * @param adminFlg The value of adminFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAdminFlg_NotLikeSearch(String adminFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(adminFlg), xgetCValueAdminFlg(), "ADMIN_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADMIN_FLG: {varchar(255)}
     * @param adminFlg The value of adminFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdminFlg_PrefixSearch(String adminFlg) {
        setAdminFlg_LikeSearch(adminFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADMIN_FLG: {varchar(255)}
     */
    public void setAdminFlg_IsNull() { regAdminFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADMIN_FLG: {varchar(255)}
     */
    public void setAdminFlg_IsNullOrEmpty() { regAdminFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADMIN_FLG: {varchar(255)}
     */
    public void setAdminFlg_IsNotNull() { regAdminFlg(CK_ISNN, DOBJ); }

    protected void regAdminFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdminFlg(), "ADMIN_FLG"); }
    protected abstract ConditionValue xgetCValueAdminFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_UNIT_CD: {varchar(255)}
     * @param companyUnitCd The value of companyUnitCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyUnitCd_Equal(String companyUnitCd) {
        doSetCompanyUnitCd_Equal(fRES(companyUnitCd));
    }

    protected void doSetCompanyUnitCd_Equal(String companyUnitCd) {
        regCompanyUnitCd(CK_EQ, companyUnitCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_UNIT_CD: {varchar(255)}
     * @param companyUnitCd The value of companyUnitCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyUnitCd_NotEqual(String companyUnitCd) {
        doSetCompanyUnitCd_NotEqual(fRES(companyUnitCd));
    }

    protected void doSetCompanyUnitCd_NotEqual(String companyUnitCd) {
        regCompanyUnitCd(CK_NES, companyUnitCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_UNIT_CD: {varchar(255)}
     * @param companyUnitCd The value of companyUnitCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyUnitCd_GreaterThan(String companyUnitCd) {
        regCompanyUnitCd(CK_GT, fRES(companyUnitCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_UNIT_CD: {varchar(255)}
     * @param companyUnitCd The value of companyUnitCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyUnitCd_LessThan(String companyUnitCd) {
        regCompanyUnitCd(CK_LT, fRES(companyUnitCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_UNIT_CD: {varchar(255)}
     * @param companyUnitCd The value of companyUnitCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyUnitCd_GreaterEqual(String companyUnitCd) {
        regCompanyUnitCd(CK_GE, fRES(companyUnitCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_UNIT_CD: {varchar(255)}
     * @param companyUnitCd The value of companyUnitCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyUnitCd_LessEqual(String companyUnitCd) {
        regCompanyUnitCd(CK_LE, fRES(companyUnitCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_UNIT_CD: {varchar(255)}
     * @param companyUnitCdList The collection of companyUnitCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyUnitCd_InScope(Collection<String> companyUnitCdList) {
        doSetCompanyUnitCd_InScope(companyUnitCdList);
    }

    protected void doSetCompanyUnitCd_InScope(Collection<String> companyUnitCdList) {
        regINS(CK_INS, cTL(companyUnitCdList), xgetCValueCompanyUnitCd(), "COMPANY_UNIT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_UNIT_CD: {varchar(255)}
     * @param companyUnitCdList The collection of companyUnitCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyUnitCd_NotInScope(Collection<String> companyUnitCdList) {
        doSetCompanyUnitCd_NotInScope(companyUnitCdList);
    }

    protected void doSetCompanyUnitCd_NotInScope(Collection<String> companyUnitCdList) {
        regINS(CK_NINS, cTL(companyUnitCdList), xgetCValueCompanyUnitCd(), "COMPANY_UNIT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_UNIT_CD: {varchar(255)} <br>
     * <pre>e.g. setCompanyUnitCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companyUnitCd The value of companyUnitCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanyUnitCd_LikeSearch(String companyUnitCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companyUnitCd), xgetCValueCompanyUnitCd(), "COMPANY_UNIT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_UNIT_CD: {varchar(255)}
     * @param companyUnitCd The value of companyUnitCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanyUnitCd_NotLikeSearch(String companyUnitCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companyUnitCd), xgetCValueCompanyUnitCd(), "COMPANY_UNIT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_UNIT_CD: {varchar(255)}
     * @param companyUnitCd The value of companyUnitCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyUnitCd_PrefixSearch(String companyUnitCd) {
        setCompanyUnitCd_LikeSearch(companyUnitCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANY_UNIT_CD: {varchar(255)}
     */
    public void setCompanyUnitCd_IsNull() { regCompanyUnitCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANY_UNIT_CD: {varchar(255)}
     */
    public void setCompanyUnitCd_IsNullOrEmpty() { regCompanyUnitCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANY_UNIT_CD: {varchar(255)}
     */
    public void setCompanyUnitCd_IsNotNull() { regCompanyUnitCd(CK_ISNN, DOBJ); }

    protected void regCompanyUnitCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanyUnitCd(), "COMPANY_UNIT_CD"); }
    protected abstract ConditionValue xgetCValueCompanyUnitCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_CD: {varchar(255)}
     * @param bizSystemCd The value of bizSystemCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemCd_Equal(String bizSystemCd) {
        doSetBizSystemCd_Equal(fRES(bizSystemCd));
    }

    protected void doSetBizSystemCd_Equal(String bizSystemCd) {
        regBizSystemCd(CK_EQ, bizSystemCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_CD: {varchar(255)}
     * @param bizSystemCd The value of bizSystemCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemCd_NotEqual(String bizSystemCd) {
        doSetBizSystemCd_NotEqual(fRES(bizSystemCd));
    }

    protected void doSetBizSystemCd_NotEqual(String bizSystemCd) {
        regBizSystemCd(CK_NES, bizSystemCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_CD: {varchar(255)}
     * @param bizSystemCd The value of bizSystemCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemCd_GreaterThan(String bizSystemCd) {
        regBizSystemCd(CK_GT, fRES(bizSystemCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_CD: {varchar(255)}
     * @param bizSystemCd The value of bizSystemCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemCd_LessThan(String bizSystemCd) {
        regBizSystemCd(CK_LT, fRES(bizSystemCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_CD: {varchar(255)}
     * @param bizSystemCd The value of bizSystemCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemCd_GreaterEqual(String bizSystemCd) {
        regBizSystemCd(CK_GE, fRES(bizSystemCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_CD: {varchar(255)}
     * @param bizSystemCd The value of bizSystemCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemCd_LessEqual(String bizSystemCd) {
        regBizSystemCd(CK_LE, fRES(bizSystemCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BIZ_SYSTEM_CD: {varchar(255)}
     * @param bizSystemCdList The collection of bizSystemCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemCd_InScope(Collection<String> bizSystemCdList) {
        doSetBizSystemCd_InScope(bizSystemCdList);
    }

    protected void doSetBizSystemCd_InScope(Collection<String> bizSystemCdList) {
        regINS(CK_INS, cTL(bizSystemCdList), xgetCValueBizSystemCd(), "BIZ_SYSTEM_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BIZ_SYSTEM_CD: {varchar(255)}
     * @param bizSystemCdList The collection of bizSystemCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemCd_NotInScope(Collection<String> bizSystemCdList) {
        doSetBizSystemCd_NotInScope(bizSystemCdList);
    }

    protected void doSetBizSystemCd_NotInScope(Collection<String> bizSystemCdList) {
        regINS(CK_NINS, cTL(bizSystemCdList), xgetCValueBizSystemCd(), "BIZ_SYSTEM_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZ_SYSTEM_CD: {varchar(255)} <br>
     * <pre>e.g. setBizSystemCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bizSystemCd The value of bizSystemCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBizSystemCd_LikeSearch(String bizSystemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bizSystemCd), xgetCValueBizSystemCd(), "BIZ_SYSTEM_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZ_SYSTEM_CD: {varchar(255)}
     * @param bizSystemCd The value of bizSystemCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBizSystemCd_NotLikeSearch(String bizSystemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bizSystemCd), xgetCValueBizSystemCd(), "BIZ_SYSTEM_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZ_SYSTEM_CD: {varchar(255)}
     * @param bizSystemCd The value of bizSystemCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemCd_PrefixSearch(String bizSystemCd) {
        setBizSystemCd_LikeSearch(bizSystemCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_CD: {varchar(255)}
     */
    public void setBizSystemCd_IsNull() { regBizSystemCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_CD: {varchar(255)}
     */
    public void setBizSystemCd_IsNullOrEmpty() { regBizSystemCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_CD: {varchar(255)}
     */
    public void setBizSystemCd_IsNotNull() { regBizSystemCd(CK_ISNN, DOBJ); }

    protected void regBizSystemCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBizSystemCd(), "BIZ_SYSTEM_CD"); }
    protected abstract ConditionValue xgetCValueBizSystemCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_NM: {varchar(255)}
     * @param bizSystemNm The value of bizSystemNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemNm_Equal(String bizSystemNm) {
        doSetBizSystemNm_Equal(fRES(bizSystemNm));
    }

    protected void doSetBizSystemNm_Equal(String bizSystemNm) {
        regBizSystemNm(CK_EQ, bizSystemNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_NM: {varchar(255)}
     * @param bizSystemNm The value of bizSystemNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemNm_NotEqual(String bizSystemNm) {
        doSetBizSystemNm_NotEqual(fRES(bizSystemNm));
    }

    protected void doSetBizSystemNm_NotEqual(String bizSystemNm) {
        regBizSystemNm(CK_NES, bizSystemNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_NM: {varchar(255)}
     * @param bizSystemNm The value of bizSystemNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemNm_GreaterThan(String bizSystemNm) {
        regBizSystemNm(CK_GT, fRES(bizSystemNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_NM: {varchar(255)}
     * @param bizSystemNm The value of bizSystemNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemNm_LessThan(String bizSystemNm) {
        regBizSystemNm(CK_LT, fRES(bizSystemNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_NM: {varchar(255)}
     * @param bizSystemNm The value of bizSystemNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemNm_GreaterEqual(String bizSystemNm) {
        regBizSystemNm(CK_GE, fRES(bizSystemNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_NM: {varchar(255)}
     * @param bizSystemNm The value of bizSystemNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemNm_LessEqual(String bizSystemNm) {
        regBizSystemNm(CK_LE, fRES(bizSystemNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BIZ_SYSTEM_NM: {varchar(255)}
     * @param bizSystemNmList The collection of bizSystemNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemNm_InScope(Collection<String> bizSystemNmList) {
        doSetBizSystemNm_InScope(bizSystemNmList);
    }

    protected void doSetBizSystemNm_InScope(Collection<String> bizSystemNmList) {
        regINS(CK_INS, cTL(bizSystemNmList), xgetCValueBizSystemNm(), "BIZ_SYSTEM_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BIZ_SYSTEM_NM: {varchar(255)}
     * @param bizSystemNmList The collection of bizSystemNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemNm_NotInScope(Collection<String> bizSystemNmList) {
        doSetBizSystemNm_NotInScope(bizSystemNmList);
    }

    protected void doSetBizSystemNm_NotInScope(Collection<String> bizSystemNmList) {
        regINS(CK_NINS, cTL(bizSystemNmList), xgetCValueBizSystemNm(), "BIZ_SYSTEM_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZ_SYSTEM_NM: {varchar(255)} <br>
     * <pre>e.g. setBizSystemNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bizSystemNm The value of bizSystemNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBizSystemNm_LikeSearch(String bizSystemNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bizSystemNm), xgetCValueBizSystemNm(), "BIZ_SYSTEM_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZ_SYSTEM_NM: {varchar(255)}
     * @param bizSystemNm The value of bizSystemNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBizSystemNm_NotLikeSearch(String bizSystemNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bizSystemNm), xgetCValueBizSystemNm(), "BIZ_SYSTEM_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BIZ_SYSTEM_NM: {varchar(255)}
     * @param bizSystemNm The value of bizSystemNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBizSystemNm_PrefixSearch(String bizSystemNm) {
        setBizSystemNm_LikeSearch(bizSystemNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_NM: {varchar(255)}
     */
    public void setBizSystemNm_IsNull() { regBizSystemNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_NM: {varchar(255)}
     */
    public void setBizSystemNm_IsNullOrEmpty() { regBizSystemNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BIZ_SYSTEM_NM: {varchar(255)}
     */
    public void setBizSystemNm_IsNotNull() { regBizSystemNm(CK_ISNN, DOBJ); }

    protected void regBizSystemNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBizSystemNm(), "BIZ_SYSTEM_NM"); }
    protected abstract ConditionValue xgetCValueBizSystemNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_ROLE_CD: {varchar(255)}
     * @param userRoleCd The value of userRoleCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleCd_Equal(String userRoleCd) {
        doSetUserRoleCd_Equal(fRES(userRoleCd));
    }

    protected void doSetUserRoleCd_Equal(String userRoleCd) {
        regUserRoleCd(CK_EQ, userRoleCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_ROLE_CD: {varchar(255)}
     * @param userRoleCd The value of userRoleCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleCd_NotEqual(String userRoleCd) {
        doSetUserRoleCd_NotEqual(fRES(userRoleCd));
    }

    protected void doSetUserRoleCd_NotEqual(String userRoleCd) {
        regUserRoleCd(CK_NES, userRoleCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_ROLE_CD: {varchar(255)}
     * @param userRoleCd The value of userRoleCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleCd_GreaterThan(String userRoleCd) {
        regUserRoleCd(CK_GT, fRES(userRoleCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_ROLE_CD: {varchar(255)}
     * @param userRoleCd The value of userRoleCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleCd_LessThan(String userRoleCd) {
        regUserRoleCd(CK_LT, fRES(userRoleCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_ROLE_CD: {varchar(255)}
     * @param userRoleCd The value of userRoleCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleCd_GreaterEqual(String userRoleCd) {
        regUserRoleCd(CK_GE, fRES(userRoleCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_ROLE_CD: {varchar(255)}
     * @param userRoleCd The value of userRoleCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleCd_LessEqual(String userRoleCd) {
        regUserRoleCd(CK_LE, fRES(userRoleCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_ROLE_CD: {varchar(255)}
     * @param userRoleCdList The collection of userRoleCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleCd_InScope(Collection<String> userRoleCdList) {
        doSetUserRoleCd_InScope(userRoleCdList);
    }

    protected void doSetUserRoleCd_InScope(Collection<String> userRoleCdList) {
        regINS(CK_INS, cTL(userRoleCdList), xgetCValueUserRoleCd(), "USER_ROLE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_ROLE_CD: {varchar(255)}
     * @param userRoleCdList The collection of userRoleCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleCd_NotInScope(Collection<String> userRoleCdList) {
        doSetUserRoleCd_NotInScope(userRoleCdList);
    }

    protected void doSetUserRoleCd_NotInScope(Collection<String> userRoleCdList) {
        regINS(CK_NINS, cTL(userRoleCdList), xgetCValueUserRoleCd(), "USER_ROLE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_ROLE_CD: {varchar(255)} <br>
     * <pre>e.g. setUserRoleCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userRoleCd The value of userRoleCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserRoleCd_LikeSearch(String userRoleCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userRoleCd), xgetCValueUserRoleCd(), "USER_ROLE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_ROLE_CD: {varchar(255)}
     * @param userRoleCd The value of userRoleCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserRoleCd_NotLikeSearch(String userRoleCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userRoleCd), xgetCValueUserRoleCd(), "USER_ROLE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_ROLE_CD: {varchar(255)}
     * @param userRoleCd The value of userRoleCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleCd_PrefixSearch(String userRoleCd) {
        setUserRoleCd_LikeSearch(userRoleCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_ROLE_CD: {varchar(255)}
     */
    public void setUserRoleCd_IsNull() { regUserRoleCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USER_ROLE_CD: {varchar(255)}
     */
    public void setUserRoleCd_IsNullOrEmpty() { regUserRoleCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_ROLE_CD: {varchar(255)}
     */
    public void setUserRoleCd_IsNotNull() { regUserRoleCd(CK_ISNN, DOBJ); }

    protected void regUserRoleCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserRoleCd(), "USER_ROLE_CD"); }
    protected abstract ConditionValue xgetCValueUserRoleCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_ROLE_NM: {varchar(255)}
     * @param userRoleNm The value of userRoleNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleNm_Equal(String userRoleNm) {
        doSetUserRoleNm_Equal(fRES(userRoleNm));
    }

    protected void doSetUserRoleNm_Equal(String userRoleNm) {
        regUserRoleNm(CK_EQ, userRoleNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_ROLE_NM: {varchar(255)}
     * @param userRoleNm The value of userRoleNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleNm_NotEqual(String userRoleNm) {
        doSetUserRoleNm_NotEqual(fRES(userRoleNm));
    }

    protected void doSetUserRoleNm_NotEqual(String userRoleNm) {
        regUserRoleNm(CK_NES, userRoleNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_ROLE_NM: {varchar(255)}
     * @param userRoleNm The value of userRoleNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleNm_GreaterThan(String userRoleNm) {
        regUserRoleNm(CK_GT, fRES(userRoleNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_ROLE_NM: {varchar(255)}
     * @param userRoleNm The value of userRoleNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleNm_LessThan(String userRoleNm) {
        regUserRoleNm(CK_LT, fRES(userRoleNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_ROLE_NM: {varchar(255)}
     * @param userRoleNm The value of userRoleNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleNm_GreaterEqual(String userRoleNm) {
        regUserRoleNm(CK_GE, fRES(userRoleNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_ROLE_NM: {varchar(255)}
     * @param userRoleNm The value of userRoleNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleNm_LessEqual(String userRoleNm) {
        regUserRoleNm(CK_LE, fRES(userRoleNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_ROLE_NM: {varchar(255)}
     * @param userRoleNmList The collection of userRoleNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleNm_InScope(Collection<String> userRoleNmList) {
        doSetUserRoleNm_InScope(userRoleNmList);
    }

    protected void doSetUserRoleNm_InScope(Collection<String> userRoleNmList) {
        regINS(CK_INS, cTL(userRoleNmList), xgetCValueUserRoleNm(), "USER_ROLE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_ROLE_NM: {varchar(255)}
     * @param userRoleNmList The collection of userRoleNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleNm_NotInScope(Collection<String> userRoleNmList) {
        doSetUserRoleNm_NotInScope(userRoleNmList);
    }

    protected void doSetUserRoleNm_NotInScope(Collection<String> userRoleNmList) {
        regINS(CK_NINS, cTL(userRoleNmList), xgetCValueUserRoleNm(), "USER_ROLE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_ROLE_NM: {varchar(255)} <br>
     * <pre>e.g. setUserRoleNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userRoleNm The value of userRoleNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserRoleNm_LikeSearch(String userRoleNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userRoleNm), xgetCValueUserRoleNm(), "USER_ROLE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_ROLE_NM: {varchar(255)}
     * @param userRoleNm The value of userRoleNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserRoleNm_NotLikeSearch(String userRoleNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userRoleNm), xgetCValueUserRoleNm(), "USER_ROLE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_ROLE_NM: {varchar(255)}
     * @param userRoleNm The value of userRoleNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserRoleNm_PrefixSearch(String userRoleNm) {
        setUserRoleNm_LikeSearch(userRoleNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_ROLE_NM: {varchar(255)}
     */
    public void setUserRoleNm_IsNull() { regUserRoleNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USER_ROLE_NM: {varchar(255)}
     */
    public void setUserRoleNm_IsNullOrEmpty() { regUserRoleNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_ROLE_NM: {varchar(255)}
     */
    public void setUserRoleNm_IsNotNull() { regUserRoleNm(CK_ISNN, DOBJ); }

    protected void regUserRoleNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserRoleNm(), "USER_ROLE_NM"); }
    protected abstract ConditionValue xgetCValueUserRoleNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_COMPANY_CD: {varchar(255)}
     * @param planCompanyCd The value of planCompanyCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanCompanyCd_Equal(String planCompanyCd) {
        doSetPlanCompanyCd_Equal(fRES(planCompanyCd));
    }

    protected void doSetPlanCompanyCd_Equal(String planCompanyCd) {
        regPlanCompanyCd(CK_EQ, planCompanyCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_COMPANY_CD: {varchar(255)}
     * @param planCompanyCd The value of planCompanyCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanCompanyCd_NotEqual(String planCompanyCd) {
        doSetPlanCompanyCd_NotEqual(fRES(planCompanyCd));
    }

    protected void doSetPlanCompanyCd_NotEqual(String planCompanyCd) {
        regPlanCompanyCd(CK_NES, planCompanyCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_COMPANY_CD: {varchar(255)}
     * @param planCompanyCd The value of planCompanyCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanCompanyCd_GreaterThan(String planCompanyCd) {
        regPlanCompanyCd(CK_GT, fRES(planCompanyCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_COMPANY_CD: {varchar(255)}
     * @param planCompanyCd The value of planCompanyCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanCompanyCd_LessThan(String planCompanyCd) {
        regPlanCompanyCd(CK_LT, fRES(planCompanyCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_COMPANY_CD: {varchar(255)}
     * @param planCompanyCd The value of planCompanyCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanCompanyCd_GreaterEqual(String planCompanyCd) {
        regPlanCompanyCd(CK_GE, fRES(planCompanyCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_COMPANY_CD: {varchar(255)}
     * @param planCompanyCd The value of planCompanyCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanCompanyCd_LessEqual(String planCompanyCd) {
        regPlanCompanyCd(CK_LE, fRES(planCompanyCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_COMPANY_CD: {varchar(255)}
     * @param planCompanyCdList The collection of planCompanyCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanCompanyCd_InScope(Collection<String> planCompanyCdList) {
        doSetPlanCompanyCd_InScope(planCompanyCdList);
    }

    protected void doSetPlanCompanyCd_InScope(Collection<String> planCompanyCdList) {
        regINS(CK_INS, cTL(planCompanyCdList), xgetCValuePlanCompanyCd(), "PLAN_COMPANY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_COMPANY_CD: {varchar(255)}
     * @param planCompanyCdList The collection of planCompanyCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanCompanyCd_NotInScope(Collection<String> planCompanyCdList) {
        doSetPlanCompanyCd_NotInScope(planCompanyCdList);
    }

    protected void doSetPlanCompanyCd_NotInScope(Collection<String> planCompanyCdList) {
        regINS(CK_NINS, cTL(planCompanyCdList), xgetCValuePlanCompanyCd(), "PLAN_COMPANY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_COMPANY_CD: {varchar(255)} <br>
     * <pre>e.g. setPlanCompanyCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planCompanyCd The value of planCompanyCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanCompanyCd_LikeSearch(String planCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planCompanyCd), xgetCValuePlanCompanyCd(), "PLAN_COMPANY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_COMPANY_CD: {varchar(255)}
     * @param planCompanyCd The value of planCompanyCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanCompanyCd_NotLikeSearch(String planCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planCompanyCd), xgetCValuePlanCompanyCd(), "PLAN_COMPANY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_COMPANY_CD: {varchar(255)}
     * @param planCompanyCd The value of planCompanyCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanCompanyCd_PrefixSearch(String planCompanyCd) {
        setPlanCompanyCd_LikeSearch(planCompanyCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_COMPANY_CD: {varchar(255)}
     */
    public void setPlanCompanyCd_IsNull() { regPlanCompanyCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_COMPANY_CD: {varchar(255)}
     */
    public void setPlanCompanyCd_IsNullOrEmpty() { regPlanCompanyCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_COMPANY_CD: {varchar(255)}
     */
    public void setPlanCompanyCd_IsNotNull() { regPlanCompanyCd(CK_ISNN, DOBJ); }

    protected void regPlanCompanyCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanCompanyCd(), "PLAN_COMPANY_CD"); }
    protected abstract ConditionValue xgetCValuePlanCompanyCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_COMPANY_CD: {varchar(255)}
     * @param wmsCompanyCd The value of wmsCompanyCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsCompanyCd_Equal(String wmsCompanyCd) {
        doSetWmsCompanyCd_Equal(fRES(wmsCompanyCd));
    }

    protected void doSetWmsCompanyCd_Equal(String wmsCompanyCd) {
        regWmsCompanyCd(CK_EQ, wmsCompanyCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_COMPANY_CD: {varchar(255)}
     * @param wmsCompanyCd The value of wmsCompanyCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsCompanyCd_NotEqual(String wmsCompanyCd) {
        doSetWmsCompanyCd_NotEqual(fRES(wmsCompanyCd));
    }

    protected void doSetWmsCompanyCd_NotEqual(String wmsCompanyCd) {
        regWmsCompanyCd(CK_NES, wmsCompanyCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_COMPANY_CD: {varchar(255)}
     * @param wmsCompanyCd The value of wmsCompanyCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsCompanyCd_GreaterThan(String wmsCompanyCd) {
        regWmsCompanyCd(CK_GT, fRES(wmsCompanyCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_COMPANY_CD: {varchar(255)}
     * @param wmsCompanyCd The value of wmsCompanyCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsCompanyCd_LessThan(String wmsCompanyCd) {
        regWmsCompanyCd(CK_LT, fRES(wmsCompanyCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_COMPANY_CD: {varchar(255)}
     * @param wmsCompanyCd The value of wmsCompanyCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsCompanyCd_GreaterEqual(String wmsCompanyCd) {
        regWmsCompanyCd(CK_GE, fRES(wmsCompanyCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_COMPANY_CD: {varchar(255)}
     * @param wmsCompanyCd The value of wmsCompanyCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsCompanyCd_LessEqual(String wmsCompanyCd) {
        regWmsCompanyCd(CK_LE, fRES(wmsCompanyCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_COMPANY_CD: {varchar(255)}
     * @param wmsCompanyCdList The collection of wmsCompanyCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsCompanyCd_InScope(Collection<String> wmsCompanyCdList) {
        doSetWmsCompanyCd_InScope(wmsCompanyCdList);
    }

    protected void doSetWmsCompanyCd_InScope(Collection<String> wmsCompanyCdList) {
        regINS(CK_INS, cTL(wmsCompanyCdList), xgetCValueWmsCompanyCd(), "WMS_COMPANY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_COMPANY_CD: {varchar(255)}
     * @param wmsCompanyCdList The collection of wmsCompanyCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsCompanyCd_NotInScope(Collection<String> wmsCompanyCdList) {
        doSetWmsCompanyCd_NotInScope(wmsCompanyCdList);
    }

    protected void doSetWmsCompanyCd_NotInScope(Collection<String> wmsCompanyCdList) {
        regINS(CK_NINS, cTL(wmsCompanyCdList), xgetCValueWmsCompanyCd(), "WMS_COMPANY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_COMPANY_CD: {varchar(255)} <br>
     * <pre>e.g. setWmsCompanyCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsCompanyCd The value of wmsCompanyCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsCompanyCd_LikeSearch(String wmsCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsCompanyCd), xgetCValueWmsCompanyCd(), "WMS_COMPANY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_COMPANY_CD: {varchar(255)}
     * @param wmsCompanyCd The value of wmsCompanyCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsCompanyCd_NotLikeSearch(String wmsCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsCompanyCd), xgetCValueWmsCompanyCd(), "WMS_COMPANY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_COMPANY_CD: {varchar(255)}
     * @param wmsCompanyCd The value of wmsCompanyCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsCompanyCd_PrefixSearch(String wmsCompanyCd) {
        setWmsCompanyCd_LikeSearch(wmsCompanyCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_COMPANY_CD: {varchar(255)}
     */
    public void setWmsCompanyCd_IsNull() { regWmsCompanyCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_COMPANY_CD: {varchar(255)}
     */
    public void setWmsCompanyCd_IsNullOrEmpty() { regWmsCompanyCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_COMPANY_CD: {varchar(255)}
     */
    public void setWmsCompanyCd_IsNotNull() { regWmsCompanyCd(CK_ISNN, DOBJ); }

    protected void regWmsCompanyCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsCompanyCd(), "WMS_COMPANY_CD"); }
    protected abstract ConditionValue xgetCValueWmsCompanyCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(255)}
     * @param dlvRootCompanyCd The value of dlvRootCompanyCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvRootCompanyCd_Equal(String dlvRootCompanyCd) {
        doSetDlvRootCompanyCd_Equal(fRES(dlvRootCompanyCd));
    }

    protected void doSetDlvRootCompanyCd_Equal(String dlvRootCompanyCd) {
        regDlvRootCompanyCd(CK_EQ, dlvRootCompanyCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(255)}
     * @param dlvRootCompanyCd The value of dlvRootCompanyCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvRootCompanyCd_NotEqual(String dlvRootCompanyCd) {
        doSetDlvRootCompanyCd_NotEqual(fRES(dlvRootCompanyCd));
    }

    protected void doSetDlvRootCompanyCd_NotEqual(String dlvRootCompanyCd) {
        regDlvRootCompanyCd(CK_NES, dlvRootCompanyCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(255)}
     * @param dlvRootCompanyCd The value of dlvRootCompanyCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvRootCompanyCd_GreaterThan(String dlvRootCompanyCd) {
        regDlvRootCompanyCd(CK_GT, fRES(dlvRootCompanyCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(255)}
     * @param dlvRootCompanyCd The value of dlvRootCompanyCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvRootCompanyCd_LessThan(String dlvRootCompanyCd) {
        regDlvRootCompanyCd(CK_LT, fRES(dlvRootCompanyCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(255)}
     * @param dlvRootCompanyCd The value of dlvRootCompanyCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvRootCompanyCd_GreaterEqual(String dlvRootCompanyCd) {
        regDlvRootCompanyCd(CK_GE, fRES(dlvRootCompanyCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(255)}
     * @param dlvRootCompanyCd The value of dlvRootCompanyCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvRootCompanyCd_LessEqual(String dlvRootCompanyCd) {
        regDlvRootCompanyCd(CK_LE, fRES(dlvRootCompanyCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(255)}
     * @param dlvRootCompanyCdList The collection of dlvRootCompanyCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvRootCompanyCd_InScope(Collection<String> dlvRootCompanyCdList) {
        doSetDlvRootCompanyCd_InScope(dlvRootCompanyCdList);
    }

    protected void doSetDlvRootCompanyCd_InScope(Collection<String> dlvRootCompanyCdList) {
        regINS(CK_INS, cTL(dlvRootCompanyCdList), xgetCValueDlvRootCompanyCd(), "DLV_ROOT_COMPANY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(255)}
     * @param dlvRootCompanyCdList The collection of dlvRootCompanyCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvRootCompanyCd_NotInScope(Collection<String> dlvRootCompanyCdList) {
        doSetDlvRootCompanyCd_NotInScope(dlvRootCompanyCdList);
    }

    protected void doSetDlvRootCompanyCd_NotInScope(Collection<String> dlvRootCompanyCdList) {
        regINS(CK_NINS, cTL(dlvRootCompanyCdList), xgetCValueDlvRootCompanyCd(), "DLV_ROOT_COMPANY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(255)} <br>
     * <pre>e.g. setDlvRootCompanyCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dlvRootCompanyCd The value of dlvRootCompanyCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDlvRootCompanyCd_LikeSearch(String dlvRootCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dlvRootCompanyCd), xgetCValueDlvRootCompanyCd(), "DLV_ROOT_COMPANY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(255)}
     * @param dlvRootCompanyCd The value of dlvRootCompanyCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDlvRootCompanyCd_NotLikeSearch(String dlvRootCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dlvRootCompanyCd), xgetCValueDlvRootCompanyCd(), "DLV_ROOT_COMPANY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(255)}
     * @param dlvRootCompanyCd The value of dlvRootCompanyCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvRootCompanyCd_PrefixSearch(String dlvRootCompanyCd) {
        setDlvRootCompanyCd_LikeSearch(dlvRootCompanyCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(255)}
     */
    public void setDlvRootCompanyCd_IsNull() { regDlvRootCompanyCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(255)}
     */
    public void setDlvRootCompanyCd_IsNullOrEmpty() { regDlvRootCompanyCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(255)}
     */
    public void setDlvRootCompanyCd_IsNotNull() { regDlvRootCompanyCd(CK_ISNN, DOBJ); }

    protected void regDlvRootCompanyCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvRootCompanyCd(), "DLV_ROOT_COMPANY_CD"); }
    protected abstract ConditionValue xgetCValueDlvRootCompanyCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SVF_COMPANY_CD: {varchar(255)}
     * @param svfCompanyCd The value of svfCompanyCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSvfCompanyCd_Equal(String svfCompanyCd) {
        doSetSvfCompanyCd_Equal(fRES(svfCompanyCd));
    }

    protected void doSetSvfCompanyCd_Equal(String svfCompanyCd) {
        regSvfCompanyCd(CK_EQ, svfCompanyCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SVF_COMPANY_CD: {varchar(255)}
     * @param svfCompanyCd The value of svfCompanyCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSvfCompanyCd_NotEqual(String svfCompanyCd) {
        doSetSvfCompanyCd_NotEqual(fRES(svfCompanyCd));
    }

    protected void doSetSvfCompanyCd_NotEqual(String svfCompanyCd) {
        regSvfCompanyCd(CK_NES, svfCompanyCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SVF_COMPANY_CD: {varchar(255)}
     * @param svfCompanyCd The value of svfCompanyCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSvfCompanyCd_GreaterThan(String svfCompanyCd) {
        regSvfCompanyCd(CK_GT, fRES(svfCompanyCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SVF_COMPANY_CD: {varchar(255)}
     * @param svfCompanyCd The value of svfCompanyCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSvfCompanyCd_LessThan(String svfCompanyCd) {
        regSvfCompanyCd(CK_LT, fRES(svfCompanyCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SVF_COMPANY_CD: {varchar(255)}
     * @param svfCompanyCd The value of svfCompanyCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSvfCompanyCd_GreaterEqual(String svfCompanyCd) {
        regSvfCompanyCd(CK_GE, fRES(svfCompanyCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SVF_COMPANY_CD: {varchar(255)}
     * @param svfCompanyCd The value of svfCompanyCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSvfCompanyCd_LessEqual(String svfCompanyCd) {
        regSvfCompanyCd(CK_LE, fRES(svfCompanyCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SVF_COMPANY_CD: {varchar(255)}
     * @param svfCompanyCdList The collection of svfCompanyCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSvfCompanyCd_InScope(Collection<String> svfCompanyCdList) {
        doSetSvfCompanyCd_InScope(svfCompanyCdList);
    }

    protected void doSetSvfCompanyCd_InScope(Collection<String> svfCompanyCdList) {
        regINS(CK_INS, cTL(svfCompanyCdList), xgetCValueSvfCompanyCd(), "SVF_COMPANY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SVF_COMPANY_CD: {varchar(255)}
     * @param svfCompanyCdList The collection of svfCompanyCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSvfCompanyCd_NotInScope(Collection<String> svfCompanyCdList) {
        doSetSvfCompanyCd_NotInScope(svfCompanyCdList);
    }

    protected void doSetSvfCompanyCd_NotInScope(Collection<String> svfCompanyCdList) {
        regINS(CK_NINS, cTL(svfCompanyCdList), xgetCValueSvfCompanyCd(), "SVF_COMPANY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SVF_COMPANY_CD: {varchar(255)} <br>
     * <pre>e.g. setSvfCompanyCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param svfCompanyCd The value of svfCompanyCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSvfCompanyCd_LikeSearch(String svfCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(svfCompanyCd), xgetCValueSvfCompanyCd(), "SVF_COMPANY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SVF_COMPANY_CD: {varchar(255)}
     * @param svfCompanyCd The value of svfCompanyCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSvfCompanyCd_NotLikeSearch(String svfCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(svfCompanyCd), xgetCValueSvfCompanyCd(), "SVF_COMPANY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SVF_COMPANY_CD: {varchar(255)}
     * @param svfCompanyCd The value of svfCompanyCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSvfCompanyCd_PrefixSearch(String svfCompanyCd) {
        setSvfCompanyCd_LikeSearch(svfCompanyCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SVF_COMPANY_CD: {varchar(255)}
     */
    public void setSvfCompanyCd_IsNull() { regSvfCompanyCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SVF_COMPANY_CD: {varchar(255)}
     */
    public void setSvfCompanyCd_IsNullOrEmpty() { regSvfCompanyCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SVF_COMPANY_CD: {varchar(255)}
     */
    public void setSvfCompanyCd_IsNotNull() { regSvfCompanyCd(CK_ISNN, DOBJ); }

    protected void regSvfCompanyCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSvfCompanyCd(), "SVF_COMPANY_CD"); }
    protected abstract ConditionValue xgetCValueSvfCompanyCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_COMPANY_CD: {varchar(255)}
     * @param kbCompanyCd The value of kbCompanyCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbCompanyCd_Equal(String kbCompanyCd) {
        doSetKbCompanyCd_Equal(fRES(kbCompanyCd));
    }

    protected void doSetKbCompanyCd_Equal(String kbCompanyCd) {
        regKbCompanyCd(CK_EQ, kbCompanyCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_COMPANY_CD: {varchar(255)}
     * @param kbCompanyCd The value of kbCompanyCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbCompanyCd_NotEqual(String kbCompanyCd) {
        doSetKbCompanyCd_NotEqual(fRES(kbCompanyCd));
    }

    protected void doSetKbCompanyCd_NotEqual(String kbCompanyCd) {
        regKbCompanyCd(CK_NES, kbCompanyCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_COMPANY_CD: {varchar(255)}
     * @param kbCompanyCd The value of kbCompanyCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbCompanyCd_GreaterThan(String kbCompanyCd) {
        regKbCompanyCd(CK_GT, fRES(kbCompanyCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_COMPANY_CD: {varchar(255)}
     * @param kbCompanyCd The value of kbCompanyCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbCompanyCd_LessThan(String kbCompanyCd) {
        regKbCompanyCd(CK_LT, fRES(kbCompanyCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_COMPANY_CD: {varchar(255)}
     * @param kbCompanyCd The value of kbCompanyCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbCompanyCd_GreaterEqual(String kbCompanyCd) {
        regKbCompanyCd(CK_GE, fRES(kbCompanyCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_COMPANY_CD: {varchar(255)}
     * @param kbCompanyCd The value of kbCompanyCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbCompanyCd_LessEqual(String kbCompanyCd) {
        regKbCompanyCd(CK_LE, fRES(kbCompanyCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KB_COMPANY_CD: {varchar(255)}
     * @param kbCompanyCdList The collection of kbCompanyCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbCompanyCd_InScope(Collection<String> kbCompanyCdList) {
        doSetKbCompanyCd_InScope(kbCompanyCdList);
    }

    protected void doSetKbCompanyCd_InScope(Collection<String> kbCompanyCdList) {
        regINS(CK_INS, cTL(kbCompanyCdList), xgetCValueKbCompanyCd(), "KB_COMPANY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KB_COMPANY_CD: {varchar(255)}
     * @param kbCompanyCdList The collection of kbCompanyCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbCompanyCd_NotInScope(Collection<String> kbCompanyCdList) {
        doSetKbCompanyCd_NotInScope(kbCompanyCdList);
    }

    protected void doSetKbCompanyCd_NotInScope(Collection<String> kbCompanyCdList) {
        regINS(CK_NINS, cTL(kbCompanyCdList), xgetCValueKbCompanyCd(), "KB_COMPANY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_COMPANY_CD: {varchar(255)} <br>
     * <pre>e.g. setKbCompanyCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kbCompanyCd The value of kbCompanyCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKbCompanyCd_LikeSearch(String kbCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kbCompanyCd), xgetCValueKbCompanyCd(), "KB_COMPANY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_COMPANY_CD: {varchar(255)}
     * @param kbCompanyCd The value of kbCompanyCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKbCompanyCd_NotLikeSearch(String kbCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kbCompanyCd), xgetCValueKbCompanyCd(), "KB_COMPANY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_COMPANY_CD: {varchar(255)}
     * @param kbCompanyCd The value of kbCompanyCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbCompanyCd_PrefixSearch(String kbCompanyCd) {
        setKbCompanyCd_LikeSearch(kbCompanyCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KB_COMPANY_CD: {varchar(255)}
     */
    public void setKbCompanyCd_IsNull() { regKbCompanyCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KB_COMPANY_CD: {varchar(255)}
     */
    public void setKbCompanyCd_IsNullOrEmpty() { regKbCompanyCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KB_COMPANY_CD: {varchar(255)}
     */
    public void setKbCompanyCd_IsNotNull() { regKbCompanyCd(CK_ISNN, DOBJ); }

    protected void regKbCompanyCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKbCompanyCd(), "KB_COMPANY_CD"); }
    protected abstract ConditionValue xgetCValueKbCompanyCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)}
     * @param orderLoginCompanyCd The value of orderLoginCompanyCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderLoginCompanyCd_Equal(String orderLoginCompanyCd) {
        doSetOrderLoginCompanyCd_Equal(fRES(orderLoginCompanyCd));
    }

    protected void doSetOrderLoginCompanyCd_Equal(String orderLoginCompanyCd) {
        regOrderLoginCompanyCd(CK_EQ, orderLoginCompanyCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)}
     * @param orderLoginCompanyCd The value of orderLoginCompanyCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderLoginCompanyCd_NotEqual(String orderLoginCompanyCd) {
        doSetOrderLoginCompanyCd_NotEqual(fRES(orderLoginCompanyCd));
    }

    protected void doSetOrderLoginCompanyCd_NotEqual(String orderLoginCompanyCd) {
        regOrderLoginCompanyCd(CK_NES, orderLoginCompanyCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)}
     * @param orderLoginCompanyCd The value of orderLoginCompanyCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderLoginCompanyCd_GreaterThan(String orderLoginCompanyCd) {
        regOrderLoginCompanyCd(CK_GT, fRES(orderLoginCompanyCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)}
     * @param orderLoginCompanyCd The value of orderLoginCompanyCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderLoginCompanyCd_LessThan(String orderLoginCompanyCd) {
        regOrderLoginCompanyCd(CK_LT, fRES(orderLoginCompanyCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)}
     * @param orderLoginCompanyCd The value of orderLoginCompanyCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderLoginCompanyCd_GreaterEqual(String orderLoginCompanyCd) {
        regOrderLoginCompanyCd(CK_GE, fRES(orderLoginCompanyCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)}
     * @param orderLoginCompanyCd The value of orderLoginCompanyCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderLoginCompanyCd_LessEqual(String orderLoginCompanyCd) {
        regOrderLoginCompanyCd(CK_LE, fRES(orderLoginCompanyCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)}
     * @param orderLoginCompanyCdList The collection of orderLoginCompanyCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderLoginCompanyCd_InScope(Collection<String> orderLoginCompanyCdList) {
        doSetOrderLoginCompanyCd_InScope(orderLoginCompanyCdList);
    }

    protected void doSetOrderLoginCompanyCd_InScope(Collection<String> orderLoginCompanyCdList) {
        regINS(CK_INS, cTL(orderLoginCompanyCdList), xgetCValueOrderLoginCompanyCd(), "ORDER_LOGIN_COMPANY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)}
     * @param orderLoginCompanyCdList The collection of orderLoginCompanyCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderLoginCompanyCd_NotInScope(Collection<String> orderLoginCompanyCdList) {
        doSetOrderLoginCompanyCd_NotInScope(orderLoginCompanyCdList);
    }

    protected void doSetOrderLoginCompanyCd_NotInScope(Collection<String> orderLoginCompanyCdList) {
        regINS(CK_NINS, cTL(orderLoginCompanyCdList), xgetCValueOrderLoginCompanyCd(), "ORDER_LOGIN_COMPANY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)} <br>
     * <pre>e.g. setOrderLoginCompanyCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderLoginCompanyCd The value of orderLoginCompanyCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderLoginCompanyCd_LikeSearch(String orderLoginCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderLoginCompanyCd), xgetCValueOrderLoginCompanyCd(), "ORDER_LOGIN_COMPANY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)}
     * @param orderLoginCompanyCd The value of orderLoginCompanyCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderLoginCompanyCd_NotLikeSearch(String orderLoginCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderLoginCompanyCd), xgetCValueOrderLoginCompanyCd(), "ORDER_LOGIN_COMPANY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)}
     * @param orderLoginCompanyCd The value of orderLoginCompanyCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderLoginCompanyCd_PrefixSearch(String orderLoginCompanyCd) {
        setOrderLoginCompanyCd_LikeSearch(orderLoginCompanyCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)}
     */
    public void setOrderLoginCompanyCd_IsNull() { regOrderLoginCompanyCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)}
     */
    public void setOrderLoginCompanyCd_IsNullOrEmpty() { regOrderLoginCompanyCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)}
     */
    public void setOrderLoginCompanyCd_IsNotNull() { regOrderLoginCompanyCd(CK_ISNN, DOBJ); }

    protected void regOrderLoginCompanyCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderLoginCompanyCd(), "ORDER_LOGIN_COMPANY_CD"); }
    protected abstract ConditionValue xgetCValueOrderLoginCompanyCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)}
     * @param orderOfficeCompanyCd The value of orderOfficeCompanyCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderOfficeCompanyCd_Equal(String orderOfficeCompanyCd) {
        doSetOrderOfficeCompanyCd_Equal(fRES(orderOfficeCompanyCd));
    }

    protected void doSetOrderOfficeCompanyCd_Equal(String orderOfficeCompanyCd) {
        regOrderOfficeCompanyCd(CK_EQ, orderOfficeCompanyCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)}
     * @param orderOfficeCompanyCd The value of orderOfficeCompanyCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderOfficeCompanyCd_NotEqual(String orderOfficeCompanyCd) {
        doSetOrderOfficeCompanyCd_NotEqual(fRES(orderOfficeCompanyCd));
    }

    protected void doSetOrderOfficeCompanyCd_NotEqual(String orderOfficeCompanyCd) {
        regOrderOfficeCompanyCd(CK_NES, orderOfficeCompanyCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)}
     * @param orderOfficeCompanyCd The value of orderOfficeCompanyCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderOfficeCompanyCd_GreaterThan(String orderOfficeCompanyCd) {
        regOrderOfficeCompanyCd(CK_GT, fRES(orderOfficeCompanyCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)}
     * @param orderOfficeCompanyCd The value of orderOfficeCompanyCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderOfficeCompanyCd_LessThan(String orderOfficeCompanyCd) {
        regOrderOfficeCompanyCd(CK_LT, fRES(orderOfficeCompanyCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)}
     * @param orderOfficeCompanyCd The value of orderOfficeCompanyCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderOfficeCompanyCd_GreaterEqual(String orderOfficeCompanyCd) {
        regOrderOfficeCompanyCd(CK_GE, fRES(orderOfficeCompanyCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)}
     * @param orderOfficeCompanyCd The value of orderOfficeCompanyCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderOfficeCompanyCd_LessEqual(String orderOfficeCompanyCd) {
        regOrderOfficeCompanyCd(CK_LE, fRES(orderOfficeCompanyCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)}
     * @param orderOfficeCompanyCdList The collection of orderOfficeCompanyCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderOfficeCompanyCd_InScope(Collection<String> orderOfficeCompanyCdList) {
        doSetOrderOfficeCompanyCd_InScope(orderOfficeCompanyCdList);
    }

    protected void doSetOrderOfficeCompanyCd_InScope(Collection<String> orderOfficeCompanyCdList) {
        regINS(CK_INS, cTL(orderOfficeCompanyCdList), xgetCValueOrderOfficeCompanyCd(), "ORDER_OFFICE_COMPANY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)}
     * @param orderOfficeCompanyCdList The collection of orderOfficeCompanyCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderOfficeCompanyCd_NotInScope(Collection<String> orderOfficeCompanyCdList) {
        doSetOrderOfficeCompanyCd_NotInScope(orderOfficeCompanyCdList);
    }

    protected void doSetOrderOfficeCompanyCd_NotInScope(Collection<String> orderOfficeCompanyCdList) {
        regINS(CK_NINS, cTL(orderOfficeCompanyCdList), xgetCValueOrderOfficeCompanyCd(), "ORDER_OFFICE_COMPANY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)} <br>
     * <pre>e.g. setOrderOfficeCompanyCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderOfficeCompanyCd The value of orderOfficeCompanyCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderOfficeCompanyCd_LikeSearch(String orderOfficeCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderOfficeCompanyCd), xgetCValueOrderOfficeCompanyCd(), "ORDER_OFFICE_COMPANY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)}
     * @param orderOfficeCompanyCd The value of orderOfficeCompanyCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderOfficeCompanyCd_NotLikeSearch(String orderOfficeCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderOfficeCompanyCd), xgetCValueOrderOfficeCompanyCd(), "ORDER_OFFICE_COMPANY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)}
     * @param orderOfficeCompanyCd The value of orderOfficeCompanyCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderOfficeCompanyCd_PrefixSearch(String orderOfficeCompanyCd) {
        setOrderOfficeCompanyCd_LikeSearch(orderOfficeCompanyCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)}
     */
    public void setOrderOfficeCompanyCd_IsNull() { regOrderOfficeCompanyCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)}
     */
    public void setOrderOfficeCompanyCd_IsNullOrEmpty() { regOrderOfficeCompanyCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)}
     */
    public void setOrderOfficeCompanyCd_IsNotNull() { regOrderOfficeCompanyCd(CK_ISNN, DOBJ); }

    protected void regOrderOfficeCompanyCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderOfficeCompanyCd(), "ORDER_OFFICE_COMPANY_CD"); }
    protected abstract ConditionValue xgetCValueOrderOfficeCompanyCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)}
     * @param orderSmarteditCompanyCd The value of orderSmarteditCompanyCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSmarteditCompanyCd_Equal(String orderSmarteditCompanyCd) {
        doSetOrderSmarteditCompanyCd_Equal(fRES(orderSmarteditCompanyCd));
    }

    protected void doSetOrderSmarteditCompanyCd_Equal(String orderSmarteditCompanyCd) {
        regOrderSmarteditCompanyCd(CK_EQ, orderSmarteditCompanyCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)}
     * @param orderSmarteditCompanyCd The value of orderSmarteditCompanyCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSmarteditCompanyCd_NotEqual(String orderSmarteditCompanyCd) {
        doSetOrderSmarteditCompanyCd_NotEqual(fRES(orderSmarteditCompanyCd));
    }

    protected void doSetOrderSmarteditCompanyCd_NotEqual(String orderSmarteditCompanyCd) {
        regOrderSmarteditCompanyCd(CK_NES, orderSmarteditCompanyCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)}
     * @param orderSmarteditCompanyCd The value of orderSmarteditCompanyCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSmarteditCompanyCd_GreaterThan(String orderSmarteditCompanyCd) {
        regOrderSmarteditCompanyCd(CK_GT, fRES(orderSmarteditCompanyCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)}
     * @param orderSmarteditCompanyCd The value of orderSmarteditCompanyCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSmarteditCompanyCd_LessThan(String orderSmarteditCompanyCd) {
        regOrderSmarteditCompanyCd(CK_LT, fRES(orderSmarteditCompanyCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)}
     * @param orderSmarteditCompanyCd The value of orderSmarteditCompanyCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSmarteditCompanyCd_GreaterEqual(String orderSmarteditCompanyCd) {
        regOrderSmarteditCompanyCd(CK_GE, fRES(orderSmarteditCompanyCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)}
     * @param orderSmarteditCompanyCd The value of orderSmarteditCompanyCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSmarteditCompanyCd_LessEqual(String orderSmarteditCompanyCd) {
        regOrderSmarteditCompanyCd(CK_LE, fRES(orderSmarteditCompanyCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)}
     * @param orderSmarteditCompanyCdList The collection of orderSmarteditCompanyCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSmarteditCompanyCd_InScope(Collection<String> orderSmarteditCompanyCdList) {
        doSetOrderSmarteditCompanyCd_InScope(orderSmarteditCompanyCdList);
    }

    protected void doSetOrderSmarteditCompanyCd_InScope(Collection<String> orderSmarteditCompanyCdList) {
        regINS(CK_INS, cTL(orderSmarteditCompanyCdList), xgetCValueOrderSmarteditCompanyCd(), "ORDER_SMARTEDIT_COMPANY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)}
     * @param orderSmarteditCompanyCdList The collection of orderSmarteditCompanyCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSmarteditCompanyCd_NotInScope(Collection<String> orderSmarteditCompanyCdList) {
        doSetOrderSmarteditCompanyCd_NotInScope(orderSmarteditCompanyCdList);
    }

    protected void doSetOrderSmarteditCompanyCd_NotInScope(Collection<String> orderSmarteditCompanyCdList) {
        regINS(CK_NINS, cTL(orderSmarteditCompanyCdList), xgetCValueOrderSmarteditCompanyCd(), "ORDER_SMARTEDIT_COMPANY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)} <br>
     * <pre>e.g. setOrderSmarteditCompanyCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderSmarteditCompanyCd The value of orderSmarteditCompanyCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderSmarteditCompanyCd_LikeSearch(String orderSmarteditCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderSmarteditCompanyCd), xgetCValueOrderSmarteditCompanyCd(), "ORDER_SMARTEDIT_COMPANY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)}
     * @param orderSmarteditCompanyCd The value of orderSmarteditCompanyCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderSmarteditCompanyCd_NotLikeSearch(String orderSmarteditCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderSmarteditCompanyCd), xgetCValueOrderSmarteditCompanyCd(), "ORDER_SMARTEDIT_COMPANY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)}
     * @param orderSmarteditCompanyCd The value of orderSmarteditCompanyCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSmarteditCompanyCd_PrefixSearch(String orderSmarteditCompanyCd) {
        setOrderSmarteditCompanyCd_LikeSearch(orderSmarteditCompanyCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)}
     */
    public void setOrderSmarteditCompanyCd_IsNull() { regOrderSmarteditCompanyCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)}
     */
    public void setOrderSmarteditCompanyCd_IsNullOrEmpty() { regOrderSmarteditCompanyCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)}
     */
    public void setOrderSmarteditCompanyCd_IsNotNull() { regOrderSmarteditCompanyCd(CK_ISNN, DOBJ); }

    protected void regOrderSmarteditCompanyCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderSmarteditCompanyCd(), "ORDER_SMARTEDIT_COMPANY_CD"); }
    protected abstract ConditionValue xgetCValueOrderSmarteditCompanyCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)}
     * @param supanddemTaxCompanyCd The value of supanddemTaxCompanyCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupanddemTaxCompanyCd_Equal(String supanddemTaxCompanyCd) {
        doSetSupanddemTaxCompanyCd_Equal(fRES(supanddemTaxCompanyCd));
    }

    protected void doSetSupanddemTaxCompanyCd_Equal(String supanddemTaxCompanyCd) {
        regSupanddemTaxCompanyCd(CK_EQ, supanddemTaxCompanyCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)}
     * @param supanddemTaxCompanyCd The value of supanddemTaxCompanyCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupanddemTaxCompanyCd_NotEqual(String supanddemTaxCompanyCd) {
        doSetSupanddemTaxCompanyCd_NotEqual(fRES(supanddemTaxCompanyCd));
    }

    protected void doSetSupanddemTaxCompanyCd_NotEqual(String supanddemTaxCompanyCd) {
        regSupanddemTaxCompanyCd(CK_NES, supanddemTaxCompanyCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)}
     * @param supanddemTaxCompanyCd The value of supanddemTaxCompanyCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupanddemTaxCompanyCd_GreaterThan(String supanddemTaxCompanyCd) {
        regSupanddemTaxCompanyCd(CK_GT, fRES(supanddemTaxCompanyCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)}
     * @param supanddemTaxCompanyCd The value of supanddemTaxCompanyCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupanddemTaxCompanyCd_LessThan(String supanddemTaxCompanyCd) {
        regSupanddemTaxCompanyCd(CK_LT, fRES(supanddemTaxCompanyCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)}
     * @param supanddemTaxCompanyCd The value of supanddemTaxCompanyCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupanddemTaxCompanyCd_GreaterEqual(String supanddemTaxCompanyCd) {
        regSupanddemTaxCompanyCd(CK_GE, fRES(supanddemTaxCompanyCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)}
     * @param supanddemTaxCompanyCd The value of supanddemTaxCompanyCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupanddemTaxCompanyCd_LessEqual(String supanddemTaxCompanyCd) {
        regSupanddemTaxCompanyCd(CK_LE, fRES(supanddemTaxCompanyCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)}
     * @param supanddemTaxCompanyCdList The collection of supanddemTaxCompanyCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupanddemTaxCompanyCd_InScope(Collection<String> supanddemTaxCompanyCdList) {
        doSetSupanddemTaxCompanyCd_InScope(supanddemTaxCompanyCdList);
    }

    protected void doSetSupanddemTaxCompanyCd_InScope(Collection<String> supanddemTaxCompanyCdList) {
        regINS(CK_INS, cTL(supanddemTaxCompanyCdList), xgetCValueSupanddemTaxCompanyCd(), "SUPANDDEM_TAX_COMPANY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)}
     * @param supanddemTaxCompanyCdList The collection of supanddemTaxCompanyCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupanddemTaxCompanyCd_NotInScope(Collection<String> supanddemTaxCompanyCdList) {
        doSetSupanddemTaxCompanyCd_NotInScope(supanddemTaxCompanyCdList);
    }

    protected void doSetSupanddemTaxCompanyCd_NotInScope(Collection<String> supanddemTaxCompanyCdList) {
        regINS(CK_NINS, cTL(supanddemTaxCompanyCdList), xgetCValueSupanddemTaxCompanyCd(), "SUPANDDEM_TAX_COMPANY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)} <br>
     * <pre>e.g. setSupanddemTaxCompanyCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supanddemTaxCompanyCd The value of supanddemTaxCompanyCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupanddemTaxCompanyCd_LikeSearch(String supanddemTaxCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supanddemTaxCompanyCd), xgetCValueSupanddemTaxCompanyCd(), "SUPANDDEM_TAX_COMPANY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)}
     * @param supanddemTaxCompanyCd The value of supanddemTaxCompanyCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupanddemTaxCompanyCd_NotLikeSearch(String supanddemTaxCompanyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supanddemTaxCompanyCd), xgetCValueSupanddemTaxCompanyCd(), "SUPANDDEM_TAX_COMPANY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)}
     * @param supanddemTaxCompanyCd The value of supanddemTaxCompanyCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupanddemTaxCompanyCd_PrefixSearch(String supanddemTaxCompanyCd) {
        setSupanddemTaxCompanyCd_LikeSearch(supanddemTaxCompanyCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)}
     */
    public void setSupanddemTaxCompanyCd_IsNull() { regSupanddemTaxCompanyCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)}
     */
    public void setSupanddemTaxCompanyCd_IsNullOrEmpty() { regSupanddemTaxCompanyCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)}
     */
    public void setSupanddemTaxCompanyCd_IsNotNull() { regSupanddemTaxCompanyCd(CK_ISNN, DOBJ); }

    protected void regSupanddemTaxCompanyCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupanddemTaxCompanyCd(), "SUPANDDEM_TAX_COMPANY_CD"); }
    protected abstract ConditionValue xgetCValueSupanddemTaxCompanyCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALID_FRDATEH: {varchar(255)}
     * @param validFrdateh The value of validFrdateh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidFrdateh_Equal(String validFrdateh) {
        doSetValidFrdateh_Equal(fRES(validFrdateh));
    }

    protected void doSetValidFrdateh_Equal(String validFrdateh) {
        regValidFrdateh(CK_EQ, validFrdateh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALID_FRDATEH: {varchar(255)}
     * @param validFrdateh The value of validFrdateh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidFrdateh_NotEqual(String validFrdateh) {
        doSetValidFrdateh_NotEqual(fRES(validFrdateh));
    }

    protected void doSetValidFrdateh_NotEqual(String validFrdateh) {
        regValidFrdateh(CK_NES, validFrdateh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALID_FRDATEH: {varchar(255)}
     * @param validFrdateh The value of validFrdateh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidFrdateh_GreaterThan(String validFrdateh) {
        regValidFrdateh(CK_GT, fRES(validFrdateh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALID_FRDATEH: {varchar(255)}
     * @param validFrdateh The value of validFrdateh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidFrdateh_LessThan(String validFrdateh) {
        regValidFrdateh(CK_LT, fRES(validFrdateh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALID_FRDATEH: {varchar(255)}
     * @param validFrdateh The value of validFrdateh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidFrdateh_GreaterEqual(String validFrdateh) {
        regValidFrdateh(CK_GE, fRES(validFrdateh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALID_FRDATEH: {varchar(255)}
     * @param validFrdateh The value of validFrdateh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidFrdateh_LessEqual(String validFrdateh) {
        regValidFrdateh(CK_LE, fRES(validFrdateh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VALID_FRDATEH: {varchar(255)}
     * @param validFrdatehList The collection of validFrdateh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidFrdateh_InScope(Collection<String> validFrdatehList) {
        doSetValidFrdateh_InScope(validFrdatehList);
    }

    protected void doSetValidFrdateh_InScope(Collection<String> validFrdatehList) {
        regINS(CK_INS, cTL(validFrdatehList), xgetCValueValidFrdateh(), "VALID_FRDATEH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VALID_FRDATEH: {varchar(255)}
     * @param validFrdatehList The collection of validFrdateh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidFrdateh_NotInScope(Collection<String> validFrdatehList) {
        doSetValidFrdateh_NotInScope(validFrdatehList);
    }

    protected void doSetValidFrdateh_NotInScope(Collection<String> validFrdatehList) {
        regINS(CK_NINS, cTL(validFrdatehList), xgetCValueValidFrdateh(), "VALID_FRDATEH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALID_FRDATEH: {varchar(255)} <br>
     * <pre>e.g. setValidFrdateh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param validFrdateh The value of validFrdateh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setValidFrdateh_LikeSearch(String validFrdateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(validFrdateh), xgetCValueValidFrdateh(), "VALID_FRDATEH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALID_FRDATEH: {varchar(255)}
     * @param validFrdateh The value of validFrdateh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setValidFrdateh_NotLikeSearch(String validFrdateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(validFrdateh), xgetCValueValidFrdateh(), "VALID_FRDATEH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALID_FRDATEH: {varchar(255)}
     * @param validFrdateh The value of validFrdateh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidFrdateh_PrefixSearch(String validFrdateh) {
        setValidFrdateh_LikeSearch(validFrdateh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VALID_FRDATEH: {varchar(255)}
     */
    public void setValidFrdateh_IsNull() { regValidFrdateh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VALID_FRDATEH: {varchar(255)}
     */
    public void setValidFrdateh_IsNullOrEmpty() { regValidFrdateh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VALID_FRDATEH: {varchar(255)}
     */
    public void setValidFrdateh_IsNotNull() { regValidFrdateh(CK_ISNN, DOBJ); }

    protected void regValidFrdateh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueValidFrdateh(), "VALID_FRDATEH"); }
    protected abstract ConditionValue xgetCValueValidFrdateh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALID_TODATEH: {varchar(255)}
     * @param validTodateh The value of validTodateh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidTodateh_Equal(String validTodateh) {
        doSetValidTodateh_Equal(fRES(validTodateh));
    }

    protected void doSetValidTodateh_Equal(String validTodateh) {
        regValidTodateh(CK_EQ, validTodateh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALID_TODATEH: {varchar(255)}
     * @param validTodateh The value of validTodateh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidTodateh_NotEqual(String validTodateh) {
        doSetValidTodateh_NotEqual(fRES(validTodateh));
    }

    protected void doSetValidTodateh_NotEqual(String validTodateh) {
        regValidTodateh(CK_NES, validTodateh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALID_TODATEH: {varchar(255)}
     * @param validTodateh The value of validTodateh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidTodateh_GreaterThan(String validTodateh) {
        regValidTodateh(CK_GT, fRES(validTodateh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALID_TODATEH: {varchar(255)}
     * @param validTodateh The value of validTodateh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidTodateh_LessThan(String validTodateh) {
        regValidTodateh(CK_LT, fRES(validTodateh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALID_TODATEH: {varchar(255)}
     * @param validTodateh The value of validTodateh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidTodateh_GreaterEqual(String validTodateh) {
        regValidTodateh(CK_GE, fRES(validTodateh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALID_TODATEH: {varchar(255)}
     * @param validTodateh The value of validTodateh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidTodateh_LessEqual(String validTodateh) {
        regValidTodateh(CK_LE, fRES(validTodateh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VALID_TODATEH: {varchar(255)}
     * @param validTodatehList The collection of validTodateh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidTodateh_InScope(Collection<String> validTodatehList) {
        doSetValidTodateh_InScope(validTodatehList);
    }

    protected void doSetValidTodateh_InScope(Collection<String> validTodatehList) {
        regINS(CK_INS, cTL(validTodatehList), xgetCValueValidTodateh(), "VALID_TODATEH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VALID_TODATEH: {varchar(255)}
     * @param validTodatehList The collection of validTodateh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidTodateh_NotInScope(Collection<String> validTodatehList) {
        doSetValidTodateh_NotInScope(validTodatehList);
    }

    protected void doSetValidTodateh_NotInScope(Collection<String> validTodatehList) {
        regINS(CK_NINS, cTL(validTodatehList), xgetCValueValidTodateh(), "VALID_TODATEH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALID_TODATEH: {varchar(255)} <br>
     * <pre>e.g. setValidTodateh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param validTodateh The value of validTodateh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setValidTodateh_LikeSearch(String validTodateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(validTodateh), xgetCValueValidTodateh(), "VALID_TODATEH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALID_TODATEH: {varchar(255)}
     * @param validTodateh The value of validTodateh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setValidTodateh_NotLikeSearch(String validTodateh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(validTodateh), xgetCValueValidTodateh(), "VALID_TODATEH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALID_TODATEH: {varchar(255)}
     * @param validTodateh The value of validTodateh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidTodateh_PrefixSearch(String validTodateh) {
        setValidTodateh_LikeSearch(validTodateh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VALID_TODATEH: {varchar(255)}
     */
    public void setValidTodateh_IsNull() { regValidTodateh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VALID_TODATEH: {varchar(255)}
     */
    public void setValidTodateh_IsNullOrEmpty() { regValidTodateh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VALID_TODATEH: {varchar(255)}
     */
    public void setValidTodateh_IsNotNull() { regValidTodateh(CK_ISNN, DOBJ); }

    protected void regValidTodateh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueValidTodateh(), "VALID_TODATEH"); }
    protected abstract ConditionValue xgetCValueValidTodateh();

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
    public HpSLCFunction<ETsnUserCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ETsnUserCB.class);
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
    public HpSLCFunction<ETsnUserCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ETsnUserCB.class);
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
    public HpSLCFunction<ETsnUserCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ETsnUserCB.class);
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
    public HpSLCFunction<ETsnUserCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ETsnUserCB.class);
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
    public HpSLCFunction<ETsnUserCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ETsnUserCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ETsnUserCB&gt;() {
     *     public void query(ETsnUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ETsnUserCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ETsnUserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ETsnUserCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ETsnUserCQ sq);

    protected ETsnUserCB xcreateScalarConditionCB() {
        ETsnUserCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ETsnUserCB xcreateScalarConditionPartitionByCB() {
        ETsnUserCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ETsnUserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ETsnUserCB cb = new ETsnUserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TSN_USER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ETsnUserCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ETsnUserCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ETsnUserCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ETsnUserCB cb = new ETsnUserCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TSN_USER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ETsnUserCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ETsnUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ETsnUserCB cb = new ETsnUserCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ETsnUserCQ sq);

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
    protected ETsnUserCB newMyCB() {
        return new ETsnUserCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ETsnUserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

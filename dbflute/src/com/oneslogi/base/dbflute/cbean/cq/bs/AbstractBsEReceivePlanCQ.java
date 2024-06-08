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
 * The abstract condition-query of E_RECEIVE_PLAN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEReceivePlanCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEReceivePlanCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_RECEIVE_PLAN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param receivePlanId The value of receivePlanId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanId_Equal(Long receivePlanId) {
        doSetReceivePlanId_Equal(receivePlanId);
    }

    protected void doSetReceivePlanId_Equal(Long receivePlanId) {
        regReceivePlanId(CK_EQ, receivePlanId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param receivePlanId The value of receivePlanId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanId_NotEqual(Long receivePlanId) {
        doSetReceivePlanId_NotEqual(receivePlanId);
    }

    protected void doSetReceivePlanId_NotEqual(Long receivePlanId) {
        regReceivePlanId(CK_NES, receivePlanId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param receivePlanId The value of receivePlanId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanId_GreaterThan(Long receivePlanId) {
        regReceivePlanId(CK_GT, receivePlanId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param receivePlanId The value of receivePlanId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanId_LessThan(Long receivePlanId) {
        regReceivePlanId(CK_LT, receivePlanId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param receivePlanId The value of receivePlanId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanId_GreaterEqual(Long receivePlanId) {
        regReceivePlanId(CK_GE, receivePlanId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param receivePlanId The value of receivePlanId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanId_LessEqual(Long receivePlanId) {
        regReceivePlanId(CK_LE, receivePlanId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of receivePlanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanId(), "RECEIVE_PLAN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param receivePlanIdList The collection of receivePlanId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanId_InScope(Collection<Long> receivePlanIdList) {
        doSetReceivePlanId_InScope(receivePlanIdList);
    }

    protected void doSetReceivePlanId_InScope(Collection<Long> receivePlanIdList) {
        regINS(CK_INS, cTL(receivePlanIdList), xgetCValueReceivePlanId(), "RECEIVE_PLAN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param receivePlanIdList The collection of receivePlanId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanId_NotInScope(Collection<Long> receivePlanIdList) {
        doSetReceivePlanId_NotInScope(receivePlanIdList);
    }

    protected void doSetReceivePlanId_NotInScope(Collection<Long> receivePlanIdList) {
        regINS(CK_NINS, cTL(receivePlanIdList), xgetCValueReceivePlanId(), "RECEIVE_PLAN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setReceivePlanId_IsNull() { regReceivePlanId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setReceivePlanId_IsNotNull() { regReceivePlanId(CK_ISNN, DOBJ); }

    protected void regReceivePlanId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanId(), "RECEIVE_PLAN_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_Equal(String receiveCd) {
        doSetReceiveCd_Equal(fRES(receiveCd));
    }

    protected void doSetReceiveCd_Equal(String receiveCd) {
        regReceiveCd(CK_EQ, receiveCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_NotEqual(String receiveCd) {
        doSetReceiveCd_NotEqual(fRES(receiveCd));
    }

    protected void doSetReceiveCd_NotEqual(String receiveCd) {
        regReceiveCd(CK_NES, receiveCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterThan(String receiveCd) {
        regReceiveCd(CK_GT, fRES(receiveCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessThan(String receiveCd) {
        regReceiveCd(CK_LT, fRES(receiveCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterEqual(String receiveCd) {
        regReceiveCd(CK_GE, fRES(receiveCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessEqual(String receiveCd) {
        regReceiveCd(CK_LE, fRES(receiveCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCdList The collection of receiveCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_InScope(Collection<String> receiveCdList) {
        doSetReceiveCd_InScope(receiveCdList);
    }

    protected void doSetReceiveCd_InScope(Collection<String> receiveCdList) {
        regINS(CK_INS, cTL(receiveCdList), xgetCValueReceiveCd(), "RECEIVE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCdList The collection of receiveCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_NotInScope(Collection<String> receiveCdList) {
        doSetReceiveCd_NotInScope(receiveCdList);
    }

    protected void doSetReceiveCd_NotInScope(Collection<String> receiveCdList) {
        regINS(CK_NINS, cTL(receiveCdList), xgetCValueReceiveCd(), "RECEIVE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setReceiveCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveCd The value of receiveCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveCd_LikeSearch(String receiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveCd), xgetCValueReceiveCd(), "RECEIVE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveCd_NotLikeSearch(String receiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveCd), xgetCValueReceiveCd(), "RECEIVE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_PrefixSearch(String receiveCd) {
        setReceiveCd_LikeSearch(receiveCd, xcLSOPPre());
    }

    protected void regReceiveCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveCd(), "RECEIVE_CD"); }
    protected abstract ConditionValue xgetCValueReceiveCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_Equal(Long receiveRowId) {
        doSetReceiveRowId_Equal(receiveRowId);
    }

    protected void doSetReceiveRowId_Equal(Long receiveRowId) {
        regReceiveRowId(CK_EQ, receiveRowId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_NotEqual(Long receiveRowId) {
        doSetReceiveRowId_NotEqual(receiveRowId);
    }

    protected void doSetReceiveRowId_NotEqual(Long receiveRowId) {
        regReceiveRowId(CK_NES, receiveRowId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterThan(Long receiveRowId) {
        regReceiveRowId(CK_GT, receiveRowId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessThan(Long receiveRowId) {
        regReceiveRowId(CK_LT, receiveRowId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterEqual(Long receiveRowId) {
        regReceiveRowId(CK_GE, receiveRowId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessEqual(Long receiveRowId) {
        regReceiveRowId(CK_LE, receiveRowId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @param minNumber The min number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveRowId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveRowId(), "RECEIVE_ROW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @param receiveRowIdList The collection of receiveRowId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRowId_InScope(Collection<Long> receiveRowIdList) {
        doSetReceiveRowId_InScope(receiveRowIdList);
    }

    protected void doSetReceiveRowId_InScope(Collection<Long> receiveRowIdList) {
        regINS(CK_INS, cTL(receiveRowIdList), xgetCValueReceiveRowId(), "RECEIVE_ROW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @param receiveRowIdList The collection of receiveRowId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRowId_NotInScope(Collection<Long> receiveRowIdList) {
        doSetReceiveRowId_NotInScope(receiveRowIdList);
    }

    protected void doSetReceiveRowId_NotInScope(Collection<Long> receiveRowIdList) {
        regINS(CK_NINS, cTL(receiveRowIdList), xgetCValueReceiveRowId(), "RECEIVE_ROW_ID");
    }

    protected void regReceiveRowId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveRowId(), "RECEIVE_ROW_ID"); }
    protected abstract ConditionValue xgetCValueReceiveRowId();

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
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal(String errorFlg) {
        doSetErrorFlg_Equal(fRES(errorFlg));
    }

    protected void doSetErrorFlg_Equal(String errorFlg) {
        regErrorFlg(CK_EQ, errorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual(String errorFlg) {
        doSetErrorFlg_NotEqual(fRES(errorFlg));
    }

    protected void doSetErrorFlg_NotEqual(String errorFlg) {
        regErrorFlg(CK_NES, errorFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterThan(String errorFlg) {
        regErrorFlg(CK_GT, fRES(errorFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessThan(String errorFlg) {
        regErrorFlg(CK_LT, fRES(errorFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterEqual(String errorFlg) {
        regErrorFlg(CK_GE, fRES(errorFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessEqual(String errorFlg) {
        regErrorFlg(CK_LE, fRES(errorFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlgList The collection of errorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope(Collection<String> errorFlgList) {
        doSetErrorFlg_InScope(errorFlgList);
    }

    protected void doSetErrorFlg_InScope(Collection<String> errorFlgList) {
        regINS(CK_INS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlgList The collection of errorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope(Collection<String> errorFlgList) {
        doSetErrorFlg_NotInScope(errorFlgList);
    }

    protected void doSetErrorFlg_NotInScope(Collection<String> errorFlgList) {
        regINS(CK_NINS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setErrorFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorFlg The value of errorFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorFlg_LikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorFlg_NotLikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_PrefixSearch(String errorFlg) {
        setErrorFlg_LikeSearch(errorFlg, xcLSOPPre());
    }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_Equal(String errorMessageCd) {
        doSetErrorMessageCd_Equal(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_Equal(String errorMessageCd) {
        regErrorMessageCd(CK_EQ, errorMessageCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotEqual(String errorMessageCd) {
        doSetErrorMessageCd_NotEqual(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_NotEqual(String errorMessageCd) {
        regErrorMessageCd(CK_NES, errorMessageCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterThan(String errorMessageCd) {
        regErrorMessageCd(CK_GT, fRES(errorMessageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessThan(String errorMessageCd) {
        regErrorMessageCd(CK_LT, fRES(errorMessageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterEqual(String errorMessageCd) {
        regErrorMessageCd(CK_GE, fRES(errorMessageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessEqual(String errorMessageCd) {
        regErrorMessageCd(CK_LE, fRES(errorMessageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCdList The collection of errorMessageCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_InScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        regINS(CK_INS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCdList The collection of errorMessageCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_NotInScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        regINS(CK_NINS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)} <br>
     * <pre>e.g. setErrorMessageCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorMessageCd The value of errorMessageCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorMessageCd_LikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMessageCd_NotLikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_PrefixSearch(String errorMessageCd) {
        setErrorMessageCd_LikeSearch(errorMessageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNull() { regErrorMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNullOrEmpty() { regErrorMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNotNull() { regErrorMessageCd(CK_ISNN, DOBJ); }

    protected void regErrorMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueErrorMessageCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_Equal(String clientCd) {
        doSetClientCd_Equal(fRES(clientCd));
    }

    protected void doSetClientCd_Equal(String clientCd) {
        regClientCd(CK_EQ, clientCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_NotEqual(String clientCd) {
        doSetClientCd_NotEqual(fRES(clientCd));
    }

    protected void doSetClientCd_NotEqual(String clientCd) {
        regClientCd(CK_NES, clientCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_GreaterThan(String clientCd) {
        regClientCd(CK_GT, fRES(clientCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_LessThan(String clientCd) {
        regClientCd(CK_LT, fRES(clientCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_GreaterEqual(String clientCd) {
        regClientCd(CK_GE, fRES(clientCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_LessEqual(String clientCd) {
        regClientCd(CK_LE, fRES(clientCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCdList The collection of clientCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_InScope(Collection<String> clientCdList) {
        doSetClientCd_InScope(clientCdList);
    }

    protected void doSetClientCd_InScope(Collection<String> clientCdList) {
        regINS(CK_INS, cTL(clientCdList), xgetCValueClientCd(), "CLIENT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCdList The collection of clientCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_NotInScope(Collection<String> clientCdList) {
        doSetClientCd_NotInScope(clientCdList);
    }

    protected void doSetClientCd_NotInScope(Collection<String> clientCdList) {
        regINS(CK_NINS, cTL(clientCdList), xgetCValueClientCd(), "CLIENT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(255)} <br>
     * <pre>e.g. setClientCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientCd The value of clientCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClientCd_LikeSearch(String clientCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientCd), xgetCValueClientCd(), "CLIENT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClientCd_NotLikeSearch(String clientCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientCd), xgetCValueClientCd(), "CLIENT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     * @param clientCd The value of clientCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_PrefixSearch(String clientCd) {
        setClientCd_LikeSearch(clientCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     */
    public void setClientCd_IsNull() { regClientCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     */
    public void setClientCd_IsNullOrEmpty() { regClientCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(255)}
     */
    public void setClientCd_IsNotNull() { regClientCd(CK_ISNN, DOBJ); }

    protected void regClientCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientCd(), "CLIENT_CD"); }
    protected abstract ConditionValue xgetCValueClientCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_Equal(String centerCd) {
        doSetCenterCd_Equal(fRES(centerCd));
    }

    protected void doSetCenterCd_Equal(String centerCd) {
        regCenterCd(CK_EQ, centerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotEqual(String centerCd) {
        doSetCenterCd_NotEqual(fRES(centerCd));
    }

    protected void doSetCenterCd_NotEqual(String centerCd) {
        regCenterCd(CK_NES, centerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCdList The collection of centerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_InScope(Collection<String> centerCdList) {
        doSetCenterCd_InScope(centerCdList);
    }

    protected void doSetCenterCd_InScope(Collection<String> centerCdList) {
        regINS(CK_INS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCdList The collection of centerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotInScope(Collection<String> centerCdList) {
        doSetCenterCd_NotInScope(centerCdList);
    }

    protected void doSetCenterCd_NotInScope(Collection<String> centerCdList) {
        regINS(CK_NINS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(255)} <br>
     * <pre>e.g. setCenterCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerCd The value of centerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterCd_LikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     */
    public void setCenterCd_IsNull() { regCenterCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     */
    public void setCenterCd_IsNullOrEmpty() { regCenterCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     */
    public void setCenterCd_IsNotNull() { regCenterCd(CK_ISNN, DOBJ); }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     * @param planClientReceiveNo The value of planClientReceiveNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_Equal(String planClientReceiveNo) {
        doSetPlanClientReceiveNo_Equal(fRES(planClientReceiveNo));
    }

    protected void doSetPlanClientReceiveNo_Equal(String planClientReceiveNo) {
        regPlanClientReceiveNo(CK_EQ, planClientReceiveNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     * @param planClientReceiveNo The value of planClientReceiveNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_NotEqual(String planClientReceiveNo) {
        doSetPlanClientReceiveNo_NotEqual(fRES(planClientReceiveNo));
    }

    protected void doSetPlanClientReceiveNo_NotEqual(String planClientReceiveNo) {
        regPlanClientReceiveNo(CK_NES, planClientReceiveNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     * @param planClientReceiveNo The value of planClientReceiveNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_GreaterThan(String planClientReceiveNo) {
        regPlanClientReceiveNo(CK_GT, fRES(planClientReceiveNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     * @param planClientReceiveNo The value of planClientReceiveNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_LessThan(String planClientReceiveNo) {
        regPlanClientReceiveNo(CK_LT, fRES(planClientReceiveNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     * @param planClientReceiveNo The value of planClientReceiveNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_GreaterEqual(String planClientReceiveNo) {
        regPlanClientReceiveNo(CK_GE, fRES(planClientReceiveNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     * @param planClientReceiveNo The value of planClientReceiveNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_LessEqual(String planClientReceiveNo) {
        regPlanClientReceiveNo(CK_LE, fRES(planClientReceiveNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     * @param planClientReceiveNoList The collection of planClientReceiveNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_InScope(Collection<String> planClientReceiveNoList) {
        doSetPlanClientReceiveNo_InScope(planClientReceiveNoList);
    }

    protected void doSetPlanClientReceiveNo_InScope(Collection<String> planClientReceiveNoList) {
        regINS(CK_INS, cTL(planClientReceiveNoList), xgetCValuePlanClientReceiveNo(), "PLAN_CLIENT_RECEIVE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     * @param planClientReceiveNoList The collection of planClientReceiveNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_NotInScope(Collection<String> planClientReceiveNoList) {
        doSetPlanClientReceiveNo_NotInScope(planClientReceiveNoList);
    }

    protected void doSetPlanClientReceiveNo_NotInScope(Collection<String> planClientReceiveNoList) {
        regINS(CK_NINS, cTL(planClientReceiveNoList), xgetCValuePlanClientReceiveNo(), "PLAN_CLIENT_RECEIVE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)} <br>
     * <pre>e.g. setPlanClientReceiveNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planClientReceiveNo The value of planClientReceiveNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanClientReceiveNo_LikeSearch(String planClientReceiveNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planClientReceiveNo), xgetCValuePlanClientReceiveNo(), "PLAN_CLIENT_RECEIVE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     * @param planClientReceiveNo The value of planClientReceiveNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanClientReceiveNo_NotLikeSearch(String planClientReceiveNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planClientReceiveNo), xgetCValuePlanClientReceiveNo(), "PLAN_CLIENT_RECEIVE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     * @param planClientReceiveNo The value of planClientReceiveNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_PrefixSearch(String planClientReceiveNo) {
        setPlanClientReceiveNo_LikeSearch(planClientReceiveNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     */
    public void setPlanClientReceiveNo_IsNull() { regPlanClientReceiveNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     */
    public void setPlanClientReceiveNo_IsNullOrEmpty() { regPlanClientReceiveNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     */
    public void setPlanClientReceiveNo_IsNotNull() { regPlanClientReceiveNo(CK_ISNN, DOBJ); }

    protected void regPlanClientReceiveNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanClientReceiveNo(), "PLAN_CLIENT_RECEIVE_NO"); }
    protected abstract ConditionValue xgetCValuePlanClientReceiveNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     * @param planSupplierCd The value of planSupplierCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_Equal(String planSupplierCd) {
        doSetPlanSupplierCd_Equal(fRES(planSupplierCd));
    }

    protected void doSetPlanSupplierCd_Equal(String planSupplierCd) {
        regPlanSupplierCd(CK_EQ, planSupplierCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     * @param planSupplierCd The value of planSupplierCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_NotEqual(String planSupplierCd) {
        doSetPlanSupplierCd_NotEqual(fRES(planSupplierCd));
    }

    protected void doSetPlanSupplierCd_NotEqual(String planSupplierCd) {
        regPlanSupplierCd(CK_NES, planSupplierCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     * @param planSupplierCd The value of planSupplierCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_GreaterThan(String planSupplierCd) {
        regPlanSupplierCd(CK_GT, fRES(planSupplierCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     * @param planSupplierCd The value of planSupplierCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_LessThan(String planSupplierCd) {
        regPlanSupplierCd(CK_LT, fRES(planSupplierCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     * @param planSupplierCd The value of planSupplierCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_GreaterEqual(String planSupplierCd) {
        regPlanSupplierCd(CK_GE, fRES(planSupplierCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     * @param planSupplierCd The value of planSupplierCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_LessEqual(String planSupplierCd) {
        regPlanSupplierCd(CK_LE, fRES(planSupplierCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     * @param planSupplierCdList The collection of planSupplierCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_InScope(Collection<String> planSupplierCdList) {
        doSetPlanSupplierCd_InScope(planSupplierCdList);
    }

    protected void doSetPlanSupplierCd_InScope(Collection<String> planSupplierCdList) {
        regINS(CK_INS, cTL(planSupplierCdList), xgetCValuePlanSupplierCd(), "PLAN_SUPPLIER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     * @param planSupplierCdList The collection of planSupplierCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_NotInScope(Collection<String> planSupplierCdList) {
        doSetPlanSupplierCd_NotInScope(planSupplierCdList);
    }

    protected void doSetPlanSupplierCd_NotInScope(Collection<String> planSupplierCdList) {
        regINS(CK_NINS, cTL(planSupplierCdList), xgetCValuePlanSupplierCd(), "PLAN_SUPPLIER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)} <br>
     * <pre>e.g. setPlanSupplierCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planSupplierCd The value of planSupplierCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanSupplierCd_LikeSearch(String planSupplierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planSupplierCd), xgetCValuePlanSupplierCd(), "PLAN_SUPPLIER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     * @param planSupplierCd The value of planSupplierCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanSupplierCd_NotLikeSearch(String planSupplierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planSupplierCd), xgetCValuePlanSupplierCd(), "PLAN_SUPPLIER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     * @param planSupplierCd The value of planSupplierCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_PrefixSearch(String planSupplierCd) {
        setPlanSupplierCd_LikeSearch(planSupplierCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     */
    public void setPlanSupplierCd_IsNull() { regPlanSupplierCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     */
    public void setPlanSupplierCd_IsNullOrEmpty() { regPlanSupplierCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {varchar(255)}
     */
    public void setPlanSupplierCd_IsNotNull() { regPlanSupplierCd(CK_ISNN, DOBJ); }

    protected void regPlanSupplierCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanSupplierCd(), "PLAN_SUPPLIER_CD"); }
    protected abstract ConditionValue xgetCValuePlanSupplierCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @param receivePlanDt The value of receivePlanDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_Equal(String receivePlanDt) {
        doSetReceivePlanDt_Equal(fRES(receivePlanDt));
    }

    protected void doSetReceivePlanDt_Equal(String receivePlanDt) {
        regReceivePlanDt(CK_EQ, receivePlanDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @param receivePlanDt The value of receivePlanDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_NotEqual(String receivePlanDt) {
        doSetReceivePlanDt_NotEqual(fRES(receivePlanDt));
    }

    protected void doSetReceivePlanDt_NotEqual(String receivePlanDt) {
        regReceivePlanDt(CK_NES, receivePlanDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @param receivePlanDt The value of receivePlanDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_GreaterThan(String receivePlanDt) {
        regReceivePlanDt(CK_GT, fRES(receivePlanDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @param receivePlanDt The value of receivePlanDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_LessThan(String receivePlanDt) {
        regReceivePlanDt(CK_LT, fRES(receivePlanDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @param receivePlanDt The value of receivePlanDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_GreaterEqual(String receivePlanDt) {
        regReceivePlanDt(CK_GE, fRES(receivePlanDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @param receivePlanDt The value of receivePlanDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_LessEqual(String receivePlanDt) {
        regReceivePlanDt(CK_LE, fRES(receivePlanDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @param receivePlanDtList The collection of receivePlanDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_InScope(Collection<String> receivePlanDtList) {
        doSetReceivePlanDt_InScope(receivePlanDtList);
    }

    protected void doSetReceivePlanDt_InScope(Collection<String> receivePlanDtList) {
        regINS(CK_INS, cTL(receivePlanDtList), xgetCValueReceivePlanDt(), "RECEIVE_PLAN_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @param receivePlanDtList The collection of receivePlanDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_NotInScope(Collection<String> receivePlanDtList) {
        doSetReceivePlanDt_NotInScope(receivePlanDtList);
    }

    protected void doSetReceivePlanDt_NotInScope(Collection<String> receivePlanDtList) {
        regINS(CK_NINS, cTL(receivePlanDtList), xgetCValueReceivePlanDt(), "RECEIVE_PLAN_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_DT: {varchar(255)} <br>
     * <pre>e.g. setReceivePlanDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivePlanDt The value of receivePlanDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivePlanDt_LikeSearch(String receivePlanDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivePlanDt), xgetCValueReceivePlanDt(), "RECEIVE_PLAN_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @param receivePlanDt The value of receivePlanDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivePlanDt_NotLikeSearch(String receivePlanDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivePlanDt), xgetCValueReceivePlanDt(), "RECEIVE_PLAN_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @param receivePlanDt The value of receivePlanDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_PrefixSearch(String receivePlanDt) {
        setReceivePlanDt_LikeSearch(receivePlanDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     */
    public void setReceivePlanDt_IsNull() { regReceivePlanDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     */
    public void setReceivePlanDt_IsNullOrEmpty() { regReceivePlanDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {varchar(255)}
     */
    public void setReceivePlanDt_IsNotNull() { regReceivePlanDt(CK_ISNN, DOBJ); }

    protected void regReceivePlanDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanDt(), "RECEIVE_PLAN_DT"); }
    protected abstract ConditionValue xgetCValueReceivePlanDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     * @param processTypeCd The value of processTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_Equal(String processTypeCd) {
        doSetProcessTypeCd_Equal(fRES(processTypeCd));
    }

    protected void doSetProcessTypeCd_Equal(String processTypeCd) {
        regProcessTypeCd(CK_EQ, processTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     * @param processTypeCd The value of processTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_NotEqual(String processTypeCd) {
        doSetProcessTypeCd_NotEqual(fRES(processTypeCd));
    }

    protected void doSetProcessTypeCd_NotEqual(String processTypeCd) {
        regProcessTypeCd(CK_NES, processTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     * @param processTypeCd The value of processTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_GreaterThan(String processTypeCd) {
        regProcessTypeCd(CK_GT, fRES(processTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     * @param processTypeCd The value of processTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_LessThan(String processTypeCd) {
        regProcessTypeCd(CK_LT, fRES(processTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     * @param processTypeCd The value of processTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_GreaterEqual(String processTypeCd) {
        regProcessTypeCd(CK_GE, fRES(processTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     * @param processTypeCd The value of processTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_LessEqual(String processTypeCd) {
        regProcessTypeCd(CK_LE, fRES(processTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     * @param processTypeCdList The collection of processTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_InScope(Collection<String> processTypeCdList) {
        doSetProcessTypeCd_InScope(processTypeCdList);
    }

    protected void doSetProcessTypeCd_InScope(Collection<String> processTypeCdList) {
        regINS(CK_INS, cTL(processTypeCdList), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     * @param processTypeCdList The collection of processTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_NotInScope(Collection<String> processTypeCdList) {
        doSetProcessTypeCd_NotInScope(processTypeCdList);
    }

    protected void doSetProcessTypeCd_NotInScope(Collection<String> processTypeCdList) {
        regINS(CK_NINS, cTL(processTypeCdList), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {varchar(255)} <br>
     * <pre>e.g. setProcessTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processTypeCd The value of processTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessTypeCd_LikeSearch(String processTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processTypeCd), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     * @param processTypeCd The value of processTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessTypeCd_NotLikeSearch(String processTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processTypeCd), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     * @param processTypeCd The value of processTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_PrefixSearch(String processTypeCd) {
        setProcessTypeCd_LikeSearch(processTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     */
    public void setProcessTypeCd_IsNull() { regProcessTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     */
    public void setProcessTypeCd_IsNullOrEmpty() { regProcessTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {varchar(255)}
     */
    public void setProcessTypeCd_IsNotNull() { regProcessTypeCd(CK_ISNN, DOBJ); }

    protected void regProcessTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueProcessTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     * @param stockTypeCd The value of stockTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_Equal(String stockTypeCd) {
        doSetStockTypeCd_Equal(fRES(stockTypeCd));
    }

    protected void doSetStockTypeCd_Equal(String stockTypeCd) {
        regStockTypeCd(CK_EQ, stockTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     * @param stockTypeCd The value of stockTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_NotEqual(String stockTypeCd) {
        doSetStockTypeCd_NotEqual(fRES(stockTypeCd));
    }

    protected void doSetStockTypeCd_NotEqual(String stockTypeCd) {
        regStockTypeCd(CK_NES, stockTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     * @param stockTypeCd The value of stockTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_GreaterThan(String stockTypeCd) {
        regStockTypeCd(CK_GT, fRES(stockTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     * @param stockTypeCd The value of stockTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_LessThan(String stockTypeCd) {
        regStockTypeCd(CK_LT, fRES(stockTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     * @param stockTypeCd The value of stockTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_GreaterEqual(String stockTypeCd) {
        regStockTypeCd(CK_GE, fRES(stockTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     * @param stockTypeCd The value of stockTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_LessEqual(String stockTypeCd) {
        regStockTypeCd(CK_LE, fRES(stockTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     * @param stockTypeCdList The collection of stockTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_InScope(Collection<String> stockTypeCdList) {
        doSetStockTypeCd_InScope(stockTypeCdList);
    }

    protected void doSetStockTypeCd_InScope(Collection<String> stockTypeCdList) {
        regINS(CK_INS, cTL(stockTypeCdList), xgetCValueStockTypeCd(), "STOCK_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     * @param stockTypeCdList The collection of stockTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_NotInScope(Collection<String> stockTypeCdList) {
        doSetStockTypeCd_NotInScope(stockTypeCdList);
    }

    protected void doSetStockTypeCd_NotInScope(Collection<String> stockTypeCdList) {
        regINS(CK_NINS, cTL(stockTypeCdList), xgetCValueStockTypeCd(), "STOCK_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(255)} <br>
     * <pre>e.g. setStockTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockTypeCd The value of stockTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockTypeCd_LikeSearch(String stockTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockTypeCd), xgetCValueStockTypeCd(), "STOCK_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     * @param stockTypeCd The value of stockTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockTypeCd_NotLikeSearch(String stockTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockTypeCd), xgetCValueStockTypeCd(), "STOCK_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     * @param stockTypeCd The value of stockTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_PrefixSearch(String stockTypeCd) {
        setStockTypeCd_LikeSearch(stockTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     */
    public void setStockTypeCd_IsNull() { regStockTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     */
    public void setStockTypeCd_IsNullOrEmpty() { regStockTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(255)}
     */
    public void setStockTypeCd_IsNotNull() { regStockTypeCd(CK_ISNN, DOBJ); }

    protected void regStockTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockTypeCd(), "STOCK_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueStockTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     * @param planDepositCd The value of planDepositCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_Equal(String planDepositCd) {
        doSetPlanDepositCd_Equal(fRES(planDepositCd));
    }

    protected void doSetPlanDepositCd_Equal(String planDepositCd) {
        regPlanDepositCd(CK_EQ, planDepositCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     * @param planDepositCd The value of planDepositCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_NotEqual(String planDepositCd) {
        doSetPlanDepositCd_NotEqual(fRES(planDepositCd));
    }

    protected void doSetPlanDepositCd_NotEqual(String planDepositCd) {
        regPlanDepositCd(CK_NES, planDepositCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     * @param planDepositCd The value of planDepositCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_GreaterThan(String planDepositCd) {
        regPlanDepositCd(CK_GT, fRES(planDepositCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     * @param planDepositCd The value of planDepositCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_LessThan(String planDepositCd) {
        regPlanDepositCd(CK_LT, fRES(planDepositCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     * @param planDepositCd The value of planDepositCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_GreaterEqual(String planDepositCd) {
        regPlanDepositCd(CK_GE, fRES(planDepositCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     * @param planDepositCd The value of planDepositCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_LessEqual(String planDepositCd) {
        regPlanDepositCd(CK_LE, fRES(planDepositCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     * @param planDepositCdList The collection of planDepositCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_InScope(Collection<String> planDepositCdList) {
        doSetPlanDepositCd_InScope(planDepositCdList);
    }

    protected void doSetPlanDepositCd_InScope(Collection<String> planDepositCdList) {
        regINS(CK_INS, cTL(planDepositCdList), xgetCValuePlanDepositCd(), "PLAN_DEPOSIT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     * @param planDepositCdList The collection of planDepositCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_NotInScope(Collection<String> planDepositCdList) {
        doSetPlanDepositCd_NotInScope(planDepositCdList);
    }

    protected void doSetPlanDepositCd_NotInScope(Collection<String> planDepositCdList) {
        regINS(CK_NINS, cTL(planDepositCdList), xgetCValuePlanDepositCd(), "PLAN_DEPOSIT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)} <br>
     * <pre>e.g. setPlanDepositCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planDepositCd The value of planDepositCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanDepositCd_LikeSearch(String planDepositCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planDepositCd), xgetCValuePlanDepositCd(), "PLAN_DEPOSIT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     * @param planDepositCd The value of planDepositCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanDepositCd_NotLikeSearch(String planDepositCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planDepositCd), xgetCValuePlanDepositCd(), "PLAN_DEPOSIT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     * @param planDepositCd The value of planDepositCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_PrefixSearch(String planDepositCd) {
        setPlanDepositCd_LikeSearch(planDepositCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     */
    public void setPlanDepositCd_IsNull() { regPlanDepositCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     */
    public void setPlanDepositCd_IsNullOrEmpty() { regPlanDepositCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {varchar(255)}
     */
    public void setPlanDepositCd_IsNotNull() { regPlanDepositCd(CK_ISNN, DOBJ); }

    protected void regPlanDepositCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanDepositCd(), "PLAN_DEPOSIT_CD"); }
    protected abstract ConditionValue xgetCValuePlanDepositCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)} <br>
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
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_Equal(String productNm) {
        doSetProductNm_Equal(fRES(productNm));
    }

    protected void doSetProductNm_Equal(String productNm) {
        regProductNm(CK_EQ, productNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_NotEqual(String productNm) {
        doSetProductNm_NotEqual(fRES(productNm));
    }

    protected void doSetProductNm_NotEqual(String productNm) {
        regProductNm(CK_NES, productNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterThan(String productNm) {
        regProductNm(CK_GT, fRES(productNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessThan(String productNm) {
        regProductNm(CK_LT, fRES(productNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterEqual(String productNm) {
        regProductNm(CK_GE, fRES(productNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessEqual(String productNm) {
        regProductNm(CK_LE, fRES(productNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNmList The collection of productNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_InScope(Collection<String> productNmList) {
        doSetProductNm_InScope(productNmList);
    }

    protected void doSetProductNm_InScope(Collection<String> productNmList) {
        regINS(CK_INS, cTL(productNmList), xgetCValueProductNm(), "PRODUCT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNmList The collection of productNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_NotInScope(Collection<String> productNmList) {
        doSetProductNm_NotInScope(productNmList);
    }

    protected void doSetProductNm_NotInScope(Collection<String> productNmList) {
        regINS(CK_NINS, cTL(productNmList), xgetCValueProductNm(), "PRODUCT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)} <br>
     * <pre>e.g. setProductNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productNm The value of productNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductNm_LikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNm_NotLikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_PrefixSearch(String productNm) {
        setProductNm_LikeSearch(productNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     */
    public void setProductNm_IsNull() { regProductNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     */
    public void setProductNm_IsNullOrEmpty() { regProductNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     */
    public void setProductNm_IsNotNull() { regProductNm(CK_ISNN, DOBJ); }

    protected void regProductNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductNm(), "PRODUCT_NM"); }
    protected abstract ConditionValue xgetCValueProductNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {varchar(255)}
     * @param planNum The value of planNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_Equal(String planNum) {
        doSetPlanNum_Equal(fRES(planNum));
    }

    protected void doSetPlanNum_Equal(String planNum) {
        regPlanNum(CK_EQ, planNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {varchar(255)}
     * @param planNum The value of planNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_NotEqual(String planNum) {
        doSetPlanNum_NotEqual(fRES(planNum));
    }

    protected void doSetPlanNum_NotEqual(String planNum) {
        regPlanNum(CK_NES, planNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {varchar(255)}
     * @param planNum The value of planNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_GreaterThan(String planNum) {
        regPlanNum(CK_GT, fRES(planNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {varchar(255)}
     * @param planNum The value of planNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_LessThan(String planNum) {
        regPlanNum(CK_LT, fRES(planNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {varchar(255)}
     * @param planNum The value of planNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_GreaterEqual(String planNum) {
        regPlanNum(CK_GE, fRES(planNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {varchar(255)}
     * @param planNum The value of planNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_LessEqual(String planNum) {
        regPlanNum(CK_LE, fRES(planNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_NUM: {varchar(255)}
     * @param planNumList The collection of planNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_InScope(Collection<String> planNumList) {
        doSetPlanNum_InScope(planNumList);
    }

    protected void doSetPlanNum_InScope(Collection<String> planNumList) {
        regINS(CK_INS, cTL(planNumList), xgetCValuePlanNum(), "PLAN_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_NUM: {varchar(255)}
     * @param planNumList The collection of planNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_NotInScope(Collection<String> planNumList) {
        doSetPlanNum_NotInScope(planNumList);
    }

    protected void doSetPlanNum_NotInScope(Collection<String> planNumList) {
        regINS(CK_NINS, cTL(planNumList), xgetCValuePlanNum(), "PLAN_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_NUM: {varchar(255)} <br>
     * <pre>e.g. setPlanNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planNum The value of planNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanNum_LikeSearch(String planNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planNum), xgetCValuePlanNum(), "PLAN_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_NUM: {varchar(255)}
     * @param planNum The value of planNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanNum_NotLikeSearch(String planNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planNum), xgetCValuePlanNum(), "PLAN_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_NUM: {varchar(255)}
     * @param planNum The value of planNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_PrefixSearch(String planNum) {
        setPlanNum_LikeSearch(planNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_NUM: {varchar(255)}
     */
    public void setPlanNum_IsNull() { regPlanNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_NUM: {varchar(255)}
     */
    public void setPlanNum_IsNullOrEmpty() { regPlanNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_NUM: {varchar(255)}
     */
    public void setPlanNum_IsNotNull() { regPlanNum(CK_ISNN, DOBJ); }

    protected void regPlanNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanNum(), "PLAN_NUM"); }
    protected abstract ConditionValue xgetCValuePlanNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     * @param planWarehouseCd The value of planWarehouseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_Equal(String planWarehouseCd) {
        doSetPlanWarehouseCd_Equal(fRES(planWarehouseCd));
    }

    protected void doSetPlanWarehouseCd_Equal(String planWarehouseCd) {
        regPlanWarehouseCd(CK_EQ, planWarehouseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     * @param planWarehouseCd The value of planWarehouseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_NotEqual(String planWarehouseCd) {
        doSetPlanWarehouseCd_NotEqual(fRES(planWarehouseCd));
    }

    protected void doSetPlanWarehouseCd_NotEqual(String planWarehouseCd) {
        regPlanWarehouseCd(CK_NES, planWarehouseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     * @param planWarehouseCd The value of planWarehouseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_GreaterThan(String planWarehouseCd) {
        regPlanWarehouseCd(CK_GT, fRES(planWarehouseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     * @param planWarehouseCd The value of planWarehouseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_LessThan(String planWarehouseCd) {
        regPlanWarehouseCd(CK_LT, fRES(planWarehouseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     * @param planWarehouseCd The value of planWarehouseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_GreaterEqual(String planWarehouseCd) {
        regPlanWarehouseCd(CK_GE, fRES(planWarehouseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     * @param planWarehouseCd The value of planWarehouseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_LessEqual(String planWarehouseCd) {
        regPlanWarehouseCd(CK_LE, fRES(planWarehouseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     * @param planWarehouseCdList The collection of planWarehouseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_InScope(Collection<String> planWarehouseCdList) {
        doSetPlanWarehouseCd_InScope(planWarehouseCdList);
    }

    protected void doSetPlanWarehouseCd_InScope(Collection<String> planWarehouseCdList) {
        regINS(CK_INS, cTL(planWarehouseCdList), xgetCValuePlanWarehouseCd(), "PLAN_WAREHOUSE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     * @param planWarehouseCdList The collection of planWarehouseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_NotInScope(Collection<String> planWarehouseCdList) {
        doSetPlanWarehouseCd_NotInScope(planWarehouseCdList);
    }

    protected void doSetPlanWarehouseCd_NotInScope(Collection<String> planWarehouseCdList) {
        regINS(CK_NINS, cTL(planWarehouseCdList), xgetCValuePlanWarehouseCd(), "PLAN_WAREHOUSE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)} <br>
     * <pre>e.g. setPlanWarehouseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planWarehouseCd The value of planWarehouseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanWarehouseCd_LikeSearch(String planWarehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planWarehouseCd), xgetCValuePlanWarehouseCd(), "PLAN_WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     * @param planWarehouseCd The value of planWarehouseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanWarehouseCd_NotLikeSearch(String planWarehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planWarehouseCd), xgetCValuePlanWarehouseCd(), "PLAN_WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     * @param planWarehouseCd The value of planWarehouseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_PrefixSearch(String planWarehouseCd) {
        setPlanWarehouseCd_LikeSearch(planWarehouseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     */
    public void setPlanWarehouseCd_IsNull() { regPlanWarehouseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     */
    public void setPlanWarehouseCd_IsNullOrEmpty() { regPlanWarehouseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     */
    public void setPlanWarehouseCd_IsNotNull() { regPlanWarehouseCd(CK_ISNN, DOBJ); }

    protected void regPlanWarehouseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanWarehouseCd(), "PLAN_WAREHOUSE_CD"); }
    protected abstract ConditionValue xgetCValuePlanWarehouseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     * @param planLocationCd The value of planLocationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_Equal(String planLocationCd) {
        doSetPlanLocationCd_Equal(fRES(planLocationCd));
    }

    protected void doSetPlanLocationCd_Equal(String planLocationCd) {
        regPlanLocationCd(CK_EQ, planLocationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     * @param planLocationCd The value of planLocationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_NotEqual(String planLocationCd) {
        doSetPlanLocationCd_NotEqual(fRES(planLocationCd));
    }

    protected void doSetPlanLocationCd_NotEqual(String planLocationCd) {
        regPlanLocationCd(CK_NES, planLocationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     * @param planLocationCd The value of planLocationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_GreaterThan(String planLocationCd) {
        regPlanLocationCd(CK_GT, fRES(planLocationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     * @param planLocationCd The value of planLocationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_LessThan(String planLocationCd) {
        regPlanLocationCd(CK_LT, fRES(planLocationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     * @param planLocationCd The value of planLocationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_GreaterEqual(String planLocationCd) {
        regPlanLocationCd(CK_GE, fRES(planLocationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     * @param planLocationCd The value of planLocationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_LessEqual(String planLocationCd) {
        regPlanLocationCd(CK_LE, fRES(planLocationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     * @param planLocationCdList The collection of planLocationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_InScope(Collection<String> planLocationCdList) {
        doSetPlanLocationCd_InScope(planLocationCdList);
    }

    protected void doSetPlanLocationCd_InScope(Collection<String> planLocationCdList) {
        regINS(CK_INS, cTL(planLocationCdList), xgetCValuePlanLocationCd(), "PLAN_LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     * @param planLocationCdList The collection of planLocationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_NotInScope(Collection<String> planLocationCdList) {
        doSetPlanLocationCd_NotInScope(planLocationCdList);
    }

    protected void doSetPlanLocationCd_NotInScope(Collection<String> planLocationCdList) {
        regINS(CK_NINS, cTL(planLocationCdList), xgetCValuePlanLocationCd(), "PLAN_LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LOCATION_CD: {varchar(255)} <br>
     * <pre>e.g. setPlanLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planLocationCd The value of planLocationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanLocationCd_LikeSearch(String planLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planLocationCd), xgetCValuePlanLocationCd(), "PLAN_LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     * @param planLocationCd The value of planLocationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanLocationCd_NotLikeSearch(String planLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planLocationCd), xgetCValuePlanLocationCd(), "PLAN_LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     * @param planLocationCd The value of planLocationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_PrefixSearch(String planLocationCd) {
        setPlanLocationCd_LikeSearch(planLocationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     */
    public void setPlanLocationCd_IsNull() { regPlanLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     */
    public void setPlanLocationCd_IsNullOrEmpty() { regPlanLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {varchar(255)}
     */
    public void setPlanLocationCd_IsNotNull() { regPlanLocationCd(CK_ISNN, DOBJ); }

    protected void regPlanLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanLocationCd(), "PLAN_LOCATION_CD"); }
    protected abstract ConditionValue xgetCValuePlanLocationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOT: {varchar(255)}
     * @param planLot The value of planLot as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_Equal(String planLot) {
        doSetPlanLot_Equal(fRES(planLot));
    }

    protected void doSetPlanLot_Equal(String planLot) {
        regPlanLot(CK_EQ, planLot);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOT: {varchar(255)}
     * @param planLot The value of planLot as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_NotEqual(String planLot) {
        doSetPlanLot_NotEqual(fRES(planLot));
    }

    protected void doSetPlanLot_NotEqual(String planLot) {
        regPlanLot(CK_NES, planLot);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOT: {varchar(255)}
     * @param planLot The value of planLot as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_GreaterThan(String planLot) {
        regPlanLot(CK_GT, fRES(planLot));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOT: {varchar(255)}
     * @param planLot The value of planLot as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_LessThan(String planLot) {
        regPlanLot(CK_LT, fRES(planLot));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOT: {varchar(255)}
     * @param planLot The value of planLot as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_GreaterEqual(String planLot) {
        regPlanLot(CK_GE, fRES(planLot));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOT: {varchar(255)}
     * @param planLot The value of planLot as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_LessEqual(String planLot) {
        regPlanLot(CK_LE, fRES(planLot));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_LOT: {varchar(255)}
     * @param planLotList The collection of planLot as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_InScope(Collection<String> planLotList) {
        doSetPlanLot_InScope(planLotList);
    }

    protected void doSetPlanLot_InScope(Collection<String> planLotList) {
        regINS(CK_INS, cTL(planLotList), xgetCValuePlanLot(), "PLAN_LOT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_LOT: {varchar(255)}
     * @param planLotList The collection of planLot as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_NotInScope(Collection<String> planLotList) {
        doSetPlanLot_NotInScope(planLotList);
    }

    protected void doSetPlanLot_NotInScope(Collection<String> planLotList) {
        regINS(CK_NINS, cTL(planLotList), xgetCValuePlanLot(), "PLAN_LOT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LOT: {varchar(255)} <br>
     * <pre>e.g. setPlanLot_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planLot The value of planLot as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanLot_LikeSearch(String planLot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planLot), xgetCValuePlanLot(), "PLAN_LOT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LOT: {varchar(255)}
     * @param planLot The value of planLot as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanLot_NotLikeSearch(String planLot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planLot), xgetCValuePlanLot(), "PLAN_LOT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LOT: {varchar(255)}
     * @param planLot The value of planLot as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_PrefixSearch(String planLot) {
        setPlanLot_LikeSearch(planLot, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_LOT: {varchar(255)}
     */
    public void setPlanLot_IsNull() { regPlanLot(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_LOT: {varchar(255)}
     */
    public void setPlanLot_IsNullOrEmpty() { regPlanLot(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_LOT: {varchar(255)}
     */
    public void setPlanLot_IsNotNull() { regPlanLot(CK_ISNN, DOBJ); }

    protected void regPlanLot(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanLot(), "PLAN_LOT"); }
    protected abstract ConditionValue xgetCValuePlanLot();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     * @param planLimitDt The value of planLimitDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_Equal(String planLimitDt) {
        doSetPlanLimitDt_Equal(fRES(planLimitDt));
    }

    protected void doSetPlanLimitDt_Equal(String planLimitDt) {
        regPlanLimitDt(CK_EQ, planLimitDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     * @param planLimitDt The value of planLimitDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_NotEqual(String planLimitDt) {
        doSetPlanLimitDt_NotEqual(fRES(planLimitDt));
    }

    protected void doSetPlanLimitDt_NotEqual(String planLimitDt) {
        regPlanLimitDt(CK_NES, planLimitDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     * @param planLimitDt The value of planLimitDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_GreaterThan(String planLimitDt) {
        regPlanLimitDt(CK_GT, fRES(planLimitDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     * @param planLimitDt The value of planLimitDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_LessThan(String planLimitDt) {
        regPlanLimitDt(CK_LT, fRES(planLimitDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     * @param planLimitDt The value of planLimitDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_GreaterEqual(String planLimitDt) {
        regPlanLimitDt(CK_GE, fRES(planLimitDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     * @param planLimitDt The value of planLimitDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_LessEqual(String planLimitDt) {
        regPlanLimitDt(CK_LE, fRES(planLimitDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     * @param planLimitDtList The collection of planLimitDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_InScope(Collection<String> planLimitDtList) {
        doSetPlanLimitDt_InScope(planLimitDtList);
    }

    protected void doSetPlanLimitDt_InScope(Collection<String> planLimitDtList) {
        regINS(CK_INS, cTL(planLimitDtList), xgetCValuePlanLimitDt(), "PLAN_LIMIT_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     * @param planLimitDtList The collection of planLimitDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_NotInScope(Collection<String> planLimitDtList) {
        doSetPlanLimitDt_NotInScope(planLimitDtList);
    }

    protected void doSetPlanLimitDt_NotInScope(Collection<String> planLimitDtList) {
        regINS(CK_NINS, cTL(planLimitDtList), xgetCValuePlanLimitDt(), "PLAN_LIMIT_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LIMIT_DT: {varchar(255)} <br>
     * <pre>e.g. setPlanLimitDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planLimitDt The value of planLimitDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanLimitDt_LikeSearch(String planLimitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planLimitDt), xgetCValuePlanLimitDt(), "PLAN_LIMIT_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     * @param planLimitDt The value of planLimitDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanLimitDt_NotLikeSearch(String planLimitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planLimitDt), xgetCValuePlanLimitDt(), "PLAN_LIMIT_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     * @param planLimitDt The value of planLimitDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_PrefixSearch(String planLimitDt) {
        setPlanLimitDt_LikeSearch(planLimitDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     */
    public void setPlanLimitDt_IsNull() { regPlanLimitDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     */
    public void setPlanLimitDt_IsNullOrEmpty() { regPlanLimitDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {varchar(255)}
     */
    public void setPlanLimitDt_IsNotNull() { regPlanLimitDt(CK_ISNN, DOBJ); }

    protected void regPlanLimitDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanLimitDt(), "PLAN_LIMIT_DT"); }
    protected abstract ConditionValue xgetCValuePlanLimitDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     * @param planClientOrderNo The value of planClientOrderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_Equal(String planClientOrderNo) {
        doSetPlanClientOrderNo_Equal(fRES(planClientOrderNo));
    }

    protected void doSetPlanClientOrderNo_Equal(String planClientOrderNo) {
        regPlanClientOrderNo(CK_EQ, planClientOrderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     * @param planClientOrderNo The value of planClientOrderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_NotEqual(String planClientOrderNo) {
        doSetPlanClientOrderNo_NotEqual(fRES(planClientOrderNo));
    }

    protected void doSetPlanClientOrderNo_NotEqual(String planClientOrderNo) {
        regPlanClientOrderNo(CK_NES, planClientOrderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     * @param planClientOrderNo The value of planClientOrderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_GreaterThan(String planClientOrderNo) {
        regPlanClientOrderNo(CK_GT, fRES(planClientOrderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     * @param planClientOrderNo The value of planClientOrderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_LessThan(String planClientOrderNo) {
        regPlanClientOrderNo(CK_LT, fRES(planClientOrderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     * @param planClientOrderNo The value of planClientOrderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_GreaterEqual(String planClientOrderNo) {
        regPlanClientOrderNo(CK_GE, fRES(planClientOrderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     * @param planClientOrderNo The value of planClientOrderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_LessEqual(String planClientOrderNo) {
        regPlanClientOrderNo(CK_LE, fRES(planClientOrderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     * @param planClientOrderNoList The collection of planClientOrderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_InScope(Collection<String> planClientOrderNoList) {
        doSetPlanClientOrderNo_InScope(planClientOrderNoList);
    }

    protected void doSetPlanClientOrderNo_InScope(Collection<String> planClientOrderNoList) {
        regINS(CK_INS, cTL(planClientOrderNoList), xgetCValuePlanClientOrderNo(), "PLAN_CLIENT_ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     * @param planClientOrderNoList The collection of planClientOrderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_NotInScope(Collection<String> planClientOrderNoList) {
        doSetPlanClientOrderNo_NotInScope(planClientOrderNoList);
    }

    protected void doSetPlanClientOrderNo_NotInScope(Collection<String> planClientOrderNoList) {
        regINS(CK_NINS, cTL(planClientOrderNoList), xgetCValuePlanClientOrderNo(), "PLAN_CLIENT_ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)} <br>
     * <pre>e.g. setPlanClientOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planClientOrderNo The value of planClientOrderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanClientOrderNo_LikeSearch(String planClientOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planClientOrderNo), xgetCValuePlanClientOrderNo(), "PLAN_CLIENT_ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     * @param planClientOrderNo The value of planClientOrderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanClientOrderNo_NotLikeSearch(String planClientOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planClientOrderNo), xgetCValuePlanClientOrderNo(), "PLAN_CLIENT_ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     * @param planClientOrderNo The value of planClientOrderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_PrefixSearch(String planClientOrderNo) {
        setPlanClientOrderNo_LikeSearch(planClientOrderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     */
    public void setPlanClientOrderNo_IsNull() { regPlanClientOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     */
    public void setPlanClientOrderNo_IsNullOrEmpty() { regPlanClientOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     */
    public void setPlanClientOrderNo_IsNotNull() { regPlanClientOrderNo(CK_ISNN, DOBJ); }

    protected void regPlanClientOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanClientOrderNo(), "PLAN_CLIENT_ORDER_NO"); }
    protected abstract ConditionValue xgetCValuePlanClientOrderNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_Equal(String spareStr1) {
        doSetSpareStr1_Equal(fRES(spareStr1));
    }

    protected void doSetSpareStr1_Equal(String spareStr1) {
        regSpareStr1(CK_EQ, spareStr1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_NotEqual(String spareStr1) {
        doSetSpareStr1_NotEqual(fRES(spareStr1));
    }

    protected void doSetSpareStr1_NotEqual(String spareStr1) {
        regSpareStr1(CK_NES, spareStr1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_GreaterThan(String spareStr1) {
        regSpareStr1(CK_GT, fRES(spareStr1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_LessThan(String spareStr1) {
        regSpareStr1(CK_LT, fRES(spareStr1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_GreaterEqual(String spareStr1) {
        regSpareStr1(CK_GE, fRES(spareStr1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_LessEqual(String spareStr1) {
        regSpareStr1(CK_LE, fRES(spareStr1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1List The collection of spareStr1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_InScope(Collection<String> spareStr1List) {
        doSetSpareStr1_InScope(spareStr1List);
    }

    protected void doSetSpareStr1_InScope(Collection<String> spareStr1List) {
        regINS(CK_INS, cTL(spareStr1List), xgetCValueSpareStr1(), "SPARE_STR_1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1List The collection of spareStr1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_NotInScope(Collection<String> spareStr1List) {
        doSetSpareStr1_NotInScope(spareStr1List);
    }

    protected void doSetSpareStr1_NotInScope(Collection<String> spareStr1List) {
        regINS(CK_NINS, cTL(spareStr1List), xgetCValueSpareStr1(), "SPARE_STR_1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_1: {varchar(255)} <br>
     * <pre>e.g. setSpareStr1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareStr1 The value of spareStr1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareStr1_LikeSearch(String spareStr1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareStr1), xgetCValueSpareStr1(), "SPARE_STR_1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareStr1_NotLikeSearch(String spareStr1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareStr1), xgetCValueSpareStr1(), "SPARE_STR_1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_PrefixSearch(String spareStr1) {
        setSpareStr1_LikeSearch(spareStr1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     */
    public void setSpareStr1_IsNull() { regSpareStr1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     */
    public void setSpareStr1_IsNullOrEmpty() { regSpareStr1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     */
    public void setSpareStr1_IsNotNull() { regSpareStr1(CK_ISNN, DOBJ); }

    protected void regSpareStr1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareStr1(), "SPARE_STR_1"); }
    protected abstract ConditionValue xgetCValueSpareStr1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_Equal(String spareStr2) {
        doSetSpareStr2_Equal(fRES(spareStr2));
    }

    protected void doSetSpareStr2_Equal(String spareStr2) {
        regSpareStr2(CK_EQ, spareStr2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_NotEqual(String spareStr2) {
        doSetSpareStr2_NotEqual(fRES(spareStr2));
    }

    protected void doSetSpareStr2_NotEqual(String spareStr2) {
        regSpareStr2(CK_NES, spareStr2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_GreaterThan(String spareStr2) {
        regSpareStr2(CK_GT, fRES(spareStr2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_LessThan(String spareStr2) {
        regSpareStr2(CK_LT, fRES(spareStr2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_GreaterEqual(String spareStr2) {
        regSpareStr2(CK_GE, fRES(spareStr2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_LessEqual(String spareStr2) {
        regSpareStr2(CK_LE, fRES(spareStr2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2List The collection of spareStr2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_InScope(Collection<String> spareStr2List) {
        doSetSpareStr2_InScope(spareStr2List);
    }

    protected void doSetSpareStr2_InScope(Collection<String> spareStr2List) {
        regINS(CK_INS, cTL(spareStr2List), xgetCValueSpareStr2(), "SPARE_STR_2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2List The collection of spareStr2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_NotInScope(Collection<String> spareStr2List) {
        doSetSpareStr2_NotInScope(spareStr2List);
    }

    protected void doSetSpareStr2_NotInScope(Collection<String> spareStr2List) {
        regINS(CK_NINS, cTL(spareStr2List), xgetCValueSpareStr2(), "SPARE_STR_2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_2: {varchar(255)} <br>
     * <pre>e.g. setSpareStr2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareStr2 The value of spareStr2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareStr2_LikeSearch(String spareStr2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareStr2), xgetCValueSpareStr2(), "SPARE_STR_2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareStr2_NotLikeSearch(String spareStr2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareStr2), xgetCValueSpareStr2(), "SPARE_STR_2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_PrefixSearch(String spareStr2) {
        setSpareStr2_LikeSearch(spareStr2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     */
    public void setSpareStr2_IsNull() { regSpareStr2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     */
    public void setSpareStr2_IsNullOrEmpty() { regSpareStr2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     */
    public void setSpareStr2_IsNotNull() { regSpareStr2(CK_ISNN, DOBJ); }

    protected void regSpareStr2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareStr2(), "SPARE_STR_2"); }
    protected abstract ConditionValue xgetCValueSpareStr2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_Equal(String spareStr3) {
        doSetSpareStr3_Equal(fRES(spareStr3));
    }

    protected void doSetSpareStr3_Equal(String spareStr3) {
        regSpareStr3(CK_EQ, spareStr3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_NotEqual(String spareStr3) {
        doSetSpareStr3_NotEqual(fRES(spareStr3));
    }

    protected void doSetSpareStr3_NotEqual(String spareStr3) {
        regSpareStr3(CK_NES, spareStr3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_GreaterThan(String spareStr3) {
        regSpareStr3(CK_GT, fRES(spareStr3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_LessThan(String spareStr3) {
        regSpareStr3(CK_LT, fRES(spareStr3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_GreaterEqual(String spareStr3) {
        regSpareStr3(CK_GE, fRES(spareStr3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_LessEqual(String spareStr3) {
        regSpareStr3(CK_LE, fRES(spareStr3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3List The collection of spareStr3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_InScope(Collection<String> spareStr3List) {
        doSetSpareStr3_InScope(spareStr3List);
    }

    protected void doSetSpareStr3_InScope(Collection<String> spareStr3List) {
        regINS(CK_INS, cTL(spareStr3List), xgetCValueSpareStr3(), "SPARE_STR_3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3List The collection of spareStr3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_NotInScope(Collection<String> spareStr3List) {
        doSetSpareStr3_NotInScope(spareStr3List);
    }

    protected void doSetSpareStr3_NotInScope(Collection<String> spareStr3List) {
        regINS(CK_NINS, cTL(spareStr3List), xgetCValueSpareStr3(), "SPARE_STR_3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_3: {varchar(255)} <br>
     * <pre>e.g. setSpareStr3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareStr3 The value of spareStr3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareStr3_LikeSearch(String spareStr3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareStr3), xgetCValueSpareStr3(), "SPARE_STR_3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareStr3_NotLikeSearch(String spareStr3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareStr3), xgetCValueSpareStr3(), "SPARE_STR_3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_PrefixSearch(String spareStr3) {
        setSpareStr3_LikeSearch(spareStr3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     */
    public void setSpareStr3_IsNull() { regSpareStr3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     */
    public void setSpareStr3_IsNullOrEmpty() { regSpareStr3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     */
    public void setSpareStr3_IsNotNull() { regSpareStr3(CK_ISNN, DOBJ); }

    protected void regSpareStr3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareStr3(), "SPARE_STR_3"); }
    protected abstract ConditionValue xgetCValueSpareStr3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {varchar(255)}
     * @param spareNum1 The value of spareNum1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum1_Equal(String spareNum1) {
        doSetSpareNum1_Equal(fRES(spareNum1));
    }

    protected void doSetSpareNum1_Equal(String spareNum1) {
        regSpareNum1(CK_EQ, spareNum1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {varchar(255)}
     * @param spareNum1 The value of spareNum1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum1_NotEqual(String spareNum1) {
        doSetSpareNum1_NotEqual(fRES(spareNum1));
    }

    protected void doSetSpareNum1_NotEqual(String spareNum1) {
        regSpareNum1(CK_NES, spareNum1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {varchar(255)}
     * @param spareNum1 The value of spareNum1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum1_GreaterThan(String spareNum1) {
        regSpareNum1(CK_GT, fRES(spareNum1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {varchar(255)}
     * @param spareNum1 The value of spareNum1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum1_LessThan(String spareNum1) {
        regSpareNum1(CK_LT, fRES(spareNum1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {varchar(255)}
     * @param spareNum1 The value of spareNum1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum1_GreaterEqual(String spareNum1) {
        regSpareNum1(CK_GE, fRES(spareNum1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {varchar(255)}
     * @param spareNum1 The value of spareNum1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum1_LessEqual(String spareNum1) {
        regSpareNum1(CK_LE, fRES(spareNum1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_NUM_1: {varchar(255)}
     * @param spareNum1List The collection of spareNum1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum1_InScope(Collection<String> spareNum1List) {
        doSetSpareNum1_InScope(spareNum1List);
    }

    protected void doSetSpareNum1_InScope(Collection<String> spareNum1List) {
        regINS(CK_INS, cTL(spareNum1List), xgetCValueSpareNum1(), "SPARE_NUM_1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_NUM_1: {varchar(255)}
     * @param spareNum1List The collection of spareNum1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum1_NotInScope(Collection<String> spareNum1List) {
        doSetSpareNum1_NotInScope(spareNum1List);
    }

    protected void doSetSpareNum1_NotInScope(Collection<String> spareNum1List) {
        regINS(CK_NINS, cTL(spareNum1List), xgetCValueSpareNum1(), "SPARE_NUM_1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_NUM_1: {varchar(255)} <br>
     * <pre>e.g. setSpareNum1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareNum1 The value of spareNum1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareNum1_LikeSearch(String spareNum1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareNum1), xgetCValueSpareNum1(), "SPARE_NUM_1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_NUM_1: {varchar(255)}
     * @param spareNum1 The value of spareNum1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareNum1_NotLikeSearch(String spareNum1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareNum1), xgetCValueSpareNum1(), "SPARE_NUM_1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_NUM_1: {varchar(255)}
     * @param spareNum1 The value of spareNum1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum1_PrefixSearch(String spareNum1) {
        setSpareNum1_LikeSearch(spareNum1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {varchar(255)}
     */
    public void setSpareNum1_IsNull() { regSpareNum1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {varchar(255)}
     */
    public void setSpareNum1_IsNullOrEmpty() { regSpareNum1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {varchar(255)}
     */
    public void setSpareNum1_IsNotNull() { regSpareNum1(CK_ISNN, DOBJ); }

    protected void regSpareNum1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareNum1(), "SPARE_NUM_1"); }
    protected abstract ConditionValue xgetCValueSpareNum1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {varchar(255)}
     * @param spareNum2 The value of spareNum2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum2_Equal(String spareNum2) {
        doSetSpareNum2_Equal(fRES(spareNum2));
    }

    protected void doSetSpareNum2_Equal(String spareNum2) {
        regSpareNum2(CK_EQ, spareNum2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {varchar(255)}
     * @param spareNum2 The value of spareNum2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum2_NotEqual(String spareNum2) {
        doSetSpareNum2_NotEqual(fRES(spareNum2));
    }

    protected void doSetSpareNum2_NotEqual(String spareNum2) {
        regSpareNum2(CK_NES, spareNum2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {varchar(255)}
     * @param spareNum2 The value of spareNum2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum2_GreaterThan(String spareNum2) {
        regSpareNum2(CK_GT, fRES(spareNum2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {varchar(255)}
     * @param spareNum2 The value of spareNum2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum2_LessThan(String spareNum2) {
        regSpareNum2(CK_LT, fRES(spareNum2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {varchar(255)}
     * @param spareNum2 The value of spareNum2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum2_GreaterEqual(String spareNum2) {
        regSpareNum2(CK_GE, fRES(spareNum2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {varchar(255)}
     * @param spareNum2 The value of spareNum2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum2_LessEqual(String spareNum2) {
        regSpareNum2(CK_LE, fRES(spareNum2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_NUM_2: {varchar(255)}
     * @param spareNum2List The collection of spareNum2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum2_InScope(Collection<String> spareNum2List) {
        doSetSpareNum2_InScope(spareNum2List);
    }

    protected void doSetSpareNum2_InScope(Collection<String> spareNum2List) {
        regINS(CK_INS, cTL(spareNum2List), xgetCValueSpareNum2(), "SPARE_NUM_2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_NUM_2: {varchar(255)}
     * @param spareNum2List The collection of spareNum2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum2_NotInScope(Collection<String> spareNum2List) {
        doSetSpareNum2_NotInScope(spareNum2List);
    }

    protected void doSetSpareNum2_NotInScope(Collection<String> spareNum2List) {
        regINS(CK_NINS, cTL(spareNum2List), xgetCValueSpareNum2(), "SPARE_NUM_2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_NUM_2: {varchar(255)} <br>
     * <pre>e.g. setSpareNum2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareNum2 The value of spareNum2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareNum2_LikeSearch(String spareNum2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareNum2), xgetCValueSpareNum2(), "SPARE_NUM_2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_NUM_2: {varchar(255)}
     * @param spareNum2 The value of spareNum2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareNum2_NotLikeSearch(String spareNum2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareNum2), xgetCValueSpareNum2(), "SPARE_NUM_2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_NUM_2: {varchar(255)}
     * @param spareNum2 The value of spareNum2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum2_PrefixSearch(String spareNum2) {
        setSpareNum2_LikeSearch(spareNum2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {varchar(255)}
     */
    public void setSpareNum2_IsNull() { regSpareNum2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {varchar(255)}
     */
    public void setSpareNum2_IsNullOrEmpty() { regSpareNum2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {varchar(255)}
     */
    public void setSpareNum2_IsNotNull() { regSpareNum2(CK_ISNN, DOBJ); }

    protected void regSpareNum2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareNum2(), "SPARE_NUM_2"); }
    protected abstract ConditionValue xgetCValueSpareNum2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {varchar(255)}
     * @param spareNum3 The value of spareNum3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum3_Equal(String spareNum3) {
        doSetSpareNum3_Equal(fRES(spareNum3));
    }

    protected void doSetSpareNum3_Equal(String spareNum3) {
        regSpareNum3(CK_EQ, spareNum3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {varchar(255)}
     * @param spareNum3 The value of spareNum3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum3_NotEqual(String spareNum3) {
        doSetSpareNum3_NotEqual(fRES(spareNum3));
    }

    protected void doSetSpareNum3_NotEqual(String spareNum3) {
        regSpareNum3(CK_NES, spareNum3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {varchar(255)}
     * @param spareNum3 The value of spareNum3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum3_GreaterThan(String spareNum3) {
        regSpareNum3(CK_GT, fRES(spareNum3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {varchar(255)}
     * @param spareNum3 The value of spareNum3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum3_LessThan(String spareNum3) {
        regSpareNum3(CK_LT, fRES(spareNum3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {varchar(255)}
     * @param spareNum3 The value of spareNum3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum3_GreaterEqual(String spareNum3) {
        regSpareNum3(CK_GE, fRES(spareNum3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {varchar(255)}
     * @param spareNum3 The value of spareNum3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum3_LessEqual(String spareNum3) {
        regSpareNum3(CK_LE, fRES(spareNum3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_NUM_3: {varchar(255)}
     * @param spareNum3List The collection of spareNum3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum3_InScope(Collection<String> spareNum3List) {
        doSetSpareNum3_InScope(spareNum3List);
    }

    protected void doSetSpareNum3_InScope(Collection<String> spareNum3List) {
        regINS(CK_INS, cTL(spareNum3List), xgetCValueSpareNum3(), "SPARE_NUM_3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_NUM_3: {varchar(255)}
     * @param spareNum3List The collection of spareNum3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum3_NotInScope(Collection<String> spareNum3List) {
        doSetSpareNum3_NotInScope(spareNum3List);
    }

    protected void doSetSpareNum3_NotInScope(Collection<String> spareNum3List) {
        regINS(CK_NINS, cTL(spareNum3List), xgetCValueSpareNum3(), "SPARE_NUM_3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_NUM_3: {varchar(255)} <br>
     * <pre>e.g. setSpareNum3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareNum3 The value of spareNum3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareNum3_LikeSearch(String spareNum3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareNum3), xgetCValueSpareNum3(), "SPARE_NUM_3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_NUM_3: {varchar(255)}
     * @param spareNum3 The value of spareNum3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareNum3_NotLikeSearch(String spareNum3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareNum3), xgetCValueSpareNum3(), "SPARE_NUM_3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_NUM_3: {varchar(255)}
     * @param spareNum3 The value of spareNum3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum3_PrefixSearch(String spareNum3) {
        setSpareNum3_LikeSearch(spareNum3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {varchar(255)}
     */
    public void setSpareNum3_IsNull() { regSpareNum3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {varchar(255)}
     */
    public void setSpareNum3_IsNullOrEmpty() { regSpareNum3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {varchar(255)}
     */
    public void setSpareNum3_IsNotNull() { regSpareNum3(CK_ISNN, DOBJ); }

    protected void regSpareNum3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareNum3(), "SPARE_NUM_3"); }
    protected abstract ConditionValue xgetCValueSpareNum3();

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
    public HpSLCFunction<EReceivePlanCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EReceivePlanCB.class);
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
    public HpSLCFunction<EReceivePlanCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EReceivePlanCB.class);
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
    public HpSLCFunction<EReceivePlanCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EReceivePlanCB.class);
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
    public HpSLCFunction<EReceivePlanCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EReceivePlanCB.class);
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
    public HpSLCFunction<EReceivePlanCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EReceivePlanCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EReceivePlanCB&gt;() {
     *     public void query(EReceivePlanCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EReceivePlanCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EReceivePlanCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EReceivePlanCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EReceivePlanCQ sq);

    protected EReceivePlanCB xcreateScalarConditionCB() {
        EReceivePlanCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EReceivePlanCB xcreateScalarConditionPartitionByCB() {
        EReceivePlanCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EReceivePlanCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EReceivePlanCB cb = new EReceivePlanCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "RECEIVE_PLAN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EReceivePlanCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EReceivePlanCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EReceivePlanCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EReceivePlanCB cb = new EReceivePlanCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "RECEIVE_PLAN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EReceivePlanCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EReceivePlanCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EReceivePlanCB cb = new EReceivePlanCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EReceivePlanCQ sq);

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
    protected EReceivePlanCB newMyCB() {
        return new EReceivePlanCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EReceivePlanCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

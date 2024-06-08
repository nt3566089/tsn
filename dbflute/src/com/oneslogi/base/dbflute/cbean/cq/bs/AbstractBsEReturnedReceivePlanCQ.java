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
 * The abstract condition-query of E_RETURNED_RECEIVE_PLAN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEReturnedReceivePlanCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEReturnedReceivePlanCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_RETURNED_RECEIVE_PLAN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param returnedReceivePlanId The value of returnedReceivePlanId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReturnedReceivePlanId_Equal(Long returnedReceivePlanId) {
        doSetReturnedReceivePlanId_Equal(returnedReceivePlanId);
    }

    protected void doSetReturnedReceivePlanId_Equal(Long returnedReceivePlanId) {
        regReturnedReceivePlanId(CK_EQ, returnedReceivePlanId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param returnedReceivePlanId The value of returnedReceivePlanId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReturnedReceivePlanId_NotEqual(Long returnedReceivePlanId) {
        doSetReturnedReceivePlanId_NotEqual(returnedReceivePlanId);
    }

    protected void doSetReturnedReceivePlanId_NotEqual(Long returnedReceivePlanId) {
        regReturnedReceivePlanId(CK_NES, returnedReceivePlanId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param returnedReceivePlanId The value of returnedReceivePlanId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReturnedReceivePlanId_GreaterThan(Long returnedReceivePlanId) {
        regReturnedReceivePlanId(CK_GT, returnedReceivePlanId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param returnedReceivePlanId The value of returnedReceivePlanId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReturnedReceivePlanId_LessThan(Long returnedReceivePlanId) {
        regReturnedReceivePlanId(CK_LT, returnedReceivePlanId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param returnedReceivePlanId The value of returnedReceivePlanId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReturnedReceivePlanId_GreaterEqual(Long returnedReceivePlanId) {
        regReturnedReceivePlanId(CK_GE, returnedReceivePlanId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param returnedReceivePlanId The value of returnedReceivePlanId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReturnedReceivePlanId_LessEqual(Long returnedReceivePlanId) {
        regReturnedReceivePlanId(CK_LE, returnedReceivePlanId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of returnedReceivePlanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of returnedReceivePlanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReturnedReceivePlanId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReturnedReceivePlanId(), "RETURNED_RECEIVE_PLAN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param returnedReceivePlanIdList The collection of returnedReceivePlanId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReturnedReceivePlanId_InScope(Collection<Long> returnedReceivePlanIdList) {
        doSetReturnedReceivePlanId_InScope(returnedReceivePlanIdList);
    }

    protected void doSetReturnedReceivePlanId_InScope(Collection<Long> returnedReceivePlanIdList) {
        regINS(CK_INS, cTL(returnedReceivePlanIdList), xgetCValueReturnedReceivePlanId(), "RETURNED_RECEIVE_PLAN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param returnedReceivePlanIdList The collection of returnedReceivePlanId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReturnedReceivePlanId_NotInScope(Collection<Long> returnedReceivePlanIdList) {
        doSetReturnedReceivePlanId_NotInScope(returnedReceivePlanIdList);
    }

    protected void doSetReturnedReceivePlanId_NotInScope(Collection<Long> returnedReceivePlanIdList) {
        regINS(CK_NINS, cTL(returnedReceivePlanIdList), xgetCValueReturnedReceivePlanId(), "RETURNED_RECEIVE_PLAN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setReturnedReceivePlanId_IsNull() { regReturnedReceivePlanId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setReturnedReceivePlanId_IsNotNull() { regReturnedReceivePlanId(CK_ISNN, DOBJ); }

    protected void regReturnedReceivePlanId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReturnedReceivePlanId(), "RETURNED_RECEIVE_PLAN_ID"); }
    protected abstract ConditionValue xgetCValueReturnedReceivePlanId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
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
     * RECEIVE_CD: {NotNull, varchar(30)}
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
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterThan(String receiveCd) {
        regReceiveCd(CK_GT, fRES(receiveCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessThan(String receiveCd) {
        regReceiveCd(CK_LT, fRES(receiveCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterEqual(String receiveCd) {
        regReceiveCd(CK_GE, fRES(receiveCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessEqual(String receiveCd) {
        regReceiveCd(CK_LE, fRES(receiveCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
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
     * RECEIVE_CD: {NotNull, varchar(30)}
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
     * RECEIVE_CD: {NotNull, varchar(30)} <br>
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
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveCd_NotLikeSearch(String receiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveCd), xgetCValueReceiveCd(), "RECEIVE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_PrefixSearch(String receiveCd) {
        setReceiveCd_LikeSearch(receiveCd, xcLSOPPre());
    }

    protected void regReceiveCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveCd(), "RECEIVE_CD"); }
    protected abstract ConditionValue xgetCValueReceiveCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
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
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
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
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterThan(Long receiveRowId) {
        regReceiveRowId(CK_GT, receiveRowId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessThan(Long receiveRowId) {
        regReceiveRowId(CK_LT, receiveRowId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterEqual(Long receiveRowId) {
        regReceiveRowId(CK_GE, receiveRowId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessEqual(Long receiveRowId) {
        regReceiveRowId(CK_LE, receiveRowId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveRowId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveRowId(), "RECEIVE_ROW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
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
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
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
     * HEADER_FLG: {NotNull, char(1)}
     * @param headerFlg The value of headerFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderFlg_Equal(String headerFlg) {
        doSetHeaderFlg_Equal(fRES(headerFlg));
    }

    protected void doSetHeaderFlg_Equal(String headerFlg) {
        regHeaderFlg(CK_EQ, headerFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEADER_FLG: {NotNull, char(1)}
     * @param headerFlg The value of headerFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderFlg_NotEqual(String headerFlg) {
        doSetHeaderFlg_NotEqual(fRES(headerFlg));
    }

    protected void doSetHeaderFlg_NotEqual(String headerFlg) {
        regHeaderFlg(CK_NES, headerFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEADER_FLG: {NotNull, char(1)}
     * @param headerFlg The value of headerFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderFlg_GreaterThan(String headerFlg) {
        regHeaderFlg(CK_GT, fRES(headerFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEADER_FLG: {NotNull, char(1)}
     * @param headerFlg The value of headerFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderFlg_LessThan(String headerFlg) {
        regHeaderFlg(CK_LT, fRES(headerFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEADER_FLG: {NotNull, char(1)}
     * @param headerFlg The value of headerFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderFlg_GreaterEqual(String headerFlg) {
        regHeaderFlg(CK_GE, fRES(headerFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEADER_FLG: {NotNull, char(1)}
     * @param headerFlg The value of headerFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderFlg_LessEqual(String headerFlg) {
        regHeaderFlg(CK_LE, fRES(headerFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEADER_FLG: {NotNull, char(1)}
     * @param headerFlgList The collection of headerFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderFlg_InScope(Collection<String> headerFlgList) {
        doSetHeaderFlg_InScope(headerFlgList);
    }

    protected void doSetHeaderFlg_InScope(Collection<String> headerFlgList) {
        regINS(CK_INS, cTL(headerFlgList), xgetCValueHeaderFlg(), "HEADER_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEADER_FLG: {NotNull, char(1)}
     * @param headerFlgList The collection of headerFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderFlg_NotInScope(Collection<String> headerFlgList) {
        doSetHeaderFlg_NotInScope(headerFlgList);
    }

    protected void doSetHeaderFlg_NotInScope(Collection<String> headerFlgList) {
        regINS(CK_NINS, cTL(headerFlgList), xgetCValueHeaderFlg(), "HEADER_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEADER_FLG: {NotNull, char(1)} <br>
     * <pre>e.g. setHeaderFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param headerFlg The value of headerFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHeaderFlg_LikeSearch(String headerFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(headerFlg), xgetCValueHeaderFlg(), "HEADER_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEADER_FLG: {NotNull, char(1)}
     * @param headerFlg The value of headerFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHeaderFlg_NotLikeSearch(String headerFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(headerFlg), xgetCValueHeaderFlg(), "HEADER_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEADER_FLG: {NotNull, char(1)}
     * @param headerFlg The value of headerFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderFlg_PrefixSearch(String headerFlg) {
        setHeaderFlg_LikeSearch(headerFlg, xcLSOPPre());
    }

    protected void regHeaderFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeaderFlg(), "HEADER_FLG"); }
    protected abstract ConditionValue xgetCValueHeaderFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_BS_CD: {varchar(255)}
     * @param sortBsCd The value of sortBsCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortBsCd_Equal(String sortBsCd) {
        doSetSortBsCd_Equal(fRES(sortBsCd));
    }

    protected void doSetSortBsCd_Equal(String sortBsCd) {
        regSortBsCd(CK_EQ, sortBsCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_BS_CD: {varchar(255)}
     * @param sortBsCd The value of sortBsCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortBsCd_NotEqual(String sortBsCd) {
        doSetSortBsCd_NotEqual(fRES(sortBsCd));
    }

    protected void doSetSortBsCd_NotEqual(String sortBsCd) {
        regSortBsCd(CK_NES, sortBsCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_BS_CD: {varchar(255)}
     * @param sortBsCd The value of sortBsCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortBsCd_GreaterThan(String sortBsCd) {
        regSortBsCd(CK_GT, fRES(sortBsCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_BS_CD: {varchar(255)}
     * @param sortBsCd The value of sortBsCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortBsCd_LessThan(String sortBsCd) {
        regSortBsCd(CK_LT, fRES(sortBsCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_BS_CD: {varchar(255)}
     * @param sortBsCd The value of sortBsCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortBsCd_GreaterEqual(String sortBsCd) {
        regSortBsCd(CK_GE, fRES(sortBsCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_BS_CD: {varchar(255)}
     * @param sortBsCd The value of sortBsCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortBsCd_LessEqual(String sortBsCd) {
        regSortBsCd(CK_LE, fRES(sortBsCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_BS_CD: {varchar(255)}
     * @param sortBsCdList The collection of sortBsCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortBsCd_InScope(Collection<String> sortBsCdList) {
        doSetSortBsCd_InScope(sortBsCdList);
    }

    protected void doSetSortBsCd_InScope(Collection<String> sortBsCdList) {
        regINS(CK_INS, cTL(sortBsCdList), xgetCValueSortBsCd(), "SORT_BS_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_BS_CD: {varchar(255)}
     * @param sortBsCdList The collection of sortBsCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortBsCd_NotInScope(Collection<String> sortBsCdList) {
        doSetSortBsCd_NotInScope(sortBsCdList);
    }

    protected void doSetSortBsCd_NotInScope(Collection<String> sortBsCdList) {
        regINS(CK_NINS, cTL(sortBsCdList), xgetCValueSortBsCd(), "SORT_BS_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_BS_CD: {varchar(255)} <br>
     * <pre>e.g. setSortBsCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortBsCd The value of sortBsCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortBsCd_LikeSearch(String sortBsCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortBsCd), xgetCValueSortBsCd(), "SORT_BS_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_BS_CD: {varchar(255)}
     * @param sortBsCd The value of sortBsCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortBsCd_NotLikeSearch(String sortBsCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortBsCd), xgetCValueSortBsCd(), "SORT_BS_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_BS_CD: {varchar(255)}
     * @param sortBsCd The value of sortBsCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortBsCd_PrefixSearch(String sortBsCd) {
        setSortBsCd_LikeSearch(sortBsCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORT_BS_CD: {varchar(255)}
     */
    public void setSortBsCd_IsNull() { regSortBsCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SORT_BS_CD: {varchar(255)}
     */
    public void setSortBsCd_IsNullOrEmpty() { regSortBsCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORT_BS_CD: {varchar(255)}
     */
    public void setSortBsCd_IsNotNull() { regSortBsCd(CK_ISNN, DOBJ); }

    protected void regSortBsCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortBsCd(), "SORT_BS_CD"); }
    protected abstract ConditionValue xgetCValueSortBsCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @param delivayCenterCd The value of delivayCenterCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivayCenterCd_Equal(String delivayCenterCd) {
        doSetDelivayCenterCd_Equal(fRES(delivayCenterCd));
    }

    protected void doSetDelivayCenterCd_Equal(String delivayCenterCd) {
        regDelivayCenterCd(CK_EQ, delivayCenterCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @param delivayCenterCd The value of delivayCenterCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivayCenterCd_NotEqual(String delivayCenterCd) {
        doSetDelivayCenterCd_NotEqual(fRES(delivayCenterCd));
    }

    protected void doSetDelivayCenterCd_NotEqual(String delivayCenterCd) {
        regDelivayCenterCd(CK_NES, delivayCenterCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @param delivayCenterCd The value of delivayCenterCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivayCenterCd_GreaterThan(String delivayCenterCd) {
        regDelivayCenterCd(CK_GT, fRES(delivayCenterCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @param delivayCenterCd The value of delivayCenterCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivayCenterCd_LessThan(String delivayCenterCd) {
        regDelivayCenterCd(CK_LT, fRES(delivayCenterCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @param delivayCenterCd The value of delivayCenterCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivayCenterCd_GreaterEqual(String delivayCenterCd) {
        regDelivayCenterCd(CK_GE, fRES(delivayCenterCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @param delivayCenterCd The value of delivayCenterCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivayCenterCd_LessEqual(String delivayCenterCd) {
        regDelivayCenterCd(CK_LE, fRES(delivayCenterCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @param delivayCenterCdList The collection of delivayCenterCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivayCenterCd_InScope(Collection<String> delivayCenterCdList) {
        doSetDelivayCenterCd_InScope(delivayCenterCdList);
    }

    protected void doSetDelivayCenterCd_InScope(Collection<String> delivayCenterCdList) {
        regINS(CK_INS, cTL(delivayCenterCdList), xgetCValueDelivayCenterCd(), "DELIVAY_CENTER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @param delivayCenterCdList The collection of delivayCenterCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivayCenterCd_NotInScope(Collection<String> delivayCenterCdList) {
        doSetDelivayCenterCd_NotInScope(delivayCenterCdList);
    }

    protected void doSetDelivayCenterCd_NotInScope(Collection<String> delivayCenterCdList) {
        regINS(CK_NINS, cTL(delivayCenterCdList), xgetCValueDelivayCenterCd(), "DELIVAY_CENTER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVAY_CENTER_CD: {varchar(255)} <br>
     * <pre>e.g. setDelivayCenterCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivayCenterCd The value of delivayCenterCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivayCenterCd_LikeSearch(String delivayCenterCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivayCenterCd), xgetCValueDelivayCenterCd(), "DELIVAY_CENTER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @param delivayCenterCd The value of delivayCenterCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivayCenterCd_NotLikeSearch(String delivayCenterCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivayCenterCd), xgetCValueDelivayCenterCd(), "DELIVAY_CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @param delivayCenterCd The value of delivayCenterCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivayCenterCd_PrefixSearch(String delivayCenterCd) {
        setDelivayCenterCd_LikeSearch(delivayCenterCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     */
    public void setDelivayCenterCd_IsNull() { regDelivayCenterCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     */
    public void setDelivayCenterCd_IsNullOrEmpty() { regDelivayCenterCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVAY_CENTER_CD: {varchar(255)}
     */
    public void setDelivayCenterCd_IsNotNull() { regDelivayCenterCd(CK_ISNN, DOBJ); }

    protected void regDelivayCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivayCenterCd(), "DELIVAY_CENTER_CD"); }
    protected abstract ConditionValue xgetCValueDelivayCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_GROUP: {varchar(255)}
     * @param orderGroup The value of orderGroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderGroup_Equal(String orderGroup) {
        doSetOrderGroup_Equal(fRES(orderGroup));
    }

    protected void doSetOrderGroup_Equal(String orderGroup) {
        regOrderGroup(CK_EQ, orderGroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_GROUP: {varchar(255)}
     * @param orderGroup The value of orderGroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderGroup_NotEqual(String orderGroup) {
        doSetOrderGroup_NotEqual(fRES(orderGroup));
    }

    protected void doSetOrderGroup_NotEqual(String orderGroup) {
        regOrderGroup(CK_NES, orderGroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_GROUP: {varchar(255)}
     * @param orderGroup The value of orderGroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderGroup_GreaterThan(String orderGroup) {
        regOrderGroup(CK_GT, fRES(orderGroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_GROUP: {varchar(255)}
     * @param orderGroup The value of orderGroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderGroup_LessThan(String orderGroup) {
        regOrderGroup(CK_LT, fRES(orderGroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_GROUP: {varchar(255)}
     * @param orderGroup The value of orderGroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderGroup_GreaterEqual(String orderGroup) {
        regOrderGroup(CK_GE, fRES(orderGroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_GROUP: {varchar(255)}
     * @param orderGroup The value of orderGroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderGroup_LessEqual(String orderGroup) {
        regOrderGroup(CK_LE, fRES(orderGroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_GROUP: {varchar(255)}
     * @param orderGroupList The collection of orderGroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderGroup_InScope(Collection<String> orderGroupList) {
        doSetOrderGroup_InScope(orderGroupList);
    }

    protected void doSetOrderGroup_InScope(Collection<String> orderGroupList) {
        regINS(CK_INS, cTL(orderGroupList), xgetCValueOrderGroup(), "ORDER_GROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_GROUP: {varchar(255)}
     * @param orderGroupList The collection of orderGroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderGroup_NotInScope(Collection<String> orderGroupList) {
        doSetOrderGroup_NotInScope(orderGroupList);
    }

    protected void doSetOrderGroup_NotInScope(Collection<String> orderGroupList) {
        regINS(CK_NINS, cTL(orderGroupList), xgetCValueOrderGroup(), "ORDER_GROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_GROUP: {varchar(255)} <br>
     * <pre>e.g. setOrderGroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderGroup The value of orderGroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderGroup_LikeSearch(String orderGroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderGroup), xgetCValueOrderGroup(), "ORDER_GROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_GROUP: {varchar(255)}
     * @param orderGroup The value of orderGroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderGroup_NotLikeSearch(String orderGroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderGroup), xgetCValueOrderGroup(), "ORDER_GROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_GROUP: {varchar(255)}
     * @param orderGroup The value of orderGroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderGroup_PrefixSearch(String orderGroup) {
        setOrderGroup_LikeSearch(orderGroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_GROUP: {varchar(255)}
     */
    public void setOrderGroup_IsNull() { regOrderGroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_GROUP: {varchar(255)}
     */
    public void setOrderGroup_IsNullOrEmpty() { regOrderGroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_GROUP: {varchar(255)}
     */
    public void setOrderGroup_IsNotNull() { regOrderGroup(CK_ISNN, DOBJ); }

    protected void regOrderGroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderGroup(), "ORDER_GROUP"); }
    protected abstract ConditionValue xgetCValueOrderGroup();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALE_DATETIME: {varchar(255)}
     * @param saleDatetime The value of saleDatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleDatetime_Equal(String saleDatetime) {
        doSetSaleDatetime_Equal(fRES(saleDatetime));
    }

    protected void doSetSaleDatetime_Equal(String saleDatetime) {
        regSaleDatetime(CK_EQ, saleDatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALE_DATETIME: {varchar(255)}
     * @param saleDatetime The value of saleDatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleDatetime_NotEqual(String saleDatetime) {
        doSetSaleDatetime_NotEqual(fRES(saleDatetime));
    }

    protected void doSetSaleDatetime_NotEqual(String saleDatetime) {
        regSaleDatetime(CK_NES, saleDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALE_DATETIME: {varchar(255)}
     * @param saleDatetime The value of saleDatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleDatetime_GreaterThan(String saleDatetime) {
        regSaleDatetime(CK_GT, fRES(saleDatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALE_DATETIME: {varchar(255)}
     * @param saleDatetime The value of saleDatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleDatetime_LessThan(String saleDatetime) {
        regSaleDatetime(CK_LT, fRES(saleDatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALE_DATETIME: {varchar(255)}
     * @param saleDatetime The value of saleDatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleDatetime_GreaterEqual(String saleDatetime) {
        regSaleDatetime(CK_GE, fRES(saleDatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALE_DATETIME: {varchar(255)}
     * @param saleDatetime The value of saleDatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleDatetime_LessEqual(String saleDatetime) {
        regSaleDatetime(CK_LE, fRES(saleDatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALE_DATETIME: {varchar(255)}
     * @param saleDatetimeList The collection of saleDatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleDatetime_InScope(Collection<String> saleDatetimeList) {
        doSetSaleDatetime_InScope(saleDatetimeList);
    }

    protected void doSetSaleDatetime_InScope(Collection<String> saleDatetimeList) {
        regINS(CK_INS, cTL(saleDatetimeList), xgetCValueSaleDatetime(), "SALE_DATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALE_DATETIME: {varchar(255)}
     * @param saleDatetimeList The collection of saleDatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleDatetime_NotInScope(Collection<String> saleDatetimeList) {
        doSetSaleDatetime_NotInScope(saleDatetimeList);
    }

    protected void doSetSaleDatetime_NotInScope(Collection<String> saleDatetimeList) {
        regINS(CK_NINS, cTL(saleDatetimeList), xgetCValueSaleDatetime(), "SALE_DATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALE_DATETIME: {varchar(255)} <br>
     * <pre>e.g. setSaleDatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param saleDatetime The value of saleDatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSaleDatetime_LikeSearch(String saleDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(saleDatetime), xgetCValueSaleDatetime(), "SALE_DATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALE_DATETIME: {varchar(255)}
     * @param saleDatetime The value of saleDatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSaleDatetime_NotLikeSearch(String saleDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(saleDatetime), xgetCValueSaleDatetime(), "SALE_DATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALE_DATETIME: {varchar(255)}
     * @param saleDatetime The value of saleDatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleDatetime_PrefixSearch(String saleDatetime) {
        setSaleDatetime_LikeSearch(saleDatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALE_DATETIME: {varchar(255)}
     */
    public void setSaleDatetime_IsNull() { regSaleDatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALE_DATETIME: {varchar(255)}
     */
    public void setSaleDatetime_IsNullOrEmpty() { regSaleDatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALE_DATETIME: {varchar(255)}
     */
    public void setSaleDatetime_IsNotNull() { regSaleDatetime(CK_ISNN, DOBJ); }

    protected void regSaleDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSaleDatetime(), "SALE_DATETIME"); }
    protected abstract ConditionValue xgetCValueSaleDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_Equal(String customerCd) {
        doSetCustomerCd_Equal(fRES(customerCd));
    }

    protected void doSetCustomerCd_Equal(String customerCd) {
        regCustomerCd(CK_EQ, customerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_NotEqual(String customerCd) {
        doSetCustomerCd_NotEqual(fRES(customerCd));
    }

    protected void doSetCustomerCd_NotEqual(String customerCd) {
        regCustomerCd(CK_NES, customerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterThan(String customerCd) {
        regCustomerCd(CK_GT, fRES(customerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessThan(String customerCd) {
        regCustomerCd(CK_LT, fRES(customerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterEqual(String customerCd) {
        regCustomerCd(CK_GE, fRES(customerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessEqual(String customerCd) {
        regCustomerCd(CK_LE, fRES(customerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCdList The collection of customerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_InScope(Collection<String> customerCdList) {
        doSetCustomerCd_InScope(customerCdList);
    }

    protected void doSetCustomerCd_InScope(Collection<String> customerCdList) {
        regINS(CK_INS, cTL(customerCdList), xgetCValueCustomerCd(), "CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCdList The collection of customerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_NotInScope(Collection<String> customerCdList) {
        doSetCustomerCd_NotInScope(customerCdList);
    }

    protected void doSetCustomerCd_NotInScope(Collection<String> customerCdList) {
        regINS(CK_NINS, cTL(customerCdList), xgetCValueCustomerCd(), "CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(255)} <br>
     * <pre>e.g. setCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerCd The value of customerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerCd_LikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerCd_NotLikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_PrefixSearch(String customerCd) {
        setCustomerCd_LikeSearch(customerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     */
    public void setCustomerCd_IsNull() { regCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     */
    public void setCustomerCd_IsNullOrEmpty() { regCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     */
    public void setCustomerCd_IsNotNull() { regCustomerCd(CK_ISNN, DOBJ); }

    protected void regCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerCd(), "CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(255)}
     * @param slipType The value of slipType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_Equal(String slipType) {
        doSetSlipType_Equal(fRES(slipType));
    }

    protected void doSetSlipType_Equal(String slipType) {
        regSlipType(CK_EQ, slipType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(255)}
     * @param slipType The value of slipType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_NotEqual(String slipType) {
        doSetSlipType_NotEqual(fRES(slipType));
    }

    protected void doSetSlipType_NotEqual(String slipType) {
        regSlipType(CK_NES, slipType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(255)}
     * @param slipType The value of slipType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_GreaterThan(String slipType) {
        regSlipType(CK_GT, fRES(slipType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(255)}
     * @param slipType The value of slipType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_LessThan(String slipType) {
        regSlipType(CK_LT, fRES(slipType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(255)}
     * @param slipType The value of slipType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_GreaterEqual(String slipType) {
        regSlipType(CK_GE, fRES(slipType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(255)}
     * @param slipType The value of slipType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_LessEqual(String slipType) {
        regSlipType(CK_LE, fRES(slipType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE: {varchar(255)}
     * @param slipTypeList The collection of slipType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_InScope(Collection<String> slipTypeList) {
        doSetSlipType_InScope(slipTypeList);
    }

    protected void doSetSlipType_InScope(Collection<String> slipTypeList) {
        regINS(CK_INS, cTL(slipTypeList), xgetCValueSlipType(), "SLIP_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE: {varchar(255)}
     * @param slipTypeList The collection of slipType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_NotInScope(Collection<String> slipTypeList) {
        doSetSlipType_NotInScope(slipTypeList);
    }

    protected void doSetSlipType_NotInScope(Collection<String> slipTypeList) {
        regINS(CK_NINS, cTL(slipTypeList), xgetCValueSlipType(), "SLIP_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE: {varchar(255)} <br>
     * <pre>e.g. setSlipType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipType The value of slipType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipType_LikeSearch(String slipType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipType), xgetCValueSlipType(), "SLIP_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE: {varchar(255)}
     * @param slipType The value of slipType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipType_NotLikeSearch(String slipType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipType), xgetCValueSlipType(), "SLIP_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE: {varchar(255)}
     * @param slipType The value of slipType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipType_PrefixSearch(String slipType) {
        setSlipType_LikeSearch(slipType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(255)}
     */
    public void setSlipType_IsNull() { regSlipType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(255)}
     */
    public void setSlipType_IsNullOrEmpty() { regSlipType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE: {varchar(255)}
     */
    public void setSlipType_IsNotNull() { regSlipType(CK_ISNN, DOBJ); }

    protected void regSlipType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipType(), "SLIP_TYPE"); }
    protected abstract ConditionValue xgetCValueSlipType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {varchar(255)}
     * @param slipNo The value of slipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_Equal(String slipNo) {
        doSetSlipNo_Equal(fRES(slipNo));
    }

    protected void doSetSlipNo_Equal(String slipNo) {
        regSlipNo(CK_EQ, slipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {varchar(255)}
     * @param slipNo The value of slipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_NotEqual(String slipNo) {
        doSetSlipNo_NotEqual(fRES(slipNo));
    }

    protected void doSetSlipNo_NotEqual(String slipNo) {
        regSlipNo(CK_NES, slipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {varchar(255)}
     * @param slipNo The value of slipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_GreaterThan(String slipNo) {
        regSlipNo(CK_GT, fRES(slipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {varchar(255)}
     * @param slipNo The value of slipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_LessThan(String slipNo) {
        regSlipNo(CK_LT, fRES(slipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {varchar(255)}
     * @param slipNo The value of slipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_GreaterEqual(String slipNo) {
        regSlipNo(CK_GE, fRES(slipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {varchar(255)}
     * @param slipNo The value of slipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_LessEqual(String slipNo) {
        regSlipNo(CK_LE, fRES(slipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_NO: {varchar(255)}
     * @param slipNoList The collection of slipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_InScope(Collection<String> slipNoList) {
        doSetSlipNo_InScope(slipNoList);
    }

    protected void doSetSlipNo_InScope(Collection<String> slipNoList) {
        regINS(CK_INS, cTL(slipNoList), xgetCValueSlipNo(), "SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_NO: {varchar(255)}
     * @param slipNoList The collection of slipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_NotInScope(Collection<String> slipNoList) {
        doSetSlipNo_NotInScope(slipNoList);
    }

    protected void doSetSlipNo_NotInScope(Collection<String> slipNoList) {
        regINS(CK_NINS, cTL(slipNoList), xgetCValueSlipNo(), "SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_NO: {varchar(255)} <br>
     * <pre>e.g. setSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipNo The value of slipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipNo_LikeSearch(String slipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipNo), xgetCValueSlipNo(), "SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_NO: {varchar(255)}
     * @param slipNo The value of slipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipNo_NotLikeSearch(String slipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipNo), xgetCValueSlipNo(), "SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_NO: {varchar(255)}
     * @param slipNo The value of slipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_PrefixSearch(String slipNo) {
        setSlipNo_LikeSearch(slipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_NO: {varchar(255)}
     */
    public void setSlipNo_IsNull() { regSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_NO: {varchar(255)}
     */
    public void setSlipNo_IsNullOrEmpty() { regSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_NO: {varchar(255)}
     */
    public void setSlipNo_IsNotNull() { regSlipNo(CK_ISNN, DOBJ); }

    protected void regSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipNo(), "SLIP_NO"); }
    protected abstract ConditionValue xgetCValueSlipNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQUENCE_NO: {varchar(255)}
     * @param sequenceNo The value of sequenceNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSequenceNo_Equal(String sequenceNo) {
        doSetSequenceNo_Equal(fRES(sequenceNo));
    }

    protected void doSetSequenceNo_Equal(String sequenceNo) {
        regSequenceNo(CK_EQ, sequenceNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQUENCE_NO: {varchar(255)}
     * @param sequenceNo The value of sequenceNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSequenceNo_NotEqual(String sequenceNo) {
        doSetSequenceNo_NotEqual(fRES(sequenceNo));
    }

    protected void doSetSequenceNo_NotEqual(String sequenceNo) {
        regSequenceNo(CK_NES, sequenceNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQUENCE_NO: {varchar(255)}
     * @param sequenceNo The value of sequenceNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSequenceNo_GreaterThan(String sequenceNo) {
        regSequenceNo(CK_GT, fRES(sequenceNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQUENCE_NO: {varchar(255)}
     * @param sequenceNo The value of sequenceNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSequenceNo_LessThan(String sequenceNo) {
        regSequenceNo(CK_LT, fRES(sequenceNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQUENCE_NO: {varchar(255)}
     * @param sequenceNo The value of sequenceNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSequenceNo_GreaterEqual(String sequenceNo) {
        regSequenceNo(CK_GE, fRES(sequenceNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQUENCE_NO: {varchar(255)}
     * @param sequenceNo The value of sequenceNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSequenceNo_LessEqual(String sequenceNo) {
        regSequenceNo(CK_LE, fRES(sequenceNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEQUENCE_NO: {varchar(255)}
     * @param sequenceNoList The collection of sequenceNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSequenceNo_InScope(Collection<String> sequenceNoList) {
        doSetSequenceNo_InScope(sequenceNoList);
    }

    protected void doSetSequenceNo_InScope(Collection<String> sequenceNoList) {
        regINS(CK_INS, cTL(sequenceNoList), xgetCValueSequenceNo(), "SEQUENCE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEQUENCE_NO: {varchar(255)}
     * @param sequenceNoList The collection of sequenceNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSequenceNo_NotInScope(Collection<String> sequenceNoList) {
        doSetSequenceNo_NotInScope(sequenceNoList);
    }

    protected void doSetSequenceNo_NotInScope(Collection<String> sequenceNoList) {
        regINS(CK_NINS, cTL(sequenceNoList), xgetCValueSequenceNo(), "SEQUENCE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEQUENCE_NO: {varchar(255)} <br>
     * <pre>e.g. setSequenceNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sequenceNo The value of sequenceNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSequenceNo_LikeSearch(String sequenceNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sequenceNo), xgetCValueSequenceNo(), "SEQUENCE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEQUENCE_NO: {varchar(255)}
     * @param sequenceNo The value of sequenceNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSequenceNo_NotLikeSearch(String sequenceNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sequenceNo), xgetCValueSequenceNo(), "SEQUENCE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEQUENCE_NO: {varchar(255)}
     * @param sequenceNo The value of sequenceNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSequenceNo_PrefixSearch(String sequenceNo) {
        setSequenceNo_LikeSearch(sequenceNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEQUENCE_NO: {varchar(255)}
     */
    public void setSequenceNo_IsNull() { regSequenceNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEQUENCE_NO: {varchar(255)}
     */
    public void setSequenceNo_IsNullOrEmpty() { regSequenceNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEQUENCE_NO: {varchar(255)}
     */
    public void setSequenceNo_IsNotNull() { regSequenceNo(CK_ISNN, DOBJ); }

    protected void regSequenceNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSequenceNo(), "SEQUENCE_NO"); }
    protected abstract ConditionValue xgetCValueSequenceNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_Equal(String orderDate) {
        doSetOrderDate_Equal(fRES(orderDate));
    }

    protected void doSetOrderDate_Equal(String orderDate) {
        regOrderDate(CK_EQ, orderDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_NotEqual(String orderDate) {
        doSetOrderDate_NotEqual(fRES(orderDate));
    }

    protected void doSetOrderDate_NotEqual(String orderDate) {
        regOrderDate(CK_NES, orderDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_GreaterThan(String orderDate) {
        regOrderDate(CK_GT, fRES(orderDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_LessThan(String orderDate) {
        regOrderDate(CK_LT, fRES(orderDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_GreaterEqual(String orderDate) {
        regOrderDate(CK_GE, fRES(orderDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_LessEqual(String orderDate) {
        regOrderDate(CK_LE, fRES(orderDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDateList The collection of orderDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_InScope(Collection<String> orderDateList) {
        doSetOrderDate_InScope(orderDateList);
    }

    protected void doSetOrderDate_InScope(Collection<String> orderDateList) {
        regINS(CK_INS, cTL(orderDateList), xgetCValueOrderDate(), "ORDER_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDateList The collection of orderDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_NotInScope(Collection<String> orderDateList) {
        doSetOrderDate_NotInScope(orderDateList);
    }

    protected void doSetOrderDate_NotInScope(Collection<String> orderDateList) {
        regINS(CK_NINS, cTL(orderDateList), xgetCValueOrderDate(), "ORDER_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {varchar(255)} <br>
     * <pre>e.g. setOrderDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderDate The value of orderDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderDate_LikeSearch(String orderDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderDate), xgetCValueOrderDate(), "ORDER_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderDate_NotLikeSearch(String orderDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderDate), xgetCValueOrderDate(), "ORDER_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     * @param orderDate The value of orderDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_PrefixSearch(String orderDate) {
        setOrderDate_LikeSearch(orderDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     */
    public void setOrderDate_IsNull() { regOrderDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     */
    public void setOrderDate_IsNullOrEmpty() { regOrderDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_DATE: {varchar(255)}
     */
    public void setOrderDate_IsNotNull() { regOrderDate(CK_ISNN, DOBJ); }

    protected void regOrderDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderDate(), "ORDER_DATE"); }
    protected abstract ConditionValue xgetCValueOrderDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPING_DATE: {varchar(255)}
     * @param shipingDate The value of shipingDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipingDate_Equal(String shipingDate) {
        doSetShipingDate_Equal(fRES(shipingDate));
    }

    protected void doSetShipingDate_Equal(String shipingDate) {
        regShipingDate(CK_EQ, shipingDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPING_DATE: {varchar(255)}
     * @param shipingDate The value of shipingDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipingDate_NotEqual(String shipingDate) {
        doSetShipingDate_NotEqual(fRES(shipingDate));
    }

    protected void doSetShipingDate_NotEqual(String shipingDate) {
        regShipingDate(CK_NES, shipingDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPING_DATE: {varchar(255)}
     * @param shipingDate The value of shipingDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipingDate_GreaterThan(String shipingDate) {
        regShipingDate(CK_GT, fRES(shipingDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPING_DATE: {varchar(255)}
     * @param shipingDate The value of shipingDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipingDate_LessThan(String shipingDate) {
        regShipingDate(CK_LT, fRES(shipingDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPING_DATE: {varchar(255)}
     * @param shipingDate The value of shipingDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipingDate_GreaterEqual(String shipingDate) {
        regShipingDate(CK_GE, fRES(shipingDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPING_DATE: {varchar(255)}
     * @param shipingDate The value of shipingDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipingDate_LessEqual(String shipingDate) {
        regShipingDate(CK_LE, fRES(shipingDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPING_DATE: {varchar(255)}
     * @param shipingDateList The collection of shipingDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipingDate_InScope(Collection<String> shipingDateList) {
        doSetShipingDate_InScope(shipingDateList);
    }

    protected void doSetShipingDate_InScope(Collection<String> shipingDateList) {
        regINS(CK_INS, cTL(shipingDateList), xgetCValueShipingDate(), "SHIPING_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPING_DATE: {varchar(255)}
     * @param shipingDateList The collection of shipingDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipingDate_NotInScope(Collection<String> shipingDateList) {
        doSetShipingDate_NotInScope(shipingDateList);
    }

    protected void doSetShipingDate_NotInScope(Collection<String> shipingDateList) {
        regINS(CK_NINS, cTL(shipingDateList), xgetCValueShipingDate(), "SHIPING_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPING_DATE: {varchar(255)} <br>
     * <pre>e.g. setShipingDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipingDate The value of shipingDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipingDate_LikeSearch(String shipingDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipingDate), xgetCValueShipingDate(), "SHIPING_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPING_DATE: {varchar(255)}
     * @param shipingDate The value of shipingDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipingDate_NotLikeSearch(String shipingDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipingDate), xgetCValueShipingDate(), "SHIPING_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPING_DATE: {varchar(255)}
     * @param shipingDate The value of shipingDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipingDate_PrefixSearch(String shipingDate) {
        setShipingDate_LikeSearch(shipingDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPING_DATE: {varchar(255)}
     */
    public void setShipingDate_IsNull() { regShipingDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPING_DATE: {varchar(255)}
     */
    public void setShipingDate_IsNullOrEmpty() { regShipingDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPING_DATE: {varchar(255)}
     */
    public void setShipingDate_IsNotNull() { regShipingDate(CK_ISNN, DOBJ); }

    protected void regShipingDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipingDate(), "SHIPING_DATE"); }
    protected abstract ConditionValue xgetCValueShipingDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_Equal(String otorgcd) {
        doSetOtorgcd_Equal(fRES(otorgcd));
    }

    protected void doSetOtorgcd_Equal(String otorgcd) {
        regOtorgcd(CK_EQ, otorgcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_NotEqual(String otorgcd) {
        doSetOtorgcd_NotEqual(fRES(otorgcd));
    }

    protected void doSetOtorgcd_NotEqual(String otorgcd) {
        regOtorgcd(CK_NES, otorgcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_GreaterThan(String otorgcd) {
        regOtorgcd(CK_GT, fRES(otorgcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_LessThan(String otorgcd) {
        regOtorgcd(CK_LT, fRES(otorgcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_GreaterEqual(String otorgcd) {
        regOtorgcd(CK_GE, fRES(otorgcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_LessEqual(String otorgcd) {
        regOtorgcd(CK_LE, fRES(otorgcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcdList The collection of otorgcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_InScope(Collection<String> otorgcdList) {
        doSetOtorgcd_InScope(otorgcdList);
    }

    protected void doSetOtorgcd_InScope(Collection<String> otorgcdList) {
        regINS(CK_INS, cTL(otorgcdList), xgetCValueOtorgcd(), "OTORGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcdList The collection of otorgcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_NotInScope(Collection<String> otorgcdList) {
        doSetOtorgcd_NotInScope(otorgcdList);
    }

    protected void doSetOtorgcd_NotInScope(Collection<String> otorgcdList) {
        regINS(CK_NINS, cTL(otorgcdList), xgetCValueOtorgcd(), "OTORGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(255)} <br>
     * <pre>e.g. setOtorgcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otorgcd The value of otorgcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtorgcd_LikeSearch(String otorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otorgcd), xgetCValueOtorgcd(), "OTORGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtorgcd_NotLikeSearch(String otorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otorgcd), xgetCValueOtorgcd(), "OTORGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(255)}
     * @param otorgcd The value of otorgcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_PrefixSearch(String otorgcd) {
        setOtorgcd_LikeSearch(otorgcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     */
    public void setOtorgcd_IsNull() { regOtorgcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     */
    public void setOtorgcd_IsNullOrEmpty() { regOtorgcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(255)}
     */
    public void setOtorgcd_IsNotNull() { regOtorgcd(CK_ISNN, DOBJ); }

    protected void regOtorgcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtorgcd(), "OTORGCD"); }
    protected abstract ConditionValue xgetCValueOtorgcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_Equal(String ordorgcd) {
        doSetOrdorgcd_Equal(fRES(ordorgcd));
    }

    protected void doSetOrdorgcd_Equal(String ordorgcd) {
        regOrdorgcd(CK_EQ, ordorgcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_NotEqual(String ordorgcd) {
        doSetOrdorgcd_NotEqual(fRES(ordorgcd));
    }

    protected void doSetOrdorgcd_NotEqual(String ordorgcd) {
        regOrdorgcd(CK_NES, ordorgcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_GreaterThan(String ordorgcd) {
        regOrdorgcd(CK_GT, fRES(ordorgcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_LessThan(String ordorgcd) {
        regOrdorgcd(CK_LT, fRES(ordorgcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_GreaterEqual(String ordorgcd) {
        regOrdorgcd(CK_GE, fRES(ordorgcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_LessEqual(String ordorgcd) {
        regOrdorgcd(CK_LE, fRES(ordorgcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcdList The collection of ordorgcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_InScope(Collection<String> ordorgcdList) {
        doSetOrdorgcd_InScope(ordorgcdList);
    }

    protected void doSetOrdorgcd_InScope(Collection<String> ordorgcdList) {
        regINS(CK_INS, cTL(ordorgcdList), xgetCValueOrdorgcd(), "ORDORGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcdList The collection of ordorgcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_NotInScope(Collection<String> ordorgcdList) {
        doSetOrdorgcd_NotInScope(ordorgcdList);
    }

    protected void doSetOrdorgcd_NotInScope(Collection<String> ordorgcdList) {
        regINS(CK_NINS, cTL(ordorgcdList), xgetCValueOrdorgcd(), "ORDORGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(255)} <br>
     * <pre>e.g. setOrdorgcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ordorgcd The value of ordorgcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrdorgcd_LikeSearch(String ordorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ordorgcd), xgetCValueOrdorgcd(), "ORDORGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrdorgcd_NotLikeSearch(String ordorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ordorgcd), xgetCValueOrdorgcd(), "ORDORGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(255)}
     * @param ordorgcd The value of ordorgcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_PrefixSearch(String ordorgcd) {
        setOrdorgcd_LikeSearch(ordorgcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     */
    public void setOrdorgcd_IsNull() { regOrdorgcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     */
    public void setOrdorgcd_IsNullOrEmpty() { regOrdorgcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(255)}
     */
    public void setOrdorgcd_IsNotNull() { regOrdorgcd(CK_ISNN, DOBJ); }

    protected void regOrdorgcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdorgcd(), "ORDORGCD"); }
    protected abstract ConditionValue xgetCValueOrdorgcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_Equal(String rlybscd) {
        doSetRlybscd_Equal(fRES(rlybscd));
    }

    protected void doSetRlybscd_Equal(String rlybscd) {
        regRlybscd(CK_EQ, rlybscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_NotEqual(String rlybscd) {
        doSetRlybscd_NotEqual(fRES(rlybscd));
    }

    protected void doSetRlybscd_NotEqual(String rlybscd) {
        regRlybscd(CK_NES, rlybscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_GreaterThan(String rlybscd) {
        regRlybscd(CK_GT, fRES(rlybscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_LessThan(String rlybscd) {
        regRlybscd(CK_LT, fRES(rlybscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_GreaterEqual(String rlybscd) {
        regRlybscd(CK_GE, fRES(rlybscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_LessEqual(String rlybscd) {
        regRlybscd(CK_LE, fRES(rlybscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscdList The collection of rlybscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_InScope(Collection<String> rlybscdList) {
        doSetRlybscd_InScope(rlybscdList);
    }

    protected void doSetRlybscd_InScope(Collection<String> rlybscdList) {
        regINS(CK_INS, cTL(rlybscdList), xgetCValueRlybscd(), "RLYBSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscdList The collection of rlybscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_NotInScope(Collection<String> rlybscdList) {
        doSetRlybscd_NotInScope(rlybscdList);
    }

    protected void doSetRlybscd_NotInScope(Collection<String> rlybscdList) {
        regINS(CK_NINS, cTL(rlybscdList), xgetCValueRlybscd(), "RLYBSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(255)} <br>
     * <pre>e.g. setRlybscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rlybscd The value of rlybscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRlybscd_LikeSearch(String rlybscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rlybscd), xgetCValueRlybscd(), "RLYBSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlybscd_NotLikeSearch(String rlybscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlybscd), xgetCValueRlybscd(), "RLYBSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(255)}
     * @param rlybscd The value of rlybscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_PrefixSearch(String rlybscd) {
        setRlybscd_LikeSearch(rlybscd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     */
    public void setRlybscd_IsNull() { regRlybscd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     */
    public void setRlybscd_IsNullOrEmpty() { regRlybscd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(255)}
     */
    public void setRlybscd_IsNotNull() { regRlybscd(CK_ISNN, DOBJ); }

    protected void regRlybscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlybscd(), "RLYBSCD"); }
    protected abstract ConditionValue xgetCValueRlybscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_Equal(String directionCd) {
        doSetDirectionCd_Equal(fRES(directionCd));
    }

    protected void doSetDirectionCd_Equal(String directionCd) {
        regDirectionCd(CK_EQ, directionCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_NotEqual(String directionCd) {
        doSetDirectionCd_NotEqual(fRES(directionCd));
    }

    protected void doSetDirectionCd_NotEqual(String directionCd) {
        regDirectionCd(CK_NES, directionCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_GreaterThan(String directionCd) {
        regDirectionCd(CK_GT, fRES(directionCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_LessThan(String directionCd) {
        regDirectionCd(CK_LT, fRES(directionCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_GreaterEqual(String directionCd) {
        regDirectionCd(CK_GE, fRES(directionCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_LessEqual(String directionCd) {
        regDirectionCd(CK_LE, fRES(directionCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCdList The collection of directionCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_InScope(Collection<String> directionCdList) {
        doSetDirectionCd_InScope(directionCdList);
    }

    protected void doSetDirectionCd_InScope(Collection<String> directionCdList) {
        regINS(CK_INS, cTL(directionCdList), xgetCValueDirectionCd(), "DIRECTION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCdList The collection of directionCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_NotInScope(Collection<String> directionCdList) {
        doSetDirectionCd_NotInScope(directionCdList);
    }

    protected void doSetDirectionCd_NotInScope(Collection<String> directionCdList) {
        regINS(CK_NINS, cTL(directionCdList), xgetCValueDirectionCd(), "DIRECTION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_CD: {varchar(255)} <br>
     * <pre>e.g. setDirectionCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directionCd The value of directionCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectionCd_LikeSearch(String directionCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directionCd), xgetCValueDirectionCd(), "DIRECTION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectionCd_NotLikeSearch(String directionCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directionCd), xgetCValueDirectionCd(), "DIRECTION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_PrefixSearch(String directionCd) {
        setDirectionCd_LikeSearch(directionCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     */
    public void setDirectionCd_IsNull() { regDirectionCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     */
    public void setDirectionCd_IsNullOrEmpty() { regDirectionCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     */
    public void setDirectionCd_IsNotNull() { regDirectionCd(CK_ISNN, DOBJ); }

    protected void regDirectionCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectionCd(), "DIRECTION_CD"); }
    protected abstract ConditionValue xgetCValueDirectionCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_ID: {varchar(255)}
     * @param pistonId The value of pistonId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonId_Equal(String pistonId) {
        doSetPistonId_Equal(fRES(pistonId));
    }

    protected void doSetPistonId_Equal(String pistonId) {
        regPistonId(CK_EQ, pistonId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_ID: {varchar(255)}
     * @param pistonId The value of pistonId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonId_NotEqual(String pistonId) {
        doSetPistonId_NotEqual(fRES(pistonId));
    }

    protected void doSetPistonId_NotEqual(String pistonId) {
        regPistonId(CK_NES, pistonId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_ID: {varchar(255)}
     * @param pistonId The value of pistonId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonId_GreaterThan(String pistonId) {
        regPistonId(CK_GT, fRES(pistonId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_ID: {varchar(255)}
     * @param pistonId The value of pistonId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonId_LessThan(String pistonId) {
        regPistonId(CK_LT, fRES(pistonId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_ID: {varchar(255)}
     * @param pistonId The value of pistonId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonId_GreaterEqual(String pistonId) {
        regPistonId(CK_GE, fRES(pistonId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_ID: {varchar(255)}
     * @param pistonId The value of pistonId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonId_LessEqual(String pistonId) {
        regPistonId(CK_LE, fRES(pistonId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTON_ID: {varchar(255)}
     * @param pistonIdList The collection of pistonId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonId_InScope(Collection<String> pistonIdList) {
        doSetPistonId_InScope(pistonIdList);
    }

    protected void doSetPistonId_InScope(Collection<String> pistonIdList) {
        regINS(CK_INS, cTL(pistonIdList), xgetCValuePistonId(), "PISTON_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTON_ID: {varchar(255)}
     * @param pistonIdList The collection of pistonId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonId_NotInScope(Collection<String> pistonIdList) {
        doSetPistonId_NotInScope(pistonIdList);
    }

    protected void doSetPistonId_NotInScope(Collection<String> pistonIdList) {
        regINS(CK_NINS, cTL(pistonIdList), xgetCValuePistonId(), "PISTON_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTON_ID: {varchar(255)} <br>
     * <pre>e.g. setPistonId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pistonId The value of pistonId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPistonId_LikeSearch(String pistonId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pistonId), xgetCValuePistonId(), "PISTON_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTON_ID: {varchar(255)}
     * @param pistonId The value of pistonId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPistonId_NotLikeSearch(String pistonId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pistonId), xgetCValuePistonId(), "PISTON_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTON_ID: {varchar(255)}
     * @param pistonId The value of pistonId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonId_PrefixSearch(String pistonId) {
        setPistonId_LikeSearch(pistonId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PISTON_ID: {varchar(255)}
     */
    public void setPistonId_IsNull() { regPistonId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PISTON_ID: {varchar(255)}
     */
    public void setPistonId_IsNullOrEmpty() { regPistonId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PISTON_ID: {varchar(255)}
     */
    public void setPistonId_IsNotNull() { regPistonId(CK_ISNN, DOBJ); }

    protected void regPistonId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePistonId(), "PISTON_ID"); }
    protected abstract ConditionValue xgetCValuePistonId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVALY_RANK: {varchar(255)}
     * @param delivalyRank The value of delivalyRank as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivalyRank_Equal(String delivalyRank) {
        doSetDelivalyRank_Equal(fRES(delivalyRank));
    }

    protected void doSetDelivalyRank_Equal(String delivalyRank) {
        regDelivalyRank(CK_EQ, delivalyRank);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVALY_RANK: {varchar(255)}
     * @param delivalyRank The value of delivalyRank as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivalyRank_NotEqual(String delivalyRank) {
        doSetDelivalyRank_NotEqual(fRES(delivalyRank));
    }

    protected void doSetDelivalyRank_NotEqual(String delivalyRank) {
        regDelivalyRank(CK_NES, delivalyRank);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVALY_RANK: {varchar(255)}
     * @param delivalyRank The value of delivalyRank as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivalyRank_GreaterThan(String delivalyRank) {
        regDelivalyRank(CK_GT, fRES(delivalyRank));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVALY_RANK: {varchar(255)}
     * @param delivalyRank The value of delivalyRank as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivalyRank_LessThan(String delivalyRank) {
        regDelivalyRank(CK_LT, fRES(delivalyRank));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVALY_RANK: {varchar(255)}
     * @param delivalyRank The value of delivalyRank as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivalyRank_GreaterEqual(String delivalyRank) {
        regDelivalyRank(CK_GE, fRES(delivalyRank));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVALY_RANK: {varchar(255)}
     * @param delivalyRank The value of delivalyRank as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivalyRank_LessEqual(String delivalyRank) {
        regDelivalyRank(CK_LE, fRES(delivalyRank));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVALY_RANK: {varchar(255)}
     * @param delivalyRankList The collection of delivalyRank as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivalyRank_InScope(Collection<String> delivalyRankList) {
        doSetDelivalyRank_InScope(delivalyRankList);
    }

    protected void doSetDelivalyRank_InScope(Collection<String> delivalyRankList) {
        regINS(CK_INS, cTL(delivalyRankList), xgetCValueDelivalyRank(), "DELIVALY_RANK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVALY_RANK: {varchar(255)}
     * @param delivalyRankList The collection of delivalyRank as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivalyRank_NotInScope(Collection<String> delivalyRankList) {
        doSetDelivalyRank_NotInScope(delivalyRankList);
    }

    protected void doSetDelivalyRank_NotInScope(Collection<String> delivalyRankList) {
        regINS(CK_NINS, cTL(delivalyRankList), xgetCValueDelivalyRank(), "DELIVALY_RANK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVALY_RANK: {varchar(255)} <br>
     * <pre>e.g. setDelivalyRank_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivalyRank The value of delivalyRank as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivalyRank_LikeSearch(String delivalyRank, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivalyRank), xgetCValueDelivalyRank(), "DELIVALY_RANK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVALY_RANK: {varchar(255)}
     * @param delivalyRank The value of delivalyRank as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivalyRank_NotLikeSearch(String delivalyRank, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivalyRank), xgetCValueDelivalyRank(), "DELIVALY_RANK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVALY_RANK: {varchar(255)}
     * @param delivalyRank The value of delivalyRank as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivalyRank_PrefixSearch(String delivalyRank) {
        setDelivalyRank_LikeSearch(delivalyRank, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVALY_RANK: {varchar(255)}
     */
    public void setDelivalyRank_IsNull() { regDelivalyRank(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVALY_RANK: {varchar(255)}
     */
    public void setDelivalyRank_IsNullOrEmpty() { regDelivalyRank(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVALY_RANK: {varchar(255)}
     */
    public void setDelivalyRank_IsNotNull() { regDelivalyRank(CK_ISNN, DOBJ); }

    protected void regDelivalyRank(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivalyRank(), "DELIVALY_RANK"); }
    protected abstract ConditionValue xgetCValueDelivalyRank();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     * @param bulkDelivalyNo The value of bulkDelivalyNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBulkDelivalyNo_Equal(String bulkDelivalyNo) {
        doSetBulkDelivalyNo_Equal(fRES(bulkDelivalyNo));
    }

    protected void doSetBulkDelivalyNo_Equal(String bulkDelivalyNo) {
        regBulkDelivalyNo(CK_EQ, bulkDelivalyNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     * @param bulkDelivalyNo The value of bulkDelivalyNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBulkDelivalyNo_NotEqual(String bulkDelivalyNo) {
        doSetBulkDelivalyNo_NotEqual(fRES(bulkDelivalyNo));
    }

    protected void doSetBulkDelivalyNo_NotEqual(String bulkDelivalyNo) {
        regBulkDelivalyNo(CK_NES, bulkDelivalyNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     * @param bulkDelivalyNo The value of bulkDelivalyNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBulkDelivalyNo_GreaterThan(String bulkDelivalyNo) {
        regBulkDelivalyNo(CK_GT, fRES(bulkDelivalyNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     * @param bulkDelivalyNo The value of bulkDelivalyNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBulkDelivalyNo_LessThan(String bulkDelivalyNo) {
        regBulkDelivalyNo(CK_LT, fRES(bulkDelivalyNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     * @param bulkDelivalyNo The value of bulkDelivalyNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBulkDelivalyNo_GreaterEqual(String bulkDelivalyNo) {
        regBulkDelivalyNo(CK_GE, fRES(bulkDelivalyNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     * @param bulkDelivalyNo The value of bulkDelivalyNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBulkDelivalyNo_LessEqual(String bulkDelivalyNo) {
        regBulkDelivalyNo(CK_LE, fRES(bulkDelivalyNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     * @param bulkDelivalyNoList The collection of bulkDelivalyNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBulkDelivalyNo_InScope(Collection<String> bulkDelivalyNoList) {
        doSetBulkDelivalyNo_InScope(bulkDelivalyNoList);
    }

    protected void doSetBulkDelivalyNo_InScope(Collection<String> bulkDelivalyNoList) {
        regINS(CK_INS, cTL(bulkDelivalyNoList), xgetCValueBulkDelivalyNo(), "BULK_DELIVALY_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     * @param bulkDelivalyNoList The collection of bulkDelivalyNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBulkDelivalyNo_NotInScope(Collection<String> bulkDelivalyNoList) {
        doSetBulkDelivalyNo_NotInScope(bulkDelivalyNoList);
    }

    protected void doSetBulkDelivalyNo_NotInScope(Collection<String> bulkDelivalyNoList) {
        regINS(CK_NINS, cTL(bulkDelivalyNoList), xgetCValueBulkDelivalyNo(), "BULK_DELIVALY_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BULK_DELIVALY_NO: {varchar(255)} <br>
     * <pre>e.g. setBulkDelivalyNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bulkDelivalyNo The value of bulkDelivalyNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBulkDelivalyNo_LikeSearch(String bulkDelivalyNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bulkDelivalyNo), xgetCValueBulkDelivalyNo(), "BULK_DELIVALY_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     * @param bulkDelivalyNo The value of bulkDelivalyNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBulkDelivalyNo_NotLikeSearch(String bulkDelivalyNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bulkDelivalyNo), xgetCValueBulkDelivalyNo(), "BULK_DELIVALY_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     * @param bulkDelivalyNo The value of bulkDelivalyNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBulkDelivalyNo_PrefixSearch(String bulkDelivalyNo) {
        setBulkDelivalyNo_LikeSearch(bulkDelivalyNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     */
    public void setBulkDelivalyNo_IsNull() { regBulkDelivalyNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     */
    public void setBulkDelivalyNo_IsNullOrEmpty() { regBulkDelivalyNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BULK_DELIVALY_NO: {varchar(255)}
     */
    public void setBulkDelivalyNo_IsNotNull() { regBulkDelivalyNo(CK_ISNN, DOBJ); }

    protected void regBulkDelivalyNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBulkDelivalyNo(), "BULK_DELIVALY_NO"); }
    protected abstract ConditionValue xgetCValueBulkDelivalyNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_Equal(String divmtd) {
        doSetDivmtd_Equal(fRES(divmtd));
    }

    protected void doSetDivmtd_Equal(String divmtd) {
        regDivmtd(CK_EQ, divmtd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_NotEqual(String divmtd) {
        doSetDivmtd_NotEqual(fRES(divmtd));
    }

    protected void doSetDivmtd_NotEqual(String divmtd) {
        regDivmtd(CK_NES, divmtd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_GreaterThan(String divmtd) {
        regDivmtd(CK_GT, fRES(divmtd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_LessThan(String divmtd) {
        regDivmtd(CK_LT, fRES(divmtd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_GreaterEqual(String divmtd) {
        regDivmtd(CK_GE, fRES(divmtd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_LessEqual(String divmtd) {
        regDivmtd(CK_LE, fRES(divmtd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtdList The collection of divmtd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_InScope(Collection<String> divmtdList) {
        doSetDivmtd_InScope(divmtdList);
    }

    protected void doSetDivmtd_InScope(Collection<String> divmtdList) {
        regINS(CK_INS, cTL(divmtdList), xgetCValueDivmtd(), "DIVMTD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtdList The collection of divmtd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_NotInScope(Collection<String> divmtdList) {
        doSetDivmtd_NotInScope(divmtdList);
    }

    protected void doSetDivmtd_NotInScope(Collection<String> divmtdList) {
        regINS(CK_NINS, cTL(divmtdList), xgetCValueDivmtd(), "DIVMTD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIVMTD: {varchar(255)} <br>
     * <pre>e.g. setDivmtd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param divmtd The value of divmtd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDivmtd_LikeSearch(String divmtd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(divmtd), xgetCValueDivmtd(), "DIVMTD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDivmtd_NotLikeSearch(String divmtd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(divmtd), xgetCValueDivmtd(), "DIVMTD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIVMTD: {varchar(255)}
     * @param divmtd The value of divmtd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_PrefixSearch(String divmtd) {
        setDivmtd_LikeSearch(divmtd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     */
    public void setDivmtd_IsNull() { regDivmtd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     */
    public void setDivmtd_IsNullOrEmpty() { regDivmtd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIVMTD: {varchar(255)}
     */
    public void setDivmtd_IsNotNull() { regDivmtd(CK_ISNN, DOBJ); }

    protected void regDivmtd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDivmtd(), "DIVMTD"); }
    protected abstract ConditionValue xgetCValueDivmtd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZHDVRID: {varchar(255)}
     * @param zzhdvrid The value of zzhdvrid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhdvrid_Equal(String zzhdvrid) {
        doSetZzhdvrid_Equal(fRES(zzhdvrid));
    }

    protected void doSetZzhdvrid_Equal(String zzhdvrid) {
        regZzhdvrid(CK_EQ, zzhdvrid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZHDVRID: {varchar(255)}
     * @param zzhdvrid The value of zzhdvrid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhdvrid_NotEqual(String zzhdvrid) {
        doSetZzhdvrid_NotEqual(fRES(zzhdvrid));
    }

    protected void doSetZzhdvrid_NotEqual(String zzhdvrid) {
        regZzhdvrid(CK_NES, zzhdvrid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZHDVRID: {varchar(255)}
     * @param zzhdvrid The value of zzhdvrid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhdvrid_GreaterThan(String zzhdvrid) {
        regZzhdvrid(CK_GT, fRES(zzhdvrid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZHDVRID: {varchar(255)}
     * @param zzhdvrid The value of zzhdvrid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhdvrid_LessThan(String zzhdvrid) {
        regZzhdvrid(CK_LT, fRES(zzhdvrid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZHDVRID: {varchar(255)}
     * @param zzhdvrid The value of zzhdvrid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhdvrid_GreaterEqual(String zzhdvrid) {
        regZzhdvrid(CK_GE, fRES(zzhdvrid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZHDVRID: {varchar(255)}
     * @param zzhdvrid The value of zzhdvrid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhdvrid_LessEqual(String zzhdvrid) {
        regZzhdvrid(CK_LE, fRES(zzhdvrid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZHDVRID: {varchar(255)}
     * @param zzhdvridList The collection of zzhdvrid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhdvrid_InScope(Collection<String> zzhdvridList) {
        doSetZzhdvrid_InScope(zzhdvridList);
    }

    protected void doSetZzhdvrid_InScope(Collection<String> zzhdvridList) {
        regINS(CK_INS, cTL(zzhdvridList), xgetCValueZzhdvrid(), "ZZHDVRID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZHDVRID: {varchar(255)}
     * @param zzhdvridList The collection of zzhdvrid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhdvrid_NotInScope(Collection<String> zzhdvridList) {
        doSetZzhdvrid_NotInScope(zzhdvridList);
    }

    protected void doSetZzhdvrid_NotInScope(Collection<String> zzhdvridList) {
        regINS(CK_NINS, cTL(zzhdvridList), xgetCValueZzhdvrid(), "ZZHDVRID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZHDVRID: {varchar(255)} <br>
     * <pre>e.g. setZzhdvrid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzhdvrid The value of zzhdvrid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzhdvrid_LikeSearch(String zzhdvrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzhdvrid), xgetCValueZzhdvrid(), "ZZHDVRID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZHDVRID: {varchar(255)}
     * @param zzhdvrid The value of zzhdvrid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzhdvrid_NotLikeSearch(String zzhdvrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzhdvrid), xgetCValueZzhdvrid(), "ZZHDVRID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZHDVRID: {varchar(255)}
     * @param zzhdvrid The value of zzhdvrid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzhdvrid_PrefixSearch(String zzhdvrid) {
        setZzhdvrid_LikeSearch(zzhdvrid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZHDVRID: {varchar(255)}
     */
    public void setZzhdvrid_IsNull() { regZzhdvrid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZHDVRID: {varchar(255)}
     */
    public void setZzhdvrid_IsNullOrEmpty() { regZzhdvrid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZHDVRID: {varchar(255)}
     */
    public void setZzhdvrid_IsNotNull() { regZzhdvrid(CK_ISNN, DOBJ); }

    protected void regZzhdvrid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzhdvrid(), "ZZHDVRID"); }
    protected abstract ConditionValue xgetCValueZzhdvrid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @param customerNm The value of customerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_Equal(String customerNm) {
        doSetCustomerNm_Equal(fRES(customerNm));
    }

    protected void doSetCustomerNm_Equal(String customerNm) {
        regCustomerNm(CK_EQ, customerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @param customerNm The value of customerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_NotEqual(String customerNm) {
        doSetCustomerNm_NotEqual(fRES(customerNm));
    }

    protected void doSetCustomerNm_NotEqual(String customerNm) {
        regCustomerNm(CK_NES, customerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @param customerNm The value of customerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_GreaterThan(String customerNm) {
        regCustomerNm(CK_GT, fRES(customerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @param customerNm The value of customerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_LessThan(String customerNm) {
        regCustomerNm(CK_LT, fRES(customerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @param customerNm The value of customerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_GreaterEqual(String customerNm) {
        regCustomerNm(CK_GE, fRES(customerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @param customerNm The value of customerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_LessEqual(String customerNm) {
        regCustomerNm(CK_LE, fRES(customerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @param customerNmList The collection of customerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_InScope(Collection<String> customerNmList) {
        doSetCustomerNm_InScope(customerNmList);
    }

    protected void doSetCustomerNm_InScope(Collection<String> customerNmList) {
        regINS(CK_INS, cTL(customerNmList), xgetCValueCustomerNm(), "CUSTOMER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @param customerNmList The collection of customerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_NotInScope(Collection<String> customerNmList) {
        doSetCustomerNm_NotInScope(customerNmList);
    }

    protected void doSetCustomerNm_NotInScope(Collection<String> customerNmList) {
        regINS(CK_NINS, cTL(customerNmList), xgetCValueCustomerNm(), "CUSTOMER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {varchar(255)} <br>
     * <pre>e.g. setCustomerNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerNm The value of customerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerNm_LikeSearch(String customerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerNm), xgetCValueCustomerNm(), "CUSTOMER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @param customerNm The value of customerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerNm_NotLikeSearch(String customerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerNm), xgetCValueCustomerNm(), "CUSTOMER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {varchar(255)}
     * @param customerNm The value of customerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_PrefixSearch(String customerNm) {
        setCustomerNm_LikeSearch(customerNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {varchar(255)}
     */
    public void setCustomerNm_IsNull() { regCustomerNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {varchar(255)}
     */
    public void setCustomerNm_IsNullOrEmpty() { regCustomerNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {varchar(255)}
     */
    public void setCustomerNm_IsNotNull() { regCustomerNm(CK_ISNN, DOBJ); }

    protected void regCustomerNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerNm(), "CUSTOMER_NM"); }
    protected abstract ConditionValue xgetCValueCustomerNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     * @param headerPriceSale The value of headerPriceSale as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderPriceSale_Equal(String headerPriceSale) {
        doSetHeaderPriceSale_Equal(fRES(headerPriceSale));
    }

    protected void doSetHeaderPriceSale_Equal(String headerPriceSale) {
        regHeaderPriceSale(CK_EQ, headerPriceSale);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     * @param headerPriceSale The value of headerPriceSale as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderPriceSale_NotEqual(String headerPriceSale) {
        doSetHeaderPriceSale_NotEqual(fRES(headerPriceSale));
    }

    protected void doSetHeaderPriceSale_NotEqual(String headerPriceSale) {
        regHeaderPriceSale(CK_NES, headerPriceSale);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     * @param headerPriceSale The value of headerPriceSale as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderPriceSale_GreaterThan(String headerPriceSale) {
        regHeaderPriceSale(CK_GT, fRES(headerPriceSale));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     * @param headerPriceSale The value of headerPriceSale as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderPriceSale_LessThan(String headerPriceSale) {
        regHeaderPriceSale(CK_LT, fRES(headerPriceSale));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     * @param headerPriceSale The value of headerPriceSale as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderPriceSale_GreaterEqual(String headerPriceSale) {
        regHeaderPriceSale(CK_GE, fRES(headerPriceSale));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     * @param headerPriceSale The value of headerPriceSale as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderPriceSale_LessEqual(String headerPriceSale) {
        regHeaderPriceSale(CK_LE, fRES(headerPriceSale));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     * @param headerPriceSaleList The collection of headerPriceSale as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderPriceSale_InScope(Collection<String> headerPriceSaleList) {
        doSetHeaderPriceSale_InScope(headerPriceSaleList);
    }

    protected void doSetHeaderPriceSale_InScope(Collection<String> headerPriceSaleList) {
        regINS(CK_INS, cTL(headerPriceSaleList), xgetCValueHeaderPriceSale(), "HEADER_PRICE_SALE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     * @param headerPriceSaleList The collection of headerPriceSale as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderPriceSale_NotInScope(Collection<String> headerPriceSaleList) {
        doSetHeaderPriceSale_NotInScope(headerPriceSaleList);
    }

    protected void doSetHeaderPriceSale_NotInScope(Collection<String> headerPriceSaleList) {
        regINS(CK_NINS, cTL(headerPriceSaleList), xgetCValueHeaderPriceSale(), "HEADER_PRICE_SALE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEADER_PRICE_SALE: {varchar(255)} <br>
     * <pre>e.g. setHeaderPriceSale_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param headerPriceSale The value of headerPriceSale as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHeaderPriceSale_LikeSearch(String headerPriceSale, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(headerPriceSale), xgetCValueHeaderPriceSale(), "HEADER_PRICE_SALE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     * @param headerPriceSale The value of headerPriceSale as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHeaderPriceSale_NotLikeSearch(String headerPriceSale, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(headerPriceSale), xgetCValueHeaderPriceSale(), "HEADER_PRICE_SALE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     * @param headerPriceSale The value of headerPriceSale as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeaderPriceSale_PrefixSearch(String headerPriceSale) {
        setHeaderPriceSale_LikeSearch(headerPriceSale, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     */
    public void setHeaderPriceSale_IsNull() { regHeaderPriceSale(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     */
    public void setHeaderPriceSale_IsNullOrEmpty() { regHeaderPriceSale(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HEADER_PRICE_SALE: {varchar(255)}
     */
    public void setHeaderPriceSale_IsNotNull() { regHeaderPriceSale(CK_ISNN, DOBJ); }

    protected void regHeaderPriceSale(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeaderPriceSale(), "HEADER_PRICE_SALE"); }
    protected abstract ConditionValue xgetCValueHeaderPriceSale();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_Equal(String zregprcc) {
        doSetZregprcc_Equal(fRES(zregprcc));
    }

    protected void doSetZregprcc_Equal(String zregprcc) {
        regZregprcc(CK_EQ, zregprcc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_NotEqual(String zregprcc) {
        doSetZregprcc_NotEqual(fRES(zregprcc));
    }

    protected void doSetZregprcc_NotEqual(String zregprcc) {
        regZregprcc(CK_NES, zregprcc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_GreaterThan(String zregprcc) {
        regZregprcc(CK_GT, fRES(zregprcc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_LessThan(String zregprcc) {
        regZregprcc(CK_LT, fRES(zregprcc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_GreaterEqual(String zregprcc) {
        regZregprcc(CK_GE, fRES(zregprcc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_LessEqual(String zregprcc) {
        regZregprcc(CK_LE, fRES(zregprcc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprccList The collection of zregprcc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_InScope(Collection<String> zregprccList) {
        doSetZregprcc_InScope(zregprccList);
    }

    protected void doSetZregprcc_InScope(Collection<String> zregprccList) {
        regINS(CK_INS, cTL(zregprccList), xgetCValueZregprcc(), "ZREGPRCC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprccList The collection of zregprcc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_NotInScope(Collection<String> zregprccList) {
        doSetZregprcc_NotInScope(zregprccList);
    }

    protected void doSetZregprcc_NotInScope(Collection<String> zregprccList) {
        regINS(CK_NINS, cTL(zregprccList), xgetCValueZregprcc(), "ZREGPRCC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZREGPRCC: {varchar(255)} <br>
     * <pre>e.g. setZregprcc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zregprcc The value of zregprcc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZregprcc_LikeSearch(String zregprcc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zregprcc), xgetCValueZregprcc(), "ZREGPRCC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZregprcc_NotLikeSearch(String zregprcc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zregprcc), xgetCValueZregprcc(), "ZREGPRCC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     * @param zregprcc The value of zregprcc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZregprcc_PrefixSearch(String zregprcc) {
        setZregprcc_LikeSearch(zregprcc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     */
    public void setZregprcc_IsNull() { regZregprcc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     */
    public void setZregprcc_IsNullOrEmpty() { regZregprcc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZREGPRCC: {varchar(255)}
     */
    public void setZregprcc_IsNotNull() { regZregprcc(CK_ISNN, DOBJ); }

    protected void regZregprcc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZregprcc(), "ZREGPRCC"); }
    protected abstract ConditionValue xgetCValueZregprcc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAX: {varchar(255)}
     * @param tax The value of tax as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_Equal(String tax) {
        doSetTax_Equal(fRES(tax));
    }

    protected void doSetTax_Equal(String tax) {
        regTax(CK_EQ, tax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAX: {varchar(255)}
     * @param tax The value of tax as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_NotEqual(String tax) {
        doSetTax_NotEqual(fRES(tax));
    }

    protected void doSetTax_NotEqual(String tax) {
        regTax(CK_NES, tax);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAX: {varchar(255)}
     * @param tax The value of tax as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_GreaterThan(String tax) {
        regTax(CK_GT, fRES(tax));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAX: {varchar(255)}
     * @param tax The value of tax as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_LessThan(String tax) {
        regTax(CK_LT, fRES(tax));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAX: {varchar(255)}
     * @param tax The value of tax as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_GreaterEqual(String tax) {
        regTax(CK_GE, fRES(tax));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAX: {varchar(255)}
     * @param tax The value of tax as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_LessEqual(String tax) {
        regTax(CK_LE, fRES(tax));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAX: {varchar(255)}
     * @param taxList The collection of tax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_InScope(Collection<String> taxList) {
        doSetTax_InScope(taxList);
    }

    protected void doSetTax_InScope(Collection<String> taxList) {
        regINS(CK_INS, cTL(taxList), xgetCValueTax(), "TAX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAX: {varchar(255)}
     * @param taxList The collection of tax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_NotInScope(Collection<String> taxList) {
        doSetTax_NotInScope(taxList);
    }

    protected void doSetTax_NotInScope(Collection<String> taxList) {
        regINS(CK_NINS, cTL(taxList), xgetCValueTax(), "TAX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAX: {varchar(255)} <br>
     * <pre>e.g. setTax_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tax The value of tax as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTax_LikeSearch(String tax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tax), xgetCValueTax(), "TAX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAX: {varchar(255)}
     * @param tax The value of tax as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTax_NotLikeSearch(String tax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tax), xgetCValueTax(), "TAX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAX: {varchar(255)}
     * @param tax The value of tax as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_PrefixSearch(String tax) {
        setTax_LikeSearch(tax, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAX: {varchar(255)}
     */
    public void setTax_IsNull() { regTax(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TAX: {varchar(255)}
     */
    public void setTax_IsNullOrEmpty() { regTax(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAX: {varchar(255)}
     */
    public void setTax_IsNotNull() { regTax(CK_ISNN, DOBJ); }

    protected void regTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTax(), "TAX"); }
    protected abstract ConditionValue xgetCValueTax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_Equal(String zzgodfpc) {
        doSetZzgodfpc_Equal(fRES(zzgodfpc));
    }

    protected void doSetZzgodfpc_Equal(String zzgodfpc) {
        regZzgodfpc(CK_EQ, zzgodfpc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_NotEqual(String zzgodfpc) {
        doSetZzgodfpc_NotEqual(fRES(zzgodfpc));
    }

    protected void doSetZzgodfpc_NotEqual(String zzgodfpc) {
        regZzgodfpc(CK_NES, zzgodfpc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_GreaterThan(String zzgodfpc) {
        regZzgodfpc(CK_GT, fRES(zzgodfpc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_LessThan(String zzgodfpc) {
        regZzgodfpc(CK_LT, fRES(zzgodfpc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_GreaterEqual(String zzgodfpc) {
        regZzgodfpc(CK_GE, fRES(zzgodfpc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_LessEqual(String zzgodfpc) {
        regZzgodfpc(CK_LE, fRES(zzgodfpc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpcList The collection of zzgodfpc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_InScope(Collection<String> zzgodfpcList) {
        doSetZzgodfpc_InScope(zzgodfpcList);
    }

    protected void doSetZzgodfpc_InScope(Collection<String> zzgodfpcList) {
        regINS(CK_INS, cTL(zzgodfpcList), xgetCValueZzgodfpc(), "ZZGODFPC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpcList The collection of zzgodfpc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_NotInScope(Collection<String> zzgodfpcList) {
        doSetZzgodfpc_NotInScope(zzgodfpcList);
    }

    protected void doSetZzgodfpc_NotInScope(Collection<String> zzgodfpcList) {
        regINS(CK_NINS, cTL(zzgodfpcList), xgetCValueZzgodfpc(), "ZZGODFPC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODFPC: {varchar(255)} <br>
     * <pre>e.g. setZzgodfpc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzgodfpc The value of zzgodfpc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzgodfpc_LikeSearch(String zzgodfpc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzgodfpc), xgetCValueZzgodfpc(), "ZZGODFPC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzgodfpc_NotLikeSearch(String zzgodfpc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzgodfpc), xgetCValueZzgodfpc(), "ZZGODFPC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     * @param zzgodfpc The value of zzgodfpc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodfpc_PrefixSearch(String zzgodfpc) {
        setZzgodfpc_LikeSearch(zzgodfpc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     */
    public void setZzgodfpc_IsNull() { regZzgodfpc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     */
    public void setZzgodfpc_IsNullOrEmpty() { regZzgodfpc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZGODFPC: {varchar(255)}
     */
    public void setZzgodfpc_IsNotNull() { regZzgodfpc(CK_ISNN, DOBJ); }

    protected void regZzgodfpc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzgodfpc(), "ZZGODFPC"); }
    protected abstract ConditionValue xgetCValueZzgodfpc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_Equal(String zzgodspc) {
        doSetZzgodspc_Equal(fRES(zzgodspc));
    }

    protected void doSetZzgodspc_Equal(String zzgodspc) {
        regZzgodspc(CK_EQ, zzgodspc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_NotEqual(String zzgodspc) {
        doSetZzgodspc_NotEqual(fRES(zzgodspc));
    }

    protected void doSetZzgodspc_NotEqual(String zzgodspc) {
        regZzgodspc(CK_NES, zzgodspc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_GreaterThan(String zzgodspc) {
        regZzgodspc(CK_GT, fRES(zzgodspc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_LessThan(String zzgodspc) {
        regZzgodspc(CK_LT, fRES(zzgodspc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_GreaterEqual(String zzgodspc) {
        regZzgodspc(CK_GE, fRES(zzgodspc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_LessEqual(String zzgodspc) {
        regZzgodspc(CK_LE, fRES(zzgodspc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspcList The collection of zzgodspc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_InScope(Collection<String> zzgodspcList) {
        doSetZzgodspc_InScope(zzgodspcList);
    }

    protected void doSetZzgodspc_InScope(Collection<String> zzgodspcList) {
        regINS(CK_INS, cTL(zzgodspcList), xgetCValueZzgodspc(), "ZZGODSPC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspcList The collection of zzgodspc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_NotInScope(Collection<String> zzgodspcList) {
        doSetZzgodspc_NotInScope(zzgodspcList);
    }

    protected void doSetZzgodspc_NotInScope(Collection<String> zzgodspcList) {
        regINS(CK_NINS, cTL(zzgodspcList), xgetCValueZzgodspc(), "ZZGODSPC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODSPC: {varchar(255)} <br>
     * <pre>e.g. setZzgodspc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzgodspc The value of zzgodspc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzgodspc_LikeSearch(String zzgodspc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzgodspc), xgetCValueZzgodspc(), "ZZGODSPC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzgodspc_NotLikeSearch(String zzgodspc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzgodspc), xgetCValueZzgodspc(), "ZZGODSPC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     * @param zzgodspc The value of zzgodspc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodspc_PrefixSearch(String zzgodspc) {
        setZzgodspc_LikeSearch(zzgodspc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     */
    public void setZzgodspc_IsNull() { regZzgodspc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     */
    public void setZzgodspc_IsNullOrEmpty() { regZzgodspc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZGODSPC: {varchar(255)}
     */
    public void setZzgodspc_IsNotNull() { regZzgodspc(CK_ISNN, DOBJ); }

    protected void regZzgodspc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzgodspc(), "ZZGODSPC"); }
    protected abstract ConditionValue xgetCValueZzgodspc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_Equal(String zzgodctx) {
        doSetZzgodctx_Equal(fRES(zzgodctx));
    }

    protected void doSetZzgodctx_Equal(String zzgodctx) {
        regZzgodctx(CK_EQ, zzgodctx);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_NotEqual(String zzgodctx) {
        doSetZzgodctx_NotEqual(fRES(zzgodctx));
    }

    protected void doSetZzgodctx_NotEqual(String zzgodctx) {
        regZzgodctx(CK_NES, zzgodctx);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_GreaterThan(String zzgodctx) {
        regZzgodctx(CK_GT, fRES(zzgodctx));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_LessThan(String zzgodctx) {
        regZzgodctx(CK_LT, fRES(zzgodctx));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_GreaterEqual(String zzgodctx) {
        regZzgodctx(CK_GE, fRES(zzgodctx));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_LessEqual(String zzgodctx) {
        regZzgodctx(CK_LE, fRES(zzgodctx));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctxList The collection of zzgodctx as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_InScope(Collection<String> zzgodctxList) {
        doSetZzgodctx_InScope(zzgodctxList);
    }

    protected void doSetZzgodctx_InScope(Collection<String> zzgodctxList) {
        regINS(CK_INS, cTL(zzgodctxList), xgetCValueZzgodctx(), "ZZGODCTX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctxList The collection of zzgodctx as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_NotInScope(Collection<String> zzgodctxList) {
        doSetZzgodctx_NotInScope(zzgodctxList);
    }

    protected void doSetZzgodctx_NotInScope(Collection<String> zzgodctxList) {
        regINS(CK_NINS, cTL(zzgodctxList), xgetCValueZzgodctx(), "ZZGODCTX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODCTX: {varchar(255)} <br>
     * <pre>e.g. setZzgodctx_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzgodctx The value of zzgodctx as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzgodctx_LikeSearch(String zzgodctx, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzgodctx), xgetCValueZzgodctx(), "ZZGODCTX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzgodctx_NotLikeSearch(String zzgodctx, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzgodctx), xgetCValueZzgodctx(), "ZZGODCTX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     * @param zzgodctx The value of zzgodctx as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzgodctx_PrefixSearch(String zzgodctx) {
        setZzgodctx_LikeSearch(zzgodctx, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     */
    public void setZzgodctx_IsNull() { regZzgodctx(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     */
    public void setZzgodctx_IsNullOrEmpty() { regZzgodctx(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZGODCTX: {varchar(255)}
     */
    public void setZzgodctx_IsNotNull() { regZzgodctx(CK_ISNN, DOBJ); }

    protected void regZzgodctx(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzgodctx(), "ZZGODCTX"); }
    protected abstract ConditionValue xgetCValueZzgodctx();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_Equal(String companyCd) {
        doSetCompanyCd_Equal(fRES(companyCd));
    }

    protected void doSetCompanyCd_Equal(String companyCd) {
        regCompanyCd(CK_EQ, companyCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_NotEqual(String companyCd) {
        doSetCompanyCd_NotEqual(fRES(companyCd));
    }

    protected void doSetCompanyCd_NotEqual(String companyCd) {
        regCompanyCd(CK_NES, companyCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_GreaterThan(String companyCd) {
        regCompanyCd(CK_GT, fRES(companyCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_LessThan(String companyCd) {
        regCompanyCd(CK_LT, fRES(companyCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_GreaterEqual(String companyCd) {
        regCompanyCd(CK_GE, fRES(companyCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_LessEqual(String companyCd) {
        regCompanyCd(CK_LE, fRES(companyCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCdList The collection of companyCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_InScope(Collection<String> companyCdList) {
        doSetCompanyCd_InScope(companyCdList);
    }

    protected void doSetCompanyCd_InScope(Collection<String> companyCdList) {
        regINS(CK_INS, cTL(companyCdList), xgetCValueCompanyCd(), "COMPANY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCdList The collection of companyCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_NotInScope(Collection<String> companyCdList) {
        doSetCompanyCd_NotInScope(companyCdList);
    }

    protected void doSetCompanyCd_NotInScope(Collection<String> companyCdList) {
        regINS(CK_NINS, cTL(companyCdList), xgetCValueCompanyCd(), "COMPANY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(255)} <br>
     * <pre>e.g. setCompanyCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companyCd The value of companyCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanyCd_LikeSearch(String companyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companyCd), xgetCValueCompanyCd(), "COMPANY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanyCd_NotLikeSearch(String companyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companyCd), xgetCValueCompanyCd(), "COMPANY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     * @param companyCd The value of companyCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_PrefixSearch(String companyCd) {
        setCompanyCd_LikeSearch(companyCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     */
    public void setCompanyCd_IsNull() { regCompanyCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     */
    public void setCompanyCd_IsNullOrEmpty() { regCompanyCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(255)}
     */
    public void setCompanyCd_IsNotNull() { regCompanyCd(CK_ISNN, DOBJ); }

    protected void regCompanyCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanyCd(), "COMPANY_CD"); }
    protected abstract ConditionValue xgetCValueCompanyCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALE_TYPE: {varchar(255)}
     * @param saleType The value of saleType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleType_Equal(String saleType) {
        doSetSaleType_Equal(fRES(saleType));
    }

    protected void doSetSaleType_Equal(String saleType) {
        regSaleType(CK_EQ, saleType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALE_TYPE: {varchar(255)}
     * @param saleType The value of saleType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleType_NotEqual(String saleType) {
        doSetSaleType_NotEqual(fRES(saleType));
    }

    protected void doSetSaleType_NotEqual(String saleType) {
        regSaleType(CK_NES, saleType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALE_TYPE: {varchar(255)}
     * @param saleType The value of saleType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleType_GreaterThan(String saleType) {
        regSaleType(CK_GT, fRES(saleType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALE_TYPE: {varchar(255)}
     * @param saleType The value of saleType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleType_LessThan(String saleType) {
        regSaleType(CK_LT, fRES(saleType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALE_TYPE: {varchar(255)}
     * @param saleType The value of saleType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleType_GreaterEqual(String saleType) {
        regSaleType(CK_GE, fRES(saleType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALE_TYPE: {varchar(255)}
     * @param saleType The value of saleType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleType_LessEqual(String saleType) {
        regSaleType(CK_LE, fRES(saleType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALE_TYPE: {varchar(255)}
     * @param saleTypeList The collection of saleType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleType_InScope(Collection<String> saleTypeList) {
        doSetSaleType_InScope(saleTypeList);
    }

    protected void doSetSaleType_InScope(Collection<String> saleTypeList) {
        regINS(CK_INS, cTL(saleTypeList), xgetCValueSaleType(), "SALE_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALE_TYPE: {varchar(255)}
     * @param saleTypeList The collection of saleType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleType_NotInScope(Collection<String> saleTypeList) {
        doSetSaleType_NotInScope(saleTypeList);
    }

    protected void doSetSaleType_NotInScope(Collection<String> saleTypeList) {
        regINS(CK_NINS, cTL(saleTypeList), xgetCValueSaleType(), "SALE_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALE_TYPE: {varchar(255)} <br>
     * <pre>e.g. setSaleType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param saleType The value of saleType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSaleType_LikeSearch(String saleType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(saleType), xgetCValueSaleType(), "SALE_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALE_TYPE: {varchar(255)}
     * @param saleType The value of saleType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSaleType_NotLikeSearch(String saleType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(saleType), xgetCValueSaleType(), "SALE_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALE_TYPE: {varchar(255)}
     * @param saleType The value of saleType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSaleType_PrefixSearch(String saleType) {
        setSaleType_LikeSearch(saleType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALE_TYPE: {varchar(255)}
     */
    public void setSaleType_IsNull() { regSaleType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALE_TYPE: {varchar(255)}
     */
    public void setSaleType_IsNullOrEmpty() { regSaleType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALE_TYPE: {varchar(255)}
     */
    public void setSaleType_IsNotNull() { regSaleType(CK_ISNN, DOBJ); }

    protected void regSaleType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSaleType(), "SALE_TYPE"); }
    protected abstract ConditionValue xgetCValueSaleType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRT_REASON: {varchar(255)}
     * @param hvrtReason The value of hvrtReason as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtReason_Equal(String hvrtReason) {
        doSetHvrtReason_Equal(fRES(hvrtReason));
    }

    protected void doSetHvrtReason_Equal(String hvrtReason) {
        regHvrtReason(CK_EQ, hvrtReason);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRT_REASON: {varchar(255)}
     * @param hvrtReason The value of hvrtReason as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtReason_NotEqual(String hvrtReason) {
        doSetHvrtReason_NotEqual(fRES(hvrtReason));
    }

    protected void doSetHvrtReason_NotEqual(String hvrtReason) {
        regHvrtReason(CK_NES, hvrtReason);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRT_REASON: {varchar(255)}
     * @param hvrtReason The value of hvrtReason as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtReason_GreaterThan(String hvrtReason) {
        regHvrtReason(CK_GT, fRES(hvrtReason));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRT_REASON: {varchar(255)}
     * @param hvrtReason The value of hvrtReason as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtReason_LessThan(String hvrtReason) {
        regHvrtReason(CK_LT, fRES(hvrtReason));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRT_REASON: {varchar(255)}
     * @param hvrtReason The value of hvrtReason as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtReason_GreaterEqual(String hvrtReason) {
        regHvrtReason(CK_GE, fRES(hvrtReason));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRT_REASON: {varchar(255)}
     * @param hvrtReason The value of hvrtReason as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtReason_LessEqual(String hvrtReason) {
        regHvrtReason(CK_LE, fRES(hvrtReason));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HVRT_REASON: {varchar(255)}
     * @param hvrtReasonList The collection of hvrtReason as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtReason_InScope(Collection<String> hvrtReasonList) {
        doSetHvrtReason_InScope(hvrtReasonList);
    }

    protected void doSetHvrtReason_InScope(Collection<String> hvrtReasonList) {
        regINS(CK_INS, cTL(hvrtReasonList), xgetCValueHvrtReason(), "HVRT_REASON");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HVRT_REASON: {varchar(255)}
     * @param hvrtReasonList The collection of hvrtReason as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtReason_NotInScope(Collection<String> hvrtReasonList) {
        doSetHvrtReason_NotInScope(hvrtReasonList);
    }

    protected void doSetHvrtReason_NotInScope(Collection<String> hvrtReasonList) {
        regINS(CK_NINS, cTL(hvrtReasonList), xgetCValueHvrtReason(), "HVRT_REASON");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRT_REASON: {varchar(255)} <br>
     * <pre>e.g. setHvrtReason_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hvrtReason The value of hvrtReason as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHvrtReason_LikeSearch(String hvrtReason, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hvrtReason), xgetCValueHvrtReason(), "HVRT_REASON", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRT_REASON: {varchar(255)}
     * @param hvrtReason The value of hvrtReason as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHvrtReason_NotLikeSearch(String hvrtReason, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hvrtReason), xgetCValueHvrtReason(), "HVRT_REASON", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRT_REASON: {varchar(255)}
     * @param hvrtReason The value of hvrtReason as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtReason_PrefixSearch(String hvrtReason) {
        setHvrtReason_LikeSearch(hvrtReason, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HVRT_REASON: {varchar(255)}
     */
    public void setHvrtReason_IsNull() { regHvrtReason(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HVRT_REASON: {varchar(255)}
     */
    public void setHvrtReason_IsNullOrEmpty() { regHvrtReason(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HVRT_REASON: {varchar(255)}
     */
    public void setHvrtReason_IsNotNull() { regHvrtReason(CK_ISNN, DOBJ); }

    protected void regHvrtReason(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHvrtReason(), "HVRT_REASON"); }
    protected abstract ConditionValue xgetCValueHvrtReason();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     * @param hvrtInoutDate The value of hvrtInoutDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtInoutDate_Equal(String hvrtInoutDate) {
        doSetHvrtInoutDate_Equal(fRES(hvrtInoutDate));
    }

    protected void doSetHvrtInoutDate_Equal(String hvrtInoutDate) {
        regHvrtInoutDate(CK_EQ, hvrtInoutDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     * @param hvrtInoutDate The value of hvrtInoutDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtInoutDate_NotEqual(String hvrtInoutDate) {
        doSetHvrtInoutDate_NotEqual(fRES(hvrtInoutDate));
    }

    protected void doSetHvrtInoutDate_NotEqual(String hvrtInoutDate) {
        regHvrtInoutDate(CK_NES, hvrtInoutDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     * @param hvrtInoutDate The value of hvrtInoutDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtInoutDate_GreaterThan(String hvrtInoutDate) {
        regHvrtInoutDate(CK_GT, fRES(hvrtInoutDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     * @param hvrtInoutDate The value of hvrtInoutDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtInoutDate_LessThan(String hvrtInoutDate) {
        regHvrtInoutDate(CK_LT, fRES(hvrtInoutDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     * @param hvrtInoutDate The value of hvrtInoutDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtInoutDate_GreaterEqual(String hvrtInoutDate) {
        regHvrtInoutDate(CK_GE, fRES(hvrtInoutDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     * @param hvrtInoutDate The value of hvrtInoutDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtInoutDate_LessEqual(String hvrtInoutDate) {
        regHvrtInoutDate(CK_LE, fRES(hvrtInoutDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     * @param hvrtInoutDateList The collection of hvrtInoutDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtInoutDate_InScope(Collection<String> hvrtInoutDateList) {
        doSetHvrtInoutDate_InScope(hvrtInoutDateList);
    }

    protected void doSetHvrtInoutDate_InScope(Collection<String> hvrtInoutDateList) {
        regINS(CK_INS, cTL(hvrtInoutDateList), xgetCValueHvrtInoutDate(), "HVRT_INOUT_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     * @param hvrtInoutDateList The collection of hvrtInoutDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtInoutDate_NotInScope(Collection<String> hvrtInoutDateList) {
        doSetHvrtInoutDate_NotInScope(hvrtInoutDateList);
    }

    protected void doSetHvrtInoutDate_NotInScope(Collection<String> hvrtInoutDateList) {
        regINS(CK_NINS, cTL(hvrtInoutDateList), xgetCValueHvrtInoutDate(), "HVRT_INOUT_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRT_INOUT_DATE: {varchar(255)} <br>
     * <pre>e.g. setHvrtInoutDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hvrtInoutDate The value of hvrtInoutDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHvrtInoutDate_LikeSearch(String hvrtInoutDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hvrtInoutDate), xgetCValueHvrtInoutDate(), "HVRT_INOUT_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     * @param hvrtInoutDate The value of hvrtInoutDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHvrtInoutDate_NotLikeSearch(String hvrtInoutDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hvrtInoutDate), xgetCValueHvrtInoutDate(), "HVRT_INOUT_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     * @param hvrtInoutDate The value of hvrtInoutDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtInoutDate_PrefixSearch(String hvrtInoutDate) {
        setHvrtInoutDate_LikeSearch(hvrtInoutDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     */
    public void setHvrtInoutDate_IsNull() { regHvrtInoutDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     */
    public void setHvrtInoutDate_IsNullOrEmpty() { regHvrtInoutDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HVRT_INOUT_DATE: {varchar(255)}
     */
    public void setHvrtInoutDate_IsNotNull() { regHvrtInoutDate(CK_ISNN, DOBJ); }

    protected void regHvrtInoutDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHvrtInoutDate(), "HVRT_INOUT_DATE"); }
    protected abstract ConditionValue xgetCValueHvrtInoutDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     * @param cngPrtSlipNo The value of cngPrtSlipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngPrtSlipNo_Equal(String cngPrtSlipNo) {
        doSetCngPrtSlipNo_Equal(fRES(cngPrtSlipNo));
    }

    protected void doSetCngPrtSlipNo_Equal(String cngPrtSlipNo) {
        regCngPrtSlipNo(CK_EQ, cngPrtSlipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     * @param cngPrtSlipNo The value of cngPrtSlipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngPrtSlipNo_NotEqual(String cngPrtSlipNo) {
        doSetCngPrtSlipNo_NotEqual(fRES(cngPrtSlipNo));
    }

    protected void doSetCngPrtSlipNo_NotEqual(String cngPrtSlipNo) {
        regCngPrtSlipNo(CK_NES, cngPrtSlipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     * @param cngPrtSlipNo The value of cngPrtSlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngPrtSlipNo_GreaterThan(String cngPrtSlipNo) {
        regCngPrtSlipNo(CK_GT, fRES(cngPrtSlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     * @param cngPrtSlipNo The value of cngPrtSlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngPrtSlipNo_LessThan(String cngPrtSlipNo) {
        regCngPrtSlipNo(CK_LT, fRES(cngPrtSlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     * @param cngPrtSlipNo The value of cngPrtSlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngPrtSlipNo_GreaterEqual(String cngPrtSlipNo) {
        regCngPrtSlipNo(CK_GE, fRES(cngPrtSlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     * @param cngPrtSlipNo The value of cngPrtSlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngPrtSlipNo_LessEqual(String cngPrtSlipNo) {
        regCngPrtSlipNo(CK_LE, fRES(cngPrtSlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     * @param cngPrtSlipNoList The collection of cngPrtSlipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngPrtSlipNo_InScope(Collection<String> cngPrtSlipNoList) {
        doSetCngPrtSlipNo_InScope(cngPrtSlipNoList);
    }

    protected void doSetCngPrtSlipNo_InScope(Collection<String> cngPrtSlipNoList) {
        regINS(CK_INS, cTL(cngPrtSlipNoList), xgetCValueCngPrtSlipNo(), "CNG_PRT_SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     * @param cngPrtSlipNoList The collection of cngPrtSlipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngPrtSlipNo_NotInScope(Collection<String> cngPrtSlipNoList) {
        doSetCngPrtSlipNo_NotInScope(cngPrtSlipNoList);
    }

    protected void doSetCngPrtSlipNo_NotInScope(Collection<String> cngPrtSlipNoList) {
        regINS(CK_NINS, cTL(cngPrtSlipNoList), xgetCValueCngPrtSlipNo(), "CNG_PRT_SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)} <br>
     * <pre>e.g. setCngPrtSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cngPrtSlipNo The value of cngPrtSlipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCngPrtSlipNo_LikeSearch(String cngPrtSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cngPrtSlipNo), xgetCValueCngPrtSlipNo(), "CNG_PRT_SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     * @param cngPrtSlipNo The value of cngPrtSlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCngPrtSlipNo_NotLikeSearch(String cngPrtSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cngPrtSlipNo), xgetCValueCngPrtSlipNo(), "CNG_PRT_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     * @param cngPrtSlipNo The value of cngPrtSlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngPrtSlipNo_PrefixSearch(String cngPrtSlipNo) {
        setCngPrtSlipNo_LikeSearch(cngPrtSlipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     */
    public void setCngPrtSlipNo_IsNull() { regCngPrtSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     */
    public void setCngPrtSlipNo_IsNullOrEmpty() { regCngPrtSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CNG_PRT_SLIP_NO: {varchar(255)}
     */
    public void setCngPrtSlipNo_IsNotNull() { regCngPrtSlipNo(CK_ISNN, DOBJ); }

    protected void regCngPrtSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCngPrtSlipNo(), "CNG_PRT_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueCngPrtSlipNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE: {varchar(255)}
     * @param processType The value of processType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessType_Equal(String processType) {
        doSetProcessType_Equal(fRES(processType));
    }

    protected void doSetProcessType_Equal(String processType) {
        regProcessType(CK_EQ, processType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE: {varchar(255)}
     * @param processType The value of processType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessType_NotEqual(String processType) {
        doSetProcessType_NotEqual(fRES(processType));
    }

    protected void doSetProcessType_NotEqual(String processType) {
        regProcessType(CK_NES, processType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE: {varchar(255)}
     * @param processType The value of processType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessType_GreaterThan(String processType) {
        regProcessType(CK_GT, fRES(processType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE: {varchar(255)}
     * @param processType The value of processType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessType_LessThan(String processType) {
        regProcessType(CK_LT, fRES(processType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE: {varchar(255)}
     * @param processType The value of processType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessType_GreaterEqual(String processType) {
        regProcessType(CK_GE, fRES(processType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE: {varchar(255)}
     * @param processType The value of processType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessType_LessEqual(String processType) {
        regProcessType(CK_LE, fRES(processType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE: {varchar(255)}
     * @param processTypeList The collection of processType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessType_InScope(Collection<String> processTypeList) {
        doSetProcessType_InScope(processTypeList);
    }

    protected void doSetProcessType_InScope(Collection<String> processTypeList) {
        regINS(CK_INS, cTL(processTypeList), xgetCValueProcessType(), "PROCESS_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE: {varchar(255)}
     * @param processTypeList The collection of processType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessType_NotInScope(Collection<String> processTypeList) {
        doSetProcessType_NotInScope(processTypeList);
    }

    protected void doSetProcessType_NotInScope(Collection<String> processTypeList) {
        regINS(CK_NINS, cTL(processTypeList), xgetCValueProcessType(), "PROCESS_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE: {varchar(255)} <br>
     * <pre>e.g. setProcessType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processType The value of processType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessType_LikeSearch(String processType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processType), xgetCValueProcessType(), "PROCESS_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE: {varchar(255)}
     * @param processType The value of processType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessType_NotLikeSearch(String processType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processType), xgetCValueProcessType(), "PROCESS_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE: {varchar(255)}
     * @param processType The value of processType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessType_PrefixSearch(String processType) {
        setProcessType_LikeSearch(processType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE: {varchar(255)}
     */
    public void setProcessType_IsNull() { regProcessType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE: {varchar(255)}
     */
    public void setProcessType_IsNullOrEmpty() { regProcessType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE: {varchar(255)}
     */
    public void setProcessType_IsNotNull() { regProcessType(CK_ISNN, DOBJ); }

    protected void regProcessType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessType(), "PROCESS_TYPE"); }
    protected abstract ConditionValue xgetCValueProcessType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     * @param eosOrdAftFlg The value of eosOrdAftFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosOrdAftFlg_Equal(String eosOrdAftFlg) {
        doSetEosOrdAftFlg_Equal(fRES(eosOrdAftFlg));
    }

    protected void doSetEosOrdAftFlg_Equal(String eosOrdAftFlg) {
        regEosOrdAftFlg(CK_EQ, eosOrdAftFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     * @param eosOrdAftFlg The value of eosOrdAftFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosOrdAftFlg_NotEqual(String eosOrdAftFlg) {
        doSetEosOrdAftFlg_NotEqual(fRES(eosOrdAftFlg));
    }

    protected void doSetEosOrdAftFlg_NotEqual(String eosOrdAftFlg) {
        regEosOrdAftFlg(CK_NES, eosOrdAftFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     * @param eosOrdAftFlg The value of eosOrdAftFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosOrdAftFlg_GreaterThan(String eosOrdAftFlg) {
        regEosOrdAftFlg(CK_GT, fRES(eosOrdAftFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     * @param eosOrdAftFlg The value of eosOrdAftFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosOrdAftFlg_LessThan(String eosOrdAftFlg) {
        regEosOrdAftFlg(CK_LT, fRES(eosOrdAftFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     * @param eosOrdAftFlg The value of eosOrdAftFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosOrdAftFlg_GreaterEqual(String eosOrdAftFlg) {
        regEosOrdAftFlg(CK_GE, fRES(eosOrdAftFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     * @param eosOrdAftFlg The value of eosOrdAftFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosOrdAftFlg_LessEqual(String eosOrdAftFlg) {
        regEosOrdAftFlg(CK_LE, fRES(eosOrdAftFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     * @param eosOrdAftFlgList The collection of eosOrdAftFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosOrdAftFlg_InScope(Collection<String> eosOrdAftFlgList) {
        doSetEosOrdAftFlg_InScope(eosOrdAftFlgList);
    }

    protected void doSetEosOrdAftFlg_InScope(Collection<String> eosOrdAftFlgList) {
        regINS(CK_INS, cTL(eosOrdAftFlgList), xgetCValueEosOrdAftFlg(), "EOS_ORD_AFT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     * @param eosOrdAftFlgList The collection of eosOrdAftFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosOrdAftFlg_NotInScope(Collection<String> eosOrdAftFlgList) {
        doSetEosOrdAftFlg_NotInScope(eosOrdAftFlgList);
    }

    protected void doSetEosOrdAftFlg_NotInScope(Collection<String> eosOrdAftFlgList) {
        regINS(CK_NINS, cTL(eosOrdAftFlgList), xgetCValueEosOrdAftFlg(), "EOS_ORD_AFT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)} <br>
     * <pre>e.g. setEosOrdAftFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eosOrdAftFlg The value of eosOrdAftFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEosOrdAftFlg_LikeSearch(String eosOrdAftFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eosOrdAftFlg), xgetCValueEosOrdAftFlg(), "EOS_ORD_AFT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     * @param eosOrdAftFlg The value of eosOrdAftFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEosOrdAftFlg_NotLikeSearch(String eosOrdAftFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eosOrdAftFlg), xgetCValueEosOrdAftFlg(), "EOS_ORD_AFT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     * @param eosOrdAftFlg The value of eosOrdAftFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosOrdAftFlg_PrefixSearch(String eosOrdAftFlg) {
        setEosOrdAftFlg_LikeSearch(eosOrdAftFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     */
    public void setEosOrdAftFlg_IsNull() { regEosOrdAftFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     */
    public void setEosOrdAftFlg_IsNullOrEmpty() { regEosOrdAftFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EOS_ORD_AFT_FLG: {varchar(255)}
     */
    public void setEosOrdAftFlg_IsNotNull() { regEosOrdAftFlg(CK_ISNN, DOBJ); }

    protected void regEosOrdAftFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEosOrdAftFlg(), "EOS_ORD_AFT_FLG"); }
    protected abstract ConditionValue xgetCValueEosOrdAftFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOS_SLIP_NO: {varchar(255)}
     * @param eosSlipNo The value of eosSlipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosSlipNo_Equal(String eosSlipNo) {
        doSetEosSlipNo_Equal(fRES(eosSlipNo));
    }

    protected void doSetEosSlipNo_Equal(String eosSlipNo) {
        regEosSlipNo(CK_EQ, eosSlipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOS_SLIP_NO: {varchar(255)}
     * @param eosSlipNo The value of eosSlipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosSlipNo_NotEqual(String eosSlipNo) {
        doSetEosSlipNo_NotEqual(fRES(eosSlipNo));
    }

    protected void doSetEosSlipNo_NotEqual(String eosSlipNo) {
        regEosSlipNo(CK_NES, eosSlipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOS_SLIP_NO: {varchar(255)}
     * @param eosSlipNo The value of eosSlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosSlipNo_GreaterThan(String eosSlipNo) {
        regEosSlipNo(CK_GT, fRES(eosSlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOS_SLIP_NO: {varchar(255)}
     * @param eosSlipNo The value of eosSlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosSlipNo_LessThan(String eosSlipNo) {
        regEosSlipNo(CK_LT, fRES(eosSlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOS_SLIP_NO: {varchar(255)}
     * @param eosSlipNo The value of eosSlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosSlipNo_GreaterEqual(String eosSlipNo) {
        regEosSlipNo(CK_GE, fRES(eosSlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOS_SLIP_NO: {varchar(255)}
     * @param eosSlipNo The value of eosSlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosSlipNo_LessEqual(String eosSlipNo) {
        regEosSlipNo(CK_LE, fRES(eosSlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EOS_SLIP_NO: {varchar(255)}
     * @param eosSlipNoList The collection of eosSlipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosSlipNo_InScope(Collection<String> eosSlipNoList) {
        doSetEosSlipNo_InScope(eosSlipNoList);
    }

    protected void doSetEosSlipNo_InScope(Collection<String> eosSlipNoList) {
        regINS(CK_INS, cTL(eosSlipNoList), xgetCValueEosSlipNo(), "EOS_SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EOS_SLIP_NO: {varchar(255)}
     * @param eosSlipNoList The collection of eosSlipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosSlipNo_NotInScope(Collection<String> eosSlipNoList) {
        doSetEosSlipNo_NotInScope(eosSlipNoList);
    }

    protected void doSetEosSlipNo_NotInScope(Collection<String> eosSlipNoList) {
        regINS(CK_NINS, cTL(eosSlipNoList), xgetCValueEosSlipNo(), "EOS_SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOS_SLIP_NO: {varchar(255)} <br>
     * <pre>e.g. setEosSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eosSlipNo The value of eosSlipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEosSlipNo_LikeSearch(String eosSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eosSlipNo), xgetCValueEosSlipNo(), "EOS_SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOS_SLIP_NO: {varchar(255)}
     * @param eosSlipNo The value of eosSlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEosSlipNo_NotLikeSearch(String eosSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eosSlipNo), xgetCValueEosSlipNo(), "EOS_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOS_SLIP_NO: {varchar(255)}
     * @param eosSlipNo The value of eosSlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosSlipNo_PrefixSearch(String eosSlipNo) {
        setEosSlipNo_LikeSearch(eosSlipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EOS_SLIP_NO: {varchar(255)}
     */
    public void setEosSlipNo_IsNull() { regEosSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EOS_SLIP_NO: {varchar(255)}
     */
    public void setEosSlipNo_IsNullOrEmpty() { regEosSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EOS_SLIP_NO: {varchar(255)}
     */
    public void setEosSlipNo_IsNotNull() { regEosSlipNo(CK_ISNN, DOBJ); }

    protected void regEosSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEosSlipNo(), "EOS_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueEosSlipNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     * @param hdrdBxType The value of hdrdBxType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdBxType_Equal(String hdrdBxType) {
        doSetHdrdBxType_Equal(fRES(hdrdBxType));
    }

    protected void doSetHdrdBxType_Equal(String hdrdBxType) {
        regHdrdBxType(CK_EQ, hdrdBxType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     * @param hdrdBxType The value of hdrdBxType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdBxType_NotEqual(String hdrdBxType) {
        doSetHdrdBxType_NotEqual(fRES(hdrdBxType));
    }

    protected void doSetHdrdBxType_NotEqual(String hdrdBxType) {
        regHdrdBxType(CK_NES, hdrdBxType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     * @param hdrdBxType The value of hdrdBxType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdBxType_GreaterThan(String hdrdBxType) {
        regHdrdBxType(CK_GT, fRES(hdrdBxType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     * @param hdrdBxType The value of hdrdBxType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdBxType_LessThan(String hdrdBxType) {
        regHdrdBxType(CK_LT, fRES(hdrdBxType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     * @param hdrdBxType The value of hdrdBxType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdBxType_GreaterEqual(String hdrdBxType) {
        regHdrdBxType(CK_GE, fRES(hdrdBxType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     * @param hdrdBxType The value of hdrdBxType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdBxType_LessEqual(String hdrdBxType) {
        regHdrdBxType(CK_LE, fRES(hdrdBxType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     * @param hdrdBxTypeList The collection of hdrdBxType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdBxType_InScope(Collection<String> hdrdBxTypeList) {
        doSetHdrdBxType_InScope(hdrdBxTypeList);
    }

    protected void doSetHdrdBxType_InScope(Collection<String> hdrdBxTypeList) {
        regINS(CK_INS, cTL(hdrdBxTypeList), xgetCValueHdrdBxType(), "HDRD_BX_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     * @param hdrdBxTypeList The collection of hdrdBxType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdBxType_NotInScope(Collection<String> hdrdBxTypeList) {
        doSetHdrdBxType_NotInScope(hdrdBxTypeList);
    }

    protected void doSetHdrdBxType_NotInScope(Collection<String> hdrdBxTypeList) {
        regINS(CK_NINS, cTL(hdrdBxTypeList), xgetCValueHdrdBxType(), "HDRD_BX_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRD_BX_TYPE: {varchar(255)} <br>
     * <pre>e.g. setHdrdBxType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hdrdBxType The value of hdrdBxType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHdrdBxType_LikeSearch(String hdrdBxType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hdrdBxType), xgetCValueHdrdBxType(), "HDRD_BX_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     * @param hdrdBxType The value of hdrdBxType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHdrdBxType_NotLikeSearch(String hdrdBxType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hdrdBxType), xgetCValueHdrdBxType(), "HDRD_BX_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     * @param hdrdBxType The value of hdrdBxType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdBxType_PrefixSearch(String hdrdBxType) {
        setHdrdBxType_LikeSearch(hdrdBxType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     */
    public void setHdrdBxType_IsNull() { regHdrdBxType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     */
    public void setHdrdBxType_IsNullOrEmpty() { regHdrdBxType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HDRD_BX_TYPE: {varchar(255)}
     */
    public void setHdrdBxType_IsNotNull() { regHdrdBxType(CK_ISNN, DOBJ); }

    protected void regHdrdBxType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHdrdBxType(), "HDRD_BX_TYPE"); }
    protected abstract ConditionValue xgetCValueHdrdBxType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     * @param inotRfslType The value of inotRfslType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotRfslType_Equal(String inotRfslType) {
        doSetInotRfslType_Equal(fRES(inotRfslType));
    }

    protected void doSetInotRfslType_Equal(String inotRfslType) {
        regInotRfslType(CK_EQ, inotRfslType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     * @param inotRfslType The value of inotRfslType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotRfslType_NotEqual(String inotRfslType) {
        doSetInotRfslType_NotEqual(fRES(inotRfslType));
    }

    protected void doSetInotRfslType_NotEqual(String inotRfslType) {
        regInotRfslType(CK_NES, inotRfslType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     * @param inotRfslType The value of inotRfslType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotRfslType_GreaterThan(String inotRfslType) {
        regInotRfslType(CK_GT, fRES(inotRfslType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     * @param inotRfslType The value of inotRfslType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotRfslType_LessThan(String inotRfslType) {
        regInotRfslType(CK_LT, fRES(inotRfslType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     * @param inotRfslType The value of inotRfslType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotRfslType_GreaterEqual(String inotRfslType) {
        regInotRfslType(CK_GE, fRES(inotRfslType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     * @param inotRfslType The value of inotRfslType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotRfslType_LessEqual(String inotRfslType) {
        regInotRfslType(CK_LE, fRES(inotRfslType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     * @param inotRfslTypeList The collection of inotRfslType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotRfslType_InScope(Collection<String> inotRfslTypeList) {
        doSetInotRfslType_InScope(inotRfslTypeList);
    }

    protected void doSetInotRfslType_InScope(Collection<String> inotRfslTypeList) {
        regINS(CK_INS, cTL(inotRfslTypeList), xgetCValueInotRfslType(), "INOT_RFSL_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     * @param inotRfslTypeList The collection of inotRfslType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotRfslType_NotInScope(Collection<String> inotRfslTypeList) {
        doSetInotRfslType_NotInScope(inotRfslTypeList);
    }

    protected void doSetInotRfslType_NotInScope(Collection<String> inotRfslTypeList) {
        regINS(CK_NINS, cTL(inotRfslTypeList), xgetCValueInotRfslType(), "INOT_RFSL_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOT_RFSL_TYPE: {varchar(255)} <br>
     * <pre>e.g. setInotRfslType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inotRfslType The value of inotRfslType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInotRfslType_LikeSearch(String inotRfslType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inotRfslType), xgetCValueInotRfslType(), "INOT_RFSL_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     * @param inotRfslType The value of inotRfslType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInotRfslType_NotLikeSearch(String inotRfslType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inotRfslType), xgetCValueInotRfslType(), "INOT_RFSL_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     * @param inotRfslType The value of inotRfslType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotRfslType_PrefixSearch(String inotRfslType) {
        setInotRfslType_LikeSearch(inotRfslType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     */
    public void setInotRfslType_IsNull() { regInotRfslType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     */
    public void setInotRfslType_IsNullOrEmpty() { regInotRfslType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INOT_RFSL_TYPE: {varchar(255)}
     */
    public void setInotRfslType_IsNotNull() { regInotRfslType(CK_ISNN, DOBJ); }

    protected void regInotRfslType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInotRfslType(), "INOT_RFSL_TYPE"); }
    protected abstract ConditionValue xgetCValueInotRfslType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     * @param bxMntRfslType The value of bxMntRfslType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxMntRfslType_Equal(String bxMntRfslType) {
        doSetBxMntRfslType_Equal(fRES(bxMntRfslType));
    }

    protected void doSetBxMntRfslType_Equal(String bxMntRfslType) {
        regBxMntRfslType(CK_EQ, bxMntRfslType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     * @param bxMntRfslType The value of bxMntRfslType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxMntRfslType_NotEqual(String bxMntRfslType) {
        doSetBxMntRfslType_NotEqual(fRES(bxMntRfslType));
    }

    protected void doSetBxMntRfslType_NotEqual(String bxMntRfslType) {
        regBxMntRfslType(CK_NES, bxMntRfslType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     * @param bxMntRfslType The value of bxMntRfslType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxMntRfslType_GreaterThan(String bxMntRfslType) {
        regBxMntRfslType(CK_GT, fRES(bxMntRfslType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     * @param bxMntRfslType The value of bxMntRfslType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxMntRfslType_LessThan(String bxMntRfslType) {
        regBxMntRfslType(CK_LT, fRES(bxMntRfslType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     * @param bxMntRfslType The value of bxMntRfslType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxMntRfslType_GreaterEqual(String bxMntRfslType) {
        regBxMntRfslType(CK_GE, fRES(bxMntRfslType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     * @param bxMntRfslType The value of bxMntRfslType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxMntRfslType_LessEqual(String bxMntRfslType) {
        regBxMntRfslType(CK_LE, fRES(bxMntRfslType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     * @param bxMntRfslTypeList The collection of bxMntRfslType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxMntRfslType_InScope(Collection<String> bxMntRfslTypeList) {
        doSetBxMntRfslType_InScope(bxMntRfslTypeList);
    }

    protected void doSetBxMntRfslType_InScope(Collection<String> bxMntRfslTypeList) {
        regINS(CK_INS, cTL(bxMntRfslTypeList), xgetCValueBxMntRfslType(), "BX_MNT_RFSL_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     * @param bxMntRfslTypeList The collection of bxMntRfslType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxMntRfslType_NotInScope(Collection<String> bxMntRfslTypeList) {
        doSetBxMntRfslType_NotInScope(bxMntRfslTypeList);
    }

    protected void doSetBxMntRfslType_NotInScope(Collection<String> bxMntRfslTypeList) {
        regINS(CK_NINS, cTL(bxMntRfslTypeList), xgetCValueBxMntRfslType(), "BX_MNT_RFSL_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)} <br>
     * <pre>e.g. setBxMntRfslType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bxMntRfslType The value of bxMntRfslType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBxMntRfslType_LikeSearch(String bxMntRfslType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bxMntRfslType), xgetCValueBxMntRfslType(), "BX_MNT_RFSL_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     * @param bxMntRfslType The value of bxMntRfslType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBxMntRfslType_NotLikeSearch(String bxMntRfslType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bxMntRfslType), xgetCValueBxMntRfslType(), "BX_MNT_RFSL_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     * @param bxMntRfslType The value of bxMntRfslType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxMntRfslType_PrefixSearch(String bxMntRfslType) {
        setBxMntRfslType_LikeSearch(bxMntRfslType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     */
    public void setBxMntRfslType_IsNull() { regBxMntRfslType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     */
    public void setBxMntRfslType_IsNullOrEmpty() { regBxMntRfslType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     */
    public void setBxMntRfslType_IsNotNull() { regBxMntRfslType(CK_ISNN, DOBJ); }

    protected void regBxMntRfslType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxMntRfslType(), "BX_MNT_RFSL_TYPE"); }
    protected abstract ConditionValue xgetCValueBxMntRfslType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     * @param reportMerfeTiming The value of reportMerfeTiming as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportMerfeTiming_Equal(String reportMerfeTiming) {
        doSetReportMerfeTiming_Equal(fRES(reportMerfeTiming));
    }

    protected void doSetReportMerfeTiming_Equal(String reportMerfeTiming) {
        regReportMerfeTiming(CK_EQ, reportMerfeTiming);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     * @param reportMerfeTiming The value of reportMerfeTiming as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportMerfeTiming_NotEqual(String reportMerfeTiming) {
        doSetReportMerfeTiming_NotEqual(fRES(reportMerfeTiming));
    }

    protected void doSetReportMerfeTiming_NotEqual(String reportMerfeTiming) {
        regReportMerfeTiming(CK_NES, reportMerfeTiming);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     * @param reportMerfeTiming The value of reportMerfeTiming as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportMerfeTiming_GreaterThan(String reportMerfeTiming) {
        regReportMerfeTiming(CK_GT, fRES(reportMerfeTiming));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     * @param reportMerfeTiming The value of reportMerfeTiming as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportMerfeTiming_LessThan(String reportMerfeTiming) {
        regReportMerfeTiming(CK_LT, fRES(reportMerfeTiming));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     * @param reportMerfeTiming The value of reportMerfeTiming as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportMerfeTiming_GreaterEqual(String reportMerfeTiming) {
        regReportMerfeTiming(CK_GE, fRES(reportMerfeTiming));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     * @param reportMerfeTiming The value of reportMerfeTiming as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportMerfeTiming_LessEqual(String reportMerfeTiming) {
        regReportMerfeTiming(CK_LE, fRES(reportMerfeTiming));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     * @param reportMerfeTimingList The collection of reportMerfeTiming as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportMerfeTiming_InScope(Collection<String> reportMerfeTimingList) {
        doSetReportMerfeTiming_InScope(reportMerfeTimingList);
    }

    protected void doSetReportMerfeTiming_InScope(Collection<String> reportMerfeTimingList) {
        regINS(CK_INS, cTL(reportMerfeTimingList), xgetCValueReportMerfeTiming(), "REPORT_MERFE_TIMING");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     * @param reportMerfeTimingList The collection of reportMerfeTiming as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportMerfeTiming_NotInScope(Collection<String> reportMerfeTimingList) {
        doSetReportMerfeTiming_NotInScope(reportMerfeTimingList);
    }

    protected void doSetReportMerfeTiming_NotInScope(Collection<String> reportMerfeTimingList) {
        regINS(CK_NINS, cTL(reportMerfeTimingList), xgetCValueReportMerfeTiming(), "REPORT_MERFE_TIMING");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_MERFE_TIMING: {varchar(255)} <br>
     * <pre>e.g. setReportMerfeTiming_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reportMerfeTiming The value of reportMerfeTiming as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReportMerfeTiming_LikeSearch(String reportMerfeTiming, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportMerfeTiming), xgetCValueReportMerfeTiming(), "REPORT_MERFE_TIMING", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     * @param reportMerfeTiming The value of reportMerfeTiming as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportMerfeTiming_NotLikeSearch(String reportMerfeTiming, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportMerfeTiming), xgetCValueReportMerfeTiming(), "REPORT_MERFE_TIMING", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     * @param reportMerfeTiming The value of reportMerfeTiming as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportMerfeTiming_PrefixSearch(String reportMerfeTiming) {
        setReportMerfeTiming_LikeSearch(reportMerfeTiming, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     */
    public void setReportMerfeTiming_IsNull() { regReportMerfeTiming(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     */
    public void setReportMerfeTiming_IsNullOrEmpty() { regReportMerfeTiming(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPORT_MERFE_TIMING: {varchar(255)}
     */
    public void setReportMerfeTiming_IsNotNull() { regReportMerfeTiming(CK_ISNN, DOBJ); }

    protected void regReportMerfeTiming(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportMerfeTiming(), "REPORT_MERFE_TIMING"); }
    protected abstract ConditionValue xgetCValueReportMerfeTiming();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     * @param reportOutDatetime The value of reportOutDatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportOutDatetime_Equal(String reportOutDatetime) {
        doSetReportOutDatetime_Equal(fRES(reportOutDatetime));
    }

    protected void doSetReportOutDatetime_Equal(String reportOutDatetime) {
        regReportOutDatetime(CK_EQ, reportOutDatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     * @param reportOutDatetime The value of reportOutDatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportOutDatetime_NotEqual(String reportOutDatetime) {
        doSetReportOutDatetime_NotEqual(fRES(reportOutDatetime));
    }

    protected void doSetReportOutDatetime_NotEqual(String reportOutDatetime) {
        regReportOutDatetime(CK_NES, reportOutDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     * @param reportOutDatetime The value of reportOutDatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportOutDatetime_GreaterThan(String reportOutDatetime) {
        regReportOutDatetime(CK_GT, fRES(reportOutDatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     * @param reportOutDatetime The value of reportOutDatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportOutDatetime_LessThan(String reportOutDatetime) {
        regReportOutDatetime(CK_LT, fRES(reportOutDatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     * @param reportOutDatetime The value of reportOutDatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportOutDatetime_GreaterEqual(String reportOutDatetime) {
        regReportOutDatetime(CK_GE, fRES(reportOutDatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     * @param reportOutDatetime The value of reportOutDatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportOutDatetime_LessEqual(String reportOutDatetime) {
        regReportOutDatetime(CK_LE, fRES(reportOutDatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     * @param reportOutDatetimeList The collection of reportOutDatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportOutDatetime_InScope(Collection<String> reportOutDatetimeList) {
        doSetReportOutDatetime_InScope(reportOutDatetimeList);
    }

    protected void doSetReportOutDatetime_InScope(Collection<String> reportOutDatetimeList) {
        regINS(CK_INS, cTL(reportOutDatetimeList), xgetCValueReportOutDatetime(), "REPORT_OUT_DATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     * @param reportOutDatetimeList The collection of reportOutDatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportOutDatetime_NotInScope(Collection<String> reportOutDatetimeList) {
        doSetReportOutDatetime_NotInScope(reportOutDatetimeList);
    }

    protected void doSetReportOutDatetime_NotInScope(Collection<String> reportOutDatetimeList) {
        regINS(CK_NINS, cTL(reportOutDatetimeList), xgetCValueReportOutDatetime(), "REPORT_OUT_DATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_OUT_DATETIME: {varchar(255)} <br>
     * <pre>e.g. setReportOutDatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reportOutDatetime The value of reportOutDatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReportOutDatetime_LikeSearch(String reportOutDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportOutDatetime), xgetCValueReportOutDatetime(), "REPORT_OUT_DATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     * @param reportOutDatetime The value of reportOutDatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportOutDatetime_NotLikeSearch(String reportOutDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportOutDatetime), xgetCValueReportOutDatetime(), "REPORT_OUT_DATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     * @param reportOutDatetime The value of reportOutDatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportOutDatetime_PrefixSearch(String reportOutDatetime) {
        setReportOutDatetime_LikeSearch(reportOutDatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     */
    public void setReportOutDatetime_IsNull() { regReportOutDatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     */
    public void setReportOutDatetime_IsNullOrEmpty() { regReportOutDatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPORT_OUT_DATETIME: {varchar(255)}
     */
    public void setReportOutDatetime_IsNotNull() { regReportOutDatetime(CK_ISNN, DOBJ); }

    protected void regReportOutDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportOutDatetime(), "REPORT_OUT_DATETIME"); }
    protected abstract ConditionValue xgetCValueReportOutDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {varchar(255)}
     * @param clientId The value of clientId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_Equal(String clientId) {
        doSetClientId_Equal(fRES(clientId));
    }

    protected void doSetClientId_Equal(String clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {varchar(255)}
     * @param clientId The value of clientId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(String clientId) {
        doSetClientId_NotEqual(fRES(clientId));
    }

    protected void doSetClientId_NotEqual(String clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {varchar(255)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(String clientId) {
        regClientId(CK_GT, fRES(clientId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {varchar(255)}
     * @param clientId The value of clientId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_LessThan(String clientId) {
        regClientId(CK_LT, fRES(clientId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {varchar(255)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(String clientId) {
        regClientId(CK_GE, fRES(clientId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {varchar(255)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(String clientId) {
        regClientId(CK_LE, fRES(clientId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {varchar(255)}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<String> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<String> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {varchar(255)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<String> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<String> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {varchar(255)} <br>
     * <pre>e.g. setClientId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientId The value of clientId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClientId_LikeSearch(String clientId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientId), xgetCValueClientId(), "CLIENT_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {varchar(255)}
     * @param clientId The value of clientId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClientId_NotLikeSearch(String clientId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientId), xgetCValueClientId(), "CLIENT_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {varchar(255)}
     * @param clientId The value of clientId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_PrefixSearch(String clientId) {
        setClientId_LikeSearch(clientId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {varchar(255)}
     */
    public void setClientId_IsNull() { regClientId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {varchar(255)}
     */
    public void setClientId_IsNullOrEmpty() { regClientId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {varchar(255)}
     */
    public void setClientId_IsNotNull() { regClientId(CK_ISNN, DOBJ); }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_Equal(String kwmeng) {
        doSetKwmeng_Equal(fRES(kwmeng));
    }

    protected void doSetKwmeng_Equal(String kwmeng) {
        regKwmeng(CK_EQ, kwmeng);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_NotEqual(String kwmeng) {
        doSetKwmeng_NotEqual(fRES(kwmeng));
    }

    protected void doSetKwmeng_NotEqual(String kwmeng) {
        regKwmeng(CK_NES, kwmeng);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_GreaterThan(String kwmeng) {
        regKwmeng(CK_GT, fRES(kwmeng));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_LessThan(String kwmeng) {
        regKwmeng(CK_LT, fRES(kwmeng));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_GreaterEqual(String kwmeng) {
        regKwmeng(CK_GE, fRES(kwmeng));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_LessEqual(String kwmeng) {
        regKwmeng(CK_LE, fRES(kwmeng));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmengList The collection of kwmeng as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_InScope(Collection<String> kwmengList) {
        doSetKwmeng_InScope(kwmengList);
    }

    protected void doSetKwmeng_InScope(Collection<String> kwmengList) {
        regINS(CK_INS, cTL(kwmengList), xgetCValueKwmeng(), "KWMENG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmengList The collection of kwmeng as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_NotInScope(Collection<String> kwmengList) {
        doSetKwmeng_NotInScope(kwmengList);
    }

    protected void doSetKwmeng_NotInScope(Collection<String> kwmengList) {
        regINS(CK_NINS, cTL(kwmengList), xgetCValueKwmeng(), "KWMENG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KWMENG: {varchar(255)} <br>
     * <pre>e.g. setKwmeng_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kwmeng The value of kwmeng as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKwmeng_LikeSearch(String kwmeng, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kwmeng), xgetCValueKwmeng(), "KWMENG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKwmeng_NotLikeSearch(String kwmeng, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kwmeng), xgetCValueKwmeng(), "KWMENG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KWMENG: {varchar(255)}
     * @param kwmeng The value of kwmeng as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKwmeng_PrefixSearch(String kwmeng) {
        setKwmeng_LikeSearch(kwmeng, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     */
    public void setKwmeng_IsNull() { regKwmeng(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     */
    public void setKwmeng_IsNullOrEmpty() { regKwmeng(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KWMENG: {varchar(255)}
     */
    public void setKwmeng_IsNotNull() { regKwmeng(CK_ISNN, DOBJ); }

    protected void regKwmeng(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKwmeng(), "KWMENG"); }
    protected abstract ConditionValue xgetCValueKwmeng();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS_CD: {varchar(255)}
     * @param statusCd The value of statusCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatusCd_Equal(String statusCd) {
        doSetStatusCd_Equal(fRES(statusCd));
    }

    protected void doSetStatusCd_Equal(String statusCd) {
        regStatusCd(CK_EQ, statusCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS_CD: {varchar(255)}
     * @param statusCd The value of statusCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatusCd_NotEqual(String statusCd) {
        doSetStatusCd_NotEqual(fRES(statusCd));
    }

    protected void doSetStatusCd_NotEqual(String statusCd) {
        regStatusCd(CK_NES, statusCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS_CD: {varchar(255)}
     * @param statusCd The value of statusCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatusCd_GreaterThan(String statusCd) {
        regStatusCd(CK_GT, fRES(statusCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS_CD: {varchar(255)}
     * @param statusCd The value of statusCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatusCd_LessThan(String statusCd) {
        regStatusCd(CK_LT, fRES(statusCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS_CD: {varchar(255)}
     * @param statusCd The value of statusCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatusCd_GreaterEqual(String statusCd) {
        regStatusCd(CK_GE, fRES(statusCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS_CD: {varchar(255)}
     * @param statusCd The value of statusCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatusCd_LessEqual(String statusCd) {
        regStatusCd(CK_LE, fRES(statusCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATUS_CD: {varchar(255)}
     * @param statusCdList The collection of statusCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatusCd_InScope(Collection<String> statusCdList) {
        doSetStatusCd_InScope(statusCdList);
    }

    protected void doSetStatusCd_InScope(Collection<String> statusCdList) {
        regINS(CK_INS, cTL(statusCdList), xgetCValueStatusCd(), "STATUS_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATUS_CD: {varchar(255)}
     * @param statusCdList The collection of statusCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatusCd_NotInScope(Collection<String> statusCdList) {
        doSetStatusCd_NotInScope(statusCdList);
    }

    protected void doSetStatusCd_NotInScope(Collection<String> statusCdList) {
        regINS(CK_NINS, cTL(statusCdList), xgetCValueStatusCd(), "STATUS_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATUS_CD: {varchar(255)} <br>
     * <pre>e.g. setStatusCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param statusCd The value of statusCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatusCd_LikeSearch(String statusCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(statusCd), xgetCValueStatusCd(), "STATUS_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATUS_CD: {varchar(255)}
     * @param statusCd The value of statusCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStatusCd_NotLikeSearch(String statusCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(statusCd), xgetCValueStatusCd(), "STATUS_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATUS_CD: {varchar(255)}
     * @param statusCd The value of statusCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatusCd_PrefixSearch(String statusCd) {
        setStatusCd_LikeSearch(statusCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STATUS_CD: {varchar(255)}
     */
    public void setStatusCd_IsNull() { regStatusCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STATUS_CD: {varchar(255)}
     */
    public void setStatusCd_IsNullOrEmpty() { regStatusCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STATUS_CD: {varchar(255)}
     */
    public void setStatusCd_IsNotNull() { regStatusCd(CK_ISNN, DOBJ); }

    protected void regStatusCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStatusCd(), "STATUS_CD"); }
    protected abstract ConditionValue xgetCValueStatusCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STG_VAL: {varchar(255)}
     * @param stgVal The value of stgVal as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStgVal_Equal(String stgVal) {
        doSetStgVal_Equal(fRES(stgVal));
    }

    protected void doSetStgVal_Equal(String stgVal) {
        regStgVal(CK_EQ, stgVal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STG_VAL: {varchar(255)}
     * @param stgVal The value of stgVal as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStgVal_NotEqual(String stgVal) {
        doSetStgVal_NotEqual(fRES(stgVal));
    }

    protected void doSetStgVal_NotEqual(String stgVal) {
        regStgVal(CK_NES, stgVal);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STG_VAL: {varchar(255)}
     * @param stgVal The value of stgVal as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStgVal_GreaterThan(String stgVal) {
        regStgVal(CK_GT, fRES(stgVal));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STG_VAL: {varchar(255)}
     * @param stgVal The value of stgVal as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStgVal_LessThan(String stgVal) {
        regStgVal(CK_LT, fRES(stgVal));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STG_VAL: {varchar(255)}
     * @param stgVal The value of stgVal as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStgVal_GreaterEqual(String stgVal) {
        regStgVal(CK_GE, fRES(stgVal));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STG_VAL: {varchar(255)}
     * @param stgVal The value of stgVal as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStgVal_LessEqual(String stgVal) {
        regStgVal(CK_LE, fRES(stgVal));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STG_VAL: {varchar(255)}
     * @param stgValList The collection of stgVal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStgVal_InScope(Collection<String> stgValList) {
        doSetStgVal_InScope(stgValList);
    }

    protected void doSetStgVal_InScope(Collection<String> stgValList) {
        regINS(CK_INS, cTL(stgValList), xgetCValueStgVal(), "STG_VAL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STG_VAL: {varchar(255)}
     * @param stgValList The collection of stgVal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStgVal_NotInScope(Collection<String> stgValList) {
        doSetStgVal_NotInScope(stgValList);
    }

    protected void doSetStgVal_NotInScope(Collection<String> stgValList) {
        regINS(CK_NINS, cTL(stgValList), xgetCValueStgVal(), "STG_VAL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STG_VAL: {varchar(255)} <br>
     * <pre>e.g. setStgVal_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stgVal The value of stgVal as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStgVal_LikeSearch(String stgVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stgVal), xgetCValueStgVal(), "STG_VAL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STG_VAL: {varchar(255)}
     * @param stgVal The value of stgVal as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStgVal_NotLikeSearch(String stgVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stgVal), xgetCValueStgVal(), "STG_VAL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STG_VAL: {varchar(255)}
     * @param stgVal The value of stgVal as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStgVal_PrefixSearch(String stgVal) {
        setStgVal_LikeSearch(stgVal, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STG_VAL: {varchar(255)}
     */
    public void setStgVal_IsNull() { regStgVal(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STG_VAL: {varchar(255)}
     */
    public void setStgVal_IsNullOrEmpty() { regStgVal(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STG_VAL: {varchar(255)}
     */
    public void setStgVal_IsNotNull() { regStgVal(CK_ISNN, DOBJ); }

    protected void regStgVal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStgVal(), "STG_VAL"); }
    protected abstract ConditionValue xgetCValueStgVal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     * @param detailPriceSale The value of detailPriceSale as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetailPriceSale_Equal(String detailPriceSale) {
        doSetDetailPriceSale_Equal(fRES(detailPriceSale));
    }

    protected void doSetDetailPriceSale_Equal(String detailPriceSale) {
        regDetailPriceSale(CK_EQ, detailPriceSale);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     * @param detailPriceSale The value of detailPriceSale as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetailPriceSale_NotEqual(String detailPriceSale) {
        doSetDetailPriceSale_NotEqual(fRES(detailPriceSale));
    }

    protected void doSetDetailPriceSale_NotEqual(String detailPriceSale) {
        regDetailPriceSale(CK_NES, detailPriceSale);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     * @param detailPriceSale The value of detailPriceSale as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetailPriceSale_GreaterThan(String detailPriceSale) {
        regDetailPriceSale(CK_GT, fRES(detailPriceSale));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     * @param detailPriceSale The value of detailPriceSale as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetailPriceSale_LessThan(String detailPriceSale) {
        regDetailPriceSale(CK_LT, fRES(detailPriceSale));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     * @param detailPriceSale The value of detailPriceSale as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetailPriceSale_GreaterEqual(String detailPriceSale) {
        regDetailPriceSale(CK_GE, fRES(detailPriceSale));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     * @param detailPriceSale The value of detailPriceSale as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetailPriceSale_LessEqual(String detailPriceSale) {
        regDetailPriceSale(CK_LE, fRES(detailPriceSale));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     * @param detailPriceSaleList The collection of detailPriceSale as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetailPriceSale_InScope(Collection<String> detailPriceSaleList) {
        doSetDetailPriceSale_InScope(detailPriceSaleList);
    }

    protected void doSetDetailPriceSale_InScope(Collection<String> detailPriceSaleList) {
        regINS(CK_INS, cTL(detailPriceSaleList), xgetCValueDetailPriceSale(), "DETAIL_PRICE_SALE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     * @param detailPriceSaleList The collection of detailPriceSale as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetailPriceSale_NotInScope(Collection<String> detailPriceSaleList) {
        doSetDetailPriceSale_NotInScope(detailPriceSaleList);
    }

    protected void doSetDetailPriceSale_NotInScope(Collection<String> detailPriceSaleList) {
        regINS(CK_NINS, cTL(detailPriceSaleList), xgetCValueDetailPriceSale(), "DETAIL_PRICE_SALE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DETAIL_PRICE_SALE: {varchar(255)} <br>
     * <pre>e.g. setDetailPriceSale_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param detailPriceSale The value of detailPriceSale as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDetailPriceSale_LikeSearch(String detailPriceSale, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(detailPriceSale), xgetCValueDetailPriceSale(), "DETAIL_PRICE_SALE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     * @param detailPriceSale The value of detailPriceSale as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDetailPriceSale_NotLikeSearch(String detailPriceSale, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(detailPriceSale), xgetCValueDetailPriceSale(), "DETAIL_PRICE_SALE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     * @param detailPriceSale The value of detailPriceSale as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetailPriceSale_PrefixSearch(String detailPriceSale) {
        setDetailPriceSale_LikeSearch(detailPriceSale, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     */
    public void setDetailPriceSale_IsNull() { regDetailPriceSale(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     */
    public void setDetailPriceSale_IsNullOrEmpty() { regDetailPriceSale(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DETAIL_PRICE_SALE: {varchar(255)}
     */
    public void setDetailPriceSale_IsNotNull() { regDetailPriceSale(CK_ISNN, DOBJ); }

    protected void regDetailPriceSale(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDetailPriceSale(), "DETAIL_PRICE_SALE"); }
    protected abstract ConditionValue xgetCValueDetailPriceSale();

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
    public HpSLCFunction<EReturnedReceivePlanCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EReturnedReceivePlanCB.class);
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
    public HpSLCFunction<EReturnedReceivePlanCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EReturnedReceivePlanCB.class);
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
    public HpSLCFunction<EReturnedReceivePlanCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EReturnedReceivePlanCB.class);
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
    public HpSLCFunction<EReturnedReceivePlanCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EReturnedReceivePlanCB.class);
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
    public HpSLCFunction<EReturnedReceivePlanCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EReturnedReceivePlanCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EReturnedReceivePlanCB&gt;() {
     *     public void query(EReturnedReceivePlanCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EReturnedReceivePlanCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EReturnedReceivePlanCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EReturnedReceivePlanCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EReturnedReceivePlanCQ sq);

    protected EReturnedReceivePlanCB xcreateScalarConditionCB() {
        EReturnedReceivePlanCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EReturnedReceivePlanCB xcreateScalarConditionPartitionByCB() {
        EReturnedReceivePlanCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EReturnedReceivePlanCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EReturnedReceivePlanCB cb = new EReturnedReceivePlanCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "RETURNED_RECEIVE_PLAN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EReturnedReceivePlanCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EReturnedReceivePlanCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EReturnedReceivePlanCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EReturnedReceivePlanCB cb = new EReturnedReceivePlanCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "RETURNED_RECEIVE_PLAN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EReturnedReceivePlanCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EReturnedReceivePlanCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EReturnedReceivePlanCB cb = new EReturnedReceivePlanCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EReturnedReceivePlanCQ sq);

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
    protected EReturnedReceivePlanCB newMyCB() {
        return new EReturnedReceivePlanCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EReturnedReceivePlanCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

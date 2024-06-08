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
 * The abstract condition-query of E_SHIPPING_INOUT_PLAN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEShippingInoutPlanCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEShippingInoutPlanCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_SHIPPING_INOUT_PLAN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInoutPlanId The value of shippingInoutPlanId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInoutPlanId_Equal(Long shippingInoutPlanId) {
        doSetShippingInoutPlanId_Equal(shippingInoutPlanId);
    }

    protected void doSetShippingInoutPlanId_Equal(Long shippingInoutPlanId) {
        regShippingInoutPlanId(CK_EQ, shippingInoutPlanId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInoutPlanId The value of shippingInoutPlanId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInoutPlanId_NotEqual(Long shippingInoutPlanId) {
        doSetShippingInoutPlanId_NotEqual(shippingInoutPlanId);
    }

    protected void doSetShippingInoutPlanId_NotEqual(Long shippingInoutPlanId) {
        regShippingInoutPlanId(CK_NES, shippingInoutPlanId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInoutPlanId The value of shippingInoutPlanId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInoutPlanId_GreaterThan(Long shippingInoutPlanId) {
        regShippingInoutPlanId(CK_GT, shippingInoutPlanId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInoutPlanId The value of shippingInoutPlanId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInoutPlanId_LessThan(Long shippingInoutPlanId) {
        regShippingInoutPlanId(CK_LT, shippingInoutPlanId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInoutPlanId The value of shippingInoutPlanId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInoutPlanId_GreaterEqual(Long shippingInoutPlanId) {
        regShippingInoutPlanId(CK_GE, shippingInoutPlanId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInoutPlanId The value of shippingInoutPlanId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInoutPlanId_LessEqual(Long shippingInoutPlanId) {
        regShippingInoutPlanId(CK_LE, shippingInoutPlanId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of shippingInoutPlanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInoutPlanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInoutPlanId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInoutPlanId(), "SHIPPING_INOUT_PLAN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInoutPlanIdList The collection of shippingInoutPlanId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInoutPlanId_InScope(Collection<Long> shippingInoutPlanIdList) {
        doSetShippingInoutPlanId_InScope(shippingInoutPlanIdList);
    }

    protected void doSetShippingInoutPlanId_InScope(Collection<Long> shippingInoutPlanIdList) {
        regINS(CK_INS, cTL(shippingInoutPlanIdList), xgetCValueShippingInoutPlanId(), "SHIPPING_INOUT_PLAN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInoutPlanIdList The collection of shippingInoutPlanId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInoutPlanId_NotInScope(Collection<Long> shippingInoutPlanIdList) {
        doSetShippingInoutPlanId_NotInScope(shippingInoutPlanIdList);
    }

    protected void doSetShippingInoutPlanId_NotInScope(Collection<Long> shippingInoutPlanIdList) {
        regINS(CK_NINS, cTL(shippingInoutPlanIdList), xgetCValueShippingInoutPlanId(), "SHIPPING_INOUT_PLAN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShippingInoutPlanId_IsNull() { regShippingInoutPlanId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShippingInoutPlanId_IsNotNull() { regShippingInoutPlanId(CK_ISNN, DOBJ); }

    protected void regShippingInoutPlanId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInoutPlanId(), "SHIPPING_INOUT_PLAN_ID"); }
    protected abstract ConditionValue xgetCValueShippingInoutPlanId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_Equal(String sendCd) {
        doSetSendCd_Equal(fRES(sendCd));
    }

    protected void doSetSendCd_Equal(String sendCd) {
        regSendCd(CK_EQ, sendCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_NotEqual(String sendCd) {
        doSetSendCd_NotEqual(fRES(sendCd));
    }

    protected void doSetSendCd_NotEqual(String sendCd) {
        regSendCd(CK_NES, sendCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_GreaterThan(String sendCd) {
        regSendCd(CK_GT, fRES(sendCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_LessThan(String sendCd) {
        regSendCd(CK_LT, fRES(sendCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_GreaterEqual(String sendCd) {
        regSendCd(CK_GE, fRES(sendCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_LessEqual(String sendCd) {
        regSendCd(CK_LE, fRES(sendCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCdList The collection of sendCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_InScope(Collection<String> sendCdList) {
        doSetSendCd_InScope(sendCdList);
    }

    protected void doSetSendCd_InScope(Collection<String> sendCdList) {
        regINS(CK_INS, cTL(sendCdList), xgetCValueSendCd(), "SEND_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCdList The collection of sendCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_NotInScope(Collection<String> sendCdList) {
        doSetSendCd_NotInScope(sendCdList);
    }

    protected void doSetSendCd_NotInScope(Collection<String> sendCdList) {
        regINS(CK_NINS, cTL(sendCdList), xgetCValueSendCd(), "SEND_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSendCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sendCd The value of sendCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSendCd_LikeSearch(String sendCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sendCd), xgetCValueSendCd(), "SEND_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSendCd_NotLikeSearch(String sendCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sendCd), xgetCValueSendCd(), "SEND_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_PrefixSearch(String sendCd) {
        setSendCd_LikeSearch(sendCd, xcLSOPPre());
    }

    protected void regSendCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendCd(), "SEND_CD"); }
    protected abstract ConditionValue xgetCValueSendCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_LOW_CD: {NotNull, bigint(19)}
     * @param sendLowCd The value of sendLowCd as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendLowCd_Equal(Long sendLowCd) {
        doSetSendLowCd_Equal(sendLowCd);
    }

    protected void doSetSendLowCd_Equal(Long sendLowCd) {
        regSendLowCd(CK_EQ, sendLowCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_LOW_CD: {NotNull, bigint(19)}
     * @param sendLowCd The value of sendLowCd as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendLowCd_NotEqual(Long sendLowCd) {
        doSetSendLowCd_NotEqual(sendLowCd);
    }

    protected void doSetSendLowCd_NotEqual(Long sendLowCd) {
        regSendLowCd(CK_NES, sendLowCd);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_LOW_CD: {NotNull, bigint(19)}
     * @param sendLowCd The value of sendLowCd as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendLowCd_GreaterThan(Long sendLowCd) {
        regSendLowCd(CK_GT, sendLowCd);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_LOW_CD: {NotNull, bigint(19)}
     * @param sendLowCd The value of sendLowCd as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendLowCd_LessThan(Long sendLowCd) {
        regSendLowCd(CK_LT, sendLowCd);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_LOW_CD: {NotNull, bigint(19)}
     * @param sendLowCd The value of sendLowCd as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendLowCd_GreaterEqual(Long sendLowCd) {
        regSendLowCd(CK_GE, sendLowCd);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_LOW_CD: {NotNull, bigint(19)}
     * @param sendLowCd The value of sendLowCd as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendLowCd_LessEqual(Long sendLowCd) {
        regSendLowCd(CK_LE, sendLowCd);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_LOW_CD: {NotNull, bigint(19)}
     * @param minNumber The min number of sendLowCd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sendLowCd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSendLowCd_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSendLowCd(), "SEND_LOW_CD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEND_LOW_CD: {NotNull, bigint(19)}
     * @param sendLowCdList The collection of sendLowCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendLowCd_InScope(Collection<Long> sendLowCdList) {
        doSetSendLowCd_InScope(sendLowCdList);
    }

    protected void doSetSendLowCd_InScope(Collection<Long> sendLowCdList) {
        regINS(CK_INS, cTL(sendLowCdList), xgetCValueSendLowCd(), "SEND_LOW_CD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEND_LOW_CD: {NotNull, bigint(19)}
     * @param sendLowCdList The collection of sendLowCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendLowCd_NotInScope(Collection<Long> sendLowCdList) {
        doSetSendLowCd_NotInScope(sendLowCdList);
    }

    protected void doSetSendLowCd_NotInScope(Collection<Long> sendLowCdList) {
        regINS(CK_NINS, cTL(sendLowCdList), xgetCValueSendLowCd(), "SEND_LOW_CD");
    }

    protected void regSendLowCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendLowCd(), "SEND_LOW_CD"); }
    protected abstract ConditionValue xgetCValueSendLowCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, varchar(8)}
     * @param workFlg The value of workFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_Equal(String workFlg) {
        doSetWorkFlg_Equal(fRES(workFlg));
    }

    protected void doSetWorkFlg_Equal(String workFlg) {
        regWorkFlg(CK_EQ, workFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, varchar(8)}
     * @param workFlg The value of workFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_NotEqual(String workFlg) {
        doSetWorkFlg_NotEqual(fRES(workFlg));
    }

    protected void doSetWorkFlg_NotEqual(String workFlg) {
        regWorkFlg(CK_NES, workFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, varchar(8)}
     * @param workFlg The value of workFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterThan(String workFlg) {
        regWorkFlg(CK_GT, fRES(workFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, varchar(8)}
     * @param workFlg The value of workFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessThan(String workFlg) {
        regWorkFlg(CK_LT, fRES(workFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, varchar(8)}
     * @param workFlg The value of workFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterEqual(String workFlg) {
        regWorkFlg(CK_GE, fRES(workFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, varchar(8)}
     * @param workFlg The value of workFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessEqual(String workFlg) {
        regWorkFlg(CK_LE, fRES(workFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, varchar(8)}
     * @param workFlgList The collection of workFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_InScope(Collection<String> workFlgList) {
        doSetWorkFlg_InScope(workFlgList);
    }

    protected void doSetWorkFlg_InScope(Collection<String> workFlgList) {
        regINS(CK_INS, cTL(workFlgList), xgetCValueWorkFlg(), "WORK_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, varchar(8)}
     * @param workFlgList The collection of workFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_NotInScope(Collection<String> workFlgList) {
        doSetWorkFlg_NotInScope(workFlgList);
    }

    protected void doSetWorkFlg_NotInScope(Collection<String> workFlgList) {
        regINS(CK_NINS, cTL(workFlgList), xgetCValueWorkFlg(), "WORK_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, varchar(8)} <br>
     * <pre>e.g. setWorkFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workFlg The value of workFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkFlg_LikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, varchar(8)}
     * @param workFlg The value of workFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkFlg_NotLikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, varchar(8)}
     * @param workFlg The value of workFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_PrefixSearch(String workFlg) {
        setWorkFlg_LikeSearch(workFlg, xcLSOPPre());
    }

    protected void regWorkFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkFlg(), "WORK_FLG"); }
    protected abstract ConditionValue xgetCValueWorkFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
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
     * CENTER_CD: {varchar(30)}
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
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(30)}
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
     * CENTER_CD: {varchar(30)}
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
     * CENTER_CD: {varchar(30)} <br>
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
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     */
    public void setCenterCd_IsNull() { regCenterCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     */
    public void setCenterCd_IsNullOrEmpty() { regCenterCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     */
    public void setCenterCd_IsNotNull() { regCenterCd(CK_ISNN, DOBJ); }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_Equal(String sbwarehousecd) {
        doSetSbwarehousecd_Equal(fRES(sbwarehousecd));
    }

    protected void doSetSbwarehousecd_Equal(String sbwarehousecd) {
        regSbwarehousecd(CK_EQ, sbwarehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_NotEqual(String sbwarehousecd) {
        doSetSbwarehousecd_NotEqual(fRES(sbwarehousecd));
    }

    protected void doSetSbwarehousecd_NotEqual(String sbwarehousecd) {
        regSbwarehousecd(CK_NES, sbwarehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_GreaterThan(String sbwarehousecd) {
        regSbwarehousecd(CK_GT, fRES(sbwarehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_LessThan(String sbwarehousecd) {
        regSbwarehousecd(CK_LT, fRES(sbwarehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_GreaterEqual(String sbwarehousecd) {
        regSbwarehousecd(CK_GE, fRES(sbwarehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_LessEqual(String sbwarehousecd) {
        regSbwarehousecd(CK_LE, fRES(sbwarehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecdList The collection of sbwarehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_InScope(Collection<String> sbwarehousecdList) {
        doSetSbwarehousecd_InScope(sbwarehousecdList);
    }

    protected void doSetSbwarehousecd_InScope(Collection<String> sbwarehousecdList) {
        regINS(CK_INS, cTL(sbwarehousecdList), xgetCValueSbwarehousecd(), "SBWAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecdList The collection of sbwarehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_NotInScope(Collection<String> sbwarehousecdList) {
        doSetSbwarehousecd_NotInScope(sbwarehousecdList);
    }

    protected void doSetSbwarehousecd_NotInScope(Collection<String> sbwarehousecdList) {
        regINS(CK_NINS, cTL(sbwarehousecdList), xgetCValueSbwarehousecd(), "SBWAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)} <br>
     * <pre>e.g. setSbwarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sbwarehousecd The value of sbwarehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSbwarehousecd_LikeSearch(String sbwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sbwarehousecd), xgetCValueSbwarehousecd(), "SBWAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSbwarehousecd_NotLikeSearch(String sbwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sbwarehousecd), xgetCValueSbwarehousecd(), "SBWAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @param sbwarehousecd The value of sbwarehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSbwarehousecd_PrefixSearch(String sbwarehousecd) {
        setSbwarehousecd_LikeSearch(sbwarehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     */
    public void setSbwarehousecd_IsNull() { regSbwarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     */
    public void setSbwarehousecd_IsNullOrEmpty() { regSbwarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SBWAREHOUSECD: {varchar(255)}
     */
    public void setSbwarehousecd_IsNotNull() { regSbwarehousecd(CK_ISNN, DOBJ); }

    protected void regSbwarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSbwarehousecd(), "SBWAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueSbwarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_Equal(String supplierrcvno) {
        doSetSupplierrcvno_Equal(fRES(supplierrcvno));
    }

    protected void doSetSupplierrcvno_Equal(String supplierrcvno) {
        regSupplierrcvno(CK_EQ, supplierrcvno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_NotEqual(String supplierrcvno) {
        doSetSupplierrcvno_NotEqual(fRES(supplierrcvno));
    }

    protected void doSetSupplierrcvno_NotEqual(String supplierrcvno) {
        regSupplierrcvno(CK_NES, supplierrcvno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_GreaterThan(String supplierrcvno) {
        regSupplierrcvno(CK_GT, fRES(supplierrcvno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_LessThan(String supplierrcvno) {
        regSupplierrcvno(CK_LT, fRES(supplierrcvno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_GreaterEqual(String supplierrcvno) {
        regSupplierrcvno(CK_GE, fRES(supplierrcvno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_LessEqual(String supplierrcvno) {
        regSupplierrcvno(CK_LE, fRES(supplierrcvno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvnoList The collection of supplierrcvno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_InScope(Collection<String> supplierrcvnoList) {
        doSetSupplierrcvno_InScope(supplierrcvnoList);
    }

    protected void doSetSupplierrcvno_InScope(Collection<String> supplierrcvnoList) {
        regINS(CK_INS, cTL(supplierrcvnoList), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvnoList The collection of supplierrcvno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_NotInScope(Collection<String> supplierrcvnoList) {
        doSetSupplierrcvno_NotInScope(supplierrcvnoList);
    }

    protected void doSetSupplierrcvno_NotInScope(Collection<String> supplierrcvnoList) {
        regINS(CK_NINS, cTL(supplierrcvnoList), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)} <br>
     * <pre>e.g. setSupplierrcvno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplierrcvno The value of supplierrcvno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplierrcvno_LikeSearch(String supplierrcvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplierrcvno), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplierrcvno_NotLikeSearch(String supplierrcvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplierrcvno), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     * @param supplierrcvno The value of supplierrcvno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_PrefixSearch(String supplierrcvno) {
        setSupplierrcvno_LikeSearch(supplierrcvno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     */
    public void setSupplierrcvno_IsNull() { regSupplierrcvno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     */
    public void setSupplierrcvno_IsNullOrEmpty() { regSupplierrcvno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(255)}
     */
    public void setSupplierrcvno_IsNotNull() { regSupplierrcvno(CK_ISNN, DOBJ); }

    protected void regSupplierrcvno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplierrcvno(), "SUPPLIERRCVNO"); }
    protected abstract ConditionValue xgetCValueSupplierrcvno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMKBN: {varchar(255)}
     * @param examkbn The value of examkbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamkbn_Equal(String examkbn) {
        doSetExamkbn_Equal(fRES(examkbn));
    }

    protected void doSetExamkbn_Equal(String examkbn) {
        regExamkbn(CK_EQ, examkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMKBN: {varchar(255)}
     * @param examkbn The value of examkbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamkbn_NotEqual(String examkbn) {
        doSetExamkbn_NotEqual(fRES(examkbn));
    }

    protected void doSetExamkbn_NotEqual(String examkbn) {
        regExamkbn(CK_NES, examkbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMKBN: {varchar(255)}
     * @param examkbn The value of examkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamkbn_GreaterThan(String examkbn) {
        regExamkbn(CK_GT, fRES(examkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMKBN: {varchar(255)}
     * @param examkbn The value of examkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamkbn_LessThan(String examkbn) {
        regExamkbn(CK_LT, fRES(examkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMKBN: {varchar(255)}
     * @param examkbn The value of examkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamkbn_GreaterEqual(String examkbn) {
        regExamkbn(CK_GE, fRES(examkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMKBN: {varchar(255)}
     * @param examkbn The value of examkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamkbn_LessEqual(String examkbn) {
        regExamkbn(CK_LE, fRES(examkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAMKBN: {varchar(255)}
     * @param examkbnList The collection of examkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamkbn_InScope(Collection<String> examkbnList) {
        doSetExamkbn_InScope(examkbnList);
    }

    protected void doSetExamkbn_InScope(Collection<String> examkbnList) {
        regINS(CK_INS, cTL(examkbnList), xgetCValueExamkbn(), "EXAMKBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAMKBN: {varchar(255)}
     * @param examkbnList The collection of examkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamkbn_NotInScope(Collection<String> examkbnList) {
        doSetExamkbn_NotInScope(examkbnList);
    }

    protected void doSetExamkbn_NotInScope(Collection<String> examkbnList) {
        regINS(CK_NINS, cTL(examkbnList), xgetCValueExamkbn(), "EXAMKBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMKBN: {varchar(255)} <br>
     * <pre>e.g. setExamkbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param examkbn The value of examkbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExamkbn_LikeSearch(String examkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(examkbn), xgetCValueExamkbn(), "EXAMKBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMKBN: {varchar(255)}
     * @param examkbn The value of examkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExamkbn_NotLikeSearch(String examkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(examkbn), xgetCValueExamkbn(), "EXAMKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMKBN: {varchar(255)}
     * @param examkbn The value of examkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamkbn_PrefixSearch(String examkbn) {
        setExamkbn_LikeSearch(examkbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXAMKBN: {varchar(255)}
     */
    public void setExamkbn_IsNull() { regExamkbn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXAMKBN: {varchar(255)}
     */
    public void setExamkbn_IsNullOrEmpty() { regExamkbn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXAMKBN: {varchar(255)}
     */
    public void setExamkbn_IsNotNull() { regExamkbn(CK_ISNN, DOBJ); }

    protected void regExamkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExamkbn(), "EXAMKBN"); }
    protected abstract ConditionValue xgetCValueExamkbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(255)}
     * @param examdate The value of examdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_Equal(String examdate) {
        doSetExamdate_Equal(fRES(examdate));
    }

    protected void doSetExamdate_Equal(String examdate) {
        regExamdate(CK_EQ, examdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(255)}
     * @param examdate The value of examdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_NotEqual(String examdate) {
        doSetExamdate_NotEqual(fRES(examdate));
    }

    protected void doSetExamdate_NotEqual(String examdate) {
        regExamdate(CK_NES, examdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(255)}
     * @param examdate The value of examdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_GreaterThan(String examdate) {
        regExamdate(CK_GT, fRES(examdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(255)}
     * @param examdate The value of examdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_LessThan(String examdate) {
        regExamdate(CK_LT, fRES(examdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(255)}
     * @param examdate The value of examdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_GreaterEqual(String examdate) {
        regExamdate(CK_GE, fRES(examdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(255)}
     * @param examdate The value of examdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_LessEqual(String examdate) {
        regExamdate(CK_LE, fRES(examdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAMDATE: {varchar(255)}
     * @param examdateList The collection of examdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_InScope(Collection<String> examdateList) {
        doSetExamdate_InScope(examdateList);
    }

    protected void doSetExamdate_InScope(Collection<String> examdateList) {
        regINS(CK_INS, cTL(examdateList), xgetCValueExamdate(), "EXAMDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAMDATE: {varchar(255)}
     * @param examdateList The collection of examdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_NotInScope(Collection<String> examdateList) {
        doSetExamdate_NotInScope(examdateList);
    }

    protected void doSetExamdate_NotInScope(Collection<String> examdateList) {
        regINS(CK_NINS, cTL(examdateList), xgetCValueExamdate(), "EXAMDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMDATE: {varchar(255)} <br>
     * <pre>e.g. setExamdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param examdate The value of examdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExamdate_LikeSearch(String examdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(examdate), xgetCValueExamdate(), "EXAMDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMDATE: {varchar(255)}
     * @param examdate The value of examdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExamdate_NotLikeSearch(String examdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(examdate), xgetCValueExamdate(), "EXAMDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMDATE: {varchar(255)}
     * @param examdate The value of examdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamdate_PrefixSearch(String examdate) {
        setExamdate_LikeSearch(examdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(255)}
     */
    public void setExamdate_IsNull() { regExamdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(255)}
     */
    public void setExamdate_IsNullOrEmpty() { regExamdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXAMDATE: {varchar(255)}
     */
    public void setExamdate_IsNotNull() { regExamdate(CK_ISNN, DOBJ); }

    protected void regExamdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExamdate(), "EXAMDATE"); }
    protected abstract ConditionValue xgetCValueExamdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMEND: {varchar(255)}
     * @param examend The value of examend as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamend_Equal(String examend) {
        doSetExamend_Equal(fRES(examend));
    }

    protected void doSetExamend_Equal(String examend) {
        regExamend(CK_EQ, examend);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMEND: {varchar(255)}
     * @param examend The value of examend as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamend_NotEqual(String examend) {
        doSetExamend_NotEqual(fRES(examend));
    }

    protected void doSetExamend_NotEqual(String examend) {
        regExamend(CK_NES, examend);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMEND: {varchar(255)}
     * @param examend The value of examend as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamend_GreaterThan(String examend) {
        regExamend(CK_GT, fRES(examend));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMEND: {varchar(255)}
     * @param examend The value of examend as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamend_LessThan(String examend) {
        regExamend(CK_LT, fRES(examend));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMEND: {varchar(255)}
     * @param examend The value of examend as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamend_GreaterEqual(String examend) {
        regExamend(CK_GE, fRES(examend));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMEND: {varchar(255)}
     * @param examend The value of examend as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamend_LessEqual(String examend) {
        regExamend(CK_LE, fRES(examend));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAMEND: {varchar(255)}
     * @param examendList The collection of examend as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamend_InScope(Collection<String> examendList) {
        doSetExamend_InScope(examendList);
    }

    protected void doSetExamend_InScope(Collection<String> examendList) {
        regINS(CK_INS, cTL(examendList), xgetCValueExamend(), "EXAMEND");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAMEND: {varchar(255)}
     * @param examendList The collection of examend as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamend_NotInScope(Collection<String> examendList) {
        doSetExamend_NotInScope(examendList);
    }

    protected void doSetExamend_NotInScope(Collection<String> examendList) {
        regINS(CK_NINS, cTL(examendList), xgetCValueExamend(), "EXAMEND");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMEND: {varchar(255)} <br>
     * <pre>e.g. setExamend_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param examend The value of examend as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExamend_LikeSearch(String examend, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(examend), xgetCValueExamend(), "EXAMEND", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMEND: {varchar(255)}
     * @param examend The value of examend as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExamend_NotLikeSearch(String examend, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(examend), xgetCValueExamend(), "EXAMEND", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMEND: {varchar(255)}
     * @param examend The value of examend as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamend_PrefixSearch(String examend) {
        setExamend_LikeSearch(examend, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXAMEND: {varchar(255)}
     */
    public void setExamend_IsNull() { regExamend(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXAMEND: {varchar(255)}
     */
    public void setExamend_IsNullOrEmpty() { regExamend(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXAMEND: {varchar(255)}
     */
    public void setExamend_IsNotNull() { regExamend(CK_ISNN, DOBJ); }

    protected void regExamend(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExamend(), "EXAMEND"); }
    protected abstract ConditionValue xgetCValueExamend();

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
     * LOT1: {varchar(255)}
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
     * LOT1: {varchar(255)}
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
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterThan(String lot1) {
        regLot1(CK_GT, fRES(lot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessThan(String lot1) {
        regLot1(CK_LT, fRES(lot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterEqual(String lot1) {
        regLot1(CK_GE, fRES(lot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessEqual(String lot1) {
        regLot1(CK_LE, fRES(lot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(255)}
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
     * LOT1: {varchar(255)}
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
     * LOT1: {varchar(255)} <br>
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
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot1_NotLikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(255)}
     * @param lot1 The value of lot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_PrefixSearch(String lot1) {
        setLot1_LikeSearch(lot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     */
    public void setLot1_IsNull() { regLot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     */
    public void setLot1_IsNullOrEmpty() { regLot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(255)}
     */
    public void setLot1_IsNotNull() { regLot1(CK_ISNN, DOBJ); }

    protected void regLot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot1(), "LOT1"); }
    protected abstract ConditionValue xgetCValueLot1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFZAIKOINV: {varchar(255)}
     * @param befzaikoinv The value of befzaikoinv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBefzaikoinv_Equal(String befzaikoinv) {
        doSetBefzaikoinv_Equal(fRES(befzaikoinv));
    }

    protected void doSetBefzaikoinv_Equal(String befzaikoinv) {
        regBefzaikoinv(CK_EQ, befzaikoinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFZAIKOINV: {varchar(255)}
     * @param befzaikoinv The value of befzaikoinv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBefzaikoinv_NotEqual(String befzaikoinv) {
        doSetBefzaikoinv_NotEqual(fRES(befzaikoinv));
    }

    protected void doSetBefzaikoinv_NotEqual(String befzaikoinv) {
        regBefzaikoinv(CK_NES, befzaikoinv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFZAIKOINV: {varchar(255)}
     * @param befzaikoinv The value of befzaikoinv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBefzaikoinv_GreaterThan(String befzaikoinv) {
        regBefzaikoinv(CK_GT, fRES(befzaikoinv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFZAIKOINV: {varchar(255)}
     * @param befzaikoinv The value of befzaikoinv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBefzaikoinv_LessThan(String befzaikoinv) {
        regBefzaikoinv(CK_LT, fRES(befzaikoinv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFZAIKOINV: {varchar(255)}
     * @param befzaikoinv The value of befzaikoinv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBefzaikoinv_GreaterEqual(String befzaikoinv) {
        regBefzaikoinv(CK_GE, fRES(befzaikoinv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFZAIKOINV: {varchar(255)}
     * @param befzaikoinv The value of befzaikoinv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBefzaikoinv_LessEqual(String befzaikoinv) {
        regBefzaikoinv(CK_LE, fRES(befzaikoinv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BEFZAIKOINV: {varchar(255)}
     * @param befzaikoinvList The collection of befzaikoinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBefzaikoinv_InScope(Collection<String> befzaikoinvList) {
        doSetBefzaikoinv_InScope(befzaikoinvList);
    }

    protected void doSetBefzaikoinv_InScope(Collection<String> befzaikoinvList) {
        regINS(CK_INS, cTL(befzaikoinvList), xgetCValueBefzaikoinv(), "BEFZAIKOINV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BEFZAIKOINV: {varchar(255)}
     * @param befzaikoinvList The collection of befzaikoinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBefzaikoinv_NotInScope(Collection<String> befzaikoinvList) {
        doSetBefzaikoinv_NotInScope(befzaikoinvList);
    }

    protected void doSetBefzaikoinv_NotInScope(Collection<String> befzaikoinvList) {
        regINS(CK_NINS, cTL(befzaikoinvList), xgetCValueBefzaikoinv(), "BEFZAIKOINV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BEFZAIKOINV: {varchar(255)} <br>
     * <pre>e.g. setBefzaikoinv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param befzaikoinv The value of befzaikoinv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBefzaikoinv_LikeSearch(String befzaikoinv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(befzaikoinv), xgetCValueBefzaikoinv(), "BEFZAIKOINV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BEFZAIKOINV: {varchar(255)}
     * @param befzaikoinv The value of befzaikoinv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBefzaikoinv_NotLikeSearch(String befzaikoinv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(befzaikoinv), xgetCValueBefzaikoinv(), "BEFZAIKOINV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BEFZAIKOINV: {varchar(255)}
     * @param befzaikoinv The value of befzaikoinv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBefzaikoinv_PrefixSearch(String befzaikoinv) {
        setBefzaikoinv_LikeSearch(befzaikoinv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BEFZAIKOINV: {varchar(255)}
     */
    public void setBefzaikoinv_IsNull() { regBefzaikoinv(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BEFZAIKOINV: {varchar(255)}
     */
    public void setBefzaikoinv_IsNullOrEmpty() { regBefzaikoinv(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BEFZAIKOINV: {varchar(255)}
     */
    public void setBefzaikoinv_IsNotNull() { regBefzaikoinv(CK_ISNN, DOBJ); }

    protected void regBefzaikoinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBefzaikoinv(), "BEFZAIKOINV"); }
    protected abstract ConditionValue xgetCValueBefzaikoinv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFLOT4: {varchar(255)}
     * @param beflot4 The value of beflot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot4_Equal(String beflot4) {
        doSetBeflot4_Equal(fRES(beflot4));
    }

    protected void doSetBeflot4_Equal(String beflot4) {
        regBeflot4(CK_EQ, beflot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFLOT4: {varchar(255)}
     * @param beflot4 The value of beflot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot4_NotEqual(String beflot4) {
        doSetBeflot4_NotEqual(fRES(beflot4));
    }

    protected void doSetBeflot4_NotEqual(String beflot4) {
        regBeflot4(CK_NES, beflot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFLOT4: {varchar(255)}
     * @param beflot4 The value of beflot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot4_GreaterThan(String beflot4) {
        regBeflot4(CK_GT, fRES(beflot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFLOT4: {varchar(255)}
     * @param beflot4 The value of beflot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot4_LessThan(String beflot4) {
        regBeflot4(CK_LT, fRES(beflot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFLOT4: {varchar(255)}
     * @param beflot4 The value of beflot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot4_GreaterEqual(String beflot4) {
        regBeflot4(CK_GE, fRES(beflot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFLOT4: {varchar(255)}
     * @param beflot4 The value of beflot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot4_LessEqual(String beflot4) {
        regBeflot4(CK_LE, fRES(beflot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BEFLOT4: {varchar(255)}
     * @param beflot4List The collection of beflot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot4_InScope(Collection<String> beflot4List) {
        doSetBeflot4_InScope(beflot4List);
    }

    protected void doSetBeflot4_InScope(Collection<String> beflot4List) {
        regINS(CK_INS, cTL(beflot4List), xgetCValueBeflot4(), "BEFLOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BEFLOT4: {varchar(255)}
     * @param beflot4List The collection of beflot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot4_NotInScope(Collection<String> beflot4List) {
        doSetBeflot4_NotInScope(beflot4List);
    }

    protected void doSetBeflot4_NotInScope(Collection<String> beflot4List) {
        regINS(CK_NINS, cTL(beflot4List), xgetCValueBeflot4(), "BEFLOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BEFLOT4: {varchar(255)} <br>
     * <pre>e.g. setBeflot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param beflot4 The value of beflot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBeflot4_LikeSearch(String beflot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(beflot4), xgetCValueBeflot4(), "BEFLOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BEFLOT4: {varchar(255)}
     * @param beflot4 The value of beflot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBeflot4_NotLikeSearch(String beflot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(beflot4), xgetCValueBeflot4(), "BEFLOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BEFLOT4: {varchar(255)}
     * @param beflot4 The value of beflot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot4_PrefixSearch(String beflot4) {
        setBeflot4_LikeSearch(beflot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BEFLOT4: {varchar(255)}
     */
    public void setBeflot4_IsNull() { regBeflot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BEFLOT4: {varchar(255)}
     */
    public void setBeflot4_IsNullOrEmpty() { regBeflot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BEFLOT4: {varchar(255)}
     */
    public void setBeflot4_IsNotNull() { regBeflot4(CK_ISNN, DOBJ); }

    protected void regBeflot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBeflot4(), "BEFLOT4"); }
    protected abstract ConditionValue xgetCValueBeflot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFLOT3: {varchar(255)}
     * @param beflot3 The value of beflot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot3_Equal(String beflot3) {
        doSetBeflot3_Equal(fRES(beflot3));
    }

    protected void doSetBeflot3_Equal(String beflot3) {
        regBeflot3(CK_EQ, beflot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFLOT3: {varchar(255)}
     * @param beflot3 The value of beflot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot3_NotEqual(String beflot3) {
        doSetBeflot3_NotEqual(fRES(beflot3));
    }

    protected void doSetBeflot3_NotEqual(String beflot3) {
        regBeflot3(CK_NES, beflot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFLOT3: {varchar(255)}
     * @param beflot3 The value of beflot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot3_GreaterThan(String beflot3) {
        regBeflot3(CK_GT, fRES(beflot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFLOT3: {varchar(255)}
     * @param beflot3 The value of beflot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot3_LessThan(String beflot3) {
        regBeflot3(CK_LT, fRES(beflot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFLOT3: {varchar(255)}
     * @param beflot3 The value of beflot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot3_GreaterEqual(String beflot3) {
        regBeflot3(CK_GE, fRES(beflot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BEFLOT3: {varchar(255)}
     * @param beflot3 The value of beflot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot3_LessEqual(String beflot3) {
        regBeflot3(CK_LE, fRES(beflot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BEFLOT3: {varchar(255)}
     * @param beflot3List The collection of beflot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot3_InScope(Collection<String> beflot3List) {
        doSetBeflot3_InScope(beflot3List);
    }

    protected void doSetBeflot3_InScope(Collection<String> beflot3List) {
        regINS(CK_INS, cTL(beflot3List), xgetCValueBeflot3(), "BEFLOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BEFLOT3: {varchar(255)}
     * @param beflot3List The collection of beflot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot3_NotInScope(Collection<String> beflot3List) {
        doSetBeflot3_NotInScope(beflot3List);
    }

    protected void doSetBeflot3_NotInScope(Collection<String> beflot3List) {
        regINS(CK_NINS, cTL(beflot3List), xgetCValueBeflot3(), "BEFLOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BEFLOT3: {varchar(255)} <br>
     * <pre>e.g. setBeflot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param beflot3 The value of beflot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBeflot3_LikeSearch(String beflot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(beflot3), xgetCValueBeflot3(), "BEFLOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BEFLOT3: {varchar(255)}
     * @param beflot3 The value of beflot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBeflot3_NotLikeSearch(String beflot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(beflot3), xgetCValueBeflot3(), "BEFLOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BEFLOT3: {varchar(255)}
     * @param beflot3 The value of beflot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBeflot3_PrefixSearch(String beflot3) {
        setBeflot3_LikeSearch(beflot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BEFLOT3: {varchar(255)}
     */
    public void setBeflot3_IsNull() { regBeflot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BEFLOT3: {varchar(255)}
     */
    public void setBeflot3_IsNullOrEmpty() { regBeflot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BEFLOT3: {varchar(255)}
     */
    public void setBeflot3_IsNotNull() { regBeflot3(CK_ISNN, DOBJ); }

    protected void regBeflot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBeflot3(), "BEFLOT3"); }
    protected abstract ConditionValue xgetCValueBeflot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {varchar(255)}
     * @param aftzaikoinv The value of aftzaikoinv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_Equal(String aftzaikoinv) {
        doSetAftzaikoinv_Equal(fRES(aftzaikoinv));
    }

    protected void doSetAftzaikoinv_Equal(String aftzaikoinv) {
        regAftzaikoinv(CK_EQ, aftzaikoinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {varchar(255)}
     * @param aftzaikoinv The value of aftzaikoinv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_NotEqual(String aftzaikoinv) {
        doSetAftzaikoinv_NotEqual(fRES(aftzaikoinv));
    }

    protected void doSetAftzaikoinv_NotEqual(String aftzaikoinv) {
        regAftzaikoinv(CK_NES, aftzaikoinv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {varchar(255)}
     * @param aftzaikoinv The value of aftzaikoinv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_GreaterThan(String aftzaikoinv) {
        regAftzaikoinv(CK_GT, fRES(aftzaikoinv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {varchar(255)}
     * @param aftzaikoinv The value of aftzaikoinv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_LessThan(String aftzaikoinv) {
        regAftzaikoinv(CK_LT, fRES(aftzaikoinv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {varchar(255)}
     * @param aftzaikoinv The value of aftzaikoinv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_GreaterEqual(String aftzaikoinv) {
        regAftzaikoinv(CK_GE, fRES(aftzaikoinv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {varchar(255)}
     * @param aftzaikoinv The value of aftzaikoinv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_LessEqual(String aftzaikoinv) {
        regAftzaikoinv(CK_LE, fRES(aftzaikoinv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTZAIKOINV: {varchar(255)}
     * @param aftzaikoinvList The collection of aftzaikoinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_InScope(Collection<String> aftzaikoinvList) {
        doSetAftzaikoinv_InScope(aftzaikoinvList);
    }

    protected void doSetAftzaikoinv_InScope(Collection<String> aftzaikoinvList) {
        regINS(CK_INS, cTL(aftzaikoinvList), xgetCValueAftzaikoinv(), "AFTZAIKOINV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTZAIKOINV: {varchar(255)}
     * @param aftzaikoinvList The collection of aftzaikoinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_NotInScope(Collection<String> aftzaikoinvList) {
        doSetAftzaikoinv_NotInScope(aftzaikoinvList);
    }

    protected void doSetAftzaikoinv_NotInScope(Collection<String> aftzaikoinvList) {
        regINS(CK_NINS, cTL(aftzaikoinvList), xgetCValueAftzaikoinv(), "AFTZAIKOINV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AFTZAIKOINV: {varchar(255)} <br>
     * <pre>e.g. setAftzaikoinv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param aftzaikoinv The value of aftzaikoinv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAftzaikoinv_LikeSearch(String aftzaikoinv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(aftzaikoinv), xgetCValueAftzaikoinv(), "AFTZAIKOINV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AFTZAIKOINV: {varchar(255)}
     * @param aftzaikoinv The value of aftzaikoinv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAftzaikoinv_NotLikeSearch(String aftzaikoinv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(aftzaikoinv), xgetCValueAftzaikoinv(), "AFTZAIKOINV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AFTZAIKOINV: {varchar(255)}
     * @param aftzaikoinv The value of aftzaikoinv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftzaikoinv_PrefixSearch(String aftzaikoinv) {
        setAftzaikoinv_LikeSearch(aftzaikoinv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {varchar(255)}
     */
    public void setAftzaikoinv_IsNull() { regAftzaikoinv(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {varchar(255)}
     */
    public void setAftzaikoinv_IsNullOrEmpty() { regAftzaikoinv(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AFTZAIKOINV: {varchar(255)}
     */
    public void setAftzaikoinv_IsNotNull() { regAftzaikoinv(CK_ISNN, DOBJ); }

    protected void regAftzaikoinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAftzaikoinv(), "AFTZAIKOINV"); }
    protected abstract ConditionValue xgetCValueAftzaikoinv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTLOT4: {varchar(255)}
     * @param aftlot4 The value of aftlot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot4_Equal(String aftlot4) {
        doSetAftlot4_Equal(fRES(aftlot4));
    }

    protected void doSetAftlot4_Equal(String aftlot4) {
        regAftlot4(CK_EQ, aftlot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTLOT4: {varchar(255)}
     * @param aftlot4 The value of aftlot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot4_NotEqual(String aftlot4) {
        doSetAftlot4_NotEqual(fRES(aftlot4));
    }

    protected void doSetAftlot4_NotEqual(String aftlot4) {
        regAftlot4(CK_NES, aftlot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTLOT4: {varchar(255)}
     * @param aftlot4 The value of aftlot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot4_GreaterThan(String aftlot4) {
        regAftlot4(CK_GT, fRES(aftlot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTLOT4: {varchar(255)}
     * @param aftlot4 The value of aftlot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot4_LessThan(String aftlot4) {
        regAftlot4(CK_LT, fRES(aftlot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTLOT4: {varchar(255)}
     * @param aftlot4 The value of aftlot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot4_GreaterEqual(String aftlot4) {
        regAftlot4(CK_GE, fRES(aftlot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTLOT4: {varchar(255)}
     * @param aftlot4 The value of aftlot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot4_LessEqual(String aftlot4) {
        regAftlot4(CK_LE, fRES(aftlot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTLOT4: {varchar(255)}
     * @param aftlot4List The collection of aftlot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot4_InScope(Collection<String> aftlot4List) {
        doSetAftlot4_InScope(aftlot4List);
    }

    protected void doSetAftlot4_InScope(Collection<String> aftlot4List) {
        regINS(CK_INS, cTL(aftlot4List), xgetCValueAftlot4(), "AFTLOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTLOT4: {varchar(255)}
     * @param aftlot4List The collection of aftlot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot4_NotInScope(Collection<String> aftlot4List) {
        doSetAftlot4_NotInScope(aftlot4List);
    }

    protected void doSetAftlot4_NotInScope(Collection<String> aftlot4List) {
        regINS(CK_NINS, cTL(aftlot4List), xgetCValueAftlot4(), "AFTLOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AFTLOT4: {varchar(255)} <br>
     * <pre>e.g. setAftlot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param aftlot4 The value of aftlot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAftlot4_LikeSearch(String aftlot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(aftlot4), xgetCValueAftlot4(), "AFTLOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AFTLOT4: {varchar(255)}
     * @param aftlot4 The value of aftlot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAftlot4_NotLikeSearch(String aftlot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(aftlot4), xgetCValueAftlot4(), "AFTLOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AFTLOT4: {varchar(255)}
     * @param aftlot4 The value of aftlot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot4_PrefixSearch(String aftlot4) {
        setAftlot4_LikeSearch(aftlot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AFTLOT4: {varchar(255)}
     */
    public void setAftlot4_IsNull() { regAftlot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AFTLOT4: {varchar(255)}
     */
    public void setAftlot4_IsNullOrEmpty() { regAftlot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AFTLOT4: {varchar(255)}
     */
    public void setAftlot4_IsNotNull() { regAftlot4(CK_ISNN, DOBJ); }

    protected void regAftlot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAftlot4(), "AFTLOT4"); }
    protected abstract ConditionValue xgetCValueAftlot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTLOT3: {varchar(255)}
     * @param aftlot3 The value of aftlot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot3_Equal(String aftlot3) {
        doSetAftlot3_Equal(fRES(aftlot3));
    }

    protected void doSetAftlot3_Equal(String aftlot3) {
        regAftlot3(CK_EQ, aftlot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTLOT3: {varchar(255)}
     * @param aftlot3 The value of aftlot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot3_NotEqual(String aftlot3) {
        doSetAftlot3_NotEqual(fRES(aftlot3));
    }

    protected void doSetAftlot3_NotEqual(String aftlot3) {
        regAftlot3(CK_NES, aftlot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTLOT3: {varchar(255)}
     * @param aftlot3 The value of aftlot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot3_GreaterThan(String aftlot3) {
        regAftlot3(CK_GT, fRES(aftlot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTLOT3: {varchar(255)}
     * @param aftlot3 The value of aftlot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot3_LessThan(String aftlot3) {
        regAftlot3(CK_LT, fRES(aftlot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTLOT3: {varchar(255)}
     * @param aftlot3 The value of aftlot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot3_GreaterEqual(String aftlot3) {
        regAftlot3(CK_GE, fRES(aftlot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AFTLOT3: {varchar(255)}
     * @param aftlot3 The value of aftlot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot3_LessEqual(String aftlot3) {
        regAftlot3(CK_LE, fRES(aftlot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTLOT3: {varchar(255)}
     * @param aftlot3List The collection of aftlot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot3_InScope(Collection<String> aftlot3List) {
        doSetAftlot3_InScope(aftlot3List);
    }

    protected void doSetAftlot3_InScope(Collection<String> aftlot3List) {
        regINS(CK_INS, cTL(aftlot3List), xgetCValueAftlot3(), "AFTLOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AFTLOT3: {varchar(255)}
     * @param aftlot3List The collection of aftlot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot3_NotInScope(Collection<String> aftlot3List) {
        doSetAftlot3_NotInScope(aftlot3List);
    }

    protected void doSetAftlot3_NotInScope(Collection<String> aftlot3List) {
        regINS(CK_NINS, cTL(aftlot3List), xgetCValueAftlot3(), "AFTLOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AFTLOT3: {varchar(255)} <br>
     * <pre>e.g. setAftlot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param aftlot3 The value of aftlot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAftlot3_LikeSearch(String aftlot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(aftlot3), xgetCValueAftlot3(), "AFTLOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AFTLOT3: {varchar(255)}
     * @param aftlot3 The value of aftlot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAftlot3_NotLikeSearch(String aftlot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(aftlot3), xgetCValueAftlot3(), "AFTLOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AFTLOT3: {varchar(255)}
     * @param aftlot3 The value of aftlot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAftlot3_PrefixSearch(String aftlot3) {
        setAftlot3_LikeSearch(aftlot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AFTLOT3: {varchar(255)}
     */
    public void setAftlot3_IsNull() { regAftlot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AFTLOT3: {varchar(255)}
     */
    public void setAftlot3_IsNullOrEmpty() { regAftlot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AFTLOT3: {varchar(255)}
     */
    public void setAftlot3_IsNotNull() { regAftlot3(CK_ISNN, DOBJ); }

    protected void regAftlot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAftlot3(), "AFTLOT3"); }
    protected abstract ConditionValue xgetCValueAftlot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY: {varchar(255)}
     * @param qty The value of qty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_Equal(String qty) {
        doSetQty_Equal(fRES(qty));
    }

    protected void doSetQty_Equal(String qty) {
        regQty(CK_EQ, qty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY: {varchar(255)}
     * @param qty The value of qty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_NotEqual(String qty) {
        doSetQty_NotEqual(fRES(qty));
    }

    protected void doSetQty_NotEqual(String qty) {
        regQty(CK_NES, qty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY: {varchar(255)}
     * @param qty The value of qty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_GreaterThan(String qty) {
        regQty(CK_GT, fRES(qty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY: {varchar(255)}
     * @param qty The value of qty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_LessThan(String qty) {
        regQty(CK_LT, fRES(qty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY: {varchar(255)}
     * @param qty The value of qty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_GreaterEqual(String qty) {
        regQty(CK_GE, fRES(qty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY: {varchar(255)}
     * @param qty The value of qty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_LessEqual(String qty) {
        regQty(CK_LE, fRES(qty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QTY: {varchar(255)}
     * @param qtyList The collection of qty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_InScope(Collection<String> qtyList) {
        doSetQty_InScope(qtyList);
    }

    protected void doSetQty_InScope(Collection<String> qtyList) {
        regINS(CK_INS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QTY: {varchar(255)}
     * @param qtyList The collection of qty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_NotInScope(Collection<String> qtyList) {
        doSetQty_NotInScope(qtyList);
    }

    protected void doSetQty_NotInScope(Collection<String> qtyList) {
        regINS(CK_NINS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY: {varchar(255)} <br>
     * <pre>e.g. setQty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param qty The value of qty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQty_LikeSearch(String qty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qty), xgetCValueQty(), "QTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY: {varchar(255)}
     * @param qty The value of qty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQty_NotLikeSearch(String qty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qty), xgetCValueQty(), "QTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY: {varchar(255)}
     * @param qty The value of qty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_PrefixSearch(String qty) {
        setQty_LikeSearch(qty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY: {varchar(255)}
     */
    public void setQty_IsNull() { regQty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * QTY: {varchar(255)}
     */
    public void setQty_IsNullOrEmpty() { regQty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY: {varchar(255)}
     */
    public void setQty_IsNotNull() { regQty(CK_ISNN, DOBJ); }

    protected void regQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty(), "QTY"); }
    protected abstract ConditionValue xgetCValueQty();

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
    public HpSLCFunction<EShippingInoutPlanCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EShippingInoutPlanCB.class);
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
    public HpSLCFunction<EShippingInoutPlanCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EShippingInoutPlanCB.class);
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
    public HpSLCFunction<EShippingInoutPlanCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EShippingInoutPlanCB.class);
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
    public HpSLCFunction<EShippingInoutPlanCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EShippingInoutPlanCB.class);
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
    public HpSLCFunction<EShippingInoutPlanCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EShippingInoutPlanCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EShippingInoutPlanCB&gt;() {
     *     public void query(EShippingInoutPlanCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EShippingInoutPlanCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EShippingInoutPlanCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingInoutPlanCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EShippingInoutPlanCQ sq);

    protected EShippingInoutPlanCB xcreateScalarConditionCB() {
        EShippingInoutPlanCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EShippingInoutPlanCB xcreateScalarConditionPartitionByCB() {
        EShippingInoutPlanCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EShippingInoutPlanCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingInoutPlanCB cb = new EShippingInoutPlanCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_INOUT_PLAN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EShippingInoutPlanCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EShippingInoutPlanCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EShippingInoutPlanCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingInoutPlanCB cb = new EShippingInoutPlanCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_INOUT_PLAN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EShippingInoutPlanCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EShippingInoutPlanCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EShippingInoutPlanCB cb = new EShippingInoutPlanCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EShippingInoutPlanCQ sq);

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
    protected EShippingInoutPlanCB newMyCB() {
        return new EShippingInoutPlanCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EShippingInoutPlanCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of E_ORDER_SPLIT_DATA.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEOrderSplitDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEOrderSplitDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_ORDER_SPLIT_DATA";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderSplitDataId The value of orderSplitDataId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderSplitDataId_Equal(Long orderSplitDataId) {
        doSetOrderSplitDataId_Equal(orderSplitDataId);
    }

    protected void doSetOrderSplitDataId_Equal(Long orderSplitDataId) {
        regOrderSplitDataId(CK_EQ, orderSplitDataId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderSplitDataId The value of orderSplitDataId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderSplitDataId_NotEqual(Long orderSplitDataId) {
        doSetOrderSplitDataId_NotEqual(orderSplitDataId);
    }

    protected void doSetOrderSplitDataId_NotEqual(Long orderSplitDataId) {
        regOrderSplitDataId(CK_NES, orderSplitDataId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderSplitDataId The value of orderSplitDataId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderSplitDataId_GreaterThan(Long orderSplitDataId) {
        regOrderSplitDataId(CK_GT, orderSplitDataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderSplitDataId The value of orderSplitDataId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderSplitDataId_LessThan(Long orderSplitDataId) {
        regOrderSplitDataId(CK_LT, orderSplitDataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderSplitDataId The value of orderSplitDataId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderSplitDataId_GreaterEqual(Long orderSplitDataId) {
        regOrderSplitDataId(CK_GE, orderSplitDataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderSplitDataId The value of orderSplitDataId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderSplitDataId_LessEqual(Long orderSplitDataId) {
        regOrderSplitDataId(CK_LE, orderSplitDataId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of orderSplitDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of orderSplitDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOrderSplitDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOrderSplitDataId(), "ORDER_SPLIT_DATA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderSplitDataIdList The collection of orderSplitDataId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSplitDataId_InScope(Collection<Long> orderSplitDataIdList) {
        doSetOrderSplitDataId_InScope(orderSplitDataIdList);
    }

    protected void doSetOrderSplitDataId_InScope(Collection<Long> orderSplitDataIdList) {
        regINS(CK_INS, cTL(orderSplitDataIdList), xgetCValueOrderSplitDataId(), "ORDER_SPLIT_DATA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderSplitDataIdList The collection of orderSplitDataId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSplitDataId_NotInScope(Collection<Long> orderSplitDataIdList) {
        doSetOrderSplitDataId_NotInScope(orderSplitDataIdList);
    }

    protected void doSetOrderSplitDataId_NotInScope(Collection<Long> orderSplitDataIdList) {
        regINS(CK_NINS, cTL(orderSplitDataIdList), xgetCValueOrderSplitDataId(), "ORDER_SPLIT_DATA_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setOrderSplitDataId_IsNull() { regOrderSplitDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setOrderSplitDataId_IsNotNull() { regOrderSplitDataId(CK_ISNN, DOBJ); }

    protected void regOrderSplitDataId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderSplitDataId(), "ORDER_SPLIT_DATA_ID"); }
    protected abstract ConditionValue xgetCValueOrderSplitDataId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
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
     * SEND_CD: {varchar(30)}
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
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_GreaterThan(String sendCd) {
        regSendCd(CK_GT, fRES(sendCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_LessThan(String sendCd) {
        regSendCd(CK_LT, fRES(sendCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_GreaterEqual(String sendCd) {
        regSendCd(CK_GE, fRES(sendCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_LessEqual(String sendCd) {
        regSendCd(CK_LE, fRES(sendCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
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
     * SEND_CD: {varchar(30)}
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
     * SEND_CD: {varchar(30)} <br>
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
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSendCd_NotLikeSearch(String sendCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sendCd), xgetCValueSendCd(), "SEND_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_PrefixSearch(String sendCd) {
        setSendCd_LikeSearch(sendCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNull() { regSendCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNullOrEmpty() { regSendCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNotNull() { regSendCd(CK_ISNN, DOBJ); }

    protected void regSendCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendCd(), "SEND_CD"); }
    protected abstract ConditionValue xgetCValueSendCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {bigint(19)}
     * @param sendRowId The value of sendRowId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_Equal(Long sendRowId) {
        doSetSendRowId_Equal(sendRowId);
    }

    protected void doSetSendRowId_Equal(Long sendRowId) {
        regSendRowId(CK_EQ, sendRowId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {bigint(19)}
     * @param sendRowId The value of sendRowId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_NotEqual(Long sendRowId) {
        doSetSendRowId_NotEqual(sendRowId);
    }

    protected void doSetSendRowId_NotEqual(Long sendRowId) {
        regSendRowId(CK_NES, sendRowId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {bigint(19)}
     * @param sendRowId The value of sendRowId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_GreaterThan(Long sendRowId) {
        regSendRowId(CK_GT, sendRowId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {bigint(19)}
     * @param sendRowId The value of sendRowId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_LessThan(Long sendRowId) {
        regSendRowId(CK_LT, sendRowId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {bigint(19)}
     * @param sendRowId The value of sendRowId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_GreaterEqual(Long sendRowId) {
        regSendRowId(CK_GE, sendRowId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {bigint(19)}
     * @param sendRowId The value of sendRowId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_LessEqual(Long sendRowId) {
        regSendRowId(CK_LE, sendRowId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {bigint(19)}
     * @param minNumber The min number of sendRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sendRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSendRowId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSendRowId(), "SEND_ROW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEND_ROW_ID: {bigint(19)}
     * @param sendRowIdList The collection of sendRowId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendRowId_InScope(Collection<Long> sendRowIdList) {
        doSetSendRowId_InScope(sendRowIdList);
    }

    protected void doSetSendRowId_InScope(Collection<Long> sendRowIdList) {
        regINS(CK_INS, cTL(sendRowIdList), xgetCValueSendRowId(), "SEND_ROW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEND_ROW_ID: {bigint(19)}
     * @param sendRowIdList The collection of sendRowId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendRowId_NotInScope(Collection<Long> sendRowIdList) {
        doSetSendRowId_NotInScope(sendRowIdList);
    }

    protected void doSetSendRowId_NotInScope(Collection<Long> sendRowIdList) {
        regINS(CK_NINS, cTL(sendRowIdList), xgetCValueSendRowId(), "SEND_ROW_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {bigint(19)}
     */
    public void setSendRowId_IsNull() { regSendRowId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {bigint(19)}
     */
    public void setSendRowId_IsNotNull() { regSendRowId(CK_ISNN, DOBJ); }

    protected void regSendRowId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendRowId(), "SEND_ROW_ID"); }
    protected abstract ConditionValue xgetCValueSendRowId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1)}
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
     * WORK_FLG: {char(1)}
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
     * WORK_FLG: {char(1)}
     * @param workFlg The value of workFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterThan(String workFlg) {
        regWorkFlg(CK_GT, fRES(workFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1)}
     * @param workFlg The value of workFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessThan(String workFlg) {
        regWorkFlg(CK_LT, fRES(workFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1)}
     * @param workFlg The value of workFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterEqual(String workFlg) {
        regWorkFlg(CK_GE, fRES(workFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1)}
     * @param workFlg The value of workFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessEqual(String workFlg) {
        regWorkFlg(CK_LE, fRES(workFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1)}
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
     * WORK_FLG: {char(1)}
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
     * WORK_FLG: {char(1)} <br>
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
     * WORK_FLG: {char(1)}
     * @param workFlg The value of workFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkFlg_NotLikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1)}
     * @param workFlg The value of workFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_PrefixSearch(String workFlg) {
        setWorkFlg_LikeSearch(workFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1)}
     */
    public void setWorkFlg_IsNull() { regWorkFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1)}
     */
    public void setWorkFlg_IsNotNull() { regWorkFlg(CK_ISNN, DOBJ); }

    protected void regWorkFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkFlg(), "WORK_FLG"); }
    protected abstract ConditionValue xgetCValueWorkFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REC_FLG: {varchar(30)}
     * @param recFlg The value of recFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecFlg_Equal(String recFlg) {
        doSetRecFlg_Equal(fRES(recFlg));
    }

    protected void doSetRecFlg_Equal(String recFlg) {
        regRecFlg(CK_EQ, recFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REC_FLG: {varchar(30)}
     * @param recFlg The value of recFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecFlg_NotEqual(String recFlg) {
        doSetRecFlg_NotEqual(fRES(recFlg));
    }

    protected void doSetRecFlg_NotEqual(String recFlg) {
        regRecFlg(CK_NES, recFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REC_FLG: {varchar(30)}
     * @param recFlg The value of recFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecFlg_GreaterThan(String recFlg) {
        regRecFlg(CK_GT, fRES(recFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REC_FLG: {varchar(30)}
     * @param recFlg The value of recFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecFlg_LessThan(String recFlg) {
        regRecFlg(CK_LT, fRES(recFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REC_FLG: {varchar(30)}
     * @param recFlg The value of recFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecFlg_GreaterEqual(String recFlg) {
        regRecFlg(CK_GE, fRES(recFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REC_FLG: {varchar(30)}
     * @param recFlg The value of recFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecFlg_LessEqual(String recFlg) {
        regRecFlg(CK_LE, fRES(recFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REC_FLG: {varchar(30)}
     * @param recFlgList The collection of recFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecFlg_InScope(Collection<String> recFlgList) {
        doSetRecFlg_InScope(recFlgList);
    }

    protected void doSetRecFlg_InScope(Collection<String> recFlgList) {
        regINS(CK_INS, cTL(recFlgList), xgetCValueRecFlg(), "REC_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REC_FLG: {varchar(30)}
     * @param recFlgList The collection of recFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecFlg_NotInScope(Collection<String> recFlgList) {
        doSetRecFlg_NotInScope(recFlgList);
    }

    protected void doSetRecFlg_NotInScope(Collection<String> recFlgList) {
        regINS(CK_NINS, cTL(recFlgList), xgetCValueRecFlg(), "REC_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REC_FLG: {varchar(30)} <br>
     * <pre>e.g. setRecFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param recFlg The value of recFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRecFlg_LikeSearch(String recFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(recFlg), xgetCValueRecFlg(), "REC_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REC_FLG: {varchar(30)}
     * @param recFlg The value of recFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRecFlg_NotLikeSearch(String recFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(recFlg), xgetCValueRecFlg(), "REC_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REC_FLG: {varchar(30)}
     * @param recFlg The value of recFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecFlg_PrefixSearch(String recFlg) {
        setRecFlg_LikeSearch(recFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REC_FLG: {varchar(30)}
     */
    public void setRecFlg_IsNull() { regRecFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REC_FLG: {varchar(30)}
     */
    public void setRecFlg_IsNullOrEmpty() { regRecFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REC_FLG: {varchar(30)}
     */
    public void setRecFlg_IsNotNull() { regRecFlg(CK_ISNN, DOBJ); }

    protected void regRecFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRecFlg(), "REC_FLG"); }
    protected abstract ConditionValue xgetCValueRecFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRWHCD: {varchar(30)}
     * @param srwhcd The value of srwhcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_Equal(String srwhcd) {
        doSetSrwhcd_Equal(fRES(srwhcd));
    }

    protected void doSetSrwhcd_Equal(String srwhcd) {
        regSrwhcd(CK_EQ, srwhcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRWHCD: {varchar(30)}
     * @param srwhcd The value of srwhcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_NotEqual(String srwhcd) {
        doSetSrwhcd_NotEqual(fRES(srwhcd));
    }

    protected void doSetSrwhcd_NotEqual(String srwhcd) {
        regSrwhcd(CK_NES, srwhcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRWHCD: {varchar(30)}
     * @param srwhcd The value of srwhcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_GreaterThan(String srwhcd) {
        regSrwhcd(CK_GT, fRES(srwhcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRWHCD: {varchar(30)}
     * @param srwhcd The value of srwhcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_LessThan(String srwhcd) {
        regSrwhcd(CK_LT, fRES(srwhcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRWHCD: {varchar(30)}
     * @param srwhcd The value of srwhcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_GreaterEqual(String srwhcd) {
        regSrwhcd(CK_GE, fRES(srwhcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRWHCD: {varchar(30)}
     * @param srwhcd The value of srwhcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_LessEqual(String srwhcd) {
        regSrwhcd(CK_LE, fRES(srwhcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRWHCD: {varchar(30)}
     * @param srwhcdList The collection of srwhcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_InScope(Collection<String> srwhcdList) {
        doSetSrwhcd_InScope(srwhcdList);
    }

    protected void doSetSrwhcd_InScope(Collection<String> srwhcdList) {
        regINS(CK_INS, cTL(srwhcdList), xgetCValueSrwhcd(), "SRWHCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRWHCD: {varchar(30)}
     * @param srwhcdList The collection of srwhcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_NotInScope(Collection<String> srwhcdList) {
        doSetSrwhcd_NotInScope(srwhcdList);
    }

    protected void doSetSrwhcd_NotInScope(Collection<String> srwhcdList) {
        regINS(CK_NINS, cTL(srwhcdList), xgetCValueSrwhcd(), "SRWHCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRWHCD: {varchar(30)} <br>
     * <pre>e.g. setSrwhcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srwhcd The value of srwhcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrwhcd_LikeSearch(String srwhcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srwhcd), xgetCValueSrwhcd(), "SRWHCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRWHCD: {varchar(30)}
     * @param srwhcd The value of srwhcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrwhcd_NotLikeSearch(String srwhcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srwhcd), xgetCValueSrwhcd(), "SRWHCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRWHCD: {varchar(30)}
     * @param srwhcd The value of srwhcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_PrefixSearch(String srwhcd) {
        setSrwhcd_LikeSearch(srwhcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRWHCD: {varchar(30)}
     */
    public void setSrwhcd_IsNull() { regSrwhcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRWHCD: {varchar(30)}
     */
    public void setSrwhcd_IsNullOrEmpty() { regSrwhcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRWHCD: {varchar(30)}
     */
    public void setSrwhcd_IsNotNull() { regSrwhcd(CK_ISNN, DOBJ); }

    protected void regSrwhcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrwhcd(), "SRWHCD"); }
    protected abstract ConditionValue xgetCValueSrwhcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_Equal(String dpcd) {
        doSetDpcd_Equal(fRES(dpcd));
    }

    protected void doSetDpcd_Equal(String dpcd) {
        regDpcd(CK_EQ, dpcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_NotEqual(String dpcd) {
        doSetDpcd_NotEqual(fRES(dpcd));
    }

    protected void doSetDpcd_NotEqual(String dpcd) {
        regDpcd(CK_NES, dpcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterThan(String dpcd) {
        regDpcd(CK_GT, fRES(dpcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessThan(String dpcd) {
        regDpcd(CK_LT, fRES(dpcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterEqual(String dpcd) {
        regDpcd(CK_GE, fRES(dpcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessEqual(String dpcd) {
        regDpcd(CK_LE, fRES(dpcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcdList The collection of dpcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_InScope(Collection<String> dpcdList) {
        doSetDpcd_InScope(dpcdList);
    }

    protected void doSetDpcd_InScope(Collection<String> dpcdList) {
        regINS(CK_INS, cTL(dpcdList), xgetCValueDpcd(), "DPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcdList The collection of dpcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_NotInScope(Collection<String> dpcdList) {
        doSetDpcd_NotInScope(dpcdList);
    }

    protected void doSetDpcd_NotInScope(Collection<String> dpcdList) {
        regINS(CK_NINS, cTL(dpcdList), xgetCValueDpcd(), "DPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(30)} <br>
     * <pre>e.g. setDpcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dpcd The value of dpcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDpcd_LikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDpcd_NotLikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_PrefixSearch(String dpcd) {
        setDpcd_LikeSearch(dpcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     */
    public void setDpcd_IsNull() { regDpcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     */
    public void setDpcd_IsNullOrEmpty() { regDpcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     */
    public void setDpcd_IsNotNull() { regDpcd(CK_ISNN, DOBJ); }

    protected void regDpcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDpcd(), "DPCD"); }
    protected abstract ConditionValue xgetCValueDpcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_Equal(String ded) {
        doSetDed_Equal(fRES(ded));
    }

    protected void doSetDed_Equal(String ded) {
        regDed(CK_EQ, ded);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_NotEqual(String ded) {
        doSetDed_NotEqual(fRES(ded));
    }

    protected void doSetDed_NotEqual(String ded) {
        regDed(CK_NES, ded);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterThan(String ded) {
        regDed(CK_GT, fRES(ded));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessThan(String ded) {
        regDed(CK_LT, fRES(ded));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterEqual(String ded) {
        regDed(CK_GE, fRES(ded));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessEqual(String ded) {
        regDed(CK_LE, fRES(ded));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {varchar(30)}
     * @param dedList The collection of ded as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_InScope(Collection<String> dedList) {
        doSetDed_InScope(dedList);
    }

    protected void doSetDed_InScope(Collection<String> dedList) {
        regINS(CK_INS, cTL(dedList), xgetCValueDed(), "DED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {varchar(30)}
     * @param dedList The collection of ded as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_NotInScope(Collection<String> dedList) {
        doSetDed_NotInScope(dedList);
    }

    protected void doSetDed_NotInScope(Collection<String> dedList) {
        regINS(CK_NINS, cTL(dedList), xgetCValueDed(), "DED");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {varchar(30)} <br>
     * <pre>e.g. setDed_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ded The value of ded as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDed_LikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDed_NotLikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_PrefixSearch(String ded) {
        setDed_LikeSearch(ded, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     */
    public void setDed_IsNull() { regDed(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     */
    public void setDed_IsNullOrEmpty() { regDed(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     */
    public void setDed_IsNotNull() { regDed(CK_ISNN, DOBJ); }

    protected void regDed(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDed(), "DED"); }
    protected abstract ConditionValue xgetCValueDed();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {char(1)}
     * @param pstnid The value of pstnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_Equal(String pstnid) {
        doSetPstnid_Equal(fRES(pstnid));
    }

    protected void doSetPstnid_Equal(String pstnid) {
        regPstnid(CK_EQ, pstnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {char(1)}
     * @param pstnid The value of pstnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_NotEqual(String pstnid) {
        doSetPstnid_NotEqual(fRES(pstnid));
    }

    protected void doSetPstnid_NotEqual(String pstnid) {
        regPstnid(CK_NES, pstnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {char(1)}
     * @param pstnid The value of pstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterThan(String pstnid) {
        regPstnid(CK_GT, fRES(pstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {char(1)}
     * @param pstnid The value of pstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessThan(String pstnid) {
        regPstnid(CK_LT, fRES(pstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {char(1)}
     * @param pstnid The value of pstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterEqual(String pstnid) {
        regPstnid(CK_GE, fRES(pstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {char(1)}
     * @param pstnid The value of pstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessEqual(String pstnid) {
        regPstnid(CK_LE, fRES(pstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {char(1)}
     * @param pstnidList The collection of pstnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_InScope(Collection<String> pstnidList) {
        doSetPstnid_InScope(pstnidList);
    }

    protected void doSetPstnid_InScope(Collection<String> pstnidList) {
        regINS(CK_INS, cTL(pstnidList), xgetCValuePstnid(), "PSTNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {char(1)}
     * @param pstnidList The collection of pstnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_NotInScope(Collection<String> pstnidList) {
        doSetPstnid_NotInScope(pstnidList);
    }

    protected void doSetPstnid_NotInScope(Collection<String> pstnidList) {
        regINS(CK_NINS, cTL(pstnidList), xgetCValuePstnid(), "PSTNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {char(1)} <br>
     * <pre>e.g. setPstnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pstnid The value of pstnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPstnid_LikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {char(1)}
     * @param pstnid The value of pstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPstnid_NotLikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {char(1)}
     * @param pstnid The value of pstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_PrefixSearch(String pstnid) {
        setPstnid_LikeSearch(pstnid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PSTNID: {char(1)}
     */
    public void setPstnid_IsNull() { regPstnid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PSTNID: {char(1)}
     */
    public void setPstnid_IsNotNull() { regPstnid(CK_ISNN, DOBJ); }

    protected void regPstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePstnid(), "PSTNID"); }
    protected abstract ConditionValue xgetCValuePstnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_Equal(String dlvrnk) {
        doSetDlvrnk_Equal(fRES(dlvrnk));
    }

    protected void doSetDlvrnk_Equal(String dlvrnk) {
        regDlvrnk(CK_EQ, dlvrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_NotEqual(String dlvrnk) {
        doSetDlvrnk_NotEqual(fRES(dlvrnk));
    }

    protected void doSetDlvrnk_NotEqual(String dlvrnk) {
        regDlvrnk(CK_NES, dlvrnk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_GreaterThan(String dlvrnk) {
        regDlvrnk(CK_GT, fRES(dlvrnk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_LessThan(String dlvrnk) {
        regDlvrnk(CK_LT, fRES(dlvrnk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_GreaterEqual(String dlvrnk) {
        regDlvrnk(CK_GE, fRES(dlvrnk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_LessEqual(String dlvrnk) {
        regDlvrnk(CK_LE, fRES(dlvrnk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnkList The collection of dlvrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_InScope(Collection<String> dlvrnkList) {
        doSetDlvrnk_InScope(dlvrnkList);
    }

    protected void doSetDlvrnk_InScope(Collection<String> dlvrnkList) {
        regINS(CK_INS, cTL(dlvrnkList), xgetCValueDlvrnk(), "DLVRNK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnkList The collection of dlvrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_NotInScope(Collection<String> dlvrnkList) {
        doSetDlvrnk_NotInScope(dlvrnkList);
    }

    protected void doSetDlvrnk_NotInScope(Collection<String> dlvrnkList) {
        regINS(CK_NINS, cTL(dlvrnkList), xgetCValueDlvrnk(), "DLVRNK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(30)} <br>
     * <pre>e.g. setDlvrnk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dlvrnk The value of dlvrnk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDlvrnk_LikeSearch(String dlvrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dlvrnk), xgetCValueDlvrnk(), "DLVRNK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDlvrnk_NotLikeSearch(String dlvrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dlvrnk), xgetCValueDlvrnk(), "DLVRNK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_PrefixSearch(String dlvrnk) {
        setDlvrnk_LikeSearch(dlvrnk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     */
    public void setDlvrnk_IsNull() { regDlvrnk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     */
    public void setDlvrnk_IsNullOrEmpty() { regDlvrnk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     */
    public void setDlvrnk_IsNotNull() { regDlvrnk(CK_ISNN, DOBJ); }

    protected void regDlvrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvrnk(), "DLVRNK"); }
    protected abstract ConditionValue xgetCValueDlvrnk();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_Equal(Long dlvsnm) {
        doSetDlvsnm_Equal(dlvsnm);
    }

    protected void doSetDlvsnm_Equal(Long dlvsnm) {
        regDlvsnm(CK_EQ, dlvsnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_NotEqual(Long dlvsnm) {
        doSetDlvsnm_NotEqual(dlvsnm);
    }

    protected void doSetDlvsnm_NotEqual(Long dlvsnm) {
        regDlvsnm(CK_NES, dlvsnm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_GreaterThan(Long dlvsnm) {
        regDlvsnm(CK_GT, dlvsnm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_LessThan(Long dlvsnm) {
        regDlvsnm(CK_LT, dlvsnm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_GreaterEqual(Long dlvsnm) {
        regDlvsnm(CK_GE, dlvsnm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_LessEqual(Long dlvsnm) {
        regDlvsnm(CK_LE, dlvsnm);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param minNumber The min number of dlvsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dlvsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDlvsnm_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDlvsnm(), "DLVSNM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnmList The collection of dlvsnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvsnm_InScope(Collection<Long> dlvsnmList) {
        doSetDlvsnm_InScope(dlvsnmList);
    }

    protected void doSetDlvsnm_InScope(Collection<Long> dlvsnmList) {
        regINS(CK_INS, cTL(dlvsnmList), xgetCValueDlvsnm(), "DLVSNM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnmList The collection of dlvsnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvsnm_NotInScope(Collection<Long> dlvsnmList) {
        doSetDlvsnm_NotInScope(dlvsnmList);
    }

    protected void doSetDlvsnm_NotInScope(Collection<Long> dlvsnmList) {
        regINS(CK_NINS, cTL(dlvsnmList), xgetCValueDlvsnm(), "DLVSNM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     */
    public void setDlvsnm_IsNull() { regDlvsnm(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     */
    public void setDlvsnm_IsNotNull() { regDlvsnm(CK_ISNN, DOBJ); }

    protected void regDlvsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvsnm(), "DLVSNM"); }
    protected abstract ConditionValue xgetCValueDlvsnm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_Equal(Long sroprtcnt) {
        doSetSroprtcnt_Equal(sroprtcnt);
    }

    protected void doSetSroprtcnt_Equal(Long sroprtcnt) {
        regSroprtcnt(CK_EQ, sroprtcnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotEqual(Long sroprtcnt) {
        doSetSroprtcnt_NotEqual(sroprtcnt);
    }

    protected void doSetSroprtcnt_NotEqual(Long sroprtcnt) {
        regSroprtcnt(CK_NES, sroprtcnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterThan(Long sroprtcnt) {
        regSroprtcnt(CK_GT, sroprtcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessThan(Long sroprtcnt) {
        regSroprtcnt(CK_LT, sroprtcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterEqual(Long sroprtcnt) {
        regSroprtcnt(CK_GE, sroprtcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessEqual(Long sroprtcnt) {
        regSroprtcnt(CK_LE, sroprtcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param minNumber The min number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSroprtcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSroprtcnt(), "SROPRTCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcntList The collection of sroprtcnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_InScope(Collection<Long> sroprtcntList) {
        doSetSroprtcnt_InScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_InScope(Collection<Long> sroprtcntList) {
        regINS(CK_INS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcntList The collection of sroprtcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        doSetSroprtcnt_NotInScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        regINS(CK_NINS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     */
    public void setSroprtcnt_IsNull() { regSroprtcnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     */
    public void setSroprtcnt_IsNotNull() { regSroprtcnt(CK_ISNN, DOBJ); }

    protected void regSroprtcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSroprtcnt(), "SROPRTCNT"); }
    protected abstract ConditionValue xgetCValueSroprtcnt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     * @param sscd The value of sscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_Equal(String sscd) {
        doSetSscd_Equal(fRES(sscd));
    }

    protected void doSetSscd_Equal(String sscd) {
        regSscd(CK_EQ, sscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     * @param sscd The value of sscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_NotEqual(String sscd) {
        doSetSscd_NotEqual(fRES(sscd));
    }

    protected void doSetSscd_NotEqual(String sscd) {
        regSscd(CK_NES, sscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     * @param sscd The value of sscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_GreaterThan(String sscd) {
        regSscd(CK_GT, fRES(sscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     * @param sscd The value of sscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_LessThan(String sscd) {
        regSscd(CK_LT, fRES(sscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     * @param sscd The value of sscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_GreaterEqual(String sscd) {
        regSscd(CK_GE, fRES(sscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     * @param sscd The value of sscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_LessEqual(String sscd) {
        regSscd(CK_LE, fRES(sscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCD: {varchar(30)}
     * @param sscdList The collection of sscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_InScope(Collection<String> sscdList) {
        doSetSscd_InScope(sscdList);
    }

    protected void doSetSscd_InScope(Collection<String> sscdList) {
        regINS(CK_INS, cTL(sscdList), xgetCValueSscd(), "SSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCD: {varchar(30)}
     * @param sscdList The collection of sscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_NotInScope(Collection<String> sscdList) {
        doSetSscd_NotInScope(sscdList);
    }

    protected void doSetSscd_NotInScope(Collection<String> sscdList) {
        regINS(CK_NINS, cTL(sscdList), xgetCValueSscd(), "SSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCD: {varchar(30)} <br>
     * <pre>e.g. setSscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sscd The value of sscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSscd_LikeSearch(String sscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sscd), xgetCValueSscd(), "SSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCD: {varchar(30)}
     * @param sscd The value of sscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSscd_NotLikeSearch(String sscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sscd), xgetCValueSscd(), "SSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCD: {varchar(30)}
     * @param sscd The value of sscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_PrefixSearch(String sscd) {
        setSscd_LikeSearch(sscd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     */
    public void setSscd_IsNull() { regSscd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     */
    public void setSscd_IsNullOrEmpty() { regSscd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SSCD: {varchar(30)}
     */
    public void setSscd_IsNotNull() { regSscd(CK_ISNN, DOBJ); }

    protected void regSscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSscd(), "SSCD"); }
    protected abstract ConditionValue xgetCValueSscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_Equal(String dlvymd) {
        doSetDlvymd_Equal(fRES(dlvymd));
    }

    protected void doSetDlvymd_Equal(String dlvymd) {
        regDlvymd(CK_EQ, dlvymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_NotEqual(String dlvymd) {
        doSetDlvymd_NotEqual(fRES(dlvymd));
    }

    protected void doSetDlvymd_NotEqual(String dlvymd) {
        regDlvymd(CK_NES, dlvymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_GreaterThan(String dlvymd) {
        regDlvymd(CK_GT, fRES(dlvymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_LessThan(String dlvymd) {
        regDlvymd(CK_LT, fRES(dlvymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_GreaterEqual(String dlvymd) {
        regDlvymd(CK_GE, fRES(dlvymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_LessEqual(String dlvymd) {
        regDlvymd(CK_LE, fRES(dlvymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymdList The collection of dlvymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_InScope(Collection<String> dlvymdList) {
        doSetDlvymd_InScope(dlvymdList);
    }

    protected void doSetDlvymd_InScope(Collection<String> dlvymdList) {
        regINS(CK_INS, cTL(dlvymdList), xgetCValueDlvymd(), "DLVYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymdList The collection of dlvymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_NotInScope(Collection<String> dlvymdList) {
        doSetDlvymd_NotInScope(dlvymdList);
    }

    protected void doSetDlvymd_NotInScope(Collection<String> dlvymdList) {
        regINS(CK_NINS, cTL(dlvymdList), xgetCValueDlvymd(), "DLVYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {varchar(8)} <br>
     * <pre>e.g. setDlvymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dlvymd The value of dlvymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDlvymd_LikeSearch(String dlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dlvymd), xgetCValueDlvymd(), "DLVYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDlvymd_NotLikeSearch(String dlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dlvymd), xgetCValueDlvymd(), "DLVYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_PrefixSearch(String dlvymd) {
        setDlvymd_LikeSearch(dlvymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     */
    public void setDlvymd_IsNull() { regDlvymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     */
    public void setDlvymd_IsNullOrEmpty() { regDlvymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     */
    public void setDlvymd_IsNotNull() { regDlvymd(CK_ISNN, DOBJ); }

    protected void regDlvymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvymd(), "DLVYMD"); }
    protected abstract ConditionValue xgetCValueDlvymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(8)}
     * @param zzordymd The value of zzordymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_Equal(String zzordymd) {
        doSetZzordymd_Equal(fRES(zzordymd));
    }

    protected void doSetZzordymd_Equal(String zzordymd) {
        regZzordymd(CK_EQ, zzordymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(8)}
     * @param zzordymd The value of zzordymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_NotEqual(String zzordymd) {
        doSetZzordymd_NotEqual(fRES(zzordymd));
    }

    protected void doSetZzordymd_NotEqual(String zzordymd) {
        regZzordymd(CK_NES, zzordymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(8)}
     * @param zzordymd The value of zzordymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_GreaterThan(String zzordymd) {
        regZzordymd(CK_GT, fRES(zzordymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(8)}
     * @param zzordymd The value of zzordymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_LessThan(String zzordymd) {
        regZzordymd(CK_LT, fRES(zzordymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(8)}
     * @param zzordymd The value of zzordymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_GreaterEqual(String zzordymd) {
        regZzordymd(CK_GE, fRES(zzordymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(8)}
     * @param zzordymd The value of zzordymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_LessEqual(String zzordymd) {
        regZzordymd(CK_LE, fRES(zzordymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {varchar(8)}
     * @param zzordymdList The collection of zzordymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_InScope(Collection<String> zzordymdList) {
        doSetZzordymd_InScope(zzordymdList);
    }

    protected void doSetZzordymd_InScope(Collection<String> zzordymdList) {
        regINS(CK_INS, cTL(zzordymdList), xgetCValueZzordymd(), "ZZORDYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {varchar(8)}
     * @param zzordymdList The collection of zzordymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_NotInScope(Collection<String> zzordymdList) {
        doSetZzordymd_NotInScope(zzordymdList);
    }

    protected void doSetZzordymd_NotInScope(Collection<String> zzordymdList) {
        regINS(CK_NINS, cTL(zzordymdList), xgetCValueZzordymd(), "ZZORDYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {varchar(8)} <br>
     * <pre>e.g. setZzordymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzordymd The value of zzordymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzordymd_LikeSearch(String zzordymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzordymd), xgetCValueZzordymd(), "ZZORDYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {varchar(8)}
     * @param zzordymd The value of zzordymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzordymd_NotLikeSearch(String zzordymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzordymd), xgetCValueZzordymd(), "ZZORDYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {varchar(8)}
     * @param zzordymd The value of zzordymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_PrefixSearch(String zzordymd) {
        setZzordymd_LikeSearch(zzordymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(8)}
     */
    public void setZzordymd_IsNull() { regZzordymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(8)}
     */
    public void setZzordymd_IsNullOrEmpty() { regZzordymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZORDYMD: {varchar(8)}
     */
    public void setZzordymd_IsNotNull() { regZzordymd(CK_ISNN, DOBJ); }

    protected void regZzordymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzordymd(), "ZZORDYMD"); }
    protected abstract ConditionValue xgetCValueZzordymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_Equal(String slpmrgtmg) {
        doSetSlpmrgtmg_Equal(fRES(slpmrgtmg));
    }

    protected void doSetSlpmrgtmg_Equal(String slpmrgtmg) {
        regSlpmrgtmg(CK_EQ, slpmrgtmg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_NotEqual(String slpmrgtmg) {
        doSetSlpmrgtmg_NotEqual(fRES(slpmrgtmg));
    }

    protected void doSetSlpmrgtmg_NotEqual(String slpmrgtmg) {
        regSlpmrgtmg(CK_NES, slpmrgtmg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_GreaterThan(String slpmrgtmg) {
        regSlpmrgtmg(CK_GT, fRES(slpmrgtmg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_LessThan(String slpmrgtmg) {
        regSlpmrgtmg(CK_LT, fRES(slpmrgtmg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_GreaterEqual(String slpmrgtmg) {
        regSlpmrgtmg(CK_GE, fRES(slpmrgtmg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_LessEqual(String slpmrgtmg) {
        regSlpmrgtmg(CK_LE, fRES(slpmrgtmg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmgList The collection of slpmrgtmg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_InScope(Collection<String> slpmrgtmgList) {
        doSetSlpmrgtmg_InScope(slpmrgtmgList);
    }

    protected void doSetSlpmrgtmg_InScope(Collection<String> slpmrgtmgList) {
        regINS(CK_INS, cTL(slpmrgtmgList), xgetCValueSlpmrgtmg(), "SLPMRGTMG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmgList The collection of slpmrgtmg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_NotInScope(Collection<String> slpmrgtmgList) {
        doSetSlpmrgtmg_NotInScope(slpmrgtmgList);
    }

    protected void doSetSlpmrgtmg_NotInScope(Collection<String> slpmrgtmgList) {
        regINS(CK_NINS, cTL(slpmrgtmgList), xgetCValueSlpmrgtmg(), "SLPMRGTMG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(30)} <br>
     * <pre>e.g. setSlpmrgtmg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slpmrgtmg The value of slpmrgtmg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlpmrgtmg_LikeSearch(String slpmrgtmg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slpmrgtmg), xgetCValueSlpmrgtmg(), "SLPMRGTMG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlpmrgtmg_NotLikeSearch(String slpmrgtmg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slpmrgtmg), xgetCValueSlpmrgtmg(), "SLPMRGTMG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_PrefixSearch(String slpmrgtmg) {
        setSlpmrgtmg_LikeSearch(slpmrgtmg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     */
    public void setSlpmrgtmg_IsNull() { regSlpmrgtmg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     */
    public void setSlpmrgtmg_IsNullOrEmpty() { regSlpmrgtmg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     */
    public void setSlpmrgtmg_IsNotNull() { regSlpmrgtmg(CK_ISNN, DOBJ); }

    protected void regSlpmrgtmg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlpmrgtmg(), "SLPMRGTMG"); }
    protected abstract ConditionValue xgetCValueSlpmrgtmg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {varchar(30)}
     * @param ordgr The value of ordgr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_Equal(String ordgr) {
        doSetOrdgr_Equal(fRES(ordgr));
    }

    protected void doSetOrdgr_Equal(String ordgr) {
        regOrdgr(CK_EQ, ordgr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {varchar(30)}
     * @param ordgr The value of ordgr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_NotEqual(String ordgr) {
        doSetOrdgr_NotEqual(fRES(ordgr));
    }

    protected void doSetOrdgr_NotEqual(String ordgr) {
        regOrdgr(CK_NES, ordgr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {varchar(30)}
     * @param ordgr The value of ordgr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_GreaterThan(String ordgr) {
        regOrdgr(CK_GT, fRES(ordgr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {varchar(30)}
     * @param ordgr The value of ordgr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_LessThan(String ordgr) {
        regOrdgr(CK_LT, fRES(ordgr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {varchar(30)}
     * @param ordgr The value of ordgr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_GreaterEqual(String ordgr) {
        regOrdgr(CK_GE, fRES(ordgr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {varchar(30)}
     * @param ordgr The value of ordgr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_LessEqual(String ordgr) {
        regOrdgr(CK_LE, fRES(ordgr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDGR: {varchar(30)}
     * @param ordgrList The collection of ordgr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_InScope(Collection<String> ordgrList) {
        doSetOrdgr_InScope(ordgrList);
    }

    protected void doSetOrdgr_InScope(Collection<String> ordgrList) {
        regINS(CK_INS, cTL(ordgrList), xgetCValueOrdgr(), "ORDGR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDGR: {varchar(30)}
     * @param ordgrList The collection of ordgr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_NotInScope(Collection<String> ordgrList) {
        doSetOrdgr_NotInScope(ordgrList);
    }

    protected void doSetOrdgr_NotInScope(Collection<String> ordgrList) {
        regINS(CK_NINS, cTL(ordgrList), xgetCValueOrdgr(), "ORDGR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDGR: {varchar(30)} <br>
     * <pre>e.g. setOrdgr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ordgr The value of ordgr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrdgr_LikeSearch(String ordgr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ordgr), xgetCValueOrdgr(), "ORDGR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDGR: {varchar(30)}
     * @param ordgr The value of ordgr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrdgr_NotLikeSearch(String ordgr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ordgr), xgetCValueOrdgr(), "ORDGR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDGR: {varchar(30)}
     * @param ordgr The value of ordgr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_PrefixSearch(String ordgr) {
        setOrdgr_LikeSearch(ordgr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDGR: {varchar(30)}
     */
    public void setOrdgr_IsNull() { regOrdgr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDGR: {varchar(30)}
     */
    public void setOrdgr_IsNullOrEmpty() { regOrdgr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDGR: {varchar(30)}
     */
    public void setOrdgr_IsNotNull() { regOrdgr(CK_ISNN, DOBJ); }

    protected void regOrdgr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdgr(), "ORDGR"); }
    protected abstract ConditionValue xgetCValueOrdgr();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * S: {bigint(19)}
     * @param s The value of s as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setS_Equal(Long s) {
        doSetS_Equal(s);
    }

    protected void doSetS_Equal(Long s) {
        regS(CK_EQ, s);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * S: {bigint(19)}
     * @param s The value of s as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setS_NotEqual(Long s) {
        doSetS_NotEqual(s);
    }

    protected void doSetS_NotEqual(Long s) {
        regS(CK_NES, s);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * S: {bigint(19)}
     * @param s The value of s as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setS_GreaterThan(Long s) {
        regS(CK_GT, s);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * S: {bigint(19)}
     * @param s The value of s as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setS_LessThan(Long s) {
        regS(CK_LT, s);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * S: {bigint(19)}
     * @param s The value of s as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setS_GreaterEqual(Long s) {
        regS(CK_GE, s);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * S: {bigint(19)}
     * @param s The value of s as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setS_LessEqual(Long s) {
        regS(CK_LE, s);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * S: {bigint(19)}
     * @param minNumber The min number of s. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of s. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setS_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueS(), "S", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * S: {bigint(19)}
     * @param sList The collection of s as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS_InScope(Collection<Long> sList) {
        doSetS_InScope(sList);
    }

    protected void doSetS_InScope(Collection<Long> sList) {
        regINS(CK_INS, cTL(sList), xgetCValueS(), "S");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * S: {bigint(19)}
     * @param sList The collection of s as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS_NotInScope(Collection<Long> sList) {
        doSetS_NotInScope(sList);
    }

    protected void doSetS_NotInScope(Collection<Long> sList) {
        regINS(CK_NINS, cTL(sList), xgetCValueS(), "S");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * S: {bigint(19)}
     */
    public void setS_IsNull() { regS(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * S: {bigint(19)}
     */
    public void setS_IsNotNull() { regS(CK_ISNN, DOBJ); }

    protected void regS(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueS(), "S"); }
    protected abstract ConditionValue xgetCValueS();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * H: {bigint(19)}
     * @param h The value of h as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setH_Equal(Long h) {
        doSetH_Equal(h);
    }

    protected void doSetH_Equal(Long h) {
        regH(CK_EQ, h);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * H: {bigint(19)}
     * @param h The value of h as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setH_NotEqual(Long h) {
        doSetH_NotEqual(h);
    }

    protected void doSetH_NotEqual(Long h) {
        regH(CK_NES, h);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * H: {bigint(19)}
     * @param h The value of h as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setH_GreaterThan(Long h) {
        regH(CK_GT, h);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * H: {bigint(19)}
     * @param h The value of h as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setH_LessThan(Long h) {
        regH(CK_LT, h);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * H: {bigint(19)}
     * @param h The value of h as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setH_GreaterEqual(Long h) {
        regH(CK_GE, h);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * H: {bigint(19)}
     * @param h The value of h as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setH_LessEqual(Long h) {
        regH(CK_LE, h);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * H: {bigint(19)}
     * @param minNumber The min number of h. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of h. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setH_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueH(), "H", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * H: {bigint(19)}
     * @param hList The collection of h as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setH_InScope(Collection<Long> hList) {
        doSetH_InScope(hList);
    }

    protected void doSetH_InScope(Collection<Long> hList) {
        regINS(CK_INS, cTL(hList), xgetCValueH(), "H");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * H: {bigint(19)}
     * @param hList The collection of h as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setH_NotInScope(Collection<Long> hList) {
        doSetH_NotInScope(hList);
    }

    protected void doSetH_NotInScope(Collection<Long> hList) {
        regINS(CK_NINS, cTL(hList), xgetCValueH(), "H");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * H: {bigint(19)}
     */
    public void setH_IsNull() { regH(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * H: {bigint(19)}
     */
    public void setH_IsNotNull() { regH(CK_ISNN, DOBJ); }

    protected void regH(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueH(), "H"); }
    protected abstract ConditionValue xgetCValueH();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * M: {bigint(19)}
     * @param m The value of m as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setM_Equal(Long m) {
        doSetM_Equal(m);
    }

    protected void doSetM_Equal(Long m) {
        regM(CK_EQ, m);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * M: {bigint(19)}
     * @param m The value of m as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setM_NotEqual(Long m) {
        doSetM_NotEqual(m);
    }

    protected void doSetM_NotEqual(Long m) {
        regM(CK_NES, m);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * M: {bigint(19)}
     * @param m The value of m as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setM_GreaterThan(Long m) {
        regM(CK_GT, m);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * M: {bigint(19)}
     * @param m The value of m as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setM_LessThan(Long m) {
        regM(CK_LT, m);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * M: {bigint(19)}
     * @param m The value of m as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setM_GreaterEqual(Long m) {
        regM(CK_GE, m);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * M: {bigint(19)}
     * @param m The value of m as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setM_LessEqual(Long m) {
        regM(CK_LE, m);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * M: {bigint(19)}
     * @param minNumber The min number of m. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of m. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setM_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueM(), "M", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * M: {bigint(19)}
     * @param mList The collection of m as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setM_InScope(Collection<Long> mList) {
        doSetM_InScope(mList);
    }

    protected void doSetM_InScope(Collection<Long> mList) {
        regINS(CK_INS, cTL(mList), xgetCValueM(), "M");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * M: {bigint(19)}
     * @param mList The collection of m as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setM_NotInScope(Collection<Long> mList) {
        doSetM_NotInScope(mList);
    }

    protected void doSetM_NotInScope(Collection<Long> mList) {
        regINS(CK_NINS, cTL(mList), xgetCValueM(), "M");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * M: {bigint(19)}
     */
    public void setM_IsNull() { regM(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * M: {bigint(19)}
     */
    public void setM_IsNotNull() { regM(CK_ISNN, DOBJ); }

    protected void regM(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueM(), "M"); }
    protected abstract ConditionValue xgetCValueM();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_Equal(String srymd) {
        doSetSrymd_Equal(fRES(srymd));
    }

    protected void doSetSrymd_Equal(String srymd) {
        regSrymd(CK_EQ, srymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_NotEqual(String srymd) {
        doSetSrymd_NotEqual(fRES(srymd));
    }

    protected void doSetSrymd_NotEqual(String srymd) {
        regSrymd(CK_NES, srymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_GreaterThan(String srymd) {
        regSrymd(CK_GT, fRES(srymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_LessThan(String srymd) {
        regSrymd(CK_LT, fRES(srymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_GreaterEqual(String srymd) {
        regSrymd(CK_GE, fRES(srymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_LessEqual(String srymd) {
        regSrymd(CK_LE, fRES(srymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymdList The collection of srymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_InScope(Collection<String> srymdList) {
        doSetSrymd_InScope(srymdList);
    }

    protected void doSetSrymd_InScope(Collection<String> srymdList) {
        regINS(CK_INS, cTL(srymdList), xgetCValueSrymd(), "SRYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymdList The collection of srymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_NotInScope(Collection<String> srymdList) {
        doSetSrymd_NotInScope(srymdList);
    }

    protected void doSetSrymd_NotInScope(Collection<String> srymdList) {
        regINS(CK_NINS, cTL(srymdList), xgetCValueSrymd(), "SRYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRYMD: {varchar(8)} <br>
     * <pre>e.g. setSrymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srymd The value of srymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrymd_LikeSearch(String srymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srymd), xgetCValueSrymd(), "SRYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrymd_NotLikeSearch(String srymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srymd), xgetCValueSrymd(), "SRYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRYMD: {varchar(8)}
     * @param srymd The value of srymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_PrefixSearch(String srymd) {
        setSrymd_LikeSearch(srymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     */
    public void setSrymd_IsNull() { regSrymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     */
    public void setSrymd_IsNullOrEmpty() { regSrymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRYMD: {varchar(8)}
     */
    public void setSrymd_IsNotNull() { regSrymd(CK_ISNN, DOBJ); }

    protected void regSrymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrymd(), "SRYMD"); }
    protected abstract ConditionValue xgetCValueSrymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
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
     * RLYBSCD: {varchar(30)}
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
     * RLYBSCD: {varchar(30)}
     * @param rlybscd The value of rlybscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_GreaterThan(String rlybscd) {
        regRlybscd(CK_GT, fRES(rlybscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     * @param rlybscd The value of rlybscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_LessThan(String rlybscd) {
        regRlybscd(CK_LT, fRES(rlybscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     * @param rlybscd The value of rlybscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_GreaterEqual(String rlybscd) {
        regRlybscd(CK_GE, fRES(rlybscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     * @param rlybscd The value of rlybscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_LessEqual(String rlybscd) {
        regRlybscd(CK_LE, fRES(rlybscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(30)}
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
     * RLYBSCD: {varchar(30)}
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
     * RLYBSCD: {varchar(30)} <br>
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
     * RLYBSCD: {varchar(30)}
     * @param rlybscd The value of rlybscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlybscd_NotLikeSearch(String rlybscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlybscd), xgetCValueRlybscd(), "RLYBSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(30)}
     * @param rlybscd The value of rlybscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_PrefixSearch(String rlybscd) {
        setRlybscd_LikeSearch(rlybscd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     */
    public void setRlybscd_IsNull() { regRlybscd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     */
    public void setRlybscd_IsNullOrEmpty() { regRlybscd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     */
    public void setRlybscd_IsNotNull() { regRlybscd(CK_ISNN, DOBJ); }

    protected void regRlybscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlybscd(), "RLYBSCD"); }
    protected abstract ConditionValue xgetCValueRlybscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAH1: {varchar(30)}
     * @param keepareah1 The value of keepareah1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah1_Equal(String keepareah1) {
        doSetKeepareah1_Equal(fRES(keepareah1));
    }

    protected void doSetKeepareah1_Equal(String keepareah1) {
        regKeepareah1(CK_EQ, keepareah1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAH1: {varchar(30)}
     * @param keepareah1 The value of keepareah1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah1_NotEqual(String keepareah1) {
        doSetKeepareah1_NotEqual(fRES(keepareah1));
    }

    protected void doSetKeepareah1_NotEqual(String keepareah1) {
        regKeepareah1(CK_NES, keepareah1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAH1: {varchar(30)}
     * @param keepareah1 The value of keepareah1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah1_GreaterThan(String keepareah1) {
        regKeepareah1(CK_GT, fRES(keepareah1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAH1: {varchar(30)}
     * @param keepareah1 The value of keepareah1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah1_LessThan(String keepareah1) {
        regKeepareah1(CK_LT, fRES(keepareah1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAH1: {varchar(30)}
     * @param keepareah1 The value of keepareah1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah1_GreaterEqual(String keepareah1) {
        regKeepareah1(CK_GE, fRES(keepareah1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAH1: {varchar(30)}
     * @param keepareah1 The value of keepareah1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah1_LessEqual(String keepareah1) {
        regKeepareah1(CK_LE, fRES(keepareah1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KEEPAREAH1: {varchar(30)}
     * @param keepareah1List The collection of keepareah1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah1_InScope(Collection<String> keepareah1List) {
        doSetKeepareah1_InScope(keepareah1List);
    }

    protected void doSetKeepareah1_InScope(Collection<String> keepareah1List) {
        regINS(CK_INS, cTL(keepareah1List), xgetCValueKeepareah1(), "KEEPAREAH1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KEEPAREAH1: {varchar(30)}
     * @param keepareah1List The collection of keepareah1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah1_NotInScope(Collection<String> keepareah1List) {
        doSetKeepareah1_NotInScope(keepareah1List);
    }

    protected void doSetKeepareah1_NotInScope(Collection<String> keepareah1List) {
        regINS(CK_NINS, cTL(keepareah1List), xgetCValueKeepareah1(), "KEEPAREAH1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KEEPAREAH1: {varchar(30)} <br>
     * <pre>e.g. setKeepareah1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param keepareah1 The value of keepareah1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKeepareah1_LikeSearch(String keepareah1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(keepareah1), xgetCValueKeepareah1(), "KEEPAREAH1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KEEPAREAH1: {varchar(30)}
     * @param keepareah1 The value of keepareah1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKeepareah1_NotLikeSearch(String keepareah1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(keepareah1), xgetCValueKeepareah1(), "KEEPAREAH1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KEEPAREAH1: {varchar(30)}
     * @param keepareah1 The value of keepareah1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah1_PrefixSearch(String keepareah1) {
        setKeepareah1_LikeSearch(keepareah1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KEEPAREAH1: {varchar(30)}
     */
    public void setKeepareah1_IsNull() { regKeepareah1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KEEPAREAH1: {varchar(30)}
     */
    public void setKeepareah1_IsNullOrEmpty() { regKeepareah1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KEEPAREAH1: {varchar(30)}
     */
    public void setKeepareah1_IsNotNull() { regKeepareah1(CK_ISNN, DOBJ); }

    protected void regKeepareah1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKeepareah1(), "KEEPAREAH1"); }
    protected abstract ConditionValue xgetCValueKeepareah1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(30)}
     * @param slptyp The value of slptyp as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_Equal(String slptyp) {
        doSetSlptyp_Equal(fRES(slptyp));
    }

    protected void doSetSlptyp_Equal(String slptyp) {
        regSlptyp(CK_EQ, slptyp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(30)}
     * @param slptyp The value of slptyp as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_NotEqual(String slptyp) {
        doSetSlptyp_NotEqual(fRES(slptyp));
    }

    protected void doSetSlptyp_NotEqual(String slptyp) {
        regSlptyp(CK_NES, slptyp);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(30)}
     * @param slptyp The value of slptyp as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_GreaterThan(String slptyp) {
        regSlptyp(CK_GT, fRES(slptyp));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(30)}
     * @param slptyp The value of slptyp as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_LessThan(String slptyp) {
        regSlptyp(CK_LT, fRES(slptyp));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(30)}
     * @param slptyp The value of slptyp as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_GreaterEqual(String slptyp) {
        regSlptyp(CK_GE, fRES(slptyp));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(30)}
     * @param slptyp The value of slptyp as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_LessEqual(String slptyp) {
        regSlptyp(CK_LE, fRES(slptyp));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPTYP: {varchar(30)}
     * @param slptypList The collection of slptyp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_InScope(Collection<String> slptypList) {
        doSetSlptyp_InScope(slptypList);
    }

    protected void doSetSlptyp_InScope(Collection<String> slptypList) {
        regINS(CK_INS, cTL(slptypList), xgetCValueSlptyp(), "SLPTYP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPTYP: {varchar(30)}
     * @param slptypList The collection of slptyp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_NotInScope(Collection<String> slptypList) {
        doSetSlptyp_NotInScope(slptypList);
    }

    protected void doSetSlptyp_NotInScope(Collection<String> slptypList) {
        regINS(CK_NINS, cTL(slptypList), xgetCValueSlptyp(), "SLPTYP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPTYP: {varchar(30)} <br>
     * <pre>e.g. setSlptyp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slptyp The value of slptyp as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlptyp_LikeSearch(String slptyp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slptyp), xgetCValueSlptyp(), "SLPTYP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPTYP: {varchar(30)}
     * @param slptyp The value of slptyp as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlptyp_NotLikeSearch(String slptyp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slptyp), xgetCValueSlptyp(), "SLPTYP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPTYP: {varchar(30)}
     * @param slptyp The value of slptyp as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_PrefixSearch(String slptyp) {
        setSlptyp_LikeSearch(slptyp, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(30)}
     */
    public void setSlptyp_IsNull() { regSlptyp(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(30)}
     */
    public void setSlptyp_IsNullOrEmpty() { regSlptyp(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLPTYP: {varchar(30)}
     */
    public void setSlptyp_IsNotNull() { regSlptyp(CK_ISNN, DOBJ); }

    protected void regSlptyp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlptyp(), "SLPTYP"); }
    protected abstract ConditionValue xgetCValueSlptyp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_Equal(String cmpcd) {
        doSetCmpcd_Equal(fRES(cmpcd));
    }

    protected void doSetCmpcd_Equal(String cmpcd) {
        regCmpcd(CK_EQ, cmpcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_NotEqual(String cmpcd) {
        doSetCmpcd_NotEqual(fRES(cmpcd));
    }

    protected void doSetCmpcd_NotEqual(String cmpcd) {
        regCmpcd(CK_NES, cmpcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_GreaterThan(String cmpcd) {
        regCmpcd(CK_GT, fRES(cmpcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_LessThan(String cmpcd) {
        regCmpcd(CK_LT, fRES(cmpcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_GreaterEqual(String cmpcd) {
        regCmpcd(CK_GE, fRES(cmpcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_LessEqual(String cmpcd) {
        regCmpcd(CK_LE, fRES(cmpcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcdList The collection of cmpcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_InScope(Collection<String> cmpcdList) {
        doSetCmpcd_InScope(cmpcdList);
    }

    protected void doSetCmpcd_InScope(Collection<String> cmpcdList) {
        regINS(CK_INS, cTL(cmpcdList), xgetCValueCmpcd(), "CMPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcdList The collection of cmpcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_NotInScope(Collection<String> cmpcdList) {
        doSetCmpcd_NotInScope(cmpcdList);
    }

    protected void doSetCmpcd_NotInScope(Collection<String> cmpcdList) {
        regINS(CK_NINS, cTL(cmpcdList), xgetCValueCmpcd(), "CMPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMPCD: {varchar(30)} <br>
     * <pre>e.g. setCmpcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cmpcd The value of cmpcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCmpcd_LikeSearch(String cmpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cmpcd), xgetCValueCmpcd(), "CMPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCmpcd_NotLikeSearch(String cmpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cmpcd), xgetCValueCmpcd(), "CMPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_PrefixSearch(String cmpcd) {
        setCmpcd_LikeSearch(cmpcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     */
    public void setCmpcd_IsNull() { regCmpcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     */
    public void setCmpcd_IsNullOrEmpty() { regCmpcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     */
    public void setCmpcd_IsNotNull() { regCmpcd(CK_ISNN, DOBJ); }

    protected void regCmpcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCmpcd(), "CMPCD"); }
    protected abstract ConditionValue xgetCValueCmpcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {varchar(30)}
     * @param slpno The value of slpno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_Equal(String slpno) {
        doSetSlpno_Equal(fRES(slpno));
    }

    protected void doSetSlpno_Equal(String slpno) {
        regSlpno(CK_EQ, slpno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {varchar(30)}
     * @param slpno The value of slpno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_NotEqual(String slpno) {
        doSetSlpno_NotEqual(fRES(slpno));
    }

    protected void doSetSlpno_NotEqual(String slpno) {
        regSlpno(CK_NES, slpno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {varchar(30)}
     * @param slpno The value of slpno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_GreaterThan(String slpno) {
        regSlpno(CK_GT, fRES(slpno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {varchar(30)}
     * @param slpno The value of slpno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_LessThan(String slpno) {
        regSlpno(CK_LT, fRES(slpno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {varchar(30)}
     * @param slpno The value of slpno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_GreaterEqual(String slpno) {
        regSlpno(CK_GE, fRES(slpno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {varchar(30)}
     * @param slpno The value of slpno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_LessEqual(String slpno) {
        regSlpno(CK_LE, fRES(slpno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPNO: {varchar(30)}
     * @param slpnoList The collection of slpno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_InScope(Collection<String> slpnoList) {
        doSetSlpno_InScope(slpnoList);
    }

    protected void doSetSlpno_InScope(Collection<String> slpnoList) {
        regINS(CK_INS, cTL(slpnoList), xgetCValueSlpno(), "SLPNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPNO: {varchar(30)}
     * @param slpnoList The collection of slpno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_NotInScope(Collection<String> slpnoList) {
        doSetSlpno_NotInScope(slpnoList);
    }

    protected void doSetSlpno_NotInScope(Collection<String> slpnoList) {
        regINS(CK_NINS, cTL(slpnoList), xgetCValueSlpno(), "SLPNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPNO: {varchar(30)} <br>
     * <pre>e.g. setSlpno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slpno The value of slpno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlpno_LikeSearch(String slpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slpno), xgetCValueSlpno(), "SLPNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPNO: {varchar(30)}
     * @param slpno The value of slpno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlpno_NotLikeSearch(String slpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slpno), xgetCValueSlpno(), "SLPNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPNO: {varchar(30)}
     * @param slpno The value of slpno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_PrefixSearch(String slpno) {
        setSlpno_LikeSearch(slpno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLPNO: {varchar(30)}
     */
    public void setSlpno_IsNull() { regSlpno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLPNO: {varchar(30)}
     */
    public void setSlpno_IsNullOrEmpty() { regSlpno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLPNO: {varchar(30)}
     */
    public void setSlpno_IsNotNull() { regSlpno(CK_ISNN, DOBJ); }

    protected void regSlpno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlpno(), "SLPNO"); }
    protected abstract ConditionValue xgetCValueSlpno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_Equal(String slediv) {
        doSetSlediv_Equal(fRES(slediv));
    }

    protected void doSetSlediv_Equal(String slediv) {
        regSlediv(CK_EQ, slediv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_NotEqual(String slediv) {
        doSetSlediv_NotEqual(fRES(slediv));
    }

    protected void doSetSlediv_NotEqual(String slediv) {
        regSlediv(CK_NES, slediv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_GreaterThan(String slediv) {
        regSlediv(CK_GT, fRES(slediv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_LessThan(String slediv) {
        regSlediv(CK_LT, fRES(slediv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_GreaterEqual(String slediv) {
        regSlediv(CK_GE, fRES(slediv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_LessEqual(String slediv) {
        regSlediv(CK_LE, fRES(slediv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param sledivList The collection of slediv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_InScope(Collection<String> sledivList) {
        doSetSlediv_InScope(sledivList);
    }

    protected void doSetSlediv_InScope(Collection<String> sledivList) {
        regINS(CK_INS, cTL(sledivList), xgetCValueSlediv(), "SLEDIV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param sledivList The collection of slediv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_NotInScope(Collection<String> sledivList) {
        doSetSlediv_NotInScope(sledivList);
    }

    protected void doSetSlediv_NotInScope(Collection<String> sledivList) {
        regINS(CK_NINS, cTL(sledivList), xgetCValueSlediv(), "SLEDIV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(30)} <br>
     * <pre>e.g. setSlediv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slediv The value of slediv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlediv_LikeSearch(String slediv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slediv), xgetCValueSlediv(), "SLEDIV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlediv_NotLikeSearch(String slediv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slediv), xgetCValueSlediv(), "SLEDIV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_PrefixSearch(String slediv) {
        setSlediv_LikeSearch(slediv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     */
    public void setSlediv_IsNull() { regSlediv(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     */
    public void setSlediv_IsNullOrEmpty() { regSlediv(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     */
    public void setSlediv_IsNotNull() { regSlediv(CK_ISNN, DOBJ); }

    protected void regSlediv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlediv(), "SLEDIV"); }
    protected abstract ConditionValue xgetCValueSlediv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_Equal(String cngprtslpno) {
        doSetCngprtslpno_Equal(fRES(cngprtslpno));
    }

    protected void doSetCngprtslpno_Equal(String cngprtslpno) {
        regCngprtslpno(CK_EQ, cngprtslpno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_NotEqual(String cngprtslpno) {
        doSetCngprtslpno_NotEqual(fRES(cngprtslpno));
    }

    protected void doSetCngprtslpno_NotEqual(String cngprtslpno) {
        regCngprtslpno(CK_NES, cngprtslpno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_GreaterThan(String cngprtslpno) {
        regCngprtslpno(CK_GT, fRES(cngprtslpno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_LessThan(String cngprtslpno) {
        regCngprtslpno(CK_LT, fRES(cngprtslpno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_GreaterEqual(String cngprtslpno) {
        regCngprtslpno(CK_GE, fRES(cngprtslpno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_LessEqual(String cngprtslpno) {
        regCngprtslpno(CK_LE, fRES(cngprtslpno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpnoList The collection of cngprtslpno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_InScope(Collection<String> cngprtslpnoList) {
        doSetCngprtslpno_InScope(cngprtslpnoList);
    }

    protected void doSetCngprtslpno_InScope(Collection<String> cngprtslpnoList) {
        regINS(CK_INS, cTL(cngprtslpnoList), xgetCValueCngprtslpno(), "CNGPRTSLPNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpnoList The collection of cngprtslpno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_NotInScope(Collection<String> cngprtslpnoList) {
        doSetCngprtslpno_NotInScope(cngprtslpnoList);
    }

    protected void doSetCngprtslpno_NotInScope(Collection<String> cngprtslpnoList) {
        regINS(CK_NINS, cTL(cngprtslpnoList), xgetCValueCngprtslpno(), "CNGPRTSLPNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)} <br>
     * <pre>e.g. setCngprtslpno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cngprtslpno The value of cngprtslpno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCngprtslpno_LikeSearch(String cngprtslpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cngprtslpno), xgetCValueCngprtslpno(), "CNGPRTSLPNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCngprtslpno_NotLikeSearch(String cngprtslpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cngprtslpno), xgetCValueCngprtslpno(), "CNGPRTSLPNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_PrefixSearch(String cngprtslpno) {
        setCngprtslpno_LikeSearch(cngprtslpno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     */
    public void setCngprtslpno_IsNull() { regCngprtslpno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     */
    public void setCngprtslpno_IsNullOrEmpty() { regCngprtslpno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     */
    public void setCngprtslpno_IsNotNull() { regCngprtslpno(CK_ISNN, DOBJ); }

    protected void regCngprtslpno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCngprtslpno(), "CNGPRTSLPNO"); }
    protected abstract ConditionValue xgetCValueCngprtslpno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_Equal(String spplymd) {
        doSetSpplymd_Equal(fRES(spplymd));
    }

    protected void doSetSpplymd_Equal(String spplymd) {
        regSpplymd(CK_EQ, spplymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_NotEqual(String spplymd) {
        doSetSpplymd_NotEqual(fRES(spplymd));
    }

    protected void doSetSpplymd_NotEqual(String spplymd) {
        regSpplymd(CK_NES, spplymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_GreaterThan(String spplymd) {
        regSpplymd(CK_GT, fRES(spplymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_LessThan(String spplymd) {
        regSpplymd(CK_LT, fRES(spplymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_GreaterEqual(String spplymd) {
        regSpplymd(CK_GE, fRES(spplymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_LessEqual(String spplymd) {
        regSpplymd(CK_LE, fRES(spplymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymdList The collection of spplymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_InScope(Collection<String> spplymdList) {
        doSetSpplymd_InScope(spplymdList);
    }

    protected void doSetSpplymd_InScope(Collection<String> spplymdList) {
        regINS(CK_INS, cTL(spplymdList), xgetCValueSpplymd(), "SPPLYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymdList The collection of spplymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_NotInScope(Collection<String> spplymdList) {
        doSetSpplymd_NotInScope(spplymdList);
    }

    protected void doSetSpplymd_NotInScope(Collection<String> spplymdList) {
        regINS(CK_NINS, cTL(spplymdList), xgetCValueSpplymd(), "SPPLYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPPLYMD: {varchar(8)} <br>
     * <pre>e.g. setSpplymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spplymd The value of spplymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpplymd_LikeSearch(String spplymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spplymd), xgetCValueSpplymd(), "SPPLYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpplymd_NotLikeSearch(String spplymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spplymd), xgetCValueSpplymd(), "SPPLYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_PrefixSearch(String spplymd) {
        setSpplymd_LikeSearch(spplymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     */
    public void setSpplymd_IsNull() { regSpplymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     */
    public void setSpplymd_IsNullOrEmpty() { regSpplymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     */
    public void setSpplymd_IsNotNull() { regSpplymd(CK_ISNN, DOBJ); }

    protected void regSpplymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpplymd(), "SPPLYMD"); }
    protected abstract ConditionValue xgetCValueSpplymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_Equal(String cggdid) {
        doSetCggdid_Equal(fRES(cggdid));
    }

    protected void doSetCggdid_Equal(String cggdid) {
        regCggdid(CK_EQ, cggdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_NotEqual(String cggdid) {
        doSetCggdid_NotEqual(fRES(cggdid));
    }

    protected void doSetCggdid_NotEqual(String cggdid) {
        regCggdid(CK_NES, cggdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_GreaterThan(String cggdid) {
        regCggdid(CK_GT, fRES(cggdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_LessThan(String cggdid) {
        regCggdid(CK_LT, fRES(cggdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_GreaterEqual(String cggdid) {
        regCggdid(CK_GE, fRES(cggdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_LessEqual(String cggdid) {
        regCggdid(CK_LE, fRES(cggdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdidList The collection of cggdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_InScope(Collection<String> cggdidList) {
        doSetCggdid_InScope(cggdidList);
    }

    protected void doSetCggdid_InScope(Collection<String> cggdidList) {
        regINS(CK_INS, cTL(cggdidList), xgetCValueCggdid(), "CGGDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdidList The collection of cggdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_NotInScope(Collection<String> cggdidList) {
        doSetCggdid_NotInScope(cggdidList);
    }

    protected void doSetCggdid_NotInScope(Collection<String> cggdidList) {
        regINS(CK_NINS, cTL(cggdidList), xgetCValueCggdid(), "CGGDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)} <br>
     * <pre>e.g. setCggdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cggdid The value of cggdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCggdid_LikeSearch(String cggdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cggdid), xgetCValueCggdid(), "CGGDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCggdid_NotLikeSearch(String cggdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cggdid), xgetCValueCggdid(), "CGGDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_PrefixSearch(String cggdid) {
        setCggdid_LikeSearch(cggdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     */
    public void setCggdid_IsNull() { regCggdid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     */
    public void setCggdid_IsNullOrEmpty() { regCggdid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     */
    public void setCggdid_IsNotNull() { regCggdid(CK_ISNN, DOBJ); }

    protected void regCggdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCggdid(), "CGGDID"); }
    protected abstract ConditionValue xgetCValueCggdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAH2: {varchar(30)}
     * @param keepareah2 The value of keepareah2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah2_Equal(String keepareah2) {
        doSetKeepareah2_Equal(fRES(keepareah2));
    }

    protected void doSetKeepareah2_Equal(String keepareah2) {
        regKeepareah2(CK_EQ, keepareah2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAH2: {varchar(30)}
     * @param keepareah2 The value of keepareah2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah2_NotEqual(String keepareah2) {
        doSetKeepareah2_NotEqual(fRES(keepareah2));
    }

    protected void doSetKeepareah2_NotEqual(String keepareah2) {
        regKeepareah2(CK_NES, keepareah2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAH2: {varchar(30)}
     * @param keepareah2 The value of keepareah2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah2_GreaterThan(String keepareah2) {
        regKeepareah2(CK_GT, fRES(keepareah2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAH2: {varchar(30)}
     * @param keepareah2 The value of keepareah2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah2_LessThan(String keepareah2) {
        regKeepareah2(CK_LT, fRES(keepareah2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAH2: {varchar(30)}
     * @param keepareah2 The value of keepareah2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah2_GreaterEqual(String keepareah2) {
        regKeepareah2(CK_GE, fRES(keepareah2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAH2: {varchar(30)}
     * @param keepareah2 The value of keepareah2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah2_LessEqual(String keepareah2) {
        regKeepareah2(CK_LE, fRES(keepareah2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KEEPAREAH2: {varchar(30)}
     * @param keepareah2List The collection of keepareah2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah2_InScope(Collection<String> keepareah2List) {
        doSetKeepareah2_InScope(keepareah2List);
    }

    protected void doSetKeepareah2_InScope(Collection<String> keepareah2List) {
        regINS(CK_INS, cTL(keepareah2List), xgetCValueKeepareah2(), "KEEPAREAH2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KEEPAREAH2: {varchar(30)}
     * @param keepareah2List The collection of keepareah2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah2_NotInScope(Collection<String> keepareah2List) {
        doSetKeepareah2_NotInScope(keepareah2List);
    }

    protected void doSetKeepareah2_NotInScope(Collection<String> keepareah2List) {
        regINS(CK_NINS, cTL(keepareah2List), xgetCValueKeepareah2(), "KEEPAREAH2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KEEPAREAH2: {varchar(30)} <br>
     * <pre>e.g. setKeepareah2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param keepareah2 The value of keepareah2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKeepareah2_LikeSearch(String keepareah2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(keepareah2), xgetCValueKeepareah2(), "KEEPAREAH2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KEEPAREAH2: {varchar(30)}
     * @param keepareah2 The value of keepareah2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKeepareah2_NotLikeSearch(String keepareah2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(keepareah2), xgetCValueKeepareah2(), "KEEPAREAH2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KEEPAREAH2: {varchar(30)}
     * @param keepareah2 The value of keepareah2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepareah2_PrefixSearch(String keepareah2) {
        setKeepareah2_LikeSearch(keepareah2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KEEPAREAH2: {varchar(30)}
     */
    public void setKeepareah2_IsNull() { regKeepareah2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KEEPAREAH2: {varchar(30)}
     */
    public void setKeepareah2_IsNullOrEmpty() { regKeepareah2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KEEPAREAH2: {varchar(30)}
     */
    public void setKeepareah2_IsNotNull() { regKeepareah2(CK_ISNN, DOBJ); }

    protected void regKeepareah2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKeepareah2(), "KEEPAREAH2"); }
    protected abstract ConditionValue xgetCValueKeepareah2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     * @param zzmatnr The value of zzmatnr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_Equal(String zzmatnr) {
        doSetZzmatnr_Equal(fRES(zzmatnr));
    }

    protected void doSetZzmatnr_Equal(String zzmatnr) {
        regZzmatnr(CK_EQ, zzmatnr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     * @param zzmatnr The value of zzmatnr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_NotEqual(String zzmatnr) {
        doSetZzmatnr_NotEqual(fRES(zzmatnr));
    }

    protected void doSetZzmatnr_NotEqual(String zzmatnr) {
        regZzmatnr(CK_NES, zzmatnr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     * @param zzmatnr The value of zzmatnr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_GreaterThan(String zzmatnr) {
        regZzmatnr(CK_GT, fRES(zzmatnr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     * @param zzmatnr The value of zzmatnr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_LessThan(String zzmatnr) {
        regZzmatnr(CK_LT, fRES(zzmatnr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     * @param zzmatnr The value of zzmatnr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_GreaterEqual(String zzmatnr) {
        regZzmatnr(CK_GE, fRES(zzmatnr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     * @param zzmatnr The value of zzmatnr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_LessEqual(String zzmatnr) {
        regZzmatnr(CK_LE, fRES(zzmatnr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZMATNR: {varchar(30)}
     * @param zzmatnrList The collection of zzmatnr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_InScope(Collection<String> zzmatnrList) {
        doSetZzmatnr_InScope(zzmatnrList);
    }

    protected void doSetZzmatnr_InScope(Collection<String> zzmatnrList) {
        regINS(CK_INS, cTL(zzmatnrList), xgetCValueZzmatnr(), "ZZMATNR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZMATNR: {varchar(30)}
     * @param zzmatnrList The collection of zzmatnr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_NotInScope(Collection<String> zzmatnrList) {
        doSetZzmatnr_NotInScope(zzmatnrList);
    }

    protected void doSetZzmatnr_NotInScope(Collection<String> zzmatnrList) {
        regINS(CK_NINS, cTL(zzmatnrList), xgetCValueZzmatnr(), "ZZMATNR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNR: {varchar(30)} <br>
     * <pre>e.g. setZzmatnr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzmatnr The value of zzmatnr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzmatnr_LikeSearch(String zzmatnr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzmatnr), xgetCValueZzmatnr(), "ZZMATNR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNR: {varchar(30)}
     * @param zzmatnr The value of zzmatnr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzmatnr_NotLikeSearch(String zzmatnr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzmatnr), xgetCValueZzmatnr(), "ZZMATNR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNR: {varchar(30)}
     * @param zzmatnr The value of zzmatnr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_PrefixSearch(String zzmatnr) {
        setZzmatnr_LikeSearch(zzmatnr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     */
    public void setZzmatnr_IsNull() { regZzmatnr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     */
    public void setZzmatnr_IsNullOrEmpty() { regZzmatnr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZMATNR: {varchar(30)}
     */
    public void setZzmatnr_IsNotNull() { regZzmatnr(CK_ISNN, DOBJ); }

    protected void regZzmatnr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzmatnr(), "ZZMATNR"); }
    protected abstract ConditionValue xgetCValueZzmatnr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_Equal(String boxno) {
        doSetBoxno_Equal(fRES(boxno));
    }

    protected void doSetBoxno_Equal(String boxno) {
        regBoxno(CK_EQ, boxno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_NotEqual(String boxno) {
        doSetBoxno_NotEqual(fRES(boxno));
    }

    protected void doSetBoxno_NotEqual(String boxno) {
        regBoxno(CK_NES, boxno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_GreaterThan(String boxno) {
        regBoxno(CK_GT, fRES(boxno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_LessThan(String boxno) {
        regBoxno(CK_LT, fRES(boxno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_GreaterEqual(String boxno) {
        regBoxno(CK_GE, fRES(boxno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_LessEqual(String boxno) {
        regBoxno(CK_LE, fRES(boxno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxnoList The collection of boxno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_InScope(Collection<String> boxnoList) {
        doSetBoxno_InScope(boxnoList);
    }

    protected void doSetBoxno_InScope(Collection<String> boxnoList) {
        regINS(CK_INS, cTL(boxnoList), xgetCValueBoxno(), "BOXNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxnoList The collection of boxno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_NotInScope(Collection<String> boxnoList) {
        doSetBoxno_NotInScope(boxnoList);
    }

    protected void doSetBoxno_NotInScope(Collection<String> boxnoList) {
        regINS(CK_NINS, cTL(boxnoList), xgetCValueBoxno(), "BOXNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNO: {varchar(30)} <br>
     * <pre>e.g. setBoxno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxno The value of boxno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxno_LikeSearch(String boxno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxno), xgetCValueBoxno(), "BOXNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxno_NotLikeSearch(String boxno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxno), xgetCValueBoxno(), "BOXNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNO: {varchar(30)}
     * @param boxno The value of boxno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_PrefixSearch(String boxno) {
        setBoxno_LikeSearch(boxno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     */
    public void setBoxno_IsNull() { regBoxno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     */
    public void setBoxno_IsNullOrEmpty() { regBoxno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOXNO: {varchar(30)}
     */
    public void setBoxno_IsNotNull() { regBoxno(CK_ISNN, DOBJ); }

    protected void regBoxno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxno(), "BOXNO"); }
    protected abstract ConditionValue xgetCValueBoxno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYPE: {varchar(30)}
     * @param boxtype The value of boxtype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtype_Equal(String boxtype) {
        doSetBoxtype_Equal(fRES(boxtype));
    }

    protected void doSetBoxtype_Equal(String boxtype) {
        regBoxtype(CK_EQ, boxtype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYPE: {varchar(30)}
     * @param boxtype The value of boxtype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtype_NotEqual(String boxtype) {
        doSetBoxtype_NotEqual(fRES(boxtype));
    }

    protected void doSetBoxtype_NotEqual(String boxtype) {
        regBoxtype(CK_NES, boxtype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYPE: {varchar(30)}
     * @param boxtype The value of boxtype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtype_GreaterThan(String boxtype) {
        regBoxtype(CK_GT, fRES(boxtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYPE: {varchar(30)}
     * @param boxtype The value of boxtype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtype_LessThan(String boxtype) {
        regBoxtype(CK_LT, fRES(boxtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYPE: {varchar(30)}
     * @param boxtype The value of boxtype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtype_GreaterEqual(String boxtype) {
        regBoxtype(CK_GE, fRES(boxtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYPE: {varchar(30)}
     * @param boxtype The value of boxtype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtype_LessEqual(String boxtype) {
        regBoxtype(CK_LE, fRES(boxtype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXTYPE: {varchar(30)}
     * @param boxtypeList The collection of boxtype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtype_InScope(Collection<String> boxtypeList) {
        doSetBoxtype_InScope(boxtypeList);
    }

    protected void doSetBoxtype_InScope(Collection<String> boxtypeList) {
        regINS(CK_INS, cTL(boxtypeList), xgetCValueBoxtype(), "BOXTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXTYPE: {varchar(30)}
     * @param boxtypeList The collection of boxtype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtype_NotInScope(Collection<String> boxtypeList) {
        doSetBoxtype_NotInScope(boxtypeList);
    }

    protected void doSetBoxtype_NotInScope(Collection<String> boxtypeList) {
        regINS(CK_NINS, cTL(boxtypeList), xgetCValueBoxtype(), "BOXTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXTYPE: {varchar(30)} <br>
     * <pre>e.g. setBoxtype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxtype The value of boxtype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxtype_LikeSearch(String boxtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxtype), xgetCValueBoxtype(), "BOXTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXTYPE: {varchar(30)}
     * @param boxtype The value of boxtype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxtype_NotLikeSearch(String boxtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxtype), xgetCValueBoxtype(), "BOXTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXTYPE: {varchar(30)}
     * @param boxtype The value of boxtype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtype_PrefixSearch(String boxtype) {
        setBoxtype_LikeSearch(boxtype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOXTYPE: {varchar(30)}
     */
    public void setBoxtype_IsNull() { regBoxtype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOXTYPE: {varchar(30)}
     */
    public void setBoxtype_IsNullOrEmpty() { regBoxtype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOXTYPE: {varchar(30)}
     */
    public void setBoxtype_IsNotNull() { regBoxtype(CK_ISNN, DOBJ); }

    protected void regBoxtype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxtype(), "BOXTYPE"); }
    protected abstract ConditionValue xgetCValueBoxtype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZZMATNRTOTAL: {bigint(19)}
     * @param zzmatnrtotal The value of zzmatnrtotal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setZzmatnrtotal_Equal(Long zzmatnrtotal) {
        doSetZzmatnrtotal_Equal(zzmatnrtotal);
    }

    protected void doSetZzmatnrtotal_Equal(Long zzmatnrtotal) {
        regZzmatnrtotal(CK_EQ, zzmatnrtotal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZZMATNRTOTAL: {bigint(19)}
     * @param zzmatnrtotal The value of zzmatnrtotal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZzmatnrtotal_NotEqual(Long zzmatnrtotal) {
        doSetZzmatnrtotal_NotEqual(zzmatnrtotal);
    }

    protected void doSetZzmatnrtotal_NotEqual(Long zzmatnrtotal) {
        regZzmatnrtotal(CK_NES, zzmatnrtotal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZZMATNRTOTAL: {bigint(19)}
     * @param zzmatnrtotal The value of zzmatnrtotal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZzmatnrtotal_GreaterThan(Long zzmatnrtotal) {
        regZzmatnrtotal(CK_GT, zzmatnrtotal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZZMATNRTOTAL: {bigint(19)}
     * @param zzmatnrtotal The value of zzmatnrtotal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZzmatnrtotal_LessThan(Long zzmatnrtotal) {
        regZzmatnrtotal(CK_LT, zzmatnrtotal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZZMATNRTOTAL: {bigint(19)}
     * @param zzmatnrtotal The value of zzmatnrtotal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZzmatnrtotal_GreaterEqual(Long zzmatnrtotal) {
        regZzmatnrtotal(CK_GE, zzmatnrtotal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZZMATNRTOTAL: {bigint(19)}
     * @param zzmatnrtotal The value of zzmatnrtotal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZzmatnrtotal_LessEqual(Long zzmatnrtotal) {
        regZzmatnrtotal(CK_LE, zzmatnrtotal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZZMATNRTOTAL: {bigint(19)}
     * @param minNumber The min number of zzmatnrtotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zzmatnrtotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setZzmatnrtotal_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueZzmatnrtotal(), "ZZMATNRTOTAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZZMATNRTOTAL: {bigint(19)}
     * @param zzmatnrtotalList The collection of zzmatnrtotal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnrtotal_InScope(Collection<Long> zzmatnrtotalList) {
        doSetZzmatnrtotal_InScope(zzmatnrtotalList);
    }

    protected void doSetZzmatnrtotal_InScope(Collection<Long> zzmatnrtotalList) {
        regINS(CK_INS, cTL(zzmatnrtotalList), xgetCValueZzmatnrtotal(), "ZZMATNRTOTAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZZMATNRTOTAL: {bigint(19)}
     * @param zzmatnrtotalList The collection of zzmatnrtotal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnrtotal_NotInScope(Collection<Long> zzmatnrtotalList) {
        doSetZzmatnrtotal_NotInScope(zzmatnrtotalList);
    }

    protected void doSetZzmatnrtotal_NotInScope(Collection<Long> zzmatnrtotalList) {
        regINS(CK_NINS, cTL(zzmatnrtotalList), xgetCValueZzmatnrtotal(), "ZZMATNRTOTAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZMATNRTOTAL: {bigint(19)}
     */
    public void setZzmatnrtotal_IsNull() { regZzmatnrtotal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZMATNRTOTAL: {bigint(19)}
     */
    public void setZzmatnrtotal_IsNotNull() { regZzmatnrtotal(CK_ISNN, DOBJ); }

    protected void regZzmatnrtotal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzmatnrtotal(), "ZZMATNRTOTAL"); }
    protected abstract ConditionValue xgetCValueZzmatnrtotal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_Equal(String boxnocnsnm) {
        doSetBoxnocnsnm_Equal(fRES(boxnocnsnm));
    }

    protected void doSetBoxnocnsnm_Equal(String boxnocnsnm) {
        regBoxnocnsnm(CK_EQ, boxnocnsnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_NotEqual(String boxnocnsnm) {
        doSetBoxnocnsnm_NotEqual(fRES(boxnocnsnm));
    }

    protected void doSetBoxnocnsnm_NotEqual(String boxnocnsnm) {
        regBoxnocnsnm(CK_NES, boxnocnsnm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_GreaterThan(String boxnocnsnm) {
        regBoxnocnsnm(CK_GT, fRES(boxnocnsnm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_LessThan(String boxnocnsnm) {
        regBoxnocnsnm(CK_LT, fRES(boxnocnsnm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_GreaterEqual(String boxnocnsnm) {
        regBoxnocnsnm(CK_GE, fRES(boxnocnsnm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_LessEqual(String boxnocnsnm) {
        regBoxnocnsnm(CK_LE, fRES(boxnocnsnm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnmList The collection of boxnocnsnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_InScope(Collection<String> boxnocnsnmList) {
        doSetBoxnocnsnm_InScope(boxnocnsnmList);
    }

    protected void doSetBoxnocnsnm_InScope(Collection<String> boxnocnsnmList) {
        regINS(CK_INS, cTL(boxnocnsnmList), xgetCValueBoxnocnsnm(), "BOXNOCNSNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnmList The collection of boxnocnsnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_NotInScope(Collection<String> boxnocnsnmList) {
        doSetBoxnocnsnm_NotInScope(boxnocnsnmList);
    }

    protected void doSetBoxnocnsnm_NotInScope(Collection<String> boxnocnsnmList) {
        regINS(CK_NINS, cTL(boxnocnsnmList), xgetCValueBoxnocnsnm(), "BOXNOCNSNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)} <br>
     * <pre>e.g. setBoxnocnsnm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxnocnsnm The value of boxnocnsnm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxnocnsnm_LikeSearch(String boxnocnsnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxnocnsnm), xgetCValueBoxnocnsnm(), "BOXNOCNSNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxnocnsnm_NotLikeSearch(String boxnocnsnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxnocnsnm), xgetCValueBoxnocnsnm(), "BOXNOCNSNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_PrefixSearch(String boxnocnsnm) {
        setBoxnocnsnm_LikeSearch(boxnocnsnm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     */
    public void setBoxnocnsnm_IsNull() { regBoxnocnsnm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     */
    public void setBoxnocnsnm_IsNullOrEmpty() { regBoxnocnsnm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     */
    public void setBoxnocnsnm_IsNotNull() { regBoxnocnsnm(CK_ISNN, DOBJ); }

    protected void regBoxnocnsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxnocnsnm(), "BOXNOCNSNM"); }
    protected abstract ConditionValue xgetCValueBoxnocnsnm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_Equal(Long bxoszl) {
        doSetBxoszl_Equal(bxoszl);
    }

    protected void doSetBxoszl_Equal(Long bxoszl) {
        regBxoszl(CK_EQ, bxoszl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_NotEqual(Long bxoszl) {
        doSetBxoszl_NotEqual(bxoszl);
    }

    protected void doSetBxoszl_NotEqual(Long bxoszl) {
        regBxoszl(CK_NES, bxoszl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_GreaterThan(Long bxoszl) {
        regBxoszl(CK_GT, bxoszl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_LessThan(Long bxoszl) {
        regBxoszl(CK_LT, bxoszl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_GreaterEqual(Long bxoszl) {
        regBxoszl(CK_GE, bxoszl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszl The value of bxoszl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszl_LessEqual(Long bxoszl) {
        regBxoszl(CK_LE, bxoszl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param minNumber The min number of bxoszl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bxoszl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBxoszl_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBxoszl(), "BXOSZL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszlList The collection of bxoszl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszl_InScope(Collection<Long> bxoszlList) {
        doSetBxoszl_InScope(bxoszlList);
    }

    protected void doSetBxoszl_InScope(Collection<Long> bxoszlList) {
        regINS(CK_INS, cTL(bxoszlList), xgetCValueBxoszl(), "BXOSZL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZL: {bigint(19)}
     * @param bxoszlList The collection of bxoszl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszl_NotInScope(Collection<Long> bxoszlList) {
        doSetBxoszl_NotInScope(bxoszlList);
    }

    protected void doSetBxoszl_NotInScope(Collection<Long> bxoszlList) {
        regINS(CK_NINS, cTL(bxoszlList), xgetCValueBxoszl(), "BXOSZL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     */
    public void setBxoszl_IsNull() { regBxoszl(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXOSZL: {bigint(19)}
     */
    public void setBxoszl_IsNotNull() { regBxoszl(CK_ISNN, DOBJ); }

    protected void regBxoszl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxoszl(), "BXOSZL"); }
    protected abstract ConditionValue xgetCValueBxoszl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_Equal(Long bxoszh) {
        doSetBxoszh_Equal(bxoszh);
    }

    protected void doSetBxoszh_Equal(Long bxoszh) {
        regBxoszh(CK_EQ, bxoszh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_NotEqual(Long bxoszh) {
        doSetBxoszh_NotEqual(bxoszh);
    }

    protected void doSetBxoszh_NotEqual(Long bxoszh) {
        regBxoszh(CK_NES, bxoszh);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_GreaterThan(Long bxoszh) {
        regBxoszh(CK_GT, bxoszh);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_LessThan(Long bxoszh) {
        regBxoszh(CK_LT, bxoszh);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_GreaterEqual(Long bxoszh) {
        regBxoszh(CK_GE, bxoszh);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszh The value of bxoszh as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszh_LessEqual(Long bxoszh) {
        regBxoszh(CK_LE, bxoszh);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param minNumber The min number of bxoszh. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bxoszh. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBxoszh_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBxoszh(), "BXOSZH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszhList The collection of bxoszh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszh_InScope(Collection<Long> bxoszhList) {
        doSetBxoszh_InScope(bxoszhList);
    }

    protected void doSetBxoszh_InScope(Collection<Long> bxoszhList) {
        regINS(CK_INS, cTL(bxoszhList), xgetCValueBxoszh(), "BXOSZH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZH: {bigint(19)}
     * @param bxoszhList The collection of bxoszh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszh_NotInScope(Collection<Long> bxoszhList) {
        doSetBxoszh_NotInScope(bxoszhList);
    }

    protected void doSetBxoszh_NotInScope(Collection<Long> bxoszhList) {
        regINS(CK_NINS, cTL(bxoszhList), xgetCValueBxoszh(), "BXOSZH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     */
    public void setBxoszh_IsNull() { regBxoszh(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXOSZH: {bigint(19)}
     */
    public void setBxoszh_IsNotNull() { regBxoszh(CK_ISNN, DOBJ); }

    protected void regBxoszh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxoszh(), "BXOSZH"); }
    protected abstract ConditionValue xgetCValueBxoszh();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_Equal(Long bxoszw) {
        doSetBxoszw_Equal(bxoszw);
    }

    protected void doSetBxoszw_Equal(Long bxoszw) {
        regBxoszw(CK_EQ, bxoszw);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_NotEqual(Long bxoszw) {
        doSetBxoszw_NotEqual(bxoszw);
    }

    protected void doSetBxoszw_NotEqual(Long bxoszw) {
        regBxoszw(CK_NES, bxoszw);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_GreaterThan(Long bxoszw) {
        regBxoszw(CK_GT, bxoszw);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_LessThan(Long bxoszw) {
        regBxoszw(CK_LT, bxoszw);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_GreaterEqual(Long bxoszw) {
        regBxoszw(CK_GE, bxoszw);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszw The value of bxoszw as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxoszw_LessEqual(Long bxoszw) {
        regBxoszw(CK_LE, bxoszw);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param minNumber The min number of bxoszw. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bxoszw. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBxoszw_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBxoszw(), "BXOSZW", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszwList The collection of bxoszw as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszw_InScope(Collection<Long> bxoszwList) {
        doSetBxoszw_InScope(bxoszwList);
    }

    protected void doSetBxoszw_InScope(Collection<Long> bxoszwList) {
        regINS(CK_INS, cTL(bxoszwList), xgetCValueBxoszw(), "BXOSZW");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BXOSZW: {bigint(19)}
     * @param bxoszwList The collection of bxoszw as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxoszw_NotInScope(Collection<Long> bxoszwList) {
        doSetBxoszw_NotInScope(bxoszwList);
    }

    protected void doSetBxoszw_NotInScope(Collection<Long> bxoszwList) {
        regINS(CK_NINS, cTL(bxoszwList), xgetCValueBxoszw(), "BXOSZW");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     */
    public void setBxoszw_IsNull() { regBxoszw(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXOSZW: {bigint(19)}
     */
    public void setBxoszw_IsNotNull() { regBxoszw(CK_ISNN, DOBJ); }

    protected void regBxoszw(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxoszw(), "BXOSZW"); }
    protected abstract ConditionValue xgetCValueBxoszw();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXTOTALWEIGH: {bigint(19)}
     * @param boxtotalweigh The value of boxtotalweigh as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxtotalweigh_Equal(Long boxtotalweigh) {
        doSetBoxtotalweigh_Equal(boxtotalweigh);
    }

    protected void doSetBoxtotalweigh_Equal(Long boxtotalweigh) {
        regBoxtotalweigh(CK_EQ, boxtotalweigh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXTOTALWEIGH: {bigint(19)}
     * @param boxtotalweigh The value of boxtotalweigh as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxtotalweigh_NotEqual(Long boxtotalweigh) {
        doSetBoxtotalweigh_NotEqual(boxtotalweigh);
    }

    protected void doSetBoxtotalweigh_NotEqual(Long boxtotalweigh) {
        regBoxtotalweigh(CK_NES, boxtotalweigh);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXTOTALWEIGH: {bigint(19)}
     * @param boxtotalweigh The value of boxtotalweigh as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxtotalweigh_GreaterThan(Long boxtotalweigh) {
        regBoxtotalweigh(CK_GT, boxtotalweigh);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXTOTALWEIGH: {bigint(19)}
     * @param boxtotalweigh The value of boxtotalweigh as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxtotalweigh_LessThan(Long boxtotalweigh) {
        regBoxtotalweigh(CK_LT, boxtotalweigh);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXTOTALWEIGH: {bigint(19)}
     * @param boxtotalweigh The value of boxtotalweigh as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxtotalweigh_GreaterEqual(Long boxtotalweigh) {
        regBoxtotalweigh(CK_GE, boxtotalweigh);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXTOTALWEIGH: {bigint(19)}
     * @param boxtotalweigh The value of boxtotalweigh as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxtotalweigh_LessEqual(Long boxtotalweigh) {
        regBoxtotalweigh(CK_LE, boxtotalweigh);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOXTOTALWEIGH: {bigint(19)}
     * @param minNumber The min number of boxtotalweigh. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of boxtotalweigh. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBoxtotalweigh_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoxtotalweigh(), "BOXTOTALWEIGH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOXTOTALWEIGH: {bigint(19)}
     * @param boxtotalweighList The collection of boxtotalweigh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtotalweigh_InScope(Collection<Long> boxtotalweighList) {
        doSetBoxtotalweigh_InScope(boxtotalweighList);
    }

    protected void doSetBoxtotalweigh_InScope(Collection<Long> boxtotalweighList) {
        regINS(CK_INS, cTL(boxtotalweighList), xgetCValueBoxtotalweigh(), "BOXTOTALWEIGH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOXTOTALWEIGH: {bigint(19)}
     * @param boxtotalweighList The collection of boxtotalweigh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtotalweigh_NotInScope(Collection<Long> boxtotalweighList) {
        doSetBoxtotalweigh_NotInScope(boxtotalweighList);
    }

    protected void doSetBoxtotalweigh_NotInScope(Collection<Long> boxtotalweighList) {
        regINS(CK_NINS, cTL(boxtotalweighList), xgetCValueBoxtotalweigh(), "BOXTOTALWEIGH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOXTOTALWEIGH: {bigint(19)}
     */
    public void setBoxtotalweigh_IsNull() { regBoxtotalweigh(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOXTOTALWEIGH: {bigint(19)}
     */
    public void setBoxtotalweigh_IsNotNull() { regBoxtotalweigh(CK_ISNN, DOBJ); }

    protected void regBoxtotalweigh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxtotalweigh(), "BOXTOTALWEIGH"); }
    protected abstract ConditionValue xgetCValueBoxtotalweigh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WEIGHTYPE: {varchar(30)}
     * @param weightype The value of weightype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWeightype_Equal(String weightype) {
        doSetWeightype_Equal(fRES(weightype));
    }

    protected void doSetWeightype_Equal(String weightype) {
        regWeightype(CK_EQ, weightype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WEIGHTYPE: {varchar(30)}
     * @param weightype The value of weightype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWeightype_NotEqual(String weightype) {
        doSetWeightype_NotEqual(fRES(weightype));
    }

    protected void doSetWeightype_NotEqual(String weightype) {
        regWeightype(CK_NES, weightype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WEIGHTYPE: {varchar(30)}
     * @param weightype The value of weightype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWeightype_GreaterThan(String weightype) {
        regWeightype(CK_GT, fRES(weightype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WEIGHTYPE: {varchar(30)}
     * @param weightype The value of weightype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWeightype_LessThan(String weightype) {
        regWeightype(CK_LT, fRES(weightype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WEIGHTYPE: {varchar(30)}
     * @param weightype The value of weightype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWeightype_GreaterEqual(String weightype) {
        regWeightype(CK_GE, fRES(weightype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WEIGHTYPE: {varchar(30)}
     * @param weightype The value of weightype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWeightype_LessEqual(String weightype) {
        regWeightype(CK_LE, fRES(weightype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WEIGHTYPE: {varchar(30)}
     * @param weightypeList The collection of weightype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWeightype_InScope(Collection<String> weightypeList) {
        doSetWeightype_InScope(weightypeList);
    }

    protected void doSetWeightype_InScope(Collection<String> weightypeList) {
        regINS(CK_INS, cTL(weightypeList), xgetCValueWeightype(), "WEIGHTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WEIGHTYPE: {varchar(30)}
     * @param weightypeList The collection of weightype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWeightype_NotInScope(Collection<String> weightypeList) {
        doSetWeightype_NotInScope(weightypeList);
    }

    protected void doSetWeightype_NotInScope(Collection<String> weightypeList) {
        regINS(CK_NINS, cTL(weightypeList), xgetCValueWeightype(), "WEIGHTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WEIGHTYPE: {varchar(30)} <br>
     * <pre>e.g. setWeightype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param weightype The value of weightype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWeightype_LikeSearch(String weightype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(weightype), xgetCValueWeightype(), "WEIGHTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WEIGHTYPE: {varchar(30)}
     * @param weightype The value of weightype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWeightype_NotLikeSearch(String weightype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(weightype), xgetCValueWeightype(), "WEIGHTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WEIGHTYPE: {varchar(30)}
     * @param weightype The value of weightype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWeightype_PrefixSearch(String weightype) {
        setWeightype_LikeSearch(weightype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WEIGHTYPE: {varchar(30)}
     */
    public void setWeightype_IsNull() { regWeightype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WEIGHTYPE: {varchar(30)}
     */
    public void setWeightype_IsNullOrEmpty() { regWeightype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WEIGHTYPE: {varchar(30)}
     */
    public void setWeightype_IsNotNull() { regWeightype(CK_ISNN, DOBJ); }

    protected void regWeightype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWeightype(), "WEIGHTYPE"); }
    protected abstract ConditionValue xgetCValueWeightype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXTOTALNUMBER: {bigint(19)}
     * @param boxtotalnumber The value of boxtotalnumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxtotalnumber_Equal(Long boxtotalnumber) {
        doSetBoxtotalnumber_Equal(boxtotalnumber);
    }

    protected void doSetBoxtotalnumber_Equal(Long boxtotalnumber) {
        regBoxtotalnumber(CK_EQ, boxtotalnumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXTOTALNUMBER: {bigint(19)}
     * @param boxtotalnumber The value of boxtotalnumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxtotalnumber_NotEqual(Long boxtotalnumber) {
        doSetBoxtotalnumber_NotEqual(boxtotalnumber);
    }

    protected void doSetBoxtotalnumber_NotEqual(Long boxtotalnumber) {
        regBoxtotalnumber(CK_NES, boxtotalnumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXTOTALNUMBER: {bigint(19)}
     * @param boxtotalnumber The value of boxtotalnumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxtotalnumber_GreaterThan(Long boxtotalnumber) {
        regBoxtotalnumber(CK_GT, boxtotalnumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXTOTALNUMBER: {bigint(19)}
     * @param boxtotalnumber The value of boxtotalnumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxtotalnumber_LessThan(Long boxtotalnumber) {
        regBoxtotalnumber(CK_LT, boxtotalnumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXTOTALNUMBER: {bigint(19)}
     * @param boxtotalnumber The value of boxtotalnumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxtotalnumber_GreaterEqual(Long boxtotalnumber) {
        regBoxtotalnumber(CK_GE, boxtotalnumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXTOTALNUMBER: {bigint(19)}
     * @param boxtotalnumber The value of boxtotalnumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxtotalnumber_LessEqual(Long boxtotalnumber) {
        regBoxtotalnumber(CK_LE, boxtotalnumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOXTOTALNUMBER: {bigint(19)}
     * @param minNumber The min number of boxtotalnumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of boxtotalnumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBoxtotalnumber_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoxtotalnumber(), "BOXTOTALNUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOXTOTALNUMBER: {bigint(19)}
     * @param boxtotalnumberList The collection of boxtotalnumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtotalnumber_InScope(Collection<Long> boxtotalnumberList) {
        doSetBoxtotalnumber_InScope(boxtotalnumberList);
    }

    protected void doSetBoxtotalnumber_InScope(Collection<Long> boxtotalnumberList) {
        regINS(CK_INS, cTL(boxtotalnumberList), xgetCValueBoxtotalnumber(), "BOXTOTALNUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOXTOTALNUMBER: {bigint(19)}
     * @param boxtotalnumberList The collection of boxtotalnumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtotalnumber_NotInScope(Collection<Long> boxtotalnumberList) {
        doSetBoxtotalnumber_NotInScope(boxtotalnumberList);
    }

    protected void doSetBoxtotalnumber_NotInScope(Collection<Long> boxtotalnumberList) {
        regINS(CK_NINS, cTL(boxtotalnumberList), xgetCValueBoxtotalnumber(), "BOXTOTALNUMBER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOXTOTALNUMBER: {bigint(19)}
     */
    public void setBoxtotalnumber_IsNull() { regBoxtotalnumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOXTOTALNUMBER: {bigint(19)}
     */
    public void setBoxtotalnumber_IsNotNull() { regBoxtotalnumber(CK_ISNN, DOBJ); }

    protected void regBoxtotalnumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxtotalnumber(), "BOXTOTALNUMBER"); }
    protected abstract ConditionValue xgetCValueBoxtotalnumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAM1: {varchar(30)}
     * @param keepaream1 The value of keepaream1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepaream1_Equal(String keepaream1) {
        doSetKeepaream1_Equal(fRES(keepaream1));
    }

    protected void doSetKeepaream1_Equal(String keepaream1) {
        regKeepaream1(CK_EQ, keepaream1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAM1: {varchar(30)}
     * @param keepaream1 The value of keepaream1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepaream1_NotEqual(String keepaream1) {
        doSetKeepaream1_NotEqual(fRES(keepaream1));
    }

    protected void doSetKeepaream1_NotEqual(String keepaream1) {
        regKeepaream1(CK_NES, keepaream1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAM1: {varchar(30)}
     * @param keepaream1 The value of keepaream1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepaream1_GreaterThan(String keepaream1) {
        regKeepaream1(CK_GT, fRES(keepaream1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAM1: {varchar(30)}
     * @param keepaream1 The value of keepaream1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepaream1_LessThan(String keepaream1) {
        regKeepaream1(CK_LT, fRES(keepaream1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAM1: {varchar(30)}
     * @param keepaream1 The value of keepaream1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepaream1_GreaterEqual(String keepaream1) {
        regKeepaream1(CK_GE, fRES(keepaream1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KEEPAREAM1: {varchar(30)}
     * @param keepaream1 The value of keepaream1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepaream1_LessEqual(String keepaream1) {
        regKeepaream1(CK_LE, fRES(keepaream1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KEEPAREAM1: {varchar(30)}
     * @param keepaream1List The collection of keepaream1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepaream1_InScope(Collection<String> keepaream1List) {
        doSetKeepaream1_InScope(keepaream1List);
    }

    protected void doSetKeepaream1_InScope(Collection<String> keepaream1List) {
        regINS(CK_INS, cTL(keepaream1List), xgetCValueKeepaream1(), "KEEPAREAM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KEEPAREAM1: {varchar(30)}
     * @param keepaream1List The collection of keepaream1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepaream1_NotInScope(Collection<String> keepaream1List) {
        doSetKeepaream1_NotInScope(keepaream1List);
    }

    protected void doSetKeepaream1_NotInScope(Collection<String> keepaream1List) {
        regINS(CK_NINS, cTL(keepaream1List), xgetCValueKeepaream1(), "KEEPAREAM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KEEPAREAM1: {varchar(30)} <br>
     * <pre>e.g. setKeepaream1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param keepaream1 The value of keepaream1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKeepaream1_LikeSearch(String keepaream1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(keepaream1), xgetCValueKeepaream1(), "KEEPAREAM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KEEPAREAM1: {varchar(30)}
     * @param keepaream1 The value of keepaream1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKeepaream1_NotLikeSearch(String keepaream1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(keepaream1), xgetCValueKeepaream1(), "KEEPAREAM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KEEPAREAM1: {varchar(30)}
     * @param keepaream1 The value of keepaream1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKeepaream1_PrefixSearch(String keepaream1) {
        setKeepaream1_LikeSearch(keepaream1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KEEPAREAM1: {varchar(30)}
     */
    public void setKeepaream1_IsNull() { regKeepaream1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KEEPAREAM1: {varchar(30)}
     */
    public void setKeepaream1_IsNullOrEmpty() { regKeepaream1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KEEPAREAM1: {varchar(30)}
     */
    public void setKeepaream1_IsNotNull() { regKeepaream1(CK_ISNN, DOBJ); }

    protected void regKeepaream1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKeepaream1(), "KEEPAREAM1"); }
    protected abstract ConditionValue xgetCValueKeepaream1();

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
    public HpSLCFunction<EOrderSplitDataCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EOrderSplitDataCB.class);
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
    public HpSLCFunction<EOrderSplitDataCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EOrderSplitDataCB.class);
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
    public HpSLCFunction<EOrderSplitDataCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EOrderSplitDataCB.class);
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
    public HpSLCFunction<EOrderSplitDataCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EOrderSplitDataCB.class);
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
    public HpSLCFunction<EOrderSplitDataCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EOrderSplitDataCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EOrderSplitDataCB&gt;() {
     *     public void query(EOrderSplitDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EOrderSplitDataCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EOrderSplitDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EOrderSplitDataCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EOrderSplitDataCQ sq);

    protected EOrderSplitDataCB xcreateScalarConditionCB() {
        EOrderSplitDataCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EOrderSplitDataCB xcreateScalarConditionPartitionByCB() {
        EOrderSplitDataCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EOrderSplitDataCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EOrderSplitDataCB cb = new EOrderSplitDataCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ORDER_SPLIT_DATA_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EOrderSplitDataCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EOrderSplitDataCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EOrderSplitDataCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EOrderSplitDataCB cb = new EOrderSplitDataCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ORDER_SPLIT_DATA_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EOrderSplitDataCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EOrderSplitDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EOrderSplitDataCB cb = new EOrderSplitDataCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EOrderSplitDataCQ sq);

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
    protected EOrderSplitDataCB newMyCB() {
        return new EOrderSplitDataCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EOrderSplitDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

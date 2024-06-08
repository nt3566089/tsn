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
 * The abstract condition-query of E_DUTY_FREE_INOUT_RESULT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEDutyFreeInoutResultCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEDutyFreeInoutResultCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_DUTY_FREE_INOUT_RESULT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dutyFreeInoutResultId The value of dutyFreeInoutResultId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDutyFreeInoutResultId_Equal(Long dutyFreeInoutResultId) {
        doSetDutyFreeInoutResultId_Equal(dutyFreeInoutResultId);
    }

    protected void doSetDutyFreeInoutResultId_Equal(Long dutyFreeInoutResultId) {
        regDutyFreeInoutResultId(CK_EQ, dutyFreeInoutResultId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dutyFreeInoutResultId The value of dutyFreeInoutResultId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDutyFreeInoutResultId_NotEqual(Long dutyFreeInoutResultId) {
        doSetDutyFreeInoutResultId_NotEqual(dutyFreeInoutResultId);
    }

    protected void doSetDutyFreeInoutResultId_NotEqual(Long dutyFreeInoutResultId) {
        regDutyFreeInoutResultId(CK_NES, dutyFreeInoutResultId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dutyFreeInoutResultId The value of dutyFreeInoutResultId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDutyFreeInoutResultId_GreaterThan(Long dutyFreeInoutResultId) {
        regDutyFreeInoutResultId(CK_GT, dutyFreeInoutResultId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dutyFreeInoutResultId The value of dutyFreeInoutResultId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDutyFreeInoutResultId_LessThan(Long dutyFreeInoutResultId) {
        regDutyFreeInoutResultId(CK_LT, dutyFreeInoutResultId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dutyFreeInoutResultId The value of dutyFreeInoutResultId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDutyFreeInoutResultId_GreaterEqual(Long dutyFreeInoutResultId) {
        regDutyFreeInoutResultId(CK_GE, dutyFreeInoutResultId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dutyFreeInoutResultId The value of dutyFreeInoutResultId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDutyFreeInoutResultId_LessEqual(Long dutyFreeInoutResultId) {
        regDutyFreeInoutResultId(CK_LE, dutyFreeInoutResultId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of dutyFreeInoutResultId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dutyFreeInoutResultId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDutyFreeInoutResultId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDutyFreeInoutResultId(), "DUTY_FREE_INOUT_RESULT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dutyFreeInoutResultIdList The collection of dutyFreeInoutResultId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDutyFreeInoutResultId_InScope(Collection<Long> dutyFreeInoutResultIdList) {
        doSetDutyFreeInoutResultId_InScope(dutyFreeInoutResultIdList);
    }

    protected void doSetDutyFreeInoutResultId_InScope(Collection<Long> dutyFreeInoutResultIdList) {
        regINS(CK_INS, cTL(dutyFreeInoutResultIdList), xgetCValueDutyFreeInoutResultId(), "DUTY_FREE_INOUT_RESULT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dutyFreeInoutResultIdList The collection of dutyFreeInoutResultId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDutyFreeInoutResultId_NotInScope(Collection<Long> dutyFreeInoutResultIdList) {
        doSetDutyFreeInoutResultId_NotInScope(dutyFreeInoutResultIdList);
    }

    protected void doSetDutyFreeInoutResultId_NotInScope(Collection<Long> dutyFreeInoutResultIdList) {
        regINS(CK_NINS, cTL(dutyFreeInoutResultIdList), xgetCValueDutyFreeInoutResultId(), "DUTY_FREE_INOUT_RESULT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setDutyFreeInoutResultId_IsNull() { regDutyFreeInoutResultId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setDutyFreeInoutResultId_IsNotNull() { regDutyFreeInoutResultId(CK_ISNN, DOBJ); }

    protected void regDutyFreeInoutResultId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDutyFreeInoutResultId(), "DUTY_FREE_INOUT_RESULT_ID"); }
    protected abstract ConditionValue xgetCValueDutyFreeInoutResultId();

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
     * SEND_ROW_ID: {NotNull, bigint(19)}
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
     * SEND_ROW_ID: {NotNull, bigint(19)}
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
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_GreaterThan(Long sendRowId) {
        regSendRowId(CK_GT, sendRowId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_LessThan(Long sendRowId) {
        regSendRowId(CK_LT, sendRowId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_GreaterEqual(Long sendRowId) {
        regSendRowId(CK_GE, sendRowId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_LessEqual(Long sendRowId) {
        regSendRowId(CK_LE, sendRowId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of sendRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sendRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSendRowId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSendRowId(), "SEND_ROW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
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
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowIdList The collection of sendRowId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendRowId_NotInScope(Collection<Long> sendRowIdList) {
        doSetSendRowId_NotInScope(sendRowIdList);
    }

    protected void doSetSendRowId_NotInScope(Collection<Long> sendRowIdList) {
        regINS(CK_NINS, cTL(sendRowIdList), xgetCValueSendRowId(), "SEND_ROW_ID");
    }

    protected void regSendRowId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendRowId(), "SEND_ROW_ID"); }
    protected abstract ConditionValue xgetCValueSendRowId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
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
     * WORK_FLG: {NotNull, char(1), default=[0]}
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
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterThan(String workFlg) {
        regWorkFlg(CK_GT, fRES(workFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessThan(String workFlg) {
        regWorkFlg(CK_LT, fRES(workFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterEqual(String workFlg) {
        regWorkFlg(CK_GE, fRES(workFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessEqual(String workFlg) {
        regWorkFlg(CK_LE, fRES(workFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
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
     * WORK_FLG: {NotNull, char(1), default=[0]}
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
     * WORK_FLG: {NotNull, char(1), default=[0]} <br>
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
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkFlg_NotLikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_PrefixSearch(String workFlg) {
        setWorkFlg_LikeSearch(workFlg, xcLSOPPre());
    }

    protected void regWorkFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkFlg(), "WORK_FLG"); }
    protected abstract ConditionValue xgetCValueWorkFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_Equal(String symbolPosKey) {
        doSetSymbolPosKey_Equal(fRES(symbolPosKey));
    }

    protected void doSetSymbolPosKey_Equal(String symbolPosKey) {
        regSymbolPosKey(CK_EQ, symbolPosKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_NotEqual(String symbolPosKey) {
        doSetSymbolPosKey_NotEqual(fRES(symbolPosKey));
    }

    protected void doSetSymbolPosKey_NotEqual(String symbolPosKey) {
        regSymbolPosKey(CK_NES, symbolPosKey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_GreaterThan(String symbolPosKey) {
        regSymbolPosKey(CK_GT, fRES(symbolPosKey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_LessThan(String symbolPosKey) {
        regSymbolPosKey(CK_LT, fRES(symbolPosKey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_GreaterEqual(String symbolPosKey) {
        regSymbolPosKey(CK_GE, fRES(symbolPosKey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_LessEqual(String symbolPosKey) {
        regSymbolPosKey(CK_LE, fRES(symbolPosKey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKeyList The collection of symbolPosKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_InScope(Collection<String> symbolPosKeyList) {
        doSetSymbolPosKey_InScope(symbolPosKeyList);
    }

    protected void doSetSymbolPosKey_InScope(Collection<String> symbolPosKeyList) {
        regINS(CK_INS, cTL(symbolPosKeyList), xgetCValueSymbolPosKey(), "SYMBOL_POS_KEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKeyList The collection of symbolPosKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_NotInScope(Collection<String> symbolPosKeyList) {
        doSetSymbolPosKey_NotInScope(symbolPosKeyList);
    }

    protected void doSetSymbolPosKey_NotInScope(Collection<String> symbolPosKeyList) {
        regINS(CK_NINS, cTL(symbolPosKeyList), xgetCValueSymbolPosKey(), "SYMBOL_POS_KEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)} <br>
     * <pre>e.g. setSymbolPosKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolPosKey The value of symbolPosKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolPosKey_LikeSearch(String symbolPosKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolPosKey), xgetCValueSymbolPosKey(), "SYMBOL_POS_KEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolPosKey_NotLikeSearch(String symbolPosKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolPosKey), xgetCValueSymbolPosKey(), "SYMBOL_POS_KEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_PrefixSearch(String symbolPosKey) {
        setSymbolPosKey_LikeSearch(symbolPosKey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     */
    public void setSymbolPosKey_IsNull() { regSymbolPosKey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     */
    public void setSymbolPosKey_IsNullOrEmpty() { regSymbolPosKey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     */
    public void setSymbolPosKey_IsNotNull() { regSymbolPosKey(CK_ISNN, DOBJ); }

    protected void regSymbolPosKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolPosKey(), "SYMBOL_POS_KEY"); }
    protected abstract ConditionValue xgetCValueSymbolPosKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_Equal(String warehouseCd) {
        doSetWarehouseCd_Equal(fRES(warehouseCd));
    }

    protected void doSetWarehouseCd_Equal(String warehouseCd) {
        regWarehouseCd(CK_EQ, warehouseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotEqual(String warehouseCd) {
        doSetWarehouseCd_NotEqual(fRES(warehouseCd));
    }

    protected void doSetWarehouseCd_NotEqual(String warehouseCd) {
        regWarehouseCd(CK_NES, warehouseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterThan(String warehouseCd) {
        regWarehouseCd(CK_GT, fRES(warehouseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessThan(String warehouseCd) {
        regWarehouseCd(CK_LT, fRES(warehouseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterEqual(String warehouseCd) {
        regWarehouseCd(CK_GE, fRES(warehouseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessEqual(String warehouseCd) {
        regWarehouseCd(CK_LE, fRES(warehouseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCdList The collection of warehouseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_InScope(Collection<String> warehouseCdList) {
        doSetWarehouseCd_InScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_InScope(Collection<String> warehouseCdList) {
        regINS(CK_INS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCdList The collection of warehouseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotInScope(Collection<String> warehouseCdList) {
        doSetWarehouseCd_NotInScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_NotInScope(Collection<String> warehouseCdList) {
        regINS(CK_NINS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)} <br>
     * <pre>e.g. setWarehouseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseCd The value of warehouseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseCd_LikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseCd_NotLikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_PrefixSearch(String warehouseCd) {
        setWarehouseCd_LikeSearch(warehouseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNull() { regWarehouseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNullOrEmpty() { regWarehouseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNotNull() { regWarehouseCd(CK_ISNN, DOBJ); }

    protected void regWarehouseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseCd(), "WAREHOUSE_CD"); }
    protected abstract ConditionValue xgetCValueWarehouseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     * @param symbolFactoryCd The value of symbolFactoryCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolFactoryCd_Equal(String symbolFactoryCd) {
        doSetSymbolFactoryCd_Equal(fRES(symbolFactoryCd));
    }

    protected void doSetSymbolFactoryCd_Equal(String symbolFactoryCd) {
        regSymbolFactoryCd(CK_EQ, symbolFactoryCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     * @param symbolFactoryCd The value of symbolFactoryCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolFactoryCd_NotEqual(String symbolFactoryCd) {
        doSetSymbolFactoryCd_NotEqual(fRES(symbolFactoryCd));
    }

    protected void doSetSymbolFactoryCd_NotEqual(String symbolFactoryCd) {
        regSymbolFactoryCd(CK_NES, symbolFactoryCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     * @param symbolFactoryCd The value of symbolFactoryCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolFactoryCd_GreaterThan(String symbolFactoryCd) {
        regSymbolFactoryCd(CK_GT, fRES(symbolFactoryCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     * @param symbolFactoryCd The value of symbolFactoryCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolFactoryCd_LessThan(String symbolFactoryCd) {
        regSymbolFactoryCd(CK_LT, fRES(symbolFactoryCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     * @param symbolFactoryCd The value of symbolFactoryCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolFactoryCd_GreaterEqual(String symbolFactoryCd) {
        regSymbolFactoryCd(CK_GE, fRES(symbolFactoryCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     * @param symbolFactoryCd The value of symbolFactoryCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolFactoryCd_LessEqual(String symbolFactoryCd) {
        regSymbolFactoryCd(CK_LE, fRES(symbolFactoryCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     * @param symbolFactoryCdList The collection of symbolFactoryCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolFactoryCd_InScope(Collection<String> symbolFactoryCdList) {
        doSetSymbolFactoryCd_InScope(symbolFactoryCdList);
    }

    protected void doSetSymbolFactoryCd_InScope(Collection<String> symbolFactoryCdList) {
        regINS(CK_INS, cTL(symbolFactoryCdList), xgetCValueSymbolFactoryCd(), "SYMBOL_FACTORY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     * @param symbolFactoryCdList The collection of symbolFactoryCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolFactoryCd_NotInScope(Collection<String> symbolFactoryCdList) {
        doSetSymbolFactoryCd_NotInScope(symbolFactoryCdList);
    }

    protected void doSetSymbolFactoryCd_NotInScope(Collection<String> symbolFactoryCdList) {
        regINS(CK_NINS, cTL(symbolFactoryCdList), xgetCValueSymbolFactoryCd(), "SYMBOL_FACTORY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)} <br>
     * <pre>e.g. setSymbolFactoryCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolFactoryCd The value of symbolFactoryCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolFactoryCd_LikeSearch(String symbolFactoryCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolFactoryCd), xgetCValueSymbolFactoryCd(), "SYMBOL_FACTORY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     * @param symbolFactoryCd The value of symbolFactoryCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolFactoryCd_NotLikeSearch(String symbolFactoryCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolFactoryCd), xgetCValueSymbolFactoryCd(), "SYMBOL_FACTORY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     * @param symbolFactoryCd The value of symbolFactoryCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolFactoryCd_PrefixSearch(String symbolFactoryCd) {
        setSymbolFactoryCd_LikeSearch(symbolFactoryCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     */
    public void setSymbolFactoryCd_IsNull() { regSymbolFactoryCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     */
    public void setSymbolFactoryCd_IsNullOrEmpty() { regSymbolFactoryCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOL_FACTORY_CD: {varchar(255)}
     */
    public void setSymbolFactoryCd_IsNotNull() { regSymbolFactoryCd(CK_ISNN, DOBJ); }

    protected void regSymbolFactoryCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolFactoryCd(), "SYMBOL_FACTORY_CD"); }
    protected abstract ConditionValue xgetCValueSymbolFactoryCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     * @param symbolItemCd The value of symbolItemCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolItemCd_Equal(String symbolItemCd) {
        doSetSymbolItemCd_Equal(fRES(symbolItemCd));
    }

    protected void doSetSymbolItemCd_Equal(String symbolItemCd) {
        regSymbolItemCd(CK_EQ, symbolItemCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     * @param symbolItemCd The value of symbolItemCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolItemCd_NotEqual(String symbolItemCd) {
        doSetSymbolItemCd_NotEqual(fRES(symbolItemCd));
    }

    protected void doSetSymbolItemCd_NotEqual(String symbolItemCd) {
        regSymbolItemCd(CK_NES, symbolItemCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     * @param symbolItemCd The value of symbolItemCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolItemCd_GreaterThan(String symbolItemCd) {
        regSymbolItemCd(CK_GT, fRES(symbolItemCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     * @param symbolItemCd The value of symbolItemCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolItemCd_LessThan(String symbolItemCd) {
        regSymbolItemCd(CK_LT, fRES(symbolItemCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     * @param symbolItemCd The value of symbolItemCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolItemCd_GreaterEqual(String symbolItemCd) {
        regSymbolItemCd(CK_GE, fRES(symbolItemCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     * @param symbolItemCd The value of symbolItemCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolItemCd_LessEqual(String symbolItemCd) {
        regSymbolItemCd(CK_LE, fRES(symbolItemCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     * @param symbolItemCdList The collection of symbolItemCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolItemCd_InScope(Collection<String> symbolItemCdList) {
        doSetSymbolItemCd_InScope(symbolItemCdList);
    }

    protected void doSetSymbolItemCd_InScope(Collection<String> symbolItemCdList) {
        regINS(CK_INS, cTL(symbolItemCdList), xgetCValueSymbolItemCd(), "SYMBOL_ITEM_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     * @param symbolItemCdList The collection of symbolItemCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolItemCd_NotInScope(Collection<String> symbolItemCdList) {
        doSetSymbolItemCd_NotInScope(symbolItemCdList);
    }

    protected void doSetSymbolItemCd_NotInScope(Collection<String> symbolItemCdList) {
        regINS(CK_NINS, cTL(symbolItemCdList), xgetCValueSymbolItemCd(), "SYMBOL_ITEM_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_ITEM_CD: {varchar(255)} <br>
     * <pre>e.g. setSymbolItemCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolItemCd The value of symbolItemCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolItemCd_LikeSearch(String symbolItemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolItemCd), xgetCValueSymbolItemCd(), "SYMBOL_ITEM_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     * @param symbolItemCd The value of symbolItemCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolItemCd_NotLikeSearch(String symbolItemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolItemCd), xgetCValueSymbolItemCd(), "SYMBOL_ITEM_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     * @param symbolItemCd The value of symbolItemCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolItemCd_PrefixSearch(String symbolItemCd) {
        setSymbolItemCd_LikeSearch(symbolItemCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     */
    public void setSymbolItemCd_IsNull() { regSymbolItemCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     */
    public void setSymbolItemCd_IsNullOrEmpty() { regSymbolItemCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOL_ITEM_CD: {varchar(255)}
     */
    public void setSymbolItemCd_IsNotNull() { regSymbolItemCd(CK_ISNN, DOBJ); }

    protected void regSymbolItemCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolItemCd(), "SYMBOL_ITEM_CD"); }
    protected abstract ConditionValue xgetCValueSymbolItemCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_SKU: {varchar(255)}
     * @param symbolSku The value of symbolSku as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolSku_Equal(String symbolSku) {
        doSetSymbolSku_Equal(fRES(symbolSku));
    }

    protected void doSetSymbolSku_Equal(String symbolSku) {
        regSymbolSku(CK_EQ, symbolSku);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_SKU: {varchar(255)}
     * @param symbolSku The value of symbolSku as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolSku_NotEqual(String symbolSku) {
        doSetSymbolSku_NotEqual(fRES(symbolSku));
    }

    protected void doSetSymbolSku_NotEqual(String symbolSku) {
        regSymbolSku(CK_NES, symbolSku);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_SKU: {varchar(255)}
     * @param symbolSku The value of symbolSku as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolSku_GreaterThan(String symbolSku) {
        regSymbolSku(CK_GT, fRES(symbolSku));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_SKU: {varchar(255)}
     * @param symbolSku The value of symbolSku as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolSku_LessThan(String symbolSku) {
        regSymbolSku(CK_LT, fRES(symbolSku));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_SKU: {varchar(255)}
     * @param symbolSku The value of symbolSku as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolSku_GreaterEqual(String symbolSku) {
        regSymbolSku(CK_GE, fRES(symbolSku));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_SKU: {varchar(255)}
     * @param symbolSku The value of symbolSku as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolSku_LessEqual(String symbolSku) {
        regSymbolSku(CK_LE, fRES(symbolSku));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_SKU: {varchar(255)}
     * @param symbolSkuList The collection of symbolSku as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolSku_InScope(Collection<String> symbolSkuList) {
        doSetSymbolSku_InScope(symbolSkuList);
    }

    protected void doSetSymbolSku_InScope(Collection<String> symbolSkuList) {
        regINS(CK_INS, cTL(symbolSkuList), xgetCValueSymbolSku(), "SYMBOL_SKU");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_SKU: {varchar(255)}
     * @param symbolSkuList The collection of symbolSku as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolSku_NotInScope(Collection<String> symbolSkuList) {
        doSetSymbolSku_NotInScope(symbolSkuList);
    }

    protected void doSetSymbolSku_NotInScope(Collection<String> symbolSkuList) {
        regINS(CK_NINS, cTL(symbolSkuList), xgetCValueSymbolSku(), "SYMBOL_SKU");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_SKU: {varchar(255)} <br>
     * <pre>e.g. setSymbolSku_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolSku The value of symbolSku as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolSku_LikeSearch(String symbolSku, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolSku), xgetCValueSymbolSku(), "SYMBOL_SKU", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_SKU: {varchar(255)}
     * @param symbolSku The value of symbolSku as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolSku_NotLikeSearch(String symbolSku, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolSku), xgetCValueSymbolSku(), "SYMBOL_SKU", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_SKU: {varchar(255)}
     * @param symbolSku The value of symbolSku as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolSku_PrefixSearch(String symbolSku) {
        setSymbolSku_LikeSearch(symbolSku, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOL_SKU: {varchar(255)}
     */
    public void setSymbolSku_IsNull() { regSymbolSku(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOL_SKU: {varchar(255)}
     */
    public void setSymbolSku_IsNullOrEmpty() { regSymbolSku(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOL_SKU: {varchar(255)}
     */
    public void setSymbolSku_IsNotNull() { regSymbolSku(CK_ISNN, DOBJ); }

    protected void regSymbolSku(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolSku(), "SYMBOL_SKU"); }
    protected abstract ConditionValue xgetCValueSymbolSku();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     * @param symbolReceiveCd The value of symbolReceiveCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolReceiveCd_Equal(String symbolReceiveCd) {
        doSetSymbolReceiveCd_Equal(fRES(symbolReceiveCd));
    }

    protected void doSetSymbolReceiveCd_Equal(String symbolReceiveCd) {
        regSymbolReceiveCd(CK_EQ, symbolReceiveCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     * @param symbolReceiveCd The value of symbolReceiveCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolReceiveCd_NotEqual(String symbolReceiveCd) {
        doSetSymbolReceiveCd_NotEqual(fRES(symbolReceiveCd));
    }

    protected void doSetSymbolReceiveCd_NotEqual(String symbolReceiveCd) {
        regSymbolReceiveCd(CK_NES, symbolReceiveCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     * @param symbolReceiveCd The value of symbolReceiveCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolReceiveCd_GreaterThan(String symbolReceiveCd) {
        regSymbolReceiveCd(CK_GT, fRES(symbolReceiveCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     * @param symbolReceiveCd The value of symbolReceiveCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolReceiveCd_LessThan(String symbolReceiveCd) {
        regSymbolReceiveCd(CK_LT, fRES(symbolReceiveCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     * @param symbolReceiveCd The value of symbolReceiveCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolReceiveCd_GreaterEqual(String symbolReceiveCd) {
        regSymbolReceiveCd(CK_GE, fRES(symbolReceiveCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     * @param symbolReceiveCd The value of symbolReceiveCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolReceiveCd_LessEqual(String symbolReceiveCd) {
        regSymbolReceiveCd(CK_LE, fRES(symbolReceiveCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     * @param symbolReceiveCdList The collection of symbolReceiveCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolReceiveCd_InScope(Collection<String> symbolReceiveCdList) {
        doSetSymbolReceiveCd_InScope(symbolReceiveCdList);
    }

    protected void doSetSymbolReceiveCd_InScope(Collection<String> symbolReceiveCdList) {
        regINS(CK_INS, cTL(symbolReceiveCdList), xgetCValueSymbolReceiveCd(), "SYMBOL_RECEIVE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     * @param symbolReceiveCdList The collection of symbolReceiveCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolReceiveCd_NotInScope(Collection<String> symbolReceiveCdList) {
        doSetSymbolReceiveCd_NotInScope(symbolReceiveCdList);
    }

    protected void doSetSymbolReceiveCd_NotInScope(Collection<String> symbolReceiveCdList) {
        regINS(CK_NINS, cTL(symbolReceiveCdList), xgetCValueSymbolReceiveCd(), "SYMBOL_RECEIVE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)} <br>
     * <pre>e.g. setSymbolReceiveCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolReceiveCd The value of symbolReceiveCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolReceiveCd_LikeSearch(String symbolReceiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolReceiveCd), xgetCValueSymbolReceiveCd(), "SYMBOL_RECEIVE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     * @param symbolReceiveCd The value of symbolReceiveCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolReceiveCd_NotLikeSearch(String symbolReceiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolReceiveCd), xgetCValueSymbolReceiveCd(), "SYMBOL_RECEIVE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     * @param symbolReceiveCd The value of symbolReceiveCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolReceiveCd_PrefixSearch(String symbolReceiveCd) {
        setSymbolReceiveCd_LikeSearch(symbolReceiveCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     */
    public void setSymbolReceiveCd_IsNull() { regSymbolReceiveCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     */
    public void setSymbolReceiveCd_IsNullOrEmpty() { regSymbolReceiveCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     */
    public void setSymbolReceiveCd_IsNotNull() { regSymbolReceiveCd(CK_ISNN, DOBJ); }

    protected void regSymbolReceiveCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolReceiveCd(), "SYMBOL_RECEIVE_CD"); }
    protected abstract ConditionValue xgetCValueSymbolReceiveCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     * @param symbolProductMark The value of symbolProductMark as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolProductMark_Equal(String symbolProductMark) {
        doSetSymbolProductMark_Equal(fRES(symbolProductMark));
    }

    protected void doSetSymbolProductMark_Equal(String symbolProductMark) {
        regSymbolProductMark(CK_EQ, symbolProductMark);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     * @param symbolProductMark The value of symbolProductMark as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolProductMark_NotEqual(String symbolProductMark) {
        doSetSymbolProductMark_NotEqual(fRES(symbolProductMark));
    }

    protected void doSetSymbolProductMark_NotEqual(String symbolProductMark) {
        regSymbolProductMark(CK_NES, symbolProductMark);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     * @param symbolProductMark The value of symbolProductMark as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolProductMark_GreaterThan(String symbolProductMark) {
        regSymbolProductMark(CK_GT, fRES(symbolProductMark));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     * @param symbolProductMark The value of symbolProductMark as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolProductMark_LessThan(String symbolProductMark) {
        regSymbolProductMark(CK_LT, fRES(symbolProductMark));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     * @param symbolProductMark The value of symbolProductMark as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolProductMark_GreaterEqual(String symbolProductMark) {
        regSymbolProductMark(CK_GE, fRES(symbolProductMark));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     * @param symbolProductMark The value of symbolProductMark as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolProductMark_LessEqual(String symbolProductMark) {
        regSymbolProductMark(CK_LE, fRES(symbolProductMark));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     * @param symbolProductMarkList The collection of symbolProductMark as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolProductMark_InScope(Collection<String> symbolProductMarkList) {
        doSetSymbolProductMark_InScope(symbolProductMarkList);
    }

    protected void doSetSymbolProductMark_InScope(Collection<String> symbolProductMarkList) {
        regINS(CK_INS, cTL(symbolProductMarkList), xgetCValueSymbolProductMark(), "SYMBOL_PRODUCT_MARK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     * @param symbolProductMarkList The collection of symbolProductMark as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolProductMark_NotInScope(Collection<String> symbolProductMarkList) {
        doSetSymbolProductMark_NotInScope(symbolProductMarkList);
    }

    protected void doSetSymbolProductMark_NotInScope(Collection<String> symbolProductMarkList) {
        regINS(CK_NINS, cTL(symbolProductMarkList), xgetCValueSymbolProductMark(), "SYMBOL_PRODUCT_MARK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)} <br>
     * <pre>e.g. setSymbolProductMark_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolProductMark The value of symbolProductMark as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolProductMark_LikeSearch(String symbolProductMark, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolProductMark), xgetCValueSymbolProductMark(), "SYMBOL_PRODUCT_MARK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     * @param symbolProductMark The value of symbolProductMark as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolProductMark_NotLikeSearch(String symbolProductMark, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolProductMark), xgetCValueSymbolProductMark(), "SYMBOL_PRODUCT_MARK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     * @param symbolProductMark The value of symbolProductMark as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolProductMark_PrefixSearch(String symbolProductMark) {
        setSymbolProductMark_LikeSearch(symbolProductMark, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     */
    public void setSymbolProductMark_IsNull() { regSymbolProductMark(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     */
    public void setSymbolProductMark_IsNullOrEmpty() { regSymbolProductMark(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     */
    public void setSymbolProductMark_IsNotNull() { regSymbolProductMark(CK_ISNN, DOBJ); }

    protected void regSymbolProductMark(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolProductMark(), "SYMBOL_PRODUCT_MARK"); }
    protected abstract ConditionValue xgetCValueSymbolProductMark();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     * @param symbolOrderno The value of symbolOrderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolOrderno_Equal(String symbolOrderno) {
        doSetSymbolOrderno_Equal(fRES(symbolOrderno));
    }

    protected void doSetSymbolOrderno_Equal(String symbolOrderno) {
        regSymbolOrderno(CK_EQ, symbolOrderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     * @param symbolOrderno The value of symbolOrderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolOrderno_NotEqual(String symbolOrderno) {
        doSetSymbolOrderno_NotEqual(fRES(symbolOrderno));
    }

    protected void doSetSymbolOrderno_NotEqual(String symbolOrderno) {
        regSymbolOrderno(CK_NES, symbolOrderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     * @param symbolOrderno The value of symbolOrderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolOrderno_GreaterThan(String symbolOrderno) {
        regSymbolOrderno(CK_GT, fRES(symbolOrderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     * @param symbolOrderno The value of symbolOrderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolOrderno_LessThan(String symbolOrderno) {
        regSymbolOrderno(CK_LT, fRES(symbolOrderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     * @param symbolOrderno The value of symbolOrderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolOrderno_GreaterEqual(String symbolOrderno) {
        regSymbolOrderno(CK_GE, fRES(symbolOrderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     * @param symbolOrderno The value of symbolOrderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolOrderno_LessEqual(String symbolOrderno) {
        regSymbolOrderno(CK_LE, fRES(symbolOrderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     * @param symbolOrdernoList The collection of symbolOrderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolOrderno_InScope(Collection<String> symbolOrdernoList) {
        doSetSymbolOrderno_InScope(symbolOrdernoList);
    }

    protected void doSetSymbolOrderno_InScope(Collection<String> symbolOrdernoList) {
        regINS(CK_INS, cTL(symbolOrdernoList), xgetCValueSymbolOrderno(), "SYMBOL_ORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     * @param symbolOrdernoList The collection of symbolOrderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolOrderno_NotInScope(Collection<String> symbolOrdernoList) {
        doSetSymbolOrderno_NotInScope(symbolOrdernoList);
    }

    protected void doSetSymbolOrderno_NotInScope(Collection<String> symbolOrdernoList) {
        regINS(CK_NINS, cTL(symbolOrdernoList), xgetCValueSymbolOrderno(), "SYMBOL_ORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_ORDERNO: {varchar(255)} <br>
     * <pre>e.g. setSymbolOrderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolOrderno The value of symbolOrderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolOrderno_LikeSearch(String symbolOrderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolOrderno), xgetCValueSymbolOrderno(), "SYMBOL_ORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     * @param symbolOrderno The value of symbolOrderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolOrderno_NotLikeSearch(String symbolOrderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolOrderno), xgetCValueSymbolOrderno(), "SYMBOL_ORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     * @param symbolOrderno The value of symbolOrderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolOrderno_PrefixSearch(String symbolOrderno) {
        setSymbolOrderno_LikeSearch(symbolOrderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     */
    public void setSymbolOrderno_IsNull() { regSymbolOrderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     */
    public void setSymbolOrderno_IsNullOrEmpty() { regSymbolOrderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOL_ORDERNO: {varchar(255)}
     */
    public void setSymbolOrderno_IsNotNull() { regSymbolOrderno(CK_ISNN, DOBJ); }

    protected void regSymbolOrderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolOrderno(), "SYMBOL_ORDERNO"); }
    protected abstract ConditionValue xgetCValueSymbolOrderno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     * @param symbolPrinterno The value of symbolPrinterno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPrinterno_Equal(String symbolPrinterno) {
        doSetSymbolPrinterno_Equal(fRES(symbolPrinterno));
    }

    protected void doSetSymbolPrinterno_Equal(String symbolPrinterno) {
        regSymbolPrinterno(CK_EQ, symbolPrinterno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     * @param symbolPrinterno The value of symbolPrinterno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPrinterno_NotEqual(String symbolPrinterno) {
        doSetSymbolPrinterno_NotEqual(fRES(symbolPrinterno));
    }

    protected void doSetSymbolPrinterno_NotEqual(String symbolPrinterno) {
        regSymbolPrinterno(CK_NES, symbolPrinterno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     * @param symbolPrinterno The value of symbolPrinterno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPrinterno_GreaterThan(String symbolPrinterno) {
        regSymbolPrinterno(CK_GT, fRES(symbolPrinterno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     * @param symbolPrinterno The value of symbolPrinterno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPrinterno_LessThan(String symbolPrinterno) {
        regSymbolPrinterno(CK_LT, fRES(symbolPrinterno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     * @param symbolPrinterno The value of symbolPrinterno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPrinterno_GreaterEqual(String symbolPrinterno) {
        regSymbolPrinterno(CK_GE, fRES(symbolPrinterno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     * @param symbolPrinterno The value of symbolPrinterno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPrinterno_LessEqual(String symbolPrinterno) {
        regSymbolPrinterno(CK_LE, fRES(symbolPrinterno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     * @param symbolPrinternoList The collection of symbolPrinterno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPrinterno_InScope(Collection<String> symbolPrinternoList) {
        doSetSymbolPrinterno_InScope(symbolPrinternoList);
    }

    protected void doSetSymbolPrinterno_InScope(Collection<String> symbolPrinternoList) {
        regINS(CK_INS, cTL(symbolPrinternoList), xgetCValueSymbolPrinterno(), "SYMBOL_PRINTERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     * @param symbolPrinternoList The collection of symbolPrinterno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPrinterno_NotInScope(Collection<String> symbolPrinternoList) {
        doSetSymbolPrinterno_NotInScope(symbolPrinternoList);
    }

    protected void doSetSymbolPrinterno_NotInScope(Collection<String> symbolPrinternoList) {
        regINS(CK_NINS, cTL(symbolPrinternoList), xgetCValueSymbolPrinterno(), "SYMBOL_PRINTERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_PRINTERNO: {varchar(255)} <br>
     * <pre>e.g. setSymbolPrinterno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolPrinterno The value of symbolPrinterno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolPrinterno_LikeSearch(String symbolPrinterno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolPrinterno), xgetCValueSymbolPrinterno(), "SYMBOL_PRINTERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     * @param symbolPrinterno The value of symbolPrinterno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolPrinterno_NotLikeSearch(String symbolPrinterno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolPrinterno), xgetCValueSymbolPrinterno(), "SYMBOL_PRINTERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     * @param symbolPrinterno The value of symbolPrinterno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPrinterno_PrefixSearch(String symbolPrinterno) {
        setSymbolPrinterno_LikeSearch(symbolPrinterno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     */
    public void setSymbolPrinterno_IsNull() { regSymbolPrinterno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     */
    public void setSymbolPrinterno_IsNullOrEmpty() { regSymbolPrinterno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOL_PRINTERNO: {varchar(255)}
     */
    public void setSymbolPrinterno_IsNotNull() { regSymbolPrinterno(CK_ISNN, DOBJ); }

    protected void regSymbolPrinterno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolPrinterno(), "SYMBOL_PRINTERNO"); }
    protected abstract ConditionValue xgetCValueSymbolPrinterno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     * @param symbolMakeno The value of symbolMakeno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMakeno_Equal(String symbolMakeno) {
        doSetSymbolMakeno_Equal(fRES(symbolMakeno));
    }

    protected void doSetSymbolMakeno_Equal(String symbolMakeno) {
        regSymbolMakeno(CK_EQ, symbolMakeno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     * @param symbolMakeno The value of symbolMakeno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMakeno_NotEqual(String symbolMakeno) {
        doSetSymbolMakeno_NotEqual(fRES(symbolMakeno));
    }

    protected void doSetSymbolMakeno_NotEqual(String symbolMakeno) {
        regSymbolMakeno(CK_NES, symbolMakeno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     * @param symbolMakeno The value of symbolMakeno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMakeno_GreaterThan(String symbolMakeno) {
        regSymbolMakeno(CK_GT, fRES(symbolMakeno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     * @param symbolMakeno The value of symbolMakeno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMakeno_LessThan(String symbolMakeno) {
        regSymbolMakeno(CK_LT, fRES(symbolMakeno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     * @param symbolMakeno The value of symbolMakeno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMakeno_GreaterEqual(String symbolMakeno) {
        regSymbolMakeno(CK_GE, fRES(symbolMakeno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     * @param symbolMakeno The value of symbolMakeno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMakeno_LessEqual(String symbolMakeno) {
        regSymbolMakeno(CK_LE, fRES(symbolMakeno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     * @param symbolMakenoList The collection of symbolMakeno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMakeno_InScope(Collection<String> symbolMakenoList) {
        doSetSymbolMakeno_InScope(symbolMakenoList);
    }

    protected void doSetSymbolMakeno_InScope(Collection<String> symbolMakenoList) {
        regINS(CK_INS, cTL(symbolMakenoList), xgetCValueSymbolMakeno(), "SYMBOL_MAKENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     * @param symbolMakenoList The collection of symbolMakeno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMakeno_NotInScope(Collection<String> symbolMakenoList) {
        doSetSymbolMakeno_NotInScope(symbolMakenoList);
    }

    protected void doSetSymbolMakeno_NotInScope(Collection<String> symbolMakenoList) {
        regINS(CK_NINS, cTL(symbolMakenoList), xgetCValueSymbolMakeno(), "SYMBOL_MAKENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_MAKENO: {varchar(255)} <br>
     * <pre>e.g. setSymbolMakeno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolMakeno The value of symbolMakeno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolMakeno_LikeSearch(String symbolMakeno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolMakeno), xgetCValueSymbolMakeno(), "SYMBOL_MAKENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     * @param symbolMakeno The value of symbolMakeno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolMakeno_NotLikeSearch(String symbolMakeno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolMakeno), xgetCValueSymbolMakeno(), "SYMBOL_MAKENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     * @param symbolMakeno The value of symbolMakeno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMakeno_PrefixSearch(String symbolMakeno) {
        setSymbolMakeno_LikeSearch(symbolMakeno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     */
    public void setSymbolMakeno_IsNull() { regSymbolMakeno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     */
    public void setSymbolMakeno_IsNullOrEmpty() { regSymbolMakeno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOL_MAKENO: {varchar(255)}
     */
    public void setSymbolMakeno_IsNotNull() { regSymbolMakeno(CK_ISNN, DOBJ); }

    protected void regSymbolMakeno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolMakeno(), "SYMBOL_MAKENO"); }
    protected abstract ConditionValue xgetCValueSymbolMakeno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_LOT4: {varchar(255)}
     * @param symbolLot4 The value of symbolLot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolLot4_Equal(String symbolLot4) {
        doSetSymbolLot4_Equal(fRES(symbolLot4));
    }

    protected void doSetSymbolLot4_Equal(String symbolLot4) {
        regSymbolLot4(CK_EQ, symbolLot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_LOT4: {varchar(255)}
     * @param symbolLot4 The value of symbolLot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolLot4_NotEqual(String symbolLot4) {
        doSetSymbolLot4_NotEqual(fRES(symbolLot4));
    }

    protected void doSetSymbolLot4_NotEqual(String symbolLot4) {
        regSymbolLot4(CK_NES, symbolLot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_LOT4: {varchar(255)}
     * @param symbolLot4 The value of symbolLot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolLot4_GreaterThan(String symbolLot4) {
        regSymbolLot4(CK_GT, fRES(symbolLot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_LOT4: {varchar(255)}
     * @param symbolLot4 The value of symbolLot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolLot4_LessThan(String symbolLot4) {
        regSymbolLot4(CK_LT, fRES(symbolLot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_LOT4: {varchar(255)}
     * @param symbolLot4 The value of symbolLot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolLot4_GreaterEqual(String symbolLot4) {
        regSymbolLot4(CK_GE, fRES(symbolLot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_LOT4: {varchar(255)}
     * @param symbolLot4 The value of symbolLot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolLot4_LessEqual(String symbolLot4) {
        regSymbolLot4(CK_LE, fRES(symbolLot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_LOT4: {varchar(255)}
     * @param symbolLot4List The collection of symbolLot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolLot4_InScope(Collection<String> symbolLot4List) {
        doSetSymbolLot4_InScope(symbolLot4List);
    }

    protected void doSetSymbolLot4_InScope(Collection<String> symbolLot4List) {
        regINS(CK_INS, cTL(symbolLot4List), xgetCValueSymbolLot4(), "SYMBOL_LOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_LOT4: {varchar(255)}
     * @param symbolLot4List The collection of symbolLot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolLot4_NotInScope(Collection<String> symbolLot4List) {
        doSetSymbolLot4_NotInScope(symbolLot4List);
    }

    protected void doSetSymbolLot4_NotInScope(Collection<String> symbolLot4List) {
        regINS(CK_NINS, cTL(symbolLot4List), xgetCValueSymbolLot4(), "SYMBOL_LOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_LOT4: {varchar(255)} <br>
     * <pre>e.g. setSymbolLot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolLot4 The value of symbolLot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolLot4_LikeSearch(String symbolLot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolLot4), xgetCValueSymbolLot4(), "SYMBOL_LOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_LOT4: {varchar(255)}
     * @param symbolLot4 The value of symbolLot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolLot4_NotLikeSearch(String symbolLot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolLot4), xgetCValueSymbolLot4(), "SYMBOL_LOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_LOT4: {varchar(255)}
     * @param symbolLot4 The value of symbolLot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolLot4_PrefixSearch(String symbolLot4) {
        setSymbolLot4_LikeSearch(symbolLot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOL_LOT4: {varchar(255)}
     */
    public void setSymbolLot4_IsNull() { regSymbolLot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOL_LOT4: {varchar(255)}
     */
    public void setSymbolLot4_IsNullOrEmpty() { regSymbolLot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOL_LOT4: {varchar(255)}
     */
    public void setSymbolLot4_IsNotNull() { regSymbolLot4(CK_ISNN, DOBJ); }

    protected void regSymbolLot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolLot4(), "SYMBOL_LOT4"); }
    protected abstract ConditionValue xgetCValueSymbolLot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     * @param symbolMaketime The value of symbolMaketime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMaketime_Equal(String symbolMaketime) {
        doSetSymbolMaketime_Equal(fRES(symbolMaketime));
    }

    protected void doSetSymbolMaketime_Equal(String symbolMaketime) {
        regSymbolMaketime(CK_EQ, symbolMaketime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     * @param symbolMaketime The value of symbolMaketime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMaketime_NotEqual(String symbolMaketime) {
        doSetSymbolMaketime_NotEqual(fRES(symbolMaketime));
    }

    protected void doSetSymbolMaketime_NotEqual(String symbolMaketime) {
        regSymbolMaketime(CK_NES, symbolMaketime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     * @param symbolMaketime The value of symbolMaketime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMaketime_GreaterThan(String symbolMaketime) {
        regSymbolMaketime(CK_GT, fRES(symbolMaketime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     * @param symbolMaketime The value of symbolMaketime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMaketime_LessThan(String symbolMaketime) {
        regSymbolMaketime(CK_LT, fRES(symbolMaketime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     * @param symbolMaketime The value of symbolMaketime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMaketime_GreaterEqual(String symbolMaketime) {
        regSymbolMaketime(CK_GE, fRES(symbolMaketime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     * @param symbolMaketime The value of symbolMaketime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMaketime_LessEqual(String symbolMaketime) {
        regSymbolMaketime(CK_LE, fRES(symbolMaketime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     * @param symbolMaketimeList The collection of symbolMaketime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMaketime_InScope(Collection<String> symbolMaketimeList) {
        doSetSymbolMaketime_InScope(symbolMaketimeList);
    }

    protected void doSetSymbolMaketime_InScope(Collection<String> symbolMaketimeList) {
        regINS(CK_INS, cTL(symbolMaketimeList), xgetCValueSymbolMaketime(), "SYMBOL_MAKETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     * @param symbolMaketimeList The collection of symbolMaketime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMaketime_NotInScope(Collection<String> symbolMaketimeList) {
        doSetSymbolMaketime_NotInScope(symbolMaketimeList);
    }

    protected void doSetSymbolMaketime_NotInScope(Collection<String> symbolMaketimeList) {
        regINS(CK_NINS, cTL(symbolMaketimeList), xgetCValueSymbolMaketime(), "SYMBOL_MAKETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_MAKETIME: {varchar(255)} <br>
     * <pre>e.g. setSymbolMaketime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolMaketime The value of symbolMaketime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolMaketime_LikeSearch(String symbolMaketime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolMaketime), xgetCValueSymbolMaketime(), "SYMBOL_MAKETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     * @param symbolMaketime The value of symbolMaketime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolMaketime_NotLikeSearch(String symbolMaketime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolMaketime), xgetCValueSymbolMaketime(), "SYMBOL_MAKETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     * @param symbolMaketime The value of symbolMaketime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolMaketime_PrefixSearch(String symbolMaketime) {
        setSymbolMaketime_LikeSearch(symbolMaketime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     */
    public void setSymbolMaketime_IsNull() { regSymbolMaketime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     */
    public void setSymbolMaketime_IsNullOrEmpty() { regSymbolMaketime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOL_MAKETIME: {varchar(255)}
     */
    public void setSymbolMaketime_IsNotNull() { regSymbolMaketime(CK_ISNN, DOBJ); }

    protected void regSymbolMaketime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolMaketime(), "SYMBOL_MAKETIME"); }
    protected abstract ConditionValue xgetCValueSymbolMaketime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     * @param symbolCirculationId The value of symbolCirculationId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolCirculationId_Equal(String symbolCirculationId) {
        doSetSymbolCirculationId_Equal(fRES(symbolCirculationId));
    }

    protected void doSetSymbolCirculationId_Equal(String symbolCirculationId) {
        regSymbolCirculationId(CK_EQ, symbolCirculationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     * @param symbolCirculationId The value of symbolCirculationId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolCirculationId_NotEqual(String symbolCirculationId) {
        doSetSymbolCirculationId_NotEqual(fRES(symbolCirculationId));
    }

    protected void doSetSymbolCirculationId_NotEqual(String symbolCirculationId) {
        regSymbolCirculationId(CK_NES, symbolCirculationId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     * @param symbolCirculationId The value of symbolCirculationId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolCirculationId_GreaterThan(String symbolCirculationId) {
        regSymbolCirculationId(CK_GT, fRES(symbolCirculationId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     * @param symbolCirculationId The value of symbolCirculationId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolCirculationId_LessThan(String symbolCirculationId) {
        regSymbolCirculationId(CK_LT, fRES(symbolCirculationId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     * @param symbolCirculationId The value of symbolCirculationId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolCirculationId_GreaterEqual(String symbolCirculationId) {
        regSymbolCirculationId(CK_GE, fRES(symbolCirculationId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     * @param symbolCirculationId The value of symbolCirculationId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolCirculationId_LessEqual(String symbolCirculationId) {
        regSymbolCirculationId(CK_LE, fRES(symbolCirculationId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     * @param symbolCirculationIdList The collection of symbolCirculationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolCirculationId_InScope(Collection<String> symbolCirculationIdList) {
        doSetSymbolCirculationId_InScope(symbolCirculationIdList);
    }

    protected void doSetSymbolCirculationId_InScope(Collection<String> symbolCirculationIdList) {
        regINS(CK_INS, cTL(symbolCirculationIdList), xgetCValueSymbolCirculationId(), "SYMBOL_CIRCULATION_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     * @param symbolCirculationIdList The collection of symbolCirculationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolCirculationId_NotInScope(Collection<String> symbolCirculationIdList) {
        doSetSymbolCirculationId_NotInScope(symbolCirculationIdList);
    }

    protected void doSetSymbolCirculationId_NotInScope(Collection<String> symbolCirculationIdList) {
        regINS(CK_NINS, cTL(symbolCirculationIdList), xgetCValueSymbolCirculationId(), "SYMBOL_CIRCULATION_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)} <br>
     * <pre>e.g. setSymbolCirculationId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolCirculationId The value of symbolCirculationId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolCirculationId_LikeSearch(String symbolCirculationId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolCirculationId), xgetCValueSymbolCirculationId(), "SYMBOL_CIRCULATION_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     * @param symbolCirculationId The value of symbolCirculationId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolCirculationId_NotLikeSearch(String symbolCirculationId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolCirculationId), xgetCValueSymbolCirculationId(), "SYMBOL_CIRCULATION_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     * @param symbolCirculationId The value of symbolCirculationId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolCirculationId_PrefixSearch(String symbolCirculationId) {
        setSymbolCirculationId_LikeSearch(symbolCirculationId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     */
    public void setSymbolCirculationId_IsNull() { regSymbolCirculationId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     */
    public void setSymbolCirculationId_IsNullOrEmpty() { regSymbolCirculationId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     */
    public void setSymbolCirculationId_IsNotNull() { regSymbolCirculationId(CK_ISNN, DOBJ); }

    protected void regSymbolCirculationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolCirculationId(), "SYMBOL_CIRCULATION_ID"); }
    protected abstract ConditionValue xgetCValueSymbolCirculationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(255)}
     * @param transportCd The value of transportCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_Equal(String transportCd) {
        doSetTransportCd_Equal(fRES(transportCd));
    }

    protected void doSetTransportCd_Equal(String transportCd) {
        regTransportCd(CK_EQ, transportCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(255)}
     * @param transportCd The value of transportCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_NotEqual(String transportCd) {
        doSetTransportCd_NotEqual(fRES(transportCd));
    }

    protected void doSetTransportCd_NotEqual(String transportCd) {
        regTransportCd(CK_NES, transportCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(255)}
     * @param transportCd The value of transportCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_GreaterThan(String transportCd) {
        regTransportCd(CK_GT, fRES(transportCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(255)}
     * @param transportCd The value of transportCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_LessThan(String transportCd) {
        regTransportCd(CK_LT, fRES(transportCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(255)}
     * @param transportCd The value of transportCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_GreaterEqual(String transportCd) {
        regTransportCd(CK_GE, fRES(transportCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(255)}
     * @param transportCd The value of transportCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_LessEqual(String transportCd) {
        regTransportCd(CK_LE, fRES(transportCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_CD: {varchar(255)}
     * @param transportCdList The collection of transportCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_InScope(Collection<String> transportCdList) {
        doSetTransportCd_InScope(transportCdList);
    }

    protected void doSetTransportCd_InScope(Collection<String> transportCdList) {
        regINS(CK_INS, cTL(transportCdList), xgetCValueTransportCd(), "TRANSPORT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_CD: {varchar(255)}
     * @param transportCdList The collection of transportCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_NotInScope(Collection<String> transportCdList) {
        doSetTransportCd_NotInScope(transportCdList);
    }

    protected void doSetTransportCd_NotInScope(Collection<String> transportCdList) {
        regINS(CK_NINS, cTL(transportCdList), xgetCValueTransportCd(), "TRANSPORT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORT_CD: {varchar(255)} <br>
     * <pre>e.g. setTransportCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transportCd The value of transportCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransportCd_LikeSearch(String transportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transportCd), xgetCValueTransportCd(), "TRANSPORT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORT_CD: {varchar(255)}
     * @param transportCd The value of transportCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransportCd_NotLikeSearch(String transportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transportCd), xgetCValueTransportCd(), "TRANSPORT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORT_CD: {varchar(255)}
     * @param transportCd The value of transportCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_PrefixSearch(String transportCd) {
        setTransportCd_LikeSearch(transportCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(255)}
     */
    public void setTransportCd_IsNull() { regTransportCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(255)}
     */
    public void setTransportCd_IsNullOrEmpty() { regTransportCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(255)}
     */
    public void setTransportCd_IsNotNull() { regTransportCd(CK_ISNN, DOBJ); }

    protected void regTransportCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportCd(), "TRANSPORT_CD"); }
    protected abstract ConditionValue xgetCValueTransportCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {varchar(255)}
     * @param palletId The value of palletId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_Equal(String palletId) {
        doSetPalletId_Equal(fRES(palletId));
    }

    protected void doSetPalletId_Equal(String palletId) {
        regPalletId(CK_EQ, palletId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {varchar(255)}
     * @param palletId The value of palletId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_NotEqual(String palletId) {
        doSetPalletId_NotEqual(fRES(palletId));
    }

    protected void doSetPalletId_NotEqual(String palletId) {
        regPalletId(CK_NES, palletId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {varchar(255)}
     * @param palletId The value of palletId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_GreaterThan(String palletId) {
        regPalletId(CK_GT, fRES(palletId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {varchar(255)}
     * @param palletId The value of palletId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_LessThan(String palletId) {
        regPalletId(CK_LT, fRES(palletId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {varchar(255)}
     * @param palletId The value of palletId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_GreaterEqual(String palletId) {
        regPalletId(CK_GE, fRES(palletId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {varchar(255)}
     * @param palletId The value of palletId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_LessEqual(String palletId) {
        regPalletId(CK_LE, fRES(palletId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLET_ID: {varchar(255)}
     * @param palletIdList The collection of palletId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_InScope(Collection<String> palletIdList) {
        doSetPalletId_InScope(palletIdList);
    }

    protected void doSetPalletId_InScope(Collection<String> palletIdList) {
        regINS(CK_INS, cTL(palletIdList), xgetCValuePalletId(), "PALLET_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLET_ID: {varchar(255)}
     * @param palletIdList The collection of palletId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_NotInScope(Collection<String> palletIdList) {
        doSetPalletId_NotInScope(palletIdList);
    }

    protected void doSetPalletId_NotInScope(Collection<String> palletIdList) {
        regINS(CK_NINS, cTL(palletIdList), xgetCValuePalletId(), "PALLET_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLET_ID: {varchar(255)} <br>
     * <pre>e.g. setPalletId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palletId The value of palletId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPalletId_LikeSearch(String palletId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palletId), xgetCValuePalletId(), "PALLET_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLET_ID: {varchar(255)}
     * @param palletId The value of palletId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletId_NotLikeSearch(String palletId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletId), xgetCValuePalletId(), "PALLET_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLET_ID: {varchar(255)}
     * @param palletId The value of palletId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_PrefixSearch(String palletId) {
        setPalletId_LikeSearch(palletId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLET_ID: {varchar(255)}
     */
    public void setPalletId_IsNull() { regPalletId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PALLET_ID: {varchar(255)}
     */
    public void setPalletId_IsNullOrEmpty() { regPalletId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLET_ID: {varchar(255)}
     */
    public void setPalletId_IsNotNull() { regPalletId(CK_ISNN, DOBJ); }

    protected void regPalletId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletId(), "PALLET_ID"); }
    protected abstract ConditionValue xgetCValuePalletId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_Equal(String initNum) {
        doSetInitNum_Equal(fRES(initNum));
    }

    protected void doSetInitNum_Equal(String initNum) {
        regInitNum(CK_EQ, initNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_NotEqual(String initNum) {
        doSetInitNum_NotEqual(fRES(initNum));
    }

    protected void doSetInitNum_NotEqual(String initNum) {
        regInitNum(CK_NES, initNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_GreaterThan(String initNum) {
        regInitNum(CK_GT, fRES(initNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_LessThan(String initNum) {
        regInitNum(CK_LT, fRES(initNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_GreaterEqual(String initNum) {
        regInitNum(CK_GE, fRES(initNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_LessEqual(String initNum) {
        regInitNum(CK_LE, fRES(initNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNumList The collection of initNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_InScope(Collection<String> initNumList) {
        doSetInitNum_InScope(initNumList);
    }

    protected void doSetInitNum_InScope(Collection<String> initNumList) {
        regINS(CK_INS, cTL(initNumList), xgetCValueInitNum(), "INIT_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNumList The collection of initNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_NotInScope(Collection<String> initNumList) {
        doSetInitNum_NotInScope(initNumList);
    }

    protected void doSetInitNum_NotInScope(Collection<String> initNumList) {
        regINS(CK_NINS, cTL(initNumList), xgetCValueInitNum(), "INIT_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INIT_NUM: {varchar(255)} <br>
     * <pre>e.g. setInitNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param initNum The value of initNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInitNum_LikeSearch(String initNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(initNum), xgetCValueInitNum(), "INIT_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInitNum_NotLikeSearch(String initNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(initNum), xgetCValueInitNum(), "INIT_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_PrefixSearch(String initNum) {
        setInitNum_LikeSearch(initNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     */
    public void setInitNum_IsNull() { regInitNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     */
    public void setInitNum_IsNullOrEmpty() { regInitNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     */
    public void setInitNum_IsNotNull() { regInitNum(CK_ISNN, DOBJ); }

    protected void regInitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInitNum(), "INIT_NUM"); }
    protected abstract ConditionValue xgetCValueInitNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_Equal(String createDatetime) {
        doSetCreateDatetime_Equal(fRES(createDatetime));
    }

    protected void doSetCreateDatetime_Equal(String createDatetime) {
        regCreateDatetime(CK_EQ, createDatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_NotEqual(String createDatetime) {
        doSetCreateDatetime_NotEqual(fRES(createDatetime));
    }

    protected void doSetCreateDatetime_NotEqual(String createDatetime) {
        regCreateDatetime(CK_NES, createDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_GreaterThan(String createDatetime) {
        regCreateDatetime(CK_GT, fRES(createDatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_LessThan(String createDatetime) {
        regCreateDatetime(CK_LT, fRES(createDatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_GreaterEqual(String createDatetime) {
        regCreateDatetime(CK_GE, fRES(createDatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_LessEqual(String createDatetime) {
        regCreateDatetime(CK_LE, fRES(createDatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetimeList The collection of createDatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_InScope(Collection<String> createDatetimeList) {
        doSetCreateDatetime_InScope(createDatetimeList);
    }

    protected void doSetCreateDatetime_InScope(Collection<String> createDatetimeList) {
        regINS(CK_INS, cTL(createDatetimeList), xgetCValueCreateDatetime(), "CREATE_DATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetimeList The collection of createDatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_NotInScope(Collection<String> createDatetimeList) {
        doSetCreateDatetime_NotInScope(createDatetimeList);
    }

    protected void doSetCreateDatetime_NotInScope(Collection<String> createDatetimeList) {
        regINS(CK_NINS, cTL(createDatetimeList), xgetCValueCreateDatetime(), "CREATE_DATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_DATETIME: {varchar(255)} <br>
     * <pre>e.g. setCreateDatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createDatetime The value of createDatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreateDatetime_LikeSearch(String createDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createDatetime), xgetCValueCreateDatetime(), "CREATE_DATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreateDatetime_NotLikeSearch(String createDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createDatetime), xgetCValueCreateDatetime(), "CREATE_DATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_PrefixSearch(String createDatetime) {
        setCreateDatetime_LikeSearch(createDatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     */
    public void setCreateDatetime_IsNull() { regCreateDatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     */
    public void setCreateDatetime_IsNullOrEmpty() { regCreateDatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     */
    public void setCreateDatetime_IsNotNull() { regCreateDatetime(CK_ISNN, DOBJ); }

    protected void regCreateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreateDatetime(), "CREATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueCreateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_DATETIME: {varchar(255)}
     * @param sortingDatetime The value of sortingDatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingDatetime_Equal(String sortingDatetime) {
        doSetSortingDatetime_Equal(fRES(sortingDatetime));
    }

    protected void doSetSortingDatetime_Equal(String sortingDatetime) {
        regSortingDatetime(CK_EQ, sortingDatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_DATETIME: {varchar(255)}
     * @param sortingDatetime The value of sortingDatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingDatetime_NotEqual(String sortingDatetime) {
        doSetSortingDatetime_NotEqual(fRES(sortingDatetime));
    }

    protected void doSetSortingDatetime_NotEqual(String sortingDatetime) {
        regSortingDatetime(CK_NES, sortingDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_DATETIME: {varchar(255)}
     * @param sortingDatetime The value of sortingDatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingDatetime_GreaterThan(String sortingDatetime) {
        regSortingDatetime(CK_GT, fRES(sortingDatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_DATETIME: {varchar(255)}
     * @param sortingDatetime The value of sortingDatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingDatetime_LessThan(String sortingDatetime) {
        regSortingDatetime(CK_LT, fRES(sortingDatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_DATETIME: {varchar(255)}
     * @param sortingDatetime The value of sortingDatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingDatetime_GreaterEqual(String sortingDatetime) {
        regSortingDatetime(CK_GE, fRES(sortingDatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTING_DATETIME: {varchar(255)}
     * @param sortingDatetime The value of sortingDatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingDatetime_LessEqual(String sortingDatetime) {
        regSortingDatetime(CK_LE, fRES(sortingDatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTING_DATETIME: {varchar(255)}
     * @param sortingDatetimeList The collection of sortingDatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingDatetime_InScope(Collection<String> sortingDatetimeList) {
        doSetSortingDatetime_InScope(sortingDatetimeList);
    }

    protected void doSetSortingDatetime_InScope(Collection<String> sortingDatetimeList) {
        regINS(CK_INS, cTL(sortingDatetimeList), xgetCValueSortingDatetime(), "SORTING_DATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTING_DATETIME: {varchar(255)}
     * @param sortingDatetimeList The collection of sortingDatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingDatetime_NotInScope(Collection<String> sortingDatetimeList) {
        doSetSortingDatetime_NotInScope(sortingDatetimeList);
    }

    protected void doSetSortingDatetime_NotInScope(Collection<String> sortingDatetimeList) {
        regINS(CK_NINS, cTL(sortingDatetimeList), xgetCValueSortingDatetime(), "SORTING_DATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_DATETIME: {varchar(255)} <br>
     * <pre>e.g. setSortingDatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortingDatetime The value of sortingDatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortingDatetime_LikeSearch(String sortingDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortingDatetime), xgetCValueSortingDatetime(), "SORTING_DATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_DATETIME: {varchar(255)}
     * @param sortingDatetime The value of sortingDatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortingDatetime_NotLikeSearch(String sortingDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortingDatetime), xgetCValueSortingDatetime(), "SORTING_DATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTING_DATETIME: {varchar(255)}
     * @param sortingDatetime The value of sortingDatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortingDatetime_PrefixSearch(String sortingDatetime) {
        setSortingDatetime_LikeSearch(sortingDatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORTING_DATETIME: {varchar(255)}
     */
    public void setSortingDatetime_IsNull() { regSortingDatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SORTING_DATETIME: {varchar(255)}
     */
    public void setSortingDatetime_IsNullOrEmpty() { regSortingDatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORTING_DATETIME: {varchar(255)}
     */
    public void setSortingDatetime_IsNotNull() { regSortingDatetime(CK_ISNN, DOBJ); }

    protected void regSortingDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortingDatetime(), "SORTING_DATETIME"); }
    protected abstract ConditionValue xgetCValueSortingDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_Equal(String traceType) {
        doSetTraceType_Equal(fRES(traceType));
    }

    protected void doSetTraceType_Equal(String traceType) {
        regTraceType(CK_EQ, traceType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_NotEqual(String traceType) {
        doSetTraceType_NotEqual(fRES(traceType));
    }

    protected void doSetTraceType_NotEqual(String traceType) {
        regTraceType(CK_NES, traceType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_GreaterThan(String traceType) {
        regTraceType(CK_GT, fRES(traceType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_LessThan(String traceType) {
        regTraceType(CK_LT, fRES(traceType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_GreaterEqual(String traceType) {
        regTraceType(CK_GE, fRES(traceType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_LessEqual(String traceType) {
        regTraceType(CK_LE, fRES(traceType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceTypeList The collection of traceType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_InScope(Collection<String> traceTypeList) {
        doSetTraceType_InScope(traceTypeList);
    }

    protected void doSetTraceType_InScope(Collection<String> traceTypeList) {
        regINS(CK_INS, cTL(traceTypeList), xgetCValueTraceType(), "TRACE_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceTypeList The collection of traceType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_NotInScope(Collection<String> traceTypeList) {
        doSetTraceType_NotInScope(traceTypeList);
    }

    protected void doSetTraceType_NotInScope(Collection<String> traceTypeList) {
        regINS(CK_NINS, cTL(traceTypeList), xgetCValueTraceType(), "TRACE_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACE_TYPE: {varchar(255)} <br>
     * <pre>e.g. setTraceType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param traceType The value of traceType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTraceType_LikeSearch(String traceType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(traceType), xgetCValueTraceType(), "TRACE_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTraceType_NotLikeSearch(String traceType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(traceType), xgetCValueTraceType(), "TRACE_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_PrefixSearch(String traceType) {
        setTraceType_LikeSearch(traceType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     */
    public void setTraceType_IsNull() { regTraceType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     */
    public void setTraceType_IsNullOrEmpty() { regTraceType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     */
    public void setTraceType_IsNotNull() { regTraceType(CK_ISNN, DOBJ); }

    protected void regTraceType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTraceType(), "TRACE_TYPE"); }
    protected abstract ConditionValue xgetCValueTraceType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_Equal(String lineBlock) {
        doSetLineBlock_Equal(fRES(lineBlock));
    }

    protected void doSetLineBlock_Equal(String lineBlock) {
        regLineBlock(CK_EQ, lineBlock);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_NotEqual(String lineBlock) {
        doSetLineBlock_NotEqual(fRES(lineBlock));
    }

    protected void doSetLineBlock_NotEqual(String lineBlock) {
        regLineBlock(CK_NES, lineBlock);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_GreaterThan(String lineBlock) {
        regLineBlock(CK_GT, fRES(lineBlock));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_LessThan(String lineBlock) {
        regLineBlock(CK_LT, fRES(lineBlock));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_GreaterEqual(String lineBlock) {
        regLineBlock(CK_GE, fRES(lineBlock));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_LessEqual(String lineBlock) {
        regLineBlock(CK_LE, fRES(lineBlock));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlockList The collection of lineBlock as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_InScope(Collection<String> lineBlockList) {
        doSetLineBlock_InScope(lineBlockList);
    }

    protected void doSetLineBlock_InScope(Collection<String> lineBlockList) {
        regINS(CK_INS, cTL(lineBlockList), xgetCValueLineBlock(), "LINE_BLOCK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlockList The collection of lineBlock as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_NotInScope(Collection<String> lineBlockList) {
        doSetLineBlock_NotInScope(lineBlockList);
    }

    protected void doSetLineBlock_NotInScope(Collection<String> lineBlockList) {
        regINS(CK_NINS, cTL(lineBlockList), xgetCValueLineBlock(), "LINE_BLOCK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(255)} <br>
     * <pre>e.g. setLineBlock_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineBlock The value of lineBlock as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineBlock_LikeSearch(String lineBlock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineBlock), xgetCValueLineBlock(), "LINE_BLOCK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineBlock_NotLikeSearch(String lineBlock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineBlock), xgetCValueLineBlock(), "LINE_BLOCK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_PrefixSearch(String lineBlock) {
        setLineBlock_LikeSearch(lineBlock, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     */
    public void setLineBlock_IsNull() { regLineBlock(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     */
    public void setLineBlock_IsNullOrEmpty() { regLineBlock(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     */
    public void setLineBlock_IsNotNull() { regLineBlock(CK_ISNN, DOBJ); }

    protected void regLineBlock(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineBlock(), "LINE_BLOCK"); }
    protected abstract ConditionValue xgetCValueLineBlock();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     * @param assortEdUnit The value of assortEdUnit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdUnit_Equal(String assortEdUnit) {
        doSetAssortEdUnit_Equal(fRES(assortEdUnit));
    }

    protected void doSetAssortEdUnit_Equal(String assortEdUnit) {
        regAssortEdUnit(CK_EQ, assortEdUnit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     * @param assortEdUnit The value of assortEdUnit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdUnit_NotEqual(String assortEdUnit) {
        doSetAssortEdUnit_NotEqual(fRES(assortEdUnit));
    }

    protected void doSetAssortEdUnit_NotEqual(String assortEdUnit) {
        regAssortEdUnit(CK_NES, assortEdUnit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     * @param assortEdUnit The value of assortEdUnit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdUnit_GreaterThan(String assortEdUnit) {
        regAssortEdUnit(CK_GT, fRES(assortEdUnit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     * @param assortEdUnit The value of assortEdUnit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdUnit_LessThan(String assortEdUnit) {
        regAssortEdUnit(CK_LT, fRES(assortEdUnit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     * @param assortEdUnit The value of assortEdUnit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdUnit_GreaterEqual(String assortEdUnit) {
        regAssortEdUnit(CK_GE, fRES(assortEdUnit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     * @param assortEdUnit The value of assortEdUnit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdUnit_LessEqual(String assortEdUnit) {
        regAssortEdUnit(CK_LE, fRES(assortEdUnit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     * @param assortEdUnitList The collection of assortEdUnit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdUnit_InScope(Collection<String> assortEdUnitList) {
        doSetAssortEdUnit_InScope(assortEdUnitList);
    }

    protected void doSetAssortEdUnit_InScope(Collection<String> assortEdUnitList) {
        regINS(CK_INS, cTL(assortEdUnitList), xgetCValueAssortEdUnit(), "ASSORT_ED_UNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     * @param assortEdUnitList The collection of assortEdUnit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdUnit_NotInScope(Collection<String> assortEdUnitList) {
        doSetAssortEdUnit_NotInScope(assortEdUnitList);
    }

    protected void doSetAssortEdUnit_NotInScope(Collection<String> assortEdUnitList) {
        regINS(CK_NINS, cTL(assortEdUnitList), xgetCValueAssortEdUnit(), "ASSORT_ED_UNIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_ED_UNIT: {varchar(255)} <br>
     * <pre>e.g. setAssortEdUnit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortEdUnit The value of assortEdUnit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortEdUnit_LikeSearch(String assortEdUnit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortEdUnit), xgetCValueAssortEdUnit(), "ASSORT_ED_UNIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     * @param assortEdUnit The value of assortEdUnit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortEdUnit_NotLikeSearch(String assortEdUnit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortEdUnit), xgetCValueAssortEdUnit(), "ASSORT_ED_UNIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     * @param assortEdUnit The value of assortEdUnit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdUnit_PrefixSearch(String assortEdUnit) {
        setAssortEdUnit_LikeSearch(assortEdUnit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     */
    public void setAssortEdUnit_IsNull() { regAssortEdUnit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     */
    public void setAssortEdUnit_IsNullOrEmpty() { regAssortEdUnit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORT_ED_UNIT: {varchar(255)}
     */
    public void setAssortEdUnit_IsNotNull() { regAssortEdUnit(CK_ISNN, DOBJ); }

    protected void regAssortEdUnit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortEdUnit(), "ASSORT_ED_UNIT"); }
    protected abstract ConditionValue xgetCValueAssortEdUnit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     * @param assortEdIndex The value of assortEdIndex as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdIndex_Equal(String assortEdIndex) {
        doSetAssortEdIndex_Equal(fRES(assortEdIndex));
    }

    protected void doSetAssortEdIndex_Equal(String assortEdIndex) {
        regAssortEdIndex(CK_EQ, assortEdIndex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     * @param assortEdIndex The value of assortEdIndex as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdIndex_NotEqual(String assortEdIndex) {
        doSetAssortEdIndex_NotEqual(fRES(assortEdIndex));
    }

    protected void doSetAssortEdIndex_NotEqual(String assortEdIndex) {
        regAssortEdIndex(CK_NES, assortEdIndex);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     * @param assortEdIndex The value of assortEdIndex as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdIndex_GreaterThan(String assortEdIndex) {
        regAssortEdIndex(CK_GT, fRES(assortEdIndex));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     * @param assortEdIndex The value of assortEdIndex as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdIndex_LessThan(String assortEdIndex) {
        regAssortEdIndex(CK_LT, fRES(assortEdIndex));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     * @param assortEdIndex The value of assortEdIndex as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdIndex_GreaterEqual(String assortEdIndex) {
        regAssortEdIndex(CK_GE, fRES(assortEdIndex));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     * @param assortEdIndex The value of assortEdIndex as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdIndex_LessEqual(String assortEdIndex) {
        regAssortEdIndex(CK_LE, fRES(assortEdIndex));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     * @param assortEdIndexList The collection of assortEdIndex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdIndex_InScope(Collection<String> assortEdIndexList) {
        doSetAssortEdIndex_InScope(assortEdIndexList);
    }

    protected void doSetAssortEdIndex_InScope(Collection<String> assortEdIndexList) {
        regINS(CK_INS, cTL(assortEdIndexList), xgetCValueAssortEdIndex(), "ASSORT_ED_INDEX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     * @param assortEdIndexList The collection of assortEdIndex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdIndex_NotInScope(Collection<String> assortEdIndexList) {
        doSetAssortEdIndex_NotInScope(assortEdIndexList);
    }

    protected void doSetAssortEdIndex_NotInScope(Collection<String> assortEdIndexList) {
        regINS(CK_NINS, cTL(assortEdIndexList), xgetCValueAssortEdIndex(), "ASSORT_ED_INDEX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_ED_INDEX: {varchar(255)} <br>
     * <pre>e.g. setAssortEdIndex_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortEdIndex The value of assortEdIndex as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortEdIndex_LikeSearch(String assortEdIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortEdIndex), xgetCValueAssortEdIndex(), "ASSORT_ED_INDEX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     * @param assortEdIndex The value of assortEdIndex as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortEdIndex_NotLikeSearch(String assortEdIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortEdIndex), xgetCValueAssortEdIndex(), "ASSORT_ED_INDEX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     * @param assortEdIndex The value of assortEdIndex as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortEdIndex_PrefixSearch(String assortEdIndex) {
        setAssortEdIndex_LikeSearch(assortEdIndex, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     */
    public void setAssortEdIndex_IsNull() { regAssortEdIndex(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     */
    public void setAssortEdIndex_IsNullOrEmpty() { regAssortEdIndex(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORT_ED_INDEX: {varchar(255)}
     */
    public void setAssortEdIndex_IsNotNull() { regAssortEdIndex(CK_ISNN, DOBJ); }

    protected void regAssortEdIndex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortEdIndex(), "ASSORT_ED_INDEX"); }
    protected abstract ConditionValue xgetCValueAssortEdIndex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_Equal(String operationCode) {
        doSetOperationCode_Equal(fRES(operationCode));
    }

    protected void doSetOperationCode_Equal(String operationCode) {
        regOperationCode(CK_EQ, operationCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_NotEqual(String operationCode) {
        doSetOperationCode_NotEqual(fRES(operationCode));
    }

    protected void doSetOperationCode_NotEqual(String operationCode) {
        regOperationCode(CK_NES, operationCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_GreaterThan(String operationCode) {
        regOperationCode(CK_GT, fRES(operationCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_LessThan(String operationCode) {
        regOperationCode(CK_LT, fRES(operationCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_GreaterEqual(String operationCode) {
        regOperationCode(CK_GE, fRES(operationCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_LessEqual(String operationCode) {
        regOperationCode(CK_LE, fRES(operationCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCodeList The collection of operationCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_InScope(Collection<String> operationCodeList) {
        doSetOperationCode_InScope(operationCodeList);
    }

    protected void doSetOperationCode_InScope(Collection<String> operationCodeList) {
        regINS(CK_INS, cTL(operationCodeList), xgetCValueOperationCode(), "OPERATION_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCodeList The collection of operationCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_NotInScope(Collection<String> operationCodeList) {
        doSetOperationCode_NotInScope(operationCodeList);
    }

    protected void doSetOperationCode_NotInScope(Collection<String> operationCodeList) {
        regINS(CK_NINS, cTL(operationCodeList), xgetCValueOperationCode(), "OPERATION_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATION_CODE: {varchar(255)} <br>
     * <pre>e.g. setOperationCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param operationCode The value of operationCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOperationCode_LikeSearch(String operationCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(operationCode), xgetCValueOperationCode(), "OPERATION_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOperationCode_NotLikeSearch(String operationCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(operationCode), xgetCValueOperationCode(), "OPERATION_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_PrefixSearch(String operationCode) {
        setOperationCode_LikeSearch(operationCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     */
    public void setOperationCode_IsNull() { regOperationCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     */
    public void setOperationCode_IsNullOrEmpty() { regOperationCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     */
    public void setOperationCode_IsNotNull() { regOperationCode(CK_ISNN, DOBJ); }

    protected void regOperationCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOperationCode(), "OPERATION_CODE"); }
    protected abstract ConditionValue xgetCValueOperationCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_Equal(String caseInNum) {
        doSetCaseInNum_Equal(fRES(caseInNum));
    }

    protected void doSetCaseInNum_Equal(String caseInNum) {
        regCaseInNum(CK_EQ, caseInNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_NotEqual(String caseInNum) {
        doSetCaseInNum_NotEqual(fRES(caseInNum));
    }

    protected void doSetCaseInNum_NotEqual(String caseInNum) {
        regCaseInNum(CK_NES, caseInNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_GreaterThan(String caseInNum) {
        regCaseInNum(CK_GT, fRES(caseInNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_LessThan(String caseInNum) {
        regCaseInNum(CK_LT, fRES(caseInNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_GreaterEqual(String caseInNum) {
        regCaseInNum(CK_GE, fRES(caseInNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_LessEqual(String caseInNum) {
        regCaseInNum(CK_LE, fRES(caseInNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNumList The collection of caseInNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_InScope(Collection<String> caseInNumList) {
        doSetCaseInNum_InScope(caseInNumList);
    }

    protected void doSetCaseInNum_InScope(Collection<String> caseInNumList) {
        regINS(CK_INS, cTL(caseInNumList), xgetCValueCaseInNum(), "CASE_IN_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNumList The collection of caseInNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_NotInScope(Collection<String> caseInNumList) {
        doSetCaseInNum_NotInScope(caseInNumList);
    }

    protected void doSetCaseInNum_NotInScope(Collection<String> caseInNumList) {
        regINS(CK_NINS, cTL(caseInNumList), xgetCValueCaseInNum(), "CASE_IN_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_IN_NUM: {varchar(255)} <br>
     * <pre>e.g. setCaseInNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseInNum The value of caseInNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseInNum_LikeSearch(String caseInNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseInNum), xgetCValueCaseInNum(), "CASE_IN_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseInNum_NotLikeSearch(String caseInNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseInNum), xgetCValueCaseInNum(), "CASE_IN_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_PrefixSearch(String caseInNum) {
        setCaseInNum_LikeSearch(caseInNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     */
    public void setCaseInNum_IsNull() { regCaseInNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     */
    public void setCaseInNum_IsNullOrEmpty() { regCaseInNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     */
    public void setCaseInNum_IsNotNull() { regCaseInNum(CK_ISNN, DOBJ); }

    protected void regCaseInNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseInNum(), "CASE_IN_NUM"); }
    protected abstract ConditionValue xgetCValueCaseInNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_Equal(String assortNum) {
        doSetAssortNum_Equal(fRES(assortNum));
    }

    protected void doSetAssortNum_Equal(String assortNum) {
        regAssortNum(CK_EQ, assortNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_NotEqual(String assortNum) {
        doSetAssortNum_NotEqual(fRES(assortNum));
    }

    protected void doSetAssortNum_NotEqual(String assortNum) {
        regAssortNum(CK_NES, assortNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_GreaterThan(String assortNum) {
        regAssortNum(CK_GT, fRES(assortNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_LessThan(String assortNum) {
        regAssortNum(CK_LT, fRES(assortNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_GreaterEqual(String assortNum) {
        regAssortNum(CK_GE, fRES(assortNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_LessEqual(String assortNum) {
        regAssortNum(CK_LE, fRES(assortNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNumList The collection of assortNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_InScope(Collection<String> assortNumList) {
        doSetAssortNum_InScope(assortNumList);
    }

    protected void doSetAssortNum_InScope(Collection<String> assortNumList) {
        regINS(CK_INS, cTL(assortNumList), xgetCValueAssortNum(), "ASSORT_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNumList The collection of assortNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_NotInScope(Collection<String> assortNumList) {
        doSetAssortNum_NotInScope(assortNumList);
    }

    protected void doSetAssortNum_NotInScope(Collection<String> assortNumList) {
        regINS(CK_NINS, cTL(assortNumList), xgetCValueAssortNum(), "ASSORT_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_NUM: {varchar(255)} <br>
     * <pre>e.g. setAssortNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortNum The value of assortNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortNum_LikeSearch(String assortNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortNum), xgetCValueAssortNum(), "ASSORT_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortNum_NotLikeSearch(String assortNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortNum), xgetCValueAssortNum(), "ASSORT_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_PrefixSearch(String assortNum) {
        setAssortNum_LikeSearch(assortNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     */
    public void setAssortNum_IsNull() { regAssortNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     */
    public void setAssortNum_IsNullOrEmpty() { regAssortNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     */
    public void setAssortNum_IsNotNull() { regAssortNum(CK_ISNN, DOBJ); }

    protected void regAssortNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortNum(), "ASSORT_NUM"); }
    protected abstract ConditionValue xgetCValueAssortNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_Equal(String assortDifNum) {
        doSetAssortDifNum_Equal(fRES(assortDifNum));
    }

    protected void doSetAssortDifNum_Equal(String assortDifNum) {
        regAssortDifNum(CK_EQ, assortDifNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_NotEqual(String assortDifNum) {
        doSetAssortDifNum_NotEqual(fRES(assortDifNum));
    }

    protected void doSetAssortDifNum_NotEqual(String assortDifNum) {
        regAssortDifNum(CK_NES, assortDifNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_GreaterThan(String assortDifNum) {
        regAssortDifNum(CK_GT, fRES(assortDifNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_LessThan(String assortDifNum) {
        regAssortDifNum(CK_LT, fRES(assortDifNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_GreaterEqual(String assortDifNum) {
        regAssortDifNum(CK_GE, fRES(assortDifNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_LessEqual(String assortDifNum) {
        regAssortDifNum(CK_LE, fRES(assortDifNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNumList The collection of assortDifNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_InScope(Collection<String> assortDifNumList) {
        doSetAssortDifNum_InScope(assortDifNumList);
    }

    protected void doSetAssortDifNum_InScope(Collection<String> assortDifNumList) {
        regINS(CK_INS, cTL(assortDifNumList), xgetCValueAssortDifNum(), "ASSORT_DIF_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNumList The collection of assortDifNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_NotInScope(Collection<String> assortDifNumList) {
        doSetAssortDifNum_NotInScope(assortDifNumList);
    }

    protected void doSetAssortDifNum_NotInScope(Collection<String> assortDifNumList) {
        regINS(CK_NINS, cTL(assortDifNumList), xgetCValueAssortDifNum(), "ASSORT_DIF_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)} <br>
     * <pre>e.g. setAssortDifNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortDifNum The value of assortDifNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortDifNum_LikeSearch(String assortDifNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortDifNum), xgetCValueAssortDifNum(), "ASSORT_DIF_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortDifNum_NotLikeSearch(String assortDifNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortDifNum), xgetCValueAssortDifNum(), "ASSORT_DIF_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_PrefixSearch(String assortDifNum) {
        setAssortDifNum_LikeSearch(assortDifNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     */
    public void setAssortDifNum_IsNull() { regAssortDifNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     */
    public void setAssortDifNum_IsNullOrEmpty() { regAssortDifNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     */
    public void setAssortDifNum_IsNotNull() { regAssortDifNum(CK_ISNN, DOBJ); }

    protected void regAssortDifNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortDifNum(), "ASSORT_DIF_NUM"); }
    protected abstract ConditionValue xgetCValueAssortDifNum();

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
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_Equal(String pistonType) {
        doSetPistonType_Equal(fRES(pistonType));
    }

    protected void doSetPistonType_Equal(String pistonType) {
        regPistonType(CK_EQ, pistonType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_NotEqual(String pistonType) {
        doSetPistonType_NotEqual(fRES(pistonType));
    }

    protected void doSetPistonType_NotEqual(String pistonType) {
        regPistonType(CK_NES, pistonType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_GreaterThan(String pistonType) {
        regPistonType(CK_GT, fRES(pistonType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_LessThan(String pistonType) {
        regPistonType(CK_LT, fRES(pistonType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_GreaterEqual(String pistonType) {
        regPistonType(CK_GE, fRES(pistonType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_LessEqual(String pistonType) {
        regPistonType(CK_LE, fRES(pistonType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonTypeList The collection of pistonType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_InScope(Collection<String> pistonTypeList) {
        doSetPistonType_InScope(pistonTypeList);
    }

    protected void doSetPistonType_InScope(Collection<String> pistonTypeList) {
        regINS(CK_INS, cTL(pistonTypeList), xgetCValuePistonType(), "PISTON_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonTypeList The collection of pistonType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_NotInScope(Collection<String> pistonTypeList) {
        doSetPistonType_NotInScope(pistonTypeList);
    }

    protected void doSetPistonType_NotInScope(Collection<String> pistonTypeList) {
        regINS(CK_NINS, cTL(pistonTypeList), xgetCValuePistonType(), "PISTON_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTON_TYPE: {varchar(255)} <br>
     * <pre>e.g. setPistonType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pistonType The value of pistonType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPistonType_LikeSearch(String pistonType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pistonType), xgetCValuePistonType(), "PISTON_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPistonType_NotLikeSearch(String pistonType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pistonType), xgetCValuePistonType(), "PISTON_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_PrefixSearch(String pistonType) {
        setPistonType_LikeSearch(pistonType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     */
    public void setPistonType_IsNull() { regPistonType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     */
    public void setPistonType_IsNullOrEmpty() { regPistonType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     */
    public void setPistonType_IsNotNull() { regPistonType(CK_ISNN, DOBJ); }

    protected void regPistonType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePistonType(), "PISTON_TYPE"); }
    protected abstract ConditionValue xgetCValuePistonType();

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
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_Equal(String directionNum) {
        doSetDirectionNum_Equal(fRES(directionNum));
    }

    protected void doSetDirectionNum_Equal(String directionNum) {
        regDirectionNum(CK_EQ, directionNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_NotEqual(String directionNum) {
        doSetDirectionNum_NotEqual(fRES(directionNum));
    }

    protected void doSetDirectionNum_NotEqual(String directionNum) {
        regDirectionNum(CK_NES, directionNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_GreaterThan(String directionNum) {
        regDirectionNum(CK_GT, fRES(directionNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_LessThan(String directionNum) {
        regDirectionNum(CK_LT, fRES(directionNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_GreaterEqual(String directionNum) {
        regDirectionNum(CK_GE, fRES(directionNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_LessEqual(String directionNum) {
        regDirectionNum(CK_LE, fRES(directionNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNumList The collection of directionNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_InScope(Collection<String> directionNumList) {
        doSetDirectionNum_InScope(directionNumList);
    }

    protected void doSetDirectionNum_InScope(Collection<String> directionNumList) {
        regINS(CK_INS, cTL(directionNumList), xgetCValueDirectionNum(), "DIRECTION_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNumList The collection of directionNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_NotInScope(Collection<String> directionNumList) {
        doSetDirectionNum_NotInScope(directionNumList);
    }

    protected void doSetDirectionNum_NotInScope(Collection<String> directionNumList) {
        regINS(CK_NINS, cTL(directionNumList), xgetCValueDirectionNum(), "DIRECTION_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_NUM: {varchar(255)} <br>
     * <pre>e.g. setDirectionNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directionNum The value of directionNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectionNum_LikeSearch(String directionNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directionNum), xgetCValueDirectionNum(), "DIRECTION_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectionNum_NotLikeSearch(String directionNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directionNum), xgetCValueDirectionNum(), "DIRECTION_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_PrefixSearch(String directionNum) {
        setDirectionNum_LikeSearch(directionNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     */
    public void setDirectionNum_IsNull() { regDirectionNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     */
    public void setDirectionNum_IsNullOrEmpty() { regDirectionNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     */
    public void setDirectionNum_IsNotNull() { regDirectionNum(CK_ISNN, DOBJ); }

    protected void regDirectionNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectionNum(), "DIRECTION_NUM"); }
    protected abstract ConditionValue xgetCValueDirectionNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     * @param distWarehouseCd The value of distWarehouseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistWarehouseCd_Equal(String distWarehouseCd) {
        doSetDistWarehouseCd_Equal(fRES(distWarehouseCd));
    }

    protected void doSetDistWarehouseCd_Equal(String distWarehouseCd) {
        regDistWarehouseCd(CK_EQ, distWarehouseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     * @param distWarehouseCd The value of distWarehouseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistWarehouseCd_NotEqual(String distWarehouseCd) {
        doSetDistWarehouseCd_NotEqual(fRES(distWarehouseCd));
    }

    protected void doSetDistWarehouseCd_NotEqual(String distWarehouseCd) {
        regDistWarehouseCd(CK_NES, distWarehouseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     * @param distWarehouseCd The value of distWarehouseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistWarehouseCd_GreaterThan(String distWarehouseCd) {
        regDistWarehouseCd(CK_GT, fRES(distWarehouseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     * @param distWarehouseCd The value of distWarehouseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistWarehouseCd_LessThan(String distWarehouseCd) {
        regDistWarehouseCd(CK_LT, fRES(distWarehouseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     * @param distWarehouseCd The value of distWarehouseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistWarehouseCd_GreaterEqual(String distWarehouseCd) {
        regDistWarehouseCd(CK_GE, fRES(distWarehouseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     * @param distWarehouseCd The value of distWarehouseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistWarehouseCd_LessEqual(String distWarehouseCd) {
        regDistWarehouseCd(CK_LE, fRES(distWarehouseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     * @param distWarehouseCdList The collection of distWarehouseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistWarehouseCd_InScope(Collection<String> distWarehouseCdList) {
        doSetDistWarehouseCd_InScope(distWarehouseCdList);
    }

    protected void doSetDistWarehouseCd_InScope(Collection<String> distWarehouseCdList) {
        regINS(CK_INS, cTL(distWarehouseCdList), xgetCValueDistWarehouseCd(), "DIST_WAREHOUSE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     * @param distWarehouseCdList The collection of distWarehouseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistWarehouseCd_NotInScope(Collection<String> distWarehouseCdList) {
        doSetDistWarehouseCd_NotInScope(distWarehouseCdList);
    }

    protected void doSetDistWarehouseCd_NotInScope(Collection<String> distWarehouseCdList) {
        regINS(CK_NINS, cTL(distWarehouseCdList), xgetCValueDistWarehouseCd(), "DIST_WAREHOUSE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)} <br>
     * <pre>e.g. setDistWarehouseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param distWarehouseCd The value of distWarehouseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistWarehouseCd_LikeSearch(String distWarehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(distWarehouseCd), xgetCValueDistWarehouseCd(), "DIST_WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     * @param distWarehouseCd The value of distWarehouseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistWarehouseCd_NotLikeSearch(String distWarehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(distWarehouseCd), xgetCValueDistWarehouseCd(), "DIST_WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     * @param distWarehouseCd The value of distWarehouseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistWarehouseCd_PrefixSearch(String distWarehouseCd) {
        setDistWarehouseCd_LikeSearch(distWarehouseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     */
    public void setDistWarehouseCd_IsNull() { regDistWarehouseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     */
    public void setDistWarehouseCd_IsNullOrEmpty() { regDistWarehouseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIST_WAREHOUSE_CD: {varchar(255)}
     */
    public void setDistWarehouseCd_IsNotNull() { regDistWarehouseCd(CK_ISNN, DOBJ); }

    protected void regDistWarehouseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistWarehouseCd(), "DIST_WAREHOUSE_CD"); }
    protected abstract ConditionValue xgetCValueDistWarehouseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     * @param symbolRcvKey The value of symbolRcvKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolRcvKey_Equal(String symbolRcvKey) {
        doSetSymbolRcvKey_Equal(fRES(symbolRcvKey));
    }

    protected void doSetSymbolRcvKey_Equal(String symbolRcvKey) {
        regSymbolRcvKey(CK_EQ, symbolRcvKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     * @param symbolRcvKey The value of symbolRcvKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolRcvKey_NotEqual(String symbolRcvKey) {
        doSetSymbolRcvKey_NotEqual(fRES(symbolRcvKey));
    }

    protected void doSetSymbolRcvKey_NotEqual(String symbolRcvKey) {
        regSymbolRcvKey(CK_NES, symbolRcvKey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     * @param symbolRcvKey The value of symbolRcvKey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolRcvKey_GreaterThan(String symbolRcvKey) {
        regSymbolRcvKey(CK_GT, fRES(symbolRcvKey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     * @param symbolRcvKey The value of symbolRcvKey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolRcvKey_LessThan(String symbolRcvKey) {
        regSymbolRcvKey(CK_LT, fRES(symbolRcvKey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     * @param symbolRcvKey The value of symbolRcvKey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolRcvKey_GreaterEqual(String symbolRcvKey) {
        regSymbolRcvKey(CK_GE, fRES(symbolRcvKey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     * @param symbolRcvKey The value of symbolRcvKey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolRcvKey_LessEqual(String symbolRcvKey) {
        regSymbolRcvKey(CK_LE, fRES(symbolRcvKey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     * @param symbolRcvKeyList The collection of symbolRcvKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolRcvKey_InScope(Collection<String> symbolRcvKeyList) {
        doSetSymbolRcvKey_InScope(symbolRcvKeyList);
    }

    protected void doSetSymbolRcvKey_InScope(Collection<String> symbolRcvKeyList) {
        regINS(CK_INS, cTL(symbolRcvKeyList), xgetCValueSymbolRcvKey(), "SYMBOL_RCV_KEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     * @param symbolRcvKeyList The collection of symbolRcvKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolRcvKey_NotInScope(Collection<String> symbolRcvKeyList) {
        doSetSymbolRcvKey_NotInScope(symbolRcvKeyList);
    }

    protected void doSetSymbolRcvKey_NotInScope(Collection<String> symbolRcvKeyList) {
        regINS(CK_NINS, cTL(symbolRcvKeyList), xgetCValueSymbolRcvKey(), "SYMBOL_RCV_KEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_RCV_KEY: {varchar(255)} <br>
     * <pre>e.g. setSymbolRcvKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolRcvKey The value of symbolRcvKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolRcvKey_LikeSearch(String symbolRcvKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolRcvKey), xgetCValueSymbolRcvKey(), "SYMBOL_RCV_KEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     * @param symbolRcvKey The value of symbolRcvKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolRcvKey_NotLikeSearch(String symbolRcvKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolRcvKey), xgetCValueSymbolRcvKey(), "SYMBOL_RCV_KEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     * @param symbolRcvKey The value of symbolRcvKey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolRcvKey_PrefixSearch(String symbolRcvKey) {
        setSymbolRcvKey_LikeSearch(symbolRcvKey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     */
    public void setSymbolRcvKey_IsNull() { regSymbolRcvKey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     */
    public void setSymbolRcvKey_IsNullOrEmpty() { regSymbolRcvKey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOL_RCV_KEY: {varchar(255)}
     */
    public void setSymbolRcvKey_IsNotNull() { regSymbolRcvKey(CK_ISNN, DOBJ); }

    protected void regSymbolRcvKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolRcvKey(), "SYMBOL_RCV_KEY"); }
    protected abstract ConditionValue xgetCValueSymbolRcvKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {varchar(255)}
     * @param itemCd The value of itemCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_Equal(String itemCd) {
        doSetItemCd_Equal(fRES(itemCd));
    }

    protected void doSetItemCd_Equal(String itemCd) {
        regItemCd(CK_EQ, itemCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {varchar(255)}
     * @param itemCd The value of itemCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_NotEqual(String itemCd) {
        doSetItemCd_NotEqual(fRES(itemCd));
    }

    protected void doSetItemCd_NotEqual(String itemCd) {
        regItemCd(CK_NES, itemCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {varchar(255)}
     * @param itemCd The value of itemCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_GreaterThan(String itemCd) {
        regItemCd(CK_GT, fRES(itemCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {varchar(255)}
     * @param itemCd The value of itemCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_LessThan(String itemCd) {
        regItemCd(CK_LT, fRES(itemCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {varchar(255)}
     * @param itemCd The value of itemCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_GreaterEqual(String itemCd) {
        regItemCd(CK_GE, fRES(itemCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {varchar(255)}
     * @param itemCd The value of itemCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_LessEqual(String itemCd) {
        regItemCd(CK_LE, fRES(itemCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CD: {varchar(255)}
     * @param itemCdList The collection of itemCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_InScope(Collection<String> itemCdList) {
        doSetItemCd_InScope(itemCdList);
    }

    protected void doSetItemCd_InScope(Collection<String> itemCdList) {
        regINS(CK_INS, cTL(itemCdList), xgetCValueItemCd(), "ITEM_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CD: {varchar(255)}
     * @param itemCdList The collection of itemCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_NotInScope(Collection<String> itemCdList) {
        doSetItemCd_NotInScope(itemCdList);
    }

    protected void doSetItemCd_NotInScope(Collection<String> itemCdList) {
        regINS(CK_NINS, cTL(itemCdList), xgetCValueItemCd(), "ITEM_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD: {varchar(255)} <br>
     * <pre>e.g. setItemCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemCd The value of itemCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemCd_LikeSearch(String itemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemCd), xgetCValueItemCd(), "ITEM_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD: {varchar(255)}
     * @param itemCd The value of itemCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemCd_NotLikeSearch(String itemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemCd), xgetCValueItemCd(), "ITEM_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD: {varchar(255)}
     * @param itemCd The value of itemCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_PrefixSearch(String itemCd) {
        setItemCd_LikeSearch(itemCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_CD: {varchar(255)}
     */
    public void setItemCd_IsNull() { regItemCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_CD: {varchar(255)}
     */
    public void setItemCd_IsNullOrEmpty() { regItemCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_CD: {varchar(255)}
     */
    public void setItemCd_IsNotNull() { regItemCd(CK_ISNN, DOBJ); }

    protected void regItemCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemCd(), "ITEM_CD"); }
    protected abstract ConditionValue xgetCValueItemCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_Equal(String designCd) {
        doSetDesignCd_Equal(fRES(designCd));
    }

    protected void doSetDesignCd_Equal(String designCd) {
        regDesignCd(CK_EQ, designCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_NotEqual(String designCd) {
        doSetDesignCd_NotEqual(fRES(designCd));
    }

    protected void doSetDesignCd_NotEqual(String designCd) {
        regDesignCd(CK_NES, designCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_GreaterThan(String designCd) {
        regDesignCd(CK_GT, fRES(designCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_LessThan(String designCd) {
        regDesignCd(CK_LT, fRES(designCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_GreaterEqual(String designCd) {
        regDesignCd(CK_GE, fRES(designCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_LessEqual(String designCd) {
        regDesignCd(CK_LE, fRES(designCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCdList The collection of designCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_InScope(Collection<String> designCdList) {
        doSetDesignCd_InScope(designCdList);
    }

    protected void doSetDesignCd_InScope(Collection<String> designCdList) {
        regINS(CK_INS, cTL(designCdList), xgetCValueDesignCd(), "DESIGN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCdList The collection of designCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_NotInScope(Collection<String> designCdList) {
        doSetDesignCd_NotInScope(designCdList);
    }

    protected void doSetDesignCd_NotInScope(Collection<String> designCdList) {
        regINS(CK_NINS, cTL(designCdList), xgetCValueDesignCd(), "DESIGN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_CD: {varchar(255)} <br>
     * <pre>e.g. setDesignCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designCd The value of designCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesignCd_LikeSearch(String designCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designCd), xgetCValueDesignCd(), "DESIGN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesignCd_NotLikeSearch(String designCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designCd), xgetCValueDesignCd(), "DESIGN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_PrefixSearch(String designCd) {
        setDesignCd_LikeSearch(designCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     */
    public void setDesignCd_IsNull() { regDesignCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     */
    public void setDesignCd_IsNullOrEmpty() { regDesignCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     */
    public void setDesignCd_IsNotNull() { regDesignCd(CK_ISNN, DOBJ); }

    protected void regDesignCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesignCd(), "DESIGN_CD"); }
    protected abstract ConditionValue xgetCValueDesignCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESESRVE_AREA: {varchar(255)}
     * @param resesrveArea The value of resesrveArea as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResesrveArea_Equal(String resesrveArea) {
        doSetResesrveArea_Equal(fRES(resesrveArea));
    }

    protected void doSetResesrveArea_Equal(String resesrveArea) {
        regResesrveArea(CK_EQ, resesrveArea);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESESRVE_AREA: {varchar(255)}
     * @param resesrveArea The value of resesrveArea as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResesrveArea_NotEqual(String resesrveArea) {
        doSetResesrveArea_NotEqual(fRES(resesrveArea));
    }

    protected void doSetResesrveArea_NotEqual(String resesrveArea) {
        regResesrveArea(CK_NES, resesrveArea);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESESRVE_AREA: {varchar(255)}
     * @param resesrveArea The value of resesrveArea as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResesrveArea_GreaterThan(String resesrveArea) {
        regResesrveArea(CK_GT, fRES(resesrveArea));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESESRVE_AREA: {varchar(255)}
     * @param resesrveArea The value of resesrveArea as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResesrveArea_LessThan(String resesrveArea) {
        regResesrveArea(CK_LT, fRES(resesrveArea));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESESRVE_AREA: {varchar(255)}
     * @param resesrveArea The value of resesrveArea as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResesrveArea_GreaterEqual(String resesrveArea) {
        regResesrveArea(CK_GE, fRES(resesrveArea));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESESRVE_AREA: {varchar(255)}
     * @param resesrveArea The value of resesrveArea as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResesrveArea_LessEqual(String resesrveArea) {
        regResesrveArea(CK_LE, fRES(resesrveArea));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESESRVE_AREA: {varchar(255)}
     * @param resesrveAreaList The collection of resesrveArea as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResesrveArea_InScope(Collection<String> resesrveAreaList) {
        doSetResesrveArea_InScope(resesrveAreaList);
    }

    protected void doSetResesrveArea_InScope(Collection<String> resesrveAreaList) {
        regINS(CK_INS, cTL(resesrveAreaList), xgetCValueResesrveArea(), "RESESRVE_AREA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESESRVE_AREA: {varchar(255)}
     * @param resesrveAreaList The collection of resesrveArea as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResesrveArea_NotInScope(Collection<String> resesrveAreaList) {
        doSetResesrveArea_NotInScope(resesrveAreaList);
    }

    protected void doSetResesrveArea_NotInScope(Collection<String> resesrveAreaList) {
        regINS(CK_NINS, cTL(resesrveAreaList), xgetCValueResesrveArea(), "RESESRVE_AREA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESESRVE_AREA: {varchar(255)} <br>
     * <pre>e.g. setResesrveArea_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param resesrveArea The value of resesrveArea as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setResesrveArea_LikeSearch(String resesrveArea, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(resesrveArea), xgetCValueResesrveArea(), "RESESRVE_AREA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESESRVE_AREA: {varchar(255)}
     * @param resesrveArea The value of resesrveArea as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setResesrveArea_NotLikeSearch(String resesrveArea, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(resesrveArea), xgetCValueResesrveArea(), "RESESRVE_AREA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESESRVE_AREA: {varchar(255)}
     * @param resesrveArea The value of resesrveArea as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResesrveArea_PrefixSearch(String resesrveArea) {
        setResesrveArea_LikeSearch(resesrveArea, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESESRVE_AREA: {varchar(255)}
     */
    public void setResesrveArea_IsNull() { regResesrveArea(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RESESRVE_AREA: {varchar(255)}
     */
    public void setResesrveArea_IsNullOrEmpty() { regResesrveArea(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESESRVE_AREA: {varchar(255)}
     */
    public void setResesrveArea_IsNotNull() { regResesrveArea(CK_ISNN, DOBJ); }

    protected void regResesrveArea(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueResesrveArea(), "RESESRVE_AREA"); }
    protected abstract ConditionValue xgetCValueResesrveArea();

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
    public HpSLCFunction<EDutyFreeInoutResultCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EDutyFreeInoutResultCB.class);
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
    public HpSLCFunction<EDutyFreeInoutResultCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EDutyFreeInoutResultCB.class);
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
    public HpSLCFunction<EDutyFreeInoutResultCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EDutyFreeInoutResultCB.class);
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
    public HpSLCFunction<EDutyFreeInoutResultCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EDutyFreeInoutResultCB.class);
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
    public HpSLCFunction<EDutyFreeInoutResultCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EDutyFreeInoutResultCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EDutyFreeInoutResultCB&gt;() {
     *     public void query(EDutyFreeInoutResultCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EDutyFreeInoutResultCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EDutyFreeInoutResultCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EDutyFreeInoutResultCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EDutyFreeInoutResultCQ sq);

    protected EDutyFreeInoutResultCB xcreateScalarConditionCB() {
        EDutyFreeInoutResultCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EDutyFreeInoutResultCB xcreateScalarConditionPartitionByCB() {
        EDutyFreeInoutResultCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EDutyFreeInoutResultCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EDutyFreeInoutResultCB cb = new EDutyFreeInoutResultCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DUTY_FREE_INOUT_RESULT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EDutyFreeInoutResultCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EDutyFreeInoutResultCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EDutyFreeInoutResultCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EDutyFreeInoutResultCB cb = new EDutyFreeInoutResultCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DUTY_FREE_INOUT_RESULT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EDutyFreeInoutResultCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EDutyFreeInoutResultCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EDutyFreeInoutResultCB cb = new EDutyFreeInoutResultCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EDutyFreeInoutResultCQ sq);

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
    protected EDutyFreeInoutResultCB newMyCB() {
        return new EDutyFreeInoutResultCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EDutyFreeInoutResultCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of E_CORDDTAAM_SEND.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsECorddtaamSendCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsECorddtaamSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_CORDDTAAM_SEND";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corddtaamSendId The value of corddtaamSendId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorddtaamSendId_Equal(Long corddtaamSendId) {
        doSetCorddtaamSendId_Equal(corddtaamSendId);
    }

    protected void doSetCorddtaamSendId_Equal(Long corddtaamSendId) {
        regCorddtaamSendId(CK_EQ, corddtaamSendId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corddtaamSendId The value of corddtaamSendId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorddtaamSendId_NotEqual(Long corddtaamSendId) {
        doSetCorddtaamSendId_NotEqual(corddtaamSendId);
    }

    protected void doSetCorddtaamSendId_NotEqual(Long corddtaamSendId) {
        regCorddtaamSendId(CK_NES, corddtaamSendId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corddtaamSendId The value of corddtaamSendId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorddtaamSendId_GreaterThan(Long corddtaamSendId) {
        regCorddtaamSendId(CK_GT, corddtaamSendId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corddtaamSendId The value of corddtaamSendId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorddtaamSendId_LessThan(Long corddtaamSendId) {
        regCorddtaamSendId(CK_LT, corddtaamSendId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corddtaamSendId The value of corddtaamSendId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorddtaamSendId_GreaterEqual(Long corddtaamSendId) {
        regCorddtaamSendId(CK_GE, corddtaamSendId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corddtaamSendId The value of corddtaamSendId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorddtaamSendId_LessEqual(Long corddtaamSendId) {
        regCorddtaamSendId(CK_LE, corddtaamSendId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of corddtaamSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of corddtaamSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCorddtaamSendId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCorddtaamSendId(), "CORDDTAAM_SEND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corddtaamSendIdList The collection of corddtaamSendId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorddtaamSendId_InScope(Collection<Long> corddtaamSendIdList) {
        doSetCorddtaamSendId_InScope(corddtaamSendIdList);
    }

    protected void doSetCorddtaamSendId_InScope(Collection<Long> corddtaamSendIdList) {
        regINS(CK_INS, cTL(corddtaamSendIdList), xgetCValueCorddtaamSendId(), "CORDDTAAM_SEND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param corddtaamSendIdList The collection of corddtaamSendId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorddtaamSendId_NotInScope(Collection<Long> corddtaamSendIdList) {
        doSetCorddtaamSendId_NotInScope(corddtaamSendIdList);
    }

    protected void doSetCorddtaamSendId_NotInScope(Collection<Long> corddtaamSendIdList) {
        regINS(CK_NINS, cTL(corddtaamSendIdList), xgetCValueCorddtaamSendId(), "CORDDTAAM_SEND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCorddtaamSendId_IsNull() { regCorddtaamSendId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCorddtaamSendId_IsNotNull() { regCorddtaamSendId(CK_ISNN, DOBJ); }

    protected void regCorddtaamSendId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCorddtaamSendId(), "CORDDTAAM_SEND_ID"); }
    protected abstract ConditionValue xgetCValueCorddtaamSendId();

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
     * CENTER_CD: {NotNull, varchar(30)}
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
     * CENTER_CD: {NotNull, varchar(30)}
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
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
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
     * CENTER_CD: {NotNull, varchar(30)}
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
     * CENTER_CD: {NotNull, varchar(30)} <br>
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
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

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
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_Equal(String deliveryDatetime) {
        doSetDeliveryDatetime_Equal(fRES(deliveryDatetime));
    }

    protected void doSetDeliveryDatetime_Equal(String deliveryDatetime) {
        regDeliveryDatetime(CK_EQ, deliveryDatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_NotEqual(String deliveryDatetime) {
        doSetDeliveryDatetime_NotEqual(fRES(deliveryDatetime));
    }

    protected void doSetDeliveryDatetime_NotEqual(String deliveryDatetime) {
        regDeliveryDatetime(CK_NES, deliveryDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_GreaterThan(String deliveryDatetime) {
        regDeliveryDatetime(CK_GT, fRES(deliveryDatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_LessThan(String deliveryDatetime) {
        regDeliveryDatetime(CK_LT, fRES(deliveryDatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_GreaterEqual(String deliveryDatetime) {
        regDeliveryDatetime(CK_GE, fRES(deliveryDatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_LessEqual(String deliveryDatetime) {
        regDeliveryDatetime(CK_LE, fRES(deliveryDatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetimeList The collection of deliveryDatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_InScope(Collection<String> deliveryDatetimeList) {
        doSetDeliveryDatetime_InScope(deliveryDatetimeList);
    }

    protected void doSetDeliveryDatetime_InScope(Collection<String> deliveryDatetimeList) {
        regINS(CK_INS, cTL(deliveryDatetimeList), xgetCValueDeliveryDatetime(), "DELIVERY_DATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetimeList The collection of deliveryDatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_NotInScope(Collection<String> deliveryDatetimeList) {
        doSetDeliveryDatetime_NotInScope(deliveryDatetimeList);
    }

    protected void doSetDeliveryDatetime_NotInScope(Collection<String> deliveryDatetimeList) {
        regINS(CK_NINS, cTL(deliveryDatetimeList), xgetCValueDeliveryDatetime(), "DELIVERY_DATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)} <br>
     * <pre>e.g. setDeliveryDatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryDatetime The value of deliveryDatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryDatetime_LikeSearch(String deliveryDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryDatetime), xgetCValueDeliveryDatetime(), "DELIVERY_DATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryDatetime_NotLikeSearch(String deliveryDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryDatetime), xgetCValueDeliveryDatetime(), "DELIVERY_DATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_PrefixSearch(String deliveryDatetime) {
        setDeliveryDatetime_LikeSearch(deliveryDatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     */
    public void setDeliveryDatetime_IsNull() { regDeliveryDatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     */
    public void setDeliveryDatetime_IsNullOrEmpty() { regDeliveryDatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     */
    public void setDeliveryDatetime_IsNotNull() { regDeliveryDatetime(CK_ISNN, DOBJ); }

    protected void regDeliveryDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryDatetime(), "DELIVERY_DATETIME"); }
    protected abstract ConditionValue xgetCValueDeliveryDatetime();

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
     * CAP_DIRECTION_CD: {varchar(255)}
     * @param capDirectionCd The value of capDirectionCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapDirectionCd_Equal(String capDirectionCd) {
        doSetCapDirectionCd_Equal(fRES(capDirectionCd));
    }

    protected void doSetCapDirectionCd_Equal(String capDirectionCd) {
        regCapDirectionCd(CK_EQ, capDirectionCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAP_DIRECTION_CD: {varchar(255)}
     * @param capDirectionCd The value of capDirectionCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapDirectionCd_NotEqual(String capDirectionCd) {
        doSetCapDirectionCd_NotEqual(fRES(capDirectionCd));
    }

    protected void doSetCapDirectionCd_NotEqual(String capDirectionCd) {
        regCapDirectionCd(CK_NES, capDirectionCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAP_DIRECTION_CD: {varchar(255)}
     * @param capDirectionCd The value of capDirectionCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapDirectionCd_GreaterThan(String capDirectionCd) {
        regCapDirectionCd(CK_GT, fRES(capDirectionCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAP_DIRECTION_CD: {varchar(255)}
     * @param capDirectionCd The value of capDirectionCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapDirectionCd_LessThan(String capDirectionCd) {
        regCapDirectionCd(CK_LT, fRES(capDirectionCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAP_DIRECTION_CD: {varchar(255)}
     * @param capDirectionCd The value of capDirectionCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapDirectionCd_GreaterEqual(String capDirectionCd) {
        regCapDirectionCd(CK_GE, fRES(capDirectionCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAP_DIRECTION_CD: {varchar(255)}
     * @param capDirectionCd The value of capDirectionCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapDirectionCd_LessEqual(String capDirectionCd) {
        regCapDirectionCd(CK_LE, fRES(capDirectionCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CAP_DIRECTION_CD: {varchar(255)}
     * @param capDirectionCdList The collection of capDirectionCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapDirectionCd_InScope(Collection<String> capDirectionCdList) {
        doSetCapDirectionCd_InScope(capDirectionCdList);
    }

    protected void doSetCapDirectionCd_InScope(Collection<String> capDirectionCdList) {
        regINS(CK_INS, cTL(capDirectionCdList), xgetCValueCapDirectionCd(), "CAP_DIRECTION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CAP_DIRECTION_CD: {varchar(255)}
     * @param capDirectionCdList The collection of capDirectionCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapDirectionCd_NotInScope(Collection<String> capDirectionCdList) {
        doSetCapDirectionCd_NotInScope(capDirectionCdList);
    }

    protected void doSetCapDirectionCd_NotInScope(Collection<String> capDirectionCdList) {
        regINS(CK_NINS, cTL(capDirectionCdList), xgetCValueCapDirectionCd(), "CAP_DIRECTION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CAP_DIRECTION_CD: {varchar(255)} <br>
     * <pre>e.g. setCapDirectionCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param capDirectionCd The value of capDirectionCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCapDirectionCd_LikeSearch(String capDirectionCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(capDirectionCd), xgetCValueCapDirectionCd(), "CAP_DIRECTION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CAP_DIRECTION_CD: {varchar(255)}
     * @param capDirectionCd The value of capDirectionCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCapDirectionCd_NotLikeSearch(String capDirectionCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(capDirectionCd), xgetCValueCapDirectionCd(), "CAP_DIRECTION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CAP_DIRECTION_CD: {varchar(255)}
     * @param capDirectionCd The value of capDirectionCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapDirectionCd_PrefixSearch(String capDirectionCd) {
        setCapDirectionCd_LikeSearch(capDirectionCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CAP_DIRECTION_CD: {varchar(255)}
     */
    public void setCapDirectionCd_IsNull() { regCapDirectionCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CAP_DIRECTION_CD: {varchar(255)}
     */
    public void setCapDirectionCd_IsNullOrEmpty() { regCapDirectionCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CAP_DIRECTION_CD: {varchar(255)}
     */
    public void setCapDirectionCd_IsNotNull() { regCapDirectionCd(CK_ISNN, DOBJ); }

    protected void regCapDirectionCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCapDirectionCd(), "CAP_DIRECTION_CD"); }
    protected abstract ConditionValue xgetCValueCapDirectionCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     * @param capPistonType The value of capPistonType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapPistonType_Equal(String capPistonType) {
        doSetCapPistonType_Equal(fRES(capPistonType));
    }

    protected void doSetCapPistonType_Equal(String capPistonType) {
        regCapPistonType(CK_EQ, capPistonType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     * @param capPistonType The value of capPistonType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapPistonType_NotEqual(String capPistonType) {
        doSetCapPistonType_NotEqual(fRES(capPistonType));
    }

    protected void doSetCapPistonType_NotEqual(String capPistonType) {
        regCapPistonType(CK_NES, capPistonType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     * @param capPistonType The value of capPistonType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapPistonType_GreaterThan(String capPistonType) {
        regCapPistonType(CK_GT, fRES(capPistonType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     * @param capPistonType The value of capPistonType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapPistonType_LessThan(String capPistonType) {
        regCapPistonType(CK_LT, fRES(capPistonType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     * @param capPistonType The value of capPistonType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapPistonType_GreaterEqual(String capPistonType) {
        regCapPistonType(CK_GE, fRES(capPistonType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     * @param capPistonType The value of capPistonType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapPistonType_LessEqual(String capPistonType) {
        regCapPistonType(CK_LE, fRES(capPistonType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     * @param capPistonTypeList The collection of capPistonType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapPistonType_InScope(Collection<String> capPistonTypeList) {
        doSetCapPistonType_InScope(capPistonTypeList);
    }

    protected void doSetCapPistonType_InScope(Collection<String> capPistonTypeList) {
        regINS(CK_INS, cTL(capPistonTypeList), xgetCValueCapPistonType(), "CAP_PISTON_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     * @param capPistonTypeList The collection of capPistonType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapPistonType_NotInScope(Collection<String> capPistonTypeList) {
        doSetCapPistonType_NotInScope(capPistonTypeList);
    }

    protected void doSetCapPistonType_NotInScope(Collection<String> capPistonTypeList) {
        regINS(CK_NINS, cTL(capPistonTypeList), xgetCValueCapPistonType(), "CAP_PISTON_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CAP_PISTON_TYPE: {varchar(255)} <br>
     * <pre>e.g. setCapPistonType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param capPistonType The value of capPistonType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCapPistonType_LikeSearch(String capPistonType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(capPistonType), xgetCValueCapPistonType(), "CAP_PISTON_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     * @param capPistonType The value of capPistonType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCapPistonType_NotLikeSearch(String capPistonType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(capPistonType), xgetCValueCapPistonType(), "CAP_PISTON_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     * @param capPistonType The value of capPistonType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapPistonType_PrefixSearch(String capPistonType) {
        setCapPistonType_LikeSearch(capPistonType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     */
    public void setCapPistonType_IsNull() { regCapPistonType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     */
    public void setCapPistonType_IsNullOrEmpty() { regCapPistonType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CAP_PISTON_TYPE: {varchar(255)}
     */
    public void setCapPistonType_IsNotNull() { regCapPistonType(CK_ISNN, DOBJ); }

    protected void regCapPistonType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCapPistonType(), "CAP_PISTON_TYPE"); }
    protected abstract ConditionValue xgetCValueCapPistonType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_LINE_CD: {varchar(255)}
     * @param sortLineCd The value of sortLineCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortLineCd_Equal(String sortLineCd) {
        doSetSortLineCd_Equal(fRES(sortLineCd));
    }

    protected void doSetSortLineCd_Equal(String sortLineCd) {
        regSortLineCd(CK_EQ, sortLineCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_LINE_CD: {varchar(255)}
     * @param sortLineCd The value of sortLineCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortLineCd_NotEqual(String sortLineCd) {
        doSetSortLineCd_NotEqual(fRES(sortLineCd));
    }

    protected void doSetSortLineCd_NotEqual(String sortLineCd) {
        regSortLineCd(CK_NES, sortLineCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_LINE_CD: {varchar(255)}
     * @param sortLineCd The value of sortLineCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortLineCd_GreaterThan(String sortLineCd) {
        regSortLineCd(CK_GT, fRES(sortLineCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_LINE_CD: {varchar(255)}
     * @param sortLineCd The value of sortLineCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortLineCd_LessThan(String sortLineCd) {
        regSortLineCd(CK_LT, fRES(sortLineCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_LINE_CD: {varchar(255)}
     * @param sortLineCd The value of sortLineCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortLineCd_GreaterEqual(String sortLineCd) {
        regSortLineCd(CK_GE, fRES(sortLineCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_LINE_CD: {varchar(255)}
     * @param sortLineCd The value of sortLineCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortLineCd_LessEqual(String sortLineCd) {
        regSortLineCd(CK_LE, fRES(sortLineCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_LINE_CD: {varchar(255)}
     * @param sortLineCdList The collection of sortLineCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortLineCd_InScope(Collection<String> sortLineCdList) {
        doSetSortLineCd_InScope(sortLineCdList);
    }

    protected void doSetSortLineCd_InScope(Collection<String> sortLineCdList) {
        regINS(CK_INS, cTL(sortLineCdList), xgetCValueSortLineCd(), "SORT_LINE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_LINE_CD: {varchar(255)}
     * @param sortLineCdList The collection of sortLineCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortLineCd_NotInScope(Collection<String> sortLineCdList) {
        doSetSortLineCd_NotInScope(sortLineCdList);
    }

    protected void doSetSortLineCd_NotInScope(Collection<String> sortLineCdList) {
        regINS(CK_NINS, cTL(sortLineCdList), xgetCValueSortLineCd(), "SORT_LINE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_LINE_CD: {varchar(255)} <br>
     * <pre>e.g. setSortLineCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortLineCd The value of sortLineCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortLineCd_LikeSearch(String sortLineCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortLineCd), xgetCValueSortLineCd(), "SORT_LINE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_LINE_CD: {varchar(255)}
     * @param sortLineCd The value of sortLineCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortLineCd_NotLikeSearch(String sortLineCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortLineCd), xgetCValueSortLineCd(), "SORT_LINE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_LINE_CD: {varchar(255)}
     * @param sortLineCd The value of sortLineCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortLineCd_PrefixSearch(String sortLineCd) {
        setSortLineCd_LikeSearch(sortLineCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORT_LINE_CD: {varchar(255)}
     */
    public void setSortLineCd_IsNull() { regSortLineCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SORT_LINE_CD: {varchar(255)}
     */
    public void setSortLineCd_IsNullOrEmpty() { regSortLineCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORT_LINE_CD: {varchar(255)}
     */
    public void setSortLineCd_IsNotNull() { regSortLineCd(CK_ISNN, DOBJ); }

    protected void regSortLineCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortLineCd(), "SORT_LINE_CD"); }
    protected abstract ConditionValue xgetCValueSortLineCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {varchar(255)}
     * @param sortOrder The value of sortOrder as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortOrder_Equal(String sortOrder) {
        doSetSortOrder_Equal(fRES(sortOrder));
    }

    protected void doSetSortOrder_Equal(String sortOrder) {
        regSortOrder(CK_EQ, sortOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {varchar(255)}
     * @param sortOrder The value of sortOrder as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortOrder_NotEqual(String sortOrder) {
        doSetSortOrder_NotEqual(fRES(sortOrder));
    }

    protected void doSetSortOrder_NotEqual(String sortOrder) {
        regSortOrder(CK_NES, sortOrder);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {varchar(255)}
     * @param sortOrder The value of sortOrder as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortOrder_GreaterThan(String sortOrder) {
        regSortOrder(CK_GT, fRES(sortOrder));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {varchar(255)}
     * @param sortOrder The value of sortOrder as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortOrder_LessThan(String sortOrder) {
        regSortOrder(CK_LT, fRES(sortOrder));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {varchar(255)}
     * @param sortOrder The value of sortOrder as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortOrder_GreaterEqual(String sortOrder) {
        regSortOrder(CK_GE, fRES(sortOrder));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_ORDER: {varchar(255)}
     * @param sortOrder The value of sortOrder as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortOrder_LessEqual(String sortOrder) {
        regSortOrder(CK_LE, fRES(sortOrder));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_ORDER: {varchar(255)}
     * @param sortOrderList The collection of sortOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortOrder_InScope(Collection<String> sortOrderList) {
        doSetSortOrder_InScope(sortOrderList);
    }

    protected void doSetSortOrder_InScope(Collection<String> sortOrderList) {
        regINS(CK_INS, cTL(sortOrderList), xgetCValueSortOrder(), "SORT_ORDER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_ORDER: {varchar(255)}
     * @param sortOrderList The collection of sortOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortOrder_NotInScope(Collection<String> sortOrderList) {
        doSetSortOrder_NotInScope(sortOrderList);
    }

    protected void doSetSortOrder_NotInScope(Collection<String> sortOrderList) {
        regINS(CK_NINS, cTL(sortOrderList), xgetCValueSortOrder(), "SORT_ORDER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_ORDER: {varchar(255)} <br>
     * <pre>e.g. setSortOrder_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortOrder The value of sortOrder as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortOrder_LikeSearch(String sortOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortOrder), xgetCValueSortOrder(), "SORT_ORDER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_ORDER: {varchar(255)}
     * @param sortOrder The value of sortOrder as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortOrder_NotLikeSearch(String sortOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortOrder), xgetCValueSortOrder(), "SORT_ORDER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_ORDER: {varchar(255)}
     * @param sortOrder The value of sortOrder as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortOrder_PrefixSearch(String sortOrder) {
        setSortOrder_LikeSearch(sortOrder, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORT_ORDER: {varchar(255)}
     */
    public void setSortOrder_IsNull() { regSortOrder(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SORT_ORDER: {varchar(255)}
     */
    public void setSortOrder_IsNullOrEmpty() { regSortOrder(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORT_ORDER: {varchar(255)}
     */
    public void setSortOrder_IsNotNull() { regSortOrder(CK_ISNN, DOBJ); }

    protected void regSortOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortOrder(), "SORT_ORDER"); }
    protected abstract ConditionValue xgetCValueSortOrder();

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
     * SLQACB: {varchar(255)}
     * @param slqacb The value of slqacb as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqacb_Equal(String slqacb) {
        doSetSlqacb_Equal(fRES(slqacb));
    }

    protected void doSetSlqacb_Equal(String slqacb) {
        regSlqacb(CK_EQ, slqacb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {varchar(255)}
     * @param slqacb The value of slqacb as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqacb_NotEqual(String slqacb) {
        doSetSlqacb_NotEqual(fRES(slqacb));
    }

    protected void doSetSlqacb_NotEqual(String slqacb) {
        regSlqacb(CK_NES, slqacb);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {varchar(255)}
     * @param slqacb The value of slqacb as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqacb_GreaterThan(String slqacb) {
        regSlqacb(CK_GT, fRES(slqacb));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {varchar(255)}
     * @param slqacb The value of slqacb as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqacb_LessThan(String slqacb) {
        regSlqacb(CK_LT, fRES(slqacb));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {varchar(255)}
     * @param slqacb The value of slqacb as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqacb_GreaterEqual(String slqacb) {
        regSlqacb(CK_GE, fRES(slqacb));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {varchar(255)}
     * @param slqacb The value of slqacb as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqacb_LessEqual(String slqacb) {
        regSlqacb(CK_LE, fRES(slqacb));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLQACB: {varchar(255)}
     * @param slqacbList The collection of slqacb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqacb_InScope(Collection<String> slqacbList) {
        doSetSlqacb_InScope(slqacbList);
    }

    protected void doSetSlqacb_InScope(Collection<String> slqacbList) {
        regINS(CK_INS, cTL(slqacbList), xgetCValueSlqacb(), "SLQACB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLQACB: {varchar(255)}
     * @param slqacbList The collection of slqacb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqacb_NotInScope(Collection<String> slqacbList) {
        doSetSlqacb_NotInScope(slqacbList);
    }

    protected void doSetSlqacb_NotInScope(Collection<String> slqacbList) {
        regINS(CK_NINS, cTL(slqacbList), xgetCValueSlqacb(), "SLQACB");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLQACB: {varchar(255)} <br>
     * <pre>e.g. setSlqacb_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slqacb The value of slqacb as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlqacb_LikeSearch(String slqacb, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slqacb), xgetCValueSlqacb(), "SLQACB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLQACB: {varchar(255)}
     * @param slqacb The value of slqacb as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlqacb_NotLikeSearch(String slqacb, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slqacb), xgetCValueSlqacb(), "SLQACB", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLQACB: {varchar(255)}
     * @param slqacb The value of slqacb as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqacb_PrefixSearch(String slqacb) {
        setSlqacb_LikeSearch(slqacb, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLQACB: {varchar(255)}
     */
    public void setSlqacb_IsNull() { regSlqacb(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLQACB: {varchar(255)}
     */
    public void setSlqacb_IsNullOrEmpty() { regSlqacb(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLQACB: {varchar(255)}
     */
    public void setSlqacb_IsNotNull() { regSlqacb(CK_ISNN, DOBJ); }

    protected void regSlqacb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlqacb(), "SLQACB"); }
    protected abstract ConditionValue xgetCValueSlqacb();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {varchar(255)}
     * @param slqact The value of slqact as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqact_Equal(String slqact) {
        doSetSlqact_Equal(fRES(slqact));
    }

    protected void doSetSlqact_Equal(String slqact) {
        regSlqact(CK_EQ, slqact);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {varchar(255)}
     * @param slqact The value of slqact as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqact_NotEqual(String slqact) {
        doSetSlqact_NotEqual(fRES(slqact));
    }

    protected void doSetSlqact_NotEqual(String slqact) {
        regSlqact(CK_NES, slqact);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {varchar(255)}
     * @param slqact The value of slqact as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqact_GreaterThan(String slqact) {
        regSlqact(CK_GT, fRES(slqact));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {varchar(255)}
     * @param slqact The value of slqact as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqact_LessThan(String slqact) {
        regSlqact(CK_LT, fRES(slqact));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {varchar(255)}
     * @param slqact The value of slqact as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqact_GreaterEqual(String slqact) {
        regSlqact(CK_GE, fRES(slqact));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {varchar(255)}
     * @param slqact The value of slqact as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqact_LessEqual(String slqact) {
        regSlqact(CK_LE, fRES(slqact));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLQACT: {varchar(255)}
     * @param slqactList The collection of slqact as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqact_InScope(Collection<String> slqactList) {
        doSetSlqact_InScope(slqactList);
    }

    protected void doSetSlqact_InScope(Collection<String> slqactList) {
        regINS(CK_INS, cTL(slqactList), xgetCValueSlqact(), "SLQACT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLQACT: {varchar(255)}
     * @param slqactList The collection of slqact as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqact_NotInScope(Collection<String> slqactList) {
        doSetSlqact_NotInScope(slqactList);
    }

    protected void doSetSlqact_NotInScope(Collection<String> slqactList) {
        regINS(CK_NINS, cTL(slqactList), xgetCValueSlqact(), "SLQACT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLQACT: {varchar(255)} <br>
     * <pre>e.g. setSlqact_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slqact The value of slqact as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlqact_LikeSearch(String slqact, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slqact), xgetCValueSlqact(), "SLQACT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLQACT: {varchar(255)}
     * @param slqact The value of slqact as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlqact_NotLikeSearch(String slqact, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slqact), xgetCValueSlqact(), "SLQACT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLQACT: {varchar(255)}
     * @param slqact The value of slqact as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqact_PrefixSearch(String slqact) {
        setSlqact_LikeSearch(slqact, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLQACT: {varchar(255)}
     */
    public void setSlqact_IsNull() { regSlqact(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLQACT: {varchar(255)}
     */
    public void setSlqact_IsNullOrEmpty() { regSlqact(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLQACT: {varchar(255)}
     */
    public void setSlqact_IsNotNull() { regSlqact(CK_ISNN, DOBJ); }

    protected void regSlqact(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlqact(), "SLQACT"); }
    protected abstract ConditionValue xgetCValueSlqact();

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
     * LOCATION_NO: {varchar(255)}
     * @param locationNo The value of locationNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNo_Equal(String locationNo) {
        doSetLocationNo_Equal(fRES(locationNo));
    }

    protected void doSetLocationNo_Equal(String locationNo) {
        regLocationNo(CK_EQ, locationNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NO: {varchar(255)}
     * @param locationNo The value of locationNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNo_NotEqual(String locationNo) {
        doSetLocationNo_NotEqual(fRES(locationNo));
    }

    protected void doSetLocationNo_NotEqual(String locationNo) {
        regLocationNo(CK_NES, locationNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NO: {varchar(255)}
     * @param locationNo The value of locationNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNo_GreaterThan(String locationNo) {
        regLocationNo(CK_GT, fRES(locationNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NO: {varchar(255)}
     * @param locationNo The value of locationNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNo_LessThan(String locationNo) {
        regLocationNo(CK_LT, fRES(locationNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NO: {varchar(255)}
     * @param locationNo The value of locationNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNo_GreaterEqual(String locationNo) {
        regLocationNo(CK_GE, fRES(locationNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NO: {varchar(255)}
     * @param locationNo The value of locationNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNo_LessEqual(String locationNo) {
        regLocationNo(CK_LE, fRES(locationNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_NO: {varchar(255)}
     * @param locationNoList The collection of locationNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNo_InScope(Collection<String> locationNoList) {
        doSetLocationNo_InScope(locationNoList);
    }

    protected void doSetLocationNo_InScope(Collection<String> locationNoList) {
        regINS(CK_INS, cTL(locationNoList), xgetCValueLocationNo(), "LOCATION_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_NO: {varchar(255)}
     * @param locationNoList The collection of locationNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNo_NotInScope(Collection<String> locationNoList) {
        doSetLocationNo_NotInScope(locationNoList);
    }

    protected void doSetLocationNo_NotInScope(Collection<String> locationNoList) {
        regINS(CK_NINS, cTL(locationNoList), xgetCValueLocationNo(), "LOCATION_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_NO: {varchar(255)} <br>
     * <pre>e.g. setLocationNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationNo The value of locationNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationNo_LikeSearch(String locationNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationNo), xgetCValueLocationNo(), "LOCATION_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_NO: {varchar(255)}
     * @param locationNo The value of locationNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationNo_NotLikeSearch(String locationNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationNo), xgetCValueLocationNo(), "LOCATION_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_NO: {varchar(255)}
     * @param locationNo The value of locationNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNo_PrefixSearch(String locationNo) {
        setLocationNo_LikeSearch(locationNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_NO: {varchar(255)}
     */
    public void setLocationNo_IsNull() { regLocationNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_NO: {varchar(255)}
     */
    public void setLocationNo_IsNullOrEmpty() { regLocationNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_NO: {varchar(255)}
     */
    public void setLocationNo_IsNotNull() { regLocationNo(CK_ISNN, DOBJ); }

    protected void regLocationNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationNo(), "LOCATION_NO"); }
    protected abstract ConditionValue xgetCValueLocationNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_Equal(String locationType) {
        doSetLocationType_Equal(fRES(locationType));
    }

    protected void doSetLocationType_Equal(String locationType) {
        regLocationType(CK_EQ, locationType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_NotEqual(String locationType) {
        doSetLocationType_NotEqual(fRES(locationType));
    }

    protected void doSetLocationType_NotEqual(String locationType) {
        regLocationType(CK_NES, locationType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_GreaterThan(String locationType) {
        regLocationType(CK_GT, fRES(locationType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_LessThan(String locationType) {
        regLocationType(CK_LT, fRES(locationType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_GreaterEqual(String locationType) {
        regLocationType(CK_GE, fRES(locationType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_LessEqual(String locationType) {
        regLocationType(CK_LE, fRES(locationType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationTypeList The collection of locationType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_InScope(Collection<String> locationTypeList) {
        doSetLocationType_InScope(locationTypeList);
    }

    protected void doSetLocationType_InScope(Collection<String> locationTypeList) {
        regINS(CK_INS, cTL(locationTypeList), xgetCValueLocationType(), "LOCATION_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationTypeList The collection of locationType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_NotInScope(Collection<String> locationTypeList) {
        doSetLocationType_NotInScope(locationTypeList);
    }

    protected void doSetLocationType_NotInScope(Collection<String> locationTypeList) {
        regINS(CK_NINS, cTL(locationTypeList), xgetCValueLocationType(), "LOCATION_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)} <br>
     * <pre>e.g. setLocationType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationType The value of locationType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationType_LikeSearch(String locationType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationType), xgetCValueLocationType(), "LOCATION_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationType_NotLikeSearch(String locationType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationType), xgetCValueLocationType(), "LOCATION_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_PrefixSearch(String locationType) {
        setLocationType_LikeSearch(locationType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     */
    public void setLocationType_IsNull() { regLocationType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     */
    public void setLocationType_IsNullOrEmpty() { regLocationType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     */
    public void setLocationType_IsNotNull() { regLocationType(CK_ISNN, DOBJ); }

    protected void regLocationType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationType(), "LOCATION_TYPE"); }
    protected abstract ConditionValue xgetCValueLocationType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     * @param deliveryPrintRank The value of deliveryPrintRank as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryPrintRank_Equal(String deliveryPrintRank) {
        doSetDeliveryPrintRank_Equal(fRES(deliveryPrintRank));
    }

    protected void doSetDeliveryPrintRank_Equal(String deliveryPrintRank) {
        regDeliveryPrintRank(CK_EQ, deliveryPrintRank);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     * @param deliveryPrintRank The value of deliveryPrintRank as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryPrintRank_NotEqual(String deliveryPrintRank) {
        doSetDeliveryPrintRank_NotEqual(fRES(deliveryPrintRank));
    }

    protected void doSetDeliveryPrintRank_NotEqual(String deliveryPrintRank) {
        regDeliveryPrintRank(CK_NES, deliveryPrintRank);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     * @param deliveryPrintRank The value of deliveryPrintRank as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryPrintRank_GreaterThan(String deliveryPrintRank) {
        regDeliveryPrintRank(CK_GT, fRES(deliveryPrintRank));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     * @param deliveryPrintRank The value of deliveryPrintRank as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryPrintRank_LessThan(String deliveryPrintRank) {
        regDeliveryPrintRank(CK_LT, fRES(deliveryPrintRank));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     * @param deliveryPrintRank The value of deliveryPrintRank as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryPrintRank_GreaterEqual(String deliveryPrintRank) {
        regDeliveryPrintRank(CK_GE, fRES(deliveryPrintRank));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     * @param deliveryPrintRank The value of deliveryPrintRank as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryPrintRank_LessEqual(String deliveryPrintRank) {
        regDeliveryPrintRank(CK_LE, fRES(deliveryPrintRank));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     * @param deliveryPrintRankList The collection of deliveryPrintRank as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryPrintRank_InScope(Collection<String> deliveryPrintRankList) {
        doSetDeliveryPrintRank_InScope(deliveryPrintRankList);
    }

    protected void doSetDeliveryPrintRank_InScope(Collection<String> deliveryPrintRankList) {
        regINS(CK_INS, cTL(deliveryPrintRankList), xgetCValueDeliveryPrintRank(), "DELIVERY_PRINT_RANK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     * @param deliveryPrintRankList The collection of deliveryPrintRank as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryPrintRank_NotInScope(Collection<String> deliveryPrintRankList) {
        doSetDeliveryPrintRank_NotInScope(deliveryPrintRankList);
    }

    protected void doSetDeliveryPrintRank_NotInScope(Collection<String> deliveryPrintRankList) {
        regINS(CK_NINS, cTL(deliveryPrintRankList), xgetCValueDeliveryPrintRank(), "DELIVERY_PRINT_RANK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)} <br>
     * <pre>e.g. setDeliveryPrintRank_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryPrintRank The value of deliveryPrintRank as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryPrintRank_LikeSearch(String deliveryPrintRank, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryPrintRank), xgetCValueDeliveryPrintRank(), "DELIVERY_PRINT_RANK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     * @param deliveryPrintRank The value of deliveryPrintRank as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryPrintRank_NotLikeSearch(String deliveryPrintRank, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryPrintRank), xgetCValueDeliveryPrintRank(), "DELIVERY_PRINT_RANK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     * @param deliveryPrintRank The value of deliveryPrintRank as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryPrintRank_PrefixSearch(String deliveryPrintRank) {
        setDeliveryPrintRank_LikeSearch(deliveryPrintRank, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     */
    public void setDeliveryPrintRank_IsNull() { regDeliveryPrintRank(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     */
    public void setDeliveryPrintRank_IsNullOrEmpty() { regDeliveryPrintRank(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_PRINT_RANK: {varchar(255)}
     */
    public void setDeliveryPrintRank_IsNotNull() { regDeliveryPrintRank(CK_ISNN, DOBJ); }

    protected void regDeliveryPrintRank(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryPrintRank(), "DELIVERY_PRINT_RANK"); }
    protected abstract ConditionValue xgetCValueDeliveryPrintRank();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     * @param deliverySeqNo The value of deliverySeqNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySeqNo_Equal(String deliverySeqNo) {
        doSetDeliverySeqNo_Equal(fRES(deliverySeqNo));
    }

    protected void doSetDeliverySeqNo_Equal(String deliverySeqNo) {
        regDeliverySeqNo(CK_EQ, deliverySeqNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     * @param deliverySeqNo The value of deliverySeqNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySeqNo_NotEqual(String deliverySeqNo) {
        doSetDeliverySeqNo_NotEqual(fRES(deliverySeqNo));
    }

    protected void doSetDeliverySeqNo_NotEqual(String deliverySeqNo) {
        regDeliverySeqNo(CK_NES, deliverySeqNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     * @param deliverySeqNo The value of deliverySeqNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySeqNo_GreaterThan(String deliverySeqNo) {
        regDeliverySeqNo(CK_GT, fRES(deliverySeqNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     * @param deliverySeqNo The value of deliverySeqNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySeqNo_LessThan(String deliverySeqNo) {
        regDeliverySeqNo(CK_LT, fRES(deliverySeqNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     * @param deliverySeqNo The value of deliverySeqNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySeqNo_GreaterEqual(String deliverySeqNo) {
        regDeliverySeqNo(CK_GE, fRES(deliverySeqNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     * @param deliverySeqNo The value of deliverySeqNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySeqNo_LessEqual(String deliverySeqNo) {
        regDeliverySeqNo(CK_LE, fRES(deliverySeqNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     * @param deliverySeqNoList The collection of deliverySeqNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySeqNo_InScope(Collection<String> deliverySeqNoList) {
        doSetDeliverySeqNo_InScope(deliverySeqNoList);
    }

    protected void doSetDeliverySeqNo_InScope(Collection<String> deliverySeqNoList) {
        regINS(CK_INS, cTL(deliverySeqNoList), xgetCValueDeliverySeqNo(), "DELIVERY_SEQ_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     * @param deliverySeqNoList The collection of deliverySeqNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySeqNo_NotInScope(Collection<String> deliverySeqNoList) {
        doSetDeliverySeqNo_NotInScope(deliverySeqNoList);
    }

    protected void doSetDeliverySeqNo_NotInScope(Collection<String> deliverySeqNoList) {
        regINS(CK_NINS, cTL(deliverySeqNoList), xgetCValueDeliverySeqNo(), "DELIVERY_SEQ_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_SEQ_NO: {varchar(255)} <br>
     * <pre>e.g. setDeliverySeqNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliverySeqNo The value of deliverySeqNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliverySeqNo_LikeSearch(String deliverySeqNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliverySeqNo), xgetCValueDeliverySeqNo(), "DELIVERY_SEQ_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     * @param deliverySeqNo The value of deliverySeqNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliverySeqNo_NotLikeSearch(String deliverySeqNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliverySeqNo), xgetCValueDeliverySeqNo(), "DELIVERY_SEQ_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     * @param deliverySeqNo The value of deliverySeqNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySeqNo_PrefixSearch(String deliverySeqNo) {
        setDeliverySeqNo_LikeSearch(deliverySeqNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     */
    public void setDeliverySeqNo_IsNull() { regDeliverySeqNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     */
    public void setDeliverySeqNo_IsNullOrEmpty() { regDeliverySeqNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_SEQ_NO: {varchar(255)}
     */
    public void setDeliverySeqNo_IsNotNull() { regDeliverySeqNo(CK_ISNN, DOBJ); }

    protected void regDeliverySeqNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliverySeqNo(), "DELIVERY_SEQ_NO"); }
    protected abstract ConditionValue xgetCValueDeliverySeqNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     * @param deliveryBranchNo The value of deliveryBranchNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryBranchNo_Equal(String deliveryBranchNo) {
        doSetDeliveryBranchNo_Equal(fRES(deliveryBranchNo));
    }

    protected void doSetDeliveryBranchNo_Equal(String deliveryBranchNo) {
        regDeliveryBranchNo(CK_EQ, deliveryBranchNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     * @param deliveryBranchNo The value of deliveryBranchNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryBranchNo_NotEqual(String deliveryBranchNo) {
        doSetDeliveryBranchNo_NotEqual(fRES(deliveryBranchNo));
    }

    protected void doSetDeliveryBranchNo_NotEqual(String deliveryBranchNo) {
        regDeliveryBranchNo(CK_NES, deliveryBranchNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     * @param deliveryBranchNo The value of deliveryBranchNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryBranchNo_GreaterThan(String deliveryBranchNo) {
        regDeliveryBranchNo(CK_GT, fRES(deliveryBranchNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     * @param deliveryBranchNo The value of deliveryBranchNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryBranchNo_LessThan(String deliveryBranchNo) {
        regDeliveryBranchNo(CK_LT, fRES(deliveryBranchNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     * @param deliveryBranchNo The value of deliveryBranchNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryBranchNo_GreaterEqual(String deliveryBranchNo) {
        regDeliveryBranchNo(CK_GE, fRES(deliveryBranchNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     * @param deliveryBranchNo The value of deliveryBranchNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryBranchNo_LessEqual(String deliveryBranchNo) {
        regDeliveryBranchNo(CK_LE, fRES(deliveryBranchNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     * @param deliveryBranchNoList The collection of deliveryBranchNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryBranchNo_InScope(Collection<String> deliveryBranchNoList) {
        doSetDeliveryBranchNo_InScope(deliveryBranchNoList);
    }

    protected void doSetDeliveryBranchNo_InScope(Collection<String> deliveryBranchNoList) {
        regINS(CK_INS, cTL(deliveryBranchNoList), xgetCValueDeliveryBranchNo(), "DELIVERY_BRANCH_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     * @param deliveryBranchNoList The collection of deliveryBranchNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryBranchNo_NotInScope(Collection<String> deliveryBranchNoList) {
        doSetDeliveryBranchNo_NotInScope(deliveryBranchNoList);
    }

    protected void doSetDeliveryBranchNo_NotInScope(Collection<String> deliveryBranchNoList) {
        regINS(CK_NINS, cTL(deliveryBranchNoList), xgetCValueDeliveryBranchNo(), "DELIVERY_BRANCH_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)} <br>
     * <pre>e.g. setDeliveryBranchNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryBranchNo The value of deliveryBranchNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryBranchNo_LikeSearch(String deliveryBranchNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryBranchNo), xgetCValueDeliveryBranchNo(), "DELIVERY_BRANCH_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     * @param deliveryBranchNo The value of deliveryBranchNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryBranchNo_NotLikeSearch(String deliveryBranchNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryBranchNo), xgetCValueDeliveryBranchNo(), "DELIVERY_BRANCH_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     * @param deliveryBranchNo The value of deliveryBranchNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryBranchNo_PrefixSearch(String deliveryBranchNo) {
        setDeliveryBranchNo_LikeSearch(deliveryBranchNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     */
    public void setDeliveryBranchNo_IsNull() { regDeliveryBranchNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     */
    public void setDeliveryBranchNo_IsNullOrEmpty() { regDeliveryBranchNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_BRANCH_NO: {varchar(255)}
     */
    public void setDeliveryBranchNo_IsNotNull() { regDeliveryBranchNo(CK_ISNN, DOBJ); }

    protected void regDeliveryBranchNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryBranchNo(), "DELIVERY_BRANCH_NO"); }
    protected abstract ConditionValue xgetCValueDeliveryBranchNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_WORK_DT: {varchar(255)}
     * @param sortWorkDt The value of sortWorkDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortWorkDt_Equal(String sortWorkDt) {
        doSetSortWorkDt_Equal(fRES(sortWorkDt));
    }

    protected void doSetSortWorkDt_Equal(String sortWorkDt) {
        regSortWorkDt(CK_EQ, sortWorkDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_WORK_DT: {varchar(255)}
     * @param sortWorkDt The value of sortWorkDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortWorkDt_NotEqual(String sortWorkDt) {
        doSetSortWorkDt_NotEqual(fRES(sortWorkDt));
    }

    protected void doSetSortWorkDt_NotEqual(String sortWorkDt) {
        regSortWorkDt(CK_NES, sortWorkDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_WORK_DT: {varchar(255)}
     * @param sortWorkDt The value of sortWorkDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortWorkDt_GreaterThan(String sortWorkDt) {
        regSortWorkDt(CK_GT, fRES(sortWorkDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_WORK_DT: {varchar(255)}
     * @param sortWorkDt The value of sortWorkDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortWorkDt_LessThan(String sortWorkDt) {
        regSortWorkDt(CK_LT, fRES(sortWorkDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_WORK_DT: {varchar(255)}
     * @param sortWorkDt The value of sortWorkDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortWorkDt_GreaterEqual(String sortWorkDt) {
        regSortWorkDt(CK_GE, fRES(sortWorkDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_WORK_DT: {varchar(255)}
     * @param sortWorkDt The value of sortWorkDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortWorkDt_LessEqual(String sortWorkDt) {
        regSortWorkDt(CK_LE, fRES(sortWorkDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_WORK_DT: {varchar(255)}
     * @param sortWorkDtList The collection of sortWorkDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortWorkDt_InScope(Collection<String> sortWorkDtList) {
        doSetSortWorkDt_InScope(sortWorkDtList);
    }

    protected void doSetSortWorkDt_InScope(Collection<String> sortWorkDtList) {
        regINS(CK_INS, cTL(sortWorkDtList), xgetCValueSortWorkDt(), "SORT_WORK_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_WORK_DT: {varchar(255)}
     * @param sortWorkDtList The collection of sortWorkDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortWorkDt_NotInScope(Collection<String> sortWorkDtList) {
        doSetSortWorkDt_NotInScope(sortWorkDtList);
    }

    protected void doSetSortWorkDt_NotInScope(Collection<String> sortWorkDtList) {
        regINS(CK_NINS, cTL(sortWorkDtList), xgetCValueSortWorkDt(), "SORT_WORK_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_WORK_DT: {varchar(255)} <br>
     * <pre>e.g. setSortWorkDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortWorkDt The value of sortWorkDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortWorkDt_LikeSearch(String sortWorkDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortWorkDt), xgetCValueSortWorkDt(), "SORT_WORK_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_WORK_DT: {varchar(255)}
     * @param sortWorkDt The value of sortWorkDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortWorkDt_NotLikeSearch(String sortWorkDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortWorkDt), xgetCValueSortWorkDt(), "SORT_WORK_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_WORK_DT: {varchar(255)}
     * @param sortWorkDt The value of sortWorkDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortWorkDt_PrefixSearch(String sortWorkDt) {
        setSortWorkDt_LikeSearch(sortWorkDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORT_WORK_DT: {varchar(255)}
     */
    public void setSortWorkDt_IsNull() { regSortWorkDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SORT_WORK_DT: {varchar(255)}
     */
    public void setSortWorkDt_IsNullOrEmpty() { regSortWorkDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORT_WORK_DT: {varchar(255)}
     */
    public void setSortWorkDt_IsNotNull() { regSortWorkDt(CK_ISNN, DOBJ); }

    protected void regSortWorkDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortWorkDt(), "SORT_WORK_DT"); }
    protected abstract ConditionValue xgetCValueSortWorkDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSROPRTCNT: {varchar(255)}
     * @param csroprtcnt The value of csroprtcnt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsroprtcnt_Equal(String csroprtcnt) {
        doSetCsroprtcnt_Equal(fRES(csroprtcnt));
    }

    protected void doSetCsroprtcnt_Equal(String csroprtcnt) {
        regCsroprtcnt(CK_EQ, csroprtcnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSROPRTCNT: {varchar(255)}
     * @param csroprtcnt The value of csroprtcnt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsroprtcnt_NotEqual(String csroprtcnt) {
        doSetCsroprtcnt_NotEqual(fRES(csroprtcnt));
    }

    protected void doSetCsroprtcnt_NotEqual(String csroprtcnt) {
        regCsroprtcnt(CK_NES, csroprtcnt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSROPRTCNT: {varchar(255)}
     * @param csroprtcnt The value of csroprtcnt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsroprtcnt_GreaterThan(String csroprtcnt) {
        regCsroprtcnt(CK_GT, fRES(csroprtcnt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSROPRTCNT: {varchar(255)}
     * @param csroprtcnt The value of csroprtcnt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsroprtcnt_LessThan(String csroprtcnt) {
        regCsroprtcnt(CK_LT, fRES(csroprtcnt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSROPRTCNT: {varchar(255)}
     * @param csroprtcnt The value of csroprtcnt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsroprtcnt_GreaterEqual(String csroprtcnt) {
        regCsroprtcnt(CK_GE, fRES(csroprtcnt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CSROPRTCNT: {varchar(255)}
     * @param csroprtcnt The value of csroprtcnt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsroprtcnt_LessEqual(String csroprtcnt) {
        regCsroprtcnt(CK_LE, fRES(csroprtcnt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CSROPRTCNT: {varchar(255)}
     * @param csroprtcntList The collection of csroprtcnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsroprtcnt_InScope(Collection<String> csroprtcntList) {
        doSetCsroprtcnt_InScope(csroprtcntList);
    }

    protected void doSetCsroprtcnt_InScope(Collection<String> csroprtcntList) {
        regINS(CK_INS, cTL(csroprtcntList), xgetCValueCsroprtcnt(), "CSROPRTCNT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CSROPRTCNT: {varchar(255)}
     * @param csroprtcntList The collection of csroprtcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsroprtcnt_NotInScope(Collection<String> csroprtcntList) {
        doSetCsroprtcnt_NotInScope(csroprtcntList);
    }

    protected void doSetCsroprtcnt_NotInScope(Collection<String> csroprtcntList) {
        regINS(CK_NINS, cTL(csroprtcntList), xgetCValueCsroprtcnt(), "CSROPRTCNT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSROPRTCNT: {varchar(255)} <br>
     * <pre>e.g. setCsroprtcnt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param csroprtcnt The value of csroprtcnt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCsroprtcnt_LikeSearch(String csroprtcnt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(csroprtcnt), xgetCValueCsroprtcnt(), "CSROPRTCNT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSROPRTCNT: {varchar(255)}
     * @param csroprtcnt The value of csroprtcnt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCsroprtcnt_NotLikeSearch(String csroprtcnt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(csroprtcnt), xgetCValueCsroprtcnt(), "CSROPRTCNT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CSROPRTCNT: {varchar(255)}
     * @param csroprtcnt The value of csroprtcnt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsroprtcnt_PrefixSearch(String csroprtcnt) {
        setCsroprtcnt_LikeSearch(csroprtcnt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CSROPRTCNT: {varchar(255)}
     */
    public void setCsroprtcnt_IsNull() { regCsroprtcnt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CSROPRTCNT: {varchar(255)}
     */
    public void setCsroprtcnt_IsNullOrEmpty() { regCsroprtcnt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CSROPRTCNT: {varchar(255)}
     */
    public void setCsroprtcnt_IsNotNull() { regCsroprtcnt(CK_ISNN, DOBJ); }

    protected void regCsroprtcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCsroprtcnt(), "CSROPRTCNT"); }
    protected abstract ConditionValue xgetCValueCsroprtcnt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     * @param cuttopdirassord The value of cuttopdirassord as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCuttopdirassord_Equal(String cuttopdirassord) {
        doSetCuttopdirassord_Equal(fRES(cuttopdirassord));
    }

    protected void doSetCuttopdirassord_Equal(String cuttopdirassord) {
        regCuttopdirassord(CK_EQ, cuttopdirassord);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     * @param cuttopdirassord The value of cuttopdirassord as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCuttopdirassord_NotEqual(String cuttopdirassord) {
        doSetCuttopdirassord_NotEqual(fRES(cuttopdirassord));
    }

    protected void doSetCuttopdirassord_NotEqual(String cuttopdirassord) {
        regCuttopdirassord(CK_NES, cuttopdirassord);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     * @param cuttopdirassord The value of cuttopdirassord as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCuttopdirassord_GreaterThan(String cuttopdirassord) {
        regCuttopdirassord(CK_GT, fRES(cuttopdirassord));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     * @param cuttopdirassord The value of cuttopdirassord as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCuttopdirassord_LessThan(String cuttopdirassord) {
        regCuttopdirassord(CK_LT, fRES(cuttopdirassord));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     * @param cuttopdirassord The value of cuttopdirassord as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCuttopdirassord_GreaterEqual(String cuttopdirassord) {
        regCuttopdirassord(CK_GE, fRES(cuttopdirassord));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     * @param cuttopdirassord The value of cuttopdirassord as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCuttopdirassord_LessEqual(String cuttopdirassord) {
        regCuttopdirassord(CK_LE, fRES(cuttopdirassord));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     * @param cuttopdirassordList The collection of cuttopdirassord as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCuttopdirassord_InScope(Collection<String> cuttopdirassordList) {
        doSetCuttopdirassord_InScope(cuttopdirassordList);
    }

    protected void doSetCuttopdirassord_InScope(Collection<String> cuttopdirassordList) {
        regINS(CK_INS, cTL(cuttopdirassordList), xgetCValueCuttopdirassord(), "CUTTOPDIRASSORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     * @param cuttopdirassordList The collection of cuttopdirassord as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCuttopdirassord_NotInScope(Collection<String> cuttopdirassordList) {
        doSetCuttopdirassord_NotInScope(cuttopdirassordList);
    }

    protected void doSetCuttopdirassord_NotInScope(Collection<String> cuttopdirassordList) {
        regINS(CK_NINS, cTL(cuttopdirassordList), xgetCValueCuttopdirassord(), "CUTTOPDIRASSORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUTTOPDIRASSORD: {varchar(255)} <br>
     * <pre>e.g. setCuttopdirassord_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cuttopdirassord The value of cuttopdirassord as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCuttopdirassord_LikeSearch(String cuttopdirassord, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cuttopdirassord), xgetCValueCuttopdirassord(), "CUTTOPDIRASSORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     * @param cuttopdirassord The value of cuttopdirassord as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCuttopdirassord_NotLikeSearch(String cuttopdirassord, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cuttopdirassord), xgetCValueCuttopdirassord(), "CUTTOPDIRASSORD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     * @param cuttopdirassord The value of cuttopdirassord as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCuttopdirassord_PrefixSearch(String cuttopdirassord) {
        setCuttopdirassord_LikeSearch(cuttopdirassord, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     */
    public void setCuttopdirassord_IsNull() { regCuttopdirassord(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     */
    public void setCuttopdirassord_IsNullOrEmpty() { regCuttopdirassord(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUTTOPDIRASSORD: {varchar(255)}
     */
    public void setCuttopdirassord_IsNotNull() { regCuttopdirassord(CK_ISNN, DOBJ); }

    protected void regCuttopdirassord(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCuttopdirassord(), "CUTTOPDIRASSORD"); }
    protected abstract ConditionValue xgetCValueCuttopdirassord();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {varchar(255)}
     * @param productType The value of productType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_Equal(String productType) {
        doSetProductType_Equal(fRES(productType));
    }

    protected void doSetProductType_Equal(String productType) {
        regProductType(CK_EQ, productType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {varchar(255)}
     * @param productType The value of productType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_NotEqual(String productType) {
        doSetProductType_NotEqual(fRES(productType));
    }

    protected void doSetProductType_NotEqual(String productType) {
        regProductType(CK_NES, productType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {varchar(255)}
     * @param productType The value of productType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_GreaterThan(String productType) {
        regProductType(CK_GT, fRES(productType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {varchar(255)}
     * @param productType The value of productType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_LessThan(String productType) {
        regProductType(CK_LT, fRES(productType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {varchar(255)}
     * @param productType The value of productType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_GreaterEqual(String productType) {
        regProductType(CK_GE, fRES(productType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {varchar(255)}
     * @param productType The value of productType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_LessEqual(String productType) {
        regProductType(CK_LE, fRES(productType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE: {varchar(255)}
     * @param productTypeList The collection of productType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_InScope(Collection<String> productTypeList) {
        doSetProductType_InScope(productTypeList);
    }

    protected void doSetProductType_InScope(Collection<String> productTypeList) {
        regINS(CK_INS, cTL(productTypeList), xgetCValueProductType(), "PRODUCT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE: {varchar(255)}
     * @param productTypeList The collection of productType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_NotInScope(Collection<String> productTypeList) {
        doSetProductType_NotInScope(productTypeList);
    }

    protected void doSetProductType_NotInScope(Collection<String> productTypeList) {
        regINS(CK_NINS, cTL(productTypeList), xgetCValueProductType(), "PRODUCT_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE: {varchar(255)} <br>
     * <pre>e.g. setProductType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productType The value of productType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductType_LikeSearch(String productType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productType), xgetCValueProductType(), "PRODUCT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE: {varchar(255)}
     * @param productType The value of productType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductType_NotLikeSearch(String productType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productType), xgetCValueProductType(), "PRODUCT_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_TYPE: {varchar(255)}
     * @param productType The value of productType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductType_PrefixSearch(String productType) {
        setProductType_LikeSearch(productType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {varchar(255)}
     */
    public void setProductType_IsNull() { regProductType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {varchar(255)}
     */
    public void setProductType_IsNullOrEmpty() { regProductType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_TYPE: {varchar(255)}
     */
    public void setProductType_IsNotNull() { regProductType(CK_ISNN, DOBJ); }

    protected void regProductType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductType(), "PRODUCT_TYPE"); }
    protected abstract ConditionValue xgetCValueProductType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NO: {varchar(255)}
     * @param boxNo The value of boxNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNo_Equal(String boxNo) {
        doSetBoxNo_Equal(fRES(boxNo));
    }

    protected void doSetBoxNo_Equal(String boxNo) {
        regBoxNo(CK_EQ, boxNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NO: {varchar(255)}
     * @param boxNo The value of boxNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNo_NotEqual(String boxNo) {
        doSetBoxNo_NotEqual(fRES(boxNo));
    }

    protected void doSetBoxNo_NotEqual(String boxNo) {
        regBoxNo(CK_NES, boxNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NO: {varchar(255)}
     * @param boxNo The value of boxNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNo_GreaterThan(String boxNo) {
        regBoxNo(CK_GT, fRES(boxNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NO: {varchar(255)}
     * @param boxNo The value of boxNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNo_LessThan(String boxNo) {
        regBoxNo(CK_LT, fRES(boxNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NO: {varchar(255)}
     * @param boxNo The value of boxNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNo_GreaterEqual(String boxNo) {
        regBoxNo(CK_GE, fRES(boxNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NO: {varchar(255)}
     * @param boxNo The value of boxNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNo_LessEqual(String boxNo) {
        regBoxNo(CK_LE, fRES(boxNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_NO: {varchar(255)}
     * @param boxNoList The collection of boxNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNo_InScope(Collection<String> boxNoList) {
        doSetBoxNo_InScope(boxNoList);
    }

    protected void doSetBoxNo_InScope(Collection<String> boxNoList) {
        regINS(CK_INS, cTL(boxNoList), xgetCValueBoxNo(), "BOX_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_NO: {varchar(255)}
     * @param boxNoList The collection of boxNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNo_NotInScope(Collection<String> boxNoList) {
        doSetBoxNo_NotInScope(boxNoList);
    }

    protected void doSetBoxNo_NotInScope(Collection<String> boxNoList) {
        regINS(CK_NINS, cTL(boxNoList), xgetCValueBoxNo(), "BOX_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_NO: {varchar(255)} <br>
     * <pre>e.g. setBoxNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxNo The value of boxNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxNo_LikeSearch(String boxNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxNo), xgetCValueBoxNo(), "BOX_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_NO: {varchar(255)}
     * @param boxNo The value of boxNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxNo_NotLikeSearch(String boxNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxNo), xgetCValueBoxNo(), "BOX_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_NO: {varchar(255)}
     * @param boxNo The value of boxNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNo_PrefixSearch(String boxNo) {
        setBoxNo_LikeSearch(boxNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_NO: {varchar(255)}
     */
    public void setBoxNo_IsNull() { regBoxNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOX_NO: {varchar(255)}
     */
    public void setBoxNo_IsNullOrEmpty() { regBoxNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_NO: {varchar(255)}
     */
    public void setBoxNo_IsNotNull() { regBoxNo(CK_ISNN, DOBJ); }

    protected void regBoxNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxNo(), "BOX_NO"); }
    protected abstract ConditionValue xgetCValueBoxNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     * @param boxNoSeqNo The value of boxNoSeqNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNoSeqNo_Equal(String boxNoSeqNo) {
        doSetBoxNoSeqNo_Equal(fRES(boxNoSeqNo));
    }

    protected void doSetBoxNoSeqNo_Equal(String boxNoSeqNo) {
        regBoxNoSeqNo(CK_EQ, boxNoSeqNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     * @param boxNoSeqNo The value of boxNoSeqNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNoSeqNo_NotEqual(String boxNoSeqNo) {
        doSetBoxNoSeqNo_NotEqual(fRES(boxNoSeqNo));
    }

    protected void doSetBoxNoSeqNo_NotEqual(String boxNoSeqNo) {
        regBoxNoSeqNo(CK_NES, boxNoSeqNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     * @param boxNoSeqNo The value of boxNoSeqNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNoSeqNo_GreaterThan(String boxNoSeqNo) {
        regBoxNoSeqNo(CK_GT, fRES(boxNoSeqNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     * @param boxNoSeqNo The value of boxNoSeqNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNoSeqNo_LessThan(String boxNoSeqNo) {
        regBoxNoSeqNo(CK_LT, fRES(boxNoSeqNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     * @param boxNoSeqNo The value of boxNoSeqNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNoSeqNo_GreaterEqual(String boxNoSeqNo) {
        regBoxNoSeqNo(CK_GE, fRES(boxNoSeqNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     * @param boxNoSeqNo The value of boxNoSeqNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNoSeqNo_LessEqual(String boxNoSeqNo) {
        regBoxNoSeqNo(CK_LE, fRES(boxNoSeqNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     * @param boxNoSeqNoList The collection of boxNoSeqNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNoSeqNo_InScope(Collection<String> boxNoSeqNoList) {
        doSetBoxNoSeqNo_InScope(boxNoSeqNoList);
    }

    protected void doSetBoxNoSeqNo_InScope(Collection<String> boxNoSeqNoList) {
        regINS(CK_INS, cTL(boxNoSeqNoList), xgetCValueBoxNoSeqNo(), "BOX_NO_SEQ_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     * @param boxNoSeqNoList The collection of boxNoSeqNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNoSeqNo_NotInScope(Collection<String> boxNoSeqNoList) {
        doSetBoxNoSeqNo_NotInScope(boxNoSeqNoList);
    }

    protected void doSetBoxNoSeqNo_NotInScope(Collection<String> boxNoSeqNoList) {
        regINS(CK_NINS, cTL(boxNoSeqNoList), xgetCValueBoxNoSeqNo(), "BOX_NO_SEQ_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_NO_SEQ_NO: {varchar(255)} <br>
     * <pre>e.g. setBoxNoSeqNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxNoSeqNo The value of boxNoSeqNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxNoSeqNo_LikeSearch(String boxNoSeqNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxNoSeqNo), xgetCValueBoxNoSeqNo(), "BOX_NO_SEQ_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     * @param boxNoSeqNo The value of boxNoSeqNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxNoSeqNo_NotLikeSearch(String boxNoSeqNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxNoSeqNo), xgetCValueBoxNoSeqNo(), "BOX_NO_SEQ_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     * @param boxNoSeqNo The value of boxNoSeqNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNoSeqNo_PrefixSearch(String boxNoSeqNo) {
        setBoxNoSeqNo_LikeSearch(boxNoSeqNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     */
    public void setBoxNoSeqNo_IsNull() { regBoxNoSeqNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     */
    public void setBoxNoSeqNo_IsNullOrEmpty() { regBoxNoSeqNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_NO_SEQ_NO: {varchar(255)}
     */
    public void setBoxNoSeqNo_IsNotNull() { regBoxNoSeqNo(CK_ISNN, DOBJ); }

    protected void regBoxNoSeqNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxNoSeqNo(), "BOX_NO_SEQ_NO"); }
    protected abstract ConditionValue xgetCValueBoxNoSeqNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(255)}
     * @param boxType The value of boxType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_Equal(String boxType) {
        doSetBoxType_Equal(fRES(boxType));
    }

    protected void doSetBoxType_Equal(String boxType) {
        regBoxType(CK_EQ, boxType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(255)}
     * @param boxType The value of boxType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_NotEqual(String boxType) {
        doSetBoxType_NotEqual(fRES(boxType));
    }

    protected void doSetBoxType_NotEqual(String boxType) {
        regBoxType(CK_NES, boxType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(255)}
     * @param boxType The value of boxType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_GreaterThan(String boxType) {
        regBoxType(CK_GT, fRES(boxType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(255)}
     * @param boxType The value of boxType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_LessThan(String boxType) {
        regBoxType(CK_LT, fRES(boxType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(255)}
     * @param boxType The value of boxType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_GreaterEqual(String boxType) {
        regBoxType(CK_GE, fRES(boxType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(255)}
     * @param boxType The value of boxType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_LessEqual(String boxType) {
        regBoxType(CK_LE, fRES(boxType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_TYPE: {varchar(255)}
     * @param boxTypeList The collection of boxType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_InScope(Collection<String> boxTypeList) {
        doSetBoxType_InScope(boxTypeList);
    }

    protected void doSetBoxType_InScope(Collection<String> boxTypeList) {
        regINS(CK_INS, cTL(boxTypeList), xgetCValueBoxType(), "BOX_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_TYPE: {varchar(255)}
     * @param boxTypeList The collection of boxType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_NotInScope(Collection<String> boxTypeList) {
        doSetBoxType_NotInScope(boxTypeList);
    }

    protected void doSetBoxType_NotInScope(Collection<String> boxTypeList) {
        regINS(CK_NINS, cTL(boxTypeList), xgetCValueBoxType(), "BOX_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_TYPE: {varchar(255)} <br>
     * <pre>e.g. setBoxType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxType The value of boxType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxType_LikeSearch(String boxType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxType), xgetCValueBoxType(), "BOX_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_TYPE: {varchar(255)}
     * @param boxType The value of boxType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxType_NotLikeSearch(String boxType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxType), xgetCValueBoxType(), "BOX_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_TYPE: {varchar(255)}
     * @param boxType The value of boxType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxType_PrefixSearch(String boxType) {
        setBoxType_LikeSearch(boxType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(255)}
     */
    public void setBoxType_IsNull() { regBoxType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(255)}
     */
    public void setBoxType_IsNullOrEmpty() { regBoxType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_TYPE: {varchar(255)}
     */
    public void setBoxType_IsNotNull() { regBoxType(CK_ISNN, DOBJ); }

    protected void regBoxType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxType(), "BOX_TYPE"); }
    protected abstract ConditionValue xgetCValueBoxType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     * @param mergeBoxVisibleType The value of mergeBoxVisibleType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeBoxVisibleType_Equal(String mergeBoxVisibleType) {
        doSetMergeBoxVisibleType_Equal(fRES(mergeBoxVisibleType));
    }

    protected void doSetMergeBoxVisibleType_Equal(String mergeBoxVisibleType) {
        regMergeBoxVisibleType(CK_EQ, mergeBoxVisibleType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     * @param mergeBoxVisibleType The value of mergeBoxVisibleType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeBoxVisibleType_NotEqual(String mergeBoxVisibleType) {
        doSetMergeBoxVisibleType_NotEqual(fRES(mergeBoxVisibleType));
    }

    protected void doSetMergeBoxVisibleType_NotEqual(String mergeBoxVisibleType) {
        regMergeBoxVisibleType(CK_NES, mergeBoxVisibleType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     * @param mergeBoxVisibleType The value of mergeBoxVisibleType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeBoxVisibleType_GreaterThan(String mergeBoxVisibleType) {
        regMergeBoxVisibleType(CK_GT, fRES(mergeBoxVisibleType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     * @param mergeBoxVisibleType The value of mergeBoxVisibleType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeBoxVisibleType_LessThan(String mergeBoxVisibleType) {
        regMergeBoxVisibleType(CK_LT, fRES(mergeBoxVisibleType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     * @param mergeBoxVisibleType The value of mergeBoxVisibleType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeBoxVisibleType_GreaterEqual(String mergeBoxVisibleType) {
        regMergeBoxVisibleType(CK_GE, fRES(mergeBoxVisibleType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     * @param mergeBoxVisibleType The value of mergeBoxVisibleType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeBoxVisibleType_LessEqual(String mergeBoxVisibleType) {
        regMergeBoxVisibleType(CK_LE, fRES(mergeBoxVisibleType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     * @param mergeBoxVisibleTypeList The collection of mergeBoxVisibleType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeBoxVisibleType_InScope(Collection<String> mergeBoxVisibleTypeList) {
        doSetMergeBoxVisibleType_InScope(mergeBoxVisibleTypeList);
    }

    protected void doSetMergeBoxVisibleType_InScope(Collection<String> mergeBoxVisibleTypeList) {
        regINS(CK_INS, cTL(mergeBoxVisibleTypeList), xgetCValueMergeBoxVisibleType(), "MERGE_BOX_VISIBLE_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     * @param mergeBoxVisibleTypeList The collection of mergeBoxVisibleType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeBoxVisibleType_NotInScope(Collection<String> mergeBoxVisibleTypeList) {
        doSetMergeBoxVisibleType_NotInScope(mergeBoxVisibleTypeList);
    }

    protected void doSetMergeBoxVisibleType_NotInScope(Collection<String> mergeBoxVisibleTypeList) {
        regINS(CK_NINS, cTL(mergeBoxVisibleTypeList), xgetCValueMergeBoxVisibleType(), "MERGE_BOX_VISIBLE_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)} <br>
     * <pre>e.g. setMergeBoxVisibleType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mergeBoxVisibleType The value of mergeBoxVisibleType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMergeBoxVisibleType_LikeSearch(String mergeBoxVisibleType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mergeBoxVisibleType), xgetCValueMergeBoxVisibleType(), "MERGE_BOX_VISIBLE_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     * @param mergeBoxVisibleType The value of mergeBoxVisibleType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMergeBoxVisibleType_NotLikeSearch(String mergeBoxVisibleType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mergeBoxVisibleType), xgetCValueMergeBoxVisibleType(), "MERGE_BOX_VISIBLE_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     * @param mergeBoxVisibleType The value of mergeBoxVisibleType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMergeBoxVisibleType_PrefixSearch(String mergeBoxVisibleType) {
        setMergeBoxVisibleType_LikeSearch(mergeBoxVisibleType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     */
    public void setMergeBoxVisibleType_IsNull() { regMergeBoxVisibleType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     */
    public void setMergeBoxVisibleType_IsNullOrEmpty() { regMergeBoxVisibleType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     */
    public void setMergeBoxVisibleType_IsNotNull() { regMergeBoxVisibleType(CK_ISNN, DOBJ); }

    protected void regMergeBoxVisibleType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMergeBoxVisibleType(), "MERGE_BOX_VISIBLE_TYPE"); }
    protected abstract ConditionValue xgetCValueMergeBoxVisibleType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     * @param dmVisibleType The value of dmVisibleType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmVisibleType_Equal(String dmVisibleType) {
        doSetDmVisibleType_Equal(fRES(dmVisibleType));
    }

    protected void doSetDmVisibleType_Equal(String dmVisibleType) {
        regDmVisibleType(CK_EQ, dmVisibleType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     * @param dmVisibleType The value of dmVisibleType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmVisibleType_NotEqual(String dmVisibleType) {
        doSetDmVisibleType_NotEqual(fRES(dmVisibleType));
    }

    protected void doSetDmVisibleType_NotEqual(String dmVisibleType) {
        regDmVisibleType(CK_NES, dmVisibleType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     * @param dmVisibleType The value of dmVisibleType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmVisibleType_GreaterThan(String dmVisibleType) {
        regDmVisibleType(CK_GT, fRES(dmVisibleType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     * @param dmVisibleType The value of dmVisibleType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmVisibleType_LessThan(String dmVisibleType) {
        regDmVisibleType(CK_LT, fRES(dmVisibleType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     * @param dmVisibleType The value of dmVisibleType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmVisibleType_GreaterEqual(String dmVisibleType) {
        regDmVisibleType(CK_GE, fRES(dmVisibleType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     * @param dmVisibleType The value of dmVisibleType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmVisibleType_LessEqual(String dmVisibleType) {
        regDmVisibleType(CK_LE, fRES(dmVisibleType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     * @param dmVisibleTypeList The collection of dmVisibleType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmVisibleType_InScope(Collection<String> dmVisibleTypeList) {
        doSetDmVisibleType_InScope(dmVisibleTypeList);
    }

    protected void doSetDmVisibleType_InScope(Collection<String> dmVisibleTypeList) {
        regINS(CK_INS, cTL(dmVisibleTypeList), xgetCValueDmVisibleType(), "DM_VISIBLE_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     * @param dmVisibleTypeList The collection of dmVisibleType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmVisibleType_NotInScope(Collection<String> dmVisibleTypeList) {
        doSetDmVisibleType_NotInScope(dmVisibleTypeList);
    }

    protected void doSetDmVisibleType_NotInScope(Collection<String> dmVisibleTypeList) {
        regINS(CK_NINS, cTL(dmVisibleTypeList), xgetCValueDmVisibleType(), "DM_VISIBLE_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DM_VISIBLE_TYPE: {varchar(255)} <br>
     * <pre>e.g. setDmVisibleType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dmVisibleType The value of dmVisibleType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDmVisibleType_LikeSearch(String dmVisibleType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dmVisibleType), xgetCValueDmVisibleType(), "DM_VISIBLE_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     * @param dmVisibleType The value of dmVisibleType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDmVisibleType_NotLikeSearch(String dmVisibleType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dmVisibleType), xgetCValueDmVisibleType(), "DM_VISIBLE_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     * @param dmVisibleType The value of dmVisibleType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmVisibleType_PrefixSearch(String dmVisibleType) {
        setDmVisibleType_LikeSearch(dmVisibleType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     */
    public void setDmVisibleType_IsNull() { regDmVisibleType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     */
    public void setDmVisibleType_IsNullOrEmpty() { regDmVisibleType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DM_VISIBLE_TYPE: {varchar(255)}
     */
    public void setDmVisibleType_IsNotNull() { regDmVisibleType(CK_ISNN, DOBJ); }

    protected void regDmVisibleType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDmVisibleType(), "DM_VISIBLE_TYPE"); }
    protected abstract ConditionValue xgetCValueDmVisibleType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     * @param totalBoxCnt The value of totalBoxCnt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalBoxCnt_Equal(String totalBoxCnt) {
        doSetTotalBoxCnt_Equal(fRES(totalBoxCnt));
    }

    protected void doSetTotalBoxCnt_Equal(String totalBoxCnt) {
        regTotalBoxCnt(CK_EQ, totalBoxCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     * @param totalBoxCnt The value of totalBoxCnt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalBoxCnt_NotEqual(String totalBoxCnt) {
        doSetTotalBoxCnt_NotEqual(fRES(totalBoxCnt));
    }

    protected void doSetTotalBoxCnt_NotEqual(String totalBoxCnt) {
        regTotalBoxCnt(CK_NES, totalBoxCnt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     * @param totalBoxCnt The value of totalBoxCnt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalBoxCnt_GreaterThan(String totalBoxCnt) {
        regTotalBoxCnt(CK_GT, fRES(totalBoxCnt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     * @param totalBoxCnt The value of totalBoxCnt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalBoxCnt_LessThan(String totalBoxCnt) {
        regTotalBoxCnt(CK_LT, fRES(totalBoxCnt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     * @param totalBoxCnt The value of totalBoxCnt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalBoxCnt_GreaterEqual(String totalBoxCnt) {
        regTotalBoxCnt(CK_GE, fRES(totalBoxCnt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     * @param totalBoxCnt The value of totalBoxCnt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalBoxCnt_LessEqual(String totalBoxCnt) {
        regTotalBoxCnt(CK_LE, fRES(totalBoxCnt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     * @param totalBoxCntList The collection of totalBoxCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalBoxCnt_InScope(Collection<String> totalBoxCntList) {
        doSetTotalBoxCnt_InScope(totalBoxCntList);
    }

    protected void doSetTotalBoxCnt_InScope(Collection<String> totalBoxCntList) {
        regINS(CK_INS, cTL(totalBoxCntList), xgetCValueTotalBoxCnt(), "TOTAL_BOX_CNT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     * @param totalBoxCntList The collection of totalBoxCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalBoxCnt_NotInScope(Collection<String> totalBoxCntList) {
        doSetTotalBoxCnt_NotInScope(totalBoxCntList);
    }

    protected void doSetTotalBoxCnt_NotInScope(Collection<String> totalBoxCntList) {
        regINS(CK_NINS, cTL(totalBoxCntList), xgetCValueTotalBoxCnt(), "TOTAL_BOX_CNT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOTAL_BOX_CNT: {varchar(255)} <br>
     * <pre>e.g. setTotalBoxCnt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param totalBoxCnt The value of totalBoxCnt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTotalBoxCnt_LikeSearch(String totalBoxCnt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(totalBoxCnt), xgetCValueTotalBoxCnt(), "TOTAL_BOX_CNT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     * @param totalBoxCnt The value of totalBoxCnt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTotalBoxCnt_NotLikeSearch(String totalBoxCnt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(totalBoxCnt), xgetCValueTotalBoxCnt(), "TOTAL_BOX_CNT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     * @param totalBoxCnt The value of totalBoxCnt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalBoxCnt_PrefixSearch(String totalBoxCnt) {
        setTotalBoxCnt_LikeSearch(totalBoxCnt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     */
    public void setTotalBoxCnt_IsNull() { regTotalBoxCnt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     */
    public void setTotalBoxCnt_IsNullOrEmpty() { regTotalBoxCnt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_BOX_CNT: {varchar(255)}
     */
    public void setTotalBoxCnt_IsNotNull() { regTotalBoxCnt(CK_ISNN, DOBJ); }

    protected void regTotalBoxCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalBoxCnt(), "TOTAL_BOX_CNT"); }
    protected abstract ConditionValue xgetCValueTotalBoxCnt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     * @param boxCartonSum The value of boxCartonSum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSum_Equal(String boxCartonSum) {
        doSetBoxCartonSum_Equal(fRES(boxCartonSum));
    }

    protected void doSetBoxCartonSum_Equal(String boxCartonSum) {
        regBoxCartonSum(CK_EQ, boxCartonSum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     * @param boxCartonSum The value of boxCartonSum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSum_NotEqual(String boxCartonSum) {
        doSetBoxCartonSum_NotEqual(fRES(boxCartonSum));
    }

    protected void doSetBoxCartonSum_NotEqual(String boxCartonSum) {
        regBoxCartonSum(CK_NES, boxCartonSum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     * @param boxCartonSum The value of boxCartonSum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSum_GreaterThan(String boxCartonSum) {
        regBoxCartonSum(CK_GT, fRES(boxCartonSum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     * @param boxCartonSum The value of boxCartonSum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSum_LessThan(String boxCartonSum) {
        regBoxCartonSum(CK_LT, fRES(boxCartonSum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     * @param boxCartonSum The value of boxCartonSum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSum_GreaterEqual(String boxCartonSum) {
        regBoxCartonSum(CK_GE, fRES(boxCartonSum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     * @param boxCartonSum The value of boxCartonSum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSum_LessEqual(String boxCartonSum) {
        regBoxCartonSum(CK_LE, fRES(boxCartonSum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     * @param boxCartonSumList The collection of boxCartonSum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSum_InScope(Collection<String> boxCartonSumList) {
        doSetBoxCartonSum_InScope(boxCartonSumList);
    }

    protected void doSetBoxCartonSum_InScope(Collection<String> boxCartonSumList) {
        regINS(CK_INS, cTL(boxCartonSumList), xgetCValueBoxCartonSum(), "BOX_CARTON_SUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     * @param boxCartonSumList The collection of boxCartonSum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSum_NotInScope(Collection<String> boxCartonSumList) {
        doSetBoxCartonSum_NotInScope(boxCartonSumList);
    }

    protected void doSetBoxCartonSum_NotInScope(Collection<String> boxCartonSumList) {
        regINS(CK_NINS, cTL(boxCartonSumList), xgetCValueBoxCartonSum(), "BOX_CARTON_SUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_CARTON_SUM: {varchar(255)} <br>
     * <pre>e.g. setBoxCartonSum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxCartonSum The value of boxCartonSum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxCartonSum_LikeSearch(String boxCartonSum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxCartonSum), xgetCValueBoxCartonSum(), "BOX_CARTON_SUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     * @param boxCartonSum The value of boxCartonSum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxCartonSum_NotLikeSearch(String boxCartonSum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxCartonSum), xgetCValueBoxCartonSum(), "BOX_CARTON_SUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     * @param boxCartonSum The value of boxCartonSum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSum_PrefixSearch(String boxCartonSum) {
        setBoxCartonSum_LikeSearch(boxCartonSum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     */
    public void setBoxCartonSum_IsNull() { regBoxCartonSum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     */
    public void setBoxCartonSum_IsNullOrEmpty() { regBoxCartonSum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_CARTON_SUM: {varchar(255)}
     */
    public void setBoxCartonSum_IsNotNull() { regBoxCartonSum(CK_ISNN, DOBJ); }

    protected void regBoxCartonSum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxCartonSum(), "BOX_CARTON_SUM"); }
    protected abstract ConditionValue xgetCValueBoxCartonSum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     * @param boxCartonSortNum The value of boxCartonSortNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSortNum_Equal(String boxCartonSortNum) {
        doSetBoxCartonSortNum_Equal(fRES(boxCartonSortNum));
    }

    protected void doSetBoxCartonSortNum_Equal(String boxCartonSortNum) {
        regBoxCartonSortNum(CK_EQ, boxCartonSortNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     * @param boxCartonSortNum The value of boxCartonSortNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSortNum_NotEqual(String boxCartonSortNum) {
        doSetBoxCartonSortNum_NotEqual(fRES(boxCartonSortNum));
    }

    protected void doSetBoxCartonSortNum_NotEqual(String boxCartonSortNum) {
        regBoxCartonSortNum(CK_NES, boxCartonSortNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     * @param boxCartonSortNum The value of boxCartonSortNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSortNum_GreaterThan(String boxCartonSortNum) {
        regBoxCartonSortNum(CK_GT, fRES(boxCartonSortNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     * @param boxCartonSortNum The value of boxCartonSortNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSortNum_LessThan(String boxCartonSortNum) {
        regBoxCartonSortNum(CK_LT, fRES(boxCartonSortNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     * @param boxCartonSortNum The value of boxCartonSortNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSortNum_GreaterEqual(String boxCartonSortNum) {
        regBoxCartonSortNum(CK_GE, fRES(boxCartonSortNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     * @param boxCartonSortNum The value of boxCartonSortNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSortNum_LessEqual(String boxCartonSortNum) {
        regBoxCartonSortNum(CK_LE, fRES(boxCartonSortNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     * @param boxCartonSortNumList The collection of boxCartonSortNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSortNum_InScope(Collection<String> boxCartonSortNumList) {
        doSetBoxCartonSortNum_InScope(boxCartonSortNumList);
    }

    protected void doSetBoxCartonSortNum_InScope(Collection<String> boxCartonSortNumList) {
        regINS(CK_INS, cTL(boxCartonSortNumList), xgetCValueBoxCartonSortNum(), "BOX_CARTON_SORT_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     * @param boxCartonSortNumList The collection of boxCartonSortNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSortNum_NotInScope(Collection<String> boxCartonSortNumList) {
        doSetBoxCartonSortNum_NotInScope(boxCartonSortNumList);
    }

    protected void doSetBoxCartonSortNum_NotInScope(Collection<String> boxCartonSortNumList) {
        regINS(CK_NINS, cTL(boxCartonSortNumList), xgetCValueBoxCartonSortNum(), "BOX_CARTON_SORT_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)} <br>
     * <pre>e.g. setBoxCartonSortNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxCartonSortNum The value of boxCartonSortNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxCartonSortNum_LikeSearch(String boxCartonSortNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxCartonSortNum), xgetCValueBoxCartonSortNum(), "BOX_CARTON_SORT_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     * @param boxCartonSortNum The value of boxCartonSortNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxCartonSortNum_NotLikeSearch(String boxCartonSortNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxCartonSortNum), xgetCValueBoxCartonSortNum(), "BOX_CARTON_SORT_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     * @param boxCartonSortNum The value of boxCartonSortNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCartonSortNum_PrefixSearch(String boxCartonSortNum) {
        setBoxCartonSortNum_LikeSearch(boxCartonSortNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     */
    public void setBoxCartonSortNum_IsNull() { regBoxCartonSortNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     */
    public void setBoxCartonSortNum_IsNullOrEmpty() { regBoxCartonSortNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     */
    public void setBoxCartonSortNum_IsNotNull() { regBoxCartonSortNum(CK_ISNN, DOBJ); }

    protected void regBoxCartonSortNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxCartonSortNum(), "BOX_CARTON_SORT_NUM"); }
    protected abstract ConditionValue xgetCValueBoxCartonSortNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {varchar(255)}
     * @param tttopdedrnk The value of tttopdedrnk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTttopdedrnk_Equal(String tttopdedrnk) {
        doSetTttopdedrnk_Equal(fRES(tttopdedrnk));
    }

    protected void doSetTttopdedrnk_Equal(String tttopdedrnk) {
        regTttopdedrnk(CK_EQ, tttopdedrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {varchar(255)}
     * @param tttopdedrnk The value of tttopdedrnk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTttopdedrnk_NotEqual(String tttopdedrnk) {
        doSetTttopdedrnk_NotEqual(fRES(tttopdedrnk));
    }

    protected void doSetTttopdedrnk_NotEqual(String tttopdedrnk) {
        regTttopdedrnk(CK_NES, tttopdedrnk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {varchar(255)}
     * @param tttopdedrnk The value of tttopdedrnk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTttopdedrnk_GreaterThan(String tttopdedrnk) {
        regTttopdedrnk(CK_GT, fRES(tttopdedrnk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {varchar(255)}
     * @param tttopdedrnk The value of tttopdedrnk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTttopdedrnk_LessThan(String tttopdedrnk) {
        regTttopdedrnk(CK_LT, fRES(tttopdedrnk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {varchar(255)}
     * @param tttopdedrnk The value of tttopdedrnk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTttopdedrnk_GreaterEqual(String tttopdedrnk) {
        regTttopdedrnk(CK_GE, fRES(tttopdedrnk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {varchar(255)}
     * @param tttopdedrnk The value of tttopdedrnk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTttopdedrnk_LessEqual(String tttopdedrnk) {
        regTttopdedrnk(CK_LE, fRES(tttopdedrnk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TTTOPDEDRNK: {varchar(255)}
     * @param tttopdedrnkList The collection of tttopdedrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTttopdedrnk_InScope(Collection<String> tttopdedrnkList) {
        doSetTttopdedrnk_InScope(tttopdedrnkList);
    }

    protected void doSetTttopdedrnk_InScope(Collection<String> tttopdedrnkList) {
        regINS(CK_INS, cTL(tttopdedrnkList), xgetCValueTttopdedrnk(), "TTTOPDEDRNK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TTTOPDEDRNK: {varchar(255)}
     * @param tttopdedrnkList The collection of tttopdedrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTttopdedrnk_NotInScope(Collection<String> tttopdedrnkList) {
        doSetTttopdedrnk_NotInScope(tttopdedrnkList);
    }

    protected void doSetTttopdedrnk_NotInScope(Collection<String> tttopdedrnkList) {
        regINS(CK_NINS, cTL(tttopdedrnkList), xgetCValueTttopdedrnk(), "TTTOPDEDRNK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TTTOPDEDRNK: {varchar(255)} <br>
     * <pre>e.g. setTttopdedrnk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tttopdedrnk The value of tttopdedrnk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTttopdedrnk_LikeSearch(String tttopdedrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tttopdedrnk), xgetCValueTttopdedrnk(), "TTTOPDEDRNK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TTTOPDEDRNK: {varchar(255)}
     * @param tttopdedrnk The value of tttopdedrnk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTttopdedrnk_NotLikeSearch(String tttopdedrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tttopdedrnk), xgetCValueTttopdedrnk(), "TTTOPDEDRNK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TTTOPDEDRNK: {varchar(255)}
     * @param tttopdedrnk The value of tttopdedrnk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTttopdedrnk_PrefixSearch(String tttopdedrnk) {
        setTttopdedrnk_LikeSearch(tttopdedrnk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {varchar(255)}
     */
    public void setTttopdedrnk_IsNull() { regTttopdedrnk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {varchar(255)}
     */
    public void setTttopdedrnk_IsNullOrEmpty() { regTttopdedrnk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {varchar(255)}
     */
    public void setTttopdedrnk_IsNotNull() { regTttopdedrnk(CK_ISNN, DOBJ); }

    protected void regTttopdedrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTttopdedrnk(), "TTTOPDEDRNK"); }
    protected abstract ConditionValue xgetCValueTttopdedrnk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     * @param lineBlockBoxNo The value of lineBlockBoxNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockBoxNo_Equal(String lineBlockBoxNo) {
        doSetLineBlockBoxNo_Equal(fRES(lineBlockBoxNo));
    }

    protected void doSetLineBlockBoxNo_Equal(String lineBlockBoxNo) {
        regLineBlockBoxNo(CK_EQ, lineBlockBoxNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     * @param lineBlockBoxNo The value of lineBlockBoxNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockBoxNo_NotEqual(String lineBlockBoxNo) {
        doSetLineBlockBoxNo_NotEqual(fRES(lineBlockBoxNo));
    }

    protected void doSetLineBlockBoxNo_NotEqual(String lineBlockBoxNo) {
        regLineBlockBoxNo(CK_NES, lineBlockBoxNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     * @param lineBlockBoxNo The value of lineBlockBoxNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockBoxNo_GreaterThan(String lineBlockBoxNo) {
        regLineBlockBoxNo(CK_GT, fRES(lineBlockBoxNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     * @param lineBlockBoxNo The value of lineBlockBoxNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockBoxNo_LessThan(String lineBlockBoxNo) {
        regLineBlockBoxNo(CK_LT, fRES(lineBlockBoxNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     * @param lineBlockBoxNo The value of lineBlockBoxNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockBoxNo_GreaterEqual(String lineBlockBoxNo) {
        regLineBlockBoxNo(CK_GE, fRES(lineBlockBoxNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     * @param lineBlockBoxNo The value of lineBlockBoxNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockBoxNo_LessEqual(String lineBlockBoxNo) {
        regLineBlockBoxNo(CK_LE, fRES(lineBlockBoxNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     * @param lineBlockBoxNoList The collection of lineBlockBoxNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockBoxNo_InScope(Collection<String> lineBlockBoxNoList) {
        doSetLineBlockBoxNo_InScope(lineBlockBoxNoList);
    }

    protected void doSetLineBlockBoxNo_InScope(Collection<String> lineBlockBoxNoList) {
        regINS(CK_INS, cTL(lineBlockBoxNoList), xgetCValueLineBlockBoxNo(), "LINE_BLOCK_BOX_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     * @param lineBlockBoxNoList The collection of lineBlockBoxNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockBoxNo_NotInScope(Collection<String> lineBlockBoxNoList) {
        doSetLineBlockBoxNo_NotInScope(lineBlockBoxNoList);
    }

    protected void doSetLineBlockBoxNo_NotInScope(Collection<String> lineBlockBoxNoList) {
        regINS(CK_NINS, cTL(lineBlockBoxNoList), xgetCValueLineBlockBoxNo(), "LINE_BLOCK_BOX_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)} <br>
     * <pre>e.g. setLineBlockBoxNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineBlockBoxNo The value of lineBlockBoxNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineBlockBoxNo_LikeSearch(String lineBlockBoxNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineBlockBoxNo), xgetCValueLineBlockBoxNo(), "LINE_BLOCK_BOX_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     * @param lineBlockBoxNo The value of lineBlockBoxNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineBlockBoxNo_NotLikeSearch(String lineBlockBoxNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineBlockBoxNo), xgetCValueLineBlockBoxNo(), "LINE_BLOCK_BOX_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     * @param lineBlockBoxNo The value of lineBlockBoxNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockBoxNo_PrefixSearch(String lineBlockBoxNo) {
        setLineBlockBoxNo_LikeSearch(lineBlockBoxNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     */
    public void setLineBlockBoxNo_IsNull() { regLineBlockBoxNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     */
    public void setLineBlockBoxNo_IsNullOrEmpty() { regLineBlockBoxNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     */
    public void setLineBlockBoxNo_IsNotNull() { regLineBlockBoxNo(CK_ISNN, DOBJ); }

    protected void regLineBlockBoxNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineBlockBoxNo(), "LINE_BLOCK_BOX_NO"); }
    protected abstract ConditionValue xgetCValueLineBlockBoxNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     * @param lineBlockTotalBoxCnt The value of lineBlockTotalBoxCnt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockTotalBoxCnt_Equal(String lineBlockTotalBoxCnt) {
        doSetLineBlockTotalBoxCnt_Equal(fRES(lineBlockTotalBoxCnt));
    }

    protected void doSetLineBlockTotalBoxCnt_Equal(String lineBlockTotalBoxCnt) {
        regLineBlockTotalBoxCnt(CK_EQ, lineBlockTotalBoxCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     * @param lineBlockTotalBoxCnt The value of lineBlockTotalBoxCnt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockTotalBoxCnt_NotEqual(String lineBlockTotalBoxCnt) {
        doSetLineBlockTotalBoxCnt_NotEqual(fRES(lineBlockTotalBoxCnt));
    }

    protected void doSetLineBlockTotalBoxCnt_NotEqual(String lineBlockTotalBoxCnt) {
        regLineBlockTotalBoxCnt(CK_NES, lineBlockTotalBoxCnt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     * @param lineBlockTotalBoxCnt The value of lineBlockTotalBoxCnt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockTotalBoxCnt_GreaterThan(String lineBlockTotalBoxCnt) {
        regLineBlockTotalBoxCnt(CK_GT, fRES(lineBlockTotalBoxCnt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     * @param lineBlockTotalBoxCnt The value of lineBlockTotalBoxCnt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockTotalBoxCnt_LessThan(String lineBlockTotalBoxCnt) {
        regLineBlockTotalBoxCnt(CK_LT, fRES(lineBlockTotalBoxCnt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     * @param lineBlockTotalBoxCnt The value of lineBlockTotalBoxCnt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockTotalBoxCnt_GreaterEqual(String lineBlockTotalBoxCnt) {
        regLineBlockTotalBoxCnt(CK_GE, fRES(lineBlockTotalBoxCnt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     * @param lineBlockTotalBoxCnt The value of lineBlockTotalBoxCnt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockTotalBoxCnt_LessEqual(String lineBlockTotalBoxCnt) {
        regLineBlockTotalBoxCnt(CK_LE, fRES(lineBlockTotalBoxCnt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     * @param lineBlockTotalBoxCntList The collection of lineBlockTotalBoxCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockTotalBoxCnt_InScope(Collection<String> lineBlockTotalBoxCntList) {
        doSetLineBlockTotalBoxCnt_InScope(lineBlockTotalBoxCntList);
    }

    protected void doSetLineBlockTotalBoxCnt_InScope(Collection<String> lineBlockTotalBoxCntList) {
        regINS(CK_INS, cTL(lineBlockTotalBoxCntList), xgetCValueLineBlockTotalBoxCnt(), "LINE_BLOCK_TOTAL_BOX_CNT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     * @param lineBlockTotalBoxCntList The collection of lineBlockTotalBoxCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockTotalBoxCnt_NotInScope(Collection<String> lineBlockTotalBoxCntList) {
        doSetLineBlockTotalBoxCnt_NotInScope(lineBlockTotalBoxCntList);
    }

    protected void doSetLineBlockTotalBoxCnt_NotInScope(Collection<String> lineBlockTotalBoxCntList) {
        regINS(CK_NINS, cTL(lineBlockTotalBoxCntList), xgetCValueLineBlockTotalBoxCnt(), "LINE_BLOCK_TOTAL_BOX_CNT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)} <br>
     * <pre>e.g. setLineBlockTotalBoxCnt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineBlockTotalBoxCnt The value of lineBlockTotalBoxCnt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineBlockTotalBoxCnt_LikeSearch(String lineBlockTotalBoxCnt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineBlockTotalBoxCnt), xgetCValueLineBlockTotalBoxCnt(), "LINE_BLOCK_TOTAL_BOX_CNT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     * @param lineBlockTotalBoxCnt The value of lineBlockTotalBoxCnt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineBlockTotalBoxCnt_NotLikeSearch(String lineBlockTotalBoxCnt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineBlockTotalBoxCnt), xgetCValueLineBlockTotalBoxCnt(), "LINE_BLOCK_TOTAL_BOX_CNT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     * @param lineBlockTotalBoxCnt The value of lineBlockTotalBoxCnt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlockTotalBoxCnt_PrefixSearch(String lineBlockTotalBoxCnt) {
        setLineBlockTotalBoxCnt_LikeSearch(lineBlockTotalBoxCnt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     */
    public void setLineBlockTotalBoxCnt_IsNull() { regLineBlockTotalBoxCnt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     */
    public void setLineBlockTotalBoxCnt_IsNullOrEmpty() { regLineBlockTotalBoxCnt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     */
    public void setLineBlockTotalBoxCnt_IsNotNull() { regLineBlockTotalBoxCnt(CK_ISNN, DOBJ); }

    protected void regLineBlockTotalBoxCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineBlockTotalBoxCnt(), "LINE_BLOCK_TOTAL_BOX_CNT"); }
    protected abstract ConditionValue xgetCValueLineBlockTotalBoxCnt();

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
    public HpSLCFunction<ECorddtaamSendCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ECorddtaamSendCB.class);
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
    public HpSLCFunction<ECorddtaamSendCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ECorddtaamSendCB.class);
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
    public HpSLCFunction<ECorddtaamSendCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ECorddtaamSendCB.class);
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
    public HpSLCFunction<ECorddtaamSendCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ECorddtaamSendCB.class);
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
    public HpSLCFunction<ECorddtaamSendCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ECorddtaamSendCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ECorddtaamSendCB&gt;() {
     *     public void query(ECorddtaamSendCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ECorddtaamSendCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ECorddtaamSendCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ECorddtaamSendCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ECorddtaamSendCQ sq);

    protected ECorddtaamSendCB xcreateScalarConditionCB() {
        ECorddtaamSendCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ECorddtaamSendCB xcreateScalarConditionPartitionByCB() {
        ECorddtaamSendCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ECorddtaamSendCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ECorddtaamSendCB cb = new ECorddtaamSendCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CORDDTAAM_SEND_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ECorddtaamSendCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ECorddtaamSendCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ECorddtaamSendCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ECorddtaamSendCB cb = new ECorddtaamSendCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CORDDTAAM_SEND_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ECorddtaamSendCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ECorddtaamSendCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ECorddtaamSendCB cb = new ECorddtaamSendCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ECorddtaamSendCQ sq);

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
    protected ECorddtaamSendCB newMyCB() {
        return new ECorddtaamSendCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ECorddtaamSendCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

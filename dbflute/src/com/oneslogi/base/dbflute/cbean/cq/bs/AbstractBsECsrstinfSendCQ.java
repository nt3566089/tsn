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
 * The abstract condition-query of E_CSRSTINF_SEND.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsECsrstinfSendCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsECsrstinfSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_CSRSTINF_SEND";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CSRSTINF_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param csrstinfSendId The value of csrstinfSendId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsrstinfSendId_Equal(Long csrstinfSendId) {
        doSetCsrstinfSendId_Equal(csrstinfSendId);
    }

    protected void doSetCsrstinfSendId_Equal(Long csrstinfSendId) {
        regCsrstinfSendId(CK_EQ, csrstinfSendId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSRSTINF_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param csrstinfSendId The value of csrstinfSendId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsrstinfSendId_NotEqual(Long csrstinfSendId) {
        doSetCsrstinfSendId_NotEqual(csrstinfSendId);
    }

    protected void doSetCsrstinfSendId_NotEqual(Long csrstinfSendId) {
        regCsrstinfSendId(CK_NES, csrstinfSendId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSRSTINF_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param csrstinfSendId The value of csrstinfSendId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsrstinfSendId_GreaterThan(Long csrstinfSendId) {
        regCsrstinfSendId(CK_GT, csrstinfSendId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CSRSTINF_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param csrstinfSendId The value of csrstinfSendId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsrstinfSendId_LessThan(Long csrstinfSendId) {
        regCsrstinfSendId(CK_LT, csrstinfSendId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CSRSTINF_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param csrstinfSendId The value of csrstinfSendId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsrstinfSendId_GreaterEqual(Long csrstinfSendId) {
        regCsrstinfSendId(CK_GE, csrstinfSendId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CSRSTINF_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param csrstinfSendId The value of csrstinfSendId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCsrstinfSendId_LessEqual(Long csrstinfSendId) {
        regCsrstinfSendId(CK_LE, csrstinfSendId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CSRSTINF_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of csrstinfSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of csrstinfSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCsrstinfSendId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCsrstinfSendId(), "CSRSTINF_SEND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CSRSTINF_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param csrstinfSendIdList The collection of csrstinfSendId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsrstinfSendId_InScope(Collection<Long> csrstinfSendIdList) {
        doSetCsrstinfSendId_InScope(csrstinfSendIdList);
    }

    protected void doSetCsrstinfSendId_InScope(Collection<Long> csrstinfSendIdList) {
        regINS(CK_INS, cTL(csrstinfSendIdList), xgetCValueCsrstinfSendId(), "CSRSTINF_SEND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CSRSTINF_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param csrstinfSendIdList The collection of csrstinfSendId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCsrstinfSendId_NotInScope(Collection<Long> csrstinfSendIdList) {
        doSetCsrstinfSendId_NotInScope(csrstinfSendIdList);
    }

    protected void doSetCsrstinfSendId_NotInScope(Collection<Long> csrstinfSendIdList) {
        regINS(CK_NINS, cTL(csrstinfSendIdList), xgetCValueCsrstinfSendId(), "CSRSTINF_SEND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CSRSTINF_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCsrstinfSendId_IsNull() { regCsrstinfSendId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CSRSTINF_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCsrstinfSendId_IsNotNull() { regCsrstinfSendId(CK_ISNN, DOBJ); }

    protected void regCsrstinfSendId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCsrstinfSendId(), "CSRSTINF_SEND_ID"); }
    protected abstract ConditionValue xgetCValueCsrstinfSendId();

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
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCd The value of sendRowCd as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowCd_Equal(Long sendRowCd) {
        doSetSendRowCd_Equal(sendRowCd);
    }

    protected void doSetSendRowCd_Equal(Long sendRowCd) {
        regSendRowCd(CK_EQ, sendRowCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCd The value of sendRowCd as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowCd_NotEqual(Long sendRowCd) {
        doSetSendRowCd_NotEqual(sendRowCd);
    }

    protected void doSetSendRowCd_NotEqual(Long sendRowCd) {
        regSendRowCd(CK_NES, sendRowCd);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCd The value of sendRowCd as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowCd_GreaterThan(Long sendRowCd) {
        regSendRowCd(CK_GT, sendRowCd);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCd The value of sendRowCd as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowCd_LessThan(Long sendRowCd) {
        regSendRowCd(CK_LT, sendRowCd);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCd The value of sendRowCd as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowCd_GreaterEqual(Long sendRowCd) {
        regSendRowCd(CK_GE, sendRowCd);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCd The value of sendRowCd as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowCd_LessEqual(Long sendRowCd) {
        regSendRowCd(CK_LE, sendRowCd);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param minNumber The min number of sendRowCd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sendRowCd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSendRowCd_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSendRowCd(), "SEND_ROW_CD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCdList The collection of sendRowCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendRowCd_InScope(Collection<Long> sendRowCdList) {
        doSetSendRowCd_InScope(sendRowCdList);
    }

    protected void doSetSendRowCd_InScope(Collection<Long> sendRowCdList) {
        regINS(CK_INS, cTL(sendRowCdList), xgetCValueSendRowCd(), "SEND_ROW_CD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCdList The collection of sendRowCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendRowCd_NotInScope(Collection<Long> sendRowCdList) {
        doSetSendRowCd_NotInScope(sendRowCdList);
    }

    protected void doSetSendRowCd_NotInScope(Collection<Long> sendRowCdList) {
        regINS(CK_NINS, cTL(sendRowCdList), xgetCValueSendRowCd(), "SEND_ROW_CD");
    }

    protected void regSendRowCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendRowCd(), "SEND_ROW_CD"); }
    protected abstract ConditionValue xgetCValueSendRowCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1)}
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
     * WORK_FLG: {NotNull, char(1)}
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
     * WORK_FLG: {NotNull, char(1)}
     * @param workFlg The value of workFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterThan(String workFlg) {
        regWorkFlg(CK_GT, fRES(workFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1)}
     * @param workFlg The value of workFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessThan(String workFlg) {
        regWorkFlg(CK_LT, fRES(workFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1)}
     * @param workFlg The value of workFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterEqual(String workFlg) {
        regWorkFlg(CK_GE, fRES(workFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1)}
     * @param workFlg The value of workFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessEqual(String workFlg) {
        regWorkFlg(CK_LE, fRES(workFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, char(1)}
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
     * WORK_FLG: {NotNull, char(1)}
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
     * WORK_FLG: {NotNull, char(1)} <br>
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
     * WORK_FLG: {NotNull, char(1)}
     * @param workFlg The value of workFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkFlg_NotLikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, char(1)}
     * @param workFlg The value of workFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_PrefixSearch(String workFlg) {
        setWorkFlg_LikeSearch(workFlg, xcLSOPPre());
    }

    protected void regWorkFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkFlg(), "WORK_FLG"); }
    protected abstract ConditionValue xgetCValueWorkFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTYMD: {varchar(255)}
     * @param sroprtymd The value of sroprtymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_Equal(String sroprtymd) {
        doSetSroprtymd_Equal(fRES(sroprtymd));
    }

    protected void doSetSroprtymd_Equal(String sroprtymd) {
        regSroprtymd(CK_EQ, sroprtymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTYMD: {varchar(255)}
     * @param sroprtymd The value of sroprtymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_NotEqual(String sroprtymd) {
        doSetSroprtymd_NotEqual(fRES(sroprtymd));
    }

    protected void doSetSroprtymd_NotEqual(String sroprtymd) {
        regSroprtymd(CK_NES, sroprtymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTYMD: {varchar(255)}
     * @param sroprtymd The value of sroprtymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_GreaterThan(String sroprtymd) {
        regSroprtymd(CK_GT, fRES(sroprtymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTYMD: {varchar(255)}
     * @param sroprtymd The value of sroprtymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_LessThan(String sroprtymd) {
        regSroprtymd(CK_LT, fRES(sroprtymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTYMD: {varchar(255)}
     * @param sroprtymd The value of sroprtymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_GreaterEqual(String sroprtymd) {
        regSroprtymd(CK_GE, fRES(sroprtymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTYMD: {varchar(255)}
     * @param sroprtymd The value of sroprtymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_LessEqual(String sroprtymd) {
        regSroprtymd(CK_LE, fRES(sroprtymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SROPRTYMD: {varchar(255)}
     * @param sroprtymdList The collection of sroprtymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_InScope(Collection<String> sroprtymdList) {
        doSetSroprtymd_InScope(sroprtymdList);
    }

    protected void doSetSroprtymd_InScope(Collection<String> sroprtymdList) {
        regINS(CK_INS, cTL(sroprtymdList), xgetCValueSroprtymd(), "SROPRTYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SROPRTYMD: {varchar(255)}
     * @param sroprtymdList The collection of sroprtymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_NotInScope(Collection<String> sroprtymdList) {
        doSetSroprtymd_NotInScope(sroprtymdList);
    }

    protected void doSetSroprtymd_NotInScope(Collection<String> sroprtymdList) {
        regINS(CK_NINS, cTL(sroprtymdList), xgetCValueSroprtymd(), "SROPRTYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SROPRTYMD: {varchar(255)} <br>
     * <pre>e.g. setSroprtymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sroprtymd The value of sroprtymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSroprtymd_LikeSearch(String sroprtymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sroprtymd), xgetCValueSroprtymd(), "SROPRTYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SROPRTYMD: {varchar(255)}
     * @param sroprtymd The value of sroprtymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSroprtymd_NotLikeSearch(String sroprtymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sroprtymd), xgetCValueSroprtymd(), "SROPRTYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SROPRTYMD: {varchar(255)}
     * @param sroprtymd The value of sroprtymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtymd_PrefixSearch(String sroprtymd) {
        setSroprtymd_LikeSearch(sroprtymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SROPRTYMD: {varchar(255)}
     */
    public void setSroprtymd_IsNull() { regSroprtymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SROPRTYMD: {varchar(255)}
     */
    public void setSroprtymd_IsNullOrEmpty() { regSroprtymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SROPRTYMD: {varchar(255)}
     */
    public void setSroprtymd_IsNotNull() { regSroprtymd(CK_ISNN, DOBJ); }

    protected void regSroprtymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSroprtymd(), "SROPRTYMD"); }
    protected abstract ConditionValue xgetCValueSroprtymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {varchar(255)}
     * @param sroprtcnt The value of sroprtcnt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_Equal(String sroprtcnt) {
        doSetSroprtcnt_Equal(fRES(sroprtcnt));
    }

    protected void doSetSroprtcnt_Equal(String sroprtcnt) {
        regSroprtcnt(CK_EQ, sroprtcnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {varchar(255)}
     * @param sroprtcnt The value of sroprtcnt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotEqual(String sroprtcnt) {
        doSetSroprtcnt_NotEqual(fRES(sroprtcnt));
    }

    protected void doSetSroprtcnt_NotEqual(String sroprtcnt) {
        regSroprtcnt(CK_NES, sroprtcnt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {varchar(255)}
     * @param sroprtcnt The value of sroprtcnt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterThan(String sroprtcnt) {
        regSroprtcnt(CK_GT, fRES(sroprtcnt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {varchar(255)}
     * @param sroprtcnt The value of sroprtcnt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessThan(String sroprtcnt) {
        regSroprtcnt(CK_LT, fRES(sroprtcnt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {varchar(255)}
     * @param sroprtcnt The value of sroprtcnt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterEqual(String sroprtcnt) {
        regSroprtcnt(CK_GE, fRES(sroprtcnt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {varchar(255)}
     * @param sroprtcnt The value of sroprtcnt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessEqual(String sroprtcnt) {
        regSroprtcnt(CK_LE, fRES(sroprtcnt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {varchar(255)}
     * @param sroprtcntList The collection of sroprtcnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_InScope(Collection<String> sroprtcntList) {
        doSetSroprtcnt_InScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_InScope(Collection<String> sroprtcntList) {
        regINS(CK_INS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {varchar(255)}
     * @param sroprtcntList The collection of sroprtcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotInScope(Collection<String> sroprtcntList) {
        doSetSroprtcnt_NotInScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_NotInScope(Collection<String> sroprtcntList) {
        regINS(CK_NINS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {varchar(255)} <br>
     * <pre>e.g. setSroprtcnt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sroprtcnt The value of sroprtcnt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSroprtcnt_LikeSearch(String sroprtcnt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sroprtcnt), xgetCValueSroprtcnt(), "SROPRTCNT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {varchar(255)}
     * @param sroprtcnt The value of sroprtcnt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSroprtcnt_NotLikeSearch(String sroprtcnt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sroprtcnt), xgetCValueSroprtcnt(), "SROPRTCNT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {varchar(255)}
     * @param sroprtcnt The value of sroprtcnt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_PrefixSearch(String sroprtcnt) {
        setSroprtcnt_LikeSearch(sroprtcnt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SROPRTCNT: {varchar(255)}
     */
    public void setSroprtcnt_IsNull() { regSroprtcnt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SROPRTCNT: {varchar(255)}
     */
    public void setSroprtcnt_IsNullOrEmpty() { regSroprtcnt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SROPRTCNT: {varchar(255)}
     */
    public void setSroprtcnt_IsNotNull() { regSroprtcnt(CK_ISNN, DOBJ); }

    protected void regSroprtcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSroprtcnt(), "SROPRTCNT"); }
    protected abstract ConditionValue xgetCValueSroprtcnt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(255)}
     * @param linblk The value of linblk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_Equal(String linblk) {
        doSetLinblk_Equal(fRES(linblk));
    }

    protected void doSetLinblk_Equal(String linblk) {
        regLinblk(CK_EQ, linblk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(255)}
     * @param linblk The value of linblk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_NotEqual(String linblk) {
        doSetLinblk_NotEqual(fRES(linblk));
    }

    protected void doSetLinblk_NotEqual(String linblk) {
        regLinblk(CK_NES, linblk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(255)}
     * @param linblk The value of linblk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_GreaterThan(String linblk) {
        regLinblk(CK_GT, fRES(linblk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(255)}
     * @param linblk The value of linblk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_LessThan(String linblk) {
        regLinblk(CK_LT, fRES(linblk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(255)}
     * @param linblk The value of linblk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_GreaterEqual(String linblk) {
        regLinblk(CK_GE, fRES(linblk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(255)}
     * @param linblk The value of linblk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_LessEqual(String linblk) {
        regLinblk(CK_LE, fRES(linblk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(255)}
     * @param linblkList The collection of linblk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_InScope(Collection<String> linblkList) {
        doSetLinblk_InScope(linblkList);
    }

    protected void doSetLinblk_InScope(Collection<String> linblkList) {
        regINS(CK_INS, cTL(linblkList), xgetCValueLinblk(), "LINBLK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(255)}
     * @param linblkList The collection of linblk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_NotInScope(Collection<String> linblkList) {
        doSetLinblk_NotInScope(linblkList);
    }

    protected void doSetLinblk_NotInScope(Collection<String> linblkList) {
        regINS(CK_NINS, cTL(linblkList), xgetCValueLinblk(), "LINBLK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(255)} <br>
     * <pre>e.g. setLinblk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param linblk The value of linblk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLinblk_LikeSearch(String linblk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(linblk), xgetCValueLinblk(), "LINBLK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(255)}
     * @param linblk The value of linblk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLinblk_NotLikeSearch(String linblk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(linblk), xgetCValueLinblk(), "LINBLK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(255)}
     * @param linblk The value of linblk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_PrefixSearch(String linblk) {
        setLinblk_LikeSearch(linblk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINBLK: {varchar(255)}
     */
    public void setLinblk_IsNull() { regLinblk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINBLK: {varchar(255)}
     */
    public void setLinblk_IsNullOrEmpty() { regLinblk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINBLK: {varchar(255)}
     */
    public void setLinblk_IsNotNull() { regLinblk(CK_ISNN, DOBJ); }

    protected void regLinblk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLinblk(), "LINBLK"); }
    protected abstract ConditionValue xgetCValueLinblk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(255)}
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
     * DLVYMD: {varchar(255)}
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
     * DLVYMD: {varchar(255)}
     * @param dlvymd The value of dlvymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_GreaterThan(String dlvymd) {
        regDlvymd(CK_GT, fRES(dlvymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(255)}
     * @param dlvymd The value of dlvymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_LessThan(String dlvymd) {
        regDlvymd(CK_LT, fRES(dlvymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(255)}
     * @param dlvymd The value of dlvymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_GreaterEqual(String dlvymd) {
        regDlvymd(CK_GE, fRES(dlvymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(255)}
     * @param dlvymd The value of dlvymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_LessEqual(String dlvymd) {
        regDlvymd(CK_LE, fRES(dlvymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVYMD: {varchar(255)}
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
     * DLVYMD: {varchar(255)}
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
     * DLVYMD: {varchar(255)} <br>
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
     * DLVYMD: {varchar(255)}
     * @param dlvymd The value of dlvymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDlvymd_NotLikeSearch(String dlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dlvymd), xgetCValueDlvymd(), "DLVYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {varchar(255)}
     * @param dlvymd The value of dlvymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_PrefixSearch(String dlvymd) {
        setDlvymd_LikeSearch(dlvymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(255)}
     */
    public void setDlvymd_IsNull() { regDlvymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(255)}
     */
    public void setDlvymd_IsNullOrEmpty() { regDlvymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(255)}
     */
    public void setDlvymd_IsNotNull() { regDlvymd(CK_ISNN, DOBJ); }

    protected void regDlvymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvymd(), "DLVYMD"); }
    protected abstract ConditionValue xgetCValueDlvymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
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
     * DPCD: {varchar(255)}
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
     * DPCD: {varchar(255)}
     * @param dpcd The value of dpcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterThan(String dpcd) {
        regDpcd(CK_GT, fRES(dpcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     * @param dpcd The value of dpcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessThan(String dpcd) {
        regDpcd(CK_LT, fRES(dpcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     * @param dpcd The value of dpcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterEqual(String dpcd) {
        regDpcd(CK_GE, fRES(dpcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     * @param dpcd The value of dpcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessEqual(String dpcd) {
        regDpcd(CK_LE, fRES(dpcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(255)}
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
     * DPCD: {varchar(255)}
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
     * DPCD: {varchar(255)} <br>
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
     * DPCD: {varchar(255)}
     * @param dpcd The value of dpcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDpcd_NotLikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(255)}
     * @param dpcd The value of dpcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_PrefixSearch(String dpcd) {
        setDpcd_LikeSearch(dpcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     */
    public void setDpcd_IsNull() { regDpcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     */
    public void setDpcd_IsNullOrEmpty() { regDpcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(255)}
     */
    public void setDpcd_IsNotNull() { regDpcd(CK_ISNN, DOBJ); }

    protected void regDpcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDpcd(), "DPCD"); }
    protected abstract ConditionValue xgetCValueDpcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
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
     * DED: {varchar(255)}
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
     * DED: {varchar(255)}
     * @param ded The value of ded as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterThan(String ded) {
        regDed(CK_GT, fRES(ded));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessThan(String ded) {
        regDed(CK_LT, fRES(ded));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterEqual(String ded) {
        regDed(CK_GE, fRES(ded));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessEqual(String ded) {
        regDed(CK_LE, fRES(ded));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {varchar(255)}
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
     * DED: {varchar(255)}
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
     * DED: {varchar(255)} <br>
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
     * DED: {varchar(255)}
     * @param ded The value of ded as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDed_NotLikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {varchar(255)}
     * @param ded The value of ded as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_PrefixSearch(String ded) {
        setDed_LikeSearch(ded, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     */
    public void setDed_IsNull() { regDed(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     */
    public void setDed_IsNullOrEmpty() { regDed(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DED: {varchar(255)}
     */
    public void setDed_IsNotNull() { regDed(CK_ISNN, DOBJ); }

    protected void regDed(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDed(), "DED"); }
    protected abstract ConditionValue xgetCValueDed();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
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
     * PSTNID: {varchar(255)}
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
     * PSTNID: {varchar(255)}
     * @param pstnid The value of pstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterThan(String pstnid) {
        regPstnid(CK_GT, fRES(pstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     * @param pstnid The value of pstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessThan(String pstnid) {
        regPstnid(CK_LT, fRES(pstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     * @param pstnid The value of pstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterEqual(String pstnid) {
        regPstnid(CK_GE, fRES(pstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     * @param pstnid The value of pstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessEqual(String pstnid) {
        regPstnid(CK_LE, fRES(pstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {varchar(255)}
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
     * PSTNID: {varchar(255)}
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
     * PSTNID: {varchar(255)} <br>
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
     * PSTNID: {varchar(255)}
     * @param pstnid The value of pstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPstnid_NotLikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {varchar(255)}
     * @param pstnid The value of pstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_PrefixSearch(String pstnid) {
        setPstnid_LikeSearch(pstnid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     */
    public void setPstnid_IsNull() { regPstnid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     */
    public void setPstnid_IsNullOrEmpty() { regPstnid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PSTNID: {varchar(255)}
     */
    public void setPstnid_IsNotNull() { regPstnid(CK_ISNN, DOBJ); }

    protected void regPstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePstnid(), "PSTNID"); }
    protected abstract ConditionValue xgetCValuePstnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(255)}
     * @param srlincd The value of srlincd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_Equal(String srlincd) {
        doSetSrlincd_Equal(fRES(srlincd));
    }

    protected void doSetSrlincd_Equal(String srlincd) {
        regSrlincd(CK_EQ, srlincd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(255)}
     * @param srlincd The value of srlincd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_NotEqual(String srlincd) {
        doSetSrlincd_NotEqual(fRES(srlincd));
    }

    protected void doSetSrlincd_NotEqual(String srlincd) {
        regSrlincd(CK_NES, srlincd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(255)}
     * @param srlincd The value of srlincd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_GreaterThan(String srlincd) {
        regSrlincd(CK_GT, fRES(srlincd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(255)}
     * @param srlincd The value of srlincd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_LessThan(String srlincd) {
        regSrlincd(CK_LT, fRES(srlincd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(255)}
     * @param srlincd The value of srlincd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_GreaterEqual(String srlincd) {
        regSrlincd(CK_GE, fRES(srlincd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(255)}
     * @param srlincd The value of srlincd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_LessEqual(String srlincd) {
        regSrlincd(CK_LE, fRES(srlincd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(255)}
     * @param srlincdList The collection of srlincd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_InScope(Collection<String> srlincdList) {
        doSetSrlincd_InScope(srlincdList);
    }

    protected void doSetSrlincd_InScope(Collection<String> srlincdList) {
        regINS(CK_INS, cTL(srlincdList), xgetCValueSrlincd(), "SRLINCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(255)}
     * @param srlincdList The collection of srlincd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_NotInScope(Collection<String> srlincdList) {
        doSetSrlincd_NotInScope(srlincdList);
    }

    protected void doSetSrlincd_NotInScope(Collection<String> srlincdList) {
        regINS(CK_NINS, cTL(srlincdList), xgetCValueSrlincd(), "SRLINCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(255)} <br>
     * <pre>e.g. setSrlincd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srlincd The value of srlincd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrlincd_LikeSearch(String srlincd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srlincd), xgetCValueSrlincd(), "SRLINCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(255)}
     * @param srlincd The value of srlincd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrlincd_NotLikeSearch(String srlincd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srlincd), xgetCValueSrlincd(), "SRLINCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(255)}
     * @param srlincd The value of srlincd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_PrefixSearch(String srlincd) {
        setSrlincd_LikeSearch(srlincd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(255)}
     */
    public void setSrlincd_IsNull() { regSrlincd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(255)}
     */
    public void setSrlincd_IsNullOrEmpty() { regSrlincd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(255)}
     */
    public void setSrlincd_IsNotNull() { regSrlincd(CK_ISNN, DOBJ); }

    protected void regSrlincd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrlincd(), "SRLINCD"); }
    protected abstract ConditionValue xgetCValueSrlincd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {varchar(255)}
     * @param srrnk The value of srrnk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_Equal(String srrnk) {
        doSetSrrnk_Equal(fRES(srrnk));
    }

    protected void doSetSrrnk_Equal(String srrnk) {
        regSrrnk(CK_EQ, srrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {varchar(255)}
     * @param srrnk The value of srrnk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_NotEqual(String srrnk) {
        doSetSrrnk_NotEqual(fRES(srrnk));
    }

    protected void doSetSrrnk_NotEqual(String srrnk) {
        regSrrnk(CK_NES, srrnk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {varchar(255)}
     * @param srrnk The value of srrnk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_GreaterThan(String srrnk) {
        regSrrnk(CK_GT, fRES(srrnk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {varchar(255)}
     * @param srrnk The value of srrnk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_LessThan(String srrnk) {
        regSrrnk(CK_LT, fRES(srrnk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {varchar(255)}
     * @param srrnk The value of srrnk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_GreaterEqual(String srrnk) {
        regSrrnk(CK_GE, fRES(srrnk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {varchar(255)}
     * @param srrnk The value of srrnk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_LessEqual(String srrnk) {
        regSrrnk(CK_LE, fRES(srrnk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRRNK: {varchar(255)}
     * @param srrnkList The collection of srrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_InScope(Collection<String> srrnkList) {
        doSetSrrnk_InScope(srrnkList);
    }

    protected void doSetSrrnk_InScope(Collection<String> srrnkList) {
        regINS(CK_INS, cTL(srrnkList), xgetCValueSrrnk(), "SRRNK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRRNK: {varchar(255)}
     * @param srrnkList The collection of srrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_NotInScope(Collection<String> srrnkList) {
        doSetSrrnk_NotInScope(srrnkList);
    }

    protected void doSetSrrnk_NotInScope(Collection<String> srrnkList) {
        regINS(CK_NINS, cTL(srrnkList), xgetCValueSrrnk(), "SRRNK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRRNK: {varchar(255)} <br>
     * <pre>e.g. setSrrnk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srrnk The value of srrnk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrrnk_LikeSearch(String srrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srrnk), xgetCValueSrrnk(), "SRRNK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRRNK: {varchar(255)}
     * @param srrnk The value of srrnk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrrnk_NotLikeSearch(String srrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srrnk), xgetCValueSrrnk(), "SRRNK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRRNK: {varchar(255)}
     * @param srrnk The value of srrnk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_PrefixSearch(String srrnk) {
        setSrrnk_LikeSearch(srrnk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRRNK: {varchar(255)}
     */
    public void setSrrnk_IsNull() { regSrrnk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRRNK: {varchar(255)}
     */
    public void setSrrnk_IsNullOrEmpty() { regSrrnk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRRNK: {varchar(255)}
     */
    public void setSrrnk_IsNotNull() { regSrrnk(CK_ISNN, DOBJ); }

    protected void regSrrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrrnk(), "SRRNK"); }
    protected abstract ConditionValue xgetCValueSrrnk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPAT: {varchar(255)}
     * @param srpat The value of srpat as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpat_Equal(String srpat) {
        doSetSrpat_Equal(fRES(srpat));
    }

    protected void doSetSrpat_Equal(String srpat) {
        regSrpat(CK_EQ, srpat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPAT: {varchar(255)}
     * @param srpat The value of srpat as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpat_NotEqual(String srpat) {
        doSetSrpat_NotEqual(fRES(srpat));
    }

    protected void doSetSrpat_NotEqual(String srpat) {
        regSrpat(CK_NES, srpat);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPAT: {varchar(255)}
     * @param srpat The value of srpat as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpat_GreaterThan(String srpat) {
        regSrpat(CK_GT, fRES(srpat));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPAT: {varchar(255)}
     * @param srpat The value of srpat as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpat_LessThan(String srpat) {
        regSrpat(CK_LT, fRES(srpat));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPAT: {varchar(255)}
     * @param srpat The value of srpat as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpat_GreaterEqual(String srpat) {
        regSrpat(CK_GE, fRES(srpat));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPAT: {varchar(255)}
     * @param srpat The value of srpat as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpat_LessEqual(String srpat) {
        regSrpat(CK_LE, fRES(srpat));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRPAT: {varchar(255)}
     * @param srpatList The collection of srpat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpat_InScope(Collection<String> srpatList) {
        doSetSrpat_InScope(srpatList);
    }

    protected void doSetSrpat_InScope(Collection<String> srpatList) {
        regINS(CK_INS, cTL(srpatList), xgetCValueSrpat(), "SRPAT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRPAT: {varchar(255)}
     * @param srpatList The collection of srpat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpat_NotInScope(Collection<String> srpatList) {
        doSetSrpat_NotInScope(srpatList);
    }

    protected void doSetSrpat_NotInScope(Collection<String> srpatList) {
        regINS(CK_NINS, cTL(srpatList), xgetCValueSrpat(), "SRPAT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRPAT: {varchar(255)} <br>
     * <pre>e.g. setSrpat_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srpat The value of srpat as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrpat_LikeSearch(String srpat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srpat), xgetCValueSrpat(), "SRPAT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRPAT: {varchar(255)}
     * @param srpat The value of srpat as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrpat_NotLikeSearch(String srpat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srpat), xgetCValueSrpat(), "SRPAT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRPAT: {varchar(255)}
     * @param srpat The value of srpat as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpat_PrefixSearch(String srpat) {
        setSrpat_LikeSearch(srpat, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRPAT: {varchar(255)}
     */
    public void setSrpat_IsNull() { regSrpat(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRPAT: {varchar(255)}
     */
    public void setSrpat_IsNullOrEmpty() { regSrpat(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRPAT: {varchar(255)}
     */
    public void setSrpat_IsNotNull() { regSrpat(CK_ISNN, DOBJ); }

    protected void regSrpat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrpat(), "SRPAT"); }
    protected abstract ConditionValue xgetCValueSrpat();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TTBRQA: {varchar(255)}
     * @param ttbrqa The value of ttbrqa as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtbrqa_Equal(String ttbrqa) {
        doSetTtbrqa_Equal(fRES(ttbrqa));
    }

    protected void doSetTtbrqa_Equal(String ttbrqa) {
        regTtbrqa(CK_EQ, ttbrqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TTBRQA: {varchar(255)}
     * @param ttbrqa The value of ttbrqa as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtbrqa_NotEqual(String ttbrqa) {
        doSetTtbrqa_NotEqual(fRES(ttbrqa));
    }

    protected void doSetTtbrqa_NotEqual(String ttbrqa) {
        regTtbrqa(CK_NES, ttbrqa);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TTBRQA: {varchar(255)}
     * @param ttbrqa The value of ttbrqa as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtbrqa_GreaterThan(String ttbrqa) {
        regTtbrqa(CK_GT, fRES(ttbrqa));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TTBRQA: {varchar(255)}
     * @param ttbrqa The value of ttbrqa as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtbrqa_LessThan(String ttbrqa) {
        regTtbrqa(CK_LT, fRES(ttbrqa));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TTBRQA: {varchar(255)}
     * @param ttbrqa The value of ttbrqa as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtbrqa_GreaterEqual(String ttbrqa) {
        regTtbrqa(CK_GE, fRES(ttbrqa));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TTBRQA: {varchar(255)}
     * @param ttbrqa The value of ttbrqa as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtbrqa_LessEqual(String ttbrqa) {
        regTtbrqa(CK_LE, fRES(ttbrqa));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TTBRQA: {varchar(255)}
     * @param ttbrqaList The collection of ttbrqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtbrqa_InScope(Collection<String> ttbrqaList) {
        doSetTtbrqa_InScope(ttbrqaList);
    }

    protected void doSetTtbrqa_InScope(Collection<String> ttbrqaList) {
        regINS(CK_INS, cTL(ttbrqaList), xgetCValueTtbrqa(), "TTBRQA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TTBRQA: {varchar(255)}
     * @param ttbrqaList The collection of ttbrqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtbrqa_NotInScope(Collection<String> ttbrqaList) {
        doSetTtbrqa_NotInScope(ttbrqaList);
    }

    protected void doSetTtbrqa_NotInScope(Collection<String> ttbrqaList) {
        regINS(CK_NINS, cTL(ttbrqaList), xgetCValueTtbrqa(), "TTBRQA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TTBRQA: {varchar(255)} <br>
     * <pre>e.g. setTtbrqa_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ttbrqa The value of ttbrqa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTtbrqa_LikeSearch(String ttbrqa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ttbrqa), xgetCValueTtbrqa(), "TTBRQA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TTBRQA: {varchar(255)}
     * @param ttbrqa The value of ttbrqa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTtbrqa_NotLikeSearch(String ttbrqa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ttbrqa), xgetCValueTtbrqa(), "TTBRQA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TTBRQA: {varchar(255)}
     * @param ttbrqa The value of ttbrqa as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtbrqa_PrefixSearch(String ttbrqa) {
        setTtbrqa_LikeSearch(ttbrqa, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TTBRQA: {varchar(255)}
     */
    public void setTtbrqa_IsNull() { regTtbrqa(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TTBRQA: {varchar(255)}
     */
    public void setTtbrqa_IsNullOrEmpty() { regTtbrqa(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TTBRQA: {varchar(255)}
     */
    public void setTtbrqa_IsNotNull() { regTtbrqa(CK_ISNN, DOBJ); }

    protected void regTtbrqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTtbrqa(), "TTBRQA"); }
    protected abstract ConditionValue xgetCValueTtbrqa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHPQA: {varchar(255)}
     * @param shpqa The value of shpqa as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShpqa_Equal(String shpqa) {
        doSetShpqa_Equal(fRES(shpqa));
    }

    protected void doSetShpqa_Equal(String shpqa) {
        regShpqa(CK_EQ, shpqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHPQA: {varchar(255)}
     * @param shpqa The value of shpqa as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShpqa_NotEqual(String shpqa) {
        doSetShpqa_NotEqual(fRES(shpqa));
    }

    protected void doSetShpqa_NotEqual(String shpqa) {
        regShpqa(CK_NES, shpqa);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHPQA: {varchar(255)}
     * @param shpqa The value of shpqa as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShpqa_GreaterThan(String shpqa) {
        regShpqa(CK_GT, fRES(shpqa));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHPQA: {varchar(255)}
     * @param shpqa The value of shpqa as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShpqa_LessThan(String shpqa) {
        regShpqa(CK_LT, fRES(shpqa));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHPQA: {varchar(255)}
     * @param shpqa The value of shpqa as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShpqa_GreaterEqual(String shpqa) {
        regShpqa(CK_GE, fRES(shpqa));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHPQA: {varchar(255)}
     * @param shpqa The value of shpqa as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShpqa_LessEqual(String shpqa) {
        regShpqa(CK_LE, fRES(shpqa));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHPQA: {varchar(255)}
     * @param shpqaList The collection of shpqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShpqa_InScope(Collection<String> shpqaList) {
        doSetShpqa_InScope(shpqaList);
    }

    protected void doSetShpqa_InScope(Collection<String> shpqaList) {
        regINS(CK_INS, cTL(shpqaList), xgetCValueShpqa(), "SHPQA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHPQA: {varchar(255)}
     * @param shpqaList The collection of shpqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShpqa_NotInScope(Collection<String> shpqaList) {
        doSetShpqa_NotInScope(shpqaList);
    }

    protected void doSetShpqa_NotInScope(Collection<String> shpqaList) {
        regINS(CK_NINS, cTL(shpqaList), xgetCValueShpqa(), "SHPQA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHPQA: {varchar(255)} <br>
     * <pre>e.g. setShpqa_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shpqa The value of shpqa as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShpqa_LikeSearch(String shpqa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shpqa), xgetCValueShpqa(), "SHPQA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHPQA: {varchar(255)}
     * @param shpqa The value of shpqa as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShpqa_NotLikeSearch(String shpqa, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shpqa), xgetCValueShpqa(), "SHPQA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHPQA: {varchar(255)}
     * @param shpqa The value of shpqa as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShpqa_PrefixSearch(String shpqa) {
        setShpqa_LikeSearch(shpqa, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHPQA: {varchar(255)}
     */
    public void setShpqa_IsNull() { regShpqa(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHPQA: {varchar(255)}
     */
    public void setShpqa_IsNullOrEmpty() { regShpqa(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHPQA: {varchar(255)}
     */
    public void setShpqa_IsNotNull() { regShpqa(CK_ISNN, DOBJ); }

    protected void regShpqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShpqa(), "SHPQA"); }
    protected abstract ConditionValue xgetCValueShpqa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {varchar(255)}
     * @param sprqasftpcl The value of sprqasftpcl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqasftpcl_Equal(String sprqasftpcl) {
        doSetSprqasftpcl_Equal(fRES(sprqasftpcl));
    }

    protected void doSetSprqasftpcl_Equal(String sprqasftpcl) {
        regSprqasftpcl(CK_EQ, sprqasftpcl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {varchar(255)}
     * @param sprqasftpcl The value of sprqasftpcl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqasftpcl_NotEqual(String sprqasftpcl) {
        doSetSprqasftpcl_NotEqual(fRES(sprqasftpcl));
    }

    protected void doSetSprqasftpcl_NotEqual(String sprqasftpcl) {
        regSprqasftpcl(CK_NES, sprqasftpcl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {varchar(255)}
     * @param sprqasftpcl The value of sprqasftpcl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqasftpcl_GreaterThan(String sprqasftpcl) {
        regSprqasftpcl(CK_GT, fRES(sprqasftpcl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {varchar(255)}
     * @param sprqasftpcl The value of sprqasftpcl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqasftpcl_LessThan(String sprqasftpcl) {
        regSprqasftpcl(CK_LT, fRES(sprqasftpcl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {varchar(255)}
     * @param sprqasftpcl The value of sprqasftpcl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqasftpcl_GreaterEqual(String sprqasftpcl) {
        regSprqasftpcl(CK_GE, fRES(sprqasftpcl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {varchar(255)}
     * @param sprqasftpcl The value of sprqasftpcl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqasftpcl_LessEqual(String sprqasftpcl) {
        regSprqasftpcl(CK_LE, fRES(sprqasftpcl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQASFTPCL: {varchar(255)}
     * @param sprqasftpclList The collection of sprqasftpcl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqasftpcl_InScope(Collection<String> sprqasftpclList) {
        doSetSprqasftpcl_InScope(sprqasftpclList);
    }

    protected void doSetSprqasftpcl_InScope(Collection<String> sprqasftpclList) {
        regINS(CK_INS, cTL(sprqasftpclList), xgetCValueSprqasftpcl(), "SPRQASFTPCL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQASFTPCL: {varchar(255)}
     * @param sprqasftpclList The collection of sprqasftpcl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqasftpcl_NotInScope(Collection<String> sprqasftpclList) {
        doSetSprqasftpcl_NotInScope(sprqasftpclList);
    }

    protected void doSetSprqasftpcl_NotInScope(Collection<String> sprqasftpclList) {
        regINS(CK_NINS, cTL(sprqasftpclList), xgetCValueSprqasftpcl(), "SPRQASFTPCL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQASFTPCL: {varchar(255)} <br>
     * <pre>e.g. setSprqasftpcl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sprqasftpcl The value of sprqasftpcl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSprqasftpcl_LikeSearch(String sprqasftpcl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sprqasftpcl), xgetCValueSprqasftpcl(), "SPRQASFTPCL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQASFTPCL: {varchar(255)}
     * @param sprqasftpcl The value of sprqasftpcl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSprqasftpcl_NotLikeSearch(String sprqasftpcl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sprqasftpcl), xgetCValueSprqasftpcl(), "SPRQASFTPCL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQASFTPCL: {varchar(255)}
     * @param sprqasftpcl The value of sprqasftpcl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqasftpcl_PrefixSearch(String sprqasftpcl) {
        setSprqasftpcl_LikeSearch(sprqasftpcl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {varchar(255)}
     */
    public void setSprqasftpcl_IsNull() { regSprqasftpcl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {varchar(255)}
     */
    public void setSprqasftpcl_IsNullOrEmpty() { regSprqasftpcl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQASFTPCL: {varchar(255)}
     */
    public void setSprqasftpcl_IsNotNull() { regSprqasftpcl(CK_ISNN, DOBJ); }

    protected void regSprqasftpcl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqasftpcl(), "SPRQASFTPCL"); }
    protected abstract ConditionValue xgetCValueSprqasftpcl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {varchar(255)}
     * @param sprqatsnbox The value of sprqatsnbox as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqatsnbox_Equal(String sprqatsnbox) {
        doSetSprqatsnbox_Equal(fRES(sprqatsnbox));
    }

    protected void doSetSprqatsnbox_Equal(String sprqatsnbox) {
        regSprqatsnbox(CK_EQ, sprqatsnbox);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {varchar(255)}
     * @param sprqatsnbox The value of sprqatsnbox as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqatsnbox_NotEqual(String sprqatsnbox) {
        doSetSprqatsnbox_NotEqual(fRES(sprqatsnbox));
    }

    protected void doSetSprqatsnbox_NotEqual(String sprqatsnbox) {
        regSprqatsnbox(CK_NES, sprqatsnbox);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {varchar(255)}
     * @param sprqatsnbox The value of sprqatsnbox as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqatsnbox_GreaterThan(String sprqatsnbox) {
        regSprqatsnbox(CK_GT, fRES(sprqatsnbox));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {varchar(255)}
     * @param sprqatsnbox The value of sprqatsnbox as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqatsnbox_LessThan(String sprqatsnbox) {
        regSprqatsnbox(CK_LT, fRES(sprqatsnbox));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {varchar(255)}
     * @param sprqatsnbox The value of sprqatsnbox as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqatsnbox_GreaterEqual(String sprqatsnbox) {
        regSprqatsnbox(CK_GE, fRES(sprqatsnbox));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {varchar(255)}
     * @param sprqatsnbox The value of sprqatsnbox as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqatsnbox_LessEqual(String sprqatsnbox) {
        regSprqatsnbox(CK_LE, fRES(sprqatsnbox));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQATSNBOX: {varchar(255)}
     * @param sprqatsnboxList The collection of sprqatsnbox as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqatsnbox_InScope(Collection<String> sprqatsnboxList) {
        doSetSprqatsnbox_InScope(sprqatsnboxList);
    }

    protected void doSetSprqatsnbox_InScope(Collection<String> sprqatsnboxList) {
        regINS(CK_INS, cTL(sprqatsnboxList), xgetCValueSprqatsnbox(), "SPRQATSNBOX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQATSNBOX: {varchar(255)}
     * @param sprqatsnboxList The collection of sprqatsnbox as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqatsnbox_NotInScope(Collection<String> sprqatsnboxList) {
        doSetSprqatsnbox_NotInScope(sprqatsnboxList);
    }

    protected void doSetSprqatsnbox_NotInScope(Collection<String> sprqatsnboxList) {
        regINS(CK_NINS, cTL(sprqatsnboxList), xgetCValueSprqatsnbox(), "SPRQATSNBOX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQATSNBOX: {varchar(255)} <br>
     * <pre>e.g. setSprqatsnbox_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sprqatsnbox The value of sprqatsnbox as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSprqatsnbox_LikeSearch(String sprqatsnbox, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sprqatsnbox), xgetCValueSprqatsnbox(), "SPRQATSNBOX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQATSNBOX: {varchar(255)}
     * @param sprqatsnbox The value of sprqatsnbox as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSprqatsnbox_NotLikeSearch(String sprqatsnbox, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sprqatsnbox), xgetCValueSprqatsnbox(), "SPRQATSNBOX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQATSNBOX: {varchar(255)}
     * @param sprqatsnbox The value of sprqatsnbox as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqatsnbox_PrefixSearch(String sprqatsnbox) {
        setSprqatsnbox_LikeSearch(sprqatsnbox, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {varchar(255)}
     */
    public void setSprqatsnbox_IsNull() { regSprqatsnbox(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {varchar(255)}
     */
    public void setSprqatsnbox_IsNullOrEmpty() { regSprqatsnbox(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQATSNBOX: {varchar(255)}
     */
    public void setSprqatsnbox_IsNotNull() { regSprqatsnbox(CK_ISNN, DOBJ); }

    protected void regSprqatsnbox(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqatsnbox(), "SPRQATSNBOX"); }
    protected abstract ConditionValue xgetCValueSprqatsnbox();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {varchar(255)}
     * @param sprqajtbox The value of sprqajtbox as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqajtbox_Equal(String sprqajtbox) {
        doSetSprqajtbox_Equal(fRES(sprqajtbox));
    }

    protected void doSetSprqajtbox_Equal(String sprqajtbox) {
        regSprqajtbox(CK_EQ, sprqajtbox);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {varchar(255)}
     * @param sprqajtbox The value of sprqajtbox as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqajtbox_NotEqual(String sprqajtbox) {
        doSetSprqajtbox_NotEqual(fRES(sprqajtbox));
    }

    protected void doSetSprqajtbox_NotEqual(String sprqajtbox) {
        regSprqajtbox(CK_NES, sprqajtbox);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {varchar(255)}
     * @param sprqajtbox The value of sprqajtbox as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqajtbox_GreaterThan(String sprqajtbox) {
        regSprqajtbox(CK_GT, fRES(sprqajtbox));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {varchar(255)}
     * @param sprqajtbox The value of sprqajtbox as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqajtbox_LessThan(String sprqajtbox) {
        regSprqajtbox(CK_LT, fRES(sprqajtbox));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {varchar(255)}
     * @param sprqajtbox The value of sprqajtbox as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqajtbox_GreaterEqual(String sprqajtbox) {
        regSprqajtbox(CK_GE, fRES(sprqajtbox));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {varchar(255)}
     * @param sprqajtbox The value of sprqajtbox as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqajtbox_LessEqual(String sprqajtbox) {
        regSprqajtbox(CK_LE, fRES(sprqajtbox));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQAJTBOX: {varchar(255)}
     * @param sprqajtboxList The collection of sprqajtbox as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqajtbox_InScope(Collection<String> sprqajtboxList) {
        doSetSprqajtbox_InScope(sprqajtboxList);
    }

    protected void doSetSprqajtbox_InScope(Collection<String> sprqajtboxList) {
        regINS(CK_INS, cTL(sprqajtboxList), xgetCValueSprqajtbox(), "SPRQAJTBOX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQAJTBOX: {varchar(255)}
     * @param sprqajtboxList The collection of sprqajtbox as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqajtbox_NotInScope(Collection<String> sprqajtboxList) {
        doSetSprqajtbox_NotInScope(sprqajtboxList);
    }

    protected void doSetSprqajtbox_NotInScope(Collection<String> sprqajtboxList) {
        regINS(CK_NINS, cTL(sprqajtboxList), xgetCValueSprqajtbox(), "SPRQAJTBOX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAJTBOX: {varchar(255)} <br>
     * <pre>e.g. setSprqajtbox_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sprqajtbox The value of sprqajtbox as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSprqajtbox_LikeSearch(String sprqajtbox, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sprqajtbox), xgetCValueSprqajtbox(), "SPRQAJTBOX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAJTBOX: {varchar(255)}
     * @param sprqajtbox The value of sprqajtbox as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSprqajtbox_NotLikeSearch(String sprqajtbox, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sprqajtbox), xgetCValueSprqajtbox(), "SPRQAJTBOX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAJTBOX: {varchar(255)}
     * @param sprqajtbox The value of sprqajtbox as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqajtbox_PrefixSearch(String sprqajtbox) {
        setSprqajtbox_LikeSearch(sprqajtbox, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {varchar(255)}
     */
    public void setSprqajtbox_IsNull() { regSprqajtbox(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {varchar(255)}
     */
    public void setSprqajtbox_IsNullOrEmpty() { regSprqajtbox(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQAJTBOX: {varchar(255)}
     */
    public void setSprqajtbox_IsNotNull() { regSprqajtbox(CK_ISNN, DOBJ); }

    protected void regSprqajtbox(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqajtbox(), "SPRQAJTBOX"); }
    protected abstract ConditionValue xgetCValueSprqajtbox();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQA100BOX: {varchar(255)}
     * @param sprqa100box The value of sprqa100box as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqa100box_Equal(String sprqa100box) {
        doSetSprqa100box_Equal(fRES(sprqa100box));
    }

    protected void doSetSprqa100box_Equal(String sprqa100box) {
        regSprqa100box(CK_EQ, sprqa100box);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQA100BOX: {varchar(255)}
     * @param sprqa100box The value of sprqa100box as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqa100box_NotEqual(String sprqa100box) {
        doSetSprqa100box_NotEqual(fRES(sprqa100box));
    }

    protected void doSetSprqa100box_NotEqual(String sprqa100box) {
        regSprqa100box(CK_NES, sprqa100box);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQA100BOX: {varchar(255)}
     * @param sprqa100box The value of sprqa100box as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqa100box_GreaterThan(String sprqa100box) {
        regSprqa100box(CK_GT, fRES(sprqa100box));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQA100BOX: {varchar(255)}
     * @param sprqa100box The value of sprqa100box as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqa100box_LessThan(String sprqa100box) {
        regSprqa100box(CK_LT, fRES(sprqa100box));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQA100BOX: {varchar(255)}
     * @param sprqa100box The value of sprqa100box as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqa100box_GreaterEqual(String sprqa100box) {
        regSprqa100box(CK_GE, fRES(sprqa100box));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQA100BOX: {varchar(255)}
     * @param sprqa100box The value of sprqa100box as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqa100box_LessEqual(String sprqa100box) {
        regSprqa100box(CK_LE, fRES(sprqa100box));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQA100BOX: {varchar(255)}
     * @param sprqa100boxList The collection of sprqa100box as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqa100box_InScope(Collection<String> sprqa100boxList) {
        doSetSprqa100box_InScope(sprqa100boxList);
    }

    protected void doSetSprqa100box_InScope(Collection<String> sprqa100boxList) {
        regINS(CK_INS, cTL(sprqa100boxList), xgetCValueSprqa100box(), "SPRQA100BOX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQA100BOX: {varchar(255)}
     * @param sprqa100boxList The collection of sprqa100box as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqa100box_NotInScope(Collection<String> sprqa100boxList) {
        doSetSprqa100box_NotInScope(sprqa100boxList);
    }

    protected void doSetSprqa100box_NotInScope(Collection<String> sprqa100boxList) {
        regINS(CK_NINS, cTL(sprqa100boxList), xgetCValueSprqa100box(), "SPRQA100BOX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQA100BOX: {varchar(255)} <br>
     * <pre>e.g. setSprqa100box_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sprqa100box The value of sprqa100box as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSprqa100box_LikeSearch(String sprqa100box, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sprqa100box), xgetCValueSprqa100box(), "SPRQA100BOX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQA100BOX: {varchar(255)}
     * @param sprqa100box The value of sprqa100box as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSprqa100box_NotLikeSearch(String sprqa100box, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sprqa100box), xgetCValueSprqa100box(), "SPRQA100BOX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQA100BOX: {varchar(255)}
     * @param sprqa100box The value of sprqa100box as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqa100box_PrefixSearch(String sprqa100box) {
        setSprqa100box_LikeSearch(sprqa100box, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQA100BOX: {varchar(255)}
     */
    public void setSprqa100box_IsNull() { regSprqa100box(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPRQA100BOX: {varchar(255)}
     */
    public void setSprqa100box_IsNullOrEmpty() { regSprqa100box(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQA100BOX: {varchar(255)}
     */
    public void setSprqa100box_IsNotNull() { regSprqa100box(CK_ISNN, DOBJ); }

    protected void regSprqa100box(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqa100box(), "SPRQA100BOX"); }
    protected abstract ConditionValue xgetCValueSprqa100box();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL: {varchar(255)}
     * @param sprqahl The value of sprqahl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl_Equal(String sprqahl) {
        doSetSprqahl_Equal(fRES(sprqahl));
    }

    protected void doSetSprqahl_Equal(String sprqahl) {
        regSprqahl(CK_EQ, sprqahl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL: {varchar(255)}
     * @param sprqahl The value of sprqahl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl_NotEqual(String sprqahl) {
        doSetSprqahl_NotEqual(fRES(sprqahl));
    }

    protected void doSetSprqahl_NotEqual(String sprqahl) {
        regSprqahl(CK_NES, sprqahl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL: {varchar(255)}
     * @param sprqahl The value of sprqahl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl_GreaterThan(String sprqahl) {
        regSprqahl(CK_GT, fRES(sprqahl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL: {varchar(255)}
     * @param sprqahl The value of sprqahl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl_LessThan(String sprqahl) {
        regSprqahl(CK_LT, fRES(sprqahl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL: {varchar(255)}
     * @param sprqahl The value of sprqahl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl_GreaterEqual(String sprqahl) {
        regSprqahl(CK_GE, fRES(sprqahl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL: {varchar(255)}
     * @param sprqahl The value of sprqahl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl_LessEqual(String sprqahl) {
        regSprqahl(CK_LE, fRES(sprqahl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQAHL: {varchar(255)}
     * @param sprqahlList The collection of sprqahl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl_InScope(Collection<String> sprqahlList) {
        doSetSprqahl_InScope(sprqahlList);
    }

    protected void doSetSprqahl_InScope(Collection<String> sprqahlList) {
        regINS(CK_INS, cTL(sprqahlList), xgetCValueSprqahl(), "SPRQAHL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQAHL: {varchar(255)}
     * @param sprqahlList The collection of sprqahl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl_NotInScope(Collection<String> sprqahlList) {
        doSetSprqahl_NotInScope(sprqahlList);
    }

    protected void doSetSprqahl_NotInScope(Collection<String> sprqahlList) {
        regINS(CK_NINS, cTL(sprqahlList), xgetCValueSprqahl(), "SPRQAHL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAHL: {varchar(255)} <br>
     * <pre>e.g. setSprqahl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sprqahl The value of sprqahl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSprqahl_LikeSearch(String sprqahl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sprqahl), xgetCValueSprqahl(), "SPRQAHL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAHL: {varchar(255)}
     * @param sprqahl The value of sprqahl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSprqahl_NotLikeSearch(String sprqahl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sprqahl), xgetCValueSprqahl(), "SPRQAHL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAHL: {varchar(255)}
     * @param sprqahl The value of sprqahl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl_PrefixSearch(String sprqahl) {
        setSprqahl_LikeSearch(sprqahl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQAHL: {varchar(255)}
     */
    public void setSprqahl_IsNull() { regSprqahl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPRQAHL: {varchar(255)}
     */
    public void setSprqahl_IsNullOrEmpty() { regSprqahl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQAHL: {varchar(255)}
     */
    public void setSprqahl_IsNotNull() { regSprqahl(CK_ISNN, DOBJ); }

    protected void regSprqahl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqahl(), "SPRQAHL"); }
    protected abstract ConditionValue xgetCValueSprqahl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     * @param sprqahlbgbox The value of sprqahlbgbox as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_Equal(String sprqahlbgbox) {
        doSetSprqahlbgbox_Equal(fRES(sprqahlbgbox));
    }

    protected void doSetSprqahlbgbox_Equal(String sprqahlbgbox) {
        regSprqahlbgbox(CK_EQ, sprqahlbgbox);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     * @param sprqahlbgbox The value of sprqahlbgbox as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_NotEqual(String sprqahlbgbox) {
        doSetSprqahlbgbox_NotEqual(fRES(sprqahlbgbox));
    }

    protected void doSetSprqahlbgbox_NotEqual(String sprqahlbgbox) {
        regSprqahlbgbox(CK_NES, sprqahlbgbox);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     * @param sprqahlbgbox The value of sprqahlbgbox as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_GreaterThan(String sprqahlbgbox) {
        regSprqahlbgbox(CK_GT, fRES(sprqahlbgbox));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     * @param sprqahlbgbox The value of sprqahlbgbox as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_LessThan(String sprqahlbgbox) {
        regSprqahlbgbox(CK_LT, fRES(sprqahlbgbox));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     * @param sprqahlbgbox The value of sprqahlbgbox as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_GreaterEqual(String sprqahlbgbox) {
        regSprqahlbgbox(CK_GE, fRES(sprqahlbgbox));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     * @param sprqahlbgbox The value of sprqahlbgbox as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_LessEqual(String sprqahlbgbox) {
        regSprqahlbgbox(CK_LE, fRES(sprqahlbgbox));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     * @param sprqahlbgboxList The collection of sprqahlbgbox as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_InScope(Collection<String> sprqahlbgboxList) {
        doSetSprqahlbgbox_InScope(sprqahlbgboxList);
    }

    protected void doSetSprqahlbgbox_InScope(Collection<String> sprqahlbgboxList) {
        regINS(CK_INS, cTL(sprqahlbgboxList), xgetCValueSprqahlbgbox(), "SPRQAHLBGBOX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     * @param sprqahlbgboxList The collection of sprqahlbgbox as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_NotInScope(Collection<String> sprqahlbgboxList) {
        doSetSprqahlbgbox_NotInScope(sprqahlbgboxList);
    }

    protected void doSetSprqahlbgbox_NotInScope(Collection<String> sprqahlbgboxList) {
        regINS(CK_NINS, cTL(sprqahlbgboxList), xgetCValueSprqahlbgbox(), "SPRQAHLBGBOX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAHLBGBOX: {varchar(255)} <br>
     * <pre>e.g. setSprqahlbgbox_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sprqahlbgbox The value of sprqahlbgbox as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSprqahlbgbox_LikeSearch(String sprqahlbgbox, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sprqahlbgbox), xgetCValueSprqahlbgbox(), "SPRQAHLBGBOX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     * @param sprqahlbgbox The value of sprqahlbgbox as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSprqahlbgbox_NotLikeSearch(String sprqahlbgbox, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sprqahlbgbox), xgetCValueSprqahlbgbox(), "SPRQAHLBGBOX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     * @param sprqahlbgbox The value of sprqahlbgbox as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahlbgbox_PrefixSearch(String sprqahlbgbox) {
        setSprqahlbgbox_LikeSearch(sprqahlbgbox, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     */
    public void setSprqahlbgbox_IsNull() { regSprqahlbgbox(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     */
    public void setSprqahlbgbox_IsNullOrEmpty() { regSprqahlbgbox(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQAHLBGBOX: {varchar(255)}
     */
    public void setSprqahlbgbox_IsNotNull() { regSprqahlbgbox(CK_ISNN, DOBJ); }

    protected void regSprqahlbgbox(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqahlbgbox(), "SPRQAHLBGBOX"); }
    protected abstract ConditionValue xgetCValueSprqahlbgbox();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {varchar(255)}
     * @param sprqahl12box The value of sprqahl12box as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl12box_Equal(String sprqahl12box) {
        doSetSprqahl12box_Equal(fRES(sprqahl12box));
    }

    protected void doSetSprqahl12box_Equal(String sprqahl12box) {
        regSprqahl12box(CK_EQ, sprqahl12box);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {varchar(255)}
     * @param sprqahl12box The value of sprqahl12box as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl12box_NotEqual(String sprqahl12box) {
        doSetSprqahl12box_NotEqual(fRES(sprqahl12box));
    }

    protected void doSetSprqahl12box_NotEqual(String sprqahl12box) {
        regSprqahl12box(CK_NES, sprqahl12box);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {varchar(255)}
     * @param sprqahl12box The value of sprqahl12box as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl12box_GreaterThan(String sprqahl12box) {
        regSprqahl12box(CK_GT, fRES(sprqahl12box));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {varchar(255)}
     * @param sprqahl12box The value of sprqahl12box as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl12box_LessThan(String sprqahl12box) {
        regSprqahl12box(CK_LT, fRES(sprqahl12box));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {varchar(255)}
     * @param sprqahl12box The value of sprqahl12box as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl12box_GreaterEqual(String sprqahl12box) {
        regSprqahl12box(CK_GE, fRES(sprqahl12box));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {varchar(255)}
     * @param sprqahl12box The value of sprqahl12box as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl12box_LessEqual(String sprqahl12box) {
        regSprqahl12box(CK_LE, fRES(sprqahl12box));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQAHL12BOX: {varchar(255)}
     * @param sprqahl12boxList The collection of sprqahl12box as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl12box_InScope(Collection<String> sprqahl12boxList) {
        doSetSprqahl12box_InScope(sprqahl12boxList);
    }

    protected void doSetSprqahl12box_InScope(Collection<String> sprqahl12boxList) {
        regINS(CK_INS, cTL(sprqahl12boxList), xgetCValueSprqahl12box(), "SPRQAHL12BOX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQAHL12BOX: {varchar(255)}
     * @param sprqahl12boxList The collection of sprqahl12box as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl12box_NotInScope(Collection<String> sprqahl12boxList) {
        doSetSprqahl12box_NotInScope(sprqahl12boxList);
    }

    protected void doSetSprqahl12box_NotInScope(Collection<String> sprqahl12boxList) {
        regINS(CK_NINS, cTL(sprqahl12boxList), xgetCValueSprqahl12box(), "SPRQAHL12BOX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAHL12BOX: {varchar(255)} <br>
     * <pre>e.g. setSprqahl12box_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sprqahl12box The value of sprqahl12box as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSprqahl12box_LikeSearch(String sprqahl12box, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sprqahl12box), xgetCValueSprqahl12box(), "SPRQAHL12BOX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAHL12BOX: {varchar(255)}
     * @param sprqahl12box The value of sprqahl12box as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSprqahl12box_NotLikeSearch(String sprqahl12box, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sprqahl12box), xgetCValueSprqahl12box(), "SPRQAHL12BOX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAHL12BOX: {varchar(255)}
     * @param sprqahl12box The value of sprqahl12box as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl12box_PrefixSearch(String sprqahl12box) {
        setSprqahl12box_LikeSearch(sprqahl12box, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {varchar(255)}
     */
    public void setSprqahl12box_IsNull() { regSprqahl12box(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {varchar(255)}
     */
    public void setSprqahl12box_IsNullOrEmpty() { regSprqahl12box(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQAHL12BOX: {varchar(255)}
     */
    public void setSprqahl12box_IsNotNull() { regSprqahl12box(CK_ISNN, DOBJ); }

    protected void regSprqahl12box(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqahl12box(), "SPRQAHL12BOX"); }
    protected abstract ConditionValue xgetCValueSprqahl12box();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {varchar(255)}
     * @param sprqahl5box The value of sprqahl5box as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl5box_Equal(String sprqahl5box) {
        doSetSprqahl5box_Equal(fRES(sprqahl5box));
    }

    protected void doSetSprqahl5box_Equal(String sprqahl5box) {
        regSprqahl5box(CK_EQ, sprqahl5box);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {varchar(255)}
     * @param sprqahl5box The value of sprqahl5box as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl5box_NotEqual(String sprqahl5box) {
        doSetSprqahl5box_NotEqual(fRES(sprqahl5box));
    }

    protected void doSetSprqahl5box_NotEqual(String sprqahl5box) {
        regSprqahl5box(CK_NES, sprqahl5box);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {varchar(255)}
     * @param sprqahl5box The value of sprqahl5box as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl5box_GreaterThan(String sprqahl5box) {
        regSprqahl5box(CK_GT, fRES(sprqahl5box));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {varchar(255)}
     * @param sprqahl5box The value of sprqahl5box as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl5box_LessThan(String sprqahl5box) {
        regSprqahl5box(CK_LT, fRES(sprqahl5box));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {varchar(255)}
     * @param sprqahl5box The value of sprqahl5box as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl5box_GreaterEqual(String sprqahl5box) {
        regSprqahl5box(CK_GE, fRES(sprqahl5box));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {varchar(255)}
     * @param sprqahl5box The value of sprqahl5box as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl5box_LessEqual(String sprqahl5box) {
        regSprqahl5box(CK_LE, fRES(sprqahl5box));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQAHL5BOX: {varchar(255)}
     * @param sprqahl5boxList The collection of sprqahl5box as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl5box_InScope(Collection<String> sprqahl5boxList) {
        doSetSprqahl5box_InScope(sprqahl5boxList);
    }

    protected void doSetSprqahl5box_InScope(Collection<String> sprqahl5boxList) {
        regINS(CK_INS, cTL(sprqahl5boxList), xgetCValueSprqahl5box(), "SPRQAHL5BOX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQAHL5BOX: {varchar(255)}
     * @param sprqahl5boxList The collection of sprqahl5box as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl5box_NotInScope(Collection<String> sprqahl5boxList) {
        doSetSprqahl5box_NotInScope(sprqahl5boxList);
    }

    protected void doSetSprqahl5box_NotInScope(Collection<String> sprqahl5boxList) {
        regINS(CK_NINS, cTL(sprqahl5boxList), xgetCValueSprqahl5box(), "SPRQAHL5BOX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAHL5BOX: {varchar(255)} <br>
     * <pre>e.g. setSprqahl5box_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sprqahl5box The value of sprqahl5box as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSprqahl5box_LikeSearch(String sprqahl5box, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sprqahl5box), xgetCValueSprqahl5box(), "SPRQAHL5BOX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAHL5BOX: {varchar(255)}
     * @param sprqahl5box The value of sprqahl5box as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSprqahl5box_NotLikeSearch(String sprqahl5box, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sprqahl5box), xgetCValueSprqahl5box(), "SPRQAHL5BOX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAHL5BOX: {varchar(255)}
     * @param sprqahl5box The value of sprqahl5box as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqahl5box_PrefixSearch(String sprqahl5box) {
        setSprqahl5box_LikeSearch(sprqahl5box, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {varchar(255)}
     */
    public void setSprqahl5box_IsNull() { regSprqahl5box(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {varchar(255)}
     */
    public void setSprqahl5box_IsNullOrEmpty() { regSprqahl5box(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQAHL5BOX: {varchar(255)}
     */
    public void setSprqahl5box_IsNotNull() { regSprqahl5box(CK_ISNN, DOBJ); }

    protected void regSprqahl5box(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqahl5box(), "SPRQAHL5BOX"); }
    protected abstract ConditionValue xgetCValueSprqahl5box();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAFUL: {varchar(255)}
     * @param sprqaful The value of sprqaful as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqaful_Equal(String sprqaful) {
        doSetSprqaful_Equal(fRES(sprqaful));
    }

    protected void doSetSprqaful_Equal(String sprqaful) {
        regSprqaful(CK_EQ, sprqaful);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAFUL: {varchar(255)}
     * @param sprqaful The value of sprqaful as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqaful_NotEqual(String sprqaful) {
        doSetSprqaful_NotEqual(fRES(sprqaful));
    }

    protected void doSetSprqaful_NotEqual(String sprqaful) {
        regSprqaful(CK_NES, sprqaful);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAFUL: {varchar(255)}
     * @param sprqaful The value of sprqaful as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqaful_GreaterThan(String sprqaful) {
        regSprqaful(CK_GT, fRES(sprqaful));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAFUL: {varchar(255)}
     * @param sprqaful The value of sprqaful as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqaful_LessThan(String sprqaful) {
        regSprqaful(CK_LT, fRES(sprqaful));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAFUL: {varchar(255)}
     * @param sprqaful The value of sprqaful as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqaful_GreaterEqual(String sprqaful) {
        regSprqaful(CK_GE, fRES(sprqaful));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRQAFUL: {varchar(255)}
     * @param sprqaful The value of sprqaful as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqaful_LessEqual(String sprqaful) {
        regSprqaful(CK_LE, fRES(sprqaful));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQAFUL: {varchar(255)}
     * @param sprqafulList The collection of sprqaful as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqaful_InScope(Collection<String> sprqafulList) {
        doSetSprqaful_InScope(sprqafulList);
    }

    protected void doSetSprqaful_InScope(Collection<String> sprqafulList) {
        regINS(CK_INS, cTL(sprqafulList), xgetCValueSprqaful(), "SPRQAFUL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRQAFUL: {varchar(255)}
     * @param sprqafulList The collection of sprqaful as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqaful_NotInScope(Collection<String> sprqafulList) {
        doSetSprqaful_NotInScope(sprqafulList);
    }

    protected void doSetSprqaful_NotInScope(Collection<String> sprqafulList) {
        regINS(CK_NINS, cTL(sprqafulList), xgetCValueSprqaful(), "SPRQAFUL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAFUL: {varchar(255)} <br>
     * <pre>e.g. setSprqaful_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sprqaful The value of sprqaful as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSprqaful_LikeSearch(String sprqaful, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sprqaful), xgetCValueSprqaful(), "SPRQAFUL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAFUL: {varchar(255)}
     * @param sprqaful The value of sprqaful as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSprqaful_NotLikeSearch(String sprqaful, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sprqaful), xgetCValueSprqaful(), "SPRQAFUL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRQAFUL: {varchar(255)}
     * @param sprqaful The value of sprqaful as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprqaful_PrefixSearch(String sprqaful) {
        setSprqaful_LikeSearch(sprqaful, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRQAFUL: {varchar(255)}
     */
    public void setSprqaful_IsNull() { regSprqaful(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPRQAFUL: {varchar(255)}
     */
    public void setSprqaful_IsNullOrEmpty() { regSprqaful(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRQAFUL: {varchar(255)}
     */
    public void setSprqaful_IsNotNull() { regSprqaful(CK_ISNN, DOBJ); }

    protected void regSprqaful(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprqaful(), "SPRQAFUL"); }
    protected abstract ConditionValue xgetCValueSprqaful();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncd The value of zzorgncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_Equal(String zzorgncd) {
        doSetZzorgncd_Equal(fRES(zzorgncd));
    }

    protected void doSetZzorgncd_Equal(String zzorgncd) {
        regZzorgncd(CK_EQ, zzorgncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncd The value of zzorgncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_NotEqual(String zzorgncd) {
        doSetZzorgncd_NotEqual(fRES(zzorgncd));
    }

    protected void doSetZzorgncd_NotEqual(String zzorgncd) {
        regZzorgncd(CK_NES, zzorgncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncd The value of zzorgncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_GreaterThan(String zzorgncd) {
        regZzorgncd(CK_GT, fRES(zzorgncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncd The value of zzorgncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_LessThan(String zzorgncd) {
        regZzorgncd(CK_LT, fRES(zzorgncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncd The value of zzorgncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_GreaterEqual(String zzorgncd) {
        regZzorgncd(CK_GE, fRES(zzorgncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncd The value of zzorgncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_LessEqual(String zzorgncd) {
        regZzorgncd(CK_LE, fRES(zzorgncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncdList The collection of zzorgncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_InScope(Collection<String> zzorgncdList) {
        doSetZzorgncd_InScope(zzorgncdList);
    }

    protected void doSetZzorgncd_InScope(Collection<String> zzorgncdList) {
        regINS(CK_INS, cTL(zzorgncdList), xgetCValueZzorgncd(), "ZZORGNCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncdList The collection of zzorgncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_NotInScope(Collection<String> zzorgncdList) {
        doSetZzorgncd_NotInScope(zzorgncdList);
    }

    protected void doSetZzorgncd_NotInScope(Collection<String> zzorgncdList) {
        regINS(CK_NINS, cTL(zzorgncdList), xgetCValueZzorgncd(), "ZZORGNCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {varchar(30)} <br>
     * <pre>e.g. setZzorgncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzorgncd The value of zzorgncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzorgncd_LikeSearch(String zzorgncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzorgncd), xgetCValueZzorgncd(), "ZZORGNCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncd The value of zzorgncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzorgncd_NotLikeSearch(String zzorgncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzorgncd), xgetCValueZzorgncd(), "ZZORGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     * @param zzorgncd The value of zzorgncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_PrefixSearch(String zzorgncd) {
        setZzorgncd_LikeSearch(zzorgncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     */
    public void setZzorgncd_IsNull() { regZzorgncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     */
    public void setZzorgncd_IsNullOrEmpty() { regZzorgncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZZORGNCD: {varchar(30)}
     */
    public void setZzorgncd_IsNotNull() { regZzorgncd(CK_ISNN, DOBJ); }

    protected void regZzorgncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzorgncd(), "ZZORGNCD"); }
    protected abstract ConditionValue xgetCValueZzorgncd();

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
    public HpSLCFunction<ECsrstinfSendCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ECsrstinfSendCB.class);
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
    public HpSLCFunction<ECsrstinfSendCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ECsrstinfSendCB.class);
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
    public HpSLCFunction<ECsrstinfSendCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ECsrstinfSendCB.class);
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
    public HpSLCFunction<ECsrstinfSendCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ECsrstinfSendCB.class);
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
    public HpSLCFunction<ECsrstinfSendCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ECsrstinfSendCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ECsrstinfSendCB&gt;() {
     *     public void query(ECsrstinfSendCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ECsrstinfSendCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ECsrstinfSendCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ECsrstinfSendCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ECsrstinfSendCQ sq);

    protected ECsrstinfSendCB xcreateScalarConditionCB() {
        ECsrstinfSendCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ECsrstinfSendCB xcreateScalarConditionPartitionByCB() {
        ECsrstinfSendCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ECsrstinfSendCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ECsrstinfSendCB cb = new ECsrstinfSendCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CSRSTINF_SEND_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ECsrstinfSendCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ECsrstinfSendCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ECsrstinfSendCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ECsrstinfSendCB cb = new ECsrstinfSendCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CSRSTINF_SEND_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ECsrstinfSendCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ECsrstinfSendCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ECsrstinfSendCB cb = new ECsrstinfSendCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ECsrstinfSendCQ sq);

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
    protected ECsrstinfSendCB newMyCB() {
        return new ECsrstinfSendCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ECsrstinfSendCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

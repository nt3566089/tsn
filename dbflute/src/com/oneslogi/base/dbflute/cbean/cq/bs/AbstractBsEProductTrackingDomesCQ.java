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
 * The abstract condition-query of E_PRODUCT_TRACKING_DOMES.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEProductTrackingDomesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEProductTrackingDomesCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_PRODUCT_TRACKING_DOMES";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productTrackingDomesId The value of productTrackingDomesId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductTrackingDomesId_Equal(Long productTrackingDomesId) {
        doSetProductTrackingDomesId_Equal(productTrackingDomesId);
    }

    protected void doSetProductTrackingDomesId_Equal(Long productTrackingDomesId) {
        regProductTrackingDomesId(CK_EQ, productTrackingDomesId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productTrackingDomesId The value of productTrackingDomesId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductTrackingDomesId_NotEqual(Long productTrackingDomesId) {
        doSetProductTrackingDomesId_NotEqual(productTrackingDomesId);
    }

    protected void doSetProductTrackingDomesId_NotEqual(Long productTrackingDomesId) {
        regProductTrackingDomesId(CK_NES, productTrackingDomesId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productTrackingDomesId The value of productTrackingDomesId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductTrackingDomesId_GreaterThan(Long productTrackingDomesId) {
        regProductTrackingDomesId(CK_GT, productTrackingDomesId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productTrackingDomesId The value of productTrackingDomesId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductTrackingDomesId_LessThan(Long productTrackingDomesId) {
        regProductTrackingDomesId(CK_LT, productTrackingDomesId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productTrackingDomesId The value of productTrackingDomesId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductTrackingDomesId_GreaterEqual(Long productTrackingDomesId) {
        regProductTrackingDomesId(CK_GE, productTrackingDomesId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productTrackingDomesId The value of productTrackingDomesId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductTrackingDomesId_LessEqual(Long productTrackingDomesId) {
        regProductTrackingDomesId(CK_LE, productTrackingDomesId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of productTrackingDomesId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productTrackingDomesId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductTrackingDomesId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductTrackingDomesId(), "PRODUCT_TRACKING_DOMES_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productTrackingDomesIdList The collection of productTrackingDomesId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductTrackingDomesId_InScope(Collection<Long> productTrackingDomesIdList) {
        doSetProductTrackingDomesId_InScope(productTrackingDomesIdList);
    }

    protected void doSetProductTrackingDomesId_InScope(Collection<Long> productTrackingDomesIdList) {
        regINS(CK_INS, cTL(productTrackingDomesIdList), xgetCValueProductTrackingDomesId(), "PRODUCT_TRACKING_DOMES_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productTrackingDomesIdList The collection of productTrackingDomesId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductTrackingDomesId_NotInScope(Collection<Long> productTrackingDomesIdList) {
        doSetProductTrackingDomesId_NotInScope(productTrackingDomesIdList);
    }

    protected void doSetProductTrackingDomesId_NotInScope(Collection<Long> productTrackingDomesIdList) {
        regINS(CK_NINS, cTL(productTrackingDomesIdList), xgetCValueProductTrackingDomesId(), "PRODUCT_TRACKING_DOMES_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setProductTrackingDomesId_IsNull() { regProductTrackingDomesId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_TRACKING_DOMES_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setProductTrackingDomesId_IsNotNull() { regProductTrackingDomesId(CK_ISNN, DOBJ); }

    protected void regProductTrackingDomesId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductTrackingDomesId(), "PRODUCT_TRACKING_DOMES_ID"); }
    protected abstract ConditionValue xgetCValueProductTrackingDomesId();

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
     * USERNUM1: {varchar(30)}
     * @param usernum1 The value of usernum1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_Equal(String usernum1) {
        doSetUsernum1_Equal(fRES(usernum1));
    }

    protected void doSetUsernum1_Equal(String usernum1) {
        regUsernum1(CK_EQ, usernum1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30)}
     * @param usernum1 The value of usernum1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_NotEqual(String usernum1) {
        doSetUsernum1_NotEqual(fRES(usernum1));
    }

    protected void doSetUsernum1_NotEqual(String usernum1) {
        regUsernum1(CK_NES, usernum1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30)}
     * @param usernum1 The value of usernum1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_GreaterThan(String usernum1) {
        regUsernum1(CK_GT, fRES(usernum1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30)}
     * @param usernum1 The value of usernum1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_LessThan(String usernum1) {
        regUsernum1(CK_LT, fRES(usernum1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30)}
     * @param usernum1 The value of usernum1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_GreaterEqual(String usernum1) {
        regUsernum1(CK_GE, fRES(usernum1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30)}
     * @param usernum1 The value of usernum1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_LessEqual(String usernum1) {
        regUsernum1(CK_LE, fRES(usernum1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM1: {varchar(30)}
     * @param usernum1List The collection of usernum1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_InScope(Collection<String> usernum1List) {
        doSetUsernum1_InScope(usernum1List);
    }

    protected void doSetUsernum1_InScope(Collection<String> usernum1List) {
        regINS(CK_INS, cTL(usernum1List), xgetCValueUsernum1(), "USERNUM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM1: {varchar(30)}
     * @param usernum1List The collection of usernum1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_NotInScope(Collection<String> usernum1List) {
        doSetUsernum1_NotInScope(usernum1List);
    }

    protected void doSetUsernum1_NotInScope(Collection<String> usernum1List) {
        regINS(CK_NINS, cTL(usernum1List), xgetCValueUsernum1(), "USERNUM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM1: {varchar(30)} <br>
     * <pre>e.g. setUsernum1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param usernum1 The value of usernum1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUsernum1_LikeSearch(String usernum1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(usernum1), xgetCValueUsernum1(), "USERNUM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM1: {varchar(30)}
     * @param usernum1 The value of usernum1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUsernum1_NotLikeSearch(String usernum1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(usernum1), xgetCValueUsernum1(), "USERNUM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM1: {varchar(30)}
     * @param usernum1 The value of usernum1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_PrefixSearch(String usernum1) {
        setUsernum1_LikeSearch(usernum1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30)}
     */
    public void setUsernum1_IsNull() { regUsernum1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30)}
     */
    public void setUsernum1_IsNullOrEmpty() { regUsernum1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30)}
     */
    public void setUsernum1_IsNotNull() { regUsernum1(CK_ISNN, DOBJ); }

    protected void regUsernum1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum1(), "USERNUM1"); }
    protected abstract ConditionValue xgetCValueUsernum1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {varchar(30)}
     * @param itemAdmin The value of itemAdmin as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_Equal(String itemAdmin) {
        doSetItemAdmin_Equal(fRES(itemAdmin));
    }

    protected void doSetItemAdmin_Equal(String itemAdmin) {
        regItemAdmin(CK_EQ, itemAdmin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {varchar(30)}
     * @param itemAdmin The value of itemAdmin as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_NotEqual(String itemAdmin) {
        doSetItemAdmin_NotEqual(fRES(itemAdmin));
    }

    protected void doSetItemAdmin_NotEqual(String itemAdmin) {
        regItemAdmin(CK_NES, itemAdmin);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {varchar(30)}
     * @param itemAdmin The value of itemAdmin as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_GreaterThan(String itemAdmin) {
        regItemAdmin(CK_GT, fRES(itemAdmin));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {varchar(30)}
     * @param itemAdmin The value of itemAdmin as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_LessThan(String itemAdmin) {
        regItemAdmin(CK_LT, fRES(itemAdmin));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {varchar(30)}
     * @param itemAdmin The value of itemAdmin as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_GreaterEqual(String itemAdmin) {
        regItemAdmin(CK_GE, fRES(itemAdmin));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {varchar(30)}
     * @param itemAdmin The value of itemAdmin as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_LessEqual(String itemAdmin) {
        regItemAdmin(CK_LE, fRES(itemAdmin));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_ADMIN: {varchar(30)}
     * @param itemAdminList The collection of itemAdmin as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_InScope(Collection<String> itemAdminList) {
        doSetItemAdmin_InScope(itemAdminList);
    }

    protected void doSetItemAdmin_InScope(Collection<String> itemAdminList) {
        regINS(CK_INS, cTL(itemAdminList), xgetCValueItemAdmin(), "ITEM_ADMIN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_ADMIN: {varchar(30)}
     * @param itemAdminList The collection of itemAdmin as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_NotInScope(Collection<String> itemAdminList) {
        doSetItemAdmin_NotInScope(itemAdminList);
    }

    protected void doSetItemAdmin_NotInScope(Collection<String> itemAdminList) {
        regINS(CK_NINS, cTL(itemAdminList), xgetCValueItemAdmin(), "ITEM_ADMIN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_ADMIN: {varchar(30)} <br>
     * <pre>e.g. setItemAdmin_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemAdmin The value of itemAdmin as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemAdmin_LikeSearch(String itemAdmin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemAdmin), xgetCValueItemAdmin(), "ITEM_ADMIN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_ADMIN: {varchar(30)}
     * @param itemAdmin The value of itemAdmin as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemAdmin_NotLikeSearch(String itemAdmin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemAdmin), xgetCValueItemAdmin(), "ITEM_ADMIN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_ADMIN: {varchar(30)}
     * @param itemAdmin The value of itemAdmin as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemAdmin_PrefixSearch(String itemAdmin) {
        setItemAdmin_LikeSearch(itemAdmin, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {varchar(30)}
     */
    public void setItemAdmin_IsNull() { regItemAdmin(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {varchar(30)}
     */
    public void setItemAdmin_IsNullOrEmpty() { regItemAdmin(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_ADMIN: {varchar(30)}
     */
    public void setItemAdmin_IsNotNull() { regItemAdmin(CK_ISNN, DOBJ); }

    protected void regItemAdmin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemAdmin(), "ITEM_ADMIN"); }
    protected abstract ConditionValue xgetCValueItemAdmin();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_Equal(String tracekey) {
        doSetTracekey_Equal(fRES(tracekey));
    }

    protected void doSetTracekey_Equal(String tracekey) {
        regTracekey(CK_EQ, tracekey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_NotEqual(String tracekey) {
        doSetTracekey_NotEqual(fRES(tracekey));
    }

    protected void doSetTracekey_NotEqual(String tracekey) {
        regTracekey(CK_NES, tracekey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_GreaterThan(String tracekey) {
        regTracekey(CK_GT, fRES(tracekey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_LessThan(String tracekey) {
        regTracekey(CK_LT, fRES(tracekey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_GreaterEqual(String tracekey) {
        regTracekey(CK_GE, fRES(tracekey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_LessEqual(String tracekey) {
        regTracekey(CK_LE, fRES(tracekey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekeyList The collection of tracekey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_InScope(Collection<String> tracekeyList) {
        doSetTracekey_InScope(tracekeyList);
    }

    protected void doSetTracekey_InScope(Collection<String> tracekeyList) {
        regINS(CK_INS, cTL(tracekeyList), xgetCValueTracekey(), "TRACEKEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekeyList The collection of tracekey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_NotInScope(Collection<String> tracekeyList) {
        doSetTracekey_NotInScope(tracekeyList);
    }

    protected void doSetTracekey_NotInScope(Collection<String> tracekeyList) {
        regINS(CK_NINS, cTL(tracekeyList), xgetCValueTracekey(), "TRACEKEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACEKEY: {varchar(255)} <br>
     * <pre>e.g. setTracekey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tracekey The value of tracekey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTracekey_LikeSearch(String tracekey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tracekey), xgetCValueTracekey(), "TRACEKEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTracekey_NotLikeSearch(String tracekey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tracekey), xgetCValueTracekey(), "TRACEKEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_PrefixSearch(String tracekey) {
        setTracekey_LikeSearch(tracekey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     */
    public void setTracekey_IsNull() { regTracekey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     */
    public void setTracekey_IsNullOrEmpty() { regTracekey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     */
    public void setTracekey_IsNotNull() { regTracekey(CK_ISNN, DOBJ); }

    protected void regTracekey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTracekey(), "TRACEKEY"); }
    protected abstract ConditionValue xgetCValueTracekey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_Equal(String warehousecd) {
        doSetWarehousecd_Equal(fRES(warehousecd));
    }

    protected void doSetWarehousecd_Equal(String warehousecd) {
        regWarehousecd(CK_EQ, warehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotEqual(String warehousecd) {
        doSetWarehousecd_NotEqual(fRES(warehousecd));
    }

    protected void doSetWarehousecd_NotEqual(String warehousecd) {
        regWarehousecd(CK_NES, warehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecdList The collection of warehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_InScope(Collection<String> warehousecdList) {
        doSetWarehousecd_InScope(warehousecdList);
    }

    protected void doSetWarehousecd_InScope(Collection<String> warehousecdList) {
        regINS(CK_INS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecdList The collection of warehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotInScope(Collection<String> warehousecdList) {
        doSetWarehousecd_NotInScope(warehousecdList);
    }

    protected void doSetWarehousecd_NotInScope(Collection<String> warehousecdList) {
        regINS(CK_NINS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(255)} <br>
     * <pre>e.g. setWarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousecd The value of warehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousecd_LikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     */
    public void setWarehousecd_IsNull() { regWarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     */
    public void setWarehousecd_IsNullOrEmpty() { regWarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     */
    public void setWarehousecd_IsNotNull() { regWarehousecd(CK_ISNN, DOBJ); }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_Equal(String factorycd) {
        doSetFactorycd_Equal(fRES(factorycd));
    }

    protected void doSetFactorycd_Equal(String factorycd) {
        regFactorycd(CK_EQ, factorycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_NotEqual(String factorycd) {
        doSetFactorycd_NotEqual(fRES(factorycd));
    }

    protected void doSetFactorycd_NotEqual(String factorycd) {
        regFactorycd(CK_NES, factorycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_GreaterThan(String factorycd) {
        regFactorycd(CK_GT, fRES(factorycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_LessThan(String factorycd) {
        regFactorycd(CK_LT, fRES(factorycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_GreaterEqual(String factorycd) {
        regFactorycd(CK_GE, fRES(factorycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_LessEqual(String factorycd) {
        regFactorycd(CK_LE, fRES(factorycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycdList The collection of factorycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_InScope(Collection<String> factorycdList) {
        doSetFactorycd_InScope(factorycdList);
    }

    protected void doSetFactorycd_InScope(Collection<String> factorycdList) {
        regINS(CK_INS, cTL(factorycdList), xgetCValueFactorycd(), "FACTORYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycdList The collection of factorycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_NotInScope(Collection<String> factorycdList) {
        doSetFactorycd_NotInScope(factorycdList);
    }

    protected void doSetFactorycd_NotInScope(Collection<String> factorycdList) {
        regINS(CK_NINS, cTL(factorycdList), xgetCValueFactorycd(), "FACTORYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)} <br>
     * <pre>e.g. setFactorycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param factorycd The value of factorycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFactorycd_LikeSearch(String factorycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(factorycd), xgetCValueFactorycd(), "FACTORYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFactorycd_NotLikeSearch(String factorycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(factorycd), xgetCValueFactorycd(), "FACTORYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_PrefixSearch(String factorycd) {
        setFactorycd_LikeSearch(factorycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     */
    public void setFactorycd_IsNull() { regFactorycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     */
    public void setFactorycd_IsNullOrEmpty() { regFactorycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     */
    public void setFactorycd_IsNotNull() { regFactorycd(CK_ISNN, DOBJ); }

    protected void regFactorycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFactorycd(), "FACTORYCD"); }
    protected abstract ConditionValue xgetCValueFactorycd();

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
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_Equal(String skucd) {
        doSetSkucd_Equal(fRES(skucd));
    }

    protected void doSetSkucd_Equal(String skucd) {
        regSkucd(CK_EQ, skucd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_NotEqual(String skucd) {
        doSetSkucd_NotEqual(fRES(skucd));
    }

    protected void doSetSkucd_NotEqual(String skucd) {
        regSkucd(CK_NES, skucd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_GreaterThan(String skucd) {
        regSkucd(CK_GT, fRES(skucd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_LessThan(String skucd) {
        regSkucd(CK_LT, fRES(skucd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_GreaterEqual(String skucd) {
        regSkucd(CK_GE, fRES(skucd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_LessEqual(String skucd) {
        regSkucd(CK_LE, fRES(skucd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucdList The collection of skucd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_InScope(Collection<String> skucdList) {
        doSetSkucd_InScope(skucdList);
    }

    protected void doSetSkucd_InScope(Collection<String> skucdList) {
        regINS(CK_INS, cTL(skucdList), xgetCValueSkucd(), "SKUCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucdList The collection of skucd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_NotInScope(Collection<String> skucdList) {
        doSetSkucd_NotInScope(skucdList);
    }

    protected void doSetSkucd_NotInScope(Collection<String> skucdList) {
        regINS(CK_NINS, cTL(skucdList), xgetCValueSkucd(), "SKUCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)} <br>
     * <pre>e.g. setSkucd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param skucd The value of skucd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSkucd_LikeSearch(String skucd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(skucd), xgetCValueSkucd(), "SKUCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSkucd_NotLikeSearch(String skucd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(skucd), xgetCValueSkucd(), "SKUCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_PrefixSearch(String skucd) {
        setSkucd_LikeSearch(skucd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     */
    public void setSkucd_IsNull() { regSkucd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     */
    public void setSkucd_IsNullOrEmpty() { regSkucd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     */
    public void setSkucd_IsNotNull() { regSkucd(CK_ISNN, DOBJ); }

    protected void regSkucd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSkucd(), "SKUCD"); }
    protected abstract ConditionValue xgetCValueSkucd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_Equal(String destinationcd) {
        doSetDestinationcd_Equal(fRES(destinationcd));
    }

    protected void doSetDestinationcd_Equal(String destinationcd) {
        regDestinationcd(CK_EQ, destinationcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_NotEqual(String destinationcd) {
        doSetDestinationcd_NotEqual(fRES(destinationcd));
    }

    protected void doSetDestinationcd_NotEqual(String destinationcd) {
        regDestinationcd(CK_NES, destinationcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_GreaterThan(String destinationcd) {
        regDestinationcd(CK_GT, fRES(destinationcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_LessThan(String destinationcd) {
        regDestinationcd(CK_LT, fRES(destinationcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_GreaterEqual(String destinationcd) {
        regDestinationcd(CK_GE, fRES(destinationcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_LessEqual(String destinationcd) {
        regDestinationcd(CK_LE, fRES(destinationcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcdList The collection of destinationcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_InScope(Collection<String> destinationcdList) {
        doSetDestinationcd_InScope(destinationcdList);
    }

    protected void doSetDestinationcd_InScope(Collection<String> destinationcdList) {
        regINS(CK_INS, cTL(destinationcdList), xgetCValueDestinationcd(), "DESTINATIONCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcdList The collection of destinationcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_NotInScope(Collection<String> destinationcdList) {
        doSetDestinationcd_NotInScope(destinationcdList);
    }

    protected void doSetDestinationcd_NotInScope(Collection<String> destinationcdList) {
        regINS(CK_NINS, cTL(destinationcdList), xgetCValueDestinationcd(), "DESTINATIONCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(255)} <br>
     * <pre>e.g. setDestinationcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationcd The value of destinationcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationcd_LikeSearch(String destinationcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationcd), xgetCValueDestinationcd(), "DESTINATIONCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationcd_NotLikeSearch(String destinationcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationcd), xgetCValueDestinationcd(), "DESTINATIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     * @param destinationcd The value of destinationcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_PrefixSearch(String destinationcd) {
        setDestinationcd_LikeSearch(destinationcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     */
    public void setDestinationcd_IsNull() { regDestinationcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     */
    public void setDestinationcd_IsNullOrEmpty() { regDestinationcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(255)}
     */
    public void setDestinationcd_IsNotNull() { regDestinationcd(CK_ISNN, DOBJ); }

    protected void regDestinationcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationcd(), "DESTINATIONCD"); }
    protected abstract ConditionValue xgetCValueDestinationcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_Equal(String manufacturecd) {
        doSetManufacturecd_Equal(fRES(manufacturecd));
    }

    protected void doSetManufacturecd_Equal(String manufacturecd) {
        regManufacturecd(CK_EQ, manufacturecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_NotEqual(String manufacturecd) {
        doSetManufacturecd_NotEqual(fRES(manufacturecd));
    }

    protected void doSetManufacturecd_NotEqual(String manufacturecd) {
        regManufacturecd(CK_NES, manufacturecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_GreaterThan(String manufacturecd) {
        regManufacturecd(CK_GT, fRES(manufacturecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_LessThan(String manufacturecd) {
        regManufacturecd(CK_LT, fRES(manufacturecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_GreaterEqual(String manufacturecd) {
        regManufacturecd(CK_GE, fRES(manufacturecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_LessEqual(String manufacturecd) {
        regManufacturecd(CK_LE, fRES(manufacturecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecdList The collection of manufacturecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_InScope(Collection<String> manufacturecdList) {
        doSetManufacturecd_InScope(manufacturecdList);
    }

    protected void doSetManufacturecd_InScope(Collection<String> manufacturecdList) {
        regINS(CK_INS, cTL(manufacturecdList), xgetCValueManufacturecd(), "MANUFACTURECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecdList The collection of manufacturecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_NotInScope(Collection<String> manufacturecdList) {
        doSetManufacturecd_NotInScope(manufacturecdList);
    }

    protected void doSetManufacturecd_NotInScope(Collection<String> manufacturecdList) {
        regINS(CK_NINS, cTL(manufacturecdList), xgetCValueManufacturecd(), "MANUFACTURECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(255)} <br>
     * <pre>e.g. setManufacturecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufacturecd The value of manufacturecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufacturecd_LikeSearch(String manufacturecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufacturecd), xgetCValueManufacturecd(), "MANUFACTURECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufacturecd_NotLikeSearch(String manufacturecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufacturecd), xgetCValueManufacturecd(), "MANUFACTURECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     * @param manufacturecd The value of manufacturecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_PrefixSearch(String manufacturecd) {
        setManufacturecd_LikeSearch(manufacturecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     */
    public void setManufacturecd_IsNull() { regManufacturecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     */
    public void setManufacturecd_IsNullOrEmpty() { regManufacturecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(255)}
     */
    public void setManufacturecd_IsNotNull() { regManufacturecd(CK_ISNN, DOBJ); }

    protected void regManufacturecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufacturecd(), "MANUFACTURECD"); }
    protected abstract ConditionValue xgetCValueManufacturecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_Equal(String orderno) {
        doSetOrderno_Equal(fRES(orderno));
    }

    protected void doSetOrderno_Equal(String orderno) {
        regOrderno(CK_EQ, orderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_NotEqual(String orderno) {
        doSetOrderno_NotEqual(fRES(orderno));
    }

    protected void doSetOrderno_NotEqual(String orderno) {
        regOrderno(CK_NES, orderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_GreaterThan(String orderno) {
        regOrderno(CK_GT, fRES(orderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_LessThan(String orderno) {
        regOrderno(CK_LT, fRES(orderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_GreaterEqual(String orderno) {
        regOrderno(CK_GE, fRES(orderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_LessEqual(String orderno) {
        regOrderno(CK_LE, fRES(orderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param ordernoList The collection of orderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_InScope(Collection<String> ordernoList) {
        doSetOrderno_InScope(ordernoList);
    }

    protected void doSetOrderno_InScope(Collection<String> ordernoList) {
        regINS(CK_INS, cTL(ordernoList), xgetCValueOrderno(), "ORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param ordernoList The collection of orderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_NotInScope(Collection<String> ordernoList) {
        doSetOrderno_NotInScope(ordernoList);
    }

    protected void doSetOrderno_NotInScope(Collection<String> ordernoList) {
        regINS(CK_NINS, cTL(ordernoList), xgetCValueOrderno(), "ORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(255)} <br>
     * <pre>e.g. setOrderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderno The value of orderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderno_LikeSearch(String orderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderno), xgetCValueOrderno(), "ORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderno_NotLikeSearch(String orderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderno), xgetCValueOrderno(), "ORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_PrefixSearch(String orderno) {
        setOrderno_LikeSearch(orderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     */
    public void setOrderno_IsNull() { regOrderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     */
    public void setOrderno_IsNullOrEmpty() { regOrderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     */
    public void setOrderno_IsNotNull() { regOrderno(CK_ISNN, DOBJ); }

    protected void regOrderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderno(), "ORDERNO"); }
    protected abstract ConditionValue xgetCValueOrderno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINEMO: {varchar(255)}
     * @param machinemo The value of machinemo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachinemo_Equal(String machinemo) {
        doSetMachinemo_Equal(fRES(machinemo));
    }

    protected void doSetMachinemo_Equal(String machinemo) {
        regMachinemo(CK_EQ, machinemo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINEMO: {varchar(255)}
     * @param machinemo The value of machinemo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachinemo_NotEqual(String machinemo) {
        doSetMachinemo_NotEqual(fRES(machinemo));
    }

    protected void doSetMachinemo_NotEqual(String machinemo) {
        regMachinemo(CK_NES, machinemo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINEMO: {varchar(255)}
     * @param machinemo The value of machinemo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachinemo_GreaterThan(String machinemo) {
        regMachinemo(CK_GT, fRES(machinemo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINEMO: {varchar(255)}
     * @param machinemo The value of machinemo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachinemo_LessThan(String machinemo) {
        regMachinemo(CK_LT, fRES(machinemo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINEMO: {varchar(255)}
     * @param machinemo The value of machinemo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachinemo_GreaterEqual(String machinemo) {
        regMachinemo(CK_GE, fRES(machinemo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINEMO: {varchar(255)}
     * @param machinemo The value of machinemo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachinemo_LessEqual(String machinemo) {
        regMachinemo(CK_LE, fRES(machinemo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHINEMO: {varchar(255)}
     * @param machinemoList The collection of machinemo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachinemo_InScope(Collection<String> machinemoList) {
        doSetMachinemo_InScope(machinemoList);
    }

    protected void doSetMachinemo_InScope(Collection<String> machinemoList) {
        regINS(CK_INS, cTL(machinemoList), xgetCValueMachinemo(), "MACHINEMO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHINEMO: {varchar(255)}
     * @param machinemoList The collection of machinemo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachinemo_NotInScope(Collection<String> machinemoList) {
        doSetMachinemo_NotInScope(machinemoList);
    }

    protected void doSetMachinemo_NotInScope(Collection<String> machinemoList) {
        regINS(CK_NINS, cTL(machinemoList), xgetCValueMachinemo(), "MACHINEMO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINEMO: {varchar(255)} <br>
     * <pre>e.g. setMachinemo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param machinemo The value of machinemo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMachinemo_LikeSearch(String machinemo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(machinemo), xgetCValueMachinemo(), "MACHINEMO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINEMO: {varchar(255)}
     * @param machinemo The value of machinemo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMachinemo_NotLikeSearch(String machinemo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(machinemo), xgetCValueMachinemo(), "MACHINEMO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINEMO: {varchar(255)}
     * @param machinemo The value of machinemo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachinemo_PrefixSearch(String machinemo) {
        setMachinemo_LikeSearch(machinemo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MACHINEMO: {varchar(255)}
     */
    public void setMachinemo_IsNull() { regMachinemo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MACHINEMO: {varchar(255)}
     */
    public void setMachinemo_IsNullOrEmpty() { regMachinemo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MACHINEMO: {varchar(255)}
     */
    public void setMachinemo_IsNotNull() { regMachinemo(CK_ISNN, DOBJ); }

    protected void regMachinemo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMachinemo(), "MACHINEMO"); }
    protected abstract ConditionValue xgetCValueMachinemo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_Equal(String createno) {
        doSetCreateno_Equal(fRES(createno));
    }

    protected void doSetCreateno_Equal(String createno) {
        regCreateno(CK_EQ, createno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_NotEqual(String createno) {
        doSetCreateno_NotEqual(fRES(createno));
    }

    protected void doSetCreateno_NotEqual(String createno) {
        regCreateno(CK_NES, createno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_GreaterThan(String createno) {
        regCreateno(CK_GT, fRES(createno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_LessThan(String createno) {
        regCreateno(CK_LT, fRES(createno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_GreaterEqual(String createno) {
        regCreateno(CK_GE, fRES(createno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_LessEqual(String createno) {
        regCreateno(CK_LE, fRES(createno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createnoList The collection of createno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_InScope(Collection<String> createnoList) {
        doSetCreateno_InScope(createnoList);
    }

    protected void doSetCreateno_InScope(Collection<String> createnoList) {
        regINS(CK_INS, cTL(createnoList), xgetCValueCreateno(), "CREATENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createnoList The collection of createno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_NotInScope(Collection<String> createnoList) {
        doSetCreateno_NotInScope(createnoList);
    }

    protected void doSetCreateno_NotInScope(Collection<String> createnoList) {
        regINS(CK_NINS, cTL(createnoList), xgetCValueCreateno(), "CREATENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(255)} <br>
     * <pre>e.g. setCreateno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createno The value of createno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreateno_LikeSearch(String createno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createno), xgetCValueCreateno(), "CREATENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreateno_NotLikeSearch(String createno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createno), xgetCValueCreateno(), "CREATENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(255)}
     * @param createno The value of createno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_PrefixSearch(String createno) {
        setCreateno_LikeSearch(createno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     */
    public void setCreateno_IsNull() { regCreateno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     */
    public void setCreateno_IsNullOrEmpty() { regCreateno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATENO: {varchar(255)}
     */
    public void setCreateno_IsNotNull() { regCreateno(CK_ISNN, DOBJ); }

    protected void regCreateno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreateno(), "CREATENO"); }
    protected abstract ConditionValue xgetCValueCreateno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_Equal(String limitdate) {
        doSetLimitdate_Equal(fRES(limitdate));
    }

    protected void doSetLimitdate_Equal(String limitdate) {
        regLimitdate(CK_EQ, limitdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_NotEqual(String limitdate) {
        doSetLimitdate_NotEqual(fRES(limitdate));
    }

    protected void doSetLimitdate_NotEqual(String limitdate) {
        regLimitdate(CK_NES, limitdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_GreaterThan(String limitdate) {
        regLimitdate(CK_GT, fRES(limitdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_LessThan(String limitdate) {
        regLimitdate(CK_LT, fRES(limitdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_GreaterEqual(String limitdate) {
        regLimitdate(CK_GE, fRES(limitdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_LessEqual(String limitdate) {
        regLimitdate(CK_LE, fRES(limitdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdateList The collection of limitdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_InScope(Collection<String> limitdateList) {
        doSetLimitdate_InScope(limitdateList);
    }

    protected void doSetLimitdate_InScope(Collection<String> limitdateList) {
        regINS(CK_INS, cTL(limitdateList), xgetCValueLimitdate(), "LIMITDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdateList The collection of limitdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_NotInScope(Collection<String> limitdateList) {
        doSetLimitdate_NotInScope(limitdateList);
    }

    protected void doSetLimitdate_NotInScope(Collection<String> limitdateList) {
        regINS(CK_NINS, cTL(limitdateList), xgetCValueLimitdate(), "LIMITDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(255)} <br>
     * <pre>e.g. setLimitdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitdate The value of limitdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitdate_LikeSearch(String limitdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitdate), xgetCValueLimitdate(), "LIMITDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitdate_NotLikeSearch(String limitdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitdate), xgetCValueLimitdate(), "LIMITDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(255)}
     * @param limitdate The value of limitdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_PrefixSearch(String limitdate) {
        setLimitdate_LikeSearch(limitdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     */
    public void setLimitdate_IsNull() { regLimitdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     */
    public void setLimitdate_IsNullOrEmpty() { regLimitdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(255)}
     */
    public void setLimitdate_IsNotNull() { regLimitdate(CK_ISNN, DOBJ); }

    protected void regLimitdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitdate(), "LIMITDATE"); }
    protected abstract ConditionValue xgetCValueLimitdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(255)}
     * @param datetime The value of datetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_Equal(String datetime) {
        doSetDatetime_Equal(fRES(datetime));
    }

    protected void doSetDatetime_Equal(String datetime) {
        regDatetime(CK_EQ, datetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(255)}
     * @param datetime The value of datetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_NotEqual(String datetime) {
        doSetDatetime_NotEqual(fRES(datetime));
    }

    protected void doSetDatetime_NotEqual(String datetime) {
        regDatetime(CK_NES, datetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(255)}
     * @param datetime The value of datetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_GreaterThan(String datetime) {
        regDatetime(CK_GT, fRES(datetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(255)}
     * @param datetime The value of datetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_LessThan(String datetime) {
        regDatetime(CK_LT, fRES(datetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(255)}
     * @param datetime The value of datetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_GreaterEqual(String datetime) {
        regDatetime(CK_GE, fRES(datetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(255)}
     * @param datetime The value of datetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_LessEqual(String datetime) {
        regDatetime(CK_LE, fRES(datetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(255)}
     * @param datetimeList The collection of datetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_InScope(Collection<String> datetimeList) {
        doSetDatetime_InScope(datetimeList);
    }

    protected void doSetDatetime_InScope(Collection<String> datetimeList) {
        regINS(CK_INS, cTL(datetimeList), xgetCValueDatetime(), "DATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(255)}
     * @param datetimeList The collection of datetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_NotInScope(Collection<String> datetimeList) {
        doSetDatetime_NotInScope(datetimeList);
    }

    protected void doSetDatetime_NotInScope(Collection<String> datetimeList) {
        regINS(CK_NINS, cTL(datetimeList), xgetCValueDatetime(), "DATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(255)} <br>
     * <pre>e.g. setDatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param datetime The value of datetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDatetime_LikeSearch(String datetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(datetime), xgetCValueDatetime(), "DATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(255)}
     * @param datetime The value of datetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDatetime_NotLikeSearch(String datetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(datetime), xgetCValueDatetime(), "DATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(255)}
     * @param datetime The value of datetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_PrefixSearch(String datetime) {
        setDatetime_LikeSearch(datetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATETIME: {varchar(255)}
     */
    public void setDatetime_IsNull() { regDatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATETIME: {varchar(255)}
     */
    public void setDatetime_IsNullOrEmpty() { regDatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATETIME: {varchar(255)}
     */
    public void setDatetime_IsNotNull() { regDatetime(CK_ISNN, DOBJ); }

    protected void regDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDatetime(), "DATETIME"); }
    protected abstract ConditionValue xgetCValueDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_Equal(String distributioncd) {
        doSetDistributioncd_Equal(fRES(distributioncd));
    }

    protected void doSetDistributioncd_Equal(String distributioncd) {
        regDistributioncd(CK_EQ, distributioncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_NotEqual(String distributioncd) {
        doSetDistributioncd_NotEqual(fRES(distributioncd));
    }

    protected void doSetDistributioncd_NotEqual(String distributioncd) {
        regDistributioncd(CK_NES, distributioncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_GreaterThan(String distributioncd) {
        regDistributioncd(CK_GT, fRES(distributioncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_LessThan(String distributioncd) {
        regDistributioncd(CK_LT, fRES(distributioncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_GreaterEqual(String distributioncd) {
        regDistributioncd(CK_GE, fRES(distributioncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_LessEqual(String distributioncd) {
        regDistributioncd(CK_LE, fRES(distributioncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncdList The collection of distributioncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_InScope(Collection<String> distributioncdList) {
        doSetDistributioncd_InScope(distributioncdList);
    }

    protected void doSetDistributioncd_InScope(Collection<String> distributioncdList) {
        regINS(CK_INS, cTL(distributioncdList), xgetCValueDistributioncd(), "DISTRIBUTIONCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncdList The collection of distributioncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_NotInScope(Collection<String> distributioncdList) {
        doSetDistributioncd_NotInScope(distributioncdList);
    }

    protected void doSetDistributioncd_NotInScope(Collection<String> distributioncdList) {
        regINS(CK_NINS, cTL(distributioncdList), xgetCValueDistributioncd(), "DISTRIBUTIONCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)} <br>
     * <pre>e.g. setDistributioncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param distributioncd The value of distributioncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistributioncd_LikeSearch(String distributioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(distributioncd), xgetCValueDistributioncd(), "DISTRIBUTIONCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistributioncd_NotLikeSearch(String distributioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(distributioncd), xgetCValueDistributioncd(), "DISTRIBUTIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_PrefixSearch(String distributioncd) {
        setDistributioncd_LikeSearch(distributioncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     */
    public void setDistributioncd_IsNull() { regDistributioncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     */
    public void setDistributioncd_IsNullOrEmpty() { regDistributioncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     */
    public void setDistributioncd_IsNotNull() { regDistributioncd(CK_ISNN, DOBJ); }

    protected void regDistributioncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistributioncd(), "DISTRIBUTIONCD"); }
    protected abstract ConditionValue xgetCValueDistributioncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_Equal(String transportcd) {
        doSetTransportcd_Equal(fRES(transportcd));
    }

    protected void doSetTransportcd_Equal(String transportcd) {
        regTransportcd(CK_EQ, transportcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_NotEqual(String transportcd) {
        doSetTransportcd_NotEqual(fRES(transportcd));
    }

    protected void doSetTransportcd_NotEqual(String transportcd) {
        regTransportcd(CK_NES, transportcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_GreaterThan(String transportcd) {
        regTransportcd(CK_GT, fRES(transportcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_LessThan(String transportcd) {
        regTransportcd(CK_LT, fRES(transportcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_GreaterEqual(String transportcd) {
        regTransportcd(CK_GE, fRES(transportcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_LessEqual(String transportcd) {
        regTransportcd(CK_LE, fRES(transportcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcdList The collection of transportcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_InScope(Collection<String> transportcdList) {
        doSetTransportcd_InScope(transportcdList);
    }

    protected void doSetTransportcd_InScope(Collection<String> transportcdList) {
        regINS(CK_INS, cTL(transportcdList), xgetCValueTransportcd(), "TRANSPORTCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcdList The collection of transportcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_NotInScope(Collection<String> transportcdList) {
        doSetTransportcd_NotInScope(transportcdList);
    }

    protected void doSetTransportcd_NotInScope(Collection<String> transportcdList) {
        regINS(CK_NINS, cTL(transportcdList), xgetCValueTransportcd(), "TRANSPORTCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)} <br>
     * <pre>e.g. setTransportcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transportcd The value of transportcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransportcd_LikeSearch(String transportcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transportcd), xgetCValueTransportcd(), "TRANSPORTCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransportcd_NotLikeSearch(String transportcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transportcd), xgetCValueTransportcd(), "TRANSPORTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_PrefixSearch(String transportcd) {
        setTransportcd_LikeSearch(transportcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     */
    public void setTransportcd_IsNull() { regTransportcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     */
    public void setTransportcd_IsNullOrEmpty() { regTransportcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     */
    public void setTransportcd_IsNotNull() { regTransportcd(CK_ISNN, DOBJ); }

    protected void regTransportcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportcd(), "TRANSPORTCD"); }
    protected abstract ConditionValue xgetCValueTransportcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_Equal(String palletid) {
        doSetPalletid_Equal(fRES(palletid));
    }

    protected void doSetPalletid_Equal(String palletid) {
        regPalletid(CK_EQ, palletid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_NotEqual(String palletid) {
        doSetPalletid_NotEqual(fRES(palletid));
    }

    protected void doSetPalletid_NotEqual(String palletid) {
        regPalletid(CK_NES, palletid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_GreaterThan(String palletid) {
        regPalletid(CK_GT, fRES(palletid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_LessThan(String palletid) {
        regPalletid(CK_LT, fRES(palletid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_GreaterEqual(String palletid) {
        regPalletid(CK_GE, fRES(palletid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_LessEqual(String palletid) {
        regPalletid(CK_LE, fRES(palletid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletidList The collection of palletid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_InScope(Collection<String> palletidList) {
        doSetPalletid_InScope(palletidList);
    }

    protected void doSetPalletid_InScope(Collection<String> palletidList) {
        regINS(CK_INS, cTL(palletidList), xgetCValuePalletid(), "PALLETID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletidList The collection of palletid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_NotInScope(Collection<String> palletidList) {
        doSetPalletid_NotInScope(palletidList);
    }

    protected void doSetPalletid_NotInScope(Collection<String> palletidList) {
        regINS(CK_NINS, cTL(palletidList), xgetCValuePalletid(), "PALLETID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)} <br>
     * <pre>e.g. setPalletid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palletid The value of palletid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPalletid_LikeSearch(String palletid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palletid), xgetCValuePalletid(), "PALLETID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletid_NotLikeSearch(String palletid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletid), xgetCValuePalletid(), "PALLETID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_PrefixSearch(String palletid) {
        setPalletid_LikeSearch(palletid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     */
    public void setPalletid_IsNull() { regPalletid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     */
    public void setPalletid_IsNullOrEmpty() { regPalletid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     */
    public void setPalletid_IsNotNull() { regPalletid(CK_ISNN, DOBJ); }

    protected void regPalletid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletid(), "PALLETID"); }
    protected abstract ConditionValue xgetCValuePalletid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_Equal(String initnum) {
        doSetInitnum_Equal(fRES(initnum));
    }

    protected void doSetInitnum_Equal(String initnum) {
        regInitnum(CK_EQ, initnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_NotEqual(String initnum) {
        doSetInitnum_NotEqual(fRES(initnum));
    }

    protected void doSetInitnum_NotEqual(String initnum) {
        regInitnum(CK_NES, initnum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_GreaterThan(String initnum) {
        regInitnum(CK_GT, fRES(initnum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_LessThan(String initnum) {
        regInitnum(CK_LT, fRES(initnum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_GreaterEqual(String initnum) {
        regInitnum(CK_GE, fRES(initnum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_LessEqual(String initnum) {
        regInitnum(CK_LE, fRES(initnum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnumList The collection of initnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_InScope(Collection<String> initnumList) {
        doSetInitnum_InScope(initnumList);
    }

    protected void doSetInitnum_InScope(Collection<String> initnumList) {
        regINS(CK_INS, cTL(initnumList), xgetCValueInitnum(), "INITNUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnumList The collection of initnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_NotInScope(Collection<String> initnumList) {
        doSetInitnum_NotInScope(initnumList);
    }

    protected void doSetInitnum_NotInScope(Collection<String> initnumList) {
        regINS(CK_NINS, cTL(initnumList), xgetCValueInitnum(), "INITNUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INITNUM: {varchar(255)} <br>
     * <pre>e.g. setInitnum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param initnum The value of initnum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInitnum_LikeSearch(String initnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(initnum), xgetCValueInitnum(), "INITNUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInitnum_NotLikeSearch(String initnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(initnum), xgetCValueInitnum(), "INITNUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_PrefixSearch(String initnum) {
        setInitnum_LikeSearch(initnum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     */
    public void setInitnum_IsNull() { regInitnum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     */
    public void setInitnum_IsNullOrEmpty() { regInitnum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     */
    public void setInitnum_IsNotNull() { regInitnum(CK_ISNN, DOBJ); }

    protected void regInitnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInitnum(), "INITNUM"); }
    protected abstract ConditionValue xgetCValueInitnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_Equal(String createdatetime) {
        doSetCreatedatetime_Equal(fRES(createdatetime));
    }

    protected void doSetCreatedatetime_Equal(String createdatetime) {
        regCreatedatetime(CK_EQ, createdatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_NotEqual(String createdatetime) {
        doSetCreatedatetime_NotEqual(fRES(createdatetime));
    }

    protected void doSetCreatedatetime_NotEqual(String createdatetime) {
        regCreatedatetime(CK_NES, createdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_GreaterThan(String createdatetime) {
        regCreatedatetime(CK_GT, fRES(createdatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_LessThan(String createdatetime) {
        regCreatedatetime(CK_LT, fRES(createdatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_GreaterEqual(String createdatetime) {
        regCreatedatetime(CK_GE, fRES(createdatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_LessEqual(String createdatetime) {
        regCreatedatetime(CK_LE, fRES(createdatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetimeList The collection of createdatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_InScope(Collection<String> createdatetimeList) {
        doSetCreatedatetime_InScope(createdatetimeList);
    }

    protected void doSetCreatedatetime_InScope(Collection<String> createdatetimeList) {
        regINS(CK_INS, cTL(createdatetimeList), xgetCValueCreatedatetime(), "CREATEDATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetimeList The collection of createdatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_NotInScope(Collection<String> createdatetimeList) {
        doSetCreatedatetime_NotInScope(createdatetimeList);
    }

    protected void doSetCreatedatetime_NotInScope(Collection<String> createdatetimeList) {
        regINS(CK_NINS, cTL(createdatetimeList), xgetCValueCreatedatetime(), "CREATEDATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(255)} <br>
     * <pre>e.g. setCreatedatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createdatetime The value of createdatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreatedatetime_LikeSearch(String createdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createdatetime), xgetCValueCreatedatetime(), "CREATEDATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreatedatetime_NotLikeSearch(String createdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createdatetime), xgetCValueCreatedatetime(), "CREATEDATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_PrefixSearch(String createdatetime) {
        setCreatedatetime_LikeSearch(createdatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     */
    public void setCreatedatetime_IsNull() { regCreatedatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     */
    public void setCreatedatetime_IsNullOrEmpty() { regCreatedatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     */
    public void setCreatedatetime_IsNotNull() { regCreatedatetime(CK_ISNN, DOBJ); }

    protected void regCreatedatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedatetime(), "CREATEDATETIME"); }
    protected abstract ConditionValue xgetCValueCreatedatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_Equal(String assortdatetime) {
        doSetAssortdatetime_Equal(fRES(assortdatetime));
    }

    protected void doSetAssortdatetime_Equal(String assortdatetime) {
        regAssortdatetime(CK_EQ, assortdatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_NotEqual(String assortdatetime) {
        doSetAssortdatetime_NotEqual(fRES(assortdatetime));
    }

    protected void doSetAssortdatetime_NotEqual(String assortdatetime) {
        regAssortdatetime(CK_NES, assortdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_GreaterThan(String assortdatetime) {
        regAssortdatetime(CK_GT, fRES(assortdatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_LessThan(String assortdatetime) {
        regAssortdatetime(CK_LT, fRES(assortdatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_GreaterEqual(String assortdatetime) {
        regAssortdatetime(CK_GE, fRES(assortdatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_LessEqual(String assortdatetime) {
        regAssortdatetime(CK_LE, fRES(assortdatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetimeList The collection of assortdatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_InScope(Collection<String> assortdatetimeList) {
        doSetAssortdatetime_InScope(assortdatetimeList);
    }

    protected void doSetAssortdatetime_InScope(Collection<String> assortdatetimeList) {
        regINS(CK_INS, cTL(assortdatetimeList), xgetCValueAssortdatetime(), "ASSORTDATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetimeList The collection of assortdatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_NotInScope(Collection<String> assortdatetimeList) {
        doSetAssortdatetime_NotInScope(assortdatetimeList);
    }

    protected void doSetAssortdatetime_NotInScope(Collection<String> assortdatetimeList) {
        regINS(CK_NINS, cTL(assortdatetimeList), xgetCValueAssortdatetime(), "ASSORTDATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(255)} <br>
     * <pre>e.g. setAssortdatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortdatetime The value of assortdatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortdatetime_LikeSearch(String assortdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortdatetime), xgetCValueAssortdatetime(), "ASSORTDATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortdatetime_NotLikeSearch(String assortdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortdatetime), xgetCValueAssortdatetime(), "ASSORTDATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_PrefixSearch(String assortdatetime) {
        setAssortdatetime_LikeSearch(assortdatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     */
    public void setAssortdatetime_IsNull() { regAssortdatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     */
    public void setAssortdatetime_IsNullOrEmpty() { regAssortdatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     */
    public void setAssortdatetime_IsNotNull() { regAssortdatetime(CK_ISNN, DOBJ); }

    protected void regAssortdatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortdatetime(), "ASSORTDATETIME"); }
    protected abstract ConditionValue xgetCValueAssortdatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_Equal(String tracetype) {
        doSetTracetype_Equal(fRES(tracetype));
    }

    protected void doSetTracetype_Equal(String tracetype) {
        regTracetype(CK_EQ, tracetype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_NotEqual(String tracetype) {
        doSetTracetype_NotEqual(fRES(tracetype));
    }

    protected void doSetTracetype_NotEqual(String tracetype) {
        regTracetype(CK_NES, tracetype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_GreaterThan(String tracetype) {
        regTracetype(CK_GT, fRES(tracetype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_LessThan(String tracetype) {
        regTracetype(CK_LT, fRES(tracetype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_GreaterEqual(String tracetype) {
        regTracetype(CK_GE, fRES(tracetype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_LessEqual(String tracetype) {
        regTracetype(CK_LE, fRES(tracetype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetypeList The collection of tracetype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_InScope(Collection<String> tracetypeList) {
        doSetTracetype_InScope(tracetypeList);
    }

    protected void doSetTracetype_InScope(Collection<String> tracetypeList) {
        regINS(CK_INS, cTL(tracetypeList), xgetCValueTracetype(), "TRACETYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetypeList The collection of tracetype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_NotInScope(Collection<String> tracetypeList) {
        doSetTracetype_NotInScope(tracetypeList);
    }

    protected void doSetTracetype_NotInScope(Collection<String> tracetypeList) {
        regINS(CK_NINS, cTL(tracetypeList), xgetCValueTracetype(), "TRACETYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(255)} <br>
     * <pre>e.g. setTracetype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tracetype The value of tracetype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTracetype_LikeSearch(String tracetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tracetype), xgetCValueTracetype(), "TRACETYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTracetype_NotLikeSearch(String tracetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tracetype), xgetCValueTracetype(), "TRACETYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_PrefixSearch(String tracetype) {
        setTracetype_LikeSearch(tracetype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     */
    public void setTracetype_IsNull() { regTracetype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     */
    public void setTracetype_IsNullOrEmpty() { regTracetype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     */
    public void setTracetype_IsNotNull() { regTracetype(CK_ISNN, DOBJ); }

    protected void regTracetype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTracetype(), "TRACETYPE"); }
    protected abstract ConditionValue xgetCValueTracetype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_Equal(String lineblock) {
        doSetLineblock_Equal(fRES(lineblock));
    }

    protected void doSetLineblock_Equal(String lineblock) {
        regLineblock(CK_EQ, lineblock);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_NotEqual(String lineblock) {
        doSetLineblock_NotEqual(fRES(lineblock));
    }

    protected void doSetLineblock_NotEqual(String lineblock) {
        regLineblock(CK_NES, lineblock);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_GreaterThan(String lineblock) {
        regLineblock(CK_GT, fRES(lineblock));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_LessThan(String lineblock) {
        regLineblock(CK_LT, fRES(lineblock));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_GreaterEqual(String lineblock) {
        regLineblock(CK_GE, fRES(lineblock));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_LessEqual(String lineblock) {
        regLineblock(CK_LE, fRES(lineblock));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblockList The collection of lineblock as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_InScope(Collection<String> lineblockList) {
        doSetLineblock_InScope(lineblockList);
    }

    protected void doSetLineblock_InScope(Collection<String> lineblockList) {
        regINS(CK_INS, cTL(lineblockList), xgetCValueLineblock(), "LINEBLOCK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblockList The collection of lineblock as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_NotInScope(Collection<String> lineblockList) {
        doSetLineblock_NotInScope(lineblockList);
    }

    protected void doSetLineblock_NotInScope(Collection<String> lineblockList) {
        regINS(CK_NINS, cTL(lineblockList), xgetCValueLineblock(), "LINEBLOCK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(255)} <br>
     * <pre>e.g. setLineblock_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineblock The value of lineblock as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineblock_LikeSearch(String lineblock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineblock), xgetCValueLineblock(), "LINEBLOCK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineblock_NotLikeSearch(String lineblock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineblock), xgetCValueLineblock(), "LINEBLOCK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_PrefixSearch(String lineblock) {
        setLineblock_LikeSearch(lineblock, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     */
    public void setLineblock_IsNull() { regLineblock(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     */
    public void setLineblock_IsNullOrEmpty() { regLineblock(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     */
    public void setLineblock_IsNotNull() { regLineblock(CK_ISNN, DOBJ); }

    protected void regLineblock(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineblock(), "LINEBLOCK"); }
    protected abstract ConditionValue xgetCValueLineblock();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_Equal(String assortedunit) {
        doSetAssortedunit_Equal(fRES(assortedunit));
    }

    protected void doSetAssortedunit_Equal(String assortedunit) {
        regAssortedunit(CK_EQ, assortedunit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_NotEqual(String assortedunit) {
        doSetAssortedunit_NotEqual(fRES(assortedunit));
    }

    protected void doSetAssortedunit_NotEqual(String assortedunit) {
        regAssortedunit(CK_NES, assortedunit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_GreaterThan(String assortedunit) {
        regAssortedunit(CK_GT, fRES(assortedunit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_LessThan(String assortedunit) {
        regAssortedunit(CK_LT, fRES(assortedunit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_GreaterEqual(String assortedunit) {
        regAssortedunit(CK_GE, fRES(assortedunit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_LessEqual(String assortedunit) {
        regAssortedunit(CK_LE, fRES(assortedunit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunitList The collection of assortedunit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_InScope(Collection<String> assortedunitList) {
        doSetAssortedunit_InScope(assortedunitList);
    }

    protected void doSetAssortedunit_InScope(Collection<String> assortedunitList) {
        regINS(CK_INS, cTL(assortedunitList), xgetCValueAssortedunit(), "ASSORTEDUNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunitList The collection of assortedunit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_NotInScope(Collection<String> assortedunitList) {
        doSetAssortedunit_NotInScope(assortedunitList);
    }

    protected void doSetAssortedunit_NotInScope(Collection<String> assortedunitList) {
        regINS(CK_NINS, cTL(assortedunitList), xgetCValueAssortedunit(), "ASSORTEDUNIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)} <br>
     * <pre>e.g. setAssortedunit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortedunit The value of assortedunit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortedunit_LikeSearch(String assortedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortedunit), xgetCValueAssortedunit(), "ASSORTEDUNIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortedunit_NotLikeSearch(String assortedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortedunit), xgetCValueAssortedunit(), "ASSORTEDUNIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_PrefixSearch(String assortedunit) {
        setAssortedunit_LikeSearch(assortedunit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     */
    public void setAssortedunit_IsNull() { regAssortedunit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     */
    public void setAssortedunit_IsNullOrEmpty() { regAssortedunit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     */
    public void setAssortedunit_IsNotNull() { regAssortedunit(CK_ISNN, DOBJ); }

    protected void regAssortedunit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortedunit(), "ASSORTEDUNIT"); }
    protected abstract ConditionValue xgetCValueAssortedunit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_Equal(String assortedindex) {
        doSetAssortedindex_Equal(fRES(assortedindex));
    }

    protected void doSetAssortedindex_Equal(String assortedindex) {
        regAssortedindex(CK_EQ, assortedindex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_NotEqual(String assortedindex) {
        doSetAssortedindex_NotEqual(fRES(assortedindex));
    }

    protected void doSetAssortedindex_NotEqual(String assortedindex) {
        regAssortedindex(CK_NES, assortedindex);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_GreaterThan(String assortedindex) {
        regAssortedindex(CK_GT, fRES(assortedindex));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_LessThan(String assortedindex) {
        regAssortedindex(CK_LT, fRES(assortedindex));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_GreaterEqual(String assortedindex) {
        regAssortedindex(CK_GE, fRES(assortedindex));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_LessEqual(String assortedindex) {
        regAssortedindex(CK_LE, fRES(assortedindex));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindexList The collection of assortedindex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_InScope(Collection<String> assortedindexList) {
        doSetAssortedindex_InScope(assortedindexList);
    }

    protected void doSetAssortedindex_InScope(Collection<String> assortedindexList) {
        regINS(CK_INS, cTL(assortedindexList), xgetCValueAssortedindex(), "ASSORTEDINDEX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindexList The collection of assortedindex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_NotInScope(Collection<String> assortedindexList) {
        doSetAssortedindex_NotInScope(assortedindexList);
    }

    protected void doSetAssortedindex_NotInScope(Collection<String> assortedindexList) {
        regINS(CK_NINS, cTL(assortedindexList), xgetCValueAssortedindex(), "ASSORTEDINDEX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)} <br>
     * <pre>e.g. setAssortedindex_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortedindex The value of assortedindex as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortedindex_LikeSearch(String assortedindex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortedindex), xgetCValueAssortedindex(), "ASSORTEDINDEX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortedindex_NotLikeSearch(String assortedindex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortedindex), xgetCValueAssortedindex(), "ASSORTEDINDEX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_PrefixSearch(String assortedindex) {
        setAssortedindex_LikeSearch(assortedindex, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     */
    public void setAssortedindex_IsNull() { regAssortedindex(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     */
    public void setAssortedindex_IsNullOrEmpty() { regAssortedindex(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     */
    public void setAssortedindex_IsNotNull() { regAssortedindex(CK_ISNN, DOBJ); }

    protected void regAssortedindex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortedindex(), "ASSORTEDINDEX"); }
    protected abstract ConditionValue xgetCValueAssortedindex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_Equal(String operationcode) {
        doSetOperationcode_Equal(fRES(operationcode));
    }

    protected void doSetOperationcode_Equal(String operationcode) {
        regOperationcode(CK_EQ, operationcode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_NotEqual(String operationcode) {
        doSetOperationcode_NotEqual(fRES(operationcode));
    }

    protected void doSetOperationcode_NotEqual(String operationcode) {
        regOperationcode(CK_NES, operationcode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_GreaterThan(String operationcode) {
        regOperationcode(CK_GT, fRES(operationcode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_LessThan(String operationcode) {
        regOperationcode(CK_LT, fRES(operationcode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_GreaterEqual(String operationcode) {
        regOperationcode(CK_GE, fRES(operationcode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_LessEqual(String operationcode) {
        regOperationcode(CK_LE, fRES(operationcode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcodeList The collection of operationcode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_InScope(Collection<String> operationcodeList) {
        doSetOperationcode_InScope(operationcodeList);
    }

    protected void doSetOperationcode_InScope(Collection<String> operationcodeList) {
        regINS(CK_INS, cTL(operationcodeList), xgetCValueOperationcode(), "OPERATIONCODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcodeList The collection of operationcode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_NotInScope(Collection<String> operationcodeList) {
        doSetOperationcode_NotInScope(operationcodeList);
    }

    protected void doSetOperationcode_NotInScope(Collection<String> operationcodeList) {
        regINS(CK_NINS, cTL(operationcodeList), xgetCValueOperationcode(), "OPERATIONCODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {varchar(255)} <br>
     * <pre>e.g. setOperationcode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param operationcode The value of operationcode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOperationcode_LikeSearch(String operationcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(operationcode), xgetCValueOperationcode(), "OPERATIONCODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOperationcode_NotLikeSearch(String operationcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(operationcode), xgetCValueOperationcode(), "OPERATIONCODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_PrefixSearch(String operationcode) {
        setOperationcode_LikeSearch(operationcode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     */
    public void setOperationcode_IsNull() { regOperationcode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     */
    public void setOperationcode_IsNullOrEmpty() { regOperationcode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     */
    public void setOperationcode_IsNotNull() { regOperationcode(CK_ISNN, DOBJ); }

    protected void regOperationcode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOperationcode(), "OPERATIONCODE"); }
    protected abstract ConditionValue xgetCValueOperationcode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_Equal(String caseinnum) {
        doSetCaseinnum_Equal(fRES(caseinnum));
    }

    protected void doSetCaseinnum_Equal(String caseinnum) {
        regCaseinnum(CK_EQ, caseinnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_NotEqual(String caseinnum) {
        doSetCaseinnum_NotEqual(fRES(caseinnum));
    }

    protected void doSetCaseinnum_NotEqual(String caseinnum) {
        regCaseinnum(CK_NES, caseinnum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_GreaterThan(String caseinnum) {
        regCaseinnum(CK_GT, fRES(caseinnum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_LessThan(String caseinnum) {
        regCaseinnum(CK_LT, fRES(caseinnum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_GreaterEqual(String caseinnum) {
        regCaseinnum(CK_GE, fRES(caseinnum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_LessEqual(String caseinnum) {
        regCaseinnum(CK_LE, fRES(caseinnum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnumList The collection of caseinnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_InScope(Collection<String> caseinnumList) {
        doSetCaseinnum_InScope(caseinnumList);
    }

    protected void doSetCaseinnum_InScope(Collection<String> caseinnumList) {
        regINS(CK_INS, cTL(caseinnumList), xgetCValueCaseinnum(), "CASEINNUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnumList The collection of caseinnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_NotInScope(Collection<String> caseinnumList) {
        doSetCaseinnum_NotInScope(caseinnumList);
    }

    protected void doSetCaseinnum_NotInScope(Collection<String> caseinnumList) {
        regINS(CK_NINS, cTL(caseinnumList), xgetCValueCaseinnum(), "CASEINNUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEINNUM: {varchar(255)} <br>
     * <pre>e.g. setCaseinnum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseinnum The value of caseinnum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseinnum_LikeSearch(String caseinnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseinnum), xgetCValueCaseinnum(), "CASEINNUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseinnum_NotLikeSearch(String caseinnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseinnum), xgetCValueCaseinnum(), "CASEINNUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_PrefixSearch(String caseinnum) {
        setCaseinnum_LikeSearch(caseinnum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     */
    public void setCaseinnum_IsNull() { regCaseinnum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     */
    public void setCaseinnum_IsNullOrEmpty() { regCaseinnum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     */
    public void setCaseinnum_IsNotNull() { regCaseinnum(CK_ISNN, DOBJ); }

    protected void regCaseinnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseinnum(), "CASEINNUM"); }
    protected abstract ConditionValue xgetCValueCaseinnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_Equal(String assortnum) {
        doSetAssortnum_Equal(fRES(assortnum));
    }

    protected void doSetAssortnum_Equal(String assortnum) {
        regAssortnum(CK_EQ, assortnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_NotEqual(String assortnum) {
        doSetAssortnum_NotEqual(fRES(assortnum));
    }

    protected void doSetAssortnum_NotEqual(String assortnum) {
        regAssortnum(CK_NES, assortnum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_GreaterThan(String assortnum) {
        regAssortnum(CK_GT, fRES(assortnum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_LessThan(String assortnum) {
        regAssortnum(CK_LT, fRES(assortnum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_GreaterEqual(String assortnum) {
        regAssortnum(CK_GE, fRES(assortnum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_LessEqual(String assortnum) {
        regAssortnum(CK_LE, fRES(assortnum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnumList The collection of assortnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_InScope(Collection<String> assortnumList) {
        doSetAssortnum_InScope(assortnumList);
    }

    protected void doSetAssortnum_InScope(Collection<String> assortnumList) {
        regINS(CK_INS, cTL(assortnumList), xgetCValueAssortnum(), "ASSORTNUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnumList The collection of assortnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_NotInScope(Collection<String> assortnumList) {
        doSetAssortnum_NotInScope(assortnumList);
    }

    protected void doSetAssortnum_NotInScope(Collection<String> assortnumList) {
        regINS(CK_NINS, cTL(assortnumList), xgetCValueAssortnum(), "ASSORTNUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {varchar(255)} <br>
     * <pre>e.g. setAssortnum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortnum The value of assortnum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortnum_LikeSearch(String assortnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortnum), xgetCValueAssortnum(), "ASSORTNUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortnum_NotLikeSearch(String assortnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortnum), xgetCValueAssortnum(), "ASSORTNUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_PrefixSearch(String assortnum) {
        setAssortnum_LikeSearch(assortnum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     */
    public void setAssortnum_IsNull() { regAssortnum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     */
    public void setAssortnum_IsNullOrEmpty() { regAssortnum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     */
    public void setAssortnum_IsNotNull() { regAssortnum(CK_ISNN, DOBJ); }

    protected void regAssortnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortnum(), "ASSORTNUM"); }
    protected abstract ConditionValue xgetCValueAssortnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_Equal(String assortdifnum) {
        doSetAssortdifnum_Equal(fRES(assortdifnum));
    }

    protected void doSetAssortdifnum_Equal(String assortdifnum) {
        regAssortdifnum(CK_EQ, assortdifnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_NotEqual(String assortdifnum) {
        doSetAssortdifnum_NotEqual(fRES(assortdifnum));
    }

    protected void doSetAssortdifnum_NotEqual(String assortdifnum) {
        regAssortdifnum(CK_NES, assortdifnum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_GreaterThan(String assortdifnum) {
        regAssortdifnum(CK_GT, fRES(assortdifnum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_LessThan(String assortdifnum) {
        regAssortdifnum(CK_LT, fRES(assortdifnum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_GreaterEqual(String assortdifnum) {
        regAssortdifnum(CK_GE, fRES(assortdifnum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_LessEqual(String assortdifnum) {
        regAssortdifnum(CK_LE, fRES(assortdifnum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnumList The collection of assortdifnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_InScope(Collection<String> assortdifnumList) {
        doSetAssortdifnum_InScope(assortdifnumList);
    }

    protected void doSetAssortdifnum_InScope(Collection<String> assortdifnumList) {
        regINS(CK_INS, cTL(assortdifnumList), xgetCValueAssortdifnum(), "ASSORTDIFNUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnumList The collection of assortdifnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_NotInScope(Collection<String> assortdifnumList) {
        doSetAssortdifnum_NotInScope(assortdifnumList);
    }

    protected void doSetAssortdifnum_NotInScope(Collection<String> assortdifnumList) {
        regINS(CK_NINS, cTL(assortdifnumList), xgetCValueAssortdifnum(), "ASSORTDIFNUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)} <br>
     * <pre>e.g. setAssortdifnum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortdifnum The value of assortdifnum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortdifnum_LikeSearch(String assortdifnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortdifnum), xgetCValueAssortdifnum(), "ASSORTDIFNUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortdifnum_NotLikeSearch(String assortdifnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortdifnum), xgetCValueAssortdifnum(), "ASSORTDIFNUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_PrefixSearch(String assortdifnum) {
        setAssortdifnum_LikeSearch(assortdifnum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     */
    public void setAssortdifnum_IsNull() { regAssortdifnum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     */
    public void setAssortdifnum_IsNullOrEmpty() { regAssortdifnum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     */
    public void setAssortdifnum_IsNotNull() { regAssortdifnum(CK_ISNN, DOBJ); }

    protected void regAssortdifnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortdifnum(), "ASSORTDIFNUM"); }
    protected abstract ConditionValue xgetCValueAssortdifnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_Equal(String directioncd) {
        doSetDirectioncd_Equal(fRES(directioncd));
    }

    protected void doSetDirectioncd_Equal(String directioncd) {
        regDirectioncd(CK_EQ, directioncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_NotEqual(String directioncd) {
        doSetDirectioncd_NotEqual(fRES(directioncd));
    }

    protected void doSetDirectioncd_NotEqual(String directioncd) {
        regDirectioncd(CK_NES, directioncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_GreaterThan(String directioncd) {
        regDirectioncd(CK_GT, fRES(directioncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_LessThan(String directioncd) {
        regDirectioncd(CK_LT, fRES(directioncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_GreaterEqual(String directioncd) {
        regDirectioncd(CK_GE, fRES(directioncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_LessEqual(String directioncd) {
        regDirectioncd(CK_LE, fRES(directioncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncdList The collection of directioncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_InScope(Collection<String> directioncdList) {
        doSetDirectioncd_InScope(directioncdList);
    }

    protected void doSetDirectioncd_InScope(Collection<String> directioncdList) {
        regINS(CK_INS, cTL(directioncdList), xgetCValueDirectioncd(), "DIRECTIONCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncdList The collection of directioncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_NotInScope(Collection<String> directioncdList) {
        doSetDirectioncd_NotInScope(directioncdList);
    }

    protected void doSetDirectioncd_NotInScope(Collection<String> directioncdList) {
        regINS(CK_NINS, cTL(directioncdList), xgetCValueDirectioncd(), "DIRECTIONCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(255)} <br>
     * <pre>e.g. setDirectioncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directioncd The value of directioncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectioncd_LikeSearch(String directioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directioncd), xgetCValueDirectioncd(), "DIRECTIONCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectioncd_NotLikeSearch(String directioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directioncd), xgetCValueDirectioncd(), "DIRECTIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_PrefixSearch(String directioncd) {
        setDirectioncd_LikeSearch(directioncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     */
    public void setDirectioncd_IsNull() { regDirectioncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     */
    public void setDirectioncd_IsNullOrEmpty() { regDirectioncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     */
    public void setDirectioncd_IsNotNull() { regDirectioncd(CK_ISNN, DOBJ); }

    protected void regDirectioncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectioncd(), "DIRECTIONCD"); }
    protected abstract ConditionValue xgetCValueDirectioncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_Equal(String pistontype) {
        doSetPistontype_Equal(fRES(pistontype));
    }

    protected void doSetPistontype_Equal(String pistontype) {
        regPistontype(CK_EQ, pistontype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_NotEqual(String pistontype) {
        doSetPistontype_NotEqual(fRES(pistontype));
    }

    protected void doSetPistontype_NotEqual(String pistontype) {
        regPistontype(CK_NES, pistontype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_GreaterThan(String pistontype) {
        regPistontype(CK_GT, fRES(pistontype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_LessThan(String pistontype) {
        regPistontype(CK_LT, fRES(pistontype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_GreaterEqual(String pistontype) {
        regPistontype(CK_GE, fRES(pistontype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_LessEqual(String pistontype) {
        regPistontype(CK_LE, fRES(pistontype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontypeList The collection of pistontype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_InScope(Collection<String> pistontypeList) {
        doSetPistontype_InScope(pistontypeList);
    }

    protected void doSetPistontype_InScope(Collection<String> pistontypeList) {
        regINS(CK_INS, cTL(pistontypeList), xgetCValuePistontype(), "PISTONTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontypeList The collection of pistontype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_NotInScope(Collection<String> pistontypeList) {
        doSetPistontype_NotInScope(pistontypeList);
    }

    protected void doSetPistontype_NotInScope(Collection<String> pistontypeList) {
        regINS(CK_NINS, cTL(pistontypeList), xgetCValuePistontype(), "PISTONTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {varchar(255)} <br>
     * <pre>e.g. setPistontype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pistontype The value of pistontype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPistontype_LikeSearch(String pistontype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pistontype), xgetCValuePistontype(), "PISTONTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPistontype_NotLikeSearch(String pistontype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pistontype), xgetCValuePistontype(), "PISTONTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_PrefixSearch(String pistontype) {
        setPistontype_LikeSearch(pistontype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     */
    public void setPistontype_IsNull() { regPistontype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     */
    public void setPistontype_IsNullOrEmpty() { regPistontype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     */
    public void setPistontype_IsNotNull() { regPistontype(CK_ISNN, DOBJ); }

    protected void regPistontype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePistontype(), "PISTONTYPE"); }
    protected abstract ConditionValue xgetCValuePistontype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_Equal(String customercd) {
        doSetCustomercd_Equal(fRES(customercd));
    }

    protected void doSetCustomercd_Equal(String customercd) {
        regCustomercd(CK_EQ, customercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_NotEqual(String customercd) {
        doSetCustomercd_NotEqual(fRES(customercd));
    }

    protected void doSetCustomercd_NotEqual(String customercd) {
        regCustomercd(CK_NES, customercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_GreaterThan(String customercd) {
        regCustomercd(CK_GT, fRES(customercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_LessThan(String customercd) {
        regCustomercd(CK_LT, fRES(customercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_GreaterEqual(String customercd) {
        regCustomercd(CK_GE, fRES(customercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_LessEqual(String customercd) {
        regCustomercd(CK_LE, fRES(customercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercdList The collection of customercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_InScope(Collection<String> customercdList) {
        doSetCustomercd_InScope(customercdList);
    }

    protected void doSetCustomercd_InScope(Collection<String> customercdList) {
        regINS(CK_INS, cTL(customercdList), xgetCValueCustomercd(), "CUSTOMERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercdList The collection of customercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_NotInScope(Collection<String> customercdList) {
        doSetCustomercd_NotInScope(customercdList);
    }

    protected void doSetCustomercd_NotInScope(Collection<String> customercdList) {
        regINS(CK_NINS, cTL(customercdList), xgetCValueCustomercd(), "CUSTOMERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(255)} <br>
     * <pre>e.g. setCustomercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customercd The value of customercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomercd_LikeSearch(String customercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customercd), xgetCValueCustomercd(), "CUSTOMERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomercd_NotLikeSearch(String customercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customercd), xgetCValueCustomercd(), "CUSTOMERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_PrefixSearch(String customercd) {
        setCustomercd_LikeSearch(customercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     */
    public void setCustomercd_IsNull() { regCustomercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     */
    public void setCustomercd_IsNullOrEmpty() { regCustomercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     */
    public void setCustomercd_IsNotNull() { regCustomercd(CK_ISNN, DOBJ); }

    protected void regCustomercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomercd(), "CUSTOMERCD"); }
    protected abstract ConditionValue xgetCValueCustomercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_Equal(String directionnum) {
        doSetDirectionnum_Equal(fRES(directionnum));
    }

    protected void doSetDirectionnum_Equal(String directionnum) {
        regDirectionnum(CK_EQ, directionnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_NotEqual(String directionnum) {
        doSetDirectionnum_NotEqual(fRES(directionnum));
    }

    protected void doSetDirectionnum_NotEqual(String directionnum) {
        regDirectionnum(CK_NES, directionnum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_GreaterThan(String directionnum) {
        regDirectionnum(CK_GT, fRES(directionnum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_LessThan(String directionnum) {
        regDirectionnum(CK_LT, fRES(directionnum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_GreaterEqual(String directionnum) {
        regDirectionnum(CK_GE, fRES(directionnum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_LessEqual(String directionnum) {
        regDirectionnum(CK_LE, fRES(directionnum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnumList The collection of directionnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_InScope(Collection<String> directionnumList) {
        doSetDirectionnum_InScope(directionnumList);
    }

    protected void doSetDirectionnum_InScope(Collection<String> directionnumList) {
        regINS(CK_INS, cTL(directionnumList), xgetCValueDirectionnum(), "DIRECTIONNUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnumList The collection of directionnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_NotInScope(Collection<String> directionnumList) {
        doSetDirectionnum_NotInScope(directionnumList);
    }

    protected void doSetDirectionnum_NotInScope(Collection<String> directionnumList) {
        regINS(CK_NINS, cTL(directionnumList), xgetCValueDirectionnum(), "DIRECTIONNUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {varchar(255)} <br>
     * <pre>e.g. setDirectionnum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directionnum The value of directionnum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectionnum_LikeSearch(String directionnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directionnum), xgetCValueDirectionnum(), "DIRECTIONNUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectionnum_NotLikeSearch(String directionnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directionnum), xgetCValueDirectionnum(), "DIRECTIONNUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_PrefixSearch(String directionnum) {
        setDirectionnum_LikeSearch(directionnum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     */
    public void setDirectionnum_IsNull() { regDirectionnum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     */
    public void setDirectionnum_IsNullOrEmpty() { regDirectionnum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     */
    public void setDirectionnum_IsNotNull() { regDirectionnum(CK_ISNN, DOBJ); }

    protected void regDirectionnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectionnum(), "DIRECTIONNUM"); }
    protected abstract ConditionValue xgetCValueDirectionnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_Equal(String distwarehousecd) {
        doSetDistwarehousecd_Equal(fRES(distwarehousecd));
    }

    protected void doSetDistwarehousecd_Equal(String distwarehousecd) {
        regDistwarehousecd(CK_EQ, distwarehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_NotEqual(String distwarehousecd) {
        doSetDistwarehousecd_NotEqual(fRES(distwarehousecd));
    }

    protected void doSetDistwarehousecd_NotEqual(String distwarehousecd) {
        regDistwarehousecd(CK_NES, distwarehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_GreaterThan(String distwarehousecd) {
        regDistwarehousecd(CK_GT, fRES(distwarehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_LessThan(String distwarehousecd) {
        regDistwarehousecd(CK_LT, fRES(distwarehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_GreaterEqual(String distwarehousecd) {
        regDistwarehousecd(CK_GE, fRES(distwarehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_LessEqual(String distwarehousecd) {
        regDistwarehousecd(CK_LE, fRES(distwarehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecdList The collection of distwarehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_InScope(Collection<String> distwarehousecdList) {
        doSetDistwarehousecd_InScope(distwarehousecdList);
    }

    protected void doSetDistwarehousecd_InScope(Collection<String> distwarehousecdList) {
        regINS(CK_INS, cTL(distwarehousecdList), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecdList The collection of distwarehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_NotInScope(Collection<String> distwarehousecdList) {
        doSetDistwarehousecd_NotInScope(distwarehousecdList);
    }

    protected void doSetDistwarehousecd_NotInScope(Collection<String> distwarehousecdList) {
        regINS(CK_NINS, cTL(distwarehousecdList), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)} <br>
     * <pre>e.g. setDistwarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param distwarehousecd The value of distwarehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistwarehousecd_LikeSearch(String distwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(distwarehousecd), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistwarehousecd_NotLikeSearch(String distwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(distwarehousecd), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_PrefixSearch(String distwarehousecd) {
        setDistwarehousecd_LikeSearch(distwarehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     */
    public void setDistwarehousecd_IsNull() { regDistwarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     */
    public void setDistwarehousecd_IsNullOrEmpty() { regDistwarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     */
    public void setDistwarehousecd_IsNotNull() { regDistwarehousecd(CK_ISNN, DOBJ); }

    protected void regDistwarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistwarehousecd(), "DISTWAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueDistwarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {varchar(255)}
     * @param rcvkey The value of rcvkey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_Equal(String rcvkey) {
        doSetRcvkey_Equal(fRES(rcvkey));
    }

    protected void doSetRcvkey_Equal(String rcvkey) {
        regRcvkey(CK_EQ, rcvkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {varchar(255)}
     * @param rcvkey The value of rcvkey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_NotEqual(String rcvkey) {
        doSetRcvkey_NotEqual(fRES(rcvkey));
    }

    protected void doSetRcvkey_NotEqual(String rcvkey) {
        regRcvkey(CK_NES, rcvkey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {varchar(255)}
     * @param rcvkey The value of rcvkey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterThan(String rcvkey) {
        regRcvkey(CK_GT, fRES(rcvkey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {varchar(255)}
     * @param rcvkey The value of rcvkey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_LessThan(String rcvkey) {
        regRcvkey(CK_LT, fRES(rcvkey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {varchar(255)}
     * @param rcvkey The value of rcvkey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterEqual(String rcvkey) {
        regRcvkey(CK_GE, fRES(rcvkey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {varchar(255)}
     * @param rcvkey The value of rcvkey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_LessEqual(String rcvkey) {
        regRcvkey(CK_LE, fRES(rcvkey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {varchar(255)}
     * @param rcvkeyList The collection of rcvkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_InScope(Collection<String> rcvkeyList) {
        doSetRcvkey_InScope(rcvkeyList);
    }

    protected void doSetRcvkey_InScope(Collection<String> rcvkeyList) {
        regINS(CK_INS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {varchar(255)}
     * @param rcvkeyList The collection of rcvkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_NotInScope(Collection<String> rcvkeyList) {
        doSetRcvkey_NotInScope(rcvkeyList);
    }

    protected void doSetRcvkey_NotInScope(Collection<String> rcvkeyList) {
        regINS(CK_NINS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVKEY: {varchar(255)} <br>
     * <pre>e.g. setRcvkey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvkey The value of rcvkey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvkey_LikeSearch(String rcvkey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvkey), xgetCValueRcvkey(), "RCVKEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVKEY: {varchar(255)}
     * @param rcvkey The value of rcvkey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvkey_NotLikeSearch(String rcvkey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvkey), xgetCValueRcvkey(), "RCVKEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVKEY: {varchar(255)}
     * @param rcvkey The value of rcvkey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_PrefixSearch(String rcvkey) {
        setRcvkey_LikeSearch(rcvkey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVKEY: {varchar(255)}
     */
    public void setRcvkey_IsNull() { regRcvkey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCVKEY: {varchar(255)}
     */
    public void setRcvkey_IsNullOrEmpty() { regRcvkey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVKEY: {varchar(255)}
     */
    public void setRcvkey_IsNotNull() { regRcvkey(CK_ISNN, DOBJ); }

    protected void regRcvkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvkey(), "RCVKEY"); }
    protected abstract ConditionValue xgetCValueRcvkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(255)}
     * @param itemcdWh The value of itemcdWh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_Equal(String itemcdWh) {
        doSetItemcdWh_Equal(fRES(itemcdWh));
    }

    protected void doSetItemcdWh_Equal(String itemcdWh) {
        regItemcdWh(CK_EQ, itemcdWh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(255)}
     * @param itemcdWh The value of itemcdWh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_NotEqual(String itemcdWh) {
        doSetItemcdWh_NotEqual(fRES(itemcdWh));
    }

    protected void doSetItemcdWh_NotEqual(String itemcdWh) {
        regItemcdWh(CK_NES, itemcdWh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(255)}
     * @param itemcdWh The value of itemcdWh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_GreaterThan(String itemcdWh) {
        regItemcdWh(CK_GT, fRES(itemcdWh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(255)}
     * @param itemcdWh The value of itemcdWh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_LessThan(String itemcdWh) {
        regItemcdWh(CK_LT, fRES(itemcdWh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(255)}
     * @param itemcdWh The value of itemcdWh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_GreaterEqual(String itemcdWh) {
        regItemcdWh(CK_GE, fRES(itemcdWh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(255)}
     * @param itemcdWh The value of itemcdWh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_LessEqual(String itemcdWh) {
        regItemcdWh(CK_LE, fRES(itemcdWh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(255)}
     * @param itemcdWhList The collection of itemcdWh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_InScope(Collection<String> itemcdWhList) {
        doSetItemcdWh_InScope(itemcdWhList);
    }

    protected void doSetItemcdWh_InScope(Collection<String> itemcdWhList) {
        regINS(CK_INS, cTL(itemcdWhList), xgetCValueItemcdWh(), "ITEMCD_WH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(255)}
     * @param itemcdWhList The collection of itemcdWh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_NotInScope(Collection<String> itemcdWhList) {
        doSetItemcdWh_NotInScope(itemcdWhList);
    }

    protected void doSetItemcdWh_NotInScope(Collection<String> itemcdWhList) {
        regINS(CK_NINS, cTL(itemcdWhList), xgetCValueItemcdWh(), "ITEMCD_WH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(255)} <br>
     * <pre>e.g. setItemcdWh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdWh The value of itemcdWh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdWh_LikeSearch(String itemcdWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdWh), xgetCValueItemcdWh(), "ITEMCD_WH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(255)}
     * @param itemcdWh The value of itemcdWh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdWh_NotLikeSearch(String itemcdWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdWh), xgetCValueItemcdWh(), "ITEMCD_WH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(255)}
     * @param itemcdWh The value of itemcdWh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_PrefixSearch(String itemcdWh) {
        setItemcdWh_LikeSearch(itemcdWh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(255)}
     */
    public void setItemcdWh_IsNull() { regItemcdWh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(255)}
     */
    public void setItemcdWh_IsNullOrEmpty() { regItemcdWh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(255)}
     */
    public void setItemcdWh_IsNotNull() { regItemcdWh(CK_ISNN, DOBJ); }

    protected void regItemcdWh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdWh(), "ITEMCD_WH"); }
    protected abstract ConditionValue xgetCValueItemcdWh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(255)}
     * @param designcd The value of designcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_Equal(String designcd) {
        doSetDesigncd_Equal(fRES(designcd));
    }

    protected void doSetDesigncd_Equal(String designcd) {
        regDesigncd(CK_EQ, designcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(255)}
     * @param designcd The value of designcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_NotEqual(String designcd) {
        doSetDesigncd_NotEqual(fRES(designcd));
    }

    protected void doSetDesigncd_NotEqual(String designcd) {
        regDesigncd(CK_NES, designcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(255)}
     * @param designcd The value of designcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_GreaterThan(String designcd) {
        regDesigncd(CK_GT, fRES(designcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(255)}
     * @param designcd The value of designcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_LessThan(String designcd) {
        regDesigncd(CK_LT, fRES(designcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(255)}
     * @param designcd The value of designcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_GreaterEqual(String designcd) {
        regDesigncd(CK_GE, fRES(designcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(255)}
     * @param designcd The value of designcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_LessEqual(String designcd) {
        regDesigncd(CK_LE, fRES(designcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(255)}
     * @param designcdList The collection of designcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_InScope(Collection<String> designcdList) {
        doSetDesigncd_InScope(designcdList);
    }

    protected void doSetDesigncd_InScope(Collection<String> designcdList) {
        regINS(CK_INS, cTL(designcdList), xgetCValueDesigncd(), "DESIGNCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(255)}
     * @param designcdList The collection of designcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_NotInScope(Collection<String> designcdList) {
        doSetDesigncd_NotInScope(designcdList);
    }

    protected void doSetDesigncd_NotInScope(Collection<String> designcdList) {
        regINS(CK_NINS, cTL(designcdList), xgetCValueDesigncd(), "DESIGNCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(255)} <br>
     * <pre>e.g. setDesigncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcd The value of designcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncd_LikeSearch(String designcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcd), xgetCValueDesigncd(), "DESIGNCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(255)}
     * @param designcd The value of designcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncd_NotLikeSearch(String designcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcd), xgetCValueDesigncd(), "DESIGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(255)}
     * @param designcd The value of designcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_PrefixSearch(String designcd) {
        setDesigncd_LikeSearch(designcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(255)}
     */
    public void setDesigncd_IsNull() { regDesigncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(255)}
     */
    public void setDesigncd_IsNullOrEmpty() { regDesigncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(255)}
     */
    public void setDesigncd_IsNotNull() { regDesigncd(CK_ISNN, DOBJ); }

    protected void regDesigncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncd(), "DESIGNCD"); }
    protected abstract ConditionValue xgetCValueDesigncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_Equal(String invNum) {
        doSetInvNum_Equal(fRES(invNum));
    }

    protected void doSetInvNum_Equal(String invNum) {
        regInvNum(CK_EQ, invNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_NotEqual(String invNum) {
        doSetInvNum_NotEqual(fRES(invNum));
    }

    protected void doSetInvNum_NotEqual(String invNum) {
        regInvNum(CK_NES, invNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_GreaterThan(String invNum) {
        regInvNum(CK_GT, fRES(invNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_LessThan(String invNum) {
        regInvNum(CK_LT, fRES(invNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_GreaterEqual(String invNum) {
        regInvNum(CK_GE, fRES(invNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_LessEqual(String invNum) {
        regInvNum(CK_LE, fRES(invNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNumList The collection of invNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_InScope(Collection<String> invNumList) {
        doSetInvNum_InScope(invNumList);
    }

    protected void doSetInvNum_InScope(Collection<String> invNumList) {
        regINS(CK_INS, cTL(invNumList), xgetCValueInvNum(), "INV_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNumList The collection of invNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_NotInScope(Collection<String> invNumList) {
        doSetInvNum_NotInScope(invNumList);
    }

    protected void doSetInvNum_NotInScope(Collection<String> invNumList) {
        regINS(CK_NINS, cTL(invNumList), xgetCValueInvNum(), "INV_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INV_NUM: {varchar(255)} <br>
     * <pre>e.g. setInvNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invNum The value of invNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvNum_LikeSearch(String invNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invNum), xgetCValueInvNum(), "INV_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvNum_NotLikeSearch(String invNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invNum), xgetCValueInvNum(), "INV_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_PrefixSearch(String invNum) {
        setInvNum_LikeSearch(invNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     */
    public void setInvNum_IsNull() { regInvNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     */
    public void setInvNum_IsNullOrEmpty() { regInvNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     */
    public void setInvNum_IsNotNull() { regInvNum(CK_ISNN, DOBJ); }

    protected void regInvNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvNum(), "INV_NUM"); }
    protected abstract ConditionValue xgetCValueInvNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_Equal(String sortNum) {
        doSetSortNum_Equal(fRES(sortNum));
    }

    protected void doSetSortNum_Equal(String sortNum) {
        regSortNum(CK_EQ, sortNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_NotEqual(String sortNum) {
        doSetSortNum_NotEqual(fRES(sortNum));
    }

    protected void doSetSortNum_NotEqual(String sortNum) {
        regSortNum(CK_NES, sortNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_GreaterThan(String sortNum) {
        regSortNum(CK_GT, fRES(sortNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_LessThan(String sortNum) {
        regSortNum(CK_LT, fRES(sortNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_GreaterEqual(String sortNum) {
        regSortNum(CK_GE, fRES(sortNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_LessEqual(String sortNum) {
        regSortNum(CK_LE, fRES(sortNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNumList The collection of sortNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_InScope(Collection<String> sortNumList) {
        doSetSortNum_InScope(sortNumList);
    }

    protected void doSetSortNum_InScope(Collection<String> sortNumList) {
        regINS(CK_INS, cTL(sortNumList), xgetCValueSortNum(), "SORT_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNumList The collection of sortNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_NotInScope(Collection<String> sortNumList) {
        doSetSortNum_NotInScope(sortNumList);
    }

    protected void doSetSortNum_NotInScope(Collection<String> sortNumList) {
        regINS(CK_NINS, cTL(sortNumList), xgetCValueSortNum(), "SORT_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_NUM: {varchar(255)} <br>
     * <pre>e.g. setSortNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortNum The value of sortNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortNum_LikeSearch(String sortNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortNum), xgetCValueSortNum(), "SORT_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortNum_NotLikeSearch(String sortNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortNum), xgetCValueSortNum(), "SORT_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_PrefixSearch(String sortNum) {
        setSortNum_LikeSearch(sortNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     */
    public void setSortNum_IsNull() { regSortNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     */
    public void setSortNum_IsNullOrEmpty() { regSortNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     */
    public void setSortNum_IsNotNull() { regSortNum(CK_ISNN, DOBJ); }

    protected void regSortNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortNum(), "SORT_NUM"); }
    protected abstract ConditionValue xgetCValueSortNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_Equal(String adoptNum) {
        doSetAdoptNum_Equal(fRES(adoptNum));
    }

    protected void doSetAdoptNum_Equal(String adoptNum) {
        regAdoptNum(CK_EQ, adoptNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_NotEqual(String adoptNum) {
        doSetAdoptNum_NotEqual(fRES(adoptNum));
    }

    protected void doSetAdoptNum_NotEqual(String adoptNum) {
        regAdoptNum(CK_NES, adoptNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_GreaterThan(String adoptNum) {
        regAdoptNum(CK_GT, fRES(adoptNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_LessThan(String adoptNum) {
        regAdoptNum(CK_LT, fRES(adoptNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_GreaterEqual(String adoptNum) {
        regAdoptNum(CK_GE, fRES(adoptNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_LessEqual(String adoptNum) {
        regAdoptNum(CK_LE, fRES(adoptNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNumList The collection of adoptNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_InScope(Collection<String> adoptNumList) {
        doSetAdoptNum_InScope(adoptNumList);
    }

    protected void doSetAdoptNum_InScope(Collection<String> adoptNumList) {
        regINS(CK_INS, cTL(adoptNumList), xgetCValueAdoptNum(), "ADOPT_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNumList The collection of adoptNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_NotInScope(Collection<String> adoptNumList) {
        doSetAdoptNum_NotInScope(adoptNumList);
    }

    protected void doSetAdoptNum_NotInScope(Collection<String> adoptNumList) {
        regINS(CK_NINS, cTL(adoptNumList), xgetCValueAdoptNum(), "ADOPT_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADOPT_NUM: {varchar(255)} <br>
     * <pre>e.g. setAdoptNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param adoptNum The value of adoptNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAdoptNum_LikeSearch(String adoptNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(adoptNum), xgetCValueAdoptNum(), "ADOPT_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAdoptNum_NotLikeSearch(String adoptNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(adoptNum), xgetCValueAdoptNum(), "ADOPT_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_PrefixSearch(String adoptNum) {
        setAdoptNum_LikeSearch(adoptNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     */
    public void setAdoptNum_IsNull() { regAdoptNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     */
    public void setAdoptNum_IsNullOrEmpty() { regAdoptNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     */
    public void setAdoptNum_IsNotNull() { regAdoptNum(CK_ISNN, DOBJ); }

    protected void regAdoptNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdoptNum(), "ADOPT_NUM"); }
    protected abstract ConditionValue xgetCValueAdoptNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(255)}
     * @param dtExtdata2 The value of dtExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_Equal(String dtExtdata2) {
        doSetDtExtdata2_Equal(fRES(dtExtdata2));
    }

    protected void doSetDtExtdata2_Equal(String dtExtdata2) {
        regDtExtdata2(CK_EQ, dtExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(255)}
     * @param dtExtdata2 The value of dtExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_NotEqual(String dtExtdata2) {
        doSetDtExtdata2_NotEqual(fRES(dtExtdata2));
    }

    protected void doSetDtExtdata2_NotEqual(String dtExtdata2) {
        regDtExtdata2(CK_NES, dtExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(255)}
     * @param dtExtdata2 The value of dtExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_GreaterThan(String dtExtdata2) {
        regDtExtdata2(CK_GT, fRES(dtExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(255)}
     * @param dtExtdata2 The value of dtExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_LessThan(String dtExtdata2) {
        regDtExtdata2(CK_LT, fRES(dtExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(255)}
     * @param dtExtdata2 The value of dtExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_GreaterEqual(String dtExtdata2) {
        regDtExtdata2(CK_GE, fRES(dtExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(255)}
     * @param dtExtdata2 The value of dtExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_LessEqual(String dtExtdata2) {
        regDtExtdata2(CK_LE, fRES(dtExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(255)}
     * @param dtExtdata2List The collection of dtExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_InScope(Collection<String> dtExtdata2List) {
        doSetDtExtdata2_InScope(dtExtdata2List);
    }

    protected void doSetDtExtdata2_InScope(Collection<String> dtExtdata2List) {
        regINS(CK_INS, cTL(dtExtdata2List), xgetCValueDtExtdata2(), "DT_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(255)}
     * @param dtExtdata2List The collection of dtExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_NotInScope(Collection<String> dtExtdata2List) {
        doSetDtExtdata2_NotInScope(dtExtdata2List);
    }

    protected void doSetDtExtdata2_NotInScope(Collection<String> dtExtdata2List) {
        regINS(CK_NINS, cTL(dtExtdata2List), xgetCValueDtExtdata2(), "DT_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(255)} <br>
     * <pre>e.g. setDtExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata2 The value of dtExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata2_LikeSearch(String dtExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata2), xgetCValueDtExtdata2(), "DT_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(255)}
     * @param dtExtdata2 The value of dtExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata2_NotLikeSearch(String dtExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata2), xgetCValueDtExtdata2(), "DT_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(255)}
     * @param dtExtdata2 The value of dtExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_PrefixSearch(String dtExtdata2) {
        setDtExtdata2_LikeSearch(dtExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(255)}
     */
    public void setDtExtdata2_IsNull() { regDtExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(255)}
     */
    public void setDtExtdata2_IsNullOrEmpty() { regDtExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(255)}
     */
    public void setDtExtdata2_IsNotNull() { regDtExtdata2(CK_ISNN, DOBJ); }

    protected void regDtExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata2(), "DT_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueDtExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(255)}
     * @param reservearea The value of reservearea as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_Equal(String reservearea) {
        doSetReservearea_Equal(fRES(reservearea));
    }

    protected void doSetReservearea_Equal(String reservearea) {
        regReservearea(CK_EQ, reservearea);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(255)}
     * @param reservearea The value of reservearea as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_NotEqual(String reservearea) {
        doSetReservearea_NotEqual(fRES(reservearea));
    }

    protected void doSetReservearea_NotEqual(String reservearea) {
        regReservearea(CK_NES, reservearea);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(255)}
     * @param reservearea The value of reservearea as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_GreaterThan(String reservearea) {
        regReservearea(CK_GT, fRES(reservearea));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(255)}
     * @param reservearea The value of reservearea as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_LessThan(String reservearea) {
        regReservearea(CK_LT, fRES(reservearea));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(255)}
     * @param reservearea The value of reservearea as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_GreaterEqual(String reservearea) {
        regReservearea(CK_GE, fRES(reservearea));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(255)}
     * @param reservearea The value of reservearea as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_LessEqual(String reservearea) {
        regReservearea(CK_LE, fRES(reservearea));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESERVEAREA: {varchar(255)}
     * @param reserveareaList The collection of reservearea as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_InScope(Collection<String> reserveareaList) {
        doSetReservearea_InScope(reserveareaList);
    }

    protected void doSetReservearea_InScope(Collection<String> reserveareaList) {
        regINS(CK_INS, cTL(reserveareaList), xgetCValueReservearea(), "RESERVEAREA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESERVEAREA: {varchar(255)}
     * @param reserveareaList The collection of reservearea as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_NotInScope(Collection<String> reserveareaList) {
        doSetReservearea_NotInScope(reserveareaList);
    }

    protected void doSetReservearea_NotInScope(Collection<String> reserveareaList) {
        regINS(CK_NINS, cTL(reserveareaList), xgetCValueReservearea(), "RESERVEAREA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVEAREA: {varchar(255)} <br>
     * <pre>e.g. setReservearea_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reservearea The value of reservearea as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReservearea_LikeSearch(String reservearea, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reservearea), xgetCValueReservearea(), "RESERVEAREA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVEAREA: {varchar(255)}
     * @param reservearea The value of reservearea as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReservearea_NotLikeSearch(String reservearea, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reservearea), xgetCValueReservearea(), "RESERVEAREA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESERVEAREA: {varchar(255)}
     * @param reservearea The value of reservearea as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReservearea_PrefixSearch(String reservearea) {
        setReservearea_LikeSearch(reservearea, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(255)}
     */
    public void setReservearea_IsNull() { regReservearea(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(255)}
     */
    public void setReservearea_IsNullOrEmpty() { regReservearea(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESERVEAREA: {varchar(255)}
     */
    public void setReservearea_IsNotNull() { regReservearea(CK_ISNN, DOBJ); }

    protected void regReservearea(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReservearea(), "RESERVEAREA"); }
    protected abstract ConditionValue xgetCValueReservearea();

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
    public HpSLCFunction<EProductTrackingDomesCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EProductTrackingDomesCB.class);
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
    public HpSLCFunction<EProductTrackingDomesCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EProductTrackingDomesCB.class);
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
    public HpSLCFunction<EProductTrackingDomesCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EProductTrackingDomesCB.class);
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
    public HpSLCFunction<EProductTrackingDomesCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EProductTrackingDomesCB.class);
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
    public HpSLCFunction<EProductTrackingDomesCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EProductTrackingDomesCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EProductTrackingDomesCB&gt;() {
     *     public void query(EProductTrackingDomesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EProductTrackingDomesCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EProductTrackingDomesCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductTrackingDomesCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EProductTrackingDomesCQ sq);

    protected EProductTrackingDomesCB xcreateScalarConditionCB() {
        EProductTrackingDomesCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EProductTrackingDomesCB xcreateScalarConditionPartitionByCB() {
        EProductTrackingDomesCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EProductTrackingDomesCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductTrackingDomesCB cb = new EProductTrackingDomesCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRODUCT_TRACKING_DOMES_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EProductTrackingDomesCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EProductTrackingDomesCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EProductTrackingDomesCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductTrackingDomesCB cb = new EProductTrackingDomesCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_TRACKING_DOMES_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EProductTrackingDomesCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EProductTrackingDomesCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EProductTrackingDomesCB cb = new EProductTrackingDomesCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EProductTrackingDomesCQ sq);

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
    protected EProductTrackingDomesCB newMyCB() {
        return new EProductTrackingDomesCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EProductTrackingDomesCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

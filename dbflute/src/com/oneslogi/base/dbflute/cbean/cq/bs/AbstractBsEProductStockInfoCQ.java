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
 * The abstract condition-query of E_PRODUCT_STOCK_INFO.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEProductStockInfoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEProductStockInfoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_PRODUCT_STOCK_INFO";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eProductStockInfoId The value of eProductStockInfoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEProductStockInfoId_Equal(Long eProductStockInfoId) {
        doSetEProductStockInfoId_Equal(eProductStockInfoId);
    }

    protected void doSetEProductStockInfoId_Equal(Long eProductStockInfoId) {
        regEProductStockInfoId(CK_EQ, eProductStockInfoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eProductStockInfoId The value of eProductStockInfoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEProductStockInfoId_NotEqual(Long eProductStockInfoId) {
        doSetEProductStockInfoId_NotEqual(eProductStockInfoId);
    }

    protected void doSetEProductStockInfoId_NotEqual(Long eProductStockInfoId) {
        regEProductStockInfoId(CK_NES, eProductStockInfoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eProductStockInfoId The value of eProductStockInfoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEProductStockInfoId_GreaterThan(Long eProductStockInfoId) {
        regEProductStockInfoId(CK_GT, eProductStockInfoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eProductStockInfoId The value of eProductStockInfoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEProductStockInfoId_LessThan(Long eProductStockInfoId) {
        regEProductStockInfoId(CK_LT, eProductStockInfoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eProductStockInfoId The value of eProductStockInfoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEProductStockInfoId_GreaterEqual(Long eProductStockInfoId) {
        regEProductStockInfoId(CK_GE, eProductStockInfoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eProductStockInfoId The value of eProductStockInfoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEProductStockInfoId_LessEqual(Long eProductStockInfoId) {
        regEProductStockInfoId(CK_LE, eProductStockInfoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of eProductStockInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of eProductStockInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEProductStockInfoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEProductStockInfoId(), "E_PRODUCT_STOCK_INFO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eProductStockInfoIdList The collection of eProductStockInfoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEProductStockInfoId_InScope(Collection<Long> eProductStockInfoIdList) {
        doSetEProductStockInfoId_InScope(eProductStockInfoIdList);
    }

    protected void doSetEProductStockInfoId_InScope(Collection<Long> eProductStockInfoIdList) {
        regINS(CK_INS, cTL(eProductStockInfoIdList), xgetCValueEProductStockInfoId(), "E_PRODUCT_STOCK_INFO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eProductStockInfoIdList The collection of eProductStockInfoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEProductStockInfoId_NotInScope(Collection<Long> eProductStockInfoIdList) {
        doSetEProductStockInfoId_NotInScope(eProductStockInfoIdList);
    }

    protected void doSetEProductStockInfoId_NotInScope(Collection<Long> eProductStockInfoIdList) {
        regINS(CK_NINS, cTL(eProductStockInfoIdList), xgetCValueEProductStockInfoId(), "E_PRODUCT_STOCK_INFO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setEProductStockInfoId_IsNull() { regEProductStockInfoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setEProductStockInfoId_IsNotNull() { regEProductStockInfoId(CK_ISNN, DOBJ); }

    protected void regEProductStockInfoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEProductStockInfoId(), "E_PRODUCT_STOCK_INFO_ID"); }
    protected abstract ConditionValue xgetCValueEProductStockInfoId();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_Equal(Long centerId) {
        doSetCenterId_Equal(centerId);
    }

    protected void doSetCenterId_Equal(Long centerId) {
        regCenterId(CK_EQ, centerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_NotEqual(Long centerId) {
        doSetCenterId_NotEqual(centerId);
    }

    protected void doSetCenterId_NotEqual(Long centerId) {
        regCenterId(CK_NES, centerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerIdList The collection of centerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_InScope(Collection<Long> centerIdList) {
        doSetCenterId_InScope(centerIdList);
    }

    protected void doSetCenterId_InScope(Collection<Long> centerIdList) {
        regINS(CK_INS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_Equal(Long clientId) {
        doSetClientId_Equal(clientId);
    }

    protected void doSetClientId_Equal(Long clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(Long clientId) {
        doSetClientId_NotEqual(clientId);
    }

    protected void doSetClientId_NotEqual(Long clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<Long> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<Long> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQ: {NotNull, bigint(19)}
     * @param seq The value of seq as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeq_Equal(Long seq) {
        doSetSeq_Equal(seq);
    }

    protected void doSetSeq_Equal(Long seq) {
        regSeq(CK_EQ, seq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQ: {NotNull, bigint(19)}
     * @param seq The value of seq as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeq_NotEqual(Long seq) {
        doSetSeq_NotEqual(seq);
    }

    protected void doSetSeq_NotEqual(Long seq) {
        regSeq(CK_NES, seq);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQ: {NotNull, bigint(19)}
     * @param seq The value of seq as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeq_GreaterThan(Long seq) {
        regSeq(CK_GT, seq);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQ: {NotNull, bigint(19)}
     * @param seq The value of seq as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeq_LessThan(Long seq) {
        regSeq(CK_LT, seq);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQ: {NotNull, bigint(19)}
     * @param seq The value of seq as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeq_GreaterEqual(Long seq) {
        regSeq(CK_GE, seq);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQ: {NotNull, bigint(19)}
     * @param seq The value of seq as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeq_LessEqual(Long seq) {
        regSeq(CK_LE, seq);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEQ: {NotNull, bigint(19)}
     * @param minNumber The min number of seq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of seq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSeq_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSeq(), "SEQ", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQ: {NotNull, bigint(19)}
     * @param seqList The collection of seq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeq_InScope(Collection<Long> seqList) {
        doSetSeq_InScope(seqList);
    }

    protected void doSetSeq_InScope(Collection<Long> seqList) {
        regINS(CK_INS, cTL(seqList), xgetCValueSeq(), "SEQ");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQ: {NotNull, bigint(19)}
     * @param seqList The collection of seq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeq_NotInScope(Collection<Long> seqList) {
        doSetSeq_NotInScope(seqList);
    }

    protected void doSetSeq_NotInScope(Collection<Long> seqList) {
        regINS(CK_NINS, cTL(seqList), xgetCValueSeq(), "SEQ");
    }

    protected void regSeq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeq(), "SEQ"); }
    protected abstract ConditionValue xgetCValueSeq();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IN_OUT_KBN: {NotNull, varchar(30)}
     * @param inOutKbn The value of inOutKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInOutKbn_Equal(String inOutKbn) {
        doSetInOutKbn_Equal(fRES(inOutKbn));
    }

    protected void doSetInOutKbn_Equal(String inOutKbn) {
        regInOutKbn(CK_EQ, inOutKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IN_OUT_KBN: {NotNull, varchar(30)}
     * @param inOutKbn The value of inOutKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInOutKbn_NotEqual(String inOutKbn) {
        doSetInOutKbn_NotEqual(fRES(inOutKbn));
    }

    protected void doSetInOutKbn_NotEqual(String inOutKbn) {
        regInOutKbn(CK_NES, inOutKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IN_OUT_KBN: {NotNull, varchar(30)}
     * @param inOutKbn The value of inOutKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInOutKbn_GreaterThan(String inOutKbn) {
        regInOutKbn(CK_GT, fRES(inOutKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IN_OUT_KBN: {NotNull, varchar(30)}
     * @param inOutKbn The value of inOutKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInOutKbn_LessThan(String inOutKbn) {
        regInOutKbn(CK_LT, fRES(inOutKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IN_OUT_KBN: {NotNull, varchar(30)}
     * @param inOutKbn The value of inOutKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInOutKbn_GreaterEqual(String inOutKbn) {
        regInOutKbn(CK_GE, fRES(inOutKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IN_OUT_KBN: {NotNull, varchar(30)}
     * @param inOutKbn The value of inOutKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInOutKbn_LessEqual(String inOutKbn) {
        regInOutKbn(CK_LE, fRES(inOutKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IN_OUT_KBN: {NotNull, varchar(30)}
     * @param inOutKbnList The collection of inOutKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInOutKbn_InScope(Collection<String> inOutKbnList) {
        doSetInOutKbn_InScope(inOutKbnList);
    }

    protected void doSetInOutKbn_InScope(Collection<String> inOutKbnList) {
        regINS(CK_INS, cTL(inOutKbnList), xgetCValueInOutKbn(), "IN_OUT_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IN_OUT_KBN: {NotNull, varchar(30)}
     * @param inOutKbnList The collection of inOutKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInOutKbn_NotInScope(Collection<String> inOutKbnList) {
        doSetInOutKbn_NotInScope(inOutKbnList);
    }

    protected void doSetInOutKbn_NotInScope(Collection<String> inOutKbnList) {
        regINS(CK_NINS, cTL(inOutKbnList), xgetCValueInOutKbn(), "IN_OUT_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IN_OUT_KBN: {NotNull, varchar(30)} <br>
     * <pre>e.g. setInOutKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inOutKbn The value of inOutKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInOutKbn_LikeSearch(String inOutKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inOutKbn), xgetCValueInOutKbn(), "IN_OUT_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IN_OUT_KBN: {NotNull, varchar(30)}
     * @param inOutKbn The value of inOutKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInOutKbn_NotLikeSearch(String inOutKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inOutKbn), xgetCValueInOutKbn(), "IN_OUT_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IN_OUT_KBN: {NotNull, varchar(30)}
     * @param inOutKbn The value of inOutKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInOutKbn_PrefixSearch(String inOutKbn) {
        setInOutKbn_LikeSearch(inOutKbn, xcLSOPPre());
    }

    protected void regInOutKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInOutKbn(), "IN_OUT_KBN"); }
    protected abstract ConditionValue xgetCValueInOutKbn();

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
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_Equal(String centerNm) {
        doSetCenterNm_Equal(fRES(centerNm));
    }

    protected void doSetCenterNm_Equal(String centerNm) {
        regCenterNm(CK_EQ, centerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_NotEqual(String centerNm) {
        doSetCenterNm_NotEqual(fRES(centerNm));
    }

    protected void doSetCenterNm_NotEqual(String centerNm) {
        regCenterNm(CK_NES, centerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_GreaterThan(String centerNm) {
        regCenterNm(CK_GT, fRES(centerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_LessThan(String centerNm) {
        regCenterNm(CK_LT, fRES(centerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_GreaterEqual(String centerNm) {
        regCenterNm(CK_GE, fRES(centerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_LessEqual(String centerNm) {
        regCenterNm(CK_LE, fRES(centerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNmList The collection of centerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_InScope(Collection<String> centerNmList) {
        doSetCenterNm_InScope(centerNmList);
    }

    protected void doSetCenterNm_InScope(Collection<String> centerNmList) {
        regINS(CK_INS, cTL(centerNmList), xgetCValueCenterNm(), "CENTER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNmList The collection of centerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_NotInScope(Collection<String> centerNmList) {
        doSetCenterNm_NotInScope(centerNmList);
    }

    protected void doSetCenterNm_NotInScope(Collection<String> centerNmList) {
        regINS(CK_NINS, cTL(centerNmList), xgetCValueCenterNm(), "CENTER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setCenterNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerNm The value of centerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterNm_LikeSearch(String centerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerNm), xgetCValueCenterNm(), "CENTER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterNm_NotLikeSearch(String centerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerNm), xgetCValueCenterNm(), "CENTER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @param centerNm The value of centerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_PrefixSearch(String centerNm) {
        setCenterNm_LikeSearch(centerNm, xcLSOPPre());
    }

    protected void regCenterNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterNm(), "CENTER_NM"); }
    protected abstract ConditionValue xgetCValueCenterNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTE_DATE: {NotNull, varchar(8)}
     * @param executeDate The value of executeDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecuteDate_Equal(String executeDate) {
        doSetExecuteDate_Equal(fRES(executeDate));
    }

    protected void doSetExecuteDate_Equal(String executeDate) {
        regExecuteDate(CK_EQ, executeDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTE_DATE: {NotNull, varchar(8)}
     * @param executeDate The value of executeDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecuteDate_NotEqual(String executeDate) {
        doSetExecuteDate_NotEqual(fRES(executeDate));
    }

    protected void doSetExecuteDate_NotEqual(String executeDate) {
        regExecuteDate(CK_NES, executeDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTE_DATE: {NotNull, varchar(8)}
     * @param executeDate The value of executeDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecuteDate_GreaterThan(String executeDate) {
        regExecuteDate(CK_GT, fRES(executeDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTE_DATE: {NotNull, varchar(8)}
     * @param executeDate The value of executeDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecuteDate_LessThan(String executeDate) {
        regExecuteDate(CK_LT, fRES(executeDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTE_DATE: {NotNull, varchar(8)}
     * @param executeDate The value of executeDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecuteDate_GreaterEqual(String executeDate) {
        regExecuteDate(CK_GE, fRES(executeDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTE_DATE: {NotNull, varchar(8)}
     * @param executeDate The value of executeDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecuteDate_LessEqual(String executeDate) {
        regExecuteDate(CK_LE, fRES(executeDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXECUTE_DATE: {NotNull, varchar(8)}
     * @param executeDateList The collection of executeDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecuteDate_InScope(Collection<String> executeDateList) {
        doSetExecuteDate_InScope(executeDateList);
    }

    protected void doSetExecuteDate_InScope(Collection<String> executeDateList) {
        regINS(CK_INS, cTL(executeDateList), xgetCValueExecuteDate(), "EXECUTE_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXECUTE_DATE: {NotNull, varchar(8)}
     * @param executeDateList The collection of executeDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecuteDate_NotInScope(Collection<String> executeDateList) {
        doSetExecuteDate_NotInScope(executeDateList);
    }

    protected void doSetExecuteDate_NotInScope(Collection<String> executeDateList) {
        regINS(CK_NINS, cTL(executeDateList), xgetCValueExecuteDate(), "EXECUTE_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXECUTE_DATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setExecuteDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param executeDate The value of executeDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExecuteDate_LikeSearch(String executeDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(executeDate), xgetCValueExecuteDate(), "EXECUTE_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXECUTE_DATE: {NotNull, varchar(8)}
     * @param executeDate The value of executeDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExecuteDate_NotLikeSearch(String executeDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(executeDate), xgetCValueExecuteDate(), "EXECUTE_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXECUTE_DATE: {NotNull, varchar(8)}
     * @param executeDate The value of executeDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecuteDate_PrefixSearch(String executeDate) {
        setExecuteDate_LikeSearch(executeDate, xcLSOPPre());
    }

    protected void regExecuteDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExecuteDate(), "EXECUTE_DATE"); }
    protected abstract ConditionValue xgetCValueExecuteDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)} <br>
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(60)}
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
     * PRODUCT_NM: {NotNull, varchar(60)}
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
     * PRODUCT_NM: {NotNull, varchar(60)}
     * @param productNm The value of productNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterThan(String productNm) {
        regProductNm(CK_GT, fRES(productNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(60)}
     * @param productNm The value of productNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessThan(String productNm) {
        regProductNm(CK_LT, fRES(productNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(60)}
     * @param productNm The value of productNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterEqual(String productNm) {
        regProductNm(CK_GE, fRES(productNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(60)}
     * @param productNm The value of productNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessEqual(String productNm) {
        regProductNm(CK_LE, fRES(productNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(60)}
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
     * PRODUCT_NM: {NotNull, varchar(60)}
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
     * PRODUCT_NM: {NotNull, varchar(60)} <br>
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
     * PRODUCT_NM: {NotNull, varchar(60)}
     * @param productNm The value of productNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNm_NotLikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(60)}
     * @param productNm The value of productNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_PrefixSearch(String productNm) {
        setProductNm_LikeSearch(productNm, xcLSOPPre());
    }

    protected void regProductNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductNm(), "PRODUCT_NM"); }
    protected abstract ConditionValue xgetCValueProductNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_LOCATION: {NotNull, varchar(30)}
     * @param stockLocation The value of stockLocation as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocation_Equal(String stockLocation) {
        doSetStockLocation_Equal(fRES(stockLocation));
    }

    protected void doSetStockLocation_Equal(String stockLocation) {
        regStockLocation(CK_EQ, stockLocation);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_LOCATION: {NotNull, varchar(30)}
     * @param stockLocation The value of stockLocation as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocation_NotEqual(String stockLocation) {
        doSetStockLocation_NotEqual(fRES(stockLocation));
    }

    protected void doSetStockLocation_NotEqual(String stockLocation) {
        regStockLocation(CK_NES, stockLocation);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_LOCATION: {NotNull, varchar(30)}
     * @param stockLocation The value of stockLocation as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocation_GreaterThan(String stockLocation) {
        regStockLocation(CK_GT, fRES(stockLocation));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_LOCATION: {NotNull, varchar(30)}
     * @param stockLocation The value of stockLocation as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocation_LessThan(String stockLocation) {
        regStockLocation(CK_LT, fRES(stockLocation));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_LOCATION: {NotNull, varchar(30)}
     * @param stockLocation The value of stockLocation as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocation_GreaterEqual(String stockLocation) {
        regStockLocation(CK_GE, fRES(stockLocation));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_LOCATION: {NotNull, varchar(30)}
     * @param stockLocation The value of stockLocation as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocation_LessEqual(String stockLocation) {
        regStockLocation(CK_LE, fRES(stockLocation));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_LOCATION: {NotNull, varchar(30)}
     * @param stockLocationList The collection of stockLocation as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocation_InScope(Collection<String> stockLocationList) {
        doSetStockLocation_InScope(stockLocationList);
    }

    protected void doSetStockLocation_InScope(Collection<String> stockLocationList) {
        regINS(CK_INS, cTL(stockLocationList), xgetCValueStockLocation(), "STOCK_LOCATION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_LOCATION: {NotNull, varchar(30)}
     * @param stockLocationList The collection of stockLocation as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocation_NotInScope(Collection<String> stockLocationList) {
        doSetStockLocation_NotInScope(stockLocationList);
    }

    protected void doSetStockLocation_NotInScope(Collection<String> stockLocationList) {
        regINS(CK_NINS, cTL(stockLocationList), xgetCValueStockLocation(), "STOCK_LOCATION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_LOCATION: {NotNull, varchar(30)} <br>
     * <pre>e.g. setStockLocation_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockLocation The value of stockLocation as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockLocation_LikeSearch(String stockLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockLocation), xgetCValueStockLocation(), "STOCK_LOCATION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_LOCATION: {NotNull, varchar(30)}
     * @param stockLocation The value of stockLocation as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockLocation_NotLikeSearch(String stockLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockLocation), xgetCValueStockLocation(), "STOCK_LOCATION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_LOCATION: {NotNull, varchar(30)}
     * @param stockLocation The value of stockLocation as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocation_PrefixSearch(String stockLocation) {
        setStockLocation_LikeSearch(stockLocation, xcLSOPPre());
    }

    protected void regStockLocation(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockLocation(), "STOCK_LOCATION"); }
    protected abstract ConditionValue xgetCValueStockLocation();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_LOCATION_NM: {NotNull, varchar(60)}
     * @param stockLocationNm The value of stockLocationNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocationNm_Equal(String stockLocationNm) {
        doSetStockLocationNm_Equal(fRES(stockLocationNm));
    }

    protected void doSetStockLocationNm_Equal(String stockLocationNm) {
        regStockLocationNm(CK_EQ, stockLocationNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_LOCATION_NM: {NotNull, varchar(60)}
     * @param stockLocationNm The value of stockLocationNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocationNm_NotEqual(String stockLocationNm) {
        doSetStockLocationNm_NotEqual(fRES(stockLocationNm));
    }

    protected void doSetStockLocationNm_NotEqual(String stockLocationNm) {
        regStockLocationNm(CK_NES, stockLocationNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_LOCATION_NM: {NotNull, varchar(60)}
     * @param stockLocationNm The value of stockLocationNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocationNm_GreaterThan(String stockLocationNm) {
        regStockLocationNm(CK_GT, fRES(stockLocationNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_LOCATION_NM: {NotNull, varchar(60)}
     * @param stockLocationNm The value of stockLocationNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocationNm_LessThan(String stockLocationNm) {
        regStockLocationNm(CK_LT, fRES(stockLocationNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_LOCATION_NM: {NotNull, varchar(60)}
     * @param stockLocationNm The value of stockLocationNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocationNm_GreaterEqual(String stockLocationNm) {
        regStockLocationNm(CK_GE, fRES(stockLocationNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_LOCATION_NM: {NotNull, varchar(60)}
     * @param stockLocationNm The value of stockLocationNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocationNm_LessEqual(String stockLocationNm) {
        regStockLocationNm(CK_LE, fRES(stockLocationNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_LOCATION_NM: {NotNull, varchar(60)}
     * @param stockLocationNmList The collection of stockLocationNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocationNm_InScope(Collection<String> stockLocationNmList) {
        doSetStockLocationNm_InScope(stockLocationNmList);
    }

    protected void doSetStockLocationNm_InScope(Collection<String> stockLocationNmList) {
        regINS(CK_INS, cTL(stockLocationNmList), xgetCValueStockLocationNm(), "STOCK_LOCATION_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_LOCATION_NM: {NotNull, varchar(60)}
     * @param stockLocationNmList The collection of stockLocationNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocationNm_NotInScope(Collection<String> stockLocationNmList) {
        doSetStockLocationNm_NotInScope(stockLocationNmList);
    }

    protected void doSetStockLocationNm_NotInScope(Collection<String> stockLocationNmList) {
        regINS(CK_NINS, cTL(stockLocationNmList), xgetCValueStockLocationNm(), "STOCK_LOCATION_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_LOCATION_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setStockLocationNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockLocationNm The value of stockLocationNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockLocationNm_LikeSearch(String stockLocationNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockLocationNm), xgetCValueStockLocationNm(), "STOCK_LOCATION_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_LOCATION_NM: {NotNull, varchar(60)}
     * @param stockLocationNm The value of stockLocationNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockLocationNm_NotLikeSearch(String stockLocationNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockLocationNm), xgetCValueStockLocationNm(), "STOCK_LOCATION_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_LOCATION_NM: {NotNull, varchar(60)}
     * @param stockLocationNm The value of stockLocationNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockLocationNm_PrefixSearch(String stockLocationNm) {
        setStockLocationNm_LikeSearch(stockLocationNm, xcLSOPPre());
    }

    protected void regStockLocationNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockLocationNm(), "STOCK_LOCATION_NM"); }
    protected abstract ConditionValue xgetCValueStockLocationNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_Equal(String manufactureDate) {
        doSetManufactureDate_Equal(fRES(manufactureDate));
    }

    protected void doSetManufactureDate_Equal(String manufactureDate) {
        regManufactureDate(CK_EQ, manufactureDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_NotEqual(String manufactureDate) {
        doSetManufactureDate_NotEqual(fRES(manufactureDate));
    }

    protected void doSetManufactureDate_NotEqual(String manufactureDate) {
        regManufactureDate(CK_NES, manufactureDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_GreaterThan(String manufactureDate) {
        regManufactureDate(CK_GT, fRES(manufactureDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_LessThan(String manufactureDate) {
        regManufactureDate(CK_LT, fRES(manufactureDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_GreaterEqual(String manufactureDate) {
        regManufactureDate(CK_GE, fRES(manufactureDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_LessEqual(String manufactureDate) {
        regManufactureDate(CK_LE, fRES(manufactureDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @param manufactureDateList The collection of manufactureDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_InScope(Collection<String> manufactureDateList) {
        doSetManufactureDate_InScope(manufactureDateList);
    }

    protected void doSetManufactureDate_InScope(Collection<String> manufactureDateList) {
        regINS(CK_INS, cTL(manufactureDateList), xgetCValueManufactureDate(), "MANUFACTURE_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @param manufactureDateList The collection of manufactureDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_NotInScope(Collection<String> manufactureDateList) {
        doSetManufactureDate_NotInScope(manufactureDateList);
    }

    protected void doSetManufactureDate_NotInScope(Collection<String> manufactureDateList) {
        regINS(CK_NINS, cTL(manufactureDateList), xgetCValueManufactureDate(), "MANUFACTURE_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setManufactureDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufactureDate The value of manufactureDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufactureDate_LikeSearch(String manufactureDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufactureDate), xgetCValueManufactureDate(), "MANUFACTURE_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufactureDate_NotLikeSearch(String manufactureDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufactureDate), xgetCValueManufactureDate(), "MANUFACTURE_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @param manufactureDate The value of manufactureDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureDate_PrefixSearch(String manufactureDate) {
        setManufactureDate_LikeSearch(manufactureDate, xcLSOPPre());
    }

    protected void regManufactureDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufactureDate(), "MANUFACTURE_DATE"); }
    protected abstract ConditionValue xgetCValueManufactureDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_KBN: {NotNull, varchar(30)}
     * @param designKbn The value of designKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignKbn_Equal(String designKbn) {
        doSetDesignKbn_Equal(fRES(designKbn));
    }

    protected void doSetDesignKbn_Equal(String designKbn) {
        regDesignKbn(CK_EQ, designKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_KBN: {NotNull, varchar(30)}
     * @param designKbn The value of designKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignKbn_NotEqual(String designKbn) {
        doSetDesignKbn_NotEqual(fRES(designKbn));
    }

    protected void doSetDesignKbn_NotEqual(String designKbn) {
        regDesignKbn(CK_NES, designKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_KBN: {NotNull, varchar(30)}
     * @param designKbn The value of designKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignKbn_GreaterThan(String designKbn) {
        regDesignKbn(CK_GT, fRES(designKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_KBN: {NotNull, varchar(30)}
     * @param designKbn The value of designKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignKbn_LessThan(String designKbn) {
        regDesignKbn(CK_LT, fRES(designKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_KBN: {NotNull, varchar(30)}
     * @param designKbn The value of designKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignKbn_GreaterEqual(String designKbn) {
        regDesignKbn(CK_GE, fRES(designKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_KBN: {NotNull, varchar(30)}
     * @param designKbn The value of designKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignKbn_LessEqual(String designKbn) {
        regDesignKbn(CK_LE, fRES(designKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_KBN: {NotNull, varchar(30)}
     * @param designKbnList The collection of designKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignKbn_InScope(Collection<String> designKbnList) {
        doSetDesignKbn_InScope(designKbnList);
    }

    protected void doSetDesignKbn_InScope(Collection<String> designKbnList) {
        regINS(CK_INS, cTL(designKbnList), xgetCValueDesignKbn(), "DESIGN_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_KBN: {NotNull, varchar(30)}
     * @param designKbnList The collection of designKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignKbn_NotInScope(Collection<String> designKbnList) {
        doSetDesignKbn_NotInScope(designKbnList);
    }

    protected void doSetDesignKbn_NotInScope(Collection<String> designKbnList) {
        regINS(CK_NINS, cTL(designKbnList), xgetCValueDesignKbn(), "DESIGN_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_KBN: {NotNull, varchar(30)} <br>
     * <pre>e.g. setDesignKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designKbn The value of designKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesignKbn_LikeSearch(String designKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designKbn), xgetCValueDesignKbn(), "DESIGN_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_KBN: {NotNull, varchar(30)}
     * @param designKbn The value of designKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesignKbn_NotLikeSearch(String designKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designKbn), xgetCValueDesignKbn(), "DESIGN_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_KBN: {NotNull, varchar(30)}
     * @param designKbn The value of designKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignKbn_PrefixSearch(String designKbn) {
        setDesignKbn_LikeSearch(designKbn, xcLSOPPre());
    }

    protected void regDesignKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesignKbn(), "DESIGN_KBN"); }
    protected abstract ConditionValue xgetCValueDesignKbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_Equal(String locationCd) {
        doSetLocationCd_Equal(fRES(locationCd));
    }

    protected void doSetLocationCd_Equal(String locationCd) {
        regLocationCd(CK_EQ, locationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotEqual(String locationCd) {
        doSetLocationCd_NotEqual(fRES(locationCd));
    }

    protected void doSetLocationCd_NotEqual(String locationCd) {
        regLocationCd(CK_NES, locationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterThan(String locationCd) {
        regLocationCd(CK_GT, fRES(locationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessThan(String locationCd) {
        regLocationCd(CK_LT, fRES(locationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterEqual(String locationCd) {
        regLocationCd(CK_GE, fRES(locationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessEqual(String locationCd) {
        regLocationCd(CK_LE, fRES(locationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCdList The collection of locationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_InScope(Collection<String> locationCdList) {
        doSetLocationCd_InScope(locationCdList);
    }

    protected void doSetLocationCd_InScope(Collection<String> locationCdList) {
        regINS(CK_INS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCdList The collection of locationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotInScope(Collection<String> locationCdList) {
        doSetLocationCd_NotInScope(locationCdList);
    }

    protected void doSetLocationCd_NotInScope(Collection<String> locationCdList) {
        regINS(CK_NINS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationCd The value of locationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationCd_LikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd_NotLikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {NotNull, varchar(30)}
     * @param locationCd The value of locationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        setLocationCd_LikeSearch(locationCd, xcLSOPPre());
    }

    protected void regLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd(), "LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueLocationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {NotNull, varchar(30)}
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
     * TRANSPORT_CD: {NotNull, varchar(30)}
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
     * TRANSPORT_CD: {NotNull, varchar(30)}
     * @param transportCd The value of transportCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_GreaterThan(String transportCd) {
        regTransportCd(CK_GT, fRES(transportCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {NotNull, varchar(30)}
     * @param transportCd The value of transportCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_LessThan(String transportCd) {
        regTransportCd(CK_LT, fRES(transportCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {NotNull, varchar(30)}
     * @param transportCd The value of transportCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_GreaterEqual(String transportCd) {
        regTransportCd(CK_GE, fRES(transportCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {NotNull, varchar(30)}
     * @param transportCd The value of transportCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_LessEqual(String transportCd) {
        regTransportCd(CK_LE, fRES(transportCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_CD: {NotNull, varchar(30)}
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
     * TRANSPORT_CD: {NotNull, varchar(30)}
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
     * TRANSPORT_CD: {NotNull, varchar(30)} <br>
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
     * TRANSPORT_CD: {NotNull, varchar(30)}
     * @param transportCd The value of transportCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransportCd_NotLikeSearch(String transportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transportCd), xgetCValueTransportCd(), "TRANSPORT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORT_CD: {NotNull, varchar(30)}
     * @param transportCd The value of transportCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_PrefixSearch(String transportCd) {
        setTransportCd_LikeSearch(transportCd, xcLSOPPre());
    }

    protected void regTransportCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportCd(), "TRANSPORT_CD"); }
    protected abstract ConditionValue xgetCValueTransportCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {NotNull, varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_Equal(String firmCarryNo) {
        doSetFirmCarryNo_Equal(fRES(firmCarryNo));
    }

    protected void doSetFirmCarryNo_Equal(String firmCarryNo) {
        regFirmCarryNo(CK_EQ, firmCarryNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {NotNull, varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_NotEqual(String firmCarryNo) {
        doSetFirmCarryNo_NotEqual(fRES(firmCarryNo));
    }

    protected void doSetFirmCarryNo_NotEqual(String firmCarryNo) {
        regFirmCarryNo(CK_NES, firmCarryNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {NotNull, varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_GreaterThan(String firmCarryNo) {
        regFirmCarryNo(CK_GT, fRES(firmCarryNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {NotNull, varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_LessThan(String firmCarryNo) {
        regFirmCarryNo(CK_LT, fRES(firmCarryNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {NotNull, varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_GreaterEqual(String firmCarryNo) {
        regFirmCarryNo(CK_GE, fRES(firmCarryNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRM_CARRY_NO: {NotNull, varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_LessEqual(String firmCarryNo) {
        regFirmCarryNo(CK_LE, fRES(firmCarryNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRM_CARRY_NO: {NotNull, varchar(30)}
     * @param firmCarryNoList The collection of firmCarryNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_InScope(Collection<String> firmCarryNoList) {
        doSetFirmCarryNo_InScope(firmCarryNoList);
    }

    protected void doSetFirmCarryNo_InScope(Collection<String> firmCarryNoList) {
        regINS(CK_INS, cTL(firmCarryNoList), xgetCValueFirmCarryNo(), "FIRM_CARRY_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRM_CARRY_NO: {NotNull, varchar(30)}
     * @param firmCarryNoList The collection of firmCarryNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_NotInScope(Collection<String> firmCarryNoList) {
        doSetFirmCarryNo_NotInScope(firmCarryNoList);
    }

    protected void doSetFirmCarryNo_NotInScope(Collection<String> firmCarryNoList) {
        regINS(CK_NINS, cTL(firmCarryNoList), xgetCValueFirmCarryNo(), "FIRM_CARRY_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRM_CARRY_NO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setFirmCarryNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firmCarryNo The value of firmCarryNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirmCarryNo_LikeSearch(String firmCarryNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firmCarryNo), xgetCValueFirmCarryNo(), "FIRM_CARRY_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRM_CARRY_NO: {NotNull, varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirmCarryNo_NotLikeSearch(String firmCarryNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firmCarryNo), xgetCValueFirmCarryNo(), "FIRM_CARRY_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRM_CARRY_NO: {NotNull, varchar(30)}
     * @param firmCarryNo The value of firmCarryNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmCarryNo_PrefixSearch(String firmCarryNo) {
        setFirmCarryNo_LikeSearch(firmCarryNo, xcLSOPPre());
    }

    protected void regFirmCarryNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirmCarryNo(), "FIRM_CARRY_NO"); }
    protected abstract ConditionValue xgetCValueFirmCarryNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {NotNull, varchar(30)}
     * @param sourceCd The value of sourceCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_Equal(String sourceCd) {
        doSetSourceCd_Equal(fRES(sourceCd));
    }

    protected void doSetSourceCd_Equal(String sourceCd) {
        regSourceCd(CK_EQ, sourceCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {NotNull, varchar(30)}
     * @param sourceCd The value of sourceCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_NotEqual(String sourceCd) {
        doSetSourceCd_NotEqual(fRES(sourceCd));
    }

    protected void doSetSourceCd_NotEqual(String sourceCd) {
        regSourceCd(CK_NES, sourceCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {NotNull, varchar(30)}
     * @param sourceCd The value of sourceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_GreaterThan(String sourceCd) {
        regSourceCd(CK_GT, fRES(sourceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {NotNull, varchar(30)}
     * @param sourceCd The value of sourceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_LessThan(String sourceCd) {
        regSourceCd(CK_LT, fRES(sourceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {NotNull, varchar(30)}
     * @param sourceCd The value of sourceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_GreaterEqual(String sourceCd) {
        regSourceCd(CK_GE, fRES(sourceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {NotNull, varchar(30)}
     * @param sourceCd The value of sourceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_LessEqual(String sourceCd) {
        regSourceCd(CK_LE, fRES(sourceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {NotNull, varchar(30)}
     * @param sourceCdList The collection of sourceCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_InScope(Collection<String> sourceCdList) {
        doSetSourceCd_InScope(sourceCdList);
    }

    protected void doSetSourceCd_InScope(Collection<String> sourceCdList) {
        regINS(CK_INS, cTL(sourceCdList), xgetCValueSourceCd(), "SOURCE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {NotNull, varchar(30)}
     * @param sourceCdList The collection of sourceCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_NotInScope(Collection<String> sourceCdList) {
        doSetSourceCd_NotInScope(sourceCdList);
    }

    protected void doSetSourceCd_NotInScope(Collection<String> sourceCdList) {
        regINS(CK_NINS, cTL(sourceCdList), xgetCValueSourceCd(), "SOURCE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSourceCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sourceCd The value of sourceCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourceCd_LikeSearch(String sourceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceCd), xgetCValueSourceCd(), "SOURCE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {NotNull, varchar(30)}
     * @param sourceCd The value of sourceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourceCd_NotLikeSearch(String sourceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceCd), xgetCValueSourceCd(), "SOURCE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {NotNull, varchar(30)}
     * @param sourceCd The value of sourceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_PrefixSearch(String sourceCd) {
        setSourceCd_LikeSearch(sourceCd, xcLSOPPre());
    }

    protected void regSourceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceCd(), "SOURCE_CD"); }
    protected abstract ConditionValue xgetCValueSourceCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NM: {NotNull, varchar(60)}
     * @param sourceNm The value of sourceNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_Equal(String sourceNm) {
        doSetSourceNm_Equal(fRES(sourceNm));
    }

    protected void doSetSourceNm_Equal(String sourceNm) {
        regSourceNm(CK_EQ, sourceNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NM: {NotNull, varchar(60)}
     * @param sourceNm The value of sourceNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_NotEqual(String sourceNm) {
        doSetSourceNm_NotEqual(fRES(sourceNm));
    }

    protected void doSetSourceNm_NotEqual(String sourceNm) {
        regSourceNm(CK_NES, sourceNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NM: {NotNull, varchar(60)}
     * @param sourceNm The value of sourceNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_GreaterThan(String sourceNm) {
        regSourceNm(CK_GT, fRES(sourceNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NM: {NotNull, varchar(60)}
     * @param sourceNm The value of sourceNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_LessThan(String sourceNm) {
        regSourceNm(CK_LT, fRES(sourceNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NM: {NotNull, varchar(60)}
     * @param sourceNm The value of sourceNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_GreaterEqual(String sourceNm) {
        regSourceNm(CK_GE, fRES(sourceNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NM: {NotNull, varchar(60)}
     * @param sourceNm The value of sourceNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_LessEqual(String sourceNm) {
        regSourceNm(CK_LE, fRES(sourceNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_NM: {NotNull, varchar(60)}
     * @param sourceNmList The collection of sourceNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_InScope(Collection<String> sourceNmList) {
        doSetSourceNm_InScope(sourceNmList);
    }

    protected void doSetSourceNm_InScope(Collection<String> sourceNmList) {
        regINS(CK_INS, cTL(sourceNmList), xgetCValueSourceNm(), "SOURCE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_NM: {NotNull, varchar(60)}
     * @param sourceNmList The collection of sourceNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_NotInScope(Collection<String> sourceNmList) {
        doSetSourceNm_NotInScope(sourceNmList);
    }

    protected void doSetSourceNm_NotInScope(Collection<String> sourceNmList) {
        regINS(CK_NINS, cTL(sourceNmList), xgetCValueSourceNm(), "SOURCE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setSourceNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sourceNm The value of sourceNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourceNm_LikeSearch(String sourceNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceNm), xgetCValueSourceNm(), "SOURCE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_NM: {NotNull, varchar(60)}
     * @param sourceNm The value of sourceNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourceNm_NotLikeSearch(String sourceNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceNm), xgetCValueSourceNm(), "SOURCE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_NM: {NotNull, varchar(60)}
     * @param sourceNm The value of sourceNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceNm_PrefixSearch(String sourceNm) {
        setSourceNm_LikeSearch(sourceNm, xcLSOPPre());
    }

    protected void regSourceNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceNm(), "SOURCE_NM"); }
    protected abstract ConditionValue xgetCValueSourceNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DATE: {NotNull, varchar(8)}
     * @param schDate The value of schDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_Equal(String schDate) {
        doSetSchDate_Equal(fRES(schDate));
    }

    protected void doSetSchDate_Equal(String schDate) {
        regSchDate(CK_EQ, schDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DATE: {NotNull, varchar(8)}
     * @param schDate The value of schDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_NotEqual(String schDate) {
        doSetSchDate_NotEqual(fRES(schDate));
    }

    protected void doSetSchDate_NotEqual(String schDate) {
        regSchDate(CK_NES, schDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DATE: {NotNull, varchar(8)}
     * @param schDate The value of schDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_GreaterThan(String schDate) {
        regSchDate(CK_GT, fRES(schDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DATE: {NotNull, varchar(8)}
     * @param schDate The value of schDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_LessThan(String schDate) {
        regSchDate(CK_LT, fRES(schDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DATE: {NotNull, varchar(8)}
     * @param schDate The value of schDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_GreaterEqual(String schDate) {
        regSchDate(CK_GE, fRES(schDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DATE: {NotNull, varchar(8)}
     * @param schDate The value of schDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_LessEqual(String schDate) {
        regSchDate(CK_LE, fRES(schDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCH_DATE: {NotNull, varchar(8)}
     * @param schDateList The collection of schDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_InScope(Collection<String> schDateList) {
        doSetSchDate_InScope(schDateList);
    }

    protected void doSetSchDate_InScope(Collection<String> schDateList) {
        regINS(CK_INS, cTL(schDateList), xgetCValueSchDate(), "SCH_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCH_DATE: {NotNull, varchar(8)}
     * @param schDateList The collection of schDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_NotInScope(Collection<String> schDateList) {
        doSetSchDate_NotInScope(schDateList);
    }

    protected void doSetSchDate_NotInScope(Collection<String> schDateList) {
        regINS(CK_NINS, cTL(schDateList), xgetCValueSchDate(), "SCH_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCH_DATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setSchDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param schDate The value of schDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSchDate_LikeSearch(String schDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(schDate), xgetCValueSchDate(), "SCH_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCH_DATE: {NotNull, varchar(8)}
     * @param schDate The value of schDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSchDate_NotLikeSearch(String schDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(schDate), xgetCValueSchDate(), "SCH_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCH_DATE: {NotNull, varchar(8)}
     * @param schDate The value of schDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_PrefixSearch(String schDate) {
        setSchDate_LikeSearch(schDate, xcLSOPPre());
    }

    protected void regSchDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchDate(), "SCH_DATE"); }
    protected abstract ConditionValue xgetCValueSchDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_DATE: {NotNull, varchar(14)}
     * @param rcvDate The value of rcvDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvDate_Equal(String rcvDate) {
        doSetRcvDate_Equal(fRES(rcvDate));
    }

    protected void doSetRcvDate_Equal(String rcvDate) {
        regRcvDate(CK_EQ, rcvDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_DATE: {NotNull, varchar(14)}
     * @param rcvDate The value of rcvDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvDate_NotEqual(String rcvDate) {
        doSetRcvDate_NotEqual(fRES(rcvDate));
    }

    protected void doSetRcvDate_NotEqual(String rcvDate) {
        regRcvDate(CK_NES, rcvDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_DATE: {NotNull, varchar(14)}
     * @param rcvDate The value of rcvDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvDate_GreaterThan(String rcvDate) {
        regRcvDate(CK_GT, fRES(rcvDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_DATE: {NotNull, varchar(14)}
     * @param rcvDate The value of rcvDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvDate_LessThan(String rcvDate) {
        regRcvDate(CK_LT, fRES(rcvDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_DATE: {NotNull, varchar(14)}
     * @param rcvDate The value of rcvDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvDate_GreaterEqual(String rcvDate) {
        regRcvDate(CK_GE, fRES(rcvDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_DATE: {NotNull, varchar(14)}
     * @param rcvDate The value of rcvDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvDate_LessEqual(String rcvDate) {
        regRcvDate(CK_LE, fRES(rcvDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCV_DATE: {NotNull, varchar(14)}
     * @param rcvDateList The collection of rcvDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvDate_InScope(Collection<String> rcvDateList) {
        doSetRcvDate_InScope(rcvDateList);
    }

    protected void doSetRcvDate_InScope(Collection<String> rcvDateList) {
        regINS(CK_INS, cTL(rcvDateList), xgetCValueRcvDate(), "RCV_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCV_DATE: {NotNull, varchar(14)}
     * @param rcvDateList The collection of rcvDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvDate_NotInScope(Collection<String> rcvDateList) {
        doSetRcvDate_NotInScope(rcvDateList);
    }

    protected void doSetRcvDate_NotInScope(Collection<String> rcvDateList) {
        regINS(CK_NINS, cTL(rcvDateList), xgetCValueRcvDate(), "RCV_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_DATE: {NotNull, varchar(14)} <br>
     * <pre>e.g. setRcvDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvDate The value of rcvDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvDate_LikeSearch(String rcvDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvDate), xgetCValueRcvDate(), "RCV_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_DATE: {NotNull, varchar(14)}
     * @param rcvDate The value of rcvDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvDate_NotLikeSearch(String rcvDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvDate), xgetCValueRcvDate(), "RCV_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_DATE: {NotNull, varchar(14)}
     * @param rcvDate The value of rcvDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvDate_PrefixSearch(String rcvDate) {
        setRcvDate_LikeSearch(rcvDate, xcLSOPPre());
    }

    protected void regRcvDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvDate(), "RCV_DATE"); }
    protected abstract ConditionValue xgetCValueRcvDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayTotalDiffQty The value of pTdayTotalDiffQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTdayTotalDiffQty_Equal(Long pTdayTotalDiffQty) {
        doSetPTdayTotalDiffQty_Equal(pTdayTotalDiffQty);
    }

    protected void doSetPTdayTotalDiffQty_Equal(Long pTdayTotalDiffQty) {
        regPTdayTotalDiffQty(CK_EQ, pTdayTotalDiffQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayTotalDiffQty The value of pTdayTotalDiffQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTdayTotalDiffQty_NotEqual(Long pTdayTotalDiffQty) {
        doSetPTdayTotalDiffQty_NotEqual(pTdayTotalDiffQty);
    }

    protected void doSetPTdayTotalDiffQty_NotEqual(Long pTdayTotalDiffQty) {
        regPTdayTotalDiffQty(CK_NES, pTdayTotalDiffQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayTotalDiffQty The value of pTdayTotalDiffQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTdayTotalDiffQty_GreaterThan(Long pTdayTotalDiffQty) {
        regPTdayTotalDiffQty(CK_GT, pTdayTotalDiffQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayTotalDiffQty The value of pTdayTotalDiffQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTdayTotalDiffQty_LessThan(Long pTdayTotalDiffQty) {
        regPTdayTotalDiffQty(CK_LT, pTdayTotalDiffQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayTotalDiffQty The value of pTdayTotalDiffQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTdayTotalDiffQty_GreaterEqual(Long pTdayTotalDiffQty) {
        regPTdayTotalDiffQty(CK_GE, pTdayTotalDiffQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayTotalDiffQty The value of pTdayTotalDiffQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTdayTotalDiffQty_LessEqual(Long pTdayTotalDiffQty) {
        regPTdayTotalDiffQty(CK_LE, pTdayTotalDiffQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param minNumber The min number of pTdayTotalDiffQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pTdayTotalDiffQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPTdayTotalDiffQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePTdayTotalDiffQty(), "P_TDAY_TOTAL_DIFF_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayTotalDiffQtyList The collection of pTdayTotalDiffQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPTdayTotalDiffQty_InScope(Collection<Long> pTdayTotalDiffQtyList) {
        doSetPTdayTotalDiffQty_InScope(pTdayTotalDiffQtyList);
    }

    protected void doSetPTdayTotalDiffQty_InScope(Collection<Long> pTdayTotalDiffQtyList) {
        regINS(CK_INS, cTL(pTdayTotalDiffQtyList), xgetCValuePTdayTotalDiffQty(), "P_TDAY_TOTAL_DIFF_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayTotalDiffQtyList The collection of pTdayTotalDiffQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPTdayTotalDiffQty_NotInScope(Collection<Long> pTdayTotalDiffQtyList) {
        doSetPTdayTotalDiffQty_NotInScope(pTdayTotalDiffQtyList);
    }

    protected void doSetPTdayTotalDiffQty_NotInScope(Collection<Long> pTdayTotalDiffQtyList) {
        regINS(CK_NINS, cTL(pTdayTotalDiffQtyList), xgetCValuePTdayTotalDiffQty(), "P_TDAY_TOTAL_DIFF_QTY");
    }

    protected void regPTdayTotalDiffQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePTdayTotalDiffQty(), "P_TDAY_TOTAL_DIFF_QTY"); }
    protected abstract ConditionValue xgetCValuePTdayTotalDiffQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {NotNull, bigint(19)}
     * @param pQty The value of pQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPQty_Equal(Long pQty) {
        doSetPQty_Equal(pQty);
    }

    protected void doSetPQty_Equal(Long pQty) {
        regPQty(CK_EQ, pQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {NotNull, bigint(19)}
     * @param pQty The value of pQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPQty_NotEqual(Long pQty) {
        doSetPQty_NotEqual(pQty);
    }

    protected void doSetPQty_NotEqual(Long pQty) {
        regPQty(CK_NES, pQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {NotNull, bigint(19)}
     * @param pQty The value of pQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPQty_GreaterThan(Long pQty) {
        regPQty(CK_GT, pQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {NotNull, bigint(19)}
     * @param pQty The value of pQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPQty_LessThan(Long pQty) {
        regPQty(CK_LT, pQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {NotNull, bigint(19)}
     * @param pQty The value of pQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPQty_GreaterEqual(Long pQty) {
        regPQty(CK_GE, pQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {NotNull, bigint(19)}
     * @param pQty The value of pQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPQty_LessEqual(Long pQty) {
        regPQty(CK_LE, pQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {NotNull, bigint(19)}
     * @param minNumber The min number of pQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePQty(), "P_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_QTY: {NotNull, bigint(19)}
     * @param pQtyList The collection of pQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPQty_InScope(Collection<Long> pQtyList) {
        doSetPQty_InScope(pQtyList);
    }

    protected void doSetPQty_InScope(Collection<Long> pQtyList) {
        regINS(CK_INS, cTL(pQtyList), xgetCValuePQty(), "P_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_QTY: {NotNull, bigint(19)}
     * @param pQtyList The collection of pQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPQty_NotInScope(Collection<Long> pQtyList) {
        doSetPQty_NotInScope(pQtyList);
    }

    protected void doSetPQty_NotInScope(Collection<Long> pQtyList) {
        regINS(CK_NINS, cTL(pQtyList), xgetCValuePQty(), "P_QTY");
    }

    protected void regPQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePQty(), "P_QTY"); }
    protected abstract ConditionValue xgetCValuePQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_INVENTORY_NUM: {NotNull, bigint(19)}
     * @param pInventoryNum The value of pInventoryNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPInventoryNum_Equal(Long pInventoryNum) {
        doSetPInventoryNum_Equal(pInventoryNum);
    }

    protected void doSetPInventoryNum_Equal(Long pInventoryNum) {
        regPInventoryNum(CK_EQ, pInventoryNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_INVENTORY_NUM: {NotNull, bigint(19)}
     * @param pInventoryNum The value of pInventoryNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPInventoryNum_NotEqual(Long pInventoryNum) {
        doSetPInventoryNum_NotEqual(pInventoryNum);
    }

    protected void doSetPInventoryNum_NotEqual(Long pInventoryNum) {
        regPInventoryNum(CK_NES, pInventoryNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_INVENTORY_NUM: {NotNull, bigint(19)}
     * @param pInventoryNum The value of pInventoryNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPInventoryNum_GreaterThan(Long pInventoryNum) {
        regPInventoryNum(CK_GT, pInventoryNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_INVENTORY_NUM: {NotNull, bigint(19)}
     * @param pInventoryNum The value of pInventoryNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPInventoryNum_LessThan(Long pInventoryNum) {
        regPInventoryNum(CK_LT, pInventoryNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_INVENTORY_NUM: {NotNull, bigint(19)}
     * @param pInventoryNum The value of pInventoryNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPInventoryNum_GreaterEqual(Long pInventoryNum) {
        regPInventoryNum(CK_GE, pInventoryNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_INVENTORY_NUM: {NotNull, bigint(19)}
     * @param pInventoryNum The value of pInventoryNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPInventoryNum_LessEqual(Long pInventoryNum) {
        regPInventoryNum(CK_LE, pInventoryNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_INVENTORY_NUM: {NotNull, bigint(19)}
     * @param minNumber The min number of pInventoryNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pInventoryNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPInventoryNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePInventoryNum(), "P_INVENTORY_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_INVENTORY_NUM: {NotNull, bigint(19)}
     * @param pInventoryNumList The collection of pInventoryNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPInventoryNum_InScope(Collection<Long> pInventoryNumList) {
        doSetPInventoryNum_InScope(pInventoryNumList);
    }

    protected void doSetPInventoryNum_InScope(Collection<Long> pInventoryNumList) {
        regINS(CK_INS, cTL(pInventoryNumList), xgetCValuePInventoryNum(), "P_INVENTORY_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_INVENTORY_NUM: {NotNull, bigint(19)}
     * @param pInventoryNumList The collection of pInventoryNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPInventoryNum_NotInScope(Collection<Long> pInventoryNumList) {
        doSetPInventoryNum_NotInScope(pInventoryNumList);
    }

    protected void doSetPInventoryNum_NotInScope(Collection<Long> pInventoryNumList) {
        regINS(CK_NINS, cTL(pInventoryNumList), xgetCValuePInventoryNum(), "P_INVENTORY_NUM");
    }

    protected void regPInventoryNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePInventoryNum(), "P_INVENTORY_NUM"); }
    protected abstract ConditionValue xgetCValuePInventoryNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pYdayTotalDiffQty The value of pYdayTotalDiffQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPYdayTotalDiffQty_Equal(Long pYdayTotalDiffQty) {
        doSetPYdayTotalDiffQty_Equal(pYdayTotalDiffQty);
    }

    protected void doSetPYdayTotalDiffQty_Equal(Long pYdayTotalDiffQty) {
        regPYdayTotalDiffQty(CK_EQ, pYdayTotalDiffQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pYdayTotalDiffQty The value of pYdayTotalDiffQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPYdayTotalDiffQty_NotEqual(Long pYdayTotalDiffQty) {
        doSetPYdayTotalDiffQty_NotEqual(pYdayTotalDiffQty);
    }

    protected void doSetPYdayTotalDiffQty_NotEqual(Long pYdayTotalDiffQty) {
        regPYdayTotalDiffQty(CK_NES, pYdayTotalDiffQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pYdayTotalDiffQty The value of pYdayTotalDiffQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPYdayTotalDiffQty_GreaterThan(Long pYdayTotalDiffQty) {
        regPYdayTotalDiffQty(CK_GT, pYdayTotalDiffQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pYdayTotalDiffQty The value of pYdayTotalDiffQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPYdayTotalDiffQty_LessThan(Long pYdayTotalDiffQty) {
        regPYdayTotalDiffQty(CK_LT, pYdayTotalDiffQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pYdayTotalDiffQty The value of pYdayTotalDiffQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPYdayTotalDiffQty_GreaterEqual(Long pYdayTotalDiffQty) {
        regPYdayTotalDiffQty(CK_GE, pYdayTotalDiffQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pYdayTotalDiffQty The value of pYdayTotalDiffQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPYdayTotalDiffQty_LessEqual(Long pYdayTotalDiffQty) {
        regPYdayTotalDiffQty(CK_LE, pYdayTotalDiffQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param minNumber The min number of pYdayTotalDiffQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pYdayTotalDiffQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPYdayTotalDiffQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePYdayTotalDiffQty(), "P_YDAY_TOTAL_DIFF_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pYdayTotalDiffQtyList The collection of pYdayTotalDiffQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPYdayTotalDiffQty_InScope(Collection<Long> pYdayTotalDiffQtyList) {
        doSetPYdayTotalDiffQty_InScope(pYdayTotalDiffQtyList);
    }

    protected void doSetPYdayTotalDiffQty_InScope(Collection<Long> pYdayTotalDiffQtyList) {
        regINS(CK_INS, cTL(pYdayTotalDiffQtyList), xgetCValuePYdayTotalDiffQty(), "P_YDAY_TOTAL_DIFF_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param pYdayTotalDiffQtyList The collection of pYdayTotalDiffQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPYdayTotalDiffQty_NotInScope(Collection<Long> pYdayTotalDiffQtyList) {
        doSetPYdayTotalDiffQty_NotInScope(pYdayTotalDiffQtyList);
    }

    protected void doSetPYdayTotalDiffQty_NotInScope(Collection<Long> pYdayTotalDiffQtyList) {
        regINS(CK_NINS, cTL(pYdayTotalDiffQtyList), xgetCValuePYdayTotalDiffQty(), "P_YDAY_TOTAL_DIFF_QTY");
    }

    protected void regPYdayTotalDiffQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePYdayTotalDiffQty(), "P_YDAY_TOTAL_DIFF_QTY"); }
    protected abstract ConditionValue xgetCValuePYdayTotalDiffQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayDiffQty The value of pTdayDiffQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTdayDiffQty_Equal(Long pTdayDiffQty) {
        doSetPTdayDiffQty_Equal(pTdayDiffQty);
    }

    protected void doSetPTdayDiffQty_Equal(Long pTdayDiffQty) {
        regPTdayDiffQty(CK_EQ, pTdayDiffQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayDiffQty The value of pTdayDiffQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTdayDiffQty_NotEqual(Long pTdayDiffQty) {
        doSetPTdayDiffQty_NotEqual(pTdayDiffQty);
    }

    protected void doSetPTdayDiffQty_NotEqual(Long pTdayDiffQty) {
        regPTdayDiffQty(CK_NES, pTdayDiffQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayDiffQty The value of pTdayDiffQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTdayDiffQty_GreaterThan(Long pTdayDiffQty) {
        regPTdayDiffQty(CK_GT, pTdayDiffQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayDiffQty The value of pTdayDiffQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTdayDiffQty_LessThan(Long pTdayDiffQty) {
        regPTdayDiffQty(CK_LT, pTdayDiffQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayDiffQty The value of pTdayDiffQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTdayDiffQty_GreaterEqual(Long pTdayDiffQty) {
        regPTdayDiffQty(CK_GE, pTdayDiffQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayDiffQty The value of pTdayDiffQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPTdayDiffQty_LessEqual(Long pTdayDiffQty) {
        regPTdayDiffQty(CK_LE, pTdayDiffQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param minNumber The min number of pTdayDiffQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pTdayDiffQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPTdayDiffQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePTdayDiffQty(), "P_TDAY_DIFF_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayDiffQtyList The collection of pTdayDiffQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPTdayDiffQty_InScope(Collection<Long> pTdayDiffQtyList) {
        doSetPTdayDiffQty_InScope(pTdayDiffQtyList);
    }

    protected void doSetPTdayDiffQty_InScope(Collection<Long> pTdayDiffQtyList) {
        regINS(CK_INS, cTL(pTdayDiffQtyList), xgetCValuePTdayDiffQty(), "P_TDAY_DIFF_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param pTdayDiffQtyList The collection of pTdayDiffQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPTdayDiffQty_NotInScope(Collection<Long> pTdayDiffQtyList) {
        doSetPTdayDiffQty_NotInScope(pTdayDiffQtyList);
    }

    protected void doSetPTdayDiffQty_NotInScope(Collection<Long> pTdayDiffQtyList) {
        regINS(CK_NINS, cTL(pTdayDiffQtyList), xgetCValuePTdayDiffQty(), "P_TDAY_DIFF_QTY");
    }

    protected void regPTdayDiffQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePTdayDiffQty(), "P_TDAY_DIFF_QTY"); }
    protected abstract ConditionValue xgetCValuePTdayDiffQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param slYdayTotalDiffQty The value of slYdayTotalDiffQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlYdayTotalDiffQty_Equal(Long slYdayTotalDiffQty) {
        doSetSlYdayTotalDiffQty_Equal(slYdayTotalDiffQty);
    }

    protected void doSetSlYdayTotalDiffQty_Equal(Long slYdayTotalDiffQty) {
        regSlYdayTotalDiffQty(CK_EQ, slYdayTotalDiffQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param slYdayTotalDiffQty The value of slYdayTotalDiffQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlYdayTotalDiffQty_NotEqual(Long slYdayTotalDiffQty) {
        doSetSlYdayTotalDiffQty_NotEqual(slYdayTotalDiffQty);
    }

    protected void doSetSlYdayTotalDiffQty_NotEqual(Long slYdayTotalDiffQty) {
        regSlYdayTotalDiffQty(CK_NES, slYdayTotalDiffQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param slYdayTotalDiffQty The value of slYdayTotalDiffQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlYdayTotalDiffQty_GreaterThan(Long slYdayTotalDiffQty) {
        regSlYdayTotalDiffQty(CK_GT, slYdayTotalDiffQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param slYdayTotalDiffQty The value of slYdayTotalDiffQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlYdayTotalDiffQty_LessThan(Long slYdayTotalDiffQty) {
        regSlYdayTotalDiffQty(CK_LT, slYdayTotalDiffQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param slYdayTotalDiffQty The value of slYdayTotalDiffQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlYdayTotalDiffQty_GreaterEqual(Long slYdayTotalDiffQty) {
        regSlYdayTotalDiffQty(CK_GE, slYdayTotalDiffQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param slYdayTotalDiffQty The value of slYdayTotalDiffQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlYdayTotalDiffQty_LessEqual(Long slYdayTotalDiffQty) {
        regSlYdayTotalDiffQty(CK_LE, slYdayTotalDiffQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param minNumber The min number of slYdayTotalDiffQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of slYdayTotalDiffQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSlYdayTotalDiffQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlYdayTotalDiffQty(), "SL_YDAY_TOTAL_DIFF_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param slYdayTotalDiffQtyList The collection of slYdayTotalDiffQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlYdayTotalDiffQty_InScope(Collection<Long> slYdayTotalDiffQtyList) {
        doSetSlYdayTotalDiffQty_InScope(slYdayTotalDiffQtyList);
    }

    protected void doSetSlYdayTotalDiffQty_InScope(Collection<Long> slYdayTotalDiffQtyList) {
        regINS(CK_INS, cTL(slYdayTotalDiffQtyList), xgetCValueSlYdayTotalDiffQty(), "SL_YDAY_TOTAL_DIFF_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @param slYdayTotalDiffQtyList The collection of slYdayTotalDiffQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlYdayTotalDiffQty_NotInScope(Collection<Long> slYdayTotalDiffQtyList) {
        doSetSlYdayTotalDiffQty_NotInScope(slYdayTotalDiffQtyList);
    }

    protected void doSetSlYdayTotalDiffQty_NotInScope(Collection<Long> slYdayTotalDiffQtyList) {
        regINS(CK_NINS, cTL(slYdayTotalDiffQtyList), xgetCValueSlYdayTotalDiffQty(), "SL_YDAY_TOTAL_DIFF_QTY");
    }

    protected void regSlYdayTotalDiffQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlYdayTotalDiffQty(), "SL_YDAY_TOTAL_DIFF_QTY"); }
    protected abstract ConditionValue xgetCValueSlYdayTotalDiffQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SL_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param slTdayDiffQty The value of slTdayDiffQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlTdayDiffQty_Equal(Long slTdayDiffQty) {
        doSetSlTdayDiffQty_Equal(slTdayDiffQty);
    }

    protected void doSetSlTdayDiffQty_Equal(Long slTdayDiffQty) {
        regSlTdayDiffQty(CK_EQ, slTdayDiffQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SL_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param slTdayDiffQty The value of slTdayDiffQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlTdayDiffQty_NotEqual(Long slTdayDiffQty) {
        doSetSlTdayDiffQty_NotEqual(slTdayDiffQty);
    }

    protected void doSetSlTdayDiffQty_NotEqual(Long slTdayDiffQty) {
        regSlTdayDiffQty(CK_NES, slTdayDiffQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SL_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param slTdayDiffQty The value of slTdayDiffQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlTdayDiffQty_GreaterThan(Long slTdayDiffQty) {
        regSlTdayDiffQty(CK_GT, slTdayDiffQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SL_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param slTdayDiffQty The value of slTdayDiffQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlTdayDiffQty_LessThan(Long slTdayDiffQty) {
        regSlTdayDiffQty(CK_LT, slTdayDiffQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SL_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param slTdayDiffQty The value of slTdayDiffQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlTdayDiffQty_GreaterEqual(Long slTdayDiffQty) {
        regSlTdayDiffQty(CK_GE, slTdayDiffQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SL_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param slTdayDiffQty The value of slTdayDiffQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlTdayDiffQty_LessEqual(Long slTdayDiffQty) {
        regSlTdayDiffQty(CK_LE, slTdayDiffQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SL_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param minNumber The min number of slTdayDiffQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of slTdayDiffQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSlTdayDiffQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlTdayDiffQty(), "SL_TDAY_DIFF_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SL_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param slTdayDiffQtyList The collection of slTdayDiffQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlTdayDiffQty_InScope(Collection<Long> slTdayDiffQtyList) {
        doSetSlTdayDiffQty_InScope(slTdayDiffQtyList);
    }

    protected void doSetSlTdayDiffQty_InScope(Collection<Long> slTdayDiffQtyList) {
        regINS(CK_INS, cTL(slTdayDiffQtyList), xgetCValueSlTdayDiffQty(), "SL_TDAY_DIFF_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SL_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @param slTdayDiffQtyList The collection of slTdayDiffQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlTdayDiffQty_NotInScope(Collection<Long> slTdayDiffQtyList) {
        doSetSlTdayDiffQty_NotInScope(slTdayDiffQtyList);
    }

    protected void doSetSlTdayDiffQty_NotInScope(Collection<Long> slTdayDiffQtyList) {
        regINS(CK_NINS, cTL(slTdayDiffQtyList), xgetCValueSlTdayDiffQty(), "SL_TDAY_DIFF_QTY");
    }

    protected void regSlTdayDiffQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlTdayDiffQty(), "SL_TDAY_DIFF_QTY"); }
    protected abstract ConditionValue xgetCValueSlTdayDiffQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qty The value of qty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_Equal(Long qty) {
        doSetQty_Equal(qty);
    }

    protected void doSetQty_Equal(Long qty) {
        regQty(CK_EQ, qty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qty The value of qty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_NotEqual(Long qty) {
        doSetQty_NotEqual(qty);
    }

    protected void doSetQty_NotEqual(Long qty) {
        regQty(CK_NES, qty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qty The value of qty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_GreaterThan(Long qty) {
        regQty(CK_GT, qty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qty The value of qty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_LessThan(Long qty) {
        regQty(CK_LT, qty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qty The value of qty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_GreaterEqual(Long qty) {
        regQty(CK_GE, qty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qty The value of qty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_LessEqual(Long qty) {
        regQty(CK_LE, qty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param minNumber The min number of qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty(), "QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qtyList The collection of qty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_InScope(Collection<Long> qtyList) {
        doSetQty_InScope(qtyList);
    }

    protected void doSetQty_InScope(Collection<Long> qtyList) {
        regINS(CK_INS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY: {NotNull, bigint(19)}
     * @param qtyList The collection of qty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_NotInScope(Collection<Long> qtyList) {
        doSetQty_NotInScope(qtyList);
    }

    protected void doSetQty_NotInScope(Collection<Long> qtyList) {
        regINS(CK_NINS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    protected void regQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty(), "QTY"); }
    protected abstract ConditionValue xgetCValueQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, bigint(19)}
     * @param inventoryNum The value of inventoryNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_Equal(Long inventoryNum) {
        doSetInventoryNum_Equal(inventoryNum);
    }

    protected void doSetInventoryNum_Equal(Long inventoryNum) {
        regInventoryNum(CK_EQ, inventoryNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, bigint(19)}
     * @param inventoryNum The value of inventoryNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_NotEqual(Long inventoryNum) {
        doSetInventoryNum_NotEqual(inventoryNum);
    }

    protected void doSetInventoryNum_NotEqual(Long inventoryNum) {
        regInventoryNum(CK_NES, inventoryNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, bigint(19)}
     * @param inventoryNum The value of inventoryNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_GreaterThan(Long inventoryNum) {
        regInventoryNum(CK_GT, inventoryNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, bigint(19)}
     * @param inventoryNum The value of inventoryNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_LessThan(Long inventoryNum) {
        regInventoryNum(CK_LT, inventoryNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, bigint(19)}
     * @param inventoryNum The value of inventoryNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_GreaterEqual(Long inventoryNum) {
        regInventoryNum(CK_GE, inventoryNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, bigint(19)}
     * @param inventoryNum The value of inventoryNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryNum_LessEqual(Long inventoryNum) {
        regInventoryNum(CK_LE, inventoryNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_NUM: {NotNull, bigint(19)}
     * @param minNumber The min number of inventoryNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryNum(), "INVENTORY_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_NUM: {NotNull, bigint(19)}
     * @param inventoryNumList The collection of inventoryNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryNum_InScope(Collection<Long> inventoryNumList) {
        doSetInventoryNum_InScope(inventoryNumList);
    }

    protected void doSetInventoryNum_InScope(Collection<Long> inventoryNumList) {
        regINS(CK_INS, cTL(inventoryNumList), xgetCValueInventoryNum(), "INVENTORY_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_NUM: {NotNull, bigint(19)}
     * @param inventoryNumList The collection of inventoryNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryNum_NotInScope(Collection<Long> inventoryNumList) {
        doSetInventoryNum_NotInScope(inventoryNumList);
    }

    protected void doSetInventoryNum_NotInScope(Collection<Long> inventoryNumList) {
        regINS(CK_NINS, cTL(inventoryNumList), xgetCValueInventoryNum(), "INVENTORY_NUM");
    }

    protected void regInventoryNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryNum(), "INVENTORY_NUM"); }
    protected abstract ConditionValue xgetCValueInventoryNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_USE4: {NotNull, varchar(30)}
     * @param userUse4 The value of userUse4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserUse4_Equal(String userUse4) {
        doSetUserUse4_Equal(fRES(userUse4));
    }

    protected void doSetUserUse4_Equal(String userUse4) {
        regUserUse4(CK_EQ, userUse4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_USE4: {NotNull, varchar(30)}
     * @param userUse4 The value of userUse4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserUse4_NotEqual(String userUse4) {
        doSetUserUse4_NotEqual(fRES(userUse4));
    }

    protected void doSetUserUse4_NotEqual(String userUse4) {
        regUserUse4(CK_NES, userUse4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_USE4: {NotNull, varchar(30)}
     * @param userUse4 The value of userUse4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserUse4_GreaterThan(String userUse4) {
        regUserUse4(CK_GT, fRES(userUse4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_USE4: {NotNull, varchar(30)}
     * @param userUse4 The value of userUse4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserUse4_LessThan(String userUse4) {
        regUserUse4(CK_LT, fRES(userUse4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_USE4: {NotNull, varchar(30)}
     * @param userUse4 The value of userUse4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserUse4_GreaterEqual(String userUse4) {
        regUserUse4(CK_GE, fRES(userUse4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_USE4: {NotNull, varchar(30)}
     * @param userUse4 The value of userUse4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserUse4_LessEqual(String userUse4) {
        regUserUse4(CK_LE, fRES(userUse4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_USE4: {NotNull, varchar(30)}
     * @param userUse4List The collection of userUse4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserUse4_InScope(Collection<String> userUse4List) {
        doSetUserUse4_InScope(userUse4List);
    }

    protected void doSetUserUse4_InScope(Collection<String> userUse4List) {
        regINS(CK_INS, cTL(userUse4List), xgetCValueUserUse4(), "USER_USE4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_USE4: {NotNull, varchar(30)}
     * @param userUse4List The collection of userUse4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserUse4_NotInScope(Collection<String> userUse4List) {
        doSetUserUse4_NotInScope(userUse4List);
    }

    protected void doSetUserUse4_NotInScope(Collection<String> userUse4List) {
        regINS(CK_NINS, cTL(userUse4List), xgetCValueUserUse4(), "USER_USE4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_USE4: {NotNull, varchar(30)} <br>
     * <pre>e.g. setUserUse4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userUse4 The value of userUse4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserUse4_LikeSearch(String userUse4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userUse4), xgetCValueUserUse4(), "USER_USE4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_USE4: {NotNull, varchar(30)}
     * @param userUse4 The value of userUse4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserUse4_NotLikeSearch(String userUse4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userUse4), xgetCValueUserUse4(), "USER_USE4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_USE4: {NotNull, varchar(30)}
     * @param userUse4 The value of userUse4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserUse4_PrefixSearch(String userUse4) {
        setUserUse4_LikeSearch(userUse4, xcLSOPPre());
    }

    protected void regUserUse4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserUse4(), "USER_USE4"); }
    protected abstract ConditionValue xgetCValueUserUse4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_ATRB1_TITLE: {NotNull, varchar(60)}
     * @param lotAtrb1Title The value of lotAtrb1Title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotAtrb1Title_Equal(String lotAtrb1Title) {
        doSetLotAtrb1Title_Equal(fRES(lotAtrb1Title));
    }

    protected void doSetLotAtrb1Title_Equal(String lotAtrb1Title) {
        regLotAtrb1Title(CK_EQ, lotAtrb1Title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_ATRB1_TITLE: {NotNull, varchar(60)}
     * @param lotAtrb1Title The value of lotAtrb1Title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotAtrb1Title_NotEqual(String lotAtrb1Title) {
        doSetLotAtrb1Title_NotEqual(fRES(lotAtrb1Title));
    }

    protected void doSetLotAtrb1Title_NotEqual(String lotAtrb1Title) {
        regLotAtrb1Title(CK_NES, lotAtrb1Title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_ATRB1_TITLE: {NotNull, varchar(60)}
     * @param lotAtrb1Title The value of lotAtrb1Title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotAtrb1Title_GreaterThan(String lotAtrb1Title) {
        regLotAtrb1Title(CK_GT, fRES(lotAtrb1Title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_ATRB1_TITLE: {NotNull, varchar(60)}
     * @param lotAtrb1Title The value of lotAtrb1Title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotAtrb1Title_LessThan(String lotAtrb1Title) {
        regLotAtrb1Title(CK_LT, fRES(lotAtrb1Title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_ATRB1_TITLE: {NotNull, varchar(60)}
     * @param lotAtrb1Title The value of lotAtrb1Title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotAtrb1Title_GreaterEqual(String lotAtrb1Title) {
        regLotAtrb1Title(CK_GE, fRES(lotAtrb1Title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_ATRB1_TITLE: {NotNull, varchar(60)}
     * @param lotAtrb1Title The value of lotAtrb1Title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotAtrb1Title_LessEqual(String lotAtrb1Title) {
        regLotAtrb1Title(CK_LE, fRES(lotAtrb1Title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_ATRB1_TITLE: {NotNull, varchar(60)}
     * @param lotAtrb1TitleList The collection of lotAtrb1Title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotAtrb1Title_InScope(Collection<String> lotAtrb1TitleList) {
        doSetLotAtrb1Title_InScope(lotAtrb1TitleList);
    }

    protected void doSetLotAtrb1Title_InScope(Collection<String> lotAtrb1TitleList) {
        regINS(CK_INS, cTL(lotAtrb1TitleList), xgetCValueLotAtrb1Title(), "LOT_ATRB1_TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_ATRB1_TITLE: {NotNull, varchar(60)}
     * @param lotAtrb1TitleList The collection of lotAtrb1Title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotAtrb1Title_NotInScope(Collection<String> lotAtrb1TitleList) {
        doSetLotAtrb1Title_NotInScope(lotAtrb1TitleList);
    }

    protected void doSetLotAtrb1Title_NotInScope(Collection<String> lotAtrb1TitleList) {
        regINS(CK_NINS, cTL(lotAtrb1TitleList), xgetCValueLotAtrb1Title(), "LOT_ATRB1_TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_ATRB1_TITLE: {NotNull, varchar(60)} <br>
     * <pre>e.g. setLotAtrb1Title_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotAtrb1Title The value of lotAtrb1Title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotAtrb1Title_LikeSearch(String lotAtrb1Title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotAtrb1Title), xgetCValueLotAtrb1Title(), "LOT_ATRB1_TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_ATRB1_TITLE: {NotNull, varchar(60)}
     * @param lotAtrb1Title The value of lotAtrb1Title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotAtrb1Title_NotLikeSearch(String lotAtrb1Title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotAtrb1Title), xgetCValueLotAtrb1Title(), "LOT_ATRB1_TITLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_ATRB1_TITLE: {NotNull, varchar(60)}
     * @param lotAtrb1Title The value of lotAtrb1Title as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotAtrb1Title_PrefixSearch(String lotAtrb1Title) {
        setLotAtrb1Title_LikeSearch(lotAtrb1Title, xcLSOPPre());
    }

    protected void regLotAtrb1Title(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotAtrb1Title(), "LOT_ATRB1_TITLE"); }
    protected abstract ConditionValue xgetCValueLotAtrb1Title();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NUM4: {NotNull, varchar(30)}
     * @param userNum4 The value of userNum4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum4_Equal(String userNum4) {
        doSetUserNum4_Equal(fRES(userNum4));
    }

    protected void doSetUserNum4_Equal(String userNum4) {
        regUserNum4(CK_EQ, userNum4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NUM4: {NotNull, varchar(30)}
     * @param userNum4 The value of userNum4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum4_NotEqual(String userNum4) {
        doSetUserNum4_NotEqual(fRES(userNum4));
    }

    protected void doSetUserNum4_NotEqual(String userNum4) {
        regUserNum4(CK_NES, userNum4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NUM4: {NotNull, varchar(30)}
     * @param userNum4 The value of userNum4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum4_GreaterThan(String userNum4) {
        regUserNum4(CK_GT, fRES(userNum4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NUM4: {NotNull, varchar(30)}
     * @param userNum4 The value of userNum4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum4_LessThan(String userNum4) {
        regUserNum4(CK_LT, fRES(userNum4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NUM4: {NotNull, varchar(30)}
     * @param userNum4 The value of userNum4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum4_GreaterEqual(String userNum4) {
        regUserNum4(CK_GE, fRES(userNum4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NUM4: {NotNull, varchar(30)}
     * @param userNum4 The value of userNum4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum4_LessEqual(String userNum4) {
        regUserNum4(CK_LE, fRES(userNum4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_NUM4: {NotNull, varchar(30)}
     * @param userNum4List The collection of userNum4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum4_InScope(Collection<String> userNum4List) {
        doSetUserNum4_InScope(userNum4List);
    }

    protected void doSetUserNum4_InScope(Collection<String> userNum4List) {
        regINS(CK_INS, cTL(userNum4List), xgetCValueUserNum4(), "USER_NUM4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_NUM4: {NotNull, varchar(30)}
     * @param userNum4List The collection of userNum4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum4_NotInScope(Collection<String> userNum4List) {
        doSetUserNum4_NotInScope(userNum4List);
    }

    protected void doSetUserNum4_NotInScope(Collection<String> userNum4List) {
        regINS(CK_NINS, cTL(userNum4List), xgetCValueUserNum4(), "USER_NUM4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NUM4: {NotNull, varchar(30)} <br>
     * <pre>e.g. setUserNum4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userNum4 The value of userNum4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserNum4_LikeSearch(String userNum4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userNum4), xgetCValueUserNum4(), "USER_NUM4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NUM4: {NotNull, varchar(30)}
     * @param userNum4 The value of userNum4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserNum4_NotLikeSearch(String userNum4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userNum4), xgetCValueUserNum4(), "USER_NUM4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NUM4: {NotNull, varchar(30)}
     * @param userNum4 The value of userNum4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum4_PrefixSearch(String userNum4) {
        setUserNum4_LikeSearch(userNum4, xcLSOPPre());
    }

    protected void regUserNum4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserNum4(), "USER_NUM4"); }
    protected abstract ConditionValue xgetCValueUserNum4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NUM3: {NotNull, varchar(30)}
     * @param userNum3 The value of userNum3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum3_Equal(String userNum3) {
        doSetUserNum3_Equal(fRES(userNum3));
    }

    protected void doSetUserNum3_Equal(String userNum3) {
        regUserNum3(CK_EQ, userNum3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NUM3: {NotNull, varchar(30)}
     * @param userNum3 The value of userNum3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum3_NotEqual(String userNum3) {
        doSetUserNum3_NotEqual(fRES(userNum3));
    }

    protected void doSetUserNum3_NotEqual(String userNum3) {
        regUserNum3(CK_NES, userNum3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NUM3: {NotNull, varchar(30)}
     * @param userNum3 The value of userNum3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum3_GreaterThan(String userNum3) {
        regUserNum3(CK_GT, fRES(userNum3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NUM3: {NotNull, varchar(30)}
     * @param userNum3 The value of userNum3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum3_LessThan(String userNum3) {
        regUserNum3(CK_LT, fRES(userNum3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NUM3: {NotNull, varchar(30)}
     * @param userNum3 The value of userNum3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum3_GreaterEqual(String userNum3) {
        regUserNum3(CK_GE, fRES(userNum3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NUM3: {NotNull, varchar(30)}
     * @param userNum3 The value of userNum3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum3_LessEqual(String userNum3) {
        regUserNum3(CK_LE, fRES(userNum3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_NUM3: {NotNull, varchar(30)}
     * @param userNum3List The collection of userNum3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum3_InScope(Collection<String> userNum3List) {
        doSetUserNum3_InScope(userNum3List);
    }

    protected void doSetUserNum3_InScope(Collection<String> userNum3List) {
        regINS(CK_INS, cTL(userNum3List), xgetCValueUserNum3(), "USER_NUM3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_NUM3: {NotNull, varchar(30)}
     * @param userNum3List The collection of userNum3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum3_NotInScope(Collection<String> userNum3List) {
        doSetUserNum3_NotInScope(userNum3List);
    }

    protected void doSetUserNum3_NotInScope(Collection<String> userNum3List) {
        regINS(CK_NINS, cTL(userNum3List), xgetCValueUserNum3(), "USER_NUM3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NUM3: {NotNull, varchar(30)} <br>
     * <pre>e.g. setUserNum3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userNum3 The value of userNum3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserNum3_LikeSearch(String userNum3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userNum3), xgetCValueUserNum3(), "USER_NUM3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NUM3: {NotNull, varchar(30)}
     * @param userNum3 The value of userNum3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserNum3_NotLikeSearch(String userNum3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userNum3), xgetCValueUserNum3(), "USER_NUM3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NUM3: {NotNull, varchar(30)}
     * @param userNum3 The value of userNum3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserNum3_PrefixSearch(String userNum3) {
        setUserNum3_LikeSearch(userNum3, xcLSOPPre());
    }

    protected void regUserNum3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserNum3(), "USER_NUM3"); }
    protected abstract ConditionValue xgetCValueUserNum3();

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
    public HpSLCFunction<EProductStockInfoCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EProductStockInfoCB.class);
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
    public HpSLCFunction<EProductStockInfoCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EProductStockInfoCB.class);
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
    public HpSLCFunction<EProductStockInfoCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EProductStockInfoCB.class);
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
    public HpSLCFunction<EProductStockInfoCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EProductStockInfoCB.class);
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
    public HpSLCFunction<EProductStockInfoCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EProductStockInfoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EProductStockInfoCB&gt;() {
     *     public void query(EProductStockInfoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EProductStockInfoCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EProductStockInfoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductStockInfoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EProductStockInfoCQ sq);

    protected EProductStockInfoCB xcreateScalarConditionCB() {
        EProductStockInfoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EProductStockInfoCB xcreateScalarConditionPartitionByCB() {
        EProductStockInfoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EProductStockInfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductStockInfoCB cb = new EProductStockInfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "E_PRODUCT_STOCK_INFO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EProductStockInfoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EProductStockInfoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EProductStockInfoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductStockInfoCB cb = new EProductStockInfoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "E_PRODUCT_STOCK_INFO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EProductStockInfoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EProductStockInfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EProductStockInfoCB cb = new EProductStockInfoCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EProductStockInfoCQ sq);

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
    protected EProductStockInfoCB newMyCB() {
        return new EProductStockInfoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EProductStockInfoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

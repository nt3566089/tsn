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
 * The abstract condition-query of E_STOCKINFOIMPORT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEStockinfoimportCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEStockinfoimportCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_STOCKINFOIMPORT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendId The value of centerStockInfoSendId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_Equal(Long centerStockInfoSendId) {
        doSetCenterStockInfoSendId_Equal(centerStockInfoSendId);
    }

    protected void doSetCenterStockInfoSendId_Equal(Long centerStockInfoSendId) {
        regCenterStockInfoSendId(CK_EQ, centerStockInfoSendId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendId The value of centerStockInfoSendId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_NotEqual(Long centerStockInfoSendId) {
        doSetCenterStockInfoSendId_NotEqual(centerStockInfoSendId);
    }

    protected void doSetCenterStockInfoSendId_NotEqual(Long centerStockInfoSendId) {
        regCenterStockInfoSendId(CK_NES, centerStockInfoSendId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendId The value of centerStockInfoSendId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_GreaterThan(Long centerStockInfoSendId) {
        regCenterStockInfoSendId(CK_GT, centerStockInfoSendId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendId The value of centerStockInfoSendId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_LessThan(Long centerStockInfoSendId) {
        regCenterStockInfoSendId(CK_LT, centerStockInfoSendId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendId The value of centerStockInfoSendId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_GreaterEqual(Long centerStockInfoSendId) {
        regCenterStockInfoSendId(CK_GE, centerStockInfoSendId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendId The value of centerStockInfoSendId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_LessEqual(Long centerStockInfoSendId) {
        regCenterStockInfoSendId(CK_LE, centerStockInfoSendId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of centerStockInfoSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerStockInfoSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterStockInfoSendId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterStockInfoSendId(), "CENTER_STOCK_INFO_SEND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendIdList The collection of centerStockInfoSendId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_InScope(Collection<Long> centerStockInfoSendIdList) {
        doSetCenterStockInfoSendId_InScope(centerStockInfoSendIdList);
    }

    protected void doSetCenterStockInfoSendId_InScope(Collection<Long> centerStockInfoSendIdList) {
        regINS(CK_INS, cTL(centerStockInfoSendIdList), xgetCValueCenterStockInfoSendId(), "CENTER_STOCK_INFO_SEND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendIdList The collection of centerStockInfoSendId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_NotInScope(Collection<Long> centerStockInfoSendIdList) {
        doSetCenterStockInfoSendId_NotInScope(centerStockInfoSendIdList);
    }

    protected void doSetCenterStockInfoSendId_NotInScope(Collection<Long> centerStockInfoSendIdList) {
        regINS(CK_NINS, cTL(centerStockInfoSendIdList), xgetCValueCenterStockInfoSendId(), "CENTER_STOCK_INFO_SEND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCenterStockInfoSendId_IsNull() { regCenterStockInfoSendId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCenterStockInfoSendId_IsNotNull() { regCenterStockInfoSendId(CK_ISNN, DOBJ); }

    protected void regCenterStockInfoSendId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterStockInfoSendId(), "CENTER_STOCK_INFO_SEND_ID"); }
    protected abstract ConditionValue xgetCValueCenterStockInfoSendId();

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
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_Equal(String seqno) {
        doSetSeqno_Equal(fRES(seqno));
    }

    protected void doSetSeqno_Equal(String seqno) {
        regSeqno(CK_EQ, seqno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_NotEqual(String seqno) {
        doSetSeqno_NotEqual(fRES(seqno));
    }

    protected void doSetSeqno_NotEqual(String seqno) {
        regSeqno(CK_NES, seqno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_GreaterThan(String seqno) {
        regSeqno(CK_GT, fRES(seqno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_LessThan(String seqno) {
        regSeqno(CK_LT, fRES(seqno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_GreaterEqual(String seqno) {
        regSeqno(CK_GE, fRES(seqno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_LessEqual(String seqno) {
        regSeqno(CK_LE, fRES(seqno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqnoList The collection of seqno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_InScope(Collection<String> seqnoList) {
        doSetSeqno_InScope(seqnoList);
    }

    protected void doSetSeqno_InScope(Collection<String> seqnoList) {
        regINS(CK_INS, cTL(seqnoList), xgetCValueSeqno(), "SEQNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqnoList The collection of seqno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_NotInScope(Collection<String> seqnoList) {
        doSetSeqno_NotInScope(seqnoList);
    }

    protected void doSetSeqno_NotInScope(Collection<String> seqnoList) {
        regINS(CK_NINS, cTL(seqnoList), xgetCValueSeqno(), "SEQNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEQNO: {varchar(255)} <br>
     * <pre>e.g. setSeqno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param seqno The value of seqno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSeqno_LikeSearch(String seqno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(seqno), xgetCValueSeqno(), "SEQNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSeqno_NotLikeSearch(String seqno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(seqno), xgetCValueSeqno(), "SEQNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEQNO: {varchar(255)}
     * @param seqno The value of seqno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_PrefixSearch(String seqno) {
        setSeqno_LikeSearch(seqno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     */
    public void setSeqno_IsNull() { regSeqno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     */
    public void setSeqno_IsNullOrEmpty() { regSeqno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEQNO: {varchar(255)}
     */
    public void setSeqno_IsNotNull() { regSeqno(CK_ISNN, DOBJ); }

    protected void regSeqno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeqno(), "SEQNO"); }
    protected abstract ConditionValue xgetCValueSeqno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDDATETIME: {varchar(255)}
     * @param adddatetime The value of adddatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdddatetime_Equal(String adddatetime) {
        doSetAdddatetime_Equal(fRES(adddatetime));
    }

    protected void doSetAdddatetime_Equal(String adddatetime) {
        regAdddatetime(CK_EQ, adddatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDDATETIME: {varchar(255)}
     * @param adddatetime The value of adddatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdddatetime_NotEqual(String adddatetime) {
        doSetAdddatetime_NotEqual(fRES(adddatetime));
    }

    protected void doSetAdddatetime_NotEqual(String adddatetime) {
        regAdddatetime(CK_NES, adddatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDDATETIME: {varchar(255)}
     * @param adddatetime The value of adddatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdddatetime_GreaterThan(String adddatetime) {
        regAdddatetime(CK_GT, fRES(adddatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDDATETIME: {varchar(255)}
     * @param adddatetime The value of adddatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdddatetime_LessThan(String adddatetime) {
        regAdddatetime(CK_LT, fRES(adddatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDDATETIME: {varchar(255)}
     * @param adddatetime The value of adddatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdddatetime_GreaterEqual(String adddatetime) {
        regAdddatetime(CK_GE, fRES(adddatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDDATETIME: {varchar(255)}
     * @param adddatetime The value of adddatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdddatetime_LessEqual(String adddatetime) {
        regAdddatetime(CK_LE, fRES(adddatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDDATETIME: {varchar(255)}
     * @param adddatetimeList The collection of adddatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdddatetime_InScope(Collection<String> adddatetimeList) {
        doSetAdddatetime_InScope(adddatetimeList);
    }

    protected void doSetAdddatetime_InScope(Collection<String> adddatetimeList) {
        regINS(CK_INS, cTL(adddatetimeList), xgetCValueAdddatetime(), "ADDDATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDDATETIME: {varchar(255)}
     * @param adddatetimeList The collection of adddatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdddatetime_NotInScope(Collection<String> adddatetimeList) {
        doSetAdddatetime_NotInScope(adddatetimeList);
    }

    protected void doSetAdddatetime_NotInScope(Collection<String> adddatetimeList) {
        regINS(CK_NINS, cTL(adddatetimeList), xgetCValueAdddatetime(), "ADDDATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDDATETIME: {varchar(255)} <br>
     * <pre>e.g. setAdddatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param adddatetime The value of adddatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAdddatetime_LikeSearch(String adddatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(adddatetime), xgetCValueAdddatetime(), "ADDDATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDDATETIME: {varchar(255)}
     * @param adddatetime The value of adddatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAdddatetime_NotLikeSearch(String adddatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(adddatetime), xgetCValueAdddatetime(), "ADDDATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDDATETIME: {varchar(255)}
     * @param adddatetime The value of adddatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdddatetime_PrefixSearch(String adddatetime) {
        setAdddatetime_LikeSearch(adddatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDDATETIME: {varchar(255)}
     */
    public void setAdddatetime_IsNull() { regAdddatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDDATETIME: {varchar(255)}
     */
    public void setAdddatetime_IsNullOrEmpty() { regAdddatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDDATETIME: {varchar(255)}
     */
    public void setAdddatetime_IsNotNull() { regAdddatetime(CK_ISNN, DOBJ); }

    protected void regAdddatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdddatetime(), "ADDDATETIME"); }
    protected abstract ConditionValue xgetCValueAdddatetime();

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
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_Equal(String warehouseSname) {
        doSetWarehouseSname_Equal(fRES(warehouseSname));
    }

    protected void doSetWarehouseSname_Equal(String warehouseSname) {
        regWarehouseSname(CK_EQ, warehouseSname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_NotEqual(String warehouseSname) {
        doSetWarehouseSname_NotEqual(fRES(warehouseSname));
    }

    protected void doSetWarehouseSname_NotEqual(String warehouseSname) {
        regWarehouseSname(CK_NES, warehouseSname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_GreaterThan(String warehouseSname) {
        regWarehouseSname(CK_GT, fRES(warehouseSname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_LessThan(String warehouseSname) {
        regWarehouseSname(CK_LT, fRES(warehouseSname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_GreaterEqual(String warehouseSname) {
        regWarehouseSname(CK_GE, fRES(warehouseSname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_LessEqual(String warehouseSname) {
        regWarehouseSname(CK_LE, fRES(warehouseSname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSnameList The collection of warehouseSname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_InScope(Collection<String> warehouseSnameList) {
        doSetWarehouseSname_InScope(warehouseSnameList);
    }

    protected void doSetWarehouseSname_InScope(Collection<String> warehouseSnameList) {
        regINS(CK_INS, cTL(warehouseSnameList), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSnameList The collection of warehouseSname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_NotInScope(Collection<String> warehouseSnameList) {
        doSetWarehouseSname_NotInScope(warehouseSnameList);
    }

    protected void doSetWarehouseSname_NotInScope(Collection<String> warehouseSnameList) {
        regINS(CK_NINS, cTL(warehouseSnameList), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)} <br>
     * <pre>e.g. setWarehouseSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseSname The value of warehouseSname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseSname_LikeSearch(String warehouseSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseSname), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseSname_NotLikeSearch(String warehouseSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseSname), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_PrefixSearch(String warehouseSname) {
        setWarehouseSname_LikeSearch(warehouseSname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     */
    public void setWarehouseSname_IsNull() { regWarehouseSname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     */
    public void setWarehouseSname_IsNullOrEmpty() { regWarehouseSname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     */
    public void setWarehouseSname_IsNotNull() { regWarehouseSname(CK_ISNN, DOBJ); }

    protected void regWarehouseSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseSname(), "WAREHOUSE_SNAME"); }
    protected abstract ConditionValue xgetCValueWarehouseSname();

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
     * ITEM_NAME: {varchar(255)}
     * @param itemName The value of itemName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_Equal(String itemName) {
        doSetItemName_Equal(fRES(itemName));
    }

    protected void doSetItemName_Equal(String itemName) {
        regItemName(CK_EQ, itemName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {varchar(255)}
     * @param itemName The value of itemName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_NotEqual(String itemName) {
        doSetItemName_NotEqual(fRES(itemName));
    }

    protected void doSetItemName_NotEqual(String itemName) {
        regItemName(CK_NES, itemName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {varchar(255)}
     * @param itemName The value of itemName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_GreaterThan(String itemName) {
        regItemName(CK_GT, fRES(itemName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {varchar(255)}
     * @param itemName The value of itemName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_LessThan(String itemName) {
        regItemName(CK_LT, fRES(itemName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {varchar(255)}
     * @param itemName The value of itemName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_GreaterEqual(String itemName) {
        regItemName(CK_GE, fRES(itemName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {varchar(255)}
     * @param itemName The value of itemName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_LessEqual(String itemName) {
        regItemName(CK_LE, fRES(itemName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {varchar(255)}
     * @param itemNameList The collection of itemName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_InScope(Collection<String> itemNameList) {
        doSetItemName_InScope(itemNameList);
    }

    protected void doSetItemName_InScope(Collection<String> itemNameList) {
        regINS(CK_INS, cTL(itemNameList), xgetCValueItemName(), "ITEM_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {varchar(255)}
     * @param itemNameList The collection of itemName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_NotInScope(Collection<String> itemNameList) {
        doSetItemName_NotInScope(itemNameList);
    }

    protected void doSetItemName_NotInScope(Collection<String> itemNameList) {
        regINS(CK_NINS, cTL(itemNameList), xgetCValueItemName(), "ITEM_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {varchar(255)} <br>
     * <pre>e.g. setItemName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemName The value of itemName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemName_LikeSearch(String itemName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemName), xgetCValueItemName(), "ITEM_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {varchar(255)}
     * @param itemName The value of itemName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemName_NotLikeSearch(String itemName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemName), xgetCValueItemName(), "ITEM_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {varchar(255)}
     * @param itemName The value of itemName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_PrefixSearch(String itemName) {
        setItemName_LikeSearch(itemName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_NAME: {varchar(255)}
     */
    public void setItemName_IsNull() { regItemName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_NAME: {varchar(255)}
     */
    public void setItemName_IsNullOrEmpty() { regItemName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_NAME: {varchar(255)}
     */
    public void setItemName_IsNotNull() { regItemName(CK_ISNN, DOBJ); }

    protected void regItemName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemName(), "ITEM_NAME"); }
    protected abstract ConditionValue xgetCValueItemName();

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
     * OTHERLOT1: {varchar(255)}
     * @param otherlot1 The value of otherlot1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_Equal(String otherlot1) {
        doSetOtherlot1_Equal(fRES(otherlot1));
    }

    protected void doSetOtherlot1_Equal(String otherlot1) {
        regOtherlot1(CK_EQ, otherlot1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(255)}
     * @param otherlot1 The value of otherlot1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_NotEqual(String otherlot1) {
        doSetOtherlot1_NotEqual(fRES(otherlot1));
    }

    protected void doSetOtherlot1_NotEqual(String otherlot1) {
        regOtherlot1(CK_NES, otherlot1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(255)}
     * @param otherlot1 The value of otherlot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_GreaterThan(String otherlot1) {
        regOtherlot1(CK_GT, fRES(otherlot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(255)}
     * @param otherlot1 The value of otherlot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_LessThan(String otherlot1) {
        regOtherlot1(CK_LT, fRES(otherlot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(255)}
     * @param otherlot1 The value of otherlot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_GreaterEqual(String otherlot1) {
        regOtherlot1(CK_GE, fRES(otherlot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(255)}
     * @param otherlot1 The value of otherlot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_LessEqual(String otherlot1) {
        regOtherlot1(CK_LE, fRES(otherlot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(255)}
     * @param otherlot1List The collection of otherlot1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_InScope(Collection<String> otherlot1List) {
        doSetOtherlot1_InScope(otherlot1List);
    }

    protected void doSetOtherlot1_InScope(Collection<String> otherlot1List) {
        regINS(CK_INS, cTL(otherlot1List), xgetCValueOtherlot1(), "OTHERLOT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(255)}
     * @param otherlot1List The collection of otherlot1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_NotInScope(Collection<String> otherlot1List) {
        doSetOtherlot1_NotInScope(otherlot1List);
    }

    protected void doSetOtherlot1_NotInScope(Collection<String> otherlot1List) {
        regINS(CK_NINS, cTL(otherlot1List), xgetCValueOtherlot1(), "OTHERLOT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(255)} <br>
     * <pre>e.g. setOtherlot1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherlot1 The value of otherlot1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherlot1_LikeSearch(String otherlot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherlot1), xgetCValueOtherlot1(), "OTHERLOT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(255)}
     * @param otherlot1 The value of otherlot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot1_NotLikeSearch(String otherlot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot1), xgetCValueOtherlot1(), "OTHERLOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(255)}
     * @param otherlot1 The value of otherlot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_PrefixSearch(String otherlot1) {
        setOtherlot1_LikeSearch(otherlot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(255)}
     */
    public void setOtherlot1_IsNull() { regOtherlot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(255)}
     */
    public void setOtherlot1_IsNullOrEmpty() { regOtherlot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(255)}
     */
    public void setOtherlot1_IsNotNull() { regOtherlot1(CK_ISNN, DOBJ); }

    protected void regOtherlot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot1(), "OTHERLOT1"); }
    protected abstract ConditionValue xgetCValueOtherlot1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_Equal(String address3) {
        doSetAddress3_Equal(fRES(address3));
    }

    protected void doSetAddress3_Equal(String address3) {
        regAddress3(CK_EQ, address3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotEqual(String address3) {
        doSetAddress3_NotEqual(fRES(address3));
    }

    protected void doSetAddress3_NotEqual(String address3) {
        regAddress3(CK_NES, address3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterThan(String address3) {
        regAddress3(CK_GT, fRES(address3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessThan(String address3) {
        regAddress3(CK_LT, fRES(address3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterEqual(String address3) {
        regAddress3(CK_GE, fRES(address3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessEqual(String address3) {
        regAddress3(CK_LE, fRES(address3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3List The collection of address3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_InScope(Collection<String> address3List) {
        doSetAddress3_InScope(address3List);
    }

    protected void doSetAddress3_InScope(Collection<String> address3List) {
        regINS(CK_INS, cTL(address3List), xgetCValueAddress3(), "ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3List The collection of address3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotInScope(Collection<String> address3List) {
        doSetAddress3_NotInScope(address3List);
    }

    protected void doSetAddress3_NotInScope(Collection<String> address3List) {
        regINS(CK_NINS, cTL(address3List), xgetCValueAddress3(), "ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)} <br>
     * <pre>e.g. setAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address3 The value of address3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress3_LikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress3_NotLikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_PrefixSearch(String address3) {
        setAddress3_LikeSearch(address3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     */
    public void setAddress3_IsNull() { regAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     */
    public void setAddress3_IsNullOrEmpty() { regAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     */
    public void setAddress3_IsNotNull() { regAddress3(CK_ISNN, DOBJ); }

    protected void regAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress3(), "ADDRESS3"); }
    protected abstract ConditionValue xgetCValueAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY1: {varchar(255)}
     * @param qty1 The value of qty1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1_Equal(String qty1) {
        doSetQty1_Equal(fRES(qty1));
    }

    protected void doSetQty1_Equal(String qty1) {
        regQty1(CK_EQ, qty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY1: {varchar(255)}
     * @param qty1 The value of qty1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1_NotEqual(String qty1) {
        doSetQty1_NotEqual(fRES(qty1));
    }

    protected void doSetQty1_NotEqual(String qty1) {
        regQty1(CK_NES, qty1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY1: {varchar(255)}
     * @param qty1 The value of qty1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1_GreaterThan(String qty1) {
        regQty1(CK_GT, fRES(qty1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY1: {varchar(255)}
     * @param qty1 The value of qty1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1_LessThan(String qty1) {
        regQty1(CK_LT, fRES(qty1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY1: {varchar(255)}
     * @param qty1 The value of qty1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1_GreaterEqual(String qty1) {
        regQty1(CK_GE, fRES(qty1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY1: {varchar(255)}
     * @param qty1 The value of qty1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1_LessEqual(String qty1) {
        regQty1(CK_LE, fRES(qty1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QTY1: {varchar(255)}
     * @param qty1List The collection of qty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1_InScope(Collection<String> qty1List) {
        doSetQty1_InScope(qty1List);
    }

    protected void doSetQty1_InScope(Collection<String> qty1List) {
        regINS(CK_INS, cTL(qty1List), xgetCValueQty1(), "QTY1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QTY1: {varchar(255)}
     * @param qty1List The collection of qty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1_NotInScope(Collection<String> qty1List) {
        doSetQty1_NotInScope(qty1List);
    }

    protected void doSetQty1_NotInScope(Collection<String> qty1List) {
        regINS(CK_NINS, cTL(qty1List), xgetCValueQty1(), "QTY1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY1: {varchar(255)} <br>
     * <pre>e.g. setQty1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param qty1 The value of qty1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQty1_LikeSearch(String qty1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qty1), xgetCValueQty1(), "QTY1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY1: {varchar(255)}
     * @param qty1 The value of qty1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQty1_NotLikeSearch(String qty1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qty1), xgetCValueQty1(), "QTY1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY1: {varchar(255)}
     * @param qty1 The value of qty1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1_PrefixSearch(String qty1) {
        setQty1_LikeSearch(qty1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY1: {varchar(255)}
     */
    public void setQty1_IsNull() { regQty1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * QTY1: {varchar(255)}
     */
    public void setQty1_IsNullOrEmpty() { regQty1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY1: {varchar(255)}
     */
    public void setQty1_IsNotNull() { regQty1(CK_ISNN, DOBJ); }

    protected void regQty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty1(), "QTY1"); }
    protected abstract ConditionValue xgetCValueQty1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {varchar(255)}
     * @param refno The value of refno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_Equal(String refno) {
        doSetRefno_Equal(fRES(refno));
    }

    protected void doSetRefno_Equal(String refno) {
        regRefno(CK_EQ, refno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {varchar(255)}
     * @param refno The value of refno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_NotEqual(String refno) {
        doSetRefno_NotEqual(fRES(refno));
    }

    protected void doSetRefno_NotEqual(String refno) {
        regRefno(CK_NES, refno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {varchar(255)}
     * @param refno The value of refno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_GreaterThan(String refno) {
        regRefno(CK_GT, fRES(refno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {varchar(255)}
     * @param refno The value of refno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_LessThan(String refno) {
        regRefno(CK_LT, fRES(refno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {varchar(255)}
     * @param refno The value of refno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_GreaterEqual(String refno) {
        regRefno(CK_GE, fRES(refno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {varchar(255)}
     * @param refno The value of refno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_LessEqual(String refno) {
        regRefno(CK_LE, fRES(refno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFNO: {varchar(255)}
     * @param refnoList The collection of refno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_InScope(Collection<String> refnoList) {
        doSetRefno_InScope(refnoList);
    }

    protected void doSetRefno_InScope(Collection<String> refnoList) {
        regINS(CK_INS, cTL(refnoList), xgetCValueRefno(), "REFNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFNO: {varchar(255)}
     * @param refnoList The collection of refno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_NotInScope(Collection<String> refnoList) {
        doSetRefno_NotInScope(refnoList);
    }

    protected void doSetRefno_NotInScope(Collection<String> refnoList) {
        regINS(CK_NINS, cTL(refnoList), xgetCValueRefno(), "REFNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNO: {varchar(255)} <br>
     * <pre>e.g. setRefno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refno The value of refno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefno_LikeSearch(String refno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refno), xgetCValueRefno(), "REFNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNO: {varchar(255)}
     * @param refno The value of refno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefno_NotLikeSearch(String refno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refno), xgetCValueRefno(), "REFNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNO: {varchar(255)}
     * @param refno The value of refno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_PrefixSearch(String refno) {
        setRefno_LikeSearch(refno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REFNO: {varchar(255)}
     */
    public void setRefno_IsNull() { regRefno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REFNO: {varchar(255)}
     */
    public void setRefno_IsNullOrEmpty() { regRefno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REFNO: {varchar(255)}
     */
    public void setRefno_IsNotNull() { regRefno(CK_ISNN, DOBJ); }

    protected void regRefno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefno(), "REFNO"); }
    protected abstract ConditionValue xgetCValueRefno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_Equal(String firmcarryno) {
        doSetFirmcarryno_Equal(fRES(firmcarryno));
    }

    protected void doSetFirmcarryno_Equal(String firmcarryno) {
        regFirmcarryno(CK_EQ, firmcarryno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_NotEqual(String firmcarryno) {
        doSetFirmcarryno_NotEqual(fRES(firmcarryno));
    }

    protected void doSetFirmcarryno_NotEqual(String firmcarryno) {
        regFirmcarryno(CK_NES, firmcarryno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_GreaterThan(String firmcarryno) {
        regFirmcarryno(CK_GT, fRES(firmcarryno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_LessThan(String firmcarryno) {
        regFirmcarryno(CK_LT, fRES(firmcarryno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_GreaterEqual(String firmcarryno) {
        regFirmcarryno(CK_GE, fRES(firmcarryno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_LessEqual(String firmcarryno) {
        regFirmcarryno(CK_LE, fRES(firmcarryno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(255)}
     * @param firmcarrynoList The collection of firmcarryno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_InScope(Collection<String> firmcarrynoList) {
        doSetFirmcarryno_InScope(firmcarrynoList);
    }

    protected void doSetFirmcarryno_InScope(Collection<String> firmcarrynoList) {
        regINS(CK_INS, cTL(firmcarrynoList), xgetCValueFirmcarryno(), "FIRMCARRYNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(255)}
     * @param firmcarrynoList The collection of firmcarryno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_NotInScope(Collection<String> firmcarrynoList) {
        doSetFirmcarryno_NotInScope(firmcarrynoList);
    }

    protected void doSetFirmcarryno_NotInScope(Collection<String> firmcarrynoList) {
        regINS(CK_NINS, cTL(firmcarrynoList), xgetCValueFirmcarryno(), "FIRMCARRYNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(255)} <br>
     * <pre>e.g. setFirmcarryno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firmcarryno The value of firmcarryno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirmcarryno_LikeSearch(String firmcarryno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firmcarryno), xgetCValueFirmcarryno(), "FIRMCARRYNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirmcarryno_NotLikeSearch(String firmcarryno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firmcarryno), xgetCValueFirmcarryno(), "FIRMCARRYNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(255)}
     * @param firmcarryno The value of firmcarryno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_PrefixSearch(String firmcarryno) {
        setFirmcarryno_LikeSearch(firmcarryno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(255)}
     */
    public void setFirmcarryno_IsNull() { regFirmcarryno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(255)}
     */
    public void setFirmcarryno_IsNullOrEmpty() { regFirmcarryno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(255)}
     */
    public void setFirmcarryno_IsNotNull() { regFirmcarryno(CK_ISNN, DOBJ); }

    protected void regFirmcarryno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirmcarryno(), "FIRMCARRYNO"); }
    protected abstract ConditionValue xgetCValueFirmcarryno();

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
     * SOURCE_CD: {varchar(255)}
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
     * SOURCE_CD: {varchar(255)}
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
     * SOURCE_CD: {varchar(255)}
     * @param sourceCd The value of sourceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_GreaterThan(String sourceCd) {
        regSourceCd(CK_GT, fRES(sourceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(255)}
     * @param sourceCd The value of sourceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_LessThan(String sourceCd) {
        regSourceCd(CK_LT, fRES(sourceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(255)}
     * @param sourceCd The value of sourceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_GreaterEqual(String sourceCd) {
        regSourceCd(CK_GE, fRES(sourceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(255)}
     * @param sourceCd The value of sourceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_LessEqual(String sourceCd) {
        regSourceCd(CK_LE, fRES(sourceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {varchar(255)}
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
     * SOURCE_CD: {varchar(255)}
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
     * SOURCE_CD: {varchar(255)} <br>
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
     * SOURCE_CD: {varchar(255)}
     * @param sourceCd The value of sourceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourceCd_NotLikeSearch(String sourceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceCd), xgetCValueSourceCd(), "SOURCE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {varchar(255)}
     * @param sourceCd The value of sourceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_PrefixSearch(String sourceCd) {
        setSourceCd_LikeSearch(sourceCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(255)}
     */
    public void setSourceCd_IsNull() { regSourceCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(255)}
     */
    public void setSourceCd_IsNullOrEmpty() { regSourceCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(255)}
     */
    public void setSourceCd_IsNotNull() { regSourceCd(CK_ISNN, DOBJ); }

    protected void regSourceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceCd(), "SOURCE_CD"); }
    protected abstract ConditionValue xgetCValueSourceCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(255)}
     * @param sourceName The value of sourceName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_Equal(String sourceName) {
        doSetSourceName_Equal(fRES(sourceName));
    }

    protected void doSetSourceName_Equal(String sourceName) {
        regSourceName(CK_EQ, sourceName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(255)}
     * @param sourceName The value of sourceName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_NotEqual(String sourceName) {
        doSetSourceName_NotEqual(fRES(sourceName));
    }

    protected void doSetSourceName_NotEqual(String sourceName) {
        regSourceName(CK_NES, sourceName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(255)}
     * @param sourceName The value of sourceName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_GreaterThan(String sourceName) {
        regSourceName(CK_GT, fRES(sourceName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(255)}
     * @param sourceName The value of sourceName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_LessThan(String sourceName) {
        regSourceName(CK_LT, fRES(sourceName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(255)}
     * @param sourceName The value of sourceName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_GreaterEqual(String sourceName) {
        regSourceName(CK_GE, fRES(sourceName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(255)}
     * @param sourceName The value of sourceName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_LessEqual(String sourceName) {
        regSourceName(CK_LE, fRES(sourceName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_NAME: {varchar(255)}
     * @param sourceNameList The collection of sourceName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_InScope(Collection<String> sourceNameList) {
        doSetSourceName_InScope(sourceNameList);
    }

    protected void doSetSourceName_InScope(Collection<String> sourceNameList) {
        regINS(CK_INS, cTL(sourceNameList), xgetCValueSourceName(), "SOURCE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_NAME: {varchar(255)}
     * @param sourceNameList The collection of sourceName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_NotInScope(Collection<String> sourceNameList) {
        doSetSourceName_NotInScope(sourceNameList);
    }

    protected void doSetSourceName_NotInScope(Collection<String> sourceNameList) {
        regINS(CK_NINS, cTL(sourceNameList), xgetCValueSourceName(), "SOURCE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_NAME: {varchar(255)} <br>
     * <pre>e.g. setSourceName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sourceName The value of sourceName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourceName_LikeSearch(String sourceName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceName), xgetCValueSourceName(), "SOURCE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_NAME: {varchar(255)}
     * @param sourceName The value of sourceName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourceName_NotLikeSearch(String sourceName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceName), xgetCValueSourceName(), "SOURCE_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_NAME: {varchar(255)}
     * @param sourceName The value of sourceName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_PrefixSearch(String sourceName) {
        setSourceName_LikeSearch(sourceName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(255)}
     */
    public void setSourceName_IsNull() { regSourceName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(255)}
     */
    public void setSourceName_IsNullOrEmpty() { regSourceName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(255)}
     */
    public void setSourceName_IsNotNull() { regSourceName(CK_ISNN, DOBJ); }

    protected void regSourceName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceName(), "SOURCE_NAME"); }
    protected abstract ConditionValue xgetCValueSourceName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(255)}
     * @param shipschdate The value of shipschdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_Equal(String shipschdate) {
        doSetShipschdate_Equal(fRES(shipschdate));
    }

    protected void doSetShipschdate_Equal(String shipschdate) {
        regShipschdate(CK_EQ, shipschdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(255)}
     * @param shipschdate The value of shipschdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_NotEqual(String shipschdate) {
        doSetShipschdate_NotEqual(fRES(shipschdate));
    }

    protected void doSetShipschdate_NotEqual(String shipschdate) {
        regShipschdate(CK_NES, shipschdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(255)}
     * @param shipschdate The value of shipschdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_GreaterThan(String shipschdate) {
        regShipschdate(CK_GT, fRES(shipschdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(255)}
     * @param shipschdate The value of shipschdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_LessThan(String shipschdate) {
        regShipschdate(CK_LT, fRES(shipschdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(255)}
     * @param shipschdate The value of shipschdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_GreaterEqual(String shipschdate) {
        regShipschdate(CK_GE, fRES(shipschdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(255)}
     * @param shipschdate The value of shipschdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_LessEqual(String shipschdate) {
        regShipschdate(CK_LE, fRES(shipschdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(255)}
     * @param shipschdateList The collection of shipschdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_InScope(Collection<String> shipschdateList) {
        doSetShipschdate_InScope(shipschdateList);
    }

    protected void doSetShipschdate_InScope(Collection<String> shipschdateList) {
        regINS(CK_INS, cTL(shipschdateList), xgetCValueShipschdate(), "SHIPSCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(255)}
     * @param shipschdateList The collection of shipschdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_NotInScope(Collection<String> shipschdateList) {
        doSetShipschdate_NotInScope(shipschdateList);
    }

    protected void doSetShipschdate_NotInScope(Collection<String> shipschdateList) {
        regINS(CK_NINS, cTL(shipschdateList), xgetCValueShipschdate(), "SHIPSCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(255)} <br>
     * <pre>e.g. setShipschdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipschdate The value of shipschdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipschdate_LikeSearch(String shipschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipschdate), xgetCValueShipschdate(), "SHIPSCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(255)}
     * @param shipschdate The value of shipschdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipschdate_NotLikeSearch(String shipschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipschdate), xgetCValueShipschdate(), "SHIPSCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(255)}
     * @param shipschdate The value of shipschdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_PrefixSearch(String shipschdate) {
        setShipschdate_LikeSearch(shipschdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(255)}
     */
    public void setShipschdate_IsNull() { regShipschdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(255)}
     */
    public void setShipschdate_IsNullOrEmpty() { regShipschdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(255)}
     */
    public void setShipschdate_IsNotNull() { regShipschdate(CK_ISNN, DOBJ); }

    protected void regShipschdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipschdate(), "SHIPSCHDATE"); }
    protected abstract ConditionValue xgetCValueShipschdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     * @param schreceiveDate The value of schreceiveDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_Equal(String schreceiveDate) {
        doSetSchreceiveDate_Equal(fRES(schreceiveDate));
    }

    protected void doSetSchreceiveDate_Equal(String schreceiveDate) {
        regSchreceiveDate(CK_EQ, schreceiveDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     * @param schreceiveDate The value of schreceiveDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_NotEqual(String schreceiveDate) {
        doSetSchreceiveDate_NotEqual(fRES(schreceiveDate));
    }

    protected void doSetSchreceiveDate_NotEqual(String schreceiveDate) {
        regSchreceiveDate(CK_NES, schreceiveDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     * @param schreceiveDate The value of schreceiveDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_GreaterThan(String schreceiveDate) {
        regSchreceiveDate(CK_GT, fRES(schreceiveDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     * @param schreceiveDate The value of schreceiveDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_LessThan(String schreceiveDate) {
        regSchreceiveDate(CK_LT, fRES(schreceiveDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     * @param schreceiveDate The value of schreceiveDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_GreaterEqual(String schreceiveDate) {
        regSchreceiveDate(CK_GE, fRES(schreceiveDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     * @param schreceiveDate The value of schreceiveDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_LessEqual(String schreceiveDate) {
        regSchreceiveDate(CK_LE, fRES(schreceiveDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     * @param schreceiveDateList The collection of schreceiveDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_InScope(Collection<String> schreceiveDateList) {
        doSetSchreceiveDate_InScope(schreceiveDateList);
    }

    protected void doSetSchreceiveDate_InScope(Collection<String> schreceiveDateList) {
        regINS(CK_INS, cTL(schreceiveDateList), xgetCValueSchreceiveDate(), "SCHRECEIVE_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     * @param schreceiveDateList The collection of schreceiveDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_NotInScope(Collection<String> schreceiveDateList) {
        doSetSchreceiveDate_NotInScope(schreceiveDateList);
    }

    protected void doSetSchreceiveDate_NotInScope(Collection<String> schreceiveDateList) {
        regINS(CK_NINS, cTL(schreceiveDateList), xgetCValueSchreceiveDate(), "SCHRECEIVE_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(255)} <br>
     * <pre>e.g. setSchreceiveDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param schreceiveDate The value of schreceiveDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSchreceiveDate_LikeSearch(String schreceiveDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(schreceiveDate), xgetCValueSchreceiveDate(), "SCHRECEIVE_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     * @param schreceiveDate The value of schreceiveDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSchreceiveDate_NotLikeSearch(String schreceiveDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(schreceiveDate), xgetCValueSchreceiveDate(), "SCHRECEIVE_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     * @param schreceiveDate The value of schreceiveDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_PrefixSearch(String schreceiveDate) {
        setSchreceiveDate_LikeSearch(schreceiveDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     */
    public void setSchreceiveDate_IsNull() { regSchreceiveDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     */
    public void setSchreceiveDate_IsNullOrEmpty() { regSchreceiveDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     */
    public void setSchreceiveDate_IsNotNull() { regSchreceiveDate(CK_ISNN, DOBJ); }

    protected void regSchreceiveDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchreceiveDate(), "SCHRECEIVE_DATE"); }
    protected abstract ConditionValue xgetCValueSchreceiveDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     * @param schreceiveNum The value of schreceiveNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveNum_Equal(String schreceiveNum) {
        doSetSchreceiveNum_Equal(fRES(schreceiveNum));
    }

    protected void doSetSchreceiveNum_Equal(String schreceiveNum) {
        regSchreceiveNum(CK_EQ, schreceiveNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     * @param schreceiveNum The value of schreceiveNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveNum_NotEqual(String schreceiveNum) {
        doSetSchreceiveNum_NotEqual(fRES(schreceiveNum));
    }

    protected void doSetSchreceiveNum_NotEqual(String schreceiveNum) {
        regSchreceiveNum(CK_NES, schreceiveNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     * @param schreceiveNum The value of schreceiveNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveNum_GreaterThan(String schreceiveNum) {
        regSchreceiveNum(CK_GT, fRES(schreceiveNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     * @param schreceiveNum The value of schreceiveNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveNum_LessThan(String schreceiveNum) {
        regSchreceiveNum(CK_LT, fRES(schreceiveNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     * @param schreceiveNum The value of schreceiveNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveNum_GreaterEqual(String schreceiveNum) {
        regSchreceiveNum(CK_GE, fRES(schreceiveNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     * @param schreceiveNum The value of schreceiveNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveNum_LessEqual(String schreceiveNum) {
        regSchreceiveNum(CK_LE, fRES(schreceiveNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     * @param schreceiveNumList The collection of schreceiveNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveNum_InScope(Collection<String> schreceiveNumList) {
        doSetSchreceiveNum_InScope(schreceiveNumList);
    }

    protected void doSetSchreceiveNum_InScope(Collection<String> schreceiveNumList) {
        regINS(CK_INS, cTL(schreceiveNumList), xgetCValueSchreceiveNum(), "SCHRECEIVE_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     * @param schreceiveNumList The collection of schreceiveNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveNum_NotInScope(Collection<String> schreceiveNumList) {
        doSetSchreceiveNum_NotInScope(schreceiveNumList);
    }

    protected void doSetSchreceiveNum_NotInScope(Collection<String> schreceiveNumList) {
        regINS(CK_NINS, cTL(schreceiveNumList), xgetCValueSchreceiveNum(), "SCHRECEIVE_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_NUM: {varchar(255)} <br>
     * <pre>e.g. setSchreceiveNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param schreceiveNum The value of schreceiveNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSchreceiveNum_LikeSearch(String schreceiveNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(schreceiveNum), xgetCValueSchreceiveNum(), "SCHRECEIVE_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     * @param schreceiveNum The value of schreceiveNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSchreceiveNum_NotLikeSearch(String schreceiveNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(schreceiveNum), xgetCValueSchreceiveNum(), "SCHRECEIVE_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     * @param schreceiveNum The value of schreceiveNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveNum_PrefixSearch(String schreceiveNum) {
        setSchreceiveNum_LikeSearch(schreceiveNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     */
    public void setSchreceiveNum_IsNull() { regSchreceiveNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     */
    public void setSchreceiveNum_IsNullOrEmpty() { regSchreceiveNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     */
    public void setSchreceiveNum_IsNotNull() { regSchreceiveNum(CK_ISNN, DOBJ); }

    protected void regSchreceiveNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchreceiveNum(), "SCHRECEIVE_NUM"); }
    protected abstract ConditionValue xgetCValueSchreceiveNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     * @param transportPriority The value of transportPriority as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportPriority_Equal(String transportPriority) {
        doSetTransportPriority_Equal(fRES(transportPriority));
    }

    protected void doSetTransportPriority_Equal(String transportPriority) {
        regTransportPriority(CK_EQ, transportPriority);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     * @param transportPriority The value of transportPriority as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportPriority_NotEqual(String transportPriority) {
        doSetTransportPriority_NotEqual(fRES(transportPriority));
    }

    protected void doSetTransportPriority_NotEqual(String transportPriority) {
        regTransportPriority(CK_NES, transportPriority);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     * @param transportPriority The value of transportPriority as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportPriority_GreaterThan(String transportPriority) {
        regTransportPriority(CK_GT, fRES(transportPriority));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     * @param transportPriority The value of transportPriority as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportPriority_LessThan(String transportPriority) {
        regTransportPriority(CK_LT, fRES(transportPriority));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     * @param transportPriority The value of transportPriority as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportPriority_GreaterEqual(String transportPriority) {
        regTransportPriority(CK_GE, fRES(transportPriority));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     * @param transportPriority The value of transportPriority as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportPriority_LessEqual(String transportPriority) {
        regTransportPriority(CK_LE, fRES(transportPriority));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     * @param transportPriorityList The collection of transportPriority as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportPriority_InScope(Collection<String> transportPriorityList) {
        doSetTransportPriority_InScope(transportPriorityList);
    }

    protected void doSetTransportPriority_InScope(Collection<String> transportPriorityList) {
        regINS(CK_INS, cTL(transportPriorityList), xgetCValueTransportPriority(), "TRANSPORT_PRIORITY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     * @param transportPriorityList The collection of transportPriority as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportPriority_NotInScope(Collection<String> transportPriorityList) {
        doSetTransportPriority_NotInScope(transportPriorityList);
    }

    protected void doSetTransportPriority_NotInScope(Collection<String> transportPriorityList) {
        regINS(CK_NINS, cTL(transportPriorityList), xgetCValueTransportPriority(), "TRANSPORT_PRIORITY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORT_PRIORITY: {varchar(255)} <br>
     * <pre>e.g. setTransportPriority_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transportPriority The value of transportPriority as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransportPriority_LikeSearch(String transportPriority, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transportPriority), xgetCValueTransportPriority(), "TRANSPORT_PRIORITY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     * @param transportPriority The value of transportPriority as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransportPriority_NotLikeSearch(String transportPriority, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transportPriority), xgetCValueTransportPriority(), "TRANSPORT_PRIORITY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     * @param transportPriority The value of transportPriority as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportPriority_PrefixSearch(String transportPriority) {
        setTransportPriority_LikeSearch(transportPriority, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     */
    public void setTransportPriority_IsNull() { regTransportPriority(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     */
    public void setTransportPriority_IsNullOrEmpty() { regTransportPriority(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     */
    public void setTransportPriority_IsNotNull() { regTransportPriority(CK_ISNN, DOBJ); }

    protected void regTransportPriority(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportPriority(), "TRANSPORT_PRIORITY"); }
    protected abstract ConditionValue xgetCValueTransportPriority();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {varchar(255)}
     * @param itemOrderby The value of itemOrderby as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOrderby_Equal(String itemOrderby) {
        doSetItemOrderby_Equal(fRES(itemOrderby));
    }

    protected void doSetItemOrderby_Equal(String itemOrderby) {
        regItemOrderby(CK_EQ, itemOrderby);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {varchar(255)}
     * @param itemOrderby The value of itemOrderby as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOrderby_NotEqual(String itemOrderby) {
        doSetItemOrderby_NotEqual(fRES(itemOrderby));
    }

    protected void doSetItemOrderby_NotEqual(String itemOrderby) {
        regItemOrderby(CK_NES, itemOrderby);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {varchar(255)}
     * @param itemOrderby The value of itemOrderby as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOrderby_GreaterThan(String itemOrderby) {
        regItemOrderby(CK_GT, fRES(itemOrderby));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {varchar(255)}
     * @param itemOrderby The value of itemOrderby as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOrderby_LessThan(String itemOrderby) {
        regItemOrderby(CK_LT, fRES(itemOrderby));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {varchar(255)}
     * @param itemOrderby The value of itemOrderby as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOrderby_GreaterEqual(String itemOrderby) {
        regItemOrderby(CK_GE, fRES(itemOrderby));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {varchar(255)}
     * @param itemOrderby The value of itemOrderby as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOrderby_LessEqual(String itemOrderby) {
        regItemOrderby(CK_LE, fRES(itemOrderby));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_ORDERBY: {varchar(255)}
     * @param itemOrderbyList The collection of itemOrderby as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOrderby_InScope(Collection<String> itemOrderbyList) {
        doSetItemOrderby_InScope(itemOrderbyList);
    }

    protected void doSetItemOrderby_InScope(Collection<String> itemOrderbyList) {
        regINS(CK_INS, cTL(itemOrderbyList), xgetCValueItemOrderby(), "ITEM_ORDERBY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_ORDERBY: {varchar(255)}
     * @param itemOrderbyList The collection of itemOrderby as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOrderby_NotInScope(Collection<String> itemOrderbyList) {
        doSetItemOrderby_NotInScope(itemOrderbyList);
    }

    protected void doSetItemOrderby_NotInScope(Collection<String> itemOrderbyList) {
        regINS(CK_NINS, cTL(itemOrderbyList), xgetCValueItemOrderby(), "ITEM_ORDERBY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_ORDERBY: {varchar(255)} <br>
     * <pre>e.g. setItemOrderby_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemOrderby The value of itemOrderby as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemOrderby_LikeSearch(String itemOrderby, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemOrderby), xgetCValueItemOrderby(), "ITEM_ORDERBY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_ORDERBY: {varchar(255)}
     * @param itemOrderby The value of itemOrderby as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemOrderby_NotLikeSearch(String itemOrderby, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemOrderby), xgetCValueItemOrderby(), "ITEM_ORDERBY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_ORDERBY: {varchar(255)}
     * @param itemOrderby The value of itemOrderby as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOrderby_PrefixSearch(String itemOrderby) {
        setItemOrderby_LikeSearch(itemOrderby, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {varchar(255)}
     */
    public void setItemOrderby_IsNull() { regItemOrderby(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {varchar(255)}
     */
    public void setItemOrderby_IsNullOrEmpty() { regItemOrderby(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {varchar(255)}
     */
    public void setItemOrderby_IsNotNull() { regItemOrderby(CK_ISNN, DOBJ); }

    protected void regItemOrderby(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemOrderby(), "ITEM_ORDERBY"); }
    protected abstract ConditionValue xgetCValueItemOrderby();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USETYPE: {varchar(255)}
     * @param usetype The value of usetype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsetype_Equal(String usetype) {
        doSetUsetype_Equal(fRES(usetype));
    }

    protected void doSetUsetype_Equal(String usetype) {
        regUsetype(CK_EQ, usetype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USETYPE: {varchar(255)}
     * @param usetype The value of usetype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsetype_NotEqual(String usetype) {
        doSetUsetype_NotEqual(fRES(usetype));
    }

    protected void doSetUsetype_NotEqual(String usetype) {
        regUsetype(CK_NES, usetype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USETYPE: {varchar(255)}
     * @param usetype The value of usetype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsetype_GreaterThan(String usetype) {
        regUsetype(CK_GT, fRES(usetype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USETYPE: {varchar(255)}
     * @param usetype The value of usetype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsetype_LessThan(String usetype) {
        regUsetype(CK_LT, fRES(usetype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USETYPE: {varchar(255)}
     * @param usetype The value of usetype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsetype_GreaterEqual(String usetype) {
        regUsetype(CK_GE, fRES(usetype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USETYPE: {varchar(255)}
     * @param usetype The value of usetype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsetype_LessEqual(String usetype) {
        regUsetype(CK_LE, fRES(usetype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USETYPE: {varchar(255)}
     * @param usetypeList The collection of usetype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsetype_InScope(Collection<String> usetypeList) {
        doSetUsetype_InScope(usetypeList);
    }

    protected void doSetUsetype_InScope(Collection<String> usetypeList) {
        regINS(CK_INS, cTL(usetypeList), xgetCValueUsetype(), "USETYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USETYPE: {varchar(255)}
     * @param usetypeList The collection of usetype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsetype_NotInScope(Collection<String> usetypeList) {
        doSetUsetype_NotInScope(usetypeList);
    }

    protected void doSetUsetype_NotInScope(Collection<String> usetypeList) {
        regINS(CK_NINS, cTL(usetypeList), xgetCValueUsetype(), "USETYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USETYPE: {varchar(255)} <br>
     * <pre>e.g. setUsetype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param usetype The value of usetype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUsetype_LikeSearch(String usetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(usetype), xgetCValueUsetype(), "USETYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USETYPE: {varchar(255)}
     * @param usetype The value of usetype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUsetype_NotLikeSearch(String usetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(usetype), xgetCValueUsetype(), "USETYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USETYPE: {varchar(255)}
     * @param usetype The value of usetype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsetype_PrefixSearch(String usetype) {
        setUsetype_LikeSearch(usetype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USETYPE: {varchar(255)}
     */
    public void setUsetype_IsNull() { regUsetype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USETYPE: {varchar(255)}
     */
    public void setUsetype_IsNullOrEmpty() { regUsetype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USETYPE: {varchar(255)}
     */
    public void setUsetype_IsNotNull() { regUsetype(CK_ISNN, DOBJ); }

    protected void regUsetype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsetype(), "USETYPE"); }
    protected abstract ConditionValue xgetCValueUsetype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(255)}
     * @param locgroup The value of locgroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_Equal(String locgroup) {
        doSetLocgroup_Equal(fRES(locgroup));
    }

    protected void doSetLocgroup_Equal(String locgroup) {
        regLocgroup(CK_EQ, locgroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(255)}
     * @param locgroup The value of locgroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_NotEqual(String locgroup) {
        doSetLocgroup_NotEqual(fRES(locgroup));
    }

    protected void doSetLocgroup_NotEqual(String locgroup) {
        regLocgroup(CK_NES, locgroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(255)}
     * @param locgroup The value of locgroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_GreaterThan(String locgroup) {
        regLocgroup(CK_GT, fRES(locgroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(255)}
     * @param locgroup The value of locgroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_LessThan(String locgroup) {
        regLocgroup(CK_LT, fRES(locgroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(255)}
     * @param locgroup The value of locgroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_GreaterEqual(String locgroup) {
        regLocgroup(CK_GE, fRES(locgroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(255)}
     * @param locgroup The value of locgroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_LessEqual(String locgroup) {
        regLocgroup(CK_LE, fRES(locgroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(255)}
     * @param locgroupList The collection of locgroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_InScope(Collection<String> locgroupList) {
        doSetLocgroup_InScope(locgroupList);
    }

    protected void doSetLocgroup_InScope(Collection<String> locgroupList) {
        regINS(CK_INS, cTL(locgroupList), xgetCValueLocgroup(), "LOCGROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(255)}
     * @param locgroupList The collection of locgroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_NotInScope(Collection<String> locgroupList) {
        doSetLocgroup_NotInScope(locgroupList);
    }

    protected void doSetLocgroup_NotInScope(Collection<String> locgroupList) {
        regINS(CK_NINS, cTL(locgroupList), xgetCValueLocgroup(), "LOCGROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(255)} <br>
     * <pre>e.g. setLocgroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locgroup The value of locgroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocgroup_LikeSearch(String locgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locgroup), xgetCValueLocgroup(), "LOCGROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(255)}
     * @param locgroup The value of locgroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocgroup_NotLikeSearch(String locgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locgroup), xgetCValueLocgroup(), "LOCGROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(255)}
     * @param locgroup The value of locgroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_PrefixSearch(String locgroup) {
        setLocgroup_LikeSearch(locgroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(255)}
     */
    public void setLocgroup_IsNull() { regLocgroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(255)}
     */
    public void setLocgroup_IsNullOrEmpty() { regLocgroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(255)}
     */
    public void setLocgroup_IsNotNull() { regLocgroup(CK_ISNN, DOBJ); }

    protected void regLocgroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocgroup(), "LOCGROUP"); }
    protected abstract ConditionValue xgetCValueLocgroup();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUPNAME: {varchar(255)}
     * @param locgroupname The value of locgroupname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroupname_Equal(String locgroupname) {
        doSetLocgroupname_Equal(fRES(locgroupname));
    }

    protected void doSetLocgroupname_Equal(String locgroupname) {
        regLocgroupname(CK_EQ, locgroupname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUPNAME: {varchar(255)}
     * @param locgroupname The value of locgroupname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroupname_NotEqual(String locgroupname) {
        doSetLocgroupname_NotEqual(fRES(locgroupname));
    }

    protected void doSetLocgroupname_NotEqual(String locgroupname) {
        regLocgroupname(CK_NES, locgroupname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUPNAME: {varchar(255)}
     * @param locgroupname The value of locgroupname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroupname_GreaterThan(String locgroupname) {
        regLocgroupname(CK_GT, fRES(locgroupname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUPNAME: {varchar(255)}
     * @param locgroupname The value of locgroupname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroupname_LessThan(String locgroupname) {
        regLocgroupname(CK_LT, fRES(locgroupname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUPNAME: {varchar(255)}
     * @param locgroupname The value of locgroupname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroupname_GreaterEqual(String locgroupname) {
        regLocgroupname(CK_GE, fRES(locgroupname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUPNAME: {varchar(255)}
     * @param locgroupname The value of locgroupname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroupname_LessEqual(String locgroupname) {
        regLocgroupname(CK_LE, fRES(locgroupname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCGROUPNAME: {varchar(255)}
     * @param locgroupnameList The collection of locgroupname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroupname_InScope(Collection<String> locgroupnameList) {
        doSetLocgroupname_InScope(locgroupnameList);
    }

    protected void doSetLocgroupname_InScope(Collection<String> locgroupnameList) {
        regINS(CK_INS, cTL(locgroupnameList), xgetCValueLocgroupname(), "LOCGROUPNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCGROUPNAME: {varchar(255)}
     * @param locgroupnameList The collection of locgroupname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroupname_NotInScope(Collection<String> locgroupnameList) {
        doSetLocgroupname_NotInScope(locgroupnameList);
    }

    protected void doSetLocgroupname_NotInScope(Collection<String> locgroupnameList) {
        regINS(CK_NINS, cTL(locgroupnameList), xgetCValueLocgroupname(), "LOCGROUPNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUPNAME: {varchar(255)} <br>
     * <pre>e.g. setLocgroupname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locgroupname The value of locgroupname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocgroupname_LikeSearch(String locgroupname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locgroupname), xgetCValueLocgroupname(), "LOCGROUPNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUPNAME: {varchar(255)}
     * @param locgroupname The value of locgroupname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocgroupname_NotLikeSearch(String locgroupname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locgroupname), xgetCValueLocgroupname(), "LOCGROUPNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUPNAME: {varchar(255)}
     * @param locgroupname The value of locgroupname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroupname_PrefixSearch(String locgroupname) {
        setLocgroupname_LikeSearch(locgroupname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCGROUPNAME: {varchar(255)}
     */
    public void setLocgroupname_IsNull() { regLocgroupname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCGROUPNAME: {varchar(255)}
     */
    public void setLocgroupname_IsNullOrEmpty() { regLocgroupname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCGROUPNAME: {varchar(255)}
     */
    public void setLocgroupname_IsNotNull() { regLocgroupname(CK_ISNN, DOBJ); }

    protected void regLocgroupname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocgroupname(), "LOCGROUPNAME"); }
    protected abstract ConditionValue xgetCValueLocgroupname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_Equal(String otherrefno1) {
        doSetOtherrefno1_Equal(fRES(otherrefno1));
    }

    protected void doSetOtherrefno1_Equal(String otherrefno1) {
        regOtherrefno1(CK_EQ, otherrefno1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_NotEqual(String otherrefno1) {
        doSetOtherrefno1_NotEqual(fRES(otherrefno1));
    }

    protected void doSetOtherrefno1_NotEqual(String otherrefno1) {
        regOtherrefno1(CK_NES, otherrefno1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_GreaterThan(String otherrefno1) {
        regOtherrefno1(CK_GT, fRES(otherrefno1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_LessThan(String otherrefno1) {
        regOtherrefno1(CK_LT, fRES(otherrefno1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_GreaterEqual(String otherrefno1) {
        regOtherrefno1(CK_GE, fRES(otherrefno1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_LessEqual(String otherrefno1) {
        regOtherrefno1(CK_LE, fRES(otherrefno1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1List The collection of otherrefno1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_InScope(Collection<String> otherrefno1List) {
        doSetOtherrefno1_InScope(otherrefno1List);
    }

    protected void doSetOtherrefno1_InScope(Collection<String> otherrefno1List) {
        regINS(CK_INS, cTL(otherrefno1List), xgetCValueOtherrefno1(), "OTHERREFNO1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1List The collection of otherrefno1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_NotInScope(Collection<String> otherrefno1List) {
        doSetOtherrefno1_NotInScope(otherrefno1List);
    }

    protected void doSetOtherrefno1_NotInScope(Collection<String> otherrefno1List) {
        regINS(CK_NINS, cTL(otherrefno1List), xgetCValueOtherrefno1(), "OTHERREFNO1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(255)} <br>
     * <pre>e.g. setOtherrefno1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherrefno1 The value of otherrefno1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherrefno1_LikeSearch(String otherrefno1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherrefno1), xgetCValueOtherrefno1(), "OTHERREFNO1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherrefno1_NotLikeSearch(String otherrefno1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherrefno1), xgetCValueOtherrefno1(), "OTHERREFNO1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     * @param otherrefno1 The value of otherrefno1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_PrefixSearch(String otherrefno1) {
        setOtherrefno1_LikeSearch(otherrefno1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     */
    public void setOtherrefno1_IsNull() { regOtherrefno1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     */
    public void setOtherrefno1_IsNullOrEmpty() { regOtherrefno1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(255)}
     */
    public void setOtherrefno1_IsNotNull() { regOtherrefno1(CK_ISNN, DOBJ); }

    protected void regOtherrefno1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherrefno1(), "OTHERREFNO1"); }
    protected abstract ConditionValue xgetCValueOtherrefno1();

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
    public HpSLCFunction<EStockinfoimportCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EStockinfoimportCB.class);
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
    public HpSLCFunction<EStockinfoimportCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EStockinfoimportCB.class);
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
    public HpSLCFunction<EStockinfoimportCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EStockinfoimportCB.class);
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
    public HpSLCFunction<EStockinfoimportCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EStockinfoimportCB.class);
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
    public HpSLCFunction<EStockinfoimportCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EStockinfoimportCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EStockinfoimportCB&gt;() {
     *     public void query(EStockinfoimportCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EStockinfoimportCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EStockinfoimportCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EStockinfoimportCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EStockinfoimportCQ sq);

    protected EStockinfoimportCB xcreateScalarConditionCB() {
        EStockinfoimportCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EStockinfoimportCB xcreateScalarConditionPartitionByCB() {
        EStockinfoimportCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EStockinfoimportCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EStockinfoimportCB cb = new EStockinfoimportCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CENTER_STOCK_INFO_SEND_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EStockinfoimportCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EStockinfoimportCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EStockinfoimportCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EStockinfoimportCB cb = new EStockinfoimportCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CENTER_STOCK_INFO_SEND_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EStockinfoimportCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EStockinfoimportCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EStockinfoimportCB cb = new EStockinfoimportCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EStockinfoimportCQ sq);

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
    protected EStockinfoimportCB newMyCB() {
        return new EStockinfoimportCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EStockinfoimportCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

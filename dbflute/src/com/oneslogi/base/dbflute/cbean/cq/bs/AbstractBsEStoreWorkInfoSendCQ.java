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
 * The abstract condition-query of E_STORE_WORK_INFO_SEND.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEStoreWorkInfoSendCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEStoreWorkInfoSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_STORE_WORK_INFO_SEND";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeWorkInfoSendId The value of storeWorkInfoSendId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreWorkInfoSendId_Equal(Long storeWorkInfoSendId) {
        doSetStoreWorkInfoSendId_Equal(storeWorkInfoSendId);
    }

    protected void doSetStoreWorkInfoSendId_Equal(Long storeWorkInfoSendId) {
        regStoreWorkInfoSendId(CK_EQ, storeWorkInfoSendId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeWorkInfoSendId The value of storeWorkInfoSendId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreWorkInfoSendId_NotEqual(Long storeWorkInfoSendId) {
        doSetStoreWorkInfoSendId_NotEqual(storeWorkInfoSendId);
    }

    protected void doSetStoreWorkInfoSendId_NotEqual(Long storeWorkInfoSendId) {
        regStoreWorkInfoSendId(CK_NES, storeWorkInfoSendId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeWorkInfoSendId The value of storeWorkInfoSendId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreWorkInfoSendId_GreaterThan(Long storeWorkInfoSendId) {
        regStoreWorkInfoSendId(CK_GT, storeWorkInfoSendId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeWorkInfoSendId The value of storeWorkInfoSendId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreWorkInfoSendId_LessThan(Long storeWorkInfoSendId) {
        regStoreWorkInfoSendId(CK_LT, storeWorkInfoSendId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeWorkInfoSendId The value of storeWorkInfoSendId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreWorkInfoSendId_GreaterEqual(Long storeWorkInfoSendId) {
        regStoreWorkInfoSendId(CK_GE, storeWorkInfoSendId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeWorkInfoSendId The value of storeWorkInfoSendId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreWorkInfoSendId_LessEqual(Long storeWorkInfoSendId) {
        regStoreWorkInfoSendId(CK_LE, storeWorkInfoSendId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of storeWorkInfoSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeWorkInfoSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreWorkInfoSendId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreWorkInfoSendId(), "STORE_WORK_INFO_SEND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeWorkInfoSendIdList The collection of storeWorkInfoSendId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreWorkInfoSendId_InScope(Collection<Long> storeWorkInfoSendIdList) {
        doSetStoreWorkInfoSendId_InScope(storeWorkInfoSendIdList);
    }

    protected void doSetStoreWorkInfoSendId_InScope(Collection<Long> storeWorkInfoSendIdList) {
        regINS(CK_INS, cTL(storeWorkInfoSendIdList), xgetCValueStoreWorkInfoSendId(), "STORE_WORK_INFO_SEND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param storeWorkInfoSendIdList The collection of storeWorkInfoSendId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreWorkInfoSendId_NotInScope(Collection<Long> storeWorkInfoSendIdList) {
        doSetStoreWorkInfoSendId_NotInScope(storeWorkInfoSendIdList);
    }

    protected void doSetStoreWorkInfoSendId_NotInScope(Collection<Long> storeWorkInfoSendIdList) {
        regINS(CK_NINS, cTL(storeWorkInfoSendIdList), xgetCValueStoreWorkInfoSendId(), "STORE_WORK_INFO_SEND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setStoreWorkInfoSendId_IsNull() { regStoreWorkInfoSendId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setStoreWorkInfoSendId_IsNotNull() { regStoreWorkInfoSendId(CK_ISNN, DOBJ); }

    protected void regStoreWorkInfoSendId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreWorkInfoSendId(), "STORE_WORK_INFO_SEND_ID"); }
    protected abstract ConditionValue xgetCValueStoreWorkInfoSendId();

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
     * WarehouseGroup: {NotNull, varchar(30)}
     * @param warehousegroup The value of warehousegroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_Equal(String warehousegroup) {
        doSetWarehousegroup_Equal(fRES(warehousegroup));
    }

    protected void doSetWarehousegroup_Equal(String warehousegroup) {
        regWarehousegroup(CK_EQ, warehousegroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseGroup: {NotNull, varchar(30)}
     * @param warehousegroup The value of warehousegroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_NotEqual(String warehousegroup) {
        doSetWarehousegroup_NotEqual(fRES(warehousegroup));
    }

    protected void doSetWarehousegroup_NotEqual(String warehousegroup) {
        regWarehousegroup(CK_NES, warehousegroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseGroup: {NotNull, varchar(30)}
     * @param warehousegroup The value of warehousegroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_GreaterThan(String warehousegroup) {
        regWarehousegroup(CK_GT, fRES(warehousegroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseGroup: {NotNull, varchar(30)}
     * @param warehousegroup The value of warehousegroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_LessThan(String warehousegroup) {
        regWarehousegroup(CK_LT, fRES(warehousegroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseGroup: {NotNull, varchar(30)}
     * @param warehousegroup The value of warehousegroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_GreaterEqual(String warehousegroup) {
        regWarehousegroup(CK_GE, fRES(warehousegroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WarehouseGroup: {NotNull, varchar(30)}
     * @param warehousegroup The value of warehousegroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_LessEqual(String warehousegroup) {
        regWarehousegroup(CK_LE, fRES(warehousegroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WarehouseGroup: {NotNull, varchar(30)}
     * @param warehousegroupList The collection of warehousegroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_InScope(Collection<String> warehousegroupList) {
        doSetWarehousegroup_InScope(warehousegroupList);
    }

    protected void doSetWarehousegroup_InScope(Collection<String> warehousegroupList) {
        regINS(CK_INS, cTL(warehousegroupList), xgetCValueWarehousegroup(), "WarehouseGroup");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WarehouseGroup: {NotNull, varchar(30)}
     * @param warehousegroupList The collection of warehousegroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_NotInScope(Collection<String> warehousegroupList) {
        doSetWarehousegroup_NotInScope(warehousegroupList);
    }

    protected void doSetWarehousegroup_NotInScope(Collection<String> warehousegroupList) {
        regINS(CK_NINS, cTL(warehousegroupList), xgetCValueWarehousegroup(), "WarehouseGroup");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WarehouseGroup: {NotNull, varchar(30)} <br>
     * <pre>e.g. setWarehousegroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousegroup The value of warehousegroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousegroup_LikeSearch(String warehousegroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousegroup), xgetCValueWarehousegroup(), "WarehouseGroup", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WarehouseGroup: {NotNull, varchar(30)}
     * @param warehousegroup The value of warehousegroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousegroup_NotLikeSearch(String warehousegroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousegroup), xgetCValueWarehousegroup(), "WarehouseGroup", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WarehouseGroup: {NotNull, varchar(30)}
     * @param warehousegroup The value of warehousegroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousegroup_PrefixSearch(String warehousegroup) {
        setWarehousegroup_LikeSearch(warehousegroup, xcLSOPPre());
    }

    protected void regWarehousegroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousegroup(), "WarehouseGroup"); }
    protected abstract ConditionValue xgetCValueWarehousegroup();

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
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_Equal(String carrierno) {
        doSetCarrierno_Equal(fRES(carrierno));
    }

    protected void doSetCarrierno_Equal(String carrierno) {
        regCarrierno(CK_EQ, carrierno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_NotEqual(String carrierno) {
        doSetCarrierno_NotEqual(fRES(carrierno));
    }

    protected void doSetCarrierno_NotEqual(String carrierno) {
        regCarrierno(CK_NES, carrierno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_GreaterThan(String carrierno) {
        regCarrierno(CK_GT, fRES(carrierno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_LessThan(String carrierno) {
        regCarrierno(CK_LT, fRES(carrierno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_GreaterEqual(String carrierno) {
        regCarrierno(CK_GE, fRES(carrierno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_LessEqual(String carrierno) {
        regCarrierno(CK_LE, fRES(carrierno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carriernoList The collection of carrierno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_InScope(Collection<String> carriernoList) {
        doSetCarrierno_InScope(carriernoList);
    }

    protected void doSetCarrierno_InScope(Collection<String> carriernoList) {
        regINS(CK_INS, cTL(carriernoList), xgetCValueCarrierno(), "CARRIERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carriernoList The collection of carrierno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_NotInScope(Collection<String> carriernoList) {
        doSetCarrierno_NotInScope(carriernoList);
    }

    protected void doSetCarrierno_NotInScope(Collection<String> carriernoList) {
        regINS(CK_NINS, cTL(carriernoList), xgetCValueCarrierno(), "CARRIERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(255)} <br>
     * <pre>e.g. setCarrierno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierno The value of carrierno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierno_LikeSearch(String carrierno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierno), xgetCValueCarrierno(), "CARRIERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierno_NotLikeSearch(String carrierno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierno), xgetCValueCarrierno(), "CARRIERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(255)}
     * @param carrierno The value of carrierno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_PrefixSearch(String carrierno) {
        setCarrierno_LikeSearch(carrierno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     */
    public void setCarrierno_IsNull() { regCarrierno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     */
    public void setCarrierno_IsNullOrEmpty() { regCarrierno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(255)}
     */
    public void setCarrierno_IsNotNull() { regCarrierno(CK_ISNN, DOBJ); }

    protected void regCarrierno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierno(), "CARRIERNO"); }
    protected abstract ConditionValue xgetCValueCarrierno();

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
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_Equal(String lot3) {
        doSetLot3_Equal(fRES(lot3));
    }

    protected void doSetLot3_Equal(String lot3) {
        regLot3(CK_EQ, lot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotEqual(String lot3) {
        doSetLot3_NotEqual(fRES(lot3));
    }

    protected void doSetLot3_NotEqual(String lot3) {
        regLot3(CK_NES, lot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterThan(String lot3) {
        regLot3(CK_GT, fRES(lot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessThan(String lot3) {
        regLot3(CK_LT, fRES(lot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterEqual(String lot3) {
        regLot3(CK_GE, fRES(lot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessEqual(String lot3) {
        regLot3(CK_LE, fRES(lot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3List The collection of lot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_InScope(Collection<String> lot3List) {
        doSetLot3_InScope(lot3List);
    }

    protected void doSetLot3_InScope(Collection<String> lot3List) {
        regINS(CK_INS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3List The collection of lot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotInScope(Collection<String> lot3List) {
        doSetLot3_NotInScope(lot3List);
    }

    protected void doSetLot3_NotInScope(Collection<String> lot3List) {
        regINS(CK_NINS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)} <br>
     * <pre>e.g. setLot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot3 The value of lot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot3_LikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot3_NotLikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(255)}
     * @param lot3 The value of lot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_PrefixSearch(String lot3) {
        setLot3_LikeSearch(lot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     */
    public void setLot3_IsNull() { regLot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     */
    public void setLot3_IsNullOrEmpty() { regLot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(255)}
     */
    public void setLot3_IsNotNull() { regLot3(CK_ISNN, DOBJ); }

    protected void regLot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot3(), "LOT3"); }
    protected abstract ConditionValue xgetCValueLot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_Equal(String lot4) {
        doSetLot4_Equal(fRES(lot4));
    }

    protected void doSetLot4_Equal(String lot4) {
        regLot4(CK_EQ, lot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotEqual(String lot4) {
        doSetLot4_NotEqual(fRES(lot4));
    }

    protected void doSetLot4_NotEqual(String lot4) {
        regLot4(CK_NES, lot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterThan(String lot4) {
        regLot4(CK_GT, fRES(lot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessThan(String lot4) {
        regLot4(CK_LT, fRES(lot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterEqual(String lot4) {
        regLot4(CK_GE, fRES(lot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessEqual(String lot4) {
        regLot4(CK_LE, fRES(lot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4List The collection of lot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_InScope(Collection<String> lot4List) {
        doSetLot4_InScope(lot4List);
    }

    protected void doSetLot4_InScope(Collection<String> lot4List) {
        regINS(CK_INS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4List The collection of lot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotInScope(Collection<String> lot4List) {
        doSetLot4_NotInScope(lot4List);
    }

    protected void doSetLot4_NotInScope(Collection<String> lot4List) {
        regINS(CK_NINS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)} <br>
     * <pre>e.g. setLot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot4 The value of lot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot4_LikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot4_NotLikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_PrefixSearch(String lot4) {
        setLot4_LikeSearch(lot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     */
    public void setLot4_IsNull() { regLot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     */
    public void setLot4_IsNullOrEmpty() { regLot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     */
    public void setLot4_IsNotNull() { regLot4(CK_ISNN, DOBJ); }

    protected void regLot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot4(), "LOT4"); }
    protected abstract ConditionValue xgetCValueLot4();

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
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_Equal(String fromfax) {
        doSetFromfax_Equal(fRES(fromfax));
    }

    protected void doSetFromfax_Equal(String fromfax) {
        regFromfax(CK_EQ, fromfax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_NotEqual(String fromfax) {
        doSetFromfax_NotEqual(fRES(fromfax));
    }

    protected void doSetFromfax_NotEqual(String fromfax) {
        regFromfax(CK_NES, fromfax);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_GreaterThan(String fromfax) {
        regFromfax(CK_GT, fRES(fromfax));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_LessThan(String fromfax) {
        regFromfax(CK_LT, fRES(fromfax));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_GreaterEqual(String fromfax) {
        regFromfax(CK_GE, fRES(fromfax));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_LessEqual(String fromfax) {
        regFromfax(CK_LE, fRES(fromfax));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfaxList The collection of fromfax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_InScope(Collection<String> fromfaxList) {
        doSetFromfax_InScope(fromfaxList);
    }

    protected void doSetFromfax_InScope(Collection<String> fromfaxList) {
        regINS(CK_INS, cTL(fromfaxList), xgetCValueFromfax(), "FROMFAX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfaxList The collection of fromfax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_NotInScope(Collection<String> fromfaxList) {
        doSetFromfax_NotInScope(fromfaxList);
    }

    protected void doSetFromfax_NotInScope(Collection<String> fromfaxList) {
        regINS(CK_NINS, cTL(fromfaxList), xgetCValueFromfax(), "FROMFAX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(255)} <br>
     * <pre>e.g. setFromfax_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromfax The value of fromfax as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromfax_LikeSearch(String fromfax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromfax), xgetCValueFromfax(), "FROMFAX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromfax_NotLikeSearch(String fromfax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromfax), xgetCValueFromfax(), "FROMFAX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(255)}
     * @param fromfax The value of fromfax as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_PrefixSearch(String fromfax) {
        setFromfax_LikeSearch(fromfax, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     */
    public void setFromfax_IsNull() { regFromfax(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     */
    public void setFromfax_IsNullOrEmpty() { regFromfax(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(255)}
     */
    public void setFromfax_IsNotNull() { regFromfax(CK_ISNN, DOBJ); }

    protected void regFromfax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromfax(), "FROMFAX"); }
    protected abstract ConditionValue xgetCValueFromfax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_Equal(String lot2) {
        doSetLot2_Equal(fRES(lot2));
    }

    protected void doSetLot2_Equal(String lot2) {
        regLot2(CK_EQ, lot2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_NotEqual(String lot2) {
        doSetLot2_NotEqual(fRES(lot2));
    }

    protected void doSetLot2_NotEqual(String lot2) {
        regLot2(CK_NES, lot2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterThan(String lot2) {
        regLot2(CK_GT, fRES(lot2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessThan(String lot2) {
        regLot2(CK_LT, fRES(lot2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterEqual(String lot2) {
        regLot2(CK_GE, fRES(lot2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessEqual(String lot2) {
        regLot2(CK_LE, fRES(lot2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2List The collection of lot2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_InScope(Collection<String> lot2List) {
        doSetLot2_InScope(lot2List);
    }

    protected void doSetLot2_InScope(Collection<String> lot2List) {
        regINS(CK_INS, cTL(lot2List), xgetCValueLot2(), "LOT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2List The collection of lot2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_NotInScope(Collection<String> lot2List) {
        doSetLot2_NotInScope(lot2List);
    }

    protected void doSetLot2_NotInScope(Collection<String> lot2List) {
        regINS(CK_NINS, cTL(lot2List), xgetCValueLot2(), "LOT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(255)} <br>
     * <pre>e.g. setLot2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot2 The value of lot2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot2_LikeSearch(String lot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot2), xgetCValueLot2(), "LOT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot2_NotLikeSearch(String lot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot2), xgetCValueLot2(), "LOT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(255)}
     * @param lot2 The value of lot2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_PrefixSearch(String lot2) {
        setLot2_LikeSearch(lot2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     */
    public void setLot2_IsNull() { regLot2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     */
    public void setLot2_IsNullOrEmpty() { regLot2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(255)}
     */
    public void setLot2_IsNotNull() { regLot2(CK_ISNN, DOBJ); }

    protected void regLot2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot2(), "LOT2"); }
    protected abstract ConditionValue xgetCValueLot2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_Equal(String carriersname) {
        doSetCarriersname_Equal(fRES(carriersname));
    }

    protected void doSetCarriersname_Equal(String carriersname) {
        regCarriersname(CK_EQ, carriersname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_NotEqual(String carriersname) {
        doSetCarriersname_NotEqual(fRES(carriersname));
    }

    protected void doSetCarriersname_NotEqual(String carriersname) {
        regCarriersname(CK_NES, carriersname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_GreaterThan(String carriersname) {
        regCarriersname(CK_GT, fRES(carriersname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_LessThan(String carriersname) {
        regCarriersname(CK_LT, fRES(carriersname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_GreaterEqual(String carriersname) {
        regCarriersname(CK_GE, fRES(carriersname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_LessEqual(String carriersname) {
        regCarriersname(CK_LE, fRES(carriersname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersnameList The collection of carriersname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_InScope(Collection<String> carriersnameList) {
        doSetCarriersname_InScope(carriersnameList);
    }

    protected void doSetCarriersname_InScope(Collection<String> carriersnameList) {
        regINS(CK_INS, cTL(carriersnameList), xgetCValueCarriersname(), "CARRIERSNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersnameList The collection of carriersname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_NotInScope(Collection<String> carriersnameList) {
        doSetCarriersname_NotInScope(carriersnameList);
    }

    protected void doSetCarriersname_NotInScope(Collection<String> carriersnameList) {
        regINS(CK_NINS, cTL(carriersnameList), xgetCValueCarriersname(), "CARRIERSNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(255)} <br>
     * <pre>e.g. setCarriersname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carriersname The value of carriersname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarriersname_LikeSearch(String carriersname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carriersname), xgetCValueCarriersname(), "CARRIERSNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarriersname_NotLikeSearch(String carriersname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carriersname), xgetCValueCarriersname(), "CARRIERSNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     * @param carriersname The value of carriersname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_PrefixSearch(String carriersname) {
        setCarriersname_LikeSearch(carriersname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     */
    public void setCarriersname_IsNull() { regCarriersname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     */
    public void setCarriersname_IsNullOrEmpty() { regCarriersname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(255)}
     */
    public void setCarriersname_IsNotNull() { regCarriersname(CK_ISNN, DOBJ); }

    protected void regCarriersname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarriersname(), "CARRIERSNAME"); }
    protected abstract ConditionValue xgetCValueCarriersname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_Equal(String foreigncargoflg) {
        doSetForeigncargoflg_Equal(fRES(foreigncargoflg));
    }

    protected void doSetForeigncargoflg_Equal(String foreigncargoflg) {
        regForeigncargoflg(CK_EQ, foreigncargoflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotEqual(String foreigncargoflg) {
        doSetForeigncargoflg_NotEqual(fRES(foreigncargoflg));
    }

    protected void doSetForeigncargoflg_NotEqual(String foreigncargoflg) {
        regForeigncargoflg(CK_NES, foreigncargoflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterThan(String foreigncargoflg) {
        regForeigncargoflg(CK_GT, fRES(foreigncargoflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessThan(String foreigncargoflg) {
        regForeigncargoflg(CK_LT, fRES(foreigncargoflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterEqual(String foreigncargoflg) {
        regForeigncargoflg(CK_GE, fRES(foreigncargoflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessEqual(String foreigncargoflg) {
        regForeigncargoflg(CK_LE, fRES(foreigncargoflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflgList The collection of foreigncargoflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_InScope(Collection<String> foreigncargoflgList) {
        doSetForeigncargoflg_InScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_InScope(Collection<String> foreigncargoflgList) {
        regINS(CK_INS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflgList The collection of foreigncargoflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotInScope(Collection<String> foreigncargoflgList) {
        doSetForeigncargoflg_NotInScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_NotInScope(Collection<String> foreigncargoflgList) {
        regINS(CK_NINS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)} <br>
     * <pre>e.g. setForeigncargoflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param foreigncargoflg The value of foreigncargoflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setForeigncargoflg_LikeSearch(String foreigncargoflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foreigncargoflg), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setForeigncargoflg_NotLikeSearch(String foreigncargoflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foreigncargoflg), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     * @param foreigncargoflg The value of foreigncargoflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_PrefixSearch(String foreigncargoflg) {
        setForeigncargoflg_LikeSearch(foreigncargoflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     */
    public void setForeigncargoflg_IsNull() { regForeigncargoflg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     */
    public void setForeigncargoflg_IsNullOrEmpty() { regForeigncargoflg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {varchar(255)}
     */
    public void setForeigncargoflg_IsNotNull() { regForeigncargoflg(CK_ISNN, DOBJ); }

    protected void regForeigncargoflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG"); }
    protected abstract ConditionValue xgetCValueForeigncargoflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_Equal(String carrierwbno) {
        doSetCarrierwbno_Equal(fRES(carrierwbno));
    }

    protected void doSetCarrierwbno_Equal(String carrierwbno) {
        regCarrierwbno(CK_EQ, carrierwbno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_NotEqual(String carrierwbno) {
        doSetCarrierwbno_NotEqual(fRES(carrierwbno));
    }

    protected void doSetCarrierwbno_NotEqual(String carrierwbno) {
        regCarrierwbno(CK_NES, carrierwbno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_GreaterThan(String carrierwbno) {
        regCarrierwbno(CK_GT, fRES(carrierwbno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_LessThan(String carrierwbno) {
        regCarrierwbno(CK_LT, fRES(carrierwbno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_GreaterEqual(String carrierwbno) {
        regCarrierwbno(CK_GE, fRES(carrierwbno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_LessEqual(String carrierwbno) {
        regCarrierwbno(CK_LE, fRES(carrierwbno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbnoList The collection of carrierwbno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_InScope(Collection<String> carrierwbnoList) {
        doSetCarrierwbno_InScope(carrierwbnoList);
    }

    protected void doSetCarrierwbno_InScope(Collection<String> carrierwbnoList) {
        regINS(CK_INS, cTL(carrierwbnoList), xgetCValueCarrierwbno(), "CARRIERWBNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbnoList The collection of carrierwbno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_NotInScope(Collection<String> carrierwbnoList) {
        doSetCarrierwbno_NotInScope(carrierwbnoList);
    }

    protected void doSetCarrierwbno_NotInScope(Collection<String> carrierwbnoList) {
        regINS(CK_NINS, cTL(carrierwbnoList), xgetCValueCarrierwbno(), "CARRIERWBNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(255)} <br>
     * <pre>e.g. setCarrierwbno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierwbno The value of carrierwbno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierwbno_LikeSearch(String carrierwbno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierwbno), xgetCValueCarrierwbno(), "CARRIERWBNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierwbno_NotLikeSearch(String carrierwbno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierwbno), xgetCValueCarrierwbno(), "CARRIERWBNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     * @param carrierwbno The value of carrierwbno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_PrefixSearch(String carrierwbno) {
        setCarrierwbno_LikeSearch(carrierwbno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     */
    public void setCarrierwbno_IsNull() { regCarrierwbno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     */
    public void setCarrierwbno_IsNullOrEmpty() { regCarrierwbno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(255)}
     */
    public void setCarrierwbno_IsNotNull() { regCarrierwbno(CK_ISNN, DOBJ); }

    protected void regCarrierwbno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierwbno(), "CARRIERWBNO"); }
    protected abstract ConditionValue xgetCValueCarrierwbno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(255)}
     * @param fromphone The value of fromphone as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_Equal(String fromphone) {
        doSetFromphone_Equal(fRES(fromphone));
    }

    protected void doSetFromphone_Equal(String fromphone) {
        regFromphone(CK_EQ, fromphone);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(255)}
     * @param fromphone The value of fromphone as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_NotEqual(String fromphone) {
        doSetFromphone_NotEqual(fRES(fromphone));
    }

    protected void doSetFromphone_NotEqual(String fromphone) {
        regFromphone(CK_NES, fromphone);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(255)}
     * @param fromphone The value of fromphone as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_GreaterThan(String fromphone) {
        regFromphone(CK_GT, fRES(fromphone));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(255)}
     * @param fromphone The value of fromphone as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_LessThan(String fromphone) {
        regFromphone(CK_LT, fRES(fromphone));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(255)}
     * @param fromphone The value of fromphone as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_GreaterEqual(String fromphone) {
        regFromphone(CK_GE, fRES(fromphone));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(255)}
     * @param fromphone The value of fromphone as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_LessEqual(String fromphone) {
        regFromphone(CK_LE, fRES(fromphone));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(255)}
     * @param fromphoneList The collection of fromphone as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_InScope(Collection<String> fromphoneList) {
        doSetFromphone_InScope(fromphoneList);
    }

    protected void doSetFromphone_InScope(Collection<String> fromphoneList) {
        regINS(CK_INS, cTL(fromphoneList), xgetCValueFromphone(), "FROMPHONE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(255)}
     * @param fromphoneList The collection of fromphone as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_NotInScope(Collection<String> fromphoneList) {
        doSetFromphone_NotInScope(fromphoneList);
    }

    protected void doSetFromphone_NotInScope(Collection<String> fromphoneList) {
        regINS(CK_NINS, cTL(fromphoneList), xgetCValueFromphone(), "FROMPHONE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(255)} <br>
     * <pre>e.g. setFromphone_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromphone The value of fromphone as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromphone_LikeSearch(String fromphone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromphone), xgetCValueFromphone(), "FROMPHONE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(255)}
     * @param fromphone The value of fromphone as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromphone_NotLikeSearch(String fromphone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromphone), xgetCValueFromphone(), "FROMPHONE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(255)}
     * @param fromphone The value of fromphone as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_PrefixSearch(String fromphone) {
        setFromphone_LikeSearch(fromphone, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(255)}
     */
    public void setFromphone_IsNull() { regFromphone(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(255)}
     */
    public void setFromphone_IsNullOrEmpty() { regFromphone(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(255)}
     */
    public void setFromphone_IsNotNull() { regFromphone(CK_ISNN, DOBJ); }

    protected void regFromphone(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromphone(), "FROMPHONE"); }
    protected abstract ConditionValue xgetCValueFromphone();

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
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_Equal(String expectqty1) {
        doSetExpectqty1_Equal(fRES(expectqty1));
    }

    protected void doSetExpectqty1_Equal(String expectqty1) {
        regExpectqty1(CK_EQ, expectqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_NotEqual(String expectqty1) {
        doSetExpectqty1_NotEqual(fRES(expectqty1));
    }

    protected void doSetExpectqty1_NotEqual(String expectqty1) {
        regExpectqty1(CK_NES, expectqty1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_GreaterThan(String expectqty1) {
        regExpectqty1(CK_GT, fRES(expectqty1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_LessThan(String expectqty1) {
        regExpectqty1(CK_LT, fRES(expectqty1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_GreaterEqual(String expectqty1) {
        regExpectqty1(CK_GE, fRES(expectqty1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_LessEqual(String expectqty1) {
        regExpectqty1(CK_LE, fRES(expectqty1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1List The collection of expectqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_InScope(Collection<String> expectqty1List) {
        doSetExpectqty1_InScope(expectqty1List);
    }

    protected void doSetExpectqty1_InScope(Collection<String> expectqty1List) {
        regINS(CK_INS, cTL(expectqty1List), xgetCValueExpectqty1(), "EXPECTQTY1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1List The collection of expectqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_NotInScope(Collection<String> expectqty1List) {
        doSetExpectqty1_NotInScope(expectqty1List);
    }

    protected void doSetExpectqty1_NotInScope(Collection<String> expectqty1List) {
        regINS(CK_NINS, cTL(expectqty1List), xgetCValueExpectqty1(), "EXPECTQTY1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {varchar(255)} <br>
     * <pre>e.g. setExpectqty1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param expectqty1 The value of expectqty1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExpectqty1_LikeSearch(String expectqty1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(expectqty1), xgetCValueExpectqty1(), "EXPECTQTY1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExpectqty1_NotLikeSearch(String expectqty1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(expectqty1), xgetCValueExpectqty1(), "EXPECTQTY1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     * @param expectqty1 The value of expectqty1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_PrefixSearch(String expectqty1) {
        setExpectqty1_LikeSearch(expectqty1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     */
    public void setExpectqty1_IsNull() { regExpectqty1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     */
    public void setExpectqty1_IsNullOrEmpty() { regExpectqty1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXPECTQTY1: {varchar(255)}
     */
    public void setExpectqty1_IsNotNull() { regExpectqty1(CK_ISNN, DOBJ); }

    protected void regExpectqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectqty1(), "EXPECTQTY1"); }
    protected abstract ConditionValue xgetCValueExpectqty1();

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
    public HpSLCFunction<EStoreWorkInfoSendCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EStoreWorkInfoSendCB.class);
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
    public HpSLCFunction<EStoreWorkInfoSendCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EStoreWorkInfoSendCB.class);
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
    public HpSLCFunction<EStoreWorkInfoSendCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EStoreWorkInfoSendCB.class);
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
    public HpSLCFunction<EStoreWorkInfoSendCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EStoreWorkInfoSendCB.class);
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
    public HpSLCFunction<EStoreWorkInfoSendCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EStoreWorkInfoSendCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EStoreWorkInfoSendCB&gt;() {
     *     public void query(EStoreWorkInfoSendCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EStoreWorkInfoSendCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EStoreWorkInfoSendCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EStoreWorkInfoSendCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EStoreWorkInfoSendCQ sq);

    protected EStoreWorkInfoSendCB xcreateScalarConditionCB() {
        EStoreWorkInfoSendCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EStoreWorkInfoSendCB xcreateScalarConditionPartitionByCB() {
        EStoreWorkInfoSendCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EStoreWorkInfoSendCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EStoreWorkInfoSendCB cb = new EStoreWorkInfoSendCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "STORE_WORK_INFO_SEND_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EStoreWorkInfoSendCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EStoreWorkInfoSendCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EStoreWorkInfoSendCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EStoreWorkInfoSendCB cb = new EStoreWorkInfoSendCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "STORE_WORK_INFO_SEND_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EStoreWorkInfoSendCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EStoreWorkInfoSendCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EStoreWorkInfoSendCB cb = new EStoreWorkInfoSendCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EStoreWorkInfoSendCQ sq);

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
    protected EStoreWorkInfoSendCB newMyCB() {
        return new EStoreWorkInfoSendCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EStoreWorkInfoSendCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

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
 * The abstract condition-query of E_PRODUCT_SEND.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEProductSendCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEProductSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_PRODUCT_SEND";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productSendId The value of productSendId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductSendId_Equal(Long productSendId) {
        doSetProductSendId_Equal(productSendId);
    }

    protected void doSetProductSendId_Equal(Long productSendId) {
        regProductSendId(CK_EQ, productSendId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productSendId The value of productSendId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductSendId_NotEqual(Long productSendId) {
        doSetProductSendId_NotEqual(productSendId);
    }

    protected void doSetProductSendId_NotEqual(Long productSendId) {
        regProductSendId(CK_NES, productSendId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productSendId The value of productSendId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductSendId_GreaterThan(Long productSendId) {
        regProductSendId(CK_GT, productSendId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productSendId The value of productSendId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductSendId_LessThan(Long productSendId) {
        regProductSendId(CK_LT, productSendId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productSendId The value of productSendId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductSendId_GreaterEqual(Long productSendId) {
        regProductSendId(CK_GE, productSendId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productSendId The value of productSendId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductSendId_LessEqual(Long productSendId) {
        regProductSendId(CK_LE, productSendId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of productSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductSendId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductSendId(), "PRODUCT_SEND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productSendIdList The collection of productSendId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductSendId_InScope(Collection<Long> productSendIdList) {
        doSetProductSendId_InScope(productSendIdList);
    }

    protected void doSetProductSendId_InScope(Collection<Long> productSendIdList) {
        regINS(CK_INS, cTL(productSendIdList), xgetCValueProductSendId(), "PRODUCT_SEND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productSendIdList The collection of productSendId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductSendId_NotInScope(Collection<Long> productSendIdList) {
        doSetProductSendId_NotInScope(productSendIdList);
    }

    protected void doSetProductSendId_NotInScope(Collection<Long> productSendIdList) {
        regINS(CK_NINS, cTL(productSendIdList), xgetCValueProductSendId(), "PRODUCT_SEND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setProductSendId_IsNull() { regProductSendId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setProductSendId_IsNotNull() { regProductSendId(CK_ISNN, DOBJ); }

    protected void regProductSendId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductSendId(), "PRODUCT_SEND_ID"); }
    protected abstract ConditionValue xgetCValueProductSendId();

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
     * PROCESSED_FLG: {NotNull, char(1), default=[0]}
     * @param processedFlg The value of processedFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessedFlg_Equal(String processedFlg) {
        doSetProcessedFlg_Equal(fRES(processedFlg));
    }

    protected void doSetProcessedFlg_Equal(String processedFlg) {
        regProcessedFlg(CK_EQ, processedFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESSED_FLG: {NotNull, char(1), default=[0]}
     * @param processedFlg The value of processedFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessedFlg_NotEqual(String processedFlg) {
        doSetProcessedFlg_NotEqual(fRES(processedFlg));
    }

    protected void doSetProcessedFlg_NotEqual(String processedFlg) {
        regProcessedFlg(CK_NES, processedFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESSED_FLG: {NotNull, char(1), default=[0]}
     * @param processedFlg The value of processedFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessedFlg_GreaterThan(String processedFlg) {
        regProcessedFlg(CK_GT, fRES(processedFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESSED_FLG: {NotNull, char(1), default=[0]}
     * @param processedFlg The value of processedFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessedFlg_LessThan(String processedFlg) {
        regProcessedFlg(CK_LT, fRES(processedFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESSED_FLG: {NotNull, char(1), default=[0]}
     * @param processedFlg The value of processedFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessedFlg_GreaterEqual(String processedFlg) {
        regProcessedFlg(CK_GE, fRES(processedFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESSED_FLG: {NotNull, char(1), default=[0]}
     * @param processedFlg The value of processedFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessedFlg_LessEqual(String processedFlg) {
        regProcessedFlg(CK_LE, fRES(processedFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESSED_FLG: {NotNull, char(1), default=[0]}
     * @param processedFlgList The collection of processedFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessedFlg_InScope(Collection<String> processedFlgList) {
        doSetProcessedFlg_InScope(processedFlgList);
    }

    protected void doSetProcessedFlg_InScope(Collection<String> processedFlgList) {
        regINS(CK_INS, cTL(processedFlgList), xgetCValueProcessedFlg(), "PROCESSED_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESSED_FLG: {NotNull, char(1), default=[0]}
     * @param processedFlgList The collection of processedFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessedFlg_NotInScope(Collection<String> processedFlgList) {
        doSetProcessedFlg_NotInScope(processedFlgList);
    }

    protected void doSetProcessedFlg_NotInScope(Collection<String> processedFlgList) {
        regINS(CK_NINS, cTL(processedFlgList), xgetCValueProcessedFlg(), "PROCESSED_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESSED_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setProcessedFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processedFlg The value of processedFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessedFlg_LikeSearch(String processedFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processedFlg), xgetCValueProcessedFlg(), "PROCESSED_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESSED_FLG: {NotNull, char(1), default=[0]}
     * @param processedFlg The value of processedFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessedFlg_NotLikeSearch(String processedFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processedFlg), xgetCValueProcessedFlg(), "PROCESSED_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESSED_FLG: {NotNull, char(1), default=[0]}
     * @param processedFlg The value of processedFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessedFlg_PrefixSearch(String processedFlg) {
        setProcessedFlg_LikeSearch(processedFlg, xcLSOPPre());
    }

    protected void regProcessedFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessedFlg(), "PROCESSED_FLG"); }
    protected abstract ConditionValue xgetCValueProcessedFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(100)}
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
     * PRODUCT_CD: {NotNull, varchar(100)}
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
     * PRODUCT_CD: {NotNull, varchar(100)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(100)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(100)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(100)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(100)}
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
     * PRODUCT_CD: {NotNull, varchar(100)}
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
     * PRODUCT_CD: {NotNull, varchar(100)} <br>
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
     * PRODUCT_CD: {NotNull, varchar(100)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(100)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
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
     * PRODUCT_NM: {NotNull, varchar(255)}
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
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNm The value of productNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterThan(String productNm) {
        regProductNm(CK_GT, fRES(productNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNm The value of productNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessThan(String productNm) {
        regProductNm(CK_LT, fRES(productNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNm The value of productNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterEqual(String productNm) {
        regProductNm(CK_GE, fRES(productNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNm The value of productNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessEqual(String productNm) {
        regProductNm(CK_LE, fRES(productNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
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
     * PRODUCT_NM: {NotNull, varchar(255)}
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
     * PRODUCT_NM: {NotNull, varchar(255)} <br>
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
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNm The value of productNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNm_NotLikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @param productNm The value of productNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_PrefixSearch(String productNm) {
        setProductNm_LikeSearch(productNm, xcLSOPPre());
    }

    protected void regProductNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductNm(), "PRODUCT_NM"); }
    protected abstract ConditionValue xgetCValueProductNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {NotNull, varchar(60)}
     * @param productAbbr The value of productAbbr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_Equal(String productAbbr) {
        doSetProductAbbr_Equal(fRES(productAbbr));
    }

    protected void doSetProductAbbr_Equal(String productAbbr) {
        regProductAbbr(CK_EQ, productAbbr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {NotNull, varchar(60)}
     * @param productAbbr The value of productAbbr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_NotEqual(String productAbbr) {
        doSetProductAbbr_NotEqual(fRES(productAbbr));
    }

    protected void doSetProductAbbr_NotEqual(String productAbbr) {
        regProductAbbr(CK_NES, productAbbr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {NotNull, varchar(60)}
     * @param productAbbr The value of productAbbr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_GreaterThan(String productAbbr) {
        regProductAbbr(CK_GT, fRES(productAbbr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {NotNull, varchar(60)}
     * @param productAbbr The value of productAbbr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_LessThan(String productAbbr) {
        regProductAbbr(CK_LT, fRES(productAbbr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {NotNull, varchar(60)}
     * @param productAbbr The value of productAbbr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_GreaterEqual(String productAbbr) {
        regProductAbbr(CK_GE, fRES(productAbbr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ABBR: {NotNull, varchar(60)}
     * @param productAbbr The value of productAbbr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_LessEqual(String productAbbr) {
        regProductAbbr(CK_LE, fRES(productAbbr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {NotNull, varchar(60)}
     * @param productAbbrList The collection of productAbbr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_InScope(Collection<String> productAbbrList) {
        doSetProductAbbr_InScope(productAbbrList);
    }

    protected void doSetProductAbbr_InScope(Collection<String> productAbbrList) {
        regINS(CK_INS, cTL(productAbbrList), xgetCValueProductAbbr(), "PRODUCT_ABBR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {NotNull, varchar(60)}
     * @param productAbbrList The collection of productAbbr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_NotInScope(Collection<String> productAbbrList) {
        doSetProductAbbr_NotInScope(productAbbrList);
    }

    protected void doSetProductAbbr_NotInScope(Collection<String> productAbbrList) {
        regINS(CK_NINS, cTL(productAbbrList), xgetCValueProductAbbr(), "PRODUCT_ABBR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {NotNull, varchar(60)} <br>
     * <pre>e.g. setProductAbbr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productAbbr The value of productAbbr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductAbbr_LikeSearch(String productAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productAbbr), xgetCValueProductAbbr(), "PRODUCT_ABBR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {NotNull, varchar(60)}
     * @param productAbbr The value of productAbbr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductAbbr_NotLikeSearch(String productAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productAbbr), xgetCValueProductAbbr(), "PRODUCT_ABBR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ABBR: {NotNull, varchar(60)}
     * @param productAbbr The value of productAbbr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductAbbr_PrefixSearch(String productAbbr) {
        setProductAbbr_LikeSearch(productAbbr, xcLSOPPre());
    }

    protected void regProductAbbr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductAbbr(), "PRODUCT_ABBR"); }
    protected abstract ConditionValue xgetCValueProductAbbr();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19)}
     * @param priceBuy The value of priceBuy as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_Equal(Long priceBuy) {
        doSetPriceBuy_Equal(priceBuy);
    }

    protected void doSetPriceBuy_Equal(Long priceBuy) {
        regPriceBuy(CK_EQ, priceBuy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19)}
     * @param priceBuy The value of priceBuy as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_NotEqual(Long priceBuy) {
        doSetPriceBuy_NotEqual(priceBuy);
    }

    protected void doSetPriceBuy_NotEqual(Long priceBuy) {
        regPriceBuy(CK_NES, priceBuy);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19)}
     * @param priceBuy The value of priceBuy as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_GreaterThan(Long priceBuy) {
        regPriceBuy(CK_GT, priceBuy);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19)}
     * @param priceBuy The value of priceBuy as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_LessThan(Long priceBuy) {
        regPriceBuy(CK_LT, priceBuy);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19)}
     * @param priceBuy The value of priceBuy as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_GreaterEqual(Long priceBuy) {
        regPriceBuy(CK_GE, priceBuy);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19)}
     * @param priceBuy The value of priceBuy as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriceBuy_LessEqual(Long priceBuy) {
        regPriceBuy(CK_LE, priceBuy);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19)}
     * @param minNumber The min number of priceBuy. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of priceBuy. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPriceBuy_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePriceBuy(), "PRICE_BUY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19)}
     * @param priceBuyList The collection of priceBuy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_InScope(Collection<Long> priceBuyList) {
        doSetPriceBuy_InScope(priceBuyList);
    }

    protected void doSetPriceBuy_InScope(Collection<Long> priceBuyList) {
        regINS(CK_INS, cTL(priceBuyList), xgetCValuePriceBuy(), "PRICE_BUY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRICE_BUY: {NotNull, bigint(19)}
     * @param priceBuyList The collection of priceBuy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_NotInScope(Collection<Long> priceBuyList) {
        doSetPriceBuy_NotInScope(priceBuyList);
    }

    protected void doSetPriceBuy_NotInScope(Collection<Long> priceBuyList) {
        regINS(CK_NINS, cTL(priceBuyList), xgetCValuePriceBuy(), "PRICE_BUY");
    }

    protected void regPriceBuy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriceBuy(), "PRICE_BUY"); }
    protected abstract ConditionValue xgetCValuePriceBuy();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6)}
     * @param unit2 The value of unit2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit2_Equal(java.math.BigDecimal unit2) {
        doSetUnit2_Equal(unit2);
    }

    protected void doSetUnit2_Equal(java.math.BigDecimal unit2) {
        regUnit2(CK_EQ, unit2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6)}
     * @param unit2 The value of unit2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit2_NotEqual(java.math.BigDecimal unit2) {
        doSetUnit2_NotEqual(unit2);
    }

    protected void doSetUnit2_NotEqual(java.math.BigDecimal unit2) {
        regUnit2(CK_NES, unit2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6)}
     * @param unit2 The value of unit2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit2_GreaterThan(java.math.BigDecimal unit2) {
        regUnit2(CK_GT, unit2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6)}
     * @param unit2 The value of unit2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit2_LessThan(java.math.BigDecimal unit2) {
        regUnit2(CK_LT, unit2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6)}
     * @param unit2 The value of unit2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit2_GreaterEqual(java.math.BigDecimal unit2) {
        regUnit2(CK_GE, unit2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6)}
     * @param unit2 The value of unit2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnit2_LessEqual(java.math.BigDecimal unit2) {
        regUnit2(CK_LE, unit2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of unit2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unit2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnit2_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnit2(), "UNIT2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6)}
     * @param unit2List The collection of unit2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2_InScope(Collection<java.math.BigDecimal> unit2List) {
        doSetUnit2_InScope(unit2List);
    }

    protected void doSetUnit2_InScope(Collection<java.math.BigDecimal> unit2List) {
        regINS(CK_INS, cTL(unit2List), xgetCValueUnit2(), "UNIT2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT2: {NotNull, decimal(16, 6)}
     * @param unit2List The collection of unit2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2_NotInScope(Collection<java.math.BigDecimal> unit2List) {
        doSetUnit2_NotInScope(unit2List);
    }

    protected void doSetUnit2_NotInScope(Collection<java.math.BigDecimal> unit2List) {
        regINS(CK_NINS, cTL(unit2List), xgetCValueUnit2(), "UNIT2");
    }

    protected void regUnit2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnit2(), "UNIT2"); }
    protected abstract ConditionValue xgetCValueUnit2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BX_PER_NUMBER: {NotNull, decimal(16, 6)}
     * @param bxPerNumber The value of bxPerNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxPerNumber_Equal(java.math.BigDecimal bxPerNumber) {
        doSetBxPerNumber_Equal(bxPerNumber);
    }

    protected void doSetBxPerNumber_Equal(java.math.BigDecimal bxPerNumber) {
        regBxPerNumber(CK_EQ, bxPerNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BX_PER_NUMBER: {NotNull, decimal(16, 6)}
     * @param bxPerNumber The value of bxPerNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxPerNumber_NotEqual(java.math.BigDecimal bxPerNumber) {
        doSetBxPerNumber_NotEqual(bxPerNumber);
    }

    protected void doSetBxPerNumber_NotEqual(java.math.BigDecimal bxPerNumber) {
        regBxPerNumber(CK_NES, bxPerNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BX_PER_NUMBER: {NotNull, decimal(16, 6)}
     * @param bxPerNumber The value of bxPerNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxPerNumber_GreaterThan(java.math.BigDecimal bxPerNumber) {
        regBxPerNumber(CK_GT, bxPerNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BX_PER_NUMBER: {NotNull, decimal(16, 6)}
     * @param bxPerNumber The value of bxPerNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxPerNumber_LessThan(java.math.BigDecimal bxPerNumber) {
        regBxPerNumber(CK_LT, bxPerNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BX_PER_NUMBER: {NotNull, decimal(16, 6)}
     * @param bxPerNumber The value of bxPerNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxPerNumber_GreaterEqual(java.math.BigDecimal bxPerNumber) {
        regBxPerNumber(CK_GE, bxPerNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BX_PER_NUMBER: {NotNull, decimal(16, 6)}
     * @param bxPerNumber The value of bxPerNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBxPerNumber_LessEqual(java.math.BigDecimal bxPerNumber) {
        regBxPerNumber(CK_LE, bxPerNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BX_PER_NUMBER: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of bxPerNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bxPerNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBxPerNumber_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBxPerNumber(), "BX_PER_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BX_PER_NUMBER: {NotNull, decimal(16, 6)}
     * @param bxPerNumberList The collection of bxPerNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxPerNumber_InScope(Collection<java.math.BigDecimal> bxPerNumberList) {
        doSetBxPerNumber_InScope(bxPerNumberList);
    }

    protected void doSetBxPerNumber_InScope(Collection<java.math.BigDecimal> bxPerNumberList) {
        regINS(CK_INS, cTL(bxPerNumberList), xgetCValueBxPerNumber(), "BX_PER_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BX_PER_NUMBER: {NotNull, decimal(16, 6)}
     * @param bxPerNumberList The collection of bxPerNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxPerNumber_NotInScope(Collection<java.math.BigDecimal> bxPerNumberList) {
        doSetBxPerNumber_NotInScope(bxPerNumberList);
    }

    protected void doSetBxPerNumber_NotInScope(Collection<java.math.BigDecimal> bxPerNumberList) {
        regINS(CK_NINS, cTL(bxPerNumberList), xgetCValueBxPerNumber(), "BX_PER_NUMBER");
    }

    protected void regBxPerNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxPerNumber(), "BX_PER_NUMBER"); }
    protected abstract ConditionValue xgetCValueBxPerNumber();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_BX_COUNT: {NotNull, decimal(16, 6)}
     * @param pBxCount The value of pBxCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPBxCount_Equal(java.math.BigDecimal pBxCount) {
        doSetPBxCount_Equal(pBxCount);
    }

    protected void doSetPBxCount_Equal(java.math.BigDecimal pBxCount) {
        regPBxCount(CK_EQ, pBxCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_BX_COUNT: {NotNull, decimal(16, 6)}
     * @param pBxCount The value of pBxCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPBxCount_NotEqual(java.math.BigDecimal pBxCount) {
        doSetPBxCount_NotEqual(pBxCount);
    }

    protected void doSetPBxCount_NotEqual(java.math.BigDecimal pBxCount) {
        regPBxCount(CK_NES, pBxCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_BX_COUNT: {NotNull, decimal(16, 6)}
     * @param pBxCount The value of pBxCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPBxCount_GreaterThan(java.math.BigDecimal pBxCount) {
        regPBxCount(CK_GT, pBxCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_BX_COUNT: {NotNull, decimal(16, 6)}
     * @param pBxCount The value of pBxCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPBxCount_LessThan(java.math.BigDecimal pBxCount) {
        regPBxCount(CK_LT, pBxCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_BX_COUNT: {NotNull, decimal(16, 6)}
     * @param pBxCount The value of pBxCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPBxCount_GreaterEqual(java.math.BigDecimal pBxCount) {
        regPBxCount(CK_GE, pBxCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_BX_COUNT: {NotNull, decimal(16, 6)}
     * @param pBxCount The value of pBxCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPBxCount_LessEqual(java.math.BigDecimal pBxCount) {
        regPBxCount(CK_LE, pBxCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_BX_COUNT: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of pBxCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pBxCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPBxCount_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePBxCount(), "P_BX_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_BX_COUNT: {NotNull, decimal(16, 6)}
     * @param pBxCountList The collection of pBxCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPBxCount_InScope(Collection<java.math.BigDecimal> pBxCountList) {
        doSetPBxCount_InScope(pBxCountList);
    }

    protected void doSetPBxCount_InScope(Collection<java.math.BigDecimal> pBxCountList) {
        regINS(CK_INS, cTL(pBxCountList), xgetCValuePBxCount(), "P_BX_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_BX_COUNT: {NotNull, decimal(16, 6)}
     * @param pBxCountList The collection of pBxCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPBxCount_NotInScope(Collection<java.math.BigDecimal> pBxCountList) {
        doSetPBxCount_NotInScope(pBxCountList);
    }

    protected void doSetPBxCount_NotInScope(Collection<java.math.BigDecimal> pBxCountList) {
        regINS(CK_NINS, cTL(pBxCountList), xgetCValuePBxCount(), "P_BX_COUNT");
    }

    protected void regPBxCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePBxCount(), "P_BX_COUNT"); }
    protected abstract ConditionValue xgetCValuePBxCount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_Equal(String fUser1) {
        doSetFUser1_Equal(fRES(fUser1));
    }

    protected void doSetFUser1_Equal(String fUser1) {
        regFUser1(CK_EQ, fUser1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_NotEqual(String fUser1) {
        doSetFUser1_NotEqual(fRES(fUser1));
    }

    protected void doSetFUser1_NotEqual(String fUser1) {
        regFUser1(CK_NES, fUser1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_GreaterThan(String fUser1) {
        regFUser1(CK_GT, fRES(fUser1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_LessThan(String fUser1) {
        regFUser1(CK_LT, fRES(fUser1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_GreaterEqual(String fUser1) {
        regFUser1(CK_GE, fRES(fUser1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_LessEqual(String fUser1) {
        regFUser1(CK_LE, fRES(fUser1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1List The collection of fUser1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_InScope(Collection<String> fUser1List) {
        doSetFUser1_InScope(fUser1List);
    }

    protected void doSetFUser1_InScope(Collection<String> fUser1List) {
        regINS(CK_INS, cTL(fUser1List), xgetCValueFUser1(), "F_USER1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1List The collection of fUser1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_NotInScope(Collection<String> fUser1List) {
        doSetFUser1_NotInScope(fUser1List);
    }

    protected void doSetFUser1_NotInScope(Collection<String> fUser1List) {
        regINS(CK_NINS, cTL(fUser1List), xgetCValueFUser1(), "F_USER1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)} <br>
     * <pre>e.g. setFUser1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser1 The value of fUser1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser1_LikeSearch(String fUser1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser1), xgetCValueFUser1(), "F_USER1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser1_NotLikeSearch(String fUser1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser1), xgetCValueFUser1(), "F_USER1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_PrefixSearch(String fUser1) {
        setFUser1_LikeSearch(fUser1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     */
    public void setFUser1_IsNull() { regFUser1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     */
    public void setFUser1_IsNullOrEmpty() { regFUser1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     */
    public void setFUser1_IsNotNull() { regFUser1(CK_ISNN, DOBJ); }

    protected void regFUser1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser1(), "F_USER1"); }
    protected abstract ConditionValue xgetCValueFUser1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {bigint(19)}
     * @param length1 The value of length1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength1_Equal(Long length1) {
        doSetLength1_Equal(length1);
    }

    protected void doSetLength1_Equal(Long length1) {
        regLength1(CK_EQ, length1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {bigint(19)}
     * @param length1 The value of length1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength1_NotEqual(Long length1) {
        doSetLength1_NotEqual(length1);
    }

    protected void doSetLength1_NotEqual(Long length1) {
        regLength1(CK_NES, length1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {bigint(19)}
     * @param length1 The value of length1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength1_GreaterThan(Long length1) {
        regLength1(CK_GT, length1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {bigint(19)}
     * @param length1 The value of length1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength1_LessThan(Long length1) {
        regLength1(CK_LT, length1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {bigint(19)}
     * @param length1 The value of length1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength1_GreaterEqual(Long length1) {
        regLength1(CK_GE, length1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {bigint(19)}
     * @param length1 The value of length1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength1_LessEqual(Long length1) {
        regLength1(CK_LE, length1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {bigint(19)}
     * @param minNumber The min number of length1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of length1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLength1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLength1(), "LENGTH1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LENGTH1: {bigint(19)}
     * @param length1List The collection of length1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength1_InScope(Collection<Long> length1List) {
        doSetLength1_InScope(length1List);
    }

    protected void doSetLength1_InScope(Collection<Long> length1List) {
        regINS(CK_INS, cTL(length1List), xgetCValueLength1(), "LENGTH1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LENGTH1: {bigint(19)}
     * @param length1List The collection of length1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength1_NotInScope(Collection<Long> length1List) {
        doSetLength1_NotInScope(length1List);
    }

    protected void doSetLength1_NotInScope(Collection<Long> length1List) {
        regINS(CK_NINS, cTL(length1List), xgetCValueLength1(), "LENGTH1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LENGTH1: {bigint(19)}
     */
    public void setLength1_IsNull() { regLength1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LENGTH1: {bigint(19)}
     */
    public void setLength1_IsNotNull() { regLength1(CK_ISNN, DOBJ); }

    protected void regLength1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLength1(), "LENGTH1"); }
    protected abstract ConditionValue xgetCValueLength1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {bigint(19)}
     * @param width1 The value of width1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth1_Equal(Long width1) {
        doSetWidth1_Equal(width1);
    }

    protected void doSetWidth1_Equal(Long width1) {
        regWidth1(CK_EQ, width1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {bigint(19)}
     * @param width1 The value of width1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth1_NotEqual(Long width1) {
        doSetWidth1_NotEqual(width1);
    }

    protected void doSetWidth1_NotEqual(Long width1) {
        regWidth1(CK_NES, width1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {bigint(19)}
     * @param width1 The value of width1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth1_GreaterThan(Long width1) {
        regWidth1(CK_GT, width1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {bigint(19)}
     * @param width1 The value of width1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth1_LessThan(Long width1) {
        regWidth1(CK_LT, width1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {bigint(19)}
     * @param width1 The value of width1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth1_GreaterEqual(Long width1) {
        regWidth1(CK_GE, width1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {bigint(19)}
     * @param width1 The value of width1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth1_LessEqual(Long width1) {
        regWidth1(CK_LE, width1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {bigint(19)}
     * @param minNumber The min number of width1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of width1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWidth1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWidth1(), "WIDTH1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WIDTH1: {bigint(19)}
     * @param width1List The collection of width1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth1_InScope(Collection<Long> width1List) {
        doSetWidth1_InScope(width1List);
    }

    protected void doSetWidth1_InScope(Collection<Long> width1List) {
        regINS(CK_INS, cTL(width1List), xgetCValueWidth1(), "WIDTH1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WIDTH1: {bigint(19)}
     * @param width1List The collection of width1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth1_NotInScope(Collection<Long> width1List) {
        doSetWidth1_NotInScope(width1List);
    }

    protected void doSetWidth1_NotInScope(Collection<Long> width1List) {
        regINS(CK_NINS, cTL(width1List), xgetCValueWidth1(), "WIDTH1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WIDTH1: {bigint(19)}
     */
    public void setWidth1_IsNull() { regWidth1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WIDTH1: {bigint(19)}
     */
    public void setWidth1_IsNotNull() { regWidth1(CK_ISNN, DOBJ); }

    protected void regWidth1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWidth1(), "WIDTH1"); }
    protected abstract ConditionValue xgetCValueWidth1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {bigint(19)}
     * @param height1 The value of height1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight1_Equal(Long height1) {
        doSetHeight1_Equal(height1);
    }

    protected void doSetHeight1_Equal(Long height1) {
        regHeight1(CK_EQ, height1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {bigint(19)}
     * @param height1 The value of height1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight1_NotEqual(Long height1) {
        doSetHeight1_NotEqual(height1);
    }

    protected void doSetHeight1_NotEqual(Long height1) {
        regHeight1(CK_NES, height1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {bigint(19)}
     * @param height1 The value of height1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight1_GreaterThan(Long height1) {
        regHeight1(CK_GT, height1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {bigint(19)}
     * @param height1 The value of height1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight1_LessThan(Long height1) {
        regHeight1(CK_LT, height1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {bigint(19)}
     * @param height1 The value of height1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight1_GreaterEqual(Long height1) {
        regHeight1(CK_GE, height1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {bigint(19)}
     * @param height1 The value of height1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight1_LessEqual(Long height1) {
        regHeight1(CK_LE, height1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {bigint(19)}
     * @param minNumber The min number of height1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of height1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHeight1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHeight1(), "HEIGHT1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HEIGHT1: {bigint(19)}
     * @param height1List The collection of height1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight1_InScope(Collection<Long> height1List) {
        doSetHeight1_InScope(height1List);
    }

    protected void doSetHeight1_InScope(Collection<Long> height1List) {
        regINS(CK_INS, cTL(height1List), xgetCValueHeight1(), "HEIGHT1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HEIGHT1: {bigint(19)}
     * @param height1List The collection of height1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight1_NotInScope(Collection<Long> height1List) {
        doSetHeight1_NotInScope(height1List);
    }

    protected void doSetHeight1_NotInScope(Collection<Long> height1List) {
        regINS(CK_NINS, cTL(height1List), xgetCValueHeight1(), "HEIGHT1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HEIGHT1: {bigint(19)}
     */
    public void setHeight1_IsNull() { regHeight1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HEIGHT1: {bigint(19)}
     */
    public void setHeight1_IsNotNull() { regHeight1(CK_ISNN, DOBJ); }

    protected void regHeight1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeight1(), "HEIGHT1"); }
    protected abstract ConditionValue xgetCValueHeight1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6)}
     * @param pOdd The value of pOdd as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPOdd_Equal(java.math.BigDecimal pOdd) {
        doSetPOdd_Equal(pOdd);
    }

    protected void doSetPOdd_Equal(java.math.BigDecimal pOdd) {
        regPOdd(CK_EQ, pOdd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6)}
     * @param pOdd The value of pOdd as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPOdd_NotEqual(java.math.BigDecimal pOdd) {
        doSetPOdd_NotEqual(pOdd);
    }

    protected void doSetPOdd_NotEqual(java.math.BigDecimal pOdd) {
        regPOdd(CK_NES, pOdd);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6)}
     * @param pOdd The value of pOdd as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPOdd_GreaterThan(java.math.BigDecimal pOdd) {
        regPOdd(CK_GT, pOdd);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6)}
     * @param pOdd The value of pOdd as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPOdd_LessThan(java.math.BigDecimal pOdd) {
        regPOdd(CK_LT, pOdd);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6)}
     * @param pOdd The value of pOdd as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPOdd_GreaterEqual(java.math.BigDecimal pOdd) {
        regPOdd(CK_GE, pOdd);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6)}
     * @param pOdd The value of pOdd as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPOdd_LessEqual(java.math.BigDecimal pOdd) {
        regPOdd(CK_LE, pOdd);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6)}
     * @param minNumber The min number of pOdd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pOdd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPOdd_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePOdd(), "P_ODD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_ODD: {decimal(16, 6)}
     * @param pOddList The collection of pOdd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPOdd_InScope(Collection<java.math.BigDecimal> pOddList) {
        doSetPOdd_InScope(pOddList);
    }

    protected void doSetPOdd_InScope(Collection<java.math.BigDecimal> pOddList) {
        regINS(CK_INS, cTL(pOddList), xgetCValuePOdd(), "P_ODD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * P_ODD: {decimal(16, 6)}
     * @param pOddList The collection of pOdd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPOdd_NotInScope(Collection<java.math.BigDecimal> pOddList) {
        doSetPOdd_NotInScope(pOddList);
    }

    protected void doSetPOdd_NotInScope(Collection<java.math.BigDecimal> pOddList) {
        regINS(CK_NINS, cTL(pOddList), xgetCValuePOdd(), "P_ODD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6)}
     */
    public void setPOdd_IsNull() { regPOdd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_ODD: {decimal(16, 6)}
     */
    public void setPOdd_IsNotNull() { regPOdd(CK_ISNN, DOBJ); }

    protected void regPOdd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePOdd(), "P_ODD"); }
    protected abstract ConditionValue xgetCValuePOdd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_Equal(String spOperator1) {
        doSetSpOperator1_Equal(fRES(spOperator1));
    }

    protected void doSetSpOperator1_Equal(String spOperator1) {
        regSpOperator1(CK_EQ, spOperator1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_NotEqual(String spOperator1) {
        doSetSpOperator1_NotEqual(fRES(spOperator1));
    }

    protected void doSetSpOperator1_NotEqual(String spOperator1) {
        regSpOperator1(CK_NES, spOperator1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_GreaterThan(String spOperator1) {
        regSpOperator1(CK_GT, fRES(spOperator1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_LessThan(String spOperator1) {
        regSpOperator1(CK_LT, fRES(spOperator1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_GreaterEqual(String spOperator1) {
        regSpOperator1(CK_GE, fRES(spOperator1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_LessEqual(String spOperator1) {
        regSpOperator1(CK_LE, fRES(spOperator1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1List The collection of spOperator1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_InScope(Collection<String> spOperator1List) {
        doSetSpOperator1_InScope(spOperator1List);
    }

    protected void doSetSpOperator1_InScope(Collection<String> spOperator1List) {
        regINS(CK_INS, cTL(spOperator1List), xgetCValueSpOperator1(), "SP_OPERATOR1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1List The collection of spOperator1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_NotInScope(Collection<String> spOperator1List) {
        doSetSpOperator1_NotInScope(spOperator1List);
    }

    protected void doSetSpOperator1_NotInScope(Collection<String> spOperator1List) {
        regINS(CK_NINS, cTL(spOperator1List), xgetCValueSpOperator1(), "SP_OPERATOR1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SP_OPERATOR1: {varchar(30)} <br>
     * <pre>e.g. setSpOperator1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spOperator1 The value of spOperator1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpOperator1_LikeSearch(String spOperator1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spOperator1), xgetCValueSpOperator1(), "SP_OPERATOR1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpOperator1_NotLikeSearch(String spOperator1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spOperator1), xgetCValueSpOperator1(), "SP_OPERATOR1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @param spOperator1 The value of spOperator1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpOperator1_PrefixSearch(String spOperator1) {
        setSpOperator1_LikeSearch(spOperator1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     */
    public void setSpOperator1_IsNull() { regSpOperator1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     */
    public void setSpOperator1_IsNullOrEmpty() { regSpOperator1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SP_OPERATOR1: {varchar(30)}
     */
    public void setSpOperator1_IsNotNull() { regSpOperator1(CK_ISNN, DOBJ); }

    protected void regSpOperator1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpOperator1(), "SP_OPERATOR1"); }
    protected abstract ConditionValue xgetCValueSpOperator1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_Equal(String manuitemcd) {
        doSetManuitemcd_Equal(fRES(manuitemcd));
    }

    protected void doSetManuitemcd_Equal(String manuitemcd) {
        regManuitemcd(CK_EQ, manuitemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_NotEqual(String manuitemcd) {
        doSetManuitemcd_NotEqual(fRES(manuitemcd));
    }

    protected void doSetManuitemcd_NotEqual(String manuitemcd) {
        regManuitemcd(CK_NES, manuitemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_GreaterThan(String manuitemcd) {
        regManuitemcd(CK_GT, fRES(manuitemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_LessThan(String manuitemcd) {
        regManuitemcd(CK_LT, fRES(manuitemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_GreaterEqual(String manuitemcd) {
        regManuitemcd(CK_GE, fRES(manuitemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_LessEqual(String manuitemcd) {
        regManuitemcd(CK_LE, fRES(manuitemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcdList The collection of manuitemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_InScope(Collection<String> manuitemcdList) {
        doSetManuitemcd_InScope(manuitemcdList);
    }

    protected void doSetManuitemcd_InScope(Collection<String> manuitemcdList) {
        regINS(CK_INS, cTL(manuitemcdList), xgetCValueManuitemcd(), "MANUITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcdList The collection of manuitemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_NotInScope(Collection<String> manuitemcdList) {
        doSetManuitemcd_NotInScope(manuitemcdList);
    }

    protected void doSetManuitemcd_NotInScope(Collection<String> manuitemcdList) {
        regINS(CK_NINS, cTL(manuitemcdList), xgetCValueManuitemcd(), "MANUITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)} <br>
     * <pre>e.g. setManuitemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manuitemcd The value of manuitemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManuitemcd_LikeSearch(String manuitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manuitemcd), xgetCValueManuitemcd(), "MANUITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManuitemcd_NotLikeSearch(String manuitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manuitemcd), xgetCValueManuitemcd(), "MANUITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_PrefixSearch(String manuitemcd) {
        setManuitemcd_LikeSearch(manuitemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     */
    public void setManuitemcd_IsNull() { regManuitemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     */
    public void setManuitemcd_IsNullOrEmpty() { regManuitemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     */
    public void setManuitemcd_IsNotNull() { regManuitemcd(CK_ISNN, DOBJ); }

    protected void regManuitemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManuitemcd(), "MANUITEMCD"); }
    protected abstract ConditionValue xgetCValueManuitemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {NotNull, varchar(60)}
     * @param useruse3 The value of useruse3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_Equal(String useruse3) {
        doSetUseruse3_Equal(fRES(useruse3));
    }

    protected void doSetUseruse3_Equal(String useruse3) {
        regUseruse3(CK_EQ, useruse3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {NotNull, varchar(60)}
     * @param useruse3 The value of useruse3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_NotEqual(String useruse3) {
        doSetUseruse3_NotEqual(fRES(useruse3));
    }

    protected void doSetUseruse3_NotEqual(String useruse3) {
        regUseruse3(CK_NES, useruse3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {NotNull, varchar(60)}
     * @param useruse3 The value of useruse3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_GreaterThan(String useruse3) {
        regUseruse3(CK_GT, fRES(useruse3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {NotNull, varchar(60)}
     * @param useruse3 The value of useruse3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_LessThan(String useruse3) {
        regUseruse3(CK_LT, fRES(useruse3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {NotNull, varchar(60)}
     * @param useruse3 The value of useruse3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_GreaterEqual(String useruse3) {
        regUseruse3(CK_GE, fRES(useruse3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {NotNull, varchar(60)}
     * @param useruse3 The value of useruse3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_LessEqual(String useruse3) {
        regUseruse3(CK_LE, fRES(useruse3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE3: {NotNull, varchar(60)}
     * @param useruse3List The collection of useruse3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_InScope(Collection<String> useruse3List) {
        doSetUseruse3_InScope(useruse3List);
    }

    protected void doSetUseruse3_InScope(Collection<String> useruse3List) {
        regINS(CK_INS, cTL(useruse3List), xgetCValueUseruse3(), "USERUSE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE3: {NotNull, varchar(60)}
     * @param useruse3List The collection of useruse3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_NotInScope(Collection<String> useruse3List) {
        doSetUseruse3_NotInScope(useruse3List);
    }

    protected void doSetUseruse3_NotInScope(Collection<String> useruse3List) {
        regINS(CK_NINS, cTL(useruse3List), xgetCValueUseruse3(), "USERUSE3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE3: {NotNull, varchar(60)} <br>
     * <pre>e.g. setUseruse3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse3 The value of useruse3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse3_LikeSearch(String useruse3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse3), xgetCValueUseruse3(), "USERUSE3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE3: {NotNull, varchar(60)}
     * @param useruse3 The value of useruse3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse3_NotLikeSearch(String useruse3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse3), xgetCValueUseruse3(), "USERUSE3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE3: {NotNull, varchar(60)}
     * @param useruse3 The value of useruse3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_PrefixSearch(String useruse3) {
        setUseruse3_LikeSearch(useruse3, xcLSOPPre());
    }

    protected void regUseruse3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse3(), "USERUSE3"); }
    protected abstract ConditionValue xgetCValueUseruse3();

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
    public HpSLCFunction<EProductSendCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EProductSendCB.class);
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
    public HpSLCFunction<EProductSendCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EProductSendCB.class);
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
    public HpSLCFunction<EProductSendCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EProductSendCB.class);
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
    public HpSLCFunction<EProductSendCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EProductSendCB.class);
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
    public HpSLCFunction<EProductSendCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EProductSendCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EProductSendCB&gt;() {
     *     public void query(EProductSendCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EProductSendCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EProductSendCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductSendCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EProductSendCQ sq);

    protected EProductSendCB xcreateScalarConditionCB() {
        EProductSendCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EProductSendCB xcreateScalarConditionPartitionByCB() {
        EProductSendCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EProductSendCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductSendCB cb = new EProductSendCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRODUCT_SEND_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EProductSendCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EProductSendCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EProductSendCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductSendCB cb = new EProductSendCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_SEND_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EProductSendCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EProductSendCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EProductSendCB cb = new EProductSendCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EProductSendCQ sq);

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
    protected EProductSendCB newMyCB() {
        return new EProductSendCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EProductSendCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

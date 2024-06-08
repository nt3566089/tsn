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
 * The abstract condition-query of T_TRALLINVHISTORY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrallinvhistoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrallinvhistoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRALLINVHISTORY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRALLINVHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvhistoryId The value of trallinvhistoryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrallinvhistoryId_Equal(Long trallinvhistoryId) {
        doSetTrallinvhistoryId_Equal(trallinvhistoryId);
    }

    protected void doSetTrallinvhistoryId_Equal(Long trallinvhistoryId) {
        regTrallinvhistoryId(CK_EQ, trallinvhistoryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRALLINVHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvhistoryId The value of trallinvhistoryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrallinvhistoryId_NotEqual(Long trallinvhistoryId) {
        doSetTrallinvhistoryId_NotEqual(trallinvhistoryId);
    }

    protected void doSetTrallinvhistoryId_NotEqual(Long trallinvhistoryId) {
        regTrallinvhistoryId(CK_NES, trallinvhistoryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRALLINVHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvhistoryId The value of trallinvhistoryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrallinvhistoryId_GreaterThan(Long trallinvhistoryId) {
        regTrallinvhistoryId(CK_GT, trallinvhistoryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRALLINVHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvhistoryId The value of trallinvhistoryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrallinvhistoryId_LessThan(Long trallinvhistoryId) {
        regTrallinvhistoryId(CK_LT, trallinvhistoryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRALLINVHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvhistoryId The value of trallinvhistoryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrallinvhistoryId_GreaterEqual(Long trallinvhistoryId) {
        regTrallinvhistoryId(CK_GE, trallinvhistoryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRALLINVHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvhistoryId The value of trallinvhistoryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrallinvhistoryId_LessEqual(Long trallinvhistoryId) {
        regTrallinvhistoryId(CK_LE, trallinvhistoryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRALLINVHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trallinvhistoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trallinvhistoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrallinvhistoryId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrallinvhistoryId(), "TRALLINVHISTORY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRALLINVHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvhistoryIdList The collection of trallinvhistoryId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrallinvhistoryId_InScope(Collection<Long> trallinvhistoryIdList) {
        doSetTrallinvhistoryId_InScope(trallinvhistoryIdList);
    }

    protected void doSetTrallinvhistoryId_InScope(Collection<Long> trallinvhistoryIdList) {
        regINS(CK_INS, cTL(trallinvhistoryIdList), xgetCValueTrallinvhistoryId(), "TRALLINVHISTORY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRALLINVHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvhistoryIdList The collection of trallinvhistoryId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrallinvhistoryId_NotInScope(Collection<Long> trallinvhistoryIdList) {
        doSetTrallinvhistoryId_NotInScope(trallinvhistoryIdList);
    }

    protected void doSetTrallinvhistoryId_NotInScope(Collection<Long> trallinvhistoryIdList) {
        regINS(CK_NINS, cTL(trallinvhistoryIdList), xgetCValueTrallinvhistoryId(), "TRALLINVHISTORY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRALLINVHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrallinvhistoryId_IsNull() { regTrallinvhistoryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRALLINVHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrallinvhistoryId_IsNotNull() { regTrallinvhistoryId(CK_ISNN, DOBJ); }

    protected void regTrallinvhistoryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrallinvhistoryId(), "TRALLINVHISTORY_ID"); }
    protected abstract ConditionValue xgetCValueTrallinvhistoryId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_Equal(String executedate) {
        doSetExecutedate_Equal(fRES(executedate));
    }

    protected void doSetExecutedate_Equal(String executedate) {
        regExecutedate(CK_EQ, executedate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_NotEqual(String executedate) {
        doSetExecutedate_NotEqual(fRES(executedate));
    }

    protected void doSetExecutedate_NotEqual(String executedate) {
        regExecutedate(CK_NES, executedate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_GreaterThan(String executedate) {
        regExecutedate(CK_GT, fRES(executedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_LessThan(String executedate) {
        regExecutedate(CK_LT, fRES(executedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_GreaterEqual(String executedate) {
        regExecutedate(CK_GE, fRES(executedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_LessEqual(String executedate) {
        regExecutedate(CK_LE, fRES(executedate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedateList The collection of executedate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_InScope(Collection<String> executedateList) {
        doSetExecutedate_InScope(executedateList);
    }

    protected void doSetExecutedate_InScope(Collection<String> executedateList) {
        regINS(CK_INS, cTL(executedateList), xgetCValueExecutedate(), "EXECUTEDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedateList The collection of executedate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_NotInScope(Collection<String> executedateList) {
        doSetExecutedate_NotInScope(executedateList);
    }

    protected void doSetExecutedate_NotInScope(Collection<String> executedateList) {
        regINS(CK_NINS, cTL(executedateList), xgetCValueExecutedate(), "EXECUTEDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setExecutedate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param executedate The value of executedate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExecutedate_LikeSearch(String executedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(executedate), xgetCValueExecutedate(), "EXECUTEDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExecutedate_NotLikeSearch(String executedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(executedate), xgetCValueExecutedate(), "EXECUTEDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_PrefixSearch(String executedate) {
        setExecutedate_LikeSearch(executedate, xcLSOPPre());
    }

    protected void regExecutedate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExecutedate(), "EXECUTEDATE"); }
    protected abstract ConditionValue xgetCValueExecutedate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbn The value of inoutkbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_Equal(String inoutkbn) {
        doSetInoutkbn_Equal(fRES(inoutkbn));
    }

    protected void doSetInoutkbn_Equal(String inoutkbn) {
        regInoutkbn(CK_EQ, inoutkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbn The value of inoutkbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_NotEqual(String inoutkbn) {
        doSetInoutkbn_NotEqual(fRES(inoutkbn));
    }

    protected void doSetInoutkbn_NotEqual(String inoutkbn) {
        regInoutkbn(CK_NES, inoutkbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbn The value of inoutkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_GreaterThan(String inoutkbn) {
        regInoutkbn(CK_GT, fRES(inoutkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbn The value of inoutkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_LessThan(String inoutkbn) {
        regInoutkbn(CK_LT, fRES(inoutkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbn The value of inoutkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_GreaterEqual(String inoutkbn) {
        regInoutkbn(CK_GE, fRES(inoutkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbn The value of inoutkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_LessEqual(String inoutkbn) {
        regInoutkbn(CK_LE, fRES(inoutkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbnList The collection of inoutkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_InScope(Collection<String> inoutkbnList) {
        doSetInoutkbn_InScope(inoutkbnList);
    }

    protected void doSetInoutkbn_InScope(Collection<String> inoutkbnList) {
        regINS(CK_INS, cTL(inoutkbnList), xgetCValueInoutkbn(), "INOUTKBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbnList The collection of inoutkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_NotInScope(Collection<String> inoutkbnList) {
        doSetInoutkbn_NotInScope(inoutkbnList);
    }

    protected void doSetInoutkbn_NotInScope(Collection<String> inoutkbnList) {
        regINS(CK_NINS, cTL(inoutkbnList), xgetCValueInoutkbn(), "INOUTKBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)} <br>
     * <pre>e.g. setInoutkbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inoutkbn The value of inoutkbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInoutkbn_LikeSearch(String inoutkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inoutkbn), xgetCValueInoutkbn(), "INOUTKBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbn The value of inoutkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInoutkbn_NotLikeSearch(String inoutkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inoutkbn), xgetCValueInoutkbn(), "INOUTKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbn The value of inoutkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_PrefixSearch(String inoutkbn) {
        setInoutkbn_LikeSearch(inoutkbn, xcLSOPPre());
    }

    protected void regInoutkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInoutkbn(), "INOUTKBN"); }
    protected abstract ConditionValue xgetCValueInoutkbn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(Long productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Long productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinv The value of sysinvtotalinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_Equal(java.math.BigDecimal sysinvtotalinv) {
        doSetSysinvtotalinv_Equal(sysinvtotalinv);
    }

    protected void doSetSysinvtotalinv_Equal(java.math.BigDecimal sysinvtotalinv) {
        regSysinvtotalinv(CK_EQ, sysinvtotalinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinv The value of sysinvtotalinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_NotEqual(java.math.BigDecimal sysinvtotalinv) {
        doSetSysinvtotalinv_NotEqual(sysinvtotalinv);
    }

    protected void doSetSysinvtotalinv_NotEqual(java.math.BigDecimal sysinvtotalinv) {
        regSysinvtotalinv(CK_NES, sysinvtotalinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinv The value of sysinvtotalinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_GreaterThan(java.math.BigDecimal sysinvtotalinv) {
        regSysinvtotalinv(CK_GT, sysinvtotalinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinv The value of sysinvtotalinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_LessThan(java.math.BigDecimal sysinvtotalinv) {
        regSysinvtotalinv(CK_LT, sysinvtotalinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinv The value of sysinvtotalinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_GreaterEqual(java.math.BigDecimal sysinvtotalinv) {
        regSysinvtotalinv(CK_GE, sysinvtotalinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinv The value of sysinvtotalinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_LessEqual(java.math.BigDecimal sysinvtotalinv) {
        regSysinvtotalinv(CK_LE, sysinvtotalinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param minNumber The min number of sysinvtotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sysinvtotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSysinvtotalinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSysinvtotalinv(), "SYSINVTOTALINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinvList The collection of sysinvtotalinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_InScope(Collection<java.math.BigDecimal> sysinvtotalinvList) {
        doSetSysinvtotalinv_InScope(sysinvtotalinvList);
    }

    protected void doSetSysinvtotalinv_InScope(Collection<java.math.BigDecimal> sysinvtotalinvList) {
        regINS(CK_INS, cTL(sysinvtotalinvList), xgetCValueSysinvtotalinv(), "SYSINVTOTALINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinvList The collection of sysinvtotalinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_NotInScope(Collection<java.math.BigDecimal> sysinvtotalinvList) {
        doSetSysinvtotalinv_NotInScope(sysinvtotalinvList);
    }

    protected void doSetSysinvtotalinv_NotInScope(Collection<java.math.BigDecimal> sysinvtotalinvList) {
        regINS(CK_NINS, cTL(sysinvtotalinvList), xgetCValueSysinvtotalinv(), "SYSINVTOTALINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     */
    public void setSysinvtotalinv_IsNull() { regSysinvtotalinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     */
    public void setSysinvtotalinv_IsNotNull() { regSysinvtotalinv(CK_ISNN, DOBJ); }

    protected void regSysinvtotalinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSysinvtotalinv(), "SYSINVTOTALINV"); }
    protected abstract ConditionValue xgetCValueSysinvtotalinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVKEEPLOCINV: {decimal(16, 6)}
     * @param sysinvkeeplocinv The value of sysinvkeeplocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvkeeplocinv_Equal(java.math.BigDecimal sysinvkeeplocinv) {
        doSetSysinvkeeplocinv_Equal(sysinvkeeplocinv);
    }

    protected void doSetSysinvkeeplocinv_Equal(java.math.BigDecimal sysinvkeeplocinv) {
        regSysinvkeeplocinv(CK_EQ, sysinvkeeplocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVKEEPLOCINV: {decimal(16, 6)}
     * @param sysinvkeeplocinv The value of sysinvkeeplocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvkeeplocinv_NotEqual(java.math.BigDecimal sysinvkeeplocinv) {
        doSetSysinvkeeplocinv_NotEqual(sysinvkeeplocinv);
    }

    protected void doSetSysinvkeeplocinv_NotEqual(java.math.BigDecimal sysinvkeeplocinv) {
        regSysinvkeeplocinv(CK_NES, sysinvkeeplocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVKEEPLOCINV: {decimal(16, 6)}
     * @param sysinvkeeplocinv The value of sysinvkeeplocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvkeeplocinv_GreaterThan(java.math.BigDecimal sysinvkeeplocinv) {
        regSysinvkeeplocinv(CK_GT, sysinvkeeplocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVKEEPLOCINV: {decimal(16, 6)}
     * @param sysinvkeeplocinv The value of sysinvkeeplocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvkeeplocinv_LessThan(java.math.BigDecimal sysinvkeeplocinv) {
        regSysinvkeeplocinv(CK_LT, sysinvkeeplocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVKEEPLOCINV: {decimal(16, 6)}
     * @param sysinvkeeplocinv The value of sysinvkeeplocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvkeeplocinv_GreaterEqual(java.math.BigDecimal sysinvkeeplocinv) {
        regSysinvkeeplocinv(CK_GE, sysinvkeeplocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVKEEPLOCINV: {decimal(16, 6)}
     * @param sysinvkeeplocinv The value of sysinvkeeplocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvkeeplocinv_LessEqual(java.math.BigDecimal sysinvkeeplocinv) {
        regSysinvkeeplocinv(CK_LE, sysinvkeeplocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVKEEPLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of sysinvkeeplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sysinvkeeplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSysinvkeeplocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSysinvkeeplocinv(), "SYSINVKEEPLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVKEEPLOCINV: {decimal(16, 6)}
     * @param sysinvkeeplocinvList The collection of sysinvkeeplocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvkeeplocinv_InScope(Collection<java.math.BigDecimal> sysinvkeeplocinvList) {
        doSetSysinvkeeplocinv_InScope(sysinvkeeplocinvList);
    }

    protected void doSetSysinvkeeplocinv_InScope(Collection<java.math.BigDecimal> sysinvkeeplocinvList) {
        regINS(CK_INS, cTL(sysinvkeeplocinvList), xgetCValueSysinvkeeplocinv(), "SYSINVKEEPLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVKEEPLOCINV: {decimal(16, 6)}
     * @param sysinvkeeplocinvList The collection of sysinvkeeplocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvkeeplocinv_NotInScope(Collection<java.math.BigDecimal> sysinvkeeplocinvList) {
        doSetSysinvkeeplocinv_NotInScope(sysinvkeeplocinvList);
    }

    protected void doSetSysinvkeeplocinv_NotInScope(Collection<java.math.BigDecimal> sysinvkeeplocinvList) {
        regINS(CK_NINS, cTL(sysinvkeeplocinvList), xgetCValueSysinvkeeplocinv(), "SYSINVKEEPLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSINVKEEPLOCINV: {decimal(16, 6)}
     */
    public void setSysinvkeeplocinv_IsNull() { regSysinvkeeplocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSINVKEEPLOCINV: {decimal(16, 6)}
     */
    public void setSysinvkeeplocinv_IsNotNull() { regSysinvkeeplocinv(CK_ISNN, DOBJ); }

    protected void regSysinvkeeplocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSysinvkeeplocinv(), "SYSINVKEEPLOCINV"); }
    protected abstract ConditionValue xgetCValueSysinvkeeplocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVRECEIVELOCINV: {decimal(16, 6)}
     * @param sysinvreceivelocinv The value of sysinvreceivelocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvreceivelocinv_Equal(java.math.BigDecimal sysinvreceivelocinv) {
        doSetSysinvreceivelocinv_Equal(sysinvreceivelocinv);
    }

    protected void doSetSysinvreceivelocinv_Equal(java.math.BigDecimal sysinvreceivelocinv) {
        regSysinvreceivelocinv(CK_EQ, sysinvreceivelocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVRECEIVELOCINV: {decimal(16, 6)}
     * @param sysinvreceivelocinv The value of sysinvreceivelocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvreceivelocinv_NotEqual(java.math.BigDecimal sysinvreceivelocinv) {
        doSetSysinvreceivelocinv_NotEqual(sysinvreceivelocinv);
    }

    protected void doSetSysinvreceivelocinv_NotEqual(java.math.BigDecimal sysinvreceivelocinv) {
        regSysinvreceivelocinv(CK_NES, sysinvreceivelocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVRECEIVELOCINV: {decimal(16, 6)}
     * @param sysinvreceivelocinv The value of sysinvreceivelocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvreceivelocinv_GreaterThan(java.math.BigDecimal sysinvreceivelocinv) {
        regSysinvreceivelocinv(CK_GT, sysinvreceivelocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVRECEIVELOCINV: {decimal(16, 6)}
     * @param sysinvreceivelocinv The value of sysinvreceivelocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvreceivelocinv_LessThan(java.math.BigDecimal sysinvreceivelocinv) {
        regSysinvreceivelocinv(CK_LT, sysinvreceivelocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVRECEIVELOCINV: {decimal(16, 6)}
     * @param sysinvreceivelocinv The value of sysinvreceivelocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvreceivelocinv_GreaterEqual(java.math.BigDecimal sysinvreceivelocinv) {
        regSysinvreceivelocinv(CK_GE, sysinvreceivelocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVRECEIVELOCINV: {decimal(16, 6)}
     * @param sysinvreceivelocinv The value of sysinvreceivelocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvreceivelocinv_LessEqual(java.math.BigDecimal sysinvreceivelocinv) {
        regSysinvreceivelocinv(CK_LE, sysinvreceivelocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVRECEIVELOCINV: {decimal(16, 6)}
     * @param minNumber The min number of sysinvreceivelocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sysinvreceivelocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSysinvreceivelocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSysinvreceivelocinv(), "SYSINVRECEIVELOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVRECEIVELOCINV: {decimal(16, 6)}
     * @param sysinvreceivelocinvList The collection of sysinvreceivelocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvreceivelocinv_InScope(Collection<java.math.BigDecimal> sysinvreceivelocinvList) {
        doSetSysinvreceivelocinv_InScope(sysinvreceivelocinvList);
    }

    protected void doSetSysinvreceivelocinv_InScope(Collection<java.math.BigDecimal> sysinvreceivelocinvList) {
        regINS(CK_INS, cTL(sysinvreceivelocinvList), xgetCValueSysinvreceivelocinv(), "SYSINVRECEIVELOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVRECEIVELOCINV: {decimal(16, 6)}
     * @param sysinvreceivelocinvList The collection of sysinvreceivelocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvreceivelocinv_NotInScope(Collection<java.math.BigDecimal> sysinvreceivelocinvList) {
        doSetSysinvreceivelocinv_NotInScope(sysinvreceivelocinvList);
    }

    protected void doSetSysinvreceivelocinv_NotInScope(Collection<java.math.BigDecimal> sysinvreceivelocinvList) {
        regINS(CK_NINS, cTL(sysinvreceivelocinvList), xgetCValueSysinvreceivelocinv(), "SYSINVRECEIVELOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSINVRECEIVELOCINV: {decimal(16, 6)}
     */
    public void setSysinvreceivelocinv_IsNull() { regSysinvreceivelocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSINVRECEIVELOCINV: {decimal(16, 6)}
     */
    public void setSysinvreceivelocinv_IsNotNull() { regSysinvreceivelocinv(CK_ISNN, DOBJ); }

    protected void regSysinvreceivelocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSysinvreceivelocinv(), "SYSINVRECEIVELOCINV"); }
    protected abstract ConditionValue xgetCValueSysinvreceivelocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVDAMAGEITEM: {decimal(16, 6)}
     * @param sysinvdamageitem The value of sysinvdamageitem as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvdamageitem_Equal(java.math.BigDecimal sysinvdamageitem) {
        doSetSysinvdamageitem_Equal(sysinvdamageitem);
    }

    protected void doSetSysinvdamageitem_Equal(java.math.BigDecimal sysinvdamageitem) {
        regSysinvdamageitem(CK_EQ, sysinvdamageitem);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVDAMAGEITEM: {decimal(16, 6)}
     * @param sysinvdamageitem The value of sysinvdamageitem as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvdamageitem_NotEqual(java.math.BigDecimal sysinvdamageitem) {
        doSetSysinvdamageitem_NotEqual(sysinvdamageitem);
    }

    protected void doSetSysinvdamageitem_NotEqual(java.math.BigDecimal sysinvdamageitem) {
        regSysinvdamageitem(CK_NES, sysinvdamageitem);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVDAMAGEITEM: {decimal(16, 6)}
     * @param sysinvdamageitem The value of sysinvdamageitem as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvdamageitem_GreaterThan(java.math.BigDecimal sysinvdamageitem) {
        regSysinvdamageitem(CK_GT, sysinvdamageitem);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVDAMAGEITEM: {decimal(16, 6)}
     * @param sysinvdamageitem The value of sysinvdamageitem as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvdamageitem_LessThan(java.math.BigDecimal sysinvdamageitem) {
        regSysinvdamageitem(CK_LT, sysinvdamageitem);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVDAMAGEITEM: {decimal(16, 6)}
     * @param sysinvdamageitem The value of sysinvdamageitem as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvdamageitem_GreaterEqual(java.math.BigDecimal sysinvdamageitem) {
        regSysinvdamageitem(CK_GE, sysinvdamageitem);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVDAMAGEITEM: {decimal(16, 6)}
     * @param sysinvdamageitem The value of sysinvdamageitem as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvdamageitem_LessEqual(java.math.BigDecimal sysinvdamageitem) {
        regSysinvdamageitem(CK_LE, sysinvdamageitem);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVDAMAGEITEM: {decimal(16, 6)}
     * @param minNumber The min number of sysinvdamageitem. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sysinvdamageitem. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSysinvdamageitem_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSysinvdamageitem(), "SYSINVDAMAGEITEM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVDAMAGEITEM: {decimal(16, 6)}
     * @param sysinvdamageitemList The collection of sysinvdamageitem as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvdamageitem_InScope(Collection<java.math.BigDecimal> sysinvdamageitemList) {
        doSetSysinvdamageitem_InScope(sysinvdamageitemList);
    }

    protected void doSetSysinvdamageitem_InScope(Collection<java.math.BigDecimal> sysinvdamageitemList) {
        regINS(CK_INS, cTL(sysinvdamageitemList), xgetCValueSysinvdamageitem(), "SYSINVDAMAGEITEM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVDAMAGEITEM: {decimal(16, 6)}
     * @param sysinvdamageitemList The collection of sysinvdamageitem as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvdamageitem_NotInScope(Collection<java.math.BigDecimal> sysinvdamageitemList) {
        doSetSysinvdamageitem_NotInScope(sysinvdamageitemList);
    }

    protected void doSetSysinvdamageitem_NotInScope(Collection<java.math.BigDecimal> sysinvdamageitemList) {
        regINS(CK_NINS, cTL(sysinvdamageitemList), xgetCValueSysinvdamageitem(), "SYSINVDAMAGEITEM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSINVDAMAGEITEM: {decimal(16, 6)}
     */
    public void setSysinvdamageitem_IsNull() { regSysinvdamageitem(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSINVDAMAGEITEM: {decimal(16, 6)}
     */
    public void setSysinvdamageitem_IsNotNull() { regSysinvdamageitem(CK_ISNN, DOBJ); }

    protected void regSysinvdamageitem(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSysinvdamageitem(), "SYSINVDAMAGEITEM"); }
    protected abstract ConditionValue xgetCValueSysinvdamageitem();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVCLSSIFYLOCINV: {decimal(16, 6)}
     * @param sysinvclssifylocinv The value of sysinvclssifylocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvclssifylocinv_Equal(java.math.BigDecimal sysinvclssifylocinv) {
        doSetSysinvclssifylocinv_Equal(sysinvclssifylocinv);
    }

    protected void doSetSysinvclssifylocinv_Equal(java.math.BigDecimal sysinvclssifylocinv) {
        regSysinvclssifylocinv(CK_EQ, sysinvclssifylocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVCLSSIFYLOCINV: {decimal(16, 6)}
     * @param sysinvclssifylocinv The value of sysinvclssifylocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvclssifylocinv_NotEqual(java.math.BigDecimal sysinvclssifylocinv) {
        doSetSysinvclssifylocinv_NotEqual(sysinvclssifylocinv);
    }

    protected void doSetSysinvclssifylocinv_NotEqual(java.math.BigDecimal sysinvclssifylocinv) {
        regSysinvclssifylocinv(CK_NES, sysinvclssifylocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVCLSSIFYLOCINV: {decimal(16, 6)}
     * @param sysinvclssifylocinv The value of sysinvclssifylocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvclssifylocinv_GreaterThan(java.math.BigDecimal sysinvclssifylocinv) {
        regSysinvclssifylocinv(CK_GT, sysinvclssifylocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVCLSSIFYLOCINV: {decimal(16, 6)}
     * @param sysinvclssifylocinv The value of sysinvclssifylocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvclssifylocinv_LessThan(java.math.BigDecimal sysinvclssifylocinv) {
        regSysinvclssifylocinv(CK_LT, sysinvclssifylocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVCLSSIFYLOCINV: {decimal(16, 6)}
     * @param sysinvclssifylocinv The value of sysinvclssifylocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvclssifylocinv_GreaterEqual(java.math.BigDecimal sysinvclssifylocinv) {
        regSysinvclssifylocinv(CK_GE, sysinvclssifylocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVCLSSIFYLOCINV: {decimal(16, 6)}
     * @param sysinvclssifylocinv The value of sysinvclssifylocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvclssifylocinv_LessEqual(java.math.BigDecimal sysinvclssifylocinv) {
        regSysinvclssifylocinv(CK_LE, sysinvclssifylocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVCLSSIFYLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of sysinvclssifylocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sysinvclssifylocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSysinvclssifylocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSysinvclssifylocinv(), "SYSINVCLSSIFYLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVCLSSIFYLOCINV: {decimal(16, 6)}
     * @param sysinvclssifylocinvList The collection of sysinvclssifylocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvclssifylocinv_InScope(Collection<java.math.BigDecimal> sysinvclssifylocinvList) {
        doSetSysinvclssifylocinv_InScope(sysinvclssifylocinvList);
    }

    protected void doSetSysinvclssifylocinv_InScope(Collection<java.math.BigDecimal> sysinvclssifylocinvList) {
        regINS(CK_INS, cTL(sysinvclssifylocinvList), xgetCValueSysinvclssifylocinv(), "SYSINVCLSSIFYLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVCLSSIFYLOCINV: {decimal(16, 6)}
     * @param sysinvclssifylocinvList The collection of sysinvclssifylocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvclssifylocinv_NotInScope(Collection<java.math.BigDecimal> sysinvclssifylocinvList) {
        doSetSysinvclssifylocinv_NotInScope(sysinvclssifylocinvList);
    }

    protected void doSetSysinvclssifylocinv_NotInScope(Collection<java.math.BigDecimal> sysinvclssifylocinvList) {
        regINS(CK_NINS, cTL(sysinvclssifylocinvList), xgetCValueSysinvclssifylocinv(), "SYSINVCLSSIFYLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSINVCLSSIFYLOCINV: {decimal(16, 6)}
     */
    public void setSysinvclssifylocinv_IsNull() { regSysinvclssifylocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSINVCLSSIFYLOCINV: {decimal(16, 6)}
     */
    public void setSysinvclssifylocinv_IsNotNull() { regSysinvclssifylocinv(CK_ISNN, DOBJ); }

    protected void regSysinvclssifylocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSysinvclssifylocinv(), "SYSINVCLSSIFYLOCINV"); }
    protected abstract ConditionValue xgetCValueSysinvclssifylocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTMPLOCINV: {decimal(16, 6)}
     * @param sysinvtmplocinv The value of sysinvtmplocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtmplocinv_Equal(java.math.BigDecimal sysinvtmplocinv) {
        doSetSysinvtmplocinv_Equal(sysinvtmplocinv);
    }

    protected void doSetSysinvtmplocinv_Equal(java.math.BigDecimal sysinvtmplocinv) {
        regSysinvtmplocinv(CK_EQ, sysinvtmplocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTMPLOCINV: {decimal(16, 6)}
     * @param sysinvtmplocinv The value of sysinvtmplocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtmplocinv_NotEqual(java.math.BigDecimal sysinvtmplocinv) {
        doSetSysinvtmplocinv_NotEqual(sysinvtmplocinv);
    }

    protected void doSetSysinvtmplocinv_NotEqual(java.math.BigDecimal sysinvtmplocinv) {
        regSysinvtmplocinv(CK_NES, sysinvtmplocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTMPLOCINV: {decimal(16, 6)}
     * @param sysinvtmplocinv The value of sysinvtmplocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtmplocinv_GreaterThan(java.math.BigDecimal sysinvtmplocinv) {
        regSysinvtmplocinv(CK_GT, sysinvtmplocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTMPLOCINV: {decimal(16, 6)}
     * @param sysinvtmplocinv The value of sysinvtmplocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtmplocinv_LessThan(java.math.BigDecimal sysinvtmplocinv) {
        regSysinvtmplocinv(CK_LT, sysinvtmplocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTMPLOCINV: {decimal(16, 6)}
     * @param sysinvtmplocinv The value of sysinvtmplocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtmplocinv_GreaterEqual(java.math.BigDecimal sysinvtmplocinv) {
        regSysinvtmplocinv(CK_GE, sysinvtmplocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTMPLOCINV: {decimal(16, 6)}
     * @param sysinvtmplocinv The value of sysinvtmplocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtmplocinv_LessEqual(java.math.BigDecimal sysinvtmplocinv) {
        regSysinvtmplocinv(CK_LE, sysinvtmplocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTMPLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of sysinvtmplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sysinvtmplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSysinvtmplocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSysinvtmplocinv(), "SYSINVTMPLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVTMPLOCINV: {decimal(16, 6)}
     * @param sysinvtmplocinvList The collection of sysinvtmplocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvtmplocinv_InScope(Collection<java.math.BigDecimal> sysinvtmplocinvList) {
        doSetSysinvtmplocinv_InScope(sysinvtmplocinvList);
    }

    protected void doSetSysinvtmplocinv_InScope(Collection<java.math.BigDecimal> sysinvtmplocinvList) {
        regINS(CK_INS, cTL(sysinvtmplocinvList), xgetCValueSysinvtmplocinv(), "SYSINVTMPLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVTMPLOCINV: {decimal(16, 6)}
     * @param sysinvtmplocinvList The collection of sysinvtmplocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvtmplocinv_NotInScope(Collection<java.math.BigDecimal> sysinvtmplocinvList) {
        doSetSysinvtmplocinv_NotInScope(sysinvtmplocinvList);
    }

    protected void doSetSysinvtmplocinv_NotInScope(Collection<java.math.BigDecimal> sysinvtmplocinvList) {
        regINS(CK_NINS, cTL(sysinvtmplocinvList), xgetCValueSysinvtmplocinv(), "SYSINVTMPLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSINVTMPLOCINV: {decimal(16, 6)}
     */
    public void setSysinvtmplocinv_IsNull() { regSysinvtmplocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSINVTMPLOCINV: {decimal(16, 6)}
     */
    public void setSysinvtmplocinv_IsNotNull() { regSysinvtmplocinv(CK_ISNN, DOBJ); }

    protected void regSysinvtmplocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSysinvtmplocinv(), "SYSINVTMPLOCINV"); }
    protected abstract ConditionValue xgetCValueSysinvtmplocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVAUTOINV: {decimal(16, 6)}
     * @param sysinvautoinv The value of sysinvautoinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvautoinv_Equal(java.math.BigDecimal sysinvautoinv) {
        doSetSysinvautoinv_Equal(sysinvautoinv);
    }

    protected void doSetSysinvautoinv_Equal(java.math.BigDecimal sysinvautoinv) {
        regSysinvautoinv(CK_EQ, sysinvautoinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVAUTOINV: {decimal(16, 6)}
     * @param sysinvautoinv The value of sysinvautoinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvautoinv_NotEqual(java.math.BigDecimal sysinvautoinv) {
        doSetSysinvautoinv_NotEqual(sysinvautoinv);
    }

    protected void doSetSysinvautoinv_NotEqual(java.math.BigDecimal sysinvautoinv) {
        regSysinvautoinv(CK_NES, sysinvautoinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVAUTOINV: {decimal(16, 6)}
     * @param sysinvautoinv The value of sysinvautoinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvautoinv_GreaterThan(java.math.BigDecimal sysinvautoinv) {
        regSysinvautoinv(CK_GT, sysinvautoinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVAUTOINV: {decimal(16, 6)}
     * @param sysinvautoinv The value of sysinvautoinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvautoinv_LessThan(java.math.BigDecimal sysinvautoinv) {
        regSysinvautoinv(CK_LT, sysinvautoinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVAUTOINV: {decimal(16, 6)}
     * @param sysinvautoinv The value of sysinvautoinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvautoinv_GreaterEqual(java.math.BigDecimal sysinvautoinv) {
        regSysinvautoinv(CK_GE, sysinvautoinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVAUTOINV: {decimal(16, 6)}
     * @param sysinvautoinv The value of sysinvautoinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvautoinv_LessEqual(java.math.BigDecimal sysinvautoinv) {
        regSysinvautoinv(CK_LE, sysinvautoinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVAUTOINV: {decimal(16, 6)}
     * @param minNumber The min number of sysinvautoinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sysinvautoinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSysinvautoinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSysinvautoinv(), "SYSINVAUTOINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVAUTOINV: {decimal(16, 6)}
     * @param sysinvautoinvList The collection of sysinvautoinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvautoinv_InScope(Collection<java.math.BigDecimal> sysinvautoinvList) {
        doSetSysinvautoinv_InScope(sysinvautoinvList);
    }

    protected void doSetSysinvautoinv_InScope(Collection<java.math.BigDecimal> sysinvautoinvList) {
        regINS(CK_INS, cTL(sysinvautoinvList), xgetCValueSysinvautoinv(), "SYSINVAUTOINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVAUTOINV: {decimal(16, 6)}
     * @param sysinvautoinvList The collection of sysinvautoinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvautoinv_NotInScope(Collection<java.math.BigDecimal> sysinvautoinvList) {
        doSetSysinvautoinv_NotInScope(sysinvautoinvList);
    }

    protected void doSetSysinvautoinv_NotInScope(Collection<java.math.BigDecimal> sysinvautoinvList) {
        regINS(CK_NINS, cTL(sysinvautoinvList), xgetCValueSysinvautoinv(), "SYSINVAUTOINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSINVAUTOINV: {decimal(16, 6)}
     */
    public void setSysinvautoinv_IsNull() { regSysinvautoinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSINVAUTOINV: {decimal(16, 6)}
     */
    public void setSysinvautoinv_IsNotNull() { regSysinvautoinv(CK_ISNN, DOBJ); }

    protected void regSysinvautoinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSysinvautoinv(), "SYSINVAUTOINV"); }
    protected abstract ConditionValue xgetCValueSysinvautoinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinv The value of investtotalinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttotalinv_Equal(java.math.BigDecimal investtotalinv) {
        doSetInvesttotalinv_Equal(investtotalinv);
    }

    protected void doSetInvesttotalinv_Equal(java.math.BigDecimal investtotalinv) {
        regInvesttotalinv(CK_EQ, investtotalinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinv The value of investtotalinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttotalinv_NotEqual(java.math.BigDecimal investtotalinv) {
        doSetInvesttotalinv_NotEqual(investtotalinv);
    }

    protected void doSetInvesttotalinv_NotEqual(java.math.BigDecimal investtotalinv) {
        regInvesttotalinv(CK_NES, investtotalinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinv The value of investtotalinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttotalinv_GreaterThan(java.math.BigDecimal investtotalinv) {
        regInvesttotalinv(CK_GT, investtotalinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinv The value of investtotalinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttotalinv_LessThan(java.math.BigDecimal investtotalinv) {
        regInvesttotalinv(CK_LT, investtotalinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinv The value of investtotalinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttotalinv_GreaterEqual(java.math.BigDecimal investtotalinv) {
        regInvesttotalinv(CK_GE, investtotalinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinv The value of investtotalinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttotalinv_LessEqual(java.math.BigDecimal investtotalinv) {
        regInvesttotalinv(CK_LE, investtotalinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param minNumber The min number of investtotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of investtotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvesttotalinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvesttotalinv(), "INVESTTOTALINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinvList The collection of investtotalinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvesttotalinv_InScope(Collection<java.math.BigDecimal> investtotalinvList) {
        doSetInvesttotalinv_InScope(investtotalinvList);
    }

    protected void doSetInvesttotalinv_InScope(Collection<java.math.BigDecimal> investtotalinvList) {
        regINS(CK_INS, cTL(investtotalinvList), xgetCValueInvesttotalinv(), "INVESTTOTALINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinvList The collection of investtotalinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvesttotalinv_NotInScope(Collection<java.math.BigDecimal> investtotalinvList) {
        doSetInvesttotalinv_NotInScope(investtotalinvList);
    }

    protected void doSetInvesttotalinv_NotInScope(Collection<java.math.BigDecimal> investtotalinvList) {
        regINS(CK_NINS, cTL(investtotalinvList), xgetCValueInvesttotalinv(), "INVESTTOTALINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     */
    public void setInvesttotalinv_IsNull() { regInvesttotalinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     */
    public void setInvesttotalinv_IsNotNull() { regInvesttotalinv(CK_ISNN, DOBJ); }

    protected void regInvesttotalinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvesttotalinv(), "INVESTTOTALINV"); }
    protected abstract ConditionValue xgetCValueInvesttotalinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinv The value of investkeeplocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_Equal(java.math.BigDecimal investkeeplocinv) {
        doSetInvestkeeplocinv_Equal(investkeeplocinv);
    }

    protected void doSetInvestkeeplocinv_Equal(java.math.BigDecimal investkeeplocinv) {
        regInvestkeeplocinv(CK_EQ, investkeeplocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinv The value of investkeeplocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_NotEqual(java.math.BigDecimal investkeeplocinv) {
        doSetInvestkeeplocinv_NotEqual(investkeeplocinv);
    }

    protected void doSetInvestkeeplocinv_NotEqual(java.math.BigDecimal investkeeplocinv) {
        regInvestkeeplocinv(CK_NES, investkeeplocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinv The value of investkeeplocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_GreaterThan(java.math.BigDecimal investkeeplocinv) {
        regInvestkeeplocinv(CK_GT, investkeeplocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinv The value of investkeeplocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_LessThan(java.math.BigDecimal investkeeplocinv) {
        regInvestkeeplocinv(CK_LT, investkeeplocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinv The value of investkeeplocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_GreaterEqual(java.math.BigDecimal investkeeplocinv) {
        regInvestkeeplocinv(CK_GE, investkeeplocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinv The value of investkeeplocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_LessEqual(java.math.BigDecimal investkeeplocinv) {
        regInvestkeeplocinv(CK_LE, investkeeplocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of investkeeplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of investkeeplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvestkeeplocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvestkeeplocinv(), "INVESTKEEPLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinvList The collection of investkeeplocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_InScope(Collection<java.math.BigDecimal> investkeeplocinvList) {
        doSetInvestkeeplocinv_InScope(investkeeplocinvList);
    }

    protected void doSetInvestkeeplocinv_InScope(Collection<java.math.BigDecimal> investkeeplocinvList) {
        regINS(CK_INS, cTL(investkeeplocinvList), xgetCValueInvestkeeplocinv(), "INVESTKEEPLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinvList The collection of investkeeplocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_NotInScope(Collection<java.math.BigDecimal> investkeeplocinvList) {
        doSetInvestkeeplocinv_NotInScope(investkeeplocinvList);
    }

    protected void doSetInvestkeeplocinv_NotInScope(Collection<java.math.BigDecimal> investkeeplocinvList) {
        regINS(CK_NINS, cTL(investkeeplocinvList), xgetCValueInvestkeeplocinv(), "INVESTKEEPLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     */
    public void setInvestkeeplocinv_IsNull() { regInvestkeeplocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     */
    public void setInvestkeeplocinv_IsNotNull() { regInvestkeeplocinv(CK_ISNN, DOBJ); }

    protected void regInvestkeeplocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvestkeeplocinv(), "INVESTKEEPLOCINV"); }
    protected abstract ConditionValue xgetCValueInvestkeeplocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinv The value of investreceivelocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_Equal(java.math.BigDecimal investreceivelocinv) {
        doSetInvestreceivelocinv_Equal(investreceivelocinv);
    }

    protected void doSetInvestreceivelocinv_Equal(java.math.BigDecimal investreceivelocinv) {
        regInvestreceivelocinv(CK_EQ, investreceivelocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinv The value of investreceivelocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_NotEqual(java.math.BigDecimal investreceivelocinv) {
        doSetInvestreceivelocinv_NotEqual(investreceivelocinv);
    }

    protected void doSetInvestreceivelocinv_NotEqual(java.math.BigDecimal investreceivelocinv) {
        regInvestreceivelocinv(CK_NES, investreceivelocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinv The value of investreceivelocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_GreaterThan(java.math.BigDecimal investreceivelocinv) {
        regInvestreceivelocinv(CK_GT, investreceivelocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinv The value of investreceivelocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_LessThan(java.math.BigDecimal investreceivelocinv) {
        regInvestreceivelocinv(CK_LT, investreceivelocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinv The value of investreceivelocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_GreaterEqual(java.math.BigDecimal investreceivelocinv) {
        regInvestreceivelocinv(CK_GE, investreceivelocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinv The value of investreceivelocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_LessEqual(java.math.BigDecimal investreceivelocinv) {
        regInvestreceivelocinv(CK_LE, investreceivelocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param minNumber The min number of investreceivelocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of investreceivelocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvestreceivelocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvestreceivelocinv(), "INVESTRECEIVELOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinvList The collection of investreceivelocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_InScope(Collection<java.math.BigDecimal> investreceivelocinvList) {
        doSetInvestreceivelocinv_InScope(investreceivelocinvList);
    }

    protected void doSetInvestreceivelocinv_InScope(Collection<java.math.BigDecimal> investreceivelocinvList) {
        regINS(CK_INS, cTL(investreceivelocinvList), xgetCValueInvestreceivelocinv(), "INVESTRECEIVELOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinvList The collection of investreceivelocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_NotInScope(Collection<java.math.BigDecimal> investreceivelocinvList) {
        doSetInvestreceivelocinv_NotInScope(investreceivelocinvList);
    }

    protected void doSetInvestreceivelocinv_NotInScope(Collection<java.math.BigDecimal> investreceivelocinvList) {
        regINS(CK_NINS, cTL(investreceivelocinvList), xgetCValueInvestreceivelocinv(), "INVESTRECEIVELOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     */
    public void setInvestreceivelocinv_IsNull() { regInvestreceivelocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     */
    public void setInvestreceivelocinv_IsNotNull() { regInvestreceivelocinv(CK_ISNN, DOBJ); }

    protected void regInvestreceivelocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvestreceivelocinv(), "INVESTRECEIVELOCINV"); }
    protected abstract ConditionValue xgetCValueInvestreceivelocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitem The value of investdamageitem as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestdamageitem_Equal(java.math.BigDecimal investdamageitem) {
        doSetInvestdamageitem_Equal(investdamageitem);
    }

    protected void doSetInvestdamageitem_Equal(java.math.BigDecimal investdamageitem) {
        regInvestdamageitem(CK_EQ, investdamageitem);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitem The value of investdamageitem as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestdamageitem_NotEqual(java.math.BigDecimal investdamageitem) {
        doSetInvestdamageitem_NotEqual(investdamageitem);
    }

    protected void doSetInvestdamageitem_NotEqual(java.math.BigDecimal investdamageitem) {
        regInvestdamageitem(CK_NES, investdamageitem);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitem The value of investdamageitem as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestdamageitem_GreaterThan(java.math.BigDecimal investdamageitem) {
        regInvestdamageitem(CK_GT, investdamageitem);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitem The value of investdamageitem as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestdamageitem_LessThan(java.math.BigDecimal investdamageitem) {
        regInvestdamageitem(CK_LT, investdamageitem);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitem The value of investdamageitem as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestdamageitem_GreaterEqual(java.math.BigDecimal investdamageitem) {
        regInvestdamageitem(CK_GE, investdamageitem);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitem The value of investdamageitem as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestdamageitem_LessEqual(java.math.BigDecimal investdamageitem) {
        regInvestdamageitem(CK_LE, investdamageitem);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param minNumber The min number of investdamageitem. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of investdamageitem. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvestdamageitem_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvestdamageitem(), "INVESTDAMAGEITEM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitemList The collection of investdamageitem as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestdamageitem_InScope(Collection<java.math.BigDecimal> investdamageitemList) {
        doSetInvestdamageitem_InScope(investdamageitemList);
    }

    protected void doSetInvestdamageitem_InScope(Collection<java.math.BigDecimal> investdamageitemList) {
        regINS(CK_INS, cTL(investdamageitemList), xgetCValueInvestdamageitem(), "INVESTDAMAGEITEM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitemList The collection of investdamageitem as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestdamageitem_NotInScope(Collection<java.math.BigDecimal> investdamageitemList) {
        doSetInvestdamageitem_NotInScope(investdamageitemList);
    }

    protected void doSetInvestdamageitem_NotInScope(Collection<java.math.BigDecimal> investdamageitemList) {
        regINS(CK_NINS, cTL(investdamageitemList), xgetCValueInvestdamageitem(), "INVESTDAMAGEITEM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     */
    public void setInvestdamageitem_IsNull() { regInvestdamageitem(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     */
    public void setInvestdamageitem_IsNotNull() { regInvestdamageitem(CK_ISNN, DOBJ); }

    protected void regInvestdamageitem(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvestdamageitem(), "INVESTDAMAGEITEM"); }
    protected abstract ConditionValue xgetCValueInvestdamageitem();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinv The value of investclssifylocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_Equal(java.math.BigDecimal investclssifylocinv) {
        doSetInvestclssifylocinv_Equal(investclssifylocinv);
    }

    protected void doSetInvestclssifylocinv_Equal(java.math.BigDecimal investclssifylocinv) {
        regInvestclssifylocinv(CK_EQ, investclssifylocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinv The value of investclssifylocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_NotEqual(java.math.BigDecimal investclssifylocinv) {
        doSetInvestclssifylocinv_NotEqual(investclssifylocinv);
    }

    protected void doSetInvestclssifylocinv_NotEqual(java.math.BigDecimal investclssifylocinv) {
        regInvestclssifylocinv(CK_NES, investclssifylocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinv The value of investclssifylocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_GreaterThan(java.math.BigDecimal investclssifylocinv) {
        regInvestclssifylocinv(CK_GT, investclssifylocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinv The value of investclssifylocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_LessThan(java.math.BigDecimal investclssifylocinv) {
        regInvestclssifylocinv(CK_LT, investclssifylocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinv The value of investclssifylocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_GreaterEqual(java.math.BigDecimal investclssifylocinv) {
        regInvestclssifylocinv(CK_GE, investclssifylocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinv The value of investclssifylocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_LessEqual(java.math.BigDecimal investclssifylocinv) {
        regInvestclssifylocinv(CK_LE, investclssifylocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of investclssifylocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of investclssifylocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvestclssifylocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvestclssifylocinv(), "INVESTCLSSIFYLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinvList The collection of investclssifylocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_InScope(Collection<java.math.BigDecimal> investclssifylocinvList) {
        doSetInvestclssifylocinv_InScope(investclssifylocinvList);
    }

    protected void doSetInvestclssifylocinv_InScope(Collection<java.math.BigDecimal> investclssifylocinvList) {
        regINS(CK_INS, cTL(investclssifylocinvList), xgetCValueInvestclssifylocinv(), "INVESTCLSSIFYLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinvList The collection of investclssifylocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_NotInScope(Collection<java.math.BigDecimal> investclssifylocinvList) {
        doSetInvestclssifylocinv_NotInScope(investclssifylocinvList);
    }

    protected void doSetInvestclssifylocinv_NotInScope(Collection<java.math.BigDecimal> investclssifylocinvList) {
        regINS(CK_NINS, cTL(investclssifylocinvList), xgetCValueInvestclssifylocinv(), "INVESTCLSSIFYLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     */
    public void setInvestclssifylocinv_IsNull() { regInvestclssifylocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     */
    public void setInvestclssifylocinv_IsNotNull() { regInvestclssifylocinv(CK_ISNN, DOBJ); }

    protected void regInvestclssifylocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvestclssifylocinv(), "INVESTCLSSIFYLOCINV"); }
    protected abstract ConditionValue xgetCValueInvestclssifylocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinv The value of investtmplocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_Equal(java.math.BigDecimal investtmplocinv) {
        doSetInvesttmplocinv_Equal(investtmplocinv);
    }

    protected void doSetInvesttmplocinv_Equal(java.math.BigDecimal investtmplocinv) {
        regInvesttmplocinv(CK_EQ, investtmplocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinv The value of investtmplocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_NotEqual(java.math.BigDecimal investtmplocinv) {
        doSetInvesttmplocinv_NotEqual(investtmplocinv);
    }

    protected void doSetInvesttmplocinv_NotEqual(java.math.BigDecimal investtmplocinv) {
        regInvesttmplocinv(CK_NES, investtmplocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinv The value of investtmplocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_GreaterThan(java.math.BigDecimal investtmplocinv) {
        regInvesttmplocinv(CK_GT, investtmplocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinv The value of investtmplocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_LessThan(java.math.BigDecimal investtmplocinv) {
        regInvesttmplocinv(CK_LT, investtmplocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinv The value of investtmplocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_GreaterEqual(java.math.BigDecimal investtmplocinv) {
        regInvesttmplocinv(CK_GE, investtmplocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinv The value of investtmplocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_LessEqual(java.math.BigDecimal investtmplocinv) {
        regInvesttmplocinv(CK_LE, investtmplocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of investtmplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of investtmplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvesttmplocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvesttmplocinv(), "INVESTTMPLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinvList The collection of investtmplocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_InScope(Collection<java.math.BigDecimal> investtmplocinvList) {
        doSetInvesttmplocinv_InScope(investtmplocinvList);
    }

    protected void doSetInvesttmplocinv_InScope(Collection<java.math.BigDecimal> investtmplocinvList) {
        regINS(CK_INS, cTL(investtmplocinvList), xgetCValueInvesttmplocinv(), "INVESTTMPLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinvList The collection of investtmplocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_NotInScope(Collection<java.math.BigDecimal> investtmplocinvList) {
        doSetInvesttmplocinv_NotInScope(investtmplocinvList);
    }

    protected void doSetInvesttmplocinv_NotInScope(Collection<java.math.BigDecimal> investtmplocinvList) {
        regINS(CK_NINS, cTL(investtmplocinvList), xgetCValueInvesttmplocinv(), "INVESTTMPLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     */
    public void setInvesttmplocinv_IsNull() { regInvesttmplocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     */
    public void setInvesttmplocinv_IsNotNull() { regInvesttmplocinv(CK_ISNN, DOBJ); }

    protected void regInvesttmplocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvesttmplocinv(), "INVESTTMPLOCINV"); }
    protected abstract ConditionValue xgetCValueInvesttmplocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinv The value of investautoinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestautoinv_Equal(java.math.BigDecimal investautoinv) {
        doSetInvestautoinv_Equal(investautoinv);
    }

    protected void doSetInvestautoinv_Equal(java.math.BigDecimal investautoinv) {
        regInvestautoinv(CK_EQ, investautoinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinv The value of investautoinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestautoinv_NotEqual(java.math.BigDecimal investautoinv) {
        doSetInvestautoinv_NotEqual(investautoinv);
    }

    protected void doSetInvestautoinv_NotEqual(java.math.BigDecimal investautoinv) {
        regInvestautoinv(CK_NES, investautoinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinv The value of investautoinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestautoinv_GreaterThan(java.math.BigDecimal investautoinv) {
        regInvestautoinv(CK_GT, investautoinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinv The value of investautoinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestautoinv_LessThan(java.math.BigDecimal investautoinv) {
        regInvestautoinv(CK_LT, investautoinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinv The value of investautoinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestautoinv_GreaterEqual(java.math.BigDecimal investautoinv) {
        regInvestautoinv(CK_GE, investautoinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinv The value of investautoinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestautoinv_LessEqual(java.math.BigDecimal investautoinv) {
        regInvestautoinv(CK_LE, investautoinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param minNumber The min number of investautoinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of investautoinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvestautoinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvestautoinv(), "INVESTAUTOINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinvList The collection of investautoinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestautoinv_InScope(Collection<java.math.BigDecimal> investautoinvList) {
        doSetInvestautoinv_InScope(investautoinvList);
    }

    protected void doSetInvestautoinv_InScope(Collection<java.math.BigDecimal> investautoinvList) {
        regINS(CK_INS, cTL(investautoinvList), xgetCValueInvestautoinv(), "INVESTAUTOINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinvList The collection of investautoinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestautoinv_NotInScope(Collection<java.math.BigDecimal> investautoinvList) {
        doSetInvestautoinv_NotInScope(investautoinvList);
    }

    protected void doSetInvestautoinv_NotInScope(Collection<java.math.BigDecimal> investautoinvList) {
        regINS(CK_NINS, cTL(investautoinvList), xgetCValueInvestautoinv(), "INVESTAUTOINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     */
    public void setInvestautoinv_IsNull() { regInvestautoinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     */
    public void setInvestautoinv_IsNotNull() { regInvestautoinv(CK_ISNN, DOBJ); }

    protected void regInvestautoinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvestautoinv(), "INVESTAUTOINV"); }
    protected abstract ConditionValue xgetCValueInvestautoinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinv The value of ydaytlequlytotalinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_Equal(java.math.BigDecimal ydaytlequlytotalinv) {
        doSetYdaytlequlytotalinv_Equal(ydaytlequlytotalinv);
    }

    protected void doSetYdaytlequlytotalinv_Equal(java.math.BigDecimal ydaytlequlytotalinv) {
        regYdaytlequlytotalinv(CK_EQ, ydaytlequlytotalinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinv The value of ydaytlequlytotalinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_NotEqual(java.math.BigDecimal ydaytlequlytotalinv) {
        doSetYdaytlequlytotalinv_NotEqual(ydaytlequlytotalinv);
    }

    protected void doSetYdaytlequlytotalinv_NotEqual(java.math.BigDecimal ydaytlequlytotalinv) {
        regYdaytlequlytotalinv(CK_NES, ydaytlequlytotalinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinv The value of ydaytlequlytotalinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_GreaterThan(java.math.BigDecimal ydaytlequlytotalinv) {
        regYdaytlequlytotalinv(CK_GT, ydaytlequlytotalinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinv The value of ydaytlequlytotalinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_LessThan(java.math.BigDecimal ydaytlequlytotalinv) {
        regYdaytlequlytotalinv(CK_LT, ydaytlequlytotalinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinv The value of ydaytlequlytotalinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_GreaterEqual(java.math.BigDecimal ydaytlequlytotalinv) {
        regYdaytlequlytotalinv(CK_GE, ydaytlequlytotalinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinv The value of ydaytlequlytotalinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_LessEqual(java.math.BigDecimal ydaytlequlytotalinv) {
        regYdaytlequlytotalinv(CK_LE, ydaytlequlytotalinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param minNumber The min number of ydaytlequlytotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ydaytlequlytotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setYdaytlequlytotalinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueYdaytlequlytotalinv(), "YDAYTLEQULYTOTALINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinvList The collection of ydaytlequlytotalinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_InScope(Collection<java.math.BigDecimal> ydaytlequlytotalinvList) {
        doSetYdaytlequlytotalinv_InScope(ydaytlequlytotalinvList);
    }

    protected void doSetYdaytlequlytotalinv_InScope(Collection<java.math.BigDecimal> ydaytlequlytotalinvList) {
        regINS(CK_INS, cTL(ydaytlequlytotalinvList), xgetCValueYdaytlequlytotalinv(), "YDAYTLEQULYTOTALINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinvList The collection of ydaytlequlytotalinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_NotInScope(Collection<java.math.BigDecimal> ydaytlequlytotalinvList) {
        doSetYdaytlequlytotalinv_NotInScope(ydaytlequlytotalinvList);
    }

    protected void doSetYdaytlequlytotalinv_NotInScope(Collection<java.math.BigDecimal> ydaytlequlytotalinvList) {
        regINS(CK_NINS, cTL(ydaytlequlytotalinvList), xgetCValueYdaytlequlytotalinv(), "YDAYTLEQULYTOTALINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     */
    public void setYdaytlequlytotalinv_IsNull() { regYdaytlequlytotalinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     */
    public void setYdaytlequlytotalinv_IsNotNull() { regYdaytlequlytotalinv(CK_ISNN, DOBJ); }

    protected void regYdaytlequlytotalinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYdaytlequlytotalinv(), "YDAYTLEQULYTOTALINV"); }
    protected abstract ConditionValue xgetCValueYdaytlequlytotalinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlykeeplocinv The value of ydaytlequlykeeplocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlykeeplocinv_Equal(java.math.BigDecimal ydaytlequlykeeplocinv) {
        doSetYdaytlequlykeeplocinv_Equal(ydaytlequlykeeplocinv);
    }

    protected void doSetYdaytlequlykeeplocinv_Equal(java.math.BigDecimal ydaytlequlykeeplocinv) {
        regYdaytlequlykeeplocinv(CK_EQ, ydaytlequlykeeplocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlykeeplocinv The value of ydaytlequlykeeplocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlykeeplocinv_NotEqual(java.math.BigDecimal ydaytlequlykeeplocinv) {
        doSetYdaytlequlykeeplocinv_NotEqual(ydaytlequlykeeplocinv);
    }

    protected void doSetYdaytlequlykeeplocinv_NotEqual(java.math.BigDecimal ydaytlequlykeeplocinv) {
        regYdaytlequlykeeplocinv(CK_NES, ydaytlequlykeeplocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlykeeplocinv The value of ydaytlequlykeeplocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlykeeplocinv_GreaterThan(java.math.BigDecimal ydaytlequlykeeplocinv) {
        regYdaytlequlykeeplocinv(CK_GT, ydaytlequlykeeplocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlykeeplocinv The value of ydaytlequlykeeplocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlykeeplocinv_LessThan(java.math.BigDecimal ydaytlequlykeeplocinv) {
        regYdaytlequlykeeplocinv(CK_LT, ydaytlequlykeeplocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlykeeplocinv The value of ydaytlequlykeeplocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlykeeplocinv_GreaterEqual(java.math.BigDecimal ydaytlequlykeeplocinv) {
        regYdaytlequlykeeplocinv(CK_GE, ydaytlequlykeeplocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlykeeplocinv The value of ydaytlequlykeeplocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlykeeplocinv_LessEqual(java.math.BigDecimal ydaytlequlykeeplocinv) {
        regYdaytlequlykeeplocinv(CK_LE, ydaytlequlykeeplocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of ydaytlequlykeeplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ydaytlequlykeeplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setYdaytlequlykeeplocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueYdaytlequlykeeplocinv(), "YDAYTLEQULYKEEPLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlykeeplocinvList The collection of ydaytlequlykeeplocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlykeeplocinv_InScope(Collection<java.math.BigDecimal> ydaytlequlykeeplocinvList) {
        doSetYdaytlequlykeeplocinv_InScope(ydaytlequlykeeplocinvList);
    }

    protected void doSetYdaytlequlykeeplocinv_InScope(Collection<java.math.BigDecimal> ydaytlequlykeeplocinvList) {
        regINS(CK_INS, cTL(ydaytlequlykeeplocinvList), xgetCValueYdaytlequlykeeplocinv(), "YDAYTLEQULYKEEPLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlykeeplocinvList The collection of ydaytlequlykeeplocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlykeeplocinv_NotInScope(Collection<java.math.BigDecimal> ydaytlequlykeeplocinvList) {
        doSetYdaytlequlykeeplocinv_NotInScope(ydaytlequlykeeplocinvList);
    }

    protected void doSetYdaytlequlykeeplocinv_NotInScope(Collection<java.math.BigDecimal> ydaytlequlykeeplocinvList) {
        regINS(CK_NINS, cTL(ydaytlequlykeeplocinvList), xgetCValueYdaytlequlykeeplocinv(), "YDAYTLEQULYKEEPLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)}
     */
    public void setYdaytlequlykeeplocinv_IsNull() { regYdaytlequlykeeplocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)}
     */
    public void setYdaytlequlykeeplocinv_IsNotNull() { regYdaytlequlykeeplocinv(CK_ISNN, DOBJ); }

    protected void regYdaytlequlykeeplocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYdaytlequlykeeplocinv(), "YDAYTLEQULYKEEPLOCINV"); }
    protected abstract ConditionValue xgetCValueYdaytlequlykeeplocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)}
     * @param ydaytlequlyreceivelocinv The value of ydaytlequlyreceivelocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyreceivelocinv_Equal(java.math.BigDecimal ydaytlequlyreceivelocinv) {
        doSetYdaytlequlyreceivelocinv_Equal(ydaytlequlyreceivelocinv);
    }

    protected void doSetYdaytlequlyreceivelocinv_Equal(java.math.BigDecimal ydaytlequlyreceivelocinv) {
        regYdaytlequlyreceivelocinv(CK_EQ, ydaytlequlyreceivelocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)}
     * @param ydaytlequlyreceivelocinv The value of ydaytlequlyreceivelocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyreceivelocinv_NotEqual(java.math.BigDecimal ydaytlequlyreceivelocinv) {
        doSetYdaytlequlyreceivelocinv_NotEqual(ydaytlequlyreceivelocinv);
    }

    protected void doSetYdaytlequlyreceivelocinv_NotEqual(java.math.BigDecimal ydaytlequlyreceivelocinv) {
        regYdaytlequlyreceivelocinv(CK_NES, ydaytlequlyreceivelocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)}
     * @param ydaytlequlyreceivelocinv The value of ydaytlequlyreceivelocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyreceivelocinv_GreaterThan(java.math.BigDecimal ydaytlequlyreceivelocinv) {
        regYdaytlequlyreceivelocinv(CK_GT, ydaytlequlyreceivelocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)}
     * @param ydaytlequlyreceivelocinv The value of ydaytlequlyreceivelocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyreceivelocinv_LessThan(java.math.BigDecimal ydaytlequlyreceivelocinv) {
        regYdaytlequlyreceivelocinv(CK_LT, ydaytlequlyreceivelocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)}
     * @param ydaytlequlyreceivelocinv The value of ydaytlequlyreceivelocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyreceivelocinv_GreaterEqual(java.math.BigDecimal ydaytlequlyreceivelocinv) {
        regYdaytlequlyreceivelocinv(CK_GE, ydaytlequlyreceivelocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)}
     * @param ydaytlequlyreceivelocinv The value of ydaytlequlyreceivelocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyreceivelocinv_LessEqual(java.math.BigDecimal ydaytlequlyreceivelocinv) {
        regYdaytlequlyreceivelocinv(CK_LE, ydaytlequlyreceivelocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)}
     * @param minNumber The min number of ydaytlequlyreceivelocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ydaytlequlyreceivelocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setYdaytlequlyreceivelocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueYdaytlequlyreceivelocinv(), "YDAYTLEQULYRECEIVELOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)}
     * @param ydaytlequlyreceivelocinvList The collection of ydaytlequlyreceivelocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlyreceivelocinv_InScope(Collection<java.math.BigDecimal> ydaytlequlyreceivelocinvList) {
        doSetYdaytlequlyreceivelocinv_InScope(ydaytlequlyreceivelocinvList);
    }

    protected void doSetYdaytlequlyreceivelocinv_InScope(Collection<java.math.BigDecimal> ydaytlequlyreceivelocinvList) {
        regINS(CK_INS, cTL(ydaytlequlyreceivelocinvList), xgetCValueYdaytlequlyreceivelocinv(), "YDAYTLEQULYRECEIVELOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)}
     * @param ydaytlequlyreceivelocinvList The collection of ydaytlequlyreceivelocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlyreceivelocinv_NotInScope(Collection<java.math.BigDecimal> ydaytlequlyreceivelocinvList) {
        doSetYdaytlequlyreceivelocinv_NotInScope(ydaytlequlyreceivelocinvList);
    }

    protected void doSetYdaytlequlyreceivelocinv_NotInScope(Collection<java.math.BigDecimal> ydaytlequlyreceivelocinvList) {
        regINS(CK_NINS, cTL(ydaytlequlyreceivelocinvList), xgetCValueYdaytlequlyreceivelocinv(), "YDAYTLEQULYRECEIVELOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)}
     */
    public void setYdaytlequlyreceivelocinv_IsNull() { regYdaytlequlyreceivelocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)}
     */
    public void setYdaytlequlyreceivelocinv_IsNotNull() { regYdaytlequlyreceivelocinv(CK_ISNN, DOBJ); }

    protected void regYdaytlequlyreceivelocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYdaytlequlyreceivelocinv(), "YDAYTLEQULYRECEIVELOCINV"); }
    protected abstract ConditionValue xgetCValueYdaytlequlyreceivelocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)}
     * @param ydaytlequlydamageitem The value of ydaytlequlydamageitem as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlydamageitem_Equal(java.math.BigDecimal ydaytlequlydamageitem) {
        doSetYdaytlequlydamageitem_Equal(ydaytlequlydamageitem);
    }

    protected void doSetYdaytlequlydamageitem_Equal(java.math.BigDecimal ydaytlequlydamageitem) {
        regYdaytlequlydamageitem(CK_EQ, ydaytlequlydamageitem);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)}
     * @param ydaytlequlydamageitem The value of ydaytlequlydamageitem as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlydamageitem_NotEqual(java.math.BigDecimal ydaytlequlydamageitem) {
        doSetYdaytlequlydamageitem_NotEqual(ydaytlequlydamageitem);
    }

    protected void doSetYdaytlequlydamageitem_NotEqual(java.math.BigDecimal ydaytlequlydamageitem) {
        regYdaytlequlydamageitem(CK_NES, ydaytlequlydamageitem);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)}
     * @param ydaytlequlydamageitem The value of ydaytlequlydamageitem as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlydamageitem_GreaterThan(java.math.BigDecimal ydaytlequlydamageitem) {
        regYdaytlequlydamageitem(CK_GT, ydaytlequlydamageitem);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)}
     * @param ydaytlequlydamageitem The value of ydaytlequlydamageitem as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlydamageitem_LessThan(java.math.BigDecimal ydaytlequlydamageitem) {
        regYdaytlequlydamageitem(CK_LT, ydaytlequlydamageitem);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)}
     * @param ydaytlequlydamageitem The value of ydaytlequlydamageitem as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlydamageitem_GreaterEqual(java.math.BigDecimal ydaytlequlydamageitem) {
        regYdaytlequlydamageitem(CK_GE, ydaytlequlydamageitem);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)}
     * @param ydaytlequlydamageitem The value of ydaytlequlydamageitem as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlydamageitem_LessEqual(java.math.BigDecimal ydaytlequlydamageitem) {
        regYdaytlequlydamageitem(CK_LE, ydaytlequlydamageitem);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)}
     * @param minNumber The min number of ydaytlequlydamageitem. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ydaytlequlydamageitem. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setYdaytlequlydamageitem_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueYdaytlequlydamageitem(), "YDAYTLEQULYDAMAGEITEM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)}
     * @param ydaytlequlydamageitemList The collection of ydaytlequlydamageitem as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlydamageitem_InScope(Collection<java.math.BigDecimal> ydaytlequlydamageitemList) {
        doSetYdaytlequlydamageitem_InScope(ydaytlequlydamageitemList);
    }

    protected void doSetYdaytlequlydamageitem_InScope(Collection<java.math.BigDecimal> ydaytlequlydamageitemList) {
        regINS(CK_INS, cTL(ydaytlequlydamageitemList), xgetCValueYdaytlequlydamageitem(), "YDAYTLEQULYDAMAGEITEM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)}
     * @param ydaytlequlydamageitemList The collection of ydaytlequlydamageitem as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlydamageitem_NotInScope(Collection<java.math.BigDecimal> ydaytlequlydamageitemList) {
        doSetYdaytlequlydamageitem_NotInScope(ydaytlequlydamageitemList);
    }

    protected void doSetYdaytlequlydamageitem_NotInScope(Collection<java.math.BigDecimal> ydaytlequlydamageitemList) {
        regINS(CK_NINS, cTL(ydaytlequlydamageitemList), xgetCValueYdaytlequlydamageitem(), "YDAYTLEQULYDAMAGEITEM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)}
     */
    public void setYdaytlequlydamageitem_IsNull() { regYdaytlequlydamageitem(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)}
     */
    public void setYdaytlequlydamageitem_IsNotNull() { regYdaytlequlydamageitem(CK_ISNN, DOBJ); }

    protected void regYdaytlequlydamageitem(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYdaytlequlydamageitem(), "YDAYTLEQULYDAMAGEITEM"); }
    protected abstract ConditionValue xgetCValueYdaytlequlydamageitem();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param ydaytlequlyclssifylocinv The value of ydaytlequlyclssifylocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyclssifylocinv_Equal(java.math.BigDecimal ydaytlequlyclssifylocinv) {
        doSetYdaytlequlyclssifylocinv_Equal(ydaytlequlyclssifylocinv);
    }

    protected void doSetYdaytlequlyclssifylocinv_Equal(java.math.BigDecimal ydaytlequlyclssifylocinv) {
        regYdaytlequlyclssifylocinv(CK_EQ, ydaytlequlyclssifylocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param ydaytlequlyclssifylocinv The value of ydaytlequlyclssifylocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyclssifylocinv_NotEqual(java.math.BigDecimal ydaytlequlyclssifylocinv) {
        doSetYdaytlequlyclssifylocinv_NotEqual(ydaytlequlyclssifylocinv);
    }

    protected void doSetYdaytlequlyclssifylocinv_NotEqual(java.math.BigDecimal ydaytlequlyclssifylocinv) {
        regYdaytlequlyclssifylocinv(CK_NES, ydaytlequlyclssifylocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param ydaytlequlyclssifylocinv The value of ydaytlequlyclssifylocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyclssifylocinv_GreaterThan(java.math.BigDecimal ydaytlequlyclssifylocinv) {
        regYdaytlequlyclssifylocinv(CK_GT, ydaytlequlyclssifylocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param ydaytlequlyclssifylocinv The value of ydaytlequlyclssifylocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyclssifylocinv_LessThan(java.math.BigDecimal ydaytlequlyclssifylocinv) {
        regYdaytlequlyclssifylocinv(CK_LT, ydaytlequlyclssifylocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param ydaytlequlyclssifylocinv The value of ydaytlequlyclssifylocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyclssifylocinv_GreaterEqual(java.math.BigDecimal ydaytlequlyclssifylocinv) {
        regYdaytlequlyclssifylocinv(CK_GE, ydaytlequlyclssifylocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param ydaytlequlyclssifylocinv The value of ydaytlequlyclssifylocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyclssifylocinv_LessEqual(java.math.BigDecimal ydaytlequlyclssifylocinv) {
        regYdaytlequlyclssifylocinv(CK_LE, ydaytlequlyclssifylocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of ydaytlequlyclssifylocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ydaytlequlyclssifylocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setYdaytlequlyclssifylocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueYdaytlequlyclssifylocinv(), "YDAYTLEQULYCLSSIFYLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param ydaytlequlyclssifylocinvList The collection of ydaytlequlyclssifylocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlyclssifylocinv_InScope(Collection<java.math.BigDecimal> ydaytlequlyclssifylocinvList) {
        doSetYdaytlequlyclssifylocinv_InScope(ydaytlequlyclssifylocinvList);
    }

    protected void doSetYdaytlequlyclssifylocinv_InScope(Collection<java.math.BigDecimal> ydaytlequlyclssifylocinvList) {
        regINS(CK_INS, cTL(ydaytlequlyclssifylocinvList), xgetCValueYdaytlequlyclssifylocinv(), "YDAYTLEQULYCLSSIFYLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param ydaytlequlyclssifylocinvList The collection of ydaytlequlyclssifylocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlyclssifylocinv_NotInScope(Collection<java.math.BigDecimal> ydaytlequlyclssifylocinvList) {
        doSetYdaytlequlyclssifylocinv_NotInScope(ydaytlequlyclssifylocinvList);
    }

    protected void doSetYdaytlequlyclssifylocinv_NotInScope(Collection<java.math.BigDecimal> ydaytlequlyclssifylocinvList) {
        regINS(CK_NINS, cTL(ydaytlequlyclssifylocinvList), xgetCValueYdaytlequlyclssifylocinv(), "YDAYTLEQULYCLSSIFYLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)}
     */
    public void setYdaytlequlyclssifylocinv_IsNull() { regYdaytlequlyclssifylocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)}
     */
    public void setYdaytlequlyclssifylocinv_IsNotNull() { regYdaytlequlyclssifylocinv(CK_ISNN, DOBJ); }

    protected void regYdaytlequlyclssifylocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYdaytlequlyclssifylocinv(), "YDAYTLEQULYCLSSIFYLOCINV"); }
    protected abstract ConditionValue xgetCValueYdaytlequlyclssifylocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTMPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlytmplocinv The value of ydaytlequlytmplocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytmplocinv_Equal(java.math.BigDecimal ydaytlequlytmplocinv) {
        doSetYdaytlequlytmplocinv_Equal(ydaytlequlytmplocinv);
    }

    protected void doSetYdaytlequlytmplocinv_Equal(java.math.BigDecimal ydaytlequlytmplocinv) {
        regYdaytlequlytmplocinv(CK_EQ, ydaytlequlytmplocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTMPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlytmplocinv The value of ydaytlequlytmplocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytmplocinv_NotEqual(java.math.BigDecimal ydaytlequlytmplocinv) {
        doSetYdaytlequlytmplocinv_NotEqual(ydaytlequlytmplocinv);
    }

    protected void doSetYdaytlequlytmplocinv_NotEqual(java.math.BigDecimal ydaytlequlytmplocinv) {
        regYdaytlequlytmplocinv(CK_NES, ydaytlequlytmplocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTMPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlytmplocinv The value of ydaytlequlytmplocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytmplocinv_GreaterThan(java.math.BigDecimal ydaytlequlytmplocinv) {
        regYdaytlequlytmplocinv(CK_GT, ydaytlequlytmplocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTMPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlytmplocinv The value of ydaytlequlytmplocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytmplocinv_LessThan(java.math.BigDecimal ydaytlequlytmplocinv) {
        regYdaytlequlytmplocinv(CK_LT, ydaytlequlytmplocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTMPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlytmplocinv The value of ydaytlequlytmplocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytmplocinv_GreaterEqual(java.math.BigDecimal ydaytlequlytmplocinv) {
        regYdaytlequlytmplocinv(CK_GE, ydaytlequlytmplocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTMPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlytmplocinv The value of ydaytlequlytmplocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytmplocinv_LessEqual(java.math.BigDecimal ydaytlequlytmplocinv) {
        regYdaytlequlytmplocinv(CK_LE, ydaytlequlytmplocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTMPLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of ydaytlequlytmplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ydaytlequlytmplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setYdaytlequlytmplocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueYdaytlequlytmplocinv(), "YDAYTLEQULYTMPLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYTMPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlytmplocinvList The collection of ydaytlequlytmplocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlytmplocinv_InScope(Collection<java.math.BigDecimal> ydaytlequlytmplocinvList) {
        doSetYdaytlequlytmplocinv_InScope(ydaytlequlytmplocinvList);
    }

    protected void doSetYdaytlequlytmplocinv_InScope(Collection<java.math.BigDecimal> ydaytlequlytmplocinvList) {
        regINS(CK_INS, cTL(ydaytlequlytmplocinvList), xgetCValueYdaytlequlytmplocinv(), "YDAYTLEQULYTMPLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYTMPLOCINV: {decimal(16, 6)}
     * @param ydaytlequlytmplocinvList The collection of ydaytlequlytmplocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlytmplocinv_NotInScope(Collection<java.math.BigDecimal> ydaytlequlytmplocinvList) {
        doSetYdaytlequlytmplocinv_NotInScope(ydaytlequlytmplocinvList);
    }

    protected void doSetYdaytlequlytmplocinv_NotInScope(Collection<java.math.BigDecimal> ydaytlequlytmplocinvList) {
        regINS(CK_NINS, cTL(ydaytlequlytmplocinvList), xgetCValueYdaytlequlytmplocinv(), "YDAYTLEQULYTMPLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYTMPLOCINV: {decimal(16, 6)}
     */
    public void setYdaytlequlytmplocinv_IsNull() { regYdaytlequlytmplocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYTMPLOCINV: {decimal(16, 6)}
     */
    public void setYdaytlequlytmplocinv_IsNotNull() { regYdaytlequlytmplocinv(CK_ISNN, DOBJ); }

    protected void regYdaytlequlytmplocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYdaytlequlytmplocinv(), "YDAYTLEQULYTMPLOCINV"); }
    protected abstract ConditionValue xgetCValueYdaytlequlytmplocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYAUTOINV: {decimal(16, 6)}
     * @param ydaytlequlyautoinv The value of ydaytlequlyautoinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyautoinv_Equal(java.math.BigDecimal ydaytlequlyautoinv) {
        doSetYdaytlequlyautoinv_Equal(ydaytlequlyautoinv);
    }

    protected void doSetYdaytlequlyautoinv_Equal(java.math.BigDecimal ydaytlequlyautoinv) {
        regYdaytlequlyautoinv(CK_EQ, ydaytlequlyautoinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYAUTOINV: {decimal(16, 6)}
     * @param ydaytlequlyautoinv The value of ydaytlequlyautoinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyautoinv_NotEqual(java.math.BigDecimal ydaytlequlyautoinv) {
        doSetYdaytlequlyautoinv_NotEqual(ydaytlequlyautoinv);
    }

    protected void doSetYdaytlequlyautoinv_NotEqual(java.math.BigDecimal ydaytlequlyautoinv) {
        regYdaytlequlyautoinv(CK_NES, ydaytlequlyautoinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYAUTOINV: {decimal(16, 6)}
     * @param ydaytlequlyautoinv The value of ydaytlequlyautoinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyautoinv_GreaterThan(java.math.BigDecimal ydaytlequlyautoinv) {
        regYdaytlequlyautoinv(CK_GT, ydaytlequlyautoinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYAUTOINV: {decimal(16, 6)}
     * @param ydaytlequlyautoinv The value of ydaytlequlyautoinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyautoinv_LessThan(java.math.BigDecimal ydaytlequlyautoinv) {
        regYdaytlequlyautoinv(CK_LT, ydaytlequlyautoinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYAUTOINV: {decimal(16, 6)}
     * @param ydaytlequlyautoinv The value of ydaytlequlyautoinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyautoinv_GreaterEqual(java.math.BigDecimal ydaytlequlyautoinv) {
        regYdaytlequlyautoinv(CK_GE, ydaytlequlyautoinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYAUTOINV: {decimal(16, 6)}
     * @param ydaytlequlyautoinv The value of ydaytlequlyautoinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlyautoinv_LessEqual(java.math.BigDecimal ydaytlequlyautoinv) {
        regYdaytlequlyautoinv(CK_LE, ydaytlequlyautoinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYAUTOINV: {decimal(16, 6)}
     * @param minNumber The min number of ydaytlequlyautoinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ydaytlequlyautoinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setYdaytlequlyautoinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueYdaytlequlyautoinv(), "YDAYTLEQULYAUTOINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYAUTOINV: {decimal(16, 6)}
     * @param ydaytlequlyautoinvList The collection of ydaytlequlyautoinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlyautoinv_InScope(Collection<java.math.BigDecimal> ydaytlequlyautoinvList) {
        doSetYdaytlequlyautoinv_InScope(ydaytlequlyautoinvList);
    }

    protected void doSetYdaytlequlyautoinv_InScope(Collection<java.math.BigDecimal> ydaytlequlyautoinvList) {
        regINS(CK_INS, cTL(ydaytlequlyautoinvList), xgetCValueYdaytlequlyautoinv(), "YDAYTLEQULYAUTOINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYAUTOINV: {decimal(16, 6)}
     * @param ydaytlequlyautoinvList The collection of ydaytlequlyautoinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlyautoinv_NotInScope(Collection<java.math.BigDecimal> ydaytlequlyautoinvList) {
        doSetYdaytlequlyautoinv_NotInScope(ydaytlequlyautoinvList);
    }

    protected void doSetYdaytlequlyautoinv_NotInScope(Collection<java.math.BigDecimal> ydaytlequlyautoinvList) {
        regINS(CK_NINS, cTL(ydaytlequlyautoinvList), xgetCValueYdaytlequlyautoinv(), "YDAYTLEQULYAUTOINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYAUTOINV: {decimal(16, 6)}
     */
    public void setYdaytlequlyautoinv_IsNull() { regYdaytlequlyautoinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYAUTOINV: {decimal(16, 6)}
     */
    public void setYdaytlequlyautoinv_IsNotNull() { regYdaytlequlyautoinv(CK_ISNN, DOBJ); }

    protected void regYdaytlequlyautoinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYdaytlequlyautoinv(), "YDAYTLEQULYAUTOINV"); }
    protected abstract ConditionValue xgetCValueYdaytlequlyautoinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinv The value of tdayeqytotalinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_Equal(java.math.BigDecimal tdayeqytotalinv) {
        doSetTdayeqytotalinv_Equal(tdayeqytotalinv);
    }

    protected void doSetTdayeqytotalinv_Equal(java.math.BigDecimal tdayeqytotalinv) {
        regTdayeqytotalinv(CK_EQ, tdayeqytotalinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinv The value of tdayeqytotalinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_NotEqual(java.math.BigDecimal tdayeqytotalinv) {
        doSetTdayeqytotalinv_NotEqual(tdayeqytotalinv);
    }

    protected void doSetTdayeqytotalinv_NotEqual(java.math.BigDecimal tdayeqytotalinv) {
        regTdayeqytotalinv(CK_NES, tdayeqytotalinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinv The value of tdayeqytotalinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_GreaterThan(java.math.BigDecimal tdayeqytotalinv) {
        regTdayeqytotalinv(CK_GT, tdayeqytotalinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinv The value of tdayeqytotalinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_LessThan(java.math.BigDecimal tdayeqytotalinv) {
        regTdayeqytotalinv(CK_LT, tdayeqytotalinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinv The value of tdayeqytotalinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_GreaterEqual(java.math.BigDecimal tdayeqytotalinv) {
        regTdayeqytotalinv(CK_GE, tdayeqytotalinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinv The value of tdayeqytotalinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_LessEqual(java.math.BigDecimal tdayeqytotalinv) {
        regTdayeqytotalinv(CK_LE, tdayeqytotalinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param minNumber The min number of tdayeqytotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tdayeqytotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTdayeqytotalinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTdayeqytotalinv(), "TDAYEQYTOTALINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinvList The collection of tdayeqytotalinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_InScope(Collection<java.math.BigDecimal> tdayeqytotalinvList) {
        doSetTdayeqytotalinv_InScope(tdayeqytotalinvList);
    }

    protected void doSetTdayeqytotalinv_InScope(Collection<java.math.BigDecimal> tdayeqytotalinvList) {
        regINS(CK_INS, cTL(tdayeqytotalinvList), xgetCValueTdayeqytotalinv(), "TDAYEQYTOTALINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinvList The collection of tdayeqytotalinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_NotInScope(Collection<java.math.BigDecimal> tdayeqytotalinvList) {
        doSetTdayeqytotalinv_NotInScope(tdayeqytotalinvList);
    }

    protected void doSetTdayeqytotalinv_NotInScope(Collection<java.math.BigDecimal> tdayeqytotalinvList) {
        regINS(CK_NINS, cTL(tdayeqytotalinvList), xgetCValueTdayeqytotalinv(), "TDAYEQYTOTALINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     */
    public void setTdayeqytotalinv_IsNull() { regTdayeqytotalinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     */
    public void setTdayeqytotalinv_IsNotNull() { regTdayeqytotalinv(CK_ISNN, DOBJ); }

    protected void regTdayeqytotalinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTdayeqytotalinv(), "TDAYEQYTOTALINV"); }
    protected abstract ConditionValue xgetCValueTdayeqytotalinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYKEEPLOCINV: {decimal(16, 6)}
     * @param tdayeqykeeplocinv The value of tdayeqykeeplocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqykeeplocinv_Equal(java.math.BigDecimal tdayeqykeeplocinv) {
        doSetTdayeqykeeplocinv_Equal(tdayeqykeeplocinv);
    }

    protected void doSetTdayeqykeeplocinv_Equal(java.math.BigDecimal tdayeqykeeplocinv) {
        regTdayeqykeeplocinv(CK_EQ, tdayeqykeeplocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYKEEPLOCINV: {decimal(16, 6)}
     * @param tdayeqykeeplocinv The value of tdayeqykeeplocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqykeeplocinv_NotEqual(java.math.BigDecimal tdayeqykeeplocinv) {
        doSetTdayeqykeeplocinv_NotEqual(tdayeqykeeplocinv);
    }

    protected void doSetTdayeqykeeplocinv_NotEqual(java.math.BigDecimal tdayeqykeeplocinv) {
        regTdayeqykeeplocinv(CK_NES, tdayeqykeeplocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYKEEPLOCINV: {decimal(16, 6)}
     * @param tdayeqykeeplocinv The value of tdayeqykeeplocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqykeeplocinv_GreaterThan(java.math.BigDecimal tdayeqykeeplocinv) {
        regTdayeqykeeplocinv(CK_GT, tdayeqykeeplocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYKEEPLOCINV: {decimal(16, 6)}
     * @param tdayeqykeeplocinv The value of tdayeqykeeplocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqykeeplocinv_LessThan(java.math.BigDecimal tdayeqykeeplocinv) {
        regTdayeqykeeplocinv(CK_LT, tdayeqykeeplocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYKEEPLOCINV: {decimal(16, 6)}
     * @param tdayeqykeeplocinv The value of tdayeqykeeplocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqykeeplocinv_GreaterEqual(java.math.BigDecimal tdayeqykeeplocinv) {
        regTdayeqykeeplocinv(CK_GE, tdayeqykeeplocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYKEEPLOCINV: {decimal(16, 6)}
     * @param tdayeqykeeplocinv The value of tdayeqykeeplocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqykeeplocinv_LessEqual(java.math.BigDecimal tdayeqykeeplocinv) {
        regTdayeqykeeplocinv(CK_LE, tdayeqykeeplocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYKEEPLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of tdayeqykeeplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tdayeqykeeplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTdayeqykeeplocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTdayeqykeeplocinv(), "TDAYEQYKEEPLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYKEEPLOCINV: {decimal(16, 6)}
     * @param tdayeqykeeplocinvList The collection of tdayeqykeeplocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqykeeplocinv_InScope(Collection<java.math.BigDecimal> tdayeqykeeplocinvList) {
        doSetTdayeqykeeplocinv_InScope(tdayeqykeeplocinvList);
    }

    protected void doSetTdayeqykeeplocinv_InScope(Collection<java.math.BigDecimal> tdayeqykeeplocinvList) {
        regINS(CK_INS, cTL(tdayeqykeeplocinvList), xgetCValueTdayeqykeeplocinv(), "TDAYEQYKEEPLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYKEEPLOCINV: {decimal(16, 6)}
     * @param tdayeqykeeplocinvList The collection of tdayeqykeeplocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqykeeplocinv_NotInScope(Collection<java.math.BigDecimal> tdayeqykeeplocinvList) {
        doSetTdayeqykeeplocinv_NotInScope(tdayeqykeeplocinvList);
    }

    protected void doSetTdayeqykeeplocinv_NotInScope(Collection<java.math.BigDecimal> tdayeqykeeplocinvList) {
        regINS(CK_NINS, cTL(tdayeqykeeplocinvList), xgetCValueTdayeqykeeplocinv(), "TDAYEQYKEEPLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TDAYEQYKEEPLOCINV: {decimal(16, 6)}
     */
    public void setTdayeqykeeplocinv_IsNull() { regTdayeqykeeplocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TDAYEQYKEEPLOCINV: {decimal(16, 6)}
     */
    public void setTdayeqykeeplocinv_IsNotNull() { regTdayeqykeeplocinv(CK_ISNN, DOBJ); }

    protected void regTdayeqykeeplocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTdayeqykeeplocinv(), "TDAYEQYKEEPLOCINV"); }
    protected abstract ConditionValue xgetCValueTdayeqykeeplocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYRECEIVELOCINV: {decimal(16, 6)}
     * @param tdayeqyreceivelocinv The value of tdayeqyreceivelocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyreceivelocinv_Equal(java.math.BigDecimal tdayeqyreceivelocinv) {
        doSetTdayeqyreceivelocinv_Equal(tdayeqyreceivelocinv);
    }

    protected void doSetTdayeqyreceivelocinv_Equal(java.math.BigDecimal tdayeqyreceivelocinv) {
        regTdayeqyreceivelocinv(CK_EQ, tdayeqyreceivelocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYRECEIVELOCINV: {decimal(16, 6)}
     * @param tdayeqyreceivelocinv The value of tdayeqyreceivelocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyreceivelocinv_NotEqual(java.math.BigDecimal tdayeqyreceivelocinv) {
        doSetTdayeqyreceivelocinv_NotEqual(tdayeqyreceivelocinv);
    }

    protected void doSetTdayeqyreceivelocinv_NotEqual(java.math.BigDecimal tdayeqyreceivelocinv) {
        regTdayeqyreceivelocinv(CK_NES, tdayeqyreceivelocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYRECEIVELOCINV: {decimal(16, 6)}
     * @param tdayeqyreceivelocinv The value of tdayeqyreceivelocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyreceivelocinv_GreaterThan(java.math.BigDecimal tdayeqyreceivelocinv) {
        regTdayeqyreceivelocinv(CK_GT, tdayeqyreceivelocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYRECEIVELOCINV: {decimal(16, 6)}
     * @param tdayeqyreceivelocinv The value of tdayeqyreceivelocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyreceivelocinv_LessThan(java.math.BigDecimal tdayeqyreceivelocinv) {
        regTdayeqyreceivelocinv(CK_LT, tdayeqyreceivelocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYRECEIVELOCINV: {decimal(16, 6)}
     * @param tdayeqyreceivelocinv The value of tdayeqyreceivelocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyreceivelocinv_GreaterEqual(java.math.BigDecimal tdayeqyreceivelocinv) {
        regTdayeqyreceivelocinv(CK_GE, tdayeqyreceivelocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYRECEIVELOCINV: {decimal(16, 6)}
     * @param tdayeqyreceivelocinv The value of tdayeqyreceivelocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyreceivelocinv_LessEqual(java.math.BigDecimal tdayeqyreceivelocinv) {
        regTdayeqyreceivelocinv(CK_LE, tdayeqyreceivelocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYRECEIVELOCINV: {decimal(16, 6)}
     * @param minNumber The min number of tdayeqyreceivelocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tdayeqyreceivelocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTdayeqyreceivelocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTdayeqyreceivelocinv(), "TDAYEQYRECEIVELOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYRECEIVELOCINV: {decimal(16, 6)}
     * @param tdayeqyreceivelocinvList The collection of tdayeqyreceivelocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqyreceivelocinv_InScope(Collection<java.math.BigDecimal> tdayeqyreceivelocinvList) {
        doSetTdayeqyreceivelocinv_InScope(tdayeqyreceivelocinvList);
    }

    protected void doSetTdayeqyreceivelocinv_InScope(Collection<java.math.BigDecimal> tdayeqyreceivelocinvList) {
        regINS(CK_INS, cTL(tdayeqyreceivelocinvList), xgetCValueTdayeqyreceivelocinv(), "TDAYEQYRECEIVELOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYRECEIVELOCINV: {decimal(16, 6)}
     * @param tdayeqyreceivelocinvList The collection of tdayeqyreceivelocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqyreceivelocinv_NotInScope(Collection<java.math.BigDecimal> tdayeqyreceivelocinvList) {
        doSetTdayeqyreceivelocinv_NotInScope(tdayeqyreceivelocinvList);
    }

    protected void doSetTdayeqyreceivelocinv_NotInScope(Collection<java.math.BigDecimal> tdayeqyreceivelocinvList) {
        regINS(CK_NINS, cTL(tdayeqyreceivelocinvList), xgetCValueTdayeqyreceivelocinv(), "TDAYEQYRECEIVELOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TDAYEQYRECEIVELOCINV: {decimal(16, 6)}
     */
    public void setTdayeqyreceivelocinv_IsNull() { regTdayeqyreceivelocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TDAYEQYRECEIVELOCINV: {decimal(16, 6)}
     */
    public void setTdayeqyreceivelocinv_IsNotNull() { regTdayeqyreceivelocinv(CK_ISNN, DOBJ); }

    protected void regTdayeqyreceivelocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTdayeqyreceivelocinv(), "TDAYEQYRECEIVELOCINV"); }
    protected abstract ConditionValue xgetCValueTdayeqyreceivelocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYDAMAGEITEM: {decimal(16, 6)}
     * @param tdayeqydamageitem The value of tdayeqydamageitem as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqydamageitem_Equal(java.math.BigDecimal tdayeqydamageitem) {
        doSetTdayeqydamageitem_Equal(tdayeqydamageitem);
    }

    protected void doSetTdayeqydamageitem_Equal(java.math.BigDecimal tdayeqydamageitem) {
        regTdayeqydamageitem(CK_EQ, tdayeqydamageitem);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYDAMAGEITEM: {decimal(16, 6)}
     * @param tdayeqydamageitem The value of tdayeqydamageitem as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqydamageitem_NotEqual(java.math.BigDecimal tdayeqydamageitem) {
        doSetTdayeqydamageitem_NotEqual(tdayeqydamageitem);
    }

    protected void doSetTdayeqydamageitem_NotEqual(java.math.BigDecimal tdayeqydamageitem) {
        regTdayeqydamageitem(CK_NES, tdayeqydamageitem);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYDAMAGEITEM: {decimal(16, 6)}
     * @param tdayeqydamageitem The value of tdayeqydamageitem as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqydamageitem_GreaterThan(java.math.BigDecimal tdayeqydamageitem) {
        regTdayeqydamageitem(CK_GT, tdayeqydamageitem);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYDAMAGEITEM: {decimal(16, 6)}
     * @param tdayeqydamageitem The value of tdayeqydamageitem as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqydamageitem_LessThan(java.math.BigDecimal tdayeqydamageitem) {
        regTdayeqydamageitem(CK_LT, tdayeqydamageitem);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYDAMAGEITEM: {decimal(16, 6)}
     * @param tdayeqydamageitem The value of tdayeqydamageitem as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqydamageitem_GreaterEqual(java.math.BigDecimal tdayeqydamageitem) {
        regTdayeqydamageitem(CK_GE, tdayeqydamageitem);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYDAMAGEITEM: {decimal(16, 6)}
     * @param tdayeqydamageitem The value of tdayeqydamageitem as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqydamageitem_LessEqual(java.math.BigDecimal tdayeqydamageitem) {
        regTdayeqydamageitem(CK_LE, tdayeqydamageitem);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYDAMAGEITEM: {decimal(16, 6)}
     * @param minNumber The min number of tdayeqydamageitem. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tdayeqydamageitem. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTdayeqydamageitem_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTdayeqydamageitem(), "TDAYEQYDAMAGEITEM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYDAMAGEITEM: {decimal(16, 6)}
     * @param tdayeqydamageitemList The collection of tdayeqydamageitem as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqydamageitem_InScope(Collection<java.math.BigDecimal> tdayeqydamageitemList) {
        doSetTdayeqydamageitem_InScope(tdayeqydamageitemList);
    }

    protected void doSetTdayeqydamageitem_InScope(Collection<java.math.BigDecimal> tdayeqydamageitemList) {
        regINS(CK_INS, cTL(tdayeqydamageitemList), xgetCValueTdayeqydamageitem(), "TDAYEQYDAMAGEITEM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYDAMAGEITEM: {decimal(16, 6)}
     * @param tdayeqydamageitemList The collection of tdayeqydamageitem as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqydamageitem_NotInScope(Collection<java.math.BigDecimal> tdayeqydamageitemList) {
        doSetTdayeqydamageitem_NotInScope(tdayeqydamageitemList);
    }

    protected void doSetTdayeqydamageitem_NotInScope(Collection<java.math.BigDecimal> tdayeqydamageitemList) {
        regINS(CK_NINS, cTL(tdayeqydamageitemList), xgetCValueTdayeqydamageitem(), "TDAYEQYDAMAGEITEM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TDAYEQYDAMAGEITEM: {decimal(16, 6)}
     */
    public void setTdayeqydamageitem_IsNull() { regTdayeqydamageitem(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TDAYEQYDAMAGEITEM: {decimal(16, 6)}
     */
    public void setTdayeqydamageitem_IsNotNull() { regTdayeqydamageitem(CK_ISNN, DOBJ); }

    protected void regTdayeqydamageitem(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTdayeqydamageitem(), "TDAYEQYDAMAGEITEM"); }
    protected abstract ConditionValue xgetCValueTdayeqydamageitem();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param tdayeqyclssifylocinv The value of tdayeqyclssifylocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyclssifylocinv_Equal(java.math.BigDecimal tdayeqyclssifylocinv) {
        doSetTdayeqyclssifylocinv_Equal(tdayeqyclssifylocinv);
    }

    protected void doSetTdayeqyclssifylocinv_Equal(java.math.BigDecimal tdayeqyclssifylocinv) {
        regTdayeqyclssifylocinv(CK_EQ, tdayeqyclssifylocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param tdayeqyclssifylocinv The value of tdayeqyclssifylocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyclssifylocinv_NotEqual(java.math.BigDecimal tdayeqyclssifylocinv) {
        doSetTdayeqyclssifylocinv_NotEqual(tdayeqyclssifylocinv);
    }

    protected void doSetTdayeqyclssifylocinv_NotEqual(java.math.BigDecimal tdayeqyclssifylocinv) {
        regTdayeqyclssifylocinv(CK_NES, tdayeqyclssifylocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param tdayeqyclssifylocinv The value of tdayeqyclssifylocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyclssifylocinv_GreaterThan(java.math.BigDecimal tdayeqyclssifylocinv) {
        regTdayeqyclssifylocinv(CK_GT, tdayeqyclssifylocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param tdayeqyclssifylocinv The value of tdayeqyclssifylocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyclssifylocinv_LessThan(java.math.BigDecimal tdayeqyclssifylocinv) {
        regTdayeqyclssifylocinv(CK_LT, tdayeqyclssifylocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param tdayeqyclssifylocinv The value of tdayeqyclssifylocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyclssifylocinv_GreaterEqual(java.math.BigDecimal tdayeqyclssifylocinv) {
        regTdayeqyclssifylocinv(CK_GE, tdayeqyclssifylocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param tdayeqyclssifylocinv The value of tdayeqyclssifylocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyclssifylocinv_LessEqual(java.math.BigDecimal tdayeqyclssifylocinv) {
        regTdayeqyclssifylocinv(CK_LE, tdayeqyclssifylocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of tdayeqyclssifylocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tdayeqyclssifylocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTdayeqyclssifylocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTdayeqyclssifylocinv(), "TDAYEQYCLSSIFYLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param tdayeqyclssifylocinvList The collection of tdayeqyclssifylocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqyclssifylocinv_InScope(Collection<java.math.BigDecimal> tdayeqyclssifylocinvList) {
        doSetTdayeqyclssifylocinv_InScope(tdayeqyclssifylocinvList);
    }

    protected void doSetTdayeqyclssifylocinv_InScope(Collection<java.math.BigDecimal> tdayeqyclssifylocinvList) {
        regINS(CK_INS, cTL(tdayeqyclssifylocinvList), xgetCValueTdayeqyclssifylocinv(), "TDAYEQYCLSSIFYLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)}
     * @param tdayeqyclssifylocinvList The collection of tdayeqyclssifylocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqyclssifylocinv_NotInScope(Collection<java.math.BigDecimal> tdayeqyclssifylocinvList) {
        doSetTdayeqyclssifylocinv_NotInScope(tdayeqyclssifylocinvList);
    }

    protected void doSetTdayeqyclssifylocinv_NotInScope(Collection<java.math.BigDecimal> tdayeqyclssifylocinvList) {
        regINS(CK_NINS, cTL(tdayeqyclssifylocinvList), xgetCValueTdayeqyclssifylocinv(), "TDAYEQYCLSSIFYLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)}
     */
    public void setTdayeqyclssifylocinv_IsNull() { regTdayeqyclssifylocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)}
     */
    public void setTdayeqyclssifylocinv_IsNotNull() { regTdayeqyclssifylocinv(CK_ISNN, DOBJ); }

    protected void regTdayeqyclssifylocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTdayeqyclssifylocinv(), "TDAYEQYCLSSIFYLOCINV"); }
    protected abstract ConditionValue xgetCValueTdayeqyclssifylocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTMPLOCINV: {decimal(16, 6)}
     * @param tdayeqytmplocinv The value of tdayeqytmplocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytmplocinv_Equal(java.math.BigDecimal tdayeqytmplocinv) {
        doSetTdayeqytmplocinv_Equal(tdayeqytmplocinv);
    }

    protected void doSetTdayeqytmplocinv_Equal(java.math.BigDecimal tdayeqytmplocinv) {
        regTdayeqytmplocinv(CK_EQ, tdayeqytmplocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTMPLOCINV: {decimal(16, 6)}
     * @param tdayeqytmplocinv The value of tdayeqytmplocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytmplocinv_NotEqual(java.math.BigDecimal tdayeqytmplocinv) {
        doSetTdayeqytmplocinv_NotEqual(tdayeqytmplocinv);
    }

    protected void doSetTdayeqytmplocinv_NotEqual(java.math.BigDecimal tdayeqytmplocinv) {
        regTdayeqytmplocinv(CK_NES, tdayeqytmplocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTMPLOCINV: {decimal(16, 6)}
     * @param tdayeqytmplocinv The value of tdayeqytmplocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytmplocinv_GreaterThan(java.math.BigDecimal tdayeqytmplocinv) {
        regTdayeqytmplocinv(CK_GT, tdayeqytmplocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTMPLOCINV: {decimal(16, 6)}
     * @param tdayeqytmplocinv The value of tdayeqytmplocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytmplocinv_LessThan(java.math.BigDecimal tdayeqytmplocinv) {
        regTdayeqytmplocinv(CK_LT, tdayeqytmplocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTMPLOCINV: {decimal(16, 6)}
     * @param tdayeqytmplocinv The value of tdayeqytmplocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytmplocinv_GreaterEqual(java.math.BigDecimal tdayeqytmplocinv) {
        regTdayeqytmplocinv(CK_GE, tdayeqytmplocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTMPLOCINV: {decimal(16, 6)}
     * @param tdayeqytmplocinv The value of tdayeqytmplocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytmplocinv_LessEqual(java.math.BigDecimal tdayeqytmplocinv) {
        regTdayeqytmplocinv(CK_LE, tdayeqytmplocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTMPLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of tdayeqytmplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tdayeqytmplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTdayeqytmplocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTdayeqytmplocinv(), "TDAYEQYTMPLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYTMPLOCINV: {decimal(16, 6)}
     * @param tdayeqytmplocinvList The collection of tdayeqytmplocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqytmplocinv_InScope(Collection<java.math.BigDecimal> tdayeqytmplocinvList) {
        doSetTdayeqytmplocinv_InScope(tdayeqytmplocinvList);
    }

    protected void doSetTdayeqytmplocinv_InScope(Collection<java.math.BigDecimal> tdayeqytmplocinvList) {
        regINS(CK_INS, cTL(tdayeqytmplocinvList), xgetCValueTdayeqytmplocinv(), "TDAYEQYTMPLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYTMPLOCINV: {decimal(16, 6)}
     * @param tdayeqytmplocinvList The collection of tdayeqytmplocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqytmplocinv_NotInScope(Collection<java.math.BigDecimal> tdayeqytmplocinvList) {
        doSetTdayeqytmplocinv_NotInScope(tdayeqytmplocinvList);
    }

    protected void doSetTdayeqytmplocinv_NotInScope(Collection<java.math.BigDecimal> tdayeqytmplocinvList) {
        regINS(CK_NINS, cTL(tdayeqytmplocinvList), xgetCValueTdayeqytmplocinv(), "TDAYEQYTMPLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TDAYEQYTMPLOCINV: {decimal(16, 6)}
     */
    public void setTdayeqytmplocinv_IsNull() { regTdayeqytmplocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TDAYEQYTMPLOCINV: {decimal(16, 6)}
     */
    public void setTdayeqytmplocinv_IsNotNull() { regTdayeqytmplocinv(CK_ISNN, DOBJ); }

    protected void regTdayeqytmplocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTdayeqytmplocinv(), "TDAYEQYTMPLOCINV"); }
    protected abstract ConditionValue xgetCValueTdayeqytmplocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYAUTOINV: {decimal(16, 6)}
     * @param tdayeqyautoinv The value of tdayeqyautoinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyautoinv_Equal(java.math.BigDecimal tdayeqyautoinv) {
        doSetTdayeqyautoinv_Equal(tdayeqyautoinv);
    }

    protected void doSetTdayeqyautoinv_Equal(java.math.BigDecimal tdayeqyautoinv) {
        regTdayeqyautoinv(CK_EQ, tdayeqyautoinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYAUTOINV: {decimal(16, 6)}
     * @param tdayeqyautoinv The value of tdayeqyautoinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyautoinv_NotEqual(java.math.BigDecimal tdayeqyautoinv) {
        doSetTdayeqyautoinv_NotEqual(tdayeqyautoinv);
    }

    protected void doSetTdayeqyautoinv_NotEqual(java.math.BigDecimal tdayeqyautoinv) {
        regTdayeqyautoinv(CK_NES, tdayeqyautoinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYAUTOINV: {decimal(16, 6)}
     * @param tdayeqyautoinv The value of tdayeqyautoinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyautoinv_GreaterThan(java.math.BigDecimal tdayeqyautoinv) {
        regTdayeqyautoinv(CK_GT, tdayeqyautoinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYAUTOINV: {decimal(16, 6)}
     * @param tdayeqyautoinv The value of tdayeqyautoinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyautoinv_LessThan(java.math.BigDecimal tdayeqyautoinv) {
        regTdayeqyautoinv(CK_LT, tdayeqyautoinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYAUTOINV: {decimal(16, 6)}
     * @param tdayeqyautoinv The value of tdayeqyautoinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyautoinv_GreaterEqual(java.math.BigDecimal tdayeqyautoinv) {
        regTdayeqyautoinv(CK_GE, tdayeqyautoinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYAUTOINV: {decimal(16, 6)}
     * @param tdayeqyautoinv The value of tdayeqyautoinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqyautoinv_LessEqual(java.math.BigDecimal tdayeqyautoinv) {
        regTdayeqyautoinv(CK_LE, tdayeqyautoinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYAUTOINV: {decimal(16, 6)}
     * @param minNumber The min number of tdayeqyautoinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tdayeqyautoinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTdayeqyautoinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTdayeqyautoinv(), "TDAYEQYAUTOINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYAUTOINV: {decimal(16, 6)}
     * @param tdayeqyautoinvList The collection of tdayeqyautoinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqyautoinv_InScope(Collection<java.math.BigDecimal> tdayeqyautoinvList) {
        doSetTdayeqyautoinv_InScope(tdayeqyautoinvList);
    }

    protected void doSetTdayeqyautoinv_InScope(Collection<java.math.BigDecimal> tdayeqyautoinvList) {
        regINS(CK_INS, cTL(tdayeqyautoinvList), xgetCValueTdayeqyautoinv(), "TDAYEQYAUTOINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYAUTOINV: {decimal(16, 6)}
     * @param tdayeqyautoinvList The collection of tdayeqyautoinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqyautoinv_NotInScope(Collection<java.math.BigDecimal> tdayeqyautoinvList) {
        doSetTdayeqyautoinv_NotInScope(tdayeqyautoinvList);
    }

    protected void doSetTdayeqyautoinv_NotInScope(Collection<java.math.BigDecimal> tdayeqyautoinvList) {
        regINS(CK_NINS, cTL(tdayeqyautoinvList), xgetCValueTdayeqyautoinv(), "TDAYEQYAUTOINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TDAYEQYAUTOINV: {decimal(16, 6)}
     */
    public void setTdayeqyautoinv_IsNull() { regTdayeqyautoinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TDAYEQYAUTOINV: {decimal(16, 6)}
     */
    public void setTdayeqyautoinv_IsNotNull() { regTdayeqyautoinv(CK_ISNN, DOBJ); }

    protected void regTdayeqyautoinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTdayeqyautoinv(), "TDAYEQYAUTOINV"); }
    protected abstract ConditionValue xgetCValueTdayeqyautoinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CAPITEMFLG: {bigint(19)}
     * @param capitemflg The value of capitemflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCapitemflg_Equal(Long capitemflg) {
        doSetCapitemflg_Equal(capitemflg);
    }

    protected void doSetCapitemflg_Equal(Long capitemflg) {
        regCapitemflg(CK_EQ, capitemflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CAPITEMFLG: {bigint(19)}
     * @param capitemflg The value of capitemflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCapitemflg_NotEqual(Long capitemflg) {
        doSetCapitemflg_NotEqual(capitemflg);
    }

    protected void doSetCapitemflg_NotEqual(Long capitemflg) {
        regCapitemflg(CK_NES, capitemflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CAPITEMFLG: {bigint(19)}
     * @param capitemflg The value of capitemflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCapitemflg_GreaterThan(Long capitemflg) {
        regCapitemflg(CK_GT, capitemflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CAPITEMFLG: {bigint(19)}
     * @param capitemflg The value of capitemflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCapitemflg_LessThan(Long capitemflg) {
        regCapitemflg(CK_LT, capitemflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CAPITEMFLG: {bigint(19)}
     * @param capitemflg The value of capitemflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCapitemflg_GreaterEqual(Long capitemflg) {
        regCapitemflg(CK_GE, capitemflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CAPITEMFLG: {bigint(19)}
     * @param capitemflg The value of capitemflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCapitemflg_LessEqual(Long capitemflg) {
        regCapitemflg(CK_LE, capitemflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CAPITEMFLG: {bigint(19)}
     * @param minNumber The min number of capitemflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of capitemflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCapitemflg_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCapitemflg(), "CAPITEMFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CAPITEMFLG: {bigint(19)}
     * @param capitemflgList The collection of capitemflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapitemflg_InScope(Collection<Long> capitemflgList) {
        doSetCapitemflg_InScope(capitemflgList);
    }

    protected void doSetCapitemflg_InScope(Collection<Long> capitemflgList) {
        regINS(CK_INS, cTL(capitemflgList), xgetCValueCapitemflg(), "CAPITEMFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CAPITEMFLG: {bigint(19)}
     * @param capitemflgList The collection of capitemflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapitemflg_NotInScope(Collection<Long> capitemflgList) {
        doSetCapitemflg_NotInScope(capitemflgList);
    }

    protected void doSetCapitemflg_NotInScope(Collection<Long> capitemflgList) {
        regINS(CK_NINS, cTL(capitemflgList), xgetCValueCapitemflg(), "CAPITEMFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CAPITEMFLG: {bigint(19)}
     */
    public void setCapitemflg_IsNull() { regCapitemflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CAPITEMFLG: {bigint(19)}
     */
    public void setCapitemflg_IsNotNull() { regCapitemflg(CK_ISNN, DOBJ); }

    protected void regCapitemflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCapitemflg(), "CAPITEMFLG"); }
    protected abstract ConditionValue xgetCValueCapitemflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CENTER_ID from M_CENTER where ...)} <br />
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'in-scope'. (NotNull)
     */
    public void inScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_InScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", false);
    }
    public abstract String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CENTER_ID from M_CENTER where ...)} <br />
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_NotInScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", true);
    }
    public abstract String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq);

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLIENT_ID from M_CLIENT where ...)} <br />
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'in-scope'. (NotNull)
     */
    public void inScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_InScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", false);
    }
    public abstract String keepClientId_InScopeRelation_MClient(MClientCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLIENT_ID from M_CLIENT where ...)} <br />
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'not in-scope'. (NotNull)
     */
    public void notInScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_NotInScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", true);
    }
    public abstract String keepClientId_NotInScopeRelation_MClient(MClientCQ sq);

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

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
    public HpSLCFunction<TTrallinvhistoryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrallinvhistoryCB.class);
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
    public HpSLCFunction<TTrallinvhistoryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrallinvhistoryCB.class);
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
    public HpSLCFunction<TTrallinvhistoryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrallinvhistoryCB.class);
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
    public HpSLCFunction<TTrallinvhistoryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrallinvhistoryCB.class);
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
    public HpSLCFunction<TTrallinvhistoryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrallinvhistoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrallinvhistoryCB&gt;() {
     *     public void query(TTrallinvhistoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrallinvhistoryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrallinvhistoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrallinvhistoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrallinvhistoryCQ sq);

    protected TTrallinvhistoryCB xcreateScalarConditionCB() {
        TTrallinvhistoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrallinvhistoryCB xcreateScalarConditionPartitionByCB() {
        TTrallinvhistoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrallinvhistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrallinvhistoryCB cb = new TTrallinvhistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRALLINVHISTORY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrallinvhistoryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrallinvhistoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrallinvhistoryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrallinvhistoryCB cb = new TTrallinvhistoryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRALLINVHISTORY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrallinvhistoryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrallinvhistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrallinvhistoryCB cb = new TTrallinvhistoryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrallinvhistoryCQ sq);

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
    protected TTrallinvhistoryCB newMyCB() {
        return new TTrallinvhistoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrallinvhistoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

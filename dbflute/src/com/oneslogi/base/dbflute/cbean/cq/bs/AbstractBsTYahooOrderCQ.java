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
 * The abstract condition-query of T_YAHOO_ORDER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTYahooOrderCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTYahooOrderCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_YAHOO_ORDER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param yahooOrderId The value of yahooOrderId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setYahooOrderId_Equal(Long yahooOrderId) {
        doSetYahooOrderId_Equal(yahooOrderId);
    }

    protected void doSetYahooOrderId_Equal(Long yahooOrderId) {
        regYahooOrderId(CK_EQ, yahooOrderId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param yahooOrderId The value of yahooOrderId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYahooOrderId_NotEqual(Long yahooOrderId) {
        doSetYahooOrderId_NotEqual(yahooOrderId);
    }

    protected void doSetYahooOrderId_NotEqual(Long yahooOrderId) {
        regYahooOrderId(CK_NES, yahooOrderId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param yahooOrderId The value of yahooOrderId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYahooOrderId_GreaterThan(Long yahooOrderId) {
        regYahooOrderId(CK_GT, yahooOrderId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param yahooOrderId The value of yahooOrderId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYahooOrderId_LessThan(Long yahooOrderId) {
        regYahooOrderId(CK_LT, yahooOrderId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param yahooOrderId The value of yahooOrderId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYahooOrderId_GreaterEqual(Long yahooOrderId) {
        regYahooOrderId(CK_GE, yahooOrderId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param yahooOrderId The value of yahooOrderId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYahooOrderId_LessEqual(Long yahooOrderId) {
        regYahooOrderId(CK_LE, yahooOrderId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of yahooOrderId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of yahooOrderId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setYahooOrderId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueYahooOrderId(), "YAHOO_ORDER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param yahooOrderIdList The collection of yahooOrderId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYahooOrderId_InScope(Collection<Long> yahooOrderIdList) {
        doSetYahooOrderId_InScope(yahooOrderIdList);
    }

    protected void doSetYahooOrderId_InScope(Collection<Long> yahooOrderIdList) {
        regINS(CK_INS, cTL(yahooOrderIdList), xgetCValueYahooOrderId(), "YAHOO_ORDER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param yahooOrderIdList The collection of yahooOrderId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYahooOrderId_NotInScope(Collection<Long> yahooOrderIdList) {
        doSetYahooOrderId_NotInScope(yahooOrderIdList);
    }

    protected void doSetYahooOrderId_NotInScope(Collection<Long> yahooOrderIdList) {
        regINS(CK_NINS, cTL(yahooOrderIdList), xgetCValueYahooOrderId(), "YAHOO_ORDER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setYahooOrderId_IsNull() { regYahooOrderId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setYahooOrderId_IsNotNull() { regYahooOrderId(CK_ISNN, DOBJ); }

    protected void regYahooOrderId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYahooOrderId(), "YAHOO_ORDER_ID"); }
    protected abstract ConditionValue xgetCValueYahooOrderId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ID: {varchar(30)}
     * @param orderId The value of orderId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderId_Equal(String orderId) {
        doSetOrderId_Equal(fRES(orderId));
    }

    protected void doSetOrderId_Equal(String orderId) {
        regOrderId(CK_EQ, orderId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ID: {varchar(30)}
     * @param orderId The value of orderId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderId_NotEqual(String orderId) {
        doSetOrderId_NotEqual(fRES(orderId));
    }

    protected void doSetOrderId_NotEqual(String orderId) {
        regOrderId(CK_NES, orderId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ID: {varchar(30)}
     * @param orderId The value of orderId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderId_GreaterThan(String orderId) {
        regOrderId(CK_GT, fRES(orderId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ID: {varchar(30)}
     * @param orderId The value of orderId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderId_LessThan(String orderId) {
        regOrderId(CK_LT, fRES(orderId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ID: {varchar(30)}
     * @param orderId The value of orderId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderId_GreaterEqual(String orderId) {
        regOrderId(CK_GE, fRES(orderId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ID: {varchar(30)}
     * @param orderId The value of orderId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderId_LessEqual(String orderId) {
        regOrderId(CK_LE, fRES(orderId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ID: {varchar(30)}
     * @param orderIdList The collection of orderId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderId_InScope(Collection<String> orderIdList) {
        doSetOrderId_InScope(orderIdList);
    }

    protected void doSetOrderId_InScope(Collection<String> orderIdList) {
        regINS(CK_INS, cTL(orderIdList), xgetCValueOrderId(), "ORDER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ID: {varchar(30)}
     * @param orderIdList The collection of orderId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderId_NotInScope(Collection<String> orderIdList) {
        doSetOrderId_NotInScope(orderIdList);
    }

    protected void doSetOrderId_NotInScope(Collection<String> orderIdList) {
        regINS(CK_NINS, cTL(orderIdList), xgetCValueOrderId(), "ORDER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ID: {varchar(30)} <br>
     * <pre>e.g. setOrderId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderId The value of orderId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderId_LikeSearch(String orderId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderId), xgetCValueOrderId(), "ORDER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ID: {varchar(30)}
     * @param orderId The value of orderId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderId_NotLikeSearch(String orderId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderId), xgetCValueOrderId(), "ORDER_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ID: {varchar(30)}
     * @param orderId The value of orderId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderId_PrefixSearch(String orderId) {
        setOrderId_LikeSearch(orderId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_ID: {varchar(30)}
     */
    public void setOrderId_IsNull() { regOrderId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_ID: {varchar(30)}
     */
    public void setOrderId_IsNullOrEmpty() { regOrderId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_ID: {varchar(30)}
     */
    public void setOrderId_IsNotNull() { regOrderId(CK_ISNN, DOBJ); }

    protected void regOrderId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderId(), "ORDER_ID"); }
    protected abstract ConditionValue xgetCValueOrderId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     * @param parentOrderId The value of parentOrderId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentOrderId_Equal(String parentOrderId) {
        doSetParentOrderId_Equal(fRES(parentOrderId));
    }

    protected void doSetParentOrderId_Equal(String parentOrderId) {
        regParentOrderId(CK_EQ, parentOrderId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     * @param parentOrderId The value of parentOrderId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentOrderId_NotEqual(String parentOrderId) {
        doSetParentOrderId_NotEqual(fRES(parentOrderId));
    }

    protected void doSetParentOrderId_NotEqual(String parentOrderId) {
        regParentOrderId(CK_NES, parentOrderId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     * @param parentOrderId The value of parentOrderId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentOrderId_GreaterThan(String parentOrderId) {
        regParentOrderId(CK_GT, fRES(parentOrderId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     * @param parentOrderId The value of parentOrderId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentOrderId_LessThan(String parentOrderId) {
        regParentOrderId(CK_LT, fRES(parentOrderId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     * @param parentOrderId The value of parentOrderId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentOrderId_GreaterEqual(String parentOrderId) {
        regParentOrderId(CK_GE, fRES(parentOrderId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     * @param parentOrderId The value of parentOrderId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentOrderId_LessEqual(String parentOrderId) {
        regParentOrderId(CK_LE, fRES(parentOrderId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     * @param parentOrderIdList The collection of parentOrderId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentOrderId_InScope(Collection<String> parentOrderIdList) {
        doSetParentOrderId_InScope(parentOrderIdList);
    }

    protected void doSetParentOrderId_InScope(Collection<String> parentOrderIdList) {
        regINS(CK_INS, cTL(parentOrderIdList), xgetCValueParentOrderId(), "PARENT_ORDER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     * @param parentOrderIdList The collection of parentOrderId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentOrderId_NotInScope(Collection<String> parentOrderIdList) {
        doSetParentOrderId_NotInScope(parentOrderIdList);
    }

    protected void doSetParentOrderId_NotInScope(Collection<String> parentOrderIdList) {
        regINS(CK_NINS, cTL(parentOrderIdList), xgetCValueParentOrderId(), "PARENT_ORDER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PARENT_ORDER_ID: {varchar(30)} <br>
     * <pre>e.g. setParentOrderId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param parentOrderId The value of parentOrderId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setParentOrderId_LikeSearch(String parentOrderId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(parentOrderId), xgetCValueParentOrderId(), "PARENT_ORDER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     * @param parentOrderId The value of parentOrderId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setParentOrderId_NotLikeSearch(String parentOrderId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(parentOrderId), xgetCValueParentOrderId(), "PARENT_ORDER_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     * @param parentOrderId The value of parentOrderId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentOrderId_PrefixSearch(String parentOrderId) {
        setParentOrderId_LikeSearch(parentOrderId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     */
    public void setParentOrderId_IsNull() { regParentOrderId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     */
    public void setParentOrderId_IsNullOrEmpty() { regParentOrderId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     */
    public void setParentOrderId_IsNotNull() { regParentOrderId(CK_ISNN, DOBJ); }

    protected void regParentOrderId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParentOrderId(), "PARENT_ORDER_ID"); }
    protected abstract ConditionValue xgetCValueParentOrderId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEVICE_TYPE: {varchar(60)}
     * @param deviceType The value of deviceType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeviceType_Equal(String deviceType) {
        doSetDeviceType_Equal(fRES(deviceType));
    }

    protected void doSetDeviceType_Equal(String deviceType) {
        regDeviceType(CK_EQ, deviceType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEVICE_TYPE: {varchar(60)}
     * @param deviceType The value of deviceType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeviceType_NotEqual(String deviceType) {
        doSetDeviceType_NotEqual(fRES(deviceType));
    }

    protected void doSetDeviceType_NotEqual(String deviceType) {
        regDeviceType(CK_NES, deviceType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEVICE_TYPE: {varchar(60)}
     * @param deviceType The value of deviceType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeviceType_GreaterThan(String deviceType) {
        regDeviceType(CK_GT, fRES(deviceType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEVICE_TYPE: {varchar(60)}
     * @param deviceType The value of deviceType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeviceType_LessThan(String deviceType) {
        regDeviceType(CK_LT, fRES(deviceType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEVICE_TYPE: {varchar(60)}
     * @param deviceType The value of deviceType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeviceType_GreaterEqual(String deviceType) {
        regDeviceType(CK_GE, fRES(deviceType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEVICE_TYPE: {varchar(60)}
     * @param deviceType The value of deviceType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeviceType_LessEqual(String deviceType) {
        regDeviceType(CK_LE, fRES(deviceType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEVICE_TYPE: {varchar(60)}
     * @param deviceTypeList The collection of deviceType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeviceType_InScope(Collection<String> deviceTypeList) {
        doSetDeviceType_InScope(deviceTypeList);
    }

    protected void doSetDeviceType_InScope(Collection<String> deviceTypeList) {
        regINS(CK_INS, cTL(deviceTypeList), xgetCValueDeviceType(), "DEVICE_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEVICE_TYPE: {varchar(60)}
     * @param deviceTypeList The collection of deviceType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeviceType_NotInScope(Collection<String> deviceTypeList) {
        doSetDeviceType_NotInScope(deviceTypeList);
    }

    protected void doSetDeviceType_NotInScope(Collection<String> deviceTypeList) {
        regINS(CK_NINS, cTL(deviceTypeList), xgetCValueDeviceType(), "DEVICE_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEVICE_TYPE: {varchar(60)} <br>
     * <pre>e.g. setDeviceType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deviceType The value of deviceType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeviceType_LikeSearch(String deviceType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deviceType), xgetCValueDeviceType(), "DEVICE_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEVICE_TYPE: {varchar(60)}
     * @param deviceType The value of deviceType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeviceType_NotLikeSearch(String deviceType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deviceType), xgetCValueDeviceType(), "DEVICE_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEVICE_TYPE: {varchar(60)}
     * @param deviceType The value of deviceType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeviceType_PrefixSearch(String deviceType) {
        setDeviceType_LikeSearch(deviceType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEVICE_TYPE: {varchar(60)}
     */
    public void setDeviceType_IsNull() { regDeviceType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DEVICE_TYPE: {varchar(60)}
     */
    public void setDeviceType_IsNullOrEmpty() { regDeviceType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEVICE_TYPE: {varchar(60)}
     */
    public void setDeviceType_IsNotNull() { regDeviceType(CK_ISNN, DOBJ); }

    protected void regDeviceType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeviceType(), "DEVICE_TYPE"); }
    protected abstract ConditionValue xgetCValueDeviceType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_AFFILIATE: {varchar(60)}
     * @param isAffiliate The value of isAffiliate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsAffiliate_Equal(String isAffiliate) {
        doSetIsAffiliate_Equal(fRES(isAffiliate));
    }

    protected void doSetIsAffiliate_Equal(String isAffiliate) {
        regIsAffiliate(CK_EQ, isAffiliate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_AFFILIATE: {varchar(60)}
     * @param isAffiliate The value of isAffiliate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsAffiliate_NotEqual(String isAffiliate) {
        doSetIsAffiliate_NotEqual(fRES(isAffiliate));
    }

    protected void doSetIsAffiliate_NotEqual(String isAffiliate) {
        regIsAffiliate(CK_NES, isAffiliate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_AFFILIATE: {varchar(60)}
     * @param isAffiliate The value of isAffiliate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsAffiliate_GreaterThan(String isAffiliate) {
        regIsAffiliate(CK_GT, fRES(isAffiliate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_AFFILIATE: {varchar(60)}
     * @param isAffiliate The value of isAffiliate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsAffiliate_LessThan(String isAffiliate) {
        regIsAffiliate(CK_LT, fRES(isAffiliate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_AFFILIATE: {varchar(60)}
     * @param isAffiliate The value of isAffiliate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsAffiliate_GreaterEqual(String isAffiliate) {
        regIsAffiliate(CK_GE, fRES(isAffiliate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_AFFILIATE: {varchar(60)}
     * @param isAffiliate The value of isAffiliate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsAffiliate_LessEqual(String isAffiliate) {
        regIsAffiliate(CK_LE, fRES(isAffiliate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IS_AFFILIATE: {varchar(60)}
     * @param isAffiliateList The collection of isAffiliate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsAffiliate_InScope(Collection<String> isAffiliateList) {
        doSetIsAffiliate_InScope(isAffiliateList);
    }

    protected void doSetIsAffiliate_InScope(Collection<String> isAffiliateList) {
        regINS(CK_INS, cTL(isAffiliateList), xgetCValueIsAffiliate(), "IS_AFFILIATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IS_AFFILIATE: {varchar(60)}
     * @param isAffiliateList The collection of isAffiliate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsAffiliate_NotInScope(Collection<String> isAffiliateList) {
        doSetIsAffiliate_NotInScope(isAffiliateList);
    }

    protected void doSetIsAffiliate_NotInScope(Collection<String> isAffiliateList) {
        regINS(CK_NINS, cTL(isAffiliateList), xgetCValueIsAffiliate(), "IS_AFFILIATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IS_AFFILIATE: {varchar(60)} <br>
     * <pre>e.g. setIsAffiliate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param isAffiliate The value of isAffiliate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIsAffiliate_LikeSearch(String isAffiliate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(isAffiliate), xgetCValueIsAffiliate(), "IS_AFFILIATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IS_AFFILIATE: {varchar(60)}
     * @param isAffiliate The value of isAffiliate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIsAffiliate_NotLikeSearch(String isAffiliate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(isAffiliate), xgetCValueIsAffiliate(), "IS_AFFILIATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IS_AFFILIATE: {varchar(60)}
     * @param isAffiliate The value of isAffiliate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsAffiliate_PrefixSearch(String isAffiliate) {
        setIsAffiliate_LikeSearch(isAffiliate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IS_AFFILIATE: {varchar(60)}
     */
    public void setIsAffiliate_IsNull() { regIsAffiliate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IS_AFFILIATE: {varchar(60)}
     */
    public void setIsAffiliate_IsNullOrEmpty() { regIsAffiliate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IS_AFFILIATE: {varchar(60)}
     */
    public void setIsAffiliate_IsNotNull() { regIsAffiliate(CK_ISNN, DOBJ); }

    protected void regIsAffiliate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIsAffiliate(), "IS_AFFILIATE"); }
    protected abstract ConditionValue xgetCValueIsAffiliate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     * @param fspLicenseCode The value of fspLicenseCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseCode_Equal(String fspLicenseCode) {
        doSetFspLicenseCode_Equal(fRES(fspLicenseCode));
    }

    protected void doSetFspLicenseCode_Equal(String fspLicenseCode) {
        regFspLicenseCode(CK_EQ, fspLicenseCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     * @param fspLicenseCode The value of fspLicenseCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseCode_NotEqual(String fspLicenseCode) {
        doSetFspLicenseCode_NotEqual(fRES(fspLicenseCode));
    }

    protected void doSetFspLicenseCode_NotEqual(String fspLicenseCode) {
        regFspLicenseCode(CK_NES, fspLicenseCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     * @param fspLicenseCode The value of fspLicenseCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseCode_GreaterThan(String fspLicenseCode) {
        regFspLicenseCode(CK_GT, fRES(fspLicenseCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     * @param fspLicenseCode The value of fspLicenseCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseCode_LessThan(String fspLicenseCode) {
        regFspLicenseCode(CK_LT, fRES(fspLicenseCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     * @param fspLicenseCode The value of fspLicenseCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseCode_GreaterEqual(String fspLicenseCode) {
        regFspLicenseCode(CK_GE, fRES(fspLicenseCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     * @param fspLicenseCode The value of fspLicenseCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseCode_LessEqual(String fspLicenseCode) {
        regFspLicenseCode(CK_LE, fRES(fspLicenseCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     * @param fspLicenseCodeList The collection of fspLicenseCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseCode_InScope(Collection<String> fspLicenseCodeList) {
        doSetFspLicenseCode_InScope(fspLicenseCodeList);
    }

    protected void doSetFspLicenseCode_InScope(Collection<String> fspLicenseCodeList) {
        regINS(CK_INS, cTL(fspLicenseCodeList), xgetCValueFspLicenseCode(), "FSP_LICENSE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     * @param fspLicenseCodeList The collection of fspLicenseCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseCode_NotInScope(Collection<String> fspLicenseCodeList) {
        doSetFspLicenseCode_NotInScope(fspLicenseCodeList);
    }

    protected void doSetFspLicenseCode_NotInScope(Collection<String> fspLicenseCodeList) {
        regINS(CK_NINS, cTL(fspLicenseCodeList), xgetCValueFspLicenseCode(), "FSP_LICENSE_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FSP_LICENSE_CODE: {varchar(30)} <br>
     * <pre>e.g. setFspLicenseCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fspLicenseCode The value of fspLicenseCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFspLicenseCode_LikeSearch(String fspLicenseCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fspLicenseCode), xgetCValueFspLicenseCode(), "FSP_LICENSE_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     * @param fspLicenseCode The value of fspLicenseCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFspLicenseCode_NotLikeSearch(String fspLicenseCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fspLicenseCode), xgetCValueFspLicenseCode(), "FSP_LICENSE_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     * @param fspLicenseCode The value of fspLicenseCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseCode_PrefixSearch(String fspLicenseCode) {
        setFspLicenseCode_LikeSearch(fspLicenseCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     */
    public void setFspLicenseCode_IsNull() { regFspLicenseCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     */
    public void setFspLicenseCode_IsNullOrEmpty() { regFspLicenseCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     */
    public void setFspLicenseCode_IsNotNull() { regFspLicenseCode(CK_ISNN, DOBJ); }

    protected void regFspLicenseCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFspLicenseCode(), "FSP_LICENSE_CODE"); }
    protected abstract ConditionValue xgetCValueFspLicenseCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     * @param fspLicenseName The value of fspLicenseName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseName_Equal(String fspLicenseName) {
        doSetFspLicenseName_Equal(fRES(fspLicenseName));
    }

    protected void doSetFspLicenseName_Equal(String fspLicenseName) {
        regFspLicenseName(CK_EQ, fspLicenseName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     * @param fspLicenseName The value of fspLicenseName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseName_NotEqual(String fspLicenseName) {
        doSetFspLicenseName_NotEqual(fRES(fspLicenseName));
    }

    protected void doSetFspLicenseName_NotEqual(String fspLicenseName) {
        regFspLicenseName(CK_NES, fspLicenseName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     * @param fspLicenseName The value of fspLicenseName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseName_GreaterThan(String fspLicenseName) {
        regFspLicenseName(CK_GT, fRES(fspLicenseName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     * @param fspLicenseName The value of fspLicenseName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseName_LessThan(String fspLicenseName) {
        regFspLicenseName(CK_LT, fRES(fspLicenseName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     * @param fspLicenseName The value of fspLicenseName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseName_GreaterEqual(String fspLicenseName) {
        regFspLicenseName(CK_GE, fRES(fspLicenseName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     * @param fspLicenseName The value of fspLicenseName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseName_LessEqual(String fspLicenseName) {
        regFspLicenseName(CK_LE, fRES(fspLicenseName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     * @param fspLicenseNameList The collection of fspLicenseName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseName_InScope(Collection<String> fspLicenseNameList) {
        doSetFspLicenseName_InScope(fspLicenseNameList);
    }

    protected void doSetFspLicenseName_InScope(Collection<String> fspLicenseNameList) {
        regINS(CK_INS, cTL(fspLicenseNameList), xgetCValueFspLicenseName(), "FSP_LICENSE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     * @param fspLicenseNameList The collection of fspLicenseName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseName_NotInScope(Collection<String> fspLicenseNameList) {
        doSetFspLicenseName_NotInScope(fspLicenseNameList);
    }

    protected void doSetFspLicenseName_NotInScope(Collection<String> fspLicenseNameList) {
        regINS(CK_NINS, cTL(fspLicenseNameList), xgetCValueFspLicenseName(), "FSP_LICENSE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FSP_LICENSE_NAME: {varchar(60)} <br>
     * <pre>e.g. setFspLicenseName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fspLicenseName The value of fspLicenseName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFspLicenseName_LikeSearch(String fspLicenseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fspLicenseName), xgetCValueFspLicenseName(), "FSP_LICENSE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     * @param fspLicenseName The value of fspLicenseName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFspLicenseName_NotLikeSearch(String fspLicenseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fspLicenseName), xgetCValueFspLicenseName(), "FSP_LICENSE_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     * @param fspLicenseName The value of fspLicenseName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFspLicenseName_PrefixSearch(String fspLicenseName) {
        setFspLicenseName_LikeSearch(fspLicenseName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     */
    public void setFspLicenseName_IsNull() { regFspLicenseName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     */
    public void setFspLicenseName_IsNullOrEmpty() { regFspLicenseName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     */
    public void setFspLicenseName_IsNotNull() { regFspLicenseName(CK_ISNN, DOBJ); }

    protected void regFspLicenseName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFspLicenseName(), "FSP_LICENSE_NAME"); }
    protected abstract ConditionValue xgetCValueFspLicenseName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_Equal(String orderTime) {
        doSetOrderTime_Equal(fRES(orderTime));
    }

    protected void doSetOrderTime_Equal(String orderTime) {
        regOrderTime(CK_EQ, orderTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_NotEqual(String orderTime) {
        doSetOrderTime_NotEqual(fRES(orderTime));
    }

    protected void doSetOrderTime_NotEqual(String orderTime) {
        regOrderTime(CK_NES, orderTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_GreaterThan(String orderTime) {
        regOrderTime(CK_GT, fRES(orderTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_LessThan(String orderTime) {
        regOrderTime(CK_LT, fRES(orderTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_GreaterEqual(String orderTime) {
        regOrderTime(CK_GE, fRES(orderTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_LessEqual(String orderTime) {
        regOrderTime(CK_LE, fRES(orderTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTimeList The collection of orderTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_InScope(Collection<String> orderTimeList) {
        doSetOrderTime_InScope(orderTimeList);
    }

    protected void doSetOrderTime_InScope(Collection<String> orderTimeList) {
        regINS(CK_INS, cTL(orderTimeList), xgetCValueOrderTime(), "ORDER_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTimeList The collection of orderTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_NotInScope(Collection<String> orderTimeList) {
        doSetOrderTime_NotInScope(orderTimeList);
    }

    protected void doSetOrderTime_NotInScope(Collection<String> orderTimeList) {
        regINS(CK_NINS, cTL(orderTimeList), xgetCValueOrderTime(), "ORDER_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {varchar(30)} <br>
     * <pre>e.g. setOrderTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderTime The value of orderTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderTime_LikeSearch(String orderTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderTime), xgetCValueOrderTime(), "ORDER_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderTime_NotLikeSearch(String orderTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderTime), xgetCValueOrderTime(), "ORDER_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     * @param orderTime The value of orderTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_PrefixSearch(String orderTime) {
        setOrderTime_LikeSearch(orderTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     */
    public void setOrderTime_IsNull() { regOrderTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     */
    public void setOrderTime_IsNullOrEmpty() { regOrderTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_TIME: {varchar(30)}
     */
    public void setOrderTime_IsNotNull() { regOrderTime(CK_ISNN, DOBJ); }

    protected void regOrderTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderTime(), "ORDER_TIME"); }
    protected abstract ConditionValue xgetCValueOrderTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     * @param orderTimeUnixEpoch The value of orderTimeUnixEpoch as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTimeUnixEpoch_Equal(String orderTimeUnixEpoch) {
        doSetOrderTimeUnixEpoch_Equal(fRES(orderTimeUnixEpoch));
    }

    protected void doSetOrderTimeUnixEpoch_Equal(String orderTimeUnixEpoch) {
        regOrderTimeUnixEpoch(CK_EQ, orderTimeUnixEpoch);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     * @param orderTimeUnixEpoch The value of orderTimeUnixEpoch as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTimeUnixEpoch_NotEqual(String orderTimeUnixEpoch) {
        doSetOrderTimeUnixEpoch_NotEqual(fRES(orderTimeUnixEpoch));
    }

    protected void doSetOrderTimeUnixEpoch_NotEqual(String orderTimeUnixEpoch) {
        regOrderTimeUnixEpoch(CK_NES, orderTimeUnixEpoch);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     * @param orderTimeUnixEpoch The value of orderTimeUnixEpoch as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTimeUnixEpoch_GreaterThan(String orderTimeUnixEpoch) {
        regOrderTimeUnixEpoch(CK_GT, fRES(orderTimeUnixEpoch));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     * @param orderTimeUnixEpoch The value of orderTimeUnixEpoch as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTimeUnixEpoch_LessThan(String orderTimeUnixEpoch) {
        regOrderTimeUnixEpoch(CK_LT, fRES(orderTimeUnixEpoch));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     * @param orderTimeUnixEpoch The value of orderTimeUnixEpoch as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTimeUnixEpoch_GreaterEqual(String orderTimeUnixEpoch) {
        regOrderTimeUnixEpoch(CK_GE, fRES(orderTimeUnixEpoch));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     * @param orderTimeUnixEpoch The value of orderTimeUnixEpoch as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTimeUnixEpoch_LessEqual(String orderTimeUnixEpoch) {
        regOrderTimeUnixEpoch(CK_LE, fRES(orderTimeUnixEpoch));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     * @param orderTimeUnixEpochList The collection of orderTimeUnixEpoch as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTimeUnixEpoch_InScope(Collection<String> orderTimeUnixEpochList) {
        doSetOrderTimeUnixEpoch_InScope(orderTimeUnixEpochList);
    }

    protected void doSetOrderTimeUnixEpoch_InScope(Collection<String> orderTimeUnixEpochList) {
        regINS(CK_INS, cTL(orderTimeUnixEpochList), xgetCValueOrderTimeUnixEpoch(), "ORDER_TIME_UNIX_EPOCH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     * @param orderTimeUnixEpochList The collection of orderTimeUnixEpoch as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTimeUnixEpoch_NotInScope(Collection<String> orderTimeUnixEpochList) {
        doSetOrderTimeUnixEpoch_NotInScope(orderTimeUnixEpochList);
    }

    protected void doSetOrderTimeUnixEpoch_NotInScope(Collection<String> orderTimeUnixEpochList) {
        regINS(CK_NINS, cTL(orderTimeUnixEpochList), xgetCValueOrderTimeUnixEpoch(), "ORDER_TIME_UNIX_EPOCH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)} <br>
     * <pre>e.g. setOrderTimeUnixEpoch_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderTimeUnixEpoch The value of orderTimeUnixEpoch as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderTimeUnixEpoch_LikeSearch(String orderTimeUnixEpoch, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderTimeUnixEpoch), xgetCValueOrderTimeUnixEpoch(), "ORDER_TIME_UNIX_EPOCH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     * @param orderTimeUnixEpoch The value of orderTimeUnixEpoch as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderTimeUnixEpoch_NotLikeSearch(String orderTimeUnixEpoch, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderTimeUnixEpoch), xgetCValueOrderTimeUnixEpoch(), "ORDER_TIME_UNIX_EPOCH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     * @param orderTimeUnixEpoch The value of orderTimeUnixEpoch as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTimeUnixEpoch_PrefixSearch(String orderTimeUnixEpoch) {
        setOrderTimeUnixEpoch_LikeSearch(orderTimeUnixEpoch, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     */
    public void setOrderTimeUnixEpoch_IsNull() { regOrderTimeUnixEpoch(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     */
    public void setOrderTimeUnixEpoch_IsNullOrEmpty() { regOrderTimeUnixEpoch(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     */
    public void setOrderTimeUnixEpoch_IsNotNull() { regOrderTimeUnixEpoch(CK_ISNN, DOBJ); }

    protected void regOrderTimeUnixEpoch(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderTimeUnixEpoch(), "ORDER_TIME_UNIX_EPOCH"); }
    protected abstract ConditionValue xgetCValueOrderTimeUnixEpoch();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USE_POINT_TYPE: {varchar(60)}
     * @param usePointType The value of usePointType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsePointType_Equal(String usePointType) {
        doSetUsePointType_Equal(fRES(usePointType));
    }

    protected void doSetUsePointType_Equal(String usePointType) {
        regUsePointType(CK_EQ, usePointType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USE_POINT_TYPE: {varchar(60)}
     * @param usePointType The value of usePointType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsePointType_NotEqual(String usePointType) {
        doSetUsePointType_NotEqual(fRES(usePointType));
    }

    protected void doSetUsePointType_NotEqual(String usePointType) {
        regUsePointType(CK_NES, usePointType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USE_POINT_TYPE: {varchar(60)}
     * @param usePointType The value of usePointType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsePointType_GreaterThan(String usePointType) {
        regUsePointType(CK_GT, fRES(usePointType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USE_POINT_TYPE: {varchar(60)}
     * @param usePointType The value of usePointType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsePointType_LessThan(String usePointType) {
        regUsePointType(CK_LT, fRES(usePointType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USE_POINT_TYPE: {varchar(60)}
     * @param usePointType The value of usePointType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsePointType_GreaterEqual(String usePointType) {
        regUsePointType(CK_GE, fRES(usePointType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USE_POINT_TYPE: {varchar(60)}
     * @param usePointType The value of usePointType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsePointType_LessEqual(String usePointType) {
        regUsePointType(CK_LE, fRES(usePointType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USE_POINT_TYPE: {varchar(60)}
     * @param usePointTypeList The collection of usePointType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsePointType_InScope(Collection<String> usePointTypeList) {
        doSetUsePointType_InScope(usePointTypeList);
    }

    protected void doSetUsePointType_InScope(Collection<String> usePointTypeList) {
        regINS(CK_INS, cTL(usePointTypeList), xgetCValueUsePointType(), "USE_POINT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USE_POINT_TYPE: {varchar(60)}
     * @param usePointTypeList The collection of usePointType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsePointType_NotInScope(Collection<String> usePointTypeList) {
        doSetUsePointType_NotInScope(usePointTypeList);
    }

    protected void doSetUsePointType_NotInScope(Collection<String> usePointTypeList) {
        regINS(CK_NINS, cTL(usePointTypeList), xgetCValueUsePointType(), "USE_POINT_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USE_POINT_TYPE: {varchar(60)} <br>
     * <pre>e.g. setUsePointType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param usePointType The value of usePointType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUsePointType_LikeSearch(String usePointType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(usePointType), xgetCValueUsePointType(), "USE_POINT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USE_POINT_TYPE: {varchar(60)}
     * @param usePointType The value of usePointType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUsePointType_NotLikeSearch(String usePointType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(usePointType), xgetCValueUsePointType(), "USE_POINT_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USE_POINT_TYPE: {varchar(60)}
     * @param usePointType The value of usePointType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsePointType_PrefixSearch(String usePointType) {
        setUsePointType_LikeSearch(usePointType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USE_POINT_TYPE: {varchar(60)}
     */
    public void setUsePointType_IsNull() { regUsePointType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USE_POINT_TYPE: {varchar(60)}
     */
    public void setUsePointType_IsNullOrEmpty() { regUsePointType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USE_POINT_TYPE: {varchar(60)}
     */
    public void setUsePointType_IsNotNull() { regUsePointType(CK_ISNN, DOBJ); }

    protected void regUsePointType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsePointType(), "USE_POINT_TYPE"); }
    protected abstract ConditionValue xgetCValueUsePointType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(60)}
     * @param orderStatus The value of orderStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderStatus_Equal(String orderStatus) {
        doSetOrderStatus_Equal(fRES(orderStatus));
    }

    protected void doSetOrderStatus_Equal(String orderStatus) {
        regOrderStatus(CK_EQ, orderStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(60)}
     * @param orderStatus The value of orderStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderStatus_NotEqual(String orderStatus) {
        doSetOrderStatus_NotEqual(fRES(orderStatus));
    }

    protected void doSetOrderStatus_NotEqual(String orderStatus) {
        regOrderStatus(CK_NES, orderStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(60)}
     * @param orderStatus The value of orderStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderStatus_GreaterThan(String orderStatus) {
        regOrderStatus(CK_GT, fRES(orderStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(60)}
     * @param orderStatus The value of orderStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderStatus_LessThan(String orderStatus) {
        regOrderStatus(CK_LT, fRES(orderStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(60)}
     * @param orderStatus The value of orderStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderStatus_GreaterEqual(String orderStatus) {
        regOrderStatus(CK_GE, fRES(orderStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(60)}
     * @param orderStatus The value of orderStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderStatus_LessEqual(String orderStatus) {
        regOrderStatus(CK_LE, fRES(orderStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_STATUS: {varchar(60)}
     * @param orderStatusList The collection of orderStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderStatus_InScope(Collection<String> orderStatusList) {
        doSetOrderStatus_InScope(orderStatusList);
    }

    protected void doSetOrderStatus_InScope(Collection<String> orderStatusList) {
        regINS(CK_INS, cTL(orderStatusList), xgetCValueOrderStatus(), "ORDER_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_STATUS: {varchar(60)}
     * @param orderStatusList The collection of orderStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderStatus_NotInScope(Collection<String> orderStatusList) {
        doSetOrderStatus_NotInScope(orderStatusList);
    }

    protected void doSetOrderStatus_NotInScope(Collection<String> orderStatusList) {
        regINS(CK_NINS, cTL(orderStatusList), xgetCValueOrderStatus(), "ORDER_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_STATUS: {varchar(60)} <br>
     * <pre>e.g. setOrderStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderStatus The value of orderStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderStatus_LikeSearch(String orderStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderStatus), xgetCValueOrderStatus(), "ORDER_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_STATUS: {varchar(60)}
     * @param orderStatus The value of orderStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderStatus_NotLikeSearch(String orderStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderStatus), xgetCValueOrderStatus(), "ORDER_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_STATUS: {varchar(60)}
     * @param orderStatus The value of orderStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderStatus_PrefixSearch(String orderStatus) {
        setOrderStatus_LikeSearch(orderStatus, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(60)}
     */
    public void setOrderStatus_IsNull() { regOrderStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(60)}
     */
    public void setOrderStatus_IsNullOrEmpty() { regOrderStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(60)}
     */
    public void setOrderStatus_IsNotNull() { regOrderStatus(CK_ISNN, DOBJ); }

    protected void regOrderStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderStatus(), "ORDER_STATUS"); }
    protected abstract ConditionValue xgetCValueOrderStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STATUS: {varchar(60)}
     * @param storeStatus The value of storeStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStatus_Equal(String storeStatus) {
        doSetStoreStatus_Equal(fRES(storeStatus));
    }

    protected void doSetStoreStatus_Equal(String storeStatus) {
        regStoreStatus(CK_EQ, storeStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STATUS: {varchar(60)}
     * @param storeStatus The value of storeStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStatus_NotEqual(String storeStatus) {
        doSetStoreStatus_NotEqual(fRES(storeStatus));
    }

    protected void doSetStoreStatus_NotEqual(String storeStatus) {
        regStoreStatus(CK_NES, storeStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STATUS: {varchar(60)}
     * @param storeStatus The value of storeStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStatus_GreaterThan(String storeStatus) {
        regStoreStatus(CK_GT, fRES(storeStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STATUS: {varchar(60)}
     * @param storeStatus The value of storeStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStatus_LessThan(String storeStatus) {
        regStoreStatus(CK_LT, fRES(storeStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STATUS: {varchar(60)}
     * @param storeStatus The value of storeStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStatus_GreaterEqual(String storeStatus) {
        regStoreStatus(CK_GE, fRES(storeStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STATUS: {varchar(60)}
     * @param storeStatus The value of storeStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStatus_LessEqual(String storeStatus) {
        regStoreStatus(CK_LE, fRES(storeStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_STATUS: {varchar(60)}
     * @param storeStatusList The collection of storeStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStatus_InScope(Collection<String> storeStatusList) {
        doSetStoreStatus_InScope(storeStatusList);
    }

    protected void doSetStoreStatus_InScope(Collection<String> storeStatusList) {
        regINS(CK_INS, cTL(storeStatusList), xgetCValueStoreStatus(), "STORE_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_STATUS: {varchar(60)}
     * @param storeStatusList The collection of storeStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStatus_NotInScope(Collection<String> storeStatusList) {
        doSetStoreStatus_NotInScope(storeStatusList);
    }

    protected void doSetStoreStatus_NotInScope(Collection<String> storeStatusList) {
        regINS(CK_NINS, cTL(storeStatusList), xgetCValueStoreStatus(), "STORE_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_STATUS: {varchar(60)} <br>
     * <pre>e.g. setStoreStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeStatus The value of storeStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreStatus_LikeSearch(String storeStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeStatus), xgetCValueStoreStatus(), "STORE_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_STATUS: {varchar(60)}
     * @param storeStatus The value of storeStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreStatus_NotLikeSearch(String storeStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeStatus), xgetCValueStoreStatus(), "STORE_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_STATUS: {varchar(60)}
     * @param storeStatus The value of storeStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStatus_PrefixSearch(String storeStatus) {
        setStoreStatus_LikeSearch(storeStatus, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_STATUS: {varchar(60)}
     */
    public void setStoreStatus_IsNull() { regStoreStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_STATUS: {varchar(60)}
     */
    public void setStoreStatus_IsNullOrEmpty() { regStoreStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_STATUS: {varchar(60)}
     */
    public void setStoreStatus_IsNotNull() { regStoreStatus(CK_ISNN, DOBJ); }

    protected void regStoreStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreStatus(), "STORE_STATUS"); }
    protected abstract ConditionValue xgetCValueStoreStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERER: {varchar(60)}
     * @param referer The value of referer as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferer_Equal(String referer) {
        doSetReferer_Equal(fRES(referer));
    }

    protected void doSetReferer_Equal(String referer) {
        regReferer(CK_EQ, referer);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERER: {varchar(60)}
     * @param referer The value of referer as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferer_NotEqual(String referer) {
        doSetReferer_NotEqual(fRES(referer));
    }

    protected void doSetReferer_NotEqual(String referer) {
        regReferer(CK_NES, referer);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERER: {varchar(60)}
     * @param referer The value of referer as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferer_GreaterThan(String referer) {
        regReferer(CK_GT, fRES(referer));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERER: {varchar(60)}
     * @param referer The value of referer as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferer_LessThan(String referer) {
        regReferer(CK_LT, fRES(referer));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERER: {varchar(60)}
     * @param referer The value of referer as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferer_GreaterEqual(String referer) {
        regReferer(CK_GE, fRES(referer));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFERER: {varchar(60)}
     * @param referer The value of referer as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferer_LessEqual(String referer) {
        regReferer(CK_LE, fRES(referer));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFERER: {varchar(60)}
     * @param refererList The collection of referer as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferer_InScope(Collection<String> refererList) {
        doSetReferer_InScope(refererList);
    }

    protected void doSetReferer_InScope(Collection<String> refererList) {
        regINS(CK_INS, cTL(refererList), xgetCValueReferer(), "REFERER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFERER: {varchar(60)}
     * @param refererList The collection of referer as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferer_NotInScope(Collection<String> refererList) {
        doSetReferer_NotInScope(refererList);
    }

    protected void doSetReferer_NotInScope(Collection<String> refererList) {
        regINS(CK_NINS, cTL(refererList), xgetCValueReferer(), "REFERER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFERER: {varchar(60)} <br>
     * <pre>e.g. setReferer_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param referer The value of referer as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReferer_LikeSearch(String referer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(referer), xgetCValueReferer(), "REFERER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFERER: {varchar(60)}
     * @param referer The value of referer as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReferer_NotLikeSearch(String referer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(referer), xgetCValueReferer(), "REFERER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFERER: {varchar(60)}
     * @param referer The value of referer as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferer_PrefixSearch(String referer) {
        setReferer_LikeSearch(referer, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REFERER: {varchar(60)}
     */
    public void setReferer_IsNull() { regReferer(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REFERER: {varchar(60)}
     */
    public void setReferer_IsNullOrEmpty() { regReferer(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REFERER: {varchar(60)}
     */
    public void setReferer_IsNotNull() { regReferer(CK_ISNN, DOBJ); }

    protected void regReferer(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReferer(), "REFERER"); }
    protected abstract ConditionValue xgetCValueReferer();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_POINT: {varchar(60)}
     * @param entryPoint The value of entryPoint as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryPoint_Equal(String entryPoint) {
        doSetEntryPoint_Equal(fRES(entryPoint));
    }

    protected void doSetEntryPoint_Equal(String entryPoint) {
        regEntryPoint(CK_EQ, entryPoint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_POINT: {varchar(60)}
     * @param entryPoint The value of entryPoint as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryPoint_NotEqual(String entryPoint) {
        doSetEntryPoint_NotEqual(fRES(entryPoint));
    }

    protected void doSetEntryPoint_NotEqual(String entryPoint) {
        regEntryPoint(CK_NES, entryPoint);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_POINT: {varchar(60)}
     * @param entryPoint The value of entryPoint as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryPoint_GreaterThan(String entryPoint) {
        regEntryPoint(CK_GT, fRES(entryPoint));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_POINT: {varchar(60)}
     * @param entryPoint The value of entryPoint as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryPoint_LessThan(String entryPoint) {
        regEntryPoint(CK_LT, fRES(entryPoint));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_POINT: {varchar(60)}
     * @param entryPoint The value of entryPoint as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryPoint_GreaterEqual(String entryPoint) {
        regEntryPoint(CK_GE, fRES(entryPoint));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ENTRY_POINT: {varchar(60)}
     * @param entryPoint The value of entryPoint as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryPoint_LessEqual(String entryPoint) {
        regEntryPoint(CK_LE, fRES(entryPoint));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ENTRY_POINT: {varchar(60)}
     * @param entryPointList The collection of entryPoint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryPoint_InScope(Collection<String> entryPointList) {
        doSetEntryPoint_InScope(entryPointList);
    }

    protected void doSetEntryPoint_InScope(Collection<String> entryPointList) {
        regINS(CK_INS, cTL(entryPointList), xgetCValueEntryPoint(), "ENTRY_POINT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ENTRY_POINT: {varchar(60)}
     * @param entryPointList The collection of entryPoint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryPoint_NotInScope(Collection<String> entryPointList) {
        doSetEntryPoint_NotInScope(entryPointList);
    }

    protected void doSetEntryPoint_NotInScope(Collection<String> entryPointList) {
        regINS(CK_NINS, cTL(entryPointList), xgetCValueEntryPoint(), "ENTRY_POINT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_POINT: {varchar(60)} <br>
     * <pre>e.g. setEntryPoint_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param entryPoint The value of entryPoint as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEntryPoint_LikeSearch(String entryPoint, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(entryPoint), xgetCValueEntryPoint(), "ENTRY_POINT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_POINT: {varchar(60)}
     * @param entryPoint The value of entryPoint as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEntryPoint_NotLikeSearch(String entryPoint, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(entryPoint), xgetCValueEntryPoint(), "ENTRY_POINT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ENTRY_POINT: {varchar(60)}
     * @param entryPoint The value of entryPoint as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEntryPoint_PrefixSearch(String entryPoint) {
        setEntryPoint_LikeSearch(entryPoint, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ENTRY_POINT: {varchar(60)}
     */
    public void setEntryPoint_IsNull() { regEntryPoint(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ENTRY_POINT: {varchar(60)}
     */
    public void setEntryPoint_IsNullOrEmpty() { regEntryPoint(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ENTRY_POINT: {varchar(60)}
     */
    public void setEntryPoint_IsNotNull() { regEntryPoint(CK_ISNN, DOBJ); }

    protected void regEntryPoint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEntryPoint(), "ENTRY_POINT"); }
    protected abstract ConditionValue xgetCValueEntryPoint();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLINK: {varchar(60)}
     * @param clink The value of clink as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClink_Equal(String clink) {
        doSetClink_Equal(fRES(clink));
    }

    protected void doSetClink_Equal(String clink) {
        regClink(CK_EQ, clink);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLINK: {varchar(60)}
     * @param clink The value of clink as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClink_NotEqual(String clink) {
        doSetClink_NotEqual(fRES(clink));
    }

    protected void doSetClink_NotEqual(String clink) {
        regClink(CK_NES, clink);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLINK: {varchar(60)}
     * @param clink The value of clink as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClink_GreaterThan(String clink) {
        regClink(CK_GT, fRES(clink));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLINK: {varchar(60)}
     * @param clink The value of clink as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClink_LessThan(String clink) {
        regClink(CK_LT, fRES(clink));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLINK: {varchar(60)}
     * @param clink The value of clink as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClink_GreaterEqual(String clink) {
        regClink(CK_GE, fRES(clink));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLINK: {varchar(60)}
     * @param clink The value of clink as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClink_LessEqual(String clink) {
        regClink(CK_LE, fRES(clink));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLINK: {varchar(60)}
     * @param clinkList The collection of clink as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClink_InScope(Collection<String> clinkList) {
        doSetClink_InScope(clinkList);
    }

    protected void doSetClink_InScope(Collection<String> clinkList) {
        regINS(CK_INS, cTL(clinkList), xgetCValueClink(), "CLINK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLINK: {varchar(60)}
     * @param clinkList The collection of clink as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClink_NotInScope(Collection<String> clinkList) {
        doSetClink_NotInScope(clinkList);
    }

    protected void doSetClink_NotInScope(Collection<String> clinkList) {
        regINS(CK_NINS, cTL(clinkList), xgetCValueClink(), "CLINK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLINK: {varchar(60)} <br>
     * <pre>e.g. setClink_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clink The value of clink as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClink_LikeSearch(String clink, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clink), xgetCValueClink(), "CLINK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLINK: {varchar(60)}
     * @param clink The value of clink as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClink_NotLikeSearch(String clink, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clink), xgetCValueClink(), "CLINK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLINK: {varchar(60)}
     * @param clink The value of clink as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClink_PrefixSearch(String clink) {
        setClink_LikeSearch(clink, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLINK: {varchar(60)}
     */
    public void setClink_IsNull() { regClink(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLINK: {varchar(60)}
     */
    public void setClink_IsNullOrEmpty() { regClink(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLINK: {varchar(60)}
     */
    public void setClink_IsNotNull() { regClink(CK_ISNN, DOBJ); }

    protected void regClink(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClink(), "CLINK"); }
    protected abstract ConditionValue xgetCValueClink();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     * @param suspectMessage The value of suspectMessage as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuspectMessage_Equal(String suspectMessage) {
        doSetSuspectMessage_Equal(fRES(suspectMessage));
    }

    protected void doSetSuspectMessage_Equal(String suspectMessage) {
        regSuspectMessage(CK_EQ, suspectMessage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     * @param suspectMessage The value of suspectMessage as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuspectMessage_NotEqual(String suspectMessage) {
        doSetSuspectMessage_NotEqual(fRES(suspectMessage));
    }

    protected void doSetSuspectMessage_NotEqual(String suspectMessage) {
        regSuspectMessage(CK_NES, suspectMessage);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     * @param suspectMessage The value of suspectMessage as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuspectMessage_GreaterThan(String suspectMessage) {
        regSuspectMessage(CK_GT, fRES(suspectMessage));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     * @param suspectMessage The value of suspectMessage as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuspectMessage_LessThan(String suspectMessage) {
        regSuspectMessage(CK_LT, fRES(suspectMessage));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     * @param suspectMessage The value of suspectMessage as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuspectMessage_GreaterEqual(String suspectMessage) {
        regSuspectMessage(CK_GE, fRES(suspectMessage));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     * @param suspectMessage The value of suspectMessage as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuspectMessage_LessEqual(String suspectMessage) {
        regSuspectMessage(CK_LE, fRES(suspectMessage));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     * @param suspectMessageList The collection of suspectMessage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuspectMessage_InScope(Collection<String> suspectMessageList) {
        doSetSuspectMessage_InScope(suspectMessageList);
    }

    protected void doSetSuspectMessage_InScope(Collection<String> suspectMessageList) {
        regINS(CK_INS, cTL(suspectMessageList), xgetCValueSuspectMessage(), "SUSPECT_MESSAGE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     * @param suspectMessageList The collection of suspectMessage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuspectMessage_NotInScope(Collection<String> suspectMessageList) {
        doSetSuspectMessage_NotInScope(suspectMessageList);
    }

    protected void doSetSuspectMessage_NotInScope(Collection<String> suspectMessageList) {
        regINS(CK_NINS, cTL(suspectMessageList), xgetCValueSuspectMessage(), "SUSPECT_MESSAGE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUSPECT_MESSAGE: {varchar(60)} <br>
     * <pre>e.g. setSuspectMessage_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param suspectMessage The value of suspectMessage as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSuspectMessage_LikeSearch(String suspectMessage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(suspectMessage), xgetCValueSuspectMessage(), "SUSPECT_MESSAGE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     * @param suspectMessage The value of suspectMessage as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSuspectMessage_NotLikeSearch(String suspectMessage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(suspectMessage), xgetCValueSuspectMessage(), "SUSPECT_MESSAGE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     * @param suspectMessage The value of suspectMessage as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuspectMessage_PrefixSearch(String suspectMessage) {
        setSuspectMessage_LikeSearch(suspectMessage, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     */
    public void setSuspectMessage_IsNull() { regSuspectMessage(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     */
    public void setSuspectMessage_IsNullOrEmpty() { regSuspectMessage(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     */
    public void setSuspectMessage_IsNotNull() { regSuspectMessage(CK_ISNN, DOBJ); }

    protected void regSuspectMessage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuspectMessage(), "SUSPECT_MESSAGE"); }
    protected abstract ConditionValue xgetCValueSuspectMessage();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     * @param isItemCoupon The value of isItemCoupon as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsItemCoupon_Equal(String isItemCoupon) {
        doSetIsItemCoupon_Equal(fRES(isItemCoupon));
    }

    protected void doSetIsItemCoupon_Equal(String isItemCoupon) {
        regIsItemCoupon(CK_EQ, isItemCoupon);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     * @param isItemCoupon The value of isItemCoupon as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsItemCoupon_NotEqual(String isItemCoupon) {
        doSetIsItemCoupon_NotEqual(fRES(isItemCoupon));
    }

    protected void doSetIsItemCoupon_NotEqual(String isItemCoupon) {
        regIsItemCoupon(CK_NES, isItemCoupon);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     * @param isItemCoupon The value of isItemCoupon as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsItemCoupon_GreaterThan(String isItemCoupon) {
        regIsItemCoupon(CK_GT, fRES(isItemCoupon));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     * @param isItemCoupon The value of isItemCoupon as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsItemCoupon_LessThan(String isItemCoupon) {
        regIsItemCoupon(CK_LT, fRES(isItemCoupon));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     * @param isItemCoupon The value of isItemCoupon as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsItemCoupon_GreaterEqual(String isItemCoupon) {
        regIsItemCoupon(CK_GE, fRES(isItemCoupon));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     * @param isItemCoupon The value of isItemCoupon as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsItemCoupon_LessEqual(String isItemCoupon) {
        regIsItemCoupon(CK_LE, fRES(isItemCoupon));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     * @param isItemCouponList The collection of isItemCoupon as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsItemCoupon_InScope(Collection<String> isItemCouponList) {
        doSetIsItemCoupon_InScope(isItemCouponList);
    }

    protected void doSetIsItemCoupon_InScope(Collection<String> isItemCouponList) {
        regINS(CK_INS, cTL(isItemCouponList), xgetCValueIsItemCoupon(), "IS_ITEM_COUPON");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     * @param isItemCouponList The collection of isItemCoupon as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsItemCoupon_NotInScope(Collection<String> isItemCouponList) {
        doSetIsItemCoupon_NotInScope(isItemCouponList);
    }

    protected void doSetIsItemCoupon_NotInScope(Collection<String> isItemCouponList) {
        regINS(CK_NINS, cTL(isItemCouponList), xgetCValueIsItemCoupon(), "IS_ITEM_COUPON");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IS_ITEM_COUPON: {varchar(30)} <br>
     * <pre>e.g. setIsItemCoupon_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param isItemCoupon The value of isItemCoupon as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIsItemCoupon_LikeSearch(String isItemCoupon, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(isItemCoupon), xgetCValueIsItemCoupon(), "IS_ITEM_COUPON", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     * @param isItemCoupon The value of isItemCoupon as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIsItemCoupon_NotLikeSearch(String isItemCoupon, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(isItemCoupon), xgetCValueIsItemCoupon(), "IS_ITEM_COUPON", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     * @param isItemCoupon The value of isItemCoupon as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsItemCoupon_PrefixSearch(String isItemCoupon) {
        setIsItemCoupon_LikeSearch(isItemCoupon, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     */
    public void setIsItemCoupon_IsNull() { regIsItemCoupon(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     */
    public void setIsItemCoupon_IsNullOrEmpty() { regIsItemCoupon(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     */
    public void setIsItemCoupon_IsNotNull() { regIsItemCoupon(CK_ISNN, DOBJ); }

    protected void regIsItemCoupon(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIsItemCoupon(), "IS_ITEM_COUPON"); }
    protected abstract ConditionValue xgetCValueIsItemCoupon();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     * @param isShippingCoupon The value of isShippingCoupon as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsShippingCoupon_Equal(String isShippingCoupon) {
        doSetIsShippingCoupon_Equal(fRES(isShippingCoupon));
    }

    protected void doSetIsShippingCoupon_Equal(String isShippingCoupon) {
        regIsShippingCoupon(CK_EQ, isShippingCoupon);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     * @param isShippingCoupon The value of isShippingCoupon as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsShippingCoupon_NotEqual(String isShippingCoupon) {
        doSetIsShippingCoupon_NotEqual(fRES(isShippingCoupon));
    }

    protected void doSetIsShippingCoupon_NotEqual(String isShippingCoupon) {
        regIsShippingCoupon(CK_NES, isShippingCoupon);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     * @param isShippingCoupon The value of isShippingCoupon as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsShippingCoupon_GreaterThan(String isShippingCoupon) {
        regIsShippingCoupon(CK_GT, fRES(isShippingCoupon));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     * @param isShippingCoupon The value of isShippingCoupon as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsShippingCoupon_LessThan(String isShippingCoupon) {
        regIsShippingCoupon(CK_LT, fRES(isShippingCoupon));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     * @param isShippingCoupon The value of isShippingCoupon as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsShippingCoupon_GreaterEqual(String isShippingCoupon) {
        regIsShippingCoupon(CK_GE, fRES(isShippingCoupon));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     * @param isShippingCoupon The value of isShippingCoupon as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsShippingCoupon_LessEqual(String isShippingCoupon) {
        regIsShippingCoupon(CK_LE, fRES(isShippingCoupon));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     * @param isShippingCouponList The collection of isShippingCoupon as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsShippingCoupon_InScope(Collection<String> isShippingCouponList) {
        doSetIsShippingCoupon_InScope(isShippingCouponList);
    }

    protected void doSetIsShippingCoupon_InScope(Collection<String> isShippingCouponList) {
        regINS(CK_INS, cTL(isShippingCouponList), xgetCValueIsShippingCoupon(), "IS_SHIPPING_COUPON");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     * @param isShippingCouponList The collection of isShippingCoupon as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsShippingCoupon_NotInScope(Collection<String> isShippingCouponList) {
        doSetIsShippingCoupon_NotInScope(isShippingCouponList);
    }

    protected void doSetIsShippingCoupon_NotInScope(Collection<String> isShippingCouponList) {
        regINS(CK_NINS, cTL(isShippingCouponList), xgetCValueIsShippingCoupon(), "IS_SHIPPING_COUPON");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IS_SHIPPING_COUPON: {varchar(30)} <br>
     * <pre>e.g. setIsShippingCoupon_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param isShippingCoupon The value of isShippingCoupon as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIsShippingCoupon_LikeSearch(String isShippingCoupon, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(isShippingCoupon), xgetCValueIsShippingCoupon(), "IS_SHIPPING_COUPON", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     * @param isShippingCoupon The value of isShippingCoupon as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIsShippingCoupon_NotLikeSearch(String isShippingCoupon, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(isShippingCoupon), xgetCValueIsShippingCoupon(), "IS_SHIPPING_COUPON", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     * @param isShippingCoupon The value of isShippingCoupon as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsShippingCoupon_PrefixSearch(String isShippingCoupon) {
        setIsShippingCoupon_LikeSearch(isShippingCoupon, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     */
    public void setIsShippingCoupon_IsNull() { regIsShippingCoupon(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     */
    public void setIsShippingCoupon_IsNullOrEmpty() { regIsShippingCoupon(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     */
    public void setIsShippingCoupon_IsNotNull() { regIsShippingCoupon(CK_ISNN, DOBJ); }

    protected void regIsShippingCoupon(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIsShippingCoupon(), "IS_SHIPPING_COUPON"); }
    protected abstract ConditionValue xgetCValueIsShippingCoupon();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_Equal(String shipName) {
        doSetShipName_Equal(fRES(shipName));
    }

    protected void doSetShipName_Equal(String shipName) {
        regShipName(CK_EQ, shipName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_NotEqual(String shipName) {
        doSetShipName_NotEqual(fRES(shipName));
    }

    protected void doSetShipName_NotEqual(String shipName) {
        regShipName(CK_NES, shipName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_GreaterThan(String shipName) {
        regShipName(CK_GT, fRES(shipName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_LessThan(String shipName) {
        regShipName(CK_LT, fRES(shipName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_GreaterEqual(String shipName) {
        regShipName(CK_GE, fRES(shipName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_LessEqual(String shipName) {
        regShipName(CK_LE, fRES(shipName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipNameList The collection of shipName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_InScope(Collection<String> shipNameList) {
        doSetShipName_InScope(shipNameList);
    }

    protected void doSetShipName_InScope(Collection<String> shipNameList) {
        regINS(CK_INS, cTL(shipNameList), xgetCValueShipName(), "SHIP_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipNameList The collection of shipName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_NotInScope(Collection<String> shipNameList) {
        doSetShipName_NotInScope(shipNameList);
    }

    protected void doSetShipName_NotInScope(Collection<String> shipNameList) {
        regINS(CK_NINS, cTL(shipNameList), xgetCValueShipName(), "SHIP_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_NAME: {varchar(255)} <br>
     * <pre>e.g. setShipName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipName The value of shipName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipName_LikeSearch(String shipName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipName), xgetCValueShipName(), "SHIP_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipName_NotLikeSearch(String shipName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipName), xgetCValueShipName(), "SHIP_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_PrefixSearch(String shipName) {
        setShipName_LikeSearch(shipName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     */
    public void setShipName_IsNull() { regShipName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     */
    public void setShipName_IsNullOrEmpty() { regShipName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     */
    public void setShipName_IsNotNull() { regShipName(CK_ISNN, DOBJ); }

    protected void regShipName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipName(), "SHIP_NAME"); }
    protected abstract ConditionValue xgetCValueShipName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     * @param shipFirstName The value of shipFirstName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstName_Equal(String shipFirstName) {
        doSetShipFirstName_Equal(fRES(shipFirstName));
    }

    protected void doSetShipFirstName_Equal(String shipFirstName) {
        regShipFirstName(CK_EQ, shipFirstName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     * @param shipFirstName The value of shipFirstName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstName_NotEqual(String shipFirstName) {
        doSetShipFirstName_NotEqual(fRES(shipFirstName));
    }

    protected void doSetShipFirstName_NotEqual(String shipFirstName) {
        regShipFirstName(CK_NES, shipFirstName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     * @param shipFirstName The value of shipFirstName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstName_GreaterThan(String shipFirstName) {
        regShipFirstName(CK_GT, fRES(shipFirstName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     * @param shipFirstName The value of shipFirstName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstName_LessThan(String shipFirstName) {
        regShipFirstName(CK_LT, fRES(shipFirstName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     * @param shipFirstName The value of shipFirstName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstName_GreaterEqual(String shipFirstName) {
        regShipFirstName(CK_GE, fRES(shipFirstName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     * @param shipFirstName The value of shipFirstName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstName_LessEqual(String shipFirstName) {
        regShipFirstName(CK_LE, fRES(shipFirstName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     * @param shipFirstNameList The collection of shipFirstName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstName_InScope(Collection<String> shipFirstNameList) {
        doSetShipFirstName_InScope(shipFirstNameList);
    }

    protected void doSetShipFirstName_InScope(Collection<String> shipFirstNameList) {
        regINS(CK_INS, cTL(shipFirstNameList), xgetCValueShipFirstName(), "SHIP_FIRST_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     * @param shipFirstNameList The collection of shipFirstName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstName_NotInScope(Collection<String> shipFirstNameList) {
        doSetShipFirstName_NotInScope(shipFirstNameList);
    }

    protected void doSetShipFirstName_NotInScope(Collection<String> shipFirstNameList) {
        regINS(CK_NINS, cTL(shipFirstNameList), xgetCValueShipFirstName(), "SHIP_FIRST_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_FIRST_NAME: {varchar(255)} <br>
     * <pre>e.g. setShipFirstName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipFirstName The value of shipFirstName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipFirstName_LikeSearch(String shipFirstName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipFirstName), xgetCValueShipFirstName(), "SHIP_FIRST_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     * @param shipFirstName The value of shipFirstName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipFirstName_NotLikeSearch(String shipFirstName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipFirstName), xgetCValueShipFirstName(), "SHIP_FIRST_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     * @param shipFirstName The value of shipFirstName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstName_PrefixSearch(String shipFirstName) {
        setShipFirstName_LikeSearch(shipFirstName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     */
    public void setShipFirstName_IsNull() { regShipFirstName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     */
    public void setShipFirstName_IsNullOrEmpty() { regShipFirstName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     */
    public void setShipFirstName_IsNotNull() { regShipFirstName(CK_ISNN, DOBJ); }

    protected void regShipFirstName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipFirstName(), "SHIP_FIRST_NAME"); }
    protected abstract ConditionValue xgetCValueShipFirstName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     * @param shipLastName The value of shipLastName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastName_Equal(String shipLastName) {
        doSetShipLastName_Equal(fRES(shipLastName));
    }

    protected void doSetShipLastName_Equal(String shipLastName) {
        regShipLastName(CK_EQ, shipLastName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     * @param shipLastName The value of shipLastName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastName_NotEqual(String shipLastName) {
        doSetShipLastName_NotEqual(fRES(shipLastName));
    }

    protected void doSetShipLastName_NotEqual(String shipLastName) {
        regShipLastName(CK_NES, shipLastName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     * @param shipLastName The value of shipLastName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastName_GreaterThan(String shipLastName) {
        regShipLastName(CK_GT, fRES(shipLastName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     * @param shipLastName The value of shipLastName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastName_LessThan(String shipLastName) {
        regShipLastName(CK_LT, fRES(shipLastName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     * @param shipLastName The value of shipLastName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastName_GreaterEqual(String shipLastName) {
        regShipLastName(CK_GE, fRES(shipLastName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     * @param shipLastName The value of shipLastName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastName_LessEqual(String shipLastName) {
        regShipLastName(CK_LE, fRES(shipLastName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     * @param shipLastNameList The collection of shipLastName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastName_InScope(Collection<String> shipLastNameList) {
        doSetShipLastName_InScope(shipLastNameList);
    }

    protected void doSetShipLastName_InScope(Collection<String> shipLastNameList) {
        regINS(CK_INS, cTL(shipLastNameList), xgetCValueShipLastName(), "SHIP_LAST_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     * @param shipLastNameList The collection of shipLastName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastName_NotInScope(Collection<String> shipLastNameList) {
        doSetShipLastName_NotInScope(shipLastNameList);
    }

    protected void doSetShipLastName_NotInScope(Collection<String> shipLastNameList) {
        regINS(CK_NINS, cTL(shipLastNameList), xgetCValueShipLastName(), "SHIP_LAST_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_LAST_NAME: {varchar(255)} <br>
     * <pre>e.g. setShipLastName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipLastName The value of shipLastName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipLastName_LikeSearch(String shipLastName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipLastName), xgetCValueShipLastName(), "SHIP_LAST_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     * @param shipLastName The value of shipLastName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipLastName_NotLikeSearch(String shipLastName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipLastName), xgetCValueShipLastName(), "SHIP_LAST_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     * @param shipLastName The value of shipLastName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastName_PrefixSearch(String shipLastName) {
        setShipLastName_LikeSearch(shipLastName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     */
    public void setShipLastName_IsNull() { regShipLastName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     */
    public void setShipLastName_IsNullOrEmpty() { regShipLastName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     */
    public void setShipLastName_IsNotNull() { regShipLastName(CK_ISNN, DOBJ); }

    protected void regShipLastName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipLastName(), "SHIP_LAST_NAME"); }
    protected abstract ConditionValue xgetCValueShipLastName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     * @param shipAddress1 The value of shipAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_Equal(String shipAddress1) {
        doSetShipAddress1_Equal(fRES(shipAddress1));
    }

    protected void doSetShipAddress1_Equal(String shipAddress1) {
        regShipAddress1(CK_EQ, shipAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     * @param shipAddress1 The value of shipAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_NotEqual(String shipAddress1) {
        doSetShipAddress1_NotEqual(fRES(shipAddress1));
    }

    protected void doSetShipAddress1_NotEqual(String shipAddress1) {
        regShipAddress1(CK_NES, shipAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     * @param shipAddress1 The value of shipAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_GreaterThan(String shipAddress1) {
        regShipAddress1(CK_GT, fRES(shipAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     * @param shipAddress1 The value of shipAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_LessThan(String shipAddress1) {
        regShipAddress1(CK_LT, fRES(shipAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     * @param shipAddress1 The value of shipAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_GreaterEqual(String shipAddress1) {
        regShipAddress1(CK_GE, fRES(shipAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     * @param shipAddress1 The value of shipAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_LessEqual(String shipAddress1) {
        regShipAddress1(CK_LE, fRES(shipAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     * @param shipAddress1List The collection of shipAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_InScope(Collection<String> shipAddress1List) {
        doSetShipAddress1_InScope(shipAddress1List);
    }

    protected void doSetShipAddress1_InScope(Collection<String> shipAddress1List) {
        regINS(CK_INS, cTL(shipAddress1List), xgetCValueShipAddress1(), "SHIP_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     * @param shipAddress1List The collection of shipAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_NotInScope(Collection<String> shipAddress1List) {
        doSetShipAddress1_NotInScope(shipAddress1List);
    }

    protected void doSetShipAddress1_NotInScope(Collection<String> shipAddress1List) {
        regINS(CK_NINS, cTL(shipAddress1List), xgetCValueShipAddress1(), "SHIP_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS1: {varchar(255)} <br>
     * <pre>e.g. setShipAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipAddress1 The value of shipAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipAddress1_LikeSearch(String shipAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipAddress1), xgetCValueShipAddress1(), "SHIP_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     * @param shipAddress1 The value of shipAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipAddress1_NotLikeSearch(String shipAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipAddress1), xgetCValueShipAddress1(), "SHIP_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     * @param shipAddress1 The value of shipAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_PrefixSearch(String shipAddress1) {
        setShipAddress1_LikeSearch(shipAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     */
    public void setShipAddress1_IsNull() { regShipAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     */
    public void setShipAddress1_IsNullOrEmpty() { regShipAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     */
    public void setShipAddress1_IsNotNull() { regShipAddress1(CK_ISNN, DOBJ); }

    protected void regShipAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipAddress1(), "SHIP_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueShipAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     * @param shipAddress2 The value of shipAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_Equal(String shipAddress2) {
        doSetShipAddress2_Equal(fRES(shipAddress2));
    }

    protected void doSetShipAddress2_Equal(String shipAddress2) {
        regShipAddress2(CK_EQ, shipAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     * @param shipAddress2 The value of shipAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_NotEqual(String shipAddress2) {
        doSetShipAddress2_NotEqual(fRES(shipAddress2));
    }

    protected void doSetShipAddress2_NotEqual(String shipAddress2) {
        regShipAddress2(CK_NES, shipAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     * @param shipAddress2 The value of shipAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_GreaterThan(String shipAddress2) {
        regShipAddress2(CK_GT, fRES(shipAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     * @param shipAddress2 The value of shipAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_LessThan(String shipAddress2) {
        regShipAddress2(CK_LT, fRES(shipAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     * @param shipAddress2 The value of shipAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_GreaterEqual(String shipAddress2) {
        regShipAddress2(CK_GE, fRES(shipAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     * @param shipAddress2 The value of shipAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_LessEqual(String shipAddress2) {
        regShipAddress2(CK_LE, fRES(shipAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     * @param shipAddress2List The collection of shipAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_InScope(Collection<String> shipAddress2List) {
        doSetShipAddress2_InScope(shipAddress2List);
    }

    protected void doSetShipAddress2_InScope(Collection<String> shipAddress2List) {
        regINS(CK_INS, cTL(shipAddress2List), xgetCValueShipAddress2(), "SHIP_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     * @param shipAddress2List The collection of shipAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_NotInScope(Collection<String> shipAddress2List) {
        doSetShipAddress2_NotInScope(shipAddress2List);
    }

    protected void doSetShipAddress2_NotInScope(Collection<String> shipAddress2List) {
        regINS(CK_NINS, cTL(shipAddress2List), xgetCValueShipAddress2(), "SHIP_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS2: {varchar(255)} <br>
     * <pre>e.g. setShipAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipAddress2 The value of shipAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipAddress2_LikeSearch(String shipAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipAddress2), xgetCValueShipAddress2(), "SHIP_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     * @param shipAddress2 The value of shipAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipAddress2_NotLikeSearch(String shipAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipAddress2), xgetCValueShipAddress2(), "SHIP_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     * @param shipAddress2 The value of shipAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_PrefixSearch(String shipAddress2) {
        setShipAddress2_LikeSearch(shipAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     */
    public void setShipAddress2_IsNull() { regShipAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     */
    public void setShipAddress2_IsNullOrEmpty() { regShipAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     */
    public void setShipAddress2_IsNotNull() { regShipAddress2(CK_ISNN, DOBJ); }

    protected void regShipAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipAddress2(), "SHIP_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueShipAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_CITY: {varchar(255)}
     * @param shipCity The value of shipCity as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCity_Equal(String shipCity) {
        doSetShipCity_Equal(fRES(shipCity));
    }

    protected void doSetShipCity_Equal(String shipCity) {
        regShipCity(CK_EQ, shipCity);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_CITY: {varchar(255)}
     * @param shipCity The value of shipCity as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCity_NotEqual(String shipCity) {
        doSetShipCity_NotEqual(fRES(shipCity));
    }

    protected void doSetShipCity_NotEqual(String shipCity) {
        regShipCity(CK_NES, shipCity);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_CITY: {varchar(255)}
     * @param shipCity The value of shipCity as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCity_GreaterThan(String shipCity) {
        regShipCity(CK_GT, fRES(shipCity));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_CITY: {varchar(255)}
     * @param shipCity The value of shipCity as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCity_LessThan(String shipCity) {
        regShipCity(CK_LT, fRES(shipCity));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_CITY: {varchar(255)}
     * @param shipCity The value of shipCity as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCity_GreaterEqual(String shipCity) {
        regShipCity(CK_GE, fRES(shipCity));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_CITY: {varchar(255)}
     * @param shipCity The value of shipCity as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCity_LessEqual(String shipCity) {
        regShipCity(CK_LE, fRES(shipCity));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_CITY: {varchar(255)}
     * @param shipCityList The collection of shipCity as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCity_InScope(Collection<String> shipCityList) {
        doSetShipCity_InScope(shipCityList);
    }

    protected void doSetShipCity_InScope(Collection<String> shipCityList) {
        regINS(CK_INS, cTL(shipCityList), xgetCValueShipCity(), "SHIP_CITY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_CITY: {varchar(255)}
     * @param shipCityList The collection of shipCity as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCity_NotInScope(Collection<String> shipCityList) {
        doSetShipCity_NotInScope(shipCityList);
    }

    protected void doSetShipCity_NotInScope(Collection<String> shipCityList) {
        regINS(CK_NINS, cTL(shipCityList), xgetCValueShipCity(), "SHIP_CITY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_CITY: {varchar(255)} <br>
     * <pre>e.g. setShipCity_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipCity The value of shipCity as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipCity_LikeSearch(String shipCity, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipCity), xgetCValueShipCity(), "SHIP_CITY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_CITY: {varchar(255)}
     * @param shipCity The value of shipCity as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipCity_NotLikeSearch(String shipCity, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipCity), xgetCValueShipCity(), "SHIP_CITY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_CITY: {varchar(255)}
     * @param shipCity The value of shipCity as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCity_PrefixSearch(String shipCity) {
        setShipCity_LikeSearch(shipCity, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_CITY: {varchar(255)}
     */
    public void setShipCity_IsNull() { regShipCity(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_CITY: {varchar(255)}
     */
    public void setShipCity_IsNullOrEmpty() { regShipCity(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_CITY: {varchar(255)}
     */
    public void setShipCity_IsNotNull() { regShipCity(CK_ISNN, DOBJ); }

    protected void regShipCity(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipCity(), "SHIP_CITY"); }
    protected abstract ConditionValue xgetCValueShipCity();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     * @param shipPrefecture The value of shipPrefecture as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefecture_Equal(String shipPrefecture) {
        doSetShipPrefecture_Equal(fRES(shipPrefecture));
    }

    protected void doSetShipPrefecture_Equal(String shipPrefecture) {
        regShipPrefecture(CK_EQ, shipPrefecture);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     * @param shipPrefecture The value of shipPrefecture as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefecture_NotEqual(String shipPrefecture) {
        doSetShipPrefecture_NotEqual(fRES(shipPrefecture));
    }

    protected void doSetShipPrefecture_NotEqual(String shipPrefecture) {
        regShipPrefecture(CK_NES, shipPrefecture);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     * @param shipPrefecture The value of shipPrefecture as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefecture_GreaterThan(String shipPrefecture) {
        regShipPrefecture(CK_GT, fRES(shipPrefecture));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     * @param shipPrefecture The value of shipPrefecture as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefecture_LessThan(String shipPrefecture) {
        regShipPrefecture(CK_LT, fRES(shipPrefecture));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     * @param shipPrefecture The value of shipPrefecture as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefecture_GreaterEqual(String shipPrefecture) {
        regShipPrefecture(CK_GE, fRES(shipPrefecture));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     * @param shipPrefecture The value of shipPrefecture as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefecture_LessEqual(String shipPrefecture) {
        regShipPrefecture(CK_LE, fRES(shipPrefecture));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     * @param shipPrefectureList The collection of shipPrefecture as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefecture_InScope(Collection<String> shipPrefectureList) {
        doSetShipPrefecture_InScope(shipPrefectureList);
    }

    protected void doSetShipPrefecture_InScope(Collection<String> shipPrefectureList) {
        regINS(CK_INS, cTL(shipPrefectureList), xgetCValueShipPrefecture(), "SHIP_PREFECTURE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     * @param shipPrefectureList The collection of shipPrefecture as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefecture_NotInScope(Collection<String> shipPrefectureList) {
        doSetShipPrefecture_NotInScope(shipPrefectureList);
    }

    protected void doSetShipPrefecture_NotInScope(Collection<String> shipPrefectureList) {
        regINS(CK_NINS, cTL(shipPrefectureList), xgetCValueShipPrefecture(), "SHIP_PREFECTURE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_PREFECTURE: {varchar(255)} <br>
     * <pre>e.g. setShipPrefecture_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipPrefecture The value of shipPrefecture as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipPrefecture_LikeSearch(String shipPrefecture, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipPrefecture), xgetCValueShipPrefecture(), "SHIP_PREFECTURE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     * @param shipPrefecture The value of shipPrefecture as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipPrefecture_NotLikeSearch(String shipPrefecture, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipPrefecture), xgetCValueShipPrefecture(), "SHIP_PREFECTURE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     * @param shipPrefecture The value of shipPrefecture as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefecture_PrefixSearch(String shipPrefecture) {
        setShipPrefecture_LikeSearch(shipPrefecture, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     */
    public void setShipPrefecture_IsNull() { regShipPrefecture(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     */
    public void setShipPrefecture_IsNullOrEmpty() { regShipPrefecture(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     */
    public void setShipPrefecture_IsNotNull() { regShipPrefecture(CK_ISNN, DOBJ); }

    protected void regShipPrefecture(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipPrefecture(), "SHIP_PREFECTURE"); }
    protected abstract ConditionValue xgetCValueShipPrefecture();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     * @param shipZipCode The value of shipZipCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipZipCode_Equal(String shipZipCode) {
        doSetShipZipCode_Equal(fRES(shipZipCode));
    }

    protected void doSetShipZipCode_Equal(String shipZipCode) {
        regShipZipCode(CK_EQ, shipZipCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     * @param shipZipCode The value of shipZipCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipZipCode_NotEqual(String shipZipCode) {
        doSetShipZipCode_NotEqual(fRES(shipZipCode));
    }

    protected void doSetShipZipCode_NotEqual(String shipZipCode) {
        regShipZipCode(CK_NES, shipZipCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     * @param shipZipCode The value of shipZipCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipZipCode_GreaterThan(String shipZipCode) {
        regShipZipCode(CK_GT, fRES(shipZipCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     * @param shipZipCode The value of shipZipCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipZipCode_LessThan(String shipZipCode) {
        regShipZipCode(CK_LT, fRES(shipZipCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     * @param shipZipCode The value of shipZipCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipZipCode_GreaterEqual(String shipZipCode) {
        regShipZipCode(CK_GE, fRES(shipZipCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     * @param shipZipCode The value of shipZipCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipZipCode_LessEqual(String shipZipCode) {
        regShipZipCode(CK_LE, fRES(shipZipCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     * @param shipZipCodeList The collection of shipZipCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipZipCode_InScope(Collection<String> shipZipCodeList) {
        doSetShipZipCode_InScope(shipZipCodeList);
    }

    protected void doSetShipZipCode_InScope(Collection<String> shipZipCodeList) {
        regINS(CK_INS, cTL(shipZipCodeList), xgetCValueShipZipCode(), "SHIP_ZIP_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     * @param shipZipCodeList The collection of shipZipCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipZipCode_NotInScope(Collection<String> shipZipCodeList) {
        doSetShipZipCode_NotInScope(shipZipCodeList);
    }

    protected void doSetShipZipCode_NotInScope(Collection<String> shipZipCodeList) {
        regINS(CK_NINS, cTL(shipZipCodeList), xgetCValueShipZipCode(), "SHIP_ZIP_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ZIP_CODE: {varchar(60)} <br>
     * <pre>e.g. setShipZipCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipZipCode The value of shipZipCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipZipCode_LikeSearch(String shipZipCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipZipCode), xgetCValueShipZipCode(), "SHIP_ZIP_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     * @param shipZipCode The value of shipZipCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipZipCode_NotLikeSearch(String shipZipCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipZipCode), xgetCValueShipZipCode(), "SHIP_ZIP_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     * @param shipZipCode The value of shipZipCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipZipCode_PrefixSearch(String shipZipCode) {
        setShipZipCode_LikeSearch(shipZipCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     */
    public void setShipZipCode_IsNull() { regShipZipCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     */
    public void setShipZipCode_IsNullOrEmpty() { regShipZipCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     */
    public void setShipZipCode_IsNotNull() { regShipZipCode(CK_ISNN, DOBJ); }

    protected void regShipZipCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipZipCode(), "SHIP_ZIP_CODE"); }
    protected abstract ConditionValue xgetCValueShipZipCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     * @param shipNameKana The value of shipNameKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNameKana_Equal(String shipNameKana) {
        doSetShipNameKana_Equal(fRES(shipNameKana));
    }

    protected void doSetShipNameKana_Equal(String shipNameKana) {
        regShipNameKana(CK_EQ, shipNameKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     * @param shipNameKana The value of shipNameKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNameKana_NotEqual(String shipNameKana) {
        doSetShipNameKana_NotEqual(fRES(shipNameKana));
    }

    protected void doSetShipNameKana_NotEqual(String shipNameKana) {
        regShipNameKana(CK_NES, shipNameKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     * @param shipNameKana The value of shipNameKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNameKana_GreaterThan(String shipNameKana) {
        regShipNameKana(CK_GT, fRES(shipNameKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     * @param shipNameKana The value of shipNameKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNameKana_LessThan(String shipNameKana) {
        regShipNameKana(CK_LT, fRES(shipNameKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     * @param shipNameKana The value of shipNameKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNameKana_GreaterEqual(String shipNameKana) {
        regShipNameKana(CK_GE, fRES(shipNameKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     * @param shipNameKana The value of shipNameKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNameKana_LessEqual(String shipNameKana) {
        regShipNameKana(CK_LE, fRES(shipNameKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     * @param shipNameKanaList The collection of shipNameKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNameKana_InScope(Collection<String> shipNameKanaList) {
        doSetShipNameKana_InScope(shipNameKanaList);
    }

    protected void doSetShipNameKana_InScope(Collection<String> shipNameKanaList) {
        regINS(CK_INS, cTL(shipNameKanaList), xgetCValueShipNameKana(), "SHIP_NAME_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     * @param shipNameKanaList The collection of shipNameKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNameKana_NotInScope(Collection<String> shipNameKanaList) {
        doSetShipNameKana_NotInScope(shipNameKanaList);
    }

    protected void doSetShipNameKana_NotInScope(Collection<String> shipNameKanaList) {
        regINS(CK_NINS, cTL(shipNameKanaList), xgetCValueShipNameKana(), "SHIP_NAME_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_NAME_KANA: {varchar(255)} <br>
     * <pre>e.g. setShipNameKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipNameKana The value of shipNameKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipNameKana_LikeSearch(String shipNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipNameKana), xgetCValueShipNameKana(), "SHIP_NAME_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     * @param shipNameKana The value of shipNameKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipNameKana_NotLikeSearch(String shipNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipNameKana), xgetCValueShipNameKana(), "SHIP_NAME_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     * @param shipNameKana The value of shipNameKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNameKana_PrefixSearch(String shipNameKana) {
        setShipNameKana_LikeSearch(shipNameKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     */
    public void setShipNameKana_IsNull() { regShipNameKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     */
    public void setShipNameKana_IsNullOrEmpty() { regShipNameKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     */
    public void setShipNameKana_IsNotNull() { regShipNameKana(CK_ISNN, DOBJ); }

    protected void regShipNameKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipNameKana(), "SHIP_NAME_KANA"); }
    protected abstract ConditionValue xgetCValueShipNameKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     * @param shipFirstNameKana The value of shipFirstNameKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstNameKana_Equal(String shipFirstNameKana) {
        doSetShipFirstNameKana_Equal(fRES(shipFirstNameKana));
    }

    protected void doSetShipFirstNameKana_Equal(String shipFirstNameKana) {
        regShipFirstNameKana(CK_EQ, shipFirstNameKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     * @param shipFirstNameKana The value of shipFirstNameKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstNameKana_NotEqual(String shipFirstNameKana) {
        doSetShipFirstNameKana_NotEqual(fRES(shipFirstNameKana));
    }

    protected void doSetShipFirstNameKana_NotEqual(String shipFirstNameKana) {
        regShipFirstNameKana(CK_NES, shipFirstNameKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     * @param shipFirstNameKana The value of shipFirstNameKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstNameKana_GreaterThan(String shipFirstNameKana) {
        regShipFirstNameKana(CK_GT, fRES(shipFirstNameKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     * @param shipFirstNameKana The value of shipFirstNameKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstNameKana_LessThan(String shipFirstNameKana) {
        regShipFirstNameKana(CK_LT, fRES(shipFirstNameKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     * @param shipFirstNameKana The value of shipFirstNameKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstNameKana_GreaterEqual(String shipFirstNameKana) {
        regShipFirstNameKana(CK_GE, fRES(shipFirstNameKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     * @param shipFirstNameKana The value of shipFirstNameKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstNameKana_LessEqual(String shipFirstNameKana) {
        regShipFirstNameKana(CK_LE, fRES(shipFirstNameKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     * @param shipFirstNameKanaList The collection of shipFirstNameKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstNameKana_InScope(Collection<String> shipFirstNameKanaList) {
        doSetShipFirstNameKana_InScope(shipFirstNameKanaList);
    }

    protected void doSetShipFirstNameKana_InScope(Collection<String> shipFirstNameKanaList) {
        regINS(CK_INS, cTL(shipFirstNameKanaList), xgetCValueShipFirstNameKana(), "SHIP_FIRST_NAME_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     * @param shipFirstNameKanaList The collection of shipFirstNameKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstNameKana_NotInScope(Collection<String> shipFirstNameKanaList) {
        doSetShipFirstNameKana_NotInScope(shipFirstNameKanaList);
    }

    protected void doSetShipFirstNameKana_NotInScope(Collection<String> shipFirstNameKanaList) {
        regINS(CK_NINS, cTL(shipFirstNameKanaList), xgetCValueShipFirstNameKana(), "SHIP_FIRST_NAME_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)} <br>
     * <pre>e.g. setShipFirstNameKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipFirstNameKana The value of shipFirstNameKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipFirstNameKana_LikeSearch(String shipFirstNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipFirstNameKana), xgetCValueShipFirstNameKana(), "SHIP_FIRST_NAME_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     * @param shipFirstNameKana The value of shipFirstNameKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipFirstNameKana_NotLikeSearch(String shipFirstNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipFirstNameKana), xgetCValueShipFirstNameKana(), "SHIP_FIRST_NAME_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     * @param shipFirstNameKana The value of shipFirstNameKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipFirstNameKana_PrefixSearch(String shipFirstNameKana) {
        setShipFirstNameKana_LikeSearch(shipFirstNameKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     */
    public void setShipFirstNameKana_IsNull() { regShipFirstNameKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     */
    public void setShipFirstNameKana_IsNullOrEmpty() { regShipFirstNameKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     */
    public void setShipFirstNameKana_IsNotNull() { regShipFirstNameKana(CK_ISNN, DOBJ); }

    protected void regShipFirstNameKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipFirstNameKana(), "SHIP_FIRST_NAME_KANA"); }
    protected abstract ConditionValue xgetCValueShipFirstNameKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     * @param shipLastNameKana The value of shipLastNameKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastNameKana_Equal(String shipLastNameKana) {
        doSetShipLastNameKana_Equal(fRES(shipLastNameKana));
    }

    protected void doSetShipLastNameKana_Equal(String shipLastNameKana) {
        regShipLastNameKana(CK_EQ, shipLastNameKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     * @param shipLastNameKana The value of shipLastNameKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastNameKana_NotEqual(String shipLastNameKana) {
        doSetShipLastNameKana_NotEqual(fRES(shipLastNameKana));
    }

    protected void doSetShipLastNameKana_NotEqual(String shipLastNameKana) {
        regShipLastNameKana(CK_NES, shipLastNameKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     * @param shipLastNameKana The value of shipLastNameKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastNameKana_GreaterThan(String shipLastNameKana) {
        regShipLastNameKana(CK_GT, fRES(shipLastNameKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     * @param shipLastNameKana The value of shipLastNameKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastNameKana_LessThan(String shipLastNameKana) {
        regShipLastNameKana(CK_LT, fRES(shipLastNameKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     * @param shipLastNameKana The value of shipLastNameKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastNameKana_GreaterEqual(String shipLastNameKana) {
        regShipLastNameKana(CK_GE, fRES(shipLastNameKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     * @param shipLastNameKana The value of shipLastNameKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastNameKana_LessEqual(String shipLastNameKana) {
        regShipLastNameKana(CK_LE, fRES(shipLastNameKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     * @param shipLastNameKanaList The collection of shipLastNameKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastNameKana_InScope(Collection<String> shipLastNameKanaList) {
        doSetShipLastNameKana_InScope(shipLastNameKanaList);
    }

    protected void doSetShipLastNameKana_InScope(Collection<String> shipLastNameKanaList) {
        regINS(CK_INS, cTL(shipLastNameKanaList), xgetCValueShipLastNameKana(), "SHIP_LAST_NAME_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     * @param shipLastNameKanaList The collection of shipLastNameKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastNameKana_NotInScope(Collection<String> shipLastNameKanaList) {
        doSetShipLastNameKana_NotInScope(shipLastNameKanaList);
    }

    protected void doSetShipLastNameKana_NotInScope(Collection<String> shipLastNameKanaList) {
        regINS(CK_NINS, cTL(shipLastNameKanaList), xgetCValueShipLastNameKana(), "SHIP_LAST_NAME_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)} <br>
     * <pre>e.g. setShipLastNameKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipLastNameKana The value of shipLastNameKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipLastNameKana_LikeSearch(String shipLastNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipLastNameKana), xgetCValueShipLastNameKana(), "SHIP_LAST_NAME_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     * @param shipLastNameKana The value of shipLastNameKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipLastNameKana_NotLikeSearch(String shipLastNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipLastNameKana), xgetCValueShipLastNameKana(), "SHIP_LAST_NAME_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     * @param shipLastNameKana The value of shipLastNameKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipLastNameKana_PrefixSearch(String shipLastNameKana) {
        setShipLastNameKana_LikeSearch(shipLastNameKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     */
    public void setShipLastNameKana_IsNull() { regShipLastNameKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     */
    public void setShipLastNameKana_IsNullOrEmpty() { regShipLastNameKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     */
    public void setShipLastNameKana_IsNotNull() { regShipLastNameKana(CK_ISNN, DOBJ); }

    protected void regShipLastNameKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipLastNameKana(), "SHIP_LAST_NAME_KANA"); }
    protected abstract ConditionValue xgetCValueShipLastNameKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     * @param shipAddress1Kana The value of shipAddress1Kana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1Kana_Equal(String shipAddress1Kana) {
        doSetShipAddress1Kana_Equal(fRES(shipAddress1Kana));
    }

    protected void doSetShipAddress1Kana_Equal(String shipAddress1Kana) {
        regShipAddress1Kana(CK_EQ, shipAddress1Kana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     * @param shipAddress1Kana The value of shipAddress1Kana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1Kana_NotEqual(String shipAddress1Kana) {
        doSetShipAddress1Kana_NotEqual(fRES(shipAddress1Kana));
    }

    protected void doSetShipAddress1Kana_NotEqual(String shipAddress1Kana) {
        regShipAddress1Kana(CK_NES, shipAddress1Kana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     * @param shipAddress1Kana The value of shipAddress1Kana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1Kana_GreaterThan(String shipAddress1Kana) {
        regShipAddress1Kana(CK_GT, fRES(shipAddress1Kana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     * @param shipAddress1Kana The value of shipAddress1Kana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1Kana_LessThan(String shipAddress1Kana) {
        regShipAddress1Kana(CK_LT, fRES(shipAddress1Kana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     * @param shipAddress1Kana The value of shipAddress1Kana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1Kana_GreaterEqual(String shipAddress1Kana) {
        regShipAddress1Kana(CK_GE, fRES(shipAddress1Kana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     * @param shipAddress1Kana The value of shipAddress1Kana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1Kana_LessEqual(String shipAddress1Kana) {
        regShipAddress1Kana(CK_LE, fRES(shipAddress1Kana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     * @param shipAddress1KanaList The collection of shipAddress1Kana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1Kana_InScope(Collection<String> shipAddress1KanaList) {
        doSetShipAddress1Kana_InScope(shipAddress1KanaList);
    }

    protected void doSetShipAddress1Kana_InScope(Collection<String> shipAddress1KanaList) {
        regINS(CK_INS, cTL(shipAddress1KanaList), xgetCValueShipAddress1Kana(), "SHIP_ADDRESS1_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     * @param shipAddress1KanaList The collection of shipAddress1Kana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1Kana_NotInScope(Collection<String> shipAddress1KanaList) {
        doSetShipAddress1Kana_NotInScope(shipAddress1KanaList);
    }

    protected void doSetShipAddress1Kana_NotInScope(Collection<String> shipAddress1KanaList) {
        regINS(CK_NINS, cTL(shipAddress1KanaList), xgetCValueShipAddress1Kana(), "SHIP_ADDRESS1_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)} <br>
     * <pre>e.g. setShipAddress1Kana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipAddress1Kana The value of shipAddress1Kana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipAddress1Kana_LikeSearch(String shipAddress1Kana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipAddress1Kana), xgetCValueShipAddress1Kana(), "SHIP_ADDRESS1_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     * @param shipAddress1Kana The value of shipAddress1Kana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipAddress1Kana_NotLikeSearch(String shipAddress1Kana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipAddress1Kana), xgetCValueShipAddress1Kana(), "SHIP_ADDRESS1_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     * @param shipAddress1Kana The value of shipAddress1Kana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1Kana_PrefixSearch(String shipAddress1Kana) {
        setShipAddress1Kana_LikeSearch(shipAddress1Kana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     */
    public void setShipAddress1Kana_IsNull() { regShipAddress1Kana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     */
    public void setShipAddress1Kana_IsNullOrEmpty() { regShipAddress1Kana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     */
    public void setShipAddress1Kana_IsNotNull() { regShipAddress1Kana(CK_ISNN, DOBJ); }

    protected void regShipAddress1Kana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipAddress1Kana(), "SHIP_ADDRESS1_KANA"); }
    protected abstract ConditionValue xgetCValueShipAddress1Kana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     * @param shipAddress2Kana The value of shipAddress2Kana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2Kana_Equal(String shipAddress2Kana) {
        doSetShipAddress2Kana_Equal(fRES(shipAddress2Kana));
    }

    protected void doSetShipAddress2Kana_Equal(String shipAddress2Kana) {
        regShipAddress2Kana(CK_EQ, shipAddress2Kana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     * @param shipAddress2Kana The value of shipAddress2Kana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2Kana_NotEqual(String shipAddress2Kana) {
        doSetShipAddress2Kana_NotEqual(fRES(shipAddress2Kana));
    }

    protected void doSetShipAddress2Kana_NotEqual(String shipAddress2Kana) {
        regShipAddress2Kana(CK_NES, shipAddress2Kana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     * @param shipAddress2Kana The value of shipAddress2Kana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2Kana_GreaterThan(String shipAddress2Kana) {
        regShipAddress2Kana(CK_GT, fRES(shipAddress2Kana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     * @param shipAddress2Kana The value of shipAddress2Kana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2Kana_LessThan(String shipAddress2Kana) {
        regShipAddress2Kana(CK_LT, fRES(shipAddress2Kana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     * @param shipAddress2Kana The value of shipAddress2Kana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2Kana_GreaterEqual(String shipAddress2Kana) {
        regShipAddress2Kana(CK_GE, fRES(shipAddress2Kana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     * @param shipAddress2Kana The value of shipAddress2Kana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2Kana_LessEqual(String shipAddress2Kana) {
        regShipAddress2Kana(CK_LE, fRES(shipAddress2Kana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     * @param shipAddress2KanaList The collection of shipAddress2Kana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2Kana_InScope(Collection<String> shipAddress2KanaList) {
        doSetShipAddress2Kana_InScope(shipAddress2KanaList);
    }

    protected void doSetShipAddress2Kana_InScope(Collection<String> shipAddress2KanaList) {
        regINS(CK_INS, cTL(shipAddress2KanaList), xgetCValueShipAddress2Kana(), "SHIP_ADDRESS2_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     * @param shipAddress2KanaList The collection of shipAddress2Kana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2Kana_NotInScope(Collection<String> shipAddress2KanaList) {
        doSetShipAddress2Kana_NotInScope(shipAddress2KanaList);
    }

    protected void doSetShipAddress2Kana_NotInScope(Collection<String> shipAddress2KanaList) {
        regINS(CK_NINS, cTL(shipAddress2KanaList), xgetCValueShipAddress2Kana(), "SHIP_ADDRESS2_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)} <br>
     * <pre>e.g. setShipAddress2Kana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipAddress2Kana The value of shipAddress2Kana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipAddress2Kana_LikeSearch(String shipAddress2Kana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipAddress2Kana), xgetCValueShipAddress2Kana(), "SHIP_ADDRESS2_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     * @param shipAddress2Kana The value of shipAddress2Kana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipAddress2Kana_NotLikeSearch(String shipAddress2Kana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipAddress2Kana), xgetCValueShipAddress2Kana(), "SHIP_ADDRESS2_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     * @param shipAddress2Kana The value of shipAddress2Kana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2Kana_PrefixSearch(String shipAddress2Kana) {
        setShipAddress2Kana_LikeSearch(shipAddress2Kana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     */
    public void setShipAddress2Kana_IsNull() { regShipAddress2Kana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     */
    public void setShipAddress2Kana_IsNullOrEmpty() { regShipAddress2Kana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     */
    public void setShipAddress2Kana_IsNotNull() { regShipAddress2Kana(CK_ISNN, DOBJ); }

    protected void regShipAddress2Kana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipAddress2Kana(), "SHIP_ADDRESS2_KANA"); }
    protected abstract ConditionValue xgetCValueShipAddress2Kana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     * @param shipCityKana The value of shipCityKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCityKana_Equal(String shipCityKana) {
        doSetShipCityKana_Equal(fRES(shipCityKana));
    }

    protected void doSetShipCityKana_Equal(String shipCityKana) {
        regShipCityKana(CK_EQ, shipCityKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     * @param shipCityKana The value of shipCityKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCityKana_NotEqual(String shipCityKana) {
        doSetShipCityKana_NotEqual(fRES(shipCityKana));
    }

    protected void doSetShipCityKana_NotEqual(String shipCityKana) {
        regShipCityKana(CK_NES, shipCityKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     * @param shipCityKana The value of shipCityKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCityKana_GreaterThan(String shipCityKana) {
        regShipCityKana(CK_GT, fRES(shipCityKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     * @param shipCityKana The value of shipCityKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCityKana_LessThan(String shipCityKana) {
        regShipCityKana(CK_LT, fRES(shipCityKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     * @param shipCityKana The value of shipCityKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCityKana_GreaterEqual(String shipCityKana) {
        regShipCityKana(CK_GE, fRES(shipCityKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     * @param shipCityKana The value of shipCityKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCityKana_LessEqual(String shipCityKana) {
        regShipCityKana(CK_LE, fRES(shipCityKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     * @param shipCityKanaList The collection of shipCityKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCityKana_InScope(Collection<String> shipCityKanaList) {
        doSetShipCityKana_InScope(shipCityKanaList);
    }

    protected void doSetShipCityKana_InScope(Collection<String> shipCityKanaList) {
        regINS(CK_INS, cTL(shipCityKanaList), xgetCValueShipCityKana(), "SHIP_CITY_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     * @param shipCityKanaList The collection of shipCityKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCityKana_NotInScope(Collection<String> shipCityKanaList) {
        doSetShipCityKana_NotInScope(shipCityKanaList);
    }

    protected void doSetShipCityKana_NotInScope(Collection<String> shipCityKanaList) {
        regINS(CK_NINS, cTL(shipCityKanaList), xgetCValueShipCityKana(), "SHIP_CITY_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_CITY_KANA: {varchar(255)} <br>
     * <pre>e.g. setShipCityKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipCityKana The value of shipCityKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipCityKana_LikeSearch(String shipCityKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipCityKana), xgetCValueShipCityKana(), "SHIP_CITY_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     * @param shipCityKana The value of shipCityKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipCityKana_NotLikeSearch(String shipCityKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipCityKana), xgetCValueShipCityKana(), "SHIP_CITY_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     * @param shipCityKana The value of shipCityKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCityKana_PrefixSearch(String shipCityKana) {
        setShipCityKana_LikeSearch(shipCityKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     */
    public void setShipCityKana_IsNull() { regShipCityKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     */
    public void setShipCityKana_IsNullOrEmpty() { regShipCityKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     */
    public void setShipCityKana_IsNotNull() { regShipCityKana(CK_ISNN, DOBJ); }

    protected void regShipCityKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipCityKana(), "SHIP_CITY_KANA"); }
    protected abstract ConditionValue xgetCValueShipCityKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     * @param shipPrefectureKana The value of shipPrefectureKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefectureKana_Equal(String shipPrefectureKana) {
        doSetShipPrefectureKana_Equal(fRES(shipPrefectureKana));
    }

    protected void doSetShipPrefectureKana_Equal(String shipPrefectureKana) {
        regShipPrefectureKana(CK_EQ, shipPrefectureKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     * @param shipPrefectureKana The value of shipPrefectureKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefectureKana_NotEqual(String shipPrefectureKana) {
        doSetShipPrefectureKana_NotEqual(fRES(shipPrefectureKana));
    }

    protected void doSetShipPrefectureKana_NotEqual(String shipPrefectureKana) {
        regShipPrefectureKana(CK_NES, shipPrefectureKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     * @param shipPrefectureKana The value of shipPrefectureKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefectureKana_GreaterThan(String shipPrefectureKana) {
        regShipPrefectureKana(CK_GT, fRES(shipPrefectureKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     * @param shipPrefectureKana The value of shipPrefectureKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefectureKana_LessThan(String shipPrefectureKana) {
        regShipPrefectureKana(CK_LT, fRES(shipPrefectureKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     * @param shipPrefectureKana The value of shipPrefectureKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefectureKana_GreaterEqual(String shipPrefectureKana) {
        regShipPrefectureKana(CK_GE, fRES(shipPrefectureKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     * @param shipPrefectureKana The value of shipPrefectureKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefectureKana_LessEqual(String shipPrefectureKana) {
        regShipPrefectureKana(CK_LE, fRES(shipPrefectureKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     * @param shipPrefectureKanaList The collection of shipPrefectureKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefectureKana_InScope(Collection<String> shipPrefectureKanaList) {
        doSetShipPrefectureKana_InScope(shipPrefectureKanaList);
    }

    protected void doSetShipPrefectureKana_InScope(Collection<String> shipPrefectureKanaList) {
        regINS(CK_INS, cTL(shipPrefectureKanaList), xgetCValueShipPrefectureKana(), "SHIP_PREFECTURE_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     * @param shipPrefectureKanaList The collection of shipPrefectureKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefectureKana_NotInScope(Collection<String> shipPrefectureKanaList) {
        doSetShipPrefectureKana_NotInScope(shipPrefectureKanaList);
    }

    protected void doSetShipPrefectureKana_NotInScope(Collection<String> shipPrefectureKanaList) {
        regINS(CK_NINS, cTL(shipPrefectureKanaList), xgetCValueShipPrefectureKana(), "SHIP_PREFECTURE_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)} <br>
     * <pre>e.g. setShipPrefectureKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipPrefectureKana The value of shipPrefectureKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipPrefectureKana_LikeSearch(String shipPrefectureKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipPrefectureKana), xgetCValueShipPrefectureKana(), "SHIP_PREFECTURE_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     * @param shipPrefectureKana The value of shipPrefectureKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipPrefectureKana_NotLikeSearch(String shipPrefectureKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipPrefectureKana), xgetCValueShipPrefectureKana(), "SHIP_PREFECTURE_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     * @param shipPrefectureKana The value of shipPrefectureKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPrefectureKana_PrefixSearch(String shipPrefectureKana) {
        setShipPrefectureKana_LikeSearch(shipPrefectureKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     */
    public void setShipPrefectureKana_IsNull() { regShipPrefectureKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     */
    public void setShipPrefectureKana_IsNullOrEmpty() { regShipPrefectureKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     */
    public void setShipPrefectureKana_IsNotNull() { regShipPrefectureKana(CK_ISNN, DOBJ); }

    protected void regShipPrefectureKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipPrefectureKana(), "SHIP_PREFECTURE_KANA"); }
    protected abstract ConditionValue xgetCValueShipPrefectureKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     * @param shipSection1Field The value of shipSection1Field as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Field_Equal(String shipSection1Field) {
        doSetShipSection1Field_Equal(fRES(shipSection1Field));
    }

    protected void doSetShipSection1Field_Equal(String shipSection1Field) {
        regShipSection1Field(CK_EQ, shipSection1Field);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     * @param shipSection1Field The value of shipSection1Field as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Field_NotEqual(String shipSection1Field) {
        doSetShipSection1Field_NotEqual(fRES(shipSection1Field));
    }

    protected void doSetShipSection1Field_NotEqual(String shipSection1Field) {
        regShipSection1Field(CK_NES, shipSection1Field);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     * @param shipSection1Field The value of shipSection1Field as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Field_GreaterThan(String shipSection1Field) {
        regShipSection1Field(CK_GT, fRES(shipSection1Field));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     * @param shipSection1Field The value of shipSection1Field as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Field_LessThan(String shipSection1Field) {
        regShipSection1Field(CK_LT, fRES(shipSection1Field));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     * @param shipSection1Field The value of shipSection1Field as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Field_GreaterEqual(String shipSection1Field) {
        regShipSection1Field(CK_GE, fRES(shipSection1Field));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     * @param shipSection1Field The value of shipSection1Field as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Field_LessEqual(String shipSection1Field) {
        regShipSection1Field(CK_LE, fRES(shipSection1Field));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     * @param shipSection1FieldList The collection of shipSection1Field as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Field_InScope(Collection<String> shipSection1FieldList) {
        doSetShipSection1Field_InScope(shipSection1FieldList);
    }

    protected void doSetShipSection1Field_InScope(Collection<String> shipSection1FieldList) {
        regINS(CK_INS, cTL(shipSection1FieldList), xgetCValueShipSection1Field(), "SHIP_SECTION1_FIELD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     * @param shipSection1FieldList The collection of shipSection1Field as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Field_NotInScope(Collection<String> shipSection1FieldList) {
        doSetShipSection1Field_NotInScope(shipSection1FieldList);
    }

    protected void doSetShipSection1Field_NotInScope(Collection<String> shipSection1FieldList) {
        regINS(CK_NINS, cTL(shipSection1FieldList), xgetCValueShipSection1Field(), "SHIP_SECTION1_FIELD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)} <br>
     * <pre>e.g. setShipSection1Field_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipSection1Field The value of shipSection1Field as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipSection1Field_LikeSearch(String shipSection1Field, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipSection1Field), xgetCValueShipSection1Field(), "SHIP_SECTION1_FIELD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     * @param shipSection1Field The value of shipSection1Field as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipSection1Field_NotLikeSearch(String shipSection1Field, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipSection1Field), xgetCValueShipSection1Field(), "SHIP_SECTION1_FIELD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     * @param shipSection1Field The value of shipSection1Field as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Field_PrefixSearch(String shipSection1Field) {
        setShipSection1Field_LikeSearch(shipSection1Field, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     */
    public void setShipSection1Field_IsNull() { regShipSection1Field(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     */
    public void setShipSection1Field_IsNullOrEmpty() { regShipSection1Field(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     */
    public void setShipSection1Field_IsNotNull() { regShipSection1Field(CK_ISNN, DOBJ); }

    protected void regShipSection1Field(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipSection1Field(), "SHIP_SECTION1_FIELD"); }
    protected abstract ConditionValue xgetCValueShipSection1Field();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     * @param shipSection1Value The value of shipSection1Value as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Value_Equal(String shipSection1Value) {
        doSetShipSection1Value_Equal(fRES(shipSection1Value));
    }

    protected void doSetShipSection1Value_Equal(String shipSection1Value) {
        regShipSection1Value(CK_EQ, shipSection1Value);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     * @param shipSection1Value The value of shipSection1Value as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Value_NotEqual(String shipSection1Value) {
        doSetShipSection1Value_NotEqual(fRES(shipSection1Value));
    }

    protected void doSetShipSection1Value_NotEqual(String shipSection1Value) {
        regShipSection1Value(CK_NES, shipSection1Value);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     * @param shipSection1Value The value of shipSection1Value as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Value_GreaterThan(String shipSection1Value) {
        regShipSection1Value(CK_GT, fRES(shipSection1Value));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     * @param shipSection1Value The value of shipSection1Value as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Value_LessThan(String shipSection1Value) {
        regShipSection1Value(CK_LT, fRES(shipSection1Value));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     * @param shipSection1Value The value of shipSection1Value as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Value_GreaterEqual(String shipSection1Value) {
        regShipSection1Value(CK_GE, fRES(shipSection1Value));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     * @param shipSection1Value The value of shipSection1Value as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Value_LessEqual(String shipSection1Value) {
        regShipSection1Value(CK_LE, fRES(shipSection1Value));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     * @param shipSection1ValueList The collection of shipSection1Value as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Value_InScope(Collection<String> shipSection1ValueList) {
        doSetShipSection1Value_InScope(shipSection1ValueList);
    }

    protected void doSetShipSection1Value_InScope(Collection<String> shipSection1ValueList) {
        regINS(CK_INS, cTL(shipSection1ValueList), xgetCValueShipSection1Value(), "SHIP_SECTION1_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     * @param shipSection1ValueList The collection of shipSection1Value as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Value_NotInScope(Collection<String> shipSection1ValueList) {
        doSetShipSection1Value_NotInScope(shipSection1ValueList);
    }

    protected void doSetShipSection1Value_NotInScope(Collection<String> shipSection1ValueList) {
        regINS(CK_NINS, cTL(shipSection1ValueList), xgetCValueShipSection1Value(), "SHIP_SECTION1_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)} <br>
     * <pre>e.g. setShipSection1Value_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipSection1Value The value of shipSection1Value as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipSection1Value_LikeSearch(String shipSection1Value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipSection1Value), xgetCValueShipSection1Value(), "SHIP_SECTION1_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     * @param shipSection1Value The value of shipSection1Value as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipSection1Value_NotLikeSearch(String shipSection1Value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipSection1Value), xgetCValueShipSection1Value(), "SHIP_SECTION1_VALUE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     * @param shipSection1Value The value of shipSection1Value as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection1Value_PrefixSearch(String shipSection1Value) {
        setShipSection1Value_LikeSearch(shipSection1Value, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     */
    public void setShipSection1Value_IsNull() { regShipSection1Value(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     */
    public void setShipSection1Value_IsNullOrEmpty() { regShipSection1Value(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     */
    public void setShipSection1Value_IsNotNull() { regShipSection1Value(CK_ISNN, DOBJ); }

    protected void regShipSection1Value(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipSection1Value(), "SHIP_SECTION1_VALUE"); }
    protected abstract ConditionValue xgetCValueShipSection1Value();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     * @param shipSection2Field The value of shipSection2Field as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Field_Equal(String shipSection2Field) {
        doSetShipSection2Field_Equal(fRES(shipSection2Field));
    }

    protected void doSetShipSection2Field_Equal(String shipSection2Field) {
        regShipSection2Field(CK_EQ, shipSection2Field);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     * @param shipSection2Field The value of shipSection2Field as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Field_NotEqual(String shipSection2Field) {
        doSetShipSection2Field_NotEqual(fRES(shipSection2Field));
    }

    protected void doSetShipSection2Field_NotEqual(String shipSection2Field) {
        regShipSection2Field(CK_NES, shipSection2Field);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     * @param shipSection2Field The value of shipSection2Field as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Field_GreaterThan(String shipSection2Field) {
        regShipSection2Field(CK_GT, fRES(shipSection2Field));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     * @param shipSection2Field The value of shipSection2Field as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Field_LessThan(String shipSection2Field) {
        regShipSection2Field(CK_LT, fRES(shipSection2Field));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     * @param shipSection2Field The value of shipSection2Field as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Field_GreaterEqual(String shipSection2Field) {
        regShipSection2Field(CK_GE, fRES(shipSection2Field));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     * @param shipSection2Field The value of shipSection2Field as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Field_LessEqual(String shipSection2Field) {
        regShipSection2Field(CK_LE, fRES(shipSection2Field));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     * @param shipSection2FieldList The collection of shipSection2Field as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Field_InScope(Collection<String> shipSection2FieldList) {
        doSetShipSection2Field_InScope(shipSection2FieldList);
    }

    protected void doSetShipSection2Field_InScope(Collection<String> shipSection2FieldList) {
        regINS(CK_INS, cTL(shipSection2FieldList), xgetCValueShipSection2Field(), "SHIP_SECTION2_FIELD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     * @param shipSection2FieldList The collection of shipSection2Field as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Field_NotInScope(Collection<String> shipSection2FieldList) {
        doSetShipSection2Field_NotInScope(shipSection2FieldList);
    }

    protected void doSetShipSection2Field_NotInScope(Collection<String> shipSection2FieldList) {
        regINS(CK_NINS, cTL(shipSection2FieldList), xgetCValueShipSection2Field(), "SHIP_SECTION2_FIELD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)} <br>
     * <pre>e.g. setShipSection2Field_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipSection2Field The value of shipSection2Field as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipSection2Field_LikeSearch(String shipSection2Field, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipSection2Field), xgetCValueShipSection2Field(), "SHIP_SECTION2_FIELD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     * @param shipSection2Field The value of shipSection2Field as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipSection2Field_NotLikeSearch(String shipSection2Field, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipSection2Field), xgetCValueShipSection2Field(), "SHIP_SECTION2_FIELD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     * @param shipSection2Field The value of shipSection2Field as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Field_PrefixSearch(String shipSection2Field) {
        setShipSection2Field_LikeSearch(shipSection2Field, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     */
    public void setShipSection2Field_IsNull() { regShipSection2Field(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     */
    public void setShipSection2Field_IsNullOrEmpty() { regShipSection2Field(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     */
    public void setShipSection2Field_IsNotNull() { regShipSection2Field(CK_ISNN, DOBJ); }

    protected void regShipSection2Field(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipSection2Field(), "SHIP_SECTION2_FIELD"); }
    protected abstract ConditionValue xgetCValueShipSection2Field();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     * @param shipSection2Value The value of shipSection2Value as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Value_Equal(String shipSection2Value) {
        doSetShipSection2Value_Equal(fRES(shipSection2Value));
    }

    protected void doSetShipSection2Value_Equal(String shipSection2Value) {
        regShipSection2Value(CK_EQ, shipSection2Value);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     * @param shipSection2Value The value of shipSection2Value as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Value_NotEqual(String shipSection2Value) {
        doSetShipSection2Value_NotEqual(fRES(shipSection2Value));
    }

    protected void doSetShipSection2Value_NotEqual(String shipSection2Value) {
        regShipSection2Value(CK_NES, shipSection2Value);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     * @param shipSection2Value The value of shipSection2Value as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Value_GreaterThan(String shipSection2Value) {
        regShipSection2Value(CK_GT, fRES(shipSection2Value));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     * @param shipSection2Value The value of shipSection2Value as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Value_LessThan(String shipSection2Value) {
        regShipSection2Value(CK_LT, fRES(shipSection2Value));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     * @param shipSection2Value The value of shipSection2Value as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Value_GreaterEqual(String shipSection2Value) {
        regShipSection2Value(CK_GE, fRES(shipSection2Value));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     * @param shipSection2Value The value of shipSection2Value as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Value_LessEqual(String shipSection2Value) {
        regShipSection2Value(CK_LE, fRES(shipSection2Value));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     * @param shipSection2ValueList The collection of shipSection2Value as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Value_InScope(Collection<String> shipSection2ValueList) {
        doSetShipSection2Value_InScope(shipSection2ValueList);
    }

    protected void doSetShipSection2Value_InScope(Collection<String> shipSection2ValueList) {
        regINS(CK_INS, cTL(shipSection2ValueList), xgetCValueShipSection2Value(), "SHIP_SECTION2_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     * @param shipSection2ValueList The collection of shipSection2Value as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Value_NotInScope(Collection<String> shipSection2ValueList) {
        doSetShipSection2Value_NotInScope(shipSection2ValueList);
    }

    protected void doSetShipSection2Value_NotInScope(Collection<String> shipSection2ValueList) {
        regINS(CK_NINS, cTL(shipSection2ValueList), xgetCValueShipSection2Value(), "SHIP_SECTION2_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)} <br>
     * <pre>e.g. setShipSection2Value_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipSection2Value The value of shipSection2Value as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipSection2Value_LikeSearch(String shipSection2Value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipSection2Value), xgetCValueShipSection2Value(), "SHIP_SECTION2_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     * @param shipSection2Value The value of shipSection2Value as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipSection2Value_NotLikeSearch(String shipSection2Value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipSection2Value), xgetCValueShipSection2Value(), "SHIP_SECTION2_VALUE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     * @param shipSection2Value The value of shipSection2Value as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipSection2Value_PrefixSearch(String shipSection2Value) {
        setShipSection2Value_LikeSearch(shipSection2Value, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     */
    public void setShipSection2Value_IsNull() { regShipSection2Value(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     */
    public void setShipSection2Value_IsNullOrEmpty() { regShipSection2Value(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     */
    public void setShipSection2Value_IsNotNull() { regShipSection2Value(CK_ISNN, DOBJ); }

    protected void regShipSection2Value(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipSection2Value(), "SHIP_SECTION2_VALUE"); }
    protected abstract ConditionValue xgetCValueShipSection2Value();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @param shipPhoneNumber The value of shipPhoneNumber as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPhoneNumber_Equal(String shipPhoneNumber) {
        doSetShipPhoneNumber_Equal(fRES(shipPhoneNumber));
    }

    protected void doSetShipPhoneNumber_Equal(String shipPhoneNumber) {
        regShipPhoneNumber(CK_EQ, shipPhoneNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @param shipPhoneNumber The value of shipPhoneNumber as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPhoneNumber_NotEqual(String shipPhoneNumber) {
        doSetShipPhoneNumber_NotEqual(fRES(shipPhoneNumber));
    }

    protected void doSetShipPhoneNumber_NotEqual(String shipPhoneNumber) {
        regShipPhoneNumber(CK_NES, shipPhoneNumber);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @param shipPhoneNumber The value of shipPhoneNumber as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPhoneNumber_GreaterThan(String shipPhoneNumber) {
        regShipPhoneNumber(CK_GT, fRES(shipPhoneNumber));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @param shipPhoneNumber The value of shipPhoneNumber as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPhoneNumber_LessThan(String shipPhoneNumber) {
        regShipPhoneNumber(CK_LT, fRES(shipPhoneNumber));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @param shipPhoneNumber The value of shipPhoneNumber as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPhoneNumber_GreaterEqual(String shipPhoneNumber) {
        regShipPhoneNumber(CK_GE, fRES(shipPhoneNumber));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @param shipPhoneNumber The value of shipPhoneNumber as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPhoneNumber_LessEqual(String shipPhoneNumber) {
        regShipPhoneNumber(CK_LE, fRES(shipPhoneNumber));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @param shipPhoneNumberList The collection of shipPhoneNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPhoneNumber_InScope(Collection<String> shipPhoneNumberList) {
        doSetShipPhoneNumber_InScope(shipPhoneNumberList);
    }

    protected void doSetShipPhoneNumber_InScope(Collection<String> shipPhoneNumberList) {
        regINS(CK_INS, cTL(shipPhoneNumberList), xgetCValueShipPhoneNumber(), "SHIP_PHONE_NUMBER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @param shipPhoneNumberList The collection of shipPhoneNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPhoneNumber_NotInScope(Collection<String> shipPhoneNumberList) {
        doSetShipPhoneNumber_NotInScope(shipPhoneNumberList);
    }

    protected void doSetShipPhoneNumber_NotInScope(Collection<String> shipPhoneNumberList) {
        regINS(CK_NINS, cTL(shipPhoneNumberList), xgetCValueShipPhoneNumber(), "SHIP_PHONE_NUMBER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)} <br>
     * <pre>e.g. setShipPhoneNumber_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipPhoneNumber The value of shipPhoneNumber as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipPhoneNumber_LikeSearch(String shipPhoneNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipPhoneNumber), xgetCValueShipPhoneNumber(), "SHIP_PHONE_NUMBER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @param shipPhoneNumber The value of shipPhoneNumber as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipPhoneNumber_NotLikeSearch(String shipPhoneNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipPhoneNumber), xgetCValueShipPhoneNumber(), "SHIP_PHONE_NUMBER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @param shipPhoneNumber The value of shipPhoneNumber as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPhoneNumber_PrefixSearch(String shipPhoneNumber) {
        setShipPhoneNumber_LikeSearch(shipPhoneNumber, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     */
    public void setShipPhoneNumber_IsNull() { regShipPhoneNumber(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     */
    public void setShipPhoneNumber_IsNullOrEmpty() { regShipPhoneNumber(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     */
    public void setShipPhoneNumber_IsNotNull() { regShipPhoneNumber(CK_ISNN, DOBJ); }

    protected void regShipPhoneNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipPhoneNumber(), "SHIP_PHONE_NUMBER"); }
    protected abstract ConditionValue xgetCValueShipPhoneNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     * @param shipEmgPhoneNumber The value of shipEmgPhoneNumber as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipEmgPhoneNumber_Equal(String shipEmgPhoneNumber) {
        doSetShipEmgPhoneNumber_Equal(fRES(shipEmgPhoneNumber));
    }

    protected void doSetShipEmgPhoneNumber_Equal(String shipEmgPhoneNumber) {
        regShipEmgPhoneNumber(CK_EQ, shipEmgPhoneNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     * @param shipEmgPhoneNumber The value of shipEmgPhoneNumber as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipEmgPhoneNumber_NotEqual(String shipEmgPhoneNumber) {
        doSetShipEmgPhoneNumber_NotEqual(fRES(shipEmgPhoneNumber));
    }

    protected void doSetShipEmgPhoneNumber_NotEqual(String shipEmgPhoneNumber) {
        regShipEmgPhoneNumber(CK_NES, shipEmgPhoneNumber);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     * @param shipEmgPhoneNumber The value of shipEmgPhoneNumber as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipEmgPhoneNumber_GreaterThan(String shipEmgPhoneNumber) {
        regShipEmgPhoneNumber(CK_GT, fRES(shipEmgPhoneNumber));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     * @param shipEmgPhoneNumber The value of shipEmgPhoneNumber as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipEmgPhoneNumber_LessThan(String shipEmgPhoneNumber) {
        regShipEmgPhoneNumber(CK_LT, fRES(shipEmgPhoneNumber));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     * @param shipEmgPhoneNumber The value of shipEmgPhoneNumber as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipEmgPhoneNumber_GreaterEqual(String shipEmgPhoneNumber) {
        regShipEmgPhoneNumber(CK_GE, fRES(shipEmgPhoneNumber));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     * @param shipEmgPhoneNumber The value of shipEmgPhoneNumber as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipEmgPhoneNumber_LessEqual(String shipEmgPhoneNumber) {
        regShipEmgPhoneNumber(CK_LE, fRES(shipEmgPhoneNumber));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     * @param shipEmgPhoneNumberList The collection of shipEmgPhoneNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipEmgPhoneNumber_InScope(Collection<String> shipEmgPhoneNumberList) {
        doSetShipEmgPhoneNumber_InScope(shipEmgPhoneNumberList);
    }

    protected void doSetShipEmgPhoneNumber_InScope(Collection<String> shipEmgPhoneNumberList) {
        regINS(CK_INS, cTL(shipEmgPhoneNumberList), xgetCValueShipEmgPhoneNumber(), "SHIP_EMG_PHONE_NUMBER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     * @param shipEmgPhoneNumberList The collection of shipEmgPhoneNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipEmgPhoneNumber_NotInScope(Collection<String> shipEmgPhoneNumberList) {
        doSetShipEmgPhoneNumber_NotInScope(shipEmgPhoneNumberList);
    }

    protected void doSetShipEmgPhoneNumber_NotInScope(Collection<String> shipEmgPhoneNumberList) {
        regINS(CK_NINS, cTL(shipEmgPhoneNumberList), xgetCValueShipEmgPhoneNumber(), "SHIP_EMG_PHONE_NUMBER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)} <br>
     * <pre>e.g. setShipEmgPhoneNumber_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipEmgPhoneNumber The value of shipEmgPhoneNumber as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipEmgPhoneNumber_LikeSearch(String shipEmgPhoneNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipEmgPhoneNumber), xgetCValueShipEmgPhoneNumber(), "SHIP_EMG_PHONE_NUMBER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     * @param shipEmgPhoneNumber The value of shipEmgPhoneNumber as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipEmgPhoneNumber_NotLikeSearch(String shipEmgPhoneNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipEmgPhoneNumber), xgetCValueShipEmgPhoneNumber(), "SHIP_EMG_PHONE_NUMBER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     * @param shipEmgPhoneNumber The value of shipEmgPhoneNumber as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipEmgPhoneNumber_PrefixSearch(String shipEmgPhoneNumber) {
        setShipEmgPhoneNumber_LikeSearch(shipEmgPhoneNumber, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     */
    public void setShipEmgPhoneNumber_IsNull() { regShipEmgPhoneNumber(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     */
    public void setShipEmgPhoneNumber_IsNullOrEmpty() { regShipEmgPhoneNumber(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     */
    public void setShipEmgPhoneNumber_IsNotNull() { regShipEmgPhoneNumber(CK_ISNN, DOBJ); }

    protected void regShipEmgPhoneNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipEmgPhoneNumber(), "SHIP_EMG_PHONE_NUMBER"); }
    protected abstract ConditionValue xgetCValueShipEmgPhoneNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_METHOD: {varchar(60)}
     * @param shipMethod The value of shipMethod as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethod_Equal(String shipMethod) {
        doSetShipMethod_Equal(fRES(shipMethod));
    }

    protected void doSetShipMethod_Equal(String shipMethod) {
        regShipMethod(CK_EQ, shipMethod);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_METHOD: {varchar(60)}
     * @param shipMethod The value of shipMethod as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethod_NotEqual(String shipMethod) {
        doSetShipMethod_NotEqual(fRES(shipMethod));
    }

    protected void doSetShipMethod_NotEqual(String shipMethod) {
        regShipMethod(CK_NES, shipMethod);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_METHOD: {varchar(60)}
     * @param shipMethod The value of shipMethod as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethod_GreaterThan(String shipMethod) {
        regShipMethod(CK_GT, fRES(shipMethod));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_METHOD: {varchar(60)}
     * @param shipMethod The value of shipMethod as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethod_LessThan(String shipMethod) {
        regShipMethod(CK_LT, fRES(shipMethod));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_METHOD: {varchar(60)}
     * @param shipMethod The value of shipMethod as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethod_GreaterEqual(String shipMethod) {
        regShipMethod(CK_GE, fRES(shipMethod));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_METHOD: {varchar(60)}
     * @param shipMethod The value of shipMethod as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethod_LessEqual(String shipMethod) {
        regShipMethod(CK_LE, fRES(shipMethod));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_METHOD: {varchar(60)}
     * @param shipMethodList The collection of shipMethod as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethod_InScope(Collection<String> shipMethodList) {
        doSetShipMethod_InScope(shipMethodList);
    }

    protected void doSetShipMethod_InScope(Collection<String> shipMethodList) {
        regINS(CK_INS, cTL(shipMethodList), xgetCValueShipMethod(), "SHIP_METHOD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_METHOD: {varchar(60)}
     * @param shipMethodList The collection of shipMethod as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethod_NotInScope(Collection<String> shipMethodList) {
        doSetShipMethod_NotInScope(shipMethodList);
    }

    protected void doSetShipMethod_NotInScope(Collection<String> shipMethodList) {
        regINS(CK_NINS, cTL(shipMethodList), xgetCValueShipMethod(), "SHIP_METHOD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_METHOD: {varchar(60)} <br>
     * <pre>e.g. setShipMethod_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipMethod The value of shipMethod as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipMethod_LikeSearch(String shipMethod, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipMethod), xgetCValueShipMethod(), "SHIP_METHOD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_METHOD: {varchar(60)}
     * @param shipMethod The value of shipMethod as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipMethod_NotLikeSearch(String shipMethod, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipMethod), xgetCValueShipMethod(), "SHIP_METHOD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_METHOD: {varchar(60)}
     * @param shipMethod The value of shipMethod as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethod_PrefixSearch(String shipMethod) {
        setShipMethod_LikeSearch(shipMethod, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_METHOD: {varchar(60)}
     */
    public void setShipMethod_IsNull() { regShipMethod(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_METHOD: {varchar(60)}
     */
    public void setShipMethod_IsNullOrEmpty() { regShipMethod(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_METHOD: {varchar(60)}
     */
    public void setShipMethod_IsNotNull() { regShipMethod(CK_ISNN, DOBJ); }

    protected void regShipMethod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipMethod(), "SHIP_METHOD"); }
    protected abstract ConditionValue xgetCValueShipMethod();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     * @param shipMethodName The value of shipMethodName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethodName_Equal(String shipMethodName) {
        doSetShipMethodName_Equal(fRES(shipMethodName));
    }

    protected void doSetShipMethodName_Equal(String shipMethodName) {
        regShipMethodName(CK_EQ, shipMethodName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     * @param shipMethodName The value of shipMethodName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethodName_NotEqual(String shipMethodName) {
        doSetShipMethodName_NotEqual(fRES(shipMethodName));
    }

    protected void doSetShipMethodName_NotEqual(String shipMethodName) {
        regShipMethodName(CK_NES, shipMethodName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     * @param shipMethodName The value of shipMethodName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethodName_GreaterThan(String shipMethodName) {
        regShipMethodName(CK_GT, fRES(shipMethodName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     * @param shipMethodName The value of shipMethodName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethodName_LessThan(String shipMethodName) {
        regShipMethodName(CK_LT, fRES(shipMethodName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     * @param shipMethodName The value of shipMethodName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethodName_GreaterEqual(String shipMethodName) {
        regShipMethodName(CK_GE, fRES(shipMethodName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     * @param shipMethodName The value of shipMethodName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethodName_LessEqual(String shipMethodName) {
        regShipMethodName(CK_LE, fRES(shipMethodName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     * @param shipMethodNameList The collection of shipMethodName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethodName_InScope(Collection<String> shipMethodNameList) {
        doSetShipMethodName_InScope(shipMethodNameList);
    }

    protected void doSetShipMethodName_InScope(Collection<String> shipMethodNameList) {
        regINS(CK_INS, cTL(shipMethodNameList), xgetCValueShipMethodName(), "SHIP_METHOD_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     * @param shipMethodNameList The collection of shipMethodName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethodName_NotInScope(Collection<String> shipMethodNameList) {
        doSetShipMethodName_NotInScope(shipMethodNameList);
    }

    protected void doSetShipMethodName_NotInScope(Collection<String> shipMethodNameList) {
        regINS(CK_NINS, cTL(shipMethodNameList), xgetCValueShipMethodName(), "SHIP_METHOD_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_METHOD_NAME: {varchar(60)} <br>
     * <pre>e.g. setShipMethodName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipMethodName The value of shipMethodName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipMethodName_LikeSearch(String shipMethodName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipMethodName), xgetCValueShipMethodName(), "SHIP_METHOD_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     * @param shipMethodName The value of shipMethodName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipMethodName_NotLikeSearch(String shipMethodName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipMethodName), xgetCValueShipMethodName(), "SHIP_METHOD_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     * @param shipMethodName The value of shipMethodName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipMethodName_PrefixSearch(String shipMethodName) {
        setShipMethodName_LikeSearch(shipMethodName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     */
    public void setShipMethodName_IsNull() { regShipMethodName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     */
    public void setShipMethodName_IsNullOrEmpty() { regShipMethodName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     */
    public void setShipMethodName_IsNotNull() { regShipMethodName(CK_ISNN, DOBJ); }

    protected void regShipMethodName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipMethodName(), "SHIP_METHOD_NAME"); }
    protected abstract ConditionValue xgetCValueShipMethodName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     * @param shipRequestDate The value of shipRequestDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestDate_Equal(String shipRequestDate) {
        doSetShipRequestDate_Equal(fRES(shipRequestDate));
    }

    protected void doSetShipRequestDate_Equal(String shipRequestDate) {
        regShipRequestDate(CK_EQ, shipRequestDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     * @param shipRequestDate The value of shipRequestDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestDate_NotEqual(String shipRequestDate) {
        doSetShipRequestDate_NotEqual(fRES(shipRequestDate));
    }

    protected void doSetShipRequestDate_NotEqual(String shipRequestDate) {
        regShipRequestDate(CK_NES, shipRequestDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     * @param shipRequestDate The value of shipRequestDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestDate_GreaterThan(String shipRequestDate) {
        regShipRequestDate(CK_GT, fRES(shipRequestDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     * @param shipRequestDate The value of shipRequestDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestDate_LessThan(String shipRequestDate) {
        regShipRequestDate(CK_LT, fRES(shipRequestDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     * @param shipRequestDate The value of shipRequestDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestDate_GreaterEqual(String shipRequestDate) {
        regShipRequestDate(CK_GE, fRES(shipRequestDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     * @param shipRequestDate The value of shipRequestDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestDate_LessEqual(String shipRequestDate) {
        regShipRequestDate(CK_LE, fRES(shipRequestDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     * @param shipRequestDateList The collection of shipRequestDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestDate_InScope(Collection<String> shipRequestDateList) {
        doSetShipRequestDate_InScope(shipRequestDateList);
    }

    protected void doSetShipRequestDate_InScope(Collection<String> shipRequestDateList) {
        regINS(CK_INS, cTL(shipRequestDateList), xgetCValueShipRequestDate(), "SHIP_REQUEST_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     * @param shipRequestDateList The collection of shipRequestDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestDate_NotInScope(Collection<String> shipRequestDateList) {
        doSetShipRequestDate_NotInScope(shipRequestDateList);
    }

    protected void doSetShipRequestDate_NotInScope(Collection<String> shipRequestDateList) {
        regINS(CK_NINS, cTL(shipRequestDateList), xgetCValueShipRequestDate(), "SHIP_REQUEST_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_REQUEST_DATE: {varchar(60)} <br>
     * <pre>e.g. setShipRequestDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipRequestDate The value of shipRequestDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipRequestDate_LikeSearch(String shipRequestDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipRequestDate), xgetCValueShipRequestDate(), "SHIP_REQUEST_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     * @param shipRequestDate The value of shipRequestDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipRequestDate_NotLikeSearch(String shipRequestDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipRequestDate), xgetCValueShipRequestDate(), "SHIP_REQUEST_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     * @param shipRequestDate The value of shipRequestDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestDate_PrefixSearch(String shipRequestDate) {
        setShipRequestDate_LikeSearch(shipRequestDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     */
    public void setShipRequestDate_IsNull() { regShipRequestDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     */
    public void setShipRequestDate_IsNullOrEmpty() { regShipRequestDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     */
    public void setShipRequestDate_IsNotNull() { regShipRequestDate(CK_ISNN, DOBJ); }

    protected void regShipRequestDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipRequestDate(), "SHIP_REQUEST_DATE"); }
    protected abstract ConditionValue xgetCValueShipRequestDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     * @param shipRequestTime The value of shipRequestTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestTime_Equal(String shipRequestTime) {
        doSetShipRequestTime_Equal(fRES(shipRequestTime));
    }

    protected void doSetShipRequestTime_Equal(String shipRequestTime) {
        regShipRequestTime(CK_EQ, shipRequestTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     * @param shipRequestTime The value of shipRequestTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestTime_NotEqual(String shipRequestTime) {
        doSetShipRequestTime_NotEqual(fRES(shipRequestTime));
    }

    protected void doSetShipRequestTime_NotEqual(String shipRequestTime) {
        regShipRequestTime(CK_NES, shipRequestTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     * @param shipRequestTime The value of shipRequestTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestTime_GreaterThan(String shipRequestTime) {
        regShipRequestTime(CK_GT, fRES(shipRequestTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     * @param shipRequestTime The value of shipRequestTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestTime_LessThan(String shipRequestTime) {
        regShipRequestTime(CK_LT, fRES(shipRequestTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     * @param shipRequestTime The value of shipRequestTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestTime_GreaterEqual(String shipRequestTime) {
        regShipRequestTime(CK_GE, fRES(shipRequestTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     * @param shipRequestTime The value of shipRequestTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestTime_LessEqual(String shipRequestTime) {
        regShipRequestTime(CK_LE, fRES(shipRequestTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     * @param shipRequestTimeList The collection of shipRequestTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestTime_InScope(Collection<String> shipRequestTimeList) {
        doSetShipRequestTime_InScope(shipRequestTimeList);
    }

    protected void doSetShipRequestTime_InScope(Collection<String> shipRequestTimeList) {
        regINS(CK_INS, cTL(shipRequestTimeList), xgetCValueShipRequestTime(), "SHIP_REQUEST_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     * @param shipRequestTimeList The collection of shipRequestTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestTime_NotInScope(Collection<String> shipRequestTimeList) {
        doSetShipRequestTime_NotInScope(shipRequestTimeList);
    }

    protected void doSetShipRequestTime_NotInScope(Collection<String> shipRequestTimeList) {
        regINS(CK_NINS, cTL(shipRequestTimeList), xgetCValueShipRequestTime(), "SHIP_REQUEST_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_REQUEST_TIME: {varchar(60)} <br>
     * <pre>e.g. setShipRequestTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipRequestTime The value of shipRequestTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipRequestTime_LikeSearch(String shipRequestTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipRequestTime), xgetCValueShipRequestTime(), "SHIP_REQUEST_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     * @param shipRequestTime The value of shipRequestTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipRequestTime_NotLikeSearch(String shipRequestTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipRequestTime), xgetCValueShipRequestTime(), "SHIP_REQUEST_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     * @param shipRequestTime The value of shipRequestTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipRequestTime_PrefixSearch(String shipRequestTime) {
        setShipRequestTime_LikeSearch(shipRequestTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     */
    public void setShipRequestTime_IsNull() { regShipRequestTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     */
    public void setShipRequestTime_IsNullOrEmpty() { regShipRequestTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     */
    public void setShipRequestTime_IsNotNull() { regShipRequestTime(CK_ISNN, DOBJ); }

    protected void regShipRequestTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipRequestTime(), "SHIP_REQUEST_TIME"); }
    protected abstract ConditionValue xgetCValueShipRequestTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NOTES: {varchar(60)}
     * @param shipNotes The value of shipNotes as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNotes_Equal(String shipNotes) {
        doSetShipNotes_Equal(fRES(shipNotes));
    }

    protected void doSetShipNotes_Equal(String shipNotes) {
        regShipNotes(CK_EQ, shipNotes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NOTES: {varchar(60)}
     * @param shipNotes The value of shipNotes as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNotes_NotEqual(String shipNotes) {
        doSetShipNotes_NotEqual(fRES(shipNotes));
    }

    protected void doSetShipNotes_NotEqual(String shipNotes) {
        regShipNotes(CK_NES, shipNotes);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NOTES: {varchar(60)}
     * @param shipNotes The value of shipNotes as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNotes_GreaterThan(String shipNotes) {
        regShipNotes(CK_GT, fRES(shipNotes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NOTES: {varchar(60)}
     * @param shipNotes The value of shipNotes as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNotes_LessThan(String shipNotes) {
        regShipNotes(CK_LT, fRES(shipNotes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NOTES: {varchar(60)}
     * @param shipNotes The value of shipNotes as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNotes_GreaterEqual(String shipNotes) {
        regShipNotes(CK_GE, fRES(shipNotes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NOTES: {varchar(60)}
     * @param shipNotes The value of shipNotes as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNotes_LessEqual(String shipNotes) {
        regShipNotes(CK_LE, fRES(shipNotes));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_NOTES: {varchar(60)}
     * @param shipNotesList The collection of shipNotes as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNotes_InScope(Collection<String> shipNotesList) {
        doSetShipNotes_InScope(shipNotesList);
    }

    protected void doSetShipNotes_InScope(Collection<String> shipNotesList) {
        regINS(CK_INS, cTL(shipNotesList), xgetCValueShipNotes(), "SHIP_NOTES");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_NOTES: {varchar(60)}
     * @param shipNotesList The collection of shipNotes as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNotes_NotInScope(Collection<String> shipNotesList) {
        doSetShipNotes_NotInScope(shipNotesList);
    }

    protected void doSetShipNotes_NotInScope(Collection<String> shipNotesList) {
        regINS(CK_NINS, cTL(shipNotesList), xgetCValueShipNotes(), "SHIP_NOTES");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_NOTES: {varchar(60)} <br>
     * <pre>e.g. setShipNotes_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipNotes The value of shipNotes as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipNotes_LikeSearch(String shipNotes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipNotes), xgetCValueShipNotes(), "SHIP_NOTES", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_NOTES: {varchar(60)}
     * @param shipNotes The value of shipNotes as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipNotes_NotLikeSearch(String shipNotes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipNotes), xgetCValueShipNotes(), "SHIP_NOTES", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_NOTES: {varchar(60)}
     * @param shipNotes The value of shipNotes as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipNotes_PrefixSearch(String shipNotes) {
        setShipNotes_LikeSearch(shipNotes, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_NOTES: {varchar(60)}
     */
    public void setShipNotes_IsNull() { regShipNotes(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_NOTES: {varchar(60)}
     */
    public void setShipNotes_IsNullOrEmpty() { regShipNotes(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_NOTES: {varchar(60)}
     */
    public void setShipNotes_IsNotNull() { regShipNotes(CK_ISNN, DOBJ); }

    protected void regShipNotes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipNotes(), "SHIP_NOTES"); }
    protected abstract ConditionValue xgetCValueShipNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVE_TYPE: {varchar(60)}
     * @param arriveType The value of arriveType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArriveType_Equal(String arriveType) {
        doSetArriveType_Equal(fRES(arriveType));
    }

    protected void doSetArriveType_Equal(String arriveType) {
        regArriveType(CK_EQ, arriveType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVE_TYPE: {varchar(60)}
     * @param arriveType The value of arriveType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArriveType_NotEqual(String arriveType) {
        doSetArriveType_NotEqual(fRES(arriveType));
    }

    protected void doSetArriveType_NotEqual(String arriveType) {
        regArriveType(CK_NES, arriveType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVE_TYPE: {varchar(60)}
     * @param arriveType The value of arriveType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArriveType_GreaterThan(String arriveType) {
        regArriveType(CK_GT, fRES(arriveType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVE_TYPE: {varchar(60)}
     * @param arriveType The value of arriveType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArriveType_LessThan(String arriveType) {
        regArriveType(CK_LT, fRES(arriveType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVE_TYPE: {varchar(60)}
     * @param arriveType The value of arriveType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArriveType_GreaterEqual(String arriveType) {
        regArriveType(CK_GE, fRES(arriveType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVE_TYPE: {varchar(60)}
     * @param arriveType The value of arriveType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArriveType_LessEqual(String arriveType) {
        regArriveType(CK_LE, fRES(arriveType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVE_TYPE: {varchar(60)}
     * @param arriveTypeList The collection of arriveType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArriveType_InScope(Collection<String> arriveTypeList) {
        doSetArriveType_InScope(arriveTypeList);
    }

    protected void doSetArriveType_InScope(Collection<String> arriveTypeList) {
        regINS(CK_INS, cTL(arriveTypeList), xgetCValueArriveType(), "ARRIVE_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVE_TYPE: {varchar(60)}
     * @param arriveTypeList The collection of arriveType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArriveType_NotInScope(Collection<String> arriveTypeList) {
        doSetArriveType_NotInScope(arriveTypeList);
    }

    protected void doSetArriveType_NotInScope(Collection<String> arriveTypeList) {
        regINS(CK_NINS, cTL(arriveTypeList), xgetCValueArriveType(), "ARRIVE_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVE_TYPE: {varchar(60)} <br>
     * <pre>e.g. setArriveType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param arriveType The value of arriveType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArriveType_LikeSearch(String arriveType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(arriveType), xgetCValueArriveType(), "ARRIVE_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVE_TYPE: {varchar(60)}
     * @param arriveType The value of arriveType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArriveType_NotLikeSearch(String arriveType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(arriveType), xgetCValueArriveType(), "ARRIVE_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVE_TYPE: {varchar(60)}
     * @param arriveType The value of arriveType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArriveType_PrefixSearch(String arriveType) {
        setArriveType_LikeSearch(arriveType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARRIVE_TYPE: {varchar(60)}
     */
    public void setArriveType_IsNull() { regArriveType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARRIVE_TYPE: {varchar(60)}
     */
    public void setArriveType_IsNullOrEmpty() { regArriveType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARRIVE_TYPE: {varchar(60)}
     */
    public void setArriveType_IsNotNull() { regArriveType(CK_ISNN, DOBJ); }

    protected void regArriveType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArriveType(), "ARRIVE_TYPE"); }
    protected abstract ConditionValue xgetCValueArriveType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     * @param shipInvoiceNumber1 The value of shipInvoiceNumber1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber1_Equal(String shipInvoiceNumber1) {
        doSetShipInvoiceNumber1_Equal(fRES(shipInvoiceNumber1));
    }

    protected void doSetShipInvoiceNumber1_Equal(String shipInvoiceNumber1) {
        regShipInvoiceNumber1(CK_EQ, shipInvoiceNumber1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     * @param shipInvoiceNumber1 The value of shipInvoiceNumber1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber1_NotEqual(String shipInvoiceNumber1) {
        doSetShipInvoiceNumber1_NotEqual(fRES(shipInvoiceNumber1));
    }

    protected void doSetShipInvoiceNumber1_NotEqual(String shipInvoiceNumber1) {
        regShipInvoiceNumber1(CK_NES, shipInvoiceNumber1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     * @param shipInvoiceNumber1 The value of shipInvoiceNumber1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber1_GreaterThan(String shipInvoiceNumber1) {
        regShipInvoiceNumber1(CK_GT, fRES(shipInvoiceNumber1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     * @param shipInvoiceNumber1 The value of shipInvoiceNumber1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber1_LessThan(String shipInvoiceNumber1) {
        regShipInvoiceNumber1(CK_LT, fRES(shipInvoiceNumber1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     * @param shipInvoiceNumber1 The value of shipInvoiceNumber1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber1_GreaterEqual(String shipInvoiceNumber1) {
        regShipInvoiceNumber1(CK_GE, fRES(shipInvoiceNumber1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     * @param shipInvoiceNumber1 The value of shipInvoiceNumber1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber1_LessEqual(String shipInvoiceNumber1) {
        regShipInvoiceNumber1(CK_LE, fRES(shipInvoiceNumber1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     * @param shipInvoiceNumber1List The collection of shipInvoiceNumber1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber1_InScope(Collection<String> shipInvoiceNumber1List) {
        doSetShipInvoiceNumber1_InScope(shipInvoiceNumber1List);
    }

    protected void doSetShipInvoiceNumber1_InScope(Collection<String> shipInvoiceNumber1List) {
        regINS(CK_INS, cTL(shipInvoiceNumber1List), xgetCValueShipInvoiceNumber1(), "SHIP_INVOICE_NUMBER1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     * @param shipInvoiceNumber1List The collection of shipInvoiceNumber1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber1_NotInScope(Collection<String> shipInvoiceNumber1List) {
        doSetShipInvoiceNumber1_NotInScope(shipInvoiceNumber1List);
    }

    protected void doSetShipInvoiceNumber1_NotInScope(Collection<String> shipInvoiceNumber1List) {
        regINS(CK_NINS, cTL(shipInvoiceNumber1List), xgetCValueShipInvoiceNumber1(), "SHIP_INVOICE_NUMBER1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)} <br>
     * <pre>e.g. setShipInvoiceNumber1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipInvoiceNumber1 The value of shipInvoiceNumber1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipInvoiceNumber1_LikeSearch(String shipInvoiceNumber1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipInvoiceNumber1), xgetCValueShipInvoiceNumber1(), "SHIP_INVOICE_NUMBER1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     * @param shipInvoiceNumber1 The value of shipInvoiceNumber1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipInvoiceNumber1_NotLikeSearch(String shipInvoiceNumber1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipInvoiceNumber1), xgetCValueShipInvoiceNumber1(), "SHIP_INVOICE_NUMBER1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     * @param shipInvoiceNumber1 The value of shipInvoiceNumber1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber1_PrefixSearch(String shipInvoiceNumber1) {
        setShipInvoiceNumber1_LikeSearch(shipInvoiceNumber1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     */
    public void setShipInvoiceNumber1_IsNull() { regShipInvoiceNumber1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     */
    public void setShipInvoiceNumber1_IsNullOrEmpty() { regShipInvoiceNumber1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     */
    public void setShipInvoiceNumber1_IsNotNull() { regShipInvoiceNumber1(CK_ISNN, DOBJ); }

    protected void regShipInvoiceNumber1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipInvoiceNumber1(), "SHIP_INVOICE_NUMBER1"); }
    protected abstract ConditionValue xgetCValueShipInvoiceNumber1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     * @param shipInvoiceNumber2 The value of shipInvoiceNumber2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber2_Equal(String shipInvoiceNumber2) {
        doSetShipInvoiceNumber2_Equal(fRES(shipInvoiceNumber2));
    }

    protected void doSetShipInvoiceNumber2_Equal(String shipInvoiceNumber2) {
        regShipInvoiceNumber2(CK_EQ, shipInvoiceNumber2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     * @param shipInvoiceNumber2 The value of shipInvoiceNumber2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber2_NotEqual(String shipInvoiceNumber2) {
        doSetShipInvoiceNumber2_NotEqual(fRES(shipInvoiceNumber2));
    }

    protected void doSetShipInvoiceNumber2_NotEqual(String shipInvoiceNumber2) {
        regShipInvoiceNumber2(CK_NES, shipInvoiceNumber2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     * @param shipInvoiceNumber2 The value of shipInvoiceNumber2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber2_GreaterThan(String shipInvoiceNumber2) {
        regShipInvoiceNumber2(CK_GT, fRES(shipInvoiceNumber2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     * @param shipInvoiceNumber2 The value of shipInvoiceNumber2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber2_LessThan(String shipInvoiceNumber2) {
        regShipInvoiceNumber2(CK_LT, fRES(shipInvoiceNumber2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     * @param shipInvoiceNumber2 The value of shipInvoiceNumber2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber2_GreaterEqual(String shipInvoiceNumber2) {
        regShipInvoiceNumber2(CK_GE, fRES(shipInvoiceNumber2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     * @param shipInvoiceNumber2 The value of shipInvoiceNumber2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber2_LessEqual(String shipInvoiceNumber2) {
        regShipInvoiceNumber2(CK_LE, fRES(shipInvoiceNumber2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     * @param shipInvoiceNumber2List The collection of shipInvoiceNumber2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber2_InScope(Collection<String> shipInvoiceNumber2List) {
        doSetShipInvoiceNumber2_InScope(shipInvoiceNumber2List);
    }

    protected void doSetShipInvoiceNumber2_InScope(Collection<String> shipInvoiceNumber2List) {
        regINS(CK_INS, cTL(shipInvoiceNumber2List), xgetCValueShipInvoiceNumber2(), "SHIP_INVOICE_NUMBER2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     * @param shipInvoiceNumber2List The collection of shipInvoiceNumber2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber2_NotInScope(Collection<String> shipInvoiceNumber2List) {
        doSetShipInvoiceNumber2_NotInScope(shipInvoiceNumber2List);
    }

    protected void doSetShipInvoiceNumber2_NotInScope(Collection<String> shipInvoiceNumber2List) {
        regINS(CK_NINS, cTL(shipInvoiceNumber2List), xgetCValueShipInvoiceNumber2(), "SHIP_INVOICE_NUMBER2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)} <br>
     * <pre>e.g. setShipInvoiceNumber2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipInvoiceNumber2 The value of shipInvoiceNumber2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipInvoiceNumber2_LikeSearch(String shipInvoiceNumber2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipInvoiceNumber2), xgetCValueShipInvoiceNumber2(), "SHIP_INVOICE_NUMBER2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     * @param shipInvoiceNumber2 The value of shipInvoiceNumber2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipInvoiceNumber2_NotLikeSearch(String shipInvoiceNumber2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipInvoiceNumber2), xgetCValueShipInvoiceNumber2(), "SHIP_INVOICE_NUMBER2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     * @param shipInvoiceNumber2 The value of shipInvoiceNumber2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipInvoiceNumber2_PrefixSearch(String shipInvoiceNumber2) {
        setShipInvoiceNumber2_LikeSearch(shipInvoiceNumber2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     */
    public void setShipInvoiceNumber2_IsNull() { regShipInvoiceNumber2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     */
    public void setShipInvoiceNumber2_IsNullOrEmpty() { regShipInvoiceNumber2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     */
    public void setShipInvoiceNumber2_IsNotNull() { regShipInvoiceNumber2(CK_ISNN, DOBJ); }

    protected void regShipInvoiceNumber2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipInvoiceNumber2(), "SHIP_INVOICE_NUMBER2"); }
    protected abstract ConditionValue xgetCValueShipInvoiceNumber2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_URL: {varchar(60)}
     * @param shipUrl The value of shipUrl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipUrl_Equal(String shipUrl) {
        doSetShipUrl_Equal(fRES(shipUrl));
    }

    protected void doSetShipUrl_Equal(String shipUrl) {
        regShipUrl(CK_EQ, shipUrl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_URL: {varchar(60)}
     * @param shipUrl The value of shipUrl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipUrl_NotEqual(String shipUrl) {
        doSetShipUrl_NotEqual(fRES(shipUrl));
    }

    protected void doSetShipUrl_NotEqual(String shipUrl) {
        regShipUrl(CK_NES, shipUrl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_URL: {varchar(60)}
     * @param shipUrl The value of shipUrl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipUrl_GreaterThan(String shipUrl) {
        regShipUrl(CK_GT, fRES(shipUrl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_URL: {varchar(60)}
     * @param shipUrl The value of shipUrl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipUrl_LessThan(String shipUrl) {
        regShipUrl(CK_LT, fRES(shipUrl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_URL: {varchar(60)}
     * @param shipUrl The value of shipUrl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipUrl_GreaterEqual(String shipUrl) {
        regShipUrl(CK_GE, fRES(shipUrl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_URL: {varchar(60)}
     * @param shipUrl The value of shipUrl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipUrl_LessEqual(String shipUrl) {
        regShipUrl(CK_LE, fRES(shipUrl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_URL: {varchar(60)}
     * @param shipUrlList The collection of shipUrl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipUrl_InScope(Collection<String> shipUrlList) {
        doSetShipUrl_InScope(shipUrlList);
    }

    protected void doSetShipUrl_InScope(Collection<String> shipUrlList) {
        regINS(CK_INS, cTL(shipUrlList), xgetCValueShipUrl(), "SHIP_URL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_URL: {varchar(60)}
     * @param shipUrlList The collection of shipUrl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipUrl_NotInScope(Collection<String> shipUrlList) {
        doSetShipUrl_NotInScope(shipUrlList);
    }

    protected void doSetShipUrl_NotInScope(Collection<String> shipUrlList) {
        regINS(CK_NINS, cTL(shipUrlList), xgetCValueShipUrl(), "SHIP_URL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_URL: {varchar(60)} <br>
     * <pre>e.g. setShipUrl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipUrl The value of shipUrl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipUrl_LikeSearch(String shipUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipUrl), xgetCValueShipUrl(), "SHIP_URL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_URL: {varchar(60)}
     * @param shipUrl The value of shipUrl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipUrl_NotLikeSearch(String shipUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipUrl), xgetCValueShipUrl(), "SHIP_URL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_URL: {varchar(60)}
     * @param shipUrl The value of shipUrl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipUrl_PrefixSearch(String shipUrl) {
        setShipUrl_LikeSearch(shipUrl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_URL: {varchar(60)}
     */
    public void setShipUrl_IsNull() { regShipUrl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_URL: {varchar(60)}
     */
    public void setShipUrl_IsNullOrEmpty() { regShipUrl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_URL: {varchar(60)}
     */
    public void setShipUrl_IsNotNull() { regShipUrl(CK_ISNN, DOBJ); }

    protected void regShipUrl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipUrl(), "SHIP_URL"); }
    protected abstract ConditionValue xgetCValueShipUrl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(30)}
     * @param shipDate The value of shipDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_Equal(String shipDate) {
        doSetShipDate_Equal(fRES(shipDate));
    }

    protected void doSetShipDate_Equal(String shipDate) {
        regShipDate(CK_EQ, shipDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(30)}
     * @param shipDate The value of shipDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_NotEqual(String shipDate) {
        doSetShipDate_NotEqual(fRES(shipDate));
    }

    protected void doSetShipDate_NotEqual(String shipDate) {
        regShipDate(CK_NES, shipDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(30)}
     * @param shipDate The value of shipDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_GreaterThan(String shipDate) {
        regShipDate(CK_GT, fRES(shipDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(30)}
     * @param shipDate The value of shipDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_LessThan(String shipDate) {
        regShipDate(CK_LT, fRES(shipDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(30)}
     * @param shipDate The value of shipDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_GreaterEqual(String shipDate) {
        regShipDate(CK_GE, fRES(shipDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(30)}
     * @param shipDate The value of shipDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_LessEqual(String shipDate) {
        regShipDate(CK_LE, fRES(shipDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {varchar(30)}
     * @param shipDateList The collection of shipDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_InScope(Collection<String> shipDateList) {
        doSetShipDate_InScope(shipDateList);
    }

    protected void doSetShipDate_InScope(Collection<String> shipDateList) {
        regINS(CK_INS, cTL(shipDateList), xgetCValueShipDate(), "SHIP_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {varchar(30)}
     * @param shipDateList The collection of shipDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_NotInScope(Collection<String> shipDateList) {
        doSetShipDate_NotInScope(shipDateList);
    }

    protected void doSetShipDate_NotInScope(Collection<String> shipDateList) {
        regINS(CK_NINS, cTL(shipDateList), xgetCValueShipDate(), "SHIP_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {varchar(30)} <br>
     * <pre>e.g. setShipDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipDate The value of shipDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipDate_LikeSearch(String shipDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipDate), xgetCValueShipDate(), "SHIP_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {varchar(30)}
     * @param shipDate The value of shipDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipDate_NotLikeSearch(String shipDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipDate), xgetCValueShipDate(), "SHIP_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {varchar(30)}
     * @param shipDate The value of shipDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_PrefixSearch(String shipDate) {
        setShipDate_LikeSearch(shipDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(30)}
     */
    public void setShipDate_IsNull() { regShipDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(30)}
     */
    public void setShipDate_IsNullOrEmpty() { regShipDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(30)}
     */
    public void setShipDate_IsNotNull() { regShipDate(CK_ISNN, DOBJ); }

    protected void regShipDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipDate(), "SHIP_DATE"); }
    protected abstract ConditionValue xgetCValueShipDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     * @param giftWrapType The value of giftWrapType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapType_Equal(String giftWrapType) {
        doSetGiftWrapType_Equal(fRES(giftWrapType));
    }

    protected void doSetGiftWrapType_Equal(String giftWrapType) {
        regGiftWrapType(CK_EQ, giftWrapType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     * @param giftWrapType The value of giftWrapType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapType_NotEqual(String giftWrapType) {
        doSetGiftWrapType_NotEqual(fRES(giftWrapType));
    }

    protected void doSetGiftWrapType_NotEqual(String giftWrapType) {
        regGiftWrapType(CK_NES, giftWrapType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     * @param giftWrapType The value of giftWrapType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapType_GreaterThan(String giftWrapType) {
        regGiftWrapType(CK_GT, fRES(giftWrapType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     * @param giftWrapType The value of giftWrapType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapType_LessThan(String giftWrapType) {
        regGiftWrapType(CK_LT, fRES(giftWrapType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     * @param giftWrapType The value of giftWrapType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapType_GreaterEqual(String giftWrapType) {
        regGiftWrapType(CK_GE, fRES(giftWrapType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     * @param giftWrapType The value of giftWrapType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapType_LessEqual(String giftWrapType) {
        regGiftWrapType(CK_LE, fRES(giftWrapType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     * @param giftWrapTypeList The collection of giftWrapType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapType_InScope(Collection<String> giftWrapTypeList) {
        doSetGiftWrapType_InScope(giftWrapTypeList);
    }

    protected void doSetGiftWrapType_InScope(Collection<String> giftWrapTypeList) {
        regINS(CK_INS, cTL(giftWrapTypeList), xgetCValueGiftWrapType(), "GIFT_WRAP_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     * @param giftWrapTypeList The collection of giftWrapType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapType_NotInScope(Collection<String> giftWrapTypeList) {
        doSetGiftWrapType_NotInScope(giftWrapTypeList);
    }

    protected void doSetGiftWrapType_NotInScope(Collection<String> giftWrapTypeList) {
        regINS(CK_NINS, cTL(giftWrapTypeList), xgetCValueGiftWrapType(), "GIFT_WRAP_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(60)} <br>
     * <pre>e.g. setGiftWrapType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param giftWrapType The value of giftWrapType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGiftWrapType_LikeSearch(String giftWrapType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(giftWrapType), xgetCValueGiftWrapType(), "GIFT_WRAP_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     * @param giftWrapType The value of giftWrapType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGiftWrapType_NotLikeSearch(String giftWrapType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(giftWrapType), xgetCValueGiftWrapType(), "GIFT_WRAP_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     * @param giftWrapType The value of giftWrapType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapType_PrefixSearch(String giftWrapType) {
        setGiftWrapType_LikeSearch(giftWrapType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     */
    public void setGiftWrapType_IsNull() { regGiftWrapType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     */
    public void setGiftWrapType_IsNullOrEmpty() { regGiftWrapType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     */
    public void setGiftWrapType_IsNotNull() { regGiftWrapType(CK_ISNN, DOBJ); }

    protected void regGiftWrapType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiftWrapType(), "GIFT_WRAP_TYPE"); }
    protected abstract ConditionValue xgetCValueGiftWrapType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     * @param giftWrapPaperType The value of giftWrapPaperType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapPaperType_Equal(String giftWrapPaperType) {
        doSetGiftWrapPaperType_Equal(fRES(giftWrapPaperType));
    }

    protected void doSetGiftWrapPaperType_Equal(String giftWrapPaperType) {
        regGiftWrapPaperType(CK_EQ, giftWrapPaperType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     * @param giftWrapPaperType The value of giftWrapPaperType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapPaperType_NotEqual(String giftWrapPaperType) {
        doSetGiftWrapPaperType_NotEqual(fRES(giftWrapPaperType));
    }

    protected void doSetGiftWrapPaperType_NotEqual(String giftWrapPaperType) {
        regGiftWrapPaperType(CK_NES, giftWrapPaperType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     * @param giftWrapPaperType The value of giftWrapPaperType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapPaperType_GreaterThan(String giftWrapPaperType) {
        regGiftWrapPaperType(CK_GT, fRES(giftWrapPaperType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     * @param giftWrapPaperType The value of giftWrapPaperType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapPaperType_LessThan(String giftWrapPaperType) {
        regGiftWrapPaperType(CK_LT, fRES(giftWrapPaperType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     * @param giftWrapPaperType The value of giftWrapPaperType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapPaperType_GreaterEqual(String giftWrapPaperType) {
        regGiftWrapPaperType(CK_GE, fRES(giftWrapPaperType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     * @param giftWrapPaperType The value of giftWrapPaperType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapPaperType_LessEqual(String giftWrapPaperType) {
        regGiftWrapPaperType(CK_LE, fRES(giftWrapPaperType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     * @param giftWrapPaperTypeList The collection of giftWrapPaperType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapPaperType_InScope(Collection<String> giftWrapPaperTypeList) {
        doSetGiftWrapPaperType_InScope(giftWrapPaperTypeList);
    }

    protected void doSetGiftWrapPaperType_InScope(Collection<String> giftWrapPaperTypeList) {
        regINS(CK_INS, cTL(giftWrapPaperTypeList), xgetCValueGiftWrapPaperType(), "GIFT_WRAP_PAPER_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     * @param giftWrapPaperTypeList The collection of giftWrapPaperType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapPaperType_NotInScope(Collection<String> giftWrapPaperTypeList) {
        doSetGiftWrapPaperType_NotInScope(giftWrapPaperTypeList);
    }

    protected void doSetGiftWrapPaperType_NotInScope(Collection<String> giftWrapPaperTypeList) {
        regINS(CK_NINS, cTL(giftWrapPaperTypeList), xgetCValueGiftWrapPaperType(), "GIFT_WRAP_PAPER_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)} <br>
     * <pre>e.g. setGiftWrapPaperType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param giftWrapPaperType The value of giftWrapPaperType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGiftWrapPaperType_LikeSearch(String giftWrapPaperType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(giftWrapPaperType), xgetCValueGiftWrapPaperType(), "GIFT_WRAP_PAPER_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     * @param giftWrapPaperType The value of giftWrapPaperType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGiftWrapPaperType_NotLikeSearch(String giftWrapPaperType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(giftWrapPaperType), xgetCValueGiftWrapPaperType(), "GIFT_WRAP_PAPER_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     * @param giftWrapPaperType The value of giftWrapPaperType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapPaperType_PrefixSearch(String giftWrapPaperType) {
        setGiftWrapPaperType_LikeSearch(giftWrapPaperType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     */
    public void setGiftWrapPaperType_IsNull() { regGiftWrapPaperType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     */
    public void setGiftWrapPaperType_IsNullOrEmpty() { regGiftWrapPaperType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     */
    public void setGiftWrapPaperType_IsNotNull() { regGiftWrapPaperType(CK_ISNN, DOBJ); }

    protected void regGiftWrapPaperType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiftWrapPaperType(), "GIFT_WRAP_PAPER_TYPE"); }
    protected abstract ConditionValue xgetCValueGiftWrapPaperType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     * @param giftWrapName The value of giftWrapName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapName_Equal(String giftWrapName) {
        doSetGiftWrapName_Equal(fRES(giftWrapName));
    }

    protected void doSetGiftWrapName_Equal(String giftWrapName) {
        regGiftWrapName(CK_EQ, giftWrapName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     * @param giftWrapName The value of giftWrapName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapName_NotEqual(String giftWrapName) {
        doSetGiftWrapName_NotEqual(fRES(giftWrapName));
    }

    protected void doSetGiftWrapName_NotEqual(String giftWrapName) {
        regGiftWrapName(CK_NES, giftWrapName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     * @param giftWrapName The value of giftWrapName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapName_GreaterThan(String giftWrapName) {
        regGiftWrapName(CK_GT, fRES(giftWrapName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     * @param giftWrapName The value of giftWrapName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapName_LessThan(String giftWrapName) {
        regGiftWrapName(CK_LT, fRES(giftWrapName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     * @param giftWrapName The value of giftWrapName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapName_GreaterEqual(String giftWrapName) {
        regGiftWrapName(CK_GE, fRES(giftWrapName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     * @param giftWrapName The value of giftWrapName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapName_LessEqual(String giftWrapName) {
        regGiftWrapName(CK_LE, fRES(giftWrapName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     * @param giftWrapNameList The collection of giftWrapName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapName_InScope(Collection<String> giftWrapNameList) {
        doSetGiftWrapName_InScope(giftWrapNameList);
    }

    protected void doSetGiftWrapName_InScope(Collection<String> giftWrapNameList) {
        regINS(CK_INS, cTL(giftWrapNameList), xgetCValueGiftWrapName(), "GIFT_WRAP_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     * @param giftWrapNameList The collection of giftWrapName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapName_NotInScope(Collection<String> giftWrapNameList) {
        doSetGiftWrapName_NotInScope(giftWrapNameList);
    }

    protected void doSetGiftWrapName_NotInScope(Collection<String> giftWrapNameList) {
        regINS(CK_NINS, cTL(giftWrapNameList), xgetCValueGiftWrapName(), "GIFT_WRAP_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_NAME: {varchar(60)} <br>
     * <pre>e.g. setGiftWrapName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param giftWrapName The value of giftWrapName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGiftWrapName_LikeSearch(String giftWrapName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(giftWrapName), xgetCValueGiftWrapName(), "GIFT_WRAP_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     * @param giftWrapName The value of giftWrapName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGiftWrapName_NotLikeSearch(String giftWrapName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(giftWrapName), xgetCValueGiftWrapName(), "GIFT_WRAP_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     * @param giftWrapName The value of giftWrapName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapName_PrefixSearch(String giftWrapName) {
        setGiftWrapName_LikeSearch(giftWrapName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     */
    public void setGiftWrapName_IsNull() { regGiftWrapName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     */
    public void setGiftWrapName_IsNullOrEmpty() { regGiftWrapName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     */
    public void setGiftWrapName_IsNotNull() { regGiftWrapName(CK_ISNN, DOBJ); }

    protected void regGiftWrapName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiftWrapName(), "GIFT_WRAP_NAME"); }
    protected abstract ConditionValue xgetCValueGiftWrapName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     * @param needBillSlip The value of needBillSlip as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedBillSlip_Equal(String needBillSlip) {
        doSetNeedBillSlip_Equal(fRES(needBillSlip));
    }

    protected void doSetNeedBillSlip_Equal(String needBillSlip) {
        regNeedBillSlip(CK_EQ, needBillSlip);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     * @param needBillSlip The value of needBillSlip as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedBillSlip_NotEqual(String needBillSlip) {
        doSetNeedBillSlip_NotEqual(fRES(needBillSlip));
    }

    protected void doSetNeedBillSlip_NotEqual(String needBillSlip) {
        regNeedBillSlip(CK_NES, needBillSlip);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     * @param needBillSlip The value of needBillSlip as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedBillSlip_GreaterThan(String needBillSlip) {
        regNeedBillSlip(CK_GT, fRES(needBillSlip));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     * @param needBillSlip The value of needBillSlip as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedBillSlip_LessThan(String needBillSlip) {
        regNeedBillSlip(CK_LT, fRES(needBillSlip));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     * @param needBillSlip The value of needBillSlip as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedBillSlip_GreaterEqual(String needBillSlip) {
        regNeedBillSlip(CK_GE, fRES(needBillSlip));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     * @param needBillSlip The value of needBillSlip as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedBillSlip_LessEqual(String needBillSlip) {
        regNeedBillSlip(CK_LE, fRES(needBillSlip));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     * @param needBillSlipList The collection of needBillSlip as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedBillSlip_InScope(Collection<String> needBillSlipList) {
        doSetNeedBillSlip_InScope(needBillSlipList);
    }

    protected void doSetNeedBillSlip_InScope(Collection<String> needBillSlipList) {
        regINS(CK_INS, cTL(needBillSlipList), xgetCValueNeedBillSlip(), "NEED_BILL_SLIP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     * @param needBillSlipList The collection of needBillSlip as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedBillSlip_NotInScope(Collection<String> needBillSlipList) {
        doSetNeedBillSlip_NotInScope(needBillSlipList);
    }

    protected void doSetNeedBillSlip_NotInScope(Collection<String> needBillSlipList) {
        regINS(CK_NINS, cTL(needBillSlipList), xgetCValueNeedBillSlip(), "NEED_BILL_SLIP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEED_BILL_SLIP: {varchar(60)} <br>
     * <pre>e.g. setNeedBillSlip_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param needBillSlip The value of needBillSlip as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNeedBillSlip_LikeSearch(String needBillSlip, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(needBillSlip), xgetCValueNeedBillSlip(), "NEED_BILL_SLIP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     * @param needBillSlip The value of needBillSlip as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNeedBillSlip_NotLikeSearch(String needBillSlip, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(needBillSlip), xgetCValueNeedBillSlip(), "NEED_BILL_SLIP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     * @param needBillSlip The value of needBillSlip as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedBillSlip_PrefixSearch(String needBillSlip) {
        setNeedBillSlip_LikeSearch(needBillSlip, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     */
    public void setNeedBillSlip_IsNull() { regNeedBillSlip(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     */
    public void setNeedBillSlip_IsNullOrEmpty() { regNeedBillSlip(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     */
    public void setNeedBillSlip_IsNotNull() { regNeedBillSlip(CK_ISNN, DOBJ); }

    protected void regNeedBillSlip(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNeedBillSlip(), "NEED_BILL_SLIP"); }
    protected abstract ConditionValue xgetCValueNeedBillSlip();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     * @param needDetailedSlip The value of needDetailedSlip as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedDetailedSlip_Equal(String needDetailedSlip) {
        doSetNeedDetailedSlip_Equal(fRES(needDetailedSlip));
    }

    protected void doSetNeedDetailedSlip_Equal(String needDetailedSlip) {
        regNeedDetailedSlip(CK_EQ, needDetailedSlip);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     * @param needDetailedSlip The value of needDetailedSlip as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedDetailedSlip_NotEqual(String needDetailedSlip) {
        doSetNeedDetailedSlip_NotEqual(fRES(needDetailedSlip));
    }

    protected void doSetNeedDetailedSlip_NotEqual(String needDetailedSlip) {
        regNeedDetailedSlip(CK_NES, needDetailedSlip);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     * @param needDetailedSlip The value of needDetailedSlip as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedDetailedSlip_GreaterThan(String needDetailedSlip) {
        regNeedDetailedSlip(CK_GT, fRES(needDetailedSlip));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     * @param needDetailedSlip The value of needDetailedSlip as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedDetailedSlip_LessThan(String needDetailedSlip) {
        regNeedDetailedSlip(CK_LT, fRES(needDetailedSlip));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     * @param needDetailedSlip The value of needDetailedSlip as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedDetailedSlip_GreaterEqual(String needDetailedSlip) {
        regNeedDetailedSlip(CK_GE, fRES(needDetailedSlip));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     * @param needDetailedSlip The value of needDetailedSlip as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedDetailedSlip_LessEqual(String needDetailedSlip) {
        regNeedDetailedSlip(CK_LE, fRES(needDetailedSlip));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     * @param needDetailedSlipList The collection of needDetailedSlip as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedDetailedSlip_InScope(Collection<String> needDetailedSlipList) {
        doSetNeedDetailedSlip_InScope(needDetailedSlipList);
    }

    protected void doSetNeedDetailedSlip_InScope(Collection<String> needDetailedSlipList) {
        regINS(CK_INS, cTL(needDetailedSlipList), xgetCValueNeedDetailedSlip(), "NEED_DETAILED_SLIP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     * @param needDetailedSlipList The collection of needDetailedSlip as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedDetailedSlip_NotInScope(Collection<String> needDetailedSlipList) {
        doSetNeedDetailedSlip_NotInScope(needDetailedSlipList);
    }

    protected void doSetNeedDetailedSlip_NotInScope(Collection<String> needDetailedSlipList) {
        regINS(CK_NINS, cTL(needDetailedSlipList), xgetCValueNeedDetailedSlip(), "NEED_DETAILED_SLIP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEED_DETAILED_SLIP: {varchar(60)} <br>
     * <pre>e.g. setNeedDetailedSlip_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param needDetailedSlip The value of needDetailedSlip as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNeedDetailedSlip_LikeSearch(String needDetailedSlip, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(needDetailedSlip), xgetCValueNeedDetailedSlip(), "NEED_DETAILED_SLIP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     * @param needDetailedSlip The value of needDetailedSlip as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNeedDetailedSlip_NotLikeSearch(String needDetailedSlip, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(needDetailedSlip), xgetCValueNeedDetailedSlip(), "NEED_DETAILED_SLIP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     * @param needDetailedSlip The value of needDetailedSlip as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedDetailedSlip_PrefixSearch(String needDetailedSlip) {
        setNeedDetailedSlip_LikeSearch(needDetailedSlip, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     */
    public void setNeedDetailedSlip_IsNull() { regNeedDetailedSlip(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     */
    public void setNeedDetailedSlip_IsNullOrEmpty() { regNeedDetailedSlip(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     */
    public void setNeedDetailedSlip_IsNotNull() { regNeedDetailedSlip(CK_ISNN, DOBJ); }

    protected void regNeedDetailedSlip(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNeedDetailedSlip(), "NEED_DETAILED_SLIP"); }
    protected abstract ConditionValue xgetCValueNeedDetailedSlip();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_RECEIPT: {varchar(60)}
     * @param needReceipt The value of needReceipt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedReceipt_Equal(String needReceipt) {
        doSetNeedReceipt_Equal(fRES(needReceipt));
    }

    protected void doSetNeedReceipt_Equal(String needReceipt) {
        regNeedReceipt(CK_EQ, needReceipt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_RECEIPT: {varchar(60)}
     * @param needReceipt The value of needReceipt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedReceipt_NotEqual(String needReceipt) {
        doSetNeedReceipt_NotEqual(fRES(needReceipt));
    }

    protected void doSetNeedReceipt_NotEqual(String needReceipt) {
        regNeedReceipt(CK_NES, needReceipt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_RECEIPT: {varchar(60)}
     * @param needReceipt The value of needReceipt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedReceipt_GreaterThan(String needReceipt) {
        regNeedReceipt(CK_GT, fRES(needReceipt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_RECEIPT: {varchar(60)}
     * @param needReceipt The value of needReceipt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedReceipt_LessThan(String needReceipt) {
        regNeedReceipt(CK_LT, fRES(needReceipt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_RECEIPT: {varchar(60)}
     * @param needReceipt The value of needReceipt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedReceipt_GreaterEqual(String needReceipt) {
        regNeedReceipt(CK_GE, fRES(needReceipt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEED_RECEIPT: {varchar(60)}
     * @param needReceipt The value of needReceipt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedReceipt_LessEqual(String needReceipt) {
        regNeedReceipt(CK_LE, fRES(needReceipt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NEED_RECEIPT: {varchar(60)}
     * @param needReceiptList The collection of needReceipt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedReceipt_InScope(Collection<String> needReceiptList) {
        doSetNeedReceipt_InScope(needReceiptList);
    }

    protected void doSetNeedReceipt_InScope(Collection<String> needReceiptList) {
        regINS(CK_INS, cTL(needReceiptList), xgetCValueNeedReceipt(), "NEED_RECEIPT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NEED_RECEIPT: {varchar(60)}
     * @param needReceiptList The collection of needReceipt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedReceipt_NotInScope(Collection<String> needReceiptList) {
        doSetNeedReceipt_NotInScope(needReceiptList);
    }

    protected void doSetNeedReceipt_NotInScope(Collection<String> needReceiptList) {
        regINS(CK_NINS, cTL(needReceiptList), xgetCValueNeedReceipt(), "NEED_RECEIPT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEED_RECEIPT: {varchar(60)} <br>
     * <pre>e.g. setNeedReceipt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param needReceipt The value of needReceipt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNeedReceipt_LikeSearch(String needReceipt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(needReceipt), xgetCValueNeedReceipt(), "NEED_RECEIPT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEED_RECEIPT: {varchar(60)}
     * @param needReceipt The value of needReceipt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNeedReceipt_NotLikeSearch(String needReceipt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(needReceipt), xgetCValueNeedReceipt(), "NEED_RECEIPT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEED_RECEIPT: {varchar(60)}
     * @param needReceipt The value of needReceipt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNeedReceipt_PrefixSearch(String needReceipt) {
        setNeedReceipt_LikeSearch(needReceipt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NEED_RECEIPT: {varchar(60)}
     */
    public void setNeedReceipt_IsNull() { regNeedReceipt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NEED_RECEIPT: {varchar(60)}
     */
    public void setNeedReceipt_IsNullOrEmpty() { regNeedReceipt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NEED_RECEIPT: {varchar(60)}
     */
    public void setNeedReceipt_IsNotNull() { regNeedReceipt(CK_ISNN, DOBJ); }

    protected void regNeedReceipt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNeedReceipt(), "NEED_RECEIPT"); }
    protected abstract ConditionValue xgetCValueNeedReceipt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION1_FIELD: {varchar(60)}
     * @param option1Field The value of option1Field as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Field_Equal(String option1Field) {
        doSetOption1Field_Equal(fRES(option1Field));
    }

    protected void doSetOption1Field_Equal(String option1Field) {
        regOption1Field(CK_EQ, option1Field);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION1_FIELD: {varchar(60)}
     * @param option1Field The value of option1Field as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Field_NotEqual(String option1Field) {
        doSetOption1Field_NotEqual(fRES(option1Field));
    }

    protected void doSetOption1Field_NotEqual(String option1Field) {
        regOption1Field(CK_NES, option1Field);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION1_FIELD: {varchar(60)}
     * @param option1Field The value of option1Field as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Field_GreaterThan(String option1Field) {
        regOption1Field(CK_GT, fRES(option1Field));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION1_FIELD: {varchar(60)}
     * @param option1Field The value of option1Field as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Field_LessThan(String option1Field) {
        regOption1Field(CK_LT, fRES(option1Field));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION1_FIELD: {varchar(60)}
     * @param option1Field The value of option1Field as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Field_GreaterEqual(String option1Field) {
        regOption1Field(CK_GE, fRES(option1Field));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION1_FIELD: {varchar(60)}
     * @param option1Field The value of option1Field as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Field_LessEqual(String option1Field) {
        regOption1Field(CK_LE, fRES(option1Field));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPTION1_FIELD: {varchar(60)}
     * @param option1FieldList The collection of option1Field as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Field_InScope(Collection<String> option1FieldList) {
        doSetOption1Field_InScope(option1FieldList);
    }

    protected void doSetOption1Field_InScope(Collection<String> option1FieldList) {
        regINS(CK_INS, cTL(option1FieldList), xgetCValueOption1Field(), "OPTION1_FIELD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPTION1_FIELD: {varchar(60)}
     * @param option1FieldList The collection of option1Field as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Field_NotInScope(Collection<String> option1FieldList) {
        doSetOption1Field_NotInScope(option1FieldList);
    }

    protected void doSetOption1Field_NotInScope(Collection<String> option1FieldList) {
        regINS(CK_NINS, cTL(option1FieldList), xgetCValueOption1Field(), "OPTION1_FIELD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPTION1_FIELD: {varchar(60)} <br>
     * <pre>e.g. setOption1Field_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param option1Field The value of option1Field as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOption1Field_LikeSearch(String option1Field, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(option1Field), xgetCValueOption1Field(), "OPTION1_FIELD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPTION1_FIELD: {varchar(60)}
     * @param option1Field The value of option1Field as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOption1Field_NotLikeSearch(String option1Field, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(option1Field), xgetCValueOption1Field(), "OPTION1_FIELD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPTION1_FIELD: {varchar(60)}
     * @param option1Field The value of option1Field as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Field_PrefixSearch(String option1Field) {
        setOption1Field_LikeSearch(option1Field, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPTION1_FIELD: {varchar(60)}
     */
    public void setOption1Field_IsNull() { regOption1Field(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OPTION1_FIELD: {varchar(60)}
     */
    public void setOption1Field_IsNullOrEmpty() { regOption1Field(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPTION1_FIELD: {varchar(60)}
     */
    public void setOption1Field_IsNotNull() { regOption1Field(CK_ISNN, DOBJ); }

    protected void regOption1Field(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOption1Field(), "OPTION1_FIELD"); }
    protected abstract ConditionValue xgetCValueOption1Field();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION1_VALUE: {varchar(60)}
     * @param option1Value The value of option1Value as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Value_Equal(String option1Value) {
        doSetOption1Value_Equal(fRES(option1Value));
    }

    protected void doSetOption1Value_Equal(String option1Value) {
        regOption1Value(CK_EQ, option1Value);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION1_VALUE: {varchar(60)}
     * @param option1Value The value of option1Value as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Value_NotEqual(String option1Value) {
        doSetOption1Value_NotEqual(fRES(option1Value));
    }

    protected void doSetOption1Value_NotEqual(String option1Value) {
        regOption1Value(CK_NES, option1Value);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION1_VALUE: {varchar(60)}
     * @param option1Value The value of option1Value as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Value_GreaterThan(String option1Value) {
        regOption1Value(CK_GT, fRES(option1Value));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION1_VALUE: {varchar(60)}
     * @param option1Value The value of option1Value as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Value_LessThan(String option1Value) {
        regOption1Value(CK_LT, fRES(option1Value));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION1_VALUE: {varchar(60)}
     * @param option1Value The value of option1Value as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Value_GreaterEqual(String option1Value) {
        regOption1Value(CK_GE, fRES(option1Value));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION1_VALUE: {varchar(60)}
     * @param option1Value The value of option1Value as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Value_LessEqual(String option1Value) {
        regOption1Value(CK_LE, fRES(option1Value));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPTION1_VALUE: {varchar(60)}
     * @param option1ValueList The collection of option1Value as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Value_InScope(Collection<String> option1ValueList) {
        doSetOption1Value_InScope(option1ValueList);
    }

    protected void doSetOption1Value_InScope(Collection<String> option1ValueList) {
        regINS(CK_INS, cTL(option1ValueList), xgetCValueOption1Value(), "OPTION1_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPTION1_VALUE: {varchar(60)}
     * @param option1ValueList The collection of option1Value as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Value_NotInScope(Collection<String> option1ValueList) {
        doSetOption1Value_NotInScope(option1ValueList);
    }

    protected void doSetOption1Value_NotInScope(Collection<String> option1ValueList) {
        regINS(CK_NINS, cTL(option1ValueList), xgetCValueOption1Value(), "OPTION1_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPTION1_VALUE: {varchar(60)} <br>
     * <pre>e.g. setOption1Value_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param option1Value The value of option1Value as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOption1Value_LikeSearch(String option1Value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(option1Value), xgetCValueOption1Value(), "OPTION1_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPTION1_VALUE: {varchar(60)}
     * @param option1Value The value of option1Value as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOption1Value_NotLikeSearch(String option1Value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(option1Value), xgetCValueOption1Value(), "OPTION1_VALUE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPTION1_VALUE: {varchar(60)}
     * @param option1Value The value of option1Value as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption1Value_PrefixSearch(String option1Value) {
        setOption1Value_LikeSearch(option1Value, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPTION1_VALUE: {varchar(60)}
     */
    public void setOption1Value_IsNull() { regOption1Value(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OPTION1_VALUE: {varchar(60)}
     */
    public void setOption1Value_IsNullOrEmpty() { regOption1Value(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPTION1_VALUE: {varchar(60)}
     */
    public void setOption1Value_IsNotNull() { regOption1Value(CK_ISNN, DOBJ); }

    protected void regOption1Value(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOption1Value(), "OPTION1_VALUE"); }
    protected abstract ConditionValue xgetCValueOption1Value();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION2_FIELD: {varchar(60)}
     * @param option2Field The value of option2Field as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Field_Equal(String option2Field) {
        doSetOption2Field_Equal(fRES(option2Field));
    }

    protected void doSetOption2Field_Equal(String option2Field) {
        regOption2Field(CK_EQ, option2Field);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION2_FIELD: {varchar(60)}
     * @param option2Field The value of option2Field as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Field_NotEqual(String option2Field) {
        doSetOption2Field_NotEqual(fRES(option2Field));
    }

    protected void doSetOption2Field_NotEqual(String option2Field) {
        regOption2Field(CK_NES, option2Field);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION2_FIELD: {varchar(60)}
     * @param option2Field The value of option2Field as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Field_GreaterThan(String option2Field) {
        regOption2Field(CK_GT, fRES(option2Field));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION2_FIELD: {varchar(60)}
     * @param option2Field The value of option2Field as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Field_LessThan(String option2Field) {
        regOption2Field(CK_LT, fRES(option2Field));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION2_FIELD: {varchar(60)}
     * @param option2Field The value of option2Field as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Field_GreaterEqual(String option2Field) {
        regOption2Field(CK_GE, fRES(option2Field));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION2_FIELD: {varchar(60)}
     * @param option2Field The value of option2Field as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Field_LessEqual(String option2Field) {
        regOption2Field(CK_LE, fRES(option2Field));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPTION2_FIELD: {varchar(60)}
     * @param option2FieldList The collection of option2Field as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Field_InScope(Collection<String> option2FieldList) {
        doSetOption2Field_InScope(option2FieldList);
    }

    protected void doSetOption2Field_InScope(Collection<String> option2FieldList) {
        regINS(CK_INS, cTL(option2FieldList), xgetCValueOption2Field(), "OPTION2_FIELD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPTION2_FIELD: {varchar(60)}
     * @param option2FieldList The collection of option2Field as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Field_NotInScope(Collection<String> option2FieldList) {
        doSetOption2Field_NotInScope(option2FieldList);
    }

    protected void doSetOption2Field_NotInScope(Collection<String> option2FieldList) {
        regINS(CK_NINS, cTL(option2FieldList), xgetCValueOption2Field(), "OPTION2_FIELD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPTION2_FIELD: {varchar(60)} <br>
     * <pre>e.g. setOption2Field_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param option2Field The value of option2Field as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOption2Field_LikeSearch(String option2Field, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(option2Field), xgetCValueOption2Field(), "OPTION2_FIELD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPTION2_FIELD: {varchar(60)}
     * @param option2Field The value of option2Field as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOption2Field_NotLikeSearch(String option2Field, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(option2Field), xgetCValueOption2Field(), "OPTION2_FIELD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPTION2_FIELD: {varchar(60)}
     * @param option2Field The value of option2Field as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Field_PrefixSearch(String option2Field) {
        setOption2Field_LikeSearch(option2Field, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPTION2_FIELD: {varchar(60)}
     */
    public void setOption2Field_IsNull() { regOption2Field(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OPTION2_FIELD: {varchar(60)}
     */
    public void setOption2Field_IsNullOrEmpty() { regOption2Field(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPTION2_FIELD: {varchar(60)}
     */
    public void setOption2Field_IsNotNull() { regOption2Field(CK_ISNN, DOBJ); }

    protected void regOption2Field(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOption2Field(), "OPTION2_FIELD"); }
    protected abstract ConditionValue xgetCValueOption2Field();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION2_VALUE: {varchar(60)}
     * @param option2Value The value of option2Value as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Value_Equal(String option2Value) {
        doSetOption2Value_Equal(fRES(option2Value));
    }

    protected void doSetOption2Value_Equal(String option2Value) {
        regOption2Value(CK_EQ, option2Value);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION2_VALUE: {varchar(60)}
     * @param option2Value The value of option2Value as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Value_NotEqual(String option2Value) {
        doSetOption2Value_NotEqual(fRES(option2Value));
    }

    protected void doSetOption2Value_NotEqual(String option2Value) {
        regOption2Value(CK_NES, option2Value);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION2_VALUE: {varchar(60)}
     * @param option2Value The value of option2Value as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Value_GreaterThan(String option2Value) {
        regOption2Value(CK_GT, fRES(option2Value));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION2_VALUE: {varchar(60)}
     * @param option2Value The value of option2Value as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Value_LessThan(String option2Value) {
        regOption2Value(CK_LT, fRES(option2Value));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION2_VALUE: {varchar(60)}
     * @param option2Value The value of option2Value as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Value_GreaterEqual(String option2Value) {
        regOption2Value(CK_GE, fRES(option2Value));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPTION2_VALUE: {varchar(60)}
     * @param option2Value The value of option2Value as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Value_LessEqual(String option2Value) {
        regOption2Value(CK_LE, fRES(option2Value));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPTION2_VALUE: {varchar(60)}
     * @param option2ValueList The collection of option2Value as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Value_InScope(Collection<String> option2ValueList) {
        doSetOption2Value_InScope(option2ValueList);
    }

    protected void doSetOption2Value_InScope(Collection<String> option2ValueList) {
        regINS(CK_INS, cTL(option2ValueList), xgetCValueOption2Value(), "OPTION2_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPTION2_VALUE: {varchar(60)}
     * @param option2ValueList The collection of option2Value as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Value_NotInScope(Collection<String> option2ValueList) {
        doSetOption2Value_NotInScope(option2ValueList);
    }

    protected void doSetOption2Value_NotInScope(Collection<String> option2ValueList) {
        regINS(CK_NINS, cTL(option2ValueList), xgetCValueOption2Value(), "OPTION2_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPTION2_VALUE: {varchar(60)} <br>
     * <pre>e.g. setOption2Value_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param option2Value The value of option2Value as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOption2Value_LikeSearch(String option2Value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(option2Value), xgetCValueOption2Value(), "OPTION2_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPTION2_VALUE: {varchar(60)}
     * @param option2Value The value of option2Value as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOption2Value_NotLikeSearch(String option2Value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(option2Value), xgetCValueOption2Value(), "OPTION2_VALUE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPTION2_VALUE: {varchar(60)}
     * @param option2Value The value of option2Value as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOption2Value_PrefixSearch(String option2Value) {
        setOption2Value_LikeSearch(option2Value, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPTION2_VALUE: {varchar(60)}
     */
    public void setOption2Value_IsNull() { regOption2Value(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OPTION2_VALUE: {varchar(60)}
     */
    public void setOption2Value_IsNullOrEmpty() { regOption2Value(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPTION2_VALUE: {varchar(60)}
     */
    public void setOption2Value_IsNotNull() { regOption2Value(CK_ISNN, DOBJ); }

    protected void regOption2Value(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOption2Value(), "OPTION2_VALUE"); }
    protected abstract ConditionValue xgetCValueOption2Value();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     * @param giftWrapMassage The value of giftWrapMassage as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapMassage_Equal(String giftWrapMassage) {
        doSetGiftWrapMassage_Equal(fRES(giftWrapMassage));
    }

    protected void doSetGiftWrapMassage_Equal(String giftWrapMassage) {
        regGiftWrapMassage(CK_EQ, giftWrapMassage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     * @param giftWrapMassage The value of giftWrapMassage as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapMassage_NotEqual(String giftWrapMassage) {
        doSetGiftWrapMassage_NotEqual(fRES(giftWrapMassage));
    }

    protected void doSetGiftWrapMassage_NotEqual(String giftWrapMassage) {
        regGiftWrapMassage(CK_NES, giftWrapMassage);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     * @param giftWrapMassage The value of giftWrapMassage as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapMassage_GreaterThan(String giftWrapMassage) {
        regGiftWrapMassage(CK_GT, fRES(giftWrapMassage));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     * @param giftWrapMassage The value of giftWrapMassage as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapMassage_LessThan(String giftWrapMassage) {
        regGiftWrapMassage(CK_LT, fRES(giftWrapMassage));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     * @param giftWrapMassage The value of giftWrapMassage as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapMassage_GreaterEqual(String giftWrapMassage) {
        regGiftWrapMassage(CK_GE, fRES(giftWrapMassage));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     * @param giftWrapMassage The value of giftWrapMassage as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapMassage_LessEqual(String giftWrapMassage) {
        regGiftWrapMassage(CK_LE, fRES(giftWrapMassage));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     * @param giftWrapMassageList The collection of giftWrapMassage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapMassage_InScope(Collection<String> giftWrapMassageList) {
        doSetGiftWrapMassage_InScope(giftWrapMassageList);
    }

    protected void doSetGiftWrapMassage_InScope(Collection<String> giftWrapMassageList) {
        regINS(CK_INS, cTL(giftWrapMassageList), xgetCValueGiftWrapMassage(), "GIFT_WRAP_MASSAGE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     * @param giftWrapMassageList The collection of giftWrapMassage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapMassage_NotInScope(Collection<String> giftWrapMassageList) {
        doSetGiftWrapMassage_NotInScope(giftWrapMassageList);
    }

    protected void doSetGiftWrapMassage_NotInScope(Collection<String> giftWrapMassageList) {
        regINS(CK_NINS, cTL(giftWrapMassageList), xgetCValueGiftWrapMassage(), "GIFT_WRAP_MASSAGE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)} <br>
     * <pre>e.g. setGiftWrapMassage_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param giftWrapMassage The value of giftWrapMassage as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGiftWrapMassage_LikeSearch(String giftWrapMassage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(giftWrapMassage), xgetCValueGiftWrapMassage(), "GIFT_WRAP_MASSAGE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     * @param giftWrapMassage The value of giftWrapMassage as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGiftWrapMassage_NotLikeSearch(String giftWrapMassage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(giftWrapMassage), xgetCValueGiftWrapMassage(), "GIFT_WRAP_MASSAGE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     * @param giftWrapMassage The value of giftWrapMassage as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapMassage_PrefixSearch(String giftWrapMassage) {
        setGiftWrapMassage_LikeSearch(giftWrapMassage, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     */
    public void setGiftWrapMassage_IsNull() { regGiftWrapMassage(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     */
    public void setGiftWrapMassage_IsNullOrEmpty() { regGiftWrapMassage(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     */
    public void setGiftWrapMassage_IsNotNull() { regGiftWrapMassage(CK_ISNN, DOBJ); }

    protected void regGiftWrapMassage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiftWrapMassage(), "GIFT_WRAP_MASSAGE"); }
    protected abstract ConditionValue xgetCValueGiftWrapMassage();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_NAME: {varchar(255)}
     * @param billName The value of billName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillName_Equal(String billName) {
        doSetBillName_Equal(fRES(billName));
    }

    protected void doSetBillName_Equal(String billName) {
        regBillName(CK_EQ, billName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_NAME: {varchar(255)}
     * @param billName The value of billName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillName_NotEqual(String billName) {
        doSetBillName_NotEqual(fRES(billName));
    }

    protected void doSetBillName_NotEqual(String billName) {
        regBillName(CK_NES, billName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_NAME: {varchar(255)}
     * @param billName The value of billName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillName_GreaterThan(String billName) {
        regBillName(CK_GT, fRES(billName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_NAME: {varchar(255)}
     * @param billName The value of billName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillName_LessThan(String billName) {
        regBillName(CK_LT, fRES(billName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_NAME: {varchar(255)}
     * @param billName The value of billName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillName_GreaterEqual(String billName) {
        regBillName(CK_GE, fRES(billName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_NAME: {varchar(255)}
     * @param billName The value of billName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillName_LessEqual(String billName) {
        regBillName(CK_LE, fRES(billName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_NAME: {varchar(255)}
     * @param billNameList The collection of billName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillName_InScope(Collection<String> billNameList) {
        doSetBillName_InScope(billNameList);
    }

    protected void doSetBillName_InScope(Collection<String> billNameList) {
        regINS(CK_INS, cTL(billNameList), xgetCValueBillName(), "BILL_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_NAME: {varchar(255)}
     * @param billNameList The collection of billName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillName_NotInScope(Collection<String> billNameList) {
        doSetBillName_NotInScope(billNameList);
    }

    protected void doSetBillName_NotInScope(Collection<String> billNameList) {
        regINS(CK_NINS, cTL(billNameList), xgetCValueBillName(), "BILL_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_NAME: {varchar(255)} <br>
     * <pre>e.g. setBillName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billName The value of billName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillName_LikeSearch(String billName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billName), xgetCValueBillName(), "BILL_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_NAME: {varchar(255)}
     * @param billName The value of billName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillName_NotLikeSearch(String billName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billName), xgetCValueBillName(), "BILL_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_NAME: {varchar(255)}
     * @param billName The value of billName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillName_PrefixSearch(String billName) {
        setBillName_LikeSearch(billName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_NAME: {varchar(255)}
     */
    public void setBillName_IsNull() { regBillName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_NAME: {varchar(255)}
     */
    public void setBillName_IsNullOrEmpty() { regBillName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_NAME: {varchar(255)}
     */
    public void setBillName_IsNotNull() { regBillName(CK_ISNN, DOBJ); }

    protected void regBillName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillName(), "BILL_NAME"); }
    protected abstract ConditionValue xgetCValueBillName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     * @param billFirstName The value of billFirstName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstName_Equal(String billFirstName) {
        doSetBillFirstName_Equal(fRES(billFirstName));
    }

    protected void doSetBillFirstName_Equal(String billFirstName) {
        regBillFirstName(CK_EQ, billFirstName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     * @param billFirstName The value of billFirstName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstName_NotEqual(String billFirstName) {
        doSetBillFirstName_NotEqual(fRES(billFirstName));
    }

    protected void doSetBillFirstName_NotEqual(String billFirstName) {
        regBillFirstName(CK_NES, billFirstName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     * @param billFirstName The value of billFirstName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstName_GreaterThan(String billFirstName) {
        regBillFirstName(CK_GT, fRES(billFirstName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     * @param billFirstName The value of billFirstName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstName_LessThan(String billFirstName) {
        regBillFirstName(CK_LT, fRES(billFirstName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     * @param billFirstName The value of billFirstName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstName_GreaterEqual(String billFirstName) {
        regBillFirstName(CK_GE, fRES(billFirstName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     * @param billFirstName The value of billFirstName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstName_LessEqual(String billFirstName) {
        regBillFirstName(CK_LE, fRES(billFirstName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     * @param billFirstNameList The collection of billFirstName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstName_InScope(Collection<String> billFirstNameList) {
        doSetBillFirstName_InScope(billFirstNameList);
    }

    protected void doSetBillFirstName_InScope(Collection<String> billFirstNameList) {
        regINS(CK_INS, cTL(billFirstNameList), xgetCValueBillFirstName(), "BILL_FIRST_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     * @param billFirstNameList The collection of billFirstName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstName_NotInScope(Collection<String> billFirstNameList) {
        doSetBillFirstName_NotInScope(billFirstNameList);
    }

    protected void doSetBillFirstName_NotInScope(Collection<String> billFirstNameList) {
        regINS(CK_NINS, cTL(billFirstNameList), xgetCValueBillFirstName(), "BILL_FIRST_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_FIRST_NAME: {varchar(255)} <br>
     * <pre>e.g. setBillFirstName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billFirstName The value of billFirstName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillFirstName_LikeSearch(String billFirstName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billFirstName), xgetCValueBillFirstName(), "BILL_FIRST_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     * @param billFirstName The value of billFirstName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillFirstName_NotLikeSearch(String billFirstName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billFirstName), xgetCValueBillFirstName(), "BILL_FIRST_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     * @param billFirstName The value of billFirstName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstName_PrefixSearch(String billFirstName) {
        setBillFirstName_LikeSearch(billFirstName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     */
    public void setBillFirstName_IsNull() { regBillFirstName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     */
    public void setBillFirstName_IsNullOrEmpty() { regBillFirstName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     */
    public void setBillFirstName_IsNotNull() { regBillFirstName(CK_ISNN, DOBJ); }

    protected void regBillFirstName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillFirstName(), "BILL_FIRST_NAME"); }
    protected abstract ConditionValue xgetCValueBillFirstName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_LAST_NAME: {varchar(255)}
     * @param billLastName The value of billLastName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastName_Equal(String billLastName) {
        doSetBillLastName_Equal(fRES(billLastName));
    }

    protected void doSetBillLastName_Equal(String billLastName) {
        regBillLastName(CK_EQ, billLastName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_LAST_NAME: {varchar(255)}
     * @param billLastName The value of billLastName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastName_NotEqual(String billLastName) {
        doSetBillLastName_NotEqual(fRES(billLastName));
    }

    protected void doSetBillLastName_NotEqual(String billLastName) {
        regBillLastName(CK_NES, billLastName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_LAST_NAME: {varchar(255)}
     * @param billLastName The value of billLastName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastName_GreaterThan(String billLastName) {
        regBillLastName(CK_GT, fRES(billLastName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_LAST_NAME: {varchar(255)}
     * @param billLastName The value of billLastName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastName_LessThan(String billLastName) {
        regBillLastName(CK_LT, fRES(billLastName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_LAST_NAME: {varchar(255)}
     * @param billLastName The value of billLastName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastName_GreaterEqual(String billLastName) {
        regBillLastName(CK_GE, fRES(billLastName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_LAST_NAME: {varchar(255)}
     * @param billLastName The value of billLastName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastName_LessEqual(String billLastName) {
        regBillLastName(CK_LE, fRES(billLastName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_LAST_NAME: {varchar(255)}
     * @param billLastNameList The collection of billLastName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastName_InScope(Collection<String> billLastNameList) {
        doSetBillLastName_InScope(billLastNameList);
    }

    protected void doSetBillLastName_InScope(Collection<String> billLastNameList) {
        regINS(CK_INS, cTL(billLastNameList), xgetCValueBillLastName(), "BILL_LAST_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_LAST_NAME: {varchar(255)}
     * @param billLastNameList The collection of billLastName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastName_NotInScope(Collection<String> billLastNameList) {
        doSetBillLastName_NotInScope(billLastNameList);
    }

    protected void doSetBillLastName_NotInScope(Collection<String> billLastNameList) {
        regINS(CK_NINS, cTL(billLastNameList), xgetCValueBillLastName(), "BILL_LAST_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_LAST_NAME: {varchar(255)} <br>
     * <pre>e.g. setBillLastName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billLastName The value of billLastName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillLastName_LikeSearch(String billLastName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billLastName), xgetCValueBillLastName(), "BILL_LAST_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_LAST_NAME: {varchar(255)}
     * @param billLastName The value of billLastName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillLastName_NotLikeSearch(String billLastName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billLastName), xgetCValueBillLastName(), "BILL_LAST_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_LAST_NAME: {varchar(255)}
     * @param billLastName The value of billLastName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastName_PrefixSearch(String billLastName) {
        setBillLastName_LikeSearch(billLastName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_LAST_NAME: {varchar(255)}
     */
    public void setBillLastName_IsNull() { regBillLastName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_LAST_NAME: {varchar(255)}
     */
    public void setBillLastName_IsNullOrEmpty() { regBillLastName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_LAST_NAME: {varchar(255)}
     */
    public void setBillLastName_IsNotNull() { regBillLastName(CK_ISNN, DOBJ); }

    protected void regBillLastName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillLastName(), "BILL_LAST_NAME"); }
    protected abstract ConditionValue xgetCValueBillLastName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS1: {varchar(255)}
     * @param billAddress1 The value of billAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1_Equal(String billAddress1) {
        doSetBillAddress1_Equal(fRES(billAddress1));
    }

    protected void doSetBillAddress1_Equal(String billAddress1) {
        regBillAddress1(CK_EQ, billAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS1: {varchar(255)}
     * @param billAddress1 The value of billAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1_NotEqual(String billAddress1) {
        doSetBillAddress1_NotEqual(fRES(billAddress1));
    }

    protected void doSetBillAddress1_NotEqual(String billAddress1) {
        regBillAddress1(CK_NES, billAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS1: {varchar(255)}
     * @param billAddress1 The value of billAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1_GreaterThan(String billAddress1) {
        regBillAddress1(CK_GT, fRES(billAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS1: {varchar(255)}
     * @param billAddress1 The value of billAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1_LessThan(String billAddress1) {
        regBillAddress1(CK_LT, fRES(billAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS1: {varchar(255)}
     * @param billAddress1 The value of billAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1_GreaterEqual(String billAddress1) {
        regBillAddress1(CK_GE, fRES(billAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS1: {varchar(255)}
     * @param billAddress1 The value of billAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1_LessEqual(String billAddress1) {
        regBillAddress1(CK_LE, fRES(billAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS1: {varchar(255)}
     * @param billAddress1List The collection of billAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1_InScope(Collection<String> billAddress1List) {
        doSetBillAddress1_InScope(billAddress1List);
    }

    protected void doSetBillAddress1_InScope(Collection<String> billAddress1List) {
        regINS(CK_INS, cTL(billAddress1List), xgetCValueBillAddress1(), "BILL_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS1: {varchar(255)}
     * @param billAddress1List The collection of billAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1_NotInScope(Collection<String> billAddress1List) {
        doSetBillAddress1_NotInScope(billAddress1List);
    }

    protected void doSetBillAddress1_NotInScope(Collection<String> billAddress1List) {
        regINS(CK_NINS, cTL(billAddress1List), xgetCValueBillAddress1(), "BILL_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS1: {varchar(255)} <br>
     * <pre>e.g. setBillAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billAddress1 The value of billAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillAddress1_LikeSearch(String billAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billAddress1), xgetCValueBillAddress1(), "BILL_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS1: {varchar(255)}
     * @param billAddress1 The value of billAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillAddress1_NotLikeSearch(String billAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billAddress1), xgetCValueBillAddress1(), "BILL_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS1: {varchar(255)}
     * @param billAddress1 The value of billAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1_PrefixSearch(String billAddress1) {
        setBillAddress1_LikeSearch(billAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_ADDRESS1: {varchar(255)}
     */
    public void setBillAddress1_IsNull() { regBillAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_ADDRESS1: {varchar(255)}
     */
    public void setBillAddress1_IsNullOrEmpty() { regBillAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_ADDRESS1: {varchar(255)}
     */
    public void setBillAddress1_IsNotNull() { regBillAddress1(CK_ISNN, DOBJ); }

    protected void regBillAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillAddress1(), "BILL_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueBillAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS2: {varchar(255)}
     * @param billAddress2 The value of billAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2_Equal(String billAddress2) {
        doSetBillAddress2_Equal(fRES(billAddress2));
    }

    protected void doSetBillAddress2_Equal(String billAddress2) {
        regBillAddress2(CK_EQ, billAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS2: {varchar(255)}
     * @param billAddress2 The value of billAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2_NotEqual(String billAddress2) {
        doSetBillAddress2_NotEqual(fRES(billAddress2));
    }

    protected void doSetBillAddress2_NotEqual(String billAddress2) {
        regBillAddress2(CK_NES, billAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS2: {varchar(255)}
     * @param billAddress2 The value of billAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2_GreaterThan(String billAddress2) {
        regBillAddress2(CK_GT, fRES(billAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS2: {varchar(255)}
     * @param billAddress2 The value of billAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2_LessThan(String billAddress2) {
        regBillAddress2(CK_LT, fRES(billAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS2: {varchar(255)}
     * @param billAddress2 The value of billAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2_GreaterEqual(String billAddress2) {
        regBillAddress2(CK_GE, fRES(billAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS2: {varchar(255)}
     * @param billAddress2 The value of billAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2_LessEqual(String billAddress2) {
        regBillAddress2(CK_LE, fRES(billAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS2: {varchar(255)}
     * @param billAddress2List The collection of billAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2_InScope(Collection<String> billAddress2List) {
        doSetBillAddress2_InScope(billAddress2List);
    }

    protected void doSetBillAddress2_InScope(Collection<String> billAddress2List) {
        regINS(CK_INS, cTL(billAddress2List), xgetCValueBillAddress2(), "BILL_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS2: {varchar(255)}
     * @param billAddress2List The collection of billAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2_NotInScope(Collection<String> billAddress2List) {
        doSetBillAddress2_NotInScope(billAddress2List);
    }

    protected void doSetBillAddress2_NotInScope(Collection<String> billAddress2List) {
        regINS(CK_NINS, cTL(billAddress2List), xgetCValueBillAddress2(), "BILL_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS2: {varchar(255)} <br>
     * <pre>e.g. setBillAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billAddress2 The value of billAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillAddress2_LikeSearch(String billAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billAddress2), xgetCValueBillAddress2(), "BILL_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS2: {varchar(255)}
     * @param billAddress2 The value of billAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillAddress2_NotLikeSearch(String billAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billAddress2), xgetCValueBillAddress2(), "BILL_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS2: {varchar(255)}
     * @param billAddress2 The value of billAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2_PrefixSearch(String billAddress2) {
        setBillAddress2_LikeSearch(billAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_ADDRESS2: {varchar(255)}
     */
    public void setBillAddress2_IsNull() { regBillAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_ADDRESS2: {varchar(255)}
     */
    public void setBillAddress2_IsNullOrEmpty() { regBillAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_ADDRESS2: {varchar(255)}
     */
    public void setBillAddress2_IsNotNull() { regBillAddress2(CK_ISNN, DOBJ); }

    protected void regBillAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillAddress2(), "BILL_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueBillAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_CITY: {varchar(255)}
     * @param billCity The value of billCity as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCity_Equal(String billCity) {
        doSetBillCity_Equal(fRES(billCity));
    }

    protected void doSetBillCity_Equal(String billCity) {
        regBillCity(CK_EQ, billCity);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_CITY: {varchar(255)}
     * @param billCity The value of billCity as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCity_NotEqual(String billCity) {
        doSetBillCity_NotEqual(fRES(billCity));
    }

    protected void doSetBillCity_NotEqual(String billCity) {
        regBillCity(CK_NES, billCity);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_CITY: {varchar(255)}
     * @param billCity The value of billCity as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCity_GreaterThan(String billCity) {
        regBillCity(CK_GT, fRES(billCity));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_CITY: {varchar(255)}
     * @param billCity The value of billCity as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCity_LessThan(String billCity) {
        regBillCity(CK_LT, fRES(billCity));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_CITY: {varchar(255)}
     * @param billCity The value of billCity as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCity_GreaterEqual(String billCity) {
        regBillCity(CK_GE, fRES(billCity));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_CITY: {varchar(255)}
     * @param billCity The value of billCity as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCity_LessEqual(String billCity) {
        regBillCity(CK_LE, fRES(billCity));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_CITY: {varchar(255)}
     * @param billCityList The collection of billCity as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCity_InScope(Collection<String> billCityList) {
        doSetBillCity_InScope(billCityList);
    }

    protected void doSetBillCity_InScope(Collection<String> billCityList) {
        regINS(CK_INS, cTL(billCityList), xgetCValueBillCity(), "BILL_CITY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_CITY: {varchar(255)}
     * @param billCityList The collection of billCity as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCity_NotInScope(Collection<String> billCityList) {
        doSetBillCity_NotInScope(billCityList);
    }

    protected void doSetBillCity_NotInScope(Collection<String> billCityList) {
        regINS(CK_NINS, cTL(billCityList), xgetCValueBillCity(), "BILL_CITY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_CITY: {varchar(255)} <br>
     * <pre>e.g. setBillCity_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billCity The value of billCity as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillCity_LikeSearch(String billCity, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billCity), xgetCValueBillCity(), "BILL_CITY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_CITY: {varchar(255)}
     * @param billCity The value of billCity as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillCity_NotLikeSearch(String billCity, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billCity), xgetCValueBillCity(), "BILL_CITY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_CITY: {varchar(255)}
     * @param billCity The value of billCity as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCity_PrefixSearch(String billCity) {
        setBillCity_LikeSearch(billCity, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_CITY: {varchar(255)}
     */
    public void setBillCity_IsNull() { regBillCity(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_CITY: {varchar(255)}
     */
    public void setBillCity_IsNullOrEmpty() { regBillCity(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_CITY: {varchar(255)}
     */
    public void setBillCity_IsNotNull() { regBillCity(CK_ISNN, DOBJ); }

    protected void regBillCity(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillCity(), "BILL_CITY"); }
    protected abstract ConditionValue xgetCValueBillCity();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PREFECTURE: {varchar(255)}
     * @param billPrefecture The value of billPrefecture as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefecture_Equal(String billPrefecture) {
        doSetBillPrefecture_Equal(fRES(billPrefecture));
    }

    protected void doSetBillPrefecture_Equal(String billPrefecture) {
        regBillPrefecture(CK_EQ, billPrefecture);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PREFECTURE: {varchar(255)}
     * @param billPrefecture The value of billPrefecture as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefecture_NotEqual(String billPrefecture) {
        doSetBillPrefecture_NotEqual(fRES(billPrefecture));
    }

    protected void doSetBillPrefecture_NotEqual(String billPrefecture) {
        regBillPrefecture(CK_NES, billPrefecture);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PREFECTURE: {varchar(255)}
     * @param billPrefecture The value of billPrefecture as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefecture_GreaterThan(String billPrefecture) {
        regBillPrefecture(CK_GT, fRES(billPrefecture));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PREFECTURE: {varchar(255)}
     * @param billPrefecture The value of billPrefecture as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefecture_LessThan(String billPrefecture) {
        regBillPrefecture(CK_LT, fRES(billPrefecture));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PREFECTURE: {varchar(255)}
     * @param billPrefecture The value of billPrefecture as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefecture_GreaterEqual(String billPrefecture) {
        regBillPrefecture(CK_GE, fRES(billPrefecture));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PREFECTURE: {varchar(255)}
     * @param billPrefecture The value of billPrefecture as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefecture_LessEqual(String billPrefecture) {
        regBillPrefecture(CK_LE, fRES(billPrefecture));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_PREFECTURE: {varchar(255)}
     * @param billPrefectureList The collection of billPrefecture as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefecture_InScope(Collection<String> billPrefectureList) {
        doSetBillPrefecture_InScope(billPrefectureList);
    }

    protected void doSetBillPrefecture_InScope(Collection<String> billPrefectureList) {
        regINS(CK_INS, cTL(billPrefectureList), xgetCValueBillPrefecture(), "BILL_PREFECTURE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_PREFECTURE: {varchar(255)}
     * @param billPrefectureList The collection of billPrefecture as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefecture_NotInScope(Collection<String> billPrefectureList) {
        doSetBillPrefecture_NotInScope(billPrefectureList);
    }

    protected void doSetBillPrefecture_NotInScope(Collection<String> billPrefectureList) {
        regINS(CK_NINS, cTL(billPrefectureList), xgetCValueBillPrefecture(), "BILL_PREFECTURE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_PREFECTURE: {varchar(255)} <br>
     * <pre>e.g. setBillPrefecture_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billPrefecture The value of billPrefecture as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillPrefecture_LikeSearch(String billPrefecture, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billPrefecture), xgetCValueBillPrefecture(), "BILL_PREFECTURE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_PREFECTURE: {varchar(255)}
     * @param billPrefecture The value of billPrefecture as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillPrefecture_NotLikeSearch(String billPrefecture, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billPrefecture), xgetCValueBillPrefecture(), "BILL_PREFECTURE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_PREFECTURE: {varchar(255)}
     * @param billPrefecture The value of billPrefecture as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefecture_PrefixSearch(String billPrefecture) {
        setBillPrefecture_LikeSearch(billPrefecture, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_PREFECTURE: {varchar(255)}
     */
    public void setBillPrefecture_IsNull() { regBillPrefecture(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_PREFECTURE: {varchar(255)}
     */
    public void setBillPrefecture_IsNullOrEmpty() { regBillPrefecture(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_PREFECTURE: {varchar(255)}
     */
    public void setBillPrefecture_IsNotNull() { regBillPrefecture(CK_ISNN, DOBJ); }

    protected void regBillPrefecture(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillPrefecture(), "BILL_PREFECTURE"); }
    protected abstract ConditionValue xgetCValueBillPrefecture();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     * @param billZipCode The value of billZipCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillZipCode_Equal(String billZipCode) {
        doSetBillZipCode_Equal(fRES(billZipCode));
    }

    protected void doSetBillZipCode_Equal(String billZipCode) {
        regBillZipCode(CK_EQ, billZipCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     * @param billZipCode The value of billZipCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillZipCode_NotEqual(String billZipCode) {
        doSetBillZipCode_NotEqual(fRES(billZipCode));
    }

    protected void doSetBillZipCode_NotEqual(String billZipCode) {
        regBillZipCode(CK_NES, billZipCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     * @param billZipCode The value of billZipCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillZipCode_GreaterThan(String billZipCode) {
        regBillZipCode(CK_GT, fRES(billZipCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     * @param billZipCode The value of billZipCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillZipCode_LessThan(String billZipCode) {
        regBillZipCode(CK_LT, fRES(billZipCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     * @param billZipCode The value of billZipCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillZipCode_GreaterEqual(String billZipCode) {
        regBillZipCode(CK_GE, fRES(billZipCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     * @param billZipCode The value of billZipCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillZipCode_LessEqual(String billZipCode) {
        regBillZipCode(CK_LE, fRES(billZipCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     * @param billZipCodeList The collection of billZipCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillZipCode_InScope(Collection<String> billZipCodeList) {
        doSetBillZipCode_InScope(billZipCodeList);
    }

    protected void doSetBillZipCode_InScope(Collection<String> billZipCodeList) {
        regINS(CK_INS, cTL(billZipCodeList), xgetCValueBillZipCode(), "BILL_ZIP_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     * @param billZipCodeList The collection of billZipCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillZipCode_NotInScope(Collection<String> billZipCodeList) {
        doSetBillZipCode_NotInScope(billZipCodeList);
    }

    protected void doSetBillZipCode_NotInScope(Collection<String> billZipCodeList) {
        regINS(CK_NINS, cTL(billZipCodeList), xgetCValueBillZipCode(), "BILL_ZIP_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ZIP_CODE: {varchar(30)} <br>
     * <pre>e.g. setBillZipCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billZipCode The value of billZipCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillZipCode_LikeSearch(String billZipCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billZipCode), xgetCValueBillZipCode(), "BILL_ZIP_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     * @param billZipCode The value of billZipCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillZipCode_NotLikeSearch(String billZipCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billZipCode), xgetCValueBillZipCode(), "BILL_ZIP_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     * @param billZipCode The value of billZipCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillZipCode_PrefixSearch(String billZipCode) {
        setBillZipCode_LikeSearch(billZipCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     */
    public void setBillZipCode_IsNull() { regBillZipCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     */
    public void setBillZipCode_IsNullOrEmpty() { regBillZipCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     */
    public void setBillZipCode_IsNotNull() { regBillZipCode(CK_ISNN, DOBJ); }

    protected void regBillZipCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillZipCode(), "BILL_ZIP_CODE"); }
    protected abstract ConditionValue xgetCValueBillZipCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_NAME_KANA: {varchar(255)}
     * @param billNameKana The value of billNameKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillNameKana_Equal(String billNameKana) {
        doSetBillNameKana_Equal(fRES(billNameKana));
    }

    protected void doSetBillNameKana_Equal(String billNameKana) {
        regBillNameKana(CK_EQ, billNameKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_NAME_KANA: {varchar(255)}
     * @param billNameKana The value of billNameKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillNameKana_NotEqual(String billNameKana) {
        doSetBillNameKana_NotEqual(fRES(billNameKana));
    }

    protected void doSetBillNameKana_NotEqual(String billNameKana) {
        regBillNameKana(CK_NES, billNameKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_NAME_KANA: {varchar(255)}
     * @param billNameKana The value of billNameKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillNameKana_GreaterThan(String billNameKana) {
        regBillNameKana(CK_GT, fRES(billNameKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_NAME_KANA: {varchar(255)}
     * @param billNameKana The value of billNameKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillNameKana_LessThan(String billNameKana) {
        regBillNameKana(CK_LT, fRES(billNameKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_NAME_KANA: {varchar(255)}
     * @param billNameKana The value of billNameKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillNameKana_GreaterEqual(String billNameKana) {
        regBillNameKana(CK_GE, fRES(billNameKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_NAME_KANA: {varchar(255)}
     * @param billNameKana The value of billNameKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillNameKana_LessEqual(String billNameKana) {
        regBillNameKana(CK_LE, fRES(billNameKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_NAME_KANA: {varchar(255)}
     * @param billNameKanaList The collection of billNameKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillNameKana_InScope(Collection<String> billNameKanaList) {
        doSetBillNameKana_InScope(billNameKanaList);
    }

    protected void doSetBillNameKana_InScope(Collection<String> billNameKanaList) {
        regINS(CK_INS, cTL(billNameKanaList), xgetCValueBillNameKana(), "BILL_NAME_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_NAME_KANA: {varchar(255)}
     * @param billNameKanaList The collection of billNameKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillNameKana_NotInScope(Collection<String> billNameKanaList) {
        doSetBillNameKana_NotInScope(billNameKanaList);
    }

    protected void doSetBillNameKana_NotInScope(Collection<String> billNameKanaList) {
        regINS(CK_NINS, cTL(billNameKanaList), xgetCValueBillNameKana(), "BILL_NAME_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_NAME_KANA: {varchar(255)} <br>
     * <pre>e.g. setBillNameKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billNameKana The value of billNameKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillNameKana_LikeSearch(String billNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billNameKana), xgetCValueBillNameKana(), "BILL_NAME_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_NAME_KANA: {varchar(255)}
     * @param billNameKana The value of billNameKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillNameKana_NotLikeSearch(String billNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billNameKana), xgetCValueBillNameKana(), "BILL_NAME_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_NAME_KANA: {varchar(255)}
     * @param billNameKana The value of billNameKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillNameKana_PrefixSearch(String billNameKana) {
        setBillNameKana_LikeSearch(billNameKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_NAME_KANA: {varchar(255)}
     */
    public void setBillNameKana_IsNull() { regBillNameKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_NAME_KANA: {varchar(255)}
     */
    public void setBillNameKana_IsNullOrEmpty() { regBillNameKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_NAME_KANA: {varchar(255)}
     */
    public void setBillNameKana_IsNotNull() { regBillNameKana(CK_ISNN, DOBJ); }

    protected void regBillNameKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillNameKana(), "BILL_NAME_KANA"); }
    protected abstract ConditionValue xgetCValueBillNameKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     * @param billFirstNameKana The value of billFirstNameKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstNameKana_Equal(String billFirstNameKana) {
        doSetBillFirstNameKana_Equal(fRES(billFirstNameKana));
    }

    protected void doSetBillFirstNameKana_Equal(String billFirstNameKana) {
        regBillFirstNameKana(CK_EQ, billFirstNameKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     * @param billFirstNameKana The value of billFirstNameKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstNameKana_NotEqual(String billFirstNameKana) {
        doSetBillFirstNameKana_NotEqual(fRES(billFirstNameKana));
    }

    protected void doSetBillFirstNameKana_NotEqual(String billFirstNameKana) {
        regBillFirstNameKana(CK_NES, billFirstNameKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     * @param billFirstNameKana The value of billFirstNameKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstNameKana_GreaterThan(String billFirstNameKana) {
        regBillFirstNameKana(CK_GT, fRES(billFirstNameKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     * @param billFirstNameKana The value of billFirstNameKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstNameKana_LessThan(String billFirstNameKana) {
        regBillFirstNameKana(CK_LT, fRES(billFirstNameKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     * @param billFirstNameKana The value of billFirstNameKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstNameKana_GreaterEqual(String billFirstNameKana) {
        regBillFirstNameKana(CK_GE, fRES(billFirstNameKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     * @param billFirstNameKana The value of billFirstNameKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstNameKana_LessEqual(String billFirstNameKana) {
        regBillFirstNameKana(CK_LE, fRES(billFirstNameKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     * @param billFirstNameKanaList The collection of billFirstNameKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstNameKana_InScope(Collection<String> billFirstNameKanaList) {
        doSetBillFirstNameKana_InScope(billFirstNameKanaList);
    }

    protected void doSetBillFirstNameKana_InScope(Collection<String> billFirstNameKanaList) {
        regINS(CK_INS, cTL(billFirstNameKanaList), xgetCValueBillFirstNameKana(), "BILL_FIRST_NAME_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     * @param billFirstNameKanaList The collection of billFirstNameKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstNameKana_NotInScope(Collection<String> billFirstNameKanaList) {
        doSetBillFirstNameKana_NotInScope(billFirstNameKanaList);
    }

    protected void doSetBillFirstNameKana_NotInScope(Collection<String> billFirstNameKanaList) {
        regINS(CK_NINS, cTL(billFirstNameKanaList), xgetCValueBillFirstNameKana(), "BILL_FIRST_NAME_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)} <br>
     * <pre>e.g. setBillFirstNameKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billFirstNameKana The value of billFirstNameKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillFirstNameKana_LikeSearch(String billFirstNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billFirstNameKana), xgetCValueBillFirstNameKana(), "BILL_FIRST_NAME_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     * @param billFirstNameKana The value of billFirstNameKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillFirstNameKana_NotLikeSearch(String billFirstNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billFirstNameKana), xgetCValueBillFirstNameKana(), "BILL_FIRST_NAME_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     * @param billFirstNameKana The value of billFirstNameKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillFirstNameKana_PrefixSearch(String billFirstNameKana) {
        setBillFirstNameKana_LikeSearch(billFirstNameKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     */
    public void setBillFirstNameKana_IsNull() { regBillFirstNameKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     */
    public void setBillFirstNameKana_IsNullOrEmpty() { regBillFirstNameKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     */
    public void setBillFirstNameKana_IsNotNull() { regBillFirstNameKana(CK_ISNN, DOBJ); }

    protected void regBillFirstNameKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillFirstNameKana(), "BILL_FIRST_NAME_KANA"); }
    protected abstract ConditionValue xgetCValueBillFirstNameKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     * @param billLastNameKana The value of billLastNameKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastNameKana_Equal(String billLastNameKana) {
        doSetBillLastNameKana_Equal(fRES(billLastNameKana));
    }

    protected void doSetBillLastNameKana_Equal(String billLastNameKana) {
        regBillLastNameKana(CK_EQ, billLastNameKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     * @param billLastNameKana The value of billLastNameKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastNameKana_NotEqual(String billLastNameKana) {
        doSetBillLastNameKana_NotEqual(fRES(billLastNameKana));
    }

    protected void doSetBillLastNameKana_NotEqual(String billLastNameKana) {
        regBillLastNameKana(CK_NES, billLastNameKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     * @param billLastNameKana The value of billLastNameKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastNameKana_GreaterThan(String billLastNameKana) {
        regBillLastNameKana(CK_GT, fRES(billLastNameKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     * @param billLastNameKana The value of billLastNameKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastNameKana_LessThan(String billLastNameKana) {
        regBillLastNameKana(CK_LT, fRES(billLastNameKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     * @param billLastNameKana The value of billLastNameKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastNameKana_GreaterEqual(String billLastNameKana) {
        regBillLastNameKana(CK_GE, fRES(billLastNameKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     * @param billLastNameKana The value of billLastNameKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastNameKana_LessEqual(String billLastNameKana) {
        regBillLastNameKana(CK_LE, fRES(billLastNameKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     * @param billLastNameKanaList The collection of billLastNameKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastNameKana_InScope(Collection<String> billLastNameKanaList) {
        doSetBillLastNameKana_InScope(billLastNameKanaList);
    }

    protected void doSetBillLastNameKana_InScope(Collection<String> billLastNameKanaList) {
        regINS(CK_INS, cTL(billLastNameKanaList), xgetCValueBillLastNameKana(), "BILL_LAST_NAME_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     * @param billLastNameKanaList The collection of billLastNameKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastNameKana_NotInScope(Collection<String> billLastNameKanaList) {
        doSetBillLastNameKana_NotInScope(billLastNameKanaList);
    }

    protected void doSetBillLastNameKana_NotInScope(Collection<String> billLastNameKanaList) {
        regINS(CK_NINS, cTL(billLastNameKanaList), xgetCValueBillLastNameKana(), "BILL_LAST_NAME_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)} <br>
     * <pre>e.g. setBillLastNameKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billLastNameKana The value of billLastNameKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillLastNameKana_LikeSearch(String billLastNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billLastNameKana), xgetCValueBillLastNameKana(), "BILL_LAST_NAME_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     * @param billLastNameKana The value of billLastNameKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillLastNameKana_NotLikeSearch(String billLastNameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billLastNameKana), xgetCValueBillLastNameKana(), "BILL_LAST_NAME_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     * @param billLastNameKana The value of billLastNameKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillLastNameKana_PrefixSearch(String billLastNameKana) {
        setBillLastNameKana_LikeSearch(billLastNameKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     */
    public void setBillLastNameKana_IsNull() { regBillLastNameKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     */
    public void setBillLastNameKana_IsNullOrEmpty() { regBillLastNameKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     */
    public void setBillLastNameKana_IsNotNull() { regBillLastNameKana(CK_ISNN, DOBJ); }

    protected void regBillLastNameKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillLastNameKana(), "BILL_LAST_NAME_KANA"); }
    protected abstract ConditionValue xgetCValueBillLastNameKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     * @param billAddress1Kana The value of billAddress1Kana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1Kana_Equal(String billAddress1Kana) {
        doSetBillAddress1Kana_Equal(fRES(billAddress1Kana));
    }

    protected void doSetBillAddress1Kana_Equal(String billAddress1Kana) {
        regBillAddress1Kana(CK_EQ, billAddress1Kana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     * @param billAddress1Kana The value of billAddress1Kana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1Kana_NotEqual(String billAddress1Kana) {
        doSetBillAddress1Kana_NotEqual(fRES(billAddress1Kana));
    }

    protected void doSetBillAddress1Kana_NotEqual(String billAddress1Kana) {
        regBillAddress1Kana(CK_NES, billAddress1Kana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     * @param billAddress1Kana The value of billAddress1Kana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1Kana_GreaterThan(String billAddress1Kana) {
        regBillAddress1Kana(CK_GT, fRES(billAddress1Kana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     * @param billAddress1Kana The value of billAddress1Kana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1Kana_LessThan(String billAddress1Kana) {
        regBillAddress1Kana(CK_LT, fRES(billAddress1Kana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     * @param billAddress1Kana The value of billAddress1Kana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1Kana_GreaterEqual(String billAddress1Kana) {
        regBillAddress1Kana(CK_GE, fRES(billAddress1Kana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     * @param billAddress1Kana The value of billAddress1Kana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1Kana_LessEqual(String billAddress1Kana) {
        regBillAddress1Kana(CK_LE, fRES(billAddress1Kana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     * @param billAddress1KanaList The collection of billAddress1Kana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1Kana_InScope(Collection<String> billAddress1KanaList) {
        doSetBillAddress1Kana_InScope(billAddress1KanaList);
    }

    protected void doSetBillAddress1Kana_InScope(Collection<String> billAddress1KanaList) {
        regINS(CK_INS, cTL(billAddress1KanaList), xgetCValueBillAddress1Kana(), "BILL_ADDRESS1_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     * @param billAddress1KanaList The collection of billAddress1Kana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1Kana_NotInScope(Collection<String> billAddress1KanaList) {
        doSetBillAddress1Kana_NotInScope(billAddress1KanaList);
    }

    protected void doSetBillAddress1Kana_NotInScope(Collection<String> billAddress1KanaList) {
        regINS(CK_NINS, cTL(billAddress1KanaList), xgetCValueBillAddress1Kana(), "BILL_ADDRESS1_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)} <br>
     * <pre>e.g. setBillAddress1Kana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billAddress1Kana The value of billAddress1Kana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillAddress1Kana_LikeSearch(String billAddress1Kana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billAddress1Kana), xgetCValueBillAddress1Kana(), "BILL_ADDRESS1_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     * @param billAddress1Kana The value of billAddress1Kana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillAddress1Kana_NotLikeSearch(String billAddress1Kana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billAddress1Kana), xgetCValueBillAddress1Kana(), "BILL_ADDRESS1_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     * @param billAddress1Kana The value of billAddress1Kana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress1Kana_PrefixSearch(String billAddress1Kana) {
        setBillAddress1Kana_LikeSearch(billAddress1Kana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     */
    public void setBillAddress1Kana_IsNull() { regBillAddress1Kana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     */
    public void setBillAddress1Kana_IsNullOrEmpty() { regBillAddress1Kana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     */
    public void setBillAddress1Kana_IsNotNull() { regBillAddress1Kana(CK_ISNN, DOBJ); }

    protected void regBillAddress1Kana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillAddress1Kana(), "BILL_ADDRESS1_KANA"); }
    protected abstract ConditionValue xgetCValueBillAddress1Kana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     * @param billAddress2Kana The value of billAddress2Kana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2Kana_Equal(String billAddress2Kana) {
        doSetBillAddress2Kana_Equal(fRES(billAddress2Kana));
    }

    protected void doSetBillAddress2Kana_Equal(String billAddress2Kana) {
        regBillAddress2Kana(CK_EQ, billAddress2Kana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     * @param billAddress2Kana The value of billAddress2Kana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2Kana_NotEqual(String billAddress2Kana) {
        doSetBillAddress2Kana_NotEqual(fRES(billAddress2Kana));
    }

    protected void doSetBillAddress2Kana_NotEqual(String billAddress2Kana) {
        regBillAddress2Kana(CK_NES, billAddress2Kana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     * @param billAddress2Kana The value of billAddress2Kana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2Kana_GreaterThan(String billAddress2Kana) {
        regBillAddress2Kana(CK_GT, fRES(billAddress2Kana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     * @param billAddress2Kana The value of billAddress2Kana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2Kana_LessThan(String billAddress2Kana) {
        regBillAddress2Kana(CK_LT, fRES(billAddress2Kana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     * @param billAddress2Kana The value of billAddress2Kana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2Kana_GreaterEqual(String billAddress2Kana) {
        regBillAddress2Kana(CK_GE, fRES(billAddress2Kana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     * @param billAddress2Kana The value of billAddress2Kana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2Kana_LessEqual(String billAddress2Kana) {
        regBillAddress2Kana(CK_LE, fRES(billAddress2Kana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     * @param billAddress2KanaList The collection of billAddress2Kana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2Kana_InScope(Collection<String> billAddress2KanaList) {
        doSetBillAddress2Kana_InScope(billAddress2KanaList);
    }

    protected void doSetBillAddress2Kana_InScope(Collection<String> billAddress2KanaList) {
        regINS(CK_INS, cTL(billAddress2KanaList), xgetCValueBillAddress2Kana(), "BILL_ADDRESS2_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     * @param billAddress2KanaList The collection of billAddress2Kana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2Kana_NotInScope(Collection<String> billAddress2KanaList) {
        doSetBillAddress2Kana_NotInScope(billAddress2KanaList);
    }

    protected void doSetBillAddress2Kana_NotInScope(Collection<String> billAddress2KanaList) {
        regINS(CK_NINS, cTL(billAddress2KanaList), xgetCValueBillAddress2Kana(), "BILL_ADDRESS2_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)} <br>
     * <pre>e.g. setBillAddress2Kana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billAddress2Kana The value of billAddress2Kana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillAddress2Kana_LikeSearch(String billAddress2Kana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billAddress2Kana), xgetCValueBillAddress2Kana(), "BILL_ADDRESS2_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     * @param billAddress2Kana The value of billAddress2Kana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillAddress2Kana_NotLikeSearch(String billAddress2Kana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billAddress2Kana), xgetCValueBillAddress2Kana(), "BILL_ADDRESS2_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     * @param billAddress2Kana The value of billAddress2Kana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillAddress2Kana_PrefixSearch(String billAddress2Kana) {
        setBillAddress2Kana_LikeSearch(billAddress2Kana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     */
    public void setBillAddress2Kana_IsNull() { regBillAddress2Kana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     */
    public void setBillAddress2Kana_IsNullOrEmpty() { regBillAddress2Kana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     */
    public void setBillAddress2Kana_IsNotNull() { regBillAddress2Kana(CK_ISNN, DOBJ); }

    protected void regBillAddress2Kana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillAddress2Kana(), "BILL_ADDRESS2_KANA"); }
    protected abstract ConditionValue xgetCValueBillAddress2Kana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_CITY_KANA: {varchar(255)}
     * @param billCityKana The value of billCityKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCityKana_Equal(String billCityKana) {
        doSetBillCityKana_Equal(fRES(billCityKana));
    }

    protected void doSetBillCityKana_Equal(String billCityKana) {
        regBillCityKana(CK_EQ, billCityKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_CITY_KANA: {varchar(255)}
     * @param billCityKana The value of billCityKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCityKana_NotEqual(String billCityKana) {
        doSetBillCityKana_NotEqual(fRES(billCityKana));
    }

    protected void doSetBillCityKana_NotEqual(String billCityKana) {
        regBillCityKana(CK_NES, billCityKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_CITY_KANA: {varchar(255)}
     * @param billCityKana The value of billCityKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCityKana_GreaterThan(String billCityKana) {
        regBillCityKana(CK_GT, fRES(billCityKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_CITY_KANA: {varchar(255)}
     * @param billCityKana The value of billCityKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCityKana_LessThan(String billCityKana) {
        regBillCityKana(CK_LT, fRES(billCityKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_CITY_KANA: {varchar(255)}
     * @param billCityKana The value of billCityKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCityKana_GreaterEqual(String billCityKana) {
        regBillCityKana(CK_GE, fRES(billCityKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_CITY_KANA: {varchar(255)}
     * @param billCityKana The value of billCityKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCityKana_LessEqual(String billCityKana) {
        regBillCityKana(CK_LE, fRES(billCityKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_CITY_KANA: {varchar(255)}
     * @param billCityKanaList The collection of billCityKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCityKana_InScope(Collection<String> billCityKanaList) {
        doSetBillCityKana_InScope(billCityKanaList);
    }

    protected void doSetBillCityKana_InScope(Collection<String> billCityKanaList) {
        regINS(CK_INS, cTL(billCityKanaList), xgetCValueBillCityKana(), "BILL_CITY_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_CITY_KANA: {varchar(255)}
     * @param billCityKanaList The collection of billCityKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCityKana_NotInScope(Collection<String> billCityKanaList) {
        doSetBillCityKana_NotInScope(billCityKanaList);
    }

    protected void doSetBillCityKana_NotInScope(Collection<String> billCityKanaList) {
        regINS(CK_NINS, cTL(billCityKanaList), xgetCValueBillCityKana(), "BILL_CITY_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_CITY_KANA: {varchar(255)} <br>
     * <pre>e.g. setBillCityKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billCityKana The value of billCityKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillCityKana_LikeSearch(String billCityKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billCityKana), xgetCValueBillCityKana(), "BILL_CITY_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_CITY_KANA: {varchar(255)}
     * @param billCityKana The value of billCityKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillCityKana_NotLikeSearch(String billCityKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billCityKana), xgetCValueBillCityKana(), "BILL_CITY_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_CITY_KANA: {varchar(255)}
     * @param billCityKana The value of billCityKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillCityKana_PrefixSearch(String billCityKana) {
        setBillCityKana_LikeSearch(billCityKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_CITY_KANA: {varchar(255)}
     */
    public void setBillCityKana_IsNull() { regBillCityKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_CITY_KANA: {varchar(255)}
     */
    public void setBillCityKana_IsNullOrEmpty() { regBillCityKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_CITY_KANA: {varchar(255)}
     */
    public void setBillCityKana_IsNotNull() { regBillCityKana(CK_ISNN, DOBJ); }

    protected void regBillCityKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillCityKana(), "BILL_CITY_KANA"); }
    protected abstract ConditionValue xgetCValueBillCityKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     * @param billPrefectureKana The value of billPrefectureKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefectureKana_Equal(String billPrefectureKana) {
        doSetBillPrefectureKana_Equal(fRES(billPrefectureKana));
    }

    protected void doSetBillPrefectureKana_Equal(String billPrefectureKana) {
        regBillPrefectureKana(CK_EQ, billPrefectureKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     * @param billPrefectureKana The value of billPrefectureKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefectureKana_NotEqual(String billPrefectureKana) {
        doSetBillPrefectureKana_NotEqual(fRES(billPrefectureKana));
    }

    protected void doSetBillPrefectureKana_NotEqual(String billPrefectureKana) {
        regBillPrefectureKana(CK_NES, billPrefectureKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     * @param billPrefectureKana The value of billPrefectureKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefectureKana_GreaterThan(String billPrefectureKana) {
        regBillPrefectureKana(CK_GT, fRES(billPrefectureKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     * @param billPrefectureKana The value of billPrefectureKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefectureKana_LessThan(String billPrefectureKana) {
        regBillPrefectureKana(CK_LT, fRES(billPrefectureKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     * @param billPrefectureKana The value of billPrefectureKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefectureKana_GreaterEqual(String billPrefectureKana) {
        regBillPrefectureKana(CK_GE, fRES(billPrefectureKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     * @param billPrefectureKana The value of billPrefectureKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefectureKana_LessEqual(String billPrefectureKana) {
        regBillPrefectureKana(CK_LE, fRES(billPrefectureKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     * @param billPrefectureKanaList The collection of billPrefectureKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefectureKana_InScope(Collection<String> billPrefectureKanaList) {
        doSetBillPrefectureKana_InScope(billPrefectureKanaList);
    }

    protected void doSetBillPrefectureKana_InScope(Collection<String> billPrefectureKanaList) {
        regINS(CK_INS, cTL(billPrefectureKanaList), xgetCValueBillPrefectureKana(), "BILL_PREFECTURE_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     * @param billPrefectureKanaList The collection of billPrefectureKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefectureKana_NotInScope(Collection<String> billPrefectureKanaList) {
        doSetBillPrefectureKana_NotInScope(billPrefectureKanaList);
    }

    protected void doSetBillPrefectureKana_NotInScope(Collection<String> billPrefectureKanaList) {
        regINS(CK_NINS, cTL(billPrefectureKanaList), xgetCValueBillPrefectureKana(), "BILL_PREFECTURE_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)} <br>
     * <pre>e.g. setBillPrefectureKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billPrefectureKana The value of billPrefectureKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillPrefectureKana_LikeSearch(String billPrefectureKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billPrefectureKana), xgetCValueBillPrefectureKana(), "BILL_PREFECTURE_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     * @param billPrefectureKana The value of billPrefectureKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillPrefectureKana_NotLikeSearch(String billPrefectureKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billPrefectureKana), xgetCValueBillPrefectureKana(), "BILL_PREFECTURE_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     * @param billPrefectureKana The value of billPrefectureKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPrefectureKana_PrefixSearch(String billPrefectureKana) {
        setBillPrefectureKana_LikeSearch(billPrefectureKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     */
    public void setBillPrefectureKana_IsNull() { regBillPrefectureKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     */
    public void setBillPrefectureKana_IsNullOrEmpty() { regBillPrefectureKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     */
    public void setBillPrefectureKana_IsNotNull() { regBillPrefectureKana(CK_ISNN, DOBJ); }

    protected void regBillPrefectureKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillPrefectureKana(), "BILL_PREFECTURE_KANA"); }
    protected abstract ConditionValue xgetCValueBillPrefectureKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     * @param billSection1Field The value of billSection1Field as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Field_Equal(String billSection1Field) {
        doSetBillSection1Field_Equal(fRES(billSection1Field));
    }

    protected void doSetBillSection1Field_Equal(String billSection1Field) {
        regBillSection1Field(CK_EQ, billSection1Field);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     * @param billSection1Field The value of billSection1Field as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Field_NotEqual(String billSection1Field) {
        doSetBillSection1Field_NotEqual(fRES(billSection1Field));
    }

    protected void doSetBillSection1Field_NotEqual(String billSection1Field) {
        regBillSection1Field(CK_NES, billSection1Field);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     * @param billSection1Field The value of billSection1Field as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Field_GreaterThan(String billSection1Field) {
        regBillSection1Field(CK_GT, fRES(billSection1Field));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     * @param billSection1Field The value of billSection1Field as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Field_LessThan(String billSection1Field) {
        regBillSection1Field(CK_LT, fRES(billSection1Field));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     * @param billSection1Field The value of billSection1Field as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Field_GreaterEqual(String billSection1Field) {
        regBillSection1Field(CK_GE, fRES(billSection1Field));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     * @param billSection1Field The value of billSection1Field as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Field_LessEqual(String billSection1Field) {
        regBillSection1Field(CK_LE, fRES(billSection1Field));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     * @param billSection1FieldList The collection of billSection1Field as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Field_InScope(Collection<String> billSection1FieldList) {
        doSetBillSection1Field_InScope(billSection1FieldList);
    }

    protected void doSetBillSection1Field_InScope(Collection<String> billSection1FieldList) {
        regINS(CK_INS, cTL(billSection1FieldList), xgetCValueBillSection1Field(), "BILL_SECTION1_FIELD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     * @param billSection1FieldList The collection of billSection1Field as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Field_NotInScope(Collection<String> billSection1FieldList) {
        doSetBillSection1Field_NotInScope(billSection1FieldList);
    }

    protected void doSetBillSection1Field_NotInScope(Collection<String> billSection1FieldList) {
        regINS(CK_NINS, cTL(billSection1FieldList), xgetCValueBillSection1Field(), "BILL_SECTION1_FIELD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_SECTION1_FIELD: {varchar(60)} <br>
     * <pre>e.g. setBillSection1Field_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billSection1Field The value of billSection1Field as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillSection1Field_LikeSearch(String billSection1Field, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billSection1Field), xgetCValueBillSection1Field(), "BILL_SECTION1_FIELD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     * @param billSection1Field The value of billSection1Field as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillSection1Field_NotLikeSearch(String billSection1Field, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billSection1Field), xgetCValueBillSection1Field(), "BILL_SECTION1_FIELD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     * @param billSection1Field The value of billSection1Field as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Field_PrefixSearch(String billSection1Field) {
        setBillSection1Field_LikeSearch(billSection1Field, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     */
    public void setBillSection1Field_IsNull() { regBillSection1Field(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     */
    public void setBillSection1Field_IsNullOrEmpty() { regBillSection1Field(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     */
    public void setBillSection1Field_IsNotNull() { regBillSection1Field(CK_ISNN, DOBJ); }

    protected void regBillSection1Field(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillSection1Field(), "BILL_SECTION1_FIELD"); }
    protected abstract ConditionValue xgetCValueBillSection1Field();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     * @param billSection1Value The value of billSection1Value as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Value_Equal(String billSection1Value) {
        doSetBillSection1Value_Equal(fRES(billSection1Value));
    }

    protected void doSetBillSection1Value_Equal(String billSection1Value) {
        regBillSection1Value(CK_EQ, billSection1Value);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     * @param billSection1Value The value of billSection1Value as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Value_NotEqual(String billSection1Value) {
        doSetBillSection1Value_NotEqual(fRES(billSection1Value));
    }

    protected void doSetBillSection1Value_NotEqual(String billSection1Value) {
        regBillSection1Value(CK_NES, billSection1Value);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     * @param billSection1Value The value of billSection1Value as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Value_GreaterThan(String billSection1Value) {
        regBillSection1Value(CK_GT, fRES(billSection1Value));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     * @param billSection1Value The value of billSection1Value as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Value_LessThan(String billSection1Value) {
        regBillSection1Value(CK_LT, fRES(billSection1Value));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     * @param billSection1Value The value of billSection1Value as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Value_GreaterEqual(String billSection1Value) {
        regBillSection1Value(CK_GE, fRES(billSection1Value));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     * @param billSection1Value The value of billSection1Value as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Value_LessEqual(String billSection1Value) {
        regBillSection1Value(CK_LE, fRES(billSection1Value));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     * @param billSection1ValueList The collection of billSection1Value as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Value_InScope(Collection<String> billSection1ValueList) {
        doSetBillSection1Value_InScope(billSection1ValueList);
    }

    protected void doSetBillSection1Value_InScope(Collection<String> billSection1ValueList) {
        regINS(CK_INS, cTL(billSection1ValueList), xgetCValueBillSection1Value(), "BILL_SECTION1_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     * @param billSection1ValueList The collection of billSection1Value as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Value_NotInScope(Collection<String> billSection1ValueList) {
        doSetBillSection1Value_NotInScope(billSection1ValueList);
    }

    protected void doSetBillSection1Value_NotInScope(Collection<String> billSection1ValueList) {
        regINS(CK_NINS, cTL(billSection1ValueList), xgetCValueBillSection1Value(), "BILL_SECTION1_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_SECTION1_VALUE: {varchar(60)} <br>
     * <pre>e.g. setBillSection1Value_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billSection1Value The value of billSection1Value as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillSection1Value_LikeSearch(String billSection1Value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billSection1Value), xgetCValueBillSection1Value(), "BILL_SECTION1_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     * @param billSection1Value The value of billSection1Value as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillSection1Value_NotLikeSearch(String billSection1Value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billSection1Value), xgetCValueBillSection1Value(), "BILL_SECTION1_VALUE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     * @param billSection1Value The value of billSection1Value as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection1Value_PrefixSearch(String billSection1Value) {
        setBillSection1Value_LikeSearch(billSection1Value, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     */
    public void setBillSection1Value_IsNull() { regBillSection1Value(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     */
    public void setBillSection1Value_IsNullOrEmpty() { regBillSection1Value(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     */
    public void setBillSection1Value_IsNotNull() { regBillSection1Value(CK_ISNN, DOBJ); }

    protected void regBillSection1Value(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillSection1Value(), "BILL_SECTION1_VALUE"); }
    protected abstract ConditionValue xgetCValueBillSection1Value();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     * @param billSection2Field The value of billSection2Field as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Field_Equal(String billSection2Field) {
        doSetBillSection2Field_Equal(fRES(billSection2Field));
    }

    protected void doSetBillSection2Field_Equal(String billSection2Field) {
        regBillSection2Field(CK_EQ, billSection2Field);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     * @param billSection2Field The value of billSection2Field as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Field_NotEqual(String billSection2Field) {
        doSetBillSection2Field_NotEqual(fRES(billSection2Field));
    }

    protected void doSetBillSection2Field_NotEqual(String billSection2Field) {
        regBillSection2Field(CK_NES, billSection2Field);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     * @param billSection2Field The value of billSection2Field as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Field_GreaterThan(String billSection2Field) {
        regBillSection2Field(CK_GT, fRES(billSection2Field));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     * @param billSection2Field The value of billSection2Field as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Field_LessThan(String billSection2Field) {
        regBillSection2Field(CK_LT, fRES(billSection2Field));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     * @param billSection2Field The value of billSection2Field as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Field_GreaterEqual(String billSection2Field) {
        regBillSection2Field(CK_GE, fRES(billSection2Field));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     * @param billSection2Field The value of billSection2Field as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Field_LessEqual(String billSection2Field) {
        regBillSection2Field(CK_LE, fRES(billSection2Field));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     * @param billSection2FieldList The collection of billSection2Field as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Field_InScope(Collection<String> billSection2FieldList) {
        doSetBillSection2Field_InScope(billSection2FieldList);
    }

    protected void doSetBillSection2Field_InScope(Collection<String> billSection2FieldList) {
        regINS(CK_INS, cTL(billSection2FieldList), xgetCValueBillSection2Field(), "BILL_SECTION2_FIELD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     * @param billSection2FieldList The collection of billSection2Field as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Field_NotInScope(Collection<String> billSection2FieldList) {
        doSetBillSection2Field_NotInScope(billSection2FieldList);
    }

    protected void doSetBillSection2Field_NotInScope(Collection<String> billSection2FieldList) {
        regINS(CK_NINS, cTL(billSection2FieldList), xgetCValueBillSection2Field(), "BILL_SECTION2_FIELD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_SECTION2_FIELD: {varchar(60)} <br>
     * <pre>e.g. setBillSection2Field_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billSection2Field The value of billSection2Field as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillSection2Field_LikeSearch(String billSection2Field, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billSection2Field), xgetCValueBillSection2Field(), "BILL_SECTION2_FIELD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     * @param billSection2Field The value of billSection2Field as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillSection2Field_NotLikeSearch(String billSection2Field, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billSection2Field), xgetCValueBillSection2Field(), "BILL_SECTION2_FIELD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     * @param billSection2Field The value of billSection2Field as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Field_PrefixSearch(String billSection2Field) {
        setBillSection2Field_LikeSearch(billSection2Field, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     */
    public void setBillSection2Field_IsNull() { regBillSection2Field(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     */
    public void setBillSection2Field_IsNullOrEmpty() { regBillSection2Field(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     */
    public void setBillSection2Field_IsNotNull() { regBillSection2Field(CK_ISNN, DOBJ); }

    protected void regBillSection2Field(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillSection2Field(), "BILL_SECTION2_FIELD"); }
    protected abstract ConditionValue xgetCValueBillSection2Field();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     * @param billSection2Value The value of billSection2Value as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Value_Equal(String billSection2Value) {
        doSetBillSection2Value_Equal(fRES(billSection2Value));
    }

    protected void doSetBillSection2Value_Equal(String billSection2Value) {
        regBillSection2Value(CK_EQ, billSection2Value);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     * @param billSection2Value The value of billSection2Value as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Value_NotEqual(String billSection2Value) {
        doSetBillSection2Value_NotEqual(fRES(billSection2Value));
    }

    protected void doSetBillSection2Value_NotEqual(String billSection2Value) {
        regBillSection2Value(CK_NES, billSection2Value);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     * @param billSection2Value The value of billSection2Value as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Value_GreaterThan(String billSection2Value) {
        regBillSection2Value(CK_GT, fRES(billSection2Value));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     * @param billSection2Value The value of billSection2Value as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Value_LessThan(String billSection2Value) {
        regBillSection2Value(CK_LT, fRES(billSection2Value));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     * @param billSection2Value The value of billSection2Value as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Value_GreaterEqual(String billSection2Value) {
        regBillSection2Value(CK_GE, fRES(billSection2Value));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     * @param billSection2Value The value of billSection2Value as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Value_LessEqual(String billSection2Value) {
        regBillSection2Value(CK_LE, fRES(billSection2Value));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     * @param billSection2ValueList The collection of billSection2Value as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Value_InScope(Collection<String> billSection2ValueList) {
        doSetBillSection2Value_InScope(billSection2ValueList);
    }

    protected void doSetBillSection2Value_InScope(Collection<String> billSection2ValueList) {
        regINS(CK_INS, cTL(billSection2ValueList), xgetCValueBillSection2Value(), "BILL_SECTION2_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     * @param billSection2ValueList The collection of billSection2Value as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Value_NotInScope(Collection<String> billSection2ValueList) {
        doSetBillSection2Value_NotInScope(billSection2ValueList);
    }

    protected void doSetBillSection2Value_NotInScope(Collection<String> billSection2ValueList) {
        regINS(CK_NINS, cTL(billSection2ValueList), xgetCValueBillSection2Value(), "BILL_SECTION2_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_SECTION2_VALUE: {varchar(60)} <br>
     * <pre>e.g. setBillSection2Value_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billSection2Value The value of billSection2Value as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillSection2Value_LikeSearch(String billSection2Value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billSection2Value), xgetCValueBillSection2Value(), "BILL_SECTION2_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     * @param billSection2Value The value of billSection2Value as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillSection2Value_NotLikeSearch(String billSection2Value, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billSection2Value), xgetCValueBillSection2Value(), "BILL_SECTION2_VALUE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     * @param billSection2Value The value of billSection2Value as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillSection2Value_PrefixSearch(String billSection2Value) {
        setBillSection2Value_LikeSearch(billSection2Value, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     */
    public void setBillSection2Value_IsNull() { regBillSection2Value(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     */
    public void setBillSection2Value_IsNullOrEmpty() { regBillSection2Value(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     */
    public void setBillSection2Value_IsNotNull() { regBillSection2Value(CK_ISNN, DOBJ); }

    protected void regBillSection2Value(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillSection2Value(), "BILL_SECTION2_VALUE"); }
    protected abstract ConditionValue xgetCValueBillSection2Value();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     * @param billPhoneNumber The value of billPhoneNumber as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPhoneNumber_Equal(String billPhoneNumber) {
        doSetBillPhoneNumber_Equal(fRES(billPhoneNumber));
    }

    protected void doSetBillPhoneNumber_Equal(String billPhoneNumber) {
        regBillPhoneNumber(CK_EQ, billPhoneNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     * @param billPhoneNumber The value of billPhoneNumber as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPhoneNumber_NotEqual(String billPhoneNumber) {
        doSetBillPhoneNumber_NotEqual(fRES(billPhoneNumber));
    }

    protected void doSetBillPhoneNumber_NotEqual(String billPhoneNumber) {
        regBillPhoneNumber(CK_NES, billPhoneNumber);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     * @param billPhoneNumber The value of billPhoneNumber as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPhoneNumber_GreaterThan(String billPhoneNumber) {
        regBillPhoneNumber(CK_GT, fRES(billPhoneNumber));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     * @param billPhoneNumber The value of billPhoneNumber as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPhoneNumber_LessThan(String billPhoneNumber) {
        regBillPhoneNumber(CK_LT, fRES(billPhoneNumber));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     * @param billPhoneNumber The value of billPhoneNumber as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPhoneNumber_GreaterEqual(String billPhoneNumber) {
        regBillPhoneNumber(CK_GE, fRES(billPhoneNumber));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     * @param billPhoneNumber The value of billPhoneNumber as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPhoneNumber_LessEqual(String billPhoneNumber) {
        regBillPhoneNumber(CK_LE, fRES(billPhoneNumber));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     * @param billPhoneNumberList The collection of billPhoneNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPhoneNumber_InScope(Collection<String> billPhoneNumberList) {
        doSetBillPhoneNumber_InScope(billPhoneNumberList);
    }

    protected void doSetBillPhoneNumber_InScope(Collection<String> billPhoneNumberList) {
        regINS(CK_INS, cTL(billPhoneNumberList), xgetCValueBillPhoneNumber(), "BILL_PHONE_NUMBER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     * @param billPhoneNumberList The collection of billPhoneNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPhoneNumber_NotInScope(Collection<String> billPhoneNumberList) {
        doSetBillPhoneNumber_NotInScope(billPhoneNumberList);
    }

    protected void doSetBillPhoneNumber_NotInScope(Collection<String> billPhoneNumberList) {
        regINS(CK_NINS, cTL(billPhoneNumberList), xgetCValueBillPhoneNumber(), "BILL_PHONE_NUMBER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_PHONE_NUMBER: {varchar(255)} <br>
     * <pre>e.g. setBillPhoneNumber_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billPhoneNumber The value of billPhoneNumber as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillPhoneNumber_LikeSearch(String billPhoneNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billPhoneNumber), xgetCValueBillPhoneNumber(), "BILL_PHONE_NUMBER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     * @param billPhoneNumber The value of billPhoneNumber as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillPhoneNumber_NotLikeSearch(String billPhoneNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billPhoneNumber), xgetCValueBillPhoneNumber(), "BILL_PHONE_NUMBER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     * @param billPhoneNumber The value of billPhoneNumber as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillPhoneNumber_PrefixSearch(String billPhoneNumber) {
        setBillPhoneNumber_LikeSearch(billPhoneNumber, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     */
    public void setBillPhoneNumber_IsNull() { regBillPhoneNumber(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     */
    public void setBillPhoneNumber_IsNullOrEmpty() { regBillPhoneNumber(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     */
    public void setBillPhoneNumber_IsNotNull() { regBillPhoneNumber(CK_ISNN, DOBJ); }

    protected void regBillPhoneNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillPhoneNumber(), "BILL_PHONE_NUMBER"); }
    protected abstract ConditionValue xgetCValueBillPhoneNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     * @param billEmgPhoneNumber The value of billEmgPhoneNumber as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillEmgPhoneNumber_Equal(String billEmgPhoneNumber) {
        doSetBillEmgPhoneNumber_Equal(fRES(billEmgPhoneNumber));
    }

    protected void doSetBillEmgPhoneNumber_Equal(String billEmgPhoneNumber) {
        regBillEmgPhoneNumber(CK_EQ, billEmgPhoneNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     * @param billEmgPhoneNumber The value of billEmgPhoneNumber as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillEmgPhoneNumber_NotEqual(String billEmgPhoneNumber) {
        doSetBillEmgPhoneNumber_NotEqual(fRES(billEmgPhoneNumber));
    }

    protected void doSetBillEmgPhoneNumber_NotEqual(String billEmgPhoneNumber) {
        regBillEmgPhoneNumber(CK_NES, billEmgPhoneNumber);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     * @param billEmgPhoneNumber The value of billEmgPhoneNumber as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillEmgPhoneNumber_GreaterThan(String billEmgPhoneNumber) {
        regBillEmgPhoneNumber(CK_GT, fRES(billEmgPhoneNumber));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     * @param billEmgPhoneNumber The value of billEmgPhoneNumber as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillEmgPhoneNumber_LessThan(String billEmgPhoneNumber) {
        regBillEmgPhoneNumber(CK_LT, fRES(billEmgPhoneNumber));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     * @param billEmgPhoneNumber The value of billEmgPhoneNumber as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillEmgPhoneNumber_GreaterEqual(String billEmgPhoneNumber) {
        regBillEmgPhoneNumber(CK_GE, fRES(billEmgPhoneNumber));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     * @param billEmgPhoneNumber The value of billEmgPhoneNumber as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillEmgPhoneNumber_LessEqual(String billEmgPhoneNumber) {
        regBillEmgPhoneNumber(CK_LE, fRES(billEmgPhoneNumber));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     * @param billEmgPhoneNumberList The collection of billEmgPhoneNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillEmgPhoneNumber_InScope(Collection<String> billEmgPhoneNumberList) {
        doSetBillEmgPhoneNumber_InScope(billEmgPhoneNumberList);
    }

    protected void doSetBillEmgPhoneNumber_InScope(Collection<String> billEmgPhoneNumberList) {
        regINS(CK_INS, cTL(billEmgPhoneNumberList), xgetCValueBillEmgPhoneNumber(), "BILL_EMG_PHONE_NUMBER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     * @param billEmgPhoneNumberList The collection of billEmgPhoneNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillEmgPhoneNumber_NotInScope(Collection<String> billEmgPhoneNumberList) {
        doSetBillEmgPhoneNumber_NotInScope(billEmgPhoneNumberList);
    }

    protected void doSetBillEmgPhoneNumber_NotInScope(Collection<String> billEmgPhoneNumberList) {
        regINS(CK_NINS, cTL(billEmgPhoneNumberList), xgetCValueBillEmgPhoneNumber(), "BILL_EMG_PHONE_NUMBER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)} <br>
     * <pre>e.g. setBillEmgPhoneNumber_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billEmgPhoneNumber The value of billEmgPhoneNumber as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillEmgPhoneNumber_LikeSearch(String billEmgPhoneNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billEmgPhoneNumber), xgetCValueBillEmgPhoneNumber(), "BILL_EMG_PHONE_NUMBER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     * @param billEmgPhoneNumber The value of billEmgPhoneNumber as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillEmgPhoneNumber_NotLikeSearch(String billEmgPhoneNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billEmgPhoneNumber), xgetCValueBillEmgPhoneNumber(), "BILL_EMG_PHONE_NUMBER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     * @param billEmgPhoneNumber The value of billEmgPhoneNumber as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillEmgPhoneNumber_PrefixSearch(String billEmgPhoneNumber) {
        setBillEmgPhoneNumber_LikeSearch(billEmgPhoneNumber, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     */
    public void setBillEmgPhoneNumber_IsNull() { regBillEmgPhoneNumber(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     */
    public void setBillEmgPhoneNumber_IsNullOrEmpty() { regBillEmgPhoneNumber(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     */
    public void setBillEmgPhoneNumber_IsNotNull() { regBillEmgPhoneNumber(CK_ISNN, DOBJ); }

    protected void regBillEmgPhoneNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillEmgPhoneNumber(), "BILL_EMG_PHONE_NUMBER"); }
    protected abstract ConditionValue xgetCValueBillEmgPhoneNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     * @param billMailAddress The value of billMailAddress as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillMailAddress_Equal(String billMailAddress) {
        doSetBillMailAddress_Equal(fRES(billMailAddress));
    }

    protected void doSetBillMailAddress_Equal(String billMailAddress) {
        regBillMailAddress(CK_EQ, billMailAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     * @param billMailAddress The value of billMailAddress as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillMailAddress_NotEqual(String billMailAddress) {
        doSetBillMailAddress_NotEqual(fRES(billMailAddress));
    }

    protected void doSetBillMailAddress_NotEqual(String billMailAddress) {
        regBillMailAddress(CK_NES, billMailAddress);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     * @param billMailAddress The value of billMailAddress as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillMailAddress_GreaterThan(String billMailAddress) {
        regBillMailAddress(CK_GT, fRES(billMailAddress));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     * @param billMailAddress The value of billMailAddress as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillMailAddress_LessThan(String billMailAddress) {
        regBillMailAddress(CK_LT, fRES(billMailAddress));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     * @param billMailAddress The value of billMailAddress as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillMailAddress_GreaterEqual(String billMailAddress) {
        regBillMailAddress(CK_GE, fRES(billMailAddress));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     * @param billMailAddress The value of billMailAddress as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillMailAddress_LessEqual(String billMailAddress) {
        regBillMailAddress(CK_LE, fRES(billMailAddress));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     * @param billMailAddressList The collection of billMailAddress as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillMailAddress_InScope(Collection<String> billMailAddressList) {
        doSetBillMailAddress_InScope(billMailAddressList);
    }

    protected void doSetBillMailAddress_InScope(Collection<String> billMailAddressList) {
        regINS(CK_INS, cTL(billMailAddressList), xgetCValueBillMailAddress(), "BILL_MAIL_ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     * @param billMailAddressList The collection of billMailAddress as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillMailAddress_NotInScope(Collection<String> billMailAddressList) {
        doSetBillMailAddress_NotInScope(billMailAddressList);
    }

    protected void doSetBillMailAddress_NotInScope(Collection<String> billMailAddressList) {
        regINS(CK_NINS, cTL(billMailAddressList), xgetCValueBillMailAddress(), "BILL_MAIL_ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)} <br>
     * <pre>e.g. setBillMailAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param billMailAddress The value of billMailAddress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBillMailAddress_LikeSearch(String billMailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(billMailAddress), xgetCValueBillMailAddress(), "BILL_MAIL_ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     * @param billMailAddress The value of billMailAddress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBillMailAddress_NotLikeSearch(String billMailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(billMailAddress), xgetCValueBillMailAddress(), "BILL_MAIL_ADDRESS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     * @param billMailAddress The value of billMailAddress as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBillMailAddress_PrefixSearch(String billMailAddress) {
        setBillMailAddress_LikeSearch(billMailAddress, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     */
    public void setBillMailAddress_IsNull() { regBillMailAddress(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     */
    public void setBillMailAddress_IsNullOrEmpty() { regBillMailAddress(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     */
    public void setBillMailAddress_IsNotNull() { regBillMailAddress(CK_ISNN, DOBJ); }

    protected void regBillMailAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBillMailAddress(), "BILL_MAIL_ADDRESS"); }
    protected abstract ConditionValue xgetCValueBillMailAddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_MATHOD: {varchar(60)}
     * @param payMathod The value of payMathod as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathod_Equal(String payMathod) {
        doSetPayMathod_Equal(fRES(payMathod));
    }

    protected void doSetPayMathod_Equal(String payMathod) {
        regPayMathod(CK_EQ, payMathod);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_MATHOD: {varchar(60)}
     * @param payMathod The value of payMathod as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathod_NotEqual(String payMathod) {
        doSetPayMathod_NotEqual(fRES(payMathod));
    }

    protected void doSetPayMathod_NotEqual(String payMathod) {
        regPayMathod(CK_NES, payMathod);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_MATHOD: {varchar(60)}
     * @param payMathod The value of payMathod as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathod_GreaterThan(String payMathod) {
        regPayMathod(CK_GT, fRES(payMathod));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_MATHOD: {varchar(60)}
     * @param payMathod The value of payMathod as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathod_LessThan(String payMathod) {
        regPayMathod(CK_LT, fRES(payMathod));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_MATHOD: {varchar(60)}
     * @param payMathod The value of payMathod as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathod_GreaterEqual(String payMathod) {
        regPayMathod(CK_GE, fRES(payMathod));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_MATHOD: {varchar(60)}
     * @param payMathod The value of payMathod as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathod_LessEqual(String payMathod) {
        regPayMathod(CK_LE, fRES(payMathod));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAY_MATHOD: {varchar(60)}
     * @param payMathodList The collection of payMathod as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathod_InScope(Collection<String> payMathodList) {
        doSetPayMathod_InScope(payMathodList);
    }

    protected void doSetPayMathod_InScope(Collection<String> payMathodList) {
        regINS(CK_INS, cTL(payMathodList), xgetCValuePayMathod(), "PAY_MATHOD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAY_MATHOD: {varchar(60)}
     * @param payMathodList The collection of payMathod as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathod_NotInScope(Collection<String> payMathodList) {
        doSetPayMathod_NotInScope(payMathodList);
    }

    protected void doSetPayMathod_NotInScope(Collection<String> payMathodList) {
        regINS(CK_NINS, cTL(payMathodList), xgetCValuePayMathod(), "PAY_MATHOD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_MATHOD: {varchar(60)} <br>
     * <pre>e.g. setPayMathod_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param payMathod The value of payMathod as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPayMathod_LikeSearch(String payMathod, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(payMathod), xgetCValuePayMathod(), "PAY_MATHOD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_MATHOD: {varchar(60)}
     * @param payMathod The value of payMathod as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPayMathod_NotLikeSearch(String payMathod, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(payMathod), xgetCValuePayMathod(), "PAY_MATHOD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_MATHOD: {varchar(60)}
     * @param payMathod The value of payMathod as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathod_PrefixSearch(String payMathod) {
        setPayMathod_LikeSearch(payMathod, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAY_MATHOD: {varchar(60)}
     */
    public void setPayMathod_IsNull() { regPayMathod(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAY_MATHOD: {varchar(60)}
     */
    public void setPayMathod_IsNullOrEmpty() { regPayMathod(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAY_MATHOD: {varchar(60)}
     */
    public void setPayMathod_IsNotNull() { regPayMathod(CK_ISNN, DOBJ); }

    protected void regPayMathod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePayMathod(), "PAY_MATHOD"); }
    protected abstract ConditionValue xgetCValuePayMathod();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     * @param payMathodName The value of payMathodName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathodName_Equal(String payMathodName) {
        doSetPayMathodName_Equal(fRES(payMathodName));
    }

    protected void doSetPayMathodName_Equal(String payMathodName) {
        regPayMathodName(CK_EQ, payMathodName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     * @param payMathodName The value of payMathodName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathodName_NotEqual(String payMathodName) {
        doSetPayMathodName_NotEqual(fRES(payMathodName));
    }

    protected void doSetPayMathodName_NotEqual(String payMathodName) {
        regPayMathodName(CK_NES, payMathodName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     * @param payMathodName The value of payMathodName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathodName_GreaterThan(String payMathodName) {
        regPayMathodName(CK_GT, fRES(payMathodName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     * @param payMathodName The value of payMathodName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathodName_LessThan(String payMathodName) {
        regPayMathodName(CK_LT, fRES(payMathodName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     * @param payMathodName The value of payMathodName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathodName_GreaterEqual(String payMathodName) {
        regPayMathodName(CK_GE, fRES(payMathodName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     * @param payMathodName The value of payMathodName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathodName_LessEqual(String payMathodName) {
        regPayMathodName(CK_LE, fRES(payMathodName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     * @param payMathodNameList The collection of payMathodName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathodName_InScope(Collection<String> payMathodNameList) {
        doSetPayMathodName_InScope(payMathodNameList);
    }

    protected void doSetPayMathodName_InScope(Collection<String> payMathodNameList) {
        regINS(CK_INS, cTL(payMathodNameList), xgetCValuePayMathodName(), "PAY_MATHOD_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     * @param payMathodNameList The collection of payMathodName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathodName_NotInScope(Collection<String> payMathodNameList) {
        doSetPayMathodName_NotInScope(payMathodNameList);
    }

    protected void doSetPayMathodName_NotInScope(Collection<String> payMathodNameList) {
        regINS(CK_NINS, cTL(payMathodNameList), xgetCValuePayMathodName(), "PAY_MATHOD_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_MATHOD_NAME: {varchar(60)} <br>
     * <pre>e.g. setPayMathodName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param payMathodName The value of payMathodName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPayMathodName_LikeSearch(String payMathodName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(payMathodName), xgetCValuePayMathodName(), "PAY_MATHOD_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     * @param payMathodName The value of payMathodName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPayMathodName_NotLikeSearch(String payMathodName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(payMathodName), xgetCValuePayMathodName(), "PAY_MATHOD_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     * @param payMathodName The value of payMathodName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayMathodName_PrefixSearch(String payMathodName) {
        setPayMathodName_LikeSearch(payMathodName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     */
    public void setPayMathodName_IsNull() { regPayMathodName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     */
    public void setPayMathodName_IsNullOrEmpty() { regPayMathodName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     */
    public void setPayMathodName_IsNotNull() { regPayMathodName(CK_ISNN, DOBJ); }

    protected void regPayMathodName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePayMathodName(), "PAY_MATHOD_NAME"); }
    protected abstract ConditionValue xgetCValuePayMathodName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_KIND: {varchar(60)}
     * @param payKind The value of payKind as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayKind_Equal(String payKind) {
        doSetPayKind_Equal(fRES(payKind));
    }

    protected void doSetPayKind_Equal(String payKind) {
        regPayKind(CK_EQ, payKind);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_KIND: {varchar(60)}
     * @param payKind The value of payKind as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayKind_NotEqual(String payKind) {
        doSetPayKind_NotEqual(fRES(payKind));
    }

    protected void doSetPayKind_NotEqual(String payKind) {
        regPayKind(CK_NES, payKind);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_KIND: {varchar(60)}
     * @param payKind The value of payKind as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayKind_GreaterThan(String payKind) {
        regPayKind(CK_GT, fRES(payKind));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_KIND: {varchar(60)}
     * @param payKind The value of payKind as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayKind_LessThan(String payKind) {
        regPayKind(CK_LT, fRES(payKind));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_KIND: {varchar(60)}
     * @param payKind The value of payKind as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayKind_GreaterEqual(String payKind) {
        regPayKind(CK_GE, fRES(payKind));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_KIND: {varchar(60)}
     * @param payKind The value of payKind as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayKind_LessEqual(String payKind) {
        regPayKind(CK_LE, fRES(payKind));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAY_KIND: {varchar(60)}
     * @param payKindList The collection of payKind as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayKind_InScope(Collection<String> payKindList) {
        doSetPayKind_InScope(payKindList);
    }

    protected void doSetPayKind_InScope(Collection<String> payKindList) {
        regINS(CK_INS, cTL(payKindList), xgetCValuePayKind(), "PAY_KIND");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAY_KIND: {varchar(60)}
     * @param payKindList The collection of payKind as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayKind_NotInScope(Collection<String> payKindList) {
        doSetPayKind_NotInScope(payKindList);
    }

    protected void doSetPayKind_NotInScope(Collection<String> payKindList) {
        regINS(CK_NINS, cTL(payKindList), xgetCValuePayKind(), "PAY_KIND");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_KIND: {varchar(60)} <br>
     * <pre>e.g. setPayKind_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param payKind The value of payKind as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPayKind_LikeSearch(String payKind, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(payKind), xgetCValuePayKind(), "PAY_KIND", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_KIND: {varchar(60)}
     * @param payKind The value of payKind as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPayKind_NotLikeSearch(String payKind, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(payKind), xgetCValuePayKind(), "PAY_KIND", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_KIND: {varchar(60)}
     * @param payKind The value of payKind as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayKind_PrefixSearch(String payKind) {
        setPayKind_LikeSearch(payKind, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAY_KIND: {varchar(60)}
     */
    public void setPayKind_IsNull() { regPayKind(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAY_KIND: {varchar(60)}
     */
    public void setPayKind_IsNullOrEmpty() { regPayKind(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAY_KIND: {varchar(60)}
     */
    public void setPayKind_IsNotNull() { regPayKind(CK_ISNN, DOBJ); }

    protected void regPayKind(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePayKind(), "PAY_KIND"); }
    protected abstract ConditionValue xgetCValuePayKind();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARD_PAY_COUNT: {bigint(19)}
     * @param cardPayCount The value of cardPayCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCardPayCount_Equal(Long cardPayCount) {
        doSetCardPayCount_Equal(cardPayCount);
    }

    protected void doSetCardPayCount_Equal(Long cardPayCount) {
        regCardPayCount(CK_EQ, cardPayCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARD_PAY_COUNT: {bigint(19)}
     * @param cardPayCount The value of cardPayCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCardPayCount_NotEqual(Long cardPayCount) {
        doSetCardPayCount_NotEqual(cardPayCount);
    }

    protected void doSetCardPayCount_NotEqual(Long cardPayCount) {
        regCardPayCount(CK_NES, cardPayCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARD_PAY_COUNT: {bigint(19)}
     * @param cardPayCount The value of cardPayCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCardPayCount_GreaterThan(Long cardPayCount) {
        regCardPayCount(CK_GT, cardPayCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARD_PAY_COUNT: {bigint(19)}
     * @param cardPayCount The value of cardPayCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCardPayCount_LessThan(Long cardPayCount) {
        regCardPayCount(CK_LT, cardPayCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARD_PAY_COUNT: {bigint(19)}
     * @param cardPayCount The value of cardPayCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCardPayCount_GreaterEqual(Long cardPayCount) {
        regCardPayCount(CK_GE, cardPayCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARD_PAY_COUNT: {bigint(19)}
     * @param cardPayCount The value of cardPayCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCardPayCount_LessEqual(Long cardPayCount) {
        regCardPayCount(CK_LE, cardPayCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARD_PAY_COUNT: {bigint(19)}
     * @param minNumber The min number of cardPayCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cardPayCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCardPayCount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCardPayCount(), "CARD_PAY_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARD_PAY_COUNT: {bigint(19)}
     * @param cardPayCountList The collection of cardPayCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardPayCount_InScope(Collection<Long> cardPayCountList) {
        doSetCardPayCount_InScope(cardPayCountList);
    }

    protected void doSetCardPayCount_InScope(Collection<Long> cardPayCountList) {
        regINS(CK_INS, cTL(cardPayCountList), xgetCValueCardPayCount(), "CARD_PAY_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARD_PAY_COUNT: {bigint(19)}
     * @param cardPayCountList The collection of cardPayCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardPayCount_NotInScope(Collection<Long> cardPayCountList) {
        doSetCardPayCount_NotInScope(cardPayCountList);
    }

    protected void doSetCardPayCount_NotInScope(Collection<Long> cardPayCountList) {
        regINS(CK_NINS, cTL(cardPayCountList), xgetCValueCardPayCount(), "CARD_PAY_COUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARD_PAY_COUNT: {bigint(19)}
     */
    public void setCardPayCount_IsNull() { regCardPayCount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARD_PAY_COUNT: {bigint(19)}
     */
    public void setCardPayCount_IsNotNull() { regCardPayCount(CK_ISNN, DOBJ); }

    protected void regCardPayCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCardPayCount(), "CARD_PAY_COUNT"); }
    protected abstract ConditionValue xgetCValueCardPayCount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     * @param cardPayType The value of cardPayType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardPayType_Equal(String cardPayType) {
        doSetCardPayType_Equal(fRES(cardPayType));
    }

    protected void doSetCardPayType_Equal(String cardPayType) {
        regCardPayType(CK_EQ, cardPayType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     * @param cardPayType The value of cardPayType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardPayType_NotEqual(String cardPayType) {
        doSetCardPayType_NotEqual(fRES(cardPayType));
    }

    protected void doSetCardPayType_NotEqual(String cardPayType) {
        regCardPayType(CK_NES, cardPayType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     * @param cardPayType The value of cardPayType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardPayType_GreaterThan(String cardPayType) {
        regCardPayType(CK_GT, fRES(cardPayType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     * @param cardPayType The value of cardPayType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardPayType_LessThan(String cardPayType) {
        regCardPayType(CK_LT, fRES(cardPayType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     * @param cardPayType The value of cardPayType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardPayType_GreaterEqual(String cardPayType) {
        regCardPayType(CK_GE, fRES(cardPayType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     * @param cardPayType The value of cardPayType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardPayType_LessEqual(String cardPayType) {
        regCardPayType(CK_LE, fRES(cardPayType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     * @param cardPayTypeList The collection of cardPayType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardPayType_InScope(Collection<String> cardPayTypeList) {
        doSetCardPayType_InScope(cardPayTypeList);
    }

    protected void doSetCardPayType_InScope(Collection<String> cardPayTypeList) {
        regINS(CK_INS, cTL(cardPayTypeList), xgetCValueCardPayType(), "CARD_PAY_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     * @param cardPayTypeList The collection of cardPayType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardPayType_NotInScope(Collection<String> cardPayTypeList) {
        doSetCardPayType_NotInScope(cardPayTypeList);
    }

    protected void doSetCardPayType_NotInScope(Collection<String> cardPayTypeList) {
        regINS(CK_NINS, cTL(cardPayTypeList), xgetCValueCardPayType(), "CARD_PAY_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_PAY_TYPE: {varchar(60)} <br>
     * <pre>e.g. setCardPayType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cardPayType The value of cardPayType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardPayType_LikeSearch(String cardPayType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cardPayType), xgetCValueCardPayType(), "CARD_PAY_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     * @param cardPayType The value of cardPayType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCardPayType_NotLikeSearch(String cardPayType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cardPayType), xgetCValueCardPayType(), "CARD_PAY_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     * @param cardPayType The value of cardPayType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardPayType_PrefixSearch(String cardPayType) {
        setCardPayType_LikeSearch(cardPayType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     */
    public void setCardPayType_IsNull() { regCardPayType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     */
    public void setCardPayType_IsNullOrEmpty() { regCardPayType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     */
    public void setCardPayType_IsNotNull() { regCardPayType(CK_ISNN, DOBJ); }

    protected void regCardPayType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCardPayType(), "CARD_PAY_TYPE"); }
    protected abstract ConditionValue xgetCValueCardPayType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLE_STATUS: {varchar(60)}
     * @param settleStatus The value of settleStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleStatus_Equal(String settleStatus) {
        doSetSettleStatus_Equal(fRES(settleStatus));
    }

    protected void doSetSettleStatus_Equal(String settleStatus) {
        regSettleStatus(CK_EQ, settleStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLE_STATUS: {varchar(60)}
     * @param settleStatus The value of settleStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleStatus_NotEqual(String settleStatus) {
        doSetSettleStatus_NotEqual(fRES(settleStatus));
    }

    protected void doSetSettleStatus_NotEqual(String settleStatus) {
        regSettleStatus(CK_NES, settleStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLE_STATUS: {varchar(60)}
     * @param settleStatus The value of settleStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleStatus_GreaterThan(String settleStatus) {
        regSettleStatus(CK_GT, fRES(settleStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLE_STATUS: {varchar(60)}
     * @param settleStatus The value of settleStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleStatus_LessThan(String settleStatus) {
        regSettleStatus(CK_LT, fRES(settleStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLE_STATUS: {varchar(60)}
     * @param settleStatus The value of settleStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleStatus_GreaterEqual(String settleStatus) {
        regSettleStatus(CK_GE, fRES(settleStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLE_STATUS: {varchar(60)}
     * @param settleStatus The value of settleStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleStatus_LessEqual(String settleStatus) {
        regSettleStatus(CK_LE, fRES(settleStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SETTLE_STATUS: {varchar(60)}
     * @param settleStatusList The collection of settleStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleStatus_InScope(Collection<String> settleStatusList) {
        doSetSettleStatus_InScope(settleStatusList);
    }

    protected void doSetSettleStatus_InScope(Collection<String> settleStatusList) {
        regINS(CK_INS, cTL(settleStatusList), xgetCValueSettleStatus(), "SETTLE_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SETTLE_STATUS: {varchar(60)}
     * @param settleStatusList The collection of settleStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleStatus_NotInScope(Collection<String> settleStatusList) {
        doSetSettleStatus_NotInScope(settleStatusList);
    }

    protected void doSetSettleStatus_NotInScope(Collection<String> settleStatusList) {
        regINS(CK_NINS, cTL(settleStatusList), xgetCValueSettleStatus(), "SETTLE_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SETTLE_STATUS: {varchar(60)} <br>
     * <pre>e.g. setSettleStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param settleStatus The value of settleStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSettleStatus_LikeSearch(String settleStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(settleStatus), xgetCValueSettleStatus(), "SETTLE_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SETTLE_STATUS: {varchar(60)}
     * @param settleStatus The value of settleStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSettleStatus_NotLikeSearch(String settleStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(settleStatus), xgetCValueSettleStatus(), "SETTLE_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SETTLE_STATUS: {varchar(60)}
     * @param settleStatus The value of settleStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleStatus_PrefixSearch(String settleStatus) {
        setSettleStatus_LikeSearch(settleStatus, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SETTLE_STATUS: {varchar(60)}
     */
    public void setSettleStatus_IsNull() { regSettleStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SETTLE_STATUS: {varchar(60)}
     */
    public void setSettleStatus_IsNullOrEmpty() { regSettleStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SETTLE_STATUS: {varchar(60)}
     */
    public void setSettleStatus_IsNotNull() { regSettleStatus(CK_ISNN, DOBJ); }

    protected void regSettleStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSettleStatus(), "SETTLE_STATUS"); }
    protected abstract ConditionValue xgetCValueSettleStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLE_ID: {varchar(30)}
     * @param settleId The value of settleId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleId_Equal(String settleId) {
        doSetSettleId_Equal(fRES(settleId));
    }

    protected void doSetSettleId_Equal(String settleId) {
        regSettleId(CK_EQ, settleId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLE_ID: {varchar(30)}
     * @param settleId The value of settleId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleId_NotEqual(String settleId) {
        doSetSettleId_NotEqual(fRES(settleId));
    }

    protected void doSetSettleId_NotEqual(String settleId) {
        regSettleId(CK_NES, settleId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLE_ID: {varchar(30)}
     * @param settleId The value of settleId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleId_GreaterThan(String settleId) {
        regSettleId(CK_GT, fRES(settleId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLE_ID: {varchar(30)}
     * @param settleId The value of settleId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleId_LessThan(String settleId) {
        regSettleId(CK_LT, fRES(settleId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLE_ID: {varchar(30)}
     * @param settleId The value of settleId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleId_GreaterEqual(String settleId) {
        regSettleId(CK_GE, fRES(settleId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETTLE_ID: {varchar(30)}
     * @param settleId The value of settleId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleId_LessEqual(String settleId) {
        regSettleId(CK_LE, fRES(settleId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SETTLE_ID: {varchar(30)}
     * @param settleIdList The collection of settleId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleId_InScope(Collection<String> settleIdList) {
        doSetSettleId_InScope(settleIdList);
    }

    protected void doSetSettleId_InScope(Collection<String> settleIdList) {
        regINS(CK_INS, cTL(settleIdList), xgetCValueSettleId(), "SETTLE_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SETTLE_ID: {varchar(30)}
     * @param settleIdList The collection of settleId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleId_NotInScope(Collection<String> settleIdList) {
        doSetSettleId_NotInScope(settleIdList);
    }

    protected void doSetSettleId_NotInScope(Collection<String> settleIdList) {
        regINS(CK_NINS, cTL(settleIdList), xgetCValueSettleId(), "SETTLE_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SETTLE_ID: {varchar(30)} <br>
     * <pre>e.g. setSettleId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param settleId The value of settleId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSettleId_LikeSearch(String settleId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(settleId), xgetCValueSettleId(), "SETTLE_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SETTLE_ID: {varchar(30)}
     * @param settleId The value of settleId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSettleId_NotLikeSearch(String settleId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(settleId), xgetCValueSettleId(), "SETTLE_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SETTLE_ID: {varchar(30)}
     * @param settleId The value of settleId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettleId_PrefixSearch(String settleId) {
        setSettleId_LikeSearch(settleId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SETTLE_ID: {varchar(30)}
     */
    public void setSettleId_IsNull() { regSettleId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SETTLE_ID: {varchar(30)}
     */
    public void setSettleId_IsNullOrEmpty() { regSettleId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SETTLE_ID: {varchar(30)}
     */
    public void setSettleId_IsNotNull() { regSettleId(CK_ISNN, DOBJ); }

    protected void regSettleId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSettleId(), "SETTLE_ID"); }
    protected abstract ConditionValue xgetCValueSettleId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_NO: {varchar(30)}
     * @param payNo The value of payNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNo_Equal(String payNo) {
        doSetPayNo_Equal(fRES(payNo));
    }

    protected void doSetPayNo_Equal(String payNo) {
        regPayNo(CK_EQ, payNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_NO: {varchar(30)}
     * @param payNo The value of payNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNo_NotEqual(String payNo) {
        doSetPayNo_NotEqual(fRES(payNo));
    }

    protected void doSetPayNo_NotEqual(String payNo) {
        regPayNo(CK_NES, payNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_NO: {varchar(30)}
     * @param payNo The value of payNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNo_GreaterThan(String payNo) {
        regPayNo(CK_GT, fRES(payNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_NO: {varchar(30)}
     * @param payNo The value of payNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNo_LessThan(String payNo) {
        regPayNo(CK_LT, fRES(payNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_NO: {varchar(30)}
     * @param payNo The value of payNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNo_GreaterEqual(String payNo) {
        regPayNo(CK_GE, fRES(payNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_NO: {varchar(30)}
     * @param payNo The value of payNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNo_LessEqual(String payNo) {
        regPayNo(CK_LE, fRES(payNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAY_NO: {varchar(30)}
     * @param payNoList The collection of payNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNo_InScope(Collection<String> payNoList) {
        doSetPayNo_InScope(payNoList);
    }

    protected void doSetPayNo_InScope(Collection<String> payNoList) {
        regINS(CK_INS, cTL(payNoList), xgetCValuePayNo(), "PAY_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAY_NO: {varchar(30)}
     * @param payNoList The collection of payNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNo_NotInScope(Collection<String> payNoList) {
        doSetPayNo_NotInScope(payNoList);
    }

    protected void doSetPayNo_NotInScope(Collection<String> payNoList) {
        regINS(CK_NINS, cTL(payNoList), xgetCValuePayNo(), "PAY_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_NO: {varchar(30)} <br>
     * <pre>e.g. setPayNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param payNo The value of payNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPayNo_LikeSearch(String payNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(payNo), xgetCValuePayNo(), "PAY_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_NO: {varchar(30)}
     * @param payNo The value of payNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPayNo_NotLikeSearch(String payNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(payNo), xgetCValuePayNo(), "PAY_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_NO: {varchar(30)}
     * @param payNo The value of payNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNo_PrefixSearch(String payNo) {
        setPayNo_LikeSearch(payNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAY_NO: {varchar(30)}
     */
    public void setPayNo_IsNull() { regPayNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAY_NO: {varchar(30)}
     */
    public void setPayNo_IsNullOrEmpty() { regPayNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAY_NO: {varchar(30)}
     */
    public void setPayNo_IsNotNull() { regPayNo(CK_ISNN, DOBJ); }

    protected void regPayNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePayNo(), "PAY_NO"); }
    protected abstract ConditionValue xgetCValuePayNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     * @param payNoIssueDate The value of payNoIssueDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNoIssueDate_Equal(String payNoIssueDate) {
        doSetPayNoIssueDate_Equal(fRES(payNoIssueDate));
    }

    protected void doSetPayNoIssueDate_Equal(String payNoIssueDate) {
        regPayNoIssueDate(CK_EQ, payNoIssueDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     * @param payNoIssueDate The value of payNoIssueDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNoIssueDate_NotEqual(String payNoIssueDate) {
        doSetPayNoIssueDate_NotEqual(fRES(payNoIssueDate));
    }

    protected void doSetPayNoIssueDate_NotEqual(String payNoIssueDate) {
        regPayNoIssueDate(CK_NES, payNoIssueDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     * @param payNoIssueDate The value of payNoIssueDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNoIssueDate_GreaterThan(String payNoIssueDate) {
        regPayNoIssueDate(CK_GT, fRES(payNoIssueDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     * @param payNoIssueDate The value of payNoIssueDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNoIssueDate_LessThan(String payNoIssueDate) {
        regPayNoIssueDate(CK_LT, fRES(payNoIssueDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     * @param payNoIssueDate The value of payNoIssueDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNoIssueDate_GreaterEqual(String payNoIssueDate) {
        regPayNoIssueDate(CK_GE, fRES(payNoIssueDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     * @param payNoIssueDate The value of payNoIssueDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNoIssueDate_LessEqual(String payNoIssueDate) {
        regPayNoIssueDate(CK_LE, fRES(payNoIssueDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     * @param payNoIssueDateList The collection of payNoIssueDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNoIssueDate_InScope(Collection<String> payNoIssueDateList) {
        doSetPayNoIssueDate_InScope(payNoIssueDateList);
    }

    protected void doSetPayNoIssueDate_InScope(Collection<String> payNoIssueDateList) {
        regINS(CK_INS, cTL(payNoIssueDateList), xgetCValuePayNoIssueDate(), "PAY_NO_ISSUE_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     * @param payNoIssueDateList The collection of payNoIssueDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNoIssueDate_NotInScope(Collection<String> payNoIssueDateList) {
        doSetPayNoIssueDate_NotInScope(payNoIssueDateList);
    }

    protected void doSetPayNoIssueDate_NotInScope(Collection<String> payNoIssueDateList) {
        regINS(CK_NINS, cTL(payNoIssueDateList), xgetCValuePayNoIssueDate(), "PAY_NO_ISSUE_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)} <br>
     * <pre>e.g. setPayNoIssueDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param payNoIssueDate The value of payNoIssueDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPayNoIssueDate_LikeSearch(String payNoIssueDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(payNoIssueDate), xgetCValuePayNoIssueDate(), "PAY_NO_ISSUE_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     * @param payNoIssueDate The value of payNoIssueDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPayNoIssueDate_NotLikeSearch(String payNoIssueDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(payNoIssueDate), xgetCValuePayNoIssueDate(), "PAY_NO_ISSUE_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     * @param payNoIssueDate The value of payNoIssueDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayNoIssueDate_PrefixSearch(String payNoIssueDate) {
        setPayNoIssueDate_LikeSearch(payNoIssueDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     */
    public void setPayNoIssueDate_IsNull() { regPayNoIssueDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     */
    public void setPayNoIssueDate_IsNullOrEmpty() { regPayNoIssueDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     */
    public void setPayNoIssueDate_IsNotNull() { regPayNoIssueDate(CK_ISNN, DOBJ); }

    protected void regPayNoIssueDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePayNoIssueDate(), "PAY_NO_ISSUE_DATE"); }
    protected abstract ConditionValue xgetCValuePayNoIssueDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_DATE: {varchar(30)}
     * @param payDate The value of payDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayDate_Equal(String payDate) {
        doSetPayDate_Equal(fRES(payDate));
    }

    protected void doSetPayDate_Equal(String payDate) {
        regPayDate(CK_EQ, payDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_DATE: {varchar(30)}
     * @param payDate The value of payDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayDate_NotEqual(String payDate) {
        doSetPayDate_NotEqual(fRES(payDate));
    }

    protected void doSetPayDate_NotEqual(String payDate) {
        regPayDate(CK_NES, payDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_DATE: {varchar(30)}
     * @param payDate The value of payDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayDate_GreaterThan(String payDate) {
        regPayDate(CK_GT, fRES(payDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_DATE: {varchar(30)}
     * @param payDate The value of payDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayDate_LessThan(String payDate) {
        regPayDate(CK_LT, fRES(payDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_DATE: {varchar(30)}
     * @param payDate The value of payDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayDate_GreaterEqual(String payDate) {
        regPayDate(CK_GE, fRES(payDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAY_DATE: {varchar(30)}
     * @param payDate The value of payDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayDate_LessEqual(String payDate) {
        regPayDate(CK_LE, fRES(payDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAY_DATE: {varchar(30)}
     * @param payDateList The collection of payDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayDate_InScope(Collection<String> payDateList) {
        doSetPayDate_InScope(payDateList);
    }

    protected void doSetPayDate_InScope(Collection<String> payDateList) {
        regINS(CK_INS, cTL(payDateList), xgetCValuePayDate(), "PAY_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAY_DATE: {varchar(30)}
     * @param payDateList The collection of payDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayDate_NotInScope(Collection<String> payDateList) {
        doSetPayDate_NotInScope(payDateList);
    }

    protected void doSetPayDate_NotInScope(Collection<String> payDateList) {
        regINS(CK_NINS, cTL(payDateList), xgetCValuePayDate(), "PAY_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_DATE: {varchar(30)} <br>
     * <pre>e.g. setPayDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param payDate The value of payDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPayDate_LikeSearch(String payDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(payDate), xgetCValuePayDate(), "PAY_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_DATE: {varchar(30)}
     * @param payDate The value of payDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPayDate_NotLikeSearch(String payDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(payDate), xgetCValuePayDate(), "PAY_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAY_DATE: {varchar(30)}
     * @param payDate The value of payDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayDate_PrefixSearch(String payDate) {
        setPayDate_LikeSearch(payDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAY_DATE: {varchar(30)}
     */
    public void setPayDate_IsNull() { regPayDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAY_DATE: {varchar(30)}
     */
    public void setPayDate_IsNullOrEmpty() { regPayDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAY_DATE: {varchar(30)}
     */
    public void setPayDate_IsNotNull() { regPayDate(CK_ISNN, DOBJ); }

    protected void regPayDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePayDate(), "PAY_DATE"); }
    protected abstract ConditionValue xgetCValuePayDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_COMMENTS: {varchar(60)}
     * @param buyerComments The value of buyerComments as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerComments_Equal(String buyerComments) {
        doSetBuyerComments_Equal(fRES(buyerComments));
    }

    protected void doSetBuyerComments_Equal(String buyerComments) {
        regBuyerComments(CK_EQ, buyerComments);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_COMMENTS: {varchar(60)}
     * @param buyerComments The value of buyerComments as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerComments_NotEqual(String buyerComments) {
        doSetBuyerComments_NotEqual(fRES(buyerComments));
    }

    protected void doSetBuyerComments_NotEqual(String buyerComments) {
        regBuyerComments(CK_NES, buyerComments);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_COMMENTS: {varchar(60)}
     * @param buyerComments The value of buyerComments as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerComments_GreaterThan(String buyerComments) {
        regBuyerComments(CK_GT, fRES(buyerComments));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_COMMENTS: {varchar(60)}
     * @param buyerComments The value of buyerComments as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerComments_LessThan(String buyerComments) {
        regBuyerComments(CK_LT, fRES(buyerComments));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_COMMENTS: {varchar(60)}
     * @param buyerComments The value of buyerComments as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerComments_GreaterEqual(String buyerComments) {
        regBuyerComments(CK_GE, fRES(buyerComments));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_COMMENTS: {varchar(60)}
     * @param buyerComments The value of buyerComments as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerComments_LessEqual(String buyerComments) {
        regBuyerComments(CK_LE, fRES(buyerComments));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BUYER_COMMENTS: {varchar(60)}
     * @param buyerCommentsList The collection of buyerComments as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerComments_InScope(Collection<String> buyerCommentsList) {
        doSetBuyerComments_InScope(buyerCommentsList);
    }

    protected void doSetBuyerComments_InScope(Collection<String> buyerCommentsList) {
        regINS(CK_INS, cTL(buyerCommentsList), xgetCValueBuyerComments(), "BUYER_COMMENTS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BUYER_COMMENTS: {varchar(60)}
     * @param buyerCommentsList The collection of buyerComments as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerComments_NotInScope(Collection<String> buyerCommentsList) {
        doSetBuyerComments_NotInScope(buyerCommentsList);
    }

    protected void doSetBuyerComments_NotInScope(Collection<String> buyerCommentsList) {
        regINS(CK_NINS, cTL(buyerCommentsList), xgetCValueBuyerComments(), "BUYER_COMMENTS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUYER_COMMENTS: {varchar(60)} <br>
     * <pre>e.g. setBuyerComments_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param buyerComments The value of buyerComments as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBuyerComments_LikeSearch(String buyerComments, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(buyerComments), xgetCValueBuyerComments(), "BUYER_COMMENTS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUYER_COMMENTS: {varchar(60)}
     * @param buyerComments The value of buyerComments as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBuyerComments_NotLikeSearch(String buyerComments, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(buyerComments), xgetCValueBuyerComments(), "BUYER_COMMENTS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUYER_COMMENTS: {varchar(60)}
     * @param buyerComments The value of buyerComments as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerComments_PrefixSearch(String buyerComments) {
        setBuyerComments_LikeSearch(buyerComments, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BUYER_COMMENTS: {varchar(60)}
     */
    public void setBuyerComments_IsNull() { regBuyerComments(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BUYER_COMMENTS: {varchar(60)}
     */
    public void setBuyerComments_IsNullOrEmpty() { regBuyerComments(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BUYER_COMMENTS: {varchar(60)}
     */
    public void setBuyerComments_IsNotNull() { regBuyerComments(CK_ISNN, DOBJ); }

    protected void regBuyerComments(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBuyerComments(), "BUYER_COMMENTS"); }
    protected abstract ConditionValue xgetCValueBuyerComments();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AGE_CONFIRM: {varchar(60)}
     * @param ageConfirm The value of ageConfirm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgeConfirm_Equal(String ageConfirm) {
        doSetAgeConfirm_Equal(fRES(ageConfirm));
    }

    protected void doSetAgeConfirm_Equal(String ageConfirm) {
        regAgeConfirm(CK_EQ, ageConfirm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AGE_CONFIRM: {varchar(60)}
     * @param ageConfirm The value of ageConfirm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgeConfirm_NotEqual(String ageConfirm) {
        doSetAgeConfirm_NotEqual(fRES(ageConfirm));
    }

    protected void doSetAgeConfirm_NotEqual(String ageConfirm) {
        regAgeConfirm(CK_NES, ageConfirm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AGE_CONFIRM: {varchar(60)}
     * @param ageConfirm The value of ageConfirm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgeConfirm_GreaterThan(String ageConfirm) {
        regAgeConfirm(CK_GT, fRES(ageConfirm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AGE_CONFIRM: {varchar(60)}
     * @param ageConfirm The value of ageConfirm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgeConfirm_LessThan(String ageConfirm) {
        regAgeConfirm(CK_LT, fRES(ageConfirm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AGE_CONFIRM: {varchar(60)}
     * @param ageConfirm The value of ageConfirm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgeConfirm_GreaterEqual(String ageConfirm) {
        regAgeConfirm(CK_GE, fRES(ageConfirm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AGE_CONFIRM: {varchar(60)}
     * @param ageConfirm The value of ageConfirm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgeConfirm_LessEqual(String ageConfirm) {
        regAgeConfirm(CK_LE, fRES(ageConfirm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AGE_CONFIRM: {varchar(60)}
     * @param ageConfirmList The collection of ageConfirm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgeConfirm_InScope(Collection<String> ageConfirmList) {
        doSetAgeConfirm_InScope(ageConfirmList);
    }

    protected void doSetAgeConfirm_InScope(Collection<String> ageConfirmList) {
        regINS(CK_INS, cTL(ageConfirmList), xgetCValueAgeConfirm(), "AGE_CONFIRM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AGE_CONFIRM: {varchar(60)}
     * @param ageConfirmList The collection of ageConfirm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgeConfirm_NotInScope(Collection<String> ageConfirmList) {
        doSetAgeConfirm_NotInScope(ageConfirmList);
    }

    protected void doSetAgeConfirm_NotInScope(Collection<String> ageConfirmList) {
        regINS(CK_NINS, cTL(ageConfirmList), xgetCValueAgeConfirm(), "AGE_CONFIRM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AGE_CONFIRM: {varchar(60)} <br>
     * <pre>e.g. setAgeConfirm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ageConfirm The value of ageConfirm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAgeConfirm_LikeSearch(String ageConfirm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ageConfirm), xgetCValueAgeConfirm(), "AGE_CONFIRM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AGE_CONFIRM: {varchar(60)}
     * @param ageConfirm The value of ageConfirm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAgeConfirm_NotLikeSearch(String ageConfirm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ageConfirm), xgetCValueAgeConfirm(), "AGE_CONFIRM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AGE_CONFIRM: {varchar(60)}
     * @param ageConfirm The value of ageConfirm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAgeConfirm_PrefixSearch(String ageConfirm) {
        setAgeConfirm_LikeSearch(ageConfirm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AGE_CONFIRM: {varchar(60)}
     */
    public void setAgeConfirm_IsNull() { regAgeConfirm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AGE_CONFIRM: {varchar(60)}
     */
    public void setAgeConfirm_IsNullOrEmpty() { regAgeConfirm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AGE_CONFIRM: {varchar(60)}
     */
    public void setAgeConfirm_IsNotNull() { regAgeConfirm(CK_ISNN, DOBJ); }

    protected void regAgeConfirm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAgeConfirm(), "AGE_CONFIRM"); }
    protected abstract ConditionValue xgetCValueAgeConfirm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_DETAIL: {bigint(19)}
     * @param quantityDetail The value of quantityDetail as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantityDetail_Equal(Long quantityDetail) {
        doSetQuantityDetail_Equal(quantityDetail);
    }

    protected void doSetQuantityDetail_Equal(Long quantityDetail) {
        regQuantityDetail(CK_EQ, quantityDetail);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_DETAIL: {bigint(19)}
     * @param quantityDetail The value of quantityDetail as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantityDetail_NotEqual(Long quantityDetail) {
        doSetQuantityDetail_NotEqual(quantityDetail);
    }

    protected void doSetQuantityDetail_NotEqual(Long quantityDetail) {
        regQuantityDetail(CK_NES, quantityDetail);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_DETAIL: {bigint(19)}
     * @param quantityDetail The value of quantityDetail as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantityDetail_GreaterThan(Long quantityDetail) {
        regQuantityDetail(CK_GT, quantityDetail);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_DETAIL: {bigint(19)}
     * @param quantityDetail The value of quantityDetail as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantityDetail_LessThan(Long quantityDetail) {
        regQuantityDetail(CK_LT, quantityDetail);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_DETAIL: {bigint(19)}
     * @param quantityDetail The value of quantityDetail as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantityDetail_GreaterEqual(Long quantityDetail) {
        regQuantityDetail(CK_GE, quantityDetail);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_DETAIL: {bigint(19)}
     * @param quantityDetail The value of quantityDetail as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantityDetail_LessEqual(Long quantityDetail) {
        regQuantityDetail(CK_LE, quantityDetail);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_DETAIL: {bigint(19)}
     * @param minNumber The min number of quantityDetail. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of quantityDetail. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQuantityDetail_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQuantityDetail(), "QUANTITY_DETAIL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QUANTITY_DETAIL: {bigint(19)}
     * @param quantityDetailList The collection of quantityDetail as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantityDetail_InScope(Collection<Long> quantityDetailList) {
        doSetQuantityDetail_InScope(quantityDetailList);
    }

    protected void doSetQuantityDetail_InScope(Collection<Long> quantityDetailList) {
        regINS(CK_INS, cTL(quantityDetailList), xgetCValueQuantityDetail(), "QUANTITY_DETAIL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QUANTITY_DETAIL: {bigint(19)}
     * @param quantityDetailList The collection of quantityDetail as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantityDetail_NotInScope(Collection<Long> quantityDetailList) {
        doSetQuantityDetail_NotInScope(quantityDetailList);
    }

    protected void doSetQuantityDetail_NotInScope(Collection<Long> quantityDetailList) {
        regINS(CK_NINS, cTL(quantityDetailList), xgetCValueQuantityDetail(), "QUANTITY_DETAIL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QUANTITY_DETAIL: {bigint(19)}
     */
    public void setQuantityDetail_IsNull() { regQuantityDetail(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QUANTITY_DETAIL: {bigint(19)}
     */
    public void setQuantityDetail_IsNotNull() { regQuantityDetail(CK_ISNN, DOBJ); }

    protected void regQuantityDetail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQuantityDetail(), "QUANTITY_DETAIL"); }
    protected abstract ConditionValue xgetCValueQuantityDetail();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIP_CHARGE: {bigint(19)}
     * @param shipCharge The value of shipCharge as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipCharge_Equal(Long shipCharge) {
        doSetShipCharge_Equal(shipCharge);
    }

    protected void doSetShipCharge_Equal(Long shipCharge) {
        regShipCharge(CK_EQ, shipCharge);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIP_CHARGE: {bigint(19)}
     * @param shipCharge The value of shipCharge as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipCharge_NotEqual(Long shipCharge) {
        doSetShipCharge_NotEqual(shipCharge);
    }

    protected void doSetShipCharge_NotEqual(Long shipCharge) {
        regShipCharge(CK_NES, shipCharge);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIP_CHARGE: {bigint(19)}
     * @param shipCharge The value of shipCharge as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipCharge_GreaterThan(Long shipCharge) {
        regShipCharge(CK_GT, shipCharge);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIP_CHARGE: {bigint(19)}
     * @param shipCharge The value of shipCharge as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipCharge_LessThan(Long shipCharge) {
        regShipCharge(CK_LT, shipCharge);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIP_CHARGE: {bigint(19)}
     * @param shipCharge The value of shipCharge as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipCharge_GreaterEqual(Long shipCharge) {
        regShipCharge(CK_GE, shipCharge);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIP_CHARGE: {bigint(19)}
     * @param shipCharge The value of shipCharge as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipCharge_LessEqual(Long shipCharge) {
        regShipCharge(CK_LE, shipCharge);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIP_CHARGE: {bigint(19)}
     * @param minNumber The min number of shipCharge. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shipCharge. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShipCharge_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShipCharge(), "SHIP_CHARGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIP_CHARGE: {bigint(19)}
     * @param shipChargeList The collection of shipCharge as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCharge_InScope(Collection<Long> shipChargeList) {
        doSetShipCharge_InScope(shipChargeList);
    }

    protected void doSetShipCharge_InScope(Collection<Long> shipChargeList) {
        regINS(CK_INS, cTL(shipChargeList), xgetCValueShipCharge(), "SHIP_CHARGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIP_CHARGE: {bigint(19)}
     * @param shipChargeList The collection of shipCharge as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCharge_NotInScope(Collection<Long> shipChargeList) {
        doSetShipCharge_NotInScope(shipChargeList);
    }

    protected void doSetShipCharge_NotInScope(Collection<Long> shipChargeList) {
        regINS(CK_NINS, cTL(shipChargeList), xgetCValueShipCharge(), "SHIP_CHARGE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_CHARGE: {bigint(19)}
     */
    public void setShipCharge_IsNull() { regShipCharge(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_CHARGE: {bigint(19)}
     */
    public void setShipCharge_IsNotNull() { regShipCharge(CK_ISNN, DOBJ); }

    protected void regShipCharge(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipCharge(), "SHIP_CHARGE"); }
    protected abstract ConditionValue xgetCValueShipCharge();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PAY_CHARGE: {bigint(19)}
     * @param payCharge The value of payCharge as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPayCharge_Equal(Long payCharge) {
        doSetPayCharge_Equal(payCharge);
    }

    protected void doSetPayCharge_Equal(Long payCharge) {
        regPayCharge(CK_EQ, payCharge);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PAY_CHARGE: {bigint(19)}
     * @param payCharge The value of payCharge as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPayCharge_NotEqual(Long payCharge) {
        doSetPayCharge_NotEqual(payCharge);
    }

    protected void doSetPayCharge_NotEqual(Long payCharge) {
        regPayCharge(CK_NES, payCharge);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PAY_CHARGE: {bigint(19)}
     * @param payCharge The value of payCharge as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPayCharge_GreaterThan(Long payCharge) {
        regPayCharge(CK_GT, payCharge);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PAY_CHARGE: {bigint(19)}
     * @param payCharge The value of payCharge as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPayCharge_LessThan(Long payCharge) {
        regPayCharge(CK_LT, payCharge);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PAY_CHARGE: {bigint(19)}
     * @param payCharge The value of payCharge as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPayCharge_GreaterEqual(Long payCharge) {
        regPayCharge(CK_GE, payCharge);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PAY_CHARGE: {bigint(19)}
     * @param payCharge The value of payCharge as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPayCharge_LessEqual(Long payCharge) {
        regPayCharge(CK_LE, payCharge);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PAY_CHARGE: {bigint(19)}
     * @param minNumber The min number of payCharge. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of payCharge. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPayCharge_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePayCharge(), "PAY_CHARGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PAY_CHARGE: {bigint(19)}
     * @param payChargeList The collection of payCharge as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayCharge_InScope(Collection<Long> payChargeList) {
        doSetPayCharge_InScope(payChargeList);
    }

    protected void doSetPayCharge_InScope(Collection<Long> payChargeList) {
        regINS(CK_INS, cTL(payChargeList), xgetCValuePayCharge(), "PAY_CHARGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PAY_CHARGE: {bigint(19)}
     * @param payChargeList The collection of payCharge as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPayCharge_NotInScope(Collection<Long> payChargeList) {
        doSetPayCharge_NotInScope(payChargeList);
    }

    protected void doSetPayCharge_NotInScope(Collection<Long> payChargeList) {
        regINS(CK_NINS, cTL(payChargeList), xgetCValuePayCharge(), "PAY_CHARGE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAY_CHARGE: {bigint(19)}
     */
    public void setPayCharge_IsNull() { regPayCharge(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAY_CHARGE: {bigint(19)}
     */
    public void setPayCharge_IsNotNull() { regPayCharge(CK_ISNN, DOBJ); }

    protected void regPayCharge(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePayCharge(), "PAY_CHARGE"); }
    protected abstract ConditionValue xgetCValuePayCharge();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_CHARGE: {bigint(19)}
     * @param giftWrapCharge The value of giftWrapCharge as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapCharge_Equal(Long giftWrapCharge) {
        doSetGiftWrapCharge_Equal(giftWrapCharge);
    }

    protected void doSetGiftWrapCharge_Equal(Long giftWrapCharge) {
        regGiftWrapCharge(CK_EQ, giftWrapCharge);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_CHARGE: {bigint(19)}
     * @param giftWrapCharge The value of giftWrapCharge as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapCharge_NotEqual(Long giftWrapCharge) {
        doSetGiftWrapCharge_NotEqual(giftWrapCharge);
    }

    protected void doSetGiftWrapCharge_NotEqual(Long giftWrapCharge) {
        regGiftWrapCharge(CK_NES, giftWrapCharge);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_CHARGE: {bigint(19)}
     * @param giftWrapCharge The value of giftWrapCharge as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapCharge_GreaterThan(Long giftWrapCharge) {
        regGiftWrapCharge(CK_GT, giftWrapCharge);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_CHARGE: {bigint(19)}
     * @param giftWrapCharge The value of giftWrapCharge as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapCharge_LessThan(Long giftWrapCharge) {
        regGiftWrapCharge(CK_LT, giftWrapCharge);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_CHARGE: {bigint(19)}
     * @param giftWrapCharge The value of giftWrapCharge as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapCharge_GreaterEqual(Long giftWrapCharge) {
        regGiftWrapCharge(CK_GE, giftWrapCharge);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_CHARGE: {bigint(19)}
     * @param giftWrapCharge The value of giftWrapCharge as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapCharge_LessEqual(Long giftWrapCharge) {
        regGiftWrapCharge(CK_LE, giftWrapCharge);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_CHARGE: {bigint(19)}
     * @param minNumber The min number of giftWrapCharge. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of giftWrapCharge. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGiftWrapCharge_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGiftWrapCharge(), "GIFT_WRAP_CHARGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_CHARGE: {bigint(19)}
     * @param giftWrapChargeList The collection of giftWrapCharge as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapCharge_InScope(Collection<Long> giftWrapChargeList) {
        doSetGiftWrapCharge_InScope(giftWrapChargeList);
    }

    protected void doSetGiftWrapCharge_InScope(Collection<Long> giftWrapChargeList) {
        regINS(CK_INS, cTL(giftWrapChargeList), xgetCValueGiftWrapCharge(), "GIFT_WRAP_CHARGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_CHARGE: {bigint(19)}
     * @param giftWrapChargeList The collection of giftWrapCharge as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapCharge_NotInScope(Collection<Long> giftWrapChargeList) {
        doSetGiftWrapCharge_NotInScope(giftWrapChargeList);
    }

    protected void doSetGiftWrapCharge_NotInScope(Collection<Long> giftWrapChargeList) {
        regINS(CK_NINS, cTL(giftWrapChargeList), xgetCValueGiftWrapCharge(), "GIFT_WRAP_CHARGE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_CHARGE: {bigint(19)}
     */
    public void setGiftWrapCharge_IsNull() { regGiftWrapCharge(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_CHARGE: {bigint(19)}
     */
    public void setGiftWrapCharge_IsNotNull() { regGiftWrapCharge(CK_ISNN, DOBJ); }

    protected void regGiftWrapCharge(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiftWrapCharge(), "GIFT_WRAP_CHARGE"); }
    protected abstract ConditionValue xgetCValueGiftWrapCharge();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DISCOUNT: {bigint(19)}
     * @param discount The value of discount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiscount_Equal(Long discount) {
        doSetDiscount_Equal(discount);
    }

    protected void doSetDiscount_Equal(Long discount) {
        regDiscount(CK_EQ, discount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DISCOUNT: {bigint(19)}
     * @param discount The value of discount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiscount_NotEqual(Long discount) {
        doSetDiscount_NotEqual(discount);
    }

    protected void doSetDiscount_NotEqual(Long discount) {
        regDiscount(CK_NES, discount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DISCOUNT: {bigint(19)}
     * @param discount The value of discount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiscount_GreaterThan(Long discount) {
        regDiscount(CK_GT, discount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DISCOUNT: {bigint(19)}
     * @param discount The value of discount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiscount_LessThan(Long discount) {
        regDiscount(CK_LT, discount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DISCOUNT: {bigint(19)}
     * @param discount The value of discount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiscount_GreaterEqual(Long discount) {
        regDiscount(CK_GE, discount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DISCOUNT: {bigint(19)}
     * @param discount The value of discount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiscount_LessEqual(Long discount) {
        regDiscount(CK_LE, discount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DISCOUNT: {bigint(19)}
     * @param minNumber The min number of discount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of discount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDiscount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDiscount(), "DISCOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DISCOUNT: {bigint(19)}
     * @param discountList The collection of discount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiscount_InScope(Collection<Long> discountList) {
        doSetDiscount_InScope(discountList);
    }

    protected void doSetDiscount_InScope(Collection<Long> discountList) {
        regINS(CK_INS, cTL(discountList), xgetCValueDiscount(), "DISCOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DISCOUNT: {bigint(19)}
     * @param discountList The collection of discount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiscount_NotInScope(Collection<Long> discountList) {
        doSetDiscount_NotInScope(discountList);
    }

    protected void doSetDiscount_NotInScope(Collection<Long> discountList) {
        regINS(CK_NINS, cTL(discountList), xgetCValueDiscount(), "DISCOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISCOUNT: {bigint(19)}
     */
    public void setDiscount_IsNull() { regDiscount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISCOUNT: {bigint(19)}
     */
    public void setDiscount_IsNotNull() { regDiscount(CK_ISNN, DOBJ); }

    protected void regDiscount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDiscount(), "DISCOUNT"); }
    protected abstract ConditionValue xgetCValueDiscount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTMENTS: {bigint(19)}
     * @param adjustments The value of adjustments as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustments_Equal(Long adjustments) {
        doSetAdjustments_Equal(adjustments);
    }

    protected void doSetAdjustments_Equal(Long adjustments) {
        regAdjustments(CK_EQ, adjustments);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTMENTS: {bigint(19)}
     * @param adjustments The value of adjustments as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustments_NotEqual(Long adjustments) {
        doSetAdjustments_NotEqual(adjustments);
    }

    protected void doSetAdjustments_NotEqual(Long adjustments) {
        regAdjustments(CK_NES, adjustments);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTMENTS: {bigint(19)}
     * @param adjustments The value of adjustments as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustments_GreaterThan(Long adjustments) {
        regAdjustments(CK_GT, adjustments);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTMENTS: {bigint(19)}
     * @param adjustments The value of adjustments as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustments_LessThan(Long adjustments) {
        regAdjustments(CK_LT, adjustments);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTMENTS: {bigint(19)}
     * @param adjustments The value of adjustments as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustments_GreaterEqual(Long adjustments) {
        regAdjustments(CK_GE, adjustments);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTMENTS: {bigint(19)}
     * @param adjustments The value of adjustments as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustments_LessEqual(Long adjustments) {
        regAdjustments(CK_LE, adjustments);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTMENTS: {bigint(19)}
     * @param minNumber The min number of adjustments. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustments. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustments_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustments(), "ADJUSTMENTS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTMENTS: {bigint(19)}
     * @param adjustmentsList The collection of adjustments as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustments_InScope(Collection<Long> adjustmentsList) {
        doSetAdjustments_InScope(adjustmentsList);
    }

    protected void doSetAdjustments_InScope(Collection<Long> adjustmentsList) {
        regINS(CK_INS, cTL(adjustmentsList), xgetCValueAdjustments(), "ADJUSTMENTS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTMENTS: {bigint(19)}
     * @param adjustmentsList The collection of adjustments as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustments_NotInScope(Collection<Long> adjustmentsList) {
        doSetAdjustments_NotInScope(adjustmentsList);
    }

    protected void doSetAdjustments_NotInScope(Collection<Long> adjustmentsList) {
        regINS(CK_NINS, cTL(adjustmentsList), xgetCValueAdjustments(), "ADJUSTMENTS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTMENTS: {bigint(19)}
     */
    public void setAdjustments_IsNull() { regAdjustments(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTMENTS: {bigint(19)}
     */
    public void setAdjustments_IsNotNull() { regAdjustments(CK_ISNN, DOBJ); }

    protected void regAdjustments(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustments(), "ADJUSTMENTS"); }
    protected abstract ConditionValue xgetCValueAdjustments();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_POINT: {bigint(19)}
     * @param usePoint The value of usePoint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsePoint_Equal(Long usePoint) {
        doSetUsePoint_Equal(usePoint);
    }

    protected void doSetUsePoint_Equal(Long usePoint) {
        regUsePoint(CK_EQ, usePoint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_POINT: {bigint(19)}
     * @param usePoint The value of usePoint as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsePoint_NotEqual(Long usePoint) {
        doSetUsePoint_NotEqual(usePoint);
    }

    protected void doSetUsePoint_NotEqual(Long usePoint) {
        regUsePoint(CK_NES, usePoint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_POINT: {bigint(19)}
     * @param usePoint The value of usePoint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsePoint_GreaterThan(Long usePoint) {
        regUsePoint(CK_GT, usePoint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_POINT: {bigint(19)}
     * @param usePoint The value of usePoint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsePoint_LessThan(Long usePoint) {
        regUsePoint(CK_LT, usePoint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_POINT: {bigint(19)}
     * @param usePoint The value of usePoint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsePoint_GreaterEqual(Long usePoint) {
        regUsePoint(CK_GE, usePoint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_POINT: {bigint(19)}
     * @param usePoint The value of usePoint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsePoint_LessEqual(Long usePoint) {
        regUsePoint(CK_LE, usePoint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USE_POINT: {bigint(19)}
     * @param minNumber The min number of usePoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of usePoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUsePoint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUsePoint(), "USE_POINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USE_POINT: {bigint(19)}
     * @param usePointList The collection of usePoint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsePoint_InScope(Collection<Long> usePointList) {
        doSetUsePoint_InScope(usePointList);
    }

    protected void doSetUsePoint_InScope(Collection<Long> usePointList) {
        regINS(CK_INS, cTL(usePointList), xgetCValueUsePoint(), "USE_POINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USE_POINT: {bigint(19)}
     * @param usePointList The collection of usePoint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsePoint_NotInScope(Collection<Long> usePointList) {
        doSetUsePoint_NotInScope(usePointList);
    }

    protected void doSetUsePoint_NotInScope(Collection<Long> usePointList) {
        regINS(CK_NINS, cTL(usePointList), xgetCValueUsePoint(), "USE_POINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USE_POINT: {bigint(19)}
     */
    public void setUsePoint_IsNull() { regUsePoint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USE_POINT: {bigint(19)}
     */
    public void setUsePoint_IsNotNull() { regUsePoint(CK_ISNN, DOBJ); }

    protected void regUsePoint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsePoint(), "USE_POINT"); }
    protected abstract ConditionValue xgetCValueUsePoint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GET_POINT: {bigint(19)}
     * @param getPoint The value of getPoint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGetPoint_Equal(Long getPoint) {
        doSetGetPoint_Equal(getPoint);
    }

    protected void doSetGetPoint_Equal(Long getPoint) {
        regGetPoint(CK_EQ, getPoint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GET_POINT: {bigint(19)}
     * @param getPoint The value of getPoint as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGetPoint_NotEqual(Long getPoint) {
        doSetGetPoint_NotEqual(getPoint);
    }

    protected void doSetGetPoint_NotEqual(Long getPoint) {
        regGetPoint(CK_NES, getPoint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GET_POINT: {bigint(19)}
     * @param getPoint The value of getPoint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGetPoint_GreaterThan(Long getPoint) {
        regGetPoint(CK_GT, getPoint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GET_POINT: {bigint(19)}
     * @param getPoint The value of getPoint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGetPoint_LessThan(Long getPoint) {
        regGetPoint(CK_LT, getPoint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GET_POINT: {bigint(19)}
     * @param getPoint The value of getPoint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGetPoint_GreaterEqual(Long getPoint) {
        regGetPoint(CK_GE, getPoint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GET_POINT: {bigint(19)}
     * @param getPoint The value of getPoint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGetPoint_LessEqual(Long getPoint) {
        regGetPoint(CK_LE, getPoint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GET_POINT: {bigint(19)}
     * @param minNumber The min number of getPoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of getPoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGetPoint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGetPoint(), "GET_POINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GET_POINT: {bigint(19)}
     * @param getPointList The collection of getPoint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPoint_InScope(Collection<Long> getPointList) {
        doSetGetPoint_InScope(getPointList);
    }

    protected void doSetGetPoint_InScope(Collection<Long> getPointList) {
        regINS(CK_INS, cTL(getPointList), xgetCValueGetPoint(), "GET_POINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GET_POINT: {bigint(19)}
     * @param getPointList The collection of getPoint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPoint_NotInScope(Collection<Long> getPointList) {
        doSetGetPoint_NotInScope(getPointList);
    }

    protected void doSetGetPoint_NotInScope(Collection<Long> getPointList) {
        regINS(CK_NINS, cTL(getPointList), xgetCValueGetPoint(), "GET_POINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GET_POINT: {bigint(19)}
     */
    public void setGetPoint_IsNull() { regGetPoint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GET_POINT: {bigint(19)}
     */
    public void setGetPoint_IsNotNull() { regGetPoint(CK_ISNN, DOBJ); }

    protected void regGetPoint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGetPoint(), "GET_POINT"); }
    protected abstract ConditionValue xgetCValueGetPoint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param total The value of total as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotal_Equal(Long total) {
        doSetTotal_Equal(total);
    }

    protected void doSetTotal_Equal(Long total) {
        regTotal(CK_EQ, total);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param total The value of total as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotal_NotEqual(Long total) {
        doSetTotal_NotEqual(total);
    }

    protected void doSetTotal_NotEqual(Long total) {
        regTotal(CK_NES, total);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param total The value of total as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotal_GreaterThan(Long total) {
        regTotal(CK_GT, total);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param total The value of total as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotal_LessThan(Long total) {
        regTotal(CK_LT, total);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param total The value of total as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotal_GreaterEqual(Long total) {
        regTotal(CK_GE, total);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param total The value of total as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotal_LessEqual(Long total) {
        regTotal(CK_LE, total);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param minNumber The min number of total. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of total. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotal_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotal(), "TOTAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param totalList The collection of total as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotal_InScope(Collection<Long> totalList) {
        doSetTotal_InScope(totalList);
    }

    protected void doSetTotal_InScope(Collection<Long> totalList) {
        regINS(CK_INS, cTL(totalList), xgetCValueTotal(), "TOTAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL: {bigint(19)}
     * @param totalList The collection of total as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotal_NotInScope(Collection<Long> totalList) {
        doSetTotal_NotInScope(totalList);
    }

    protected void doSetTotal_NotInScope(Collection<Long> totalList) {
        regINS(CK_NINS, cTL(totalList), xgetCValueTotal(), "TOTAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     */
    public void setTotal_IsNull() { regTotal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL: {bigint(19)}
     */
    public void setTotal_IsNotNull() { regTotal(CK_ISNN, DOBJ); }

    protected void regTotal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotal(), "TOTAL"); }
    protected abstract ConditionValue xgetCValueTotal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {bigint(19)}
     * @param totalPrice The value of totalPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_Equal(Long totalPrice) {
        doSetTotalPrice_Equal(totalPrice);
    }

    protected void doSetTotalPrice_Equal(Long totalPrice) {
        regTotalPrice(CK_EQ, totalPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {bigint(19)}
     * @param totalPrice The value of totalPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_NotEqual(Long totalPrice) {
        doSetTotalPrice_NotEqual(totalPrice);
    }

    protected void doSetTotalPrice_NotEqual(Long totalPrice) {
        regTotalPrice(CK_NES, totalPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {bigint(19)}
     * @param totalPrice The value of totalPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_GreaterThan(Long totalPrice) {
        regTotalPrice(CK_GT, totalPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {bigint(19)}
     * @param totalPrice The value of totalPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_LessThan(Long totalPrice) {
        regTotalPrice(CK_LT, totalPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {bigint(19)}
     * @param totalPrice The value of totalPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_GreaterEqual(Long totalPrice) {
        regTotalPrice(CK_GE, totalPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {bigint(19)}
     * @param totalPrice The value of totalPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_LessEqual(Long totalPrice) {
        regTotalPrice(CK_LE, totalPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {bigint(19)}
     * @param minNumber The min number of totalPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalPrice(), "TOTAL_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_PRICE: {bigint(19)}
     * @param totalPriceList The collection of totalPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_InScope(Collection<Long> totalPriceList) {
        doSetTotalPrice_InScope(totalPriceList);
    }

    protected void doSetTotalPrice_InScope(Collection<Long> totalPriceList) {
        regINS(CK_INS, cTL(totalPriceList), xgetCValueTotalPrice(), "TOTAL_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_PRICE: {bigint(19)}
     * @param totalPriceList The collection of totalPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_NotInScope(Collection<Long> totalPriceList) {
        doSetTotalPrice_NotInScope(totalPriceList);
    }

    protected void doSetTotalPrice_NotInScope(Collection<Long> totalPriceList) {
        regINS(CK_NINS, cTL(totalPriceList), xgetCValueTotalPrice(), "TOTAL_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {bigint(19)}
     */
    public void setTotalPrice_IsNull() { regTotalPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {bigint(19)}
     */
    public void setTotalPrice_IsNotNull() { regTotalPrice(CK_ISNN, DOBJ); }

    protected void regTotalPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalPrice(), "TOTAL_PRICE"); }
    protected abstract ConditionValue xgetCValueTotalPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_C_DISCOUNT: {bigint(19)}
     * @param shippingCDiscount The value of shippingCDiscount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingCDiscount_Equal(Long shippingCDiscount) {
        doSetShippingCDiscount_Equal(shippingCDiscount);
    }

    protected void doSetShippingCDiscount_Equal(Long shippingCDiscount) {
        regShippingCDiscount(CK_EQ, shippingCDiscount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_C_DISCOUNT: {bigint(19)}
     * @param shippingCDiscount The value of shippingCDiscount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingCDiscount_NotEqual(Long shippingCDiscount) {
        doSetShippingCDiscount_NotEqual(shippingCDiscount);
    }

    protected void doSetShippingCDiscount_NotEqual(Long shippingCDiscount) {
        regShippingCDiscount(CK_NES, shippingCDiscount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_C_DISCOUNT: {bigint(19)}
     * @param shippingCDiscount The value of shippingCDiscount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingCDiscount_GreaterThan(Long shippingCDiscount) {
        regShippingCDiscount(CK_GT, shippingCDiscount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_C_DISCOUNT: {bigint(19)}
     * @param shippingCDiscount The value of shippingCDiscount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingCDiscount_LessThan(Long shippingCDiscount) {
        regShippingCDiscount(CK_LT, shippingCDiscount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_C_DISCOUNT: {bigint(19)}
     * @param shippingCDiscount The value of shippingCDiscount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingCDiscount_GreaterEqual(Long shippingCDiscount) {
        regShippingCDiscount(CK_GE, shippingCDiscount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_C_DISCOUNT: {bigint(19)}
     * @param shippingCDiscount The value of shippingCDiscount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingCDiscount_LessEqual(Long shippingCDiscount) {
        regShippingCDiscount(CK_LE, shippingCDiscount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_C_DISCOUNT: {bigint(19)}
     * @param minNumber The min number of shippingCDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingCDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingCDiscount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingCDiscount(), "SHIPPING_C_DISCOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_C_DISCOUNT: {bigint(19)}
     * @param shippingCDiscountList The collection of shippingCDiscount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingCDiscount_InScope(Collection<Long> shippingCDiscountList) {
        doSetShippingCDiscount_InScope(shippingCDiscountList);
    }

    protected void doSetShippingCDiscount_InScope(Collection<Long> shippingCDiscountList) {
        regINS(CK_INS, cTL(shippingCDiscountList), xgetCValueShippingCDiscount(), "SHIPPING_C_DISCOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_C_DISCOUNT: {bigint(19)}
     * @param shippingCDiscountList The collection of shippingCDiscount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingCDiscount_NotInScope(Collection<Long> shippingCDiscountList) {
        doSetShippingCDiscount_NotInScope(shippingCDiscountList);
    }

    protected void doSetShippingCDiscount_NotInScope(Collection<Long> shippingCDiscountList) {
        regINS(CK_NINS, cTL(shippingCDiscountList), xgetCValueShippingCDiscount(), "SHIPPING_C_DISCOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_C_DISCOUNT: {bigint(19)}
     */
    public void setShippingCDiscount_IsNull() { regShippingCDiscount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_C_DISCOUNT: {bigint(19)}
     */
    public void setShippingCDiscount_IsNotNull() { regShippingCDiscount(CK_ISNN, DOBJ); }

    protected void regShippingCDiscount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingCDiscount(), "SHIPPING_C_DISCOUNT"); }
    protected abstract ConditionValue xgetCValueShippingCDiscount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_C_DISCOUNT: {bigint(19)}
     * @param itemCDiscount The value of itemCDiscount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemCDiscount_Equal(Long itemCDiscount) {
        doSetItemCDiscount_Equal(itemCDiscount);
    }

    protected void doSetItemCDiscount_Equal(Long itemCDiscount) {
        regItemCDiscount(CK_EQ, itemCDiscount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_C_DISCOUNT: {bigint(19)}
     * @param itemCDiscount The value of itemCDiscount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemCDiscount_NotEqual(Long itemCDiscount) {
        doSetItemCDiscount_NotEqual(itemCDiscount);
    }

    protected void doSetItemCDiscount_NotEqual(Long itemCDiscount) {
        regItemCDiscount(CK_NES, itemCDiscount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_C_DISCOUNT: {bigint(19)}
     * @param itemCDiscount The value of itemCDiscount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemCDiscount_GreaterThan(Long itemCDiscount) {
        regItemCDiscount(CK_GT, itemCDiscount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_C_DISCOUNT: {bigint(19)}
     * @param itemCDiscount The value of itemCDiscount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemCDiscount_LessThan(Long itemCDiscount) {
        regItemCDiscount(CK_LT, itemCDiscount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_C_DISCOUNT: {bigint(19)}
     * @param itemCDiscount The value of itemCDiscount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemCDiscount_GreaterEqual(Long itemCDiscount) {
        regItemCDiscount(CK_GE, itemCDiscount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_C_DISCOUNT: {bigint(19)}
     * @param itemCDiscount The value of itemCDiscount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemCDiscount_LessEqual(Long itemCDiscount) {
        regItemCDiscount(CK_LE, itemCDiscount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_C_DISCOUNT: {bigint(19)}
     * @param minNumber The min number of itemCDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of itemCDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setItemCDiscount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueItemCDiscount(), "ITEM_C_DISCOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_C_DISCOUNT: {bigint(19)}
     * @param itemCDiscountList The collection of itemCDiscount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCDiscount_InScope(Collection<Long> itemCDiscountList) {
        doSetItemCDiscount_InScope(itemCDiscountList);
    }

    protected void doSetItemCDiscount_InScope(Collection<Long> itemCDiscountList) {
        regINS(CK_INS, cTL(itemCDiscountList), xgetCValueItemCDiscount(), "ITEM_C_DISCOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_C_DISCOUNT: {bigint(19)}
     * @param itemCDiscountList The collection of itemCDiscount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCDiscount_NotInScope(Collection<Long> itemCDiscountList) {
        doSetItemCDiscount_NotInScope(itemCDiscountList);
    }

    protected void doSetItemCDiscount_NotInScope(Collection<Long> itemCDiscountList) {
        regINS(CK_NINS, cTL(itemCDiscountList), xgetCValueItemCDiscount(), "ITEM_C_DISCOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_C_DISCOUNT: {bigint(19)}
     */
    public void setItemCDiscount_IsNull() { regItemCDiscount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_C_DISCOUNT: {bigint(19)}
     */
    public void setItemCDiscount_IsNotNull() { regItemCDiscount(CK_ISNN, DOBJ); }

    protected void regItemCDiscount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemCDiscount(), "ITEM_C_DISCOUNT"); }
    protected abstract ConditionValue xgetCValueItemCDiscount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
     * @param totalMallCDiscount The value of totalMallCDiscount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalMallCDiscount_Equal(Long totalMallCDiscount) {
        doSetTotalMallCDiscount_Equal(totalMallCDiscount);
    }

    protected void doSetTotalMallCDiscount_Equal(Long totalMallCDiscount) {
        regTotalMallCDiscount(CK_EQ, totalMallCDiscount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
     * @param totalMallCDiscount The value of totalMallCDiscount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalMallCDiscount_NotEqual(Long totalMallCDiscount) {
        doSetTotalMallCDiscount_NotEqual(totalMallCDiscount);
    }

    protected void doSetTotalMallCDiscount_NotEqual(Long totalMallCDiscount) {
        regTotalMallCDiscount(CK_NES, totalMallCDiscount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
     * @param totalMallCDiscount The value of totalMallCDiscount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalMallCDiscount_GreaterThan(Long totalMallCDiscount) {
        regTotalMallCDiscount(CK_GT, totalMallCDiscount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
     * @param totalMallCDiscount The value of totalMallCDiscount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalMallCDiscount_LessThan(Long totalMallCDiscount) {
        regTotalMallCDiscount(CK_LT, totalMallCDiscount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
     * @param totalMallCDiscount The value of totalMallCDiscount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalMallCDiscount_GreaterEqual(Long totalMallCDiscount) {
        regTotalMallCDiscount(CK_GE, totalMallCDiscount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
     * @param totalMallCDiscount The value of totalMallCDiscount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalMallCDiscount_LessEqual(Long totalMallCDiscount) {
        regTotalMallCDiscount(CK_LE, totalMallCDiscount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
     * @param minNumber The min number of totalMallCDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalMallCDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalMallCDiscount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalMallCDiscount(), "TOTAL_MALL_C_DISCOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
     * @param totalMallCDiscountList The collection of totalMallCDiscount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalMallCDiscount_InScope(Collection<Long> totalMallCDiscountList) {
        doSetTotalMallCDiscount_InScope(totalMallCDiscountList);
    }

    protected void doSetTotalMallCDiscount_InScope(Collection<Long> totalMallCDiscountList) {
        regINS(CK_INS, cTL(totalMallCDiscountList), xgetCValueTotalMallCDiscount(), "TOTAL_MALL_C_DISCOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
     * @param totalMallCDiscountList The collection of totalMallCDiscount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalMallCDiscount_NotInScope(Collection<Long> totalMallCDiscountList) {
        doSetTotalMallCDiscount_NotInScope(totalMallCDiscountList);
    }

    protected void doSetTotalMallCDiscount_NotInScope(Collection<Long> totalMallCDiscountList) {
        regINS(CK_NINS, cTL(totalMallCDiscountList), xgetCValueTotalMallCDiscount(), "TOTAL_MALL_C_DISCOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
     */
    public void setTotalMallCDiscount_IsNull() { regTotalMallCDiscount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
     */
    public void setTotalMallCDiscount_IsNotNull() { regTotalMallCDiscount(CK_ISNN, DOBJ); }

    protected void regTotalMallCDiscount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalMallCDiscount(), "TOTAL_MALL_C_DISCOUNT"); }
    protected abstract ConditionValue xgetCValueTotalMallCDiscount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_CRG_TO_STORE: {bigint(19)}
     * @param getPointCrgToStore The value of getPointCrgToStore as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGetPointCrgToStore_Equal(Long getPointCrgToStore) {
        doSetGetPointCrgToStore_Equal(getPointCrgToStore);
    }

    protected void doSetGetPointCrgToStore_Equal(Long getPointCrgToStore) {
        regGetPointCrgToStore(CK_EQ, getPointCrgToStore);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_CRG_TO_STORE: {bigint(19)}
     * @param getPointCrgToStore The value of getPointCrgToStore as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGetPointCrgToStore_NotEqual(Long getPointCrgToStore) {
        doSetGetPointCrgToStore_NotEqual(getPointCrgToStore);
    }

    protected void doSetGetPointCrgToStore_NotEqual(Long getPointCrgToStore) {
        regGetPointCrgToStore(CK_NES, getPointCrgToStore);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_CRG_TO_STORE: {bigint(19)}
     * @param getPointCrgToStore The value of getPointCrgToStore as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGetPointCrgToStore_GreaterThan(Long getPointCrgToStore) {
        regGetPointCrgToStore(CK_GT, getPointCrgToStore);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_CRG_TO_STORE: {bigint(19)}
     * @param getPointCrgToStore The value of getPointCrgToStore as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGetPointCrgToStore_LessThan(Long getPointCrgToStore) {
        regGetPointCrgToStore(CK_LT, getPointCrgToStore);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_CRG_TO_STORE: {bigint(19)}
     * @param getPointCrgToStore The value of getPointCrgToStore as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGetPointCrgToStore_GreaterEqual(Long getPointCrgToStore) {
        regGetPointCrgToStore(CK_GE, getPointCrgToStore);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_CRG_TO_STORE: {bigint(19)}
     * @param getPointCrgToStore The value of getPointCrgToStore as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGetPointCrgToStore_LessEqual(Long getPointCrgToStore) {
        regGetPointCrgToStore(CK_LE, getPointCrgToStore);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_CRG_TO_STORE: {bigint(19)}
     * @param minNumber The min number of getPointCrgToStore. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of getPointCrgToStore. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGetPointCrgToStore_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGetPointCrgToStore(), "GET_POINT_CRG_TO_STORE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GET_POINT_CRG_TO_STORE: {bigint(19)}
     * @param getPointCrgToStoreList The collection of getPointCrgToStore as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointCrgToStore_InScope(Collection<Long> getPointCrgToStoreList) {
        doSetGetPointCrgToStore_InScope(getPointCrgToStoreList);
    }

    protected void doSetGetPointCrgToStore_InScope(Collection<Long> getPointCrgToStoreList) {
        regINS(CK_INS, cTL(getPointCrgToStoreList), xgetCValueGetPointCrgToStore(), "GET_POINT_CRG_TO_STORE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GET_POINT_CRG_TO_STORE: {bigint(19)}
     * @param getPointCrgToStoreList The collection of getPointCrgToStore as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointCrgToStore_NotInScope(Collection<Long> getPointCrgToStoreList) {
        doSetGetPointCrgToStore_NotInScope(getPointCrgToStoreList);
    }

    protected void doSetGetPointCrgToStore_NotInScope(Collection<Long> getPointCrgToStoreList) {
        regINS(CK_NINS, cTL(getPointCrgToStoreList), xgetCValueGetPointCrgToStore(), "GET_POINT_CRG_TO_STORE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GET_POINT_CRG_TO_STORE: {bigint(19)}
     */
    public void setGetPointCrgToStore_IsNull() { regGetPointCrgToStore(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GET_POINT_CRG_TO_STORE: {bigint(19)}
     */
    public void setGetPointCrgToStore_IsNotNull() { regGetPointCrgToStore(CK_ISNN, DOBJ); }

    protected void regGetPointCrgToStore(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGetPointCrgToStore(), "GET_POINT_CRG_TO_STORE"); }
    protected abstract ConditionValue xgetCValueGetPointCrgToStore();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_ID: {varchar(30)}
     * @param lineId The value of lineId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_Equal(String lineId) {
        doSetLineId_Equal(fRES(lineId));
    }

    protected void doSetLineId_Equal(String lineId) {
        regLineId(CK_EQ, lineId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_ID: {varchar(30)}
     * @param lineId The value of lineId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_NotEqual(String lineId) {
        doSetLineId_NotEqual(fRES(lineId));
    }

    protected void doSetLineId_NotEqual(String lineId) {
        regLineId(CK_NES, lineId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_ID: {varchar(30)}
     * @param lineId The value of lineId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_GreaterThan(String lineId) {
        regLineId(CK_GT, fRES(lineId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_ID: {varchar(30)}
     * @param lineId The value of lineId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_LessThan(String lineId) {
        regLineId(CK_LT, fRES(lineId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_ID: {varchar(30)}
     * @param lineId The value of lineId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_GreaterEqual(String lineId) {
        regLineId(CK_GE, fRES(lineId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_ID: {varchar(30)}
     * @param lineId The value of lineId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_LessEqual(String lineId) {
        regLineId(CK_LE, fRES(lineId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_ID: {varchar(30)}
     * @param lineIdList The collection of lineId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_InScope(Collection<String> lineIdList) {
        doSetLineId_InScope(lineIdList);
    }

    protected void doSetLineId_InScope(Collection<String> lineIdList) {
        regINS(CK_INS, cTL(lineIdList), xgetCValueLineId(), "LINE_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_ID: {varchar(30)}
     * @param lineIdList The collection of lineId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_NotInScope(Collection<String> lineIdList) {
        doSetLineId_NotInScope(lineIdList);
    }

    protected void doSetLineId_NotInScope(Collection<String> lineIdList) {
        regINS(CK_NINS, cTL(lineIdList), xgetCValueLineId(), "LINE_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_ID: {varchar(30)} <br>
     * <pre>e.g. setLineId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineId The value of lineId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineId_LikeSearch(String lineId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineId), xgetCValueLineId(), "LINE_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_ID: {varchar(30)}
     * @param lineId The value of lineId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineId_NotLikeSearch(String lineId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineId), xgetCValueLineId(), "LINE_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_ID: {varchar(30)}
     * @param lineId The value of lineId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_PrefixSearch(String lineId) {
        setLineId_LikeSearch(lineId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINE_ID: {varchar(30)}
     */
    public void setLineId_IsNull() { regLineId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINE_ID: {varchar(30)}
     */
    public void setLineId_IsNullOrEmpty() { regLineId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINE_ID: {varchar(30)}
     */
    public void setLineId_IsNotNull() { regLineId(CK_ISNN, DOBJ); }

    protected void regLineId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineId(), "LINE_ID"); }
    protected abstract ConditionValue xgetCValueLineId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY: {bigint(19)}
     * @param quantity The value of quantity as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantity_Equal(Long quantity) {
        doSetQuantity_Equal(quantity);
    }

    protected void doSetQuantity_Equal(Long quantity) {
        regQuantity(CK_EQ, quantity);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY: {bigint(19)}
     * @param quantity The value of quantity as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantity_NotEqual(Long quantity) {
        doSetQuantity_NotEqual(quantity);
    }

    protected void doSetQuantity_NotEqual(Long quantity) {
        regQuantity(CK_NES, quantity);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY: {bigint(19)}
     * @param quantity The value of quantity as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantity_GreaterThan(Long quantity) {
        regQuantity(CK_GT, quantity);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY: {bigint(19)}
     * @param quantity The value of quantity as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantity_LessThan(Long quantity) {
        regQuantity(CK_LT, quantity);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY: {bigint(19)}
     * @param quantity The value of quantity as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantity_GreaterEqual(Long quantity) {
        regQuantity(CK_GE, quantity);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY: {bigint(19)}
     * @param quantity The value of quantity as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantity_LessEqual(Long quantity) {
        regQuantity(CK_LE, quantity);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY: {bigint(19)}
     * @param minNumber The min number of quantity. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of quantity. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQuantity_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQuantity(), "QUANTITY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QUANTITY: {bigint(19)}
     * @param quantityList The collection of quantity as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantity_InScope(Collection<Long> quantityList) {
        doSetQuantity_InScope(quantityList);
    }

    protected void doSetQuantity_InScope(Collection<Long> quantityList) {
        regINS(CK_INS, cTL(quantityList), xgetCValueQuantity(), "QUANTITY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QUANTITY: {bigint(19)}
     * @param quantityList The collection of quantity as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantity_NotInScope(Collection<Long> quantityList) {
        doSetQuantity_NotInScope(quantityList);
    }

    protected void doSetQuantity_NotInScope(Collection<Long> quantityList) {
        regINS(CK_NINS, cTL(quantityList), xgetCValueQuantity(), "QUANTITY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QUANTITY: {bigint(19)}
     */
    public void setQuantity_IsNull() { regQuantity(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QUANTITY: {bigint(19)}
     */
    public void setQuantity_IsNotNull() { regQuantity(CK_ISNN, DOBJ); }

    protected void regQuantity(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQuantity(), "QUANTITY"); }
    protected abstract ConditionValue xgetCValueQuantity();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {varchar(30)}
     * @param itemId The value of itemId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemId_Equal(String itemId) {
        doSetItemId_Equal(fRES(itemId));
    }

    protected void doSetItemId_Equal(String itemId) {
        regItemId(CK_EQ, itemId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {varchar(30)}
     * @param itemId The value of itemId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemId_NotEqual(String itemId) {
        doSetItemId_NotEqual(fRES(itemId));
    }

    protected void doSetItemId_NotEqual(String itemId) {
        regItemId(CK_NES, itemId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {varchar(30)}
     * @param itemId The value of itemId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemId_GreaterThan(String itemId) {
        regItemId(CK_GT, fRES(itemId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {varchar(30)}
     * @param itemId The value of itemId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemId_LessThan(String itemId) {
        regItemId(CK_LT, fRES(itemId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {varchar(30)}
     * @param itemId The value of itemId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemId_GreaterEqual(String itemId) {
        regItemId(CK_GE, fRES(itemId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {varchar(30)}
     * @param itemId The value of itemId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemId_LessEqual(String itemId) {
        regItemId(CK_LE, fRES(itemId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_ID: {varchar(30)}
     * @param itemIdList The collection of itemId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemId_InScope(Collection<String> itemIdList) {
        doSetItemId_InScope(itemIdList);
    }

    protected void doSetItemId_InScope(Collection<String> itemIdList) {
        regINS(CK_INS, cTL(itemIdList), xgetCValueItemId(), "ITEM_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_ID: {varchar(30)}
     * @param itemIdList The collection of itemId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemId_NotInScope(Collection<String> itemIdList) {
        doSetItemId_NotInScope(itemIdList);
    }

    protected void doSetItemId_NotInScope(Collection<String> itemIdList) {
        regINS(CK_NINS, cTL(itemIdList), xgetCValueItemId(), "ITEM_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_ID: {varchar(30)} <br>
     * <pre>e.g. setItemId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemId The value of itemId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemId_LikeSearch(String itemId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemId), xgetCValueItemId(), "ITEM_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_ID: {varchar(30)}
     * @param itemId The value of itemId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemId_NotLikeSearch(String itemId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemId), xgetCValueItemId(), "ITEM_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_ID: {varchar(30)}
     * @param itemId The value of itemId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemId_PrefixSearch(String itemId) {
        setItemId_LikeSearch(itemId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_ID: {varchar(30)}
     */
    public void setItemId_IsNull() { regItemId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_ID: {varchar(30)}
     */
    public void setItemId_IsNullOrEmpty() { regItemId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_ID: {varchar(30)}
     */
    public void setItemId_IsNotNull() { regItemId(CK_ISNN, DOBJ); }

    protected void regItemId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemId(), "ITEM_ID"); }
    protected abstract ConditionValue xgetCValueItemId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUB_CODE: {varchar(30)}
     * @param subCode The value of subCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCode_Equal(String subCode) {
        doSetSubCode_Equal(fRES(subCode));
    }

    protected void doSetSubCode_Equal(String subCode) {
        regSubCode(CK_EQ, subCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUB_CODE: {varchar(30)}
     * @param subCode The value of subCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCode_NotEqual(String subCode) {
        doSetSubCode_NotEqual(fRES(subCode));
    }

    protected void doSetSubCode_NotEqual(String subCode) {
        regSubCode(CK_NES, subCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUB_CODE: {varchar(30)}
     * @param subCode The value of subCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCode_GreaterThan(String subCode) {
        regSubCode(CK_GT, fRES(subCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUB_CODE: {varchar(30)}
     * @param subCode The value of subCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCode_LessThan(String subCode) {
        regSubCode(CK_LT, fRES(subCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUB_CODE: {varchar(30)}
     * @param subCode The value of subCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCode_GreaterEqual(String subCode) {
        regSubCode(CK_GE, fRES(subCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUB_CODE: {varchar(30)}
     * @param subCode The value of subCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCode_LessEqual(String subCode) {
        regSubCode(CK_LE, fRES(subCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUB_CODE: {varchar(30)}
     * @param subCodeList The collection of subCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCode_InScope(Collection<String> subCodeList) {
        doSetSubCode_InScope(subCodeList);
    }

    protected void doSetSubCode_InScope(Collection<String> subCodeList) {
        regINS(CK_INS, cTL(subCodeList), xgetCValueSubCode(), "SUB_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUB_CODE: {varchar(30)}
     * @param subCodeList The collection of subCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCode_NotInScope(Collection<String> subCodeList) {
        doSetSubCode_NotInScope(subCodeList);
    }

    protected void doSetSubCode_NotInScope(Collection<String> subCodeList) {
        regINS(CK_NINS, cTL(subCodeList), xgetCValueSubCode(), "SUB_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUB_CODE: {varchar(30)} <br>
     * <pre>e.g. setSubCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param subCode The value of subCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSubCode_LikeSearch(String subCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(subCode), xgetCValueSubCode(), "SUB_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUB_CODE: {varchar(30)}
     * @param subCode The value of subCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSubCode_NotLikeSearch(String subCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(subCode), xgetCValueSubCode(), "SUB_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUB_CODE: {varchar(30)}
     * @param subCode The value of subCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCode_PrefixSearch(String subCode) {
        setSubCode_LikeSearch(subCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUB_CODE: {varchar(30)}
     */
    public void setSubCode_IsNull() { regSubCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUB_CODE: {varchar(30)}
     */
    public void setSubCode_IsNullOrEmpty() { regSubCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUB_CODE: {varchar(30)}
     */
    public void setSubCode_IsNotNull() { regSubCode(CK_ISNN, DOBJ); }

    protected void regSubCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSubCode(), "SUB_CODE"); }
    protected abstract ConditionValue xgetCValueSubCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {varchar(255)}
     * @param title The value of title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_Equal(String title) {
        doSetTitle_Equal(fRES(title));
    }

    protected void doSetTitle_Equal(String title) {
        regTitle(CK_EQ, title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {varchar(255)}
     * @param title The value of title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_NotEqual(String title) {
        doSetTitle_NotEqual(fRES(title));
    }

    protected void doSetTitle_NotEqual(String title) {
        regTitle(CK_NES, title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {varchar(255)}
     * @param title The value of title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_GreaterThan(String title) {
        regTitle(CK_GT, fRES(title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {varchar(255)}
     * @param title The value of title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_LessThan(String title) {
        regTitle(CK_LT, fRES(title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {varchar(255)}
     * @param title The value of title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_GreaterEqual(String title) {
        regTitle(CK_GE, fRES(title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {varchar(255)}
     * @param title The value of title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_LessEqual(String title) {
        regTitle(CK_LE, fRES(title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TITLE: {varchar(255)}
     * @param titleList The collection of title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_InScope(Collection<String> titleList) {
        doSetTitle_InScope(titleList);
    }

    protected void doSetTitle_InScope(Collection<String> titleList) {
        regINS(CK_INS, cTL(titleList), xgetCValueTitle(), "TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TITLE: {varchar(255)}
     * @param titleList The collection of title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_NotInScope(Collection<String> titleList) {
        doSetTitle_NotInScope(titleList);
    }

    protected void doSetTitle_NotInScope(Collection<String> titleList) {
        regINS(CK_NINS, cTL(titleList), xgetCValueTitle(), "TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {varchar(255)} <br>
     * <pre>e.g. setTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param title The value of title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTitle_LikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(title), xgetCValueTitle(), "TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {varchar(255)}
     * @param title The value of title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTitle_NotLikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(title), xgetCValueTitle(), "TITLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {varchar(255)}
     * @param title The value of title as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_PrefixSearch(String title) {
        setTitle_LikeSearch(title, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TITLE: {varchar(255)}
     */
    public void setTitle_IsNull() { regTitle(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TITLE: {varchar(255)}
     */
    public void setTitle_IsNullOrEmpty() { regTitle(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TITLE: {varchar(255)}
     */
    public void setTitle_IsNotNull() { regTitle(CK_ISNN, DOBJ); }

    protected void regTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTitle(), "TITLE"); }
    protected abstract ConditionValue xgetCValueTitle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     * @param itemOptionName The value of itemOptionName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionName_Equal(String itemOptionName) {
        doSetItemOptionName_Equal(fRES(itemOptionName));
    }

    protected void doSetItemOptionName_Equal(String itemOptionName) {
        regItemOptionName(CK_EQ, itemOptionName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     * @param itemOptionName The value of itemOptionName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionName_NotEqual(String itemOptionName) {
        doSetItemOptionName_NotEqual(fRES(itemOptionName));
    }

    protected void doSetItemOptionName_NotEqual(String itemOptionName) {
        regItemOptionName(CK_NES, itemOptionName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     * @param itemOptionName The value of itemOptionName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionName_GreaterThan(String itemOptionName) {
        regItemOptionName(CK_GT, fRES(itemOptionName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     * @param itemOptionName The value of itemOptionName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionName_LessThan(String itemOptionName) {
        regItemOptionName(CK_LT, fRES(itemOptionName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     * @param itemOptionName The value of itemOptionName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionName_GreaterEqual(String itemOptionName) {
        regItemOptionName(CK_GE, fRES(itemOptionName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     * @param itemOptionName The value of itemOptionName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionName_LessEqual(String itemOptionName) {
        regItemOptionName(CK_LE, fRES(itemOptionName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     * @param itemOptionNameList The collection of itemOptionName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionName_InScope(Collection<String> itemOptionNameList) {
        doSetItemOptionName_InScope(itemOptionNameList);
    }

    protected void doSetItemOptionName_InScope(Collection<String> itemOptionNameList) {
        regINS(CK_INS, cTL(itemOptionNameList), xgetCValueItemOptionName(), "ITEM_OPTION_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     * @param itemOptionNameList The collection of itemOptionName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionName_NotInScope(Collection<String> itemOptionNameList) {
        doSetItemOptionName_NotInScope(itemOptionNameList);
    }

    protected void doSetItemOptionName_NotInScope(Collection<String> itemOptionNameList) {
        regINS(CK_NINS, cTL(itemOptionNameList), xgetCValueItemOptionName(), "ITEM_OPTION_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_OPTION_NAME: {varchar(60)} <br>
     * <pre>e.g. setItemOptionName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemOptionName The value of itemOptionName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemOptionName_LikeSearch(String itemOptionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemOptionName), xgetCValueItemOptionName(), "ITEM_OPTION_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     * @param itemOptionName The value of itemOptionName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemOptionName_NotLikeSearch(String itemOptionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemOptionName), xgetCValueItemOptionName(), "ITEM_OPTION_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     * @param itemOptionName The value of itemOptionName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionName_PrefixSearch(String itemOptionName) {
        setItemOptionName_LikeSearch(itemOptionName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     */
    public void setItemOptionName_IsNull() { regItemOptionName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     */
    public void setItemOptionName_IsNullOrEmpty() { regItemOptionName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     */
    public void setItemOptionName_IsNotNull() { regItemOptionName(CK_ISNN, DOBJ); }

    protected void regItemOptionName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemOptionName(), "ITEM_OPTION_NAME"); }
    protected abstract ConditionValue xgetCValueItemOptionName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     * @param itemOptionValue The value of itemOptionValue as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionValue_Equal(String itemOptionValue) {
        doSetItemOptionValue_Equal(fRES(itemOptionValue));
    }

    protected void doSetItemOptionValue_Equal(String itemOptionValue) {
        regItemOptionValue(CK_EQ, itemOptionValue);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     * @param itemOptionValue The value of itemOptionValue as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionValue_NotEqual(String itemOptionValue) {
        doSetItemOptionValue_NotEqual(fRES(itemOptionValue));
    }

    protected void doSetItemOptionValue_NotEqual(String itemOptionValue) {
        regItemOptionValue(CK_NES, itemOptionValue);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     * @param itemOptionValue The value of itemOptionValue as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionValue_GreaterThan(String itemOptionValue) {
        regItemOptionValue(CK_GT, fRES(itemOptionValue));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     * @param itemOptionValue The value of itemOptionValue as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionValue_LessThan(String itemOptionValue) {
        regItemOptionValue(CK_LT, fRES(itemOptionValue));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     * @param itemOptionValue The value of itemOptionValue as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionValue_GreaterEqual(String itemOptionValue) {
        regItemOptionValue(CK_GE, fRES(itemOptionValue));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     * @param itemOptionValue The value of itemOptionValue as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionValue_LessEqual(String itemOptionValue) {
        regItemOptionValue(CK_LE, fRES(itemOptionValue));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     * @param itemOptionValueList The collection of itemOptionValue as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionValue_InScope(Collection<String> itemOptionValueList) {
        doSetItemOptionValue_InScope(itemOptionValueList);
    }

    protected void doSetItemOptionValue_InScope(Collection<String> itemOptionValueList) {
        regINS(CK_INS, cTL(itemOptionValueList), xgetCValueItemOptionValue(), "ITEM_OPTION_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     * @param itemOptionValueList The collection of itemOptionValue as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionValue_NotInScope(Collection<String> itemOptionValueList) {
        doSetItemOptionValue_NotInScope(itemOptionValueList);
    }

    protected void doSetItemOptionValue_NotInScope(Collection<String> itemOptionValueList) {
        regINS(CK_NINS, cTL(itemOptionValueList), xgetCValueItemOptionValue(), "ITEM_OPTION_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_OPTION_VALUE: {varchar(60)} <br>
     * <pre>e.g. setItemOptionValue_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemOptionValue The value of itemOptionValue as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemOptionValue_LikeSearch(String itemOptionValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemOptionValue), xgetCValueItemOptionValue(), "ITEM_OPTION_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     * @param itemOptionValue The value of itemOptionValue as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemOptionValue_NotLikeSearch(String itemOptionValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemOptionValue), xgetCValueItemOptionValue(), "ITEM_OPTION_VALUE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     * @param itemOptionValue The value of itemOptionValue as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOptionValue_PrefixSearch(String itemOptionValue) {
        setItemOptionValue_LikeSearch(itemOptionValue, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     */
    public void setItemOptionValue_IsNull() { regItemOptionValue(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     */
    public void setItemOptionValue_IsNullOrEmpty() { regItemOptionValue(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     */
    public void setItemOptionValue_IsNotNull() { regItemOptionValue(CK_ISNN, DOBJ); }

    protected void regItemOptionValue(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemOptionValue(), "ITEM_OPTION_VALUE"); }
    protected abstract ConditionValue xgetCValueItemOptionValue();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     * @param subCodeOption The value of subCodeOption as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCodeOption_Equal(String subCodeOption) {
        doSetSubCodeOption_Equal(fRES(subCodeOption));
    }

    protected void doSetSubCodeOption_Equal(String subCodeOption) {
        regSubCodeOption(CK_EQ, subCodeOption);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     * @param subCodeOption The value of subCodeOption as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCodeOption_NotEqual(String subCodeOption) {
        doSetSubCodeOption_NotEqual(fRES(subCodeOption));
    }

    protected void doSetSubCodeOption_NotEqual(String subCodeOption) {
        regSubCodeOption(CK_NES, subCodeOption);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     * @param subCodeOption The value of subCodeOption as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCodeOption_GreaterThan(String subCodeOption) {
        regSubCodeOption(CK_GT, fRES(subCodeOption));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     * @param subCodeOption The value of subCodeOption as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCodeOption_LessThan(String subCodeOption) {
        regSubCodeOption(CK_LT, fRES(subCodeOption));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     * @param subCodeOption The value of subCodeOption as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCodeOption_GreaterEqual(String subCodeOption) {
        regSubCodeOption(CK_GE, fRES(subCodeOption));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     * @param subCodeOption The value of subCodeOption as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCodeOption_LessEqual(String subCodeOption) {
        regSubCodeOption(CK_LE, fRES(subCodeOption));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     * @param subCodeOptionList The collection of subCodeOption as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCodeOption_InScope(Collection<String> subCodeOptionList) {
        doSetSubCodeOption_InScope(subCodeOptionList);
    }

    protected void doSetSubCodeOption_InScope(Collection<String> subCodeOptionList) {
        regINS(CK_INS, cTL(subCodeOptionList), xgetCValueSubCodeOption(), "SUB_CODE_OPTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     * @param subCodeOptionList The collection of subCodeOption as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCodeOption_NotInScope(Collection<String> subCodeOptionList) {
        doSetSubCodeOption_NotInScope(subCodeOptionList);
    }

    protected void doSetSubCodeOption_NotInScope(Collection<String> subCodeOptionList) {
        regINS(CK_NINS, cTL(subCodeOptionList), xgetCValueSubCodeOption(), "SUB_CODE_OPTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUB_CODE_OPTION: {varchar(60)} <br>
     * <pre>e.g. setSubCodeOption_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param subCodeOption The value of subCodeOption as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSubCodeOption_LikeSearch(String subCodeOption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(subCodeOption), xgetCValueSubCodeOption(), "SUB_CODE_OPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     * @param subCodeOption The value of subCodeOption as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSubCodeOption_NotLikeSearch(String subCodeOption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(subCodeOption), xgetCValueSubCodeOption(), "SUB_CODE_OPTION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     * @param subCodeOption The value of subCodeOption as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSubCodeOption_PrefixSearch(String subCodeOption) {
        setSubCodeOption_LikeSearch(subCodeOption, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     */
    public void setSubCodeOption_IsNull() { regSubCodeOption(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     */
    public void setSubCodeOption_IsNullOrEmpty() { regSubCodeOption(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     */
    public void setSubCodeOption_IsNotNull() { regSubCodeOption(CK_ISNN, DOBJ); }

    protected void regSubCodeOption(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSubCodeOption(), "SUB_CODE_OPTION"); }
    protected abstract ConditionValue xgetCValueSubCodeOption();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     * @param inscriptionName The value of inscriptionName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionName_Equal(String inscriptionName) {
        doSetInscriptionName_Equal(fRES(inscriptionName));
    }

    protected void doSetInscriptionName_Equal(String inscriptionName) {
        regInscriptionName(CK_EQ, inscriptionName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     * @param inscriptionName The value of inscriptionName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionName_NotEqual(String inscriptionName) {
        doSetInscriptionName_NotEqual(fRES(inscriptionName));
    }

    protected void doSetInscriptionName_NotEqual(String inscriptionName) {
        regInscriptionName(CK_NES, inscriptionName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     * @param inscriptionName The value of inscriptionName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionName_GreaterThan(String inscriptionName) {
        regInscriptionName(CK_GT, fRES(inscriptionName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     * @param inscriptionName The value of inscriptionName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionName_LessThan(String inscriptionName) {
        regInscriptionName(CK_LT, fRES(inscriptionName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     * @param inscriptionName The value of inscriptionName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionName_GreaterEqual(String inscriptionName) {
        regInscriptionName(CK_GE, fRES(inscriptionName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     * @param inscriptionName The value of inscriptionName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionName_LessEqual(String inscriptionName) {
        regInscriptionName(CK_LE, fRES(inscriptionName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     * @param inscriptionNameList The collection of inscriptionName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionName_InScope(Collection<String> inscriptionNameList) {
        doSetInscriptionName_InScope(inscriptionNameList);
    }

    protected void doSetInscriptionName_InScope(Collection<String> inscriptionNameList) {
        regINS(CK_INS, cTL(inscriptionNameList), xgetCValueInscriptionName(), "INSCRIPTION_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     * @param inscriptionNameList The collection of inscriptionName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionName_NotInScope(Collection<String> inscriptionNameList) {
        doSetInscriptionName_NotInScope(inscriptionNameList);
    }

    protected void doSetInscriptionName_NotInScope(Collection<String> inscriptionNameList) {
        regINS(CK_NINS, cTL(inscriptionNameList), xgetCValueInscriptionName(), "INSCRIPTION_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSCRIPTION_NAME: {varchar(60)} <br>
     * <pre>e.g. setInscriptionName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inscriptionName The value of inscriptionName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInscriptionName_LikeSearch(String inscriptionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inscriptionName), xgetCValueInscriptionName(), "INSCRIPTION_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     * @param inscriptionName The value of inscriptionName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInscriptionName_NotLikeSearch(String inscriptionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inscriptionName), xgetCValueInscriptionName(), "INSCRIPTION_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     * @param inscriptionName The value of inscriptionName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionName_PrefixSearch(String inscriptionName) {
        setInscriptionName_LikeSearch(inscriptionName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     */
    public void setInscriptionName_IsNull() { regInscriptionName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     */
    public void setInscriptionName_IsNullOrEmpty() { regInscriptionName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     */
    public void setInscriptionName_IsNotNull() { regInscriptionName(CK_ISNN, DOBJ); }

    protected void regInscriptionName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInscriptionName(), "INSCRIPTION_NAME"); }
    protected abstract ConditionValue xgetCValueInscriptionName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     * @param inscriptionValue The value of inscriptionValue as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionValue_Equal(String inscriptionValue) {
        doSetInscriptionValue_Equal(fRES(inscriptionValue));
    }

    protected void doSetInscriptionValue_Equal(String inscriptionValue) {
        regInscriptionValue(CK_EQ, inscriptionValue);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     * @param inscriptionValue The value of inscriptionValue as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionValue_NotEqual(String inscriptionValue) {
        doSetInscriptionValue_NotEqual(fRES(inscriptionValue));
    }

    protected void doSetInscriptionValue_NotEqual(String inscriptionValue) {
        regInscriptionValue(CK_NES, inscriptionValue);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     * @param inscriptionValue The value of inscriptionValue as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionValue_GreaterThan(String inscriptionValue) {
        regInscriptionValue(CK_GT, fRES(inscriptionValue));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     * @param inscriptionValue The value of inscriptionValue as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionValue_LessThan(String inscriptionValue) {
        regInscriptionValue(CK_LT, fRES(inscriptionValue));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     * @param inscriptionValue The value of inscriptionValue as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionValue_GreaterEqual(String inscriptionValue) {
        regInscriptionValue(CK_GE, fRES(inscriptionValue));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     * @param inscriptionValue The value of inscriptionValue as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionValue_LessEqual(String inscriptionValue) {
        regInscriptionValue(CK_LE, fRES(inscriptionValue));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     * @param inscriptionValueList The collection of inscriptionValue as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionValue_InScope(Collection<String> inscriptionValueList) {
        doSetInscriptionValue_InScope(inscriptionValueList);
    }

    protected void doSetInscriptionValue_InScope(Collection<String> inscriptionValueList) {
        regINS(CK_INS, cTL(inscriptionValueList), xgetCValueInscriptionValue(), "INSCRIPTION_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     * @param inscriptionValueList The collection of inscriptionValue as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionValue_NotInScope(Collection<String> inscriptionValueList) {
        doSetInscriptionValue_NotInScope(inscriptionValueList);
    }

    protected void doSetInscriptionValue_NotInScope(Collection<String> inscriptionValueList) {
        regINS(CK_NINS, cTL(inscriptionValueList), xgetCValueInscriptionValue(), "INSCRIPTION_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSCRIPTION_VALUE: {varchar(60)} <br>
     * <pre>e.g. setInscriptionValue_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inscriptionValue The value of inscriptionValue as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInscriptionValue_LikeSearch(String inscriptionValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inscriptionValue), xgetCValueInscriptionValue(), "INSCRIPTION_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     * @param inscriptionValue The value of inscriptionValue as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInscriptionValue_NotLikeSearch(String inscriptionValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inscriptionValue), xgetCValueInscriptionValue(), "INSCRIPTION_VALUE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     * @param inscriptionValue The value of inscriptionValue as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInscriptionValue_PrefixSearch(String inscriptionValue) {
        setInscriptionValue_LikeSearch(inscriptionValue, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     */
    public void setInscriptionValue_IsNull() { regInscriptionValue(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     */
    public void setInscriptionValue_IsNullOrEmpty() { regInscriptionValue(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     */
    public void setInscriptionValue_IsNotNull() { regInscriptionValue(CK_ISNN, DOBJ); }

    protected void regInscriptionValue(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInscriptionValue(), "INSCRIPTION_VALUE"); }
    protected abstract ConditionValue xgetCValueInscriptionValue();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPrice The value of unitPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_Equal(Long unitPrice) {
        doSetUnitPrice_Equal(unitPrice);
    }

    protected void doSetUnitPrice_Equal(Long unitPrice) {
        regUnitPrice(CK_EQ, unitPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPrice The value of unitPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_NotEqual(Long unitPrice) {
        doSetUnitPrice_NotEqual(unitPrice);
    }

    protected void doSetUnitPrice_NotEqual(Long unitPrice) {
        regUnitPrice(CK_NES, unitPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPrice The value of unitPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_GreaterThan(Long unitPrice) {
        regUnitPrice(CK_GT, unitPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPrice The value of unitPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_LessThan(Long unitPrice) {
        regUnitPrice(CK_LT, unitPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPrice The value of unitPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_GreaterEqual(Long unitPrice) {
        regUnitPrice(CK_GE, unitPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPrice The value of unitPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitPrice_LessEqual(Long unitPrice) {
        regUnitPrice(CK_LE, unitPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param minNumber The min number of unitPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unitPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnitPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnitPrice(), "UNIT_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPriceList The collection of unitPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_InScope(Collection<Long> unitPriceList) {
        doSetUnitPrice_InScope(unitPriceList);
    }

    protected void doSetUnitPrice_InScope(Collection<Long> unitPriceList) {
        regINS(CK_INS, cTL(unitPriceList), xgetCValueUnitPrice(), "UNIT_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     * @param unitPriceList The collection of unitPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_NotInScope(Collection<Long> unitPriceList) {
        doSetUnitPrice_NotInScope(unitPriceList);
    }

    protected void doSetUnitPrice_NotInScope(Collection<Long> unitPriceList) {
        regINS(CK_NINS, cTL(unitPriceList), xgetCValueUnitPrice(), "UNIT_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     */
    public void setUnitPrice_IsNull() { regUnitPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_PRICE: {bigint(19)}
     */
    public void setUnitPrice_IsNotNull() { regUnitPrice(CK_ISNN, DOBJ); }

    protected void regUnitPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitPrice(), "UNIT_PRICE"); }
    protected abstract ConditionValue xgetCValueUnitPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_GET_POINT: {bigint(19)}
     * @param unitGetPoint The value of unitGetPoint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitGetPoint_Equal(Long unitGetPoint) {
        doSetUnitGetPoint_Equal(unitGetPoint);
    }

    protected void doSetUnitGetPoint_Equal(Long unitGetPoint) {
        regUnitGetPoint(CK_EQ, unitGetPoint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_GET_POINT: {bigint(19)}
     * @param unitGetPoint The value of unitGetPoint as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitGetPoint_NotEqual(Long unitGetPoint) {
        doSetUnitGetPoint_NotEqual(unitGetPoint);
    }

    protected void doSetUnitGetPoint_NotEqual(Long unitGetPoint) {
        regUnitGetPoint(CK_NES, unitGetPoint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_GET_POINT: {bigint(19)}
     * @param unitGetPoint The value of unitGetPoint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitGetPoint_GreaterThan(Long unitGetPoint) {
        regUnitGetPoint(CK_GT, unitGetPoint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_GET_POINT: {bigint(19)}
     * @param unitGetPoint The value of unitGetPoint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitGetPoint_LessThan(Long unitGetPoint) {
        regUnitGetPoint(CK_LT, unitGetPoint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_GET_POINT: {bigint(19)}
     * @param unitGetPoint The value of unitGetPoint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitGetPoint_GreaterEqual(Long unitGetPoint) {
        regUnitGetPoint(CK_GE, unitGetPoint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_GET_POINT: {bigint(19)}
     * @param unitGetPoint The value of unitGetPoint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitGetPoint_LessEqual(Long unitGetPoint) {
        regUnitGetPoint(CK_LE, unitGetPoint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_GET_POINT: {bigint(19)}
     * @param minNumber The min number of unitGetPoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unitGetPoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnitGetPoint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnitGetPoint(), "UNIT_GET_POINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_GET_POINT: {bigint(19)}
     * @param unitGetPointList The collection of unitGetPoint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitGetPoint_InScope(Collection<Long> unitGetPointList) {
        doSetUnitGetPoint_InScope(unitGetPointList);
    }

    protected void doSetUnitGetPoint_InScope(Collection<Long> unitGetPointList) {
        regINS(CK_INS, cTL(unitGetPointList), xgetCValueUnitGetPoint(), "UNIT_GET_POINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_GET_POINT: {bigint(19)}
     * @param unitGetPointList The collection of unitGetPoint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitGetPoint_NotInScope(Collection<Long> unitGetPointList) {
        doSetUnitGetPoint_NotInScope(unitGetPointList);
    }

    protected void doSetUnitGetPoint_NotInScope(Collection<Long> unitGetPointList) {
        regINS(CK_NINS, cTL(unitGetPointList), xgetCValueUnitGetPoint(), "UNIT_GET_POINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_GET_POINT: {bigint(19)}
     */
    public void setUnitGetPoint_IsNull() { regUnitGetPoint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_GET_POINT: {bigint(19)}
     */
    public void setUnitGetPoint_IsNotNull() { regUnitGetPoint(CK_ISNN, DOBJ); }

    protected void regUnitGetPoint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitGetPoint(), "UNIT_GET_POINT"); }
    protected abstract ConditionValue xgetCValueUnitGetPoint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_SUB_TOTAL: {bigint(19)}
     * @param lineSubTotal The value of lineSubTotal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineSubTotal_Equal(Long lineSubTotal) {
        doSetLineSubTotal_Equal(lineSubTotal);
    }

    protected void doSetLineSubTotal_Equal(Long lineSubTotal) {
        regLineSubTotal(CK_EQ, lineSubTotal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_SUB_TOTAL: {bigint(19)}
     * @param lineSubTotal The value of lineSubTotal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineSubTotal_NotEqual(Long lineSubTotal) {
        doSetLineSubTotal_NotEqual(lineSubTotal);
    }

    protected void doSetLineSubTotal_NotEqual(Long lineSubTotal) {
        regLineSubTotal(CK_NES, lineSubTotal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_SUB_TOTAL: {bigint(19)}
     * @param lineSubTotal The value of lineSubTotal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineSubTotal_GreaterThan(Long lineSubTotal) {
        regLineSubTotal(CK_GT, lineSubTotal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_SUB_TOTAL: {bigint(19)}
     * @param lineSubTotal The value of lineSubTotal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineSubTotal_LessThan(Long lineSubTotal) {
        regLineSubTotal(CK_LT, lineSubTotal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_SUB_TOTAL: {bigint(19)}
     * @param lineSubTotal The value of lineSubTotal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineSubTotal_GreaterEqual(Long lineSubTotal) {
        regLineSubTotal(CK_GE, lineSubTotal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_SUB_TOTAL: {bigint(19)}
     * @param lineSubTotal The value of lineSubTotal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineSubTotal_LessEqual(Long lineSubTotal) {
        regLineSubTotal(CK_LE, lineSubTotal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_SUB_TOTAL: {bigint(19)}
     * @param minNumber The min number of lineSubTotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lineSubTotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLineSubTotal_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLineSubTotal(), "LINE_SUB_TOTAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LINE_SUB_TOTAL: {bigint(19)}
     * @param lineSubTotalList The collection of lineSubTotal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineSubTotal_InScope(Collection<Long> lineSubTotalList) {
        doSetLineSubTotal_InScope(lineSubTotalList);
    }

    protected void doSetLineSubTotal_InScope(Collection<Long> lineSubTotalList) {
        regINS(CK_INS, cTL(lineSubTotalList), xgetCValueLineSubTotal(), "LINE_SUB_TOTAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LINE_SUB_TOTAL: {bigint(19)}
     * @param lineSubTotalList The collection of lineSubTotal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineSubTotal_NotInScope(Collection<Long> lineSubTotalList) {
        doSetLineSubTotal_NotInScope(lineSubTotalList);
    }

    protected void doSetLineSubTotal_NotInScope(Collection<Long> lineSubTotalList) {
        regINS(CK_NINS, cTL(lineSubTotalList), xgetCValueLineSubTotal(), "LINE_SUB_TOTAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINE_SUB_TOTAL: {bigint(19)}
     */
    public void setLineSubTotal_IsNull() { regLineSubTotal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINE_SUB_TOTAL: {bigint(19)}
     */
    public void setLineSubTotal_IsNotNull() { regLineSubTotal(CK_ISNN, DOBJ); }

    protected void regLineSubTotal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineSubTotal(), "LINE_SUB_TOTAL"); }
    protected abstract ConditionValue xgetCValueLineSubTotal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_GET_POINT: {bigint(19)}
     * @param lineGetPoint The value of lineGetPoint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineGetPoint_Equal(Long lineGetPoint) {
        doSetLineGetPoint_Equal(lineGetPoint);
    }

    protected void doSetLineGetPoint_Equal(Long lineGetPoint) {
        regLineGetPoint(CK_EQ, lineGetPoint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_GET_POINT: {bigint(19)}
     * @param lineGetPoint The value of lineGetPoint as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineGetPoint_NotEqual(Long lineGetPoint) {
        doSetLineGetPoint_NotEqual(lineGetPoint);
    }

    protected void doSetLineGetPoint_NotEqual(Long lineGetPoint) {
        regLineGetPoint(CK_NES, lineGetPoint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_GET_POINT: {bigint(19)}
     * @param lineGetPoint The value of lineGetPoint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineGetPoint_GreaterThan(Long lineGetPoint) {
        regLineGetPoint(CK_GT, lineGetPoint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_GET_POINT: {bigint(19)}
     * @param lineGetPoint The value of lineGetPoint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineGetPoint_LessThan(Long lineGetPoint) {
        regLineGetPoint(CK_LT, lineGetPoint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_GET_POINT: {bigint(19)}
     * @param lineGetPoint The value of lineGetPoint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineGetPoint_GreaterEqual(Long lineGetPoint) {
        regLineGetPoint(CK_GE, lineGetPoint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_GET_POINT: {bigint(19)}
     * @param lineGetPoint The value of lineGetPoint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineGetPoint_LessEqual(Long lineGetPoint) {
        regLineGetPoint(CK_LE, lineGetPoint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_GET_POINT: {bigint(19)}
     * @param minNumber The min number of lineGetPoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lineGetPoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLineGetPoint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLineGetPoint(), "LINE_GET_POINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LINE_GET_POINT: {bigint(19)}
     * @param lineGetPointList The collection of lineGetPoint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineGetPoint_InScope(Collection<Long> lineGetPointList) {
        doSetLineGetPoint_InScope(lineGetPointList);
    }

    protected void doSetLineGetPoint_InScope(Collection<Long> lineGetPointList) {
        regINS(CK_INS, cTL(lineGetPointList), xgetCValueLineGetPoint(), "LINE_GET_POINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LINE_GET_POINT: {bigint(19)}
     * @param lineGetPointList The collection of lineGetPoint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineGetPoint_NotInScope(Collection<Long> lineGetPointList) {
        doSetLineGetPoint_NotInScope(lineGetPointList);
    }

    protected void doSetLineGetPoint_NotInScope(Collection<Long> lineGetPointList) {
        regINS(CK_NINS, cTL(lineGetPointList), xgetCValueLineGetPoint(), "LINE_GET_POINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINE_GET_POINT: {bigint(19)}
     */
    public void setLineGetPoint_IsNull() { regLineGetPoint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINE_GET_POINT: {bigint(19)}
     */
    public void setLineGetPoint_IsNotNull() { regLineGetPoint(CK_ISNN, DOBJ); }

    protected void regLineGetPoint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineGetPoint(), "LINE_GET_POINT"); }
    protected abstract ConditionValue xgetCValueLineGetPoint();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_FSP_CODE: {varchar(30)}
     * @param pointFspCode The value of pointFspCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointFspCode_Equal(String pointFspCode) {
        doSetPointFspCode_Equal(fRES(pointFspCode));
    }

    protected void doSetPointFspCode_Equal(String pointFspCode) {
        regPointFspCode(CK_EQ, pointFspCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_FSP_CODE: {varchar(30)}
     * @param pointFspCode The value of pointFspCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointFspCode_NotEqual(String pointFspCode) {
        doSetPointFspCode_NotEqual(fRES(pointFspCode));
    }

    protected void doSetPointFspCode_NotEqual(String pointFspCode) {
        regPointFspCode(CK_NES, pointFspCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_FSP_CODE: {varchar(30)}
     * @param pointFspCode The value of pointFspCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointFspCode_GreaterThan(String pointFspCode) {
        regPointFspCode(CK_GT, fRES(pointFspCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_FSP_CODE: {varchar(30)}
     * @param pointFspCode The value of pointFspCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointFspCode_LessThan(String pointFspCode) {
        regPointFspCode(CK_LT, fRES(pointFspCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_FSP_CODE: {varchar(30)}
     * @param pointFspCode The value of pointFspCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointFspCode_GreaterEqual(String pointFspCode) {
        regPointFspCode(CK_GE, fRES(pointFspCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_FSP_CODE: {varchar(30)}
     * @param pointFspCode The value of pointFspCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointFspCode_LessEqual(String pointFspCode) {
        regPointFspCode(CK_LE, fRES(pointFspCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POINT_FSP_CODE: {varchar(30)}
     * @param pointFspCodeList The collection of pointFspCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointFspCode_InScope(Collection<String> pointFspCodeList) {
        doSetPointFspCode_InScope(pointFspCodeList);
    }

    protected void doSetPointFspCode_InScope(Collection<String> pointFspCodeList) {
        regINS(CK_INS, cTL(pointFspCodeList), xgetCValuePointFspCode(), "POINT_FSP_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POINT_FSP_CODE: {varchar(30)}
     * @param pointFspCodeList The collection of pointFspCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointFspCode_NotInScope(Collection<String> pointFspCodeList) {
        doSetPointFspCode_NotInScope(pointFspCodeList);
    }

    protected void doSetPointFspCode_NotInScope(Collection<String> pointFspCodeList) {
        regINS(CK_NINS, cTL(pointFspCodeList), xgetCValuePointFspCode(), "POINT_FSP_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_FSP_CODE: {varchar(30)} <br>
     * <pre>e.g. setPointFspCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pointFspCode The value of pointFspCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPointFspCode_LikeSearch(String pointFspCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pointFspCode), xgetCValuePointFspCode(), "POINT_FSP_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_FSP_CODE: {varchar(30)}
     * @param pointFspCode The value of pointFspCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPointFspCode_NotLikeSearch(String pointFspCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pointFspCode), xgetCValuePointFspCode(), "POINT_FSP_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_FSP_CODE: {varchar(30)}
     * @param pointFspCode The value of pointFspCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointFspCode_PrefixSearch(String pointFspCode) {
        setPointFspCode_LikeSearch(pointFspCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_FSP_CODE: {varchar(30)}
     */
    public void setPointFspCode_IsNull() { regPointFspCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * POINT_FSP_CODE: {varchar(30)}
     */
    public void setPointFspCode_IsNullOrEmpty() { regPointFspCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_FSP_CODE: {varchar(30)}
     */
    public void setPointFspCode_IsNotNull() { regPointFspCode(CK_ISNN, DOBJ); }

    protected void regPointFspCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointFspCode(), "POINT_FSP_CODE"); }
    protected abstract ConditionValue xgetCValuePointFspCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CONDITION: {varchar(30)}
     * @param itemCondition The value of itemCondition as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCondition_Equal(String itemCondition) {
        doSetItemCondition_Equal(fRES(itemCondition));
    }

    protected void doSetItemCondition_Equal(String itemCondition) {
        regItemCondition(CK_EQ, itemCondition);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CONDITION: {varchar(30)}
     * @param itemCondition The value of itemCondition as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCondition_NotEqual(String itemCondition) {
        doSetItemCondition_NotEqual(fRES(itemCondition));
    }

    protected void doSetItemCondition_NotEqual(String itemCondition) {
        regItemCondition(CK_NES, itemCondition);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CONDITION: {varchar(30)}
     * @param itemCondition The value of itemCondition as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCondition_GreaterThan(String itemCondition) {
        regItemCondition(CK_GT, fRES(itemCondition));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CONDITION: {varchar(30)}
     * @param itemCondition The value of itemCondition as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCondition_LessThan(String itemCondition) {
        regItemCondition(CK_LT, fRES(itemCondition));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CONDITION: {varchar(30)}
     * @param itemCondition The value of itemCondition as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCondition_GreaterEqual(String itemCondition) {
        regItemCondition(CK_GE, fRES(itemCondition));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CONDITION: {varchar(30)}
     * @param itemCondition The value of itemCondition as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCondition_LessEqual(String itemCondition) {
        regItemCondition(CK_LE, fRES(itemCondition));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CONDITION: {varchar(30)}
     * @param itemConditionList The collection of itemCondition as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCondition_InScope(Collection<String> itemConditionList) {
        doSetItemCondition_InScope(itemConditionList);
    }

    protected void doSetItemCondition_InScope(Collection<String> itemConditionList) {
        regINS(CK_INS, cTL(itemConditionList), xgetCValueItemCondition(), "ITEM_CONDITION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CONDITION: {varchar(30)}
     * @param itemConditionList The collection of itemCondition as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCondition_NotInScope(Collection<String> itemConditionList) {
        doSetItemCondition_NotInScope(itemConditionList);
    }

    protected void doSetItemCondition_NotInScope(Collection<String> itemConditionList) {
        regINS(CK_NINS, cTL(itemConditionList), xgetCValueItemCondition(), "ITEM_CONDITION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CONDITION: {varchar(30)} <br>
     * <pre>e.g. setItemCondition_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemCondition The value of itemCondition as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemCondition_LikeSearch(String itemCondition, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemCondition), xgetCValueItemCondition(), "ITEM_CONDITION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CONDITION: {varchar(30)}
     * @param itemCondition The value of itemCondition as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemCondition_NotLikeSearch(String itemCondition, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemCondition), xgetCValueItemCondition(), "ITEM_CONDITION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CONDITION: {varchar(30)}
     * @param itemCondition The value of itemCondition as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCondition_PrefixSearch(String itemCondition) {
        setItemCondition_LikeSearch(itemCondition, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_CONDITION: {varchar(30)}
     */
    public void setItemCondition_IsNull() { regItemCondition(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_CONDITION: {varchar(30)}
     */
    public void setItemCondition_IsNullOrEmpty() { regItemCondition(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_CONDITION: {varchar(30)}
     */
    public void setItemCondition_IsNotNull() { regItemCondition(CK_ISNN, DOBJ); }

    protected void regItemCondition(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemCondition(), "ITEM_CONDITION"); }
    protected abstract ConditionValue xgetCValueItemCondition();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUPON_ID: {varchar(30)}
     * @param couponId The value of couponId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponId_Equal(String couponId) {
        doSetCouponId_Equal(fRES(couponId));
    }

    protected void doSetCouponId_Equal(String couponId) {
        regCouponId(CK_EQ, couponId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUPON_ID: {varchar(30)}
     * @param couponId The value of couponId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponId_NotEqual(String couponId) {
        doSetCouponId_NotEqual(fRES(couponId));
    }

    protected void doSetCouponId_NotEqual(String couponId) {
        regCouponId(CK_NES, couponId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUPON_ID: {varchar(30)}
     * @param couponId The value of couponId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponId_GreaterThan(String couponId) {
        regCouponId(CK_GT, fRES(couponId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUPON_ID: {varchar(30)}
     * @param couponId The value of couponId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponId_LessThan(String couponId) {
        regCouponId(CK_LT, fRES(couponId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUPON_ID: {varchar(30)}
     * @param couponId The value of couponId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponId_GreaterEqual(String couponId) {
        regCouponId(CK_GE, fRES(couponId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUPON_ID: {varchar(30)}
     * @param couponId The value of couponId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponId_LessEqual(String couponId) {
        regCouponId(CK_LE, fRES(couponId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUPON_ID: {varchar(30)}
     * @param couponIdList The collection of couponId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponId_InScope(Collection<String> couponIdList) {
        doSetCouponId_InScope(couponIdList);
    }

    protected void doSetCouponId_InScope(Collection<String> couponIdList) {
        regINS(CK_INS, cTL(couponIdList), xgetCValueCouponId(), "COUPON_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUPON_ID: {varchar(30)}
     * @param couponIdList The collection of couponId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponId_NotInScope(Collection<String> couponIdList) {
        doSetCouponId_NotInScope(couponIdList);
    }

    protected void doSetCouponId_NotInScope(Collection<String> couponIdList) {
        regINS(CK_NINS, cTL(couponIdList), xgetCValueCouponId(), "COUPON_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUPON_ID: {varchar(30)} <br>
     * <pre>e.g. setCouponId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param couponId The value of couponId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCouponId_LikeSearch(String couponId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(couponId), xgetCValueCouponId(), "COUPON_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUPON_ID: {varchar(30)}
     * @param couponId The value of couponId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCouponId_NotLikeSearch(String couponId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(couponId), xgetCValueCouponId(), "COUPON_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUPON_ID: {varchar(30)}
     * @param couponId The value of couponId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponId_PrefixSearch(String couponId) {
        setCouponId_LikeSearch(couponId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COUPON_ID: {varchar(30)}
     */
    public void setCouponId_IsNull() { regCouponId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COUPON_ID: {varchar(30)}
     */
    public void setCouponId_IsNullOrEmpty() { regCouponId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COUPON_ID: {varchar(30)}
     */
    public void setCouponId_IsNotNull() { regCouponId(CK_ISNN, DOBJ); }

    protected void regCouponId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCouponId(), "COUPON_ID"); }
    protected abstract ConditionValue xgetCValueCouponId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscount The value of couponDiscount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponDiscount_Equal(Long couponDiscount) {
        doSetCouponDiscount_Equal(couponDiscount);
    }

    protected void doSetCouponDiscount_Equal(Long couponDiscount) {
        regCouponDiscount(CK_EQ, couponDiscount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscount The value of couponDiscount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponDiscount_NotEqual(Long couponDiscount) {
        doSetCouponDiscount_NotEqual(couponDiscount);
    }

    protected void doSetCouponDiscount_NotEqual(Long couponDiscount) {
        regCouponDiscount(CK_NES, couponDiscount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscount The value of couponDiscount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponDiscount_GreaterThan(Long couponDiscount) {
        regCouponDiscount(CK_GT, couponDiscount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscount The value of couponDiscount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponDiscount_LessThan(Long couponDiscount) {
        regCouponDiscount(CK_LT, couponDiscount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscount The value of couponDiscount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponDiscount_GreaterEqual(Long couponDiscount) {
        regCouponDiscount(CK_GE, couponDiscount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscount The value of couponDiscount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponDiscount_LessEqual(Long couponDiscount) {
        regCouponDiscount(CK_LE, couponDiscount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param minNumber The min number of couponDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of couponDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCouponDiscount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCouponDiscount(), "COUPON_DISCOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscountList The collection of couponDiscount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponDiscount_InScope(Collection<Long> couponDiscountList) {
        doSetCouponDiscount_InScope(couponDiscountList);
    }

    protected void doSetCouponDiscount_InScope(Collection<Long> couponDiscountList) {
        regINS(CK_INS, cTL(couponDiscountList), xgetCValueCouponDiscount(), "COUPON_DISCOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @param couponDiscountList The collection of couponDiscount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponDiscount_NotInScope(Collection<Long> couponDiscountList) {
        doSetCouponDiscount_NotInScope(couponDiscountList);
    }

    protected void doSetCouponDiscount_NotInScope(Collection<Long> couponDiscountList) {
        regINS(CK_NINS, cTL(couponDiscountList), xgetCValueCouponDiscount(), "COUPON_DISCOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     */
    public void setCouponDiscount_IsNull() { regCouponDiscount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     */
    public void setCouponDiscount_IsNotNull() { regCouponDiscount(CK_ISNN, DOBJ); }

    protected void regCouponDiscount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCouponDiscount(), "COUPON_DISCOUNT"); }
    protected abstract ConditionValue xgetCValueCouponDiscount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORIGINAL_PRICE: {bigint(19)}
     * @param originalPrice The value of originalPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalPrice_Equal(Long originalPrice) {
        doSetOriginalPrice_Equal(originalPrice);
    }

    protected void doSetOriginalPrice_Equal(Long originalPrice) {
        regOriginalPrice(CK_EQ, originalPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORIGINAL_PRICE: {bigint(19)}
     * @param originalPrice The value of originalPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalPrice_NotEqual(Long originalPrice) {
        doSetOriginalPrice_NotEqual(originalPrice);
    }

    protected void doSetOriginalPrice_NotEqual(Long originalPrice) {
        regOriginalPrice(CK_NES, originalPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORIGINAL_PRICE: {bigint(19)}
     * @param originalPrice The value of originalPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalPrice_GreaterThan(Long originalPrice) {
        regOriginalPrice(CK_GT, originalPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORIGINAL_PRICE: {bigint(19)}
     * @param originalPrice The value of originalPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalPrice_LessThan(Long originalPrice) {
        regOriginalPrice(CK_LT, originalPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORIGINAL_PRICE: {bigint(19)}
     * @param originalPrice The value of originalPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalPrice_GreaterEqual(Long originalPrice) {
        regOriginalPrice(CK_GE, originalPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORIGINAL_PRICE: {bigint(19)}
     * @param originalPrice The value of originalPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOriginalPrice_LessEqual(Long originalPrice) {
        regOriginalPrice(CK_LE, originalPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ORIGINAL_PRICE: {bigint(19)}
     * @param minNumber The min number of originalPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of originalPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOriginalPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOriginalPrice(), "ORIGINAL_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORIGINAL_PRICE: {bigint(19)}
     * @param originalPriceList The collection of originalPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalPrice_InScope(Collection<Long> originalPriceList) {
        doSetOriginalPrice_InScope(originalPriceList);
    }

    protected void doSetOriginalPrice_InScope(Collection<Long> originalPriceList) {
        regINS(CK_INS, cTL(originalPriceList), xgetCValueOriginalPrice(), "ORIGINAL_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORIGINAL_PRICE: {bigint(19)}
     * @param originalPriceList The collection of originalPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalPrice_NotInScope(Collection<Long> originalPriceList) {
        doSetOriginalPrice_NotInScope(originalPriceList);
    }

    protected void doSetOriginalPrice_NotInScope(Collection<Long> originalPriceList) {
        regINS(CK_NINS, cTL(originalPriceList), xgetCValueOriginalPrice(), "ORIGINAL_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORIGINAL_PRICE: {bigint(19)}
     */
    public void setOriginalPrice_IsNull() { regOriginalPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORIGINAL_PRICE: {bigint(19)}
     */
    public void setOriginalPrice_IsNotNull() { regOriginalPrice(CK_ISNN, DOBJ); }

    protected void regOriginalPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOriginalPrice(), "ORIGINAL_PRICE"); }
    protected abstract ConditionValue xgetCValueOriginalPrice();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     * @param isGetPointFix The value of isGetPointFix as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsGetPointFix_Equal(String isGetPointFix) {
        doSetIsGetPointFix_Equal(fRES(isGetPointFix));
    }

    protected void doSetIsGetPointFix_Equal(String isGetPointFix) {
        regIsGetPointFix(CK_EQ, isGetPointFix);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     * @param isGetPointFix The value of isGetPointFix as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsGetPointFix_NotEqual(String isGetPointFix) {
        doSetIsGetPointFix_NotEqual(fRES(isGetPointFix));
    }

    protected void doSetIsGetPointFix_NotEqual(String isGetPointFix) {
        regIsGetPointFix(CK_NES, isGetPointFix);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     * @param isGetPointFix The value of isGetPointFix as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsGetPointFix_GreaterThan(String isGetPointFix) {
        regIsGetPointFix(CK_GT, fRES(isGetPointFix));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     * @param isGetPointFix The value of isGetPointFix as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsGetPointFix_LessThan(String isGetPointFix) {
        regIsGetPointFix(CK_LT, fRES(isGetPointFix));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     * @param isGetPointFix The value of isGetPointFix as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsGetPointFix_GreaterEqual(String isGetPointFix) {
        regIsGetPointFix(CK_GE, fRES(isGetPointFix));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     * @param isGetPointFix The value of isGetPointFix as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsGetPointFix_LessEqual(String isGetPointFix) {
        regIsGetPointFix(CK_LE, fRES(isGetPointFix));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     * @param isGetPointFixList The collection of isGetPointFix as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsGetPointFix_InScope(Collection<String> isGetPointFixList) {
        doSetIsGetPointFix_InScope(isGetPointFixList);
    }

    protected void doSetIsGetPointFix_InScope(Collection<String> isGetPointFixList) {
        regINS(CK_INS, cTL(isGetPointFixList), xgetCValueIsGetPointFix(), "IS_GET_POINT_FIX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     * @param isGetPointFixList The collection of isGetPointFix as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsGetPointFix_NotInScope(Collection<String> isGetPointFixList) {
        doSetIsGetPointFix_NotInScope(isGetPointFixList);
    }

    protected void doSetIsGetPointFix_NotInScope(Collection<String> isGetPointFixList) {
        regINS(CK_NINS, cTL(isGetPointFixList), xgetCValueIsGetPointFix(), "IS_GET_POINT_FIX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IS_GET_POINT_FIX: {varchar(30)} <br>
     * <pre>e.g. setIsGetPointFix_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param isGetPointFix The value of isGetPointFix as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIsGetPointFix_LikeSearch(String isGetPointFix, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(isGetPointFix), xgetCValueIsGetPointFix(), "IS_GET_POINT_FIX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     * @param isGetPointFix The value of isGetPointFix as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIsGetPointFix_NotLikeSearch(String isGetPointFix, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(isGetPointFix), xgetCValueIsGetPointFix(), "IS_GET_POINT_FIX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     * @param isGetPointFix The value of isGetPointFix as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsGetPointFix_PrefixSearch(String isGetPointFix) {
        setIsGetPointFix_LikeSearch(isGetPointFix, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     */
    public void setIsGetPointFix_IsNull() { regIsGetPointFix(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     */
    public void setIsGetPointFix_IsNullOrEmpty() { regIsGetPointFix(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     */
    public void setIsGetPointFix_IsNotNull() { regIsGetPointFix(CK_ISNN, DOBJ); }

    protected void regIsGetPointFix(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIsGetPointFix(), "IS_GET_POINT_FIX"); }
    protected abstract ConditionValue xgetCValueIsGetPointFix();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     * @param getPointFixDate The value of getPointFixDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointFixDate_Equal(String getPointFixDate) {
        doSetGetPointFixDate_Equal(fRES(getPointFixDate));
    }

    protected void doSetGetPointFixDate_Equal(String getPointFixDate) {
        regGetPointFixDate(CK_EQ, getPointFixDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     * @param getPointFixDate The value of getPointFixDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointFixDate_NotEqual(String getPointFixDate) {
        doSetGetPointFixDate_NotEqual(fRES(getPointFixDate));
    }

    protected void doSetGetPointFixDate_NotEqual(String getPointFixDate) {
        regGetPointFixDate(CK_NES, getPointFixDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     * @param getPointFixDate The value of getPointFixDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointFixDate_GreaterThan(String getPointFixDate) {
        regGetPointFixDate(CK_GT, fRES(getPointFixDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     * @param getPointFixDate The value of getPointFixDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointFixDate_LessThan(String getPointFixDate) {
        regGetPointFixDate(CK_LT, fRES(getPointFixDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     * @param getPointFixDate The value of getPointFixDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointFixDate_GreaterEqual(String getPointFixDate) {
        regGetPointFixDate(CK_GE, fRES(getPointFixDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     * @param getPointFixDate The value of getPointFixDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointFixDate_LessEqual(String getPointFixDate) {
        regGetPointFixDate(CK_LE, fRES(getPointFixDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     * @param getPointFixDateList The collection of getPointFixDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointFixDate_InScope(Collection<String> getPointFixDateList) {
        doSetGetPointFixDate_InScope(getPointFixDateList);
    }

    protected void doSetGetPointFixDate_InScope(Collection<String> getPointFixDateList) {
        regINS(CK_INS, cTL(getPointFixDateList), xgetCValueGetPointFixDate(), "GET_POINT_FIX_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     * @param getPointFixDateList The collection of getPointFixDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointFixDate_NotInScope(Collection<String> getPointFixDateList) {
        doSetGetPointFixDate_NotInScope(getPointFixDateList);
    }

    protected void doSetGetPointFixDate_NotInScope(Collection<String> getPointFixDateList) {
        regINS(CK_NINS, cTL(getPointFixDateList), xgetCValueGetPointFixDate(), "GET_POINT_FIX_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GET_POINT_FIX_DATE: {varchar(30)} <br>
     * <pre>e.g. setGetPointFixDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param getPointFixDate The value of getPointFixDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGetPointFixDate_LikeSearch(String getPointFixDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(getPointFixDate), xgetCValueGetPointFixDate(), "GET_POINT_FIX_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     * @param getPointFixDate The value of getPointFixDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGetPointFixDate_NotLikeSearch(String getPointFixDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(getPointFixDate), xgetCValueGetPointFixDate(), "GET_POINT_FIX_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     * @param getPointFixDate The value of getPointFixDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointFixDate_PrefixSearch(String getPointFixDate) {
        setGetPointFixDate_LikeSearch(getPointFixDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     */
    public void setGetPointFixDate_IsNull() { regGetPointFixDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     */
    public void setGetPointFixDate_IsNullOrEmpty() { regGetPointFixDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     */
    public void setGetPointFixDate_IsNotNull() { regGetPointFixDate(CK_ISNN, DOBJ); }

    protected void regGetPointFixDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGetPointFixDate(), "GET_POINT_FIX_DATE"); }
    protected abstract ConditionValue xgetCValueGetPointFixDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RELEASE_DATE: {varchar(30)}
     * @param releaseDate The value of releaseDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReleaseDate_Equal(String releaseDate) {
        doSetReleaseDate_Equal(fRES(releaseDate));
    }

    protected void doSetReleaseDate_Equal(String releaseDate) {
        regReleaseDate(CK_EQ, releaseDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RELEASE_DATE: {varchar(30)}
     * @param releaseDate The value of releaseDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReleaseDate_NotEqual(String releaseDate) {
        doSetReleaseDate_NotEqual(fRES(releaseDate));
    }

    protected void doSetReleaseDate_NotEqual(String releaseDate) {
        regReleaseDate(CK_NES, releaseDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RELEASE_DATE: {varchar(30)}
     * @param releaseDate The value of releaseDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReleaseDate_GreaterThan(String releaseDate) {
        regReleaseDate(CK_GT, fRES(releaseDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RELEASE_DATE: {varchar(30)}
     * @param releaseDate The value of releaseDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReleaseDate_LessThan(String releaseDate) {
        regReleaseDate(CK_LT, fRES(releaseDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RELEASE_DATE: {varchar(30)}
     * @param releaseDate The value of releaseDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReleaseDate_GreaterEqual(String releaseDate) {
        regReleaseDate(CK_GE, fRES(releaseDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RELEASE_DATE: {varchar(30)}
     * @param releaseDate The value of releaseDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReleaseDate_LessEqual(String releaseDate) {
        regReleaseDate(CK_LE, fRES(releaseDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RELEASE_DATE: {varchar(30)}
     * @param releaseDateList The collection of releaseDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReleaseDate_InScope(Collection<String> releaseDateList) {
        doSetReleaseDate_InScope(releaseDateList);
    }

    protected void doSetReleaseDate_InScope(Collection<String> releaseDateList) {
        regINS(CK_INS, cTL(releaseDateList), xgetCValueReleaseDate(), "RELEASE_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RELEASE_DATE: {varchar(30)}
     * @param releaseDateList The collection of releaseDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReleaseDate_NotInScope(Collection<String> releaseDateList) {
        doSetReleaseDate_NotInScope(releaseDateList);
    }

    protected void doSetReleaseDate_NotInScope(Collection<String> releaseDateList) {
        regINS(CK_NINS, cTL(releaseDateList), xgetCValueReleaseDate(), "RELEASE_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RELEASE_DATE: {varchar(30)} <br>
     * <pre>e.g. setReleaseDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param releaseDate The value of releaseDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReleaseDate_LikeSearch(String releaseDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(releaseDate), xgetCValueReleaseDate(), "RELEASE_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RELEASE_DATE: {varchar(30)}
     * @param releaseDate The value of releaseDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReleaseDate_NotLikeSearch(String releaseDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(releaseDate), xgetCValueReleaseDate(), "RELEASE_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RELEASE_DATE: {varchar(30)}
     * @param releaseDate The value of releaseDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReleaseDate_PrefixSearch(String releaseDate) {
        setReleaseDate_LikeSearch(releaseDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RELEASE_DATE: {varchar(30)}
     */
    public void setReleaseDate_IsNull() { regReleaseDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RELEASE_DATE: {varchar(30)}
     */
    public void setReleaseDate_IsNullOrEmpty() { regReleaseDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RELEASE_DATE: {varchar(30)}
     */
    public void setReleaseDate_IsNotNull() { regReleaseDate(CK_ISNN, DOBJ); }

    protected void regReleaseDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReleaseDate(), "RELEASE_DATE"); }
    protected abstract ConditionValue xgetCValueReleaseDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_TYPE: {varchar(30)}
     * @param getPointType The value of getPointType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointType_Equal(String getPointType) {
        doSetGetPointType_Equal(fRES(getPointType));
    }

    protected void doSetGetPointType_Equal(String getPointType) {
        regGetPointType(CK_EQ, getPointType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_TYPE: {varchar(30)}
     * @param getPointType The value of getPointType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointType_NotEqual(String getPointType) {
        doSetGetPointType_NotEqual(fRES(getPointType));
    }

    protected void doSetGetPointType_NotEqual(String getPointType) {
        regGetPointType(CK_NES, getPointType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_TYPE: {varchar(30)}
     * @param getPointType The value of getPointType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointType_GreaterThan(String getPointType) {
        regGetPointType(CK_GT, fRES(getPointType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_TYPE: {varchar(30)}
     * @param getPointType The value of getPointType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointType_LessThan(String getPointType) {
        regGetPointType(CK_LT, fRES(getPointType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_TYPE: {varchar(30)}
     * @param getPointType The value of getPointType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointType_GreaterEqual(String getPointType) {
        regGetPointType(CK_GE, fRES(getPointType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GET_POINT_TYPE: {varchar(30)}
     * @param getPointType The value of getPointType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointType_LessEqual(String getPointType) {
        regGetPointType(CK_LE, fRES(getPointType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GET_POINT_TYPE: {varchar(30)}
     * @param getPointTypeList The collection of getPointType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointType_InScope(Collection<String> getPointTypeList) {
        doSetGetPointType_InScope(getPointTypeList);
    }

    protected void doSetGetPointType_InScope(Collection<String> getPointTypeList) {
        regINS(CK_INS, cTL(getPointTypeList), xgetCValueGetPointType(), "GET_POINT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GET_POINT_TYPE: {varchar(30)}
     * @param getPointTypeList The collection of getPointType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointType_NotInScope(Collection<String> getPointTypeList) {
        doSetGetPointType_NotInScope(getPointTypeList);
    }

    protected void doSetGetPointType_NotInScope(Collection<String> getPointTypeList) {
        regINS(CK_NINS, cTL(getPointTypeList), xgetCValueGetPointType(), "GET_POINT_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GET_POINT_TYPE: {varchar(30)} <br>
     * <pre>e.g. setGetPointType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param getPointType The value of getPointType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGetPointType_LikeSearch(String getPointType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(getPointType), xgetCValueGetPointType(), "GET_POINT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GET_POINT_TYPE: {varchar(30)}
     * @param getPointType The value of getPointType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGetPointType_NotLikeSearch(String getPointType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(getPointType), xgetCValueGetPointType(), "GET_POINT_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GET_POINT_TYPE: {varchar(30)}
     * @param getPointType The value of getPointType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGetPointType_PrefixSearch(String getPointType) {
        setGetPointType_LikeSearch(getPointType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GET_POINT_TYPE: {varchar(30)}
     */
    public void setGetPointType_IsNull() { regGetPointType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GET_POINT_TYPE: {varchar(30)}
     */
    public void setGetPointType_IsNullOrEmpty() { regGetPointType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GET_POINT_TYPE: {varchar(30)}
     */
    public void setGetPointType_IsNotNull() { regGetPointType(CK_ISNN, DOBJ); }

    protected void regGetPointType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGetPointType(), "GET_POINT_TYPE"); }
    protected abstract ConditionValue xgetCValueGetPointType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN: {varchar(30)}
     * @param jan The value of jan as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJan_Equal(String jan) {
        doSetJan_Equal(fRES(jan));
    }

    protected void doSetJan_Equal(String jan) {
        regJan(CK_EQ, jan);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN: {varchar(30)}
     * @param jan The value of jan as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJan_NotEqual(String jan) {
        doSetJan_NotEqual(fRES(jan));
    }

    protected void doSetJan_NotEqual(String jan) {
        regJan(CK_NES, jan);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN: {varchar(30)}
     * @param jan The value of jan as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJan_GreaterThan(String jan) {
        regJan(CK_GT, fRES(jan));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN: {varchar(30)}
     * @param jan The value of jan as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJan_LessThan(String jan) {
        regJan(CK_LT, fRES(jan));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN: {varchar(30)}
     * @param jan The value of jan as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJan_GreaterEqual(String jan) {
        regJan(CK_GE, fRES(jan));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN: {varchar(30)}
     * @param jan The value of jan as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJan_LessEqual(String jan) {
        regJan(CK_LE, fRES(jan));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN: {varchar(30)}
     * @param janList The collection of jan as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJan_InScope(Collection<String> janList) {
        doSetJan_InScope(janList);
    }

    protected void doSetJan_InScope(Collection<String> janList) {
        regINS(CK_INS, cTL(janList), xgetCValueJan(), "JAN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN: {varchar(30)}
     * @param janList The collection of jan as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJan_NotInScope(Collection<String> janList) {
        doSetJan_NotInScope(janList);
    }

    protected void doSetJan_NotInScope(Collection<String> janList) {
        regINS(CK_NINS, cTL(janList), xgetCValueJan(), "JAN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN: {varchar(30)} <br>
     * <pre>e.g. setJan_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jan The value of jan as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJan_LikeSearch(String jan, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(jan), xgetCValueJan(), "JAN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN: {varchar(30)}
     * @param jan The value of jan as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJan_NotLikeSearch(String jan, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(jan), xgetCValueJan(), "JAN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN: {varchar(30)}
     * @param jan The value of jan as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJan_PrefixSearch(String jan) {
        setJan_LikeSearch(jan, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JAN: {varchar(30)}
     */
    public void setJan_IsNull() { regJan(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * JAN: {varchar(30)}
     */
    public void setJan_IsNullOrEmpty() { regJan(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JAN: {varchar(30)}
     */
    public void setJan_IsNotNull() { regJan(CK_ISNN, DOBJ); }

    protected void regJan(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJan(), "JAN"); }
    protected abstract ConditionValue xgetCValueJan();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_Equal(String productId) {
        doSetProductId_Equal(fRES(productId));
    }

    protected void doSetProductId_Equal(String productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(String productId) {
        doSetProductId_NotEqual(fRES(productId));
    }

    protected void doSetProductId_NotEqual(String productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(String productId) {
        regProductId(CK_GT, fRES(productId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_LessThan(String productId) {
        regProductId(CK_LT, fRES(productId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(String productId) {
        regProductId(CK_GE, fRES(productId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(String productId) {
        regProductId(CK_LE, fRES(productId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<String> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<String> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<String> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<String> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {varchar(30)} <br>
     * <pre>e.g. setProductId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productId The value of productId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductId_LikeSearch(String productId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productId), xgetCValueProductId(), "PRODUCT_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductId_NotLikeSearch(String productId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productId), xgetCValueProductId(), "PRODUCT_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     * @param productId The value of productId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_PrefixSearch(String productId) {
        setProductId_LikeSearch(productId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     */
    public void setProductId_IsNullOrEmpty() { regProductId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {varchar(30)}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_CHARGED_TO_STORE: {bigint(19)}
     * @param pointChargedToStore The value of pointChargedToStore as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointChargedToStore_Equal(Long pointChargedToStore) {
        doSetPointChargedToStore_Equal(pointChargedToStore);
    }

    protected void doSetPointChargedToStore_Equal(Long pointChargedToStore) {
        regPointChargedToStore(CK_EQ, pointChargedToStore);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_CHARGED_TO_STORE: {bigint(19)}
     * @param pointChargedToStore The value of pointChargedToStore as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointChargedToStore_NotEqual(Long pointChargedToStore) {
        doSetPointChargedToStore_NotEqual(pointChargedToStore);
    }

    protected void doSetPointChargedToStore_NotEqual(Long pointChargedToStore) {
        regPointChargedToStore(CK_NES, pointChargedToStore);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_CHARGED_TO_STORE: {bigint(19)}
     * @param pointChargedToStore The value of pointChargedToStore as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointChargedToStore_GreaterThan(Long pointChargedToStore) {
        regPointChargedToStore(CK_GT, pointChargedToStore);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_CHARGED_TO_STORE: {bigint(19)}
     * @param pointChargedToStore The value of pointChargedToStore as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointChargedToStore_LessThan(Long pointChargedToStore) {
        regPointChargedToStore(CK_LT, pointChargedToStore);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_CHARGED_TO_STORE: {bigint(19)}
     * @param pointChargedToStore The value of pointChargedToStore as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointChargedToStore_GreaterEqual(Long pointChargedToStore) {
        regPointChargedToStore(CK_GE, pointChargedToStore);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_CHARGED_TO_STORE: {bigint(19)}
     * @param pointChargedToStore The value of pointChargedToStore as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointChargedToStore_LessEqual(Long pointChargedToStore) {
        regPointChargedToStore(CK_LE, pointChargedToStore);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_CHARGED_TO_STORE: {bigint(19)}
     * @param minNumber The min number of pointChargedToStore. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pointChargedToStore. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPointChargedToStore_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePointChargedToStore(), "POINT_CHARGED_TO_STORE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POINT_CHARGED_TO_STORE: {bigint(19)}
     * @param pointChargedToStoreList The collection of pointChargedToStore as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointChargedToStore_InScope(Collection<Long> pointChargedToStoreList) {
        doSetPointChargedToStore_InScope(pointChargedToStoreList);
    }

    protected void doSetPointChargedToStore_InScope(Collection<Long> pointChargedToStoreList) {
        regINS(CK_INS, cTL(pointChargedToStoreList), xgetCValuePointChargedToStore(), "POINT_CHARGED_TO_STORE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POINT_CHARGED_TO_STORE: {bigint(19)}
     * @param pointChargedToStoreList The collection of pointChargedToStore as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointChargedToStore_NotInScope(Collection<Long> pointChargedToStoreList) {
        doSetPointChargedToStore_NotInScope(pointChargedToStoreList);
    }

    protected void doSetPointChargedToStore_NotInScope(Collection<Long> pointChargedToStoreList) {
        regINS(CK_NINS, cTL(pointChargedToStoreList), xgetCValuePointChargedToStore(), "POINT_CHARGED_TO_STORE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_CHARGED_TO_STORE: {bigint(19)}
     */
    public void setPointChargedToStore_IsNull() { regPointChargedToStore(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_CHARGED_TO_STORE: {bigint(19)}
     */
    public void setPointChargedToStore_IsNotNull() { regPointChargedToStore(CK_ISNN, DOBJ); }

    protected void regPointChargedToStore(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointChargedToStore(), "POINT_CHARGED_TO_STORE"); }
    protected abstract ConditionValue xgetCValuePointChargedToStore();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQty The value of packingQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingQty_Equal(Long packingQty) {
        doSetPackingQty_Equal(packingQty);
    }

    protected void doSetPackingQty_Equal(Long packingQty) {
        regPackingQty(CK_EQ, packingQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQty The value of packingQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingQty_NotEqual(Long packingQty) {
        doSetPackingQty_NotEqual(packingQty);
    }

    protected void doSetPackingQty_NotEqual(Long packingQty) {
        regPackingQty(CK_NES, packingQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQty The value of packingQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingQty_GreaterThan(Long packingQty) {
        regPackingQty(CK_GT, packingQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQty The value of packingQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingQty_LessThan(Long packingQty) {
        regPackingQty(CK_LT, packingQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQty The value of packingQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingQty_GreaterEqual(Long packingQty) {
        regPackingQty(CK_GE, packingQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQty The value of packingQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingQty_LessEqual(Long packingQty) {
        regPackingQty(CK_LE, packingQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param minNumber The min number of packingQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingQty(), "PACKING_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQtyList The collection of packingQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingQty_InScope(Collection<Long> packingQtyList) {
        doSetPackingQty_InScope(packingQtyList);
    }

    protected void doSetPackingQty_InScope(Collection<Long> packingQtyList) {
        regINS(CK_INS, cTL(packingQtyList), xgetCValuePackingQty(), "PACKING_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     * @param packingQtyList The collection of packingQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingQty_NotInScope(Collection<Long> packingQtyList) {
        doSetPackingQty_NotInScope(packingQtyList);
    }

    protected void doSetPackingQty_NotInScope(Collection<Long> packingQtyList) {
        regINS(CK_NINS, cTL(packingQtyList), xgetCValuePackingQty(), "PACKING_QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     */
    public void setPackingQty_IsNull() { regPackingQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_QTY: {bigint(19)}
     */
    public void setPackingQty_IsNotNull() { regPackingQty(CK_ISNN, DOBJ); }

    protected void regPackingQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingQty(), "PACKING_QTY"); }
    protected abstract ConditionValue xgetCValuePackingQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_Equal(String slipItemNm1) {
        doSetSlipItemNm1_Equal(fRES(slipItemNm1));
    }

    protected void doSetSlipItemNm1_Equal(String slipItemNm1) {
        regSlipItemNm1(CK_EQ, slipItemNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_NotEqual(String slipItemNm1) {
        doSetSlipItemNm1_NotEqual(fRES(slipItemNm1));
    }

    protected void doSetSlipItemNm1_NotEqual(String slipItemNm1) {
        regSlipItemNm1(CK_NES, slipItemNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_GreaterThan(String slipItemNm1) {
        regSlipItemNm1(CK_GT, fRES(slipItemNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_LessThan(String slipItemNm1) {
        regSlipItemNm1(CK_LT, fRES(slipItemNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_GreaterEqual(String slipItemNm1) {
        regSlipItemNm1(CK_GE, fRES(slipItemNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_LessEqual(String slipItemNm1) {
        regSlipItemNm1(CK_LE, fRES(slipItemNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1List The collection of slipItemNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_InScope(Collection<String> slipItemNm1List) {
        doSetSlipItemNm1_InScope(slipItemNm1List);
    }

    protected void doSetSlipItemNm1_InScope(Collection<String> slipItemNm1List) {
        regINS(CK_INS, cTL(slipItemNm1List), xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1List The collection of slipItemNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_NotInScope(Collection<String> slipItemNm1List) {
        doSetSlipItemNm1_NotInScope(slipItemNm1List);
    }

    protected void doSetSlipItemNm1_NotInScope(Collection<String> slipItemNm1List) {
        regINS(CK_NINS, cTL(slipItemNm1List), xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)} <br>
     * <pre>e.g. setSlipItemNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm1 The value of slipItemNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm1_LikeSearch(String slipItemNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm1), xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm1_NotLikeSearch(String slipItemNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm1), xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @param slipItemNm1 The value of slipItemNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm1_PrefixSearch(String slipItemNm1) {
        setSlipItemNm1_LikeSearch(slipItemNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     */
    public void setSlipItemNm1_IsNull() { regSlipItemNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     */
    public void setSlipItemNm1_IsNullOrEmpty() { regSlipItemNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     */
    public void setSlipItemNm1_IsNotNull() { regSlipItemNm1(CK_ISNN, DOBJ); }

    protected void regSlipItemNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm1(), "SLIP_ITEM_NM1"); }
    protected abstract ConditionValue xgetCValueSlipItemNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_Equal(String slipItemNm2) {
        doSetSlipItemNm2_Equal(fRES(slipItemNm2));
    }

    protected void doSetSlipItemNm2_Equal(String slipItemNm2) {
        regSlipItemNm2(CK_EQ, slipItemNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_NotEqual(String slipItemNm2) {
        doSetSlipItemNm2_NotEqual(fRES(slipItemNm2));
    }

    protected void doSetSlipItemNm2_NotEqual(String slipItemNm2) {
        regSlipItemNm2(CK_NES, slipItemNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_GreaterThan(String slipItemNm2) {
        regSlipItemNm2(CK_GT, fRES(slipItemNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_LessThan(String slipItemNm2) {
        regSlipItemNm2(CK_LT, fRES(slipItemNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_GreaterEqual(String slipItemNm2) {
        regSlipItemNm2(CK_GE, fRES(slipItemNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_LessEqual(String slipItemNm2) {
        regSlipItemNm2(CK_LE, fRES(slipItemNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2List The collection of slipItemNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_InScope(Collection<String> slipItemNm2List) {
        doSetSlipItemNm2_InScope(slipItemNm2List);
    }

    protected void doSetSlipItemNm2_InScope(Collection<String> slipItemNm2List) {
        regINS(CK_INS, cTL(slipItemNm2List), xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2List The collection of slipItemNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_NotInScope(Collection<String> slipItemNm2List) {
        doSetSlipItemNm2_NotInScope(slipItemNm2List);
    }

    protected void doSetSlipItemNm2_NotInScope(Collection<String> slipItemNm2List) {
        regINS(CK_NINS, cTL(slipItemNm2List), xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)} <br>
     * <pre>e.g. setSlipItemNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm2 The value of slipItemNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm2_LikeSearch(String slipItemNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm2), xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm2_NotLikeSearch(String slipItemNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm2), xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @param slipItemNm2 The value of slipItemNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm2_PrefixSearch(String slipItemNm2) {
        setSlipItemNm2_LikeSearch(slipItemNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     */
    public void setSlipItemNm2_IsNull() { regSlipItemNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     */
    public void setSlipItemNm2_IsNullOrEmpty() { regSlipItemNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     */
    public void setSlipItemNm2_IsNotNull() { regSlipItemNm2(CK_ISNN, DOBJ); }

    protected void regSlipItemNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm2(), "SLIP_ITEM_NM2"); }
    protected abstract ConditionValue xgetCValueSlipItemNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_Equal(String slipItemNm3) {
        doSetSlipItemNm3_Equal(fRES(slipItemNm3));
    }

    protected void doSetSlipItemNm3_Equal(String slipItemNm3) {
        regSlipItemNm3(CK_EQ, slipItemNm3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_NotEqual(String slipItemNm3) {
        doSetSlipItemNm3_NotEqual(fRES(slipItemNm3));
    }

    protected void doSetSlipItemNm3_NotEqual(String slipItemNm3) {
        regSlipItemNm3(CK_NES, slipItemNm3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_GreaterThan(String slipItemNm3) {
        regSlipItemNm3(CK_GT, fRES(slipItemNm3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_LessThan(String slipItemNm3) {
        regSlipItemNm3(CK_LT, fRES(slipItemNm3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_GreaterEqual(String slipItemNm3) {
        regSlipItemNm3(CK_GE, fRES(slipItemNm3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_LessEqual(String slipItemNm3) {
        regSlipItemNm3(CK_LE, fRES(slipItemNm3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3List The collection of slipItemNm3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_InScope(Collection<String> slipItemNm3List) {
        doSetSlipItemNm3_InScope(slipItemNm3List);
    }

    protected void doSetSlipItemNm3_InScope(Collection<String> slipItemNm3List) {
        regINS(CK_INS, cTL(slipItemNm3List), xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3List The collection of slipItemNm3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_NotInScope(Collection<String> slipItemNm3List) {
        doSetSlipItemNm3_NotInScope(slipItemNm3List);
    }

    protected void doSetSlipItemNm3_NotInScope(Collection<String> slipItemNm3List) {
        regINS(CK_NINS, cTL(slipItemNm3List), xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)} <br>
     * <pre>e.g. setSlipItemNm3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm3 The value of slipItemNm3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm3_LikeSearch(String slipItemNm3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm3), xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm3_NotLikeSearch(String slipItemNm3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm3), xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @param slipItemNm3 The value of slipItemNm3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm3_PrefixSearch(String slipItemNm3) {
        setSlipItemNm3_LikeSearch(slipItemNm3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     */
    public void setSlipItemNm3_IsNull() { regSlipItemNm3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     */
    public void setSlipItemNm3_IsNullOrEmpty() { regSlipItemNm3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     */
    public void setSlipItemNm3_IsNotNull() { regSlipItemNm3(CK_ISNN, DOBJ); }

    protected void regSlipItemNm3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm3(), "SLIP_ITEM_NM3"); }
    protected abstract ConditionValue xgetCValueSlipItemNm3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_Equal(String slipItemNm4) {
        doSetSlipItemNm4_Equal(fRES(slipItemNm4));
    }

    protected void doSetSlipItemNm4_Equal(String slipItemNm4) {
        regSlipItemNm4(CK_EQ, slipItemNm4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_NotEqual(String slipItemNm4) {
        doSetSlipItemNm4_NotEqual(fRES(slipItemNm4));
    }

    protected void doSetSlipItemNm4_NotEqual(String slipItemNm4) {
        regSlipItemNm4(CK_NES, slipItemNm4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_GreaterThan(String slipItemNm4) {
        regSlipItemNm4(CK_GT, fRES(slipItemNm4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_LessThan(String slipItemNm4) {
        regSlipItemNm4(CK_LT, fRES(slipItemNm4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_GreaterEqual(String slipItemNm4) {
        regSlipItemNm4(CK_GE, fRES(slipItemNm4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_LessEqual(String slipItemNm4) {
        regSlipItemNm4(CK_LE, fRES(slipItemNm4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4List The collection of slipItemNm4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_InScope(Collection<String> slipItemNm4List) {
        doSetSlipItemNm4_InScope(slipItemNm4List);
    }

    protected void doSetSlipItemNm4_InScope(Collection<String> slipItemNm4List) {
        regINS(CK_INS, cTL(slipItemNm4List), xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4List The collection of slipItemNm4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_NotInScope(Collection<String> slipItemNm4List) {
        doSetSlipItemNm4_NotInScope(slipItemNm4List);
    }

    protected void doSetSlipItemNm4_NotInScope(Collection<String> slipItemNm4List) {
        regINS(CK_NINS, cTL(slipItemNm4List), xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)} <br>
     * <pre>e.g. setSlipItemNm4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm4 The value of slipItemNm4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm4_LikeSearch(String slipItemNm4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm4), xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm4_NotLikeSearch(String slipItemNm4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm4), xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @param slipItemNm4 The value of slipItemNm4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm4_PrefixSearch(String slipItemNm4) {
        setSlipItemNm4_LikeSearch(slipItemNm4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     */
    public void setSlipItemNm4_IsNull() { regSlipItemNm4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     */
    public void setSlipItemNm4_IsNullOrEmpty() { regSlipItemNm4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     */
    public void setSlipItemNm4_IsNotNull() { regSlipItemNm4(CK_ISNN, DOBJ); }

    protected void regSlipItemNm4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm4(), "SLIP_ITEM_NM4"); }
    protected abstract ConditionValue xgetCValueSlipItemNm4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_Equal(String slipItemNm5) {
        doSetSlipItemNm5_Equal(fRES(slipItemNm5));
    }

    protected void doSetSlipItemNm5_Equal(String slipItemNm5) {
        regSlipItemNm5(CK_EQ, slipItemNm5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_NotEqual(String slipItemNm5) {
        doSetSlipItemNm5_NotEqual(fRES(slipItemNm5));
    }

    protected void doSetSlipItemNm5_NotEqual(String slipItemNm5) {
        regSlipItemNm5(CK_NES, slipItemNm5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_GreaterThan(String slipItemNm5) {
        regSlipItemNm5(CK_GT, fRES(slipItemNm5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_LessThan(String slipItemNm5) {
        regSlipItemNm5(CK_LT, fRES(slipItemNm5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_GreaterEqual(String slipItemNm5) {
        regSlipItemNm5(CK_GE, fRES(slipItemNm5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_LessEqual(String slipItemNm5) {
        regSlipItemNm5(CK_LE, fRES(slipItemNm5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5List The collection of slipItemNm5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_InScope(Collection<String> slipItemNm5List) {
        doSetSlipItemNm5_InScope(slipItemNm5List);
    }

    protected void doSetSlipItemNm5_InScope(Collection<String> slipItemNm5List) {
        regINS(CK_INS, cTL(slipItemNm5List), xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5List The collection of slipItemNm5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_NotInScope(Collection<String> slipItemNm5List) {
        doSetSlipItemNm5_NotInScope(slipItemNm5List);
    }

    protected void doSetSlipItemNm5_NotInScope(Collection<String> slipItemNm5List) {
        regINS(CK_NINS, cTL(slipItemNm5List), xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)} <br>
     * <pre>e.g. setSlipItemNm5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemNm5 The value of slipItemNm5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemNm5_LikeSearch(String slipItemNm5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemNm5), xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemNm5_NotLikeSearch(String slipItemNm5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemNm5), xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @param slipItemNm5 The value of slipItemNm5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemNm5_PrefixSearch(String slipItemNm5) {
        setSlipItemNm5_LikeSearch(slipItemNm5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     */
    public void setSlipItemNm5_IsNull() { regSlipItemNm5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     */
    public void setSlipItemNm5_IsNullOrEmpty() { regSlipItemNm5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     */
    public void setSlipItemNm5_IsNotNull() { regSlipItemNm5(CK_ISNN, DOBJ); }

    protected void regSlipItemNm5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemNm5(), "SLIP_ITEM_NM5"); }
    protected abstract ConditionValue xgetCValueSlipItemNm5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_Equal(String slipItemCd1) {
        doSetSlipItemCd1_Equal(fRES(slipItemCd1));
    }

    protected void doSetSlipItemCd1_Equal(String slipItemCd1) {
        regSlipItemCd1(CK_EQ, slipItemCd1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_NotEqual(String slipItemCd1) {
        doSetSlipItemCd1_NotEqual(fRES(slipItemCd1));
    }

    protected void doSetSlipItemCd1_NotEqual(String slipItemCd1) {
        regSlipItemCd1(CK_NES, slipItemCd1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_GreaterThan(String slipItemCd1) {
        regSlipItemCd1(CK_GT, fRES(slipItemCd1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_LessThan(String slipItemCd1) {
        regSlipItemCd1(CK_LT, fRES(slipItemCd1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_GreaterEqual(String slipItemCd1) {
        regSlipItemCd1(CK_GE, fRES(slipItemCd1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_LessEqual(String slipItemCd1) {
        regSlipItemCd1(CK_LE, fRES(slipItemCd1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1List The collection of slipItemCd1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_InScope(Collection<String> slipItemCd1List) {
        doSetSlipItemCd1_InScope(slipItemCd1List);
    }

    protected void doSetSlipItemCd1_InScope(Collection<String> slipItemCd1List) {
        regINS(CK_INS, cTL(slipItemCd1List), xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1List The collection of slipItemCd1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_NotInScope(Collection<String> slipItemCd1List) {
        doSetSlipItemCd1_NotInScope(slipItemCd1List);
    }

    protected void doSetSlipItemCd1_NotInScope(Collection<String> slipItemCd1List) {
        regINS(CK_NINS, cTL(slipItemCd1List), xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)} <br>
     * <pre>e.g. setSlipItemCd1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemCd1 The value of slipItemCd1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemCd1_LikeSearch(String slipItemCd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemCd1), xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemCd1_NotLikeSearch(String slipItemCd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemCd1), xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @param slipItemCd1 The value of slipItemCd1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd1_PrefixSearch(String slipItemCd1) {
        setSlipItemCd1_LikeSearch(slipItemCd1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     */
    public void setSlipItemCd1_IsNull() { regSlipItemCd1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     */
    public void setSlipItemCd1_IsNullOrEmpty() { regSlipItemCd1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     */
    public void setSlipItemCd1_IsNotNull() { regSlipItemCd1(CK_ISNN, DOBJ); }

    protected void regSlipItemCd1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemCd1(), "SLIP_ITEM_CD1"); }
    protected abstract ConditionValue xgetCValueSlipItemCd1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_Equal(String slipItemCd2) {
        doSetSlipItemCd2_Equal(fRES(slipItemCd2));
    }

    protected void doSetSlipItemCd2_Equal(String slipItemCd2) {
        regSlipItemCd2(CK_EQ, slipItemCd2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_NotEqual(String slipItemCd2) {
        doSetSlipItemCd2_NotEqual(fRES(slipItemCd2));
    }

    protected void doSetSlipItemCd2_NotEqual(String slipItemCd2) {
        regSlipItemCd2(CK_NES, slipItemCd2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_GreaterThan(String slipItemCd2) {
        regSlipItemCd2(CK_GT, fRES(slipItemCd2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_LessThan(String slipItemCd2) {
        regSlipItemCd2(CK_LT, fRES(slipItemCd2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_GreaterEqual(String slipItemCd2) {
        regSlipItemCd2(CK_GE, fRES(slipItemCd2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_LessEqual(String slipItemCd2) {
        regSlipItemCd2(CK_LE, fRES(slipItemCd2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2List The collection of slipItemCd2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_InScope(Collection<String> slipItemCd2List) {
        doSetSlipItemCd2_InScope(slipItemCd2List);
    }

    protected void doSetSlipItemCd2_InScope(Collection<String> slipItemCd2List) {
        regINS(CK_INS, cTL(slipItemCd2List), xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2List The collection of slipItemCd2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_NotInScope(Collection<String> slipItemCd2List) {
        doSetSlipItemCd2_NotInScope(slipItemCd2List);
    }

    protected void doSetSlipItemCd2_NotInScope(Collection<String> slipItemCd2List) {
        regINS(CK_NINS, cTL(slipItemCd2List), xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)} <br>
     * <pre>e.g. setSlipItemCd2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipItemCd2 The value of slipItemCd2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipItemCd2_LikeSearch(String slipItemCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipItemCd2), xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipItemCd2_NotLikeSearch(String slipItemCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipItemCd2), xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @param slipItemCd2 The value of slipItemCd2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipItemCd2_PrefixSearch(String slipItemCd2) {
        setSlipItemCd2_LikeSearch(slipItemCd2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     */
    public void setSlipItemCd2_IsNull() { regSlipItemCd2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     */
    public void setSlipItemCd2_IsNullOrEmpty() { regSlipItemCd2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     */
    public void setSlipItemCd2_IsNotNull() { regSlipItemCd2(CK_ISNN, DOBJ); }

    protected void regSlipItemCd2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipItemCd2(), "SLIP_ITEM_CD2"); }
    protected abstract ConditionValue xgetCValueSlipItemCd2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_Equal(String freightHandling1) {
        doSetFreightHandling1_Equal(fRES(freightHandling1));
    }

    protected void doSetFreightHandling1_Equal(String freightHandling1) {
        regFreightHandling1(CK_EQ, freightHandling1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_NotEqual(String freightHandling1) {
        doSetFreightHandling1_NotEqual(fRES(freightHandling1));
    }

    protected void doSetFreightHandling1_NotEqual(String freightHandling1) {
        regFreightHandling1(CK_NES, freightHandling1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_GreaterThan(String freightHandling1) {
        regFreightHandling1(CK_GT, fRES(freightHandling1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_LessThan(String freightHandling1) {
        regFreightHandling1(CK_LT, fRES(freightHandling1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_GreaterEqual(String freightHandling1) {
        regFreightHandling1(CK_GE, fRES(freightHandling1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_LessEqual(String freightHandling1) {
        regFreightHandling1(CK_LE, fRES(freightHandling1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1List The collection of freightHandling1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_InScope(Collection<String> freightHandling1List) {
        doSetFreightHandling1_InScope(freightHandling1List);
    }

    protected void doSetFreightHandling1_InScope(Collection<String> freightHandling1List) {
        regINS(CK_INS, cTL(freightHandling1List), xgetCValueFreightHandling1(), "FREIGHT_HANDLING1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1List The collection of freightHandling1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_NotInScope(Collection<String> freightHandling1List) {
        doSetFreightHandling1_NotInScope(freightHandling1List);
    }

    protected void doSetFreightHandling1_NotInScope(Collection<String> freightHandling1List) {
        regINS(CK_NINS, cTL(freightHandling1List), xgetCValueFreightHandling1(), "FREIGHT_HANDLING1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)} <br>
     * <pre>e.g. setFreightHandling1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param freightHandling1 The value of freightHandling1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFreightHandling1_LikeSearch(String freightHandling1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(freightHandling1), xgetCValueFreightHandling1(), "FREIGHT_HANDLING1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFreightHandling1_NotLikeSearch(String freightHandling1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(freightHandling1), xgetCValueFreightHandling1(), "FREIGHT_HANDLING1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @param freightHandling1 The value of freightHandling1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling1_PrefixSearch(String freightHandling1) {
        setFreightHandling1_LikeSearch(freightHandling1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     */
    public void setFreightHandling1_IsNull() { regFreightHandling1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     */
    public void setFreightHandling1_IsNullOrEmpty() { regFreightHandling1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     */
    public void setFreightHandling1_IsNotNull() { regFreightHandling1(CK_ISNN, DOBJ); }

    protected void regFreightHandling1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFreightHandling1(), "FREIGHT_HANDLING1"); }
    protected abstract ConditionValue xgetCValueFreightHandling1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_Equal(String freightHandling2) {
        doSetFreightHandling2_Equal(fRES(freightHandling2));
    }

    protected void doSetFreightHandling2_Equal(String freightHandling2) {
        regFreightHandling2(CK_EQ, freightHandling2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_NotEqual(String freightHandling2) {
        doSetFreightHandling2_NotEqual(fRES(freightHandling2));
    }

    protected void doSetFreightHandling2_NotEqual(String freightHandling2) {
        regFreightHandling2(CK_NES, freightHandling2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_GreaterThan(String freightHandling2) {
        regFreightHandling2(CK_GT, fRES(freightHandling2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_LessThan(String freightHandling2) {
        regFreightHandling2(CK_LT, fRES(freightHandling2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_GreaterEqual(String freightHandling2) {
        regFreightHandling2(CK_GE, fRES(freightHandling2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_LessEqual(String freightHandling2) {
        regFreightHandling2(CK_LE, fRES(freightHandling2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2List The collection of freightHandling2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_InScope(Collection<String> freightHandling2List) {
        doSetFreightHandling2_InScope(freightHandling2List);
    }

    protected void doSetFreightHandling2_InScope(Collection<String> freightHandling2List) {
        regINS(CK_INS, cTL(freightHandling2List), xgetCValueFreightHandling2(), "FREIGHT_HANDLING2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2List The collection of freightHandling2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_NotInScope(Collection<String> freightHandling2List) {
        doSetFreightHandling2_NotInScope(freightHandling2List);
    }

    protected void doSetFreightHandling2_NotInScope(Collection<String> freightHandling2List) {
        regINS(CK_NINS, cTL(freightHandling2List), xgetCValueFreightHandling2(), "FREIGHT_HANDLING2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)} <br>
     * <pre>e.g. setFreightHandling2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param freightHandling2 The value of freightHandling2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFreightHandling2_LikeSearch(String freightHandling2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(freightHandling2), xgetCValueFreightHandling2(), "FREIGHT_HANDLING2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFreightHandling2_NotLikeSearch(String freightHandling2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(freightHandling2), xgetCValueFreightHandling2(), "FREIGHT_HANDLING2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @param freightHandling2 The value of freightHandling2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreightHandling2_PrefixSearch(String freightHandling2) {
        setFreightHandling2_LikeSearch(freightHandling2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     */
    public void setFreightHandling2_IsNull() { regFreightHandling2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     */
    public void setFreightHandling2_IsNullOrEmpty() { regFreightHandling2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     */
    public void setFreightHandling2_IsNotNull() { regFreightHandling2(CK_ISNN, DOBJ); }

    protected void regFreightHandling2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFreightHandling2(), "FREIGHT_HANDLING2"); }
    protected abstract ConditionValue xgetCValueFreightHandling2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_Equal(String article) {
        doSetArticle_Equal(fRES(article));
    }

    protected void doSetArticle_Equal(String article) {
        regArticle(CK_EQ, article);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_NotEqual(String article) {
        doSetArticle_NotEqual(fRES(article));
    }

    protected void doSetArticle_NotEqual(String article) {
        regArticle(CK_NES, article);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_GreaterThan(String article) {
        regArticle(CK_GT, fRES(article));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_LessThan(String article) {
        regArticle(CK_LT, fRES(article));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_GreaterEqual(String article) {
        regArticle(CK_GE, fRES(article));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_LessEqual(String article) {
        regArticle(CK_LE, fRES(article));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param articleList The collection of article as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_InScope(Collection<String> articleList) {
        doSetArticle_InScope(articleList);
    }

    protected void doSetArticle_InScope(Collection<String> articleList) {
        regINS(CK_INS, cTL(articleList), xgetCValueArticle(), "ARTICLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param articleList The collection of article as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_NotInScope(Collection<String> articleList) {
        doSetArticle_NotInScope(articleList);
    }

    protected void doSetArticle_NotInScope(Collection<String> articleList) {
        regINS(CK_NINS, cTL(articleList), xgetCValueArticle(), "ARTICLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)} <br>
     * <pre>e.g. setArticle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param article The value of article as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArticle_LikeSearch(String article, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(article), xgetCValueArticle(), "ARTICLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArticle_NotLikeSearch(String article, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(article), xgetCValueArticle(), "ARTICLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARTICLE: {varchar(255)}
     * @param article The value of article as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArticle_PrefixSearch(String article) {
        setArticle_LikeSearch(article, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     */
    public void setArticle_IsNull() { regArticle(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     */
    public void setArticle_IsNullOrEmpty() { regArticle(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARTICLE: {varchar(255)}
     */
    public void setArticle_IsNotNull() { regArticle(CK_ISNN, DOBJ); }

    protected void regArticle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArticle(), "ARTICLE"); }
    protected abstract ConditionValue xgetCValueArticle();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @param receiveId The value of receiveId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveId_Equal(Long receiveId) {
        doSetReceiveId_Equal(receiveId);
    }

    protected void doSetReceiveId_Equal(Long receiveId) {
        regReceiveId(CK_EQ, receiveId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @param receiveId The value of receiveId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveId_NotEqual(Long receiveId) {
        doSetReceiveId_NotEqual(receiveId);
    }

    protected void doSetReceiveId_NotEqual(Long receiveId) {
        regReceiveId(CK_NES, receiveId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @param receiveId The value of receiveId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveId_GreaterThan(Long receiveId) {
        regReceiveId(CK_GT, receiveId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @param receiveId The value of receiveId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveId_LessThan(Long receiveId) {
        regReceiveId(CK_LT, receiveId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @param receiveId The value of receiveId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveId_GreaterEqual(Long receiveId) {
        regReceiveId(CK_GE, receiveId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @param receiveId The value of receiveId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveId_LessEqual(Long receiveId) {
        regReceiveId(CK_LE, receiveId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @param minNumber The min number of receiveId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveId(), "RECEIVE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @param receiveIdList The collection of receiveId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveId_InScope(Collection<Long> receiveIdList) {
        doSetReceiveId_InScope(receiveIdList);
    }

    protected void doSetReceiveId_InScope(Collection<Long> receiveIdList) {
        regINS(CK_INS, cTL(receiveIdList), xgetCValueReceiveId(), "RECEIVE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @param receiveIdList The collection of receiveId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveId_NotInScope(Collection<Long> receiveIdList) {
        doSetReceiveId_NotInScope(receiveIdList);
    }

    protected void doSetReceiveId_NotInScope(Collection<Long> receiveIdList) {
        regINS(CK_NINS, cTL(receiveIdList), xgetCValueReceiveId(), "RECEIVE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     */
    public void setReceiveId_IsNull() { regReceiveId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     */
    public void setReceiveId_IsNotNull() { regReceiveId(CK_ISNN, DOBJ); }

    protected void regReceiveId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveId(), "RECEIVE_ID"); }
    protected abstract ConditionValue xgetCValueReceiveId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROW_NO: {bigint(19)}
     * @param rowNo The value of rowNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRowNo_Equal(Long rowNo) {
        doSetRowNo_Equal(rowNo);
    }

    protected void doSetRowNo_Equal(Long rowNo) {
        regRowNo(CK_EQ, rowNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROW_NO: {bigint(19)}
     * @param rowNo The value of rowNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRowNo_NotEqual(Long rowNo) {
        doSetRowNo_NotEqual(rowNo);
    }

    protected void doSetRowNo_NotEqual(Long rowNo) {
        regRowNo(CK_NES, rowNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROW_NO: {bigint(19)}
     * @param rowNo The value of rowNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRowNo_GreaterThan(Long rowNo) {
        regRowNo(CK_GT, rowNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ROW_NO: {bigint(19)}
     * @param rowNo The value of rowNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRowNo_LessThan(Long rowNo) {
        regRowNo(CK_LT, rowNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROW_NO: {bigint(19)}
     * @param rowNo The value of rowNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRowNo_GreaterEqual(Long rowNo) {
        regRowNo(CK_GE, rowNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ROW_NO: {bigint(19)}
     * @param rowNo The value of rowNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRowNo_LessEqual(Long rowNo) {
        regRowNo(CK_LE, rowNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ROW_NO: {bigint(19)}
     * @param minNumber The min number of rowNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rowNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRowNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRowNo(), "ROW_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROW_NO: {bigint(19)}
     * @param rowNoList The collection of rowNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNo_InScope(Collection<Long> rowNoList) {
        doSetRowNo_InScope(rowNoList);
    }

    protected void doSetRowNo_InScope(Collection<Long> rowNoList) {
        regINS(CK_INS, cTL(rowNoList), xgetCValueRowNo(), "ROW_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ROW_NO: {bigint(19)}
     * @param rowNoList The collection of rowNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNo_NotInScope(Collection<Long> rowNoList) {
        doSetRowNo_NotInScope(rowNoList);
    }

    protected void doSetRowNo_NotInScope(Collection<Long> rowNoList) {
        regINS(CK_NINS, cTL(rowNoList), xgetCValueRowNo(), "ROW_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ROW_NO: {bigint(19)}
     */
    public void setRowNo_IsNull() { regRowNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ROW_NO: {bigint(19)}
     */
    public void setRowNo_IsNotNull() { regRowNo(CK_ISNN, DOBJ); }

    protected void regRowNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRowNo(), "ROW_NO"); }
    protected abstract ConditionValue xgetCValueRowNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1)}
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
     * ERROR_FLG: {char(1)}
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
     * ERROR_FLG: {char(1)}
     * @param errorFlg The value of errorFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterThan(String errorFlg) {
        regErrorFlg(CK_GT, fRES(errorFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1)}
     * @param errorFlg The value of errorFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessThan(String errorFlg) {
        regErrorFlg(CK_LT, fRES(errorFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1)}
     * @param errorFlg The value of errorFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterEqual(String errorFlg) {
        regErrorFlg(CK_GE, fRES(errorFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1)}
     * @param errorFlg The value of errorFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessEqual(String errorFlg) {
        regErrorFlg(CK_LE, fRES(errorFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1)}
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
     * ERROR_FLG: {char(1)}
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
     * ERROR_FLG: {char(1)} <br>
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
     * ERROR_FLG: {char(1)}
     * @param errorFlg The value of errorFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorFlg_NotLikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1)}
     * @param errorFlg The value of errorFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_PrefixSearch(String errorFlg) {
        setErrorFlg_LikeSearch(errorFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1)}
     */
    public void setErrorFlg_IsNull() { regErrorFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1)}
     */
    public void setErrorFlg_IsNotNull() { regErrorFlg(CK_ISNN, DOBJ); }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {char(1)}
     * @param importFlg The value of importFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_Equal(String importFlg) {
        doSetImportFlg_Equal(fRES(importFlg));
    }

    protected void doSetImportFlg_Equal(String importFlg) {
        regImportFlg(CK_EQ, importFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {char(1)}
     * @param importFlg The value of importFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotEqual(String importFlg) {
        doSetImportFlg_NotEqual(fRES(importFlg));
    }

    protected void doSetImportFlg_NotEqual(String importFlg) {
        regImportFlg(CK_NES, importFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {char(1)}
     * @param importFlg The value of importFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterThan(String importFlg) {
        regImportFlg(CK_GT, fRES(importFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {char(1)}
     * @param importFlg The value of importFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessThan(String importFlg) {
        regImportFlg(CK_LT, fRES(importFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {char(1)}
     * @param importFlg The value of importFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterEqual(String importFlg) {
        regImportFlg(CK_GE, fRES(importFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {char(1)}
     * @param importFlg The value of importFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessEqual(String importFlg) {
        regImportFlg(CK_LE, fRES(importFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {char(1)}
     * @param importFlgList The collection of importFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_InScope(Collection<String> importFlgList) {
        doSetImportFlg_InScope(importFlgList);
    }

    protected void doSetImportFlg_InScope(Collection<String> importFlgList) {
        regINS(CK_INS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {char(1)}
     * @param importFlgList The collection of importFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotInScope(Collection<String> importFlgList) {
        doSetImportFlg_NotInScope(importFlgList);
    }

    protected void doSetImportFlg_NotInScope(Collection<String> importFlgList) {
        regINS(CK_NINS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {char(1)} <br>
     * <pre>e.g. setImportFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param importFlg The value of importFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImportFlg_LikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {char(1)}
     * @param importFlg The value of importFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImportFlg_NotLikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {char(1)}
     * @param importFlg The value of importFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_PrefixSearch(String importFlg) {
        setImportFlg_LikeSearch(importFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMPORT_FLG: {char(1)}
     */
    public void setImportFlg_IsNull() { regImportFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMPORT_FLG: {char(1)}
     */
    public void setImportFlg_IsNotNull() { regImportFlg(CK_ISNN, DOBJ); }

    protected void regImportFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportFlg(), "IMPORT_FLG"); }
    protected abstract ConditionValue xgetCValueImportFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @param importTypeId The value of importTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_Equal(Long importTypeId) {
        doSetImportTypeId_Equal(importTypeId);
    }

    protected void doSetImportTypeId_Equal(Long importTypeId) {
        regImportTypeId(CK_EQ, importTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @param importTypeId The value of importTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_NotEqual(Long importTypeId) {
        doSetImportTypeId_NotEqual(importTypeId);
    }

    protected void doSetImportTypeId_NotEqual(Long importTypeId) {
        regImportTypeId(CK_NES, importTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @param importTypeId The value of importTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_GreaterThan(Long importTypeId) {
        regImportTypeId(CK_GT, importTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @param importTypeId The value of importTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_LessThan(Long importTypeId) {
        regImportTypeId(CK_LT, importTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @param importTypeId The value of importTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_GreaterEqual(Long importTypeId) {
        regImportTypeId(CK_GE, importTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @param importTypeId The value of importTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_LessEqual(Long importTypeId) {
        regImportTypeId(CK_LE, importTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @param minNumber The min number of importTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of importTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImportTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueImportTypeId(), "IMPORT_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @param importTypeIdList The collection of importTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeId_InScope(Collection<Long> importTypeIdList) {
        doSetImportTypeId_InScope(importTypeIdList);
    }

    protected void doSetImportTypeId_InScope(Collection<Long> importTypeIdList) {
        regINS(CK_INS, cTL(importTypeIdList), xgetCValueImportTypeId(), "IMPORT_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @param importTypeIdList The collection of importTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeId_NotInScope(Collection<Long> importTypeIdList) {
        doSetImportTypeId_NotInScope(importTypeIdList);
    }

    protected void doSetImportTypeId_NotInScope(Collection<Long> importTypeIdList) {
        regINS(CK_NINS, cTL(importTypeIdList), xgetCValueImportTypeId(), "IMPORT_TYPE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     */
    public void setImportTypeId_IsNull() { regImportTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     */
    public void setImportTypeId_IsNotNull() { regImportTypeId(CK_ISNN, DOBJ); }

    protected void regImportTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportTypeId(), "IMPORT_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueImportTypeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @param ecOrderBId The value of ecOrderBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderBId_Equal(Long ecOrderBId) {
        doSetEcOrderBId_Equal(ecOrderBId);
    }

    protected void doSetEcOrderBId_Equal(Long ecOrderBId) {
        regEcOrderBId(CK_EQ, ecOrderBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @param ecOrderBId The value of ecOrderBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderBId_NotEqual(Long ecOrderBId) {
        doSetEcOrderBId_NotEqual(ecOrderBId);
    }

    protected void doSetEcOrderBId_NotEqual(Long ecOrderBId) {
        regEcOrderBId(CK_NES, ecOrderBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @param ecOrderBId The value of ecOrderBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderBId_GreaterThan(Long ecOrderBId) {
        regEcOrderBId(CK_GT, ecOrderBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @param ecOrderBId The value of ecOrderBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderBId_LessThan(Long ecOrderBId) {
        regEcOrderBId(CK_LT, ecOrderBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @param ecOrderBId The value of ecOrderBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderBId_GreaterEqual(Long ecOrderBId) {
        regEcOrderBId(CK_GE, ecOrderBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @param ecOrderBId The value of ecOrderBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEcOrderBId_LessEqual(Long ecOrderBId) {
        regEcOrderBId(CK_LE, ecOrderBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @param minNumber The min number of ecOrderBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ecOrderBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEcOrderBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEcOrderBId(), "EC_ORDER_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @param ecOrderBIdList The collection of ecOrderBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBId_InScope(Collection<Long> ecOrderBIdList) {
        doSetEcOrderBId_InScope(ecOrderBIdList);
    }

    protected void doSetEcOrderBId_InScope(Collection<Long> ecOrderBIdList) {
        regINS(CK_INS, cTL(ecOrderBIdList), xgetCValueEcOrderBId(), "EC_ORDER_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @param ecOrderBIdList The collection of ecOrderBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBId_NotInScope(Collection<Long> ecOrderBIdList) {
        doSetEcOrderBId_NotInScope(ecOrderBIdList);
    }

    protected void doSetEcOrderBId_NotInScope(Collection<Long> ecOrderBIdList) {
        regINS(CK_NINS, cTL(ecOrderBIdList), xgetCValueEcOrderBId(), "EC_ORDER_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select EC_ORDER_B_ID from T_EC_ORDER_B where ...)} <br />
     * T_EC_ORDER_B by my EC_ORDER_B_ID, named 'TEcOrderB'.
     * @param subCBLambda The callback for sub-query of TEcOrderB for 'in-scope'. (NotNull)
     */
    public void inScopeTEcOrderB(SubQuery<TEcOrderBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderBCB cb = new TEcOrderBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepEcOrderBId_InScopeRelation_TEcOrderB(cb.query());
        registerInScopeRelation(cb.query(), "EC_ORDER_B_ID", "EC_ORDER_B_ID", pp, "tEcOrderB", false);
    }
    public abstract String keepEcOrderBId_InScopeRelation_TEcOrderB(TEcOrderBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select EC_ORDER_B_ID from T_EC_ORDER_B where ...)} <br />
     * T_EC_ORDER_B by my EC_ORDER_B_ID, named 'TEcOrderB'.
     * @param subCBLambda The callback for sub-query of TEcOrderB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTEcOrderB(SubQuery<TEcOrderBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TEcOrderBCB cb = new TEcOrderBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepEcOrderBId_NotInScopeRelation_TEcOrderB(cb.query());
        registerInScopeRelation(cb.query(), "EC_ORDER_B_ID", "EC_ORDER_B_ID", pp, "tEcOrderB", true);
    }
    public abstract String keepEcOrderBId_NotInScopeRelation_TEcOrderB(TEcOrderBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     */
    public void setEcOrderBId_IsNull() { regEcOrderBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     */
    public void setEcOrderBId_IsNotNull() { regEcOrderBId(CK_ISNN, DOBJ); }

    protected void regEcOrderBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEcOrderBId(), "EC_ORDER_B_ID"); }
    protected abstract ConditionValue xgetCValueEcOrderBId();

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
    public HpSLCFunction<TYahooOrderCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TYahooOrderCB.class);
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
    public HpSLCFunction<TYahooOrderCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TYahooOrderCB.class);
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
    public HpSLCFunction<TYahooOrderCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TYahooOrderCB.class);
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
    public HpSLCFunction<TYahooOrderCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TYahooOrderCB.class);
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
    public HpSLCFunction<TYahooOrderCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TYahooOrderCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TYahooOrderCB&gt;() {
     *     public void query(TYahooOrderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TYahooOrderCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TYahooOrderCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TYahooOrderCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TYahooOrderCQ sq);

    protected TYahooOrderCB xcreateScalarConditionCB() {
        TYahooOrderCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TYahooOrderCB xcreateScalarConditionPartitionByCB() {
        TYahooOrderCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TYahooOrderCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYahooOrderCB cb = new TYahooOrderCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "YAHOO_ORDER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TYahooOrderCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TYahooOrderCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TYahooOrderCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TYahooOrderCB cb = new TYahooOrderCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "YAHOO_ORDER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TYahooOrderCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TYahooOrderCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYahooOrderCB cb = new TYahooOrderCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TYahooOrderCQ sq);

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
    protected TYahooOrderCB newMyCB() {
        return new TYahooOrderCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TYahooOrderCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

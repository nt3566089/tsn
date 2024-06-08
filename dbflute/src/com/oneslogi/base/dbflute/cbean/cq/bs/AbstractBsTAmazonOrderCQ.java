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
 * The abstract condition-query of T_AMAZON_ORDER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTAmazonOrderCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTAmazonOrderCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_AMAZON_ORDER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param amazonOrderId The value of amazonOrderId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmazonOrderId_Equal(Long amazonOrderId) {
        doSetAmazonOrderId_Equal(amazonOrderId);
    }

    protected void doSetAmazonOrderId_Equal(Long amazonOrderId) {
        regAmazonOrderId(CK_EQ, amazonOrderId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param amazonOrderId The value of amazonOrderId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmazonOrderId_NotEqual(Long amazonOrderId) {
        doSetAmazonOrderId_NotEqual(amazonOrderId);
    }

    protected void doSetAmazonOrderId_NotEqual(Long amazonOrderId) {
        regAmazonOrderId(CK_NES, amazonOrderId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param amazonOrderId The value of amazonOrderId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmazonOrderId_GreaterThan(Long amazonOrderId) {
        regAmazonOrderId(CK_GT, amazonOrderId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param amazonOrderId The value of amazonOrderId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmazonOrderId_LessThan(Long amazonOrderId) {
        regAmazonOrderId(CK_LT, amazonOrderId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param amazonOrderId The value of amazonOrderId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmazonOrderId_GreaterEqual(Long amazonOrderId) {
        regAmazonOrderId(CK_GE, amazonOrderId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param amazonOrderId The value of amazonOrderId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmazonOrderId_LessEqual(Long amazonOrderId) {
        regAmazonOrderId(CK_LE, amazonOrderId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of amazonOrderId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of amazonOrderId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAmazonOrderId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAmazonOrderId(), "AMAZON_ORDER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param amazonOrderIdList The collection of amazonOrderId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmazonOrderId_InScope(Collection<Long> amazonOrderIdList) {
        doSetAmazonOrderId_InScope(amazonOrderIdList);
    }

    protected void doSetAmazonOrderId_InScope(Collection<Long> amazonOrderIdList) {
        regINS(CK_INS, cTL(amazonOrderIdList), xgetCValueAmazonOrderId(), "AMAZON_ORDER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param amazonOrderIdList The collection of amazonOrderId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmazonOrderId_NotInScope(Collection<Long> amazonOrderIdList) {
        doSetAmazonOrderId_NotInScope(amazonOrderIdList);
    }

    protected void doSetAmazonOrderId_NotInScope(Collection<Long> amazonOrderIdList) {
        regINS(CK_NINS, cTL(amazonOrderIdList), xgetCValueAmazonOrderId(), "AMAZON_ORDER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setAmazonOrderId_IsNull() { regAmazonOrderId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AMAZON_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setAmazonOrderId_IsNotNull() { regAmazonOrderId(CK_ISNN, DOBJ); }

    protected void regAmazonOrderId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAmazonOrderId(), "AMAZON_ORDER_ID"); }
    protected abstract ConditionValue xgetCValueAmazonOrderId();

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
     * ORDER_ITEM_ID: {varchar(30)}
     * @param orderItemId The value of orderItemId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderItemId_Equal(String orderItemId) {
        doSetOrderItemId_Equal(fRES(orderItemId));
    }

    protected void doSetOrderItemId_Equal(String orderItemId) {
        regOrderItemId(CK_EQ, orderItemId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ITEM_ID: {varchar(30)}
     * @param orderItemId The value of orderItemId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderItemId_NotEqual(String orderItemId) {
        doSetOrderItemId_NotEqual(fRES(orderItemId));
    }

    protected void doSetOrderItemId_NotEqual(String orderItemId) {
        regOrderItemId(CK_NES, orderItemId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ITEM_ID: {varchar(30)}
     * @param orderItemId The value of orderItemId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderItemId_GreaterThan(String orderItemId) {
        regOrderItemId(CK_GT, fRES(orderItemId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ITEM_ID: {varchar(30)}
     * @param orderItemId The value of orderItemId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderItemId_LessThan(String orderItemId) {
        regOrderItemId(CK_LT, fRES(orderItemId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ITEM_ID: {varchar(30)}
     * @param orderItemId The value of orderItemId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderItemId_GreaterEqual(String orderItemId) {
        regOrderItemId(CK_GE, fRES(orderItemId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ITEM_ID: {varchar(30)}
     * @param orderItemId The value of orderItemId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderItemId_LessEqual(String orderItemId) {
        regOrderItemId(CK_LE, fRES(orderItemId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ITEM_ID: {varchar(30)}
     * @param orderItemIdList The collection of orderItemId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderItemId_InScope(Collection<String> orderItemIdList) {
        doSetOrderItemId_InScope(orderItemIdList);
    }

    protected void doSetOrderItemId_InScope(Collection<String> orderItemIdList) {
        regINS(CK_INS, cTL(orderItemIdList), xgetCValueOrderItemId(), "ORDER_ITEM_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ITEM_ID: {varchar(30)}
     * @param orderItemIdList The collection of orderItemId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderItemId_NotInScope(Collection<String> orderItemIdList) {
        doSetOrderItemId_NotInScope(orderItemIdList);
    }

    protected void doSetOrderItemId_NotInScope(Collection<String> orderItemIdList) {
        regINS(CK_NINS, cTL(orderItemIdList), xgetCValueOrderItemId(), "ORDER_ITEM_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ITEM_ID: {varchar(30)} <br>
     * <pre>e.g. setOrderItemId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderItemId The value of orderItemId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderItemId_LikeSearch(String orderItemId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderItemId), xgetCValueOrderItemId(), "ORDER_ITEM_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ITEM_ID: {varchar(30)}
     * @param orderItemId The value of orderItemId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderItemId_NotLikeSearch(String orderItemId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderItemId), xgetCValueOrderItemId(), "ORDER_ITEM_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ITEM_ID: {varchar(30)}
     * @param orderItemId The value of orderItemId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderItemId_PrefixSearch(String orderItemId) {
        setOrderItemId_LikeSearch(orderItemId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_ITEM_ID: {varchar(30)}
     */
    public void setOrderItemId_IsNull() { regOrderItemId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_ITEM_ID: {varchar(30)}
     */
    public void setOrderItemId_IsNullOrEmpty() { regOrderItemId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_ITEM_ID: {varchar(30)}
     */
    public void setOrderItemId_IsNotNull() { regOrderItemId(CK_ISNN, DOBJ); }

    protected void regOrderItemId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderItemId(), "ORDER_ITEM_ID"); }
    protected abstract ConditionValue xgetCValueOrderItemId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATE: {varchar(30)}
     * @param purchaseDate The value of purchaseDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseDate_Equal(String purchaseDate) {
        doSetPurchaseDate_Equal(fRES(purchaseDate));
    }

    protected void doSetPurchaseDate_Equal(String purchaseDate) {
        regPurchaseDate(CK_EQ, purchaseDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATE: {varchar(30)}
     * @param purchaseDate The value of purchaseDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseDate_NotEqual(String purchaseDate) {
        doSetPurchaseDate_NotEqual(fRES(purchaseDate));
    }

    protected void doSetPurchaseDate_NotEqual(String purchaseDate) {
        regPurchaseDate(CK_NES, purchaseDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATE: {varchar(30)}
     * @param purchaseDate The value of purchaseDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseDate_GreaterThan(String purchaseDate) {
        regPurchaseDate(CK_GT, fRES(purchaseDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATE: {varchar(30)}
     * @param purchaseDate The value of purchaseDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseDate_LessThan(String purchaseDate) {
        regPurchaseDate(CK_LT, fRES(purchaseDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATE: {varchar(30)}
     * @param purchaseDate The value of purchaseDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseDate_GreaterEqual(String purchaseDate) {
        regPurchaseDate(CK_GE, fRES(purchaseDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_DATE: {varchar(30)}
     * @param purchaseDate The value of purchaseDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseDate_LessEqual(String purchaseDate) {
        regPurchaseDate(CK_LE, fRES(purchaseDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_DATE: {varchar(30)}
     * @param purchaseDateList The collection of purchaseDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseDate_InScope(Collection<String> purchaseDateList) {
        doSetPurchaseDate_InScope(purchaseDateList);
    }

    protected void doSetPurchaseDate_InScope(Collection<String> purchaseDateList) {
        regINS(CK_INS, cTL(purchaseDateList), xgetCValuePurchaseDate(), "PURCHASE_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_DATE: {varchar(30)}
     * @param purchaseDateList The collection of purchaseDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseDate_NotInScope(Collection<String> purchaseDateList) {
        doSetPurchaseDate_NotInScope(purchaseDateList);
    }

    protected void doSetPurchaseDate_NotInScope(Collection<String> purchaseDateList) {
        regINS(CK_NINS, cTL(purchaseDateList), xgetCValuePurchaseDate(), "PURCHASE_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_DATE: {varchar(30)} <br>
     * <pre>e.g. setPurchaseDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchaseDate The value of purchaseDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchaseDate_LikeSearch(String purchaseDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchaseDate), xgetCValuePurchaseDate(), "PURCHASE_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_DATE: {varchar(30)}
     * @param purchaseDate The value of purchaseDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchaseDate_NotLikeSearch(String purchaseDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchaseDate), xgetCValuePurchaseDate(), "PURCHASE_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_DATE: {varchar(30)}
     * @param purchaseDate The value of purchaseDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseDate_PrefixSearch(String purchaseDate) {
        setPurchaseDate_LikeSearch(purchaseDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PURCHASE_DATE: {varchar(30)}
     */
    public void setPurchaseDate_IsNull() { regPurchaseDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PURCHASE_DATE: {varchar(30)}
     */
    public void setPurchaseDate_IsNullOrEmpty() { regPurchaseDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PURCHASE_DATE: {varchar(30)}
     */
    public void setPurchaseDate_IsNotNull() { regPurchaseDate(CK_ISNN, DOBJ); }

    protected void regPurchaseDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseDate(), "PURCHASE_DATE"); }
    protected abstract ConditionValue xgetCValuePurchaseDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENTS_DATE: {varchar(30)}
     * @param paymentsDate The value of paymentsDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentsDate_Equal(String paymentsDate) {
        doSetPaymentsDate_Equal(fRES(paymentsDate));
    }

    protected void doSetPaymentsDate_Equal(String paymentsDate) {
        regPaymentsDate(CK_EQ, paymentsDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENTS_DATE: {varchar(30)}
     * @param paymentsDate The value of paymentsDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentsDate_NotEqual(String paymentsDate) {
        doSetPaymentsDate_NotEqual(fRES(paymentsDate));
    }

    protected void doSetPaymentsDate_NotEqual(String paymentsDate) {
        regPaymentsDate(CK_NES, paymentsDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENTS_DATE: {varchar(30)}
     * @param paymentsDate The value of paymentsDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentsDate_GreaterThan(String paymentsDate) {
        regPaymentsDate(CK_GT, fRES(paymentsDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENTS_DATE: {varchar(30)}
     * @param paymentsDate The value of paymentsDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentsDate_LessThan(String paymentsDate) {
        regPaymentsDate(CK_LT, fRES(paymentsDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENTS_DATE: {varchar(30)}
     * @param paymentsDate The value of paymentsDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentsDate_GreaterEqual(String paymentsDate) {
        regPaymentsDate(CK_GE, fRES(paymentsDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENTS_DATE: {varchar(30)}
     * @param paymentsDate The value of paymentsDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentsDate_LessEqual(String paymentsDate) {
        regPaymentsDate(CK_LE, fRES(paymentsDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENTS_DATE: {varchar(30)}
     * @param paymentsDateList The collection of paymentsDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentsDate_InScope(Collection<String> paymentsDateList) {
        doSetPaymentsDate_InScope(paymentsDateList);
    }

    protected void doSetPaymentsDate_InScope(Collection<String> paymentsDateList) {
        regINS(CK_INS, cTL(paymentsDateList), xgetCValuePaymentsDate(), "PAYMENTS_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENTS_DATE: {varchar(30)}
     * @param paymentsDateList The collection of paymentsDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentsDate_NotInScope(Collection<String> paymentsDateList) {
        doSetPaymentsDate_NotInScope(paymentsDateList);
    }

    protected void doSetPaymentsDate_NotInScope(Collection<String> paymentsDateList) {
        regINS(CK_NINS, cTL(paymentsDateList), xgetCValuePaymentsDate(), "PAYMENTS_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENTS_DATE: {varchar(30)} <br>
     * <pre>e.g. setPaymentsDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param paymentsDate The value of paymentsDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPaymentsDate_LikeSearch(String paymentsDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(paymentsDate), xgetCValuePaymentsDate(), "PAYMENTS_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENTS_DATE: {varchar(30)}
     * @param paymentsDate The value of paymentsDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPaymentsDate_NotLikeSearch(String paymentsDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(paymentsDate), xgetCValuePaymentsDate(), "PAYMENTS_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENTS_DATE: {varchar(30)}
     * @param paymentsDate The value of paymentsDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentsDate_PrefixSearch(String paymentsDate) {
        setPaymentsDate_LikeSearch(paymentsDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAYMENTS_DATE: {varchar(30)}
     */
    public void setPaymentsDate_IsNull() { regPaymentsDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAYMENTS_DATE: {varchar(30)}
     */
    public void setPaymentsDate_IsNullOrEmpty() { regPaymentsDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAYMENTS_DATE: {varchar(30)}
     */
    public void setPaymentsDate_IsNotNull() { regPaymentsDate(CK_ISNN, DOBJ); }

    protected void regPaymentsDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentsDate(), "PAYMENTS_DATE"); }
    protected abstract ConditionValue xgetCValuePaymentsDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_EMAIL: {varchar(255)}
     * @param buyerEmail The value of buyerEmail as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerEmail_Equal(String buyerEmail) {
        doSetBuyerEmail_Equal(fRES(buyerEmail));
    }

    protected void doSetBuyerEmail_Equal(String buyerEmail) {
        regBuyerEmail(CK_EQ, buyerEmail);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_EMAIL: {varchar(255)}
     * @param buyerEmail The value of buyerEmail as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerEmail_NotEqual(String buyerEmail) {
        doSetBuyerEmail_NotEqual(fRES(buyerEmail));
    }

    protected void doSetBuyerEmail_NotEqual(String buyerEmail) {
        regBuyerEmail(CK_NES, buyerEmail);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_EMAIL: {varchar(255)}
     * @param buyerEmail The value of buyerEmail as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerEmail_GreaterThan(String buyerEmail) {
        regBuyerEmail(CK_GT, fRES(buyerEmail));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_EMAIL: {varchar(255)}
     * @param buyerEmail The value of buyerEmail as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerEmail_LessThan(String buyerEmail) {
        regBuyerEmail(CK_LT, fRES(buyerEmail));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_EMAIL: {varchar(255)}
     * @param buyerEmail The value of buyerEmail as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerEmail_GreaterEqual(String buyerEmail) {
        regBuyerEmail(CK_GE, fRES(buyerEmail));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_EMAIL: {varchar(255)}
     * @param buyerEmail The value of buyerEmail as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerEmail_LessEqual(String buyerEmail) {
        regBuyerEmail(CK_LE, fRES(buyerEmail));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BUYER_EMAIL: {varchar(255)}
     * @param buyerEmailList The collection of buyerEmail as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerEmail_InScope(Collection<String> buyerEmailList) {
        doSetBuyerEmail_InScope(buyerEmailList);
    }

    protected void doSetBuyerEmail_InScope(Collection<String> buyerEmailList) {
        regINS(CK_INS, cTL(buyerEmailList), xgetCValueBuyerEmail(), "BUYER_EMAIL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BUYER_EMAIL: {varchar(255)}
     * @param buyerEmailList The collection of buyerEmail as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerEmail_NotInScope(Collection<String> buyerEmailList) {
        doSetBuyerEmail_NotInScope(buyerEmailList);
    }

    protected void doSetBuyerEmail_NotInScope(Collection<String> buyerEmailList) {
        regINS(CK_NINS, cTL(buyerEmailList), xgetCValueBuyerEmail(), "BUYER_EMAIL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUYER_EMAIL: {varchar(255)} <br>
     * <pre>e.g. setBuyerEmail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param buyerEmail The value of buyerEmail as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBuyerEmail_LikeSearch(String buyerEmail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(buyerEmail), xgetCValueBuyerEmail(), "BUYER_EMAIL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUYER_EMAIL: {varchar(255)}
     * @param buyerEmail The value of buyerEmail as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBuyerEmail_NotLikeSearch(String buyerEmail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(buyerEmail), xgetCValueBuyerEmail(), "BUYER_EMAIL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUYER_EMAIL: {varchar(255)}
     * @param buyerEmail The value of buyerEmail as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerEmail_PrefixSearch(String buyerEmail) {
        setBuyerEmail_LikeSearch(buyerEmail, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BUYER_EMAIL: {varchar(255)}
     */
    public void setBuyerEmail_IsNull() { regBuyerEmail(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BUYER_EMAIL: {varchar(255)}
     */
    public void setBuyerEmail_IsNullOrEmpty() { regBuyerEmail(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BUYER_EMAIL: {varchar(255)}
     */
    public void setBuyerEmail_IsNotNull() { regBuyerEmail(CK_ISNN, DOBJ); }

    protected void regBuyerEmail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBuyerEmail(), "BUYER_EMAIL"); }
    protected abstract ConditionValue xgetCValueBuyerEmail();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_NAME: {varchar(255)}
     * @param buyerName The value of buyerName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerName_Equal(String buyerName) {
        doSetBuyerName_Equal(fRES(buyerName));
    }

    protected void doSetBuyerName_Equal(String buyerName) {
        regBuyerName(CK_EQ, buyerName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_NAME: {varchar(255)}
     * @param buyerName The value of buyerName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerName_NotEqual(String buyerName) {
        doSetBuyerName_NotEqual(fRES(buyerName));
    }

    protected void doSetBuyerName_NotEqual(String buyerName) {
        regBuyerName(CK_NES, buyerName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_NAME: {varchar(255)}
     * @param buyerName The value of buyerName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerName_GreaterThan(String buyerName) {
        regBuyerName(CK_GT, fRES(buyerName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_NAME: {varchar(255)}
     * @param buyerName The value of buyerName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerName_LessThan(String buyerName) {
        regBuyerName(CK_LT, fRES(buyerName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_NAME: {varchar(255)}
     * @param buyerName The value of buyerName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerName_GreaterEqual(String buyerName) {
        regBuyerName(CK_GE, fRES(buyerName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_NAME: {varchar(255)}
     * @param buyerName The value of buyerName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerName_LessEqual(String buyerName) {
        regBuyerName(CK_LE, fRES(buyerName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BUYER_NAME: {varchar(255)}
     * @param buyerNameList The collection of buyerName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerName_InScope(Collection<String> buyerNameList) {
        doSetBuyerName_InScope(buyerNameList);
    }

    protected void doSetBuyerName_InScope(Collection<String> buyerNameList) {
        regINS(CK_INS, cTL(buyerNameList), xgetCValueBuyerName(), "BUYER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BUYER_NAME: {varchar(255)}
     * @param buyerNameList The collection of buyerName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerName_NotInScope(Collection<String> buyerNameList) {
        doSetBuyerName_NotInScope(buyerNameList);
    }

    protected void doSetBuyerName_NotInScope(Collection<String> buyerNameList) {
        regINS(CK_NINS, cTL(buyerNameList), xgetCValueBuyerName(), "BUYER_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUYER_NAME: {varchar(255)} <br>
     * <pre>e.g. setBuyerName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param buyerName The value of buyerName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBuyerName_LikeSearch(String buyerName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(buyerName), xgetCValueBuyerName(), "BUYER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUYER_NAME: {varchar(255)}
     * @param buyerName The value of buyerName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBuyerName_NotLikeSearch(String buyerName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(buyerName), xgetCValueBuyerName(), "BUYER_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUYER_NAME: {varchar(255)}
     * @param buyerName The value of buyerName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerName_PrefixSearch(String buyerName) {
        setBuyerName_LikeSearch(buyerName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BUYER_NAME: {varchar(255)}
     */
    public void setBuyerName_IsNull() { regBuyerName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BUYER_NAME: {varchar(255)}
     */
    public void setBuyerName_IsNullOrEmpty() { regBuyerName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BUYER_NAME: {varchar(255)}
     */
    public void setBuyerName_IsNotNull() { regBuyerName(CK_ISNN, DOBJ); }

    protected void regBuyerName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBuyerName(), "BUYER_NAME"); }
    protected abstract ConditionValue xgetCValueBuyerName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     * @param buyerPhoneNumber The value of buyerPhoneNumber as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerPhoneNumber_Equal(String buyerPhoneNumber) {
        doSetBuyerPhoneNumber_Equal(fRES(buyerPhoneNumber));
    }

    protected void doSetBuyerPhoneNumber_Equal(String buyerPhoneNumber) {
        regBuyerPhoneNumber(CK_EQ, buyerPhoneNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     * @param buyerPhoneNumber The value of buyerPhoneNumber as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerPhoneNumber_NotEqual(String buyerPhoneNumber) {
        doSetBuyerPhoneNumber_NotEqual(fRES(buyerPhoneNumber));
    }

    protected void doSetBuyerPhoneNumber_NotEqual(String buyerPhoneNumber) {
        regBuyerPhoneNumber(CK_NES, buyerPhoneNumber);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     * @param buyerPhoneNumber The value of buyerPhoneNumber as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerPhoneNumber_GreaterThan(String buyerPhoneNumber) {
        regBuyerPhoneNumber(CK_GT, fRES(buyerPhoneNumber));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     * @param buyerPhoneNumber The value of buyerPhoneNumber as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerPhoneNumber_LessThan(String buyerPhoneNumber) {
        regBuyerPhoneNumber(CK_LT, fRES(buyerPhoneNumber));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     * @param buyerPhoneNumber The value of buyerPhoneNumber as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerPhoneNumber_GreaterEqual(String buyerPhoneNumber) {
        regBuyerPhoneNumber(CK_GE, fRES(buyerPhoneNumber));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     * @param buyerPhoneNumber The value of buyerPhoneNumber as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerPhoneNumber_LessEqual(String buyerPhoneNumber) {
        regBuyerPhoneNumber(CK_LE, fRES(buyerPhoneNumber));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     * @param buyerPhoneNumberList The collection of buyerPhoneNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerPhoneNumber_InScope(Collection<String> buyerPhoneNumberList) {
        doSetBuyerPhoneNumber_InScope(buyerPhoneNumberList);
    }

    protected void doSetBuyerPhoneNumber_InScope(Collection<String> buyerPhoneNumberList) {
        regINS(CK_INS, cTL(buyerPhoneNumberList), xgetCValueBuyerPhoneNumber(), "BUYER_PHONE_NUMBER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     * @param buyerPhoneNumberList The collection of buyerPhoneNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerPhoneNumber_NotInScope(Collection<String> buyerPhoneNumberList) {
        doSetBuyerPhoneNumber_NotInScope(buyerPhoneNumberList);
    }

    protected void doSetBuyerPhoneNumber_NotInScope(Collection<String> buyerPhoneNumberList) {
        regINS(CK_NINS, cTL(buyerPhoneNumberList), xgetCValueBuyerPhoneNumber(), "BUYER_PHONE_NUMBER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)} <br>
     * <pre>e.g. setBuyerPhoneNumber_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param buyerPhoneNumber The value of buyerPhoneNumber as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBuyerPhoneNumber_LikeSearch(String buyerPhoneNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(buyerPhoneNumber), xgetCValueBuyerPhoneNumber(), "BUYER_PHONE_NUMBER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     * @param buyerPhoneNumber The value of buyerPhoneNumber as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBuyerPhoneNumber_NotLikeSearch(String buyerPhoneNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(buyerPhoneNumber), xgetCValueBuyerPhoneNumber(), "BUYER_PHONE_NUMBER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     * @param buyerPhoneNumber The value of buyerPhoneNumber as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuyerPhoneNumber_PrefixSearch(String buyerPhoneNumber) {
        setBuyerPhoneNumber_LikeSearch(buyerPhoneNumber, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     */
    public void setBuyerPhoneNumber_IsNull() { regBuyerPhoneNumber(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     */
    public void setBuyerPhoneNumber_IsNullOrEmpty() { regBuyerPhoneNumber(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BUYER_PHONE_NUMBER: {varchar(255)}
     */
    public void setBuyerPhoneNumber_IsNotNull() { regBuyerPhoneNumber(CK_ISNN, DOBJ); }

    protected void regBuyerPhoneNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBuyerPhoneNumber(), "BUYER_PHONE_NUMBER"); }
    protected abstract ConditionValue xgetCValueBuyerPhoneNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU: {varchar(30)}
     * @param sku The value of sku as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSku_Equal(String sku) {
        doSetSku_Equal(fRES(sku));
    }

    protected void doSetSku_Equal(String sku) {
        regSku(CK_EQ, sku);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU: {varchar(30)}
     * @param sku The value of sku as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSku_NotEqual(String sku) {
        doSetSku_NotEqual(fRES(sku));
    }

    protected void doSetSku_NotEqual(String sku) {
        regSku(CK_NES, sku);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU: {varchar(30)}
     * @param sku The value of sku as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSku_GreaterThan(String sku) {
        regSku(CK_GT, fRES(sku));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU: {varchar(30)}
     * @param sku The value of sku as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSku_LessThan(String sku) {
        regSku(CK_LT, fRES(sku));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU: {varchar(30)}
     * @param sku The value of sku as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSku_GreaterEqual(String sku) {
        regSku(CK_GE, fRES(sku));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKU: {varchar(30)}
     * @param sku The value of sku as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSku_LessEqual(String sku) {
        regSku(CK_LE, fRES(sku));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKU: {varchar(30)}
     * @param skuList The collection of sku as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSku_InScope(Collection<String> skuList) {
        doSetSku_InScope(skuList);
    }

    protected void doSetSku_InScope(Collection<String> skuList) {
        regINS(CK_INS, cTL(skuList), xgetCValueSku(), "SKU");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKU: {varchar(30)}
     * @param skuList The collection of sku as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSku_NotInScope(Collection<String> skuList) {
        doSetSku_NotInScope(skuList);
    }

    protected void doSetSku_NotInScope(Collection<String> skuList) {
        regINS(CK_NINS, cTL(skuList), xgetCValueSku(), "SKU");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKU: {varchar(30)} <br>
     * <pre>e.g. setSku_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sku The value of sku as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSku_LikeSearch(String sku, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sku), xgetCValueSku(), "SKU", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKU: {varchar(30)}
     * @param sku The value of sku as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSku_NotLikeSearch(String sku, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sku), xgetCValueSku(), "SKU", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKU: {varchar(30)}
     * @param sku The value of sku as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSku_PrefixSearch(String sku) {
        setSku_LikeSearch(sku, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SKU: {varchar(30)}
     */
    public void setSku_IsNull() { regSku(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SKU: {varchar(30)}
     */
    public void setSku_IsNullOrEmpty() { regSku(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SKU: {varchar(30)}
     */
    public void setSku_IsNotNull() { regSku(CK_ISNN, DOBJ); }

    protected void regSku(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSku(), "SKU"); }
    protected abstract ConditionValue xgetCValueSku();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NAME: {varchar(255)}
     * @param productName The value of productName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductName_Equal(String productName) {
        doSetProductName_Equal(fRES(productName));
    }

    protected void doSetProductName_Equal(String productName) {
        regProductName(CK_EQ, productName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NAME: {varchar(255)}
     * @param productName The value of productName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductName_NotEqual(String productName) {
        doSetProductName_NotEqual(fRES(productName));
    }

    protected void doSetProductName_NotEqual(String productName) {
        regProductName(CK_NES, productName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NAME: {varchar(255)}
     * @param productName The value of productName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductName_GreaterThan(String productName) {
        regProductName(CK_GT, fRES(productName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NAME: {varchar(255)}
     * @param productName The value of productName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductName_LessThan(String productName) {
        regProductName(CK_LT, fRES(productName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NAME: {varchar(255)}
     * @param productName The value of productName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductName_GreaterEqual(String productName) {
        regProductName(CK_GE, fRES(productName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NAME: {varchar(255)}
     * @param productName The value of productName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductName_LessEqual(String productName) {
        regProductName(CK_LE, fRES(productName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NAME: {varchar(255)}
     * @param productNameList The collection of productName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductName_InScope(Collection<String> productNameList) {
        doSetProductName_InScope(productNameList);
    }

    protected void doSetProductName_InScope(Collection<String> productNameList) {
        regINS(CK_INS, cTL(productNameList), xgetCValueProductName(), "PRODUCT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NAME: {varchar(255)}
     * @param productNameList The collection of productName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductName_NotInScope(Collection<String> productNameList) {
        doSetProductName_NotInScope(productNameList);
    }

    protected void doSetProductName_NotInScope(Collection<String> productNameList) {
        regINS(CK_NINS, cTL(productNameList), xgetCValueProductName(), "PRODUCT_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NAME: {varchar(255)} <br>
     * <pre>e.g. setProductName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productName The value of productName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductName_LikeSearch(String productName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productName), xgetCValueProductName(), "PRODUCT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NAME: {varchar(255)}
     * @param productName The value of productName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductName_NotLikeSearch(String productName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productName), xgetCValueProductName(), "PRODUCT_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NAME: {varchar(255)}
     * @param productName The value of productName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductName_PrefixSearch(String productName) {
        setProductName_LikeSearch(productName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NAME: {varchar(255)}
     */
    public void setProductName_IsNull() { regProductName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_NAME: {varchar(255)}
     */
    public void setProductName_IsNullOrEmpty() { regProductName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NAME: {varchar(255)}
     */
    public void setProductName_IsNotNull() { regProductName(CK_ISNN, DOBJ); }

    protected void regProductName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductName(), "PRODUCT_NAME"); }
    protected abstract ConditionValue xgetCValueProductName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_PURCHASED: {bigint(19)}
     * @param quantityPurchased The value of quantityPurchased as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantityPurchased_Equal(Long quantityPurchased) {
        doSetQuantityPurchased_Equal(quantityPurchased);
    }

    protected void doSetQuantityPurchased_Equal(Long quantityPurchased) {
        regQuantityPurchased(CK_EQ, quantityPurchased);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_PURCHASED: {bigint(19)}
     * @param quantityPurchased The value of quantityPurchased as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantityPurchased_NotEqual(Long quantityPurchased) {
        doSetQuantityPurchased_NotEqual(quantityPurchased);
    }

    protected void doSetQuantityPurchased_NotEqual(Long quantityPurchased) {
        regQuantityPurchased(CK_NES, quantityPurchased);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_PURCHASED: {bigint(19)}
     * @param quantityPurchased The value of quantityPurchased as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantityPurchased_GreaterThan(Long quantityPurchased) {
        regQuantityPurchased(CK_GT, quantityPurchased);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_PURCHASED: {bigint(19)}
     * @param quantityPurchased The value of quantityPurchased as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantityPurchased_LessThan(Long quantityPurchased) {
        regQuantityPurchased(CK_LT, quantityPurchased);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_PURCHASED: {bigint(19)}
     * @param quantityPurchased The value of quantityPurchased as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantityPurchased_GreaterEqual(Long quantityPurchased) {
        regQuantityPurchased(CK_GE, quantityPurchased);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_PURCHASED: {bigint(19)}
     * @param quantityPurchased The value of quantityPurchased as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuantityPurchased_LessEqual(Long quantityPurchased) {
        regQuantityPurchased(CK_LE, quantityPurchased);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QUANTITY_PURCHASED: {bigint(19)}
     * @param minNumber The min number of quantityPurchased. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of quantityPurchased. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQuantityPurchased_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQuantityPurchased(), "QUANTITY_PURCHASED", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QUANTITY_PURCHASED: {bigint(19)}
     * @param quantityPurchasedList The collection of quantityPurchased as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantityPurchased_InScope(Collection<Long> quantityPurchasedList) {
        doSetQuantityPurchased_InScope(quantityPurchasedList);
    }

    protected void doSetQuantityPurchased_InScope(Collection<Long> quantityPurchasedList) {
        regINS(CK_INS, cTL(quantityPurchasedList), xgetCValueQuantityPurchased(), "QUANTITY_PURCHASED");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QUANTITY_PURCHASED: {bigint(19)}
     * @param quantityPurchasedList The collection of quantityPurchased as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuantityPurchased_NotInScope(Collection<Long> quantityPurchasedList) {
        doSetQuantityPurchased_NotInScope(quantityPurchasedList);
    }

    protected void doSetQuantityPurchased_NotInScope(Collection<Long> quantityPurchasedList) {
        regINS(CK_NINS, cTL(quantityPurchasedList), xgetCValueQuantityPurchased(), "QUANTITY_PURCHASED");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QUANTITY_PURCHASED: {bigint(19)}
     */
    public void setQuantityPurchased_IsNull() { regQuantityPurchased(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QUANTITY_PURCHASED: {bigint(19)}
     */
    public void setQuantityPurchased_IsNotNull() { regQuantityPurchased(CK_ISNN, DOBJ); }

    protected void regQuantityPurchased(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQuantityPurchased(), "QUANTITY_PURCHASED"); }
    protected abstract ConditionValue xgetCValueQuantityPurchased();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY: {varchar(60)}
     * @param currency The value of currency as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrency_Equal(String currency) {
        doSetCurrency_Equal(fRES(currency));
    }

    protected void doSetCurrency_Equal(String currency) {
        regCurrency(CK_EQ, currency);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY: {varchar(60)}
     * @param currency The value of currency as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrency_NotEqual(String currency) {
        doSetCurrency_NotEqual(fRES(currency));
    }

    protected void doSetCurrency_NotEqual(String currency) {
        regCurrency(CK_NES, currency);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY: {varchar(60)}
     * @param currency The value of currency as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrency_GreaterThan(String currency) {
        regCurrency(CK_GT, fRES(currency));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY: {varchar(60)}
     * @param currency The value of currency as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrency_LessThan(String currency) {
        regCurrency(CK_LT, fRES(currency));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY: {varchar(60)}
     * @param currency The value of currency as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrency_GreaterEqual(String currency) {
        regCurrency(CK_GE, fRES(currency));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENCY: {varchar(60)}
     * @param currency The value of currency as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrency_LessEqual(String currency) {
        regCurrency(CK_LE, fRES(currency));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CURRENCY: {varchar(60)}
     * @param currencyList The collection of currency as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrency_InScope(Collection<String> currencyList) {
        doSetCurrency_InScope(currencyList);
    }

    protected void doSetCurrency_InScope(Collection<String> currencyList) {
        regINS(CK_INS, cTL(currencyList), xgetCValueCurrency(), "CURRENCY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CURRENCY: {varchar(60)}
     * @param currencyList The collection of currency as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrency_NotInScope(Collection<String> currencyList) {
        doSetCurrency_NotInScope(currencyList);
    }

    protected void doSetCurrency_NotInScope(Collection<String> currencyList) {
        regINS(CK_NINS, cTL(currencyList), xgetCValueCurrency(), "CURRENCY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENCY: {varchar(60)} <br>
     * <pre>e.g. setCurrency_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param currency The value of currency as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCurrency_LikeSearch(String currency, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(currency), xgetCValueCurrency(), "CURRENCY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENCY: {varchar(60)}
     * @param currency The value of currency as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCurrency_NotLikeSearch(String currency, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(currency), xgetCValueCurrency(), "CURRENCY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENCY: {varchar(60)}
     * @param currency The value of currency as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrency_PrefixSearch(String currency) {
        setCurrency_LikeSearch(currency, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CURRENCY: {varchar(60)}
     */
    public void setCurrency_IsNull() { regCurrency(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CURRENCY: {varchar(60)}
     */
    public void setCurrency_IsNullOrEmpty() { regCurrency(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CURRENCY: {varchar(60)}
     */
    public void setCurrency_IsNotNull() { regCurrency(CK_ISNN, DOBJ); }

    protected void regCurrency(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCurrency(), "CURRENCY"); }
    protected abstract ConditionValue xgetCValueCurrency();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_PRICE: {bigint(19)}
     * @param itemPrice The value of itemPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemPrice_Equal(Long itemPrice) {
        doSetItemPrice_Equal(itemPrice);
    }

    protected void doSetItemPrice_Equal(Long itemPrice) {
        regItemPrice(CK_EQ, itemPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_PRICE: {bigint(19)}
     * @param itemPrice The value of itemPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemPrice_NotEqual(Long itemPrice) {
        doSetItemPrice_NotEqual(itemPrice);
    }

    protected void doSetItemPrice_NotEqual(Long itemPrice) {
        regItemPrice(CK_NES, itemPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_PRICE: {bigint(19)}
     * @param itemPrice The value of itemPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemPrice_GreaterThan(Long itemPrice) {
        regItemPrice(CK_GT, itemPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_PRICE: {bigint(19)}
     * @param itemPrice The value of itemPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemPrice_LessThan(Long itemPrice) {
        regItemPrice(CK_LT, itemPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_PRICE: {bigint(19)}
     * @param itemPrice The value of itemPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemPrice_GreaterEqual(Long itemPrice) {
        regItemPrice(CK_GE, itemPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_PRICE: {bigint(19)}
     * @param itemPrice The value of itemPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemPrice_LessEqual(Long itemPrice) {
        regItemPrice(CK_LE, itemPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_PRICE: {bigint(19)}
     * @param minNumber The min number of itemPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of itemPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setItemPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueItemPrice(), "ITEM_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_PRICE: {bigint(19)}
     * @param itemPriceList The collection of itemPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemPrice_InScope(Collection<Long> itemPriceList) {
        doSetItemPrice_InScope(itemPriceList);
    }

    protected void doSetItemPrice_InScope(Collection<Long> itemPriceList) {
        regINS(CK_INS, cTL(itemPriceList), xgetCValueItemPrice(), "ITEM_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_PRICE: {bigint(19)}
     * @param itemPriceList The collection of itemPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemPrice_NotInScope(Collection<Long> itemPriceList) {
        doSetItemPrice_NotInScope(itemPriceList);
    }

    protected void doSetItemPrice_NotInScope(Collection<Long> itemPriceList) {
        regINS(CK_NINS, cTL(itemPriceList), xgetCValueItemPrice(), "ITEM_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_PRICE: {bigint(19)}
     */
    public void setItemPrice_IsNull() { regItemPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_PRICE: {bigint(19)}
     */
    public void setItemPrice_IsNotNull() { regItemPrice(CK_ISNN, DOBJ); }

    protected void regItemPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemPrice(), "ITEM_PRICE"); }
    protected abstract ConditionValue xgetCValueItemPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_TAX: {bigint(19)}
     * @param itemTax The value of itemTax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemTax_Equal(Long itemTax) {
        doSetItemTax_Equal(itemTax);
    }

    protected void doSetItemTax_Equal(Long itemTax) {
        regItemTax(CK_EQ, itemTax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_TAX: {bigint(19)}
     * @param itemTax The value of itemTax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemTax_NotEqual(Long itemTax) {
        doSetItemTax_NotEqual(itemTax);
    }

    protected void doSetItemTax_NotEqual(Long itemTax) {
        regItemTax(CK_NES, itemTax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_TAX: {bigint(19)}
     * @param itemTax The value of itemTax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemTax_GreaterThan(Long itemTax) {
        regItemTax(CK_GT, itemTax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_TAX: {bigint(19)}
     * @param itemTax The value of itemTax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemTax_LessThan(Long itemTax) {
        regItemTax(CK_LT, itemTax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_TAX: {bigint(19)}
     * @param itemTax The value of itemTax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemTax_GreaterEqual(Long itemTax) {
        regItemTax(CK_GE, itemTax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_TAX: {bigint(19)}
     * @param itemTax The value of itemTax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemTax_LessEqual(Long itemTax) {
        regItemTax(CK_LE, itemTax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_TAX: {bigint(19)}
     * @param minNumber The min number of itemTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of itemTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setItemTax_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueItemTax(), "ITEM_TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_TAX: {bigint(19)}
     * @param itemTaxList The collection of itemTax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemTax_InScope(Collection<Long> itemTaxList) {
        doSetItemTax_InScope(itemTaxList);
    }

    protected void doSetItemTax_InScope(Collection<Long> itemTaxList) {
        regINS(CK_INS, cTL(itemTaxList), xgetCValueItemTax(), "ITEM_TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_TAX: {bigint(19)}
     * @param itemTaxList The collection of itemTax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemTax_NotInScope(Collection<Long> itemTaxList) {
        doSetItemTax_NotInScope(itemTaxList);
    }

    protected void doSetItemTax_NotInScope(Collection<Long> itemTaxList) {
        regINS(CK_NINS, cTL(itemTaxList), xgetCValueItemTax(), "ITEM_TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_TAX: {bigint(19)}
     */
    public void setItemTax_IsNull() { regItemTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_TAX: {bigint(19)}
     */
    public void setItemTax_IsNotNull() { regItemTax(CK_ISNN, DOBJ); }

    protected void regItemTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemTax(), "ITEM_TAX"); }
    protected abstract ConditionValue xgetCValueItemTax();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PRICE: {bigint(19)}
     * @param shippingPrice The value of shippingPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingPrice_Equal(Long shippingPrice) {
        doSetShippingPrice_Equal(shippingPrice);
    }

    protected void doSetShippingPrice_Equal(Long shippingPrice) {
        regShippingPrice(CK_EQ, shippingPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PRICE: {bigint(19)}
     * @param shippingPrice The value of shippingPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingPrice_NotEqual(Long shippingPrice) {
        doSetShippingPrice_NotEqual(shippingPrice);
    }

    protected void doSetShippingPrice_NotEqual(Long shippingPrice) {
        regShippingPrice(CK_NES, shippingPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PRICE: {bigint(19)}
     * @param shippingPrice The value of shippingPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingPrice_GreaterThan(Long shippingPrice) {
        regShippingPrice(CK_GT, shippingPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PRICE: {bigint(19)}
     * @param shippingPrice The value of shippingPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingPrice_LessThan(Long shippingPrice) {
        regShippingPrice(CK_LT, shippingPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PRICE: {bigint(19)}
     * @param shippingPrice The value of shippingPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingPrice_GreaterEqual(Long shippingPrice) {
        regShippingPrice(CK_GE, shippingPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PRICE: {bigint(19)}
     * @param shippingPrice The value of shippingPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingPrice_LessEqual(Long shippingPrice) {
        regShippingPrice(CK_LE, shippingPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PRICE: {bigint(19)}
     * @param minNumber The min number of shippingPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingPrice(), "SHIPPING_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_PRICE: {bigint(19)}
     * @param shippingPriceList The collection of shippingPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPrice_InScope(Collection<Long> shippingPriceList) {
        doSetShippingPrice_InScope(shippingPriceList);
    }

    protected void doSetShippingPrice_InScope(Collection<Long> shippingPriceList) {
        regINS(CK_INS, cTL(shippingPriceList), xgetCValueShippingPrice(), "SHIPPING_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_PRICE: {bigint(19)}
     * @param shippingPriceList The collection of shippingPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPrice_NotInScope(Collection<Long> shippingPriceList) {
        doSetShippingPrice_NotInScope(shippingPriceList);
    }

    protected void doSetShippingPrice_NotInScope(Collection<Long> shippingPriceList) {
        regINS(CK_NINS, cTL(shippingPriceList), xgetCValueShippingPrice(), "SHIPPING_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_PRICE: {bigint(19)}
     */
    public void setShippingPrice_IsNull() { regShippingPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_PRICE: {bigint(19)}
     */
    public void setShippingPrice_IsNotNull() { regShippingPrice(CK_ISNN, DOBJ); }

    protected void regShippingPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingPrice(), "SHIPPING_PRICE"); }
    protected abstract ConditionValue xgetCValueShippingPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TAX: {bigint(19)}
     * @param shippingTax The value of shippingTax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTax_Equal(Long shippingTax) {
        doSetShippingTax_Equal(shippingTax);
    }

    protected void doSetShippingTax_Equal(Long shippingTax) {
        regShippingTax(CK_EQ, shippingTax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TAX: {bigint(19)}
     * @param shippingTax The value of shippingTax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTax_NotEqual(Long shippingTax) {
        doSetShippingTax_NotEqual(shippingTax);
    }

    protected void doSetShippingTax_NotEqual(Long shippingTax) {
        regShippingTax(CK_NES, shippingTax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TAX: {bigint(19)}
     * @param shippingTax The value of shippingTax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTax_GreaterThan(Long shippingTax) {
        regShippingTax(CK_GT, shippingTax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TAX: {bigint(19)}
     * @param shippingTax The value of shippingTax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTax_LessThan(Long shippingTax) {
        regShippingTax(CK_LT, shippingTax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TAX: {bigint(19)}
     * @param shippingTax The value of shippingTax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTax_GreaterEqual(Long shippingTax) {
        regShippingTax(CK_GE, shippingTax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TAX: {bigint(19)}
     * @param shippingTax The value of shippingTax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTax_LessEqual(Long shippingTax) {
        regShippingTax(CK_LE, shippingTax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TAX: {bigint(19)}
     * @param minNumber The min number of shippingTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingTax_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingTax(), "SHIPPING_TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_TAX: {bigint(19)}
     * @param shippingTaxList The collection of shippingTax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTax_InScope(Collection<Long> shippingTaxList) {
        doSetShippingTax_InScope(shippingTaxList);
    }

    protected void doSetShippingTax_InScope(Collection<Long> shippingTaxList) {
        regINS(CK_INS, cTL(shippingTaxList), xgetCValueShippingTax(), "SHIPPING_TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_TAX: {bigint(19)}
     * @param shippingTaxList The collection of shippingTax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTax_NotInScope(Collection<Long> shippingTaxList) {
        doSetShippingTax_NotInScope(shippingTaxList);
    }

    protected void doSetShippingTax_NotInScope(Collection<Long> shippingTaxList) {
        regINS(CK_NINS, cTL(shippingTaxList), xgetCValueShippingTax(), "SHIPPING_TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_TAX: {bigint(19)}
     */
    public void setShippingTax_IsNull() { regShippingTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_TAX: {bigint(19)}
     */
    public void setShippingTax_IsNotNull() { regShippingTax(CK_ISNN, DOBJ); }

    protected void regShippingTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingTax(), "SHIPPING_TAX"); }
    protected abstract ConditionValue xgetCValueShippingTax();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_PRICE: {bigint(19)}
     * @param giftWrapPrice The value of giftWrapPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapPrice_Equal(Long giftWrapPrice) {
        doSetGiftWrapPrice_Equal(giftWrapPrice);
    }

    protected void doSetGiftWrapPrice_Equal(Long giftWrapPrice) {
        regGiftWrapPrice(CK_EQ, giftWrapPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_PRICE: {bigint(19)}
     * @param giftWrapPrice The value of giftWrapPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapPrice_NotEqual(Long giftWrapPrice) {
        doSetGiftWrapPrice_NotEqual(giftWrapPrice);
    }

    protected void doSetGiftWrapPrice_NotEqual(Long giftWrapPrice) {
        regGiftWrapPrice(CK_NES, giftWrapPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_PRICE: {bigint(19)}
     * @param giftWrapPrice The value of giftWrapPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapPrice_GreaterThan(Long giftWrapPrice) {
        regGiftWrapPrice(CK_GT, giftWrapPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_PRICE: {bigint(19)}
     * @param giftWrapPrice The value of giftWrapPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapPrice_LessThan(Long giftWrapPrice) {
        regGiftWrapPrice(CK_LT, giftWrapPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_PRICE: {bigint(19)}
     * @param giftWrapPrice The value of giftWrapPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapPrice_GreaterEqual(Long giftWrapPrice) {
        regGiftWrapPrice(CK_GE, giftWrapPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_PRICE: {bigint(19)}
     * @param giftWrapPrice The value of giftWrapPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapPrice_LessEqual(Long giftWrapPrice) {
        regGiftWrapPrice(CK_LE, giftWrapPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_PRICE: {bigint(19)}
     * @param minNumber The min number of giftWrapPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of giftWrapPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGiftWrapPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGiftWrapPrice(), "GIFT_WRAP_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_PRICE: {bigint(19)}
     * @param giftWrapPriceList The collection of giftWrapPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapPrice_InScope(Collection<Long> giftWrapPriceList) {
        doSetGiftWrapPrice_InScope(giftWrapPriceList);
    }

    protected void doSetGiftWrapPrice_InScope(Collection<Long> giftWrapPriceList) {
        regINS(CK_INS, cTL(giftWrapPriceList), xgetCValueGiftWrapPrice(), "GIFT_WRAP_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_PRICE: {bigint(19)}
     * @param giftWrapPriceList The collection of giftWrapPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapPrice_NotInScope(Collection<Long> giftWrapPriceList) {
        doSetGiftWrapPrice_NotInScope(giftWrapPriceList);
    }

    protected void doSetGiftWrapPrice_NotInScope(Collection<Long> giftWrapPriceList) {
        regINS(CK_NINS, cTL(giftWrapPriceList), xgetCValueGiftWrapPrice(), "GIFT_WRAP_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_PRICE: {bigint(19)}
     */
    public void setGiftWrapPrice_IsNull() { regGiftWrapPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_PRICE: {bigint(19)}
     */
    public void setGiftWrapPrice_IsNotNull() { regGiftWrapPrice(CK_ISNN, DOBJ); }

    protected void regGiftWrapPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiftWrapPrice(), "GIFT_WRAP_PRICE"); }
    protected abstract ConditionValue xgetCValueGiftWrapPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TAX: {bigint(19)}
     * @param giftWrapTax The value of giftWrapTax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapTax_Equal(Long giftWrapTax) {
        doSetGiftWrapTax_Equal(giftWrapTax);
    }

    protected void doSetGiftWrapTax_Equal(Long giftWrapTax) {
        regGiftWrapTax(CK_EQ, giftWrapTax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TAX: {bigint(19)}
     * @param giftWrapTax The value of giftWrapTax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapTax_NotEqual(Long giftWrapTax) {
        doSetGiftWrapTax_NotEqual(giftWrapTax);
    }

    protected void doSetGiftWrapTax_NotEqual(Long giftWrapTax) {
        regGiftWrapTax(CK_NES, giftWrapTax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TAX: {bigint(19)}
     * @param giftWrapTax The value of giftWrapTax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapTax_GreaterThan(Long giftWrapTax) {
        regGiftWrapTax(CK_GT, giftWrapTax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TAX: {bigint(19)}
     * @param giftWrapTax The value of giftWrapTax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapTax_LessThan(Long giftWrapTax) {
        regGiftWrapTax(CK_LT, giftWrapTax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TAX: {bigint(19)}
     * @param giftWrapTax The value of giftWrapTax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapTax_GreaterEqual(Long giftWrapTax) {
        regGiftWrapTax(CK_GE, giftWrapTax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TAX: {bigint(19)}
     * @param giftWrapTax The value of giftWrapTax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGiftWrapTax_LessEqual(Long giftWrapTax) {
        regGiftWrapTax(CK_LE, giftWrapTax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TAX: {bigint(19)}
     * @param minNumber The min number of giftWrapTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of giftWrapTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGiftWrapTax_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGiftWrapTax(), "GIFT_WRAP_TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_TAX: {bigint(19)}
     * @param giftWrapTaxList The collection of giftWrapTax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapTax_InScope(Collection<Long> giftWrapTaxList) {
        doSetGiftWrapTax_InScope(giftWrapTaxList);
    }

    protected void doSetGiftWrapTax_InScope(Collection<Long> giftWrapTaxList) {
        regINS(CK_INS, cTL(giftWrapTaxList), xgetCValueGiftWrapTax(), "GIFT_WRAP_TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_TAX: {bigint(19)}
     * @param giftWrapTaxList The collection of giftWrapTax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapTax_NotInScope(Collection<Long> giftWrapTaxList) {
        doSetGiftWrapTax_NotInScope(giftWrapTaxList);
    }

    protected void doSetGiftWrapTax_NotInScope(Collection<Long> giftWrapTaxList) {
        regINS(CK_NINS, cTL(giftWrapTaxList), xgetCValueGiftWrapTax(), "GIFT_WRAP_TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_TAX: {bigint(19)}
     */
    public void setGiftWrapTax_IsNull() { regGiftWrapTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_TAX: {bigint(19)}
     */
    public void setGiftWrapTax_IsNotNull() { regGiftWrapTax(CK_ISNN, DOBJ); }

    protected void regGiftWrapTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiftWrapTax(), "GIFT_WRAP_TAX"); }
    protected abstract ConditionValue xgetCValueGiftWrapTax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     * @param shipServiceLevel The value of shipServiceLevel as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipServiceLevel_Equal(String shipServiceLevel) {
        doSetShipServiceLevel_Equal(fRES(shipServiceLevel));
    }

    protected void doSetShipServiceLevel_Equal(String shipServiceLevel) {
        regShipServiceLevel(CK_EQ, shipServiceLevel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     * @param shipServiceLevel The value of shipServiceLevel as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipServiceLevel_NotEqual(String shipServiceLevel) {
        doSetShipServiceLevel_NotEqual(fRES(shipServiceLevel));
    }

    protected void doSetShipServiceLevel_NotEqual(String shipServiceLevel) {
        regShipServiceLevel(CK_NES, shipServiceLevel);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     * @param shipServiceLevel The value of shipServiceLevel as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipServiceLevel_GreaterThan(String shipServiceLevel) {
        regShipServiceLevel(CK_GT, fRES(shipServiceLevel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     * @param shipServiceLevel The value of shipServiceLevel as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipServiceLevel_LessThan(String shipServiceLevel) {
        regShipServiceLevel(CK_LT, fRES(shipServiceLevel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     * @param shipServiceLevel The value of shipServiceLevel as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipServiceLevel_GreaterEqual(String shipServiceLevel) {
        regShipServiceLevel(CK_GE, fRES(shipServiceLevel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     * @param shipServiceLevel The value of shipServiceLevel as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipServiceLevel_LessEqual(String shipServiceLevel) {
        regShipServiceLevel(CK_LE, fRES(shipServiceLevel));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     * @param shipServiceLevelList The collection of shipServiceLevel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipServiceLevel_InScope(Collection<String> shipServiceLevelList) {
        doSetShipServiceLevel_InScope(shipServiceLevelList);
    }

    protected void doSetShipServiceLevel_InScope(Collection<String> shipServiceLevelList) {
        regINS(CK_INS, cTL(shipServiceLevelList), xgetCValueShipServiceLevel(), "SHIP_SERVICE_LEVEL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     * @param shipServiceLevelList The collection of shipServiceLevel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipServiceLevel_NotInScope(Collection<String> shipServiceLevelList) {
        doSetShipServiceLevel_NotInScope(shipServiceLevelList);
    }

    protected void doSetShipServiceLevel_NotInScope(Collection<String> shipServiceLevelList) {
        regINS(CK_NINS, cTL(shipServiceLevelList), xgetCValueShipServiceLevel(), "SHIP_SERVICE_LEVEL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)} <br>
     * <pre>e.g. setShipServiceLevel_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipServiceLevel The value of shipServiceLevel as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipServiceLevel_LikeSearch(String shipServiceLevel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipServiceLevel), xgetCValueShipServiceLevel(), "SHIP_SERVICE_LEVEL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     * @param shipServiceLevel The value of shipServiceLevel as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipServiceLevel_NotLikeSearch(String shipServiceLevel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipServiceLevel), xgetCValueShipServiceLevel(), "SHIP_SERVICE_LEVEL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     * @param shipServiceLevel The value of shipServiceLevel as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipServiceLevel_PrefixSearch(String shipServiceLevel) {
        setShipServiceLevel_LikeSearch(shipServiceLevel, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     */
    public void setShipServiceLevel_IsNull() { regShipServiceLevel(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     */
    public void setShipServiceLevel_IsNullOrEmpty() { regShipServiceLevel(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_SERVICE_LEVEL: {varchar(60)}
     */
    public void setShipServiceLevel_IsNotNull() { regShipServiceLevel(CK_ISNN, DOBJ); }

    protected void regShipServiceLevel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipServiceLevel(), "SHIP_SERVICE_LEVEL"); }
    protected abstract ConditionValue xgetCValueShipServiceLevel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECIPIENT_NAME: {varchar(255)}
     * @param recipientName The value of recipientName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecipientName_Equal(String recipientName) {
        doSetRecipientName_Equal(fRES(recipientName));
    }

    protected void doSetRecipientName_Equal(String recipientName) {
        regRecipientName(CK_EQ, recipientName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECIPIENT_NAME: {varchar(255)}
     * @param recipientName The value of recipientName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecipientName_NotEqual(String recipientName) {
        doSetRecipientName_NotEqual(fRES(recipientName));
    }

    protected void doSetRecipientName_NotEqual(String recipientName) {
        regRecipientName(CK_NES, recipientName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECIPIENT_NAME: {varchar(255)}
     * @param recipientName The value of recipientName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecipientName_GreaterThan(String recipientName) {
        regRecipientName(CK_GT, fRES(recipientName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECIPIENT_NAME: {varchar(255)}
     * @param recipientName The value of recipientName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecipientName_LessThan(String recipientName) {
        regRecipientName(CK_LT, fRES(recipientName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECIPIENT_NAME: {varchar(255)}
     * @param recipientName The value of recipientName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecipientName_GreaterEqual(String recipientName) {
        regRecipientName(CK_GE, fRES(recipientName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECIPIENT_NAME: {varchar(255)}
     * @param recipientName The value of recipientName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecipientName_LessEqual(String recipientName) {
        regRecipientName(CK_LE, fRES(recipientName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECIPIENT_NAME: {varchar(255)}
     * @param recipientNameList The collection of recipientName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecipientName_InScope(Collection<String> recipientNameList) {
        doSetRecipientName_InScope(recipientNameList);
    }

    protected void doSetRecipientName_InScope(Collection<String> recipientNameList) {
        regINS(CK_INS, cTL(recipientNameList), xgetCValueRecipientName(), "RECIPIENT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECIPIENT_NAME: {varchar(255)}
     * @param recipientNameList The collection of recipientName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecipientName_NotInScope(Collection<String> recipientNameList) {
        doSetRecipientName_NotInScope(recipientNameList);
    }

    protected void doSetRecipientName_NotInScope(Collection<String> recipientNameList) {
        regINS(CK_NINS, cTL(recipientNameList), xgetCValueRecipientName(), "RECIPIENT_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECIPIENT_NAME: {varchar(255)} <br>
     * <pre>e.g. setRecipientName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param recipientName The value of recipientName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRecipientName_LikeSearch(String recipientName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(recipientName), xgetCValueRecipientName(), "RECIPIENT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECIPIENT_NAME: {varchar(255)}
     * @param recipientName The value of recipientName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRecipientName_NotLikeSearch(String recipientName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(recipientName), xgetCValueRecipientName(), "RECIPIENT_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECIPIENT_NAME: {varchar(255)}
     * @param recipientName The value of recipientName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecipientName_PrefixSearch(String recipientName) {
        setRecipientName_LikeSearch(recipientName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECIPIENT_NAME: {varchar(255)}
     */
    public void setRecipientName_IsNull() { regRecipientName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECIPIENT_NAME: {varchar(255)}
     */
    public void setRecipientName_IsNullOrEmpty() { regRecipientName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECIPIENT_NAME: {varchar(255)}
     */
    public void setRecipientName_IsNotNull() { regRecipientName(CK_ISNN, DOBJ); }

    protected void regRecipientName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRecipientName(), "RECIPIENT_NAME"); }
    protected abstract ConditionValue xgetCValueRecipientName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_1: {varchar(255)}
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
     * SHIP_ADDRESS_1: {varchar(255)}
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
     * SHIP_ADDRESS_1: {varchar(255)}
     * @param shipAddress1 The value of shipAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_GreaterThan(String shipAddress1) {
        regShipAddress1(CK_GT, fRES(shipAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_1: {varchar(255)}
     * @param shipAddress1 The value of shipAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_LessThan(String shipAddress1) {
        regShipAddress1(CK_LT, fRES(shipAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_1: {varchar(255)}
     * @param shipAddress1 The value of shipAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_GreaterEqual(String shipAddress1) {
        regShipAddress1(CK_GE, fRES(shipAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_1: {varchar(255)}
     * @param shipAddress1 The value of shipAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_LessEqual(String shipAddress1) {
        regShipAddress1(CK_LE, fRES(shipAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_1: {varchar(255)}
     * @param shipAddress1List The collection of shipAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_InScope(Collection<String> shipAddress1List) {
        doSetShipAddress1_InScope(shipAddress1List);
    }

    protected void doSetShipAddress1_InScope(Collection<String> shipAddress1List) {
        regINS(CK_INS, cTL(shipAddress1List), xgetCValueShipAddress1(), "SHIP_ADDRESS_1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_1: {varchar(255)}
     * @param shipAddress1List The collection of shipAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_NotInScope(Collection<String> shipAddress1List) {
        doSetShipAddress1_NotInScope(shipAddress1List);
    }

    protected void doSetShipAddress1_NotInScope(Collection<String> shipAddress1List) {
        regINS(CK_NINS, cTL(shipAddress1List), xgetCValueShipAddress1(), "SHIP_ADDRESS_1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_1: {varchar(255)} <br>
     * <pre>e.g. setShipAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipAddress1 The value of shipAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipAddress1_LikeSearch(String shipAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipAddress1), xgetCValueShipAddress1(), "SHIP_ADDRESS_1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_1: {varchar(255)}
     * @param shipAddress1 The value of shipAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipAddress1_NotLikeSearch(String shipAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipAddress1), xgetCValueShipAddress1(), "SHIP_ADDRESS_1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_1: {varchar(255)}
     * @param shipAddress1 The value of shipAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress1_PrefixSearch(String shipAddress1) {
        setShipAddress1_LikeSearch(shipAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_1: {varchar(255)}
     */
    public void setShipAddress1_IsNull() { regShipAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_1: {varchar(255)}
     */
    public void setShipAddress1_IsNullOrEmpty() { regShipAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_1: {varchar(255)}
     */
    public void setShipAddress1_IsNotNull() { regShipAddress1(CK_ISNN, DOBJ); }

    protected void regShipAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipAddress1(), "SHIP_ADDRESS_1"); }
    protected abstract ConditionValue xgetCValueShipAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_2: {varchar(255)}
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
     * SHIP_ADDRESS_2: {varchar(255)}
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
     * SHIP_ADDRESS_2: {varchar(255)}
     * @param shipAddress2 The value of shipAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_GreaterThan(String shipAddress2) {
        regShipAddress2(CK_GT, fRES(shipAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_2: {varchar(255)}
     * @param shipAddress2 The value of shipAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_LessThan(String shipAddress2) {
        regShipAddress2(CK_LT, fRES(shipAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_2: {varchar(255)}
     * @param shipAddress2 The value of shipAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_GreaterEqual(String shipAddress2) {
        regShipAddress2(CK_GE, fRES(shipAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_2: {varchar(255)}
     * @param shipAddress2 The value of shipAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_LessEqual(String shipAddress2) {
        regShipAddress2(CK_LE, fRES(shipAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_2: {varchar(255)}
     * @param shipAddress2List The collection of shipAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_InScope(Collection<String> shipAddress2List) {
        doSetShipAddress2_InScope(shipAddress2List);
    }

    protected void doSetShipAddress2_InScope(Collection<String> shipAddress2List) {
        regINS(CK_INS, cTL(shipAddress2List), xgetCValueShipAddress2(), "SHIP_ADDRESS_2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_2: {varchar(255)}
     * @param shipAddress2List The collection of shipAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_NotInScope(Collection<String> shipAddress2List) {
        doSetShipAddress2_NotInScope(shipAddress2List);
    }

    protected void doSetShipAddress2_NotInScope(Collection<String> shipAddress2List) {
        regINS(CK_NINS, cTL(shipAddress2List), xgetCValueShipAddress2(), "SHIP_ADDRESS_2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_2: {varchar(255)} <br>
     * <pre>e.g. setShipAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipAddress2 The value of shipAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipAddress2_LikeSearch(String shipAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipAddress2), xgetCValueShipAddress2(), "SHIP_ADDRESS_2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_2: {varchar(255)}
     * @param shipAddress2 The value of shipAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipAddress2_NotLikeSearch(String shipAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipAddress2), xgetCValueShipAddress2(), "SHIP_ADDRESS_2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_2: {varchar(255)}
     * @param shipAddress2 The value of shipAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress2_PrefixSearch(String shipAddress2) {
        setShipAddress2_LikeSearch(shipAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_2: {varchar(255)}
     */
    public void setShipAddress2_IsNull() { regShipAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_2: {varchar(255)}
     */
    public void setShipAddress2_IsNullOrEmpty() { regShipAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_2: {varchar(255)}
     */
    public void setShipAddress2_IsNotNull() { regShipAddress2(CK_ISNN, DOBJ); }

    protected void regShipAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipAddress2(), "SHIP_ADDRESS_2"); }
    protected abstract ConditionValue xgetCValueShipAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     * @param shipAddress3 The value of shipAddress3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress3_Equal(String shipAddress3) {
        doSetShipAddress3_Equal(fRES(shipAddress3));
    }

    protected void doSetShipAddress3_Equal(String shipAddress3) {
        regShipAddress3(CK_EQ, shipAddress3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     * @param shipAddress3 The value of shipAddress3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress3_NotEqual(String shipAddress3) {
        doSetShipAddress3_NotEqual(fRES(shipAddress3));
    }

    protected void doSetShipAddress3_NotEqual(String shipAddress3) {
        regShipAddress3(CK_NES, shipAddress3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     * @param shipAddress3 The value of shipAddress3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress3_GreaterThan(String shipAddress3) {
        regShipAddress3(CK_GT, fRES(shipAddress3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     * @param shipAddress3 The value of shipAddress3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress3_LessThan(String shipAddress3) {
        regShipAddress3(CK_LT, fRES(shipAddress3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     * @param shipAddress3 The value of shipAddress3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress3_GreaterEqual(String shipAddress3) {
        regShipAddress3(CK_GE, fRES(shipAddress3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     * @param shipAddress3 The value of shipAddress3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress3_LessEqual(String shipAddress3) {
        regShipAddress3(CK_LE, fRES(shipAddress3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     * @param shipAddress3List The collection of shipAddress3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress3_InScope(Collection<String> shipAddress3List) {
        doSetShipAddress3_InScope(shipAddress3List);
    }

    protected void doSetShipAddress3_InScope(Collection<String> shipAddress3List) {
        regINS(CK_INS, cTL(shipAddress3List), xgetCValueShipAddress3(), "SHIP_ADDRESS_3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     * @param shipAddress3List The collection of shipAddress3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress3_NotInScope(Collection<String> shipAddress3List) {
        doSetShipAddress3_NotInScope(shipAddress3List);
    }

    protected void doSetShipAddress3_NotInScope(Collection<String> shipAddress3List) {
        regINS(CK_NINS, cTL(shipAddress3List), xgetCValueShipAddress3(), "SHIP_ADDRESS_3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_3: {varchar(255)} <br>
     * <pre>e.g. setShipAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipAddress3 The value of shipAddress3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipAddress3_LikeSearch(String shipAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipAddress3), xgetCValueShipAddress3(), "SHIP_ADDRESS_3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     * @param shipAddress3 The value of shipAddress3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipAddress3_NotLikeSearch(String shipAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipAddress3), xgetCValueShipAddress3(), "SHIP_ADDRESS_3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     * @param shipAddress3 The value of shipAddress3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipAddress3_PrefixSearch(String shipAddress3) {
        setShipAddress3_LikeSearch(shipAddress3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     */
    public void setShipAddress3_IsNull() { regShipAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     */
    public void setShipAddress3_IsNullOrEmpty() { regShipAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_ADDRESS_3: {varchar(255)}
     */
    public void setShipAddress3_IsNotNull() { regShipAddress3(CK_ISNN, DOBJ); }

    protected void regShipAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipAddress3(), "SHIP_ADDRESS_3"); }
    protected abstract ConditionValue xgetCValueShipAddress3();

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
     * SHIP_STATE: {varchar(255)}
     * @param shipState The value of shipState as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipState_Equal(String shipState) {
        doSetShipState_Equal(fRES(shipState));
    }

    protected void doSetShipState_Equal(String shipState) {
        regShipState(CK_EQ, shipState);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_STATE: {varchar(255)}
     * @param shipState The value of shipState as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipState_NotEqual(String shipState) {
        doSetShipState_NotEqual(fRES(shipState));
    }

    protected void doSetShipState_NotEqual(String shipState) {
        regShipState(CK_NES, shipState);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_STATE: {varchar(255)}
     * @param shipState The value of shipState as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipState_GreaterThan(String shipState) {
        regShipState(CK_GT, fRES(shipState));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_STATE: {varchar(255)}
     * @param shipState The value of shipState as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipState_LessThan(String shipState) {
        regShipState(CK_LT, fRES(shipState));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_STATE: {varchar(255)}
     * @param shipState The value of shipState as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipState_GreaterEqual(String shipState) {
        regShipState(CK_GE, fRES(shipState));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_STATE: {varchar(255)}
     * @param shipState The value of shipState as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipState_LessEqual(String shipState) {
        regShipState(CK_LE, fRES(shipState));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_STATE: {varchar(255)}
     * @param shipStateList The collection of shipState as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipState_InScope(Collection<String> shipStateList) {
        doSetShipState_InScope(shipStateList);
    }

    protected void doSetShipState_InScope(Collection<String> shipStateList) {
        regINS(CK_INS, cTL(shipStateList), xgetCValueShipState(), "SHIP_STATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_STATE: {varchar(255)}
     * @param shipStateList The collection of shipState as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipState_NotInScope(Collection<String> shipStateList) {
        doSetShipState_NotInScope(shipStateList);
    }

    protected void doSetShipState_NotInScope(Collection<String> shipStateList) {
        regINS(CK_NINS, cTL(shipStateList), xgetCValueShipState(), "SHIP_STATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_STATE: {varchar(255)} <br>
     * <pre>e.g. setShipState_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipState The value of shipState as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipState_LikeSearch(String shipState, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipState), xgetCValueShipState(), "SHIP_STATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_STATE: {varchar(255)}
     * @param shipState The value of shipState as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipState_NotLikeSearch(String shipState, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipState), xgetCValueShipState(), "SHIP_STATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_STATE: {varchar(255)}
     * @param shipState The value of shipState as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipState_PrefixSearch(String shipState) {
        setShipState_LikeSearch(shipState, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_STATE: {varchar(255)}
     */
    public void setShipState_IsNull() { regShipState(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_STATE: {varchar(255)}
     */
    public void setShipState_IsNullOrEmpty() { regShipState(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_STATE: {varchar(255)}
     */
    public void setShipState_IsNotNull() { regShipState(CK_ISNN, DOBJ); }

    protected void regShipState(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipState(), "SHIP_STATE"); }
    protected abstract ConditionValue xgetCValueShipState();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     * @param shipPostalCode The value of shipPostalCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPostalCode_Equal(String shipPostalCode) {
        doSetShipPostalCode_Equal(fRES(shipPostalCode));
    }

    protected void doSetShipPostalCode_Equal(String shipPostalCode) {
        regShipPostalCode(CK_EQ, shipPostalCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     * @param shipPostalCode The value of shipPostalCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPostalCode_NotEqual(String shipPostalCode) {
        doSetShipPostalCode_NotEqual(fRES(shipPostalCode));
    }

    protected void doSetShipPostalCode_NotEqual(String shipPostalCode) {
        regShipPostalCode(CK_NES, shipPostalCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     * @param shipPostalCode The value of shipPostalCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPostalCode_GreaterThan(String shipPostalCode) {
        regShipPostalCode(CK_GT, fRES(shipPostalCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     * @param shipPostalCode The value of shipPostalCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPostalCode_LessThan(String shipPostalCode) {
        regShipPostalCode(CK_LT, fRES(shipPostalCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     * @param shipPostalCode The value of shipPostalCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPostalCode_GreaterEqual(String shipPostalCode) {
        regShipPostalCode(CK_GE, fRES(shipPostalCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     * @param shipPostalCode The value of shipPostalCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPostalCode_LessEqual(String shipPostalCode) {
        regShipPostalCode(CK_LE, fRES(shipPostalCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     * @param shipPostalCodeList The collection of shipPostalCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPostalCode_InScope(Collection<String> shipPostalCodeList) {
        doSetShipPostalCode_InScope(shipPostalCodeList);
    }

    protected void doSetShipPostalCode_InScope(Collection<String> shipPostalCodeList) {
        regINS(CK_INS, cTL(shipPostalCodeList), xgetCValueShipPostalCode(), "SHIP_POSTAL_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     * @param shipPostalCodeList The collection of shipPostalCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPostalCode_NotInScope(Collection<String> shipPostalCodeList) {
        doSetShipPostalCode_NotInScope(shipPostalCodeList);
    }

    protected void doSetShipPostalCode_NotInScope(Collection<String> shipPostalCodeList) {
        regINS(CK_NINS, cTL(shipPostalCodeList), xgetCValueShipPostalCode(), "SHIP_POSTAL_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_POSTAL_CODE: {varchar(30)} <br>
     * <pre>e.g. setShipPostalCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipPostalCode The value of shipPostalCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipPostalCode_LikeSearch(String shipPostalCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipPostalCode), xgetCValueShipPostalCode(), "SHIP_POSTAL_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     * @param shipPostalCode The value of shipPostalCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipPostalCode_NotLikeSearch(String shipPostalCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipPostalCode), xgetCValueShipPostalCode(), "SHIP_POSTAL_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     * @param shipPostalCode The value of shipPostalCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPostalCode_PrefixSearch(String shipPostalCode) {
        setShipPostalCode_LikeSearch(shipPostalCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     */
    public void setShipPostalCode_IsNull() { regShipPostalCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     */
    public void setShipPostalCode_IsNullOrEmpty() { regShipPostalCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_POSTAL_CODE: {varchar(30)}
     */
    public void setShipPostalCode_IsNotNull() { regShipPostalCode(CK_ISNN, DOBJ); }

    protected void regShipPostalCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipPostalCode(), "SHIP_POSTAL_CODE"); }
    protected abstract ConditionValue xgetCValueShipPostalCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_COUNTRY: {varchar(30)}
     * @param shipCountry The value of shipCountry as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCountry_Equal(String shipCountry) {
        doSetShipCountry_Equal(fRES(shipCountry));
    }

    protected void doSetShipCountry_Equal(String shipCountry) {
        regShipCountry(CK_EQ, shipCountry);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_COUNTRY: {varchar(30)}
     * @param shipCountry The value of shipCountry as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCountry_NotEqual(String shipCountry) {
        doSetShipCountry_NotEqual(fRES(shipCountry));
    }

    protected void doSetShipCountry_NotEqual(String shipCountry) {
        regShipCountry(CK_NES, shipCountry);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_COUNTRY: {varchar(30)}
     * @param shipCountry The value of shipCountry as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCountry_GreaterThan(String shipCountry) {
        regShipCountry(CK_GT, fRES(shipCountry));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_COUNTRY: {varchar(30)}
     * @param shipCountry The value of shipCountry as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCountry_LessThan(String shipCountry) {
        regShipCountry(CK_LT, fRES(shipCountry));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_COUNTRY: {varchar(30)}
     * @param shipCountry The value of shipCountry as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCountry_GreaterEqual(String shipCountry) {
        regShipCountry(CK_GE, fRES(shipCountry));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_COUNTRY: {varchar(30)}
     * @param shipCountry The value of shipCountry as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCountry_LessEqual(String shipCountry) {
        regShipCountry(CK_LE, fRES(shipCountry));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_COUNTRY: {varchar(30)}
     * @param shipCountryList The collection of shipCountry as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCountry_InScope(Collection<String> shipCountryList) {
        doSetShipCountry_InScope(shipCountryList);
    }

    protected void doSetShipCountry_InScope(Collection<String> shipCountryList) {
        regINS(CK_INS, cTL(shipCountryList), xgetCValueShipCountry(), "SHIP_COUNTRY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_COUNTRY: {varchar(30)}
     * @param shipCountryList The collection of shipCountry as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCountry_NotInScope(Collection<String> shipCountryList) {
        doSetShipCountry_NotInScope(shipCountryList);
    }

    protected void doSetShipCountry_NotInScope(Collection<String> shipCountryList) {
        regINS(CK_NINS, cTL(shipCountryList), xgetCValueShipCountry(), "SHIP_COUNTRY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_COUNTRY: {varchar(30)} <br>
     * <pre>e.g. setShipCountry_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipCountry The value of shipCountry as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipCountry_LikeSearch(String shipCountry, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipCountry), xgetCValueShipCountry(), "SHIP_COUNTRY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_COUNTRY: {varchar(30)}
     * @param shipCountry The value of shipCountry as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipCountry_NotLikeSearch(String shipCountry, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipCountry), xgetCValueShipCountry(), "SHIP_COUNTRY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_COUNTRY: {varchar(30)}
     * @param shipCountry The value of shipCountry as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipCountry_PrefixSearch(String shipCountry) {
        setShipCountry_LikeSearch(shipCountry, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_COUNTRY: {varchar(30)}
     */
    public void setShipCountry_IsNull() { regShipCountry(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_COUNTRY: {varchar(30)}
     */
    public void setShipCountry_IsNullOrEmpty() { regShipCountry(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_COUNTRY: {varchar(30)}
     */
    public void setShipCountry_IsNotNull() { regShipCountry(CK_ISNN, DOBJ); }

    protected void regShipCountry(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipCountry(), "SHIP_COUNTRY"); }
    protected abstract ConditionValue xgetCValueShipCountry();

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
     * GIFT_WRAP_TYPE: {varchar(30)}
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
     * GIFT_WRAP_TYPE: {varchar(30)}
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
     * GIFT_WRAP_TYPE: {varchar(30)}
     * @param giftWrapType The value of giftWrapType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapType_GreaterThan(String giftWrapType) {
        regGiftWrapType(CK_GT, fRES(giftWrapType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(30)}
     * @param giftWrapType The value of giftWrapType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapType_LessThan(String giftWrapType) {
        regGiftWrapType(CK_LT, fRES(giftWrapType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(30)}
     * @param giftWrapType The value of giftWrapType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapType_GreaterEqual(String giftWrapType) {
        regGiftWrapType(CK_GE, fRES(giftWrapType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(30)}
     * @param giftWrapType The value of giftWrapType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapType_LessEqual(String giftWrapType) {
        regGiftWrapType(CK_LE, fRES(giftWrapType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(30)}
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
     * GIFT_WRAP_TYPE: {varchar(30)}
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
     * GIFT_WRAP_TYPE: {varchar(30)} <br>
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
     * GIFT_WRAP_TYPE: {varchar(30)}
     * @param giftWrapType The value of giftWrapType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGiftWrapType_NotLikeSearch(String giftWrapType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(giftWrapType), xgetCValueGiftWrapType(), "GIFT_WRAP_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(30)}
     * @param giftWrapType The value of giftWrapType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftWrapType_PrefixSearch(String giftWrapType) {
        setGiftWrapType_LikeSearch(giftWrapType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(30)}
     */
    public void setGiftWrapType_IsNull() { regGiftWrapType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(30)}
     */
    public void setGiftWrapType_IsNullOrEmpty() { regGiftWrapType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GIFT_WRAP_TYPE: {varchar(30)}
     */
    public void setGiftWrapType_IsNotNull() { regGiftWrapType(CK_ISNN, DOBJ); }

    protected void regGiftWrapType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiftWrapType(), "GIFT_WRAP_TYPE"); }
    protected abstract ConditionValue xgetCValueGiftWrapType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     * @param giftMassageText The value of giftMassageText as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftMassageText_Equal(String giftMassageText) {
        doSetGiftMassageText_Equal(fRES(giftMassageText));
    }

    protected void doSetGiftMassageText_Equal(String giftMassageText) {
        regGiftMassageText(CK_EQ, giftMassageText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     * @param giftMassageText The value of giftMassageText as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftMassageText_NotEqual(String giftMassageText) {
        doSetGiftMassageText_NotEqual(fRES(giftMassageText));
    }

    protected void doSetGiftMassageText_NotEqual(String giftMassageText) {
        regGiftMassageText(CK_NES, giftMassageText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     * @param giftMassageText The value of giftMassageText as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftMassageText_GreaterThan(String giftMassageText) {
        regGiftMassageText(CK_GT, fRES(giftMassageText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     * @param giftMassageText The value of giftMassageText as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftMassageText_LessThan(String giftMassageText) {
        regGiftMassageText(CK_LT, fRES(giftMassageText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     * @param giftMassageText The value of giftMassageText as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftMassageText_GreaterEqual(String giftMassageText) {
        regGiftMassageText(CK_GE, fRES(giftMassageText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     * @param giftMassageText The value of giftMassageText as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftMassageText_LessEqual(String giftMassageText) {
        regGiftMassageText(CK_LE, fRES(giftMassageText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     * @param giftMassageTextList The collection of giftMassageText as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftMassageText_InScope(Collection<String> giftMassageTextList) {
        doSetGiftMassageText_InScope(giftMassageTextList);
    }

    protected void doSetGiftMassageText_InScope(Collection<String> giftMassageTextList) {
        regINS(CK_INS, cTL(giftMassageTextList), xgetCValueGiftMassageText(), "GIFT_MASSAGE_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     * @param giftMassageTextList The collection of giftMassageText as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftMassageText_NotInScope(Collection<String> giftMassageTextList) {
        doSetGiftMassageText_NotInScope(giftMassageTextList);
    }

    protected void doSetGiftMassageText_NotInScope(Collection<String> giftMassageTextList) {
        regINS(CK_NINS, cTL(giftMassageTextList), xgetCValueGiftMassageText(), "GIFT_MASSAGE_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)} <br>
     * <pre>e.g. setGiftMassageText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param giftMassageText The value of giftMassageText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGiftMassageText_LikeSearch(String giftMassageText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(giftMassageText), xgetCValueGiftMassageText(), "GIFT_MASSAGE_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     * @param giftMassageText The value of giftMassageText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGiftMassageText_NotLikeSearch(String giftMassageText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(giftMassageText), xgetCValueGiftMassageText(), "GIFT_MASSAGE_TEXT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     * @param giftMassageText The value of giftMassageText as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftMassageText_PrefixSearch(String giftMassageText) {
        setGiftMassageText_LikeSearch(giftMassageText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     */
    public void setGiftMassageText_IsNull() { regGiftMassageText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     */
    public void setGiftMassageText_IsNullOrEmpty() { regGiftMassageText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GIFT_MASSAGE_TEXT: {varchar(60)}
     */
    public void setGiftMassageText_IsNotNull() { regGiftMassageText(CK_ISNN, DOBJ); }

    protected void regGiftMassageText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiftMassageText(), "GIFT_MASSAGE_TEXT"); }
    protected abstract ConditionValue xgetCValueGiftMassageText();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
     * @param itemPromotionDiscount The value of itemPromotionDiscount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemPromotionDiscount_Equal(Long itemPromotionDiscount) {
        doSetItemPromotionDiscount_Equal(itemPromotionDiscount);
    }

    protected void doSetItemPromotionDiscount_Equal(Long itemPromotionDiscount) {
        regItemPromotionDiscount(CK_EQ, itemPromotionDiscount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
     * @param itemPromotionDiscount The value of itemPromotionDiscount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemPromotionDiscount_NotEqual(Long itemPromotionDiscount) {
        doSetItemPromotionDiscount_NotEqual(itemPromotionDiscount);
    }

    protected void doSetItemPromotionDiscount_NotEqual(Long itemPromotionDiscount) {
        regItemPromotionDiscount(CK_NES, itemPromotionDiscount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
     * @param itemPromotionDiscount The value of itemPromotionDiscount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemPromotionDiscount_GreaterThan(Long itemPromotionDiscount) {
        regItemPromotionDiscount(CK_GT, itemPromotionDiscount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
     * @param itemPromotionDiscount The value of itemPromotionDiscount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemPromotionDiscount_LessThan(Long itemPromotionDiscount) {
        regItemPromotionDiscount(CK_LT, itemPromotionDiscount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
     * @param itemPromotionDiscount The value of itemPromotionDiscount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemPromotionDiscount_GreaterEqual(Long itemPromotionDiscount) {
        regItemPromotionDiscount(CK_GE, itemPromotionDiscount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
     * @param itemPromotionDiscount The value of itemPromotionDiscount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemPromotionDiscount_LessEqual(Long itemPromotionDiscount) {
        regItemPromotionDiscount(CK_LE, itemPromotionDiscount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
     * @param minNumber The min number of itemPromotionDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of itemPromotionDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setItemPromotionDiscount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueItemPromotionDiscount(), "ITEM_PROMOTION_DISCOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
     * @param itemPromotionDiscountList The collection of itemPromotionDiscount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemPromotionDiscount_InScope(Collection<Long> itemPromotionDiscountList) {
        doSetItemPromotionDiscount_InScope(itemPromotionDiscountList);
    }

    protected void doSetItemPromotionDiscount_InScope(Collection<Long> itemPromotionDiscountList) {
        regINS(CK_INS, cTL(itemPromotionDiscountList), xgetCValueItemPromotionDiscount(), "ITEM_PROMOTION_DISCOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
     * @param itemPromotionDiscountList The collection of itemPromotionDiscount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemPromotionDiscount_NotInScope(Collection<Long> itemPromotionDiscountList) {
        doSetItemPromotionDiscount_NotInScope(itemPromotionDiscountList);
    }

    protected void doSetItemPromotionDiscount_NotInScope(Collection<Long> itemPromotionDiscountList) {
        regINS(CK_NINS, cTL(itemPromotionDiscountList), xgetCValueItemPromotionDiscount(), "ITEM_PROMOTION_DISCOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
     */
    public void setItemPromotionDiscount_IsNull() { regItemPromotionDiscount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_DISCOUNT: {bigint(19)}
     */
    public void setItemPromotionDiscount_IsNotNull() { regItemPromotionDiscount(CK_ISNN, DOBJ); }

    protected void regItemPromotionDiscount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemPromotionDiscount(), "ITEM_PROMOTION_DISCOUNT"); }
    protected abstract ConditionValue xgetCValueItemPromotionDiscount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     * @param itemPromotionId The value of itemPromotionId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemPromotionId_Equal(String itemPromotionId) {
        doSetItemPromotionId_Equal(fRES(itemPromotionId));
    }

    protected void doSetItemPromotionId_Equal(String itemPromotionId) {
        regItemPromotionId(CK_EQ, itemPromotionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     * @param itemPromotionId The value of itemPromotionId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemPromotionId_NotEqual(String itemPromotionId) {
        doSetItemPromotionId_NotEqual(fRES(itemPromotionId));
    }

    protected void doSetItemPromotionId_NotEqual(String itemPromotionId) {
        regItemPromotionId(CK_NES, itemPromotionId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     * @param itemPromotionId The value of itemPromotionId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemPromotionId_GreaterThan(String itemPromotionId) {
        regItemPromotionId(CK_GT, fRES(itemPromotionId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     * @param itemPromotionId The value of itemPromotionId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemPromotionId_LessThan(String itemPromotionId) {
        regItemPromotionId(CK_LT, fRES(itemPromotionId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     * @param itemPromotionId The value of itemPromotionId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemPromotionId_GreaterEqual(String itemPromotionId) {
        regItemPromotionId(CK_GE, fRES(itemPromotionId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     * @param itemPromotionId The value of itemPromotionId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemPromotionId_LessEqual(String itemPromotionId) {
        regItemPromotionId(CK_LE, fRES(itemPromotionId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     * @param itemPromotionIdList The collection of itemPromotionId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemPromotionId_InScope(Collection<String> itemPromotionIdList) {
        doSetItemPromotionId_InScope(itemPromotionIdList);
    }

    protected void doSetItemPromotionId_InScope(Collection<String> itemPromotionIdList) {
        regINS(CK_INS, cTL(itemPromotionIdList), xgetCValueItemPromotionId(), "ITEM_PROMOTION_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     * @param itemPromotionIdList The collection of itemPromotionId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemPromotionId_NotInScope(Collection<String> itemPromotionIdList) {
        doSetItemPromotionId_NotInScope(itemPromotionIdList);
    }

    protected void doSetItemPromotionId_NotInScope(Collection<String> itemPromotionIdList) {
        regINS(CK_NINS, cTL(itemPromotionIdList), xgetCValueItemPromotionId(), "ITEM_PROMOTION_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_PROMOTION_ID: {varchar(30)} <br>
     * <pre>e.g. setItemPromotionId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemPromotionId The value of itemPromotionId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemPromotionId_LikeSearch(String itemPromotionId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemPromotionId), xgetCValueItemPromotionId(), "ITEM_PROMOTION_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     * @param itemPromotionId The value of itemPromotionId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemPromotionId_NotLikeSearch(String itemPromotionId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemPromotionId), xgetCValueItemPromotionId(), "ITEM_PROMOTION_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     * @param itemPromotionId The value of itemPromotionId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemPromotionId_PrefixSearch(String itemPromotionId) {
        setItemPromotionId_LikeSearch(itemPromotionId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     */
    public void setItemPromotionId_IsNull() { regItemPromotionId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     */
    public void setItemPromotionId_IsNullOrEmpty() { regItemPromotionId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_PROMOTION_ID: {varchar(30)}
     */
    public void setItemPromotionId_IsNotNull() { regItemPromotionId(CK_ISNN, DOBJ); }

    protected void regItemPromotionId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemPromotionId(), "ITEM_PROMOTION_ID"); }
    protected abstract ConditionValue xgetCValueItemPromotionId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
     * @param shipPromotionDiscount The value of shipPromotionDiscount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipPromotionDiscount_Equal(Long shipPromotionDiscount) {
        doSetShipPromotionDiscount_Equal(shipPromotionDiscount);
    }

    protected void doSetShipPromotionDiscount_Equal(Long shipPromotionDiscount) {
        regShipPromotionDiscount(CK_EQ, shipPromotionDiscount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
     * @param shipPromotionDiscount The value of shipPromotionDiscount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipPromotionDiscount_NotEqual(Long shipPromotionDiscount) {
        doSetShipPromotionDiscount_NotEqual(shipPromotionDiscount);
    }

    protected void doSetShipPromotionDiscount_NotEqual(Long shipPromotionDiscount) {
        regShipPromotionDiscount(CK_NES, shipPromotionDiscount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
     * @param shipPromotionDiscount The value of shipPromotionDiscount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipPromotionDiscount_GreaterThan(Long shipPromotionDiscount) {
        regShipPromotionDiscount(CK_GT, shipPromotionDiscount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
     * @param shipPromotionDiscount The value of shipPromotionDiscount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipPromotionDiscount_LessThan(Long shipPromotionDiscount) {
        regShipPromotionDiscount(CK_LT, shipPromotionDiscount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
     * @param shipPromotionDiscount The value of shipPromotionDiscount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipPromotionDiscount_GreaterEqual(Long shipPromotionDiscount) {
        regShipPromotionDiscount(CK_GE, shipPromotionDiscount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
     * @param shipPromotionDiscount The value of shipPromotionDiscount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipPromotionDiscount_LessEqual(Long shipPromotionDiscount) {
        regShipPromotionDiscount(CK_LE, shipPromotionDiscount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
     * @param minNumber The min number of shipPromotionDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shipPromotionDiscount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShipPromotionDiscount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShipPromotionDiscount(), "SHIP_PROMOTION_DISCOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
     * @param shipPromotionDiscountList The collection of shipPromotionDiscount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPromotionDiscount_InScope(Collection<Long> shipPromotionDiscountList) {
        doSetShipPromotionDiscount_InScope(shipPromotionDiscountList);
    }

    protected void doSetShipPromotionDiscount_InScope(Collection<Long> shipPromotionDiscountList) {
        regINS(CK_INS, cTL(shipPromotionDiscountList), xgetCValueShipPromotionDiscount(), "SHIP_PROMOTION_DISCOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
     * @param shipPromotionDiscountList The collection of shipPromotionDiscount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPromotionDiscount_NotInScope(Collection<Long> shipPromotionDiscountList) {
        doSetShipPromotionDiscount_NotInScope(shipPromotionDiscountList);
    }

    protected void doSetShipPromotionDiscount_NotInScope(Collection<Long> shipPromotionDiscountList) {
        regINS(CK_NINS, cTL(shipPromotionDiscountList), xgetCValueShipPromotionDiscount(), "SHIP_PROMOTION_DISCOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
     */
    public void setShipPromotionDiscount_IsNull() { regShipPromotionDiscount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_DISCOUNT: {bigint(19)}
     */
    public void setShipPromotionDiscount_IsNotNull() { regShipPromotionDiscount(CK_ISNN, DOBJ); }

    protected void regShipPromotionDiscount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipPromotionDiscount(), "SHIP_PROMOTION_DISCOUNT"); }
    protected abstract ConditionValue xgetCValueShipPromotionDiscount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     * @param shipPromotionId The value of shipPromotionId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPromotionId_Equal(String shipPromotionId) {
        doSetShipPromotionId_Equal(fRES(shipPromotionId));
    }

    protected void doSetShipPromotionId_Equal(String shipPromotionId) {
        regShipPromotionId(CK_EQ, shipPromotionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     * @param shipPromotionId The value of shipPromotionId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPromotionId_NotEqual(String shipPromotionId) {
        doSetShipPromotionId_NotEqual(fRES(shipPromotionId));
    }

    protected void doSetShipPromotionId_NotEqual(String shipPromotionId) {
        regShipPromotionId(CK_NES, shipPromotionId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     * @param shipPromotionId The value of shipPromotionId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPromotionId_GreaterThan(String shipPromotionId) {
        regShipPromotionId(CK_GT, fRES(shipPromotionId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     * @param shipPromotionId The value of shipPromotionId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPromotionId_LessThan(String shipPromotionId) {
        regShipPromotionId(CK_LT, fRES(shipPromotionId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     * @param shipPromotionId The value of shipPromotionId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPromotionId_GreaterEqual(String shipPromotionId) {
        regShipPromotionId(CK_GE, fRES(shipPromotionId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     * @param shipPromotionId The value of shipPromotionId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPromotionId_LessEqual(String shipPromotionId) {
        regShipPromotionId(CK_LE, fRES(shipPromotionId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     * @param shipPromotionIdList The collection of shipPromotionId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPromotionId_InScope(Collection<String> shipPromotionIdList) {
        doSetShipPromotionId_InScope(shipPromotionIdList);
    }

    protected void doSetShipPromotionId_InScope(Collection<String> shipPromotionIdList) {
        regINS(CK_INS, cTL(shipPromotionIdList), xgetCValueShipPromotionId(), "SHIP_PROMOTION_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     * @param shipPromotionIdList The collection of shipPromotionId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPromotionId_NotInScope(Collection<String> shipPromotionIdList) {
        doSetShipPromotionId_NotInScope(shipPromotionIdList);
    }

    protected void doSetShipPromotionId_NotInScope(Collection<String> shipPromotionIdList) {
        regINS(CK_NINS, cTL(shipPromotionIdList), xgetCValueShipPromotionId(), "SHIP_PROMOTION_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_PROMOTION_ID: {varchar(30)} <br>
     * <pre>e.g. setShipPromotionId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipPromotionId The value of shipPromotionId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipPromotionId_LikeSearch(String shipPromotionId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipPromotionId), xgetCValueShipPromotionId(), "SHIP_PROMOTION_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     * @param shipPromotionId The value of shipPromotionId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipPromotionId_NotLikeSearch(String shipPromotionId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipPromotionId), xgetCValueShipPromotionId(), "SHIP_PROMOTION_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     * @param shipPromotionId The value of shipPromotionId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipPromotionId_PrefixSearch(String shipPromotionId) {
        setShipPromotionId_LikeSearch(shipPromotionId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     */
    public void setShipPromotionId_IsNull() { regShipPromotionId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     */
    public void setShipPromotionId_IsNullOrEmpty() { regShipPromotionId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_PROMOTION_ID: {varchar(30)}
     */
    public void setShipPromotionId_IsNotNull() { regShipPromotionId(CK_ISNN, DOBJ); }

    protected void regShipPromotionId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipPromotionId(), "SHIP_PROMOTION_ID"); }
    protected abstract ConditionValue xgetCValueShipPromotionId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     * @param deliveryStartDate The value of deliveryStartDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryStartDate_Equal(String deliveryStartDate) {
        doSetDeliveryStartDate_Equal(fRES(deliveryStartDate));
    }

    protected void doSetDeliveryStartDate_Equal(String deliveryStartDate) {
        regDeliveryStartDate(CK_EQ, deliveryStartDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     * @param deliveryStartDate The value of deliveryStartDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryStartDate_NotEqual(String deliveryStartDate) {
        doSetDeliveryStartDate_NotEqual(fRES(deliveryStartDate));
    }

    protected void doSetDeliveryStartDate_NotEqual(String deliveryStartDate) {
        regDeliveryStartDate(CK_NES, deliveryStartDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     * @param deliveryStartDate The value of deliveryStartDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryStartDate_GreaterThan(String deliveryStartDate) {
        regDeliveryStartDate(CK_GT, fRES(deliveryStartDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     * @param deliveryStartDate The value of deliveryStartDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryStartDate_LessThan(String deliveryStartDate) {
        regDeliveryStartDate(CK_LT, fRES(deliveryStartDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     * @param deliveryStartDate The value of deliveryStartDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryStartDate_GreaterEqual(String deliveryStartDate) {
        regDeliveryStartDate(CK_GE, fRES(deliveryStartDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     * @param deliveryStartDate The value of deliveryStartDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryStartDate_LessEqual(String deliveryStartDate) {
        regDeliveryStartDate(CK_LE, fRES(deliveryStartDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     * @param deliveryStartDateList The collection of deliveryStartDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryStartDate_InScope(Collection<String> deliveryStartDateList) {
        doSetDeliveryStartDate_InScope(deliveryStartDateList);
    }

    protected void doSetDeliveryStartDate_InScope(Collection<String> deliveryStartDateList) {
        regINS(CK_INS, cTL(deliveryStartDateList), xgetCValueDeliveryStartDate(), "DELIVERY_START_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     * @param deliveryStartDateList The collection of deliveryStartDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryStartDate_NotInScope(Collection<String> deliveryStartDateList) {
        doSetDeliveryStartDate_NotInScope(deliveryStartDateList);
    }

    protected void doSetDeliveryStartDate_NotInScope(Collection<String> deliveryStartDateList) {
        regINS(CK_NINS, cTL(deliveryStartDateList), xgetCValueDeliveryStartDate(), "DELIVERY_START_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_START_DATE: {varchar(30)} <br>
     * <pre>e.g. setDeliveryStartDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryStartDate The value of deliveryStartDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryStartDate_LikeSearch(String deliveryStartDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryStartDate), xgetCValueDeliveryStartDate(), "DELIVERY_START_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     * @param deliveryStartDate The value of deliveryStartDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryStartDate_NotLikeSearch(String deliveryStartDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryStartDate), xgetCValueDeliveryStartDate(), "DELIVERY_START_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     * @param deliveryStartDate The value of deliveryStartDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryStartDate_PrefixSearch(String deliveryStartDate) {
        setDeliveryStartDate_LikeSearch(deliveryStartDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     */
    public void setDeliveryStartDate_IsNull() { regDeliveryStartDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     */
    public void setDeliveryStartDate_IsNullOrEmpty() { regDeliveryStartDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_START_DATE: {varchar(30)}
     */
    public void setDeliveryStartDate_IsNotNull() { regDeliveryStartDate(CK_ISNN, DOBJ); }

    protected void regDeliveryStartDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryStartDate(), "DELIVERY_START_DATE"); }
    protected abstract ConditionValue xgetCValueDeliveryStartDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     * @param deliveryEndDate The value of deliveryEndDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryEndDate_Equal(String deliveryEndDate) {
        doSetDeliveryEndDate_Equal(fRES(deliveryEndDate));
    }

    protected void doSetDeliveryEndDate_Equal(String deliveryEndDate) {
        regDeliveryEndDate(CK_EQ, deliveryEndDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     * @param deliveryEndDate The value of deliveryEndDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryEndDate_NotEqual(String deliveryEndDate) {
        doSetDeliveryEndDate_NotEqual(fRES(deliveryEndDate));
    }

    protected void doSetDeliveryEndDate_NotEqual(String deliveryEndDate) {
        regDeliveryEndDate(CK_NES, deliveryEndDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     * @param deliveryEndDate The value of deliveryEndDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryEndDate_GreaterThan(String deliveryEndDate) {
        regDeliveryEndDate(CK_GT, fRES(deliveryEndDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     * @param deliveryEndDate The value of deliveryEndDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryEndDate_LessThan(String deliveryEndDate) {
        regDeliveryEndDate(CK_LT, fRES(deliveryEndDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     * @param deliveryEndDate The value of deliveryEndDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryEndDate_GreaterEqual(String deliveryEndDate) {
        regDeliveryEndDate(CK_GE, fRES(deliveryEndDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     * @param deliveryEndDate The value of deliveryEndDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryEndDate_LessEqual(String deliveryEndDate) {
        regDeliveryEndDate(CK_LE, fRES(deliveryEndDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     * @param deliveryEndDateList The collection of deliveryEndDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryEndDate_InScope(Collection<String> deliveryEndDateList) {
        doSetDeliveryEndDate_InScope(deliveryEndDateList);
    }

    protected void doSetDeliveryEndDate_InScope(Collection<String> deliveryEndDateList) {
        regINS(CK_INS, cTL(deliveryEndDateList), xgetCValueDeliveryEndDate(), "DELIVERY_END_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     * @param deliveryEndDateList The collection of deliveryEndDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryEndDate_NotInScope(Collection<String> deliveryEndDateList) {
        doSetDeliveryEndDate_NotInScope(deliveryEndDateList);
    }

    protected void doSetDeliveryEndDate_NotInScope(Collection<String> deliveryEndDateList) {
        regINS(CK_NINS, cTL(deliveryEndDateList), xgetCValueDeliveryEndDate(), "DELIVERY_END_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_END_DATE: {varchar(30)} <br>
     * <pre>e.g. setDeliveryEndDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryEndDate The value of deliveryEndDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryEndDate_LikeSearch(String deliveryEndDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryEndDate), xgetCValueDeliveryEndDate(), "DELIVERY_END_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     * @param deliveryEndDate The value of deliveryEndDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryEndDate_NotLikeSearch(String deliveryEndDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryEndDate), xgetCValueDeliveryEndDate(), "DELIVERY_END_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     * @param deliveryEndDate The value of deliveryEndDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryEndDate_PrefixSearch(String deliveryEndDate) {
        setDeliveryEndDate_LikeSearch(deliveryEndDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     */
    public void setDeliveryEndDate_IsNull() { regDeliveryEndDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     */
    public void setDeliveryEndDate_IsNullOrEmpty() { regDeliveryEndDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_END_DATE: {varchar(30)}
     */
    public void setDeliveryEndDate_IsNotNull() { regDeliveryEndDate(CK_ISNN, DOBJ); }

    protected void regDeliveryEndDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryEndDate(), "DELIVERY_END_DATE"); }
    protected abstract ConditionValue xgetCValueDeliveryEndDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     * @param deliveryTimeZone The value of deliveryTimeZone as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTimeZone_Equal(String deliveryTimeZone) {
        doSetDeliveryTimeZone_Equal(fRES(deliveryTimeZone));
    }

    protected void doSetDeliveryTimeZone_Equal(String deliveryTimeZone) {
        regDeliveryTimeZone(CK_EQ, deliveryTimeZone);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     * @param deliveryTimeZone The value of deliveryTimeZone as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTimeZone_NotEqual(String deliveryTimeZone) {
        doSetDeliveryTimeZone_NotEqual(fRES(deliveryTimeZone));
    }

    protected void doSetDeliveryTimeZone_NotEqual(String deliveryTimeZone) {
        regDeliveryTimeZone(CK_NES, deliveryTimeZone);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     * @param deliveryTimeZone The value of deliveryTimeZone as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTimeZone_GreaterThan(String deliveryTimeZone) {
        regDeliveryTimeZone(CK_GT, fRES(deliveryTimeZone));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     * @param deliveryTimeZone The value of deliveryTimeZone as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTimeZone_LessThan(String deliveryTimeZone) {
        regDeliveryTimeZone(CK_LT, fRES(deliveryTimeZone));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     * @param deliveryTimeZone The value of deliveryTimeZone as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTimeZone_GreaterEqual(String deliveryTimeZone) {
        regDeliveryTimeZone(CK_GE, fRES(deliveryTimeZone));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     * @param deliveryTimeZone The value of deliveryTimeZone as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTimeZone_LessEqual(String deliveryTimeZone) {
        regDeliveryTimeZone(CK_LE, fRES(deliveryTimeZone));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     * @param deliveryTimeZoneList The collection of deliveryTimeZone as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTimeZone_InScope(Collection<String> deliveryTimeZoneList) {
        doSetDeliveryTimeZone_InScope(deliveryTimeZoneList);
    }

    protected void doSetDeliveryTimeZone_InScope(Collection<String> deliveryTimeZoneList) {
        regINS(CK_INS, cTL(deliveryTimeZoneList), xgetCValueDeliveryTimeZone(), "DELIVERY_TIME_ZONE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     * @param deliveryTimeZoneList The collection of deliveryTimeZone as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTimeZone_NotInScope(Collection<String> deliveryTimeZoneList) {
        doSetDeliveryTimeZone_NotInScope(deliveryTimeZoneList);
    }

    protected void doSetDeliveryTimeZone_NotInScope(Collection<String> deliveryTimeZoneList) {
        regINS(CK_NINS, cTL(deliveryTimeZoneList), xgetCValueDeliveryTimeZone(), "DELIVERY_TIME_ZONE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)} <br>
     * <pre>e.g. setDeliveryTimeZone_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryTimeZone The value of deliveryTimeZone as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryTimeZone_LikeSearch(String deliveryTimeZone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryTimeZone), xgetCValueDeliveryTimeZone(), "DELIVERY_TIME_ZONE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     * @param deliveryTimeZone The value of deliveryTimeZone as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryTimeZone_NotLikeSearch(String deliveryTimeZone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryTimeZone), xgetCValueDeliveryTimeZone(), "DELIVERY_TIME_ZONE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     * @param deliveryTimeZone The value of deliveryTimeZone as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryTimeZone_PrefixSearch(String deliveryTimeZone) {
        setDeliveryTimeZone_LikeSearch(deliveryTimeZone, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     */
    public void setDeliveryTimeZone_IsNull() { regDeliveryTimeZone(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     */
    public void setDeliveryTimeZone_IsNullOrEmpty() { regDeliveryTimeZone(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_TIME_ZONE: {varchar(30)}
     */
    public void setDeliveryTimeZone_IsNotNull() { regDeliveryTimeZone(CK_ISNN, DOBJ); }

    protected void regDeliveryTimeZone(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryTimeZone(), "DELIVERY_TIME_ZONE"); }
    protected abstract ConditionValue xgetCValueDeliveryTimeZone();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     * @param deliveryInstructions The value of deliveryInstructions as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInstructions_Equal(String deliveryInstructions) {
        doSetDeliveryInstructions_Equal(fRES(deliveryInstructions));
    }

    protected void doSetDeliveryInstructions_Equal(String deliveryInstructions) {
        regDeliveryInstructions(CK_EQ, deliveryInstructions);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     * @param deliveryInstructions The value of deliveryInstructions as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInstructions_NotEqual(String deliveryInstructions) {
        doSetDeliveryInstructions_NotEqual(fRES(deliveryInstructions));
    }

    protected void doSetDeliveryInstructions_NotEqual(String deliveryInstructions) {
        regDeliveryInstructions(CK_NES, deliveryInstructions);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     * @param deliveryInstructions The value of deliveryInstructions as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInstructions_GreaterThan(String deliveryInstructions) {
        regDeliveryInstructions(CK_GT, fRES(deliveryInstructions));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     * @param deliveryInstructions The value of deliveryInstructions as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInstructions_LessThan(String deliveryInstructions) {
        regDeliveryInstructions(CK_LT, fRES(deliveryInstructions));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     * @param deliveryInstructions The value of deliveryInstructions as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInstructions_GreaterEqual(String deliveryInstructions) {
        regDeliveryInstructions(CK_GE, fRES(deliveryInstructions));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     * @param deliveryInstructions The value of deliveryInstructions as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInstructions_LessEqual(String deliveryInstructions) {
        regDeliveryInstructions(CK_LE, fRES(deliveryInstructions));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     * @param deliveryInstructionsList The collection of deliveryInstructions as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInstructions_InScope(Collection<String> deliveryInstructionsList) {
        doSetDeliveryInstructions_InScope(deliveryInstructionsList);
    }

    protected void doSetDeliveryInstructions_InScope(Collection<String> deliveryInstructionsList) {
        regINS(CK_INS, cTL(deliveryInstructionsList), xgetCValueDeliveryInstructions(), "DELIVERY_INSTRUCTIONS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     * @param deliveryInstructionsList The collection of deliveryInstructions as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInstructions_NotInScope(Collection<String> deliveryInstructionsList) {
        doSetDeliveryInstructions_NotInScope(deliveryInstructionsList);
    }

    protected void doSetDeliveryInstructions_NotInScope(Collection<String> deliveryInstructionsList) {
        regINS(CK_NINS, cTL(deliveryInstructionsList), xgetCValueDeliveryInstructions(), "DELIVERY_INSTRUCTIONS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)} <br>
     * <pre>e.g. setDeliveryInstructions_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryInstructions The value of deliveryInstructions as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryInstructions_LikeSearch(String deliveryInstructions, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryInstructions), xgetCValueDeliveryInstructions(), "DELIVERY_INSTRUCTIONS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     * @param deliveryInstructions The value of deliveryInstructions as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryInstructions_NotLikeSearch(String deliveryInstructions, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryInstructions), xgetCValueDeliveryInstructions(), "DELIVERY_INSTRUCTIONS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     * @param deliveryInstructions The value of deliveryInstructions as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInstructions_PrefixSearch(String deliveryInstructions) {
        setDeliveryInstructions_LikeSearch(deliveryInstructions, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     */
    public void setDeliveryInstructions_IsNull() { regDeliveryInstructions(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     */
    public void setDeliveryInstructions_IsNullOrEmpty() { regDeliveryInstructions(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_INSTRUCTIONS: {varchar(60)}
     */
    public void setDeliveryInstructions_IsNotNull() { regDeliveryInstructions(CK_ISNN, DOBJ); }

    protected void regDeliveryInstructions(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryInstructions(), "DELIVERY_INSTRUCTIONS"); }
    protected abstract ConditionValue xgetCValueDeliveryInstructions();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(60)}
     * @param paymentMethod The value of paymentMethod as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_Equal(String paymentMethod) {
        doSetPaymentMethod_Equal(fRES(paymentMethod));
    }

    protected void doSetPaymentMethod_Equal(String paymentMethod) {
        regPaymentMethod(CK_EQ, paymentMethod);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(60)}
     * @param paymentMethod The value of paymentMethod as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_NotEqual(String paymentMethod) {
        doSetPaymentMethod_NotEqual(fRES(paymentMethod));
    }

    protected void doSetPaymentMethod_NotEqual(String paymentMethod) {
        regPaymentMethod(CK_NES, paymentMethod);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(60)}
     * @param paymentMethod The value of paymentMethod as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_GreaterThan(String paymentMethod) {
        regPaymentMethod(CK_GT, fRES(paymentMethod));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(60)}
     * @param paymentMethod The value of paymentMethod as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_LessThan(String paymentMethod) {
        regPaymentMethod(CK_LT, fRES(paymentMethod));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(60)}
     * @param paymentMethod The value of paymentMethod as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_GreaterEqual(String paymentMethod) {
        regPaymentMethod(CK_GE, fRES(paymentMethod));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(60)}
     * @param paymentMethod The value of paymentMethod as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_LessEqual(String paymentMethod) {
        regPaymentMethod(CK_LE, fRES(paymentMethod));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_METHOD: {varchar(60)}
     * @param paymentMethodList The collection of paymentMethod as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_InScope(Collection<String> paymentMethodList) {
        doSetPaymentMethod_InScope(paymentMethodList);
    }

    protected void doSetPaymentMethod_InScope(Collection<String> paymentMethodList) {
        regINS(CK_INS, cTL(paymentMethodList), xgetCValuePaymentMethod(), "PAYMENT_METHOD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_METHOD: {varchar(60)}
     * @param paymentMethodList The collection of paymentMethod as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_NotInScope(Collection<String> paymentMethodList) {
        doSetPaymentMethod_NotInScope(paymentMethodList);
    }

    protected void doSetPaymentMethod_NotInScope(Collection<String> paymentMethodList) {
        regINS(CK_NINS, cTL(paymentMethodList), xgetCValuePaymentMethod(), "PAYMENT_METHOD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_METHOD: {varchar(60)} <br>
     * <pre>e.g. setPaymentMethod_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param paymentMethod The value of paymentMethod as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPaymentMethod_LikeSearch(String paymentMethod, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(paymentMethod), xgetCValuePaymentMethod(), "PAYMENT_METHOD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_METHOD: {varchar(60)}
     * @param paymentMethod The value of paymentMethod as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPaymentMethod_NotLikeSearch(String paymentMethod, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(paymentMethod), xgetCValuePaymentMethod(), "PAYMENT_METHOD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_METHOD: {varchar(60)}
     * @param paymentMethod The value of paymentMethod as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_PrefixSearch(String paymentMethod) {
        setPaymentMethod_LikeSearch(paymentMethod, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(60)}
     */
    public void setPaymentMethod_IsNull() { regPaymentMethod(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(60)}
     */
    public void setPaymentMethod_IsNullOrEmpty() { regPaymentMethod(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(60)}
     */
    public void setPaymentMethod_IsNotNull() { regPaymentMethod(CK_ISNN, DOBJ); }

    protected void regPaymentMethod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentMethod(), "PAYMENT_METHOD"); }
    protected abstract ConditionValue xgetCValuePaymentMethod();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
     * @param codCollectibleAmount The value of codCollectibleAmount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodCollectibleAmount_Equal(Long codCollectibleAmount) {
        doSetCodCollectibleAmount_Equal(codCollectibleAmount);
    }

    protected void doSetCodCollectibleAmount_Equal(Long codCollectibleAmount) {
        regCodCollectibleAmount(CK_EQ, codCollectibleAmount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
     * @param codCollectibleAmount The value of codCollectibleAmount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodCollectibleAmount_NotEqual(Long codCollectibleAmount) {
        doSetCodCollectibleAmount_NotEqual(codCollectibleAmount);
    }

    protected void doSetCodCollectibleAmount_NotEqual(Long codCollectibleAmount) {
        regCodCollectibleAmount(CK_NES, codCollectibleAmount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
     * @param codCollectibleAmount The value of codCollectibleAmount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodCollectibleAmount_GreaterThan(Long codCollectibleAmount) {
        regCodCollectibleAmount(CK_GT, codCollectibleAmount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
     * @param codCollectibleAmount The value of codCollectibleAmount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodCollectibleAmount_LessThan(Long codCollectibleAmount) {
        regCodCollectibleAmount(CK_LT, codCollectibleAmount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
     * @param codCollectibleAmount The value of codCollectibleAmount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodCollectibleAmount_GreaterEqual(Long codCollectibleAmount) {
        regCodCollectibleAmount(CK_GE, codCollectibleAmount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
     * @param codCollectibleAmount The value of codCollectibleAmount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodCollectibleAmount_LessEqual(Long codCollectibleAmount) {
        regCodCollectibleAmount(CK_LE, codCollectibleAmount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
     * @param minNumber The min number of codCollectibleAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of codCollectibleAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCodCollectibleAmount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCodCollectibleAmount(), "COD_COLLECTIBLE_AMOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
     * @param codCollectibleAmountList The collection of codCollectibleAmount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodCollectibleAmount_InScope(Collection<Long> codCollectibleAmountList) {
        doSetCodCollectibleAmount_InScope(codCollectibleAmountList);
    }

    protected void doSetCodCollectibleAmount_InScope(Collection<Long> codCollectibleAmountList) {
        regINS(CK_INS, cTL(codCollectibleAmountList), xgetCValueCodCollectibleAmount(), "COD_COLLECTIBLE_AMOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
     * @param codCollectibleAmountList The collection of codCollectibleAmount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodCollectibleAmount_NotInScope(Collection<Long> codCollectibleAmountList) {
        doSetCodCollectibleAmount_NotInScope(codCollectibleAmountList);
    }

    protected void doSetCodCollectibleAmount_NotInScope(Collection<Long> codCollectibleAmountList) {
        regINS(CK_NINS, cTL(codCollectibleAmountList), xgetCValueCodCollectibleAmount(), "COD_COLLECTIBLE_AMOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
     */
    public void setCodCollectibleAmount_IsNull() { regCodCollectibleAmount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD_COLLECTIBLE_AMOUNT: {bigint(19)}
     */
    public void setCodCollectibleAmount_IsNotNull() { regCodCollectibleAmount(CK_ISNN, DOBJ); }

    protected void regCodCollectibleAmount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodCollectibleAmount(), "COD_COLLECTIBLE_AMOUNT"); }
    protected abstract ConditionValue xgetCValueCodCollectibleAmount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALREADY_PAID: {bigint(19)}
     * @param alreadyPaid The value of alreadyPaid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlreadyPaid_Equal(Long alreadyPaid) {
        doSetAlreadyPaid_Equal(alreadyPaid);
    }

    protected void doSetAlreadyPaid_Equal(Long alreadyPaid) {
        regAlreadyPaid(CK_EQ, alreadyPaid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALREADY_PAID: {bigint(19)}
     * @param alreadyPaid The value of alreadyPaid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlreadyPaid_NotEqual(Long alreadyPaid) {
        doSetAlreadyPaid_NotEqual(alreadyPaid);
    }

    protected void doSetAlreadyPaid_NotEqual(Long alreadyPaid) {
        regAlreadyPaid(CK_NES, alreadyPaid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALREADY_PAID: {bigint(19)}
     * @param alreadyPaid The value of alreadyPaid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlreadyPaid_GreaterThan(Long alreadyPaid) {
        regAlreadyPaid(CK_GT, alreadyPaid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALREADY_PAID: {bigint(19)}
     * @param alreadyPaid The value of alreadyPaid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlreadyPaid_LessThan(Long alreadyPaid) {
        regAlreadyPaid(CK_LT, alreadyPaid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALREADY_PAID: {bigint(19)}
     * @param alreadyPaid The value of alreadyPaid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlreadyPaid_GreaterEqual(Long alreadyPaid) {
        regAlreadyPaid(CK_GE, alreadyPaid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALREADY_PAID: {bigint(19)}
     * @param alreadyPaid The value of alreadyPaid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlreadyPaid_LessEqual(Long alreadyPaid) {
        regAlreadyPaid(CK_LE, alreadyPaid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALREADY_PAID: {bigint(19)}
     * @param minNumber The min number of alreadyPaid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of alreadyPaid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAlreadyPaid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAlreadyPaid(), "ALREADY_PAID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALREADY_PAID: {bigint(19)}
     * @param alreadyPaidList The collection of alreadyPaid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlreadyPaid_InScope(Collection<Long> alreadyPaidList) {
        doSetAlreadyPaid_InScope(alreadyPaidList);
    }

    protected void doSetAlreadyPaid_InScope(Collection<Long> alreadyPaidList) {
        regINS(CK_INS, cTL(alreadyPaidList), xgetCValueAlreadyPaid(), "ALREADY_PAID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALREADY_PAID: {bigint(19)}
     * @param alreadyPaidList The collection of alreadyPaid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlreadyPaid_NotInScope(Collection<Long> alreadyPaidList) {
        doSetAlreadyPaid_NotInScope(alreadyPaidList);
    }

    protected void doSetAlreadyPaid_NotInScope(Collection<Long> alreadyPaidList) {
        regINS(CK_NINS, cTL(alreadyPaidList), xgetCValueAlreadyPaid(), "ALREADY_PAID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALREADY_PAID: {bigint(19)}
     */
    public void setAlreadyPaid_IsNull() { regAlreadyPaid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALREADY_PAID: {bigint(19)}
     */
    public void setAlreadyPaid_IsNotNull() { regAlreadyPaid(CK_ISNN, DOBJ); }

    protected void regAlreadyPaid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAlreadyPaid(), "ALREADY_PAID"); }
    protected abstract ConditionValue xgetCValueAlreadyPaid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD_FEE: {bigint(19)}
     * @param paymentMethodFee The value of paymentMethodFee as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentMethodFee_Equal(Long paymentMethodFee) {
        doSetPaymentMethodFee_Equal(paymentMethodFee);
    }

    protected void doSetPaymentMethodFee_Equal(Long paymentMethodFee) {
        regPaymentMethodFee(CK_EQ, paymentMethodFee);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD_FEE: {bigint(19)}
     * @param paymentMethodFee The value of paymentMethodFee as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentMethodFee_NotEqual(Long paymentMethodFee) {
        doSetPaymentMethodFee_NotEqual(paymentMethodFee);
    }

    protected void doSetPaymentMethodFee_NotEqual(Long paymentMethodFee) {
        regPaymentMethodFee(CK_NES, paymentMethodFee);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD_FEE: {bigint(19)}
     * @param paymentMethodFee The value of paymentMethodFee as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentMethodFee_GreaterThan(Long paymentMethodFee) {
        regPaymentMethodFee(CK_GT, paymentMethodFee);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD_FEE: {bigint(19)}
     * @param paymentMethodFee The value of paymentMethodFee as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentMethodFee_LessThan(Long paymentMethodFee) {
        regPaymentMethodFee(CK_LT, paymentMethodFee);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD_FEE: {bigint(19)}
     * @param paymentMethodFee The value of paymentMethodFee as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentMethodFee_GreaterEqual(Long paymentMethodFee) {
        regPaymentMethodFee(CK_GE, paymentMethodFee);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD_FEE: {bigint(19)}
     * @param paymentMethodFee The value of paymentMethodFee as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentMethodFee_LessEqual(Long paymentMethodFee) {
        regPaymentMethodFee(CK_LE, paymentMethodFee);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD_FEE: {bigint(19)}
     * @param minNumber The min number of paymentMethodFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of paymentMethodFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPaymentMethodFee_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePaymentMethodFee(), "PAYMENT_METHOD_FEE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PAYMENT_METHOD_FEE: {bigint(19)}
     * @param paymentMethodFeeList The collection of paymentMethodFee as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethodFee_InScope(Collection<Long> paymentMethodFeeList) {
        doSetPaymentMethodFee_InScope(paymentMethodFeeList);
    }

    protected void doSetPaymentMethodFee_InScope(Collection<Long> paymentMethodFeeList) {
        regINS(CK_INS, cTL(paymentMethodFeeList), xgetCValuePaymentMethodFee(), "PAYMENT_METHOD_FEE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PAYMENT_METHOD_FEE: {bigint(19)}
     * @param paymentMethodFeeList The collection of paymentMethodFee as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethodFee_NotInScope(Collection<Long> paymentMethodFeeList) {
        doSetPaymentMethodFee_NotInScope(paymentMethodFeeList);
    }

    protected void doSetPaymentMethodFee_NotInScope(Collection<Long> paymentMethodFeeList) {
        regINS(CK_NINS, cTL(paymentMethodFeeList), xgetCValuePaymentMethodFee(), "PAYMENT_METHOD_FEE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAYMENT_METHOD_FEE: {bigint(19)}
     */
    public void setPaymentMethodFee_IsNull() { regPaymentMethodFee(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAYMENT_METHOD_FEE: {bigint(19)}
     */
    public void setPaymentMethodFee_IsNotNull() { regPaymentMethodFee(CK_ISNN, DOBJ); }

    protected void regPaymentMethodFee(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentMethodFee(), "PAYMENT_METHOD_FEE"); }
    protected abstract ConditionValue xgetCValuePaymentMethodFee();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     * @param scheduledDeliStDate The value of scheduledDeliStDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliStDate_Equal(String scheduledDeliStDate) {
        doSetScheduledDeliStDate_Equal(fRES(scheduledDeliStDate));
    }

    protected void doSetScheduledDeliStDate_Equal(String scheduledDeliStDate) {
        regScheduledDeliStDate(CK_EQ, scheduledDeliStDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     * @param scheduledDeliStDate The value of scheduledDeliStDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliStDate_NotEqual(String scheduledDeliStDate) {
        doSetScheduledDeliStDate_NotEqual(fRES(scheduledDeliStDate));
    }

    protected void doSetScheduledDeliStDate_NotEqual(String scheduledDeliStDate) {
        regScheduledDeliStDate(CK_NES, scheduledDeliStDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     * @param scheduledDeliStDate The value of scheduledDeliStDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliStDate_GreaterThan(String scheduledDeliStDate) {
        regScheduledDeliStDate(CK_GT, fRES(scheduledDeliStDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     * @param scheduledDeliStDate The value of scheduledDeliStDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliStDate_LessThan(String scheduledDeliStDate) {
        regScheduledDeliStDate(CK_LT, fRES(scheduledDeliStDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     * @param scheduledDeliStDate The value of scheduledDeliStDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliStDate_GreaterEqual(String scheduledDeliStDate) {
        regScheduledDeliStDate(CK_GE, fRES(scheduledDeliStDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     * @param scheduledDeliStDate The value of scheduledDeliStDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliStDate_LessEqual(String scheduledDeliStDate) {
        regScheduledDeliStDate(CK_LE, fRES(scheduledDeliStDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     * @param scheduledDeliStDateList The collection of scheduledDeliStDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliStDate_InScope(Collection<String> scheduledDeliStDateList) {
        doSetScheduledDeliStDate_InScope(scheduledDeliStDateList);
    }

    protected void doSetScheduledDeliStDate_InScope(Collection<String> scheduledDeliStDateList) {
        regINS(CK_INS, cTL(scheduledDeliStDateList), xgetCValueScheduledDeliStDate(), "SCHEDULED_DELI_ST_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     * @param scheduledDeliStDateList The collection of scheduledDeliStDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliStDate_NotInScope(Collection<String> scheduledDeliStDateList) {
        doSetScheduledDeliStDate_NotInScope(scheduledDeliStDateList);
    }

    protected void doSetScheduledDeliStDate_NotInScope(Collection<String> scheduledDeliStDateList) {
        regINS(CK_NINS, cTL(scheduledDeliStDateList), xgetCValueScheduledDeliStDate(), "SCHEDULED_DELI_ST_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)} <br>
     * <pre>e.g. setScheduledDeliStDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scheduledDeliStDate The value of scheduledDeliStDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScheduledDeliStDate_LikeSearch(String scheduledDeliStDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scheduledDeliStDate), xgetCValueScheduledDeliStDate(), "SCHEDULED_DELI_ST_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     * @param scheduledDeliStDate The value of scheduledDeliStDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScheduledDeliStDate_NotLikeSearch(String scheduledDeliStDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scheduledDeliStDate), xgetCValueScheduledDeliStDate(), "SCHEDULED_DELI_ST_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     * @param scheduledDeliStDate The value of scheduledDeliStDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliStDate_PrefixSearch(String scheduledDeliStDate) {
        setScheduledDeliStDate_LikeSearch(scheduledDeliStDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     */
    public void setScheduledDeliStDate_IsNull() { regScheduledDeliStDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     */
    public void setScheduledDeliStDate_IsNullOrEmpty() { regScheduledDeliStDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ST_DATE: {varchar(30)}
     */
    public void setScheduledDeliStDate_IsNotNull() { regScheduledDeliStDate(CK_ISNN, DOBJ); }

    protected void regScheduledDeliStDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScheduledDeliStDate(), "SCHEDULED_DELI_ST_DATE"); }
    protected abstract ConditionValue xgetCValueScheduledDeliStDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     * @param scheduledDeliEdDate The value of scheduledDeliEdDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliEdDate_Equal(String scheduledDeliEdDate) {
        doSetScheduledDeliEdDate_Equal(fRES(scheduledDeliEdDate));
    }

    protected void doSetScheduledDeliEdDate_Equal(String scheduledDeliEdDate) {
        regScheduledDeliEdDate(CK_EQ, scheduledDeliEdDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     * @param scheduledDeliEdDate The value of scheduledDeliEdDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliEdDate_NotEqual(String scheduledDeliEdDate) {
        doSetScheduledDeliEdDate_NotEqual(fRES(scheduledDeliEdDate));
    }

    protected void doSetScheduledDeliEdDate_NotEqual(String scheduledDeliEdDate) {
        regScheduledDeliEdDate(CK_NES, scheduledDeliEdDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     * @param scheduledDeliEdDate The value of scheduledDeliEdDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliEdDate_GreaterThan(String scheduledDeliEdDate) {
        regScheduledDeliEdDate(CK_GT, fRES(scheduledDeliEdDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     * @param scheduledDeliEdDate The value of scheduledDeliEdDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliEdDate_LessThan(String scheduledDeliEdDate) {
        regScheduledDeliEdDate(CK_LT, fRES(scheduledDeliEdDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     * @param scheduledDeliEdDate The value of scheduledDeliEdDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliEdDate_GreaterEqual(String scheduledDeliEdDate) {
        regScheduledDeliEdDate(CK_GE, fRES(scheduledDeliEdDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     * @param scheduledDeliEdDate The value of scheduledDeliEdDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliEdDate_LessEqual(String scheduledDeliEdDate) {
        regScheduledDeliEdDate(CK_LE, fRES(scheduledDeliEdDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     * @param scheduledDeliEdDateList The collection of scheduledDeliEdDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliEdDate_InScope(Collection<String> scheduledDeliEdDateList) {
        doSetScheduledDeliEdDate_InScope(scheduledDeliEdDateList);
    }

    protected void doSetScheduledDeliEdDate_InScope(Collection<String> scheduledDeliEdDateList) {
        regINS(CK_INS, cTL(scheduledDeliEdDateList), xgetCValueScheduledDeliEdDate(), "SCHEDULED_DELI_ED_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     * @param scheduledDeliEdDateList The collection of scheduledDeliEdDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliEdDate_NotInScope(Collection<String> scheduledDeliEdDateList) {
        doSetScheduledDeliEdDate_NotInScope(scheduledDeliEdDateList);
    }

    protected void doSetScheduledDeliEdDate_NotInScope(Collection<String> scheduledDeliEdDateList) {
        regINS(CK_NINS, cTL(scheduledDeliEdDateList), xgetCValueScheduledDeliEdDate(), "SCHEDULED_DELI_ED_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)} <br>
     * <pre>e.g. setScheduledDeliEdDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scheduledDeliEdDate The value of scheduledDeliEdDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScheduledDeliEdDate_LikeSearch(String scheduledDeliEdDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scheduledDeliEdDate), xgetCValueScheduledDeliEdDate(), "SCHEDULED_DELI_ED_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     * @param scheduledDeliEdDate The value of scheduledDeliEdDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScheduledDeliEdDate_NotLikeSearch(String scheduledDeliEdDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scheduledDeliEdDate), xgetCValueScheduledDeliEdDate(), "SCHEDULED_DELI_ED_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     * @param scheduledDeliEdDate The value of scheduledDeliEdDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScheduledDeliEdDate_PrefixSearch(String scheduledDeliEdDate) {
        setScheduledDeliEdDate_LikeSearch(scheduledDeliEdDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     */
    public void setScheduledDeliEdDate_IsNull() { regScheduledDeliEdDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     */
    public void setScheduledDeliEdDate_IsNullOrEmpty() { regScheduledDeliEdDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCHEDULED_DELI_ED_DATE: {varchar(30)}
     */
    public void setScheduledDeliEdDate_IsNotNull() { regScheduledDeliEdDate(CK_ISNN, DOBJ); }

    protected void regScheduledDeliEdDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScheduledDeliEdDate(), "SCHEDULED_DELI_ED_DATE"); }
    protected abstract ConditionValue xgetCValueScheduledDeliEdDate();

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
    public HpSLCFunction<TAmazonOrderCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TAmazonOrderCB.class);
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
    public HpSLCFunction<TAmazonOrderCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TAmazonOrderCB.class);
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
    public HpSLCFunction<TAmazonOrderCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TAmazonOrderCB.class);
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
    public HpSLCFunction<TAmazonOrderCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TAmazonOrderCB.class);
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
    public HpSLCFunction<TAmazonOrderCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TAmazonOrderCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TAmazonOrderCB&gt;() {
     *     public void query(TAmazonOrderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TAmazonOrderCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TAmazonOrderCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TAmazonOrderCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TAmazonOrderCQ sq);

    protected TAmazonOrderCB xcreateScalarConditionCB() {
        TAmazonOrderCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TAmazonOrderCB xcreateScalarConditionPartitionByCB() {
        TAmazonOrderCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TAmazonOrderCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAmazonOrderCB cb = new TAmazonOrderCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "AMAZON_ORDER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TAmazonOrderCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TAmazonOrderCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TAmazonOrderCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAmazonOrderCB cb = new TAmazonOrderCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "AMAZON_ORDER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TAmazonOrderCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TAmazonOrderCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAmazonOrderCB cb = new TAmazonOrderCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TAmazonOrderCQ sq);

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
    protected TAmazonOrderCB newMyCB() {
        return new TAmazonOrderCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TAmazonOrderCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

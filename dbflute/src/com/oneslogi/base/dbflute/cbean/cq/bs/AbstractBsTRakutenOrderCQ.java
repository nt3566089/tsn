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
 * The abstract condition-query of T_RAKUTEN_ORDER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTRakutenOrderCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTRakutenOrderCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_RAKUTEN_ORDER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rakutenOrderId The value of rakutenOrderId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRakutenOrderId_Equal(Long rakutenOrderId) {
        doSetRakutenOrderId_Equal(rakutenOrderId);
    }

    protected void doSetRakutenOrderId_Equal(Long rakutenOrderId) {
        regRakutenOrderId(CK_EQ, rakutenOrderId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rakutenOrderId The value of rakutenOrderId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRakutenOrderId_NotEqual(Long rakutenOrderId) {
        doSetRakutenOrderId_NotEqual(rakutenOrderId);
    }

    protected void doSetRakutenOrderId_NotEqual(Long rakutenOrderId) {
        regRakutenOrderId(CK_NES, rakutenOrderId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rakutenOrderId The value of rakutenOrderId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRakutenOrderId_GreaterThan(Long rakutenOrderId) {
        regRakutenOrderId(CK_GT, rakutenOrderId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rakutenOrderId The value of rakutenOrderId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRakutenOrderId_LessThan(Long rakutenOrderId) {
        regRakutenOrderId(CK_LT, rakutenOrderId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rakutenOrderId The value of rakutenOrderId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRakutenOrderId_GreaterEqual(Long rakutenOrderId) {
        regRakutenOrderId(CK_GE, rakutenOrderId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rakutenOrderId The value of rakutenOrderId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRakutenOrderId_LessEqual(Long rakutenOrderId) {
        regRakutenOrderId(CK_LE, rakutenOrderId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of rakutenOrderId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rakutenOrderId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRakutenOrderId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRakutenOrderId(), "RAKUTEN_ORDER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rakutenOrderIdList The collection of rakutenOrderId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRakutenOrderId_InScope(Collection<Long> rakutenOrderIdList) {
        doSetRakutenOrderId_InScope(rakutenOrderIdList);
    }

    protected void doSetRakutenOrderId_InScope(Collection<Long> rakutenOrderIdList) {
        regINS(CK_INS, cTL(rakutenOrderIdList), xgetCValueRakutenOrderId(), "RAKUTEN_ORDER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rakutenOrderIdList The collection of rakutenOrderId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRakutenOrderId_NotInScope(Collection<Long> rakutenOrderIdList) {
        doSetRakutenOrderId_NotInScope(rakutenOrderIdList);
    }

    protected void doSetRakutenOrderId_NotInScope(Collection<Long> rakutenOrderIdList) {
        regINS(CK_NINS, cTL(rakutenOrderIdList), xgetCValueRakutenOrderId(), "RAKUTEN_ORDER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setRakutenOrderId_IsNull() { regRakutenOrderId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setRakutenOrderId_IsNotNull() { regRakutenOrderId(CK_ISNN, DOBJ); }

    protected void regRakutenOrderId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRakutenOrderId(), "RAKUTEN_ORDER_ID"); }
    protected abstract ConditionValue xgetCValueRakutenOrderId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(100)}
     * @param orderNo The value of orderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_Equal(String orderNo) {
        doSetOrderNo_Equal(fRES(orderNo));
    }

    protected void doSetOrderNo_Equal(String orderNo) {
        regOrderNo(CK_EQ, orderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(100)}
     * @param orderNo The value of orderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_NotEqual(String orderNo) {
        doSetOrderNo_NotEqual(fRES(orderNo));
    }

    protected void doSetOrderNo_NotEqual(String orderNo) {
        regOrderNo(CK_NES, orderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(100)}
     * @param orderNo The value of orderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_GreaterThan(String orderNo) {
        regOrderNo(CK_GT, fRES(orderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(100)}
     * @param orderNo The value of orderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_LessThan(String orderNo) {
        regOrderNo(CK_LT, fRES(orderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(100)}
     * @param orderNo The value of orderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_GreaterEqual(String orderNo) {
        regOrderNo(CK_GE, fRES(orderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(100)}
     * @param orderNo The value of orderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_LessEqual(String orderNo) {
        regOrderNo(CK_LE, fRES(orderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_NO: {varchar(100)}
     * @param orderNoList The collection of orderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_InScope(Collection<String> orderNoList) {
        doSetOrderNo_InScope(orderNoList);
    }

    protected void doSetOrderNo_InScope(Collection<String> orderNoList) {
        regINS(CK_INS, cTL(orderNoList), xgetCValueOrderNo(), "ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_NO: {varchar(100)}
     * @param orderNoList The collection of orderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_NotInScope(Collection<String> orderNoList) {
        doSetOrderNo_NotInScope(orderNoList);
    }

    protected void doSetOrderNo_NotInScope(Collection<String> orderNoList) {
        regINS(CK_NINS, cTL(orderNoList), xgetCValueOrderNo(), "ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO: {varchar(100)} <br>
     * <pre>e.g. setOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderNo The value of orderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderNo_LikeSearch(String orderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderNo), xgetCValueOrderNo(), "ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO: {varchar(100)}
     * @param orderNo The value of orderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderNo_NotLikeSearch(String orderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderNo), xgetCValueOrderNo(), "ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO: {varchar(100)}
     * @param orderNo The value of orderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_PrefixSearch(String orderNo) {
        setOrderNo_LikeSearch(orderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(100)}
     */
    public void setOrderNo_IsNull() { regOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(100)}
     */
    public void setOrderNo_IsNullOrEmpty() { regOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(100)}
     */
    public void setOrderNo_IsNotNull() { regOrderNo(CK_ISNN, DOBJ); }

    protected void regOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderNo(), "ORDER_NO"); }
    protected abstract ConditionValue xgetCValueOrderNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(30)}
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
     * ORDER_STATUS: {varchar(30)}
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
     * ORDER_STATUS: {varchar(30)}
     * @param orderStatus The value of orderStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderStatus_GreaterThan(String orderStatus) {
        regOrderStatus(CK_GT, fRES(orderStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(30)}
     * @param orderStatus The value of orderStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderStatus_LessThan(String orderStatus) {
        regOrderStatus(CK_LT, fRES(orderStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(30)}
     * @param orderStatus The value of orderStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderStatus_GreaterEqual(String orderStatus) {
        regOrderStatus(CK_GE, fRES(orderStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(30)}
     * @param orderStatus The value of orderStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderStatus_LessEqual(String orderStatus) {
        regOrderStatus(CK_LE, fRES(orderStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_STATUS: {varchar(30)}
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
     * ORDER_STATUS: {varchar(30)}
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
     * ORDER_STATUS: {varchar(30)} <br>
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
     * ORDER_STATUS: {varchar(30)}
     * @param orderStatus The value of orderStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderStatus_NotLikeSearch(String orderStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderStatus), xgetCValueOrderStatus(), "ORDER_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_STATUS: {varchar(30)}
     * @param orderStatus The value of orderStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderStatus_PrefixSearch(String orderStatus) {
        setOrderStatus_LikeSearch(orderStatus, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(30)}
     */
    public void setOrderStatus_IsNull() { regOrderStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(30)}
     */
    public void setOrderStatus_IsNullOrEmpty() { regOrderStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_STATUS: {varchar(30)}
     */
    public void setOrderStatus_IsNotNull() { regOrderStatus(CK_ISNN, DOBJ); }

    protected void regOrderStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderStatus(), "ORDER_STATUS"); }
    protected abstract ConditionValue xgetCValueOrderStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_STATUS: {varchar(30)}
     * @param cardStatus The value of cardStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardStatus_Equal(String cardStatus) {
        doSetCardStatus_Equal(fRES(cardStatus));
    }

    protected void doSetCardStatus_Equal(String cardStatus) {
        regCardStatus(CK_EQ, cardStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_STATUS: {varchar(30)}
     * @param cardStatus The value of cardStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardStatus_NotEqual(String cardStatus) {
        doSetCardStatus_NotEqual(fRES(cardStatus));
    }

    protected void doSetCardStatus_NotEqual(String cardStatus) {
        regCardStatus(CK_NES, cardStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_STATUS: {varchar(30)}
     * @param cardStatus The value of cardStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardStatus_GreaterThan(String cardStatus) {
        regCardStatus(CK_GT, fRES(cardStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_STATUS: {varchar(30)}
     * @param cardStatus The value of cardStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardStatus_LessThan(String cardStatus) {
        regCardStatus(CK_LT, fRES(cardStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_STATUS: {varchar(30)}
     * @param cardStatus The value of cardStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardStatus_GreaterEqual(String cardStatus) {
        regCardStatus(CK_GE, fRES(cardStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_STATUS: {varchar(30)}
     * @param cardStatus The value of cardStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardStatus_LessEqual(String cardStatus) {
        regCardStatus(CK_LE, fRES(cardStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_STATUS: {varchar(30)}
     * @param cardStatusList The collection of cardStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardStatus_InScope(Collection<String> cardStatusList) {
        doSetCardStatus_InScope(cardStatusList);
    }

    protected void doSetCardStatus_InScope(Collection<String> cardStatusList) {
        regINS(CK_INS, cTL(cardStatusList), xgetCValueCardStatus(), "CARD_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_STATUS: {varchar(30)}
     * @param cardStatusList The collection of cardStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardStatus_NotInScope(Collection<String> cardStatusList) {
        doSetCardStatus_NotInScope(cardStatusList);
    }

    protected void doSetCardStatus_NotInScope(Collection<String> cardStatusList) {
        regINS(CK_NINS, cTL(cardStatusList), xgetCValueCardStatus(), "CARD_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_STATUS: {varchar(30)} <br>
     * <pre>e.g. setCardStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cardStatus The value of cardStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardStatus_LikeSearch(String cardStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cardStatus), xgetCValueCardStatus(), "CARD_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_STATUS: {varchar(30)}
     * @param cardStatus The value of cardStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCardStatus_NotLikeSearch(String cardStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cardStatus), xgetCValueCardStatus(), "CARD_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_STATUS: {varchar(30)}
     * @param cardStatus The value of cardStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardStatus_PrefixSearch(String cardStatus) {
        setCardStatus_LikeSearch(cardStatus, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARD_STATUS: {varchar(30)}
     */
    public void setCardStatus_IsNull() { regCardStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARD_STATUS: {varchar(30)}
     */
    public void setCardStatus_IsNullOrEmpty() { regCardStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARD_STATUS: {varchar(30)}
     */
    public void setCardStatus_IsNotNull() { regCardStatus(CK_ISNN, DOBJ); }

    protected void regCardStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCardStatus(), "CARD_STATUS"); }
    protected abstract ConditionValue xgetCValueCardStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_DT: {varchar(30)}
     * @param paymentDt The value of paymentDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentDt_Equal(String paymentDt) {
        doSetPaymentDt_Equal(fRES(paymentDt));
    }

    protected void doSetPaymentDt_Equal(String paymentDt) {
        regPaymentDt(CK_EQ, paymentDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_DT: {varchar(30)}
     * @param paymentDt The value of paymentDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentDt_NotEqual(String paymentDt) {
        doSetPaymentDt_NotEqual(fRES(paymentDt));
    }

    protected void doSetPaymentDt_NotEqual(String paymentDt) {
        regPaymentDt(CK_NES, paymentDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_DT: {varchar(30)}
     * @param paymentDt The value of paymentDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentDt_GreaterThan(String paymentDt) {
        regPaymentDt(CK_GT, fRES(paymentDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_DT: {varchar(30)}
     * @param paymentDt The value of paymentDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentDt_LessThan(String paymentDt) {
        regPaymentDt(CK_LT, fRES(paymentDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_DT: {varchar(30)}
     * @param paymentDt The value of paymentDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentDt_GreaterEqual(String paymentDt) {
        regPaymentDt(CK_GE, fRES(paymentDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_DT: {varchar(30)}
     * @param paymentDt The value of paymentDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentDt_LessEqual(String paymentDt) {
        regPaymentDt(CK_LE, fRES(paymentDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_DT: {varchar(30)}
     * @param paymentDtList The collection of paymentDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentDt_InScope(Collection<String> paymentDtList) {
        doSetPaymentDt_InScope(paymentDtList);
    }

    protected void doSetPaymentDt_InScope(Collection<String> paymentDtList) {
        regINS(CK_INS, cTL(paymentDtList), xgetCValuePaymentDt(), "PAYMENT_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_DT: {varchar(30)}
     * @param paymentDtList The collection of paymentDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentDt_NotInScope(Collection<String> paymentDtList) {
        doSetPaymentDt_NotInScope(paymentDtList);
    }

    protected void doSetPaymentDt_NotInScope(Collection<String> paymentDtList) {
        regINS(CK_NINS, cTL(paymentDtList), xgetCValuePaymentDt(), "PAYMENT_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_DT: {varchar(30)} <br>
     * <pre>e.g. setPaymentDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param paymentDt The value of paymentDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPaymentDt_LikeSearch(String paymentDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(paymentDt), xgetCValuePaymentDt(), "PAYMENT_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_DT: {varchar(30)}
     * @param paymentDt The value of paymentDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPaymentDt_NotLikeSearch(String paymentDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(paymentDt), xgetCValuePaymentDt(), "PAYMENT_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_DT: {varchar(30)}
     * @param paymentDt The value of paymentDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentDt_PrefixSearch(String paymentDt) {
        setPaymentDt_LikeSearch(paymentDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAYMENT_DT: {varchar(30)}
     */
    public void setPaymentDt_IsNull() { regPaymentDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAYMENT_DT: {varchar(30)}
     */
    public void setPaymentDt_IsNullOrEmpty() { regPaymentDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAYMENT_DT: {varchar(30)}
     */
    public void setPaymentDt_IsNotNull() { regPaymentDt(CK_ISNN, DOBJ); }

    protected void regPaymentDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentDt(), "PAYMENT_DT"); }
    protected abstract ConditionValue xgetCValuePaymentDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {varchar(30)}
     * @param shippingDt The value of shippingDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_Equal(String shippingDt) {
        doSetShippingDt_Equal(fRES(shippingDt));
    }

    protected void doSetShippingDt_Equal(String shippingDt) {
        regShippingDt(CK_EQ, shippingDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {varchar(30)}
     * @param shippingDt The value of shippingDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_NotEqual(String shippingDt) {
        doSetShippingDt_NotEqual(fRES(shippingDt));
    }

    protected void doSetShippingDt_NotEqual(String shippingDt) {
        regShippingDt(CK_NES, shippingDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {varchar(30)}
     * @param shippingDt The value of shippingDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterThan(String shippingDt) {
        regShippingDt(CK_GT, fRES(shippingDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {varchar(30)}
     * @param shippingDt The value of shippingDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessThan(String shippingDt) {
        regShippingDt(CK_LT, fRES(shippingDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {varchar(30)}
     * @param shippingDt The value of shippingDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterEqual(String shippingDt) {
        regShippingDt(CK_GE, fRES(shippingDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {varchar(30)}
     * @param shippingDt The value of shippingDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessEqual(String shippingDt) {
        regShippingDt(CK_LE, fRES(shippingDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {varchar(30)}
     * @param shippingDtList The collection of shippingDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_InScope(Collection<String> shippingDtList) {
        doSetShippingDt_InScope(shippingDtList);
    }

    protected void doSetShippingDt_InScope(Collection<String> shippingDtList) {
        regINS(CK_INS, cTL(shippingDtList), xgetCValueShippingDt(), "SHIPPING_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {varchar(30)}
     * @param shippingDtList The collection of shippingDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_NotInScope(Collection<String> shippingDtList) {
        doSetShippingDt_NotInScope(shippingDtList);
    }

    protected void doSetShippingDt_NotInScope(Collection<String> shippingDtList) {
        regINS(CK_NINS, cTL(shippingDtList), xgetCValueShippingDt(), "SHIPPING_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {varchar(30)} <br>
     * <pre>e.g. setShippingDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingDt The value of shippingDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingDt_LikeSearch(String shippingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingDt), xgetCValueShippingDt(), "SHIPPING_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {varchar(30)}
     * @param shippingDt The value of shippingDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingDt_NotLikeSearch(String shippingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingDt), xgetCValueShippingDt(), "SHIPPING_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {varchar(30)}
     * @param shippingDt The value of shippingDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_PrefixSearch(String shippingDt) {
        setShippingDt_LikeSearch(shippingDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {varchar(30)}
     */
    public void setShippingDt_IsNull() { regShippingDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {varchar(30)}
     */
    public void setShippingDt_IsNullOrEmpty() { regShippingDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {varchar(30)}
     */
    public void setShippingDt_IsNotNull() { regShippingDt(CK_ISNN, DOBJ); }

    protected void regShippingDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingDt(), "SHIPPING_DT"); }
    protected abstract ConditionValue xgetCValueShippingDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_Equal(String delivTz) {
        doSetDelivTz_Equal(fRES(delivTz));
    }

    protected void doSetDelivTz_Equal(String delivTz) {
        regDelivTz(CK_EQ, delivTz);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotEqual(String delivTz) {
        doSetDelivTz_NotEqual(fRES(delivTz));
    }

    protected void doSetDelivTz_NotEqual(String delivTz) {
        regDelivTz(CK_NES, delivTz);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_GreaterThan(String delivTz) {
        regDelivTz(CK_GT, fRES(delivTz));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_LessThan(String delivTz) {
        regDelivTz(CK_LT, fRES(delivTz));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_GreaterEqual(String delivTz) {
        regDelivTz(CK_GE, fRES(delivTz));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_LessEqual(String delivTz) {
        regDelivTz(CK_LE, fRES(delivTz));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTzList The collection of delivTz as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_InScope(Collection<String> delivTzList) {
        doSetDelivTz_InScope(delivTzList);
    }

    protected void doSetDelivTz_InScope(Collection<String> delivTzList) {
        regINS(CK_INS, cTL(delivTzList), xgetCValueDelivTz(), "DELIV_TZ");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTzList The collection of delivTz as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotInScope(Collection<String> delivTzList) {
        doSetDelivTz_NotInScope(delivTzList);
    }

    protected void doSetDelivTz_NotInScope(Collection<String> delivTzList) {
        regINS(CK_NINS, cTL(delivTzList), xgetCValueDelivTz(), "DELIV_TZ");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {varchar(30)} <br>
     * <pre>e.g. setDelivTz_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivTz The value of delivTz as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivTz_LikeSearch(String delivTz, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivTz), xgetCValueDelivTz(), "DELIV_TZ", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivTz_NotLikeSearch(String delivTz, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivTz), xgetCValueDelivTz(), "DELIV_TZ", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     * @param delivTz The value of delivTz as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_PrefixSearch(String delivTz) {
        setDelivTz_LikeSearch(delivTz, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     */
    public void setDelivTz_IsNull() { regDelivTz(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     */
    public void setDelivTz_IsNullOrEmpty() { regDelivTz(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30)}
     */
    public void setDelivTz_IsNotNull() { regDelivTz(CK_ISNN, DOBJ); }

    protected void regDelivTz(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTz(), "DELIV_TZ"); }
    protected abstract ConditionValue xgetCValueDelivTz();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_Equal(String delivDt) {
        doSetDelivDt_Equal(fRES(delivDt));
    }

    protected void doSetDelivDt_Equal(String delivDt) {
        regDelivDt(CK_EQ, delivDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_NotEqual(String delivDt) {
        doSetDelivDt_NotEqual(fRES(delivDt));
    }

    protected void doSetDelivDt_NotEqual(String delivDt) {
        regDelivDt(CK_NES, delivDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_GreaterThan(String delivDt) {
        regDelivDt(CK_GT, fRES(delivDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_LessThan(String delivDt) {
        regDelivDt(CK_LT, fRES(delivDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_GreaterEqual(String delivDt) {
        regDelivDt(CK_GE, fRES(delivDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_LessEqual(String delivDt) {
        regDelivDt(CK_LE, fRES(delivDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDtList The collection of delivDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_InScope(Collection<String> delivDtList) {
        doSetDelivDt_InScope(delivDtList);
    }

    protected void doSetDelivDt_InScope(Collection<String> delivDtList) {
        regINS(CK_INS, cTL(delivDtList), xgetCValueDelivDt(), "DELIV_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDtList The collection of delivDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_NotInScope(Collection<String> delivDtList) {
        doSetDelivDt_NotInScope(delivDtList);
    }

    protected void doSetDelivDt_NotInScope(Collection<String> delivDtList) {
        regINS(CK_NINS, cTL(delivDtList), xgetCValueDelivDt(), "DELIV_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(30)} <br>
     * <pre>e.g. setDelivDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivDt The value of delivDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivDt_LikeSearch(String delivDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivDt), xgetCValueDelivDt(), "DELIV_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivDt_NotLikeSearch(String delivDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivDt), xgetCValueDelivDt(), "DELIV_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(30)}
     * @param delivDt The value of delivDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_PrefixSearch(String delivDt) {
        setDelivDt_LikeSearch(delivDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     */
    public void setDelivDt_IsNull() { regDelivDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     */
    public void setDelivDt_IsNullOrEmpty() { regDelivDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(30)}
     */
    public void setDelivDt_IsNotNull() { regDelivDt(CK_ISNN, DOBJ); }

    protected void regDelivDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivDt(), "DELIV_DT"); }
    protected abstract ConditionValue xgetCValueDelivDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     * @param personInCharge The value of personInCharge as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPersonInCharge_Equal(String personInCharge) {
        doSetPersonInCharge_Equal(fRES(personInCharge));
    }

    protected void doSetPersonInCharge_Equal(String personInCharge) {
        regPersonInCharge(CK_EQ, personInCharge);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     * @param personInCharge The value of personInCharge as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPersonInCharge_NotEqual(String personInCharge) {
        doSetPersonInCharge_NotEqual(fRES(personInCharge));
    }

    protected void doSetPersonInCharge_NotEqual(String personInCharge) {
        regPersonInCharge(CK_NES, personInCharge);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     * @param personInCharge The value of personInCharge as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPersonInCharge_GreaterThan(String personInCharge) {
        regPersonInCharge(CK_GT, fRES(personInCharge));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     * @param personInCharge The value of personInCharge as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPersonInCharge_LessThan(String personInCharge) {
        regPersonInCharge(CK_LT, fRES(personInCharge));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     * @param personInCharge The value of personInCharge as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPersonInCharge_GreaterEqual(String personInCharge) {
        regPersonInCharge(CK_GE, fRES(personInCharge));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     * @param personInCharge The value of personInCharge as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPersonInCharge_LessEqual(String personInCharge) {
        regPersonInCharge(CK_LE, fRES(personInCharge));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     * @param personInChargeList The collection of personInCharge as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPersonInCharge_InScope(Collection<String> personInChargeList) {
        doSetPersonInCharge_InScope(personInChargeList);
    }

    protected void doSetPersonInCharge_InScope(Collection<String> personInChargeList) {
        regINS(CK_INS, cTL(personInChargeList), xgetCValuePersonInCharge(), "PERSON_IN_CHARGE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     * @param personInChargeList The collection of personInCharge as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPersonInCharge_NotInScope(Collection<String> personInChargeList) {
        doSetPersonInCharge_NotInScope(personInChargeList);
    }

    protected void doSetPersonInCharge_NotInScope(Collection<String> personInChargeList) {
        regINS(CK_NINS, cTL(personInChargeList), xgetCValuePersonInCharge(), "PERSON_IN_CHARGE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PERSON_IN_CHARGE: {varchar(30)} <br>
     * <pre>e.g. setPersonInCharge_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param personInCharge The value of personInCharge as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPersonInCharge_LikeSearch(String personInCharge, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(personInCharge), xgetCValuePersonInCharge(), "PERSON_IN_CHARGE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     * @param personInCharge The value of personInCharge as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPersonInCharge_NotLikeSearch(String personInCharge, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(personInCharge), xgetCValuePersonInCharge(), "PERSON_IN_CHARGE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     * @param personInCharge The value of personInCharge as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPersonInCharge_PrefixSearch(String personInCharge) {
        setPersonInCharge_LikeSearch(personInCharge, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     */
    public void setPersonInCharge_IsNull() { regPersonInCharge(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     */
    public void setPersonInCharge_IsNullOrEmpty() { regPersonInCharge(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PERSON_IN_CHARGE: {varchar(30)}
     */
    public void setPersonInCharge_IsNotNull() { regPersonInCharge(CK_ISNN, DOBJ); }

    protected void regPersonInCharge(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePersonInCharge(), "PERSON_IN_CHARGE"); }
    protected abstract ConditionValue xgetCValuePersonInCharge();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SINGLE_MEMO: {varchar(255)}
     * @param singleMemo The value of singleMemo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSingleMemo_Equal(String singleMemo) {
        doSetSingleMemo_Equal(fRES(singleMemo));
    }

    protected void doSetSingleMemo_Equal(String singleMemo) {
        regSingleMemo(CK_EQ, singleMemo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SINGLE_MEMO: {varchar(255)}
     * @param singleMemo The value of singleMemo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSingleMemo_NotEqual(String singleMemo) {
        doSetSingleMemo_NotEqual(fRES(singleMemo));
    }

    protected void doSetSingleMemo_NotEqual(String singleMemo) {
        regSingleMemo(CK_NES, singleMemo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SINGLE_MEMO: {varchar(255)}
     * @param singleMemo The value of singleMemo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSingleMemo_GreaterThan(String singleMemo) {
        regSingleMemo(CK_GT, fRES(singleMemo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SINGLE_MEMO: {varchar(255)}
     * @param singleMemo The value of singleMemo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSingleMemo_LessThan(String singleMemo) {
        regSingleMemo(CK_LT, fRES(singleMemo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SINGLE_MEMO: {varchar(255)}
     * @param singleMemo The value of singleMemo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSingleMemo_GreaterEqual(String singleMemo) {
        regSingleMemo(CK_GE, fRES(singleMemo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SINGLE_MEMO: {varchar(255)}
     * @param singleMemo The value of singleMemo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSingleMemo_LessEqual(String singleMemo) {
        regSingleMemo(CK_LE, fRES(singleMemo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SINGLE_MEMO: {varchar(255)}
     * @param singleMemoList The collection of singleMemo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSingleMemo_InScope(Collection<String> singleMemoList) {
        doSetSingleMemo_InScope(singleMemoList);
    }

    protected void doSetSingleMemo_InScope(Collection<String> singleMemoList) {
        regINS(CK_INS, cTL(singleMemoList), xgetCValueSingleMemo(), "SINGLE_MEMO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SINGLE_MEMO: {varchar(255)}
     * @param singleMemoList The collection of singleMemo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSingleMemo_NotInScope(Collection<String> singleMemoList) {
        doSetSingleMemo_NotInScope(singleMemoList);
    }

    protected void doSetSingleMemo_NotInScope(Collection<String> singleMemoList) {
        regINS(CK_NINS, cTL(singleMemoList), xgetCValueSingleMemo(), "SINGLE_MEMO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SINGLE_MEMO: {varchar(255)} <br>
     * <pre>e.g. setSingleMemo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param singleMemo The value of singleMemo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSingleMemo_LikeSearch(String singleMemo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(singleMemo), xgetCValueSingleMemo(), "SINGLE_MEMO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SINGLE_MEMO: {varchar(255)}
     * @param singleMemo The value of singleMemo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSingleMemo_NotLikeSearch(String singleMemo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(singleMemo), xgetCValueSingleMemo(), "SINGLE_MEMO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SINGLE_MEMO: {varchar(255)}
     * @param singleMemo The value of singleMemo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSingleMemo_PrefixSearch(String singleMemo) {
        setSingleMemo_LikeSearch(singleMemo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SINGLE_MEMO: {varchar(255)}
     */
    public void setSingleMemo_IsNull() { regSingleMemo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SINGLE_MEMO: {varchar(255)}
     */
    public void setSingleMemo_IsNullOrEmpty() { regSingleMemo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SINGLE_MEMO: {varchar(255)}
     */
    public void setSingleMemo_IsNotNull() { regSingleMemo(CK_ISNN, DOBJ); }

    protected void regSingleMemo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSingleMemo(), "SINGLE_MEMO"); }
    protected abstract ConditionValue xgetCValueSingleMemo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_INPUT: {varchar(255)}
     * @param mailInput The value of mailInput as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailInput_Equal(String mailInput) {
        doSetMailInput_Equal(fRES(mailInput));
    }

    protected void doSetMailInput_Equal(String mailInput) {
        regMailInput(CK_EQ, mailInput);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_INPUT: {varchar(255)}
     * @param mailInput The value of mailInput as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailInput_NotEqual(String mailInput) {
        doSetMailInput_NotEqual(fRES(mailInput));
    }

    protected void doSetMailInput_NotEqual(String mailInput) {
        regMailInput(CK_NES, mailInput);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_INPUT: {varchar(255)}
     * @param mailInput The value of mailInput as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailInput_GreaterThan(String mailInput) {
        regMailInput(CK_GT, fRES(mailInput));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_INPUT: {varchar(255)}
     * @param mailInput The value of mailInput as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailInput_LessThan(String mailInput) {
        regMailInput(CK_LT, fRES(mailInput));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_INPUT: {varchar(255)}
     * @param mailInput The value of mailInput as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailInput_GreaterEqual(String mailInput) {
        regMailInput(CK_GE, fRES(mailInput));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_INPUT: {varchar(255)}
     * @param mailInput The value of mailInput as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailInput_LessEqual(String mailInput) {
        regMailInput(CK_LE, fRES(mailInput));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAIL_INPUT: {varchar(255)}
     * @param mailInputList The collection of mailInput as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailInput_InScope(Collection<String> mailInputList) {
        doSetMailInput_InScope(mailInputList);
    }

    protected void doSetMailInput_InScope(Collection<String> mailInputList) {
        regINS(CK_INS, cTL(mailInputList), xgetCValueMailInput(), "MAIL_INPUT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAIL_INPUT: {varchar(255)}
     * @param mailInputList The collection of mailInput as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailInput_NotInScope(Collection<String> mailInputList) {
        doSetMailInput_NotInScope(mailInputList);
    }

    protected void doSetMailInput_NotInScope(Collection<String> mailInputList) {
        regINS(CK_NINS, cTL(mailInputList), xgetCValueMailInput(), "MAIL_INPUT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_INPUT: {varchar(255)} <br>
     * <pre>e.g. setMailInput_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mailInput The value of mailInput as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMailInput_LikeSearch(String mailInput, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mailInput), xgetCValueMailInput(), "MAIL_INPUT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_INPUT: {varchar(255)}
     * @param mailInput The value of mailInput as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMailInput_NotLikeSearch(String mailInput, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mailInput), xgetCValueMailInput(), "MAIL_INPUT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_INPUT: {varchar(255)}
     * @param mailInput The value of mailInput as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailInput_PrefixSearch(String mailInput) {
        setMailInput_LikeSearch(mailInput, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAIL_INPUT: {varchar(255)}
     */
    public void setMailInput_IsNull() { regMailInput(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAIL_INPUT: {varchar(255)}
     */
    public void setMailInput_IsNullOrEmpty() { regMailInput(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAIL_INPUT: {varchar(255)}
     */
    public void setMailInput_IsNotNull() { regMailInput(CK_ISNN, DOBJ); }

    protected void regMailInput(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMailInput(), "MAIL_INPUT"); }
    protected abstract ConditionValue xgetCValueMailInput();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_PAYMENT: {bigint(19)}
     * @param firstPayment The value of firstPayment as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstPayment_Equal(Long firstPayment) {
        doSetFirstPayment_Equal(firstPayment);
    }

    protected void doSetFirstPayment_Equal(Long firstPayment) {
        regFirstPayment(CK_EQ, firstPayment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_PAYMENT: {bigint(19)}
     * @param firstPayment The value of firstPayment as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstPayment_NotEqual(Long firstPayment) {
        doSetFirstPayment_NotEqual(firstPayment);
    }

    protected void doSetFirstPayment_NotEqual(Long firstPayment) {
        regFirstPayment(CK_NES, firstPayment);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_PAYMENT: {bigint(19)}
     * @param firstPayment The value of firstPayment as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstPayment_GreaterThan(Long firstPayment) {
        regFirstPayment(CK_GT, firstPayment);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_PAYMENT: {bigint(19)}
     * @param firstPayment The value of firstPayment as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstPayment_LessThan(Long firstPayment) {
        regFirstPayment(CK_LT, firstPayment);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_PAYMENT: {bigint(19)}
     * @param firstPayment The value of firstPayment as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstPayment_GreaterEqual(Long firstPayment) {
        regFirstPayment(CK_GE, firstPayment);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_PAYMENT: {bigint(19)}
     * @param firstPayment The value of firstPayment as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstPayment_LessEqual(Long firstPayment) {
        regFirstPayment(CK_LE, firstPayment);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_PAYMENT: {bigint(19)}
     * @param minNumber The min number of firstPayment. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of firstPayment. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFirstPayment_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFirstPayment(), "FIRST_PAYMENT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FIRST_PAYMENT: {bigint(19)}
     * @param firstPaymentList The collection of firstPayment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstPayment_InScope(Collection<Long> firstPaymentList) {
        doSetFirstPayment_InScope(firstPaymentList);
    }

    protected void doSetFirstPayment_InScope(Collection<Long> firstPaymentList) {
        regINS(CK_INS, cTL(firstPaymentList), xgetCValueFirstPayment(), "FIRST_PAYMENT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FIRST_PAYMENT: {bigint(19)}
     * @param firstPaymentList The collection of firstPayment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstPayment_NotInScope(Collection<Long> firstPaymentList) {
        doSetFirstPayment_NotInScope(firstPaymentList);
    }

    protected void doSetFirstPayment_NotInScope(Collection<Long> firstPaymentList) {
        regINS(CK_NINS, cTL(firstPaymentList), xgetCValueFirstPayment(), "FIRST_PAYMENT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRST_PAYMENT: {bigint(19)}
     */
    public void setFirstPayment_IsNull() { regFirstPayment(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRST_PAYMENT: {bigint(19)}
     */
    public void setFirstPayment_IsNotNull() { regFirstPayment(CK_ISNN, DOBJ); }

    protected void regFirstPayment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstPayment(), "FIRST_PAYMENT"); }
    protected abstract ConditionValue xgetCValueFirstPayment();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL: {varchar(100)}
     * @param terminal The value of terminal as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminal_Equal(String terminal) {
        doSetTerminal_Equal(fRES(terminal));
    }

    protected void doSetTerminal_Equal(String terminal) {
        regTerminal(CK_EQ, terminal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL: {varchar(100)}
     * @param terminal The value of terminal as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminal_NotEqual(String terminal) {
        doSetTerminal_NotEqual(fRES(terminal));
    }

    protected void doSetTerminal_NotEqual(String terminal) {
        regTerminal(CK_NES, terminal);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL: {varchar(100)}
     * @param terminal The value of terminal as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminal_GreaterThan(String terminal) {
        regTerminal(CK_GT, fRES(terminal));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL: {varchar(100)}
     * @param terminal The value of terminal as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminal_LessThan(String terminal) {
        regTerminal(CK_LT, fRES(terminal));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL: {varchar(100)}
     * @param terminal The value of terminal as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminal_GreaterEqual(String terminal) {
        regTerminal(CK_GE, fRES(terminal));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMINAL: {varchar(100)}
     * @param terminal The value of terminal as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminal_LessEqual(String terminal) {
        regTerminal(CK_LE, fRES(terminal));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TERMINAL: {varchar(100)}
     * @param terminalList The collection of terminal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminal_InScope(Collection<String> terminalList) {
        doSetTerminal_InScope(terminalList);
    }

    protected void doSetTerminal_InScope(Collection<String> terminalList) {
        regINS(CK_INS, cTL(terminalList), xgetCValueTerminal(), "TERMINAL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TERMINAL: {varchar(100)}
     * @param terminalList The collection of terminal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminal_NotInScope(Collection<String> terminalList) {
        doSetTerminal_NotInScope(terminalList);
    }

    protected void doSetTerminal_NotInScope(Collection<String> terminalList) {
        regINS(CK_NINS, cTL(terminalList), xgetCValueTerminal(), "TERMINAL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL: {varchar(100)} <br>
     * <pre>e.g. setTerminal_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param terminal The value of terminal as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTerminal_LikeSearch(String terminal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(terminal), xgetCValueTerminal(), "TERMINAL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL: {varchar(100)}
     * @param terminal The value of terminal as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTerminal_NotLikeSearch(String terminal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(terminal), xgetCValueTerminal(), "TERMINAL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMINAL: {varchar(100)}
     * @param terminal The value of terminal as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTerminal_PrefixSearch(String terminal) {
        setTerminal_LikeSearch(terminal, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TERMINAL: {varchar(100)}
     */
    public void setTerminal_IsNull() { regTerminal(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TERMINAL: {varchar(100)}
     */
    public void setTerminal_IsNullOrEmpty() { regTerminal(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TERMINAL: {varchar(100)}
     */
    public void setTerminal_IsNotNull() { regTerminal(CK_ISNN, DOBJ); }

    protected void regTerminal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTerminal(), "TERMINAL"); }
    protected abstract ConditionValue xgetCValueTerminal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     * @param mailCarrierCd The value of mailCarrierCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailCarrierCd_Equal(String mailCarrierCd) {
        doSetMailCarrierCd_Equal(fRES(mailCarrierCd));
    }

    protected void doSetMailCarrierCd_Equal(String mailCarrierCd) {
        regMailCarrierCd(CK_EQ, mailCarrierCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     * @param mailCarrierCd The value of mailCarrierCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailCarrierCd_NotEqual(String mailCarrierCd) {
        doSetMailCarrierCd_NotEqual(fRES(mailCarrierCd));
    }

    protected void doSetMailCarrierCd_NotEqual(String mailCarrierCd) {
        regMailCarrierCd(CK_NES, mailCarrierCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     * @param mailCarrierCd The value of mailCarrierCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailCarrierCd_GreaterThan(String mailCarrierCd) {
        regMailCarrierCd(CK_GT, fRES(mailCarrierCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     * @param mailCarrierCd The value of mailCarrierCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailCarrierCd_LessThan(String mailCarrierCd) {
        regMailCarrierCd(CK_LT, fRES(mailCarrierCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     * @param mailCarrierCd The value of mailCarrierCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailCarrierCd_GreaterEqual(String mailCarrierCd) {
        regMailCarrierCd(CK_GE, fRES(mailCarrierCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     * @param mailCarrierCd The value of mailCarrierCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailCarrierCd_LessEqual(String mailCarrierCd) {
        regMailCarrierCd(CK_LE, fRES(mailCarrierCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     * @param mailCarrierCdList The collection of mailCarrierCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailCarrierCd_InScope(Collection<String> mailCarrierCdList) {
        doSetMailCarrierCd_InScope(mailCarrierCdList);
    }

    protected void doSetMailCarrierCd_InScope(Collection<String> mailCarrierCdList) {
        regINS(CK_INS, cTL(mailCarrierCdList), xgetCValueMailCarrierCd(), "MAIL_CARRIER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     * @param mailCarrierCdList The collection of mailCarrierCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailCarrierCd_NotInScope(Collection<String> mailCarrierCdList) {
        doSetMailCarrierCd_NotInScope(mailCarrierCdList);
    }

    protected void doSetMailCarrierCd_NotInScope(Collection<String> mailCarrierCdList) {
        regINS(CK_NINS, cTL(mailCarrierCdList), xgetCValueMailCarrierCd(), "MAIL_CARRIER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_CARRIER_CD: {varchar(30)} <br>
     * <pre>e.g. setMailCarrierCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mailCarrierCd The value of mailCarrierCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMailCarrierCd_LikeSearch(String mailCarrierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mailCarrierCd), xgetCValueMailCarrierCd(), "MAIL_CARRIER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     * @param mailCarrierCd The value of mailCarrierCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMailCarrierCd_NotLikeSearch(String mailCarrierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mailCarrierCd), xgetCValueMailCarrierCd(), "MAIL_CARRIER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     * @param mailCarrierCd The value of mailCarrierCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailCarrierCd_PrefixSearch(String mailCarrierCd) {
        setMailCarrierCd_LikeSearch(mailCarrierCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     */
    public void setMailCarrierCd_IsNull() { regMailCarrierCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     */
    public void setMailCarrierCd_IsNullOrEmpty() { regMailCarrierCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAIL_CARRIER_CD: {varchar(30)}
     */
    public void setMailCarrierCd_IsNotNull() { regMailCarrierCd(CK_ISNN, DOBJ); }

    protected void regMailCarrierCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMailCarrierCd(), "MAIL_CARRIER_CD"); }
    protected abstract ConditionValue xgetCValueMailCarrierCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_FLG: {char(1)}
     * @param giftFlg The value of giftFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_Equal(String giftFlg) {
        doSetGiftFlg_Equal(fRES(giftFlg));
    }

    protected void doSetGiftFlg_Equal(String giftFlg) {
        regGiftFlg(CK_EQ, giftFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_FLG: {char(1)}
     * @param giftFlg The value of giftFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_NotEqual(String giftFlg) {
        doSetGiftFlg_NotEqual(fRES(giftFlg));
    }

    protected void doSetGiftFlg_NotEqual(String giftFlg) {
        regGiftFlg(CK_NES, giftFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_FLG: {char(1)}
     * @param giftFlg The value of giftFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_GreaterThan(String giftFlg) {
        regGiftFlg(CK_GT, fRES(giftFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_FLG: {char(1)}
     * @param giftFlg The value of giftFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_LessThan(String giftFlg) {
        regGiftFlg(CK_LT, fRES(giftFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_FLG: {char(1)}
     * @param giftFlg The value of giftFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_GreaterEqual(String giftFlg) {
        regGiftFlg(CK_GE, fRES(giftFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GIFT_FLG: {char(1)}
     * @param giftFlg The value of giftFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_LessEqual(String giftFlg) {
        regGiftFlg(CK_LE, fRES(giftFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_FLG: {char(1)}
     * @param giftFlgList The collection of giftFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_InScope(Collection<String> giftFlgList) {
        doSetGiftFlg_InScope(giftFlgList);
    }

    protected void doSetGiftFlg_InScope(Collection<String> giftFlgList) {
        regINS(CK_INS, cTL(giftFlgList), xgetCValueGiftFlg(), "GIFT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GIFT_FLG: {char(1)}
     * @param giftFlgList The collection of giftFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_NotInScope(Collection<String> giftFlgList) {
        doSetGiftFlg_NotInScope(giftFlgList);
    }

    protected void doSetGiftFlg_NotInScope(Collection<String> giftFlgList) {
        regINS(CK_NINS, cTL(giftFlgList), xgetCValueGiftFlg(), "GIFT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_FLG: {char(1)} <br>
     * <pre>e.g. setGiftFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param giftFlg The value of giftFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGiftFlg_LikeSearch(String giftFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(giftFlg), xgetCValueGiftFlg(), "GIFT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_FLG: {char(1)}
     * @param giftFlg The value of giftFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGiftFlg_NotLikeSearch(String giftFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(giftFlg), xgetCValueGiftFlg(), "GIFT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GIFT_FLG: {char(1)}
     * @param giftFlg The value of giftFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGiftFlg_PrefixSearch(String giftFlg) {
        setGiftFlg_LikeSearch(giftFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GIFT_FLG: {char(1)}
     */
    public void setGiftFlg_IsNull() { regGiftFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GIFT_FLG: {char(1)}
     */
    public void setGiftFlg_IsNotNull() { regGiftFlg(CK_ISNN, DOBJ); }

    protected void regGiftFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGiftFlg(), "GIFT_FLG"); }
    protected abstract ConditionValue xgetCValueGiftFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     * @param rakutenOrderComment The value of rakutenOrderComment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRakutenOrderComment_Equal(String rakutenOrderComment) {
        doSetRakutenOrderComment_Equal(fRES(rakutenOrderComment));
    }

    protected void doSetRakutenOrderComment_Equal(String rakutenOrderComment) {
        regRakutenOrderComment(CK_EQ, rakutenOrderComment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     * @param rakutenOrderComment The value of rakutenOrderComment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRakutenOrderComment_NotEqual(String rakutenOrderComment) {
        doSetRakutenOrderComment_NotEqual(fRES(rakutenOrderComment));
    }

    protected void doSetRakutenOrderComment_NotEqual(String rakutenOrderComment) {
        regRakutenOrderComment(CK_NES, rakutenOrderComment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     * @param rakutenOrderComment The value of rakutenOrderComment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRakutenOrderComment_GreaterThan(String rakutenOrderComment) {
        regRakutenOrderComment(CK_GT, fRES(rakutenOrderComment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     * @param rakutenOrderComment The value of rakutenOrderComment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRakutenOrderComment_LessThan(String rakutenOrderComment) {
        regRakutenOrderComment(CK_LT, fRES(rakutenOrderComment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     * @param rakutenOrderComment The value of rakutenOrderComment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRakutenOrderComment_GreaterEqual(String rakutenOrderComment) {
        regRakutenOrderComment(CK_GE, fRES(rakutenOrderComment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     * @param rakutenOrderComment The value of rakutenOrderComment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRakutenOrderComment_LessEqual(String rakutenOrderComment) {
        regRakutenOrderComment(CK_LE, fRES(rakutenOrderComment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     * @param rakutenOrderCommentList The collection of rakutenOrderComment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRakutenOrderComment_InScope(Collection<String> rakutenOrderCommentList) {
        doSetRakutenOrderComment_InScope(rakutenOrderCommentList);
    }

    protected void doSetRakutenOrderComment_InScope(Collection<String> rakutenOrderCommentList) {
        regINS(CK_INS, cTL(rakutenOrderCommentList), xgetCValueRakutenOrderComment(), "RAKUTEN_ORDER_COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     * @param rakutenOrderCommentList The collection of rakutenOrderComment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRakutenOrderComment_NotInScope(Collection<String> rakutenOrderCommentList) {
        doSetRakutenOrderComment_NotInScope(rakutenOrderCommentList);
    }

    protected void doSetRakutenOrderComment_NotInScope(Collection<String> rakutenOrderCommentList) {
        regINS(CK_NINS, cTL(rakutenOrderCommentList), xgetCValueRakutenOrderComment(), "RAKUTEN_ORDER_COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)} <br>
     * <pre>e.g. setRakutenOrderComment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rakutenOrderComment The value of rakutenOrderComment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRakutenOrderComment_LikeSearch(String rakutenOrderComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rakutenOrderComment), xgetCValueRakutenOrderComment(), "RAKUTEN_ORDER_COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     * @param rakutenOrderComment The value of rakutenOrderComment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRakutenOrderComment_NotLikeSearch(String rakutenOrderComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rakutenOrderComment), xgetCValueRakutenOrderComment(), "RAKUTEN_ORDER_COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     * @param rakutenOrderComment The value of rakutenOrderComment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRakutenOrderComment_PrefixSearch(String rakutenOrderComment) {
        setRakutenOrderComment_LikeSearch(rakutenOrderComment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     */
    public void setRakutenOrderComment_IsNull() { regRakutenOrderComment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     */
    public void setRakutenOrderComment_IsNullOrEmpty() { regRakutenOrderComment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     */
    public void setRakutenOrderComment_IsNotNull() { regRakutenOrderComment(CK_ISNN, DOBJ); }

    protected void regRakutenOrderComment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRakutenOrderComment(), "RAKUTEN_ORDER_COMMENT"); }
    protected abstract ConditionValue xgetCValueRakutenOrderComment();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATETIME: {varchar(30)}
     * @param orderDatetime The value of orderDatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDatetime_Equal(String orderDatetime) {
        doSetOrderDatetime_Equal(fRES(orderDatetime));
    }

    protected void doSetOrderDatetime_Equal(String orderDatetime) {
        regOrderDatetime(CK_EQ, orderDatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATETIME: {varchar(30)}
     * @param orderDatetime The value of orderDatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDatetime_NotEqual(String orderDatetime) {
        doSetOrderDatetime_NotEqual(fRES(orderDatetime));
    }

    protected void doSetOrderDatetime_NotEqual(String orderDatetime) {
        regOrderDatetime(CK_NES, orderDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATETIME: {varchar(30)}
     * @param orderDatetime The value of orderDatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDatetime_GreaterThan(String orderDatetime) {
        regOrderDatetime(CK_GT, fRES(orderDatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATETIME: {varchar(30)}
     * @param orderDatetime The value of orderDatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDatetime_LessThan(String orderDatetime) {
        regOrderDatetime(CK_LT, fRES(orderDatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATETIME: {varchar(30)}
     * @param orderDatetime The value of orderDatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDatetime_GreaterEqual(String orderDatetime) {
        regOrderDatetime(CK_GE, fRES(orderDatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATETIME: {varchar(30)}
     * @param orderDatetime The value of orderDatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDatetime_LessEqual(String orderDatetime) {
        regOrderDatetime(CK_LE, fRES(orderDatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DATETIME: {varchar(30)}
     * @param orderDatetimeList The collection of orderDatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDatetime_InScope(Collection<String> orderDatetimeList) {
        doSetOrderDatetime_InScope(orderDatetimeList);
    }

    protected void doSetOrderDatetime_InScope(Collection<String> orderDatetimeList) {
        regINS(CK_INS, cTL(orderDatetimeList), xgetCValueOrderDatetime(), "ORDER_DATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DATETIME: {varchar(30)}
     * @param orderDatetimeList The collection of orderDatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDatetime_NotInScope(Collection<String> orderDatetimeList) {
        doSetOrderDatetime_NotInScope(orderDatetimeList);
    }

    protected void doSetOrderDatetime_NotInScope(Collection<String> orderDatetimeList) {
        regINS(CK_NINS, cTL(orderDatetimeList), xgetCValueOrderDatetime(), "ORDER_DATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATETIME: {varchar(30)} <br>
     * <pre>e.g. setOrderDatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderDatetime The value of orderDatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderDatetime_LikeSearch(String orderDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderDatetime), xgetCValueOrderDatetime(), "ORDER_DATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATETIME: {varchar(30)}
     * @param orderDatetime The value of orderDatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderDatetime_NotLikeSearch(String orderDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderDatetime), xgetCValueOrderDatetime(), "ORDER_DATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATETIME: {varchar(30)}
     * @param orderDatetime The value of orderDatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDatetime_PrefixSearch(String orderDatetime) {
        setOrderDatetime_LikeSearch(orderDatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_DATETIME: {varchar(30)}
     */
    public void setOrderDatetime_IsNull() { regOrderDatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_DATETIME: {varchar(30)}
     */
    public void setOrderDatetime_IsNullOrEmpty() { regOrderDatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_DATETIME: {varchar(30)}
     */
    public void setOrderDatetime_IsNotNull() { regOrderDatetime(CK_ISNN, DOBJ); }

    protected void regOrderDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderDatetime(), "ORDER_DATETIME"); }
    protected abstract ConditionValue xgetCValueOrderDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MULTI_DELIV_FLG: {char(1)}
     * @param multiDelivFlg The value of multiDelivFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiDelivFlg_Equal(String multiDelivFlg) {
        doSetMultiDelivFlg_Equal(fRES(multiDelivFlg));
    }

    protected void doSetMultiDelivFlg_Equal(String multiDelivFlg) {
        regMultiDelivFlg(CK_EQ, multiDelivFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MULTI_DELIV_FLG: {char(1)}
     * @param multiDelivFlg The value of multiDelivFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiDelivFlg_NotEqual(String multiDelivFlg) {
        doSetMultiDelivFlg_NotEqual(fRES(multiDelivFlg));
    }

    protected void doSetMultiDelivFlg_NotEqual(String multiDelivFlg) {
        regMultiDelivFlg(CK_NES, multiDelivFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MULTI_DELIV_FLG: {char(1)}
     * @param multiDelivFlg The value of multiDelivFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiDelivFlg_GreaterThan(String multiDelivFlg) {
        regMultiDelivFlg(CK_GT, fRES(multiDelivFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MULTI_DELIV_FLG: {char(1)}
     * @param multiDelivFlg The value of multiDelivFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiDelivFlg_LessThan(String multiDelivFlg) {
        regMultiDelivFlg(CK_LT, fRES(multiDelivFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MULTI_DELIV_FLG: {char(1)}
     * @param multiDelivFlg The value of multiDelivFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiDelivFlg_GreaterEqual(String multiDelivFlg) {
        regMultiDelivFlg(CK_GE, fRES(multiDelivFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MULTI_DELIV_FLG: {char(1)}
     * @param multiDelivFlg The value of multiDelivFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiDelivFlg_LessEqual(String multiDelivFlg) {
        regMultiDelivFlg(CK_LE, fRES(multiDelivFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MULTI_DELIV_FLG: {char(1)}
     * @param multiDelivFlgList The collection of multiDelivFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiDelivFlg_InScope(Collection<String> multiDelivFlgList) {
        doSetMultiDelivFlg_InScope(multiDelivFlgList);
    }

    protected void doSetMultiDelivFlg_InScope(Collection<String> multiDelivFlgList) {
        regINS(CK_INS, cTL(multiDelivFlgList), xgetCValueMultiDelivFlg(), "MULTI_DELIV_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MULTI_DELIV_FLG: {char(1)}
     * @param multiDelivFlgList The collection of multiDelivFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiDelivFlg_NotInScope(Collection<String> multiDelivFlgList) {
        doSetMultiDelivFlg_NotInScope(multiDelivFlgList);
    }

    protected void doSetMultiDelivFlg_NotInScope(Collection<String> multiDelivFlgList) {
        regINS(CK_NINS, cTL(multiDelivFlgList), xgetCValueMultiDelivFlg(), "MULTI_DELIV_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MULTI_DELIV_FLG: {char(1)} <br>
     * <pre>e.g. setMultiDelivFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param multiDelivFlg The value of multiDelivFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMultiDelivFlg_LikeSearch(String multiDelivFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(multiDelivFlg), xgetCValueMultiDelivFlg(), "MULTI_DELIV_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MULTI_DELIV_FLG: {char(1)}
     * @param multiDelivFlg The value of multiDelivFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMultiDelivFlg_NotLikeSearch(String multiDelivFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(multiDelivFlg), xgetCValueMultiDelivFlg(), "MULTI_DELIV_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MULTI_DELIV_FLG: {char(1)}
     * @param multiDelivFlg The value of multiDelivFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiDelivFlg_PrefixSearch(String multiDelivFlg) {
        setMultiDelivFlg_LikeSearch(multiDelivFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MULTI_DELIV_FLG: {char(1)}
     */
    public void setMultiDelivFlg_IsNull() { regMultiDelivFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MULTI_DELIV_FLG: {char(1)}
     */
    public void setMultiDelivFlg_IsNotNull() { regMultiDelivFlg(CK_ISNN, DOBJ); }

    protected void regMultiDelivFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMultiDelivFlg(), "MULTI_DELIV_FLG"); }
    protected abstract ConditionValue xgetCValueMultiDelivFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALERT_FLG: {char(1)}
     * @param alertFlg The value of alertFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlertFlg_Equal(String alertFlg) {
        doSetAlertFlg_Equal(fRES(alertFlg));
    }

    protected void doSetAlertFlg_Equal(String alertFlg) {
        regAlertFlg(CK_EQ, alertFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALERT_FLG: {char(1)}
     * @param alertFlg The value of alertFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlertFlg_NotEqual(String alertFlg) {
        doSetAlertFlg_NotEqual(fRES(alertFlg));
    }

    protected void doSetAlertFlg_NotEqual(String alertFlg) {
        regAlertFlg(CK_NES, alertFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALERT_FLG: {char(1)}
     * @param alertFlg The value of alertFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlertFlg_GreaterThan(String alertFlg) {
        regAlertFlg(CK_GT, fRES(alertFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALERT_FLG: {char(1)}
     * @param alertFlg The value of alertFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlertFlg_LessThan(String alertFlg) {
        regAlertFlg(CK_LT, fRES(alertFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALERT_FLG: {char(1)}
     * @param alertFlg The value of alertFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlertFlg_GreaterEqual(String alertFlg) {
        regAlertFlg(CK_GE, fRES(alertFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALERT_FLG: {char(1)}
     * @param alertFlg The value of alertFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlertFlg_LessEqual(String alertFlg) {
        regAlertFlg(CK_LE, fRES(alertFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALERT_FLG: {char(1)}
     * @param alertFlgList The collection of alertFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlertFlg_InScope(Collection<String> alertFlgList) {
        doSetAlertFlg_InScope(alertFlgList);
    }

    protected void doSetAlertFlg_InScope(Collection<String> alertFlgList) {
        regINS(CK_INS, cTL(alertFlgList), xgetCValueAlertFlg(), "ALERT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALERT_FLG: {char(1)}
     * @param alertFlgList The collection of alertFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlertFlg_NotInScope(Collection<String> alertFlgList) {
        doSetAlertFlg_NotInScope(alertFlgList);
    }

    protected void doSetAlertFlg_NotInScope(Collection<String> alertFlgList) {
        regINS(CK_NINS, cTL(alertFlgList), xgetCValueAlertFlg(), "ALERT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALERT_FLG: {char(1)} <br>
     * <pre>e.g. setAlertFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param alertFlg The value of alertFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAlertFlg_LikeSearch(String alertFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(alertFlg), xgetCValueAlertFlg(), "ALERT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALERT_FLG: {char(1)}
     * @param alertFlg The value of alertFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAlertFlg_NotLikeSearch(String alertFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(alertFlg), xgetCValueAlertFlg(), "ALERT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALERT_FLG: {char(1)}
     * @param alertFlg The value of alertFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlertFlg_PrefixSearch(String alertFlg) {
        setAlertFlg_LikeSearch(alertFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALERT_FLG: {char(1)}
     */
    public void setAlertFlg_IsNull() { regAlertFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALERT_FLG: {char(1)}
     */
    public void setAlertFlg_IsNotNull() { regAlertFlg(CK_ISNN, DOBJ); }

    protected void regAlertFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAlertFlg(), "ALERT_FLG"); }
    protected abstract ConditionValue xgetCValueAlertFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_FLG: {char(1)}
     * @param memberFlg The value of memberFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberFlg_Equal(String memberFlg) {
        doSetMemberFlg_Equal(fRES(memberFlg));
    }

    protected void doSetMemberFlg_Equal(String memberFlg) {
        regMemberFlg(CK_EQ, memberFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_FLG: {char(1)}
     * @param memberFlg The value of memberFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberFlg_NotEqual(String memberFlg) {
        doSetMemberFlg_NotEqual(fRES(memberFlg));
    }

    protected void doSetMemberFlg_NotEqual(String memberFlg) {
        regMemberFlg(CK_NES, memberFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_FLG: {char(1)}
     * @param memberFlg The value of memberFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberFlg_GreaterThan(String memberFlg) {
        regMemberFlg(CK_GT, fRES(memberFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_FLG: {char(1)}
     * @param memberFlg The value of memberFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberFlg_LessThan(String memberFlg) {
        regMemberFlg(CK_LT, fRES(memberFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_FLG: {char(1)}
     * @param memberFlg The value of memberFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberFlg_GreaterEqual(String memberFlg) {
        regMemberFlg(CK_GE, fRES(memberFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_FLG: {char(1)}
     * @param memberFlg The value of memberFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberFlg_LessEqual(String memberFlg) {
        regMemberFlg(CK_LE, fRES(memberFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_FLG: {char(1)}
     * @param memberFlgList The collection of memberFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberFlg_InScope(Collection<String> memberFlgList) {
        doSetMemberFlg_InScope(memberFlgList);
    }

    protected void doSetMemberFlg_InScope(Collection<String> memberFlgList) {
        regINS(CK_INS, cTL(memberFlgList), xgetCValueMemberFlg(), "MEMBER_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_FLG: {char(1)}
     * @param memberFlgList The collection of memberFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberFlg_NotInScope(Collection<String> memberFlgList) {
        doSetMemberFlg_NotInScope(memberFlgList);
    }

    protected void doSetMemberFlg_NotInScope(Collection<String> memberFlgList) {
        regINS(CK_NINS, cTL(memberFlgList), xgetCValueMemberFlg(), "MEMBER_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_FLG: {char(1)} <br>
     * <pre>e.g. setMemberFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberFlg The value of memberFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberFlg_LikeSearch(String memberFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberFlg), xgetCValueMemberFlg(), "MEMBER_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_FLG: {char(1)}
     * @param memberFlg The value of memberFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberFlg_NotLikeSearch(String memberFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberFlg), xgetCValueMemberFlg(), "MEMBER_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_FLG: {char(1)}
     * @param memberFlg The value of memberFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberFlg_PrefixSearch(String memberFlg) {
        setMemberFlg_LikeSearch(memberFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MEMBER_FLG: {char(1)}
     */
    public void setMemberFlg_IsNull() { regMemberFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MEMBER_FLG: {char(1)}
     */
    public void setMemberFlg_IsNotNull() { regMemberFlg(CK_ISNN, DOBJ); }

    protected void regMemberFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberFlg(), "MEMBER_FLG"); }
    protected abstract ConditionValue xgetCValueMemberFlg();

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
     * TAX: {bigint(19)}
     * @param tax The value of tax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_Equal(Long tax) {
        doSetTax_Equal(tax);
    }

    protected void doSetTax_Equal(Long tax) {
        regTax(CK_EQ, tax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     * @param tax The value of tax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_NotEqual(Long tax) {
        doSetTax_NotEqual(tax);
    }

    protected void doSetTax_NotEqual(Long tax) {
        regTax(CK_NES, tax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     * @param tax The value of tax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_GreaterThan(Long tax) {
        regTax(CK_GT, tax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     * @param tax The value of tax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_LessThan(Long tax) {
        regTax(CK_LT, tax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     * @param tax The value of tax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_GreaterEqual(Long tax) {
        regTax(CK_GE, tax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     * @param tax The value of tax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTax_LessEqual(Long tax) {
        regTax(CK_LE, tax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     * @param minNumber The min number of tax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTax_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTax(), "TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAX: {bigint(19)}
     * @param taxList The collection of tax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_InScope(Collection<Long> taxList) {
        doSetTax_InScope(taxList);
    }

    protected void doSetTax_InScope(Collection<Long> taxList) {
        regINS(CK_INS, cTL(taxList), xgetCValueTax(), "TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAX: {bigint(19)}
     * @param taxList The collection of tax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTax_NotInScope(Collection<Long> taxList) {
        doSetTax_NotInScope(taxList);
    }

    protected void doSetTax_NotInScope(Collection<Long> taxList) {
        regINS(CK_NINS, cTL(taxList), xgetCValueTax(), "TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     */
    public void setTax_IsNull() { regTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAX: {bigint(19)}
     */
    public void setTax_IsNotNull() { regTax(CK_ISNN, DOBJ); }

    protected void regTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTax(), "TAX"); }
    protected abstract ConditionValue xgetCValueTax();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriage The value of carriage as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarriage_Equal(Long carriage) {
        doSetCarriage_Equal(carriage);
    }

    protected void doSetCarriage_Equal(Long carriage) {
        regCarriage(CK_EQ, carriage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriage The value of carriage as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarriage_NotEqual(Long carriage) {
        doSetCarriage_NotEqual(carriage);
    }

    protected void doSetCarriage_NotEqual(Long carriage) {
        regCarriage(CK_NES, carriage);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriage The value of carriage as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarriage_GreaterThan(Long carriage) {
        regCarriage(CK_GT, carriage);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriage The value of carriage as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarriage_LessThan(Long carriage) {
        regCarriage(CK_LT, carriage);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriage The value of carriage as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarriage_GreaterEqual(Long carriage) {
        regCarriage(CK_GE, carriage);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriage The value of carriage as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarriage_LessEqual(Long carriage) {
        regCarriage(CK_LE, carriage);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param minNumber The min number of carriage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carriage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarriage_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarriage(), "CARRIAGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriageList The collection of carriage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriage_InScope(Collection<Long> carriageList) {
        doSetCarriage_InScope(carriageList);
    }

    protected void doSetCarriage_InScope(Collection<Long> carriageList) {
        regINS(CK_INS, cTL(carriageList), xgetCValueCarriage(), "CARRIAGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIAGE: {bigint(19)}
     * @param carriageList The collection of carriage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriage_NotInScope(Collection<Long> carriageList) {
        doSetCarriage_NotInScope(carriageList);
    }

    protected void doSetCarriage_NotInScope(Collection<Long> carriageList) {
        regINS(CK_NINS, cTL(carriageList), xgetCValueCarriage(), "CARRIAGE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     */
    public void setCarriage_IsNull() { regCarriage(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIAGE: {bigint(19)}
     */
    public void setCarriage_IsNotNull() { regCarriage(CK_ISNN, DOBJ); }

    protected void regCarriage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarriage(), "CARRIAGE"); }
    protected abstract ConditionValue xgetCValueCarriage();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     * @param cod The value of cod as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_Equal(Long cod) {
        doSetCod_Equal(cod);
    }

    protected void doSetCod_Equal(Long cod) {
        regCod(CK_EQ, cod);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     * @param cod The value of cod as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_NotEqual(Long cod) {
        doSetCod_NotEqual(cod);
    }

    protected void doSetCod_NotEqual(Long cod) {
        regCod(CK_NES, cod);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     * @param cod The value of cod as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_GreaterThan(Long cod) {
        regCod(CK_GT, cod);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     * @param cod The value of cod as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_LessThan(Long cod) {
        regCod(CK_LT, cod);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     * @param cod The value of cod as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_GreaterEqual(Long cod) {
        regCod(CK_GE, cod);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     * @param cod The value of cod as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_LessEqual(Long cod) {
        regCod(CK_LE, cod);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     * @param minNumber The min number of cod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCod_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCod(), "COD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD: {bigint(19)}
     * @param codList The collection of cod as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCod_InScope(Collection<Long> codList) {
        doSetCod_InScope(codList);
    }

    protected void doSetCod_InScope(Collection<Long> codList) {
        regINS(CK_INS, cTL(codList), xgetCValueCod(), "COD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD: {bigint(19)}
     * @param codList The collection of cod as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCod_NotInScope(Collection<Long> codList) {
        doSetCod_NotInScope(codList);
    }

    protected void doSetCod_NotInScope(Collection<Long> codList) {
        regINS(CK_NINS, cTL(codList), xgetCValueCod(), "COD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     */
    public void setCod_IsNull() { regCod(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD: {bigint(19)}
     */
    public void setCod_IsNotNull() { regCod(CK_ISNN, DOBJ); }

    protected void regCod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCod(), "COD"); }
    protected abstract ConditionValue xgetCValueCod();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilled The value of amountBilled as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmountBilled_Equal(Long amountBilled) {
        doSetAmountBilled_Equal(amountBilled);
    }

    protected void doSetAmountBilled_Equal(Long amountBilled) {
        regAmountBilled(CK_EQ, amountBilled);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilled The value of amountBilled as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmountBilled_NotEqual(Long amountBilled) {
        doSetAmountBilled_NotEqual(amountBilled);
    }

    protected void doSetAmountBilled_NotEqual(Long amountBilled) {
        regAmountBilled(CK_NES, amountBilled);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilled The value of amountBilled as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmountBilled_GreaterThan(Long amountBilled) {
        regAmountBilled(CK_GT, amountBilled);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilled The value of amountBilled as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmountBilled_LessThan(Long amountBilled) {
        regAmountBilled(CK_LT, amountBilled);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilled The value of amountBilled as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmountBilled_GreaterEqual(Long amountBilled) {
        regAmountBilled(CK_GE, amountBilled);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilled The value of amountBilled as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmountBilled_LessEqual(Long amountBilled) {
        regAmountBilled(CK_LE, amountBilled);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param minNumber The min number of amountBilled. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of amountBilled. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAmountBilled_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAmountBilled(), "AMOUNT_BILLED", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilledList The collection of amountBilled as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmountBilled_InScope(Collection<Long> amountBilledList) {
        doSetAmountBilled_InScope(amountBilledList);
    }

    protected void doSetAmountBilled_InScope(Collection<Long> amountBilledList) {
        regINS(CK_INS, cTL(amountBilledList), xgetCValueAmountBilled(), "AMOUNT_BILLED");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     * @param amountBilledList The collection of amountBilled as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmountBilled_NotInScope(Collection<Long> amountBilledList) {
        doSetAmountBilled_NotInScope(amountBilledList);
    }

    protected void doSetAmountBilled_NotInScope(Collection<Long> amountBilledList) {
        regINS(CK_NINS, cTL(amountBilledList), xgetCValueAmountBilled(), "AMOUNT_BILLED");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     */
    public void setAmountBilled_IsNull() { regAmountBilled(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AMOUNT_BILLED: {bigint(19)}
     */
    public void setAmountBilled_IsNotNull() { regAmountBilled(CK_ISNN, DOBJ); }

    protected void regAmountBilled(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAmountBilled(), "AMOUNT_BILLED"); }
    protected abstract ConditionValue xgetCValueAmountBilled();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmount The value of totalAmount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_Equal(Long totalAmount) {
        doSetTotalAmount_Equal(totalAmount);
    }

    protected void doSetTotalAmount_Equal(Long totalAmount) {
        regTotalAmount(CK_EQ, totalAmount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmount The value of totalAmount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_NotEqual(Long totalAmount) {
        doSetTotalAmount_NotEqual(totalAmount);
    }

    protected void doSetTotalAmount_NotEqual(Long totalAmount) {
        regTotalAmount(CK_NES, totalAmount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmount The value of totalAmount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_GreaterThan(Long totalAmount) {
        regTotalAmount(CK_GT, totalAmount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmount The value of totalAmount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_LessThan(Long totalAmount) {
        regTotalAmount(CK_LT, totalAmount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmount The value of totalAmount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_GreaterEqual(Long totalAmount) {
        regTotalAmount(CK_GE, totalAmount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmount The value of totalAmount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalAmount_LessEqual(Long totalAmount) {
        regTotalAmount(CK_LE, totalAmount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param minNumber The min number of totalAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalAmount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalAmount(), "TOTAL_AMOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmountList The collection of totalAmount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalAmount_InScope(Collection<Long> totalAmountList) {
        doSetTotalAmount_InScope(totalAmountList);
    }

    protected void doSetTotalAmount_InScope(Collection<Long> totalAmountList) {
        regINS(CK_INS, cTL(totalAmountList), xgetCValueTotalAmount(), "TOTAL_AMOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     * @param totalAmountList The collection of totalAmount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalAmount_NotInScope(Collection<Long> totalAmountList) {
        doSetTotalAmount_NotInScope(totalAmountList);
    }

    protected void doSetTotalAmount_NotInScope(Collection<Long> totalAmountList) {
        regINS(CK_NINS, cTL(totalAmountList), xgetCValueTotalAmount(), "TOTAL_AMOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     */
    public void setTotalAmount_IsNull() { regTotalAmount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_AMOUNT: {bigint(19)}
     */
    public void setTotalAmount_IsNotNull() { regTotalAmount(CK_ISNN, DOBJ); }

    protected void regTotalAmount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalAmount(), "TOTAL_AMOUNT"); }
    protected abstract ConditionValue xgetCValueTotalAmount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMBINE_ID: {varchar(30)}
     * @param combineId The value of combineId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineId_Equal(String combineId) {
        doSetCombineId_Equal(fRES(combineId));
    }

    protected void doSetCombineId_Equal(String combineId) {
        regCombineId(CK_EQ, combineId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMBINE_ID: {varchar(30)}
     * @param combineId The value of combineId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineId_NotEqual(String combineId) {
        doSetCombineId_NotEqual(fRES(combineId));
    }

    protected void doSetCombineId_NotEqual(String combineId) {
        regCombineId(CK_NES, combineId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMBINE_ID: {varchar(30)}
     * @param combineId The value of combineId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineId_GreaterThan(String combineId) {
        regCombineId(CK_GT, fRES(combineId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMBINE_ID: {varchar(30)}
     * @param combineId The value of combineId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineId_LessThan(String combineId) {
        regCombineId(CK_LT, fRES(combineId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMBINE_ID: {varchar(30)}
     * @param combineId The value of combineId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineId_GreaterEqual(String combineId) {
        regCombineId(CK_GE, fRES(combineId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMBINE_ID: {varchar(30)}
     * @param combineId The value of combineId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineId_LessEqual(String combineId) {
        regCombineId(CK_LE, fRES(combineId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMBINE_ID: {varchar(30)}
     * @param combineIdList The collection of combineId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineId_InScope(Collection<String> combineIdList) {
        doSetCombineId_InScope(combineIdList);
    }

    protected void doSetCombineId_InScope(Collection<String> combineIdList) {
        regINS(CK_INS, cTL(combineIdList), xgetCValueCombineId(), "COMBINE_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMBINE_ID: {varchar(30)}
     * @param combineIdList The collection of combineId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineId_NotInScope(Collection<String> combineIdList) {
        doSetCombineId_NotInScope(combineIdList);
    }

    protected void doSetCombineId_NotInScope(Collection<String> combineIdList) {
        regINS(CK_NINS, cTL(combineIdList), xgetCValueCombineId(), "COMBINE_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMBINE_ID: {varchar(30)} <br>
     * <pre>e.g. setCombineId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param combineId The value of combineId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCombineId_LikeSearch(String combineId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(combineId), xgetCValueCombineId(), "COMBINE_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMBINE_ID: {varchar(30)}
     * @param combineId The value of combineId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCombineId_NotLikeSearch(String combineId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(combineId), xgetCValueCombineId(), "COMBINE_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMBINE_ID: {varchar(30)}
     * @param combineId The value of combineId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineId_PrefixSearch(String combineId) {
        setCombineId_LikeSearch(combineId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMBINE_ID: {varchar(30)}
     */
    public void setCombineId_IsNull() { regCombineId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMBINE_ID: {varchar(30)}
     */
    public void setCombineId_IsNullOrEmpty() { regCombineId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMBINE_ID: {varchar(30)}
     */
    public void setCombineId_IsNotNull() { regCombineId(CK_ISNN, DOBJ); }

    protected void regCombineId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCombineId(), "COMBINE_ID"); }
    protected abstract ConditionValue xgetCValueCombineId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMBINE_STATUS: {varchar(30)}
     * @param combineStatus The value of combineStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineStatus_Equal(String combineStatus) {
        doSetCombineStatus_Equal(fRES(combineStatus));
    }

    protected void doSetCombineStatus_Equal(String combineStatus) {
        regCombineStatus(CK_EQ, combineStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMBINE_STATUS: {varchar(30)}
     * @param combineStatus The value of combineStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineStatus_NotEqual(String combineStatus) {
        doSetCombineStatus_NotEqual(fRES(combineStatus));
    }

    protected void doSetCombineStatus_NotEqual(String combineStatus) {
        regCombineStatus(CK_NES, combineStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMBINE_STATUS: {varchar(30)}
     * @param combineStatus The value of combineStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineStatus_GreaterThan(String combineStatus) {
        regCombineStatus(CK_GT, fRES(combineStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMBINE_STATUS: {varchar(30)}
     * @param combineStatus The value of combineStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineStatus_LessThan(String combineStatus) {
        regCombineStatus(CK_LT, fRES(combineStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMBINE_STATUS: {varchar(30)}
     * @param combineStatus The value of combineStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineStatus_GreaterEqual(String combineStatus) {
        regCombineStatus(CK_GE, fRES(combineStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMBINE_STATUS: {varchar(30)}
     * @param combineStatus The value of combineStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineStatus_LessEqual(String combineStatus) {
        regCombineStatus(CK_LE, fRES(combineStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMBINE_STATUS: {varchar(30)}
     * @param combineStatusList The collection of combineStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineStatus_InScope(Collection<String> combineStatusList) {
        doSetCombineStatus_InScope(combineStatusList);
    }

    protected void doSetCombineStatus_InScope(Collection<String> combineStatusList) {
        regINS(CK_INS, cTL(combineStatusList), xgetCValueCombineStatus(), "COMBINE_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMBINE_STATUS: {varchar(30)}
     * @param combineStatusList The collection of combineStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineStatus_NotInScope(Collection<String> combineStatusList) {
        doSetCombineStatus_NotInScope(combineStatusList);
    }

    protected void doSetCombineStatus_NotInScope(Collection<String> combineStatusList) {
        regINS(CK_NINS, cTL(combineStatusList), xgetCValueCombineStatus(), "COMBINE_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMBINE_STATUS: {varchar(30)} <br>
     * <pre>e.g. setCombineStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param combineStatus The value of combineStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCombineStatus_LikeSearch(String combineStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(combineStatus), xgetCValueCombineStatus(), "COMBINE_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMBINE_STATUS: {varchar(30)}
     * @param combineStatus The value of combineStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCombineStatus_NotLikeSearch(String combineStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(combineStatus), xgetCValueCombineStatus(), "COMBINE_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMBINE_STATUS: {varchar(30)}
     * @param combineStatus The value of combineStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineStatus_PrefixSearch(String combineStatus) {
        setCombineStatus_LikeSearch(combineStatus, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMBINE_STATUS: {varchar(30)}
     */
    public void setCombineStatus_IsNull() { regCombineStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMBINE_STATUS: {varchar(30)}
     */
    public void setCombineStatus_IsNullOrEmpty() { regCombineStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMBINE_STATUS: {varchar(30)}
     */
    public void setCombineStatus_IsNotNull() { regCombineStatus(CK_ISNN, DOBJ); }

    protected void regCombineStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCombineStatus(), "COMBINE_STATUS"); }
    protected abstract ConditionValue xgetCValueCombineStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_TOTAL: {bigint(19)}
     * @param combineTotal The value of combineTotal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineTotal_Equal(Long combineTotal) {
        doSetCombineTotal_Equal(combineTotal);
    }

    protected void doSetCombineTotal_Equal(Long combineTotal) {
        regCombineTotal(CK_EQ, combineTotal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_TOTAL: {bigint(19)}
     * @param combineTotal The value of combineTotal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineTotal_NotEqual(Long combineTotal) {
        doSetCombineTotal_NotEqual(combineTotal);
    }

    protected void doSetCombineTotal_NotEqual(Long combineTotal) {
        regCombineTotal(CK_NES, combineTotal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_TOTAL: {bigint(19)}
     * @param combineTotal The value of combineTotal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineTotal_GreaterThan(Long combineTotal) {
        regCombineTotal(CK_GT, combineTotal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_TOTAL: {bigint(19)}
     * @param combineTotal The value of combineTotal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineTotal_LessThan(Long combineTotal) {
        regCombineTotal(CK_LT, combineTotal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_TOTAL: {bigint(19)}
     * @param combineTotal The value of combineTotal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineTotal_GreaterEqual(Long combineTotal) {
        regCombineTotal(CK_GE, combineTotal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_TOTAL: {bigint(19)}
     * @param combineTotal The value of combineTotal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineTotal_LessEqual(Long combineTotal) {
        regCombineTotal(CK_LE, combineTotal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_TOTAL: {bigint(19)}
     * @param minNumber The min number of combineTotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of combineTotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCombineTotal_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCombineTotal(), "COMBINE_TOTAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_TOTAL: {bigint(19)}
     * @param combineTotalList The collection of combineTotal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineTotal_InScope(Collection<Long> combineTotalList) {
        doSetCombineTotal_InScope(combineTotalList);
    }

    protected void doSetCombineTotal_InScope(Collection<Long> combineTotalList) {
        regINS(CK_INS, cTL(combineTotalList), xgetCValueCombineTotal(), "COMBINE_TOTAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_TOTAL: {bigint(19)}
     * @param combineTotalList The collection of combineTotal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineTotal_NotInScope(Collection<Long> combineTotalList) {
        doSetCombineTotal_NotInScope(combineTotalList);
    }

    protected void doSetCombineTotal_NotInScope(Collection<Long> combineTotalList) {
        regINS(CK_NINS, cTL(combineTotalList), xgetCValueCombineTotal(), "COMBINE_TOTAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMBINE_TOTAL: {bigint(19)}
     */
    public void setCombineTotal_IsNull() { regCombineTotal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMBINE_TOTAL: {bigint(19)}
     */
    public void setCombineTotal_IsNotNull() { regCombineTotal(CK_ISNN, DOBJ); }

    protected void regCombineTotal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCombineTotal(), "COMBINE_TOTAL"); }
    protected abstract ConditionValue xgetCValueCombineTotal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_CARRIAGE: {bigint(19)}
     * @param combineCarriage The value of combineCarriage as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCarriage_Equal(Long combineCarriage) {
        doSetCombineCarriage_Equal(combineCarriage);
    }

    protected void doSetCombineCarriage_Equal(Long combineCarriage) {
        regCombineCarriage(CK_EQ, combineCarriage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_CARRIAGE: {bigint(19)}
     * @param combineCarriage The value of combineCarriage as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCarriage_NotEqual(Long combineCarriage) {
        doSetCombineCarriage_NotEqual(combineCarriage);
    }

    protected void doSetCombineCarriage_NotEqual(Long combineCarriage) {
        regCombineCarriage(CK_NES, combineCarriage);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_CARRIAGE: {bigint(19)}
     * @param combineCarriage The value of combineCarriage as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCarriage_GreaterThan(Long combineCarriage) {
        regCombineCarriage(CK_GT, combineCarriage);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_CARRIAGE: {bigint(19)}
     * @param combineCarriage The value of combineCarriage as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCarriage_LessThan(Long combineCarriage) {
        regCombineCarriage(CK_LT, combineCarriage);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_CARRIAGE: {bigint(19)}
     * @param combineCarriage The value of combineCarriage as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCarriage_GreaterEqual(Long combineCarriage) {
        regCombineCarriage(CK_GE, combineCarriage);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_CARRIAGE: {bigint(19)}
     * @param combineCarriage The value of combineCarriage as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCarriage_LessEqual(Long combineCarriage) {
        regCombineCarriage(CK_LE, combineCarriage);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_CARRIAGE: {bigint(19)}
     * @param minNumber The min number of combineCarriage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of combineCarriage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCombineCarriage_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCombineCarriage(), "COMBINE_CARRIAGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_CARRIAGE: {bigint(19)}
     * @param combineCarriageList The collection of combineCarriage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineCarriage_InScope(Collection<Long> combineCarriageList) {
        doSetCombineCarriage_InScope(combineCarriageList);
    }

    protected void doSetCombineCarriage_InScope(Collection<Long> combineCarriageList) {
        regINS(CK_INS, cTL(combineCarriageList), xgetCValueCombineCarriage(), "COMBINE_CARRIAGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_CARRIAGE: {bigint(19)}
     * @param combineCarriageList The collection of combineCarriage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineCarriage_NotInScope(Collection<Long> combineCarriageList) {
        doSetCombineCarriage_NotInScope(combineCarriageList);
    }

    protected void doSetCombineCarriage_NotInScope(Collection<Long> combineCarriageList) {
        regINS(CK_NINS, cTL(combineCarriageList), xgetCValueCombineCarriage(), "COMBINE_CARRIAGE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMBINE_CARRIAGE: {bigint(19)}
     */
    public void setCombineCarriage_IsNull() { regCombineCarriage(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMBINE_CARRIAGE: {bigint(19)}
     */
    public void setCombineCarriage_IsNotNull() { regCombineCarriage(CK_ISNN, DOBJ); }

    protected void regCombineCarriage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCombineCarriage(), "COMBINE_CARRIAGE"); }
    protected abstract ConditionValue xgetCValueCombineCarriage();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_COD: {bigint(19)}
     * @param combineCod The value of combineCod as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCod_Equal(Long combineCod) {
        doSetCombineCod_Equal(combineCod);
    }

    protected void doSetCombineCod_Equal(Long combineCod) {
        regCombineCod(CK_EQ, combineCod);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_COD: {bigint(19)}
     * @param combineCod The value of combineCod as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCod_NotEqual(Long combineCod) {
        doSetCombineCod_NotEqual(combineCod);
    }

    protected void doSetCombineCod_NotEqual(Long combineCod) {
        regCombineCod(CK_NES, combineCod);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_COD: {bigint(19)}
     * @param combineCod The value of combineCod as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCod_GreaterThan(Long combineCod) {
        regCombineCod(CK_GT, combineCod);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_COD: {bigint(19)}
     * @param combineCod The value of combineCod as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCod_LessThan(Long combineCod) {
        regCombineCod(CK_LT, combineCod);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_COD: {bigint(19)}
     * @param combineCod The value of combineCod as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCod_GreaterEqual(Long combineCod) {
        regCombineCod(CK_GE, combineCod);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_COD: {bigint(19)}
     * @param combineCod The value of combineCod as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCod_LessEqual(Long combineCod) {
        regCombineCod(CK_LE, combineCod);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_COD: {bigint(19)}
     * @param minNumber The min number of combineCod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of combineCod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCombineCod_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCombineCod(), "COMBINE_COD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_COD: {bigint(19)}
     * @param combineCodList The collection of combineCod as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineCod_InScope(Collection<Long> combineCodList) {
        doSetCombineCod_InScope(combineCodList);
    }

    protected void doSetCombineCod_InScope(Collection<Long> combineCodList) {
        regINS(CK_INS, cTL(combineCodList), xgetCValueCombineCod(), "COMBINE_COD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_COD: {bigint(19)}
     * @param combineCodList The collection of combineCod as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineCod_NotInScope(Collection<Long> combineCodList) {
        doSetCombineCod_NotInScope(combineCodList);
    }

    protected void doSetCombineCod_NotInScope(Collection<Long> combineCodList) {
        regINS(CK_NINS, cTL(combineCodList), xgetCValueCombineCod(), "COMBINE_COD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMBINE_COD: {bigint(19)}
     */
    public void setCombineCod_IsNull() { regCombineCod(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMBINE_COD: {bigint(19)}
     */
    public void setCombineCod_IsNotNull() { regCombineCod(CK_ISNN, DOBJ); }

    protected void regCombineCod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCombineCod(), "COMBINE_COD"); }
    protected abstract ConditionValue xgetCValueCombineCod();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_TAX: {bigint(19)}
     * @param combineTax The value of combineTax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineTax_Equal(Long combineTax) {
        doSetCombineTax_Equal(combineTax);
    }

    protected void doSetCombineTax_Equal(Long combineTax) {
        regCombineTax(CK_EQ, combineTax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_TAX: {bigint(19)}
     * @param combineTax The value of combineTax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineTax_NotEqual(Long combineTax) {
        doSetCombineTax_NotEqual(combineTax);
    }

    protected void doSetCombineTax_NotEqual(Long combineTax) {
        regCombineTax(CK_NES, combineTax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_TAX: {bigint(19)}
     * @param combineTax The value of combineTax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineTax_GreaterThan(Long combineTax) {
        regCombineTax(CK_GT, combineTax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_TAX: {bigint(19)}
     * @param combineTax The value of combineTax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineTax_LessThan(Long combineTax) {
        regCombineTax(CK_LT, combineTax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_TAX: {bigint(19)}
     * @param combineTax The value of combineTax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineTax_GreaterEqual(Long combineTax) {
        regCombineTax(CK_GE, combineTax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_TAX: {bigint(19)}
     * @param combineTax The value of combineTax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineTax_LessEqual(Long combineTax) {
        regCombineTax(CK_LE, combineTax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_TAX: {bigint(19)}
     * @param minNumber The min number of combineTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of combineTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCombineTax_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCombineTax(), "COMBINE_TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_TAX: {bigint(19)}
     * @param combineTaxList The collection of combineTax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineTax_InScope(Collection<Long> combineTaxList) {
        doSetCombineTax_InScope(combineTaxList);
    }

    protected void doSetCombineTax_InScope(Collection<Long> combineTaxList) {
        regINS(CK_INS, cTL(combineTaxList), xgetCValueCombineTax(), "COMBINE_TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_TAX: {bigint(19)}
     * @param combineTaxList The collection of combineTax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineTax_NotInScope(Collection<Long> combineTaxList) {
        doSetCombineTax_NotInScope(combineTaxList);
    }

    protected void doSetCombineTax_NotInScope(Collection<Long> combineTaxList) {
        regINS(CK_NINS, cTL(combineTaxList), xgetCValueCombineTax(), "COMBINE_TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMBINE_TAX: {bigint(19)}
     */
    public void setCombineTax_IsNull() { regCombineTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMBINE_TAX: {bigint(19)}
     */
    public void setCombineTax_IsNotNull() { regCombineTax(CK_ISNN, DOBJ); }

    protected void regCombineTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCombineTax(), "COMBINE_TAX"); }
    protected abstract ConditionValue xgetCValueCombineTax();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_BILLED: {bigint(19)}
     * @param combineBilled The value of combineBilled as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineBilled_Equal(Long combineBilled) {
        doSetCombineBilled_Equal(combineBilled);
    }

    protected void doSetCombineBilled_Equal(Long combineBilled) {
        regCombineBilled(CK_EQ, combineBilled);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_BILLED: {bigint(19)}
     * @param combineBilled The value of combineBilled as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineBilled_NotEqual(Long combineBilled) {
        doSetCombineBilled_NotEqual(combineBilled);
    }

    protected void doSetCombineBilled_NotEqual(Long combineBilled) {
        regCombineBilled(CK_NES, combineBilled);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_BILLED: {bigint(19)}
     * @param combineBilled The value of combineBilled as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineBilled_GreaterThan(Long combineBilled) {
        regCombineBilled(CK_GT, combineBilled);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_BILLED: {bigint(19)}
     * @param combineBilled The value of combineBilled as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineBilled_LessThan(Long combineBilled) {
        regCombineBilled(CK_LT, combineBilled);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_BILLED: {bigint(19)}
     * @param combineBilled The value of combineBilled as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineBilled_GreaterEqual(Long combineBilled) {
        regCombineBilled(CK_GE, combineBilled);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_BILLED: {bigint(19)}
     * @param combineBilled The value of combineBilled as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineBilled_LessEqual(Long combineBilled) {
        regCombineBilled(CK_LE, combineBilled);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_BILLED: {bigint(19)}
     * @param minNumber The min number of combineBilled. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of combineBilled. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCombineBilled_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCombineBilled(), "COMBINE_BILLED", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_BILLED: {bigint(19)}
     * @param combineBilledList The collection of combineBilled as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineBilled_InScope(Collection<Long> combineBilledList) {
        doSetCombineBilled_InScope(combineBilledList);
    }

    protected void doSetCombineBilled_InScope(Collection<Long> combineBilledList) {
        regINS(CK_INS, cTL(combineBilledList), xgetCValueCombineBilled(), "COMBINE_BILLED");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_BILLED: {bigint(19)}
     * @param combineBilledList The collection of combineBilled as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineBilled_NotInScope(Collection<Long> combineBilledList) {
        doSetCombineBilled_NotInScope(combineBilledList);
    }

    protected void doSetCombineBilled_NotInScope(Collection<Long> combineBilledList) {
        regINS(CK_NINS, cTL(combineBilledList), xgetCValueCombineBilled(), "COMBINE_BILLED");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMBINE_BILLED: {bigint(19)}
     */
    public void setCombineBilled_IsNull() { regCombineBilled(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMBINE_BILLED: {bigint(19)}
     */
    public void setCombineBilled_IsNotNull() { regCombineBilled(CK_ISNN, DOBJ); }

    protected void regCombineBilled(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCombineBilled(), "COMBINE_BILLED"); }
    protected abstract ConditionValue xgetCValueCombineBilled();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_AMOUNT: {bigint(19)}
     * @param combineAmount The value of combineAmount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineAmount_Equal(Long combineAmount) {
        doSetCombineAmount_Equal(combineAmount);
    }

    protected void doSetCombineAmount_Equal(Long combineAmount) {
        regCombineAmount(CK_EQ, combineAmount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_AMOUNT: {bigint(19)}
     * @param combineAmount The value of combineAmount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineAmount_NotEqual(Long combineAmount) {
        doSetCombineAmount_NotEqual(combineAmount);
    }

    protected void doSetCombineAmount_NotEqual(Long combineAmount) {
        regCombineAmount(CK_NES, combineAmount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_AMOUNT: {bigint(19)}
     * @param combineAmount The value of combineAmount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineAmount_GreaterThan(Long combineAmount) {
        regCombineAmount(CK_GT, combineAmount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_AMOUNT: {bigint(19)}
     * @param combineAmount The value of combineAmount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineAmount_LessThan(Long combineAmount) {
        regCombineAmount(CK_LT, combineAmount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_AMOUNT: {bigint(19)}
     * @param combineAmount The value of combineAmount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineAmount_GreaterEqual(Long combineAmount) {
        regCombineAmount(CK_GE, combineAmount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_AMOUNT: {bigint(19)}
     * @param combineAmount The value of combineAmount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineAmount_LessEqual(Long combineAmount) {
        regCombineAmount(CK_LE, combineAmount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_AMOUNT: {bigint(19)}
     * @param minNumber The min number of combineAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of combineAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCombineAmount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCombineAmount(), "COMBINE_AMOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_AMOUNT: {bigint(19)}
     * @param combineAmountList The collection of combineAmount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineAmount_InScope(Collection<Long> combineAmountList) {
        doSetCombineAmount_InScope(combineAmountList);
    }

    protected void doSetCombineAmount_InScope(Collection<Long> combineAmountList) {
        regINS(CK_INS, cTL(combineAmountList), xgetCValueCombineAmount(), "COMBINE_AMOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_AMOUNT: {bigint(19)}
     * @param combineAmountList The collection of combineAmount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineAmount_NotInScope(Collection<Long> combineAmountList) {
        doSetCombineAmount_NotInScope(combineAmountList);
    }

    protected void doSetCombineAmount_NotInScope(Collection<Long> combineAmountList) {
        regINS(CK_NINS, cTL(combineAmountList), xgetCValueCombineAmount(), "COMBINE_AMOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMBINE_AMOUNT: {bigint(19)}
     */
    public void setCombineAmount_IsNull() { regCombineAmount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMBINE_AMOUNT: {bigint(19)}
     */
    public void setCombineAmount_IsNotNull() { regCombineAmount(CK_ISNN, DOBJ); }

    protected void regCombineAmount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCombineAmount(), "COMBINE_AMOUNT"); }
    protected abstract ConditionValue xgetCValueCombineAmount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_BANK_FEE: {bigint(19)}
     * @param combineBankFee The value of combineBankFee as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineBankFee_Equal(Long combineBankFee) {
        doSetCombineBankFee_Equal(combineBankFee);
    }

    protected void doSetCombineBankFee_Equal(Long combineBankFee) {
        regCombineBankFee(CK_EQ, combineBankFee);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_BANK_FEE: {bigint(19)}
     * @param combineBankFee The value of combineBankFee as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineBankFee_NotEqual(Long combineBankFee) {
        doSetCombineBankFee_NotEqual(combineBankFee);
    }

    protected void doSetCombineBankFee_NotEqual(Long combineBankFee) {
        regCombineBankFee(CK_NES, combineBankFee);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_BANK_FEE: {bigint(19)}
     * @param combineBankFee The value of combineBankFee as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineBankFee_GreaterThan(Long combineBankFee) {
        regCombineBankFee(CK_GT, combineBankFee);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_BANK_FEE: {bigint(19)}
     * @param combineBankFee The value of combineBankFee as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineBankFee_LessThan(Long combineBankFee) {
        regCombineBankFee(CK_LT, combineBankFee);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_BANK_FEE: {bigint(19)}
     * @param combineBankFee The value of combineBankFee as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineBankFee_GreaterEqual(Long combineBankFee) {
        regCombineBankFee(CK_GE, combineBankFee);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_BANK_FEE: {bigint(19)}
     * @param combineBankFee The value of combineBankFee as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineBankFee_LessEqual(Long combineBankFee) {
        regCombineBankFee(CK_LE, combineBankFee);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_BANK_FEE: {bigint(19)}
     * @param minNumber The min number of combineBankFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of combineBankFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCombineBankFee_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCombineBankFee(), "COMBINE_BANK_FEE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_BANK_FEE: {bigint(19)}
     * @param combineBankFeeList The collection of combineBankFee as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineBankFee_InScope(Collection<Long> combineBankFeeList) {
        doSetCombineBankFee_InScope(combineBankFeeList);
    }

    protected void doSetCombineBankFee_InScope(Collection<Long> combineBankFeeList) {
        regINS(CK_INS, cTL(combineBankFeeList), xgetCValueCombineBankFee(), "COMBINE_BANK_FEE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_BANK_FEE: {bigint(19)}
     * @param combineBankFeeList The collection of combineBankFee as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineBankFee_NotInScope(Collection<Long> combineBankFeeList) {
        doSetCombineBankFee_NotInScope(combineBankFeeList);
    }

    protected void doSetCombineBankFee_NotInScope(Collection<Long> combineBankFeeList) {
        regINS(CK_NINS, cTL(combineBankFeeList), xgetCValueCombineBankFee(), "COMBINE_BANK_FEE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMBINE_BANK_FEE: {bigint(19)}
     */
    public void setCombineBankFee_IsNull() { regCombineBankFee(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMBINE_BANK_FEE: {bigint(19)}
     */
    public void setCombineBankFee_IsNotNull() { regCombineBankFee(CK_ISNN, DOBJ); }

    protected void regCombineBankFee(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCombineBankFee(), "COMBINE_BANK_FEE"); }
    protected abstract ConditionValue xgetCValueCombineBankFee();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_POINT_USE: {bigint(19)}
     * @param combinePointUse The value of combinePointUse as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombinePointUse_Equal(Long combinePointUse) {
        doSetCombinePointUse_Equal(combinePointUse);
    }

    protected void doSetCombinePointUse_Equal(Long combinePointUse) {
        regCombinePointUse(CK_EQ, combinePointUse);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_POINT_USE: {bigint(19)}
     * @param combinePointUse The value of combinePointUse as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombinePointUse_NotEqual(Long combinePointUse) {
        doSetCombinePointUse_NotEqual(combinePointUse);
    }

    protected void doSetCombinePointUse_NotEqual(Long combinePointUse) {
        regCombinePointUse(CK_NES, combinePointUse);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_POINT_USE: {bigint(19)}
     * @param combinePointUse The value of combinePointUse as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombinePointUse_GreaterThan(Long combinePointUse) {
        regCombinePointUse(CK_GT, combinePointUse);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_POINT_USE: {bigint(19)}
     * @param combinePointUse The value of combinePointUse as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombinePointUse_LessThan(Long combinePointUse) {
        regCombinePointUse(CK_LT, combinePointUse);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_POINT_USE: {bigint(19)}
     * @param combinePointUse The value of combinePointUse as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombinePointUse_GreaterEqual(Long combinePointUse) {
        regCombinePointUse(CK_GE, combinePointUse);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_POINT_USE: {bigint(19)}
     * @param combinePointUse The value of combinePointUse as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombinePointUse_LessEqual(Long combinePointUse) {
        regCombinePointUse(CK_LE, combinePointUse);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_POINT_USE: {bigint(19)}
     * @param minNumber The min number of combinePointUse. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of combinePointUse. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCombinePointUse_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCombinePointUse(), "COMBINE_POINT_USE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_POINT_USE: {bigint(19)}
     * @param combinePointUseList The collection of combinePointUse as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombinePointUse_InScope(Collection<Long> combinePointUseList) {
        doSetCombinePointUse_InScope(combinePointUseList);
    }

    protected void doSetCombinePointUse_InScope(Collection<Long> combinePointUseList) {
        regINS(CK_INS, cTL(combinePointUseList), xgetCValueCombinePointUse(), "COMBINE_POINT_USE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_POINT_USE: {bigint(19)}
     * @param combinePointUseList The collection of combinePointUse as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombinePointUse_NotInScope(Collection<Long> combinePointUseList) {
        doSetCombinePointUse_NotInScope(combinePointUseList);
    }

    protected void doSetCombinePointUse_NotInScope(Collection<Long> combinePointUseList) {
        regINS(CK_NINS, cTL(combinePointUseList), xgetCValueCombinePointUse(), "COMBINE_POINT_USE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMBINE_POINT_USE: {bigint(19)}
     */
    public void setCombinePointUse_IsNull() { regCombinePointUse(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMBINE_POINT_USE: {bigint(19)}
     */
    public void setCombinePointUse_IsNotNull() { regCombinePointUse(CK_ISNN, DOBJ); }

    protected void regCombinePointUse(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCombinePointUse(), "COMBINE_POINT_USE"); }
    protected abstract ConditionValue xgetCValueCombinePointUse();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_FLG: {char(1)}
     * @param mailFlg The value of mailFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailFlg_Equal(String mailFlg) {
        doSetMailFlg_Equal(fRES(mailFlg));
    }

    protected void doSetMailFlg_Equal(String mailFlg) {
        regMailFlg(CK_EQ, mailFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_FLG: {char(1)}
     * @param mailFlg The value of mailFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailFlg_NotEqual(String mailFlg) {
        doSetMailFlg_NotEqual(fRES(mailFlg));
    }

    protected void doSetMailFlg_NotEqual(String mailFlg) {
        regMailFlg(CK_NES, mailFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_FLG: {char(1)}
     * @param mailFlg The value of mailFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailFlg_GreaterThan(String mailFlg) {
        regMailFlg(CK_GT, fRES(mailFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_FLG: {char(1)}
     * @param mailFlg The value of mailFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailFlg_LessThan(String mailFlg) {
        regMailFlg(CK_LT, fRES(mailFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_FLG: {char(1)}
     * @param mailFlg The value of mailFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailFlg_GreaterEqual(String mailFlg) {
        regMailFlg(CK_GE, fRES(mailFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_FLG: {char(1)}
     * @param mailFlg The value of mailFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailFlg_LessEqual(String mailFlg) {
        regMailFlg(CK_LE, fRES(mailFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAIL_FLG: {char(1)}
     * @param mailFlgList The collection of mailFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailFlg_InScope(Collection<String> mailFlgList) {
        doSetMailFlg_InScope(mailFlgList);
    }

    protected void doSetMailFlg_InScope(Collection<String> mailFlgList) {
        regINS(CK_INS, cTL(mailFlgList), xgetCValueMailFlg(), "MAIL_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAIL_FLG: {char(1)}
     * @param mailFlgList The collection of mailFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailFlg_NotInScope(Collection<String> mailFlgList) {
        doSetMailFlg_NotInScope(mailFlgList);
    }

    protected void doSetMailFlg_NotInScope(Collection<String> mailFlgList) {
        regINS(CK_NINS, cTL(mailFlgList), xgetCValueMailFlg(), "MAIL_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_FLG: {char(1)} <br>
     * <pre>e.g. setMailFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mailFlg The value of mailFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMailFlg_LikeSearch(String mailFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mailFlg), xgetCValueMailFlg(), "MAIL_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_FLG: {char(1)}
     * @param mailFlg The value of mailFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMailFlg_NotLikeSearch(String mailFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mailFlg), xgetCValueMailFlg(), "MAIL_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_FLG: {char(1)}
     * @param mailFlg The value of mailFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailFlg_PrefixSearch(String mailFlg) {
        setMailFlg_LikeSearch(mailFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAIL_FLG: {char(1)}
     */
    public void setMailFlg_IsNull() { regMailFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAIL_FLG: {char(1)}
     */
    public void setMailFlg_IsNotNull() { regMailFlg(CK_ISNN, DOBJ); }

    protected void regMailFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMailFlg(), "MAIL_FLG"); }
    protected abstract ConditionValue xgetCValueMailFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_Equal(String orderDt) {
        doSetOrderDt_Equal(fRES(orderDt));
    }

    protected void doSetOrderDt_Equal(String orderDt) {
        regOrderDt(CK_EQ, orderDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_NotEqual(String orderDt) {
        doSetOrderDt_NotEqual(fRES(orderDt));
    }

    protected void doSetOrderDt_NotEqual(String orderDt) {
        regOrderDt(CK_NES, orderDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_GreaterThan(String orderDt) {
        regOrderDt(CK_GT, fRES(orderDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_LessThan(String orderDt) {
        regOrderDt(CK_LT, fRES(orderDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_GreaterEqual(String orderDt) {
        regOrderDt(CK_GE, fRES(orderDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_LessEqual(String orderDt) {
        regOrderDt(CK_LE, fRES(orderDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDtList The collection of orderDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_InScope(Collection<String> orderDtList) {
        doSetOrderDt_InScope(orderDtList);
    }

    protected void doSetOrderDt_InScope(Collection<String> orderDtList) {
        regINS(CK_INS, cTL(orderDtList), xgetCValueOrderDt(), "ORDER_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDtList The collection of orderDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_NotInScope(Collection<String> orderDtList) {
        doSetOrderDt_NotInScope(orderDtList);
    }

    protected void doSetOrderDt_NotInScope(Collection<String> orderDtList) {
        regINS(CK_NINS, cTL(orderDtList), xgetCValueOrderDt(), "ORDER_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DT: {varchar(30)} <br>
     * <pre>e.g. setOrderDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderDt The value of orderDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderDt_LikeSearch(String orderDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderDt), xgetCValueOrderDt(), "ORDER_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderDt_NotLikeSearch(String orderDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderDt), xgetCValueOrderDt(), "ORDER_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DT: {varchar(30)}
     * @param orderDt The value of orderDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_PrefixSearch(String orderDt) {
        setOrderDt_LikeSearch(orderDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     */
    public void setOrderDt_IsNull() { regOrderDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     */
    public void setOrderDt_IsNullOrEmpty() { regOrderDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_DT: {varchar(30)}
     */
    public void setOrderDt_IsNotNull() { regOrderDt(CK_ISNN, DOBJ); }

    protected void regOrderDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderDt(), "ORDER_DT"); }
    protected abstract ConditionValue xgetCValueOrderDt();

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
     * MOBILE_PAYMENT_NO: {varchar(30)}
     * @param mobilePaymentNo The value of mobilePaymentNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobilePaymentNo_Equal(String mobilePaymentNo) {
        doSetMobilePaymentNo_Equal(fRES(mobilePaymentNo));
    }

    protected void doSetMobilePaymentNo_Equal(String mobilePaymentNo) {
        regMobilePaymentNo(CK_EQ, mobilePaymentNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)}
     * @param mobilePaymentNo The value of mobilePaymentNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobilePaymentNo_NotEqual(String mobilePaymentNo) {
        doSetMobilePaymentNo_NotEqual(fRES(mobilePaymentNo));
    }

    protected void doSetMobilePaymentNo_NotEqual(String mobilePaymentNo) {
        regMobilePaymentNo(CK_NES, mobilePaymentNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)}
     * @param mobilePaymentNo The value of mobilePaymentNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobilePaymentNo_GreaterThan(String mobilePaymentNo) {
        regMobilePaymentNo(CK_GT, fRES(mobilePaymentNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)}
     * @param mobilePaymentNo The value of mobilePaymentNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobilePaymentNo_LessThan(String mobilePaymentNo) {
        regMobilePaymentNo(CK_LT, fRES(mobilePaymentNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)}
     * @param mobilePaymentNo The value of mobilePaymentNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobilePaymentNo_GreaterEqual(String mobilePaymentNo) {
        regMobilePaymentNo(CK_GE, fRES(mobilePaymentNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)}
     * @param mobilePaymentNo The value of mobilePaymentNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobilePaymentNo_LessEqual(String mobilePaymentNo) {
        regMobilePaymentNo(CK_LE, fRES(mobilePaymentNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)}
     * @param mobilePaymentNoList The collection of mobilePaymentNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobilePaymentNo_InScope(Collection<String> mobilePaymentNoList) {
        doSetMobilePaymentNo_InScope(mobilePaymentNoList);
    }

    protected void doSetMobilePaymentNo_InScope(Collection<String> mobilePaymentNoList) {
        regINS(CK_INS, cTL(mobilePaymentNoList), xgetCValueMobilePaymentNo(), "MOBILE_PAYMENT_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)}
     * @param mobilePaymentNoList The collection of mobilePaymentNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobilePaymentNo_NotInScope(Collection<String> mobilePaymentNoList) {
        doSetMobilePaymentNo_NotInScope(mobilePaymentNoList);
    }

    protected void doSetMobilePaymentNo_NotInScope(Collection<String> mobilePaymentNoList) {
        regINS(CK_NINS, cTL(mobilePaymentNoList), xgetCValueMobilePaymentNo(), "MOBILE_PAYMENT_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)} <br>
     * <pre>e.g. setMobilePaymentNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mobilePaymentNo The value of mobilePaymentNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMobilePaymentNo_LikeSearch(String mobilePaymentNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mobilePaymentNo), xgetCValueMobilePaymentNo(), "MOBILE_PAYMENT_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)}
     * @param mobilePaymentNo The value of mobilePaymentNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMobilePaymentNo_NotLikeSearch(String mobilePaymentNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mobilePaymentNo), xgetCValueMobilePaymentNo(), "MOBILE_PAYMENT_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)}
     * @param mobilePaymentNo The value of mobilePaymentNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobilePaymentNo_PrefixSearch(String mobilePaymentNo) {
        setMobilePaymentNo_LikeSearch(mobilePaymentNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)}
     */
    public void setMobilePaymentNo_IsNull() { regMobilePaymentNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)}
     */
    public void setMobilePaymentNo_IsNullOrEmpty() { regMobilePaymentNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOBILE_PAYMENT_NO: {varchar(30)}
     */
    public void setMobilePaymentNo_IsNotNull() { regMobilePaymentNo(CK_ISNN, DOBJ); }

    protected void regMobilePaymentNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMobilePaymentNo(), "MOBILE_PAYMENT_NO"); }
    protected abstract ConditionValue xgetCValueMobilePaymentNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     * @param historyModFlg The value of historyModFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryModFlg_Equal(String historyModFlg) {
        doSetHistoryModFlg_Equal(fRES(historyModFlg));
    }

    protected void doSetHistoryModFlg_Equal(String historyModFlg) {
        regHistoryModFlg(CK_EQ, historyModFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     * @param historyModFlg The value of historyModFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryModFlg_NotEqual(String historyModFlg) {
        doSetHistoryModFlg_NotEqual(fRES(historyModFlg));
    }

    protected void doSetHistoryModFlg_NotEqual(String historyModFlg) {
        regHistoryModFlg(CK_NES, historyModFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     * @param historyModFlg The value of historyModFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryModFlg_GreaterThan(String historyModFlg) {
        regHistoryModFlg(CK_GT, fRES(historyModFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     * @param historyModFlg The value of historyModFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryModFlg_LessThan(String historyModFlg) {
        regHistoryModFlg(CK_LT, fRES(historyModFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     * @param historyModFlg The value of historyModFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryModFlg_GreaterEqual(String historyModFlg) {
        regHistoryModFlg(CK_GE, fRES(historyModFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     * @param historyModFlg The value of historyModFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryModFlg_LessEqual(String historyModFlg) {
        regHistoryModFlg(CK_LE, fRES(historyModFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     * @param historyModFlgList The collection of historyModFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryModFlg_InScope(Collection<String> historyModFlgList) {
        doSetHistoryModFlg_InScope(historyModFlgList);
    }

    protected void doSetHistoryModFlg_InScope(Collection<String> historyModFlgList) {
        regINS(CK_INS, cTL(historyModFlgList), xgetCValueHistoryModFlg(), "HISTORY_MOD_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     * @param historyModFlgList The collection of historyModFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryModFlg_NotInScope(Collection<String> historyModFlgList) {
        doSetHistoryModFlg_NotInScope(historyModFlgList);
    }

    protected void doSetHistoryModFlg_NotInScope(Collection<String> historyModFlgList) {
        regINS(CK_NINS, cTL(historyModFlgList), xgetCValueHistoryModFlg(), "HISTORY_MOD_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HISTORY_MOD_FLG: {varchar(30)} <br>
     * <pre>e.g. setHistoryModFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param historyModFlg The value of historyModFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHistoryModFlg_LikeSearch(String historyModFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(historyModFlg), xgetCValueHistoryModFlg(), "HISTORY_MOD_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     * @param historyModFlg The value of historyModFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHistoryModFlg_NotLikeSearch(String historyModFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(historyModFlg), xgetCValueHistoryModFlg(), "HISTORY_MOD_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     * @param historyModFlg The value of historyModFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryModFlg_PrefixSearch(String historyModFlg) {
        setHistoryModFlg_LikeSearch(historyModFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     */
    public void setHistoryModFlg_IsNull() { regHistoryModFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     */
    public void setHistoryModFlg_IsNullOrEmpty() { regHistoryModFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HISTORY_MOD_FLG: {varchar(30)}
     */
    public void setHistoryModFlg_IsNotNull() { regHistoryModFlg(CK_ISNN, DOBJ); }

    protected void regHistoryModFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHistoryModFlg(), "HISTORY_MOD_FLG"); }
    protected abstract ConditionValue xgetCValueHistoryModFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_ICON_FLG: {char(1)}
     * @param historyIconFlg The value of historyIconFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryIconFlg_Equal(String historyIconFlg) {
        doSetHistoryIconFlg_Equal(fRES(historyIconFlg));
    }

    protected void doSetHistoryIconFlg_Equal(String historyIconFlg) {
        regHistoryIconFlg(CK_EQ, historyIconFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_ICON_FLG: {char(1)}
     * @param historyIconFlg The value of historyIconFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryIconFlg_NotEqual(String historyIconFlg) {
        doSetHistoryIconFlg_NotEqual(fRES(historyIconFlg));
    }

    protected void doSetHistoryIconFlg_NotEqual(String historyIconFlg) {
        regHistoryIconFlg(CK_NES, historyIconFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_ICON_FLG: {char(1)}
     * @param historyIconFlg The value of historyIconFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryIconFlg_GreaterThan(String historyIconFlg) {
        regHistoryIconFlg(CK_GT, fRES(historyIconFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_ICON_FLG: {char(1)}
     * @param historyIconFlg The value of historyIconFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryIconFlg_LessThan(String historyIconFlg) {
        regHistoryIconFlg(CK_LT, fRES(historyIconFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_ICON_FLG: {char(1)}
     * @param historyIconFlg The value of historyIconFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryIconFlg_GreaterEqual(String historyIconFlg) {
        regHistoryIconFlg(CK_GE, fRES(historyIconFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_ICON_FLG: {char(1)}
     * @param historyIconFlg The value of historyIconFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryIconFlg_LessEqual(String historyIconFlg) {
        regHistoryIconFlg(CK_LE, fRES(historyIconFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HISTORY_ICON_FLG: {char(1)}
     * @param historyIconFlgList The collection of historyIconFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryIconFlg_InScope(Collection<String> historyIconFlgList) {
        doSetHistoryIconFlg_InScope(historyIconFlgList);
    }

    protected void doSetHistoryIconFlg_InScope(Collection<String> historyIconFlgList) {
        regINS(CK_INS, cTL(historyIconFlgList), xgetCValueHistoryIconFlg(), "HISTORY_ICON_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HISTORY_ICON_FLG: {char(1)}
     * @param historyIconFlgList The collection of historyIconFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryIconFlg_NotInScope(Collection<String> historyIconFlgList) {
        doSetHistoryIconFlg_NotInScope(historyIconFlgList);
    }

    protected void doSetHistoryIconFlg_NotInScope(Collection<String> historyIconFlgList) {
        regINS(CK_NINS, cTL(historyIconFlgList), xgetCValueHistoryIconFlg(), "HISTORY_ICON_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HISTORY_ICON_FLG: {char(1)} <br>
     * <pre>e.g. setHistoryIconFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param historyIconFlg The value of historyIconFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHistoryIconFlg_LikeSearch(String historyIconFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(historyIconFlg), xgetCValueHistoryIconFlg(), "HISTORY_ICON_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HISTORY_ICON_FLG: {char(1)}
     * @param historyIconFlg The value of historyIconFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHistoryIconFlg_NotLikeSearch(String historyIconFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(historyIconFlg), xgetCValueHistoryIconFlg(), "HISTORY_ICON_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HISTORY_ICON_FLG: {char(1)}
     * @param historyIconFlg The value of historyIconFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryIconFlg_PrefixSearch(String historyIconFlg) {
        setHistoryIconFlg_LikeSearch(historyIconFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HISTORY_ICON_FLG: {char(1)}
     */
    public void setHistoryIconFlg_IsNull() { regHistoryIconFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HISTORY_ICON_FLG: {char(1)}
     */
    public void setHistoryIconFlg_IsNotNull() { regHistoryIconFlg(CK_ISNN, DOBJ); }

    protected void regHistoryIconFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHistoryIconFlg(), "HISTORY_ICON_FLG"); }
    protected abstract ConditionValue xgetCValueHistoryIconFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_MAIL_FLG: {char(1)}
     * @param historyMailFlg The value of historyMailFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryMailFlg_Equal(String historyMailFlg) {
        doSetHistoryMailFlg_Equal(fRES(historyMailFlg));
    }

    protected void doSetHistoryMailFlg_Equal(String historyMailFlg) {
        regHistoryMailFlg(CK_EQ, historyMailFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_MAIL_FLG: {char(1)}
     * @param historyMailFlg The value of historyMailFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryMailFlg_NotEqual(String historyMailFlg) {
        doSetHistoryMailFlg_NotEqual(fRES(historyMailFlg));
    }

    protected void doSetHistoryMailFlg_NotEqual(String historyMailFlg) {
        regHistoryMailFlg(CK_NES, historyMailFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_MAIL_FLG: {char(1)}
     * @param historyMailFlg The value of historyMailFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryMailFlg_GreaterThan(String historyMailFlg) {
        regHistoryMailFlg(CK_GT, fRES(historyMailFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_MAIL_FLG: {char(1)}
     * @param historyMailFlg The value of historyMailFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryMailFlg_LessThan(String historyMailFlg) {
        regHistoryMailFlg(CK_LT, fRES(historyMailFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_MAIL_FLG: {char(1)}
     * @param historyMailFlg The value of historyMailFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryMailFlg_GreaterEqual(String historyMailFlg) {
        regHistoryMailFlg(CK_GE, fRES(historyMailFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HISTORY_MAIL_FLG: {char(1)}
     * @param historyMailFlg The value of historyMailFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryMailFlg_LessEqual(String historyMailFlg) {
        regHistoryMailFlg(CK_LE, fRES(historyMailFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HISTORY_MAIL_FLG: {char(1)}
     * @param historyMailFlgList The collection of historyMailFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryMailFlg_InScope(Collection<String> historyMailFlgList) {
        doSetHistoryMailFlg_InScope(historyMailFlgList);
    }

    protected void doSetHistoryMailFlg_InScope(Collection<String> historyMailFlgList) {
        regINS(CK_INS, cTL(historyMailFlgList), xgetCValueHistoryMailFlg(), "HISTORY_MAIL_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HISTORY_MAIL_FLG: {char(1)}
     * @param historyMailFlgList The collection of historyMailFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryMailFlg_NotInScope(Collection<String> historyMailFlgList) {
        doSetHistoryMailFlg_NotInScope(historyMailFlgList);
    }

    protected void doSetHistoryMailFlg_NotInScope(Collection<String> historyMailFlgList) {
        regINS(CK_NINS, cTL(historyMailFlgList), xgetCValueHistoryMailFlg(), "HISTORY_MAIL_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HISTORY_MAIL_FLG: {char(1)} <br>
     * <pre>e.g. setHistoryMailFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param historyMailFlg The value of historyMailFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHistoryMailFlg_LikeSearch(String historyMailFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(historyMailFlg), xgetCValueHistoryMailFlg(), "HISTORY_MAIL_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HISTORY_MAIL_FLG: {char(1)}
     * @param historyMailFlg The value of historyMailFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHistoryMailFlg_NotLikeSearch(String historyMailFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(historyMailFlg), xgetCValueHistoryMailFlg(), "HISTORY_MAIL_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HISTORY_MAIL_FLG: {char(1)}
     * @param historyMailFlg The value of historyMailFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistoryMailFlg_PrefixSearch(String historyMailFlg) {
        setHistoryMailFlg_LikeSearch(historyMailFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HISTORY_MAIL_FLG: {char(1)}
     */
    public void setHistoryMailFlg_IsNull() { regHistoryMailFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HISTORY_MAIL_FLG: {char(1)}
     */
    public void setHistoryMailFlg_IsNotNull() { regHistoryMailFlg(CK_ISNN, DOBJ); }

    protected void regHistoryMailFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHistoryMailFlg(), "HISTORY_MAIL_FLG"); }
    protected abstract ConditionValue xgetCValueHistoryMailFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_MATCH_FLG: {char(1)}
     * @param delivMatchFlg The value of delivMatchFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_Equal(String delivMatchFlg) {
        doSetDelivMatchFlg_Equal(fRES(delivMatchFlg));
    }

    protected void doSetDelivMatchFlg_Equal(String delivMatchFlg) {
        regDelivMatchFlg(CK_EQ, delivMatchFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_MATCH_FLG: {char(1)}
     * @param delivMatchFlg The value of delivMatchFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_NotEqual(String delivMatchFlg) {
        doSetDelivMatchFlg_NotEqual(fRES(delivMatchFlg));
    }

    protected void doSetDelivMatchFlg_NotEqual(String delivMatchFlg) {
        regDelivMatchFlg(CK_NES, delivMatchFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_MATCH_FLG: {char(1)}
     * @param delivMatchFlg The value of delivMatchFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_GreaterThan(String delivMatchFlg) {
        regDelivMatchFlg(CK_GT, fRES(delivMatchFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_MATCH_FLG: {char(1)}
     * @param delivMatchFlg The value of delivMatchFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_LessThan(String delivMatchFlg) {
        regDelivMatchFlg(CK_LT, fRES(delivMatchFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_MATCH_FLG: {char(1)}
     * @param delivMatchFlg The value of delivMatchFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_GreaterEqual(String delivMatchFlg) {
        regDelivMatchFlg(CK_GE, fRES(delivMatchFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_MATCH_FLG: {char(1)}
     * @param delivMatchFlg The value of delivMatchFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_LessEqual(String delivMatchFlg) {
        regDelivMatchFlg(CK_LE, fRES(delivMatchFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_MATCH_FLG: {char(1)}
     * @param delivMatchFlgList The collection of delivMatchFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_InScope(Collection<String> delivMatchFlgList) {
        doSetDelivMatchFlg_InScope(delivMatchFlgList);
    }

    protected void doSetDelivMatchFlg_InScope(Collection<String> delivMatchFlgList) {
        regINS(CK_INS, cTL(delivMatchFlgList), xgetCValueDelivMatchFlg(), "DELIV_MATCH_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_MATCH_FLG: {char(1)}
     * @param delivMatchFlgList The collection of delivMatchFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_NotInScope(Collection<String> delivMatchFlgList) {
        doSetDelivMatchFlg_NotInScope(delivMatchFlgList);
    }

    protected void doSetDelivMatchFlg_NotInScope(Collection<String> delivMatchFlgList) {
        regINS(CK_NINS, cTL(delivMatchFlgList), xgetCValueDelivMatchFlg(), "DELIV_MATCH_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_MATCH_FLG: {char(1)} <br>
     * <pre>e.g. setDelivMatchFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivMatchFlg The value of delivMatchFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivMatchFlg_LikeSearch(String delivMatchFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivMatchFlg), xgetCValueDelivMatchFlg(), "DELIV_MATCH_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_MATCH_FLG: {char(1)}
     * @param delivMatchFlg The value of delivMatchFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivMatchFlg_NotLikeSearch(String delivMatchFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivMatchFlg), xgetCValueDelivMatchFlg(), "DELIV_MATCH_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_MATCH_FLG: {char(1)}
     * @param delivMatchFlg The value of delivMatchFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMatchFlg_PrefixSearch(String delivMatchFlg) {
        setDelivMatchFlg_LikeSearch(delivMatchFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_MATCH_FLG: {char(1)}
     */
    public void setDelivMatchFlg_IsNull() { regDelivMatchFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_MATCH_FLG: {char(1)}
     */
    public void setDelivMatchFlg_IsNotNull() { regDelivMatchFlg(CK_ISNN, DOBJ); }

    protected void regDelivMatchFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivMatchFlg(), "DELIV_MATCH_FLG"); }
    protected abstract ConditionValue xgetCValueDelivMatchFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_USE_FLG: {char(1)}
     * @param pointUseFlg The value of pointUseFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointUseFlg_Equal(String pointUseFlg) {
        doSetPointUseFlg_Equal(fRES(pointUseFlg));
    }

    protected void doSetPointUseFlg_Equal(String pointUseFlg) {
        regPointUseFlg(CK_EQ, pointUseFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_USE_FLG: {char(1)}
     * @param pointUseFlg The value of pointUseFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointUseFlg_NotEqual(String pointUseFlg) {
        doSetPointUseFlg_NotEqual(fRES(pointUseFlg));
    }

    protected void doSetPointUseFlg_NotEqual(String pointUseFlg) {
        regPointUseFlg(CK_NES, pointUseFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_USE_FLG: {char(1)}
     * @param pointUseFlg The value of pointUseFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointUseFlg_GreaterThan(String pointUseFlg) {
        regPointUseFlg(CK_GT, fRES(pointUseFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_USE_FLG: {char(1)}
     * @param pointUseFlg The value of pointUseFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointUseFlg_LessThan(String pointUseFlg) {
        regPointUseFlg(CK_LT, fRES(pointUseFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_USE_FLG: {char(1)}
     * @param pointUseFlg The value of pointUseFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointUseFlg_GreaterEqual(String pointUseFlg) {
        regPointUseFlg(CK_GE, fRES(pointUseFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_USE_FLG: {char(1)}
     * @param pointUseFlg The value of pointUseFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointUseFlg_LessEqual(String pointUseFlg) {
        regPointUseFlg(CK_LE, fRES(pointUseFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POINT_USE_FLG: {char(1)}
     * @param pointUseFlgList The collection of pointUseFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointUseFlg_InScope(Collection<String> pointUseFlgList) {
        doSetPointUseFlg_InScope(pointUseFlgList);
    }

    protected void doSetPointUseFlg_InScope(Collection<String> pointUseFlgList) {
        regINS(CK_INS, cTL(pointUseFlgList), xgetCValuePointUseFlg(), "POINT_USE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POINT_USE_FLG: {char(1)}
     * @param pointUseFlgList The collection of pointUseFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointUseFlg_NotInScope(Collection<String> pointUseFlgList) {
        doSetPointUseFlg_NotInScope(pointUseFlgList);
    }

    protected void doSetPointUseFlg_NotInScope(Collection<String> pointUseFlgList) {
        regINS(CK_NINS, cTL(pointUseFlgList), xgetCValuePointUseFlg(), "POINT_USE_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_USE_FLG: {char(1)} <br>
     * <pre>e.g. setPointUseFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pointUseFlg The value of pointUseFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPointUseFlg_LikeSearch(String pointUseFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pointUseFlg), xgetCValuePointUseFlg(), "POINT_USE_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_USE_FLG: {char(1)}
     * @param pointUseFlg The value of pointUseFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPointUseFlg_NotLikeSearch(String pointUseFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pointUseFlg), xgetCValuePointUseFlg(), "POINT_USE_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_USE_FLG: {char(1)}
     * @param pointUseFlg The value of pointUseFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointUseFlg_PrefixSearch(String pointUseFlg) {
        setPointUseFlg_LikeSearch(pointUseFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_USE_FLG: {char(1)}
     */
    public void setPointUseFlg_IsNull() { regPointUseFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_USE_FLG: {char(1)}
     */
    public void setPointUseFlg_IsNotNull() { regPointUseFlg(CK_ISNN, DOBJ); }

    protected void regPointUseFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointUseFlg(), "POINT_USE_FLG"); }
    protected abstract ConditionValue xgetCValuePointUseFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     * @param orderZipCd1 The value of orderZipCd1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd1_Equal(String orderZipCd1) {
        doSetOrderZipCd1_Equal(fRES(orderZipCd1));
    }

    protected void doSetOrderZipCd1_Equal(String orderZipCd1) {
        regOrderZipCd1(CK_EQ, orderZipCd1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     * @param orderZipCd1 The value of orderZipCd1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd1_NotEqual(String orderZipCd1) {
        doSetOrderZipCd1_NotEqual(fRES(orderZipCd1));
    }

    protected void doSetOrderZipCd1_NotEqual(String orderZipCd1) {
        regOrderZipCd1(CK_NES, orderZipCd1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     * @param orderZipCd1 The value of orderZipCd1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd1_GreaterThan(String orderZipCd1) {
        regOrderZipCd1(CK_GT, fRES(orderZipCd1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     * @param orderZipCd1 The value of orderZipCd1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd1_LessThan(String orderZipCd1) {
        regOrderZipCd1(CK_LT, fRES(orderZipCd1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     * @param orderZipCd1 The value of orderZipCd1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd1_GreaterEqual(String orderZipCd1) {
        regOrderZipCd1(CK_GE, fRES(orderZipCd1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     * @param orderZipCd1 The value of orderZipCd1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd1_LessEqual(String orderZipCd1) {
        regOrderZipCd1(CK_LE, fRES(orderZipCd1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     * @param orderZipCd1List The collection of orderZipCd1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd1_InScope(Collection<String> orderZipCd1List) {
        doSetOrderZipCd1_InScope(orderZipCd1List);
    }

    protected void doSetOrderZipCd1_InScope(Collection<String> orderZipCd1List) {
        regINS(CK_INS, cTL(orderZipCd1List), xgetCValueOrderZipCd1(), "ORDER_ZIP_CD1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     * @param orderZipCd1List The collection of orderZipCd1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd1_NotInScope(Collection<String> orderZipCd1List) {
        doSetOrderZipCd1_NotInScope(orderZipCd1List);
    }

    protected void doSetOrderZipCd1_NotInScope(Collection<String> orderZipCd1List) {
        regINS(CK_NINS, cTL(orderZipCd1List), xgetCValueOrderZipCd1(), "ORDER_ZIP_CD1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD1: {varchar(30)} <br>
     * <pre>e.g. setOrderZipCd1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderZipCd1 The value of orderZipCd1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderZipCd1_LikeSearch(String orderZipCd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderZipCd1), xgetCValueOrderZipCd1(), "ORDER_ZIP_CD1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     * @param orderZipCd1 The value of orderZipCd1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderZipCd1_NotLikeSearch(String orderZipCd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderZipCd1), xgetCValueOrderZipCd1(), "ORDER_ZIP_CD1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     * @param orderZipCd1 The value of orderZipCd1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd1_PrefixSearch(String orderZipCd1) {
        setOrderZipCd1_LikeSearch(orderZipCd1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     */
    public void setOrderZipCd1_IsNull() { regOrderZipCd1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     */
    public void setOrderZipCd1_IsNullOrEmpty() { regOrderZipCd1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD1: {varchar(30)}
     */
    public void setOrderZipCd1_IsNotNull() { regOrderZipCd1(CK_ISNN, DOBJ); }

    protected void regOrderZipCd1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderZipCd1(), "ORDER_ZIP_CD1"); }
    protected abstract ConditionValue xgetCValueOrderZipCd1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     * @param orderZipCd2 The value of orderZipCd2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd2_Equal(String orderZipCd2) {
        doSetOrderZipCd2_Equal(fRES(orderZipCd2));
    }

    protected void doSetOrderZipCd2_Equal(String orderZipCd2) {
        regOrderZipCd2(CK_EQ, orderZipCd2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     * @param orderZipCd2 The value of orderZipCd2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd2_NotEqual(String orderZipCd2) {
        doSetOrderZipCd2_NotEqual(fRES(orderZipCd2));
    }

    protected void doSetOrderZipCd2_NotEqual(String orderZipCd2) {
        regOrderZipCd2(CK_NES, orderZipCd2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     * @param orderZipCd2 The value of orderZipCd2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd2_GreaterThan(String orderZipCd2) {
        regOrderZipCd2(CK_GT, fRES(orderZipCd2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     * @param orderZipCd2 The value of orderZipCd2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd2_LessThan(String orderZipCd2) {
        regOrderZipCd2(CK_LT, fRES(orderZipCd2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     * @param orderZipCd2 The value of orderZipCd2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd2_GreaterEqual(String orderZipCd2) {
        regOrderZipCd2(CK_GE, fRES(orderZipCd2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     * @param orderZipCd2 The value of orderZipCd2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd2_LessEqual(String orderZipCd2) {
        regOrderZipCd2(CK_LE, fRES(orderZipCd2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     * @param orderZipCd2List The collection of orderZipCd2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd2_InScope(Collection<String> orderZipCd2List) {
        doSetOrderZipCd2_InScope(orderZipCd2List);
    }

    protected void doSetOrderZipCd2_InScope(Collection<String> orderZipCd2List) {
        regINS(CK_INS, cTL(orderZipCd2List), xgetCValueOrderZipCd2(), "ORDER_ZIP_CD2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     * @param orderZipCd2List The collection of orderZipCd2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd2_NotInScope(Collection<String> orderZipCd2List) {
        doSetOrderZipCd2_NotInScope(orderZipCd2List);
    }

    protected void doSetOrderZipCd2_NotInScope(Collection<String> orderZipCd2List) {
        regINS(CK_NINS, cTL(orderZipCd2List), xgetCValueOrderZipCd2(), "ORDER_ZIP_CD2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD2: {varchar(30)} <br>
     * <pre>e.g. setOrderZipCd2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderZipCd2 The value of orderZipCd2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderZipCd2_LikeSearch(String orderZipCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderZipCd2), xgetCValueOrderZipCd2(), "ORDER_ZIP_CD2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     * @param orderZipCd2 The value of orderZipCd2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderZipCd2_NotLikeSearch(String orderZipCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderZipCd2), xgetCValueOrderZipCd2(), "ORDER_ZIP_CD2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     * @param orderZipCd2 The value of orderZipCd2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderZipCd2_PrefixSearch(String orderZipCd2) {
        setOrderZipCd2_LikeSearch(orderZipCd2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     */
    public void setOrderZipCd2_IsNull() { regOrderZipCd2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     */
    public void setOrderZipCd2_IsNullOrEmpty() { regOrderZipCd2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_ZIP_CD2: {varchar(30)}
     */
    public void setOrderZipCd2_IsNotNull() { regOrderZipCd2(CK_ISNN, DOBJ); }

    protected void regOrderZipCd2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderZipCd2(), "ORDER_ZIP_CD2"); }
    protected abstract ConditionValue xgetCValueOrderZipCd2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_Equal(String orderAddress1) {
        doSetOrderAddress1_Equal(fRES(orderAddress1));
    }

    protected void doSetOrderAddress1_Equal(String orderAddress1) {
        regOrderAddress1(CK_EQ, orderAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_NotEqual(String orderAddress1) {
        doSetOrderAddress1_NotEqual(fRES(orderAddress1));
    }

    protected void doSetOrderAddress1_NotEqual(String orderAddress1) {
        regOrderAddress1(CK_NES, orderAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_GreaterThan(String orderAddress1) {
        regOrderAddress1(CK_GT, fRES(orderAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_LessThan(String orderAddress1) {
        regOrderAddress1(CK_LT, fRES(orderAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_GreaterEqual(String orderAddress1) {
        regOrderAddress1(CK_GE, fRES(orderAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_LessEqual(String orderAddress1) {
        regOrderAddress1(CK_LE, fRES(orderAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1List The collection of orderAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_InScope(Collection<String> orderAddress1List) {
        doSetOrderAddress1_InScope(orderAddress1List);
    }

    protected void doSetOrderAddress1_InScope(Collection<String> orderAddress1List) {
        regINS(CK_INS, cTL(orderAddress1List), xgetCValueOrderAddress1(), "ORDER_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1List The collection of orderAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_NotInScope(Collection<String> orderAddress1List) {
        doSetOrderAddress1_NotInScope(orderAddress1List);
    }

    protected void doSetOrderAddress1_NotInScope(Collection<String> orderAddress1List) {
        regINS(CK_NINS, cTL(orderAddress1List), xgetCValueOrderAddress1(), "ORDER_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)} <br>
     * <pre>e.g. setOrderAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderAddress1 The value of orderAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderAddress1_LikeSearch(String orderAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderAddress1), xgetCValueOrderAddress1(), "ORDER_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderAddress1_NotLikeSearch(String orderAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderAddress1), xgetCValueOrderAddress1(), "ORDER_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     * @param orderAddress1 The value of orderAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress1_PrefixSearch(String orderAddress1) {
        setOrderAddress1_LikeSearch(orderAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     */
    public void setOrderAddress1_IsNull() { regOrderAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     */
    public void setOrderAddress1_IsNullOrEmpty() { regOrderAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS1: {varchar(255)}
     */
    public void setOrderAddress1_IsNotNull() { regOrderAddress1(CK_ISNN, DOBJ); }

    protected void regOrderAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderAddress1(), "ORDER_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueOrderAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_Equal(String orderAddress2) {
        doSetOrderAddress2_Equal(fRES(orderAddress2));
    }

    protected void doSetOrderAddress2_Equal(String orderAddress2) {
        regOrderAddress2(CK_EQ, orderAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_NotEqual(String orderAddress2) {
        doSetOrderAddress2_NotEqual(fRES(orderAddress2));
    }

    protected void doSetOrderAddress2_NotEqual(String orderAddress2) {
        regOrderAddress2(CK_NES, orderAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_GreaterThan(String orderAddress2) {
        regOrderAddress2(CK_GT, fRES(orderAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_LessThan(String orderAddress2) {
        regOrderAddress2(CK_LT, fRES(orderAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_GreaterEqual(String orderAddress2) {
        regOrderAddress2(CK_GE, fRES(orderAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_LessEqual(String orderAddress2) {
        regOrderAddress2(CK_LE, fRES(orderAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2List The collection of orderAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_InScope(Collection<String> orderAddress2List) {
        doSetOrderAddress2_InScope(orderAddress2List);
    }

    protected void doSetOrderAddress2_InScope(Collection<String> orderAddress2List) {
        regINS(CK_INS, cTL(orderAddress2List), xgetCValueOrderAddress2(), "ORDER_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2List The collection of orderAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_NotInScope(Collection<String> orderAddress2List) {
        doSetOrderAddress2_NotInScope(orderAddress2List);
    }

    protected void doSetOrderAddress2_NotInScope(Collection<String> orderAddress2List) {
        regINS(CK_NINS, cTL(orderAddress2List), xgetCValueOrderAddress2(), "ORDER_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)} <br>
     * <pre>e.g. setOrderAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderAddress2 The value of orderAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderAddress2_LikeSearch(String orderAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderAddress2), xgetCValueOrderAddress2(), "ORDER_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderAddress2_NotLikeSearch(String orderAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderAddress2), xgetCValueOrderAddress2(), "ORDER_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     * @param orderAddress2 The value of orderAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress2_PrefixSearch(String orderAddress2) {
        setOrderAddress2_LikeSearch(orderAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     */
    public void setOrderAddress2_IsNull() { regOrderAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     */
    public void setOrderAddress2_IsNullOrEmpty() { regOrderAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS2: {varchar(255)}
     */
    public void setOrderAddress2_IsNotNull() { regOrderAddress2(CK_ISNN, DOBJ); }

    protected void regOrderAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderAddress2(), "ORDER_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueOrderAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_Equal(String orderAddress3) {
        doSetOrderAddress3_Equal(fRES(orderAddress3));
    }

    protected void doSetOrderAddress3_Equal(String orderAddress3) {
        regOrderAddress3(CK_EQ, orderAddress3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_NotEqual(String orderAddress3) {
        doSetOrderAddress3_NotEqual(fRES(orderAddress3));
    }

    protected void doSetOrderAddress3_NotEqual(String orderAddress3) {
        regOrderAddress3(CK_NES, orderAddress3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_GreaterThan(String orderAddress3) {
        regOrderAddress3(CK_GT, fRES(orderAddress3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_LessThan(String orderAddress3) {
        regOrderAddress3(CK_LT, fRES(orderAddress3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_GreaterEqual(String orderAddress3) {
        regOrderAddress3(CK_GE, fRES(orderAddress3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_LessEqual(String orderAddress3) {
        regOrderAddress3(CK_LE, fRES(orderAddress3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3List The collection of orderAddress3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_InScope(Collection<String> orderAddress3List) {
        doSetOrderAddress3_InScope(orderAddress3List);
    }

    protected void doSetOrderAddress3_InScope(Collection<String> orderAddress3List) {
        regINS(CK_INS, cTL(orderAddress3List), xgetCValueOrderAddress3(), "ORDER_ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3List The collection of orderAddress3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_NotInScope(Collection<String> orderAddress3List) {
        doSetOrderAddress3_NotInScope(orderAddress3List);
    }

    protected void doSetOrderAddress3_NotInScope(Collection<String> orderAddress3List) {
        regINS(CK_NINS, cTL(orderAddress3List), xgetCValueOrderAddress3(), "ORDER_ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)} <br>
     * <pre>e.g. setOrderAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderAddress3 The value of orderAddress3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderAddress3_LikeSearch(String orderAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderAddress3), xgetCValueOrderAddress3(), "ORDER_ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderAddress3_NotLikeSearch(String orderAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderAddress3), xgetCValueOrderAddress3(), "ORDER_ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     * @param orderAddress3 The value of orderAddress3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderAddress3_PrefixSearch(String orderAddress3) {
        setOrderAddress3_LikeSearch(orderAddress3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     */
    public void setOrderAddress3_IsNull() { regOrderAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     */
    public void setOrderAddress3_IsNullOrEmpty() { regOrderAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_ADDRESS3: {varchar(255)}
     */
    public void setOrderAddress3_IsNotNull() { regOrderAddress3(CK_ISNN, DOBJ); }

    protected void regOrderAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderAddress3(), "ORDER_ADDRESS3"); }
    protected abstract ConditionValue xgetCValueOrderAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     * @param orderCustomerNm1 The value of orderCustomerNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm1_Equal(String orderCustomerNm1) {
        doSetOrderCustomerNm1_Equal(fRES(orderCustomerNm1));
    }

    protected void doSetOrderCustomerNm1_Equal(String orderCustomerNm1) {
        regOrderCustomerNm1(CK_EQ, orderCustomerNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     * @param orderCustomerNm1 The value of orderCustomerNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm1_NotEqual(String orderCustomerNm1) {
        doSetOrderCustomerNm1_NotEqual(fRES(orderCustomerNm1));
    }

    protected void doSetOrderCustomerNm1_NotEqual(String orderCustomerNm1) {
        regOrderCustomerNm1(CK_NES, orderCustomerNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     * @param orderCustomerNm1 The value of orderCustomerNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm1_GreaterThan(String orderCustomerNm1) {
        regOrderCustomerNm1(CK_GT, fRES(orderCustomerNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     * @param orderCustomerNm1 The value of orderCustomerNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm1_LessThan(String orderCustomerNm1) {
        regOrderCustomerNm1(CK_LT, fRES(orderCustomerNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     * @param orderCustomerNm1 The value of orderCustomerNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm1_GreaterEqual(String orderCustomerNm1) {
        regOrderCustomerNm1(CK_GE, fRES(orderCustomerNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     * @param orderCustomerNm1 The value of orderCustomerNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm1_LessEqual(String orderCustomerNm1) {
        regOrderCustomerNm1(CK_LE, fRES(orderCustomerNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     * @param orderCustomerNm1List The collection of orderCustomerNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm1_InScope(Collection<String> orderCustomerNm1List) {
        doSetOrderCustomerNm1_InScope(orderCustomerNm1List);
    }

    protected void doSetOrderCustomerNm1_InScope(Collection<String> orderCustomerNm1List) {
        regINS(CK_INS, cTL(orderCustomerNm1List), xgetCValueOrderCustomerNm1(), "ORDER_CUSTOMER_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     * @param orderCustomerNm1List The collection of orderCustomerNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm1_NotInScope(Collection<String> orderCustomerNm1List) {
        doSetOrderCustomerNm1_NotInScope(orderCustomerNm1List);
    }

    protected void doSetOrderCustomerNm1_NotInScope(Collection<String> orderCustomerNm1List) {
        regINS(CK_NINS, cTL(orderCustomerNm1List), xgetCValueOrderCustomerNm1(), "ORDER_CUSTOMER_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)} <br>
     * <pre>e.g. setOrderCustomerNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderCustomerNm1 The value of orderCustomerNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderCustomerNm1_LikeSearch(String orderCustomerNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderCustomerNm1), xgetCValueOrderCustomerNm1(), "ORDER_CUSTOMER_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     * @param orderCustomerNm1 The value of orderCustomerNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderCustomerNm1_NotLikeSearch(String orderCustomerNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderCustomerNm1), xgetCValueOrderCustomerNm1(), "ORDER_CUSTOMER_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     * @param orderCustomerNm1 The value of orderCustomerNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm1_PrefixSearch(String orderCustomerNm1) {
        setOrderCustomerNm1_LikeSearch(orderCustomerNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     */
    public void setOrderCustomerNm1_IsNull() { regOrderCustomerNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     */
    public void setOrderCustomerNm1_IsNullOrEmpty() { regOrderCustomerNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     */
    public void setOrderCustomerNm1_IsNotNull() { regOrderCustomerNm1(CK_ISNN, DOBJ); }

    protected void regOrderCustomerNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderCustomerNm1(), "ORDER_CUSTOMER_NM1"); }
    protected abstract ConditionValue xgetCValueOrderCustomerNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     * @param orderCustomerNm2 The value of orderCustomerNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm2_Equal(String orderCustomerNm2) {
        doSetOrderCustomerNm2_Equal(fRES(orderCustomerNm2));
    }

    protected void doSetOrderCustomerNm2_Equal(String orderCustomerNm2) {
        regOrderCustomerNm2(CK_EQ, orderCustomerNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     * @param orderCustomerNm2 The value of orderCustomerNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm2_NotEqual(String orderCustomerNm2) {
        doSetOrderCustomerNm2_NotEqual(fRES(orderCustomerNm2));
    }

    protected void doSetOrderCustomerNm2_NotEqual(String orderCustomerNm2) {
        regOrderCustomerNm2(CK_NES, orderCustomerNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     * @param orderCustomerNm2 The value of orderCustomerNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm2_GreaterThan(String orderCustomerNm2) {
        regOrderCustomerNm2(CK_GT, fRES(orderCustomerNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     * @param orderCustomerNm2 The value of orderCustomerNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm2_LessThan(String orderCustomerNm2) {
        regOrderCustomerNm2(CK_LT, fRES(orderCustomerNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     * @param orderCustomerNm2 The value of orderCustomerNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm2_GreaterEqual(String orderCustomerNm2) {
        regOrderCustomerNm2(CK_GE, fRES(orderCustomerNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     * @param orderCustomerNm2 The value of orderCustomerNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm2_LessEqual(String orderCustomerNm2) {
        regOrderCustomerNm2(CK_LE, fRES(orderCustomerNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     * @param orderCustomerNm2List The collection of orderCustomerNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm2_InScope(Collection<String> orderCustomerNm2List) {
        doSetOrderCustomerNm2_InScope(orderCustomerNm2List);
    }

    protected void doSetOrderCustomerNm2_InScope(Collection<String> orderCustomerNm2List) {
        regINS(CK_INS, cTL(orderCustomerNm2List), xgetCValueOrderCustomerNm2(), "ORDER_CUSTOMER_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     * @param orderCustomerNm2List The collection of orderCustomerNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm2_NotInScope(Collection<String> orderCustomerNm2List) {
        doSetOrderCustomerNm2_NotInScope(orderCustomerNm2List);
    }

    protected void doSetOrderCustomerNm2_NotInScope(Collection<String> orderCustomerNm2List) {
        regINS(CK_NINS, cTL(orderCustomerNm2List), xgetCValueOrderCustomerNm2(), "ORDER_CUSTOMER_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)} <br>
     * <pre>e.g. setOrderCustomerNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderCustomerNm2 The value of orderCustomerNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderCustomerNm2_LikeSearch(String orderCustomerNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderCustomerNm2), xgetCValueOrderCustomerNm2(), "ORDER_CUSTOMER_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     * @param orderCustomerNm2 The value of orderCustomerNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderCustomerNm2_NotLikeSearch(String orderCustomerNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderCustomerNm2), xgetCValueOrderCustomerNm2(), "ORDER_CUSTOMER_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     * @param orderCustomerNm2 The value of orderCustomerNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerNm2_PrefixSearch(String orderCustomerNm2) {
        setOrderCustomerNm2_LikeSearch(orderCustomerNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     */
    public void setOrderCustomerNm2_IsNull() { regOrderCustomerNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     */
    public void setOrderCustomerNm2_IsNullOrEmpty() { regOrderCustomerNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     */
    public void setOrderCustomerNm2_IsNotNull() { regOrderCustomerNm2(CK_ISNN, DOBJ); }

    protected void regOrderCustomerNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderCustomerNm2(), "ORDER_CUSTOMER_NM2"); }
    protected abstract ConditionValue xgetCValueOrderCustomerNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     * @param orderCustomerKn1 The value of orderCustomerKn1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn1_Equal(String orderCustomerKn1) {
        doSetOrderCustomerKn1_Equal(fRES(orderCustomerKn1));
    }

    protected void doSetOrderCustomerKn1_Equal(String orderCustomerKn1) {
        regOrderCustomerKn1(CK_EQ, orderCustomerKn1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     * @param orderCustomerKn1 The value of orderCustomerKn1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn1_NotEqual(String orderCustomerKn1) {
        doSetOrderCustomerKn1_NotEqual(fRES(orderCustomerKn1));
    }

    protected void doSetOrderCustomerKn1_NotEqual(String orderCustomerKn1) {
        regOrderCustomerKn1(CK_NES, orderCustomerKn1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     * @param orderCustomerKn1 The value of orderCustomerKn1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn1_GreaterThan(String orderCustomerKn1) {
        regOrderCustomerKn1(CK_GT, fRES(orderCustomerKn1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     * @param orderCustomerKn1 The value of orderCustomerKn1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn1_LessThan(String orderCustomerKn1) {
        regOrderCustomerKn1(CK_LT, fRES(orderCustomerKn1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     * @param orderCustomerKn1 The value of orderCustomerKn1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn1_GreaterEqual(String orderCustomerKn1) {
        regOrderCustomerKn1(CK_GE, fRES(orderCustomerKn1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     * @param orderCustomerKn1 The value of orderCustomerKn1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn1_LessEqual(String orderCustomerKn1) {
        regOrderCustomerKn1(CK_LE, fRES(orderCustomerKn1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     * @param orderCustomerKn1List The collection of orderCustomerKn1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn1_InScope(Collection<String> orderCustomerKn1List) {
        doSetOrderCustomerKn1_InScope(orderCustomerKn1List);
    }

    protected void doSetOrderCustomerKn1_InScope(Collection<String> orderCustomerKn1List) {
        regINS(CK_INS, cTL(orderCustomerKn1List), xgetCValueOrderCustomerKn1(), "ORDER_CUSTOMER_KN1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     * @param orderCustomerKn1List The collection of orderCustomerKn1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn1_NotInScope(Collection<String> orderCustomerKn1List) {
        doSetOrderCustomerKn1_NotInScope(orderCustomerKn1List);
    }

    protected void doSetOrderCustomerKn1_NotInScope(Collection<String> orderCustomerKn1List) {
        regINS(CK_NINS, cTL(orderCustomerKn1List), xgetCValueOrderCustomerKn1(), "ORDER_CUSTOMER_KN1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)} <br>
     * <pre>e.g. setOrderCustomerKn1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderCustomerKn1 The value of orderCustomerKn1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderCustomerKn1_LikeSearch(String orderCustomerKn1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderCustomerKn1), xgetCValueOrderCustomerKn1(), "ORDER_CUSTOMER_KN1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     * @param orderCustomerKn1 The value of orderCustomerKn1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderCustomerKn1_NotLikeSearch(String orderCustomerKn1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderCustomerKn1), xgetCValueOrderCustomerKn1(), "ORDER_CUSTOMER_KN1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     * @param orderCustomerKn1 The value of orderCustomerKn1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn1_PrefixSearch(String orderCustomerKn1) {
        setOrderCustomerKn1_LikeSearch(orderCustomerKn1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     */
    public void setOrderCustomerKn1_IsNull() { regOrderCustomerKn1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     */
    public void setOrderCustomerKn1_IsNullOrEmpty() { regOrderCustomerKn1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     */
    public void setOrderCustomerKn1_IsNotNull() { regOrderCustomerKn1(CK_ISNN, DOBJ); }

    protected void regOrderCustomerKn1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderCustomerKn1(), "ORDER_CUSTOMER_KN1"); }
    protected abstract ConditionValue xgetCValueOrderCustomerKn1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     * @param orderCustomerKn2 The value of orderCustomerKn2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn2_Equal(String orderCustomerKn2) {
        doSetOrderCustomerKn2_Equal(fRES(orderCustomerKn2));
    }

    protected void doSetOrderCustomerKn2_Equal(String orderCustomerKn2) {
        regOrderCustomerKn2(CK_EQ, orderCustomerKn2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     * @param orderCustomerKn2 The value of orderCustomerKn2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn2_NotEqual(String orderCustomerKn2) {
        doSetOrderCustomerKn2_NotEqual(fRES(orderCustomerKn2));
    }

    protected void doSetOrderCustomerKn2_NotEqual(String orderCustomerKn2) {
        regOrderCustomerKn2(CK_NES, orderCustomerKn2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     * @param orderCustomerKn2 The value of orderCustomerKn2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn2_GreaterThan(String orderCustomerKn2) {
        regOrderCustomerKn2(CK_GT, fRES(orderCustomerKn2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     * @param orderCustomerKn2 The value of orderCustomerKn2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn2_LessThan(String orderCustomerKn2) {
        regOrderCustomerKn2(CK_LT, fRES(orderCustomerKn2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     * @param orderCustomerKn2 The value of orderCustomerKn2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn2_GreaterEqual(String orderCustomerKn2) {
        regOrderCustomerKn2(CK_GE, fRES(orderCustomerKn2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     * @param orderCustomerKn2 The value of orderCustomerKn2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn2_LessEqual(String orderCustomerKn2) {
        regOrderCustomerKn2(CK_LE, fRES(orderCustomerKn2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     * @param orderCustomerKn2List The collection of orderCustomerKn2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn2_InScope(Collection<String> orderCustomerKn2List) {
        doSetOrderCustomerKn2_InScope(orderCustomerKn2List);
    }

    protected void doSetOrderCustomerKn2_InScope(Collection<String> orderCustomerKn2List) {
        regINS(CK_INS, cTL(orderCustomerKn2List), xgetCValueOrderCustomerKn2(), "ORDER_CUSTOMER_KN2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     * @param orderCustomerKn2List The collection of orderCustomerKn2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn2_NotInScope(Collection<String> orderCustomerKn2List) {
        doSetOrderCustomerKn2_NotInScope(orderCustomerKn2List);
    }

    protected void doSetOrderCustomerKn2_NotInScope(Collection<String> orderCustomerKn2List) {
        regINS(CK_NINS, cTL(orderCustomerKn2List), xgetCValueOrderCustomerKn2(), "ORDER_CUSTOMER_KN2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)} <br>
     * <pre>e.g. setOrderCustomerKn2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderCustomerKn2 The value of orderCustomerKn2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderCustomerKn2_LikeSearch(String orderCustomerKn2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderCustomerKn2), xgetCValueOrderCustomerKn2(), "ORDER_CUSTOMER_KN2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     * @param orderCustomerKn2 The value of orderCustomerKn2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderCustomerKn2_NotLikeSearch(String orderCustomerKn2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderCustomerKn2), xgetCValueOrderCustomerKn2(), "ORDER_CUSTOMER_KN2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     * @param orderCustomerKn2 The value of orderCustomerKn2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderCustomerKn2_PrefixSearch(String orderCustomerKn2) {
        setOrderCustomerKn2_LikeSearch(orderCustomerKn2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     */
    public void setOrderCustomerKn2_IsNull() { regOrderCustomerKn2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     */
    public void setOrderCustomerKn2_IsNullOrEmpty() { regOrderCustomerKn2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     */
    public void setOrderCustomerKn2_IsNotNull() { regOrderCustomerKn2(CK_ISNN, DOBJ); }

    protected void regOrderCustomerKn2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderCustomerKn2(), "ORDER_CUSTOMER_KN2"); }
    protected abstract ConditionValue xgetCValueOrderCustomerKn2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     * @param orderTelNo1 The value of orderTelNo1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo1_Equal(String orderTelNo1) {
        doSetOrderTelNo1_Equal(fRES(orderTelNo1));
    }

    protected void doSetOrderTelNo1_Equal(String orderTelNo1) {
        regOrderTelNo1(CK_EQ, orderTelNo1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     * @param orderTelNo1 The value of orderTelNo1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo1_NotEqual(String orderTelNo1) {
        doSetOrderTelNo1_NotEqual(fRES(orderTelNo1));
    }

    protected void doSetOrderTelNo1_NotEqual(String orderTelNo1) {
        regOrderTelNo1(CK_NES, orderTelNo1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     * @param orderTelNo1 The value of orderTelNo1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo1_GreaterThan(String orderTelNo1) {
        regOrderTelNo1(CK_GT, fRES(orderTelNo1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     * @param orderTelNo1 The value of orderTelNo1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo1_LessThan(String orderTelNo1) {
        regOrderTelNo1(CK_LT, fRES(orderTelNo1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     * @param orderTelNo1 The value of orderTelNo1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo1_GreaterEqual(String orderTelNo1) {
        regOrderTelNo1(CK_GE, fRES(orderTelNo1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     * @param orderTelNo1 The value of orderTelNo1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo1_LessEqual(String orderTelNo1) {
        regOrderTelNo1(CK_LE, fRES(orderTelNo1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     * @param orderTelNo1List The collection of orderTelNo1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo1_InScope(Collection<String> orderTelNo1List) {
        doSetOrderTelNo1_InScope(orderTelNo1List);
    }

    protected void doSetOrderTelNo1_InScope(Collection<String> orderTelNo1List) {
        regINS(CK_INS, cTL(orderTelNo1List), xgetCValueOrderTelNo1(), "ORDER_TEL_NO1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     * @param orderTelNo1List The collection of orderTelNo1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo1_NotInScope(Collection<String> orderTelNo1List) {
        doSetOrderTelNo1_NotInScope(orderTelNo1List);
    }

    protected void doSetOrderTelNo1_NotInScope(Collection<String> orderTelNo1List) {
        regINS(CK_NINS, cTL(orderTelNo1List), xgetCValueOrderTelNo1(), "ORDER_TEL_NO1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO1: {varchar(255)} <br>
     * <pre>e.g. setOrderTelNo1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderTelNo1 The value of orderTelNo1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderTelNo1_LikeSearch(String orderTelNo1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderTelNo1), xgetCValueOrderTelNo1(), "ORDER_TEL_NO1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     * @param orderTelNo1 The value of orderTelNo1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderTelNo1_NotLikeSearch(String orderTelNo1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderTelNo1), xgetCValueOrderTelNo1(), "ORDER_TEL_NO1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     * @param orderTelNo1 The value of orderTelNo1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo1_PrefixSearch(String orderTelNo1) {
        setOrderTelNo1_LikeSearch(orderTelNo1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     */
    public void setOrderTelNo1_IsNull() { regOrderTelNo1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     */
    public void setOrderTelNo1_IsNullOrEmpty() { regOrderTelNo1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_TEL_NO1: {varchar(255)}
     */
    public void setOrderTelNo1_IsNotNull() { regOrderTelNo1(CK_ISNN, DOBJ); }

    protected void regOrderTelNo1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderTelNo1(), "ORDER_TEL_NO1"); }
    protected abstract ConditionValue xgetCValueOrderTelNo1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     * @param orderTelNo2 The value of orderTelNo2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo2_Equal(String orderTelNo2) {
        doSetOrderTelNo2_Equal(fRES(orderTelNo2));
    }

    protected void doSetOrderTelNo2_Equal(String orderTelNo2) {
        regOrderTelNo2(CK_EQ, orderTelNo2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     * @param orderTelNo2 The value of orderTelNo2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo2_NotEqual(String orderTelNo2) {
        doSetOrderTelNo2_NotEqual(fRES(orderTelNo2));
    }

    protected void doSetOrderTelNo2_NotEqual(String orderTelNo2) {
        regOrderTelNo2(CK_NES, orderTelNo2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     * @param orderTelNo2 The value of orderTelNo2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo2_GreaterThan(String orderTelNo2) {
        regOrderTelNo2(CK_GT, fRES(orderTelNo2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     * @param orderTelNo2 The value of orderTelNo2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo2_LessThan(String orderTelNo2) {
        regOrderTelNo2(CK_LT, fRES(orderTelNo2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     * @param orderTelNo2 The value of orderTelNo2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo2_GreaterEqual(String orderTelNo2) {
        regOrderTelNo2(CK_GE, fRES(orderTelNo2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     * @param orderTelNo2 The value of orderTelNo2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo2_LessEqual(String orderTelNo2) {
        regOrderTelNo2(CK_LE, fRES(orderTelNo2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     * @param orderTelNo2List The collection of orderTelNo2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo2_InScope(Collection<String> orderTelNo2List) {
        doSetOrderTelNo2_InScope(orderTelNo2List);
    }

    protected void doSetOrderTelNo2_InScope(Collection<String> orderTelNo2List) {
        regINS(CK_INS, cTL(orderTelNo2List), xgetCValueOrderTelNo2(), "ORDER_TEL_NO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     * @param orderTelNo2List The collection of orderTelNo2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo2_NotInScope(Collection<String> orderTelNo2List) {
        doSetOrderTelNo2_NotInScope(orderTelNo2List);
    }

    protected void doSetOrderTelNo2_NotInScope(Collection<String> orderTelNo2List) {
        regINS(CK_NINS, cTL(orderTelNo2List), xgetCValueOrderTelNo2(), "ORDER_TEL_NO2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO2: {varchar(255)} <br>
     * <pre>e.g. setOrderTelNo2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderTelNo2 The value of orderTelNo2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderTelNo2_LikeSearch(String orderTelNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderTelNo2), xgetCValueOrderTelNo2(), "ORDER_TEL_NO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     * @param orderTelNo2 The value of orderTelNo2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderTelNo2_NotLikeSearch(String orderTelNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderTelNo2), xgetCValueOrderTelNo2(), "ORDER_TEL_NO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     * @param orderTelNo2 The value of orderTelNo2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo2_PrefixSearch(String orderTelNo2) {
        setOrderTelNo2_LikeSearch(orderTelNo2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     */
    public void setOrderTelNo2_IsNull() { regOrderTelNo2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     */
    public void setOrderTelNo2_IsNullOrEmpty() { regOrderTelNo2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_TEL_NO2: {varchar(255)}
     */
    public void setOrderTelNo2_IsNotNull() { regOrderTelNo2(CK_ISNN, DOBJ); }

    protected void regOrderTelNo2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderTelNo2(), "ORDER_TEL_NO2"); }
    protected abstract ConditionValue xgetCValueOrderTelNo2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     * @param orderTelNo3 The value of orderTelNo3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo3_Equal(String orderTelNo3) {
        doSetOrderTelNo3_Equal(fRES(orderTelNo3));
    }

    protected void doSetOrderTelNo3_Equal(String orderTelNo3) {
        regOrderTelNo3(CK_EQ, orderTelNo3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     * @param orderTelNo3 The value of orderTelNo3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo3_NotEqual(String orderTelNo3) {
        doSetOrderTelNo3_NotEqual(fRES(orderTelNo3));
    }

    protected void doSetOrderTelNo3_NotEqual(String orderTelNo3) {
        regOrderTelNo3(CK_NES, orderTelNo3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     * @param orderTelNo3 The value of orderTelNo3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo3_GreaterThan(String orderTelNo3) {
        regOrderTelNo3(CK_GT, fRES(orderTelNo3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     * @param orderTelNo3 The value of orderTelNo3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo3_LessThan(String orderTelNo3) {
        regOrderTelNo3(CK_LT, fRES(orderTelNo3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     * @param orderTelNo3 The value of orderTelNo3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo3_GreaterEqual(String orderTelNo3) {
        regOrderTelNo3(CK_GE, fRES(orderTelNo3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     * @param orderTelNo3 The value of orderTelNo3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo3_LessEqual(String orderTelNo3) {
        regOrderTelNo3(CK_LE, fRES(orderTelNo3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     * @param orderTelNo3List The collection of orderTelNo3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo3_InScope(Collection<String> orderTelNo3List) {
        doSetOrderTelNo3_InScope(orderTelNo3List);
    }

    protected void doSetOrderTelNo3_InScope(Collection<String> orderTelNo3List) {
        regINS(CK_INS, cTL(orderTelNo3List), xgetCValueOrderTelNo3(), "ORDER_TEL_NO3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     * @param orderTelNo3List The collection of orderTelNo3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo3_NotInScope(Collection<String> orderTelNo3List) {
        doSetOrderTelNo3_NotInScope(orderTelNo3List);
    }

    protected void doSetOrderTelNo3_NotInScope(Collection<String> orderTelNo3List) {
        regINS(CK_NINS, cTL(orderTelNo3List), xgetCValueOrderTelNo3(), "ORDER_TEL_NO3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO3: {varchar(255)} <br>
     * <pre>e.g. setOrderTelNo3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderTelNo3 The value of orderTelNo3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderTelNo3_LikeSearch(String orderTelNo3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderTelNo3), xgetCValueOrderTelNo3(), "ORDER_TEL_NO3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     * @param orderTelNo3 The value of orderTelNo3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderTelNo3_NotLikeSearch(String orderTelNo3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderTelNo3), xgetCValueOrderTelNo3(), "ORDER_TEL_NO3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     * @param orderTelNo3 The value of orderTelNo3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTelNo3_PrefixSearch(String orderTelNo3) {
        setOrderTelNo3_LikeSearch(orderTelNo3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     */
    public void setOrderTelNo3_IsNull() { regOrderTelNo3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     */
    public void setOrderTelNo3_IsNullOrEmpty() { regOrderTelNo3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_TEL_NO3: {varchar(255)}
     */
    public void setOrderTelNo3_IsNotNull() { regOrderTelNo3(CK_ISNN, DOBJ); }

    protected void regOrderTelNo3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderTelNo3(), "ORDER_TEL_NO3"); }
    protected abstract ConditionValue xgetCValueOrderTelNo3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_Equal(String mailAddress) {
        doSetMailAddress_Equal(fRES(mailAddress));
    }

    protected void doSetMailAddress_Equal(String mailAddress) {
        regMailAddress(CK_EQ, mailAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_NotEqual(String mailAddress) {
        doSetMailAddress_NotEqual(fRES(mailAddress));
    }

    protected void doSetMailAddress_NotEqual(String mailAddress) {
        regMailAddress(CK_NES, mailAddress);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_GreaterThan(String mailAddress) {
        regMailAddress(CK_GT, fRES(mailAddress));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_LessThan(String mailAddress) {
        regMailAddress(CK_LT, fRES(mailAddress));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_GreaterEqual(String mailAddress) {
        regMailAddress(CK_GE, fRES(mailAddress));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_LessEqual(String mailAddress) {
        regMailAddress(CK_LE, fRES(mailAddress));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddressList The collection of mailAddress as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_InScope(Collection<String> mailAddressList) {
        doSetMailAddress_InScope(mailAddressList);
    }

    protected void doSetMailAddress_InScope(Collection<String> mailAddressList) {
        regINS(CK_INS, cTL(mailAddressList), xgetCValueMailAddress(), "MAIL_ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddressList The collection of mailAddress as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_NotInScope(Collection<String> mailAddressList) {
        doSetMailAddress_NotInScope(mailAddressList);
    }

    protected void doSetMailAddress_NotInScope(Collection<String> mailAddressList) {
        regINS(CK_NINS, cTL(mailAddressList), xgetCValueMailAddress(), "MAIL_ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)} <br>
     * <pre>e.g. setMailAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mailAddress The value of mailAddress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMailAddress_LikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mailAddress), xgetCValueMailAddress(), "MAIL_ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMailAddress_NotLikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mailAddress), xgetCValueMailAddress(), "MAIL_ADDRESS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @param mailAddress The value of mailAddress as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_PrefixSearch(String mailAddress) {
        setMailAddress_LikeSearch(mailAddress, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     */
    public void setMailAddress_IsNull() { regMailAddress(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     */
    public void setMailAddress_IsNullOrEmpty() { regMailAddress(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {varchar(255)}
     */
    public void setMailAddress_IsNotNull() { regMailAddress(CK_ISNN, DOBJ); }

    protected void regMailAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMailAddress(), "MAIL_ADDRESS"); }
    protected abstract ConditionValue xgetCValueMailAddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_SEX: {varchar(30)}
     * @param orderSex The value of orderSex as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSex_Equal(String orderSex) {
        doSetOrderSex_Equal(fRES(orderSex));
    }

    protected void doSetOrderSex_Equal(String orderSex) {
        regOrderSex(CK_EQ, orderSex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_SEX: {varchar(30)}
     * @param orderSex The value of orderSex as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSex_NotEqual(String orderSex) {
        doSetOrderSex_NotEqual(fRES(orderSex));
    }

    protected void doSetOrderSex_NotEqual(String orderSex) {
        regOrderSex(CK_NES, orderSex);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_SEX: {varchar(30)}
     * @param orderSex The value of orderSex as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSex_GreaterThan(String orderSex) {
        regOrderSex(CK_GT, fRES(orderSex));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_SEX: {varchar(30)}
     * @param orderSex The value of orderSex as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSex_LessThan(String orderSex) {
        regOrderSex(CK_LT, fRES(orderSex));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_SEX: {varchar(30)}
     * @param orderSex The value of orderSex as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSex_GreaterEqual(String orderSex) {
        regOrderSex(CK_GE, fRES(orderSex));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_SEX: {varchar(30)}
     * @param orderSex The value of orderSex as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSex_LessEqual(String orderSex) {
        regOrderSex(CK_LE, fRES(orderSex));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_SEX: {varchar(30)}
     * @param orderSexList The collection of orderSex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSex_InScope(Collection<String> orderSexList) {
        doSetOrderSex_InScope(orderSexList);
    }

    protected void doSetOrderSex_InScope(Collection<String> orderSexList) {
        regINS(CK_INS, cTL(orderSexList), xgetCValueOrderSex(), "ORDER_SEX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_SEX: {varchar(30)}
     * @param orderSexList The collection of orderSex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSex_NotInScope(Collection<String> orderSexList) {
        doSetOrderSex_NotInScope(orderSexList);
    }

    protected void doSetOrderSex_NotInScope(Collection<String> orderSexList) {
        regINS(CK_NINS, cTL(orderSexList), xgetCValueOrderSex(), "ORDER_SEX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_SEX: {varchar(30)} <br>
     * <pre>e.g. setOrderSex_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderSex The value of orderSex as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderSex_LikeSearch(String orderSex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderSex), xgetCValueOrderSex(), "ORDER_SEX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_SEX: {varchar(30)}
     * @param orderSex The value of orderSex as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderSex_NotLikeSearch(String orderSex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderSex), xgetCValueOrderSex(), "ORDER_SEX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_SEX: {varchar(30)}
     * @param orderSex The value of orderSex as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderSex_PrefixSearch(String orderSex) {
        setOrderSex_LikeSearch(orderSex, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_SEX: {varchar(30)}
     */
    public void setOrderSex_IsNull() { regOrderSex(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_SEX: {varchar(30)}
     */
    public void setOrderSex_IsNullOrEmpty() { regOrderSex(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_SEX: {varchar(30)}
     */
    public void setOrderSex_IsNotNull() { regOrderSex(CK_ISNN, DOBJ); }

    protected void regOrderSex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderSex(), "ORDER_SEX"); }
    protected abstract ConditionValue xgetCValueOrderSex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     * @param orderBirthday The value of orderBirthday as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderBirthday_Equal(String orderBirthday) {
        doSetOrderBirthday_Equal(fRES(orderBirthday));
    }

    protected void doSetOrderBirthday_Equal(String orderBirthday) {
        regOrderBirthday(CK_EQ, orderBirthday);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     * @param orderBirthday The value of orderBirthday as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderBirthday_NotEqual(String orderBirthday) {
        doSetOrderBirthday_NotEqual(fRES(orderBirthday));
    }

    protected void doSetOrderBirthday_NotEqual(String orderBirthday) {
        regOrderBirthday(CK_NES, orderBirthday);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     * @param orderBirthday The value of orderBirthday as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderBirthday_GreaterThan(String orderBirthday) {
        regOrderBirthday(CK_GT, fRES(orderBirthday));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     * @param orderBirthday The value of orderBirthday as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderBirthday_LessThan(String orderBirthday) {
        regOrderBirthday(CK_LT, fRES(orderBirthday));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     * @param orderBirthday The value of orderBirthday as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderBirthday_GreaterEqual(String orderBirthday) {
        regOrderBirthday(CK_GE, fRES(orderBirthday));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     * @param orderBirthday The value of orderBirthday as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderBirthday_LessEqual(String orderBirthday) {
        regOrderBirthday(CK_LE, fRES(orderBirthday));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     * @param orderBirthdayList The collection of orderBirthday as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderBirthday_InScope(Collection<String> orderBirthdayList) {
        doSetOrderBirthday_InScope(orderBirthdayList);
    }

    protected void doSetOrderBirthday_InScope(Collection<String> orderBirthdayList) {
        regINS(CK_INS, cTL(orderBirthdayList), xgetCValueOrderBirthday(), "ORDER_BIRTHDAY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     * @param orderBirthdayList The collection of orderBirthday as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderBirthday_NotInScope(Collection<String> orderBirthdayList) {
        doSetOrderBirthday_NotInScope(orderBirthdayList);
    }

    protected void doSetOrderBirthday_NotInScope(Collection<String> orderBirthdayList) {
        regINS(CK_NINS, cTL(orderBirthdayList), xgetCValueOrderBirthday(), "ORDER_BIRTHDAY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_BIRTHDAY: {varchar(30)} <br>
     * <pre>e.g. setOrderBirthday_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderBirthday The value of orderBirthday as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderBirthday_LikeSearch(String orderBirthday, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderBirthday), xgetCValueOrderBirthday(), "ORDER_BIRTHDAY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     * @param orderBirthday The value of orderBirthday as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderBirthday_NotLikeSearch(String orderBirthday, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderBirthday), xgetCValueOrderBirthday(), "ORDER_BIRTHDAY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     * @param orderBirthday The value of orderBirthday as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderBirthday_PrefixSearch(String orderBirthday) {
        setOrderBirthday_LikeSearch(orderBirthday, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     */
    public void setOrderBirthday_IsNull() { regOrderBirthday(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     */
    public void setOrderBirthday_IsNullOrEmpty() { regOrderBirthday(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_BIRTHDAY: {varchar(30)}
     */
    public void setOrderBirthday_IsNotNull() { regOrderBirthday(CK_ISNN, DOBJ); }

    protected void regOrderBirthday(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderBirthday(), "ORDER_BIRTHDAY"); }
    protected abstract ConditionValue xgetCValueOrderBirthday();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
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
     * PAYMENT_METHOD: {varchar(255)}
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
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethod The value of paymentMethod as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_GreaterThan(String paymentMethod) {
        regPaymentMethod(CK_GT, fRES(paymentMethod));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethod The value of paymentMethod as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_LessThan(String paymentMethod) {
        regPaymentMethod(CK_LT, fRES(paymentMethod));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethod The value of paymentMethod as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_GreaterEqual(String paymentMethod) {
        regPaymentMethod(CK_GE, fRES(paymentMethod));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethod The value of paymentMethod as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_LessEqual(String paymentMethod) {
        regPaymentMethod(CK_LE, fRES(paymentMethod));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
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
     * PAYMENT_METHOD: {varchar(255)}
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
     * PAYMENT_METHOD: {varchar(255)} <br>
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
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethod The value of paymentMethod as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPaymentMethod_NotLikeSearch(String paymentMethod, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(paymentMethod), xgetCValuePaymentMethod(), "PAYMENT_METHOD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     * @param paymentMethod The value of paymentMethod as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethod_PrefixSearch(String paymentMethod) {
        setPaymentMethod_LikeSearch(paymentMethod, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     */
    public void setPaymentMethod_IsNull() { regPaymentMethod(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     */
    public void setPaymentMethod_IsNullOrEmpty() { regPaymentMethod(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAYMENT_METHOD: {varchar(255)}
     */
    public void setPaymentMethod_IsNotNull() { regPaymentMethod(CK_ISNN, DOBJ); }

    protected void regPaymentMethod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentMethod(), "PAYMENT_METHOD"); }
    protected abstract ConditionValue xgetCValuePaymentMethod();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(100)}
     * @param cardType The value of cardType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_Equal(String cardType) {
        doSetCardType_Equal(fRES(cardType));
    }

    protected void doSetCardType_Equal(String cardType) {
        regCardType(CK_EQ, cardType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(100)}
     * @param cardType The value of cardType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_NotEqual(String cardType) {
        doSetCardType_NotEqual(fRES(cardType));
    }

    protected void doSetCardType_NotEqual(String cardType) {
        regCardType(CK_NES, cardType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(100)}
     * @param cardType The value of cardType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_GreaterThan(String cardType) {
        regCardType(CK_GT, fRES(cardType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(100)}
     * @param cardType The value of cardType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_LessThan(String cardType) {
        regCardType(CK_LT, fRES(cardType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(100)}
     * @param cardType The value of cardType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_GreaterEqual(String cardType) {
        regCardType(CK_GE, fRES(cardType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(100)}
     * @param cardType The value of cardType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_LessEqual(String cardType) {
        regCardType(CK_LE, fRES(cardType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_TYPE: {varchar(100)}
     * @param cardTypeList The collection of cardType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_InScope(Collection<String> cardTypeList) {
        doSetCardType_InScope(cardTypeList);
    }

    protected void doSetCardType_InScope(Collection<String> cardTypeList) {
        regINS(CK_INS, cTL(cardTypeList), xgetCValueCardType(), "CARD_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_TYPE: {varchar(100)}
     * @param cardTypeList The collection of cardType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_NotInScope(Collection<String> cardTypeList) {
        doSetCardType_NotInScope(cardTypeList);
    }

    protected void doSetCardType_NotInScope(Collection<String> cardTypeList) {
        regINS(CK_NINS, cTL(cardTypeList), xgetCValueCardType(), "CARD_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_TYPE: {varchar(100)} <br>
     * <pre>e.g. setCardType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cardType The value of cardType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardType_LikeSearch(String cardType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cardType), xgetCValueCardType(), "CARD_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_TYPE: {varchar(100)}
     * @param cardType The value of cardType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCardType_NotLikeSearch(String cardType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cardType), xgetCValueCardType(), "CARD_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_TYPE: {varchar(100)}
     * @param cardType The value of cardType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardType_PrefixSearch(String cardType) {
        setCardType_LikeSearch(cardType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(100)}
     */
    public void setCardType_IsNull() { regCardType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(100)}
     */
    public void setCardType_IsNullOrEmpty() { regCardType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARD_TYPE: {varchar(100)}
     */
    public void setCardType_IsNotNull() { regCardType(CK_ISNN, DOBJ); }

    protected void regCardType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCardType(), "CARD_TYPE"); }
    protected abstract ConditionValue xgetCValueCardType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_NO: {varchar(255)}
     * @param cardNo The value of cardNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNo_Equal(String cardNo) {
        doSetCardNo_Equal(fRES(cardNo));
    }

    protected void doSetCardNo_Equal(String cardNo) {
        regCardNo(CK_EQ, cardNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_NO: {varchar(255)}
     * @param cardNo The value of cardNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNo_NotEqual(String cardNo) {
        doSetCardNo_NotEqual(fRES(cardNo));
    }

    protected void doSetCardNo_NotEqual(String cardNo) {
        regCardNo(CK_NES, cardNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_NO: {varchar(255)}
     * @param cardNo The value of cardNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNo_GreaterThan(String cardNo) {
        regCardNo(CK_GT, fRES(cardNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_NO: {varchar(255)}
     * @param cardNo The value of cardNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNo_LessThan(String cardNo) {
        regCardNo(CK_LT, fRES(cardNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_NO: {varchar(255)}
     * @param cardNo The value of cardNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNo_GreaterEqual(String cardNo) {
        regCardNo(CK_GE, fRES(cardNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_NO: {varchar(255)}
     * @param cardNo The value of cardNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNo_LessEqual(String cardNo) {
        regCardNo(CK_LE, fRES(cardNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_NO: {varchar(255)}
     * @param cardNoList The collection of cardNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNo_InScope(Collection<String> cardNoList) {
        doSetCardNo_InScope(cardNoList);
    }

    protected void doSetCardNo_InScope(Collection<String> cardNoList) {
        regINS(CK_INS, cTL(cardNoList), xgetCValueCardNo(), "CARD_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_NO: {varchar(255)}
     * @param cardNoList The collection of cardNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNo_NotInScope(Collection<String> cardNoList) {
        doSetCardNo_NotInScope(cardNoList);
    }

    protected void doSetCardNo_NotInScope(Collection<String> cardNoList) {
        regINS(CK_NINS, cTL(cardNoList), xgetCValueCardNo(), "CARD_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_NO: {varchar(255)} <br>
     * <pre>e.g. setCardNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cardNo The value of cardNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardNo_LikeSearch(String cardNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cardNo), xgetCValueCardNo(), "CARD_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_NO: {varchar(255)}
     * @param cardNo The value of cardNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCardNo_NotLikeSearch(String cardNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cardNo), xgetCValueCardNo(), "CARD_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_NO: {varchar(255)}
     * @param cardNo The value of cardNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNo_PrefixSearch(String cardNo) {
        setCardNo_LikeSearch(cardNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARD_NO: {varchar(255)}
     */
    public void setCardNo_IsNull() { regCardNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARD_NO: {varchar(255)}
     */
    public void setCardNo_IsNullOrEmpty() { regCardNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARD_NO: {varchar(255)}
     */
    public void setCardNo_IsNotNull() { regCardNo(CK_ISNN, DOBJ); }

    protected void regCardNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCardNo(), "CARD_NO"); }
    protected abstract ConditionValue xgetCValueCardNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_NM: {varchar(255)}
     * @param cardNm The value of cardNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNm_Equal(String cardNm) {
        doSetCardNm_Equal(fRES(cardNm));
    }

    protected void doSetCardNm_Equal(String cardNm) {
        regCardNm(CK_EQ, cardNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_NM: {varchar(255)}
     * @param cardNm The value of cardNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNm_NotEqual(String cardNm) {
        doSetCardNm_NotEqual(fRES(cardNm));
    }

    protected void doSetCardNm_NotEqual(String cardNm) {
        regCardNm(CK_NES, cardNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_NM: {varchar(255)}
     * @param cardNm The value of cardNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNm_GreaterThan(String cardNm) {
        regCardNm(CK_GT, fRES(cardNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_NM: {varchar(255)}
     * @param cardNm The value of cardNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNm_LessThan(String cardNm) {
        regCardNm(CK_LT, fRES(cardNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_NM: {varchar(255)}
     * @param cardNm The value of cardNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNm_GreaterEqual(String cardNm) {
        regCardNm(CK_GE, fRES(cardNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_NM: {varchar(255)}
     * @param cardNm The value of cardNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNm_LessEqual(String cardNm) {
        regCardNm(CK_LE, fRES(cardNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_NM: {varchar(255)}
     * @param cardNmList The collection of cardNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNm_InScope(Collection<String> cardNmList) {
        doSetCardNm_InScope(cardNmList);
    }

    protected void doSetCardNm_InScope(Collection<String> cardNmList) {
        regINS(CK_INS, cTL(cardNmList), xgetCValueCardNm(), "CARD_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_NM: {varchar(255)}
     * @param cardNmList The collection of cardNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNm_NotInScope(Collection<String> cardNmList) {
        doSetCardNm_NotInScope(cardNmList);
    }

    protected void doSetCardNm_NotInScope(Collection<String> cardNmList) {
        regINS(CK_NINS, cTL(cardNmList), xgetCValueCardNm(), "CARD_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_NM: {varchar(255)} <br>
     * <pre>e.g. setCardNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cardNm The value of cardNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardNm_LikeSearch(String cardNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cardNm), xgetCValueCardNm(), "CARD_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_NM: {varchar(255)}
     * @param cardNm The value of cardNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCardNm_NotLikeSearch(String cardNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cardNm), xgetCValueCardNm(), "CARD_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_NM: {varchar(255)}
     * @param cardNm The value of cardNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardNm_PrefixSearch(String cardNm) {
        setCardNm_LikeSearch(cardNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARD_NM: {varchar(255)}
     */
    public void setCardNm_IsNull() { regCardNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARD_NM: {varchar(255)}
     */
    public void setCardNm_IsNullOrEmpty() { regCardNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARD_NM: {varchar(255)}
     */
    public void setCardNm_IsNotNull() { regCardNm(CK_ISNN, DOBJ); }

    protected void regCardNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCardNm(), "CARD_NM"); }
    protected abstract ConditionValue xgetCValueCardNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_AVAILABLE: {varchar(255)}
     * @param cardAvailable The value of cardAvailable as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardAvailable_Equal(String cardAvailable) {
        doSetCardAvailable_Equal(fRES(cardAvailable));
    }

    protected void doSetCardAvailable_Equal(String cardAvailable) {
        regCardAvailable(CK_EQ, cardAvailable);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_AVAILABLE: {varchar(255)}
     * @param cardAvailable The value of cardAvailable as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardAvailable_NotEqual(String cardAvailable) {
        doSetCardAvailable_NotEqual(fRES(cardAvailable));
    }

    protected void doSetCardAvailable_NotEqual(String cardAvailable) {
        regCardAvailable(CK_NES, cardAvailable);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_AVAILABLE: {varchar(255)}
     * @param cardAvailable The value of cardAvailable as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardAvailable_GreaterThan(String cardAvailable) {
        regCardAvailable(CK_GT, fRES(cardAvailable));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_AVAILABLE: {varchar(255)}
     * @param cardAvailable The value of cardAvailable as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardAvailable_LessThan(String cardAvailable) {
        regCardAvailable(CK_LT, fRES(cardAvailable));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_AVAILABLE: {varchar(255)}
     * @param cardAvailable The value of cardAvailable as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardAvailable_GreaterEqual(String cardAvailable) {
        regCardAvailable(CK_GE, fRES(cardAvailable));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_AVAILABLE: {varchar(255)}
     * @param cardAvailable The value of cardAvailable as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardAvailable_LessEqual(String cardAvailable) {
        regCardAvailable(CK_LE, fRES(cardAvailable));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_AVAILABLE: {varchar(255)}
     * @param cardAvailableList The collection of cardAvailable as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardAvailable_InScope(Collection<String> cardAvailableList) {
        doSetCardAvailable_InScope(cardAvailableList);
    }

    protected void doSetCardAvailable_InScope(Collection<String> cardAvailableList) {
        regINS(CK_INS, cTL(cardAvailableList), xgetCValueCardAvailable(), "CARD_AVAILABLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_AVAILABLE: {varchar(255)}
     * @param cardAvailableList The collection of cardAvailable as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardAvailable_NotInScope(Collection<String> cardAvailableList) {
        doSetCardAvailable_NotInScope(cardAvailableList);
    }

    protected void doSetCardAvailable_NotInScope(Collection<String> cardAvailableList) {
        regINS(CK_NINS, cTL(cardAvailableList), xgetCValueCardAvailable(), "CARD_AVAILABLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_AVAILABLE: {varchar(255)} <br>
     * <pre>e.g. setCardAvailable_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cardAvailable The value of cardAvailable as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardAvailable_LikeSearch(String cardAvailable, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cardAvailable), xgetCValueCardAvailable(), "CARD_AVAILABLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_AVAILABLE: {varchar(255)}
     * @param cardAvailable The value of cardAvailable as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCardAvailable_NotLikeSearch(String cardAvailable, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cardAvailable), xgetCValueCardAvailable(), "CARD_AVAILABLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_AVAILABLE: {varchar(255)}
     * @param cardAvailable The value of cardAvailable as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardAvailable_PrefixSearch(String cardAvailable) {
        setCardAvailable_LikeSearch(cardAvailable, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARD_AVAILABLE: {varchar(255)}
     */
    public void setCardAvailable_IsNull() { regCardAvailable(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARD_AVAILABLE: {varchar(255)}
     */
    public void setCardAvailable_IsNullOrEmpty() { regCardAvailable(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARD_AVAILABLE: {varchar(255)}
     */
    public void setCardAvailable_IsNotNull() { regCardAvailable(CK_ISNN, DOBJ); }

    protected void regCardAvailable(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCardAvailable(), "CARD_AVAILABLE"); }
    protected abstract ConditionValue xgetCValueCardAvailable();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_INST: {varchar(30)}
     * @param cardInst The value of cardInst as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInst_Equal(String cardInst) {
        doSetCardInst_Equal(fRES(cardInst));
    }

    protected void doSetCardInst_Equal(String cardInst) {
        regCardInst(CK_EQ, cardInst);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_INST: {varchar(30)}
     * @param cardInst The value of cardInst as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInst_NotEqual(String cardInst) {
        doSetCardInst_NotEqual(fRES(cardInst));
    }

    protected void doSetCardInst_NotEqual(String cardInst) {
        regCardInst(CK_NES, cardInst);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_INST: {varchar(30)}
     * @param cardInst The value of cardInst as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInst_GreaterThan(String cardInst) {
        regCardInst(CK_GT, fRES(cardInst));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_INST: {varchar(30)}
     * @param cardInst The value of cardInst as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInst_LessThan(String cardInst) {
        regCardInst(CK_LT, fRES(cardInst));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_INST: {varchar(30)}
     * @param cardInst The value of cardInst as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInst_GreaterEqual(String cardInst) {
        regCardInst(CK_GE, fRES(cardInst));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_INST: {varchar(30)}
     * @param cardInst The value of cardInst as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInst_LessEqual(String cardInst) {
        regCardInst(CK_LE, fRES(cardInst));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_INST: {varchar(30)}
     * @param cardInstList The collection of cardInst as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInst_InScope(Collection<String> cardInstList) {
        doSetCardInst_InScope(cardInstList);
    }

    protected void doSetCardInst_InScope(Collection<String> cardInstList) {
        regINS(CK_INS, cTL(cardInstList), xgetCValueCardInst(), "CARD_INST");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_INST: {varchar(30)}
     * @param cardInstList The collection of cardInst as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInst_NotInScope(Collection<String> cardInstList) {
        doSetCardInst_NotInScope(cardInstList);
    }

    protected void doSetCardInst_NotInScope(Collection<String> cardInstList) {
        regINS(CK_NINS, cTL(cardInstList), xgetCValueCardInst(), "CARD_INST");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_INST: {varchar(30)} <br>
     * <pre>e.g. setCardInst_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cardInst The value of cardInst as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardInst_LikeSearch(String cardInst, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cardInst), xgetCValueCardInst(), "CARD_INST", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_INST: {varchar(30)}
     * @param cardInst The value of cardInst as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCardInst_NotLikeSearch(String cardInst, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cardInst), xgetCValueCardInst(), "CARD_INST", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_INST: {varchar(30)}
     * @param cardInst The value of cardInst as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInst_PrefixSearch(String cardInst) {
        setCardInst_LikeSearch(cardInst, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARD_INST: {varchar(30)}
     */
    public void setCardInst_IsNull() { regCardInst(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARD_INST: {varchar(30)}
     */
    public void setCardInst_IsNullOrEmpty() { regCardInst(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARD_INST: {varchar(30)}
     */
    public void setCardInst_IsNotNull() { regCardInst(CK_ISNN, DOBJ); }

    protected void regCardInst(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCardInst(), "CARD_INST"); }
    protected abstract ConditionValue xgetCValueCardInst();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     * @param cardInstComment The value of cardInstComment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInstComment_Equal(String cardInstComment) {
        doSetCardInstComment_Equal(fRES(cardInstComment));
    }

    protected void doSetCardInstComment_Equal(String cardInstComment) {
        regCardInstComment(CK_EQ, cardInstComment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     * @param cardInstComment The value of cardInstComment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInstComment_NotEqual(String cardInstComment) {
        doSetCardInstComment_NotEqual(fRES(cardInstComment));
    }

    protected void doSetCardInstComment_NotEqual(String cardInstComment) {
        regCardInstComment(CK_NES, cardInstComment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     * @param cardInstComment The value of cardInstComment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInstComment_GreaterThan(String cardInstComment) {
        regCardInstComment(CK_GT, fRES(cardInstComment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     * @param cardInstComment The value of cardInstComment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInstComment_LessThan(String cardInstComment) {
        regCardInstComment(CK_LT, fRES(cardInstComment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     * @param cardInstComment The value of cardInstComment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInstComment_GreaterEqual(String cardInstComment) {
        regCardInstComment(CK_GE, fRES(cardInstComment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     * @param cardInstComment The value of cardInstComment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInstComment_LessEqual(String cardInstComment) {
        regCardInstComment(CK_LE, fRES(cardInstComment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     * @param cardInstCommentList The collection of cardInstComment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInstComment_InScope(Collection<String> cardInstCommentList) {
        doSetCardInstComment_InScope(cardInstCommentList);
    }

    protected void doSetCardInstComment_InScope(Collection<String> cardInstCommentList) {
        regINS(CK_INS, cTL(cardInstCommentList), xgetCValueCardInstComment(), "CARD_INST_COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     * @param cardInstCommentList The collection of cardInstComment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInstComment_NotInScope(Collection<String> cardInstCommentList) {
        doSetCardInstComment_NotInScope(cardInstCommentList);
    }

    protected void doSetCardInstComment_NotInScope(Collection<String> cardInstCommentList) {
        regINS(CK_NINS, cTL(cardInstCommentList), xgetCValueCardInstComment(), "CARD_INST_COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_INST_COMMENT: {varchar(255)} <br>
     * <pre>e.g. setCardInstComment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cardInstComment The value of cardInstComment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardInstComment_LikeSearch(String cardInstComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cardInstComment), xgetCValueCardInstComment(), "CARD_INST_COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     * @param cardInstComment The value of cardInstComment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCardInstComment_NotLikeSearch(String cardInstComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cardInstComment), xgetCValueCardInstComment(), "CARD_INST_COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     * @param cardInstComment The value of cardInstComment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardInstComment_PrefixSearch(String cardInstComment) {
        setCardInstComment_LikeSearch(cardInstComment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     */
    public void setCardInstComment_IsNull() { regCardInstComment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     */
    public void setCardInstComment_IsNullOrEmpty() { regCardInstComment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARD_INST_COMMENT: {varchar(255)}
     */
    public void setCardInstComment_IsNotNull() { regCardInstComment(CK_ISNN, DOBJ); }

    protected void regCardInstComment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCardInstComment(), "CARD_INST_COMMENT"); }
    protected abstract ConditionValue xgetCValueCardInstComment();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_Equal(String delivMethod) {
        doSetDelivMethod_Equal(fRES(delivMethod));
    }

    protected void doSetDelivMethod_Equal(String delivMethod) {
        regDelivMethod(CK_EQ, delivMethod);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_NotEqual(String delivMethod) {
        doSetDelivMethod_NotEqual(fRES(delivMethod));
    }

    protected void doSetDelivMethod_NotEqual(String delivMethod) {
        regDelivMethod(CK_NES, delivMethod);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_GreaterThan(String delivMethod) {
        regDelivMethod(CK_GT, fRES(delivMethod));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_LessThan(String delivMethod) {
        regDelivMethod(CK_LT, fRES(delivMethod));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_GreaterEqual(String delivMethod) {
        regDelivMethod(CK_GE, fRES(delivMethod));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_LessEqual(String delivMethod) {
        regDelivMethod(CK_LE, fRES(delivMethod));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethodList The collection of delivMethod as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_InScope(Collection<String> delivMethodList) {
        doSetDelivMethod_InScope(delivMethodList);
    }

    protected void doSetDelivMethod_InScope(Collection<String> delivMethodList) {
        regINS(CK_INS, cTL(delivMethodList), xgetCValueDelivMethod(), "DELIV_METHOD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethodList The collection of delivMethod as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_NotInScope(Collection<String> delivMethodList) {
        doSetDelivMethod_NotInScope(delivMethodList);
    }

    protected void doSetDelivMethod_NotInScope(Collection<String> delivMethodList) {
        regINS(CK_NINS, cTL(delivMethodList), xgetCValueDelivMethod(), "DELIV_METHOD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_METHOD: {varchar(255)} <br>
     * <pre>e.g. setDelivMethod_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivMethod The value of delivMethod as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivMethod_LikeSearch(String delivMethod, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivMethod), xgetCValueDelivMethod(), "DELIV_METHOD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivMethod_NotLikeSearch(String delivMethod, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivMethod), xgetCValueDelivMethod(), "DELIV_METHOD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     * @param delivMethod The value of delivMethod as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivMethod_PrefixSearch(String delivMethod) {
        setDelivMethod_LikeSearch(delivMethod, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     */
    public void setDelivMethod_IsNull() { regDelivMethod(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     */
    public void setDelivMethod_IsNullOrEmpty() { regDelivMethod(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_METHOD: {varchar(255)}
     */
    public void setDelivMethod_IsNotNull() { regDelivMethod(CK_ISNN, DOBJ); }

    protected void regDelivMethod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivMethod(), "DELIV_METHOD"); }
    protected abstract ConditionValue xgetCValueDelivMethod();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_Equal(String delivType) {
        doSetDelivType_Equal(fRES(delivType));
    }

    protected void doSetDelivType_Equal(String delivType) {
        regDelivType(CK_EQ, delivType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_NotEqual(String delivType) {
        doSetDelivType_NotEqual(fRES(delivType));
    }

    protected void doSetDelivType_NotEqual(String delivType) {
        regDelivType(CK_NES, delivType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_GreaterThan(String delivType) {
        regDelivType(CK_GT, fRES(delivType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_LessThan(String delivType) {
        regDelivType(CK_LT, fRES(delivType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_GreaterEqual(String delivType) {
        regDelivType(CK_GE, fRES(delivType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_LessEqual(String delivType) {
        regDelivType(CK_LE, fRES(delivType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivTypeList The collection of delivType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_InScope(Collection<String> delivTypeList) {
        doSetDelivType_InScope(delivTypeList);
    }

    protected void doSetDelivType_InScope(Collection<String> delivTypeList) {
        regINS(CK_INS, cTL(delivTypeList), xgetCValueDelivType(), "DELIV_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivTypeList The collection of delivType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_NotInScope(Collection<String> delivTypeList) {
        doSetDelivType_NotInScope(delivTypeList);
    }

    protected void doSetDelivType_NotInScope(Collection<String> delivTypeList) {
        regINS(CK_NINS, cTL(delivTypeList), xgetCValueDelivType(), "DELIV_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TYPE: {varchar(255)} <br>
     * <pre>e.g. setDelivType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivType The value of delivType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivType_LikeSearch(String delivType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivType), xgetCValueDelivType(), "DELIV_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivType_NotLikeSearch(String delivType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivType), xgetCValueDelivType(), "DELIV_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     * @param delivType The value of delivType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivType_PrefixSearch(String delivType) {
        setDelivType_LikeSearch(delivType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     */
    public void setDelivType_IsNull() { regDelivType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     */
    public void setDelivType_IsNullOrEmpty() { regDelivType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TYPE: {varchar(255)}
     */
    public void setDelivType_IsNotNull() { regDelivType(CK_ISNN, DOBJ); }

    protected void regDelivType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivType(), "DELIV_TYPE"); }
    protected abstract ConditionValue xgetCValueDelivType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_USE: {bigint(19)}
     * @param pointUse The value of pointUse as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointUse_Equal(Long pointUse) {
        doSetPointUse_Equal(pointUse);
    }

    protected void doSetPointUse_Equal(Long pointUse) {
        regPointUse(CK_EQ, pointUse);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_USE: {bigint(19)}
     * @param pointUse The value of pointUse as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointUse_NotEqual(Long pointUse) {
        doSetPointUse_NotEqual(pointUse);
    }

    protected void doSetPointUse_NotEqual(Long pointUse) {
        regPointUse(CK_NES, pointUse);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_USE: {bigint(19)}
     * @param pointUse The value of pointUse as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointUse_GreaterThan(Long pointUse) {
        regPointUse(CK_GT, pointUse);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_USE: {bigint(19)}
     * @param pointUse The value of pointUse as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointUse_LessThan(Long pointUse) {
        regPointUse(CK_LT, pointUse);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_USE: {bigint(19)}
     * @param pointUse The value of pointUse as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointUse_GreaterEqual(Long pointUse) {
        regPointUse(CK_GE, pointUse);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_USE: {bigint(19)}
     * @param pointUse The value of pointUse as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointUse_LessEqual(Long pointUse) {
        regPointUse(CK_LE, pointUse);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_USE: {bigint(19)}
     * @param minNumber The min number of pointUse. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pointUse. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPointUse_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePointUse(), "POINT_USE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POINT_USE: {bigint(19)}
     * @param pointUseList The collection of pointUse as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointUse_InScope(Collection<Long> pointUseList) {
        doSetPointUse_InScope(pointUseList);
    }

    protected void doSetPointUse_InScope(Collection<Long> pointUseList) {
        regINS(CK_INS, cTL(pointUseList), xgetCValuePointUse(), "POINT_USE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POINT_USE: {bigint(19)}
     * @param pointUseList The collection of pointUse as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointUse_NotInScope(Collection<Long> pointUseList) {
        doSetPointUse_NotInScope(pointUseList);
    }

    protected void doSetPointUse_NotInScope(Collection<Long> pointUseList) {
        regINS(CK_NINS, cTL(pointUseList), xgetCValuePointUse(), "POINT_USE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_USE: {bigint(19)}
     */
    public void setPointUse_IsNull() { regPointUse(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_USE: {bigint(19)}
     */
    public void setPointUse_IsNotNull() { regPointUse(CK_ISNN, DOBJ); }

    protected void regPointUse(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointUse(), "POINT_USE"); }
    protected abstract ConditionValue xgetCValuePointUse();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_CONDITION: {varchar(30)}
     * @param pointCondition The value of pointCondition as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointCondition_Equal(String pointCondition) {
        doSetPointCondition_Equal(fRES(pointCondition));
    }

    protected void doSetPointCondition_Equal(String pointCondition) {
        regPointCondition(CK_EQ, pointCondition);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_CONDITION: {varchar(30)}
     * @param pointCondition The value of pointCondition as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointCondition_NotEqual(String pointCondition) {
        doSetPointCondition_NotEqual(fRES(pointCondition));
    }

    protected void doSetPointCondition_NotEqual(String pointCondition) {
        regPointCondition(CK_NES, pointCondition);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_CONDITION: {varchar(30)}
     * @param pointCondition The value of pointCondition as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointCondition_GreaterThan(String pointCondition) {
        regPointCondition(CK_GT, fRES(pointCondition));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_CONDITION: {varchar(30)}
     * @param pointCondition The value of pointCondition as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointCondition_LessThan(String pointCondition) {
        regPointCondition(CK_LT, fRES(pointCondition));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_CONDITION: {varchar(30)}
     * @param pointCondition The value of pointCondition as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointCondition_GreaterEqual(String pointCondition) {
        regPointCondition(CK_GE, fRES(pointCondition));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_CONDITION: {varchar(30)}
     * @param pointCondition The value of pointCondition as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointCondition_LessEqual(String pointCondition) {
        regPointCondition(CK_LE, fRES(pointCondition));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POINT_CONDITION: {varchar(30)}
     * @param pointConditionList The collection of pointCondition as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointCondition_InScope(Collection<String> pointConditionList) {
        doSetPointCondition_InScope(pointConditionList);
    }

    protected void doSetPointCondition_InScope(Collection<String> pointConditionList) {
        regINS(CK_INS, cTL(pointConditionList), xgetCValuePointCondition(), "POINT_CONDITION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POINT_CONDITION: {varchar(30)}
     * @param pointConditionList The collection of pointCondition as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointCondition_NotInScope(Collection<String> pointConditionList) {
        doSetPointCondition_NotInScope(pointConditionList);
    }

    protected void doSetPointCondition_NotInScope(Collection<String> pointConditionList) {
        regINS(CK_NINS, cTL(pointConditionList), xgetCValuePointCondition(), "POINT_CONDITION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_CONDITION: {varchar(30)} <br>
     * <pre>e.g. setPointCondition_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pointCondition The value of pointCondition as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPointCondition_LikeSearch(String pointCondition, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pointCondition), xgetCValuePointCondition(), "POINT_CONDITION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_CONDITION: {varchar(30)}
     * @param pointCondition The value of pointCondition as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPointCondition_NotLikeSearch(String pointCondition, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pointCondition), xgetCValuePointCondition(), "POINT_CONDITION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_CONDITION: {varchar(30)}
     * @param pointCondition The value of pointCondition as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointCondition_PrefixSearch(String pointCondition) {
        setPointCondition_LikeSearch(pointCondition, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_CONDITION: {varchar(30)}
     */
    public void setPointCondition_IsNull() { regPointCondition(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * POINT_CONDITION: {varchar(30)}
     */
    public void setPointCondition_IsNullOrEmpty() { regPointCondition(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_CONDITION: {varchar(30)}
     */
    public void setPointCondition_IsNotNull() { regPointCondition(CK_ISNN, DOBJ); }

    protected void regPointCondition(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointCondition(), "POINT_CONDITION"); }
    protected abstract ConditionValue xgetCValuePointCondition();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_STATUS: {varchar(30)}
     * @param pointStatus The value of pointStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointStatus_Equal(String pointStatus) {
        doSetPointStatus_Equal(fRES(pointStatus));
    }

    protected void doSetPointStatus_Equal(String pointStatus) {
        regPointStatus(CK_EQ, pointStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_STATUS: {varchar(30)}
     * @param pointStatus The value of pointStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointStatus_NotEqual(String pointStatus) {
        doSetPointStatus_NotEqual(fRES(pointStatus));
    }

    protected void doSetPointStatus_NotEqual(String pointStatus) {
        regPointStatus(CK_NES, pointStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_STATUS: {varchar(30)}
     * @param pointStatus The value of pointStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointStatus_GreaterThan(String pointStatus) {
        regPointStatus(CK_GT, fRES(pointStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_STATUS: {varchar(30)}
     * @param pointStatus The value of pointStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointStatus_LessThan(String pointStatus) {
        regPointStatus(CK_LT, fRES(pointStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_STATUS: {varchar(30)}
     * @param pointStatus The value of pointStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointStatus_GreaterEqual(String pointStatus) {
        regPointStatus(CK_GE, fRES(pointStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_STATUS: {varchar(30)}
     * @param pointStatus The value of pointStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointStatus_LessEqual(String pointStatus) {
        regPointStatus(CK_LE, fRES(pointStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POINT_STATUS: {varchar(30)}
     * @param pointStatusList The collection of pointStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointStatus_InScope(Collection<String> pointStatusList) {
        doSetPointStatus_InScope(pointStatusList);
    }

    protected void doSetPointStatus_InScope(Collection<String> pointStatusList) {
        regINS(CK_INS, cTL(pointStatusList), xgetCValuePointStatus(), "POINT_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POINT_STATUS: {varchar(30)}
     * @param pointStatusList The collection of pointStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointStatus_NotInScope(Collection<String> pointStatusList) {
        doSetPointStatus_NotInScope(pointStatusList);
    }

    protected void doSetPointStatus_NotInScope(Collection<String> pointStatusList) {
        regINS(CK_NINS, cTL(pointStatusList), xgetCValuePointStatus(), "POINT_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_STATUS: {varchar(30)} <br>
     * <pre>e.g. setPointStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pointStatus The value of pointStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPointStatus_LikeSearch(String pointStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pointStatus), xgetCValuePointStatus(), "POINT_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_STATUS: {varchar(30)}
     * @param pointStatus The value of pointStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPointStatus_NotLikeSearch(String pointStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pointStatus), xgetCValuePointStatus(), "POINT_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_STATUS: {varchar(30)}
     * @param pointStatus The value of pointStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointStatus_PrefixSearch(String pointStatus) {
        setPointStatus_LikeSearch(pointStatus, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_STATUS: {varchar(30)}
     */
    public void setPointStatus_IsNull() { regPointStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * POINT_STATUS: {varchar(30)}
     */
    public void setPointStatus_IsNullOrEmpty() { regPointStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_STATUS: {varchar(30)}
     */
    public void setPointStatus_IsNotNull() { regPointStatus(CK_ISNN, DOBJ); }

    protected void regPointStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointStatus(), "POINT_STATUS"); }
    protected abstract ConditionValue xgetCValuePointStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BANK_STATUS: {varchar(30)}
     * @param bankStatus The value of bankStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankStatus_Equal(String bankStatus) {
        doSetBankStatus_Equal(fRES(bankStatus));
    }

    protected void doSetBankStatus_Equal(String bankStatus) {
        regBankStatus(CK_EQ, bankStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BANK_STATUS: {varchar(30)}
     * @param bankStatus The value of bankStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankStatus_NotEqual(String bankStatus) {
        doSetBankStatus_NotEqual(fRES(bankStatus));
    }

    protected void doSetBankStatus_NotEqual(String bankStatus) {
        regBankStatus(CK_NES, bankStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BANK_STATUS: {varchar(30)}
     * @param bankStatus The value of bankStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankStatus_GreaterThan(String bankStatus) {
        regBankStatus(CK_GT, fRES(bankStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BANK_STATUS: {varchar(30)}
     * @param bankStatus The value of bankStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankStatus_LessThan(String bankStatus) {
        regBankStatus(CK_LT, fRES(bankStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BANK_STATUS: {varchar(30)}
     * @param bankStatus The value of bankStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankStatus_GreaterEqual(String bankStatus) {
        regBankStatus(CK_GE, fRES(bankStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BANK_STATUS: {varchar(30)}
     * @param bankStatus The value of bankStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankStatus_LessEqual(String bankStatus) {
        regBankStatus(CK_LE, fRES(bankStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BANK_STATUS: {varchar(30)}
     * @param bankStatusList The collection of bankStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankStatus_InScope(Collection<String> bankStatusList) {
        doSetBankStatus_InScope(bankStatusList);
    }

    protected void doSetBankStatus_InScope(Collection<String> bankStatusList) {
        regINS(CK_INS, cTL(bankStatusList), xgetCValueBankStatus(), "BANK_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BANK_STATUS: {varchar(30)}
     * @param bankStatusList The collection of bankStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankStatus_NotInScope(Collection<String> bankStatusList) {
        doSetBankStatus_NotInScope(bankStatusList);
    }

    protected void doSetBankStatus_NotInScope(Collection<String> bankStatusList) {
        regINS(CK_NINS, cTL(bankStatusList), xgetCValueBankStatus(), "BANK_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BANK_STATUS: {varchar(30)} <br>
     * <pre>e.g. setBankStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bankStatus The value of bankStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBankStatus_LikeSearch(String bankStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bankStatus), xgetCValueBankStatus(), "BANK_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BANK_STATUS: {varchar(30)}
     * @param bankStatus The value of bankStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBankStatus_NotLikeSearch(String bankStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bankStatus), xgetCValueBankStatus(), "BANK_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BANK_STATUS: {varchar(30)}
     * @param bankStatus The value of bankStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankStatus_PrefixSearch(String bankStatus) {
        setBankStatus_LikeSearch(bankStatus, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BANK_STATUS: {varchar(30)}
     */
    public void setBankStatus_IsNull() { regBankStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BANK_STATUS: {varchar(30)}
     */
    public void setBankStatus_IsNullOrEmpty() { regBankStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BANK_STATUS: {varchar(30)}
     */
    public void setBankStatus_IsNotNull() { regBankStatus(CK_ISNN, DOBJ); }

    protected void regBankStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBankStatus(), "BANK_STATUS"); }
    protected abstract ConditionValue xgetCValueBankStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BANK_FEE_FLG: {char(1)}
     * @param bankFeeFlg The value of bankFeeFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankFeeFlg_Equal(String bankFeeFlg) {
        doSetBankFeeFlg_Equal(fRES(bankFeeFlg));
    }

    protected void doSetBankFeeFlg_Equal(String bankFeeFlg) {
        regBankFeeFlg(CK_EQ, bankFeeFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BANK_FEE_FLG: {char(1)}
     * @param bankFeeFlg The value of bankFeeFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankFeeFlg_NotEqual(String bankFeeFlg) {
        doSetBankFeeFlg_NotEqual(fRES(bankFeeFlg));
    }

    protected void doSetBankFeeFlg_NotEqual(String bankFeeFlg) {
        regBankFeeFlg(CK_NES, bankFeeFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BANK_FEE_FLG: {char(1)}
     * @param bankFeeFlg The value of bankFeeFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankFeeFlg_GreaterThan(String bankFeeFlg) {
        regBankFeeFlg(CK_GT, fRES(bankFeeFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BANK_FEE_FLG: {char(1)}
     * @param bankFeeFlg The value of bankFeeFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankFeeFlg_LessThan(String bankFeeFlg) {
        regBankFeeFlg(CK_LT, fRES(bankFeeFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BANK_FEE_FLG: {char(1)}
     * @param bankFeeFlg The value of bankFeeFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankFeeFlg_GreaterEqual(String bankFeeFlg) {
        regBankFeeFlg(CK_GE, fRES(bankFeeFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BANK_FEE_FLG: {char(1)}
     * @param bankFeeFlg The value of bankFeeFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankFeeFlg_LessEqual(String bankFeeFlg) {
        regBankFeeFlg(CK_LE, fRES(bankFeeFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BANK_FEE_FLG: {char(1)}
     * @param bankFeeFlgList The collection of bankFeeFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankFeeFlg_InScope(Collection<String> bankFeeFlgList) {
        doSetBankFeeFlg_InScope(bankFeeFlgList);
    }

    protected void doSetBankFeeFlg_InScope(Collection<String> bankFeeFlgList) {
        regINS(CK_INS, cTL(bankFeeFlgList), xgetCValueBankFeeFlg(), "BANK_FEE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BANK_FEE_FLG: {char(1)}
     * @param bankFeeFlgList The collection of bankFeeFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankFeeFlg_NotInScope(Collection<String> bankFeeFlgList) {
        doSetBankFeeFlg_NotInScope(bankFeeFlgList);
    }

    protected void doSetBankFeeFlg_NotInScope(Collection<String> bankFeeFlgList) {
        regINS(CK_NINS, cTL(bankFeeFlgList), xgetCValueBankFeeFlg(), "BANK_FEE_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BANK_FEE_FLG: {char(1)} <br>
     * <pre>e.g. setBankFeeFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bankFeeFlg The value of bankFeeFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBankFeeFlg_LikeSearch(String bankFeeFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bankFeeFlg), xgetCValueBankFeeFlg(), "BANK_FEE_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BANK_FEE_FLG: {char(1)}
     * @param bankFeeFlg The value of bankFeeFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBankFeeFlg_NotLikeSearch(String bankFeeFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bankFeeFlg), xgetCValueBankFeeFlg(), "BANK_FEE_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BANK_FEE_FLG: {char(1)}
     * @param bankFeeFlg The value of bankFeeFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankFeeFlg_PrefixSearch(String bankFeeFlg) {
        setBankFeeFlg_LikeSearch(bankFeeFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BANK_FEE_FLG: {char(1)}
     */
    public void setBankFeeFlg_IsNull() { regBankFeeFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BANK_FEE_FLG: {char(1)}
     */
    public void setBankFeeFlg_IsNotNull() { regBankFeeFlg(CK_ISNN, DOBJ); }

    protected void regBankFeeFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBankFeeFlg(), "BANK_FEE_FLG"); }
    protected abstract ConditionValue xgetCValueBankFeeFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BANK_FEE: {bigint(19)}
     * @param bankFee The value of bankFee as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBankFee_Equal(Long bankFee) {
        doSetBankFee_Equal(bankFee);
    }

    protected void doSetBankFee_Equal(Long bankFee) {
        regBankFee(CK_EQ, bankFee);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BANK_FEE: {bigint(19)}
     * @param bankFee The value of bankFee as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBankFee_NotEqual(Long bankFee) {
        doSetBankFee_NotEqual(bankFee);
    }

    protected void doSetBankFee_NotEqual(Long bankFee) {
        regBankFee(CK_NES, bankFee);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BANK_FEE: {bigint(19)}
     * @param bankFee The value of bankFee as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBankFee_GreaterThan(Long bankFee) {
        regBankFee(CK_GT, bankFee);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BANK_FEE: {bigint(19)}
     * @param bankFee The value of bankFee as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBankFee_LessThan(Long bankFee) {
        regBankFee(CK_LT, bankFee);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BANK_FEE: {bigint(19)}
     * @param bankFee The value of bankFee as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBankFee_GreaterEqual(Long bankFee) {
        regBankFee(CK_GE, bankFee);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BANK_FEE: {bigint(19)}
     * @param bankFee The value of bankFee as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBankFee_LessEqual(Long bankFee) {
        regBankFee(CK_LE, bankFee);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BANK_FEE: {bigint(19)}
     * @param minNumber The min number of bankFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bankFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBankFee_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBankFee(), "BANK_FEE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BANK_FEE: {bigint(19)}
     * @param bankFeeList The collection of bankFee as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankFee_InScope(Collection<Long> bankFeeList) {
        doSetBankFee_InScope(bankFeeList);
    }

    protected void doSetBankFee_InScope(Collection<Long> bankFeeList) {
        regINS(CK_INS, cTL(bankFeeList), xgetCValueBankFee(), "BANK_FEE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BANK_FEE: {bigint(19)}
     * @param bankFeeList The collection of bankFee as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBankFee_NotInScope(Collection<Long> bankFeeList) {
        doSetBankFee_NotInScope(bankFeeList);
    }

    protected void doSetBankFee_NotInScope(Collection<Long> bankFeeList) {
        regINS(CK_NINS, cTL(bankFeeList), xgetCValueBankFee(), "BANK_FEE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BANK_FEE: {bigint(19)}
     */
    public void setBankFee_IsNull() { regBankFee(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BANK_FEE: {bigint(19)}
     */
    public void setBankFee_IsNotNull() { regBankFee(CK_ISNN, DOBJ); }

    protected void regBankFee(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBankFee(), "BANK_FEE"); }
    protected abstract ConditionValue xgetCValueBankFee();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     * @param wrappingTitleP The value of wrappingTitleP as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleP_Equal(String wrappingTitleP) {
        doSetWrappingTitleP_Equal(fRES(wrappingTitleP));
    }

    protected void doSetWrappingTitleP_Equal(String wrappingTitleP) {
        regWrappingTitleP(CK_EQ, wrappingTitleP);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     * @param wrappingTitleP The value of wrappingTitleP as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleP_NotEqual(String wrappingTitleP) {
        doSetWrappingTitleP_NotEqual(fRES(wrappingTitleP));
    }

    protected void doSetWrappingTitleP_NotEqual(String wrappingTitleP) {
        regWrappingTitleP(CK_NES, wrappingTitleP);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     * @param wrappingTitleP The value of wrappingTitleP as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleP_GreaterThan(String wrappingTitleP) {
        regWrappingTitleP(CK_GT, fRES(wrappingTitleP));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     * @param wrappingTitleP The value of wrappingTitleP as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleP_LessThan(String wrappingTitleP) {
        regWrappingTitleP(CK_LT, fRES(wrappingTitleP));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     * @param wrappingTitleP The value of wrappingTitleP as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleP_GreaterEqual(String wrappingTitleP) {
        regWrappingTitleP(CK_GE, fRES(wrappingTitleP));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     * @param wrappingTitleP The value of wrappingTitleP as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleP_LessEqual(String wrappingTitleP) {
        regWrappingTitleP(CK_LE, fRES(wrappingTitleP));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     * @param wrappingTitlePList The collection of wrappingTitleP as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleP_InScope(Collection<String> wrappingTitlePList) {
        doSetWrappingTitleP_InScope(wrappingTitlePList);
    }

    protected void doSetWrappingTitleP_InScope(Collection<String> wrappingTitlePList) {
        regINS(CK_INS, cTL(wrappingTitlePList), xgetCValueWrappingTitleP(), "WRAPPING_TITLE_P");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     * @param wrappingTitlePList The collection of wrappingTitleP as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleP_NotInScope(Collection<String> wrappingTitlePList) {
        doSetWrappingTitleP_NotInScope(wrappingTitlePList);
    }

    protected void doSetWrappingTitleP_NotInScope(Collection<String> wrappingTitlePList) {
        regINS(CK_NINS, cTL(wrappingTitlePList), xgetCValueWrappingTitleP(), "WRAPPING_TITLE_P");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_TITLE_P: {varchar(255)} <br>
     * <pre>e.g. setWrappingTitleP_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wrappingTitleP The value of wrappingTitleP as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWrappingTitleP_LikeSearch(String wrappingTitleP, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wrappingTitleP), xgetCValueWrappingTitleP(), "WRAPPING_TITLE_P", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     * @param wrappingTitleP The value of wrappingTitleP as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWrappingTitleP_NotLikeSearch(String wrappingTitleP, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wrappingTitleP), xgetCValueWrappingTitleP(), "WRAPPING_TITLE_P", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     * @param wrappingTitleP The value of wrappingTitleP as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleP_PrefixSearch(String wrappingTitleP) {
        setWrappingTitleP_LikeSearch(wrappingTitleP, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     */
    public void setWrappingTitleP_IsNull() { regWrappingTitleP(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     */
    public void setWrappingTitleP_IsNullOrEmpty() { regWrappingTitleP(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_P: {varchar(255)}
     */
    public void setWrappingTitleP_IsNotNull() { regWrappingTitleP(CK_ISNN, DOBJ); }

    protected void regWrappingTitleP(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWrappingTitleP(), "WRAPPING_TITLE_P"); }
    protected abstract ConditionValue xgetCValueWrappingTitleP();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_NM_P: {varchar(255)}
     * @param wrappingNmP The value of wrappingNmP as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmP_Equal(String wrappingNmP) {
        doSetWrappingNmP_Equal(fRES(wrappingNmP));
    }

    protected void doSetWrappingNmP_Equal(String wrappingNmP) {
        regWrappingNmP(CK_EQ, wrappingNmP);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_NM_P: {varchar(255)}
     * @param wrappingNmP The value of wrappingNmP as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmP_NotEqual(String wrappingNmP) {
        doSetWrappingNmP_NotEqual(fRES(wrappingNmP));
    }

    protected void doSetWrappingNmP_NotEqual(String wrappingNmP) {
        regWrappingNmP(CK_NES, wrappingNmP);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_NM_P: {varchar(255)}
     * @param wrappingNmP The value of wrappingNmP as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmP_GreaterThan(String wrappingNmP) {
        regWrappingNmP(CK_GT, fRES(wrappingNmP));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_NM_P: {varchar(255)}
     * @param wrappingNmP The value of wrappingNmP as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmP_LessThan(String wrappingNmP) {
        regWrappingNmP(CK_LT, fRES(wrappingNmP));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_NM_P: {varchar(255)}
     * @param wrappingNmP The value of wrappingNmP as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmP_GreaterEqual(String wrappingNmP) {
        regWrappingNmP(CK_GE, fRES(wrappingNmP));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_NM_P: {varchar(255)}
     * @param wrappingNmP The value of wrappingNmP as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmP_LessEqual(String wrappingNmP) {
        regWrappingNmP(CK_LE, fRES(wrappingNmP));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRAPPING_NM_P: {varchar(255)}
     * @param wrappingNmPList The collection of wrappingNmP as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmP_InScope(Collection<String> wrappingNmPList) {
        doSetWrappingNmP_InScope(wrappingNmPList);
    }

    protected void doSetWrappingNmP_InScope(Collection<String> wrappingNmPList) {
        regINS(CK_INS, cTL(wrappingNmPList), xgetCValueWrappingNmP(), "WRAPPING_NM_P");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRAPPING_NM_P: {varchar(255)}
     * @param wrappingNmPList The collection of wrappingNmP as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmP_NotInScope(Collection<String> wrappingNmPList) {
        doSetWrappingNmP_NotInScope(wrappingNmPList);
    }

    protected void doSetWrappingNmP_NotInScope(Collection<String> wrappingNmPList) {
        regINS(CK_NINS, cTL(wrappingNmPList), xgetCValueWrappingNmP(), "WRAPPING_NM_P");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_NM_P: {varchar(255)} <br>
     * <pre>e.g. setWrappingNmP_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wrappingNmP The value of wrappingNmP as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWrappingNmP_LikeSearch(String wrappingNmP, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wrappingNmP), xgetCValueWrappingNmP(), "WRAPPING_NM_P", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_NM_P: {varchar(255)}
     * @param wrappingNmP The value of wrappingNmP as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWrappingNmP_NotLikeSearch(String wrappingNmP, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wrappingNmP), xgetCValueWrappingNmP(), "WRAPPING_NM_P", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_NM_P: {varchar(255)}
     * @param wrappingNmP The value of wrappingNmP as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmP_PrefixSearch(String wrappingNmP) {
        setWrappingNmP_LikeSearch(wrappingNmP, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WRAPPING_NM_P: {varchar(255)}
     */
    public void setWrappingNmP_IsNull() { regWrappingNmP(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WRAPPING_NM_P: {varchar(255)}
     */
    public void setWrappingNmP_IsNullOrEmpty() { regWrappingNmP(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WRAPPING_NM_P: {varchar(255)}
     */
    public void setWrappingNmP_IsNotNull() { regWrappingNmP(CK_ISNN, DOBJ); }

    protected void regWrappingNmP(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWrappingNmP(), "WRAPPING_NM_P"); }
    protected abstract ConditionValue xgetCValueWrappingNmP();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_FEE_P: {bigint(19)}
     * @param wrappingFeeP The value of wrappingFeeP as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingFeeP_Equal(Long wrappingFeeP) {
        doSetWrappingFeeP_Equal(wrappingFeeP);
    }

    protected void doSetWrappingFeeP_Equal(Long wrappingFeeP) {
        regWrappingFeeP(CK_EQ, wrappingFeeP);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_FEE_P: {bigint(19)}
     * @param wrappingFeeP The value of wrappingFeeP as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingFeeP_NotEqual(Long wrappingFeeP) {
        doSetWrappingFeeP_NotEqual(wrappingFeeP);
    }

    protected void doSetWrappingFeeP_NotEqual(Long wrappingFeeP) {
        regWrappingFeeP(CK_NES, wrappingFeeP);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_FEE_P: {bigint(19)}
     * @param wrappingFeeP The value of wrappingFeeP as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingFeeP_GreaterThan(Long wrappingFeeP) {
        regWrappingFeeP(CK_GT, wrappingFeeP);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_FEE_P: {bigint(19)}
     * @param wrappingFeeP The value of wrappingFeeP as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingFeeP_LessThan(Long wrappingFeeP) {
        regWrappingFeeP(CK_LT, wrappingFeeP);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_FEE_P: {bigint(19)}
     * @param wrappingFeeP The value of wrappingFeeP as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingFeeP_GreaterEqual(Long wrappingFeeP) {
        regWrappingFeeP(CK_GE, wrappingFeeP);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_FEE_P: {bigint(19)}
     * @param wrappingFeeP The value of wrappingFeeP as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingFeeP_LessEqual(Long wrappingFeeP) {
        regWrappingFeeP(CK_LE, wrappingFeeP);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_FEE_P: {bigint(19)}
     * @param minNumber The min number of wrappingFeeP. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of wrappingFeeP. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWrappingFeeP_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWrappingFeeP(), "WRAPPING_FEE_P", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WRAPPING_FEE_P: {bigint(19)}
     * @param wrappingFeePList The collection of wrappingFeeP as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingFeeP_InScope(Collection<Long> wrappingFeePList) {
        doSetWrappingFeeP_InScope(wrappingFeePList);
    }

    protected void doSetWrappingFeeP_InScope(Collection<Long> wrappingFeePList) {
        regINS(CK_INS, cTL(wrappingFeePList), xgetCValueWrappingFeeP(), "WRAPPING_FEE_P");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WRAPPING_FEE_P: {bigint(19)}
     * @param wrappingFeePList The collection of wrappingFeeP as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingFeeP_NotInScope(Collection<Long> wrappingFeePList) {
        doSetWrappingFeeP_NotInScope(wrappingFeePList);
    }

    protected void doSetWrappingFeeP_NotInScope(Collection<Long> wrappingFeePList) {
        regINS(CK_NINS, cTL(wrappingFeePList), xgetCValueWrappingFeeP(), "WRAPPING_FEE_P");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WRAPPING_FEE_P: {bigint(19)}
     */
    public void setWrappingFeeP_IsNull() { regWrappingFeeP(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WRAPPING_FEE_P: {bigint(19)}
     */
    public void setWrappingFeeP_IsNotNull() { regWrappingFeeP(CK_ISNN, DOBJ); }

    protected void regWrappingFeeP(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWrappingFeeP(), "WRAPPING_FEE_P"); }
    protected abstract ConditionValue xgetCValueWrappingFeeP();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TAX_P: {bigint(19)}
     * @param wrappingTaxP The value of wrappingTaxP as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingTaxP_Equal(Long wrappingTaxP) {
        doSetWrappingTaxP_Equal(wrappingTaxP);
    }

    protected void doSetWrappingTaxP_Equal(Long wrappingTaxP) {
        regWrappingTaxP(CK_EQ, wrappingTaxP);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TAX_P: {bigint(19)}
     * @param wrappingTaxP The value of wrappingTaxP as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingTaxP_NotEqual(Long wrappingTaxP) {
        doSetWrappingTaxP_NotEqual(wrappingTaxP);
    }

    protected void doSetWrappingTaxP_NotEqual(Long wrappingTaxP) {
        regWrappingTaxP(CK_NES, wrappingTaxP);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TAX_P: {bigint(19)}
     * @param wrappingTaxP The value of wrappingTaxP as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingTaxP_GreaterThan(Long wrappingTaxP) {
        regWrappingTaxP(CK_GT, wrappingTaxP);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TAX_P: {bigint(19)}
     * @param wrappingTaxP The value of wrappingTaxP as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingTaxP_LessThan(Long wrappingTaxP) {
        regWrappingTaxP(CK_LT, wrappingTaxP);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TAX_P: {bigint(19)}
     * @param wrappingTaxP The value of wrappingTaxP as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingTaxP_GreaterEqual(Long wrappingTaxP) {
        regWrappingTaxP(CK_GE, wrappingTaxP);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TAX_P: {bigint(19)}
     * @param wrappingTaxP The value of wrappingTaxP as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingTaxP_LessEqual(Long wrappingTaxP) {
        regWrappingTaxP(CK_LE, wrappingTaxP);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TAX_P: {bigint(19)}
     * @param minNumber The min number of wrappingTaxP. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of wrappingTaxP. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWrappingTaxP_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWrappingTaxP(), "WRAPPING_TAX_P", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WRAPPING_TAX_P: {bigint(19)}
     * @param wrappingTaxPList The collection of wrappingTaxP as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTaxP_InScope(Collection<Long> wrappingTaxPList) {
        doSetWrappingTaxP_InScope(wrappingTaxPList);
    }

    protected void doSetWrappingTaxP_InScope(Collection<Long> wrappingTaxPList) {
        regINS(CK_INS, cTL(wrappingTaxPList), xgetCValueWrappingTaxP(), "WRAPPING_TAX_P");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WRAPPING_TAX_P: {bigint(19)}
     * @param wrappingTaxPList The collection of wrappingTaxP as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTaxP_NotInScope(Collection<Long> wrappingTaxPList) {
        doSetWrappingTaxP_NotInScope(wrappingTaxPList);
    }

    protected void doSetWrappingTaxP_NotInScope(Collection<Long> wrappingTaxPList) {
        regINS(CK_NINS, cTL(wrappingTaxPList), xgetCValueWrappingTaxP(), "WRAPPING_TAX_P");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WRAPPING_TAX_P: {bigint(19)}
     */
    public void setWrappingTaxP_IsNull() { regWrappingTaxP(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WRAPPING_TAX_P: {bigint(19)}
     */
    public void setWrappingTaxP_IsNotNull() { regWrappingTaxP(CK_ISNN, DOBJ); }

    protected void regWrappingTaxP(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWrappingTaxP(), "WRAPPING_TAX_P"); }
    protected abstract ConditionValue xgetCValueWrappingTaxP();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     * @param wrappingTitleR The value of wrappingTitleR as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleR_Equal(String wrappingTitleR) {
        doSetWrappingTitleR_Equal(fRES(wrappingTitleR));
    }

    protected void doSetWrappingTitleR_Equal(String wrappingTitleR) {
        regWrappingTitleR(CK_EQ, wrappingTitleR);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     * @param wrappingTitleR The value of wrappingTitleR as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleR_NotEqual(String wrappingTitleR) {
        doSetWrappingTitleR_NotEqual(fRES(wrappingTitleR));
    }

    protected void doSetWrappingTitleR_NotEqual(String wrappingTitleR) {
        regWrappingTitleR(CK_NES, wrappingTitleR);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     * @param wrappingTitleR The value of wrappingTitleR as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleR_GreaterThan(String wrappingTitleR) {
        regWrappingTitleR(CK_GT, fRES(wrappingTitleR));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     * @param wrappingTitleR The value of wrappingTitleR as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleR_LessThan(String wrappingTitleR) {
        regWrappingTitleR(CK_LT, fRES(wrappingTitleR));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     * @param wrappingTitleR The value of wrappingTitleR as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleR_GreaterEqual(String wrappingTitleR) {
        regWrappingTitleR(CK_GE, fRES(wrappingTitleR));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     * @param wrappingTitleR The value of wrappingTitleR as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleR_LessEqual(String wrappingTitleR) {
        regWrappingTitleR(CK_LE, fRES(wrappingTitleR));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     * @param wrappingTitleRList The collection of wrappingTitleR as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleR_InScope(Collection<String> wrappingTitleRList) {
        doSetWrappingTitleR_InScope(wrappingTitleRList);
    }

    protected void doSetWrappingTitleR_InScope(Collection<String> wrappingTitleRList) {
        regINS(CK_INS, cTL(wrappingTitleRList), xgetCValueWrappingTitleR(), "WRAPPING_TITLE_R");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     * @param wrappingTitleRList The collection of wrappingTitleR as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleR_NotInScope(Collection<String> wrappingTitleRList) {
        doSetWrappingTitleR_NotInScope(wrappingTitleRList);
    }

    protected void doSetWrappingTitleR_NotInScope(Collection<String> wrappingTitleRList) {
        regINS(CK_NINS, cTL(wrappingTitleRList), xgetCValueWrappingTitleR(), "WRAPPING_TITLE_R");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_TITLE_R: {varchar(255)} <br>
     * <pre>e.g. setWrappingTitleR_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wrappingTitleR The value of wrappingTitleR as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWrappingTitleR_LikeSearch(String wrappingTitleR, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wrappingTitleR), xgetCValueWrappingTitleR(), "WRAPPING_TITLE_R", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     * @param wrappingTitleR The value of wrappingTitleR as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWrappingTitleR_NotLikeSearch(String wrappingTitleR, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wrappingTitleR), xgetCValueWrappingTitleR(), "WRAPPING_TITLE_R", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     * @param wrappingTitleR The value of wrappingTitleR as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTitleR_PrefixSearch(String wrappingTitleR) {
        setWrappingTitleR_LikeSearch(wrappingTitleR, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     */
    public void setWrappingTitleR_IsNull() { regWrappingTitleR(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     */
    public void setWrappingTitleR_IsNullOrEmpty() { regWrappingTitleR(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WRAPPING_TITLE_R: {varchar(255)}
     */
    public void setWrappingTitleR_IsNotNull() { regWrappingTitleR(CK_ISNN, DOBJ); }

    protected void regWrappingTitleR(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWrappingTitleR(), "WRAPPING_TITLE_R"); }
    protected abstract ConditionValue xgetCValueWrappingTitleR();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_NM_R: {varchar(255)}
     * @param wrappingNmR The value of wrappingNmR as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmR_Equal(String wrappingNmR) {
        doSetWrappingNmR_Equal(fRES(wrappingNmR));
    }

    protected void doSetWrappingNmR_Equal(String wrappingNmR) {
        regWrappingNmR(CK_EQ, wrappingNmR);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_NM_R: {varchar(255)}
     * @param wrappingNmR The value of wrappingNmR as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmR_NotEqual(String wrappingNmR) {
        doSetWrappingNmR_NotEqual(fRES(wrappingNmR));
    }

    protected void doSetWrappingNmR_NotEqual(String wrappingNmR) {
        regWrappingNmR(CK_NES, wrappingNmR);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_NM_R: {varchar(255)}
     * @param wrappingNmR The value of wrappingNmR as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmR_GreaterThan(String wrappingNmR) {
        regWrappingNmR(CK_GT, fRES(wrappingNmR));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_NM_R: {varchar(255)}
     * @param wrappingNmR The value of wrappingNmR as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmR_LessThan(String wrappingNmR) {
        regWrappingNmR(CK_LT, fRES(wrappingNmR));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_NM_R: {varchar(255)}
     * @param wrappingNmR The value of wrappingNmR as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmR_GreaterEqual(String wrappingNmR) {
        regWrappingNmR(CK_GE, fRES(wrappingNmR));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_NM_R: {varchar(255)}
     * @param wrappingNmR The value of wrappingNmR as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmR_LessEqual(String wrappingNmR) {
        regWrappingNmR(CK_LE, fRES(wrappingNmR));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRAPPING_NM_R: {varchar(255)}
     * @param wrappingNmRList The collection of wrappingNmR as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmR_InScope(Collection<String> wrappingNmRList) {
        doSetWrappingNmR_InScope(wrappingNmRList);
    }

    protected void doSetWrappingNmR_InScope(Collection<String> wrappingNmRList) {
        regINS(CK_INS, cTL(wrappingNmRList), xgetCValueWrappingNmR(), "WRAPPING_NM_R");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRAPPING_NM_R: {varchar(255)}
     * @param wrappingNmRList The collection of wrappingNmR as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmR_NotInScope(Collection<String> wrappingNmRList) {
        doSetWrappingNmR_NotInScope(wrappingNmRList);
    }

    protected void doSetWrappingNmR_NotInScope(Collection<String> wrappingNmRList) {
        regINS(CK_NINS, cTL(wrappingNmRList), xgetCValueWrappingNmR(), "WRAPPING_NM_R");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_NM_R: {varchar(255)} <br>
     * <pre>e.g. setWrappingNmR_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wrappingNmR The value of wrappingNmR as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWrappingNmR_LikeSearch(String wrappingNmR, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wrappingNmR), xgetCValueWrappingNmR(), "WRAPPING_NM_R", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_NM_R: {varchar(255)}
     * @param wrappingNmR The value of wrappingNmR as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWrappingNmR_NotLikeSearch(String wrappingNmR, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wrappingNmR), xgetCValueWrappingNmR(), "WRAPPING_NM_R", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_NM_R: {varchar(255)}
     * @param wrappingNmR The value of wrappingNmR as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingNmR_PrefixSearch(String wrappingNmR) {
        setWrappingNmR_LikeSearch(wrappingNmR, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WRAPPING_NM_R: {varchar(255)}
     */
    public void setWrappingNmR_IsNull() { regWrappingNmR(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WRAPPING_NM_R: {varchar(255)}
     */
    public void setWrappingNmR_IsNullOrEmpty() { regWrappingNmR(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WRAPPING_NM_R: {varchar(255)}
     */
    public void setWrappingNmR_IsNotNull() { regWrappingNmR(CK_ISNN, DOBJ); }

    protected void regWrappingNmR(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWrappingNmR(), "WRAPPING_NM_R"); }
    protected abstract ConditionValue xgetCValueWrappingNmR();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_FEE_R: {bigint(19)}
     * @param wrappingFeeR The value of wrappingFeeR as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingFeeR_Equal(Long wrappingFeeR) {
        doSetWrappingFeeR_Equal(wrappingFeeR);
    }

    protected void doSetWrappingFeeR_Equal(Long wrappingFeeR) {
        regWrappingFeeR(CK_EQ, wrappingFeeR);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_FEE_R: {bigint(19)}
     * @param wrappingFeeR The value of wrappingFeeR as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingFeeR_NotEqual(Long wrappingFeeR) {
        doSetWrappingFeeR_NotEqual(wrappingFeeR);
    }

    protected void doSetWrappingFeeR_NotEqual(Long wrappingFeeR) {
        regWrappingFeeR(CK_NES, wrappingFeeR);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_FEE_R: {bigint(19)}
     * @param wrappingFeeR The value of wrappingFeeR as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingFeeR_GreaterThan(Long wrappingFeeR) {
        regWrappingFeeR(CK_GT, wrappingFeeR);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_FEE_R: {bigint(19)}
     * @param wrappingFeeR The value of wrappingFeeR as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingFeeR_LessThan(Long wrappingFeeR) {
        regWrappingFeeR(CK_LT, wrappingFeeR);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_FEE_R: {bigint(19)}
     * @param wrappingFeeR The value of wrappingFeeR as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingFeeR_GreaterEqual(Long wrappingFeeR) {
        regWrappingFeeR(CK_GE, wrappingFeeR);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_FEE_R: {bigint(19)}
     * @param wrappingFeeR The value of wrappingFeeR as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingFeeR_LessEqual(Long wrappingFeeR) {
        regWrappingFeeR(CK_LE, wrappingFeeR);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_FEE_R: {bigint(19)}
     * @param minNumber The min number of wrappingFeeR. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of wrappingFeeR. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWrappingFeeR_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWrappingFeeR(), "WRAPPING_FEE_R", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WRAPPING_FEE_R: {bigint(19)}
     * @param wrappingFeeRList The collection of wrappingFeeR as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingFeeR_InScope(Collection<Long> wrappingFeeRList) {
        doSetWrappingFeeR_InScope(wrappingFeeRList);
    }

    protected void doSetWrappingFeeR_InScope(Collection<Long> wrappingFeeRList) {
        regINS(CK_INS, cTL(wrappingFeeRList), xgetCValueWrappingFeeR(), "WRAPPING_FEE_R");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WRAPPING_FEE_R: {bigint(19)}
     * @param wrappingFeeRList The collection of wrappingFeeR as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingFeeR_NotInScope(Collection<Long> wrappingFeeRList) {
        doSetWrappingFeeR_NotInScope(wrappingFeeRList);
    }

    protected void doSetWrappingFeeR_NotInScope(Collection<Long> wrappingFeeRList) {
        regINS(CK_NINS, cTL(wrappingFeeRList), xgetCValueWrappingFeeR(), "WRAPPING_FEE_R");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WRAPPING_FEE_R: {bigint(19)}
     */
    public void setWrappingFeeR_IsNull() { regWrappingFeeR(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WRAPPING_FEE_R: {bigint(19)}
     */
    public void setWrappingFeeR_IsNotNull() { regWrappingFeeR(CK_ISNN, DOBJ); }

    protected void regWrappingFeeR(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWrappingFeeR(), "WRAPPING_FEE_R"); }
    protected abstract ConditionValue xgetCValueWrappingFeeR();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TAX_R: {bigint(19)}
     * @param wrappingTaxR The value of wrappingTaxR as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingTaxR_Equal(Long wrappingTaxR) {
        doSetWrappingTaxR_Equal(wrappingTaxR);
    }

    protected void doSetWrappingTaxR_Equal(Long wrappingTaxR) {
        regWrappingTaxR(CK_EQ, wrappingTaxR);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TAX_R: {bigint(19)}
     * @param wrappingTaxR The value of wrappingTaxR as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingTaxR_NotEqual(Long wrappingTaxR) {
        doSetWrappingTaxR_NotEqual(wrappingTaxR);
    }

    protected void doSetWrappingTaxR_NotEqual(Long wrappingTaxR) {
        regWrappingTaxR(CK_NES, wrappingTaxR);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TAX_R: {bigint(19)}
     * @param wrappingTaxR The value of wrappingTaxR as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingTaxR_GreaterThan(Long wrappingTaxR) {
        regWrappingTaxR(CK_GT, wrappingTaxR);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TAX_R: {bigint(19)}
     * @param wrappingTaxR The value of wrappingTaxR as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingTaxR_LessThan(Long wrappingTaxR) {
        regWrappingTaxR(CK_LT, wrappingTaxR);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TAX_R: {bigint(19)}
     * @param wrappingTaxR The value of wrappingTaxR as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingTaxR_GreaterEqual(Long wrappingTaxR) {
        regWrappingTaxR(CK_GE, wrappingTaxR);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TAX_R: {bigint(19)}
     * @param wrappingTaxR The value of wrappingTaxR as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWrappingTaxR_LessEqual(Long wrappingTaxR) {
        regWrappingTaxR(CK_LE, wrappingTaxR);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TAX_R: {bigint(19)}
     * @param minNumber The min number of wrappingTaxR. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of wrappingTaxR. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWrappingTaxR_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWrappingTaxR(), "WRAPPING_TAX_R", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WRAPPING_TAX_R: {bigint(19)}
     * @param wrappingTaxRList The collection of wrappingTaxR as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTaxR_InScope(Collection<Long> wrappingTaxRList) {
        doSetWrappingTaxR_InScope(wrappingTaxRList);
    }

    protected void doSetWrappingTaxR_InScope(Collection<Long> wrappingTaxRList) {
        regINS(CK_INS, cTL(wrappingTaxRList), xgetCValueWrappingTaxR(), "WRAPPING_TAX_R");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WRAPPING_TAX_R: {bigint(19)}
     * @param wrappingTaxRList The collection of wrappingTaxR as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTaxR_NotInScope(Collection<Long> wrappingTaxRList) {
        doSetWrappingTaxR_NotInScope(wrappingTaxRList);
    }

    protected void doSetWrappingTaxR_NotInScope(Collection<Long> wrappingTaxRList) {
        regINS(CK_NINS, cTL(wrappingTaxRList), xgetCValueWrappingTaxR(), "WRAPPING_TAX_R");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WRAPPING_TAX_R: {bigint(19)}
     */
    public void setWrappingTaxR_IsNull() { regWrappingTaxR(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WRAPPING_TAX_R: {bigint(19)}
     */
    public void setWrappingTaxR_IsNotNull() { regWrappingTaxR(CK_ISNN, DOBJ); }

    protected void regWrappingTaxR(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWrappingTaxR(), "WRAPPING_TAX_R"); }
    protected abstract ConditionValue xgetCValueWrappingTaxR();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CARRIAGE: {bigint(19)}
     * @param delivCarriage The value of delivCarriage as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCarriage_Equal(Long delivCarriage) {
        doSetDelivCarriage_Equal(delivCarriage);
    }

    protected void doSetDelivCarriage_Equal(Long delivCarriage) {
        regDelivCarriage(CK_EQ, delivCarriage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CARRIAGE: {bigint(19)}
     * @param delivCarriage The value of delivCarriage as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCarriage_NotEqual(Long delivCarriage) {
        doSetDelivCarriage_NotEqual(delivCarriage);
    }

    protected void doSetDelivCarriage_NotEqual(Long delivCarriage) {
        regDelivCarriage(CK_NES, delivCarriage);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CARRIAGE: {bigint(19)}
     * @param delivCarriage The value of delivCarriage as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCarriage_GreaterThan(Long delivCarriage) {
        regDelivCarriage(CK_GT, delivCarriage);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CARRIAGE: {bigint(19)}
     * @param delivCarriage The value of delivCarriage as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCarriage_LessThan(Long delivCarriage) {
        regDelivCarriage(CK_LT, delivCarriage);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CARRIAGE: {bigint(19)}
     * @param delivCarriage The value of delivCarriage as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCarriage_GreaterEqual(Long delivCarriage) {
        regDelivCarriage(CK_GE, delivCarriage);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CARRIAGE: {bigint(19)}
     * @param delivCarriage The value of delivCarriage as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCarriage_LessEqual(Long delivCarriage) {
        regDelivCarriage(CK_LE, delivCarriage);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CARRIAGE: {bigint(19)}
     * @param minNumber The min number of delivCarriage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delivCarriage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDelivCarriage_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelivCarriage(), "DELIV_CARRIAGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_CARRIAGE: {bigint(19)}
     * @param delivCarriageList The collection of delivCarriage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCarriage_InScope(Collection<Long> delivCarriageList) {
        doSetDelivCarriage_InScope(delivCarriageList);
    }

    protected void doSetDelivCarriage_InScope(Collection<Long> delivCarriageList) {
        regINS(CK_INS, cTL(delivCarriageList), xgetCValueDelivCarriage(), "DELIV_CARRIAGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_CARRIAGE: {bigint(19)}
     * @param delivCarriageList The collection of delivCarriage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCarriage_NotInScope(Collection<Long> delivCarriageList) {
        doSetDelivCarriage_NotInScope(delivCarriageList);
    }

    protected void doSetDelivCarriage_NotInScope(Collection<Long> delivCarriageList) {
        regINS(CK_NINS, cTL(delivCarriageList), xgetCValueDelivCarriage(), "DELIV_CARRIAGE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CARRIAGE: {bigint(19)}
     */
    public void setDelivCarriage_IsNull() { regDelivCarriage(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CARRIAGE: {bigint(19)}
     */
    public void setDelivCarriage_IsNotNull() { regDelivCarriage(CK_ISNN, DOBJ); }

    protected void regDelivCarriage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCarriage(), "DELIV_CARRIAGE"); }
    protected abstract ConditionValue xgetCValueDelivCarriage();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_COD: {bigint(19)}
     * @param delivCod The value of delivCod as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCod_Equal(Long delivCod) {
        doSetDelivCod_Equal(delivCod);
    }

    protected void doSetDelivCod_Equal(Long delivCod) {
        regDelivCod(CK_EQ, delivCod);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_COD: {bigint(19)}
     * @param delivCod The value of delivCod as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCod_NotEqual(Long delivCod) {
        doSetDelivCod_NotEqual(delivCod);
    }

    protected void doSetDelivCod_NotEqual(Long delivCod) {
        regDelivCod(CK_NES, delivCod);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_COD: {bigint(19)}
     * @param delivCod The value of delivCod as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCod_GreaterThan(Long delivCod) {
        regDelivCod(CK_GT, delivCod);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_COD: {bigint(19)}
     * @param delivCod The value of delivCod as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCod_LessThan(Long delivCod) {
        regDelivCod(CK_LT, delivCod);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_COD: {bigint(19)}
     * @param delivCod The value of delivCod as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCod_GreaterEqual(Long delivCod) {
        regDelivCod(CK_GE, delivCod);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_COD: {bigint(19)}
     * @param delivCod The value of delivCod as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCod_LessEqual(Long delivCod) {
        regDelivCod(CK_LE, delivCod);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_COD: {bigint(19)}
     * @param minNumber The min number of delivCod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delivCod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDelivCod_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelivCod(), "DELIV_COD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_COD: {bigint(19)}
     * @param delivCodList The collection of delivCod as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCod_InScope(Collection<Long> delivCodList) {
        doSetDelivCod_InScope(delivCodList);
    }

    protected void doSetDelivCod_InScope(Collection<Long> delivCodList) {
        regINS(CK_INS, cTL(delivCodList), xgetCValueDelivCod(), "DELIV_COD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_COD: {bigint(19)}
     * @param delivCodList The collection of delivCod as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCod_NotInScope(Collection<Long> delivCodList) {
        doSetDelivCod_NotInScope(delivCodList);
    }

    protected void doSetDelivCod_NotInScope(Collection<Long> delivCodList) {
        regINS(CK_NINS, cTL(delivCodList), xgetCValueDelivCod(), "DELIV_COD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_COD: {bigint(19)}
     */
    public void setDelivCod_IsNull() { regDelivCod(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_COD: {bigint(19)}
     */
    public void setDelivCod_IsNotNull() { regDelivCod(CK_ISNN, DOBJ); }

    protected void regDelivCod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCod(), "DELIV_COD"); }
    protected abstract ConditionValue xgetCValueDelivCod();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_TAX: {bigint(19)}
     * @param delivTax The value of delivTax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTax_Equal(Long delivTax) {
        doSetDelivTax_Equal(delivTax);
    }

    protected void doSetDelivTax_Equal(Long delivTax) {
        regDelivTax(CK_EQ, delivTax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_TAX: {bigint(19)}
     * @param delivTax The value of delivTax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTax_NotEqual(Long delivTax) {
        doSetDelivTax_NotEqual(delivTax);
    }

    protected void doSetDelivTax_NotEqual(Long delivTax) {
        regDelivTax(CK_NES, delivTax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_TAX: {bigint(19)}
     * @param delivTax The value of delivTax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTax_GreaterThan(Long delivTax) {
        regDelivTax(CK_GT, delivTax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_TAX: {bigint(19)}
     * @param delivTax The value of delivTax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTax_LessThan(Long delivTax) {
        regDelivTax(CK_LT, delivTax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_TAX: {bigint(19)}
     * @param delivTax The value of delivTax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTax_GreaterEqual(Long delivTax) {
        regDelivTax(CK_GE, delivTax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_TAX: {bigint(19)}
     * @param delivTax The value of delivTax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTax_LessEqual(Long delivTax) {
        regDelivTax(CK_LE, delivTax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_TAX: {bigint(19)}
     * @param minNumber The min number of delivTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delivTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDelivTax_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelivTax(), "DELIV_TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_TAX: {bigint(19)}
     * @param delivTaxList The collection of delivTax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTax_InScope(Collection<Long> delivTaxList) {
        doSetDelivTax_InScope(delivTaxList);
    }

    protected void doSetDelivTax_InScope(Collection<Long> delivTaxList) {
        regINS(CK_INS, cTL(delivTaxList), xgetCValueDelivTax(), "DELIV_TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_TAX: {bigint(19)}
     * @param delivTaxList The collection of delivTax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTax_NotInScope(Collection<Long> delivTaxList) {
        doSetDelivTax_NotInScope(delivTaxList);
    }

    protected void doSetDelivTax_NotInScope(Collection<Long> delivTaxList) {
        regINS(CK_NINS, cTL(delivTaxList), xgetCValueDelivTax(), "DELIV_TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TAX: {bigint(19)}
     */
    public void setDelivTax_IsNull() { regDelivTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TAX: {bigint(19)}
     */
    public void setDelivTax_IsNotNull() { regDelivTax(CK_ISNN, DOBJ); }

    protected void regDelivTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTax(), "DELIV_TAX"); }
    protected abstract ConditionValue xgetCValueDelivTax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_Equal(String carrierTraceNum) {
        doSetCarrierTraceNum_Equal(fRES(carrierTraceNum));
    }

    protected void doSetCarrierTraceNum_Equal(String carrierTraceNum) {
        regCarrierTraceNum(CK_EQ, carrierTraceNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_NotEqual(String carrierTraceNum) {
        doSetCarrierTraceNum_NotEqual(fRES(carrierTraceNum));
    }

    protected void doSetCarrierTraceNum_NotEqual(String carrierTraceNum) {
        regCarrierTraceNum(CK_NES, carrierTraceNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_GreaterThan(String carrierTraceNum) {
        regCarrierTraceNum(CK_GT, fRES(carrierTraceNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_LessThan(String carrierTraceNum) {
        regCarrierTraceNum(CK_LT, fRES(carrierTraceNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_GreaterEqual(String carrierTraceNum) {
        regCarrierTraceNum(CK_GE, fRES(carrierTraceNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_LessEqual(String carrierTraceNum) {
        regCarrierTraceNum(CK_LE, fRES(carrierTraceNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNumList The collection of carrierTraceNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_InScope(Collection<String> carrierTraceNumList) {
        doSetCarrierTraceNum_InScope(carrierTraceNumList);
    }

    protected void doSetCarrierTraceNum_InScope(Collection<String> carrierTraceNumList) {
        regINS(CK_INS, cTL(carrierTraceNumList), xgetCValueCarrierTraceNum(), "CARRIER_TRACE_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNumList The collection of carrierTraceNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_NotInScope(Collection<String> carrierTraceNumList) {
        doSetCarrierTraceNum_NotInScope(carrierTraceNumList);
    }

    protected void doSetCarrierTraceNum_NotInScope(Collection<String> carrierTraceNumList) {
        regINS(CK_NINS, cTL(carrierTraceNumList), xgetCValueCarrierTraceNum(), "CARRIER_TRACE_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)} <br>
     * <pre>e.g. setCarrierTraceNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierTraceNum The value of carrierTraceNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierTraceNum_LikeSearch(String carrierTraceNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierTraceNum), xgetCValueCarrierTraceNum(), "CARRIER_TRACE_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierTraceNum_NotLikeSearch(String carrierTraceNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierTraceNum), xgetCValueCarrierTraceNum(), "CARRIER_TRACE_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_PrefixSearch(String carrierTraceNum) {
        setCarrierTraceNum_LikeSearch(carrierTraceNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     */
    public void setCarrierTraceNum_IsNull() { regCarrierTraceNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     */
    public void setCarrierTraceNum_IsNullOrEmpty() { regCarrierTraceNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     */
    public void setCarrierTraceNum_IsNotNull() { regCarrierTraceNum(CK_ISNN, DOBJ); }

    protected void regCarrierTraceNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierTraceNum(), "CARRIER_TRACE_NUM"); }
    protected abstract ConditionValue xgetCValueCarrierTraceNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_TOTAL: {bigint(19)}
     * @param delivTotal The value of delivTotal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTotal_Equal(Long delivTotal) {
        doSetDelivTotal_Equal(delivTotal);
    }

    protected void doSetDelivTotal_Equal(Long delivTotal) {
        regDelivTotal(CK_EQ, delivTotal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_TOTAL: {bigint(19)}
     * @param delivTotal The value of delivTotal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTotal_NotEqual(Long delivTotal) {
        doSetDelivTotal_NotEqual(delivTotal);
    }

    protected void doSetDelivTotal_NotEqual(Long delivTotal) {
        regDelivTotal(CK_NES, delivTotal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_TOTAL: {bigint(19)}
     * @param delivTotal The value of delivTotal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTotal_GreaterThan(Long delivTotal) {
        regDelivTotal(CK_GT, delivTotal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_TOTAL: {bigint(19)}
     * @param delivTotal The value of delivTotal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTotal_LessThan(Long delivTotal) {
        regDelivTotal(CK_LT, delivTotal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_TOTAL: {bigint(19)}
     * @param delivTotal The value of delivTotal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTotal_GreaterEqual(Long delivTotal) {
        regDelivTotal(CK_GE, delivTotal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_TOTAL: {bigint(19)}
     * @param delivTotal The value of delivTotal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTotal_LessEqual(Long delivTotal) {
        regDelivTotal(CK_LE, delivTotal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_TOTAL: {bigint(19)}
     * @param minNumber The min number of delivTotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delivTotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDelivTotal_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelivTotal(), "DELIV_TOTAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_TOTAL: {bigint(19)}
     * @param delivTotalList The collection of delivTotal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTotal_InScope(Collection<Long> delivTotalList) {
        doSetDelivTotal_InScope(delivTotalList);
    }

    protected void doSetDelivTotal_InScope(Collection<Long> delivTotalList) {
        regINS(CK_INS, cTL(delivTotalList), xgetCValueDelivTotal(), "DELIV_TOTAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_TOTAL: {bigint(19)}
     * @param delivTotalList The collection of delivTotal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTotal_NotInScope(Collection<Long> delivTotalList) {
        doSetDelivTotal_NotInScope(delivTotalList);
    }

    protected void doSetDelivTotal_NotInScope(Collection<Long> delivTotalList) {
        regINS(CK_NINS, cTL(delivTotalList), xgetCValueDelivTotal(), "DELIV_TOTAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TOTAL: {bigint(19)}
     */
    public void setDelivTotal_IsNull() { regDelivTotal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TOTAL: {bigint(19)}
     */
    public void setDelivTotal_IsNotNull() { regDelivTotal(CK_ISNN, DOBJ); }

    protected void regDelivTotal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTotal(), "DELIV_TOTAL"); }
    protected abstract ConditionValue xgetCValueDelivTotal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_Equal(String noshi) {
        doSetNoshi_Equal(fRES(noshi));
    }

    protected void doSetNoshi_Equal(String noshi) {
        regNoshi(CK_EQ, noshi);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_NotEqual(String noshi) {
        doSetNoshi_NotEqual(fRES(noshi));
    }

    protected void doSetNoshi_NotEqual(String noshi) {
        regNoshi(CK_NES, noshi);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_GreaterThan(String noshi) {
        regNoshi(CK_GT, fRES(noshi));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_LessThan(String noshi) {
        regNoshi(CK_LT, fRES(noshi));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_GreaterEqual(String noshi) {
        regNoshi(CK_GE, fRES(noshi));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_LessEqual(String noshi) {
        regNoshi(CK_LE, fRES(noshi));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshiList The collection of noshi as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_InScope(Collection<String> noshiList) {
        doSetNoshi_InScope(noshiList);
    }

    protected void doSetNoshi_InScope(Collection<String> noshiList) {
        regINS(CK_INS, cTL(noshiList), xgetCValueNoshi(), "NOSHI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshiList The collection of noshi as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_NotInScope(Collection<String> noshiList) {
        doSetNoshi_NotInScope(noshiList);
    }

    protected void doSetNoshi_NotInScope(Collection<String> noshiList) {
        regINS(CK_NINS, cTL(noshiList), xgetCValueNoshi(), "NOSHI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOSHI: {varchar(255)} <br>
     * <pre>e.g. setNoshi_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param noshi The value of noshi as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNoshi_LikeSearch(String noshi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(noshi), xgetCValueNoshi(), "NOSHI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNoshi_NotLikeSearch(String noshi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(noshi), xgetCValueNoshi(), "NOSHI", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOSHI: {varchar(255)}
     * @param noshi The value of noshi as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshi_PrefixSearch(String noshi) {
        setNoshi_LikeSearch(noshi, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     */
    public void setNoshi_IsNull() { regNoshi(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     */
    public void setNoshi_IsNullOrEmpty() { regNoshi(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOSHI: {varchar(255)}
     */
    public void setNoshi_IsNotNull() { regNoshi(CK_ISNN, DOBJ); }

    protected void regNoshi(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoshi(), "NOSHI"); }
    protected abstract ConditionValue xgetCValueNoshi();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     * @param delivZipCd1 The value of delivZipCd1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd1_Equal(String delivZipCd1) {
        doSetDelivZipCd1_Equal(fRES(delivZipCd1));
    }

    protected void doSetDelivZipCd1_Equal(String delivZipCd1) {
        regDelivZipCd1(CK_EQ, delivZipCd1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     * @param delivZipCd1 The value of delivZipCd1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd1_NotEqual(String delivZipCd1) {
        doSetDelivZipCd1_NotEqual(fRES(delivZipCd1));
    }

    protected void doSetDelivZipCd1_NotEqual(String delivZipCd1) {
        regDelivZipCd1(CK_NES, delivZipCd1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     * @param delivZipCd1 The value of delivZipCd1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd1_GreaterThan(String delivZipCd1) {
        regDelivZipCd1(CK_GT, fRES(delivZipCd1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     * @param delivZipCd1 The value of delivZipCd1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd1_LessThan(String delivZipCd1) {
        regDelivZipCd1(CK_LT, fRES(delivZipCd1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     * @param delivZipCd1 The value of delivZipCd1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd1_GreaterEqual(String delivZipCd1) {
        regDelivZipCd1(CK_GE, fRES(delivZipCd1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     * @param delivZipCd1 The value of delivZipCd1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd1_LessEqual(String delivZipCd1) {
        regDelivZipCd1(CK_LE, fRES(delivZipCd1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     * @param delivZipCd1List The collection of delivZipCd1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd1_InScope(Collection<String> delivZipCd1List) {
        doSetDelivZipCd1_InScope(delivZipCd1List);
    }

    protected void doSetDelivZipCd1_InScope(Collection<String> delivZipCd1List) {
        regINS(CK_INS, cTL(delivZipCd1List), xgetCValueDelivZipCd1(), "DELIV_ZIP_CD1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     * @param delivZipCd1List The collection of delivZipCd1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd1_NotInScope(Collection<String> delivZipCd1List) {
        doSetDelivZipCd1_NotInScope(delivZipCd1List);
    }

    protected void doSetDelivZipCd1_NotInScope(Collection<String> delivZipCd1List) {
        regINS(CK_NINS, cTL(delivZipCd1List), xgetCValueDelivZipCd1(), "DELIV_ZIP_CD1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD1: {varchar(30)} <br>
     * <pre>e.g. setDelivZipCd1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivZipCd1 The value of delivZipCd1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivZipCd1_LikeSearch(String delivZipCd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivZipCd1), xgetCValueDelivZipCd1(), "DELIV_ZIP_CD1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     * @param delivZipCd1 The value of delivZipCd1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivZipCd1_NotLikeSearch(String delivZipCd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivZipCd1), xgetCValueDelivZipCd1(), "DELIV_ZIP_CD1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     * @param delivZipCd1 The value of delivZipCd1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd1_PrefixSearch(String delivZipCd1) {
        setDelivZipCd1_LikeSearch(delivZipCd1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     */
    public void setDelivZipCd1_IsNull() { regDelivZipCd1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     */
    public void setDelivZipCd1_IsNullOrEmpty() { regDelivZipCd1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD1: {varchar(30)}
     */
    public void setDelivZipCd1_IsNotNull() { regDelivZipCd1(CK_ISNN, DOBJ); }

    protected void regDelivZipCd1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivZipCd1(), "DELIV_ZIP_CD1"); }
    protected abstract ConditionValue xgetCValueDelivZipCd1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     * @param delivZipCd2 The value of delivZipCd2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd2_Equal(String delivZipCd2) {
        doSetDelivZipCd2_Equal(fRES(delivZipCd2));
    }

    protected void doSetDelivZipCd2_Equal(String delivZipCd2) {
        regDelivZipCd2(CK_EQ, delivZipCd2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     * @param delivZipCd2 The value of delivZipCd2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd2_NotEqual(String delivZipCd2) {
        doSetDelivZipCd2_NotEqual(fRES(delivZipCd2));
    }

    protected void doSetDelivZipCd2_NotEqual(String delivZipCd2) {
        regDelivZipCd2(CK_NES, delivZipCd2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     * @param delivZipCd2 The value of delivZipCd2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd2_GreaterThan(String delivZipCd2) {
        regDelivZipCd2(CK_GT, fRES(delivZipCd2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     * @param delivZipCd2 The value of delivZipCd2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd2_LessThan(String delivZipCd2) {
        regDelivZipCd2(CK_LT, fRES(delivZipCd2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     * @param delivZipCd2 The value of delivZipCd2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd2_GreaterEqual(String delivZipCd2) {
        regDelivZipCd2(CK_GE, fRES(delivZipCd2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     * @param delivZipCd2 The value of delivZipCd2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd2_LessEqual(String delivZipCd2) {
        regDelivZipCd2(CK_LE, fRES(delivZipCd2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     * @param delivZipCd2List The collection of delivZipCd2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd2_InScope(Collection<String> delivZipCd2List) {
        doSetDelivZipCd2_InScope(delivZipCd2List);
    }

    protected void doSetDelivZipCd2_InScope(Collection<String> delivZipCd2List) {
        regINS(CK_INS, cTL(delivZipCd2List), xgetCValueDelivZipCd2(), "DELIV_ZIP_CD2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     * @param delivZipCd2List The collection of delivZipCd2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd2_NotInScope(Collection<String> delivZipCd2List) {
        doSetDelivZipCd2_NotInScope(delivZipCd2List);
    }

    protected void doSetDelivZipCd2_NotInScope(Collection<String> delivZipCd2List) {
        regINS(CK_NINS, cTL(delivZipCd2List), xgetCValueDelivZipCd2(), "DELIV_ZIP_CD2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD2: {varchar(30)} <br>
     * <pre>e.g. setDelivZipCd2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivZipCd2 The value of delivZipCd2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivZipCd2_LikeSearch(String delivZipCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivZipCd2), xgetCValueDelivZipCd2(), "DELIV_ZIP_CD2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     * @param delivZipCd2 The value of delivZipCd2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivZipCd2_NotLikeSearch(String delivZipCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivZipCd2), xgetCValueDelivZipCd2(), "DELIV_ZIP_CD2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     * @param delivZipCd2 The value of delivZipCd2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd2_PrefixSearch(String delivZipCd2) {
        setDelivZipCd2_LikeSearch(delivZipCd2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     */
    public void setDelivZipCd2_IsNull() { regDelivZipCd2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     */
    public void setDelivZipCd2_IsNullOrEmpty() { regDelivZipCd2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD2: {varchar(30)}
     */
    public void setDelivZipCd2_IsNotNull() { regDelivZipCd2(CK_ISNN, DOBJ); }

    protected void regDelivZipCd2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivZipCd2(), "DELIV_ZIP_CD2"); }
    protected abstract ConditionValue xgetCValueDelivZipCd2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_Equal(String delivAddress1) {
        doSetDelivAddress1_Equal(fRES(delivAddress1));
    }

    protected void doSetDelivAddress1_Equal(String delivAddress1) {
        regDelivAddress1(CK_EQ, delivAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_NotEqual(String delivAddress1) {
        doSetDelivAddress1_NotEqual(fRES(delivAddress1));
    }

    protected void doSetDelivAddress1_NotEqual(String delivAddress1) {
        regDelivAddress1(CK_NES, delivAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_GreaterThan(String delivAddress1) {
        regDelivAddress1(CK_GT, fRES(delivAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_LessThan(String delivAddress1) {
        regDelivAddress1(CK_LT, fRES(delivAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_GreaterEqual(String delivAddress1) {
        regDelivAddress1(CK_GE, fRES(delivAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_LessEqual(String delivAddress1) {
        regDelivAddress1(CK_LE, fRES(delivAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1List The collection of delivAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_InScope(Collection<String> delivAddress1List) {
        doSetDelivAddress1_InScope(delivAddress1List);
    }

    protected void doSetDelivAddress1_InScope(Collection<String> delivAddress1List) {
        regINS(CK_INS, cTL(delivAddress1List), xgetCValueDelivAddress1(), "DELIV_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1List The collection of delivAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_NotInScope(Collection<String> delivAddress1List) {
        doSetDelivAddress1_NotInScope(delivAddress1List);
    }

    protected void doSetDelivAddress1_NotInScope(Collection<String> delivAddress1List) {
        regINS(CK_NINS, cTL(delivAddress1List), xgetCValueDelivAddress1(), "DELIV_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)} <br>
     * <pre>e.g. setDelivAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress1 The value of delivAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress1_LikeSearch(String delivAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress1), xgetCValueDelivAddress1(), "DELIV_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress1_NotLikeSearch(String delivAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress1), xgetCValueDelivAddress1(), "DELIV_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_PrefixSearch(String delivAddress1) {
        setDelivAddress1_LikeSearch(delivAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     */
    public void setDelivAddress1_IsNull() { regDelivAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     */
    public void setDelivAddress1_IsNullOrEmpty() { regDelivAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     */
    public void setDelivAddress1_IsNotNull() { regDelivAddress1(CK_ISNN, DOBJ); }

    protected void regDelivAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress1(), "DELIV_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueDelivAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_Equal(String delivAddress2) {
        doSetDelivAddress2_Equal(fRES(delivAddress2));
    }

    protected void doSetDelivAddress2_Equal(String delivAddress2) {
        regDelivAddress2(CK_EQ, delivAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_NotEqual(String delivAddress2) {
        doSetDelivAddress2_NotEqual(fRES(delivAddress2));
    }

    protected void doSetDelivAddress2_NotEqual(String delivAddress2) {
        regDelivAddress2(CK_NES, delivAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_GreaterThan(String delivAddress2) {
        regDelivAddress2(CK_GT, fRES(delivAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_LessThan(String delivAddress2) {
        regDelivAddress2(CK_LT, fRES(delivAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_GreaterEqual(String delivAddress2) {
        regDelivAddress2(CK_GE, fRES(delivAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_LessEqual(String delivAddress2) {
        regDelivAddress2(CK_LE, fRES(delivAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2List The collection of delivAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_InScope(Collection<String> delivAddress2List) {
        doSetDelivAddress2_InScope(delivAddress2List);
    }

    protected void doSetDelivAddress2_InScope(Collection<String> delivAddress2List) {
        regINS(CK_INS, cTL(delivAddress2List), xgetCValueDelivAddress2(), "DELIV_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2List The collection of delivAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_NotInScope(Collection<String> delivAddress2List) {
        doSetDelivAddress2_NotInScope(delivAddress2List);
    }

    protected void doSetDelivAddress2_NotInScope(Collection<String> delivAddress2List) {
        regINS(CK_NINS, cTL(delivAddress2List), xgetCValueDelivAddress2(), "DELIV_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)} <br>
     * <pre>e.g. setDelivAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress2 The value of delivAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress2_LikeSearch(String delivAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress2), xgetCValueDelivAddress2(), "DELIV_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress2_NotLikeSearch(String delivAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress2), xgetCValueDelivAddress2(), "DELIV_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_PrefixSearch(String delivAddress2) {
        setDelivAddress2_LikeSearch(delivAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     */
    public void setDelivAddress2_IsNull() { regDelivAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     */
    public void setDelivAddress2_IsNullOrEmpty() { regDelivAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     */
    public void setDelivAddress2_IsNotNull() { regDelivAddress2(CK_ISNN, DOBJ); }

    protected void regDelivAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress2(), "DELIV_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueDelivAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_Equal(String delivAddress3) {
        doSetDelivAddress3_Equal(fRES(delivAddress3));
    }

    protected void doSetDelivAddress3_Equal(String delivAddress3) {
        regDelivAddress3(CK_EQ, delivAddress3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_NotEqual(String delivAddress3) {
        doSetDelivAddress3_NotEqual(fRES(delivAddress3));
    }

    protected void doSetDelivAddress3_NotEqual(String delivAddress3) {
        regDelivAddress3(CK_NES, delivAddress3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_GreaterThan(String delivAddress3) {
        regDelivAddress3(CK_GT, fRES(delivAddress3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_LessThan(String delivAddress3) {
        regDelivAddress3(CK_LT, fRES(delivAddress3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_GreaterEqual(String delivAddress3) {
        regDelivAddress3(CK_GE, fRES(delivAddress3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_LessEqual(String delivAddress3) {
        regDelivAddress3(CK_LE, fRES(delivAddress3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3List The collection of delivAddress3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_InScope(Collection<String> delivAddress3List) {
        doSetDelivAddress3_InScope(delivAddress3List);
    }

    protected void doSetDelivAddress3_InScope(Collection<String> delivAddress3List) {
        regINS(CK_INS, cTL(delivAddress3List), xgetCValueDelivAddress3(), "DELIV_ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3List The collection of delivAddress3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_NotInScope(Collection<String> delivAddress3List) {
        doSetDelivAddress3_NotInScope(delivAddress3List);
    }

    protected void doSetDelivAddress3_NotInScope(Collection<String> delivAddress3List) {
        regINS(CK_NINS, cTL(delivAddress3List), xgetCValueDelivAddress3(), "DELIV_ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)} <br>
     * <pre>e.g. setDelivAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress3 The value of delivAddress3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress3_LikeSearch(String delivAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress3), xgetCValueDelivAddress3(), "DELIV_ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress3_NotLikeSearch(String delivAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress3), xgetCValueDelivAddress3(), "DELIV_ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_PrefixSearch(String delivAddress3) {
        setDelivAddress3_LikeSearch(delivAddress3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     */
    public void setDelivAddress3_IsNull() { regDelivAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     */
    public void setDelivAddress3_IsNullOrEmpty() { regDelivAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     */
    public void setDelivAddress3_IsNotNull() { regDelivAddress3(CK_ISNN, DOBJ); }

    protected void regDelivAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress3(), "DELIV_ADDRESS3"); }
    protected abstract ConditionValue xgetCValueDelivAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_Equal(String delivCustomerNm1) {
        doSetDelivCustomerNm1_Equal(fRES(delivCustomerNm1));
    }

    protected void doSetDelivCustomerNm1_Equal(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_EQ, delivCustomerNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_NotEqual(String delivCustomerNm1) {
        doSetDelivCustomerNm1_NotEqual(fRES(delivCustomerNm1));
    }

    protected void doSetDelivCustomerNm1_NotEqual(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_NES, delivCustomerNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_GreaterThan(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_GT, fRES(delivCustomerNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_LessThan(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_LT, fRES(delivCustomerNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_GreaterEqual(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_GE, fRES(delivCustomerNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_LessEqual(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_LE, fRES(delivCustomerNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     * @param delivCustomerNm1List The collection of delivCustomerNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_InScope(Collection<String> delivCustomerNm1List) {
        doSetDelivCustomerNm1_InScope(delivCustomerNm1List);
    }

    protected void doSetDelivCustomerNm1_InScope(Collection<String> delivCustomerNm1List) {
        regINS(CK_INS, cTL(delivCustomerNm1List), xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     * @param delivCustomerNm1List The collection of delivCustomerNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_NotInScope(Collection<String> delivCustomerNm1List) {
        doSetDelivCustomerNm1_NotInScope(delivCustomerNm1List);
    }

    protected void doSetDelivCustomerNm1_NotInScope(Collection<String> delivCustomerNm1List) {
        regINS(CK_NINS, cTL(delivCustomerNm1List), xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)} <br>
     * <pre>e.g. setDelivCustomerNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerNm1 The value of delivCustomerNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerNm1_LikeSearch(String delivCustomerNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerNm1), xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerNm1_NotLikeSearch(String delivCustomerNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerNm1), xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_PrefixSearch(String delivCustomerNm1) {
        setDelivCustomerNm1_LikeSearch(delivCustomerNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     */
    public void setDelivCustomerNm1_IsNull() { regDelivCustomerNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     */
    public void setDelivCustomerNm1_IsNullOrEmpty() { regDelivCustomerNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     */
    public void setDelivCustomerNm1_IsNotNull() { regDelivCustomerNm1(CK_ISNN, DOBJ); }

    protected void regDelivCustomerNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1"); }
    protected abstract ConditionValue xgetCValueDelivCustomerNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_Equal(String delivCustomerNm2) {
        doSetDelivCustomerNm2_Equal(fRES(delivCustomerNm2));
    }

    protected void doSetDelivCustomerNm2_Equal(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_EQ, delivCustomerNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_NotEqual(String delivCustomerNm2) {
        doSetDelivCustomerNm2_NotEqual(fRES(delivCustomerNm2));
    }

    protected void doSetDelivCustomerNm2_NotEqual(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_NES, delivCustomerNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_GreaterThan(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_GT, fRES(delivCustomerNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_LessThan(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_LT, fRES(delivCustomerNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_GreaterEqual(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_GE, fRES(delivCustomerNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_LessEqual(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_LE, fRES(delivCustomerNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     * @param delivCustomerNm2List The collection of delivCustomerNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_InScope(Collection<String> delivCustomerNm2List) {
        doSetDelivCustomerNm2_InScope(delivCustomerNm2List);
    }

    protected void doSetDelivCustomerNm2_InScope(Collection<String> delivCustomerNm2List) {
        regINS(CK_INS, cTL(delivCustomerNm2List), xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     * @param delivCustomerNm2List The collection of delivCustomerNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_NotInScope(Collection<String> delivCustomerNm2List) {
        doSetDelivCustomerNm2_NotInScope(delivCustomerNm2List);
    }

    protected void doSetDelivCustomerNm2_NotInScope(Collection<String> delivCustomerNm2List) {
        regINS(CK_NINS, cTL(delivCustomerNm2List), xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)} <br>
     * <pre>e.g. setDelivCustomerNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerNm2 The value of delivCustomerNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerNm2_LikeSearch(String delivCustomerNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerNm2), xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerNm2_NotLikeSearch(String delivCustomerNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerNm2), xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_PrefixSearch(String delivCustomerNm2) {
        setDelivCustomerNm2_LikeSearch(delivCustomerNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     */
    public void setDelivCustomerNm2_IsNull() { regDelivCustomerNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     */
    public void setDelivCustomerNm2_IsNullOrEmpty() { regDelivCustomerNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     */
    public void setDelivCustomerNm2_IsNotNull() { regDelivCustomerNm2(CK_ISNN, DOBJ); }

    protected void regDelivCustomerNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2"); }
    protected abstract ConditionValue xgetCValueDelivCustomerNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     * @param delivCustomerKn1 The value of delivCustomerKn1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn1_Equal(String delivCustomerKn1) {
        doSetDelivCustomerKn1_Equal(fRES(delivCustomerKn1));
    }

    protected void doSetDelivCustomerKn1_Equal(String delivCustomerKn1) {
        regDelivCustomerKn1(CK_EQ, delivCustomerKn1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     * @param delivCustomerKn1 The value of delivCustomerKn1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn1_NotEqual(String delivCustomerKn1) {
        doSetDelivCustomerKn1_NotEqual(fRES(delivCustomerKn1));
    }

    protected void doSetDelivCustomerKn1_NotEqual(String delivCustomerKn1) {
        regDelivCustomerKn1(CK_NES, delivCustomerKn1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     * @param delivCustomerKn1 The value of delivCustomerKn1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn1_GreaterThan(String delivCustomerKn1) {
        regDelivCustomerKn1(CK_GT, fRES(delivCustomerKn1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     * @param delivCustomerKn1 The value of delivCustomerKn1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn1_LessThan(String delivCustomerKn1) {
        regDelivCustomerKn1(CK_LT, fRES(delivCustomerKn1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     * @param delivCustomerKn1 The value of delivCustomerKn1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn1_GreaterEqual(String delivCustomerKn1) {
        regDelivCustomerKn1(CK_GE, fRES(delivCustomerKn1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     * @param delivCustomerKn1 The value of delivCustomerKn1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn1_LessEqual(String delivCustomerKn1) {
        regDelivCustomerKn1(CK_LE, fRES(delivCustomerKn1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     * @param delivCustomerKn1List The collection of delivCustomerKn1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn1_InScope(Collection<String> delivCustomerKn1List) {
        doSetDelivCustomerKn1_InScope(delivCustomerKn1List);
    }

    protected void doSetDelivCustomerKn1_InScope(Collection<String> delivCustomerKn1List) {
        regINS(CK_INS, cTL(delivCustomerKn1List), xgetCValueDelivCustomerKn1(), "DELIV_CUSTOMER_KN1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     * @param delivCustomerKn1List The collection of delivCustomerKn1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn1_NotInScope(Collection<String> delivCustomerKn1List) {
        doSetDelivCustomerKn1_NotInScope(delivCustomerKn1List);
    }

    protected void doSetDelivCustomerKn1_NotInScope(Collection<String> delivCustomerKn1List) {
        regINS(CK_NINS, cTL(delivCustomerKn1List), xgetCValueDelivCustomerKn1(), "DELIV_CUSTOMER_KN1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)} <br>
     * <pre>e.g. setDelivCustomerKn1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerKn1 The value of delivCustomerKn1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerKn1_LikeSearch(String delivCustomerKn1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerKn1), xgetCValueDelivCustomerKn1(), "DELIV_CUSTOMER_KN1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     * @param delivCustomerKn1 The value of delivCustomerKn1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerKn1_NotLikeSearch(String delivCustomerKn1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerKn1), xgetCValueDelivCustomerKn1(), "DELIV_CUSTOMER_KN1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     * @param delivCustomerKn1 The value of delivCustomerKn1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn1_PrefixSearch(String delivCustomerKn1) {
        setDelivCustomerKn1_LikeSearch(delivCustomerKn1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     */
    public void setDelivCustomerKn1_IsNull() { regDelivCustomerKn1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     */
    public void setDelivCustomerKn1_IsNullOrEmpty() { regDelivCustomerKn1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     */
    public void setDelivCustomerKn1_IsNotNull() { regDelivCustomerKn1(CK_ISNN, DOBJ); }

    protected void regDelivCustomerKn1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerKn1(), "DELIV_CUSTOMER_KN1"); }
    protected abstract ConditionValue xgetCValueDelivCustomerKn1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     * @param delivCustomerKn2 The value of delivCustomerKn2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn2_Equal(String delivCustomerKn2) {
        doSetDelivCustomerKn2_Equal(fRES(delivCustomerKn2));
    }

    protected void doSetDelivCustomerKn2_Equal(String delivCustomerKn2) {
        regDelivCustomerKn2(CK_EQ, delivCustomerKn2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     * @param delivCustomerKn2 The value of delivCustomerKn2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn2_NotEqual(String delivCustomerKn2) {
        doSetDelivCustomerKn2_NotEqual(fRES(delivCustomerKn2));
    }

    protected void doSetDelivCustomerKn2_NotEqual(String delivCustomerKn2) {
        regDelivCustomerKn2(CK_NES, delivCustomerKn2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     * @param delivCustomerKn2 The value of delivCustomerKn2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn2_GreaterThan(String delivCustomerKn2) {
        regDelivCustomerKn2(CK_GT, fRES(delivCustomerKn2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     * @param delivCustomerKn2 The value of delivCustomerKn2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn2_LessThan(String delivCustomerKn2) {
        regDelivCustomerKn2(CK_LT, fRES(delivCustomerKn2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     * @param delivCustomerKn2 The value of delivCustomerKn2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn2_GreaterEqual(String delivCustomerKn2) {
        regDelivCustomerKn2(CK_GE, fRES(delivCustomerKn2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     * @param delivCustomerKn2 The value of delivCustomerKn2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn2_LessEqual(String delivCustomerKn2) {
        regDelivCustomerKn2(CK_LE, fRES(delivCustomerKn2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     * @param delivCustomerKn2List The collection of delivCustomerKn2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn2_InScope(Collection<String> delivCustomerKn2List) {
        doSetDelivCustomerKn2_InScope(delivCustomerKn2List);
    }

    protected void doSetDelivCustomerKn2_InScope(Collection<String> delivCustomerKn2List) {
        regINS(CK_INS, cTL(delivCustomerKn2List), xgetCValueDelivCustomerKn2(), "DELIV_CUSTOMER_KN2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     * @param delivCustomerKn2List The collection of delivCustomerKn2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn2_NotInScope(Collection<String> delivCustomerKn2List) {
        doSetDelivCustomerKn2_NotInScope(delivCustomerKn2List);
    }

    protected void doSetDelivCustomerKn2_NotInScope(Collection<String> delivCustomerKn2List) {
        regINS(CK_NINS, cTL(delivCustomerKn2List), xgetCValueDelivCustomerKn2(), "DELIV_CUSTOMER_KN2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)} <br>
     * <pre>e.g. setDelivCustomerKn2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerKn2 The value of delivCustomerKn2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerKn2_LikeSearch(String delivCustomerKn2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerKn2), xgetCValueDelivCustomerKn2(), "DELIV_CUSTOMER_KN2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     * @param delivCustomerKn2 The value of delivCustomerKn2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerKn2_NotLikeSearch(String delivCustomerKn2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerKn2), xgetCValueDelivCustomerKn2(), "DELIV_CUSTOMER_KN2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     * @param delivCustomerKn2 The value of delivCustomerKn2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerKn2_PrefixSearch(String delivCustomerKn2) {
        setDelivCustomerKn2_LikeSearch(delivCustomerKn2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     */
    public void setDelivCustomerKn2_IsNull() { regDelivCustomerKn2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     */
    public void setDelivCustomerKn2_IsNullOrEmpty() { regDelivCustomerKn2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     */
    public void setDelivCustomerKn2_IsNotNull() { regDelivCustomerKn2(CK_ISNN, DOBJ); }

    protected void regDelivCustomerKn2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerKn2(), "DELIV_CUSTOMER_KN2"); }
    protected abstract ConditionValue xgetCValueDelivCustomerKn2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     * @param delivTelNo1 The value of delivTelNo1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo1_Equal(String delivTelNo1) {
        doSetDelivTelNo1_Equal(fRES(delivTelNo1));
    }

    protected void doSetDelivTelNo1_Equal(String delivTelNo1) {
        regDelivTelNo1(CK_EQ, delivTelNo1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     * @param delivTelNo1 The value of delivTelNo1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo1_NotEqual(String delivTelNo1) {
        doSetDelivTelNo1_NotEqual(fRES(delivTelNo1));
    }

    protected void doSetDelivTelNo1_NotEqual(String delivTelNo1) {
        regDelivTelNo1(CK_NES, delivTelNo1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     * @param delivTelNo1 The value of delivTelNo1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo1_GreaterThan(String delivTelNo1) {
        regDelivTelNo1(CK_GT, fRES(delivTelNo1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     * @param delivTelNo1 The value of delivTelNo1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo1_LessThan(String delivTelNo1) {
        regDelivTelNo1(CK_LT, fRES(delivTelNo1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     * @param delivTelNo1 The value of delivTelNo1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo1_GreaterEqual(String delivTelNo1) {
        regDelivTelNo1(CK_GE, fRES(delivTelNo1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     * @param delivTelNo1 The value of delivTelNo1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo1_LessEqual(String delivTelNo1) {
        regDelivTelNo1(CK_LE, fRES(delivTelNo1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     * @param delivTelNo1List The collection of delivTelNo1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo1_InScope(Collection<String> delivTelNo1List) {
        doSetDelivTelNo1_InScope(delivTelNo1List);
    }

    protected void doSetDelivTelNo1_InScope(Collection<String> delivTelNo1List) {
        regINS(CK_INS, cTL(delivTelNo1List), xgetCValueDelivTelNo1(), "DELIV_TEL_NO1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     * @param delivTelNo1List The collection of delivTelNo1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo1_NotInScope(Collection<String> delivTelNo1List) {
        doSetDelivTelNo1_NotInScope(delivTelNo1List);
    }

    protected void doSetDelivTelNo1_NotInScope(Collection<String> delivTelNo1List) {
        regINS(CK_NINS, cTL(delivTelNo1List), xgetCValueDelivTelNo1(), "DELIV_TEL_NO1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO1: {varchar(255)} <br>
     * <pre>e.g. setDelivTelNo1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivTelNo1 The value of delivTelNo1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivTelNo1_LikeSearch(String delivTelNo1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivTelNo1), xgetCValueDelivTelNo1(), "DELIV_TEL_NO1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     * @param delivTelNo1 The value of delivTelNo1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivTelNo1_NotLikeSearch(String delivTelNo1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivTelNo1), xgetCValueDelivTelNo1(), "DELIV_TEL_NO1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     * @param delivTelNo1 The value of delivTelNo1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo1_PrefixSearch(String delivTelNo1) {
        setDelivTelNo1_LikeSearch(delivTelNo1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     */
    public void setDelivTelNo1_IsNull() { regDelivTelNo1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     */
    public void setDelivTelNo1_IsNullOrEmpty() { regDelivTelNo1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO1: {varchar(255)}
     */
    public void setDelivTelNo1_IsNotNull() { regDelivTelNo1(CK_ISNN, DOBJ); }

    protected void regDelivTelNo1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTelNo1(), "DELIV_TEL_NO1"); }
    protected abstract ConditionValue xgetCValueDelivTelNo1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     * @param delivTelNo2 The value of delivTelNo2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo2_Equal(String delivTelNo2) {
        doSetDelivTelNo2_Equal(fRES(delivTelNo2));
    }

    protected void doSetDelivTelNo2_Equal(String delivTelNo2) {
        regDelivTelNo2(CK_EQ, delivTelNo2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     * @param delivTelNo2 The value of delivTelNo2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo2_NotEqual(String delivTelNo2) {
        doSetDelivTelNo2_NotEqual(fRES(delivTelNo2));
    }

    protected void doSetDelivTelNo2_NotEqual(String delivTelNo2) {
        regDelivTelNo2(CK_NES, delivTelNo2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     * @param delivTelNo2 The value of delivTelNo2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo2_GreaterThan(String delivTelNo2) {
        regDelivTelNo2(CK_GT, fRES(delivTelNo2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     * @param delivTelNo2 The value of delivTelNo2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo2_LessThan(String delivTelNo2) {
        regDelivTelNo2(CK_LT, fRES(delivTelNo2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     * @param delivTelNo2 The value of delivTelNo2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo2_GreaterEqual(String delivTelNo2) {
        regDelivTelNo2(CK_GE, fRES(delivTelNo2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     * @param delivTelNo2 The value of delivTelNo2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo2_LessEqual(String delivTelNo2) {
        regDelivTelNo2(CK_LE, fRES(delivTelNo2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     * @param delivTelNo2List The collection of delivTelNo2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo2_InScope(Collection<String> delivTelNo2List) {
        doSetDelivTelNo2_InScope(delivTelNo2List);
    }

    protected void doSetDelivTelNo2_InScope(Collection<String> delivTelNo2List) {
        regINS(CK_INS, cTL(delivTelNo2List), xgetCValueDelivTelNo2(), "DELIV_TEL_NO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     * @param delivTelNo2List The collection of delivTelNo2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo2_NotInScope(Collection<String> delivTelNo2List) {
        doSetDelivTelNo2_NotInScope(delivTelNo2List);
    }

    protected void doSetDelivTelNo2_NotInScope(Collection<String> delivTelNo2List) {
        regINS(CK_NINS, cTL(delivTelNo2List), xgetCValueDelivTelNo2(), "DELIV_TEL_NO2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO2: {varchar(255)} <br>
     * <pre>e.g. setDelivTelNo2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivTelNo2 The value of delivTelNo2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivTelNo2_LikeSearch(String delivTelNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivTelNo2), xgetCValueDelivTelNo2(), "DELIV_TEL_NO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     * @param delivTelNo2 The value of delivTelNo2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivTelNo2_NotLikeSearch(String delivTelNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivTelNo2), xgetCValueDelivTelNo2(), "DELIV_TEL_NO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     * @param delivTelNo2 The value of delivTelNo2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo2_PrefixSearch(String delivTelNo2) {
        setDelivTelNo2_LikeSearch(delivTelNo2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     */
    public void setDelivTelNo2_IsNull() { regDelivTelNo2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     */
    public void setDelivTelNo2_IsNullOrEmpty() { regDelivTelNo2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO2: {varchar(255)}
     */
    public void setDelivTelNo2_IsNotNull() { regDelivTelNo2(CK_ISNN, DOBJ); }

    protected void regDelivTelNo2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTelNo2(), "DELIV_TEL_NO2"); }
    protected abstract ConditionValue xgetCValueDelivTelNo2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     * @param delivTelNo3 The value of delivTelNo3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo3_Equal(String delivTelNo3) {
        doSetDelivTelNo3_Equal(fRES(delivTelNo3));
    }

    protected void doSetDelivTelNo3_Equal(String delivTelNo3) {
        regDelivTelNo3(CK_EQ, delivTelNo3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     * @param delivTelNo3 The value of delivTelNo3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo3_NotEqual(String delivTelNo3) {
        doSetDelivTelNo3_NotEqual(fRES(delivTelNo3));
    }

    protected void doSetDelivTelNo3_NotEqual(String delivTelNo3) {
        regDelivTelNo3(CK_NES, delivTelNo3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     * @param delivTelNo3 The value of delivTelNo3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo3_GreaterThan(String delivTelNo3) {
        regDelivTelNo3(CK_GT, fRES(delivTelNo3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     * @param delivTelNo3 The value of delivTelNo3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo3_LessThan(String delivTelNo3) {
        regDelivTelNo3(CK_LT, fRES(delivTelNo3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     * @param delivTelNo3 The value of delivTelNo3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo3_GreaterEqual(String delivTelNo3) {
        regDelivTelNo3(CK_GE, fRES(delivTelNo3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     * @param delivTelNo3 The value of delivTelNo3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo3_LessEqual(String delivTelNo3) {
        regDelivTelNo3(CK_LE, fRES(delivTelNo3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     * @param delivTelNo3List The collection of delivTelNo3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo3_InScope(Collection<String> delivTelNo3List) {
        doSetDelivTelNo3_InScope(delivTelNo3List);
    }

    protected void doSetDelivTelNo3_InScope(Collection<String> delivTelNo3List) {
        regINS(CK_INS, cTL(delivTelNo3List), xgetCValueDelivTelNo3(), "DELIV_TEL_NO3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     * @param delivTelNo3List The collection of delivTelNo3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo3_NotInScope(Collection<String> delivTelNo3List) {
        doSetDelivTelNo3_NotInScope(delivTelNo3List);
    }

    protected void doSetDelivTelNo3_NotInScope(Collection<String> delivTelNo3List) {
        regINS(CK_NINS, cTL(delivTelNo3List), xgetCValueDelivTelNo3(), "DELIV_TEL_NO3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO3: {varchar(255)} <br>
     * <pre>e.g. setDelivTelNo3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivTelNo3 The value of delivTelNo3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivTelNo3_LikeSearch(String delivTelNo3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivTelNo3), xgetCValueDelivTelNo3(), "DELIV_TEL_NO3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     * @param delivTelNo3 The value of delivTelNo3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivTelNo3_NotLikeSearch(String delivTelNo3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivTelNo3), xgetCValueDelivTelNo3(), "DELIV_TEL_NO3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     * @param delivTelNo3 The value of delivTelNo3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo3_PrefixSearch(String delivTelNo3) {
        setDelivTelNo3_LikeSearch(delivTelNo3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     */
    public void setDelivTelNo3_IsNull() { regDelivTelNo3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     */
    public void setDelivTelNo3_IsNullOrEmpty() { regDelivTelNo3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO3: {varchar(255)}
     */
    public void setDelivTelNo3_IsNotNull() { regDelivTelNo3(CK_ISNN, DOBJ); }

    protected void regDelivTelNo3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTelNo3(), "DELIV_TEL_NO3"); }
    protected abstract ConditionValue xgetCValueDelivTelNo3();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
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
     * PRODUCT_NM: {varchar(255)}
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
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterThan(String productNm) {
        regProductNm(CK_GT, fRES(productNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessThan(String productNm) {
        regProductNm(CK_LT, fRES(productNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterEqual(String productNm) {
        regProductNm(CK_GE, fRES(productNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessEqual(String productNm) {
        regProductNm(CK_LE, fRES(productNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
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
     * PRODUCT_NM: {varchar(255)}
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
     * PRODUCT_NM: {varchar(255)} <br>
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
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNm_NotLikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     * @param productNm The value of productNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_PrefixSearch(String productNm) {
        setProductNm_LikeSearch(productNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     */
    public void setProductNm_IsNull() { regProductNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     */
    public void setProductNm_IsNullOrEmpty() { regProductNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {varchar(255)}
     */
    public void setProductNm_IsNotNull() { regProductNm(CK_ISNN, DOBJ); }

    protected void regProductNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductNm(), "PRODUCT_NM"); }
    protected abstract ConditionValue xgetCValueProductNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NO: {varchar(100)}
     * @param productNo The value of productNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNo_Equal(String productNo) {
        doSetProductNo_Equal(fRES(productNo));
    }

    protected void doSetProductNo_Equal(String productNo) {
        regProductNo(CK_EQ, productNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NO: {varchar(100)}
     * @param productNo The value of productNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNo_NotEqual(String productNo) {
        doSetProductNo_NotEqual(fRES(productNo));
    }

    protected void doSetProductNo_NotEqual(String productNo) {
        regProductNo(CK_NES, productNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NO: {varchar(100)}
     * @param productNo The value of productNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNo_GreaterThan(String productNo) {
        regProductNo(CK_GT, fRES(productNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NO: {varchar(100)}
     * @param productNo The value of productNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNo_LessThan(String productNo) {
        regProductNo(CK_LT, fRES(productNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NO: {varchar(100)}
     * @param productNo The value of productNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNo_GreaterEqual(String productNo) {
        regProductNo(CK_GE, fRES(productNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NO: {varchar(100)}
     * @param productNo The value of productNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNo_LessEqual(String productNo) {
        regProductNo(CK_LE, fRES(productNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NO: {varchar(100)}
     * @param productNoList The collection of productNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNo_InScope(Collection<String> productNoList) {
        doSetProductNo_InScope(productNoList);
    }

    protected void doSetProductNo_InScope(Collection<String> productNoList) {
        regINS(CK_INS, cTL(productNoList), xgetCValueProductNo(), "PRODUCT_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NO: {varchar(100)}
     * @param productNoList The collection of productNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNo_NotInScope(Collection<String> productNoList) {
        doSetProductNo_NotInScope(productNoList);
    }

    protected void doSetProductNo_NotInScope(Collection<String> productNoList) {
        regINS(CK_NINS, cTL(productNoList), xgetCValueProductNo(), "PRODUCT_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NO: {varchar(100)} <br>
     * <pre>e.g. setProductNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productNo The value of productNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductNo_LikeSearch(String productNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productNo), xgetCValueProductNo(), "PRODUCT_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NO: {varchar(100)}
     * @param productNo The value of productNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNo_NotLikeSearch(String productNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNo), xgetCValueProductNo(), "PRODUCT_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NO: {varchar(100)}
     * @param productNo The value of productNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNo_PrefixSearch(String productNo) {
        setProductNo_LikeSearch(productNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NO: {varchar(100)}
     */
    public void setProductNo_IsNull() { regProductNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_NO: {varchar(100)}
     */
    public void setProductNo_IsNullOrEmpty() { regProductNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NO: {varchar(100)}
     */
    public void setProductNo_IsNotNull() { regProductNo(CK_ISNN, DOBJ); }

    protected void regProductNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductNo(), "PRODUCT_NO"); }
    protected abstract ConditionValue xgetCValueProductNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_URL: {varchar(100)}
     * @param productUrl The value of productUrl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductUrl_Equal(String productUrl) {
        doSetProductUrl_Equal(fRES(productUrl));
    }

    protected void doSetProductUrl_Equal(String productUrl) {
        regProductUrl(CK_EQ, productUrl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_URL: {varchar(100)}
     * @param productUrl The value of productUrl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductUrl_NotEqual(String productUrl) {
        doSetProductUrl_NotEqual(fRES(productUrl));
    }

    protected void doSetProductUrl_NotEqual(String productUrl) {
        regProductUrl(CK_NES, productUrl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_URL: {varchar(100)}
     * @param productUrl The value of productUrl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductUrl_GreaterThan(String productUrl) {
        regProductUrl(CK_GT, fRES(productUrl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_URL: {varchar(100)}
     * @param productUrl The value of productUrl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductUrl_LessThan(String productUrl) {
        regProductUrl(CK_LT, fRES(productUrl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_URL: {varchar(100)}
     * @param productUrl The value of productUrl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductUrl_GreaterEqual(String productUrl) {
        regProductUrl(CK_GE, fRES(productUrl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_URL: {varchar(100)}
     * @param productUrl The value of productUrl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductUrl_LessEqual(String productUrl) {
        regProductUrl(CK_LE, fRES(productUrl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_URL: {varchar(100)}
     * @param productUrlList The collection of productUrl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductUrl_InScope(Collection<String> productUrlList) {
        doSetProductUrl_InScope(productUrlList);
    }

    protected void doSetProductUrl_InScope(Collection<String> productUrlList) {
        regINS(CK_INS, cTL(productUrlList), xgetCValueProductUrl(), "PRODUCT_URL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_URL: {varchar(100)}
     * @param productUrlList The collection of productUrl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductUrl_NotInScope(Collection<String> productUrlList) {
        doSetProductUrl_NotInScope(productUrlList);
    }

    protected void doSetProductUrl_NotInScope(Collection<String> productUrlList) {
        regINS(CK_NINS, cTL(productUrlList), xgetCValueProductUrl(), "PRODUCT_URL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_URL: {varchar(100)} <br>
     * <pre>e.g. setProductUrl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productUrl The value of productUrl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductUrl_LikeSearch(String productUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productUrl), xgetCValueProductUrl(), "PRODUCT_URL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_URL: {varchar(100)}
     * @param productUrl The value of productUrl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductUrl_NotLikeSearch(String productUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productUrl), xgetCValueProductUrl(), "PRODUCT_URL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_URL: {varchar(100)}
     * @param productUrl The value of productUrl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductUrl_PrefixSearch(String productUrl) {
        setProductUrl_LikeSearch(productUrl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_URL: {varchar(100)}
     */
    public void setProductUrl_IsNull() { regProductUrl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_URL: {varchar(100)}
     */
    public void setProductUrl_IsNullOrEmpty() { regProductUrl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_URL: {varchar(100)}
     */
    public void setProductUrl_IsNotNull() { regProductUrl(CK_ISNN, DOBJ); }

    protected void regProductUrl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductUrl(), "PRODUCT_URL"); }
    protected abstract ConditionValue xgetCValueProductUrl();

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
     * ORDER_NUM: {bigint(19)}
     * @param orderNum The value of orderNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_Equal(Long orderNum) {
        doSetOrderNum_Equal(orderNum);
    }

    protected void doSetOrderNum_Equal(Long orderNum) {
        regOrderNum(CK_EQ, orderNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNum The value of orderNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_NotEqual(Long orderNum) {
        doSetOrderNum_NotEqual(orderNum);
    }

    protected void doSetOrderNum_NotEqual(Long orderNum) {
        regOrderNum(CK_NES, orderNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNum The value of orderNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_GreaterThan(Long orderNum) {
        regOrderNum(CK_GT, orderNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNum The value of orderNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_LessThan(Long orderNum) {
        regOrderNum(CK_LT, orderNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNum The value of orderNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_GreaterEqual(Long orderNum) {
        regOrderNum(CK_GE, orderNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNum The value of orderNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_LessEqual(Long orderNum) {
        regOrderNum(CK_LE, orderNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param minNumber The min number of orderNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of orderNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOrderNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOrderNum(), "ORDER_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNumList The collection of orderNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNum_InScope(Collection<Long> orderNumList) {
        doSetOrderNum_InScope(orderNumList);
    }

    protected void doSetOrderNum_InScope(Collection<Long> orderNumList) {
        regINS(CK_INS, cTL(orderNumList), xgetCValueOrderNum(), "ORDER_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     * @param orderNumList The collection of orderNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNum_NotInScope(Collection<Long> orderNumList) {
        doSetOrderNum_NotInScope(orderNumList);
    }

    protected void doSetOrderNum_NotInScope(Collection<Long> orderNumList) {
        regINS(CK_NINS, cTL(orderNumList), xgetCValueOrderNum(), "ORDER_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     */
    public void setOrderNum_IsNull() { regOrderNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_NUM: {bigint(19)}
     */
    public void setOrderNum_IsNotNull() { regOrderNum(CK_ISNN, DOBJ); }

    protected void regOrderNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderNum(), "ORDER_NUM"); }
    protected abstract ConditionValue xgetCValueOrderNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CARRIAGE: {bigint(19)}
     * @param productCarriage The value of productCarriage as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCarriage_Equal(Long productCarriage) {
        doSetProductCarriage_Equal(productCarriage);
    }

    protected void doSetProductCarriage_Equal(Long productCarriage) {
        regProductCarriage(CK_EQ, productCarriage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CARRIAGE: {bigint(19)}
     * @param productCarriage The value of productCarriage as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCarriage_NotEqual(Long productCarriage) {
        doSetProductCarriage_NotEqual(productCarriage);
    }

    protected void doSetProductCarriage_NotEqual(Long productCarriage) {
        regProductCarriage(CK_NES, productCarriage);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CARRIAGE: {bigint(19)}
     * @param productCarriage The value of productCarriage as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCarriage_GreaterThan(Long productCarriage) {
        regProductCarriage(CK_GT, productCarriage);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CARRIAGE: {bigint(19)}
     * @param productCarriage The value of productCarriage as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCarriage_LessThan(Long productCarriage) {
        regProductCarriage(CK_LT, productCarriage);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CARRIAGE: {bigint(19)}
     * @param productCarriage The value of productCarriage as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCarriage_GreaterEqual(Long productCarriage) {
        regProductCarriage(CK_GE, productCarriage);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CARRIAGE: {bigint(19)}
     * @param productCarriage The value of productCarriage as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCarriage_LessEqual(Long productCarriage) {
        regProductCarriage(CK_LE, productCarriage);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CARRIAGE: {bigint(19)}
     * @param minNumber The min number of productCarriage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productCarriage. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductCarriage_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductCarriage(), "PRODUCT_CARRIAGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CARRIAGE: {bigint(19)}
     * @param productCarriageList The collection of productCarriage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCarriage_InScope(Collection<Long> productCarriageList) {
        doSetProductCarriage_InScope(productCarriageList);
    }

    protected void doSetProductCarriage_InScope(Collection<Long> productCarriageList) {
        regINS(CK_INS, cTL(productCarriageList), xgetCValueProductCarriage(), "PRODUCT_CARRIAGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CARRIAGE: {bigint(19)}
     * @param productCarriageList The collection of productCarriage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCarriage_NotInScope(Collection<Long> productCarriageList) {
        doSetProductCarriage_NotInScope(productCarriageList);
    }

    protected void doSetProductCarriage_NotInScope(Collection<Long> productCarriageList) {
        regINS(CK_NINS, cTL(productCarriageList), xgetCValueProductCarriage(), "PRODUCT_CARRIAGE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CARRIAGE: {bigint(19)}
     */
    public void setProductCarriage_IsNull() { regProductCarriage(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CARRIAGE: {bigint(19)}
     */
    public void setProductCarriage_IsNotNull() { regProductCarriage(CK_ISNN, DOBJ); }

    protected void regProductCarriage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCarriage(), "PRODUCT_CARRIAGE"); }
    protected abstract ConditionValue xgetCValueProductCarriage();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TAX: {bigint(19)}
     * @param productTax The value of productTax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductTax_Equal(Long productTax) {
        doSetProductTax_Equal(productTax);
    }

    protected void doSetProductTax_Equal(Long productTax) {
        regProductTax(CK_EQ, productTax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TAX: {bigint(19)}
     * @param productTax The value of productTax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductTax_NotEqual(Long productTax) {
        doSetProductTax_NotEqual(productTax);
    }

    protected void doSetProductTax_NotEqual(Long productTax) {
        regProductTax(CK_NES, productTax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TAX: {bigint(19)}
     * @param productTax The value of productTax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductTax_GreaterThan(Long productTax) {
        regProductTax(CK_GT, productTax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TAX: {bigint(19)}
     * @param productTax The value of productTax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductTax_LessThan(Long productTax) {
        regProductTax(CK_LT, productTax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TAX: {bigint(19)}
     * @param productTax The value of productTax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductTax_GreaterEqual(Long productTax) {
        regProductTax(CK_GE, productTax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TAX: {bigint(19)}
     * @param productTax The value of productTax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductTax_LessEqual(Long productTax) {
        regProductTax(CK_LE, productTax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_TAX: {bigint(19)}
     * @param minNumber The min number of productTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductTax_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductTax(), "PRODUCT_TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_TAX: {bigint(19)}
     * @param productTaxList The collection of productTax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductTax_InScope(Collection<Long> productTaxList) {
        doSetProductTax_InScope(productTaxList);
    }

    protected void doSetProductTax_InScope(Collection<Long> productTaxList) {
        regINS(CK_INS, cTL(productTaxList), xgetCValueProductTax(), "PRODUCT_TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_TAX: {bigint(19)}
     * @param productTaxList The collection of productTax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductTax_NotInScope(Collection<Long> productTaxList) {
        doSetProductTax_NotInScope(productTaxList);
    }

    protected void doSetProductTax_NotInScope(Collection<Long> productTaxList) {
        regINS(CK_NINS, cTL(productTaxList), xgetCValueProductTax(), "PRODUCT_TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_TAX: {bigint(19)}
     */
    public void setProductTax_IsNull() { regProductTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_TAX: {bigint(19)}
     */
    public void setProductTax_IsNotNull() { regProductTax(CK_ISNN, DOBJ); }

    protected void regProductTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductTax(), "PRODUCT_TAX"); }
    protected abstract ConditionValue xgetCValueProductTax();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_COD: {bigint(19)}
     * @param productCod The value of productCod as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCod_Equal(Long productCod) {
        doSetProductCod_Equal(productCod);
    }

    protected void doSetProductCod_Equal(Long productCod) {
        regProductCod(CK_EQ, productCod);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_COD: {bigint(19)}
     * @param productCod The value of productCod as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCod_NotEqual(Long productCod) {
        doSetProductCod_NotEqual(productCod);
    }

    protected void doSetProductCod_NotEqual(Long productCod) {
        regProductCod(CK_NES, productCod);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_COD: {bigint(19)}
     * @param productCod The value of productCod as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCod_GreaterThan(Long productCod) {
        regProductCod(CK_GT, productCod);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_COD: {bigint(19)}
     * @param productCod The value of productCod as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCod_LessThan(Long productCod) {
        regProductCod(CK_LT, productCod);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_COD: {bigint(19)}
     * @param productCod The value of productCod as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCod_GreaterEqual(Long productCod) {
        regProductCod(CK_GE, productCod);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_COD: {bigint(19)}
     * @param productCod The value of productCod as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCod_LessEqual(Long productCod) {
        regProductCod(CK_LE, productCod);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_COD: {bigint(19)}
     * @param minNumber The min number of productCod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productCod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductCod_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductCod(), "PRODUCT_COD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_COD: {bigint(19)}
     * @param productCodList The collection of productCod as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCod_InScope(Collection<Long> productCodList) {
        doSetProductCod_InScope(productCodList);
    }

    protected void doSetProductCod_InScope(Collection<Long> productCodList) {
        regINS(CK_INS, cTL(productCodList), xgetCValueProductCod(), "PRODUCT_COD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_COD: {bigint(19)}
     * @param productCodList The collection of productCod as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCod_NotInScope(Collection<Long> productCodList) {
        doSetProductCod_NotInScope(productCodList);
    }

    protected void doSetProductCod_NotInScope(Collection<Long> productCodList) {
        regINS(CK_NINS, cTL(productCodList), xgetCValueProductCod(), "PRODUCT_COD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_COD: {bigint(19)}
     */
    public void setProductCod_IsNull() { regProductCod(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_COD: {bigint(19)}
     */
    public void setProductCod_IsNotNull() { regProductCod(CK_ISNN, DOBJ); }

    protected void regProductCod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCod(), "PRODUCT_COD"); }
    protected abstract ConditionValue xgetCValueProductCod();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CHOICE: {varchar(255)}
     * @param itemChoice The value of itemChoice as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemChoice_Equal(String itemChoice) {
        doSetItemChoice_Equal(fRES(itemChoice));
    }

    protected void doSetItemChoice_Equal(String itemChoice) {
        regItemChoice(CK_EQ, itemChoice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CHOICE: {varchar(255)}
     * @param itemChoice The value of itemChoice as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemChoice_NotEqual(String itemChoice) {
        doSetItemChoice_NotEqual(fRES(itemChoice));
    }

    protected void doSetItemChoice_NotEqual(String itemChoice) {
        regItemChoice(CK_NES, itemChoice);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CHOICE: {varchar(255)}
     * @param itemChoice The value of itemChoice as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemChoice_GreaterThan(String itemChoice) {
        regItemChoice(CK_GT, fRES(itemChoice));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CHOICE: {varchar(255)}
     * @param itemChoice The value of itemChoice as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemChoice_LessThan(String itemChoice) {
        regItemChoice(CK_LT, fRES(itemChoice));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CHOICE: {varchar(255)}
     * @param itemChoice The value of itemChoice as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemChoice_GreaterEqual(String itemChoice) {
        regItemChoice(CK_GE, fRES(itemChoice));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CHOICE: {varchar(255)}
     * @param itemChoice The value of itemChoice as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemChoice_LessEqual(String itemChoice) {
        regItemChoice(CK_LE, fRES(itemChoice));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CHOICE: {varchar(255)}
     * @param itemChoiceList The collection of itemChoice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemChoice_InScope(Collection<String> itemChoiceList) {
        doSetItemChoice_InScope(itemChoiceList);
    }

    protected void doSetItemChoice_InScope(Collection<String> itemChoiceList) {
        regINS(CK_INS, cTL(itemChoiceList), xgetCValueItemChoice(), "ITEM_CHOICE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CHOICE: {varchar(255)}
     * @param itemChoiceList The collection of itemChoice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemChoice_NotInScope(Collection<String> itemChoiceList) {
        doSetItemChoice_NotInScope(itemChoiceList);
    }

    protected void doSetItemChoice_NotInScope(Collection<String> itemChoiceList) {
        regINS(CK_NINS, cTL(itemChoiceList), xgetCValueItemChoice(), "ITEM_CHOICE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CHOICE: {varchar(255)} <br>
     * <pre>e.g. setItemChoice_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemChoice The value of itemChoice as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemChoice_LikeSearch(String itemChoice, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemChoice), xgetCValueItemChoice(), "ITEM_CHOICE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CHOICE: {varchar(255)}
     * @param itemChoice The value of itemChoice as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemChoice_NotLikeSearch(String itemChoice, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemChoice), xgetCValueItemChoice(), "ITEM_CHOICE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CHOICE: {varchar(255)}
     * @param itemChoice The value of itemChoice as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemChoice_PrefixSearch(String itemChoice) {
        setItemChoice_LikeSearch(itemChoice, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_CHOICE: {varchar(255)}
     */
    public void setItemChoice_IsNull() { regItemChoice(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_CHOICE: {varchar(255)}
     */
    public void setItemChoice_IsNullOrEmpty() { regItemChoice(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_CHOICE: {varchar(255)}
     */
    public void setItemChoice_IsNotNull() { regItemChoice(CK_ISNN, DOBJ); }

    protected void regItemChoice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemChoice(), "ITEM_CHOICE"); }
    protected abstract ConditionValue xgetCValueItemChoice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_SCALE: {decimal(16, 6)}
     * @param pointScale The value of pointScale as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointScale_Equal(java.math.BigDecimal pointScale) {
        doSetPointScale_Equal(pointScale);
    }

    protected void doSetPointScale_Equal(java.math.BigDecimal pointScale) {
        regPointScale(CK_EQ, pointScale);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_SCALE: {decimal(16, 6)}
     * @param pointScale The value of pointScale as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointScale_NotEqual(java.math.BigDecimal pointScale) {
        doSetPointScale_NotEqual(pointScale);
    }

    protected void doSetPointScale_NotEqual(java.math.BigDecimal pointScale) {
        regPointScale(CK_NES, pointScale);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_SCALE: {decimal(16, 6)}
     * @param pointScale The value of pointScale as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointScale_GreaterThan(java.math.BigDecimal pointScale) {
        regPointScale(CK_GT, pointScale);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_SCALE: {decimal(16, 6)}
     * @param pointScale The value of pointScale as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointScale_LessThan(java.math.BigDecimal pointScale) {
        regPointScale(CK_LT, pointScale);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_SCALE: {decimal(16, 6)}
     * @param pointScale The value of pointScale as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointScale_GreaterEqual(java.math.BigDecimal pointScale) {
        regPointScale(CK_GE, pointScale);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_SCALE: {decimal(16, 6)}
     * @param pointScale The value of pointScale as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointScale_LessEqual(java.math.BigDecimal pointScale) {
        regPointScale(CK_LE, pointScale);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_SCALE: {decimal(16, 6)}
     * @param minNumber The min number of pointScale. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pointScale. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPointScale_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePointScale(), "POINT_SCALE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POINT_SCALE: {decimal(16, 6)}
     * @param pointScaleList The collection of pointScale as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointScale_InScope(Collection<java.math.BigDecimal> pointScaleList) {
        doSetPointScale_InScope(pointScaleList);
    }

    protected void doSetPointScale_InScope(Collection<java.math.BigDecimal> pointScaleList) {
        regINS(CK_INS, cTL(pointScaleList), xgetCValuePointScale(), "POINT_SCALE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POINT_SCALE: {decimal(16, 6)}
     * @param pointScaleList The collection of pointScale as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointScale_NotInScope(Collection<java.math.BigDecimal> pointScaleList) {
        doSetPointScale_NotInScope(pointScaleList);
    }

    protected void doSetPointScale_NotInScope(Collection<java.math.BigDecimal> pointScaleList) {
        regINS(CK_NINS, cTL(pointScaleList), xgetCValuePointScale(), "POINT_SCALE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_SCALE: {decimal(16, 6)}
     */
    public void setPointScale_IsNull() { regPointScale(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_SCALE: {decimal(16, 6)}
     */
    public void setPointScale_IsNotNull() { regPointScale(CK_ISNN, DOBJ); }

    protected void regPointScale(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointScale(), "POINT_SCALE"); }
    protected abstract ConditionValue xgetCValuePointScale();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE: {varchar(100)}
     * @param pointType The value of pointType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointType_Equal(String pointType) {
        doSetPointType_Equal(fRES(pointType));
    }

    protected void doSetPointType_Equal(String pointType) {
        regPointType(CK_EQ, pointType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE: {varchar(100)}
     * @param pointType The value of pointType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointType_NotEqual(String pointType) {
        doSetPointType_NotEqual(fRES(pointType));
    }

    protected void doSetPointType_NotEqual(String pointType) {
        regPointType(CK_NES, pointType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE: {varchar(100)}
     * @param pointType The value of pointType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointType_GreaterThan(String pointType) {
        regPointType(CK_GT, fRES(pointType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE: {varchar(100)}
     * @param pointType The value of pointType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointType_LessThan(String pointType) {
        regPointType(CK_LT, fRES(pointType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE: {varchar(100)}
     * @param pointType The value of pointType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointType_GreaterEqual(String pointType) {
        regPointType(CK_GE, fRES(pointType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT_TYPE: {varchar(100)}
     * @param pointType The value of pointType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointType_LessEqual(String pointType) {
        regPointType(CK_LE, fRES(pointType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POINT_TYPE: {varchar(100)}
     * @param pointTypeList The collection of pointType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointType_InScope(Collection<String> pointTypeList) {
        doSetPointType_InScope(pointTypeList);
    }

    protected void doSetPointType_InScope(Collection<String> pointTypeList) {
        regINS(CK_INS, cTL(pointTypeList), xgetCValuePointType(), "POINT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POINT_TYPE: {varchar(100)}
     * @param pointTypeList The collection of pointType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointType_NotInScope(Collection<String> pointTypeList) {
        doSetPointType_NotInScope(pointTypeList);
    }

    protected void doSetPointType_NotInScope(Collection<String> pointTypeList) {
        regINS(CK_NINS, cTL(pointTypeList), xgetCValuePointType(), "POINT_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_TYPE: {varchar(100)} <br>
     * <pre>e.g. setPointType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pointType The value of pointType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPointType_LikeSearch(String pointType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pointType), xgetCValuePointType(), "POINT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_TYPE: {varchar(100)}
     * @param pointType The value of pointType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPointType_NotLikeSearch(String pointType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pointType), xgetCValuePointType(), "POINT_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT_TYPE: {varchar(100)}
     * @param pointType The value of pointType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointType_PrefixSearch(String pointType) {
        setPointType_LikeSearch(pointType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_TYPE: {varchar(100)}
     */
    public void setPointType_IsNull() { regPointType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * POINT_TYPE: {varchar(100)}
     */
    public void setPointType_IsNullOrEmpty() { regPointType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_TYPE: {varchar(100)}
     */
    public void setPointType_IsNotNull() { regPointType(CK_ISNN, DOBJ); }

    protected void regPointType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointType(), "POINT_TYPE"); }
    protected abstract ConditionValue xgetCValuePointType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECORD_NUMBER: {bigint(19)}
     * @param recordNumber The value of recordNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecordNumber_Equal(Long recordNumber) {
        doSetRecordNumber_Equal(recordNumber);
    }

    protected void doSetRecordNumber_Equal(Long recordNumber) {
        regRecordNumber(CK_EQ, recordNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECORD_NUMBER: {bigint(19)}
     * @param recordNumber The value of recordNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecordNumber_NotEqual(Long recordNumber) {
        doSetRecordNumber_NotEqual(recordNumber);
    }

    protected void doSetRecordNumber_NotEqual(Long recordNumber) {
        regRecordNumber(CK_NES, recordNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECORD_NUMBER: {bigint(19)}
     * @param recordNumber The value of recordNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecordNumber_GreaterThan(Long recordNumber) {
        regRecordNumber(CK_GT, recordNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECORD_NUMBER: {bigint(19)}
     * @param recordNumber The value of recordNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecordNumber_LessThan(Long recordNumber) {
        regRecordNumber(CK_LT, recordNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECORD_NUMBER: {bigint(19)}
     * @param recordNumber The value of recordNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecordNumber_GreaterEqual(Long recordNumber) {
        regRecordNumber(CK_GE, recordNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECORD_NUMBER: {bigint(19)}
     * @param recordNumber The value of recordNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecordNumber_LessEqual(Long recordNumber) {
        regRecordNumber(CK_LE, recordNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECORD_NUMBER: {bigint(19)}
     * @param minNumber The min number of recordNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of recordNumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRecordNumber_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRecordNumber(), "RECORD_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECORD_NUMBER: {bigint(19)}
     * @param recordNumberList The collection of recordNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordNumber_InScope(Collection<Long> recordNumberList) {
        doSetRecordNumber_InScope(recordNumberList);
    }

    protected void doSetRecordNumber_InScope(Collection<Long> recordNumberList) {
        regINS(CK_INS, cTL(recordNumberList), xgetCValueRecordNumber(), "RECORD_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECORD_NUMBER: {bigint(19)}
     * @param recordNumberList The collection of recordNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecordNumber_NotInScope(Collection<Long> recordNumberList) {
        doSetRecordNumber_NotInScope(recordNumberList);
    }

    protected void doSetRecordNumber_NotInScope(Collection<Long> recordNumberList) {
        regINS(CK_NINS, cTL(recordNumberList), xgetCValueRecordNumber(), "RECORD_NUMBER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECORD_NUMBER: {bigint(19)}
     */
    public void setRecordNumber_IsNull() { regRecordNumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECORD_NUMBER: {bigint(19)}
     */
    public void setRecordNumber_IsNotNull() { regRecordNumber(CK_ISNN, DOBJ); }

    protected void regRecordNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRecordNumber(), "RECORD_NUMBER"); }
    protected abstract ConditionValue xgetCValueRecordNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_INFO: {varchar(100)}
     * @param deliveryInfo The value of deliveryInfo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInfo_Equal(String deliveryInfo) {
        doSetDeliveryInfo_Equal(fRES(deliveryInfo));
    }

    protected void doSetDeliveryInfo_Equal(String deliveryInfo) {
        regDeliveryInfo(CK_EQ, deliveryInfo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_INFO: {varchar(100)}
     * @param deliveryInfo The value of deliveryInfo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInfo_NotEqual(String deliveryInfo) {
        doSetDeliveryInfo_NotEqual(fRES(deliveryInfo));
    }

    protected void doSetDeliveryInfo_NotEqual(String deliveryInfo) {
        regDeliveryInfo(CK_NES, deliveryInfo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_INFO: {varchar(100)}
     * @param deliveryInfo The value of deliveryInfo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInfo_GreaterThan(String deliveryInfo) {
        regDeliveryInfo(CK_GT, fRES(deliveryInfo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_INFO: {varchar(100)}
     * @param deliveryInfo The value of deliveryInfo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInfo_LessThan(String deliveryInfo) {
        regDeliveryInfo(CK_LT, fRES(deliveryInfo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_INFO: {varchar(100)}
     * @param deliveryInfo The value of deliveryInfo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInfo_GreaterEqual(String deliveryInfo) {
        regDeliveryInfo(CK_GE, fRES(deliveryInfo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_INFO: {varchar(100)}
     * @param deliveryInfo The value of deliveryInfo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInfo_LessEqual(String deliveryInfo) {
        regDeliveryInfo(CK_LE, fRES(deliveryInfo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_INFO: {varchar(100)}
     * @param deliveryInfoList The collection of deliveryInfo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInfo_InScope(Collection<String> deliveryInfoList) {
        doSetDeliveryInfo_InScope(deliveryInfoList);
    }

    protected void doSetDeliveryInfo_InScope(Collection<String> deliveryInfoList) {
        regINS(CK_INS, cTL(deliveryInfoList), xgetCValueDeliveryInfo(), "DELIVERY_INFO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_INFO: {varchar(100)}
     * @param deliveryInfoList The collection of deliveryInfo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInfo_NotInScope(Collection<String> deliveryInfoList) {
        doSetDeliveryInfo_NotInScope(deliveryInfoList);
    }

    protected void doSetDeliveryInfo_NotInScope(Collection<String> deliveryInfoList) {
        regINS(CK_NINS, cTL(deliveryInfoList), xgetCValueDeliveryInfo(), "DELIVERY_INFO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_INFO: {varchar(100)} <br>
     * <pre>e.g. setDeliveryInfo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryInfo The value of deliveryInfo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryInfo_LikeSearch(String deliveryInfo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryInfo), xgetCValueDeliveryInfo(), "DELIVERY_INFO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_INFO: {varchar(100)}
     * @param deliveryInfo The value of deliveryInfo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryInfo_NotLikeSearch(String deliveryInfo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryInfo), xgetCValueDeliveryInfo(), "DELIVERY_INFO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_INFO: {varchar(100)}
     * @param deliveryInfo The value of deliveryInfo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryInfo_PrefixSearch(String deliveryInfo) {
        setDeliveryInfo_LikeSearch(deliveryInfo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_INFO: {varchar(100)}
     */
    public void setDeliveryInfo_IsNull() { regDeliveryInfo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_INFO: {varchar(100)}
     */
    public void setDeliveryInfo_IsNullOrEmpty() { regDeliveryInfo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_INFO: {varchar(100)}
     */
    public void setDeliveryInfo_IsNotNull() { regDeliveryInfo(CK_ISNN, DOBJ); }

    protected void regDeliveryInfo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryInfo(), "DELIVERY_INFO"); }
    protected abstract ConditionValue xgetCValueDeliveryInfo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(100)}
     * @param stockType The value of stockType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_Equal(String stockType) {
        doSetStockType_Equal(fRES(stockType));
    }

    protected void doSetStockType_Equal(String stockType) {
        regStockType(CK_EQ, stockType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(100)}
     * @param stockType The value of stockType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_NotEqual(String stockType) {
        doSetStockType_NotEqual(fRES(stockType));
    }

    protected void doSetStockType_NotEqual(String stockType) {
        regStockType(CK_NES, stockType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(100)}
     * @param stockType The value of stockType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_GreaterThan(String stockType) {
        regStockType(CK_GT, fRES(stockType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(100)}
     * @param stockType The value of stockType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_LessThan(String stockType) {
        regStockType(CK_LT, fRES(stockType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(100)}
     * @param stockType The value of stockType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_GreaterEqual(String stockType) {
        regStockType(CK_GE, fRES(stockType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(100)}
     * @param stockType The value of stockType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_LessEqual(String stockType) {
        regStockType(CK_LE, fRES(stockType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE: {varchar(100)}
     * @param stockTypeList The collection of stockType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_InScope(Collection<String> stockTypeList) {
        doSetStockType_InScope(stockTypeList);
    }

    protected void doSetStockType_InScope(Collection<String> stockTypeList) {
        regINS(CK_INS, cTL(stockTypeList), xgetCValueStockType(), "STOCK_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE: {varchar(100)}
     * @param stockTypeList The collection of stockType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_NotInScope(Collection<String> stockTypeList) {
        doSetStockType_NotInScope(stockTypeList);
    }

    protected void doSetStockType_NotInScope(Collection<String> stockTypeList) {
        regINS(CK_NINS, cTL(stockTypeList), xgetCValueStockType(), "STOCK_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE: {varchar(100)} <br>
     * <pre>e.g. setStockType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockType The value of stockType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockType_LikeSearch(String stockType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockType), xgetCValueStockType(), "STOCK_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE: {varchar(100)}
     * @param stockType The value of stockType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockType_NotLikeSearch(String stockType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockType), xgetCValueStockType(), "STOCK_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE: {varchar(100)}
     * @param stockType The value of stockType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_PrefixSearch(String stockType) {
        setStockType_LikeSearch(stockType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(100)}
     */
    public void setStockType_IsNull() { regStockType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(100)}
     */
    public void setStockType_IsNullOrEmpty() { regStockType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(100)}
     */
    public void setStockType_IsNotNull() { regStockType(CK_ISNN, DOBJ); }

    protected void regStockType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockType(), "STOCK_TYPE"); }
    protected abstract ConditionValue xgetCValueStockType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     * @param wrappingTypeP The value of wrappingTypeP as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeP_Equal(String wrappingTypeP) {
        doSetWrappingTypeP_Equal(fRES(wrappingTypeP));
    }

    protected void doSetWrappingTypeP_Equal(String wrappingTypeP) {
        regWrappingTypeP(CK_EQ, wrappingTypeP);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     * @param wrappingTypeP The value of wrappingTypeP as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeP_NotEqual(String wrappingTypeP) {
        doSetWrappingTypeP_NotEqual(fRES(wrappingTypeP));
    }

    protected void doSetWrappingTypeP_NotEqual(String wrappingTypeP) {
        regWrappingTypeP(CK_NES, wrappingTypeP);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     * @param wrappingTypeP The value of wrappingTypeP as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeP_GreaterThan(String wrappingTypeP) {
        regWrappingTypeP(CK_GT, fRES(wrappingTypeP));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     * @param wrappingTypeP The value of wrappingTypeP as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeP_LessThan(String wrappingTypeP) {
        regWrappingTypeP(CK_LT, fRES(wrappingTypeP));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     * @param wrappingTypeP The value of wrappingTypeP as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeP_GreaterEqual(String wrappingTypeP) {
        regWrappingTypeP(CK_GE, fRES(wrappingTypeP));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     * @param wrappingTypeP The value of wrappingTypeP as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeP_LessEqual(String wrappingTypeP) {
        regWrappingTypeP(CK_LE, fRES(wrappingTypeP));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     * @param wrappingTypePList The collection of wrappingTypeP as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeP_InScope(Collection<String> wrappingTypePList) {
        doSetWrappingTypeP_InScope(wrappingTypePList);
    }

    protected void doSetWrappingTypeP_InScope(Collection<String> wrappingTypePList) {
        regINS(CK_INS, cTL(wrappingTypePList), xgetCValueWrappingTypeP(), "WRAPPING_TYPE_P");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     * @param wrappingTypePList The collection of wrappingTypeP as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeP_NotInScope(Collection<String> wrappingTypePList) {
        doSetWrappingTypeP_NotInScope(wrappingTypePList);
    }

    protected void doSetWrappingTypeP_NotInScope(Collection<String> wrappingTypePList) {
        regINS(CK_NINS, cTL(wrappingTypePList), xgetCValueWrappingTypeP(), "WRAPPING_TYPE_P");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_TYPE_P: {varchar(255)} <br>
     * <pre>e.g. setWrappingTypeP_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wrappingTypeP The value of wrappingTypeP as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWrappingTypeP_LikeSearch(String wrappingTypeP, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wrappingTypeP), xgetCValueWrappingTypeP(), "WRAPPING_TYPE_P", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     * @param wrappingTypeP The value of wrappingTypeP as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWrappingTypeP_NotLikeSearch(String wrappingTypeP, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wrappingTypeP), xgetCValueWrappingTypeP(), "WRAPPING_TYPE_P", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     * @param wrappingTypeP The value of wrappingTypeP as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeP_PrefixSearch(String wrappingTypeP) {
        setWrappingTypeP_LikeSearch(wrappingTypeP, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     */
    public void setWrappingTypeP_IsNull() { regWrappingTypeP(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     */
    public void setWrappingTypeP_IsNullOrEmpty() { regWrappingTypeP(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_P: {varchar(255)}
     */
    public void setWrappingTypeP_IsNotNull() { regWrappingTypeP(CK_ISNN, DOBJ); }

    protected void regWrappingTypeP(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWrappingTypeP(), "WRAPPING_TYPE_P"); }
    protected abstract ConditionValue xgetCValueWrappingTypeP();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     * @param wrappingTypeR The value of wrappingTypeR as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeR_Equal(String wrappingTypeR) {
        doSetWrappingTypeR_Equal(fRES(wrappingTypeR));
    }

    protected void doSetWrappingTypeR_Equal(String wrappingTypeR) {
        regWrappingTypeR(CK_EQ, wrappingTypeR);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     * @param wrappingTypeR The value of wrappingTypeR as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeR_NotEqual(String wrappingTypeR) {
        doSetWrappingTypeR_NotEqual(fRES(wrappingTypeR));
    }

    protected void doSetWrappingTypeR_NotEqual(String wrappingTypeR) {
        regWrappingTypeR(CK_NES, wrappingTypeR);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     * @param wrappingTypeR The value of wrappingTypeR as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeR_GreaterThan(String wrappingTypeR) {
        regWrappingTypeR(CK_GT, fRES(wrappingTypeR));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     * @param wrappingTypeR The value of wrappingTypeR as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeR_LessThan(String wrappingTypeR) {
        regWrappingTypeR(CK_LT, fRES(wrappingTypeR));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     * @param wrappingTypeR The value of wrappingTypeR as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeR_GreaterEqual(String wrappingTypeR) {
        regWrappingTypeR(CK_GE, fRES(wrappingTypeR));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     * @param wrappingTypeR The value of wrappingTypeR as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeR_LessEqual(String wrappingTypeR) {
        regWrappingTypeR(CK_LE, fRES(wrappingTypeR));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     * @param wrappingTypeRList The collection of wrappingTypeR as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeR_InScope(Collection<String> wrappingTypeRList) {
        doSetWrappingTypeR_InScope(wrappingTypeRList);
    }

    protected void doSetWrappingTypeR_InScope(Collection<String> wrappingTypeRList) {
        regINS(CK_INS, cTL(wrappingTypeRList), xgetCValueWrappingTypeR(), "WRAPPING_TYPE_R");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     * @param wrappingTypeRList The collection of wrappingTypeR as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeR_NotInScope(Collection<String> wrappingTypeRList) {
        doSetWrappingTypeR_NotInScope(wrappingTypeRList);
    }

    protected void doSetWrappingTypeR_NotInScope(Collection<String> wrappingTypeRList) {
        regINS(CK_NINS, cTL(wrappingTypeRList), xgetCValueWrappingTypeR(), "WRAPPING_TYPE_R");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_TYPE_R: {varchar(255)} <br>
     * <pre>e.g. setWrappingTypeR_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wrappingTypeR The value of wrappingTypeR as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWrappingTypeR_LikeSearch(String wrappingTypeR, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wrappingTypeR), xgetCValueWrappingTypeR(), "WRAPPING_TYPE_R", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     * @param wrappingTypeR The value of wrappingTypeR as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWrappingTypeR_NotLikeSearch(String wrappingTypeR, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wrappingTypeR), xgetCValueWrappingTypeR(), "WRAPPING_TYPE_R", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     * @param wrappingTypeR The value of wrappingTypeR as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWrappingTypeR_PrefixSearch(String wrappingTypeR) {
        setWrappingTypeR_LikeSearch(wrappingTypeR, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     */
    public void setWrappingTypeR_IsNull() { regWrappingTypeR(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     */
    public void setWrappingTypeR_IsNullOrEmpty() { regWrappingTypeR(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WRAPPING_TYPE_R: {varchar(255)}
     */
    public void setWrappingTypeR_IsNotNull() { regWrappingTypeR(CK_ISNN, DOBJ); }

    protected void regWrappingTypeR(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWrappingTypeR(), "WRAPPING_TYPE_R"); }
    protected abstract ConditionValue xgetCValueWrappingTypeR();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOMORROW_FLG: {varchar(30)}
     * @param tomorrowFlg The value of tomorrowFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTomorrowFlg_Equal(String tomorrowFlg) {
        doSetTomorrowFlg_Equal(fRES(tomorrowFlg));
    }

    protected void doSetTomorrowFlg_Equal(String tomorrowFlg) {
        regTomorrowFlg(CK_EQ, tomorrowFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOMORROW_FLG: {varchar(30)}
     * @param tomorrowFlg The value of tomorrowFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTomorrowFlg_NotEqual(String tomorrowFlg) {
        doSetTomorrowFlg_NotEqual(fRES(tomorrowFlg));
    }

    protected void doSetTomorrowFlg_NotEqual(String tomorrowFlg) {
        regTomorrowFlg(CK_NES, tomorrowFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOMORROW_FLG: {varchar(30)}
     * @param tomorrowFlg The value of tomorrowFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTomorrowFlg_GreaterThan(String tomorrowFlg) {
        regTomorrowFlg(CK_GT, fRES(tomorrowFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOMORROW_FLG: {varchar(30)}
     * @param tomorrowFlg The value of tomorrowFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTomorrowFlg_LessThan(String tomorrowFlg) {
        regTomorrowFlg(CK_LT, fRES(tomorrowFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOMORROW_FLG: {varchar(30)}
     * @param tomorrowFlg The value of tomorrowFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTomorrowFlg_GreaterEqual(String tomorrowFlg) {
        regTomorrowFlg(CK_GE, fRES(tomorrowFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOMORROW_FLG: {varchar(30)}
     * @param tomorrowFlg The value of tomorrowFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTomorrowFlg_LessEqual(String tomorrowFlg) {
        regTomorrowFlg(CK_LE, fRES(tomorrowFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOMORROW_FLG: {varchar(30)}
     * @param tomorrowFlgList The collection of tomorrowFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTomorrowFlg_InScope(Collection<String> tomorrowFlgList) {
        doSetTomorrowFlg_InScope(tomorrowFlgList);
    }

    protected void doSetTomorrowFlg_InScope(Collection<String> tomorrowFlgList) {
        regINS(CK_INS, cTL(tomorrowFlgList), xgetCValueTomorrowFlg(), "TOMORROW_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOMORROW_FLG: {varchar(30)}
     * @param tomorrowFlgList The collection of tomorrowFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTomorrowFlg_NotInScope(Collection<String> tomorrowFlgList) {
        doSetTomorrowFlg_NotInScope(tomorrowFlgList);
    }

    protected void doSetTomorrowFlg_NotInScope(Collection<String> tomorrowFlgList) {
        regINS(CK_NINS, cTL(tomorrowFlgList), xgetCValueTomorrowFlg(), "TOMORROW_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOMORROW_FLG: {varchar(30)} <br>
     * <pre>e.g. setTomorrowFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tomorrowFlg The value of tomorrowFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTomorrowFlg_LikeSearch(String tomorrowFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tomorrowFlg), xgetCValueTomorrowFlg(), "TOMORROW_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOMORROW_FLG: {varchar(30)}
     * @param tomorrowFlg The value of tomorrowFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTomorrowFlg_NotLikeSearch(String tomorrowFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tomorrowFlg), xgetCValueTomorrowFlg(), "TOMORROW_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOMORROW_FLG: {varchar(30)}
     * @param tomorrowFlg The value of tomorrowFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTomorrowFlg_PrefixSearch(String tomorrowFlg) {
        setTomorrowFlg_LikeSearch(tomorrowFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOMORROW_FLG: {varchar(30)}
     */
    public void setTomorrowFlg_IsNull() { regTomorrowFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TOMORROW_FLG: {varchar(30)}
     */
    public void setTomorrowFlg_IsNullOrEmpty() { regTomorrowFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOMORROW_FLG: {varchar(30)}
     */
    public void setTomorrowFlg_IsNotNull() { regTomorrowFlg(CK_ISNN, DOBJ); }

    protected void regTomorrowFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTomorrowFlg(), "TOMORROW_FLG"); }
    protected abstract ConditionValue xgetCValueTomorrowFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_USE: {bigint(19)}
     * @param couponUse The value of couponUse as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponUse_Equal(Long couponUse) {
        doSetCouponUse_Equal(couponUse);
    }

    protected void doSetCouponUse_Equal(Long couponUse) {
        regCouponUse(CK_EQ, couponUse);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_USE: {bigint(19)}
     * @param couponUse The value of couponUse as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponUse_NotEqual(Long couponUse) {
        doSetCouponUse_NotEqual(couponUse);
    }

    protected void doSetCouponUse_NotEqual(Long couponUse) {
        regCouponUse(CK_NES, couponUse);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_USE: {bigint(19)}
     * @param couponUse The value of couponUse as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponUse_GreaterThan(Long couponUse) {
        regCouponUse(CK_GT, couponUse);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_USE: {bigint(19)}
     * @param couponUse The value of couponUse as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponUse_LessThan(Long couponUse) {
        regCouponUse(CK_LT, couponUse);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_USE: {bigint(19)}
     * @param couponUse The value of couponUse as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponUse_GreaterEqual(Long couponUse) {
        regCouponUse(CK_GE, couponUse);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_USE: {bigint(19)}
     * @param couponUse The value of couponUse as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCouponUse_LessEqual(Long couponUse) {
        regCouponUse(CK_LE, couponUse);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COUPON_USE: {bigint(19)}
     * @param minNumber The min number of couponUse. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of couponUse. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCouponUse_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCouponUse(), "COUPON_USE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUPON_USE: {bigint(19)}
     * @param couponUseList The collection of couponUse as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponUse_InScope(Collection<Long> couponUseList) {
        doSetCouponUse_InScope(couponUseList);
    }

    protected void doSetCouponUse_InScope(Collection<Long> couponUseList) {
        regINS(CK_INS, cTL(couponUseList), xgetCValueCouponUse(), "COUPON_USE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUPON_USE: {bigint(19)}
     * @param couponUseList The collection of couponUse as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCouponUse_NotInScope(Collection<Long> couponUseList) {
        doSetCouponUse_NotInScope(couponUseList);
    }

    protected void doSetCouponUse_NotInScope(Collection<Long> couponUseList) {
        regINS(CK_NINS, cTL(couponUseList), xgetCValueCouponUse(), "COUPON_USE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COUPON_USE: {bigint(19)}
     */
    public void setCouponUse_IsNull() { regCouponUse(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COUPON_USE: {bigint(19)}
     */
    public void setCouponUse_IsNotNull() { regCouponUse(CK_ISNN, DOBJ); }

    protected void regCouponUse(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCouponUse(), "COUPON_USE"); }
    protected abstract ConditionValue xgetCValueCouponUse();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_COUPON_USE: {bigint(19)}
     * @param shopCouponUse The value of shopCouponUse as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopCouponUse_Equal(Long shopCouponUse) {
        doSetShopCouponUse_Equal(shopCouponUse);
    }

    protected void doSetShopCouponUse_Equal(Long shopCouponUse) {
        regShopCouponUse(CK_EQ, shopCouponUse);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_COUPON_USE: {bigint(19)}
     * @param shopCouponUse The value of shopCouponUse as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopCouponUse_NotEqual(Long shopCouponUse) {
        doSetShopCouponUse_NotEqual(shopCouponUse);
    }

    protected void doSetShopCouponUse_NotEqual(Long shopCouponUse) {
        regShopCouponUse(CK_NES, shopCouponUse);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_COUPON_USE: {bigint(19)}
     * @param shopCouponUse The value of shopCouponUse as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopCouponUse_GreaterThan(Long shopCouponUse) {
        regShopCouponUse(CK_GT, shopCouponUse);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_COUPON_USE: {bigint(19)}
     * @param shopCouponUse The value of shopCouponUse as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopCouponUse_LessThan(Long shopCouponUse) {
        regShopCouponUse(CK_LT, shopCouponUse);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_COUPON_USE: {bigint(19)}
     * @param shopCouponUse The value of shopCouponUse as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopCouponUse_GreaterEqual(Long shopCouponUse) {
        regShopCouponUse(CK_GE, shopCouponUse);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_COUPON_USE: {bigint(19)}
     * @param shopCouponUse The value of shopCouponUse as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopCouponUse_LessEqual(Long shopCouponUse) {
        regShopCouponUse(CK_LE, shopCouponUse);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_COUPON_USE: {bigint(19)}
     * @param minNumber The min number of shopCouponUse. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shopCouponUse. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShopCouponUse_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShopCouponUse(), "SHOP_COUPON_USE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHOP_COUPON_USE: {bigint(19)}
     * @param shopCouponUseList The collection of shopCouponUse as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopCouponUse_InScope(Collection<Long> shopCouponUseList) {
        doSetShopCouponUse_InScope(shopCouponUseList);
    }

    protected void doSetShopCouponUse_InScope(Collection<Long> shopCouponUseList) {
        regINS(CK_INS, cTL(shopCouponUseList), xgetCValueShopCouponUse(), "SHOP_COUPON_USE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHOP_COUPON_USE: {bigint(19)}
     * @param shopCouponUseList The collection of shopCouponUse as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopCouponUse_NotInScope(Collection<Long> shopCouponUseList) {
        doSetShopCouponUse_NotInScope(shopCouponUseList);
    }

    protected void doSetShopCouponUse_NotInScope(Collection<Long> shopCouponUseList) {
        regINS(CK_NINS, cTL(shopCouponUseList), xgetCValueShopCouponUse(), "SHOP_COUPON_USE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHOP_COUPON_USE: {bigint(19)}
     */
    public void setShopCouponUse_IsNull() { regShopCouponUse(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHOP_COUPON_USE: {bigint(19)}
     */
    public void setShopCouponUse_IsNotNull() { regShopCouponUse(CK_ISNN, DOBJ); }

    protected void regShopCouponUse(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShopCouponUse(), "SHOP_COUPON_USE"); }
    protected abstract ConditionValue xgetCValueShopCouponUse();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_COUPON_USE: {bigint(19)}
     * @param rakutenCouponUse The value of rakutenCouponUse as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRakutenCouponUse_Equal(Long rakutenCouponUse) {
        doSetRakutenCouponUse_Equal(rakutenCouponUse);
    }

    protected void doSetRakutenCouponUse_Equal(Long rakutenCouponUse) {
        regRakutenCouponUse(CK_EQ, rakutenCouponUse);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_COUPON_USE: {bigint(19)}
     * @param rakutenCouponUse The value of rakutenCouponUse as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRakutenCouponUse_NotEqual(Long rakutenCouponUse) {
        doSetRakutenCouponUse_NotEqual(rakutenCouponUse);
    }

    protected void doSetRakutenCouponUse_NotEqual(Long rakutenCouponUse) {
        regRakutenCouponUse(CK_NES, rakutenCouponUse);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_COUPON_USE: {bigint(19)}
     * @param rakutenCouponUse The value of rakutenCouponUse as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRakutenCouponUse_GreaterThan(Long rakutenCouponUse) {
        regRakutenCouponUse(CK_GT, rakutenCouponUse);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_COUPON_USE: {bigint(19)}
     * @param rakutenCouponUse The value of rakutenCouponUse as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRakutenCouponUse_LessThan(Long rakutenCouponUse) {
        regRakutenCouponUse(CK_LT, rakutenCouponUse);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_COUPON_USE: {bigint(19)}
     * @param rakutenCouponUse The value of rakutenCouponUse as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRakutenCouponUse_GreaterEqual(Long rakutenCouponUse) {
        regRakutenCouponUse(CK_GE, rakutenCouponUse);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_COUPON_USE: {bigint(19)}
     * @param rakutenCouponUse The value of rakutenCouponUse as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRakutenCouponUse_LessEqual(Long rakutenCouponUse) {
        regRakutenCouponUse(CK_LE, rakutenCouponUse);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RAKUTEN_COUPON_USE: {bigint(19)}
     * @param minNumber The min number of rakutenCouponUse. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rakutenCouponUse. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRakutenCouponUse_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRakutenCouponUse(), "RAKUTEN_COUPON_USE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RAKUTEN_COUPON_USE: {bigint(19)}
     * @param rakutenCouponUseList The collection of rakutenCouponUse as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRakutenCouponUse_InScope(Collection<Long> rakutenCouponUseList) {
        doSetRakutenCouponUse_InScope(rakutenCouponUseList);
    }

    protected void doSetRakutenCouponUse_InScope(Collection<Long> rakutenCouponUseList) {
        regINS(CK_INS, cTL(rakutenCouponUseList), xgetCValueRakutenCouponUse(), "RAKUTEN_COUPON_USE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RAKUTEN_COUPON_USE: {bigint(19)}
     * @param rakutenCouponUseList The collection of rakutenCouponUse as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRakutenCouponUse_NotInScope(Collection<Long> rakutenCouponUseList) {
        doSetRakutenCouponUse_NotInScope(rakutenCouponUseList);
    }

    protected void doSetRakutenCouponUse_NotInScope(Collection<Long> rakutenCouponUseList) {
        regINS(CK_NINS, cTL(rakutenCouponUseList), xgetCValueRakutenCouponUse(), "RAKUTEN_COUPON_USE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RAKUTEN_COUPON_USE: {bigint(19)}
     */
    public void setRakutenCouponUse_IsNull() { regRakutenCouponUse(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RAKUTEN_COUPON_USE: {bigint(19)}
     */
    public void setRakutenCouponUse_IsNotNull() { regRakutenCouponUse(CK_ISNN, DOBJ); }

    protected void regRakutenCouponUse(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRakutenCouponUse(), "RAKUTEN_COUPON_USE"); }
    protected abstract ConditionValue xgetCValueRakutenCouponUse();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_COUPON_USE: {bigint(19)}
     * @param combineCouponUse The value of combineCouponUse as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCouponUse_Equal(Long combineCouponUse) {
        doSetCombineCouponUse_Equal(combineCouponUse);
    }

    protected void doSetCombineCouponUse_Equal(Long combineCouponUse) {
        regCombineCouponUse(CK_EQ, combineCouponUse);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_COUPON_USE: {bigint(19)}
     * @param combineCouponUse The value of combineCouponUse as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCouponUse_NotEqual(Long combineCouponUse) {
        doSetCombineCouponUse_NotEqual(combineCouponUse);
    }

    protected void doSetCombineCouponUse_NotEqual(Long combineCouponUse) {
        regCombineCouponUse(CK_NES, combineCouponUse);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_COUPON_USE: {bigint(19)}
     * @param combineCouponUse The value of combineCouponUse as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCouponUse_GreaterThan(Long combineCouponUse) {
        regCombineCouponUse(CK_GT, combineCouponUse);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_COUPON_USE: {bigint(19)}
     * @param combineCouponUse The value of combineCouponUse as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCouponUse_LessThan(Long combineCouponUse) {
        regCombineCouponUse(CK_LT, combineCouponUse);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_COUPON_USE: {bigint(19)}
     * @param combineCouponUse The value of combineCouponUse as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCouponUse_GreaterEqual(Long combineCouponUse) {
        regCombineCouponUse(CK_GE, combineCouponUse);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_COUPON_USE: {bigint(19)}
     * @param combineCouponUse The value of combineCouponUse as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCombineCouponUse_LessEqual(Long combineCouponUse) {
        regCombineCouponUse(CK_LE, combineCouponUse);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMBINE_COUPON_USE: {bigint(19)}
     * @param minNumber The min number of combineCouponUse. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of combineCouponUse. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCombineCouponUse_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCombineCouponUse(), "COMBINE_COUPON_USE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_COUPON_USE: {bigint(19)}
     * @param combineCouponUseList The collection of combineCouponUse as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineCouponUse_InScope(Collection<Long> combineCouponUseList) {
        doSetCombineCouponUse_InScope(combineCouponUseList);
    }

    protected void doSetCombineCouponUse_InScope(Collection<Long> combineCouponUseList) {
        regINS(CK_INS, cTL(combineCouponUseList), xgetCValueCombineCouponUse(), "COMBINE_COUPON_USE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMBINE_COUPON_USE: {bigint(19)}
     * @param combineCouponUseList The collection of combineCouponUse as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCombineCouponUse_NotInScope(Collection<Long> combineCouponUseList) {
        doSetCombineCouponUse_NotInScope(combineCouponUseList);
    }

    protected void doSetCombineCouponUse_NotInScope(Collection<Long> combineCouponUseList) {
        regINS(CK_NINS, cTL(combineCouponUseList), xgetCValueCombineCouponUse(), "COMBINE_COUPON_USE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMBINE_COUPON_USE: {bigint(19)}
     */
    public void setCombineCouponUse_IsNull() { regCombineCouponUse(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMBINE_COUPON_USE: {bigint(19)}
     */
    public void setCombineCouponUse_IsNotNull() { regCombineCouponUse(CK_ISNN, DOBJ); }

    protected void regCombineCouponUse(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCombineCouponUse(), "COMBINE_COUPON_USE"); }
    protected abstract ConditionValue xgetCValueCombineCouponUse();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_Equal(String delivCompany) {
        doSetDelivCompany_Equal(fRES(delivCompany));
    }

    protected void doSetDelivCompany_Equal(String delivCompany) {
        regDelivCompany(CK_EQ, delivCompany);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_NotEqual(String delivCompany) {
        doSetDelivCompany_NotEqual(fRES(delivCompany));
    }

    protected void doSetDelivCompany_NotEqual(String delivCompany) {
        regDelivCompany(CK_NES, delivCompany);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_GreaterThan(String delivCompany) {
        regDelivCompany(CK_GT, fRES(delivCompany));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_LessThan(String delivCompany) {
        regDelivCompany(CK_LT, fRES(delivCompany));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_GreaterEqual(String delivCompany) {
        regDelivCompany(CK_GE, fRES(delivCompany));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_LessEqual(String delivCompany) {
        regDelivCompany(CK_LE, fRES(delivCompany));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompanyList The collection of delivCompany as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_InScope(Collection<String> delivCompanyList) {
        doSetDelivCompany_InScope(delivCompanyList);
    }

    protected void doSetDelivCompany_InScope(Collection<String> delivCompanyList) {
        regINS(CK_INS, cTL(delivCompanyList), xgetCValueDelivCompany(), "DELIV_COMPANY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompanyList The collection of delivCompany as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_NotInScope(Collection<String> delivCompanyList) {
        doSetDelivCompany_NotInScope(delivCompanyList);
    }

    protected void doSetDelivCompany_NotInScope(Collection<String> delivCompanyList) {
        regINS(CK_NINS, cTL(delivCompanyList), xgetCValueDelivCompany(), "DELIV_COMPANY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_COMPANY: {varchar(255)} <br>
     * <pre>e.g. setDelivCompany_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCompany The value of delivCompany as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCompany_LikeSearch(String delivCompany, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCompany), xgetCValueDelivCompany(), "DELIV_COMPANY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCompany_NotLikeSearch(String delivCompany, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCompany), xgetCValueDelivCompany(), "DELIV_COMPANY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     * @param delivCompany The value of delivCompany as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCompany_PrefixSearch(String delivCompany) {
        setDelivCompany_LikeSearch(delivCompany, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     */
    public void setDelivCompany_IsNull() { regDelivCompany(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     */
    public void setDelivCompany_IsNullOrEmpty() { regDelivCompany(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_COMPANY: {varchar(255)}
     */
    public void setDelivCompany_IsNotNull() { regDelivCompany(CK_ISNN, DOBJ); }

    protected void regDelivCompany(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCompany(), "DELIV_COMPANY"); }
    protected abstract ConditionValue xgetCValueDelivCompany();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHAMACE_FLG: {char(1)}
     * @param phamaceFlg The value of phamaceFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhamaceFlg_Equal(String phamaceFlg) {
        doSetPhamaceFlg_Equal(fRES(phamaceFlg));
    }

    protected void doSetPhamaceFlg_Equal(String phamaceFlg) {
        regPhamaceFlg(CK_EQ, phamaceFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHAMACE_FLG: {char(1)}
     * @param phamaceFlg The value of phamaceFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhamaceFlg_NotEqual(String phamaceFlg) {
        doSetPhamaceFlg_NotEqual(fRES(phamaceFlg));
    }

    protected void doSetPhamaceFlg_NotEqual(String phamaceFlg) {
        regPhamaceFlg(CK_NES, phamaceFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHAMACE_FLG: {char(1)}
     * @param phamaceFlg The value of phamaceFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhamaceFlg_GreaterThan(String phamaceFlg) {
        regPhamaceFlg(CK_GT, fRES(phamaceFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHAMACE_FLG: {char(1)}
     * @param phamaceFlg The value of phamaceFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhamaceFlg_LessThan(String phamaceFlg) {
        regPhamaceFlg(CK_LT, fRES(phamaceFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHAMACE_FLG: {char(1)}
     * @param phamaceFlg The value of phamaceFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhamaceFlg_GreaterEqual(String phamaceFlg) {
        regPhamaceFlg(CK_GE, fRES(phamaceFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHAMACE_FLG: {char(1)}
     * @param phamaceFlg The value of phamaceFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhamaceFlg_LessEqual(String phamaceFlg) {
        regPhamaceFlg(CK_LE, fRES(phamaceFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PHAMACE_FLG: {char(1)}
     * @param phamaceFlgList The collection of phamaceFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhamaceFlg_InScope(Collection<String> phamaceFlgList) {
        doSetPhamaceFlg_InScope(phamaceFlgList);
    }

    protected void doSetPhamaceFlg_InScope(Collection<String> phamaceFlgList) {
        regINS(CK_INS, cTL(phamaceFlgList), xgetCValuePhamaceFlg(), "PHAMACE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PHAMACE_FLG: {char(1)}
     * @param phamaceFlgList The collection of phamaceFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhamaceFlg_NotInScope(Collection<String> phamaceFlgList) {
        doSetPhamaceFlg_NotInScope(phamaceFlgList);
    }

    protected void doSetPhamaceFlg_NotInScope(Collection<String> phamaceFlgList) {
        regINS(CK_NINS, cTL(phamaceFlgList), xgetCValuePhamaceFlg(), "PHAMACE_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHAMACE_FLG: {char(1)} <br>
     * <pre>e.g. setPhamaceFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phamaceFlg The value of phamaceFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhamaceFlg_LikeSearch(String phamaceFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phamaceFlg), xgetCValuePhamaceFlg(), "PHAMACE_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHAMACE_FLG: {char(1)}
     * @param phamaceFlg The value of phamaceFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhamaceFlg_NotLikeSearch(String phamaceFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phamaceFlg), xgetCValuePhamaceFlg(), "PHAMACE_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHAMACE_FLG: {char(1)}
     * @param phamaceFlg The value of phamaceFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhamaceFlg_PrefixSearch(String phamaceFlg) {
        setPhamaceFlg_LikeSearch(phamaceFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PHAMACE_FLG: {char(1)}
     */
    public void setPhamaceFlg_IsNull() { regPhamaceFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PHAMACE_FLG: {char(1)}
     */
    public void setPhamaceFlg_IsNotNull() { regPhamaceFlg(CK_ISNN, DOBJ); }

    protected void regPhamaceFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhamaceFlg(), "PHAMACE_FLG"); }
    protected abstract ConditionValue xgetCValuePhamaceFlg();

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
    public HpSLCFunction<TRakutenOrderCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TRakutenOrderCB.class);
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
    public HpSLCFunction<TRakutenOrderCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TRakutenOrderCB.class);
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
    public HpSLCFunction<TRakutenOrderCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TRakutenOrderCB.class);
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
    public HpSLCFunction<TRakutenOrderCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TRakutenOrderCB.class);
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
    public HpSLCFunction<TRakutenOrderCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TRakutenOrderCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TRakutenOrderCB&gt;() {
     *     public void query(TRakutenOrderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TRakutenOrderCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TRakutenOrderCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TRakutenOrderCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TRakutenOrderCQ sq);

    protected TRakutenOrderCB xcreateScalarConditionCB() {
        TRakutenOrderCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TRakutenOrderCB xcreateScalarConditionPartitionByCB() {
        TRakutenOrderCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TRakutenOrderCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TRakutenOrderCB cb = new TRakutenOrderCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "RAKUTEN_ORDER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TRakutenOrderCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TRakutenOrderCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TRakutenOrderCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TRakutenOrderCB cb = new TRakutenOrderCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "RAKUTEN_ORDER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TRakutenOrderCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TRakutenOrderCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TRakutenOrderCB cb = new TRakutenOrderCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TRakutenOrderCQ sq);

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
    protected TRakutenOrderCB newMyCB() {
        return new TRakutenOrderCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TRakutenOrderCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

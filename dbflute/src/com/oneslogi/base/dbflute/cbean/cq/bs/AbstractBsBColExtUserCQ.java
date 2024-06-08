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
 * The abstract condition-query of B_COL_EXT_USER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBColExtUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBColExtUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_COL_EXT_USER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_EXT_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colExtUserId The value of colExtUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setColExtUserId_Equal(Long colExtUserId) {
        doSetColExtUserId_Equal(colExtUserId);
    }

    protected void doSetColExtUserId_Equal(Long colExtUserId) {
        regColExtUserId(CK_EQ, colExtUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_EXT_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colExtUserId The value of colExtUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColExtUserId_NotEqual(Long colExtUserId) {
        doSetColExtUserId_NotEqual(colExtUserId);
    }

    protected void doSetColExtUserId_NotEqual(Long colExtUserId) {
        regColExtUserId(CK_NES, colExtUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_EXT_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colExtUserId The value of colExtUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColExtUserId_GreaterThan(Long colExtUserId) {
        regColExtUserId(CK_GT, colExtUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_EXT_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colExtUserId The value of colExtUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColExtUserId_LessThan(Long colExtUserId) {
        regColExtUserId(CK_LT, colExtUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_EXT_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colExtUserId The value of colExtUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColExtUserId_GreaterEqual(Long colExtUserId) {
        regColExtUserId(CK_GE, colExtUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_EXT_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colExtUserId The value of colExtUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColExtUserId_LessEqual(Long colExtUserId) {
        regColExtUserId(CK_LE, colExtUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COL_EXT_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of colExtUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of colExtUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setColExtUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueColExtUserId(), "COL_EXT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COL_EXT_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colExtUserIdList The collection of colExtUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColExtUserId_InScope(Collection<Long> colExtUserIdList) {
        doSetColExtUserId_InScope(colExtUserIdList);
    }

    protected void doSetColExtUserId_InScope(Collection<Long> colExtUserIdList) {
        regINS(CK_INS, cTL(colExtUserIdList), xgetCValueColExtUserId(), "COL_EXT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COL_EXT_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param colExtUserIdList The collection of colExtUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColExtUserId_NotInScope(Collection<Long> colExtUserIdList) {
        doSetColExtUserId_NotInScope(colExtUserIdList);
    }

    protected void doSetColExtUserId_NotInScope(Collection<Long> colExtUserIdList) {
        regINS(CK_NINS, cTL(colExtUserIdList), xgetCValueColExtUserId(), "COL_EXT_USER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COL_EXT_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setColExtUserId_IsNull() { regColExtUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COL_EXT_USER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setColExtUserId_IsNotNull() { regColExtUserId(CK_ISNN, DOBJ); }

    protected void regColExtUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColExtUserId(), "COL_EXT_USER_ID"); }
    protected abstract ConditionValue xgetCValueColExtUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {UQ+, NotNull, bigint(19), FK to B_ITEM}
     * @param itemId The value of itemId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_Equal(Long itemId) {
        doSetItemId_Equal(itemId);
    }

    protected void doSetItemId_Equal(Long itemId) {
        regItemId(CK_EQ, itemId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {UQ+, NotNull, bigint(19), FK to B_ITEM}
     * @param itemId The value of itemId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_NotEqual(Long itemId) {
        doSetItemId_NotEqual(itemId);
    }

    protected void doSetItemId_NotEqual(Long itemId) {
        regItemId(CK_NES, itemId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {UQ+, NotNull, bigint(19), FK to B_ITEM}
     * @param itemId The value of itemId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_GreaterThan(Long itemId) {
        regItemId(CK_GT, itemId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {UQ+, NotNull, bigint(19), FK to B_ITEM}
     * @param itemId The value of itemId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_LessThan(Long itemId) {
        regItemId(CK_LT, itemId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {UQ+, NotNull, bigint(19), FK to B_ITEM}
     * @param itemId The value of itemId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_GreaterEqual(Long itemId) {
        regItemId(CK_GE, itemId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {UQ+, NotNull, bigint(19), FK to B_ITEM}
     * @param itemId The value of itemId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemId_LessEqual(Long itemId) {
        regItemId(CK_LE, itemId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ID: {UQ+, NotNull, bigint(19), FK to B_ITEM}
     * @param minNumber The min number of itemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of itemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setItemId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueItemId(), "ITEM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_ID: {UQ+, NotNull, bigint(19), FK to B_ITEM}
     * @param itemIdList The collection of itemId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemId_InScope(Collection<Long> itemIdList) {
        doSetItemId_InScope(itemIdList);
    }

    protected void doSetItemId_InScope(Collection<Long> itemIdList) {
        regINS(CK_INS, cTL(itemIdList), xgetCValueItemId(), "ITEM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_ID: {UQ+, NotNull, bigint(19), FK to B_ITEM}
     * @param itemIdList The collection of itemId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemId_NotInScope(Collection<Long> itemIdList) {
        doSetItemId_NotInScope(itemIdList);
    }

    protected void doSetItemId_NotInScope(Collection<Long> itemIdList) {
        regINS(CK_NINS, cTL(itemIdList), xgetCValueItemId(), "ITEM_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ITEM_ID from B_ITEM where ...)} <br />
     * B_ITEM by my ITEM_ID, named 'BItem'.
     * @param subCBLambda The callback for sub-query of BItem for 'in-scope'. (NotNull)
     */
    public void inScopeBItem(SubQuery<BItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BItemCB cb = new BItemCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepItemId_InScopeRelation_BItem(cb.query());
        registerInScopeRelation(cb.query(), "ITEM_ID", "ITEM_ID", pp, "bItem", false);
    }
    public abstract String keepItemId_InScopeRelation_BItem(BItemCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ITEM_ID from B_ITEM where ...)} <br />
     * B_ITEM by my ITEM_ID, named 'BItem'.
     * @param subCBLambda The callback for sub-query of BItem for 'not in-scope'. (NotNull)
     */
    public void notInScopeBItem(SubQuery<BItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BItemCB cb = new BItemCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepItemId_NotInScopeRelation_BItem(cb.query());
        registerInScopeRelation(cb.query(), "ITEM_ID", "ITEM_ID", pp, "bItem", true);
    }
    public abstract String keepItemId_NotInScopeRelation_BItem(BItemCQ sq);

    protected void regItemId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemId(), "ITEM_ID"); }
    protected abstract ConditionValue xgetCValueItemId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, NotNull, varchar(100)}
     * @param colCd The value of colCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_Equal(String colCd) {
        doSetColCd_Equal(fRES(colCd));
    }

    protected void doSetColCd_Equal(String colCd) {
        regColCd(CK_EQ, colCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, NotNull, varchar(100)}
     * @param colCd The value of colCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_NotEqual(String colCd) {
        doSetColCd_NotEqual(fRES(colCd));
    }

    protected void doSetColCd_NotEqual(String colCd) {
        regColCd(CK_NES, colCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, NotNull, varchar(100)}
     * @param colCd The value of colCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_GreaterThan(String colCd) {
        regColCd(CK_GT, fRES(colCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, NotNull, varchar(100)}
     * @param colCd The value of colCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_LessThan(String colCd) {
        regColCd(CK_LT, fRES(colCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, NotNull, varchar(100)}
     * @param colCd The value of colCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_GreaterEqual(String colCd) {
        regColCd(CK_GE, fRES(colCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_CD: {+UQ, NotNull, varchar(100)}
     * @param colCd The value of colCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_LessEqual(String colCd) {
        regColCd(CK_LE, fRES(colCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COL_CD: {+UQ, NotNull, varchar(100)}
     * @param colCdList The collection of colCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_InScope(Collection<String> colCdList) {
        doSetColCd_InScope(colCdList);
    }

    protected void doSetColCd_InScope(Collection<String> colCdList) {
        regINS(CK_INS, cTL(colCdList), xgetCValueColCd(), "COL_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COL_CD: {+UQ, NotNull, varchar(100)}
     * @param colCdList The collection of colCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_NotInScope(Collection<String> colCdList) {
        doSetColCd_NotInScope(colCdList);
    }

    protected void doSetColCd_NotInScope(Collection<String> colCdList) {
        regINS(CK_NINS, cTL(colCdList), xgetCValueColCd(), "COL_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COL_CD: {+UQ, NotNull, varchar(100)} <br>
     * <pre>e.g. setColCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param colCd The value of colCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setColCd_LikeSearch(String colCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(colCd), xgetCValueColCd(), "COL_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COL_CD: {+UQ, NotNull, varchar(100)}
     * @param colCd The value of colCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setColCd_NotLikeSearch(String colCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(colCd), xgetCValueColCd(), "COL_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COL_CD: {+UQ, NotNull, varchar(100)}
     * @param colCd The value of colCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColCd_PrefixSearch(String colCd) {
        setColCd_LikeSearch(colCd, xcLSOPPre());
    }

    protected void regColCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColCd(), "COL_CD"); }
    protected abstract ConditionValue xgetCValueColCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {+UQ, NotNull, bigint(19)}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Long userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Long userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {+UQ, NotNull, bigint(19)}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Long userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Long userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {+UQ, NotNull, bigint(19)}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Long userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {+UQ, NotNull, bigint(19)}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Long userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {+UQ, NotNull, bigint(19)}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Long userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {+UQ, NotNull, bigint(19)}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Long userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {+UQ, NotNull, bigint(19)}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {+UQ, NotNull, bigint(19)}
     * @param userIdList The collection of userId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_InScope(Collection<Long> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Long> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {+UQ, NotNull, bigint(19)}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Long> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Long> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrder The value of colOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setColOrder_Equal(Long colOrder) {
        doSetColOrder_Equal(colOrder);
    }

    protected void doSetColOrder_Equal(Long colOrder) {
        regColOrder(CK_EQ, colOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrder The value of colOrder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColOrder_NotEqual(Long colOrder) {
        doSetColOrder_NotEqual(colOrder);
    }

    protected void doSetColOrder_NotEqual(Long colOrder) {
        regColOrder(CK_NES, colOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrder The value of colOrder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColOrder_GreaterThan(Long colOrder) {
        regColOrder(CK_GT, colOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrder The value of colOrder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColOrder_LessThan(Long colOrder) {
        regColOrder(CK_LT, colOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrder The value of colOrder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColOrder_GreaterEqual(Long colOrder) {
        regColOrder(CK_GE, colOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrder The value of colOrder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColOrder_LessEqual(Long colOrder) {
        regColOrder(CK_LE, colOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param minNumber The min number of colOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of colOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setColOrder_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueColOrder(), "COL_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrderList The collection of colOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColOrder_InScope(Collection<Long> colOrderList) {
        doSetColOrder_InScope(colOrderList);
    }

    protected void doSetColOrder_InScope(Collection<Long> colOrderList) {
        regINS(CK_INS, cTL(colOrderList), xgetCValueColOrder(), "COL_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COL_ORDER: {bigint(19)}
     * @param colOrderList The collection of colOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColOrder_NotInScope(Collection<Long> colOrderList) {
        doSetColOrder_NotInScope(colOrderList);
    }

    protected void doSetColOrder_NotInScope(Collection<Long> colOrderList) {
        regINS(CK_NINS, cTL(colOrderList), xgetCValueColOrder(), "COL_ORDER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     */
    public void setColOrder_IsNull() { regColOrder(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COL_ORDER: {bigint(19)}
     */
    public void setColOrder_IsNotNull() { regColOrder(CK_ISNN, DOBJ); }

    protected void regColOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColOrder(), "COL_ORDER"); }
    protected abstract ConditionValue xgetCValueColOrder();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidth The value of colWidth as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setColWidth_Equal(Long colWidth) {
        doSetColWidth_Equal(colWidth);
    }

    protected void doSetColWidth_Equal(Long colWidth) {
        regColWidth(CK_EQ, colWidth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidth The value of colWidth as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColWidth_NotEqual(Long colWidth) {
        doSetColWidth_NotEqual(colWidth);
    }

    protected void doSetColWidth_NotEqual(Long colWidth) {
        regColWidth(CK_NES, colWidth);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidth The value of colWidth as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColWidth_GreaterThan(Long colWidth) {
        regColWidth(CK_GT, colWidth);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidth The value of colWidth as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColWidth_LessThan(Long colWidth) {
        regColWidth(CK_LT, colWidth);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidth The value of colWidth as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColWidth_GreaterEqual(Long colWidth) {
        regColWidth(CK_GE, colWidth);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidth The value of colWidth as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColWidth_LessEqual(Long colWidth) {
        regColWidth(CK_LE, colWidth);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param minNumber The min number of colWidth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of colWidth. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setColWidth_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueColWidth(), "COL_WIDTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidthList The collection of colWidth as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColWidth_InScope(Collection<Long> colWidthList) {
        doSetColWidth_InScope(colWidthList);
    }

    protected void doSetColWidth_InScope(Collection<Long> colWidthList) {
        regINS(CK_INS, cTL(colWidthList), xgetCValueColWidth(), "COL_WIDTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     * @param colWidthList The collection of colWidth as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColWidth_NotInScope(Collection<Long> colWidthList) {
        doSetColWidth_NotInScope(colWidthList);
    }

    protected void doSetColWidth_NotInScope(Collection<Long> colWidthList) {
        regINS(CK_NINS, cTL(colWidthList), xgetCValueColWidth(), "COL_WIDTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     */
    public void setColWidth_IsNull() { regColWidth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COL_WIDTH: {bigint(19)}
     */
    public void setColWidth_IsNotNull() { regColWidth(CK_ISNN, DOBJ); }

    protected void regColWidth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColWidth(), "COL_WIDTH"); }
    protected abstract ConditionValue xgetCValueColWidth();

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
    public HpSLCFunction<BColExtUserCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BColExtUserCB.class);
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
    public HpSLCFunction<BColExtUserCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BColExtUserCB.class);
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
    public HpSLCFunction<BColExtUserCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BColExtUserCB.class);
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
    public HpSLCFunction<BColExtUserCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BColExtUserCB.class);
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
    public HpSLCFunction<BColExtUserCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BColExtUserCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BColExtUserCB&gt;() {
     *     public void query(BColExtUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BColExtUserCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BColExtUserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BColExtUserCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BColExtUserCQ sq);

    protected BColExtUserCB xcreateScalarConditionCB() {
        BColExtUserCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BColExtUserCB xcreateScalarConditionPartitionByCB() {
        BColExtUserCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BColExtUserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColExtUserCB cb = new BColExtUserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "COL_EXT_USER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BColExtUserCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BColExtUserCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BColExtUserCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColExtUserCB cb = new BColExtUserCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COL_EXT_USER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BColExtUserCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BColExtUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColExtUserCB cb = new BColExtUserCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BColExtUserCQ sq);

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
    protected BColExtUserCB newMyCB() {
        return new BColExtUserCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BColExtUserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

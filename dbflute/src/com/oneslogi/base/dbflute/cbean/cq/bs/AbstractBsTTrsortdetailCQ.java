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
 * The abstract condition-query of T_TRSORTDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrsortdetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrsortdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSORTDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, NotNull, bigint(19)}
     * @param trsodetailId The value of trsodetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_Equal(Long trsodetailId) {
        doSetTrsodetailId_Equal(trsodetailId);
    }

    protected void doSetTrsodetailId_Equal(Long trsodetailId) {
        regTrsodetailId(CK_EQ, trsodetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, NotNull, bigint(19)}
     * @param trsodetailId The value of trsodetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_NotEqual(Long trsodetailId) {
        doSetTrsodetailId_NotEqual(trsodetailId);
    }

    protected void doSetTrsodetailId_NotEqual(Long trsodetailId) {
        regTrsodetailId(CK_NES, trsodetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, NotNull, bigint(19)}
     * @param trsodetailId The value of trsodetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_GreaterThan(Long trsodetailId) {
        regTrsodetailId(CK_GT, trsodetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, NotNull, bigint(19)}
     * @param trsodetailId The value of trsodetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_LessThan(Long trsodetailId) {
        regTrsodetailId(CK_LT, trsodetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, NotNull, bigint(19)}
     * @param trsodetailId The value of trsodetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_GreaterEqual(Long trsodetailId) {
        regTrsodetailId(CK_GE, trsodetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, NotNull, bigint(19)}
     * @param trsodetailId The value of trsodetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_LessEqual(Long trsodetailId) {
        regTrsodetailId(CK_LE, trsodetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, NotNull, bigint(19)}
     * @param minNumber The min number of trsodetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsodetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsodetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsodetailId(), "TRSODETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSODETAIL_ID: {PK, NotNull, bigint(19)}
     * @param trsodetailIdList The collection of trsodetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsodetailId_InScope(Collection<Long> trsodetailIdList) {
        doSetTrsodetailId_InScope(trsodetailIdList);
    }

    protected void doSetTrsodetailId_InScope(Collection<Long> trsodetailIdList) {
        regINS(CK_INS, cTL(trsodetailIdList), xgetCValueTrsodetailId(), "TRSODETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSODETAIL_ID: {PK, NotNull, bigint(19)}
     * @param trsodetailIdList The collection of trsodetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsodetailId_NotInScope(Collection<Long> trsodetailIdList) {
        doSetTrsodetailId_NotInScope(trsodetailIdList);
    }

    protected void doSetTrsodetailId_NotInScope(Collection<Long> trsodetailIdList) {
        regINS(CK_NINS, cTL(trsodetailIdList), xgetCValueTrsodetailId(), "TRSODETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, NotNull, bigint(19)}
     */
    public void setTrsodetailId_IsNull() { regTrsodetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {PK, NotNull, bigint(19)}
     */
    public void setTrsodetailId_IsNotNull() { regTrsodetailId(CK_ISNN, DOBJ); }

    protected void regTrsodetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsodetailId(), "TRSODETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTrsodetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_Equal(Long pickingInstDetailId) {
        doSetPickingInstDetailId_Equal(pickingInstDetailId);
    }

    protected void doSetPickingInstDetailId_Equal(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_EQ, pickingInstDetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_NotEqual(Long pickingInstDetailId) {
        doSetPickingInstDetailId_NotEqual(pickingInstDetailId);
    }

    protected void doSetPickingInstDetailId_NotEqual(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_NES, pickingInstDetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_GreaterThan(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_GT, pickingInstDetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_LessThan(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_LT, pickingInstDetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_GreaterEqual(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_GE, pickingInstDetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailId The value of pickingInstDetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_LessEqual(Long pickingInstDetailId) {
        regPickingInstDetailId(CK_LE, pickingInstDetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of pickingInstDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingInstDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingInstDetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailIdList The collection of pickingInstDetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_InScope(Collection<Long> pickingInstDetailIdList) {
        doSetPickingInstDetailId_InScope(pickingInstDetailIdList);
    }

    protected void doSetPickingInstDetailId_InScope(Collection<Long> pickingInstDetailIdList) {
        regINS(CK_INS, cTL(pickingInstDetailIdList), xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstDetailIdList The collection of pickingInstDetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingInstDetailId_NotInScope(Collection<Long> pickingInstDetailIdList) {
        doSetPickingInstDetailId_NotInScope(pickingInstDetailIdList);
    }

    protected void doSetPickingInstDetailId_NotInScope(Collection<Long> pickingInstDetailIdList) {
        regINS(CK_NINS, cTL(pickingInstDetailIdList), xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPickingInstDetailId_IsNull() { regPickingInstDetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPickingInstDetailId_IsNotNull() { regPickingInstDetailId(CK_ISNN, DOBJ); }

    protected void regPickingInstDetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingInstDetailId(), "PICKING_INST_DETAIL_ID"); }
    protected abstract ConditionValue xgetCValuePickingInstDetailId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {PK, IX, NotNull, varchar(30)}
     * @param tagcd The value of tagcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_Equal(String tagcd) {
        doSetTagcd_Equal(fRES(tagcd));
    }

    protected void doSetTagcd_Equal(String tagcd) {
        regTagcd(CK_EQ, tagcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {PK, IX, NotNull, varchar(30)}
     * @param tagcd The value of tagcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_NotEqual(String tagcd) {
        doSetTagcd_NotEqual(fRES(tagcd));
    }

    protected void doSetTagcd_NotEqual(String tagcd) {
        regTagcd(CK_NES, tagcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {PK, IX, NotNull, varchar(30)}
     * @param tagcd The value of tagcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_GreaterThan(String tagcd) {
        regTagcd(CK_GT, fRES(tagcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {PK, IX, NotNull, varchar(30)}
     * @param tagcd The value of tagcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_LessThan(String tagcd) {
        regTagcd(CK_LT, fRES(tagcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {PK, IX, NotNull, varchar(30)}
     * @param tagcd The value of tagcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_GreaterEqual(String tagcd) {
        regTagcd(CK_GE, fRES(tagcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAGCD: {PK, IX, NotNull, varchar(30)}
     * @param tagcd The value of tagcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_LessEqual(String tagcd) {
        regTagcd(CK_LE, fRES(tagcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAGCD: {PK, IX, NotNull, varchar(30)}
     * @param tagcdList The collection of tagcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_InScope(Collection<String> tagcdList) {
        doSetTagcd_InScope(tagcdList);
    }

    protected void doSetTagcd_InScope(Collection<String> tagcdList) {
        regINS(CK_INS, cTL(tagcdList), xgetCValueTagcd(), "TAGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAGCD: {PK, IX, NotNull, varchar(30)}
     * @param tagcdList The collection of tagcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_NotInScope(Collection<String> tagcdList) {
        doSetTagcd_NotInScope(tagcdList);
    }

    protected void doSetTagcd_NotInScope(Collection<String> tagcdList) {
        regINS(CK_NINS, cTL(tagcdList), xgetCValueTagcd(), "TAGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {PK, IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setTagcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tagcd The value of tagcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTagcd_LikeSearch(String tagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagcd), xgetCValueTagcd(), "TAGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {PK, IX, NotNull, varchar(30)}
     * @param tagcd The value of tagcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTagcd_NotLikeSearch(String tagcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagcd), xgetCValueTagcd(), "TAGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAGCD: {PK, IX, NotNull, varchar(30)}
     * @param tagcd The value of tagcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagcd_PrefixSearch(String tagcd) {
        setTagcd_LikeSearch(tagcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAGCD: {PK, IX, NotNull, varchar(30)}
     */
    public void setTagcd_IsNull() { regTagcd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAGCD: {PK, IX, NotNull, varchar(30)}
     */
    public void setTagcd_IsNotNull() { regTagcd(CK_ISNN, DOBJ); }

    protected void regTagcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagcd(), "TAGCD"); }
    protected abstract ConditionValue xgetCValueTagcd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1 The value of sortedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_Equal(Long sortedqty1) {
        doSetSortedqty1_Equal(sortedqty1);
    }

    protected void doSetSortedqty1_Equal(Long sortedqty1) {
        regSortedqty1(CK_EQ, sortedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1 The value of sortedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_NotEqual(Long sortedqty1) {
        doSetSortedqty1_NotEqual(sortedqty1);
    }

    protected void doSetSortedqty1_NotEqual(Long sortedqty1) {
        regSortedqty1(CK_NES, sortedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1 The value of sortedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_GreaterThan(Long sortedqty1) {
        regSortedqty1(CK_GT, sortedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1 The value of sortedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_LessThan(Long sortedqty1) {
        regSortedqty1(CK_LT, sortedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1 The value of sortedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_GreaterEqual(Long sortedqty1) {
        regSortedqty1(CK_GE, sortedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1 The value of sortedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_LessEqual(Long sortedqty1) {
        regSortedqty1(CK_LE, sortedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of sortedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortedqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortedqty1(), "SORTEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1List The collection of sortedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedqty1_InScope(Collection<Long> sortedqty1List) {
        doSetSortedqty1_InScope(sortedqty1List);
    }

    protected void doSetSortedqty1_InScope(Collection<Long> sortedqty1List) {
        regINS(CK_INS, cTL(sortedqty1List), xgetCValueSortedqty1(), "SORTEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @param sortedqty1List The collection of sortedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedqty1_NotInScope(Collection<Long> sortedqty1List) {
        doSetSortedqty1_NotInScope(sortedqty1List);
    }

    protected void doSetSortedqty1_NotInScope(Collection<Long> sortedqty1List) {
        regINS(CK_NINS, cTL(sortedqty1List), xgetCValueSortedqty1(), "SORTEDQTY1");
    }

    protected void regSortedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortedqty1(), "SORTEDQTY1"); }
    protected abstract ConditionValue xgetCValueSortedqty1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTUSERCD: {varchar(30)}
     * @param sortusercd The value of sortusercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortusercd_Equal(String sortusercd) {
        doSetSortusercd_Equal(fRES(sortusercd));
    }

    protected void doSetSortusercd_Equal(String sortusercd) {
        regSortusercd(CK_EQ, sortusercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTUSERCD: {varchar(30)}
     * @param sortusercd The value of sortusercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortusercd_NotEqual(String sortusercd) {
        doSetSortusercd_NotEqual(fRES(sortusercd));
    }

    protected void doSetSortusercd_NotEqual(String sortusercd) {
        regSortusercd(CK_NES, sortusercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTUSERCD: {varchar(30)}
     * @param sortusercd The value of sortusercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortusercd_GreaterThan(String sortusercd) {
        regSortusercd(CK_GT, fRES(sortusercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTUSERCD: {varchar(30)}
     * @param sortusercd The value of sortusercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortusercd_LessThan(String sortusercd) {
        regSortusercd(CK_LT, fRES(sortusercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTUSERCD: {varchar(30)}
     * @param sortusercd The value of sortusercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortusercd_GreaterEqual(String sortusercd) {
        regSortusercd(CK_GE, fRES(sortusercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORTUSERCD: {varchar(30)}
     * @param sortusercd The value of sortusercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortusercd_LessEqual(String sortusercd) {
        regSortusercd(CK_LE, fRES(sortusercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTUSERCD: {varchar(30)}
     * @param sortusercdList The collection of sortusercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortusercd_InScope(Collection<String> sortusercdList) {
        doSetSortusercd_InScope(sortusercdList);
    }

    protected void doSetSortusercd_InScope(Collection<String> sortusercdList) {
        regINS(CK_INS, cTL(sortusercdList), xgetCValueSortusercd(), "SORTUSERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORTUSERCD: {varchar(30)}
     * @param sortusercdList The collection of sortusercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortusercd_NotInScope(Collection<String> sortusercdList) {
        doSetSortusercd_NotInScope(sortusercdList);
    }

    protected void doSetSortusercd_NotInScope(Collection<String> sortusercdList) {
        regINS(CK_NINS, cTL(sortusercdList), xgetCValueSortusercd(), "SORTUSERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTUSERCD: {varchar(30)} <br>
     * <pre>e.g. setSortusercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortusercd The value of sortusercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortusercd_LikeSearch(String sortusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortusercd), xgetCValueSortusercd(), "SORTUSERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTUSERCD: {varchar(30)}
     * @param sortusercd The value of sortusercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortusercd_NotLikeSearch(String sortusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortusercd), xgetCValueSortusercd(), "SORTUSERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORTUSERCD: {varchar(30)}
     * @param sortusercd The value of sortusercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortusercd_PrefixSearch(String sortusercd) {
        setSortusercd_LikeSearch(sortusercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORTUSERCD: {varchar(30)}
     */
    public void setSortusercd_IsNull() { regSortusercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SORTUSERCD: {varchar(30)}
     */
    public void setSortusercd_IsNullOrEmpty() { regSortusercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORTUSERCD: {varchar(30)}
     */
    public void setSortusercd_IsNotNull() { regSortusercd(CK_ISNN, DOBJ); }

    protected void regSortusercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortusercd(), "SORTUSERCD"); }
    protected abstract ConditionValue xgetCValueSortusercd();

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
    public HpSLCFunction<TTrsortdetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrsortdetailCB.class);
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
    public HpSLCFunction<TTrsortdetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrsortdetailCB.class);
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
    public HpSLCFunction<TTrsortdetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrsortdetailCB.class);
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
    public HpSLCFunction<TTrsortdetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrsortdetailCB.class);
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
    public HpSLCFunction<TTrsortdetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrsortdetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrsortdetailCB&gt;() {
     *     public void query(TTrsortdetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrsortdetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrsortdetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsortdetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrsortdetailCQ sq);

    protected TTrsortdetailCB xcreateScalarConditionCB() {
        TTrsortdetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrsortdetailCB xcreateScalarConditionPartitionByCB() {
        TTrsortdetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected TTrsortdetailCB newMyCB() {
        return new TTrsortdetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrsortdetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
